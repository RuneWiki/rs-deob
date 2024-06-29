import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 extends class88 {

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lhj;")
    public static class69 field43 = class181.method1318(" weitere Optionen", (byte) -116);

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lhj;")
    public static class69 field41 = class181.method1318("W-=hlen Sie eine Option", (byte) -110);

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[I")
    public static int[] field46 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lta;")
    public static class241 field42 = new class241(32);

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "J")
    public long field44;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Ltk;")
    public static class50 field40;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Lti;")
    public class5 field37;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lti;")
    public class5 field47;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V")
    public final void method24(boolean arg0) {
        field36++;
        if (this.field47 == null) {
            return;
        }
        this.field47.field37 = this.field37;
        if (!arg0) {
            field42 = null;
        }
        this.field37.field47 = this.field47;
        this.field37 = null;
        this.field47 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lth;I)V")
    public static final void method25(class108 arg0, int arg1) {
        if (arg1 >= -102) {
            return;
        }
        field45++;
        class175 var2 = (class175) class208.field3780.method769(true, arg0.field2045.method473((byte) 87));
        if (var2 == null) {
            class232.method1653(0, arg0.field3998[0], (byte) 85, (class38) null, class52.field927, (class12) null, arg0, arg0.field4046[0]);
        } else {
            var2.method1274(-5226);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lnc;I)V")
    public static final void method26(class83 arg0, int arg1) {
        if (arg1 > 92) {
            field39++;
            class118.field2240 = arg0.method589((byte) -115, class148.field2751);
            class52.field916 = arg0.method589((byte) -105, class208.field3785);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public static void method27(byte arg0) {
        if (arg0 <= 80) {
            field43 = null;
        }
        field43 = null;
        field40 = null;
        field41 = null;
        field42 = null;
        field46 = null;
    }
}
