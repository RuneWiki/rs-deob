import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public abstract class class63 {

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1421 = 0;

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lv;")
    private static class146 field1422 = class159.method1226((byte) -37, " more options");

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lv;")
    private static class146 field1418 = class159.method1226((byte) -37, "cyan:");

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "Lv;")
    public static class146 field1425 = field1418;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "[Lv;")
    public static class146[] field1423 = new class146[200];

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "Lv;")
    public static class146 field1424 = field1422;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "Lv;")
    private static class146 field1428 = class159.method1226((byte) -37, "purple:");

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lv;")
    public static class146 field1427 = field1428;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lv;")
    public static class146 field1431 = field1418;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "Lv;")
    public static class146 field1417 = field1428;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)[B")
    public abstract byte[] method456(byte arg0);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lla;ILla;)V")
    public static final void method457(class77 arg0, int arg1, class77 arg2) {
        field1419++;
        if (arg1 != 1) {
            method459((byte) -2);
        }
        class134.field3055 = arg2;
        class58.field1302 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([BI)V")
    public abstract void method458(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
    public static void method459(byte arg0) {
        field1424 = null;
        if (arg0 <= 85) {
            return;
        }
        field1417 = null;
        field1425 = null;
        field1418 = null;
        field1427 = null;
        field1428 = null;
        field1422 = null;
        field1431 = null;
        field1423 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)I")
    public static final int method460(int arg0, int arg1, int arg2) {
        field1426++;
        if (arg2 > -54) {
            return -49;
        } else if (arg0 >= 2) {
            int var3 = method460(arg0 >> 1, arg1 * arg1, -120);
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            return var3;
        } else if (arg0 == 1) {
            return arg1;
        } else {
            return 1;
        }
    }
}
