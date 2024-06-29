import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class411 extends class315 implements class444 {

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    private int field5303;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    private int field5306;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "Lsga;")
    public static class547 field5305;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 3)
    public static void method2327(int arg0) {
        field5305 = null;
        if (arg0 != 0) {
            field5305 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lia;Lpw;III[B)V", line = 16)
    public class411(class27 arg0, class89 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class6.field48, arg2 * arg3 * arg4, false);
        this.field5302 = arg3;
        this.field5303 = arg2;
        this.field5306 = arg4;
        super.field4091.method3091(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field4082, 0, this.method1838((byte) 83), this.field5303, this.field5302, this.field5306, 0, class386.method2201((byte) 123, super.field4100), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method2328(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2328(1, 4, -125);
        }
        ++field5304;
        return class32.method258(arg1, 32768, arg2) | (arg2 & 2048) != 0 || class314.method1832(arg1, arg2, true);
    }
}
