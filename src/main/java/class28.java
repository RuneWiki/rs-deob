import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class28 extends class19 {

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "[I")
    public static int[] field342 = new int[128];

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "Lk;")
    public static class21 field339 = class14.method92((byte) 57, "floorcol)3dat");

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "Lk;")
    private static class21 field344 = class14.method92((byte) 57, "Windmill");

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "Z")
    public static volatile boolean field343 = false;

    @OriginalMember(owner = "mapview!p", name = "r", descriptor = "I")
    public static int field346 = 1;

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Lga;")
    public static class14 field341 = new class14();

    @OriginalMember(owner = "mapview!p", name = "s", descriptor = "[J")
    public static long[] field347 = new long[32];

    @OriginalMember(owner = "mapview!p", name = "u", descriptor = "J")
    public static long field349 = 0L;

    @OriginalMember(owner = "mapview!p", name = "w", descriptor = "Lk;")
    public static class21 field351 = class14.method92((byte) 57, " map");

    @OriginalMember(owner = "mapview!p", name = "x", descriptor = "Lk;")
    private static class21 field352 = class14.method92((byte) 57, "Magic Shop");

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "Lk;")
    public class21 field340;

    @OriginalMember(owner = "mapview!p", name = "v", descriptor = "Lr;")
    public static class30 field350;

    @OriginalMember(owner = "mapview!p", name = "t", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field348;

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "[[B")
    public static byte[][] field338;

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 40)
    public static void method176(int arg0) {
        field338 = null;
        field350 = null;
        field339 = null;
        field342 = null;
        field351 = null;
        if (arg0 != 0) {
            return;
        }
        field348 = null;
        field352 = null;
        field341 = null;
        field347 = null;
        field344 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lh;", line = 73)
    public static final class15 method177(Throwable arg0, String arg1) {
        class15 var2;
        if (arg0 instanceof class15) {
            var2 = (class15) arg0;
            var2.field197 = var2.field197 + ' ' + arg1;
        } else {
            var2 = new class15(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "(I)[Lk;", line = 94)
    public static final class21[] method178(int arg0) {
        if (arg0 != 0) {
            field338 = null;
        }
        return new class21[] { class19.field244, class17.field213, field352, class3.field80, class33.field395, class17.field214, class27.field337, class3.field82, class11.field167, class32.field376, class21.field264, class2.field77, class29.field360, class25.field314, class12.field176, class21.field260, class15.field198, class29.field359, class24.field299, class14.field191, class30.field368, class11.field168, class12.field177, class33.field391, class30.field367, class3.field87, class10.field161, class22.field269, class21.field254, class24.field295, class25.field315, class33.field394, class32.field381, class21.field255, class23.field283, class24.field296, mapview.field13, class11.field171, class22.field274, class22.field275, class30.field372, class17.field212, class26.field330, field344, class24.field288, class27.field335, class23.field286, class10.field155, class12.field179, class30.field364, class24.field289, class19.field237, class23.field279, class25.field306, class19.field243, class6.field126, class2.field78, class25.field310, class30.field365, class12.field175, class24.field292, class29.field357, class6.field123, class6.field123, class6.field123, class6.field123, class6.field123, class32.field384, class22.field268, class25.field302 };
    }
}
