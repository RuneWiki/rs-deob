import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class180 extends class235 {

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    private int field3254 = -32768;

    @OriginalMember(owner = "client!rb", name = "gb", descriptor = "Lv;")
    public static class218 field3257 = new class218();

    @OriginalMember(owner = "client!rb", name = "jb", descriptor = "Loc;")
    private static class151 field3260 = class137.method873(2, "Your account is already logged in)3");

    @OriginalMember(owner = "client!rb", name = "ob", descriptor = "Loc;")
    public static class151 field3265 = class137.method873(2, "rot:");

    @OriginalMember(owner = "client!rb", name = "ib", descriptor = "Loc;")
    public static class151 field3259 = field3260;

    @OriginalMember(owner = "client!rb", name = "lb", descriptor = "Loc;")
    public static class151 field3262 = class137.method873(2, ")3runescape)3com");

    @OriginalMember(owner = "client!rb", name = "pb", descriptor = "Loc;")
    public static class151 field3266 = class137.method873(2, "mapdots");

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!rb", name = "fb", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!rb", name = "hb", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!rb", name = "mb", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!rb", name = "kb", descriptor = "[I")
    public static int[] field3261;

    @OriginalMember(owner = "client!rb", name = "nb", descriptor = "[[[B")
    public static byte[][][] field3264;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field3255++;
        int var9 = arg2 - arg3;
        int var10 = arg0 - arg1;
        if (arg6) {
            return;
        }
        int var11 = (arg4 - arg7 << 16) / var10;
        if (class217.field3788 > arg0) {
            var10++;
        }
        int var12 = (arg8 - arg5 << 16) / var9;
        if (class27.field581 > arg2) {
            var9++;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            int var30 = var11 * var13 >> 16;
            int var31 = (var13 + 1) * var11 >> 16;
            int var32 = var31 - var30;
            if (var32 > 0) {
                int var33 = arg1 + var13 >> 6;
                int[][] var34 = class43.field883[var33];
                byte[][] var35 = field3264[var33];
                byte[][] var36 = class107.field1891[var33];
                byte[][] var37 = class160.field2900[var33];
                byte[][] var38 = class152.field2751[var33];
                int var39 = arg7 + var31;
                int var40 = arg7 + var30;
                byte[][] var41 = class166.field3007[var33];
                for (int var42 = 0; var42 < var9; var42++) {
                    int var43 = (var42 + 1) * var12 >> 16;
                    int var44 = var12 * var42 >> 16;
                    int var45 = var43 - var44;
                    if (var45 > 0) {
                        int var46 = arg5 + var43;
                        int var47 = arg5 + var44;
                        int var48 = arg3 + var42 >> 6;
                        int var49 = var42 + arg3 & 0x3F;
                        int var50 = arg1 + var13 & 0x3F;
                        int var51 = (var49 << 6) + var50;
                        int var52;
                        if (var34[var48] == null) {
                            int var53 = arg1 + var13 & 0x4;
                            int var54 = var42 + arg3 & 0x4;
                            if ((var53 >= 2 || var54 <= 2) && (var53 <= 2 || var54 >= 2)) {
                                var52 = class19.field396[class85.field1602 + 1];
                            } else {
                                var52 = 4936552;
                            }
                        } else {
                            var52 = var34[var48][var51];
                        }
                        int var55 = var36[var48] == null ? 0 : class19.field396[var36[var48][var51] & 0xFF];
                        int var56 = var37[var48] == null ? 0 : class19.field396[var37[var48][var51] & 0xFF];
                        if (var55 == 0 && var56 == 0) {
                            class221.method1375(var40, var47, var32, var45, var52);
                        } else {
                            if (var55 != 0) {
                                if (var55 == -1) {
                                    var55 = 1;
                                }
                                byte var57 = var35[var48] == null ? 0 : var35[var48][var51];
                                int var58 = var57 & 0xFC;
                                if (var58 == 0 || var32 <= 1 || var45 <= 1) {
                                    class221.method1375(var40, var47, var32, var45, var55);
                                } else {
                                    class110.method659(class221.field3834, var47, var57 & 0x3, var55, var45, var32, var52, true, 31, var40, var58 >> 2);
                                }
                            }
                            if (var56 != 0) {
                                byte var59 = var38[var48][var51];
                                if (var56 == -1) {
                                    var56 = var52;
                                }
                                int var60 = var59 & 0xFC;
                                if (var60 == 0 || var32 <= 1 || var45 <= 1) {
                                    class221.method1375(var40, var47, var32, var45, var56);
                                }
                                class110.method659(class221.field3834, var47, var59 & 0x3, var56, var45, var32, 0, var55 == 0, 107, var40, var60 >> 2);
                            }
                        }
                        if (var41[var48] != null) {
                            int var61 = var41[var48][var51] & 0xFF;
                            if (var61 != 0) {
                                int var62;
                                if (var32 == 1) {
                                    var62 = var40;
                                } else {
                                    var62 = var39 - 1;
                                }
                                int var63;
                                if (var45 == 1) {
                                    var63 = var47;
                                } else {
                                    var63 = var46 - 1;
                                }
                                int var64 = 13421772;
                                if (var61 >= 5 && var61 <= 8 || var61 >= 13 && var61 <= 16 || var61 >= 21 && var61 <= 24 || var61 == 27 || var61 == 28) {
                                    var64 = 13369344;
                                    var61 -= 4;
                                }
                                if (var61 == 1) {
                                    class221.method1392(var40, var47, var45, var64);
                                } else if (var61 == 2) {
                                    class221.method1373(var40, var47, var32, var64);
                                } else if (var61 == 3) {
                                    class221.method1392(var62, var47, var45, var64);
                                } else if (var61 == 4) {
                                    class221.method1373(var40, var63, var32, var64);
                                } else if (var61 == 9) {
                                    class221.method1392(var40, var47, var45, 16777215);
                                    class221.method1373(var40, var47, var32, var64);
                                } else if (var61 == 10) {
                                    class221.method1392(var62, var47, var45, 16777215);
                                    class221.method1373(var40, var47, var32, var64);
                                } else if (var61 == 11) {
                                    class221.method1392(var62, var47, var45, 16777215);
                                    class221.method1373(var40, var63, var32, var64);
                                } else if (var61 == 12) {
                                    class221.method1392(var40, var47, var45, 16777215);
                                    class221.method1373(var40, var63, var32, var64);
                                } else if (var61 == 17) {
                                    class221.method1373(var40, var47, 1, var64);
                                } else if (var61 == 18) {
                                    class221.method1373(var62, var47, 1, var64);
                                } else if (var61 == 19) {
                                    class221.method1373(var62, var63, 1, var64);
                                } else if (var61 == 20) {
                                    class221.method1373(var40, var63, 1, var64);
                                } else if (var61 == 25) {
                                    for (int var66 = 0; var66 < var45; var66++) {
                                        class221.method1373(var40 + var66, var63 - var66, 1, var64);
                                    }
                                } else if (var61 == 26) {
                                    for (int var65 = 0; var65 < var45; var65++) {
                                        class221.method1373(var40 + var65, var47 + var65, 1, var64);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var14 = 0; var14 < var10; var14++) {
            int var15 = (var14 + 1) * var11 >> 16;
            int var16 = var11 * var14 >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                int var18 = arg7 + var16;
                int var10000 = arg7 + var15;
                byte[][] var20 = class106.field1876[arg1 + var14 >> 6];
                for (int var21 = 0; var21 < var9; var21++) {
                    int var22 = var12 * var21 >> 16;
                    int var23 = (var21 + 1) * var12 >> 16;
                    int var24 = var23 - var22;
                    if (var24 > 0) {
                        int var25 = arg5 + var22;
                        var10000 = arg5 + var23;
                        int var27 = arg3 + var21 >> 6;
                        int var28 = ((arg3 + var21 & 0x3F) << 6) + (arg1 + var14 & 0x3F);
                        if (var20[var27] != null) {
                            int var29 = var20[var27][var28] & 0xFF;
                            if (var29 != 0) {
                                if (var29 == 47 || var29 == 53) {
                                    class123.field2195[var29 - 1].method225(var18, var25, var17 * 2 + 1, var24 * 2 + 1);
                                } else {
                                    class123.field2195[var29 - 1].method225(var18 - var17 / 2, -(var24 / 2) + var25, var17 * 2, var24 * 2);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "()I")
    public final int method74() {
        field3253++;
        return this.field3254;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method1139(boolean arg0) {
        field3262 = null;
        field3265 = null;
        if (!arg0) {
            return;
        }
        field3261 = null;
        field3259 = null;
        field3260 = null;
        field3264 = null;
        field3257 = null;
        field3266 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class18 var11 = class43.method311(this.field3256, 0).method86(null, (byte) -126, 0, this.field3252);
        field3263++;
        if (var11 != null) {
            var11.method72(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3254 = var11.method74();
        }
    }
}
