import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class219 extends class293 {

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3896 = 1;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Z")
    public static boolean field3898 = false;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "Lsf;")
    private static class108 field3897 = class140.method973(255, "");

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lsf;")
    public static class108 field3893 = field3897;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3895 = 0;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lsf;")
    public static class108 field3902 = class140.method973(255, "::wm0");

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method1507(int arg0, int arg1) {
        int var2 = -75 % ((arg1 + 41) / 59);
        field3901++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)Z", line = 34)
    public static final boolean method1508(int arg0, int arg1) {
        field3903++;
        if (class180.field3278[arg0]) {
            return true;
        } else if (arg1 != -123) {
            return false;
        } else if (class171.field3102.method1873(255, arg0)) {
            int var2 = class171.field3102.method1876(arg0, (byte) -78);
            if (var2 == 0) {
                class180.field3278[arg0] = true;
                return true;
            }
            if (class320.field5485[arg0] == null) {
                class320.field5485[arg0] = new class98[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class320.field5485[arg0][var3] == null) {
                    byte[] var4 = class171.field3102.method1868(12236, arg0, var3);
                    if (var4 != null) {
                        class320.field5485[arg0][var3] = new class98();
                        class320.field5485[arg0][var3].field1649 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class320.field5485[arg0][var3].method673(true, new class249(var4));
                        } else {
                            class320.field5485[arg0][var3].method679(new class249(var4), (byte) 79);
                        }
                    }
                }
            }
            class180.field3278[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 101)
    public static void method1509(byte arg0) {
        field3897 = null;
        field3902 = null;
        if (arg0 != 56) {
            method1508(90, 46);
        }
        field3893 = null;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(IZ)Lsf;", line = 142)
    public static final class108 method1510(int arg0, boolean arg1) {
        field3904++;
        class108 var2 = new class108();
        if (!arg1) {
            method1509((byte) -90);
        }
        var2.field1884 = new byte[arg0];
        var2.field1870 = 0;
        return var2;
    }
}
