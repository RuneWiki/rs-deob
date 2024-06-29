import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class307 {

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BLwj;)I", line = 6)
    public static final int method1924(byte arg0, class275 arg1) {
        field4450++;
        if (arg1.field3878 == 0) {
            return 0;
        }
        int var2 = 90 / ((-arg0 - 31) / 39);
        if (arg1.field3833 != -1) {
            class275 var3 = null;
            if (arg1.field3833 < 32768) {
                class24 var4 = (class24) class406.field6158.method1747((long) arg1.field3833, false);
                if (var4 != null) {
                    var3 = var4.field348;
                }
            } else if (arg1.field3833 >= 32768) {
                var3 = class241.field3398[arg1.field3833 - 32768];
            }
            if (var3 != null) {
                int var5 = arg1.field1867 - var3.field1867;
                int var6 = arg1.field1862 - var3.field1862;
                if (var5 != 0 || var6 != 0) {
                    arg1.method1766((byte) -124, (int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg1 instanceof class96)) {
            class96 var10 = (class96) arg1;
            if (var10.field1386 != -1 && (var10.field3918 == 0 || var10.field3914 > 0)) {
                var10.method1766((byte) -126, var10.field1386);
                var10.field1386 = -1;
            }
        } else if (arg1 instanceof class17) {
            class17 var7 = (class17) arg1;
            if (var7.field282 != -1 && (var7.field3918 == 0 || var7.field3914 > 0)) {
                int var8 = var7.field1867 - ((var7.field282 - class331.field5162 - class331.field5162) * 64);
                int var9 = var7.field1862 - ((var7.field288 - class328.field5099 - class328.field5099) * 64);
                if (var8 != 0 || var9 != 0) {
                    var7.method1766((byte) -117, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field282 = -1;
            }
        }
        return arg1.method1764(108);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)Ljs;", line = 86)
    public static final class221 method1925(int arg0, byte arg1) {
        field4449++;
        class221[] var2 = class441.method2671(64);
        int var3 = 0;
        int var4 = 3 % ((-arg1 - 84) / 35);
        while (var2.length > var3) {
            class221 var5 = var2[var3];
            if (var5.field3081 == arg0) {
                return var5;
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Lbb;", line = 114)
    public static final class222 method1926(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6809;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lqa;La;III)V", line = 123)
    public static final void method1927(class165 arg0, class444 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class533.field7842) {
            class452 var5 = class443.field6672[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field6801 != null && var5.field6801.method176(true)) {
                arg1.method166(0, var5.field6801, -125, class264.field3697, 0, arg0, true);
            }
        }
        if (arg4 < class533.field7842) {
            class452 var6 = class443.field6672[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field6801 != null && var6.field6801.method176(true)) {
                arg1.method166(0, var6.field6801, -87, 0, class264.field3697, arg0, true);
            }
        }
        if (arg3 < class533.field7842 && arg4 < class475.field7051) {
            class452 var7 = class443.field6672[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field6801 != null && var7.field6801.method176(true)) {
                arg1.method166(0, var7.field6801, -43, class264.field3697, class264.field3697, arg0, true);
            }
        }
        if (arg3 < class533.field7842 && arg4 > 0) {
            class452 var8 = class443.field6672[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field6801 != null && var8.field6801.method176(true)) {
                arg1.method166(0, var8.field6801, -15, class264.field3697, -class264.field3697, arg0, true);
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)Z", line = 174)
    public static final boolean method1928(int arg0, int arg1, int arg2) {
        if (arg2 != 33) {
            method1926(79, -58, -51);
        }
        field4448++;
        return (arg1 & 0x21) != 0;
    }
}
