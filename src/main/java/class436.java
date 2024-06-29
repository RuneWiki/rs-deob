import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class436 {

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lmr;")
    public class127 field6248 = new class127();

    @OriginalMember(owner = "client!so", name = "g", descriptor = "[[Z")
    public static boolean[][] field6250 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field6247;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "[Ljq;")
    public static class475[] field6249;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "[Lte;")
    public static class568[] field6246;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method2609(int arg0) {
        field6246 = null;
        field6250 = null;
        if (arg0 != 1) {
            field6249 = null;
        }
        field6249 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
    public static final boolean method2610(int arg0, int arg1) {
        class697.field9869 = arg0 + 1 & 0xFFFF;
        field6244++;
        class163.field1997 = true;
        int var2 = 34 % ((-arg1 - 6) / 47);
        return true;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z")
    public static final boolean method2611(int arg0, int arg1, int arg2) {
        field6245++;
        if (arg2 != 65535) {
            field6249 = null;
        }
        return (class337.method1945(arg0, arg1, 0) | class7.method42(arg2 ^ 0xFFFF, arg1, arg0) | class664.method3754(arg0, 79, arg1)) & class27.method378(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static final void method2612(int arg0) {
        if (arg0 != 65535) {
            method2609(7);
        }
        class231.field3009.method2776(false);
        field6247++;
    }
}
