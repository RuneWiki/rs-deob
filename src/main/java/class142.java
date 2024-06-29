import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class142 extends class337 {

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    private int field2166 = 1024;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    private int field2170 = 4;

    @OriginalMember(owner = "client!ik", name = "N", descriptor = "I")
    private int field2176 = 409;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    private int field2179 = 204;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    private int field2182 = 1024;

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "I")
    private int field2180 = 8;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "I")
    private int field2168 = 0;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    private int field2184 = 81;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field2164 = 0;

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "F")
    public static float field2174;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    private int field2173;

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!ik", name = "X", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "Ll;")
    public static class16 field2181;

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "[I")
    private int[] field2177;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[[I")
    private int[][] field2171;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[[I")
    private int[][] field2175;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IB)[I", line = 11)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            this.field2179 = 2;
        }
        ++field2169;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int var4 = 0;
            int var5;
            for (var5 = class505.field7381[arg0] + this.field2168; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2180 > var4 && var5 >= this.field2177[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field2177[var4];
            int var9 = this.field2177[var4 + -1];
            if (this.field2165 + var9 < var5 && -this.field2165 + var8 > var5) {
                for (int var10 = 0; ~class402.field5977 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field2182 : -this.field2182;
                    int var13;
                    for (var13 = (this.field2173 * var12 >> 12) + class109.field1530[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field2170 && this.field2175[var6][var11] <= var13) {
                        ++var11;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field2175[var6][var14];
                    int var16 = this.field2175[var6][var11];
                    if (var15 - -this.field2165 < var13 && ~var13 > ~(var16 - this.field2165)) {
                        var3[var10] = this.field2171[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class414.method2602(var3, 0, class402.field5977, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 242)
    public class142() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BILhp;)V", line = 127)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = 36 % ((82 - arg0) / 40);
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field2166 = arg2.method1511(98);
                                    }
                                } else {
                                    this.field2184 = arg2.method1511(-42);
                                }
                            } else {
                                this.field2168 = arg2.method1511(91);
                            }
                        } else {
                            this.field2182 = arg2.method1511(103);
                        }
                    } else {
                        this.field2179 = arg2.method1511(-98);
                    }
                } else {
                    this.field2176 = arg2.method1511(115);
                }
            } else {
                this.field2180 = arg2.method1515((byte) 121);
            }
        } else {
            this.field2170 = arg2.method1515((byte) 121);
        }
        ++field2178;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 228)
    public final void method174(byte arg0) {
        if (arg0 > 1) {
            ++field2185;
            this.method1017(-1);
        }
    }

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "(I)V", line = 254)
    private final void method1017(int arg0) {
        ++field2183;
        Random var2 = new Random((long) this.field2180);
        this.field2165 = this.field2184 / 2;
        this.field2173 = 4096 / this.field2170;
        this.field2172 = 4096 / this.field2180;
        int var3 = this.field2173 / 2;
        this.field2171 = new int[this.field2180][this.field2170];
        int var4 = this.field2172 / 2;
        this.field2177 = new int[this.field2180 + 1];
        if (arg0 != -1) {
            method1018(59);
        }
        this.field2175 = new int[this.field2180][this.field2170 + 1];
        this.field2177[0] = 0;
        for (int var5 = 0; var5 < this.field2180; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2172;
                int var7 = (-2048 + class477.method2873(var2, -127, 4096)) * this.field2179 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2177[var5] = this.field2177[var5 + -1] - -var8;
            }
            this.field2175[var5][0] = 0;
            for (int var9 = 0; this.field2170 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2173;
                    int var11 = (class477.method2873(var2, -117, 4096) + -2048) * this.field2176 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2175[var5][var9] = this.field2175[var5][var9 - 1] + var12;
                }
                this.field2171[var5][var9] = this.field2166 > 0 ? 4096 + -class477.method2873(var2, arg0 + 16, this.field2166) : 4096;
            }
            this.field2175[var5][this.field2170] = 4096;
        }
        this.field2177[this.field2180] = 4096;
    }

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "(I)V", line = 323)
    public static void method1018(int arg0) {
        field2181 = null;
        if (arg0 != -7477) {
            method1018(-90);
        }
    }
}
