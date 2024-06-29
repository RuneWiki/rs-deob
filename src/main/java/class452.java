import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class452 {

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public int field6747;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public int field6742;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field6744;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public int field6745;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field6748;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "B")
    public byte field6750;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public static int field6749;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "Lmg;")
    public class168 field6753;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Lvq;")
    public class341 field6741;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "Lbt;")
    public class354 field6755;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "Lqs;")
    public static class496 field6752;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lht;")
    public class80 field6746;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIIBZII)Z", line = 12)
    public static final boolean method2703(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, int arg8) {
        field6751++;
        int var9 = class302.field4850.field3159[0];
        int var10 = class302.field4850.field3158[0];
        if (var9 < 0 || var9 >= class217.field3775 || var10 < 0 || class277.field4548 <= var10) {
            return false;
        } else if (arg2 >= 0 && arg2 < class217.field3775 && arg3 >= 0 && arg3 < class277.field4548) {
            int var11 = class88.method622(arg4, arg3, arg1, (byte) -114, arg2, class295.field4751, class106.field1865[class302.field4850.field4720], var9, var10, arg0, class302.field4850.method1143(0), arg8, arg6, class229.field3998, arg7);
            if (var11 < 1) {
                return false;
            }
            class314.field4946 = class295.field4751[var11 - 1];
            if (arg5 > -109) {
                return true;
            } else {
                class420.field6346 = class229.field3998[var11 - 1];
                class192.field2991 = false;
                class269.method1794(-127);
                return true;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 46)
    public static void method2704(int arg0) {
        if (arg0 == 13614) {
            field6752 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)Z", line = 61)
    public static final boolean method2705(int arg0, int arg1) {
        if (arg0 != 15105) {
            field6743 = -12;
        }
        field6754++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(BIIIII)V", line = 71)
    public class452(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6747 = arg4;
        this.field6742 = arg1;
        this.field6744 = arg2;
        this.field6745 = arg5;
        this.field6748 = arg3;
        this.field6750 = arg0;
    }
}
