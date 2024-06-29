import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class class337 extends class410 {

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "S")
    public short field4355;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method1979(int arg0, int arg1, byte arg2) {
        ++field4348;
        if (arg2 >= -5) {
            method1981(-1);
        }
        return ~(arg1 & 393216) != -1 | class748.method4184(arg0, arg1, 0) || class407.method2411(arg0, arg1, 0) || class479.method2807(59, arg0, arg1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[Lpk;)I", line = 15)
    public final int method933(int arg0, class621[] arg1) {
        ++field4354;
        if (arg0 != 16) {
            this.method935(-109, (class454) null);
        }
        return this.method2425(super.field5790 >> class455.field6383, super.field5784 >> class455.field6383, true, arg1);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILjava/lang/String;)I", line = 29)
    public static final int method1980(int arg0, String arg1) {
        if (arg0 != -27187) {
            field4352 = 3;
        }
        ++field4347;
        return class726.method4027((byte) -8, arg1, 10, true);
    }

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "(I)V", line = 47)
    public static final void method1981(int arg0) {
        ++field4350;
        for (int var1 = 0; ~class443.field6200 < ~var1; ++var1) {
            int var2 = class61.field832[var1];
            class247 var3 = (class247) class563.field7875.method3248((long) var2, 0);
            if (var3 != null) {
                class124 var4 = var3.field3158;
                class607.method3331(var4, (byte) -7, var4.field1486.field1928);
            }
        }
        if (arg0 != 6758) {
            field4349 = 116;
        }
    }

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "(I)Z", line = 79)
    public final boolean method936(int arg0) {
        if (arg0 > -85) {
            return true;
        } else {
            ++field4346;
            return class376.field5266[(super.field5790 >> class455.field6383) + -field4349 + class267.field3381][(super.field5784 >> class455.field6383) + class267.field3381 - class561.field7852];
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(ILha;)Z", line = 90)
    public final boolean method935(int arg0, class454 arg1) {
        ++field4351;
        if (arg0 <= 64) {
            this.field4355 = 16;
        }
        return class432.method2572(super.field5792, super.field5790 >> class455.field6383, 1, super.field5784 >> class455.field6383);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(IIIIII)V", line = 100)
    public class337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4355 = (short) arg5;
        super.field5790 = arg0;
        super.field5784 = arg2;
        super.field5791 = arg1;
        super.field5779 = (byte) arg3;
        super.field5792 = (byte) arg4;
    }
}
