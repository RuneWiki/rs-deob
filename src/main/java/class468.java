import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class468 extends class192 {

    @OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
    private int field6107 = 0;

    @OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
    private int field6109 = 4096;

    @OriginalMember(owner = "client!bt", name = "J", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!bt", name = "L", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!bt", name = "M", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!bt", name = "N", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!bt", name = "O", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILfd;I)V", line = 5)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field6113;
        if (arg2 != -12160) {
            this.field6109 = 29;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field6109 = arg1.method2393(-30727);
            }
        } else {
            this.field6107 = arg1.method2393(-30727);
        }
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V", line = 44)
    public class468() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[I", line = 51)
    public final int[] method118(int arg0, byte arg1) {
        ++field6112;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (arg1 >= -123) {
            return null;
        } else {
            if (super.field2448.field7266) {
                int[] var4 = this.method1253(0, arg0, 0);
                for (int var5 = 0; ~class561.field7319 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = var6 >= this.field6107 && ~this.field6109 <= ~var6 ? 4096 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(Z)[Lra;", line = 88)
    public static final class361[] method2598(boolean arg0) {
        ++field6111;
        return arg0 ? null : new class361[] { class413.field5315, class518.field6775, class297.field3887, class407.field5185, class412.field5310, class290.field3744, class665.field9228, class223.field2915, class124.field1605, class311.field4039, class645.field8975, class325.field4234, class260.field3500, class426.field5524, class694.field9489, class129.field1648, class491.field6504, class168.field2097, client.field1206, class239.field3215, class238.field3203, class361.field4667, class626.field8752, class668.field9275, class131.field1721, class594.field8023, class588.field7989, class574.field7484, class141.field1860, class350.field4479, class219.field2882, class571.field7447, class489.field6493, class679.field9366, class458.field6006, class678.field9348, class7.field66, class453.field5912, class665.field9233, class148.field1911, class190.field2438, class38.field549, class78.field1054, class136.field1791, class324.field4209, class437.field5654, class260.field3504, class158.field1981, class307.field4021, class253.field3449, class185.field2365, class41.field576, class20.field218, class536.field6982, class53.field722, class59.field802, class166.field2082, class549.field7130, class658.field9174, class453.field5916, class483.field6433, class278.field3645, class288.field3720, class323.field4182, class282.field3679, class313.field4061, class303.field3956, class275.field3613, class398.field5070, class46.field638, class572.field7454, class575.field7532, class162.field2014, class276.field3622, class168.field2099, class109.field1414, class533.field6936, class254.field3457, class190.field2425, class122.field1565, class668.field9277, class283.field3688, class564.field7358, class2.field8, class513.field6720, class480.field6403, class407.field5181, class550.field7142, class427.field5530, class12.field125, class143.field1875, class701.field9781, class194.field2536, class331.field4306, class461.field6050, class283.field3687, class260.field3506, class525.field6843, class222.field2900, class207.field2673, class595.field8049, class370.field4767, class219.field2879, class380.field4886, class72.field993, class435.field5641, class556.field7270, class156.field1973, class547.field7092, class13.field141, class677.field9341, class304.field4002, class124.field1604, class407.field5187, class323.field4196, class431.field5574, class578.field7874 };
    }
}
