import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class681 extends RuntimeException {

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "Ljava/lang/String;")
    public String field9710;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field9709;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field9711 = method4964(method4963("E\u0013,hP"));

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9707 = 0;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field9708;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)Z", line = 4)
    public static final boolean method4961(boolean arg0, int arg1) {
        try {
            if (arg0) {
                method4961(false, 6);
            }
            field9708++;
            return arg1 == 0 || arg1 == 1 || arg1 == 2;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9711 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lr;III[Z)V", line = 15)
    public static final void method4962(class192 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class757.field11125 == class740.field10902) {
            return;
        }
        int var5 = class493.field7420[arg1].method2497((byte) -106, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class293 var7 = class493.field7420[var6];
                if (var7 != null) {
                    var7.method701(arg0, arg2, var5 - var7.method2497((byte) -92, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 47)
    public class681(Throwable arg0, String arg1) {
        this.field9710 = arg1;
        this.field9709 = arg0;
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4963(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4964(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
