import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class221 extends class195 {

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "I")
    private int field3547 = 0;

    @OriginalMember(owner = "client!jk", name = "eb", descriptor = "I")
    private int field3548 = 4096;

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lck;")
    public static class119 field3544 = null;

    @OriginalMember(owner = "client!jk", name = "gb", descriptor = "Lck;")
    public static class119 field3550 = class298.method1987((byte) 108, "cookiehost");

    @OriginalMember(owner = "client!jk", name = "fb", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "Luj;")
    public static class156 field3541 = new class156();

    @OriginalMember(owner = "client!jk", name = "hb", descriptor = "[I")
    public static int[] field3551 = new int[99];

    @OriginalMember(owner = "client!jk", name = "jb", descriptor = "[Lck;")
    public static class119[] field3553;

    @OriginalMember(owner = "client!jk", name = "kb", descriptor = "Lck;")
    public static class119 field3554;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!jk", name = "ib", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "J")
    public static long field3538;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(III)Lnl;", line = 14)
    public static final class196 method1399(int arg0, int arg1, int arg2) {
        class104 var3 = class150.field2390[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1596; var4++) {
            class196 var5 = var3.field1610[var4];
            if ((var5.field3130 >> 29 & 0x3L) == 2L && var5.field3131 == arg1 && var5.field3146 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)[[I", line = 39)
    public final int[][] method9(byte arg0, int arg1) {
        field3545++;
        if (arg0 != 3) {
            method1401(111, -128, -59, 53);
        }
        int[][] var3 = this.field3126.method603(arg1, arg0 ^ 0xFFFFFF80);
        if (this.field3126.field1372) {
            int[][] var4 = this.method1256(arg1, 0, -10072);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class157.field2504; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (this.field3547 > var12) {
                    var8[var11] = this.field3547;
                } else if (this.field3548 < var12) {
                    var8[var11] = this.field3548;
                } else {
                    var8[var11] = var12;
                }
                if (var13 < this.field3547) {
                    var10[var11] = this.field3547;
                } else if (this.field3548 >= var13) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field3548;
                }
                if (this.field3547 > var14) {
                    var9[var11] = this.field3547;
                } else if (this.field3548 >= var14) {
                    var9[var11] = var14;
                } else {
                    var9[var11] = this.field3548;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 117)
    public class221() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIILvc;IJ)Z", line = 134)
    public static final boolean method1400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class293 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class42.method325(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(IIII)I", line = 150)
    public static final int method1401(int arg0, int arg1, int arg2, int arg3) {
        field3546++;
        if ((class111.field1707[arg3][arg0][arg1] & 0x8) != 0) {
            return 0;
        } else if (arg2 > -115) {
            return -22;
        } else if (arg3 <= 0 || (class111.field1707[1][arg0][arg1] & 0x2) == 0) {
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3551[var1] = var0 / 4;
        }
        field3553 = new class119[1000];
        field3554 = class298.method1987((byte) 78, "scrollen:");
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V", line = 171)
    public static void method1402(byte arg0) {
        field3544 = null;
        int var1 = -41 / ((arg0 - 40) / 57);
        field3553 = null;
        field3541 = null;
        field3551 = null;
        field3554 = null;
        field3550 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IZ)[I", line = 196)
    public final int[] method11(int arg0, boolean arg1) {
        int[] var3 = this.field3106.method924(100, arg0);
        field3540++;
        if (arg1) {
            this.method11(88, false);
        }
        if (this.field3106.field2260) {
            int[] var4 = this.method1253(0, 88, arg0);
            for (int var5 = 0; var5 < class157.field2504; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3547) {
                    var3[var5] = this.field3547;
                } else if (this.field3548 < var6) {
                    var3[var5] = this.field3548;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lfj;II)V", line = 256)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field3542++;
        if (arg1 > -117) {
            this.method13((class3) null, -4, -4);
        }
        if (arg2 == 0) {
            this.field3547 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field3548 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field3127 = arg0.method64((byte) -111) == 1;
        }
    }
}
