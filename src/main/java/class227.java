import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class227 extends class259 {

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "Lv;")
    public static class57 field4054 = new class57();

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "Lsg;")
    private static class30 field4057 = class167.method1221((byte) 33, "Allocating memory");

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "Lsg;")
    public static class30 field4058 = field4057;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "Lsg;")
    public static class30 field4064 = class167.method1221((byte) 33, "scrollen:");

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "Lsg;")
    public static class30 field4063 = class167.method1221((byte) 33, "logo");

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
    public static int field4065 = -2;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "Lsg;")
    private static class30 field4061 = class167.method1221((byte) 33, "wave:");

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "Lsg;")
    public static class30 field4059 = field4061;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "Lsg;")
    public static class30 field4060 = field4061;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!bh", name = "ib", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!bh", name = "jb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "Lmc;")
    public static class151 field4055;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "(I)V")
    public static final void method1618(int arg0) {
        class101.field2063.method1650(arg0 + 4187);
        if (arg0 != -4097) {
            method1620((byte) 93);
        }
        ++field4067;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            method1620((byte) 50);
        }
        ++field4052;
        if (arg0 == 0) {
            super.field4588 = arg2.method63((byte) 70) == 1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class227() {
        super(3, false);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public static final void method1619(byte arg0) {
        if (arg0 < 61) {
            field4055 = null;
        }
        class243.field4349.method1652(-8259);
        ++field4056;
        class163.field3033.method1652(-8259);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        int var3 = 107 / ((arg0 - -48) / 42);
        ++field4050;
        int[][] var4 = super.field4568.method241(-91, arg1);
        if (super.field4568.field564) {
            int[] var5 = this.method1799(2, arg1, 117);
            int[][] var6 = this.method1795(arg1, 2, 0);
            int[][] var7 = this.method1795(arg1, 2, 1);
            int[] var8 = var4[1];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[0];
            int[] var16 = var7[2];
            for (int var17 = 0; ~class223.field3999 < ~var17; ++var17) {
                int var18 = var5[var17];
                if (~var18 != -4097) {
                    if (var18 != 0) {
                        int var19 = -var18 + 4096;
                        var9[var17] = var11[var17] * var18 + var15[var17] * var19 >> 12;
                        var8[var17] = var12[var17] * var18 + var14[var17] * var19 >> 12;
                        var10[var17] = var13[var17] * var18 + var16[var17] * var19 >> 12;
                    } else {
                        var9[var17] = var15[var17];
                        var8[var17] = var14[var17];
                        var10[var17] = var16[var17];
                    }
                } else {
                    var9[var17] = var11[var17];
                    var8[var17] = var12[var17];
                    var10[var17] = var13[var17];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)V")
    public static void method1620(byte arg0) {
        field4061 = null;
        field4060 = null;
        field4059 = null;
        field4054 = null;
        field4064 = null;
        field4057 = null;
        field4063 = null;
        int var1 = -31 / ((arg0 - -35) / 51);
        field4055 = null;
        field4058 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIILni;JLni;Lni;)V")
    public static final void method1621(int arg0, int arg1, int arg2, int arg3, class20 arg4, long arg5, class20 arg6, class20 arg7) {
        class177 var9 = new class177();
        var9.field3281 = arg4;
        var9.field3282 = arg1 * 128 + 64;
        var9.field3279 = arg2 * 128 + 64;
        var9.field3278 = arg3;
        var9.field3285 = arg5;
        var9.field3286 = arg6;
        var9.field3290 = arg7;
        int var10 = 0;
        class195 var11 = class71.field1613[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3522; ++var12) {
                class35 var13 = var11.field3540[var12];
                if ((var13.field863 & 4194304L) == 4194304L) {
                    int var14 = var13.field857.method22();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field3284 = -var10;
        if (class71.field1613[arg0][arg1][arg2] == null) {
            class71.field1613[arg0][arg1][arg2] = new class195(arg0, arg1, arg2);
        }
        class71.field1613[arg0][arg1][arg2].field3520 = var9;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(JI)V")
    public static final void method1622(long arg0, int arg1) {
        int var3 = 31 % ((-36 - arg1) / 33);
        ++field4051;
        if (arg0 != 0L) {
            ++class33.field821;
            class196.field3553.method1267(161, -9);
            class196.field3553.method72(-1033389592, arg0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            int[] var3 = super.field4581.method1841(18, arg0);
            if (super.field4581.field4729) {
                int[] var4 = this.method1799(0, arg0, 119);
                int[] var5 = this.method1799(1, arg0, 114);
                int[] var6 = this.method1799(2, arg0, 119);
                for (int var7 = 0; class223.field3999 > var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (~var8 != -1) {
                            var3[var7] = var4[var7] * var8 - -((4096 - var8) * var5[var7]) >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            ++field4066;
            return var3;
        }
    }
}
