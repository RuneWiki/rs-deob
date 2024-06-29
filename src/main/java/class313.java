import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class313 {

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public int field4933;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "Lnk;")
    public static class326 field4932 = new class326(20, 8);

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "Lnk;")
    public static class326 field4935 = new class326(53, 2);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Ljd;")
    public static class421 field4936;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)Z")
    public static final boolean method1984(int arg0, int arg1) {
        field4930++;
        if (arg1 != 6) {
            method1987((byte) 73, 115);
        }
        return arg0 == 6 || arg0 == 8;
    }

    @OriginalMember(owner = "client!vv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4931++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static void method1985(int arg0) {
        field4935 = null;
        field4932 = null;
        field4936 = null;
        if (arg0 != 8) {
            field4932 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)I")
    public final int method1986(int arg0) {
        field4929++;
        if (arg0 != 8) {
            this.toString();
        }
        return this.field4928;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BI)Lhd;")
    public static final class239 method1987(byte arg0, int arg1) {
        field4927++;
        if (arg0 != 116) {
            field4936 = null;
        }
        return class465.field6891 && class228.field3992 <= arg1 && arg1 <= class491.field7176 ? class275.field4527[arg1 - class228.field3992] : null;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(II)V")
    public class313(int arg0, int arg1) {
        this.field4933 = arg1;
        this.field4928 = arg0;
    }
}
