import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class204 extends class151 {

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field3484 = 0;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[I")
    public static int[] field3489 = new int[32];

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[Lnj;")
    public static class82[] field3487;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "[[B")
    public static byte[][] field3491;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)Lve;")
    public static final class174 method1379(byte arg0) {
        field3490++;
        if (arg0 >= -123) {
            field3484 = 123;
        }
        class24 var1 = new class24(class144.field2538, class101.field1790, class253.field4422[0], class9.field207[0], class245.field4326[0], class164.field2958[0], field3491[0], class33.field572);
        class125.method932(true);
        return var1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1380(int arg0) {
        field3489 = null;
        field3487 = null;
        field3491 = null;
        if (arg0 != -6853) {
            field3484 = 98;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public static final void method1381(int arg0) {
        class124.field2250 = 0;
        class47.field789 = 0;
        class97.field1672 = false;
        field3485++;
        class255.field4498 = -1;
        class226.field3894 = 0;
        class49.field819 = -1;
        class250.field4387 = 0;
        class134.field2383 = 0;
        class16.field300 = -1;
        class121.field2219 = 0;
        class237.field4084.field3728 = arg0;
        class144.field2536.field3728 = 0;
        class222.field3824 = -1;
        for (int var1 = 0; var1 < class141.field2499.length; var1++) {
            if (class141.field2499[var1] != null) {
                class141.field2499[var1].field4464 = -1;
            }
        }
        for (int var2 = 0; var2 < class180.field3109.length; var2++) {
            if (class180.field3109[var2] != null) {
                class180.field3109[var2].field4464 = -1;
            }
        }
        class243.method1674(30522);
        class207.field3549 = 1;
        class220.method1521(30, 0);
        for (int var3 = 0; var3 < 100; var3++) {
            class208.field3563[var3] = true;
        }
        class173.field3031.method382(false);
        class32.method287((byte) -105);
    }
}
