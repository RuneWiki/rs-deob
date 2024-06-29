import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class145 extends class200 {

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "[S")
    private short[] field2614 = new short[257];

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    private int field2615 = 0;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "J")
    public static long field2617 = 0L;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "[Lhf;")
    public static class137[] field2623 = new class137[14];

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "[I")
    public static int[] field2621 = new int[4096];

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!kj", name = "Z", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "[I")
    private int[] field2612;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "[I")
    private int[] field2613;

    @OriginalMember(owner = "client!kj", name = "ab", descriptor = "[[I")
    private int[][] field2625;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        if (arg1 != 55) {
            method1002(true);
        }
        ++field2616;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            int[] var4 = this.method1368(0, arg0, false);
            for (int var5 = 0; var5 < class137.field2515; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field2614[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
    public final void method150(int arg0) {
        ++field2624;
        int var2 = -94 % ((-60 - arg0) / 62);
        if (this.field2625 == null) {
            this.field2625 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field2625.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field2615 == 2) {
                this.method999(-91);
            }
            class124.method871(-84);
            this.method1001(17142);
        }
    }

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)V")
    private final void method999(int arg0) {
        int[] var2 = this.field2625[0];
        ++field2620;
        int[] var3 = this.field2625[1];
        if (arg0 <= -42) {
            int[] var4 = this.field2625[this.field2625.length + -1];
            int[] var5 = this.field2625[this.field2625.length + -2];
            this.field2612 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - var3[1] + var2[1] };
            this.field2613 = new int[] { var5[0] + var5[0] - var4[0], var5[1] + var5[1] + -var4[1] };
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2615 = arg0.method489((byte) -104);
            this.field2625 = new int[arg0.method489((byte) -78)][2];
            for (int var4 = 0; ~var4 > ~this.field2625.length; ++var4) {
                this.field2625[var4][0] = arg0.method485(-2386);
                this.field2625[var4][1] = arg0.method485(-2386);
            }
        }
        ++field2622;
        if (!arg1) {
            this.field2614 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)[I")
    private final int[] method1000(int arg0, int arg1) {
        ++field2619;
        if (arg0 >= -8) {
            this.field2615 = -21;
        }
        if (arg1 < 0) {
            return this.field2612;
        } else {
            return arg1 >= this.field2625.length ? this.field2613 : this.field2625[arg1];
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class145() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V")
    private final void method1001(int arg0) {
        if (arg0 == 17142) {
            int var2 = this.field2615;
            if (var2 != 2) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field2625.length + -1 && ~var4 <= ~this.field2625[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field2625[var5];
                        int[] var7 = this.field2625[var5 + -1];
                        int var8 = (var4 - var7[0] << 12) / (var6[0] + -var7[0]);
                        int var9 = -class106.field1832[var8 >> 5 & 255] + 4096 >> 1;
                        int var10 = -var9 + 4096;
                        int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                        if (~var11 >= 32767) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field2614[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; var12 < 257; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; this.field2625.length + -1 > var14 && var13 >= this.field2625[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field2625[var14 + -1];
                        int[] var16 = this.field2625[var14];
                        int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                        int var18 = 4096 - var17;
                        int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (~var19 <= -32769) {
                            var19 = 32767;
                        }
                        this.field2614[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field2625.length + -1) && this.field2625[var22][0] <= var21; ++var22) {
                    }
                    int[] var23 = this.field2625[var22 + -1];
                    int[] var24 = this.field2625[var22];
                    int var25 = this.method1000(-122, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method1000(-105, var22 + 1)[1];
                    int var29 = (var21 - var23[0] << 12) / (var24[0] + -var23[0]);
                    int var30 = var29 * var29 >> 12;
                    int var31 = var28 - (var25 + var27) + var26;
                    int var32 = var25 - var26 + -var31;
                    int var33 = -var25 + var27;
                    int var35 = (var29 * var31 >> 12) * var30 >> 12;
                    int var36 = var30 * var32 >> 12;
                    int var37 = var29 * var33 >> 12;
                    int var38 = var26 + var35 + var36 + var37;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field2614[var20] = (short) var38;
                }
            }
            ++field2618;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(Z)V")
    public static void method1002(boolean arg0) {
        if (arg0) {
            method1002(false);
        }
        field2621 = null;
        field2623 = null;
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field2621[var0] = class9.method47(var0, (byte) -4);
        }
    }
}
