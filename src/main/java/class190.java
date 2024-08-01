import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("uf")
public abstract class class190 {

    @OriginalMember(owner = "uf", name = "g", descriptor = "I")
    public static int field3647 = 0;

    @OriginalMember(owner = "uf", name = "c", descriptor = "Llf;")
    private static class109 field3643 = class35.method275("You are standing in a members)2only area)3", 2);

    @OriginalMember(owner = "uf", name = "e", descriptor = "Llf;")
    public static class109 field3645 = field3643;

    @OriginalMember(owner = "uf", name = "b", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "uf", name = "d", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "uf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3646;

    @OriginalMember(owner = "uf", name = "a", descriptor = "[I")
    public static int[] field3641;

    @OriginalMember(owner = "uf", name = "a", descriptor = "(IIB)I")
    public abstract int method872(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "uf", name = "a", descriptor = "(I)V")
    public static void method1284(int arg0) {
        field3646 = null;
        field3645 = null;
        if (arg0 <= 19) {
            method1284(-125);
        }
        field3641 = null;
        field3643 = null;
    }

    @OriginalMember(owner = "uf", name = "b", descriptor = "(I)V")
    public abstract void method874(int arg0);

    @OriginalMember(owner = "uf", name = "a", descriptor = "(B)V")
    public static final void method1285(byte arg0) {
        if (class41.field872 != null) {
            class41.field872.method47(1);
        }
        if (class164.field3071 != null) {
            class164.field3071.method47(1);
        }
        if (arg0 <= 80) {
            method1286(-16, (byte) 73);
        }
        field3644++;
    }

    @OriginalMember(owner = "uf", name = "a", descriptor = "(IB)Ltd;")
    public static final class179 method1286(int arg0, byte arg1) {
        field3642++;
        class179 var2 = (class179) class194.field3701.method1086((long) arg0, -99);
        int var3 = -126 % ((arg1 + 4) / 35);
        if (var2 != null) {
            return var2;
        }
        class179 var4 = class187.method1269(arg0, false, class29.field625, class185.field3530, -9);
        if (var4 != null) {
            class194.field3701.method1082((long) arg0, 61, var4);
        }
        return var4;
    }
}
