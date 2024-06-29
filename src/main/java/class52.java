import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 extends class43 {

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "Z")
    private boolean field752 = false;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    private int field757 = -32768;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    private int field789 = 0;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    private int field780 = -1;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    private int field771 = 0;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "I")
    public int field788;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    private int field793;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    private int field764;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "Lfb;")
    private class30 field796;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lqd;")
    public static class3[] field763 = new class3[14];

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field761 = 0;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "[Z")
    public static boolean[] field786 = new boolean[200];

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field750 = 1;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "D")
    public static double field762 = -1.0D;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "[I")
    public static int[] field797 = new int[32];

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lam;")
    public static class180 field790 = new class180();

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "D")
    public double field751;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "D")
    private double field768;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "D")
    public double field775;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "D")
    private double field776;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "D")
    private double field782;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "D")
    private double field783;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "D")
    public double field791;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "D")
    private double field795;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public int field779;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Lri;")
    private class67 field787;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "[[[Lwj;")
    public static class6[][][] field798;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        field755++;
        this.field751 += (double) arg0 * this.field768;
        if (arg1 > -103) {
            this.method391(1);
        }
        this.field752 = true;
        if (this.field785 == -1) {
            this.field791 += (double) arg0 * this.field782;
        } else {
            this.field791 += this.field783 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field782;
            this.field782 += (double) arg0 * this.field783;
        }
        this.field775 += (double) arg0 * this.field776;
        this.field779 = (int) (Math.atan2(this.field768, this.field776) * 325.949D) + 1024 & 0x7FF;
        this.field760 = (int) (Math.atan2(this.field782, this.field795) * 325.949D) & 0x7FF;
        if (this.field796 == null) {
            return;
        }
        this.field789 += arg0;
        while (true) {
            do {
                do {
                    if (this.field796.field423[this.field771] >= this.field789) {
                        return;
                    }
                    this.field789 -= this.field796.field423[this.field771];
                    this.field771++;
                    if (this.field771 >= this.field796.field439.length) {
                        this.field771 -= this.field796.field418;
                        if (this.field771 < 0 || this.field771 >= this.field796.field439.length) {
                            this.field771 = 0;
                        }
                    }
                    this.field780 = this.field771 + 1;
                } while (this.field796.field439.length > this.field780);
                this.field780 -= this.field796.field418;
            } while (this.field780 >= 0 && this.field796.field439.length > this.field780);
            this.field780 = -1;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
    public static final void method384(int arg0, int arg1) {
        for (class166 var2 = class286.field4531.method287(arg0 - 360699117); var2 != null; var2 = class286.field4531.method291((byte) -62)) {
            if ((long) arg1 == (var2.field2603 >> 48 & 0xFFFFL)) {
                var2.method1123(0);
            }
        }
        if (arg0 != 360698992) {
            method386((byte) -3);
        }
        field773++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIILre;I)V")
    public static final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class228 arg6, int arg7) {
        field759++;
        if (class171.field2682) {
            class180.field2812 = 32;
        } else {
            class180.field2812 = 0;
        }
        class171.field2682 = false;
        if (arg0 != -25092) {
            field770 = -115;
        }
        if (class160.field2485 != 0) {
            if (arg1 <= arg5 && arg5 < (arg1 + 16) && arg2 >= arg4 && arg4 + 16 > arg2) {
                arg6.field3523 -= 4;
                class82.method591(arg6, false);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg2 >= (arg4 + arg7 - 16) && (arg4 + arg7) > arg2) {
                arg6.field3523 += 4;
                class82.method591(arg6, false);
            } else if (arg5 >= arg1 - class180.field2812 && arg1 + class180.field2812 + 16 > arg5 && arg4 + 16 <= arg2 && (arg4 + arg7 - 16) > arg2) {
                int var8 = (arg7 - 32) * arg7 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg7 - var8 - 32;
                int var10 = arg2 - (var8 / 2) - arg4 - 16;
                arg6.field3523 = (arg3 - arg7) * var10 / var9;
                class82.method591(arg6, false);
                class171.field2682 = true;
            }
        }
        if (class22.field317 == 0) {
            return;
        }
        int var11 = arg6.field3574;
        if ((arg1 - var11) <= arg5 && arg2 >= arg4 && (arg1 + 16) > arg5 && arg2 <= (arg4 + arg7)) {
            arg6.field3523 += class22.field317 * 45;
            class82.method591(arg6, false);
            return;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        class9 var13 = this.method391(23698);
        field765++;
        if (var13 != null) {
            var13.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field787);
            this.field757 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field763 = null;
        field790 = null;
        field786 = null;
        field798 = null;
        field797 = null;
        int var1 = -101 / ((arg0 + 34) / 38);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V")
    public final void method387(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field753++;
        if (arg4 <= 55) {
            field763 = null;
        }
        if (!this.field752) {
            double var6 = (double) (arg1 - this.field784);
            double var8 = (double) (arg2 - this.field793);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field791 = (double) this.field764;
            this.field751 = (double) this.field769 * var6 / var10 + (double) this.field784;
            this.field775 = (double) this.field769 * var8 / var10 + (double) this.field793;
        }
        double var12 = (double) (this.field788 + 1 - arg0);
        this.field768 = ((double) arg1 - this.field751) / var12;
        this.field776 = ((double) arg2 - this.field775) / var12;
        this.field795 = Math.sqrt(this.field776 * this.field776 + this.field768 * this.field768);
        if (this.field785 == -1) {
            this.field782 = ((double) arg3 - this.field791) / var12;
        } else {
            if (!this.field752) {
                this.field782 = -this.field795 * Math.tan((double) this.field785 * 0.02454369D);
            }
            this.field783 = ((double) arg3 - this.field791 - (this.field782 * var12)) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLai;)Loj;")
    public static final class160 method388(boolean arg0, class88 arg1) {
        field756++;
        arg1.method633(107);
        int var2 = arg1.method633(80);
        class160 var3 = class251.method1720(var2, 76);
        var3.field2492 = arg1.method633(48);
        int var4 = arg1.method633(100);
        if (!arg0) {
            field798 = null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method633(48);
            var3.method2(arg1, 61, var6);
        }
        var3.method210((byte) -126);
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field774++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIZ)V")
    public static final void method389(int arg0, int arg1, boolean arg2) {
        class41 var3 = class221.method1492((byte) -42, arg0, 1);
        var3.method301(8792);
        var3.field584 = arg1;
        if (!arg2) {
            field798 = null;
        }
        field772++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLfb;IIII)V")
    public static final void method390(boolean arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5) {
        field777++;
        if (class112.field1841 >= 50 || arg1.field445 == null || arg2 >= arg1.field445.length || arg1.field445[arg2] == null) {
            return;
        }
        int var6 = arg1.field445[arg2][0];
        int var7 = var6 >> 8;
        int var8 = var6 & 0x1F;
        if (arg3 < 97) {
            method386((byte) -113);
        }
        if (arg1.field445[arg2].length > 1) {
            int var9 = (int) ((double) arg1.field445[arg2].length * Math.random());
            if (var9 > 0) {
                var7 = arg1.field445[arg2][var9];
            }
        }
        int var10 = (var6 & 0xE7) >> 5;
        if (var8 == 0) {
            if (arg0) {
                class49.method365((byte) -18, 0, 255, var10, var7);
            }
        } else if (class86.field1445 != 0) {
            class122.field1956[class112.field1841] = var7;
            class131.field2060[class112.field1841] = var10;
            class165.field2591[class112.field1841] = 0;
            int var11 = (arg5 - 64) / 128;
            class250.field4031[class112.field1841] = null;
            int var12 = (arg4 - 64) / 128;
            class296.field4682[class112.field1841] = 255;
            class121.field1944[class112.field1841] = (var12 << 8) + (var11 << 16) + var8;
            class112.field1841++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()I")
    public final int method102() {
        field754++;
        return this.field757;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lig;")
    private final class9 method391(int arg0) {
        field792++;
        class238 var2 = class16.method158(this.field794, true);
        if (arg0 != 23698) {
            field786 = null;
        }
        class9 var3 = var2.method1638((byte) 74, this.field780, this.field771, this.field789);
        if (var3 == null) {
            return null;
        } else {
            var3.method89(this.field760);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field752 = false;
        this.field758 = arg10;
        this.field785 = arg7;
        this.field769 = arg8;
        this.field788 = arg6;
        this.field766 = arg1;
        this.field793 = arg3;
        this.field794 = arg0;
        this.field764 = arg4;
        this.field778 = arg9;
        this.field767 = arg5;
        this.field784 = arg2;
        int var12 = class16.method158(this.field794, true).field3852;
        if (var12 == -1) {
            this.field796 = null;
        } else {
            this.field796 = class148.method996(-87, var12);
        }
    }
}
