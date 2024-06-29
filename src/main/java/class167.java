import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class167 {

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2553 = "Attack";

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public static void method1191(byte arg0) {
        field2553 = null;
        int var1 = -80 / ((arg0 - 12) / 62);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)V")
    public abstract void method1192(int arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)Ljf;")
    public static final class83 method1193(int arg0, int arg1) {
        field2552++;
        class83 var2 = (class83) class71.field1131.method1418((long) arg1, arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class313.field5017.method1868(0, arg1, arg0 + 1);
        class83 var4 = new class83(var3);
        var4.method76(class265.field4250, (int[]) null);
        class71.field1131.method1421((long) arg1, var4, (byte) 60);
        return var4;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZI)[B")
    public abstract byte[] method1194(boolean arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(II)I")
    public abstract int method1195(int arg0, int arg1);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Lnd;")
    public abstract class223 method1196(int arg0);
}
