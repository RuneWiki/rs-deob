import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class423 extends class666 {

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
    private int field5629 = 2048;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
    private int field5630 = 0;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    private int field5634 = 10;

    @OriginalMember(owner = "client!ch", name = "Q", descriptor = "F")
    public static float field5639;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5637;

    @OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
    private int[] field5638;

    @OriginalMember(owner = "client!ch", name = "R", descriptor = "[I")
    private int[] field5640;

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V", line = 6)
    public class423() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIILfp;I)V", line = 20)
    public static final void method2289(int arg0, int arg1, byte arg2, int arg3, int arg4, class292 arg5, int arg6) {
        class250.method1439(arg3, arg4, arg5.field4638, arg5.field4641, arg5.field4647, true, arg0, arg6, 0, arg1);
        ++field5632;
        if (arg2 != 46) {
            field5637 = null;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V", line = 32)
    public static void method2290(byte arg0) {
        field5637 = null;
        int var1 = -117 % ((-84 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I", line = 41)
    public final int[] method122(int arg0, int arg1) {
        if (arg0 > -21) {
            this.field5634 = -59;
        }
        ++field5636;
        int[] var3 = super.field9466.method1811(arg1, 100);
        if (super.field9466.field4172) {
            int var4 = class476.field6935[arg1];
            if (this.field5630 != 0) {
                for (int var5 = 0; ~class501.field7222 < ~var5; ++var5) {
                    int var6 = 0;
                    short var7 = 0;
                    int var8 = class579.field8246[var5];
                    int var9 = this.field5630;
                    if (~var9 != -2) {
                        if (~var9 != -3) {
                            if (var9 == 3) {
                                var6 = 2048 - -(-var4 + var8 >> 1);
                            }
                        } else {
                            var6 = (var8 - 4096 - -var4 >> 1) + 2048;
                        }
                    } else {
                        var6 = var8;
                    }
                    for (int var10 = 0; this.field5634 > var10; ++var10) {
                        if (~this.field5640[var10] >= ~var6 && ~var6 > ~this.field5640[var10 - -1]) {
                            if (this.field5638[var10] > var6) {
                                var7 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var5] = var7;
                }
            } else {
                short var11 = 0;
                for (int var12 = 0; ~this.field5634 < ~var12; ++var12) {
                    if (var4 >= this.field5640[var12] && ~this.field5640[var12 + 1] < ~var4) {
                        if (var4 < this.field5638[var12]) {
                            var11 = 4096;
                        }
                        break;
                    }
                }
                class652.method3676(var3, 0, class501.field7222, var11);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 161)
    public final void method118(int arg0) {
        this.method2291((byte) -42);
        ++field5628;
        if (arg0 != -9) {
            this.field5629 = -51;
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V", line = 172)
    private final void method2291(byte arg0) {
        ++field5635;
        this.field5638 = new int[this.field5634 + 1];
        this.field5640 = new int[this.field5634 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field5634;
        int var4 = this.field5629 * var3 >> 12;
        int var5 = 110 / ((arg0 - 72) / 40);
        for (int var6 = 0; this.field5634 > var6; ++var6) {
            this.field5640[var6] = var2;
            this.field5638[var6] = var2 - -var4;
            var2 += var3;
        }
        this.field5640[this.field5634] = 4096;
        this.field5638[this.field5634] = this.field5638[0] + 4096;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILiaa;Z)V", line = 202)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.method122(87, -55);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field5630 = arg1.method2541(102);
                }
            } else {
                this.field5629 = arg1.method2574(-1758460248);
            }
        } else {
            this.field5634 = arg1.method2541(92);
        }
        ++field5631;
    }
}
