import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class501 extends class258 {

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "Ljava/net/Socket;")
    private Socket field7503;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "Lss;")
    private class457 field7498;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "Lnia;")
    private class674 field7501;

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7508 = new String[] { method3782(method3781("C+ygi\u0004")), method3782(method3781("C+ygl\u0004")), method3782(method3781("Wb6gU")), method3782(method3781("C+ygm\u0004")), method3782(method3781("B9t%")), method3782(method3781("I?")), method3782(method3781("^%y")), method3782(method3781("C+ygo\u0004")), method3782(method3781("C+ygn\u0004")), method3782(method3781("C+ygj\u0004")), method3782(method3781("C+yg\u0014E\"q=\u0016\u0004")), method3782(method3781("C+ygNE\"y%AV)0")), method3782(method3781("C+ygk\u0004")) };

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "Liha;")
    public static class29 field7496 = new class29(64);

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "Z")
    public static boolean field7499 = false;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!oga", name = "p", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field7505;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oga", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field7506;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oga", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7507;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field7494;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public final void method2173(byte arg0) {
        try {
            this.field7498.method3546(1);
            if (arg0 == -43) {
                field7505++;
                this.field7501.method4877(6);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7508[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Z")
    public final boolean method2171(byte arg0, int arg1) throws IOException {
        try {
            if (arg0 > -87) {
                this.method2170(74);
            }
            field7493++;
            return this.field7498.method3548(1, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7508[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)V")
    public static void method3778(int arg0) {
        try {
            field7496 = null;
            field7494 = null;
            if (arg0 != -18844) {
                field7494 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7508[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)I")
    public static final int method3779(int arg0) {
        try {
            field7495++;
            int var1 = arg0;
            Field[] var2 = (field7506 == null ? (field7506 = method3780(field7508[5])) : field7506).getDeclaredFields();
            Field[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Field var5 = var3[var4];
                if ((field7507 == null ? (field7507 = method3780(field7508[6])) : field7507).isAssignableFrom(var5.getType())) {
                    var1++;
                }
            }
            return var1 + 1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7508[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([BIII)I")
    public final int method2172(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            if (arg1 != -16392) {
                this.finalize();
            }
            field7502++;
            return this.field7498.method3547(12251, arg3, arg0, arg2);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7508[12] + (arg0 == null ? field7508[4] : field7508[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public final void method2170(int arg0) {
        try {
            if (arg0 > -112) {
                this.field7498 = null;
            }
            field7504++;
            try {
                this.field7503.close();
            } catch (IOException var3) {
            }
            this.field7498.method3549(-4105);
            this.field7501.method4878((byte) -71);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7508[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            field7497++;
            this.method2170(-119);
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7508[11] + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class501(Socket arg0, int arg1) throws IOException {
        try {
            this.field7503 = arg0;
            this.field7503.setSoTimeout(30000);
            this.field7503.setTcpNoDelay(true);
            this.field7498 = new class457(this.field7503.getInputStream(), arg1);
            this.field7501 = new class674(this.field7503.getOutputStream(), arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7508[10] + (arg0 == null ? field7508[4] : field7508[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "([BZII)V")
    public final void method2169(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        try {
            field7500++;
            this.field7501.method4874((byte) -2, arg0, arg3, arg2);
            if (!arg1) {
                this.finalize();
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7508[3] + (arg0 == null ? field7508[4] : field7508[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3780(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3781(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3782(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
