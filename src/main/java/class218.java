import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class218 {

    @OriginalMember(owner = "client!kea", name = "h", descriptor = "Lwo;")
    private class445 field2862;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "Z")
    public static boolean field2857 = false;

    @OriginalMember(owner = "client!kea", name = "d", descriptor = "[[I")
    public static int[][] field2858 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!kea", name = "i", descriptor = "Lwh;")
    public static class546 field2863 = new class546(8);

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "I")
    public static int field2861;

    @OriginalMember(owner = "client!kea", name = "j", descriptor = "Ljca;")
    private class45 field2864;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)V")
    public static final void method1379(byte arg0) {
        field2859++;
        class177.field2497 = false;
        int var1 = -27 / ((arg0 - 1) / 46);
        class398.method2275(-1);
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Ljca;")
    public final class45 method1380(int arg0) {
        field2856++;
        class45 var2 = this.field2862.field5887.field548;
        if (this.field2862.field5887 == var2) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var2.field548;
            return arg0 <= 99 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lwo;I)V")
    public final void method1381(class445 arg0, int arg1) {
        this.field2862 = arg0;
        if (arg1 != 21085) {
            this.method1381(null, 2);
        }
        field2861++;
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V")
    public static void method1382(byte arg0) {
        field2863 = null;
        if (arg0 != 110) {
            field2857 = true;
        }
        field2858 = null;
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)Ljca;")
    public final class45 method1383(byte arg0) {
        field2855++;
        if (arg0 != 1) {
            return null;
        }
        class45 var2 = this.field2864;
        if (this.field2862.field5887 == var2) {
            this.field2864 = null;
            return null;
        } else {
            this.field2864 = var2.field548;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
    public class218() {
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lwo;)V")
    public class218(class445 arg0) {
        this.field2862 = arg0;
    }
}
