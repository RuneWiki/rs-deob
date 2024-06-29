import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class class699 extends class61 {

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "Lhj;")
    public static class596 field9504 = new class596(53, 6);

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field9502;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "I")
    public static int field9503;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field9506;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public static int field9508;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Lha;")
    public static class66 field9510;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method3886(int arg0) {
        field9504 = null;
        if (arg0 != 17) {
            method3887((byte) 105, 37, -68);
        }
        field9510 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BII)V")
    public static final void method3887(byte arg0, int arg1, int arg2) {
        ++field9503;
        int var3 = -74 / ((-54 - arg0) / 35);
        class714 var4 = class350.method2072((long) arg2, 17, (byte) 110);
        var4.method4043(6380);
        var4.field10021 = arg1;
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(Z)Z")
    public final boolean method531(boolean arg0) {
        if (arg0) {
            field9509 = -56;
        }
        ++field9501;
        return false;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B[Lkp;)I")
    public final int method528(byte arg0, class515[] arg1) {
        ++field9506;
        if (arg0 != -48) {
            this.method531(true);
        }
        return this.method525(super.field813 >> class714.field10017, super.field823 >> class714.field10017, (byte) -108, arg1);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)V")
    public final void method530(boolean arg0) {
        if (!arg0) {
            ++field9507;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method523(class66 arg0, byte arg1) {
        int var3 = 55 / ((arg1 - 18) / 55);
        ++field9500;
        class10 var4 = class425.method2539(super.field808, super.field823 >> class714.field10017, super.field813 >> class714.field10017);
        return var4 != null && var4.field187.field9992 ? class255.method1517((byte) -26, var4.field187.method509(101) - -this.method509(-105), super.field808, super.field823 >> class714.field10017, super.field813 >> class714.field10017) : class216.method1347(super.field808, -122, super.field813 >> class714.field10017, super.field823 >> class714.field10017);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)Z")
    public final boolean method529(int arg0) {
        if (arg0 != -31509) {
            field9509 = 102;
        }
        ++field9502;
        return class308.field3820[(super.field823 >> class714.field10017) + -class463.field6493 + class573.field7852][(super.field813 >> class714.field10017) - (class619.field8331 - class573.field7852)];
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(IIIII)V")
    public class699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field813 = arg2;
        super.field811 = (byte) arg4;
        super.field809 = arg1;
        super.field808 = (byte) arg3;
        super.field823 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgda;Lha;IIZII)V")
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg6 >= -6) {
            method3887((byte) -42, 51, -43);
        }
        ++field9505;
        throw new IllegalStateException();
    }
}
