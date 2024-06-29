import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class215 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Z")
    public static boolean field3983 = false;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field3989 = -1;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lqe;")
    public static class179 field3984 = class206.method1380(")2", (byte) -128);

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lqe;")
    public static class179 field3987 = class206.method1380(" steht bereits auf Ihrer Ignorieren)2Liste(Q", (byte) -40);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[I")
    public static int[] field3986 = new int[256];

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "[Lqe;")
    public static class179[] field3993 = new class179[500];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "J")
    public static long field3982 = 0L;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lqe;")
    public static class179 field3996 = class206.method1380("leuchten2:", (byte) 103);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Lqe;")
    private static class179 field3985 = class206.method1380("We suspect someone knows your password)3", (byte) 81);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lqe;")
    public static class179 field3988 = field3985;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ldc;")
    public static class36 field3994 = new class36();

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "Lqe;")
    public static class179 field3997 = class206.method1380("Sprites geladen)3", (byte) -128);

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lm;")
    public static class130 field3991;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lqe;")
    public static final class179 method1411(int arg0, int arg1) {
        if (arg0 == -17116) {
            field3990++;
            return class23.field567[arg1].method1168(true) <= 0 ? field3993[arg1] : class78.method502((byte) -116, new class179[] { field3993[arg1], class186.field3463, class23.field567[arg1] });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method1412(boolean arg0) {
        field3986 = null;
        field3985 = null;
        field3991 = null;
        field3987 = null;
        field3984 = null;
        field3993 = null;
        field3988 = null;
        if (arg0) {
            field3997 = null;
            field3996 = null;
            field3994 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)Z")
    public static final boolean method1413(int arg0, int arg1) {
        field3992++;
        if (arg0 != 0) {
            field3984 = null;
        }
        return arg1 >= 48 && arg1 <= 57;
    }
}
