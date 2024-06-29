import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class66 {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
    public boolean field894 = true;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public int field893;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field902;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public int field899;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "[I")
    public static int[] field900 = new int[50];

    @OriginalMember(owner = "client!e", name = "f", descriptor = "J")
    public static long field895 = 0L;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field896 = 0;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field892 = 0;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lae;")
    public static class174 field901;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method415(byte arg0) {
        if (arg0 == -18) {
            field901 = null;
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(SZ)Z")
    public static final boolean method416(short arg0, boolean arg1) {
        field897++;
        if (arg0 == 47 || arg0 == 25 || arg0 == 17 || arg0 == 35 || arg0 == 41 || arg0 == 58 || arg0 == 44 || arg0 == 23) {
            return true;
        } else if (arg0 == 40 || arg0 == 22 || arg0 == 1003 || arg0 == 1006) {
            return true;
        } else if (arg0 == 36 || arg0 == 1 || arg0 == 3 || arg0 == 46 || arg0 == 31) {
            return true;
        } else if (arg1) {
            return arg0 == 16 || arg0 == 50 || arg0 == 7 || arg0 == 38 || arg0 == 33 || arg0 == 26;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class66(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field898 = arg2;
        this.field893 = arg4;
        this.field891 = arg5;
        this.field894 = arg6;
        this.field890 = arg3;
        this.field902 = arg0;
        this.field899 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
    public static final void method417(byte arg0) {
        int var1 = 103 / ((15 - arg0) / 33);
        field903++;
        class32.method204(-1, false);
        System.gc();
        class145.method977(-106, 25);
    }
}
