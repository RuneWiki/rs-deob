import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class563 extends class349 {

    @OriginalMember(owner = "client!bs", name = "B", descriptor = "I")
    private int field7694 = 204;

    @OriginalMember(owner = "client!bs", name = "E", descriptor = "I")
    private int field7697 = 8;

    @OriginalMember(owner = "client!bs", name = "K", descriptor = "I")
    private int field7703 = 0;

    @OriginalMember(owner = "client!bs", name = "C", descriptor = "I")
    private int field7695 = 409;

    @OriginalMember(owner = "client!bs", name = "I", descriptor = "I")
    private int field7701 = 4;

    @OriginalMember(owner = "client!bs", name = "V", descriptor = "I")
    private int field7713 = 81;

    @OriginalMember(owner = "client!bs", name = "W", descriptor = "I")
    private int field7714 = 1024;

    @OriginalMember(owner = "client!bs", name = "Y", descriptor = "I")
    private int field7716 = 1024;

    @OriginalMember(owner = "client!bs", name = "D", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!bs", name = "F", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!bs", name = "G", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!bs", name = "J", descriptor = "I")
    private int field7702;

    @OriginalMember(owner = "client!bs", name = "L", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!bs", name = "M", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!bs", name = "O", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!bs", name = "R", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!bs", name = "S", descriptor = "I")
    private int field7710;

    @OriginalMember(owner = "client!bs", name = "U", descriptor = "I")
    private int field7712;

    @OriginalMember(owner = "client!bs", name = "X", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!bs", name = "P", descriptor = "Lpq;")
    public static class159 field7708;

    @OriginalMember(owner = "client!bs", name = "N", descriptor = "[I")
    private int[] field7706;

    @OriginalMember(owner = "client!bs", name = "H", descriptor = "[[I")
    private int[][] field7700;

    @OriginalMember(owner = "client!bs", name = "T", descriptor = "[[I")
    private int[][] field7711;

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(B)V", line = 3)
    public final void method11(byte arg0) {
        ++field7705;
        if (arg0 >= -51) {
            this.method13((byte) -76, -116);
        }
        this.method3175(true);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)[I", line = 14)
    public final int[] method13(byte arg0, int arg1) {
        ++field7709;
        int[] var3 = super.field5109.method3088(arg1, (byte) 26);
        int var4 = -75 % ((arg0 - 56) / 41);
        if (super.field5109.field7515) {
            int var5 = 0;
            int var6;
            for (var6 = class54.field709[arg1] + this.field7703; var6 < 0; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (var5 < this.field7697 && var6 >= this.field7706[var5]) {
                ++var5;
            }
            int var7 = var5 - 1;
            boolean var8 = ~(1 & var5) == -1;
            int var9 = this.field7706[var5];
            int var10 = this.field7706[var5 + -1];
            if (~(this.field7710 + var10) > ~var6 && ~var6 > ~(-this.field7710 + var9)) {
                for (int var11 = 0; ~var11 > ~class39.field497; ++var11) {
                    int var12 = 0;
                    int var13 = !var8 ? -this.field7716 : this.field7716;
                    int var14;
                    for (var14 = class29.field283[var11] - -(this.field7702 * var13 >> 12); var14 < 0; var14 += 4096) {
                    }
                    while (var14 > 4096) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field7701 && var14 >= this.field7711[var7][var12]) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field7711[var7][var12];
                    int var17 = this.field7711[var7][var15];
                    if (~(this.field7710 + var17) > ~var14 && ~var14 > ~(-this.field7710 + var16)) {
                        var3[var11] = this.field7700[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class657.method3634(var3, 0, class39.field497, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 335)
    public class563() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(III)Z", line = 119)
    public static final boolean method3173(int arg0, int arg1, int arg2) {
        ++field7698;
        if (arg2 != 24926) {
            field7704 = 8;
        }
        return class669.method3712(0, arg1, arg0) || class312.method1927(arg0, (byte) -30, arg1);
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IILdga;)V", line = 135)
    public final void method5(int arg0, int arg1, class138 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field7714 = arg2.method922((byte) -126);
                                    }
                                } else {
                                    this.field7713 = arg2.method922((byte) -123);
                                }
                            } else {
                                this.field7703 = arg2.method922((byte) -127);
                            }
                        } else {
                            this.field7716 = arg2.method922((byte) -128);
                        }
                    } else {
                        this.field7694 = arg2.method922((byte) -127);
                    }
                } else {
                    this.field7695 = arg2.method922((byte) -116);
                }
            } else {
                this.field7697 = arg2.method957((byte) -72);
            }
        } else {
            this.field7701 = arg2.method957((byte) -98);
        }
        if (arg0 != 4095) {
            field7704 = 87;
        }
        ++field7707;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(B)I", line = 233)
    public static final int method3174(byte arg0) {
        ++field7715;
        return arg0 < 56 ? 72 : 16;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)V", line = 244)
    private final void method3175(boolean arg0) {
        ++field7696;
        Random var2 = new Random((long) this.field7697);
        this.field7710 = this.field7713 / 2;
        this.field7702 = 4096 / this.field7701;
        if (!arg0) {
            this.field7703 = 49;
        }
        this.field7712 = 4096 / this.field7697;
        int var3 = this.field7702 / 2;
        this.field7700 = new int[this.field7697][this.field7701];
        int var4 = this.field7712 / 2;
        this.field7711 = new int[this.field7697][this.field7701 + 1];
        this.field7706 = new int[this.field7697 + 1];
        this.field7706[0] = 0;
        for (int var5 = 0; this.field7697 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7712;
                int var7 = (class571.method3224((byte) 122, 4096, var2) + -2048) * this.field7694 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7706[var5] = this.field7706[var5 + -1] + var8;
            }
            this.field7711[var5][0] = 0;
            for (int var9 = 0; var9 < this.field7701; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7702;
                    int var11 = (-2048 + class571.method3224((byte) -43, 4096, var2)) * this.field7695 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7711[var5][var9] = this.field7711[var5][var9 + -1] + var12;
                }
                this.field7700[var5][var9] = ~this.field7714 < -1 ? -class571.method3224((byte) 127, this.field7714, var2) + 4096 : 4096;
            }
            this.field7711[var5][this.field7701] = 4096;
        }
        this.field7706[this.field7697] = 4096;
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V", line = 324)
    public static void method3176(int arg0) {
        if (arg0 != 409) {
            field7699 = 15;
        }
        field7708 = null;
    }
}
