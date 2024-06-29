import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class128 extends class103 {

    @OriginalMember(owner = "client!vb", name = "cc", descriptor = "Z")
    private boolean field3081 = false;

    @OriginalMember(owner = "client!vb", name = "bc", descriptor = "I")
    private int field3080 = 0;

    @OriginalMember(owner = "client!vb", name = "Yb", descriptor = "I")
    private int field3077 = 0;

    @OriginalMember(owner = "client!vb", name = "lc", descriptor = "I")
    private int field3090;

    @OriginalMember(owner = "client!vb", name = "yb", descriptor = "I")
    private int field3051;

    @OriginalMember(owner = "client!vb", name = "Tb", descriptor = "I")
    private int field3072;

    @OriginalMember(owner = "client!vb", name = "Pb", descriptor = "I")
    public int field3068;

    @OriginalMember(owner = "client!vb", name = "zb", descriptor = "I")
    private int field3052;

    @OriginalMember(owner = "client!vb", name = "Xb", descriptor = "I")
    private int field3076;

    @OriginalMember(owner = "client!vb", name = "Ab", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!vb", name = "Rb", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!vb", name = "ec", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!vb", name = "mc", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!vb", name = "ic", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!vb", name = "Zb", descriptor = "Lm;")
    private class72 field3078;

    @OriginalMember(owner = "client!vb", name = "Db", descriptor = "I")
    public static int field3056 = 0;

    @OriginalMember(owner = "client!vb", name = "ub", descriptor = "[I")
    public static int[] field3047 = new int[1000];

    @OriginalMember(owner = "client!vb", name = "Fb", descriptor = "[I")
    public static int[] field3058 = new int[2000];

    @OriginalMember(owner = "client!vb", name = "Qb", descriptor = "Z")
    public static boolean field3069 = false;

    @OriginalMember(owner = "client!vb", name = "Vb", descriptor = "Lad;")
    private static class5 field3074 = class88.method674("cyan:", 61);

    @OriginalMember(owner = "client!vb", name = "Ub", descriptor = "I")
    public static int field3073 = -1;

    @OriginalMember(owner = "client!vb", name = "dc", descriptor = "Lad;")
    private static class5 field3082 = class88.method674("Loaded sprites", 100);

    @OriginalMember(owner = "client!vb", name = "gc", descriptor = "Lad;")
    public static class5 field3085 = class88.method674("::errortest", 100);

    @OriginalMember(owner = "client!vb", name = "fc", descriptor = "I")
    public static int field3084 = 0;

    @OriginalMember(owner = "client!vb", name = "Wb", descriptor = "Lad;")
    public static class5 field3075 = class88.method674("Weiter", -113);

    @OriginalMember(owner = "client!vb", name = "Eb", descriptor = "Lad;")
    public static class5 field3057 = field3074;

    @OriginalMember(owner = "client!vb", name = "Bb", descriptor = "Lad;")
    public static class5 field3054 = field3082;

    @OriginalMember(owner = "client!vb", name = "vb", descriptor = "D")
    private double field3048;

    @OriginalMember(owner = "client!vb", name = "xb", descriptor = "D")
    public double field3050;

    @OriginalMember(owner = "client!vb", name = "Cb", descriptor = "D")
    public double field3055;

    @OriginalMember(owner = "client!vb", name = "Gb", descriptor = "D")
    private double field3059;

    @OriginalMember(owner = "client!vb", name = "Ib", descriptor = "D")
    private double field3061;

    @OriginalMember(owner = "client!vb", name = "Lb", descriptor = "D")
    private double field3064;

    @OriginalMember(owner = "client!vb", name = "Mb", descriptor = "D")
    public double field3065;

    @OriginalMember(owner = "client!vb", name = "Ob", descriptor = "D")
    private double field3067;

    @OriginalMember(owner = "client!vb", name = "tb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!vb", name = "wb", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!vb", name = "Hb", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!vb", name = "Jb", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!vb", name = "Kb", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!vb", name = "Nb", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!vb", name = "Sb", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!vb", name = "ac", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!vb", name = "hc", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!vb", name = "jc", descriptor = "I")
    public int field3088;

    @OriginalMember(owner = "client!vb", name = "kc", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!vb", name = "nc", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V", line = 18)
    public static final void method986(int arg0) {
        field3046++;
        short var1 = 256;
        if (class94.field2231 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class94.field2231 > 768) {
                    class99.field2403[var2] = class70.method557((byte) 63, class116.field2871[var2], class17.field447[var2], 1024 - class94.field2231);
                } else if (class94.field2231 <= 256) {
                    class99.field2403[var2] = class70.method557((byte) 63, class17.field447[var2], class116.field2871[var2], 256 - class94.field2231);
                } else {
                    class99.field2403[var2] = class17.field447[var2];
                }
            }
        } else if (class121.field3003 <= 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                class99.field2403[var3] = class116.field2871[var3];
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class121.field3003 > 768) {
                    class99.field2403[var4] = class70.method557((byte) 63, class116.field2871[var4], class32.field779[var4], 1024 - class121.field3003);
                } else if (class121.field3003 > 256) {
                    class99.field2403[var4] = class32.field779[var4];
                } else {
                    class99.field2403[var4] = class70.method557((byte) 63, class32.field779[var4], class116.field2871[var4], 256 - class121.field3003);
                }
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class12.field361.field2757[var5] = class99.field2386.field3014[var5];
        }
        int var6 = 1152;
        int var7 = arg0;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * class60.field1483[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var7 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class56.field1395[var7++];
                if (var25 == 0) {
                    var6++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class99.field2403[var25];
                    int var29 = class12.field361.field2757[var6];
                    class12.field361.field2757[var6++] = class104.method832(var25 * class104.method832(var28, 16711935) + class104.method832(var29, 16711935) * var27, -16711936) + class104.method832(16711680, var27 * class104.method832(var29, 65280) + class104.method832(65280, var28) * var25) >> 8;
                }
            }
            var6 += var23;
        }
        int var9 = 0;
        for (int var10 = 0; var10 < 33920; var10++) {
            class47.field1225.field2757[var10] = class95.field2250.field3014[var10];
        }
        int var11 = 1176;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class60.field1483[var12] / var1;
            int var14 = 103 - var13;
            int var15 = var11 + var13;
            for (int var16 = 0; var16 < var14; var16++) {
                int var17 = class56.field1395[var9++];
                if (var17 == 0) {
                    var15++;
                } else {
                    int var18 = 256 - var17;
                    int var19 = class47.field1225.field2757[var15];
                    int var21 = class99.field2403[var17];
                    class47.field1225.field2757[var15++] = class104.method832(var18 * class104.method832(16711935, var19) + var17 * class104.method832(var21, 16711935), -16711936) + class104.method832(16711680, class104.method832(var21, 65280) * var17 + var18 * class104.method832(65280, var19)) >> 8;
                }
            }
            var9 += 128 - var14;
            var11 = var15 + 128 - var14 - var13;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)Lhc;", line = 182)
    public final class45 method30(byte arg0) {
        field3060++;
        class108 var2 = class52.method434(this.field3052, false);
        class45 var3 = var2.method879(-1, this.field3080);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -128 % ((-arg0 - 14) / 59);
            var3.method402(this.field3071);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V", line = 205)
    public static void method987(byte arg0) {
        field3054 = null;
        field3085 = null;
        field3074 = null;
        field3057 = null;
        field3058 = null;
        field3082 = null;
        field3047 = null;
        field3075 = null;
        if (arg0 != 77) {
            method987((byte) -34);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIII)V", line = 229)
    public final void method988(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3086++;
        if (!this.field3081) {
            double var6 = (double) (arg0 - this.field3090);
            double var8 = (double) (arg4 - this.field3072);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field3065 = (double) this.field3083 * var6 / var10 + (double) this.field3090;
            this.field3050 = this.field3076;
            this.field3055 = (double) this.field3083 * var8 / var10 + (double) this.field3072;
        }
        double var12 = (double) (this.field3087 + 1 - arg1);
        int var14 = -64 / ((arg3 - 52) / 51);
        this.field3067 = ((double) arg4 - this.field3055) / var12;
        this.field3059 = ((double) arg0 - this.field3065) / var12;
        this.field3064 = Math.sqrt(this.field3067 * this.field3067 + this.field3059 * this.field3059);
        if (!this.field3081) {
            this.field3061 = -this.field3064 * Math.tan((double) this.field3051 * 0.02454369D);
        }
        this.field3048 = ((double) arg2 - this.field3050 - this.field3061 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "(I)V", line = 272)
    public static final void method989(int arg0) {
        try {
            if (arg0 != 550) {
                field3056 = 71;
            }
            Graphics var1 = class9.field305.getGraphics();
            class101.field2461.method253(4, var1, false, 550);
        } catch (Exception var2) {
            class9.field305.repaint();
        }
        field3066++;
    }

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "(I)Z", line = 293)
    public static final boolean method990(int arg0) {
        field3092++;
        if (arg0 != 25140) {
            return true;
        }
        long var1 = class95.method728(128);
        int var3 = (int) (var1 - class19.field512);
        if (var3 > 200) {
            var3 = 200;
        }
        class19.field512 = var1;
        class95.field2274 += var3;
        if (class79.field1873 == 0 && class50.field1288 == 0 && class9.field314 == 0 && field3056 == 0) {
            return true;
        } else if (class60.field1464 == null) {
            return false;
        } else {
            try {
                if (class95.field2274 > 30000) {
                    throw new IOException();
                }
                while (class50.field1288 < 20 && field3056 > 0) {
                    class109 var4 = (class109) class61.field1503.method405(8853);
                    class39 var5 = new class39(4);
                    var5.method307(-388270616, 1);
                    var5.method325(255, (int) var4.field363);
                    class60.field1464.method349(0, -1, 4, var5.field974);
                    class43.field1091.method403(var4.field363, var4, true);
                    class50.field1288++;
                    field3056--;
                }
                while (class79.field1873 < 20 && class9.field314 > 0) {
                    class109 var6 = (class109) class56.field1393.method661((byte) -56);
                    class39 var7 = new class39(4);
                    var7.method307(-388270616, 0);
                    var7.method325(255, (int) var6.field363);
                    class60.field1464.method349(0, -1, 4, var7.field974);
                    var6.method355(arg0 ^ 0xE05B3F04);
                    class32.field785.method403(var6.field363, var6, true);
                    class79.field1873++;
                    class9.field314--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class60.field1464.method348(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class95.field2274 = 0;
                    byte var10 = 0;
                    if (class99.field2397 == null) {
                        var10 = 8;
                    } else if (class121.field3004 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class77.field1813.field974.length - class99.field2397.field2737;
                        int var12 = 512 - class121.field3004;
                        if (var12 > var11 - class77.field1813.field957) {
                            var12 = var11 - class77.field1813.field957;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class60.field1464.method344(class77.field1813.field957, var12, class77.field1813.field974, -122);
                        if (class112.field2815 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class77.field1813.field974[class77.field1813.field957 + var13] = (byte) class40.method347(class77.field1813.field974[class77.field1813.field957 + var13], class112.field2815);
                            }
                        }
                        class77.field1813.field957 += var12;
                        class121.field3004 += var12;
                        if (class77.field1813.field957 == var11) {
                            if (class99.field2397.field363 == 16711935L) {
                                class1.field8 = class77.field1813;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class116 var15 = class94.field2223[var14];
                                    if (var15 != null) {
                                        class1.field8.field957 = var14 * 4 + 5;
                                        int var16 = class1.field8.method322((byte) -118);
                                        var15.method923(var16, (byte) 1);
                                    }
                                }
                            } else {
                                class23.field597.reset();
                                class23.field597.update(class77.field1813.field974, 0, var11);
                                int var17 = (int) class23.field597.getValue();
                                if (class99.field2397.field2730 != var17) {
                                    try {
                                        class60.field1464.method350(-5918);
                                    } catch (Exception var29) {
                                    }
                                    class112.field2815 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class60.field1464 = null;
                                    class21.field544++;
                                    return false;
                                }
                                class21.field544 = 0;
                                class35.field893 = 0;
                                class99.field2397.field2739.method920((class99.field2397.field363 & 0xFF0000L) == 16711680L, class109.field2740, (int) (class99.field2397.field363 & 0xFFFFL), 7352, class77.field1813.field974);
                            }
                            class99.field2397.method114(-3789);
                            class77.field1813 = null;
                            if (class109.field2740) {
                                class50.field1288--;
                            } else {
                                class79.field1873--;
                            }
                            class99.field2397 = null;
                            class121.field3004 = 0;
                        } else {
                            if (class121.field3004 != 512) {
                                break;
                            }
                            class121.field3004 = 0;
                        }
                    } else {
                        int var18 = var10 - class23.field575.field957;
                        if (var9 < var18) {
                            var18 = var9;
                        }
                        class60.field1464.method344(class23.field575.field957, var18, class23.field575.field974, 89);
                        if (class112.field2815 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class23.field575.field974[class23.field575.field957 + var19] = (byte) class40.method347(class23.field575.field974[class23.field575.field957 + var19], class112.field2815);
                            }
                        }
                        class23.field575.field957 += var18;
                        if (var10 > class23.field575.field957) {
                            break;
                        }
                        if (class99.field2397 == null) {
                            class23.field575.field957 = 0;
                            int var20 = class23.field575.method330(-30864);
                            int var21 = class23.field575.method343((byte) -6);
                            int var22 = class23.field575.method330(-30864);
                            int var23 = class23.field575.method322((byte) -118);
                            long var24 = (long) ((var20 << 16) + var21);
                            class109 var26 = (class109) class43.field1091.method408(var24, 93);
                            class109.field2740 = true;
                            if (var26 == null) {
                                var26 = (class109) class32.field785.method408(var24, arg0 ^ 0x624B);
                                class109.field2740 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            int var27 = var22 == 0 ? 5 : 9;
                            class99.field2397 = var26;
                            class77.field1813 = new class39(var23 + var27 + class99.field2397.field2737);
                            class77.field1813.method307(-388270616, var22);
                            class77.field1813.method308(var23, (byte) 77);
                            class23.field575.field957 = 0;
                            class121.field3004 = 8;
                        } else if (class121.field3004 == 0) {
                            if (class23.field575.field974[0] == -1) {
                                class23.field575.field957 = 0;
                                class121.field3004 = 1;
                            } else {
                                class99.field2397 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class60.field1464.method350(-5918);
                } catch (Exception var28) {
                }
                class35.field893++;
                class60.field1464 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(BI)V", line = 617)
    public final void method991(byte arg0, int arg1) {
        this.field3050 += this.field3048 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field3061;
        this.field3055 += (double) arg1 * this.field3067;
        this.field3061 += (double) arg1 * this.field3048;
        this.field3081 = true;
        field3062++;
        this.field3065 += (double) arg1 * this.field3059;
        this.field3088 = (int) (Math.atan2(this.field3059, this.field3067) * 325.949D) + 1024 & 0x7FF;
        this.field3071 = (int) (Math.atan2(this.field3061, this.field3064) * 325.949D) & 0x7FF;
        if (this.field3078 != null) {
            this.field3077 += arg1;
            while (this.field3077 > this.field3078.field1742[this.field3080]) {
                this.field3077 -= this.field3078.field1742[this.field3080];
                this.field3080++;
                if (this.field3080 >= this.field3078.field1727.length) {
                    this.field3080 = 0;
                }
            }
        }
        int var3 = 79 % ((arg0 + 62) / 62);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 985)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field3081 = false;
        this.field3090 = arg2;
        this.field3051 = arg7;
        this.field3072 = arg3;
        this.field3068 = arg1;
        this.field3052 = arg0;
        this.field3076 = arg4;
        this.field3053 = arg9;
        this.field3070 = arg10;
        this.field3083 = arg8;
        this.field3091 = arg5;
        this.field3087 = arg6;
        int var12 = class52.method434(this.field3052, false).field2724;
        if (var12 == -1) {
            this.field3078 = null;
        } else {
            this.field3078 = class78.method605(var12, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZB)V", line = 656)
    public static final void method992(boolean arg0, byte arg1) {
        if (arg1 < 83) {
            method989(-104);
        }
        class19.field513 = arg0;
        field3063++;
        if (!class19.field513) {
            int var2 = (class75.field1804 - class36.field907.field957) / 16;
            class13.field390 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class13.field390[var3][var14] = class36.field907.method322((byte) -118);
                }
            }
            int var4 = class36.field907.method336(241465648);
            int var5 = class36.field907.method343((byte) -6);
            int var6 = class36.field907.method343((byte) -6);
            boolean var7 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var4 / 8 == 48) {
                var7 = true;
            }
            if (var5 / 8 == 48 && var4 / 8 == 148) {
                var7 = true;
            }
            int var8 = class36.field907.method343((byte) -6);
            int var9 = class36.field907.method305((byte) -92);
            class52.field1311 = new int[var2];
            class5.field212 = new byte[var2][];
            class81.field1900 = new int[var2];
            class78.field1831 = new int[var2];
            class36.field917 = new byte[var2][];
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var4 - 6) / 8; var12 <= (var4 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var7 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class81.field1900[var10] = var13;
                        class78.field1831[var10] = class20.field527.method870(class69.method546(true, new class5[] { class91.field2174, class106.method864(18413, var11), class19.field508, class106.method864(18413, var12) }), 33);
                        class52.field1311[var10] = class20.field527.method870(class69.method546(true, new class5[] { class92.field2197, class106.method864(18413, var11), class19.field508, class106.method864(18413, var12) }), 127);
                        var10++;
                    }
                }
            }
            class5.method42(var4, var5, var9, var6, var8, true);
            return;
        }
        int var15 = class36.field907.method343((byte) -6);
        int var16 = class36.field907.method336(241465648);
        int var17 = class36.field907.method298(124);
        int var18 = class36.field907.method333((byte) -18);
        int var19 = class36.field907.method343((byte) -6);
        class36.field907.method213(8);
        for (int var20 = 0; var20 < 4; var20++) {
            for (int var35 = 0; var35 < 13; var35++) {
                for (int var36 = 0; var36 < 13; var36++) {
                    int var37 = class36.field907.method207((byte) 80, 1);
                    if (var37 == 1) {
                        class99.field2391[var20][var35][var36] = class36.field907.method207((byte) 80, 26);
                    } else {
                        class99.field2391[var20][var35][var36] = -1;
                    }
                }
            }
        }
        class36.field907.method212(true);
        int var21 = (class75.field1804 - class36.field907.field957) / 16;
        class13.field390 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var34 = 0; var34 < 4; var34++) {
                class13.field390[var22][var34] = class36.field907.method299(true);
            }
        }
        class5.field212 = new byte[var21][];
        class36.field917 = new byte[var21][];
        class52.field1311 = new int[var21];
        class81.field1900 = new int[var21];
        class78.field1831 = new int[var21];
        int var23 = 0;
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 13; var25++) {
                for (int var26 = 0; var26 < 13; var26++) {
                    int var27 = class99.field2391[var24][var25][var26];
                    if (var27 != -1) {
                        int var28 = var27 >> 14 & 0x3FF;
                        int var29 = var27 >> 3 & 0x7FF;
                        int var30 = (var28 / 8 << 8) + (var29 / 8);
                        for (int var31 = 0; var31 < var23; var31++) {
                            if (class81.field1900[var31] == var30) {
                                var30 = -1;
                                break;
                            }
                        }
                        if (var30 != -1) {
                            class81.field1900[var23] = var30;
                            int var32 = var30 >> 8 & 0xFF;
                            int var33 = var30 & 0xFF;
                            class78.field1831[var23] = class20.field527.method870(class69.method546(true, new class5[] { class91.field2174, class106.method864(18413, var32), class19.field508, class106.method864(18413, var33) }), -117);
                            class52.field1311[var23] = class20.field527.method870(class69.method546(true, new class5[] { class92.field2197, class106.method864(18413, var32), class19.field508, class106.method864(18413, var33) }), -100);
                            var23++;
                        }
                    }
                }
            }
        }
        class5.method42(var19, var15, var18, var16, var17, true);
    }

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V", line = 905)
    public static final void method993(int arg0) {
        while (true) {
            if (class36.field907.method206(8, class75.field1804) >= 27) {
                int var1 = class36.field907.method207((byte) 80, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class103.field2504[var1] == null) {
                        var2 = true;
                        class103.field2504[var1] = new class61();
                    }
                    class61 var3 = class103.field2504[var1];
                    class25.field611[class33.field790++] = var1;
                    var3.field113 = class69.field1636;
                    int var4 = class36.field907.method207((byte) 80, 1);
                    int var5 = class109.field2744[class36.field907.method207((byte) 80, 3)];
                    if (var2) {
                        var3.field51 = var5;
                    }
                    int var6 = class36.field907.method207((byte) 80, 1);
                    if (var6 == 1) {
                        class13.field380[class109.field2727++] = var1;
                    }
                    var3.field1498 = class48.method421(class36.field907.method207((byte) 80, 13), 1);
                    int var7 = class36.field907.method207((byte) 80, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class36.field907.method207((byte) 80, 5);
                    var3.field75 = var3.field1498.field2897;
                    var3.field68 = var3.field1498.field2929;
                    var3.field119 = var3.field1498.field2891;
                    var3.field48 = var3.field1498.field2937;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field70 = var3.field1498.field2894;
                    if (var3.field119 == 0) {
                        var3.field51 = 0;
                    }
                    var3.field77 = var3.field1498.field2892;
                    var3.field87 = var3.field1498.field2888;
                    var3.field84 = var3.field1498.field2925;
                    var3.field69 = var3.field1498.field2906;
                    var3.method24(class82.field1932.field49[0] + var8, (byte) -21, var4 == 1, class82.field1932.field89[0] + var7);
                    continue;
                }
            }
            if (arg0 != 0) {
                return;
            }
            field3089++;
            class36.field907.method212(true);
            return;
        }
    }
}
