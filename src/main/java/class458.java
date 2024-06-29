import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class458 {

    @OriginalMember(owner = "client!eea", name = "e", descriptor = "Lbk;")
    public class444 field6514 = new class444();

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "Lgr;")
    public static class530 field6510 = new class530(20, 11);

    @OriginalMember(owner = "client!eea", name = "b", descriptor = "Lgr;")
    public static class530 field6511 = new class530(46, 15);

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "Z")
    public static boolean field6512 = false;

    @OriginalMember(owner = "client!eea", name = "d", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)V")
    public static void method2787(int arg0) {
        field6511 = null;
        if (arg0 != -911) {
            field6512 = false;
        }
        field6510 = null;
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lhe;I)Z")
    public static final boolean method2788(class573 arg0, int arg1) {
        if (arg1 >= -61) {
            field6510 = null;
        }
        field6513++;
        return class507.field7370 == arg0 || class382.field5535 == arg0 || class711.field10014 == arg0 || class506.field7352 == arg0;
    }
}
