import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class205 {

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Ljava/lang/String;")
    public String field2968;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field2966 = 0;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field2969 = -1;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Ltn;")
    public static class60 field2963 = new class60(28, 3);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Leh;")
    public static class246 field2972;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[J")
    public static long[] field2973;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field2967;

    static {
        new class530("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
        field2972 = new class246(92, 6);
        field2973 = new long[256];
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2973[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!le", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field2964++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Lni;", line = 18)
    public static final class368 method1309(int arg0) {
        field2965++;
        if (arg0 <= 78) {
            return null;
        }
        try {
            return (class368) Class.forName("qm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 41)
    public static final void method1310(byte arg0) {
        field2967++;
        int var1 = 101 / ((12 - arg0) / 56);
        if (class462.field6458 == null) {
            return;
        }
        if (class462.field6458.field5277 == 1) {
            class462.field6458 = null;
            return;
        }
        if (class462.field6458.field5277 == 2) {
            class4.method33(2, class113.field1533, class96.field1244, true);
            class462.field6458 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 69)
    public class205(String arg0, int arg1) {
        this.field2968 = arg0;
        this.field2962 = arg1;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V", line = 78)
    public static void method1311(byte arg0) {
        field2972 = null;
        field2973 = null;
        if (arg0 != 58) {
            field2963 = null;
        }
        field2963 = null;
    }
}
