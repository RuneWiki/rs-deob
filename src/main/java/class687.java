import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class687 {

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Ljaa;")
    public static class779 field8844 = new class779();

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field8842;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field8845;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "Leka;")
    public static class654 field8841;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public static void method3677(int arg0) {
        if (arg0 != -4011) {
            method3677(-100);
        }
        field8844 = null;
        field8841 = null;
    }

    @OriginalMember(owner = "client!mw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8843++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
    public static final void method3678(int arg0, int arg1) {
        field8842++;
        class606.field7682 = arg1;
        int var2 = 39 / ((arg0 - 34) / 45);
        class282.field3656.method2919(0);
    }
}
