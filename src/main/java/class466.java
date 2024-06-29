import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class466 extends class338 {

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field6537 = 0;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lcs;")
    public static class351 field6536 = new class351(66, 7);

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field6541 = 0;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "F")
    public static float field6543;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lfc;")
    public static class343 field6540;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
    public static void method2745(byte arg0) {
        if (arg0 >= -64) {
            method2747((byte) -106, 81);
        }
        field6540 = null;
        field6536 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfc;Lfc;BLkp;)V")
    public static final void method2746(class343 arg0, class343 arg1, byte arg2, class190 arg3) {
        if (arg2 != 31) {
            method2747((byte) 94, 107);
        }
        class285.field3904 = arg0;
        field6539++;
        class37.field641 = arg3;
        class353.field4923 = arg1;
        if (class353.field4923 != null) {
            class123.field1704 = class353.field4923.method2054(0, 1);
        }
        if (class285.field3904 != null) {
            class407.field5644 = class285.field3904.method2054(0, 1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)I")
    public static final int method2747(byte arg0, int arg1) {
        field6538++;
        if (arg0 != -73) {
            field6537 = -77;
        }
        return arg1 >>> 7;
    }
}
