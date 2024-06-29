import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public abstract class class738 {

    @OriginalMember(owner = "client!pu", name = "h", descriptor = "I")
    public int field10312;

    @OriginalMember(owner = "client!pu", name = "f", descriptor = "I")
    public int field10310;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "I")
    public int field10305;

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "I")
    public static int field10306 = 0;

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "[I")
    public static int[] field10308 = new int[2];

    @OriginalMember(owner = "client!pu", name = "c", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!pu", name = "g", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)[Lhe;")
    public static final class573[] method4121(int arg0) {
        if (arg0 == 0) {
            field10311++;
            return new class573[] { class536.field7793, class507.field7370, class382.field5535, class711.field10014, class246.field3590, class506.field7352 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BII)V")
    public abstract void method83(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZI)V")
    public abstract void method85(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lew;Z)I")
    public static final int method4122(class683 arg0, boolean arg1) {
        if (!arg1) {
            field10308 = null;
        }
        field10309++;
        if (class39.field669 == arg0) {
            return 9216;
        } else if (class396.field5674 == arg0) {
            return 34065;
        } else if (class280.field3929 == arg0) {
            return 34066;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)V")
    public static void method4123(int arg0) {
        if (arg0 >= 75) {
            field10308 = null;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(III)V")
    public abstract void method84(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "(III)V")
    public class738(int arg0, int arg1, int arg2) {
        this.field10312 = arg0;
        this.field10310 = arg2;
        this.field10305 = arg1;
    }
}
