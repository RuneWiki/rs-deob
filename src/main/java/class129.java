import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nh")
public class class129 extends class85 {

    @OriginalMember(owner = "nh", name = "Q", descriptor = "I")
    private int field2489 = 0;

    @OriginalMember(owner = "nh", name = "U", descriptor = "I")
    private int field2493 = 2;

    @OriginalMember(owner = "nh", name = "T", descriptor = "I")
    private int field2492 = 2048;

    @OriginalMember(owner = "nh", name = "Z", descriptor = "I")
    private int field2498 = 25;

    @OriginalMember(owner = "nh", name = "hb", descriptor = "I")
    private int field2506 = 5;

    @OriginalMember(owner = "nh", name = "jb", descriptor = "I")
    private int field2508 = 1;

    @OriginalMember(owner = "nh", name = "pb", descriptor = "I")
    private int field2514 = 5;

    @OriginalMember(owner = "nh", name = "bb", descriptor = "Llf;")
    public static class109 field2500 = class35.method275("Nehmen", 2);

    @OriginalMember(owner = "nh", name = "fb", descriptor = "I")
    public static int field2504 = 2;

    @OriginalMember(owner = "nh", name = "mb", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "nh", name = "ob", descriptor = "Llf;")
    public static class109 field2513 = class35.method275("", 2);

    @OriginalMember(owner = "nh", name = "R", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "nh", name = "S", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "nh", name = "W", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "nh", name = "X", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "nh", name = "Y", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "nh", name = "ab", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "nh", name = "cb", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "nh", name = "db", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "nh", name = "eb", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "nh", name = "gb", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "nh", name = "ib", descriptor = "I")
    private int field2507;

