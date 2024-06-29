import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class558 extends class203 {

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "Z")
    private boolean field7850 = false;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Z")
    private boolean field7855;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[Ljka;")
    private class734[] field7854;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "Lof;")
    public static class475 field7853 = new class475(5, 1);

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field7845;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field7846;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field7851;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lup;")
    private class545 field7843;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "[[Lsha;")
    public static class115[][] field7840;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3282(int arg0, byte arg1, int arg2) {
        if (arg1 != 9) {
            return true;
        } else {
            ++field7856;
            return class195.method1277(-24149, arg2, arg0) & class83.method634(arg2, arg0, -73);
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public static void method3283(int arg0) {
        field7840 = null;
        if (arg0 < 75) {
            field7853 = null;
        }
        field7853 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
    public static final void method3284(int arg0, int arg1) {
        class494.field6800 = arg0;
        ++field7845;
        int var2 = -7 / ((-37 - arg1) / 56);
        class678.field9487.method314(-2);
    }

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V")
    private final void method3285(int arg0) {
        this.field7843 = new class545(super.field2843, 2);
        ++field7844;
        this.field7843.method3227(0, (byte) -123);
        super.field2843.method1262(1, 0);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        if (arg0 != 8448) {
            this.field7843 = null;
        }
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field7855) {
            super.field2843.method1230(8448, 7681, false);
            super.field2843.method1223(0, arg0 + -8416, 768, 34168);
            super.field2843.method1262(2, 0);
            super.field2843.method1230(7681, 260, false);
            super.field2843.method1223(0, 102, 768, 34168);
            super.field2843.method1223(1, 71, 770, 34168);
            super.field2843.method1220(34167, 770, 34200, 0);
        } else {
            super.field2843.method1230(7681, 260, false);
            super.field2843.method1223(0, 30, 770, 5890);
            super.field2843.method1220(34167, 770, 34200, 0);
        }
        super.field2843.method1262(0, 0);
        this.field7843.method3225(43);
        this.field7843.method3227(1, (byte) -109);
        super.field2843.method1262(1, 0);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field7855) {
            super.field2843.method1230(8448, 8448, false);
            super.field2843.method1223(0, arg0 ^ 8515, 768, 5890);
            super.field2843.method1262(2, 0);
            super.field2843.method1230(8448, 8448, false);
            super.field2843.method1223(0, arg0 ^ 8509, 768, 5890);
            super.field2843.method1223(1, 61, 768, 34168);
            super.field2843.method1220(5890, 770, 34200, 0);
        } else {
            super.field2843.method1230(8448, 8448, false);
            super.field2843.method1223(0, 58, 768, 5890);
            super.field2843.method1220(5890, 770, 34200, 0);
        }
        super.field2843.method1262(0, 0);
        this.field7843.method3225(-72);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZLwha;)V")
    public final void method683(int arg0, boolean arg1, class539 arg2) {
        super.field2843.method1219((byte) 118, arg2);
        ++field7849;
        super.field2843.method1263(arg0, 122);
        if (arg1) {
            this.method681(false, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZB)V")
    public final void method681(boolean arg0, byte arg1) {
        ++field7847;
        super.field2843.method1230(7681, 8448, false);
        if (arg1 < 0) {
            field7853 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)Z")
    public final boolean method687(int arg0) {
        ++field7852;
        if (arg0 != -12) {
            this.method683(-71, false, (class539) null);
        }
        return true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZ)V")
    public final void method682(int arg0, int arg1, boolean arg2) {
        ++field7842;
        if (this.field7850) {
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 96, this.field7854[arg1 - 1]);
            super.field2843.method1262(0, 0);
        }
        if (!arg2) {
            method3283(-54);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        ++field7841;
        if (this.field7850) {
            if (!this.field7855) {
                super.field2843.method1262(2, 0);
                super.field2843.method1219((byte) 87, (class539) null);
            }
            super.field2843.method1262(1, 0);
            super.field2843.method1219((byte) 68, (class539) null);
            super.field2843.method1262(0, 0);
            this.field7843.method3226(6, '\u0001');
            this.field7850 = false;
        } else {
            super.field2843.method1220(5890, 770, 34200, 0);
        }
        if (arg0 <= 64) {
            this.method682(126, 22, true);
        }
        super.field2843.method1230(8448, 8448, false);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3286(String arg0, int arg1) {
        ++field7846;
        if (!arg0.equals("")) {
            ++class243.field3598;
            if (arg1 != 127) {
                method3284(-115, -80);
            }
            class116 var2 = class248.method1672(class84.field1023, class412.field5775, -20647);
            var2.field1575.method3005(255, class395.method2435(arg0, arg1 ^ 126));
            var2.field1575.method3037(0, arg0);
            class443.method2655(0, var2);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lsha;III)V")
    public static final void method3287(class115 arg0, int arg1, int arg2, int arg3) {
        ++field7851;
        if (class81.field906 == null && !class263.field3850) {
            if (arg0 != null && class607.method3506((byte) 9, arg0) != null) {
                class81.field906 = arg0;
                class434.field6028 = class607.method3506((byte) 9, arg0);
                class189.field2371 = arg1;
                class161.field2084 = 0;
                if (arg3 >= 7) {
                    class539.field7463 = arg2;
                    class653.field9112 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lpq;)V")
    public class558(class194 arg0) {
        super(arg0);
        if (arg0.field2727) {
            this.field7855 = arg0.field2666 < 3;
            int var2 = this.field7855 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 == -3) {
                                var15 = var13;
                            } else if (~var14 != -4) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = (byte) var16;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var18;
                    }
                    ++var6;
                }
            }
            this.field7854 = new class734[3];
            this.field7854[0] = new class734(super.field2843, 6406, 64, false, var4, 6406);
            this.field7854[1] = new class734(super.field2843, 6406, 64, false, var5, 6406);
            this.field7854[2] = new class734(super.field2843, 6406, 64, false, var3, 6406);
            this.method3285(8448);
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BZ)V")
    public final void method688(byte arg0, boolean arg1) {
        if (arg0 >= -25) {
            field7840 = null;
        }
        if (this.field7843 != null && arg1) {
            if (!this.field7855) {
                super.field2843.method1262(2, 0);
                super.field2843.method1219((byte) 109, super.field2843.field2733);
                super.field2843.method1262(0, 0);
            }
            this.field7843.method3226(6, '\u0000');
            this.field7850 = true;
        } else {
            super.field2843.method1220(34168, 770, 34200, 0);
        }
        ++field7848;
    }
}
