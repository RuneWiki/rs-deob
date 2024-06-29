import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class51 extends class45 {

    @OriginalMember(owner = "client!pv", name = "o", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Z")
    private boolean field558;

    @OriginalMember(owner = "client!pv", name = "x", descriptor = "[Lim;")
    private class401[] field572;

    @OriginalMember(owner = "client!pv", name = "w", descriptor = "I")
    public static int field571 = 13156520;

    @OriginalMember(owner = "client!pv", name = "p", descriptor = "Ljk;")
    public static class446 field564 = new class446("stellardawn", 1);

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "[I")
    public static int[] field574 = new int[14];

    @OriginalMember(owner = "client!pv", name = "A", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!pv", name = "k", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!pv", name = "l", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!pv", name = "m", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!pv", name = "u", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!pv", name = "v", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!pv", name = "y", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!pv", name = "n", descriptor = "Lct;")
    private class98 field562;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method279(boolean arg0, byte arg1) {
        super.field506.method2195(8448, 7681, true);
        ++field567;
        if (arg1 <= 115) {
            this.method287(39);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 15)
    public final void method287(int arg0) {
        ++field565;
        if (arg0 != 0) {
            this.method287(100);
        }
        if (!this.field563) {
            super.field506.method2237(true, 770, 5890, 0);
        } else {
            if (!this.field558) {
                super.field506.method2219(2, -127);
                super.field506.method2188((byte) 78, (class396) null);
            }
            super.field506.method2219(1, -127);
            super.field506.method2188((byte) 78, (class396) null);
            super.field506.method2219(0, -127);
            this.field562.method832('\u0001', ~arg0);
            this.field563 = false;
        }
        super.field506.method2195(8448, 8448, true);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lfd;)V", line = 43)
    public class51(class365 arg0) {
        super(arg0);
        if (arg0.field5368) {
            this.field558 = arg0.field5405 < 3;
            int var2 = !this.field558 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 != 1) {
                                if (var14 != 2) {
                                    if (var14 != 3) {
                                        if (~var14 == -5) {
                                            var15 = var11;
                                        } else {
                                            var15 = -var11;
                                        }
                                    } else {
                                        var15 = -var13;
                                    }
                                } else {
                                    var15 = var13;
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
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) (Math.pow((double) var15, 12.0D) * (double) var2);
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field572 = new class401[3];
            this.field572[0] = new class401(super.field506, 6406, 64, false, var4, 6406);
            this.field572[1] = new class401(super.field506, 6406, 64, false, var5, 6406);
            this.field572[2] = new class401(super.field506, 6406, 64, false, var3, 6406);
            this.method508(true);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V", line = 162)
    public static final void method506(byte arg0) {
        ++field569;
        class326.field4576.method368(class151.field2131, class478.field7044.field3339 ? class480.field7059 - -256 << 0 : -1, 256);
        if (arg0 != -98) {
            field564 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILkj;Z)V", line = 173)
    public final void method285(int arg0, class396 arg1, boolean arg2) {
        if (!arg2) {
            this.method280(false);
        }
        ++field561;
        super.field506.method2188((byte) 78, arg1);
        super.field506.method2183(7681, arg0);
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)I", line = 189)
    public static final int method507(byte arg0) {
        ++field568;
        if (arg0 != -29) {
            field574 = null;
        }
        class156 var1 = class100.field1370;
        synchronized (class100.field1370) {
            return class100.field1370.method1114((byte) -120);
        }
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V", line = 202)
    private final void method508(boolean arg0) {
        ++field573;
        this.field562 = new class98(super.field506, 2);
        this.field562.method833(0, arg0);
        super.field506.method2219(1, -120);
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
        if (this.field558) {
            super.field506.method2195(260, 7681, true);
            super.field506.method2228((byte) 79, 0, 770, 5890);
            super.field506.method2237(true, 770, 34167, 0);
        } else {
            super.field506.method2195(7681, 8448, true);
            super.field506.method2228((byte) 79, 0, 768, 34168);
            super.field506.method2219(2, -118);
            super.field506.method2195(260, 7681, true);
            super.field506.method2228((byte) 79, 0, 768, 34168);
            super.field506.method2228((byte) 79, 1, 770, 34168);
            super.field506.method2237(true, 770, 34167, 0);
        }
        super.field506.method2219(0, -118);
        this.field562.method834((byte) 39);
        this.field562.method833(1, arg0);
        super.field506.method2219(1, -119);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field558) {
            super.field506.method2195(8448, 8448, arg0);
            super.field506.method2228((byte) 79, 0, 768, 5890);
            super.field506.method2219(2, -127);
            super.field506.method2195(8448, 8448, true);
            super.field506.method2228((byte) 79, 0, 768, 5890);
            super.field506.method2228((byte) 79, 1, 768, 34168);
            super.field506.method2237(true, 770, 5890, 0);
        } else {
            super.field506.method2195(8448, 8448, true);
            super.field506.method2228((byte) 79, 0, 768, 5890);
            super.field506.method2237(true, 770, 5890, 0);
        }
        super.field506.method2219(0, -121);
        this.field562.method834((byte) 39);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)V", line = 269)
    public final void method281(int arg0, boolean arg1) {
        if (this.field562 != null && arg1) {
            if (!this.field558) {
                super.field506.method2219(2, -119);
                super.field506.method2188((byte) 78, super.field506.field5421);
                super.field506.method2219(0, -124);
            }
            this.field562.method832('\u0000', -1);
            this.field563 = true;
        } else {
            super.field506.method2237(true, 770, 34168, 0);
        }
        ++field559;
        if (arg0 != 0) {
            method509((class387) null, 49, (class387) null);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lfs;ILfs;)V", line = 296)
    public static final void method509(class387 arg0, int arg1, class387 arg2) {
        if (arg1 != 3168) {
            field564 = null;
        }
        ++field560;
        class423.field6244 = arg0;
        class244.field3587 = arg2;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)Z", line = 308)
    public final boolean method280(boolean arg0) {
        if (!arg0) {
            this.method508(false);
        }
        ++field557;
        return true;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)V", line = 320)
    public final void method286(int arg0, int arg1, int arg2) {
        if (this.field563) {
            super.field506.method2219(1, -127);
            super.field506.method2188((byte) 78, this.field572[arg0 + -1]);
            super.field506.method2219(0, -125);
        }
        ++field570;
        if (arg1 < 76) {
            method509((class387) null, -58, (class387) null);
        }
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(Z)V", line = 344)
    public static void method510(boolean arg0) {
        field564 = null;
        if (arg0) {
            field574 = null;
        }
    }
}
