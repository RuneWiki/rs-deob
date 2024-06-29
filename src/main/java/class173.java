import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class173 extends class648 {

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Z")
    private boolean field2486 = false;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    private boolean field2489;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "[Lnm;")
    private class403[] field2492;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2491 = 0;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    public static boolean field2495 = false;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "F")
    public static float field2493;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lud;")
    private class31 field2487;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Lrw;")
    public static class645 field2494;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lgi;)V")
    public class173(class583 arg0) {
        super(arg0);
        if (arg0.field8287) {
            this.field2489 = ~arg0.field8258 > -4;
            int var2 = !this.field2489 ? 127 : 48;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var13;
                        } else if (var14 == 1) {
                            var15 = var13;
                        } else if (~var14 != -3) {
                            if (var14 != 3) {
                                if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var12;
                            }
                        } else {
                            var15 = var12;
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
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field2492 = new class403[3];
            this.field2492[0] = new class403(super.field9395, 6406, 64, false, var4, 6406);
            this.field2492[1] = new class403(super.field9395, 6406, 64, false, var5, 6406);
            this.field2492[2] = new class403(super.field9395, 6406, 64, false, var3, 6406);
            this.method1091(8448);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 > -111) {
            this.field2492 = null;
        }
        ++field2485;
        super.field9395.method3389(false, 8448, 7681);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        ++field2497;
        if (arg0 != 1) {
            this.field2492 = null;
        }
        if (this.field2486) {
            if (!this.field2489) {
                super.field9395.method3398(arg0 + -39, 2);
                super.field9395.method3358(32886, (class418) null);
            }
            super.field9395.method3398(arg0 + -98, 1);
            super.field9395.method3358(arg0 ^ 32887, (class418) null);
            super.field9395.method3398(arg0 ^ -31, 0);
            this.field2487.method317('\u0001', true);
            this.field2486 = false;
        } else {
            super.field9395.method3340(770, 0, 5890, arg0);
        }
        super.field9395.method3389(false, 8448, 8448);
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    private final void method1091(int arg0) {
        this.field2487 = new class31(super.field9395, 2);
        ++field2488;
        this.field2487.method320(-28457, 0);
        super.field9395.method3398(arg0 + -8523, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        if (arg0 != 8448) {
            this.field2492 = null;
        }
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (this.field2489) {
            super.field9395.method3389(false, 260, 7681);
            super.field9395.method3407(0, 770, -127, 5890);
            super.field9395.method3340(770, 0, 34167, arg0 + -8447);
        } else {
            super.field9395.method3389(false, 7681, 8448);
            super.field9395.method3407(0, 768, -128, 34168);
            super.field9395.method3398(-56, 2);
            super.field9395.method3389(false, 260, 7681);
            super.field9395.method3407(0, 768, -120, 34168);
            super.field9395.method3407(1, 770, -122, 34168);
            super.field9395.method3340(770, 0, 34167, arg0 ^ 8449);
        }
        super.field9395.method3398(arg0 + -8495, 0);
        this.field2487.method321(2);
        this.field2487.method320(arg0 ^ -20009, 1);
        super.field9395.method3398(-92, 1);
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (this.field2489) {
            super.field9395.method3389(false, 8448, 8448);
            super.field9395.method3407(0, 768, -118, 5890);
            super.field9395.method3340(770, 0, 5890, 1);
        } else {
            super.field9395.method3389(false, 8448, 8448);
            super.field9395.method3407(0, 768, -119, 5890);
            super.field9395.method3398(arg0 ^ -8568, 2);
            super.field9395.method3389(false, 8448, 8448);
            super.field9395.method3407(0, 768, arg0 ^ -8570, 5890);
            super.field9395.method3407(1, 768, -126, 34168);
            super.field9395.method3340(770, 0, 5890, arg0 ^ 8449);
        }
        super.field9395.method3398(-70, 0);
        this.field2487.method321(arg0 ^ 8450);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)V")
    public static void method1092(int arg0) {
        if (arg0 >= -68) {
            field2493 = 1.5813934F;
        }
        field2494 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        ++field2499;
        if (this.field2486) {
            super.field9395.method3398(-42, 1);
            super.field9395.method3358(32886, this.field2492[arg1 + -1]);
            super.field9395.method3398(-62, 0);
        }
        int var4 = -107 / ((30 - arg2) / 56);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 <= 122) {
            return false;
        } else {
            ++field2496;
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        ++field2484;
        if (this.field2487 != null && arg1) {
            if (!this.field2489) {
                super.field9395.method3398(-70, 2);
                super.field9395.method3358(32886, super.field9395.field8296);
                super.field9395.method3398(arg0 + -17846, 0);
            }
            this.field2487.method317('\u0000', true);
            this.field2486 = true;
        } else {
            super.field9395.method3340(770, 0, 34168, 1);
        }
        if (arg0 != 17729) {
            this.method944((byte) 91, false);
        }
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static final void method1093(int arg0) {
        ++field2490;
        if (~class440.field6254 != -3) {
            if (class440.field6254 != 6) {
                if (class440.field6254 == 9) {
                    class45.method440(10, 28);
                }
            } else {
                class45.method440(7, arg0 ^ -94);
            }
        } else {
            class45.method440(3, 84);
        }
        if (arg0 != 3) {
            method1092(-58);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        ++field2498;
        if (arg0 != -30) {
            field2494 = null;
        }
        super.field9395.method3358(32886, arg1);
        super.field9395.method3396((byte) -115, arg2);
    }
}
