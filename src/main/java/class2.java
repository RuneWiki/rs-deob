import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class2 extends class241 {

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "[I")
    public int[] field36 = new int[5];

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "[Ltd;")
    public class70[] field37 = new class70[5];

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public int field41 = 0;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public int field33;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public int field29;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field20 = 10;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "J")
    public static long field23 = 0L;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "[Loh;")
    public static class263[] field30 = new class263[200];

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Loh;")
    public static class263 field26 = class253.method1681(-128, "k");

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Ljava/util/Random;")
    public static Random field22 = new Random();

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Loh;")
    public static class263 field49 = class253.method1681(-125, "Konfig geladen)3");

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field51 = 0;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Z")
    public static boolean field53 = false;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public int field31;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public int field35;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Lmj;")
    public class110 field40;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Lic;")
    public class138 field45;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "Ljg;")
    public class164 field50;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Laa;")
    public class165 field52;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lse;")
    public class200 field32;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "Lwd;")
    public class22 field43;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "Lud;")
    public class2 field48;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lue;")
    public static class86 field24;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Z")
    public boolean field34;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Z")
    public boolean field39;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Z")
    public boolean field44;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0 - arg8;
        field21++;
        if (arg6 != 16777215) {
            field22 = null;
        }
        if (arg0 < class8.field149) {
            var11++;
        }
        int var12 = arg3 - arg9;
        if (class112.field2110 > arg3) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg4 * var13 + arg2 >> 16;
            int var45 = (var13 + 1) * arg4 + arg2 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg8 + var13 >> 6;
                if (var47 >= 0 && (class136.field2490.length - 1) >= var47) {
                    int var48 = arg5 + var44;
                    int var49 = arg5 + var45;
                    int[][] var50 = class136.field2490[var47];
                    byte[][] var51 = class77.field1575[var47];
                    byte[][] var52 = class122.field2274[var47];
                    byte[][] var53 = class144.field2641[var47];
                    byte[][] var54 = class92.field1823[var47];
                    byte[][] var55 = class130.field2386[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg10 + (arg1 * var56) >> 16;
                        int var58 = (var56 + 1) * arg1 + arg10 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg7 + var58;
                            int var61 = arg8 + var13 & 0x3F;
                            int var62 = arg7 + var57;
                            int var63 = arg9 + var56 >> 6;
                            int var64 = var56 + arg9 & 0x3F;
                            int var65 = (var64 << 6) + var61;
                            int var66;
                            if (var63 < 0 || var63 > (var50.length - 1) || var50[var63] == null) {
                                if (class230.field4033.field3328 != -1) {
                                    var66 = class230.field4033.field3328;
                                } else if ((arg8 + var13 & 0x4) == (arg9 + var56 & 0x4)) {
                                    var66 = class82.field1638[class54.field1150 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var63 < 0 || var50.length - 1 < var63) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class133.method865(var48, var62, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var63][var65];
                            }
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            int var67 = var53[var63] == null ? 0 : class82.field1638[var53[var63][var65] & 0xFF];
                            int var68 = var51[var63] == null ? 0 : class82.field1638[var51[var63][var65] & 0xFF];
                            if (var68 == 0 && var67 == 0) {
                                class133.method865(var48, var62, var46, var59, var66);
                            } else {
                                if (var68 != 0) {
                                    if (var68 == -1) {
                                        var68 = 1;
                                    }
                                    byte var69 = var52[var63] == null ? 0 : var52[var63][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class133.method865(var48, var62, var46, var59, var68);
                                    } else {
                                        class130.method840(var59, var68, var48, var70 >> 2, (byte) 30, var69 & 0x3, class133.field2445, true, var46, var66, var62);
                                    }
                                }
                                if (var67 != 0) {
                                    byte var71 = var55[var63][var65];
                                    if (var67 == -1) {
                                        var67 = var66;
                                    }
                                    int var72 = var71 & 0xFC;
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class133.method865(var48, var62, var46, var59, var67);
                                    }
                                    class130.method840(var59, var67, var48, var72 >> 2, (byte) 30, var71 & 0x3, class133.field2445, var68 == 0, var46, 0, var62);
                                }
                            }
                            if (var54[var63] != null) {
                                int var73 = var54[var63][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var59 == 1) {
                                        var74 = var62;
                                    } else {
                                        var74 = var60 - 1;
                                    }
                                    int var75;
                                    if (var46 == 1) {
                                        var75 = var48;
                                    } else {
                                        var75 = var49 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var76 = 13369344;
                                        var73 -= 4;
                                    }
                                    if (var73 == 1) {
                                        class133.method872(var48, var62, var59, var76);
                                    } else if (var73 == 2) {
                                        class133.method871(var48, var62, var46, var76);
                                    } else if (var73 == 3) {
                                        class133.method872(var75, var62, var59, var76);
                                    } else if (var73 == 4) {
                                        class133.method871(var48, var74, var46, var76);
                                    } else if (var73 == 9) {
                                        class133.method872(var48, var62, var59, 16777215);
                                        class133.method871(var48, var62, var46, var76);
                                    } else if (var73 == 10) {
                                        class133.method872(var75, var62, var59, 16777215);
                                        class133.method871(var48, var62, var46, var76);
                                    } else if (var73 == 11) {
                                        class133.method872(var75, var62, var59, 16777215);
                                        class133.method871(var48, var74, var46, var76);
                                    } else if (var73 == 12) {
                                        class133.method872(var48, var62, var59, 16777215);
                                        class133.method871(var48, var74, var46, var76);
                                    } else if (var73 == 17) {
                                        class133.method871(var48, var62, 1, var76);
                                    } else if (var73 == 18) {
                                        class133.method871(var75, var62, 1, var76);
                                    } else if (var73 == 19) {
                                        class133.method871(var75, var74, 1, var76);
                                    } else if (var73 == 20) {
                                        class133.method871(var48, var74, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class133.method871(var48 + var77, -var77 + var74, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class133.method871(var48 + var78, var62 + var78, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var79 = arg5 + var44;
                    var10000 = arg5 + var45;
                    for (int var81 = 0; var81 < var12; var81++) {
                        int var82;
                        if (class230.field4033.field3328 != -1) {
                            var82 = class230.field4033.field3328;
                        } else if ((arg8 + var13 & 0x4) == (arg9 + var81 & 0x4)) {
                            var82 = class82.field1638[class54.field1150 + 1];
                        } else {
                            var82 = 4936552;
                        }
                        if (var82 == 0) {
                            var82 = 1;
                        }
                        int var83 = (arg1 * var81 + arg10 >> 16) + arg7;
                        int var84 = (arg10 + ((var81 + 1) * arg1) >> 16) + arg7;
                        int var85 = var84 - var83;
                        class133.method865(var79, var83, var46, var85, var82);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg4 * var14 + arg2 >> 16;
            int var16 = (var14 + 1) * arg4 + arg2 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg5 + var16;
                int var19 = arg5 + var15;
                int var20 = arg8 + var14 >> 6;
                if (var20 >= 0 && class50.field1084.length - 1 >= var20) {
                    short[][] var21 = class50.field1084[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg10 + (arg1 * var22) >> 16;
                        int var24 = (var22 + 1) * arg1 + arg10 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg7 + var23;
                            int var27 = arg9 + var22 >> 6;
                            var10000 = arg7 + var24;
                            if (var27 >= 0 && var27 <= (var21.length - 1)) {
                                int var29 = (arg9 + var22 & 0x3F << 6) + (arg8 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29] & 0x3FFF;
                                    int var31 = (var21[var27][var29] & 0xC366) >> 14;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class238.field4155[var30 - 1].field2203 * var17 / 4;
                                            int var33 = class238.field4155[var30 - 1].field2209 * var25 / 4;
                                            if (var32 != 0 && var33 != 0) {
                                                int var34 = class238.field4155[var30 - 1].field2213 * var25 / 4;
                                                class238.field4155[var30 - 1].method622(var19, var26 - var34, var32, var33);
                                            }
                                        } else if (var31 == 1) {
                                            int var35 = class6.field111[var30 - 1].field2203 * var17 / 4;
                                            int var36 = class6.field111[var30 - 1].field2209 * var25 / 4;
                                            if (var35 != 0 && var36 != 0) {
                                                int var37 = class6.field111[var30 - 1].field2213 * var25 / 4;
                                                class6.field111[var30 - 1].method622(var19, var26 - var37, var35, var36);
                                            }
                                        } else if (var31 == 2) {
                                            int var41 = class268.field4725[var30 - 1].field2209 * var25 / 4;
                                            int var42 = class268.field4725[var30 - 1].field2203 * var17 / 4;
                                            if (var42 != 0 && var41 != 0) {
                                                int var43 = class268.field4725[var30 - 1].field2213 * var25 / 4;
                                                class268.field4725[var30 - 1].method622(var19, var26 - var43, var42, var41);
                                            }
                                        } else if (var31 == 3) {
                                            int var38 = class21.field624[var30 - 1].field2203 * var17 / 4;
                                            int var39 = class21.field624[var30 - 1].field2209 * var25 / 4;
                                            if (var38 != 0 && var39 != 0) {
                                                int var40 = class21.field624[var30 - 1].field2213 * var25 / 4;
                                                class21.field624[var30 - 1].method622(var19, var26 - var40, var38, var39);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public static void method11(int arg0) {
        if (arg0 != 0) {
            field22 = null;
        }
        field22 = null;
        field49 = null;
        field24 = null;
        field26 = null;
        field30 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method12(int arg0, int arg1, int arg2) {
        int var3 = -19 % ((1 - arg2) / 58);
        if (class95.field1866 != 0 && arg1 != -1) {
            class237.method1586(false, arg1, class118.field2198, class95.field1866, 0, -128);
            class143.field2612 = true;
        }
        field25++;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(III)V")
    public class2(int arg0, int arg1, int arg2) {
        this.field47 = this.field33 = arg0;
        this.field29 = arg2;
        this.field28 = arg1;
    }
}
