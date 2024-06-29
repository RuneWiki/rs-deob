import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class1 extends class115 {

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "[Lqe;")
    public static class168[] field8 = new class168[1000];

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "[[[B")
    public static byte[][][] field6;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field2;
        int[][] var3 = super.field1882.method1242(arg0, 45);
        if (arg1 <= 11) {
            return null;
        } else {
            if (super.field1882.field3344) {
                int[] var4 = this.method792(0, 2, arg0);
                int[][] var5 = this.method789(0, (byte) -124, arg0);
                int[][] var6 = this.method789(1, (byte) -124, arg0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var5[0];
                int[] var10 = var3[2];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; ~class130.field2297 < ~var16; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 != 0) {
                            int var18 = 4096 - var17;
                            var7[var16] = var9[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                            var10[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var10[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var9[var16];
                        var8[var16] = var11[var16];
                        var10[var16] = var12[var16];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZI)I")
    public static final int method2(int arg0, boolean arg1, int arg2) {
        class170 var3 = (class170) class119.field1941.method1527((long) arg2, (byte) -94);
        ++field1;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg1) {
                return 116;
            } else {
                while (var3.field2960.length > var5) {
                    if (~var3.field2964[var5] == ~arg0) {
                        var4 += var3.field2960[var5];
                    }
                    ++var5;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1879 = arg1.method758(true) == 1;
        }
        if (arg0 != 107) {
            method4(7, 100);
        }
        ++field3;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)I")
    public static final int method4(int arg0, int arg1) {
        if (arg1 != -701) {
            method2(-10, false, -119);
        }
        ++field7;
        return (129773 & arg0) >> 11;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        int[] var3 = super.field1872.method182((byte) -99, arg0);
        if (arg1 < 37) {
            field6 = null;
        }
        ++field5;
        if (super.field1872.field341) {
            int[] var4 = this.method792(0, 0, arg0);
            int[] var5 = this.method792(0, 1, arg0);
            int[] var6 = this.method792(0, 2, arg0);
            for (int var7 = 0; var7 < class130.field2297; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 == 0) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V")
    public static void method6(int arg0) {
        field6 = null;
        if (arg0 == 0) {
            field8 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class1() {
        super(3, false);
    }
}
