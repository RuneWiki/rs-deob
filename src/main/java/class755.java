import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class755 extends class206 {

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10984 = new String[] { method5485(method5484("n\u0015\u000bC\u0013")), method5485(method5484("n\u0015\u000bB\u0013")) };

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
    public static int field10982;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field10983;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILwca;)V")
    public abstract void method1990(int arg0, class705 arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method5482(boolean arg0) {
        try {
            if (!arg0) {
                field10983 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10984[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLib;)V")
    public abstract void method1992(byte arg0, class163 arg1);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)V")
    public static final void method5483(int arg0, boolean arg1) {
        try {
            int var2 = -101 % ((-arg0 - 22) / 47);
            field10982++;
            if (arg1) {
                if (class742.field10801 != -1) {
                    class273.method2258((byte) 21, class742.field10801);
                }
                for (class454 var3 = (class454) class661.field9563.method971(347); var3 != null; var3 = (class454) class661.field9563.method973(true)) {
                    if (!var3.method1823(0)) {
                        var3 = (class454) class661.field9563.method971(347);
                        if (var3 == null) {
                            break;
                        }
                    }
                    class440.method3381(var3, 0, true, false);
                }
                class742.field10801 = -1;
                class661.field9563 = new class112(8);
                class29.method200(4096);
                class742.field10801 = class9.field89;
                class580.method4335((byte) 62, false);
                class649.method4771((byte) -12);
                class782.method5666(class742.field10801);
            }
            class765.field11059 = true;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10984[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5484(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5485(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 59;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
