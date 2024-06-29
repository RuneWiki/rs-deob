import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class277 extends class154 {

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    private int field4900 = 4;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    private int field4907 = 4;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "Leg;")
    public static class37 field4901 = class174.method1167(" ", -48);

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "[I")
    public static int[] field4908 = new int[100];

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "Z")
    public static boolean field4910 = false;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "[Lja;")
    public static class105[] field4911;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I[BBI)Z")
    public static final boolean method1862(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field4906;
        boolean var4 = true;
        class187 var5 = new class187(arg1);
        int var6 = -1;
        int var7 = 120 / ((arg2 - 70) / 42);
        label56: while (true) {
            int var8 = var5.method1267(true);
            if (~var8 == -1) {
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var5.method1246(true);
                    if (var12 == 0) {
                        continue label56;
                    }
                    var9 += var12 + -1;
                    int var13 = var9 & 63;
                    int var14 = var5.method1268(255) >> 2;
                    int var15 = (var9 & 4059) >> 6;
                    int var16 = arg0 + var15;
                    int var17 = arg3 + var13;
                    if (var16 > 0 && var17 > 0 && ~var16 > -104 && var17 < 103) {
                        class133 var18 = class178.method1186(var6, 0);
                        if (~var14 != -23 || class271.field4754 || var18.field2294 != 0 || var18.field2254 == 1 || var18.field2231) {
                            if (!var18.method960(-122)) {
                                ++class137.field2353;
                                var4 = false;
                            }
                            var10 = true;
                        }
                    }
                }
                int var11 = var5.method1246(true);
                if (var11 == 0) {
                    break;
                }
                var5.method1268(255);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        ++field4904;
        int[] var3 = super.field2574.method206(arg0, arg1 + -1075952500);
        if (super.field2574.field536) {
            int var4 = class227.field3898 / this.field4907;
            int var5 = class110.field1847 / this.field4900;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method1052(0, 0, (byte) -96);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1052(0, class110.field1847 * var7 / var5, (byte) -48);
            }
            for (int var8 = 0; var8 < class227.field3898; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class227.field3898 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        if (arg1 != 1075962732) {
            method1864(-118, (class237) null, 32, 74, 25);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4911 = null;
        field4901 = null;
        field4908 = null;
        if (arg0 < 22) {
            method1864(-11, (class237) null, 8, -114, 76);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILpe;III)V")
    public static final void method1864(int arg0, class237 arg1, int arg2, int arg3, int arg4) {
        class126.method898((byte) 83);
        class122.method869(arg3, arg0, arg1.field4067 + arg3, arg1.field4206 + arg0);
        ++field4905;
        if (~class288.field5082 != -3 && class288.field5082 != 5 && class233.field4019 != null) {
            int var5 = 2047 & class279.field4933 + class25.field355;
            int var6 = class82.field1285.field1799 / 32 + 48;
            int var7 = -(class82.field1285.field1793 / 32) + 464;
            ((class195) class233.field4019).method1073(arg3, arg0, arg1.field4067, arg1.field4206, var6, var7, var5, class172.field2884 + 256, arg1.field4152, arg1.field4079);
            if (class27.field393 != null) {
                for (int var8 = 0; var8 < class27.field393.field74; ++var8) {
                    if (class27.field393.method28(-4676, var8)) {
                        int var9 = (class27.field393.field69[var8] + -class40.field642) * 4 - class82.field1285.field1799 / 32 + 2;
                        int var10 = class76.field1189[var5];
                        int var11 = class76.field1192[var5];
                        int var12 = (class27.field393.field68[var8] + -class144.field2456) * 4 + -(class82.field1285.field1793 / 32) + 2;
                        class183 var13 = class92.field1431;
                        int var14 = var11 * 256 / (class172.field2884 + 256);
                        int var15 = var10 * 256 / (class172.field2884 + 256);
                        int var16 = var9 * var15 + var12 * var14 >> 16;
                        int var17 = var12 * var15 + -(var9 * var14) >> 16;
                        if (~class27.field393.method30((byte) 74, var8) == -2) {
                            var13 = class109.field1810;
                        }
                        if (class27.field393.method30((byte) -107, var8) == 2) {
                            var13 = class180.field3002;
                        }
                        int var18 = var13.method1216(class27.field393.field67[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (~(-arg1.field4067) >= ~var19 && ~var19 >= ~arg1.field4067 && ~var17 <= ~(-arg1.field4206) && var17 <= arg1.field4206) {
                            int var20 = 16777215;
                            if (~class27.field393.field72[var8] != 0) {
                                var20 = class27.field393.field72[var8];
                            }
                            class122.method877(arg1.field4152, arg1.field4079);
                            var13.method1209(class27.field393.field67[var8], arg1.field4067 / 2 + arg3 + var19, arg1.field4206 / 2 + arg0 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            class122.method872();
                        }
                    }
                }
            }
            for (int var21 = 0; class259.field4585 > var21; ++var21) {
                int var56 = class236.field4062[var21] * 4 + 2 + -(class82.field1285.field1799 / 32);
                int var57 = class117.field1994[var21] * 4 + -(class82.field1285.field1793 / 32) - -2;
                class133 var58 = class178.method1186(class63.field1036[var21], 0);
                if (var58.field2303 != null) {
                    var58 = var58.method962(25);
                    if (var58 == null || var58.field2235 == -1) {
                        continue;
                    }
                }
                class10.method56(class171.field2878[var58.field2235], var56, arg3, arg0, 256, var57, arg1);
            }
            for (int var22 = 0; var22 < 104; ++var22) {
                for (int var52 = 0; var52 < 104; ++var52) {
                    class226 var53 = class210.field3621[class237.field4140][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + -(class82.field1285.field1799 / 32) + 2;
                        int var55 = var52 * 4 - -2 + -(class82.field1285.field1793 / 32);
                        class10.method56(field4911[0], var54, arg3, arg0, arg4 + 3343, var55, arg1);
                    }
                }
            }
            for (int var23 = 0; ~var23 > ~class46.field729; ++var23) {
                class163 var48 = class55.field833[class98.field1525[var23]];
                if (var48 != null && var48.method767(false)) {
                    class275 var49 = var48.field2691;
                    if (var49 != null && var49.field4888 != null) {
                        var49 = var49.method1854((byte) 68);
                    }
                    if (var49 != null && var49.field4879 && var49.field4851) {
                        int var50 = var48.field1793 / 32 + -(class82.field1285.field1793 / 32);
                        int var51 = var48.field1799 / 32 + -(class82.field1285.field1799 / 32);
                        if (var49.field4844 == -1) {
                            class10.method56(field4911[1], var51, arg3, arg0, 256, var50, arg1);
                        } else {
                            class10.method56(class171.field2878[var49.field4844], var51, arg3, arg0, 256, var50, arg1);
                        }
                    }
                }
            }
            for (int var24 = 0; ~class138.field2360 < ~var24; ++var24) {
                class188 var38 = class98.field1526[class285.field5020[var24]];
                if (var38 != null && var38.method767(false)) {
                    int var39 = var38.field1799 / 32 + -(class82.field1285.field1799 / 32);
                    int var40 = var38.field1793 / 32 + -(class82.field1285.field1793 / 32);
                    boolean var41 = false;
                    long var42 = var38.field3235.method217((byte) -102);
                    for (int var44 = 0; ~var44 > ~class242.field4363; ++var44) {
                        if (~class58.field941[var44] == ~var42 && ~class77.field1203[var44] != -1) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; ~class260.field4594 < ~var46; ++var46) {
                        if (~class281.field4955[var46].field1027 == ~var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class82.field1285.field3225 != 0 && ~var38.field3225 != -1 && ~class82.field1285.field3225 == ~var38.field3225) {
                        var47 = true;
                    }
                    if (!var41) {
                        if (!var45) {
                            if (!var47) {
                                class10.method56(field4911[2], var39, arg3, arg0, 256, var40, arg1);
                            } else {
                                class10.method56(field4911[4], var39, arg3, arg0, 256, var40, arg1);
                            }
                        } else {
                            class10.method56(field4911[5], var39, arg3, arg0, 256, var40, arg1);
                        }
                    } else {
                        class10.method56(field4911[3], var39, arg3, arg0, 256, var40, arg1);
                    }
                }
            }
            class134[] var25 = class61.field1001;
            for (int var26 = 0; var26 < var25.length; ++var26) {
                class134 var29 = var25[var26];
                if (var29 != null && var29.field2331 != 0 && class72.field1146 % 20 < 10) {
                    if (var29.field2331 == 1 && var29.field2335 >= 0 && var29.field2335 < class55.field833.length) {
                        class163 var30 = class55.field833[var29.field2335];
                        if (var30 != null) {
                            int var31 = var30.field1799 / 32 + -(class82.field1285.field1799 / 32);
                            int var32 = var30.field1793 / 32 + -(class82.field1285.field1793 / 32);
                            class151.method1034(arg0, arg1, arg3, var29.field2319, var32, 126, var31);
                        }
                    }
                    if (~var29.field2331 == -3) {
                        int var33 = (-class40.field642 + var29.field2330) * 4 + 2 + -(class82.field1285.field1799 / 32);
                        int var34 = (var29.field2324 - class144.field2456) * 4 + 2 + -(class82.field1285.field1793 / 32);
                        class151.method1034(arg0, arg1, arg3, var29.field2319, var34, 112, var33);
                    }
                    if (~var29.field2331 == -11 && ~var29.field2335 <= -1 && class98.field1526.length > var29.field2335) {
                        class188 var35 = class98.field1526[var29.field2335];
                        if (var35 != null) {
                            int var36 = var35.field1793 / 32 + -(class82.field1285.field1793 / 32);
                            int var37 = var35.field1799 / 32 + -(class82.field1285.field1799 / 32);
                            class151.method1034(arg0, arg1, arg3, var29.field2319, var36, -74, var37);
                        }
                    }
                }
            }
            if (~class73.field1159 != -1) {
                int var27 = class73.field1159 * 4 - class82.field1285.field1799 / 32 + 2;
                int var28 = class59.field975 * 4 + 2 + -(class82.field1285.field1793 / 32);
                class10.method56(class58.field931, var27, arg3, arg0, 256, var28, arg1);
            }
            class122.method873(arg3 - -(arg1.field4067 / 2) + -1, arg1.field4206 / 2 + arg0 + -1, 3, 3, 16777215);
        } else {
            class122.method874(arg3, arg0, 0, arg1.field4152, arg1.field4079);
        }
        if (arg4 != -3087) {
            method1864(-32, (class237) null, -57, -41, -53);
        }
        class255.field4528[arg2] = true;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class277() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field4900 = arg0.method1268(255);
                }
            } else {
                this.field4907 = arg0.method1268(255);
            }
            ++field4902;
        }
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V")
    public static final void method1865(int arg0) {
        ++field4913;
        if (arg0 != 2) {
            field4911 = null;
        }
        class238.field4233.method1409(94);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(BI)[[I")
    public final int[][] method193(byte arg0, int arg1) {
        ++field4903;
        int[][] var3 = super.field2585.method1532(arg1, -85);
        if (arg0 != 115) {
            return null;
        } else {
            if (super.field2585.field3761) {
                int var4 = class227.field3898 / this.field4907;
                int var5 = class110.field1847 / this.field4900;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method1054(arg0 + -115, 0, 0);
                } else {
                    int var7 = arg1 % var5;
                    var6 = this.method1054(arg0 ^ 115, 0, class110.field1847 * var7 / var5);
                }
                int[] var8 = var6[1];
                int[] var9 = var6[2];
                int[] var10 = var6[0];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; class227.field3898 > var14; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class227.field3898 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var10[var16];
                    var12[var14] = var8[var16];
                    var13[var14] = var9[var16];
                }
            }
            return var3;
        }
    }
}
