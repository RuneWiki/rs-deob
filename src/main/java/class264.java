import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class264 extends class160 {

    @OriginalMember(owner = "client!ka", name = "gb", descriptor = "[S")
    private short[] field4203 = new short[257];

    @OriginalMember(owner = "client!ka", name = "bb", descriptor = "I")
    private int field4198 = 0;

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "Ljava/lang/String;")
    public static String field4192 = null;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "[[B")
    public static byte[][] field4194 = new byte[250][];

    @OriginalMember(owner = "client!ka", name = "jb", descriptor = "I")
    public static int field4206 = 1;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ka", name = "Y", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!ka", name = "ab", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ka", name = "db", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!ka", name = "hb", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!ka", name = "ib", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Lhc;")
    public static class235 field4190;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "[I")
    public static int[] field4193;

    @OriginalMember(owner = "client!ka", name = "eb", descriptor = "[I")
    private int[] field4201;

    @OriginalMember(owner = "client!ka", name = "fb", descriptor = "[I")
    private int[] field4202;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[[I")
    private int[][] field4191;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
    public class264() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)[I")
    private final int[] method1781(int arg0, int arg1) {
        ++field4200;
        if (~arg1 > -1) {
            return this.field4201;
        } else {
            if (arg0 != 1) {
                this.field4198 = 113;
            }
            return ~arg1 <= ~this.field4191.length ? this.field4202 : this.field4191[arg1];
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field4196;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (arg1 != 57) {
            field4194 = null;
        }
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0, (byte) 70);
            for (int var5 = 0; ~var5 > ~class240.field3896; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field4203[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
    private final void method1782(int arg0) {
        ++field4204;
        int[] var2 = this.field4191[this.field4191.length - 2];
        int[] var3 = this.field4191[0];
        int[] var4 = this.field4191[1];
        int[] var5 = this.field4191[this.field4191.length + -1];
        this.field4201 = new int[] { var3[0] - -var3[0] + -var4[0], var3[1] + -var4[1] + var3[1] };
        this.field4202 = new int[] { var2[0] - var5[0] + var2[arg0], var2[1] + -var5[1] + var2[1] };
    }

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "(B)V")
    public final void method210(byte arg0) {
        ++field4195;
        if (this.field4191 == null) {
            this.field4191 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 < -124) {
            if (this.field4191.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field4198 == 2) {
                    this.method1782(0);
                }
                class47.method338(-49);
                this.method1784(20274);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field4198 = arg0.method633(58);
            this.field4191 = new int[arg0.method633(65)][2];
            for (int var4 = 0; this.field4191.length > var4; ++var4) {
                this.field4191[var4][0] = arg0.method645(11596);
                this.field4191[var4][1] = arg0.method645(11596);
            }
        }
        if (arg1 <= 11) {
            this.field4191 = null;
        }
        ++field4197;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(IIIII)Z")
    public static final boolean method1783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class256.field4103 * arg3 + class187.field2907 * arg0 >> 16;
        int var6 = class187.field2907 * arg3 - class256.field4103 * arg0 >> 16;
        int var7 = class221.field3404 * arg1 + class109.field1789 * var6 >> 16;
        int var8 = class109.field1789 * arg1 - class221.field3404 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class221.field3404 * arg2 + class109.field1789 * var6 >> 16;
        int var12 = class109.field1789 * arg2 - class221.field3404 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class95.field1610 && var13 < class95.field1610) {
            return false;
        } else if (var9 > class144.field2217 && var13 > class144.field2217) {
            return false;
        } else if (var10 < class99.field1670 && var14 < class99.field1670) {
            return false;
        } else {
            return var10 <= class146.field2323 || var14 <= class146.field2323;
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V")
    private final void method1784(int arg0) {
        if (arg0 != 20274) {
            this.field4202 = null;
        }
        int var2 = this.field4198;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field4191.length + -1 && ~this.field4191[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field4191[var5 + -1];
                    int[] var7 = this.field4191[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class197.field3112[(var8 & 8175) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field4203[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field4191.length + -1) && ~var13 <= ~this.field4191[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field4191[var14];
                    int[] var16 = this.field4191[var14 - 1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] - var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field4203[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field4191.length + -1) < ~var22 && var21 >= this.field4191[var22][0]; ++var22) {
                }
                int[] var23 = this.field4191[var22];
                int[] var24 = this.field4191[var22 + -1];
                int var25 = this.method1781(arg0 + -20273, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1781(arg0 ^ 20275, var22 + 1)[1];
                int var29 = (var21 - var24[0] << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var25 + -var26 + var27;
                int var32 = -var27 + var25 + -var31;
                int var34 = -var25 + var26;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var34 >> 12;
                int var38 = var35 + var37 + var27 - -var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field4203[var20] = (short) var38;
            }
        }
        ++field4205;
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(II)Ljava/lang/String;")
    public static final String method1785(int arg0, int arg1) {
        String var2 = Integer.toString(arg0);
        ++field4199;
        for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() + -8) + class212.field3304 + " (" + var2 + ")</col>";
        } else {
            return arg1 > ~var2.length() ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class130.field2031 + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)V")
    public static void method1786(int arg0) {
        field4193 = null;
        field4192 = null;
        field4190 = null;
        if (arg0 != 2) {
            field4193 = null;
        }
        field4194 = null;
    }
}
