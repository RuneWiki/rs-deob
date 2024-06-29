import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class40 extends class34 {

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "Lkl;")
    public static class114 field588 = new class114(new byte[5000]);

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field591 = 0;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field594 = "skill: ";

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    public static int field596 = 0;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "Lve;")
    public static class233 field592;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZC)C")
    public static final char method271(boolean arg0, char arg1) {
        if (!arg0) {
            return (char) 65431;
        } else {
            ++field589;
            return ~arg1 != -182 && ~arg1 != -403 ? Character.toTitleCase(arg1) : arg1;
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V")
    public static void method272(boolean arg0) {
        field588 = null;
        if (arg0) {
            field594 = null;
            field592 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIZI[BI[Lqb;IIII)V")
    public static final void method273(byte arg0, int arg1, boolean arg2, int arg3, byte[] arg4, int arg5, class86[] arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field590;
        if (arg0 < 83) {
            method272(false);
        }
        int var11 = -1;
        class114 var12 = new class114(arg4);
        while (true) {
            int var13 = var12.method793((byte) -3);
            if (~var13 == -1) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method787((byte) 102);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 + -1;
                int var16 = var14 & 63;
                int var17 = (4036 & var14) >> 6;
                int var18 = var12.method760(false);
                int var19 = var18 >> 2;
                int var20 = var18 & 3;
                int var21 = var14 >> 12;
                if (~arg10 == ~var21 && var17 >= arg3 && ~(arg3 + 8) < ~var17 && arg9 <= var16 && arg9 + 8 > var16) {
                    class250 var22 = class91.method618(114, var11);
                    int var23 = arg7 + class253.method1699(var22.field3821, var20, var22.field3808, 1, arg1, var16 & 7, 7 & var17);
                    int var24 = class56.method378(var16 & 7, var22.field3821, arg1, var20, 7 & var17, var22.field3808, (byte) -90) + arg5;
                    if (var23 > 0 && var24 > 0 && ~var23 > -104 && var24 < 103) {
                        class86 var25 = null;
                        if (!arg2) {
                            int var26 = arg8;
                            if (~(2 & class189.field2684[1][var23][var24]) == -3) {
                                var26 = arg8 - 1;
                            }
                            if (~var26 <= -1) {
                                var25 = arg6[var26];
                            }
                        }
                        class67.method458(var23, var24, arg1 + var20 & 3, var19, arg2, var25, !arg2, 4, var11, arg8, arg8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            method272(true);
        }
        int[][] var3 = super.field1716.method6(arg1, (byte) -102);
        ++field593;
        if (super.field1716.field23 && this.method240(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field487 * super.field487;
            for (int var8 = 0; class77.field1178 > var8; ++var8) {
                int var9 = super.field485[var7 - -(var8 % super.field491)];
                var6[var8] = class184.method1188(var9 << 4, 4080);
                var5[var8] = class184.method1188(var9, 65280) >> 4;
                var4[var8] = class184.method1188(var9, 16711680) >> 12;
            }
        }
        return var3;
    }
}
