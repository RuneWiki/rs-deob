import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class384 extends class675 {

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "Z")
    private boolean field5473 = false;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "Z")
    private boolean field5471;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "[Lmu;")
    private class314[] field5480;

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "I")
    public static int field5475 = 999999;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!mn", name = "o", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "Lee;")
    private class703 field5482;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lco;BI)V", line = 3)
    public static final void method2350(class129 arg0, byte arg1, int arg2) {
        ++field5484;
        if (arg1 != 117) {
            field5475 = 49;
        }
        if (~class636.field8961 > -51) {
            if (arg0 != null && arg0.field1670 != null && arg0.field1670.length > arg2 && arg0.field1670[arg2] != null) {
                int var3 = arg0.field1670[arg2][0];
                int var4 = var3 >> 8;
                if (arg0.field1670[arg2].length > 1) {
                    int var5 = (int) ((double) arg0.field1670[arg2].length * Math.random());
                    if (~var5 < -1) {
                        var4 = arg0.field1670[arg2][var5];
                    }
                }
                int var6 = (251 & var3) >> 5;
                int var7 = 256;
                if (arg0.field1691 != null && arg0.field1682 != null) {
                    var7 = class76.method590(arg0.field1682[arg2], (byte) -16, arg0.field1691[arg2]);
                }
                if (arg0.field1666) {
                    class256.method1686(var7, 0, (byte) 115, var4, false, var6, 255);
                } else {
                    class490.method2864(var4, 0, true, var6, var7, 255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lfia;IZ)V", line = 50)
    public final void method1348(class599 arg0, int arg1, boolean arg2) {
        super.field9618.method1840(arg0, 2205);
        if (arg2) {
            ++field5476;
            super.field9618.method1889(false, arg1);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZI)V", line = 62)
    public final void method1354(boolean arg0, int arg1) {
        if (arg1 != -24765) {
            this.field5471 = true;
        }
        if (this.field5482 != null && arg0) {
            if (!this.field5471) {
                super.field9618.method1825(2, 0);
                super.field9618.method1840(super.field9618.field4235, 2205);
                super.field9618.method1825(0, 126);
            }
            this.field5482.method3982((byte) -120, '\u0000');
            this.field5473 = true;
        } else {
            super.field9618.method1828((byte) -35, 34168, 770, 0);
        }
        ++field5474;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)Z", line = 96)
    public final boolean method1347(byte arg0) {
        if (arg0 <= 105) {
            this.method1353((byte) 92);
        }
        ++field5483;
        return true;
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lkv;)V", line = 113)
    public class384(class280 arg0) {
        super(arg0);
        if (arg0.field4258) {
            this.field5471 = ~arg0.field4205 > -4;
            int var2 = this.field5471 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var12;
                        } else if (~var14 == -2) {
                            var15 = var12;
                        } else if (~var14 != -3) {
                            if (~var14 == -4) {
                                var15 = -var13;
                            } else if (var14 != 4) {
                                var15 = -var11;
                            } else {
                                var15 = var11;
                            }
                        } else {
                            var15 = var13;
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
            this.field5480 = new class314[3];
            this.field5480[0] = new class314(super.field9618, 6406, 64, false, var4, 6406);
            this.field5480[1] = new class314(super.field9618, 6406, 64, false, var5, 6406);
            this.field5480[2] = new class314(super.field9618, 6406, 64, false, var3, 6406);
            this.method2352((byte) -128);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I[Lqda;)V", line = 225)
    public static final void method2351(int arg0, class112[] arg1) {
        ++field5479;
        class69.field932 = arg1.length;
        class725.field10175 = new class112[class69.field932 - -10];
        class170.field2438 = new int[class69.field932 + 10];
        class42.method291(arg1, 0, class725.field10175, 0, class69.field932);
        for (int var2 = arg0; class69.field932 > var2; ++var2) {
            class170.field2438[var2] = class725.field10175[var2].method792();
        }
        for (int var3 = class69.field932; ~var3 > ~class725.field10175.length; ++var3) {
            class170.field2438[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V", line = 250)
    public final void method1350(boolean arg0, boolean arg1) {
        ++field5477;
        super.field9618.method1835(arg1, 8448, 7681);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V", line = 258)
    public final void method1353(byte arg0) {
        ++field5472;
        if (!this.field5473) {
            super.field9618.method1828((byte) -57, 5890, 770, 0);
        } else {
            if (!this.field5471) {
                super.field9618.method1825(2, 118);
                super.field9618.method1840((class599) null, 2205);
            }
            super.field9618.method1825(1, 124);
            super.field9618.method1840((class599) null, 2205);
            super.field9618.method1825(0, -9);
            this.field5482.method3982((byte) -120, '\u0001');
            this.field5473 = false;
        }
        if (arg0 == 52) {
            super.field9618.method1835(false, 8448, 8448);
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(B)V", line = 289)
    private final void method2352(byte arg0) {
        this.field5482 = new class703(super.field9618, 2);
        ++field5478;
        this.field5482.method3980(0, -27400);
        super.field9618.method1825(1, 112);
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
        if (!this.field5471) {
            super.field9618.method1835(false, 7681, 8448);
            super.field9618.method1842(768, -76, 0, 34168);
            super.field9618.method1825(2, -25);
            super.field9618.method1835(false, 260, 7681);
            super.field9618.method1842(768, -53, 0, 34168);
            super.field9618.method1842(770, -77, 1, 34168);
            super.field9618.method1828((byte) -57, 34167, 770, 0);
        } else {
            super.field9618.method1835(false, 260, 7681);
            super.field9618.method1842(770, 99, 0, 5890);
            super.field9618.method1828((byte) -100, 34167, 770, 0);
        }
        super.field9618.method1825(0, 111);
        this.field5482.method3978(0);
        this.field5482.method3980(1, -27400);
        super.field9618.method1825(1, -28);
        OpenGL.glDisable(3168);
        if (arg0 < -53) {
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field5471) {
                super.field9618.method1835(false, 8448, 8448);
                super.field9618.method1842(768, -126, 0, 5890);
                super.field9618.method1828((byte) -69, 5890, 770, 0);
            } else {
                super.field9618.method1835(false, 8448, 8448);
                super.field9618.method1842(768, 125, 0, 5890);
                super.field9618.method1825(2, -36);
                super.field9618.method1835(false, 8448, 8448);
                super.field9618.method1842(768, 127, 0, 5890);
                super.field9618.method1842(768, -90, 1, 34168);
                super.field9618.method1828((byte) -104, 5890, 770, 0);
            }
            super.field9618.method1825(0, 114);
            this.field5482.method3978(0);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(III)V", line = 358)
    public final void method1351(int arg0, int arg1, int arg2) {
        if (this.field5473) {
            super.field9618.method1825(1, 113);
            super.field9618.method1840(this.field5480[arg0 + -1], 2205);
            super.field9618.method1825(0, 120);
        }
        ++field5481;
        if (arg1 != 8865) {
            this.method1351(-77, 94, 6);
        }
    }
}
