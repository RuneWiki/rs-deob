import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class623 extends OutputStream {

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8913 = new String[] { method4581(method4580("o\u001dEz")), method4581(method4580("v\u001f\u0007WW")), method4581(method4580("zF\u00078\u0002")), method4581(method4580("v\u001f\u0007a\rh\u001cL>")), method4581(method4580("v\u001f\u0007TW")), method4581(method4580("v\u001f\u0007UW")) };

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field8909 = 0;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field8912;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V", line = 6)
    public static final void method4577(File arg0, String arg1, int arg2) {
        try {
            field8908++;
            class231.field3344.put(arg1, arg0);
            if (arg2 != -5) {
                field8909 = -30;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8913[1] + (arg0 == null ? field8913[0] : field8913[2]) + ',' + (arg1 == null ? field8913[0] : field8913[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BI)Lkka;", line = 20)
    public static final class776 method4578(byte arg0, int arg1) {
        try {
            field8912++;
            class776 var2 = new class776(arg1, false);
            return arg0 == 47 ? var2 : null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8913[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)Luda;", line = 42)
    public static final class302 method4579(int arg0, int arg1, int arg2) {
        try {
            field8910++;
            class302 var3 = new class302();
            var3.field4201 = arg2 + 1 + 5;
            var3.field4198 = arg0 + arg1 + 5;
            var3.field4214 = -1;
            var3.field4196 = -1;
            var3.field4202 = new int[var3.field4201][var3.field4198];
            var3.method2432(true);
            return var3;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field8913[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "write", descriptor = "(I)V", line = 58)
    public final void write(int arg0) throws IOException {
        try {
            field8911++;
            throw new IOException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8913[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4580(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ww", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4581(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 41;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
