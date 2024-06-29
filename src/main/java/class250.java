import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class250 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lfa;")
    private class156 field3683 = new class156(64);

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Lfs;")
    private class387 field3682;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "[I")
    public static int[] field3684 = new int[32];

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lpk;")
    public static class133 field3680 = new class133();

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Lbg;")
    public static class324 field3688 = new class324(91, -1);

    @OriginalMember(owner = "client!he", name = "m", descriptor = "[Lrs;")
    public static class461[] field3690 = new class461[32768];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ll;")
    public static class16 field3681;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lnb;")
    public static class197 field3687;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lwn;")
    public static class507 field3689;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Luh;")
    public final class113 method1629(int arg0, int arg1) {
        field3678++;
        class156 var3 = this.field3683;
        class113 var4;
        synchronized (this.field3683) {
            var4 = (class113) this.field3683.method1115((long) arg1, (byte) 58);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3682.method2363(arg1, 19, 86);
        class113 var6 = new class113();
        if (arg0 <= 114) {
            field3681 = null;
        }
        if (var5 != null) {
            var6.method912(new class65(var5), (byte) -105);
        }
        class156 var7 = this.field3683;
        synchronized (this.field3683) {
            this.field3683.method1107(1, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static void method1630(byte arg0) {
        field3680 = null;
        field3688 = null;
        if (arg0 <= 115) {
            method1630((byte) 10);
        }
        field3690 = null;
        field3684 = null;
        field3689 = null;
        field3687 = null;
        field3681 = null;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Ljk;ILfs;)V")
    public class250(class446 arg0, int arg1, class387 arg2) {
        this.field3682 = arg2;
        this.field3679 = this.field3682.method2367(19, 28724);
    }
}
