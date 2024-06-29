import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class215 extends class389 {

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "[S")
    private static short[] field2763 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "[S")
    private static short[] field2766 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[S")
    private static short[] field2771 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field2773 = -1;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "[S")
    private static short[] field2768 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "[[S")
    public static short[][] field2760 = new short[][] { field2763, field2766, field2768, field2771 };

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Lnj;")
    public static class415 field2762 = new class415(8, -1);

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public int field2769;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Lcq;")
    public class274 field2767;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lkn;")
    public static class307 field2772;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "[Lht;")
    public class108[] field2770;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
    public static void method1376(boolean arg0) {
        field2766 = null;
        field2768 = null;
        field2762 = null;
        field2763 = null;
        field2771 = null;
        field2760 = null;
        if (arg0) {
            field2772 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILej;)I")
    public static final int method1377(int arg0, class694 arg1) {
        if (arg0 != 10849) {
            method1376(false);
        }
        field2774++;
        if (class61.field833 == arg1) {
            return 5890;
        } else if (class697.field9582 == arg1) {
            return 34167;
        } else if (class243.field3260 == arg1) {
            return 34168;
        } else if (class425.field5511 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILoa;II)Z")
    public final boolean method1378(int arg0, class43 arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            field2771 = null;
        }
        field2765++;
        if (this.field2770 != null) {
            for (int var5 = 0; var5 < this.field2770.length; var5++) {
                if (this.field2770[var5].method836(arg2, arg0) && this.field2767.method74(arg0, arg2, arg1, arg3 - 103)) {
                    return true;
                }
            }
        }
        return false;
    }
}
