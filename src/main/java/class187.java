import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class187 extends class222 {

    @OriginalMember(owner = "client!vi", name = "Y", descriptor = "I")
    private int field3223 = 0;

    @OriginalMember(owner = "client!vi", name = "jb", descriptor = "[S")
    private short[] field3234 = new short[257];

    @OriginalMember(owner = "client!vi", name = "Z", descriptor = "Lsb;")
    public static class98 field3224 = class47.method368(":clan:", 0);

    @OriginalMember(owner = "client!vi", name = "eb", descriptor = "Z")
    public static boolean field3229 = false;

    @OriginalMember(owner = "client!vi", name = "gb", descriptor = "Lsb;")
    public static class98 field3231 = class47.method368(" zuerst von Ihrer Ignorieren)2Liste(Q", 0);

    @OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!vi", name = "ab", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!vi", name = "fb", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!vi", name = "ib", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!vi", name = "W", descriptor = "[I")
    private int[] field3221;

    @OriginalMember(owner = "client!vi", name = "hb", descriptor = "[I")
    private int[] field3232;

    @OriginalMember(owner = "client!vi", name = "db", descriptor = "[[I")
    private int[][] field3228;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class187() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3224 = null;
        int var1 = 1 % ((arg0 - -19) / 50);
        field3231 = null;
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(B)V")
    private final void method1290(byte arg0) {
        int[] var2 = this.field3228[0];
        ++field3227;
        int[] var3 = this.field3228[1];
        if (arg0 == -72) {
            int[] var4 = this.field3228[this.field3228.length + -2];
            int[] var5 = this.field3228[this.field3228.length - 1];
            this.field3232 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] - var4[1]) };
            this.field3221 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
    public final void method288(int arg0) {
        ++field3230;
        int var2 = 96 / ((arg0 - 57) / 51);
        if (this.field3228 == null) {
            this.field3228 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field3228.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field3223 == 2) {
                this.method1290((byte) -72);
            }
            class133.method1002(0);
            this.method1291((byte) -107);
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field3223 = arg0.method1446(5350);
            this.field3228 = new int[arg0.method1446(5350)][2];
            for (int var4 = 0; ~this.field3228.length < ~var4; ++var4) {
                this.field3228[var4][0] = arg0.method1487(59);
                this.field3228[var4][1] = arg0.method1487(22);
            }
        }
        if (arg1) {
            this.method1291((byte) -109);
        }
        ++field3233;
    }

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "(B)V")
    private final void method1291(byte arg0) {
        ++field3222;
        int var2 = this.field3223;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field3228.length + -1) && this.field3228[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field3228[var5 + -1];
                    int[] var7 = this.field3228[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class132.field2351[(var8 & 8165) >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (var11 >= 32768) {
                        var11 = 32767;
                    }
                    this.field3234[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field3228.length + -1) && ~var13 <= ~this.field3228[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field3228[var14];
                    int[] var16 = this.field3228[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field3234[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field3228.length + -1) && ~this.field3228[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field3228[var22];
                int[] var24 = this.field3228[var22 + -1];
                int var25 = this.method1292(true, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1292(true, var22 + 1)[1];
                int var29 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26;
                int var32 = -var25 + var27 + var28 + -var26;
                int var33 = -var27 + var25 + -var32;
                int var35 = (var29 * var32 >> 12) * var30 >> 12;
                int var36 = var30 * var33 >> 12;
                int var37 = var29 * var31 >> 12;
                int var38 = var27 + var36 + var35 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field3234[var20] = (short) var38;
            }
        }
        if (arg0 > -97) {
            this.field3223 = 61;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZI)[I")
    private final int[] method1292(boolean arg0, int arg1) {
        ++field3225;
        if (~arg1 > -1) {
            return this.field3221;
        } else if (this.field3228.length <= arg1) {
            return this.field3232;
        } else {
            if (!arg0) {
                this.field3234 = null;
            }
            return this.field3228[arg1];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        if (arg0 < 35) {
            return null;
        } else {
            ++field3226;
            int[] var3 = super.field3844.method22(0, arg1);
            if (super.field3844.field61) {
                int[] var4 = this.method1537((byte) 96, 0, arg1);
                for (int var5 = 0; var5 < class13.field253; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field3234[var6];
                }
            }
            return var3;
        }
    }
}
