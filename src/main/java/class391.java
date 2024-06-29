import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class391 extends class149 {

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    private int field5927 = 409;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    private int field5924 = 8;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    private int field5932 = 1024;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    private int field5931 = 81;

    @OriginalMember(owner = "client!dq", name = "Z", descriptor = "I")
    private int field5938 = 204;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    private int field5933 = 1024;

    @OriginalMember(owner = "client!dq", name = "ab", descriptor = "I")
    private int field5939 = 4;

    @OriginalMember(owner = "client!dq", name = "X", descriptor = "I")
    private int field5936 = 0;

    @OriginalMember(owner = "client!dq", name = "bb", descriptor = "Lcm;")
    public static class449 field5940 = new class449(37, 3);

    @OriginalMember(owner = "client!dq", name = "fb", descriptor = "Z")
    public static boolean field5944 = false;

    @OriginalMember(owner = "client!dq", name = "jb", descriptor = "I")
    public static int field5948 = 0;

    @OriginalMember(owner = "client!dq", name = "cb", descriptor = "J")
    public static volatile long field5941 = 0L;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field5922;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    private int field5923;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    private int field5925;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    private int field5929;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!dq", name = "db", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!dq", name = "gb", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!dq", name = "ib", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!dq", name = "eb", descriptor = "Lns;")
    public static class438 field5943;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "[I")
    private int[] field5934;

    @OriginalMember(owner = "client!dq", name = "hb", descriptor = "[I")
    public static int[] field5946;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "[[I")
    private int[][] field5921;

    @OriginalMember(owner = "client!dq", name = "Y", descriptor = "[[I")
    private int[][] field5937;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZII)I")
    public static final int method2405(int arg0, boolean arg1, int arg2, int arg3) {
        ++field5935;
        class410 var4 = class261.method1684(arg3, 25, arg1);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && ~arg2 > ~var4.field6169.length) {
            return arg0 != 26955 ? 24 : var4.field6169[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIII)I")
    public static final int method2406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field5928;
        if (class455.field6683 == null) {
            return 0;
        } else {
            if (arg2 > -33) {
                method2405(93, true, -1, 50);
            }
            if (~arg5 > -4) {
                int var6 = arg4 >> 7;
                int var7 = arg1 >> 7;
                if (~arg0 > -1 || ~arg3 > -1 || arg0 > class96.field1403 - 1 || arg3 > class485.field7122 + -1) {
                    return 0;
                }
                if (~var6 > -2 || ~var7 > -2 || var6 > class96.field1403 + -1 || class485.field7122 + -1 < var7) {
                    return 0;
                }
                boolean var8 = (class129.field1816[1][arg4 >> 7][arg1 >> 7] & 2) != 0;
                if ((arg4 & 127) == 0) {
                    boolean var9 = ~(2 & class129.field1816[1][var6 - 1][arg1 >> 7]) != -1;
                    boolean var10 = ~(2 & class129.field1816[1][var6][arg1 >> 7]) != -1;
                    if (var9 == !var10) {
                        var8 = ~(class129.field1816[1][arg0][arg3] & 2) != -1;
                    }
                }
                if ((arg1 & 127) == 0) {
                    boolean var11 = ~(class129.field1816[1][arg4 >> 7][var7 + -1] & 2) != -1;
                    boolean var12 = (2 & class129.field1816[1][arg4 >> 7][var7]) != 0;
                    if (!var11 != !var12) {
                        var8 = ~(class129.field1816[1][arg0][arg3] & 2) != -1;
                    }
                }
                if (var8) {
                    ++arg5;
                }
            }
            return class455.field6683[arg5].method853(arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)V")
    public static void method2407(int arg0) {
        if (arg0 != 4) {
            method2406(12, -71, 85, 77, -98, 81);
        }
        field5943 = null;
        field5946 = null;
        field5940 = null;
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V")
    public final void method99(int arg0) {
        ++field5922;
        if (arg0 < -86) {
            this.method2408(false);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
    private final void method2408(boolean arg0) {
        if (arg0) {
            method2406(74, -79, -8, 124, -97, -60);
        }
        ++field5945;
        Random var2 = new Random((long) this.field5924);
        this.field5923 = 4096 / this.field5939;
        this.field5925 = 4096 / this.field5924;
        this.field5929 = this.field5931 / 2;
        int var3 = this.field5923 / 2;
        int var4 = this.field5925 / 2;
        this.field5921 = new int[this.field5924][this.field5939 + 1];
        this.field5937 = new int[this.field5924][this.field5939];
        this.field5934 = new int[this.field5924 + 1];
        this.field5934[0] = 0;
        for (int var5 = 0; var5 < this.field5924; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field5925;
                int var7 = (-2048 + class455.method2740(-8, var2, 4096)) * this.field5938 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5934[var5] = this.field5934[var5 + -1] + var8;
            }
            this.field5921[var5][0] = 0;
            for (int var9 = 0; ~this.field5939 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field5923;
                    int var11 = (-2048 + class455.method2740(-8, var2, 4096)) * this.field5927 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5921[var5][var9] = this.field5921[var5][var9 + -1] - -var12;
                }
                this.field5937[var5][var9] = ~this.field5933 >= -1 ? 4096 : 4096 + -class455.method2740(-8, var2, this.field5933);
            }
            this.field5921[var5][this.field5939] = 4096;
        }
        this.field5934[this.field5924] = 4096;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class391() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBLtl;)V")
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field5930;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field5933 = arg2.method631(10494);
                                    }
                                } else {
                                    this.field5931 = arg2.method631(10494);
                                }
                            } else {
                                this.field5936 = arg2.method631(arg1 ^ 10461);
                            }
                        } else {
                            this.field5932 = arg2.method631(arg1 + 10459);
                        }
                    } else {
                        this.field5938 = arg2.method631(arg1 + 10459);
                    }
                } else {
                    this.field5927 = arg2.method631(10494);
                }
            } else {
                this.field5924 = arg2.method618((byte) 100);
            }
        } else {
            this.field5939 = arg2.method618((byte) 100);
        }
        if (arg1 != 35) {
            this.method92(4, 111);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)[I")
    public final int[] method92(int arg0, int arg1) {
        if (arg0 != -10835) {
            method2407(-41);
        }
        ++field5926;
        int[] var3 = super.field2152.method2891(arg1, (byte) 115);
        if (super.field2152.field7051) {
            int var4 = 0;
            int var5;
            for (var5 = class185.field2613[arg1] + this.field5936; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5924 > var4 && this.field5934[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field5934[var4];
            int var9 = this.field5934[var4 + -1];
            if (var9 - -this.field5929 < var5 && var5 < -this.field5929 + var8) {
                for (int var10 = 0; ~class316.field4838 < ~var10; ++var10) {
                    int var11 = !var7 ? -this.field5932 : this.field5932;
                    int var12 = 0;
                    int var13;
                    for (var13 = class197.field2791[var10] - -(this.field5923 * var11 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (this.field5939 > var12 && var13 >= this.field5921[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field5921[var6][var12];
                    int var16 = this.field5921[var6][var14];
                    if (var16 - -this.field5929 < var13 && var13 < -this.field5929 + var15) {
                        var3[var10] = this.field5937[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class361.method2283(var3, 0, class316.field4838, 0);
            }
        }
        return var3;
    }
}
