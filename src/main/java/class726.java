import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class726 extends class305 {

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field10133;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field10134;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field10135;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field10136;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field10137;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Llr;")
    public static class754 field10141;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I", line = 3)
    public final int method4091(int arg0) {
        ++field10137;
        return arg0 != 17503 ? -98 : super.field4320;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)V", line = 14)
    public final void method308(byte arg0) {
        if (arg0 < -40) {
            ++field10136;
            if (super.field4323.method4110(-22215)) {
                super.field4320 = 0;
            }
            if (super.field4320 < 0 && super.field4320 > 2) {
                super.field4320 = this.method305((byte) 68);
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I", line = 36)
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -96;
        } else {
            ++field10134;
            return 1;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILhb;)V", line = 50)
    public class726(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V", line = 56)
    public static void method4092(int arg0) {
        if (arg0 != -21473) {
            method4093((class46) null, (byte) -35);
        }
        field10141 = null;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lhb;)V", line = 66)
    public class726(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(II)I", line = 70)
    public final int method306(int arg0, int arg1) {
        ++field10133;
        if (super.field4323.method4110(arg0 ^ -11376)) {
            return 3;
        } else if (~arg1 != -1 && ~super.field4323.field10207.method3961(17503) != -2) {
            return arg0 != 31401 ? -99 : 2;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lsca;B)V", line = 88)
    public static final void method4093(class46 arg0, byte arg1) {
        if (arg1 != -60) {
            method4092(-67);
        }
        ++field10142;
        if (class493.field7032 == arg0.field521) {
            if (class130.field1749.field9513 == null) {
                arg0.field679 = 0;
                arg0.field529 = 0;
            } else {
                arg0.field629 = 150;
                arg0.field523 = 2047 & (int) (256.0D * Math.sin((double) class357.field5189 / 40.0D));
                arg0.field585 = 5;
                arg0.field679 = class701.field9775;
                arg0.field529 = class30.method148(true, class130.field1749.field9513);
                arg0.field607 = 0;
                arg0.field522 = class130.field1749.field6075;
                arg0.field544 = class130.field1749.field6123;
                arg0.field619 = class130.field1749.field6076;
                class288 var2 = arg0.field544 == -1 ? null : class742.field10404.method2663(0, arg0.field544);
                if (var2 != null) {
                    class103.method790(-25839, var2, arg0.field619);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)Z", line = 130)
    public final boolean method4094(int arg0) {
        ++field10135;
        if (arg0 != 2) {
            this.method303(-13, -13);
        }
        return !super.field4323.method4110(-22215);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([SIZ)[S", line = 144)
    public static final short[] method4095(short[] arg0, int arg1, boolean arg2) {
        ++field10140;
        short[] var3 = new short[arg1];
        if (arg2) {
            field10141 = null;
        }
        class319.method2020(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(II)V", line = 158)
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            field10139 = 117;
        }
        ++field10138;
        super.field4320 = arg1;
    }
}
