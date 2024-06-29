import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class53 {

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    private int field650 = 0;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "[I")
    private int[] field655 = new int[8191];

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "[I")
    private int[] field647 = new int[1600];

    @OriginalMember(owner = "client!aea", name = "l", descriptor = "[[Lvia;")
    private class590[][] field652 = new class590[64][768];

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "[I")
    private int[] field660 = new int[64];

    @OriginalMember(owner = "client!aea", name = "p", descriptor = "[[Lvia;")
    private class590[][] field665 = new class590[1600][64];

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "Lgaa;")
    private class313 field657;

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "Lfk;")
    private class682 field659;

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "Lfk;")
    private class682 field661;

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "Llp;")
    private class414 field653;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field666 = new String[] { method555(method554("\u0014gwby")), method555(method554("\u0001<5 ")), method555(method554("\u000e,8b@G")), method555(method554("\u000e,8bGG")), method555(method554("\u000e,8bMG")), method555(method554("\u000e,8bEG")), method555(method554("\u000e,8b8\u0006'08:G")), method555(method554("\u000e,8bFG")), method555(method554("\u000e,8bCG")), method555(method554("\u000e,8bLG")), method555(method554("\u000e,8bAG")), method555(method554("\u000e,8bBG")) };

    @OriginalMember(owner = "client!aea", name = "r", descriptor = "[J")
    public static long[] field658 = new long[256];

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field646 = new String[] { method555(method554("%(7")), method555(method554("),;")), method555(method554("\"(+")), method555(method554(".9+")), method555(method554("\"( ")), method555(method554("%<7")), method555(method554("%<5")), method555(method554(".<>")), method555(method554("<,)")), method555(method554(" *-")), method555(method554("!&/")), method555(method554("+,:")) };

    @OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!aea", name = "q", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!aea", name = "o", descriptor = "Ltga;")
    public static class61 field664;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field658[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BLgca;)V", line = 4)
    public final void method545(byte arg0, class261 arg1) {
        try {
            int var3 = -119 % ((-arg0 - 6) / 49);
            field649++;
            this.field659.method3933((byte) -67, 786336, 24);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field666[8] + arg0 + ',' + (arg1 == null ? field666[1] : field666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(B)V", line = 14)
    public static void method546(byte arg0) {
        try {
            int var1 = -93 / ((arg0 - 16) / 43);
            field646 = null;
            field658 = null;
            field664 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field666[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "(BLgca;)V", line = 25)
    private final void method547(byte arg0, class261 arg1) {
        try {
            int var3 = 34 / ((9 - arg0) / 43);
            class126.field1822 = arg1.field4192;
            field662++;
            arg1.method2220((byte) -85);
            arg1.method2225(false, false);
            arg1.method2230((byte) 98, false);
            arg1.method2239(-19527);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field666[2] + arg0 + ',' + (arg1 == null ? field666[1] : field666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILgca;I)V", line = 40)
    private final void method548(int arg0, class261 arg1, int arg2) {
        try {
            field656++;
            int var4 = 0;
            class615 var5 = arg1.method2236(false);
            float var6 = var5.field8870;
            float var7 = var5.field8829;
            float var8 = var5.field8846;
            float var9 = var5.field8850;
            float var10 = var5.field8838;
            if (arg0 < 27) {
                method552((byte) 69);
            }
            float var11 = var5.field8830;
            float var12 = var6 + var9;
            float var13 = var7 + var10;
            float var14 = var8 + var11;
            float var15 = var6 - var9;
            float var16 = var7 - var10;
            float var17 = var8 - var11;
            float var18 = var9 - var6;
            float var19 = var10 - var7;
            float var20 = var11 - var8;
            Buffer var21 = this.field659.method3929(true, -31222);
            if (var21 != null) {
                Stream var22 = arg1.method2227(var21, (byte) 126);
                if (Stream.method5108()) {
                    for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                        int var49 = this.field647[var48] <= 64 ? this.field647[var48] : 64;
                        if (var49 > 0) {
                            for (int var50 = var49 - 1; var50 >= 0; var50--) {
                                class590 var51 = this.field665[var48][var50];
                                int var52 = var51.field8556;
                                byte var53 = (byte) (var52 >> 16);
                                byte var54 = (byte) (var52 >> 8);
                                byte var55 = (byte) var52;
                                byte var56 = (byte) (var52 >>> 24);
                                float var57 = (float) (var51.field8554 >> 12);
                                float var58 = (float) (var51.field8564 >> 12);
                                float var59 = (float) (var51.field8560 >> 12);
                                int var60 = var51.field8559 >> 12;
                                var22.method5109((float) (-var60) * var12 + var57);
                                var22.method5109((float) (-var60) * var13 + var58);
                                var22.method5109((float) (-var60) * var14 + var59);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var53, var54, var55, var56);
                                } else {
                                    var22.method5107(var53, var54, var55, var56);
                                }
                                var22.method5109(0.0F);
                                var22.method5109(0.0F);
                                var22.method5109((float) var60 * var15 + var57);
                                var22.method5109((float) var60 * var16 + var58);
                                var22.method5109((float) var60 * var17 + var59);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var53, var54, var55, var56);
                                } else {
                                    var22.method5107(var53, var54, var55, var56);
                                }
                                var22.method5109(1.0F);
                                var22.method5109(0.0F);
                                var22.method5109((float) var60 * var12 + var57);
                                var22.method5109((float) var60 * var13 + var58);
                                var22.method5109((float) var60 * var14 + var59);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var53, var54, var55, var56);
                                } else {
                                    var22.method5107(var53, var54, var55, var56);
                                }
                                var22.method5109(1.0F);
                                var22.method5109(1.0F);
                                var22.method5109((float) var60 * var18 + var57);
                                var22.method5109((float) var60 * var19 + var58);
                                var22.method5109((float) var60 * var20 + var59);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var53, var54, var55, var56);
                                } else {
                                    var22.method5107(var53, var54, var55, var56);
                                }
                                var22.method5109(0.0F);
                                var4++;
                                var22.method5109(1.0F);
                            }
                            if (this.field647[var48] > 64) {
                                int var61 = this.field647[var48] - 1 - 64;
                                for (int var62 = this.field660[var61] - 1; var62 >= 0; var62--) {
                                    class590 var63 = this.field652[var61][var62];
                                    int var64 = var63.field8556;
                                    byte var65 = (byte) (var64 >> 16);
                                    byte var66 = (byte) (var64 >> 8);
                                    byte var67 = (byte) var64;
                                    byte var68 = (byte) (var64 >>> 24);
                                    float var69 = (float) (var63.field8554 >> 12);
                                    float var70 = (float) (var63.field8564 >> 12);
                                    float var71 = (float) (var63.field8560 >> 12);
                                    int var72 = var63.field8559 >> 12;
                                    var22.method5109((float) (-var72) * var12 + var69);
                                    var22.method5109((float) (-var72) * var13 + var70);
                                    var22.method5109((float) (-var72) * var14 + var71);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var65, var66, var67, var68);
                                    } else {
                                        var22.method5107(var65, var66, var67, var68);
                                    }
                                    var22.method5109(0.0F);
                                    var22.method5109(0.0F);
                                    var22.method5109((float) var72 * var15 + var69);
                                    var22.method5109((float) var72 * var16 + var70);
                                    var22.method5109((float) var72 * var17 + var71);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var65, var66, var67, var68);
                                    } else {
                                        var22.method5107(var65, var66, var67, var68);
                                    }
                                    var22.method5109(1.0F);
                                    var22.method5109(0.0F);
                                    var22.method5109((float) var72 * var12 + var69);
                                    var22.method5109((float) var72 * var13 + var70);
                                    var22.method5109((float) var72 * var14 + var71);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var65, var66, var67, var68);
                                    } else {
                                        var22.method5107(var65, var66, var67, var68);
                                    }
                                    var22.method5109(1.0F);
                                    var22.method5109(1.0F);
                                    var22.method5109((float) var72 * var18 + var69);
                                    var22.method5109((float) var72 * var19 + var70);
                                    var22.method5109((float) var72 * var20 + var71);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var65, var66, var67, var68);
                                    } else {
                                        var22.method5107(var65, var66, var67, var68);
                                    }
                                    var22.method5109(0.0F);
                                    var4++;
                                    var22.method5109(1.0F);
                                }
                            }
                        }
                    }
                } else {
                    for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                        int var24 = this.field647[var23] > 64 ? 64 : this.field647[var23];
                        if (var24 > 0) {
                            for (int var25 = var24 - 1; var25 >= 0; var25--) {
                                class590 var26 = this.field665[var23][var25];
                                int var27 = var26.field8556;
                                byte var28 = (byte) (var27 >> 16);
                                byte var29 = (byte) (var27 >> 8);
                                byte var30 = (byte) var27;
                                byte var31 = (byte) (var27 >>> 24);
                                float var32 = (float) (var26.field8554 >> 12);
                                float var33 = (float) (var26.field8564 >> 12);
                                float var34 = (float) (var26.field8560 >> 12);
                                int var35 = var26.field8559 >> 12;
                                var22.method5106((float) (-var35) * var12 + var32);
                                var22.method5106((float) (-var35) * var13 + var33);
                                var22.method5106((float) (-var35) * var14 + var34);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var28, var29, var30, var31);
                                } else {
                                    var22.method5107(var28, var29, var30, var31);
                                }
                                var22.method5106(0.0F);
                                var22.method5106(0.0F);
                                var22.method5106((float) var35 * var15 + var32);
                                var22.method5106((float) var35 * var16 + var33);
                                var22.method5106((float) var35 * var17 + var34);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var28, var29, var30, var31);
                                } else {
                                    var22.method5107(var28, var29, var30, var31);
                                }
                                var22.method5106(1.0F);
                                var22.method5106(0.0F);
                                var22.method5106((float) var35 * var12 + var32);
                                var22.method5106((float) var35 * var13 + var33);
                                var22.method5106((float) var35 * var14 + var34);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var28, var29, var30, var31);
                                } else {
                                    var22.method5107(var28, var29, var30, var31);
                                }
                                var22.method5106(1.0F);
                                var22.method5106(1.0F);
                                var22.method5106((float) var35 * var18 + var32);
                                var22.method5106((float) var35 * var19 + var33);
                                var22.method5106((float) var35 * var20 + var34);
                                if (arg1.field4138 == 0) {
                                    var22.method5096(var28, var29, var30, var31);
                                } else {
                                    var22.method5107(var28, var29, var30, var31);
                                }
                                var22.method5106(0.0F);
                                var4++;
                                var22.method5106(1.0F);
                            }
                            if (this.field647[var23] > 64) {
                                int var36 = this.field647[var23] - 64 - 1;
                                for (int var37 = this.field660[var36] - 1; var37 >= 0; var37--) {
                                    class590 var38 = this.field652[var36][var37];
                                    int var39 = var38.field8556;
                                    byte var40 = (byte) (var39 >> 16);
                                    byte var41 = (byte) (var39 >> 8);
                                    byte var42 = (byte) var39;
                                    byte var43 = (byte) (var39 >>> 24);
                                    float var44 = (float) (var38.field8554 >> 12);
                                    float var45 = (float) (var38.field8564 >> 12);
                                    float var46 = (float) (var38.field8560 >> 12);
                                    int var47 = var38.field8559 >> 12;
                                    var22.method5106((float) (-var47) * var12 + var44);
                                    var22.method5106((float) (-var47) * var13 + var45);
                                    var22.method5106((float) (-var47) * var14 + var46);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var40, var41, var42, var43);
                                    } else {
                                        var22.method5107(var40, var41, var42, var43);
                                    }
                                    var22.method5106(0.0F);
                                    var22.method5106(0.0F);
                                    var22.method5106((float) var47 * var15 + var44);
                                    var22.method5106((float) var47 * var16 + var45);
                                    var22.method5106((float) var47 * var17 + var46);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var40, var41, var42, var43);
                                    } else {
                                        var22.method5107(var40, var41, var42, var43);
                                    }
                                    var22.method5106(1.0F);
                                    var22.method5106(0.0F);
                                    var22.method5106((float) var47 * var12 + var44);
                                    var22.method5106((float) var47 * var13 + var45);
                                    var22.method5106((float) var47 * var14 + var46);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var40, var41, var42, var43);
                                    } else {
                                        var22.method5107(var40, var41, var42, var43);
                                    }
                                    var22.method5106(1.0F);
                                    var22.method5106(1.0F);
                                    var22.method5106((float) var47 * var18 + var44);
                                    var22.method5106((float) var47 * var19 + var45);
                                    var22.method5106((float) var47 * var20 + var46);
                                    if (arg1.field4138 == 0) {
                                        var22.method5096(var40, var41, var42, var43);
                                    } else {
                                        var22.method5107(var40, var41, var42, var43);
                                    }
                                    var22.method5106(0.0F);
                                    var22.method5106(1.0F);
                                    var4++;
                                }
                            }
                        }
                    }
                }
                var22.method5097();
                if (this.field659.method3932((byte) -114)) {
                    arg1.method1036(this.field659, 0, 2);
                    arg1.method1036(this.field661, 1, 2);
                    arg1.method1042((byte) 123, this.field657);
                    arg1.method1064(var4 * 4, 0, (byte) -33, 0, class356.field5727, this.field653, var4 * 2);
                }
            }
        } catch (RuntimeException var74) {
            throw class590.method4333(var74, field666[11] + arg0 + ',' + (arg1 == null ? field666[1] : field666[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lgca;IB)V", line = 427)
    private final void method549(class261 arg0, int arg1, byte arg2) {
        try {
            if (arg2 > -122) {
                this.field665 = null;
            }
            class126.field1822 = arg0.field4192;
            field663++;
            arg0.method2259((byte) -64, (float) arg1);
            arg0.method2251(1);
            arg0.method2225(false, false);
            arg0.method2230((byte) 72, false);
            arg0.method2239(-19527);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field666[10] + (arg0 == null ? field666[1] : field666[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILgca;)V", line = 450)
    private final void method550(int arg0, class261 arg1) {
        try {
            int var3 = -19 % ((arg0 - 21) / 61);
            field651++;
            arg1.method2230((byte) 63, true);
            arg1.method2225(true, false);
            if (class126.field1822 != arg1.field4192) {
                arg1.method166(class126.field1822);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field666[5] + arg0 + ',' + (arg1 == null ? field666[1] : field666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V", line = 464)
    public final void method551(int arg0) {
        try {
            if (arg0 != 7654) {
                this.field657 = null;
            }
            this.field659.method981(1328);
            field648++;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field666[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Lnq;", line = 475)
    public static final class487 method552(byte arg0) {
        try {
            field654++;
            if (arg0 <= 22) {
                return null;
            } else if (class489.field7375 == 0) {
                return new class487();
            } else {
                return class759.field11156[--class489.field7375];
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field666[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Lgca;)V", line = 707)
    public class53(class261 arg0) {
        try {
            this.field657 = arg0.method1051(14, new class482[] { new class482(new class771[] { class771.field11297, class771.field11300, class771.field11304 }), new class482(class771.field11298) });
            this.field659 = arg0.method1030(true, false);
            this.field661 = arg0.method1030(false, false);
            this.field661.method3933((byte) -95, 393168, 12);
            this.field653 = arg0.method1077(-7930, false);
            this.field653.method980(49146, false);
            Buffer var2 = this.field653.method3305(99, true);
            if (var2 != null) {
                Stream var3 = arg0.method2227(var2, (byte) 81);
                if (Stream.method5108()) {
                    for (int var6 = 0; var6 < 8191; var6++) {
                        int var7 = var6 * 4;
                        var3.method5104(var7);
                        var3.method5104(var7 + 1);
                        var3.method5104(var7 + 2);
                        var3.method5104(var7 + 2);
                        var3.method5104(var7 + 3);
                        var3.method5104(var7);
                    }
                } else {
                    for (int var4 = 0; var4 < 8191; var4++) {
                        int var5 = var4 * 4;
                        var3.method5101(var5);
                        var3.method5101(var5 + 1);
                        var3.method5101(var5 + 2);
                        var3.method5101(var5 + 2);
                        var3.method5101(var5 + 3);
                        var3.method5101(var5);
                    }
                }
                var3.method5097();
                this.field653.method3307(124);
            }
            Buffer var8 = this.field661.method3929(true, -31222);
            if (var8 != null) {
                Stream var9 = arg0.method2227(var8, (byte) 67);
                if (Stream.method5108()) {
                    for (int var10 = 0; var10 < 8191; var10++) {
                        var9.method5109(0.0F);
                        var9.method5109(-1.0F);
                        var9.method5109(0.0F);
                        var9.method5109(0.0F);
                        var9.method5109(-1.0F);
                        var9.method5109(0.0F);
                        var9.method5109(0.0F);
                        var9.method5109(-1.0F);
                        var9.method5109(0.0F);
                        var9.method5109(0.0F);
                        var9.method5109(-1.0F);
                        var9.method5109(0.0F);
                    }
                } else {
                    for (int var11 = 0; var11 < 8191; var11++) {
                        var9.method5106(0.0F);
                        var9.method5106(-1.0F);
                        var9.method5106(0.0F);
                        var9.method5106(0.0F);
                        var9.method5106(-1.0F);
                        var9.method5106(0.0F);
                        var9.method5106(0.0F);
                        var9.method5106(-1.0F);
                        var9.method5106(0.0F);
                        var9.method5106(0.0F);
                        var9.method5106(-1.0F);
                        var9.method5106(0.0F);
                    }
                }
                var9.method5097();
                this.field661.method3932((byte) -114);
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field666[6] + (arg0 == null ? field666[1] : field666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Lgca;IZLsn;)V", line = 548)
    public final void method553(class261 arg0, int arg1, boolean arg2, class659 arg3) {
        try {
            field645++;
            if (arg0.field4133 != null) {
                if (arg1 < 0) {
                    this.method547((byte) 102, arg0);
                } else {
                    this.method549(arg0, arg1, (byte) -123);
                }
                float var5 = arg0.field4133.field8841;
                float var6 = arg0.field4133.field8822;
                float var7 = arg0.field4133.field8860;
                float var8 = arg0.field4133.field8864;
                try {
                    int var9 = 0;
                    int var10 = Integer.MAX_VALUE;
                    int var11 = 0;
                    class688 var12 = arg3.field9415.field7702;
                    for (class688 var13 = var12.field9939; var13 != var12; var13 = var13.field9939) {
                        class590 var14 = (class590) var13;
                        int var15 = (int) ((float) (var14.field8560 >> 12) * var7 + (float) (var14.field8564 >> 12) * var6 + (float) (var14.field8554 >> 12) * var5 + var8);
                        if (var10 > var15) {
                            var10 = var15;
                        }
                        this.field655[var9++] = var15;
                        if (var15 > var11) {
                            var11 = var15;
                        }
                    }
                    int var16 = var11 - var10;
                    int var17;
                    if (var16 + 2 > 1600) {
                        var17 = 1 - (class758.field11145 - class349.method2911(-62, var16));
                        var16 = (var16 >> var17) + 2;
                    } else {
                        var17 = 0;
                        var16 += 2;
                    }
                    class688 var18 = var12.field9939;
                    int var19 = 0;
                    int var20 = -2;
                    boolean var21 = arg2;
                    boolean var22 = true;
                    while (var12 != var18) {
                        this.field650 = 0;
                        for (int var23 = 0; var23 < var16; var23++) {
                            this.field647[var23] = 0;
                        }
                        for (int var24 = 0; var24 < 64; var24++) {
                            this.field660[var24] = 0;
                        }
                        while (var12 != var18) {
                            class590 var25 = (class590) var18;
                            if (var22) {
                                var20 = var25.field8566;
                                var21 = var25.field8565;
                                var22 = false;
                            }
                            if (var19 > 0 && (var25.field8566 != var20 || var25.field8565 != var21)) {
                                var22 = true;
                                break;
                            }
                            int var26 = this.field655[var19++] - var10 >> var17;
                            if (var26 < 1600) {
                                if (this.field647[var26] >= 64) {
                                    label125: {
                                        if (this.field647[var26] == 64) {
                                            if (this.field650 == 64) {
                                                break label125;
                                            }
                                            this.field647[var26] += this.field650++ + 1;
                                        }
                                        class590[] var30 = this.field652[this.field647[var26] - 65];
                                        int var10002 = this.field647[var26] - 65;
                                        int var10004 = this.field660[this.field647[var26] - 65];
                                        this.field660[var10002] = this.field660[this.field647[var26] - 65] + 1;
                                        var30[var10004] = var25;
                                    }
                                } else {
                                    this.field665[var26][this.field647[var26]++] = var25;
                                }
                            }
                            var18 = var18.field9939;
                        }
                        arg0.method2263(false, var20 < 0 ? -1 : var20, (byte) 93, false);
                        if (var21 && class126.field1822 != arg0.field4192) {
                            arg0.method166(class126.field1822);
                        } else if (arg0.field4192 != 1.0F) {
                            arg0.method166(1.0F);
                        }
                        this.method548(36, arg0, var16);
                    }
                } catch (Exception var28) {
                }
                this.method550(82, arg0);
            }
        } catch (RuntimeException var29) {
            throw class590.method4333(var29, field666[3] + (arg0 == null ? field666[1] : field666[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field666[1] : field666[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method554(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method555(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 73;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
