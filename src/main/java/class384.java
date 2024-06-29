import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class384 extends OutputStream {

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5615 = new String[] { method3029(method3028("\"$\u0001#%")), method3029(method3028("\"$\u0001&%")), method3029(method3028("\"$\u0001\u0010\u007f$6JO")), method3029(method3028("\"$\u0001$%")), method3029(method3028("6l\u0001Ip")), method3029(method3028("#7C\u000b")), method3029(method3028("\"$\u0001%%")) };

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lsb;")
    public static class261 field5612 = new class261(18, 6);

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 3)
    public static void method3024(int arg0) {
        try {
            field5612 = null;
            if (arg0 != 32590) {
                field5612 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5615[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "write", descriptor = "(I)V", line = 13)
    public final void write(int arg0) throws IOException {
        try {
            field5611++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5615[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILrt;I)J", line = 24)
    public static final long method3025(boolean arg0, int arg1, class675 arg2, int arg3) {
        try {
            field5610++;
            long var4 = 4194304L;
            long var6 = Long.MIN_VALUE;
            class789 var8 = class101.field1359.method2832(125, arg2.method584(arg0));
            long var9 = (long) (arg1 | arg3 << 7 | arg2.method572(97) << 14 | arg2.method585(-20175) << 20 | 0x40000000);
            if (var8.field11409 == 0) {
                var9 |= var6;
            }
            if (var8.field11451 == 1) {
                var9 |= var4;
            }
            return var9 | (long) arg2.method584(false) << 32;
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field5615[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5615[5] : field5615[4]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILlga;)Lifa;", line = 51)
    public static final class715 method3026(int arg0, int arg1, int arg2, class47 arg3) {
        try {
            field5614++;
            class711 var4 = new class711(arg3.method512(arg2, arg1, (byte) -57));
            class715 var5 = new class715(arg2, var4.method5144(-16414), var4.method5144(-16414), var4.method5113(18443), var4.method5113(arg0 ^ 0xFFFFB7F4), var4.method5128(0) == 1, var4.method5128(arg0 ^ arg0), var4.method5128(0));
            int var6 = var4.method5128(0);
            for (int var7 = 0; var7 < var6; var7++) {
                var5.field10172.method3984(new class785(var4.method5128(0), var4.method5116((byte) -122), var4.method5116((byte) -108), var4.method5116((byte) -125), var4.method5116((byte) -122), var4.method5116((byte) -125), var4.method5116((byte) -128), var4.method5116((byte) -121), var4.method5116((byte) -125)), 0);
            }
            var5.method5186(true);
            return var5;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field5615[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field5615[5] : field5615[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 76)
    public static final void method3027(int arg0) {
        try {
            if (arg0 != 5382) {
                method3025(false, -9, null, -116);
            }
            field5613++;
            if (class172.field2279 != -1) {
                class742.method5378(class172.field2279, arg0 ^ 0x5858, false, -1, -1);
                class172.field2279 = -1;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5615[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3028(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!of", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3029(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
