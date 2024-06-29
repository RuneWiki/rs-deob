import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class685 extends class249 {

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Ljga;")
    private class718 field9478;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Ljr;")
    private class112 field9479;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field9480;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field9481;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V", line = 8)
    public static final void method3906(int arg0) {
        ++field9477;
        class252.method1662();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class326.field4655[var1].method1590((byte) 122);
        }
        class85.method696(-1);
        class132.method934(false);
        if (arg0 < 112) {
            method3906(35);
        }
        class434.method2688(-110);
        System.gc();
        class736.field10316.method444();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V", line = 31)
    public final void method610(int arg0, boolean arg1) {
        ++field9481;
        this.field9479.method838('\u0000', true);
        if (arg0 != 1) {
            this.method611(-3);
        }
        if (this.field9478.field10085) {
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088(this.field9478.field10087, -27749);
            super.field3613.method1024(0, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z", line = 50)
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            return true;
        } else {
            ++field9480;
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZZ)V", line = 62)
    public final void method608(boolean arg0, boolean arg1) {
        if (arg0) {
            ++field9483;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lwh;Ljga;)V", line = 72)
    public class685(class148 arg0, class718 arg1) {
        super(arg0);
        this.field9478 = arg1;
        this.field9479 = new class112(arg0, 2);
        this.field9479.method841(58, 0);
        super.field3613.method1024(1, (byte) -11);
        if (this.field9478.field10085) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field3613.method1024(0, (byte) -11);
        this.field9479.method840(108);
        this.field9479.method841(-97, 1);
        super.field3613.method1024(1, (byte) -11);
        if (this.field9478.field10085) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field3613.method1024(0, (byte) -11);
        this.field9479.method840(127);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lme;ZI)V", line = 106)
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        ++field9482;
        super.field3613.method1088(arg0, -27749);
        super.field3613.method1066(arg2, 260);
        if (!arg1) {
            this.method603((class195) null, true, 35);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 120)
    public final void method611(int arg0) {
        if (arg0 != 2) {
            this.field9479 = null;
        }
        ++field9476;
        this.field9479.method838('\u0001', true);
        super.field3613.method1024(1, (byte) -11);
        super.field3613.method1088((class195) null, arg0 ^ -27751);
        super.field3613.method1024(0, (byte) -11);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V", line = 134)
    public final void method607(int arg0, int arg1, int arg2) {
        ++field9475;
        float var4 = (float) ((3 & arg0) - -1) * -5.0E-4F;
        float var5 = (float) ((3 & arg0 >> 3) + 1) * 5.0E-4F;
        float var6 = ~(arg0 & 64) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg0) != -1;
        super.field3613.method1024(1, (byte) -11);
        if (var7) {
            class676.field9412[2] = 0.0F;
            class676.field9412[1] = 0.0F;
            class676.field9412[0] = var6;
            class676.field9412[3] = 0.0F;
        } else {
            class676.field9412[3] = 0.0F;
            class676.field9412[0] = 0.0F;
            class676.field9412[2] = var6;
            class676.field9412[1] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class676.field9412, 0);
        class676.field9412[0] = 0.0F;
        class676.field9412[1] = var6;
        class676.field9412[3] = (float) super.field3613.field2167 * var4 % 1.0F;
        class676.field9412[2] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class676.field9412, 0);
        if (this.field9478.field10085) {
            class676.field9412[2] = 0.0F;
            class676.field9412[3] = (float) super.field3613.field2167 * var5 % 1.0F;
            class676.field9412[0] = 0.0F;
            class676.field9412[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class676.field9412, 0);
        } else {
            int var8 = (int) ((float) super.field3613.field2167 * var5 * 16.0F);
            super.field3613.method1088(this.field9478.field10090[var8 % 16], -27749);
        }
        super.field3613.method1024(0, (byte) -11);
        if (arg1 != -13582) {
            method3906(-23);
        }
    }
}
