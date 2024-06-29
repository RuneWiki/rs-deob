import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class740 {

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10527 = new String[] { method5368(method5367("OdQb\u001aw|\r\u007f\u001bC ")), method5368(method5367("OdQW]")), method5368(method5367("OdQT]")), method5368(method5367("aG9")) };

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "Lsb;")
    public static class261 field10521 = new class261(3, -2);

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[C")
    public static char[] field10524 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Z")
    public static boolean field10525 = true;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field10519;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field10520;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field10523;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
    public static int[] field10522;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Lpp;")
    public static final class640 method5365(boolean arg0) {
        try {
            field10519++;
            class72 var1 = null;
            class640 var2 = new class640(class544.field7978, 0);
            try {
                class328 var3 = class651.field9249.method1576("", true, 13);
                while (var3.field4486 == 0) {
                    class449.method3474(20817, 1L);
                }
                if (var3.field4486 == 1) {
                    var1 = (class72) var3.field4487;
                    byte[] var4 = new byte[(int) var1.method750(0)];
                    int var6;
                    for (int var5 = 0; var5 < var4.length; var5 += var6) {
                        var6 = var1.method759(var4.length - var5, var4, var5, (byte) 116);
                        if (var6 == -1) {
                            throw new IOException(field10527[3]);
                        }
                    }
                    var2 = new class640(new class711(var4), class544.field7978, 0);
                }
            } catch (Exception var9) {
            }
            try {
                if (arg0) {
                    return null;
                }
                if (var1 != null) {
                    var1.method757(0);
                }
            } catch (Exception var8) {
            }
            return var2;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10527[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public static void method5366(int arg0) {
        try {
            field10522 = null;
            if (arg0 >= -116) {
                field10526 = -112;
            }
            field10524 = null;
            field10521 = null;
            field10523 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10527[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field10520++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10527[0] + ')');
        }
    }

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5367(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5368(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 36;
                    break;
                case 1:
                    var10005 = 8;
                    break;
                case 2:
                    var10005 = 127;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
