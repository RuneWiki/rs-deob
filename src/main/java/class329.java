import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class329 extends class297 {

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "Z")
    private boolean field4339 = false;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "Z")
    private boolean field4332;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "[Lef;")
    private class336[] field4335;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Lvj;")
    public static class304 field4341 = new class304("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
    public static int field4343 = 0;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "Lbq;")
    public static class189 field4344;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Liq;")
    private class429 field4328;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I", line = 5)
    public static final int method1897(int arg0) {
        ++field4331;
        if ((double) class6.field170 == 3.0D) {
            return 37;
        } else if (arg0 != 5890) {
            return 123;
        } else if ((double) class6.field170 == 4.0D) {
            return 50;
        } else if ((double) class6.field170 == 6.0D) {
            return 75;
        } else {
            return (double) class6.field170 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lnk;II)V", line = 29)
    public final void method248(class501 arg0, int arg1, int arg2) {
        ++field4330;
        super.field3881.method2980(arg0, 123);
        if (arg1 == 0) {
            super.field3881.method2976((byte) 62, arg2);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method244(int arg0, boolean arg1) {
        if (this.field4328 != null && arg1) {
            if (!this.field4332) {
                super.field3881.method3003(2, arg0 ^ 118);
                super.field3881.method2980(super.field3881.field7438, 119);
                super.field3881.method3003(0, 94);
            }
            this.field4328.method2480('\u0000', -1);
            this.field4339 = true;
        } else {
            super.field3881.method2950((byte) -34, 770, 0, 34168);
        }
        if (arg0 != 0) {
            this.method1900(-81);
        }
        ++field4340;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)Z", line = 72)
    public final boolean method240(boolean arg0) {
        if (arg0) {
            this.field4339 = true;
        }
        ++field4334;
        return true;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 83)
    public static final void method1898(int arg0) {
        if (arg0 == 0) {
            class199.field2764.method1458((byte) -69);
            ++field4337;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 95)
    public final void method246(int arg0) {
        ++field4338;
        if (arg0 != 6) {
            this.field4328 = null;
        }
        if (!this.field4339) {
            super.field3881.method2950((byte) -34, 770, 0, 5890);
        } else {
            if (!this.field4332) {
                super.field3881.method3003(2, 60);
                super.field3881.method2980((class501) null, 112);
            }
            super.field3881.method3003(1, 52);
            super.field3881.method2980((class501) null, 121);
            super.field3881.method3003(0, 63);
            this.field4328.method2480('\u0001', -1);
            this.field4339 = false;
        }
        super.field3881.method3002((byte) -86, 8448, 8448);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZII)V", line = 124)
    public final void method245(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4341 = null;
        }
        if (this.field4339) {
            super.field3881.method3003(1, 35);
            super.field3881.method2980(this.field4335[arg2 - 1], 120);
            super.field3881.method3003(0, 22);
        }
        ++field4329;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method241(boolean arg0, int arg1) {
        super.field3881.method3002((byte) -90, 8448, 7681);
        if (arg1 != -30965) {
            method1897(-124);
        }
        ++field4333;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(IZ)V", line = 156)
    public static final void method1899(int arg0, boolean arg1) {
        ++field4336;
        if (arg0 != 11153) {
            field4344 = null;
        }
        class336.method1922(class175.field2555, class149.field2132, class474.field6555, arg1, arg0 + -27057);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lbo;)V", line = 168)
    public class329(class511 arg0) {
        super(arg0);
        if (arg0.field7447) {
            this.field4332 = arg0.field7522 < 3;
            int var2 = !this.field4332 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (var14 == 2) {
                            var15 = var12;
                        } else if (~var14 == -4) {
                            var15 = -var12;
                        } else if (var14 == 4) {
                            var15 = var11;
                        } else {
                            var15 = -var11;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) ((double) var2 * Math.pow((double) var15, 36.0D));
                            var18 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
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
            this.field4335 = new class336[3];
            this.field4335[0] = new class336(super.field3881, 6406, 64, false, var4, 6406);
            this.field4335[1] = new class336(super.field3881, 6406, 64, false, var5, 6406);
            this.field4335[2] = new class336(super.field3881, 6406, 64, false, var3, 6406);
            this.method1900(99);
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 280)
    private final void method1900(int arg0) {
        ++field4342;
        this.field4328 = new class429(super.field3881, 2);
        this.field4328.method2482(0, -112);
        super.field3881.method3003(1, 58);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        if (arg0 > 32) {
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field4332) {
                super.field3881.method3002((byte) -126, 260, 7681);
                super.field3881.method2953(0, (byte) 77, 770, 5890);
                super.field3881.method2950((byte) -34, 770, 0, 34167);
            } else {
                super.field3881.method3002((byte) -127, 7681, 8448);
                super.field3881.method2953(0, (byte) 74, 768, 34168);
                super.field3881.method3003(2, 16);
                super.field3881.method3002((byte) -80, 260, 7681);
                super.field3881.method2953(0, (byte) 103, 768, 34168);
                super.field3881.method2953(1, (byte) 104, 770, 34168);
                super.field3881.method2950((byte) -34, 770, 0, 34167);
            }
            super.field3881.method3003(0, 110);
            this.field4328.method2479(-16981);
            this.field4328.method2482(1, -33);
            super.field3881.method3003(1, 23);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field4332) {
                super.field3881.method3002((byte) -69, 8448, 8448);
                super.field3881.method2953(0, (byte) 75, 768, 5890);
                super.field3881.method3003(2, 53);
                super.field3881.method3002((byte) -114, 8448, 8448);
                super.field3881.method2953(0, (byte) 111, 768, 5890);
                super.field3881.method2953(1, (byte) 61, 768, 34168);
                super.field3881.method2950((byte) -34, 770, 0, 5890);
            } else {
                super.field3881.method3002((byte) -63, 8448, 8448);
                super.field3881.method2953(0, (byte) 115, 768, 5890);
                super.field3881.method2950((byte) -34, 770, 0, 5890);
            }
            super.field3881.method3003(0, 29);
            this.field4328.method2479(-16981);
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 351)
    public static void method1901(byte arg0) {
        field4341 = null;
        if (arg0 == -106) {
            field4344 = null;
        }
    }
}
