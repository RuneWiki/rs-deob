import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class31 {

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "[I")
    public static int[] field436 = new int[32];

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lug;")
    public static class321 field435;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 4)
    public static void method197(byte arg0) {
        field435 = null;
        if (arg0 != -103) {
            field439 = -15;
        }
        field436 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Lri;", line = 16)
    public static final class74 method198(boolean arg0, int arg1) {
        field433++;
        class74 var2 = (class74) class276.field4371.method1619((long) arg1, 42);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3742.method250(!arg0, class329.method2276((byte) 50, arg1), class84.method618(52, arg1));
        class74 var4 = new class74();
        var4.field968 = arg1;
        if (var3 != null) {
            var4.method485(new class192(var3), -28852);
        }
        if (arg0) {
            return (class74) null;
        }
        var4.method479((byte) 119);
        if (var4.field928 != -1) {
            var4.method486(method198(false, var4.field967), method198(false, var4.field928), 4420);
        }
        if (var4.field974 != -1) {
            var4.method490((byte) -112, method198(false, var4.field974), method198(false, var4.field947));
        }
        if (!class227.field3600 && var4.field984) {
            var4.field946 = false;
            var4.field972 = 0;
            var4.field996 = class247.field3939;
            var4.field971 = class44.field605;
            var4.field943 = class164.field2663;
        }
        class276.field4371.method1621((long) arg1, 21, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)Lql;", line = 61)
    public static final class19 method199(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class19 var4 = var3.field3676;
            var3.field3676 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II[BI)I", line = 73)
    public static final int method200(int arg0, int arg1, byte[] arg2, int arg3) {
        field438++;
        int var4 = -1;
        if (arg0 == -9714) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                var4 = class232.field3705[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return 51;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;)I", line = 96)
    public static final int method201(int arg0, String arg1) {
        field434++;
        if (arg0 != 14762) {
            return 22;
        }
        for (int var2 = 0; var2 < class188.field3061.length; var2++) {
            if (class188.field3061[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
