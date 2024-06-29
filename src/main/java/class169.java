import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class169 extends class86 {

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "Z")
    private boolean field2616 = false;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public int field2612 = 0;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "B")
    public byte field2611 = 0;

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "I")
    public int field2650 = 0;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "[I")
    public int[] field2648;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "[I")
    public int[] field2644;

    @OriginalMember(owner = "client!gb", name = "qb", descriptor = "[I")
    public int[] field2655;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
    public int[] field2623;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    public int[] field2628;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[I")
    public int[] field2641;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "[I")
    public int[] field2627;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[B")
    public byte[] field2622;

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "[B")
    public byte[] field2652;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "[B")
    public byte[] field2606;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "[S")
    public short[] field2633;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[S")
    public short[] field2621;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "[B")
    public byte[] field2629;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "[I")
    public int[] field2610;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "[B")
    public byte[] field2620;

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "[S")
    public short[] field2647;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "[S")
    public short[] field2609;

    @OriginalMember(owner = "client!gb", name = "pb", descriptor = "[S")
    public short[] field2654;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "[S")
    public short[] field2651;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "[S")
    public short[] field2645;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "[S")
    public short[] field2614;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
    public byte[] field2608;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "[B")
    public byte[] field2630;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "[B")
    public byte[] field2640;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "[B")
    public byte[] field2615;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "[B")
    public byte[] field2632;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!gb", name = "rb", descriptor = "[S")
    public short[] field2656;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "[S")
    public short[] field2618;

    @OriginalMember(owner = "client!gb", name = "ob", descriptor = "[[I")
    public int[][] field2653;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[[I")
    public int[][] field2619;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "[Lhd;")
    public class121[] field2635;

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "[Lqj;")
    public class251[] field2649;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "[Lhd;")
    public class121[] field2646;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "S")
    public short field2642;

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "S")
    public short field2639;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "[I")
    private static int[] field2626 = class200.field3115;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    private static int field2631 = 0;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "[I")
    private static int[] field2634 = class200.field3104;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "[I")
    private static int[] field2624 = new int[10000];

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "[I")
    private static int[] field2638 = new int[10000];

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "S")
    private short field2607;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "S")
    private short field2613;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "S")
    private short field2617;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "S")
    private short field2636;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "S")
    private short field2637;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "S")
    private short field2643;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V", line = 5)
    public final void method1140() {
        for (int var1 = 0; var1 < this.field2650; var1++) {
            this.field2648[var1] = -this.field2648[var1];
            this.field2655[var1] = -this.field2655[var1];
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()V", line = 21)
    public static void method1141() {
        field2624 = null;
        field2638 = null;
        field2634 = null;
        field2626 = null;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()V", line = 31)
    public final void method1142() {
        for (int var1 = 0; var1 < this.field2650; var1++) {
            int var2 = this.field2648[var1];
            this.field2648[var1] = this.field2655[var1];
            this.field2655[var1] = -var2;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V", line = 51)
    private final void method1143(int arg0) {
        int var2 = field2634[arg0];
        int var3 = field2626[arg0];
        for (int var4 = 0; var4 < this.field2650; var4++) {
            int var5 = this.field2648[var4] * var3 + this.field2644[var4] * var2 >> 16;
            this.field2644[var4] = this.field2644[var4] * var3 - this.field2648[var4] * var2 >> 16;
            this.field2648[var4] = var5;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()V", line = 71)
    private final void method1144() {
        if (this.field2616) {
            return;
        }
        this.field2616 = true;
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        for (int var7 = 0; var7 < this.field2650; var7++) {
            int var8 = this.field2648[var7];
            int var9 = this.field2644[var7];
            int var10 = this.field2655[var7];
            if (var8 < var1) {
                var1 = var8;
            }
            if (var8 > var4) {
                var4 = var8;
            }
            if (var9 < var2) {
                var2 = var9;
            }
            if (var9 > var5) {
                var5 = var9;
            }
            if (var10 < var3) {
                var3 = var10;
            }
            if (var10 > var6) {
                var6 = var10;
            }
        }
        this.field2613 = (short) var1;
        this.field2636 = (short) var4;
        this.field2617 = (short) var2;
        this.field2607 = (short) var5;
        this.field2643 = (short) var3;
        this.field2637 = (short) var6;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(III)V", line = 134)
    public final void method1145(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2650; var4++) {
            this.field2648[var4] = this.field2648[var4] * arg0 / 128;
            this.field2644[var4] = this.field2644[var4] * arg1 / 128;
            this.field2655[var4] = this.field2655[var4] * arg2 / 128;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 2012)
    private class169() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V", line = 2014)
    private class169(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1154(arg0);
        } else {
            this.method1168(arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(III)V", line = 2021)
    public class169(int arg0, int arg1, int arg2) {
        this.field2648 = new int[arg0];
        this.field2644 = new int[arg0];
        this.field2655 = new int[arg0];
        this.field2623 = new int[arg0];
        this.field2628 = new int[arg1];
        this.field2641 = new int[arg1];
        this.field2627 = new int[arg1];
        this.field2622 = new byte[arg1];
        this.field2652 = new byte[arg1];
        this.field2606 = new byte[arg1];
        this.field2633 = new short[arg1];
        this.field2621 = new short[arg1];
        this.field2629 = new byte[arg1];
        this.field2610 = new int[arg1];
        if (arg2 > 0) {
            this.field2620 = new byte[arg2];
            this.field2647 = new short[arg2];
            this.field2609 = new short[arg2];
            this.field2654 = new short[arg2];
            this.field2651 = new short[arg2];
            this.field2645 = new short[arg2];
            this.field2614 = new short[arg2];
            this.field2608 = new byte[arg2];
            this.field2630 = new byte[arg2];
            this.field2640 = new byte[arg2];
            this.field2615 = new byte[arg2];
            this.field2632 = new byte[arg2];
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([Lgb;I)V", line = 2054)
    public class169(class169[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field2650 = 0;
        this.field2612 = 0;
        this.field2625 = 0;
        byte var9 = 0;
        byte var10 = 0;
        this.field2611 = -1;
        for (int var11 = 0; var11 < arg1; var11++) {
            class169 var12 = arg0[var11];
            if (var12 != null) {
                this.field2650 += var12.field2650;
                this.field2612 += var12.field2612;
                this.field2625 += var12.field2625;
                if (var12.field2652 == null) {
                    if (this.field2611 == -1) {
                        this.field2611 = var12.field2611;
                    }
                    if (this.field2611 != var12.field2611) {
                        var4 = true;
                    }
                } else {
                    var4 = true;
                }
                var3 |= var12.field2622 != null;
                var5 |= var12.field2606 != null;
                var6 |= var12.field2610 != null;
                var7 |= var12.field2621 != null;
                var8 |= var12.field2629 != null;
            }
        }
        this.field2648 = new int[this.field2650];
        this.field2644 = new int[this.field2650];
        this.field2655 = new int[this.field2650];
        this.field2623 = new int[this.field2650];
        this.field2656 = new short[this.field2650];
        this.field2628 = new int[this.field2612];
        this.field2641 = new int[this.field2612];
        this.field2627 = new int[this.field2612];
        if (var3) {
            this.field2622 = new byte[this.field2612];
        }
        if (var4) {
            this.field2652 = new byte[this.field2612];
        }
        if (var5) {
            this.field2606 = new byte[this.field2612];
        }
        if (var6) {
            this.field2610 = new int[this.field2612];
        }
        if (var7) {
            this.field2621 = new short[this.field2612];
        }
        if (var8) {
            this.field2629 = new byte[this.field2612];
        }
        if (var9 > 0) {
        }
        if (var10 > 0) {
        }
        this.field2633 = new short[this.field2612];
        this.field2618 = new short[this.field2612];
        if (this.field2625 > 0) {
            this.field2620 = new byte[this.field2625];
            this.field2647 = new short[this.field2625];
            this.field2609 = new short[this.field2625];
            this.field2654 = new short[this.field2625];
            this.field2651 = new short[this.field2625];
            this.field2645 = new short[this.field2625];
            this.field2614 = new short[this.field2625];
            this.field2608 = new byte[this.field2625];
            this.field2630 = new byte[this.field2625];
            this.field2640 = new byte[this.field2625];
            this.field2615 = new byte[this.field2625];
            this.field2632 = new byte[this.field2625];
        }
        this.field2650 = 0;
        this.field2612 = 0;
        this.field2625 = 0;
        boolean var13 = false;
        boolean var14 = false;
        for (int var15 = 0; var15 < arg1; var15++) {
            short var16 = (short) (0x1 << var15);
            class169 var17 = arg0[var15];
            if (var17 != null) {
                for (int var18 = 0; var18 < var17.field2612; var18++) {
                    if (var3 && var17.field2622 != null) {
                        this.field2622[this.field2612] = var17.field2622[var18];
                    }
                    if (var4) {
                        if (var17.field2652 == null) {
                            this.field2652[this.field2612] = var17.field2611;
                        } else {
                            this.field2652[this.field2612] = var17.field2652[var18];
                        }
                    }
                    if (var5 && var17.field2606 != null) {
                        this.field2606[this.field2612] = var17.field2606[var18];
                    }
                    if (var6 && var17.field2610 != null) {
                        this.field2610[this.field2612] = var17.field2610[var18];
                    }
                    if (var7) {
                        if (var17.field2621 == null) {
                            this.field2621[this.field2612] = -1;
                        } else {
                            this.field2621[this.field2612] = var17.field2621[var18];
                        }
                    }
                    if (var8) {
                        if (var17.field2629 == null || var17.field2629[var18] == -1) {
                            this.field2629[this.field2612] = -1;
                        } else {
                            this.field2629[this.field2612] = (byte) (var17.field2629[var18] + this.field2625);
                        }
                    }
                    this.field2633[this.field2612] = var17.field2633[var18];
                    this.field2618[this.field2612] = var16;
                    this.field2628[this.field2612] = this.method1146(var17, var17.field2628[var18], var16);
                    this.field2641[this.field2612] = this.method1146(var17, var17.field2641[var18], var16);
                    this.field2627[this.field2612] = this.method1146(var17, var17.field2627[var18], var16);
                    this.field2612++;
                }
                for (int var19 = 0; var19 < var17.field2625; var19++) {
                    byte var20 = this.field2620[this.field2625] = var17.field2620[var19];
                    if (var20 == 0) {
                        this.field2647[this.field2625] = (short) this.method1146(var17, var17.field2647[var19], var16);
                        this.field2609[this.field2625] = (short) this.method1146(var17, var17.field2609[var19], var16);
                        this.field2654[this.field2625] = (short) this.method1146(var17, var17.field2654[var19], var16);
                    }
                    if (var20 >= 1 && var20 <= 3) {
                        this.field2647[this.field2625] = var17.field2647[var19];
                        this.field2609[this.field2625] = var17.field2609[var19];
                        this.field2654[this.field2625] = var17.field2654[var19];
                        this.field2651[this.field2625] = var17.field2651[var19];
                        this.field2645[this.field2625] = var17.field2645[var19];
                        this.field2614[this.field2625] = var17.field2614[var19];
                        this.field2608[this.field2625] = var17.field2608[var19];
                        this.field2630[this.field2625] = var17.field2630[var19];
                        this.field2640[this.field2625] = var17.field2640[var19];
                    }
                    if (var20 == 2) {
                        this.field2615[this.field2625] = var17.field2615[var19];
                        this.field2632[this.field2625] = var17.field2632[var19];
                    }
                    this.field2625++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lgb;ZZZZ)V", line = 2286)
    public class169(class169 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field2650 = arg0.field2650;
        this.field2612 = arg0.field2612;
        this.field2625 = arg0.field2625;
        if (arg1) {
            this.field2648 = arg0.field2648;
            this.field2644 = arg0.field2644;
            this.field2655 = arg0.field2655;
        } else {
            this.field2648 = new int[this.field2650];
            this.field2644 = new int[this.field2650];
            this.field2655 = new int[this.field2650];
            for (int var6 = 0; var6 < this.field2650; var6++) {
                this.field2648[var6] = arg0.field2648[var6];
                this.field2644[var6] = arg0.field2644[var6];
                this.field2655[var6] = arg0.field2655[var6];
            }
        }
        if (arg2) {
            this.field2633 = arg0.field2633;
        } else {
            this.field2633 = new short[this.field2612];
            for (int var7 = 0; var7 < this.field2612; var7++) {
                this.field2633[var7] = arg0.field2633[var7];
            }
        }
        if (arg3 || arg0.field2621 == null) {
            this.field2621 = arg0.field2621;
        } else {
            this.field2621 = new short[this.field2612];
            for (int var8 = 0; var8 < this.field2612; var8++) {
                this.field2621[var8] = arg0.field2621[var8];
            }
        }
        if (arg4) {
            this.field2606 = arg0.field2606;
        } else {
            this.field2606 = new byte[this.field2612];
            if (arg0.field2606 == null) {
                for (int var9 = 0; var9 < this.field2612; var9++) {
                    this.field2606[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field2612; var10++) {
                    this.field2606[var10] = arg0.field2606[var10];
                }
            }
        }
        this.field2628 = arg0.field2628;
        this.field2641 = arg0.field2641;
        this.field2627 = arg0.field2627;
        this.field2622 = arg0.field2622;
        this.field2652 = arg0.field2652;
        this.field2629 = arg0.field2629;
        this.field2611 = arg0.field2611;
        this.field2620 = arg0.field2620;
        this.field2647 = arg0.field2647;
        this.field2609 = arg0.field2609;
        this.field2654 = arg0.field2654;
        this.field2651 = arg0.field2651;
        this.field2645 = arg0.field2645;
        this.field2614 = arg0.field2614;
        this.field2608 = arg0.field2608;
        this.field2630 = arg0.field2630;
        this.field2640 = arg0.field2640;
        this.field2615 = arg0.field2615;
        this.field2632 = arg0.field2632;
        this.field2623 = arg0.field2623;
        this.field2610 = arg0.field2610;
        this.field2653 = arg0.field2653;
        this.field2619 = arg0.field2619;
        this.field2635 = arg0.field2635;
        this.field2649 = arg0.field2649;
        this.field2646 = arg0.field2646;
        this.field2642 = arg0.field2642;
        this.field2639 = arg0.field2639;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)Lth;", line = 151)
    public final class86 method669(int arg0, int arg1, int arg2) {
        return this.method1159(this.field2642, this.field2639, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lgb;IS)I", line = 157)
    private final int method1146(class169 arg0, int arg1, short arg2) {
        int var4 = arg0.field2648[arg1];
        int var5 = arg0.field2644[arg1];
        int var6 = arg0.field2655[arg1];
        for (int var7 = 0; var7 < this.field2650; var7++) {
            if (this.field2648[var7] == var4 && this.field2644[var7] == var5 && this.field2655[var7] == var6) {
                this.field2656[var7] |= arg2;
                return var7;
            }
        }
        this.field2648[this.field2650] = var4;
        this.field2644[this.field2650] = var5;
        this.field2655[this.field2650] = var6;
        this.field2656[this.field2650] = arg2;
        if (arg0.field2623 != null) {
            this.field2623[this.field2650] = arg0.field2623[arg1];
        }
        return this.field2650++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([[IIIIII)V", line = 188)
    private final void method1147(int[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var7 = false;
        boolean var8 = false;
        boolean var9 = false;
        int var10 = -arg4 / 2;
        int var11 = -arg5 / 2;
        int var12 = method1160(arg0, arg1 + var10, arg3 + var11);
        int var13 = arg4 / 2;
        int var14 = -arg5 / 2;
        int var15 = method1160(arg0, arg1 + var13, arg3 + var14);
        int var16 = -arg4 / 2;
        int var17 = arg5 / 2;
        int var18 = method1160(arg0, arg1 + var16, arg3 + var17);
        int var19 = arg4 / 2;
        int var20 = arg5 / 2;
        int var21 = method1160(arg0, arg1 + var19, arg3 + var20);
        int var22 = var12 < var15 ? var12 : var15;
        int var23 = var18 < var21 ? var18 : var21;
        int var24 = var15 < var21 ? var15 : var21;
        int var25 = var12 < var18 ? var12 : var18;
        if (arg5 != 0) {
            int var26 = (int) (Math.atan2((double) (var22 - var23), (double) arg5) * 325.95D) & 0x7FF;
            if (var26 != 0) {
                this.method1157(var26);
            }
        }
        if (arg4 != 0) {
            int var27 = (int) (Math.atan2((double) (var25 - var24), (double) arg4) * 325.95D) & 0x7FF;
            if (var27 != 0) {
                this.method1143(var27);
            }
        }
        int var28 = var12 + var21;
        if (var15 + var18 < var28) {
            var28 = var15 + var18;
        }
        int var29 = (var28 >> 1) - arg2;
        if (var29 != 0) {
            this.method1152(0, var29, 0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 252)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "()V", line = 262)
    public final void method1148() {
        if (this.field2635 != null) {
            return;
        }
        this.field2635 = new class121[this.field2650];
        for (int var1 = 0; var1 < this.field2650; var1++) {
            this.field2635[var1] = new class121();
        }
        for (int var2 = 0; var2 < this.field2612; var2++) {
            int var3 = this.field2628[var2];
            int var4 = this.field2641[var2];
            int var5 = this.field2627[var2];
            int var6 = this.field2648[var4] - this.field2648[var3];
            int var7 = this.field2644[var4] - this.field2644[var3];
            int var8 = this.field2655[var4] - this.field2655[var3];
            int var9 = this.field2648[var5] - this.field2648[var3];
            int var10 = this.field2644[var5] - this.field2644[var3];
            int var11 = this.field2655[var5] - this.field2655[var3];
            int var12 = var7 * var11 - var8 * var10;
            int var13 = var8 * var9 - var6 * var11;
            int var14;
            for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 0x1) {
                var12 >>= 0x1;
                var13 >>= 0x1;
            }
            int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
            if (var15 <= 0) {
                var15 = 1;
            }
            int var16 = var12 * 256 / var15;
            int var17 = var13 * 256 / var15;
            int var18 = var14 * 256 / var15;
            byte var19;
            if (this.field2622 == null) {
                var19 = 0;
            } else {
                var19 = this.field2622[var2];
            }
            if (var19 == 0) {
                class121 var20 = this.field2635[var3];
                var20.field1897 += var16;
                var20.field1885 += var17;
                var20.field1896 += var18;
                var20.field1887++;
                class121 var21 = this.field2635[var4];
                var21.field1897 += var16;
                var21.field1885 += var17;
                var21.field1896 += var18;
                var21.field1887++;
                class121 var22 = this.field2635[var5];
                var22.field1897 += var16;
                var22.field1885 += var17;
                var22.field1896 += var18;
                var22.field1887++;
            } else if (var19 == 1) {
                if (this.field2649 == null) {
                    this.field2649 = new class251[this.field2612];
                }
                class251 var23 = this.field2649[var2] = new class251();
                var23.field4102 = var16;
                var23.field4103 = var17;
                var23.field4100 = var18;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(SS)V", line = 361)
    public final void method1149(short arg0, short arg1) {
        if (this.field2621 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field2612; var3++) {
            if (this.field2621[var3] == arg0) {
                this.field2621[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[[I[[IIIIZZ)Lgb;", line = 379)
    public final class169 method1150(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        this.method1144();
        int var10 = this.field2613 + arg4;
        int var11 = this.field2636 + arg4;
        int var12 = this.field2643 + arg6;
        int var13 = this.field2637 + arg6;
        if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (var10 < 0 || var11 + 128 >> 7 >= arg2.length || var12 < 0 || var13 + 128 >> 7 >= arg2[0].length)) {
            return this;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return this;
            }
            if (var10 < 0 || var11 + 128 >> 7 >= arg3.length || var12 < 0 || var13 + 128 >> 7 >= arg3[0].length) {
                return this;
            }
        } else {
            int var14 = var10 >> 7;
            int var15 = var11 + 127 >> 7;
            int var16 = var12 >> 7;
            int var17 = var13 + 127 >> 7;
            if (arg2[var14][var16] == arg5 && arg2[var15][var16] == arg5 && arg2[var14][var17] == arg5 && arg2[var15][var17] == arg5) {
                return this;
            }
        }
        class169 var18;
        if (arg7) {
            var18 = new class169();
            var18.field2650 = this.field2650;
            var18.field2612 = this.field2612;
            var18.field2625 = this.field2625;
            var18.field2628 = this.field2628;
            var18.field2641 = this.field2641;
            var18.field2627 = this.field2627;
            var18.field2622 = this.field2622;
            var18.field2652 = this.field2652;
            var18.field2606 = this.field2606;
            var18.field2629 = this.field2629;
            var18.field2633 = this.field2633;
            var18.field2621 = this.field2621;
            var18.field2611 = this.field2611;
            var18.field2620 = this.field2620;
            var18.field2647 = this.field2647;
            var18.field2609 = this.field2609;
            var18.field2654 = this.field2654;
            var18.field2651 = this.field2651;
            var18.field2645 = this.field2645;
            var18.field2614 = this.field2614;
            var18.field2608 = this.field2608;
            var18.field2630 = this.field2630;
            var18.field2640 = this.field2640;
            var18.field2615 = this.field2615;
            var18.field2632 = this.field2632;
            var18.field2623 = this.field2623;
            var18.field2610 = this.field2610;
            var18.field2653 = this.field2653;
            var18.field2619 = this.field2619;
            var18.field2642 = this.field2642;
            var18.field2639 = this.field2639;
            var18.field2635 = this.field2635;
            var18.field2649 = this.field2649;
            var18.field2646 = this.field2646;
            if (arg0 == 3) {
                var18.field2648 = class64.method480(this.field2648, 2);
                var18.field2644 = class64.method480(this.field2644, 2);
                var18.field2655 = class64.method480(this.field2655, 2);
            } else {
                var18.field2648 = this.field2648;
                var18.field2644 = new int[var18.field2650];
                var18.field2655 = this.field2655;
            }
        } else {
            var18 = this;
        }
        if (arg0 == 1) {
            for (int var19 = 0; var19 < var18.field2650; var19++) {
                int var20 = this.field2648[var19] + arg4;
                int var21 = this.field2655[var19] + arg6;
                int var22 = var20 & 0x7F;
                int var23 = var21 & 0x7F;
                int var24 = var20 >> 7;
                int var25 = var21 >> 7;
                int var26 = (128 - var22) * arg2[var24][var25] + arg2[var24 + 1][var25] * var22 >> 7;
                int var27 = (128 - var22) * arg2[var24][var25 + 1] + arg2[var24 + 1][var25 + 1] * var22 >> 7;
                int var28 = (128 - var23) * var26 + var23 * var27 >> 7;
                var18.field2644[var19] = this.field2644[var19] + var28 - arg5;
            }
        } else if (arg0 == 2) {
            for (int var29 = 0; var29 < var18.field2650; var29++) {
                int var30 = (this.field2644[var29] << 16) / this.field2617;
                if (var30 < arg1) {
                    int var31 = this.field2648[var29] + arg4;
                    int var32 = this.field2655[var29] + arg6;
                    int var33 = var31 & 0x7F;
                    int var34 = var32 & 0x7F;
                    int var35 = var31 >> 7;
                    int var36 = var32 >> 7;
                    int var37 = (128 - var33) * arg2[var35][var36] + arg2[var35 + 1][var36] * var33 >> 7;
                    int var38 = (128 - var33) * arg2[var35][var36 + 1] + arg2[var35 + 1][var36 + 1] * var33 >> 7;
                    int var39 = (128 - var34) * var37 + var34 * var38 >> 7;
                    var18.field2644[var29] = (arg1 - var30) * (var39 - arg5) / arg1 + this.field2644[var29];
                } else {
                    var18.field2644[var29] = this.field2644[var29];
                }
            }
        } else if (arg0 == 3) {
            int var40 = (arg1 & 0xFF) * 4;
            int var41 = (arg1 >> 8 & 0xFF) * 4;
            this.method1147(arg2, arg4, arg5, arg6, var40, var41);
        } else if (arg0 == 4) {
            int var42 = this.field2607 - this.field2617;
            for (int var43 = 0; var43 < this.field2650; var43++) {
                int var44 = this.field2648[var43] + arg4;
                int var45 = this.field2655[var43] + arg6;
                int var46 = var44 & 0x7F;
                int var47 = var45 & 0x7F;
                int var48 = var44 >> 7;
                int var49 = var45 >> 7;
                int var50 = (128 - var46) * arg3[var48][var49] + arg3[var48 + 1][var49] * var46 >> 7;
                int var51 = (128 - var46) * arg3[var48][var49 + 1] + arg3[var48 + 1][var49 + 1] * var46 >> 7;
                int var52 = (128 - var47) * var50 + var47 * var51 >> 7;
                var18.field2644[var43] = var52 + this.field2644[var43] + var42 - arg5;
            }
        } else if (arg0 == 5) {
            int var53 = this.field2607 - this.field2617;
            for (int var54 = 0; var54 < this.field2650; var54++) {
                int var55 = this.field2648[var54] + arg4;
                int var56 = this.field2655[var54] + arg6;
                int var57 = var55 & 0x7F;
                int var58 = var56 & 0x7F;
                int var59 = var55 >> 7;
                int var60 = var56 >> 7;
                int var61 = (128 - var57) * arg2[var59][var60] + arg2[var59 + 1][var60] * var57 >> 7;
                int var62 = (128 - var57) * arg2[var59][var60 + 1] + arg2[var59 + 1][var60 + 1] * var57 >> 7;
                int var63 = (128 - var58) * var61 + var58 * var62 >> 7;
                int var64 = (128 - var57) * arg3[var59][var60] + arg3[var59 + 1][var60] * var57 >> 7;
                int var65 = (128 - var57) * arg3[var59][var60 + 1] + arg3[var59 + 1][var60 + 1] * var57 >> 7;
                int var66 = (128 - var58) * var64 + var58 * var65 >> 7;
                int var67 = var63 - var66;
                var18.field2644[var54] = ((this.field2644[var54] << 8) / var53 * var67 >> 8) - (arg5 - var63);
            }
        }
        if (arg8) {
            var18.method1158();
        } else {
            this.field2616 = false;
        }
        return var18;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)Lw;", line = 639)
    public final class270 method1151(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class270(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V", line = 646)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)V", line = 650)
    public final void method1152(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2650; var4++) {
            this.field2648[var4] += arg0;
            this.field2644[var4] += arg1;
            this.field2655[var4] += arg2;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "()V", line = 666)
    public final void method1153() {
        for (int var1 = 0; var1 < this.field2650; var1++) {
            this.field2655[var1] = -this.field2655[var1];
        }
        for (int var2 = 0; var2 < this.field2612; var2++) {
            int var3 = this.field2628[var2];
            this.field2628[var2] = this.field2627[var2];
            this.field2627[var2] = var3;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()Z", line = 686)
    public final boolean method673() {
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V", line = 690)
    private final void method1154(byte[] arg0) {
        class82 var2 = new class82(arg0);
        class82 var3 = new class82(arg0);
        class82 var4 = new class82(arg0);
        class82 var5 = new class82(arg0);
        class82 var6 = new class82(arg0);
        class82 var7 = new class82(arg0);
        class82 var8 = new class82(arg0);
        var2.field1301 = arg0.length - 23;
        int var9 = var2.method576(1);
        int var10 = var2.method576(1);
        int var11 = var2.method642((byte) -100);
        int var12 = var2.method642((byte) -35);
        boolean var13 = (var12 & 0x1) == 1;
        boolean var14 = (var12 & 0x2) == 2;
        int var15 = var2.method642((byte) -35);
        int var16 = var2.method642((byte) -99);
        int var17 = var2.method642((byte) -25);
        int var18 = var2.method642((byte) -73);
        int var19 = var2.method642((byte) -94);
        int var20 = var2.method576(1);
        int var21 = var2.method576(1);
        int var22 = var2.method576(1);
        int var23 = var2.method576(1);
        int var24 = var2.method576(1);
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        if (var11 > 0) {
            this.field2620 = new byte[var11];
            var2.field1301 = 0;
            for (int var28 = 0; var28 < var11; var28++) {
                byte var29 = this.field2620[var28] = var2.method599(false);
                if (var29 == 0) {
                    var25++;
                }
                if (var29 >= 1 && var29 <= 3) {
                    var26++;
                }
                if (var29 == 2) {
                    var27++;
                }
            }
        }
        int var32 = var9 + var11;
        int var33 = var32;
        if (var13) {
            var32 += var10;
        }
        int var35 = var10 + var32;
        int var36 = var35;
        if (var15 == 255) {
            var35 += var10;
        }
        int var37 = var35;
        if (var17 == 1) {
            var35 += var10;
        }
        int var38 = var35;
        if (var19 == 1) {
            var35 += var9;
        }
        int var39 = var35;
        if (var16 == 1) {
            var35 += var10;
        }
        int var41 = var23 + var35;
        int var42 = var41;
        if (var18 == 1) {
            var41 += var10 * 2;
        }
        int var44 = var24 + var41;
        int var46 = var10 * 2 + var44;
        int var48 = var20 + var46;
        int var50 = var21 + var48;
        int var52 = var22 + var50;
        int var54 = var25 * 6 + var52;
        int var56 = var26 * 6 + var54;
        int var58 = var26 * 6 + var56;
        int var60 = var26 + var58;
        int var62 = var26 + var60;
        int var64 = var27 * 2 + var26 + var62;
        this.field2650 = var9;
        this.field2612 = var10;
        this.field2625 = var11;
        this.field2648 = new int[var9];
        this.field2644 = new int[var9];
        this.field2655 = new int[var9];
        this.field2628 = new int[var10];
        this.field2641 = new int[var10];
        this.field2627 = new int[var10];
        if (var19 == 1) {
            this.field2623 = new int[var9];
        }
        if (var13) {
            this.field2622 = new byte[var10];
        }
        if (var15 == 255) {
            this.field2652 = new byte[var10];
        } else {
            this.field2611 = (byte) var15;
        }
        if (var16 == 1) {
            this.field2606 = new byte[var10];
        }
        if (var17 == 1) {
            this.field2610 = new int[var10];
        }
        if (var18 == 1) {
            this.field2621 = new short[var10];
        }
        if (var18 == 1 && var11 > 0) {
            this.field2629 = new byte[var10];
        }
        this.field2633 = new short[var10];
        if (var11 > 0) {
            this.field2647 = new short[var11];
            this.field2609 = new short[var11];
            this.field2654 = new short[var11];
            if (var26 > 0) {
                this.field2651 = new short[var26];
                this.field2645 = new short[var26];
                this.field2614 = new short[var26];
                this.field2608 = new byte[var26];
                this.field2630 = new byte[var26];
                this.field2640 = new byte[var26];
            }
            if (var27 > 0) {
                this.field2615 = new byte[var27];
                this.field2632 = new byte[var27];
            }
        }
        var2.field1301 = var11;
        var3.field1301 = var46;
        var4.field1301 = var48;
        var5.field1301 = var50;
        var6.field1301 = var38;
        int var66 = 0;
        int var67 = 0;
        int var68 = 0;
        for (int var69 = 0; var69 < var9; var69++) {
            int var70 = var2.method642((byte) -28);
            int var71 = 0;
            if ((var70 & 0x1) != 0) {
                var71 = var3.method636(-21208);
            }
            int var72 = 0;
            if ((var70 & 0x2) != 0) {
                var72 = var4.method636(-21208);
            }
            int var73 = 0;
            if ((var70 & 0x4) != 0) {
                var73 = var5.method636(-21208);
            }
            this.field2648[var69] = var66 + var71;
            this.field2644[var69] = var67 + var72;
            this.field2655[var69] = var68 + var73;
            var66 = this.field2648[var69];
            var67 = this.field2644[var69];
            var68 = this.field2655[var69];
            if (var19 == 1) {
                this.field2623[var69] = var6.method642((byte) -32);
            }
        }
        var2.field1301 = var44;
        var3.field1301 = var33;
        var4.field1301 = var36;
        var5.field1301 = var39;
        var6.field1301 = var37;
        var7.field1301 = var42;
        var8.field1301 = var41;
        for (int var74 = 0; var74 < var10; var74++) {
            this.field2633[var74] = (short) var2.method576(1);
            if (var13) {
                this.field2622[var74] = var3.method599(false);
            }
            if (var15 == 255) {
                this.field2652[var74] = var4.method599(false);
            }
            if (var16 == 1) {
                this.field2606[var74] = var5.method599(false);
            }
            if (var17 == 1) {
                this.field2610[var74] = var6.method642((byte) -115);
            }
            if (var18 == 1) {
                this.field2621[var74] = (short) (var7.method576(1) - 1);
            }
            if (this.field2629 != null) {
                if (this.field2621[var74] == -1) {
                    this.field2629[var74] = -1;
                } else {
                    this.field2629[var74] = (byte) (var8.method642((byte) -28) - 1);
                }
            }
        }
        var2.field1301 = var35;
        var3.field1301 = var32;
        int var75 = 0;
        int var76 = 0;
        int var77 = 0;
        int var78 = 0;
        for (int var79 = 0; var79 < var10; var79++) {
            int var80 = var3.method642((byte) -83);
            if (var80 == 1) {
                var75 = var2.method636(-21208) + var78;
                var76 = var2.method636(-21208) + var75;
                var77 = var2.method636(-21208) + var76;
                var78 = var77;
                this.field2628[var79] = var75;
                this.field2641[var79] = var76;
                this.field2627[var79] = var77;
            }
            if (var80 == 2) {
                var76 = var77;
                var77 = var2.method636(-21208) + var78;
                var78 = var77;
                this.field2628[var79] = var75;
                this.field2641[var79] = var76;
                this.field2627[var79] = var77;
            }
            if (var80 == 3) {
                var75 = var77;
                var77 = var2.method636(-21208) + var78;
                var78 = var77;
                this.field2628[var79] = var75;
                this.field2641[var79] = var76;
                this.field2627[var79] = var77;
            }
            if (var80 == 4) {
                int var83 = var75;
                var75 = var76;
                var76 = var83;
                var77 = var2.method636(-21208) + var78;
                var78 = var77;
                this.field2628[var79] = var75;
                this.field2641[var79] = var83;
                this.field2627[var79] = var77;
            }
        }
        var2.field1301 = var52;
        var3.field1301 = var54;
        var4.field1301 = var56;
        var5.field1301 = var58;
        var6.field1301 = var60;
        var7.field1301 = var62;
        for (int var84 = 0; var84 < var11; var84++) {
            int var85 = this.field2620[var84] & 0xFF;
            if (var85 == 0) {
                this.field2647[var84] = (short) var2.method576(1);
                this.field2609[var84] = (short) var2.method576(1);
                this.field2654[var84] = (short) var2.method576(1);
            }
            if (var85 == 1) {
                this.field2647[var84] = (short) var3.method576(1);
                this.field2609[var84] = (short) var3.method576(1);
                this.field2654[var84] = (short) var3.method576(1);
                this.field2651[var84] = (short) var4.method576(1);
                this.field2645[var84] = (short) var4.method576(1);
                this.field2614[var84] = (short) var4.method576(1);
                this.field2608[var84] = var5.method599(false);
                this.field2630[var84] = var6.method599(false);
                this.field2640[var84] = var7.method599(false);
            }
            if (var85 == 2) {
                this.field2647[var84] = (short) var3.method576(1);
                this.field2609[var84] = (short) var3.method576(1);
                this.field2654[var84] = (short) var3.method576(1);
                this.field2651[var84] = (short) var4.method576(1);
                this.field2645[var84] = (short) var4.method576(1);
                this.field2614[var84] = (short) var4.method576(1);
                this.field2608[var84] = var5.method599(false);
                this.field2630[var84] = var6.method599(false);
                this.field2640[var84] = var7.method599(false);
                this.field2615[var84] = var7.method599(false);
                this.field2632[var84] = var7.method599(false);
            }
            if (var85 == 3) {
                this.field2647[var84] = (short) var3.method576(1);
                this.field2609[var84] = (short) var3.method576(1);
                this.field2654[var84] = (short) var3.method576(1);
                this.field2651[var84] = (short) var4.method576(1);
                this.field2645[var84] = (short) var4.method576(1);
                this.field2614[var84] = (short) var4.method576(1);
                this.field2608[var84] = var5.method599(false);
                this.field2630[var84] = var6.method599(false);
                this.field2640[var84] = var7.method599(false);
            }
        }
        if (!var14) {
            return;
        }
        var2.field1301 = var64;
        int var86 = var2.method642((byte) -53);
        if (var86 > 0) {
            var2.field1301 += var86 * 4;
        }
        int var87 = var2.method642((byte) -42);
        if (var87 > 0) {
            var2.field1301 += var87 * 4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "()Lgb;", line = 1143)
    public final class169 method1155() {
        class169 var1 = new class169();
        if (this.field2622 != null) {
            var1.field2622 = new byte[this.field2612];
            for (int var2 = 0; var2 < this.field2612; var2++) {
                var1.field2622[var2] = this.field2622[var2];
            }
        }
        var1.field2650 = this.field2650;
        var1.field2612 = this.field2612;
        var1.field2625 = this.field2625;
        var1.field2648 = this.field2648;
        var1.field2644 = this.field2644;
        var1.field2655 = this.field2655;
        var1.field2628 = this.field2628;
        var1.field2641 = this.field2641;
        var1.field2627 = this.field2627;
        var1.field2652 = this.field2652;
        var1.field2606 = this.field2606;
        var1.field2629 = this.field2629;
        var1.field2633 = this.field2633;
        var1.field2621 = this.field2621;
        var1.field2611 = this.field2611;
        var1.field2620 = this.field2620;
        var1.field2647 = this.field2647;
        var1.field2609 = this.field2609;
        var1.field2654 = this.field2654;
        var1.field2651 = this.field2651;
        var1.field2645 = this.field2645;
        var1.field2614 = this.field2614;
        var1.field2608 = this.field2608;
        var1.field2630 = this.field2630;
        var1.field2640 = this.field2640;
        var1.field2615 = this.field2615;
        var1.field2632 = this.field2632;
        var1.field2623 = this.field2623;
        var1.field2610 = this.field2610;
        var1.field2653 = this.field2653;
        var1.field2619 = this.field2619;
        var1.field2635 = this.field2635;
        var1.field2649 = this.field2649;
        var1.field2642 = this.field2642;
        var1.field2639 = this.field2639;
        return var1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBSB)I", line = 1199)
    public final int method1156(int arg0, int arg1, int arg2, byte arg3, short arg4, byte arg5) {
        this.field2628[this.field2612] = arg0;
        this.field2641[this.field2612] = arg1;
        this.field2627[this.field2612] = arg2;
        this.field2622[this.field2612] = arg3;
        this.field2629[this.field2612] = -1;
        this.field2633[this.field2612] = arg4;
        this.field2621[this.field2612] = -1;
        this.field2606[this.field2612] = arg5;
        return this.field2612++;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V", line = 1227)
    private final void method1157(int arg0) {
        int var2 = field2634[arg0];
        int var3 = field2626[arg0];
        for (int var4 = 0; var4 < this.field2650; var4++) {
            int var5 = this.field2644[var4] * var3 - this.field2655[var4] * var2 >> 16;
            this.field2655[var4] = this.field2655[var4] * var3 + this.field2644[var4] * var2 >> 16;
            this.field2644[var4] = var5;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "()V", line = 1246)
    private final void method1158() {
        this.field2635 = null;
        this.field2646 = null;
        this.field2649 = null;
        this.field2616 = false;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIII)Lak;", line = 1254)
    public final class311 method1159(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class255.field4184) {
            class239 var6 = new class239(this, arg0, arg1, true);
            var6.method1610();
            return var6;
        } else {
            return new class270(this, arg0, arg1, arg2, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([[III)I", line = 1268)
    private static final int method1160(int[][] arg0, int arg1, int arg2) {
        int var3 = arg1 >> 7;
        int var4 = arg2 >> 7;
        if (var3 < 0 || var4 < 0 || var3 >= arg0.length || var4 >= arg0[0].length) {
            return 0;
        }
        int var5 = arg1 & 0x7F;
        int var6 = arg2 & 0x7F;
        int var7 = (128 - var5) * arg0[var3][var4] + arg0[var3 + 1][var4] * var5 >> 7;
        int var8 = (128 - var5) * arg0[var3][var4 + 1] + arg0[var3 + 1][var4 + 1] * var5 >> 7;
        return (128 - var6) * var7 + var6 * var8 >> 7;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()I", line = 1288)
    public final int method679() {
        if (!this.field2616) {
            this.method1144();
        }
        return this.field2617;
    }

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "()V", line = 1295)
    public final void method1161() {
        this.field2623 = null;
        this.field2610 = null;
        this.field2653 = (int[][]) null;
        this.field2619 = (int[][]) null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lth;IIIZ)V", line = 1312)
    public final void method674(class86 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class169 var6 = (class169) arg0;
        var6.method1144();
        var6.method1148();
        field2631++;
        int var7 = 0;
        int[] var8 = var6.field2648;
        int var9 = var6.field2650;
        for (int var10 = 0; var10 < this.field2650; var10++) {
            class121 var11 = this.field2635[var10];
            if (var11.field1887 != 0) {
                int var12 = this.field2644[var10] - arg2;
                if (var12 >= var6.field2617 && var12 <= var6.field2607) {
                    int var13 = this.field2648[var10] - arg1;
                    if (var13 >= var6.field2613 && var13 <= var6.field2636) {
                        int var14 = this.field2655[var10] - arg3;
                        if (var14 >= var6.field2643 && var14 <= var6.field2637) {
                            for (int var15 = 0; var15 < var9; var15++) {
                                class121 var16 = var6.field2635[var15];
                                if (var8[var15] == var13 && var6.field2655[var15] == var14 && var6.field2644[var15] == var12 && var16.field1887 != 0) {
                                    if (this.field2646 == null) {
                                        this.field2646 = new class121[this.field2650];
                                    }
                                    if (var6.field2646 == null) {
                                        var6.field2646 = new class121[var9];
                                    }
                                    class121 var17 = this.field2646[var10];
                                    if (var17 == null) {
                                        var17 = this.field2646[var10] = new class121(var11);
                                    }
                                    class121 var18 = var6.field2646[var15];
                                    if (var18 == null) {
                                        var18 = var6.field2646[var15] = new class121(var16);
                                    }
                                    var17.field1897 += var16.field1897;
                                    var17.field1885 += var16.field1885;
                                    var17.field1896 += var16.field1896;
                                    var17.field1887 += var16.field1887;
                                    var18.field1897 += var11.field1897;
                                    var18.field1885 += var11.field1885;
                                    var18.field1896 += var11.field1896;
                                    var18.field1887 += var11.field1887;
                                    var7++;
                                    field2624[var10] = field2631;
                                    field2638[var15] = field2631;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var7 < 3 || !arg4) {
            return;
        }
        for (int var19 = 0; var19 < this.field2612; var19++) {
            if (field2624[this.field2628[var19]] == field2631 && field2624[this.field2641[var19]] == field2631 && field2624[this.field2627[var19]] == field2631) {
                if (this.field2622 == null) {
                    this.field2622 = new byte[this.field2612];
                }
                this.field2622[var19] = 2;
            }
        }
        for (int var20 = 0; var20 < var6.field2612; var20++) {
            if (field2638[var6.field2628[var20]] == field2631 && field2638[var6.field2641[var20]] == field2631 && field2638[var6.field2627[var20]] == field2631) {
                if (var6.field2622 == null) {
                    var6.field2622 = new byte[var6.field2612];
                }
                var6.field2622[var20] = 2;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V", line = 1429)
    public final void method1162(int arg0) {
        int var2 = field2634[arg0];
        int var3 = field2626[arg0];
        for (int var4 = 0; var4 < this.field2650; var4++) {
            int var5 = this.field2655[var4] * var2 + this.field2648[var4] * var3 >> 16;
            this.field2655[var4] = this.field2655[var4] * var3 - this.field2648[var4] * var2 >> 16;
            this.field2648[var4] = var5;
        }
        this.method1158();
    }

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "()V", line = 1452)
    public final void method1163() {
        int var10002;
        if (this.field2623 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field2650; var3++) {
                int var4 = this.field2623[var3];
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field2653 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field2653[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field2650) {
                int var7 = this.field2623[var6];
                this.field2653[var7][var1[var7]++] = var6++;
            }
            this.field2623 = null;
        }
        if (this.field2610 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field2612; var10++) {
            int var11 = this.field2610[var10];
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field2619 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field2619[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field2612) {
            int var14 = this.field2610[var13];
            this.field2619[var14][var8[var14]++] = var13++;
        }
        this.field2610 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(III)V", line = 1546)
    public final void method1164(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            int var4 = field2634[arg2];
            int var5 = field2626[arg2];
            for (int var6 = 0; var6 < this.field2650; var6++) {
                int var7 = this.field2648[var6] * var5 + this.field2644[var6] * var4 >> 16;
                this.field2644[var6] = this.field2644[var6] * var5 - this.field2648[var6] * var4 >> 16;
                this.field2648[var6] = var7;
            }
        }
        if (arg0 != 0) {
            int var8 = field2634[arg0];
            int var9 = field2626[arg0];
            for (int var10 = 0; var10 < this.field2650; var10++) {
                int var11 = this.field2644[var10] * var9 - this.field2655[var10] * var8 >> 16;
                this.field2655[var10] = this.field2655[var10] * var9 + this.field2644[var10] * var8 >> 16;
                this.field2644[var10] = var11;
            }
        }
        if (arg1 == 0) {
            return;
        }
        int var12 = field2634[arg1];
        int var13 = field2626[arg1];
        for (int var14 = 0; var14 < this.field2650; var14++) {
            int var15 = this.field2655[var14] * var12 + this.field2648[var14] * var13 >> 16;
            this.field2655[var14] = this.field2655[var14] * var13 - this.field2648[var14] * var12 >> 16;
            this.field2648[var14] = var15;
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(III)I", line = 1611)
    public final int method1165(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2650; var4++) {
            if (this.field2648[var4] == arg0 && this.field2644[var4] == arg1 && this.field2655[var4] == arg2) {
                return var4;
            }
        }
        this.field2648[this.field2650] = arg0;
        this.field2644[this.field2650] = arg1;
        this.field2655[this.field2650] = arg2;
        return this.field2650++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lve;II)Lgb;", line = 1628)
    public static final class169 method1166(class266 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1889(arg1, (byte) -122, arg2);
        return var3 == null ? null : new class169(var3);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(SS)V", line = 1637)
    public final void method1167(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field2612; var3++) {
            if (this.field2633[var3] == arg0) {
                this.field2633[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "([B)V", line = 1657)
    private final void method1168(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class82 var4 = new class82(arg0);
        class82 var5 = new class82(arg0);
        class82 var6 = new class82(arg0);
        class82 var7 = new class82(arg0);
        class82 var8 = new class82(arg0);
        var4.field1301 = arg0.length - 18;
        int var9 = var4.method576(1);
        int var10 = var4.method576(1);
        int var11 = var4.method642((byte) -61);
        int var12 = var4.method642((byte) -24);
        int var13 = var4.method642((byte) -114);
        int var14 = var4.method642((byte) -73);
        int var15 = var4.method642((byte) -77);
        int var16 = var4.method642((byte) -47);
        int var17 = var4.method576(1);
        int var18 = var4.method576(1);
        int var19 = var4.method576(1);
        int var20 = var4.method576(1);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field2650 = var9;
        this.field2612 = var10;
        this.field2625 = var11;
        this.field2648 = new int[var9];
        this.field2644 = new int[var9];
        this.field2655 = new int[var9];
        this.field2628 = new int[var10];
        this.field2641 = new int[var10];
        this.field2627 = new int[var10];
        if (var11 > 0) {
            this.field2620 = new byte[var11];
            this.field2647 = new short[var11];
            this.field2609 = new short[var11];
            this.field2654 = new short[var11];
        }
        if (var16 == 1) {
            this.field2623 = new int[var9];
        }
        if (var12 == 1) {
            this.field2622 = new byte[var10];
            this.field2629 = new byte[var10];
            this.field2621 = new short[var10];
        }
        if (var13 == 255) {
            this.field2652 = new byte[var10];
        } else {
            this.field2611 = (byte) var13;
        }
        if (var14 == 1) {
            this.field2606 = new byte[var10];
        }
        if (var15 == 1) {
            this.field2610 = new int[var10];
        }
        this.field2633 = new short[var10];
        var4.field1301 = var21;
        var5.field1301 = var36;
        var6.field1301 = var38;
        var7.field1301 = var40;
        var8.field1301 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; var46++) {
            int var47 = var4.method642((byte) -51);
            int var48 = 0;
            if ((var47 & 0x1) != 0) {
                var48 = var5.method636(-21208);
            }
            int var49 = 0;
            if ((var47 & 0x2) != 0) {
                var49 = var6.method636(-21208);
            }
            int var50 = 0;
            if ((var47 & 0x4) != 0) {
                var50 = var7.method636(-21208);
            }
            this.field2648[var46] = var43 + var48;
            this.field2644[var46] = var44 + var49;
            this.field2655[var46] = var45 + var50;
            var43 = this.field2648[var46];
            var44 = this.field2644[var46];
            var45 = this.field2655[var46];
            if (var16 == 1) {
                this.field2623[var46] = var8.method642((byte) -62);
            }
        }
        var4.field1301 = var32;
        var5.field1301 = var28;
        var6.field1301 = var26;
        var7.field1301 = var30;
        var8.field1301 = var27;
        for (int var51 = 0; var51 < var10; var51++) {
            this.field2633[var51] = (short) var4.method576(1);
            if (var12 == 1) {
                int var52 = var5.method642((byte) -40);
                if ((var52 & 0x1) == 1) {
                    this.field2622[var51] = 1;
                    var2 = true;
                } else {
                    this.field2622[var51] = 0;
                }
                if ((var52 & 0x2) == 2) {
                    this.field2629[var51] = (byte) (var52 >> 2);
                    this.field2621[var51] = this.field2633[var51];
                    this.field2633[var51] = 127;
                    if (this.field2621[var51] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field2629[var51] = -1;
                    this.field2621[var51] = -1;
                }
            }
            if (var13 == 255) {
                this.field2652[var51] = var6.method599(false);
            }
            if (var14 == 1) {
                this.field2606[var51] = var7.method599(false);
            }
            if (var15 == 1) {
                this.field2610[var51] = var8.method642((byte) -47);
            }
        }
        var4.field1301 = var25;
        var5.field1301 = var23;
        int var53 = 0;
        int var54 = 0;
        int var55 = 0;
        int var56 = 0;
        for (int var57 = 0; var57 < var10; var57++) {
            int var58 = var5.method642((byte) -55);
            if (var58 == 1) {
                var53 = var4.method636(-21208) + var56;
                var54 = var4.method636(-21208) + var53;
                var55 = var4.method636(-21208) + var54;
                var56 = var55;
                this.field2628[var57] = var53;
                this.field2641[var57] = var54;
                this.field2627[var57] = var55;
            }
            if (var58 == 2) {
                var54 = var55;
                var55 = var4.method636(-21208) + var56;
                var56 = var55;
                this.field2628[var57] = var53;
                this.field2641[var57] = var54;
                this.field2627[var57] = var55;
            }
            if (var58 == 3) {
                var53 = var55;
                var55 = var4.method636(-21208) + var56;
                var56 = var55;
                this.field2628[var57] = var53;
                this.field2641[var57] = var54;
                this.field2627[var57] = var55;
            }
            if (var58 == 4) {
                int var61 = var53;
                var53 = var54;
                var54 = var61;
                var55 = var4.method636(-21208) + var56;
                var56 = var55;
                this.field2628[var57] = var53;
                this.field2641[var57] = var61;
                this.field2627[var57] = var55;
            }
        }
        var4.field1301 = var34;
        for (int var62 = 0; var62 < var11; var62++) {
            this.field2620[var62] = 0;
            this.field2647[var62] = (short) var4.method576(1);
            this.field2609[var62] = (short) var4.method576(1);
            this.field2654[var62] = (short) var4.method576(1);
        }
        if (this.field2629 != null) {
            boolean var63 = false;
            for (int var64 = 0; var64 < var10; var64++) {
                int var65 = this.field2629[var64] & 0xFF;
                if (var65 != 255) {
                    if ((this.field2647[var65] & 0xFFFF) == this.field2628[var64] && (this.field2609[var65] & 0xFFFF) == this.field2641[var64] && (this.field2654[var65] & 0xFFFF) == this.field2627[var64]) {
                        this.field2629[var64] = -1;
                    } else {
                        var63 = true;
                    }
                }
            }
            if (!var63) {
                this.field2629 = null;
            }
        }
        if (!var3) {
            this.field2621 = null;
        }
        if (!var2) {
            this.field2622 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "()V", line = 2000)
    public final void method1169() {
        for (int var1 = 0; var1 < this.field2650; var1++) {
            int var2 = this.field2655[var1];
            this.field2655[var1] = this.field2648[var1];
            this.field2648[var1] = -var2;
        }
        this.method1158();
    }
}
