import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class207 extends class26 {

    @OriginalMember(owner = "client!i", name = "Pb", descriptor = "Lqd;")
    public static class40 field3298 = class147.method1106("leuchten1:", (byte) -109);

    @OriginalMember(owner = "client!i", name = "Rb", descriptor = "I")
    public static int field3300 = 0;

    @OriginalMember(owner = "client!i", name = "Tb", descriptor = "Lqd;")
    public static class40 field3302 = class147.method1106("M", (byte) -117);

    @OriginalMember(owner = "client!i", name = "Xb", descriptor = "Lqd;")
    private static class40 field3306 = class147.method1106("Loaded sprites", (byte) -72);

    @OriginalMember(owner = "client!i", name = "Yb", descriptor = "Lqd;")
    public static class40 field3307 = field3306;

    @OriginalMember(owner = "client!i", name = "ec", descriptor = "Lqd;")
    private static class40 field3313 = class147.method1106("flash2:", (byte) -84);

    @OriginalMember(owner = "client!i", name = "Ub", descriptor = "Lqd;")
    public static class40 field3303 = field3313;

    @OriginalMember(owner = "client!i", name = "fc", descriptor = "Lqd;")
    public static class40 field3314 = field3313;

    @OriginalMember(owner = "client!i", name = "bc", descriptor = "[I")
    public static int[] field3310 = new int[256];

    @OriginalMember(owner = "client!i", name = "Kb", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!i", name = "Mb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!i", name = "Nb", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!i", name = "Ob", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!i", name = "Qb", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!i", name = "Sb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!i", name = "Vb", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!i", name = "Wb", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!i", name = "Zb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!i", name = "cc", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!i", name = "dc", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!i", name = "gc", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!i", name = "hc", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!i", name = "Lb", descriptor = "Lla;")
    private class132 field3294;

    @OriginalMember(owner = "client!i", name = "ac", descriptor = "Z")
    public static boolean field3309;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(II)I", line = 4)
    public final int method1456(int arg0, int arg1) {
        if (arg1 != 128) {
            this.method1457(-96);
        }
        field3316++;
        return arg0 * 8 - this.field3312;
    }

    @OriginalMember(owner = "client!i", name = "t", descriptor = "(I)I", line = 16)
    public final int method1457(int arg0) {
        field3311++;
        if (arg0 != 255) {
            this.method1466(-96, 37);
        }
        return this.field472[this.field478++] - this.field3294.method977(101) & 0xFF;
    }

    @OriginalMember(owner = "client!i", name = "j", descriptor = "(B)V", line = 29)
    public final void method1458(byte arg0) {
        field3301++;
        if (arg0 <= -10) {
            this.field3312 = this.field478 * 8;
        }
    }

    @OriginalMember(owner = "client!i", name = "u", descriptor = "(I)V", line = 57)
    public final void method1459(int arg0) {
        field3305++;
        if (arg0 != 128) {
            this.method1458((byte) 78);
        }
        this.field478 = (this.field3312 + 7) / 8;
    }

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(B)V", line = 68)
    public static void method1460(byte arg0) {
        field3313 = null;
        field3298 = null;
        field3302 = null;
        int var1 = -128 % ((-arg0 - 23) / 63);
        field3310 = null;
        field3303 = null;
        field3314 = null;
        field3307 = null;
        field3306 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lbb;B)V", line = 97)
    public static final void method1461(class86 arg0, byte arg1) {
        if (class256.field4266 == arg0.field1488 || arg0.field1519 == -1 || arg0.field1529 != 0 || arg0.field1546 + 1 > class20.method128(125, arg0.field1519).field5033[arg0.field1534]) {
            int var2 = class256.field4266 - arg0.field1505;
            int var3 = arg0.field1488 - arg0.field1505;
            int var4 = arg0.field1518 * 128 + (arg0.method666(24207) * 64);
            int var5 = arg0.field1536 * 128 + arg0.method666(24207) * 64;
            int var6 = arg0.field1494 * 128 + (arg0.method666(24207) * 64);
            int var7 = arg0.field1484 * 128 + (arg0.method666(24207) * 64);
            arg0.field1497 = ((var3 - var2) * var5 + var2 * var7) / var3;
            arg0.field1531 = ((var3 - var2) * var4 + var2 * var6) / var3;
        }
        field3296++;
        arg0.field1524 = 0;
        if (arg0.field1493 == 0) {
            arg0.field1521 = 1024;
        }
        if (arg0.field1493 == 1) {
            arg0.field1521 = 1536;
        }
        if (arg0.field1493 == 2) {
            arg0.field1521 = 0;
        }
        if (arg0.field1493 == 3) {
            arg0.field1521 = 512;
        }
        if (arg1 <= 11) {
            method1463(-81, (byte) -126);
        }
        arg0.field1507 = arg0.field1521;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([IB)V", line = 144)
    public final void method1462(int[] arg0, byte arg1) {
        this.field3294 = new class132(arg0);
        field3295++;
        int var3 = -47 % ((-arg1 - 18) / 42);
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(IB)V", line = 154)
    public static final void method1463(int arg0, byte arg1) {
        class19.method114((byte) -25);
        class133.method980((byte) -85);
        field3304++;
        if (arg1 < 64) {
            method1461((class86) null, (byte) 85);
        }
        int var2 = class62.method514(arg0, 16).field3587;
        if (var2 == 0) {
            return;
        }
        int var3 = class192.field3098[arg0];
        if (var2 == 6) {
            class163.field2706 = var3;
        }
        if (var2 == 5) {
            class246.field4073 = var3;
        }
        if (var2 == 9) {
            class90.field1642 = var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(II)V", line = 186)
    public final void method1464(int arg0, int arg1) {
        field3315++;
        this.field472[this.field478++] = (byte) (arg0 + this.field3294.method977(67));
        if (arg1 != 0) {
            field3302 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([Lrb;II)V", line = 199)
    public static final void method1465(class213[] arg0, int arg1, int arg2) {
        if (arg1 != 13802) {
            method1460((byte) 118);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class213 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3525 == 0) {
                    if (var4.field3415 != null) {
                        method1465(var4.field3415, 13802, arg2);
                    }
                    class297 var5 = (class297) class165.field2731.method1405((byte) 115, (long) var4.field3507);
                    if (var5 != null) {
                        class168.method1253(arg1 - 25694, arg2, var5.field4959);
                    }
                }
                if (arg2 == 0 && var4.field3479 != null) {
                    class109 var6 = new class109();
                    var6.field1908 = var4.field3479;
                    var6.field1910 = var4;
                    class121.method912(var6, 112);
                }
                if (arg2 == 1 && var4.field3436 != null) {
                    if (var4.field3494 >= 0) {
                        class213 var7 = class314.method2172((byte) 24, var4.field3507);
                        if (var7 == null || var7.field3415 == null || var4.field3494 >= var7.field3415.length || var7.field3415[var4.field3494] != var4) {
                            continue;
                        }
                    }
                    class109 var8 = new class109();
                    var8.field1910 = var4;
                    var8.field1908 = var4.field3436;
                    class121.method912(var8, 62);
                }
            }
        }
        field3308++;
    }

    @OriginalMember(owner = "client!i", name = "m", descriptor = "(II)I", line = 267)
    public final int method1466(int arg0, int arg1) {
        field3299++;
        int var3 = this.field3312 >> 3;
        int var4 = 8 - (this.field3312 & 0x7);
        if (arg0 != -5582) {
            this.method1459(40);
        }
        this.field3312 += arg1;
        int var5 = 0;
        while (var4 < arg1) {
            var5 += (this.field472[var3++] & class225.field3720[var4]) << arg1 - var4;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg1 == var4) {
            var6 = (class225.field3720[var4] & this.field472[var3]) + var5;
        } else {
            var6 = (this.field472[var3] >> var4 - arg1 & class225.field3720[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[B)V", line = 307)
    public final void method1467(int arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = arg1; var5 < arg2; var5++) {
            arg3[arg0 + var5] = (byte) (this.field472[this.field478++] - this.field3294.method977(125));
        }
        field3293++;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 334)
    public class207(int arg0) {
        super(arg0);
    }
}
