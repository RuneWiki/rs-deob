import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class392 extends class192 {

    @OriginalMember(owner = "client!im", name = "L", descriptor = "I")
    private int field4999 = 8;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    private int field5001 = 1024;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    private int field4996 = 409;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    private int field5009 = 1024;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    private int field5011 = 81;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    private int field5002 = 4;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    private int field5004 = 204;

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    private int field5012 = 0;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    private int field5003;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    private int field5006;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!im", name = "db", descriptor = "I")
    public static int field5017;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "[I")
    private int[] field5000;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "[Ld;")
    public static class88[] field4997;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "[[I")
    private int[][] field4998;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "[[I")
    private int[][] field5005;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V", line = 4)
    private final void method2231(byte arg0) {
        ++field5013;
        Random var2 = new Random((long) this.field4999);
        this.field5015 = 4096 / this.field4999;
        this.field5003 = 4096 / this.field5002;
        this.field5006 = this.field5011 / 2;
        int var3 = this.field5003 / 2;
        this.field4998 = new int[this.field4999][this.field5002];
        int var4 = this.field5015 / 2;
        this.field5005 = new int[this.field4999][this.field5002 - -1];
        if (arg0 == 127) {
            this.field5000 = new int[this.field4999 + 1];
            this.field5000[0] = 0;
            for (int var5 = 0; this.field4999 > var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field5015;
                    int var7 = (-2048 + class562.method3002((byte) -14, var2, 4096)) * this.field5004 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field5000[var5] = this.field5000[var5 + -1] + var8;
                }
                this.field5005[var5][0] = 0;
                for (int var9 = 0; this.field5002 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field5003;
                        int var11 = (class562.method3002((byte) -14, var2, 4096) + -2048) * this.field4996 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field5005[var5][var9] = this.field5005[var5][var9 + -1] + var12;
                    }
                    this.field4998[var5][var9] = this.field5009 > 0 ? 4096 + -class562.method3002((byte) -14, var2, this.field5009) : 4096;
                }
                this.field5005[var5][this.field5002] = 4096;
            }
            this.field5000[this.field4999] = 4096;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)[I", line = 69)
    public final int[] method118(int arg0, byte arg1) {
        ++field5014;
        if (arg1 >= -123) {
            method2232(false);
        }
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int var4 = 0;
            int var5;
            for (var5 = class221.field2895[arg0] + this.field5012; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field4999 > var4 && this.field5000[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field5000[var4];
            int var9 = this.field5000[var4 + -1];
            if (var5 > this.field5006 + var9 && -this.field5006 + var8 > var5) {
                for (int var10 = 0; class561.field7319 > var10; ++var10) {
                    int var11 = !var7 ? -this.field5001 : this.field5001;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field5003 * var11 >> 12) + class183.field2359[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field5002 && ~var13 <= ~this.field5005[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field5005[var6][var14];
                    int var16 = this.field5005[var6][var12];
                    if (~var13 < ~(this.field5006 + var15) && var13 < var16 - this.field5006) {
                        var3[var10] = this.field4998[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class443.method2511(var3, 0, class561.field7319, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 171)
    public final void method618(byte arg0) {
        ++field5016;
        if (arg0 != 63) {
            this.field4999 = -15;
        }
        this.method2231((byte) 127);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILfd;I)V", line = 186)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field5008;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field5009 = arg1.method2393(-30727);
                                    }
                                } else {
                                    this.field5011 = arg1.method2393(arg2 + -18567);
                                }
                            } else {
                                this.field5012 = arg1.method2393(arg2 + -18567);
                            }
                        } else {
                            this.field5001 = arg1.method2393(-30727);
                        }
                    } else {
                        this.field5004 = arg1.method2393(-30727);
                    }
                } else {
                    this.field4996 = arg1.method2393(-30727);
                }
            } else {
                this.field4999 = arg1.method2396(-111);
            }
        } else {
            this.field5002 = arg1.method2396(-123);
        }
        if (arg2 != -12160) {
            this.field5005 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(Z)V", line = 273)
    public static void method2232(boolean arg0) {
        field4997 = null;
        if (!arg0) {
            field5007 = 123;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(Z)V", line = 284)
    public static final void method2233(boolean arg0) {
        if (arg0) {
            method2232(true);
        }
        ++field5010;
        if (!class515.field6756) {
            class63.field862 = true;
            class515.field6756 = true;
            if (class260.field3509.field1283) {
                class710.field9918 = (float) ((int) class710.field9918 + 47 & -16);
            } else {
                class66.field907 += (12.0F - class66.field907) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 352)
    public class392() {
        super(0, true);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)I", line = 316)
    public static int method2234(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 336)
    public static final void method2235(int arg0) {
        if (arg0 != 4096) {
            method2235(-107);
        }
        ++field5017;
        if (~class60.field816 == -7) {
            class60.field816 = 7;
        }
    }
}
