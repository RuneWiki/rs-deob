import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class635 {

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public int field8928 = -1;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "Loo;")
    public static class629 field8926 = new class629(7, 7);

    @OriginalMember(owner = "client!am", name = "k", descriptor = "F")
    public static float field8931;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field8921;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field8922;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public int field8923;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field8924;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field8925;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field8927;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field8929;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public int field8930;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public int field8932;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 3)
    public static void method3656(int arg0) {
        field8926 = null;
        if (arg0 != -1) {
            method3657(null, 81, null);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V", line = 14)
    public static final void method3657(String arg0, int arg1, File arg2) {
        class445.field6614.put(arg0, arg2);
        field8929++;
        if (arg1 > -76) {
            field8931 = -0.39796346F;
        }
    }
}
