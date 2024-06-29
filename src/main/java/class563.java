import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class563 extends class617 {

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "Lqr;")
    public class667 field8042;

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "Luca;")
    public class695 field8049;

    @OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
    public static int field8046 = 0;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "Ljava/lang/String;")
    public static String field8045 = null;

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public int field8037;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public int field8039;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public int field8040;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
    public int field8041;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!fba", name = "E", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "Lf;")
    public static class534 field8047;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V", line = 6)
    public static void method3192(int arg0) {
        field8047 = null;
        if (arg0 >= -61) {
            method3192(-97);
        }
        field8045 = null;
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V", line = 19)
    public final void method3193(int arg0) {
        this.field8039 = this.field8042.field9308;
        this.field8043 = this.field8042.field9307;
        this.field8040 = this.field8042.field9316;
        field8048++;
        if (this.field8042.field9313 != null) {
            this.field8042.field9313.method29(this.field8049.field9738, this.field8049.field9751, this.field8049.field9750, class34.field340);
        }
        this.field8041 = class34.field340[0];
        this.field8037 = class34.field340[2];
        if (arg0 != 34933) {
            this.field8049 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BILvj;Ljava/lang/String;)Lvk;", line = 50)
    public static final class454 method3194(byte arg0, int arg1, class422 arg2, String arg3) {
        int var4 = 24 / ((69 - arg0) / 47);
        field8044++;
        int var5 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var5);
        OpenGL.glProgramStringARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class286.field3570, 0);
        if (class286.field3570[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class454(arg2, arg1, var5);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(II)I", line = 83)
    public static final int method3195(int arg0, int arg1) {
        if (arg0 == -1) {
            field8038++;
            return arg1 & 0xFF;
        } else {
            return -112;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lqr;Lwca;)V", line = 94)
    public class563(class667 arg0, class339 arg1) {
        this.field8042 = arg0;
        this.field8049 = this.field8042.method3698(true);
        this.method3193(34933);
    }
}
