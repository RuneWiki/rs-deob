import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public abstract class class303 extends class547 {

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field4540 = -1;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!bq", name = "J", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!bq", name = "M", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!bq", name = "N", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!bq", name = "O", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "Lcb;")
    public static class544 field4541;

    @OriginalMember(owner = "client!bq", name = "L", descriptor = "[[I")
    public static int[][] field4547;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Z", line = 3)
    public final boolean method244(int arg0) {
        ++field4550;
        int var2 = 37 / ((-19 - arg0) / 57);
        return false;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 13)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 0) {
            field4540 = 47;
        }
        ++field4546;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(IIIII)V", line = 23)
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field7711 = (byte) arg4;
        super.field7710 = (byte) arg3;
        super.field7719 = arg2;
        super.field7723 = arg1;
        super.field7718 = arg0;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z[Ljw;)I", line = 35)
    public final int method1634(boolean arg0, class578[] arg1) {
        ++field4544;
        if (!arg0) {
            this.method242(-107, (class547) null, (class66) null, (byte) 56, -93, -44, false);
        }
        return this.method3182(arg1, (byte) 32, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 49)
    public static void method2006(byte arg0) {
        if (arg0 > -63) {
            field4543 = -119;
        }
        field4547 = null;
        field4541 = null;
    }

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "(I)V", line = 60)
    public final void method240(int arg0) {
        ++field4549;
        if (arg0 != -1) {
            this.method1637(-13);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "(I)Z", line = 72)
    public final boolean method1637(int arg0) {
        if (arg0 != -1) {
            field4547 = null;
        }
        ++field4545;
        return class457.field6551[(super.field7718 >> class310.field4616) - class282.field4335 - -class76.field1016][(super.field7719 >> class310.field4616) + -class301.field4521 + class76.field1016];
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(ILha;)Z", line = 93)
    public final boolean method1638(int arg0, class66 arg1) {
        ++field4548;
        if (arg0 >= -101) {
            return false;
        } else {
            class393 var3 = class338.method2169(super.field7710, super.field7718 >> class310.field4616, super.field7719 >> class310.field4616);
            return var3 != null && var3.field5578.field10732 ? class624.method3563(false, var3.field5578.method246(-123) - -this.method246(-110), super.field7718 >> class310.field4616, super.field7719 >> class310.field4616, super.field7710) : class136.method966(0, super.field7710, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616);
        }
    }
}
