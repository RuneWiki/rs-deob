import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class71 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public static int field917 = 0;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "[I")
    public static int[] field924 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "F")
    public static float field918;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "J")
    public long field916;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lkb;")
    public static class39 field923;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "Lhl;")
    public class71 field908;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "Lhl;")
    public class71 field921;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "[[B")
    public static byte[][] field909;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBI)V", line = 6)
    public static final void method461(int arg0, byte arg1, int arg2) {
        field913++;
        if (arg1 == 79) {
            class179 var3 = class319.method2220(arg0, (byte) -92, 6);
            var3.method1242((byte) 105);
            var3.field2897 = arg2;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 24)
    public static final void method462(String arg0, byte arg1) {
        field920++;
        int var2 = -92 / ((arg1 - 34) / 52);
        int var3 = class164.method1137(arg0, -18379);
        if (var3 != -1) {
            int[] var4 = class124.field1855.method2213(class193.field3167.field4908[var3] >> 28 & 0x3, -14, class193.field3167.field4908[var3] & 0x3FFF, (class193.field3167.field4908[var3] & 0xFFFCEF4) >> 14);
            class272.method1943(var4[2], var4[1], -1);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V", line = 41)
    public static void method463(int arg0) {
        field923 = null;
        field924 = null;
        field909 = (byte[][]) null;
        if (arg0 != -403) {
            field924 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 55)
    public static final String method464(int arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        field919++;
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class329.field5132 + " (" + var2 + ")</col>";
        } else if (arg0 == -17348) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class100.field1528 + " (" + var2 + ")</col>";
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 87)
    public final void method465(byte arg0) {
        field925++;
        if (arg0 != -122) {
            this.field908 = (class71) null;
        }
        if (this.field908 != null) {
            this.field908.field921 = this.field921;
            this.field921.field908 = this.field908;
            this.field908 = null;
            this.field921 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)Z", line = 109)
    public final boolean method466(byte arg0) {
        if (arg0 != 56) {
            field924 = (int[]) null;
        }
        field914++;
        return this.field908 != null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BC)B", line = 128)
    public static final byte method467(byte arg0, char arg1) {
        field911++;
        if (arg0 != -125) {
            field910 = -122;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILjava/lang/String;B)I", line = 259)
    public static final int method468(int arg0, String arg1, byte arg2) {
        field922++;
        if (arg2 >= -6) {
            field909 = (byte[][]) ((byte[][]) null);
        }
        return class181.method1251(arg0, arg1, (byte) -53, true);
    }
}
