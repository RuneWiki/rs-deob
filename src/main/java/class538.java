import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class538 extends class330 {

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    private int field7431 = 0;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    private int field7437 = 0;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    private int field7438 = 1;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lof;")
    public static class475 field7430 = new class475(4, 1);

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field7433 = new String[100];

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field7439 = -1;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 5)
    public class538() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 8)
    public static void method3195(int arg0) {
        if (arg0 != 4) {
            field7430 = null;
        }
        field7430 = null;
        field7433 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Loq;IZLgf;)V", line = 22)
    public static final void method3196(class230 arg0, int arg1, boolean arg2, class73 arg3) {
        ++field7436;
        if (~class70.field770 > -51) {
            if (arg3 != null && arg3.field820 != null && arg1 < arg3.field820.length && arg3.field820[arg1] != null) {
                int var4 = arg3.field820[arg1][0];
                int var5 = var4 >> 8;
                int var6 = 7 & var4 >> 5;
                if (arg3.field820[arg1].length > 1) {
                    int var7 = (int) (Math.random() * (double) arg3.field820[arg1].length);
                    if (~var7 < -1) {
                        var5 = arg3.field820[arg1][var7];
                    }
                }
                int var8 = var4 & 31;
                int var9 = 256;
                if (arg3.field815 != null && arg3.field806 != null) {
                    var9 = (int) ((double) (arg3.field806[arg1] - arg3.field815[arg1]) * Math.random()) - -arg3.field815[arg1];
                }
                int var10 = arg3.field822 != null ? arg3.field822[arg1] : 255;
                if (~var8 == -1) {
                    if (class724.field10031 == arg0) {
                        if (!arg3.field803) {
                            class68.method522(var5, var6, var9, 0, (byte) 106, var10);
                            return;
                        }
                        class324.method2056(var6, 0, var10, false, 0, var5, var9);
                    }
                } else if (class688.field9602.field8496.method1981((byte) -98) != 0) {
                    int var11 = arg0.field3470 + -256 >> 9;
                    int var12 = arg0.field3460 + -256 >> 9;
                    if (arg2) {
                        int var13 = class724.field10031 != arg0 ? (var12 << 8) + (arg0.field3467 << 24) + (var11 << 16) - -var8 : 0;
                        class7.field40[class70.field770++] = new class22((byte) (!arg3.field803 ? 1 : 2), var5, var6, 0, var10, var13, var9, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 91)
    public static final void method3197(int arg0) {
        class616.field8644 = 0;
        ++field7440;
        class395.field5608 = 0;
        int var1 = 0;
        if (arg0 == 24869) {
            while (~var1 > ~class737.field10141) {
                int var2 = class410.field5753 * var1;
                for (int var3 = 0; ~class410.field5753 < ~var3; ++var3) {
                    int var4 = var2 + var3;
                    class376.field5395[var4].method2230(class618.field8685 * var3, class750.field10361 * var1, class618.field8685, class750.field10361, 0, 0, true, true);
                }
                ++var1;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lgga;IB)V", line = 140)
    public final void method466(class511 arg0, int arg1, byte arg2) {
        ++field7434;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -4) {
                    this.field7438 = arg0.method3013(5);
                }
            } else {
                this.field7431 = arg0.method3013(-123);
            }
        } else {
            this.field7437 = arg0.method3013(-93);
        }
        int var5 = 124 / ((arg2 - -41) / 42);
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V", line = 182)
    public final void method653(byte arg0) {
        class393.method2423(true);
        int var2 = 23 / ((50 - arg0) / 41);
        ++field7435;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)[I", line = 196)
    public static final int[] method3198(int arg0) {
        ++field7429;
        return arg0 != 23540 ? null : new int[] { class128.field1671, class510.field6918, class656.field9261 };
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)[I", line = 212)
    public final int[] method464(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field7432;
            int[] var3 = super.field4630.method2475(arg0, 30011);
            if (super.field4630.field5704) {
                int var4 = class300.field4352[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; class80.field901 > var6; ++var6) {
                    int var7 = class404.field5705[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var9;
                    if (this.field7437 == 0) {
                        var9 = (-var4 + var7) * this.field7438;
                    } else {
                        int var10 = var5 * var5 + var8 * var8 >> 12;
                        int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                        var9 = (int) ((double) (this.field7438 * var11) * 3.141592653589793D);
                    }
                    int var12 = var9 - (-4096 & var9);
                    if (this.field7431 == 0) {
                        var12 = class329.field4620[255 & var12 >> 4] + 4096 >> 1;
                    } else if (~this.field7431 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }
}
