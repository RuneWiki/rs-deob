import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class141 {

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[B")
    public static byte[] field1921 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "Lbt;")
    public static class363 field1914 = new class363(100);

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1928 = new String[8];

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "J")
    public static long field1929 = -1L;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lct;")
    public static class104 field1922;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Lla;")
    public class150 field1925;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "[I")
    public int[] field1920;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", line = 9)
    public static final void method932(int arg0, int arg1, String arg2, String arg3, boolean arg4, String arg5) {
        class339.method2187(arg5, (String) null, 31967, arg3, arg2, arg0, arg1, -1);
        field1926++;
        if (!arg4) {
            method933(54, 82);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lhg;", line = 22)
    public static final class299 method933(int arg0, int arg1) {
        if (arg1 != -20227) {
            field1921 = null;
        }
        field1918++;
        class299 var2 = (class299) class450.field6598.method1933((long) arg0, arg1 + 20227);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class151.field2051.method715(0, (byte) 73, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class299 var4 = class422.method2604(arg1 + 20133, var3);
            class450.field6598.method1937(-86, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BB)C", line = 45)
    public static final char method934(byte arg0, byte arg1) {
        field1917++;
        if (arg0 < 29) {
            return 'C';
        }
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class210.field2961[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 75)
    public static final void method935(int arg0) {
        field1927++;
        if (class106.field1427) {
            return;
        }
        if (class400.field5790) {
            class1.field19 = (float) ((int) class1.field19 - 65 & 0xFFFFFF80);
        } else {
            class164.field2166 += (-24.0F - class164.field2166) / 2.0F;
        }
        if (arg0 != -65) {
            method935(106);
        }
        class106.field1427 = true;
        class373.field5455 = true;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)I", line = 103)
    public static final int method936(int arg0, boolean arg1) {
        if (arg1) {
            method932(40, 112, (String) null, (String) null, true, (String) null);
        }
        field1916++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 115)
    public static void method937(int arg0) {
        field1914 = null;
        if (arg0 == 100) {
            field1921 = null;
            field1922 = null;
            field1928 = null;
        }
    }
}
