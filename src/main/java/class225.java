import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class225 implements class362 {

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Ls;")
    public static class169 field2976 = new class169(6, 15);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!bc", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2971++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
    public static final void method1266(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 0) {
            field2976 = null;
        }
        class425.field5751 = arg0;
        class205.field2784 = arg1;
        field2973++;
        class221.field2942 = arg4;
        class136.field1985 = arg2;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method1267(byte arg0) {
        if (arg0 < 75) {
            field2976 = null;
        }
        field2976 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Lac;")
    public static final class348 method1268(int arg0) {
        field2974++;
        class374.field5165 = arg0;
        return class475.method2777(-117);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class225(String arg0, int arg1) {
        this.field2975 = arg1;
    }
}
