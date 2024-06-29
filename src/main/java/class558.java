import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class558 extends class546 {

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lbea;")
    private class205 field8057;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Ltj;")
    private class181 field8060;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lsm;")
    private class259 field8058;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lwr;")
    public static class423 field8063 = new class423();

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lrl;")
    public static class672 field8065 = new class672(77, 4);

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Loo;")
    public static class580 field8066 = new class580(7500);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public static int field8064;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field8067;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            field8063 = null;
        }
        ++field8059;
        return this.field8058 != null;
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V", line = 16)
    public final void method783(int arg0) {
        super.field7937.method2287((byte) -108, 0, class622.field8779);
        if (arg0 != 255) {
            this.field8057 = null;
        }
        ++field8061;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lbea;Lri;Ltj;)V", line = 32)
    public class558(class205 arg0, class97 arg1, class181 arg2) {
        super(arg0);
        this.field8057 = arg0;
        this.field8060 = arg2;
        if (arg1 != null && this.field8060.method1480((byte) 113) && this.field8057.field3445) {
            this.field8058 = class44.method533(this.field8057, arg1.method923("gl", -25124, "transparent_water"), 23148, 34336);
        } else {
            this.field8058 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 48)
    public static void method3329(byte arg0) {
        field8066 = null;
        if (arg0 != 83) {
            method3329((byte) 48);
        }
        field8063 = null;
        field8065 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)V", line = 60)
    public final void method785(int arg0, int arg1, int arg2) {
        if (arg0 != 8) {
            this.field8060 = null;
        }
        if (this.field8060.field3036) {
            float var4 = (float) (super.field7937.field5327 % 4000) / 4000.0F;
            super.field7937.method2271(this.field8060.field3042, 5180);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field7937.field5327 % 4000 * 16 / 4000;
            super.field7937.method2271(this.field8060.field3047[var5], 5180);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        ++field8056;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V", line = 88)
    public final void method793(int arg0, boolean arg1) {
        if (arg0 < -39) {
            ++field8055;
            super.field7937.method2275(class471.field6979, 98, class406.field6268);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IZLwq;)V", line = 101)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        ++field8064;
        if (arg1) {
            field8063 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V", line = 111)
    public final void method788(boolean arg0, int arg1) {
        ++field8062;
        OpenGL.glBindProgramARB(34336, this.field8058.field4144);
        OpenGL.glEnable(34336);
        super.field7937.method2287((byte) -122, arg1, class692.field9702);
    }
}
