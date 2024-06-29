import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public class class33 {

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Lea;")
    public static class10 field446 = class3.method8("Mining Site", -75);

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Lea;")
    public static class10 field448 = class3.method8("Helmet Shop", 120);

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "I")
    public static volatile int field445 = 0;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "B")
    public byte field447;

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Li;")
    public static class16 field451;

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field444;

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "[B")
    public byte[] field449;

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "[B")
    public static byte[] field452;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "[I")
    public static int[] field443;

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "[Lm;")
    public static class24[] field450;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lea;Ls;Lea;I)[Lpa;", line = 12)
    public static final class30[] method227(class10 arg0, class35 arg1, class10 arg2, int arg3) {
        int var4 = arg1.method242(arg0, 6);
        int var5 = arg1.method241((byte) 99, arg2, var4);
        return arg3 <= 45 ? (class30[]) null : class14.method97(var4, arg1, -100, var5);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(I)V", line = 36)
    public static void method228(int arg0) {
        field448 = null;
        field446 = null;
        field452 = null;
        field443 = null;
        field450 = null;
        if (arg0 == -29126) {
            field444 = null;
            field451 = null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Z)V", line = 56)
    public final void method229(boolean arg0) {
        if (arg0) {
            this.method229(true);
        }
        boolean var2 = true;
        if (this.field449 == null) {
            return;
        }
        this.field447 = this.field449[0];
        for (int var3 = 0; var3 < 4096; var3++) {
            if (this.field449[var3] != this.field447) {
                var2 = false;
                break;
            }
        }
        if (var2) {
            this.field449 = null;
        }
    }
}
