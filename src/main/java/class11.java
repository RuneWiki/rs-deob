import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class11 extends class313 {

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "Ljava/lang/String;")
    public static String field132 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "Ldb;")
    public static class203 field135;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIILuk;JLuk;Luk;)V", line = 4)
    public static final void method105(int arg0, int arg1, int arg2, int arg3, class104 arg4, long arg5, class104 arg6, class104 arg7) {
        class112 var9 = new class112();
        var9.field1880 = arg4;
        var9.field1872 = arg1 * 128 + 64;
        var9.field1876 = arg2 * 128 + 64;
        var9.field1875 = arg3;
        var9.field1879 = arg5;
        var9.field1871 = arg6;
        var9.field1873 = arg7;
        int var10 = 0;
        class257 var11 = class279.field4430[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field4150; var12++) {
                class241 var13 = var11.field4147[var12];
                if ((var13.field3936 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3940.method95();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1877 = -var10;
        if (class279.field4430[arg0][arg1][arg2] == null) {
            class279.field4430[arg0][arg1][arg2] = new class257(arg0, arg1, arg2);
        }
        class279.field4430[arg0][arg1][arg2].field4167 = var9;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBI)V", line = 48)
    public static final void method106(int arg0, byte arg1, int arg2) {
        field134++;
        int var3 = 89 / ((arg1 - 18) / 48);
        class30 var4 = class99.method857((byte) -60, arg0, 13);
        var4.method277(true);
        var4.field438 = arg2;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lcg;BLcg;)V", line = 62)
    public static final void method107(class49 arg0, byte arg1, class49 arg2) {
        class338.field5412 = arg0;
        field133++;
        class188.field3154 = arg2;
        if (arg1 > -101) {
            method107((class49) null, (byte) -98, (class49) null);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIIIIIII)V", line = 75)
    public static final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field129++;
        if (arg3 == arg8 && arg2 == arg6 && arg0 == arg5 && arg1 == arg4) {
            class223.method1629(arg7, arg8, arg5, arg4, (byte) -62, arg2);
        } else {
            int var10 = arg8;
            int var11 = arg2 * 3;
            int var12 = arg2;
            int var13 = arg3 * 3;
            int var14 = arg6 * 3;
            int var15 = arg1 * 3;
            int var16 = arg0 * 3;
            int var17 = arg8 * 3;
            int var18 = arg4 + var14 - (arg2 + var15);
            int var19 = arg5 + var13 - arg8 - var16;
            int var20 = var16 + var17 - var13 - var13;
            int var21 = var15 + var11 - var14 - var14;
            int var22 = var13 - var17;
            int var23 = var14 - var11;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = arg8 + (var30 + var31 + var27 >> 12);
                int var34 = (var28 + var29 + var32 >> 12) + arg2;
                class223.method1629(arg7, var10, var33, var34, (byte) -62, var12);
                var12 = var34;
                var10 = var33;
            }
        }
        if (arg9 != 8) {
            method110(false, -24);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([I[IB[ILqe;)V", line = 151)
    public static final void method109(int[] arg0, int[] arg1, byte arg2, int[] arg3, class205 arg4) {
        field128++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && var9 < arg4.field2026.length) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field2026[var9] = null;
                    } else {
                        class285 var10 = class346.method2428(var6, (byte) -24);
                        int var11 = var10.field4532;
                        class288 var12 = arg4.field2026[var9];
                        if (var12 != null) {
                            if (var12.field4596 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field2026[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4589 = 0;
                                    var12.field4595 = 0;
                                    var12.field4601 = 0;
                                    var12.field4600 = 1;
                                    var12.field4588 = var8;
                                    class20.method199(class218.field3632 == arg4, arg4.field1985, var10, arg4.field2036, 0, true);
                                } else if (var11 == 2) {
                                    var12.field4601 = 0;
                                }
                            } else if (var10.field4517 >= class346.method2428(var12.field4596, (byte) -24).field4517) {
                                var12 = arg4.field2026[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class288 var13 = arg4.field2026[var9] = new class288();
                            var13.field4601 = 0;
                            var13.field4589 = 0;
                            var13.field4596 = var6;
                            var13.field4600 = 1;
                            var13.field4588 = var8;
                            var13.field4595 = 0;
                            class20.method199(class218.field3632 == arg4, arg4.field1985, var10, arg4.field2036, 0, true);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        int var14 = -89 / ((arg2 - 6) / 59);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)V", line = 246)
    public static final void method110(boolean arg0, int arg1) {
        field131++;
        byte[][] var2;
        byte var3;
        if (class43.field680 && arg0) {
            var2 = class277.field4409;
            var3 = 1;
        } else {
            var2 = class180.field3039;
            var3 = 4;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = var2[var5];
            int[] var7 = null;
            int var8 = class56.field866[var5] & 0xFF;
            int var9 = class56.field866[var5] >> 8;
            int var10 = var9 * 64 - class24.field345;
            int var11 = var8 * 64 - class34.field484;
            if (var6 != null) {
                class215.method1587(false);
                var7 = class303.method2089(class34.field484, class24.field345, class163.field2882, var10, arg0, var6, var11, 4706);
            }
            if (!arg0 && class144.field2626 / 8 == var9 && class181.field3047 / 8 == var8) {
                if (var7 == null) {
                    class74.field1218 = -1;
                } else {
                    class134.field2344 = var7[2];
                    class74.field1218 = var7[0];
                    class125.field2151 = var7[1];
                    class257.field4159 = var7[3];
                    class35.field494 = var7[4];
                }
            }
        }
        int var12 = -114 / ((arg1 - 45) / 40);
        for (int var13 = 0; var13 < var4; var13++) {
            int var14 = (class56.field866[var13] >> 8) * 64 - class24.field345;
            int var15 = (class56.field866[var13] & 0xFF) * 64 - class34.field484;
            byte[] var16 = var2[var13];
            if (var16 == null && class181.field3047 < 800) {
                class215.method1587(false);
                for (int var17 = 0; var17 < var3; var17++) {
                    class191.method1444(64, var15, 64, false, var14, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V", line = 338)
    public class11() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I", line = 345)
    public final int[] method111(int arg0, int arg1) {
        field130++;
        if (arg0 != 4) {
            field132 = (String) null;
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int[][] var4 = this.method2161(0, 4, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class133.field2269; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V", line = 382)
    public static void method112(boolean arg0) {
        field132 = null;
        field135 = null;
        if (arg0) {
            field135 = (class203) null;
        }
    }
}
