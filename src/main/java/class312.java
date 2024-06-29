import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class312 extends class381 {

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    private int field4715;

    @OriginalMember(owner = "client!qv", name = "v", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!qv", name = "w", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "Lph;")
    public static class459 field4716;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V", line = 5)
    public final void method458(int arg0) {
        ++field4714;
        if (arg0 != 1) {
            method1984(-88);
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(I)V", line = 17)
    public static final void method1984(int arg0) {
        ++field4713;
        class88.field1792 = null;
        class372.field5446 = arg0;
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V", line = 29)
    public static void method1985(byte arg0) {
        field4716 = null;
        if (arg0 >= -4) {
            method1984(80);
        }
    }

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lda;II[BI)V", line = 40)
    public class312(class44 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4715 = arg2;
        super.field5575.method381((byte) 28, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5578, 0, super.field5568, this.field4715, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2346(3, true);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZB)V", line = 53)
    public final void method1986(boolean arg0, byte arg1) {
        if (arg1 == -107) {
            ++field4711;
            super.field5575.method381((byte) 28, this);
            OpenGL.glTexParameteri(super.field5578, 10242, arg0 ? 10497 : 33071);
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lph;Lza;ILph;)V", line = 66)
    public static final void method1987(class459 arg0, class288 arg1, int arg2, class459 arg3) {
        ++field4712;
        class264.field4032 = class299.method1929(0, class335.field5064, 115, arg0);
        class276.field4179 = arg1.method357(class264.field4032, class340.method2146(arg3, class335.field5064, 0), true);
        class398.field6038 = class299.method1929(0, class387.field5664, 122, arg0);
        class470.field6980 = arg1.method357(class398.field6038, class340.method2146(arg3, class387.field5664, 0), true);
        class272.field4126 = class299.method1929(0, class395.field6021, arg2 ^ 97, arg0);
        class356.field5232 = arg1.method357(class272.field4126, class340.method2146(arg3, class395.field6021, arg2), true);
    }
}
