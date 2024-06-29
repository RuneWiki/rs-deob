import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class11 extends class220 {

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "[[I")
    public static int[][] field127 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "Lwe;")
    public static class24 field128 = new class24(128);

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "[I")
    public static int[] field137 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[Lli;")
    private class452[] field134;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILsn;IIBILro;II)V")
    public static final void method78(int arg0, class449 arg1, int arg2, int arg3, byte arg4, int arg5, class249 arg6, int arg7, int arg8) {
        ++field130;
        int var9 = arg7 * arg7 + arg8 * arg8;
        if (~var9 >= ~arg3) {
            int var10 = Math.min(arg6.field3578 / 2, arg6.field3604 / 2);
            int var11 = -108 % ((20 - arg4) / 50);
            if (var9 > var10 * var10) {
                var10 -= 10;
                int var12;
                if (~class5.field48 != -5) {
                    var12 = (int) class170.field2244 + class66.field942 & 16383;
                } else {
                    var12 = (int) class170.field2244 & 16383;
                }
                int var13 = class190.field2644[var12];
                int var14 = class190.field2635[var12];
                if (~class5.field48 != -5) {
                    var13 = var13 * 256 / (class59.field858 - -256);
                    var14 = var14 * 256 / (class59.field858 + 256);
                }
                int var15 = arg7 * var14 + arg8 * var13 >> 15;
                int var16 = arg8 * var14 - arg7 * var13 >> 15;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var10 * Math.sin(var17));
                int var20 = (int) ((double) var10 * Math.cos(var17));
                class246.field3425[arg0].method1497((float) arg6.field3578 / 2.0F + (float) arg2 + (float) var19, (float) arg6.field3604 / 2.0F + (float) arg5 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            } else {
                class252.method1553(arg2, arg8, arg1, 2, class30.field518[arg0], arg5, arg6, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field125;
        if (arg1 == -49) {
            if (arg0 != 0) {
                if (~arg0 == -2) {
                    super.field3131 = arg2.method1697(122) == 1;
                    return;
                }
            } else {
                this.field134 = new class452[arg2.method1697(arg1 ^ -117)];
                for (int var4 = 0; var4 < this.field134.length; ++var4) {
                    int var5 = arg2.method1697(-78);
                    if (~var5 != -1) {
                        if (~var5 != -2) {
                            if (var5 != 2) {
                                if (var5 == 3) {
                                    this.field134[var4] = class23.method200(0, arg2);
                                }
                            } else {
                                this.field134[var4] = class59.method400(class347.method2311(arg1, -11), arg2);
                            }
                        } else {
                            this.field134[var4] = class32.method267(arg2, arg1 + -76);
                        }
                    } else {
                        this.field134[var4] = class363.method2377(arg1 + 48, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        if (arg0 != -11543) {
            method78(56, (class449) null, 110, 19, (byte) 47, -65, (class249) null, -38, 5);
        }
        ++field131;
        int[] var3 = super.field3125.method2005(arg1, (byte) -122);
        if (super.field3125.field4676) {
            this.method81(-104, super.field3125.method2006((byte) -110));
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(II)I")
    public static final int method79(int arg0, int arg1) {
        if (arg0 != 0) {
            return -77;
        } else {
            ++field135;
            return arg1 >>> 10;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        ++field132;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (arg1 != 0) {
            field128 = null;
        }
        if (super.field3135.field4087) {
            int var4 = class344.field5043;
            int var5 = class110.field1518;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3135.method1780((byte) 53);
            this.method81(-125, var6);
            for (int var8 = 0; var8 < class110.field1518; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class344.field5043 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class401.method2606(4080, var15 << 4);
                    var12[var14] = class401.method2606(var15 >> 4, 4080);
                    var11[var14] = class401.method2606(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljava/lang/String;Lud;BI)Lor;")
    public static final class296 method80(String arg0, class2 arg1, byte arg2, int arg3) {
        ++field126;
        if (~arg3 == -1) {
            return arg1.method17(arg0, 104);
        } else if (arg3 == 1) {
            try {
                class67.method436(arg1.field29, new Object[] { (new URL(arg1.field29.getCodeBase(), arg0)).toString() }, true, "openjs");
                class296 var4 = new class296();
                var4.field4259 = 1;
                return var4;
            } catch (Throwable var10) {
                class296 var5 = new class296();
                var5.field4259 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                arg1.field29.getAppletContext().showDocument(new URL(arg1.field29.getCodeBase(), arg0), "_blank");
                class296 var6 = new class296();
                var6.field4259 = 1;
                return var6;
            } catch (Exception var11) {
                class296 var7 = new class296();
                var7.field4259 = 2;
                return var7;
            }
        } else {
            if (arg2 > -47) {
                field127 = null;
            }
            if (~arg3 == -4) {
                try {
                    class67.method434(arg1.field29, (byte) -100, "loggedout");
                } catch (Throwable var13) {
                }
                try {
                    arg1.field29.getAppletContext().showDocument(new URL(arg1.field29.getCodeBase(), arg0), "_top");
                    class296 var8 = new class296();
                    var8.field4259 = 1;
                    return var8;
                } catch (Exception var12) {
                    class296 var9 = new class296();
                    var9.field4259 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[[I)V")
    private final void method81(int arg0, int[][] arg1) {
        if (arg0 > -78) {
            field137 = null;
        }
        ++field129;
        int var3 = class344.field5043;
        int var4 = class110.field1518;
        class316.method1971(arg1, 17);
        class451.method2821(class392.field5887, class315.field4510, 0, 0, false);
        if (this.field134 != null) {
            for (int var5 = 0; ~this.field134.length < ~var5; ++var5) {
                class452 var6 = this.field134[var5];
                int var7 = var6.field6589;
                int var8 = var6.field6585;
                if (var7 >= 0) {
                    if (var8 >= 0) {
                        var6.method492(var3, var4, 0);
                    } else {
                        var6.method496(var4, var3, (byte) 75);
                    }
                } else if (~var8 <= -1) {
                    var6.method493(var4, false, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IIII)V")
    public static final void method82(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 74) {
            field136 = -62;
        }
        ++field133;
        class256 var4 = class363.method2385(9, arg0, (byte) 1);
        var4.method1614(0);
        var4.field3756 = arg3;
        var4.field3746 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(B)V")
    public static void method83(byte arg0) {
        if (arg0 > -39) {
            method78(117, (class449) null, 125, -127, (byte) 34, 75, (class249) null, 83, -98);
        }
        field128 = null;
        field127 = null;
        field137 = null;
    }
}
