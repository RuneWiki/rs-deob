import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class726 implements class34 {

    @OriginalMember(owner = "client!jha", name = "e", descriptor = "Lgda;")
    private class58 field10651;

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10653 = new String[] { method5277(method5276("0O72Cr")), method5277(method5276("0O72Fr")), method5277(method5276("!\tx2z")), method5277(method5276("0O72;3I?h9r")), method5277(method5276("4R:p")), method5277(method5276("0O72Er")), method5277(method5276("0O72Dr")) };

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "I")
    public static int field10647;

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "Ljava/lang/String;")
    public static String field10649;

    @OriginalMember(owner = "client!jha", name = "g", descriptor = "Ljava/lang/String;")
    public static String field10652;

    @OriginalMember(owner = "client!jha", name = "f", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "I")
    public static int field10648;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "I")
    public static int field10650;

    static {
        new class532("", 73);
        field10647 = -1;
        String var0 = method5277(method5276("\u000fI=rh-I"));
        try {
            var0 = System.getProperty(method5277(method5276("0F }),B8xh("))).toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = method5277(method5276("\u000fI=rh-I"));
        try {
            var1 = System.getProperty(method5277(method5276("0F }),B$on5I"))).toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = method5277(method5276("\u000fI=rh-I"));
        try {
            var2 = System.getProperty(method5277(method5276("5Txrf7B"))).toLowerCase();
        } catch (Exception var9) {
        }
        field10649 = var2.toLowerCase();
        String var3 = method5277(method5276("\u000fI=rh-I"));
        try {
            var3 = System.getProperty(method5277(method5276("5Tx}u9O"))).toLowerCase();
        } catch (Exception var8) {
        }
        field10652 = var3.toLowerCase();
        String var4 = method5277(method5276("\u000fI=rh-I"));
        try {
            var4 = System.getProperty(method5277(method5276("5Txjb(T?si"))).toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = method5277(method5276("$\b"));
        try {
            var5 = System.getProperty(method5277(method5276("/T3n)2H;y"))).toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)I", line = 15)
    public final int method346(byte arg0) {
        try {
            if (arg0 <= 31) {
                method5274(null, -96);
            }
            field10648++;
            return this.field10651.method581(101) ? 100 : this.field10651.method584(0);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10653[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lwq;I)Leda;", line = 31)
    public static final class106 method5274(class176 arg0, int arg1) {
        try {
            if (arg1 >= -7) {
                method5275((byte) -29);
            }
            field10650++;
            class541 var2 = class644.method4665(107, arg0);
            int var3 = arg0.method1623(255);
            return new class106(var2.field7968, var2.field7974, var2.field7973, var2.field7971, var2.field7970, var3);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10653[5] + (arg0 == null ? field10653[4] : field10653[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)Lil;", line = 46)
    public final class7 method345(int arg0) {
        try {
            int var2 = -50 % ((-arg0 - 55) / 60);
            field10646++;
            return class7.field74;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10653[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lgda;)V", line = 57)
    public class726(class58 arg0) {
        try {
            this.field10651 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10653[3] + (arg0 == null ? field10653[4] : field10653[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V", line = 65)
    public static void method5275(byte arg0) {
        try {
            field10652 = null;
            field10649 = null;
            int var1 = 44 % ((-arg0 - 72) / 49);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10653[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5276(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5277(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
