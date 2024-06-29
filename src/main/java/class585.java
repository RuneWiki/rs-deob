import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class585 extends class38 {

    @OriginalMember(owner = "client!kha", name = "O", descriptor = "I")
    private int field8309 = 0;

    @OriginalMember(owner = "client!kha", name = "M", descriptor = "[S")
    private short[] field8307 = new short[257];

    @OriginalMember(owner = "client!kha", name = "E", descriptor = "I")
    public static int field8299;

    @OriginalMember(owner = "client!kha", name = "F", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!kha", name = "H", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!kha", name = "I", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!kha", name = "J", descriptor = "I")
    public static int field8304;

    @OriginalMember(owner = "client!kha", name = "K", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!kha", name = "N", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!kha", name = "P", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!kha", name = "Q", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!kha", name = "D", descriptor = "[I")
    private int[] field8298;

    @OriginalMember(owner = "client!kha", name = "L", descriptor = "[I")
    private int[] field8306;

    @OriginalMember(owner = "client!kha", name = "G", descriptor = "[[I")
    private int[][] field8301;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)V")
    public final void method191(byte arg0) {
        ++field8299;
        if (this.field8301 == null) {
            this.field8301 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field8301.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field8309 == -3) {
                this.method3386(0);
            }
            class417.method2634((byte) -118);
            this.method3383((byte) 0);
            if (arg0 < 120) {
                this.method190(73, -122, (class645) null);
            }
        }
    }

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "(B)V")
    private final void method3383(byte arg0) {
        int var2 = this.field8309;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field8301.length + -1 > var5 && this.field8301[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field8301[var5 + -1];
                    int[] var7 = this.field8301[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] + -var6[0]);
                    int var9 = -class89.field1268[(var8 & 8172) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field8307[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field8301.length + -1) && ~this.field8301[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field8301[var14 + -1];
                    int[] var16 = this.field8301[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field8307[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field8301.length + -1 && var21 >= this.field8301[var22][0]; ++var22) {
                }
                int[] var23 = this.field8301[var22 + -1];
                int[] var24 = this.field8301[var22];
                int var25 = this.method3387(0, var22 - 2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method3387(arg0, var22 + 1)[1];
                int var29 = (var21 - var23[0] << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 + -var25 + var26;
                int var32 = -var26 + var25 + -var31;
                int var33 = var27 - var25;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var37 - -var26;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field8307[var20] = (short) var38;
            }
        }
        if (arg0 != 0) {
            this.field8307 = null;
        }
        ++field8303;
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "()V")
    public class585() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)V")
    public static final void method3384(int arg0) {
        ++field8308;
        class390 var1 = null;
        try {
            class197 var2 = class179.field2759.method4060("", true, (byte) 52);
            while (var2.field2986 == 0) {
                class277.method1759(1L, 67);
            }
            int var3 = 31 / ((-25 - arg0) / 38);
            if (~var2.field2986 == -2) {
                var1 = (class390) var2.field2990;
                class645 var4 = class63.field916.method4106((byte) 109);
                var1.method2507(var4.field9068, (byte) 108, 0, var4.field9084);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2504(-109);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field8304;
        if (arg0 >= -43) {
            this.method190(-37, 34, (class645) null);
        }
        int[] var3 = super.field397.method1376(arg1, (byte) -33);
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            for (int var5 = 0; class729.field10216 > var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (~var6 > -1) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field8307[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3385(int arg0, byte arg1, int arg2) {
        if (arg1 < 112) {
            return false;
        } else {
            ++field8310;
            return (2048 & arg0) != 0;
        }
    }

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
    private final void method3386(int arg0) {
        ++field8305;
        int[] var2 = this.field8301[0];
        int[] var3 = this.field8301[1];
        int[] var4 = this.field8301[this.field8301.length + -2];
        int[] var5 = this.field8301[this.field8301.length - 1];
        this.field8306 = new int[] { var2[0] - (var3[0] - var2[0]), var2[1] - (var3[1] + -var2[1]) };
        this.field8298 = new int[] { var4[0] - -var4[arg0] - var5[0], var4[1] + var4[1] - var5[1] };
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(II)[I")
    private final int[] method3387(int arg0, int arg1) {
        ++field8302;
        if (arg1 < arg0) {
            return this.field8306;
        } else {
            return ~arg1 <= ~this.field8301.length ? this.field8298 : this.field8301[arg1];
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        if (arg1 == 0) {
            this.field8309 = arg2.method3745(-6314);
            this.field8301 = new int[arg2.method3745(-6314)][2];
            for (int var4 = 0; var4 < this.field8301.length; ++var4) {
                this.field8301[var4][0] = arg2.method3712((byte) -116);
                this.field8301[var4][1] = arg2.method3712((byte) -107);
            }
        }
        if (arg0 <= 34) {
            this.field8298 = null;
        }
        ++field8311;
    }
}
