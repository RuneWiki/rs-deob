import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class625 extends class182 {

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lica;")
    private class215 field8659;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lcl;")
    private class75 field8668;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field8669;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "Ljm;")
    public static class285 field8660;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLwv;)V", line = 3)
    public static final void method3470(boolean arg0, class423 arg1) {
        ++field8665;
        if (!arg0) {
            field8660 = null;
        }
        if (~arg1.field5598 == -6 && arg1.field5552 != -1) {
            class249.method1507(class146.field1963, (byte) 20, arg1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILvfa;B)V", line = 18)
    public final void method83(int arg0, class262 arg1, byte arg2) {
        ++field8666;
        if (arg2 < 87) {
            field8660 = null;
        }
        super.field2540.method2627(79, arg1);
        super.field2540.method2650((byte) -89, arg0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)V", line = 31)
    public final void method79(boolean arg0, int arg1) {
        ++field8667;
        if (arg1 > -21) {
            method3471(-100);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZZ)V", line = 45)
    public final void method84(boolean arg0, boolean arg1) {
        ++field8661;
        if (!arg0) {
            field8660 = null;
        }
        this.field8668.method412('\u0000', -125);
        if (this.field8659.field2829) {
            super.field2540.method2625(20296, 1);
            super.field2540.method2627(127, this.field8659.field2825);
            super.field2540.method2625(20296, 0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 65)
    public final void method82(int arg0) {
        this.field8668.method412('\u0001', -90);
        ++field8658;
        if (arg0 != 26813) {
            this.field8659 = null;
        }
        super.field2540.method2625(20296, 1);
        super.field2540.method2627(98, (class262) null);
        super.field2540.method2625(arg0 ^ 10229, 0);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V", line = 81)
    public final void method81(int arg0, int arg1, int arg2) {
        ++field8669;
        float var4 = (float) ((arg2 & 3) - -1) * -5.0E-4F;
        float var5 = (float) (((31 & arg2) >> 3) - -1) * 5.0E-4F;
        float var6 = ~(64 & arg2) != -1 ? 9.765625E-4F : 4.8828125E-4F;
        boolean var7 = ~(128 & arg2) != -1;
        super.field2540.method2625(20296, 1);
        if (!var7) {
            class3.field18[3] = 0.0F;
            class3.field18[1] = 0.0F;
            class3.field18[0] = 0.0F;
            class3.field18[2] = var6;
        } else {
            class3.field18[0] = var6;
            class3.field18[1] = 0.0F;
            class3.field18[2] = 0.0F;
            class3.field18[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class3.field18, 0);
        class3.field18[0] = 0.0F;
        class3.field18[1] = var6;
        class3.field18[arg0] = 0.0F;
        class3.field18[3] = (float) super.field2540.field6393 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class3.field18, 0);
        if (!this.field8659.field2829) {
            int var8 = (int) ((float) super.field2540.field6393 * var5 * 16.0F);
            super.field2540.method2627(120, this.field8659.field2826[var8 % 16]);
        } else {
            class3.field18[2] = 0.0F;
            class3.field18[1] = 0.0F;
            class3.field18[0] = 0.0F;
            class3.field18[3] = (float) super.field2540.field6393 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class3.field18, 0);
        }
        super.field2540.method2625(20296, 0);
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lag;Lica;)V", line = 134)
    public class625(class469 arg0, class215 arg1) {
        super(arg0);
        this.field8659 = arg1;
        this.field8668 = new class75(arg0, 2);
        this.field8668.method414((byte) 126, 0);
        super.field2540.method2625(20296, 1);
        if (this.field8659.field2829) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2540.method2625(20296, 0);
        this.field8668.method415(false);
        this.field8668.method414((byte) 126, 1);
        super.field2540.method2625(20296, 1);
        if (this.field8659.field2829) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2540.method2625(20296, 0);
        this.field8668.method415(false);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 168)
    public static final void method3471(int arg0) {
        class627.method3476((byte) -43);
        if (arg0 == 0) {
            ++field8662;
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z", line = 181)
    public final boolean method77(byte arg0) {
        ++field8663;
        if (arg0 != -96) {
            method3472(32);
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 192)
    public static void method3472(int arg0) {
        field8660 = null;
        if (arg0 != -16092) {
            method3471(-54);
        }
    }
}
