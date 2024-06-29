import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class370 extends class665 {

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "I")
    public int field5280;

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public int field5279;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "Lgq;")
    public static class475 field5277 = new class475(14, 1);

    @OriginalMember(owner = "client!qba", name = "o", descriptor = "Lgq;")
    public static class475 field5281 = new class475(15, 4);

    @OriginalMember(owner = "client!qba", name = "q", descriptor = "Lgq;")
    public static class475 field5283 = new class475(16, -2);

    @OriginalMember(owner = "client!qba", name = "r", descriptor = "Lgq;")
    public static class475 field5284 = new class475(17, 0);

    @OriginalMember(owner = "client!qba", name = "s", descriptor = "Lgq;")
    public static class475 field5285 = new class475(18, -2);

    @OriginalMember(owner = "client!qba", name = "t", descriptor = "Lgq;")
    public static class475 field5286 = new class475(19, -2);

    @OriginalMember(owner = "client!qba", name = "u", descriptor = "Lgq;")
    public static class475 field5287 = new class475(20, 6);

    @OriginalMember(owner = "client!qba", name = "v", descriptor = "Lgq;")
    public static class475 field5288 = new class475(21, 9);

    @OriginalMember(owner = "client!qba", name = "w", descriptor = "Lgq;")
    public static class475 field5289 = new class475(22, -2);

    @OriginalMember(owner = "client!qba", name = "x", descriptor = "Lgq;")
    public static class475 field5290 = new class475(23, 4);

    @OriginalMember(owner = "client!qba", name = "y", descriptor = "Lgq;")
    public static class475 field5291 = new class475(24, -1);

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "Lgq;")
    public static class475 field5292 = new class475(25, -2);

    @OriginalMember(owner = "client!qba", name = "A", descriptor = "Lgq;")
    public static class475 field5293 = new class475(26, 0);

    @OriginalMember(owner = "client!qba", name = "B", descriptor = "Lgq;")
    public static class475 field5294 = new class475(27, 0);

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "[Lgq;")
    private static class475[] field5295 = new class475[32];

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field5278;

    @OriginalMember(owner = "client!qba", name = "p", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field5296;

    static {
        class475[] var0 = class304.method1943(1001);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5295[var0[var1].field6777] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 3)
    public static void method2238(int arg0) {
        field5277 = null;
        field5288 = null;
        if (arg0 != -2) {
            field5296 = -72;
        }
        field5283 = null;
        field5292 = null;
        field5285 = null;
        field5281 = null;
        field5287 = null;
        field5286 = null;
        field5290 = null;
        field5284 = null;
        field5293 = null;
        field5294 = null;
        field5295 = null;
        field5291 = null;
        field5289 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)Loq;", line = 34)
    public static final class326 method2239(byte arg0) {
        if (arg0 == -92) {
            field5282++;
            return class25.field336;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(II)V", line = 45)
    public class370(int arg0, int arg1) {
        this.field5280 = arg1;
        this.field5279 = arg0;
    }
}
