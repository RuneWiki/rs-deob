import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class55 extends class330 {

    @OriginalMember(owner = "client!uda", name = "D", descriptor = "I")
    private int field650 = 585;

    @OriginalMember(owner = "client!uda", name = "E", descriptor = "Z")
    public static boolean field651 = false;

    @OriginalMember(owner = "client!uda", name = "G", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!uda", name = "F", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!uda", name = "H", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!uda", name = "I", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "()V", line = 160)
    public class55() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IZ)[I", line = 11)
    public final int[] method464(int arg0, boolean arg1) {
        ++field652;
        if (arg1) {
            this.method464(-84, true);
        }
        int[] var3 = super.field4630.method2475(arg0, 30011);
        if (super.field4630.field5704) {
            int var4 = class300.field4352[arg0];
            for (int var5 = 0; ~var5 > ~class80.field901; ++var5) {
                int var6 = class404.field5705[var5];
                if (~this.field650 > ~var6 && -this.field650 + 4096 > var6 && ~var4 < ~(-this.field650 + 2048) && ~(2048 - -this.field650) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field650 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > 2048 - this.field650 && ~(this.field650 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field650;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field650 + 2048);
                } else if (var4 >= this.field650 && ~var4 >= ~(-this.field650 + 4096)) {
                    if (var6 >= this.field650 && var6 <= -this.field650 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field650 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field650;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field650 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lsha;I)V", line = 91)
    public static final void method465(class115 arg0, int arg1) {
        ++field654;
        if (arg1 != 0) {
            method465((class115) null, 34);
        }
        if (~class283.field4066 == ~arg0.field1553) {
            if (class724.field10031.field9965 == null) {
                arg0.field1404 = 0;
                arg0.field1456 = 0;
            } else {
                arg0.field1469 = 150;
                arg0.field1449 = (int) (256.0D * Math.sin((double) class533.field7336 / 40.0D)) & 2047;
                arg0.field1479 = 5;
                arg0.field1404 = class173.field2193;
                arg0.field1456 = class727.method4043(class724.field10031.field9965, (byte) 69);
                arg0.field1554 = class724.field10031.field9148;
                arg0.field1392 = class724.field10031.field9138;
                arg0.field1390 = 0;
                arg0.field1411 = class724.field10031.field9198;
                class73 var2 = arg0.field1411 != -1 ? class571.field8029.method3695(arg0.field1411, (byte) -126) : null;
                if (var2 != null) {
                    class704.method3976(arg0.field1392, var2, arg1 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lgga;IB)V", line = 130)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        int var4 = -127 % ((arg2 - -41) / 42);
        if (arg1 == 0) {
            this.field650 = arg0.method3002(-1);
        }
        ++field655;
    }
}
