import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class50 extends class167 {

    @OriginalMember(owner = "client!ee", name = "U", descriptor = "I")
    private int field1036 = 585;

    @OriginalMember(owner = "client!ee", name = "W", descriptor = "I")
    public static int field1038 = 0;

    @OriginalMember(owner = "client!ee", name = "T", descriptor = "Lkh;")
    public static class117 field1035 = class224.method1450((byte) -74, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!ee", name = "X", descriptor = "I")
    public static volatile int field1039 = -1;

    @OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ee", name = "Z", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!ee", name = "ab", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)V")
    public static void method388(int arg0) {
        field1035 = null;
        if (arg0 != 1566577612) {
            method390(-66);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 == -1) {
                this.field1036 = arg0.method1049((byte) 116);
            }
            ++field1042;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field1040;
        int[] var3 = super.field3013.method1463((byte) -115, arg1);
        if (arg0 != -96) {
            method389(-73, (byte[]) null, 19, false, -27, -27, -60, -104, (class3[]) null, -9, 121);
        }
        if (super.field3013.field4085) {
            int var4 = class143.field2583[arg1];
            for (int var5 = 0; class115.field2146 > var5; ++var5) {
                int var6 = class70.field1350[var5];
                if (~var6 < ~this.field1036 && ~(-this.field1036 + 4096) < ~var6 && ~var4 < ~(-this.field1036 + 2048) && var4 < this.field1036 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1036);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field1036 + 2048) > ~var6 && ~(this.field1036 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1036;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field1036 + 2048);
                } else if (~var4 <= ~this.field1036 && -this.field1036 + 4096 >= var4) {
                    if (~this.field1036 >= ~var6 && var6 <= 4096 - this.field1036) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 <= -1 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1036 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1036;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1036 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[BIZIIII[Lab;II)V")
    public static final void method389(int arg0, byte[] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, class3[] arg8, int arg9, int arg10) {
        ++field1037;
        class145 var11 = new class145(arg1);
        int var12 = -1;
        if (arg5 != 103) {
            field1039 = 124;
        }
        while (true) {
            int var13 = var11.method999((byte) -121);
            if (~var13 == -1) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1003(-104);
                if (~var15 == -1) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = 63 & var14;
                int var17 = var14 >> 12;
                int var18 = (4045 & var14) >> 6;
                int var19 = var11.method998(57);
                int var20 = var19 >> 2;
                int var21 = 3 & var19;
                if (arg2 == var17 && ~var18 <= ~arg4 && arg4 + 8 > var18 && ~var16 <= ~arg6 && arg6 - -8 > var16) {
                    class211 var22 = class48.method379(72, var12);
                    int var23 = arg7 + class36.method321(arg10, var21, var22.field3814, 19661112, var16 & 7, 7 & var18, var22.field3804);
                    int var24 = arg9 - -class70.method490(arg10, (byte) 42, var16 & 7, var22.field3804, var22.field3814, var21, var18 & 7);
                    if (var23 > 0 && ~var24 < -1 && ~var23 > -104 && var24 < 103) {
                        class3 var25 = null;
                        if (!arg3) {
                            int var26 = arg0;
                            if (~(class233.field4200[1][var23][var24] & 2) == -3) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg8[var26];
                            }
                        }
                        class54.method417(var25, arg5 ^ -27032, arg0, var20, class167.field3021, arg0, var23, arg3, var12, !arg3, arg10 + var21 & 3, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
    public static final void method390(int arg0) {
        class160.field2926 = 0;
        int var1 = (class93.field1712.field4244 >> 7) + class143.field2591;
        int var2 = (class93.field1712.field4221 >> 7) + class184.field3319;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && ~var2 >= -3137) {
            class160.field2926 = 1;
        }
        ++field1041;
        if (~var1 <= -3073 && ~var1 >= -3119 && ~var2 <= -9493 && var2 <= 9535) {
            class160.field2926 = 1;
        }
        if (class160.field2926 == arg0 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && var2 <= 3062) {
            class160.field2926 = 0;
        }
    }
}
