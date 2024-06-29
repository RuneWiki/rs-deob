import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class33 extends class223 {

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
    public static int[] field594 = new int[1000];

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field593;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Lub;")
    public static class92 field587;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    private final void method322(int arg0, byte arg1) {
        this.field593 = 4080 & arg0 << 4;
        this.field595 = arg0 >> 12 & 4080;
        this.field596 = (65280 & arg0) >> 4;
        ++field586;
        if (arg1 != 113) {
            field587 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLjava/lang/String;IIIIZIZLjava/lang/String;J)V")
    public static final void method323(boolean arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, String arg9, long arg10) {
        int[] var12 = new int[4];
        ++field585;
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class31 var14 = new class31(128);
        var14.method305(10, true);
        var14.method281((byte) -123, (!arg6 ? 0 : 4) | (arg0 ? 2 : 0) | (arg8 ? 1 : 0));
        var14.method313(-6968, arg10);
        var14.method258(var12[arg7], -1527329320);
        var14.method288(arg1, (byte) -43);
        var14.method258(var12[1], -1527329320);
        var14.method281((byte) -121, class178.field2734);
        var14.method305(arg5, true);
        var14.method305(arg2, true);
        var14.method258(var12[2], -1527329320);
        var14.method281((byte) -122, arg4);
        var14.method281((byte) -123, arg3);
        var14.method258(var12[3], -1527329320);
        var14.method270(arg7 ^ -26120, class283.field4456, class79.field1198);
        class31 var15 = new class31(350);
        var15.method288(arg9, (byte) -43);
        int var16 = 8 - class74.method586(arg7 ^ 21321, arg9) % 8;
        for (int var17 = 0; ~var16 < ~var17; ++var17) {
            var15.method305((int) (255.0D * Math.random()), true);
        }
        var15.method273(var12, -52);
        class240.field3826.field541 = 0;
        class240.field3826.method305(22, true);
        class240.field3826.method281((byte) -112, var14.field541 + var15.field541 + 2);
        class240.field3826.method281((byte) -126, 546);
        class240.field3826.method302(var14.field541, arg7 + 6103, 0, var14.field560);
        class240.field3826.method302(var15.field541, arg7 ^ 6103, 0, var15.field560);
        class231.field3667 = -3;
        class163.field2463 = 0;
        class37.field632 = 0;
        class128.field1918 = 1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 != 102) {
            method329(-38, 70, -47, -2);
        }
        if (arg1 == 0) {
            this.method322(arg0.method304((byte) 84), (byte) 113);
        }
        ++field591;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class33() {
        this(0);
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public static void method324(int arg0) {
        if (arg0 >= -70) {
            field594 = null;
        }
        field594 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;BZI)I")
    public static final int method325(String arg0, byte arg1, boolean arg2, int arg3) {
        ++field598;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            if (arg1 >= -90) {
                return -125;
            } else {
                boolean var4 = false;
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg0.length();
                for (int var8 = 0; var8 < var7; ++var8) {
                    char var9 = arg0.charAt(var8);
                    if (~var8 == -1) {
                        if (var9 == '-') {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg2) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (~var9 <= -66 && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || var9 > 'z') {
                            throw new NumberFormatException();
                        }
                        var11 = var9 - 'W';
                    }
                    if (arg3 <= var11) {
                        throw new NumberFormatException();
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg3 * var6 + var11;
                    if (var10 / arg3 != var6) {
                        throw new NumberFormatException();
                    }
                    var5 = true;
                    var6 = var10;
                }
                if (!var5) {
                    throw new NumberFormatException();
                } else {
                    return var6;
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V")
    private class33(int arg0) {
        super(0, false);
        this.method322(arg0, (byte) 113);
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)V")
    public static final void method326(int arg0) {
        int var1 = class294.field4574;
        ++field599;
        int var2 = class26.field439;
        int var3 = -class179.field2816 + class305.field4898 + -var1;
        int var4 = -class163.field2449 + class15.field196 + -var2;
        if (arg0 != -6802) {
            method327(4, (class136) null, 96, true);
        }
        if (~var1 < -1 || var3 > 0 || ~var2 < -1 || var4 > 0) {
            try {
                int var5 = 0;
                int var6 = 0;
                Container var7;
                if (class103.field1599 == null) {
                    if (class170.field2582 != null) {
                        var7 = class170.field2582;
                    } else {
                        var7 = class123.field1863.field63;
                    }
                } else {
                    var7 = class103.field1599;
                }
                if (class170.field2582 == var7) {
                    Insets var8 = class170.field2582.getInsets();
                    var5 = var8.left;
                    var6 = var8.top;
                }
                Graphics var9 = var7.getGraphics();
                var9.setColor(Color.black);
                if (var1 > 0) {
                    var9.fillRect(var5, var6, var1, class15.field196);
                }
                if (var2 > 0) {
                    var9.fillRect(var5, var6, class305.field4898, var2);
                }
                if (var3 > 0) {
                    var9.fillRect(-var3 + var5 - -class305.field4898, var6, var3, class15.field196);
                }
                if (~var4 < -1) {
                    var9.fillRect(var5, class15.field196 + var6 + -var4, class305.field4898, var4);
                    return;
                }
            } catch (Exception var10) {
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILfh;IZ)V")
    public static final void method327(int arg0, class136 arg1, int arg2, boolean arg3) {
        if ((4 & arg0) != 0) {
            int var4 = class183.field2900.method276((byte) 97);
            int var5 = class183.field2900.method277((byte) -103);
            arg1.method1973(var5, class41.field686, var4, 0);
            arg1.field4671 = class41.field686 + 300;
            arg1.field4760 = class183.field2900.method277((byte) -103);
        }
        ++field590;
        if ((16 & arg0) != 0) {
            int var6 = class183.field2900.method295((byte) -87);
            byte[] var7 = new byte[var6];
            class31 var8 = new class31(var7);
            class183.field2900.method259(var7, var6, 0, -13789);
            class98.field1575[arg2] = var8;
            arg1.method1011((byte) -33, var8);
        }
        if ((arg0 & 1024) != 0) {
            int var9 = class183.field2900.method276((byte) 122);
            int var10 = class183.field2900.method315((byte) 63);
            arg1.method1973(var10, class41.field686, var9, 0);
        }
        if ((arg0 & 64) != 0) {
            arg1.field4677 = class183.field2900.method282((byte) 104);
            arg1.field4739 = class183.field2900.method267(-7803);
        }
        if (~(2048 & arg0) != -1) {
            arg1.field4683 = class183.field2900.method277((byte) -103);
            arg1.field4682 = class183.field2900.method277((byte) -103);
            arg1.field4703 = class183.field2900.method265(-122);
            arg1.field4737 = class183.field2900.method265(-117);
            arg1.field4714 = class183.field2900.method256(-1) - -class41.field686;
            arg1.field4661 = class183.field2900.method260((byte) -67) + class41.field686;
            arg1.field4757 = class183.field2900.method265(-118);
            arg1.field4700 = 0;
            arg1.field4743 = 1;
        }
        if ((arg0 & 8) != 0) {
            int var11 = class183.field2900.method260((byte) -67);
            int var12 = class183.field2900.method315((byte) 76);
            if (var11 == 65535) {
                var11 = -1;
            }
            class84.method646(false, var11, arg1, var12);
        }
        if ((arg0 & 2) != 0) {
            int var13 = class183.field2900.method260((byte) -67);
            int var14 = class183.field2900.method295((byte) -87);
            int var15 = class183.field2900.method277((byte) -103);
            int var16 = class183.field2900.field541;
            boolean var17 = ~(32768 & var13) != -1;
            if (arg1.field2064 != null && arg1.field2044 != null) {
                long var18 = class170.method1223(!arg3, arg1.field2064);
                boolean var20 = false;
                if (~var14 >= -2) {
                    if (!var17 && (class112.field1733 && !class166.field2508 || class54.field854)) {
                        var20 = true;
                    } else {
                        for (int var21 = 0; ~class40.field677 < ~var21; ++var21) {
                            if (class78.field1189[var21] == var18) {
                                var20 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var20 && ~class236.field3724 == -1) {
                    int var22 = -1;
                    class268.field4250.field541 = 0;
                    class183.field2900.method296(-59, class268.field4250.field560, 0, var15);
                    class268.field4250.field541 = 0;
                    String var24;
                    if (var17) {
                        var13 &= 32767;
                        class121 var23 = class40.method354((byte) -78, class268.field4250);
                        var22 = var23.field1827;
                        var24 = var23.field1828.method1068(class268.field4250, (byte) 89);
                    } else {
                        var24 = class267.method1791(class67.method547(class297.method1992(class268.field4250, 127), (byte) 20));
                    }
                    arg1.field4695 = var24.trim();
                    arg1.field4691 = 255 & var13;
                    arg1.field4716 = var13 >> 8;
                    arg1.field4758 = 150;
                    if (var14 == 2) {
                        class296.method1972(var24, var22, (String) null, -128, !var17 ? 1 : 17, "<img=1>" + arg1.method1005(-13232));
                    } else if (var14 == 1) {
                        class296.method1972(var24, var22, (String) null, -128, var17 ? 17 : 1, "<img=0>" + arg1.method1005(-13232));
                    } else {
                        class296.method1972(var24, var22, (String) null, -128, !var17 ? 2 : 17, arg1.method1005(-13232));
                    }
                }
            }
            class183.field2900.field541 = var16 - -var15;
        }
        if ((arg0 & 512) != 0) {
            int var25 = class183.field2900.method277((byte) -103);
            int[] var26 = new int[var25];
            int[] var27 = new int[var25];
            int[] var28 = new int[var25];
            for (int var29 = 0; var29 < var25; ++var29) {
                int var30 = class183.field2900.method282((byte) 105);
                if (~var30 == -65536) {
                    var30 = -1;
                }
                var28[var29] = var30;
                var26[var29] = class183.field2900.method265(-128);
                var27[var29] = class183.field2900.method267(-7803);
            }
            class46.method392(var27, var26, var28, -116, arg1);
        }
        if ((arg0 & 1) != 0) {
            arg1.field4702 = class183.field2900.method267(-7803);
            if (arg1.field4702 == 65535) {
                arg1.field4702 = -1;
            }
        }
        if ((128 & arg0) != 0) {
            arg1.field4695 = class183.field2900.method262(11386);
            if (~arg1.field4695.charAt(0) == -127) {
                arg1.field4695 = arg1.field4695.substring(1);
                class247.method1671(2, arg1.field4695, -1, arg1.method1005(-13232));
            } else if (class263.field4168 == arg1) {
                class247.method1671(2, arg1.field4695, -1, arg1.method1005(-13232));
            }
            arg1.field4691 = 0;
            arg1.field4716 = 0;
            arg1.field4758 = 150;
        }
        if ((arg0 & 256) != 0) {
            int var31 = class183.field2900.method282((byte) 112);
            int var32 = class183.field2900.method279(true);
            boolean var33 = true;
            if (~var31 == -65536) {
                var31 = -1;
            }
            if (~var31 != 0 && arg1.field4732 != -1 && class250.method1700(class86.method654(var31, 96).field3166, -90).field1589 < class250.method1700(class86.method654(arg1.field4732, 113).field3166, -97).field1589) {
                var33 = false;
            }
            if (var33) {
                arg1.field4744 = var32 >> 16;
                arg1.field4732 = var31;
                arg1.field4660 = 0;
                arg1.field4711 = 0;
                arg1.field4750 = (65535 & var32) + class41.field686;
                if (class41.field686 < arg1.field4750) {
                    arg1.field4660 = -1;
                }
                arg1.field4713 = 1;
                if (arg1.field4732 != -1 && ~class41.field686 == ~arg1.field4750) {
                    int var34 = class86.method654(arg1.field4732, 95).field3166;
                    if (var34 != -1) {
                        class103 var35 = class250.method1700(var34, -18);
                        if (var35 != null && var35.field1606 != null) {
                            class136.method1004(arg1.field4725, 0, arg1.field4709, var35, 255, class263.field4168 == arg1);
                        }
                    }
                }
            }
        }
        if (arg3) {
            field588 = -42;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        ++field592;
        if (arg0 < 0) {
            method325((String) null, (byte) 39, true, -37);
        }
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (super.field3572.field4257) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class250.field4008; ++var7) {
                var4[var7] = this.field595;
                var5[var7] = this.field596;
                var6[var7] = this.field593;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lff;)V")
    public static final void method328(class19 arg0) {
        for (int var1 = arg0.field255; var1 <= arg0.field261; ++var1) {
            for (int var2 = arg0.field258; var2 <= arg0.field260; ++var2) {
                class22 var3 = class149.field2210[arg0.field254][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field371; ++var4) {
                        if (var3.field355[var4] == arg0) {
                            --var3.field371;
                            for (int var5 = var4; var5 < var3.field371; ++var5) {
                                var3.field355[var5] = var3.field355[var5 + 1];
                                var3.field367[var5] = var3.field367[var5 + 1];
                            }
                            var3.field355[var3.field371] = null;
                            break;
                        }
                    }
                    var3.field378 = 0;
                    for (int var6 = 0; var6 < var3.field371; ++var6) {
                        var3.field378 |= var3.field367[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIII)V")
    public static final void method329(int arg0, int arg1, int arg2, int arg3) {
        ++field589;
        if (~arg0 == -1) {
            ++class153.field2258;
            class240.field3826.method1762(68, true);
            class240.field3826.method305(5, true);
        }
        if (arg0 == 1) {
            class240.field3826.method1762(229, true);
            class240.field3826.method305(19, true);
            ++class248.field3952;
        }
        class240.field3826.method281((byte) -126, class138.field2072 + arg3);
        class240.field3826.method311((byte) -115, !class292.field4537[82] ? 0 : 1);
        class240.field3826.method274(27071, arg2 - -class159.field2379);
        class305.field4895 = arg3;
        if (arg1 != 0) {
            method324(105);
        }
        class296.field4669 = arg2;
    }
}
