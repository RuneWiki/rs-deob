import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class401 extends class190 {

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Z")
    private boolean field5953 = false;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
    private boolean field5959;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "[Lio;")
    private class708[] field5955;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lcb;")
    public static class631 field5961 = new class631(2, 1);

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Liw;")
    private class607 field5960;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Lgu;")
    public static class726 field5954;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)V", line = 3)
    public static void method2487(byte arg0) {
        field5961 = null;
        if (arg0 > -89) {
            field5954 = null;
        }
        field5954 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V", line = 14)
    public final void method910(boolean arg0) {
        if (!arg0) {
            ++field5951;
            if (!this.field5953) {
                super.field3195.method1264(5890, 2, 0, 770);
            } else {
                if (!this.field5959) {
                    super.field3195.method1298(2, (byte) -124);
                    super.field3195.method1306((class487) null, 70);
                }
                super.field3195.method1298(1, (byte) -124);
                super.field3195.method1306((class487) null, 46);
                super.field3195.method1298(0, (byte) -124);
                this.field5960.method3477((byte) 22, '\u0001');
                this.field5953 = false;
            }
            super.field3195.method1256(8448, -4, 8448);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V", line = 43)
    public final void method909(int arg0, boolean arg1) {
        ++field5962;
        if (arg0 == 16450) {
            super.field3195.method1256(7681, -4, 8448);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V", line = 57)
    public final void method915(boolean arg0, int arg1) {
        ++field5957;
        if (this.field5960 != null && arg0) {
            if (!this.field5959) {
                super.field3195.method1298(2, (byte) -124);
                super.field3195.method1306(super.field3195.field2823, arg1 ^ 94);
                super.field3195.method1298(0, (byte) -124);
            }
            this.field5960.method3477((byte) 116, '\u0000');
            this.field5953 = true;
        } else {
            super.field3195.method1264(34168, 2, 0, 770);
        }
        if (arg1 != 0) {
            this.method908(-62);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 83)
    public final boolean method908(int arg0) {
        if (arg0 <= 37) {
            return false;
        } else {
            ++field5958;
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILnba;I)V", line = 95)
    public final void method911(int arg0, class487 arg1, int arg2) {
        ++field5956;
        super.field3195.method1306(arg1, 110);
        super.field3195.method1334(arg2, arg0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 105)
    private final void method2488(int arg0) {
        this.field5960 = new class607(super.field3195, 2);
        if (arg0 < 112) {
            field5961 = null;
        }
        ++field5964;
        this.field5960.method3481(37, 0);
        super.field3195.method1298(1, (byte) -124);
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
        if (this.field5959) {
            super.field3195.method1256(7681, -4, 260);
            super.field3195.method1239(0, 5890, 768, 770);
            super.field3195.method1264(34167, 2, 0, 770);
        } else {
            super.field3195.method1256(8448, -4, 7681);
            super.field3195.method1239(0, 34168, 768, 768);
            super.field3195.method1298(2, (byte) -124);
            super.field3195.method1256(7681, -4, 260);
            super.field3195.method1239(0, 34168, 768, 768);
            super.field3195.method1239(1, 34168, 768, 770);
            super.field3195.method1264(34167, 2, 0, 770);
        }
        super.field3195.method1298(0, (byte) -124);
        this.field5960.method3479((byte) 117);
        this.field5960.method3481(-126, 1);
        super.field3195.method1298(1, (byte) -124);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field5959) {
            super.field3195.method1256(8448, -4, 8448);
            super.field3195.method1239(0, 5890, 768, 768);
            super.field3195.method1264(5890, 2, 0, 770);
        } else {
            super.field3195.method1256(8448, -4, 8448);
            super.field3195.method1239(0, 5890, 768, 768);
            super.field3195.method1298(2, (byte) -124);
            super.field3195.method1256(8448, -4, 8448);
            super.field3195.method1239(0, 5890, 768, 768);
            super.field3195.method1239(1, 34168, 768, 768);
            super.field3195.method1264(5890, 2, 0, 770);
        }
        super.field3195.method1298(0, (byte) -124);
        this.field5960.method3479((byte) 98);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([Lit;I)V", line = 175)
    public static final void method2489(class34[] arg0, int arg1) {
        ++field5952;
        class758.field10581 = arg0.length;
        class625.field8753 = new class34[class758.field10581 - -10];
        class465.field6788 = new int[class758.field10581 - -10];
        class571.method3310(arg0, 0, class625.field8753, 0, class758.field10581);
        for (int var2 = 0; class758.field10581 > var2; ++var2) {
            class465.field6788[var2] = class625.field8753[var2].method184();
        }
        for (int var3 = class758.field10581; ~var3 > ~class625.field8753.length; ++var3) {
            class465.field6788[var3] = 12;
        }
        int var4 = 105 / ((arg1 - 52) / 60);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lrs;)V", line = 203)
    public class401(class166 arg0) {
        super(arg0);
        if (arg0.field2848) {
            this.field5959 = ~arg0.field2793 > -4;
            int var2 = this.field5959 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (~var14 == -3) {
                                var15 = var12;
                            } else if (var14 == 3) {
                                var15 = -var12;
                            } else if (~var14 != -5) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
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
            this.field5955 = new class708[3];
            this.field5955[0] = new class708(super.field3195, 6406, 64, false, var4, 6406);
            this.field5955[1] = new class708(super.field3195, 6406, 64, false, var5, 6406);
            this.field5955[2] = new class708(super.field3195, 6406, 64, false, var3, 6406);
            this.method2488(114);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V", line = 320)
    public final void method914(int arg0, int arg1, byte arg2) {
        ++field5963;
        if (arg2 != -122) {
            field5961 = null;
        }
        if (this.field5953) {
            super.field3195.method1298(1, (byte) -124);
            super.field3195.method1306(this.field5955[arg0 - 1], 93);
            super.field3195.method1298(0, (byte) -124);
        }
    }
}
