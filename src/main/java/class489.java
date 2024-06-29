import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class489 extends class89 {

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "[B")
    public byte[] field7115;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljk;")
    public static class449 field7110 = new class449(4);

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field7114 = 0;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field7112;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field7113;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IILbf;)V", line = 3)
    public static final void method2964(int arg0, int arg1, class375 arg2) {
        field7111++;
        int var3 = -1;
        int var4 = arg1;
        if (arg2.field4844 > class163.field2065) {
            class199.method1254(97, arg2);
        } else if (class163.field2065 <= arg2.field4842) {
            class233.method1411(arg1 + 128, arg2);
        } else {
            class384.method2173(false, arg2, true);
            var4 = class50.field659;
            var3 = class55.field716;
        }
        if (arg2.field2666 < 128 || arg2.field2677 < 128 || arg2.field2666 >= (class452.field6526 * 128 - 128) || arg2.field2677 >= (class440.field6307 * 128 - 128)) {
            var3 = -1;
            arg2.field4842 = 0;
            arg2.field4844 = 0;
            arg2.field4859 = -1;
            arg2.field4906 = -1;
            var4 = 0;
            arg2.field4886 = -1;
            arg2.field2666 = arg2.field4944[0] * 128 + arg2.method1366((byte) -102) * 64;
            arg2.field2677 = arg2.field4936[0] * 128 + arg2.method1366((byte) -100) * 64;
            arg2.method2122((byte) 29);
        }
        if (class23.field336 == arg2 && (arg2.field2666 < 1536 || arg2.field2677 < 1536 || arg2.field2666 >= ((class452.field6526 - 12) * 128) || arg2.field2677 >= (class440.field6307 - 12) * 128)) {
            arg2.field4859 = -1;
            arg2.field4842 = 0;
            var4 = 0;
            arg2.field4906 = -1;
            var3 = -1;
            arg2.field4844 = 0;
            arg2.field4886 = -1;
            arg2.field2666 = arg2.field4944[0] * 128 + (arg2.method1366((byte) -100) * 64);
            arg2.field2677 = arg2.field4936[0] * 128 + arg2.method1366((byte) -95) * 64;
            arg2.method2122((byte) 29);
        }
        int var5 = class530.method3146(arg2, true);
        class209.method1298(-6145, arg2, var5, var4, var3);
        class108.method793(23202, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2965(int arg0, int arg1) {
        field7113++;
        class449 var2 = class161.field2047;
        synchronized (class161.field2047) {
            class161.field2047.method2648(false, arg1);
            int var3 = 47 / ((-arg0 - 70) / 46);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 85)
    public static final void method2966(byte arg0) {
        if (arg0 > -116) {
            field7114 = -93;
        }
        field7117++;
        class339.field4254.method2024(false);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 99)
    public static final void method2967(int arg0) {
        class2.field24 = arg0;
        field7116++;
        class201.field2616.method154(7491);
        class122.field1646 = false;
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(II)I", line = 112)
    public static int method2968(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([B)V", line = 118)
    public class489(byte[] arg0) {
        this.field7115 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(CI)Z", line = 128)
    public static final boolean method2969(char arg0, int arg1) {
        if (arg1 != -19880) {
            method2966((byte) 83);
        }
        field7112++;
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V", line = 139)
    public static void method2970(int arg0) {
        if (arg0 != 17301) {
            field7110 = null;
        }
        field7110 = null;
    }
}
