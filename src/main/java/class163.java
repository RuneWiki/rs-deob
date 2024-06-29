import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class163 extends class7 {

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    private int field2674 = -32768;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    private int field2693 = 0;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "Z")
    private boolean field2672 = true;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    private int field2701 = 0;

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    private int field2691 = -1;

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "I")
    private int field2682 = 0;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    private int field2678 = -1;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "Lqb;")
    private class95 field2702 = null;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    private int field2677;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "I")
    private int field2697;

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    private int field2676;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    private int field2679;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "Ldh;")
    private class157 field2684;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    private int field2695;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "[I")
    public static int[] field2675 = new int[128];

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    public static int field2700 = 0;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Ljava/util/Random;")
    public static Random field2692 = new Random();

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!wk", name = "B", descriptor = "Lgl;")
    public static class180 field2681;

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "[I")
    public static int[] field2686;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBII)V", line = 12)
    public final void method44(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != 31) {
            this.field2702 = (class95) null;
        }
        this.method993(true, (byte) -117);
        field2698++;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(IIIIIIIZLgf;)V", line = 428)
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class7 arg8) {
        this.field2677 = arg1;
        this.field2697 = arg0;
        this.field2683 = arg5;
        this.field2676 = arg4;
        this.field2679 = arg3;
        this.field2685 = arg2;
        if (arg8 != null) {
            if ((arg8 instanceof class163)) {
                ((class163) arg8).method995(0);
            } else {
                class281 var10 = class254.method1722(0, this.field2697);
                if (var10.field4752 != null) {
                    var10 = var10.method1873((byte) 40);
                }
                if (var10 != null) {
                    class295.method2008(64, var10, 0, this.field2683, this.field2685, this.field2679, this.field2676, 0, this.field2677);
                }
            }
        }
        if (arg6 != -1) {
            this.field2684 = class132.method821(128, arg6);
            this.field2690 = class75.field1309 - 1;
            this.field2695 = 0;
            if (this.field2684.field2592 == 0 && arg8 != null && arg8 instanceof class163) {
                class163 var11 = (class163) arg8;
                if (this.field2684 == var11.field2684) {
                    this.field2690 = var11.field2690;
                    this.field2695 = var11.field2695;
                    return;
                }
            }
            if (arg7 && this.field2684.field2567 != -1) {
                this.field2695 = (int) (Math.random() * (double) this.field2684.field2578.length);
                this.field2690 -= (int) ((double) this.field2684.field2568[this.field2695] * Math.random());
            }
        }
        if (arg8 != null) {
            this.method993(true, (byte) -77);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "()I", line = 46)
    public final int method40() {
        field2673++;
        return this.field2674;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 54)
    public static void method989(int arg0) {
        field2686 = null;
        field2692 = null;
        field2681 = null;
        field2675 = null;
        int var1 = 33 / ((arg0 - 62) / 50);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(III)Lia;", line = 69)
    public static final class197 method990(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2632;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(III)V", line = 82)
    private final void method991(int arg0, int arg1, int arg2) {
        if (this.field2684 != null) {
            int var4 = class75.field1309 - this.field2690;
            if (var4 > 100 && this.field2684.field2567 > 0) {
                int var5 = this.field2684.field2578.length - this.field2684.field2567;
                while (var5 > this.field2695 && this.field2684.field2568[this.field2695] < var4) {
                    var4 -= this.field2684.field2568[this.field2695];
                    this.field2695++;
                }
                if (var5 <= this.field2695) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2684.field2578.length; var7++) {
                        var6 += this.field2684.field2568[var7];
                    }
                    var4 %= var6;
                }
            }
            label64: {
                do {
                    do {
                        if (this.field2684.field2568[this.field2695] >= var4) {
                            break label64;
                        }
                        class141.method888(0, this.field2684, arg1, false, this.field2695, arg2);
                        var4 -= this.field2684.field2568[this.field2695];
                        this.field2695++;
                    } while (this.field2695 < this.field2684.field2578.length);
                    this.field2695 -= this.field2684.field2567;
                } while (this.field2695 >= 0 && this.field2695 < this.field2684.field2578.length);
                this.field2684 = null;
            }
            this.field2690 = class75.field1309 - var4;
        }
        field2671++;
        if (arg0 != 0) {
            this.field2679 = 121;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIBI)V", line = 149)
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field2680++;
        if (arg0 >= 1 && arg3 >= 1 && arg0 <= 102 && arg3 <= 102) {
            if (!class96.method622((byte) 0) && (class252.field4282[0][arg0][arg3] & 0x2) == 0) {
                int var8 = arg1;
                if ((class252.field4282[arg1][arg0][arg3] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class83.field1405 != var8) {
                    return;
                }
            }
            int var9 = arg1;
            if (arg1 < 3 && (class252.field4282[1][arg0][arg3] & 0x2) == 2) {
                var9 = arg1 + 1;
            }
            class30.method206(arg5, arg3, arg1, arg0, -118, class180.field3102[arg1], var9);
            if (arg2 >= 0) {
                boolean var10 = class55.field769;
                class55.field769 = true;
                class306.method2087(false, arg4, arg2, false, arg1, arg6 - 113, var9, arg3, class180.field3102[arg1], arg7, arg0);
                class55.field769 = var10;
            }
        }
        if (arg6 != 114) {
            method992(-73, -114, 89, 111, -38, -2, (byte) -1, 86);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 206)
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2689++;
        class7 var11 = this.method994(false);
        if (var11 != null) {
            var11.method41(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2674 = var11.method40();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ZB)Lgf;", line = 222)
    private final class7 method993(boolean arg0, byte arg1) {
        field2696++;
        boolean var3 = class65.field890 != class1.field12;
        class281 var4 = class254.method1722(0, this.field2697);
        if (var4.field4752 != null) {
            var4 = var4.method1873((byte) 40);
        }
        if (var4 == null) {
            if (!var3) {
                this.method995(0);
            }
            return null;
        }
        int var5 = this.field2685 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field4727;
            var7 = var4.field4754;
        } else {
            var6 = var4.field4754;
            var7 = var4.field4727;
        }
        int var8 = this.field2676 + (var7 + 1 >> 1);
        int var9 = (var6 + 1 >> 1) + this.field2683;
        int var10 = (var6 >> 1) + this.field2683;
        int var11 = (var7 >> 1) + this.field2676;
        this.method991(0, var10 * 128, var11 * 128);
        boolean var12 = !var3 && var4.field4755 && (this.field2678 != var4.field4693 || this.field2695 != this.field2691 && class23.field345 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class65.field890[this.field2679];
        int var14 = var13[var11][var10] + var13[var8][var10] - (-var13[var8][var9] + -var13[var11][var9]) >> 2;
        if (arg1 > -57) {
            method990(-101, -68, -15);
        }
        int var15 = (this.field2676 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        int var17 = (this.field2683 << 7) + (var6 << 6);
        if (var3) {
            var16 = class1.field12[0];
        } else if (this.field2679 < 3) {
            var16 = class65.field890[this.field2679 + 1];
        }
        if (var12) {
            class212.method1390(this.field2702, this.field2682, this.field2693, this.field2701);
        }
        boolean var18 = this.field2702 == null;
        class201 var19;
        if (this.field2684 == null) {
            var19 = var4.method1891(var12, this.field2677, (byte) -107, var16, var14, false, var17, var18 ? class174.field3009 : this.field2702, var13, this.field2685, var15);
        } else {
            var19 = var4.method1888(var14, var15, this.field2695, this.field2684, var12, var16, this.field2685, 102, var18 ? class174.field3009 : this.field2702, var13, this.field2677, var17);
        }
        if (var19 == null) {
            return null;
        }
        if (var12) {
            int var20 = 0;
            if (var18) {
                class174.field3009 = var19.field3431;
            }
            if (this.field2679 != 0) {
                int[][] var21 = class65.field890[0];
                var20 = var14 - (var21[var8][var9] + var21[var8][var10] + var21[var11][var10] + var21[var11][var9] >> 2);
            }
            class95 var22 = var19.field3431;
            if (this.field2672 && class212.method1397(var22, var15, var20, var17)) {
                this.field2672 = false;
            }
            if (!this.field2672) {
                class212.method1402(var22, var15, var20, var17);
                this.field2682 = var15;
                if (var18) {
                    class174.field3009 = null;
                }
                this.field2702 = var22;
                this.field2693 = var20;
                this.field2701 = var17;
            }
            this.field2691 = this.field2695;
            this.field2678 = var4.field4693;
        }
        return var19.field3441;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)Lgf;", line = 367)
    private final class7 method994(boolean arg0) {
        if (arg0) {
            return (class7) null;
        } else {
            field2694++;
            return this.method993(false, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 408)
    public final void method995(int arg0) {
        field2687++;
        if (this.field2702 != null) {
            class212.method1390(this.field2702, this.field2682, this.field2693, this.field2701);
        }
        this.field2691 = -1;
        if (arg0 == 0) {
            this.field2702 = null;
            this.field2678 = -1;
        }
    }
}
