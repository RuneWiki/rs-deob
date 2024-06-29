import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class90 {

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1342 = new String[] { method886(method885("\t4g\u00011G")), method886(method885("\t4g\u00012G")), method886(method885("\u0014y(\u0001\r")), method886(method885("\u0001\"jC")), method886(method885("\t4g\u00013G")) };

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "[I")
    public static int[] field1336 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "Lat;")
    public static class398 field1334 = new class398();

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "[I")
    public static int[] field1341 = new int[2];

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public int field1340;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Lgr;")
    public class461 field1338;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "[I")
    public int[] field1339;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
    public static void method882(int arg0) {
        try {
            if (arg0 == -1) {
                field1334 = null;
                field1341 = null;
                field1336 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1342[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(BI)I")
    public static final int method883(byte arg0, int arg1) {
        try {
            int var4 = arg1 - 1;
            field1337++;
            int var5 = var4 | var4 >>> 1;
            int var6 = var5 | var5 >>> 2;
            int var7 = var6 | var6 >>> 4;
            if (arg0 <= 31) {
                method882(50);
            }
            var4 = var7 | var7 >>> 8;
            var4 |= var4 >>> 16;
            return var4 + 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1342[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILoi;)V")
    public static final void method884(int arg0, int arg1, class77 arg2) {
        try {
            if (arg0 == 1676468897) {
                field1335++;
                int var3 = -1;
                int var4 = 0;
                if (arg2.field1195 > class431.field6776) {
                    class708.method5145(arg2, 7732);
                } else if (class431.field6776 <= arg2.field1115) {
                    class177.method1692(-124, arg2);
                } else {
                    class386.method3151(false, arg2, (byte) -128);
                    var3 = class135.field1916;
                    var4 = class167.field2709;
                }
                if (arg2.field9985 < 512 || arg2.field9983 < 512 || (class126.field1823 - 1) * 512 <= arg2.field9985 || arg2.field9983 >= class169.field2725 * 512 - 512) {
                    arg2.field1167 = -1;
                    arg2.field1115 = 0;
                    var3 = -1;
                    var4 = 0;
                    arg2.field1195 = 0;
                    arg2.field1194 = null;
                    arg2.field9985 = arg2.field1201[0] * 512 + arg2.method804(true) * 256;
                    arg2.field9983 = arg2.field1200[0] * 512 + arg2.method804(true) * 256;
                    arg2.method807((byte) 15);
                    for (int var5 = 0; var5 < arg2.field1192.length; var5++) {
                        arg2.field1192[var5].field7459 = -1;
                    }
                }
                if (class438.field6846 == arg2 && (arg2.field9985 < 6144 || arg2.field9983 < 6144 || ((class126.field1823 - 12) * 512) <= arg2.field9985 || (class169.field2725 - 12) * 512 <= arg2.field9983)) {
                    var3 = -1;
                    var4 = 0;
                    arg2.field1195 = 0;
                    arg2.field1115 = 0;
                    arg2.field1167 = -1;
                    arg2.field1194 = null;
                    arg2.field9985 = arg2.field1201[0] * 512 + arg2.method804(true) * 256;
                    arg2.field9983 = arg2.field1200[0] * 512 + arg2.method804(true) * 256;
                    arg2.method807((byte) 15);
                    for (int var6 = 0; var6 < arg2.field1192.length; var6++) {
                        arg2.field1192[var6].field7459 = -1;
                    }
                }
                int var7 = class578.method4233(arg2, false);
                class548.method4067(arg2, -256);
                class83.method850(var3, var7, arg2, var4, -1);
                class305.method2620(-75, var3, arg2);
                class131.method1243(arg2, arg0 - 1676468772);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1342[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1342[3] : field1342[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method885(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method886(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
