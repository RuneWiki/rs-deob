import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class195 extends class19 {

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "Lsd;")
    public static class166 field3868 = class135.method935("compass", 0);

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "[Z")
    public static boolean[] field3859 = new boolean[112];

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "[I")
    public static int[] field3861 = new int[256];

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lsd;")
    private static class166 field3862 = class135.method935("You can(Wt add yourself to your own friend list)3", 0);

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "Lsd;")
    public static class166 field3865 = field3862;

    @OriginalMember(owner = "client!vf", name = "ab", descriptor = "Lsd;")
    public static class166 field3871 = class135.method935("Lade Konfiguration )2 ", 0);

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lsd;")
    public static class166 field3872 = class135.method935("60 Sekunden noch einmal)3)3)3", 0);

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "I")
    public int field3864;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!vf", name = "Y", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
    public int field3870;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "Lv;")
    public static class189 field3856;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public static void method1298(int arg0) {
        field3871 = null;
        field3865 = null;
        field3856 = null;
        field3861 = null;
        field3872 = null;
        field3868 = null;
        field3862 = null;
        if (arg0 >= -16) {
            method1301(-97, 42);
        }
        field3859 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lff;BI)V")
    private final void method1299(class53 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field3864 = arg0.method405(2);
            this.field3863 = arg0.method400(255);
            this.field3870 = arg0.method400(255);
        }
        field3857++;
        if (arg1 < 72) {
            this.method1299(null, (byte) -107, 55);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILff;)V")
    public final void method1300(int arg0, class53 arg1) {
        while (true) {
            int var3 = arg1.method400(255);
            if (var3 == 0) {
                field3860++;
                if (arg0 > -119) {
                    this.method1300(107, null);
                    return;
                }
                return;
            }
            this.method1299(arg1, (byte) 124, var3);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(II)I")
    public static final int method1301(int arg0, int arg1) {
        if (arg1 == -2) {
            field3867++;
            return arg0 >> 11 & 0x3F;
        } else {
            return 119;
        }
    }
}
