import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class129 extends class137 {

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "I")
    public int field2503;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lhh;")
    public static class163 field2507 = class137.method1065("(U0a )2 via: ", 17);

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lhh;")
    public static class163 field2511 = class137.method1065("<col=ff0000>", 17);

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field2513 = -1;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field2515 = 0;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2514;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(B)V")
    public static final void method1023(byte arg0) {
        field2502++;
        if (!class168.field3082) {
            return;
        }
        class168.field3082 = false;
        if (arg0 >= 76) {
            class119.field2248 = null;
            class161.field2954 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static final void method1024(boolean arg0) {
        if (arg0) {
            method1028(17);
        }
        class193.field3522.method111((byte) -52);
        field2505++;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III[B)Lhh;")
    public static final class163 method1025(int arg0, int arg1, int arg2, byte[] arg3) {
        field2504++;
        class163 var4 = new class163();
        var4.field2990 = 0;
        if (arg1 < 67) {
            method1025(54, 70, 5, (byte[]) null);
        }
        var4.field3020 = new byte[arg0];
        for (int var5 = arg2; var5 < (arg0 + arg2); var5++) {
            if (arg3[var5] != 0) {
                var4.field3020[var4.field2990++] = arg3[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class129() {
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(JB)Lhh;")
    public static final class163 method1026(long arg0, byte arg1) {
        field2501++;
        int var3 = 102 / ((arg1 + 50) / 55);
        return class139.method1074(57, arg0, 10, false);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)Z")
    public static final boolean method1027(int arg0, byte arg1) {
        if (arg1 != 52) {
            method1027(-27, (byte) 18);
        }
        field2512++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(I)V")
    public class129(int arg0) {
        this.field2503 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
    public static void method1028(int arg0) {
        if (arg0 == 156) {
            field2511 = null;
            field2507 = null;
            field2514 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(I)V")
    public static final void method1029(int arg0) {
        field2510++;
        class250 var1 = (class250) class143.field2708.method1017(arg0 ^ 0xFFFFFFA9);
        if (arg0 != -1) {
            return;
        }
        while (var1 != null) {
            if (var1.field4401 == -1) {
                var1.field4387 = 0;
                class115.method915(var1, (byte) 29);
            } else {
                var1.method1063(95);
            }
            var1 = (class250) class143.field2708.method1016((byte) -31);
        }
    }
}
