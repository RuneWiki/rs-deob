import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class155 extends class105 {

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "I")
    private int field2862 = 409;

    @OriginalMember(owner = "client!pj", name = "X", descriptor = "I")
    private int field2870 = 0;

    @OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
    private int field2868 = 1024;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "I")
    private int field2866 = 81;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    private int field2875 = 4;

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "I")
    private int field2881 = 204;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    private int field2878 = 8;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    private int field2879 = 1024;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "Z")
    public static boolean field2861 = false;

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "Lvf;")
    public static class265 field2876 = class87.method582(-46, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!pj", name = "W", descriptor = "I")
    private int field2869;

    @OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!pj", name = "Z", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "I")
    private int field2877;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    private int field2880;

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "[I")
    private int[] field2874;

    @OriginalMember(owner = "client!pj", name = "Q", descriptor = "[[I")
    private int[][] field2863;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "[[I")
    private int[][] field2864;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        ++field2867;
        if (arg0) {
            method1057(124);
        }
        this.method1055(-25565);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLvf;)I")
    public static final int method1052(byte arg0, class265 arg1) {
        ++field2872;
        int var2 = 120 % ((arg0 - 77) / 32);
        return arg1.method1808((byte) -15) - -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z")
    public static final boolean method1053(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class65.field1262; ++var3) {
            class201 var4 = class233.field4111[var3];
            if (var4.field3609 == 1) {
                int var5 = var4.field3599 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3597 * var5 >> 8) + var4.field3595;
                    int var7 = (var4.field3608 * var5 >> 8) + var4.field3598;
                    int var8 = (var4.field3594 * var5 >> 8) + var4.field3596;
                    int var9 = (var4.field3601 * var5 >> 8) + var4.field3590;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3609 == 2) {
                int var10 = arg0 - var4.field3599;
                if (var10 > 0) {
                    int var11 = (var4.field3597 * var10 >> 8) + var4.field3595;
                    int var12 = (var4.field3608 * var10 >> 8) + var4.field3598;
                    int var13 = (var4.field3594 * var10 >> 8) + var4.field3596;
                    int var14 = (var4.field3601 * var10 >> 8) + var4.field3590;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3609 == 3) {
                int var15 = var4.field3595 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3582 * var15 >> 8) + var4.field3599;
                    int var17 = (var4.field3593 * var15 >> 8) + var4.field3592;
                    int var18 = (var4.field3594 * var15 >> 8) + var4.field3596;
                    int var19 = (var4.field3601 * var15 >> 8) + var4.field3590;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3609 == 4) {
                int var20 = arg2 - var4.field3595;
                if (var20 > 0) {
                    int var21 = (var4.field3582 * var20 >> 8) + var4.field3599;
                    int var22 = (var4.field3593 * var20 >> 8) + var4.field3592;
                    int var23 = (var4.field3594 * var20 >> 8) + var4.field3596;
                    int var24 = (var4.field3601 * var20 >> 8) + var4.field3590;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3609 == 5) {
                int var25 = arg1 - var4.field3596;
                if (var25 > 0) {
                    int var26 = (var4.field3582 * var25 >> 8) + var4.field3599;
                    int var27 = (var4.field3593 * var25 >> 8) + var4.field3592;
                    int var28 = (var4.field3597 * var25 >> 8) + var4.field3595;
                    int var29 = (var4.field3608 * var25 >> 8) + var4.field3598;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public static final void method1054(byte arg0) {
        class54.field1112.method1893(-93);
        ++field2882;
        if (arg0 >= -68) {
            method1057(-7);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field2879 = arg2.method927(126);
                                    }
                                } else {
                                    this.field2866 = arg2.method927(127);
                                }
                            } else {
                                this.field2870 = arg2.method927(127);
                            }
                        } else {
                            this.field2868 = arg2.method927(arg1 + -129);
                        }
                    } else {
                        this.field2881 = arg2.method927(125);
                    }
                } else {
                    this.field2862 = arg2.method927(127);
                }
            } else {
                this.field2878 = arg2.method920((byte) 111);
            }
        } else {
            this.field2875 = arg2.method920((byte) 82);
        }
        if (arg1 != 255) {
            this.method16(-3, 69);
        }
        ++field2883;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
    private final void method1055(int arg0) {
        ++field2865;
        Random var2 = new Random((long) this.field2878);
        this.field2874 = new int[this.field2878 + 1];
        this.field2874[0] = 0;
        this.field2863 = new int[this.field2878][this.field2875 + 1];
        this.field2864 = new int[this.field2878][this.field2875];
        this.field2877 = this.field2866 / 2;
        this.field2869 = 4096 / this.field2878;
        int var3 = this.field2869 / 2;
        this.field2880 = 4096 / this.field2875;
        int var4 = this.field2880 / 2;
        if (arg0 != -25565) {
            method1057(32);
        }
        for (int var5 = 0; var5 < this.field2878; ++var5) {
            if (var5 > 0) {
                int var6 = this.field2869;
                int var7 = (class100.method664((byte) -86, var2, 4096) - 2048) * this.field2881 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2874[var5] = this.field2874[var5 + -1] + var8;
            }
            this.field2863[var5][0] = 0;
            for (int var9 = 0; this.field2875 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2880;
                    int var11 = (-2048 + class100.method664((byte) -86, var2, 4096)) * this.field2862 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2863[var5][var9] = this.field2863[var5][var9 + -1] + var12;
                }
                this.field2864[var5][var9] = ~this.field2879 >= -1 ? 4096 : -class100.method664((byte) -86, var2, this.field2879) + 4096;
            }
            this.field2863[var5][this.field2875] = 4096;
        }
        this.field2874[this.field2878] = 4096;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)Lfg;")
    public static final class181 method1056(int arg0, int arg1, int arg2, int arg3) {
        class181 var4 = new class181();
        var4.field3219 = arg1;
        ++field2859;
        var4.field3217 = arg2;
        class49.field1042.method1838((long) arg0, var4, (byte) 8);
        class281.method1914(-1, arg2);
        class6 var5 = class21.method204(arg0, -16257);
        if (var5 != null) {
            class176.method1145((byte) 126, var5);
        }
        if (class209.field3760 != null) {
            class176.method1145((byte) 101, class209.field3760);
            class209.field3760 = null;
        }
        int var6 = class120.field2129;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class117.method786((byte) 98, class118.field2079[var7])) {
                class43.method362(-111, var7);
            }
        }
        if (~class120.field2129 == arg3) {
            class50.field1049 = false;
            class169.method1117(-58, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
        } else {
            class169.method1117(-32, class172.field3103, class182.field3227, class130.field2335, class279.field4926);
            int var8 = class205.field3692.method754(class103.field1833);
            for (int var9 = 0; var9 < class120.field2129; ++var9) {
                int var10 = class205.field3692.method754(class118.method798(var9, 1927674668));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class279.field4926 = var8 + 8;
            class172.field3103 = (!class97.field1711 ? 22 : 26) + class120.field2129 * 15;
        }
        if (var5 != null) {
            class126.method841(false, (byte) 90, var5);
        }
        class116.method778(arg2, (byte) 86);
        if (~class8.field271 != 0) {
            class93.method637(1, class8.field271, 104);
        }
        return var4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            this.method1055(53);
        }
        ++field2860;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = 0;
            int var5;
            for (var5 = class219.field3951[arg1] - -this.field2870; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field2878 > var4 && ~this.field2874[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            int var7 = this.field2874[var4 + -1];
            boolean var8 = (var4 & 1) == 0;
            int var9 = this.field2874[var4];
            if (var7 - -this.field2877 < var5 && var5 < -this.field2877 + var9) {
                for (int var10 = 0; ~class94.field1668 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var8 ? this.field2868 : -this.field2868;
                    int var13;
                    for (var13 = (this.field2880 * var12 >> 12) + class277.field4894[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field2875 > var11 && ~this.field2863[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field2863[var6][var14];
                    int var16 = this.field2863[var6][var11];
                    if (~var13 < ~(this.field2877 + var15) && var13 < -this.field2877 + var16) {
                        var3[var10] = this.field2864[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class194.method1346(var3, 0, class94.field1668, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "(I)V")
    public static void method1057(int arg0) {
        if (arg0 != 22) {
            method1052((byte) 71, (class265) null);
        }
        field2876 = null;
    }
}
