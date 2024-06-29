import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class499 {

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field6558 = 0;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "Z")
    public static boolean field6560 = false;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field6555;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "Lufa;")
    public static class140 field6559;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Lre;")
    public static class292 field6561;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "[Lxa;")
    public static class511[] field6554;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 7)
    public static void method2701(int arg0) {
        field6559 = null;
        if (arg0 != 0) {
            field6559 = null;
        }
        field6554 = null;
        field6561 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)I", line = 19)
    public static final int method2702(boolean arg0) {
        field6557++;
        if (!arg0) {
            field6558 = -31;
        }
        return class412.field5313.method755((byte) 107);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)I", line = 45)
    public static final int method2703(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field6559 = null;
        }
        field6556++;
        return arg1 == 4 || arg1 == 5 ? class592.field8018[arg0 & 0x3] : 256;
    }
}
