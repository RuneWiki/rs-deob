import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class497 extends class80 {

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
    private int field7296 = 0;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "[S")
    private short[] field7303 = new short[257];

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "Llt;")
    public static class480 field7305;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "[I")
    private int[] field7297;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[I")
    private int[] field7308;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "[[I")
    private int[][] field7298;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field7306;
        if (!arg0) {
            this.method3003(-69);
        }
        if (this.field7298 == null) {
            this.field7298 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field7298.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field7296 == 2) {
                this.method3002(0);
            }
            class488.method2956(-15926);
            this.method3003(-24272);
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(Z)V")
    public static final void method3000(boolean arg0) {
        ++field7309;
        class399 var1 = class182.field2940;
        synchronized (class182.field2940) {
            if (arg0) {
                field7305 = null;
            }
            class182.field2940.method2477(93);
        }
        class399 var2 = class522.field7581;
        synchronized (class522.field7581) {
            class522.field7581.method2477(-126);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field7299;
        int var4 = 58 / ((28 - arg1) / 53);
        if (~arg0 == -1) {
            this.field7296 = arg2.method1858(-3256);
            this.field7298 = new int[arg2.method1858(-3256)][2];
            for (int var5 = 0; ~this.field7298.length < ~var5; ++var5) {
                this.field7298[var5][0] = arg2.method1841((byte) 111);
                this.field7298[var5][1] = arg2.method1841((byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field7301;
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int[] var4 = this.method710(arg0, 0, (byte) 89);
            for (int var5 = 0; ~class137.field2308 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field7303[var6];
            }
        }
        return arg1 != -16828 ? null : var3;
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IZ)Lnd;")
    public static final class385 method3001(int arg0, boolean arg1) {
        ++field7307;
        if (arg1) {
            field7305 = null;
        }
        class60[] var2 = class123.field2139;
        synchronized (class123.field2139) {
            class385 var3;
            if (class123.field2139.length > arg0 && !class123.field2139[arg0].method541(false)) {
                var3 = (class385) class123.field2139[arg0].method539((byte) 93);
                var3.method2352((byte) 123);
                int var10002 = class81.field1639[arg0]--;
            } else {
                var3 = new class385();
                var3.field5620 = new class313[arg0];
                for (int var4 = 0; ~arg0 < ~var4; ++var4) {
                    var3.field5620[var4] = new class313();
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)V")
    private final void method3002(int arg0) {
        ++field7304;
        int[] var2 = this.field7298[0];
        int[] var3 = this.field7298[1];
        int[] var4 = this.field7298[this.field7298.length + -2];
        int[] var5 = this.field7298[this.field7298.length + -1];
        this.field7297 = new int[] { var4[0] - (var5[arg0] + -var4[0]), var4[1] - var5[1] + var4[1] };
        this.field7308 = new int[] { var2[0] - var3[0] - -var2[0], -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
    private final void method3003(int arg0) {
        int var2 = this.field7296;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field7298.length + -1) && ~this.field7298[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field7298[var5 - 1];
                    int[] var7 = this.field7298[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class482.field7106[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field7303[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field7298.length + -1) < ~var14 && this.field7298[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field7298[var14 - 1];
                    int[] var16 = this.field7298[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 - -(var16[1] * var17) >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field7303[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field7298.length + -1 && ~this.field7298[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field7298[var22 + -1];
                int[] var24 = this.field7298[var22];
                int var25 = this.method3004(var22 + -2, -1)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3004(var22 - -1, -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var27 - -var26 + -var25;
                int var32 = -var26 - var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field7303[var20] = (short) var38;
            }
        }
        if (arg0 != -24272) {
            this.field7308 = null;
        }
        ++field7295;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class497() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(II)[I")
    private final int[] method3004(int arg0, int arg1) {
        if (arg1 != -1) {
            this.method3004(44, 43);
        }
        ++field7300;
        if (arg0 < 0) {
            return this.field7308;
        } else {
            return arg0 >= this.field7298.length ? this.field7297 : this.field7298[arg0];
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(III)I")
    public static final int method3005(int arg0, int arg1, int arg2) {
        ++field7302;
        int var3 = 0;
        if (arg1 < 18) {
            return -39;
        } else {
            while (arg2 > 0) {
                var3 = arg0 & 1 | var3 << 1;
                arg0 >>>= 1;
                --arg2;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static void method3006(int arg0) {
        field7305 = null;
        if (arg0 != 257) {
            method3005(-99, -61, -83);
        }
    }
}
