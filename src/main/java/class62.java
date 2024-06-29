import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class62 {

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field843;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "B")
    public byte field831;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "I")
    public int field839;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field844;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "[S")
    private static short[] field829 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "S")
    public static short field847 = 32767;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "Z")
    public static boolean field841 = false;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "[S")
    private static short[] field838 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "[S")
    private static short[] field845 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "[[S")
    public static short[][] field837 = new short[][] { field829, field838, field845 };

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public int field828;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public int field832;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public int field833;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public int field834;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public int field835;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field840;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public int field849;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "Lmk;")
    public class62 field846;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lat;", line = 8)
    public final class398 method533(byte arg0) {
        field836++;
        int var2 = 39 / ((-arg0 - 49) / 59);
        return class209.method1322((byte) 101, this.field851);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Z", line = 26)
    public static final boolean method534(int arg0) {
        field842++;
        if (class289.field3493 != 3) {
            return false;
        } else if (arg0 == 7900) {
            return class303.field3619 == 0 && class5.field53 == 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V", line = 44)
    public static void method535(int arg0) {
        field837 = null;
        field845 = null;
        field838 = null;
        if (arg0 <= 113) {
            method537(9, 43);
        }
        field829 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBII)Lmk;", line = 67)
    public final class62 method536(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 116) {
            this.field843 = 71;
        }
        field830++;
        return new class62(this.field851, arg3, arg0, arg2, this.field831);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)Z", line = 78)
    public static final boolean method537(int arg0, int arg1) {
        field826++;
        if (arg1 == 2) {
            return arg0 == 0 || arg0 == 2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(IIIIB)V", line = 112)
    public class62(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field843 = arg2;
        this.field831 = arg4;
        this.field839 = arg3;
        this.field844 = arg1;
        this.field851 = arg0;
    }
}
