import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class113 extends class163 {

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lvj;")
    public static class373 field1395 = new class373(104, 12);

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "F")
    public float field1377;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "F")
    public float field1379;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "F")
    public float field1381;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "F")
    public float field1383;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "F")
    public float field1389;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "F")
    public float field1392;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "F")
    public float field1394;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "F")
    public float field1396;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "F")
    public float field1399;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "F")
    public float field1404;

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "F")
    public float field1409;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "F")
    public float field1412;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1391;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([IIII[J)V")
    public static final void method654(int[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 < arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg2; var11++) {
                if (arg4[var11] < (var7 + ((long) (var11 & var10)))) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method654(arg0, 76, var6 - 1, arg3, arg4);
            method654(arg0, -33, arg2, var6 + 1, arg4);
        }
        field1385++;
        int var15 = 109 % ((arg1 - 40) / 34);
    }

    @OriginalMember(owner = "client!kc", name = "TA", descriptor = "(III)V")
    public final void method655(int arg0, int arg1, int arg2) {
        this.field1392 += arg1;
        field1378++;
        this.field1396 += arg2;
        this.field1389 += arg0;
    }

    @OriginalMember(owner = "client!kc", name = "ha", descriptor = "()V")
    public final void method656() {
        this.field1377 = this.field1383 = this.field1404 = this.field1381 = this.field1394 = this.field1399 = this.field1389 = this.field1392 = this.field1396 = 0.0F;
        field1393++;
        this.field1412 = this.field1379 = this.field1409 = 1.0F;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[I)V")
    public final void method657(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field1394 + (float) arg0 * this.field1412 + (float) arg1 * this.field1404 + this.field1389);
        arg3[1] = (int) ((float) arg2 * this.field1399 + (float) arg0 * this.field1377 + (float) arg1 * this.field1379 + this.field1392);
        field1408++;
        arg3[2] = (int) ((float) arg2 * this.field1409 + (float) arg0 * this.field1383 + (float) arg1 * this.field1381 + this.field1396);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field1395 = null;
        if (arg0 <= 30) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "KA", descriptor = "(I)V")
    public final void method659(int arg0) {
        this.field1412 = 1.0F;
        field1401++;
        this.field1379 = this.field1409 = class462.field6371[arg0 & 0x3FFF];
        this.field1381 = class462.field6380[arg0 & 0x3FFF];
        this.field1404 = this.field1394 = this.field1389 = this.field1377 = this.field1392 = this.field1383 = this.field1396 = 0.0F;
        this.field1399 = -this.field1381;
    }

    @OriginalMember(owner = "client!kc", name = "va", descriptor = "([I)V")
    public final void method660(int[] arg0) {
        field1403++;
        float var2 = (float) arg0[0] - this.field1389;
        float var3 = (float) arg0[1] - this.field1392;
        float var4 = (float) arg0[2] - this.field1396;
        arg0[1] = (int) (this.field1381 * var4 + this.field1404 * var2 + this.field1379 * var3);
        arg0[0] = (int) (this.field1383 * var4 + this.field1412 * var2 + this.field1377 * var3);
        arg0[2] = (int) (this.field1409 * var4 + this.field1399 * var3 + this.field1394 * var2);
    }

    @OriginalMember(owner = "client!kc", name = "oa", descriptor = "(III)V")
    public final void method661(int arg0, int arg1, int arg2) {
        this.field1377 = this.field1383 = this.field1404 = this.field1381 = this.field1394 = this.field1399 = 0.0F;
        field1410++;
        this.field1412 = this.field1379 = this.field1409 = 1.0F;
        this.field1389 = arg0;
        this.field1392 = arg1;
        this.field1396 = arg2;
    }

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "(III[I)V")
    public final void method662(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field1409 + (float) arg0 * this.field1383 + (float) arg1 * this.field1381);
        arg3[1] = (int) ((float) arg2 * this.field1399 + (float) arg0 * this.field1377 + (float) arg1 * this.field1379);
        arg3[0] = (int) ((float) arg2 * this.field1394 + (float) arg0 * this.field1412 + (float) arg1 * this.field1404);
        field1382++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIFFIFI)V")
    public final void method663(int arg0, int arg1, float arg2, float arg3, int arg4, float arg5, int arg6) {
        if (arg6 == 0) {
            this.field1379 = arg4;
            this.field1409 = 1.0F;
            this.field1377 = this.field1383 = this.field1404 = this.field1381 = this.field1394 = this.field1399 = 0.0F;
            this.field1412 = arg1;
        } else {
            float var8 = class462.field6371[arg6 & 0x3FFF];
            float var9 = class462.field6380[arg6 & 0x3FFF];
            this.field1383 = this.field1381 = this.field1394 = this.field1399 = 0.0F;
            this.field1409 = 1.0F;
            this.field1404 = (float) arg4 * -var9;
            this.field1379 = (float) arg4 * var8;
            this.field1377 = (float) arg1 * var9;
            this.field1412 = (float) arg1 * var8;
        }
        field1406++;
        this.field1389 = arg3;
        this.field1392 = arg5;
        if (arg0 != 1) {
            this.field1409 = 1.0021021F;
        }
        this.field1396 = arg2;
    }

    @OriginalMember(owner = "client!kc", name = "ma", descriptor = "(I)V")
    public final void method664(int arg0) {
        this.field1379 = 1.0F;
        field1384++;
        this.field1412 = this.field1409 = class462.field6371[arg0 & 0x3FFF];
        this.field1394 = class462.field6380[arg0 & 0x3FFF];
        this.field1383 = -this.field1394;
        this.field1404 = this.field1389 = this.field1377 = this.field1399 = this.field1392 = this.field1381 = this.field1396 = 0.0F;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)[F")
    public final float[] method665(byte arg0) {
        class434.field5900[4] = this.field1404;
        class434.field5900[10] = this.field1409;
        class434.field5900[1] = this.field1377;
        class434.field5900[6] = this.field1381;
        field1386++;
        int var2 = 103 / ((-arg0 - 71) / 51);
        class434.field5900[13] = 0.0F;
        class434.field5900[8] = this.field1394;
        class434.field5900[14] = 0.0F;
        class434.field5900[12] = 0.0F;
        class434.field5900[9] = this.field1399;
        class434.field5900[2] = this.field1383;
        class434.field5900[5] = this.field1379;
        class434.field5900[0] = this.field1412;
        return class434.field5900;
    }

    @OriginalMember(owner = "client!kc", name = "ta", descriptor = "(I)V")
    public final void method666(int arg0) {
        field1397++;
        this.field1409 = 1.0F;
        this.field1412 = this.field1379 = class462.field6371[arg0 & 0x3FFF];
        this.field1377 = class462.field6380[arg0 & 0x3FFF];
        this.field1394 = this.field1389 = this.field1399 = this.field1392 = this.field1383 = this.field1381 = this.field1396 = 0.0F;
        this.field1404 = -this.field1377;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BII)V")
    public static final void method667(byte arg0, int arg1, int arg2) {
        field1411++;
        class557 var3 = class93.method564(16, -14073, arg1);
        var3.method3257(1948);
        var3.field8207 = arg2;
        if (arg0 >= -69) {
            field1395 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
    public static final boolean method668(int arg0, int arg1, int arg2) {
        if (arg0 >= -47) {
            method667((byte) 119, 119, -97);
        }
        field1388++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "(IIIIII)V")
    public final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1380++;
        float var7 = class462.field6371[arg3 & 0x3FFF];
        float var8 = class462.field6380[arg3 & 0x3FFF];
        float var9 = class462.field6371[arg4 & 0x3FFF];
        float var10 = class462.field6380[arg4 & 0x3FFF];
        float var11 = class462.field6371[arg5 & 0x3FFF];
        float var12 = class462.field6380[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field1379 = var7 * var11;
        this.field1399 = var9 * var13 + var10 * var12;
        this.field1409 = var7 * var9;
        this.field1381 = -var8;
        this.field1394 = -var10 * var11 + var9 * var14;
        this.field1412 = var9 * var11 + var10 * var14;
        this.field1404 = var7 * var12;
        this.field1383 = var7 * var10;
        this.field1377 = -var9 * var12 + var10 * var13;
        this.field1396 = (float) (-arg0) * this.field1383 - ((float) arg1 * this.field1381) - (float) arg2 * this.field1409;
        this.field1389 = (float) (-arg0) * this.field1412 - ((float) arg1 * this.field1404) - ((float) arg2 * this.field1394);
        this.field1392 = (float) (-arg0) * this.field1377 - (float) arg1 * this.field1379 - ((float) arg2 * this.field1399);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lm;I)V")
    public final void method670(class163 arg0, int arg1) {
        field1390++;
        class113 var3 = (class113) arg0;
        this.field1394 = var3.field1383;
        this.field1404 = var3.field1377;
        this.field1412 = var3.field1412;
        this.field1399 = var3.field1381;
        this.field1377 = var3.field1404;
        this.field1383 = var3.field1394;
        this.field1379 = var3.field1379;
        this.field1381 = var3.field1399;
        this.field1409 = var3.field1409;
        if (arg1 != 0) {
            this.method672(10);
        }
        this.field1389 = -(this.field1394 * var3.field1396 + this.field1412 * var3.field1389 + this.field1404 * var3.field1392);
        this.field1392 = -(this.field1399 * var3.field1396 + this.field1379 * var3.field1392 + this.field1377 * var3.field1389);
        this.field1396 = -(this.field1409 * var3.field1396 + this.field1383 * var3.field1389 + this.field1381 * var3.field1392);
    }

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "(I)V")
    public final void method671(int arg0) {
        field1405++;
        float var2 = class462.field6371[arg0 & 0x3FFF];
        float var3 = class462.field6380[arg0 & 0x3FFF];
        float var4 = this.field1377;
        float var5 = this.field1379;
        float var6 = this.field1399;
        this.field1377 = var2 * var4 - (this.field1383 * var3);
        float var7 = this.field1392;
        this.field1383 = this.field1383 * var2 + var3 * var4;
        this.field1379 = var2 * var5 - this.field1381 * var3;
        this.field1381 = this.field1381 * var2 + var3 * var5;
        this.field1399 = var2 * var6 - (this.field1409 * var3);
        this.field1392 = var2 * var7 - this.field1396 * var3;
        this.field1409 = this.field1409 * var2 + var3 * var6;
        this.field1396 = this.field1396 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!kc", name = "XA", descriptor = "(I)V")
    public final void method672(int arg0) {
        field1387++;
        float var2 = class462.field6371[arg0 & 0x3FFF];
        float var3 = class462.field6380[arg0 & 0x3FFF];
        float var4 = this.field1412;
        float var5 = this.field1404;
        float var6 = this.field1394;
        this.field1412 = this.field1383 * var3 + var2 * var4;
        float var7 = this.field1389;
        this.field1383 = this.field1383 * var2 - (var3 * var4);
        this.field1404 = this.field1381 * var3 + var2 * var5;
        this.field1394 = this.field1409 * var3 + var2 * var6;
        this.field1381 = this.field1381 * var2 - var3 * var5;
        this.field1389 = this.field1396 * var3 + var2 * var7;
        this.field1409 = this.field1409 * var2 - var3 * var6;
        this.field1396 = this.field1396 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)[F")
    public final float[] method673(int arg0) {
        class434.field5900[10] = this.field1409;
        class434.field5900[0] = this.field1412;
        class434.field5900[8] = this.field1394;
        class434.field5900[2] = this.field1383;
        class434.field5900[5] = this.field1379;
        class434.field5900[4] = this.field1404;
        class434.field5900[1] = this.field1377;
        class434.field5900[13] = this.field1392;
        field1407++;
        if (arg0 != -19660) {
            method677(-17, 68, -35);
        }
        class434.field5900[12] = this.field1389;
        class434.field5900[14] = this.field1396;
        class434.field5900[6] = this.field1381;
        class434.field5900[9] = this.field1399;
        return class434.field5900;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public static final void method674(boolean arg0) {
        field1398++;
        class541 var1 = (class541) class54.field461.method1050((byte) 73);
        if (arg0) {
            field1395 = null;
        }
        while (var1 != null) {
            if (var1.field7907 > 0) {
                var1.field7907--;
            }
            if (var1.field7907 != 0) {
                if (var1.field7900 > 0) {
                    var1.field7900--;
                }
                if (var1.field7900 == 0 && var1.field7913 >= 1 && var1.field7901 >= 1 && (class106.field1289 - 2) >= var1.field7913 && var1.field7901 <= class422.field5452 - 2 && (var1.field7908 < 0 || class536.method3055(var1.field7909, 25608, var1.field7908))) {
                    class577.method3361(var1.field7914, 34336, var1.field7912, var1.field7905, var1.field7909, var1.field7913, var1.field7908, var1.field7901, -1);
                    var1.field7900 = -1;
                    if (var1.field7911 == var1.field7908 && var1.field7911 == -1) {
                        var1.method3187(true);
                    } else if (var1.field7911 == var1.field7908 && var1.field7905 == var1.field7903 && var1.field7909 == var1.field7906) {
                        var1.method3187(true);
                    }
                }
            } else if (var1.field7911 < 0 || class536.method3055(var1.field7906, 25608, var1.field7911)) {
                class577.method3361(var1.field7914, 34336, var1.field7912, var1.field7903, var1.field7906, var1.field7913, var1.field7911, var1.field7901, -1);
                var1.method3187(true);
            }
            var1 = (class541) class54.field461.method1047(-7962);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Lm;")
    public final class163 method675() {
        field1402++;
        class113 var1 = new class113();
        var1.field1377 = this.field1377;
        var1.field1412 = this.field1412;
        var1.field1409 = this.field1409;
        var1.field1404 = this.field1404;
        var1.field1389 = this.field1389;
        var1.field1381 = this.field1381;
        var1.field1396 = this.field1396;
        var1.field1383 = this.field1383;
        var1.field1394 = this.field1394;
        var1.field1392 = this.field1392;
        var1.field1379 = this.field1379;
        var1.field1399 = this.field1399;
        return var1;
    }

    @OriginalMember(owner = "client!kc", name = "EA", descriptor = "(Lm;)V")
    public final void method676(class163 arg0) {
        field1391++;
        class113 var2 = (class113) arg0;
        this.field1379 = var2.field1379;
        this.field1377 = var2.field1377;
        this.field1381 = var2.field1381;
        this.field1396 = var2.field1396;
        this.field1409 = var2.field1409;
        this.field1383 = var2.field1383;
        this.field1404 = var2.field1404;
        this.field1412 = var2.field1412;
        this.field1389 = var2.field1389;
        this.field1392 = var2.field1392;
        this.field1399 = var2.field1399;
        this.field1394 = var2.field1394;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)I")
    public static final int method677(int arg0, int arg1, int arg2) {
        field1400++;
        int var3 = 26 / ((47 - arg0) / 63);
        int var4 = 0;
        while (arg1 > 0) {
            var4 = var4 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class113() {
        this.method656();
    }
}
