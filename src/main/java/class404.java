import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class404 extends class330 {

    @OriginalMember(owner = "client!sia", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5877 = new String[] { method3170(method3169("\u001e\u000f|:\u0003E")), method3170(method3169("\u001e\u000f|:\nE")), method3170(method3169("\u0016H3:<")), method3170(method3169("\u0003\u0013qx")), method3170(method3169("\u001e\u000f|:\u0006E")) };

    @OriginalMember(owner = "client!sia", name = "A", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!sia", name = "y", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!sia", name = "x", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(FI)V")
    public final void method2598(float arg0, int arg1) {
        try {
            ++field5874;
            super.field4511 = arg0;
            if (arg1 != -6546) {
                field5873 = -86;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5877[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Ljc;B)Lsq;")
    public static final class742 method3168(class711 arg0, byte arg1) {
        try {
            ++field5875;
            class252 var2 = class750.method5433((byte) -72)[arg0.method5128(0)];
            class657 var3 = class240.method1988(77)[arg0.method5128(0)];
            int var4 = arg0.method5087((byte) -26);
            int var5 = arg0.method5087((byte) -26);
            int var6 = arg0.method5116((byte) -111);
            int var7 = arg0.method5116((byte) -127);
            int var8 = arg0.method5087((byte) -26);
            int var9 = arg0.method5113(18443);
            int var10 = arg0.method5113(18443);
            if (arg1 != -86) {
                method3168((class711) null, (byte) 73);
            }
            return new class742(var2, var3, var4, var5, var6, var7, var8, var9, var10);
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field5877[1] + (arg0 != null ? field5877[2] : field5877[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "(IIIIIF)V")
    public class404(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IIII)V")
    public final void method2596(int arg0, int arg1, int arg2, int arg3) {
        try {
            super.field4500 = arg0;
            if (arg2 != 2) {
                field5873 = 23;
            }
            super.field4503 = arg3;
            super.field4513 = arg1;
            ++field5876;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field5877[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3169(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3170(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 109;
                    break;
                case 1:
                    var10005 = 102;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
