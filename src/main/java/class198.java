import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class198 extends class46 {

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lmb;")
    private static class132 field3684 = class166.method1092("Your account is already logged in)3", 123);

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lmb;")
    public static class132 field3676 = field3684;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lmb;")
    public static class132 field3678 = class166.method1092("Update)2Liste geladen)3", 115);

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lmb;")
    private static class132 field3686 = class166.method1092("Unexpected server response)3", 126);

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field3687 = 0;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Lmb;")
    public static class132 field3677 = field3686;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "B")
    public byte field3683;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public int field3682;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "J")
    public static long field3679;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Loc;")
    public class155 field3680;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[[[B")
    public static byte[][][] field3681;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)Lch;")
    public static final class31 method1257(int arg0) {
        field3685++;
        if (arg0 != 64) {
            return null;
        }
        try {
            return (class31) Class.forName("tc").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIILmf;JZ)V")
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, class136 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class15 var8 = new class15();
        var8.field227 = arg4;
        var8.field215 = arg1 * 128 + 64;
        var8.field226 = arg2 * 128 + 64;
        var8.field219 = arg3;
        var8.field210 = arg5;
        if (class101.field1900[arg0][arg1][arg2] == null) {
            class101.field1900[arg0][arg1][arg2] = new class169(arg0, arg1, arg2);
        }
        class101.field1900[arg0][arg1][arg2].field3100 = var8;
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field3681 = null;
        field3676 = null;
        field3686 = null;
        field3684 = null;
        field3678 = null;
        field3677 = null;
        if (arg0 != 128) {
            method1259(86);
        }
    }
}
