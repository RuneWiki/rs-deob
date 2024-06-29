import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class302 {

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Loh;")
    private static class258 field5166 = class153.method1046("flash3:", 87);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Loh;")
    public static class258 field5165 = class153.method1046(" loggt sich aus)3", 112);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Loh;")
    public static class258 field5161 = field5166;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Loh;")
    public static class258 field5169 = field5166;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public int field5160;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public int field5162;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field5163;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 19)
    public static void method2117(byte arg0) {
        field5169 = null;
        field5166 = null;
        if (arg0 != 15) {
            method2117((byte) -8);
        }
        field5161 = null;
        field5165 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Lil;", line = 49)
    public static final class259 method2118(int arg0, byte arg1) {
        field5168++;
        int var2 = -39 % ((arg1 - 14) / 51);
        class259 var3 = (class259) class166.field2816.method1159((byte) 124, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class80.field1371.method1453(1, (byte) -84, arg0);
        class259 var5 = new class259();
        if (var4 != null) {
            var5.method1825(new class235(var4), 0, arg0);
        }
        class166.field2816.method1163(var5, -1, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V", line = 98)
    public static final void method2119(byte arg0) {
        field5163++;
        if (arg0 == -36) {
            class26.field317.method1157(arg0 + 40);
        }
    }
}
