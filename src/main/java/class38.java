import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class38 extends class224 {

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "Luf;")
    public static class168 field474 = class148.method1019(-1720, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "Luf;")
    public static class168 field475 = class148.method1019(-1720, "<col=ff3000>");

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "Luf;")
    public static class168 field478 = class148.method1019(-1720, "::fullscreen");

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "Luf;")
    public static class168 field480 = class148.method1019(-1720, "Konfig geladen)3");

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Ldk;")
    public static class241 field479;

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "Lkk;")
    public static class63 field477;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field472;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V", line = 6)
    public static void method214(int arg0) {
        if (arg0 != -23492) {
            field475 = (class168) null;
        }
        field477 = null;
        field478 = null;
        field479 = null;
        field475 = null;
        field472 = null;
        field480 = null;
        field474 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)[I", line = 46)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -38 / ((20 - arg0) / 51);
        field481++;
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            class185.method1309(var4, 0, class187.field2961, class303.field5103[arg1]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 72)
    public class38() {
        super(0, true);
    }
}
