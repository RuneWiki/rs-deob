import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class245 implements class733 {

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "Leq;")
    private class209 field3412;

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "Lrv;")
    public class109 field3413;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field3416 = 1;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "Leq;")
    public static class209 field3411;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "Lkr;")
    public class743 field3410;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 4)
    public final void method1173(int arg0) {
        field3409++;
        this.field3410 = class458.method2794(this.field3412, this.field3413.field1776, -114);
        if (arg0 >= -105) {
            this.field3410 = null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)V", line = 16)
    public void method1172(boolean arg0, int arg1) {
        field3414++;
        if (arg0) {
            int var3 = this.field3413.field1778.method2152(class57.field1064, this.field3410.method82(), -108) + this.field3413.field1774;
            int var4 = this.field3413.field1775.method3892(this.field3410.method83(), class477.field6814, 4) + this.field3413.field1779;
            this.field3410.method4135(var3, var4);
        }
        int var5 = -63 / (arg1 / 39);
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V", line = 39)
    public static void method1629(byte arg0) {
        if (arg0 != 86) {
            field3411 = null;
        }
        field3411 = null;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Leq;Lrv;)V", line = 49)
    public class245(class209 arg0, class109 arg1) {
        this.field3412 = arg0;
        this.field3413 = arg1;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)Z", line = 61)
    public final boolean method1176(byte arg0) {
        if (arg0 <= 124) {
            method1629((byte) -1);
        }
        field3408++;
        return this.field3412.method1472(-25711, this.field3413.field1776);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZLjava/lang/String;IZ)Z", line = 72)
    public static final boolean method1630(boolean arg0, String arg1, int arg2, boolean arg3) {
        field3415++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        if (!arg0) {
            field3411 = null;
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }
}
