import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class174 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Z")
    private boolean field2846 = false;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public int field2857 = 0;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public int field2848 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lph;")
    public static class229 field2833 = class266.method1858("rect_debug=", 0);

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Z")
    public static boolean field2849 = false;

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    public static int field2858 = 0;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lja;")
    public static class143 field2847 = new class143(128);

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Lph;")
    public static class229 field2862 = class266.method1858("Titelbild ge-Offnet)3", 0);

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lph;")
    private static class229 field2859 = class266.method1858("Sun", 0);

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Lph;")
    private static class229 field2864 = class266.method1858("Wed", 0);

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Lph;")
    private static class229 field2865 = class266.method1858("Fri", 0);

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lph;")
    private static class229 field2861 = class266.method1858("Sat", 0);

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "Lph;")
    private static class229 field2868 = class266.method1858("Mon", 0);

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[I")
    public static int[] field2860 = new int[4];

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lph;")
    private static class229 field2863 = class266.method1858("Thu", 0);

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lph;")
    private static class229 field2866 = class266.method1858("Tue", 0);

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "[Lph;")
    public static class229[] field2867 = new class229[] { field2859, field2868, field2866, field2864, field2863, field2865, field2861 };

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field2832;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    private int field2835;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field2838;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "I")
    public int field2854;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "J")
    public long field2843;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lhb;II)V", line = 20)
    private final void method1252(class164 arg0, int arg1, int arg2) {
        field2834++;
        if (arg1 != 1) {
            this.method1255(-95);
        }
        if (arg2 == 1) {
            this.field2835 = arg0.method1161(true);
        } else if (arg2 == 2) {
            arg0.method1178(8);
        } else if (arg2 == 3) {
            this.field2856 = arg0.method1191(arg1 ^ 0x7C21);
            this.field2838 = arg0.method1191(31776);
            this.field2842 = arg0.method1191(arg1 ^ 0x7C21);
        } else if (arg2 == 4) {
            this.field2832 = arg0.method1178(8);
            this.field2854 = arg0.method1191(arg1 + 31775);
        } else if (arg2 == 6) {
            this.field2840 = arg0.method1178(8);
        } else if (arg2 == 8) {
            this.field2848 = 1;
        } else if (arg2 == 9) {
            this.field2857 = 1;
        } else if (arg2 == 10) {
            this.field2846 = true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZLhb;)V", line = 86)
    public final void method1253(boolean arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1178(8);
            if (var3 == 0) {
                field2855++;
                if (!arg0) {
                    method1261(false);
                }
                return;
            }
            this.method1252(arg1, 1, var3);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjm;ZZZLjm;I)I", line = 110)
    public static final int method1254(int arg0, class134 arg1, boolean arg2, boolean arg3, boolean arg4, class134 arg5, int arg6) {
        field2839++;
        int var7 = class273.method1894(arg1, arg4, arg0, arg5, -10572);
        if (!arg2) {
            return -85;
        } else if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = class273.method1894(arg1, arg3, arg6, arg5, -10572);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V", line = 143)
    public final void method1255(int arg0) {
        this.field2844 = class310.field5197[this.field2835];
        this.field2845 = (int) Math.sqrt((double) (this.field2856 * this.field2856 + this.field2842 * this.field2842 + this.field2838 * this.field2838));
        if (arg0 != -29956) {
            this.field2856 = 4;
        }
        if (this.field2854 == 0) {
            this.field2854 = 1;
        }
        if (this.field2832 == 0) {
            this.field2843 = 2147483647L;
        } else if (this.field2832 == 1) {
            this.field2843 = (long) (this.field2845 * 8 / this.field2854);
            this.field2843 *= this.field2843;
        } else if (this.field2832 == 2) {
            this.field2843 = (long) (this.field2845 * 8 / this.field2854);
        }
        if (this.field2846) {
            this.field2845 *= -1;
        }
        field2837++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIZIILsi;I)V", line = 179)
    public static final void method1256(int arg0, int arg1, boolean arg2, int arg3, int arg4, class66 arg5, int arg6) {
        class219.field3596 = arg3;
        class133.field2154 = arg5;
        class124.field2076 = arg1;
        field2853++;
        class155.field2525 = arg4;
        class170.field2802 = 1;
        class176.field2887 = arg2;
        class245.field4051 = arg0;
        if (arg6 > -55) {
            method1254(-118, (class134) null, true, false, false, (class134) null, 13);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 198)
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class88.field1504 * 128) {
            arg0 = class88.field1504 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class129.field2114 * 128) {
            arg2 = class129.field2114 * 128 - 1;
        }
        class132.field2148 = class310.field5199[arg3];
        class53.field750 = class310.field5197[arg3];
        class93.field1576 = class310.field5199[arg4];
        class93.field1570 = class310.field5197[arg4];
        class244.field4035 = arg0;
        class129.field2111 = arg1;
        class255.field4266 = arg2;
        class254.field4249 = arg0 / 128;
        class102.field1745 = arg2 / 128;
        class70.field1182 = class254.field4249 - class202.field3339;
        if (class70.field1182 < 0) {
            class70.field1182 = 0;
        }
        class328.field5589 = class102.field1745 - class202.field3339;
        if (class328.field5589 < 0) {
            class328.field5589 = 0;
        }
        class141.field2274 = class254.field4249 + class202.field3339;
        if (class141.field2274 > class88.field1504) {
            class141.field2274 = class88.field1504;
        }
        class324.field5543 = class202.field3339 + class102.field1745;
        if (class324.field5543 > class129.field2114) {
            class324.field5543 = class129.field2114;
        }
        short var15;
        if (class99.field1675) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class202.field3339 + class202.field3339 + 2; var16++) {
            for (int var17 = 0; var17 < class202.field3339 + class202.field3339 + 2; var17++) {
                int var18 = (var16 - class202.field3339 << 7) - (class244.field4035 & 0x7F);
                int var19 = (var17 - class202.field3339 << 7) - (class255.field4266 & 0x7F);
                int var20 = class254.field4249 + var16 - class202.field3339;
                int var21 = class102.field1745 + var17 - class202.field3339;
                if (var20 >= 0 && var21 >= 0 && var20 < class88.field1504 && var21 < class129.field2114) {
                    int var22;
                    if (class203.field3346 == null) {
                        var22 = class103.field1753[0][var20][var21] + 128 - class129.field2111;
                    } else {
                        var22 = class203.field3346[0][var20][var21] + 128 - class129.field2111;
                    }
                    int var23 = class103.field1753[3][var20][var21] - class129.field2111 - 1000;
                    class230.field3819[var16][var17] = class213.method1514(var18, var23, var22, var19, var15);
                } else {
                    class230.field3819[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class202.field3339 + class202.field3339 + 1; var24++) {
            for (int var25 = 0; var25 < class202.field3339 + class202.field3339 + 1; var25++) {
                class119.field2000[var24][var25] = class230.field3819[var24][var25] || class230.field3819[var24 + 1][var25] || class230.field3819[var24][var25 + 1] || class230.field3819[var24 + 1][var25 + 1];
            }
        }
        class178.field2939 = arg6;
        class66.field1044 = arg7;
        class251.field4209 = arg8;
        class217.field3564 = arg9;
        class250.field4158 = arg10;
        class222.method1551();
        if (class324.field5533 != null) {
            class110.method840(true);
            class325.method2230(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class99.field1675) {
                class33.field547 = false;
                class285.method1964(121, 0, 0);
                class117.method885((float[]) null);
                class62.method425();
            }
            class110.method840(false);
        }
        class325.method2230(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lsi;Lsi;BZ)V", line = 333)
    public static final void method1258(class66 arg0, class66 arg1, byte arg2, boolean arg3) {
        int var4 = 90 / ((arg2 + 44) / 55);
        class75.field1270 = arg0;
        class124.field2084 = arg3;
        field2841++;
        class27.field398 = arg1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIBIIII)V", line = 347)
    public static final void method1259(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field2850++;
        if (arg5 <= 24) {
            field2861 = (class229) null;
        }
        if (arg1 == arg7 && arg2 == arg3 && arg0 == arg8 && arg4 == arg6) {
            class272.method1887(arg4, arg7, arg8, arg3, arg9, (byte) -125);
            return;
        }
        int var10 = arg7;
        int var11 = arg7 * 3;
        int var12 = arg3;
        int var13 = arg3 * 3;
        int var14 = arg1 * 3;
        int var15 = arg2 * 3;
        int var16 = arg0 * 3;
        int var17 = var14 + arg8 - var16 - arg7;
        int var18 = arg6 * 3;
        int var19 = arg4 + var15 - var18 - arg3;
        int var20 = var16 + var11 - var14 - var14;
        int var21 = var18 + var13 - var15 - var15;
        int var22 = var15 - var13;
        int var23 = var14 - var11;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var26;
            int var28 = var17 * var26;
            int var29 = var21 * var25;
            int var30 = var20 * var25;
            int var31 = var23 * var24;
            int var32 = var22 * var24;
            int var33 = (var28 + var30 + var31 >> 12) + arg7;
            int var34 = (var27 + var29 + var32 >> 12) + arg3;
            class272.method1887(var34, var10, var33, var12, arg9, (byte) -43);
            var12 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lnk;", line = 433)
    public static final class196 method1260(Throwable arg0, String arg1) {
        field2852++;
        class196 var2;
        if (arg0 instanceof class196) {
            var2 = (class196) arg0;
            var2.field3279 = var2.field3279 + ' ' + arg1;
        } else {
            var2 = new class196(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V", line = 498)
    public static void method1261(boolean arg0) {
        field2833 = null;
        field2867 = null;
        field2866 = null;
        field2861 = null;
        field2860 = null;
        field2863 = null;
        field2859 = null;
        field2862 = null;
        if (!arg0) {
            method1260((Throwable) null, (String) null);
        }
        field2864 = null;
        field2865 = null;
        field2868 = null;
        field2847 = null;
    }
}
