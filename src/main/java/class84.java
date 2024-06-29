import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class84 {

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field1350 = 1;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field1352 = 1;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[I")
    public static int[] field1351 = new int[64];

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field1349 = 0;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "Lvh;")
    public static class61 field1358;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V", line = 13)
    public static final void method759(boolean arg0) {
        for (int var1 = 0; var1 < class191.field3200; var1++) {
            int var2 = class33.field468[var1];
            class278 var3 = class320.field5071[var2];
            if (var3 != null) {
                class272.method1866(var3, (byte) -126, var3.field4413.field202);
            }
        }
        field1347++;
        if (!arg0) {
            method759(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)V", line = 41)
    public static final void method760(boolean arg0, int arg1) {
        class148.field2663 = new int[104];
        if (arg1 >= -43) {
            return;
        }
        field1354++;
        class44.field690 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class193.field3230 = new byte[var2][104][104];
        class226.field3798 = new int[var2][105][105];
        class310.field4912 = new byte[var2][104][104];
        class271.field4319 = new byte[var2][104][104];
        class175.field2993 = new byte[var2][104][104];
        class51.field806 = new int[104];
        class224.field3745 = new byte[var2][105][105];
        class269.field4306 = new int[104];
        class286.field4563 = new int[5];
        class15.field233 = new int[104];
        class78.field1265 = new int[104];
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Z)V", line = 71)
    public static void method761(boolean arg0) {
        field1358 = null;
        field1351 = null;
        if (arg0) {
            method759(false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(ZI)V", line = 91)
    public static final void method762(boolean arg0, int arg1) {
        field1357++;
        class215.method1590(arg0, class188.field3152, class313.field4973, -114, class311.field4933);
        if (arg1 != 28406) {
            field1349 = -33;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Ldi;", line = 111)
    public static final class166 method763(byte arg0, int arg1) {
        field1356++;
        if (arg0 > -76) {
            return (class166) null;
        }
        class166 var2 = (class166) class349.field5546.method2400((long) arg1, 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class279.field4424.method441(false, 26, arg1);
        class166 var4 = new class166();
        if (var3 != null) {
            var4.method1308(new class336(var3), true);
        }
        class349.field5546.method2396(0, (long) arg1, var4);
        return var4;
    }
}
