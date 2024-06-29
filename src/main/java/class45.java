import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class45 extends class114 {

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    private int field707 = -32768;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    private int field718 = 0;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "Z")
    private boolean field714 = false;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    private int field711 = 0;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    private int field735 = -1;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private int field712;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    private int field709;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    private int field710;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    private int field733;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lcc;")
    private class215 field728;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field720 = new String[1000];

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lgk;")
    public static class159 field719 = new class159();

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "D")
    private double field713;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "D")
    public double field716;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "D")
    private double field722;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "D")
    public double field723;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "D")
    private double field727;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "D")
    public double field730;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "D")
    private double field732;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "D")
    private double field738;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    public int field729;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Ls;")
    private class245 field721;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)V")
    public final void method301(byte arg0, int arg1) {
        field731++;
        if (this.field733 == -1) {
            this.field723 += (double) arg1 * this.field722;
        } else {
            this.field723 += this.field738 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field722;
            this.field722 += (double) arg1 * this.field738;
        }
        this.field716 += (double) arg1 * this.field713;
        this.field714 = true;
        this.field730 += (double) arg1 * this.field732;
        this.field729 = (int) (Math.atan2(this.field732, this.field713) * 325.949D) + 1024 & 0x7FF;
        this.field744 = (int) (Math.atan2(this.field722, this.field727) * 325.949D) & 0x7FF;
        if (this.field728 != null) {
            this.field711 += arg1;
            label45: while (true) {
                do {
                    do {
                        if (this.field711 <= this.field728.field3219[this.field718]) {
                            break label45;
                        }
                        this.field711 -= this.field728.field3219[this.field718];
                        this.field718++;
                        if (this.field718 >= this.field728.field3215.length) {
                            this.field718 -= this.field728.field3218;
                            if (this.field718 < 0 || this.field728.field3215.length <= this.field718) {
                                this.field718 = 0;
                            }
                        }
                        this.field735 = this.field718 + 1;
                    } while (this.field728.field3215.length > this.field735);
                    this.field735 -= this.field728.field3218;
                } while (this.field735 >= 0 && this.field728.field3215.length > this.field735);
                this.field735 = -1;
            }
        }
        if (arg0 <= 80) {
            method303(-8, 36, 17, -71, (byte) -18);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method302(byte arg0) {
        field720 = null;
        if (arg0 >= 76) {
            field719 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIB)V")
    public static final void method303(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class118.field1782 = arg2;
        class248.field3765 = arg1;
        field747++;
        if (arg4 == -1) {
            class163.field2505 = arg3;
            class243.field3635 = arg0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public final void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10) {
        field743++;
        class14 var13 = this.method306((byte) -23);
        if (var13 != null) {
            var13.method90(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field721);
            this.field707 = var13.method81();
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IIIII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class100.field1574 != arg3 && arg2 != 0 && class161.field2473 < 50 && arg0 != -1) {
            class89.field1408[class161.field2473] = arg0;
            class167.field2561[class161.field2473] = arg2;
            class174.field2653[class161.field2473] = arg4;
            class289.field4568[class161.field2473] = null;
            class63.field994[class161.field2473] = 0;
            class160.field2458[class161.field2473] = arg1;
            class161.field2473++;
        }
        field742++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII)V")
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field737++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIBI)V")
    public final void method305(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field725++;
        if (arg3 != 126) {
            this.field729 = 48;
        }
        if (!this.field714) {
            double var6 = (double) (arg1 - this.field709);
            double var8 = (double) (arg4 - this.field712);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field730 = (double) this.field710 * var6 / var10 + (double) this.field709;
            this.field723 = (double) this.field746;
            this.field716 = (double) this.field710 * var8 / var10 + (double) this.field712;
        }
        double var12 = (double) (this.field739 + 1 - arg2);
        this.field713 = ((double) arg4 - this.field716) / var12;
        this.field732 = ((double) arg1 - this.field730) / var12;
        this.field727 = Math.sqrt(this.field732 * this.field732 + this.field713 * this.field713);
        if (this.field733 == -1) {
            this.field722 = ((double) arg0 - this.field723) / var12;
        } else {
            if (!this.field714) {
                this.field722 = -this.field727 * Math.tan((double) this.field733 * 0.02454369D);
            }
            this.field738 = ((double) arg0 - this.field723 - this.field722 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)Lfk;")
    private final class14 method306(byte arg0) {
        field724++;
        class21 var2 = class236.method1498((byte) -117, this.field736);
        class14 var3 = var2.method139(this.field735, (byte) -104, this.field718, this.field711);
        if (arg0 != -23) {
            this.method301((byte) 37, -60);
        }
        if (var3 == null) {
            return null;
        } else {
            var3.method96(this.field744);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "()I")
    public final int method81() {
        field715++;
        return this.field707;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZB)V")
    public static final void method307(boolean arg0, byte arg1) {
        field717++;
        if (class272.field4093 == null) {
            class272.field4093 = new byte[4][104][104];
        }
        if (arg0) {
            field720 = null;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class272.field4093[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)V")
    public static final void method308(boolean arg0, int arg1) {
        field740++;
        class219.field3299.method1780(arg1, arg0);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class45(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field741 = arg1;
        this.field714 = false;
        this.field745 = arg10;
        this.field712 = arg3;
        this.field739 = arg6;
        this.field709 = arg2;
        this.field710 = arg8;
        this.field733 = arg7;
        this.field746 = arg4;
        this.field734 = arg9;
        this.field726 = arg5;
        this.field736 = arg0;
        int var12 = class236.method1498((byte) -115, this.field736).field249;
        if (var12 == -1) {
            this.field728 = null;
        } else {
            this.field728 = class276.method1829(var12, 29223);
        }
    }
}
