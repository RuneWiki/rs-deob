import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class578 extends class283 {

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Z")
    private boolean field8108 = false;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "Z")
    private boolean field8116;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[Lhw;")
    private class132[] field8107;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lea;")
    public static class547 field8109 = new class547(76, -1);

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "Lea;")
    public static class547 field8110 = new class547(12, 0);

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "Lea;")
    public static class547 field8114 = new class547(80, -2);

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field8102;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field8103;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field8105;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field8113;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lfo;")
    private class518 field8104;

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lac;)V", line = 5)
    public class578(class541 arg0) {
        super(arg0);
        if (arg0.field7602) {
            this.field8116 = ~arg0.field7621 > -4;
            int var2 = this.field8116 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 != 0) {
                            if (~var14 != -2) {
                                if (~var14 == -3) {
                                    var15 = var13;
                                } else if (~var14 != -4) {
                                    if (var14 == 4) {
                                        var15 = var11;
                                    } else {
                                        var15 = -var11;
                                    }
                                } else {
                                    var15 = -var13;
                                }
                            } else {
                                var15 = var12;
                            }
                        } else {
                            var15 = -var12;
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
            this.field8107 = new class132[3];
            this.field8107[0] = new class132(super.field3749, 6406, 64, false, var4, 6406);
            this.field8107[1] = new class132(super.field3749, 6406, 64, false, var5, 6406);
            this.field8107[2] = new class132(super.field3749, 6406, 64, false, var3, 6406);
            this.method3237(0);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V", line = 117)
    public final void method137(int arg0, int arg1, int arg2) {
        if (this.field8108) {
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, this.field8107[arg0 - 1]);
            super.field3749.method2988(0, 847872872);
        }
        ++field8103;
        if (arg2 >= -2) {
            this.field8108 = true;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZZ)V", line = 134)
    public final void method141(boolean arg0, boolean arg1) {
        if (!arg0) {
            if (this.field8104 != null && arg1) {
                if (!this.field8116) {
                    super.field3749.method2988(2, 847872872);
                    super.field3749.method3006(1, super.field3749.field7569);
                    super.field3749.method2988(0, 847872872);
                }
                this.field8104.method2853('\u0000', false);
                this.field8108 = true;
            } else {
                super.field3749.method3029(770, 0, 34200, 34168);
            }
            ++field8106;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V", line = 162)
    public final void method144(byte arg0) {
        ++field8105;
        if (arg0 <= 25) {
            this.field8116 = true;
        }
        if (this.field8108) {
            if (!this.field8116) {
                super.field3749.method2988(2, 847872872);
                super.field3749.method3006(1, (class221) null);
            }
            super.field3749.method2988(1, 847872872);
            super.field3749.method3006(1, (class221) null);
            super.field3749.method2988(0, 847872872);
            this.field8104.method2853('\u0001', false);
            this.field8108 = false;
        } else {
            super.field3749.method3029(770, 0, 34200, 5890);
        }
        super.field3749.method3042(8448, 8960, 8448);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)Z", line = 191)
    public final boolean method138(int arg0) {
        ++field8113;
        if (arg0 != 31565) {
            this.field8116 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lcu;ZI)V", line = 203)
    public final void method140(class221 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method144((byte) -95);
        }
        super.field3749.method3006(1, arg0);
        ++field8115;
        super.field3749.method3039(260, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lsba;Lsba;I)V", line = 219)
    public static final void method3236(class218 arg0, class218 arg1, int arg2) {
        ++field8112;
        ++class703.field9870;
        class103 var3 = class752.method4186(260, class462.field6383, class449.field6285);
        var3.field1379.method3384(1571862888, arg1.field2708);
        if (arg2 >= 18) {
            var3.field1379.method3381(arg0.field2771, (byte) 126);
            var3.field1379.method3423(arg1.field2771, 1571862888);
            var3.field1379.method3444(arg0.field2708, 1046032984);
            var3.field1379.method3437(arg1.field2769, 128);
            var3.field1379.method3394(arg0.field2769, 17624);
            class27.method104(false, var3);
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V", line = 252)
    private final void method3237(int arg0) {
        this.field8104 = new class518(super.field3749, 2);
        ++field8111;
        this.field8104.method2852(0, -30389);
        super.field3749.method2988(1, 847872872);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field8116) {
            super.field3749.method3042(7681, arg0 ^ 8960, 260);
            super.field3749.method2983(0, 770, -121, 5890);
            super.field3749.method3029(770, 0, 34200, 34167);
        } else {
            super.field3749.method3042(8448, arg0 ^ 8960, 7681);
            super.field3749.method2983(0, 768, arg0 ^ 84, 34168);
            super.field3749.method2988(2, 847872872);
            super.field3749.method3042(7681, arg0 ^ 8960, 260);
            super.field3749.method2983(0, 768, 90, 34168);
            super.field3749.method2983(1, 770, 80, 34168);
            super.field3749.method3029(770, 0, 34200, 34167);
        }
        super.field3749.method2988(0, 847872872);
        this.field8104.method2851((byte) 58);
        this.field8104.method2852(1, -30389);
        super.field3749.method2988(1, arg0 ^ 847872872);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field8116) {
            super.field3749.method3042(8448, 8960, 8448);
            super.field3749.method2983(0, 768, 81, 5890);
            super.field3749.method2988(2, 847872872);
            super.field3749.method3042(8448, 8960, 8448);
            super.field3749.method2983(0, 768, 110, 5890);
            super.field3749.method2983(1, 768, -124, 34168);
            super.field3749.method3029(770, 0, 34200, 5890);
        } else {
            super.field3749.method3042(8448, 8960, 8448);
            super.field3749.method2983(0, 768, -82, 5890);
            super.field3749.method3029(770, 0, 34200, 5890);
        }
        super.field3749.method2988(arg0, 847872872);
        this.field8104.method2851((byte) -95);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 324)
    public static void method3238(byte arg0) {
        field8109 = null;
        if (arg0 < 81) {
            method3236((class218) null, (class218) null, 55);
        }
        field8114 = null;
        field8110 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)V", line = 336)
    public final void method142(boolean arg0, int arg1) {
        ++field8102;
        if (arg1 != 255) {
            this.method142(false, 106);
        }
        super.field3749.method3042(7681, 8960, 8448);
    }
}
