import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class234 extends class179 {

    @OriginalMember(owner = "client!w", name = "v", descriptor = "Lmc;")
    public class316 field3390;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field3388 = 0;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3387 = 0;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lfg;")
    public static class18 field3391 = new class18(500);

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3393 = "Members object";

    @OriginalMember(owner = "client!w", name = "A", descriptor = "Lfg;")
    public static class18 field3395 = new class18(64);

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[[I")
    public static int[][] field3396 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Ldp;")
    public static class174 field3394;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V")
    public static void method1721(int arg0) {
        field3391 = null;
        field3394 = null;
        field3395 = null;
        if (arg0 == -1) {
            field3393 = null;
            field3396 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(B)Z")
    public abstract boolean method1722(byte arg0);

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lmc;)V")
    public class234(class316 arg0) {
        this.field3390 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1723(byte arg0);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(III)I")
    public static final int method1724(int arg0, int arg1, int arg2) {
        if (arg2 != -31853) {
            field3396 = null;
        }
        field3389++;
        return arg0 == 1 || arg0 == 3 ? class402.field5883[arg1 & 0x3] : class388.field5563[arg1 & 0x3];
    }
}
