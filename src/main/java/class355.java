import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class355 extends class694 {

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    private int field5079 = 0;

    @OriginalMember(owner = "client!tm", name = "T", descriptor = "[S")
    private short[] field5093 = new short[257];

    @OriginalMember(owner = "client!tm", name = "P", descriptor = "I")
    public static int field5089 = 0;

    @OriginalMember(owner = "client!tm", name = "S", descriptor = "Lfc;")
    public static class235 field5092 = new class235(9, 14);

    @OriginalMember(owner = "client!tm", name = "H", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!tm", name = "K", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!tm", name = "O", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!tm", name = "Q", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!tm", name = "R", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!tm", name = "U", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!tm", name = "V", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
    private int[] field5082;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "[I")
    private int[] field5086;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "[[I")
    private int[][] field5080;

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V", line = 4)
    public class355() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V", line = 9)
    public static void method2102(byte arg0) {
        field5092 = null;
        int var1 = -3 / ((-92 - arg0) / 34);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILjr;B)V", line = 22)
    public final void method19(int arg0, class96 arg1, byte arg2) {
        ++field5083;
        int var4 = 4 % ((arg2 - 58) / 63);
        if (~arg0 == -1) {
            this.field5079 = arg1.method718(-78);
            this.field5080 = new int[arg1.method718(-63)][2];
            for (int var5 = 0; ~var5 > ~this.field5080.length; ++var5) {
                this.field5080[var5][0] = arg1.method743((byte) -27);
                this.field5080[var5][1] = arg1.method743((byte) -40);
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)[I", line = 48)
    public final int[] method39(int arg0, int arg1) {
        ++field5091;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (arg0 < 112) {
            this.method39(-13, 24);
        }
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, arg1, (byte) 35);
            for (int var5 = 0; ~class465.field6544 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (var6 > 256) {
                    var6 = 256;
                }
                var3[var5] = this.field5093[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(III)V", line = 92)
    public static final void method2103(int arg0, int arg1, int arg2) {
        if (arg0 != 32768) {
            field5092 = null;
        }
        ++field5095;
        class679 var3 = class669.method3708(1, arg1, arg0 + 1403016160);
        var3.method3748(true);
        var3.field9574 = arg2;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)I", line = 107)
    public static final int method2104(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -73 % ((-46 - arg2) / 55);
        ++field5087;
        if (arg1 >= arg3) {
            return arg0 < arg1 ? arg0 : arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "(II)V", line = 117)
    public static final void method2105(int arg0, int arg1) {
        class173.field2588 = 1000000000L / (long) arg1;
        if (arg0 != 0) {
            method2102((byte) -86);
        }
        ++field5081;
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)V", line = 129)
    public static final void method2106(byte arg0) {
        ++field5090;
        class64.field851 = 0;
        for (int var1 = 0; ~var1 > -2049; ++var1) {
            class474.field6627[var1] = null;
            class491.field6782[var1] = 1;
            class471.field6572[var1] = null;
        }
        if (arg0 <= 72) {
            method2104(-34, 1, 107, 15);
        }
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V", line = 155)
    public final void method40(int arg0) {
        if (this.field5080 == null) {
            this.field5080 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field5085;
        if (this.field5080.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (arg0 < 5) {
                this.method40(97);
            }
            if (this.field5079 == 2) {
                this.method2107((byte) 97);
            }
            class280.method1698(123);
            this.method2108(false);
        }
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(B)V", line = 184)
    private final void method2107(byte arg0) {
        ++field5094;
        int[] var2 = this.field5080[0];
        if (arg0 <= 26) {
            this.field5079 = -89;
        }
        int[] var3 = this.field5080[1];
        int[] var4 = this.field5080[this.field5080.length + -2];
        int[] var5 = this.field5080[this.field5080.length + -1];
        this.field5086 = new int[] { var4[0] + -var5[0] + var4[0], -var5[1] - -var4[1] + var4[1] };
        this.field5082 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 204)
    private final void method2108(boolean arg0) {
        int var2 = this.field5079;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; var5 < this.field5080.length + -1 && this.field5080[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field5080[var5 - 1];
                    int[] var7 = this.field5080[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class388.field5445[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5093[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field5080.length + -1 > var14 && this.field5080[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field5080[var14 + -1];
                    int[] var16 = this.field5080[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field5093[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~var22 > ~(this.field5080.length + -1) && var21 >= this.field5080[var22][0]; ++var22) {
                }
                int[] var23 = this.field5080[var22 + -1];
                int[] var24 = this.field5080[var22];
                int var25 = this.method2109(109, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2109(29, var22 - -1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var37 + var36 + var35;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5093[var20] = (short) var38;
            }
        }
        if (arg0) {
            method2103(-77, -16, 117);
        }
        ++field5088;
    }

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "(II)[I", line = 392)
    private final int[] method2109(int arg0, int arg1) {
        if (arg0 <= 14) {
            return null;
        } else {
            ++field5084;
            if (arg1 < 0) {
                return this.field5082;
            } else {
                return this.field5080.length <= arg1 ? this.field5086 : this.field5080[arg1];
            }
        }
    }
}
