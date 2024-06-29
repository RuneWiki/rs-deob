import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class262 extends class185 {

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "Z")
    public static boolean field3967 = false;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field3971 = -1;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "[I")
    public static int[] field3972 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "Lpf;")
    public static class294 field3968;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Lpf;")
    public static class294 field3969;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "(I)V")
    public static void method1750(int arg0) {
        field3968 = null;
        if (arg0 == 32758) {
            field3969 = null;
            field3972 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
    public final int[] method34(int arg0, int arg1) {
        ++field3973;
        int[] var3 = super.field2804.method561(arg0, -2);
        if (super.field2804.field1384) {
            int[][] var4 = this.method1152(false, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class174.field2648; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] + var5[var8]) / 3;
            }
        }
        return arg1 < 70 ? null : var3;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class262() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(ZI)I")
    public static final int method1751(boolean arg0, int arg1) {
        if (arg0) {
            return 90;
        } else {
            ++field3974;
            return 255 & arg1;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(II)V")
    public static final void method1752(int arg0, int arg1) {
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        ++field3966;
        if (~arg0 < -11) {
            arg0 = 10;
        }
        class116.field1768 += arg0 * 128;
        if (~class116.field1768 < ~class267.field4020.length) {
            int var3 = (int) (12.0D * Math.random());
            class116.field1768 -= class267.field4020.length;
            class152.method921(arg1 + -1702459615, class71.field1132[var3]);
        }
        int var4 = arg0 * 128;
        int var5 = 0;
        int var6 = (-arg0 + var2) * 128;
        for (int var7 = 0; var7 < var6; ++var7) {
            int var26 = class92.field1451[var4 + var5] + -(class267.field4020[class267.field4020.length - 1 & class116.field1768 + var5] * arg0 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class92.field1451[var5++] = var26;
        }
        for (int var8 = -arg0 + var2; var2 > var8; ++var8) {
            int var23 = var8 * 128;
            for (int var24 = 0; ~var24 > -129; ++var24) {
                int var25 = (int) (100.0D * Math.random());
                if (~var25 > -51 && ~var24 < -11 && var24 < 118) {
                    class92.field1451[var24 - -var23] = 255;
                } else {
                    class92.field1451[var23 + var24] = 0;
                }
            }
        }
        for (int var9 = 0; var2 - arg0 > var9; ++var9) {
            class153.field2301[var9] = class153.field2301[arg0 + var9];
        }
        for (int var10 = var2 - arg0; var2 > var10; ++var10) {
            class153.field2301[var10] = (int) (Math.sin((double) class139.field2032 / 14.0D) * 16.0D + Math.sin((double) class139.field2032 / 15.0D) * 14.0D + Math.sin((double) class139.field2032 / 16.0D) * 12.0D);
            ++class139.field2032;
        }
        if (arg1 != 1702428295) {
            method1750(-29);
        }
        int var11 = (arg0 - -(1 & class270.field4058)) / 2;
        class292.field4605 += arg0;
        if (var11 > 0) {
            for (int var12 = 0; var12 < class292.field4605; ++var12) {
                int var21 = 128 + (int) (Math.random() * 128.0D);
                int var22 = 2 + (int) (124.0D * Math.random());
                class92.field1451[(var21 << 7) + var22] = 192;
            }
            class292.field4605 = 0;
            for (int var13 = 0; ~var13 > ~var2; ++var13) {
                int var18 = 0;
                int var19 = var13 * 128;
                for (int var20 = -var11; var20 < 128; ++var20) {
                    if (~(var11 + var20) > -129) {
                        var18 += class92.field1451[var11 + var19 + var20];
                    }
                    if (~(var20 - (var11 + 1)) <= -1) {
                        var18 -= class92.field1451[var19 + var20 - (var11 + 1)];
                    }
                    if (~var20 <= -1) {
                        class1.field4[var19 + var20] = var18 / (var11 * 2 - -1);
                    }
                }
            }
            for (int var14 = 0; ~var14 > -129; ++var14) {
                int var15 = 0;
                for (int var16 = -var11; ~var2 < ~var16; ++var16) {
                    int var17 = var16 * 128;
                    if (var2 > var11 + var16) {
                        var15 += class1.field4[var11 * 128 + var17 + var14];
                    }
                    if (~(var16 - 1 - var11) <= -1) {
                        var15 -= class1.field4[var14 + -128 + -(var11 * 128) + var17];
                    }
                    if (var16 >= 0) {
                        class92.field1451[var14 + var17] = var15 / (var11 * 2 + 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZIB)V")
    public static final void method1753(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field3970;
        if (~arg0 <= -8001 && arg0 <= 48000) {
            if (arg3 == -67) {
                class248.field3764 = arg0;
                class275.field4153 = arg1;
                class236.field3554 = arg2;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }
}
