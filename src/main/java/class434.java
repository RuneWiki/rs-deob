import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class434 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6393 = "Loading config - ";

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field6395;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[S")
    public static short[] field6394;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILqj;)V", line = 8)
    public static final void method2753(int arg0, class238 arg1) {
        class393.field5900 = arg1;
        field6396++;
        int var2 = -55 % ((arg0 - 8) / 61);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 19)
    public static void method2754(int arg0) {
        field6393 = null;
        field6394 = null;
        if (arg0 != 0) {
            field6393 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLjava/lang/String;III)V", line = 47)
    public static final void method2755(byte arg0, String arg1, int arg2, int arg3, int arg4) {
        field6395++;
        if (arg0 != 31) {
            field6394 = null;
        }
        class249 var5 = class358.method2355(arg4, arg2, (byte) -114);
        if (var5 == null) {
            return;
        }
        if (var5.field3632 != null) {
            class228 var6 = new class228();
            var6.field3211 = arg1;
            var6.field3210 = var5;
            var6.field3215 = var5.field3632;
            var6.field3209 = arg3;
            class365.method2395(var6);
        }
        boolean var7 = true;
        if (var5.field3608 > 0) {
            var7 = class24.method201(var5, -5241);
        }
        if (!var7 || !client.method1572(var5).method1141(arg3 - 1, (byte) -115)) {
            return;
        }
        if (arg3 == 1) {
            class232.field3279.method756(arg0 ^ 0x1F, 216);
            class442.field6454++;
            class232.field3279.method1704(arg2, (byte) 125);
            class232.field3279.method1693(arg4, (byte) 28);
        }
        if (arg3 == 2) {
            class345.field5077++;
            class232.field3279.method756(0, 19);
            class232.field3279.method1704(arg2, (byte) 127);
            class232.field3279.method1693(arg4, (byte) 75);
        }
        if (arg3 == 3) {
            class220.field3114++;
            class232.field3279.method756(0, 193);
            class232.field3279.method1704(arg2, (byte) 127);
            class232.field3279.method1693(arg4, (byte) 91);
        }
        if (arg3 == 4) {
            class232.field3279.method756(arg0 - 31, 76);
            class10.field98++;
            class232.field3279.method1704(arg2, (byte) 127);
            class232.field3279.method1693(arg4, (byte) 124);
        }
        if (arg3 == 5) {
            class232.field3279.method756(0, 173);
            class372.field5520++;
            class232.field3279.method1704(arg2, (byte) 126);
            class232.field3279.method1693(arg4, (byte) 84);
        }
        if (arg3 == 6) {
            class57.field826++;
            class232.field3279.method756(arg0 - 31, 89);
            class232.field3279.method1704(arg2, (byte) 125);
            class232.field3279.method1693(arg4, (byte) 105);
        }
        if (arg3 == 7) {
            class353.field5184++;
            class232.field3279.method756(0, 221);
            class232.field3279.method1704(arg2, (byte) 126);
            class232.field3279.method1693(arg4, (byte) 49);
        }
        if (arg3 == 8) {
            class316.field4516++;
            class232.field3279.method756(0, 137);
            class232.field3279.method1704(arg2, (byte) 126);
            class232.field3279.method1693(arg4, (byte) 65);
        }
        if (arg3 == 9) {
            class199.field2850++;
            class232.field3279.method756(0, 63);
            class232.field3279.method1704(arg2, (byte) 126);
            class232.field3279.method1693(arg4, (byte) 42);
        }
        if (arg3 == 10) {
            class316.field4536++;
            class232.field3279.method756(0, 3);
            class232.field3279.method1704(arg2, (byte) 126);
            class232.field3279.method1693(arg4, (byte) 124);
        }
    }
}
