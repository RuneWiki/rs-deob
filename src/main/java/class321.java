import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class321 extends class206 {

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public volatile int field5069 = -1;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field5066;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5072 = new String[] { method2723(method2722("_I\u001dE\u001f")), method2723(method2722("G\u0006\u001d*J")), method2723(method2722("_I\u001d8^RAG:\u001f")), method2723(method2722("R]_h")), method2723(method2722("_I\u001dF\u001f")) };

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lwia;")
    public static class790 field5070 = new class790(68, 4);

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field5071 = -50;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "J")
    public static long field5068;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 8)
    public static void method2720(int arg0) {
        try {
            if (arg0 != 0) {
                method2720(41);
            }
            field5070 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5072[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBII)V", line = 18)
    public static final void method2721(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        try {
            field5067++;
            int var5 = 81 % ((arg2 + 20) / 46);
            for (int var6 = 0; var6 < class669.field9721; var6++) {
                Rectangle var7 = class361.field5506[var6];
                if (var7.x + var7.width > arg4 && var7.x < arg0 + arg4 && (var7.y + var7.height) > arg1 && arg1 + arg3 > var7.y) {
                    class214.field3265[var6] = true;
                }
            }
            class758.method5495((byte) 50, arg1 + arg3, arg1, arg0 + arg4, arg4);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5072[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 45)
    public class321(String arg0) {
        try {
            this.field5066 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5072[2] + (arg0 == null ? field5072[3] : field5072[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2722(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2723(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
