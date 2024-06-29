import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public abstract class class194 extends class668 {

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "S")
    public short field3346;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILha;)Z")
    public final boolean method1467(int arg0, class544 arg1) {
        if (arg0 >= -26) {
            return true;
        } else {
            ++field3349;
            return class691.method3857(2456, super.field9477 >> class662.field9425, this, super.field9469, super.field9475 >> class662.field9425);
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(IIIIII)V")
    public class194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9469 = (byte) arg4;
        super.field9475 = arg2;
        super.field9477 = arg0;
        this.field3346 = (short) arg5;
        super.field9470 = (byte) arg3;
        super.field9474 = arg1;
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(B)Z")
    public final boolean method1468(byte arg0) {
        if (arg0 >= -82) {
            this.field3346 = 52;
        }
        ++field3347;
        return class52.field838[(super.field9477 >> class662.field9425) + -class336.field4923 - -class155.field2405][(super.field9475 >> class662.field9425) + -class63.field996 + class155.field2405];
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "([Lvt;I)I")
    public final int method1469(class759[] arg0, int arg1) {
        ++field3348;
        int var3 = super.field9477 >> class662.field9425;
        int var4 = super.field9475 >> class662.field9425;
        int var5 = 0;
        if (~class336.field4923 != ~var3) {
            if (var3 > class336.field4923) {
                var5 += 2;
            }
        } else {
            ++var5;
        }
        if (class63.field996 == var4) {
            var5 += 3;
        } else if (~var4 > ~class63.field996) {
            var5 += 6;
        }
        int var6 = class679.field9572[var5];
        if (~(var6 & this.field3346) != -1) {
            return this.method3746(var3, 0, arg0, var4);
        } else if (~this.field3346 == -2 && ~var3 < -1) {
            return this.method3746(var3 + -1, 0, arg0, var4);
        } else if (~this.field3346 == -5 && ~var3 >= ~class42.field727) {
            return this.method3746(var3 - -1, 0, arg0, var4);
        } else if (~this.field3346 == -9 && var4 > 0) {
            return this.method3746(var3, 0, arg0, var4 + -1);
        } else if (~this.field3346 == -3 && ~class54.field870 <= ~var4) {
            return this.method3746(var3, 0, arg0, var4 + 1);
        } else if (~this.field3346 == -17 && ~var3 < -1 && ~class54.field870 <= ~var4) {
            return this.method3746(var3 + -1, 0, arg0, var4 + 1);
        } else if (this.field3346 == 32 && ~var3 >= ~class42.field727 && class54.field870 >= var4) {
            return this.method3746(var3 - -1, 0, arg0, var4 + 1);
        } else {
            if (arg1 < 104) {
                this.method1467(-47, (class544) null);
            }
            if (~this.field3346 == -129 && ~var3 < -1 && ~var4 < -1) {
                return this.method3746(var3 - 1, 0, arg0, var4 + -1);
            } else if (~this.field3346 == -65 && class42.field727 >= var3 && ~var4 < -1) {
                return this.method3746(var3 + 1, 0, arg0, var4 + -1);
            } else {
                throw new RuntimeException("");
            }
        }
    }
}
