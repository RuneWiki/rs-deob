import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class127 {

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1500 = new String[] { method1113(method1112("\u0013M3\u0007\u001eJ")), method1113(method1112("\u0013M3\u0007\u0013J")), method1113(method1112("\u0013M3\u0007\u0011J")), method1113(method1112("\u0019\u0000|\u0007$")), method1113(method1112("\u0013M3\u0007\u0010J")), method1113(method1112("\f[>E")) };

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "Lwia;")
    public static class790 field1497 = new class790(52, 7);

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BII[B)[B")
    public static final byte[] method1108(byte arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field1496++;
            byte[] var4;
            if (arg2 <= 0) {
                var4 = arg3;
            } else {
                var4 = new byte[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4[var5] = arg3[arg2 + var5];
                }
            }
            if (arg0 >= -8) {
                method1111(32, 118);
            }
            class670 var6 = new class670();
            var6.method4927((byte) 120);
            var6.method4925((byte) -110, (long) (arg1 * 8), var4);
            byte[] var7 = new byte[64];
            var6.method4934((byte) 116, 0, var7);
            return var7;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1500[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1500[5] : field1500[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIZ)Lss;")
    public static final class454 method1109(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            if (!arg0) {
                method1109(true, 87, -40, 18, false);
            }
            field1495++;
            class454 var5 = new class454();
            var5.field6635 = arg1;
            var5.field6640 = arg2;
            class661.field9563.method968((byte) -111, (long) arg3, var5);
            class737.method5379((byte) 123, arg2);
            class541 var6 = class461.method3513(arg3, 127);
            if (var6 != null) {
                class115.method1013(true, var6);
            }
            if (class502.field7260 != null) {
                class115.method1013(true, class502.field7260);
                class502.field7260 = null;
            }
            class159.method1356(255);
            if (var6 != null) {
                class656.method4813(var6, -35646576, !arg4);
            }
            if (!arg4) {
                class782.method5666(arg2);
            }
            if (!arg4 && class742.field10801 != -1) {
                class781.method5644(class742.field10801, 72, 1);
            }
            return var5;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1500[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public static void method1110(byte arg0) {
        try {
            if (arg0 <= 38) {
                field1497 = null;
            }
            field1497 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1500[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)V")
    public static final void method1111(int arg0, int arg1) {
        try {
            class628.field9191 = arg1;
            field1499++;
            class417.field6157.method1559(arg0);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1500[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1112(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1113(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
