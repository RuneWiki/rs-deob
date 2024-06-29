import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class108 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[[I")
    public static int[][] field1597 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    public static int[] field1598 = new int[13];

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public static int[] field1603 = new int[64];

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lbe;")
    public static class25 field1600;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lqj;")
    public static class296 field1595;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[I")
    public static int[] field1599;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILqj;ZLqj;)V")
    public static final void method728(int arg0, class296 arg1, boolean arg2, class296 arg3) {
        if (arg0 == 0) {
            class84.field1285 = arg1;
            class364.field5105 = arg2;
            class366.field5129 = arg3;
            field1601++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZLqj;III)V")
    public static final void method729(boolean arg0, boolean arg1, class296 arg2, int arg3, int arg4, int arg5) {
        field1596++;
        class155.field2186 = arg4;
        class410.field5952 = arg1;
        if (arg0) {
            method729(false, true, (class296) null, 108, 91, 65);
        }
        class2.field28 = arg5;
        class227.field3031 = 10000;
        class395.field5780 = arg3;
        class399.field5832 = 1;
        class202.field2761 = arg2;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILke;)V")
    public static final void method730(int arg0, class354 arg1) {
        if (arg0 != 0) {
            method731(121);
        }
        field1602++;
        class398 var2 = (class398) class307.field4212.method1412((byte) -54, (long) arg1.field862);
        if (var2 == null) {
            return;
        }
        if (var2.field5799 != null) {
            class252.field3467.method852(var2.field5799);
            var2.field5799 = null;
        }
        var2.method2459(198);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method731(int arg0) {
        field1599 = null;
        field1598 = null;
        if (arg0 == 4) {
            field1595 = null;
            field1597 = null;
            field1603 = null;
            field1600 = null;
        }
    }
}
