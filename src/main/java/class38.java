import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 extends class41 {

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "[I")
    public static int[] field557 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!uja", name = "r", descriptor = "Z")
    public static boolean field559 = false;

    @OriginalMember(owner = "client!uja", name = "s", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "Ljava/lang/String;")
    private String field558;

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "(B)V")
    public static void method328(byte arg0) {
        int var1 = -2 / ((22 - arg0) / 46);
        field557 = null;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILes;)V")
    public final void method329(int arg0, class403 arg1) {
        this.field558 = arg1.method2384(arg0 ^ 0x16BC);
        if (arg0 != -3999) {
            this.method331(null, -55);
        }
        field560++;
        arg1.method2381((byte) 77);
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)Let;")
    public static final class621 method330(int arg0, int arg1, int arg2) {
        class727 var3 = class107.field1351[arg0][arg1][arg2];
        return var3 == null ? null : var3.field10187;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Loga;I)V")
    public final void method331(class500 arg0, int arg1) {
        field562++;
        if (arg1 != 55) {
            field557 = null;
        }
        arg0.field6980 = this.field558;
    }
}
