import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class134 extends class103 {

    @OriginalMember(owner = "client!wc", name = "Ib", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!wc", name = "Fb", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "I")
    private int field3225;

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
    private int field3233;

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
    private int field3231;

    @OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
    private int field3250;

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "Lm;")
    private class72 field3229;

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
    private int field3241;

    @OriginalMember(owner = "client!wc", name = "Pb", descriptor = "I")
    private int field3247;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "Lad;")
    public static class5 field3226 = class88.method674("Das ist eine Mitglieder)2Welt(Q", -92);

    @OriginalMember(owner = "client!wc", name = "Hb", descriptor = "I")
    public static int field3239 = 0;

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "Lad;")
    private static class5 field3235 = class88.method674("Enter message to send to ", -90);

    @OriginalMember(owner = "client!wc", name = "Ob", descriptor = "I")
    public static volatile int field3246 = 0;

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "Lad;")
    private static class5 field3242 = class88.method674("Loaded update list", -128);

    @OriginalMember(owner = "client!wc", name = "Gb", descriptor = "Lad;")
    public static class5 field3238 = field3235;

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "I")
    public static int field3230 = 0;

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "Lad;")
    public static class5 field3234 = field3242;

    @OriginalMember(owner = "client!wc", name = "Tb", descriptor = "Lad;")
    public static class5 field3251 = class88.method674(":chalreq:", 102);

    @OriginalMember(owner = "client!wc", name = "Ub", descriptor = "I")
    public static int field3252 = 0;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!wc", name = "Eb", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!wc", name = "Mb", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!wc", name = "Nb", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!wc", name = "Lb", descriptor = "Luc;")
    public static class123 field3243;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lhc;", line = 13)
    public final class45 method30(byte arg0) {
        field3232++;
        if (this.field3229 != null) {
            int var2 = class69.field1636 - this.field3241;
            if (var2 > 100 && this.field3229.field1732 > 0) {
                var2 = 100;
            }
            label38: {
                do {
                    do {
                        if (var2 <= this.field3229.field1742[this.field3247]) {
                            break label38;
                        }
                        var2 -= this.field3229.field1742[this.field3247];
                        this.field3247++;
                    } while (this.field3247 < this.field3229.field1727.length);
                    this.field3247 -= this.field3229.field1732;
                } while (this.field3247 >= 0 && this.field3229.field1727.length > this.field3247);
                this.field3229 = null;
            }
            this.field3241 = class69.field1636 - var2;
        }
        class70 var3 = class42.method357(this.field3237, (byte) -42);
        if (var3.field1655 != null) {
            var3 = var3.method551(-124);
        }
        if (var3 == null) {
            return null;
        } else {
            int var4 = 2 / ((-arg0 - 14) / 59);
            return var3.method548(this.field3228, this.field3240, this.field3229, this.field3231, this.field3225, this.field3247, this.field3250, (byte) 125, this.field3233);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)V", line = 83)
    public static final void method1030(int arg0, long arg1) {
        field3249++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class32.field769; var3++) {
            if (class14.field400[var3] == arg1) {
                class32.field769--;
                class10.field331++;
                class43.field1086 = true;
                for (int var4 = var3; var4 < class32.field769; var4++) {
                    class14.field400[var4] = class14.field400[var4 + 1];
                }
                class5.field163.method209(45, 10);
                class5.field163.method340(arg1, -176768048);
                break;
            }
        }
        if (arg0 > -37) {
            method1033(-38);
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V", line = 127)
    public static void method1031(int arg0) {
        field3235 = null;
        field3243 = null;
        if (arg0 != -1) {
            field3242 = null;
        }
        field3226 = null;
        field3234 = null;
        field3242 = null;
        field3251 = null;
        field3238 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)Lub;", line = 152)
    public static final class122 method1032(int arg0, int arg1, int arg2, int arg3) {
        field3236++;
        if (arg2 == 0) {
            class122 var4 = (class122) class108.field2711.method98(-8, (long) arg0);
            if (var4 != null && var4.field3018 != arg3 && var4.field3018 != -1) {
                var4.method114(-3789);
                var4 = null;
            }
            if (var4 != null) {
                return var4;
            }
        }
        class27 var5 = class3.method21((byte) 17, arg0);
        if (var5.field698 == null) {
            arg3 = -1;
        }
        if (arg3 > 1) {
            int var6 = -1;
            for (int var7 = 0; var7 < 10; var7++) {
                if (arg3 >= var5.field703[var7] && var5.field703[var7] != 0) {
                    var6 = var5.field698[var7];
                }
            }
            if (var6 != -1) {
                var5 = class3.method21((byte) 56, var6);
            }
        }
        class45 var8 = var5.method231(true, 30702, 1);
        if (var8 == null) {
            return null;
        }
        class122 var9 = null;
        if (var5.field673 != -1) {
            var9 = method1032(var5.field690, arg1, -1, 10);
            if (var9 == null) {
                return null;
            }
        }
        int[] var10 = class55.field1380;
        int var11 = class55.field1381;
        int var12 = class55.field1376;
        int var13 = class55.field1379;
        int var14 = class55.field1375;
        int var15 = class55.field1377;
        int var16 = class55.field1378;
        int[] var17 = class114.method903();
        int var18 = class114.field2830;
        int var19 = class114.field2825;
        class122 var20 = new class122(32, 32);
        class55.method447(var20.field3014, 32, 32);
        class95.field2251 = class114.method906(class95.field2251);
        class55.method443(0, 0, 32, 32, 0);
        class114.field2826 = false;
        int var21 = var5.field681;
        if (arg1 != 14017) {
            return null;
        }
        if (arg2 == -1) {
            var21 = (int) ((double) var21 * 1.5D);
        }
        if (arg2 > 0) {
            var21 = (int) ((double) var21 * 1.04D);
        }
        int var22 = class114.field2831[var5.field683] * var21 >> 16;
        int var23 = class114.field2835[var5.field683] * var21 >> 16;
        var8.method386();
        var8.method394(0, var5.field676, var5.field648, var5.field683, var5.field709, var8.field2505 / 2 + var22 + var5.field662, var5.field662 + var23);
        for (int var24 = 31; var24 >= 0; var24--) {
            for (int var31 = 31; var31 >= 0; var31--) {
                if (var20.field3014[var31 * 32 + var24] == 0) {
                    if (var24 > 0 && var20.field3014[var31 * 32 + var24 - 1] > 1) {
                        var20.field3014[var24 + var31 * 32] = 1;
                    } else if (var31 > 0 && var20.field3014[(var31 - 1) * 32 + var24] > 1) {
                        var20.field3014[var31 * 32 + var24] = 1;
                    } else if (var24 < 31 && var20.field3014[var31 * 32 + var24 + 1] > 1) {
                        var20.field3014[var31 * 32 + var24] = 1;
                    } else if (var31 < 31 && var20.field3014[(var31 + 1) * 32 + var24] > 1) {
                        var20.field3014[var31 * 32 + var24] = 1;
                    }
                }
            }
        }
        if (arg2 > 0) {
            for (int var27 = 31; var27 >= 0; var27--) {
                for (int var30 = 31; var30 >= 0; var30--) {
                    if (var20.field3014[var27 + var30 * 32] == 0) {
                        if (var27 > 0 && var20.field3014[var30 * 32 + var27 - 1] == 1) {
                            var20.field3014[var27 + var30 * 32] = arg2;
                        } else if (var30 > 0 && var20.field3014[(var30 - 1) * 32 + var27] == 1) {
                            var20.field3014[var30 * 32 + var27] = arg2;
                        } else if (var27 < 31 && var20.field3014[var30 * 32 + var27 + 1] == 1) {
                            var20.field3014[var30 * 32 + var27] = arg2;
                        } else if (var30 < 31 && var20.field3014[var27 + (var30 + 1) * 32] == 1) {
                            var20.field3014[var30 * 32 + var27] = arg2;
                        }
                    }
                }
            }
        } else if (arg2 == 0) {
            for (int var25 = 31; var25 >= 0; var25--) {
                for (int var26 = 31; var26 >= 0; var26--) {
                    if (var20.field3014[var25 + var26 * 32] == 0 && var25 > 0 && var26 > 0 && var20.field3014[var26 * 32 + var25 - 32 - 1] > 0) {
                        var20.field3014[var26 * 32 + var25] = 3153952;
                    }
                }
            }
        }
        if (var5.field673 != -1) {
            int var28 = var9.field3016;
            var9.field3016 = 32;
            int var29 = var9.field3018;
            var9.field3018 = 32;
            var9.method964(0, 0);
            var9.field3016 = var28;
            var9.field3018 = var29;
        }
        if (arg2 == 0) {
            class108.field2711.method102((long) arg0, var20, 104);
        }
        class55.method447(var10, var11, var12);
        class55.method454(var15, var14, var13, var16);
        class114.method906(var17);
        class114.field2830 = var18;
        class114.field2825 = var19;
        class114.method909();
        var20.field3018 = arg3;
        if (var5.field695 == 1) {
            var20.field3016 = 33;
        } else {
            var20.field3016 = 32;
        }
        class114.field2826 = true;
        return var20;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)V", line = 424)
    public static final void method1033(int arg0) {
        field3245++;
        if (field3252 > 0) {
            class47.method413((byte) 26);
            return;
        }
        if (arg0 != 40) {
            field3242 = null;
        }
        class69.method541(40, 88);
        class69.field1633 = class59.field1455;
        class59.field1455 = null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 442)
    public class134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field3240 = arg4;
        this.field3237 = arg0;
        this.field3225 = arg3;
        this.field3228 = arg2;
        this.field3233 = arg6;
        this.field3231 = arg5;
        this.field3250 = arg1;
        if (arg7 != -1) {
            this.field3229 = class78.method605(arg7, (byte) 20);
            this.field3241 = class69.field1636 - 1;
            this.field3247 = 0;
            if (arg8 && this.field3229.field1732 != -1) {
                this.field3247 = (int) ((double) this.field3229.field1727.length * Math.random());
                this.field3241 -= (int) ((double) this.field3229.field1742[this.field3247] * Math.random());
                return;
            }
        }
    }
}
