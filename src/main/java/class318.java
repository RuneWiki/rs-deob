import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class318 extends class148 {

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private int field4563 = 1;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    private int field4566 = 204;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    private int field4570 = 1;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "[I")
    public static int[] field4569 = new int[25];

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
    public static int[] field4564;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BZZ)V")
    public static final void method1985(byte arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            --class509.field7433;
            if (class509.field7433 == 0) {
                class263.field3858 = null;
            }
        }
        if (arg2) {
            --class64.field973;
            if (~class64.field973 == -1) {
                class508.field7410 = null;
            }
        }
        ++field4568;
        if (arg0 <= 40) {
            field4562 = -24;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 > -65) {
            method1986(-23);
        }
        ++field4571;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            for (int var4 = 0; ~class320.field4579 < ~var4; ++var4) {
                int var5 = class517.field7539[var4];
                int var6 = class456.field6752[arg1];
                int var7 = this.field4570 * var5 >> 12;
                int var8 = this.field4563 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4570) * this.field4570;
                int var10 = var6 % (4096 / this.field4563) * this.field4563;
                if (~var10 > ~this.field4566) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4566 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4566 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = -42 / ((arg2 - -88) / 33);
        ++field4561;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field4566 = arg1.method1450((byte) 76);
                }
            } else {
                this.field4563 = arg1.method1428(32122);
            }
        } else {
            this.field4570 = arg1.method1428(32122);
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public static void method1986(int arg0) {
        field4564 = null;
        field4569 = null;
        if (arg0 != 25) {
            field4564 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)V")
    public static final void method1987(int arg0, byte arg1) {
        int var2 = 74 / ((42 - arg1) / 62);
        ++field4565;
        class338 var3 = class230.method1580(2, -1332166328, arg0);
        var3.method2052(100);
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method1988(String arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            return 111;
        } else {
            ++field4560;
            return class375.method2304(arg0, true, arg1, -89);
        }
    }
}
