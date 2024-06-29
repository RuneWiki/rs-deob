import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class299 extends class182 {

    @OriginalMember(owner = "client!o", name = "X", descriptor = "I")
    private int field4880 = 4096;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    private int field4871 = 16;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    private int field4875 = 2000;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    private int field4874 = 0;

    @OriginalMember(owner = "client!o", name = "ab", descriptor = "I")
    private int field4883 = 0;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    public static int field4879 = 0;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "Lpf;")
    public static class17 field4876 = new class17(64);

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!o", name = "Y", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!o", name = "Z", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!o", name = "bb", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLei;)Z")
    public static final boolean method2046(boolean arg0, class195 arg1) {
        ++field4872;
        if (arg1 == null) {
            return false;
        } else if (!arg0) {
            return true;
        } else if (!arg1.field3147) {
            return false;
        } else if (!arg1.method1395(29435)) {
            return false;
        } else if (class58.field1008.method987(-99, (long) arg1.field3136) != null) {
            return false;
        } else {
            return class58.field1013.method987(-91, (long) arg1.field3139) == null;
        }
    }

    @OriginalMember(owner = "client!o", name = "j", descriptor = "(I)V")
    public static void method2047(int arg0) {
        if (arg0 >= -95) {
            field4879 = -73;
        }
        field4876 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIII)V")
    public static final void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -58 % ((arg0 - -72) / 44);
        for (int var7 = arg5; var7 <= arg4 + arg5; ++var7) {
            for (int var12 = arg1; arg1 + arg3 >= var12; ++var12) {
                if (~var12 <= -1 && ~var12 > -105 && ~var7 <= -1 && ~var7 > -105) {
                    class4.field115[arg2][var12][var7] = 127;
                }
            }
        }
        ++field4877;
        for (int var8 = arg5; arg4 + arg5 > var8; ++var8) {
            for (int var11 = arg1; ~(arg1 + arg3) < ~var11; ++var11) {
                if (var11 >= 0 && ~var11 > -105 && ~var8 <= -1 && var8 < 104) {
                    class245.field4123[arg2][var11][var8] = ~arg2 < -1 ? class245.field4123[arg2 + -1][var11][var8] : 0;
                }
            }
        }
        if (~arg1 < -1 && arg1 < 104) {
            for (int var9 = arg5 + 1; ~(arg4 + arg5) < ~var9; ++var9) {
                if (~var9 <= -1 && var9 < 104) {
                    class245.field4123[arg2][arg1][var9] = class245.field4123[arg2][arg1 + -1][var9];
                }
            }
        }
        if (arg5 > 0 && ~arg5 > -105) {
            for (int var10 = arg1 + 1; var10 < arg1 + arg3; ++var10) {
                if (~var10 <= -1 && var10 < 104) {
                    class245.field4123[arg2][var10][arg5] = class245.field4123[arg2][var10][arg5 - 1];
                }
            }
        }
        if (~arg1 <= -1 && arg5 >= 0 && ~arg1 > -105 && ~arg5 > -105) {
            if (~arg2 != -1) {
                if (~arg1 < -1 && ~class245.field4123[arg2][arg1 - 1][arg5] != ~class245.field4123[arg2 - 1][arg1 + -1][arg5]) {
                    class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1 - 1][arg5];
                    return;
                }
                if (arg5 > 0 && ~class245.field4123[arg2 + -1][arg1][arg5 - 1] != ~class245.field4123[arg2][arg1][arg5 + -1]) {
                    class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1][arg5 - 1];
                    return;
                }
                if (arg1 > 0 && ~arg5 < -1 && class245.field4123[arg2][arg1 - 1][arg5 - 1] != class245.field4123[arg2 + -1][arg1 - 1][arg5 + -1]) {
                    class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1 - 1][arg5 + -1];
                    return;
                }
                return;
            }
            if (arg1 > 0 && class245.field4123[arg2][arg1 + -1][arg5] != 0) {
                class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1 - 1][arg5];
                return;
            }
            if (~arg5 < -1 && ~class245.field4123[arg2][arg1][arg5 + -1] != -1) {
                class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1][arg5 + -1];
                return;
            }
            if (arg1 > 0 && ~arg5 < -1 && ~class245.field4123[arg2][arg1 - 1][arg5 + -1] != -1) {
                class245.field4123[arg2][arg1][arg5] = class245.field4123[arg2][arg1 + -1][arg5 + -1];
                return;
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field4881;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            this.field4880 = arg1.method1821((byte) 51);
                        }
                    } else {
                        this.field4883 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field4871 = arg1.method1802((byte) 42);
                }
            } else {
                this.field4875 = arg1.method1821((byte) 51);
            }
        } else {
            this.field4874 = arg1.method1802((byte) -104);
        }
        if (arg0) {
            this.field4880 = -125;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZ)V")
    public static final void method2049(int arg0, boolean arg1) {
        class209.field3537 = new int[5];
        class200.field3221 = new int[104];
        class176.field2841 = new int[104];
        ++field4878;
        class113.field1933 = 99;
        class157.field2579 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class151.field2519 = new byte[var2][arg0][104];
        class238.field4009 = new int[104];
        class161.field2617 = new int[104];
        class271.field4516 = new int[var2][105][105];
        class240.field4056 = new byte[var2][104][104];
        class4.field115 = new byte[var2][105][105];
        class119.field2002 = new byte[var2][104][104];
        class46.field811 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method2046(false, (class195) null);
        }
        int[] var3 = super.field2911.method77(arg1, -84);
        if (super.field2911.field287) {
            int var4 = this.field4880 >> 1;
            int[][] var5 = super.field2911.method73(0);
            Random var6 = new Random((long) this.field4874);
            for (int var7 = 0; ~var7 > ~this.field4875; ++var7) {
                int var8 = ~this.field4880 >= -1 ? this.field4883 : -var4 + this.field4883 + class32.method205(this.field4880, (byte) 90, var6);
                int var9 = class32.method205(class4.field116, (byte) 90, var6);
                int var10 = (4081 & var8) >> 4;
                int var11 = class32.method205(class16.field318, (byte) 90, var6);
                int var12 = (class289.field4765[var10] * this.field4871 >> 12) + var9;
                int var13 = (class22.field391[var10] * this.field4871 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var9 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var12;
                        var12 = var13;
                        var13 = var17;
                        int var18 = var9;
                        var9 = var11;
                        var11 = var18;
                    }
                    if (~var12 > ~var9) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var9 + var12;
                    int var23 = -var11 + var13;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var24 = -var22 / 2;
                    int var25 = -(class32.method205(4096, (byte) 90, var6) >> 2) + 1024;
                    int var26 = 2048 / var22;
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var9; var12 > var28; ++var28) {
                        var24 += var23;
                        int var29 = (-var9 + var28) * var26 + var25 - -1024;
                        int var30 = class107.field1749 & var21;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                        int var31 = var28 & class103.field1644;
                        if (var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                    }
                }
            }
        }
        ++field4882;
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        class186.method1346((byte) 28);
        ++field4873;
        if (arg0 != -1) {
            method2047(51);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(III)J")
    public static final long method2050(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        return var3 != null && var3.field2817 != null ? var3.field2817.field4256 : 0L;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method2051(int arg0, int arg1) {
        class248.field4139.method98(arg1 ^ 11277, arg0);
        ++field4884;
        if (arg1 == 11276) {
            class279.field4629.method98(1, arg0);
        }
    }
}
