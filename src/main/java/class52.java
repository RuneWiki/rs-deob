import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class52 {

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Lwm;")
    public static class152 field806 = class157.method1048("", 104);

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lwm;")
    public static class152 field809 = class157.method1048(")3runescape)3com)4l=", 123);

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lwm;")
    public static class152 field811 = class157.method1048("::wm1", 98);

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILoe;IZI)V", line = 6)
    public static final void method354(int arg0, class127 arg1, int arg2, boolean arg3, int arg4) {
        field812++;
        int var5 = arg1.field1876;
        if (arg1.field1839 == 0) {
            arg1.field1876 = arg1.field1879;
        } else if (arg1.field1839 == 1) {
            arg1.field1876 = arg4 - arg1.field1879;
        } else if (arg1.field1839 == 2) {
            arg1.field1876 = arg1.field1879 * arg4 >> 14;
        } else if (arg1.field1839 == 3) {
            if (arg1.field1902 == 2) {
                arg1.field1876 = arg1.field1879 * 32 + ((arg1.field1879 - 1) * arg1.field1946);
            } else if (arg1.field1902 == 7) {
                arg1.field1876 = (arg1.field1879 - 1) * arg1.field1946 + arg1.field1879 * 115;
            }
        }
        int var6 = arg1.field1921;
        if (arg1.field1910 == 0) {
            arg1.field1921 = arg1.field1802;
        } else if (arg1.field1910 == 1) {
            arg1.field1921 = arg2 - arg1.field1802;
        } else if (arg1.field1910 == 2) {
            arg1.field1921 = arg1.field1802 * arg2 >> 14;
        } else if (arg1.field1910 == 3) {
            if (arg1.field1902 == 2) {
                arg1.field1921 = (arg1.field1802 - 1) * arg1.field1840 + arg1.field1802 * 32;
            } else if (arg1.field1902 == 7) {
                arg1.field1921 = (arg1.field1802 - 1) * arg1.field1840 + arg1.field1802 * 12;
            }
        }
        if (arg1.field1839 == 4) {
            arg1.field1876 = arg1.field1921 * arg1.field1866 / arg1.field1786;
        }
        if (arg0 <= 77) {
            return;
        }
        if (arg1.field1910 == 4) {
            arg1.field1921 = arg1.field1876 * arg1.field1786 / arg1.field1866;
        }
        if (class317.field5495 && (client.method1759(arg1).field1171 != 0 || arg1.field1902 == 0)) {
            if (arg1.field1921 < 5 && arg1.field1876 < 5) {
                arg1.field1921 = 5;
                arg1.field1876 = 5;
            } else {
                if (arg1.field1876 <= 0) {
                    arg1.field1876 = 5;
                }
                if (arg1.field1921 <= 0) {
                    arg1.field1921 = 5;
                }
            }
        }
        if (arg1.field1887 == 1337) {
            class85.field1178 = arg1;
        }
        if (arg3 && arg1.field1890 != null && (arg1.field1876 != var5 || arg1.field1921 != var6)) {
            class320 var7 = new class320();
            var7.field5569 = arg1;
            var7.field5581 = arg1.field1890;
            class66.field989.method1214(false, var7);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 110)
    public static void method355(byte arg0) {
        field811 = null;
        field809 = null;
        if (arg0 == 5) {
            field806 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLah;I)Z", line = 132)
    public static final boolean method356(byte arg0, class205 arg1, int arg2) {
        field810++;
        if (arg0 < 79) {
            return true;
        }
        byte[] var3 = arg1.method1371(arg2, 0);
        if (var3 == null) {
            return false;
        } else {
            class50.method350(var3, (byte) 117);
            return true;
        }
    }
}
