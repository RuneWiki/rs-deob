import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 extends class535 {

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    private int field115 = 2048;

    @OriginalMember(owner = "client!ds", name = "N", descriptor = "I")
    private int field122 = 819;

    @OriginalMember(owner = "client!ds", name = "K", descriptor = "I")
    private int field119 = 1024;

    @OriginalMember(owner = "client!ds", name = "J", descriptor = "I")
    private int field118 = 409;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    private int field116 = 0;

    @OriginalMember(owner = "client!ds", name = "Q", descriptor = "I")
    private int field125 = 1024;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "I")
    private int field114 = 1024;

    @OriginalMember(owner = "client!ds", name = "L", descriptor = "I")
    private int field120 = 1024;

    @OriginalMember(owner = "client!ds", name = "X", descriptor = "I")
    private int field131 = 0;

    @OriginalMember(owner = "client!ds", name = "T", descriptor = "Lqt;")
    public static class459 field127;

    @OriginalMember(owner = "client!ds", name = "Y", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ds", name = "M", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ds", name = "O", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ds", name = "P", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!ds", name = "S", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ds", name = "U", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ds", name = "V", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ds", name = "W", descriptor = "I")
    private int field130;

    static {
        new class44("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field127 = new class459(4, 4);
        field132 = 0;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Z)Lvv;", line = 3)
    public static final class219 method62(boolean arg0) {
        ++field129;
        class289.field4287 = 0;
        if (!arg0) {
            field127 = null;
        }
        return class433.method2564(arg0);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III[[IILjava/util/Random;I)V", line = 15)
    private final void method63(int arg0, int arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        if (arg4 != 0) {
            this.method60(78, (class519) null, 98);
        }
        ++field128;
        int var8 = ~this.field119 >= -1 ? 4096 : -class392.method2360(Integer.MIN_VALUE, arg5, this.field119) + 4096;
        int var9 = this.field130 * this.field125 >> 12;
        int var10 = this.field130 - (~var9 >= -1 ? 0 : class392.method2360(arg4 ^ Integer.MIN_VALUE, arg5, var9));
        if (arg1 >= class174.field2597) {
            arg1 -= class174.field2597;
        }
        if (~var10 >= -1) {
            if (class174.field2597 >= arg1 + arg6) {
                for (int var11 = 0; ~var11 > ~arg0; ++var11) {
                    class282.method1821(arg3[arg2 - -var11], arg1, arg6, var8);
                }
            } else {
                int var12 = -arg1 + class174.field2597;
                for (int var13 = 0; ~var13 > ~arg0; ++var13) {
                    int[] var14 = arg3[arg2 + var13];
                    class282.method1821(var14, arg1, var12, var8);
                    class282.method1821(var14, 0, arg6 - var12, var8);
                }
            }
        } else if (arg0 > 0 && ~arg6 < -1) {
            int var15 = arg6 / 2;
            int var16 = arg0 / 2;
            int var17 = ~var15 > ~var10 ? var15 : var10;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg1 - -var17;
            int var20 = arg6 - var17 * 2;
            for (int var21 = 0; ~var21 > ~arg0; ++var21) {
                int[] var22 = arg3[var21 - -arg2];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field116 != -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class168.method1203(arg1 - -var24, class529.field7783)] = var22[class168.method1203(arg1 + arg6 + -1 + -var24, class529.field7783)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class168.method1203(arg1 + var26, class529.field7783)] = var22[class168.method1203(arg1 + arg6 + -1 + -var26, class529.field7783)] = var23 * var28 >> 12;
                        }
                    }
                    if (class174.field2597 >= var19 - -var20) {
                        class282.method1821(var22, var19, var20, var23);
                    } else {
                        int var27 = class174.field2597 - var19;
                        class282.method1821(var22, var19, var27, var23);
                        class282.method1821(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = arg0 - 1 + -var21;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field116 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class168.method1203(arg1 + var31, class529.field7783)] = var22[class168.method1203(arg1 + arg6 + -var31 + -1, class529.field7783)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class168.method1203(arg1 + var33, class529.field7783)] = var22[class168.method1203(class529.field7783, arg1 - var33 + arg6 + -1)] = var30 <= var35 ? var30 : var35;
                            }
                        }
                        if (class174.field2597 < var19 + var20) {
                            int var34 = -var19 + class174.field2597;
                            class282.method1821(var22, var19, var34, var30);
                            class282.method1821(var22, 0, -var34 + var20, var30);
                        } else {
                            class282.method1821(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class168.method1203(arg1 + var36, class529.field7783)] = var22[class168.method1203(class529.field7783, arg1 - 1 + arg6 + -var36)] = var8 * var36 / var17;
                        }
                        if (class174.field2597 >= var19 - -var20) {
                            class282.method1821(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class174.field2597;
                            class282.method1821(var22, var19, var37, var8);
                            class282.method1821(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(Z)V", line = 214)
    public static void method64(boolean arg0) {
        if (!arg0) {
            field132 = 81;
        }
        field127 = null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V", line = 799)
    public class12() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)[I", line = 241)
    public final int[] method65(int arg0, int arg1) {
        ++field126;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[][] var4 = super.field7885.method975((byte) 108);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class174.field2597 * this.field120 >> 12;
            int var15 = class174.field2597 * this.field115 >> 12;
            int var16 = class362.field5263 * this.field118 >> 12;
            int var17 = class362.field5263 * this.field122 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field130 = class174.field2597 / 8 * this.field114 >> 12;
            int var18 = 1 - -(class174.field2597 / var14);
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field131);
            label128: while (true) {
                while (true) {
                    int var22 = class392.method2360(arg1 + Integer.MAX_VALUE, var21, -var14 + var15) + var14;
                    int var23 = class392.method2360(Integer.MIN_VALUE, var21, -var16 + var17) + var16;
                    int var24 = var8 - -var22;
                    if (class174.field2597 < var24) {
                        var24 = class174.field2597;
                        var22 = -var8 + class174.field2597;
                    }
                    int var30;
                    if (var11) {
                        var30 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class174.field2597;
                        }
                        if (~class174.field2597 > ~var28) {
                            var28 -= class174.field2597;
                        }
                        while (true) {
                            int[] var29 = var20[var25];
                            if (~var28 <= ~var29[0] && ~var28 >= ~var29[1]) {
                                var30 = var26[2];
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class174.field2597;
                                    }
                                    if (var31 > class174.field2597) {
                                        var31 -= class174.field2597;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var12];
                                        int var35 = var34[2];
                                        if (~var30 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 < var28) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            } else if (var36 == 0) {
                                                var38 = 0;
                                                var39 = Math.min(var28, var37);
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class174.field2597;
                                            }
                                            this.method63(-var35 + var30, var38 - -var7, var35, var4, arg1 + -1, var21, var39 - var38);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (~var25 <= ~var12) {
                                var25 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (class362.field5263 >= var30 - -var23) {
                        var10 = false;
                    } else {
                        var23 = -var30 + class362.field5263;
                    }
                    if (class174.field2597 != var24) {
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var8;
                        var41[2] = var23 + var30;
                        this.method63(var23, var6 + var8, var30, var4, arg1 + -1, var21, var22);
                        var8 = var24;
                    } else {
                        this.method63(var23, var6 + var8, var30, var4, arg1 + -1, var21, var22);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[2] = var23 + var30;
                        var42[1] = var24;
                        var42[0] = var8;
                        int[][] var43 = var20;
                        var20 = var19;
                        var12 = var13;
                        var19 = var43;
                        var13 = 0;
                        var7 = var6;
                        var6 = class392.method2360(Integer.MIN_VALUE, var21, class174.field2597);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class174.field2597 + var5;
                        }
                        if (~class174.field2597 > ~var44) {
                            var44 -= class174.field2597;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var45[0] >= ~var44 && var44 <= var45[1]) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 1) {
            this.method66((byte) -126);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILwn;I)V", line = 497)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            this.method66((byte) -52);
        }
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field119 = arg1.method3018(566990904);
                                        }
                                    } else {
                                        this.field125 = arg1.method3018(566990904);
                                    }
                                } else {
                                    this.field116 = arg1.method3072((byte) -122);
                                }
                            } else {
                                this.field114 = arg1.method3018(arg2 ^ -566984816);
                            }
                        } else {
                            this.field122 = arg1.method3018(566990904);
                        }
                    } else {
                        this.field118 = arg1.method3018(arg2 + 566997136);
                    }
                } else {
                    this.field115 = arg1.method3018(arg2 ^ -566984816);
                }
            } else {
                this.field120 = arg1.method3018(arg2 + 566997136);
            }
        } else {
            this.field131 = arg1.method3072((byte) -123);
        }
        ++field123;
    }

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)V", line = 600)
    public final void method66(byte arg0) {
        ++field121;
        if (arg0 <= 111) {
            this.method60(-8, (class519) null, 70);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lul;Lwn;II)V", line = 610)
    public static final void method67(class411 arg0, class519 arg1, int arg2, int arg3) {
        ++field124;
        class131 var4 = new class131();
        var4.field2045 = arg1.method3072((byte) -124);
        var4.field2048 = arg1.method3053(-129);
        var4.field2044 = new int[var4.field2045];
        var4.field2046 = new class81[var4.field2045];
        var4.field2049 = new class81[var4.field2045];
        var4.field2053 = new byte[var4.field2045][][];
        if (arg3 != 3988) {
            method64(false);
        }
        var4.field2051 = new int[var4.field2045];
        var4.field2050 = new int[var4.field2045];
        for (int var5 = 0; ~var5 > ~var4.field2045; ++var5) {
            try {
                int var6 = arg1.method3072((byte) -120);
                if (~var6 != -1 && ~var6 != -2 && var6 != 2) {
                    if (~var6 == -4 || var6 == 4) {
                        String var10 = arg1.method3082((byte) 124);
                        String var11 = arg1.method3082((byte) 65);
                        int var12 = arg1.method3072((byte) -127);
                        String[] var13 = new String[var12];
                        for (int var14 = 0; var14 < var12; ++var14) {
                            var13[var14] = arg1.method3082((byte) 64);
                        }
                        byte[][] var15 = new byte[var12][];
                        if (~var6 == -4) {
                            for (int var16 = 0; ~var12 < ~var16; ++var16) {
                                int var17 = arg1.method3053(arg3 ^ -3861);
                                var15[var16] = new byte[var17];
                                arg1.method3024(var17, var15[var16], 0, (byte) 74);
                            }
                        }
                        var4.field2051[var5] = var6;
                        Class[] var18 = new Class[var12];
                        for (int var19 = 0; var19 < var12; ++var19) {
                            var18[var19] = class531.method3149((byte) 113, var13[var19]);
                        }
                        var4.field2046[var5] = arg0.method2440(65, var11, class531.method3149((byte) -108, var10), var18);
                        var4.field2053[var5] = var15;
                    }
                } else {
                    String var7 = arg1.method3082((byte) 63);
                    String var8 = arg1.method3082((byte) 88);
                    int var9 = 0;
                    if (~var6 == -2) {
                        var9 = arg1.method3053(arg3 + -4117);
                    }
                    var4.field2051[var5] = var6;
                    var4.field2044[var5] = var9;
                    var4.field2049[var5] = arg0.method2457((byte) 109, class531.method3149((byte) 112, var7), var8);
                }
            } catch (ClassNotFoundException var20) {
                var4.field2050[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2050[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2050[var5] = -3;
            } catch (Exception var23) {
                var4.field2050[var5] = -4;
            } catch (Throwable var24) {
                var4.field2050[var5] = -5;
            }
        }
        class345.field5086.method866((byte) 10, var4);
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)[B", line = 735)
    public static final byte[] method68(int arg0, int arg1) {
        ++field117;
        class70 var2 = (class70) class535.field7882.method997((byte) 70, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class392.method2360(Integer.MIN_VALUE, var4, var7);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class70(var3);
            class535.field7882.method998((byte) -71, (long) arg0, var2);
        }
        return arg1 != 0 ? null : var2.field1152;
    }
}
