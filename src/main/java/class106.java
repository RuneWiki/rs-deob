import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class106 {

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lpca;")
    private class714 field1277 = new class714(256);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Ld;")
    private class149 field1279;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "Lsr;")
    private class251 field1283;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "J")
    public static long field1273 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!er", name = "f", descriptor = "Z")
    public static boolean field1275 = false;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1278 = 0;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1276 = 100;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field1270 = -1;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1282;

    // $FF: synthetic field
    @OriginalMember(owner = "client!er", name = "o", descriptor = "Ljava/lang/Class;")
    public static Class field1284;

    // $FF: synthetic method
    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method763(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBIIIIII)V", line = 5)
    public static final void method756(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1274++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class343.field4787 - class314.field4350) * var8 / 100 + class314.field4350;
        class516.field7361 = class516.field7359 * var9 >> 8;
        int var10 = arg2 * var9 >> 8;
        int var11 = 16384 - arg7 & 0x3FFF;
        int var12 = 16384 - arg6 & 0x3FFF;
        int var13 = 0;
        if (arg1 > -81) {
            method762(null, -83, 11, -22, 72, -64, -85, -84, null);
        }
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class164.field2258[var11] * -var10 >> 14;
            var15 = class164.field2252[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class164.field2258[var12] * var15 >> 14;
            var15 = class164.field2252[var12] * var15 >> 14;
        }
        class187.field2514 = arg7;
        class720.field9994 = arg6;
        class511.field7303 = arg3 - var13;
        class32.field426 = arg4 - var15;
        class155.field2169 = arg0 - var14;
        class707.field9813 = 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V", line = 56)
    public final void method757(boolean arg0) {
        field1271++;
        if (!arg0) {
            this.method761(-102, false);
        }
        this.field1277.method4016(5, (byte) -73);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 70)
    public static final void method758(int arg0) {
        class231 var1 = (class231) class35.field445.method2765(-12261);
        if (arg0 > -47) {
            field1278 = 29;
        }
        while (var1 != null) {
            if (var1.field3124) {
                var1.method1496(83);
            }
            var1 = (class231) class35.field445.method2759(-15361);
        }
        field1280++;
        for (class231 var2 = (class231) class234.field3152.method2765(-12261); var2 != null; var2 = (class231) class234.field3152.method2759(-15361)) {
            if (var2.field3124) {
                var2.method1496(83);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 116)
    public final void method759(int arg0) {
        field1272++;
        this.field1277.method4023((byte) -33);
        if (arg0 != 3969) {
            this.field1277 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()V", line = 138)
    public static final void method760() {
        for (int var0 = 0; var0 < class101.field1208; var0++) {
            if (!class543.field7583[var0]) {
                class244 var1 = class290.field4085[var0];
                class465 var2 = var1.field3265;
                int var3 = var1.field3253;
                int var4 = var2.method2777(-1) - class197.field2617;
                int var5 = (var4 * 2 >> class660.field9038) + 1;
                int var6 = 0;
                int[] var7 = new int[var5 * var5];
                int var8 = var2.method2772(false) - var4 >> class660.field9038;
                int var9 = var2.method2773(true) - var4 >> class660.field9038;
                int var10 = var2.method2773(true) + var4 >> class660.field9038;
                if (var9 < 0) {
                    var6 -= var9;
                    var9 = 0;
                }
                if (var10 >= class365.field5171) {
                    var10 = class365.field5171 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    short var12 = var1.field3252[var6];
                    int var13 = var12 >>> 8;
                    int var14 = var5 * var6 + var13;
                    int var15 = (var12 >>> 8) + var8;
                    int var16 = (var12 & 0xFF) + var15 - 1;
                    if (var15 < 0) {
                        var14 -= var15;
                        var15 = 0;
                    }
                    if (var16 >= class492.field6939) {
                        var16 = class492.field6939 - 1;
                    }
                    for (int var17 = var15; var17 <= var16; var17++) {
                        byte var18 = 1;
                        class524 var19 = class243.method1557(var3, var17, var11, field1284 == null ? (field1284 = method763("um")) : field1284);
                        if (var19 != null && var19.field7416 != 0) {
                            if (var19.field7416 == 1) {
                                boolean var20 = var17 - 1 >= var15;
                                boolean var21 = var17 + 1 <= var16;
                                if (!var20 && var11 + 1 <= var10) {
                                    short var22 = var1.field3252[var6 + 1];
                                    int var23 = (var22 >>> 8) + var8;
                                    int var24 = (var22 & 0xFF) + var23;
                                    var20 = var17 > var23 && var17 < var24;
                                }
                                if (!var21 && var11 - 1 >= var9) {
                                    short var25 = var1.field3252[var6 - 1];
                                    int var26 = (var25 >>> 8) + var8;
                                    int var27 = (var25 & 0xFF) + var26;
                                    var21 = var17 > var26 && var17 < var27;
                                }
                                if (var20 && !var21) {
                                    var18 = 4;
                                } else if (var21 && !var20) {
                                    var18 = 2;
                                }
                            } else {
                                boolean var28 = var17 - 1 >= var15;
                                boolean var29 = var17 + 1 <= var16;
                                if (!var28 && var11 - 1 >= var9) {
                                    short var30 = var1.field3252[var6 - 1];
                                    int var31 = (var30 >>> 8) + var8;
                                    int var32 = (var30 & 0xFF) + var31;
                                    var28 = var17 > var31 && var17 < var32;
                                }
                                if (!var29 && var11 + 1 <= var10) {
                                    short var33 = var1.field3252[var6 + 1];
                                    int var34 = (var33 >>> 8) + var8;
                                    int var35 = (var33 & 0xFF) + var34;
                                    var29 = var17 > var34 && var17 < var35;
                                }
                                if (var28 && !var29) {
                                    var18 = 3;
                                } else if (var29 && !var28) {
                                    var18 = 5;
                                }
                            }
                        }
                        var7[var14++] = var18;
                    }
                    var6++;
                }
                class543.field7583[var0] = true;
                class459.field6474[var3].method1824(var2, var7);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IZ)Ldh;", line = 318)
    public final class320 method761(int arg0, boolean arg1) {
        field1282++;
        Object var3 = this.field1277.method4022((long) arg0, (byte) -66);
        if (!arg1) {
            field1270 = -26;
        }
        if (var3 != null) {
            return (class320) var3;
        } else if (this.field1279.method531(arg0, 45)) {
            class502 var4 = this.field1279.method532((byte) 127, arg0);
            int var5 = var4.field7208 ? 64 : this.field1283.field3543;
            class320 var7;
            if (var4.field7190 && this.field1283.method491()) {
                float[] var6 = this.field1279.method535(var5, -23173, var5, arg0, 0.7F, false);
                var7 = this.field1283.method1670(var5, class165.field2263, var4.field7200 != 0, var5, (byte) -53, var6);
            } else {
                int[] var8;
                if (var4.field7203 != 2 && class565.method3258((byte) -104, var4.field7204)) {
                    var8 = this.field1279.method534(true, var5, 20377, var5, 0.7F, arg0);
                } else {
                    var8 = this.field1279.method530(var5, -116, false, 0.7F, var5, arg0);
                }
                var7 = this.field1283.method1650(var5, var8, var4.field7200 != 0, var5, false);
            }
            var7.method1317(28970, var4.field7198, var4.field7197);
            this.field1277.method4018((byte) 127, var7, (long) arg0);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([BIIIIIII[B)V", line = 368)
    public static final void method762(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field1281++;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        if (arg3 != 1) {
            method756(-65, (byte) 97, 79, -43, 53, 71, 71, 114);
        }
        for (int var11 = -arg5; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg0[var10001] += arg8[arg1++];
                int var14 = arg4++;
                arg0[var14] += arg8[arg1++];
                int var15 = arg4++;
                arg0[var15] += arg8[arg1++];
                int var16 = arg4++;
                arg0[var16] += arg8[arg1++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg0[var10001] += arg8[arg1++];
            }
            arg4 += arg6;
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lsr;Ld;)V", line = 419)
    public class106(class251 arg0, class149 arg1) {
        this.field1279 = arg1;
        this.field1283 = arg0;
    }
}
