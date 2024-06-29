import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class697 extends class205 {

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    private int field9247;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Z")
    public static boolean field9244 = false;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field9248 = 0;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "J")
    public static long field9250 = 0L;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field9245;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field9246;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Llf;II[BI)V", line = 8)
    public class697(class250 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9247 = arg2;
        super.field2640.method1595((byte) 81, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field2649, 0, super.field2644, this.field9247, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1344(-15578, true);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 37)
    public static final void method3787(int arg0) {
        if (arg0 <= -79) {
            ++field9251;
            class385.field5605 = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZ)V", line = 48)
    public final void method3788(boolean arg0, boolean arg1) {
        super.field2640.method1595((byte) 86, this);
        if (arg0) {
            ++field9246;
            OpenGL.glTexParameteri(super.field2649, 10242, !arg1 ? 33071 : 10497);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 63)
    public final void method804(int arg0) {
        if (arg0 != 0) {
            method3787(-53);
        }
        ++field9249;
    }
}
