import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class107 extends class376 {

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1589 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1585 = "flash1:";

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static int field1586 = 0;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "F")
    public float field1594;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V", line = 9)
    public static final void method724(int arg0) {
        class229.field3058 = class344.method2208(arg0, 8, 35, 2048, 4, 0.4F, arg0 ^ 0xFFFFE6B2, true);
        field1590++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 30)
    public static final void method725(int arg0, int arg1) {
        class190 var2 = class395.field5776;
        synchronized (class395.field5776) {
            if (arg1 < 76) {
                return;
            }
            class395.field5776.method1254(arg0, 120);
        }
        field1592++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 46)
    public static void method726(boolean arg0) {
        field1585 = null;
        field1589 = null;
        if (!arg0) {
            field1585 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII)I", line = 57)
    public static final int method727(byte arg0, int arg1, int arg2) {
        field1593++;
        if (arg0 <= 93) {
            method727((byte) -60, -128, 123);
        }
        return arg1 == 1 || arg1 == 3 ? class33.field515[arg2 & 0x3] : class289.field3999[arg2 & 0x3];
    }
}
