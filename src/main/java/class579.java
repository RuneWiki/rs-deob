import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class579 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lst;")
    public static class335 field7936 = new class335(44, 0);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field7937;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method3368(int arg0) {
        if (arg0 <= 14) {
            field7936 = null;
        }
        field7936 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lef;I)I")
    public static final int method3369(class263 arg0, int arg1) {
        field7937++;
        if (class87.field1239 == arg0) {
            return 7681;
        } else if (class179.field2467 == arg0) {
            return 8448;
        } else if (class370.field5228 == arg0) {
            return 34165;
        } else if (class161.field2237 == arg0) {
            return 260;
        } else if (class339.field4803 == arg0) {
            return 34023;
        } else if (arg1 == 0) {
            throw new IllegalArgumentException();
        } else {
            return -24;
        }
    }
}
