import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class241 extends class739 {

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "[S")
    private short[] field3114 = new short[257];

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
    private int field3115 = 0;

    @OriginalMember(owner = "client!kea", name = "L", descriptor = "[I")
    public static int[] field3121 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!kea", name = "I", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!kea", name = "J", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!kea", name = "K", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!kea", name = "N", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!kea", name = "O", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!kea", name = "P", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!kea", name = "Q", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!kea", name = "M", descriptor = "[I")
    private int[] field3122;

    @OriginalMember(owner = "client!kea", name = "R", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!kea", name = "H", descriptor = "[[I")
    private int[][] field3117;

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
    public final void method216(int arg0) {
        ++field3124;
        if (this.field3117 == null) {
            this.field3117 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3117.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field3115 == -3) {
                this.method1505(0);
            }
            class144.method1039((byte) -24);
            this.method1507(257);
            if (arg0 != -21773) {
                this.field3114 = null;
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "e", descriptor = "(I)V")
    public static void method1504(int arg0) {
        if (arg0 > -121) {
            method1509(-86, 113);
        }
        field3121 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field3123;
        int[] var3 = super.field10311.method2116(arg1, (byte) 90);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-124, arg1, 0);
            for (int var5 = 0; ~var5 > ~class29.field523; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field3114[var6];
            }
        }
        if (arg0 != -23347) {
            this.method1507(-2);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kea", name = "f", descriptor = "(I)V")
    private final void method1505(int arg0) {
        ++field3119;
        int[] var2 = this.field3117[0];
        int[] var3 = this.field3117[1];
        int[] var4 = this.field3117[this.field3117.length + -2];
        int[] var5 = this.field3117[this.field3117.length + -1];
        this.field3127 = new int[] { var2[0] + var2[0] + -var3[0], var2[1] - var3[1] - -var2[1] };
        this.field3122 = new int[] { var4[0] + var4[0] + -var5[arg0], var4[1] - (var5[1] - var4[1]) };
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)V")
    public static final void method1506(int arg0, int arg1, int arg2, int arg3) {
        class14 var4 = class197.field2689[arg0][arg1][arg2];
        if (var4 != null) {
            class573 var5 = var4.field277;
            class573 var6 = var4.field290;
            if (var5 != null) {
                var5.field8056 = (short) (var5.field8056 * arg3 / (16 << class480.field6531 - 7));
                var5.field8053 = (short) (var5.field8053 * arg3 / (16 << class480.field6531 - 7));
            }
            if (var6 != null) {
                var6.field8056 = (short) (var6.field8056 * arg3 / (16 << class480.field6531 - 7));
                var6.field8053 = (short) (var6.field8053 * arg3 / (16 << class480.field6531 - 7));
            }
        }
    }

    @OriginalMember(owner = "client!kea", name = "g", descriptor = "(I)V")
    private final void method1507(int arg0) {
        int var2 = this.field3115;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field3117.length + -1 > var5 && var4 >= this.field3117[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field3117[var5 + -1];
                    int[] var7 = this.field3117[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class195.field2670[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3114[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field3117.length + -1 && ~this.field3117[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field3117[var14 + -1];
                    int[] var16 = this.field3117[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3114[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field3117.length - 1 && var21 >= this.field3117[var22][0]; ++var22) {
                }
                int[] var23 = this.field3117[var22 + -1];
                int[] var24 = this.field3117[var22];
                int var25 = this.method1508(var22 + -2, arg0 ^ -258)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1508(var22 + 1, -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - (-var26 + var27) + -var25;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var36 + var37 + var35 - -var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field3114[var20] = (short) var38;
            }
        }
        if (arg0 != 257) {
            this.method216(-56);
        }
        ++field3116;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field3115 = arg0.method2600((byte) -125);
            this.field3117 = new int[arg0.method2600((byte) -125)][2];
            for (int var4 = 0; ~this.field3117.length < ~var4; ++var4) {
                this.field3117[var4][0] = arg0.method2566(arg2 + 1);
                this.field3117[var4][1] = arg0.method2566(class386.method2198(arg2, 3));
            }
        }
        ++field3125;
        if (arg2 != -3) {
            method1504(-112);
        }
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "()V")
    public class241() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kea", name = "b", descriptor = "(II)[I")
    private final int[] method1508(int arg0, int arg1) {
        ++field3120;
        if (arg1 < ~arg0) {
            return this.field3127;
        } else {
            return ~this.field3117.length >= ~arg0 ? this.field3122 : this.field3117[arg0];
        }
    }

    @OriginalMember(owner = "client!kea", name = "c", descriptor = "(II)V")
    public static final void method1509(int arg0, int arg1) {
        ++field3118;
        if (arg0 < -32) {
            class37 var2 = class636.method3571(1, arg1, -56);
            var2.method230(-87);
        }
    }
}
