import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class273 extends class366 {

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Z")
    private boolean field3946 = false;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lcn;")
    private class356 field3942;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "J")
    public static long field3945;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lf;")
    public static class528 field3947;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "[[B")
    public static byte[][] field3951;

    static {
        new class180("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field3945 = 0L;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 6)
    public final void method1(int arg0) {
        ++field3948;
        if (this.field3946) {
            this.field3942.method2298('\u0001', 0);
            super.field5494.method2030(1, (byte) 38);
            super.field5494.method2042((class440) null, 0);
            super.field5494.method2030(0, (byte) -124);
        } else {
            super.field5494.method2034(0, 5890, 770, 8960);
        }
        if (arg0 > 2) {
            super.field5494.method2070(71, 8448, 8448);
            this.field3946 = false;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 28)
    public static void method1744(byte arg0) {
        if (arg0 != -103) {
            field3945 = -118L;
        }
        field3947 = null;
        field3951 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z", line = 39)
    public final boolean method9(int arg0) {
        ++field3941;
        return arg0 > 21;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V", line = 50)
    public final void method8(int arg0, int arg1, byte arg2) {
        ++field3949;
        if (arg2 < 18) {
            this.method8(6, -113, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 61)
    public final void method5(boolean arg0, int arg1) {
        ++field3944;
        int var3 = 34 % ((10 - arg1) / 48);
        class329 var4 = super.field5494.method2089(true);
        if (this.field3942 != null && var4 != null && arg0) {
            this.field3942.method2298('\u0000', 0);
            super.field5494.method2030(1, (byte) -128);
            super.field5494.method2042(var4, 0);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5494.field4820.method2525(-14766), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5494.method2030(0, (byte) 108);
            this.field3946 = true;
        } else {
            super.field5494.method2034(0, 34168, 770, 8960);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZ)V", line = 87)
    public final void method7(boolean arg0, boolean arg1) {
        super.field5494.method2070(117, 7681, 8448);
        ++field3943;
        if (!arg0) {
            this.method5(false, -62);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lqg;)V", line = 102)
    public class273(class321 arg0) {
        super(arg0);
        if (arg0.field4896) {
            this.field3942 = new class356(arg0, 2);
            this.field3942.method2295(0, (byte) 117);
            super.field5494.method2030(1, (byte) -125);
            super.field5494.method2070(112, 7681, 34165);
            super.field5494.method2053(-121, 2, 34168, 770);
            super.field5494.method2034(0, 34167, 770, 8960);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5494.method2030(0, (byte) 45);
            this.field3942.method2296(-126);
            this.field3942.method2295(1, (byte) 121);
            super.field5494.method2030(1, (byte) -123);
            super.field5494.method2070(70, 8448, 8448);
            super.field5494.method2053(-122, 2, 34166, 770);
            super.field5494.method2034(0, 5890, 770, 8960);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5494.method2030(0, (byte) -123);
            this.field3942.method2296(110);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILgo;B)V", line = 143)
    public final void method6(int arg0, class440 arg1, byte arg2) {
        super.field5494.method2042(arg1, 0);
        ++field3939;
        int var4 = 21 % ((arg2 - 31) / 59);
        super.field5494.method2068(arg0, 13134);
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)V", line = 166)
    public static final void method1745(int arg0) {
        ++field3940;
        if (class430.field6265 == null) {
            class430.field6265 = new int[65536];
            double var1 = -0.015D + 0.03D * Math.random() + 0.7D;
            if (arg0 != 256) {
                method1744((byte) 18);
            }
            for (int var3 = 0; ~var3 > -65537; ++var3) {
                double var4 = (double) (var3 >> 10 & 63) / 64.0D + 0.0078125D;
                double var6 = (double) ((var3 & 1020) >> 7) / 8.0D + 0.0625D;
                double var8 = (double) (var3 & 127) / 128.0D;
                double var10 = var8;
                double var12 = var8;
                double var14 = var8;
                if (var6 != 0.0D) {
                    double var16;
                    if (var8 < 0.5D) {
                        var16 = (var6 + 1.0D) * var8;
                    } else {
                        var16 = var6 + var8 + -(var6 * var8);
                    }
                    double var18 = var8 * 2.0D - var16;
                    double var20 = var4 + 0.3333333333333333D;
                    if (var20 > 1.0D) {
                        --var20;
                    }
                    double var24 = var4 - 0.3333333333333333D;
                    if (!(var20 * 6.0D < 1.0D)) {
                        if (var20 * 2.0D < 1.0D) {
                            var10 = var16;
                        } else if (var20 * 3.0D < 2.0D) {
                            var10 = (0.6666666666666666D - var20) * (-var18 + var16) * 6.0D + var18;
                        } else {
                            var10 = var18;
                        }
                    } else {
                        var10 = (var16 - var18) * 6.0D * var20 + var18;
                    }
                    if (var24 < 0.0D) {
                        ++var24;
                    }
                    if (var4 * 6.0D < 1.0D) {
                        var12 = (-var18 + var16) * 6.0D * var4 + var18;
                    } else if (!(var4 * 2.0D < 1.0D)) {
                        if (var4 * 3.0D < 2.0D) {
                            var12 = (-var18 + var16) * (-var4 + 0.6666666666666666D) * 6.0D + var18;
                        } else {
                            var12 = var18;
                        }
                    } else {
                        var12 = var16;
                    }
                    if (!(var24 * 6.0D < 1.0D)) {
                        if (var24 * 2.0D < 1.0D) {
                            var14 = var16;
                        } else if (var24 * 3.0D < 2.0D) {
                            var14 = (0.6666666666666666D - var24) * (-var18 + var16) * 6.0D + var18;
                        } else {
                            var14 = var18;
                        }
                    } else {
                        var14 = (var16 - var18) * 6.0D * var24 + var18;
                    }
                }
                double var26 = Math.pow(var10, var1);
                double var28 = Math.pow(var12, var1);
                double var30 = Math.pow(var14, var1);
                int var32 = (int) (var26 * 256.0D);
                int var33 = (int) (var28 * 256.0D);
                int var34 = (int) (var30 * 256.0D);
                int var35 = (var33 << 8) + (var32 << 16) + var34;
                class430.field6265[var3] = var35;
            }
        }
    }
}
