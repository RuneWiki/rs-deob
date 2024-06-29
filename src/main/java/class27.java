import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class27 extends class212 {

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "[B")
    private byte[] field460 = new byte[512];

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    private int field465 = 2048;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    private int field468 = 0;

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "I")
    private int field470 = 5;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    private int field461 = 5;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "[S")
    private short[] field459 = new short[512];

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
    private int field475 = 1;

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
    private int field477 = 2;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "[[[I")
    public static int[][][] field466 = new int[4][13][13];

    @OriginalMember(owner = "client!fe", name = "pb", descriptor = "Lsc;")
    public static class181 field480 = class149.method967(255, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "Lsc;")
    public static class181 field478 = class149.method967(255, "http:)4)4");

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "J")
    public static long field482 = 0L;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!fe", name = "ob", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "[[I")
    public static int[][] field474;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    public static void method223(byte arg0) {
        field478 = null;
        if (arg0 >= -123) {
            field480 = null;
        }
        field474 = null;
        field480 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
    public static final int method224(int arg0, int arg1) {
        ++field462;
        int var2 = 115 % ((-55 - arg1) / 57);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Loh;B)V")
    public static final void method225(class94 arg0, byte arg1) {
        ++field469;
        class86.method577(arg1 ^ -121, 200000, arg0);
        if (arg1 != 120) {
            method225((class94) null, (byte) -16);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        ++field472;
        if (arg2 == -3) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 != 2) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (~arg1 == -7) {
                                        this.field470 = arg0.method1516((byte) 82);
                                    }
                                } else {
                                    this.field461 = arg0.method1516((byte) 82);
                                }
                            } else {
                                this.field475 = arg0.method1516((byte) 82);
                            }
                        } else {
                            this.field477 = arg0.method1516((byte) 82);
                        }
                    } else {
                        this.field465 = arg0.method1535(2);
                    }
                } else {
                    this.field468 = arg0.method1516((byte) 82);
                }
            } else {
                this.field461 = this.field470 = arg0.method1516((byte) 82);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILjb;)Lpd;")
    public static final class48 method226(int arg0, int arg1, int arg2, class11 arg3) {
        ++field481;
        if (!class242.method1646(arg0, (byte) -64, arg3, arg1)) {
            return null;
        } else {
            if (arg2 != -1342384857) {
                method229(20L, true, -51, 107);
            }
            return class184.method1280(1494);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
    public static final void method227(byte arg0) {
        ++field463;
        if (~class25.method213(13315) == -3) {
            byte var1 = (byte) (255 & class94.field1505 - 4);
            int var2 = class94.field1505 % 104;
            if (arg0 < 63) {
                field480 = null;
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var16 = 0; var16 < 104; ++var16) {
                    class174.field2919[var3][var2][var16] = var1;
                }
            }
            if (class38.field581 != 3) {
                for (int var4 = 0; ~var4 > -3; ++var4) {
                    class69.field1108[var4] = -1000000;
                    class143.field2325[var4] = 1000000;
                    class60.field907[var4] = 0;
                    class85.field1344[var4] = 1000000;
                    class38.field577[var4] = 0;
                }
                if (~class110.field1792 != -2) {
                    int var5 = class232.method1606(class38.field581, (byte) -34, class86.field1370, class127.field2100);
                    if (var5 - class228.field3916 < 800 && ~(4 & class70.field1129[class38.field581][class127.field2100 >> 7][class86.field1370 >> 7]) != -1) {
                        class210.method1391(class127.field2100 >> 7, class221.field3820, false, 1, 63, class86.field1370 >> 7);
                        return;
                    }
                } else {
                    if (~(4 & class70.field1129[class38.field581][class258.field4507.field2654 >> 7][class258.field4507.field2681 >> 7]) != -1) {
                        class210.method1391(class258.field4507.field2654 >> 7, class221.field3820, false, 0, 31, class258.field4507.field2681 >> 7);
                    }
                    if (class208.field3559 >= 310) {
                        return;
                    }
                    int var6 = class86.field1370 >> 7;
                    int var7 = class258.field4507.field2681 >> 7;
                    int var8 = class258.field4507.field2654 >> 7;
                    int var9 = class127.field2100 >> 7;
                    int var10;
                    if (~var7 < ~var6) {
                        var10 = -var6 + var7;
                    } else {
                        var10 = var6 - var7;
                    }
                    int var11;
                    if (var9 >= var8) {
                        var11 = -var8 + var9;
                    } else {
                        var11 = var8 - var9;
                    }
                    if (~var11 < ~var10) {
                        int var12 = var10 * 65536 / var11;
                        int var13 = 32768;
                        while (var8 != var9) {
                            if (var9 < var8) {
                                ++var9;
                            } else if (var8 < var9) {
                                --var9;
                            }
                            if (~(class70.field1129[class38.field581][var9][var6] & 4) != -1) {
                                class210.method1391(var9, class221.field3820, false, 1, 119, var6);
                                return;
                            }
                            var13 += var12;
                            if (var13 >= 65536) {
                                if (var6 >= var7) {
                                    if (~var7 > ~var6) {
                                        --var6;
                                    }
                                } else {
                                    ++var6;
                                }
                                var13 -= 65536;
                                if (~(class70.field1129[class38.field581][var9][var6] & 4) != -1) {
                                    class210.method1391(var9, class221.field3820, false, 1, 46, var6);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    int var14 = var11 * 65536 / var10;
                    int var15 = 32768;
                    while (~var6 != ~var7) {
                        if (~var6 <= ~var7) {
                            if (var7 < var6) {
                                --var6;
                            }
                        } else {
                            ++var6;
                        }
                        if ((4 & class70.field1129[class38.field581][var9][var6]) != 0) {
                            class210.method1391(var9, class221.field3820, false, 1, 68, var6);
                            return;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            var15 -= 65536;
                            if (~var9 <= ~var8) {
                                if (~var9 < ~var8) {
                                    --var9;
                                }
                            } else {
                                ++var9;
                            }
                            if (~(class70.field1129[class38.field581][var9][var6] & 4) != -1) {
                                class210.method1391(var9, class221.field3820, false, 1, 17, var6);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(B)V")
    private final void method228(byte arg0) {
        ++field476;
        Random var2 = new Random((long) this.field468);
        this.field459 = new short[512];
        if (arg0 != -63) {
            method224(32, -112);
        }
        if (~this.field465 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field459[var3] = (short) class136.method879((byte) -128, var2, this.field465);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 <= 25) {
            method224(9, -75);
        }
        ++field473;
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = 2048 - -(class176.field3090[arg0] * this.field470);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class26.field452 > var7; ++var7) {
                class157.field2686 = Integer.MAX_VALUE;
                class107.field1749 = Integer.MAX_VALUE;
                class203.field3483 = Integer.MAX_VALUE;
                class70.field1127 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class253.field4416[var7] * this.field461);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = this.field460[255 & (this.field470 > var11 ? var11 : var11 - this.field470)] & 255;
                    for (int var14 = var9 + -1; var10 >= var14; ++var14) {
                        int var15 = (255 & this.field460[255 & var13 - -(var14 >= this.field461 ? -this.field461 + var14 : var14)]) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field459[var15] + var8;
                        int var17 = -(var11 << 12) - (this.field459[var27] - var4);
                        int var18 = this.field475;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (~var18 != -5) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var17 <= -1 ? var17 : -var17) + (var16 >= 0 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)));
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 > -1 ? -var17 : var17;
                                var19 = ~var25 >= ~var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (var19 >= class70.field1127) {
                            if (class203.field3483 <= var19) {
                                if (~class107.field1749 < ~var19) {
                                    class157.field2686 = class107.field1749;
                                    class107.field1749 = var19;
                                } else if (var19 < class157.field2686) {
                                    class157.field2686 = var19;
                                }
                            } else {
                                class157.field2686 = class107.field1749;
                                class107.field1749 = class203.field3483;
                                class203.field3483 = var19;
                            }
                        } else {
                            class157.field2686 = class107.field1749;
                            class107.field1749 = class203.field3483;
                            class203.field3483 = class70.field1127;
                            class70.field1127 = var19;
                        }
                    }
                }
                int var12 = this.field477;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class70.field1127 + class203.field3483;
                                }
                            } else {
                                var3[var7] = class157.field2686;
                            }
                        } else {
                            var3[var7] = class107.field1749;
                        }
                    } else {
                        var3[var7] = class203.field3483;
                    }
                } else {
                    var3[var7] = class70.field1127;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(JZII)Lsc;")
    public static final class181 method229(long arg0, boolean arg1, int arg2, int arg3) {
        ++field467;
        if (arg2 >= 2 && ~arg2 >= -37) {
            int var5 = 1;
            for (long var6 = arg0 / (long) arg2; ~var6 != -1L; var6 /= (long) arg2) {
                ++var5;
            }
            int var8 = var5;
            if (arg0 < 0L || arg1) {
                var8 = var5 + 1;
            }
            int var9 = 114 % ((arg3 - -83) / 43);
            byte[] var10 = new byte[var8];
            if (~arg0 <= -1L) {
                if (arg1) {
                    var10[0] = 43;
                }
            } else {
                var10[0] = 45;
            }
            for (int var11 = 0; ~var11 > ~var5; ++var11) {
                int var13 = (int) (arg0 % (long) arg2);
                if (~var13 > -1) {
                    var13 = -var13;
                }
                arg0 /= (long) arg2;
                if (var13 > 9) {
                    var13 += 39;
                }
                var10[-var11 + var8 + -1] = (byte) (var13 + 48);
            }
            class181 var12 = new class181();
            var12.field3166 = var10;
            var12.field3155 = var8;
            return var12;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method230(Component arg0, int arg1) {
        int var2 = -82 % ((57 - arg1) / 39);
        arg0.removeKeyListener(class2.field57);
        arg0.removeFocusListener(class2.field57);
        ++field471;
        class59.field894 = -1;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class27() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (!arg0) {
            this.field468 = 29;
        }
        ++field464;
        this.field460 = class211.method1399(0, this.field468);
        this.method228((byte) -63);
    }
}
