import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class203 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2992 = new String[] { method1743(method1742("{\u001e\tF8")), method1743(method1742("{\u001e\tE8")), method1743(method1742("{\u001e\tG8")) };

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
    public static int[] field2986 = new int[3];

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "F")
    public static float field2991;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "Lem;")
    public static class339 field2988;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "Llga;")
    public static class47 field2987;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 3)
    public static void method1739(int arg0) {
        try {
            if (arg0 >= -3) {
                method1740(-9, -10, -16, 111, -73, false);
            }
            field2987 = null;
            field2988 = null;
            field2986 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2992[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIZ)V", line = 18)
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        try {
            field2989++;
            for (int var6 = arg1; var6 <= arg0; var6++) {
                class576.method4282(-7, arg4, arg3, class529.field7682[var6], arg2);
            }
            if (!arg5) {
                field2986 = null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field2992[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZII)V", line = 42)
    public static final void method1741(int arg0, boolean arg1, int arg2, int arg3) {
        try {
            field2990++;
            if (arg2 < 8000 || arg2 > 48000) {
                throw new IllegalArgumentException();
            }
            class375.field5471 = arg1;
            class355.field5149 = arg0;
            if (arg3 != 48000) {
                method1740(56, 14, 61, -8, 123, true);
            }
            class215.field3148 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2992[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1742(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1743(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
