import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class29 {

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "Z")
    public static boolean field472 = true;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
    public static boolean field467 = true;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Z")
    public static boolean field475 = false;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lrn;")
    public static class18 field471;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V", line = 4)
    public static void method329(boolean arg0) {
        field471 = null;
        if (arg0) {
            method331(-50, (byte) -65);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 15)
    public static final void method330(int arg0) {
        class62.field957 = null;
        if (arg0 != -1) {
            method332((byte) -111, 57, 79);
        }
        class38.field582 = null;
        class358.field5694 = null;
        class89.field1262 = null;
        class150.field2449 = null;
        field469++;
        class172.field2732 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Ldm;", line = 39)
    public static final class140 method331(int arg0, byte arg1) {
        field474++;
        class140 var2 = (class140) class316.field4871.method1386(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1 == 3) {
            byte[] var3 = class59.field924.method187(11, arg0, -1);
            class140 var4 = new class140();
            if (var3 != null) {
                var4.method1174(new class25(var3), false);
            }
            class316.field4871.method1385(var4, (byte) -30, (long) arg0);
            return var4;
        } else {
            return (class140) null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)I", line = 67)
    public static final int method332(byte arg0, int arg1, int arg2) {
        field473++;
        int var3 = class3.method20(arg0 ^ 0xFFFFC428, arg2 - 1, arg1 + -1) + class3.method20(-15338, arg2 - 1, arg1 + 1) + (class3.method20(arg0 + -15400, arg2 + 1, arg1 + -1) - -class3.method20(arg0 ^ 0xFFFFC428, arg2 + 1, arg1 + 1));
        if (arg0 == 62) {
            int var4 = class3.method20(-15338, arg2, arg1 - 1) + class3.method20(arg0 - 15400, arg2, arg1 + 1) + class3.method20(-15338, arg2 + -1, arg1) + class3.method20(-15338, arg2 + 1, arg1);
            int var5 = class3.method20(arg0 ^ 0xFFFFC428, arg2, arg1);
            return var5 / 4 + (var3 / 16 + (var4 / 8));
        } else {
            return -59;
        }
    }
}
