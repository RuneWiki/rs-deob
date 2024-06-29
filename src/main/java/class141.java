import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class141 {

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lie;")
    public static class61 field3505 = new class61();

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "[I")
    public static int[] field3509 = new int[5];

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "[B")
    public static byte[] field3514 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Lkd;")
    private static class73 field3516 = class126.method1070((byte) -66, "Trade)4compete");

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lkd;")
    public static class73 field3519 = class126.method1070((byte) -66, "Duell akzeptieren");

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "[Loe;")
    public static class102[] field3511 = new class102[16];

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Lkd;")
    public static class73 field3521 = class126.method1070((byte) -66, "Untersuchen");

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Z")
    public static boolean field3515 = false;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field3523 = 3;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "Lkd;")
    private static class73 field3524 = class126.method1070((byte) -66, "Members object");

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "Lkd;")
    public static class73 field3510 = field3516;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lkd;")
    public static class73 field3520 = class126.method1070((byte) -66, "scrollbar");

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "Lkd;")
    public static class73 field3525 = field3524;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "J")
    public long field3522;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lua;")
    public static class137 field3512;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lue;")
    public class141 field3506;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lue;")
    public class141 field3517;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "[I")
    public static int[] field3513;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lpe;BI[B)V")
    public static final void method1146(class109 arg0, byte arg1, int arg2, byte[] arg3) {
        class3 var4 = new class3();
        var4.field158 = arg0;
        var4.field166 = arg3;
        field3500++;
        if (arg1 != 43) {
            return;
        }
        var4.field3522 = arg2;
        var4.field162 = 0;
        class61 var5 = class1.field67;
        synchronized (class1.field67) {
            class1.field67.method519(var4, 13017);
        }
        class72.method598((byte) 13);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public final void method1147(byte arg0) {
        field3504++;
        if (arg0 > -24) {
            method1148(-87, false, false);
        }
        if (this.field3517 != null) {
            this.field3517.field3506 = this.field3506;
            this.field3506.field3517 = this.field3517;
            this.field3517 = null;
            this.field3506 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZZ)Lkd;")
    public static final class73 method1148(int arg0, boolean arg1, boolean arg2) {
        field3502++;
        if (!arg1) {
            method1153(86L, false);
        }
        return class87.method723(10, arg0, 10, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)V")
    public static void method1149(boolean arg0) {
        field3505 = null;
        field3524 = null;
        field3525 = null;
        field3512 = null;
        field3519 = null;
        field3510 = null;
        field3509 = null;
        field3521 = null;
        if (arg0) {
            method1151(-91, -116);
        }
        field3513 = null;
        field3511 = null;
        field3520 = null;
        field3516 = null;
        field3514 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lq;B)V")
    public static final void method1150(class111 arg0, byte arg1) {
        class118.field3007 = arg0;
        field3501++;
        int var2 = -116 % ((86 - arg1) / 36);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Ldf;")
    public static final class28 method1151(int arg0, int arg1) {
        field3507++;
        class28 var2 = (class28) class30.field849.method538(arg1 - 3920, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class89.field2227.method898((byte) -84, arg0, 9);
        class28 var4 = new class28();
        if (arg1 != 3920) {
            field3521 = null;
        }
        var4.field790 = arg0;
        if (var3 != null) {
            var4.method219(new class114(var3), true);
        }
        var4.method221(0);
        class30.field849.method542(var4, arg1 ^ 0xFFFFF32B, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)Z")
    public final boolean method1152(byte arg0) {
        field3518++;
        if (arg0 == -40) {
            return this.field3517 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JZ)V")
    public static final void method1153(long arg0, boolean arg1) {
        field3508++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1) {
            method1149(true);
        }
        for (int var3 = 0; var3 < class126.field3231; var3++) {
            if (class102.field2558[var3] == arg0) {
                class24.field690++;
                class38.field1028 = true;
                class126.field3231--;
                for (int var4 = var3; var4 < class126.field3231; var4++) {
                    class102.field2558[var4] = class102.field2558[var4 + 1];
                }
                class121.field3079.method1215(-104, 197);
                class121.field3079.method967(true, arg0);
                return;
            }
        }
    }
}
