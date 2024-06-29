import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class315 extends class25 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "Lcd;")
    public class64 field5342;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "J")
    public static long field5329 = 0L;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "[[I")
    public static int[][] field5330 = new int[104][104];

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "Lcd;")
    private static class64 field5333 = class44.method335((byte) 71, "cyan:");

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "Lcd;")
    public static class64 field5331 = class44.method335((byte) 71, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "[Z")
    public static boolean[] field5332 = new boolean[5];

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Lcd;")
    public static class64 field5338 = class44.method335((byte) 71, "<col=ffb000>");

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Lcd;")
    public static class64 field5339 = field5333;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "Lcd;")
    public static class64 field5340 = class44.method335((byte) 71, "leuchten1:");

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "[I")
    public static int[] field5341 = new int[5];

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "Lcd;")
    private static class64 field5337 = class44.method335((byte) 71, " from your friend list first)3");

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "Lcd;")
    public static class64 field5345 = class44.method335((byte) 71, "blinken3:");

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "Lcd;")
    public static class64 field5335 = field5333;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Lcd;")
    public static class64 field5347 = class44.method335((byte) 71, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "Lcd;")
    public static class64 field5346 = field5337;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lcd;")
    public static class64 field5343 = class44.method335((byte) 71, "b12_full");

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "[S")
    public static short[] field5344 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "Lej;")
    public static class149 field5334;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 21)
    public static void method2177(byte arg0) {
        field5335 = null;
        field5338 = null;
        field5337 = null;
        field5339 = null;
        field5341 = null;
        if (arg0 != 68) {
            field5338 = (class64) null;
        }
        field5344 = null;
        field5345 = null;
        field5346 = null;
        field5333 = null;
        field5330 = (int[][]) null;
        field5331 = null;
        field5332 = null;
        field5343 = null;
        field5340 = null;
        field5347 = null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Lpl;", line = 76)
    public static final class184 method2178(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class184 var4 = var3.field5079;
            var3.field5079 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V", line = 85)
    public class315() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lcd;I)V", line = 108)
    public class315(class64 arg0, int arg1) {
        this.field5342 = arg0;
    }
}
