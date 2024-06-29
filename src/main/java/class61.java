import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class61 extends RuntimeException {

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1181;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "Ljava/lang/String;")
    public String field1175;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    public static int[] field1176 = new int[2000];

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[Lgd;")
    public static class169[] field1172 = new class169[29];

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1182 = "Loaded input handler";

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "Lfb;")
    public static class237 field1179;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Lkl;")
    public static class68 field1174;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[Loj;")
    public static class283[] field1177;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "[Z")
    public static boolean[] field1178;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[[Lml;")
    public static class16[][] field1180;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 16)
    public static void method474(int arg0) {
        field1174 = null;
        field1178 = null;
        field1177 = null;
        if (arg0 != 2000) {
            return;
        }
        field1182 = null;
        field1172 = null;
        field1180 = (class16[][]) null;
        field1179 = null;
        field1176 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 37)
    public static int method475(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 44)
    public static final void method476(int arg0) {
        field1173++;
        class24.field478.method1884(-22054);
        if (arg0 < 94) {
            field1177 = (class283[]) null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 64)
    public class61(Throwable arg0, String arg1) {
        this.field1181 = arg0;
        this.field1175 = arg1;
    }
}
