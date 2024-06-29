import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class248 extends class501 {

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    private int field3291;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "Z")
    public static boolean field3292 = false;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILfh;)Z", line = 4)
    public static final boolean method1501(int arg0, class460 arg1) {
        if (arg0 != -1) {
            field3292 = true;
        }
        ++field3295;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field6333) {
            return false;
        } else if (!arg1.method2621(0, class6.field158)) {
            return false;
        } else if (class169.field2465.method182((long) arg1.field6339, (byte) 103) != null) {
            return false;
        } else {
            return class301.field3985.method182((long) arg1.field6329, (byte) 88) == null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZZ)V", line = 34)
    public final void method1502(boolean arg0, boolean arg1) {
        super.field6916.method2980(this, 126);
        ++field3294;
        if (!arg1) {
            this.method1503(83);
        }
        OpenGL.glTexParameteri(super.field6920, 10242, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 52)
    public final void method1503(int arg0) {
        if (arg0 > 126) {
            ++field3296;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lbo;II[BI)V", line = 62)
    public class248(class511 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field3291 = arg2;
        super.field6916.method2980(this, 124);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6920, 0, super.field6913, this.field3291, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2866(10241, true);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBLit;)V", line = 81)
    public static final void method1504(int arg0, byte arg1, class455 arg2) {
        ++field3297;
        int var3 = -1;
        int var4 = 0;
        if (arg2.field6179 <= class31.field516) {
            if (~class31.field516 >= ~arg2.field6171) {
                class277.method1651(arg2, true);
            } else {
                class45.method316(arg2, false, 8);
                var4 = class270.field3542;
                var3 = class51.field803;
            }
        } else {
            class45.method317(arg2, 128);
        }
        if (arg1 > 101) {
            if (arg2.field584 < 128 || arg2.field574 < 128 || arg2.field584 >= (class12.field251 + -1) * 128 || ~(class289.field3782 * 128 - 128) >= ~arg2.field574) {
                arg2.field6238 = -1;
                var4 = 0;
                var3 = -1;
                arg2.field6179 = 0;
                arg2.field6185 = -1;
                arg2.field6163 = -1;
                arg2.field6171 = 0;
                arg2.field584 = arg2.field6261[0] * 128 - -(64 * arg2.method2590(0));
                arg2.field574 = arg2.field6266[0] * 128 + arg2.method2590(0) * 64;
                arg2.method2596(9216);
            }
            if (class385.field5232 == arg2 && (arg2.field584 < 1536 || ~arg2.field574 > -1537 || ~(class12.field251 * 128 - 1536) >= ~arg2.field584 || ~((class289.field3782 + -12) * 128) >= ~arg2.field574)) {
                var4 = 0;
                arg2.field6238 = -1;
                arg2.field6179 = 0;
                arg2.field6163 = -1;
                arg2.field6171 = 0;
                var3 = -1;
                arg2.field6185 = -1;
                arg2.field584 = arg2.field6261[0] * 128 + 64 * arg2.method2590(0);
                arg2.field574 = arg2.field6266[0] * 128 + 64 * arg2.method2590(0);
                arg2.method2596(9216);
            }
            int var5 = class429.method2477(-101, arg2);
            class165.method1114(var3, var5, var4, 23245, arg2);
            class382.method2266(-1, arg2);
        }
    }
}
