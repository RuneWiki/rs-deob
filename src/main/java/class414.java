import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class414 {

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public int field5969;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public int field5970;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public int field5974;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "I")
    public int field5975;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hs", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field5976;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "[Lae;")
    public static class27[] field5971;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        if (arg0 > -71) {
            field5971 = null;
        }
        field5971 = null;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)I")
    public static final int method2469(int arg0, int arg1) {
        field5972++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        if (arg1 != -15836) {
            field5971 = null;
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZILtq;)Z")
    public static final boolean method2470(boolean arg0, int arg1, class63 arg2) {
        field5967++;
        int var3 = (class379.field5642 - 104) / 2;
        int var4 = (class456.field6477 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class103.method775(arg1, var6, var51, var52, 2)) {
                        int var53 = var52;
                        if (class340.method2088(var51, (byte) -4, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class390.method2354(var53, var51, (byte) 85, var6);
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
        class44.field628 = arg2.method536(var7, 0, 512, 512, 512);
        class1.method6(-50);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10) | 0xFF000000;
        int var10 = (((int) (Math.random() * 20.0D)) + 238) - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class180.field2690][class180.field2690];
        for (int var13 = var3; var13 < var3 + 104; var13 += class180.field2690) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class180.field2690) {
                arg2.method500(0, 0, class180.field2690 * 4, class180.field2690 * 4);
                arg2.method589(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class180.field2690; var44++) {
                        for (int var50 = 0; var50 < class180.field2690; var50++) {
                            var12[var44][var50] = class103.method775(arg1, var13 + var44, var36 + var50, var37, 2);
                        }
                    }
                    class483.field6781[var37].method206(0, 0, 1024, var13, var36, class180.field2690 + var13, var36 - -class180.field2690, var12);
                    if (!class19.field252) {
                        for (int var45 = -4; var45 < class180.field2690; var45++) {
                            for (int var46 = -4; var46 < class180.field2690; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class103.method775(arg1, var47, var48, var37, 2)) {
                                    int var49 = var37;
                                    if (class340.method2088(var48, (byte) -4, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class204.method1389(var48, arg2, (class180.field2690 - var46) * 4 - 4, var45 * 4, var10, var47, var49, var9, 126);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class19.field252) {
                    class491 var38 = class183.field2717[arg1];
                    for (int var39 = 0; var39 < class180.field2690; var39++) {
                        for (int var40 = 0; var40 < class180.field2690; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field6890[var41 - var38.field6898][var42 - var38.field6904];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method530(4, -1713569622, (class180.field2690 - var40) * 4 - 4, (byte) 108, var39 * 4, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method582((class180.field2690 - var40) * 4 - 4, 4, -1713569622, var39 * 4, -15118);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method549(48, -1713569622, 4, (class180.field2690 - var40) * 4 - 4, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method582((class180.field2690 - var40) * 4 - 1, 4, -1713569622, var39 * 4, -15118);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method549(48, -1713569622, 4, (class180.field2690 - var40) * 4 - 4, var39 * 4);
                            }
                        }
                    }
                }
                arg2.method508(0, 0, class180.field2690 * 4, class180.field2690 * 4, var11, 2);
                class44.field628.method813(((var13 - var3) * 4) + 48, -(class180.field2690 * 4) + 464 + -((-var4 + var36) * 4), class180.field2690 * 4, class180.field2690 * 4, 0, 0);
            }
        }
        if (arg0) {
            method2468((byte) -23);
        }
        arg2.method493();
        arg2.method589(-16777215);
        class456.method2706((byte) 114);
        class332.field4967 = 0;
        class392.field5785.method2459(300);
        if (!class19.field252) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= arg1 + 1 && var21 <= 3; var21++) {
                        if (class103.method775(arg1, var14, var20, var21, 2)) {
                            class218 var22 = (class218) class487.method2848(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class218) class390.method2350(var21, var14, var20, field5976 == null ? (field5976 = method2472("ki")) : field5976);
                            }
                            if (var22 == null) {
                                var22 = (class218) class147.method1006(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class218) class115.method826(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class271 var23 = class206.field3124.method338((byte) 109, var22.method257(false));
                                if (!var23.field4077 || class198.field2979) {
                                    int var24 = var23.field4038;
                                    if (var23.field4015 != null) {
                                        for (int var25 = 0; var25 < var23.field4015.length; var25++) {
                                            if (var23.field4015[var25] != -1) {
                                                class271 var26 = class206.field3124.method338((byte) 120, var23.field4015[var25]);
                                                if (var26.field4038 >= 0) {
                                                    var24 = var26.field4038;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class94 var28 = class492.field6915.method1111(var24, -13516);
                                            if (var28 != null && var28.field1330) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class183.field2717[var21].field6890;
                                            int var32 = class183.field2717[var21].field6898;
                                            int var33 = class183.field2717[var21].field6904;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 104 - 1) > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - (var33 + 1)] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 103 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class358.field5441[class332.field4967] = var23.field4043;
                                        class402.field5874[class332.field4967] = var29;
                                        class165.field2299[class332.field4967] = var30;
                                        class332.field4967++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class203.field3087 != null) {
                class73.field983.field6378 = 1;
                class492.field6915.method1112(1024, 128, 64);
                for (int var15 = 0; var15 < class203.field3087.field6831; var15++) {
                    int var16 = class203.field3087.field6827[var15];
                    if (var16 >> 28 == class472.field6622.field4545) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class68.field922;
                        int var18 = (var16 & 0x3FFF) - class468.field6588;
                        if (var17 >= 0 && var17 < class379.field5642 && var18 >= 0 && var18 < class456.field6477) {
                            class392.field5785.method2453((byte) -124, new class145(var15));
                        } else {
                            class94 var19 = class492.field6915.method1111(class203.field3087.field6830[var15], -13516);
                            if (var19.field1316 != null && var19.field1323 + var17 >= 0 && var19.field1326 + var17 < class379.field5642 && var19.field1334 + var18 >= 0 && var19.field1309 + var18 < class456.field6477) {
                                class392.field5785.method2453((byte) -93, new class145(var15));
                            }
                        }
                    }
                }
                class492.field6915.method1112(128, 128, 64);
                class73.field983.field6378 = 2;
                class73.field983.method2674((byte) -102);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public static final void method2471(int arg0) {
        if (arg0 != 0) {
            field5971 = null;
        }
        class63.field869 = true;
        field5968++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2472(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
