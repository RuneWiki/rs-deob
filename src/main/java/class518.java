import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class518 {

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "Z")
    private boolean field7292 = false;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    private int field7309 = 0;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    private int field7290 = -1;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    private int field7304 = -1;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "Z")
    private boolean field7298 = false;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
    private int field7314 = 0;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    private int field7300 = -1;

    @OriginalMember(owner = "client!mw", name = "L", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "B")
    private byte field7321;

    @OriginalMember(owner = "client!mw", name = "w", descriptor = "B")
    private byte field7307;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public int field7296;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public int field7289;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "Lgda;")
    private class61 field7320;

    @OriginalMember(owner = "client!mw", name = "H", descriptor = "Z")
    private boolean field7318;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "[[Z")
    public static boolean[][] field7288 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    private int field7287;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    private int field7302;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "I")
    private int field7311;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
    private int field7315;

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "Lr;")
    private class196 field7312;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "Lgt;")
    private class481 field7286;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "Lka;")
    private class498 field7285;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "Lfs;")
    private class582 field7316;

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "Lsia;")
    public class766 field7301;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "[Z")
    private boolean[] field7313;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I", line = 4)
    public final int method3098(byte arg0) {
        if (arg0 == -15) {
            field7297++;
            return this.field7309;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILha;)V", line = 17)
    public final void method3099(int arg0, class66 arg1) {
        this.method3102(262144, true, true, -106, arg1);
        if (arg0 != -1) {
            field7310 = 75;
        }
        field7293++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V", line = 31)
    private final void method3100(int arg0, int arg1) {
        field7319++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class174 var5 = class379.field4811.method4192(27324, this.field7296);
            class174 var6 = var5;
            if (var5.field2157 != null) {
                var5 = var5.method1178(false, class2.field30);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field2086 != null) {
                if (this.field7316 != null && var5.method1179(this.field7316.field7952, arg1 ^ 0xFFFFFF98)) {
                    return;
                }
                var3 = var5.method1186(-64);
                if (this.field7304 != var5.field2166) {
                    var4 = var5.field2169;
                }
            } else if (var5.field2146 == -1) {
                if (var6 != null && var6.field2086 != null) {
                    if (this.field7316 != null && var6.method1179(this.field7316.field7952, arg1 - 99)) {
                        return;
                    }
                    var3 = var6.method1186(arg1 - 124);
                    if (this.field7304 != var6.field2166) {
                        var4 = var6.field2169;
                    }
                } else if (var6 != null && var6.field2146 != -1 && this.field7304 != var6.field2166) {
                    var3 = var6.field2146;
                    var4 = var6.field2169;
                }
            } else if (this.field7304 != var5.field2166) {
                var4 = var5.field2169;
                var3 = var5.field2146;
            }
        }
        if (arg1 == var3) {
            this.field7316 = null;
            return;
        }
        this.field7285 = null;
        if (this.field7316 == null || this.field7316.field7952 != var3) {
            this.field7316 = class362.field4504.method3600(-42, var3);
        } else if (this.field7316.field7941 == 0) {
            return;
        }
        if (this.field7316.field7955 == null) {
            this.field7316 = null;
            return;
        }
        if (var4) {
            this.field7315 = (int) (Math.random() * (double) this.field7316.field7955.length);
            this.field7287 = (int) (Math.random() * (double) this.field7316.field7936[this.field7315]) + 1;
        } else {
            this.field7287 = 1;
            this.field7315 = 0;
        }
        this.field7311 = this.field7315 + 1;
        if (this.field7311 < 0 || this.field7311 >= this.field7316.field7955.length) {
            this.field7311 = -1;
        }
        this.field7302 = class228.field2707 - this.field7287;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILgt;)V", line = 150)
    public final void method3101(int arg0, class481 arg1) {
        if (arg0 != 0) {
            this.method3106(true);
        }
        this.field7286 = arg1;
        this.field7285 = null;
        field7299++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZZILha;)Lka;", line = 163)
    public final class498 method3102(int arg0, boolean arg1, boolean arg2, int arg3, class66 arg4) {
        field7305++;
        class174 var6 = class379.field4811.method4192(27324, this.field7296);
        if (var6.field2157 != null) {
            var6 = var6.method1178(false, class2.field30);
        }
        if (var6 == null) {
            this.method3110(arg4, (byte) 98);
            this.field7300 = -1;
            this.field7290 = -1;
            this.field7304 = -1;
            return null;
        }
        if (!this.field7292 && this.field7304 != var6.field2166) {
            this.field7285 = null;
            this.method3100(-1, -1);
        }
        this.method3103(-100, this.field7320);
        if (arg2) {
            boolean var7 = arg2 & this.field7318 & class118.field1503.field10672.method4113(0) != 0;
            arg2 = var7 & (this.field7290 != var6.field2166 || this.field7316 != null && class118.field1503.field10672.method4113(0) >= 2 && (this.field7315 != this.field7300 || (this.field7316.field7944 || class688.field9381) && this.field7315 != this.field7311));
        }
        if (arg1 && !arg2) {
            this.field7304 = var6.field2166;
            return null;
        }
        if (arg2) {
            class418.method2496(this.field7312, this.field7321, this.field7320.field823, this.field7320.field813, this.field7313);
            this.field7300 = -1;
            this.field7290 = -1;
        }
        class296 var8 = class621.field8523[this.field7321];
        if (arg3 > -23) {
            this.method3100(64, 26);
        }
        class296 var9;
        if (this.field7298) {
            var9 = class707.field9933[0];
        } else {
            var9 = this.field7321 < 3 ? class621.field8523[this.field7321 + 1] : null;
        }
        class498 var10 = null;
        if (this.field7316 != null) {
            if (arg2) {
                arg0 |= 0x40000;
            }
            var10 = var6.method1185(this.field7315, this.field7320.field813, arg0, (byte) 3, arg4, this.field7289 == 11 ? 10 : this.field7289, this.field7289 == 11 ? this.field7322 + 4 : this.field7322, this.field7316, var8.method1730(this.field7320.field823, this.field7320.field813, -1), this.field7287, var8, this.field7320.field823, this.field7286, this.field7311, var9);
            if (var10 == null) {
                this.field7309 = 0;
                this.field7312 = null;
                this.field7314 = 0;
                this.field7313 = null;
            } else {
                if (arg2) {
                    if (this.field7313 == null) {
                        this.field7313 = new boolean[4];
                    }
                    this.field7312 = var10.method365(this.field7312);
                    class793.method4371(this.field7312, this.field7321, this.field7320.field823, this.field7320.field813, this.field7313);
                    this.field7290 = var6.field2166;
                    this.field7300 = this.field7315;
                }
                this.field7314 = var10.method404();
                this.field7309 = var10.method394();
            }
            this.field7285 = null;
        } else if (this.field7285 != null && (arg0 & this.field7285.method396()) == arg0 && this.field7304 == var6.field2166) {
            var10 = this.field7285;
        } else {
            if (this.field7285 != null) {
                arg0 |= this.field7285.method396();
            }
            class37 var11 = var6.method1181(this.field7320.field823, this.field7320.field813, var8, arg4, (byte) 122, var9, arg0, this.field7286, arg2, this.field7289 == 11 ? 10 : this.field7289, this.field7289 == 11 ? this.field7322 + 4 : this.field7322, var8.method1730(this.field7320.field823, this.field7320.field813, -1));
            if (var11 == null) {
                this.field7312 = null;
                this.field7314 = 0;
                this.field7285 = null;
                this.field7313 = null;
                this.field7309 = 0;
            } else {
                var10 = var11.field549;
                this.field7285 = var11.field549;
                if (arg2) {
                    this.field7312 = var11.field550;
                    this.field7313 = null;
                    class793.method4371(this.field7312, this.field7321, this.field7320.field823, this.field7320.field813, null);
                    this.field7300 = -1;
                    this.field7290 = var6.field2166;
                }
                this.field7314 = var10.method404();
                this.field7309 = var10.method394();
            }
        }
        this.field7304 = var6.field2166;
        return var10;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILgda;)V", line = 312)
    private final void method3103(int arg0, class61 arg1) {
        field7294++;
        if (arg0 > -61) {
            this.field7315 = 76;
        }
        label90: while (true) {
            if (this.field7316 == null) {
                if (this.field7292) {
                    return;
                }
                this.method3100(-1, -1);
                if (this.field7316 == null) {
                    return;
                }
            }
            int var3 = class228.field2707 - this.field7302;
            if (var3 > 100 && this.field7316.field7957 > 0) {
                int var4 = this.field7316.field7955.length - this.field7316.field7957;
                while (var4 > this.field7315 && var3 > this.field7316.field7936[this.field7315]) {
                    var3 -= this.field7316.field7936[this.field7315];
                    this.field7315++;
                }
                if (this.field7315 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field7316.field7955.length; var6++) {
                        var5 += this.field7316.field7936[var6];
                    }
                    var3 %= var5;
                }
                this.field7311 = this.field7315 + 1;
                if (this.field7311 >= this.field7316.field7955.length) {
                    this.field7311 -= this.field7316.field7957;
                    if (this.field7311 < 0 || this.field7316.field7955.length <= this.field7311) {
                        this.field7311 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var3 <= this.field7316.field7936[this.field7315]) {
                            this.field7287 = var3;
                            this.field7302 = class228.field2707 - var3;
                            return;
                        }
                        class60.method520(this.field7315, (byte) -72, arg1, this.field7316);
                        var3 -= this.field7316.field7936[this.field7315];
                        this.field7315++;
                        if (this.field7315 >= this.field7316.field7955.length) {
                            this.field7315 -= this.field7316.field7957;
                            if (this.field7315 < 0 || this.field7316.field7955.length <= this.field7315) {
                                this.field7316 = null;
                                continue label90;
                            }
                        }
                        this.field7311 = this.field7315 + 1;
                    } while (this.field7316.field7955.length > this.field7311);
                    this.field7311 -= this.field7316.field7957;
                } while (this.field7311 >= 0 && this.field7316.field7955.length > this.field7311);
                this.field7311 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZI)V", line = 408)
    public final void method3104(boolean arg0, int arg1) {
        field7308++;
        if (arg0) {
            this.method3101(-85, null);
        }
        this.field7292 = true;
        this.method3100(arg1, -1);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V", line = 426)
    public static void method3105(int arg0) {
        int var1 = -4 / ((arg0 + 58) / 50);
        field7288 = null;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Z)I", line = 435)
    public final int method3106(boolean arg0) {
        field7295++;
        return arg0 ? -61 : this.field7314;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lgda;[Lkp;)V", line = 446)
    public static final void method3107(class61 arg0, class515[] arg1) {
        if (class341.field4281) {
            int var2 = arg0.method528((byte) -48, arg1);
            class6.field80.method587(var2, arg1);
        }
        if (class704.field9910 == class621.field8523) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class712) {
                var5 = ((class712) arg0).field9994;
                var6 = ((class712) arg0).field9997;
            } else {
                var5 = arg0.field823 >> class714.field10017;
                var6 = arg0.field813 >> class714.field10017;
            }
            class6.field80.method555(class707.field9933[0].method1730(arg0.field823, arg0.field813, -1), class61.method532(var5, var6), class188.method1244(var5, var6), class35.method315(var5, var6));
        }
        class35 var7 = arg0.method502(-30, class6.field80);
        if (var7 == null) {
            return;
        }
        if (arg0.field810) {
            class265[] var8 = var7.field537;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class265 var10 = var8[var9];
                if (var10.field3137) {
                    class326.method1945(var10.field3133 - var10.field3134, var10.field3135 + var10.field3134, var10.field3136 - var10.field3134, var10.field3138 + var10.field3134, false);
                }
            }
        }
        if (var7.field534) {
            var7.field535 = arg0;
            if (class309.field3847) {
                class497 var11 = class613.field8242;
                synchronized (class613.field8242) {
                    class613.field8242.method2936(var7, 6);
                    return;
                }
            }
            class613.field8242.method2936(var7, 6);
            return;
        }
        class548.method3224(var7, false);
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)Z", line = 517)
    public final boolean method3108(byte arg0) {
        field7317++;
        if (arg0 != 119) {
            this.method3109(true, 25, 44, null, -3, 24, null, -14, null);
        }
        return this.field7318;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lha;Ltba;IIIILgda;ZI)V", line = 635)
    public class518(class66 arg0, class174 arg1, int arg2, int arg3, int arg4, int arg5, class61 arg6, boolean arg7, int arg8) {
        this.field7322 = arg3;
        this.field7321 = (byte) arg5;
        this.field7307 = (byte) arg4;
        this.field7296 = arg1.field2166;
        this.field7289 = arg2;
        this.field7298 = arg7;
        this.field7320 = arg6;
        this.field7318 = arg0.method646() && arg1.field2141 && !this.field7298;
        if (arg8 != -1) {
            this.field7292 = true;
        }
        this.method3100(arg8, -1);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(ZIILka;IILnh;ILha;)V", line = 555)
    public final void method3109(boolean arg0, int arg1, int arg2, class498 arg3, int arg4, int arg5, class778 arg6, int arg7, class66 arg8) {
        if (arg4 != -17230) {
            return;
        }
        field7291++;
        class62[] var10 = arg3.method371();
        class28[] var11 = arg3.method370();
        if ((this.field7301 == null || this.field7301.field10547) && (var10 != null || var11 != null)) {
            class174 var12 = class379.field4811.method4192(arg4 ^ 0xFFFFD60E, this.field7296);
            if (var12.field2157 != null) {
                var12 = var12.method1178(false, class2.field30);
            }
            if (var12 != null) {
                this.field7301 = class766.method4253(class228.field2707, true);
            }
        }
        if (this.field7301 == null) {
            return;
        }
        arg3.method389(arg6);
        if (arg0) {
            this.field7301.method4250(arg8, (long) class228.field2707, var10, var11, false);
        } else {
            this.field7301.method4245((long) class228.field2707);
        }
        this.field7301.method4240(this.field7307, arg2, arg1, arg7, arg5);
    }

    @OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V", line = 597)
    protected final void finalize() {
        if (this.field7301 != null) {
            this.field7301.method4247();
        }
        field7306++;
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lha;B)V", line = 615)
    public final void method3110(class66 arg0, byte arg1) {
        if (arg1 != 98) {
            this.method3106(true);
        }
        field7323++;
        if (this.field7312 != null) {
            class418.method2496(this.field7312, this.field7321, this.field7320.field823, this.field7320.field813, this.field7313);
            this.field7312 = null;
            this.field7313 = null;
        }
    }
}
