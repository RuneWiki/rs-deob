import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class32 extends class28 {

    @OriginalMember(owner = "client!cj", name = "H", descriptor = "Le;")
    public class44 field692;

    @OriginalMember(owner = "client!cj", name = "G", descriptor = "Lqe;")
    private static class179 field691 = class206.method1380("Username: ", (byte) 83);

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "Lqe;")
    public static class179 field688 = class206.method1380("Weiter", (byte) -127);

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "Lqe;")
    private static class179 field685 = class206.method1380("Loading )2 please wait)3", (byte) -128);

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "Lqe;")
    public static class179 field681 = field691;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "Lqe;")
    public static class179 field683 = field685;

    @OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
    public static int field693 = 1;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "Lqe;")
    public static class179 field690;

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "Leh;")
    public static class52 field689;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "[[[I")
    public static int[][][] field687;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lae;I)Z")
    public static final boolean method204(class6 arg0, int arg1) {
        field684++;
        if (arg1 >= -42) {
            return false;
        }
        if (class69.field1378) {
            if (class159.method1026(arg0, -1493540320) != 0) {
                return false;
            }
            if (arg0.field128 == 0) {
                return false;
            }
        }
        return arg0.field226;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(B)V")
    public static void method205(byte arg0) {
        field688 = null;
        field689 = null;
        field691 = null;
        field690 = null;
        field687 = null;
        field685 = null;
        if (arg0 < 91) {
            field681 = null;
        }
        field681 = null;
        field683 = null;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Le;)V")
    public class32(class44 arg0) {
        this.field692 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIILrb;Lrb;IIIIJ)V")
    public static final void method206(int arg0, int arg1, int arg2, int arg3, class186 arg4, class186 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class169 var12 = new class169();
        var12.field3049 = arg10;
        var12.field3041 = arg1 * 128 + 64;
        var12.field3044 = arg2 * 128 + 64;
        var12.field3047 = arg3;
        var12.field3051 = arg4;
        var12.field3038 = arg5;
        var12.field3042 = arg6;
        var12.field3040 = arg7;
        var12.field3046 = arg8;
        var12.field3039 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class229.field4232[var13][arg1][arg2] == null) {
                class229.field4232[var13][arg1][arg2] = new class197(var13, arg1, arg2);
            }
        }
        class229.field4232[arg0][arg1][arg2].field3678 = var12;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)I")
    public static final int method207(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        if (arg1 == -3517) {
            field686++;
            return class73.field1439 != null && class73.field1439.field1694 == var3 ? class192.field3576.field3432 * 99 / (class192.field3576.field3397.length - class73.field1439.field2190) + 1 : 0;
        } else {
            return -93;
        }
    }
}
