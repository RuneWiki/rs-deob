import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class677 {

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[F")
    private float[] field9697 = new float[16];

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "Lkw;")
    private class226 field9698 = new class226(786336);

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    private int field9711 = class565.method3314((byte) 17, 1600);

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "[[Lmca;")
    private class29[][] field9717 = new class29[64][768];

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    private int field9718 = 0;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
    private int[] field9720 = new int[64];

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "[I")
    private int[] field9719 = new int[8191];

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "[[Lmca;")
    private class29[][] field9716 = new class29[1600][64];

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "[I")
    private int[] field9721 = new int[1600];

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field9699 = 0;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Z")
    public static boolean field9706 = false;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "[[I")
    public static int[][] field9704 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field9710 = 0;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Ljk;")
    public static class585 field9702 = new class585(43, 8);

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "Lwo;")
    public static class690 field9715 = new class690(36, 20);

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "Lrba;")
    private class399 field9709;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "Lrba;")
    private class399 field9713;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Lrba;")
    private class399 field9714;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "Lew;")
    private class458 field9712;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "[Lte;")
    public static class568[] field9705;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLkga;)V", line = 3)
    public final void method3842(byte arg0, class506 arg1) {
        this.field9712 = arg1.method2963(null, true, true, 24, 196584);
        field9708++;
        if (arg0 != -53) {
            this.method3847(-16, null);
        }
        this.field9713 = new class399(this.field9712, 5126, 2, 0);
        this.field9714 = new class399(this.field9712, 5126, 3, 8);
        this.field9709 = new class399(this.field9712, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lkga;I)V", line = 23)
    private final void method3843(class506 arg0, int arg1) {
        field9703++;
        arg0.method2931((byte) -103, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class500.field6992 != arg0.field7311) {
            arg0.method239(class500.field6992);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZLkga;)V", line = 43)
    private final void method3844(int arg0, boolean arg1, class506 arg2) {
        OpenGL.glGetFloatv(2982, this.field9697, 0);
        field9701++;
        float var4 = this.field9697[0];
        float var5 = this.field9697[4];
        float var6 = this.field9697[8];
        float var7 = this.field9697[1];
        float var8 = this.field9697[5];
        float var9 = this.field9697[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        if (!arg1) {
            return;
        }
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field9698.field5195 = 0;
        if (arg2.field7353) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field9721[var44] > 64 ? 64 : this.field9721[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class29 var59 = this.field9716[var44][var46];
                        int var60 = var59.field618;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field624 >> 12);
                        float var66 = (float) (var59.field623 >> 12);
                        float var67 = (float) (var59.field625 >> 12);
                        int var68 = var59.field622 >> 12;
                        this.field9698.method1377(134389112, 0.0F);
                        this.field9698.method1377(134389112, 0.0F);
                        this.field9698.method1377(134389112, (float) (-var68) * var10 + var65);
                        this.field9698.method1377(134389112, (float) (-var68) * var11 + var66);
                        this.field9698.method1377(134389112, (float) (-var68) * var12 + var67);
                        this.field9698.method2281((byte) 58, var61);
                        this.field9698.method2281((byte) 58, var62);
                        this.field9698.method2281((byte) 58, var63);
                        this.field9698.method2281((byte) 58, var64);
                        this.field9698.method1377(134389112, 1.0F);
                        this.field9698.method1377(134389112, 0.0F);
                        this.field9698.method1377(134389112, (float) var68 * var13 + var65);
                        this.field9698.method1377(134389112, (float) var68 * var14 + var66);
                        this.field9698.method1377(134389112, (float) var68 * var15 + var67);
                        this.field9698.method2281((byte) 58, var61);
                        this.field9698.method2281((byte) 58, var62);
                        this.field9698.method2281((byte) 58, var63);
                        this.field9698.method2281((byte) 58, var64);
                        this.field9698.method1377(134389112, 1.0F);
                        this.field9698.method1377(134389112, 1.0F);
                        this.field9698.method1377(134389112, (float) var68 * var10 + var65);
                        this.field9698.method1377(134389112, (float) var68 * var11 + var66);
                        this.field9698.method1377(134389112, (float) var68 * var12 + var67);
                        this.field9698.method2281((byte) 58, var61);
                        this.field9698.method2281((byte) 58, var62);
                        this.field9698.method2281((byte) 58, var63);
                        this.field9698.method2281((byte) 58, var64);
                        this.field9698.method1377(134389112, 0.0F);
                        this.field9698.method1377(134389112, 1.0F);
                        this.field9698.method1377(134389112, (float) var68 * var16 + var65);
                        this.field9698.method1377(134389112, (float) var68 * var17 + var66);
                        this.field9698.method1377(134389112, (float) var68 * var18 + var67);
                        this.field9698.method2281((byte) 58, var61);
                        this.field9698.method2281((byte) 58, var62);
                        this.field9698.method2281((byte) 58, var63);
                        this.field9698.method2281((byte) 58, var64);
                    }
                    if (this.field9721[var44] > 64) {
                        int var47 = this.field9721[var44] - 65;
                        for (int var48 = this.field9720[var47] - 1; var48 >= 0; var48--) {
                            class29 var49 = this.field9717[var47][var48];
                            int var50 = var49.field618;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field624 >> 12);
                            float var56 = (float) (var49.field623 >> 12);
                            float var57 = (float) (var49.field625 >> 12);
                            int var58 = var49.field622 >> 12;
                            this.field9698.method1377(134389112, 0.0F);
                            this.field9698.method1377(134389112, 0.0F);
                            this.field9698.method1377(134389112, (float) (-var58) * var10 + var55);
                            this.field9698.method1377(134389112, (float) (-var58) * var11 + var56);
                            this.field9698.method1377(134389112, (float) (-var58) * var12 + var57);
                            this.field9698.method2281((byte) 58, var51);
                            this.field9698.method2281((byte) 58, var52);
                            this.field9698.method2281((byte) 58, var53);
                            this.field9698.method2281((byte) 58, var54);
                            this.field9698.method1377(134389112, 1.0F);
                            this.field9698.method1377(134389112, 0.0F);
                            this.field9698.method1377(134389112, (float) var58 * var13 + var55);
                            this.field9698.method1377(134389112, (float) var58 * var14 + var56);
                            this.field9698.method1377(134389112, (float) var58 * var15 + var57);
                            this.field9698.method2281((byte) 58, var51);
                            this.field9698.method2281((byte) 58, var52);
                            this.field9698.method2281((byte) 58, var53);
                            this.field9698.method2281((byte) 58, var54);
                            this.field9698.method1377(134389112, 1.0F);
                            this.field9698.method1377(134389112, 1.0F);
                            this.field9698.method1377(134389112, (float) var58 * var10 + var55);
                            this.field9698.method1377(134389112, (float) var58 * var11 + var56);
                            this.field9698.method1377(134389112, (float) var58 * var12 + var57);
                            this.field9698.method2281((byte) 58, var51);
                            this.field9698.method2281((byte) 58, var52);
                            this.field9698.method2281((byte) 58, var53);
                            this.field9698.method2281((byte) 58, var54);
                            this.field9698.method1377(134389112, 0.0F);
                            this.field9698.method1377(134389112, 1.0F);
                            this.field9698.method1377(134389112, (float) var58 * var16 + var55);
                            this.field9698.method1377(134389112, (float) var58 * var17 + var56);
                            this.field9698.method1377(134389112, (float) var58 * var18 + var57);
                            this.field9698.method2281((byte) 58, var51);
                            this.field9698.method2281((byte) 58, var52);
                            this.field9698.method2281((byte) 58, var53);
                            this.field9698.method2281((byte) 58, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field9721[var19] <= 64 ? this.field9721[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class29 var34 = this.field9716[var19][var21];
                        int var35 = var34.field618;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field624 >> 12);
                        float var41 = (float) (var34.field623 >> 12);
                        float var42 = (float) (var34.field625 >> 12);
                        int var43 = var34.field622 >> 12;
                        this.field9698.method1376(0.0F, (byte) -103);
                        this.field9698.method1376(0.0F, (byte) -93);
                        this.field9698.method1376((float) (-var43) * var10 + var40, (byte) -90);
                        this.field9698.method1376((float) (-var43) * var11 + var41, (byte) -128);
                        this.field9698.method1376((float) (-var43) * var12 + var42, (byte) -97);
                        this.field9698.method2281((byte) 58, var36);
                        this.field9698.method2281((byte) 58, var37);
                        this.field9698.method2281((byte) 58, var38);
                        this.field9698.method2281((byte) 58, var39);
                        this.field9698.method1376(1.0F, (byte) -85);
                        this.field9698.method1376(0.0F, (byte) -64);
                        this.field9698.method1376((float) var43 * var13 + var40, (byte) -95);
                        this.field9698.method1376((float) var43 * var14 + var41, (byte) -77);
                        this.field9698.method1376((float) var43 * var15 + var42, (byte) -74);
                        this.field9698.method2281((byte) 58, var36);
                        this.field9698.method2281((byte) 58, var37);
                        this.field9698.method2281((byte) 58, var38);
                        this.field9698.method2281((byte) 58, var39);
                        this.field9698.method1376(1.0F, (byte) -77);
                        this.field9698.method1376(1.0F, (byte) -86);
                        this.field9698.method1376((float) var43 * var10 + var40, (byte) -66);
                        this.field9698.method1376((float) var43 * var11 + var41, (byte) -111);
                        this.field9698.method1376((float) var43 * var12 + var42, (byte) -99);
                        this.field9698.method2281((byte) 58, var36);
                        this.field9698.method2281((byte) 58, var37);
                        this.field9698.method2281((byte) 58, var38);
                        this.field9698.method2281((byte) 58, var39);
                        this.field9698.method1376(0.0F, (byte) -61);
                        this.field9698.method1376(1.0F, (byte) -116);
                        this.field9698.method1376((float) var43 * var16 + var40, (byte) -67);
                        this.field9698.method1376((float) var43 * var17 + var41, (byte) -61);
                        this.field9698.method1376((float) var43 * var18 + var42, (byte) -105);
                        this.field9698.method2281((byte) 58, var36);
                        this.field9698.method2281((byte) 58, var37);
                        this.field9698.method2281((byte) 58, var38);
                        this.field9698.method2281((byte) 58, var39);
                    }
                    if (this.field9721[var19] > 64) {
                        int var22 = this.field9721[var19] - 65;
                        for (int var23 = this.field9720[var22] - 1; var23 >= 0; var23--) {
                            class29 var24 = this.field9717[var22][var23];
                            int var25 = var24.field618;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field624 >> 12);
                            float var31 = (float) (var24.field623 >> 12);
                            float var32 = (float) (var24.field625 >> 12);
                            int var33 = var24.field622 >> 12;
                            this.field9698.method1376(0.0F, (byte) -116);
                            this.field9698.method1376(0.0F, (byte) -63);
                            this.field9698.method1376((float) (-var33) * var10 + var30, (byte) -71);
                            this.field9698.method1376((float) (-var33) * var11 + var31, (byte) -63);
                            this.field9698.method1376((float) (-var33) * var12 + var32, (byte) -62);
                            this.field9698.method2281((byte) 58, var26);
                            this.field9698.method2281((byte) 58, var27);
                            this.field9698.method2281((byte) 58, var28);
                            this.field9698.method2281((byte) 58, var29);
                            this.field9698.method1376(1.0F, (byte) -108);
                            this.field9698.method1376(0.0F, (byte) -101);
                            this.field9698.method1376((float) var33 * var13 + var30, (byte) -79);
                            this.field9698.method1376((float) var33 * var14 + var31, (byte) -124);
                            this.field9698.method1376((float) var33 * var15 + var32, (byte) -103);
                            this.field9698.method2281((byte) 58, var26);
                            this.field9698.method2281((byte) 58, var27);
                            this.field9698.method2281((byte) 58, var28);
                            this.field9698.method2281((byte) 58, var29);
                            this.field9698.method1376(1.0F, (byte) -60);
                            this.field9698.method1376(1.0F, (byte) -76);
                            this.field9698.method1376((float) var33 * var10 + var30, (byte) -111);
                            this.field9698.method1376((float) var33 * var11 + var31, (byte) -122);
                            this.field9698.method1376((float) var33 * var12 + var32, (byte) -75);
                            this.field9698.method2281((byte) 58, var26);
                            this.field9698.method2281((byte) 58, var27);
                            this.field9698.method2281((byte) 58, var28);
                            this.field9698.method2281((byte) 58, var29);
                            this.field9698.method1376(0.0F, (byte) -116);
                            this.field9698.method1376(1.0F, (byte) -77);
                            this.field9698.method1376((float) var33 * var16 + var30, (byte) -94);
                            this.field9698.method1376((float) var33 * var17 + var31, (byte) -98);
                            this.field9698.method1376((float) var33 * var18 + var32, (byte) -84);
                            this.field9698.method2281((byte) 58, var26);
                            this.field9698.method2281((byte) 58, var27);
                            this.field9698.method2281((byte) 58, var28);
                            this.field9698.method2281((byte) 58, var29);
                        }
                    }
                }
            }
        }
        if (this.field9698.field5195 != 0) {
            this.field9712.method672(25735, this.field9698.field5205, this.field9698.field5195, 24);
            arg2.method2960(null, this.field9714, 0, this.field9713, this.field9709);
            arg2.method3000(7, -89, this.field9698.field5195 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lkga;ILso;I)V", line = 409)
    public final void method3845(class506 arg0, int arg1, class436 arg2, int arg3) {
        field9707++;
        if (arg0.field7298 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method3848(arg1, true, arg0);
        } else {
            this.method3847(-67, arg0);
        }
        float var5 = arg0.field7298.field7426;
        float var6 = arg0.field7298.field7429;
        float var7 = arg0.field7298.field7442;
        float var8 = arg0.field7298.field7455;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class589 var12 = arg2.field6248.field1611;
            for (class589 var13 = var12.field8537; var13 != var12; var13 = var13.field8537) {
                class29 var14 = (class29) var13;
                int var15 = (int) ((float) (var14.field625 >> 12) * var7 + (float) (var14.field624 >> 12) * var5 + (float) (var14.field623 >> 12) * var6 + var8);
                this.field9719[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (arg3 + var16 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class565.method3314((byte) 17, var16) + 1 - this.field9711;
                var16 = (var16 >> var17) + 2;
            }
            class589 var18 = var12.field8537;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field9718 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field9721[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field9720[var24] = 0;
                }
                while (var12 != var18) {
                    class29 var25 = (class29) var18;
                    if (var22) {
                        var21 = var25.field620;
                        var20 = var25.field626;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field626 != var20 || var21 != var25.field620)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field9719[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field9721[var26] >= 64) {
                            label101: {
                                if (this.field9721[var26] == 64) {
                                    if (this.field9718 == 64) {
                                        break label101;
                                    }
                                    this.field9721[var26] += this.field9718++ + 1;
                                }
                                this.field9717[this.field9721[var26] - 65][this.field9720[this.field9721[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field9716[var26][this.field9721[var26]++] = var25;
                        }
                    }
                    var18 = var18.field8537;
                }
                if (var20 < 0) {
                    arg0.method2988(true, -1);
                } else {
                    arg0.method2988(true, var20);
                }
                if (var21 && class500.field6992 != arg0.field7311) {
                    arg0.method239(class500.field6992);
                } else if (arg0.field7311 != 1.0F) {
                    arg0.method239(1.0F);
                }
                this.method3844(var16, true, arg0);
            }
        } catch (Exception var27) {
        }
        this.method3843(arg0, 16385);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 574)
    public static void method3846(byte arg0) {
        field9702 = null;
        field9705 = null;
        if (arg0 == 111) {
            field9715 = null;
            field9704 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILkga;)V", line = 592)
    private final void method3847(int arg0, class506 arg1) {
        class500.field6992 = arg1.field7311;
        field9700++;
        arg1.method2942(109);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        if (arg0 <= -18) {
            arg1.method2931((byte) -107, false);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(IZLkga;)V", line = 612)
    private final void method3848(int arg0, boolean arg1, class506 arg2) {
        field9696++;
        class500.field6992 = arg2.field7311;
        arg2.method2956((float) arg0, (byte) -5);
        arg2.method2971((byte) -9);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method2931((byte) -98, false);
        if (!arg1) {
            this.method3845(null, 82, null, 8);
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
