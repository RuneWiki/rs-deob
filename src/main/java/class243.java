import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class243 implements class344 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Ljava/lang/String;")
    private String field3337;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field3339 = 1;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Z")
    private boolean field3336;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static final void method1595(int arg0) {
        class202.field2807++;
        field3341++;
        if (arg0 >= 61) {
            class13 var1 = class659.method3587(class68.field909, 98, class115.field1515);
            var1.field130.method1541(374, class515.field6574);
            class116.method679(var1, 0);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class243(String arg0) {
        this.field3337 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(JJ)J")
    public static long method1596(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static final void method1597(int arg0) {
        field3343++;
        class425.method2448(false);
        int var1 = class485.field6252.field6927.method1821(false);
        if (var1 == 2) {
            class585.method3131(class463.field6021, 100, arg0 ^ 0xFFFFFFFD, class372.field4550, 100, class576.field7320);
        } else if (var1 == 3) {
            class669.method3624(2, class784.field10742, 2, class576.field7320, (byte) -109, class372.field4550, class611.field7717, class463.field6021);
        }
        if (arg0 != 2) {
            field3339 = 7;
        }
        if (class485.field6252.field6927.method1820((byte) -69)) {
            class249.method1622(class678.field8763, false);
        }
        if (class576.field7320 != null) {
            class259.method1653((byte) -102);
        }
        class653.field8360 = class485.field6252.field6927.method1821(false) != 0;
        class602.field7657 = class485.field6252.field6927.method1820((byte) -110);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)Z")
    public final boolean method1598(byte arg0) {
        field3340++;
        int var2 = -46 / ((arg0 + 19) / 55);
        return this.field3336;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
    public final int method256(boolean arg0) {
        field3338++;
        int var2 = class104.method605(this.field3337, (byte) -106);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        }
        if (arg0) {
            this.method256(false);
        }
        this.field3336 = true;
        return 100;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)Ldca;")
    public final class571 method254(byte arg0) {
        field3344++;
        int var2 = -127 % ((48 - arg0) / 51);
        return class571.field7222;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIIIIILid;)Z")
    public static final boolean method1599(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6) {
        field3342++;
        if (!class750.field10229 || !class141.field1854) {
            return false;
        } else if (class430.field5647 < 100) {
            return false;
        } else if (arg2 != arg5 || arg1 != arg3) {
            for (int var7 = arg5; var7 <= arg2; var7++) {
                for (int var8 = arg3; var8 <= arg1; var8++) {
                    if (class86.field1201[arg4][var7][var8] == (-class237.field3233)) {
                        return false;
                    }
                }
            }
            if (arg0 != 39) {
                method1597(-112);
            }
            if (class295.method1768(4, arg6)) {
                class6.field64++;
                return true;
            } else {
                return false;
            }
        } else if (!class334.method1928(arg4, (byte) -84, arg5, arg3)) {
            return false;
        } else if (class295.method1768(4, arg6)) {
            class6.field64++;
            return true;
        } else {
            return false;
        }
    }
}
