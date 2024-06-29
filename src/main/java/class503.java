import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class503 {

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    private int field7123 = 0;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "[I")
    private int[] field7121 = new int[64];

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "[I")
    private int[] field7120 = new int[8191];

    @OriginalMember(owner = "client!iea", name = "i", descriptor = "[I")
    private int[] field7125 = new int[1600];

    @OriginalMember(owner = "client!iea", name = "t", descriptor = "[[Lon;")
    private class354[][] field7136 = new class354[64][768];

    @OriginalMember(owner = "client!iea", name = "p", descriptor = "[[Lon;")
    private class354[][] field7132 = new class354[1600][64];

    @OriginalMember(owner = "client!iea", name = "h", descriptor = "Lkq;")
    private class618 field7124;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "Lhl;")
    private class553 field7122;

    @OriginalMember(owner = "client!iea", name = "l", descriptor = "Lhl;")
    private class553 field7128;

    @OriginalMember(owner = "client!iea", name = "q", descriptor = "Ldk;")
    private class535 field7133;

    @OriginalMember(owner = "client!iea", name = "o", descriptor = "[I")
    public static int[] field7131 = new int[2];

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!iea", name = "j", descriptor = "I")
    public static int field7126;

    @OriginalMember(owner = "client!iea", name = "k", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!iea", name = "m", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!iea", name = "n", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!iea", name = "r", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!iea", name = "s", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!iea", name = "u", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "[Ljd;")
    public static class241[] field7118;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lpj;I)V")
    private final void method3035(class156 arg0, int arg1) {
        arg0.method1133(16, true);
        field7137++;
        int var3 = 94 / ((arg1 - 61) / 46);
        arg0.method1094(true, (byte) 120);
        if (class114.field1734 != arg0.field2399) {
            arg0.method515(class114.field1734);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V")
    public static void method3036(int arg0) {
        field7131 = null;
        field7118 = null;
        if (arg0 != 26412) {
            field7118 = null;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lpj;B)V")
    private final void method3037(class156 arg0, byte arg1) {
        class114.field1734 = arg0.field2399;
        field7117++;
        arg0.method1066((byte) 109);
        arg0.method1094(false, (byte) 125);
        arg0.method1133(arg1 + 136, false);
        arg0.method1088(12358);
        if (arg1 != -120) {
            method3043(3, 83);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lpj;BI)V")
    private final void method3038(class156 arg0, byte arg1, int arg2) {
        if (arg1 >= -56) {
            method3043(-72, -90);
        }
        field7126++;
        class114.field1734 = arg0.field2399;
        arg0.method1104((float) arg2, (byte) 30);
        arg0.method1077(0);
        arg0.method1094(false, (byte) 124);
        arg0.method1133(16, false);
        arg0.method1088(12358);
    }

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "(I)V")
    public final void method3039(int arg0) {
        if (arg0 != -28642) {
            this.field7128 = null;
        }
        field7127++;
        this.field7122.method602((byte) 41);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ILpj;)V")
    public final void method3040(int arg0, class156 arg1) {
        field7129++;
        if (arg0 > -85) {
            this.field7125 = null;
        }
        this.field7122.method679(786336, 24, true);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(ZILpj;)V")
    private final void method3041(boolean arg0, int arg1, class156 arg2) {
        field7135++;
        int var4 = 0;
        class385 var5 = arg2.method1127(88);
        float var6 = var5.field5344;
        float var7 = var5.field5327;
        float var8 = var5.field5303;
        float var9 = var5.field5313;
        float var10 = var5.field5321;
        float var11 = var5.field5329;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field7122.method676((byte) 88, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method1190(0, var21);
        if (Stream.method3953()) {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field7125[var23] > 64 ? 64 : this.field7125[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class354 var38 = this.field7132[var23][var25];
                        int var39 = var38.field4988;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field4979 >> 12);
                        float var45 = (float) (var38.field4976 >> 12);
                        float var46 = (float) (var38.field4986 >> 12);
                        int var47 = var38.field4985 >> 12;
                        var22.method3952((float) (-var47) * var12 + var44);
                        var22.method3952((float) (-var47) * var13 + var45);
                        var22.method3952((float) (-var47) * var14 + var46);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var40, var41, var42, var43);
                        } else {
                            var22.method3943(var40, var41, var42, var43);
                        }
                        var22.method3952(0.0F);
                        var22.method3952(0.0F);
                        var22.method3952((float) var47 * var15 + var44);
                        var22.method3952((float) var47 * var16 + var45);
                        var22.method3952((float) var47 * var17 + var46);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var40, var41, var42, var43);
                        } else {
                            var22.method3943(var40, var41, var42, var43);
                        }
                        var22.method3952(1.0F);
                        var22.method3952(0.0F);
                        var22.method3952((float) var47 * var12 + var44);
                        var22.method3952((float) var47 * var13 + var45);
                        var22.method3952((float) var47 * var14 + var46);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var40, var41, var42, var43);
                        } else {
                            var22.method3943(var40, var41, var42, var43);
                        }
                        var22.method3952(1.0F);
                        var22.method3952(1.0F);
                        var22.method3952((float) var47 * var18 + var44);
                        var22.method3952((float) var47 * var19 + var45);
                        var22.method3952((float) var47 * var20 + var46);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var40, var41, var42, var43);
                        } else {
                            var22.method3943(var40, var41, var42, var43);
                        }
                        var22.method3952(0.0F);
                        var22.method3952(1.0F);
                        var4++;
                    }
                    if (this.field7125[var23] > 64) {
                        int var26 = this.field7125[var23] - 1 - 64;
                        for (int var27 = this.field7121[var26] - 1; var27 >= 0; var27--) {
                            class354 var28 = this.field7136[var26][var27];
                            int var29 = var28.field4988;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field4979 >> 12);
                            float var35 = (float) (var28.field4976 >> 12);
                            float var36 = (float) (var28.field4986 >> 12);
                            int var37 = var28.field4985 >> 12;
                            var22.method3952((float) (-var37) * var12 + var34);
                            var22.method3952((float) (-var37) * var13 + var35);
                            var22.method3952((float) (-var37) * var14 + var36);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var30, var31, var32, var33);
                            } else {
                                var22.method3943(var30, var31, var32, var33);
                            }
                            var22.method3952(0.0F);
                            var22.method3952(0.0F);
                            var22.method3952((float) var37 * var15 + var34);
                            var22.method3952((float) var37 * var16 + var35);
                            var22.method3952((float) var37 * var17 + var36);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var30, var31, var32, var33);
                            } else {
                                var22.method3943(var30, var31, var32, var33);
                            }
                            var22.method3952(1.0F);
                            var22.method3952(0.0F);
                            var22.method3952((float) var37 * var12 + var34);
                            var22.method3952((float) var37 * var13 + var35);
                            var22.method3952((float) var37 * var14 + var36);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var30, var31, var32, var33);
                            } else {
                                var22.method3943(var30, var31, var32, var33);
                            }
                            var22.method3952(1.0F);
                            var22.method3952(1.0F);
                            var22.method3952((float) var37 * var18 + var34);
                            var22.method3952((float) var37 * var19 + var35);
                            var22.method3952((float) var37 * var20 + var36);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var30, var31, var32, var33);
                            } else {
                                var22.method3943(var30, var31, var32, var33);
                            }
                            var22.method3952(0.0F);
                            var4++;
                            var22.method3952(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field7125[var48] > 64 ? 64 : this.field7125[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class354 var63 = this.field7132[var48][var50];
                        int var64 = var63.field4988;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field4979 >> 12);
                        float var70 = (float) (var63.field4976 >> 12);
                        float var71 = (float) (var63.field4986 >> 12);
                        int var72 = var63.field4985 >> 12;
                        var22.method3949((float) (-var72) * var12 + var69);
                        var22.method3949((float) (-var72) * var13 + var70);
                        var22.method3949((float) (-var72) * var14 + var71);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var65, var66, var67, var68);
                        } else {
                            var22.method3943(var65, var66, var67, var68);
                        }
                        var22.method3949(0.0F);
                        var22.method3949(0.0F);
                        var22.method3949((float) var72 * var15 + var69);
                        var22.method3949((float) var72 * var16 + var70);
                        var22.method3949((float) var72 * var17 + var71);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var65, var66, var67, var68);
                        } else {
                            var22.method3943(var65, var66, var67, var68);
                        }
                        var22.method3949(1.0F);
                        var22.method3949(0.0F);
                        var22.method3949((float) var72 * var12 + var69);
                        var22.method3949((float) var72 * var13 + var70);
                        var22.method3949((float) var72 * var14 + var71);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var65, var66, var67, var68);
                        } else {
                            var22.method3943(var65, var66, var67, var68);
                        }
                        var22.method3949(1.0F);
                        var22.method3949(1.0F);
                        var22.method3949((float) var72 * var18 + var69);
                        var22.method3949((float) var72 * var19 + var70);
                        var22.method3949((float) var72 * var20 + var71);
                        if (arg2.field2443 == 0) {
                            var22.method3956(var65, var66, var67, var68);
                        } else {
                            var22.method3943(var65, var66, var67, var68);
                        }
                        var22.method3949(0.0F);
                        var4++;
                        var22.method3949(1.0F);
                    }
                    if (this.field7125[var48] > 64) {
                        int var51 = this.field7125[var48] - 65;
                        for (int var52 = this.field7121[var51] - 1; var52 >= 0; var52--) {
                            class354 var53 = this.field7136[var51][var52];
                            int var54 = var53.field4988;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field4979 >> 12);
                            float var60 = (float) (var53.field4976 >> 12);
                            float var61 = (float) (var53.field4986 >> 12);
                            int var62 = var53.field4985 >> 12;
                            var22.method3949((float) (-var62) * var12 + var59);
                            var22.method3949((float) (-var62) * var13 + var60);
                            var22.method3949((float) (-var62) * var14 + var61);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var55, var56, var57, var58);
                            } else {
                                var22.method3943(var55, var56, var57, var58);
                            }
                            var22.method3949(0.0F);
                            var22.method3949(0.0F);
                            var22.method3949((float) var62 * var15 + var59);
                            var22.method3949((float) var62 * var16 + var60);
                            var22.method3949((float) var62 * var17 + var61);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var55, var56, var57, var58);
                            } else {
                                var22.method3943(var55, var56, var57, var58);
                            }
                            var22.method3949(1.0F);
                            var22.method3949(0.0F);
                            var22.method3949((float) var62 * var12 + var59);
                            var22.method3949((float) var62 * var13 + var60);
                            var22.method3949((float) var62 * var14 + var61);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var55, var56, var57, var58);
                            } else {
                                var22.method3943(var55, var56, var57, var58);
                            }
                            var22.method3949(1.0F);
                            var22.method3949(1.0F);
                            var22.method3949((float) var62 * var18 + var59);
                            var22.method3949((float) var62 * var19 + var60);
                            var22.method3949((float) var62 * var20 + var61);
                            if (arg2.field2443 == 0) {
                                var22.method3956(var55, var56, var57, var58);
                            } else {
                                var22.method3943(var55, var56, var57, var58);
                            }
                            var22.method3949(0.0F);
                            var22.method3949(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        if (arg0) {
            this.field7121 = null;
        }
        var22.method3945();
        if (this.field7122.method678(14234)) {
            arg2.method1178(0, (byte) 97, this.field7122);
            arg2.method1178(1, (byte) 115, this.field7128);
            arg2.method1111((byte) 70, this.field7124);
            arg2.method1091(var4 * 2, this.field7133, 0, 0, var4 * 4, class207.field3204, (byte) -29);
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lkd;IBLpj;)V")
    public final void method3042(class296 arg0, int arg1, byte arg2, class156 arg3) {
        field7119++;
        if (arg3.field2390 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method3038(arg3, (byte) -118, arg1);
        } else {
            this.method3037(arg3, (byte) -120);
        }
        float var5 = arg3.field2390.field5307;
        float var6 = arg3.field2390.field5332;
        float var7 = arg3.field2390.field5308;
        float var8 = arg3.field2390.field5325;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class745 var12 = arg0.field4304.field10683;
            for (class745 var13 = var12.field10320; var13 != var12; var13 = var13.field10320) {
                class354 var14 = (class354) var13;
                int var15 = (int) ((float) (var14.field4986 >> 12) * var7 + (float) (var14.field4979 >> 12) * var5 + (float) (var14.field4976 >> 12) * var6 + var8);
                this.field7120[var9++] = var15;
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            if (arg2 >= -103) {
                return;
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class89.method668(var16, (byte) 45) + 1 - class313.field4465;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class745 var19 = var12.field10320;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field7123 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7125[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7121[var24] = 0;
                }
                while (var12 != var19) {
                    class354 var25 = (class354) var19;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field4982;
                        var20 = var25.field4987;
                    }
                    if (var18 > 0 && (var25.field4987 != var20 || var25.field4982 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7120[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7125[var26] < 64) {
                            this.field7132[var26][this.field7125[var26]++] = var25;
                        } else {
                            label105: {
                                if (this.field7125[var26] == 64) {
                                    if (this.field7123 == 64) {
                                        break label105;
                                    }
                                    this.field7125[var26] += (this.field7123++) + 1;
                                }
                                this.field7136[this.field7125[var26] - 1 - 64][this.field7121[this.field7125[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field10320;
                }
                arg3.method1073(false, var20 >= 0 ? var20 : -1, false, -1);
                if (var21 && class114.field1734 != arg3.field2399) {
                    arg3.method515(class114.field1734);
                } else if (arg3.field2399 != 1.0F) {
                    arg3.method515(1.0F);
                }
                this.method3041(false, var16, arg3);
            }
        } catch (Exception var27) {
        }
        this.method3035(arg3, 111);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(II)V")
    public static final void method3043(int arg0, int arg1) {
        class652 var2 = class670.field9316;
        synchronized (class670.field9316) {
            class670.field9316.method3741(arg0, 0);
        }
        field7130++;
        class652 var3 = class640.field8972;
        synchronized (class640.field8972) {
            class640.field8972.method3741(arg0, arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lpj;)V")
    public class503(class156 arg0) {
        this.field7124 = arg0.method1151(12, new class152[] { new class152(new class631[] { class631.field8865, class631.field8868, class631.field8870 }), new class152(class631.field8867) });
        this.field7122 = arg0.method1074((byte) 46, true);
        this.field7128 = arg0.method1074((byte) 46, false);
        this.field7128.method679(393168, 12, true);
        this.field7133 = arg0.method1184(2, false);
        this.field7133.method604(49146, 124);
        Buffer var2 = this.field7133.method605((byte) 97, true);
        if (var2 != null) {
            Stream var3 = arg0.method1190(0, var2);
            if (Stream.method3953()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3947(var5);
                    var3.method3947(var5 + 1);
                    var3.method3947(var5 + 2);
                    var3.method3947(var5 + 2);
                    var3.method3947(var5 + 3);
                    var3.method3947(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3954(var7);
                    var3.method3954(var7 + 1);
                    var3.method3954(var7 + 2);
                    var3.method3954(var7 + 2);
                    var3.method3954(var7 + 3);
                    var3.method3954(var7);
                }
            }
            var3.method3945();
            this.field7133.method601(-81);
        }
        Buffer var8 = this.field7128.method676((byte) -70, true);
        if (var8 != null) {
            Stream var9 = arg0.method1190(0, var8);
            if (Stream.method3953()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3952(0.0F);
                    var9.method3952(-1.0F);
                    var9.method3952(0.0F);
                    var9.method3952(0.0F);
                    var9.method3952(-1.0F);
                    var9.method3952(0.0F);
                    var9.method3952(0.0F);
                    var9.method3952(-1.0F);
                    var9.method3952(0.0F);
                    var9.method3952(0.0F);
                    var9.method3952(-1.0F);
                    var9.method3952(0.0F);
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
            var9.method3945();
            this.field7128.method678(14234);
        }
    }
}
