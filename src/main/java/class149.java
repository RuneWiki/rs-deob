import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class149 extends class33 {

    @OriginalMember(owner = "client!p", name = "O", descriptor = "[I")
    public static int[] field2839 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!p", name = "P", descriptor = "I")
    public static int field2840 = 0;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field2837 = 0;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field2845 = 0;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "Lwd;")
    public static class220 field2846;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "[[[[Z")
    public static boolean[][][][] field2844;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int var3 = -77 % ((-65 - arg1) / 60);
        ++field2841;
        int[] var4 = super.field718.method514(arg0, 122);
        if (super.field718.field1615) {
            int[][] var5 = this.method259(0, -9, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            for (int var9 = 0; ~var9 > ~class117.field2173; ++var9) {
                var4[var9] = (var6[var9] - -var7[var9] + var8[var9]) / 3;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class149() {
        super(1, true);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(BLqf;I)I")
    public static final int method981(byte arg0, class165 arg1, int arg2) {
        ++field2842;
        if (arg0 <= 115) {
            method982((byte) -75);
        }
        if (arg1.field3049 != null && arg2 < arg1.field3049.length) {
            try {
                int[] var3 = arg1.field3049[arg2];
                int var4 = 0;
                byte var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = var3[var6++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (~var7 == -17) {
                        var9 = 2;
                    }
                    if (~var7 == -2) {
                        var8 = class198.field3863[var3[var6++]];
                    }
                    if (var7 == 2) {
                        var8 = client.field630[var3[var6++]];
                    }
                    if (~var7 == -18) {
                        var9 = 3;
                    }
                    if (var7 == 3) {
                        var8 = class18.field380[var3[var6++]];
                    }
                    if (~var7 == -5) {
                        int var10 = var3[var6++] << 16;
                        int var11 = var10 + var3[var6++];
                        class165 var12 = class103.method639(var11, true);
                        int var13 = var3[var6++];
                        if (~var13 != 0 && (!class195.method1298(1639, var13).field386 || class175.field3446)) {
                            for (int var14 = 0; var12.field3111.length > var14; ++var14) {
                                if (var13 + 1 == var12.field3111[var14]) {
                                    var8 += var12.field3102[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var8 = class45.field913[var3[var6++]];
                    }
                    if (~var7 == -7) {
                        var8 = class56.field1108[client.field630[var3[var6++]] - 1];
                    }
                    if (var7 == 7) {
                        var8 = 100 * class45.field913[var3[var6++]] / 46875;
                    }
                    if (~var7 == -9) {
                        var8 = class175.field3447.field4110;
                    }
                    if (~var7 == -10) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class73.field1422[var15]) {
                                var8 += client.field630[var15];
                            }
                        }
                    }
                    if (~var7 == -11) {
                        int var16 = var3[var6++] << 16;
                        int var17 = var16 + var3[var6++];
                        class165 var18 = class103.method639(var17, true);
                        int var19 = var3[var6++];
                        if (var19 != -1 && (!class195.method1298(1639, var19).field386 || class175.field3446)) {
                            for (int var20 = 0; var20 < var18.field3111.length; ++var20) {
                                if (var19 + 1 == var18.field3111[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class122.field2297;
                    }
                    if (var7 == 12) {
                        var8 = class205.field4017;
                    }
                    if (var7 == 13) {
                        int var21 = class45.field913[var3[var6++]];
                        int var22 = var3[var6++];
                        var8 = ~(1 << var22 & var21) == -1 ? 0 : 1;
                    }
                    if (~var7 == -15) {
                        int var23 = var3[var6++];
                        var8 = class105.method647(var23, (byte) 71);
                    }
                    if (~var7 == -19) {
                        var8 = (class175.field3447.field2820 >> 7) + class108.field2024;
                    }
                    if (~var7 == -20) {
                        var8 = (class175.field3447.field2801 >> 7) + class43.field874;
                    }
                    if (var7 == 20) {
                        var8 = var3[var6++];
                    }
                    if (~var9 != -1) {
                        var5 = var9;
                    } else {
                        if (var5 == 0) {
                            var4 += var8;
                        }
                        if (var5 == 1) {
                            var4 -= var8;
                        }
                        if (~var5 == -3 && var8 != 0) {
                            var4 /= var8;
                        }
                        if (~var5 == -4) {
                            var4 *= var8;
                        }
                        var5 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
    public static void method982(byte arg0) {
        field2844 = null;
        if (arg0 >= -105) {
            field2837 = 81;
        }
        field2839 = null;
        field2846 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)I")
    public static final int method983(boolean arg0, int arg1) {
        if (!arg0) {
            method981((byte) -122, (class165) null, -125);
        }
        ++field2838;
        return arg1 & 255;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lbc;Lbc;BLbc;Lbc;)V")
    public static final void method984(class14 arg0, class14 arg1, byte arg2, class14 arg3, class14 arg4) {
        class120.field2210 = arg0;
        ++field2843;
        if (arg2 <= 113) {
            field2837 = 127;
        }
        class40.field835 = arg3;
        class182.field3564 = arg4;
        class135.field2563 = arg1;
        class63.field1232 = new class165[class120.field2210.method132(false)][];
        class144.field2689 = new boolean[class120.field2210.method132(false)];
    }
}
