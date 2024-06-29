import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class93 extends class152 {

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    private int field1438 = 0;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "B")
    private byte field1440 = 0;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "B")
    private byte field1427 = 0;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "I")
    public int field1456 = 0;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    private int field1430 = 0;

    @OriginalMember(owner = "client!qg", name = "X", descriptor = "Z")
    public boolean field1457 = false;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "[I")
    private int[] field1441;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "[I")
    public int[] field1439;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
    public int[] field1429;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "[I")
    public int[] field1426;

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "[I")
    private int[] field1447;

    @OriginalMember(owner = "client!qg", name = "eb", descriptor = "[S")
    private short[] field1464;

    @OriginalMember(owner = "client!qg", name = "ab", descriptor = "[S")
    private short[] field1460;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "[S")
    private short[] field1431;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "[S")
    private short[] field1455;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "[F")
    private float[] field1448;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "[F")
    private float[] field1437;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "[S")
    private short[] field1450;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "[B")
    private byte[] field1442;

    @OriginalMember(owner = "client!qg", name = "L", descriptor = "[S")
    private short[] field1446;

    @OriginalMember(owner = "client!qg", name = "Z", descriptor = "[S")
    private short[] field1459;

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "[S")
    private short[] field1454;

    @OriginalMember(owner = "client!qg", name = "db", descriptor = "[S")
    private short[] field1463;

    @OriginalMember(owner = "client!qg", name = "J", descriptor = "[B")
    private byte[] field1444;

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "Lei;")
    public class158 field1449;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Lmb;")
    public class131 field1453;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "Lmb;")
    private class131 field1452;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lmb;")
    private class131 field1435;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lmb;")
    private class131 field1434;

    @OriginalMember(owner = "client!qg", name = "Y", descriptor = "Lmb;")
    private class131 field1458;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "S")
    private short field1432;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "S")
    private short field1428;

    @OriginalMember(owner = "client!qg", name = "K", descriptor = "[S")
    private short[] field1445;

    @OriginalMember(owner = "client!qg", name = "bb", descriptor = "[I")
    private int[] field1461;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "Lj;")
    private static class153 field1451 = new class153(10000);

    @OriginalMember(owner = "client!qg", name = "hb", descriptor = "Lqg;")
    private static class93 field1467 = new class93();

    @OriginalMember(owner = "client!qg", name = "ib", descriptor = "Lqg;")
    private static class93 field1468 = new class93();

    @OriginalMember(owner = "client!qg", name = "jb", descriptor = "Lqg;")
    private static class93 field1469 = new class93();

    @OriginalMember(owner = "client!qg", name = "kb", descriptor = "Lqg;")
    private static class93 field1470 = new class93();

    @OriginalMember(owner = "client!qg", name = "rb", descriptor = "[I")
    private static int[] field1477 = new int[1];

    @OriginalMember(owner = "client!qg", name = "vb", descriptor = "[I")
    private static int[] field1481 = new int[1];

    @OriginalMember(owner = "client!qg", name = "lb", descriptor = "F")
    private static float field1471;

    @OriginalMember(owner = "client!qg", name = "mb", descriptor = "F")
    private static float field1472;

    @OriginalMember(owner = "client!qg", name = "nb", descriptor = "F")
    private static float field1473;

    @OriginalMember(owner = "client!qg", name = "ob", descriptor = "F")
    private static float field1474;

    @OriginalMember(owner = "client!qg", name = "sb", descriptor = "F")
    private static float field1478;

    @OriginalMember(owner = "client!qg", name = "tb", descriptor = "F")
    private static float field1479;

    @OriginalMember(owner = "client!qg", name = "pb", descriptor = "I")
    private static int field1475;

    @OriginalMember(owner = "client!qg", name = "qb", descriptor = "I")
    private static int field1476;

    @OriginalMember(owner = "client!qg", name = "ub", descriptor = "I")
    private static int field1480;

    @OriginalMember(owner = "client!qg", name = "cb", descriptor = "Lie;")
    private class47 field1462;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "Loi;")
    private class98 field1433;

    @OriginalMember(owner = "client!qg", name = "gb", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1466;

    @OriginalMember(owner = "client!qg", name = "fb", descriptor = "[J")
    private static long[] field1465;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "[[I")
    private int[][] field1436;

    @OriginalMember(owner = "client!qg", name = "I", descriptor = "[[I")
    private int[][] field1443;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "(I)V", line = 5)
    public final void method655(int arg0) {
        this.field1428 = (short) arg0;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZLqg;Lqg;)Lfc;", line = 12)
    private final class152 method656(boolean arg0, boolean arg1, class93 arg2, class93 arg3) {
        arg2.field1456 = this.field1456;
        arg2.field1430 = this.field1430;
        arg2.field1438 = this.field1438;
        arg2.field1432 = this.field1432;
        arg2.field1428 = this.field1428;
        arg2.field1427 = (byte) ((arg0 ? 0 : 2) | 0x1 | (arg1 ? 0 : 4));
        if (arg2.field1439 == null || arg2.field1439.length < this.field1456) {
            arg2.field1439 = new int[this.field1456 + 100];
            arg2.field1429 = new int[this.field1456 + 100];
            arg2.field1426 = new int[this.field1456 + 100];
        }
        for (int var5 = 0; var5 < this.field1456; var5++) {
            arg2.field1439[var5] = this.field1439[var5];
            arg2.field1429[var5] = this.field1429[var5];
            arg2.field1426[var5] = this.field1426[var5];
        }
        if (arg2.field1453 == null) {
            arg2.field1453 = new class131();
        }
        arg2.field1453.field2038 = false;
        if (arg2.field1449 == null) {
            arg2.field1449 = new class158();
        }
        arg2.field1449.field2499 = false;
        if (arg0) {
            arg2.field1442 = this.field1442;
            arg2.field1452 = this.field1452;
        } else {
            if (arg3.field1442 == null || arg3.field1442.length < this.field1438) {
                arg3.field1442 = new byte[this.field1438 + 100];
            }
            arg2.field1442 = arg3.field1442;
            for (int var6 = 0; var6 < this.field1438; var6++) {
                arg2.field1442[var6] = this.field1442[var6];
            }
            if (arg3.field1452 == null) {
                arg3.field1452 = new class131();
            }
            arg2.field1452 = arg3.field1452;
            arg2.field1452.field2038 = false;
        }
        if (arg1) {
            arg2.field1464 = this.field1464;
            arg2.field1460 = this.field1460;
            arg2.field1431 = this.field1431;
            arg2.field1455 = this.field1455;
            arg2.field1435 = this.field1435;
        } else {
            if (arg3.field1464 == null || arg3.field1464.length < this.field1430) {
                arg3.field1464 = new short[this.field1430 + 100];
                arg3.field1460 = new short[this.field1430 + 100];
                arg3.field1431 = new short[this.field1430 + 100];
                arg3.field1455 = new short[this.field1430 + 100];
            }
            arg2.field1464 = arg3.field1464;
            arg2.field1460 = arg3.field1460;
            arg2.field1431 = arg3.field1431;
            arg2.field1455 = arg3.field1455;
            for (int var7 = 0; var7 < this.field1430; var7++) {
                arg2.field1464[var7] = this.field1464[var7];
                arg2.field1460[var7] = this.field1460[var7];
                arg2.field1431[var7] = this.field1431[var7];
                arg2.field1455[var7] = this.field1455[var7];
            }
            if (class44.field539) {
                if (arg3.field1435 == null) {
                    arg3.field1435 = new class131();
                }
                arg2.field1435 = arg3.field1435;
                arg2.field1435.field2038 = false;
            } else {
                arg2.field1435 = null;
            }
        }
        arg2.field1448 = this.field1448;
        arg2.field1437 = this.field1437;
        arg2.field1447 = this.field1447;
        arg2.field1436 = this.field1436;
        arg2.field1450 = this.field1450;
        arg2.field1446 = this.field1446;
        arg2.field1459 = this.field1459;
        arg2.field1454 = this.field1454;
        arg2.field1463 = this.field1463;
        arg2.field1444 = this.field1444;
        arg2.field1443 = this.field1443;
        arg2.field1434 = this.field1434;
        arg2.field1458 = this.field1458;
        arg2.field1461 = this.field1461;
        arg2.field1445 = this.field1445;
        arg2.field1441 = this.field1441;
        arg2.field2354 = this.field2354;
        return arg2;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()I", line = 136)
    public final int method116() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2500;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(I)V", line = 144)
    public final void method657(int arg0) {
        int var2 = class173.field2812[arg0];
        int var3 = class173.field2818[arg0];
        for (int var4 = 0; var4 < this.field1456; var4++) {
            int var5 = this.field1439[var4] * var3 + this.field1429[var4] * var2 >> 16;
            this.field1429[var4] = this.field1429[var4] * var3 - this.field1439[var4] * var2 >> 16;
            this.field1439[var4] = var5;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "()V", line = 168)
    public final void method658() {
        for (int var1 = 0; var1 < this.field1456; var1++) {
            this.field1439[var1] = -this.field1439[var1];
            this.field1426[var1] = -this.field1426[var1];
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "()I", line = 180)
    public final int method659() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2501;
    }

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "()V", line = 186)
    private final void method660() {
        if (field1451.field2359.length < this.field1430 * 12) {
            field1451 = new class153((this.field1430 + 100) * 12);
        } else {
            field1451.field2367 = 0;
        }
        if (class90.field1369) {
            for (int var1 = 0; var1 < this.field1438; var1++) {
                field1451.method1045(this.field1446[var1], (byte) 34);
                field1451.method1045(this.field1459[var1], (byte) 23);
                field1451.method1045(this.field1454[var1], (byte) 25);
            }
        } else {
            for (int var2 = 0; var2 < this.field1438; var2++) {
                field1451.method1057(false, this.field1446[var2]);
                field1451.method1057(false, this.field1459[var2]);
                field1451.method1057(false, this.field1454[var2]);
            }
        }
        if (!class90.field1383) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1451.field2367);
            var5.put(field1451.field2359, 0, field1451.field2367);
            var5.flip();
            this.field1458.field2038 = true;
            this.field1458.field2035 = var5;
            this.field1458.field2039 = null;
            return;
        }
        class47 var3 = new class47();
        ByteBuffer var4 = ByteBuffer.wrap(field1451.field2359, 0, field1451.field2367);
        var3.method252(var4);
        this.field1458.field2038 = true;
        this.field1458.field2035 = null;
        this.field1458.field2039 = var3;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([FI)[F", line = 245)
    private static final float[] method661(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class185.method1312(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lid;IZ)V", line = 251)
    public final void method662(class102 arg0, int arg1, boolean arg2) {
        if (this.field1436 == null || arg1 == -1) {
            return;
        }
        class239 var4 = arg0.field1593[arg1];
        class172 var5 = var4.field3880;
        for (int var6 = 0; var6 < this.field1456; var6++) {
            this.field1439[var6] <<= 0x4;
            this.field1429[var6] <<= 0x4;
            this.field1426[var6] <<= 0x4;
        }
        field1480 = 0;
        field1476 = 0;
        field1475 = 0;
        for (int var7 = 0; var7 < var4.field3885; var7++) {
            short var8 = var4.field3886[var7];
            if (var4.field3888[var7] != -1) {
                this.method705(0, var5.field2803[var4.field3888[var7]], 0, 0, 0, arg2);
            }
            this.method705(var5.field2805[var8], var5.field2803[var8], var4.field3878[var7], var4.field3883[var7], var4.field3882[var7], arg2);
        }
        for (int var9 = 0; var9 < this.field1456; var9++) {
            this.field1439[var9] >>= 0x4;
            this.field1429[var9] >>= 0x4;
            this.field1426[var9] >>= 0x4;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "()V", line = 306)
    public final void method663() {
        for (int var1 = 0; var1 < this.field1456; var1++) {
            int var2 = this.field1439[var1];
            this.field1439[var1] = this.field1426[var1];
            this.field1426[var1] = -var2;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lgk;)Lgk;", line = 321)
    public final class265 method664(class265 arg0) {
        if (this.field1430 == 0) {
            return null;
        }
        if (!this.field1449.field2499) {
            this.method665();
        }
        int var2;
        int var3;
        if (class34.field391 > 0) {
            var2 = this.field1449.field2502 - (class34.field391 * this.field1449.field2497 >> 8) >> 3;
            var3 = this.field1449.field2501 - (class34.field391 * this.field1449.field2500 >> 8) >> 3;
        } else {
            var2 = this.field1449.field2502 - (class34.field391 * this.field1449.field2500 >> 8) >> 3;
            var3 = this.field1449.field2501 - (class34.field391 * this.field1449.field2497 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class34.field394 > 0) {
            var4 = this.field1449.field2496 - (class34.field394 * this.field1449.field2497 >> 8) >> 3;
            var5 = this.field1449.field2495 - (class34.field394 * this.field1449.field2500 >> 8) >> 3;
        } else {
            var4 = this.field1449.field2496 - (class34.field394 * this.field1449.field2500 >> 8) >> 3;
            var5 = this.field1449.field2495 - (class34.field394 * this.field1449.field2497 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class265 var8;
        if (arg0 == null || arg0.field4472.length < var6 * var7) {
            var8 = new class265(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field3134 = arg0.field3139 = var6;
            arg0.field3141 = arg0.field3135 = var7;
            arg0.method1843();
        }
        var8.field3142 = var2;
        var8.field3146 = var4;
        if (field1477.length < this.field1430) {
            field1477 = new int[this.field1430];
            field1481 = new int[this.field1430];
        }
        for (int var9 = 0; var9 < this.field1456; var9++) {
            int var10 = (this.field1439[var9] - (this.field1429[var9] * class34.field391 >> 8) >> 3) - var2;
            int var11 = (this.field1426[var9] - (this.field1429[var9] * class34.field394 >> 8) >> 3) - var4;
            int var12 = this.field1441[var9];
            int var13 = this.field1441[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1445[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1477[var15] = var10;
                field1481[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1438; var16++) {
            if (this.field1442[var16] <= 128) {
                short var17 = this.field1446[var16];
                short var18 = this.field1459[var16];
                short var19 = this.field1454[var16];
                int var20 = field1477[var17];
                int var21 = field1477[var18];
                int var22 = field1477[var19];
                int var23 = field1481[var17];
                int var24 = field1481[var18];
                int var25 = field1481[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class173.method1245(var8.field4472, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "()V", line = 446)
    private final void method665() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1456; var9++) {
            int var10 = this.field1439[var9];
            int var11 = this.field1429[var9];
            int var12 = this.field1426[var9];
            if (var10 < var1) {
                var1 = var10;
            }
            if (var10 > var4) {
                var4 = var10;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            int var13 = var10 * var10 + var12 * var12;
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + var10 * var10 + var12 * var12;
            if (var14 > var8) {
                var8 = var14;
            }
        }
        this.field1449.field2502 = (short) var1;
        this.field1449.field2501 = (short) var4;
        this.field1449.field2500 = (short) var2;
        this.field1449.field2497 = (short) var5;
        this.field1449.field2496 = (short) var3;
        this.field1449.field2495 = (short) var6;
        this.field1449.field2498 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1449.field2499 = true;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 519)
    public final void method666(int arg0) {
        int var2 = class173.field2812[arg0];
        int var3 = class173.field2818[arg0];
        for (int var4 = 0; var4 < this.field1456; var4++) {
            int var5 = this.field1429[var4] * var3 - this.field1426[var4] * var2 >> 16;
            this.field1426[var4] = this.field1429[var4] * var2 + this.field1426[var4] * var3 >> 16;
            this.field1429[var4] = var5;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Lf;", line = 538)
    public final class231 method667(int arg0, int arg1, int arg2) {
        this.field1457 = false;
        if (this.field1433 != null) {
            this.field1464 = this.field1433.field1546;
            this.field1460 = this.field1433.field1548;
            this.field1431 = this.field1433.field1545;
            this.field1455 = this.field1433.field1547;
            this.field1433 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 552)
    private static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
        int var12 = arg0 - arg3;
        int var13 = arg1 - arg4;
        int var14 = arg2 - arg5;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var12 + arg7[1] * (float) var13;
        float var16 = arg7[5] * (float) var14 + arg7[3] * (float) var12 + arg7[4] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var12 + arg7[7] * (float) var13;
        float var18;
        float var19;
        if (arg6 == 0) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + 0.5F - var17;
        } else if (arg6 == 1) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg11 + var17 + 0.5F;
        } else if (arg6 == 2) {
            var18 = arg9 + 0.5F - var15;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 3) {
            var18 = arg9 + var15 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else if (arg6 == 4) {
            var18 = arg11 + var17 + 0.5F;
            var19 = arg10 + 0.5F - var16;
        } else {
            var18 = arg11 + 0.5F - var17;
            var19 = arg10 + 0.5F - var16;
        }
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        field1471 = var18;
        field1473 = var19;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(FFF)I", line = 632)
    private static final int method669(float arg0, float arg1, float arg2) {
        float var3 = arg0 < 0.0F ? -arg0 : arg0;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        float var5 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 > var3 && var4 > var5) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var5 > var3 && var5 > var4) {
            return arg2 > 0.0F ? 2 : 3;
        } else if (arg0 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()Z", line = 666)
    public final boolean method670() {
        return this.field1457 && this.field1439 != null && this.field1464 != null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZ)Lfc;", line = 671)
    public final class152 method671(boolean arg0, boolean arg1) {
        return this.method656(arg0, arg1, field1470, field1469);
    }

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "()I", line = 676)
    public final int method672() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2498;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIFFF)[F", line = 684)
    private static final float[] method673(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float[] var8 = new float[9];
        float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var11 = 1.0F - var9;
        var7[0] = var9;
        var7[1] = 0.0F;
        var7[2] = var10;
        var7[3] = 0.0F;
        var7[4] = 1.0F;
        var7[5] = 0.0F;
        var7[6] = -var10;
        var7[7] = 0.0F;
        var7[8] = var9;
        float[] var12 = new float[9];
        float var13 = 1.0F;
        float var14 = 0.0F;
        float var15 = (float) arg1 / 32767.0F;
        float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var17 = 1.0F - var15;
        float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var18 == 0.0F && var15 == 0.0F) {
            var8 = var7;
        } else {
            if (var18 != 0.0F) {
                var13 = (float) (-arg2) / var18;
                var14 = (float) arg0 / var18;
            }
            var12[0] = var13 * var13 * var17 + var15;
            var12[1] = var14 * var16;
            var12[2] = var13 * var14 * var17;
            var12[3] = -var14 * var16;
            var12[4] = var15;
            var12[5] = var13 * var16;
            var12[6] = var13 * var14 * var17;
            var12[7] = -var13 * var16;
            var12[8] = var14 * var14 * var17 + var15;
            var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
            var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
            var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
            var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
            var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
            var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
            var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
            var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
            var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
        }
        var8[0] *= arg4;
        var8[1] *= arg4;
        var8[2] *= arg4;
        var8[3] *= arg5;
        var8[4] *= arg5;
        var8[5] *= arg5;
        var8[6] *= arg6;
        var8[7] *= arg6;
        var8[8] *= arg6;
        return var8;
    }

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "()V", line = 759)
    public final void method674() {
        for (int var1 = 0; var1 < this.field1456; var1++) {
            this.field1426[var1] = -this.field1426[var1];
        }
        if (this.field1431 != null) {
            for (int var2 = 0; var2 < this.field1430; var2++) {
                this.field1431[var2] = (short) (-this.field1431[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1438; var3++) {
            short var4 = this.field1446[var3];
            this.field1446[var3] = this.field1454[var3];
            this.field1454[var3] = var4;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
        this.field1458.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZZZZZZZZZZ)Lqg;", line = 796)
    public final class93 method675(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class93 var12 = new class93();
        var12.field1456 = this.field1456;
        var12.field1430 = this.field1430;
        var12.field1438 = this.field1438;
        if (arg0) {
            var12.field1439 = this.field1439;
            var12.field1426 = this.field1426;
        } else {
            var12.field1439 = class23.method118(this.field1439, 0);
            var12.field1426 = class23.method118(this.field1426, 0);
        }
        if (arg1) {
            var12.field1429 = this.field1429;
        } else {
            var12.field1429 = class23.method118(this.field1429, 0);
        }
        if (arg0 && arg1) {
            var12.field1453 = this.field1453;
            var12.field1449 = this.field1449;
        } else {
            var12.field1453 = new class131();
            var12.field1449 = new class158();
        }
        if (arg2) {
            var12.field1450 = this.field1450;
        } else {
            var12.field1450 = class25.method131(this.field1450, 86);
        }
        if (arg3) {
            var12.field1442 = this.field1442;
        } else {
            var12.field1442 = class117.method847(92, this.field1442);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class44.field539) {
            var12.field1452 = new class131();
        } else {
            var12.field1452 = this.field1452;
        }
        if (arg5) {
            var12.field1464 = this.field1464;
            var12.field1460 = this.field1460;
            var12.field1431 = this.field1431;
            var12.field1455 = this.field1455;
        } else {
            var12.field1464 = class25.method131(this.field1464, 113);
            var12.field1460 = class25.method131(this.field1460, 101);
            var12.field1431 = class25.method131(this.field1431, 107);
            var12.field1455 = class25.method131(this.field1455, 74);
        }
        if (!class44.field539) {
            var12.field1435 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1435 = this.field1435;
        } else {
            var12.field1435 = new class131();
        }
        if (arg8) {
            var12.field1448 = this.field1448;
            var12.field1437 = this.field1437;
            var12.field1434 = this.field1434;
        } else {
            var12.field1448 = class169.method1230(0, this.field1448);
            var12.field1437 = class169.method1230(0, this.field1437);
            var12.field1434 = new class131();
        }
        if (arg9) {
            var12.field1446 = this.field1446;
            var12.field1459 = this.field1459;
            var12.field1454 = this.field1454;
            var12.field1458 = this.field1458;
        } else {
            var12.field1446 = class25.method131(this.field1446, 108);
            var12.field1459 = class25.method131(this.field1459, 77);
            var12.field1454 = class25.method131(this.field1454, 89);
            var12.field1458 = new class131();
        }
        if (arg10) {
            var12.field1463 = this.field1463;
        } else {
            var12.field1463 = class25.method131(this.field1463, 127);
        }
        var12.field1447 = this.field1447;
        var12.field1436 = this.field1436;
        var12.field1444 = this.field1444;
        var12.field1443 = this.field1443;
        var12.field1461 = this.field1461;
        var12.field1445 = this.field1445;
        var12.field1441 = this.field1441;
        var12.field1432 = this.field1432;
        var12.field1428 = this.field1428;
        return var12;
    }

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "(I)V", line = 929)
    public final void method676(int arg0) {
        if (this.field1464 == null) {
            this.method684(arg0);
            return;
        }
        int var2 = class173.field2812[arg0];
        int var3 = class173.field2818[arg0];
        for (int var4 = 0; var4 < this.field1456; var4++) {
            int var5 = this.field1439[var4] * var3 + this.field1426[var4] * var2 >> 16;
            this.field1426[var4] = this.field1426[var4] * var3 - this.field1439[var4] * var2 >> 16;
            this.field1439[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1430; var6++) {
            int var7 = this.field1464[var6] * var3 + this.field1431[var6] * var2 >> 16;
            this.field1431[var6] = (short) (this.field1431[var6] * var3 - this.field1464[var6] * var2 >> 16);
            this.field1464[var6] = (short) var7;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V", line = 3730)
    private class93() {
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Lke;IIZ)V", line = 3732)
    public class93(class208 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field3445];
        this.field1441 = new int[arg0.field3438 + 1];
        for (int var6 = 0; var6 < arg0.field3445; var6++) {
            if ((arg0.field3426 == null || arg0.field3426[var6] != 2) && (arg0.field3410 == null || arg0.field3410[var6] == -1 || !class173.field2815.method516(arg0.field3410[var6] & 0xFFFF, 7711))) {
                var5[this.field1438++] = var6;
                this.field1441[arg0.field3434[var6]]++;
                this.field1441[arg0.field3417[var6]]++;
                this.field1441[arg0.field3430[var6]]++;
            }
        }
        long[] var7 = new long[this.field1438];
        for (int var8 = 0; var8 < this.field1438; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field3410 != null) {
                var14 = arg0.field3410[var9];
                if (var14 != -1) {
                    var12 = class173.field2815.method513(var14 & 0xFFFF, 0);
                    var13 = class173.field2815.method505((byte) -55, var14 & 0xFFFF);
                }
            }
            boolean var15 = arg0.field3444 != null && arg0.field3444[var9] != 0 || var14 != -1 && !class173.field2815.method515(var14 & 0xFFFF, (byte) 120);
            if ((arg3 || var15) && arg0.field3403 != null) {
                var10 += arg0.field3403[var9] << 17;
            }
            if (var15) {
                var10 += 65536;
            }
            int var16 = ((var12 & 0xFF) << 8) + var10;
            int var17 = (var13 & 0xFF) + var16;
            int var18 = ((var14 & 0xFFFF) << 16) + var11;
            int var19 = (var8 & 0xFFFF) + var18;
            var7[var8] = ((long) var17 << 32) + (long) var19;
        }
        class237.method1596(var5, 118, var7);
        this.field1456 = arg0.field3438;
        this.field1439 = arg0.field3404;
        this.field1429 = arg0.field3421;
        this.field1426 = arg0.field3428;
        this.field1447 = arg0.field3451;
        int var20 = this.field1438 * 3;
        this.field1464 = new short[var20];
        this.field1460 = new short[var20];
        this.field1431 = new short[var20];
        this.field1455 = new short[var20];
        this.field1448 = new float[var20];
        this.field1437 = new float[var20];
        this.field1450 = new short[this.field1438];
        this.field1442 = new byte[this.field1438];
        this.field1446 = new short[this.field1438];
        this.field1459 = new short[this.field1438];
        this.field1454 = new short[this.field1438];
        this.field1463 = new short[this.field1438];
        if (arg0.field3412 != null) {
            this.field1444 = new byte[this.field1438];
        }
        this.field1449 = new class158();
        this.field1453 = new class131();
        this.field1452 = new class131();
        if (class44.field539) {
            this.field1435 = new class131();
        }
        this.field1434 = new class131();
        this.field1458 = new class131();
        this.field1432 = (short) arg1;
        this.field1428 = (short) arg2;
        this.field1445 = new short[var20];
        field1465 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < arg0.field3438; var22++) {
            int var23 = this.field1441[var22];
            this.field1441[var22] = var21;
            var21 += var23;
        }
        this.field1441[arg0.field3438] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field3437 != null) {
            int var28 = arg0.field3435;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field1438; var36++) {
                int var37 = var5[var36];
                if (arg0.field3437[var37] != -1) {
                    int var38 = arg0.field3437[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field3434[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field3417[var37];
                        } else {
                            var40 = arg0.field3430[var37];
                        }
                        int var41 = arg0.field3404[var40];
                        int var42 = arg0.field3421[var40];
                        int var43 = arg0.field3428[var40];
                        if (var41 < var29[var38]) {
                            var29[var38] = var41;
                        }
                        if (var41 > var30[var38]) {
                            var30[var38] = var41;
                        }
                        if (var42 < var31[var38]) {
                            var31[var38] = var42;
                        }
                        if (var42 > var32[var38]) {
                            var32[var38] = var42;
                        }
                        if (var43 < var33[var38]) {
                            var33[var38] = var43;
                        }
                        if (var43 > var34[var38]) {
                            var34[var38] = var43;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var25 = new int[var28];
            var26 = new int[var28];
            var27 = new float[var28][];
            for (int var44 = 0; var44 < var28; var44++) {
                byte var45 = arg0.field3433[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field3405[var44];
                        if (var46 == 0) {
                            var47 = 1.0F;
                            var48 = 1.0F;
                        } else if (var46 > 0) {
                            var47 = 1.0F;
                            var48 = (float) var46 / 1024.0F;
                        } else {
                            var48 = 1.0F;
                            var47 = (float) (-var46) / 1024.0F;
                        }
                        var49 = 64.0F / (float) (arg0.field3432[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field3405[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field3432[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field3413[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field3405[var44] / 1024.0F;
                        var49 = (float) arg0.field3432[var44] / 1024.0F;
                        var48 = (float) arg0.field3413[var44] / 1024.0F;
                    }
                    var27[var44] = method673(arg0.field3446[var44], arg0.field3411[var44], arg0.field3406[var44], arg0.field3441[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1438; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field3425[var51] & 0xFFFF;
            short var53;
            if (arg0.field3410 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field3410[var51];
            }
            int var54;
            if (arg0.field3437 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field3437[var51];
            }
            int var55;
            if (arg0.field3444 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field3444[var51] & 0xFF;
            }
            float var56 = 0.0F;
            float var57 = 0.0F;
            float var58 = 0.0F;
            float var59 = 0.0F;
            float var60 = 0.0F;
            float var61 = 0.0F;
            byte var62 = 0;
            byte var63 = 0;
            int var64 = 0;
            if (var53 != -1) {
                if (var54 == -1) {
                    var56 = 0.0F;
                    var57 = 1.0F;
                    var58 = 1.0F;
                    var59 = 1.0F;
                    var62 = 1;
                    var60 = 0.0F;
                    var61 = 0.0F;
                    var63 = 2;
                } else {
                    var54 &= 0xFF;
                    byte var65 = arg0.field3433[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field3434[var51];
                        int var67 = arg0.field3417[var51];
                        int var68 = arg0.field3430[var51];
                        short var69 = arg0.field3446[var54];
                        short var70 = arg0.field3411[var54];
                        short var71 = arg0.field3406[var54];
                        float var72 = (float) arg0.field3404[var69];
                        float var73 = (float) arg0.field3421[var69];
                        float var74 = (float) arg0.field3428[var69];
                        float var75 = (float) arg0.field3404[var70] - var72;
                        float var76 = (float) arg0.field3421[var70] - var73;
                        float var77 = (float) arg0.field3428[var70] - var74;
                        float var78 = (float) arg0.field3404[var71] - var72;
                        float var79 = (float) arg0.field3421[var71] - var73;
                        float var80 = (float) arg0.field3428[var71] - var74;
                        float var81 = (float) arg0.field3404[var66] - var72;
                        float var82 = (float) arg0.field3421[var66] - var73;
                        float var83 = (float) arg0.field3428[var66] - var74;
                        float var84 = (float) arg0.field3404[var67] - var72;
                        float var85 = (float) arg0.field3421[var67] - var73;
                        float var86 = (float) arg0.field3428[var67] - var74;
                        float var87 = (float) arg0.field3404[var68] - var72;
                        float var88 = (float) arg0.field3421[var68] - var73;
                        float var89 = (float) arg0.field3428[var68] - var74;
                        float var90 = var76 * var80 - var77 * var79;
                        float var91 = var77 * var78 - var75 * var80;
                        float var92 = var75 * var79 - var76 * var78;
                        float var93 = var79 * var92 - var80 * var91;
                        float var94 = var80 * var90 - var78 * var92;
                        float var95 = var78 * var91 - var79 * var90;
                        float var96 = 1.0F / (var77 * var95 + var75 * var93 + var76 * var94);
                        var56 = (var83 * var95 + var81 * var93 + var82 * var94) * var96;
                        var58 = (var86 * var95 + var84 * var93 + var85 * var94) * var96;
                        var60 = (var89 * var95 + var87 * var93 + var88 * var94) * var96;
                        float var97 = var76 * var92 - var77 * var91;
                        float var98 = var77 * var90 - var75 * var92;
                        float var99 = var75 * var91 - var76 * var90;
                        float var100 = 1.0F / (var80 * var99 + var78 * var97 + var79 * var98);
                        var57 = (var83 * var99 + var81 * var97 + var82 * var98) * var100;
                        var59 = (var86 * var99 + var84 * var97 + var85 * var98) * var100;
                        var61 = (var89 * var99 + var87 * var97 + var88 * var98) * var100;
                    } else {
                        int var101 = arg0.field3434[var51];
                        int var102 = arg0.field3417[var51];
                        int var103 = arg0.field3430[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field3436[var54];
                        float var109 = (float) arg0.field3416[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field3413[var54] & 0xFFFF) / 1024.0F;
                            method697(arg0.field3404[var101], arg0.field3421[var101], arg0.field3428[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1474;
                            var57 = field1472;
                            method697(arg0.field3404[var102], arg0.field3421[var102], arg0.field3428[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1474;
                            var59 = field1472;
                            method697(arg0.field3404[var103], arg0.field3421[var103], arg0.field3428[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1474;
                            var61 = field1472;
                            float var111 = var110 / 2.0F;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > var111) {
                                    var58 -= var110;
                                    var62 = 1;
                                } else if (var56 - var58 > var111) {
                                    var58 += var110;
                                    var62 = 2;
                                }
                                if (var60 - var56 > var111) {
                                    var60 -= var110;
                                    var63 = 1;
                                } else if (var56 - var60 > var111) {
                                    var60 += var110;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > var111) {
                                    var59 -= var110;
                                    var62 = 1;
                                } else if (var57 - var59 > var111) {
                                    var59 += var110;
                                    var62 = 2;
                                }
                                if (var61 - var57 > var111) {
                                    var61 -= var110;
                                    var63 = 1;
                                } else if (var57 - var61 > var111) {
                                    var61 += var110;
                                    var63 = 2;
                                }
                            }
                        } else if (var65 == 2) {
                            float var112 = (float) arg0.field3424[var54] / 256.0F;
                            float var113 = (float) arg0.field3442[var54] / 256.0F;
                            int var114 = arg0.field3404[var102] - arg0.field3404[var101];
                            int var115 = arg0.field3421[var102] - arg0.field3421[var101];
                            int var116 = arg0.field3428[var102] - arg0.field3428[var101];
                            int var117 = arg0.field3404[var103] - arg0.field3404[var101];
                            int var118 = arg0.field3421[var103] - arg0.field3421[var101];
                            int var119 = arg0.field3428[var103] - arg0.field3428[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field3405[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field3432[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field3413[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method669(var126, var127, var128);
                            method668(arg0.field3404[var101], arg0.field3421[var101], arg0.field3428[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1471;
                            var57 = field1473;
                            method668(arg0.field3404[var102], arg0.field3421[var102], arg0.field3428[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1471;
                            var59 = field1473;
                            method668(arg0.field3404[var103], arg0.field3421[var103], arg0.field3428[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1471;
                            var61 = field1473;
                        } else if (var65 == 3) {
                            method694(arg0.field3404[var101], arg0.field3421[var101], arg0.field3428[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1479;
                            var57 = field1478;
                            method694(arg0.field3404[var102], arg0.field3421[var102], arg0.field3428[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1479;
                            var59 = field1478;
                            method694(arg0.field3404[var103], arg0.field3421[var103], arg0.field3428[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1479;
                            var61 = field1478;
                            if ((var108 & 0x1) == 0) {
                                if (var58 - var56 > 0.5F) {
                                    var58--;
                                    var62 = 1;
                                } else if (var56 - var58 > 0.5F) {
                                    var58++;
                                    var62 = 2;
                                }
                                if (var60 - var56 > 0.5F) {
                                    var60--;
                                    var63 = 1;
                                } else if (var56 - var60 > 0.5F) {
                                    var60++;
                                    var63 = 2;
                                }
                            } else {
                                if (var59 - var57 > 0.5F) {
                                    var59--;
                                    var62 = 1;
                                } else if (var57 - var59 > 0.5F) {
                                    var59++;
                                    var62 = 2;
                                }
                                if (var61 - var57 > 0.5F) {
                                    var61--;
                                    var63 = 1;
                                } else if (var57 - var61 > 0.5F) {
                                    var61++;
                                    var63 = 2;
                                }
                            }
                        }
                    }
                }
            }
            arg0.method1448();
            byte var129;
            if (arg0.field3426 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field3426[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field3434[var51];
                class266 var133 = arg0.field3407[var132];
                this.field1446[var50] = this.method677(arg0, var132, var130, var133.field4488, var133.field4475, var133.field4486, var133.field4485, var56, var57);
                int var134 = arg0.field3417[var51];
                class266 var135 = arg0.field3407[var134];
                this.field1459[var50] = this.method677(arg0, var134, (long) var62 + var130, var135.field4488, var135.field4475, var135.field4486, var135.field4485, var58, var59);
                int var136 = arg0.field3430[var51];
                class266 var137 = arg0.field3407[var136];
                this.field1454[var50] = this.method677(arg0, var136, (long) var63 + var130, var137.field4488, var137.field4475, var137.field4486, var137.field4485, var60, var61);
            } else if (var129 == 1) {
                class43 var138 = arg0.field3418[var51];
                long var139 = (long) ((var54 << 2) + (var138.field524 > 0 ? 1024 : 2048) + (var138.field523 + 256 << 12) + (var138.field528 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1446[var50] = this.method677(arg0, arg0.field3434[var51], var139, var138.field524, var138.field523, var138.field528, 0, var56, var57);
                this.field1459[var50] = this.method677(arg0, arg0.field3417[var51], (long) var62 + var139, var138.field524, var138.field523, var138.field528, 0, var58, var59);
                this.field1454[var50] = this.method677(arg0, arg0.field3430[var51], (long) var63 + var139, var138.field524, var138.field523, var138.field528, 0, var60, var61);
            }
            if (arg0.field3410 == null) {
                this.field1463[var50] = -1;
            } else {
                this.field1463[var50] = arg0.field3410[var51];
            }
            if (this.field1444 != null) {
                this.field1444[var50] = (byte) arg0.field3412[var51];
            }
            this.field1450[var50] = arg0.field3425[var51];
            if (arg0.field3444 != null) {
                this.field1442[var50] = arg0.field3444[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1438; var143++) {
            short var144 = this.field1463[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1461 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1438; var147++) {
            short var148 = this.field1463[var147];
            if (var146 != var148) {
                this.field1461[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1461[var145] = this.field1438;
        field1465 = null;
        this.field1464 = method686(this.field1464, this.field1430);
        this.field1460 = method686(this.field1460, this.field1430);
        this.field1431 = method686(this.field1431, this.field1430);
        this.field1455 = method686(this.field1455, this.field1430);
        this.field1448 = method661(this.field1448, this.field1430);
        this.field1437 = method661(this.field1437, this.field1430);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lke;IJIIIIFF)S", line = 974)
    private final short method677(class208 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1441[arg1];
        int var12 = this.field1441[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1445[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1465[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1445[var13] = (short) (this.field1430 + 1);
        field1465[var13] = arg2;
        this.field1464[this.field1430] = (short) arg3;
        this.field1460[this.field1430] = (short) arg4;
        this.field1431[this.field1430] = (short) arg5;
        this.field1455[this.field1430] = (short) arg6;
        this.field1448[this.field1430] = arg7;
        this.field1437[this.field1430] = arg8;
        return (short) (this.field1430++);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lid;I)V", line = 1009)
    public final void method678(class102 arg0, int arg1) {
        if (this.field1436 == null || arg1 == -1) {
            return;
        }
        class239 var3 = arg0.field1593[arg1];
        class172 var4 = var3.field3880;
        field1480 = 0;
        field1476 = 0;
        field1475 = 0;
        for (int var5 = 0; var5 < var3.field3885; var5++) {
            short var6 = var3.field3886[var5];
            if (var4.field2798[var6]) {
                if (var3.field3888[var5] != -1) {
                    this.method681(0, 0, 0, 0);
                }
                this.method681(var4.field2805[var6], var3.field3878[var5], var3.field3883[var5], var3.field3882[var5]);
            }
        }
        this.field1453.field2038 = false;
        this.field1449.field2499 = false;
    }

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "()V", line = 1044)
    public static final void method679() {
        field1467 = new class93();
        field1468 = new class93();
        field1469 = new class93();
        field1470 = new class93();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lid;ILid;I[IZ)V", line = 1054)
    public final void method680(class102 arg0, int arg1, class102 arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method662(arg0, arg1, arg5);
            return;
        }
        class239 var7 = arg0.field1593[arg1];
        class239 var8 = arg2.field1593[arg3];
        class172 var9 = var7.field3880;
        for (int var10 = 0; var10 < this.field1456; var10++) {
            this.field1439[var10] <<= 0x4;
            this.field1429[var10] <<= 0x4;
            this.field1426[var10] <<= 0x4;
        }
        field1480 = 0;
        field1476 = 0;
        field1475 = 0;
        byte var11 = 0;
        int var20 = var11 + 1;
        int var12 = arg4[var11];
        for (int var13 = 0; var13 < var7.field3885; var13++) {
            short var14 = var7.field3886[var13];
            while (var14 > var12) {
                var12 = arg4[var20++];
            }
            if (var12 != var14 || var9.field2805[var14] == 0) {
                if (var7.field3888[var13] != -1) {
                    this.method705(0, var9.field2803[var7.field3888[var13]], 0, 0, 0, arg5);
                }
                this.method705(var9.field2805[var14], var9.field2803[var14], var7.field3878[var13], var7.field3883[var13], var7.field3882[var13], arg5);
            }
        }
        field1480 = 0;
        field1476 = 0;
        field1475 = 0;
        byte var15 = 0;
        int var21 = var15 + 1;
        int var16 = arg4[var15];
        for (int var17 = 0; var17 < var8.field3885; var17++) {
            short var18 = var8.field3886[var17];
            while (var18 > var16) {
                var16 = arg4[var21++];
            }
            if (var16 == var18 || var9.field2805[var18] == 0) {
                if (var8.field3888[var17] != -1) {
                    this.method705(0, var9.field2803[var8.field3888[var17]], 0, 0, 0, arg5);
                }
                this.method705(var9.field2805[var18], var9.field2803[var18], var8.field3878[var17], var8.field3883[var17], var8.field3882[var17], arg5);
            }
        }
        for (int var19 = 0; var19 < this.field1456; var19++) {
            this.field1439[var19] >>= 0x4;
            this.field1429[var19] >>= 0x4;
            this.field1426[var19] >>= 0x4;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)V", line = 1149)
    private final void method681(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1480 = 0;
            field1476 = 0;
            field1475 = 0;
            for (int var6 = 0; var6 < this.field1456; var6++) {
                field1480 += this.field1439[var6];
                field1476 += this.field1429[var6];
                field1475 += this.field1426[var6];
                var5++;
            }
            if (var5 > 0) {
                field1480 = field1480 / var5 + arg1;
                field1476 = field1476 / var5 + arg2;
                field1475 = field1475 / var5 + arg3;
            } else {
                field1480 = arg1;
                field1476 = arg2;
                field1475 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1456; var7++) {
                this.field1439[var7] += arg1;
                this.field1429[var7] += arg2;
                this.field1426[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1456; var8++) {
                this.field1439[var8] -= field1480;
                this.field1429[var8] -= field1476;
                this.field1426[var8] -= field1475;
                if (arg3 != 0) {
                    int var9 = class173.field2812[arg3];
                    int var10 = class173.field2818[arg3];
                    int var11 = this.field1439[var8] * var10 + this.field1429[var8] * var9 + 32767 >> 16;
                    this.field1429[var8] = this.field1429[var8] * var10 + 32767 - this.field1439[var8] * var9 >> 16;
                    this.field1439[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class173.field2812[arg1];
                    int var13 = class173.field2818[arg1];
                    int var14 = this.field1429[var8] * var13 + 32767 - this.field1426[var8] * var12 >> 16;
                    this.field1426[var8] = this.field1429[var8] * var12 + this.field1426[var8] * var13 + 32767 >> 16;
                    this.field1429[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class173.field2812[arg2];
                    int var16 = class173.field2818[arg2];
                    int var17 = this.field1439[var8] * var16 + this.field1426[var8] * var15 + 32767 >> 16;
                    this.field1426[var8] = this.field1426[var8] * var16 + 32767 - this.field1439[var8] * var15 >> 16;
                    this.field1439[var8] = var17;
                }
                this.field1439[var8] += field1480;
                this.field1429[var8] += field1476;
                this.field1426[var8] += field1475;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1456; var18++) {
                this.field1439[var18] -= field1480;
                this.field1429[var18] -= field1476;
                this.field1426[var18] -= field1475;
                this.field1439[var18] = this.field1439[var18] * arg1 / 128;
                this.field1429[var18] = this.field1429[var18] * arg2 / 128;
                this.field1426[var18] = this.field1426[var18] * arg3 / 128;
                this.field1439[var18] += field1480;
                this.field1429[var18] += field1476;
                this.field1426[var18] += field1475;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1438; var19++) {
                int var20 = (this.field1442[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1442[var19] = (byte) var20;
            }
            this.field1452.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(SS)V", line = 1305)
    public final void method682(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1438; var3++) {
            if (this.field1450[var3] == arg0) {
                this.field1450[var3] = arg1;
            }
        }
        this.field1452.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "()V", line = 1318)
    public static void method683() {
        field1465 = null;
        field1451 = null;
        field1466 = null;
        field1467 = null;
        field1468 = null;
        field1469 = null;
        field1470 = null;
        field1477 = null;
        field1481 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 1330)
    public final void method684(int arg0) {
        int var2 = class173.field2812[arg0];
        int var3 = class173.field2818[arg0];
        for (int var4 = 0; var4 < this.field1456; var4++) {
            int var5 = this.field1439[var4] * var3 + this.field1426[var4] * var2 >> 16;
            this.field1426[var4] = this.field1426[var4] * var3 - this.field1439[var4] * var2 >> 16;
            this.field1439[var4] = var5;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "()I", line = 1349)
    public final int method685() {
        return this.field1432;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([SI)[S", line = 1356)
    private static final short[] method686(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class185.method1314(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()I", line = 1361)
    public final int method687() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2502;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(III)V", line = 1369)
    public final void method688(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1456; var4++) {
            this.field1439[var4] = this.field1439[var4] * arg0 >> 7;
            this.field1429[var4] = this.field1429[var4] * arg1 >> 7;
            this.field1426[var4] = this.field1426[var4] * arg2 >> 7;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZZZZ)V", line = 1383)
    private final void method689(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1453.field2040 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1452.field2040 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1435.field2040 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1434.field2040 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1451.field2359.length < this.field1430 * var6) {
            field1451 = new class153((this.field1430 + 100) * var6);
        } else {
            field1451.field2367 = 0;
        }
        if (arg1) {
            if (class90.field1369) {
                for (int var7 = 0; var7 < this.field1456; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1439[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1429[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1426[var7]);
                    int var11 = this.field1441[var7];
                    int var12 = this.field1441[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1445[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1451.field2367 = var6 * var14;
                        field1451.method1045(var8, (byte) 23);
                        field1451.method1045(var9, (byte) 28);
                        field1451.method1045(var10, (byte) 34);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1456; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1439[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1429[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1426[var15]);
                    int var19 = this.field1441[var15];
                    int var20 = this.field1441[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1445[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1451.field2367 = var6 * var22;
                        field1451.method1057(false, var16);
                        field1451.method1057(false, var17);
                        field1451.method1057(false, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class44.field539) {
                for (int var42 = 0; var42 < this.field1438; var42++) {
                    int var43 = method706(this.field1450[var42], this.field1463[var42], this.field1432, this.field1442[var42]);
                    field1451.field2367 = this.field1446[var42] * var6 + this.field1452.field2040;
                    field1451.method1045(var43, (byte) 69);
                    field1451.field2367 = this.field1459[var42] * var6 + this.field1452.field2040;
                    field1451.method1045(var43, (byte) 8);
                    field1451.field2367 = this.field1454[var42] * var6 + this.field1452.field2040;
                    field1451.method1045(var43, (byte) 67);
                }
            } else {
                int var23 = (int) class34.field402[0];
                int var24 = (int) class34.field402[1];
                int var25 = (int) class34.field402[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1432 * 1.3F);
                int var28 = this.field1428 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1438; var29++) {
                    short var30 = this.field1446[var29];
                    short var31 = this.field1455[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1431[var30] * var25 + this.field1464[var30] * var23 + this.field1460[var30] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1431[var30] * var25 + this.field1464[var30] * var23 + this.field1460[var30] * var24) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1455[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1459[var29];
                    short var34 = this.field1455[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1431[var33] * var25 + this.field1464[var33] * var23 + this.field1460[var33] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1431[var33] * var25 + this.field1464[var33] * var23 + this.field1460[var33] * var24) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1455[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1454[var29];
                    short var37 = this.field1455[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1431[var36] * var25 + this.field1464[var36] * var23 + this.field1460[var36] * var24) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1431[var36] * var25 + this.field1464[var36] * var23 + this.field1460[var36] * var24) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1455[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method706(this.field1450[var29], this.field1463[var29], var32, this.field1442[var29]);
                    int var40 = method706(this.field1450[var29], this.field1463[var29], var35, this.field1442[var29]);
                    int var41 = method706(this.field1450[var29], this.field1463[var29], var38, this.field1442[var29]);
                    field1451.field2367 = var6 * var30 + this.field1452.field2040;
                    field1451.method1045(var39, (byte) 29);
                    field1451.field2367 = var6 * var33 + this.field1452.field2040;
                    field1451.method1045(var40, (byte) 98);
                    field1451.field2367 = var6 * var36 + this.field1452.field2040;
                    field1451.method1045(var41, (byte) 24);
                }
                this.field1464 = null;
                this.field1460 = null;
                this.field1431 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1428;
            float var45 = 3.0F / (float) (this.field1428 / 2 + this.field1428);
            field1451.field2367 = this.field1435.field2040;
            if (class90.field1369) {
                for (int var46 = 0; var46 < this.field1430; var46++) {
                    short var47 = this.field1455[var46];
                    if (var47 == 0) {
                        field1451.method1098(0, (float) this.field1464[var46] * var45);
                        field1451.method1098(0, (float) this.field1460[var46] * var45);
                        field1451.method1098(0, (float) this.field1431[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1451.method1098(0, (float) this.field1464[var46] * var48);
                        field1451.method1098(0, (float) this.field1460[var46] * var48);
                        field1451.method1098(0, (float) this.field1431[var46] * var48);
                    }
                    field1451.field2367 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1430; var49++) {
                    short var50 = this.field1455[var49];
                    if (var50 == 0) {
                        field1451.method1070((byte) -120, (float) this.field1464[var49] * var45);
                        field1451.method1070((byte) -127, (float) this.field1460[var49] * var45);
                        field1451.method1070((byte) -116, (float) this.field1431[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1451.method1070((byte) -125, (float) this.field1464[var49] * var51);
                        field1451.method1070((byte) -107, (float) this.field1460[var49] * var51);
                        field1451.method1070((byte) -106, (float) this.field1431[var49] * var51);
                    }
                    field1451.field2367 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1451.field2367 = this.field1434.field2040;
            if (class90.field1369) {
                for (int var52 = 0; var52 < this.field1430; var52++) {
                    field1451.method1098(0, this.field1448[var52]);
                    field1451.method1098(0, this.field1437[var52]);
                    field1451.field2367 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1430; var53++) {
                    field1451.method1070((byte) -109, this.field1448[var53]);
                    field1451.method1070((byte) -106, this.field1437[var53]);
                    field1451.field2367 += var6 - 8;
                }
            }
        }
        field1451.field2367 = this.field1430 * var6;
        if (arg0) {
            if (class90.field1387) {
                ByteBuffer var54 = ByteBuffer.wrap(field1451.field2359, 0, field1451.field2367);
                if (this.field1462 == null) {
                    this.field1462 = new class47(true);
                    this.field1462.method252(var54);
                } else {
                    this.field1462.method256(var54);
                }
                if (arg1) {
                    this.field1453.field2038 = true;
                    this.field1453.field2035 = null;
                    this.field1453.field2039 = this.field1462;
                    this.field1453.field2033 = var6;
                }
                if (arg2) {
                    this.field1452.field2038 = true;
                    this.field1452.field2035 = null;
                    this.field1452.field2039 = this.field1462;
                    this.field1452.field2033 = var6;
                }
                if (arg3) {
                    this.field1435.field2038 = true;
                    this.field1435.field2035 = null;
                    this.field1435.field2039 = this.field1462;
                    this.field1435.field2033 = var6;
                }
                if (arg4) {
                    this.field1434.field2038 = true;
                    this.field1434.field2035 = null;
                    this.field1434.field2039 = this.field1462;
                    this.field1434.field2033 = var6;
                }
            } else {
                if (field1466 == null || field1466.capacity() < field1451.field2367) {
                    field1466 = ByteBuffer.allocateDirect(var6 * 100 + field1451.field2367);
                } else {
                    field1466.clear();
                }
                field1466.put(field1451.field2359, 0, field1451.field2367);
                field1466.flip();
                if (arg1) {
                    this.field1453.field2038 = true;
                    this.field1453.field2035 = field1466;
                    this.field1453.field2039 = null;
                    this.field1453.field2033 = var6;
                }
                if (arg2) {
                    this.field1452.field2038 = true;
                    this.field1452.field2035 = field1466;
                    this.field1453.field2039 = null;
                    this.field1452.field2033 = var6;
                }
                if (arg3) {
                    this.field1435.field2038 = true;
                    this.field1435.field2035 = field1466;
                    this.field1435.field2039 = null;
                    this.field1435.field2033 = var6;
                }
                if (arg4) {
                    this.field1434.field2038 = true;
                    this.field1434.field2035 = field1466;
                    this.field1434.field2039 = null;
                    this.field1434.field2033 = var6;
                }
            }
        } else if (class90.field1383) {
            class47 var55 = new class47();
            ByteBuffer var56 = ByteBuffer.wrap(field1451.field2359, 0, field1451.field2367);
            var55.method252(var56);
            if (arg1) {
                this.field1453.field2038 = true;
                this.field1453.field2035 = null;
                this.field1453.field2039 = var55;
                this.field1453.field2033 = var6;
            }
            if (arg2) {
                this.field1452.field2038 = true;
                this.field1452.field2035 = null;
                this.field1452.field2039 = var55;
                this.field1452.field2033 = var6;
            }
            if (arg3) {
                this.field1435.field2038 = true;
                this.field1435.field2035 = null;
                this.field1435.field2039 = var55;
                this.field1435.field2033 = var6;
            }
            if (arg4) {
                this.field1434.field2038 = true;
                this.field1434.field2035 = null;
                this.field1434.field2039 = var55;
                this.field1434.field2033 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1451.field2367);
            var57.put(field1451.field2359, 0, field1451.field2367);
            var57.flip();
            if (arg1) {
                this.field1453.field2038 = true;
                this.field1453.field2035 = var57;
                this.field1453.field2039 = null;
                this.field1453.field2033 = var6;
            }
            if (arg2) {
                this.field1452.field2038 = true;
                this.field1452.field2035 = var57;
                this.field1453.field2039 = null;
                this.field1452.field2033 = var6;
            }
            if (arg3) {
                this.field1435.field2038 = true;
                this.field1435.field2035 = var57;
                this.field1435.field2039 = null;
                this.field1435.field2033 = var6;
            }
            if (arg4) {
                this.field1434.field2038 = true;
                this.field1434.field2035 = var57;
                this.field1434.field2039 = null;
                this.field1434.field2033 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "()I", line = 1912)
    public final int method690() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2496;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V", line = 1921)
    public final void method691() {
        for (int var1 = 0; var1 < this.field1456; var1++) {
            int var2 = this.field1426[var1];
            this.field1426[var1] = this.field1439[var1];
            this.field1439[var1] = -var2;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "()I", line = 1936)
    public final int method692() {
        return this.field1428;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V", line = 1940)
    public final void method693(int arg0) {
        this.field1432 = (short) arg0;
        this.field1452.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII[FIF)V", line = 1950)
    private static final void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
        int var9 = arg0 - arg3;
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg5;
        float var12 = arg6[2] * (float) var11 + arg6[0] * (float) var9 + arg6[1] * (float) var10;
        float var13 = arg6[5] * (float) var11 + arg6[3] * (float) var9 + arg6[4] * (float) var10;
        float var14 = arg6[8] * (float) var11 + arg6[6] * (float) var9 + arg6[7] * (float) var10;
        float var15 = (float) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
        float var16 = (float) Math.atan2((double) var12, (double) var14) / 6.2831855F + 0.5F;
        float var17 = (float) Math.asin((double) (var13 / var15)) / 3.1415927F + arg8 + 0.5F;
        if (arg7 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg7 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1479 = var16;
        field1478 = var17;
    }

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "()V", line = 1993)
    public final void method695() {
        if (this.field1464 == null) {
            this.method658();
            return;
        }
        for (int var1 = 0; var1 < this.field1456; var1++) {
            this.field1439[var1] = -this.field1439[var1];
            this.field1426[var1] = -this.field1426[var1];
        }
        for (int var2 = 0; var2 < this.field1430; var2++) {
            this.field1464[var2] = (short) (-this.field1464[var2]);
            this.field1431[var2] = (short) (-this.field1431[var2]);
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZZZZZZ)V", line = 2029)
    public final void method696(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1427 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1430 != 0) {
            if (arg6) {
                boolean var8 = !this.field1452.field2038 && (arg1 || arg2 && !class44.field539);
                this.method689(false, !this.field1453.field2038 && arg0, var8, this.field1435 != null && !this.field1435.field2038 && arg2, !this.field1434.field2038 && arg3);
                if (!this.field1458.field2038 && arg4 && arg1) {
                    this.method660();
                }
            }
            if (arg0) {
                if (this.field1453.field2038) {
                    this.field1439 = null;
                    this.field1429 = null;
                    this.field1426 = null;
                    this.field1445 = null;
                    this.field1441 = null;
                } else {
                    this.field1440 = (byte) (this.field1440 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1452.field2038) {
                    this.field1450 = null;
                    this.field1442 = null;
                } else {
                    this.field1440 = (byte) (this.field1440 | 0x2);
                }
            }
            if (arg2 && class44.field539) {
                if (this.field1435.field2038) {
                    this.field1464 = null;
                    this.field1460 = null;
                    this.field1431 = null;
                    this.field1455 = null;
                } else {
                    this.field1440 = (byte) (this.field1440 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1434.field2038) {
                    this.field1448 = null;
                    this.field1437 = null;
                } else {
                    this.field1440 = (byte) (this.field1440 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1458.field2038 && this.field1452.field2038) {
                    this.field1446 = null;
                    this.field1459 = null;
                    this.field1454 = null;
                } else {
                    this.field1440 = (byte) (this.field1440 | 0x10);
                }
            }
            if (arg5) {
                this.field1447 = null;
                this.field1444 = null;
                this.field1436 = (int[][]) null;
                this.field1443 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII[FFIF)V", line = 2121)
    private static final void method697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
        int var10 = arg0 - arg3;
        int var11 = arg1 - arg4;
        int var12 = arg2 - arg5;
        float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
        float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
        float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
        float var16 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var16 = arg7 * var16;
        }
        float var17 = var14 + arg9 + 0.5F;
        if (arg8 == 1) {
            float var18 = var16;
            var16 = -var17;
            var17 = var18;
        } else if (arg8 == 2) {
            var16 = -var16;
            var17 = -var17;
        } else if (arg8 == 3) {
            float var19 = var16;
            var16 = var17;
            var17 = -var19;
        }
        field1474 = var16;
        field1472 = var17;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(SS)V", line = 2169)
    public final void method698(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1438; var3++) {
            if (this.field1463[var3] == arg0) {
                this.field1463[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class173.field2815.method507(arg0 & 0xFFFF, false);
            var5 = class173.field2815.method508(15, arg0 & 0xFFFF);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class173.field2815.method507(arg1 & 0xFFFF, false);
            var7 = class173.field2815.method508(28, arg1 & 0xFFFF);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1452.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(ZZ)Lfc;", line = 2205)
    public final class152 method699(boolean arg0, boolean arg1) {
        return this.method656(arg0, arg1, field1468, field1467);
    }

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "()V", line = 2208)
    public final void method700() {
        int var10002;
        if (this.field1447 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1456; var3++) {
                int var4 = this.field1447[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1436 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1436[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1456) {
                int var7 = this.field1447[var6] & 0xFF;
                this.field1436[var7][var1[var7]++] = var6++;
            }
            this.field1447 = null;
        }
        if (this.field1444 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1438; var10++) {
            int var11 = this.field1444[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1443 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1443[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1438) {
            int var14 = this.field1444[var13] & 0xFF;
            this.field1443[var14][var8[var14]++] = var13++;
        }
        this.field1444 = null;
    }

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "()V", line = 2300)
    public final void method701() {
        if (this.field1464 == null) {
            this.method663();
            return;
        }
        for (int var1 = 0; var1 < this.field1456; var1++) {
            int var2 = this.field1439[var1];
            this.field1439[var1] = this.field1426[var1];
            this.field1426[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1430; var3++) {
            short var4 = this.field1464[var3];
            this.field1464[var3] = this.field1431[var3];
            this.field1431[var3] = (short) (-var4);
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lf;IIIZ)V", line = 2338)
    public final void method702(class231 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class93 var6 = (class93) arg0;
        if (this.field1438 == 0 || var6.field1438 == 0) {
            return;
        }
        int var7 = var6.field1456;
        int[] var8 = var6.field1439;
        int[] var9 = var6.field1429;
        int[] var10 = var6.field1426;
        short[] var11 = var6.field1464;
        short[] var12 = var6.field1460;
        short[] var13 = var6.field1431;
        short[] var14 = var6.field1455;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1433 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1433.field1546;
            var16 = this.field1433.field1548;
            var17 = this.field1433.field1545;
            var18 = this.field1433.field1547;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1433 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1433.field1546;
            var20 = var6.field1433.field1548;
            var21 = var6.field1433.field1545;
            var22 = var6.field1433.field1547;
        }
        int[] var23 = var6.field1441;
        short[] var24 = var6.field1445;
        if (!var6.field1449.field2499) {
            var6.method665();
        }
        short var25 = var6.field1449.field2500;
        short var26 = var6.field1449.field2497;
        short var27 = var6.field1449.field2502;
        short var28 = var6.field1449.field2501;
        short var29 = var6.field1449.field2496;
        short var30 = var6.field1449.field2495;
        for (int var31 = 0; var31 < this.field1456; var31++) {
            int var32 = this.field1429[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1439[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1426[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1441[var31];
                        int var37 = this.field1441[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1445[var38] - 1;
                            if (var35 == -1 || this.field1455[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var15 == null) {
                                            this.field1433 = new class98();
                                            var15 = this.field1433.field1546 = class25.method131(this.field1464, 112);
                                            var16 = this.field1433.field1548 = class25.method131(this.field1460, 109);
                                            var17 = this.field1433.field1545 = class25.method131(this.field1431, 77);
                                            var18 = this.field1433.field1547 = class25.method131(this.field1455, 74);
                                        }
                                        if (var19 == null) {
                                            class98 var44 = var6.field1433 = new class98();
                                            var19 = var44.field1546 = class25.method131(var11, 100);
                                            var20 = var44.field1548 = class25.method131(var12, 125);
                                            var21 = var44.field1545 = class25.method131(var13, 99);
                                            var22 = var44.field1547 = class25.method131(var14, 102);
                                        }
                                        short var45 = this.field1464[var35];
                                        short var46 = this.field1460[var35];
                                        short var47 = this.field1431[var35];
                                        short var48 = this.field1455[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var48;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        short var54 = var12[var40];
                                        short var55 = var13[var40];
                                        short var56 = var14[var40];
                                        int var57 = this.field1441[var31];
                                        int var58 = this.field1441[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1445[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var18[var60] != 0) {
                                                var15[var60] += var53;
                                                var16[var60] += var54;
                                                var17[var60] += var55;
                                                var18[var60] += var56;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)Z", line = 2576)
    private final boolean method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else {
            return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILqg;[[I[[IIII)V", line = 2591)
    public final void method704(int arg0, int arg1, class93 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1449.field2499) {
            arg2.method665();
        }
        int var9 = arg2.field1449.field2502 + arg5;
        int var10 = arg2.field1449.field2501 + arg5;
        int var11 = arg2.field1449.field2496 + arg7;
        int var12 = arg2.field1449.field2495 + arg7;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var9 < 0 || var10 + 128 >> 7 >= arg3.length || var11 < 0 || var12 + 128 >> 7 >= arg3[0].length) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg4 == null) {
                return;
            }
            if (var9 < 0 || var10 + 128 >> 7 >= arg4.length || var11 < 0 || var12 + 128 >> 7 >= arg4[0].length) {
                return;
            }
        } else {
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            int var15 = var11 >> 7;
            int var16 = var12 + 127 >> 7;
            if (arg3[var13][var15] == arg6 && arg3[var14][var15] == arg6 && arg3[var13][var16] == arg6 && arg3[var14][var16] == arg6) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var17 = 0; var17 < this.field1456; var17++) {
                int var18 = this.field1439[var17] + arg5;
                int var19 = this.field1426[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1429[var17] = this.field1429[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1449.field2500;
            for (int var28 = 0; var28 < this.field1456; var28++) {
                int var29 = (this.field1429[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1439[var28] + arg5;
                    int var31 = this.field1426[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1429[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1039(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1449.field2497 - arg2.field1449.field2500;
            for (int var42 = 0; var42 < this.field1456; var42++) {
                int var43 = this.field1439[var42] + arg5;
                int var44 = this.field1426[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1429[var42] = var51 + this.field1429[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1449.field2497 - arg2.field1449.field2500;
            for (int var53 = 0; var53 < this.field1456; var53++) {
                int var54 = this.field1439[var53] + arg5;
                int var55 = this.field1426[var53] + arg7;
                int var56 = var54 & 0x7F;
                int var57 = var55 & 0x7F;
                int var58 = var54 >> 7;
                int var59 = var55 >> 7;
                int var60 = (128 - var56) * arg3[var58][var59] + arg3[var58 + 1][var59] * var56 >> 7;
                int var61 = (128 - var56) * arg3[var58][var59 + 1] + arg3[var58 + 1][var59 + 1] * var56 >> 7;
                int var62 = (128 - var57) * var60 + var57 * var61 >> 7;
                int var63 = (128 - var56) * arg4[var58][var59] + arg4[var58 + 1][var59] * var56 >> 7;
                int var64 = (128 - var56) * arg4[var58][var59 + 1] + arg4[var58 + 1][var59 + 1] * var56 >> 7;
                int var65 = (128 - var57) * var63 + var57 * var64 >> 7;
                int var66 = var62 - var65;
                this.field1429[var53] = ((this.field1429[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1453.field2038 = false;
        this.field1449.field2499 = false;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIIIJ)V", line = 2788)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        if (this.field1430 == 0) {
            return;
        }
        if (!this.field1449.field2499) {
            this.method665();
        }
        short var11 = this.field1449.field2498;
        short var12 = this.field1449.field2500;
        short var13 = this.field1449.field2497;
        int var14 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var15 = arg1 * arg6 + arg2 * var14 >> 16;
        int var16 = (arg1 * var13 + arg2 * var11 >> 16) + var15;
        if (var16 <= 50) {
            return;
        }
        int var17 = (-var11 * arg2 + arg1 * var12 >> 16) + var15;
        if (var17 >= 3584) {
            return;
        }
        int var18 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var19 = var11 + var18 << 9;
        if (var19 / var16 <= class2.field11) {
            return;
        }
        int var20 = var18 - var11 << 9;
        if (var20 / var16 >= class133.field2086) {
            return;
        }
        int var21 = arg2 * arg6 - arg1 * var14 >> 16;
        int var22 = (arg1 * var11 + arg2 * var13 >> 16) + var21 << 9;
        if (var22 / var16 <= class281.field4720) {
            return;
        }
        int var23 = (-var11 * arg1 + arg2 * var12 >> 16) + var21 << 9;
        if (var23 / var16 >= class287.field4838) {
            return;
        }
        int var24 = 0;
        int var25 = 0;
        if (arg0 != 0) {
            var24 = class173.field2812[arg0];
            var25 = class173.field2818[arg0];
        }
        if (arg8 > 0L && class25.field306 && var17 > 0) {
            int var26;
            int var27;
            if (var18 > 0) {
                var26 = var20 / var16;
                var27 = var19 / var17;
            } else {
                var26 = var20 / var17;
                var27 = var19 / var16;
            }
            int var28;
            int var29;
            if (var21 > 0) {
                var28 = var23 / var16;
                var29 = var22 / var17;
            } else {
                var28 = var23 / var17;
                var29 = var22 / var16;
            }
            if (class183.field2938 >= var26 && class183.field2938 <= var27 && class276.field4648 >= var28 && class276.field4648 <= var29) {
                int var30 = 999999;
                int var31 = -999999;
                int var32 = 999999;
                int var33 = -999999;
                short var34 = this.field1449.field2502;
                short var35 = this.field1449.field2501;
                short var36 = this.field1449.field2496;
                short var37 = this.field1449.field2495;
                int[] var38 = new int[] { var34, var35, var34, var35, var34, var35, var34, var35 };
                int[] var39 = new int[] { var36, var36, var37, var37, var36, var36, var37, var37 };
                int[] var40 = new int[] { var12, var12, var12, var12, var13, var13, var13, var13 };
                for (int var41 = 0; var41 < 8; var41++) {
                    int var42 = var38[var41];
                    int var43 = var40[var41];
                    int var44 = var39[var41];
                    if (arg0 != 0) {
                        int var45 = var24 * var44 + var25 * var42 >> 16;
                        var44 = var25 * var44 - var24 * var42 >> 16;
                        var42 = var45;
                    }
                    int var46 = arg5 + var42;
                    int var47 = arg6 + var43;
                    int var48 = arg7 + var44;
                    int var49 = arg3 * var48 + arg4 * var46 >> 16;
                    int var50 = arg4 * var48 - arg3 * var46 >> 16;
                    int var52 = arg2 * var47 - arg1 * var50 >> 16;
                    int var53 = arg1 * var47 + arg2 * var50 >> 16;
                    if (var53 > 0) {
                        int var55 = (var49 << 9) / var53;
                        int var56 = (var52 << 9) / var53;
                        if (var55 < var30) {
                            var30 = var55;
                        }
                        if (var55 > var31) {
                            var31 = var55;
                        }
                        if (var56 < var32) {
                            var32 = var56;
                        }
                        if (var56 > var33) {
                            var33 = var56;
                        }
                    }
                }
                if (class183.field2938 >= var30 && class183.field2938 <= var31 && class276.field4648 >= var32 && class276.field4648 <= var33) {
                    if (this.field2354) {
                        class231.field3718[class122.field1890++] = arg8;
                    } else {
                        if (field1477.length < this.field1430) {
                            field1477 = new int[this.field1430];
                            field1481 = new int[this.field1430];
                        }
                        int var57 = 0;
                        label118: while (true) {
                            if (var57 >= this.field1456) {
                                int var77 = 0;
                                while (true) {
                                    if (var77 >= this.field1438) {
                                        break label118;
                                    }
                                    short var78 = this.field1446[var77];
                                    short var79 = this.field1459[var77];
                                    short var80 = this.field1454[var77];
                                    if (this.method703(class183.field2938, class276.field4648, field1481[var78], field1481[var79], field1481[var80], field1477[var78], field1477[var79], field1477[var80])) {
                                        class231.field3718[class122.field1890++] = arg8;
                                        break label118;
                                    }
                                    var77++;
                                }
                            }
                            int var58 = this.field1439[var57];
                            int var59 = this.field1429[var57];
                            int var60 = this.field1426[var57];
                            if (arg0 != 0) {
                                int var61 = var24 * var60 + var25 * var58 >> 16;
                                var60 = var25 * var60 - var24 * var58 >> 16;
                                var58 = var61;
                            }
                            int var62 = arg5 + var58;
                            int var63 = arg6 + var59;
                            int var64 = arg7 + var60;
                            int var65 = arg3 * var64 + arg4 * var62 >> 16;
                            int var66 = arg4 * var64 - arg3 * var62 >> 16;
                            int var68 = arg2 * var63 - arg1 * var66 >> 16;
                            int var69 = arg1 * var63 + arg2 * var66 >> 16;
                            if (var69 < 50) {
                                break;
                            }
                            int var71 = (var65 << 9) / var69;
                            int var72 = (var68 << 9) / var69;
                            int var73 = this.field1441[var57];
                            int var74 = this.field1441[var57 + 1];
                            for (int var75 = var73; var75 < var74; var75++) {
                                int var76 = this.field1445[var75] - 1;
                                if (var76 == -1) {
                                    break;
                                }
                                field1477[var76] = var71;
                                field1481[var76] = var72;
                            }
                            var57++;
                        }
                    }
                }
            }
        }
        GL var81 = class90.field1390;
        var81.glPushMatrix();
        var81.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var81.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method709();
        var81.glPopMatrix();
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[IIIIZ)V", line = 3062)
    private final void method705(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1480 = 0;
            field1476 = 0;
            field1475 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1436.length) {
                    int[] var14 = this.field1436[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1480 += this.field1439[var16];
                        field1476 += this.field1429[var16];
                        field1475 += this.field1426[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1480 = field1480 / var11 + var8;
                field1476 = field1476 / var11 + var9;
                field1475 = field1475 / var11 + var10;
            } else {
                field1480 = var8;
                field1476 = var9;
                field1475 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1436.length) {
                    int[] var22 = this.field1436[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1439[var24] += var17;
                        this.field1429[var24] += var18;
                        this.field1426[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1436.length) {
                    int[] var27 = this.field1436[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1439[var29] -= field1480;
                        this.field1429[var29] -= field1476;
                        this.field1426[var29] -= field1475;
                        if (arg4 != 0) {
                            int var30 = class173.field2812[arg4];
                            int var31 = class173.field2818[arg4];
                            int var32 = this.field1439[var29] * var31 + this.field1429[var29] * var30 + 32767 >> 16;
                            this.field1429[var29] = this.field1429[var29] * var31 + 32767 - this.field1439[var29] * var30 >> 16;
                            this.field1439[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class173.field2812[arg2];
                            int var34 = class173.field2818[arg2];
                            int var35 = this.field1429[var29] * var34 + 32767 - this.field1426[var29] * var33 >> 16;
                            this.field1426[var29] = this.field1429[var29] * var33 + this.field1426[var29] * var34 + 32767 >> 16;
                            this.field1429[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class173.field2812[arg3];
                            int var37 = class173.field2818[arg3];
                            int var38 = this.field1439[var29] * var37 + this.field1426[var29] * var36 + 32767 >> 16;
                            this.field1426[var29] = this.field1426[var29] * var37 + 32767 - this.field1439[var29] * var36 >> 16;
                            this.field1439[var29] = var38;
                        }
                        this.field1439[var29] += field1480;
                        this.field1429[var29] += field1476;
                        this.field1426[var29] += field1475;
                    }
                }
            }
            if (arg5 && this.field1464 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1436.length) {
                        int[] var41 = this.field1436[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1441[var43];
                            int var45 = this.field1441[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1445[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class173.field2812[arg4];
                                    int var49 = class173.field2818[arg4];
                                    int var50 = this.field1464[var47] * var49 + this.field1460[var47] * var48 + 32767 >> 16;
                                    this.field1460[var47] = (short) (this.field1460[var47] * var49 + 32767 - this.field1464[var47] * var48 >> 16);
                                    this.field1464[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class173.field2812[arg2];
                                    int var52 = class173.field2818[arg2];
                                    int var53 = this.field1460[var47] * var52 + 32767 - this.field1431[var47] * var51 >> 16;
                                    this.field1431[var47] = (short) (this.field1460[var47] * var51 + this.field1431[var47] * var52 + 32767 >> 16);
                                    this.field1460[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class173.field2812[arg3];
                                    int var55 = class173.field2818[arg3];
                                    int var56 = this.field1464[var47] * var55 + this.field1431[var47] * var54 + 32767 >> 16;
                                    this.field1431[var47] = (short) (this.field1431[var47] * var55 + 32767 - this.field1464[var47] * var54 >> 16);
                                    this.field1464[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1435 != null) {
                    this.field1435.field2038 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1436.length) {
                    int[] var59 = this.field1436[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1439[var61] -= field1480;
                        this.field1429[var61] -= field1476;
                        this.field1426[var61] -= field1475;
                        this.field1439[var61] = this.field1439[var61] * arg2 >> 7;
                        this.field1429[var61] = this.field1429[var61] * arg3 >> 7;
                        this.field1426[var61] = this.field1426[var61] * arg4 >> 7;
                        this.field1439[var61] += field1480;
                        this.field1429[var61] += field1476;
                        this.field1426[var61] += field1475;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1443 != null && this.field1442 != null) {
            for (int var62 = 0; var62 < var7; var62++) {
                int var63 = arg1[var62];
                if (var63 < this.field1443.length) {
                    int[] var64 = this.field1443[var63];
                    for (int var65 = 0; var65 < var64.length; var65++) {
                        int var66 = var64[var65];
                        int var67 = (this.field1442[var66] & 0xFF) + arg2 * 8;
                        if (var67 < 0) {
                            var67 = 0;
                        } else if (var67 > 255) {
                            var67 = 255;
                        }
                        this.field1442[var66] = (byte) var67;
                    }
                    if (var64.length > 0) {
                        this.field1452.field2038 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ISIB)I", line = 3406)
    private static final int method706(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class173.field2822[class246.method1692(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class173.field2815.method507(arg1 & 0xFFFF, false);
            if (var5 != 0) {
                int var6;
                if (arg2 < 0) {
                    var6 = 0;
                } else if (arg2 > 127) {
                    var6 = 16777215;
                } else {
                    var6 = arg2 * 131586;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class173.field2815.method508(32, arg1 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + (var10 & 0xFF00 << 8) + (var11 & 0xFF00);
            }
        }
        return (var4 << 8) + (255 - (arg3 & 0xFF));
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIII)V", line = 3465)
    public final void method707(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (this.field1430 == 0) {
            return;
        }
        GL var8 = class90.field1390;
        var8.glPushMatrix();
        if (arg3 != 0) {
            var8.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var8.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var8.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var8.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var8.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method709();
        var8.glPopMatrix();
    }

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "()I", line = 3493)
    public final int method708() {
        if (!this.field1449.field2499) {
            this.method665();
        }
        return this.field1449.field2495;
    }

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "()V", line = 3503)
    private final void method709() {
        GL var1 = class90.field1390;
        if (this.field1438 == 0) {
            return;
        }
        if (this.field1427 != 0) {
            this.method689(true, !this.field1453.field2038 && (this.field1427 & 0x1) != 0, !this.field1452.field2038 && (this.field1427 & 0x2) != 0, this.field1435 != null && !this.field1435.field2038 && (this.field1427 & 0x4) != 0, false);
        }
        this.method689(false, !this.field1453.field2038, !this.field1452.field2038, this.field1435 != null && !this.field1435.field2038, !this.field1434.field2038);
        if (!this.field1458.field2038) {
            this.method660();
        }
        if (this.field1440 != 0) {
            if ((this.field1440 & 0x1) != 0) {
                this.field1439 = null;
                this.field1429 = null;
                this.field1426 = null;
                this.field1445 = null;
                this.field1441 = null;
            }
            if ((this.field1440 & 0x2) != 0) {
                this.field1450 = null;
                this.field1442 = null;
            }
            if ((this.field1440 & 0x4) != 0) {
                this.field1464 = null;
                this.field1460 = null;
                this.field1431 = null;
                this.field1455 = null;
            }
            if ((this.field1440 & 0x8) != 0) {
                this.field1448 = null;
                this.field1437 = null;
            }
            if ((this.field1440 & 0x10) != 0) {
                this.field1446 = null;
                this.field1459 = null;
                this.field1454 = null;
            }
            this.field1440 = 0;
        }
        class47 var2 = null;
        if (this.field1453.field2039 != null) {
            this.field1453.field2039.method255();
            var2 = this.field1453.field2039;
            var1.glVertexPointer(3, 5126, this.field1453.field2033, (long) this.field1453.field2040);
        }
        if (this.field1452.field2039 != null) {
            if (this.field1452.field2039 != var2) {
                this.field1452.field2039.method255();
                var2 = this.field1452.field2039;
            }
            var1.glColorPointer(4, 5121, this.field1452.field2033, (long) this.field1452.field2040);
        }
        if (class44.field539 && this.field1435.field2039 != null) {
            if (this.field1435.field2039 != var2) {
                this.field1435.field2039.method255();
                var2 = this.field1435.field2039;
            }
            var1.glNormalPointer(5126, this.field1435.field2033, (long) this.field1435.field2040);
        }
        if (this.field1434.field2039 != null) {
            if (this.field1434.field2039 != var2) {
                this.field1434.field2039.method255();
                class47 var3 = this.field1434.field2039;
            }
            var1.glTexCoordPointer(2, 5126, this.field1434.field2033, (long) this.field1434.field2040);
        }
        if (this.field1458.field2039 != null) {
            this.field1458.field2039.method253();
        }
        if (this.field1453.field2039 == null || this.field1452.field2039 == null || class44.field539 && this.field1435.field2039 == null || this.field1434.field2039 == null) {
            if (class90.field1383) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1453.field2039 == null) {
                this.field1453.field2035.position(this.field1453.field2040);
                var1.glVertexPointer(3, 5126, this.field1453.field2033, this.field1453.field2035);
            }
            if (this.field1452.field2039 == null) {
                this.field1452.field2035.position(this.field1452.field2040);
                var1.glColorPointer(4, 5121, this.field1452.field2033, this.field1452.field2035);
            }
            if (class44.field539 && this.field1435.field2039 == null) {
                this.field1435.field2035.position(this.field1435.field2040);
                var1.glNormalPointer(5126, this.field1435.field2033, this.field1435.field2035);
            }
            if (this.field1434.field2039 == null) {
                this.field1434.field2035.position(this.field1434.field2040);
                var1.glTexCoordPointer(2, 5126, this.field1434.field2033, this.field1434.field2035);
            }
        }
        if (this.field1458.field2039 == null && class90.field1383) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1461.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1461[var5];
            int var7 = this.field1461[var5 + 1];
            short var8 = this.field1463[var6];
            if (var8 == -1) {
                class90.method617(-1);
                class284.method1960(0, 0, 15);
            } else {
                class173.field2815.method510((byte) -111, var8 & 0xFFFF);
            }
            if (this.field1458.field2039 == null) {
                this.field1458.field2035.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1458.field2035);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(III)V", line = 3677)
    public final void method710(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1456; var4++) {
            this.field1439[var4] += arg0;
            this.field1429[var4] += arg1;
            this.field1426[var4] += arg2;
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
    }

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "()V", line = 3691)
    public final void method711() {
        if (this.field1464 == null) {
            this.method691();
            return;
        }
        for (int var1 = 0; var1 < this.field1456; var1++) {
            int var2 = this.field1426[var1];
            this.field1426[var1] = this.field1439[var1];
            this.field1439[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1430; var3++) {
            short var4 = this.field1431[var3];
            this.field1431[var3] = this.field1464[var3];
            this.field1464[var3] = (short) (-var4);
        }
        this.field1449.field2499 = false;
        this.field1453.field2038 = false;
        if (this.field1435 != null) {
            this.field1435.field2038 = false;
        }
    }
}
