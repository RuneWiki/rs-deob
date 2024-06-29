import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class73 extends class449 {

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Ljava/lang/String;")
    public String field1045;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "J")
    public long field1055;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "Ljava/lang/String;")
    public String field1058;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "Z")
    public boolean field1046;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "Z")
    public boolean field1052;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public static int field1044 = 2;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "[[Z")
    public static boolean[][] field1053 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "[S")
    public static short[] field1051 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lor;")
    public static class275 field1043;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)Ljava/lang/String;")
    public static final String method655(byte arg0, long arg1) {
        field1042++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 <= 8) {
            field1051 = null;
        }
        if ((arg1 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg1;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            char var9 = class223.field3224[(int) (var7 - (arg1 * 37L))];
            if (var9 == '_') {
                int var10 = var6.length() - 1;
                var9 = ' ';
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            var6.append(var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method656(int arg0, String arg1, boolean arg2) {
        field1054++;
        if (arg1 == null) {
            return;
        }
        if (class222.field3201 >= 100) {
            class316.method2006(117, class439.field6231.method1078(class66.field967, 100));
            return;
        }
        if (arg0 >= -84) {
            method655((byte) -83, 95L);
        }
        String var3 = class472.method2799(63, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class222.field3201; var4++) {
            String var8 = class472.method2799(112, class379.field5204[var4]);
            if (var8 != null && var8.equals(var3)) {
                class316.method2006(51, arg1 + class289.field4106.method1078(class66.field967, 100));
                return;
            }
            if (class276.field3985[var4] != null) {
                String var9 = class472.method2799(115, class276.field3985[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class316.method2006(77, arg1 + class289.field4106.method1078(class66.field967, 100));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class349.field4807; var5++) {
            String var6 = class472.method2799(79, class37.field446[var5]);
            if (var6 != null && var6.equals(var3)) {
                class316.method2006(88, class241.field3513.method1078(class66.field967, 100) + arg1 + class164.field2395.method1078(class66.field967, 100));
                return;
            }
            if (class8.field54[var5] != null) {
                String var7 = class472.method2799(37, class8.field54[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class316.method2006(102, class241.field3513.method1078(class66.field967, 100) + arg1 + class164.field2395.method1078(class66.field967, 100));
                    return;
                }
            }
        }
        if (class472.method2799(59, class262.field3781.field485).equals(var3)) {
            class316.method2006(122, class379.field5214.method1078(class66.field967, 100));
            return;
        }
        class336.method2111(class30.field306, 123);
        class379.field5210++;
        class311.field4403.method1180((byte) -110, class345.method2147(arg1, (byte) 110) + 1);
        class311.field4403.method1184((byte) 116, arg1);
        class311.field4403.method1180((byte) -110, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method657(byte arg0) {
        int var1 = -12 % ((37 - arg0) / 51);
        field1051 = null;
        field1043 = null;
        field1053 = null;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class73(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field1050 = arg7;
        this.field1045 = arg1;
        this.field1047 = arg4;
        this.field1048 = arg3;
        this.field1049 = arg2;
        this.field1055 = arg5;
        this.field1058 = arg0;
        this.field1046 = arg8;
        this.field1057 = arg6;
        this.field1052 = arg9;
    }
}
