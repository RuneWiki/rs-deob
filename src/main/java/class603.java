import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class603 extends class159 {

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "S")
    public short field8189;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
    public static int field8190;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "[Lhh;")
    public static class140[] field8192;

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "()V", line = 3)
    public class603() {
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 10)
    public static void method3371(int arg0) {
        field8192 = null;
        int var1 = -58 / ((arg0 - 68) / 51);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BII)V", line = 20)
    public static final void method3372(byte arg0, int arg1, int arg2) {
        field8193++;
        class778 var3 = class389.method2406(-95, (long) arg2, 17);
        var3.method4274(114);
        var3.field10690 = arg1;
        if (arg0 > -22) {
            method3372((byte) -88, 37, -79);
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(S)V", line = 34)
    public class603(short arg0) {
        this.field8189 = arg0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILlp;IILub;ILcm;)V", line = 43)
    public static final void method3373(int arg0, int arg1, class412 arg2, int arg3, int arg4, class22 arg5, int arg6, class758 arg7) {
        if (arg3 != 19515) {
            method3373(119, 12, null, 18, 18, null, 118, null);
        }
        field8190++;
        class119 var8 = new class119();
        var8.field1608 = arg1;
        var8.field1583 = arg6 << 9;
        var8.field1582 = arg4 << 9;
        if (arg2 != null) {
            var8.field1606 = arg2;
            int var10 = arg2.field5851;
            int var11 = arg2.field5853;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg2.field5853;
                var11 = arg2.field5851;
            }
            var8.field1591 = arg2.field5882;
            var8.field1601 = arg2.field5878 << 9;
            var8.field1610 = arg2.field5866;
            var8.field1588 = arg4 + var10 << 9;
            var8.field1593 = arg2.field5937;
            var8.field1602 = arg2.field5911;
            var8.field1612 = arg2.field5935 << 9;
            var8.field1604 = arg2.field5901;
            var8.field1584 = arg2.field5924;
            var8.field1596 = arg2.field5874;
            var8.field1586 = arg6 + var11 << 9;
            var8.field1595 = arg2.field5876;
            var8.field1581 = arg2.field5940;
            if (arg2.field5919 != null) {
                var8.field1607 = true;
                var8.method855(false);
            }
            if (var8.field1596 != null) {
                var8.field1598 = (int) (Math.random() * (double) (var8.field1595 - var8.field1610)) + var8.field1610;
            }
            class197.field2555.method689(var8, -95);
        } else if (arg5 != null) {
            var8.field1609 = arg5;
            class304 var9 = arg5.field217;
            if (var9.field4295 != null) {
                var8.field1607 = true;
                var9 = var9.method1968(class480.field6740, -1);
            }
            if (var9 != null) {
                var8.field1586 = var9.field4300 + arg6 << 9;
                var8.field1588 = var9.field4300 + arg4 << 9;
                var8.field1584 = class489.method2862(arg5, arg3 ^ 0xFFFFB3C4);
                var8.field1602 = var9.field4320;
                var8.field1591 = var9.field4324;
                var8.field1604 = var9.field4337;
                var8.field1612 = var9.field4331 << 9;
                var8.field1601 = var9.field4317 << 9;
                var8.field1593 = var9.field4282;
            }
            class205.field2641.method689(var8, 106);
        } else if (arg7 != null) {
            var8.field1594 = arg7;
            var8.field1588 = arg4 + arg7.method2563(-12840) << 9;
            var8.field1586 = arg7.method2563(arg3 - 32355) + arg6 << 9;
            var8.field1584 = class585.method3294(arg7, (byte) -125);
            var8.field1604 = 256;
            var8.field1593 = arg7.field10351;
            var8.field1612 = arg7.field10350 << 9;
            var8.field1602 = 256;
            var8.field1601 = 0;
            var8.field1591 = arg7.field10372;
            class310.field4390.method1247(4070, (long) arg7.field6146, var8);
            return;
        }
    }
}
