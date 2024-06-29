import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 extends class89 {

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field36 = 81;

    @OriginalMember(owner = "client!ib", name = "ib", descriptor = "I")
    private int field51 = 8;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    private int field41 = 1024;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    private int field40 = 204;

    @OriginalMember(owner = "client!ib", name = "lb", descriptor = "I")
    private int field54 = 1024;

    @OriginalMember(owner = "client!ib", name = "mb", descriptor = "I")
    private int field55 = 4;

    @OriginalMember(owner = "client!ib", name = "pb", descriptor = "I")
    private int field58 = 409;

    @OriginalMember(owner = "client!ib", name = "wb", descriptor = "I")
    private int field65 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Lha;")
    public static class46 field38 = class271.method1828("Ausw-=hlen", -46);

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field44 = 0;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[Lha;")
    public static class46[] field37 = new class46[200];

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!ib", name = "rb", descriptor = "Lha;")
    public static class46 field60 = class271.method1828("<col=ff3000>", -46);

    @OriginalMember(owner = "client!ib", name = "ub", descriptor = "Lha;")
    public static class46 field63 = class271.method1828("Clientscript error in: ", -46);

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lha;")
    public static class46 field34 = class271.method1828("(R", -46);

    @OriginalMember(owner = "client!ib", name = "qb", descriptor = "Z")
    public static boolean field59 = false;

    @OriginalMember(owner = "client!ib", name = "sb", descriptor = "Lha;")
    private static class46 field61 = class271.method1828("Cancel", -46);

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "Lha;")
    public static class46 field48 = field61;

    @OriginalMember(owner = "client!ib", name = "ob", descriptor = "I")
    public static int field57 = 0;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    private int field42;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ib", name = "gb", descriptor = "I")
    private int field49;

    @OriginalMember(owner = "client!ib", name = "hb", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ib", name = "kb", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ib", name = "nb", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!ib", name = "tb", descriptor = "I")
    private int field62;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "[I")
    private int[] field39;

    @OriginalMember(owner = "client!ib", name = "jb", descriptor = "[[I")
    private int[][] field52;

    @OriginalMember(owner = "client!ib", name = "vb", descriptor = "[[I")
    private int[][] field64;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field35;
        this.method10(false);
        if (!arg0) {
            field38 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Z")
    public static final boolean method9(int arg0, int arg1) {
        ++field53;
        if (arg1 != 1) {
            method13(79, -76);
        }
        return ~(arg0 & 1) != -1;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    private final void method10(boolean arg0) {
        ++field43;
        Random var2 = new Random((long) this.field51);
        this.field49 = 4096 / this.field55;
        this.field39 = new int[this.field51 - -1];
        this.field39[0] = 0;
        this.field62 = this.field36 / 2;
        if (arg0) {
            this.method14((class75) null, 29, -72);
        }
        this.field64 = new int[this.field51][this.field55];
        this.field52 = new int[this.field51][this.field55 + 1];
        this.field42 = 4096 / this.field51;
        int var3 = this.field49 / 2;
        int var4 = this.field42 / 2;
        for (int var5 = 0; ~var5 > ~this.field51; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field42;
                int var7 = (-2048 + class98.method761(var2, false, 4096)) * this.field40 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field39[var5] = this.field39[var5 + -1] + var8;
            }
            this.field52[var5][0] = 0;
            for (int var9 = 0; ~this.field55 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field49;
                    int var11 = (class98.method761(var2, arg0, 4096) + -2048) * this.field58 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field52[var5][var9] = this.field52[var5][var9 + -1] + var12;
                }
                this.field64[var5][var9] = ~this.field41 >= -1 ? 4096 : -class98.method761(var2, false, this.field41) + 4096;
            }
            this.field52[var5][this.field55] = 4096;
        }
        this.field39[this.field51] = 4096;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class3() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
    public static void method11(int arg0) {
        field37 = null;
        field38 = null;
        field48 = null;
        field34 = null;
        field61 = null;
        field63 = null;
        if (arg0 >= -46) {
            method13(67, -56);
        }
        field60 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field46;
        int var3 = 90 % ((arg1 - 51) / 44);
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int var5 = 0;
            int var6;
            for (var6 = class87.field1652[arg0] + this.field65; ~var6 > -1; var6 += 4096) {
            }
            while (var6 > 4096) {
                var6 -= 4096;
            }
            while (~this.field51 < ~var5 && ~var6 <= ~this.field39[var5]) {
                ++var5;
            }
            boolean var7 = (var5 & 1) == 0;
            int var8 = this.field39[var5 - 1];
            int var9 = var5 + -1;
            int var10 = this.field39[var5];
            if (~var6 < ~(this.field62 + var8) && -this.field62 + var10 > var6) {
                for (int var11 = 0; ~class241.field4284 < ~var11; ++var11) {
                    int var12 = 0;
                    int var13 = var7 ? this.field54 : -this.field54;
                    int var14;
                    for (var14 = class259.field4523[var11] - -(this.field49 * var13 >> 12); ~var14 > -1; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field55 && var14 >= this.field52[var9][var12]) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field52[var9][var12];
                    int var17 = this.field52[var9][var15];
                    if (var14 > var17 - -this.field62 && -this.field62 + var16 > var14) {
                        var4[var11] = this.field64[var9][var15];
                    } else {
                        var4[var11] = 0;
                    }
                }
            } else {
                class104.method787(var4, 0, class241.field4284, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)I")
    public static final int method13(int arg0, int arg1) {
        if (arg0 <= 76) {
            return -128;
        } else {
            ++field50;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 == -641641492) {
            ++field56;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (arg2 != 6) {
                                        if (arg2 == 7) {
                                            this.field41 = arg0.method545((byte) -74);
                                        }
                                    } else {
                                        this.field36 = arg0.method545((byte) 54);
                                    }
                                } else {
                                    this.field65 = arg0.method545((byte) -81);
                                }
                            } else {
                                this.field54 = arg0.method545((byte) -97);
                            }
                        } else {
                            this.field40 = arg0.method545((byte) 127);
                        }
                    } else {
                        this.field58 = arg0.method545((byte) 106);
                    }
                } else {
                    this.field51 = arg0.method558(arg1 + 641641493);
                }
            } else {
                this.field55 = arg0.method558(arg1 + 641641493);
            }
        }
    }
}
