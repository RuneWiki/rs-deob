import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class93 {

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lvq;")
    public static class24 field1156 = new class24(46, 12);

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1158 = 2;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "[Lbf;")
    public static class336[] field1163;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 7)
    public static final void method630(int arg0) {
        field1152++;
        if (~class318.field4672 == arg0) {
            return;
        }
        int var1 = class223.field3295.method411(0);
        int var2 = class223.field3295.method415(arg0 - 93);
        if (class78.field986 != null) {
            var1 = class78.field986.method2437((byte) 26);
            var2 = class78.field986.method2440(-1);
        }
        class25.method254(var2, 0, var1, class318.field4672, 0, 0, 0, (byte) 86, class214.field3016, class375.field5473);
        if (class418.field6031 != null) {
            class420.method2596(var2, 0, var1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZLjava/lang/String;)V", line = 32)
    public static final void method631(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
        field1154++;
        class223 var5 = class99.method654(-1, arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3219 != null) {
            class288 var6 = new class288();
            var6.field4217 = var5;
            var6.field4218 = var5.field3219;
            var6.field4219 = arg0;
            var6.field4216 = arg4;
            class107.method762(var6);
        }
        boolean var7 = arg3;
        if (var5.field3357 != 0) {
            var7 = class367.method2337((byte) 114, var5);
        }
        if (!var7 || !client.method1811(var5).method2165(arg0 - 1, (byte) -117)) {
            return;
        }
        if (arg0 == 1) {
            class276.field4084++;
            class257.method1773((byte) -10, class18.field287);
            class44.method365(arg1, arg2, 73, var5.field3363);
        }
        if (arg0 == 2) {
            class296.field4307++;
            class257.method1773((byte) -10, class384.field5623);
            class44.method365(arg1, arg2, 80, var5.field3363);
        }
        if (arg0 == 3) {
            class279.field4112++;
            class257.method1773((byte) -10, class22.field313);
            class44.method365(arg1, arg2, 116, var5.field3363);
        }
        if (arg0 == 4) {
            class257.method1773((byte) -10, class452.field6672);
            class182.field2560++;
            class44.method365(arg1, arg2, 123, var5.field3363);
        }
        if (arg0 == 5) {
            class257.method1773((byte) -10, class260.field3859);
            class67.field883++;
            class44.method365(arg1, arg2, -53, var5.field3363);
        }
        if (arg0 == 6) {
            class372.field5438++;
            class257.method1773((byte) -10, class249.field3668);
            class44.method365(arg1, arg2, 73, var5.field3363);
        }
        if (arg0 == 7) {
            class100.field1253++;
            class257.method1773((byte) -10, class252.field3707);
            class44.method365(arg1, arg2, 94, var5.field3363);
        }
        if (arg0 == 8) {
            class257.method1773((byte) -10, class259.field3822);
            class326.field4785++;
            class44.method365(arg1, arg2, 113, var5.field3363);
        }
        if (arg0 == 9) {
            class331.field4909++;
            class257.method1773((byte) -10, class157.field2095);
            class44.method365(arg1, arg2, 81, var5.field3363);
        }
        if (arg0 == 10) {
            class257.method1773((byte) -10, class366.field5301);
            class171.field2231++;
            class44.method365(arg1, arg2, 118, var5.field3363);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lct;I)V", line = 149)
    public static final void method632(class104 arg0, int arg1) {
        class295.field4294 = 0;
        if (arg1 != 2) {
            return;
        }
        field1153++;
        class204.field2871 = 0;
        class343.field5049 = new class304();
        class452.field6675 = new class290[1024];
        class264.method1821(0, arg0);
        class385.method2434(14, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZ)V", line = 166)
    public static final void method633(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field1159 = 93;
        }
        field1162++;
        class125 var3 = class56.method428(arg1, 12, -3636);
        var3.method846(26848);
        var3.field1657 = arg0;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 182)
    public static void method634(int arg0) {
        if (arg0 != 8224) {
            method634(-95);
        }
        field1156 = null;
        field1163 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZII)I", line = 197)
    public static final int method635(boolean arg0, int arg1, int arg2) {
        field1155++;
        int var3 = arg2 >>> 24;
        if (arg0) {
            int var4 = ((arg2 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg2 & 0xFF00) * var3 & 0xFF0000) >>> 8;
            int var5 = 255 - var3;
            return (((arg1 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg1 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLjava/lang/String;II[B)I", line = 213)
    public static final int method636(int arg0, byte arg1, String arg2, int arg3, int arg4, byte[] arg5) {
        field1160++;
        if (arg1 >= -72) {
            return -122;
        }
        int var6 = arg4 - arg3;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg5[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg5[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg5[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg5[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg5[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg5[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg5[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg5[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg5[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg5[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg5[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg5[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg5[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg5[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg5[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg5[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg5[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg5[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg5[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg5[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg5[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg5[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg5[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg5[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg5[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg5[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg5[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg5[arg0 + var7] = -97;
            } else {
                arg5[arg0 + var7] = 63;
            }
        }
        return var6;
    }
}
