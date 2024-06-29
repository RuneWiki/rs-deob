import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class112 extends class114 {

    @OriginalMember(owner = "client!b", name = "H", descriptor = "Lmd;")
    public class1 field2043;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "Lia;")
    private static class257 field2046 = class28.method234(95, "");

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field2045 = 0;

    @OriginalMember(owner = "client!b", name = "I", descriptor = "Lia;")
    public static class257 field2044 = field2046;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method812(byte arg0) {
        field2046 = null;
        if (arg0 >= -41) {
            field2044 = null;
        }
        field2044 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBI)I")
    public static final int method813(int arg0, byte arg1, int arg2) {
        int var3 = arg0 >> 31 & arg2 - 1;
        field2042++;
        if (arg1 < 112) {
            method812((byte) 103);
        }
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lmd;)V")
    public class112(class1 arg0) {
        this.field2043 = arg0;
    }
}
