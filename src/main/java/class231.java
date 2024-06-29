import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class231 extends class739 {

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    private int field3453 = 0;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    private int field3454 = 4;

    @OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
    private int field3456 = 409;

    @OriginalMember(owner = "client!fn", name = "F", descriptor = "I")
    private int field3459 = 1024;

    @OriginalMember(owner = "client!fn", name = "K", descriptor = "I")
    private int field3464 = 1024;

    @OriginalMember(owner = "client!fn", name = "L", descriptor = "I")
    private int field3465 = 81;

    @OriginalMember(owner = "client!fn", name = "H", descriptor = "I")
    private int field3461 = 8;

    @OriginalMember(owner = "client!fn", name = "P", descriptor = "I")
    private int field3469 = 204;

    @OriginalMember(owner = "client!fn", name = "I", descriptor = "Laf;")
    public static class13 field3462 = new class13();

    @OriginalMember(owner = "client!fn", name = "T", descriptor = "Lmr;")
    public static class611 field3473 = new class611();

    @OriginalMember(owner = "client!fn", name = "W", descriptor = "[[[I")
    public static int[][][] field3476 = new int[2][][];

    @OriginalMember(owner = "client!fn", name = "U", descriptor = "Llc;")
    public static class435 field3474 = new class435(52, 2);

    @OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!fn", name = "E", descriptor = "I")
    private int field3458;

    @OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!fn", name = "J", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!fn", name = "M", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!fn", name = "N", descriptor = "I")
    private int field3467;

    @OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
    private int field3468;

    @OriginalMember(owner = "client!fn", name = "Q", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!fn", name = "V", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!fn", name = "X", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!fn", name = "R", descriptor = "[I")
    private int[] field3471;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "[[I")
    private int[][] field3455;

    @OriginalMember(owner = "client!fn", name = "S", descriptor = "[[I")
    private int[][] field3472;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V", line = 5)
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)[I", line = 8)
    public final int[] method445(boolean arg0, int arg1) {
        ++field3463;
        if (arg0) {
            this.method628(-35);
        }
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = 0;
            int var5;
            for (var5 = class19.field185[arg1] + this.field3453; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field3461 < ~var4 && var5 >= this.field3471[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field3471[var4];
            int var9 = this.field3471[var4 + -1];
            if (~(this.field3468 + var9) > ~var5 && ~(-this.field3468 + var8) < ~var5) {
                for (int var10 = 0; ~class399.field5703 < ~var10; ++var10) {
                    int var11 = var7 ? this.field3464 : -this.field3464;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field3458 * var11 >> 12) + class604.field8580[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field3454 && var13 >= this.field3455[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field3455[var6][var14];
                    int var16 = this.field3455[var6][var12];
                    if (~(this.field3468 + var15) > ~var13 && ~(-this.field3468 + var16) < ~var13) {
                        var3[var10] = this.field3472[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class85.method685(var3, 0, class399.field5703, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V", line = 108)
    public static void method1604(int arg0) {
        if (arg0 >= -104) {
            field3477 = -47;
        }
        field3473 = null;
        field3476 = null;
        field3462 = null;
        field3474 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lsl;IB)V", line = 126)
    public final void method112(class479 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field3459 = arg0.method2882(-1);
                                    }
                                } else {
                                    this.field3465 = arg0.method2882(-1);
                                }
                            } else {
                                this.field3453 = arg0.method2882(-1);
                            }
                        } else {
                            this.field3464 = arg0.method2882(arg2 + -2);
                        }
                    } else {
                        this.field3469 = arg0.method2882(-1);
                    }
                } else {
                    this.field3456 = arg0.method2882(arg2 ^ -2);
                }
            } else {
                this.field3461 = arg0.method2886(true);
            }
        } else {
            this.field3454 = arg0.method2886(true);
        }
        ++field3470;
        if (arg2 != 1) {
            method1605((byte) 13, (String) null);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BLjava/lang/String;)I", line = 217)
    public static final int method1605(byte arg0, String arg1) {
        ++field3460;
        if (arg0 != 44) {
            field3475 = 46;
        }
        return 1 + arg1.length();
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 258)
    public final void method628(int arg0) {
        ++field3466;
        this.method1606(14204);
        if (arg0 < 53) {
            this.field3467 = 74;
        }
    }

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "(I)V", line = 272)
    private final void method1606(int arg0) {
        ++field3457;
        Random var2 = new Random((long) this.field3461);
        if (arg0 != 14204) {
            this.field3468 = 85;
        }
        this.field3468 = this.field3465 / 2;
        this.field3458 = 4096 / this.field3454;
        this.field3467 = 4096 / this.field3461;
        int var3 = this.field3458 / 2;
        int var4 = this.field3467 / 2;
        this.field3471 = new int[this.field3461 + 1];
        this.field3455 = new int[this.field3461][this.field3454 + 1];
        this.field3472 = new int[this.field3461][this.field3454];
        this.field3471[0] = 0;
        for (int var5 = 0; var5 < this.field3461; ++var5) {
            if (var5 > 0) {
                int var6 = this.field3467;
                int var7 = (-2048 + class151.method1094(var2, arg0 + -14200, 4096)) * this.field3469 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field3471[var5] = this.field3471[var5 + -1] + var8;
            }
            this.field3455[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field3454; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field3458;
                    int var11 = (class151.method1094(var2, 4, 4096) + -2048) * this.field3456 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field3455[var5][var9] = this.field3455[var5][var9 + -1] + var12;
                }
                this.field3472[var5][var9] = ~this.field3459 < -1 ? -class151.method1094(var2, 4, this.field3459) + 4096 : 4096;
            }
            this.field3455[var5][this.field3454] = 4096;
        }
        this.field3471[this.field3461] = 4096;
    }
}
