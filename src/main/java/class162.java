import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class162 extends class615 {

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    private int field2549 = 2048;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    private int field2552 = 0;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    private int field2554 = 10;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field2551 = 0;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "[I")
    private int[] field2547;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "[I")
    private int[] field2548;

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 85)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIZIII)V", line = 11)
    public static final void method1124(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        ++field2553;
        class37.field560 = arg4;
        class123.field2051 = arg2;
        if (arg1 != -101) {
            method1124(93, -84, -82, true, -38, 59, 46);
        }
        class695.field9759 = arg5;
        class561.field7431 = arg6;
        class253.field3492 = arg0;
        if (arg3 && ~class253.field3492 <= -101) {
            class259.field3563 = class37.field560 * 512 + 256;
            class643.field8632 = class561.field7431 * 512 + 256;
            class553.field7350 = class315.method1878(class259.field3563, 2921, class29.field476, class643.field8632) - class123.field2051;
        }
        class140.field2254 = 2;
        class173.field2668 = -1;
        class376.field5068 = -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILeh;)V", line = 38)
    public final void method15(byte arg0, int arg1, class335 arg2) {
        ++field2558;
        if (arg0 <= 44) {
            this.method1125((byte) -33);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field2552 = arg2.method2034(255);
                }
            } else {
                this.field2549 = arg2.method2001((byte) -83);
            }
        } else {
            this.field2554 = arg2.method2034(255);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I", line = 88)
    public final int[] method8(int arg0, byte arg1) {
        if (arg1 != -18) {
            this.method15((byte) -33, -52, (class335) null);
        }
        ++field2556;
        int[] var3 = super.field8125.method298(arg0, -122);
        if (super.field8125.field579) {
            int var4 = class402.field5353[arg0];
            if (this.field2552 != 0) {
                for (int var5 = 0; var5 < class505.field6740; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class168.field2599[var5];
                    int var9 = this.field2552;
                    if (var9 != 1) {
                        if (~var9 != -3) {
                            if (~var9 == -4) {
                                var6 = (-var4 + var8 >> 1) + 2048;
                            }
                        } else {
                            var6 = (var8 + -4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; ~this.field2554 < ~var10; ++var10) {
                        if (var6 >= this.field2548[var10] && ~this.field2548[var10 - -1] < ~var6) {
                            if (~this.field2547[var10] < ~var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; this.field2554 > var12; ++var12) {
                    if (~this.field2548[var12] >= ~var4 && ~var4 > ~this.field2548[var12 + 1]) {
                        if (var4 < this.field2547[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class83.method684(var3, 0, class505.field6740, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(B)V", line = 213)
    private final void method1125(byte arg0) {
        ++field2550;
        this.field2547 = new int[this.field2554 + 1];
        this.field2548 = new int[this.field2554 - -1];
        int var2 = 0;
        if (arg0 == -123) {
            int var3 = 4096 / this.field2554;
            int var4 = this.field2549 * var3 >> 12;
            for (int var5 = 0; var5 < this.field2554; ++var5) {
                this.field2548[var5] = var2;
                this.field2547[var5] = var2 + var4;
                var2 += var3;
            }
            this.field2548[this.field2554] = 4096;
            this.field2547[this.field2554] = this.field2547[0] + 4096;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V", line = 249)
    public final void method10(int arg0) {
        if (arg0 != 12404) {
            this.field2547 = null;
        }
        ++field2557;
        this.method1125((byte) -123);
    }
}
