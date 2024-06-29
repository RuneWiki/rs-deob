import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class107 {

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field1856 = 1;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Lsb;")
    public static class266 field1853 = new class266(47, -1);

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
    public static int field1858 = 1;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Lkv;")
    public static class247 field1851;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)I")
    public static final int method968(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 106) {
            method969(null, null, (byte) 61);
        }
        field1854++;
        if (arg3 < arg2) {
            return arg2;
        } else if (arg3 <= arg0) {
            return arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method969(String arg0, String arg1, byte arg2) {
        field1855++;
        class37.field1050 = 1;
        class163.field2735 = -1;
        int var3 = -71 / ((arg2 + 61) / 50);
        class210.method1471(false, arg0, (byte) 101, arg1);
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZB)I")
    public static final int method970(boolean arg0, byte arg1) {
        field1857++;
        if (class636.field9175 == null) {
            return 0;
        } else if (arg0 || class645.field9299 == null) {
            int var2 = 0;
            if (arg1 != -13) {
                method970(false, (byte) -45);
            }
            for (int var3 = 0; var3 < class636.field9175.length; var3++) {
                int var4 = class636.field9175[var3];
                if (class217.field3305.method2230((byte) -98, var4)) {
                    var2++;
                }
                if (class292.field4390.method2230((byte) -83, var4)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class636.field9175.length * 2;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method971(int arg0) {
        field1853 = null;
        field1851 = null;
        if (arg0 != 1) {
            field1852 = -38;
        }
    }
}
