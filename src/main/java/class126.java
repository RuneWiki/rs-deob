import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class126 {

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public int field1898 = -1;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public int field1896 = -1;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "I")
    public int field1906 = -1;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "[I")
    public static int[] field1901 = new int[1000];

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public int field1893;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public int field1904;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
    public int field1905;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "Lgb;")
    public static class227 field1902;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
    public static int[] field1897;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg3 & 0x3;
        field1895++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg0;
            arg0 = var8;
        }
        if (arg2 >= -39) {
            method1024(-21, 19, -36, 0, 68, 127, -104);
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 7 + 1 - arg4 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg6;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V")
    public static void method1025(boolean arg0) {
        field1901 = null;
        field1897 = null;
        field1902 = null;
        if (!arg0) {
            method1025(false);
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lbba;)V")
    public class126(class124 arg0) {
    }
}
