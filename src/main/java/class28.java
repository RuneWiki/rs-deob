import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class28 extends class13 {

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "[I")
    public static int[] field475 = new int[500];

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field477 = 0;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "[I")
    public static int[] field471 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vo", name = "O", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "[Lbl;")
    private class389[] field472;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method29(boolean arg0, int arg1) {
        ++field482;
        if (!arg0) {
            field477 = -125;
        }
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            this.method304(super.field263.method896(73), -52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lkh;BI)V", line = 32)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field478;
        if (arg2 == 0) {
            this.field472 = new class389[arg0.method172((byte) 52)];
            for (int var4 = 0; ~var4 > ~this.field472.length; ++var4) {
                int var5 = arg0.method172((byte) 52);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (var5 != 2) {
                            if (~var5 == -4) {
                                this.field472[var4] = class173.method1132(arg0, (byte) 108);
                            }
                        } else {
                            this.field472[var4] = class66.method508(-1, arg0);
                        }
                    } else {
                        this.field472[var4] = class417.method2617(-82, arg0);
                    }
                } else {
                    this.field472[var4] = class20.method274(arg0, (byte) 40);
                }
            }
        } else if (arg2 == 1) {
            super.field259 = ~arg0.method172((byte) 52) == -2;
        }
        if (arg1 < 50) {
            this.method304((int[][]) null, 115);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V", line = 108)
    public static void method302(boolean arg0) {
        field475 = null;
        if (arg0) {
            field477 = -109;
        }
        field471 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILij;)V", line = 120)
    public static final void method303(int arg0, class242 arg1) {
        class375.field5354[arg0] = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "()V", line = 123)
    public class28() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "([[II)V", line = 131)
    private final void method304(int[][] arg0, int arg1) {
        ++field481;
        if (arg1 >= -14) {
            field471 = null;
        }
        int var3 = class269.field3751;
        int var4 = class413.field5862;
        class337.method2152(arg0, (byte) -127);
        class73.method541(0, 0, 64, class123.field1710, class343.field4677);
        if (this.field472 != null) {
            for (int var5 = 0; var5 < this.field472.length; ++var5) {
                class389 var6 = this.field472[var5];
                int var7 = var6.field5589;
                int var8 = var6.field5582;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method553(-102, var4, var3);
                    } else {
                        var6.method552(32546, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method554(var4, true, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIII)Lks;", line = 181)
    public static final class253 method305(boolean arg0, int arg1, int arg2, int arg3) {
        ++field474;
        int var4 = arg3 | arg1 << 8;
        class253 var5 = (class253) class41.field593.method2637((long) var4 << 16, 18620);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class312.field4275.method1757(-3, class312.field4275.method1756(var4, (byte) -117));
            if (var6 != null) {
                if (~var6.length >= -2) {
                    return null;
                } else {
                    class253 var7 = class414.method2598(var6, (byte) 120);
                    var7.field3564 = arg3;
                    class41.field593.method2633((byte) -120, var7, (long) var4 << 16);
                    return var7;
                }
            } else {
                int var8 = arg3 | arg2 - -65536 << 8;
                class253 var9 = (class253) class41.field593.method2637((long) var8 << 16, 18620);
                if (var9 != null) {
                    return var9;
                } else {
                    if (arg0) {
                        method305(true, -77, 83, -80);
                    }
                    byte[] var10 = class312.field4275.method1757(-3, class312.field4275.method1756(var8, (byte) -117));
                    if (var10 != null) {
                        if (var10.length <= 1) {
                            return null;
                        } else {
                            class253 var11 = class414.method2598(var10, (byte) -44);
                            var11.field3564 = arg3;
                            class41.field593.method2633((byte) -120, var11, (long) var8 << 16);
                            return var11;
                        }
                    } else {
                        int var12 = 16776960 | arg3;
                        class253 var13 = (class253) class41.field593.method2637((long) var12 << 16, 18620);
                        if (var13 != null) {
                            return var13;
                        } else {
                            byte[] var14 = class312.field4275.method1757(-3, class312.field4275.method1756(var12, (byte) -119));
                            if (var14 != null) {
                                if (var14.length <= 1) {
                                    return null;
                                } else {
                                    class253 var15 = class414.method2598(var14, (byte) -85);
                                    var15.field3564 = arg3;
                                    class41.field593.method2633((byte) -120, var15, (long) var12 << 16);
                                    return var15;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)[[I", line = 264)
    public final int[][] method222(int arg0, int arg1) {
        ++field479;
        int[][] var3 = super.field256.method1930(arg1, (byte) 102);
        if (arg0 != -27832) {
            return null;
        } else {
            if (super.field256.field4154) {
                int var4 = class269.field3751;
                int var5 = class413.field5862;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field256.method1932(arg0 + 27730);
                this.method304(var6, -117);
                for (int var8 = 0; ~class413.field5862 < ~var8; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class269.field3751 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class387.method2454(4080, var15 << 4);
                        var12[var14] = class387.method2454(4080, var15 >> 4);
                        var11[var14] = class387.method2454(16711680, var15) >> 12;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "(B)V", line = 328)
    public static final void method306(byte arg0) {
        if (class294.field4112 != 3) {
            class277.field3883 = -1;
        }
        if (arg0 != -33) {
            method306((byte) 39);
        }
        ++field480;
    }
}
