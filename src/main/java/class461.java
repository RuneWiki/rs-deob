import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class461 {

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "Lsv;")
    public static class570 field6288 = new class570(83, -1);

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "Lgga;")
    public static class513 field6293;

    @OriginalMember(owner = "client!maa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6289++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static final void method2693(int arg0) {
        class100.field1486.method2881((byte) -52);
        field6290++;
        int var1 = -83 / ((arg0 + 26) / 41);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)Z")
    public static final boolean method2694(int arg0, int arg1) {
        if (arg1 != 83) {
            field6288 = null;
        }
        field6291++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)Z")
    public final boolean method2695(int arg0) {
        field6287++;
        if (arg0 != 27457) {
            field6293 = null;
        }
        return class635.field8952 == this | class110.field1553 == this;
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)V")
    public static void method2696(int arg0) {
        field6288 = null;
        field6293 = null;
        if (arg0 != 9) {
            field6288 = null;
        }
    }
}
