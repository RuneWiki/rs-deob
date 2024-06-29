import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class550 implements class543 {

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public int field8202;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8203 = new String[] { method4146(method4145("'c|\u001fR")), method4146(method4145("<{>1")), method4146(method4145(") |s\u0007")), method4146(method4145("'c|\u001cR")), method4146(method4145("'c|a\u0013<g&cR")), method4146(method4145("'c|)\u0015\u0001z 4\u00145&")) };

    @OriginalMember(owner = "client!um", name = "c", descriptor = "I")
    public static int field8201 = 0;

    @OriginalMember(owner = "client!um", name = "f", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!um", name = "e", descriptor = "I")
    public static int field8199;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "Lla;")
    public static class476 field8195;

    @OriginalMember(owner = "client!um", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field8196++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8203[5] + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V")
    public static void method4143(int arg0) {
        try {
            if (arg0 != 0) {
                field8200 = 52;
            }
            field8195 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8203[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I[S)[S")
    public static final short[] method4144(int arg0, short[] arg1) {
        try {
            int var2 = 71 / ((arg0 + 83) / 41);
            field8197++;
            if (arg1 == null) {
                return null;
            } else {
                short[] var3 = new short[arg1.length];
                class467.method3552(arg1, 0, var3, 0, arg1.length);
                return var3;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8203[0] + arg0 + ',' + (arg1 == null ? field8203[1] : field8203[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class550(String arg0, int arg1) {
        try {
            this.field8202 = arg1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8203[4] + (arg0 == null ? field8203[1] : field8203[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4145(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!um", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4146(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
