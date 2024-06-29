import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class260 {

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
    public boolean field3470 = false;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field3475 = 2;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public int field3478 = 5;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field3473 = -1;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public int field3488 = -1;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "I")
    public int field3485 = 0;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Z")
    public boolean field3477 = false;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public int field3484 = 99;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public int field3482 = -1;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public int field3469 = -1;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public int field3483 = -1;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "Z")
    public boolean field3493 = false;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lho;")
    public static class103 field3465 = new class103(71, 7);

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Z")
    public static boolean field3492 = false;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field3495 = 0;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "Lao;")
    public static class191 field3491 = new class191(3, 7);

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "Lvm;")
    public class485 field3479;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oj", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field3496;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "[I")
    private int[] field3466;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "[I")
    public int[] field3474;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[I")
    public int[] field3489;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "[Z")
    public boolean[] field3464;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "[Z")
    public static boolean[] field3494;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "[[I")
    public int[][] field3481;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()V")
    public static final void method1597() {
        for (int var0 = 0; var0 < class73.field925; var0++) {
            if (!class151.field1979[var0]) {
                class340 var1 = class124.field1608[var0];
                class309 var2 = var1.field4510;
                int var3 = var1.field4512;
                int var4 = var2.method1845((byte) -98) - class123.field1595;
                int var5 = (var4 * 2 >> class351.field4688) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method1840((byte) -94) - var4 >> class351.field4688;
                int var9 = var2.method1842((byte) 105) - var4 >> class351.field4688;
                int var10 = var2.method1842((byte) 111) + var4 >> class351.field4688;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class114.field1494) {
                    var10 = class114.field1494 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field4496[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class515.field7487) {
                        var16 = class515.field7487 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class279 var19 = class365.method2172(var3, var17, var11, field3496 == null ? (field3496 = method1606("ns")) : field3496);
                        if (var19 != null && var19.field3701 != 0) {
                            if (var19.field3701 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field4496[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field4496[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field4496[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field4496[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class151.field1979[var0] = true;
                class152.field1993[var3].method215(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILe;IIIIBI)Le;")
    public final class373 method1598(int arg0, class373 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field3486++;
        int var9 = this.field3489[arg4];
        int var10 = this.field3474[arg4];
        class516 var11 = this.field3479.method2953(15, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg1.method2027(arg6, arg0, true);
        }
        class516 var13 = null;
        if ((this.field3470 || class134.field1761) && arg3 != -1 && arg3 < this.field3474.length) {
            int var14 = this.field3474[arg3];
            var13 = this.field3479.method2953(15, var14 >> 16);
            arg3 = var14 & 0xFFFF;
        }
        if (this.field3493) {
            arg0 |= 0x200;
        }
        if (var11.method3077(var12, (byte) 53)) {
            arg0 |= 0x80;
        }
        if (var11.method3073(var12, true)) {
            arg0 |= 0x100;
        }
        if (var11.method3072(var12, 2693)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3077(arg3, (byte) 53)) {
                arg0 |= 0x80;
            }
            if (var13.method3073(arg3, true)) {
                arg0 |= 0x100;
            }
            if (var13.method3072(arg3, 2693)) {
                arg0 |= 0x400;
            }
        }
        if (arg7 == 8294) {
            int var15 = arg0 | 0x20;
            class373 var16 = arg1.method2027(arg6, var15, true);
            var16.method2208(var11, arg5, var9, arg2 - 1, arg3, var12, 1, this.field3493, var13);
            return var16;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;IIBII)Le;")
    public final class373 method1599(class373 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3472++;
        int var7 = this.field3489[arg4];
        int var8 = this.field3474[arg4];
        class516 var9 = this.field3479.method2953(15, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method2027((byte) 1, arg1, true);
        }
        class516 var11 = null;
        if ((this.field3470 || class134.field1761) && arg2 != -1 && arg2 < this.field3474.length) {
            int var12 = this.field3474[arg2];
            var11 = this.field3479.method2953(15, var12 >> 16);
            arg2 = var12 & 0xFFFF;
        }
        class516 var13 = null;
        class516 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3466 != null) {
            if (arg4 < this.field3466.length) {
                var15 = this.field3466[arg4];
                if (var15 != 65535) {
                    var13 = this.field3479.method2953(15, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3470 || class134.field1761) && arg2 != -1 && this.field3466.length > arg2) {
                var16 = this.field3466[arg2];
                if (var16 != 65535) {
                    var14 = this.field3479.method2953(arg3 + 69, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3493) {
            arg1 |= 0x200;
        }
        if (var9.method3077(var10, (byte) 53)) {
            arg1 |= 0x80;
        }
        if (var9.method3073(var10, true)) {
            arg1 |= 0x100;
        }
        if (var9.method3072(var10, 2693)) {
            arg1 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method3077(var15, (byte) 53)) {
                arg1 |= 0x80;
            }
            if (var13.method3073(var15, true)) {
                arg1 |= 0x100;
            }
            if (var13.method3072(var15, 2693)) {
                arg1 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method3077(arg2, (byte) 53)) {
                arg1 |= 0x80;
            }
            if (var11.method3073(arg2, true)) {
                arg1 |= 0x100;
            }
            if (var11.method3072(arg2, arg3 ^ 0xFFFFF54F)) {
                arg1 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method3077(var16, (byte) 53)) {
                arg1 |= 0x80;
            }
            if (var14.method3073(var16, true)) {
                arg1 |= 0x100;
            }
            if (var14.method3072(var16, 2693)) {
                arg1 |= 0x400;
            }
        }
        int var17 = arg1 | 0x20;
        if (arg3 != -54) {
            this.method1601(6, null, -17);
        }
        class373 var18 = arg0.method2027((byte) 1, var17, true);
        var18.method2208(var9, 0, var7, arg5 - 1, arg2, var10, arg3 + 55, this.field3493, var11);
        if (var13 != null) {
            var18.method2208(var13, 0, var7, arg5 - 1, var16, var15, 1, this.field3493, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method1600(byte arg0) {
        field3494 = null;
        if (arg0 == -22) {
            field3491 = null;
            field3465 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILug;I)V")
    private final void method1601(int arg0, class396 arg1, int arg2) {
        field3476++;
        if (arg0 == arg2) {
            int var4 = arg1.method2386(-23648);
            this.field3489 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3489[var5] = arg1.method2386(-23648);
            }
            this.field3474 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3474[var6] = arg1.method2386(-23648);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3474[var7] += arg1.method2386(-23648) << 16;
            }
        } else if (arg2 == 2) {
            this.field3482 = arg1.method2386(arg0 - 23649);
        } else if (arg2 == 3) {
            this.field3464 = new boolean[256];
            int var8 = arg1.method2388((byte) -118);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3464[arg1.method2388((byte) -124)] = true;
            }
        } else if (arg2 == 5) {
            this.field3478 = arg1.method2388((byte) -128);
        } else if (arg2 == 6) {
            this.field3469 = arg1.method2386(-23648);
        } else if (arg2 == 7) {
            this.field3488 = arg1.method2386(-23648);
        } else if (arg2 == 8) {
            this.field3484 = arg1.method2388((byte) -111);
        } else if (arg2 == 9) {
            this.field3483 = arg1.method2388((byte) -117);
        } else if (arg2 == 10) {
            this.field3473 = arg1.method2388((byte) -118);
        } else if (arg2 == 11) {
            this.field3475 = arg1.method2388((byte) -112);
        } else if (arg2 == 12) {
            int var10 = arg1.method2388((byte) -126);
            this.field3466 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field3466[var11] = arg1.method2386(-23648);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field3466[var12] = (arg1.method2386(class335.method1958(arg0, -23647)) << 16) + this.field3466[var12];
            }
        } else if (arg2 == 13) {
            int var13 = arg1.method2386(arg0 ^ 0xFFFFA3A1);
            this.field3481 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg1.method2388((byte) -120);
                if (var15 > 0) {
                    this.field3481[var14] = new int[var15];
                    this.field3481[var14][0] = arg1.method2396((byte) 65);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field3481[var14][var16] = arg1.method2386(-23648);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3493 = true;
        } else if (arg2 == 15) {
            this.field3470 = true;
        } else if (arg2 == 16) {
            this.field3477 = true;
        } else if (arg2 == 17) {
            this.field3485 = arg1.method2388((byte) -123);
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lug;B)V")
    public final void method1602(class396 arg0, byte arg1) {
        if (arg1 != 116) {
            this.field3477 = false;
        }
        field3471++;
        while (true) {
            int var3 = arg0.method2388((byte) -116);
            if (var3 == 0) {
                return;
            }
            this.method1601(1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method1603(byte arg0, String arg1) {
        field3490++;
        if (arg1 == null) {
            return;
        }
        if (!(class85.field1014 < 100 || class19.field166) || class85.field1014 >= 200) {
            class180.method1053(0, class363.field4963.method1823(class374.field5072, (byte) -88));
            return;
        }
        String var2 = class437.method2684(-98, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class85.field1014; var3++) {
            String var7 = class437.method2684(-115, class52.field611[var3]);
            if (var7 != null && var7.equals(var2)) {
                class180.method1053(0, arg1 + class1.field4.method1823(class374.field5072, (byte) -88));
                return;
            }
            if (class465.field6912[var3] != null) {
                String var8 = class437.method2684(-65, class465.field6912[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class180.method1053(0, arg1 + class1.field4.method1823(class374.field5072, (byte) -88));
                    return;
                }
            }
        }
        if (arg0 >= -119) {
            field3491 = null;
        }
        for (int var4 = 0; var4 < class327.field4351; var4++) {
            String var5 = class437.method2684(-65, class384.field5591[var4]);
            if (var5 != null && var5.equals(var2)) {
                class180.method1053(0, class478.field7083.method1823(class374.field5072, (byte) -88) + arg1 + class466.field6930.method1823(class374.field5072, (byte) -88));
                return;
            }
            if (class161.field2091[var4] != null) {
                String var6 = class437.method2684(-103, class161.field2091[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class180.method1053(0, class478.field7083.method1823(class374.field5072, (byte) -88) + arg1 + class466.field6930.method1823(class374.field5072, (byte) -88));
                    return;
                }
            }
        }
        if (class437.method2684(-115, class96.field1170.field7783).equals(var2)) {
            class180.method1053(0, class386.field5619.method1823(class374.field5072, (byte) -88));
        } else {
            class492.method2979(class131.field1704, 33);
            class275.field3662++;
            class106.field1443.method2449((byte) 125, class424.method2613(1, arg1));
            class106.field1443.method2415(arg1, 21742);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZIB)I")
    public final int method1604(int arg0, boolean arg1, int arg2, byte arg3) {
        field3480++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3474[arg0];
        if (arg3 < 100) {
            this.field3485 = 40;
        }
        class516 var8 = null;
        class516 var9 = this.field3479.method2953(15, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3470 || class134.field1761) && arg2 != -1 && this.field3474.length > arg2) {
            int var11 = this.field3474[arg2];
            var8 = this.field3479.method2953(15, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3493) {
            var5 |= 0x200;
        }
        if (var9.method3077(var10, (byte) 53)) {
            var5 |= 0x80;
        }
        if (var9.method3073(var10, true)) {
            var5 |= 0x100;
        }
        if (var9.method3072(var10, 2693)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method3077(var6, (byte) 53)) {
                var5 |= 0x80;
            }
            if (var8.method3073(var6, true)) {
                var5 |= 0x100;
            }
            if (var8.method3072(var6, 2693)) {
                var5 |= 0x400;
            }
        }
        if (this.field3466 != null && arg1) {
            if (arg0 < this.field3466.length) {
                int var12 = this.field3466[arg0];
                if (var12 != 65535) {
                    class516 var13 = this.field3479.method2953(15, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method3077(var14, (byte) 53)) {
                            var5 |= 0x80;
                        }
                        if (var13.method3073(var14, true)) {
                            var5 |= 0x100;
                        }
                        if (var13.method3072(var14, 2693)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3470 || class134.field1761) && arg2 != -1 && arg2 < this.field3466.length) {
                int var15 = this.field3466[arg2];
                if (var15 != 65535) {
                    class516 var16 = this.field3479.method2953(15, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method3077(var17, (byte) 53)) {
                            var5 |= 0x80;
                        }
                        if (var16.method3073(var17, true)) {
                            var5 |= 0x100;
                        }
                        if (var16.method3072(var17, 2693)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
    public final void method1605(int arg0) {
        field3467++;
        if (this.field3483 == -1) {
            if (this.field3464 == null) {
                this.field3483 = 0;
            } else {
                this.field3483 = 2;
            }
        }
        if (~this.field3473 != arg0) {
            return;
        }
        if (this.field3464 == null) {
            this.field3473 = 0;
        } else {
            this.field3473 = 2;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1606(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
