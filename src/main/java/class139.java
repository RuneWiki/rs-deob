import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class139 extends class64 {

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "I")
    private int field2866 = 0;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "I")
    private int field2868 = 0;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "I")
    private int field2864 = 0;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2863 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lcd;")
    public static class23 field2874 = class54.method414("Diese Welt ist voll)3", -1);

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lcd;")
    public static class23 field2875 = class54.method414("(U5", -1);

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Lcd;")
    public static class23 field2870 = class54.method414(": ", -1);

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lcd;")
    public static class23 field2873 = class54.method414("Ung-Ultige Session)2ID)3", -1);

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "I")
    private int field2856;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "I")
    private int field2857;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "I")
    private int field2859;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "I")
    private int field2860;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "I")
    private int field2861;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    private int field2867;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method36(int arg0, boolean arg1) {
        ++field2871;
        int[][] var3 = super.field1508.method846(7287, arg0);
        if (!arg1) {
            return null;
        } else {
            if (super.field1508.field2757) {
                int[][] var4 = this.method482(0, arg0, (byte) -127);
                int[] var5 = var4[2];
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var4[0];
                int[] var9 = var4[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class168.field3367 > var11; ++var11) {
                    this.method883(18, var9[var11], var8[var11], var5[var11]);
                    this.field2859 += this.field2868;
                    this.field2856 += this.field2866;
                    while (this.field2859 < 0) {
                        this.field2859 += 4096;
                    }
                    if (this.field2856 < 0) {
                        this.field2856 = 0;
                    }
                    if (this.field2856 > 4096) {
                        this.field2856 = 4096;
                    }
                    this.field2867 += this.field2864;
                    if (this.field2867 < 0) {
                        this.field2867 = 0;
                    }
                    while (~this.field2859 < -4097) {
                        this.field2859 -= 4096;
                    }
                    if (this.field2867 > 4096) {
                        this.field2867 = 4096;
                    }
                    this.method885(this.field2867, this.field2856, 8192, this.field2859);
                    var6[var11] = this.field2857;
                    var7[var11] = this.field2860;
                    var10[var11] = this.field2861;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)V")
    public static void method882(byte arg0) {
        field2873 = null;
        field2874 = null;
        field2870 = null;
        if (arg0 <= -30) {
            field2875 = null;
            field2863 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V")
    private final void method883(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >= arg2 ? arg1 : arg2;
        int var6 = arg1 > arg2 ? arg2 : arg1;
        if (arg0 > 3) {
            ++field2862;
            int var7 = ~var5 <= ~arg3 ? var5 : arg3;
            int var8 = ~var6 >= ~arg3 ? var6 : arg3;
            this.field2856 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (var9 > 0) {
                if (~this.field2856 < -1 && ~this.field2856 > -4097) {
                    this.field2867 = (var9 << 12) / (~this.field2856 < -2049 ? -(this.field2856 * 2) + 8192 : this.field2856 * 2);
                }
                int var10 = (-arg1 + var7 << 12) / var9;
                int var11 = (var7 - arg2 << 12) / var9;
                int var12 = (-arg3 + var7 << 12) / var9;
                if (~arg2 != ~var7) {
                    if (~arg1 == ~var7) {
                        this.field2859 = arg3 != var8 ? -var12 + 12288 : var11 + 4096;
                    } else {
                        this.field2859 = arg2 != var8 ? -var11 + 20480 : var10 + 12288;
                    }
                } else {
                    this.field2859 = arg1 != var8 ? -var10 + 4096 : var12 + 20480;
                }
                this.field2859 /= 6;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field2866 = (arg2.method1204(true) << 12) / 100;
                }
            } else {
                this.field2864 = (arg2.method1204(true) << 12) / 100;
            }
        } else {
            this.field2868 = arg2.method1196(false);
        }
        ++field2858;
        int var5 = -67 % ((arg0 - 7) / 43);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public static final void method884(byte arg0) {
        ++field2869;
        int var1 = class81.field1769.method626(16789, 8);
        if (~var1 > ~class57.field1348) {
            for (int var2 = var1; ~var2 > ~class57.field1348; ++var2) {
                class56.field1310[class104.field2264++] = class69.field1622[var2];
            }
        }
        if (~var1 < ~class57.field1348) {
            throw new RuntimeException("gppov1");
        } else {
            class57.field1348 = 0;
            int var3 = 0;
            if (arg0 != -113) {
                field2863 = null;
            }
            while (var1 > var3) {
                int var4 = class69.field1622[var3];
                class57 var5 = class95.field2007[var4];
                int var6 = class81.field1769.method626(arg0 ^ -16870, 1);
                if (~var6 == -1) {
                    class69.field1622[class57.field1348++] = var4;
                    var5.field266 = class15.field339;
                } else {
                    int var7 = class81.field1769.method626(16789, 2);
                    if (var7 == 0) {
                        class69.field1622[class57.field1348++] = var4;
                        var5.field266 = class15.field339;
                        class160.field3202[class108.field2307++] = var4;
                    } else if (~var7 == -2) {
                        class69.field1622[class57.field1348++] = var4;
                        var5.field266 = class15.field339;
                        int var8 = class81.field1769.method626(16789, 3);
                        var5.method63(false, (byte) 126, var8);
                        int var9 = class81.field1769.method626(16789, 1);
                        if (var9 == 1) {
                            class160.field3202[class108.field2307++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class69.field1622[class57.field1348++] = var4;
                        var5.field266 = class15.field339;
                        int var10 = class81.field1769.method626(16789, 3);
                        var5.method63(true, (byte) 125, var10);
                        int var11 = class81.field1769.method626(16789, 3);
                        var5.method63(true, (byte) 127, var11);
                        int var12 = class81.field1769.method626(16789, 1);
                        if (~var12 == -2) {
                            class160.field3202[class108.field2307++] = var4;
                        }
                    } else if (var7 == 3) {
                        class56.field1310[class104.field2264++] = var4;
                    }
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
    private final void method885(int arg0, int arg1, int arg2, int arg3) {
        ++field2865;
        int var5 = arg1 <= 2048 ? (arg0 + 4096) * arg1 >> 12 : -(arg0 * arg1 >> 12) + arg1 + arg0;
        if (~var5 >= -1) {
            this.field2857 = this.field2860 = this.field2861 = arg1;
        } else {
            int var6 = arg1 + arg1 + -var5;
            int var7 = arg3 * 6;
            int var8 = (-var6 + var5 << 12) / var5;
            int var10 = var7 >> 12;
            int var11 = var8 * var5 >> 12;
            int var12 = -(var10 << 12) + var7;
            int var13 = var11 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var6 - -var13;
            if (var10 != 0) {
                if (~var10 != -2) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (var10 == 5) {
                                    this.field2857 = var5;
                                    this.field2861 = var14;
                                    this.field2860 = var6;
                                }
                            } else {
                                this.field2857 = var15;
                                this.field2860 = var6;
                                this.field2861 = var5;
                            }
                        } else {
                            this.field2857 = var6;
                            this.field2861 = var5;
                            this.field2860 = var14;
                        }
                    } else {
                        this.field2857 = var6;
                        this.field2860 = var5;
                        this.field2861 = var15;
                    }
                } else {
                    this.field2861 = var6;
                    this.field2857 = var14;
                    this.field2860 = var5;
                }
            } else {
                this.field2860 = var15;
                this.field2857 = var5;
                this.field2861 = var6;
            }
        }
        if (arg2 != 8192) {
            this.field2868 = -93;
        }
    }
}
