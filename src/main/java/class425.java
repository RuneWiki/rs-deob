import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class425 {

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public int field6133;

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
    public int field6129;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "Ljava/lang/String;")
    public String field6124;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "Ljava/lang/String;")
    public String field6132;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public int field6123;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public int field6131;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Ljava/lang/String;")
    public String field6136;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "Ljava/lang/String;")
    public String field6137;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Ljava/lang/String;")
    public String field6138;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6139 = new String[] { method3301(method3300("b\u0014 i5")), method3301(method3300("j[oi\u000b1")), method3301(method3300("wOb+")), method3301(method3300("j[oi\t1")), method3301(method3300("j[oi\n1")), method3301(method3300("j[oitpTg3v1")) };

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "[I")
    public static int[] field6125 = new int[8];

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field6127;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;B)V", line = 6)
    public final void method3297(String arg0, int arg1, int arg2, String arg3, String arg4, int arg5, String arg6, String arg7, byte arg8) {
        try {
            if (arg8 != 52) {
                field6134 = 40;
            }
            field6135++;
            this.field6133 = class280.method2281(20480);
            this.field6137 = arg0;
            this.field6129 = class694.field9700;
            this.field6126 = arg2;
            this.field6123 = arg1;
            this.field6138 = arg7;
            this.field6131 = arg5;
            this.field6136 = arg6;
            this.field6124 = arg4;
            this.field6132 = arg3;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field6139[3] + (arg0 == null ? field6139[2] : field6139[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6139[2] : field6139[0]) + ',' + (arg4 == null ? field6139[2] : field6139[0]) + ',' + arg5 + ',' + (arg6 == null ? field6139[2] : field6139[0]) + ',' + (arg7 == null ? field6139[2] : field6139[0]) + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V", line = 27)
    public static void method3298(byte arg0) {
        try {
            if (arg0 <= 8) {
                field6125 = null;
            }
            field6125 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6139[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 37)
    public static final int method3299(String arg0, byte arg1) {
        try {
            field6128++;
            if (arg1 < 93) {
                method3299(null, (byte) 20);
            }
            return class564.method4218(true, 10, (byte) -102, arg0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6139[1] + (arg0 == null ? field6139[2] : field6139[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 63)
    public class425(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        try {
            this.field6133 = class280.method2281(20480);
            this.field6129 = class694.field9700;
            this.field6124 = arg7;
            this.field6132 = arg2;
            this.field6123 = arg1;
            this.field6131 = arg0;
            this.field6126 = arg6;
            this.field6136 = arg5;
            this.field6137 = arg4;
            this.field6138 = arg3;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field6139[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field6139[2] : field6139[0]) + ',' + (arg3 == null ? field6139[2] : field6139[0]) + ',' + (arg4 == null ? field6139[2] : field6139[0]) + ',' + (arg5 == null ? field6139[2] : field6139[0]) + ',' + arg6 + ',' + (arg7 == null ? field6139[2] : field6139[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3300(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3301(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 25;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
