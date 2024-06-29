import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class268 extends class402 {

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Z")
    private boolean field3176 = false;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "Z")
    private boolean field3169;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "[Lhfa;")
    private class331[] field3172;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field3173;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3175;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "J")
    public static long field3171;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "Lpia;")
    private class104 field3165;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method178(byte arg0) {
        if (arg0 > -55) {
            this.field3165 = null;
        }
        ++field3167;
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lpc;)V", line = 18)
    public class268(class700 arg0) {
        super(arg0);
        if (arg0.field9858) {
            this.field3169 = arg0.field9798 < 3;
            int var2 = this.field3169 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (~var14 != -3) {
                                if (var14 == 3) {
                                    var15 = -var13;
                                } else if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) (Math.pow((double) var15, 96.0D) * (double) var2);
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
            this.field3172 = new class331[3];
            this.field3172[0] = new class331(super.field5243, 6406, 64, false, var4, 6406);
            this.field3172[1] = new class331(super.field5243, 6406, 64, false, var5, 6406);
            this.field3172[2] = new class331(super.field5243, 6406, 64, false, var3, 6406);
            this.method1588(-8967);
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(IZ)V", line = 130)
    public final void method184(int arg0, boolean arg1) {
        super.field5243.method3961(7681, 8448, arg0 + 16063);
        ++field3175;
        if (arg0 != 64) {
            this.method184(76, true);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 141)
    private final void method1588(int arg0) {
        ++field3173;
        this.field3165 = new class104(super.field5243, 2);
        this.field3165.method858(0, (byte) -48);
        super.field5243.method3925((byte) -109, 1);
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
        if (!this.field3169) {
            super.field5243.method3961(8448, 7681, arg0 + 25094);
            super.field5243.method3903(34168, 0, 768, -121);
            super.field5243.method3925((byte) -105, 2);
            super.field5243.method3961(7681, 260, arg0 + 25094);
            super.field5243.method3903(34168, 0, 768, -123);
            super.field5243.method3903(34168, 1, 770, -108);
            super.field5243.method3931(0, arg0 + 17927, 770, 34167);
        } else {
            super.field5243.method3961(7681, 260, arg0 + 25094);
            super.field5243.method3903(5890, 0, 770, -105);
            super.field5243.method3931(0, 8960, 770, 34167);
        }
        super.field5243.method3925((byte) 94, 0);
        this.field3165.method857(arg0 ^ arg0);
        this.field3165.method858(1, (byte) -30);
        super.field5243.method3925((byte) 61, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field3169) {
            super.field5243.method3961(8448, 8448, arg0 + 25094);
            super.field5243.method3903(5890, 0, 768, -108);
            super.field5243.method3925((byte) -112, 2);
            super.field5243.method3961(8448, 8448, arg0 ^ -7674);
            super.field5243.method3903(5890, 0, 768, arg0 ^ 9075);
            super.field5243.method3903(34168, 1, 768, -107);
            super.field5243.method3931(0, arg0 + 17927, 770, 5890);
        } else {
            super.field5243.method3961(8448, 8448, arg0 + 25094);
            super.field5243.method3903(5890, 0, 768, -114);
            super.field5243.method3931(0, arg0 ^ -7, 770, 5890);
        }
        super.field5243.method3925((byte) -93, 0);
        this.field3165.method857(arg0 + 8967);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 207)
    public final void method181(int arg0) {
        ++field3170;
        if (arg0 != -1) {
            this.method178((byte) -15);
        }
        if (!this.field3176) {
            super.field5243.method3931(0, 8960, 770, 5890);
        } else {
            if (!this.field3169) {
                super.field5243.method3925((byte) 48, 2);
                super.field5243.method3936(false, (class400) null);
            }
            super.field5243.method3925((byte) 104, 1);
            super.field5243.method3936(false, (class400) null);
            super.field5243.method3925((byte) -95, 0);
            this.field3165.method856(-95, '\u0001');
            this.field3176 = false;
        }
        super.field5243.method3961(8448, 8448, 16127);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V", line = 236)
    public final void method183(int arg0, int arg1, int arg2) {
        ++field3164;
        if (arg0 == 64) {
            if (this.field3176) {
                super.field5243.method3925((byte) -110, 1);
                super.field5243.method3936(false, this.field3172[arg1 + -1]);
                super.field5243.method3925((byte) -114, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLlc;Ljava/lang/String;ZLjava/lang/String;Z)V", line = 254)
    public static final void method1589(boolean arg0, class675 arg1, String arg2, boolean arg3, String arg4, boolean arg5) {
        ++field3166;
        if (!arg3) {
            method1590(107, true);
        }
        if (!arg0) {
            class158.method1113(3, (byte) -50, arg1, arg4);
        } else {
            if (class675.field9263.startsWith("win") && arg1.field9271) {
                String var6 = null;
                if (class345.field4331 != null) {
                    var6 = class345.field4331.getParameter("haveie6");
                }
                if (var6 == null || !var6.equals("1")) {
                    class561 var7 = class158.method1113(0, (byte) -66, arg1, arg4);
                    class434.field5720 = arg1;
                    class82.field1117 = arg4;
                    class216.field2548 = var7;
                    return;
                }
            }
            if (class675.field9263.startsWith("mac")) {
                String var8 = null;
                if (class345.field4331 != null) {
                    var8 = class345.field4331.getParameter("havefirefox");
                }
                if (var8 != null && var8.equals("1") && arg5) {
                    class627.method3554(true, arg1, arg2, 1, arg4);
                    return;
                }
            }
            class158.method1113(2, (byte) -125, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IZ)V", line = 323)
    public final void method176(int arg0, boolean arg1) {
        if (this.field3165 != null && arg1) {
            if (!this.field3169) {
                super.field5243.method3925((byte) 34, 2);
                super.field5243.method3936(false, super.field5243.field9766);
                super.field5243.method3925((byte) 97, 0);
            }
            this.field3165.method856(-82, '\u0000');
            this.field3176 = true;
        } else {
            super.field5243.method3931(0, 8960, 770, 34168);
        }
        if (arg0 < -32) {
            ++field3163;
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(IZ)V", line = 354)
    public static final void method1590(int arg0, boolean arg1) {
        if (class436.field5748 != null) {
            class436.field5748.method768(0);
            class436.field5748 = null;
        }
        ++field3177;
        class396.method2326(arg0 ^ 58);
        class276.method1611(113);
        class625.method3551();
        for (int var2 = 0; ~var2 > -5; ++var2) {
            class633.field8649[var2].method2487(19666);
        }
        class402.method2352(-1, false);
        System.gc();
        class320.method1910(2, (byte) -54);
        class36.field542 = -1;
        class52.field712 = false;
        class133.method991(117);
        class446.method2625(true, (byte) 110);
        class118.field1502 = 0;
        class456.field6440 = 0;
        class226.field2638 = 0;
        class518.field7310 = 0;
        class632.field8626 = 0;
        class620.field8435 = 0;
        for (int var3 = 0; class56.field756.length > var3; ++var3) {
            class56.field756[var3] = null;
        }
        class93.method827(5);
        if (arg0 == 12) {
            for (int var4 = 0; ~var4 > -2049; ++var4) {
                class61.field825[var4] = null;
            }
            class3.field42 = 0;
            class30.field444.method2115(0);
            class370.field4599 = 0;
            class673.field9230.method2115(0);
            class17.method217(106);
            class756.field10477 = 0;
            class2.field30.method3377((byte) -118);
            class697.method3882(20068);
            class667.method3746(-5369);
            class538.field7582 = null;
            class504.field7138 = null;
            class32.field501 = null;
            class629.field8600 = 0L;
            class227.field2671 = null;
            class621.field8525 = null;
            if (arg1) {
                class48.method454(12, -1);
            } else {
                class48.method454(3, -1);
                try {
                    class745.method4171("loggedout", class345.field4331, (byte) 83);
                } catch (Throwable var5) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLfha;)V", line = 435)
    public final void method180(int arg0, byte arg1, class400 arg2) {
        if (arg1 >= -103) {
            this.method180(-127, (byte) 0, (class400) null);
        }
        ++field3174;
        super.field5243.method3936(false, arg2);
        super.field5243.method3932(arg0, (byte) 89);
    }
}
