import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lid;")
    public static class60 field2649 = class11.method72("runes", (byte) -91);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Lid;")
    private static class60 field2653 = class11.method72("FULL", (byte) 127);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Lid;")
    public static class60 field2648 = class11.method72("(U0a )2 via: ", (byte) 122);

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public static int[] field2657 = new int[256];

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Lid;")
    public static class60 field2658 = field2653;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljd;")
    public static class66 field2647 = new class66();

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public static boolean field2661 = false;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field2660 = -1;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lee;")
    public static class34 field2662;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "[Lae;")
    public static class6[] field2652;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLie;)Ldb;")
    public static final class24 method892(int arg0, byte arg1, class61 arg2) {
        field2656++;
        byte[] var3 = arg2.method471(arg1 + 22998, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -54) {
                field2649 = null;
            }
            return new class24(var3);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        field2649 = null;
        field2652 = null;
        field2658 = null;
        field2657 = null;
        field2647 = null;
        field2662 = null;
        field2648 = null;
        field2653 = null;
        if (arg0 <= 43) {
            field2648 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLle;Z)V")
    public static final void method894(boolean arg0, class81 arg1, boolean arg2) {
        field2654++;
        int var3 = arg1.field2012;
        int var4 = (int) arg1.field2929;
        arg1.method1009((byte) 54);
        if (arg2) {
            class111.method901(var3, 0);
        }
        class120.method936(var3, (byte) -93);
        class40 var5 = class132.method1041(true, var4);
        if (var5 != null) {
            class12.method79(-30833, var5);
        }
        class135.field3067 = arg0;
        class80.field1956 = 0;
        class10.method65(62, class2.field54, class101.field2465, class17.field416, class63.field1576);
        if (class11.field187 != -1) {
            class16.method129(-29873, class11.field187, 1);
        }
    }
}
