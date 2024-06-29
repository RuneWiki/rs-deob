import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class628 extends class694 {

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    private int field8759 = 2048;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    private int field8764 = 10;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field8769 = 0;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field8767 = new String[5];

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "Luc;")
    public static class27 field8760 = new class27(70, 1);

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "[I")
    public static int[] field8770 = new int[5];

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field8772 = 1;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field8773 = 0;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field8766;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "[I")
    private int[] field8761;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
    private int[] field8768;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "(I)V", line = 5)
    private final void method3490(int arg0) {
        ++field8771;
        this.field8761 = new int[this.field8764 + 1];
        this.field8768 = new int[this.field8764 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field8764;
        if (arg0 != 25735) {
            this.method40(-75);
        }
        int var4 = this.field8759 * var3 >> 12;
        for (int var5 = 0; this.field8764 > var5; ++var5) {
            this.field8761[var5] = var2;
            this.field8768[var5] = var2 + var4;
            var2 += var3;
        }
        this.field8761[this.field8764] = 4096;
        this.field8768[this.field8764] = this.field8768[0] + 4096;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V", line = 44)
    public static void method3491(byte arg0) {
        if (arg0 <= 3) {
            method3492(106, false, 125, 12, 113);
        }
        field8767 = null;
        field8760 = null;
        field8770 = null;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V", line = 256)
    public class628() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZIII)I", line = 63)
    public static final int method3492(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg1) {
            return 63;
        } else {
            ++field8766;
            int var5 = -class675.field9541[arg0 * 8192 / arg2] + 65536 >> 1;
            return ((-var5 + 65536) * arg4 >> 16) + (arg3 * var5 >> 16);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)[I", line = 76)
    public final int[] method39(int arg0, int arg1) {
        ++field8765;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int var4 = class105.field1409[arg1];
            if (~this.field8769 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field8764 > var6; ++var6) {
                    if (~var4 <= ~this.field8761[var6] && var4 < this.field8761[var6 + 1]) {
                        if (~this.field8768[var6] < ~var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class282.method1705(var3, 0, class465.field6544, var5);
            } else {
                for (int var7 = 0; ~var7 > ~class465.field6544; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class346.field4994[var7];
                    int var11 = this.field8769;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var4 - 4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field8764 > var12; ++var12) {
                        if (var8 >= this.field8761[var12] && this.field8761[var12 + 1] > var8) {
                            if (var8 < this.field8768[var12]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (arg0 < 112) {
            method3492(-100, false, -64, 72, -127);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjr;B)V", line = 194)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field8758;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field8769 = arg1.method718(115);
                }
            } else {
                this.field8759 = arg1.method743((byte) -5);
            }
        } else {
            this.field8764 = arg1.method718(113);
        }
        int var5 = -17 / ((arg2 - 58) / 63);
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V", line = 238)
    public final void method40(int arg0) {
        this.method3490(25735);
        ++field8763;
        if (arg0 <= 5) {
            this.field8761 = null;
        }
    }
}
