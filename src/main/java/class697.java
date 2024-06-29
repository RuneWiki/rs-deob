import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jha")
public class class697 extends class305 {

    @OriginalMember(owner = "client!jha", name = "i", descriptor = "S")
    public static short field9613 = 205;

    @OriginalMember(owner = "client!jha", name = "j", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!jha", name = "k", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!jha", name = "l", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!jha", name = "m", descriptor = "I")
    public static int field9617;

    @OriginalMember(owner = "client!jha", name = "n", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!jha", name = "o", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!jha", name = "p", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!jha", name = "q", descriptor = "I")
    public static int field9621;

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(I)Z")
    public final boolean method3959(int arg0) {
        ++field9614;
        if (arg0 != 2) {
            this.method308((byte) -120);
        }
        if (super.field4323.method4110(-22215)) {
            return false;
        } else {
            return super.field4323.method4107(true) == class555.field7936;
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(ILhb;)V")
    public class697(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field9615;
        if (super.field4323.method4110(arg0 + -53616)) {
            return 3;
        } else {
            if (arg0 != 31401) {
                field9613 = -94;
            }
            if (super.field4323.method4107(true) == class555.field7936) {
                if (~arg1 == -1) {
                    if (super.field4323.field10209.method3083(17503) == 1) {
                        return 2;
                    }
                    if (~super.field4323.field10162.method4009(17503) == -2) {
                        return 2;
                    }
                    if (super.field4323.field10166.method4091(17503) > 0) {
                        return 2;
                    }
                }
                return 1;
            } else {
                return 3;
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return 63;
        } else {
            ++field9620;
            return 1;
        }
    }

    @OriginalMember(owner = "client!jha", name = "c", descriptor = "(I)V")
    public static final void method3960(int arg0) {
        if (class311.field4401 != null) {
            class311.field4401.method3375(6814);
        }
        ++field9621;
        if (arg0 != 1) {
            method3960(-70);
        }
        if (class597.field8459 != null) {
            while (true) {
                try {
                    class597.field8459.join();
                    return;
                } catch (InterruptedException var1) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!jha", name = "d", descriptor = "(I)I")
    public final int method3961(int arg0) {
        if (arg0 != 17503) {
            return -23;
        } else {
            ++field9619;
            return super.field4320;
        }
    }

    @OriginalMember(owner = "client!jha", name = "<init>", descriptor = "(Lhb;)V")
    public class697(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (arg0 >= -40) {
            field9613 = 73;
        }
        ++field9616;
        if (super.field4323.method4107(true) == class555.field7936) {
            if (super.field4323.method4110(-22215)) {
                super.field4320 = 0;
            }
        } else {
            super.field4320 = 1;
        }
        if (super.field4320 != 0 && ~super.field4320 != -2) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 == -27751) {
            ++field9617;
        }
    }
}
