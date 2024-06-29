import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class471 {

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public int field6619;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    private int field6618;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "Ldv;")
    public static class566 field6620 = new class566(65, 16);

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "Ldv;")
    public static class566 field6622 = new class566(8, 5);

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6623 = new String[100];

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)I")
    public final int method2742(int arg0) {
        if (arg0 > -64) {
            field6620 = null;
        }
        field6617++;
        return this.field6618;
    }

    @OriginalMember(owner = "client!cba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6621++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V")
    public static void method2743(int arg0) {
        field6622 = null;
        field6623 = null;
        int var1 = 116 / ((arg0 + 29) / 48);
        field6620 = null;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(II)V")
    public class471(int arg0, int arg1) {
        this.field6619 = arg1;
        this.field6618 = arg0;
    }
}
