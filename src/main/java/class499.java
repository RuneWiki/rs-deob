import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class499 {

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[F")
    private float[] field7297 = new float[16];

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Ldv;")
    private class504 field7300 = new class504(786336);

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    private int field7309 = class331.method1955((byte) -108, 1600);

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "[I")
    private int[] field7312 = new int[64];

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "[I")
    private int[] field7311 = new int[1600];

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "[I")
    private int[] field7315 = new int[8191];

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "[[Lfv;")
    private class526[][] field7313 = new class526[1600][64];

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    private int field7314 = 0;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "[[Lfv;")
    private class526[][] field7316 = new class526[64][768];

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field7304 = 0;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
    public static int field7299 = 1;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "Lsn;")
    public static class205 field7294 = new class205(9, 6);

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "F")
    public static float field7310;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lnn;")
    private class171 field7305;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lhf;")
    private class475 field7306;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "Lhf;")
    private class475 field7307;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "Lhf;")
    private class475 field7308;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ZLpg;I)V", line = 3)
    private final void method2969(boolean arg0, class333 arg1, int arg2) {
        field7302++;
        OpenGL.glGetFloatv(2982, this.field7297, 0);
        float var4 = this.field7297[0];
        float var5 = this.field7297[4];
        float var6 = this.field7297[8];
        float var7 = this.field7297[1];
        float var8 = this.field7297[5];
        float var9 = this.field7297[9];
        if (!arg0) {
            method2974(-11);
        }
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7300.field4360 = 0;
        float var18 = var9 - var6;
        if (arg1.field4796) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7311[var19] > 64 ? 64 : this.field7311[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class526 var34 = this.field7313[var19][var21];
                        int var35 = var34.field7680;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7678 >> 12);
                        float var41 = (float) (var34.field7679 >> 12);
                        float var42 = (float) (var34.field7682 >> 12);
                        int var43 = var34.field7676 >> 12;
                        this.field7300.method2988(-100, 0.0F);
                        this.field7300.method2988(-64, 0.0F);
                        this.field7300.method2988(-109, (float) (-var43) * var10 + var40);
                        this.field7300.method2988(-47, (float) (-var43) * var11 + var41);
                        this.field7300.method2988(-74, (float) (-var43) * var12 + var42);
                        this.field7300.method1891(false, var36);
                        this.field7300.method1891(false, var37);
                        this.field7300.method1891(!arg0, var38);
                        this.field7300.method1891(false, var39);
                        this.field7300.method2988(-89, 1.0F);
                        this.field7300.method2988(-78, 0.0F);
                        this.field7300.method2988(-37, (float) var43 * var13 + var40);
                        this.field7300.method2988(-80, (float) var43 * var14 + var41);
                        this.field7300.method2988(-52, (float) var43 * var15 + var42);
                        this.field7300.method1891(false, var36);
                        this.field7300.method1891(false, var37);
                        this.field7300.method1891(false, var38);
                        this.field7300.method1891(false, var39);
                        this.field7300.method2988(-80, 1.0F);
                        this.field7300.method2988(-105, 1.0F);
                        this.field7300.method2988(-75, (float) var43 * var10 + var40);
                        this.field7300.method2988(-102, (float) var43 * var11 + var41);
                        this.field7300.method2988(-68, (float) var43 * var12 + var42);
                        this.field7300.method1891(false, var36);
                        this.field7300.method1891(false, var37);
                        this.field7300.method1891(!arg0, var38);
                        this.field7300.method1891(false, var39);
                        this.field7300.method2988(-37, 0.0F);
                        this.field7300.method2988(-110, 1.0F);
                        this.field7300.method2988(-101, (float) var43 * var16 + var40);
                        this.field7300.method2988(-49, (float) var43 * var17 + var41);
                        this.field7300.method2988(-40, (float) var43 * var18 + var42);
                        this.field7300.method1891(false, var36);
                        this.field7300.method1891(false, var37);
                        this.field7300.method1891(false, var38);
                        this.field7300.method1891(!arg0, var39);
                    }
                    if (this.field7311[var19] > 64) {
                        int var22 = this.field7311[var19] - 1 - 64;
                        for (int var23 = this.field7312[var22] - 1; var23 >= 0; var23--) {
                            class526 var24 = this.field7316[var22][var23];
                            int var25 = var24.field7680;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7678 >> 12);
                            float var31 = (float) (var24.field7679 >> 12);
                            float var32 = (float) (var24.field7682 >> 12);
                            int var33 = var24.field7676 >> 12;
                            this.field7300.method2988(-77, 0.0F);
                            this.field7300.method2988(-109, 0.0F);
                            this.field7300.method2988(-100, (float) (-var33) * var10 + var30);
                            this.field7300.method2988(-78, (float) (-var33) * var11 + var31);
                            this.field7300.method2988(-35, (float) (-var33) * var12 + var32);
                            this.field7300.method1891(false, var26);
                            this.field7300.method1891(!arg0, var27);
                            this.field7300.method1891(!arg0, var28);
                            this.field7300.method1891(false, var29);
                            this.field7300.method2988(-88, 1.0F);
                            this.field7300.method2988(-66, 0.0F);
                            this.field7300.method2988(-95, (float) var33 * var13 + var30);
                            this.field7300.method2988(-60, (float) var33 * var14 + var31);
                            this.field7300.method2988(-127, (float) var33 * var15 + var32);
                            this.field7300.method1891(false, var26);
                            this.field7300.method1891(!arg0, var27);
                            this.field7300.method1891(false, var28);
                            this.field7300.method1891(false, var29);
                            this.field7300.method2988(-69, 1.0F);
                            this.field7300.method2988(-94, 1.0F);
                            this.field7300.method2988(-80, (float) var33 * var10 + var30);
                            this.field7300.method2988(-125, (float) var33 * var11 + var31);
                            this.field7300.method2988(-83, (float) var33 * var12 + var32);
                            this.field7300.method1891(!arg0, var26);
                            this.field7300.method1891(false, var27);
                            this.field7300.method1891(false, var28);
                            this.field7300.method1891(false, var29);
                            this.field7300.method2988(-76, 0.0F);
                            this.field7300.method2988(-63, 1.0F);
                            this.field7300.method2988(-111, (float) var33 * var16 + var30);
                            this.field7300.method2988(-104, (float) var33 * var17 + var31);
                            this.field7300.method2988(-101, (float) var33 * var18 + var32);
                            this.field7300.method1891(false, var26);
                            this.field7300.method1891(false, var27);
                            this.field7300.method1891(false, var28);
                            this.field7300.method1891(!arg0, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7311[var44] > 64 ? 64 : this.field7311[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class526 var59 = this.field7313[var44][var46];
                        int var60 = var59.field7680;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7678 >> 12);
                        float var66 = (float) (var59.field7679 >> 12);
                        float var67 = (float) (var59.field7682 >> 12);
                        int var68 = var59.field7676 >> 12;
                        this.field7300.method2989(0.0F, -13163);
                        this.field7300.method2989(0.0F, -13163);
                        this.field7300.method2989((float) (-var68) * var10 + var65, -13163);
                        this.field7300.method2989((float) (-var68) * var11 + var66, -13163);
                        this.field7300.method2989((float) (-var68) * var12 + var67, -13163);
                        this.field7300.method1891(false, var61);
                        this.field7300.method1891(false, var62);
                        this.field7300.method1891(false, var63);
                        this.field7300.method1891(false, var64);
                        this.field7300.method2989(1.0F, -13163);
                        this.field7300.method2989(0.0F, -13163);
                        this.field7300.method2989((float) var68 * var13 + var65, -13163);
                        this.field7300.method2989((float) var68 * var14 + var66, -13163);
                        this.field7300.method2989((float) var68 * var15 + var67, -13163);
                        this.field7300.method1891(false, var61);
                        this.field7300.method1891(!arg0, var62);
                        this.field7300.method1891(false, var63);
                        this.field7300.method1891(false, var64);
                        this.field7300.method2989(1.0F, -13163);
                        this.field7300.method2989(1.0F, -13163);
                        this.field7300.method2989((float) var68 * var10 + var65, -13163);
                        this.field7300.method2989((float) var68 * var11 + var66, -13163);
                        this.field7300.method2989((float) var68 * var12 + var67, -13163);
                        this.field7300.method1891(false, var61);
                        this.field7300.method1891(!arg0, var62);
                        this.field7300.method1891(false, var63);
                        this.field7300.method1891(false, var64);
                        this.field7300.method2989(0.0F, -13163);
                        this.field7300.method2989(1.0F, -13163);
                        this.field7300.method2989((float) var68 * var16 + var65, -13163);
                        this.field7300.method2989((float) var68 * var17 + var66, -13163);
                        this.field7300.method2989((float) var68 * var18 + var67, -13163);
                        this.field7300.method1891(false, var61);
                        this.field7300.method1891(false, var62);
                        this.field7300.method1891(false, var63);
                        this.field7300.method1891(false, var64);
                    }
                    if (this.field7311[var44] > 64) {
                        int var47 = this.field7311[var44] - 64 - 1;
                        for (int var48 = this.field7312[var47] - 1; var48 >= 0; var48--) {
                            class526 var49 = this.field7316[var47][var48];
                            int var50 = var49.field7680;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7678 >> 12);
                            float var56 = (float) (var49.field7679 >> 12);
                            float var57 = (float) (var49.field7682 >> 12);
                            int var58 = var49.field7676 >> 12;
                            this.field7300.method2989(0.0F, -13163);
                            this.field7300.method2989(0.0F, -13163);
                            this.field7300.method2989((float) (-var58) * var10 + var55, -13163);
                            this.field7300.method2989((float) (-var58) * var11 + var56, -13163);
                            this.field7300.method2989((float) (-var58) * var12 + var57, -13163);
                            this.field7300.method1891(false, var51);
                            this.field7300.method1891(false, var52);
                            this.field7300.method1891(!arg0, var53);
                            this.field7300.method1891(!arg0, var54);
                            this.field7300.method2989(1.0F, -13163);
                            this.field7300.method2989(0.0F, -13163);
                            this.field7300.method2989((float) var58 * var13 + var55, -13163);
                            this.field7300.method2989((float) var58 * var14 + var56, -13163);
                            this.field7300.method2989((float) var58 * var15 + var57, -13163);
                            this.field7300.method1891(false, var51);
                            this.field7300.method1891(!arg0, var52);
                            this.field7300.method1891(false, var53);
                            this.field7300.method1891(false, var54);
                            this.field7300.method2989(1.0F, -13163);
                            this.field7300.method2989(1.0F, -13163);
                            this.field7300.method2989((float) var58 * var10 + var55, -13163);
                            this.field7300.method2989((float) var58 * var11 + var56, -13163);
                            this.field7300.method2989((float) var58 * var12 + var57, -13163);
                            this.field7300.method1891(false, var51);
                            this.field7300.method1891(!arg0, var52);
                            this.field7300.method1891(false, var53);
                            this.field7300.method1891(false, var54);
                            this.field7300.method2989(0.0F, -13163);
                            this.field7300.method2989(1.0F, -13163);
                            this.field7300.method2989((float) var58 * var16 + var55, -13163);
                            this.field7300.method2989((float) var58 * var17 + var56, -13163);
                            this.field7300.method2989((float) var58 * var18 + var57, -13163);
                            this.field7300.method1891(!arg0, var51);
                            this.field7300.method1891(false, var52);
                            this.field7300.method1891(false, var53);
                            this.field7300.method1891(!arg0, var54);
                        }
                    }
                }
            }
        }
        if (this.field7300.field4360 != 0) {
            this.field7305.method878(this.field7300.field4360, 24, this.field7300.field4336, (byte) -32);
            arg1.method1973(this.field7307, null, this.field7308, this.field7306, 32888);
            arg1.method1962(this.field7300.field4360 / 24, 104, 7, 0);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLvk;Lpg;)V", line = 359)
    public final void method2970(byte arg0, class334 arg1, class333 arg2) {
        field7303++;
        if (arg2.field4851 == null) {
            return;
        }
        this.method2975(arg2, (byte) -123);
        if (arg0 > -98) {
            field7298 = -60;
        }
        float var4 = arg2.field4851.field7471;
        float var5 = arg2.field4851.field7498;
        float var6 = arg2.field4851.field7473;
        float var7 = arg2.field4851.field7484;
        try {
            if (arg1.field4877) {
                int var8 = arg1.field4881 - arg1.field4878;
                int var9;
                if (var8 + 2 <= 1600) {
                    var9 = 0;
                    var8 += 2;
                } else {
                    var9 = class331.method1955((byte) -108, var8) + 1 - this.field7309;
                    var8 = (var8 >> var9) + 2;
                }
                class423 var10 = arg1.field4875.field1902;
                class423 var11 = var10.field6146;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field7314 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field7311[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field7312[var16] = 0;
                    }
                    while (var10 != var11) {
                        class526 var17 = (class526) var11;
                        if (var14) {
                            var13 = var17.field7685;
                            var12 = var17.field7683;
                            var14 = false;
                        } else if (var17.field7683 != var12 || var17.field7685 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field7682 >> 12) * var6 + (float) (var17.field7679 >> 12) * var5 + (float) (var17.field7678 >> 12) * var4 + var7) - arg1.field4878 >> var9;
                        if (var18 < 1600) {
                            if (this.field7311[var18] >= 64) {
                                label189: {
                                    if (this.field7311[var18] == 64) {
                                        if (this.field7314 == 64) {
                                            break label189;
                                        }
                                        this.field7311[var18] += this.field7314++ + 1;
                                    }
                                    this.field7316[this.field7311[var18] - 1 - 64][this.field7312[this.field7311[var18] - 1 - 64]++] = var17;
                                }
                            } else {
                                this.field7313[var18][this.field7311[var18]++] = var17;
                            }
                        }
                        var11 = var11.field6146;
                    }
                    if (var12 >= 0) {
                        arg2.method1977(arg2.field4715.method1425(-119, var12), true);
                        arg2.method1966(-1, arg2.field3988.method914(false, var12).field3378);
                    } else {
                        arg2.method1977(null, true);
                    }
                    if (var13 && class365.field5247 != arg2.field4778) {
                        arg2.method554(class365.field5247);
                    } else if (arg2.field4778 != 1.0F) {
                        arg2.method554(1.0F);
                    }
                    this.method2969(true, arg2, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class423 var22 = arg1.field4875.field1902;
                for (class423 var23 = var22.field6146; var23 != var22; var23 = var23.field6146) {
                    class526 var24 = (class526) var23;
                    int var25 = (int) ((float) (var24.field7682 >> 12) * var6 + (float) (var24.field7679 >> 12) * var5 + (float) (var24.field7678 >> 12) * var4 + var7);
                    this.field7315[var19++] = var25;
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    if (var25 < var20) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class331.method1955((byte) -108, var26) + 1 - this.field7309;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class423 var28 = var22.field6146;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field7314 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field7311[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field7312[var34] = 0;
                    }
                    while (var22 != var28) {
                        class526 var35 = (class526) var28;
                        if (var32) {
                            var31 = var35.field7685;
                            var30 = var35.field7683;
                            var32 = false;
                        }
                        if (var29 > 0 && (var35.field7683 != var30 || var31 != var35.field7685)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field7315[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field7311[var36] >= 64) {
                                label140: {
                                    if (this.field7311[var36] == 64) {
                                        if (this.field7314 == 64) {
                                            break label140;
                                        }
                                        this.field7311[var36] += (this.field7314++) + 1;
                                    }
                                    this.field7316[this.field7311[var36] - 1 - 64][this.field7312[this.field7311[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field7313[var36][this.field7311[var36]++] = var35;
                            }
                        }
                        var28 = var28.field6146;
                    }
                    if (var30 < 0) {
                        arg2.method1977(null, true);
                    } else {
                        arg2.method1977(arg2.field4715.method1425(-99, var30), true);
                        arg2.method1966(-1, arg2.field3988.method914(false, var30).field3378);
                    }
                    if (var31 && class365.field5247 != arg2.field4778) {
                        arg2.method554(class365.field5247);
                    } else if (arg2.field4778 != 1.0F) {
                        arg2.method554(1.0F);
                    }
                    this.method2969(true, arg2, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method2971(-103, arg2);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILpg;)V", line = 651)
    private final void method2971(int arg0, class333 arg1) {
        field7295++;
        arg1.method2025(-32, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class365.field5247 != arg1.field4778) {
            arg1.method554(class365.field5247);
        }
        if (arg0 > -95) {
            this.field7297 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLpg;)V", line = 669)
    public final void method2972(byte arg0, class333 arg1) {
        this.field7305 = arg1.method1983(196584, true, 24, null, 1);
        field7301++;
        this.field7307 = new class475(this.field7305, 5126, 2, 0);
        this.field7306 = new class475(this.field7305, 5126, 3, 8);
        this.field7308 = new class475(this.field7305, 5121, 4, 20);
        if (arg0 >= -77) {
            this.field7300 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIFFIIIIII[F)V", line = 687)
    public static final void method2973(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        field7296++;
        int var11 = arg6 - arg8;
        int var12 = arg0 - arg5;
        int var13 = arg4 - arg9;
        float var14 = arg10[2] * (float) var11 + arg10[0] * (float) var13 + arg10[1] * (float) var12;
        float var15 = arg10[5] * (float) var11 + arg10[3] * (float) var13 + arg10[4] * (float) var12;
        float var16 = arg10[8] * (float) var11 + arg10[6] * (float) var13 + arg10[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg2 != 1.0F) {
            var17 = arg2 * var17;
        }
        if (arg7 != 2566) {
            method2973(109, 95, 1.0934732F, 0.3896485F, 66, 96, 45, 79, -1, 23, null);
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class42.field622 = var17;
        class380.field5459 = var18;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 747)
    public static void method2974(int arg0) {
        if (arg0 != 12077) {
            method2974(-29);
        }
        field7294 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lpg;B)V", line = 764)
    private final void method2975(class333 arg0, byte arg1) {
        field7292++;
        class365.field5247 = arg0.field4778;
        arg0.method2030((byte) 84);
        if (arg1 > -94) {
            return;
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2025(-32, false);
        arg0.method1998(-2, (byte) -53);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lub;IZI)Lho;", line = 786)
    public static final class343 method2976(class301 arg0, int arg1, boolean arg2, int arg3) {
        field7293++;
        int var4 = arg0.field4111 | arg3 << 8;
        class343 var5 = (class343) class199.field2898.method2371((long) var4 << 16, -106);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class358.field5162.method2496(class358.field5162.method2515((byte) 119, var4), 95);
        if (var6 == null) {
            int var8 = arg1 + 65536 << 8 | arg0.field4111;
            class343 var9 = (class343) class199.field2898.method2371((long) var8 << 16, -52);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class358.field5162.method2496(class358.field5162.method2515((byte) 119, var8), 67);
            if (var10 == null) {
                int var12 = arg0.field4111 | 0xFFFF00;
                class343 var13 = (class343) class199.field2898.method2371((long) var12 << 16, -40);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class358.field5162.method2496(class358.field5162.method2515((byte) 119, var12), -118);
                if (arg2) {
                    field7298 = -125;
                }
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class343 var15 = class116.method865((byte) -126, var14);
                    var15.field4950 = arg0;
                    class199.field2898.method2370(28281, (long) var12 << 16, var15);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class343 var11 = class116.method865((byte) -126, var10);
                var11.field4950 = arg0;
                class199.field2898.method2370(28281, (long) var8 << 16, var11);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class343 var7 = class116.method865((byte) -126, var6);
            var7.field4950 = arg0;
            class199.field2898.method2370(28281, (long) var4 << 16, var7);
            return var7;
        }
    }
}
