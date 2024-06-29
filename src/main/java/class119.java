import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class119 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    public static int[] field1632 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[S")
    public static short[] field1633 = new short[] { 58, 10, 4, 21, 16, 18, 22, 30 };

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "F")
    public static float field1630;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lin;")
    public static class262 field1631;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)I")
    public static final int method752(int arg0, int arg1, int arg2) {
        field1628++;
        if (arg2 == 4 || arg2 == 5) {
            return class256.field4147[arg0 & 0x3];
        } else if (arg1 == 256) {
            return 256;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1631 = null;
        field1632 = null;
        if (arg0 < 28) {
            field1630 = -0.5705228F;
        }
        field1633 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZII)I")
    public static final int method754(boolean arg0, int arg1, int arg2) {
        field1634++;
        int var3 = class438.method2783(arg1 - 1, arg2 + -1, false) + (class438.method2783(arg1 - 1, arg2 + 1, arg0) - (-class438.method2783(arg1 + 1, arg2 + -1, arg0) - class438.method2783(arg1 + 1, arg2 + 1, arg0)));
        int var4 = class438.method2783(arg1, arg2 - 1, arg0) + class438.method2783(arg1, arg2 + 1, false) + class438.method2783(arg1 - 1, arg2, false) + class438.method2783(arg1 + 1, arg2, false);
        int var5 = class438.method2783(arg1, arg2, false);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)[Llm;")
    public static final class31[] method755(int arg0) {
        field1629++;
        if (arg0 > -66) {
            field1633 = null;
        }
        return new class31[] { class335.field5241, class116.field1618, class154.field2057, class523.field7738, class517.field7676, class177.field2583, class165.field2413, class52.field703, class289.field4569, class409.field6203, class336.field5247, class289.field4567, class536.field7843, class162.field2355, class403.field6073 };
    }
}
