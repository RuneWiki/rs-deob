import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class345 {

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "[S")
    public short[] field5601;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "J")
    public long field5602;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "[S")
    public short[] field5604;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "[I")
    public int[] field5603;

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5608 = new String[] { method2892(method2891("z\u000ezdx")), method2892(method2891("oU8&")), method2892(method2891("rA5d9hN=>;)")), method2892(method2891("rA5dD)")) };

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Lhl;")
    public static class556 field5605 = new class556(1, -1);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "[I")
    public static int[] field5606 = new int[1];

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "Lgda;")
    public static class58 field5607;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
    public static void method2890(int arg0) {
        try {
            if (arg0 < 51) {
                method2890(126);
            }
            field5607 = null;
            field5606 = null;
            field5605 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5608[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(J[I[S[S)V")
    public class345(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        try {
            this.field5601 = arg2;
            this.field5602 = arg0;
            this.field5604 = arg3;
            this.field5603 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5608[2] + arg0 + ',' + (arg1 == null ? field5608[1] : field5608[0]) + ',' + (arg2 == null ? field5608[1] : field5608[0]) + ',' + (arg3 == null ? field5608[1] : field5608[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "()V")
    protected class345() {
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2891(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!saa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2892(char[] arg0) {
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
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
