import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class222 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Laf;")
    public static class68 field3685 = new class68(64);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Lqh;")
    public static class201 field3687;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "[[S")
    public static short[][] field3688;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1565(int arg0) {
        field3687 = null;
        if (arg0 == -7463) {
            field3685 = null;
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method1566(int arg0) {
        if (arg0 <= 109) {
            method1566(-57);
        }
        field3686++;
        class131.field2095.method472((byte) -63);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static final void method1567(boolean arg0) {
        if (!arg0) {
            return;
        }
        class136.field2246.method481(false);
        field3681++;
        class27.field433.method481(!arg0);
        class179.field2819.method481(false);
        class121.field1966.method481(false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IJ)V")
    public static final void method1568(int arg0, long arg1) {
        field3684++;
        if (arg0 != 1) {
            field3683 = -64;
        }
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class185.field2910; var3++) {
            if (class183.field2884[var3] == arg1) {
                class185.field2910--;
                for (int var4 = var3; var4 < class185.field2910; var4++) {
                    class183.field2884[var4] = class183.field2884[var4 + 1];
                    class214.field3497[var4] = class214.field3497[var4 + 1];
                }
                class132.field2108++;
                class99.field1633 = class66.field1094;
                class68.field1113.method534((byte) -6, 82);
                class68.field1113.method1502((byte) 115, arg1);
                return;
            }
        }
    }
}
