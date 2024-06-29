import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class170 extends class260 {

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    private int field2695 = 0;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field2702 = -32768;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Z")
    public boolean field2705 = false;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    private int field2715 = 0;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    private int field2703 = -1;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field2700;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Ltg;")
    private class181 field2709;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
    public static int[] field2707 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "J")
    public static volatile long field2704 = 0L;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "Llb;")
    private class130 field2691;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Loi;")
    private final class80 method1169(int arg0) {
        class188 var2 = class277.method1862(this.field2700, arg0 ^ 0x6D);
        field2693++;
        class80 var3;
        if (this.field2705) {
            var3 = var2.method1283(-1, true, -1, 0);
        } else {
            var3 = var2.method1283(this.field2703, true, this.field2695, this.field2715);
        }
        if (arg0 != 0) {
            this.field2692 = -67;
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IB)V")
    public static final void method1170(String arg0, String arg1, String arg2, int arg3, byte arg4) {
        if (arg4 == 55) {
            class28.method240(arg2, -1, arg1, arg3, arg0, -31);
            field2713++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
    public static final void method1171(byte arg0, int arg1) {
        field2708++;
        class96.field1569.method476(false, arg1);
        if (arg0 < 43) {
            method1177((byte) 105);
        }
        class15.field260.method476(false, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        class80 var13 = this.method1169(0);
        field2706++;
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2691);
            this.field2702 = var13.method119();
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILqe;II)V")
    public static final void method1172(int arg0, int arg1, int arg2, class97 arg3, int arg4, int arg5) {
        field2711++;
        if (arg3.field1584 == -1 && arg3.field1582 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg3.field1578) {
            var6 += arg2 - arg3.field1578;
        } else if (arg2 < arg3.field1579) {
            var6 += arg3.field1579 - arg2;
        }
        if (arg3.field1592 < arg0) {
            var6 += arg0 - arg3.field1592;
        } else if (arg0 < arg3.field1586) {
            var6 += arg3.field1586 - arg0;
        }
        if (arg3.field1580 == 0 || var6 - 64 > arg3.field1580 || class107.field1745 == 0 || arg3.field1588 != arg5) {
            if (arg3.field1596 != null) {
                class195.field3123.method1707(arg3.field1596);
                arg3.field1596 = null;
            }
            if (arg3.field1595 != null) {
                class195.field3123.method1707(arg3.field1595);
                arg3.field1595 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg3.field1580 - var6) * class107.field1745 / arg3.field1580;
        if (arg3.field1596 != null) {
            arg3.field1596.method175(var7);
        } else if (arg3.field1584 >= 0) {
            class192 var8 = class192.method1307(class44.field806, arg3.field1584, 0);
            if (var8 != null) {
                class93 var9 = var8.method1308().method699(class168.field2668);
                class18 var10 = class18.method157(var9, 100, var7);
                var10.method174(-1);
                class195.field3123.method1708(var10);
                arg3.field1596 = var10;
            }
        }
        int var11 = -111 % ((-arg4 - 9) / 47);
        if (arg3.field1595 != null) {
            arg3.field1595.method175(var7);
            if (!arg3.field1595.method1392(true)) {
                arg3.field1595 = null;
                return;
            }
            return;
        }
        if (arg3.field1582 == null || (arg3.field1587 -= arg1) > 0) {
            return;
        }
        int var12 = (int) ((double) arg3.field1582.length * Math.random());
        class192 var13 = class192.method1307(class44.field806, arg3.field1582[var12], 0);
        if (var13 == null) {
            return;
        }
        class93 var14 = var13.method1308().method699(class168.field2668);
        class18 var15 = class18.method157(var14, 100, var7);
        var15.method174(0);
        class195.field3123.method1708(var15);
        arg3.field1587 = arg3.field1593 + (int) ((double) (arg3.field1576 - arg3.field1593) * Math.random());
        arg3.field1595 = var15;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)Z")
    public static final boolean method1173(int arg0, byte arg1) {
        class78 var2 = class136.method958(17771, arg0);
        field2694++;
        if (var2 == null) {
            return false;
        } else if (class165.field2609 == 1 || class165.field2609 == 2 || class205.field3287 == 2) {
            class4.field46 = var2.field1249;
            class200.field3195 = var2.field1261;
            if (class205.field3287 != 0) {
                class99.field1628 = class4.field46 + 40000;
                class245.field3922 = class99.field1628;
                class271.field4276 = class4.field46 + 50000;
            }
            return true;
        } else {
            String var3 = "";
            if (class205.field3287 != 0) {
                var3 = ":" + (var2.field1249 + 7000);
            }
            String var4 = "";
            if (class238.field3868 != null) {
                var4 = "/p=" + class238.field3868;
            }
            String var5 = "http://" + var2.field1261 + var3 + "/l=" + class135.field2192 + "/a=" + class54.field926 + var4 + "/j" + (class167.field2656 ? "1" : "0") + ",o" + (class56.field967 ? "1" : "0") + ",a2,m" + (class60.field993 ? "1" : "0");
            if (arg1 <= 27) {
                return true;
            }
            try {
                class105.field1689.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)V")
    public static final void method1174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg4;
        field2701++;
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class158.method1102(arg2, (byte) -127, arg3, arg1, arg4);
            }
        } else if (var7 == 0) {
            class121.method876(arg5, arg2, arg1, 0, arg4);
        } else if (arg0 == 5615) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class255.field4055) {
                var10 = (class255.field4055 * var8 >> 12) + var9;
                var11 = class255.field4055;
            } else if (arg5 > class9.field128) {
                var10 = (class9.field128 * var8 >> 12) + var9;
                var11 = class9.field128;
            } else {
                var10 = arg3;
                var11 = arg5;
            }
            int var12;
            int var13;
            if (arg4 < class255.field4055) {
                var13 = class255.field4055;
                var12 = (class255.field4055 * var8 >> 12) + var9;
            } else if (arg4 > class9.field128) {
                var12 = (class9.field128 * var8 >> 12) + var9;
                var13 = class9.field128;
            } else {
                var13 = arg4;
                var12 = arg1;
            }
            if (class161.field2561 > var12) {
                var12 = class161.field2561;
                var13 = (class161.field2561 - var9 << 12) / var8;
            } else if (class51.field896 < var12) {
                var12 = class51.field896;
                var13 = (class51.field896 - var9 << 12) / var8;
            }
            if (class161.field2561 > var10) {
                var11 = (class161.field2561 - var9 << 12) / var8;
                var10 = class161.field2561;
            } else if (class51.field896 < var10) {
                var11 = (class51.field896 - var9 << 12) / var8;
                var10 = class51.field896;
            }
            class67.method467(var13, var11, -100, var12, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public final void method1175(int arg0, int arg1) {
        field2710++;
        if (this.field2705) {
            return;
        }
        this.field2715 += arg0;
        while (this.field2715 > this.field2709.field2836[this.field2695]) {
            this.field2715 -= this.field2709.field2836[this.field2695];
            this.field2695++;
            if (this.field2709.field2848.length <= this.field2695) {
                this.field2705 = true;
                break;
            }
        }
        if (arg1 != -1989) {
            this.field2695 = 57;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I")
    public final int method119() {
        field2696++;
        return this.field2702;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public static final void method1176(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class156.field2537; var3++) {
            for (int var4 = 0; var4 < class241.field3894; var4++) {
                for (int var5 = 0; var5 < class129.field2084; var5++) {
                    class134 var6 = class288.field4563[var3][var4][var5];
                    if (var6 != null) {
                        class229 var7 = var6.field2133;
                        if (var7 != null && var7.field3775.method1029()) {
                            class24.method220(var7.field3775, var3, var4, var5, 1, 1);
                            if (var7.field3784 != null && var7.field3784.method1029()) {
                                class24.method220(var7.field3784, var3, var4, var5, 1, 1);
                                var7.field3775.method1032(var7.field3784, 0, 0, 0, false);
                                var7.field3784 = var7.field3784.method1043(arg0, arg1, arg2);
                            }
                            var7.field3775 = var7.field3775.method1043(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2151; var8++) {
                            class289 var10 = var6.field2153[var8];
                            if (var10 != null && var10.field4581.method1029()) {
                                class24.method220(var10.field4581, var3, var4, var5, var10.field4573 + 1 - var10.field4567, var10.field4571 - var10.field4575 + 1);
                                var10.field4581 = var10.field4581.method1043(arg0, arg1, arg2);
                            }
                        }
                        class42 var9 = var6.field2140;
                        if (var9 != null && var9.field789.method1029()) {
                            class66.method463(var9.field789, var3, var4, var5);
                            var9.field789 = var9.field789.method1043(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method1177(byte arg0) {
        field2707 = null;
        if (arg0 != 89) {
            field2707 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2712++;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIII)V")
    public class170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2714 = arg5 + arg6;
        this.field2700 = arg0;
        this.field2692 = arg1;
        this.field2697 = arg4;
        this.field2716 = arg2;
        this.field2698 = arg3;
        int var8 = class277.method1862(this.field2700, 84).field3050;
        if (var8 == -1) {
            this.field2705 = true;
        } else {
            this.field2705 = false;
            this.field2709 = class49.method384(var8, 94);
        }
    }
}
