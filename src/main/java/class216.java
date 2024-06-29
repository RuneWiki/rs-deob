import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class216 {

    @OriginalMember(owner = "client!js", name = "g", descriptor = "Z")
    public static boolean field3101 = false;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "Ltn;")
    public static class58 field3103 = null;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "J")
    public static long field3121 = 0L;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Lgf;")
    public static class180 field3110 = new class180("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!js", name = "b", descriptor = "B")
    public byte field3096;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "B")
    public byte field3099;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "B")
    public byte field3108;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "B")
    public byte field3109;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "B")
    public byte field3111;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "B")
    public byte field3116;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "B")
    public byte field3118;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public int field3117;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "S")
    public short field3119;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Z")
    public boolean field3095;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "Z")
    public boolean field3097;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
    public boolean field3098;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Z")
    public boolean field3104;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Z")
    public boolean field3112;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "Z")
    public boolean field3113;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "Z")
    public boolean field3114;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "Z")
    public boolean field3115;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "Z")
    public boolean field3120;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)[Log;", line = 4)
    public static final class456[] method1424(int arg0) {
        field3106++;
        return arg0 == -47 ? new class456[] { class1.field11, class207.field2974, class165.field2472 } : null;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 22)
    public static void method1425(int arg0) {
        field3110 = null;
        field3103 = null;
        if (arg0 != 17213) {
            field3101 = false;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIILqa;IIII[[[BZ)V", line = 39)
    public static final void method1426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class162 arg6, int arg7, int arg8, int arg9, int arg10, byte[][][] arg11, boolean arg12) {
        field3102++;
        if (arg7 == 0 || arg5 == 0) {
            return;
        }
        if (arg7 == 9) {
            arg9 = arg9 + 1 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 10) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 1;
        }
        if (arg7 == 11) {
            arg9 = arg9 + 3 & 0x3;
            arg7 = 8;
        }
        arg6.method430(arg2, arg0, arg4, arg10, arg1, arg8, arg11[arg7 - 1][arg9], arg5, arg3);
        if (!arg12) {
            field3103 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IBI)B", line = 85)
    public static final byte method1427(int arg0, byte arg1, int arg2) {
        field3107++;
        if (arg0 == 9) {
            int var3 = 114 % ((-arg1 - 42) / 63);
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z", line = 108)
    public static final boolean method1428(int arg0, int arg1) {
        if (arg0 != 25607) {
            field3121 = 85L;
        }
        field3105++;
        return arg1 == 15 || arg1 == 30 || arg1 == 1002 || arg1 == 46 || arg1 == 47;
    }
}
