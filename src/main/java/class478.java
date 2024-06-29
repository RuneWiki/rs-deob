import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class478 extends class34 {

    @OriginalMember(owner = "client!sm", name = "E", descriptor = "I")
    private int field6904 = 0;

    @OriginalMember(owner = "client!sm", name = "M", descriptor = "[S")
    private short[] field6912 = new short[257];

    @OriginalMember(owner = "client!sm", name = "I", descriptor = "Lvr;")
    public static class187 field6908 = new class187("WTRC", 1);

    @OriginalMember(owner = "client!sm", name = "Q", descriptor = "I")
    public static int field6916 = -1;

    @OriginalMember(owner = "client!sm", name = "P", descriptor = "Lre;")
    public static class482 field6915 = class363.method2168(100);

    @OriginalMember(owner = "client!sm", name = "F", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!sm", name = "G", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!sm", name = "H", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!sm", name = "J", descriptor = "I")
    public static int field6909;

    @OriginalMember(owner = "client!sm", name = "K", descriptor = "I")
    public static int field6910;

    @OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!sm", name = "N", descriptor = "I")
    public static int field6913;

    @OriginalMember(owner = "client!sm", name = "O", descriptor = "I")
    public static int field6914;

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "[I")
    private int[] field6903;

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "[I")
    private int[] field6917;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "[[I")
    private int[][] field6902;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)[I")
    private final int[] method2833(int arg0, byte arg1) {
        ++field6910;
        if (~arg0 > -1) {
            return this.field6903;
        } else {
            if (arg1 != 113) {
                this.method2834(20);
            }
            return arg0 >= this.field6902.length ? this.field6917 : this.field6902[arg0];
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        ++field6909;
        if (this.field6902 == null) {
            this.field6902 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field6902.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 >= -84) {
                this.field6902 = null;
            }
            if (~this.field6904 == -3) {
                this.method2835(106);
            }
            class114.method856(81);
            this.method2834(12571);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        int var3 = 77 % (-arg1 / 50);
        ++field6907;
        int[] var4 = super.field537.method1780(arg0, (byte) 53);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            for (int var6 = 0; class383.field5502 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (var7 > 256) {
                    var7 = 256;
                }
                var4[var6] = this.field6912[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)V")
    private final void method2834(int arg0) {
        ++field6905;
        int var2 = this.field6904;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field6902.length - 1 && var4 >= this.field6902[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field6902[var5 - 1];
                    int[] var7 = this.field6902[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class135.field2057[(var8 & 8172) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field6912[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field6902.length + -1 > var14 && var13 >= this.field6902[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field6902[var14 + -1];
                    int[] var16 = this.field6902[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field6912[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field6902.length + -1 && var21 >= this.field6902[var22][0]; ++var22) {
                }
                int[] var23 = this.field6902[var22 + -1];
                int[] var24 = this.field6902[var22];
                int var25 = this.method2833(var22 - 2, (byte) 113)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2833(var22 + 1, (byte) 113)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = var25 - var26 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var26 - -var36;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field6912[var20] = (short) var38;
            }
        }
        if (arg0 != 12571) {
            method2836(-128);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
    public class478() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V")
    private final void method2835(int arg0) {
        ++field6906;
        int[] var2 = this.field6902[0];
        int var3 = 97 / ((-41 - arg0) / 59);
        int[] var4 = this.field6902[1];
        int[] var5 = this.field6902[this.field6902.length - 2];
        int[] var6 = this.field6902[this.field6902.length + -1];
        this.field6917 = new int[] { var5[0] - -var5[0] - var6[0], var5[1] + -var6[1] + var5[1] };
        this.field6903 = new int[] { -var4[0] - -var2[0] + var2[0], var2[1] + var2[1] + -var4[1] };
    }

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "(I)V")
    public static void method2836(int arg0) {
        field6915 = null;
        if (arg0 == 4096) {
            field6908 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field6911;
        if (arg1 <= 16) {
            this.field6902 = null;
        }
        if (arg2 == 0) {
            this.field6904 = arg0.method1869(-92);
            this.field6902 = new int[arg0.method1869(-96)][2];
            for (int var4 = 0; this.field6902.length > var4; ++var4) {
                this.field6902[var4][0] = arg0.method1844(-108);
                this.field6902[var4][1] = arg0.method1844(-119);
            }
        }
    }
}
