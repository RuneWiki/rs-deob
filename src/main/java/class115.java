import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class115 extends class82 {

    @OriginalMember(owner = "client!kf", name = "db", descriptor = "I")
    private int field2052 = 5;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    private int field2048 = 1;

    @OriginalMember(owner = "client!kf", name = "lb", descriptor = "I")
    private int field2060 = 5;

    @OriginalMember(owner = "client!kf", name = "ob", descriptor = "[S")
    private short[] field2063 = new short[512];

    @OriginalMember(owner = "client!kf", name = "mb", descriptor = "I")
    private int field2061 = 2;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "[B")
    private byte[] field2042 = new byte[512];

    @OriginalMember(owner = "client!kf", name = "sb", descriptor = "I")
    private int field2067 = 0;

    @OriginalMember(owner = "client!kf", name = "pb", descriptor = "I")
    private int field2064 = 2048;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Ldj;")
    private static class44 field2038 = class89.method650(255, "glow3:");

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "Ldj;")
    private static class44 field2039 = class89.method650(255, "Login limit exceeded)3");

    @OriginalMember(owner = "client!kf", name = "hb", descriptor = "[Ldj;")
    public static class44[] field2056 = new class44[100];

    @OriginalMember(owner = "client!kf", name = "kb", descriptor = "Ldj;")
    private static class44 field2059 = class89.method650(255, "Unexpected server response)3");

    @OriginalMember(owner = "client!kf", name = "ib", descriptor = "I")
    public static int field2057 = 0;

    @OriginalMember(owner = "client!kf", name = "cb", descriptor = "Ldj;")
    public static class44 field2051 = field2059;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "Ldj;")
    public static class44 field2049 = field2039;

    @OriginalMember(owner = "client!kf", name = "nb", descriptor = "Ldj;")
    private static class44 field2062 = class89.method650(255, "Close");

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Ldj;")
    public static class44 field2040 = field2062;

    @OriginalMember(owner = "client!kf", name = "jb", descriptor = "Ldj;")
    public static class44 field2058 = field2038;

    @OriginalMember(owner = "client!kf", name = "rb", descriptor = "Ldj;")
    public static class44 field2066 = field2038;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!kf", name = "bb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!kf", name = "eb", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!kf", name = "fb", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!kf", name = "gb", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!kf", name = "qb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IB)[B")
    public static final byte[] method805(int arg0, byte arg1) {
        if (arg1 != -113) {
            method806(30);
        }
        ++field2044;
        class111 var2 = (class111) class171.field2974.method1178((long) arg0, 14176);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class151.method979(arg1 ^ 112, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class111(var3);
            class171.field2974.method1183((byte) 115, var2, (long) arg0);
        }
        return var2.field2008;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "(I)V")
    public static final void method806(int arg0) {
        class79.field1530.method1179((byte) -113);
        class179.field3079.method676(0);
        if (arg0 == 16020) {
            ++field2050;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field2047;
        this.field2042 = method805(this.field2067, (byte) -113);
        if (arg0 < 95) {
            this.method2((class66) null, -51, (byte) -74);
        }
        this.method811((byte) -77);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILve;)V")
    public static final void method807(int arg0, class225 arg1) {
        ++field2045;
        class198.field3506 = arg1;
        class170.field2939 = class198.field3506.method1473(20756, arg0);
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2055;
        int[] var3 = super.field1595.method603(true, arg1);
        if (arg0 != 25238) {
            method809(-48, 33, -42, (class225) null);
        }
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1] * this.field2060 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class129.field2287 > var7; ++var7) {
                class33.field580 = Integer.MAX_VALUE;
                class28.field500 = Integer.MAX_VALUE;
                class216.field3930 = Integer.MAX_VALUE;
                class117.field2086 = Integer.MAX_VALUE;
                int var8 = class49.field912[var7] * this.field2052 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = 255 & this.field2042[(~var11 > ~this.field2060 ? var11 : -this.field2060 + var11) & 255];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = 2 * (this.field2042[255 & var13 - -(var14 >= this.field2052 ? -this.field2052 + var14 : var14)] & 255);
                        int var27 = var15 + 1;
                        int var16 = -this.field2063[var15] + -(var14 << 12) + var8;
                        int var17 = -this.field2063[var27] - (var11 << 12) + var4;
                        int var18 = this.field2048;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (~var17 > -1 ? -var17 : var17) + (~var16 > -1 ? -var16 : var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var17 > -1 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = var25 >= var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (~var19 > ~class117.field2086) {
                            class33.field580 = class28.field500;
                            class28.field500 = class216.field3930;
                            class216.field3930 = class117.field2086;
                            class117.field2086 = var19;
                        } else if (var19 < class216.field3930) {
                            class33.field580 = class28.field500;
                            class28.field500 = class216.field3930;
                            class216.field3930 = var19;
                        } else if (var19 < class28.field500) {
                            class33.field580 = class28.field500;
                            class28.field500 = var19;
                        } else if (var19 < class33.field580) {
                            class33.field580 = var19;
                        }
                    }
                }
                int var12 = this.field2061;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class117.field2086 + class216.field3930;
                                }
                            } else {
                                var3[var7] = class33.field580;
                            }
                        } else {
                            var3[var7] = class28.field500;
                        }
                    } else {
                        var3[var7] = class216.field3930;
                    }
                } else {
                    var3[var7] = class117.field2086;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field2054;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field2060 = arg0.method506(255);
                                }
                            } else {
                                this.field2052 = arg0.method506(255);
                            }
                        } else {
                            this.field2048 = arg0.method506(255);
                        }
                    } else {
                        this.field2061 = arg0.method506(255);
                    }
                } else {
                    this.field2064 = arg0.method500(95);
                }
            } else {
                this.field2067 = arg0.method506(255);
            }
        } else {
            this.field2052 = this.field2060 = arg0.method506(255);
        }
        if (arg2 != 68) {
            this.field2064 = 94;
        }
    }

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "(I)V")
    public static void method808(int arg0) {
        field2049 = null;
        field2038 = null;
        field2039 = null;
        field2059 = null;
        field2040 = null;
        field2051 = null;
        if (arg0 != 31371) {
            method805(-36, (byte) -30);
        }
        field2058 = null;
        field2062 = null;
        field2066 = null;
        field2056 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIILve;)[Lod;")
    public static final class155[] method809(int arg0, int arg1, int arg2, class225 arg3) {
        ++field2043;
        if (!class171.method1086((byte) 105, arg0, arg1, arg3)) {
            return null;
        } else {
            if (arg2 != -31242) {
                method805(127, (byte) -78);
            }
            return class93.method665((byte) -122);
        }
    }

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "(I)V")
    public static final void method810(int arg0) {
        ++field2041;
        class230.field4311 = 0;
        int var1 = (class96.field1774.field2260 >> 7) + class222.field4020;
        int var2 = (class96.field1774.field2195 >> 7) + class143.field2550;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && ~var2 >= -3137) {
            class230.field4311 = 1;
        }
        if (arg0 <= 119) {
            field2062 = null;
        }
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class230.field4311 = 1;
        }
        if (class230.field4311 == 1 && var1 >= 3139 && var1 <= 3199 && ~var2 <= -3009 && ~var2 >= -3063) {
            class230.field4311 = 0;
        }
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    private final void method811(byte arg0) {
        Random var2 = new Random((long) this.field2067);
        this.field2063 = new short[512];
        ++field2053;
        if (this.field2064 > 0) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field2063[var3] = (short) class151.method979(-1, this.field2064, var2);
            }
        }
        int var4 = -83 % ((33 - arg0) / 57);
    }
}
