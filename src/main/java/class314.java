import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class314 extends class164 {

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public int field4129 = 0;

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "[J")
    public static long[] field4123 = new long[32];

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "[[I")
    public static int[][] field4127 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Loea;")
    public static class552 field4125 = new class552(16);

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLun;)V")
    public final void method1835(byte arg0, class389 arg1) {
        if (arg0 <= 113) {
            method1836(null, false);
        }
        field4128++;
        while (true) {
            int var3 = arg1.method2229(255);
            if (var3 == 0) {
                return;
            }
            this.method1838(var3, arg1, (byte) -44);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ln;Z)V")
    public static final void method1836(class17 arg0, boolean arg1) {
        if (class353.field4716 == arg0.field353) {
            class89.field1253[arg0.field406] = true;
        }
        field4124++;
        if (arg1) {
            field4123 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1837(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4123 = null;
        }
        field4131++;
        return (arg1 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILun;B)V")
    private final void method1838(int arg0, class389 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field4129 = arg1.method2260(-81);
        }
        field4130++;
        if (arg2 >= -7) {
            field4125 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1839(byte arg0) {
        field4127 = null;
        field4123 = null;
        if (arg0 != -8) {
            method1839((byte) -57);
        }
        field4125 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ln;I)V")
    public static final void method1840(class17 arg0, int arg1) {
        field4126++;
        if (arg1 > -114) {
            field4125 = null;
        }
        class17 var2 = class532.method3129(arg0, 3450);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class300.field4038;
            var4 = class467.field6533;
        } else {
            var3 = var2.field402;
            var4 = var2.field414;
        }
        class626.method3599((byte) -69, var3, var4, false, arg0);
        class160.method1015(var4, var3, -244, arg0);
    }
}
