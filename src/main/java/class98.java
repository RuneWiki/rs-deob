import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class98 extends class666 {

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field1077 = 0;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "Lsda;")
    public static class234 field1082 = class633.method3541(31264);

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field1083 = -2;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(III)Z", line = 5)
    public static final boolean method606(int arg0, int arg1, int arg2) {
        if (arg0 != 1077541505) {
            field1083 = 32;
        }
        ++field1081;
        return class354.method1956(arg1, (byte) -118, arg2) | ~(arg1 & 458752) != -1 || class354.method1959(arg0 ^ 1837068224, arg2, arg1);
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(III)I", line = 21)
    private final int method607(int arg0, int arg1, int arg2) {
        ++field1079;
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 << 1 ^ var4;
        return arg1 != 4096 ? -91 : -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIILap;B)Lhea;", line = 35)
    public static final class385 method608(int arg0, int arg1, int arg2, int arg3, class435 arg4, byte arg5) {
        int var6 = -82 % ((-33 - arg5) / 36);
        ++field1078;
        if (!arg4.field6061 && (!class644.method3612(false, arg3) || !class644.method3612(false, arg0))) {
            return arg4.field6012 ? new class385(arg4, 34037, arg2, arg1, arg3, arg0, true) : new class385(arg4, arg2, arg1, arg3, arg0, class146.method799(arg3, -111), class146.method799(arg0, -122), true);
        } else {
            return new class385(arg4, 3553, arg2, arg1, arg3, arg0, true);
        }
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V", line = 53)
    public static void method609(int arg0) {
        if (arg0 != 4096) {
            method606(75, 115, 25);
        }
        field1082 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method122(int arg0, int arg1) {
        ++field1080;
        int[] var3 = super.field9466.method1811(arg1, 33);
        if (arg0 > -21) {
            method608(-49, 26, -91, -10, (class435) null, (byte) 90);
        }
        if (super.field9466.field4172) {
            int var4 = class476.field6935[arg1];
            for (int var5 = 0; class501.field7222 > var5; ++var5) {
                var3[var5] = this.method607(class579.field8246[var5], 4096, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 106)
    public class98() {
        super(0, true);
    }
}
