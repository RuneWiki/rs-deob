import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class207 extends class569 implements class456 {

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    private int field2909;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "Z")
    public static boolean field2913 = false;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Ljba;")
    public static class363 field2908;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Lpu;")
    public static class522 field2914;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(II)V", line = 3)
    public static final void method1371(int arg0, int arg1) {
        ++field2912;
        class191 var2 = class6.method38(arg1, -74, arg0);
        var2.method1284((byte) -45);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lrk;II)V", line = 18)
    public static final void method1372(class30 arg0, int arg1, int arg2) {
        ++field2911;
        if (class8.field83 < 50) {
            if (arg0 != null && arg0.field471 != null && arg0.field471.length > arg2 && arg0.field471[arg2] != null) {
                int var3 = arg0.field471[arg2][0];
                int var4 = var3 >> 8;
                if (~arg0.field471[arg2].length < -2) {
                    int var5 = (int) (Math.random() * (double) arg0.field471[arg2].length);
                    if (var5 > 0) {
                        var4 = arg0.field471[arg2][var5];
                    }
                }
                if (arg1 != 5121) {
                    method1371(4, -83);
                }
                int var6 = (var3 & 238) >> 5;
                if (arg0.field454) {
                    class89.method767(-35, 0, false, 255, var6, var4);
                } else {
                    class50.method569(var4, var6, 0, (byte) 116, 255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lhp;Llca;III[B)V", line = 58)
    public class207(class296 arg0, class597 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class218.field3050, arg2 * arg3 * arg4, false);
        this.field2909 = arg2;
        this.field2910 = arg4;
        this.field2915 = arg3;
        super.field8007.method2337(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8011, 0, this.method3235((byte) 61), this.field2909, this.field2915, this.field2910, 0, class351.method2159(super.field8018, (byte) 63), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 72)
    public static void method1373(byte arg0) {
        field2914 = null;
        field2908 = null;
        if (arg0 <= 34) {
            method1373((byte) -12);
        }
    }
}
