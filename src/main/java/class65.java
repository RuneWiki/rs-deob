import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class65 {

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "[I")
    public static int[] field660 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "Z")
    public static boolean field659 = false;

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "[I")
    public static int[] field664 = new int[13];

    @OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!hia", name = "d", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "Loh;")
    public static class404 field663;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lnv;Ljava/lang/String;II)Lpi;")
    public static final class496 method487(class417 arg0, String arg1, int arg2, int arg3) {
        field661++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg1);
        OpenGL.glGetIntegerv(34379, class750.field10497, 0);
        if (arg3 != 17319) {
            field663 = null;
        }
        if (class750.field10497[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class496(arg0, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
    public static void method488(byte arg0) {
        if (arg0 == 10) {
            field664 = null;
            field663 = null;
            field660 = null;
        }
    }
}
