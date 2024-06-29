import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class636 {

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public int field9127;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field9122;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public int field9124;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field9126;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9131 = new String[] { method4611(method4610("5\u0010\u000fi^\u0016\u0001St_\"]")), method4611(method4610("5\u0010\u000f!X+\u001cU#\u0019")), method4611(method4610("5\u0010\u000f\\\u0019")), method4611(method4610("5\u0010\u000f_\u0019")) };

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Z")
    public static boolean field9123 = false;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lfg;")
    public static class136 field9125 = new class136();

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "F")
    public static float field9130 = 0.0F;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field9128;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field9129;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4608(int arg0, byte arg1, int arg2) {
        try {
            field9129++;
            int var3 = 115 % ((arg1 - 31) / 58);
            return (arg2 & 0x60000) != 0 | class344.method2887(arg0, -30958, arg2) || class553.method4098(-7851, arg2, arg0) || class133.method1253(arg2, -107, arg0);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9131[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public static void method4609(int arg0) {
        try {
            field9125 = null;
            if (arg0 != 393216) {
                method4608(72, (byte) -45, 36);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9131[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field9128++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9131[0] + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(IIII)V")
    public class636(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field9127 = arg3;
            this.field9122 = arg1;
            this.field9124 = arg0;
            this.field9126 = arg2;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9131[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4610(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4611(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
