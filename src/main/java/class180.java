import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class180 extends class105 {

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
    private int field3452 = 409;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "I")
    private int field3455 = 4096;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    private int field3454 = 4096;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "[I")
    private int[] field3459 = new int[3];

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "I")
    private int field3456 = 4096;

    @OriginalMember(owner = "client!u", name = "ab", descriptor = "I")
    public static int field3443 = -1;

    @OriginalMember(owner = "client!u", name = "fb", descriptor = "[I")
    public static int[] field3448 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "[J")
    public static long[] field3451 = new long[100];

    @OriginalMember(owner = "client!u", name = "eb", descriptor = "I")
    public static int field3447 = 0;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "Leh;")
    public static class47 field3453 = class195.method1282((byte) -4, "sl_back");

    @OriginalMember(owner = "client!u", name = "sb", descriptor = "I")
    public static int field3461 = 0;

    @OriginalMember(owner = "client!u", name = "Y", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!u", name = "Z", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!u", name = "bb", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!u", name = "cb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!u", name = "db", descriptor = "[Lfb;")
    public static class50[] field3446;

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class180() {
        super(1, false);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Lhc;")
    public static final class67 method1195(byte arg0, int arg1) {
        class67 var2 = (class67) class151.field2962.method986((byte) 50, (long) arg1);
        ++field3442;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class147.field2880.method67(arg1, -1, 0);
            if (var3 == null) {
                return null;
            } else if (arg0 != -101) {
                return null;
            } else {
                class67 var4 = new class67();
                class68 var5 = new class68(var3);
                var5.field1454 = var5.field1495.length + -12;
                int var6 = var5.method599((byte) 96);
                var4.field1428 = var5.method569(26496);
                int var7 = 0;
                var4.field1427 = var5.method569(26496);
                var4.field1437 = var5.method569(26496);
                var4.field1445 = var5.method569(26496);
                var5.field1454 = 0;
                var4.field1433 = var5.method580(arg0 + 196);
                var4.field1446 = new class47[var6];
                var4.field1435 = new int[var6];
                var4.field1447 = new int[var6];
                while (var5.field1495.length + -12 > var5.field1454) {
                    int var8 = var5.method569(arg0 ^ -26597);
                    if (~var8 != -4) {
                        if (var8 < 100 && var8 != 21 && ~var8 != -39 && ~var8 != -40) {
                            var4.field1435[var7] = var5.method599((byte) 96);
                        } else {
                            var4.field1435[var7] = var5.method604((byte) -125);
                        }
                    } else {
                        var4.field1446[var7] = var5.method575(100);
                    }
                    var4.field1447[var7++] = var8;
                }
                class151.field2962.method987((long) arg1, var4, arg0 + 28943);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field3441;
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) -119, arg0);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class149.field2928 > var11; ++var11) {
                int var12 = var8[var11];
                int var13 = -this.field3459[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3452 < var13) {
                    var6[var11] = var12;
                    var9[var11] = var5[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field3459[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3452) {
                        var6[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3459[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~this.field3452 > ~var17) {
                            var6[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var6[var11] = this.field3455 * var12 >> 12;
                            var9[var11] = this.field3456 * var14 >> 12;
                            var10[var11] = this.field3454 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (!arg1) {
            this.method17(-51, (class68) null, 82);
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(B)V")
    public static void method1196(byte arg0) {
        field3451 = null;
        if (arg0 != -25) {
            method1199(-106);
        }
        field3453 = null;
        field3446 = null;
        field3448 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIZIIII)V")
    public static final void method1197(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg4) {
            field3461 = 74;
        }
        ++field3457;
        if (class57.method493(arg1, 2093369712)) {
            class41.field822 = null;
            class67.method557(-1, class51.field986[arg1], arg8, arg6, arg7, arg2, arg3, arg5, arg0, 1);
            if (class41.field822 != null) {
                class67.method557(-1412584499, class41.field822, arg8, arg6, arg7, arg2, class131.field2592, class124.field2498, arg0, 1);
                class41.field822 = null;
            }
        } else if (arg2 != -1) {
            class158.field3077[arg2] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class158.field3077[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static final void method1198(int arg0) {
        ++field3460;
        if (arg0 != -23703) {
            field3453 = null;
        }
        class2.field21 = new class204(32);
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        ++field3450;
        if (~class178.field3421 >= -1) {
            if (class78.field1692 > 0) {
                for (int var1 = 0; var1 < 256; ++var1) {
                    if (class78.field1692 > 768) {
                        class155.field3037[var1] = class123.method942((byte) -43, class173.field3355[var1], -class78.field1692 + 1024, class85.field1807[var1]);
                    } else if (class78.field1692 > 256) {
                        class155.field3037[var1] = class85.field1807[var1];
                    } else {
                        class155.field3037[var1] = class123.method942((byte) -43, class85.field1807[var1], -class78.field1692 + 256, class173.field3355[var1]);
                    }
                }
            } else {
                for (int var2 = 0; ~var2 > -257; ++var2) {
                    class155.field3037[var2] = class173.field3355[var2];
                }
            }
        } else {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                if (~class178.field3421 >= -769) {
                    if (class178.field3421 <= 256) {
                        class155.field3037[var3] = class123.method942((byte) -43, class61.field1200[var3], -class178.field3421 + 256, class173.field3355[var3]);
                    } else {
                        class155.field3037[var3] = class61.field1200[var3];
                    }
                } else {
                    class155.field3037[var3] = class123.method942((byte) -43, class173.field3355[var3], 1024 - class178.field3421, class61.field1200[var3]);
                }
            }
        }
        short var4 = 256;
        int var5 = 0;
        int var6 = 0;
        int var7 = class70.field1538.field982 * 9;
        for (int var8 = 1; var4 + -1 > var8; ++var8) {
            int var21 = (-var8 + var4) * class88.field1880[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; ~var22 > -129; ++var22) {
                int var24 = class12.field240[var5++];
                int var25 = class70.field1538.field978[var7++];
                if (var24 == 0) {
                    class141.field2759.field978[var6++] = var25;
                } else {
                    int var27 = -var24 + 256;
                    int var28 = class155.field3037[var24];
                    class141.field2759.field978[var6++] = class142.method1018(16711680, class142.method1018(65280, var25) * var27 + var24 * class142.method1018(65280, var28)) + class142.method1018(-16711936, class142.method1018(16711935, var25) * var27 + var24 * class142.method1018(16711935, var28)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; ++var23) {
                class141.field2759.field978[var6++] = class70.field1538.field978[var7++];
            }
            var7 += class70.field1538.field982 + -128;
        }
        int var9 = 0;
        int var10 = 0;
        class141.field2759.method429(0, 9);
        int var11 = class70.field1538.field982 * 9 - -128;
        for (int var12 = 1; var12 < var4 - 1; ++var12) {
            int var13 = (-var12 + var4) * class88.field1880[var12] / var4 + 22;
            if (~var13 > -1) {
                var13 = 0;
            }
            for (int var14 = 0; var13 > var14; ++var14) {
                int var10001 = var9++;
                --var11;
                class70.field1541.field978[var10001] = class70.field1538.field978[var11];
            }
            for (int var15 = var13; var15 < 128; ++var15) {
                int var16 = class12.field240[var10++];
                --var11;
                int var17 = class70.field1538.field978[var11];
                if (var16 != 0) {
                    int var19 = 256 - var16;
                    int var20 = class155.field3037[var16];
                    class70.field1541.field978[var9++] = class142.method1018(-16711936, class142.method1018(var17, 16711935) * var19 + class142.method1018(16711935, var20) * var16) - -class142.method1018(16711680, class142.method1018(65280, var17) * var19 + class142.method1018(var20, 65280) * var16) >> 8;
                } else {
                    class70.field1541.field978[var9++] = var17;
                }
            }
            var11 += class70.field1538.field982 + 128;
            var10 += var13;
        }
        if (arg0 == -7824) {
            class70.field1541.method429(637, 9);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 == -256) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 == 4) {
                                int var5 = arg1.method613(true);
                                this.field3459[2] = class142.method1018(var5 >> 12, 0);
                                this.field3459[0] = class142.method1018(267386880, var5 << 4);
                                this.field3459[1] = class142.method1018(65280, var5) >> 4;
                            }
                        } else {
                            this.field3455 = arg1.method569(26496);
                        }
                    } else {
                        this.field3456 = arg1.method569(26496);
                    }
                } else {
                    this.field3454 = arg1.method569(26496);
                }
            } else {
                this.field3452 = arg1.method569(26496);
            }
            ++field3449;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1200(int arg0, Component arg1) {
        ++field3458;
        arg1.addMouseListener(class160.field3105);
        arg1.addMouseMotionListener(class160.field3105);
        arg1.addFocusListener(class160.field3105);
        if (arg0 != 30789) {
            field3461 = 32;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(IZI)V")
    public static final void method1201(int arg0, boolean arg1, int arg2) {
        ++field3444;
        if (arg1) {
            method1195((byte) -10, 84);
        }
        long var3 = (long) ((arg2 << 16) + arg0);
        class31 var5 = (class31) class122.field2471.method1342(var3, (byte) -20);
        if (var5 != null) {
            class151.field2961.method1345(0, var5);
        }
    }
}
