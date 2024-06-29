import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class207 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Z")
    public static boolean field4117 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field4121 = 0;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static volatile int field4124 = 0;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Ldd;")
    public static class35 field4122 = class180.method1196((byte) -59, "Einloggen");

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ldd;")
    public static class35 field4118 = class180.method1196((byte) -49, "Fps:");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "[I")
    public static int[] field4119;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        field4119 = null;
        field4122 = null;
        if (arg0 < 7) {
            method1369(null, -114);
        }
        field4118 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public static final void method1367(int arg0, int arg1) {
        field4115++;
        if (arg0 == arg1 || !class193.method1261((byte) 111, arg0)) {
            return;
        }
        class55[] var2 = class163.field3299[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class55 var4 = var2[var3];
            if (var4.field1250 != null) {
                class200 var5 = new class200();
                var5.field3995 = var4;
                var5.field4010 = var4.field1250;
                class46.method419(2000000, false, var5);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)I")
    public static final int method1368(int arg0, int arg1, int arg2) {
        field4116++;
        if (arg0 > -101) {
            field4117 = true;
        }
        int var3 = arg1 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lag;I)V")
    public static final void method1369(class8 arg0, int arg1) {
        class60.field1488 = arg0;
        field4123++;
        if (arg1 >= -76) {
            method1366((byte) -58);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Lee;")
    public static final class46 method1370(byte arg0, int arg1) {
        class46 var2 = (class46) class40.field891.method817(true, (long) arg1);
        field4120++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class49.field1067.method39(10, -1, arg1);
        class46 var4 = new class46();
        var4.field1008 = arg1;
        if (var3 != null) {
            var4.method412(new class26(var3), (byte) 126);
        }
        var4.method423(-2);
        if (var4.field1004 != -1) {
            var4.method422(method1370((byte) -73, var4.field1035), method1370((byte) -73, var4.field1004), (byte) 23);
        }
        if (arg0 != -73) {
            method1366((byte) 2);
        }
        if (!class54.field1206 && var4.field989) {
            var4.field995 = class5.field87;
            var4.field1019 = null;
            var4.field994 = null;
            var4.field1029 = false;
            var4.field1040 = 0;
        }
        class40.field891.method816(var4, (long) arg1, 16);
        return var4;
    }
}
