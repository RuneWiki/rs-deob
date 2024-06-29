import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class318 extends class711 {

    @OriginalMember(owner = "client!fca", name = "Jb", descriptor = "[Ljava/lang/String;")
    private static final String[] field4355 = new String[] { method2530(method2529("8'\u0004,\"v")), method2530(method2529("8'\u0004,%v")), method2530(method2529("8'\u0004,&v")), method2530(method2529("8'\u0004,$v")), method2530(method2529("8'\u0004,#v")) };

    @OriginalMember(owner = "client!fca", name = "Gb", descriptor = "[Z")
    public static boolean[] field4350 = new boolean[5];

    @OriginalMember(owner = "client!fca", name = "Fb", descriptor = "I")
    public static int field4354 = 0;

    @OriginalMember(owner = "client!fca", name = "Hb", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!fca", name = "Db", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!fca", name = "Eb", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!fca", name = "Ib", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(FZ)V", line = 6)
    public final void method2524(float arg0, boolean arg1) {
        try {
            ++field4353;
            if (arg1) {
                int var3 = Stream.floatToRawIntBits(arg0);
                super.field9996[super.field9945++] = (byte) (var3 >> 24);
                super.field9996[super.field9945++] = (byte) (var3 >> 16);
                super.field9996[super.field9945++] = (byte) (var3 >> 8);
                super.field9996[super.field9945++] = (byte) var3;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4355[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZIII)V", line = 23)
    public static final void method2525(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg1) {
                field4354 = -98;
            }
            if (~arg0 <= ~arg2) {
                class576.method4282(-7, arg2, arg3, class529.field7682[arg4], arg0);
            } else {
                class576.method4282(-7, arg0, arg3, class529.field7682[arg4], arg2);
            }
            ++field4351;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4355[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(I)V", line = 45)
    public class318(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "(B)V", line = 48)
    public static void method2526(byte arg0) {
        try {
            int var1 = 93 / ((arg0 - -58) / 50);
            field4350 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4355[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IF)V", line = 59)
    public final void method2527(int arg0, float arg1) {
        try {
            ++field4349;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field9996[super.field9945++] = (byte) var3;
            if (arg0 != 160744152) {
                method2528(-73, 125, -57);
            }
            super.field9996[super.field9945++] = (byte) (var3 >> 8);
            super.field9996[super.field9945++] = (byte) (var3 >> 16);
            super.field9996[super.field9945++] = (byte) (var3 >> 24);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4355[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)Z", line = 75)
    public static final boolean method2528(int arg0, int arg1, int arg2) {
        try {
            ++field4352;
            if (arg1 != 2048) {
                return false;
            } else {
                return (2048 & arg2) != 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field4355[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2529(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 103);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2530(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 2;
                    break;
                default:
                    var10005 = 103;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
