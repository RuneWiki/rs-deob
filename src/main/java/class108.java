import java.nio.ByteBuffer;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class108 extends class201 {

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "B")
    private byte field1444 = 0;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "B")
    private byte field1448 = 0;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "I")
    private int field1453 = 0;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "I")
    private int field1454 = 0;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Z")
    public boolean field1429 = false;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public int field1442 = 0;

    @OriginalMember(owner = "client!pe", name = "ab", descriptor = "I")
    private int field1466 = 0;

    @OriginalMember(owner = "client!pe", name = "Z", descriptor = "[I")
    private int[] field1465;

    @OriginalMember(owner = "client!pe", name = "V", descriptor = "[I")
    public int[] field1461;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "[I")
    public int[] field1427;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "[I")
    public int[] field1450;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "[I")
    private int[] field1445;

    @OriginalMember(owner = "client!pe", name = "cb", descriptor = "[S")
    private short[] field1468;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "[S")
    private short[] field1433;

    @OriginalMember(owner = "client!pe", name = "S", descriptor = "[S")
    private short[] field1458;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[S")
    private short[] field1428;

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "[S")
    private short[] field1455;

    @OriginalMember(owner = "client!pe", name = "R", descriptor = "[F")
    private float[] field1457;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "[F")
    private float[] field1432;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "[S")
    private short[] field1431;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[B")
    private byte[] field1425;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[S")
    private short[] field1437;

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "[S")
    private short[] field1451;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "[S")
    private short[] field1449;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "[S")
    private short[] field1439;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "[B")
    private byte[] field1452;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "[S")
    private short[] field1447;

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Lva;")
    public class155 field1430;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Ltl;")
    public class221 field1426;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Ltl;")
    private class221 field1441;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "Ltl;")
    private class221 field1440;

    @OriginalMember(owner = "client!pe", name = "W", descriptor = "Ltl;")
    private class221 field1462;

    @OriginalMember(owner = "client!pe", name = "bb", descriptor = "Ltl;")
    private class221 field1467;

    @OriginalMember(owner = "client!pe", name = "U", descriptor = "S")
    private short field1460;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "S")
    private short field1435;

    @OriginalMember(owner = "client!pe", name = "T", descriptor = "[S")
    private short[] field1459;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
    private int[] field1443;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lp;")
    private static class107 field1436 = new class107(10000);

    @OriginalMember(owner = "client!pe", name = "Y", descriptor = "Lpe;")
    private static class108 field1464 = new class108();

    @OriginalMember(owner = "client!pe", name = "eb", descriptor = "Lpe;")
    private static class108 field1470 = new class108();

    @OriginalMember(owner = "client!pe", name = "fb", descriptor = "Lpe;")
    private static class108 field1471 = new class108();

    @OriginalMember(owner = "client!pe", name = "gb", descriptor = "Lpe;")
    private static class108 field1472 = new class108();

    @OriginalMember(owner = "client!pe", name = "hb", descriptor = "Lpe;")
    private static class108 field1473 = new class108();

    @OriginalMember(owner = "client!pe", name = "ib", descriptor = "Lpe;")
    private static class108 field1474 = new class108();

    @OriginalMember(owner = "client!pe", name = "lb", descriptor = "[I")
    private static int[] field1477 = new int[1];

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "Z")
    private static boolean field1484 = false;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "[I")
    private static int[] field1482 = new int[1];

    @OriginalMember(owner = "client!pe", name = "kb", descriptor = "F")
    private static float field1476;

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "F")
    private static float field1478;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "F")
    private static float field1479;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "F")
    private static float field1481;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "F")
    private static float field1485;

    @OriginalMember(owner = "client!pe", name = "ub", descriptor = "F")
    private static float field1486;

    @OriginalMember(owner = "client!pe", name = "jb", descriptor = "I")
    private static int field1475;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    private static int field1480;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    private static int field1483;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Lnm;")
    private class197 field1434;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "Lhl;")
    private class71 field1446;

    @OriginalMember(owner = "client!pe", name = "db", descriptor = "Ljava/nio/ByteBuffer;")
    private static ByteBuffer field1469;

    @OriginalMember(owner = "client!pe", name = "X", descriptor = "[J")
    private static long[] field1463;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "[[I")
    private int[][] field1438;

    @OriginalMember(owner = "client!pe", name = "Q", descriptor = "[[I")
    private int[][] field1456;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "()V", line = 8)
    public final void method685() {
        for (int var1 = 0; var1 < this.field1442; var1++) {
            this.field1461[var1] = this.field1461[var1] + 7 >> 4;
            this.field1427[var1] = this.field1427[var1] + 7 >> 4;
            this.field1450[var1] = this.field1450[var1] + 7 >> 4;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "()V", line = 21)
    public final void method686() {
        if (this.field1433 == null) {
            this.method738();
            return;
        }
        for (int var1 = 0; var1 < this.field1442; var1++) {
            int var2 = this.field1461[var1];
            this.field1461[var1] = this.field1450[var1];
            this.field1450[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1453; var3++) {
            short var4 = this.field1433[var3];
            this.field1433[var3] = this.field1428[var3];
            this.field1428[var3] = (short) (-var4);
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIJ)V", line = 58)
    public final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, long arg7) {
        if (this.field1453 == 0) {
            return;
        }
        GL var10 = class250.field3818;
        var10.glPushMatrix();
        if (arg3 != 0) {
            var10.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        var10.glTranslatef((float) arg4, (float) arg5, (float) arg6);
        if (arg1 != 0) {
            var10.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        }
        if (arg0 != 0) {
            var10.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            var10.glRotatef((float) (-arg2) * 0.17578125F, 0.0F, 0.0F, 1.0F);
        }
        this.method714();
        var10.glPopMatrix();
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(III)V", line = 83)
    public final void method688(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1442; var4++) {
            this.field1461[var4] += arg0;
            this.field1427[var4] += arg1;
            this.field1450[var4] += arg2;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()V", line = 101)
    public final void method689() {
        for (int var1 = 0; var1 < this.field1442; var1++) {
            int var2 = this.field1450[var1];
            this.field1450[var1] = this.field1461[var1];
            this.field1461[var1] = -var2;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIFFF)[F", line = 116)
    private static final float[] method690(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
        float[] var7 = new float[9];
        float var8 = 1.0F;
        float var9 = 0.0F;
        float var10 = (float) arg1 / 32767.0F;
        float var11 = -((float) Math.sqrt((double) (1.0F - var10 * var10)));
        float var12 = 1.0F - var10;
        float var13 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
        if (var13 != 0.0F) {
            var8 = (float) (-arg2) / var13;
            var9 = (float) arg0 / var13;
        }
        var7[0] = var8 * var8 * var12 + var10;
        var7[1] = var9 * var11;
        var7[2] = var8 * var9 * var12;
        var7[3] = -var9 * var11;
        var7[4] = var10;
        var7[5] = var8 * var11;
        var7[6] = var8 * var9 * var12;
        var7[7] = -var8 * var11;
        var7[8] = var9 * var9 * var12 + var10;
        float[] var14 = new float[9];
        float var15 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
        float var16 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
        float var17 = 1.0F - var15;
        var14[0] = var15;
        var14[1] = 0.0F;
        var14[2] = var16;
        var14[3] = 0.0F;
        var14[4] = 1.0F;
        var14[5] = 0.0F;
        var14[6] = -var16;
        var14[7] = 0.0F;
        var14[8] = var15;
        float[] var18 = new float[] { var7[6] * var14[2] + var7[0] * var14[0] + var7[3] * var14[1], var7[7] * var14[2] + var7[1] * var14[0] + var7[4] * var14[1], var7[8] * var14[2] + var7[2] * var14[0] + var7[5] * var14[1], var7[6] * var14[5] + var7[0] * var14[3] + var7[3] * var14[4], var7[7] * var14[5] + var7[1] * var14[3] + var7[4] * var14[4], var7[8] * var14[5] + var7[2] * var14[3] + var7[5] * var14[4], var7[6] * var14[8] + var7[0] * var14[6] + var7[3] * var14[7], var7[7] * var14[8] + var7[1] * var14[6] + var7[4] * var14[7], var7[8] * var14[8] + var7[2] * var14[6] + var7[5] * var14[7] };
        var18[0] *= arg4;
        var18[1] *= arg4;
        var18[2] *= arg4;
        var18[3] *= arg5;
        var18[4] *= arg5;
        var18[5] *= arg5;
        var18[6] *= arg6;
        var18[7] *= arg6;
        var18[8] *= arg6;
        return var18;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)Len;", line = 181)
    public final class47 method279(int arg0, int arg1, int arg2) {
        this.field1429 = false;
        if (this.field1434 != null) {
            this.field1433 = this.field1434.field2821;
            this.field1458 = this.field1434.field2819;
            this.field1428 = this.field1434.field2818;
            this.field1455 = this.field1434.field2820;
            this.field1434 = null;
        }
        return this;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[FIF)V", line = 198)
    private static final void method691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8) {
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
        field1481 = var16;
        field1478 = var17;
    }

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "()V", line = 242)
    public final void method692() {
        int var10002;
        if (this.field1445 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field1442; var3++) {
                int var4 = this.field1445[var3] & 0xFF;
                var10002 = var1[var4]++;
                if (var4 > var2) {
                    var2 = var4;
                }
            }
            this.field1456 = new int[var2 + 1][];
            for (int var5 = 0; var5 <= var2; var5++) {
                this.field1456[var5] = new int[var1[var5]];
                var1[var5] = 0;
            }
            int var6 = 0;
            while (var6 < this.field1442) {
                int var7 = this.field1445[var6] & 0xFF;
                this.field1456[var7][var1[var7]++] = var6++;
            }
            this.field1445 = null;
        }
        if (this.field1452 == null) {
            return;
        }
        int[] var8 = new int[256];
        int var9 = 0;
        for (int var10 = 0; var10 < this.field1454; var10++) {
            int var11 = this.field1452[var10] & 0xFF;
            var10002 = var8[var11]++;
            if (var11 > var9) {
                var9 = var11;
            }
        }
        this.field1438 = new int[var9 + 1][];
        for (int var12 = 0; var12 <= var9; var12++) {
            this.field1438[var12] = new int[var8[var12]];
            var8[var12] = 0;
        }
        int var13 = 0;
        while (var13 < this.field1454) {
            int var14 = this.field1452[var13] & 0xFF;
            this.field1438[var14][var8[var14]++] = var13++;
        }
        this.field1452 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "()Z", line = 334)
    public final boolean method274() {
        return this.field1429 && this.field1461 != null && this.field1433 != null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(SS)V", line = 339)
    public final void method693(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1454; var3++) {
            if (this.field1439[var3] == arg0) {
                this.field1439[var3] = arg1;
            }
        }
        int var4 = 0;
        int var5 = 0;
        if (arg0 != -1) {
            var4 = class215.field3020.method379((byte) -113, arg0 & 0xFFFF);
            var5 = class215.field3020.method369(arg0 & 0xFFFF, 0);
        }
        int var6 = 0;
        int var7 = 0;
        if (arg1 != -1) {
            var6 = class215.field3020.method379((byte) -113, arg1 & 0xFFFF);
            var7 = class215.field3020.method369(arg1 & 0xFFFF, 0);
        }
        if (var4 != var6 || var5 != var7) {
            this.field1441.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 373)
    public final void method694(int arg0) {
        this.field1460 = (short) arg0;
        this.field1441.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(ZZZ)Luc;", line = 378)
    public final class201 method695(boolean arg0, boolean arg1, boolean arg2) {
        return this.method717(arg0, arg1, arg2, field1474, field1473);
    }

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "()I", line = 381)
    public final int method696() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2162;
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()I", line = 387)
    public final int method697() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2159;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 394)
    public final void method698(int arg0) {
        int var2 = class215.field3024[arg0];
        int var3 = class215.field3017[arg0];
        for (int var4 = 0; var4 < this.field1442; var4++) {
            int var5 = this.field1461[var4] * var3 + this.field1450[var4] * var2 >> 16;
            this.field1450[var4] = this.field1450[var4] * var3 - this.field1461[var4] * var2 >> 16;
            this.field1461[var4] = var5;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "()I", line = 414)
    public final int method699() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2158;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 422)
    public final void method700(int arg0) {
        int var2 = class215.field3024[arg0];
        int var3 = class215.field3017[arg0];
        for (int var4 = 0; var4 < this.field1442; var4++) {
            int var5 = this.field1427[var4] * var3 - this.field1450[var4] * var2 >> 16;
            this.field1450[var4] = this.field1450[var4] * var3 + this.field1427[var4] * var2 >> 16;
            this.field1427[var4] = var5;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)I", line = 443)
    private static final int method701(float arg0, float arg1, float arg2) {
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IIIIZI[I)V", line = 479)
    public final void method702(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            field1483 = 0;
            field1480 = 0;
            field1475 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field1456.length) {
                    int[] var16 = this.field1456[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field1468 == null || (arg6 & this.field1468[var18]) != 0) {
                            field1483 += this.field1461[var18];
                            field1480 += this.field1427[var18];
                            field1475 += this.field1450[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                field1483 = field1483 / var13 + var10;
                field1480 = field1480 / var13 + var11;
                field1475 = field1475 / var13 + var12;
                field1484 = true;
            } else {
                field1483 = var10;
                field1480 = var11;
                field1475 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 16384 >> 15;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + arg7[4] * arg3 + 16384 >> 15;
                int var21 = arg7[8] * arg4 + arg7[6] * arg2 + arg7[7] * arg3 + 16384 >> 15;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1456.length) {
                    int[] var27 = this.field1456[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field1468 == null || (arg6 & this.field1468[var29]) != 0) {
                            this.field1461[var29] += var22;
                            this.field1427[var29] += var23;
                            this.field1450[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var91 = arg1[var90];
                    if (var91 < this.field1456.length) {
                        int[] var92 = this.field1456[var91];
                        for (int var93 = 0; var93 < var92.length; var93++) {
                            int var94 = var92[var93];
                            if (this.field1468 == null || (arg6 & this.field1468[var94]) != 0) {
                                this.field1461[var94] -= field1483;
                                this.field1427[var94] -= field1480;
                                this.field1450[var94] -= field1475;
                                if (arg4 != 0) {
                                    int var95 = class215.field3024[arg4];
                                    int var96 = class215.field3017[arg4];
                                    int var97 = this.field1461[var94] * var96 + this.field1427[var94] * var95 + 32767 >> 16;
                                    this.field1427[var94] = this.field1427[var94] * var96 + 32767 - this.field1461[var94] * var95 >> 16;
                                    this.field1461[var94] = var97;
                                }
                                if (arg2 != 0) {
                                    int var98 = class215.field3024[arg2];
                                    int var99 = class215.field3017[arg2];
                                    int var100 = this.field1427[var94] * var99 + 32767 - this.field1450[var94] * var98 >> 16;
                                    this.field1450[var94] = this.field1450[var94] * var99 + this.field1427[var94] * var98 + 32767 >> 16;
                                    this.field1427[var94] = var100;
                                }
                                if (arg3 != 0) {
                                    int var101 = class215.field3024[arg3];
                                    int var102 = class215.field3017[arg3];
                                    int var103 = this.field1461[var94] * var102 + this.field1450[var94] * var101 + 32767 >> 16;
                                    this.field1450[var94] = this.field1450[var94] * var102 + 32767 - this.field1461[var94] * var101 >> 16;
                                    this.field1461[var94] = var103;
                                }
                                this.field1461[var94] += field1483;
                                this.field1427[var94] += field1480;
                                this.field1450[var94] += field1475;
                            }
                        }
                    }
                }
                if (arg5 && this.field1433 != null) {
                    for (int var104 = 0; var104 < var9; var104++) {
                        int var105 = arg1[var104];
                        if (var105 < this.field1456.length) {
                            int[] var106 = this.field1456[var105];
                            for (int var107 = 0; var107 < var106.length; var107++) {
                                int var108 = var106[var107];
                                if (this.field1468 == null || (arg6 & this.field1468[var108]) != 0) {
                                    int var109 = this.field1465[var108];
                                    int var110 = this.field1465[var108 + 1];
                                    for (int var111 = var109; var111 < var110; var111++) {
                                        int var112 = this.field1459[var111] - 1;
                                        if (var112 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var113 = class215.field3024[arg4];
                                            int var114 = class215.field3017[arg4];
                                            int var115 = this.field1458[var112] * var113 + this.field1433[var112] * var114 + 32767 >> 16;
                                            this.field1458[var112] = (short) (this.field1458[var112] * var114 + 32767 - this.field1433[var112] * var113 >> 16);
                                            this.field1433[var112] = (short) var115;
                                        }
                                        if (arg2 != 0) {
                                            int var116 = class215.field3024[arg2];
                                            int var117 = class215.field3017[arg2];
                                            int var118 = this.field1458[var112] * var117 + 32767 - this.field1428[var112] * var116 >> 16;
                                            this.field1428[var112] = (short) (this.field1458[var112] * var116 + this.field1428[var112] * var117 + 32767 >> 16);
                                            this.field1458[var112] = (short) var118;
                                        }
                                        if (arg3 != 0) {
                                            int var119 = class215.field3024[arg3];
                                            int var120 = class215.field3017[arg3];
                                            int var121 = this.field1433[var112] * var120 + this.field1428[var112] * var119 + 32767 >> 16;
                                            this.field1428[var112] = (short) (this.field1428[var112] * var120 + 32767 - this.field1433[var112] * var119 >> 16);
                                            this.field1433[var112] = (short) var121;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field1440 != null) {
                        this.field1440.field3109 = false;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (field1484) {
                    int var36 = arg7[6] * field1475 + arg7[0] * field1483 + arg7[3] * field1480 + 16384 >> 15;
                    int var37 = arg7[7] * field1475 + arg7[1] * field1483 + arg7[4] * field1480 + 16384 >> 15;
                    int var38 = arg7[8] * field1475 + arg7[2] * field1483 + arg7[5] * field1480 + 16384 >> 15;
                    int var39 = var33 + var36;
                    int var40 = var34 + var37;
                    int var41 = var35 + var38;
                    field1483 = var39;
                    field1480 = var40;
                    field1475 = var41;
                    field1484 = false;
                }
                int[] var42 = new int[9];
                int var43 = class215.field3017[arg2] >> 1;
                int var44 = class215.field3024[arg2] >> 1;
                int var45 = class215.field3017[arg3] >> 1;
                int var46 = class215.field3024[arg3] >> 1;
                int var47 = class215.field3017[arg4] >> 1;
                int var48 = class215.field3024[arg4] >> 1;
                int var49 = var44 * var47 + 16384 >> 15;
                int var50 = var44 * var48 + 16384 >> 15;
                var42[0] = var45 * var47 + var46 * var50 + 16384 >> 15;
                var42[1] = -var45 * var48 + var46 * var49 + 16384 >> 15;
                var42[2] = var43 * var46 + 16384 >> 15;
                var42[3] = var43 * var48 + 16384 >> 15;
                var42[4] = var43 * var47 + 16384 >> 15;
                var42[5] = -var44;
                var42[6] = -var46 * var47 + var45 * var50 + 16384 >> 15;
                var42[7] = var45 * var49 + var46 * var48 + 16384 >> 15;
                var42[8] = var43 * var45 + 16384 >> 15;
                int var51 = var42[2] * -field1475 + var42[0] * -field1483 + var42[1] * -field1480 + 16384 >> 15;
                int var52 = var42[5] * -field1475 + var42[3] * -field1483 + var42[4] * -field1480 + 16384 >> 15;
                int var53 = var42[8] * -field1475 + var42[6] * -field1483 + var42[7] * -field1480 + 16384 >> 15;
                int var54 = field1483 + var51;
                int var55 = field1480 + var52;
                int var56 = field1475 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var59 = 0; var59 < 3; var59++) {
                        int var60 = 0;
                        for (int var61 = 0; var61 < 3; var61++) {
                            var60 += var42[var58 * 3 + var61] * arg7[var59 * 3 + var61];
                        }
                        var57[var58 * 3 + var59] = var60 + 16384 >> 15;
                    }
                }
                int var62 = var42[2] * var35 + var42[0] * var33 + var42[1] * var34 + 16384 >> 15;
                int var63 = var42[5] * var35 + var42[3] * var33 + var42[4] * var34 + 16384 >> 15;
                int var64 = var42[8] * var35 + var42[6] * var33 + var42[7] * var34 + 16384 >> 15;
                int var65 = var54 + var62;
                int var66 = var55 + var63;
                int var67 = var56 + var64;
                int[] var68 = new int[9];
                for (int var69 = 0; var69 < 3; var69++) {
                    for (int var70 = 0; var70 < 3; var70++) {
                        int var71 = 0;
                        for (int var72 = 0; var72 < 3; var72++) {
                            var71 += arg7[var69 * 3 + var72] * var57[var72 * 3 + var70];
                        }
                        var68[var69 * 3 + var70] = var71 + 16384 >> 15;
                    }
                }
                int var73 = arg7[2] * var67 + arg7[0] * var65 + arg7[1] * var66 + 16384 >> 15;
                int var74 = arg7[5] * var67 + arg7[3] * var65 + arg7[4] * var66 + 16384 >> 15;
                int var75 = arg7[8] * var67 + arg7[6] * var65 + arg7[7] * var66 + 16384 >> 15;
                int var76 = var30 + var73;
                int var77 = var31 + var74;
                int var78 = var32 + var75;
                for (int var79 = 0; var79 < var9; var79++) {
                    int var80 = arg1[var79];
                    if (var80 < this.field1456.length) {
                        int[] var81 = this.field1456[var80];
                        for (int var82 = 0; var82 < var81.length; var82++) {
                            int var83 = var81[var82];
                            if (this.field1468 == null || (arg6 & this.field1468[var83]) != 0) {
                                int var84 = this.field1450[var83] * var68[2] + this.field1461[var83] * var68[0] + this.field1427[var83] * var68[1] + 16384 >> 15;
                                int var85 = this.field1450[var83] * var68[5] + this.field1461[var83] * var68[3] + this.field1427[var83] * var68[4] + 16384 >> 15;
                                int var86 = this.field1450[var83] * var68[8] + this.field1461[var83] * var68[6] + this.field1427[var83] * var68[7] + 16384 >> 15;
                                int var87 = var76 + var84;
                                int var88 = var77 + var85;
                                int var89 = var78 + var86;
                                this.field1461[var83] = var87;
                                this.field1427[var83] = var88;
                                this.field1450[var83] = var89;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (var173 < this.field1456.length) {
                        int[] var174 = this.field1456[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field1468 == null || (arg6 & this.field1468[var176]) != 0) {
                                this.field1461[var176] -= field1483;
                                this.field1427[var176] -= field1480;
                                this.field1450[var176] -= field1475;
                                this.field1461[var176] = this.field1461[var176] * arg2 >> 7;
                                this.field1427[var176] = this.field1427[var176] * arg3 >> 7;
                                this.field1450[var176] = this.field1450[var176] * arg4 >> 7;
                                this.field1461[var176] += field1483;
                                this.field1427[var176] += field1480;
                                this.field1450[var176] += field1475;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (field1484) {
                    int var128 = arg7[6] * field1475 + arg7[0] * field1483 + arg7[3] * field1480 + 16384 >> 15;
                    int var129 = arg7[7] * field1475 + arg7[1] * field1483 + arg7[4] * field1480 + 16384 >> 15;
                    int var130 = arg7[8] * field1475 + arg7[2] * field1483 + arg7[5] * field1480 + 16384 >> 15;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    field1483 = var131;
                    field1480 = var132;
                    field1475 = var133;
                    field1484 = false;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -field1483 * var134 + 16384 >> 15;
                int var138 = -field1480 * var135 + 16384 >> 15;
                int var139 = -field1475 * var136 + 16384 >> 15;
                int var140 = field1483 + var137;
                int var141 = field1480 + var138;
                int var142 = field1475 + var139;
                int[] var143 = new int[] { arg7[0] * var134 + 16384 >> 15, arg7[3] * var134 + 16384 >> 15, arg7[6] * var134 + 16384 >> 15, arg7[1] * var135 + 16384 >> 15, arg7[4] * var135 + 16384 >> 15, arg7[7] * var135 + 16384 >> 15, arg7[2] * var136 + 16384 >> 15, arg7[5] * var136 + 16384 >> 15, arg7[8] * var136 + 16384 >> 15 };
                int var144 = var125 * var134 + 16384 >> 15;
                int var145 = var126 * var135 + 16384 >> 15;
                int var146 = var127 * var136 + 16384 >> 15;
                int var147 = var140 + var144;
                int var148 = var141 + var145;
                int var149 = var142 + var146;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var152 = 0; var152 < 3; var152++) {
                        int var153 = 0;
                        for (int var154 = 0; var154 < 3; var154++) {
                            var153 += arg7[var151 * 3 + var154] * var143[var154 * 3 + var152];
                        }
                        var150[var151 * 3 + var152] = var153 + 16384 >> 15;
                    }
                }
                int var155 = arg7[2] * var149 + arg7[0] * var147 + arg7[1] * var148 + 16384 >> 15;
                int var156 = arg7[5] * var149 + arg7[3] * var147 + arg7[4] * var148 + 16384 >> 15;
                int var157 = arg7[8] * var149 + arg7[6] * var147 + arg7[7] * var148 + 16384 >> 15;
                int var158 = var122 + var155;
                int var159 = var123 + var156;
                int var160 = var124 + var157;
                for (int var161 = 0; var161 < var9; var161++) {
                    int var162 = arg1[var161];
                    if (var162 < this.field1456.length) {
                        int[] var163 = this.field1456[var162];
                        for (int var164 = 0; var164 < var163.length; var164++) {
                            int var165 = var163[var164];
                            if (this.field1468 == null || (arg6 & this.field1468[var165]) != 0) {
                                int var166 = this.field1450[var165] * var150[2] + this.field1461[var165] * var150[0] + this.field1427[var165] * var150[1] + 16384 >> 15;
                                int var167 = this.field1450[var165] * var150[5] + this.field1461[var165] * var150[3] + this.field1427[var165] * var150[4] + 16384 >> 15;
                                int var168 = this.field1450[var165] * var150[8] + this.field1461[var165] * var150[6] + this.field1427[var165] * var150[7] + 16384 >> 15;
                                int var169 = var158 + var166;
                                int var170 = var159 + var167;
                                int var171 = var160 + var168;
                                this.field1461[var165] = var169;
                                this.field1427[var165] = var170;
                                this.field1450[var165] = var171;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1438 != null && this.field1425 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var178 = arg1[var177];
                    if (var178 < this.field1438.length) {
                        int[] var179 = this.field1438[var178];
                        for (int var180 = 0; var180 < var179.length; var180++) {
                            int var181 = var179[var180];
                            if (this.field1447 == null || (arg6 & this.field1447[var181]) != 0) {
                                int var182 = (this.field1425[var181] & 0xFF) + arg2 * 8;
                                if (var182 < 0) {
                                    var182 = 0;
                                } else if (var182 > 255) {
                                    var182 = 255;
                                }
                                this.field1425[var181] = (byte) var182;
                            }
                        }
                        if (var179.length > 0) {
                            this.field1441.field3109 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1438 != null) {
            for (int var183 = 0; var183 < var9; var183++) {
                int var184 = arg1[var183];
                if (var184 < this.field1438.length) {
                    int[] var185 = this.field1438[var184];
                    for (int var186 = 0; var186 < var185.length; var186++) {
                        int var187 = var185[var186];
                        if (this.field1447 == null || (arg6 & this.field1447[var187]) != 0) {
                            int var188 = this.field1431[var187] & 0xFFFF;
                            int var189 = var188 >> 10 & 0x3F;
                            int var190 = var188 >> 7 & 0x7;
                            int var191 = var188 & 0x7F;
                            int var192 = arg2 + var189 & 0x3F;
                            int var193 = arg3 / 4 + var190;
                            if (var193 < 0) {
                                var193 = 0;
                            } else if (var193 > 7) {
                                var193 = 7;
                            }
                            int var194 = arg4 + var191;
                            if (var194 < 0) {
                                var194 = 0;
                            } else if (var194 > 127) {
                                var194 = 127;
                            }
                            this.field1431[var187] = (short) (var192 << 10 | var193 << 7 | var194);
                        }
                    }
                    if (var185.length > 0) {
                        this.field1441.field3109 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "()V", line = 1269)
    public final void method703() {
        if (this.field1433 == null) {
            this.method704();
            return;
        }
        for (int var1 = 0; var1 < this.field1442; var1++) {
            this.field1461[var1] = -this.field1461[var1];
            this.field1450[var1] = -this.field1450[var1];
        }
        for (int var2 = 0; var2 < this.field1453; var2++) {
            this.field1433[var2] = (short) (-this.field1433[var2]);
            this.field1428[var2] = (short) (-this.field1428[var2]);
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "()V", line = 1305)
    public final void method704() {
        for (int var1 = 0; var1 < this.field1442; var1++) {
            this.field1461[var1] = -this.field1461[var1];
            this.field1450[var1] = -this.field1450[var1];
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(SS)V", line = 1320)
    public final void method705(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field1454; var3++) {
            if (this.field1431[var3] == arg0) {
                this.field1431[var3] = arg1;
            }
        }
        this.field1441.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "()I", line = 1332)
    public final int method11() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2155;
    }

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "()V", line = 1343)
    public final void method706() {
        for (int var1 = 0; var1 < this.field1442; var1++) {
            this.field1450[var1] = -this.field1450[var1];
        }
        if (this.field1428 != null) {
            for (int var2 = 0; var2 < this.field1453; var2++) {
                this.field1428[var2] = (short) (-this.field1428[var2]);
            }
        }
        for (int var3 = 0; var3 < this.field1454; var3++) {
            short var4 = this.field1437[var3];
            this.field1437[var3] = this.field1449[var3];
            this.field1449[var3] = var4;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
        this.field1467.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZZZ)Luc;", line = 1381)
    public final class201 method707(boolean arg0, boolean arg1, boolean arg2) {
        return this.method717(arg0, arg1, arg2, field1472, field1471);
    }

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "()V", line = 1385)
    public final void method708() {
        if (this.field1433 == null) {
            this.method689();
            return;
        }
        for (int var1 = 0; var1 < this.field1442; var1++) {
            int var2 = this.field1450[var1];
            this.field1450[var1] = this.field1461[var1];
            this.field1461[var1] = -var2;
        }
        for (int var3 = 0; var3 < this.field1453; var3++) {
            short var4 = this.field1428[var3];
            this.field1428[var3] = this.field1433[var3];
            this.field1433[var3] = (short) (-var4);
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)V", line = 1423)
    public final void method709(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 0) {
            int var5 = 0;
            field1483 = 0;
            field1480 = 0;
            field1475 = 0;
            for (int var6 = 0; var6 < this.field1442; var6++) {
                field1483 += this.field1461[var6];
                field1480 += this.field1427[var6];
                field1475 += this.field1450[var6];
                var5++;
            }
            if (var5 > 0) {
                field1483 = field1483 / var5 + arg1;
                field1480 = field1480 / var5 + arg2;
                field1475 = field1475 / var5 + arg3;
            } else {
                field1483 = arg1;
                field1480 = arg2;
                field1475 = arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field1442; var7++) {
                this.field1461[var7] += arg1;
                this.field1427[var7] += arg2;
                this.field1450[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field1442; var8++) {
                this.field1461[var8] -= field1483;
                this.field1427[var8] -= field1480;
                this.field1450[var8] -= field1475;
                if (arg3 != 0) {
                    int var9 = class215.field3024[arg3];
                    int var10 = class215.field3017[arg3];
                    int var11 = this.field1461[var8] * var10 + this.field1427[var8] * var9 + 32767 >> 16;
                    this.field1427[var8] = this.field1427[var8] * var10 + 32767 - this.field1461[var8] * var9 >> 16;
                    this.field1461[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class215.field3024[arg1];
                    int var13 = class215.field3017[arg1];
                    int var14 = this.field1427[var8] * var13 + 32767 - this.field1450[var8] * var12 >> 16;
                    this.field1450[var8] = this.field1450[var8] * var13 + this.field1427[var8] * var12 + 32767 >> 16;
                    this.field1427[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class215.field3024[arg2];
                    int var16 = class215.field3017[arg2];
                    int var17 = this.field1461[var8] * var16 + this.field1450[var8] * var15 + 32767 >> 16;
                    this.field1450[var8] = this.field1450[var8] * var16 + 32767 - this.field1461[var8] * var15 >> 16;
                    this.field1461[var8] = var17;
                }
                this.field1461[var8] += field1483;
                this.field1427[var8] += field1480;
                this.field1450[var8] += field1475;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field1442; var18++) {
                this.field1461[var18] -= field1483;
                this.field1427[var18] -= field1480;
                this.field1450[var18] -= field1475;
                this.field1461[var18] = this.field1461[var18] * arg1 / 128;
                this.field1427[var18] = this.field1427[var18] * arg2 / 128;
                this.field1450[var18] = this.field1450[var18] * arg3 / 128;
                this.field1461[var18] += field1483;
                this.field1427[var18] += field1480;
                this.field1450[var18] += field1475;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field1454; var19++) {
                int var20 = (this.field1425[var19] & 0xFF) + arg1 * 8;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 255) {
                    var20 = 255;
                }
                this.field1425[var19] = (byte) var20;
            }
            this.field1441.field3109 = false;
        } else if (arg0 == 7) {
            for (int var21 = 0; var21 < this.field1454; var21++) {
                int var22 = this.field1431[var21] & 0xFFFF;
                int var23 = var22 >> 10 & 0x3F;
                int var24 = var22 >> 7 & 0x7;
                int var25 = var22 & 0x7F;
                int var26 = arg1 + var23 & 0x3F;
                int var27 = arg2 / 4 + var24;
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 7) {
                    var27 = 7;
                }
                int var28 = arg3 + var25;
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 127) {
                    var28 = 127;
                }
                this.field1431[var21] = (short) (var26 << 10 | var27 << 7 | var28);
            }
            this.field1441.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ISIB)I", line = 1619)
    private static final int method710(int arg0, short arg1, int arg2, byte arg3) {
        int var4 = class215.field3023[class333.method2301(arg0, arg2)];
        if (arg1 != -1) {
            int var5 = class215.field3020.method379((byte) -113, arg1 & 0xFFFF);
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
            int var9 = class215.field3020.method369(arg1 & 0xFFFF, 0);
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Len;IIIZ)V", line = 1678)
    public final void method277(class47 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class108 var6 = (class108) arg0;
        if (this.field1454 == 0 || var6.field1454 == 0) {
            return;
        }
        int var7 = var6.field1466;
        int[] var8 = var6.field1461;
        int[] var9 = var6.field1427;
        int[] var10 = var6.field1450;
        short[] var11 = var6.field1433;
        short[] var12 = var6.field1458;
        short[] var13 = var6.field1428;
        short[] var14 = var6.field1455;
        short[] var15;
        short[] var16;
        short[] var17;
        short[] var18;
        if (this.field1434 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field1434.field2821;
            var16 = this.field1434.field2819;
            var17 = this.field1434.field2818;
            var18 = this.field1434.field2820;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field1434 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var19 = var6.field1434.field2821;
            var20 = var6.field1434.field2819;
            var21 = var6.field1434.field2818;
            var22 = var6.field1434.field2820;
        }
        int[] var23 = var6.field1465;
        short[] var24 = var6.field1459;
        if (!var6.field1430.field2160) {
            var6.method727();
        }
        short var25 = var6.field1430.field2155;
        short var26 = var6.field1430.field2158;
        short var27 = var6.field1430.field2161;
        short var28 = var6.field1430.field2157;
        short var29 = var6.field1430.field2156;
        short var30 = var6.field1430.field2162;
        for (int var31 = 0; var31 < this.field1466; var31++) {
            int var32 = this.field1427[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field1461[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field1450[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field1465[var31];
                        int var37 = this.field1465[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field1459[var38] - 1;
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
                                            this.field1434 = new class197();
                                            var15 = this.field1434.field2821 = class252.method1837(-71, this.field1433);
                                            var16 = this.field1434.field2819 = class252.method1837(-94, this.field1458);
                                            var17 = this.field1434.field2818 = class252.method1837(-107, this.field1428);
                                            var18 = this.field1434.field2820 = class252.method1837(-81, this.field1455);
                                        }
                                        if (var19 == null) {
                                            class197 var44 = var6.field1434 = new class197();
                                            var19 = var44.field2821 = class252.method1837(-112, var11);
                                            var20 = var44.field2819 = class252.method1837(-95, var12);
                                            var21 = var44.field2818 = class252.method1837(-67, var13);
                                            var22 = var44.field2820 = class252.method1837(-117, var14);
                                        }
                                        short var45 = this.field1433[var35];
                                        short var46 = this.field1458[var35];
                                        short var47 = this.field1428[var35];
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
                                        int var57 = this.field1465[var31];
                                        int var58 = this.field1465[var31 + 1];
                                        for (int var59 = var57; var59 < var58; var59++) {
                                            int var60 = this.field1459[var59] - 1;
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

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "()V", line = 1915)
    public static void method711() {
        field1463 = null;
        field1436 = null;
        field1469 = null;
        field1464 = null;
        field1470 = null;
        field1471 = null;
        field1472 = null;
        field1473 = null;
        field1474 = null;
        field1477 = null;
        field1482 = null;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 1928)
    public final void method712(int arg0) {
        if (this.field1433 == null) {
            this.method698(arg0);
            return;
        }
        int var2 = class215.field3024[arg0];
        int var3 = class215.field3017[arg0];
        for (int var4 = 0; var4 < this.field1442; var4++) {
            int var5 = this.field1461[var4] * var3 + this.field1450[var4] * var2 >> 16;
            this.field1450[var4] = this.field1450[var4] * var3 - this.field1461[var4] * var2 >> 16;
            this.field1461[var4] = var5;
        }
        for (int var6 = 0; var6 < this.field1453; var6++) {
            int var7 = this.field1433[var6] * var3 + this.field1428[var6] * var2 >> 16;
            this.field1428[var6] = (short) (this.field1428[var6] * var3 - this.field1433[var6] * var2 >> 16);
            this.field1433[var6] = (short) var7;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "()V", line = 1969)
    public static final void method713() {
        field1464 = new class108();
        field1470 = new class108();
        field1471 = new class108();
        field1472 = new class108();
        field1473 = new class108();
        field1474 = new class108();
    }

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "()V", line = 1978)
    private final void method714() {
        GL var1 = class250.field3818;
        if (this.field1454 == 0) {
            return;
        }
        if (this.field1448 != 0) {
            this.method735(true, !this.field1426.field3109 && (this.field1448 & 0x1) != 0, !this.field1441.field3109 && (this.field1448 & 0x2) != 0, this.field1440 != null && !this.field1440.field3109 && (this.field1448 & 0x4) != 0, false);
        }
        this.method735(false, !this.field1426.field3109, !this.field1441.field3109, this.field1440 != null && !this.field1440.field3109, !this.field1462.field3109);
        if (!this.field1467.field3109) {
            this.method724();
        }
        if (this.field1444 != 0) {
            if ((this.field1444 & 0x1) != 0) {
                this.field1461 = null;
                this.field1427 = null;
                this.field1450 = null;
                this.field1459 = null;
                this.field1465 = null;
            }
            if ((this.field1444 & 0x2) != 0) {
                this.field1431 = null;
                this.field1425 = null;
            }
            if ((this.field1444 & 0x4) != 0) {
                this.field1433 = null;
                this.field1458 = null;
                this.field1428 = null;
                this.field1455 = null;
            }
            if ((this.field1444 & 0x8) != 0) {
                this.field1457 = null;
                this.field1432 = null;
            }
            if ((this.field1444 & 0x10) != 0) {
                this.field1437 = null;
                this.field1451 = null;
                this.field1449 = null;
            }
            this.field1444 = 0;
        }
        class71 var2 = null;
        if (this.field1426.field3114 != null) {
            this.field1426.field3114.method436();
            var2 = this.field1426.field3114;
            var1.glVertexPointer(3, 5126, this.field1426.field3112, (long) this.field1426.field3119);
        }
        if (this.field1441.field3114 != null) {
            if (this.field1441.field3114 != var2) {
                this.field1441.field3114.method436();
                var2 = this.field1441.field3114;
            }
            var1.glColorPointer(4, 5121, this.field1441.field3112, (long) this.field1441.field3119);
        }
        if (class162.field2241 && this.field1440.field3114 != null) {
            if (this.field1440.field3114 != var2) {
                this.field1440.field3114.method436();
                var2 = this.field1440.field3114;
            }
            var1.glNormalPointer(5126, this.field1440.field3112, (long) this.field1440.field3119);
        }
        if (this.field1462.field3114 != null) {
            if (this.field1462.field3114 != var2) {
                this.field1462.field3114.method436();
                class71 var3 = this.field1462.field3114;
            }
            var1.glTexCoordPointer(2, 5126, this.field1462.field3112, (long) this.field1462.field3119);
        }
        if (this.field1467.field3114 != null) {
            this.field1467.field3114.method435();
        }
        if (this.field1426.field3114 == null || this.field1441.field3114 == null || class162.field2241 && this.field1440.field3114 == null || this.field1462.field3114 == null) {
            if (class250.field3809) {
                var1.glBindBufferARB(34962, 0);
            }
            if (this.field1426.field3114 == null) {
                this.field1426.field3108.position(this.field1426.field3119);
                var1.glVertexPointer(3, 5126, this.field1426.field3112, this.field1426.field3108);
            }
            if (this.field1441.field3114 == null) {
                this.field1441.field3108.position(this.field1441.field3119);
                var1.glColorPointer(4, 5121, this.field1441.field3112, this.field1441.field3108);
            }
            if (class162.field2241 && this.field1440.field3114 == null) {
                this.field1440.field3108.position(this.field1440.field3119);
                var1.glNormalPointer(5126, this.field1440.field3112, this.field1440.field3108);
            }
            if (this.field1462.field3114 == null) {
                this.field1462.field3108.position(this.field1462.field3119);
                var1.glTexCoordPointer(2, 5126, this.field1462.field3112, this.field1462.field3108);
            }
        }
        if (this.field1467.field3114 == null && class250.field3809) {
            var1.glBindBufferARB(34963, 0);
        }
        int var4 = this.field1443.length - 1;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = this.field1443[var5];
            int var7 = this.field1443[var5 + 1];
            short var8 = this.field1439[var6];
            if (var8 == -1) {
                class250.method1806(-1);
                class262.method1886(0, 3, 0);
            } else {
                class215.field3020.method389(-97, var8 & 0xFFFF);
            }
            if (this.field1467.field3114 == null) {
                this.field1467.field3108.position(var6 * 12);
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, this.field1467.field3108);
            } else {
                var1.glDrawElements(4, (var7 - var6) * 3, 5125, (long) (var6 * 12));
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V", line = 2149)
    public final void method715(int arg0) {
        this.field1435 = (short) arg0;
        if (this.field1440 != null) {
            this.field1440.field3109 = false;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZ)Luc;", line = 2155)
    public final class201 method716(boolean arg0, boolean arg1, boolean arg2) {
        return this.method717(arg0, arg1, arg2, field1470, field1464);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZLpe;Lpe;)Luc;", line = 2158)
    private final class201 method717(boolean arg0, boolean arg1, boolean arg2, class108 arg3, class108 arg4) {
        arg3.field1442 = this.field1442;
        arg3.field1466 = this.field1466;
        arg3.field1453 = this.field1453;
        arg3.field1454 = this.field1454;
        arg3.field1460 = this.field1460;
        arg3.field1435 = this.field1435;
        arg3.field1448 = (byte) ((arg0 && arg1 ? 0 : 2) | 0x1 | (arg2 ? 0 : 4));
        if (arg3.field1461 == null || arg3.field1461.length < this.field1442) {
            arg3.field1461 = new int[this.field1442 + 100];
            arg3.field1427 = new int[this.field1442 + 100];
            arg3.field1450 = new int[this.field1442 + 100];
        }
        for (int var6 = 0; var6 < this.field1442; var6++) {
            arg3.field1461[var6] = this.field1461[var6];
            arg3.field1427[var6] = this.field1427[var6];
            arg3.field1450[var6] = this.field1450[var6];
        }
        if (arg3.field1426 == null) {
            arg3.field1426 = new class221();
        }
        arg3.field1426.field3109 = false;
        if (arg3.field1430 == null) {
            arg3.field1430 = new class155();
        }
        arg3.field1430.field2160 = false;
        if (arg0) {
            arg3.field1425 = this.field1425;
        } else {
            if (arg4.field1425 == null || arg4.field1425.length < this.field1454) {
                arg4.field1425 = new byte[this.field1454 + 100];
            }
            arg3.field1425 = arg4.field1425;
            for (int var7 = 0; var7 < this.field1454; var7++) {
                arg3.field1425[var7] = this.field1425[var7];
            }
        }
        if (arg1) {
            arg3.field1431 = this.field1431;
        } else {
            if (arg4.field1431 == null || arg4.field1431.length < this.field1454) {
                arg4.field1431 = new short[this.field1454 + 100];
            }
            arg3.field1431 = arg4.field1431;
            for (int var8 = 0; var8 < this.field1454; var8++) {
                arg3.field1431[var8] = this.field1431[var8];
            }
        }
        if (arg0 && arg1) {
            arg3.field1441 = this.field1441;
        } else {
            if (arg4.field1441 == null) {
                arg4.field1441 = new class221();
            }
            arg3.field1441 = arg4.field1441;
            arg3.field1441.field3109 = false;
        }
        if (arg2 || this.field1433 == null) {
            arg3.field1433 = this.field1433;
            arg3.field1458 = this.field1458;
            arg3.field1428 = this.field1428;
            arg3.field1455 = this.field1455;
            arg3.field1440 = this.field1440;
        } else {
            if (arg4.field1433 == null || arg4.field1433.length < this.field1453) {
                arg4.field1433 = new short[this.field1453 + 100];
                arg4.field1458 = new short[this.field1453 + 100];
                arg4.field1428 = new short[this.field1453 + 100];
                arg4.field1455 = new short[this.field1453 + 100];
            }
            arg3.field1433 = arg4.field1433;
            arg3.field1458 = arg4.field1458;
            arg3.field1428 = arg4.field1428;
            arg3.field1455 = arg4.field1455;
            for (int var9 = 0; var9 < this.field1453; var9++) {
                arg3.field1433[var9] = this.field1433[var9];
                arg3.field1458[var9] = this.field1458[var9];
                arg3.field1428[var9] = this.field1428[var9];
                arg3.field1455[var9] = this.field1455[var9];
            }
            if (class162.field2241) {
                if (arg4.field1440 == null) {
                    arg4.field1440 = new class221();
                }
                arg3.field1440 = arg4.field1440;
                arg3.field1440.field3109 = false;
            } else {
                arg3.field1440 = null;
            }
        }
        arg3.field1457 = this.field1457;
        arg3.field1432 = this.field1432;
        arg3.field1445 = this.field1445;
        arg3.field1456 = this.field1456;
        arg3.field1437 = this.field1437;
        arg3.field1451 = this.field1451;
        arg3.field1449 = this.field1449;
        arg3.field1439 = this.field1439;
        arg3.field1452 = this.field1452;
        arg3.field1438 = this.field1438;
        arg3.field1462 = this.field1462;
        arg3.field1467 = this.field1467;
        arg3.field1443 = this.field1443;
        arg3.field1459 = this.field1459;
        arg3.field1465 = this.field1465;
        arg3.field2845 = this.field2845;
        arg3.field1468 = this.field1468;
        arg3.field1447 = this.field1447;
        return arg3;
    }

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "()I", line = 2312)
    public final int method718() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2156;
    }

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "()I", line = 2318)
    public final int method719() {
        return this.field1435;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ltb;)Ltb;", line = 2323)
    public final class234 method720(class234 arg0) {
        if (this.field1453 == 0) {
            return null;
        }
        if (!this.field1430.field2160) {
            this.method727();
        }
        int var2;
        int var3;
        if (class64.field829 > 0) {
            var2 = this.field1430.field2161 - (class64.field829 * this.field1430.field2158 >> 8) >> 3;
            var3 = this.field1430.field2157 - (class64.field829 * this.field1430.field2155 >> 8) >> 3;
        } else {
            var2 = this.field1430.field2161 - (class64.field829 * this.field1430.field2155 >> 8) >> 3;
            var3 = this.field1430.field2157 - (class64.field829 * this.field1430.field2158 >> 8) >> 3;
        }
        int var4;
        int var5;
        if (class64.field831 > 0) {
            var4 = this.field1430.field2156 - (class64.field831 * this.field1430.field2158 >> 8) >> 3;
            var5 = this.field1430.field2162 - (class64.field831 * this.field1430.field2155 >> 8) >> 3;
        } else {
            var4 = this.field1430.field2156 - (class64.field831 * this.field1430.field2155 >> 8) >> 3;
            var5 = this.field1430.field2162 - (class64.field831 * this.field1430.field2158 >> 8) >> 3;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class234 var8;
        if (arg0 == null || arg0.field3410.length < var6 * var7) {
            var8 = new class234(var6, var7, 0);
        } else {
            var8 = arg0;
            arg0.field4741 = arg0.field4743 = var6;
            arg0.field4744 = arg0.field4749 = var7;
            arg0.method1654();
        }
        var8.field4748 = var2;
        var8.field4751 = var4;
        if (field1477.length < this.field1453) {
            field1477 = new int[this.field1453];
            field1482 = new int[this.field1453];
        }
        for (int var9 = 0; var9 < this.field1466; var9++) {
            int var10 = (this.field1461[var9] - (this.field1427[var9] * class64.field829 >> 8) >> 3) - var2;
            int var11 = (this.field1450[var9] - (this.field1427[var9] * class64.field831 >> 8) >> 3) - var4;
            int var12 = this.field1465[var9];
            int var13 = this.field1465[var9 + 1];
            for (int var14 = var12; var14 < var13; var14++) {
                int var15 = this.field1459[var14] - 1;
                if (var15 == -1) {
                    break;
                }
                field1477[var15] = var10;
                field1482[var15] = var11;
            }
        }
        for (int var16 = 0; var16 < this.field1454; var16++) {
            if (this.field1425[var16] <= 128) {
                short var17 = this.field1437[var16];
                short var18 = this.field1451[var16];
                short var19 = this.field1449[var16];
                int var20 = field1477[var17];
                int var21 = field1477[var18];
                int var22 = field1477[var19];
                int var23 = field1482[var17];
                int var24 = field1482[var18];
                int var25 = field1482[var19];
                if ((var20 - var21) * (var24 - var25) - (var22 - var21) * (var24 - var23) > 0) {
                    class215.method1475(var8.field3410, var23, var24, var25, var20, var21, var22, var6);
                }
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "()I", line = 2447)
    public final int method721() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2157;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILpe;[[I[[IIII)V", line = 2454)
    public final void method722(int arg0, int arg1, class108 arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, int arg7) {
        if (!arg2.field1430.field2160) {
            arg2.method727();
        }
        int var9 = arg2.field1430.field2161 + arg5;
        int var10 = arg2.field1430.field2157 + arg5;
        int var11 = arg2.field1430.field2156 + arg7;
        int var12 = arg2.field1430.field2162 + arg7;
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
            for (int var17 = 0; var17 < this.field1466; var17++) {
                int var18 = this.field1461[var17] + arg5;
                int var19 = this.field1450[var17] + arg7;
                int var20 = var18 & 0x7F;
                int var21 = var19 & 0x7F;
                int var22 = var18 >> 7;
                int var23 = var19 >> 7;
                int var24 = (128 - var20) * arg3[var22][var23] + arg3[var22 + 1][var23] * var20 >> 7;
                int var25 = (128 - var20) * arg3[var22][var23 + 1] + arg3[var22 + 1][var23 + 1] * var20 >> 7;
                int var26 = (128 - var21) * var24 + var21 * var25 >> 7;
                this.field1427[var17] = this.field1427[var17] + var26 - arg6;
            }
        } else if (arg0 == 2) {
            short var27 = arg2.field1430.field2155;
            for (int var28 = 0; var28 < this.field1466; var28++) {
                int var29 = (this.field1427[var28] << 16) / var27;
                if (var29 < arg1) {
                    int var30 = this.field1461[var28] + arg5;
                    int var31 = this.field1450[var28] + arg7;
                    int var32 = var30 & 0x7F;
                    int var33 = var31 & 0x7F;
                    int var34 = var30 >> 7;
                    int var35 = var31 >> 7;
                    int var36 = (128 - var32) * arg3[var34][var35] + arg3[var34 + 1][var35] * var32 >> 7;
                    int var37 = (128 - var32) * arg3[var34][var35 + 1] + arg3[var34 + 1][var35 + 1] * var32 >> 7;
                    int var38 = (128 - var33) * var36 + var33 * var37 >> 7;
                    this.field1427[var28] += (arg1 - var29) * (var38 - arg6) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var39 = (arg1 & 0xFF) * 4;
            int var40 = (arg1 >> 8 & 0xFF) * 4;
            this.method1382(arg3, arg5, arg6, arg7, var39, var40);
        } else if (arg0 == 4) {
            int var41 = arg2.field1430.field2158 - arg2.field1430.field2155;
            for (int var42 = 0; var42 < this.field1466; var42++) {
                int var43 = this.field1461[var42] + arg5;
                int var44 = this.field1450[var42] + arg7;
                int var45 = var43 & 0x7F;
                int var46 = var44 & 0x7F;
                int var47 = var43 >> 7;
                int var48 = var44 >> 7;
                int var49 = (128 - var45) * arg4[var47][var48] + arg4[var47 + 1][var48] * var45 >> 7;
                int var50 = (128 - var45) * arg4[var47][var48 + 1] + arg4[var47 + 1][var48 + 1] * var45 >> 7;
                int var51 = (128 - var46) * var49 + var46 * var50 >> 7;
                this.field1427[var42] = var51 + this.field1427[var42] + var41 - arg6;
            }
        } else if (arg0 == 5) {
            int var52 = arg2.field1430.field2158 - arg2.field1430.field2155;
            for (int var53 = 0; var53 < this.field1466; var53++) {
                int var54 = this.field1461[var53] + arg5;
                int var55 = this.field1450[var53] + arg7;
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
                this.field1427[var53] = ((this.field1427[var53] << 8) / var52 * var66 >> 8) - (arg6 - var62);
            }
        }
        this.field1426.field3109 = false;
        this.field1430.field2160 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[IIIIZ)V", line = 2652)
    public final void method723(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg1.length;
        if (arg0 == 0) {
            int var8 = arg2 << 4;
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = 0;
            field1483 = 0;
            field1480 = 0;
            field1475 = 0;
            for (int var12 = 0; var12 < var7; var12++) {
                int var13 = arg1[var12];
                if (var13 < this.field1456.length) {
                    int[] var14 = this.field1456[var13];
                    for (int var15 = 0; var15 < var14.length; var15++) {
                        int var16 = var14[var15];
                        field1483 += this.field1461[var16];
                        field1480 += this.field1427[var16];
                        field1475 += this.field1450[var16];
                        var11++;
                    }
                }
            }
            if (var11 > 0) {
                field1483 = field1483 / var11 + var8;
                field1480 = field1480 / var11 + var9;
                field1475 = field1475 / var11 + var10;
            } else {
                field1483 = var8;
                field1480 = var9;
                field1475 = var10;
            }
        } else if (arg0 == 1) {
            int var17 = arg2 << 4;
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            for (int var20 = 0; var20 < var7; var20++) {
                int var21 = arg1[var20];
                if (var21 < this.field1456.length) {
                    int[] var22 = this.field1456[var21];
                    for (int var23 = 0; var23 < var22.length; var23++) {
                        int var24 = var22[var23];
                        this.field1461[var24] += var17;
                        this.field1427[var24] += var18;
                        this.field1450[var24] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var25 = 0; var25 < var7; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field1456.length) {
                    int[] var27 = this.field1456[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        this.field1461[var29] -= field1483;
                        this.field1427[var29] -= field1480;
                        this.field1450[var29] -= field1475;
                        if (arg4 != 0) {
                            int var30 = class215.field3024[arg4];
                            int var31 = class215.field3017[arg4];
                            int var32 = this.field1461[var29] * var31 + this.field1427[var29] * var30 + 32767 >> 16;
                            this.field1427[var29] = this.field1427[var29] * var31 + 32767 - this.field1461[var29] * var30 >> 16;
                            this.field1461[var29] = var32;
                        }
                        if (arg2 != 0) {
                            int var33 = class215.field3024[arg2];
                            int var34 = class215.field3017[arg2];
                            int var35 = this.field1427[var29] * var34 + 32767 - this.field1450[var29] * var33 >> 16;
                            this.field1450[var29] = this.field1450[var29] * var34 + this.field1427[var29] * var33 + 32767 >> 16;
                            this.field1427[var29] = var35;
                        }
                        if (arg3 != 0) {
                            int var36 = class215.field3024[arg3];
                            int var37 = class215.field3017[arg3];
                            int var38 = this.field1461[var29] * var37 + this.field1450[var29] * var36 + 32767 >> 16;
                            this.field1450[var29] = this.field1450[var29] * var37 + 32767 - this.field1461[var29] * var36 >> 16;
                            this.field1461[var29] = var38;
                        }
                        this.field1461[var29] += field1483;
                        this.field1427[var29] += field1480;
                        this.field1450[var29] += field1475;
                    }
                }
            }
            if (arg5 && this.field1433 != null) {
                for (int var39 = 0; var39 < var7; var39++) {
                    int var40 = arg1[var39];
                    if (var40 < this.field1456.length) {
                        int[] var41 = this.field1456[var40];
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            int var43 = var41[var42];
                            int var44 = this.field1465[var43];
                            int var45 = this.field1465[var43 + 1];
                            for (int var46 = var44; var46 < var45; var46++) {
                                int var47 = this.field1459[var46] - 1;
                                if (var47 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var48 = class215.field3024[arg4];
                                    int var49 = class215.field3017[arg4];
                                    int var50 = this.field1458[var47] * var48 + this.field1433[var47] * var49 + 32767 >> 16;
                                    this.field1458[var47] = (short) (this.field1458[var47] * var49 + 32767 - this.field1433[var47] * var48 >> 16);
                                    this.field1433[var47] = (short) var50;
                                }
                                if (arg2 != 0) {
                                    int var51 = class215.field3024[arg2];
                                    int var52 = class215.field3017[arg2];
                                    int var53 = this.field1458[var47] * var52 + 32767 - this.field1428[var47] * var51 >> 16;
                                    this.field1428[var47] = (short) (this.field1458[var47] * var51 + this.field1428[var47] * var52 + 32767 >> 16);
                                    this.field1458[var47] = (short) var53;
                                }
                                if (arg3 != 0) {
                                    int var54 = class215.field3024[arg3];
                                    int var55 = class215.field3017[arg3];
                                    int var56 = this.field1433[var47] * var55 + this.field1428[var47] * var54 + 32767 >> 16;
                                    this.field1428[var47] = (short) (this.field1428[var47] * var55 + 32767 - this.field1433[var47] * var54 >> 16);
                                    this.field1433[var47] = (short) var56;
                                }
                            }
                        }
                    }
                }
                if (this.field1440 != null) {
                    this.field1440.field3109 = false;
                }
            }
        } else if (arg0 == 3) {
            for (int var57 = 0; var57 < var7; var57++) {
                int var58 = arg1[var57];
                if (var58 < this.field1456.length) {
                    int[] var59 = this.field1456[var58];
                    for (int var60 = 0; var60 < var59.length; var60++) {
                        int var61 = var59[var60];
                        this.field1461[var61] -= field1483;
                        this.field1427[var61] -= field1480;
                        this.field1450[var61] -= field1475;
                        this.field1461[var61] = this.field1461[var61] * arg2 >> 7;
                        this.field1427[var61] = this.field1427[var61] * arg3 >> 7;
                        this.field1450[var61] = this.field1450[var61] * arg4 >> 7;
                        this.field1461[var61] += field1483;
                        this.field1427[var61] += field1480;
                        this.field1450[var61] += field1475;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field1438 != null && this.field1425 != null) {
                for (int var62 = 0; var62 < var7; var62++) {
                    int var63 = arg1[var62];
                    if (var63 < this.field1438.length) {
                        int[] var64 = this.field1438[var63];
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            int var66 = var64[var65];
                            int var67 = (this.field1425[var66] & 0xFF) + arg2 * 8;
                            if (var67 < 0) {
                                var67 = 0;
                            } else if (var67 > 255) {
                                var67 = 255;
                            }
                            this.field1425[var66] = (byte) var67;
                        }
                        if (var64.length > 0) {
                            this.field1441.field3109 = false;
                        }
                    }
                }
            }
        } else if (arg0 == 7 && this.field1438 != null) {
            for (int var68 = 0; var68 < var7; var68++) {
                int var69 = arg1[var68];
                if (var69 < this.field1438.length) {
                    int[] var70 = this.field1438[var69];
                    for (int var71 = 0; var71 < var70.length; var71++) {
                        int var72 = var70[var71];
                        int var73 = this.field1431[var72] & 0xFFFF;
                        int var74 = var73 >> 10 & 0x3F;
                        int var75 = var73 >> 7 & 0x7;
                        int var76 = var73 & 0x7F;
                        int var77 = arg2 + var74 & 0x3F;
                        int var78 = arg3 / 4 + var75;
                        if (var78 < 0) {
                            var78 = 0;
                        } else if (var78 > 7) {
                            var78 = 7;
                        }
                        int var79 = arg4 + var76;
                        if (var79 < 0) {
                            var79 = 0;
                        } else if (var79 > 127) {
                            var79 = 127;
                        }
                        this.field1431[var72] = (short) (var77 << 10 | var78 << 7 | var79);
                    }
                    if (var70.length > 0) {
                        this.field1441.field3109 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "()V", line = 3059)
    private final void method724() {
        if (field1436.field1388.length < this.field1454 * 12) {
            field1436 = new class107((this.field1454 + 100) * 12);
        } else {
            field1436.field1400 = 0;
        }
        if (class250.field3825) {
            for (int var1 = 0; var1 < this.field1454; var1++) {
                field1436.method641(1773202520, this.field1437[var1]);
                field1436.method641(1773202520, this.field1451[var1]);
                field1436.method641(1773202520, this.field1449[var1]);
            }
        } else {
            for (int var2 = 0; var2 < this.field1454; var2++) {
                field1436.method635(-16082, this.field1437[var2]);
                field1436.method635(-16082, this.field1451[var2]);
                field1436.method635(-16082, this.field1449[var2]);
            }
        }
        if (!class250.field3809) {
            ByteBuffer var5 = ByteBuffer.allocateDirect(field1436.field1400);
            var5.put(field1436.field1388, 0, field1436.field1400);
            var5.flip();
            this.field1467.field3109 = true;
            this.field1467.field3108 = var5;
            this.field1467.field3114 = null;
            return;
        }
        class71 var3 = new class71();
        ByteBuffer var4 = ByteBuffer.wrap(field1436.field1388, 0, field1436.field1400);
        var3.method432(var4);
        this.field1467.field3109 = true;
        this.field1467.field3108 = null;
        this.field1467.field3114 = var3;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[FFIF)V", line = 3117)
    private static final void method725(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9) {
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
        field1486 = var16;
        field1485 = var17;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([FI)[F", line = 3162)
    private static final float[] method726(float[] arg0, int arg1) {
        float[] var2 = new float[arg1];
        class86.method510(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "()V", line = 3169)
    private final void method727() {
        int var1 = 32767;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = -32768;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < this.field1466; var9++) {
            int var10 = this.field1461[var9];
            int var11 = this.field1427[var9];
            int var12 = this.field1450[var9];
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
        this.field1430.field2161 = (short) var1;
        this.field1430.field2157 = (short) var4;
        this.field1430.field2155 = (short) var2;
        this.field1430.field2158 = (short) var5;
        this.field1430.field2156 = (short) var3;
        this.field1430.field2162 = (short) var6;
        this.field1430.field2159 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
        Math.sqrt((double) var8);
        this.field1430.field2160 = true;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 4531)
    private class108() {
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lpn;IIZ)V", line = 4536)
    public class108(class207 arg0, int arg1, int arg2, boolean arg3) {
        int[] var5 = new int[arg0.field2938];
        this.field1465 = new int[arg0.field2929 + 1];
        for (int var6 = 0; var6 < arg0.field2938; var6++) {
            if ((arg0.field2894 == null || arg0.field2894[var6] != 2) && (arg0.field2924 == null || arg0.field2924[var6] == -1 || !class215.field3020.method371(arg0.field2924[var6] & 0xFFFF, (byte) -119))) {
                var5[this.field1454++] = var6;
                this.field1465[arg0.field2943[var6]]++;
                this.field1465[arg0.field2920[var6]]++;
                this.field1465[arg0.field2927[var6]]++;
            }
        }
        long[] var7 = new long[this.field1454];
        for (int var8 = 0; var8 < this.field1454; var8++) {
            int var9 = var5[var8];
            int var10 = 0;
            byte var11 = 0;
            int var12 = 0;
            int var13 = 0;
            short var14 = -1;
            if (arg0.field2924 != null) {
                var14 = arg0.field2924[var9];
                if (var14 != -1) {
                    var12 = class215.field3020.method391(false, var14 & 0xFFFF);
                    var13 = class215.field3020.method372(var14 & 0xFFFF, (byte) 67);
                }
            }
            boolean var15 = arg0.field2899 != null && arg0.field2899[var9] != 0 || var14 != -1 && !class215.field3020.method384(16056, var14 & 0xFFFF);
            if ((arg3 || var15) && arg0.field2904 != null) {
                var10 += arg0.field2904[var9] << 17;
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
        class73.method444((byte) -12, var7, var5);
        this.field1442 = arg0.field2929;
        this.field1466 = arg0.field2944;
        this.field1461 = arg0.field2941;
        this.field1427 = arg0.field2935;
        this.field1450 = arg0.field2914;
        this.field1445 = arg0.field2895;
        this.field1468 = arg0.field2905;
        int var20 = this.field1454 * 3;
        this.field1433 = new short[var20];
        this.field1458 = new short[var20];
        this.field1428 = new short[var20];
        this.field1455 = new short[var20];
        this.field1457 = new float[var20];
        this.field1432 = new float[var20];
        this.field1431 = new short[this.field1454];
        this.field1425 = new byte[this.field1454];
        this.field1437 = new short[this.field1454];
        this.field1451 = new short[this.field1454];
        this.field1449 = new short[this.field1454];
        this.field1439 = new short[this.field1454];
        if (arg0.field2930 != null) {
            this.field1452 = new byte[this.field1454];
        }
        if (arg0.field2926 != null) {
            this.field1447 = new short[this.field1454];
        }
        this.field1430 = new class155();
        this.field1426 = new class221();
        this.field1441 = new class221();
        if (class162.field2241) {
            this.field1440 = new class221();
        }
        this.field1462 = new class221();
        this.field1467 = new class221();
        this.field1460 = (short) arg1;
        this.field1435 = (short) arg2;
        this.field1459 = new short[var20];
        field1463 = new long[var20];
        int var21 = 0;
        for (int var22 = 0; var22 < this.field1466; var22++) {
            int var23 = this.field1465[var22];
            this.field1465[var22] = var21;
            var21 += var23;
        }
        this.field1465[this.field1466] = var21;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = (float[][]) null;
        if (arg0.field2913 != null) {
            int var28 = arg0.field2932;
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
            for (int var36 = 0; var36 < this.field1454; var36++) {
                int var37 = var5[var36];
                if (arg0.field2913[var37] != -1) {
                    int var38 = arg0.field2913[var37] & 0xFF;
                    for (int var39 = 0; var39 < 3; var39++) {
                        int var40;
                        if (var39 == 0) {
                            var40 = arg0.field2943[var37];
                        } else if (var39 == 1) {
                            var40 = arg0.field2920[var37];
                        } else {
                            var40 = arg0.field2927[var37];
                        }
                        int var41 = arg0.field2941[var40];
                        int var42 = arg0.field2935[var40];
                        int var43 = arg0.field2914[var40];
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
                byte var45 = arg0.field2923[var44];
                if (var45 > 0) {
                    var24[var44] = (var29[var44] + var30[var44]) / 2;
                    var25[var44] = (var31[var44] + var32[var44]) / 2;
                    var26[var44] = (var33[var44] + var34[var44]) / 2;
                    float var47;
                    float var48;
                    float var49;
                    if (var45 == 1) {
                        short var46 = arg0.field2910[var44];
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
                        var49 = 64.0F / (float) (arg0.field2942[var44] & 0xFFFF);
                    } else if (var45 == 2) {
                        var47 = 64.0F / (float) (arg0.field2910[var44] & 0xFFFF);
                        var49 = 64.0F / (float) (arg0.field2942[var44] & 0xFFFF);
                        var48 = 64.0F / (float) (arg0.field2931[var44] & 0xFFFF);
                    } else {
                        var47 = (float) arg0.field2910[var44] / 1024.0F;
                        var49 = (float) arg0.field2942[var44] / 1024.0F;
                        var48 = (float) arg0.field2931[var44] / 1024.0F;
                    }
                    var27[var44] = method690(arg0.field2919[var44], arg0.field2903[var44], arg0.field2940[var44], arg0.field2934[var44] & 0xFF, var47, var49, var48);
                }
            }
        }
        for (int var50 = 0; var50 < this.field1454; var50++) {
            int var51 = var5[var50];
            int var52 = arg0.field2896[var51] & 0xFFFF;
            short var53;
            if (arg0.field2924 == null) {
                var53 = -1;
            } else {
                var53 = arg0.field2924[var51];
            }
            int var54;
            if (arg0.field2913 == null) {
                var54 = -1;
            } else {
                var54 = arg0.field2913[var51];
            }
            int var55;
            if (arg0.field2899 == null) {
                var55 = 0;
            } else {
                var55 = arg0.field2899[var51] & 0xFF;
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
                    byte var65 = arg0.field2923[var54];
                    if (var65 == 0) {
                        int var66 = arg0.field2943[var51];
                        int var67 = arg0.field2920[var51];
                        int var68 = arg0.field2927[var51];
                        short var69 = arg0.field2919[var54];
                        short var70 = arg0.field2903[var54];
                        short var71 = arg0.field2940[var54];
                        float var72 = (float) arg0.field2941[var69];
                        float var73 = (float) arg0.field2935[var69];
                        float var74 = (float) arg0.field2914[var69];
                        float var75 = (float) arg0.field2941[var70] - var72;
                        float var76 = (float) arg0.field2935[var70] - var73;
                        float var77 = (float) arg0.field2914[var70] - var74;
                        float var78 = (float) arg0.field2941[var71] - var72;
                        float var79 = (float) arg0.field2935[var71] - var73;
                        float var80 = (float) arg0.field2914[var71] - var74;
                        float var81 = (float) arg0.field2941[var66] - var72;
                        float var82 = (float) arg0.field2935[var66] - var73;
                        float var83 = (float) arg0.field2914[var66] - var74;
                        float var84 = (float) arg0.field2941[var67] - var72;
                        float var85 = (float) arg0.field2935[var67] - var73;
                        float var86 = (float) arg0.field2914[var67] - var74;
                        float var87 = (float) arg0.field2941[var68] - var72;
                        float var88 = (float) arg0.field2935[var68] - var73;
                        float var89 = (float) arg0.field2914[var68] - var74;
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
                        int var101 = arg0.field2943[var51];
                        int var102 = arg0.field2920[var51];
                        int var103 = arg0.field2927[var51];
                        int var104 = var24[var54];
                        int var105 = var25[var54];
                        int var106 = var26[var54];
                        float[] var107 = var27[var54];
                        byte var108 = arg0.field2916[var54];
                        float var109 = (float) arg0.field2893[var54] / 256.0F;
                        if (var65 == 1) {
                            float var110 = (float) (arg0.field2931[var54] & 0xFFFF) / 1024.0F;
                            method725(arg0.field2941[var101], arg0.field2935[var101], arg0.field2914[var101], var104, var105, var106, var107, var110, var108, var109);
                            var56 = field1486;
                            var57 = field1485;
                            method725(arg0.field2941[var102], arg0.field2935[var102], arg0.field2914[var102], var104, var105, var106, var107, var110, var108, var109);
                            var58 = field1486;
                            var59 = field1485;
                            method725(arg0.field2941[var103], arg0.field2935[var103], arg0.field2914[var103], var104, var105, var106, var107, var110, var108, var109);
                            var60 = field1486;
                            var61 = field1485;
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
                            float var112 = (float) arg0.field2906[var54] / 256.0F;
                            float var113 = (float) arg0.field2898[var54] / 256.0F;
                            int var114 = arg0.field2941[var102] - arg0.field2941[var101];
                            int var115 = arg0.field2935[var102] - arg0.field2935[var101];
                            int var116 = arg0.field2914[var102] - arg0.field2914[var101];
                            int var117 = arg0.field2941[var103] - arg0.field2941[var101];
                            int var118 = arg0.field2935[var103] - arg0.field2935[var101];
                            int var119 = arg0.field2914[var103] - arg0.field2914[var101];
                            int var120 = var115 * var119 - var116 * var118;
                            int var121 = var116 * var117 - var114 * var119;
                            int var122 = var114 * var118 - var115 * var117;
                            float var123 = 64.0F / (float) (arg0.field2910[var54] & 0xFFFF);
                            float var124 = 64.0F / (float) (arg0.field2942[var54] & 0xFFFF);
                            float var125 = 64.0F / (float) (arg0.field2931[var54] & 0xFFFF);
                            float var126 = (var107[2] * (float) var122 + var107[0] * (float) var120 + var107[1] * (float) var121) / var123;
                            float var127 = (var107[5] * (float) var122 + var107[3] * (float) var120 + var107[4] * (float) var121) / var124;
                            float var128 = (var107[8] * (float) var122 + var107[6] * (float) var120 + var107[7] * (float) var121) / var125;
                            var64 = method701(var126, var127, var128);
                            method737(arg0.field2941[var101], arg0.field2935[var101], arg0.field2914[var101], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var56 = field1479;
                            var57 = field1476;
                            method737(arg0.field2941[var102], arg0.field2935[var102], arg0.field2914[var102], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var58 = field1479;
                            var59 = field1476;
                            method737(arg0.field2941[var103], arg0.field2935[var103], arg0.field2914[var103], var104, var105, var106, var64, var107, var108, var109, var112, var113);
                            var60 = field1479;
                            var61 = field1476;
                        } else if (var65 == 3) {
                            method691(arg0.field2941[var101], arg0.field2935[var101], arg0.field2914[var101], var104, var105, var106, var107, var108, var109);
                            var56 = field1481;
                            var57 = field1478;
                            method691(arg0.field2941[var102], arg0.field2935[var102], arg0.field2914[var102], var104, var105, var106, var107, var108, var109);
                            var58 = field1481;
                            var59 = field1478;
                            method691(arg0.field2941[var103], arg0.field2935[var103], arg0.field2914[var103], var104, var105, var106, var107, var108, var109);
                            var60 = field1481;
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
            arg0.method1418();
            byte var129;
            if (arg0.field2894 == null) {
                var129 = 0;
            } else {
                var129 = arg0.field2894[var51];
            }
            if (var129 == 0) {
                long var130 = ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32) + (long) (var54 << 2);
                int var132 = arg0.field2943[var51];
                class334 var133 = arg0.field2939[var132];
                this.field1437[var50] = this.method739(arg0, var132, var130, var133.field5159, var133.field5163, var133.field5164, var133.field5161, var56, var57);
                int var134 = arg0.field2920[var51];
                class334 var135 = arg0.field2939[var134];
                this.field1451[var50] = this.method739(arg0, var134, (long) var62 + var130, var135.field5159, var135.field5163, var135.field5164, var135.field5161, var58, var59);
                int var136 = arg0.field2927[var51];
                class334 var137 = arg0.field2939[var136];
                this.field1449[var50] = this.method739(arg0, var136, (long) var63 + var130, var137.field5159, var137.field5163, var137.field5164, var137.field5161, var60, var61);
            } else if (var129 == 1) {
                class243 var138 = arg0.field2912[var51];
                long var139 = (long) ((var54 << 2) + (var138.field3652 > 0 ? 1024 : 2048) + (var138.field3654 + 256 << 12) + (var138.field3661 + 256 << 22)) + ((long) (var52 << 8) + (long) (var64 << 24) + (long) var55 << 32);
                this.field1437[var50] = this.method739(arg0, arg0.field2943[var51], var139, var138.field3652, var138.field3654, var138.field3661, 0, var56, var57);
                this.field1451[var50] = this.method739(arg0, arg0.field2920[var51], (long) var62 + var139, var138.field3652, var138.field3654, var138.field3661, 0, var58, var59);
                this.field1449[var50] = this.method739(arg0, arg0.field2927[var51], (long) var63 + var139, var138.field3652, var138.field3654, var138.field3661, 0, var60, var61);
            }
            if (arg0.field2924 == null) {
                this.field1439[var50] = -1;
            } else {
                this.field1439[var50] = arg0.field2924[var51];
            }
            if (this.field1452 != null) {
                this.field1452[var50] = (byte) arg0.field2930[var51];
            }
            this.field1431[var50] = arg0.field2896[var51];
            if (arg0.field2899 != null) {
                this.field1425[var50] = arg0.field2899[var51];
            }
            if (arg0.field2926 != null) {
                this.field1447[var50] = arg0.field2926[var51];
            }
        }
        int var141 = 0;
        short var142 = -10000;
        for (int var143 = 0; var143 < this.field1454; var143++) {
            short var144 = this.field1439[var143];
            if (var142 != var144) {
                var141++;
                var142 = var144;
            }
        }
        this.field1443 = new int[var141 + 1];
        int var145 = 0;
        short var146 = -10000;
        for (int var147 = 0; var147 < this.field1454; var147++) {
            short var148 = this.field1439[var147];
            if (var146 != var148) {
                this.field1443[var145++] = var147;
                var146 = var148;
            }
        }
        this.field1443[var145] = this.field1454;
        field1463 = null;
        this.field1433 = method733(this.field1433, this.field1453);
        this.field1458 = method733(this.field1458, this.field1453);
        this.field1428 = method733(this.field1428, this.field1453);
        this.field1455 = method733(this.field1455, this.field1453);
        this.field1457 = method726(this.field1457, this.field1453);
        this.field1432 = method726(this.field1432, this.field1453);
    }

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "()I", line = 3248)
    public final int method728() {
        if (!this.field1430.field2160) {
            this.method727();
        }
        return this.field1430.field2161;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZZZZZZZ)Lpe;", line = 3255)
    public final class108 method729(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9, boolean arg10) {
        class108 var12 = new class108();
        var12.field1442 = this.field1442;
        var12.field1466 = this.field1466;
        var12.field1453 = this.field1453;
        var12.field1454 = this.field1454;
        if (arg0) {
            var12.field1461 = this.field1461;
            var12.field1450 = this.field1450;
        } else {
            var12.field1461 = class269.method1959(4, this.field1461);
            var12.field1450 = class269.method1959(4, this.field1450);
        }
        if (arg1) {
            var12.field1427 = this.field1427;
        } else {
            var12.field1427 = class269.method1959(4, this.field1427);
        }
        if (arg0 && arg1) {
            var12.field1426 = this.field1426;
            var12.field1430 = this.field1430;
        } else {
            var12.field1426 = new class221();
            var12.field1430 = new class155();
        }
        if (arg2) {
            var12.field1431 = this.field1431;
        } else {
            var12.field1431 = class252.method1837(-79, this.field1431);
        }
        if (arg3) {
            var12.field1425 = this.field1425;
        } else {
            var12.field1425 = class154.method1023((byte) -119, this.field1425);
        }
        if (!arg2 || !arg3 || !arg4 || (!arg7 || !arg5) && !class162.field2241) {
            var12.field1441 = new class221();
        } else {
            var12.field1441 = this.field1441;
        }
        if (arg5) {
            var12.field1433 = this.field1433;
            var12.field1458 = this.field1458;
            var12.field1428 = this.field1428;
            var12.field1455 = this.field1455;
        } else {
            var12.field1433 = class252.method1837(-120, this.field1433);
            var12.field1458 = class252.method1837(-122, this.field1458);
            var12.field1428 = class252.method1837(-82, this.field1428);
            var12.field1455 = class252.method1837(-94, this.field1455);
        }
        if (!class162.field2241) {
            var12.field1440 = null;
        } else if (arg5 && arg6 && arg7) {
            var12.field1440 = this.field1440;
        } else {
            var12.field1440 = new class221();
        }
        if (arg8) {
            var12.field1457 = this.field1457;
            var12.field1432 = this.field1432;
            var12.field1462 = this.field1462;
        } else {
            var12.field1457 = class37.method220(this.field1457, 3988);
            var12.field1432 = class37.method220(this.field1432, 3988);
            var12.field1462 = new class221();
        }
        if (arg9) {
            var12.field1437 = this.field1437;
            var12.field1451 = this.field1451;
            var12.field1449 = this.field1449;
            var12.field1467 = this.field1467;
        } else {
            var12.field1437 = class252.method1837(-101, this.field1437);
            var12.field1451 = class252.method1837(-89, this.field1451);
            var12.field1449 = class252.method1837(-127, this.field1449);
            var12.field1467 = new class221();
        }
        if (arg10) {
            var12.field1439 = this.field1439;
        } else {
            var12.field1439 = class252.method1837(-94, this.field1439);
        }
        var12.field1445 = this.field1445;
        var12.field1456 = this.field1456;
        var12.field1452 = this.field1452;
        var12.field1438 = this.field1438;
        var12.field1443 = this.field1443;
        var12.field1459 = this.field1459;
        var12.field1465 = this.field1465;
        var12.field1460 = this.field1460;
        var12.field1435 = this.field1435;
        var12.field1468 = this.field1468;
        var12.field1447 = this.field1447;
        return var12;
    }

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "()I", line = 3395)
    public final int method730() {
        return this.field1460;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIII)Z", line = 3404)
    private final boolean method731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZZZ)V", line = 3419)
    public final void method732(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6) {
        if (this.field1448 != 0) {
            throw new IllegalArgumentException();
        } else if (this.field1453 != 0) {
            if (arg6) {
                boolean var8 = !this.field1441.field3109 && (arg1 || arg2 && !class162.field2241);
                this.method735(false, !this.field1426.field3109 && arg0, var8, this.field1440 != null && !this.field1440.field3109 && arg2, !this.field1462.field3109 && arg3);
                if (!this.field1467.field3109 && arg4 && arg1) {
                    this.method724();
                }
            }
            if (arg0) {
                if (this.field1426.field3109) {
                    if (!this.field1430.field2160) {
                        this.method727();
                    }
                    this.field1461 = null;
                    this.field1427 = null;
                    this.field1450 = null;
                    this.field1459 = null;
                    this.field1465 = null;
                } else {
                    this.field1444 = (byte) (this.field1444 | 0x1);
                }
            }
            if (arg1) {
                if (this.field1441.field3109) {
                    this.field1431 = null;
                    this.field1425 = null;
                } else {
                    this.field1444 = (byte) (this.field1444 | 0x2);
                }
            }
            if (arg2 && class162.field2241) {
                if (this.field1440.field3109) {
                    this.field1433 = null;
                    this.field1458 = null;
                    this.field1428 = null;
                    this.field1455 = null;
                } else {
                    this.field1444 = (byte) (this.field1444 | 0x4);
                }
            }
            if (arg3) {
                if (this.field1462.field3109) {
                    this.field1457 = null;
                    this.field1432 = null;
                } else {
                    this.field1444 = (byte) (this.field1444 | 0x8);
                }
            }
            if (arg4 && arg1) {
                if (this.field1467.field3109 && this.field1441.field3109) {
                    this.field1437 = null;
                    this.field1451 = null;
                    this.field1449 = null;
                } else {
                    this.field1444 = (byte) (this.field1444 | 0x10);
                }
            }
            if (arg5) {
                this.field1445 = null;
                this.field1452 = null;
                this.field1456 = (int[][]) null;
                this.field1438 = (int[][]) null;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([SI)[S", line = 3521)
    private static final short[] method733(short[] arg0, int arg1) {
        short[] var2 = new short[arg1];
        class86.method506(arg0, 0, var2, 0, arg1);
        return var2;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 3535)
    public final void method734(int arg0) {
        int var2 = class215.field3024[arg0];
        int var3 = class215.field3017[arg0];
        for (int var4 = 0; var4 < this.field1442; var4++) {
            int var5 = this.field1461[var4] * var3 + this.field1427[var4] * var2 >> 16;
            this.field1427[var4] = this.field1427[var4] * var3 - this.field1461[var4] * var2 >> 16;
            this.field1461[var4] = var5;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZZZZZ)V", line = 3561)
    private final void method735(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        int var6 = 0;
        if (arg1) {
            this.field1426.field3119 = var6;
            var6 += 12;
        }
        if (arg2) {
            this.field1441.field3119 = var6;
            var6 += 4;
        }
        if (arg3) {
            this.field1440.field3119 = var6;
            var6 += 12;
        }
        if (arg4) {
            this.field1462.field3119 = var6;
            var6 += 8;
        }
        if (var6 == 0) {
            return;
        }
        if (field1436.field1388.length < this.field1453 * var6) {
            field1436 = new class107((this.field1453 + 100) * var6);
        } else {
            field1436.field1400 = 0;
        }
        if (arg1) {
            if (class250.field3825) {
                for (int var7 = 0; var7 < this.field1466; var7++) {
                    int var8 = Float.floatToRawIntBits((float) this.field1461[var7]);
                    int var9 = Float.floatToRawIntBits((float) this.field1427[var7]);
                    int var10 = Float.floatToRawIntBits((float) this.field1450[var7]);
                    int var11 = this.field1465[var7];
                    int var12 = this.field1465[var7 + 1];
                    for (int var13 = var11; var13 < var12; var13++) {
                        int var14 = this.field1459[var13] - 1;
                        if (var14 == -1) {
                            break;
                        }
                        field1436.field1400 = var6 * var14;
                        field1436.method641(1773202520, var8);
                        field1436.method641(1773202520, var9);
                        field1436.method641(1773202520, var10);
                    }
                }
            } else {
                for (int var15 = 0; var15 < this.field1466; var15++) {
                    int var16 = Float.floatToRawIntBits((float) this.field1461[var15]);
                    int var17 = Float.floatToRawIntBits((float) this.field1427[var15]);
                    int var18 = Float.floatToRawIntBits((float) this.field1450[var15]);
                    int var19 = this.field1465[var15];
                    int var20 = this.field1465[var15 + 1];
                    for (int var21 = var19; var21 < var20; var21++) {
                        int var22 = this.field1459[var21] - 1;
                        if (var22 == -1) {
                            break;
                        }
                        field1436.field1400 = var6 * var22;
                        field1436.method635(-16082, var16);
                        field1436.method635(-16082, var17);
                        field1436.method635(-16082, var18);
                    }
                }
            }
        }
        if (arg2) {
            if (class162.field2241) {
                for (int var42 = 0; var42 < this.field1454; var42++) {
                    int var43 = method710(this.field1431[var42], this.field1439[var42], this.field1460, this.field1425[var42]);
                    field1436.field1400 = this.field1437[var42] * var6 + this.field1441.field3119;
                    field1436.method641(1773202520, var43);
                    field1436.field1400 = this.field1451[var42] * var6 + this.field1441.field3119;
                    field1436.method641(1773202520, var43);
                    field1436.field1400 = this.field1449[var42] * var6 + this.field1441.field3119;
                    field1436.method641(1773202520, var43);
                }
            } else {
                int var23 = (int) class64.field834[0];
                int var24 = (int) class64.field834[1];
                int var25 = (int) class64.field834[2];
                int var26 = (int) Math.sqrt((double) (var25 * var25 + var23 * var23 + var24 * var24));
                int var27 = (int) ((float) this.field1460 * 1.3F);
                int var28 = this.field1435 * var26 >> 8;
                for (int var29 = 0; var29 < this.field1454; var29++) {
                    short var30 = this.field1437[var29];
                    short var31 = this.field1455[var30];
                    int var32;
                    if (var31 < 0) {
                        var32 = -var31 - 1;
                    } else {
                        if (var31 == 0) {
                            var32 = (this.field1428[var30] * var25 + this.field1458[var30] * var24 + this.field1433[var30] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var32 = (this.field1428[var30] * var25 + this.field1458[var30] * var24 + this.field1433[var30] * var23) / (var28 * var31) + var27;
                        }
                        if (var32 < 0) {
                            var32 = 0;
                        } else if (var32 > 16384) {
                            var32 = 16384;
                        }
                        this.field1455[var30] = (short) (-var32 - 1);
                    }
                    short var33 = this.field1451[var29];
                    short var34 = this.field1455[var33];
                    int var35;
                    if (var34 < 0) {
                        var35 = -var34 - 1;
                    } else {
                        if (var34 == 0) {
                            var35 = (this.field1428[var33] * var25 + this.field1458[var33] * var24 + this.field1433[var33] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var35 = (this.field1428[var33] * var25 + this.field1458[var33] * var24 + this.field1433[var33] * var23) / (var28 * var34) + var27;
                        }
                        if (var35 < 0) {
                            var35 = 0;
                        } else if (var35 > 16384) {
                            var35 = 16384;
                        }
                        this.field1455[var33] = (short) (-var35 - 1);
                    }
                    short var36 = this.field1449[var29];
                    short var37 = this.field1455[var36];
                    int var38;
                    if (var37 < 0) {
                        var38 = -var37 - 1;
                    } else {
                        if (var37 == 0) {
                            var38 = (this.field1428[var36] * var25 + this.field1458[var36] * var24 + this.field1433[var36] * var23) / (var28 / 2 + var28) + var27;
                        } else {
                            var38 = (this.field1428[var36] * var25 + this.field1458[var36] * var24 + this.field1433[var36] * var23) / (var28 * var37) + var27;
                        }
                        if (var38 < 0) {
                            var38 = 0;
                        } else if (var38 > 16384) {
                            var38 = 16384;
                        }
                        this.field1455[var36] = (short) (-var38 - 1);
                    }
                    int var39 = method710(this.field1431[var29], this.field1439[var29], var32, this.field1425[var29]);
                    int var40 = method710(this.field1431[var29], this.field1439[var29], var35, this.field1425[var29]);
                    int var41 = method710(this.field1431[var29], this.field1439[var29], var38, this.field1425[var29]);
                    field1436.field1400 = var6 * var30 + this.field1441.field3119;
                    field1436.method641(1773202520, var39);
                    field1436.field1400 = var6 * var33 + this.field1441.field3119;
                    field1436.method641(1773202520, var40);
                    field1436.field1400 = var6 * var36 + this.field1441.field3119;
                    field1436.method641(1773202520, var41);
                }
                this.field1433 = null;
                this.field1458 = null;
                this.field1428 = null;
            }
        }
        if (arg3) {
            float var44 = 3.0F / (float) this.field1435;
            float var45 = 3.0F / (float) (this.field1435 / 2 + this.field1435);
            field1436.field1400 = this.field1440.field3119;
            if (class250.field3825) {
                for (int var46 = 0; var46 < this.field1453; var46++) {
                    short var47 = this.field1455[var46];
                    if (var47 == 0) {
                        field1436.method673(32166, (float) this.field1433[var46] * var45);
                        field1436.method673(32166, (float) this.field1458[var46] * var45);
                        field1436.method673(32166, (float) this.field1428[var46] * var45);
                    } else {
                        float var48 = var44 / (float) var47;
                        field1436.method673(32166, (float) this.field1433[var46] * var48);
                        field1436.method673(32166, (float) this.field1458[var46] * var48);
                        field1436.method673(32166, (float) this.field1428[var46] * var48);
                    }
                    field1436.field1400 += var6 - 12;
                }
            } else {
                for (int var49 = 0; var49 < this.field1453; var49++) {
                    short var50 = this.field1455[var49];
                    if (var50 == 0) {
                        field1436.method682(113, (float) this.field1433[var49] * var45);
                        field1436.method682(76, (float) this.field1458[var49] * var45);
                        field1436.method682(-126, (float) this.field1428[var49] * var45);
                    } else {
                        float var51 = var44 / (float) var50;
                        field1436.method682(-111, (float) this.field1433[var49] * var51);
                        field1436.method682(-116, (float) this.field1458[var49] * var51);
                        field1436.method682(-103, (float) this.field1428[var49] * var51);
                    }
                    field1436.field1400 += var6 - 12;
                }
            }
        }
        if (arg4) {
            field1436.field1400 = this.field1462.field3119;
            if (class250.field3825) {
                for (int var52 = 0; var52 < this.field1453; var52++) {
                    field1436.method673(32166, this.field1457[var52]);
                    field1436.method673(32166, this.field1432[var52]);
                    field1436.field1400 += var6 - 8;
                }
            } else {
                for (int var53 = 0; var53 < this.field1453; var53++) {
                    field1436.method682(-110, this.field1457[var53]);
                    field1436.method682(-125, this.field1432[var53]);
                    field1436.field1400 += var6 - 8;
                }
            }
        }
        field1436.field1400 = this.field1453 * var6;
        if (arg0) {
            if (class250.field3824) {
                ByteBuffer var54 = ByteBuffer.wrap(field1436.field1388, 0, field1436.field1400);
                if (this.field1446 == null) {
                    this.field1446 = new class71(true);
                    this.field1446.method432(var54);
                } else {
                    this.field1446.method434(var54);
                }
                if (arg1) {
                    this.field1426.field3109 = true;
                    this.field1426.field3108 = null;
                    this.field1426.field3114 = this.field1446;
                    this.field1426.field3112 = var6;
                }
                if (arg2) {
                    this.field1441.field3109 = true;
                    this.field1441.field3108 = null;
                    this.field1441.field3114 = this.field1446;
                    this.field1441.field3112 = var6;
                }
                if (arg3) {
                    this.field1440.field3109 = true;
                    this.field1440.field3108 = null;
                    this.field1440.field3114 = this.field1446;
                    this.field1440.field3112 = var6;
                }
                if (arg4) {
                    this.field1462.field3109 = true;
                    this.field1462.field3108 = null;
                    this.field1462.field3114 = this.field1446;
                    this.field1462.field3112 = var6;
                }
            } else {
                if (field1469 == null || field1469.capacity() < field1436.field1400) {
                    field1469 = ByteBuffer.allocateDirect(var6 * 100 + field1436.field1400);
                } else {
                    field1469.clear();
                }
                field1469.put(field1436.field1388, 0, field1436.field1400);
                field1469.flip();
                if (arg1) {
                    this.field1426.field3109 = true;
                    this.field1426.field3108 = field1469;
                    this.field1426.field3114 = null;
                    this.field1426.field3112 = var6;
                }
                if (arg2) {
                    this.field1441.field3109 = true;
                    this.field1441.field3108 = field1469;
                    this.field1426.field3114 = null;
                    this.field1441.field3112 = var6;
                }
                if (arg3) {
                    this.field1440.field3109 = true;
                    this.field1440.field3108 = field1469;
                    this.field1440.field3114 = null;
                    this.field1440.field3112 = var6;
                }
                if (arg4) {
                    this.field1462.field3109 = true;
                    this.field1462.field3108 = field1469;
                    this.field1462.field3114 = null;
                    this.field1462.field3112 = var6;
                }
            }
        } else if (class250.field3809) {
            class71 var55 = new class71();
            ByteBuffer var56 = ByteBuffer.wrap(field1436.field1388, 0, field1436.field1400);
            var55.method432(var56);
            if (arg1) {
                this.field1426.field3109 = true;
                this.field1426.field3108 = null;
                this.field1426.field3114 = var55;
                this.field1426.field3112 = var6;
            }
            if (arg2) {
                this.field1441.field3109 = true;
                this.field1441.field3108 = null;
                this.field1441.field3114 = var55;
                this.field1441.field3112 = var6;
            }
            if (arg3) {
                this.field1440.field3109 = true;
                this.field1440.field3108 = null;
                this.field1440.field3114 = var55;
                this.field1440.field3112 = var6;
            }
            if (arg4) {
                this.field1462.field3109 = true;
                this.field1462.field3108 = null;
                this.field1462.field3114 = var55;
                this.field1462.field3112 = var6;
            }
        } else {
            ByteBuffer var57 = ByteBuffer.allocateDirect(field1436.field1400);
            var57.put(field1436.field1388, 0, field1436.field1400);
            var57.flip();
            if (arg1) {
                this.field1426.field3109 = true;
                this.field1426.field3108 = var57;
                this.field1426.field3114 = null;
                this.field1426.field3112 = var6;
            }
            if (arg2) {
                this.field1441.field3109 = true;
                this.field1441.field3108 = var57;
                this.field1426.field3114 = null;
                this.field1441.field3112 = var6;
            }
            if (arg3) {
                this.field1440.field3109 = true;
                this.field1440.field3108 = var57;
                this.field1440.field3114 = null;
                this.field1440.field3112 = var6;
            }
            if (arg4) {
                this.field1462.field3109 = true;
                this.field1462.field3108 = var57;
                this.field1462.field3114 = null;
                this.field1462.field3112 = var6;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "()Z", line = 4089)
    public final boolean method736() {
        if (this.field1456 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field1442; var1++) {
            this.field1461[var1] <<= 0x4;
            this.field1427[var1] <<= 0x4;
            this.field1450[var1] <<= 0x4;
        }
        field1483 = 0;
        field1480 = 0;
        field1475 = 0;
        return true;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 4109)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        if (this.field1453 == 0) {
            return;
        }
        if (!this.field1430.field2160) {
            this.method727();
        }
        short var13 = this.field1430.field2159;
        short var14 = this.field1430.field2155;
        short var15 = this.field1430.field2158;
        int var16 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var17 = arg1 * arg6 + arg2 * var16 >> 16;
        int var18 = (arg1 * var15 + arg2 * var13 >> 16) + var17;
        if (var18 <= 50) {
            return;
        }
        int var19 = (-var13 * arg2 + arg1 * var14 >> 16) + var17;
        if (var19 >= 3584) {
            return;
        }
        int var20 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var21 = var13 + var20 << 9;
        if (var21 / var18 <= class295.field4604) {
            return;
        }
        int var22 = var20 - var13 << 9;
        if (var22 / var18 >= class310.field4792) {
            return;
        }
        int var23 = arg2 * arg6 - arg1 * var16 >> 16;
        int var24 = (arg1 * var13 + arg2 * var15 >> 16) + var23 << 9;
        if (var24 / var18 <= class232.field3388) {
            return;
        }
        int var25 = (-var13 * arg1 + arg2 * var14 >> 16) + var23 << 9;
        if (var25 / var18 >= class72.field918) {
            return;
        }
        int var26 = 0;
        int var27 = 0;
        if (arg0 != 0) {
            var26 = class215.field3024[arg0];
            var27 = class215.field3017[arg0];
        }
        if (arg8 > 0L && class31.field395 && var19 > 0) {
            int var28;
            int var29;
            if (var20 > 0) {
                var28 = var22 / var18;
                var29 = var21 / var19;
            } else {
                var28 = var22 / var19;
                var29 = var21 / var18;
            }
            int var30;
            int var31;
            if (var23 > 0) {
                var30 = var25 / var18;
                var31 = var24 / var19;
            } else {
                var30 = var25 / var19;
                var31 = var24 / var18;
            }
            if (class3.field42 >= var28 && class3.field42 <= var29 && class117.field1654 >= var30 && class117.field1654 <= var31) {
                int var32 = 999999;
                int var33 = -999999;
                int var34 = 999999;
                int var35 = -999999;
                short var36 = this.field1430.field2161;
                short var37 = this.field1430.field2157;
                short var38 = this.field1430.field2156;
                short var39 = this.field1430.field2162;
                int[] var40 = new int[] { var36, var37, var36, var37, var36, var37, var36, var37 };
                int[] var41 = new int[] { var38, var38, var39, var39, var38, var38, var39, var39 };
                int[] var42 = new int[] { var14, var14, var14, var14, var15, var15, var15, var15 };
                for (int var43 = 0; var43 < 8; var43++) {
                    int var44 = var40[var43];
                    int var45 = var42[var43];
                    int var46 = var41[var43];
                    if (arg0 != 0) {
                        int var47 = var26 * var46 + var27 * var44 >> 16;
                        var46 = var27 * var46 - var26 * var44 >> 16;
                        var44 = var47;
                    }
                    int var48 = arg5 + var44;
                    int var49 = arg6 + var45;
                    int var50 = arg7 + var46;
                    int var51 = arg3 * var50 + arg4 * var48 >> 16;
                    int var52 = arg4 * var50 - arg3 * var48 >> 16;
                    int var54 = arg2 * var49 - arg1 * var52 >> 16;
                    int var55 = arg1 * var49 + arg2 * var52 >> 16;
                    if (var55 > 0) {
                        int var57 = (var51 << 9) / var55;
                        int var58 = (var54 << 9) / var55;
                        if (var57 < var32) {
                            var32 = var57;
                        }
                        if (var57 > var33) {
                            var33 = var57;
                        }
                        if (var58 < var34) {
                            var34 = var58;
                        }
                        if (var58 > var35) {
                            var35 = var58;
                        }
                    }
                }
                if (class3.field42 >= var32 && class3.field42 <= var33 && class117.field1654 >= var34 && class117.field1654 <= var35) {
                    if (this.field2845) {
                        class94.field1234[class239.field3584++] = arg8;
                    } else {
                        if (field1477.length < this.field1453) {
                            field1477 = new int[this.field1453];
                            field1482 = new int[this.field1453];
                        }
                        int var59 = 0;
                        label118: while (true) {
                            if (var59 >= this.field1466) {
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= this.field1454) {
                                        break label118;
                                    }
                                    short var80 = this.field1437[var79];
                                    short var81 = this.field1451[var79];
                                    short var82 = this.field1449[var79];
                                    if (this.method731(class3.field42, class117.field1654, field1482[var80], field1482[var81], field1482[var82], field1477[var80], field1477[var81], field1477[var82])) {
                                        class94.field1234[class239.field3584++] = arg8;
                                        break label118;
                                    }
                                    var79++;
                                }
                            }
                            int var60 = this.field1461[var59];
                            int var61 = this.field1427[var59];
                            int var62 = this.field1450[var59];
                            if (arg0 != 0) {
                                int var63 = var26 * var62 + var27 * var60 >> 16;
                                var62 = var27 * var62 - var26 * var60 >> 16;
                                var60 = var63;
                            }
                            int var64 = arg5 + var60;
                            int var65 = arg6 + var61;
                            int var66 = arg7 + var62;
                            int var67 = arg3 * var66 + arg4 * var64 >> 16;
                            int var68 = arg4 * var66 - arg3 * var64 >> 16;
                            int var70 = arg2 * var65 - arg1 * var68 >> 16;
                            int var71 = arg1 * var65 + arg2 * var68 >> 16;
                            if (var71 < 50) {
                                break;
                            }
                            int var73 = (var67 << 9) / var71;
                            int var74 = (var70 << 9) / var71;
                            int var75 = this.field1465[var59];
                            int var76 = this.field1465[var59 + 1];
                            for (int var77 = var75; var77 < var76; var77++) {
                                int var78 = this.field1459[var77] - 1;
                                if (var78 == -1) {
                                    break;
                                }
                                field1477[var78] = var73;
                                field1482[var78] = var74;
                            }
                            var59++;
                        }
                    }
                }
            }
        }
        GL var83 = class250.field3818;
        var83.glPushMatrix();
        var83.glTranslatef((float) arg5, (float) arg6, (float) arg7);
        var83.glRotatef((float) arg0 * 0.17578125F, 0.0F, 1.0F, 0.0F);
        this.method714();
        var83.glPopMatrix();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII[FIFFF)V", line = 4381)
    private static final void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11) {
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
        field1479 = var18;
        field1476 = var19;
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V", line = 4461)
    public final void method738() {
        for (int var1 = 0; var1 < this.field1442; var1++) {
            int var2 = this.field1461[var1];
            this.field1461[var1] = this.field1450[var1];
            this.field1450[var1] = -var2;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lpn;IJIIIIFF)S", line = 4479)
    private final short method739(class207 arg0, int arg1, long arg2, int arg3, int arg4, int arg5, int arg6, float arg7, float arg8) {
        int var11 = this.field1465[arg1];
        int var12 = this.field1465[arg1 + 1];
        int var13 = 0;
        for (int var14 = var11; var14 < var12; var14++) {
            short var15 = this.field1459[var14];
            if (var15 == 0) {
                var13 = var14;
                break;
            }
            if (field1463[var14] == arg2) {
                return (short) (var15 - 1);
            }
        }
        this.field1459[var13] = (short) (this.field1453 + 1);
        field1463[var13] = arg2;
        this.field1433[this.field1453] = (short) arg3;
        this.field1458[this.field1453] = (short) arg4;
        this.field1428[this.field1453] = (short) arg5;
        this.field1455[this.field1453] = (short) arg6;
        this.field1457[this.field1453] = arg7;
        this.field1432[this.field1453] = arg8;
        return (short) (this.field1453++);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V", line = 4516)
    public final void method740(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1442; var4++) {
            this.field1461[var4] = this.field1461[var4] * arg0 >> 7;
            this.field1427[var4] = this.field1427[var4] * arg1 >> 7;
            this.field1450[var4] = this.field1450[var4] * arg2 >> 7;
        }
        this.field1430.field2160 = false;
        this.field1426.field3109 = false;
    }
}
