import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class500 extends class578 {

    @OriginalMember(owner = "client!lea", name = "n", descriptor = "Lfk;")
    public class199 field7313;

    @OriginalMember(owner = "client!lea", name = "k", descriptor = "I")
    public int field7305;

    @OriginalMember(owner = "client!lea", name = "s", descriptor = "Z")
    public boolean field7310;

    @OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
    public int field7307;

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7314 = new String[] { method3836(method3835("Tt\u001a\u001dGQ\u007f\u0012GE\u0010")), method3836(method3835("C?U\u001d\u0006")), method3836(method3835("Vd\u0017_")), method3836(method3835("Tt\u001a\u001d:\u0010")), method3836(method3835("Tt\u001a\u001d9\u0010")) };

    @OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
    public static int field7304 = 765;

    @OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
    public static int field7306 = 1401;

    @OriginalMember(owner = "client!lea", name = "q", descriptor = "Lvo;")
    public static class782 field7302 = null;

    @OriginalMember(owner = "client!lea", name = "t", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!lea", name = "r", descriptor = "Z")
    public boolean field7303;

    @OriginalMember(owner = "client!lea", name = "j", descriptor = "Z")
    public boolean field7308;

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "Z")
    public boolean field7311;

    @OriginalMember(owner = "client!lea", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7312;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;IZ)Lha;")
    public static final class18 method3833(Canvas arg0, class673 arg1, int arg2, boolean arg3) {
        try {
            field7309++;
            return arg3 ? null : new class194(arg0, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7314[4] + (arg0 == null ? field7314[2] : field7314[1]) + ',' + (arg1 == null ? field7314[2] : field7314[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
    public static void method3834(int arg0) {
        try {
            field7312 = null;
            if (arg0 >= 109) {
                field7302 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7314[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(ILfk;IZ)V")
    public class500(int arg0, class199 arg1, int arg2, boolean arg3) {
        try {
            this.field7313 = arg1;
            this.field7305 = arg0;
            this.field7310 = arg3;
            this.field7307 = arg2;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7314[0] + arg0 + ',' + (arg1 == null ? field7314[2] : field7314[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3835(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3836(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
