import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class105 {

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1382 = new String[] { method1005(method1004("p(w\b6<")), method1005(method1004("z7zJ")), method1005(method1004("ol8\b\b")), method1005(method1004("p(w\b1<")), method1005(method1004("p(w\b4<")), method1005(method1004("p(w\b7<")) };

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "[[[Lnaa;")
    public static class621[][][] field1377;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)I")
    public static final int method1000(int arg0, int arg1) {
        try {
            int var2 = 58 / ((arg0 + 63) / 54);
            field1379++;
            return arg1 >>> 8;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1382[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
    public static void method1001(int arg0) {
        try {
            field1377 = null;
            if (arg0 <= 78) {
                method1003((byte) -67, null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1382[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IBIIII)V")
    public static final void method1002(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field1380++;
            int var6 = class679.method4875(class50.field717, class557.field8113, arg2, -1);
            int var7 = class679.method4875(class50.field717, class557.field8113, arg4, -1);
            int var8 = class679.method4875(class507.field7453, class335.field4844, arg0, -1);
            int var9 = class679.method4875(class507.field7453, class335.field4844, arg3, -1);
            if (arg1 > 28) {
                for (int var10 = var6; var10 <= var7; var10++) {
                    class576.method4282(-7, var8, arg5, class529.field7682[var10], var9);
                }
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1382[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(BLjka;)Ljava/lang/String;")
    public static final String method1003(byte arg0, class228 arg1) {
        try {
            int var2 = -114 / ((29 - arg0) / 63);
            field1381++;
            if (arg1.field3300 == null || arg1.field3300.length() == 0) {
                return arg1.field3294 == null || arg1.field3294.length() <= 0 ? arg1.field3292 : arg1.field3292 + class537.field7862.method4068((byte) -114, class405.field5883) + arg1.field3294;
            } else if (arg1.field3294 == null || arg1.field3294.length() <= 0) {
                return arg1.field3292 + class537.field7862.method4068((byte) -58, class405.field5883) + arg1.field3300;
            } else {
                return arg1.field3292 + class537.field7862.method4068((byte) -102, class405.field5883) + arg1.field3294 + class537.field7862.method4068((byte) -117, class405.field5883) + arg1.field3300;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1382[3] + arg0 + ',' + (arg1 == null ? field1382[1] : field1382[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1004(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1005(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
