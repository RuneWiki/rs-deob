import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class87 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "[Luf;")
    public static class168[] field1341 = new class168[100];

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Luf;")
    public static class168 field1344 = class148.method1019(-1720, "sl_flags");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Z")
    public static boolean field1343;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[Lg;")
    public static class242[] field1345;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)J", line = 4)
    public static final long method597(int arg0, int arg1, int arg2) {
        class127 var3 = class92.field1424[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1970; var4++) {
            class91 var5 = var3.field1971[var4];
            if ((var5.field1407 >> 29 & 0x3L) == 2L && var5.field1410 == arg1 && var5.field1412 == arg2) {
                return var5.field1407;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 45)
    public static void method598(int arg0) {
        if (arg0 >= 38) {
            field1341 = null;
            field1344 = null;
            field1345 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILg;)V", line = 64)
    public static final void method599(int arg0, class242 arg1) {
        class242 var2 = class289.method1989(arg1, (byte) -122);
        if (arg0 != -5479) {
            method598(-51);
        }
        field1342++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class299.field5069;
            var4 = class14.field142;
        } else {
            var4 = var2.field3989;
            var3 = var2.field4057;
        }
        class199.method1403(var4, arg1, false, var3, true);
        class15.method62(var3, arg0 ^ 0x1566, arg1, var4);
    }
}
