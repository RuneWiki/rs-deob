import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 extends class41 {

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2752 = -1;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "Lu;")
    public static class135 field2750 = class87.method676((byte) -68, "@red@");

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[Z")
    public static boolean[] field2753 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field2755 = 0;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "Lu;")
    public static class135 field2747 = class87.method676((byte) -50, "Okay");

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Loe;")
    public static class102 field2751 = new class102(512);

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field2762 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    public static int[] field2763 = new int[5];

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "Lu;")
    private static class135 field2758 = class87.method676((byte) -89, "flash2:");

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "Lu;")
    public static class135 field2760 = field2758;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Lu;")
    public static class135 field2757 = field2758;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Z")
    public static boolean field2759 = false;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "Lu;")
    public class135 field2756;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "Lkf;")
    public static class75 field2761;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)Z")
    public static final boolean method924(int arg0, int arg1) {
        field2754++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            return arg1 > 106;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
    public static final void method925(boolean arg0) {
        field2749++;
        if (arg0) {
            field2753 = null;
        }
        class77.field1822.method234(-22666);
        class111.field2691.method234(-22666);
        class57.field1396.method234(-22666);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public static void method926(byte arg0) {
        field2761 = null;
        field2753 = null;
        field2750 = null;
        field2760 = null;
        if (arg0 > -41) {
            method926((byte) -18);
        }
        field2751 = null;
        field2757 = null;
        field2763 = null;
        field2758 = null;
        field2747 = null;
    }
}
