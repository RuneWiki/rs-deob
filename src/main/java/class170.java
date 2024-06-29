import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class170 extends class166 {

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "Ljava/lang/String;")
    public String field2651;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "Z")
    public static boolean field2647 = false;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Z")
    public static boolean field2648 = true;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2652 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "S")
    public static short field2654 = 32767;

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "[[I")
    public static int[][] field2655 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "Lul;")
    public static class192 field2646;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "Lhc;")
    public static class235 field2649;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method1143(String arg0, String arg1, String arg2, int arg3, int arg4) {
        field2643++;
        class240.method1646(arg1, arg2, arg4, arg0, arg3, (byte) -84);
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)V")
    public static void method1144(byte arg0) {
        field2655 = null;
        int var1 = -101 / ((arg0 - 57) / 43);
        field2652 = null;
        field2646 = null;
        field2649 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)J")
    public static final long method1145(int arg0, int arg1, int arg2) {
        class6 var3 = class269.field4298[arg0][arg1][arg2];
        return var3 == null || var3.field123 == null ? 0L : var3.field123.field3217;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class170() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class170(String arg0, int arg1) {
        this.field2651 = arg0;
    }
}
