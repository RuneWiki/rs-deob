import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class149 {

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[I")
    public static int[] field2915 = new int[128];

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "[Lpg;")
    public static class142[] field2921 = new class142[500];

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Leh;")
    public static class47 field2924 = class195.method1282((byte) -4, ")1p");

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "Lve;")
    public static class194 field2922 = null;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "[B")
    public static byte[] field2927 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "[Ldf;")
    public static class36[] field2930 = new class36[6];

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public int field2919;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Leh;")
    public class47 field2923;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Z")
    public boolean field2916;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1048(int arg0, int arg1, int arg2, long arg3) {
        class152 var5 = class173.field3351[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2991 != null && var5.field2991.field874 == arg3) {
            return true;
        } else if (var5.field2990 != null && var5.field2990.field2370 == arg3) {
            return true;
        } else if (var5.field2989 != null && var5.field2989.field3895 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2975; var6++) {
                if (var5.field2979[var6].field1157 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field2930 = null;
        field2921 = null;
        field2924 = null;
        if (arg0 <= 63) {
            method1049(-2);
        }
        field2927 = null;
        field2915 = null;
    }
}
