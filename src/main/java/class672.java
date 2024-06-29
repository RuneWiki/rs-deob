import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class672 {

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field9426 = -1;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field9428 = 0;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "[B")
    public byte[] field9427;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "[I")
    public static int[] field9423;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lkea;")
    public static class216[] field9424;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[S")
    public short[] field9420;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[S")
    public short[] field9421;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[S")
    public short[] field9425;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 9)
    public static void method3792(int arg0) {
        field9423 = null;
        field9424 = null;
        int var1 = -26 % ((arg0 + 70) / 53);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIII)V", line = 27)
    public static final void method3793(byte arg0, int arg1, int arg2, int arg3) {
        field9422++;
        int var4 = class498.field6774 + arg3;
        int var5 = class613.field8555 + arg1;
        if (class295.field4051 == null || arg3 < 0 || arg1 < 0 || class401.field5620 <= arg3 || arg1 >= class257.field3508 || !class366.field4875.method537(class503.field6917, 0) && class143.field2063.field4053 != arg2) {
            return;
        }
        int var6 = 31 / ((arg0 + 56) / 56);
        long var7 = (long) (var5 << 14 | arg2 << 28 | var4);
        class385 var9 = (class385) class687.field9801.method970((byte) 89, var7);
        if (var9 == null) {
            class95.method693(arg2, arg3, arg1);
            return;
        }
        class623 var10 = (class623) var9.field5460.method1436(28964);
        if (var10 == null) {
            class95.method693(arg2, arg3, arg1);
            return;
        }
        class558 var11 = (class558) class95.method693(arg2, arg3, arg1);
        if (var11 == null) {
            var11 = new class558(arg3 << 9, class409.field5812[arg2].method332(arg1, 1, arg3), arg1 << 9, arg2, arg2);
        } else {
            var11.field7508 = var11.field7509 = -1;
        }
        var11.field7528 = var10.field8645;
        var11.field7523 = var10.field8646;
        label57: while (true) {
            class623 var12 = (class623) var9.field5460.method1443((byte) 6);
            if (var12 == null) {
                break;
            }
            if (var11.field7523 != var12.field8646) {
                var11.field7508 = var12.field8646;
                var11.field7514 = var12.field8645;
                while (true) {
                    class623 var13 = (class623) var9.field5460.method1443((byte) 6);
                    if (var13 == null) {
                        break label57;
                    }
                    if (var11.field7523 != var13.field8646 && var11.field7508 != var13.field8646) {
                        var11.field7509 = var13.field8646;
                        var11.field7512 = var13.field8645;
                    }
                }
            }
        }
        int var14 = class249.method1533(arg2, (arg1 << 9) + 256, (arg3 << 9) + 256, -92);
        var11.field4042 = arg3 << 9;
        var11.field4050 = (byte) arg2;
        var11.field4047 = arg1 << 9;
        var11.field4052 = var14;
        var11.field7516 = 0;
        var11.field4053 = (byte) arg2;
        if (class467.method2640(arg3, arg1, (byte) 114)) {
            var11.field4050++;
        }
        class466.method2635(arg2, arg3, arg1, var14, var11);
    }
}
