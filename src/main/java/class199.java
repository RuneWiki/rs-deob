import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public abstract class class199 {

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "Z")
    public static boolean field2881 = false;

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "Lvp;")
    public static class123 field2883 = new class123();

    @OriginalMember(owner = "client!bv", name = "h", descriptor = "[I")
    public static int[] field2885 = new int[4096];

    @OriginalMember(owner = "client!bv", name = "j", descriptor = "Lri;")
    public static class73 field2887 = new class73(38, 5);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!bv", name = "i", descriptor = "Lno;")
    public static class494 field2886;

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "Lf;")
    public static class529 field2884;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIB)V", line = 8)
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2882++;
        class338 var5 = class230.method1580(4, -1332166328, arg1);
        var5.method2053(-120);
        var5.field4748 = arg3;
        var5.field4751 = arg0;
        var5.field4756 = arg2;
        if (arg4 != 64) {
            field2881 = false;
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILme;I)V", line = 30)
    public static final void method1354(int arg0, class129 arg1, int arg2) {
        field2878++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field1965 > class317.field4559) {
            class421.method2533(false, arg1);
        } else if (arg1.field1982 < class317.field4559) {
            class168.method1166(false, arg1, (byte) 110);
            var4 = class348.field5014;
            var3 = class308.field4439;
        } else {
            class423.method2542(-105, arg1);
        }
        if (arg0 > -53) {
            field2883 = null;
        }
        if (arg1.field1763 < 128 || arg1.field1769 < 128 || class30.field323 * 128 - 128 <= arg1.field1763 || arg1.field1769 >= (class182.field2661 * 128 - 128)) {
            arg1.field1906 = -1;
            arg1.field1965 = 0;
            var3 = -1;
            arg1.field1912 = -1;
            var4 = 0;
            arg1.field1982 = 0;
            arg1.field1950 = -1;
            arg1.field1763 = arg1.field1997[0] * 128 + arg1.method847(-1) * 64;
            arg1.field1769 = arg1.field1996[0] * 128 + (arg1.method847(-1) * 64);
            arg1.method856(30134);
        }
        if (class500.field7365 == arg1 && (arg1.field1763 < 1536 || arg1.field1769 < 1536 || arg1.field1763 >= ((class30.field323 - 12) * 128) || arg1.field1769 >= (class182.field2661 - 12) * 128)) {
            var3 = -1;
            arg1.field1906 = -1;
            arg1.field1982 = 0;
            arg1.field1912 = -1;
            arg1.field1950 = -1;
            arg1.field1965 = 0;
            var4 = 0;
            arg1.field1763 = arg1.field1997[0] * 128 + (arg1.method847(-1) * 64);
            arg1.field1769 = arg1.field1996[0] * 128 + arg1.method847(-1) * 64;
            arg1.method856(30134);
        }
        int var5 = class421.method2534(-1, arg1);
        class509.method3015(var3, var4, arg1, var5, false);
        class169.method1172(arg1, -1);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(BI)V", line = 94)
    public static final void method1355(byte arg0, int arg1) {
        field2880++;
        class338 var2 = class230.method1580(4, -1332166328, arg1);
        var2.method2052(100);
        int var3 = -19 % ((71 - arg0) / 33);
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(CILjava/lang/String;)I", line = 111)
    public static final int method1357(char arg0, int arg1, String arg2) {
        field2879++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg2.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "(I)V", line = 141)
    public static void method1358(int arg0) {
        if (arg0 > -49) {
            field2885 = null;
        }
        field2885 = null;
        field2887 = null;
        field2883 = null;
        field2884 = null;
        field2886 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)Lmn;")
    public abstract class246 method1350(int arg0);

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Z")
    public abstract boolean method1352(int arg0, int arg1);

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
    public abstract void method1353(int arg0);

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
    public abstract void method1356(int arg0);
}
