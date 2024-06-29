import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class188 {

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lfc;")
    public static class174 field2699 = new class174(50);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ltn;")
    public static class60 field2700 = new class60(36, -1);

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Leh;")
    public static class246 field2701 = new class246(100, 0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)I")
    public abstract int method1192(boolean arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public abstract void method1193(byte arg0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
    public abstract int method1194(int arg0);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Z")
    public final boolean method1195(int arg0) {
        field2697++;
        if (arg0 != 100) {
            method1200(true);
        }
        return this.method1199(14795) || this.method1201((byte) -85) || this.method1197((byte) 63);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Lke;")
    public abstract class432 method1196(int arg0);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Z")
    public abstract boolean method1197(byte arg0);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public abstract void method1198(int arg0);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Z")
    public abstract boolean method1199(int arg0);

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)I")
    public static final int method1200(boolean arg0) {
        if (arg0) {
            return 72;
        } else {
            field2696++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)Z")
    public abstract boolean method1201(byte arg0);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(B)V")
    public static void method1202(byte arg0) {
        field2701 = null;
        field2699 = null;
        field2700 = null;
        if (arg0 < 67) {
            field2701 = null;
        }
    }
}