    @OriginalMember(owner = "nh", name = "kb", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "nh", name = "nb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "nh", name = "V", descriptor = "Z")
    public static boolean field2494;

    @OriginalMember(owner = "nh", name = "lb", descriptor = "[[I")
    private int[][] field2510;

    @OriginalMember(owner = "nh", name = "c", descriptor = "(III)Lvg;")
    public static final class200 method932(int arg0, int arg1, int arg2) {
        ++field2496;
        class200 var3 = class158.method1078(arg0, (byte) 122);
        if (arg1 == arg2) {
            return var3;
        } else {
            return var3 != null && var3.field3898 != null && arg2 < var3.field3898.length ? var3.field3898[arg2] : null;
        }
    }

    @OriginalMember(owner = "nh", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (arg0 != 25614) {
            this.field2502 = -58;
        }
        this.method938(-90);
        ++field2499;
    }

    @OriginalMember(owner = "nh", name = "e", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2500 = null;
        int var1 = -17 % ((-2 - arg0) / 56);
        field2513 = null;
    }

    @OriginalMember(owner = "nh", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "nh", name = "d", descriptor = "(III)V")
    public static final void method934(int arg0, int arg1, int arg2) {
        class3 var3 = class78.field1550[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field34 = null;
        }
    }

    @OriginalMember(owner = "nh", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        ++field2491;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (arg0 > -49) {
            this.method935(-114, -112, 86, 60);
        }
        if (super.field1736.field2253) {
            int var4 = class54.field1083[arg1];
            int var5 = this.field2493;
            if (var5 != 2) {
                if (~var5 == -2) {
                    for (int var6 = 0; ~class57.field1152 < ~var6; ++var6) {
                        int var7 = class47.field980[var6];
                        var3[var6] = this.method935(-11740, 2, var4, var7)[1];
                    }
                } else {
                    for (int var8 = 0; class57.field1152 > var8; ++var8) {
                        int var9 = class47.field980[var8];
                        var3[var8] = this.method935(-11740, 1, var4, var9)[0];
                    }
                }
            } else {
                for (int var10 = 0; class57.field1152 > var10; ++var10) {
                    int var11 = class47.field980[var10];
                    int[] var12 = this.method935(-11740, 2, var4, var11);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "nh", name = "a", descriptor = "(IIII)[I")
    private final int[] method935(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg1];
        for (int var6 = 0; ~arg1 < ~var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        ++field2497;
        int var7 = this.field2502 + arg2;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        int var8 = this.field2503 + arg3;
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var9 = this.field2514 * var8 >> 12;
        int var10 = this.field2506 * var7 >> 12;
        int var11 = -1;
        int var12 = -1;
        int var13 = Integer.MAX_VALUE;
        int var14 = ~this.field2514 >= -3 ? this.field2514 - 1 : 2;
        int var15 = Integer.MAX_VALUE;
        int var16 = ~this.field2506 < -3 ? 2 : this.field2506 + -1;
        for (int var17 = -var14; var14 >= var17; ++var17) {
            for (int var25 = -var16; ~var16 <= ~var25; ++var25) {
                int var26 = var9 + var17;
                if (~var26 > -1) {
                    var26 += this.field2514;
                }
                if (this.field2514 <= var26) {
                    var26 -= this.field2514;
                }
                int var27 = var10 - -var25;
                if (~var27 > -1) {
                    var27 += this.field2506;
                }
                if (this.field2506 <= var27) {
                    var27 -= this.field2506;
                }
                int var28 = this.field2514 * var27 + var26;
                int var29 = this.field2510[var28][1];
                int var30 = this.field2510[var28][0];
                int var31 = -var29 + var7;
                int var32 = -var30 + var8;
                if (var31 < 0) {
                    var31 = -var31;
                }
                if (var31 > 2048) {
                    var31 = 4096 - var31;
                }
                if (var32 < 0) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (var33 < var15) {
                    if (var11 == -1) {
                        var13 = var33;
                        var11 = var28;
                    } else {
                        var13 = var15;
                        var11 = var12;
                    }
                    var15 = var33;
                    var12 = var28;
                } else if (var11 == var12 && var11 != var28 || var33 < var13 && ~var12 != ~var28) {
                    var11 = var28;
                    var13 = var33;
                }
            }
        }
        int var18 = -this.field2510[var12][0] + var8;
        if (arg0 != -11740) {
            return null;
        } else {
            if (var18 < 0) {
                var18 = -var18;
            }
            if (var18 > 2048) {
                var18 = -var18 + 4096;
            }
            int var19 = -this.field2510[var12][1] + var7;
            if (~var19 > -1) {
                var19 = -var19;
            }
            int var20 = -this.field2510[var11][0] + var8;
            int var21 = var7 - this.field2510[var11][1];
            if (var21 < 0) {
                var21 = -var21;
            }
            if (var20 < 0) {
                var20 = -var20;
            }
            if (var19 > 2048) {
                var19 = 4096 - var19;
            }
            if (var20 > 2048) {
                var20 = -var20 + 4096;
            }
            if (~var21 < -2049) {
                var21 = 4096 - var21;
            }
            int var22 = this.field2508;
            int var23;
            int var24;
            if (~var22 != -2) {
                if (~var22 == -3) {
                    var23 = Math.max(var18, var19);
                    var24 = Math.max(var20, var21);
                } else {
                    var24 = var20 * var20 - -(var21 * var21);
                    var23 = var18 * var18 + var19 * var19;
                }
            } else {
                var23 = (int) Math.sqrt((double) (var18 * var18 - -(var19 * var19)));
                var24 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21));
            }
            var5[0] = this.field2507 * var23;
            if (arg1 > 1) {
                var5[1] = this.field2507 * var24;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "nh", name = "a", descriptor = "(IBI)I")
    public static final int method936(int arg0, byte arg1, int arg2) {
        ++field2495;
        if (arg1 != -113) {
            return 77;
        } else {
            int var3 = arg0 >>> 31;
            return (arg0 + var3) / arg2 + -var3;
        }
    }

    @OriginalMember(owner = "nh", name = "a", descriptor = "(BILja;)V")
    public final void method31(byte arg0, int arg1, class86 arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field2506 = arg2.method598((byte) 69);
                                }
                            } else {
                                this.field2514 = arg2.method598((byte) 91);
                            }
                        } else {
                            this.field2508 = arg2.method598((byte) 76);
                        }
                    } else {
                        this.field2493 = arg2.method598((byte) 97);
                    }
                } else {
                    this.field2492 = arg2.method569(true);
                }
            } else {
                this.field2489 = arg2.method598((byte) 117);
            }
        } else {
            this.field2514 = this.field2506 = arg2.method598((byte) 115);
        }
        if (arg0 >= -120) {
            field2490 = -105;
        }
        ++field2501;
    }

    @OriginalMember(owner = "nh", name = "f", descriptor = "(I)V")
    public static final void method937(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        ++field2512;
        System.exit(1);
        if (arg0 != 14750) {
            method936(28, (byte) 46, -69);
        }
    }

    @OriginalMember(owner = "nh", name = "g", descriptor = "(I)V")
    private final void method938(int arg0) {
        ++field2509;
        Random var2 = new Random((long) this.field2489);
        this.field2498 = this.field2514 * this.field2506;
        this.field2510 = new int[this.field2498][2];
        int var3 = 4096 / this.field2514;
        this.field2503 = var3 >> 1;
        if (arg0 < -86) {
            int var4 = 4096 / this.field2506;
            this.field2502 = var4 >> 1;
            int var5 = this.field2503 * this.field2492 >> 12;
            int var6 = this.field2502 * this.field2492 >> 12;
            for (int var7 = 0; var7 < this.field2506; ++var7) {
                int var8 = var4 * var7;
                for (int var9 = 0; var9 < this.field2514; ++var9) {
                    int var10 = this.field2514 * var7 + var9;
                    int var11 = var5 * (class123.method882(8192, var2, true) + -4096) >> 12;
                    int var12 = var6 * (class123.method882(8192, var2, true) + -4096) >> 12;
                    this.field2510[var10][0] = var11 - -(var3 * var9);
                    this.field2510[var10][1] = var8 + var12;
                }
            }
            this.field2507 = this.field2506 >= this.field2514 ? this.field2506 : this.field2514;
        }
    }

    @OriginalMember(owner = "nh", name = "c", descriptor = "(II)V")
    public static final void method939(int arg0, int arg1) {
        ++field2505;
        class171.field3215 += arg1 * 128;
        short var2 = 256;
        if (~class171.field3215 < ~class190.field3641.length) {
            class171.field3215 -= class190.field3641.length;
            int var3 = (int) (12.0D * Math.random());
            class21.method194(class210.field4081[var3], (byte) -86);
        }
        int var4 = 0;
        int var5 = (var2 - arg1) * 128;
        int var6 = arg1 * 128;
        if (arg0 == 50) {
            for (int var7 = 0; var7 < var5; ++var7) {
                int var27 = class38.field819[var4 + var6] - class190.field3641[class171.field3215 + var4 & class190.field3641.length + -1] * arg1 / 6;
                if (var27 < 0) {
                    var27 = 0;
                }
                class38.field819[var4++] = var27;
            }
            for (int var8 = var2 - arg1; ~var2 < ~var8; ++var8) {
                int var24 = var8 * 128;
                for (int var25 = 0; var25 < 128; ++var25) {
                    int var26 = (int) (Math.random() * 100.0D);
                    if (var26 < 50 && var25 > 10 && var25 < 118) {
                        class38.field819[var24 + var25] = 255;
                    } else {
                        class38.field819[var24 + var25] = 0;
                    }
                }
            }
            if (~class127.field2450 < -1) {
                class127.field2450 -= arg1 * 4;
            }
            if (class93.field1914 > 0) {
                class93.field1914 -= arg1 * 4;
            }
            if (class127.field2450 == 0 && class93.field1914 == 0) {
                int var9 = (int) ((double) (2000 / arg1) * Math.random());
                if (var9 == 0) {
                    class127.field2450 = 1024;
                }
                if (var9 == 1) {
                    class93.field1914 = 1024;
                }
            }
            for (int var10 = 0; ~var10 > ~(-arg1 + var2); ++var10) {
                class193.field3695[var10] = class193.field3695[arg1 + var10];
            }
            for (int var11 = -arg1 + var2; var11 < var2; ++var11) {
                class193.field3695[var11] = (int) (16.0D * Math.sin((double) class116.field2294 / 14.0D) + 14.0D * Math.sin((double) class116.field2294 / 15.0D) + Math.sin((double) class116.field2294 / 16.0D) * 12.0D);
                ++class116.field2294;
            }
            int var12 = ((1 & class143.field2754) + arg1) / 2;
            class192.field3675 += arg1;
            if (~var12 < -1) {
                for (int var13 = 0; ~var13 > ~(class192.field3675 * 100); ++var13) {
                    int var22 = (int) (124.0D * Math.random()) + 2;
                    int var23 = (int) (128.0D * Math.random()) - -128;
                    class38.field819[var22 - -(var23 << 7)] = 192;
                }
                class192.field3675 = 0;
                for (int var14 = 0; ~var2 < ~var14; ++var14) {
                    int var19 = 0;
                    int var20 = var14 * 128;
                    for (int var21 = -var12; var21 < 128; ++var21) {
                        if (~(var12 + var21) > -129) {
                            var19 += class38.field819[var20 + var21 + var12];
                        }
                        if (~(var21 + -1 + -var12) <= -1) {
                            var19 -= class38.field819[var21 - (var12 + 1 + -var20)];
                        }
                        if (~var21 <= -1) {
                            class12.field179[var21 - -var20] = var19 / (var12 * 2 + 1);
                        }
                    }
                }
                for (int var15 = 0; var15 < 128; ++var15) {
                    int var16 = 0;
                    for (int var17 = -var12; var17 < var2; ++var17) {
                        int var18 = var17 * 128;
                        if (~var2 < ~(var12 + var17)) {
                            var16 += class12.field179[var12 * 128 + var18 + var15];
                        }
                        if (~(-var12 + var17 + -1) <= -1) {
                            var16 -= class12.field179[-((var12 - -1) * 128) + var15 + var18];
                        }
                        if (var17 >= 0) {
                            class38.field819[var15 + var18] = var16 / (var12 * 2 - -1);
                        }
                    }
                }
            }
        }
    }
}
