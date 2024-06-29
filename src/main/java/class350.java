import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class350 extends class264 {

    @OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
    private int field4818 = 81;

    @OriginalMember(owner = "client!gu", name = "Y", descriptor = "I")
    private int field4820 = 1024;

    @OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
    private int field4815 = 1024;

    @OriginalMember(owner = "client!gu", name = "N", descriptor = "I")
    private int field4810 = 0;

    @OriginalMember(owner = "client!gu", name = "gb", descriptor = "I")
    private int field4828 = 409;

    @OriginalMember(owner = "client!gu", name = "fb", descriptor = "I")
    private int field4827 = 8;

    @OriginalMember(owner = "client!gu", name = "Z", descriptor = "I")
    private int field4821 = 4;

    @OriginalMember(owner = "client!gu", name = "bb", descriptor = "I")
    private int field4823 = 204;

    @OriginalMember(owner = "client!gu", name = "V", descriptor = "[I")
    public static int[] field4817 = new int[14];

    @OriginalMember(owner = "client!gu", name = "db", descriptor = "Llo;")
    public static class280 field4825 = new class280("stellardawn", 1);

    @OriginalMember(owner = "client!gu", name = "jb", descriptor = "Lrc;")
    public static class108 field4831 = new class108(45, -1);

    @OriginalMember(owner = "client!gu", name = "kb", descriptor = "I")
    public static int field4832 = 0;

    @OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
    private int field4813;

    @OriginalMember(owner = "client!gu", name = "S", descriptor = "I")
    private int field4814;

    @OriginalMember(owner = "client!gu", name = "U", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!gu", name = "ab", descriptor = "I")
    private int field4822;

    @OriginalMember(owner = "client!gu", name = "ib", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!gu", name = "lb", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!gu", name = "Q", descriptor = "Lcj;")
    public static class192 field4812;

    @OriginalMember(owner = "client!gu", name = "eb", descriptor = "[I")
    private int[] field4826;

    @OriginalMember(owner = "client!gu", name = "cb", descriptor = "[[I")
    private int[][] field4824;

    @OriginalMember(owner = "client!gu", name = "hb", descriptor = "[[I")
    private int[][] field4829;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BLkk;I)V", line = 4)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        if (arg0 > 31) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 != 6) {
                                        if (arg2 == 7) {
                                            this.field4815 = arg1.method1134(-16848);
                                        }
                                    } else {
                                        this.field4818 = arg1.method1134(-16848);
                                    }
                                } else {
                                    this.field4810 = arg1.method1134(-16848);
                                }
                            } else {
                                this.field4820 = arg1.method1134(-16848);
                            }
                        } else {
                            this.field4823 = arg1.method1134(-16848);
                        }
                    } else {
                        this.field4828 = arg1.method1134(-16848);
                    }
                } else {
                    this.field4827 = arg1.method1172((byte) 71);
                }
            } else {
                this.field4821 = arg1.method1172((byte) -121);
            }
            ++field4819;
        }
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(II)I", line = 90)
    public static final int method2166(int arg0, int arg1) {
        ++field4811;
        return arg0 != -1017594230 ? -28 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "(I)V", line = 104)
    private final void method2167(int arg0) {
        ++field4833;
        Random var2 = new Random((long) this.field4827);
        this.field4813 = 4096 / this.field4827;
        int var3 = -99 % ((-57 - arg0) / 56);
        this.field4814 = 4096 / this.field4821;
        this.field4822 = this.field4818 / 2;
        int var4 = this.field4814 / 2;
        this.field4829 = new int[this.field4827][this.field4821];
        int var5 = this.field4813 / 2;
        this.field4824 = new int[this.field4827][this.field4821 + 1];
        this.field4826 = new int[this.field4827 + 1];
        this.field4826[0] = 0;
        for (int var6 = 0; ~var6 > ~this.field4827; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field4813;
                int var8 = (class424.method2524(var2, 4096, (byte) -72) - 2048) * this.field4823 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field4826[var6] = this.field4826[var6 + -1] + var9;
            }
            this.field4824[var6][0] = 0;
            for (int var10 = 0; var10 < this.field4821; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field4814;
                    int var12 = (class424.method2524(var2, 4096, (byte) -116) - 2048) * this.field4828 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field4824[var6][var10] = this.field4824[var6][var10 + -1] - -var13;
                }
                this.field4829[var6][var10] = this.field4815 > 0 ? 4096 + -class424.method2524(var2, this.field4815, (byte) -81) : 4096;
            }
            this.field4824[var6][this.field4821] = 4096;
        }
        this.field4826[this.field4827] = 4096;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V", line = 194)
    public class350() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)[I", line = 202)
    public final int[] method90(int arg0, int arg1) {
        ++field4816;
        int[] var3 = super.field3808.method958((byte) 69, arg0);
        if (arg1 != 21034) {
            return null;
        } else {
            if (super.field3808.field1732) {
                int var4 = 0;
                int var5;
                for (var5 = class379.field5216[arg0] + this.field4810; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (~this.field4827 < ~var4 && var5 >= this.field4826[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (1 & var4) == 0;
                int var8 = this.field4826[var4];
                int var9 = this.field4826[var4 - 1];
                if (var5 > this.field4822 + var9 && -this.field4822 + var8 > var5) {
                    for (int var10 = 0; ~class478.field6792 < ~var10; ++var10) {
                        int var11 = !var7 ? -this.field4820 : this.field4820;
                        int var12 = 0;
                        int var13;
                        for (var13 = class151.field2084[var10] - -(this.field4814 * var11 >> 12); ~var13 > -1; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (this.field4821 > var12 && var13 >= this.field4824[var6][var12]) {
                            ++var12;
                        }
                        int var14 = var12 - 1;
                        int var15 = this.field4824[var6][var12];
                        int var16 = this.field4824[var6][var14];
                        if (this.field4822 + var16 < var13 && ~(-this.field4822 + var15) < ~var13) {
                            var3[var10] = this.field4829[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class214.method1452(var3, 0, class478.field6792, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V", line = 301)
    public final void method95(int arg0) {
        if (arg0 != -8) {
            this.method7((byte) -13, (class161) null, 87);
        }
        ++field4830;
        this.method2167(arg0 ^ 122);
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)V", line = 329)
    public static void method2168(byte arg0) {
        if (arg0 != 71) {
            method2168((byte) -85);
        }
        field4812 = null;
        field4831 = null;
        field4817 = null;
        field4825 = null;
    }
}
