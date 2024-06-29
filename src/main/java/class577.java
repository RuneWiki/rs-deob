import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class577 {

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
    private int[] field8150 = new int[64];

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    private int field8149 = 0;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "[I")
    private int[] field8156 = new int[1600];

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "[[Lqja;")
    private class324[][] field8161 = new class324[64][768];

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
    private int[] field8159 = new int[8191];

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "[[Lqja;")
    private class324[][] field8162 = new class324[1600][64];

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lbw;")
    private class715 field8160;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lfka;")
    private class741 field8145;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lfka;")
    private class741 field8164;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lmq;")
    private class532 field8152;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Ldba;")
    public static class101 field8158 = new class101(6, 8);

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "F")
    public static float field8146;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field8153;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field8155;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwk;Lhea;II)V", line = 3)
    public final void method3346(class151 arg0, class443 arg1, int arg2, int arg3) {
        field8157++;
        if (arg0.field2123 == null) {
            return;
        }
        if (arg3 < 0) {
            this.method3350(1, arg0);
        } else {
            this.method3347(arg0, arg3, (byte) 18);
        }
        float var5 = arg0.field2123.field6645;
        float var6 = arg0.field2123.field6652;
        float var7 = arg0.field2123.field6654;
        float var8 = arg0.field2123.field6651;
        try {
            int var9 = -54 / ((arg2 - 11) / 46);
            int var10 = 0;
            int var11 = Integer.MAX_VALUE;
            int var12 = 0;
            class214 var13 = arg1.field6311.field1864;
            for (class214 var14 = var13.field3084; var14 != var13; var14 = var14.field3084) {
                class324 var15 = (class324) var14;
                int var16 = (int) ((float) (var15.field4855 >> 12) * var7 + (float) (var15.field4857 >> 12) * var6 + (float) (var15.field4854 >> 12) * var5 + var8);
                this.field8159[var10++] = var16;
                if (var12 < var16) {
                    var12 = var16;
                }
                if (var16 < var11) {
                    var11 = var16;
                }
            }
            int var17 = var12 - var11;
            int var18;
            if (var17 + 2 <= 1600) {
                var17 += 2;
                var18 = 0;
            } else {
                var18 = class305.method2009(var17, (byte) 63) + 1 - class145.field1843;
                var17 = (var17 >> var18) + 2;
            }
            class214 var19 = var13.field3084;
            int var20 = 0;
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var13 != var19) {
                this.field8149 = 0;
                for (int var24 = 0; var24 < var17; var24++) {
                    this.field8156[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field8150[var25] = 0;
                }
                while (var13 != var19) {
                    class324 var26 = (class324) var19;
                    if (var23) {
                        var23 = false;
                        var22 = var26.field4856;
                        var21 = var26.field4853;
                    }
                    if (var20 > 0 && (var26.field4853 != var21 || var26.field4856 != var22)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field8159[var20++] - var11 >> var18;
                    if (var27 < 1600) {
                        if (this.field8156[var27] >= 64) {
                            label102: {
                                if (this.field8156[var27] == 64) {
                                    if (this.field8149 == 64) {
                                        break label102;
                                    }
                                    this.field8156[var27] += (this.field8149++) + 1;
                                }
                                this.field8161[this.field8156[var27] - 65][this.field8150[this.field8156[var27] - 64 - 1]++] = var26;
                            }
                        } else {
                            this.field8162[var27][this.field8156[var27]++] = var26;
                        }
                    }
                    var19 = var19.field3084;
                }
                arg0.method1078(false, false, true, var21 >= 0 ? var21 : -1);
                if (var22 && class11.field240 != arg0.field2191) {
                    arg0.method506(class11.field240);
                } else if (arg0.field2191 != 1.0F) {
                    arg0.method506(1.0F);
                }
                this.method3354(arg0, var17, -1);
            }
        } catch (Exception var28) {
        }
        this.method3351((byte) -126, arg0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwk;IB)V", line = 163)
    private final void method3347(class151 arg0, int arg1, byte arg2) {
        field8151++;
        class11.field240 = arg0.field2191;
        arg0.method1120(16, (float) arg1);
        arg0.method1113(16);
        arg0.method1080(false, arg2 - 3680);
        arg0.method1171((byte) -124, false);
        if (arg2 == 18) {
            arg0.method1079(0);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 185)
    public static void method3348(int arg0) {
        if (arg0 == 64) {
            field8158 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLwk;)V", line = 197)
    public final void method3349(byte arg0, class151 arg1) {
        this.field8145.method3457(786336, 24, 3882);
        if (arg0 != -46) {
            this.method3350(-79, null);
        }
        field8147++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILwk;)V", line = 209)
    private final void method3350(int arg0, class151 arg1) {
        field8155++;
        class11.field240 = arg1.field2191;
        arg1.method1131((byte) 38);
        arg1.method1080(false, -3662);
        arg1.method1171((byte) -122, false);
        if (arg0 == 1) {
            arg1.method1079(arg0 - 1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lwk;)V", line = 686)
    public class577(class151 arg0) {
        this.field8160 = arg0.method1086(5678, new class491[] { new class491(new class652[] { class652.field9189, class652.field9192, class652.field9194 }), new class491(class652.field9191) });
        this.field8145 = arg0.method1139(6, true);
        this.field8164 = arg0.method1139(6, false);
        this.field8164.method3457(393168, 12, 3882);
        this.field8152 = arg0.method1045(false, (byte) 110);
        this.field8152.method50(false, 49146);
        Buffer var2 = this.field8152.method48((byte) -31, true);
        if (var2 != null) {
            Stream var3 = arg0.method1127(-104, var2);
            if (Stream.method3956()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3950(var7);
                    var3.method3950(var7 + 1);
                    var3.method3950(var7 + 2);
                    var3.method3950(var7 + 2);
                    var3.method3950(var7 + 3);
                    var3.method3950(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3962(var5);
                    var3.method3962(var5 + 1);
                    var3.method3962(var5 + 2);
                    var3.method3962(var5 + 2);
                    var3.method3962(var5 + 3);
                    var3.method3962(var5);
                }
            }
            var3.method3959();
            this.field8152.method49(-11488);
        }
        Buffer var8 = this.field8164.method3454(13952, true);
        if (var8 != null) {
            Stream var9 = arg0.method1127(-98, var8);
            if (Stream.method3956()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3955(0.0F);
                    var9.method3955(-1.0F);
                    var9.method3955(0.0F);
                    var9.method3955(0.0F);
                    var9.method3955(-1.0F);
                    var9.method3955(0.0F);
                    var9.method3955(0.0F);
                    var9.method3955(-1.0F);
                    var9.method3955(0.0F);
                    var9.method3955(0.0F);
                    var9.method3955(-1.0F);
                    var9.method3955(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3949(0.0F);
                    var9.method3949(-1.0F);
                    var9.method3949(0.0F);
                    var9.method3949(0.0F);
                    var9.method3949(-1.0F);
                    var9.method3949(0.0F);
                    var9.method3949(0.0F);
                    var9.method3949(-1.0F);
                    var9.method3949(0.0F);
                    var9.method3949(0.0F);
                    var9.method3949(-1.0F);
                    var9.method3949(0.0F);
                }
            }
            var9.method3959();
            this.field8164.method3456((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BLwk;)V", line = 240)
    private final void method3351(byte arg0, class151 arg1) {
        field8163++;
        if (arg0 != -126) {
            this.method3349((byte) -74, null);
        }
        arg1.method1171((byte) -125, true);
        arg1.method1080(true, arg0 ^ 0xE30);
        if (class11.field240 != arg1.field2191) {
            arg1.method506(class11.field240);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 257)
    public static final String method3352(String arg0, int arg1) {
        if (arg1 <= 35) {
            method3348(-99);
        }
        field8153++;
        String var2 = class418.method2500(class64.method388(arg0, (byte) -113), -24831);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V", line = 275)
    public final void method3353(boolean arg0) {
        this.field8145.method47((byte) -117);
        if (arg0) {
            this.method3349((byte) -26, null);
        }
        field8154++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lwk;II)V", line = 301)
    private final void method3354(class151 arg0, int arg1, int arg2) {
        field8148++;
        int var4 = 0;
        class468 var5 = arg0.method1168(arg2 ^ 0xFFFFFF80);
        float var6 = var5.field6643;
        float var7 = var5.field6667;
        float var8 = var5.field6646;
        if (arg2 != -1) {
            this.method3351((byte) -13, null);
        }
        float var9 = var5.field6656;
        float var10 = var5.field6644;
        float var11 = var5.field6666;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field8145.method3454(13952, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method1127(94, var21);
        if (Stream.method3956()) {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field8156[var23] > 64 ? 64 : this.field8156[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class324 var38 = this.field8162[var23][var25];
                        int var39 = var38.field4861;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field4854 >> 12);
                        float var45 = (float) (var38.field4857 >> 12);
                        float var46 = (float) (var38.field4855 >> 12);
                        int var47 = var38.field4860 >> 12;
                        var22.method3955((float) (-var47) * var12 + var44);
                        var22.method3955((float) (-var47) * var13 + var45);
                        var22.method3955((float) (-var47) * var14 + var46);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var40, var41, var42, var43);
                        } else {
                            var22.method3961(var40, var41, var42, var43);
                        }
                        var22.method3955(0.0F);
                        var22.method3955(0.0F);
                        var22.method3955((float) var47 * var15 + var44);
                        var22.method3955((float) var47 * var16 + var45);
                        var22.method3955((float) var47 * var17 + var46);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var40, var41, var42, var43);
                        } else {
                            var22.method3961(var40, var41, var42, var43);
                        }
                        var22.method3955(1.0F);
                        var22.method3955(0.0F);
                        var22.method3955((float) var47 * var12 + var44);
                        var22.method3955((float) var47 * var13 + var45);
                        var22.method3955((float) var47 * var14 + var46);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var40, var41, var42, var43);
                        } else {
                            var22.method3961(var40, var41, var42, var43);
                        }
                        var22.method3955(1.0F);
                        var22.method3955(1.0F);
                        var22.method3955((float) var47 * var18 + var44);
                        var22.method3955((float) var47 * var19 + var45);
                        var22.method3955((float) var47 * var20 + var46);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var40, var41, var42, var43);
                        } else {
                            var22.method3961(var40, var41, var42, var43);
                        }
                        var22.method3955(0.0F);
                        var22.method3955(1.0F);
                        var4++;
                    }
                    if (this.field8156[var23] > 64) {
                        int var26 = this.field8156[var23] - 64 - 1;
                        for (int var27 = this.field8150[var26] - 1; var27 >= 0; var27--) {
                            class324 var28 = this.field8161[var26][var27];
                            int var29 = var28.field4861;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field4854 >> 12);
                            float var35 = (float) (var28.field4857 >> 12);
                            float var36 = (float) (var28.field4855 >> 12);
                            int var37 = var28.field4860 >> 12;
                            var22.method3955((float) (-var37) * var12 + var34);
                            var22.method3955((float) (-var37) * var13 + var35);
                            var22.method3955((float) (-var37) * var14 + var36);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var30, var31, var32, var33);
                            } else {
                                var22.method3961(var30, var31, var32, var33);
                            }
                            var22.method3955(0.0F);
                            var22.method3955(0.0F);
                            var22.method3955((float) var37 * var15 + var34);
                            var22.method3955((float) var37 * var16 + var35);
                            var22.method3955((float) var37 * var17 + var36);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var30, var31, var32, var33);
                            } else {
                                var22.method3961(var30, var31, var32, var33);
                            }
                            var22.method3955(1.0F);
                            var22.method3955(0.0F);
                            var22.method3955((float) var37 * var12 + var34);
                            var22.method3955((float) var37 * var13 + var35);
                            var22.method3955((float) var37 * var14 + var36);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var30, var31, var32, var33);
                            } else {
                                var22.method3961(var30, var31, var32, var33);
                            }
                            var22.method3955(1.0F);
                            var22.method3955(1.0F);
                            var22.method3955((float) var37 * var18 + var34);
                            var22.method3955((float) var37 * var19 + var35);
                            var22.method3955((float) var37 * var20 + var36);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var30, var31, var32, var33);
                            } else {
                                var22.method3961(var30, var31, var32, var33);
                            }
                            var22.method3955(0.0F);
                            var22.method3955(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field8156[var48] > 64 ? 64 : this.field8156[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class324 var63 = this.field8162[var48][var50];
                        int var64 = var63.field4861;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field4854 >> 12);
                        float var70 = (float) (var63.field4857 >> 12);
                        float var71 = (float) (var63.field4855 >> 12);
                        int var72 = var63.field4860 >> 12;
                        var22.method3949((float) (-var72) * var12 + var69);
                        var22.method3949((float) (-var72) * var13 + var70);
                        var22.method3949((float) (-var72) * var14 + var71);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var65, var66, var67, var68);
                        } else {
                            var22.method3961(var65, var66, var67, var68);
                        }
                        var22.method3949(0.0F);
                        var22.method3949(0.0F);
                        var22.method3949((float) var72 * var15 + var69);
                        var22.method3949((float) var72 * var16 + var70);
                        var22.method3949((float) var72 * var17 + var71);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var65, var66, var67, var68);
                        } else {
                            var22.method3961(var65, var66, var67, var68);
                        }
                        var22.method3949(1.0F);
                        var22.method3949(0.0F);
                        var22.method3949((float) var72 * var12 + var69);
                        var22.method3949((float) var72 * var13 + var70);
                        var22.method3949((float) var72 * var14 + var71);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var65, var66, var67, var68);
                        } else {
                            var22.method3961(var65, var66, var67, var68);
                        }
                        var22.method3949(1.0F);
                        var22.method3949(1.0F);
                        var22.method3949((float) var72 * var18 + var69);
                        var22.method3949((float) var72 * var19 + var70);
                        var22.method3949((float) var72 * var20 + var71);
                        if (arg0.field2134 == 0) {
                            var22.method3953(var65, var66, var67, var68);
                        } else {
                            var22.method3961(var65, var66, var67, var68);
                        }
                        var22.method3949(0.0F);
                        var22.method3949(1.0F);
                        var4++;
                    }
                    if (this.field8156[var48] > 64) {
                        int var51 = this.field8156[var48] - 65;
                        for (int var52 = this.field8150[var51] - 1; var52 >= 0; var52--) {
                            class324 var53 = this.field8161[var51][var52];
                            int var54 = var53.field4861;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field4854 >> 12);
                            float var60 = (float) (var53.field4857 >> 12);
                            float var61 = (float) (var53.field4855 >> 12);
                            int var62 = var53.field4860 >> 12;
                            var22.method3949((float) (-var62) * var12 + var59);
                            var22.method3949((float) (-var62) * var13 + var60);
                            var22.method3949((float) (-var62) * var14 + var61);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var55, var56, var57, var58);
                            } else {
                                var22.method3961(var55, var56, var57, var58);
                            }
                            var22.method3949(0.0F);
                            var22.method3949(0.0F);
                            var22.method3949((float) var62 * var15 + var59);
                            var22.method3949((float) var62 * var16 + var60);
                            var22.method3949((float) var62 * var17 + var61);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var55, var56, var57, var58);
                            } else {
                                var22.method3961(var55, var56, var57, var58);
                            }
                            var22.method3949(1.0F);
                            var22.method3949(0.0F);
                            var22.method3949((float) var62 * var12 + var59);
                            var22.method3949((float) var62 * var13 + var60);
                            var22.method3949((float) var62 * var14 + var61);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var55, var56, var57, var58);
                            } else {
                                var22.method3961(var55, var56, var57, var58);
                            }
                            var22.method3949(1.0F);
                            var22.method3949(1.0F);
                            var22.method3949((float) var62 * var18 + var59);
                            var22.method3949((float) var62 * var19 + var60);
                            var22.method3949((float) var62 * var20 + var61);
                            if (arg0.field2134 == 0) {
                                var22.method3953(var55, var56, var57, var58);
                            } else {
                                var22.method3961(var55, var56, var57, var58);
                            }
                            var22.method3949(0.0F);
                            var4++;
                            var22.method3949(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3959();
        if (this.field8145.method3456((byte) 71)) {
            arg0.method1091((byte) 83, 0, this.field8145);
            arg0.method1091((byte) 84, 1, this.field8164);
            arg0.method1099(55, this.field8160);
            arg0.method1133(class415.field5856, 0, this.field8152, 0, var4 * 4, var4 * 2, 6);
        }
    }
}
