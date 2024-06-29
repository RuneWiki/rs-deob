import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class125 {

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public int field1925 = 2048;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public int field1926 = 0;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public int field1928 = 2048;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public int field1932 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1923 = "Cancel";

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
    public static int field1929 = 0;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lmo;")
    public static class447 field1930;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 8)
    public static void method918(int arg0) {
        field1930 = null;
        field1923 = null;
        if (arg0 != 197) {
            field1930 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/lang/String;)V", line = 32)
    public static final void method919(byte arg0, String arg1) {
        field1931++;
        if (arg1 == null) {
            return;
        }
        String var2 = class428.method2652(arg1, false);
        if (var2 == null || arg0 != -114) {
            return;
        }
        for (int var3 = 0; var3 < class262.field4215; var3++) {
            String var4 = class428.method2652(class338.field5248[var3], false);
            if (var4 != null && var4.equals(var2)) {
                class262.field4215--;
                for (int var5 = var3; var5 < class262.field4215; var5++) {
                    class338.field5248[var5] = class338.field5248[var5 + 1];
                    class70.field863[var5] = class70.field863[var5 + 1];
                    class236.field3948[var5] = class236.field3948[var5 + 1];
                    class57.field708[var5] = class57.field708[var5 + 1];
                    class447.field6517[var5] = class447.field6517[var5 + 1];
                    class349.field5386[var5] = class349.field5386[var5 + 1];
                }
                class285.field4579++;
                class179.field2921 = class223.field3724;
                class11.field139.method2224(197, (byte) 0);
                class11.field139.method1312(class317.method2110(true, arg1), -45);
                class11.field139.method1301(arg1, 125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIJB)Ljava/lang/String;", line = 86)
    public static final String method920(int[] arg0, int arg1, long arg2, byte arg3) {
        field1924++;
        if (class12.field168 != null) {
            String var5 = class12.field168.method1395(arg0, false, arg1, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 != -44) {
            field1929 = 101;
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjg;I)V", line = 114)
    public final void method921(byte arg0, class186 arg1, int arg2) {
        field1920++;
        int var4 = -125 % ((arg0 - 25) / 54);
        while (true) {
            int var5 = arg1.method1322(false);
            if (var5 == 0) {
                return;
            }
            this.method923(var5, arg1, arg2, -4);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 133)
    public static final void method922(int arg0, int arg1) {
        field1922++;
        class89.field1112.method337(arg1, (byte) -110);
        int var2 = -58 % ((arg0 - 38) / 41);
        class338.field5247.method337(arg1, (byte) -115);
        class182.field2978.method337(arg1, (byte) -115);
        class84.field1047.method337(arg1, (byte) -104);
        class7.field92.method337(arg1, (byte) -122);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjg;II)V", line = 147)
    private final void method923(int arg0, class186 arg1, int arg2, int arg3) {
        if (arg0 == 1) {
            this.field1932 = arg1.method1322(false);
        } else if (arg0 == 2) {
            this.field1925 = arg1.method1272((byte) -106);
        } else if (arg0 == 3) {
            this.field1928 = arg1.method1272((byte) -123);
        } else if (arg0 == 4) {
            this.field1926 = arg1.method1276((byte) -99);
        }
        field1927++;
        if (arg3 != -4) {
            this.field1928 = -17;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljg;IZ)Ljava/lang/String;", line = 177)
    public static final String method924(class186 arg0, int arg1, boolean arg2) {
        field1921++;
        try {
            int var3 = arg0.method1299(-122);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field3044 += class64.field837.method2661(1, var4, arg0.field3066, var3, arg0.field3044, 0);
            return arg2 ? null : class284.method1928(0, -1, var3, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }
}
