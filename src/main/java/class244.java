import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class244 extends class83 {

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Z")
    private boolean field3012 = false;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Z")
    private boolean field3009;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[Lfca;")
    private class140[] field3010;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    public static int field3022 = 0;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lcq;")
    public static class110 field3023 = new class110(50, 0);

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Leaa;")
    private class43 field3020;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static void method1441(int arg0) {
        if (arg0 == 34167) {
            field3023 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        class248.field3078 = -1;
        class184.field2065 = -1;
        if (arg0 == 22836) {
            class16.field130 = 0;
            ++field3014;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public final void method439(boolean arg0, int arg1) {
        ++field3019;
        super.field855.method2412((byte) -49, 8448, 7681);
        if (arg1 >= -123) {
            this.field3009 = false;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public final void method438(int arg0) {
        ++field3018;
        if (this.field3012) {
            if (!this.field3009) {
                super.field855.method2431((byte) -83, 2);
                super.field855.method2396((byte) 36, (class325) null);
            }
            super.field855.method2431((byte) -47, 1);
            super.field855.method2396((byte) 36, (class325) null);
            super.field855.method2431((byte) -112, 0);
            this.field3020.method222('\u0001', (byte) -34);
            this.field3012 = false;
        } else {
            super.field855.method2371(770, 0, -87, 5890);
        }
        if (arg0 == 18610) {
            super.field855.method2412((byte) -49, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BZ)V")
    public final void method433(byte arg0, boolean arg1) {
        ++field3015;
        if (arg0 != -48) {
            this.field3010 = null;
        }
        if (this.field3020 != null && arg1) {
            if (!this.field3009) {
                super.field855.method2431((byte) -57, 2);
                super.field855.method2396((byte) 36, super.field855.field5960);
                super.field855.method2431((byte) -59, 0);
            }
            this.field3020.method222('\u0000', (byte) -111);
            this.field3012 = true;
        } else {
            super.field855.method2371(770, 0, arg0 ^ 69, 34168);
        }
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    private final void method1443(int arg0) {
        ++field3021;
        this.field3020 = new class43(super.field855, 2);
        this.field3020.method219(24427, 0);
        super.field855.method2431((byte) -93, 1);
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
        if (!this.field3009) {
            super.field855.method2412((byte) -49, 7681, 8448);
            super.field855.method2428(768, 34168, 0, arg0 + -11917);
            super.field855.method2431((byte) -55, 2);
            super.field855.method2412((byte) -49, 260, 7681);
            super.field855.method2428(768, 34168, 0, -4);
            super.field855.method2428(770, 34168, 1, arg0 + -11917);
            super.field855.method2371(770, 0, arg0 ^ -11986, 34167);
        } else {
            super.field855.method2412((byte) -49, 260, 7681);
            super.field855.method2428(770, 5890, 0, arg0 + -11917);
            super.field855.method2371(770, 0, arg0 + -11985, 34167);
        }
        super.field855.method2431((byte) -75, 0);
        this.field3020.method223(1);
        this.field3020.method219(arg0 ^ 29154, 1);
        super.field855.method2431((byte) -117, 1);
        if (arg0 != 11913) {
            method1441(-69);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field3009) {
            super.field855.method2412((byte) -49, 8448, 8448);
            super.field855.method2428(768, 5890, 0, -4);
            super.field855.method2371(770, 0, -78, 5890);
        } else {
            super.field855.method2412((byte) -49, 8448, 8448);
            super.field855.method2428(768, 5890, 0, -4);
            super.field855.method2431((byte) -115, 2);
            super.field855.method2412((byte) -49, 8448, 8448);
            super.field855.method2428(768, 5890, 0, -4);
            super.field855.method2428(768, 34168, 1, -4);
            super.field855.method2371(770, 0, -123, 5890);
        }
        super.field855.method2431((byte) -51, 0);
        this.field3020.method223(1);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Lvj;)V")
    public class244(class422 arg0) {
        super(arg0);
        if (arg0.field5883) {
            this.field3009 = arg0.field5913 < 3;
            int var2 = !this.field3009 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (~var14 == -2) {
                                var15 = var13;
                            } else if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var12;
                                } else if (var14 == 4) {
                                    var15 = var11;
                                } else {
                                    var15 = -var11;
                                }
                            } else {
                                var15 = var12;
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
            this.field3010 = new class140[3];
            this.field3010[0] = new class140(super.field855, 6406, 64, false, var4, 6406);
            this.field3010[1] = new class140(super.field855, 6406, 64, false, var5, 6406);
            this.field3010[2] = new class140(super.field855, 6406, 64, false, var3, 6406);
            this.method1443(11913);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILav;)V")
    public final void method441(int arg0, int arg1, class325 arg2) {
        super.field855.method2396((byte) 36, arg2);
        ++field3016;
        if (arg0 != -29092) {
            this.method435(-71, 4, 124);
        }
        super.field855.method2421(arg1, 1);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Z")
    public final boolean method440(byte arg0) {
        if (arg0 >= -100) {
            return false;
        } else {
            ++field3013;
            return true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method435(int arg0, int arg1, int arg2) {
        if (this.field3012) {
            super.field855.method2431((byte) -53, 1);
            super.field855.method2396((byte) 36, this.field3010[arg1 + -1]);
            super.field855.method2431((byte) -61, 0);
        }
        ++field3011;
        int var4 = 112 % ((-60 - arg2) / 33);
    }
}
