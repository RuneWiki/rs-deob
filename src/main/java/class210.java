import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class210 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lbn;")
    public static class517 field3079 = new class517("WTQA", "office", "_qa", 2);

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
    public static boolean field3081 = true;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lgga;")
    public static class513 field3082;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 3)
    public static void method1452(int arg0) {
        if (arg0 != -7) {
            field3079 = null;
        }
        field3079 = null;
        field3082 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1453(int arg0, int arg1, int arg2) {
        field3078++;
        if (arg0 == -27842) {
            return (arg1 & 0xC580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lgga;B)V", line = 37)
    public static final void method1455(class513 arg0, byte arg1) {
        field3082 = arg0;
        field3080++;
        if (arg1 != 122) {
            method1453(21, -60, 6);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V", line = 48)
    public static final void method1456(int arg0, byte arg1) {
        class384.method2317(99);
        field3077++;
        int var2 = class4.field60.method3713((byte) -58, arg0).field8524;
        if (arg1 != 81) {
            method1456(-43, (byte) -10);
        }
        if (var2 == 0) {
            return;
        }
        int var3 = class578.field8328.field10770[arg0];
        if (var2 == 5) {
            class194.field2907 = var3;
        }
        if (var2 == 6) {
            class498.field6850 = var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)J")
    public abstract long method1454(byte arg0);
}
