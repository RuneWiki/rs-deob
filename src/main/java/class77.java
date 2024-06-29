import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public abstract class class77 extends class105 {

    @OriginalMember(owner = "client!dha", name = "J", descriptor = "Lkk;")
    public static class188 field1002 = new class188(32);

    @OriginalMember(owner = "client!dha", name = "H", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!dha", name = "I", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!dha", name = "A", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!dha", name = "B", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!dha", name = "C", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!dha", name = "D", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!dha", name = "E", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!dha", name = "F", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!dha", name = "G", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!dha", name = "g", descriptor = "(I)Z", line = 5)
    public final boolean method611(int arg0) {
        ++field995;
        if (arg0 >= -85) {
            return true;
        } else {
            class356 var2 = class415.method2549(super.field1266, super.field1264 >> class660.field9038, super.field1250 >> class660.field9038);
            return var2 != null && var2.field5067.field7414 ? class19.method119(var2.field5067.method749(32767) + this.method749(32767), 96, super.field1250 >> class660.field9038, super.field1264 >> class660.field9038, super.field1266) : class662.method3629(super.field1266, 843095752, super.field1250 >> class660.field9038, super.field1264 >> class660.field9038);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIBIIII)V", line = 24)
    public static final void method612(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 < -53) {
            ++field997;
            if (arg1 == arg2) {
                class430.method2627(arg2, arg6, arg7, -127, arg5, arg0, arg4);
            } else if (~class71.field960 >= ~(-arg2 + arg4) && arg4 - -arg2 <= class549.field7665 && class143.field2050 <= arg7 - arg1 && ~class461.field6495 <= ~(arg1 + arg7)) {
                class694.method3916(arg1, arg6, arg5, 68, arg7, arg4, arg0, arg2);
            } else {
                class3.method11(arg4, arg7, arg1, arg0, arg6, arg2, -1587516607, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ILjb;)V", line = 49)
    public static final void method613(int arg0, class493 arg1) {
        ++field993;
        if (arg0 >= 31) {
            if (~arg1.field7016 == -6 && ~arg1.field6952 != 0) {
                class109.method775(class268.field3831, arg1, -120);
            }
        }
    }

    @OriginalMember(owner = "client!dha", name = "k", descriptor = "(I)V", line = 63)
    public final void method614(int arg0) {
        ++field1000;
        if (arg0 != 26062) {
            method612(-11, -96, 75, (byte) -85, 14, 17, 22, -101);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 76)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        ++field994;
        if (arg5 == 22501) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Ljava/lang/String;II)I", line = 87)
    public static final int method616(String arg0, int arg1, int arg2) {
        if (arg1 != -6671) {
            field1002 = null;
        }
        ++field992;
        return class123.method835((byte) -21, arg2, arg0, true);
    }

    @OriginalMember(owner = "client!dha", name = "j", descriptor = "(I)Z", line = 98)
    public final boolean method617(int arg0) {
        ++field998;
        if (arg0 != -21499) {
            this.method615(false, (class58) null, -78, -68, (class105) null, 42, -111);
        }
        return class589.field8299[(super.field1264 >> class660.field9038) + -class136.field1982 + class453.field6405][(super.field1250 >> class660.field9038) + (-class481.field6801 - -class453.field6405)];
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "([Lwi;I)I", line = 109)
    public final int method618(class465[] arg0, int arg1) {
        if (arg1 != -1) {
            return -46;
        } else {
            ++field996;
            return this.method742(super.field1264 >> class660.field9038, arg0, (byte) -41, super.field1250 >> class660.field9038);
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(Lfp;IIIIIZ)V", line = 121)
    public static final void method619(class323 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class750.field10412 = arg6;
        class469.field6659 = arg4;
        ++field1001;
        class213.field2801 = arg3;
        class444.field6316 = arg5;
        class226.field3049 = arg0;
        class561.field7881 = null;
        class318.field4412 = arg2;
        class681.field9343 = arg1;
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(IIIII)V", line = 138)
    public class77(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field1255 = arg1;
        super.field1266 = (byte) arg3;
        super.field1250 = arg2;
        super.field1258 = (byte) arg4;
        super.field1264 = arg0;
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(I)V", line = 154)
    public static void method620(int arg0) {
        field1002 = null;
        if (arg0 <= 120) {
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!dha", name = "d", descriptor = "(I)Z", line = 166)
    public final boolean method621(int arg0) {
        if (arg0 >= -103) {
            return true;
        } else {
            ++field999;
            return false;
        }
    }
}
