import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class196 {

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "[[Z")
    public static boolean[][] field3197 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3194 = "Checking for updates - ";

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[[S")
    public static short[][] field3201 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Z")
    public static boolean field3204 = false;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static volatile int field3193 = -1;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 13)
    public static final void method1441(byte arg0) {
        class84.field1177 = true;
        field3195++;
        if (arg0 > -75) {
            method1444(-53, -82);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V", line = 28)
    public static final void method1442(byte arg0, String arg1) {
        int var2 = -79 / ((88 - arg0) / 32);
        System.out.println("Error: " + class84.method569("\n", (byte) -73, "%0a", arg1));
        field3199++;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 46)
    public static void method1443(byte arg0) {
        if (arg0 != 93) {
            method1443((byte) 58);
        }
        field3197 = (boolean[][]) null;
        field3201 = (short[][]) null;
        field3194 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Lq;", line = 58)
    public static final class345 method1444(int arg0, int arg1) {
        field3202++;
        class345 var2 = (class345) class339.field5285.method704((byte) 43, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1061.method1287(arg1, arg0, -1);
        class345 var4 = new class345(var3);
        var4.method1806(class99.field1416, (int[]) null);
        class339.field5285.method703(var4, (long) arg0, (byte) 114);
        return var4;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(III)V", line = 86)
    public class196(int arg0, int arg1, int arg2) {
        this.field3203 = arg0;
        this.field3200 = arg2;
        this.field3196 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public abstract void method1080(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIZ)V")
    public abstract void method1083(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(III)V")
    public abstract void method1081(int arg0, int arg1, int arg2);
}
