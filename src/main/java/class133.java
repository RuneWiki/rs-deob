import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class133 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lrf;")
    public static class163 field2760 = class53.method392(61, ":duelstake:");

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2757 = 0;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
    public static int[] field2766 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Lrf;")
    private static class163 field2767 = class53.method392(-88, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field2763 = 0;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lrf;")
    private static class163 field2759 = class53.method392(117, "Unexpected server response)3");

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field2770 = 0;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lrf;")
    public static class163 field2764 = field2759;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lrf;")
    public static class163 field2756 = field2767;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public int field2761;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "[Lpf;")
    public static class145[] field2771;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB[I)I")
    public static final int method885(int arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 != 39) {
            method885(-126, -8, (byte) -110, null);
        }
        field2768++;
        return arg3[0] * arg1 + arg3[1] * arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method886(int arg0) {
        field2764 = null;
        field2766 = null;
        if (arg0 != 16163) {
            field2757 = -112;
        }
        field2759 = null;
        field2771 = null;
        field2756 = null;
        field2767 = null;
        field2760 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
    public static int method887(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
