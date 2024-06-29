import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class54 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[I")
    public static int[] field926 = new int[50];

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[B")
    public static byte[] field929 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[I")
    public static int[] field927 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lng;")
    public static class87 field928 = new class87();

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        if (arg0 > 71) {
            field929 = null;
            field928 = null;
            field927 = null;
            field926 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lwe;Z)Lwc;")
    public static final class196 method385(class75 arg0, boolean arg1) {
        field925++;
        if (arg1) {
            field924 = -76;
        }
        return new class196(arg0.method591(true), arg0.method591(true), arg0.method591(true), arg0.method591(!arg1), arg0.method559(-1), arg0.method558(1));
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILpi;I)Z")
    public static final boolean method386(int arg0, class181 arg1, int arg2) {
        field930++;
        if (arg2 != -13377) {
            field929 = null;
        }
        byte[] var3 = arg1.method1303(arg0, -60);
        if (var3 == null) {
            return false;
        } else {
            class183.method1331(true, var3);
            return true;
        }
    }
}
