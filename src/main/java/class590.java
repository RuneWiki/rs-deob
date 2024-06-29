import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class590 {

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "Lgb;")
    public static class163 field8337 = new class163();

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "Z")
    public static boolean field8339 = false;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "I")
    public int field8334;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public int field8336;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    private int field8338;

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field8341;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "Lwv;")
    public class427 field8335;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)Lqo;")
    public final synchronized class550 method3325(int arg0) {
        field8342++;
        class550 var2 = (class550) this.field8335.field6077.method78(0, (long) this.field8338);
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -57) {
            field8339 = true;
        }
        class550 var3 = class550.method3122(this.field8335.field6072, this.field8338, 0);
        if (var3 != null) {
            this.field8335.field6077.method92(1, (long) this.field8338, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(Lnp;B)V")
    public final void method3326(class115 arg0, byte arg1) {
        field8340++;
        if (arg1 < 30) {
            this.method3328(-122, -126, null);
        }
        while (true) {
            int var3 = arg0.method620((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method3328(var3, 33, arg0);
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public static void method3327(int arg0) {
        if (arg0 != -18705) {
            field8337 = null;
        }
        field8337 = null;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILnp;)V")
    private final void method3328(int arg0, int arg1, class115 arg2) {
        if (arg0 == 1) {
            this.field8338 = arg2.method643((byte) -77);
        } else if (arg0 == 2) {
            this.field8334 = arg2.method620((byte) 62);
            this.field8336 = arg2.method620((byte) 23);
        }
        field8341++;
        if (arg1 < 7) {
            this.method3328(-122, 6, null);
        }
    }
}
