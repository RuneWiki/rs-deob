import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class514 extends class301 {

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "Z")
    private boolean field6558 = false;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Z")
    private boolean field6552;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "[Lmaa;")
    private class528[] field6561;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lkka;")
    public static class542 field6557 = new class542();

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "I")
    public static int field6550;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
    public static int field6551;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Lnc;")
    private class516 field6562;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V", line = 3)
    public static void method2848(int arg0) {
        field6557 = null;
        if (arg0 != 1) {
            field6557 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZ)V", line = 13)
    public final void method29(int arg0, boolean arg1) {
        if (arg0 < 18) {
            this.field6552 = false;
        }
        if (this.field6562 != null && arg1) {
            if (!this.field6552) {
                super.field3803.method3945(2, false);
                super.field3803.method3975((byte) 120, super.field3803.field9944);
                super.field3803.method3945(0, false);
            }
            this.field6562.method2855(4864, '\u0000');
            this.field6558 = true;
        } else {
            super.field3803.method3922(0, 1, 770, 34168);
        }
        ++field6553;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V", line = 45)
    public final void method24(byte arg0) {
        if (!this.field6558) {
            super.field3803.method3922(0, 1, 770, 5890);
        } else {
            if (!this.field6552) {
                super.field3803.method3945(2, false);
                super.field3803.method3975((byte) 117, (class128) null);
            }
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 116, (class128) null);
            super.field3803.method3945(0, false);
            this.field6562.method2855(4864, '\u0001');
            this.field6558 = false;
        }
        if (arg0 >= -89) {
            this.method28((class128) null, -73, -24);
        }
        ++field6555;
        super.field3803.method3917(22, 8448, 8448);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lck;)V", line = 75)
    public class514(class733 arg0) {
        super(arg0);
        if (arg0.field9907) {
            this.field6552 = arg0.field9846 < 3;
            int var2 = this.field6552 ? 48 : 127;
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
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (var14 == 2) {
                            var15 = var12;
                        } else if (~var14 != -4) {
                            if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
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
            this.field6561 = new class528[3];
            this.field6561[0] = new class528(super.field3803, 6406, 64, false, var4, 6406);
            this.field6561[1] = new class528(super.field3803, 6406, 64, false, var5, 6406);
            this.field6561[2] = new class528(super.field3803, 6406, 64, false, var3, 6406);
            this.method2849(-120);
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)V", line = 186)
    public final void method22(int arg0, int arg1, int arg2) {
        if (this.field6558) {
            super.field3803.method3945(1, false);
            super.field3803.method3975((byte) 126, this.field6561[arg1 + -1]);
            super.field3803.method3945(0, false);
        }
        ++field6554;
        if (arg2 != 0) {
            this.method2849(-63);
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(IZ)V", line = 207)
    public final void method27(int arg0, boolean arg1) {
        super.field3803.method3917(arg0 + 106, 8448, 7681);
        if (arg0 != 0) {
            this.method28((class128) null, 24, -32);
        }
        ++field6550;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lwj;II)V", line = 219)
    public final void method28(class128 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method29(-45, false);
        }
        super.field3803.method3975((byte) 126, arg0);
        ++field6559;
        super.field3803.method3979((byte) -67, arg2);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Z", line = 236)
    public final boolean method25(byte arg0) {
        if (arg0 < 7) {
            field6557 = null;
        }
        ++field6551;
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)V", line = 252)
    private final void method2849(int arg0) {
        this.field6562 = new class516(super.field3803, 2);
        ++field6560;
        this.field6562.method2857(0, (byte) -119);
        super.field3803.method3945(1, false);
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
        if (!this.field6552) {
            super.field3803.method3917(101, 7681, 8448);
            super.field3803.method3954(0, 768, 34168, (byte) 108);
            super.field3803.method3945(2, false);
            super.field3803.method3917(73, 260, 7681);
            super.field3803.method3954(0, 768, 34168, (byte) 108);
            super.field3803.method3954(1, 770, 34168, (byte) 127);
            super.field3803.method3922(0, 1, 770, 34167);
        } else {
            super.field3803.method3917(56, 260, 7681);
            super.field3803.method3954(0, 770, 5890, (byte) 110);
            super.field3803.method3922(0, 1, 770, 34167);
        }
        super.field3803.method3945(0, false);
        this.field6562.method2856((byte) -115);
        this.field6562.method2857(1, (byte) -123);
        super.field3803.method3945(1, false);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        int var2 = 49 % ((arg0 - -60) / 37);
        if (!this.field6552) {
            super.field3803.method3917(53, 8448, 8448);
            super.field3803.method3954(0, 768, 5890, (byte) 104);
            super.field3803.method3945(2, false);
            super.field3803.method3917(36, 8448, 8448);
            super.field3803.method3954(0, 768, 5890, (byte) 110);
            super.field3803.method3954(1, 768, 34168, (byte) 117);
            super.field3803.method3922(0, 1, 770, 5890);
        } else {
            super.field3803.method3917(18, 8448, 8448);
            super.field3803.method3954(0, 768, 5890, (byte) 122);
            super.field3803.method3922(0, 1, 770, 5890);
        }
        super.field3803.method3945(0, false);
        this.field6562.method2856((byte) -89);
    }
}
