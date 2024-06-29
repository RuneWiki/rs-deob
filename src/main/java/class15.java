import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class15 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "Lip;")
    public static class306 field140 = new class306();

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "Lst;")
    public static class335 field145 = new class335(5, 0);

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "Lkr;")
    public static class602 field146 = new class602(90, 3);

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "Lrg;")
    public static class557 field148 = new class557();

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method65(int arg0) {
        field145 = null;
        field146 = null;
        if (arg0 != 22171) {
            field147 = -12;
        }
        field140 = null;
        field148 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Lsq;")
    public final class15 method66(int arg0, byte arg1) {
        field143++;
        if (arg1 <= 47) {
            method65(-81);
        }
        return new class15(this.field142, arg0, this.field139, this.field138);
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIII)V")
    public class15(int arg0, int arg1, int arg2, int arg3) {
        this.field142 = arg0;
        this.field144 = arg1;
        this.field138 = arg3;
        this.field139 = arg2;
    }
}
