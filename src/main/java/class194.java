import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class194 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "Luc;")
    public static class51 field2693 = new class51(64);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[[I")
    public static int[][] field2695 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static volatile int field2694 = -1;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static final void method1289(int arg0) {
        field2691++;
        if (arg0 != -3664) {
            method1290(49, 48);
        }
        if (class381.field5579 == 10) {
            class63.method558(28, true);
        }
        if (class381.field5579 == 30) {
            class63.method558(25, true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V")
    public static final void method1290(int arg0, int arg1) {
        class30.field497.method379(arg0, false);
        field2692++;
        class425.field6204.method379(arg0, false);
        if (arg1 != 23133) {
            method1292(116);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method1291(int arg0) {
        field2693 = null;
        field2695 = null;
        if (arg0 >= -103) {
            field2695 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static final void method1292(int arg0) {
        for (class138 var1 = (class138) class186.field2547.method1575(0); var1 != null; var1 = (class138) class186.field2547.method1573((byte) -128)) {
            if (class277.method1824(var1.field1777, -108)) {
                class41.method298((byte) -44, var1);
            }
        }
        if (arg0 <= 46) {
            field2693 = null;
        }
        field2690++;
        if (class402.field5874 == 1) {
            class165.field2244 = false;
            class435.method2723(class145.field1858, (byte) 126, class389.field5694, class341.field5066, class184.field2469);
            return;
        }
        class435.method2723(class145.field1858, (byte) -113, class389.field5694, class341.field5066, class184.field2469);
        int var2 = class233.field3232.method2695(-1, class337.field4983);
        for (class138 var3 = (class138) class186.field2547.method1575(0); var3 != null; var3 = (class138) class186.field2547.method1573((byte) -128)) {
            int var4 = class258.method1705((byte) -76, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class389.field5694 = var2 + 8;
        class145.field1858 = class402.field5874 * 16 + (class167.field2266 ? 26 : 22);
    }
}
