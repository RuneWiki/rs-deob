import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class728 {

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10556 = new String[] { method5314(method5313("T#5*=")), method5314(method5313("T#5+=")), method5314(method5313("T#5(=")) };

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Lef;")
    public static class513 field10549 = new class513();

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lqha;")
    public static class112 field10554 = new class112(16);

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Z")
    public static boolean field10555 = false;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field10551;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Lika;")
    public static class447 field10553;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lef;")
    public static class513 field10550;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BI)V")
    public static final void method5310(byte arg0, int arg1) {
        try {
            if (arg0 >= -30) {
                method5312(-105, -105, 74, (byte) 114, -22);
            }
            class124.field1453 = arg1;
            field10551++;
            class178 var2 = class548.field8184;
            synchronized (class548.field8184) {
                class548.field8184.method1559(0);
            }
            class178 var3 = class514.field7406;
            synchronized (class514.field7406) {
                class514.field7406.method1559(0);
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10556[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method5311(int arg0) {
        try {
            field10550 = null;
            field10554 = null;
            field10549 = null;
            if (arg0 != 0) {
                field10555 = false;
            }
            field10553 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10556[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIBI)V")
    public static final void method5312(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        try {
            field10552++;
            for (int var5 = 0; var5 < class669.field9721; var5++) {
                Rectangle var6 = class361.field5506[var5];
                if ((var6.x + var6.width) > arg0 && (arg0 + arg4) > var6.x && arg2 < (var6.y + var6.height) && var6.y < arg1 + arg2) {
                    class26.field321[var5] = true;
                }
            }
            if (arg3 < 6) {
                method5311(86);
            }
            class758.method5495((byte) 50, arg1 + arg2, arg2, arg0 + arg4, arg0);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field10556[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5313(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5314(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
