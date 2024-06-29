import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class354 extends class249 {

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Z")
    private boolean field5150 = false;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Ljr;")
    private class112 field5148;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Z")
    public static boolean field5151 = false;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5145 = new BigInteger("8e02e53961ccb8352c8c0282ee84d8403fdefe2fce6569a02fa00ed2090534ec883f865dcabb6583c24c3c5302a052a0ca1a5f9091983ed7ffea720301aee0f3", 16);

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lvd;")
    public static class39 field5152;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 5)
    public final void method611(int arg0) {
        if (this.field5150) {
            this.field5148.method838('\u0001', true);
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088((class195) null, -27749);
            super.field3613.method1024(0, (byte) -11);
        } else {
            super.field3613.method1086(5890, 0, 770, 28);
        }
        ++field5147;
        super.field3613.method1043((byte) 108, 8448, 8448);
        this.field5150 = false;
        if (arg0 != 2) {
            this.method611(89);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 29)
    public static void method2217(int arg0) {
        field5152 = null;
        int var1 = -5 / ((-15 - arg0) / 61);
        field5145 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lme;ZI)V", line = 41)
    public final void method603(class195 arg0, boolean arg1, int arg2) {
        super.field3613.method1088(arg0, -27749);
        if (arg1) {
            ++field5149;
            super.field3613.method1066(arg2, 260);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V", line = 55)
    public final void method607(int arg0, int arg1, int arg2) {
        if (arg1 != -13582) {
            this.method611(103);
        }
        ++field5142;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lwh;)V", line = 65)
    public class354(class148 arg0) {
        super(arg0);
        if (arg0.field2213) {
            this.field5148 = new class112(arg0, 2);
            this.field5148.method841(-104, 0);
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1043((byte) -125, 7681, 34165);
            super.field3613.method1052(34168, 34176, 2, 770);
            super.field3613.method1086(34167, 0, 770, 72);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field3613.method1024(0, (byte) -11);
            this.field5148.method840(4);
            this.field5148.method841(126, 1);
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1043((byte) 89, 8448, 8448);
            super.field3613.method1052(34166, 34176, 2, 770);
            super.field3613.method1086(5890, 0, 770, 125);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field3613.method1024(0, (byte) -11);
            this.field5148.method840(118);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZZ)V", line = 105)
    public final void method608(boolean arg0, boolean arg1) {
        ++field5143;
        super.field3613.method1043((byte) 120, 7681, 8448);
        if (!arg0) {
            this.method611(-52);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z", line = 116)
    public final boolean method605(int arg0) {
        if (arg0 != 2) {
            this.method608(true, false);
        }
        ++field5144;
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V", line = 132)
    public final void method610(int arg0, boolean arg1) {
        if (arg0 != 1) {
            field5145 = null;
        }
        ++field5146;
        class24 var3 = super.field3613.method1071(-3);
        if (this.field5148 != null && var3 != null && arg1) {
            this.field5148.method838('\u0000', true);
            super.field3613.method1024(1, (byte) -11);
            super.field3613.method1088(var3, arg0 ^ -27750);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field3613.field2202.method3522((byte) 8), 0);
            OpenGL.glMatrixMode(5888);
            super.field3613.method1024(0, (byte) -11);
            this.field5150 = true;
        } else {
            super.field3613.method1086(34168, 0, 770, 104);
        }
    }
}
