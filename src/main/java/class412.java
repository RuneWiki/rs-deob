import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class412 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    private int field5756 = -1;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    private int field5769 = 0;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lfi;")
    private class166 field5758 = new class166();

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "Z")
    public boolean field5771 = false;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    private int field5760;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    private int field5763;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "[Lij;")
    private class315[] field5765;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "[[[I")
    private int[][][] field5759;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5761 = "Loading title screen - ";

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5762 = "wave2:";

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5766;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Ldb;")
    public static class26 field5768;

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(III)V", line = 536)
    public class412(int arg0, int arg1, int arg2) {
        this.field5760 = arg0;
        this.field5763 = arg1;
        this.field5765 = new class315[this.field5763];
        this.field5759 = new int[this.field5760][3][arg2];
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)[[I", line = 10)
    public final int[][] method2549(int arg0, int arg1) {
        field5757++;
        if (arg1 != 0) {
            this.field5758 = null;
        }
        if (this.field5763 == this.field5760) {
            this.field5771 = this.field5765[arg0] == null;
            this.field5765[arg0] = class73.field1089;
            return this.field5759[arg0];
        } else if (this.field5760 == 1) {
            this.field5771 = this.field5756 != arg0;
            this.field5756 = arg0;
            return this.field5759[0];
        } else {
            class315 var3 = this.field5765[arg0];
            if (var3 == null) {
                this.field5771 = true;
                if (this.field5769 >= this.field5760) {
                    class315 var4 = (class315) this.field5758.method1252(15666);
                    var3 = new class315(arg0, var4.field4280);
                    this.field5765[var4.field4279] = null;
                    var4.method2367(5);
                } else {
                    var3 = new class315(arg0, this.field5769);
                    this.field5769++;
                }
                this.field5765[arg0] = var3;
            } else {
                this.field5771 = false;
            }
            this.field5758.method1244(true, var3);
            return this.field5759[var3.field4280];
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZI[[BILsa;[[ILsa;I[[BLpe;[[B[[B)V", line = 79)
    public static final void method2550(int arg0, boolean arg1, int arg2, byte[][] arg3, int arg4, class411 arg5, int[][] arg6, class411 arg7, int arg8, byte[][] arg9, class391 arg10, byte[][] arg11, byte[][] arg12) {
        if (arg4 >= -82) {
            return;
        }
        for (int var13 = 0; var13 < arg2; var13++) {
            for (int var14 = 0; var14 < arg0; var14++) {
                if (class339.method2153(9) || class113.method921(var13, var14, arg8, class329.field4471, false)) {
                    byte var15 = arg3[var13][var14];
                    byte var16 = arg11[var13][var14];
                    int var17 = arg9[var13][var14] & 0xFF;
                    int var18 = arg12[var13][var14] & 0xFF;
                    class36 var19 = var17 == 0 ? null : class382.method2374(var17 - 1, 123);
                    class101 var20 = var18 == 0 ? null : class447.method2790(var18 - 1, -123);
                    int var21 = 0;
                    int var22 = 0;
                    if (var15 != 0) {
                        var21 = var20 == null ? 0 : class442.field6368[var15];
                        var22 = var19 == null ? 0 : class126.field1757[var15];
                    } else if (var19 != null) {
                        var22 = class126.field1757[var15];
                    } else if (var20 != null) {
                        var21 = class126.field1757[var15];
                    }
                    int var23 = var21 + var22;
                    int var24 = 0;
                    if (var23 != 0) {
                        int[] var25 = new int[var23];
                        int[] var26 = new int[var23];
                        int[] var27 = new int[var23];
                        int[] var28 = new int[var23];
                        boolean var29 = false;
                        if (var19 == null || var19.field550 == -1 && var19.field564 == -1 && var19.field546 == -1) {
                            for (int var32 = 0; var32 < var22; var32++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var30 = arg10.method172() ? var19.field546 : var19.field549;
                            if (!class441.field6352) {
                                var30 = -1;
                            }
                            for (int var31 = 0; var31 < var22; var31++) {
                                var27[var24] = var30;
                                var28[var24] = var19.field555;
                                if (var19.field550 == -1) {
                                    var25[var24] = -1;
                                } else {
                                    var25[var24] = var19.field550;
                                }
                                if (var19.field564 == -1) {
                                    var26[var24] = -1;
                                } else {
                                    var29 = true;
                                    var26[var24] = var19.field564;
                                }
                                var24++;
                            }
                            if (!arg1 && arg8 == 0) {
                                class150.method1147(var13, var14, var19.field563, var19.field554 * 8);
                            }
                        }
                        if (!var29) {
                            var26 = null;
                        }
                        if (var20 == null) {
                            for (int var33 = 0; var33 < var21; var33++) {
                                var25[var24] = -1;
                                var24++;
                            }
                        } else {
                            int var34 = var20.field1503;
                            if (!class441.field6352) {
                                var34 = -1;
                            }
                            for (int var35 = 0; var35 < var21; var35++) {
                                var27[var24] = var34;
                                var28[var24] = var20.field1495;
                                var25[var24] = arg6[var13][var14];
                                if (var26 != null) {
                                    var26[var24] = -1;
                                }
                                var24++;
                            }
                        }
                        int var36 = class438.field6279.length;
                        int[] var37 = arg1 ? new int[var36] : null;
                        int[] var38 = new int[var36];
                        int[] var39 = new int[var36];
                        for (int var40 = 0; var40 < var36; var40++) {
                            int var48 = class438.field6279[var40];
                            int var49 = class68.field1027[var40];
                            if (var16 == 0) {
                                var38[var40] = var48;
                                var39[var40] = var49;
                            } else if (var16 == 1) {
                                var38[var40] = var49;
                                var39[var40] = 128 - var48;
                            } else if (var16 == 2) {
                                var38[var40] = 128 - var48;
                                var39[var40] = 128 - var49;
                            } else if (var16 == 3) {
                                var38[var40] = 128 - var49;
                                var39[var40] = var48;
                            }
                            if (arg1 && class291.field3947[var15][var40]) {
                                int var52 = (var13 << 7) + var38[var40];
                                int var53 = (var14 << 7) + var39[var40];
                                var37[var40] = arg5.method1515(var52, var53) - arg7.method1515(var52, var53);
                            }
                        }
                        int var41 = arg7.method1509(var13, var14);
                        int var42 = arg7.method1509(var13 + 1, var14);
                        int var43 = arg7.method1509(var13 + 1, var14 - -1);
                        int var44 = arg7.method1509(var13, var14 + 1);
                        if (arg8 > 0) {
                            boolean var45 = true;
                            if (var18 == 0 && var15 != 0) {
                                var45 = false;
                            }
                            if (var17 > 0 && var19 != null && !var19.field553) {
                                var45 = false;
                            }
                            if (var45 && var41 == var42 && var41 == var43 && var41 == var44) {
                                class277.field3734[arg8][var13][var14] = (byte) class260.method1678(class277.field3734[arg8][var13][var14], 4);
                            }
                        }
                        int var46 = 0;
                        int var47 = 0;
                        if (arg1) {
                            var46 = class276.method1768(var13, var14);
                            var47 = class68.method591(var13, var14);
                        }
                        arg7.method1514(var13, var14, var38, var37, var39, class334.field4528[var15], class417.field5845[var15], class209.field2898[var15], var25, var26, var27, var28, var46, var47, false);
                        class263.method1695(arg8, var13, var14);
                    }
                }
            }
        }
        field5770++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 360)
    public final void method2551(int arg0) {
        for (int var2 = 0; var2 < this.field5760; var2++) {
            this.field5759[var2][0] = null;
            this.field5759[var2][1] = null;
            this.field5759[var2][2] = null;
            this.field5759[var2] = null;
        }
        field5764++;
        this.field5765 = null;
        this.field5759 = null;
        this.field5758.method1250(10346);
        this.field5758 = null;
        if (arg0 > -117) {
            this.method2551(-97);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 407)
    public static void method2552(byte arg0) {
        field5762 = null;
        field5768 = null;
        if (arg0 <= -42) {
            field5761 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)[[[I", line = 422)
    public final int[][][] method2553(int arg0) {
        field5766++;
        if (this.field5763 != this.field5760) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 >= -118) {
            this.method2553(123);
        }
        for (int var2 = 0; var2 < this.field5760; var2++) {
            this.field5765[var2] = class73.field1089;
        }
        return this.field5759;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lpe;B)V", line = 444)
    public static final void method2554(class391 arg0, byte arg1) {
        field5767++;
        if (class415.field5808 < 2 && class363.field5021 == 0 && !class3.field16) {
            return;
        }
        String var2;
        if (class363.field5021 == 1 && class415.field5808 < 2) {
            var2 = class328.field4458 + class273.field3665 + class21.field390 + " ->";
        } else if (class3.field16 && class415.field5808 < 2) {
            var2 = class166.field2465 + class273.field3665 + class326.field4421 + " ->";
        } else if (class199.field2834 && class234.field3242[81] && class415.field5808 > 2) {
            var2 = class374.method2340((byte) -116, (class63) class268.field3613.field2454.field5348.field5348);
        } else {
            class63 var3 = (class63) class268.field3613.field2454.field5348;
            var2 = class374.method2340((byte) -116, var3);
            int[] var4 = null;
            if (class416.method2574(true, var3.field966)) {
                var4 = class234.method1569(2142, (int) var3.field957).field6567;
            } else if (class335.method2118(var3.field966, -14607)) {
                class127 var5 = class298.field4012[(int) var3.field957];
                if (var5 != null) {
                    var4 = var5.field1784.field164;
                }
            } else if (class352.method2228(true, var3.field966)) {
                if (var3.field966 == 1009) {
                    var4 = class10.method53((int) var3.field957, true).field5179;
                } else {
                    var4 = class10.method53((int) (var3.field957 >>> 32 & 0x7FFFFFFFL), true).field5179;
                }
            }
            if (var4 != null) {
                var2 = var2 + class330.method2104(var4, (byte) -125);
            }
        }
        if (class415.field5808 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class415.field5808 - 2) + class224.field3100;
        }
        if (arg1 >= 0) {
            return;
        }
        if (class172.field2517 != null) {
            class175 var6 = class172.field2517.method1100(true, arg0);
            if (var6 == null) {
                var6 = class96.field1387;
            }
            var6.method1310(class378.field5332, (byte) -118, var2, class172.field2517.field2083, class172.field2517.field2011, class101.field1490, class172.field2517.field1969, class172.field2517.field2027, class53.field872, class258.field3483, class255.field3452, class153.field2328, class172.field2517.field2035, class172.field2517.field2076, class243.field3360);
            class215.method1471(0, class153.field2328[1], class153.field2328[0], class153.field2328[2], class153.field2328[3]);
        } else if (class228.field3164 != null && class42.field640 == 0) {
            int var7 = class96.field1387.method1305(16777215, (byte) 126, class53.field872, class255.field3452, var2, class36.field557 + 4, class258.field3483, class243.field3360, 0, class443.field6390 + 16);
            class215.method1471(0, class443.field6390, class36.field557 + 4, class19.field375.method2060(var2, (byte) 36) + var7, 16);
        }
    }
}
