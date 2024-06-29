import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class256 extends class175 {

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    private int field4467 = 0;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    private int field4464 = 4096;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "[J")
    public static long[] field4462 = new long[1000];

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field4461 = 0;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "Lmj;")
    public static class246 field4463;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static final void method1782(byte arg0) {
        class209.field3607.method420((byte) -91);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class50.field876[var1] = 0L;
        }
        if (arg0 != 20) {
            method1783((byte) 125, (class3) null, 96, -76, (class3) null);
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class89.field1487[var2] = 0L;
        }
        ++field4459;
        class106.field1776 = 0;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLff;IILff;)Li;")
    public static final class18 method1783(byte arg0, class3 arg1, int arg2, int arg3, class3 arg4) {
        if (arg0 != 73) {
            method1786((byte) 63);
        }
        ++field4460;
        return !class224.method1530(arg3, arg2, (byte) 127, arg4) ? null : class153.method1118(arg1.method23(arg3, 103, arg2), true);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
    public class256() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILrg;)V")
    public final void method115(byte arg0, int arg1, class239 arg2) {
        int var4 = 88 / ((arg0 - -22) / 58);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3034 = arg2.method1651(4139) == 1;
                }
            } else {
                this.field4464 = arg2.method1663((byte) 80);
            }
        } else {
            this.field4467 = arg2.method1663((byte) 98);
        }
        ++field4457;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILrg;)Lgj;")
    public static final class237 method1784(int arg0, class239 arg1) {
        ++field4456;
        int var2 = 121 / ((arg0 - 24) / 37);
        return new class237(arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1627(true), arg1.method1660(-335289648), arg1.method1660(-335289648), arg1.method1651(4139));
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        int[][] var3 = super.field3035.method637(arg0, false);
        if (super.field3035.field1493) {
            int[][] var4 = this.method1253(arg0, -2880, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class1.field11 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~var14 > ~this.field4467) {
                    var8[var11] = this.field4467;
                } else if (~var14 < ~this.field4464) {
                    var8[var11] = this.field4464;
                } else {
                    var8[var11] = var14;
                }
                if (this.field4467 > var12) {
                    var9[var11] = this.field4467;
                } else if (this.field4464 >= var12) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field4464;
                }
                if (~this.field4467 >= ~var13) {
                    if (~var13 >= ~this.field4464) {
                        var10[var11] = var13;
                    } else {
                        var10[var11] = this.field4464;
                    }
                } else {
                    var10[var11] = this.field4467;
                }
            }
        }
        ++field4465;
        if (arg1 != 64) {
            method1786((byte) 83);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)I")
    public static final int method1785(int arg0, int arg1) {
        ++field4466;
        return arg1 != -15591 ? -100 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V")
    public static void method1786(byte arg0) {
        if (arg0 <= 94) {
            method1782((byte) -128);
        }
        field4462 = null;
        field4463 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)[I")
    public final int[] method1(byte arg0, int arg1) {
        ++field4468;
        int[] var3 = super.field3044.method904((byte) 127, arg1);
        if (super.field3044.field2150) {
            int[] var4 = this.method1255(0, arg1, 128);
            for (int var5 = 0; var5 < class1.field11; ++var5) {
                int var6 = var4[var5];
                if (~var6 <= ~this.field4467) {
                    if (~this.field4464 > ~var6) {
                        var3[var5] = this.field4464;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field4467;
                }
            }
        }
        int var7 = -76 / ((arg0 - 62) / 54);
        return var3;
    }
}
