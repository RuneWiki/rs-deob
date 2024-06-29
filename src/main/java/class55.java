import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class55 {

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "J")
    public static long field1121 = 0L;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "Lkh;")
    public static class117 field1120 = class224.method1450((byte) -117, "headicons_prayer");

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "Ldb;")
    public static class36 field1118 = new class36();

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IZ)Lnf;")
    public static final class148 method421(int arg0, boolean arg1) {
        field1122++;
        class148 var2 = (class148) class109.field2046.method506(1, (long) arg0);
        if (!arg1) {
            return null;
        } else if (var2 == null) {
            byte[] var3 = class219.field3978.method104(-50, 5, arg0);
            class148 var4 = new class148();
            if (var3 != null) {
                var4.method1062(new class145(var3), 26161);
            }
            class109.field2046.method497((long) arg0, var4, -96);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1118 = null;
        field1120 = null;
        if (arg0 != -33) {
            field1124 = -118;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static final void method423(int arg0) {
        class206.field3706.method385((byte) -115);
        field1119++;
        for (int var1 = 0; var1 < 32; var1++) {
            class194.field3465[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class127.field2358[var2] = 0L;
        }
        class7.field106 = arg0;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    public static final void method424(int arg0) {
        field1117++;
        class172.field3103.method503(arg0 ^ 0xA);
        class211.field3818.method410((byte) 71);
        class195.field3473.method410((byte) 71);
        if (arg0 != 0) {
            field1123 = 42;
        }
    }
}
