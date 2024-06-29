import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class158 extends class272 {

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    private int field2994 = -1;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field2986 = -1;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "[I")
    public static int[] field2985 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!me", name = "P", descriptor = "[[I")
    public static int[][] field2990 = new int[5][5000];

    @OriginalMember(owner = "client!me", name = "Z", descriptor = "Lli;")
    public static class185 field3000 = class245.method1649(")3", -48);

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field2989 = -1;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "Lli;")
    public static class185 field2999 = class245.method1649(")3)3)3", 124);

    @OriginalMember(owner = "client!me", name = "cb", descriptor = "[I")
    public static int[] field3003 = new int[1000];

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lli;")
    public static class185 field2983 = class245.method1649(":assistreq:", 125);

    @OriginalMember(owner = "client!me", name = "ab", descriptor = "I")
    public static int field3001 = 5063219;

    @OriginalMember(owner = "client!me", name = "db", descriptor = "[I")
    public static int[] field3004 = new int[500];

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!me", name = "eb", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!me", name = "fb", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "[I")
    public int[] field2995;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
    public final boolean method1120(int arg0) {
        ++field2998;
        if (this.field2995 != null) {
            return true;
        } else {
            if (arg0 != -26981) {
                field2986 = -2;
            }
            if (this.field2994 >= 0) {
                class101 var2 = field2989 >= 0 ? class129.method919((byte) -106, this.field2994, class9.field180, field2989) : class266.method1813(this.field2994, class9.field180, -52);
                var2.method697();
                this.field2995 = var2.field1846;
                this.field2984 = var2.field3854;
                this.field2988 = var2.field3853;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2994 = arg0.method827(255);
        }
        ++field2992;
        int var4 = 67 / ((-21 - arg1) / 55);
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    public static void method1121(int arg0) {
        field2985 = null;
        field3003 = null;
        field2983 = null;
        field3000 = null;
        if (arg0 != 0) {
            field2997 = -124;
        }
        field2990 = null;
        field2999 = null;
        field3004 = null;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I")
    public final int method1122(int arg0) {
        ++field2991;
        if (arg0 >= -46) {
            method1121(-77);
        }
        return this.field2994;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lhi;II)Lig;")
    public static final class150 method1123(class250 arg0, int arg1, int arg2) {
        if (arg1 != -18660) {
            method1124(66, 92, (class47) null, -99, 63, 71, 121);
        }
        byte[] var3 = arg0.method1697(arg2, (byte) -56);
        ++field2996;
        return var3 == null ? null : new class150(var3);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method231(int arg0) {
        super.method231(arg0);
        if (arg0 != -4) {
            field2985 = null;
        }
        ++field3007;
        this.field2995 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILwf;IIII)V")
    public static final void method1124(int arg0, int arg1, class47 arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        ++field3006;
        long var8 = 0L;
        boolean var10 = false;
        boolean var11 = false;
        if (~arg6 != -1) {
            if (~arg6 == -2) {
                var8 = class2.method27(arg5, arg1, arg0);
            } else if (arg6 == 2) {
                var8 = class228.method1579(arg5, arg1, arg0);
            } else if (~arg6 == -4) {
                var8 = class32.method201(arg5, arg1, arg0);
            }
        } else {
            var8 = class255.method1724(arg5, arg1, arg0);
        }
        int var12 = (int) var8 >> 20 & 3;
        int var13 = Integer.MAX_VALUE & (int) (var8 >>> 32);
        class135 var14 = class184.method1294(var13, -28916);
        int var15 = (520733 & (int) var8) >> 14;
        if (arg3 <= 13) {
            field2989 = 71;
        }
        if (var14.method969(-15238)) {
            class111.method779((byte) -7, arg0, arg1, var14, arg5);
        }
        if (var8 != 0L) {
            if (arg6 != 0) {
                if (arg6 == 1) {
                    class104.method735(arg5, arg1, arg0);
                    return;
                }
                if (~arg6 != -3) {
                    if (~arg6 == -4) {
                        client.method1504(arg5, arg1, arg0);
                        if (var14.field2516 == 1) {
                            arg2.method291(arg0, arg1, (byte) -85);
                            return;
                        }
                    }
                    return;
                }
                class189.method1361(arg5, arg1, arg0);
                if (~var14.field2516 != -1 && ~(var14.field2536 + arg1) > -105 && ~(arg0 - -var14.field2536) > -105 && arg1 - -var14.field2500 < 104 && arg0 - -var14.field2500 < 104) {
                    arg2.method297(var14.field2536, var12, true, arg1, var14.field2500, var14.field2545, arg0);
                    return;
                }
                return;
            }
            class116.method807(arg5, arg1, arg0);
            if (var14.field2516 != 0) {
                arg2.method301(arg0, var15, var14.field2545, var12, arg1, 1024);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(IB)[[I")
    public int[][] method32(int arg0, byte arg1) {
        ++field2987;
        int[][] var3 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954 && this.method1120(-26981)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field2984 * (~class13.field235 == ~this.field2988 ? arg0 : this.field2988 * arg0 / class13.field235);
            if (~class246.field4385 == ~this.field2984) {
                for (int var8 = 0; class246.field4385 > var8; ++var8) {
                    int var9 = this.field2995[var7++];
                    var6[var8] = class220.method1526(var9 << 4, 4080);
                    var5[var8] = class220.method1526(65280, var9) >> 4;
                    var4[var8] = class220.method1526(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; class246.field4385 > var10; ++var10) {
                    int var11 = this.field2984 * var10 / class246.field4385;
                    int var12 = this.field2995[var7 + var11];
                    var6[var10] = class220.method1526(var12, 255) << 4;
                    var5[var10] = class220.method1526(4080, var12 >> 4);
                    var4[var10] = class220.method1526(16711680, var12) >> 12;
                }
            }
        }
        int var13 = -2 / ((-60 - arg1) / 45);
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
    public static final void method1125(int arg0, boolean arg1) {
        ++field3005;
        if (!arg1 != !class60.field1080) {
            class60.field1080 = arg1;
            if (arg0 == 0) {
                class46.method287(false);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, false);
    }
}
