import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class245 extends class214 {

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    private int field3456 = 0;

    @OriginalMember(owner = "client!mo", name = "T", descriptor = "I")
    private int field3466 = 1365;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    private int field3462 = 20;

    @OriginalMember(owner = "client!mo", name = "V", descriptor = "I")
    private int field3468 = 0;

    @OriginalMember(owner = "client!mo", name = "S", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!mo", name = "Q", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!mo", name = "R", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!mo", name = "U", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)I")
    public static final int method1526(int arg0) {
        ++field3457;
        class487 var1 = class338.field4636;
        boolean var2 = false;
        if (class221.field3118 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class487.method2858(var3, 0, (class14) null, 0, 0, (class187) null);
            var2 = true;
        }
        long var4 = class193.method1237(arg0 + -23293);
        if (arg0 != 13712) {
            return -59;
        } else {
            for (int var6 = 0; var6 < 10000; ++var6) {
                var1.method1070(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
            }
            int var7 = (int) (-var4 + class193.method1237(-9581));
            var1.method2860(100, 100, 0, -16777216, 0, 1);
            if (var2) {
                var1.method2867(-8615);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        ++field3464;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            for (int var4 = 0; ~class399.field5585 < ~var4; ++var4) {
                int var5 = (class436.field5989[var4] << 12) / this.field3466 + this.field3468;
                int var6 = (class56.field909[arg1] << 12) / this.field3466 + this.field3456;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13;
                for (var13 = 0; var11 - -var12 < 16384 && this.field3462 > var13; ++var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = var13 < this.field3462 + -1 ? (var13 << 12) / this.field3462 : 0;
            }
        }
        if (arg0 != 123) {
            this.field3468 = 89;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class245() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
    public static final void method1527(byte arg0) {
        ++field3461;
        if (class372.method2228(arg0 + -22) == 2) {
            if (arg0 == -52) {
                byte var1 = (byte) (255 & class195.field2771 + -4);
                int var2 = class195.field2771 % class200.field2875;
                for (int var3 = 0; var3 < 4; ++var3) {
                    for (int var16 = 0; class422.field5811 > var16; ++var16) {
                        class484.field6821[var3][var2][var16] = var1;
                    }
                }
                if (class76.field1161 != 3) {
                    for (int var4 = 0; var4 < 2; ++var4) {
                        class435.field5976[var4] = -1000000;
                        class440.field6042[var4] = 1000000;
                        class280.field3862[var4] = 0;
                        class488.field6888[var4] = 1000000;
                        class99.field1405[var4] = 0;
                    }
                    if (class375.field5312 != 1) {
                        int var5 = class418.method2441(class106.field1525, class76.field1161, class436.field5982, -16778);
                        if (~(-class183.field2665 + var5) > -801 && ~(class205.field2947[class76.field1161][class436.field5982 >> 7][class106.field1525 >> 7] & 4) != -1) {
                            class330.method1971(false, 1, 17291, class455.field6293, class436.field5982 >> 7, class106.field1525 >> 7);
                            return;
                        }
                    } else {
                        if (~(4 & class205.field2947[class76.field1161][class2.field21.field6765 >> 7][class2.field21.field6746 >> 7]) != -1) {
                            class330.method1971(false, 0, 17291, class455.field6293, class2.field21.field6765 >> 7, class2.field21.field6746 >> 7);
                        }
                        if (class160.field2306 >= 2560) {
                            return;
                        }
                        int var6 = class436.field5982 >> 7;
                        int var7 = class106.field1525 >> 7;
                        int var8 = class2.field21.field6765 >> 7;
                        int var9 = class2.field21.field6746 >> 7;
                        int var10;
                        if (var6 < var8) {
                            var10 = -var6 + var8;
                        } else {
                            var10 = var6 - var8;
                        }
                        int var11;
                        if (var7 < var9) {
                            var11 = -var7 + var9;
                        } else {
                            var11 = var7 - var9;
                        }
                        if (var10 == 0 && ~var11 == -1 || -class200.field2875 >= var10 || class200.field2875 <= var10 || var11 <= -class422.field5811 || ~var11 <= ~class422.field5811) {
                            class181.method1190((byte) -53, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class153.field2204 + "," + class325.field4472, (Throwable) null);
                            return;
                        }
                        if (~var11 <= ~var10) {
                            int var12 = var10 * 65536 / var11;
                            int var13 = 32768;
                            while (var7 != var9) {
                                if (~var7 <= ~var9) {
                                    if (~var7 < ~var9) {
                                        --var7;
                                    }
                                } else {
                                    ++var7;
                                }
                                if ((class205.field2947[class76.field1161][var6][var7] & 4) != 0) {
                                    class330.method1971(false, 1, 17291, class455.field6293, var6, var7);
                                    return;
                                }
                                var13 += var12;
                                if (var13 >= 65536) {
                                    var13 -= 65536;
                                    if (var6 >= var8) {
                                        if (var8 < var6) {
                                            --var6;
                                        }
                                    } else {
                                        ++var6;
                                    }
                                    if ((class205.field2947[class76.field1161][var6][var7] & 4) != 0) {
                                        class330.method1971(false, 1, 17291, class455.field6293, var6, var7);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        int var14 = var11 * 65536 / var10;
                        int var15 = 32768;
                        while (var6 != var8) {
                            if (~var8 < ~var6) {
                                ++var6;
                            } else if (var6 > var8) {
                                --var6;
                            }
                            if ((class205.field2947[class76.field1161][var6][var7] & 4) != 0) {
                                class330.method1971(false, 1, 17291, class455.field6293, var6, var7);
                                return;
                            }
                            var15 += var14;
                            if (var15 >= 65536) {
                                var15 -= 65536;
                                if (~var7 > ~var9) {
                                    ++var7;
                                } else if (~var9 > ~var7) {
                                    --var7;
                                }
                                if (~(4 & class205.field2947[class76.field1161][var6][var7]) != -1) {
                                    class330.method1971(false, 1, 17291, class455.field6293, var6, var7);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(III)Lwe;")
    public static final class87 method1528(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5625;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        ++field3458;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 == -4) {
                        this.field3456 = arg0.method2508(true);
                    }
                } else {
                    this.field3468 = arg0.method2508(true);
                }
            } else {
                this.field3462 = arg0.method2508(true);
            }
        } else {
            this.field3466 = arg0.method2508(true);
        }
        if (arg1 >= -114) {
            method1530((byte) -114, (int[][]) null);
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
    public static final void method1529(int arg0) {
        ++field3459;
        class11.method107();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class308.field4209[var1].method1704(true);
        }
        if (arg0 > -107) {
            field3465 = -9;
        }
        class15.method152(126);
        class441.method2559(true);
        System.gc();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B[[I)V")
    public static final void method1530(byte arg0, int[][] arg1) {
        ++field3467;
        if (arg0 > 11) {
            class2.field16 = arg1;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZZ)V")
    public static final void method1531(boolean arg0, boolean arg1) {
        ++field3460;
        class131.method793(class244.field3451, -98);
        ++class297.field4094;
        for (class465 var2 = (class465) class231.field3258.method2615((byte) -18); var2 != null; var2 = (class465) class231.field3258.method2619((byte) -98)) {
            if (!var2.method1181(100)) {
                var2 = (class465) class231.field3258.method2615((byte) -18);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field6530 == 0) {
                class480.method2829(var2, true, (byte) 3, arg0);
            }
        }
        if (!arg1) {
            field3463 = -14;
        }
        if (class422.field5806 != null) {
            class356.method2141(-68, class422.field5806);
            class422.field5806 = null;
        }
    }
}
