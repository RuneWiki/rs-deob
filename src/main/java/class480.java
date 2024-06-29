import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class class480 extends class20 {

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "S")
    public short field6731;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "S")
    public short field6732;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)Z")
    public final boolean method167(byte arg0) {
        ++field6735;
        return arg0 != 118 ? false : false;
    }

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "(I)Z")
    public final boolean method339(int arg0) {
        ++field6729;
        int var2 = -19 / ((51 - arg0) / 47);
        return class616.field8849[(super.field530 >> class295.field3981) + -class591.field8564 + class119.field1526][(super.field531 >> class295.field3981) + -class33.field663 + class119.field1526];
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "([Lul;I)I")
    public final int method340(class530[] arg0, int arg1) {
        if (arg1 != -1) {
            this.field6732 = 96;
        }
        ++field6733;
        return this.method336(arg0, 108, super.field531 >> class295.field3981, super.field530 >> class295.field3981);
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)Z")
    public final boolean method335(byte arg0) {
        ++field6730;
        int var2 = -37 / ((-19 - arg0) / 60);
        return class579.method3380(super.field535, (byte) -58, this.method173(32249), super.field531 >> class295.field3981, super.field530 >> class295.field3981);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIZLr;ILub;I)V")
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 <= 113) {
            this.method335((byte) 119);
        }
        ++field6728;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIIII)V")
    public class480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field532 = (byte) arg3;
        super.field530 = arg0;
        super.field535 = (byte) arg4;
        super.field527 = arg1;
        this.field6731 = (short) arg5;
        this.field6732 = (short) arg6;
        super.field531 = arg2;
    }

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "(I)V")
    public final void method163(int arg0) {
        ++field6734;
        int var2 = -125 / ((arg0 - 35) / 54);
        throw new IllegalStateException();
    }
}
