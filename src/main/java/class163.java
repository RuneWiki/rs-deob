import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class163 {

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public int field2646 = 99;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public int field2654 = -1;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field2647 = -1;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public int field2637 = -1;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Z")
    public boolean field2653 = false;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public int field2659 = -1;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public int field2658 = 2;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public int field2662 = 5;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "Z")
    public boolean field2649 = false;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public boolean field2651 = false;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Z")
    public boolean field2652 = false;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "I")
    public int field2663 = -1;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field2644 = 0;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "J")
    public static long field2657 = 0L;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lhg;")
    public static class207 field2655;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public int[] field2638;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "[I")
    public int[] field2639;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "[I")
    private int[] field2660;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "[Z")
    public boolean[] field2665;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[[I")
    public int[][] field2648;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIILud;II)Lud;")
    public final class242 method1200(int arg0, int arg1, int arg2, class242 arg3, int arg4, int arg5) {
        field2641++;
        int var7 = this.field2638[arg4];
        int var8 = this.field2639[arg4];
        class31 var9 = class79.method553(var8 >> 16, 4);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method838(true, true, true);
        }
        int var11 = arg5 & 0x3;
        class31 var12 = null;
        if ((this.field2653 || class12.field205) && arg0 != -1 && arg0 < this.field2639.length) {
            int var13 = this.field2639[arg0];
            var12 = class79.method553(var13 >> 16, 4);
            arg0 = var13 & 0xFFFF;
        }
        class242 var14;
        if (var12 == null) {
            var14 = arg3.method838(!var9.method200(var10, (byte) -56), !var9.method194((byte) -119, var10), !this.field2652);
        } else {
            var14 = arg3.method838(!var9.method200(var10, (byte) -91) & !var12.method200(arg0, (byte) -77), !var9.method194((byte) -116, var10) & !var12.method194((byte) -122, arg0), !this.field2652);
        }
        if (var11 == 1) {
            var14.method849();
        } else if (var11 == 2) {
            var14.method850();
        } else if (var11 == 3) {
            var14.method851();
        }
        var14.method1737(var9, var10, var12, arg0, arg1 - 1, var7, this.field2652);
        if (arg2 != -3) {
            this.field2651 = true;
        }
        if (var11 == 1) {
            var14.method851();
        } else if (var11 == 2) {
            var14.method850();
        } else if (var11 == 3) {
            var14.method849();
        }
        return var14;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILab;)V")
    public final void method1201(int arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1802((byte) -90);
            if (var3 == 0) {
                field2645++;
                if (arg0 > -22) {
                    this.field2647 = 29;
                    return;
                }
                return;
            }
            this.method1203(var3, (byte) -128, arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILud;II)Lud;")
    public final class242 method1202(int arg0, int arg1, class242 arg2, int arg3, int arg4) {
        field2642++;
        int var6 = this.field2638[arg1];
        int var7 = this.field2639[arg1];
        class31 var8 = class79.method553(var7 >> 16, 4);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method857(true, true, true);
        }
        class31 var10 = null;
        if ((this.field2653 || class12.field205) && arg4 != -1 && arg4 < this.field2639.length) {
            int var11 = this.field2639[arg4];
            var10 = class79.method553(var11 >> 16, 4);
            arg4 = var11 & 0xFFFF;
        }
        class242 var12;
        if (var10 == null) {
            var12 = arg2.method857(!var8.method200(var9, (byte) -54), !var8.method194((byte) -128, var9), !this.field2652);
        } else {
            var12 = arg2.method857(!var8.method200(var9, (byte) -94) & !var10.method200(arg4, (byte) -100), !var8.method194((byte) -125, var9) & !var10.method194((byte) -118, arg4), !this.field2652);
        }
        int var13 = -95 / ((arg3 - 44) / 38);
        var12.method1737(var8, var9, var10, arg4, arg0 - 1, var6, this.field2652);
        return var12;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBLab;)V")
    private final void method1203(int arg0, byte arg1, class249 arg2) {
        if (arg0 == 1) {
            int var13 = arg2.method1821((byte) 51);
            this.field2638 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field2638[var14] = arg2.method1821((byte) 51);
            }
            this.field2639 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field2639[var15] = arg2.method1821((byte) 51);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field2639[var16] = (arg2.method1821((byte) 51) << 16) + this.field2639[var16];
            }
        } else if (arg0 == 2) {
            this.field2637 = arg2.method1821((byte) 51);
        } else if (arg0 == 3) {
            this.field2665 = new boolean[256];
            int var11 = arg2.method1802((byte) -99);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2665[arg2.method1802((byte) 96)] = true;
            }
        } else if (arg0 == 4) {
            this.field2649 = true;
        } else if (arg0 == 5) {
            this.field2662 = arg2.method1802((byte) -114);
        } else if (arg0 == 6) {
            this.field2647 = arg2.method1821((byte) 51);
        } else if (arg0 == 7) {
            this.field2659 = arg2.method1821((byte) 51);
        } else if (arg0 == 8) {
            this.field2646 = arg2.method1802((byte) -99);
        } else if (arg0 == 9) {
            this.field2663 = arg2.method1802((byte) 32);
        } else if (arg0 == 10) {
            this.field2654 = arg2.method1802((byte) -101);
        } else if (arg0 == 11) {
            this.field2658 = arg2.method1802((byte) 36);
        } else if (arg0 == 12) {
            int var4 = arg2.method1802((byte) -126);
            this.field2660 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2660[var5] = arg2.method1821((byte) 51);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2660[var6] += arg2.method1821((byte) 51) << 16;
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method1821((byte) 51);
            this.field2648 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method1802((byte) -103);
                if (var9 > 0) {
                    this.field2648[var8] = new int[var9];
                    this.field2648[var8][0] = arg2.method1812((byte) 52);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field2648[var8][var10] = arg2.method1821((byte) 51);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2652 = true;
        } else if (arg0 == 15) {
            this.field2653 = true;
        } else if (arg0 == 16) {
            this.field2651 = true;
        }
        field2640++;
        int var17 = -48 % ((82 - arg1) / 43);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILud;BI)Lud;")
    public final class242 method1204(int arg0, int arg1, class242 arg2, byte arg3, int arg4) {
        field2664++;
        int var6 = this.field2638[arg1];
        int var7 = this.field2639[arg1];
        class31 var8 = class79.method553(var7 >> 16, 4);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method841(true, true, true);
        }
        class31 var10 = null;
        int var11 = 0;
        class31 var12 = null;
        class31 var13 = null;
        if ((this.field2653 || class12.field205) && arg0 != -1 && this.field2639.length > arg0) {
            int var14 = this.field2639[arg0];
            var13 = class79.method553(var14 >> 16, 4);
            arg0 = var14 & 0xFFFF;
        }
        int var15 = 0;
        if (this.field2660 != null) {
            if (this.field2660.length > arg1) {
                var11 = this.field2660[arg1];
                if (var11 != 65535) {
                    var12 = class79.method553(var11 >> 16, 4);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field2653 || class12.field205) && arg0 != -1 && arg0 < this.field2660.length) {
                var15 = this.field2660[arg0];
                if (var15 != 65535) {
                    var10 = class79.method553(var15 >> 16, 4);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method200(var9, (byte) -113);
        boolean var17 = !var8.method194((byte) -122, var9);
        if (arg3 <= 109) {
            method1206(4);
        }
        if (var12 != null) {
            var16 &= !var12.method200(var11, (byte) -111);
            var17 &= !var12.method194((byte) -123, var11);
        }
        if (var13 != null) {
            var16 &= !var13.method200(arg0, (byte) -126);
            var17 &= !var13.method194((byte) -123, arg0);
        }
        if (var10 != null) {
            var16 &= !var10.method200(var15, (byte) -82);
            var17 &= !var10.method194((byte) -117, var15);
        }
        class242 var18 = arg2.method841(var16, var17, !this.field2652);
        var18.method1737(var8, var9, var13, arg0, arg4 - 1, var6, this.field2652);
        if (var12 != null) {
            var18.method1737(var12, var11, var10, var15, arg4 - 1, var6, this.field2652);
        }
        return var18;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public final void method1205(int arg0) {
        if (this.field2663 == -1) {
            if (this.field2665 == null) {
                this.field2663 = 0;
            } else {
                this.field2663 = 2;
            }
        }
        if (this.field2654 == -1) {
            if (this.field2665 == null) {
                this.field2654 = 0;
            } else {
                this.field2654 = 2;
            }
        }
        if (arg0 == 14461) {
            field2656++;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method1206(int arg0) {
        field2655 = null;
        int var1 = 26 / ((arg0 - 72) / 39);
    }
}
