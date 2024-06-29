import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class169 extends class33 {

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    private int field3261 = 2;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field3253 = 1;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    private int field3250 = 0;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    private int field3260 = 5;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    private int field3262 = 2048;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field3251 = 5;

    @OriginalMember(owner = "client!r", name = "ib", descriptor = "I")
    private int field3271 = 25;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "Lrd;")
    private static class173 field3257 = class133.method843("K", 124);

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "Lrd;")
    public static class173 field3259 = field3257;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Lrd;")
    public static class173 field3256 = field3257;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "Lrd;")
    public static class173 field3266 = class133.method843("Bitte laden Sie die Seite neu)3", -83);

    @OriginalMember(owner = "client!r", name = "jb", descriptor = "Lrd;")
    private static class173 field3272 = class133.method843("OFF", -70);

    @OriginalMember(owner = "client!r", name = "kb", descriptor = "Lrd;")
    private static class173 field3273 = class133.method843("flash2:", 104);

    @OriginalMember(owner = "client!r", name = "rb", descriptor = "Lrd;")
    public static class173 field3280 = field3273;

    @OriginalMember(owner = "client!r", name = "qb", descriptor = "Lrd;")
    public static class173 field3279 = field3273;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "Lrd;")
    public static class173 field3269 = field3272;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    private int field3265;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!r", name = "lb", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!r", name = "mb", descriptor = "I")
    private int field3275;

    @OriginalMember(owner = "client!r", name = "ob", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!r", name = "pb", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!r", name = "nb", descriptor = "Lbc;")
    public static class14 field3276;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "Z")
    public static boolean field3255;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "[[I")
    private int[][] field3264;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V")
    public static final void method1087(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class20.field445 = arg4;
        class37.field790 = arg2;
        class194.field3778 = arg3;
        ++field3277;
        class96.field1766 = arg1;
        if (arg0 != 1693) {
            field3276 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIBI)[I")
    private final int[] method1088(int arg0, int arg1, byte arg2, int arg3) {
        int[] var5 = new int[arg3];
        for (int var6 = 0; var6 < arg3; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        ++field3254;
        if (arg2 <= 5) {
            method1089(117, (byte) 54, -26, 62, -94);
        }
        int var7 = this.field3265 + arg1;
        if (~var7 < -4097) {
            var7 -= 4096;
        }
        int var8 = this.field3252 + arg0;
        int var9 = -1;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var10 = this.field3260 * var8 >> 12;
        int var11 = this.field3251 * var7 >> 12;
        int var12 = Integer.MAX_VALUE;
        int var13 = Integer.MAX_VALUE;
        int var14 = this.field3260 <= 2 ? this.field3260 - 1 : 2;
        int var15 = this.field3251 <= 2 ? this.field3251 - 1 : 2;
        int var16 = -1;
        for (int var17 = -var14; ~var14 <= ~var17; ++var17) {
            for (int var25 = -var15; var15 >= var25; ++var25) {
                int var26 = var10 + var17;
                int var27 = var11 + var25;
                if (var27 < 0) {
                    var27 += this.field3251;
                }
                if (this.field3251 <= var27) {
                    var27 -= this.field3251;
                }
                if (var26 < 0) {
                    var26 += this.field3260;
                }
                if (~var26 <= ~this.field3260) {
                    var26 -= this.field3260;
                }
                int var28 = this.field3260 * var27 + var26;
                int var29 = this.field3264[var28][1];
                int var30 = this.field3264[var28][0];
                int var31 = -var29 + var7;
                if (var31 < 0) {
                    var31 = -var31;
                }
                if (~var31 < -2049) {
                    var31 = -var31 + 4096;
                }
                int var32 = -var30 + var8;
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (~var32 < -2049) {
                    var32 = 4096 - var32;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var33 > ~var12) {
                    if (~var16 != 0) {
                        var16 = var9;
                        var13 = var12;
                    } else {
                        var16 = var28;
                        var13 = var33;
                    }
                    var9 = var28;
                    var12 = var33;
                } else if (~var9 == ~var16 && var16 != var28 || ~var13 < ~var33 && var9 != var28) {
                    var16 = var28;
                    var13 = var33;
                }
            }
        }
        int var18 = -this.field3264[var9][0] + var8;
        if (var18 < 0) {
            var18 = -var18;
        }
        int var19 = var8 - this.field3264[var16][0];
        int var20 = -this.field3264[var9][1] + var7;
        if (var18 > 2048) {
            var18 = -var18 + 4096;
        }
        int var21 = -this.field3264[var16][1] + var7;
        if (var20 < 0) {
            var20 = -var20;
        }
        if (var21 < 0) {
            var21 = -var21;
        }
        if (~var19 > -1) {
            var19 = -var19;
        }
        if (~var21 < -2049) {
            var21 = -var21 + 4096;
        }
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        if (~var19 < -2049) {
            var19 = -var19 + 4096;
        }
        int var22 = this.field3253;
        int var23;
        int var24;
        if (~var22 != -2) {
            if (var22 == 2) {
                var23 = Math.max(var18, var20);
                var24 = Math.max(var19, var21);
            } else {
                var24 = var19 * var19 + var21 * var21;
                var23 = var18 * var18 + var20 * var20;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20));
            var24 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21));
        }
        if (~arg3 < -2) {
            var5[1] = this.field3275 * var24;
        }
        var5[0] = this.field3275 * var23;
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)V")
    public static final void method1089(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3258;
        for (int var5 = 0; class67.field1297 > var5; ++var5) {
            if (~arg3 > ~(class179.field3520[var5] + class167.field3215[var5]) && ~class179.field3520[var5] > ~(arg3 - -arg0) && ~arg4 > ~(class36.field776[var5] + class145.field2707[var5]) && class36.field776[var5] < arg2 + arg4) {
                class177.field3477[var5] = true;
            }
        }
        int var6 = -125 % ((arg1 - 14) / 53);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field3268;
        this.method1090(0);
        if (arg0 != -1) {
            this.method175(-54, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    private final void method1090(int arg0) {
        ++field3278;
        Random var2 = new Random((long) this.field3250);
        int var3 = 4096 / this.field3260;
        int var4 = 4096 / this.field3251;
        this.field3265 = var4 >> 1;
        int var5 = this.field3265 * this.field3262 >> 12;
        this.field3271 = this.field3260 * this.field3251;
        this.field3252 = var3 >> 1;
        int var6 = this.field3262 * this.field3252 >> 12;
        this.field3264 = new int[this.field3271][2];
        for (int var7 = arg0; ~var7 > ~this.field3251; ++var7) {
            int var8 = var4 * var7;
            for (int var9 = 0; ~var9 > ~this.field3260; ++var9) {
                int var10 = this.field3260 * var7 + var9;
                int var11 = var6 * (-4096 + class159.method1044(8192, (byte) 107, var2)) >> 12;
                int var12 = (-4096 + class159.method1044(8192, (byte) 115, var2)) * var5 >> 12;
                this.field3264[var10][0] = var3 * var9 + var11;
                this.field3264[var10][1] = var8 + var12;
            }
        }
        this.field3275 = ~this.field3251 <= ~this.field3260 ? this.field3251 : this.field3260;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)V")
    public static final void method1091(int arg0, int arg1, int arg2) {
        ++class13.field221;
        if (arg0 != 4698) {
            field3276 = null;
        }
        class165.field3175.method1023(225, -21822);
        class165.field3175.method754((byte) -111, arg2);
        ++field3274;
        class165.field3175.method769(arg1, 126);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field3251 = arg2.method751((byte) -86);
                                }
                            } else {
                                this.field3260 = arg2.method751((byte) -86);
                            }
                        } else {
                            this.field3253 = arg2.method751((byte) 104);
                        }
                    } else {
                        this.field3261 = arg2.method751((byte) -35);
                    }
                } else {
                    this.field3262 = arg2.method755((byte) -53);
                }
            } else {
                this.field3250 = arg2.method751((byte) 118);
            }
        } else {
            this.field3260 = this.field3251 = arg2.method751((byte) -103);
        }
        if (arg1 >= -99) {
            this.field3253 = -35;
        }
        ++field3249;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field3270;
        int[] var3 = super.field718.method514(arg0, 125);
        int var4 = 62 % ((arg1 - -65) / 60);
        if (super.field718.field1615) {
            int var5 = class105.field1937[arg0];
            int var6 = this.field3261;
            if (var6 != 2) {
                if (var6 == 1) {
                    for (int var7 = 0; class117.field2173 > var7; ++var7) {
                        int var8 = class138.field2585[var7];
                        var3[var7] = this.method1088(var8, var5, (byte) 38, 2)[1];
                    }
                } else {
                    for (int var9 = 0; var9 < class117.field2173; ++var9) {
                        int var10 = class138.field2585[var9];
                        var3[var9] = this.method1088(var10, var5, (byte) 124, 1)[0];
                    }
                }
            } else {
                for (int var11 = 0; class117.field2173 > var11; ++var11) {
                    int var12 = class138.field2585[var11];
                    int[] var13 = this.method1088(var12, var5, (byte) 68, 2);
                    var3[var11] = var13[1] + -var13[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field3259 = null;
        field3279 = null;
        field3269 = null;
        field3257 = null;
        field3256 = null;
        field3272 = null;
        if (arg0 == 4096) {
            field3273 = null;
            field3276 = null;
            field3280 = null;
            field3266 = null;
        }
    }
}
