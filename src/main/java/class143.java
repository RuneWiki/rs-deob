import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class143 extends class117 {

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "[B")
    public byte[] field2065;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    public static boolean field2067 = false;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "J")
    public static long field2070 = 0L;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2074 = new String[100];

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILjava/lang/String;)V", line = 4)
    public static final void method1027(int arg0, String arg1) {
        field2071++;
        if (arg1 == null) {
            return;
        }
        if (!(class110.field1608 < 100 || class98.field1381) || class110.field1608 >= 200) {
            class28.method177(class148.field2128, arg0 - 19420);
            return;
        }
        String var2 = class19.method117(20563, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class110.field1608; var3++) {
            String var4 = class19.method117(20563, class109.field1585[var3]);
            if (var4 != null && var4.equals(var2)) {
                class28.method177(arg1 + class197.field2861, -19420);
                return;
            }
            if (class50.field761[var3] != null) {
                String var5 = class19.method117(20563, class50.field761[var3]);
                if (var5 != null && var5.equals(var2)) {
                    class28.method177(arg1 + class197.field2861, -19420);
                    return;
                }
            }
        }
        for (int var6 = arg0; var6 < class255.field3810; var6++) {
            String var7 = class19.method117(20563, class192.field2806[var6]);
            if (var7 != null && var7.equals(var2)) {
                class28.method177(class86.field1221 + arg1 + class133.field1945, -19420);
                return;
            }
            if (class170.field2455[var6] != null) {
                String var8 = class19.method117(20563, class170.field2455[var6]);
                if (var8 != null && var8.equals(var2)) {
                    class28.method177(class86.field1221 + arg1 + class133.field1945, -19420);
                    return;
                }
            }
        }
        if (class19.method117(20563, class1.field55.field3453).equals(var2)) {
            class28.method177(class229.field3468, -19420);
        } else {
            class249.field3706++;
            class107.field1533.method1915(true, 105);
            class107.field1533.method1355((byte) -123, class225.method1646(arg0 - 100, arg1));
            class107.field1533.method1343(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V", line = 106)
    public static final void method1028(int arg0, int arg1) {
        field2068++;
        class206 var2 = (class206) class135.field1968.method1405((long) arg0, false);
        if (var2 == null) {
            return;
        }
        if (arg1 != -23404) {
            method1030((class361) null, -23, 123, -50, 52, -77, true);
        }
        for (int var3 = 0; var3 < var2.field3008.length; var3++) {
            var2.field3008[var3] = -1;
            var2.field3014[var3] = 0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BZB)Ljava/lang/Object;", line = 132)
    public static final Object method1029(byte[] arg0, boolean arg1, byte arg2) {
        field2066++;
        if (arg2 <= 62) {
            return (Object) null;
        } else if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class124.field1797) {
                try {
                    class170 var3 = (class170) Class.forName("ak").getDeclaredConstructor().newInstance();
                    var3.method1200(false, arg0);
                    return var3;
                } catch (Throwable var5) {
                    class124.field1797 = true;
                }
            }
            return arg1 ? class121.method898(false, arg0) : arg0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([B)V", line = 168)
    public class143(byte[] arg0) {
        this.field2065 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lph;IIIIIZ)V", line = 182)
    public static final void method1030(class361 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class261.field3970 = arg1;
        class131.field1889 = 1;
        class259.field3858 = arg4;
        int var7 = 30 / ((-arg5 - 67) / 46);
        class347.field5361 = arg2;
        class217.field3195 = arg3;
        field2073++;
        class31.field438 = arg6;
        class124.field1807 = arg0;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLqf;I)V", line = 202)
    public static final void method1031(boolean arg0, class359 arg1, int arg2) {
        field2069++;
        int var3 = ~arg1.field5580 == arg2 ? arg1.field5560 : arg1.field5580;
        int var4 = arg1.field5642 == 0 ? arg1.field5506 : arg1.field5642;
        class276.method2018(var3, arg1.field5521, arg0, (byte) -35, var4, class119.field1677[arg1.field5521 >> 16]);
        if (arg1.field5579 != null) {
            class276.method2018(var3, arg1.field5521, arg0, (byte) -35, var4, arg1.field5579);
        }
        class98 var5 = (class98) class288.field4360.method1405((long) arg1.field5521, false);
        if (var5 != null) {
            class249.method1831((byte) 37, arg0, var5.field1393, var4, var3);
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 220)
    public static void method1032(int arg0) {
        if (arg0 <= 45) {
            field2074 = (String[]) null;
        }
        field2074 = null;
    }
}
