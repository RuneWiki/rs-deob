import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class341 extends class371 {

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    private int field4991 = 10;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field4996 = 2048;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    private int field4998 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "[[I")
    public static int[][] field4995 = new int[128][128];

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "[I")
    private int[] field4987;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "[I")
    private int[] field4997;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "[Lha;")
    public static class116[] field4994;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V", line = 4)
    private final void method2114(boolean arg0) {
        ++field4992;
        int var2 = 0;
        this.field4987 = new int[this.field4991 - -1];
        this.field4997 = new int[this.field4991 + 1];
        int var3 = 4096 / this.field4991;
        int var4 = this.field4996 * var3 >> 12;
        for (int var5 = 0; ~this.field4991 < ~var5; ++var5) {
            this.field4997[var5] = var2;
            this.field4987[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4997[this.field4991] = 4096;
        if (arg0) {
            this.field4987 = null;
        }
        this.field4987[this.field4991] = this.field4987[0] + 4096;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 35)
    public final void method212(int arg0) {
        if (arg0 == -19103) {
            ++field4988;
            this.method2114(false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)[I", line = 48)
    public final int[] method79(byte arg0, int arg1) {
        ++field4990;
        int[] var3 = super.field5378.method1451(28, arg1);
        if (arg0 >= -80) {
            this.method81(-9, (byte) 29, (class428) null);
        }
        if (super.field5378.field3254) {
            int var4 = class614.field9004[arg1];
            if (~this.field4998 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field4991; ++var6) {
                    if (~this.field4997[var6] >= ~var4 && this.field4997[var6 + 1] > var4) {
                        if (~this.field4987[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class473.method2881(var3, 0, class41.field455, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class41.field455; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class287.field4215[var7];
                    int var11 = this.field4998;
                    if (~var11 != -2) {
                        if (var11 != 2) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - -var4 - 4096 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field4991 > var12; ++var12) {
                        if (this.field4997[var12] <= var8 && ~this.field4997[var12 - -1] < ~var8) {
                            if (~var8 > ~this.field4987[var12]) {
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

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)Z", line = 164)
    public static final boolean method2115(int arg0) {
        ++field4989;
        if (arg0 != -1) {
            method2115(-88);
        }
        return !class53.method271((byte) -120, "jaclib") ? false : class53.method271((byte) -77, "hw3d");
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 181)
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V", line = 187)
    public static final void method2116(int arg0, int arg1) {
        class62.field731 = -1;
        class636.field9266 = 0;
        ++field4993;
        class212.field3119 = false;
        class534.field7910 = -1;
        class110.field1406 = 1;
        if (arg0 > 106) {
            class548.field8167 = arg1;
            class42.field504 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)V", line = 210)
    public static void method2117(int arg0) {
        field4994 = null;
        field4995 = null;
        if (arg0 != 2145738252) {
            field4995 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLps;)V", line = 225)
    public final void method81(int arg0, byte arg1, class428 arg2) {
        int var4 = -104 % ((arg1 - -15) / 39);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field4998 = arg2.method2561((byte) -22);
                }
            } else {
                this.field4996 = arg2.method2620(104);
            }
        } else {
            this.field4991 = arg2.method2561((byte) 116);
        }
        ++field4986;
    }
}
