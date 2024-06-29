import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class34 extends class747 {

    @OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
    private int field440 = 0;

    @OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
    private int field439 = 10;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    private int field445 = 2048;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "Lgw;")
    public static class690 field446 = new class690(10);

    @OriginalMember(owner = "client!rr", name = "E", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "Lbj;")
    public static class547 field447;

    @OriginalMember(owner = "client!rr", name = "F", descriptor = "[I")
    private int[] field438;

    @OriginalMember(owner = "client!rr", name = "I", descriptor = "[I")
    private int[] field441;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method182(int arg0, int arg1) {
        ++field444;
        if (arg1 >= -89) {
            this.method184(27);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = class515.field7103[arg0];
            if (this.field440 == 0) {
                short var5 = 0;
                for (int var6 = 0; ~this.field439 < ~var6; ++var6) {
                    if (~this.field441[var6] >= ~var4 && this.field441[var6 + 1] > var4) {
                        if (this.field438[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class245.method1648(var3, 0, class73.field1095, var5);
            } else {
                for (int var7 = 0; ~class73.field1095 < ~var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class639.field8571[var7];
                    int var11 = this.field440;
                    if (var11 != 1) {
                        if (var11 != 2) {
                            if (~var11 == -4) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 + -4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~this.field439 < ~var12; ++var12) {
                        if (var8 >= this.field441[var12] && var8 < this.field441[var12 + 1]) {
                            if (var8 < this.field438[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ldc;II)V", line = 118)
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg1 != 11608) {
            this.field439 = -118;
        }
        ++field442;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field440 = arg0.method505((byte) -119);
                }
            } else {
                this.field445 = arg0.method482(arg1 + -772603280);
            }
        } else {
            this.field439 = arg0.method505((byte) -119);
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 170)
    public class34() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 178)
    public final void method184(int arg0) {
        if (arg0 != -2) {
            this.field439 = -108;
        }
        ++field437;
        this.method186(false);
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V", line = 190)
    public static void method185(byte arg0) {
        field447 = null;
        field446 = null;
        if (arg0 <= 5) {
            field447 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)V", line = 205)
    private final void method186(boolean arg0) {
        ++field443;
        int var2 = 0;
        this.field441 = new int[this.field439 - -1];
        this.field438 = new int[this.field439 + 1];
        int var3 = 4096 / this.field439;
        if (arg0) {
            this.field439 = 117;
        }
        int var4 = this.field445 * var3 >> 12;
        for (int var5 = 0; this.field439 > var5; ++var5) {
            this.field441[var5] = var2;
            this.field438[var5] = var2 + var4;
            var2 += var3;
        }
        this.field441[this.field439] = 4096;
        this.field438[this.field439] = this.field438[0] + 4096;
    }
}
