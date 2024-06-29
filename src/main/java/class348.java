import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public abstract class class348 {

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[Let;")
    public static class274[] field4958 = new class274[29];

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "Lg;")
    public static class470 field4956;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field4961;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field4963;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "[[[I")
    public static int[][][] field4960;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V")
    public static void method2105(boolean arg0) {
        field4956 = null;
        field4958 = null;
        field4960 = null;
        field4961 = null;
        if (arg0) {
            method2105(true);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILoj;I)Z")
    public static final boolean method2106(int arg0, class280 arg1, int arg2) {
        field4959++;
        int var3 = (class159.field1895 - 104) / 2;
        int var4 = (class289.field4316 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class216.method1212(var51, var6, var52, arg2, arg0 + 16777216)) {
                        int var53 = var52;
                        if (class292.method1840(var6, (byte) 119, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class85.method436(var6, var53, var51, true);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class61.field758 = arg1.method1355(var7, 0, 512, 512, 512);
        class404.method2415((byte) -128);
        int var9 = 228 - (-((int) (Math.random() * 20.0D)) - (((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) - 10) + 238 << 16))) | arg0;
        int var10 = ((int) (Math.random() * 20.0D) + 228 | 0x817EFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class415.field6002][class415.field6002];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class415.field6002) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class415.field6002) {
                arg1.method1351(0, 0, class415.field6002 * 4, class415.field6002 * 4);
                arg1.method1444(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class415.field6002; var44++) {
                        for (int var50 = 0; var50 < class415.field6002; var50++) {
                            var12[var44][var50] = class216.method1212(var36 + var50, var13 + var44, var37, arg2, arg0 + 16777216);
                        }
                    }
                    class443.field6329[var37].method1862(0, 0, 1024, var13, var36, class415.field6002 + var13, class415.field6002 + var36, var12);
                    if (!class249.field3505) {
                        for (int var45 = -4; var45 < class415.field6002; var45++) {
                            for (int var46 = -4; var46 < class415.field6002; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class216.method1212(var48, var47, var37, arg2, 0)) {
                                    int var49 = var37;
                                    if (class292.method1840(var47, (byte) -81, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class484.method2860(var48, var47, (class415.field6002 - var46) * 4 - 4, var9, arg1, var10, (byte) 116, var45 * 4, var49);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class249.field3505) {
                    class424 var38 = class174.field2093[arg2];
                    for (int var39 = 0; var39 < class415.field6002; var39++) {
                        for (int var40 = 0; var40 < class415.field6002; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6118[var41 - var38.field6116][var42 - var38.field6121];
                            if ((var43 & 0x40240000) != 0) {
                                arg1.method1759(-6923, 4, 4, (class415.field6002 - var40) * 4 - 4, -1713569622, var39 * 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg1.method1756(-1713569622, var39 * 4, (class415.field6002 - var40) * 4 - 4, 4, 9);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg1.method1760((byte) 70, (class415.field6002 - var40) * 4 - 4, var39 * 4 + 3, -1713569622, 4);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg1.method1756(-1713569622, var39 * 4, (class415.field6002 - var40) * 4 + 3 - 4, 4, 9);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg1.method1760((byte) 86, (class415.field6002 - var40) * 4 - 4, var39 * 4, -1713569622, 4);
                            }
                        }
                    }
                }
                arg1.method1483(0, 0, class415.field6002 * 4, class415.field6002 * 4, var11, 2);
                class61.field758.method1963((var13 - var3) * 4 + 48, 464 - (-var4 + var36) * 4 + -(class415.field6002 * 4), class415.field6002 * 4, class415.field6002 * 4, 0, 0);
            }
        }
        arg1.method1352();
        arg1.method1444(-16777215);
        class415.method2469((byte) 121);
        class12.field183 = 0;
        class173.field2089.method813(arg0 + 16777216);
        if (!class249.field3505) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= arg2 + 1 && var21 <= 3; var21++) {
                        if (class216.method1212(var20, var14, var21, arg2, arg0 ^ 0xFF000000)) {
                            class116 var22 = (class116) class427.method2542(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class116) class263.method1603(var21, var14, var20, field4963 == null ? (field4963 = method2108("td")) : field4963);
                            }
                            if (var22 == null) {
                                var22 = (class116) class63.method320(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class116) class330.method2001(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class415 var23 = class173.field2084.method2297(50, var22.method16(false));
                                if (!var23.field5948 || class101.field1234) {
                                    int var24 = var23.field5946;
                                    if (var23.field5951 != null) {
                                        for (int var25 = 0; var25 < var23.field5951.length; var25++) {
                                            if (var23.field5951[var25] != -1) {
                                                class415 var26 = class173.field2084.method2297(50, var23.field5951[var25]);
                                                if (var26.field5946 >= 0) {
                                                    var24 = var26.field5946;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class334 var28 = class47.field611.method1898(36, var24);
                                            if (var28 != null && var28.field4824) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class174.field2093[var21].field6118;
                                            int var32 = class174.field2093[var21].field6116;
                                            int var33 = class174.field2093[var21].field6121;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 104 - 1) && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class397.field5639[class12.field183] = var23.field5918;
                                        class205.field2809[class12.field183] = var29;
                                        class412.field5863[class12.field183] = var30;
                                        class12.field183++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class340.field4883 != null) {
                class198.field2753.field6602 = 1;
                class47.field611.method1893(64, false, 1024);
                for (int var15 = 0; var15 < class340.field4883.field4630; var15++) {
                    int var16 = class340.field4883.field4633[var15];
                    if ((var16 >> 28) == class19.field258.field994) {
                        int var17 = ((var16 & 0xFFFC771) >> 14) - class93.field1163;
                        int var18 = (var16 & 0x3FFF) - class349.field5023;
                        if (var17 >= 0 && class159.field1895 > var17 && var18 >= 0 && var18 < class289.field4316) {
                            class173.field2089.method803(new class363(var15), 50);
                        } else {
                            class334 var19 = class47.field611.method1898(36, class340.field4883.field4627[var15]);
                            if (var19.field4782 != null && (var19.field4816 + var17) >= 0 && class159.field1895 > var17 + var19.field4811 && var19.field4812 + var18 >= 0 && class289.field4316 > var19.field4823 + var18) {
                                class173.field2089.method803(new class363(var15), 50);
                            }
                        }
                    }
                }
                class47.field611.method1893(64, false, 128);
                class198.field2753.field6602 = 2;
                class198.field2753.method2769(21354);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z")
    public abstract boolean method1919(int arg0);

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)I")
    public abstract int method1923(int arg0);

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)C")
    public abstract char method1918(int arg0);

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)J")
    public abstract long method1922(int arg0);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I")
    public abstract int method1921(byte arg0);

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)V")
    public static final void method2107(int arg0) {
        field4962++;
        if (class231.field3205.method1421()) {
            class458.method2697((byte) -42);
            class231.field3205.method1413(class126.field1542);
            class415.method2469((byte) 121);
        } else {
            class331.method2015((byte) -128, class375.field5347);
        }
        if (arg0 <= 123) {
            field4956 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2108(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
