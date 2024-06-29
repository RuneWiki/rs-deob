import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class70 extends class748 {

    @OriginalMember(owner = "client!no", name = "P", descriptor = "Lqk;")
    public static class148 field989 = new class148(98, 6);

    @OriginalMember(owner = "client!no", name = "S", descriptor = "D")
    public static double field992;

    @OriginalMember(owner = "client!no", name = "H", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!no", name = "R", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "Z")
    public static boolean field987;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "[Lac;")
    private class216[] field983;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(B)V")
    public static final void method443(byte arg0) {
        if (!class66.method432((byte) 117, class213.field3004) && !class275.method1670(-97, class213.field3004)) {
            int var1 = class473.field6483.field8421[0] >> 3;
            int var2 = class473.field6483.field8414[0] >> 3;
            if (~var1 <= -1 && var1 < class514.field7179 >> 3 && var2 >= 0 && class456.field6281 >> 3 > var2) {
                class591.method3514(var1, 5000, true, var2);
            } else {
                class591.method3514(class514.field7179 >> 4, 0, true, class456.field6281 >> 4);
            }
        } else {
            class591.method3514(class24.field266 >> 12, 5000, true, class235.field3250 >> 12);
        }
        ++field988;
        class541.method3222((byte) -125);
        class477.method2823((byte) 95);
        class491.method2866(true);
        if (arg0 < 9) {
            method448(-5, -77);
        }
        class498.method2986(-1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZI)Ldaa;")
    public static final class344 method444(int arg0, boolean arg1, int arg2) {
        ++field982;
        long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        if (arg2 != Integer.MIN_VALUE) {
            field989 = null;
        }
        return (class344) class592.field8538.method1381(true, var3);
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        ++field984;
        int[][] var3 = super.field10420.method930(arg1 ^ 29784, arg0);
        if (arg1 != 0) {
            field989 = null;
        }
        if (super.field10420.field1979) {
            int var4 = class424.field5889;
            int var5 = class245.field3400;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field10420.method933(110);
            this.method446((byte) 127, var6);
            for (int var8 = 0; var8 < class245.field3400; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class424.field5889 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class136.method878(var15 << 4, 4080);
                    var12[var14] = class136.method878(var15, 65280) >> 4;
                    var11[var14] = class136.method878(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field986;
        if (arg1 != 255) {
            method443((byte) 53);
        }
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            this.method446((byte) 65, super.field10407.method3874(56));
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(B[[I)V")
    private final void method446(byte arg0, int[][] arg1) {
        ++field990;
        int var3 = class424.field5889;
        int var4 = class245.field3400;
        if (arg0 <= 35) {
            field992 = 0.7724282924325382D;
        }
        class102.method687((byte) -55, arg1);
        class181.method1211(2, 0, class150.field2077, class354.field4552, 0);
        if (this.field983 != null) {
            for (int var5 = 0; var5 < this.field983.length; ++var5) {
                class216 var6 = this.field983[var5];
                int var7 = var6.field3063;
                int var8 = var6.field3062;
                if (~var7 > -1) {
                    if (~var8 <= -1) {
                        var6.method330(var3, var4, 382254306);
                    }
                } else if (~var8 > -1) {
                    var6.method327(var4, (byte) 23, var3);
                } else {
                    var6.method328(false, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (~arg0 == -1) {
            this.field983 = new class216[arg2.method194((byte) 119)];
            for (int var4 = 0; this.field983.length > var4; ++var4) {
                int var5 = arg2.method194((byte) 119);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field983[var4] = class90.method548(arg2, (byte) -45);
                            }
                        } else {
                            this.field983[var4] = class164.method1018(-8375, arg2);
                        }
                    } else {
                        this.field983[var4] = class753.method4174(-111, arg2);
                    }
                } else {
                    this.field983[var4] = class248.method1574((byte) 104, arg2);
                }
            }
        } else if (~arg0 == -2) {
            super.field10414 = arg2.method194((byte) 119) == 1;
        }
        if (arg1) {
            method443((byte) 25);
        }
        ++field985;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V")
    public static void method447(byte arg0) {
        field989 = null;
        if (arg0 > -103) {
            method444(91, false, 123);
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(II)Z")
    public static final boolean method448(int arg0, int arg1) {
        if (arg0 != 0) {
            field989 = null;
        }
        ++field991;
        return ~arg1 <= -1 && arg1 <= 3 || arg1 == 9;
    }
}
