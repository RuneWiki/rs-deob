import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class63 extends class195 {

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "Lck;")
    public static class119 field1001 = class298.method1987((byte) 96, " <col=00ff80>");

    @OriginalMember(owner = "client!g", name = "db", descriptor = "Z")
    public static boolean field1003 = false;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "Lck;")
    private static class119 field995 = class298.method1987((byte) 53, " has logged in)3");

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "Lck;")
    public static class119 field999 = field995;

    @OriginalMember(owner = "client!g", name = "eb", descriptor = "Lck;")
    public static class119 field1004 = class298.method1987((byte) 92, "document)3cookie=(R");

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!g", name = "X", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!g", name = "cb", descriptor = "Lva;")
    public static class36 field1002;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V", line = 4)
    public static final void method470(byte arg0) {
        field998++;
        if (class49.field767 != null) {
            class49.field767.method313(19722);
        }
        if (class195.field3110 != null) {
            class195.field3110.method313(19722);
        }
        class216.method1362(2, class244.field3943, true, 22050);
        class49.field767 = class42.method320(22050, class220.field3533, 0, class39.field587, -1);
        class49.field767.method306(0, class68.field1062);
        int var1 = -81 / ((arg0 + 81) / 40);
        class195.field3110 = class42.method320(2048, class220.field3533, 1, class39.field587, -1);
        class195.field3110.method306(0, class230.field3721);
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)V", line = 25)
    public static final void method471(boolean arg0) {
        if (arg0) {
            return;
        }
        field996++;
        if (!class64.method479(301989888) && class119.field1862 != class10.field189) {
            class10.method105(class177.field2816, class10.field189, class55.field884, class124.field1917.field4973[0], 104, class124.field1917.field4963[0], false);
        } else if (class262.field4252 != class10.field189) {
            class262.field4252 = class10.field189;
            class177.method1130(class10.field189, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZ)[I", line = 51)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            method471(true);
        }
        field994++;
        return class157.field2505;
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V", line = 63)
    public static void method472(byte arg0) {
        field1001 = null;
        field1004 = null;
        if (arg0 == -74) {
            field995 = null;
            field1002 = null;
            field999 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 78)
    public class63() {
        super(0, true);
    }
}
