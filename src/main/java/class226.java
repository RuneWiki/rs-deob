import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class226 extends class249 {

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Ljga;")
    private class718 field3318;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "Lab;")
    private class671 field3320;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Z")
    public static boolean field3323 = true;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field3314 = -1;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Ljr;")
    private class112 field3324;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            return true;
        } else {
            ++field3326;
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lwh;Ljga;)V", line = 16)
    public class226(class148 arg0, class718 arg1) {
        super(arg0);
        this.field3318 = arg1;
        this.method1523((byte) -59);
        this.field3320 = new class671(super.field3613, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field3320.method3840((byte) 0, false);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZZ)V", line = 30)
    public final void method608(boolean arg0, boolean arg1) {
        ++field3319;
        if (!arg0) {
            this.field3318 = null;
        }
        super.field3613.method1043((byte) 80, 8448, 260);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V", line = 41)
    public final void method607(int arg0, int arg1, int arg2) {
        if (arg1 == -13582) {
            if ((1 & arg0) == 1) {
                if (!this.field3318.field10085) {
                    int var4 = super.field3613.field2167 % 4000 * 16 / 4000;
                    super.field3613.method1088(this.field3318.field10091[var4], -27749);
                } else {
                    super.field3613.method1088(this.field3318.field10092, -27749);
                    class632.field8849[2] = 0.0F;
                    class632.field8849[3] = (float) (super.field3613.field2167 % 4000) / 4000.0F;
                    class632.field8849[0] = 0.0F;
                    class632.field8849[1] = 0.0F;
                    OpenGL.glTexGenfv(8194, 9473, class632.field8849, 0);
                }
            } else if (!this.field3318.field10085) {
                super.field3613.method1088(this.field3318.field10091[0], -27749);
            } else {
                super.field3613.method1088(this.field3318.field10092, -27749);
                class632.field8849[0] = 0.0F;
                class632.field8849[3] = 0.0F;
                class632.field8849[2] = 0.0F;
                class632.field8849[1] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class632.field8849, 0);
            }
            ++field3316;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lme;ZI)V", line = 88)
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field3321;
        if (!arg1) {
            field3314 = 49;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZI)V", line = 102)
    public static final void method1522(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            class709.method4032(class289.field4128, arg2, -1);
        } else {
            class468 var3 = class93.method734(class29.field284, class350.field5114, arg0 ^ -24663);
            var3.field6839.method3702(arg2, (byte) -127);
            class120.method872((byte) 57, var3);
        }
        ++field3315;
        if (arg0 != -32697) {
            method1522(46, false, 102);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)V", line = 131)
    public final void method610(int arg0, boolean arg1) {
        if (super.field3613.field2212 > 0) {
            float var3 = -0.5F / (float) super.field3613.field2212;
            super.field3613.method1024(1, (byte) -11);
            class632.field8849[3] = super.field3613.field2237 * var3 + 0.25F;
            class632.field8849[2] = var3;
            class632.field8849[1] = 0.0F;
            class632.field8849[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class632.field8849, 0);
            OpenGL.glPopMatrix();
            super.field3613.method1082((byte) 117, 0.5F, (float) super.field3613.field2212);
            super.field3613.method1088(this.field3320, arg0 ^ -27750);
            super.field3613.method1024(0, (byte) -11);
        }
        ++field3322;
        this.field3324.method838('\u0000', true);
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, (float) arg0);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V", line = 162)
    private final void method1523(byte arg0) {
        ++field3325;
        this.field3324 = new class112(super.field3613, 2);
        this.field3324.method841(-113, 0);
        if (arg0 >= -51) {
            this.method605(110);
        }
        super.field3613.method1024(1, (byte) -11);
        super.field3613.method1043((byte) -43, 260, 7681);
        super.field3613.method1052(34168, 34176, 0, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field3613.method1024(0, (byte) -11);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field3318.field10085) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field3324.method840(125);
        this.field3324.method841(-96, 1);
        super.field3613.method1024(1, (byte) -11);
        super.field3613.method1043((byte) 68, 8448, 8448);
        super.field3613.method1052(5890, 34176, 0, 768);
        OpenGL.glDisable(3168);
        super.field3613.method1024(0, (byte) -11);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field3318.field10085) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field3324.method840(-42);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 206)
    public final void method611(int arg0) {
        this.field3324.method838('\u0001', true);
        ++field3327;
        if (super.field3613.field2212 > 0) {
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            super.field3613.method1082((byte) 49, 1.0F, 0.0F);
            super.field3613.method1024(0, (byte) -11);
        }
        super.field3613.method1043((byte) 106, 8448, 8448);
        if (arg0 == 2) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
    }
}
