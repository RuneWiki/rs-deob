import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class235 {

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lsb;")
    private static class98 field4052 = class47.method368("Connection lost)3", 0);

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
    public static boolean field4053 = false;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Lsb;")
    public static class98 field4055 = class47.method368("blaugr-Un:", 0);

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lsb;")
    public static class98 field4054 = field4052;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lsb;")
    public static class98 field4065 = class47.method368("<col=ffffff> )4 ", 0);

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[I")
    public static int[] field4063 = new int[100];

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "Lsb;")
    public static class98 field4064 = class47.method368(":assistreq:", 0);

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "J")
    public long field4061;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Lph;")
    public static class229 field4057;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lpb;")
    public class235 field4067;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lpb;")
    public class235 field4069;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ltg;")
    public static class75 field4062;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[Lnj;")
    public static class82[] field4068;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Lqf;")
    public static final class245 method1605(int arg0, int arg1) {
        field4056++;
        class245 var2 = (class245) class211.field3614.method1564((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class243.field4222.method571(class248.method1727(28380, arg1), method1607(arg1, 97), -34);
        class245 var4 = new class245();
        var4.field4294 = arg1;
        if (var3 != null) {
            var4.method1687(new class216(var3), true);
        }
        var4.method1702((byte) 77);
        if (var4.field4275 != -1) {
            var4.method1688(method1605(106, var4.field4275), method1605(86, var4.field4304), -1);
        }
        int var5 = 53 / ((arg0 - 7) / 41);
        if (var4.field4250 != -1) {
            var4.method1697(50, method1605(72, var4.field4250), method1605(99, var4.field4303));
        }
        if (!class228.field3922 && var4.field4309) {
            var4.field4273 = false;
            var4.field4259 = null;
            var4.field4296 = null;
            var4.field4319 = 0;
            var4.field4255 = class47.field792;
        }
        class211.field3614.method1563((long) arg1, 21771, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public static void method1606(byte arg0) {
        field4065 = null;
        field4064 = null;
        field4063 = null;
        field4055 = null;
        field4054 = null;
        field4057 = null;
        field4052 = null;
        field4062 = null;
        field4068 = null;
        if (arg0 <= 8) {
            field4065 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(II)I")
    private static final int method1607(int arg0, int arg1) {
        field4059++;
        if (arg1 <= 27) {
            method1605(-21, 72);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIII)V")
    public static final void method1608(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4070++;
        if (arg0 != 23044) {
            return;
        }
        if (class229.field3933 <= arg2 - arg1 && (arg1 + arg2) <= class106.field1899 && class116.field2077 <= (arg3 - arg1) && (arg1 + arg3) <= class215.field3666) {
            class170.method1206(arg4, (byte) -91, arg3, arg1, arg2);
        } else {
            class242.method1669(arg2, arg4, arg1, 16488, arg3);
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Z")
    public final boolean method1609(byte arg0) {
        field4060++;
        if (this.field4067 == null) {
            return false;
        } else if (arg0 > -97) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public static final void method1610(int arg0, int arg1, int arg2) {
        field4066++;
        if (class141.method1056(arg0, (byte) -64)) {
            if (arg1 != 24148) {
                method1610(-9, -122, -44);
            }
            class85.method634(1, arg2, class33.field585[arg0]);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V")
    public final void method1611(byte arg0) {
        field4058++;
        if (this.field4067 == null) {
            return;
        }
        this.field4067.field4069 = this.field4069;
        int var2 = -27 / ((-arg0 - 77) / 48);
        this.field4069.field4067 = this.field4067;
        this.field4067 = null;
        this.field4069 = null;
    }
}
