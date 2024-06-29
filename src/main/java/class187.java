import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class187 extends class145 {

    @OriginalMember(owner = "client!cu", name = "F", descriptor = "I")
    private int field2309 = 4096;

    @OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
    private int field2313 = 4096;

    @OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
    private int field2311 = 4096;

    @OriginalMember(owner = "client!cu", name = "G", descriptor = "Leea;")
    public static class114 field2310 = new class114();

    @OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!cu", name = "K", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V", line = 4)
    public static void method1082(byte arg0) {
        field2310 = null;
        if (arg0 != 106) {
            method1082((byte) 100);
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "()V", line = 215)
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BI)[[I", line = 29)
    public final int[][] method75(byte arg0, int arg1) {
        ++field2314;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 >= -28) {
            this.method75((byte) -78, -36);
        }
        if (super.field1792.field3917) {
            int[][] var4 = this.method866(0, arg1, (byte) -106);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class647.field9368 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (~var12 == ~var13 && var13 == var14) {
                    var8[var11] = this.field2313 * var12 >> 12;
                    var9[var11] = this.field2311 * var13 >> 12;
                    var10[var11] = this.field2309 * var14 >> 12;
                } else {
                    var8[var11] = this.field2313;
                    var9[var11] = this.field2311;
                    var10[var11] = this.field2309;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILrt;)V", line = 91)
    public final void method28(int arg0, int arg1, class194 arg2) {
        ++field2315;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field2309 = arg2.method1220(-26);
                }
            } else {
                this.field2311 = arg2.method1220(-115);
            }
        } else {
            this.field2313 = arg2.method1220(-24);
        }
        if (arg1 >= -67) {
            this.method28(-100, 69, (class194) null);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)V", line = 134)
    public static final void method1083(int arg0, int arg1, int arg2, int arg3) {
        ++field2312;
        int var4 = class287.field3980 + arg1;
        if (arg3 < 5) {
            method1083(-41, 81, 74, 114);
        }
        int var5 = arg2 - -class250.field3549;
        if (class431.field6408 != null && arg1 >= 0 && arg2 >= 0 && class90.field1032 > arg1 && ~class30.field349 < ~arg2) {
            long var6 = (long) (arg0 << 28 | var5 << 14 | var4);
            class446 var8 = (class446) class294.field4247.method524((byte) 106, var6);
            if (var8 == null) {
                class6.method30(arg0, arg1, arg2);
            } else {
                class236 var9 = (class236) var8.field6669.method719(false);
                if (var9 == null) {
                    class6.method30(arg0, arg1, arg2);
                } else {
                    class395 var10 = (class395) class6.method30(arg0, arg1, arg2);
                    if (var10 == null) {
                        var10 = new class395();
                    } else {
                        var10.field6032 = var10.field6035 = -1;
                    }
                    var10.field6027 = var9.field3379;
                    var10.field6034 = var9.field3385;
                    label50: while (true) {
                        class236 var11 = (class236) var8.field6669.method716(14);
                        if (var11 == null) {
                            break;
                        }
                        if (var10.field6034 != var11.field3385) {
                            var10.field6038 = var11.field3379;
                            var10.field6032 = var11.field3385;
                            while (true) {
                                class236 var12 = (class236) var8.field6669.method716(14);
                                if (var12 == null) {
                                    break label50;
                                }
                                if (~var10.field6034 != ~var12.field3385 && var10.field6032 != var12.field3385) {
                                    var10.field6033 = var12.field3379;
                                    var10.field6035 = var12.field3385;
                                }
                            }
                        }
                    }
                    int var13 = class399.method2547((arg2 << 9) + 256, (arg1 << 9) + 256, (byte) -16, arg0);
                    class550.method3191(arg0, arg1, arg2, var13, var10);
                }
            }
        }
    }
}
