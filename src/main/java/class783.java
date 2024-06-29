import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class783 extends class114 {

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    private int field11306 = -1;

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11310 = new String[] { method5645(method5644("m(=$\u001e")), method5645(method5644("o.\u007f\f")), method5645(method5644("zu=NK")), method5645(method5644("m(=#\u001e")), method5645(method5644("m(=\"\u001e")), method5645(method5644("m(=!\u001e")) };

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "[Lsaa;")
    public static class425[] field11301 = new class425[100];

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "I")
    public static int field11309 = 0;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "Lrj;")
    public static class252 field11302 = new class252();

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "F")
    public static float field11304;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public static int field11300;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field11303;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field11305;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
    public static int field11307;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field11308;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "Ljka;")
    public static class228 field11299;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIII)V")
    public static final void method5642(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field11305++;
            class294 var5 = class146.method1261((long) arg0, -79, arg2);
            var5.method2378(-84);
            var5.field4133 = arg1;
            var5.field4136 = arg3;
            var5.field4140 = arg4;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field11310[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ILwfa;)V")
    public final void method115(int arg0, class286 arg1) {
        try {
            field11300++;
            arg1.method2316(this.field11306, true);
            if (arg0 != 95) {
                field11309 = -25;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11310[0] + arg0 + ',' + (arg1 == null ? field11310[1] : field11310[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Ljc;I)V")
    public final void method116(class711 arg0, int arg1) {
        try {
            if (arg1 != -27800) {
                field11304 = -0.029996827F;
            }
            field11308++;
            this.field11306 = arg0.method5116((byte) -114);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11310[5] + (arg0 == null ? field11310[1] : field11310[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
    public static void method5643(byte arg0) {
        try {
            field11302 = null;
            if (arg0 != 97) {
                method5643((byte) 70);
            }
            field11301 = null;
            field11299 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11310[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5644(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5645(char[] arg0) {
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
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
