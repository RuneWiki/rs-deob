import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class445 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
    private int[] field6430 = new int[8191];

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "[[Ldg;")
    private class193[][] field6439 = new class193[1600][64];

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "[I")
    private int[] field6432 = new int[1600];

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    private int field6435 = 0;

    @OriginalMember(owner = "client!aq", name = "u", descriptor = "[[Ldg;")
    private class193[][] field6446 = new class193[64][768];

    @OriginalMember(owner = "client!aq", name = "w", descriptor = "[I")
    private int[] field6448 = new int[64];

    @OriginalMember(owner = "client!aq", name = "t", descriptor = "Ldt;")
    private class573 field6445;

    @OriginalMember(owner = "client!aq", name = "r", descriptor = "Lwf;")
    private class483 field6443;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "Lwf;")
    private class483 field6434;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "Leu;")
    private class175 field6436;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field6440 = 0;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "[Lri;")
    public static class414[] field6442 = new class414[75];

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!aq", name = "v", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!aq", name = "s", descriptor = "Lvo;")
    public static class345 field6444;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 4)
    public static void method2591(byte arg0) {
        field6442 = null;
        if (arg0 < 112) {
            method2600(103, -122);
        }
        field6444 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIBI)I", line = 17)
    public static final int method2592(int arg0, int arg1, byte arg2, int arg3) {
        field6431++;
        int var4 = 255 - arg3;
        int var5 = ((arg0 & 0xFF00) * arg3 & 0xFF0000 | (arg0 & 0xFF00FF) * arg3 & 0xFF00FF00) >>> 8;
        int var6 = -32 / ((-arg2 - 30) / 60);
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 31)
    public final void method2593(int arg0) {
        if (arg0 >= -23) {
            field6444 = null;
        }
        field6438++;
        this.field6443.method231((byte) -105);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnh;BI)V", line = 42)
    private final void method2594(class495 arg0, byte arg1, int arg2) {
        class277.field3930 = arg0.field7301;
        int var4 = 118 % ((-arg1 - 59) / 44);
        field6427++;
        arg0.method2935((float) arg2, false);
        arg0.method2904((byte) 38);
        arg0.method2944(false, -21729);
        arg0.method2931(-8193, false);
        arg0.method2962((byte) -67);
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lnh;)V", line = 1136)
    public class445(class495 arg0) {
        this.field6445 = arg0.method141(new class148[] { new class148(new class324[] { class324.field4509, class324.field4512, class324.field4514 }), new class148(class324.field4510) }, false);
        this.field6443 = arg0.method119(true, 0);
        this.field6434 = arg0.method119(false, 0);
        this.field6434.method535(14036, 393168, 12);
        this.field6436 = arg0.method115((byte) -7, false);
        this.field6436.method238(-22454, 49146);
        Buffer var2 = this.field6436.method1283((byte) 0, true);
        if (var2 != null) {
            Stream var3 = arg0.method2912(106, var2);
            if (Stream.method2042()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2036(var7);
                    var3.method2036(var7 + 1);
                    var3.method2036(var7 + 2);
                    var3.method2036(var7 + 2);
                    var3.method2036(var7 + 3);
                    var3.method2036(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2038(var5);
                    var3.method2038(var5 + 1);
                    var3.method2038(var5 + 2);
                    var3.method2038(var5 + 2);
                    var3.method2038(var5 + 3);
                    var3.method2038(var5);
                }
            }
            var3.method2034();
            this.field6436.method1284(-28439);
        }
        Buffer var8 = this.field6434.method532(true, (byte) 56);
        if (var8 != null) {
            Stream var9 = arg0.method2912(125, var8);
            if (Stream.method2042()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2037(0.0F);
                    var9.method2037(-1.0F);
                    var9.method2037(0.0F);
                    var9.method2037(0.0F);
                    var9.method2037(-1.0F);
                    var9.method2037(0.0F);
                    var9.method2037(0.0F);
                    var9.method2037(-1.0F);
                    var9.method2037(0.0F);
                    var9.method2037(0.0F);
                    var9.method2037(-1.0F);
                    var9.method2037(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2035(0.0F);
                    var9.method2035(-1.0F);
                    var9.method2035(0.0F);
                    var9.method2035(0.0F);
                    var9.method2035(-1.0F);
                    var9.method2035(0.0F);
                    var9.method2035(0.0F);
                    var9.method2035(-1.0F);
                    var9.method2035(0.0F);
                    var9.method2035(0.0F);
                    var9.method2035(-1.0F);
                    var9.method2035(0.0F);
                }
            }
            var9.method2034();
            this.field6434.method530(-14770);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLnh;)V", line = 63)
    private final void method2595(byte arg0, class495 arg1) {
        field6426++;
        class277.field3930 = arg1.field7301;
        arg1.method2942(-69);
        arg1.method2944(false, -21729);
        arg1.method2931(arg0 ^ 0xFFFFDF8A, false);
        if (arg0 != 117) {
            field6444 = null;
        }
        arg1.method2962((byte) 105);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnh;II)V", line = 78)
    private final void method2596(class495 arg0, int arg1, int arg2) {
        field6447++;
        int var4 = 0;
        class14 var5 = arg0.method2969(15475);
        float var6 = var5.field192;
        if (arg2 != 1) {
            return;
        }
        float var7 = var5.field190;
        float var8 = var5.field211;
        float var9 = var5.field214;
        float var10 = var5.field186;
        float var11 = var5.field204;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field6443.method532(true, (byte) 56);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2912(125, var21);
        if (Stream.method2042()) {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field6432[var23] <= 64 ? this.field6432[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class193 var38 = this.field6439[var23][var25];
                        int var39 = var38.field2996;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2998 >> 12);
                        float var45 = (float) (var38.field2994 >> 12);
                        float var46 = (float) (var38.field2992 >> 12);
                        int var47 = var38.field2987 >> 12;
                        var22.method2037((float) (-var47) * var12 + var44);
                        var22.method2037((float) (-var47) * var13 + var45);
                        var22.method2037((float) (-var47) * var14 + var46);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var40, var41, var42, var43);
                        } else {
                            var22.method2033(var40, var41, var42, var43);
                        }
                        var22.method2037(0.0F);
                        var22.method2037(0.0F);
                        var22.method2037((float) var47 * var15 + var44);
                        var22.method2037((float) var47 * var16 + var45);
                        var22.method2037((float) var47 * var17 + var46);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var40, var41, var42, var43);
                        } else {
                            var22.method2033(var40, var41, var42, var43);
                        }
                        var22.method2037(1.0F);
                        var22.method2037(0.0F);
                        var22.method2037((float) var47 * var12 + var44);
                        var22.method2037((float) var47 * var13 + var45);
                        var22.method2037((float) var47 * var14 + var46);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var40, var41, var42, var43);
                        } else {
                            var22.method2033(var40, var41, var42, var43);
                        }
                        var22.method2037(1.0F);
                        var22.method2037(1.0F);
                        var22.method2037((float) var47 * var18 + var44);
                        var22.method2037((float) var47 * var19 + var45);
                        var22.method2037((float) var47 * var20 + var46);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var40, var41, var42, var43);
                        } else {
                            var22.method2033(var40, var41, var42, var43);
                        }
                        var22.method2037(0.0F);
                        var4++;
                        var22.method2037(1.0F);
                    }
                    if (this.field6432[var23] > 64) {
                        int var26 = this.field6432[var23] - 1 - 64;
                        for (int var27 = this.field6448[var26] - 1; var27 >= 0; var27--) {
                            class193 var28 = this.field6446[var26][var27];
                            int var29 = var28.field2996;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2998 >> 12);
                            float var35 = (float) (var28.field2994 >> 12);
                            float var36 = (float) (var28.field2992 >> 12);
                            int var37 = var28.field2987 >> 12;
                            var22.method2037((float) (-var37) * var12 + var34);
                            var22.method2037((float) (-var37) * var13 + var35);
                            var22.method2037((float) (-var37) * var14 + var36);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var30, var31, var32, var33);
                            } else {
                                var22.method2033(var30, var31, var32, var33);
                            }
                            var22.method2037(0.0F);
                            var22.method2037(0.0F);
                            var22.method2037((float) var37 * var15 + var34);
                            var22.method2037((float) var37 * var16 + var35);
                            var22.method2037((float) var37 * var17 + var36);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var30, var31, var32, var33);
                            } else {
                                var22.method2033(var30, var31, var32, var33);
                            }
                            var22.method2037(1.0F);
                            var22.method2037(0.0F);
                            var22.method2037((float) var37 * var12 + var34);
                            var22.method2037((float) var37 * var13 + var35);
                            var22.method2037((float) var37 * var14 + var36);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var30, var31, var32, var33);
                            } else {
                                var22.method2033(var30, var31, var32, var33);
                            }
                            var22.method2037(1.0F);
                            var22.method2037(1.0F);
                            var22.method2037((float) var37 * var18 + var34);
                            var22.method2037((float) var37 * var19 + var35);
                            var22.method2037((float) var37 * var20 + var36);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var30, var31, var32, var33);
                            } else {
                                var22.method2033(var30, var31, var32, var33);
                            }
                            var22.method2037(0.0F);
                            var4++;
                            var22.method2037(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field6432[var48] <= 64 ? this.field6432[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class193 var63 = this.field6439[var48][var50];
                        int var64 = var63.field2996;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2998 >> 12);
                        float var70 = (float) (var63.field2994 >> 12);
                        float var71 = (float) (var63.field2992 >> 12);
                        int var72 = var63.field2987 >> 12;
                        var22.method2035((float) (-var72) * var12 + var69);
                        var22.method2035((float) (-var72) * var13 + var70);
                        var22.method2035((float) (-var72) * var14 + var71);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var65, var66, var67, var68);
                        } else {
                            var22.method2033(var65, var66, var67, var68);
                        }
                        var22.method2035(0.0F);
                        var22.method2035(0.0F);
                        var22.method2035((float) var72 * var15 + var69);
                        var22.method2035((float) var72 * var16 + var70);
                        var22.method2035((float) var72 * var17 + var71);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var65, var66, var67, var68);
                        } else {
                            var22.method2033(var65, var66, var67, var68);
                        }
                        var22.method2035(1.0F);
                        var22.method2035(0.0F);
                        var22.method2035((float) var72 * var12 + var69);
                        var22.method2035((float) var72 * var13 + var70);
                        var22.method2035((float) var72 * var14 + var71);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var65, var66, var67, var68);
                        } else {
                            var22.method2033(var65, var66, var67, var68);
                        }
                        var22.method2035(1.0F);
                        var22.method2035(1.0F);
                        var22.method2035((float) var72 * var18 + var69);
                        var22.method2035((float) var72 * var19 + var70);
                        var22.method2035((float) var72 * var20 + var71);
                        if (arg0.field7304 == 0) {
                            var22.method2039(var65, var66, var67, var68);
                        } else {
                            var22.method2033(var65, var66, var67, var68);
                        }
                        var22.method2035(0.0F);
                        var4++;
                        var22.method2035(1.0F);
                    }
                    if (this.field6432[var48] > 64) {
                        int var51 = this.field6432[var48] - 64 - 1;
                        for (int var52 = this.field6448[var51] - 1; var52 >= 0; var52--) {
                            class193 var53 = this.field6446[var51][var52];
                            int var54 = var53.field2996;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2998 >> 12);
                            float var60 = (float) (var53.field2994 >> 12);
                            float var61 = (float) (var53.field2992 >> 12);
                            int var62 = var53.field2987 >> 12;
                            var22.method2035((float) (-var62) * var12 + var59);
                            var22.method2035((float) (-var62) * var13 + var60);
                            var22.method2035((float) (-var62) * var14 + var61);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var55, var56, var57, var58);
                            } else {
                                var22.method2033(var55, var56, var57, var58);
                            }
                            var22.method2035(0.0F);
                            var22.method2035(0.0F);
                            var22.method2035((float) var62 * var15 + var59);
                            var22.method2035((float) var62 * var16 + var60);
                            var22.method2035((float) var62 * var17 + var61);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var55, var56, var57, var58);
                            } else {
                                var22.method2033(var55, var56, var57, var58);
                            }
                            var22.method2035(1.0F);
                            var22.method2035(0.0F);
                            var22.method2035((float) var62 * var12 + var59);
                            var22.method2035((float) var62 * var13 + var60);
                            var22.method2035((float) var62 * var14 + var61);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var55, var56, var57, var58);
                            } else {
                                var22.method2033(var55, var56, var57, var58);
                            }
                            var22.method2035(1.0F);
                            var22.method2035(1.0F);
                            var22.method2035((float) var62 * var18 + var59);
                            var22.method2035((float) var62 * var19 + var60);
                            var22.method2035((float) var62 * var20 + var61);
                            if (arg0.field7304 == 0) {
                                var22.method2039(var55, var56, var57, var58);
                            } else {
                                var22.method2033(var55, var56, var57, var58);
                            }
                            var22.method2035(0.0F);
                            var22.method2035(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2034();
        if (this.field6443.method530(-14770)) {
            arg0.method131(3438, this.field6443, 0);
            arg0.method131(3438, this.field6434, 1);
            arg0.method98((byte) 19, this.field6445);
            arg0.method116(var4 * 2, 0, var4 * 4, this.field6436, class334.field4660, (byte) -50, 0);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IBLnh;Lqg;)V", line = 464)
    public final void method2597(int arg0, byte arg1, class495 arg2, class272 arg3) {
        field6437++;
        if (arg2.field7274 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method2594(arg2, (byte) 72, arg0);
        } else {
            this.method2595((byte) 117, arg2);
        }
        float var5 = arg2.field7274.field182;
        float var6 = arg2.field7274.field191;
        float var7 = arg2.field7274.field229;
        float var8 = arg2.field7274.field187;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class264 var12 = arg3.field3898.field392;
            if (arg1 <= 122) {
                method2600(40, -118);
            }
            for (class264 var13 = var12.field3793; var13 != var12; var13 = var13.field3793) {
                class193 var14 = (class193) var13;
                int var15 = (int) ((float) (var14.field2992 >> 12) * var7 + (float) (var14.field2998 >> 12) * var5 + (float) (var14.field2994 >> 12) * var6 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
                this.field6430[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class122.method983(var16, -257) + 1 - class692.field9797;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class264 var19 = var12.field3793;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field6435 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field6432[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field6448[var24] = 0;
                }
                while (var12 != var19) {
                    class193 var25 = (class193) var19;
                    if (var22) {
                        var20 = var25.field2995;
                        var21 = var25.field2997;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field2995 != var20 || var25.field2997 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field6430[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field6432[var26] >= 64) {
                            label101: {
                                if (this.field6432[var26] == 64) {
                                    if (this.field6435 == 64) {
                                        break label101;
                                    }
                                    this.field6432[var26] += this.field6435++ + 1;
                                }
                                this.field6446[this.field6432[var26] - 64 - 1][this.field6448[this.field6432[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field6439[var26][this.field6432[var26]++] = var25;
                        }
                    }
                    var19 = var19.field3793;
                }
                arg2.method2922(var20 < 0 ? -1 : var20, -27382, false, false);
                if (var21 && class277.field3930 != arg2.field7301) {
                    arg2.method794(class277.field3930);
                } else if (arg2.field7301 != 1.0F) {
                    arg2.method794(1.0F);
                }
                this.method2596(arg2, var16, 1);
            }
        } catch (Exception var27) {
        }
        this.method2599(1, arg2);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lnea;IIIIIBIIIII)Z", line = 629)
    public static final boolean method2598(class538 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field6429++;
        int var12 = arg7;
        if (arg6 > -88) {
            field6440 = -69;
        }
        int var13 = arg11;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg7 - var14;
        int var17 = arg11 - var15;
        class83.field1265[var14][var15] = 99;
        class259.field3714[var14][var15] = 0;
        byte var18 = 0;
        int var19 = 0;
        class340.field4721[var18] = arg7;
        int var35 = var18 + 1;
        class25.field345[var18] = arg11;
        int[][] var20 = arg0.field7893;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class642.field9125 = var13;
                                    class372.field5164 = var12;
                                    return false;
                                }
                                var12 = class340.field4721[var19];
                                var13 = class25.field345[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg0.field7891;
                                var24 = var13 - arg0.field7908;
                                if (arg1 == -4) {
                                    if (arg5 == var12 && arg3 == var13) {
                                        class372.field5164 = var12;
                                        class642.field9125 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -3) {
                                    if (class550.method3231(100, arg9, var12, arg5, arg9, var13, arg10, arg4, arg3)) {
                                        class372.field5164 = var12;
                                        class642.field9125 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -2) {
                                    if (arg0.method3168(-40, arg3, var12, arg8, var13, arg4, arg9, arg9, arg5, arg10)) {
                                        class372.field5164 = var12;
                                        class642.field9125 = var13;
                                        return true;
                                    }
                                } else if (arg1 == -1) {
                                    if (arg0.method3166(var13, var12, arg4, arg10, true, arg5, arg8, arg3, arg9)) {
                                        class642.field9125 = var13;
                                        class372.field5164 = var12;
                                        return true;
                                    }
                                } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                                    if (arg0.method3156(var13, arg9, arg1, arg2, arg5, var12, arg3, -1)) {
                                        class642.field9125 = var13;
                                        class372.field5164 = var12;
                                        return true;
                                    }
                                } else if (arg0.method3154(-125, arg3, arg9, arg1, arg5, var13, arg2, var12)) {
                                    class642.field9125 = var13;
                                    class372.field5164 = var12;
                                    return true;
                                }
                                var26 = class259.field3714[var21][var22] + 1;
                                if (var21 > 0 && class83.field1265[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 - (1 - arg9)] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= (arg9 - 1)) {
                                            class340.field4721[var35] = var12 - 1;
                                            class25.field345[var35] = var13;
                                            class83.field1265[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class259.field3714[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var21 < (128 - arg9) && class83.field1265[var21 + 1][var22] == 0 && (var20[var23 + arg9][var24] & 0x60E40000) == 0 && (var20[arg9 + var23][arg9 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg9 - 1) {
                                            class340.field4721[var35] = var12 + 1;
                                            class25.field345[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class83.field1265[var21 + 1][var22] = 8;
                                            class259.field3714[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class83.field1265[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg9 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg9 - 1)) {
                                            class340.field4721[var35] = var12;
                                            class25.field345[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class83.field1265[var21][var22 - 1] = 1;
                                            class259.field3714[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg9 && class83.field1265[var21][var22 + 1] == 0 && (var20[var23][arg9 + var24] & 0x4E240000) == 0 && (var20[var23 - (1 - arg9)][arg9 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= (arg9 - 1)) {
                                            class340.field4721[var35] = var12;
                                            class25.field345[var35] = var13 + 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class83.field1265[var21][var22 + 1] = 4;
                                            class259.field3714[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg9 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class83.field1265[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 <= var31) {
                                            class340.field4721[var35] = var12 - 1;
                                            class25.field345[var35] = var13 - 1;
                                            class83.field1265[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class259.field3714[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg9) > var21 && var22 > 0 && class83.field1265[var21 + 1][var22 - 1] == 0 && (var20[arg9 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class340.field4721[var35] = var12 + 1;
                                            class25.field345[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class83.field1265[var21 + 1][var22 - 1] = 9;
                                            class259.field3714[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && (128 - arg9) > var22 && class83.field1265[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg9 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg9; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg9 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class340.field4721[var35] = var12 - 1;
                                    class25.field345[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class83.field1265[var21 - 1][var22 + 1] = 6;
                                    class259.field3714[var21 - 1][var22 + 1] = var26;
                                }
                            } while ((128 - arg9) <= var21);
                        } while (var22 >= 128 - arg9);
                    } while (class83.field1265[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg9 + var23][var24 + arg9] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg9; var34++) {
                    if ((var20[var23 + var34][var24 + arg9] & 0x7E240000) != 0 || (var20[arg9 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class340.field4721[var35] = var12 + 1;
                class25.field345[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class83.field1265[var21 + 1][var22 + 1] = 12;
                class259.field3714[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILnh;)V", line = 1071)
    private final void method2599(int arg0, class495 arg1) {
        if (arg0 != 1) {
            method2592(-11, -111, (byte) 74, 121);
        }
        arg1.method2931(-8193, true);
        field6441++;
        arg1.method2944(true, arg0 - 21730);
        if (class277.field3930 != arg1.field7301) {
            arg1.method794(class277.field3930);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(II)V", line = 1103)
    public static final void method2600(int arg0, int arg1) {
        class677.field9636 = new int[arg1];
        class301.field4225 = new int[arg1];
        field6433++;
        class213.field3240 = new int[arg1];
        class80.field1208 = new int[arg1];
        if (arg0 == -1) {
            class224.field3362 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(ILnh;)V", line = 1126)
    public final void method2601(int arg0, class495 arg1) {
        if (arg0 != 1) {
            this.field6448 = null;
        }
        field6428++;
        this.field6443.method535(14036, 786336, 24);
    }
}
