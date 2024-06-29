import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class35 extends class71 {

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "[B")
    public byte[] field461;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "[I")
    public static int[] field465 = new int[32];

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "[J")
    public static long[] field462 = new long[100];

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    public static int field471 = 0;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
    public static int field459 = 0;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[I")
    public static int[] field466 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "Lnb;")
    public static class330 field467 = new class330();

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "Ltl;")
    public static class222 field474 = new class222(64);

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "F")
    public static float field470;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "Lkb;")
    public static class39 field469;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "Lmf;")
    public static class53 field463;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBILkb;)[Lag;", line = 19)
    public static final class123[] method226(int arg0, byte arg1, int arg2, class39 arg3) {
        field468++;
        int var4 = -10 % ((9 - arg1) / 35);
        return class288.method2026(arg2, arg0, arg3, -112) ? class81.method597((byte) -70) : null;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 37)
    public static void method227(int arg0) {
        field467 = null;
        field463 = null;
        field466 = null;
        field469 = null;
        field465 = null;
        field474 = null;
        field462 = null;
        if (arg0 != -15225) {
            method227(106);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "([B)V", line = 64)
    public class35(byte[] arg0) {
        this.field461 = arg0;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(II)I", line = 74)
    public static int method228(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
