import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class8 extends class117 {

    @OriginalMember(owner = "client!ni", name = "X", descriptor = "I")
    private int field135 = 2048;

    @OriginalMember(owner = "client!ni", name = "U", descriptor = "I")
    private int field132 = 12288;

    @OriginalMember(owner = "client!ni", name = "Z", descriptor = "I")
    private int field137 = 2048;

    @OriginalMember(owner = "client!ni", name = "V", descriptor = "I")
    private int field133 = 8192;

    @OriginalMember(owner = "client!ni", name = "fb", descriptor = "I")
    private int field143 = 0;

    @OriginalMember(owner = "client!ni", name = "eb", descriptor = "I")
    private int field142 = 0;

    @OriginalMember(owner = "client!ni", name = "bb", descriptor = "I")
    private int field139 = 4096;

    @OriginalMember(owner = "client!ni", name = "ab", descriptor = "I")
    public static int field138 = 0;

    @OriginalMember(owner = "client!ni", name = "Y", descriptor = "Lhh;")
    public static class163 field136 = class137.method1065(":clan:", 17);

    @OriginalMember(owner = "client!ni", name = "gb", descriptor = "Lhh;")
    public static class163 field144 = class137.method1065("headicons_prayer", 17);

    @OriginalMember(owner = "client!ni", name = "hb", descriptor = "I")
    public static int field145 = 0;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ni", name = "T", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ni", name = "W", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ni", name = "db", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!ni", name = "ib", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!ni", name = "cb", descriptor = "Lpa;")
    public static class123 field140;

    @OriginalMember(owner = "client!ni", name = "S", descriptor = "[Lvf;")
    public static class71[] field130;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(B)V")
    public final void method57(byte arg0) {
        if (arg0 >= -92) {
            this.method57((byte) 66);
        }
        class223.method1578(true);
        ++field146;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)Z")
    private final boolean method58(byte arg0, int arg1, int arg2) {
        int var4 = (arg1 - -arg2) * this.field132 >> 12;
        if (arg0 != 57) {
            return false;
        } else {
            int var5 = class26.field412[255 & var4 * 255 >> 12];
            ++field134;
            int var6 = (var5 << 12) / this.field132;
            int var7 = (var6 << 12) / this.field133;
            int var8 = this.field139 * var7 >> 12;
            return var8 > -arg2 + arg1 && -arg2 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III)Z")
    private final boolean method59(int arg0, int arg1, int arg2) {
        if (arg1 != -911045908) {
            return false;
        } else {
            ++field129;
            int var4 = (arg0 - arg2) * this.field132 >> 12;
            int var5 = class26.field412[(1046332 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field132;
            int var7 = (var6 << 12) / this.field133;
            int var8 = this.field139 * var7 >> 12;
            return var8 > arg0 + arg2 && ~(-var8) > ~(arg0 + arg2);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IILpg;)V")
    public final void method60(int arg0, int arg1, class81 arg2) {
        ++field141;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field133 = arg2.method658(-126);
                                }
                            } else {
                                this.field139 = arg2.method658(-125);
                            }
                        } else {
                            this.field132 = arg2.method658(-59);
                        }
                    } else {
                        this.field135 = arg2.method658(-119);
                    }
                } else {
                    this.field142 = arg2.method658(-117);
                }
            } else {
                this.field143 = arg2.method658(arg0 + 74);
            }
        } else {
            this.field137 = arg2.method658(-108);
        }
        if (arg0 != 0) {
            this.field133 = -110;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[I")
    public final int[] method61(int arg0, int arg1) {
        int[] var3 = super.field2218.method1044(arg1, 0);
        if (super.field2218.field2587) {
            int var4 = class214.field3911[arg1] + -2048;
            for (int var5 = 0; var5 < class143.field2702; ++var5) {
                int var6 = class26.field402[var5] - 2048;
                int var7 = this.field137 + var6;
                int var8 = var4 - -this.field135;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = this.field143 + var4;
                int var11 = this.field142 + var6;
                int var12 = ~var9 >= -2049 ? var9 : var9 - 4096;
                int var13 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var14 = var10 >= -2048 ? var10 : var10 + 4096;
                int var15 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var16 = var14 <= 2048 ? var14 : var14 + -4096;
                int var17 = var15 <= 2048 ? var15 : var15 + -4096;
                int var18 = var13 > 2048 ? var13 + -4096 : var13;
                var3[var5] = !this.method59(var16, arg0 + -911024515, var17) && !this.method58((byte) 57, var12, var18) ? 0 : 4096;
            }
        }
        if (arg0 != -21393) {
            this.method60(31, 1, (class81) null);
        }
        ++field131;
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(B)V")
    public static void method62(byte arg0) {
        if (arg0 == 69) {
            field136 = null;
            field130 = null;
            field144 = null;
            field140 = null;
        }
    }
}
