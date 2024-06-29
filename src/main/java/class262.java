import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class262 extends class157 {

    @OriginalMember(owner = "client!kl", name = "W", descriptor = "I")
    private int field4710 = 12288;

    @OriginalMember(owner = "client!kl", name = "bb", descriptor = "I")
    private int field4715 = 8192;

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "I")
    private int field4712 = 0;

    @OriginalMember(owner = "client!kl", name = "V", descriptor = "I")
    private int field4709 = 4096;

    @OriginalMember(owner = "client!kl", name = "fb", descriptor = "I")
    private int field4719 = 2048;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "I")
    private int field4706 = 2048;

    @OriginalMember(owner = "client!kl", name = "gb", descriptor = "I")
    private int field4720 = 0;

    @OriginalMember(owner = "client!kl", name = "T", descriptor = "Lcc;")
    private static class209 field4707 = class95.method669(87, "flash1:");

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "[Ltf;")
    public static class106[] field4702 = new class106[2048];

    @OriginalMember(owner = "client!kl", name = "ab", descriptor = "I")
    public static int field4714 = 0;

    @OriginalMember(owner = "client!kl", name = "Z", descriptor = "Lcc;")
    public static class209 field4713 = field4707;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Lcc;")
    private static class209 field4703 = class95.method669(90, "Loaded sprites");

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "Lcc;")
    public static class209 field4705 = field4703;

    @OriginalMember(owner = "client!kl", name = "ib", descriptor = "Lcc;")
    public static class209 field4722 = field4707;

    @OriginalMember(owner = "client!kl", name = "U", descriptor = "Lta;")
    public static class255 field4708 = new class255(16);

    @OriginalMember(owner = "client!kl", name = "jb", descriptor = "I")
    public static int field4723 = 0;

    @OriginalMember(owner = "client!kl", name = "nb", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!kl", name = "mb", descriptor = "I")
    public static int field4726 = -1;

    @OriginalMember(owner = "client!kl", name = "ob", descriptor = "I")
    public static int field4728 = 0;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!kl", name = "eb", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!kl", name = "hb", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!kl", name = "kb", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!kl", name = "lb", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!kl", name = "db", descriptor = "Lte;")
    public static class77 field4717;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method1804(boolean arg0) {
        field4702 = null;
        field4717 = null;
        field4705 = null;
        field4703 = null;
        field4707 = null;
        field4708 = null;
        field4722 = null;
        field4713 = null;
        if (arg0) {
            field4713 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1805(int arg0, int arg1, int arg2, long arg3) {
        class109 var5 = class106.field2089[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2213 != null && var5.field2213.field3385 == arg3) {
            return true;
        } else if (var5.field2218 != null && var5.field2218.field3270 == arg3) {
            return true;
        } else if (var5.field2198 != null && var5.field2198.field4171 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2203; ++var6) {
                if (var5.field2189[var6].field4733 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field4704;
        if (arg1 >= -29) {
            this.method1806(-37, true, 97);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field4715 = arg2.method736(125);
                                }
                            } else {
                                this.field4709 = arg2.method736(125);
                            }
                        } else {
                            this.field4710 = arg2.method736(126);
                        }
                    } else {
                        this.field4719 = arg2.method736(124);
                    }
                } else {
                    this.field4712 = arg2.method736(126);
                }
            } else {
                this.field4720 = arg2.method736(125);
            }
        } else {
            this.field4706 = arg2.method736(122);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        int[] var3 = super.field2879.method1269(arg1, 17885);
        ++field4716;
        if (super.field2879.field3363) {
            int var4 = class129.field2479[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class226.field4124; ++var5) {
                int var6 = class50.field987[var5] + -2048;
                int var7 = this.field4706 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = this.field4712 + var6;
                int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                int var11 = ~var10 >= -2049 ? var10 : var10 + -4096;
                int var12 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var13 = this.field4719 + var4;
                int var14 = var4 - -this.field4720;
                int var15 = ~var13 <= 2047 ? var13 : var13 - -4096;
                int var16 = ~var14 > 2047 ? var14 - -4096 : var14;
                int var17 = var15 <= 2048 ? var15 : var15 + -4096;
                int var18 = var16 > 2048 ? var16 - 4096 : var16;
                var3[var5] = !this.method1807((byte) -49, var18, var12) && !this.method1806(var11, false, var17) ? 0 : 4096;
            }
        }
        if (arg0 != -98) {
            method1804(true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        ++field4711;
        class257.method1773(0);
        int var2 = -55 / ((-51 - arg0) / 52);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZI)Z")
    private final boolean method1806(int arg0, boolean arg1, int arg2) {
        ++field4718;
        if (arg1) {
            this.method3((byte) 72);
        }
        int var4 = (arg0 + arg2) * this.field4710 >> 12;
        int var5 = class209.field3785[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4710;
        int var7 = (var6 << 12) / this.field4715;
        int var8 = this.field4709 * var7 >> 12;
        return ~var8 < ~(-arg0 + arg2) && -var8 < -arg0 + arg2;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(BII)Z")
    private final boolean method1807(byte arg0, int arg1, int arg2) {
        if (arg0 != -49) {
            this.method1807((byte) -8, -79, 71);
        }
        ++field4721;
        int var4 = (-arg2 + arg1) * this.field4710 >> 12;
        int var5 = class209.field3785[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field4710;
        int var7 = (var6 << 12) / this.field4715;
        int var8 = this.field4709 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && ~(arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class262() {
        super(0, true);
    }
}
