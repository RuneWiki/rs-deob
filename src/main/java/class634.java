import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class634 extends class118 {

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "Z")
    private boolean field9249 = false;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
    private boolean field9246;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "[Lbo;")
    private class227[] field9241;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "Lqp;")
    public static class586 field9253 = new class586(55, 2);

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
    public static int field9255;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Lni;")
    private class630 field9240;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "[Lha;")
    public static class116[] field9250;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)V", line = 3)
    public final void method442(boolean arg0, byte arg1) {
        if (this.field9240 != null && arg0) {
            if (!this.field9246) {
                super.field1544.method2842(2, (byte) 42);
                super.field1544.method2811(super.field1544.field7058, -2);
                super.field1544.method2842(0, (byte) 42);
            }
            this.field9240.method3670('\u0000', false);
            this.field9249 = true;
        } else {
            super.field1544.method2772(34168, 770, (byte) -77, 0);
        }
        if (arg1 <= -101) {
            ++field9247;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)Z", line = 29)
    public final boolean method446(byte arg0) {
        ++field9254;
        if (arg0 != 29) {
            field9256 = -26;
        }
        return true;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BZ)V", line = 40)
    public final void method439(byte arg0, boolean arg1) {
        super.field1544.method2852(8448, (byte) 101, 7681);
        if (arg0 != 56) {
            field9253 = null;
        }
        ++field9248;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "([BLjava/lang/String;BI)I", line = 52)
    public static final int method3682(byte[] arg0, String arg1, byte arg2, int arg3) {
        ++field9252;
        int var4 = arg1.length();
        int var5 = arg3;
        for (int var6 = 0; ~var4 < ~var6; ++var6) {
            char var7 = arg1.charAt(var6);
            if (var7 > 127) {
                if (var7 > 2047) {
                    arg0[var5++] = (byte) (class313.method1926(919448, var7) >> 12);
                    arg0[var5++] = (byte) class313.method1926(class637.method3693(63, var7 >> 6), 128);
                    arg0[var5++] = (byte) class313.method1926(128, class637.method3693(63, var7));
                } else {
                    arg0[var5++] = (byte) class313.method1926(192, var7 >> 6);
                    arg0[var5++] = (byte) class313.method1926(128, class637.method3693(var7, 63));
                }
            } else {
                arg0[var5++] = (byte) var7;
            }
        }
        if (arg2 < 4) {
            method3684(false, 55, -17);
        }
        return -arg3 + var5;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IBI)V", line = 96)
    public final void method445(int arg0, byte arg1, int arg2) {
        if (arg1 == 23) {
            ++field9244;
            if (this.field9249) {
                super.field1544.method2842(1, (byte) 42);
                super.field1544.method2811(this.field9241[arg0 + -1], arg1 ^ -23);
                super.field1544.method2842(0, (byte) 42);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "(B)V", line = 116)
    public static void method3683(byte arg0) {
        field9250 = null;
        field9253 = null;
        if (arg0 != -5) {
            method3683((byte) 59);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZII)V", line = 132)
    public static final void method3684(boolean arg0, int arg1, int arg2) {
        ++field9242;
        if (arg2 == -30001) {
            class580 var3 = class585.method3419(-14473, arg0, arg1);
            if (var3 != null) {
                var3.method2997(1);
            }
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 149)
    public final void method441(int arg0) {
        ++field9243;
        if (this.field9249) {
            if (!this.field9246) {
                super.field1544.method2842(2, (byte) 42);
                super.field1544.method2811((class541) null, -2);
            }
            super.field1544.method2842(1, (byte) 42);
            super.field1544.method2811((class541) null, -2);
            super.field1544.method2842(0, (byte) 42);
            this.field9240.method3670('\u0001', false);
            this.field9249 = false;
        } else {
            super.field1544.method2772(5890, 770, (byte) 49, 0);
        }
        int var2 = -23 % ((arg0 - -58) / 41);
        super.field1544.method2852(8448, (byte) 73, 8448);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lbaa;IB)V", line = 178)
    public final void method440(class541 arg0, int arg1, byte arg2) {
        if (arg2 <= -17) {
            super.field1544.method2811(arg0, -2);
            ++field9245;
            super.field1544.method2791(arg1, (byte) -53);
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Los;)V", line = 190)
    public class634(class468 arg0) {
        super(arg0);
        if (arg0.field7076) {
            this.field9246 = arg0.field7035 < 3;
            int var2 = this.field9246 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 != -4) {
                                if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field9241 = new class227[3];
            this.field9241[0] = new class227(super.field1544, 6406, 64, false, var4, 6406);
            this.field9241[1] = new class227(super.field1544, 6406, 64, false, var5, 6406);
            this.field9241[2] = new class227(super.field1544, 6406, 64, false, var3, 6406);
            this.method3685(768);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V", line = 304)
    private final void method3685(int arg0) {
        ++field9251;
        this.field9240 = new class630(super.field1544, 2);
        this.field9240.method3673(0, arg0 + -769);
        super.field1544.method2842(1, (byte) 42);
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
        if (!this.field9246) {
            super.field1544.method2852(7681, (byte) 100, 8448);
            super.field1544.method2801(false, 34168, 0, 768);
            super.field1544.method2842(2, (byte) 42);
            super.field1544.method2852(260, (byte) 111, 7681);
            super.field1544.method2801(false, 34168, 0, 768);
            super.field1544.method2801(false, 34168, 1, 770);
            super.field1544.method2772(34167, 770, (byte) 127, 0);
        } else {
            super.field1544.method2852(260, (byte) 18, 7681);
            super.field1544.method2801(false, 5890, 0, 770);
            super.field1544.method2772(34167, 770, (byte) 111, 0);
        }
        super.field1544.method2842(0, (byte) 42);
        this.field9240.method3674(true);
        this.field9240.method3673(1, arg0 + -769);
        super.field1544.method2842(1, (byte) 42);
        OpenGL.glDisable(3168);
        if (arg0 != 768) {
            this.method446((byte) 107);
        }
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field9246) {
            super.field1544.method2852(8448, (byte) 12, 8448);
            super.field1544.method2801(false, 5890, 0, 768);
            super.field1544.method2772(5890, 770, (byte) 67, 0);
        } else {
            super.field1544.method2852(8448, (byte) 114, 8448);
            super.field1544.method2801(false, 5890, 0, 768);
            super.field1544.method2842(2, (byte) 42);
            super.field1544.method2852(8448, (byte) 18, 8448);
            super.field1544.method2801(false, 5890, 0, 768);
            super.field1544.method2801(false, 34168, 1, 768);
            super.field1544.method2772(5890, 770, (byte) -82, 0);
        }
        super.field1544.method2842(0, (byte) 42);
        this.field9240.method3674(true);
    }
}
