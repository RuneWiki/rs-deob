import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class198 extends class398 {

    @OriginalMember(owner = "client!rr", name = "R", descriptor = "I")
    private int field2640 = 4096;

    @OriginalMember(owner = "client!rr", name = "S", descriptor = "I")
    private int field2641 = 0;

    @OriginalMember(owner = "client!rr", name = "O", descriptor = "I")
    public static int field2637 = 0;

    @OriginalMember(owner = "client!rr", name = "Q", descriptor = "Lar;")
    public static class47 field2639 = new class47();

    @OriginalMember(owner = "client!rr", name = "J", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!rr", name = "K", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!rr", name = "L", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!rr", name = "N", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!rr", name = "P", descriptor = "Lfh;")
    public static class210 field2638;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)[[I", line = 4)
    public final int[][] method99(int arg0, int arg1) {
        ++field2635;
        if (arg1 != 2) {
            return null;
        } else {
            int[][] var3 = super.field5933.method2205((byte) -114, arg0);
            if (super.field5933.field4847) {
                int[][] var4 = this.method2561(arg0, (byte) -73, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class140.field1922; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field2641 < ~var12) {
                        var8[var11] = this.field2641;
                    } else if (var12 > this.field2640) {
                        var8[var11] = this.field2640;
                    } else {
                        var8[var11] = var12;
                    }
                    if (~var13 > ~this.field2641) {
                        var9[var11] = this.field2641;
                    } else if (~var13 < ~this.field2640) {
                        var9[var11] = this.field2640;
                    } else {
                        var9[var11] = var13;
                    }
                    if (var14 >= this.field2641) {
                        if (var14 > this.field2640) {
                            var10[var11] = this.field2640;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field2641;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lnj;II)V", line = 84)
    public final void method208(class228 arg0, int arg1, int arg2) {
        if (arg2 != -13132) {
            field2638 = null;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field5931 = arg0.method1348(-121) == 1;
                }
            } else {
                this.field2640 = arg0.method1343(255);
            }
        } else {
            this.field2641 = arg0.method1343(255);
        }
        ++field2632;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method95(int arg0, int arg1) {
        ++field2634;
        if (arg1 != 0) {
            this.method99(67, 17);
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 121);
        if (super.field5927.field591) {
            int[] var4 = this.method2558(0, 29295, arg0);
            for (int var5 = 0; ~var5 > ~class140.field1922; ++var5) {
                int var6 = var4[var5];
                if (~this.field2641 >= ~var6) {
                    if (var6 > this.field2640) {
                        var3[var5] = this.field2640;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field2641;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 171)
    public static final String method1177(int arg0, long arg1) {
        ++field2636;
        if (arg0 != 3) {
            field2637 = 92;
        }
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg1 != -1L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class262.field3799[(int) (-(arg1 * 37L) + var7)];
                    if (var9 == '_') {
                        int var10 = -1 + var6.length();
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        var9 = 160;
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V", line = 223)
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "(I)V", line = 226)
    public static void method1178(int arg0) {
        field2638 = null;
        field2639 = null;
        if (arg0 < 28) {
            method1177(-65, -28L);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIIII)I", line = 239)
    public static final int method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg5 & 1) == -2) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        int var8 = arg4 & 3;
        ++field2633;
        if (var8 == 0) {
            return arg2;
        } else if (~var8 == -2) {
            return -arg1 + 7 + -arg3 + 1;
        } else {
            int var9 = 126 / ((arg0 - 82) / 36);
            return ~var8 == -3 ? 7 - arg6 - -1 + -arg2 : arg1;
        }
    }
}
