import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class71 extends class226 {

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "Llc;")
    public static class143 field1349 = class66.method374("<br>(X", -1);

    @OriginalMember(owner = "client!th", name = "o", descriptor = "Z")
    public static boolean field1346 = false;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
    public static boolean field1351 = false;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "[I")
    public static int[] field1343 = new int[1000];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lka;")
    public static class164 field1347;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lvi;")
    public static class5 field1352;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lgf;")
    public static class7 field1344;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "[Lek;")
    public static class160[] field1348;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgf;ILgf;)V")
    public static final void method410(class7 arg0, int arg1, class7 arg2) {
        field1350++;
        class206.field3749 = arg0;
        if (arg1 != -12606) {
            field1347 = null;
        }
        class217.field3972 = arg2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIII)I")
    public static final int method411(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 26298) {
            field1344 = null;
        }
        field1345++;
        if ((class231.field4225[arg3][arg2][arg1] & 0x8) == 0) {
            return arg3 <= 0 || (class231.field4225[1][arg2][arg1] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method412(byte arg0) {
        field1349 = null;
        field1344 = null;
        int var1 = -101 / ((arg0 + 3) / 39);
        field1347 = null;
        field1348 = null;
        field1343 = null;
        field1352 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILlc;)V")
    public static final void method413(int arg0, class143 arg1) {
        class164.method1086(false, (byte) 82);
        field1353++;
        if (arg0 != 0) {
            field1344 = null;
        }
        class145.method927(89, arg1);
    }
}
