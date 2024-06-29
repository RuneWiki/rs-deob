import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class101 extends class264 {

    @OriginalMember(owner = "client!cl", name = "u", descriptor = "Z")
    private boolean field1341 = false;

    @OriginalMember(owner = "client!cl", name = "O", descriptor = "I")
    private int field1361 = 0;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    private int field1346 = 0;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    private int field1353 = -32768;

    @OriginalMember(owner = "client!cl", name = "S", descriptor = "I")
    private int field1365 = -1;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!cl", name = "Q", descriptor = "I")
    private int field1363;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    private int field1335;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
    public int field1334;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!cl", name = "T", descriptor = "I")
    private int field1366;

    @OriginalMember(owner = "client!cl", name = "Y", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public int field1343;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    private int field1337;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!cl", name = "P", descriptor = "Lq;")
    private class165 field1362;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field1344 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "Lte;")
    public static class244 field1338 = new class244(50);

    @OriginalMember(owner = "client!cl", name = "M", descriptor = "S")
    public static short field1359 = 320;

    @OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!cl", name = "U", descriptor = "Z")
    public static boolean field1367 = false;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "D")
    private double field1329;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "D")
    public double field1333;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "D")
    public double field1336;

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "D")
    private double field1340;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "D")
    private double field1352;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "D")
    private double field1358;

    @OriginalMember(owner = "client!cl", name = "N", descriptor = "D")
    private double field1360;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "D")
    public double field1369;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    private int field1330;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public int field1350;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!cl", name = "R", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!cl", name = "X", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "Leh;")
    public static class137 field1357;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "Lt;")
    private class268 field1339;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIIIJILt;)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class268 arg10) {
        field1364++;
        class158 var13 = this.method619(-1);
        if (var13 != null) {
            var13.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1339);
            this.field1353 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
    public static final void method615(int arg0) {
        field1349++;
        if (class9.field112 == -1 || class182.field2892 == -1) {
            return;
        }
        if (arg0 != -5580) {
            method616((byte) 41);
        }
        int var1 = ((class225.field3622 - class278.field4429) * class207.field3317 >> 16) + class278.field4429;
        class207.field3317 += var1;
        if (class207.field3317 < 65535) {
            class266.field4280 = false;
            class117.field1665 = false;
        } else {
            if (class266.field4280) {
                class117.field1665 = false;
            } else {
                class117.field1665 = true;
            }
            class266.field4280 = true;
            class207.field3317 = 65535;
        }
        float var2 = (float) class207.field3317 / 65535.0F;
        int var3 = class251.field4099 * 2;
        float[] var4 = new float[3];
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class56.field725[class9.field112][var3][var5] * 3;
            int var22 = class56.field725[class9.field112][var3 + 1][var5] * 3;
            int var23 = (class56.field725[class9.field112][var3 + 2][var5] - (class56.field725[class9.field112][var3 + 3][var5] - class56.field725[class9.field112][var3 + 2][var5])) * 3;
            int var24 = class56.field725[class9.field112][var3][var5];
            int var25 = var22 - var21;
            int var26 = var21 - (var22 * 2 - var23);
            int var27 = class56.field725[class9.field112][var3 + 2][var5] + var22 - var24 - var23;
            var4[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class36.field465 = (int) var4[2] - (class181.field2883 * 128);
        class252.field4114 = (int) var4[1] * -1;
        int var6 = class275.field4394 * 2;
        float[] var7 = new float[3];
        class74.field932 = (int) var4[0] - class167.field2683 * 128;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class56.field725[class182.field2892][var6][var8] * 3;
            int var15 = class56.field725[class182.field2892][var6 + 1][var8] * 3;
            int var16 = (class56.field725[class182.field2892][var6 + 2][var8] + class56.field725[class182.field2892][var6 + 2][var8] - class56.field725[class182.field2892][var6 + 3][var8]) * 3;
            int var17 = var14 + var16 - (var15 * 2);
            int var18 = var15 - var14;
            int var19 = class56.field725[class182.field2892][var6][var8];
            int var20 = class56.field725[class182.field2892][var6 + 2][var8] - (var16 - var15) - var19;
            var7[var8] = (((float) var20 * var2 + (float) var17) * var2 + (float) var18) * var2 + (float) var19;
        }
        float var9 = (var7[1] - var4[1]) * -1.0F;
        float var10 = var7[0] - var4[0];
        float var11 = var7[2] - var4[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class265.field4269 = (float) Math.atan2((double) var9, var12);
        class282.field4492 = -((float) Math.atan2((double) var10, (double) var11));
        class242.field3986 = (int) ((double) class265.field4269 * 325.949D) & 0x7FF;
        class23.field311 = (int) ((double) class282.field4492 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I")
    public final int method102() {
        field1342++;
        return this.field1353;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static final void method616(byte arg0) {
        class62.method362(-14);
        field1332++;
        class179.method1250((byte) 22);
        class208.method1460(arg0 ^ 0x22);
        class30.method172(arg0 - 111);
        class66.method381(false);
        class263.method1780((byte) -66);
        class218.method1544((byte) 112);
        class207.method1457(102);
        class258.method1765(-1129);
        class8.method41((byte) 78);
        class112.method721(arg0 - 59);
        class53.method304((byte) -65);
        class78.method437((byte) 114);
        class126.method858((byte) -122);
        class105.method639(arg0 ^ 0x796);
        class182.method1268(1);
        class204.method1413(-76);
        class239.method1686(108);
        if (class285.field4544 != 0) {
            for (int var1 = 0; var1 < class165.field2645.length; var1++) {
                class165.field2645[var1] = null;
            }
            class186.field2972 = 0;
        }
        class2.method10((byte) -90);
        if (arg0 != 59) {
            field1359 = 66;
        }
        class212.method1491(false);
        class253.field4118.method1699(0);
        ((class119) class174.field2756).method767(-99);
        class14.field175.method1466((byte) 98);
        class238.field3935.method933(-7602);
        field1357.method933(arg0 ^ 0xFFFFE275);
        class14.field182.method933(-7602);
        class219.field3511.method933(-7602);
        class137.field2191.method933(arg0 - 7661);
        class182.field2897.method933(-7602);
        class82.field1010.method933(-7602);
        class147.field2302.method933(-7602);
        class253.field4117.method933(arg0 - 7661);
        class225.field3624.method933(-7602);
        class210.field3375.method933(-7602);
        class104.field1401.method1699(0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V")
    public final void method617(int arg0, byte arg1) {
        this.field1369 += (double) arg0 * this.field1360;
        field1356++;
        this.field1336 += (double) arg0 * this.field1329;
        if (arg1 <= 106) {
            this.method619(16);
        }
        this.field1341 = true;
        if (this.field1337 == -1) {
            this.field1333 += (double) arg0 * this.field1358;
        } else {
            this.field1333 += this.field1352 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field1358;
            this.field1358 += (double) arg0 * this.field1352;
        }
        this.field1350 = (int) (Math.atan2(this.field1329, this.field1360) * 325.949D) + 1024 & 0x7FF;
        this.field1330 = (int) (Math.atan2(this.field1358, this.field1340) * 325.949D) & 0x7FF;
        if (this.field1362 == null) {
            return;
        }
        this.field1361 += arg0;
        while (true) {
            do {
                do {
                    if (this.field1361 <= this.field1362.field2634[this.field1346]) {
                        return;
                    }
                    this.field1361 -= this.field1362.field2634[this.field1346];
                    this.field1346++;
                    if (this.field1346 >= this.field1362.field2624.length) {
                        this.field1346 -= this.field1362.field2642;
                        if (this.field1346 < 0 || this.field1346 >= this.field1362.field2624.length) {
                            this.field1346 = 0;
                        }
                    }
                    this.field1365 = this.field1346 + 1;
                } while (this.field1362.field2624.length > this.field1365);
                this.field1365 -= this.field1362.field2642;
            } while (this.field1365 >= 0 && this.field1365 < this.field1362.field2624.length);
            this.field1365 = -1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1357 = null;
        field1338 = null;
        if (arg0 <= 111) {
            method618(-115);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1347++;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)Lwl;")
    private final class158 method619(int arg0) {
        field1370++;
        class98 var2 = class79.method440(this.field1366, (byte) 14);
        class158 var3 = var2.method611(this.field1365, 13294, this.field1361, this.field1346);
        if (var3 == null) {
            return null;
        } else if (arg0 == -1) {
            var3.method820(this.field1330);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIB)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (!this.field1341) {
            double var6 = (double) (arg1 - this.field1351);
            double var8 = (double) (arg3 - this.field1335);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field1333 = (double) this.field1354;
            this.field1369 = (double) this.field1363 * var8 / var10 + (double) this.field1335;
            this.field1336 = (double) this.field1363 * var6 / var10 + (double) this.field1351;
        }
        if (arg4 < 52) {
            this.method620(-50, 81, 115, -16, (byte) -125);
        }
        double var12 = (double) (this.field1345 + 1 - arg0);
        field1348++;
        this.field1360 = ((double) arg3 - this.field1369) / var12;
        this.field1329 = ((double) arg1 - this.field1336) / var12;
        this.field1340 = Math.sqrt(this.field1360 * this.field1360 + this.field1329 * this.field1329);
        if (this.field1337 == -1) {
            this.field1358 = ((double) arg2 - this.field1333) / var12;
        } else {
            if (!this.field1341) {
                this.field1358 = -this.field1340 * Math.tan((double) this.field1337 * 0.02454369D);
            }
            this.field1352 = ((double) arg2 - this.field1333 - this.field1358 * var12) * 2.0D / (var12 * var12);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1351 = arg2;
        this.field1363 = arg8;
        this.field1335 = arg3;
        this.field1334 = arg9;
        this.field1354 = arg4;
        this.field1366 = arg0;
        this.field1371 = arg1;
        this.field1343 = arg5;
        this.field1345 = arg6;
        this.field1337 = arg7;
        this.field1331 = arg10;
        this.field1341 = false;
        int var12 = class79.method440(this.field1366, (byte) 14).field1318;
        if (var12 == -1) {
            this.field1362 = null;
        } else {
            this.field1362 = class208.method1458((byte) 91, var12);
        }
    }
}
