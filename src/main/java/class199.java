import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class199 {

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Z")
    public boolean field2586 = false;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    private int field2590 = 0;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    private int field2594 = 0;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public int field2588 = -1;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field2593 = -1;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public int field2589 = 0;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field2609 = 0;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public int field2599 = 2000;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    private int field2617 = 0;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    private int field2581 = -1;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public int field2621 = 0;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field2602 = 0;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field2591 = -1;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field2585 = 0;

    @OriginalMember(owner = "client!nb", name = "cb", descriptor = "I")
    public int field2632 = -1;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public int field2611 = 0;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    private int field2612 = 0;

    @OriginalMember(owner = "client!nb", name = "bb", descriptor = "I")
    private int field2631 = -1;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    private int field2618 = 128;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public int field2606 = 0;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    private int field2603 = -1;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    private int field2608 = 0;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public int field2610 = -1;

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "I")
    private int field2630 = -1;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    private int field2616 = -1;

    @OriginalMember(owner = "client!nb", name = "lb", descriptor = "I")
    public int field2641 = -1;

    @OriginalMember(owner = "client!nb", name = "fb", descriptor = "I")
    private int field2635 = -1;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Ljava/lang/String;")
    public String field2623 = "null";

    @OriginalMember(owner = "client!nb", name = "qb", descriptor = "I")
    private int field2646 = -1;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field2587 = -1;

    @OriginalMember(owner = "client!nb", name = "ib", descriptor = "I")
    public int field2638 = 0;

    @OriginalMember(owner = "client!nb", name = "U", descriptor = "I")
    private int field2624 = -1;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    private int field2592 = 128;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    private int field2622 = 0;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field2595 = -1;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public int field2620 = -1;

    @OriginalMember(owner = "client!nb", name = "vb", descriptor = "I")
    private int field2651 = -1;

    @OriginalMember(owner = "client!nb", name = "wb", descriptor = "I")
    private int field2652 = 0;

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "I")
    private int field2628 = -1;

    @OriginalMember(owner = "client!nb", name = "Cb", descriptor = "I")
    private int field2658 = 128;

    @OriginalMember(owner = "client!nb", name = "tb", descriptor = "I")
    public int field2649 = -1;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public int field2601 = -1;

    @OriginalMember(owner = "client!nb", name = "db", descriptor = "I")
    private int field2633 = 0;

    @OriginalMember(owner = "client!nb", name = "mb", descriptor = "I")
    public int field2642 = 1;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "Z")
    public boolean field2598 = false;

    @OriginalMember(owner = "client!nb", name = "Db", descriptor = "I")
    public int field2659 = -1;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public static int field2597 = 0;

    @OriginalMember(owner = "client!nb", name = "ub", descriptor = "F")
    public static float field2650;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field2584;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2615;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!nb", name = "eb", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!nb", name = "hb", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!nb", name = "nb", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!nb", name = "pb", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!nb", name = "rb", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!nb", name = "yb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!nb", name = "Bb", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!nb", name = "Eb", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!nb", name = "Fb", descriptor = "Lmk;")
    public class40 field2661;

    @OriginalMember(owner = "client!nb", name = "jb", descriptor = "Lqh;")
    public class50 field2639;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[B")
    private byte[] field2604;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
    public int[] field2626;

    @OriginalMember(owner = "client!nb", name = "gb", descriptor = "[I")
    public int[] field2636;

    @OriginalMember(owner = "client!nb", name = "kb", descriptor = "[I")
    public int[] field2640;

    @OriginalMember(owner = "client!nb", name = "xb", descriptor = "[Ljava/lang/String;")
    public String[] field2653;

    @OriginalMember(owner = "client!nb", name = "zb", descriptor = "[Ljava/lang/String;")
    public String[] field2655;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "[S")
    private short[] field2625;

    @OriginalMember(owner = "client!nb", name = "ob", descriptor = "[S")
    private short[] field2644;

    @OriginalMember(owner = "client!nb", name = "sb", descriptor = "[S")
    private short[] field2648;

    @OriginalMember(owner = "client!nb", name = "Ab", descriptor = "[S")
    private short[] field2656;

    static {
        new class305("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field2650 = 1024.0F;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 3)
    public final void method1267(byte arg0) {
        field2605++;
        if (arg0 != -12) {
            method1274(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZ)Z", line = 13)
    public final boolean method1268(int arg0, boolean arg1) {
        field2645++;
        int var3 = this.field2631;
        int var4 = this.field2603;
        if (arg0 != 30591) {
            this.method1283(null, -38, (byte) 106);
        }
        int var5 = this.field2635;
        if (arg1) {
            var3 = this.field2624;
            var4 = this.field2651;
            var5 = this.field2581;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!this.field2661.field437.method2142(var3, 0, (byte) 95)) {
            var6 = false;
        }
        if (var4 != -1 && !this.field2661.field437.method2142(var4, 0, (byte) 122)) {
            var6 = false;
        }
        if (var5 != -1 && !this.field2661.field437.method2142(var5, 0, (byte) 121)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lnb;BLnb;)V", line = 64)
    public final void method1269(class199 arg0, byte arg1, class199 arg2) {
        this.field2585 = arg2.field2585;
        this.field2598 = arg0.field2598;
        this.field2599 = arg2.field2599;
        this.field2642 = arg0.field2642;
        this.field2648 = arg2.field2648;
        this.field2584 = arg2.field2584;
        if (arg1 != -50) {
            this.method1272(null, -111);
        }
        this.field2604 = arg2.field2604;
        this.field2638 = arg2.field2638;
        this.field2623 = arg0.field2623;
        field2629++;
        this.field2656 = arg2.field2656;
        this.field2621 = arg2.field2621;
        this.field2589 = arg2.field2589;
        this.field2625 = arg2.field2625;
        this.field2609 = arg2.field2609;
        this.field2644 = arg2.field2644;
        this.field2606 = 1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII[II[IIIIIIILas;I)I", line = 106)
    public static final int method1270(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class106 arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class360.field4889[var15][var35] = 0;
                class71.field913[var15][var35] = 99999999;
            }
        }
        if (arg8 > -110) {
            method1275(-110);
        }
        field2643++;
        boolean var16;
        if (arg11 == 1) {
            var16 = class297.method1779(arg9, arg12, arg7, false, arg13, arg10, arg2, arg3, arg5, arg14, arg0);
        } else if (arg11 == 2) {
            var16 = class21.method119(arg10, arg12, arg9, arg3, arg5, arg2, arg14, arg7, arg13, -1, arg0);
        } else {
            var16 = class349.method2055(arg14, arg5, arg11, (byte) -63, arg10, arg0, arg12, arg13, arg7, arg9, arg2, arg3);
        }
        int var17 = arg2 - 64;
        int var18 = arg7 - 64;
        int var19 = class79.field966;
        int var20 = class407.field5849;
        if (!var16) {
            if (!arg1) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= (arg5 + var23); var24++) {
                for (int var25 = arg0 - var23; var25 <= arg0 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class71.field913[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg5) {
                            var28 = arg5 - var24;
                        } else if (arg14 + arg5 - 1 < var24) {
                            var28 = 1 - (arg5 + arg14 - var24);
                        }
                        int var29 = 0;
                        if (arg0 > var25) {
                            var29 = arg0 - var25;
                        } else if (var25 > (arg0 + arg9 - 1)) {
                            var29 = var25 - (arg0 + arg9 - 1);
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var30 < var21 || var21 == var30 && class71.field913[var26][var27] < var22) {
                            var19 = var24;
                            var21 = var30;
                            var20 = var25;
                            var22 = class71.field913[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg2 == var19 && arg7 == var20) {
            return 0;
        }
        byte var31 = 0;
        class476.field7051[var31] = var19;
        int var37 = var31 + 1;
        class490.field7182[var31] = var20;
        int var32;
        int var33 = var32 = class360.field4889[var19 - var17][var20 - var18];
        while (arg2 != var19 || arg7 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class476.field7051[var37] = var19;
                class490.field7182[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class360.field4889[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg4[var34] = class476.field7051[var37];
            arg6[var34++] = class490.field7182[var37];
            if (arg4.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B[II)V", line = 290)
    private final void method1271(byte arg0, int[] arg1, int arg2) {
        if (arg0 < 106) {
            return;
        }
        for (int var4 = 31; var4 > 0; var4--) {
            int var5 = var4 * 36;
            for (int var6 = 35; var6 > 0; var6--) {
                if (arg1[var5 + var6] == 0 && arg1[var5 + var6 - 36 - 1] != 0) {
                    arg1[var5 + var6] = arg2;
                }
            }
        }
        field2613++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lug;I)V", line = 333)
    public final void method1272(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -123);
            if (var3 == 0) {
                field2660++;
                if (arg1 != 0) {
                    this.field2641 = 4;
                    return;
                }
                return;
            }
            this.method1287(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)Z", line = 364)
    public final boolean method1273(boolean arg0, int arg1) {
        field2580++;
        int var3 = this.field2628;
        if (arg1 != 25586) {
            return false;
        }
        int var4 = this.field2630;
        if (arg0) {
            var4 = this.field2646;
            var3 = this.field2616;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!this.field2661.field437.method2142(var3, 0, (byte) 94)) {
            var5 = false;
        }
        if (var4 != -1 && !this.field2661.field437.method2142(var4, 0, (byte) 34)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 405)
    public static final void method1274(boolean arg0) {
        field2596++;
        int[] var1 = new int[class237.field3158.field416];
        int var2 = 0;
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < class237.field3158.field416; var3++) {
            class199 var5 = class237.field3158.method236(-18315, var3);
            if (var5.field2631 >= 0 || var5.field2624 >= 0) {
                var1[var2++] = var3;
            }
        }
        class280.field3711 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class280.field3711[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 444)
    public static final void method1275(int arg0) {
        field2647++;
        if (class114.field1497 == 0) {
            return;
        }
        try {
            if (++class225.field3030 > 2000) {
                if (class446.field6499 != null) {
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                }
                if (class329.field4373 >= 1) {
                    class173.field2226 = -5;
                    class114.field1497 = 0;
                    return;
                }
                class211.field2823.field3561 = !class211.field2823.field3561;
                class114.field1497 = 1;
                class225.field3030 = 0;
                class329.field4373++;
            }
            if (class114.field1497 == 1) {
                class142.field1879 = class381.field5518.method829(class211.field2823.method1628(-3), class211.field2823.field3564, -12048);
                class114.field1497 = 2;
            }
            if (class114.field1497 == 2) {
                if (class142.field1879.field3149 == 2) {
                    throw new IOException();
                }
                if (class142.field1879.field3149 != 1) {
                    return;
                }
                class446.field6499 = new class426((Socket) class142.field1879.field3151, class381.field5518);
                class142.field1879 = null;
                class446.field6499.method2620(true, class106.field1443.field5761, 0, class106.field1443.field5729);
                class116.method699(3);
                int var1 = class446.field6499.method2626((byte) 121);
                class116.method699(3);
                if (var1 != 21) {
                    class114.field1497 = 0;
                    class173.field2226 = var1;
                    class446.field6499.method2625(true);
                    class446.field6499 = null;
                    return;
                }
                class114.field1497 = 3;
            }
            if (class114.field1497 == 3) {
                if (class446.field6499.method2624(121) < 1) {
                    return;
                }
                class70.field828 = new String[class446.field6499.method2626((byte) -86)];
                class114.field1497 = 4;
            }
            if (class114.field1497 != 4) {
                int var3 = -75 % ((-arg0 - 45) / 56);
            } else if (class446.field6499.method2624(113) >= (class70.field828.length * 8)) {
                class334.field4414.field5729 = 0;
                class446.field6499.method2621(false, 0, class70.field828.length * 8, class334.field4414.field5761);
                for (int var2 = 0; var2 < class70.field828.length; var2++) {
                    class70.field828[var2] = class90.method498(class334.field4414.method2391((byte) -125), 64);
                }
                class114.field1497 = 0;
                class173.field2226 = 21;
                class446.field6499.method2625(true);
                class446.field6499 = null;
            }
        } catch (IOException var4) {
            if (class446.field6499 != null) {
                class446.field6499.method2625(true);
                class446.field6499 = null;
            }
            if (class329.field4373 >= 1) {
                class114.field1497 = 0;
                class173.field2226 = -4;
            } else {
                class114.field1497 = 1;
                class225.field3030 = 0;
                class211.field2823.field3561 = !class211.field2823.field3561;
                class329.field4373++;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IZ)Lpq;", line = 579)
    public final class131 method1276(int arg0, boolean arg1) {
        field2607++;
        int var3 = this.field2628;
        int var4 = this.field2630;
        if (arg1) {
            var3 = this.field2616;
            var4 = this.field2646;
        }
        if (var3 == -1) {
            return null;
        }
        class131 var5 = class490.method2960(0, var3, this.field2661.field437, 3);
        if (var5.field1693 < 13) {
            var5.method787(arg0, 0);
        }
        if (~var4 != arg0) {
            class131 var6 = class490.method2960(0, var4, this.field2661.field437, 1);
            if (var6.field1693 < 13) {
                var6.method787(arg0, 0);
            }
            class131[] var7 = new class131[] { var5, var6 };
            var5 = new class131(var7, 2);
        }
        if (this.field2648 != null) {
            for (int var8 = 0; var8 < this.field2648.length; var8++) {
                var5.method799(-113, this.field2625[var8], this.field2648[var8]);
            }
        }
        if (this.field2656 != null) {
            for (int var9 = 0; var9 < this.field2656.length; var9++) {
                var5.method789(false, this.field2644[var9], this.field2656[var9]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIILoj;IILza;Loe;)Le;", line = 660)
    public final class373 method1277(int arg0, int arg1, int arg2, int arg3, class260 arg4, int arg5, int arg6, class287 arg7, class136 arg8) {
        field2619++;
        if (this.field2640 != null && arg0 > 1) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg0 >= this.field2626[var11] && this.field2626[var11] != 0) {
                    var10 = this.field2640[var11];
                }
            }
            if (var10 != -1) {
                return this.field2661.method236(-18315, var10).method1277(1, arg1, arg2, -129, arg4, arg5, arg6, arg7, arg8);
            }
        }
        if (arg3 != -129) {
            return null;
        }
        int var12 = arg1;
        if (arg4 != null) {
            var12 = arg1 | arg4.method1604(arg5, true, arg2, (byte) 126);
        }
        class509 var13 = this.field2661.field438;
        class373 var14;
        synchronized (this.field2661.field438) {
            var14 = (class373) this.field2661.field438.method3032(3589, (long) (arg7.field3766 << 29 | this.field2582));
        }
        if (var14 == null || arg7.method1191(var14.method2025(), var12) != 0) {
            if (var14 != null) {
                var12 = arg7.method1211(var12, var14.method2025());
            }
            int var15 = var12;
            if (this.field2656 != null) {
                var15 = var12 | 0x8000;
            }
            if (this.field2648 != null || arg8 != null) {
                var15 |= 0x4000;
            }
            if (this.field2618 != 128) {
                var15 |= 0x1;
            }
            if (this.field2618 != 128) {
                var15 |= 0x2;
            }
            if (this.field2618 != 128) {
                var15 |= 0x4;
            }
            class131 var16 = class490.method2960(0, this.field2584, this.field2661.field437, 112);
            if (var16 == null) {
                return null;
            }
            if (var16.field1693 < 13) {
                var16.method787(0, 0);
            }
            var14 = arg7.method1213(var16, var15, this.field2661.field444, this.field2622 + 64, this.field2612 + 850);
            if (this.field2618 != 128 || this.field2592 != 128 || this.field2658 != 128) {
                var14.method2035(this.field2618, this.field2592, this.field2658);
            }
            if (this.field2648 != null) {
                for (int var17 = 0; var17 < this.field2648.length; var17++) {
                    if (this.field2604 == null || var17 >= this.field2604.length) {
                        var14.method2032(this.field2648[var17], this.field2625[var17]);
                    } else {
                        var14.method2032(this.field2648[var17], class401.field5815[this.field2604[var17] & 0xFF]);
                    }
                }
            }
            if (this.field2656 != null) {
                for (int var18 = 0; var18 < this.field2656.length; var18++) {
                    var14.method2018(this.field2656[var18], this.field2644[var18]);
                }
            }
            if (arg8 != null) {
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class115.field1509[var19].length > arg8.field1809[var19]) {
                        var14.method2032(class109.field1463[var19], class115.field1509[var19][arg8.field1809[var19]]);
                    }
                    if (arg8.field1809[var19] < class29.field280[var19].length) {
                        var14.method2032(class495.field7232[var19], class29.field280[var19][arg8.field1809[var19]]);
                    }
                }
            }
            var14.method2034(var12);
            class509 var20 = this.field2661.field438;
            synchronized (this.field2661.field438) {
                this.field2661.field438.method3046((long) (this.field2582 | arg7.field3766 << 29), var14, 1);
            }
        }
        if (arg4 != null) {
            var14 = arg4.method1599(var14, var12, arg2, (byte) -54, arg5, arg6);
        }
        var14.method2034(arg1);
        return var14;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;", line = 831)
    public final String method1278(String arg0, boolean arg1, int arg2) {
        field2578++;
        if (this.field2639 == null) {
            return arg0;
        }
        if (arg1) {
            this.method1277(35, -25, -6, -85, null, 78, 107, null, null);
        }
        class53 var4 = (class53) this.field2639.method295((long) arg2, -91);
        return var4 == null ? arg0 : var4.field618;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V", line = 872)
    public static final void method1279(int arg0, int arg1, int arg2) {
        field2637++;
        if (arg0 != -1) {
            method1279(-72, -67, 101);
        }
        if (class381.field5520 == class373.field5065) {
            if (!class139.method861(false, -2, 1, arg1, 0, 1, -103, 0, arg2)) {
                class139.method861(false, -3, 1, arg1, 0, 1, arg0 ^ 0x73, 0, arg2);
            }
        } else if (!class139.method861(false, -3, 1, arg1, 0, 1, arg0 - 101, 0, arg2)) {
            class139.method861(false, -2, 1, arg1, 0, 1, -106, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 928)
    private final String method1280(byte arg0, int arg1) {
        if (arg0 > -47) {
            return null;
        }
        field2583++;
        if (arg1 < 100000) {
            return "<col=ffff00>" + arg1 + "</col>";
        } else if (arg1 < 10000000) {
            return "<col=ffffff>" + arg1 / 1000 + class292.field3856.method1823(this.field2661.field424, (byte) -88) + "</col>";
        } else {
            return "<col=00ff80>" + arg1 / 1000000 + class429.field6235.method1823(this.field2661.field424, (byte) -88) + "</col>";
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lnb;BLnb;)V", line = 949)
    public final void method1281(class199 arg0, byte arg1, class199 arg2) {
        this.field2635 = arg2.field2635;
        this.field2611 = arg2.field2611;
        this.field2633 = arg2.field2633;
        if (arg1 != -56) {
            return;
        }
        this.field2617 = arg2.field2617;
        this.field2642 = 0;
        this.field2598 = arg2.field2598;
        this.field2609 = arg0.field2609;
        this.field2624 = arg2.field2624;
        this.field2623 = arg2.field2623;
        this.field2631 = arg2.field2631;
        this.field2584 = arg0.field2584;
        this.field2639 = arg2.field2639;
        this.field2608 = arg2.field2608;
        this.field2648 = arg2.field2648;
        this.field2604 = arg2.field2604;
        this.field2638 = arg0.field2638;
        this.field2603 = arg2.field2603;
        this.field2594 = arg2.field2594;
        this.field2590 = arg2.field2590;
        this.field2646 = arg2.field2646;
        this.field2581 = arg2.field2581;
        this.field2625 = arg2.field2625;
        field2615++;
        this.field2644 = arg2.field2644;
        this.field2655 = arg2.field2655;
        this.field2628 = arg2.field2628;
        this.field2653 = new String[5];
        this.field2589 = arg0.field2589;
        this.field2616 = arg2.field2616;
        this.field2651 = arg2.field2651;
        this.field2652 = arg2.field2652;
        this.field2621 = arg0.field2621;
        this.field2585 = arg0.field2585;
        this.field2656 = arg2.field2656;
        this.field2630 = arg2.field2630;
        this.field2599 = arg0.field2599;
        if (arg2.field2653 != null) {
            for (int var4 = 0; var4 < 4; var4++) {
                this.field2653[var4] = arg2.field2653[var4];
            }
        }
        this.field2653[4] = class85.field1019.method1823(this.field2661.field424, (byte) -88);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Lnb;", line = 1010)
    public final class199 method1282(int arg0, int arg1) {
        field2657++;
        if (this.field2640 != null && arg0 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (arg0 >= this.field2626[var4] && this.field2626[var4] != 0) {
                    var3 = this.field2640[var4];
                }
            }
            if (var3 != -1) {
                return this.field2661.method236(-18315, var3);
            }
        }
        int var5 = 89 % ((arg1 + 38) / 63);
        return this;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIB)[I", line = 1053)
    private final int[] method1283(int[] arg0, int arg1, byte arg2) {
        field2634++;
        int[] var4 = new int[1152];
        int var5 = 0;
        if (arg2 != 110) {
            this.method1283(null, -81, (byte) -21);
        }
        for (int var6 = 0; var6 < 32; var6++) {
            for (int var7 = 0; var7 < 36; var7++) {
                int var8 = arg0[var5];
                if (var8 == 0) {
                    if (var7 > 0 && arg0[var5 - 1] != 0) {
                        var8 = arg1;
                    } else if (var6 > 0 && arg0[var5 - 36] != 0) {
                        var8 = arg1;
                    } else if (var7 < 35 && arg0[var5 + 1] != 0) {
                        var8 = arg1;
                    } else if (var6 < 31 && arg0[var5 + 36] != 0) {
                        var8 = arg1;
                    }
                }
                var4[var5++] = var8;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIILza;Lza;Loe;IZLla;I)[I", line = 1127)
    public final int[] method1284(int arg0, int arg1, int arg2, class287 arg3, class287 arg4, class136 arg5, int arg6, boolean arg7, class316 arg8, int arg9) {
        field2627++;
        class131 var11 = class490.method2960(0, this.field2584, this.field2661.field437, -127);
        if (var11 == null) {
            return null;
        }
        if (var11.field1693 < 13) {
            var11.method787(0, 0);
        }
        if (this.field2648 != null) {
            for (int var12 = 0; var12 < this.field2648.length; var12++) {
                if (this.field2604 == null || var12 >= this.field2604.length) {
                    var11.method799(-73, this.field2625[var12], this.field2648[var12]);
                } else {
                    var11.method799(-85, class401.field5815[this.field2604[var12] & 0xFF], this.field2648[var12]);
                }
            }
        }
        if (this.field2656 != null) {
            for (int var13 = 0; var13 < this.field2656.length; var13++) {
                var11.method789(false, this.field2644[var13], this.field2656[var13]);
            }
        }
        if (arg5 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                if (arg5.field1809[var14] < class115.field1509[var14].length) {
                    var11.method799(-7, class115.field1509[var14][arg5.field1809[var14]], class109.field1463[var14]);
                }
                if (arg5.field1809[var14] < class29.field280[var14].length) {
                    var11.method799(-8, class29.field280[var14][arg5.field1809[var14]], class495.field7232[var14]);
                }
            }
        }
        int var15 = 2048;
        boolean var16 = false;
        if (this.field2618 != 128 || this.field2592 != 128 || this.field2658 != 128) {
            var16 = true;
            var15 |= 0x7;
        }
        class373 var17 = arg3.method1213(var11, var15, 0, this.field2622 + 64, this.field2612 + 768);
        if (!var17.method2020()) {
            return null;
        }
        if (var16) {
            var17.method2035(this.field2618, this.field2592, this.field2658);
        }
        class24 var18 = null;
        if (this.field2601 != -1) {
            var18 = this.field2661.method227(arg4, arg5, this.field2641, true, 0, 10, 1, 0, -10465, arg3, true, arg8);
            if (var18 == null) {
                return null;
            }
        } else if (this.field2591 != -1) {
            var18 = this.field2661.method227(arg4, arg5, this.field2659, true, 0, arg0, arg1, arg9, -10465, arg3, false, arg8);
            if (var18 == null) {
                return null;
            }
        }
        int var19;
        if (arg7) {
            var19 = (int) ((double) this.field2599 * 1.5D) << 0;
        } else if (arg1 == 2) {
            var19 = (int) ((double) this.field2599 * 1.04D) << 0;
        } else {
            var19 = this.field2599 << 0;
        }
        arg3.method1221(16, 16, 512, 512);
        class124 var20 = arg3.method1125();
        var20.method741();
        arg3.method1227(var20);
        arg3.method1139(1.0F);
        arg3.method1181(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class124 var21 = arg3.method1183();
        var21.method756(-this.field2638 << 3);
        var21.method742(this.field2585 << 3);
        var21.method757(this.field2589 << 0, (class456.field6812[this.field2621 << 3] * var19 >> 15) + (this.field2609 << 0) - (var17.method2041() / 2), (this.field2609 << 0) + (class456.field6811[this.field2621 << 3] * var19 >> 15));
        var21.method751(this.field2621 << 3);
        int var22 = arg3.method1234();
        int var23 = 6 % ((arg6 + 31) / 61);
        int var24 = arg3.method1141();
        arg3.method1200(50, Integer.MAX_VALUE);
        arg3.method1188();
        arg3.method1206();
        arg3.method1153(0, 0, 36, 32, 0, 0);
        var17.method2051(var21, null, 1);
        arg3.method1200(var22, var24);
        int[] var25 = arg3.method1151(0, 0, 36, 32);
        if (arg1 >= 1) {
            var25 = this.method1283(var25, -16777214, (byte) 110);
            if (arg1 >= 2) {
                var25 = this.method1283(var25, -1, (byte) 110);
            }
        }
        if (arg9 != 0) {
            this.method1271((byte) 127, var25, arg9);
        }
        arg3.method1218(var25, 0, 36, 36, 32).method144(0, 0);
        if (this.field2601 != -1) {
            var18.method144(0, 0);
        } else if (this.field2591 != -1) {
            var18.method144(0, 0);
        }
        if (arg2 == 1 || arg2 == 2 && (this.field2606 == 1 || arg0 != 1) && arg0 != -1) {
            arg8.method1878(-16777215, 9, this.method1280((byte) -59, arg0), -256, 0, (byte) -5);
        }
        int[] var26 = arg3.method1151(0, 0, 36, 32);
        for (int var27 = 0; var27 < var26.length; var27++) {
            if ((var26[var27] & 0xFFFFFF) == 0) {
                var26[var27] = 0;
            } else {
                var26[var27] = class219.method1381(var26[var27], -16777216);
            }
        }
        return var26;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I", line = 1311)
    public final int method1285(int arg0, int arg1, int arg2) {
        field2614++;
        if (this.field2639 == null) {
            return arg1;
        } else if (arg0 == 477) {
            class488 var4 = (class488) this.field2639.method295((long) arg2, arg0 ^ 0xFFFFFE7E);
            return var4 == null ? arg1 : var4.field7162;
        } else {
            return 53;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(IZ)Lpq;", line = 1358)
    public final class131 method1286(int arg0, boolean arg1) {
        field2654++;
        int var3 = this.field2631;
        int var4 = this.field2603;
        int var5 = this.field2635;
        if (arg1) {
            var3 = this.field2624;
            var4 = this.field2651;
            var5 = this.field2581;
        }
        if (var3 == -1) {
            return null;
        }
        class131 var6 = class490.method2960(0, var3, this.field2661.field437, -121);
        if (arg0 < 2) {
            this.method1284(38, 85, -26, null, null, null, 10, true, null, -88);
        }
        if (var6.field1693 < 13) {
            var6.method787(0, 0);
        }
        if (var4 != -1) {
            class131 var7 = class490.method2960(0, var4, this.field2661.field437, -112);
            if (var7.field1693 < 13) {
                var7.method787(0, 0);
            }
            if (var5 == -1) {
                class131[] var10 = new class131[] { var6, var7 };
                var6 = new class131(var10, 2);
            } else {
                class131 var8 = class490.method2960(0, var5, this.field2661.field437, -119);
                if (var8.field1693 < 13) {
                    var8.method787(0, 0);
                }
                class131[] var9 = new class131[] { var6, var7, var8 };
                var6 = new class131(var9, 3);
            }
        }
        if (var6 == null) {
            return null;
        }
        if (!arg1 && (this.field2652 != 0 || this.field2617 != 0 || this.field2633 != 0)) {
            var6.method795(this.field2652, this.field2633, true, this.field2617);
        }
        if (arg1 && (this.field2594 != 0 || this.field2590 != 0 || this.field2608 != 0)) {
            var6.method795(this.field2594, this.field2608, true, this.field2590);
        }
        if (this.field2648 != null) {
            for (int var11 = 0; var11 < this.field2648.length; var11++) {
                var6.method799(-72, this.field2625[var11], this.field2648[var11]);
            }
        }
        if (this.field2656 != null) {
            for (int var12 = 0; var12 < this.field2656.length; var12++) {
                var6.method789(false, this.field2644[var12], this.field2656[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lug;II)V", line = 1462)
    private final void method1287(class396 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.field2642 = 16;
        }
        field2600++;
        if (arg1 == 1) {
            this.field2584 = arg0.method2386(-23648);
        } else if (arg1 == 2) {
            this.field2623 = arg0.method2432((byte) 125);
        } else if (arg1 == 4) {
            this.field2599 = arg0.method2386(-23648);
        } else if (arg1 == 5) {
            this.field2621 = arg0.method2386(arg2 - 23647);
        } else if (arg1 == 6) {
            this.field2585 = arg0.method2386(arg2 - 23647);
        } else if (arg1 == 7) {
            this.field2589 = arg0.method2386(arg2 - 23647);
            if (this.field2589 <= 32767) {
                return;
            }
            this.field2589 -= 65536;
        } else if (arg1 == 8) {
            this.field2609 = arg0.method2386(-23648);
            if (this.field2609 > 32767) {
                this.field2609 -= 65536;
                return;
            }
        } else if (arg1 == 11) {
            this.field2606 = 1;
            return;
        } else if (arg1 == 12) {
            this.field2642 = arg0.method2406((byte) -102);
            return;
        } else if (arg1 == 16) {
            this.field2598 = true;
            return;
        } else if (arg1 == 23) {
            this.field2631 = arg0.method2386(-23648);
            return;
        } else if (arg1 == 24) {
            this.field2603 = arg0.method2386(-23648);
            return;
        } else if (arg1 == 25) {
            this.field2624 = arg0.method2386(-23648);
            return;
        } else if (arg1 == 26) {
            this.field2651 = arg0.method2386(-23648);
            return;
        } else if (arg1 < 30 || arg1 >= 35) {
            if (arg1 >= 35 && arg1 < 40) {
                this.field2653[arg1 - 35] = arg0.method2432((byte) 125);
                return;
            }
            if (arg1 == 40) {
                int var4 = arg0.method2388((byte) -124);
                this.field2648 = new short[var4];
                this.field2625 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2648[var5] = (short) arg0.method2386(-23648);
                    this.field2625[var5] = (short) arg0.method2386(-23648);
                }
                return;
            }
            if (arg1 == 41) {
                int var6 = arg0.method2388((byte) -119);
                this.field2656 = new short[var6];
                this.field2644 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2656[var7] = (short) arg0.method2386(-23648);
                    this.field2644[var7] = (short) arg0.method2386(-23648);
                }
                return;
            }
            if (arg1 == 42) {
                int var8 = arg0.method2388((byte) -110);
                this.field2604 = new byte[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field2604[var9] = arg0.method2418(arg2 + 122);
                }
                return;
            }
            if (arg1 == 65) {
                this.field2586 = true;
                return;
            }
            if (arg1 != 78) {
                if (arg1 == 79) {
                    this.field2581 = arg0.method2386(-23648);
                    return;
                }
                if (arg1 != 90) {
                    if (arg1 == 91) {
                        this.field2616 = arg0.method2386(-23648);
                        return;
                    }
                    if (arg1 != 92) {
                        if (arg1 == 93) {
                            this.field2646 = arg0.method2386(arg2 ^ 0x5C5F);
                            return;
                        }
                        if (arg1 == 95) {
                            this.field2638 = arg0.method2386(-23648);
                            return;
                        }
                        if (arg1 == 96) {
                            this.field2602 = arg0.method2388((byte) -121);
                            return;
                        }
                        if (arg1 != 97) {
                            if (arg1 == 98) {
                                this.field2601 = arg0.method2386(-23648);
                                return;
                            }
                            if (arg1 >= 100 && arg1 < 110) {
                                if (this.field2640 == null) {
                                    this.field2640 = new int[10];
                                    this.field2626 = new int[10];
                                }
                                this.field2640[arg1 - 100] = arg0.method2386(-23648);
                                this.field2626[arg1 - 100] = arg0.method2386(arg2 - 23647);
                                return;
                            }
                            if (arg1 == 110) {
                                this.field2618 = arg0.method2386(-23648);
                                return;
                            }
                            if (arg1 != 111) {
                                if (arg1 == 112) {
                                    this.field2658 = arg0.method2386(-23648);
                                    return;
                                }
                                if (arg1 != 113) {
                                    if (arg1 == 114) {
                                        this.field2612 = arg0.method2418(-102) * 5;
                                        return;
                                    }
                                    if (arg1 != 115) {
                                        if (arg1 == 121) {
                                            this.field2659 = arg0.method2386(arg2 - 23647);
                                            return;
                                        }
                                        if (arg1 != 122) {
                                            if (arg1 == 125) {
                                                this.field2652 = arg0.method2418(102) << 0;
                                                this.field2617 = arg0.method2418(-22) << 0;
                                                this.field2633 = arg0.method2418(arg2 - 81) << 0;
                                                return;
                                            }
                                            if (arg1 != 126) {
                                                if (arg1 == 127) {
                                                    this.field2593 = arg0.method2388((byte) -112);
                                                    this.field2595 = arg0.method2386(-23648);
                                                    return;
                                                }
                                                if (arg1 == 128) {
                                                    this.field2610 = arg0.method2388((byte) -123);
                                                    this.field2632 = arg0.method2386(-23648);
                                                    return;
                                                }
                                                if (arg1 == 129) {
                                                    this.field2587 = arg0.method2388((byte) -127);
                                                    this.field2588 = arg0.method2386(arg2 - 23647);
                                                    return;
                                                }
                                                if (arg1 == 130) {
                                                    this.field2620 = arg0.method2388((byte) -118);
                                                    this.field2649 = arg0.method2386(arg2 - 23647);
                                                } else if (arg1 == 132) {
                                                    int var10 = arg0.method2388((byte) -120);
                                                    this.field2636 = new int[var10];
                                                    for (int var11 = 0; var11 < var10; var11++) {
                                                        this.field2636[var11] = arg0.method2386(-23648);
                                                    }
                                                    return;
                                                } else if (arg1 == 249) {
                                                    int var12 = arg0.method2388((byte) -116);
                                                    if (this.field2639 == null) {
                                                        int var13 = class111.method682(28, var12);
                                                        this.field2639 = new class50(var13);
                                                    }
                                                    for (int var14 = 0; var14 < var12; var14++) {
                                                        boolean var15 = arg0.method2388((byte) -117) == 1;
                                                        int var16 = arg0.method2396((byte) 92);
                                                        class435 var17;
                                                        if (var15) {
                                                            var17 = new class53(arg0.method2432((byte) 125));
                                                        } else {
                                                            var17 = new class488(arg0.method2406((byte) -128));
                                                        }
                                                        this.field2639.method291((long) var16, var17, -56);
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            this.field2594 = arg0.method2418(arg2 - 58) << 0;
                                            this.field2590 = arg0.method2418(126) << 0;
                                            this.field2608 = arg0.method2418(arg2 - 39) << 0;
                                            return;
                                        }
                                        this.field2591 = arg0.method2386(-23648);
                                        return;
                                    }
                                    this.field2611 = arg0.method2388((byte) -122);
                                    return;
                                }
                                this.field2622 = arg0.method2418(arg2 ^ 0x63);
                                return;
                            }
                            this.field2592 = arg0.method2386(-23648);
                            return;
                        }
                        this.field2641 = arg0.method2386(-23648);
                        return;
                    }
                    this.field2630 = arg0.method2386(-23648);
                    return;
                }
                this.field2628 = arg0.method2386(-23648);
                return;
            }
            this.field2635 = arg0.method2386(-23648);
            return;
        } else {
            this.field2655[arg1 - 30] = arg0.method2432((byte) 125);
            return;
        }
    }
}
