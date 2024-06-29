import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class139 {

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    private int field38 = 409;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    private int field41 = 81;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    private int field45 = 4;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    private int field44 = 204;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    private int field43 = 1024;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    private int field40 = 1024;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    private int field51 = 0;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    private int field49 = 8;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    private int field37;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "I")
    private int field52;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "[I")
    private int[] field50;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "[[I")
    private int[][] field35;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[[I")
    private int[][] field36;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(B)V")
    private final void method19(byte arg0) {
        ++field39;
        Random var2 = new Random((long) this.field49);
        this.field42 = this.field41 / 2;
        this.field37 = 4096 / this.field49;
        this.field52 = 4096 / this.field45;
        int var3 = this.field52 / 2;
        this.field50 = new int[this.field49 + 1];
        this.field35 = new int[this.field49][this.field45];
        this.field36 = new int[this.field49][this.field45 - -1];
        int var4 = this.field37 / 2;
        if (arg0 == 34) {
            this.field50[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field49; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field37;
                    int var7 = (-2048 + class351.method2194(85, var2, 4096)) * this.field44 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field50[var5] = this.field50[var5 + -1] + var8;
                }
                this.field36[var5][0] = 0;
                for (int var9 = 0; ~this.field45 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field52;
                        int var11 = (class351.method2194(8, var2, 4096) - 2048) * this.field38 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field36[var5][var9] = this.field36[var5][var9 - 1] + var12;
                    }
                    this.field35[var5][var9] = this.field40 <= 0 ? 4096 : -class351.method2194(arg0 + -44, var2, this.field40) + 4096;
                }
                this.field36[var5][this.field45] = 4096;
            }
            this.field50[this.field49] = 4096;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBIII)V")
    public static final void method20(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != -35) {
            method20(-104, 102, (byte) -69, 51, -80, 39);
        }
        ++field48;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg3 * arg3;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 - -var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 - -1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (~class345.field5011 >= ~arg1 && class485.field6827 >= arg1) {
            int var21 = class156.method978(0, arg0 + arg3, class94.field1209, class168.field2449);
            int var22 = class156.method978(0, arg0 - arg3, class94.field1209, class168.field2449);
            class103.method579((byte) 115, var22, var21, arg4, class128.field1676[arg1]);
        }
        while (~var7 < -1) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                ++var6;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var20 -= var15;
            int var23 = -var7 + arg1;
            int var24 = arg1 + var7;
            if (~class345.field5011 >= ~var24 && ~class485.field6827 <= ~var23) {
                int var25 = class156.method978(0, arg0 + var6, class94.field1209, class168.field2449);
                int var26 = class156.method978(0, -var6 + arg0, class94.field1209, class168.field2449);
                if (~var23 <= ~class345.field5011) {
                    class103.method579((byte) 115, var26, var25, arg4, class128.field1676[var23]);
                }
                if (~class485.field6827 <= ~var24) {
                    class103.method579((byte) 115, var26, var25, arg4, class128.field1676[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field40 = arg0.method1729(65280);
                                    }
                                } else {
                                    this.field41 = arg0.method1729(arg1 + 65325);
                                }
                            } else {
                                this.field51 = arg0.method1729(65280);
                            }
                        } else {
                            this.field43 = arg0.method1729(65280);
                        }
                    } else {
                        this.field44 = arg0.method1729(arg1 ^ -65325);
                    }
                } else {
                    this.field38 = arg0.method1729(65280);
                }
            } else {
                this.field49 = arg0.method1701(-23121);
            }
        } else {
            this.field45 = arg0.method1701(-23121);
        }
        if (arg1 != -45) {
            this.field43 = -10;
        }
        ++field47;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field46;
        if (arg1 != 27782) {
            this.method22(-116, 27);
        }
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (super.field1844.field5045) {
            int var4 = 0;
            int var5;
            for (var5 = class237.field3559[arg0] + this.field51; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field49 > var4 && var5 >= this.field50[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field50[var4];
            int var9 = this.field50[var4 + -1];
            if (var5 > this.field42 + var9 && ~var5 > ~(-this.field42 + var8)) {
                for (int var10 = 0; class356.field5147 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field43 : -this.field43;
                    int var13;
                    for (var13 = (this.field52 * var12 >> 12) + class216.field3245[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field45 && ~var13 <= ~this.field36[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field36[var6][var11];
                    int var16 = this.field36[var6][var14];
                    if (~(var16 - -this.field42) > ~var13 && var13 < -this.field42 + var15) {
                        var3[var10] = this.field35[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class415.method2446(var3, 0, class356.field5147, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (arg0 != 7) {
            this.field37 = 35;
        }
        this.method19((byte) 34);
        ++field53;
    }
}
