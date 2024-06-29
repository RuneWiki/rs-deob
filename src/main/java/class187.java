import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class187 extends class450 {

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ffa", name = "i", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ffa", name = "j", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ffa", name = "k", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ffa", name = "l", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ffa", name = "h", descriptor = "Lwu;")
    public static class376 field2825;

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(ILup;)V", line = 5)
    public class187(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I[BLlaa;B)Low;", line = 9)
    public static final class351 method1287(int arg0, byte[] arg1, class122 arg2, byte arg3) {
        if (arg3 > -63) {
            return null;
        } else {
            ++field2828;
            if (arg1 == null) {
                return null;
            } else {
                int var4 = OpenGL.glGenProgramARB();
                OpenGL.glBindProgramARB(arg0, var4);
                OpenGL.glProgramRawARB(arg0, 34933, arg1);
                OpenGL.glGetIntegerv(34379, class171.field2620, 0);
                if (~class171.field2620[0] != 0) {
                    OpenGL.glBindProgramARB(arg0, 0);
                    return null;
                } else {
                    OpenGL.glBindProgramARB(arg0, 0);
                    return new class351(arg2, arg0, var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V", line = 43)
    public final void method67(boolean arg0, int arg1) {
        if (!arg0) {
            field2825 = null;
        }
        ++field2824;
        super.field6170 = arg1;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)I", line = 55)
    public final int method68(boolean arg0) {
        ++field2827;
        return arg0 ? 69 : 2;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V", line = 66)
    public final void method73(byte arg0) {
        if (super.field6171.field3870.method2333(2) && ~super.field6170 == -3) {
            super.field6170 = 1;
        }
        if (arg0 == 98) {
            ++field2823;
            if (~super.field6170 > -1 || ~super.field6170 < -3) {
                super.field6170 = this.method68(false);
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V", line = 82)
    public static void method1288(int arg0) {
        field2825 = null;
        if (arg0 != 0) {
            field2825 = null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "(Z)I", line = 93)
    public final int method1289(boolean arg0) {
        if (!arg0) {
            return -124;
        } else {
            ++field2829;
            return super.field6170;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(II)I", line = 105)
    public final int method75(int arg0, int arg1) {
        if (arg0 != 0) {
            return -11;
        } else {
            ++field2826;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Lup;)V", line = 116)
    public class187(class278 arg0) {
        super(arg0);
    }
}
