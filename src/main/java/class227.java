import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class227 extends class337 {

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    private int field3381;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "Z")
    public static volatile boolean field3378 = true;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "Lvca;")
    public static class675 field3379 = new class675(16);

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lkfa;II[BI)V")
    public class227(class382 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3381 = arg2;
        super.field4696.method2295((byte) -125, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field4684, 0, super.field4685, this.field3381, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2001(540800, true);
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        ++field3380;
        if (arg0 <= 49) {
            field3378 = true;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)I")
    public static final int method1492(int arg0) {
        ++field3382;
        return arg0 != 1 ? -15 : class99.field1482;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZ)V")
    public final void method1493(byte arg0, boolean arg1) {
        super.field4696.method2295((byte) -106, this);
        ++field3377;
        OpenGL.glTexParameteri(super.field4684, 10242, arg1 ? 10497 : 33071);
        if (arg0 >= -49) {
            field3379 = null;
        }
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)V")
    public static final void method1494(byte arg0) {
        int var1 = 118 / ((45 - arg0) / 40);
        ++field3376;
        class433.field6238.method950((byte) 124);
    }

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(B)V")
    public static void method1495(byte arg0) {
        if (arg0 <= 32) {
            field3379 = null;
        }
        field3379 = null;
    }
}
