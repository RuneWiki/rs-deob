import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class90 extends class279 {

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "I")
    private int field1401 = 0;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    private int field1406 = 5;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    private int field1409 = 2;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    private int field1416 = 2048;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "[B")
    private byte[] field1415 = new byte[512];

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "[S")
    private short[] field1419 = new short[512];

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    private int field1423 = 1;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    private int field1417 = 5;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field1405 = -2;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field1403 = 0;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public static int field1408 = 0;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Ltl;")
    public static class59 field1411 = class85.method639(")4j", 9588);

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "[[B")
    public static byte[][] field1414 = new byte[250][];

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 14)
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "(I)V", line = 41)
    public static void method663(int arg0) {
        if (arg0 == 1) {
            field1411 = null;
            field1414 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IIB)I", line = 52)
    public static final int method664(int arg0, int arg1, byte arg2) {
        field1404++;
        class22 var3 = (class22) class238.field3969.method685((long) arg0, 128);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field294.length; var5++) {
                if (var3.field297[var5] == arg1) {
                    var4 += var3.field294[var5];
                }
            }
            if (arg2 != 37) {
                method670(-71, 45);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lhh;IIIIIIZ)V", line = 85)
    public static final void method665(class79 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1254.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1254[var9] - class235.field3901;
            int var11 = arg0.field1261[var9] - class189.field3158;
            int var12 = arg0.field1264[var9] - class70.field1073;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1262 != null) {
                class79.field1270[var9] = var13;
                class79.field1256[var9] = var16;
                class79.field1272[var9] = var17;
            }
            class79.field1267[var9] = (var13 << 9) / var17 + class298.field5098;
            class79.field1258[var9] = (var16 << 9) / var17 + class298.field5096;
        }
        class298.field5091 = 0;
        int var19 = arg0.field1265.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1265[var20];
            int var22 = arg0.field1257[var20];
            int var23 = arg0.field1269[var20];
            int var24 = class79.field1267[var21];
            int var25 = class79.field1267[var22];
            int var26 = class79.field1267[var23];
            int var27 = class79.field1258[var21];
            int var28 = class79.field1258[var22];
            int var29 = class79.field1258[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class274.field4719 && class255.method1776(class298.field5098 + class155.field2532, class298.field5096 + class27.field359, var27, var28, var29, var24, var25, var26)) {
                    class262.field4374 = arg5;
                    class266.field4592 = arg6;
                }
                if (!class55.field815 && !arg7) {
                    class298.field5105 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class298.field5092 || var25 > class298.field5092 || var26 > class298.field5092) {
                        class298.field5105 = true;
                    }
                    if (arg0.field1262 == null || arg0.field1262[var20] == -1) {
                        if (arg0.field1255[var20] != 12345678) {
                            class298.method2086(var27, var28, var29, var24, var25, var26, arg0.field1255[var20], arg0.field1263[var20], arg0.field1253[var20]);
                        }
                    } else if (!class67.field1036) {
                        int var30 = class298.field5107.method374(arg0.field1262[var20], -2);
                        class298.method2086(var27, var28, var29, var24, var25, var26, class102.method777(var30, arg0.field1255[var20]), class102.method777(var30, arg0.field1263[var20]), class102.method777(var30, arg0.field1253[var20]));
                    } else if (arg0.field1268) {
                        class298.method2080(var27, var28, var29, var24, var25, var26, arg0.field1255[var20], arg0.field1263[var20], arg0.field1253[var20], class79.field1270[0], class79.field1270[1], class79.field1270[3], class79.field1256[0], class79.field1256[1], class79.field1256[3], class79.field1272[0], class79.field1272[1], class79.field1272[3], arg0.field1262[var20]);
                    } else {
                        class298.method2080(var27, var28, var29, var24, var25, var26, arg0.field1255[var20], arg0.field1263[var20], arg0.field1253[var20], class79.field1270[var21], class79.field1270[var22], class79.field1270[var23], class79.field1256[var21], class79.field1256[var22], class79.field1256[var23], class79.field1272[var21], class79.field1272[var22], class79.field1272[var23], arg0.field1262[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(III)Ltl;", line = 198)
    public static final class59 method666(int arg0, int arg1, int arg2) {
        field1407++;
        int var3 = arg1 - arg0;
        if (arg2 >= -28) {
            field1424 = -119;
        }
        if (var3 < -9) {
            return class30.field400;
        } else if (var3 < -6) {
            return class291.field4972;
        } else if (var3 < -3) {
            return class252.field4190;
        } else if (var3 < 0) {
            return class36.field540;
        } else if (var3 > 9) {
            return class262.field4371;
        } else if (var3 > 6) {
            return class37.field551;
        } else if (var3 <= 3) {
            return var3 <= 0 ? class197.field3247 : class22.field296;
        } else {
            return class255.field4230;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V", line = 246)
    private final void method667(byte arg0) {
        field1413++;
        Random var2 = new Random((long) this.field1401);
        this.field1419 = new short[512];
        if (this.field1416 > 0) {
            for (int var3 = 0; var3 < 512; var3++) {
                this.field1419[var3] = (short) class215.method1496(var2, -22, this.field1416);
            }
        }
        if (arg0 > -75) {
            this.method51(-66, -51, (class170) null);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V", line = 277)
    public final void method319(byte arg0) {
        field1420++;
        this.field1415 = class37.method243(this.field1401, 511);
        if (arg0 > -9) {
            method665((class79) null, 48, -81, 34, 22, -80, -90, false);
        }
        this.method667((byte) -116);
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(III)I", line = 293)
    public static final int method668(int arg0, int arg1, int arg2) {
        int var3 = 1;
        field1418++;
        if (arg2 != -31770) {
            method670(-85, -89);
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILs;)V", line = 338)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field1406 = this.field1417 = arg2.method1221(123);
        } else if (arg1 == 1) {
            this.field1401 = arg2.method1221(74);
        } else if (arg1 == 2) {
            this.field1416 = arg2.method1214(-18254);
        } else if (arg1 == 3) {
            this.field1409 = arg2.method1221(126);
        } else if (arg1 == 4) {
            this.field1423 = arg2.method1221(123);
        } else if (arg1 == 5) {
            this.field1406 = arg2.method1221(89);
        } else if (arg1 == 6) {
            this.field1417 = arg2.method1221(79);
        }
        if (arg0 > -125) {
            method669(109, 45);
        }
        field1422++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)[I", line = 403)
    public final int[] method44(boolean arg0, int arg1) {
        field1412++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            this.method667((byte) -104);
        }
        if (this.field4781.field354) {
            int var4 = (class71.field1104[arg1] * this.field1417) + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; var7 < class56.field835; var7++) {
                class248.field4131 = Integer.MAX_VALUE;
                class312.field5298 = Integer.MAX_VALUE;
                class236.field3923 = Integer.MAX_VALUE;
                class70.field1092 = Integer.MAX_VALUE;
                int var8 = class31.field430[var7] * this.field1406 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 - 1; var11 <= var6; var11++) {
                    int var12 = this.field1415[(var11 >= this.field1417 ? var11 - this.field1417 : var11) & 0xFF] & 0xFF;
                    for (int var13 = var9 - 1; var13 <= var10; var13++) {
                        int var14 = (this.field1415[var12 + (var13 >= this.field1406 ? var13 - this.field1406 : var13) & 0xFF] & 0xFF) * 2;
                        int var10000 = var8 - (var13 << 12);
                        int var27 = var14 + 1;
                        int var15 = var10000 - this.field1419[var14];
                        int var16 = var4 - (var11 << 12) - this.field1419[var27];
                        int var17 = this.field1423;
                        int var18;
                        if (var17 == 1) {
                            var18 = var15 * var15 + (var16 * var16) >> 12;
                        } else if (var17 == 3) {
                            int var24 = var16 >= 0 ? var16 : -var16;
                            int var25 = var15 >= 0 ? var15 : -var15;
                            var18 = var25 <= var24 ? var24 : var25;
                        } else if (var17 == 4) {
                            int var21 = (int) (Math.sqrt((double) ((float) (var15 >= 0 ? var15 : -var15) / 4096.0F)) * 4096.0D);
                            int var22 = (int) (Math.sqrt((double) ((float) (var16 >= 0 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                            int var23 = var21 + var22;
                            var18 = var23 * var23 >> 12;
                        } else if (var17 == 5) {
                            int var19 = var16 * var16;
                            int var20 = var15 * var15;
                            var18 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var19 + var20) / 1.6777216E7F))) * 4096.0D);
                        } else if (var17 == 2) {
                            var18 = (var15 >= 0 ? var15 : -var15) + (var16 < 0 ? -var16 : var16);
                        } else {
                            var18 = (int) (Math.sqrt((double) ((float) (var15 * var15 + var16 * var16) / 1.6777216E7F)) * 4096.0D);
                        }
                        if (var18 < class70.field1092) {
                            class248.field4131 = class312.field5298;
                            class312.field5298 = class236.field3923;
                            class236.field3923 = class70.field1092;
                            class70.field1092 = var18;
                        } else if (var18 < class236.field3923) {
                            class248.field4131 = class312.field5298;
                            class312.field5298 = class236.field3923;
                            class236.field3923 = var18;
                        } else if (class312.field5298 > var18) {
                            class248.field4131 = class312.field5298;
                            class312.field5298 = var18;
                        } else if (var18 < class248.field4131) {
                            class248.field4131 = var18;
                        }
                    }
                }
                int var26 = this.field1409;
                if (var26 == 0) {
                    var3[var7] = class70.field1092;
                } else if (var26 == 1) {
                    var3[var7] = class236.field3923;
                } else if (var26 == 3) {
                    var3[var7] = class312.field5298;
                } else if (var26 == 4) {
                    var3[var7] = class248.field4131;
                } else if (var26 == 2) {
                    var3[var7] = class236.field3923 - class70.field1092;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)Z", line = 628)
    public static final boolean method669(int arg0, int arg1) {
        field1421++;
        if (arg1 != 29721462) {
            method670(-100, -64);
        }
        return ((arg0 & 0x61F524) >> 22) != 0;
    }

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "(II)Ltl;", line = 639)
    public static final class59 method670(int arg0, int arg1) {
        field1410++;
        class59 var2 = new class59();
        var2.field863 = arg0;
        var2.field889 = new byte[arg1];
        return var2;
    }
}
