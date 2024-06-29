import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class405 extends class188 {

    @OriginalMember(owner = "client!es", name = "j", descriptor = "Lpa;")
    private class391 field5868;

    @OriginalMember(owner = "client!es", name = "n", descriptor = "Llja;")
    private class745 field5872;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "Lru;")
    private class205 field5880;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field5874 = -50;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field5881 = 1;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!es", name = "k", descriptor = "I")
    public static int field5869;

    @OriginalMember(owner = "client!es", name = "l", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!es", name = "m", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!es", name = "o", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!es", name = "s", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field5879;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        if (arg0 <= 53) {
            return false;
        } else {
            ++field5873;
            return this.field5880 != null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        ++field5871;
        OpenGL.glBindProgramARB(34336, this.field5880.field2683);
        OpenGL.glEnable(34336);
        if (arg1 == 2) {
            super.field2510.method3514((byte) 107, class386.field5627, 0);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lpa;Laj;Llja;)V")
    public class405(class391 arg0, class333 arg1, class745 arg2) {
        super(arg0);
        this.field5868 = arg0;
        this.field5872 = arg2;
        if (arg1 != null && this.field5872.method4123(29925) && this.field5868.field5791) {
            this.field5880 = class685.method3807((byte) -63, arg1.method2111("gl", "transparent_water", 3), 34336, this.field5868);
        } else {
            this.field5880 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field5872 = null;
        }
        if (!this.field5872.field10292) {
            int var4 = super.field2510.field8699 % 4000 * 16 / 4000;
            super.field2510.method3520(true, this.field5872.field10282[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field2510.field8699 % 4000) / 4000.0F;
            super.field2510.method3520(true, this.field5872.field10287);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        ++field5869;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;BLdia;)Ltd;")
    public static final class481 method2520(int arg0, String arg1, byte arg2, class246 arg3) {
        ++field5876;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class641.field8899, 0);
        if (class641.field8899[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            if (arg2 >= -15) {
                field5875 = -82;
            }
            return new class481(arg3, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!es", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        ++field5879;
        if (arg0 > 54) {
            super.field2510.method3514((byte) 119, class122.field1782, 0);
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        ++field5878;
        int var4 = -85 % ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        if (arg0 != 22789) {
            this.field5880 = null;
        }
        ++field5870;
        super.field2510.method3513(class187.field2499, class521.field7150, -93);
    }
}
