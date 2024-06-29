import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class510 {

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "[F")
    private float[] field7519 = new float[16];

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Lhk;")
    private class67 field7526 = new class67(786336);

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    private int field7532 = class515.method3055(1600, (byte) -14);

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "[I")
    private int[] field7537 = new int[64];

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "[[Lwv;")
    private class26[][] field7536 = new class26[1600][64];

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "[[Lwv;")
    private class26[][] field7540 = new class26[64][768];

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "[I")
    private int[] field7541 = new int[8191];

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "[I")
    private int[] field7538 = new int[1600];

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    private int field7539 = 0;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[I")
    public static int[] field7524;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Z")
    public static boolean field7523;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "F")
    public static float field7529;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field7522;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public static int field7525;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field7527;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field7528;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field7530;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "Lvd;")
    private class30 field7535;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lpc;")
    private class473 field7531;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lpc;")
    private class473 field7533;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "Lpc;")
    private class473 field7534;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static final void method3035(int arg0) {
        field7528++;
        if (arg0 != -18006) {
            field7523 = false;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class173.field2456[var1] = false;
        }
        class284.field4129 = 0;
        class509.field7505 = -1;
        class193.field2810 = 0;
        class462.field6802 = 1;
        class408.field6072 = -1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIII)V")
    public static final void method3036(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7530++;
        class215 var5 = class171.method1208(arg2, (byte) 117, 4);
        if (arg1 <= -48) {
            var5.method1465(-25852);
            var5.field3082 = arg0;
            var5.field3077 = arg4;
            var5.field3081 = arg3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lfd;II)V")
    private final void method3037(class365 arg0, int arg1, int arg2) {
        field7525++;
        OpenGL.glGetFloatv(2982, this.field7519, 0);
        float var4 = this.field7519[0];
        float var5 = this.field7519[4];
        float var6 = this.field7519[8];
        float var7 = this.field7519[1];
        float var8 = this.field7519[5];
        float var9 = this.field7519[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        int var14 = 102 % ((-arg2 - 57) / 36);
        float var15 = var5 - var8;
        float var16 = var6 - var9;
        float var17 = var7 - var4;
        float var18 = var8 - var5;
        this.field7526.field827 = 0;
        float var19 = var9 - var6;
        if (arg0.field5443) {
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = this.field7538[var20] <= 64 ? this.field7538[var20] : 64;
                if (var21 > 0) {
                    for (int var22 = var21 - 1; var22 >= 0; var22--) {
                        class26 var35 = this.field7536[var20][var22];
                        int var36 = var35.field311;
                        byte var37 = (byte) (var36 >> 16);
                        byte var38 = (byte) (var36 >> 8);
                        byte var39 = (byte) var36;
                        byte var40 = (byte) (var36 >>> 24);
                        float var41 = (float) (var35.field305 >> class429.field6317);
                        float var42 = (float) (var35.field316 >> class429.field6317);
                        float var43 = (float) (var35.field312 >> class429.field6317);
                        int var44 = var35.field306 >> class429.field6317;
                        this.field7526.method655(0.0F, (byte) 98);
                        this.field7526.method655(0.0F, (byte) 98);
                        this.field7526.method655((float) (-var44) * var10 + var41, (byte) 98);
                        this.field7526.method655((float) (-var44) * var11 + var42, (byte) 98);
                        this.field7526.method655((float) (-var44) * var12 + var43, (byte) 98);
                        this.field7526.method638(255, var37);
                        this.field7526.method638(255, var38);
                        this.field7526.method638(255, var39);
                        this.field7526.method638(255, var40);
                        this.field7526.method655(1.0F, (byte) 98);
                        this.field7526.method655(0.0F, (byte) 98);
                        this.field7526.method655((float) var44 * var13 + var41, (byte) 98);
                        this.field7526.method655((float) var44 * var15 + var42, (byte) 98);
                        this.field7526.method655((float) var44 * var16 + var43, (byte) 98);
                        this.field7526.method638(255, var37);
                        this.field7526.method638(255, var38);
                        this.field7526.method638(255, var39);
                        this.field7526.method638(255, var40);
                        this.field7526.method655(1.0F, (byte) 98);
                        this.field7526.method655(1.0F, (byte) 98);
                        this.field7526.method655((float) var44 * var10 + var41, (byte) 98);
                        this.field7526.method655((float) var44 * var11 + var42, (byte) 98);
                        this.field7526.method655((float) var44 * var12 + var43, (byte) 98);
                        this.field7526.method638(255, var37);
                        this.field7526.method638(255, var38);
                        this.field7526.method638(255, var39);
                        this.field7526.method638(255, var40);
                        this.field7526.method655(0.0F, (byte) 98);
                        this.field7526.method655(1.0F, (byte) 98);
                        this.field7526.method655((float) var44 * var17 + var41, (byte) 98);
                        this.field7526.method655((float) var44 * var18 + var42, (byte) 98);
                        this.field7526.method655((float) var44 * var19 + var43, (byte) 98);
                        this.field7526.method638(255, var37);
                        this.field7526.method638(255, var38);
                        this.field7526.method638(255, var39);
                        this.field7526.method638(255, var40);
                    }
                    if (this.field7538[var20] > 64) {
                        int var23 = this.field7538[var20] - 64 - 1;
                        for (int var24 = this.field7537[var23] - 1; var24 >= 0; var24--) {
                            class26 var25 = this.field7540[var23][var24];
                            int var26 = var25.field311;
                            byte var27 = (byte) (var26 >> 16);
                            byte var28 = (byte) (var26 >> 8);
                            byte var29 = (byte) var26;
                            byte var30 = (byte) (var26 >>> 24);
                            float var31 = (float) (var25.field305 >> class429.field6317);
                            float var32 = (float) (var25.field316 >> class429.field6317);
                            float var33 = (float) (var25.field312 >> class429.field6317);
                            int var34 = var25.field306 >> class429.field6317;
                            this.field7526.method655(0.0F, (byte) 98);
                            this.field7526.method655(0.0F, (byte) 98);
                            this.field7526.method655((float) (-var34) * var10 + var31, (byte) 98);
                            this.field7526.method655((float) (-var34) * var11 + var32, (byte) 98);
                            this.field7526.method655((float) (-var34) * var12 + var33, (byte) 98);
                            this.field7526.method638(255, var27);
                            this.field7526.method638(255, var28);
                            this.field7526.method638(255, var29);
                            this.field7526.method638(255, var30);
                            this.field7526.method655(1.0F, (byte) 98);
                            this.field7526.method655(0.0F, (byte) 98);
                            this.field7526.method655((float) var34 * var13 + var31, (byte) 98);
                            this.field7526.method655((float) var34 * var15 + var32, (byte) 98);
                            this.field7526.method655((float) var34 * var16 + var33, (byte) 98);
                            this.field7526.method638(255, var27);
                            this.field7526.method638(255, var28);
                            this.field7526.method638(255, var29);
                            this.field7526.method638(255, var30);
                            this.field7526.method655(1.0F, (byte) 98);
                            this.field7526.method655(1.0F, (byte) 98);
                            this.field7526.method655((float) var34 * var10 + var31, (byte) 98);
                            this.field7526.method655((float) var34 * var11 + var32, (byte) 98);
                            this.field7526.method655((float) var34 * var12 + var33, (byte) 98);
                            this.field7526.method638(255, var27);
                            this.field7526.method638(255, var28);
                            this.field7526.method638(255, var29);
                            this.field7526.method638(255, var30);
                            this.field7526.method655(0.0F, (byte) 98);
                            this.field7526.method655(1.0F, (byte) 98);
                            this.field7526.method655((float) var34 * var17 + var31, (byte) 98);
                            this.field7526.method655((float) var34 * var18 + var32, (byte) 98);
                            this.field7526.method655((float) var34 * var19 + var33, (byte) 98);
                            this.field7526.method638(255, var27);
                            this.field7526.method638(255, var28);
                            this.field7526.method638(255, var29);
                            this.field7526.method638(255, var30);
                        }
                    }
                }
            }
        } else {
            for (int var45 = arg1 - 1; var45 >= 0; var45--) {
                int var46 = this.field7538[var45] > 64 ? 64 : this.field7538[var45];
                if (var46 > 0) {
                    for (int var47 = var46 - 1; var47 >= 0; var47--) {
                        class26 var60 = this.field7536[var45][var47];
                        int var61 = var60.field311;
                        byte var62 = (byte) (var61 >> 16);
                        byte var63 = (byte) (var61 >> 8);
                        byte var64 = (byte) var61;
                        byte var65 = (byte) (var61 >>> 24);
                        float var66 = (float) (var60.field305 >> class429.field6317);
                        float var67 = (float) (var60.field316 >> class429.field6317);
                        float var68 = (float) (var60.field312 >> class429.field6317);
                        int var69 = var60.field306 >> class429.field6317;
                        this.field7526.method651(0.0F, 1739667504);
                        this.field7526.method651(0.0F, 1739667504);
                        this.field7526.method651((float) (-var69) * var10 + var66, 1739667504);
                        this.field7526.method651((float) (-var69) * var11 + var67, 1739667504);
                        this.field7526.method651((float) (-var69) * var12 + var68, 1739667504);
                        this.field7526.method638(255, var62);
                        this.field7526.method638(255, var63);
                        this.field7526.method638(255, var64);
                        this.field7526.method638(255, var65);
                        this.field7526.method651(1.0F, 1739667504);
                        this.field7526.method651(0.0F, 1739667504);
                        this.field7526.method651((float) var69 * var13 + var66, 1739667504);
                        this.field7526.method651((float) var69 * var15 + var67, 1739667504);
                        this.field7526.method651((float) var69 * var16 + var68, 1739667504);
                        this.field7526.method638(255, var62);
                        this.field7526.method638(255, var63);
                        this.field7526.method638(255, var64);
                        this.field7526.method638(255, var65);
                        this.field7526.method651(1.0F, 1739667504);
                        this.field7526.method651(1.0F, 1739667504);
                        this.field7526.method651((float) var69 * var10 + var66, 1739667504);
                        this.field7526.method651((float) var69 * var11 + var67, 1739667504);
                        this.field7526.method651((float) var69 * var12 + var68, 1739667504);
                        this.field7526.method638(255, var62);
                        this.field7526.method638(255, var63);
                        this.field7526.method638(255, var64);
                        this.field7526.method638(255, var65);
                        this.field7526.method651(0.0F, 1739667504);
                        this.field7526.method651(1.0F, 1739667504);
                        this.field7526.method651((float) var69 * var17 + var66, 1739667504);
                        this.field7526.method651((float) var69 * var18 + var67, 1739667504);
                        this.field7526.method651((float) var69 * var19 + var68, 1739667504);
                        this.field7526.method638(255, var62);
                        this.field7526.method638(255, var63);
                        this.field7526.method638(255, var64);
                        this.field7526.method638(255, var65);
                    }
                    if (this.field7538[var45] > 64) {
                        int var48 = this.field7538[var45] - 65;
                        for (int var49 = this.field7537[var48] - 1; var49 >= 0; var49--) {
                            class26 var50 = this.field7540[var48][var49];
                            int var51 = var50.field311;
                            byte var52 = (byte) (var51 >> 16);
                            byte var53 = (byte) (var51 >> 8);
                            byte var54 = (byte) var51;
                            byte var55 = (byte) (var51 >>> 24);
                            float var56 = (float) (var50.field305 >> class429.field6317);
                            float var57 = (float) (var50.field316 >> class429.field6317);
                            float var58 = (float) (var50.field312 >> class429.field6317);
                            int var59 = var50.field306 >> class429.field6317;
                            this.field7526.method651(0.0F, 1739667504);
                            this.field7526.method651(0.0F, 1739667504);
                            this.field7526.method651((float) (-var59) * var10 + var56, 1739667504);
                            this.field7526.method651((float) (-var59) * var11 + var57, 1739667504);
                            this.field7526.method651((float) (-var59) * var12 + var58, 1739667504);
                            this.field7526.method638(255, var52);
                            this.field7526.method638(255, var53);
                            this.field7526.method638(255, var54);
                            this.field7526.method638(255, var55);
                            this.field7526.method651(1.0F, 1739667504);
                            this.field7526.method651(0.0F, 1739667504);
                            this.field7526.method651((float) var59 * var13 + var56, 1739667504);
                            this.field7526.method651((float) var59 * var15 + var57, 1739667504);
                            this.field7526.method651((float) var59 * var16 + var58, 1739667504);
                            this.field7526.method638(255, var52);
                            this.field7526.method638(255, var53);
                            this.field7526.method638(255, var54);
                            this.field7526.method638(255, var55);
                            this.field7526.method651(1.0F, 1739667504);
                            this.field7526.method651(1.0F, 1739667504);
                            this.field7526.method651((float) var59 * var10 + var56, 1739667504);
                            this.field7526.method651((float) var59 * var11 + var57, 1739667504);
                            this.field7526.method651((float) var59 * var12 + var58, 1739667504);
                            this.field7526.method638(255, var52);
                            this.field7526.method638(255, var53);
                            this.field7526.method638(255, var54);
                            this.field7526.method638(255, var55);
                            this.field7526.method651(0.0F, 1739667504);
                            this.field7526.method651(1.0F, 1739667504);
                            this.field7526.method651((float) var59 * var17 + var56, 1739667504);
                            this.field7526.method651((float) var59 * var18 + var57, 1739667504);
                            this.field7526.method651((float) var59 * var19 + var58, 1739667504);
                            this.field7526.method638(255, var52);
                            this.field7526.method638(255, var53);
                            this.field7526.method638(255, var54);
                            this.field7526.method638(255, var55);
                        }
                    }
                }
            }
        }
        if (this.field7526.field827 != 0) {
            this.field7535.method240((byte) -87, this.field7526.field827, 24, this.field7526.field783);
            arg0.method2217(this.field7531, 114, null, this.field7534, this.field7533);
            arg0.method2208(1, 0, 7, this.field7526.field827 / 24);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLmc;Lfd;)V")
    public final void method3038(byte arg0, class88 arg1, class365 arg2) {
        field7520++;
        if (arg2.field5400 == null) {
            return;
        }
        this.method3042(11604, arg2);
        float var4 = arg2.field5400.field3400;
        float var5 = arg2.field5400.field3392;
        float var6 = arg2.field5400.field3377;
        int var7 = 9 % ((63 - arg0) / 56);
        float var8 = arg2.field5400.field3376;
        try {
            if (arg1.field1200) {
                int var9 = arg1.field1192 - arg1.field1198;
                int var10;
                if ((var9 + 2) <= 1600) {
                    var9 += 2;
                    var10 = 0;
                } else {
                    var10 = class515.method3055(var9, (byte) -14) + 1 - this.field7532;
                    var9 = (var9 >> var10) + 2;
                }
                class472 var11 = arg1.field1190.field5516;
                class472 var12 = var11.field6968;
                int var13 = -2;
                boolean var14 = true;
                boolean var15 = true;
                while (var11 != var12) {
                    this.field7539 = 0;
                    for (int var16 = 0; var16 < var9; var16++) {
                        this.field7538[var16] = 0;
                    }
                    for (int var17 = 0; var17 < 64; var17++) {
                        this.field7537[var17] = 0;
                    }
                    while (var11 != var12) {
                        class26 var18 = (class26) var12;
                        if (var15) {
                            var13 = var18.field317;
                            var14 = var18.field308;
                            var15 = false;
                        } else if (var18.field317 != var13 || var14 != var18.field308) {
                            var15 = true;
                            break;
                        }
                        int var19 = (int) ((float) (var18.field312 >> class429.field6317) * var6 + (float) (var18.field316 >> class429.field6317) * var5 + (float) (var18.field305 >> class429.field6317) * var4 + var8) - arg1.field1198 >> var10;
                        if (var19 < 1600) {
                            if (this.field7538[var19] >= 64) {
                                label198: {
                                    if (this.field7538[var19] == 64) {
                                        if (this.field7539 == 64) {
                                            break label198;
                                        }
                                        this.field7538[var19] += (this.field7539++) + 1;
                                    }
                                    this.field7540[this.field7538[var19] - 64 - 1][this.field7537[this.field7538[var19] - 1 - 64]++] = var18;
                                }
                            } else {
                                this.field7536[var19][this.field7538[var19]++] = var18;
                            }
                        }
                        var12 = var12.field6968;
                    }
                    if (var13 >= 0) {
                        arg2.method2188((byte) 78, arg2.field5298.method2878(var13, -128));
                        arg2.method2183(7681, arg2.field425.method1780(-31305, var13).field1441);
                    } else {
                        arg2.method2188((byte) 78, null);
                    }
                    if (var14 && class507.field7496 != arg2.field5399) {
                        arg2.method293(class507.field7496);
                    } else if (arg2.field5399 != 1.0F) {
                        arg2.method293(1.0F);
                    }
                    this.method3037(arg2, var9, -103);
                }
            } else {
                int var20 = 0;
                int var21 = Integer.MAX_VALUE;
                int var22 = 0;
                class472 var23 = arg1.field1190.field5516;
                for (class472 var24 = var23.field6968; var24 != var23; var24 = var24.field6968) {
                    class26 var25 = (class26) var24;
                    int var26 = (int) ((float) (var25.field312 >> class429.field6317) * var6 + (float) (var25.field316 >> class429.field6317) * var5 + (float) (var25.field305 >> class429.field6317) * var4 + var8);
                    this.field7541[var20++] = var26;
                    if (var21 > var26) {
                        var21 = var26;
                    }
                    if (var22 < var26) {
                        var22 = var26;
                    }
                }
                int var27 = var22 - var21;
                int var28;
                if ((var27 + 2) <= 1600) {
                    var27 += 2;
                    var28 = 0;
                } else {
                    var28 = class515.method3055(var27, (byte) -14) + 1 - this.field7532;
                    var27 = (var27 >> var28) + 2;
                }
                int var29 = 0;
                class472 var30 = var23.field6968;
                int var31 = -2;
                boolean var32 = true;
                boolean var33 = true;
                while (var23 != var30) {
                    this.field7539 = 0;
                    for (int var34 = 0; var34 < var27; var34++) {
                        this.field7538[var34] = 0;
                    }
                    for (int var35 = 0; var35 < 64; var35++) {
                        this.field7537[var35] = 0;
                    }
                    while (var23 != var30) {
                        class26 var36 = (class26) var30;
                        if (var33) {
                            var32 = var36.field308;
                            var33 = false;
                            var31 = var36.field317;
                        }
                        if (var29 > 0 && (var36.field317 != var31 || var32 != var36.field308)) {
                            var33 = true;
                            break;
                        }
                        int var37 = this.field7541[var29++] - var21 >> var28;
                        if (var37 < 1600) {
                            if (this.field7538[var37] < 64) {
                                this.field7536[var37][this.field7538[var37]++] = var36;
                            } else {
                                label148: {
                                    if (this.field7538[var37] == 64) {
                                        if (this.field7539 == 64) {
                                            break label148;
                                        }
                                        this.field7538[var37] += (this.field7539++) + 1;
                                    }
                                    this.field7540[this.field7538[var37] - 65][this.field7537[this.field7538[var37] - 64 - 1]++] = var36;
                                }
                            }
                        }
                        var30 = var30.field6968;
                    }
                    if (var31 < 0) {
                        arg2.method2188((byte) 78, null);
                    } else {
                        arg2.method2188((byte) 78, arg2.field5298.method2878(var31, -128));
                        arg2.method2183(7681, arg2.field425.method1780(-31305, var31).field1441);
                    }
                    if (var32 && class507.field7496 != arg2.field5399) {
                        arg2.method293(class507.field7496);
                    } else if (arg2.field5399 != 1.0F) {
                        arg2.method293(1.0F);
                    }
                    this.method3037(arg2, var27, 47);
                }
            }
        } catch (Exception var38) {
        }
        this.method3041(16385, arg2);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLfd;)V")
    public final void method3039(byte arg0, class365 arg1) {
        this.field7535 = arg1.method2243(0, 196584, null, true, 24);
        field7521++;
        if (arg0 == 6) {
            this.field7534 = new class473(this.field7535, 5126, 2, 0);
            this.field7533 = new class473(this.field7535, 5126, 3, 8);
            this.field7531 = new class473(this.field7535, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Lii;")
    public static final class386 method3040(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2079;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILfd;)V")
    private final void method3041(int arg0, class365 arg1) {
        field7522++;
        arg1.method2194(-32, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg0);
        if (class507.field7496 != arg1.field5399) {
            arg1.method293(class507.field7496);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(ILfd;)V")
    private final void method3042(int arg0, class365 arg1) {
        class507.field7496 = arg1.field5399;
        if (arg0 != 11604) {
            return;
        }
        field7527++;
        arg1.method2187(8);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2194(-32, false);
        arg1.method2240(false, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static void method3043(byte arg0) {
        if (arg0 < 126) {
            method3035(-4);
        }
        field7524 = null;
    }

    static {
        new class331("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field7524 = new int[14];
        field7523 = false;
    }
}
