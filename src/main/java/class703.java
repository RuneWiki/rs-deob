import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class703 extends class392 {

    @OriginalMember(owner = "client!st", name = "j", descriptor = "Lhk;")
    public static class153 field9850 = new class153(10, 2, 2, 0);

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field9855 = -50;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    public static int field9847;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field9853;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "[I")
    public static int[] field9854;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(II)I")
    public final int method290(int arg0, int arg1) {
        ++field9853;
        int var3 = super.field5454.method3784(21).method4160(2323);
        if (~var3 > -97) {
            return 3;
        } else if (arg1 > -124) {
            return 108;
        } else if (arg0 > 1 && ~var3 > -129) {
            return 3;
        } else {
            return arg0 > 3 && ~var3 > -193 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(ILw;)V")
    public class703(int arg0, class675 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
    public final int method3934(int arg0) {
        ++field9852;
        return arg0 != 17539 ? 35 : super.field5452;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public static void method3935(byte arg0) {
        field9854 = null;
        field9850 = null;
        if (arg0 != 29) {
            field9850 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(Lw;)V")
    public class703(class675 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BI)V")
    public final void method286(byte arg0, int arg1) {
        int var3 = -11 % ((arg0 - -80) / 38);
        super.field5452 = arg1;
        ++field9847;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)I")
    public final int method292(boolean arg0) {
        if (!arg0) {
            return 113;
        } else {
            ++field9849;
            return 0;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
    public final void method291(boolean arg0) {
        ++field9848;
        int var2 = super.field5454.method3784(21).method4160(2323);
        if (!arg0) {
            if (var2 < 96) {
                super.field5452 = 0;
            }
            if (super.field5452 > 1 && ~var2 > -129) {
                super.field5452 = 1;
            }
            if (~super.field5452 < -3 && var2 < 192) {
                super.field5452 = 2;
            }
            if (~super.field5452 > -1 || ~super.field5452 < -4) {
                super.field5452 = this.method292(true);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
    public final boolean method3936(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field9851;
            int var2 = super.field5454.method3784(21).method4160(2323);
            return ~var2 <= -97;
        }
    }
}
