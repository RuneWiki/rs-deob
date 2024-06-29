import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class557 extends class27 {

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Z")
    private boolean field7506 = false;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
    private boolean field7495;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "[Lhda;")
    private class696[] field7507;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "[[I")
    public static int[][] field7501 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Lch;")
    public static class428 field7499 = new class428(2);

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lqm;")
    private class129 field7494;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Lwv;")
    public static class32 field7504;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BZ)V")
    public final void method258(byte arg0, boolean arg1) {
        if (this.field7494 != null && arg1) {
            if (!this.field7495) {
                super.field337.method3220(0, 2);
                super.field337.method3206(super.field337.field7893, (byte) 26);
                super.field337.method3220(0, 0);
            }
            this.field7494.method918(1, '\u0000');
            this.field7506 = true;
        } else {
            super.field337.method3198(0, 34168, true, 770);
        }
        if (arg0 >= -80) {
            this.method256((byte) 103);
        }
        ++field7505;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IILvf;)V")
    public final void method257(int arg0, int arg1, class136 arg2) {
        if (arg1 == -10479) {
            ++field7496;
            super.field337.method3206(arg2, (byte) 26);
            super.field337.method3205(5123, arg0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public final void method261(int arg0, int arg1, int arg2) {
        ++field7503;
        if (this.field7506) {
            super.field337.method3220(arg2 ^ 4, 1);
            super.field337.method3206(this.field7507[arg0 + -1], (byte) 26);
            super.field337.method3220(0, 0);
        }
        if (arg2 != 4) {
            method3121((String) null, 107);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method3119(int arg0) {
        field7504 = null;
        field7501 = null;
        field7499 = null;
        if (arg0 != -1) {
            method3119(-103);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    private final void method3120(int arg0) {
        this.field7494 = new class129(super.field337, 2);
        ++field7497;
        this.field7494.method919(0, 4864);
        super.field337.method3220(0, 1);
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
        if (this.field7495) {
            super.field337.method3210(260, -126, 7681);
            super.field337.method3164(5890, 0, (byte) 83, 770);
            super.field337.method3198(0, 34167, true, 770);
        } else {
            super.field337.method3210(7681, -114, 8448);
            super.field337.method3164(34168, 0, (byte) 106, 768);
            super.field337.method3220(arg0, 2);
            super.field337.method3210(260, -120, 7681);
            super.field337.method3164(34168, 0, (byte) 121, 768);
            super.field337.method3164(34168, 1, (byte) 85, 770);
            super.field337.method3198(0, 34167, true, 770);
        }
        super.field337.method3220(0, 0);
        this.field7494.method915((byte) 95);
        this.field7494.method919(1, arg0 ^ 4864);
        super.field337.method3220(0, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field7495) {
            super.field337.method3210(8448, 60, 8448);
            super.field337.method3164(5890, 0, (byte) 107, 768);
            super.field337.method3198(0, 5890, true, 770);
        } else {
            super.field337.method3210(8448, -92, 8448);
            super.field337.method3164(5890, 0, (byte) 82, 768);
            super.field337.method3220(0, 2);
            super.field337.method3210(8448, arg0 ^ 100, 8448);
            super.field337.method3164(5890, 0, (byte) 100, 768);
            super.field337.method3164(34168, 1, (byte) 86, 768);
            super.field337.method3198(0, 5890, true, 770);
        }
        super.field337.method3220(arg0, 0);
        this.field7494.method915((byte) 95);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)Z")
    public final boolean method260(boolean arg0) {
        if (arg0) {
            this.field7494 = null;
        }
        ++field7498;
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
    public final void method263(boolean arg0, int arg1) {
        if (arg1 != 8) {
            this.field7495 = true;
        }
        super.field337.method3210(8448, -99, 7681);
        ++field7502;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Llj;)V")
    public class557(class565 arg0) {
        super(arg0);
        if (arg0.field7914) {
            this.field7495 = arg0.field7919 < 3;
            int var2 = !this.field7495 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (var14 != 2) {
                                if (var14 == 3) {
                                    var15 = -var13;
                                } else if (var14 != 4) {
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
            this.field7507 = new class696[3];
            this.field7507[0] = new class696(super.field337, 6406, 64, false, var4, 6406);
            this.field7507[1] = new class696(super.field337, 6406, 64, false, var5, 6406);
            this.field7507[2] = new class696(super.field337, 6406, 64, false, var3, 6406);
            this.method3120(0);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public final void method256(byte arg0) {
        if (!this.field7506) {
            super.field337.method3198(0, 5890, true, 770);
        } else {
            if (!this.field7495) {
                super.field337.method3220(arg0 + -50, 2);
                super.field337.method3206((class136) null, (byte) 26);
            }
            super.field337.method3220(0, 1);
            super.field337.method3206((class136) null, (byte) 26);
            super.field337.method3220(0, 0);
            this.field7494.method918(arg0 ^ 51, '\u0001');
            this.field7506 = false;
        }
        if (arg0 == 50) {
            ++field7500;
            super.field337.method3210(8448, arg0 + -136, 8448);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3121(String arg0, int arg1) {
        ++field7493;
        if (arg0 == null) {
            return -1;
        } else {
            int var2 = 0;
            int var3 = 112 / ((-53 - arg1) / 48);
            while (~var2 > ~class671.field9419) {
                if (arg0.equalsIgnoreCase(class696.field9891[var2])) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }
}
