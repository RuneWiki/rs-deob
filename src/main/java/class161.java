import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class161 extends class205 {

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "[S")
    private short[] field3058 = new short[257];

    @OriginalMember(owner = "client!pc", name = "ob", descriptor = "I")
    private int field3077 = 0;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lvd;")
    public static class222 field3061 = class212.method1357("::tele 0)1", 10731);

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "Lvd;")
    private static class222 field3059 = class212.method1357("Press (Wchange your password(W on front page)3", 10731);

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lvd;")
    private static class222 field3060 = class212.method1357("Account locked as we suspect it has been stolen)3", 10731);

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "Lvd;")
    public static class222 field3067 = class212.method1357("Ausw-=hlen", 10731);

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "[[[B")
    public static byte[][][] field3074 = new byte[4][104][104];

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "Lvd;")
    public static class222 field3075 = field3059;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "J")
    public static long field3076 = 0L;

    @OriginalMember(owner = "client!pc", name = "rb", descriptor = "Lvd;")
    public static class222 field3080 = field3060;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!pc", name = "pb", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!pc", name = "qb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!pc", name = "sb", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!pc", name = "tb", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "Lve;")
    public static class223 field3073;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "[I")
    private int[] field3070;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "[I")
    private int[] field3071;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "[[I")
    private int[][] field3068;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)I")
    public static final int method1010(int arg0, byte arg1) {
        if (arg1 >= -109) {
            field3073 = null;
        }
        ++field3062;
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        if (arg2 == 0) {
            this.field3077 = arg0.method662((byte) -124);
            this.field3068 = new int[arg0.method662((byte) -106)][2];
            for (int var4 = 0; ~this.field3068.length < ~var4; ++var4) {
                this.field3068[var4][0] = arg0.method675(2);
                this.field3068[var4][1] = arg0.method675(2);
            }
        }
        ++field3079;
        int var5 = -19 / ((-47 - arg1) / 34);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
    public static final void method1011(byte arg0, long arg1) {
        ++field3064;
        if (~arg1 != -1L) {
            if (arg0 != 96) {
                field3073 = null;
            }
            for (int var3 = 0; ~var3 > ~class113.field2131; ++var3) {
                if (~class64.field1173[var3] == ~arg1) {
                    ++class92.field1725;
                    --class113.field2131;
                    for (int var4 = var3; class113.field2131 > var4; ++var4) {
                        class64.field1173[var4] = class64.field1173[var4 + 1];
                        class82.field1581[var4] = class82.field1581[var4 + 1];
                    }
                    class68.field1283 = class28.field616;
                    class42.field895.method1347((byte) -52, 194);
                    class42.field895.method668(arg1, 8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field3063;
            int[] var3 = super.field3810.method557(6978, arg1);
            if (super.field3810.field1635) {
                int[] var4 = this.method1322(arg1, (byte) 81, 0);
                for (int var5 = 0; class118.field2245 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3058[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (this.field3068 == null) {
            this.field3068 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (!arg0) {
            ++field3069;
            if (~this.field3068.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (~this.field3077 == -3) {
                    this.method1016(1);
                }
                class121.method771((byte) 87);
                this.method1014(0);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static void method1012(byte arg0) {
        field3080 = null;
        field3060 = null;
        field3061 = null;
        field3073 = null;
        field3074 = null;
        if (arg0 > 79) {
            field3067 = null;
            field3059 = null;
            field3075 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)[I")
    private final int[] method1013(int arg0, int arg1) {
        ++field3081;
        int var3 = 8 / ((arg0 - -72) / 37);
        if (~arg1 > -1) {
            return this.field3071;
        } else {
            return arg1 >= this.field3068.length ? this.field3070 : this.field3068[arg1];
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
    private final void method1014(int arg0) {
        if (arg0 != 0) {
            this.method1014(65);
        }
        ++field3065;
        int var2 = this.field3077;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3068.length + -1) && this.field3068[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3068[var5];
                    int[] var7 = this.field3068[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] + -var7[0]);
                    int var9 = -class8.field135[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3058[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field3068.length + -1 > var14 && var13 >= this.field3068[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3068[var14];
                    int[] var16 = this.field3068[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3058[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field3068.length + -1 > var22 && var21 >= this.field3068[var22][0]; ++var22) {
                }
                int[] var23 = this.field3068[var22 + -1];
                int[] var24 = this.field3068[var22];
                int var25 = this.method1013(arg0 ^ 22, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1013(-115, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = -var25 + -var27 + var26 + var28;
                int var31 = var29 * var29 >> 12;
                int var32 = -var25 + var27;
                int var33 = var25 - var30 + -var26;
                int var34 = (var29 * var30 >> 12) * var31 >> 12;
                int var35 = var31 * var33 >> 12;
                int var37 = var29 * var32 >> 12;
                int var38 = var34 + var35 + var26 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3058[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class161() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([BI)V")
    public static final void method1015(byte[] arg0, int arg1) {
        if (arg1 > -6) {
            field3076 = -84L;
        }
        class109 var2 = new class109(arg0);
        ++field3082;
        int var3 = var2.method675(2);
        for (int var4 = 0; var4 < var3; ++var4) {
            class40 var5 = new class40();
            class222 var6 = var2.method674(-83);
            var5.field883 = var2.method675(2);
            var5.field885 = var2.method675(2);
            var5.field880 = var2.method662((byte) -127);
            var5.field878 = var6.method1429(1, 47, 32);
            var5.field879 = var6.method1440(47, true);
            class128.field2479.method235(var5, true);
        }
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    private final void method1016(int arg0) {
        ++field3078;
        int[] var2 = this.field3068[0];
        int[] var3 = this.field3068[1];
        int[] var4 = this.field3068[this.field3068.length + -2];
        int[] var5 = this.field3068[this.field3068.length - 1];
        this.field3071 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] - var3[1] + var2[1] };
        this.field3070 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + var4[1] - var5[arg0] };
    }
}
