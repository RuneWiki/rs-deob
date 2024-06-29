import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class155 {

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field2503 = -1;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field2501 = -1;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field2502 = -1;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "Lrn;")
    public static class18 field2504;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "Lrn;")
    public static class18 field2506;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)Lhi;", line = 8)
    public static final class203 method1270(byte arg0, int arg1) {
        field2500++;
        if (arg0 > -84) {
            return (class203) null;
        }
        class203 var2 = (class203) class43.field689.method654(104, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field1587.method187(1, arg1, -1);
        class203 var4 = new class203();
        if (var3 != null) {
            var4.method1519(arg1, -2, new class25(var3));
        }
        class43.field689.method652(-71, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLrn;)I", line = 38)
    public static final int method1271(boolean arg0, class18 arg1) {
        if (!arg0) {
            field2504 = (class18) null;
        }
        field2505++;
        int var2 = 0;
        if (arg1.method199(2209, class297.field4610)) {
            var2++;
        }
        if (arg1.method199(2209, class185.field2895)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 58)
    public static void method1272(boolean arg0) {
        field2504 = null;
        field2506 = null;
        if (!arg0) {
            field2501 = 115;
        }
    }
}
