import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class740 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[F")
    private float[] field10318 = new float[16];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lfm;")
    private class736 field10323 = new class736(786336);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    private int field10334 = class423.method2356(1600, 1);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "[[Ll;")
    private class18[][] field10335 = new class18[64][768];

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    private int field10338 = 0;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "[I")
    private int[] field10337 = new int[8191];

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "[I")
    private int[] field10336 = new int[1600];

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "[I")
    private int[] field10339 = new int[64];

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "[[Ll;")
    private class18[][] field10340 = new class18[1600][64];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Lpfa;")
    public static class299 field10325 = new class299();

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field10331 = -1;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "J")
    public static long field10332 = -1L;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "D")
    public static double field10330;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field10333;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Lju;")
    private class128 field10329;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Luo;")
    private class578 field10326;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Luo;")
    private class578 field10327;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Luo;")
    private class578 field10328;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z", line = 10)
    public static final boolean method4122(byte arg0, int arg1) {
        int var2 = 122 / ((-arg0 - 13) / 42);
        field10319++;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 20)
    public static void method4123(boolean arg0) {
        if (!arg0) {
            method4122((byte) 17, 50);
        }
        field10325 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbi;IILfl;)V", line = 30)
    public final void method4124(class483 arg0, int arg1, int arg2, class741 arg3) {
        field10317++;
        if (arg0.field6806 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method4128(arg1, (byte) -121, arg0);
        } else {
            this.method4127((byte) -114, arg0);
        }
        float var5 = arg0.field6806.field905;
        float var6 = arg0.field6806.field935;
        if (arg2 != 24) {
            return;
        }
        float var7 = arg0.field6806.field913;
        float var8 = arg0.field6806.field927;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class112 var12 = arg3.field10344.field7154;
            for (class112 var13 = var12.field1623; var13 != var12; var13 = var13.field1623) {
                class18 var14 = (class18) var13;
                int var15 = (int) ((float) (var14.field338 >> 12) * var7 + (float) (var14.field339 >> 12) * var6 + (float) (var14.field333 >> 12) * var5 + var8);
                if (var10 > var15) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field10337[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class423.method2356(var16, 1) + (1 - this.field10334);
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            int var18 = 0;
            class112 var19 = var12.field1623;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field10338 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field10336[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field10339[var24] = 0;
                }
                while (var12 != var19) {
                    class18 var25 = (class18) var19;
                    if (var22) {
                        var20 = var25.field335;
                        var21 = var25.field334;
                        var22 = false;
                    }
                    if (var18 > 0 && (var25.field335 != var20 || var21 != var25.field334)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field10337[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field10336[var26] >= 64) {
                            label108: {
                                if (this.field10336[var26] == 64) {
                                    if (this.field10338 == 64) {
                                        break label108;
                                    }
                                    this.field10336[var26] += this.field10338++ + 1;
                                }
                                this.field10335[this.field10336[var26] - 65][this.field10339[this.field10336[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field10340[var26][this.field10336[var26]++] = var25;
                        }
                    }
                    var19 = var19.field1623;
                }
                if (var20 < 0) {
                    arg0.method2777(-1, arg2 ^ 0x19);
                } else {
                    arg0.method2777(var20, 1);
                }
                if (var21 && class658.field9158 != arg0.field6835) {
                    arg0.method511(class658.field9158);
                } else if (arg0.field6835 != 1.0F) {
                    arg0.method511(1.0F);
                }
                this.method4125(arg0, var16, 7048);
            }
        } catch (Exception var27) {
        }
        this.method4129(arg2 ^ 0xFFFFFFB9, arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbi;II)V", line = 198)
    private final void method4125(class483 arg0, int arg1, int arg2) {
        field10324++;
        OpenGL.glGetFloatv(2982, this.field10318, 0);
        float var4 = this.field10318[0];
        float var5 = this.field10318[4];
        if (arg2 != 7048) {
            return;
        }
        float var6 = this.field10318[8];
        float var7 = this.field10318[1];
        float var8 = this.field10318[5];
        float var9 = this.field10318[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field10323.field6193 = 0;
        if (arg0.field6903) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field10336[var44] > 64 ? 64 : this.field10336[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class18 var59 = this.field10340[var44][var46];
                        int var60 = var59.field337;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field333 >> 12);
                        float var66 = (float) (var59.field339 >> 12);
                        float var67 = (float) (var59.field338 >> 12);
                        int var68 = var59.field330 >> 12;
                        this.field10323.method4102(0.0F, (byte) -56);
                        this.field10323.method4102(0.0F, (byte) -56);
                        this.field10323.method4102((float) (-var68) * var10 + var65, (byte) -56);
                        this.field10323.method4102((float) (-var68) * var11 + var66, (byte) -56);
                        this.field10323.method4102((float) (-var68) * var12 + var67, (byte) -56);
                        this.field10323.method2578(var61, -1221492240);
                        this.field10323.method2578(var62, -1221492240);
                        this.field10323.method2578(var63, -1221492240);
                        this.field10323.method2578(var64, -1221492240);
                        this.field10323.method4102(1.0F, (byte) -56);
                        this.field10323.method4102(0.0F, (byte) -56);
                        this.field10323.method4102((float) var68 * var13 + var65, (byte) -56);
                        this.field10323.method4102((float) var68 * var14 + var66, (byte) -56);
                        this.field10323.method4102((float) var68 * var15 + var67, (byte) -56);
                        this.field10323.method2578(var61, arg2 ^ 0xB7319A78);
                        this.field10323.method2578(var62, -1221492240);
                        this.field10323.method2578(var63, -1221492240);
                        this.field10323.method2578(var64, -1221492240);
                        this.field10323.method4102(1.0F, (byte) -56);
                        this.field10323.method4102(1.0F, (byte) -56);
                        this.field10323.method4102((float) var68 * var10 + var65, (byte) -56);
                        this.field10323.method4102((float) var68 * var11 + var66, (byte) -56);
                        this.field10323.method4102((float) var68 * var12 + var67, (byte) -56);
                        this.field10323.method2578(var61, -1221492240);
                        this.field10323.method2578(var62, -1221492240);
                        this.field10323.method2578(var63, arg2 ^ 0xB7319A78);
                        this.field10323.method2578(var64, -1221492240);
                        this.field10323.method4102(0.0F, (byte) -56);
                        this.field10323.method4102(1.0F, (byte) -56);
                        this.field10323.method4102((float) var68 * var16 + var65, (byte) -56);
                        this.field10323.method4102((float) var68 * var17 + var66, (byte) -56);
                        this.field10323.method4102((float) var68 * var18 + var67, (byte) -56);
                        this.field10323.method2578(var61, -1221492240);
                        this.field10323.method2578(var62, arg2 ^ 0xB7319A78);
                        this.field10323.method2578(var63, -1221492240);
                        this.field10323.method2578(var64, -1221492240);
                    }
                    if (this.field10336[var44] > 64) {
                        int var47 = this.field10336[var44] - 1 - 64;
                        for (int var48 = this.field10339[var47] - 1; var48 >= 0; var48--) {
                            class18 var49 = this.field10335[var47][var48];
                            int var50 = var49.field337;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field333 >> 12);
                            float var56 = (float) (var49.field339 >> 12);
                            float var57 = (float) (var49.field338 >> 12);
                            int var58 = var49.field330 >> 12;
                            this.field10323.method4102(0.0F, (byte) -56);
                            this.field10323.method4102(0.0F, (byte) -56);
                            this.field10323.method4102((float) (-var58) * var10 + var55, (byte) -56);
                            this.field10323.method4102((float) (-var58) * var11 + var56, (byte) -56);
                            this.field10323.method4102((float) (-var58) * var12 + var57, (byte) -56);
                            this.field10323.method2578(var51, -1221492240);
                            this.field10323.method2578(var52, -1221492240);
                            this.field10323.method2578(var53, -1221492240);
                            this.field10323.method2578(var54, -1221492240);
                            this.field10323.method4102(1.0F, (byte) -56);
                            this.field10323.method4102(0.0F, (byte) -56);
                            this.field10323.method4102((float) var58 * var13 + var55, (byte) -56);
                            this.field10323.method4102((float) var58 * var14 + var56, (byte) -56);
                            this.field10323.method4102((float) var58 * var15 + var57, (byte) -56);
                            this.field10323.method2578(var51, -1221492240);
                            this.field10323.method2578(var52, -1221492240);
                            this.field10323.method2578(var53, -1221492240);
                            this.field10323.method2578(var54, arg2 - 1221499288);
                            this.field10323.method4102(1.0F, (byte) -56);
                            this.field10323.method4102(1.0F, (byte) -56);
                            this.field10323.method4102((float) var58 * var10 + var55, (byte) -56);
                            this.field10323.method4102((float) var58 * var11 + var56, (byte) -56);
                            this.field10323.method4102((float) var58 * var12 + var57, (byte) -56);
                            this.field10323.method2578(var51, arg2 ^ 0xB7319A78);
                            this.field10323.method2578(var52, -1221492240);
                            this.field10323.method2578(var53, -1221492240);
                            this.field10323.method2578(var54, -1221492240);
                            this.field10323.method4102(0.0F, (byte) -56);
                            this.field10323.method4102(1.0F, (byte) -56);
                            this.field10323.method4102((float) var58 * var16 + var55, (byte) -56);
                            this.field10323.method4102((float) var58 * var17 + var56, (byte) -56);
                            this.field10323.method4102((float) var58 * var18 + var57, (byte) -56);
                            this.field10323.method2578(var51, arg2 ^ 0xB7319A78);
                            this.field10323.method2578(var52, -1221492240);
                            this.field10323.method2578(var53, -1221492240);
                            this.field10323.method2578(var54, -1221492240);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field10336[var19] > 64 ? 64 : this.field10336[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class18 var34 = this.field10340[var19][var21];
                        int var35 = var34.field337;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field333 >> 12);
                        float var41 = (float) (var34.field339 >> 12);
                        float var42 = (float) (var34.field338 >> 12);
                        int var43 = var34.field330 >> 12;
                        this.field10323.method4104(1482486504, 0.0F);
                        this.field10323.method4104(1482486504, 0.0F);
                        this.field10323.method4104(arg2 + 1482479456, (float) (-var43) * var10 + var40);
                        this.field10323.method4104(1482486504, (float) (-var43) * var11 + var41);
                        this.field10323.method4104(arg2 ^ 0x585CE960, (float) (-var43) * var12 + var42);
                        this.field10323.method2578(var36, -1221492240);
                        this.field10323.method2578(var37, -1221492240);
                        this.field10323.method2578(var38, -1221492240);
                        this.field10323.method2578(var39, -1221492240);
                        this.field10323.method4104(1482486504, 1.0F);
                        this.field10323.method4104(1482486504, 0.0F);
                        this.field10323.method4104(1482486504, (float) var43 * var13 + var40);
                        this.field10323.method4104(1482486504, (float) var43 * var14 + var41);
                        this.field10323.method4104(1482486504, (float) var43 * var15 + var42);
                        this.field10323.method2578(var36, -1221492240);
                        this.field10323.method2578(var37, -1221492240);
                        this.field10323.method2578(var38, arg2 ^ 0xB7319A78);
                        this.field10323.method2578(var39, -1221492240);
                        this.field10323.method4104(1482486504, 1.0F);
                        this.field10323.method4104(1482486504, 1.0F);
                        this.field10323.method4104(1482486504, (float) var43 * var10 + var40);
                        this.field10323.method4104(1482486504, (float) var43 * var11 + var41);
                        this.field10323.method4104(arg2 ^ 0x585CE960, (float) var43 * var12 + var42);
                        this.field10323.method2578(var36, -1221492240);
                        this.field10323.method2578(var37, arg2 - 1221499288);
                        this.field10323.method2578(var38, -1221492240);
                        this.field10323.method2578(var39, arg2 - 1221499288);
                        this.field10323.method4104(1482486504, 0.0F);
                        this.field10323.method4104(arg2 + 1482479456, 1.0F);
                        this.field10323.method4104(1482486504, (float) var43 * var16 + var40);
                        this.field10323.method4104(1482486504, (float) var43 * var17 + var41);
                        this.field10323.method4104(1482486504, (float) var43 * var18 + var42);
                        this.field10323.method2578(var36, -1221492240);
                        this.field10323.method2578(var37, -1221492240);
                        this.field10323.method2578(var38, -1221492240);
                        this.field10323.method2578(var39, -1221492240);
                    }
                    if (this.field10336[var19] > 64) {
                        int var22 = this.field10336[var19] - 64 - 1;
                        for (int var23 = this.field10339[var22] - 1; var23 >= 0; var23--) {
                            class18 var24 = this.field10335[var22][var23];
                            int var25 = var24.field337;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field333 >> 12);
                            float var31 = (float) (var24.field339 >> 12);
                            float var32 = (float) (var24.field338 >> 12);
                            int var33 = var24.field330 >> 12;
                            this.field10323.method4104(1482486504, 0.0F);
                            this.field10323.method4104(1482486504, 0.0F);
                            this.field10323.method4104(arg2 + 1482479456, (float) (-var33) * var10 + var30);
                            this.field10323.method4104(1482486504, (float) (-var33) * var11 + var31);
                            this.field10323.method4104(1482486504, (float) (-var33) * var12 + var32);
                            this.field10323.method2578(var26, -1221492240);
                            this.field10323.method2578(var27, -1221492240);
                            this.field10323.method2578(var28, -1221492240);
                            this.field10323.method2578(var29, -1221492240);
                            this.field10323.method4104(arg2 ^ 0x585CE960, 1.0F);
                            this.field10323.method4104(arg2 + 1482479456, 0.0F);
                            this.field10323.method4104(arg2 ^ 0x585CE960, (float) var33 * var13 + var30);
                            this.field10323.method4104(1482486504, (float) var33 * var14 + var31);
                            this.field10323.method4104(1482486504, (float) var33 * var15 + var32);
                            this.field10323.method2578(var26, -1221492240);
                            this.field10323.method2578(var27, -1221492240);
                            this.field10323.method2578(var28, -1221492240);
                            this.field10323.method2578(var29, -1221492240);
                            this.field10323.method4104(1482486504, 1.0F);
                            this.field10323.method4104(arg2 ^ 0x585CE960, 1.0F);
                            this.field10323.method4104(1482486504, (float) var33 * var10 + var30);
                            this.field10323.method4104(1482486504, (float) var33 * var11 + var31);
                            this.field10323.method4104(1482486504, (float) var33 * var12 + var32);
                            this.field10323.method2578(var26, -1221492240);
                            this.field10323.method2578(var27, -1221492240);
                            this.field10323.method2578(var28, -1221492240);
                            this.field10323.method2578(var29, arg2 - 1221499288);
                            this.field10323.method4104(1482486504, 0.0F);
                            this.field10323.method4104(arg2 + 1482479456, 1.0F);
                            this.field10323.method4104(1482486504, (float) var33 * var16 + var30);
                            this.field10323.method4104(1482486504, (float) var33 * var17 + var31);
                            this.field10323.method4104(1482486504, (float) var33 * var18 + var32);
                            this.field10323.method2578(var26, -1221492240);
                            this.field10323.method2578(var27, -1221492240);
                            this.field10323.method2578(var28, -1221492240);
                            this.field10323.method2578(var29, -1221492240);
                        }
                    }
                }
            }
        }
        if (this.field10323.field6193 != 0) {
            this.field10329.method958(24, this.field10323.field6193, this.field10323.field6180, (byte) 120);
            arg0.method2821((byte) -48, null, this.field10328, this.field10326, this.field10327);
            arg0.method2843(this.field10323.field6193 / 24, 7, (byte) -66, 0);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lbi;I)V", line = 553)
    public final void method4126(class483 arg0, int arg1) {
        field10316++;
        this.field10329 = arg0.method2814(80, null, true, 196584, 24);
        this.field10327 = new class578(this.field10329, 5126, 2, 0);
        if (arg1 != -14561) {
            method4122((byte) -114, -46);
        }
        this.field10328 = new class578(this.field10329, 5126, 3, 8);
        this.field10326 = new class578(this.field10329, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLbi;)V", line = 567)
    private final void method4127(byte arg0, class483 arg1) {
        field10321++;
        class658.field9158 = arg1.field6835;
        arg1.method2784(-9);
        if (arg0 >= -16) {
            this.method4125(null, -88, 14);
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2816((byte) -88, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBLbi;)V", line = 583)
    private final void method4128(int arg0, byte arg1, class483 arg2) {
        field10322++;
        if (arg1 != -121) {
            this.field10326 = null;
        }
        class658.field9158 = arg2.field6835;
        arg2.method2808((float) arg0, (byte) 9);
        arg2.method2797((byte) -27);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2816((byte) -90, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILbi;)V", line = 616)
    private final void method4129(int arg0, class483 arg1) {
        field10320++;
        arg1.method2816((byte) -102, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (arg0 <= -54 && class658.field9158 != arg1.field6835) {
            arg1.method511(class658.field9158);
        }
    }
}
