import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class176 extends class310 {

    @OriginalMember(owner = "client!in", name = "X", descriptor = "I")
    private int field2823 = -1;

    @OriginalMember(owner = "client!in", name = "S", descriptor = "Ljava/lang/String;")
    public static String field2819 = "Face here";

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    public static int field2817 = 0;

    @OriginalMember(owner = "client!in", name = "cb", descriptor = "Lwf;")
    public static class250 field2828 = null;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field2814 = null;

    @OriginalMember(owner = "client!in", name = "Y", descriptor = "Llb;")
    public static class341 field2824 = null;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public int field2815;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!in", name = "T", descriptor = "I")
    public int field2820;

    @OriginalMember(owner = "client!in", name = "V", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!in", name = "W", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!in", name = "Z", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!in", name = "ab", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!in", name = "bb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!in", name = "db", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!in", name = "fb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!in", name = "gb", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!in", name = "hb", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "[I")
    public int[] field2816;

    @OriginalMember(owner = "client!in", name = "eb", descriptor = "[I")
    public static int[] field2830;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lqm;II)V", line = 5)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field2823 = arg0.method1765(true);
        }
        field2829++;
        if (arg1 != -2470) {
            this.field2823 = -104;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)I", line = 24)
    public final int method1383(int arg0) {
        field2822++;
        if (arg0 != 21076) {
            this.field2820 = 27;
        }
        return this.field2823;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(B)V", line = 35)
    public static final void method1384(byte arg0) {
        field2833++;
        class17.field196.method2326(-4);
        class348.field5536.method2326(-4);
        if (arg0 == -76) {
            class230.field3816.method2326(-4);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZ)[[I", line = 54)
    public int[][] method391(int arg0, boolean arg1) {
        if (!arg1) {
            return (int[][]) ((int[][]) null);
        }
        field2821++;
        int[][] var3 = this.field4942.method10((byte) -117, arg0);
        if (this.field4942.field30 && this.method1389(-31317)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = (class254.field4279 == this.field2815 ? arg0 : this.field2815 * arg0 / class254.field4279) * this.field2820;
            int[] var7 = var3[1];
            if (class261.field4405 == this.field2820) {
                for (int var11 = 0; var11 < class261.field4405; var11++) {
                    int var12 = this.field2816[var6++];
                    var5[var11] = class343.method2418(4080, var12 << 4);
                    var7[var11] = class343.method2418(var12 >> 4, 4080);
                    var4[var11] = class343.method2418(var12, 16711680) >> 12;
                }
            } else {
                for (int var8 = 0; var8 < class261.field4405; var8++) {
                    int var9 = this.field2820 * var8 / class261.field4405;
                    int var10 = this.field2816[var6 + var9];
                    var5[var8] = class343.method2418(var10, 255) << 4;
                    var7[var8] = class343.method2418(var10, 65280) >> 4;
                    var4[var8] = class343.method2418(16711680, var10) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(II)I", line = 124)
    public static final int method1385(int arg0, int arg1) {
        if (arg0 != 13656) {
            field2830 = (int[]) null;
        }
        field2825++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IZIII)V", line = 136)
    public static final void method1386(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2812++;
        if (arg1) {
            field2819 = (String) null;
        }
        for (class170 var5 = (class170) class314.field4984.method2300((byte) 115); var5 != null; var5 = (class170) class314.field4984.method2306(-23)) {
            class345.method2429(arg4, -1, arg2, var5, arg0, arg3);
        }
        for (class170 var6 = (class170) class103.field1673.method2300((byte) 125); var6 != null; var6 = (class170) class103.field1673.method2306(-23)) {
            byte var7 = 1;
            class106 var8 = var6.field2706.method1641(0);
            if (var6.field2706.field3544 == var8.field1737) {
                var7 = 0;
            } else if (var6.field2706.field3544 == var8.field1723 || var6.field2706.field3544 == var8.field1729 || var6.field2706.field3544 == var8.field1731 || var6.field2706.field3544 == var8.field1754) {
                var7 = 2;
            } else if (var6.field2706.field3544 == var8.field1733 || var6.field2706.field3544 == var8.field1730 || var6.field2706.field3544 == var8.field1746 || var6.field2706.field3544 == var8.field1747) {
                var7 = 3;
            }
            if (var6.field2708 != var7) {
                int var9 = class123.method967((byte) -45, var6.field2706);
                if (var6.field2714 != var9) {
                    if (var6.field2713 != null) {
                        class245.field4030.method2163(var6.field2713);
                        var6.field2713 = null;
                    }
                    var6.field2714 = var9;
                }
                var6.field2708 = var7;
            }
            var6.field2711 = var6.field2706.field3577;
            var6.field2705 = var6.field2706.field3577 + var6.field2706.method1634(-1) * 64;
            var6.field2695 = var6.field2706.field3511;
            var6.field2716 = var6.field2706.field3511 + (var6.field2706.method1634(-1) * 64);
            class345.method2429(arg4, -1, arg2, var6, arg0, arg3);
        }
        for (class170 var10 = (class170) class243.field3995.method1265(64); var10 != null; var10 = (class170) class243.field3995.method1277((byte) -128)) {
            byte var11 = 1;
            class106 var12 = var10.field2715.method1641(0);
            if (var10.field2715.field3544 == var12.field1737) {
                var11 = 0;
            } else if (var10.field2715.field3544 == var12.field1723 || var10.field2715.field3544 == var12.field1729 || var10.field2715.field3544 == var12.field1731 || var10.field2715.field3544 == var12.field1754) {
                var11 = 2;
            } else if (var10.field2715.field3544 == var12.field1733 || var10.field2715.field3544 == var12.field1730 || var10.field2715.field3544 == var12.field1746 || var10.field2715.field3544 == var12.field1747) {
                var11 = 3;
            }
            if (var10.field2708 != var11) {
                int var13 = class239.method1822(var10.field2715, -52);
                if (var10.field2714 != var13) {
                    if (var10.field2713 != null) {
                        class245.field4030.method2163(var10.field2713);
                        var10.field2713 = null;
                    }
                    var10.field2714 = var13;
                }
                var10.field2708 = var11;
            }
            var10.field2711 = var10.field2715.field3577;
            var10.field2705 = var10.field2715.field3577 + var10.field2715.method1634(-1) * 64;
            var10.field2695 = var10.field2715.field3511;
            var10.field2716 = var10.field2715.field3511 + var10.field2715.method1634(-1) * 64;
            class345.method2429(arg4, -1, arg2, var10, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLth;Lth;)V", line = 255)
    public static final void method1387(byte arg0, class57 arg1, class57 arg2) {
        field2813++;
        class286.field4663 = class41.method266(arg2, class234.field3887, 0, arg1, 256);
        if (class42.field607) {
            class258.field4354 = client.method358((byte) 112, arg2, class234.field3887, 0, arg1);
        } else {
            class258.field4354 = (class290) class286.field4663;
        }
        if (arg0 < 55) {
            field2818 = -118;
        }
        class343.field5466 = class41.method266(arg2, class109.field1799, 0, arg1, 256);
        class109.field1792 = class41.method266(arg2, class57.field977, 0, arg1, 256);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 273)
    public final void method1388(int arg0) {
        field2827++;
        super.method1388(126);
        this.field2816 = null;
        int var2 = -27 / ((61 - arg0) / 41);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 286)
    public class176() {
        super(0, false);
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(I)Z", line = 290)
    public final boolean method1389(int arg0) {
        field2831++;
        if (this.field2816 != null) {
            return true;
        } else if (this.field2823 >= 0) {
            class351 var2 = class297.field4769 < 0 ? class31.method217((byte) 84, this.field2823, class345.field5494) : class200.method1540(class345.field5494, class297.field4769, this.field2823, (byte) -13);
            var2.method2474();
            this.field2816 = var2.field5571;
            this.field2815 = var2.field199;
            this.field2820 = var2.field197;
            return true;
        } else {
            if (arg0 != -31317) {
                this.method1389(42);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 326)
    public static void method1390(int arg0) {
        field2830 = null;
        field2819 = null;
        field2814 = null;
        if (arg0 != 16711680) {
            field2828 = (class250) null;
        }
        field2824 = null;
        field2828 = null;
    }
}
