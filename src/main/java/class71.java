import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public abstract class class71 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lce;")
    public static class126 field1158 = class206.method1445(-7923, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "Lce;")
    private static class126 field1162 = class206.method1445(-7923, "K");

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field1163 = 0;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lce;")
    public static class126 field1159 = field1162;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Lce;")
    public static class126 field1164 = class206.method1445(-7923, "Okay");

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "Lce;")
    public static class126 field1161 = field1162;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)J", line = 12)
    public static final long method513(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        return var3 == null || var3.field49 == null ? 0L : var3.field49.field1678;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 41)
    public static void method516(int arg0) {
        field1162 = null;
        field1164 = null;
        field1161 = null;
        field1159 = null;
        field1158 = null;
        if (arg0 != 28608) {
            field1162 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IB)V")
    public abstract void method512(int arg0, byte arg1);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)Lsc;")
    public abstract class142 method514(boolean arg0);

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[B")
    public abstract byte[] method515(int arg0, int arg1);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)I")
    public abstract int method517(int arg0, int arg1);
}
