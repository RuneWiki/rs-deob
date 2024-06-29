import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class239 extends class547 {

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "S")
    public short field3448;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "S")
    public short field3452;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
    public static int field3443 = 1408;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "[I")
    public static int[] field3451 = new int[13];

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "Ljo;")
    public static class351 field3446 = new class351(87, -1);

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[Ljw;)I", line = 4)
    public final int method1634(boolean arg0, class578[] arg1) {
        ++field3450;
        if (!arg0) {
            this.method242(-113, (class547) null, (class66) null, (byte) 84, 52, -108, false);
        }
        return this.method3182(arg1, (byte) 32, super.field7719 >> class310.field4616, super.field7718 >> class310.field4616);
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(B)V", line = 16)
    public static void method1635(byte arg0) {
        field3451 = null;
        field3446 = null;
        if (arg0 > -13) {
            field3451 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)V", line = 33)
    public static final void method1636(int arg0, int arg1, int arg2) {
        ++field3449;
        class678 var3 = class630.method3597(29636, arg2, (long) arg1);
        var3.method3834((byte) -115);
        var3.field9649 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILsf;Lha;BIIZ)V", line = 44)
    public final void method242(int arg0, class547 arg1, class66 arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        if (arg3 != 0) {
            field3451 = null;
        }
        ++field3442;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "(I)Z", line = 59)
    public final boolean method1637(int arg0) {
        if (arg0 != -1) {
            this.field3452 = 40;
        }
        ++field3441;
        return class457.field6551[(super.field7718 >> class310.field4616) + class76.field1016 - class282.field4335][(super.field7719 >> class310.field4616) + -class301.field4521 - -class76.field1016];
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V", line = 70)
    public final void method240(int arg0) {
        ++field3445;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)Z", line = 83)
    public final boolean method244(int arg0) {
        int var2 = -35 / ((arg0 - -19) / 57);
        ++field3447;
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(ILha;)Z", line = 95)
    public final boolean method1638(int arg0, class66 arg1) {
        if (arg0 >= -101) {
            this.method242(-12, (class547) null, (class66) null, (byte) -32, 82, -72, true);
        }
        ++field3444;
        return class624.method3563(false, this.method246(-119), super.field7718 >> class310.field4616, super.field7719 >> class310.field4616, super.field7711);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)I", line = 108)
    public static final int method1639(int arg0, boolean arg1) {
        ++field3440;
        if (class469.field6699 == null) {
            return 0;
        } else if (!arg1 && class391.field5552 != null) {
            return class469.field6699.length * 2;
        } else {
            int var2 = arg0;
            for (int var3 = 0; class469.field6699.length > var3; ++var3) {
                int var4 = class469.field6699[var3];
                if (class412.field5831.method3131(arg0 ^ -66, var4)) {
                    ++var2;
                }
                if (class13.field257.method3131(arg0 ^ 114, var4)) {
                    ++var2;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIII)V", line = 148)
    public class239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field7718 = arg0;
        this.field3448 = (short) arg5;
        super.field7710 = (byte) arg3;
        super.field7719 = arg2;
        super.field7723 = arg1;
        this.field3452 = (short) arg6;
        super.field7711 = (byte) arg4;
    }
}
