import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class503 {

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "[F")
    private float[] field7414 = new float[16];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lht;")
    private class409 field7413 = new class409(786336);

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    private int field7424 = class210.method1417(1600, 0);

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "[I")
    private int[] field7428 = new int[64];

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "[[Lha;")
    private class41[][] field7429 = new class41[1600][64];

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "[[Lha;")
    private class41[][] field7430 = new class41[64][768];

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "[I")
    private int[] field7431 = new int[1600];

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "I")
    private int field7432 = 0;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "[I")
    private int[] field7433 = new int[8191];

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "Lef;")
    public static class335 field7416 = new class335(12, 0, 1, 0);

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field7421;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "Lkd;")
    private class184 field7423;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "Lkd;")
    private class184 field7425;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lkd;")
    private class184 field7426;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "Lnh;")
    private class525 field7427;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static final void method3008(byte arg0) {
        if (arg0 < -72) {
            field7417++;
            class169.field2622 = null;
            class170.field2640 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lvj;I)V")
    private final void method3009(class303 arg0, int arg1) {
        field7419++;
        class16.field242 = arg0.field4545;
        arg0.method1987(arg1 - 26373);
        if (arg1 != 26412) {
            method3010((byte) 58, -43);
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1984(113, false);
        arg0.method1970(7, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BI)V")
    public static final void method3010(byte arg0, int arg1) {
        field7421++;
        if (arg1 == -1 || !class373.field5662[arg1]) {
            return;
        }
        class390.field5913.method128(arg1, 90);
        class22.field438[arg1] = null;
        class388.field5835[arg1] = null;
        class373.field5662[arg1] = false;
        int var2 = -42 % ((arg0 + 16) / 51);
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
    public static void method3011(byte arg0) {
        field7416 = null;
        int var1 = -103 / ((arg0 - 1) / 40);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLvj;Lsh;)V")
    public final void method3012(byte arg0, class303 arg1, class49 arg2) {
        field7415++;
        if (arg1.field4604 == null) {
            return;
        }
        this.method3009(arg1, 26412);
        float var4 = arg1.field4604.field3559;
        if (arg0 >= -83) {
            method3008((byte) -42);
        }
        float var5 = arg1.field4604.field3561;
        float var6 = arg1.field4604.field3543;
        float var7 = arg1.field4604.field3529;
        try {
            if (arg2.field898) {
                int var26 = arg2.field896 - arg2.field895;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class210.method1417(var26, 0) + (1 - this.field7424);
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class141 var28 = arg2.field892.field3397;
                class141 var29 = var28.field2236;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field7432 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7431[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7428[var34] = 0;
                    }
                    while (var28 != var29) {
                        class41 var35 = (class41) var29;
                        if (var32) {
                            var30 = var35.field741;
                            var31 = var35.field740;
                            var32 = false;
                        } else if (var35.field741 != var30 || var31 != var35.field740) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field745 >> class267.field3840) * var6 + (float) (var35.field743 >> class267.field3840) * var5 + (float) (var35.field738 >> class267.field3840) * var4 + var7) - arg2.field895 >> var27;
                        if (var36 < 1600) {
                            if (this.field7431[var36] < 64) {
                                this.field7429[var36][this.field7431[var36]++] = var35;
                            } else {
                                label149: {
                                    if (this.field7431[var36] == 64) {
                                        if (this.field7432 == 64) {
                                            break label149;
                                        }
                                        this.field7431[var36] += this.field7432++ + 1;
                                    }
                                    this.field7430[this.field7431[var36] - 65][this.field7428[this.field7431[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field2236;
                    }
                    if (var30 < 0) {
                        arg1.method1990(null, 11864);
                    } else {
                        arg1.method1990(arg1.field4472.method584(var30, (byte) -114), 11864);
                        arg1.method1989(-24145, arg1.field2501.method956(-945, var30).field1442);
                    }
                    if (var31 && class16.field242 != arg1.field4545) {
                        arg1.method281(class16.field242);
                    } else if (arg1.field4545 != 1.0F) {
                        arg1.method281(1.0F);
                    }
                    this.method3013(arg1, var26, (byte) -58);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class141 var11 = arg2.field892.field3397;
                for (class141 var12 = var11.field2236; var12 != var11; var12 = var12.field2236) {
                    class41 var13 = (class41) var12;
                    int var14 = (int) ((float) (var13.field745 >> class267.field3840) * var6 + (float) (var13.field743 >> class267.field3840) * var5 + (float) (var13.field738 >> class267.field3840) * var4 + var7);
                    this.field7433[var8++] = var14;
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    if (var14 < var9) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var16 = 0;
                    var15 += 2;
                } else {
                    var16 = class210.method1417(var15, 0) + 1 - this.field7424;
                    var15 = (var15 >> var16) + 2;
                }
                class141 var17 = var11.field2236;
                int var18 = 0;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var17) {
                    this.field7432 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field7431[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field7428[var23] = 0;
                    }
                    while (var11 != var17) {
                        class41 var24 = (class41) var17;
                        if (var21) {
                            var20 = var24.field740;
                            var21 = false;
                            var19 = var24.field741;
                        }
                        if (var18 > 0 && (var24.field741 != var19 || var20 != var24.field740)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field7433[var18++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field7431[var25] < 64) {
                                this.field7429[var25][this.field7431[var25]++] = var24;
                            } else {
                                label194: {
                                    if (this.field7431[var25] == 64) {
                                        if (this.field7432 == 64) {
                                            break label194;
                                        }
                                        this.field7431[var25] += this.field7432++ + 1;
                                    }
                                    class41[] var38 = this.field7430[this.field7431[var25] - 65];
                                    int var10002 = this.field7431[var25] - 65;
                                    int var10004 = this.field7428[this.field7431[var25] - 65];
                                    this.field7428[var10002] = this.field7428[this.field7431[var25] - 65] + 1;
                                    var38[var10004] = var24;
                                }
                            }
                        }
                        var17 = var17.field2236;
                    }
                    if (var19 < 0) {
                        arg1.method1990(null, 11864);
                    } else {
                        arg1.method1990(arg1.field4472.method584(var19, (byte) -7), 11864);
                        arg1.method1989(-24145, arg1.field2501.method956(-945, var19).field1442);
                    }
                    if (var20 && class16.field242 != arg1.field4545) {
                        arg1.method281(class16.field242);
                    } else if (arg1.field4545 != 1.0F) {
                        arg1.method281(1.0F);
                    }
                    this.method3013(arg1, var15, (byte) -88);
                }
            }
        } catch (Exception var37) {
        }
        this.method3015(arg1, 16385);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lvj;IB)V")
    private final void method3013(class303 arg0, int arg1, byte arg2) {
        OpenGL.glGetFloatv(2982, this.field7414, 0);
        field7412++;
        float var4 = this.field7414[0];
        float var5 = this.field7414[4];
        float var6 = this.field7414[8];
        float var7 = this.field7414[1];
        float var8 = this.field7414[5];
        float var9 = this.field7414[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (arg2 >= -48) {
            this.field7428 = null;
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7413.field2289 = 0;
        float var18 = var9 - var6;
        if (arg0.field4599) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field7431[var44] <= 64 ? this.field7431[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class41 var59 = this.field7429[var44][var46];
                        int var60 = var59.field735;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field738 >> class267.field3840);
                        float var66 = (float) (var59.field743 >> class267.field3840);
                        float var67 = (float) (var59.field745 >> class267.field3840);
                        int var68 = var59.field744 >> class267.field3840;
                        this.field7413.method2489(0.0F, 24204);
                        this.field7413.method2489(0.0F, 24204);
                        this.field7413.method2489((float) (-var68) * var10 + var65, 24204);
                        this.field7413.method2489((float) (-var68) * var11 + var66, 24204);
                        this.field7413.method2489((float) (-var68) * var12 + var67, 24204);
                        this.field7413.method1109(false, var61);
                        this.field7413.method1109(false, var62);
                        this.field7413.method1109(false, var63);
                        this.field7413.method1109(false, var64);
                        this.field7413.method2489(1.0F, 24204);
                        this.field7413.method2489(0.0F, 24204);
                        this.field7413.method2489((float) var68 * var13 + var65, 24204);
                        this.field7413.method2489((float) var68 * var14 + var66, 24204);
                        this.field7413.method2489((float) var68 * var15 + var67, 24204);
                        this.field7413.method1109(false, var61);
                        this.field7413.method1109(false, var62);
                        this.field7413.method1109(false, var63);
                        this.field7413.method1109(false, var64);
                        this.field7413.method2489(1.0F, 24204);
                        this.field7413.method2489(1.0F, 24204);
                        this.field7413.method2489((float) var68 * var10 + var65, 24204);
                        this.field7413.method2489((float) var68 * var11 + var66, 24204);
                        this.field7413.method2489((float) var68 * var12 + var67, 24204);
                        this.field7413.method1109(false, var61);
                        this.field7413.method1109(false, var62);
                        this.field7413.method1109(false, var63);
                        this.field7413.method1109(false, var64);
                        this.field7413.method2489(0.0F, 24204);
                        this.field7413.method2489(1.0F, 24204);
                        this.field7413.method2489((float) var68 * var16 + var65, 24204);
                        this.field7413.method2489((float) var68 * var17 + var66, 24204);
                        this.field7413.method2489((float) var68 * var18 + var67, 24204);
                        this.field7413.method1109(false, var61);
                        this.field7413.method1109(false, var62);
                        this.field7413.method1109(false, var63);
                        this.field7413.method1109(false, var64);
                    }
                    if (this.field7431[var44] > 64) {
                        int var47 = this.field7431[var44] - 64 - 1;
                        for (int var48 = this.field7428[var47] - 1; var48 >= 0; var48--) {
                            class41 var49 = this.field7430[var47][var48];
                            int var50 = var49.field735;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field738 >> class267.field3840);
                            float var56 = (float) (var49.field743 >> class267.field3840);
                            float var57 = (float) (var49.field745 >> class267.field3840);
                            int var58 = var49.field744 >> class267.field3840;
                            this.field7413.method2489(0.0F, 24204);
                            this.field7413.method2489(0.0F, 24204);
                            this.field7413.method2489((float) (-var58) * var10 + var55, 24204);
                            this.field7413.method2489((float) (-var58) * var11 + var56, 24204);
                            this.field7413.method2489((float) (-var58) * var12 + var57, 24204);
                            this.field7413.method1109(false, var51);
                            this.field7413.method1109(false, var52);
                            this.field7413.method1109(false, var53);
                            this.field7413.method1109(false, var54);
                            this.field7413.method2489(1.0F, 24204);
                            this.field7413.method2489(0.0F, 24204);
                            this.field7413.method2489((float) var58 * var13 + var55, 24204);
                            this.field7413.method2489((float) var58 * var14 + var56, 24204);
                            this.field7413.method2489((float) var58 * var15 + var57, 24204);
                            this.field7413.method1109(false, var51);
                            this.field7413.method1109(false, var52);
                            this.field7413.method1109(false, var53);
                            this.field7413.method1109(false, var54);
                            this.field7413.method2489(1.0F, 24204);
                            this.field7413.method2489(1.0F, 24204);
                            this.field7413.method2489((float) var58 * var10 + var55, 24204);
                            this.field7413.method2489((float) var58 * var11 + var56, 24204);
                            this.field7413.method2489((float) var58 * var12 + var57, 24204);
                            this.field7413.method1109(false, var51);
                            this.field7413.method1109(false, var52);
                            this.field7413.method1109(false, var53);
                            this.field7413.method1109(false, var54);
                            this.field7413.method2489(0.0F, 24204);
                            this.field7413.method2489(1.0F, 24204);
                            this.field7413.method2489((float) var58 * var16 + var55, 24204);
                            this.field7413.method2489((float) var58 * var17 + var56, 24204);
                            this.field7413.method2489((float) var58 * var18 + var57, 24204);
                            this.field7413.method1109(false, var51);
                            this.field7413.method1109(false, var52);
                            this.field7413.method1109(false, var53);
                            this.field7413.method1109(false, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field7431[var19] <= 64 ? this.field7431[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class41 var34 = this.field7429[var19][var21];
                        int var35 = var34.field735;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field738 >> class267.field3840);
                        float var41 = (float) (var34.field743 >> class267.field3840);
                        float var42 = (float) (var34.field745 >> class267.field3840);
                        int var43 = var34.field744 >> class267.field3840;
                        this.field7413.method2487(986946216, 0.0F);
                        this.field7413.method2487(986946216, 0.0F);
                        this.field7413.method2487(986946216, (float) (-var43) * var10 + var40);
                        this.field7413.method2487(986946216, (float) (-var43) * var11 + var41);
                        this.field7413.method2487(986946216, (float) (-var43) * var12 + var42);
                        this.field7413.method1109(false, var36);
                        this.field7413.method1109(false, var37);
                        this.field7413.method1109(false, var38);
                        this.field7413.method1109(false, var39);
                        this.field7413.method2487(986946216, 1.0F);
                        this.field7413.method2487(986946216, 0.0F);
                        this.field7413.method2487(986946216, (float) var43 * var13 + var40);
                        this.field7413.method2487(986946216, (float) var43 * var14 + var41);
                        this.field7413.method2487(986946216, (float) var43 * var15 + var42);
                        this.field7413.method1109(false, var36);
                        this.field7413.method1109(false, var37);
                        this.field7413.method1109(false, var38);
                        this.field7413.method1109(false, var39);
                        this.field7413.method2487(986946216, 1.0F);
                        this.field7413.method2487(986946216, 1.0F);
                        this.field7413.method2487(986946216, (float) var43 * var10 + var40);
                        this.field7413.method2487(986946216, (float) var43 * var11 + var41);
                        this.field7413.method2487(986946216, (float) var43 * var12 + var42);
                        this.field7413.method1109(false, var36);
                        this.field7413.method1109(false, var37);
                        this.field7413.method1109(false, var38);
                        this.field7413.method1109(false, var39);
                        this.field7413.method2487(986946216, 0.0F);
                        this.field7413.method2487(986946216, 1.0F);
                        this.field7413.method2487(986946216, (float) var43 * var16 + var40);
                        this.field7413.method2487(986946216, (float) var43 * var17 + var41);
                        this.field7413.method2487(986946216, (float) var43 * var18 + var42);
                        this.field7413.method1109(false, var36);
                        this.field7413.method1109(false, var37);
                        this.field7413.method1109(false, var38);
                        this.field7413.method1109(false, var39);
                    }
                    if (this.field7431[var19] > 64) {
                        int var22 = this.field7431[var19] - 1 - 64;
                        for (int var23 = this.field7428[var22] - 1; var23 >= 0; var23--) {
                            class41 var24 = this.field7430[var22][var23];
                            int var25 = var24.field735;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field738 >> class267.field3840);
                            float var31 = (float) (var24.field743 >> class267.field3840);
                            float var32 = (float) (var24.field745 >> class267.field3840);
                            int var33 = var24.field744 >> class267.field3840;
                            this.field7413.method2487(986946216, 0.0F);
                            this.field7413.method2487(986946216, 0.0F);
                            this.field7413.method2487(986946216, (float) (-var33) * var10 + var30);
                            this.field7413.method2487(986946216, (float) (-var33) * var11 + var31);
                            this.field7413.method2487(986946216, (float) (-var33) * var12 + var32);
                            this.field7413.method1109(false, var26);
                            this.field7413.method1109(false, var27);
                            this.field7413.method1109(false, var28);
                            this.field7413.method1109(false, var29);
                            this.field7413.method2487(986946216, 1.0F);
                            this.field7413.method2487(986946216, 0.0F);
                            this.field7413.method2487(986946216, (float) var33 * var13 + var30);
                            this.field7413.method2487(986946216, (float) var33 * var14 + var31);
                            this.field7413.method2487(986946216, (float) var33 * var15 + var32);
                            this.field7413.method1109(false, var26);
                            this.field7413.method1109(false, var27);
                            this.field7413.method1109(false, var28);
                            this.field7413.method1109(false, var29);
                            this.field7413.method2487(986946216, 1.0F);
                            this.field7413.method2487(986946216, 1.0F);
                            this.field7413.method2487(986946216, (float) var33 * var10 + var30);
                            this.field7413.method2487(986946216, (float) var33 * var11 + var31);
                            this.field7413.method2487(986946216, (float) var33 * var12 + var32);
                            this.field7413.method1109(false, var26);
                            this.field7413.method1109(false, var27);
                            this.field7413.method1109(false, var28);
                            this.field7413.method1109(false, var29);
                            this.field7413.method2487(986946216, 0.0F);
                            this.field7413.method2487(986946216, 1.0F);
                            this.field7413.method2487(986946216, (float) var33 * var16 + var30);
                            this.field7413.method2487(986946216, (float) var33 * var17 + var31);
                            this.field7413.method2487(986946216, (float) var33 * var18 + var32);
                            this.field7413.method1109(false, var26);
                            this.field7413.method1109(false, var27);
                            this.field7413.method1109(false, var28);
                            this.field7413.method1109(false, var29);
                        }
                    }
                }
            }
        }
        if (this.field7413.field2289 != 0) {
            this.field7427.method603(this.field7413.field2270, this.field7413.field2289, 19049, 24);
            arg0.method1982(this.field7426, this.field7423, this.field7425, null, 76);
            arg0.method1976(7, this.field7413.field2289 / 24, 0, 56);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lvj;B)V")
    public final void method3014(class303 arg0, byte arg1) {
        this.field7427 = arg0.method1946(true, 196584, null, 24, 4564);
        if (arg1 == 27) {
            field7422++;
            this.field7423 = new class184(this.field7427, 5126, 2, 0);
            this.field7425 = new class184(this.field7427, 5126, 3, 8);
            this.field7426 = new class184(this.field7427, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(Lvj;I)V")
    private final void method3015(class303 arg0, int arg1) {
        field7418++;
        arg0.method1984(127, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class16.field242 != arg0.field4545) {
            arg0.method281(class16.field242);
        }
    }
}
