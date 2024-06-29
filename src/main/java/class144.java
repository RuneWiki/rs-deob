import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class144 extends class259 {

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field2653 = 0;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "Lcc;")
    public static class209 field2666 = class95.method669(90, ": ");

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "Lcc;")
    private static class209 field2669 = class95.method669(91, "Loaded fonts");

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "Lcc;")
    public static class209 field2661 = field2669;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public int field2654;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public int field2656;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "Lcc;")
    public class209 field2659;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "[I")
    public int[] field2660;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "[I")
    public int[] field2668;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "[Lcc;")
    public static class209[] field2655;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "[Lcc;")
    public class209[] field2663;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "[Lta;")
    public class255[] field2651;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILcc;)Z")
    public static final boolean method1007(int arg0, class209 arg1) {
        field2667++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class163.field2949; var2++) {
            if (arg1.method1483(class129.field2474[var2], (byte) -52)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V")
    public static final void method1008(int arg0) {
        if (class273.field4849 != null) {
            class222.method1570(class273.field4849, (byte) 56);
            class273.field4849 = null;
        }
        if (arg0 != 0) {
            method1008(12);
        }
        field2652++;
    }

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "(I)V")
    public static final void method1009(int arg0) {
        if (arg0 != 0) {
            method1009(-3);
        }
        class142.field2616++;
        field2657++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
    public static void method1010(byte arg0) {
        field2661 = null;
        field2666 = null;
        field2655 = null;
        if (arg0 <= 16) {
            method1009(-121);
        }
        field2669 = null;
    }
}
