import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class585 extends class666 {

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    private int field8310 = 81;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    private int field8318 = 1024;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    private int field8321 = 409;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    private int field8320 = 1024;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    private int field8326 = 8;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    private int field8314 = 4;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    private int field8329 = 0;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    private int field8328 = 204;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    private int field8311;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field8323;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    private int field8324;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    private int field8327;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "[I")
    public static int[] field8313;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "[I")
    private int[] field8322;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "[[I")
    private int[][] field8312;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "[[I")
    private int[][] field8317;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V", line = 5)
    public static void method3288(int arg0) {
        field8313 = null;
        if (arg0 != 4096) {
            field8313 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V", line = 17)
    private final void method3289(int arg0) {
        if (arg0 == -18380) {
            ++field8325;
            Random var2 = new Random((long) this.field8326);
            this.field8324 = 4096 / this.field8314;
            this.field8311 = this.field8310 / 2;
            this.field8327 = 4096 / this.field8326;
            int var3 = this.field8324 / 2;
            this.field8312 = new int[this.field8326][this.field8314];
            this.field8317 = new int[this.field8326][this.field8314 + 1];
            this.field8322 = new int[this.field8326 + 1];
            int var4 = this.field8327 / 2;
            this.field8322[0] = 0;
            for (int var5 = 0; this.field8326 > var5; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field8327;
                    int var7 = (class252.method1448(var2, 4096, (byte) 50) - 2048) * this.field8328 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field8322[var5] = this.field8322[var5 - 1] + var8;
                }
                this.field8317[var5][0] = 0;
                for (int var9 = 0; this.field8314 > var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field8324;
                        int var11 = (class252.method1448(var2, 4096, (byte) 50) + -2048) * this.field8321 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field8317[var5][var9] = this.field8317[var5][var9 - 1] + var12;
                    }
                    this.field8312[var5][var9] = this.field8318 <= 0 ? 4096 : 4096 - class252.method1448(var2, this.field8318, (byte) 50);
                }
                this.field8317[var5][this.field8314] = 4096;
            }
            this.field8322[this.field8326] = 4096;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)[I", line = 82)
    public final int[] method122(int arg0, int arg1) {
        ++field8319;
        int[] var3 = super.field9466.method1811(arg1, 80);
        if (super.field9466.field4172) {
            int var4 = 0;
            int var5;
            for (var5 = class476.field6935[arg1] + this.field8329; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field8326 && ~var5 <= ~this.field8322[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field8322[var4];
            int var9 = this.field8322[var4 - 1];
            if (var5 > this.field8311 + var9 && -this.field8311 + var8 > var5) {
                for (int var10 = 0; var10 < class501.field7222; ++var10) {
                    int var11 = !var7 ? -this.field8320 : this.field8320;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field8324 * var11 >> 12) + class579.field8246[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field8314 && ~this.field8317[var6][var12] >= ~var13) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field8317[var6][var14];
                    int var16 = this.field8317[var6][var12];
                    if (~var13 < ~(this.field8311 + var15) && var16 - this.field8311 > var13) {
                        var3[var10] = this.field8312[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class652.method3676(var3, 0, class501.field7222, 0);
            }
        }
        if (arg0 >= -21) {
            method3290(108, 11, -114, 68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V", line = 183)
    public class585() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(IIII)V", line = 194)
    public static final void method3290(int arg0, int arg1, int arg2, int arg3) {
        ++field8330;
        int var4 = arg3 << 3;
        if (arg1 != -4097) {
            method3288(35);
        }
        int var5 = arg0 << 3;
        int var6 = arg2 << 3;
        if (~class5.field41 == -3) {
            class352.field4616 = var6;
            class587.field8342 = var4;
            class654.field9344 = var5;
        }
        class89.field958 = (float) var5;
        class90.field1041 = (float) var4;
        class61.method406(16384);
        class356.field4671 = true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 230)
    public final void method118(int arg0) {
        this.method3289(-18380);
        if (arg0 != -9) {
            this.method3289(-114);
        }
        ++field8315;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILiaa;Z)V", line = 245)
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.method3289(-123);
        }
        ++field8316;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field8318 = arg1.method2574(-1758460248);
                                    }
                                } else {
                                    this.field8310 = arg1.method2574(-1758460248);
                                }
                            } else {
                                this.field8329 = arg1.method2574(-1758460248);
                            }
                        } else {
                            this.field8320 = arg1.method2574(-1758460248);
                        }
                    } else {
                        this.field8328 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field8321 = arg1.method2574(-1758460248);
                }
            } else {
                this.field8326 = arg1.method2541(49);
            }
        } else {
            this.field8314 = arg1.method2541(118);
        }
    }
}
