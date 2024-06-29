import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class426 {

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "Lpc;")
    private class700 field5643;

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "J")
    public long field5644;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "[I")
    public static int[] field5645 = new int[14];

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2540(int arg0) {
        class65.field887.method3478(5, 4);
        field5646++;
        class100.field1304.method1148(5, false);
        class692.field9423.method3093((byte) 56, 5);
        class379.field4811.method4188(5, 19008);
        class444.field5956.method1071(5, (byte) 115);
        class121.field1555.method2883(108, 5);
        class362.field4504.method3598((byte) -29, 5);
        class740.field10303.method1476(64, 5);
        class687.field9368.method4181(-116, 5);
        class116.field1481.method2624(5, 31713);
        class204.field2444.method3558(5, -117);
        class249.field2932.method1417(0, 5);
        class2.field33.method4134(5, false);
        class495.field6886.method1704(40, 5);
        class113.field1426.method4361(true, 5);
        class500.field7002.method1913((byte) -39, 5);
        class153.field1907.method1229(29, 5);
        int var1 = 114 % ((arg0 + 51) / 53);
        class305.field3675.method3680(5, 30);
        class520.field7343.method2820((byte) 110, 5);
        class5.field63.method2467(5, 16463);
        class347.field4336.method1027(-9355, 5);
        class607.field8173.method2832(5, 46);
        class378.method2218(5, -96);
        class124.method963(50, (byte) 121);
        class496.method2927(50, -10915);
        class158.method1110((byte) 83, 5);
        class95.method829(5, -1);
        class629.field8596.method1694(5, -25);
        class303.field3617.method1694(5, -118);
        class400.field5226.method1694(5, -59);
        class710.field9963.method1694(5, -108);
        class142.field1780.method1694(5, -127);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)V", line = 44)
    public static void method2541(byte arg0) {
        field5645 = null;
        if (arg0 < 54) {
            field5645 = null;
        }
    }

    @OriginalMember(owner = "client!qba", name = "finalize", descriptor = "()V", line = 59)
    protected final void finalize() throws Throwable {
        this.field5643.method3927((byte) 31, this.field5644);
        field5648++;
        super.finalize();
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IIILqja;)V", line = 73)
    public static final void method2542(int arg0, int arg1, int arg2, class328 arg3) {
        class727 var4 = class267.method1583(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field10177 = arg3;
        int var5 = class704.field9910 == class621.field8523 ? 1 : 0;
        if (arg3.method503(false)) {
            if (arg3.method504((byte) -24)) {
                arg3.field822 = class119.field1509[var5];
                class119.field1509[var5] = arg3;
                return;
            }
            arg3.field822 = class653.field9015[var5];
            class653.field9015[var5] = arg3;
            class257.field3034 = true;
            return;
        }
        arg3.field822 = class454.field6399[var5];
        class454.field6399[var5] = arg3;
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V", line = 105)
    public static final void method2543(int arg0) {
        field5647++;
        int var1 = -93 % ((arg0 - 92) / 33);
        class691.field9420.method2115(0);
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Lpc;JI)V", line = 115)
    public class426(class700 arg0, long arg1, int arg2) {
        this.field5643 = arg0;
        this.field5644 = arg1;
    }
}
