import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class123 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "Lvp;")
    public static class123 field1913 = new class123(80, -1);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field1915;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)I")
    public final int method928(int arg0) {
        if (arg0 != -1) {
            field1915 = null;
        }
        field1916++;
        return this.field1912;
    }

    @OriginalMember(owner = "client!vp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1914++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(II)V")
    public class123(int arg0, int arg1) {
        this.field1912 = arg0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
    public static void method929(byte arg0) {
        field1913 = null;
        int var1 = 102 % ((-arg0 - 38) / 33);
        field1915 = null;
    }
}
