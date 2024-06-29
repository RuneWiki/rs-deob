import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class147 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[[I")
    public static int[][] field2397 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Lbu;")
    public static class407 field2396 = new class407(64);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lfp;")
    public static class409 field2399;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lqs;")
    public static class496 field2392;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/lang/Object;")
    public static Object field2395;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2395 = null;
        field2399 = null;
        field2392 = null;
        field2397 = null;
        field2396 = null;
        int var1 = -100 / ((arg0 + 23) / 40);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1068(String arg0, int arg1) {
        field2393++;
        if (class236.field4084 == null) {
            return;
        }
        class504.field7350++;
        class265.method1775(arg1 - 2, class484.field7114);
        class261.field4357.method163(class323.method2037(arg0, -1), (byte) 49);
        if (arg1 == 0) {
            class261.field4357.method145(arg0, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1069(boolean arg0, String arg1, String arg2) {
        class533.field7837 = arg1;
        field2398++;
        class68.field1058 = arg2;
        if (class150.field2406 != 3 && (class68.field1058.equals("") || class533.field7837.equals(""))) {
            class213.method1398(3, 0);
            return;
        }
        class318.field5000 = false;
        if (class150.field2406 != 1) {
            class140.field2330 = -1;
            class461.field6857 = 0;
        }
        class213.method1398(-3, 0);
        if (arg0) {
            class23.field250 = 0;
            class350.field5480 = 1;
            class325.field5107 = 0;
        }
    }
}
