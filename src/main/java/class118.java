import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class118 extends class12 {

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    private int field2126 = 0;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    private int field2135 = 4096;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "[Ltg;")
    public static class184[] field2129 = new class184[100];

    @OriginalMember(owner = "client!md", name = "T", descriptor = "Ltg;")
    private static class184 field2132 = class135.method812(" is already on your friend list)3", 3);

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Ltg;")
    public static class184 field2134 = field2132;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Lof;")
    public static class138 field2131;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I[BZIIIIII[Lgf;)V")
    public static final void method715(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65[] arg9) {
        ++field2128;
        if (arg2) {
            field2134 = null;
        }
        int var10 = -1;
        class97 var11 = new class97(arg1);
        while (true) {
            int var12 = var11.method582(-14590);
            if (~var12 == -1) {
                return;
            }
            int var13 = 0;
            var10 += var12;
            while (true) {
                int var14 = var11.method582(-14590);
                if (~var14 == -1) {
                    break;
                }
                int var15 = var11.method588((byte) -113);
                var13 += var14 + -1;
                int var16 = var15 >> 2;
                int var17 = var13 >> 12;
                int var18 = (var13 & 4061) >> 6;
                int var19 = var13 & 63;
                int var20 = 3 & var15;
                if (~arg0 == ~var17 && ~var18 <= ~arg7 && ~(arg7 - -8) < ~var18 && ~arg6 >= ~var19 && arg6 + 8 > var19) {
                    class58 var21 = class14.method88(-115, var10);
                    int var22 = arg5 - -class52.method287(var21.field1027, var21.field1084, var20, arg4, var19 & 7, var18 & 7, 18492);
                    int var23 = arg3 - -class15.method92(var18 & 7, var21.field1084, 27994, arg4, var21.field1027, var20, 7 & var19);
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        int var24 = arg8;
                        class65 var25 = null;
                        if ((class46.field878[1][var22][var23] & 2) == 2) {
                            var24 = arg8 - 1;
                        }
                        if (var24 >= 0) {
                            var25 = arg9[var24];
                        }
                        class114.method704(-10182, var20 - -arg4 & 3, var25, var22, var16, var23, arg8, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field211 = ~arg0.method588((byte) -108) == -2;
                    }
                } else {
                    this.field2135 = arg0.method611(false);
                }
            } else {
                this.field2126 = arg0.method611(false);
            }
            ++field2127;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public static void method716(byte arg0) {
        field2129 = null;
        field2132 = null;
        if (arg0 != -58) {
            field2131 = null;
        }
        field2131 = null;
        field2134 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int[][] var3 = super.field232.method673(arg0, 100);
        if (super.field232.field1962) {
            int[][] var4 = this.method76(arg0, 6218, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class201.field3889; ++var11) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var6[var11];
                if (~this.field2126 < ~var12) {
                    var7[var11] = this.field2126;
                } else if (~this.field2135 <= ~var12) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field2135;
                }
                if (~this.field2126 >= ~var13) {
                    if (this.field2135 < var13) {
                        var8[var11] = this.field2135;
                    } else {
                        var8[var11] = var13;
                    }
                } else {
                    var8[var11] = this.field2126;
                }
                if (this.field2126 > var14) {
                    var10[var11] = this.field2126;
                } else if (~this.field2135 > ~var14) {
                    var10[var11] = this.field2135;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        int var15 = -34 % ((-58 - arg1) / 34);
        ++field2133;
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) 92, arg0);
        ++field2130;
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, -121);
            for (int var5 = 0; class201.field3889 > var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field2126 < ~var6) {
                    var3[var5] = this.field2126;
                } else if (~this.field2135 > ~var6) {
                    var3[var5] = this.field2135;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return arg1 != 17 ? null : var3;
    }
}
