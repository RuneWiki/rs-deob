import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class684 {

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9606 = new String[] { method4903(method4902(".Rv%<")), method4903(method4902(";\t4g")), method4903(method4902("\"\u001a")), method4903(method4902("$\u001avJi")), method4903(method4902("$\u001avIi")), method4903(method4902("$\u001avHi")) };

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Lsb;")
    public static class261 field9591 = new class261(105, 7);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lkl;")
    public static class740 field9603 = new class740();

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Z")
    public static boolean field9604 = false;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "B")
    public byte field9589;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "B")
    public byte field9592;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "B")
    public byte field9597;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "B")
    public byte field9598;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "B")
    public byte field9600;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "B")
    public byte field9602;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "B")
    public byte field9605;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "I")
    public int field9584;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public int field9588;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field9593;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9595;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "S")
    public short field9596;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Z")
    public boolean field9582;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "Z")
    public boolean field9583;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "Z")
    public boolean field9585;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "Z")
    public boolean field9586;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Z")
    public boolean field9587;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Z")
    public boolean field9590;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "Z")
    public boolean field9599;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "Z")
    public boolean field9601;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljv;", line = 8)
    public static final class155 method4899(String arg0, int arg1, boolean arg2) {
        try {
            field9594++;
            class155 var3;
            try {
                if (arg2) {
                    return null;
                }
                var3 = (class155) Class.forName(field9606[2]).getDeclaredConstructor().newInstance();
            } catch (Throwable var5) {
                var3 = new class458();
            }
            var3.field1966 = arg1;
            var3.field1969 = arg0;
            return var3;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field9606[3] + (arg0 == null ? field9606[1] : field9606[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLjava/net/Socket;I)Lgo;", line = 38)
    public static final class28 method4900(byte arg0, Socket arg1, int arg2) throws IOException {
        try {
            if (arg0 != -45) {
                method4899(null, -126, false);
            }
            field9595++;
            return new class705(arg1, arg2);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9606[4] + arg0 + ',' + (arg1 == null ? field9606[1] : field9606[0]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V", line = 61)
    public static void method4901(byte arg0) {
        try {
            int var1 = 30 % ((29 - arg0) / 33);
            field9591 = null;
            field9603 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9606[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4902(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4903(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 124;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
