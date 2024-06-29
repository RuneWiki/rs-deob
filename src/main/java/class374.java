import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class374 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Lfo;")
    public class606 field5523 = null;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "Lla;")
    public class393 field5526 = null;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "[I")
    public static int[] field5525 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "Liba;")
    public static class211 field5527 = new class211(36, 4);

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "Lvg;")
    public static class622 field5528 = new class622(55, 6);

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "Lgk;")
    public static class540 field5524;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(I)V")
    public static void method2303(int arg0) {
        field5524 = null;
        field5525 = null;
        field5528 = null;
        int var1 = -115 % ((arg0 + 28) / 55);
        field5527 = null;
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(III)Lfg;")
    public static final class391 method2304(int arg0, int arg1, int arg2) {
        class44 var3 = class603.field8695[arg0][arg1][arg2];
        return var3 == null ? null : var3.field669;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lla;)V")
    public class374(class393 arg0) {
        this.field5526 = arg0;
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lla;Lfo;)V")
    public class374(class393 arg0, class606 arg1) {
        this.field5526 = arg0;
        this.field5523 = arg1;
    }
}
