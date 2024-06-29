import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class390 {

    @OriginalMember(owner = "client!aw", name = "c", descriptor = "I")
    public int field5932;

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "Lna;")
    private class211 field5933;

    @OriginalMember(owner = "client!aw", name = "e", descriptor = "[I")
    public static int[] field5934 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "I")
    public static int field5931 = -1;

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    public static int field5935 = -2;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "Ljava/lang/String;")
    public static String field5930;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5937;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)V")
    public static void method2495(byte arg0) {
        field5930 = null;
        if (arg0 == -88) {
            field5937 = null;
            field5934 = null;
        }
    }

    @OriginalMember(owner = "client!aw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5938++;
        this.field5933.method1564(this.field5932, -125);
        super.finalize();
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lna;II)V")
    public class390(class211 arg0, int arg1, int arg2) {
        this.field5932 = arg2;
        this.field5933 = arg0;
    }

    @OriginalMember(owner = "client!aw", name = "b", descriptor = "(B)Lho;")
    public static final class224 method2496(byte arg0) {
        field5936++;
        if (class194.field2876 == null || class472.field7217 == null) {
            return null;
        }
        class224 var1 = (class224) class472.field7217.method2836((byte) -6);
        if (arg0 != 58) {
            method2496((byte) 100);
        }
        while (var1 != null) {
            class210 var2 = class194.field2866.method662(var1.field3759, true);
            if (var2 != null && var2.field3274 && var2.method1489((byte) -120, class194.field2867)) {
                return var1;
            }
            var1 = (class224) class472.field7217.method2836((byte) -6);
        }
        return null;
    }
}
