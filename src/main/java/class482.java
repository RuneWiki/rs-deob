import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class482 extends class192 {

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    private int field6414 = 0;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    private int field6413 = 0;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    private int field6416 = 0;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field6415 = -1;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "Leg;")
    public static class366 field6417 = new class366();

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "I")
    private int field6412;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    private int field6418;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    private int field6421;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    private int field6422;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    private int field6423;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!mo", name = "W", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!mo", name = "X", descriptor = "I")
    public static int field6426;

    @OriginalMember(owner = "client!mo", name = "Y", descriptor = "I")
    private int field6427;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        field6417 = null;
        if (arg0 >= -52) {
            method2659((byte) 115);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIII)V")
    private final void method2660(int arg0, int arg1, int arg2, int arg3) {
        ++field6420;
        int var5 = arg1 > 2048 ? arg1 - -arg3 - (arg1 * arg3 >> 12) : (4096 - -arg3) * arg1 >> 12;
        if (arg0 == 4096) {
            if (var5 > 0) {
                int var6 = arg2 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = var5 - var13;
                if (var9 == 0) {
                    this.field6427 = var5;
                    this.field6421 = var14;
                    this.field6422 = var7;
                    return;
                }
                if (var9 == 1) {
                    this.field6427 = var15;
                    this.field6421 = var5;
                    this.field6422 = var7;
                    return;
                }
                if (~var9 == -3) {
                    this.field6421 = var5;
                    this.field6427 = var7;
                    this.field6422 = var14;
                    return;
                }
                if (var9 == 3) {
                    this.field6427 = var7;
                    this.field6421 = var15;
                    this.field6422 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field6421 = var7;
                    this.field6422 = var5;
                    this.field6427 = var14;
                    return;
                }
                if (var9 == 5) {
                    this.field6421 = var7;
                    this.field6422 = var15;
                    this.field6427 = var5;
                    return;
                }
            } else {
                this.field6427 = this.field6421 = this.field6422 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIII)V")
    private final void method2661(int arg0, int arg1, int arg2, int arg3) {
        ++field6419;
        if (arg1 >= 69) {
            int var5 = ~arg0 > ~arg3 ? arg3 : arg0;
            int var6 = ~arg3 <= ~arg0 ? arg0 : arg3;
            int var7 = var5 < arg2 ? arg2 : var5;
            int var8 = ~arg2 <= ~var6 ? var6 : arg2;
            int var9 = -var8 + var7;
            this.field6418 = (var7 + var8) / 2;
            if (~this.field6418 < -1 && ~this.field6418 > -4097) {
                this.field6412 = (var9 << 12) / (~this.field6418 >= -2049 ? this.field6418 * 2 : -(this.field6418 * 2) + 8192);
            } else {
                this.field6412 = 0;
            }
            if (~var9 < -1) {
                int var10 = (-arg3 + var7 << 12) / var9;
                int var11 = (var7 - arg0 << 12) / var9;
                int var12 = (-arg2 + var7 << 12) / var9;
                if (~arg3 == ~var7) {
                    this.field6423 = ~arg0 == ~var8 ? var12 + 20480 : -var11 + 4096;
                } else if (arg0 == var7) {
                    this.field6423 = arg2 == var8 ? var10 + 4096 : 12288 - var12;
                } else {
                    this.field6423 = ~arg3 != ~var8 ? -var10 + 20480 : 12288 - -var11;
                }
                this.field6423 /= 6;
            } else {
                this.field6423 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field6425;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int[][] var4 = this.method1251(0, arg0, (byte) -40);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class561.field7319; ++var11) {
                this.method2661(var6[var11], 83, var7[var11], var5[var11]);
                this.field6418 += this.field6413;
                this.field6412 += this.field6414;
                for (this.field6423 += this.field6416; ~this.field6423 > -1; this.field6423 += 4096) {
                }
                if (this.field6412 < 0) {
                    this.field6412 = 0;
                }
                while (~this.field6423 < -4097) {
                    this.field6423 -= 4096;
                }
                if (this.field6418 < 0) {
                    this.field6418 = 0;
                }
                if (this.field6412 > 4096) {
                    this.field6412 = 4096;
                }
                if (this.field6418 > 4096) {
                    this.field6418 = 4096;
                }
                this.method2660(4096, this.field6418, this.field6423, this.field6412);
                var8[var11] = this.field6427;
                var9[var11] = this.field6421;
                var10[var11] = this.field6422;
            }
        }
        int var12 = -49 % ((arg1 - -14) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ILfd;I)V")
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (arg2 == -12160) {
            ++field6426;
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field6413 = (arg1.method2387((byte) -118) << 12) / 100;
                    }
                } else {
                    this.field6414 = (arg1.method2387((byte) 119) << 12) / 100;
                }
            } else {
                this.field6416 = arg1.method2383(arg2 + 77440);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class482() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lol;B)I")
    public static final int method2662(class388 arg0, byte arg1) {
        ++field6424;
        if (class27.field391 != arg0) {
            if (class553.field7241 == arg0) {
                return 34065;
            } else if (class522.field6809 == arg0) {
                return 34066;
            } else if (arg1 != 7) {
                return -82;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 9216;
        }
    }
}
