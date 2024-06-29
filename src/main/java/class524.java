import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class524 {

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "[F")
    private float[] field7710 = new float[16];

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "Luo;")
    private class408 field7711 = new class408(786336);

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    private int field7716 = class250.method1551(1600, (byte) 127);

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
    private int[] field7718 = new int[1600];

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "[[Lls;")
    private class94[][] field7722 = new class94[1600][64];

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    private int field7720 = 0;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
    private int[] field7719 = new int[64];

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[[Lls;")
    private class94[][] field7721 = new class94[64][768];

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
    private int[] field7723 = new int[8191];

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field7707 = "";

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field7717 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lse;")
    private class170 field7712;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lfo;")
    public static class361 field7702;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Ltp;")
    private class374 field7713;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Ltp;")
    private class374 field7714;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Ltp;")
    private class374 field7715;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lur;II)V", line = 3)
    private final void method3116(class377 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field7710, 0);
        field7704++;
        float var4 = this.field7710[0];
        float var5 = this.field7710[4];
        float var6 = this.field7710[8];
        float var7 = this.field7710[1];
        float var8 = this.field7710[5];
        float var9 = this.field7710[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field7711.field5729 = 0;
        if (arg0.field5334) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var46 = this.field7718[var44] <= 64 ? this.field7718[var44] : 64;
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class94 var60 = this.field7722[var44][var47];
                        int var61 = var60.field1133;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field1130 >> 12);
                        float var67 = (float) (var60.field1135 >> 12);
                        float var68 = (float) (var60.field1122 >> 12);
                        int var69 = var60.field1129 >> 12;
                        this.field7711.method2498(-123, 0.0F);
                        this.field7711.method2498(-123, 0.0F);
                        this.field7711.method2498(-123, (float) (-var69) * var10 + var66);
                        this.field7711.method2498(-123, (float) (-var69) * var11 + var67);
                        this.field7711.method2498(-123, (float) (-var69) * var12 + var68);
                        this.field7711.method2449((byte) 124, var62);
                        this.field7711.method2449((byte) 119, var63);
                        this.field7711.method2449((byte) 116, var64);
                        this.field7711.method2449((byte) 121, var65);
                        this.field7711.method2498(-123, 1.0F);
                        this.field7711.method2498(-123, 0.0F);
                        this.field7711.method2498(-123, (float) var69 * var13 + var66);
                        this.field7711.method2498(-123, (float) var69 * var14 + var67);
                        this.field7711.method2498(-123, (float) var69 * var15 + var68);
                        this.field7711.method2449((byte) 121, var62);
                        this.field7711.method2449((byte) 120, var63);
                        this.field7711.method2449((byte) 125, var64);
                        this.field7711.method2449((byte) 118, var65);
                        this.field7711.method2498(-123, 1.0F);
                        this.field7711.method2498(-123, 1.0F);
                        this.field7711.method2498(-123, (float) var69 * var10 + var66);
                        this.field7711.method2498(-123, (float) var69 * var11 + var67);
                        this.field7711.method2498(-123, (float) var69 * var12 + var68);
                        this.field7711.method2449((byte) 126, var62);
                        this.field7711.method2449((byte) 126, var63);
                        this.field7711.method2449((byte) 119, var64);
                        this.field7711.method2449((byte) 126, var65);
                        this.field7711.method2498(-123, 0.0F);
                        this.field7711.method2498(-123, 1.0F);
                        this.field7711.method2498(-123, (float) var69 * var16 + var66);
                        this.field7711.method2498(-123, (float) var69 * var17 + var67);
                        this.field7711.method2498(-123, (float) var69 * var18 + var68);
                        this.field7711.method2449((byte) 126, var62);
                        this.field7711.method2449((byte) 121, var63);
                        this.field7711.method2449((byte) 121, var64);
                        this.field7711.method2449((byte) 124, var65);
                    }
                    if (this.field7718[var44] > 64) {
                        int var48 = this.field7718[var44] - 64 - 1;
                        for (int var49 = this.field7719[var48] - 1; var49 >= 0; var49--) {
                            class94 var50 = this.field7721[var48][var49];
                            int var51 = var50.field1133;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field1130 >> 12);
                            float var57 = (float) (var50.field1135 >> 12);
                            float var58 = (float) (var50.field1122 >> 12);
                            int var59 = var50.field1129 >> 12;
                            this.field7711.method2498(-123, 0.0F);
                            this.field7711.method2498(-123, 0.0F);
                            this.field7711.method2498(-123, (float) (-var59) * var10 + var56);
                            this.field7711.method2498(-123, (float) (-var59) * var11 + var57);
                            this.field7711.method2498(-123, (float) (-var59) * var12 + var58);
                            this.field7711.method2449((byte) 117, var52);
                            this.field7711.method2449((byte) 126, var53);
                            this.field7711.method2449((byte) 121, var54);
                            this.field7711.method2449((byte) 117, var55);
                            this.field7711.method2498(-123, 1.0F);
                            this.field7711.method2498(-123, 0.0F);
                            this.field7711.method2498(-123, (float) var59 * var13 + var56);
                            this.field7711.method2498(-123, (float) var59 * var14 + var57);
                            this.field7711.method2498(-123, (float) var59 * var15 + var58);
                            this.field7711.method2449((byte) 115, var52);
                            this.field7711.method2449((byte) 116, var53);
                            this.field7711.method2449((byte) 118, var54);
                            this.field7711.method2449((byte) 122, var55);
                            this.field7711.method2498(-123, 1.0F);
                            this.field7711.method2498(-123, 1.0F);
                            this.field7711.method2498(-123, (float) var59 * var10 + var56);
                            this.field7711.method2498(-123, (float) var59 * var11 + var57);
                            this.field7711.method2498(-123, (float) var59 * var12 + var58);
                            this.field7711.method2449((byte) 124, var52);
                            this.field7711.method2449((byte) 116, var53);
                            this.field7711.method2449((byte) 123, var54);
                            this.field7711.method2449((byte) 121, var55);
                            this.field7711.method2498(-123, 0.0F);
                            this.field7711.method2498(-123, 1.0F);
                            this.field7711.method2498(-123, (float) var59 * var16 + var56);
                            this.field7711.method2498(-123, (float) var59 * var17 + var57);
                            this.field7711.method2498(-123, (float) var59 * var18 + var58);
                            this.field7711.method2449((byte) 126, var52);
                            this.field7711.method2449((byte) 118, var53);
                            this.field7711.method2449((byte) 120, var54);
                            this.field7711.method2449((byte) 115, var55);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field7718[var19] > 64 ? 64 : this.field7718[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class94 var34 = this.field7722[var19][var21];
                        int var35 = var34.field1133;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1130 >> 12);
                        float var41 = (float) (var34.field1135 >> 12);
                        float var42 = (float) (var34.field1122 >> 12);
                        int var43 = var34.field1129 >> 12;
                        this.field7711.method2497((byte) -34, 0.0F);
                        this.field7711.method2497((byte) 122, 0.0F);
                        this.field7711.method2497((byte) -46, (float) (-var43) * var10 + var40);
                        this.field7711.method2497((byte) -108, (float) (-var43) * var11 + var41);
                        this.field7711.method2497((byte) 123, (float) (-var43) * var12 + var42);
                        this.field7711.method2449((byte) 116, var36);
                        this.field7711.method2449((byte) 120, var37);
                        this.field7711.method2449((byte) 119, var38);
                        this.field7711.method2449((byte) 117, var39);
                        this.field7711.method2497((byte) 122, 1.0F);
                        this.field7711.method2497((byte) -124, 0.0F);
                        this.field7711.method2497((byte) -9, (float) var43 * var13 + var40);
                        this.field7711.method2497((byte) -54, (float) var43 * var14 + var41);
                        this.field7711.method2497((byte) 117, (float) var43 * var15 + var42);
                        this.field7711.method2449((byte) 124, var36);
                        this.field7711.method2449((byte) 119, var37);
                        this.field7711.method2449((byte) 118, var38);
                        this.field7711.method2449((byte) 127, var39);
                        this.field7711.method2497((byte) 120, 1.0F);
                        this.field7711.method2497((byte) -31, 1.0F);
                        this.field7711.method2497((byte) -25, (float) var43 * var10 + var40);
                        this.field7711.method2497((byte) 120, (float) var43 * var11 + var41);
                        this.field7711.method2497((byte) -88, (float) var43 * var12 + var42);
                        this.field7711.method2449((byte) 117, var36);
                        this.field7711.method2449((byte) 124, var37);
                        this.field7711.method2449((byte) 121, var38);
                        this.field7711.method2449((byte) 120, var39);
                        this.field7711.method2497((byte) -35, 0.0F);
                        this.field7711.method2497((byte) 25, 1.0F);
                        this.field7711.method2497((byte) 125, (float) var43 * var16 + var40);
                        this.field7711.method2497((byte) 115, (float) var43 * var17 + var41);
                        this.field7711.method2497((byte) 122, (float) var43 * var18 + var42);
                        this.field7711.method2449((byte) 115, var36);
                        this.field7711.method2449((byte) 123, var37);
                        this.field7711.method2449((byte) 121, var38);
                        this.field7711.method2449((byte) 122, var39);
                    }
                    if (this.field7718[var19] > 64) {
                        int var22 = this.field7718[var19] - 64 - 1;
                        for (int var23 = this.field7719[var22] - 1; var23 >= 0; var23--) {
                            class94 var24 = this.field7721[var22][var23];
                            int var25 = var24.field1133;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1130 >> 12);
                            float var31 = (float) (var24.field1135 >> 12);
                            float var32 = (float) (var24.field1122 >> 12);
                            int var33 = var24.field1129 >> 12;
                            this.field7711.method2497((byte) -45, 0.0F);
                            this.field7711.method2497((byte) 117, 0.0F);
                            this.field7711.method2497((byte) 125, (float) (-var33) * var10 + var30);
                            this.field7711.method2497((byte) 123, (float) (-var33) * var11 + var31);
                            this.field7711.method2497((byte) 115, (float) (-var33) * var12 + var32);
                            this.field7711.method2449((byte) 115, var26);
                            this.field7711.method2449((byte) 118, var27);
                            this.field7711.method2449((byte) 123, var28);
                            this.field7711.method2449((byte) 123, var29);
                            this.field7711.method2497((byte) 117, 1.0F);
                            this.field7711.method2497((byte) -90, 0.0F);
                            this.field7711.method2497((byte) -87, (float) var33 * var13 + var30);
                            this.field7711.method2497((byte) 126, (float) var33 * var14 + var31);
                            this.field7711.method2497((byte) 123, (float) var33 * var15 + var32);
                            this.field7711.method2449((byte) 125, var26);
                            this.field7711.method2449((byte) 125, var27);
                            this.field7711.method2449((byte) 115, var28);
                            this.field7711.method2449((byte) 118, var29);
                            this.field7711.method2497((byte) 125, 1.0F);
                            this.field7711.method2497((byte) -49, 1.0F);
                            this.field7711.method2497((byte) -120, (float) var33 * var10 + var30);
                            this.field7711.method2497((byte) 123, (float) var33 * var11 + var31);
                            this.field7711.method2497((byte) 120, (float) var33 * var12 + var32);
                            this.field7711.method2449((byte) 119, var26);
                            this.field7711.method2449((byte) 121, var27);
                            this.field7711.method2449((byte) 126, var28);
                            this.field7711.method2449((byte) 118, var29);
                            this.field7711.method2497((byte) 118, 0.0F);
                            this.field7711.method2497((byte) -40, 1.0F);
                            this.field7711.method2497((byte) 122, (float) var33 * var16 + var30);
                            this.field7711.method2497((byte) 117, (float) var33 * var17 + var31);
                            this.field7711.method2497((byte) 117, (float) var33 * var18 + var32);
                            this.field7711.method2449((byte) 124, var26);
                            this.field7711.method2449((byte) 118, var27);
                            this.field7711.method2449((byte) 126, var28);
                            this.field7711.method2449((byte) 120, var29);
                        }
                    }
                }
            }
        }
        if (this.field7711.field5729 != 0) {
            this.field7712.method167(-2115, this.field7711.field5761, 24, this.field7711.field5729);
            arg0.method2293(this.field7714, this.field7715, this.field7713, 32884, null);
            arg0.method2295(7, 0, this.field7711.field5729 / 24, (byte) 81);
        }
        int var45 = 72 % ((arg2 + 30) / 33);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 356)
    public static void method3117(int arg0) {
        int var1 = -13 % ((arg0 + 50) / 57);
        field7707 = null;
        field7702 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Leu;Lur;I)V", line = 366)
    public final void method3118(class336 arg0, class377 arg1, int arg2) {
        field7706++;
        if (arg1.field5425 == null) {
            return;
        }
        if (arg2 != 25796) {
            this.field7721 = null;
        }
        this.method3119(-65, arg1);
        float var4 = arg1.field5425.field3437;
        float var5 = arg1.field5425.field3410;
        float var6 = arg1.field5425.field3411;
        float var7 = arg1.field5425.field3426;
        try {
            if (arg0.field4455) {
                int var26 = arg0.field4456 - arg0.field4457;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class250.method1551(var26, (byte) 111) + 1 - this.field7716;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class380 var28 = arg0.field4453.field5890;
                class380 var29 = var28.field5500;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field7720 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7718[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7719[var34] = 0;
                    }
                    while (var28 != var29) {
                        class94 var35 = (class94) var29;
                        if (var32) {
                            var31 = var35.field1127;
                            var30 = var35.field1124;
                            var32 = false;
                        } else if (var35.field1124 != var30 || var35.field1127 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field1122 >> 12) * var6 + (float) (var35.field1135 >> 12) * var5 + (float) (var35.field1130 >> 12) * var4 + var7) - arg0.field4457 >> var27;
                        if (var36 < 1600) {
                            if (this.field7718[var36] < 64) {
                                this.field7722[var36][this.field7718[var36]++] = var35;
                            } else {
                                label145: {
                                    if (this.field7718[var36] == 64) {
                                        if (this.field7720 == 64) {
                                            break label145;
                                        }
                                        this.field7718[var36] += this.field7720++ + 1;
                                    }
                                    this.field7721[this.field7718[var36] - 65][this.field7719[this.field7718[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field5500;
                    }
                    if (var30 >= 0) {
                        arg1.method2236(arg1.field5304.method1783((byte) -113, var30), 97);
                        arg1.method2260(16640, arg1.field3772.method94(var30, (byte) -72).field6306);
                    } else {
                        arg1.method2236(null, 110);
                    }
                    if (var31 && class327.field4352 != arg1.field5337) {
                        arg1.method1139(class327.field4352);
                    } else if (arg1.field5337 != 1.0F) {
                        arg1.method1139(1.0F);
                    }
                    this.method3116(arg1, var26, -119);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class380 var11 = arg0.field4453.field5890;
                for (class380 var12 = var11.field5500; var12 != var11; var12 = var12.field5500) {
                    class94 var13 = (class94) var12;
                    int var14 = (int) ((float) (var13.field1122 >> 12) * var6 + (float) (var13.field1135 >> 12) * var5 + (float) (var13.field1130 >> 12) * var4 + var7);
                    if (var14 < var9) {
                        var9 = var14;
                    }
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    this.field7723[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = (class250.method1551(var15, (byte) 89) - this.field7716) + 1;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var15 += 2;
                    var16 = 0;
                }
                class380 var17 = var11.field5500;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field7720 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field7718[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field7719[var23] = 0;
                    }
                    while (var11 != var17) {
                        class94 var24 = (class94) var17;
                        if (var21) {
                            var19 = var24.field1124;
                            var20 = var24.field1127;
                            var21 = false;
                        }
                        if (var18 > 0 && (var24.field1124 != var19 || var24.field1127 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field7723[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field7718[var25] >= 64) {
                                label190: {
                                    if (this.field7718[var25] == 64) {
                                        if (this.field7720 == 64) {
                                            break label190;
                                        }
                                        this.field7718[var25] += this.field7720++ + 1;
                                    }
                                    class94[] var38 = this.field7721[this.field7718[var25] - 64 - 1];
                                    int var10002 = this.field7718[var25] - 65;
                                    int var10004 = this.field7719[this.field7718[var25] - 65];
                                    this.field7719[var10002] = this.field7719[this.field7718[var25] - 65] + 1;
                                    var38[var10004] = var24;
                                }
                            } else {
                                this.field7722[var25][this.field7718[var25]++] = var24;
                            }
                        }
                        var17 = var17.field5500;
                    }
                    if (var19 < 0) {
                        arg1.method2236(null, -66);
                    } else {
                        arg1.method2236(arg1.field5304.method1783((byte) -113, var19), -34);
                        arg1.method2260(16640, arg1.field3772.method94(var19, (byte) -72).field6306);
                    }
                    if (var20 && class327.field4352 != arg1.field5337) {
                        arg1.method1139(class327.field4352);
                    } else if (arg1.field5337 != 1.0F) {
                        arg1.method1139(1.0F);
                    }
                    this.method3116(arg1, var15, 50);
                }
            }
        } catch (Exception var37) {
        }
        this.method3122(arg1, arg2 - 25860);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILur;)V", line = 651)
    private final void method3119(int arg0, class377 arg1) {
        class327.field4352 = arg1.field5337;
        field7703++;
        arg1.method2282((byte) 108);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2289((byte) 124, false);
        arg1.method2299(-2, (byte) 114);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 != -65) {
            method3120(null, null, (byte) -4);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "([Ljava/lang/Object;[IB)V", line = 681)
    public static final void method3120(Object[] arg0, int[] arg1, byte arg2) {
        class92.method514(arg1, arg0, arg1.length - 1, 1, 0);
        if (arg2 < 35) {
            method3117(-26);
        }
        field7708++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLur;)V", line = 703)
    public final void method3121(byte arg0, class377 arg1) {
        field7705++;
        this.field7712 = arg1.method2307(null, 7938, 196584, true, 24);
        this.field7715 = new class374(this.field7712, 5126, 2, 0);
        this.field7714 = new class374(this.field7712, 5126, 3, 8);
        this.field7713 = new class374(this.field7712, 5121, 4, 20);
        int var3 = -26 % ((-arg0 - 54) / 43);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lur;I)V", line = 721)
    private final void method3122(class377 arg0, int arg1) {
        arg0.method2289((byte) 119, true);
        if (arg1 != -64) {
            method3117(-6);
        }
        field7709++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class327.field4352 != arg0.field5337) {
            arg0.method1139(class327.field4352);
        }
    }
}
