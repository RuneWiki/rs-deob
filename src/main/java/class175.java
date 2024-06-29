import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class175 extends class7 {

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Z")
    private boolean field2894 = true;

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lrg;")
    private class326 field2896 = null;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    private int field2914 = -1;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    private int field2917 = -1;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "I")
    private int field2907 = 0;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Z")
    private boolean field2921 = false;

    @OriginalMember(owner = "client!od", name = "w", descriptor = "I")
    private int field2904 = 0;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    private int field2930 = 0;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    private int field2929 = -32768;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    private int field2924;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    private int field2915;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Lpi;")
    private class202 field2922;

    @OriginalMember(owner = "client!od", name = "u", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    private int field2911;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    private int field2906;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field2909 = 0;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "[Ldh;")
    public static class193[] field2895 = new class193[8];

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!od", name = "s", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!od", name = "r", descriptor = "Ljh;")
    public static class124 field2899;

    @OriginalMember(owner = "client!od", name = "t", descriptor = "Lak;")
    public static class172 field2901;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "Lpe;")
    private class294 field2897;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[I")
    public static int[] field2898;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIILog;I)V", line = 6)
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class157 arg6, int arg7) {
        int var8 = arg2 * arg2 + arg3 * arg3;
        field2925++;
        if (arg0 != 10475) {
            field2901 = (class172) null;
        }
        if (arg5 < var8) {
            return;
        }
        int var9 = Math.min(arg6.field2468 / 2, arg6.field2520 / 2);
        if (var8 <= var9 * var9) {
            class103.method711(arg3, 2047, arg2, arg6, arg7, class42.field536[arg4], arg1);
            return;
        }
        var9 -= 10;
        int var10 = (int) class330.field5090 + class69.field983 & 0x7FF;
        int var11 = class170.field2810[var10];
        int var12 = var11 * 256 / (class320.field4963 + 256);
        int var13 = class170.field2801[var10];
        int var14 = var13 * 256 / (class320.field4963 + 256);
        int var15 = arg2 * var14 + arg3 * var12 >> 16;
        int var16 = arg2 * var12 - (arg3 * var14) >> 16;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) (Math.cos(var17) * (double) var9);
        if (class232.field3690) {
            ((class314) class204.field3358[arg4]).method2208(240, 240, (arg7 + (arg6.field2468 / 2) + var19) * 16, (arg6.field2520 / 2 + arg1 - var20) * 16, (int) (var17 * 10430.378D), 4096);
        } else {
            ((class220) class204.field3358[arg4]).method1569(var19 + arg7 + (arg6.field2468 / 2) - 10, arg1 - -(arg6.field2520 / 2) + -var20 + -10, 20, 20, 15, 15, var17, 256);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V", line = 59)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class232.field3690) {
            this.method1322((byte) 125, true);
        } else {
            this.method1321(29098, arg4, arg3);
        }
        field2912++;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIZLj;)V", line = 551)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class7 arg8) {
        this.field2926 = arg1;
        this.field2910 = arg3;
        this.field2924 = arg2;
        this.field2915 = arg5;
        this.field2918 = arg4;
        this.field2927 = arg0;
        if (class232.field3690 && arg8 != null) {
            if ((arg8 instanceof class175)) {
                ((class175) arg8).method1316((byte) -29);
            } else {
                class97 var10 = class69.method454(false, this.field2927);
                if (var10.field1387 != null) {
                    var10 = var10.method656((byte) 7);
                }
                if (var10 != null) {
                    class217.method1549(0, this.field2926, this.field2924, var10, 0, this.field2915, this.field2910, 24, this.field2918);
                }
            }
        }
        if (arg6 != -1) {
            this.field2922 = class325.method2274(arg6, -123);
            this.field2902 = 0;
            if (this.field2922.field3293.length <= 1) {
                this.field2911 = 0;
            } else {
                this.field2911 = 1;
            }
            this.field2893 = 1;
            this.field2906 = class240.field3818 - 1;
            if (this.field2922.field3291 == 0 && arg8 != null && arg8 instanceof class175) {
                class175 var11 = (class175) arg8;
                if (this.field2922 == var11.field2922) {
                    this.field2906 = var11.field2906;
                    this.field2902 = var11.field2902;
                    this.field2911 = var11.field2911;
                    this.field2893 = var11.field2893;
                    return;
                }
            }
            if (arg7 && this.field2922.field3301 != -1) {
                this.field2902 = (int) ((double) this.field2922.field3293.length * Math.random());
                this.field2911 = this.field2902 + 1;
                if (this.field2911 >= this.field2922.field3293.length) {
                    this.field2911 -= this.field2922.field3301;
                    if (this.field2911 < 0 || this.field2922.field3293.length <= this.field2911) {
                        this.field2911 = -1;
                    }
                }
                this.field2893 = ((int) ((double) this.field2922.field3290[this.field2902] * Math.random())) + 1;
                this.field2906 = class240.field3818 - this.field2893;
            }
        }
        if (class232.field3690 && arg8 != null) {
            this.method1322((byte) 125, true);
        }
        if (arg8 == null) {
            class97 var12 = class69.method454(false, this.field2927);
            if (var12.field1387 != null) {
                this.field2921 = true;
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIJILpe;)V", line = 82)
    public final void method38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class294 arg10) {
        field2923++;
        class7 var13 = this.method1323(0);
        if (var13 != null) {
            var13.method38(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2897);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()I", line = 104)
    public final int method33() {
        field2900++;
        return this.field2929;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 114)
    public static void method1315(byte arg0) {
        field2895 = null;
        field2901 = null;
        field2899 = null;
        field2898 = null;
        if (arg0 < 115) {
            method1320(-36, -101);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V", line = 135)
    public final void method1316(byte arg0) {
        if (this.field2896 != null) {
            class241.method1734(this.field2896, this.field2907, this.field2904, this.field2930);
        }
        this.field2914 = -1;
        this.field2896 = null;
        field2928++;
        this.field2917 = -1;
        int var2 = -73 / ((29 - arg0) / 39);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BC)Z", line = 151)
    public static final boolean method1317(byte arg0, char arg1) {
        field2916++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ') {
            return true;
        } else {
            if (arg0 != -1) {
                method1318((int[]) null, -82, 58L, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([IIJZ)Ljava/lang/String;", line = 185)
    public static final String method1318(int[] arg0, int arg1, long arg2, boolean arg3) {
        field2908++;
        if (class295.field4676 != null) {
            String var5 = class295.field4676.method630((byte) -76, arg2, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3) {
            field2909 = 20;
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIII)V", line = 208)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2919++;
        class344 var5 = class110.method759(arg0, arg3, false);
        var5.method2390((byte) -109);
        var5.field5344 = arg2;
        var5.field5354 = arg4;
        var5.field5349 = arg1;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I", line = 236)
    public static final int method1320(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V", line = 251)
    protected final void finalize() {
        field2913++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V", line = 260)
    private final void method1321(int arg0, int arg1, int arg2) {
        if (arg0 != 29098) {
            this.field2902 = 107;
        }
        if (this.field2922 != null) {
            int var4 = class240.field3818 - this.field2906;
            if (var4 > 100 && this.field2922.field3301 > 0) {
                int var5 = this.field2922.field3293.length - this.field2922.field3301;
                while (var5 > this.field2902 && var4 > this.field2922.field3290[this.field2902]) {
                    var4 -= this.field2922.field3290[this.field2902];
                    this.field2902++;
                }
                if (var5 <= this.field2902) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2922.field3293.length; var7++) {
                        var6 += this.field2922.field3290[var7];
                    }
                    var4 %= var6;
                }
                this.field2911 = this.field2902 + 1;
                if (this.field2922.field3293.length <= this.field2911) {
                    this.field2911 -= this.field2922.field3301;
                    if (this.field2911 < 0 || this.field2911 >= this.field2922.field3293.length) {
                        this.field2911 = -1;
                    }
                }
            }
            while (this.field2922.field3290[this.field2902] < var4) {
                class190.method1411(31, false, this.field2922, arg1, this.field2902, arg2);
                var4 -= this.field2922.field3290[this.field2902];
                this.field2902++;
                if (this.field2922.field3293.length <= this.field2902) {
                    this.field2902 -= this.field2922.field3301;
                    if (this.field2902 < 0 || this.field2902 >= this.field2922.field3293.length) {
                        this.field2922 = null;
                        break;
                    }
                }
                this.field2911 = this.field2902 + 1;
                if (this.field2911 >= this.field2922.field3293.length) {
                    this.field2911 -= this.field2922.field3301;
                    if (this.field2911 < 0 || this.field2911 >= this.field2922.field3293.length) {
                        this.field2911 = -1;
                    }
                }
            }
            this.field2893 = var4;
            this.field2906 = class240.field3818 - var4;
        }
        field2903++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)Lj;", line = 350)
    private final class7 method1322(byte arg0, boolean arg1) {
        field2905++;
        boolean var3 = class97.field1380 != class110.field1642;
        class97 var4 = class69.method454(false, this.field2927);
        int var5 = var4.field1351;
        if (arg0 != 125) {
            field2898 = (int[]) null;
        }
        if (var4.field1387 != null) {
            var4 = var4.method656((byte) 7);
        }
        if (var4 == null) {
            if (class232.field3690 && !var3) {
                this.method1316((byte) 81);
            }
            return null;
        }
        if (class15.field169 != 0 && this.field2921 && (this.field2922 == null || this.field2922 != null && this.field2922.field3288 != var4.field1351)) {
            int var6 = var4.field1351;
            if (var4.field1351 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field2922 = null;
            } else {
                this.field2922 = class325.method2274(var6, -58);
            }
            if (this.field2922 != null) {
                if (var4.field1329 && this.field2922.field3301 != -1) {
                    this.field2902 = (int) ((double) this.field2922.field3293.length * Math.random());
                    this.field2906 -= (int) (Math.random() * (double) this.field2922.field3290[this.field2902]);
                } else {
                    this.field2902 = 0;
                    this.field2906 = class240.field3818 - 1;
                }
            }
        }
        int var7 = this.field2924 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var8 = var4.field1337;
            var9 = var4.field1343;
        } else {
            var8 = var4.field1343;
            var9 = var4.field1337;
        }
        int var10 = this.field2918 + (var9 >> 1);
        int var11 = (var8 >> 1) + this.field2915;
        int var12 = (var9 + 1 >> 1) + this.field2918;
        int var13 = (var8 + 1 >> 1) + this.field2915;
        this.method1321(arg0 + 28973, var11 * 128, var10 * 128);
        boolean var14 = !var3 && var4.field1364 && (this.field2917 != var4.field1345 || (this.field2914 != this.field2902 || this.field2922 != null && (this.field2922.field3296 || class98.field1399) && this.field2911 != this.field2902) && class18.field250 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class110.field1642[this.field2910];
        int var16 = var15[var10][var11] + var15[var12][var13] - (-var15[var12][var11] - var15[var10][var13]) >> 2;
        int var17 = (this.field2918 << 7) + (var9 << 6);
        int[][] var18 = (int[][]) null;
        if (var3) {
            var18 = class97.field1380[0];
        } else if (this.field2910 < 3) {
            var18 = class110.field1642[this.field2910 + 1];
        }
        int var19 = (this.field2915 << 7) + (var8 << 6);
        if (class232.field3690 && var14) {
            class241.method1734(this.field2896, this.field2907, this.field2904, this.field2930);
        }
        boolean var20 = this.field2896 == null;
        class67 var21;
        if (this.field2922 == null) {
            var21 = var4.method657(this.field2924, -94, var20 ? class99.field1438 : this.field2896, var19, var17, var14, this.field2926, var18, var15, var16, false);
        } else {
            var21 = var4.method648(this.field2911, -10, this.field2924, this.field2902, this.field2893, this.field2922, this.field2926, var15, var14, var16, var20 ? class99.field1438 : this.field2896, var18, var17, var19);
        }
        if (var21 == null) {
            return null;
        }
        if (class232.field3690 && var14) {
            int var22 = 0;
            if (var20) {
                class99.field1438 = var21.field959;
            }
            if (this.field2910 != 0) {
                int[][] var23 = class110.field1642[0];
                var22 = var16 - (var23[var10][var11] + var23[var12][var11] + var23[var10][var13] + var23[var12][var13] >> 2);
            }
            class326 var24 = var21.field959;
            if (this.field2894 && class241.method1732(var24, var17, var22, var19)) {
                this.field2894 = false;
            }
            if (!this.field2894) {
                class241.method1724(var24, var17, var22, var19);
                this.field2907 = var17;
                this.field2930 = var19;
                if (var20) {
                    class99.field1438 = null;
                }
                this.field2896 = var24;
                this.field2904 = var22;
            }
            this.field2917 = var4.field1345;
            this.field2914 = this.field2902;
        }
        return var21.field964;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)Lj;", line = 515)
    public final class7 method1323(int arg0) {
        if (arg0 != 0) {
            this.field2907 = -74;
        }
        field2892++;
        return this.method1322((byte) 125, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILak;)[Lrg;", line = 526)
    public static final class326[] method1324(int arg0, int arg1, int arg2, class172 arg3) {
        if (arg2 > -113) {
            return (class326[]) null;
        } else {
            field2920++;
            return class55.method353(arg3, arg0, (byte) -5, arg1) ? class166.method1219(110) : null;
        }
    }
}
