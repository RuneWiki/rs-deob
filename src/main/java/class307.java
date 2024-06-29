import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class307 extends class477 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
    public static int[] field4118 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[C")
    public static char[] field4119 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "Lpq;")
    public static class159 field4123;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[Ljava/lang/String;B[S)V", line = 7)
    public static final void method1842(int arg0, int arg1, String[] arg2, byte arg3, short[] arg4) {
        if (arg3 < 58) {
            field4119 = null;
        }
        field4120++;
        if (arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        String var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        short var8 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                String var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                short var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var8;
        method1842(arg0, var6 - 1, arg2, (byte) 60, arg4);
        method1842(var6 + 1, arg1, arg2, (byte) 109, arg4);
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V", line = 68)
    public static void method1843(int arg0) {
        field4118 = null;
        field4119 = null;
        if (arg0 <= 102) {
            field4123 = null;
        }
        field4123 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V", line = 80)
    public class307(int arg0) {
        this.field4121 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method434(int arg0);

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Z")
    public abstract boolean method435(int arg0);
}
