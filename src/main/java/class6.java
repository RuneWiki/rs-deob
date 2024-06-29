import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "J")
    public static long field48 = 20000000L;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lvj;")
    public static class373 field46 = new class373(51, -1);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field51;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lha;")
    public static class52 field49;

    static {
        new class180("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field51 = new String[] { "en", "de", "fr", "pt", "nl" };
    }

    @OriginalMember(owner = "client!ie", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field52++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZIZ)Llw;", line = 17)
    public static final class565 method36(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field47++;
        class565 var5 = new class565();
        var5.field8293 = arg3;
        var5.field8297 = arg0;
        class309.field3937.method2640(1, (long) arg1, var5);
        class544.method3183(1, arg0);
        class509 var6 = class61.method348(arg1, arg4);
        if (var6 != null) {
            class87.method508(124, var6);
        }
        if (class478.field6711 != null) {
            class87.method508(124, class478.field6711);
            class478.field6711 = null;
        }
        class167.method931((byte) -118);
        if (var6 != null) {
            class619.method3556(10438, var6, !arg2);
        }
        if (!arg2) {
            class630.method3607(arg0);
        }
        if (!arg2 && class599.field8668 != -1) {
            class642.method3696(class599.field8668, 0, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 57)
    public static void method37(int arg0) {
        field51 = null;
        field49 = null;
        if (arg0 != 51) {
            field49 = null;
        }
        field46 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IFIIFIIFFLtp;I[BF)V", line = 73)
    public static final void method38(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, float arg8, class454 arg9, int arg10, byte[] arg11, float arg12) {
        field50++;
        int var13 = 0;
        if (arg2 != -21117) {
            return;
        }
        while (arg6 > var13) {
            class632.method3635(arg0, arg4, arg10, arg11, arg3, arg5, arg7, arg1, arg6, arg12, var13, arg8, arg9, -102);
            arg3 += arg0 * arg5;
            var13++;
        }
    }
}
