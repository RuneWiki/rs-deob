import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class95 extends class59 {

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "Z")
    private boolean field1839 = true;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "Z")
    private boolean field1840 = true;

    @OriginalMember(owner = "client!ke", name = "eb", descriptor = "I")
    public static int field1844 = 1;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "[Z")
    public static boolean[] field1834 = new boolean[100];

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    public static int field1833 = 128;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "Lsd;")
    public static class166 field1837 = class135.method935(":tradereq:", 0);

    @OriginalMember(owner = "client!ke", name = "db", descriptor = "Lsd;")
    private static class166 field1843 = class135.method935("Loading sprites )2 ", 0);

    @OriginalMember(owner = "client!ke", name = "fb", descriptor = "Lsd;")
    public static class166 field1845 = field1843;

    @OriginalMember(owner = "client!ke", name = "ib", descriptor = "Lsd;")
    public static class166 field1848 = class135.method935("Bitte geben Sie Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ke", name = "hb", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ke", name = "gb", descriptor = "Lvd;")
    public static class193 field1846;

    @OriginalMember(owner = "client!ke", name = "cb", descriptor = "Lcb;")
    public static class22 field1842;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "Lkf;")
    public static class96 field1832;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "[I")
    public static int[] field1836;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 <= 18) {
            field1843 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1216 = arg0.method400(255) == 1;
                }
            } else {
                this.field1839 = ~arg0.method400(255) == -2;
            }
        } else {
            this.field1840 = arg0.method400(255) == 1;
        }
        ++field1835;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII[BIILi;[Lpf;II)V")
    public static final void method726(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, class73 arg7, class141[] arg8, int arg9, int arg10) {
        if (arg1 != 24545) {
            field1848 = null;
        }
        class53 var11 = new class53(arg4);
        ++field1838;
        int var12 = -1;
        while (true) {
            int var13 = var11.method425(arg1 + -46007);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method425(arg1 + -46007);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = 63 & var14;
                int var17 = 63 & var14 >> 6;
                int var18 = var14 >> 12;
                int var19 = var11.method400(255);
                int var20 = var19 & 3;
                int var21 = var19 >> 2;
                if (arg5 == var18 && ~var17 <= ~arg6 && ~(arg6 - -8) < ~var17 && ~arg2 >= ~var16 && var16 < arg2 + 8) {
                    class145 var22 = class170.method1185((byte) 113, var12);
                    int var23 = class23.method156(var22.field2825, var17 & 7, var22.field2832, 7 & var16, arg10, var20, 73) + arg3;
                    int var24 = arg9 - -class146.method1005(var17 & 7, var22.field2825, var20, var16 & 7, var22.field2832, (byte) 64, arg10);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg0;
                        if ((class122.field2387[1][var23][var24] & 2) == 2) {
                            var25 = arg0 - 1;
                        }
                        class141 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg8[var25];
                        }
                        class140.method954(var20 - -arg10 & 3, arg0, (byte) -21, var12, var24, var21, arg7, var23, var26);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)V")
    public static void method727(int arg0) {
        if (arg0 != 1) {
            field1848 = null;
        }
        field1848 = null;
        field1836 = null;
        field1837 = null;
        field1843 = null;
        field1846 = null;
        field1842 = null;
        field1832 = null;
        field1834 = null;
        field1845 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        ++field1841;
        int[] var3 = super.field1219.method721(arg0, -124);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, this.field1839 ? -arg0 + class137.field2679 : arg0, 0);
            if (!this.field1840) {
                class71.method570(var4, 0, var3, 0, class98.field1879);
            } else {
                for (int var5 = 0; ~class98.field1879 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class187.field3571];
                }
            }
        }
        return arg1 >= -124 ? null : var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        int[][] var3 = super.field1207.method528(56, arg1);
        if (!arg0) {
            this.field1840 = false;
        }
        ++field1847;
        if (super.field1207.field1320) {
            int[][] var4 = this.method498(this.field1839 ? -arg1 + class137.field2679 : arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            if (!this.field1840) {
                for (int var11 = 0; var11 < class98.field1879; ++var11) {
                    var9[var11] = var5[var11];
                    var8[var11] = var7[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; class98.field1879 > var12; ++var12) {
                    var9[var12] = var5[-var12 + class187.field3571];
                    var8[var12] = var7[-var12 + class187.field3571];
                    var10[var12] = var6[-var12 + class187.field3571];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, false);
    }
}
