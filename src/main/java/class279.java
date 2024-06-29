import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class279 {

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4194 = new String[] { method2294(method2293("S\r\u001fE\u001c")), method2294(method2293("S\r\u001fD\u001c")), method2294(method2293("S\r\u001fF\u001c")) };

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
    public static int[] field4186 = new int[32];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "[I")
    public static int[] field4185 = new int[8];

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "Lqha;")
    public static class112 field4188 = new class112(8);

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4192 = 0;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Lel;")
    public static class573 field4191 = new class573(54, 6);

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "F")
    public static float field4193;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Lsa;")
    public static class216 field4190;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)I")
    public static final int method2290(byte arg0) {
        try {
            field4189++;
            class66 var1 = class610.field8913;
            boolean var2 = false;
            if (class289.field4305.field812.method1610(false) != 0) {
                Canvas var3 = new Canvas();
                var3.setSize(100, 100);
                var2 = true;
                var1 = class289.method2345(0, var3, 0, 126, null, null);
            }
            long var4 = class430.method3299(79);
            for (int var6 = 0; var6 < 10000; var6++) {
                var1.method545(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
            }
            if (arg0 != -79) {
                method2292(6, false, -106);
            }
            int var7 = (int) (class430.method3299(123) - var4);
            var1.method593(-16777216, 0, (byte) -82, 100, 100, 0);
            if (var2) {
                var1.method579((byte) -62);
            }
            return var7;
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4194[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)V")
    public static void method2291(boolean arg0) {
        try {
            field4191 = null;
            if (arg0) {
                field4188 = null;
                field4185 = null;
                field4190 = null;
                field4186 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4194[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)V")
    public static final void method2292(int arg0, boolean arg1, int arg2) {
        try {
            class388.field5859 = arg2 - class161.field2171;
            class348.field5385 = arg0 - class161.field2167;
            if (!arg1) {
                field4187++;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4194[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2293(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2294(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
