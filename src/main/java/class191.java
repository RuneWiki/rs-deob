import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class191 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "Lna;")
    public static class26 field2991 = class69.method505("Monde de jeu cr-B-B", (byte) -120);

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lve;")
    public static class266 field2989;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V", line = 7)
    public static void method1297(int arg0) {
        field2991 = null;
        if (arg0 == -1) {
            field2989 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lve;I)V", line = 25)
    public static final void method1298(class266 arg0, int arg1) {
        field2995++;
        class7.field81 = arg0;
        if (arg1 != -6) {
            field2989 = (class266) null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)V", line = 41)
    public static final void method1299(int arg0, int arg1) {
        class214.method1434(false);
        field2990++;
        class74.method533(8);
        if (arg0 < 38) {
            field2994 = 118;
        }
        int var2 = class21.method139(-37, arg1).field2586;
        if (var2 == 0) {
            return;
        }
        int var3 = class205.field3201[arg1];
        if (var2 == 6) {
            class153.field2394 = var3;
        }
        if (var2 == 5) {
            class28.field475 = var3;
        }
        if (var2 == 9) {
            class127.field1959 = var3;
        }
    }
}
