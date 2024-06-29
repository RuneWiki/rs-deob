import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class549 {

    @OriginalMember(owner = "client!or", name = "e", descriptor = "[F")
    private float[] field8193 = new float[16];

    @OriginalMember(owner = "client!or", name = "d", descriptor = "Leo;")
    private class247 field8192 = new class247(786336);

    @OriginalMember(owner = "client!or", name = "l", descriptor = "I")
    private int field8200 = class136.method950((byte) 73, 1600);

    @OriginalMember(owner = "client!or", name = "r", descriptor = "[I")
    private int[] field8206 = new int[1600];

    @OriginalMember(owner = "client!or", name = "p", descriptor = "[[Lsi;")
    private class480[][] field8204 = new class480[64][768];

    @OriginalMember(owner = "client!or", name = "o", descriptor = "I")
    private int field8203 = 0;

    @OriginalMember(owner = "client!or", name = "s", descriptor = "[[Lsi;")
    private class480[][] field8207 = new class480[1600][64];

    @OriginalMember(owner = "client!or", name = "u", descriptor = "[I")
    private int[] field8209 = new int[8191];

    @OriginalMember(owner = "client!or", name = "t", descriptor = "[I")
    private int[] field8208 = new int[64];

    @OriginalMember(owner = "client!or", name = "g", descriptor = "Lmt;")
    public static class336 field8195 = new class336("WTI", 5);

    @OriginalMember(owner = "client!or", name = "k", descriptor = "Lh;")
    public static class572 field8199 = new class572("M", "M", "M", "M");

    @OriginalMember(owner = "client!or", name = "q", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8205 = new Rectangle[100];

    @OriginalMember(owner = "client!or", name = "v", descriptor = "[[Z")
    public static boolean[][] field8210 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!or", name = "w", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!or", name = "h", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!or", name = "i", descriptor = "Lmaa;")
    private class403 field8197;

    @OriginalMember(owner = "client!or", name = "j", descriptor = "Lmaa;")
    private class403 field8198;

    @OriginalMember(owner = "client!or", name = "m", descriptor = "Lmaa;")
    private class403 field8201;

    @OriginalMember(owner = "client!or", name = "n", descriptor = "Lsp;")
    private class544 field8202;

    static {
        new class572(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field8211 = 0;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 11)
    public static void method3331(byte arg0) {
        field8195 = null;
        if (arg0 != -93) {
            field8210 = null;
        }
        field8205 = null;
        field8210 = null;
        field8199 = null;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lte;B)V", line = 25)
    public final void method3332(class527 arg0, byte arg1) {
        field8190++;
        this.field8202 = arg0.method3180(null, true, (byte) 126, 196584, 24);
        if (arg1 <= -44) {
            this.field8201 = new class403(this.field8202, 5126, 2, 0);
            this.field8198 = new class403(this.field8202, 5126, 3, 8);
            this.field8197 = new class403(this.field8202, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Lrd;ILte;)V", line = 39)
    public final void method3333(class283 arg0, int arg1, class527 arg2) {
        field8191++;
        if (arg2.field7875 == null) {
            return;
        }
        this.method3335((byte) 22, arg2);
        if (arg1 != -65) {
            this.field8209 = null;
        }
        float var4 = arg2.field7875.field619;
        float var5 = arg2.field7875.field643;
        float var6 = arg2.field7875.field642;
        float var7 = arg2.field7875.field616;
        try {
            if (arg0.field3962) {
                int var8 = arg0.field3963 - arg0.field3964;
                int var9;
                if ((var8 + 2) <= 1600) {
                    var9 = 0;
                    var8 += 2;
                } else {
                    var9 = class136.method950((byte) 73, var8) + (1 - this.field8200);
                    var8 = (var8 >> var9) + 2;
                }
                class613 var10 = arg0.field3959.field2700;
                class613 var11 = var10.field9070;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field8203 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field8206[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field8208[var16] = 0;
                    }
                    while (var10 != var11) {
                        class480 var17 = (class480) var11;
                        if (var14) {
                            var13 = var17.field6827;
                            var14 = false;
                            var12 = var17.field6828;
                        } else if (var17.field6828 != var12 || var17.field6827 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field6815 >> 12) * var6 + (float) (var17.field6826 >> 12) * var4 + (float) (var17.field6824 >> 12) * var5 + var7) - arg0.field3964 >> var9;
                        if (var18 < 1600) {
                            if (this.field8206[var18] >= 64) {
                                label200: {
                                    if (this.field8206[var18] == 64) {
                                        if (this.field8203 == 64) {
                                            break label200;
                                        }
                                        this.field8206[var18] += this.field8203++ + 1;
                                    }
                                    this.field8204[this.field8206[var18] - 1 - 64][this.field8208[this.field8206[var18] - 1 - 64]++] = var17;
                                }
                            } else {
                                this.field8207[var18][this.field8206[var18]++] = var17;
                            }
                        }
                        var11 = var11.field9070;
                    }
                    if (var12 < 0) {
                        arg2.method3123(-1, false);
                    } else {
                        arg2.method3123(var12, false);
                    }
                    if (var13 && class625.field9206 != arg2.field7778) {
                        arg2.method500(class625.field9206);
                    } else if (arg2.field7778 != 1.0F) {
                        arg2.method500(1.0F);
                    }
                    this.method3336(0, arg2, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class613 var22 = arg0.field3959.field2700;
                for (class613 var23 = var22.field9070; var23 != var22; var23 = var23.field9070) {
                    class480 var24 = (class480) var23;
                    int var25 = (int) ((float) (var24.field6815 >> 12) * var6 + (float) (var24.field6826 >> 12) * var4 + (float) (var24.field6824 >> 12) * var5 + var7);
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    this.field8209[var19++] = var25;
                    if (var21 < var25) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class136.method950((byte) 73, var26) + 1 - this.field8200;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class613 var28 = var22.field9070;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field8203 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field8206[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field8208[var34] = 0;
                    }
                    while (var22 != var28) {
                        class480 var35 = (class480) var28;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field6828;
                            var31 = var35.field6827;
                        }
                        if (var29 > 0 && (var35.field6828 != var30 || var35.field6827 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field8209[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field8206[var36] < 64) {
                                this.field8207[var36][this.field8206[var36]++] = var35;
                            } else {
                                label150: {
                                    if (this.field8206[var36] == 64) {
                                        if (this.field8203 == 64) {
                                            break label150;
                                        }
                                        this.field8206[var36] += this.field8203++ + 1;
                                    }
                                    this.field8204[this.field8206[var36] - 64 - 1][this.field8208[this.field8206[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field9070;
                    }
                    if (var30 < 0) {
                        arg2.method3123(-1, false);
                    } else {
                        arg2.method3123(var30, false);
                    }
                    if (var31 && class625.field9206 != arg2.field7778) {
                        arg2.method500(class625.field9206);
                    } else if (arg2.field7778 != 1.0F) {
                        arg2.method500(1.0F);
                    }
                    this.method3336(0, arg2, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method3334(arg2, (byte) -62);
    }

    @OriginalMember(owner = "client!or", name = "b", descriptor = "(Lte;B)V", line = 319)
    private final void method3334(class527 arg0, byte arg1) {
        arg0.method3142(true, (byte) 97);
        field8194++;
        if (arg1 != -62) {
            this.method3333(null, 78, null);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class625.field9206 != arg0.field7778) {
            arg0.method500(class625.field9206);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BLte;)V", line = 340)
    private final void method3335(byte arg0, class527 arg1) {
        field8189++;
        class625.field9206 = arg1.field7778;
        arg1.method3130(75);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method3142(false, (byte) 127);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 <= 20) {
            this.field8203 = -53;
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ILte;I)V", line = 368)
    private final void method3336(int arg0, class527 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field8193, 0);
        field8196++;
        float var4 = this.field8193[arg0];
        float var5 = this.field8193[4];
        float var6 = this.field8193[8];
        float var7 = this.field8193[1];
        float var8 = this.field8193[5];
        float var9 = this.field8193[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field8192.field2177 = 0;
        float var18 = var9 - var6;
        if (arg1.field7842) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field8206[var44] > 64 ? 64 : this.field8206[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class480 var59 = this.field8207[var44][var46];
                        int var60 = var59.field6825;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6826 >> 12);
                        float var66 = (float) (var59.field6824 >> 12);
                        float var67 = (float) (var59.field6815 >> 12);
                        int var68 = var59.field6829 >> 12;
                        this.field8192.method1564(0, 0.0F);
                        this.field8192.method1564(0, 0.0F);
                        this.field8192.method1564(0, (float) (-var68) * var10 + var65);
                        this.field8192.method1564(0, (float) (-var68) * var11 + var66);
                        this.field8192.method1564(arg0, (float) (-var68) * var12 + var67);
                        this.field8192.method1049(arg0 - 1, var61);
                        this.field8192.method1049(-1, var62);
                        this.field8192.method1049(~arg0, var63);
                        this.field8192.method1049(~arg0, var64);
                        this.field8192.method1564(0, 1.0F);
                        this.field8192.method1564(0, 0.0F);
                        this.field8192.method1564(0, (float) var68 * var13 + var65);
                        this.field8192.method1564(0, (float) var68 * var14 + var66);
                        this.field8192.method1564(0, (float) var68 * var15 + var67);
                        this.field8192.method1049(-1, var61);
                        this.field8192.method1049(-1, var62);
                        this.field8192.method1049(-1, var63);
                        this.field8192.method1049(-1, var64);
                        this.field8192.method1564(0, 1.0F);
                        this.field8192.method1564(0, 1.0F);
                        this.field8192.method1564(0, (float) var68 * var10 + var65);
                        this.field8192.method1564(0, (float) var68 * var11 + var66);
                        this.field8192.method1564(0, (float) var68 * var12 + var67);
                        this.field8192.method1049(-1, var61);
                        this.field8192.method1049(arg0 - 1, var62);
                        this.field8192.method1049(-1, var63);
                        this.field8192.method1049(-1, var64);
                        this.field8192.method1564(0, 0.0F);
                        this.field8192.method1564(0, 1.0F);
                        this.field8192.method1564(0, (float) var68 * var16 + var65);
                        this.field8192.method1564(0, (float) var68 * var17 + var66);
                        this.field8192.method1564(0, (float) var68 * var18 + var67);
                        this.field8192.method1049(-1, var61);
                        this.field8192.method1049(-1, var62);
                        this.field8192.method1049(-1, var63);
                        this.field8192.method1049(-1, var64);
                    }
                    if (this.field8206[var44] > 64) {
                        int var47 = this.field8206[var44] - 64 - 1;
                        for (int var48 = this.field8208[var47] - 1; var48 >= 0; var48--) {
                            class480 var49 = this.field8204[var47][var48];
                            int var50 = var49.field6825;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6826 >> 12);
                            float var56 = (float) (var49.field6824 >> 12);
                            float var57 = (float) (var49.field6815 >> 12);
                            int var58 = var49.field6829 >> 12;
                            this.field8192.method1564(arg0, 0.0F);
                            this.field8192.method1564(0, 0.0F);
                            this.field8192.method1564(0, (float) (-var58) * var10 + var55);
                            this.field8192.method1564(0, (float) (-var58) * var11 + var56);
                            this.field8192.method1564(0, (float) (-var58) * var12 + var57);
                            this.field8192.method1049(-1, var51);
                            this.field8192.method1049(-1, var52);
                            this.field8192.method1049(-1, var53);
                            this.field8192.method1049(-1, var54);
                            this.field8192.method1564(0, 1.0F);
                            this.field8192.method1564(0, 0.0F);
                            this.field8192.method1564(0, (float) var58 * var13 + var55);
                            this.field8192.method1564(0, (float) var58 * var14 + var56);
                            this.field8192.method1564(arg0, (float) var58 * var15 + var57);
                            this.field8192.method1049(-1, var51);
                            this.field8192.method1049(-1, var52);
                            this.field8192.method1049(-1, var53);
                            this.field8192.method1049(-1, var54);
                            this.field8192.method1564(0, 1.0F);
                            this.field8192.method1564(0, 1.0F);
                            this.field8192.method1564(arg0, (float) var58 * var10 + var55);
                            this.field8192.method1564(0, (float) var58 * var11 + var56);
                            this.field8192.method1564(0, (float) var58 * var12 + var57);
                            this.field8192.method1049(~arg0, var51);
                            this.field8192.method1049(-1, var52);
                            this.field8192.method1049(-1, var53);
                            this.field8192.method1049(~arg0, var54);
                            this.field8192.method1564(0, 0.0F);
                            this.field8192.method1564(0, 1.0F);
                            this.field8192.method1564(0, (float) var58 * var16 + var55);
                            this.field8192.method1564(0, (float) var58 * var17 + var56);
                            this.field8192.method1564(0, (float) var58 * var18 + var57);
                            this.field8192.method1049(-1, var51);
                            this.field8192.method1049(arg0 - 1, var52);
                            this.field8192.method1049(-1, var53);
                            this.field8192.method1049(-1, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field8206[var19] <= 64 ? this.field8206[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class480 var34 = this.field8207[var19][var21];
                        int var35 = var34.field6825;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6826 >> 12);
                        float var41 = (float) (var34.field6824 >> 12);
                        float var42 = (float) (var34.field6815 >> 12);
                        int var43 = var34.field6829 >> 12;
                        this.field8192.method1563(true, 0.0F);
                        this.field8192.method1563(true, 0.0F);
                        this.field8192.method1563(true, (float) (-var43) * var10 + var40);
                        this.field8192.method1563(true, (float) (-var43) * var11 + var41);
                        this.field8192.method1563(true, (float) (-var43) * var12 + var42);
                        this.field8192.method1049(-1, var36);
                        this.field8192.method1049(-1, var37);
                        this.field8192.method1049(~arg0, var38);
                        this.field8192.method1049(-1, var39);
                        this.field8192.method1563(true, 1.0F);
                        this.field8192.method1563(true, 0.0F);
                        this.field8192.method1563(true, (float) var43 * var13 + var40);
                        this.field8192.method1563(true, (float) var43 * var14 + var41);
                        this.field8192.method1563(true, (float) var43 * var15 + var42);
                        this.field8192.method1049(-1, var36);
                        this.field8192.method1049(-1, var37);
                        this.field8192.method1049(-1, var38);
                        this.field8192.method1049(~arg0, var39);
                        this.field8192.method1563(true, 1.0F);
                        this.field8192.method1563(true, 1.0F);
                        this.field8192.method1563(true, (float) var43 * var10 + var40);
                        this.field8192.method1563(true, (float) var43 * var11 + var41);
                        this.field8192.method1563(true, (float) var43 * var12 + var42);
                        this.field8192.method1049(~arg0, var36);
                        this.field8192.method1049(-1, var37);
                        this.field8192.method1049(-1, var38);
                        this.field8192.method1049(-1, var39);
                        this.field8192.method1563(true, 0.0F);
                        this.field8192.method1563(true, 1.0F);
                        this.field8192.method1563(true, (float) var43 * var16 + var40);
                        this.field8192.method1563(true, (float) var43 * var17 + var41);
                        this.field8192.method1563(true, (float) var43 * var18 + var42);
                        this.field8192.method1049(-1, var36);
                        this.field8192.method1049(-1, var37);
                        this.field8192.method1049(-1, var38);
                        this.field8192.method1049(arg0 - 1, var39);
                    }
                    if (this.field8206[var19] > 64) {
                        int var22 = this.field8206[var19] - 64 - 1;
                        for (int var23 = this.field8208[var22] - 1; var23 >= 0; var23--) {
                            class480 var24 = this.field8204[var22][var23];
                            int var25 = var24.field6825;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6826 >> 12);
                            float var31 = (float) (var24.field6824 >> 12);
                            float var32 = (float) (var24.field6815 >> 12);
                            int var33 = var24.field6829 >> 12;
                            this.field8192.method1563(true, 0.0F);
                            this.field8192.method1563(true, 0.0F);
                            this.field8192.method1563(true, (float) (-var33) * var10 + var30);
                            this.field8192.method1563(true, (float) (-var33) * var11 + var31);
                            this.field8192.method1563(true, (float) (-var33) * var12 + var32);
                            this.field8192.method1049(~arg0, var26);
                            this.field8192.method1049(~arg0, var27);
                            this.field8192.method1049(-1, var28);
                            this.field8192.method1049(-1, var29);
                            this.field8192.method1563(true, 1.0F);
                            this.field8192.method1563(true, 0.0F);
                            this.field8192.method1563(true, (float) var33 * var13 + var30);
                            this.field8192.method1563(true, (float) var33 * var14 + var31);
                            this.field8192.method1563(true, (float) var33 * var15 + var32);
                            this.field8192.method1049(~arg0, var26);
                            this.field8192.method1049(-1, var27);
                            this.field8192.method1049(arg0 - 1, var28);
                            this.field8192.method1049(-1, var29);
                            this.field8192.method1563(true, 1.0F);
                            this.field8192.method1563(true, 1.0F);
                            this.field8192.method1563(true, (float) var33 * var10 + var30);
                            this.field8192.method1563(true, (float) var33 * var11 + var31);
                            this.field8192.method1563(true, (float) var33 * var12 + var32);
                            this.field8192.method1049(-1, var26);
                            this.field8192.method1049(-1, var27);
                            this.field8192.method1049(-1, var28);
                            this.field8192.method1049(~arg0, var29);
                            this.field8192.method1563(true, 0.0F);
                            this.field8192.method1563(true, 1.0F);
                            this.field8192.method1563(true, (float) var33 * var16 + var30);
                            this.field8192.method1563(true, (float) var33 * var17 + var31);
                            this.field8192.method1563(true, (float) var33 * var18 + var32);
                            this.field8192.method1049(arg0 - 1, var26);
                            this.field8192.method1049(-1, var27);
                            this.field8192.method1049(-1, var28);
                            this.field8192.method1049(~arg0, var29);
                        }
                    }
                }
            }
        }
        if (this.field8192.field2177 != 0) {
            this.field8202.method3312(this.field8192.field2146, (byte) 107, 24, this.field8192.field2177);
            arg1.method3164(this.field8201, (byte) -49, this.field8198, null, this.field8197);
            arg1.method3151(7, 0, arg0 + 29, this.field8192.field2177 / 24);
        }
    }
}
