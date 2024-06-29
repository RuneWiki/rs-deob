import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class386 extends class328 {

    @OriginalMember(owner = "client!vm", name = "N", descriptor = "[S")
    private short[] field5750 = new short[257];

    @OriginalMember(owner = "client!vm", name = "M", descriptor = "I")
    private int field5749 = 0;

    @OriginalMember(owner = "client!vm", name = "C", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!vm", name = "G", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!vm", name = "H", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!vm", name = "I", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!vm", name = "K", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!vm", name = "L", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!vm", name = "P", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!vm", name = "E", descriptor = "Lqaa;")
    public static class131 field5742;

    @OriginalMember(owner = "client!vm", name = "D", descriptor = "[I")
    private int[] field5741;

    @OriginalMember(owner = "client!vm", name = "O", descriptor = "[I")
    private int[] field5751;

    @OriginalMember(owner = "client!vm", name = "B", descriptor = "[[I")
    private int[][] field5739;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method2341(String arg0, int arg1, boolean arg2) {
        ++field5744;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (!arg2 ? class377.field5545.field6052 : class377.field5545.field6050) + var6;
        for (int var8 = var6; var8 < var7; ++var8) {
            class368 var11 = class377.field5545.method2475(-11743, var8);
            if (var11.field5225 && var11.method2228(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class237.field3481 = -1;
                    class66.field1114 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        if (arg1 > -59) {
            field5742 = null;
        }
        class66.field1114 = var4;
        class327.field4717 = 0;
        class237.field3481 = var5;
        String[] var9 = new String[class237.field3481];
        for (int var10 = 0; var10 < class237.field3481; ++var10) {
            var9[var10] = class377.field5545.method2475(-11743, var4[var10]).method2228(false);
        }
        class70.method685(class66.field1114, var9, -1);
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(B)V")
    public static void method2342(byte arg0) {
        field5742 = null;
        if (arg0 <= 114) {
            method2342((byte) -61);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        if (arg0 <= 75) {
            this.method1((byte) -48, -118, (class268) null);
        }
        ++field5746;
        if (arg1 == 0) {
            this.field5749 = arg2.method1738(255);
            this.field5739 = new int[arg2.method1738(255)][2];
            for (int var4 = 0; ~this.field5739.length < ~var4; ++var4) {
                this.field5739[var4][0] = arg2.method1745(32132);
                this.field5739[var4][1] = arg2.method1745(32132);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)[I")
    private final int[] method2343(int arg0, byte arg1) {
        ++field5743;
        if (arg0 < 0) {
            return this.field5741;
        } else {
            if (arg1 >= -124) {
                method2342((byte) -34);
            }
            return arg0 >= this.field5739.length ? this.field5751 : this.field5739[arg0];
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field5752;
        if (this.field5739 == null) {
            this.field5739 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field5739.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field5749 == 2) {
                this.method2345(0);
            }
            class83.method761(true);
            this.method2344((byte) -74);
            if (arg0 > -97) {
                this.method1((byte) 104, 78, (class268) null);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(B)V")
    private final void method2344(byte arg0) {
        int var2 = this.field5749;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field5739.length + -1) && var4 >= this.field5739[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field5739[var5 + -1];
                    int[] var7 = this.field5739[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class38.field514[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field5750[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field5739.length + -1 && ~var13 <= ~this.field5739[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field5739[var14 + -1];
                    int[] var16 = this.field5739[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field5750[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field5739.length - 1 && var21 >= this.field5739[var22][0]; ++var22) {
                }
                int[] var23 = this.field5739[var22 + -1];
                int[] var24 = this.field5739[var22];
                int var25 = this.method2343(var22 + -2, (byte) -128)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method2343(var22 - -1, (byte) -127)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + var26 + -var27 + var28;
                int var32 = -var31 + var25 + -var26;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 + var36 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field5750[var20] = (short) var38;
            }
        }
        ++field5747;
        if (arg0 > -24) {
            method2341((String) null, 39, true);
        }
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V")
    private final void method2345(int arg0) {
        ++field5745;
        int[] var2 = this.field5739[0];
        int[] var3 = this.field5739[1];
        int[] var4 = this.field5739[this.field5739.length + -2];
        int[] var5 = this.field5739[this.field5739.length + -1];
        this.field5751 = new int[] { var4[arg0] - -var4[0] + -var5[0], var4[1] - (var5[1] - var4[1]) };
        this.field5741 = new int[] { -var3[0] - -var2[0] + var2[0], var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BII)I")
    public static final int method2346(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field5740;
        int var4 = -1;
        if (arg2 > -90) {
            field5742 = null;
        }
        for (int var5 = arg3; ~var5 > ~arg0; ++var5) {
            var4 = var4 >>> 8 ^ class42.field579[(arg1[var5] ^ var4) & 255];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V")
    public class386() {
        super(1, true);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field5748;
        int var3 = -106 % ((48 - arg1) / 56);
        int[] var4 = super.field4720.method2872(1, arg0);
        if (super.field4720.field7109) {
            int[] var5 = this.method2042(0, arg0, (byte) 119);
            for (int var6 = 0; class449.field6539 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (~var7 < -257) {
                    var7 = 256;
                }
                var4[var6] = this.field5750[var7];
            }
        }
        return var4;
    }
}
