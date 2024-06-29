import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lic;")
    public static class59 field1862 = class59.method433(0, "Angreifen");

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lic;")
    public static class59 field1866 = class59.method433(0, "<col=00ffff>");

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1863 = 0;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field1872 = 0;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lic;")
    private static class59 field1869 = class59.method433(0, "wishes to duel with you)3");

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lic;")
    public static class59 field1873 = class59.method433(0, "(U0a )2 in: ");

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lic;")
    private static class59 field1865 = class59.method433(0, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Lic;")
    public static class59 field1874 = field1869;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lic;")
    public static class59 field1868 = class59.method433(0, "null");

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lic;")
    public static class59 field1871 = field1865;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lic;")
    public static class59 field1877 = class59.method433(0, "jlv");

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ldd;")
    public static class26 field1861;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZIILt;)V")
    public static final void method629(int arg0, int arg1, boolean arg2, int arg3, int arg4, class132 arg5) {
        field1864++;
        if (arg5 == null) {
            return;
        }
        int var6 = class79.field1941 + class130.field2927 & 0x7FF;
        int var7 = arg0 * arg0 + arg1 * arg1;
        if (var7 > 6400) {
            return;
        }
        int var8 = class11.field244[var6];
        int var9 = class11.field249[var6];
        int var10 = var8 * 256 / (class49.field1226 + 256);
        int var11 = var9 * 256 / (class49.field1226 + 256);
        int var12 = arg0 * var10 + arg1 * var11 >> 16;
        int var13 = arg0 * var11 - arg1 * var10 >> 16;
        if (var7 > 2500) {
            arg5.method1019(class24.field587, arg3 + var12 + 94 + 4 - arg5.field2954 / 2, arg4 - (-83 - -var13) + -(arg5.field2956 / 2) + -4);
        } else {
            arg5.method1023(arg3 + var12 + 4 + 94 - arg5.field2954 / 2, -(arg5.field2956 / 2) + -var13 + -4 + arg4 + 83);
        }
        if (arg2) {
            field1872 = -89;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method630(boolean arg0) {
        field1862 = null;
        field1865 = null;
        field1871 = null;
        field1877 = null;
        field1869 = null;
        field1866 = null;
        field1873 = null;
        field1868 = null;
        field1861 = null;
        if (arg0) {
            field1870 = -79;
        }
        field1874 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)I")
    public static final int method631(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -68) {
            return -2;
        } else {
            field1875++;
            int var5 = 65536 - class11.field249[arg2 * 1024 / arg0] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Lwf;")
    public static final class159 method632(int arg0, int arg1, int arg2) {
        field1867++;
        if (arg1 != 128) {
            method630(true);
        }
        class159 var3 = class134.method1032(arg0, 499749840);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field3598 == null || arg2 >= var3.field3598.length) {
            return null;
        } else {
            return var3.field3598[arg2];
        }
    }
}
