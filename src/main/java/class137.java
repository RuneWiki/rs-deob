import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class137 extends class456 {

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    private int field1968 = 0;

    @OriginalMember(owner = "client!br", name = "L", descriptor = "I")
    private int field1972 = 4096;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!br", name = "M", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)[I", line = 4)
    public final int[] method33(int arg0, int arg1) {
        ++field1970;
        if (arg0 != -1) {
            return null;
        } else {
            int[] var3 = super.field6466.method2533(true, arg1);
            if (super.field6466.field6153) {
                int[] var4 = this.method2707(arg1, arg0 + -31796, 0);
                for (int var5 = 0; ~class156.field2169 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (~var6 > ~this.field1968) {
                        var3[var5] = this.field1968;
                    } else if (this.field1972 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field1972;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I", line = 48)
    public final int[][] method212(int arg0, int arg1) {
        ++field1973;
        if (arg0 != 0) {
            return null;
        } else {
            int[][] var3 = super.field6468.method1090(-2, arg1);
            if (super.field6468.field2227) {
                int[][] var4 = this.method2709(false, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class156.field2169; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~var12 > ~this.field1968) {
                        var8[var11] = this.field1968;
                    } else if (this.field1972 < var12) {
                        var8[var11] = this.field1972;
                    } else {
                        var8[var11] = var12;
                    }
                    if (var13 >= this.field1968) {
                        if (var13 > this.field1972) {
                            var9[var11] = this.field1972;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field1968;
                    }
                    if (var14 < this.field1968) {
                        var10[var11] = this.field1968;
                    } else if (this.field1972 < var14) {
                        var10[var11] = this.field1972;
                    } else {
                        var10[var11] = var14;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 135)
    public class137() {
        super(1, false);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(III)I", line = 143)
    public static final int method959(int arg0, int arg1, int arg2) {
        int var3 = 38 % ((arg0 - -1) / 59);
        ++field1969;
        int var4 = 0;
        while (arg2 > 0) {
            var4 = 1 & arg1 | var4 << 1;
            arg1 >>>= 1;
            --arg2;
        }
        return var4;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBLre;)V", line = 163)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 != 55) {
            this.field1972 = 53;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field6486 = arg2.method2628(arg1 ^ 49207) == 1;
                }
            } else {
                this.field1972 = arg2.method2631(2530);
            }
        } else {
            this.field1968 = arg2.method2631(2530);
        }
        ++field1975;
    }

    @OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V", line = 206)
    public static final void method960(int arg0) {
        ++field1974;
        class467.field6572 = new class178[class134.field1945.method2675(false)][];
        if (arg0 != -18170) {
            field1971 = -45;
        }
        class361.field5469 = new class178[class134.field1945.method2675(false)][];
        class225.field3265 = new boolean[class134.field1945.method2675(false)];
    }
}
