import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class296 extends class205 {

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    private int field4645 = -1;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    private int field4656 = -1;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "Lcg;")
    private class168 field4663 = null;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    private int field4664 = -32768;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Z")
    private boolean field4671 = false;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    private int field4662;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    private int field4650;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    private int field4648;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    private int field4660;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    private int field4665;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    private int field4669;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lql;")
    private class223 field4646;

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    private int field4659;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    private int field4651;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field4668 = 0;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "Lvl;")
    public static class242 field4670 = new class242();

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field4674 = 0;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "[I")
    public static int[] field4675 = new int[1000];

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "Z")
    public static boolean field4672 = false;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field4649;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lgj;")
    private class240 field4652;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIJILgj;)V")
    public final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class240 arg10) {
        class205 var13 = this.method1985(-1);
        field4661++;
        if (var13 != null) {
            var13.method225(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field4652);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZ)Lbf;")
    private final class205 method1983(byte arg0, boolean arg1) {
        if (arg0 <= 10) {
            this.method227(-26, 39, 109, -128, 38);
        }
        boolean var3 = class68.field1079 != class214.field3307;
        field4657++;
        class73 var4 = class85.method690(2276, this.field4660);
        int var5 = var4.field1207;
        if (var4.field1189 != null) {
            var4 = var4.method577(116);
        }
        if (var4 == null) {
            return null;
        }
        if (class154.field2352 != 0 && this.field4671 && (this.field4646 == null || this.field4646 != null && this.field4646.field3492 != var4.field1207)) {
            int var6 = var4.field1207;
            if (var4.field1207 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field4646 = null;
            } else {
                this.field4646 = class28.method224(var6, 101);
            }
            if (this.field4646 != null) {
                if (var4.field1228 && this.field4646.field3487 != -1) {
                    this.field4654 = (int) ((double) this.field4646.field3484.length * Math.random());
                    this.field4659 -= (int) ((double) this.field4646.field3488[this.field4654] * Math.random());
                } else {
                    this.field4654 = 0;
                    this.field4659 = class267.field4256 - 1;
                }
            }
        }
        int var7 = this.field4665 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field1232;
            var8 = var4.field1227;
        } else {
            var8 = var4.field1232;
            var9 = var4.field1227;
        }
        int var10 = this.field4662 + (var8 + 1 >> 1);
        int var11 = (var8 >> 1) + this.field4662;
        int var12 = this.field4669 + (var9 + 1 >> 1);
        int var13 = (var9 >> 1) + this.field4669;
        this.method1984((byte) -99, var13 * 128, var11 * 128);
        boolean var14 = !var3 && var4.field1221 && (this.field4656 != var4.field1209 || (this.field4654 != this.field4645 || this.field4646 != null && (this.field4646.field3503 || class53.field830) && this.field4654 != this.field4653) && class270.field4279 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class68.field1079[this.field4650];
        int var16 = (this.field4662 << 7) + (var8 << 6);
        int var17 = var15[var10][var12] + var15[var11][var12] + var15[var10][var13] + var15[var11][var13] >> 2;
        int var18 = (this.field4669 << 7) + (var9 << 6);
        int[][] var19 = null;
        if (var3) {
            var19 = class214.field3307[0];
        } else if (this.field4650 < 3) {
            var19 = class68.field1079[this.field4650 + 1];
        }
        boolean var20 = this.field4663 == null;
        class249 var21;
        if (this.field4646 == null) {
            var21 = var4.method569(false, var15, var19, 0, this.field4665, var17, var18, var20 ? class195.field3072 : this.field4663, var14, var16, this.field4648);
        } else {
            var21 = var4.method571(var20 ? class195.field3072 : this.field4663, this.field4653, (byte) 57, this.field4646, var14, var18, this.field4648, var16, this.field4651, var15, var19, var17, this.field4654, this.field4665);
        }
        return var21 == null ? null : var21.field3836;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)V")
    private final void method1984(byte arg0, int arg1, int arg2) {
        field4658++;
        if (this.field4646 != null) {
            int var4 = class267.field4256 - this.field4659;
            if (var4 > 100 && this.field4646.field3487 > 0) {
                int var5 = this.field4646.field3484.length - this.field4646.field3487;
                while (var5 > this.field4654 && var4 > this.field4646.field3488[this.field4654]) {
                    var4 -= this.field4646.field3488[this.field4654];
                    this.field4654++;
                }
                if (this.field4654 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field4646.field3484.length; var7++) {
                        var6 += this.field4646.field3488[var7];
                    }
                    var4 %= var6;
                }
                this.field4653 = this.field4654 + 1;
                if (this.field4653 >= this.field4646.field3484.length) {
                    this.field4653 -= this.field4646.field3487;
                    if (this.field4653 < 0 || this.field4646.field3484.length <= this.field4653) {
                        this.field4653 = -1;
                    }
                }
            }
            while (this.field4646.field3488[this.field4654] < var4) {
                class56.method452((byte) 93, this.field4654, arg2, this.field4646, false, arg1);
                var4 -= this.field4646.field3488[this.field4654];
                this.field4654++;
                if (this.field4654 >= this.field4646.field3484.length) {
                    this.field4654 -= this.field4646.field3487;
                    if (this.field4654 < 0 || this.field4654 >= this.field4646.field3484.length) {
                        this.field4646 = null;
                        break;
                    }
                }
                this.field4653 = this.field4654 + 1;
                if (this.field4653 >= this.field4646.field3484.length) {
                    this.field4653 -= this.field4646.field3487;
                    if (this.field4653 < 0 || this.field4653 >= this.field4646.field3484.length) {
                        this.field4653 = -1;
                    }
                }
            }
            this.field4651 = var4;
            this.field4659 = class267.field4256 - var4;
        }
        int var8 = -126 % ((-arg0 - 39) / 35);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)Lbf;")
    public final class205 method1985(int arg0) {
        field4644++;
        return arg0 == -1 ? this.method1983((byte) 82, false) : null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "()I")
    public final int method223() {
        field4667++;
        return this.field4664;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
    public static final void method1986(int arg0, byte arg1) {
        class245.field3802.method1778(arg0, -105);
        class13.field228.method1778(arg0, -15);
        field4673++;
        if (arg1 <= 46) {
            method1988(37);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4647++;
        this.method1984((byte) 43, arg4, arg3);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1987(String[] arg0, int arg1) {
        field4655++;
        if (arg1 < 113) {
            method1986(-14, (byte) 21);
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
    public static void method1988(int arg0) {
        field4670 = null;
        field4675 = null;
        if (arg0 != -10002) {
            method1986(-28, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4649++;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIIIIZLbf;)V")
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class205 arg8) {
        this.field4662 = arg4;
        this.field4650 = arg3;
        this.field4648 = arg1;
        this.field4660 = arg0;
        this.field4665 = arg2;
        this.field4669 = arg5;
        if (arg6 != -1) {
            this.field4646 = class28.method224(arg6, 104);
            this.field4654 = 0;
            if (this.field4646.field3484.length <= 1) {
                this.field4653 = 0;
            } else {
                this.field4653 = 1;
            }
            this.field4659 = class267.field4256 - 1;
            this.field4651 = 1;
            if (this.field4646.field3509 == 0 && arg8 != null && arg8 instanceof class296) {
                class296 var10 = (class296) arg8;
                if (this.field4646 == var10.field4646) {
                    this.field4654 = var10.field4654;
                    this.field4659 = var10.field4659;
                    this.field4653 = var10.field4653;
                    this.field4651 = var10.field4651;
                    return;
                }
            }
            if (arg7 && this.field4646.field3487 != -1) {
                this.field4654 = (int) ((double) this.field4646.field3484.length * Math.random());
                this.field4653 = this.field4654 + 1;
                if (this.field4646.field3484.length <= this.field4653) {
                    this.field4653 -= this.field4646.field3487;
                    if (this.field4653 < 0 || this.field4653 >= this.field4646.field3484.length) {
                        this.field4653 = -1;
                    }
                }
                this.field4651 = (int) ((double) this.field4646.field3488[this.field4654] * Math.random()) + 1;
                this.field4659 = class267.field4256 - this.field4651;
            }
        }
        if (arg8 == null) {
            class73 var11 = class85.method690(2276, this.field4660);
            if (var11.field1189 != null) {
                this.field4671 = true;
                return;
            }
        }
    }
}
