import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class281 implements class186 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "Lnd;")
    private class547 field3543;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lhg;")
    public static class693 field3546 = new class693(10, 6);

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V")
    public static final void method1667(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3547++;
        class37 var5 = class636.method3571(4, arg2, -117);
        var5.method232(-3);
        if (arg0 > 22) {
            var5.field582 = arg1;
            var5.field579 = arg3;
            var5.field585 = arg4;
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V")
    public static void method1668(int arg0) {
        if (arg0 == 4) {
            field3546 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)Lqia;")
    public final class21 method1249(int arg0) {
        if (arg0 == -32660) {
            field3545++;
            return class21.field377;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)I")
    public final int method1248(int arg0) {
        if (arg0 == 27076) {
            field3544++;
            return this.field3543.method3172(-122) ? 100 : this.field3543.method3170((byte) -87);
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lnd;)V")
    public class281(class547 arg0) {
        this.field3543 = arg0;
    }
}
