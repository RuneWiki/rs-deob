import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class626 extends class426 {

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "I")
    public static int field8981 = -1;

    @OriginalMember(owner = "client!lt", name = "t", descriptor = "Z")
    public static boolean field8987 = false;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "I")
    public static int field8982;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field8983;

    @OriginalMember(owner = "client!lt", name = "s", descriptor = "I")
    public static int field8986;

    @OriginalMember(owner = "client!lt", name = "u", descriptor = "I")
    public static int field8988;

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "Lub;")
    public class20 field8984;

    @OriginalMember(owner = "client!lt", name = "r", descriptor = "[Lmj;")
    public class605[] field8985;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lub;Z)V")
    public static final void method3598(class20 arg0, boolean arg1) {
        if (!class72.field1090) {
            class558.method3261(arg0, class8.field77);
        } else if (arg1) {
            class27.field609[class27.field609.length - 1].method535(false, arg0);
        } else {
            int var2 = class474.method2786(arg0.field534);
            int var3 = class66.field1023[2] * arg0.method172((byte) -117) / arg0.field536;
            int var4 = class474.method2786(arg0.field534 - var3);
            int var5 = class474.method2786(arg0.field534 + var3);
            if (var4 == var5) {
                class27.field609[var2].method535(false, arg0);
            } else if (var5 - var4 == 1) {
                class27.field609[class346.field4551 + var4].method535(false, arg0);
            } else {
                class27.field609[class27.field609.length - 1].method535(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(BIIZLn;)V")
    public static final void method3599(byte arg0, int arg1, int arg2, boolean arg3, class17 arg4) {
        if (arg0 != -69) {
            return;
        }
        field8983++;
        int var5 = arg4.field414;
        if (arg4.field420 == 0) {
            arg4.field414 = arg4.field367;
        } else if (arg4.field420 == 1) {
            arg4.field414 = arg2 - arg4.field367;
        } else if (arg4.field420 == 2) {
            arg4.field414 = arg4.field367 * arg2 >> 14;
        }
        int var6 = arg4.field402;
        if (arg4.field441 == 0) {
            arg4.field402 = arg4.field405;
        } else if (arg4.field441 == 1) {
            arg4.field402 = arg1 - arg4.field405;
        } else if (arg4.field441 == 2) {
            arg4.field402 = arg4.field405 * arg1 >> 14;
        }
        if (arg4.field420 == 4) {
            arg4.field414 = arg4.field402 * arg4.field334 / arg4.field371;
        }
        if (arg4.field441 == 4) {
            arg4.field402 = arg4.field414 * arg4.field371 / arg4.field334;
        }
        if (class679.field9734 && (client.method1659(arg4).field1929 != 0 || arg4.field379 == 0)) {
            if (arg4.field402 < 5 && arg4.field414 < 5) {
                arg4.field402 = 5;
                arg4.field414 = 5;
            } else {
                if (arg4.field402 <= 0) {
                    arg4.field402 = 5;
                }
                if (arg4.field414 <= 0) {
                    arg4.field414 = 5;
                }
            }
        }
        if (class182.field2225 == arg4.field346) {
            class504.field7030 = arg4;
        }
        if (arg3 && arg4.field333 != null && arg4.field414 != var5 || arg4.field402 != var6) {
            class143 var7 = new class143();
            var7.field1786 = arg4.field333;
            var7.field1789 = arg4;
            class397.field5620.method1129(var7, 262144);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ILn;)V")
    public static final void method3600(int arg0, class17 arg1) {
        field8986++;
        if (class287.field3877 == arg1.field346) {
            if (class206.field2472.field8801 == null) {
                arg1.field342 = 0;
                arg1.field447 = 0;
            } else {
                arg1.field408 = 150;
                arg1.field454 = (int) (Math.sin((double) class543.field7882 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field342 = class63.field1016;
                arg1.field433 = 5;
                arg1.field447 = class361.method2061(arg0 ^ 0x7FF, class206.field2472.field8801);
                arg1.field444 = class206.field2472.field2620;
                arg1.field382 = class206.field2472.field2634;
                arg1.field385 = 0;
                arg1.field415 = class206.field2472.field2608;
                class282 var2 = arg1.field382 == -1 ? null : class195.field2367.method3273(arg1.field382, 0);
                if (var2 != null) {
                    class32.method402(arg1.field444, -1830945624, var2);
                }
            }
        } else if (arg0 != 2047) {
            method3598(null, true);
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method3601(class165 arg0, int arg1, int arg2, int arg3) {
        field8988++;
        if (arg1 > -97) {
            this.field8984 = null;
        }
        if (this.field8985 != null) {
            for (int var5 = 0; var5 < this.field8985.length; var5++) {
                if (this.field8985[var5].method3482(arg3, arg2) && this.field8984.method166(arg0, arg3, arg2, -35)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3602(int arg0, int arg1, byte arg2) {
        int var3 = 44 / ((-arg2 - 34) / 46);
        field8982++;
        if (arg0 >= 0 && arg1 >= 0 && arg0 < class73.field1104[1].length && arg1 < class73.field1104[1][arg0].length) {
            return (class73.field1104[1][arg0][arg1] & 0x2) != 0;
        } else {
            return false;
        }
    }
}
