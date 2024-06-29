import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class127 extends class124 {

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "I")
    private int field2113 = 32768;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "[I")
    public static int[] field2095 = new int[128];

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Le;")
    private static class191 field2102 = class54.method368("K", 2047);

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static volatile int field2108 = 0;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "Z")
    public static boolean field2111 = true;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "Le;")
    public static class191 field2099 = field2102;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "Le;")
    public static class191 field2107 = class54.method368("Fallen lassen", 2047);

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "Le;")
    public static class191 field2115 = field2102;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Lea;")
    public static class200 field2105;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public static void method857(int arg0) {
        field2105 = null;
        if (arg0 == 0) {
            field2099 = null;
            field2095 = null;
            field2107 = null;
            field2115 = null;
            field2102 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Z")
    public static final boolean method858(int arg0, int arg1) {
        ++field2109;
        if (class148.field2531[arg0]) {
            return true;
        } else if (!class197.field3513.method797(arg0, (byte) 105)) {
            return false;
        } else {
            int var2 = class197.field3513.method805((byte) 54, arg0);
            if (~var2 == -1) {
                class148.field2531[arg0] = true;
                return true;
            } else {
                if (class242.field4325[arg0] == null) {
                    class242.field4325[arg0] = new class33[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class242.field4325[arg0][var3] == null) {
                        byte[] var5 = class197.field3513.method826((byte) 35, arg0, var3);
                        if (var5 != null) {
                            class242.field4325[arg0][var3] = new class33();
                            class242.field4325[arg0][var3].field491 = (arg0 << 16) + var3;
                            if (~var5[0] == 0) {
                                class242.field4325[arg0][var3].method235(new class225(var5), 117);
                            } else {
                                class242.field4325[arg0][var3].method232(-7218, new class225(var5));
                            }
                        }
                    }
                }
                int var4 = -104 / ((-67 - arg1) / 53);
                class148.field2531[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 < 68) {
            this.field2113 = 49;
        }
        ++field2100;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(1, 97, arg1);
            int[] var5 = this.method844(2, 87, arg1);
            for (int var6 = 0; ~var6 > ~class64.field1132; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field2113 >> 12;
                int var9 = class150.field2582[var7] * var8 >> 12;
                int var10 = class20.field281[var7] * var8 >> 12;
                int var11 = class181.field3119 & (var10 >> 12) + arg1;
                int var12 = class8.field82 & (var9 >> 12) + var6;
                int[] var13 = this.method844(0, 106, var11);
                var3[var6] = var13[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 == -1) {
            method862(7332);
            ++field2103;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method859(int arg0, Component arg1) {
        ++field2098;
        arg1.removeMouseListener(class17.field226);
        arg1.removeMouseMotionListener(class17.field226);
        arg1.removeFocusListener(class17.field226);
        field2108 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILng;B)[Lli;")
    public static final class155[] method860(int arg0, int arg1, class121 arg2, byte arg3) {
        ++field2096;
        if (arg3 > -105) {
            return null;
        } else {
            return !class121.method796(true, arg1, arg0, arg2) ? null : class53.method361((byte) -110);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(IIII)Z")
    public static final boolean method861(int arg0, int arg1, int arg2, int arg3) {
        if (!class161.method1092(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class130.method883(var4 + 1, class12.field143[arg0][arg1][arg2] + arg3, var5 + 1) && class130.method883(var4 + 128 - 1, class12.field143[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class130.method883(var4 + 128 - 1, class12.field143[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class130.method883(var4 + 1, class12.field143[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class127() {
        super(3, false);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field2097;
        int[][] var3 = super.field2053.method1775((byte) -105, arg0);
        if (arg1 != -7) {
            method857(-72);
        }
        if (super.field2053.field4558) {
            int[] var4 = this.method844(1, 124, arg0);
            int[] var5 = this.method844(2, 60, arg0);
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            for (int var9 = 0; var9 < class64.field1132; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field2113 >> 12;
                int var12 = class150.field2582[var10] * var11 >> 12;
                int var13 = class20.field281[var10] * var11 >> 12;
                int var14 = class8.field82 & (var12 >> 12) + var9;
                int var15 = class181.field3119 & arg0 - -(var13 >> 12);
                int[][] var16 = this.method843((byte) -126, var15, 0);
                var6[var9] = var16[0][var14];
                var8[var9] = var16[1][var14];
                var7[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "(I)V")
    public static final void method862(int arg0) {
        ++field2114;
        if (class20.field281 == null || class150.field2582 == null) {
            class150.field2582 = new int[256];
            class20.field281 = new int[256];
            for (int var1 = 0; var1 < 256; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class20.field281[var1] = (int) (4096.0D * Math.sin(var2));
                class150.field2582[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 7332) {
            field2095 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2101;
        int var8 = arg3 + arg4;
        int var9 = -arg3 + arg6;
        for (int var10 = arg4; ~var10 > ~var8; ++var10) {
            class242.method1700(7, arg5, arg0, class232.field4151[var10], arg7);
        }
        for (int var11 = arg6; ~var11 < ~var9; --var11) {
            class242.method1700(arg2 + -24893, arg5, arg0, class232.field4151[var11], arg7);
        }
        int var12 = arg3 + arg7;
        int var13 = -arg3 + arg0;
        for (int var14 = var8; var14 <= var9; ++var14) {
            int[] var15 = class232.field4151[var14];
            class242.method1700(arg2 ^ 24899, arg5, var12, var15, arg7);
            class242.method1700(arg2 ^ 24899, arg1, var13, var15, var12);
            class242.method1700(arg2 ^ 24899, arg5, arg0, var15, var13);
        }
        if (arg2 != 24900) {
            method863(35, 85, 116, -19, 106, -22, -120, 27);
        }
    }

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "(I)Lwa;")
    public static final class226 method864(int arg0) {
        ++field2110;
        byte[] var1 = class161.field2731[0];
        int var2 = class68.field1183[0] * class47.field842[0];
        int[] var3 = new int[var2];
        int var4 = 0;
        if (arg0 <= 91) {
            field2108 = -4;
        }
        while (~var2 < ~var4) {
            var3[var4] = class19.field261[class167.method1128(var1[var4], 255)];
            ++var4;
        }
        class155 var5 = new class155(class36.field661, class3.field22, class253.field4489[0], class245.field4360[0], class68.field1183[0], class47.field842[0], var3);
        class228.method1628((byte) 0);
        return var5;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2106;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field2063 = ~arg1.method1580(-107) == -2;
            }
        } else {
            this.field2113 = arg1.method1593(true) << 4;
        }
        if (!arg2) {
            method858(33, -51);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 >= -66) {
            field2115 = null;
        }
        ++field2112;
        for (int var9 = 0; class110.field1849.field816 > var9; ++var9) {
            int var10 = -class110.field1849.field826[var9] - -class76.field1319 + class161.field2728 + -1;
            int var11 = class110.field1849.field823[var9] + -class54.field1009;
            int var12 = (var11 - arg7) * (-arg3 + arg4) / (arg8 - arg7) + arg3;
            int var13 = 16777215;
            class6 var14 = null;
            int var15 = class110.field1849.method314(var9, (byte) -121);
            int var16 = (var10 - arg2) * (-arg1 + arg5) / (arg0 - arg2) + arg1;
            if (var15 == 0) {
                if ((double) class115.field1905 == 3.0D) {
                    var14 = class110.field1831;
                }
                if ((double) class115.field1905 == 4.0D) {
                    var14 = class161.field2734;
                }
                if ((double) class115.field1905 == 6.0D) {
                    var14 = class206.field3660;
                }
                if ((double) class115.field1905 == 8.0D) {
                    var14 = class49.field869;
                }
            }
            if (~var15 == -2) {
                if ((double) class115.field1905 == 3.0D) {
                    var14 = class206.field3660;
                }
                if ((double) class115.field1905 == 4.0D) {
                    var14 = class49.field869;
                }
                if ((double) class115.field1905 == 6.0D) {
                    var14 = class29.field410;
                }
                if ((double) class115.field1905 == 8.0D) {
                    var14 = class266.field4712;
                }
            }
            if (var15 == 2) {
                if ((double) class115.field1905 == 3.0D) {
                    var14 = class29.field410;
                }
                var13 = 16755200;
                if ((double) class115.field1905 == 4.0D) {
                    var14 = class266.field4712;
                }
                if ((double) class115.field1905 == 6.0D) {
                    var14 = class51.field926;
                }
                if ((double) class115.field1905 == 8.0D) {
                    var14 = class225.field4006;
                }
            }
            if (class110.field1849.field817[var9] != -1) {
                var13 = class110.field1849.field817[var9];
            }
            if (var14 != null) {
                class191[] var17 = new class191[1 + class110.field1849.field825[var9].method1313(60, 102)];
                class83.field1393.method289(class110.field1849.field825[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var16 - var14.method29() * (var18 + -1) / 2;
                int var20 = var19 + var14.method28() / 2;
                for (int var21 = 0; var21 < var18; ++var21) {
                    class191 var22 = var18 + -1 == var21 ? var17[var21] : var17[var21].method1330(0, -88, -4 + var17[var21].method1304(63));
                    var14.method32(var22, var12, var20, var13, true);
                    var20 += var14.method29();
                }
            }
        }
    }
}
