import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class159 extends class529 {

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
    private int field2040 = 0;

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "I")
    private int field2041 = 2048;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
    private int field2043 = 10;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "Lwo;")
    public static class314 field2044 = new class314();

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "Lus;")
    public static class328 field2045 = new class328(19, 7);

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "[I")
    private int[] field2036;

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "[I")
    private int[] field2037;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lrn;I)V", line = 6)
    public static final void method985(class648 arg0, int arg1) {
        if (arg0.field8910 != null) {
            arg0.field8910.field2296 = 0;
        }
        ++field2034;
        arg0.field8912 = false;
        class648 var2 = arg0.method662();
        int var3 = 26 / ((-41 - arg1) / 42);
        while (var2 != null) {
            method985(var2, 18);
            var2 = arg0.method673();
        }
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)V", line = 27)
    private final void method986(int arg0) {
        ++field2039;
        this.field2036 = new int[this.field2043 + 1];
        this.field2037 = new int[this.field2043 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field2043;
        int var4 = this.field2041 * var3 >> 12;
        for (int var5 = 0; var5 < this.field2043; ++var5) {
            this.field2037[var5] = var2;
            this.field2036[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field2037[this.field2043] = 4096;
        this.field2036[this.field2043] = this.field2036[0] + 4096;
        if (arg0 != 32610) {
            this.method303(78);
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V", line = 58)
    public static void method987(byte arg0) {
        field2044 = null;
        int var1 = 68 % ((-78 - arg0) / 33);
        field2045 = null;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 68)
    public class159() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IB)[I", line = 73)
    public final int[] method191(int arg0, byte arg1) {
        int var3 = 68 / ((arg1 - 27) / 49);
        ++field2042;
        int[] var4 = super.field7456.method1635(arg0, -124);
        if (super.field7456.field3449) {
            int var5 = class310.field3960[arg0];
            if (~this.field2040 == -1) {
                short var6 = 0;
                for (int var7 = 0; ~var7 > ~this.field2043; ++var7) {
                    if (var5 >= this.field2037[var7] && ~this.field2037[var7 + 1] < ~var5) {
                        if (~this.field2036[var7] < ~var5) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class617.method3388(var4, 0, class304.field3909, var6);
            } else {
                for (int var8 = 0; ~class304.field3909 < ~var8; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class225.field2973[var8];
                    int var12 = this.field2040;
                    if (var12 != 1) {
                        if (~var12 != -3) {
                            if (~var12 == -4) {
                                var9 = 2048 - -(-var5 + var11 >> 1);
                            }
                        } else {
                            var9 = (var11 - (-var5 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; ~var13 > ~this.field2043; ++var13) {
                        if (this.field2037[var13] <= var9 && ~var9 > ~this.field2037[var13 - -1]) {
                            if (~var9 > ~this.field2036[var13]) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var8] = var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBLtn;)V", line = 193)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field2040 = arg2.method1094(255);
                }
            } else {
                this.field2041 = arg2.method1107(false);
            }
        } else {
            this.field2043 = arg2.method1094(255);
        }
        if (arg1 < 45) {
            this.method303(-85);
        }
        ++field2035;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 239)
    public final void method303(int arg0) {
        this.method986(32610);
        if (arg0 <= -92) {
            ++field2038;
        }
    }
}
