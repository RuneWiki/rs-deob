import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class341 extends class756 {

    @OriginalMember(owner = "client!db", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5312 = new String[] { method2837(method2836("Tak\n5")), method2837(method2836("K-k``")), method2837(method2836("A:)H")), method2837(method2836("K-kf`")), method2837(method2836("K-ke`")), method2837(method2836("K-kg`")) };

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field5301 = new String[200];

    @OriginalMember(owner = "client!db", name = "y", descriptor = "S")
    public static short field5305 = 205;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field5304 = 1407;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Lup;")
    public static class290 field5303 = new class290();

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Z")
    public static boolean field5310 = false;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field5311 = new String[100];

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    private int field5300;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field5308;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "J")
    public static long field5309;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lkp;I)V", line = 4)
    public final void method41(class514 arg0, int arg1) {
        try {
            arg0.method3896(this.field5300, this.field5302, 4);
            if (arg1 != 9893) {
                method2834((byte) 86);
            }
            field5306++;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5312[5] + (arg0 == null ? field5312[2] : field5312[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 15)
    public static void method2834(byte arg0) {
        try {
            field5303 = null;
            field5301 = null;
            field5311 = null;
            if (arg0 < 88) {
                method2834((byte) 70);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5312[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLib;)V", line = 35)
    public final void method38(byte arg0, class163 arg1) {
        try {
            this.field5300 = arg1.method1453((byte) 89);
            if (arg0 >= 32) {
                field5307++;
                this.field5302 = arg1.method1453((byte) 88);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5312[3] + arg0 + ',' + (arg1 == null ? field5312[2] : field5312[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLjava/net/Socket;)Lvt;", line = 52)
    public static final class319 method2835(int arg0, boolean arg1, Socket arg2) throws IOException {
        try {
            field5308++;
            return arg1 ? null : new class766(arg2, arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5312[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5312[2] : field5312[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2836(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x48);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!db", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2837(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 72;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
