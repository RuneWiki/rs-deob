import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class471 extends class354 {

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "B")
    public byte field6916 = 5;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "[I")
    public static int[] field6917 = new int[250];

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "Lkn;")
    public static class378 field6913 = new class378();

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public int field6908;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public int field6910;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public int field6911;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field6915;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public int field6918;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "Z")
    public boolean field6914;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "[I")
    public static int[] field6909;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Z")
    public static final boolean method2855(int arg0, int arg1) {
        int var2 = -121 % ((-arg1 - 61) / 63);
        field6912++;
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)Z")
    public static final boolean method2856(int arg0) {
        field6907++;
        int var1 = 122 % ((arg0 + 76) / 37);
        if (class73.field1242) {
            try {
                class220.method1510(-28, "showVideoAd", class122.field1844.field1062);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)V")
    public static void method2857(int arg0) {
        field6913 = null;
        field6917 = null;
        if (arg0 > 26) {
            field6909 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBIIII)V")
    public static final void method2858(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field6915++;
        if (arg3 - arg1 >= class232.field3492 && class36.field453 >= (arg1 + arg3) && arg5 - arg1 >= class487.field7124 && class232.field3493 >= arg1 + arg5) {
            class221.method1534(arg3, arg5, arg0, 118, arg4, arg6, arg1);
        } else {
            class142.method1020(arg4, arg0, arg5, arg3, arg6, -3024, arg1);
        }
        if (arg2 <= 4) {
            field6917 = null;
        }
    }
}
