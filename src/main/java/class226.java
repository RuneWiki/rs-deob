import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class226 extends class446 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Lai;")
    private class428 field3532;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ltm;")
    private class267 field3529;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "[S")
    public static short[] field3536 = new short[256];

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ls;")
    public static class186 field3528 = new class186(47, 8);

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field3539 = 0;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V")
    public final void method688(int arg0) {
        ++field3538;
        this.field3529.method1702(-23, '\u0001');
        super.field6642.method392((byte) 106, 1);
        super.field6642.method381((byte) 28, (class381) null);
        super.field6642.method392((byte) 106, 0);
        if (arg0 <= 5) {
            this.method689(95, -99, 34);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)V")
    public final void method689(int arg0, int arg1, int arg2) {
        ++field3537;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((24 & arg1) >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = (arg1 & 128) != 0;
        super.field6642.method392((byte) 106, 1);
        if (var7) {
            class463.field6876[2] = 0.0F;
            class463.field6876[3] = 0.0F;
            class463.field6876[1] = 0.0F;
            class463.field6876[0] = var6;
        } else {
            class463.field6876[1] = 0.0F;
            class463.field6876[3] = 0.0F;
            class463.field6876[0] = 0.0F;
            class463.field6876[2] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class463.field6876, 0);
        class463.field6876[3] = (float) super.field6642.field806 * var4 % 1.0F;
        class463.field6876[2] = 0.0F;
        class463.field6876[1] = var6;
        if (arg0 != -1) {
            field3539 = -64;
        }
        class463.field6876[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class463.field6876, 0);
        if (!this.field3532.field6400) {
            int var8 = (int) ((float) super.field6642.field806 * var5 * 16.0F);
            super.field6642.method381((byte) 28, this.field3532.field6399[var8 % 16]);
        } else {
            class463.field6876[1] = 0.0F;
            class463.field6876[2] = 0.0F;
            class463.field6876[0] = 0.0F;
            class463.field6876[3] = (float) super.field6642.field806 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class463.field6876, 0);
        }
        super.field6642.method392((byte) 106, 0);
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lda;Lai;)V")
    public class226(class44 arg0, class428 arg1) {
        super(arg0);
        this.field3532 = arg1;
        this.field3529 = new class267(arg0, 2);
        this.field3529.method1699((byte) 88, 0);
        super.field6642.method392((byte) 106, 1);
        if (this.field3532.field6400) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6642.method392((byte) 106, 0);
        this.field3529.method1700(2);
        this.field3529.method1699((byte) 88, 1);
        super.field6642.method392((byte) 106, 1);
        if (this.field3532.field6400) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6642.method392((byte) 106, 0);
        this.field3529.method1700(2);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z")
    public final boolean method691(byte arg0) {
        if (arg0 != -93) {
            this.method696(true, (byte) -52);
        }
        ++field3534;
        return true;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILac;)V")
    public final void method694(int arg0, int arg1, class381 arg2) {
        super.field6642.method381((byte) 28, arg2);
        ++field3535;
        if (arg1 == 0) {
            super.field6642.method288((byte) 23, arg0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
    public static void method1505(int arg0) {
        field3528 = null;
        field3536 = null;
        if (arg0 != 20407) {
            method1506(91, -88);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZB)V")
    public final void method696(boolean arg0, byte arg1) {
        this.field3529.method1702(-21, '\u0000');
        ++field3531;
        if (arg1 != 42) {
            this.method691((byte) -124);
        }
        if (this.field3532.field6400) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, this.field3532.field6402);
            super.field6642.method392((byte) 106, 0);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ)V")
    public final void method695(byte arg0, boolean arg1) {
        ++field3533;
        if (arg0 != -33) {
            this.method694(-12, -20, (class381) null);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)I")
    public static final int method1506(int arg0, int arg1) {
        ++field3530;
        double var2 = (double) (255 & arg0 >> 16) / 256.0D;
        double var4 = (double) ((arg0 & 65301) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 255) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var2 != var10) {
                if (var4 == var10) {
                    var12 = (var6 - var2) / (-var8 + var10) + 2.0D;
                } else if (var6 == var10) {
                    var12 = (var2 - var4) / (-var8 + var10) + 4.0D;
                }
            } else {
                var12 = (var4 - var6) / (var10 - var8);
            }
            if (var16 >= 0.5D) {
                var14 = (-var8 + var10) / (-var10 + 2.0D - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (arg1 != -9388) {
            method1506(125, 20);
        }
        if (var21 >= 0) {
            if (~var21 < -256) {
                var21 = 255;
            }
        } else {
            var21 = 0;
        }
        if (~var22 <= -1) {
            if (~var22 < -256) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (~var22 >= -244) {
            if (~var22 < -218) {
                var21 >>= 3;
            } else if (var22 > 192) {
                var21 >>= 2;
            } else if (~var22 < -180) {
                var21 >>= 1;
            }
        } else {
            var21 >>= 4;
        }
        return (var21 >> 5 << 7) + (((63 & var20 >> 2) << 10) - -(var22 >> 1));
    }
}
