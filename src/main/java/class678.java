import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class678 extends class305 {

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lqe;")
    public static class469 field9430 = new class469(53, 11);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field9425;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field9427;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)I")
    public final int method3892(int arg0) {
        if (arg0 != 17503) {
            field9430 = null;
        }
        ++field9428;
        return super.field4320;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field9429;
        if (super.field4323.method4110(-22215)) {
            return 3;
        } else {
            if (arg0 != 31401) {
                field9430 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)Z")
    public final boolean method3893(int arg0) {
        ++field9425;
        if (arg0 != 2) {
            return true;
        } else {
            return !super.field4323.method4110(-22215);
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 != -27751) {
            this.method308((byte) -30);
        }
        ++field9431;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(ILhb;)V")
    public class678(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
    public static void method3894(int arg0) {
        field9430 = null;
        if (arg0 != 1) {
            field9430 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -25;
        } else {
            ++field9427;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (super.field4323.method4110(-22215)) {
            super.field4320 = 0;
        }
        ++field9426;
        if (~super.field4320 != -2 && ~super.field4320 != -1) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 > -40) {
            this.method308((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lhb;)V")
    public class678(class728 arg0) {
        super(arg0);
    }
}
