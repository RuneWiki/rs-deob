import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class105 extends class5 {

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "[S")
    private short[] field1401 = new short[257];

    @OriginalMember(owner = "client!kq", name = "T", descriptor = "I")
    private int field1408 = 0;

    @OriginalMember(owner = "client!kq", name = "S", descriptor = "[I")
    public static int[] field1407 = new int[50];

    @OriginalMember(owner = "client!kq", name = "O", descriptor = "Lrga;")
    public static class280 field1403 = new class280(41, 7);

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!kq", name = "N", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!kq", name = "P", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!kq", name = "R", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!kq", name = "V", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!kq", name = "X", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!kq", name = "W", descriptor = "Lpl;")
    public static class612 field1411;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "[I")
    private int[] field1396;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "[I")
    private int[] field1400;

    @OriginalMember(owner = "client!kq", name = "U", descriptor = "[I")
    public static int[] field1409;

    @OriginalMember(owner = "client!kq", name = "Q", descriptor = "[[I")
    private int[][] field1405;

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 11)
    public class105() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 14)
    public final void method46(int arg0) {
        if (this.field1405 == null) {
            this.field1405 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1402;
        if (this.field1405.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (~this.field1408 == -3) {
                this.method594(76);
            }
            int var2 = 18 / ((arg0 - 64) / 60);
            class205.method1241(0);
            this.method595(-99);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZLes;)Lbw;", line = 42)
    public static final class452 method591(boolean arg0, class630 arg1) {
        ++field1397;
        class130 var2 = class413.method2200(71, arg1);
        int var3 = arg1.method3483(71);
        int var4 = arg1.method3483(82);
        int var5 = arg1.method3470(13111);
        if (!arg0) {
            method593(33, 78, true);
        }
        return new class452(var2.field1625, var2.field1622, var2.field1623, var2.field1616, var2.field1621, var2.field1617, var2.field1619, var2.field1614, var2.field1618, var3, var4, var5);
    }

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "(I)V", line = 62)
    public static void method592(int arg0) {
        field1403 = null;
        field1409 = null;
        field1407 = null;
        int var1 = 97 / ((31 - arg0) / 42);
        field1411 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZ)Z", line = 75)
    public static final boolean method593(int arg0, int arg1, boolean arg2) {
        ++field1412;
        if (!arg2) {
            field1403 = null;
        }
        return client.method3817((byte) 95, arg0, arg1) & class639.method3578(arg0, arg1, -101);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILes;I)V", line = 87)
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field1410;
        if (~arg2 == -1) {
            this.field1408 = arg1.method3501(-9268);
            this.field1405 = new int[arg1.method3501(arg0 + -9269)][2];
            for (int var4 = 0; this.field1405.length > var4; ++var4) {
                this.field1405[var4][0] = arg1.method3470(13111);
                this.field1405[var4][1] = arg1.method3470(13111);
            }
        }
        if (arg0 != 1) {
            this.field1408 = -19;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I", line = 114)
    public final int[] method39(int arg0, int arg1) {
        ++field1399;
        int var3 = 55 / ((81 - arg0) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int[] var5 = this.method49(arg1, false, 0);
            for (int var6 = 0; class657.field9287 > var6; ++var6) {
                int var7 = var5[var6] >> 4;
                if (~var7 > -1) {
                    var7 = 0;
                }
                if (~var7 < -257) {
                    var7 = 256;
                }
                var4[var6] = this.field1401[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "(I)V", line = 154)
    private final void method594(int arg0) {
        ++field1398;
        int[] var2 = this.field1405[0];
        int[] var3 = this.field1405[1];
        int[] var4 = this.field1405[this.field1405.length + -2];
        if (arg0 <= 56) {
            this.field1401 = null;
        }
        int[] var5 = this.field1405[this.field1405.length + -1];
        this.field1396 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - var5[1] - -var4[1] };
        this.field1400 = new int[] { var2[0] - (var3[0] - var2[0]), -var3[1] - (-var2[1] - var2[1]) };
    }

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "(I)V", line = 175)
    private final void method595(int arg0) {
        ++field1404;
        if (arg0 > -67) {
            method592(113);
        }
        int var2 = this.field1408;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1405.length + -1 > var5 && ~var4 <= ~this.field1405[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1405[var5 + -1];
                    int[] var7 = this.field1405[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = -class100.field1358[var8 >> 5 & 255] + 4096 >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1401[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field1405.length - 1 > var14 && this.field1405[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field1405[var14 + -1];
                    int[] var16 = this.field1405[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1401[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field1405.length + -1 && this.field1405[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field1405[var22 - 1];
                int[] var24 = this.field1405[var22];
                int var25 = this.method596(var22 - 2, 0)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method596(var22 + 1, 0)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var25 + -var27 - -var26;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var37 - -var36 + var26;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1401[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I", line = 367)
    private final int[] method596(int arg0, int arg1) {
        ++field1406;
        if (arg0 < arg1) {
            return this.field1400;
        } else {
            return ~arg0 <= ~this.field1405.length ? this.field1396 : this.field1405[arg0];
        }
    }
}
