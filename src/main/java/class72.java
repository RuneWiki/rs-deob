import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class72 extends class320 {

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Lfk;")
    public static class317 field1075 = new class317();

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "Luh;")
    public static class95 field1086;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Ljava/lang/String;")
    public String field1081;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
    public int[] field1076;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "[I")
    public int[] field1084;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "[Lcn;")
    public class37[] field1079;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field1070;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "[[[Lqo;")
    public static class329[][][] field1087;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 6)
    public static final String method681(byte arg0, int arg1) {
        field1080++;
        if (arg0 != -2) {
            field1075 = (class317) null;
        }
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFFFC) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V", line = 17)
    public static final void method682(int arg0) {
        field1074++;
        for (int var1 = 0; var1 < 5; var1++) {
            class32.field495[var1] = false;
        }
        class29.field476 = 0;
        class155.field2501 = -1;
        class314.field4858 = 1;
        class345.field5481 = arg0;
        class98.field1482 = 0;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V", line = 43)
    public static final void method683(String arg0, String arg1, byte arg2, String arg3, int arg4, int arg5) {
        class139.method1158(arg0, (byte) -115, arg3, arg1, arg4, (String) null, arg5, -1);
        if (arg2 > -110) {
            method684(25, -44);
        }
        field1069++;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)I", line = 62)
    public static final int method684(int arg0, int arg1) {
        field1073++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg0 <= arg1) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 106)
    public static final String method685(String arg0, byte arg1) {
        field1077++;
        int var2 = arg0.length();
        byte var3 = 2;
        if (arg1 != -103) {
            field1087 = (class329[][][]) ((class329[][][]) null);
        }
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class340.method2392(90, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V", line = 159)
    public static void method686(int arg0) {
        if (arg0 >= -89) {
            field1087 = (class329[][][]) ((class329[][][]) null);
        }
        field1087 = (class329[][][]) null;
        field1075 = null;
        field1086 = null;
    }
}
