import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class111 {

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[I")
    public static int[] field2030 = new int[1000];

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lsg;")
    private static class169 field2027 = class165.method1060("wave2:", 1536);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lsg;")
    public static class169 field2026 = field2027;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[[B")
    public static byte[][] field2034 = new byte[1000][];

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lsg;")
    public static class169 field2035 = field2027;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lsg;")
    public static class169 field2036 = class165.method1060("Lade Schrifts-=tze )2 ", 1536);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lpg;ILqd;I)V")
    public static final void method686(class142 arg0, int arg1, class148 arg2, int arg3) {
        if (arg1 <= 126) {
            field2026 = null;
        }
        field2033++;
        class45 var4 = new class45();
        var4.field835 = 1;
        var4.field845 = arg2;
        var4.field3543 = arg3;
        var4.field836 = arg0;
        class22 var5 = class2.field28;
        synchronized (class2.field28) {
            class2.field28.method149(0, var4);
        }
        class8.method46(600);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method687(byte[] arg0, int arg1, boolean arg2) {
        field2032++;
        if (arg0 == null) {
            return null;
        } else if (arg1 < 45) {
            return null;
        } else {
            if (arg0.length > 136 && !class2.field44) {
                try {
                    class137 var3 = (class137) Class.forName("e").getDeclaredConstructor().newInstance();
                    var3.method246(true, arg0);
                    return var3;
                } catch (Throwable var4) {
                    class2.field44 = true;
                }
            }
            return arg2 ? class22.method157((byte) -31, arg0) : arg0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method688(int arg0) {
        field2030 = null;
        field2036 = null;
        field2026 = null;
        field2034 = null;
        field2035 = null;
        field2027 = null;
        if (arg0 != 1) {
            method688(64);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIII)I")
    public static final int method689(int arg0, int arg1, int arg2, int arg3) {
        field2028++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg3 == var4) {
            return 7 - arg2;
        } else {
            return arg0;
        }
    }
}
