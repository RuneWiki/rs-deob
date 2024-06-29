import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class618 extends class614 {

    @OriginalMember(owner = "client!aaa", name = "B", descriptor = "Lhg;")
    public static class693 field8525 = new class693(17, 2);

    @OriginalMember(owner = "client!aaa", name = "D", descriptor = "Lpw;")
    public static class708 field8527 = new class708(16);

    @OriginalMember(owner = "client!aaa", name = "E", descriptor = "Lkg;")
    public static class275 field8528 = new class275(37, -2);

    @OriginalMember(owner = "client!aaa", name = "F", descriptor = "Ljava/lang/String;")
    public static String field8529 = null;

    @OriginalMember(owner = "client!aaa", name = "G", descriptor = "I")
    public static int field8530 = 0;

    @OriginalMember(owner = "client!aaa", name = "q", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!aaa", name = "r", descriptor = "I")
    public int field8515;

    @OriginalMember(owner = "client!aaa", name = "t", descriptor = "I")
    public int field8517;

    @OriginalMember(owner = "client!aaa", name = "u", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!aaa", name = "v", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!aaa", name = "w", descriptor = "I")
    public int field8520;

    @OriginalMember(owner = "client!aaa", name = "x", descriptor = "I")
    public int field8521;

    @OriginalMember(owner = "client!aaa", name = "y", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
    public static int field8524;

    @OriginalMember(owner = "client!aaa", name = "C", descriptor = "I")
    public static int field8526;

    @OriginalMember(owner = "client!aaa", name = "s", descriptor = "J")
    public long field8516;

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)I")
    public final int method1424(int arg0) {
        field8518++;
        if (arg0 < 8) {
            method3452((byte) -14, 20, true);
        }
        return this.field8517;
    }

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
    public final int method1426(int arg0) {
        field8526++;
        if (arg0 != 1600925004) {
            field8529 = null;
        }
        return this.field8521;
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(B)I")
    public final int method1425(byte arg0) {
        field8523++;
        int var2 = -102 / ((66 - arg0) / 58);
        return this.field8520;
    }

    @OriginalMember(owner = "client!aaa", name = "f", descriptor = "(B)V")
    public static void method3451(byte arg0) {
        field8529 = null;
        field8528 = null;
        if (arg0 >= -102) {
            method3451((byte) -68);
        }
        field8525 = null;
        field8527 = null;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BIZ)V")
    public static final void method3452(byte arg0, int arg1, boolean arg2) {
        if (arg0 != 126) {
            method3451((byte) 27);
        }
        if (arg2) {
            class589 var3 = class514.method2994(-29488, class760.field10605, class75.field1063);
            var3.field8251.method2620(arg1, false);
            class737.method4107(var3, arg0 - 119);
        } else {
            class188.method1273(class685.field9543, arg1, -1);
        }
        field8524++;
    }

    @OriginalMember(owner = "client!aaa", name = "e", descriptor = "(I)I")
    public final int method1428(int arg0) {
        if (arg0 != 1212) {
            this.field8515 = 68;
        }
        field8514++;
        return this.field8515;
    }

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)J")
    public final long method1427(int arg0) {
        if (arg0 == 32) {
            field8522++;
            return this.field8516;
        } else {
            return -100L;
        }
    }
}
