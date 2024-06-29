import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class72 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    private int field874;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public static int field872 = 0;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "Lsd;")
    public static class74 field873 = new class74(44, -1);

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method367(boolean arg0) {
        class274.field3912.method1388(((float) class283.field4124 * 0.1F + 0.7F) * class458.field6449);
        field876++;
        class274.field3912.method1449(class234.field3249, class324.field4682, class71.field869, (float) class451.field6386, (float) class231.field3207, (float) class244.field3334);
        if (!arg0) {
            method367(false);
        }
        class274.field3912.method1424(class27.field361);
    }

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 20)
    public final String toString() {
        field875++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)V", line = 32)
    public static void method368(byte arg0) {
        field873 = null;
        if (arg0 >= -53) {
            field873 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(II)V", line = 42)
    public class72(int arg0, int arg1) {
        this.field874 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(B)I", line = 61)
    public final int method369(byte arg0) {
        if (arg0 < 118) {
            this.field874 = 33;
        }
        field877++;
        return this.field874;
    }
}
