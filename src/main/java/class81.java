import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 extends class100 {

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "Z")
    private boolean field1416 = false;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "Z")
    public boolean field1432 = false;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    private int field1428 = 0;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "Lcc;")
    public class122 field1414;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Lgh;")
    public class345 field1413;

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "J")
    private long field1421;

    @OriginalMember(owner = "client!ld", name = "B", descriptor = "Lvj;")
    public class153 field1418;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lik;")
    public class78 field1405;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field1426 = 1337;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Z")
    public static boolean field1420 = false;

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lbu;")
    public static class407 field1408 = new class407(512);

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "Lvv;")
    public static class313 field1440 = new class313(0, -2);

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public int field1402;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!ld", name = "G", descriptor = "I")
    private int field1423;

    @OriginalMember(owner = "client!ld", name = "H", descriptor = "I")
    private int field1424;

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
    private int field1427;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public int field1430;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    private int field1433;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    private int field1434;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    private int field1435;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    private int field1436;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    private int field1437;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Lza;")
    public static class491 field1439;

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lqs;")
    public static class496 field1407;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;ILjava/lang/String;)V")
    public static final void method588(String arg0, int arg1, byte arg2, String arg3, int arg4, String arg5) {
        if (arg2 == 98) {
            field1417++;
            class75.method534(null, arg1, true, arg3, arg0, arg4, -1, arg5);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V")
    public static void method589(int arg0) {
        if (arg0 >= -84) {
            method588(null, -91, (byte) 80, null, -47, null);
        }
        field1439 = null;
        field1408 = null;
        field1407 = null;
        field1440 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BJ)V")
    public final void method590(byte arg0, long arg1) {
        field1438++;
        for (class185 var4 = (class185) this.field1405.method573(24037); var4 != null; var4 = (class185) this.field1405.method576(14)) {
            var4.method1256(arg1);
        }
        if (arg0 != 88) {
            this.field1413 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(Z)V")
    public final void method591(boolean arg0) {
        this.field1436 = this.field1413.field5423;
        this.field1411 = this.field1413.field5421;
        field1429++;
        this.field1415 = this.field1413.field5411;
        this.field1427 = this.field1413.field5405;
        if (!arg0) {
            method588(null, 56, (byte) -53, null, -15, null);
        }
        this.field1437 = this.field1413.field5412;
        this.field1403 = this.field1413.field5425;
        this.field1409 = this.field1413.field5409;
        this.field1422 = this.field1413.field5424;
        this.field1423 = this.field1413.field5416;
        if (this.field1423 == this.field1415 && this.field1423 == this.field1409 && this.field1436 == this.field1422 && this.field1437 == this.field1436 && this.field1427 == this.field1411 && this.field1411 == this.field1403) {
            this.field1416 = true;
            return;
        }
        this.field1416 = false;
        int var2 = (this.field1423 + this.field1415 + this.field1409) / 3;
        int var3 = (this.field1436 + this.field1422 + this.field1437) / 3;
        int var4 = (this.field1411 + this.field1403 + this.field1427) / 3;
        if (this.field1419 == var2 && this.field1425 == var3 && this.field1430 == var4) {
            return;
        }
        this.field1425 = var3;
        this.field1419 = var2;
        this.field1430 = var4;
        int var5 = this.field1423 - this.field1415;
        int var6 = this.field1436 - this.field1422;
        int var7 = this.field1411 - this.field1427;
        int var8 = this.field1409 - this.field1415;
        int var9 = this.field1437 - this.field1422;
        int var10 = this.field1403 - this.field1427;
        this.field1406 = var7 * var8 - (var5 * var10);
        this.field1434 = var5 * var9 - (var6 * var8);
        this.field1433 = var6 * var10 - (var7 * var9);
        while (this.field1433 > 32767 || this.field1406 > 32767 || this.field1434 > 32767 || this.field1433 < -32767 || this.field1406 < -32767 || this.field1434 < -32767) {
            this.field1406 >>= 0x1;
            this.field1433 >>= 0x1;
            this.field1434 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field1434 * this.field1434 + this.field1433 * this.field1433 + this.field1406 * this.field1406));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field1433 = this.field1433 * 32767 / var11;
        this.field1406 = this.field1406 * 32767 / var11;
        this.field1434 = this.field1434 * 32767 / var11;
        if (this.field1418.field2497 <= 0 && this.field1418.field2441 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field1434, (double) this.field1433) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field1406, Math.sqrt((double) (this.field1434 * this.field1434 + this.field1433 * this.field1433))) * 2607.5945876176133D);
        this.field1410 = this.field1418.field2497 - this.field1418.field2472;
        this.field1435 = this.field1418.field2441 - this.field1418.field2466;
        this.field1404 = this.field1418.field2472 + var12 - (this.field1410 >> 1);
        this.field1424 = this.field1418.field2466 + var13 - (this.field1435 >> 1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
    public static final int method592(int arg0, int arg1, int arg2, int arg3) {
        field1412++;
        if (class360.field5592 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class217.field3775 - 1 || var5 > (class277.field4548 - 1)) {
            return 0;
        }
        if (arg2 != 9251) {
            method592(118, 120, 78, -67);
        }
        int var6 = arg3;
        if (arg3 < 3 && (class192.field2982[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        return class360.field5592[var6].method1517(arg0, arg1);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(JLza;ZZI)V")
    public final void method593(long arg0, class491 arg1, boolean arg2, boolean arg3, int arg4) {
        if (this.field1432) {
            arg2 = false;
        } else if (class314.field4944 < this.field1418.field2451) {
            arg2 = false;
        } else if (class31.field496[class314.field4944] < class24.field373) {
            arg2 = false;
        } else if (this.field1416) {
            arg2 = false;
        } else if (this.field1418.field2434 != -1) {
            int var7 = (int) (arg0 - this.field1421);
            if (this.field1418.field2477 || var7 <= this.field1418.field2434) {
                var7 %= this.field1418.field2434;
            } else {
                arg2 = false;
            }
            if (!this.field1418.field2479 && var7 < this.field1418.field2490) {
                arg2 = false;
            }
            if (this.field1418.field2479 && var7 >= this.field1418.field2490) {
                arg2 = false;
            }
        }
        field1431++;
        if (arg2) {
            this.field1428 += (int) ((Math.random() * (double) (this.field1418.field2433 - this.field1418.field2480) + (double) this.field1418.field2480) * (double) arg4);
            if (this.field1428 > 63) {
                int var8 = this.field1428 >> 6;
                this.field1428 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1418.field2497 <= 0 && this.field1418.field2441 <= 0) {
                        var10 = this.field1433;
                        var11 = this.field1434;
                        var12 = this.field1406;
                    } else {
                        int var13 = this.field1404 + (int) (Math.random() * (double) this.field1410);
                        int var14 = var13 & 0x3FFF;
                        int var15 = class46.field757[var14];
                        int var16 = class46.field755[var14];
                        int var17 = this.field1424 + ((int) (Math.random() * (double) this.field1435));
                        int var18 = var17 & 0x1FFF;
                        int var19 = class46.field757[var18];
                        int var20 = class46.field755[var18];
                        byte var21 = 15;
                        var12 = (var20 << 0) * -1;
                        var10 = var16 * var19 >> var21;
                        var11 = var15 * var19 >> var21;
                    }
                    int var22 = (int) (Math.random() * 65535.0D);
                    int var23 = (int) (Math.random() * 65535.0D);
                    if (var22 + var23 > 65535) {
                        var22 = 65535 - var22;
                        var23 = 65535 - var23;
                    }
                    int var24 = 65535 - var22 - var23;
                    int var25 = (int) ((long) this.field1423 * (long) var23 + ((long) this.field1415 * (long) var22 + ((long) this.field1409 * (long) var24)) >> 16);
                    int var26 = (int) ((long) this.field1422 * (long) var22 + (long) this.field1437 * (long) var24 + (long) this.field1436 * (long) var23 >> 16);
                    int var27 = (int) ((long) this.field1427 * (long) var22 - (-((long) this.field1411 * (long) var23) - ((long) this.field1403 * (long) var24)) >> 16);
                    int var28 = (int) (Math.random() * (double) (this.field1418.field2489 - this.field1418.field2486)) + this.field1418.field2486;
                    int var29 = this.field1418.field2446 + (int) (Math.random() * (double) (this.field1418.field2468 - this.field1418.field2446));
                    int var30 = this.field1418.field2465 + ((int) ((double) (this.field1418.field2440 - this.field1418.field2465) * Math.random()));
                    int var31;
                    if (this.field1418.field2473) {
                        double var32 = Math.random();
                        var31 = (int) (Math.random() * (double) this.field1418.field2455 + (double) this.field1418.field2476) << 24 | (int) ((double) this.field1418.field2437 * var32 + (double) this.field1418.field2456) << 8 | (int) ((double) this.field1418.field2449 * var32 + (double) this.field1418.field2450) << 16 | (int) ((double) this.field1418.field2464 * var32 + (double) this.field1418.field2496);
                    } else {
                        var31 = (int) ((double) this.field1418.field2449 * Math.random() + (double) this.field1418.field2450) << 16 | (int) ((double) this.field1418.field2456 + Math.random() * (double) this.field1418.field2437) << 8 | (int) ((double) this.field1418.field2496 + (double) this.field1418.field2464 * Math.random()) | (int) ((double) this.field1418.field2476 + Math.random() * (double) this.field1418.field2455) << 24;
                    }
                    int var34 = this.field1418.field2443;
                    if (!arg1.method827() && !this.field1418.field2491) {
                        var34 = -1;
                    }
                    if (class74.field1267 == class439.field6563) {
                        new class185(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field1418.field2457, this.field1418.field2492);
                    } else {
                        class185 var36 = class219.field3791[class439.field6563];
                        class439.field6563 = class439.field6563 + 1 & 0x3FF;
                        var36.method1258(this, var25, var26, var27, var10, var12, var11, var28, var29, var31, var30, var34, this.field1418.field2457, this.field1418.field2492);
                    }
                }
            }
        }
        if (!arg3) {
            this.field1411 = 98;
        }
        this.field1402 = 0;
        for (class185 var37 = (class185) this.field1405.method573(24037); var37 != null; var37 = (class185) this.field1405.method576(14)) {
            var37.method1259(arg0, arg4);
            this.field1402++;
        }
        class10.field100 += this.field1402;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lza;Lgh;Lcc;J)V")
    public class81(class491 arg0, class345 arg1, class122 arg2, long arg3) {
        this.field1414 = arg2;
        this.field1413 = arg1;
        this.field1421 = arg3;
        this.field1418 = this.field1413.method2227(-85);
        if (!arg0.method827() && this.field1418.field2482 != -1) {
            this.field1418 = class445.method2675(this.field1418.field2482, true);
        }
        this.field1405 = new class78();
        this.field1428 = (int) ((double) this.field1428 + Math.random() * 64.0D);
        this.method591(true);
    }
}
