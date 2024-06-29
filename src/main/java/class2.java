import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class2 {

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "[[I")
    private int[][] field15;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)V", line = 4)
    public static final void method4(int arg0, int arg1) {
        field17++;
        class20 var2 = class369.method2351((byte) 78, 3, arg0);
        var2.method148(-11806);
        if (arg1 != 0) {
            method4(72, -93);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IZ)I", line = 17)
    public final int method5(int arg0, boolean arg1) {
        if (!arg1) {
            this.method11((byte) -115, -72);
        }
        if (this.field15 != null) {
            arg0 = (int) ((long) this.field14 * (long) arg0 / (long) this.field16);
        }
        field20++;
        return arg0;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BLtq;Ltq;)V", line = 35)
    public static final void method6(byte arg0, class376 arg1, class376 arg2) {
        class125.field1532 = arg1;
        class339.field4812 = arg2;
        field21++;
        class339.field4812.method2415(36, (byte) 56);
        if (arg0 != -89) {
            field19 = -81;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B[B)[B", line = 52)
    public final byte[] method7(byte arg0, byte[] arg1) {
        field10++;
        if (arg0 >= -24) {
            return null;
        }
        if (this.field15 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field14 / (long) this.field16) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field15[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field14 + var6;
                int var14 = var13 / this.field16;
                var5 += var14;
                var6 = var13 - this.field16 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V", line = 121)
    public static final void method8(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2784 != null) {
            var3.field2784 = null;
        }
        if (var3.field2771 != null) {
            var3.field2771 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(IZ)V", line = 135)
    public static final void method9(int arg0, boolean arg1) {
        field18++;
        if (arg0 < 49) {
            method8(-86, -100, -79);
        }
        byte[][] var2;
        byte var3;
        if (arg1) {
            var2 = class366.field5187;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class193.field2798;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class356.method2270(false);
            for (int var6 = 0; var6 < (class176.field2403 >> 3); var6++) {
                for (int var7 = 0; var7 < class383.field5395 >> 3; var7++) {
                    boolean var8 = false;
                    int var9 = class330.field4670[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFCD86) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + (var13 / 8);
                            for (int var15 = 0; var15 < class33.field380.length; var15++) {
                                if (class33.field380[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class56.method323(arg1, var11, var12, var13, (byte) -122, class102.field1247, var5, var6 * 8, var7 * 8, var10, class151.field1873, var2[var15]);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class232.method1535(var7 * 8, 8, var5, -76, var6 * 8, 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class332.field4704 = null;
        } else {
            class332.field4704 = class405.method2589(var4[3], var4[1], 32412, var4[0], var4[2]);
            class127.field1541 = var4[4];
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(II)I", line = 240)
    public static int method10(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)I", line = 251)
    public final int method11(byte arg0, int arg1) {
        field12++;
        if (arg0 != 71) {
            method8(-9, 56, 107);
        }
        if (this.field15 != null) {
            arg1 = (int) ((long) this.field14 * (long) arg1 / (long) this.field16) + 6;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZIIIIIII)V", line = 268)
    public static final void method12(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field11++;
        if (arg4 == arg7) {
            class34.method213(arg7, (byte) -43, arg1, arg5, arg2, arg6, arg3);
            return;
        }
        if (!arg0) {
            field13 = 87;
        }
        if (class81.field946 <= arg5 - arg7 && class235.field3295 >= arg5 + arg7 && (arg3 - arg4) >= class388.field5464 && (arg3 + arg4) <= class219.field3080) {
            class183.method1233(arg1, (byte) -53, arg2, arg6, arg4, arg3, arg5, arg7);
        } else {
            class55.method317(arg6, arg5, arg3, arg4, 14064, arg1, arg7, arg2);
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(II)V", line = 293)
    public class2(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class276.method1829(0, arg1, arg0);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field16 = var4;
            this.field14 = var5;
            this.field15 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field15[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
