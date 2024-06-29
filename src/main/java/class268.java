import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class268 extends class197 {

    @OriginalMember(owner = "client!pfa", name = "D", descriptor = "I")
    private int field3675 = -1;

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
    private int field3679 = -1;

    @OriginalMember(owner = "client!pfa", name = "z", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!pfa", name = "E", descriptor = "I")
    public int field3676;

    @OriginalMember(owner = "client!pfa", name = "B", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!pfa", name = "y", descriptor = "I")
    public static int field3670 = 0;

    @OriginalMember(owner = "client!pfa", name = "A", descriptor = "Z")
    public static boolean field3672 = false;

    @OriginalMember(owner = "client!pfa", name = "F", descriptor = "I")
    public static int field3677 = 16777215;

    @OriginalMember(owner = "client!pfa", name = "x", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!pfa", name = "C", descriptor = "Lwo;")
    public static class690 field3674;

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "[Lhd;")
    public static class688[] field3680;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public final void method1621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field2388.method2932(true, this);
        ++field3678;
        OpenGL.glCopyTexSubImage3D(super.field2380, arg0, arg5, arg4, arg1, arg7, arg3, arg6, arg2);
        OpenGL.glFlush();
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)V", line = 18)
    public final void method1160(byte arg0) {
        OpenGL.glFramebufferTexture3DEXT(this.field3679, this.field3675, super.field2380, 0, 0, 0);
        int var2 = 124 % ((-50 - arg0) / 54);
        ++field3669;
        this.field3679 = -1;
        this.field3675 = -1;
    }

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)V", line = 33)
    public static void method1622(byte arg0) {
        field3674 = null;
        field3680 = null;
        if (arg0 > -31) {
            field3680 = null;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "(I)Z", line = 49)
    public static final boolean method1623(int arg0) {
        ++field3681;
        if (arg0 <= 55) {
            return true;
        } else {
            class513 var1 = class34.field679.field2232.field7522;
            if (var1 != null && class34.field679.field2232 != var1) {
                class377 var2 = (class377) var1;
                if (~var2.field5062 <= -2001) {
                    var2.field5062 -= 2000;
                }
                return var2.field5062 == 1007;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lkga;IIII[BI)V", line = 74)
    public class268(class506 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field3671 = arg4;
        this.field3676 = arg3;
        this.field3673 = arg2;
        super.field2388.method2932(true, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field2380, 0, super.field2394, this.field3673, this.field3676, this.field3671, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1211(true, (byte) 33);
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lkga;IIII)V", line = 90)
    public class268(class506 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field3671 = arg4;
        this.field3673 = arg2;
        this.field3676 = arg3;
        super.field2388.method2932(true, this);
        OpenGL.glTexImage3Dub(super.field2380, 0, super.field2394, this.field3673, this.field3676, this.field3671, 0, class215.method1313((byte) -104, super.field2394), 5121, (byte[]) null, 0);
        this.method1211(true, (byte) 33);
    }
}
