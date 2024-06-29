import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class133 {

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lvu;")
    public class223 field1918 = new class223();

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "[Lck;")
    public static class452[] field1922 = new class452[8];

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "[I")
    public static int[] field1929 = new int[2];

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[I")
    public static int[] field1920 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "[Lvh;")
    public static class241[] field1940 = new class241[2048];

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
    public static boolean field1932 = false;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lvu;")
    private class223 field1935;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Lfs;")
    public static class387 field1919;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILvu;)V", line = 10)
    public final void method1011(int arg0, class223 arg1) {
        if (arg1.field3269 != null) {
            arg1.method1525((byte) -83);
        }
        if (arg0 != 1245184) {
            this.method1011(17, null);
        }
        field1926++;
        arg1.field3275 = this.field1918.field3275;
        arg1.field3269 = this.field1918;
        arg1.field3269.field3275 = arg1;
        arg1.field3275.field3269 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIIIIII)V", line = 27)
    public static final void method1012(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1941++;
        class151.method1089(!arg0, arg2);
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class141.field1996[arg6];
        int var16 = arg3 - var8;
        class531.method3136(arg3 - arg2, -112, arg1, var16, var15);
        if (!arg0) {
            return;
        }
        int var17 = arg3 + var8;
        class531.method3136(var16, 125, arg5, var17, var15);
        class531.method3136(var17, -89, arg1, arg2 + arg3, var15);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class430.field6323[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class141.field1996[arg6 + var9];
                    int[] var19 = class141.field1996[arg6 - var9];
                    int var20 = class430.field6323[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class531.method3136(var22, 118, arg1, var24, var18);
                    class531.method3136(var24, -127, arg5, var23, var18);
                    class531.method3136(var23, -37, arg1, var21, var18);
                    class531.method3136(var22, 123, arg1, var24, var19);
                    class531.method3136(var24, 124, arg5, var23, var19);
                    class531.method3136(var23, -62, arg1, var21, var19);
                } else {
                    int[] var25 = class141.field1996[arg6 + var9];
                    int[] var26 = class141.field1996[arg6 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class531.method3136(var28, 119, arg1, var27, var25);
                    class531.method3136(var28, -8, arg1, var27, var26);
                }
            }
            int[] var29 = class141.field1996[arg6 + var7];
            int[] var30 = class141.field1996[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class531.method3136(var32, 123, arg1, var31, var29);
                class531.method3136(var32, -117, arg1, var31, var30);
            } else {
                int var33 = var11 >= var7 ? var11 : class430.field6323[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class531.method3136(var32, -68, arg1, var35, var29);
                class531.method3136(var35, -24, arg5, var34, var29);
                class531.method3136(var34, 118, arg1, var31, var29);
                class531.method3136(var32, 118, arg1, var35, var30);
                class531.method3136(var35, -74, arg5, var34, var30);
                class531.method3136(var34, -63, arg1, var31, var30);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZIII[[[Lnt;)Z", line = 158)
    public static final boolean method1013(int arg0, boolean arg1, int arg2, int arg3, int arg4, class148[][][] arg5) {
        field1939++;
        byte var6 = arg1 ? 1 : (byte) (class50.field551 & 0xFF);
        if (class232.field3411[class525.field7714][arg0][arg3] == var6) {
            return false;
        } else if ((class238.field3497[class525.field7714][arg0][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            if (arg2 != 32582) {
                method1021((byte) -60);
            }
            class499.field7406[var7] = arg0;
            int var35 = var7 + 1;
            class291.field4179[var7] = arg3;
            class232.field3411[class525.field7714][arg0][arg3] = var6;
            while (var35 != var8) {
                int var9 = class499.field7406[var8] & 0xFFFF;
                int var10 = class499.field7406[var8] >> 16 & 0xFF;
                int var11 = class499.field7406[var8] >> 24 & 0xFF;
                int var12 = class291.field4179[var8] & 0xFFFF;
                int var13 = class291.field4179[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class238.field3497[class525.field7714][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class525.field7714 + 1; var16 <= 3; var16++) {
                    if ((class238.field3497[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field2098 != null) {
                                int var20 = class162.method1141(var10, 20268);
                                if (arg5[var16][var9][var12].field2098.field3446 == var20 || arg5[var16][var9][var12].field2078 != null && arg5[var16][var9][var12].field2078.field3446 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class162.method1141(var11, arg2 - 12314);
                                    if (arg5[var16][var9][var12].field2098.field3446 == var21 || arg5[var16][var9][var12].field2078 != null && arg5[var16][var9][var12].field2078.field3446 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class162.method1141(var13, 20268);
                                    if (arg5[var16][var9][var12].field2098.field3446 == var22 || arg5[var16][var9][var12].field2078 != null && arg5[var16][var9][var12].field2078.field3446 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class148 var23 = arg5[var16][var9][var12];
                            if (var23.field2086 != null) {
                                for (class480 var24 = var23.field2086; var24 != null; var24 = var24.field7058) {
                                    class431 var25 = var24.field7054;
                                    if (var25 instanceof class529) {
                                        class529 var26 = (class529) var25;
                                        int var27 = var26.method27(-75);
                                        int var28 = var26.method22((byte) -70);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var27 | var28 << 6;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class148 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field2086 != null) {
                            for (class480 var31 = var30.field2086; var31 != null; var31 = var31.field7058) {
                                class431 var32 = var31.field7054;
                                if (var32.field6340 != var32.field6332 || var32.field6339 != var32.field6337) {
                                    for (int var33 = var32.field6332; var33 <= var32.field6340; var33++) {
                                        for (int var34 = var32.field6339; var34 <= var32.field6337; var34++) {
                                            class232.field3411[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class232.field3411[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class131.field1899[class525.field7714 + 1].method430(var9, var12);
                    if (field1929[arg4] < var17) {
                        field1929[arg4] = var17;
                    }
                    int var18 = var9 << 7;
                    if (class516.field7605[arg4] > var18) {
                        class516.field7605[arg4] = var18;
                    } else if (class325.field4562[arg4] < var18) {
                        class325.field4562[arg4] = var18;
                    }
                    int var19 = var12 << 7;
                    if (class452.field6656[arg4] > var19) {
                        class452.field6656[arg4] = var19;
                    } else if (class393.field5784[arg4] < var19) {
                        class393.field5784[arg4] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class232.field3411[class525.field7714][var9 - 1][var12] != var6) {
                        class499.field7406[var35] = class244.method1606(class244.method1606(var9 - 1, 1179648), -754974720);
                        class291.field4179[var35] = class244.method1606(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class232.field3411[class525.field7714][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class457.field6713) {
                        if ((var9 - 1) >= 0 && class232.field3411[class525.field7714][var9 - 1][var12] != var6 && (class238.field3497[class525.field7714][var9][var12] & 0x4) == 0 && (class238.field3497[class525.field7714][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class499.field7406[var35] = class244.method1606(class244.method1606(1179648, var9 - 1), 1375731712);
                            class291.field4179[var35] = class244.method1606(var12, 1245184);
                            class232.field3411[class525.field7714][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class232.field3411[class525.field7714][var9][var12] != var6) {
                            class499.field7406[var35] = class244.method1606(318767104, class244.method1606(5373952, var9));
                            class291.field4179[var35] = class244.method1606(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3411[class525.field7714][var9][var12] = var6;
                        }
                        if (class397.field5828 > var9 + 1 && class232.field3411[class525.field7714][var9 + 1][var12] != var6 && (class238.field3497[class525.field7714][var9][var12] & 0x4) == 0 && (class238.field3497[class525.field7714][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class499.field7406[var35] = class244.method1606(class244.method1606(var9 + 1, 5373952), -1845493760);
                            class291.field4179[var35] = class244.method1606(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3411[class525.field7714][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class397.field5828 && class232.field3411[class525.field7714][var9 + 1][var12] != var6) {
                        class499.field7406[var35] = class244.method1606(1392508928, class244.method1606(var9 + 1, 9568256));
                        class291.field4179[var35] = class244.method1606(9633792, var12);
                        class232.field3411[class525.field7714][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class232.field3411[class525.field7714][var9 - 1][var12] != var6 && (class238.field3497[class525.field7714][var9][var12] & 0x4) == 0 && (class238.field3497[class525.field7714][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class499.field7406[var35] = class244.method1606(301989888, class244.method1606(13762560, var9 - 1));
                            class291.field4179[var35] = class244.method1606(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3411[class525.field7714][var9 - 1][var12] = var6;
                        }
                        if (class232.field3411[class525.field7714][var9][var12] != var6) {
                            class499.field7406[var35] = class244.method1606(class244.method1606(var9, 13762560), -1828716544);
                            class291.field4179[var35] = class244.method1606(13828096, var12);
                            class232.field3411[class525.field7714][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class397.field5828 && class232.field3411[class525.field7714][var9 + 1][var12] != var6 && (class238.field3497[class525.field7714][var9][var12] & 0x4) == 0 && (class238.field3497[class525.field7714][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class499.field7406[var35] = class244.method1606(-771751936, class244.method1606(9568256, var9 + 1));
                            class291.field4179[var35] = class244.method1606(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class232.field3411[class525.field7714][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (field1929[arg4] != -1000000) {
                field1929[arg4] += 10;
                class516.field7605[arg4] -= 50;
                class325.field4562[arg4] += 50;
                class393.field5784[arg4] += 50;
                class452.field6656[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 705)
    public class133() {
        this.field1918.field3269 = this.field1918;
        this.field1918.field3275 = this.field1918;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lvu;", line = 482)
    public final class223 method1014(int arg0) {
        field1924++;
        class223 var2 = this.field1918.field3275;
        if (this.field1918 == var2) {
            return null;
        }
        if (arg0 != 4095) {
            field1920 = null;
        }
        var2.method1525((byte) 96);
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLvu;)V", line = 503)
    public final void method1015(boolean arg0, class223 arg1) {
        field1937++;
        if (arg1.field3269 != null) {
            arg1.method1525((byte) -110);
        }
        arg1.field3275 = this.field1918;
        arg1.field3269 = this.field1918.field3269;
        if (arg0) {
            field1932 = true;
        }
        arg1.field3269.field3275 = arg1;
        arg1.field3275.field3269 = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V", line = 528)
    public final void method1016(int arg0) {
        while (true) {
            class223 var2 = this.field1918.field3275;
            if (this.field1918 == var2) {
                field1934++;
                this.field1935 = null;
                if (arg0 > -48) {
                    field1920 = null;
                    return;
                }
                return;
            }
            var2.method1525((byte) -100);
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lvu;", line = 560)
    public final class223 method1017(int arg0) {
        if (arg0 > -17) {
            return null;
        }
        field1923++;
        class223 var2 = this.field1918.field3269;
        if (this.field1918 == var2) {
            this.field1935 = null;
            return null;
        } else {
            this.field1935 = var2.field3269;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)Lvu;", line = 587)
    public final class223 method1018(int arg0) {
        field1925++;
        if (arg0 < 36) {
            return null;
        }
        class223 var2 = this.field1918.field3275;
        if (this.field1918 == var2) {
            this.field1935 = null;
            return null;
        } else {
            this.field1935 = var2.field3275;
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lvu;ZLpk;)V", line = 608)
    private final void method1019(class223 arg0, boolean arg1, class133 arg2) {
        field1931++;
        class223 var4 = this.field1918.field3269;
        this.field1918.field3269 = arg0.field3269;
        arg0.field3269.field3275 = this.field1918;
        if (!arg1 && this.field1918 != arg0) {
            arg0.field3269 = arg2.field1918.field3269;
            arg0.field3269.field3275 = arg0;
            arg2.field1918.field3269 = var4;
            var4.field3275 = arg2.field1918;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)I", line = 633)
    public static final int method1020(int arg0, boolean arg1) {
        field1936++;
        if (arg1) {
            field1920 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V", line = 649)
    public static void method1021(byte arg0) {
        field1940 = null;
        field1919 = null;
        field1929 = null;
        if (arg0 == -84) {
            field1920 = null;
            field1922 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Lvu;", line = 664)
    public final class223 method1022(byte arg0) {
        field1938++;
        class223 var2 = this.field1935;
        if (this.field1918 == var2) {
            this.field1935 = null;
            return null;
        } else {
            this.field1935 = var2.field3275;
            return arg0 == -112 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)Lvu;", line = 685)
    public final class223 method1023(byte arg0) {
        field1933++;
        class223 var2 = this.field1935;
        if (this.field1918 == var2) {
            this.field1935 = null;
            return null;
        }
        if (arg0 != 32) {
            method1012(false, 15, -117, -94, 3, -8, 22);
        }
        this.field1935 = var2.field3269;
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 714)
    public static final void method1024(boolean arg0) {
        field1930++;
        if (arg0 && class172.field2444 == 5) {
            class172.field2444 = 6;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)Z", line = 732)
    public final boolean method1025(byte arg0) {
        field1928++;
        if (arg0 > -121) {
            field1932 = true;
        }
        return this.field1918.field3275 == this.field1918;
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)I", line = 743)
    public final int method1026(int arg0) {
        field1921++;
        int var2 = arg0;
        for (class223 var3 = this.field1918.field3275; var3 != this.field1918; var3 = var3.field3275) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lpk;B)V", line = 764)
    public final void method1027(class133 arg0, byte arg1) {
        field1927++;
        if (arg1 <= -70) {
            this.method1019(this.field1918.field3275, false, arg0);
        }
    }
}
