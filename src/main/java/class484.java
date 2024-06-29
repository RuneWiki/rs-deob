import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class484 extends class387 {

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "Z")
    private boolean field6613 = false;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
    private boolean field6621;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "[Ljc;")
    private class444[] field6618;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field6615;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lvi;")
    private class540 field6620;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JJ)J")
    public static long method2734(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
    public static final void method2735(int arg0, byte arg1) {
        if (~class120.field1919 != -2) {
            if (class120.field1919 == 2) {
                class299.field4249 = arg0;
            }
        } else {
            class535.field7044 = arg0;
        }
        ++field6616;
        if (arg1 == -111) {
            ;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lrda;)V")
    public class484(class663 arg0) {
        super(arg0);
        if (arg0.field9032) {
            this.field6621 = arg0.field9037 < 3;
            int var2 = this.field6621 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var9 * var11;
                    float var13 = var10 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (~var14 != -5) {
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
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
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
            this.field6618 = new class444[3];
            this.field6618[0] = new class444(super.field5405, 6406, 64, false, var4, 6406);
            this.field6618[1] = new class444(super.field5405, 6406, 64, false, var5, 6406);
            this.field6618[2] = new class444(super.field5405, 6406, 64, false, var3, 6406);
            this.method2736(1);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILiga;)V")
    public final void method638(byte arg0, int arg1, class460 arg2) {
        super.field5405.method3639(-2, arg2);
        ++field6611;
        super.field5405.method3631((byte) 127, arg1);
        if (arg0 <= 53) {
            this.field6613 = false;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)V")
    public final void method643(int arg0, int arg1, int arg2) {
        if (this.field6613) {
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, this.field6618[arg0 - 1]);
            super.field5405.method3630(true, 0);
        }
        ++field6617;
        int var4 = -86 / ((arg2 - 74) / 36);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)Z")
    public final boolean method641(int arg0) {
        ++field6610;
        if (arg0 != -16777216) {
            this.method639((byte) 122, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BZ)V")
    public final void method639(byte arg0, boolean arg1) {
        super.field5405.method3608(-49, 7681, 8448);
        if (arg0 > -123) {
            this.method641(54);
        }
        ++field6614;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public final void method644(boolean arg0) {
        ++field6612;
        if (!this.field6613) {
            super.field5405.method3599(0, 770, (byte) 37, 5890);
        } else {
            if (!this.field6621) {
                super.field5405.method3630(true, 2);
                super.field5405.method3639(-2, (class460) null);
            }
            super.field5405.method3630(true, 1);
            super.field5405.method3639(-2, (class460) null);
            super.field5405.method3630(!arg0, 0);
            this.field6620.method3013((byte) 113, '\u0001');
            this.field6613 = false;
        }
        if (arg0) {
            this.field6618 = null;
        }
        super.field5405.method3608(-5, 8448, 8448);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZB)V")
    public final void method640(boolean arg0, byte arg1) {
        if (this.field6620 != null && arg0) {
            if (!this.field6621) {
                super.field5405.method3630(true, 2);
                super.field5405.method3639(-2, super.field5405.field9038);
                super.field5405.method3630(true, 0);
            }
            this.field6620.method3013((byte) 56, '\u0000');
            this.field6613 = true;
        } else {
            super.field5405.method3599(0, 770, (byte) 37, 34168);
        }
        if (arg1 >= 1) {
            ++field6615;
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
    private final void method2736(int arg0) {
        this.field6620 = new class540(super.field5405, 2);
        ++field6619;
        this.field6620.method3012(arg0 ^ -125, 0);
        super.field5405.method3630(true, 1);
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
        if (this.field6621) {
            super.field5405.method3608(arg0 ^ 124, 7681, 260);
            super.field5405.method3661(770, 5890, 0, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 34167);
        } else {
            super.field5405.method3608(-38, 8448, 7681);
            super.field5405.method3661(768, 34168, 0, (byte) 4);
            super.field5405.method3630(true, 2);
            super.field5405.method3608(-66, 7681, 260);
            super.field5405.method3661(768, 34168, 0, (byte) 4);
            super.field5405.method3661(770, 34168, 1, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 34167);
        }
        super.field5405.method3630(true, 0);
        this.field6620.method3015((byte) 26);
        this.field6620.method3012(arg0 ^ -115, (char) arg0);
        super.field5405.method3630(true, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field6621) {
            super.field5405.method3608(-77, 8448, 8448);
            super.field5405.method3661(768, 5890, 0, (byte) 4);
            super.field5405.method3630(true, 2);
            super.field5405.method3608(124, 8448, 8448);
            super.field5405.method3661(768, 5890, 0, (byte) 4);
            super.field5405.method3661(768, 34168, 1, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 5890);
        } else {
            super.field5405.method3608(-73, 8448, 8448);
            super.field5405.method3661(768, 5890, 0, (byte) 4);
            super.field5405.method3599(0, 770, (byte) 37, 5890);
        }
        super.field5405.method3630(true, 0);
        this.field6620.method3015((byte) 26);
    }
}
