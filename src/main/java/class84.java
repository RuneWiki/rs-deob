import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class84 {

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "Llga;")
    public static class712 field1166 = new class712(19, 2);

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "I")
    public static int field1169 = 0;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Lea;")
    public static class547 field1168 = new class547(49, 2);

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "Lea;")
    public static class547 field1170 = new class547(31, -2);

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Z)V")
    public static void method619(boolean arg0) {
        if (!arg0) {
            method619(false);
        }
        field1168 = null;
        field1166 = null;
        field1170 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(BI)I")
    public static final int method620(byte arg0, int arg1) {
        int var2 = -85 / ((arg0 - 33) / 43);
        field1167++;
        return arg1 >>> 8;
    }
}
