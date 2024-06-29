import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public class class20 extends RuntimeException {

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field220;

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Ljava/lang/String;")
    public String field216;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "Lna;")
    public static class26 field219 = class33.method219("map", 116);

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "[J")
    public static long[] field218 = new long[32];

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 31)
    public static void method114(int arg0) {
        field218 = null;
        field219 = null;
        if (arg0 != 64) {
            field215 = -19;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 53)
    public static final Object method115(boolean arg0, byte[] arg1, boolean arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class23.field244) {
            try {
                class11 var3 = (class11) Class.forName("a").getDeclaredConstructor().newInstance();
                var3.method59(arg1, 0);
                return var3;
            } catch (Throwable var5) {
                class23.field244 = true;
            }
        }
        if (arg2) {
            method114(67);
        }
        return arg0 ? class27.method194(61, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 91)
    public class20(Throwable arg0, String arg1) {
        this.field220 = arg0;
        this.field216 = arg1;
    }
}
