import jaggl.OpenGL;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[F")
    private float[] field455 = new float[16];

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lcb;")
    private class364 field451 = new class364(786336);

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "I")
    private int field459 = class170.method1189(0, 1600);

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "[I")
    private int[] field468 = new int[1600];

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "[I")
    private int[] field465 = new int[64];

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    private int field467 = 0;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "[[Lil;")
    private class7[][] field464 = new class7[1600][64];

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[[Lil;")
    private class7[][] field466 = new class7[64][768];

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[I")
    private int[] field469 = new int[8191];

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "Los;")
    public static class309 field458;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "Lgg;")
    private class118 field461;

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Ler;")
    private class70 field460;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "Ler;")
    private class70 field462;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "Ler;")
    private class70 field463;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field457;

    static {
        new class309("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field458 = new class309("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lip;Lda;Z)V", line = 4)
    public final void method196(class502 arg0, class44 arg1, boolean arg2) {
        field449++;
        if (arg1.field904 == null) {
            return;
        }
        this.method202(81, arg1);
        float var4 = arg1.field904.field3740;
        float var5 = arg1.field904.field3730;
        float var6 = arg1.field904.field3741;
        float var7 = arg1.field904.field3736;
        try {
            if (arg0.field7341) {
                int var8 = arg0.field7342 - arg0.field7345;
                int var9;
                if ((var8 + 2) > 1600) {
                    var9 = class170.method1189(0, var8) + 1 - this.field459;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var9 = 0;
                    var8 += 2;
                }
                class87 var10 = arg0.field7340.field2492;
                class87 var11 = var10.field1778;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field467 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field468[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field465[var16] = 0;
                    }
                    while (var10 != var11) {
                        class7 var17 = (class7) var11;
                        if (var14) {
                            var14 = false;
                            var12 = var17.field106;
                            var13 = var17.field103;
                        } else if (var17.field106 != var12 || var13 != var17.field103) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field100 >> 12) * var6 + (float) (var17.field102 >> 12) * var5 + (float) (var17.field101 >> 12) * var4 + var7) - arg0.field7345 >> var9;
                        if (var18 < 1600) {
                            if (this.field468[var18] < 64) {
                                this.field464[var18][this.field468[var18]++] = var17;
                            } else {
                                label146: {
                                    if (this.field468[var18] == 64) {
                                        if (this.field467 == 64) {
                                            break label146;
                                        }
                                        this.field468[var18] += this.field467++ + 1;
                                    }
                                    this.field466[this.field468[var18] - 1 - 64][this.field465[this.field468[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field1778;
                    }
                    if (var12 >= 0) {
                        arg1.method381((byte) 28, arg1.field793.method2896(var12, (byte) -71));
                        arg1.method288((byte) -122, arg1.field4358.method105(-128, var12).field7151);
                    } else {
                        arg1.method381((byte) 28, null);
                    }
                    if (var13 && class365.field5331 != arg1.field937) {
                        arg1.method397(class365.field5331);
                    } else if (arg1.field937 != 1.0F) {
                        arg1.method397(1.0F);
                    }
                    this.method201(var8, arg1, -64);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class87 var22 = arg0.field7340.field2492;
                for (class87 var23 = var22.field1778; var23 != var22; var23 = var23.field1778) {
                    class7 var24 = (class7) var23;
                    int var25 = (int) ((float) (var24.field100 >> 12) * var6 + (float) (var24.field102 >> 12) * var5 + (float) (var24.field101 >> 12) * var4 + var7);
                    this.field469[var19++] = var25;
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class170.method1189(0, var26) + 1 - this.field459;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                int var28 = 0;
                class87 var29 = var22.field1778;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field467 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field468[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field465[var34] = 0;
                    }
                    while (var22 != var29) {
                        class7 var35 = (class7) var29;
                        if (var32) {
                            var31 = var35.field103;
                            var30 = var35.field106;
                            var32 = false;
                        }
                        if (var28 > 0 && (var35.field106 != var30 || var31 != var35.field103)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field469[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field468[var36] < 64) {
                                this.field464[var36][this.field468[var36]++] = var35;
                            } else {
                                label190: {
                                    if (this.field468[var36] == 64) {
                                        if (this.field467 == 64) {
                                            break label190;
                                        }
                                        this.field468[var36] += (this.field467++) + 1;
                                    }
                                    this.field466[this.field468[var36] - 64 - 1][this.field465[this.field468[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field1778;
                    }
                    if (var30 >= 0) {
                        arg1.method381((byte) 28, arg1.field793.method2896(var30, (byte) -81));
                        arg1.method288((byte) 94, arg1.field4358.method105(-126, var30).field7151);
                    } else {
                        arg1.method381((byte) 28, null);
                    }
                    if (var31 && class365.field5331 != arg1.field937) {
                        arg1.method397(class365.field5331);
                    } else if (arg1.field937 != 1.0F) {
                        arg1.method397(1.0F);
                    }
                    this.method201(var26, arg1, -64);
                }
            }
            if (!arg2) {
                this.field462 = null;
            }
        } catch (Exception var37) {
        }
        this.method203(arg1, 16384);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lda;I)V", line = 290)
    public final void method197(class44 arg0, int arg1) {
        if (arg1 != -14135) {
            this.field469 = null;
        }
        this.field461 = arg0.method283(196584, 24, -118, null, true);
        field450++;
        this.field463 = new class70(this.field461, 5126, 2, 0);
        this.field462 = new class70(this.field461, 5126, 3, 8);
        this.field460 = new class70(this.field461, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lgh;II)I", line = 306)
    public static final int method198(class388 arg0, int arg1, int arg2) {
        field453++;
        if (!client.method1371(arg0).method887(arg1, arg2 ^ 0xFFFFFF9C) && arg0.field5686 == null) {
            return -1;
        } else {
            if (arg2 != 1) {
                method198(null, -31, -79);
            }
            return arg0.field5755 == null || arg1 >= arg0.field5755.length ? -1 : arg0.field5755[arg1];
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 325)
    public static void method199(byte arg0) {
        field457 = null;
        field458 = null;
        if (arg0 > -93) {
            field457 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[FIIIIIFII)V", line = 337)
    public static final void method200(int arg0, float[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9) {
        int var10 = arg9 - arg4;
        field452++;
        int var11 = arg2 - arg0;
        int var12 = arg8 - arg5;
        float var13 = arg1[2] * (float) var11 + arg1[arg6] * (float) var12 + arg1[1] * (float) var10;
        float var14 = arg1[5] * (float) var11 + arg1[4] * (float) var10 + arg1[3] * (float) var12;
        float var15 = arg1[8] * (float) var11 + arg1[6] * (float) var12 + arg1[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg7 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg3 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg3 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg3 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class173.field2795 = var17;
        class409.field6192 = var18;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILda;I)V", line = 385)
    private final void method201(int arg0, class44 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field455, 0);
        field448++;
        float var4 = this.field455[0];
        float var5 = this.field455[4];
        float var6 = this.field455[8];
        float var7 = this.field455[1];
        float var8 = this.field455[5];
        float var9 = this.field455[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field451.field4399 = 0;
        if (arg2 != -64) {
            method198(null, -5, 84);
        }
        if (arg1.field924) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field468[var44] <= 64 ? this.field468[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class7 var59 = this.field464[var44][var46];
                        int var60 = var59.field104;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field101 >> 12);
                        float var66 = (float) (var59.field102 >> 12);
                        float var67 = (float) (var59.field100 >> 12);
                        int var68 = var59.field105 >> 12;
                        this.field451.method2234(0.0F, -1933021816);
                        this.field451.method2234(0.0F, -1933021816);
                        this.field451.method2234((float) (-var68) * var10 + var65, arg2 + -1933021752);
                        this.field451.method2234((float) (-var68) * var11 + var66, -1933021816);
                        this.field451.method2234((float) (-var68) * var12 + var67, -1933021816);
                        this.field451.method1814(var61, true);
                        this.field451.method1814(var62, true);
                        this.field451.method1814(var63, true);
                        this.field451.method1814(var64, true);
                        this.field451.method2234(1.0F, -1933021816);
                        this.field451.method2234(0.0F, -1933021816);
                        this.field451.method2234((float) var68 * var13 + var65, -1933021816);
                        this.field451.method2234((float) var68 * var14 + var66, -1933021816);
                        this.field451.method2234((float) var68 * var15 + var67, -1933021816);
                        this.field451.method1814(var61, true);
                        this.field451.method1814(var62, true);
                        this.field451.method1814(var63, true);
                        this.field451.method1814(var64, true);
                        this.field451.method2234(1.0F, arg2 - 1933021752);
                        this.field451.method2234(1.0F, -1933021816);
                        this.field451.method2234((float) var68 * var10 + var65, -1933021816);
                        this.field451.method2234((float) var68 * var11 + var66, -1933021816);
                        this.field451.method2234((float) var68 * var12 + var67, -1933021816);
                        this.field451.method1814(var61, true);
                        this.field451.method1814(var62, true);
                        this.field451.method1814(var63, true);
                        this.field451.method1814(var64, true);
                        this.field451.method2234(0.0F, arg2 ^ 0x73379248);
                        this.field451.method2234(1.0F, -1933021816);
                        this.field451.method2234((float) var68 * var16 + var65, -1933021816);
                        this.field451.method2234((float) var68 * var17 + var66, -1933021816);
                        this.field451.method2234((float) var68 * var18 + var67, -1933021816);
                        this.field451.method1814(var61, true);
                        this.field451.method1814(var62, true);
                        this.field451.method1814(var63, true);
                        this.field451.method1814(var64, true);
                    }
                    if (this.field468[var44] > 64) {
                        int var47 = this.field468[var44] - 64 - 1;
                        for (int var48 = this.field465[var47] - 1; var48 >= 0; var48--) {
                            class7 var49 = this.field466[var47][var48];
                            int var50 = var49.field104;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field101 >> 12);
                            float var56 = (float) (var49.field102 >> 12);
                            float var57 = (float) (var49.field100 >> 12);
                            int var58 = var49.field105 >> 12;
                            this.field451.method2234(0.0F, -1933021816);
                            this.field451.method2234(0.0F, -1933021816);
                            this.field451.method2234((float) (-var58) * var10 + var55, -1933021816);
                            this.field451.method2234((float) (-var58) * var11 + var56, arg2 ^ 0x73379248);
                            this.field451.method2234((float) (-var58) * var12 + var57, -1933021816);
                            this.field451.method1814(var51, true);
                            this.field451.method1814(var52, true);
                            this.field451.method1814(var53, true);
                            this.field451.method1814(var54, true);
                            this.field451.method2234(1.0F, arg2 - 1933021752);
                            this.field451.method2234(0.0F, -1933021816);
                            this.field451.method2234((float) var58 * var13 + var55, -1933021816);
                            this.field451.method2234((float) var58 * var14 + var56, -1933021816);
                            this.field451.method2234((float) var58 * var15 + var57, -1933021816);
                            this.field451.method1814(var51, true);
                            this.field451.method1814(var52, true);
                            this.field451.method1814(var53, true);
                            this.field451.method1814(var54, true);
                            this.field451.method2234(1.0F, -1933021816);
                            this.field451.method2234(1.0F, -1933021816);
                            this.field451.method2234((float) var58 * var10 + var55, -1933021816);
                            this.field451.method2234((float) var58 * var11 + var56, -1933021816);
                            this.field451.method2234((float) var58 * var12 + var57, arg2 + -1933021752);
                            this.field451.method1814(var51, true);
                            this.field451.method1814(var52, true);
                            this.field451.method1814(var53, true);
                            this.field451.method1814(var54, true);
                            this.field451.method2234(0.0F, arg2 ^ 0x73379248);
                            this.field451.method2234(1.0F, -1933021816);
                            this.field451.method2234((float) var58 * var16 + var55, -1933021816);
                            this.field451.method2234((float) var58 * var17 + var56, -1933021816);
                            this.field451.method2234((float) var58 * var18 + var57, -1933021816);
                            this.field451.method1814(var51, true);
                            this.field451.method1814(var52, true);
                            this.field451.method1814(var53, true);
                            this.field451.method1814(var54, true);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field468[var19] > 64 ? 64 : this.field468[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class7 var34 = this.field464[var19][var21];
                        int var35 = var34.field104;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field101 >> 12);
                        float var41 = (float) (var34.field102 >> 12);
                        float var42 = (float) (var34.field100 >> 12);
                        int var43 = var34.field105 >> 12;
                        this.field451.method2232((byte) 107, 0.0F);
                        this.field451.method2232((byte) 126, 0.0F);
                        this.field451.method2232((byte) -89, (float) (-var43) * var10 + var40);
                        this.field451.method2232((byte) -22, (float) (-var43) * var11 + var41);
                        this.field451.method2232((byte) 122, (float) (-var43) * var12 + var42);
                        this.field451.method1814(var36, true);
                        this.field451.method1814(var37, true);
                        this.field451.method1814(var38, true);
                        this.field451.method1814(var39, true);
                        this.field451.method2232((byte) -12, 1.0F);
                        this.field451.method2232((byte) -83, 0.0F);
                        this.field451.method2232((byte) 121, (float) var43 * var13 + var40);
                        this.field451.method2232((byte) 124, (float) var43 * var14 + var41);
                        this.field451.method2232((byte) -22, (float) var43 * var15 + var42);
                        this.field451.method1814(var36, true);
                        this.field451.method1814(var37, true);
                        this.field451.method1814(var38, true);
                        this.field451.method1814(var39, true);
                        this.field451.method2232((byte) 113, 1.0F);
                        this.field451.method2232((byte) 123, 1.0F);
                        this.field451.method2232((byte) -21, (float) var43 * var10 + var40);
                        this.field451.method2232((byte) 122, (float) var43 * var11 + var41);
                        this.field451.method2232((byte) 112, (float) var43 * var12 + var42);
                        this.field451.method1814(var36, true);
                        this.field451.method1814(var37, true);
                        this.field451.method1814(var38, true);
                        this.field451.method1814(var39, true);
                        this.field451.method2232((byte) 127, 0.0F);
                        this.field451.method2232((byte) -122, 1.0F);
                        this.field451.method2232((byte) 104, (float) var43 * var16 + var40);
                        this.field451.method2232((byte) 111, (float) var43 * var17 + var41);
                        this.field451.method2232((byte) -99, (float) var43 * var18 + var42);
                        this.field451.method1814(var36, true);
                        this.field451.method1814(var37, true);
                        this.field451.method1814(var38, true);
                        this.field451.method1814(var39, true);
                    }
                    if (this.field468[var19] > 64) {
                        int var22 = this.field468[var19] - 1 - 64;
                        for (int var23 = this.field465[var22] - 1; var23 >= 0; var23--) {
                            class7 var24 = this.field466[var22][var23];
                            int var25 = var24.field104;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field101 >> 12);
                            float var31 = (float) (var24.field102 >> 12);
                            float var32 = (float) (var24.field100 >> 12);
                            int var33 = var24.field105 >> 12;
                            this.field451.method2232((byte) 125, 0.0F);
                            this.field451.method2232((byte) -121, 0.0F);
                            this.field451.method2232((byte) -80, (float) (-var33) * var10 + var30);
                            this.field451.method2232((byte) 120, (float) (-var33) * var11 + var31);
                            this.field451.method2232((byte) 104, (float) (-var33) * var12 + var32);
                            this.field451.method1814(var26, true);
                            this.field451.method1814(var27, true);
                            this.field451.method1814(var28, true);
                            this.field451.method1814(var29, true);
                            this.field451.method2232((byte) -100, 1.0F);
                            this.field451.method2232((byte) -87, 0.0F);
                            this.field451.method2232((byte) -84, (float) var33 * var13 + var30);
                            this.field451.method2232((byte) -81, (float) var33 * var14 + var31);
                            this.field451.method2232((byte) 122, (float) var33 * var15 + var32);
                            this.field451.method1814(var26, true);
                            this.field451.method1814(var27, true);
                            this.field451.method1814(var28, true);
                            this.field451.method1814(var29, true);
                            this.field451.method2232((byte) 113, 1.0F);
                            this.field451.method2232((byte) -112, 1.0F);
                            this.field451.method2232((byte) -126, (float) var33 * var10 + var30);
                            this.field451.method2232((byte) -23, (float) var33 * var11 + var31);
                            this.field451.method2232((byte) 123, (float) var33 * var12 + var32);
                            this.field451.method1814(var26, true);
                            this.field451.method1814(var27, true);
                            this.field451.method1814(var28, true);
                            this.field451.method1814(var29, true);
                            this.field451.method2232((byte) -68, 0.0F);
                            this.field451.method2232((byte) 114, 1.0F);
                            this.field451.method2232((byte) 103, (float) var33 * var16 + var30);
                            this.field451.method2232((byte) 124, (float) var33 * var17 + var31);
                            this.field451.method2232((byte) -20, (float) var33 * var18 + var32);
                            this.field451.method1814(var26, true);
                            this.field451.method1814(var27, true);
                            this.field451.method1814(var28, true);
                            this.field451.method1814(var29, true);
                        }
                    }
                }
            }
        }
        if (this.field451.field4399 != 0) {
            this.field461.method951(this.field451.field4408, arg2 ^ 0xFFFFBEFC, this.field451.field4399, 24);
            arg1.method352(arg2 + 112, this.field462, this.field463, null, this.field460);
            arg1.method312(7, 0, this.field451.field4399 / 24, 7111);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILda;)V", line = 742)
    private final void method202(int arg0, class44 arg1) {
        class365.field5331 = arg1.field937;
        field454++;
        arg1.method304((byte) 124);
        OpenGL.glDisable(16384);
        if (arg0 < 18) {
            this.method196(null, null, true);
        }
        OpenGL.glDisable(16385);
        arg1.method447((byte) 46, false);
        arg1.method430(-2, (byte) -108);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lda;I)V", line = 759)
    private final void method203(class44 arg0, int arg1) {
        arg0.method447((byte) 46, true);
        field456++;
        OpenGL.glEnable(arg1);
        OpenGL.glEnable(16385);
        if (class365.field5331 != arg0.field937) {
            arg0.method397(class365.field5331);
        }
    }
}
