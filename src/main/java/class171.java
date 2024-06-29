import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class171 {

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2604 = "glow1:";

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field2603 = 1;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "Z")
    public static boolean field2601 = true;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "Lnk;")
    public static class16 field2600;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lja;")
    public static class73 field2599;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "[[I")
    public static int[][] field2606;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)Z", line = 11)
    public static final boolean method1201(int arg0) {
        field2607++;
        class321 var1 = class188.field2839;
        synchronized (class188.field2839) {
            if (class63.field750 == class324.field5208) {
                return false;
            } else {
                class87.field1147 = class285.field4532[class63.field750];
                class99.field1339 = class62.field737[class63.field750];
                class63.field750 = class63.field750 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V", line = 28)
    public static void method1202(byte arg0) {
        field2604 = null;
        if (arg0 == -99) {
            field2600 = null;
            field2599 = null;
            field2606 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)Lte;", line = 53)
    public static final class325 method1203(int arg0) {
        if (arg0 != -1) {
            method1202((byte) -123);
        }
        field2605++;
        try {
            return (class325) Class.forName("ih").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }
}
