import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class6 extends InputStream {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lhg;")
    public static class207 field133 = null;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!v", name = "read", descriptor = "()I")
    public final int read() {
        field138++;
        class28.method182(30000L, true);
        return -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static final void method41(int arg0) {
        class176.field2839.method94(34);
        class245.field4104.method94(34);
        field137++;
        if (arg0 >= -32) {
            field139 = 49;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method42(boolean arg0) {
        field133 = null;
        if (!arg0) {
            field133 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method43(int arg0) {
        field136++;
        if (class273.field4568 != -1) {
            class270.method1905(-1, class273.field4568, -1, false, (byte) 63);
            class273.field4568 = -1;
        }
        int var1 = 41 / ((arg0 + 28) / 37);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLsj;ILsj;B)I")
    public static final int method44(boolean arg0, class208 arg1, int arg2, class208 arg3, byte arg4) {
        field135++;
        if (arg2 == 1) {
            int var5 = arg3.field1951;
            int var6 = arg1.field1951;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class72.method512(arg3.method1464(0).field4916, (byte) 36, class49.field834, arg1.method1464(0).field4916);
        } else if (arg2 == 3) {
            if (arg3.field3524.equals("-")) {
                if (arg1.field3524.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field3524.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class72.method512(arg3.field3524, (byte) 36, class49.field834, arg1.field3524);
            }
        } else if (arg2 == 4) {
            if (arg3.method883(8)) {
                return arg1.method883(arg4 ^ 0xFFFFFFAD) ? 0 : 1;
            } else if (arg1.method883(8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != -91) {
            return 125;
        } else if (arg2 == 5) {
            if (arg3.method886((byte) -86)) {
                return arg1.method886((byte) -86) ? 0 : 1;
            } else if (arg1.method886((byte) -86)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg3.method887(2)) {
                return arg1.method887(arg4 ^ 0xFFFFFFA7) ? 0 : 1;
            } else if (arg1.method887(2)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 7) {
            return arg3.field3523 - arg1.field3523;
        } else if (arg3.method880(true)) {
            return arg1.method880(true) ? 0 : 1;
        } else if (arg1.method880(true)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static final void method45(int arg0) {
        field134++;
        if (class313.field5033 != arg0) {
            if (class298.field4870 != class289.field4764 || class32.field526 != class115.field1959) {
                class171.field2769 = class298.field4870;
                class260.field4376 = class32.field526;
                class313.field5033 = 2;
                return;
            }
            class313.field5033 = 0;
            if (class78.field1314 && class157.field2581[81] && class287.field4747 > 2) {
                class122.method915(Integer.MAX_VALUE, class287.field4747 - 2);
                return;
            }
            class122.method915(arg0 + 2147483645, class287.field4747 + -1);
        } else if (class289.field4764 == class171.field2769 && class260.field4376 == class115.field1959) {
            class313.field5033 = 0;
            if (class78.field1314 && class157.field2581[81] && class287.field4747 > 2) {
                class122.method915(arg0 ^ 0x7FFFFFFD, class287.field4747 - 2);
                return;
            }
            class122.method915(arg0 + 2147483645, class287.field4747 - 1);
            return;
        }
    }
}
