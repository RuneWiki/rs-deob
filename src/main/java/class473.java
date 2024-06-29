import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class473 implements class449 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lcv;")
    private class398 field6963 = new class398(128);

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[I")
    private int[] field6969 = new int[class85.field1409.field1489];

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
    public int[] field6971 = new int[class85.field1409.field1489];

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field6967;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field6968;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
    public static final void method2825(int arg0, int arg1) {
        field6970++;
        if (~class43.field655 == arg1) {
            class23.field420.method2126((byte) -117, arg0);
        } else {
            class459.field6777 = arg0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)I")
    public final int method2826(int arg0, boolean arg1) {
        field6967++;
        long var3 = class464.method2773((byte) 103);
        class307 var5 = arg1 ? (class307) this.field6963.method2483(116) : (class307) this.field6963.method2481((byte) -27);
        int var6 = 42 % ((-arg0 - 16) / 61);
        while (var5 != null) {
            if (var3 > (var5.field4381 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field4381 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var5.field6399;
                    this.field6971[var7] = this.field6969[var7];
                    var5.method2663(-111);
                    return var7;
                }
                var5.method2663(-116);
            }
            var5 = (class307) this.field6963.method2481((byte) -27);
        }
        return -1;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(ZI)I")
    public final int method2709(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2828((byte) 23, 124, 10);
        }
        field6975++;
        return this.field6971[arg1];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
    public final void method2827(int arg0, int arg1, int arg2) {
        field6972++;
        if (arg0 != -31366) {
            return;
        }
        this.field6969[arg1] = arg2;
        class307 var4 = (class307) this.field6963.method2485(91, (long) arg1);
        if (var4 == null) {
            class307 var5 = new class307(4611686018427387905L);
            this.field6963.method2486(arg0 ^ 0xFFFF8524, var5, (long) arg1);
        } else if (var4.field4381 != 4611686018427387905L) {
            var4.field4381 = class464.method2773((byte) 103) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BII)V")
    public final void method2828(byte arg0, int arg1, int arg2) {
        field6962++;
        if (arg0 < 89) {
            this.method2827(-81, 110, 4);
        }
        class51 var4 = class369.field5528.method725(arg1, -102);
        int var5 = var4.field743;
        int var6 = var4.field745;
        int var7 = var4.field742;
        int var8 = class348.field5267[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2827(-31366, var5, var9 & arg2 << var6 | ~var9 & this.field6969[var5]);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILqf;)V")
    public static final void method2829(int arg0, class477 arg1) {
        arg1.method2857(arg0 - 9788);
        field6965++;
        int var2 = class64.field1128;
        class62 var3 = class95.field1558 = class390.field5783[var2] = new class62();
        var3.field331 = var2;
        int var4 = arg1.method2847(115, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field409[0] = var6 - class483.field7082;
        int var7 = var4 & 0x3FFF;
        var3.field5529 = (var3.field409[0] << 7) + (var3.method184(1) << 6);
        var3.field416[0] = var7 - class465.field6840;
        var3.field5539 = (var3.field416[0] << 7) + (var3.method184(arg0 + 8513) << 6);
        class434.field6317 = var3.field5538 = var5;
        if (class253.field3640[var2] != null) {
            var3.method558(false, class253.field3640[var2]);
        }
        class333.field5117 = 0;
        class459.field6766[class333.field5117++] = var2;
        class457.field6753[var2] = 0;
        class326.field5036 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2847(-83, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFF6) >> 8;
                int var12 = var9 & 0xFF;
                class417 var13 = class518.field7618[var8] = new class417();
                var13.field6166 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6160 = 0;
                var13.field6162 = false;
                var13.field6158 = -1;
                class442.field6486[class326.field5036++] = var8;
                class457.field6753[var8] = 0;
            }
        }
        arg1.method2849(82);
        if (arg0 == -8512) {
            ;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public final void method2830(boolean arg0) {
        if (!arg0) {
            this.method2830(true);
        }
        for (int var2 = 0; var2 < class85.field1409.field1489; var2++) {
            class290 var3 = class85.field1409.method728(var2, 58);
            if (var3 != null && var3.field4164 == 0) {
                this.field6969[var2] = 0;
                this.field6971[var2] = 0;
            }
        }
        field6966++;
        this.field6963 = new class398(128);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    public static final void method2831(boolean arg0) {
        class240.field3496 = arg0;
        field6974++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)I")
    public final int method2708(boolean arg0, int arg1) {
        if (!arg0) {
            this.method2708(true, 119);
        }
        field6977++;
        class51 var3 = class369.field5528.method725(arg1, -97);
        int var4 = var3.field743;
        int var5 = var3.field745;
        int var6 = var3.field742;
        int var7 = class348.field5267[var6 - var5];
        return var7 & this.field6971[var4] >> var5;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)V")
    public final void method2832(int arg0, int arg1, int arg2) {
        field6976++;
        class51 var4 = class369.field5528.method725(arg1, arg0 ^ 0xFFFFFF8A);
        int var5 = var4.field743;
        int var6 = var4.field745;
        int var7 = var4.field742;
        int var8 = class348.field5267[var7 - var6];
        if (arg0 > arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method2835(var5, (byte) 32, ~var9 & this.field6971[var5] | var9 & arg2 << var6);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILqa;ILm;III)V")
    public static final void method2833(int arg0, class162 arg1, int arg2, class126 arg3, int arg4, int arg5, int arg6) {
        field6964++;
        if (class73.field1229 < 100) {
            class62.method548(1073741824, arg1, arg3);
        }
        arg1.method509(arg6, arg4, arg5 + arg6, arg2 + arg4);
        if (class73.field1229 < 100) {
            byte var7 = 20;
            int var8 = arg6 + (arg5 / 2);
            arg1.method471(arg6, arg4, arg5, arg2, -16777216, 0);
            int var9 = arg2 / 2 + arg4 - var7 - 18;
            arg1.method516(var8 - 152, var9, 304, 34, class162.field2446[class192.field2821].getRGB(), 0);
            arg1.method471(var8 - 150, var9 + 2, class73.field1229 * 3, 30, class203.field2936[class192.field2821].getRGB(), 0);
            class526.field7731.method2913(class112.field1779[class192.field2821].getRGB(), var7 + var9, -1, var8, class193.field2835.method1273(true, class370.field5530), (byte) 119);
            return;
        }
        int var10 = class25.field439 - ((int) ((float) arg5 / class2.field29));
        int var11 = (int) ((float) arg2 / class2.field29) + class33.field522;
        int var12 = (int) ((float) arg5 / class2.field29) + class25.field439;
        class474.field6981 = class25.field439 - (int) ((float) arg5 / class2.field29);
        class165.field2479 = (int) ((float) (arg2 * 2) / class2.field29);
        class177.field2681 = (int) ((float) (arg5 * 2) / class2.field29);
        int var13 = class33.field522 - ((int) ((float) arg2 / class2.field29));
        class207.field2971 = class33.field522 - (int) ((float) arg2 / class2.field29);
        class2.method11(var10 + class2.field44, class2.field40 + var11, class2.field44 + var12, class2.field40 + var13, arg6, arg4, arg5 + arg6, arg4 - -arg2 + 1);
        class2.method29(arg1);
        if (arg0 != -25228) {
            field6978 = 106;
        }
        class348 var14 = class2.method30(arg1);
        class400.method2493((byte) 117, arg1, var14, 0, 0);
        if (class410.field6034 > 0) {
            class421.field6199--;
            if (class421.field6199 == 0) {
                class410.field6034--;
                class421.field6199 = 20;
            }
        }
        if (!class183.field2754) {
            return;
        }
        int var15 = arg6 + arg5 - 5;
        int var16 = arg2 + arg4 - 8;
        class55.field808.method2914(var16, -121, -1, var15, 16776960, "Fps:" + class285.field4133);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class55.field808.method2914(var20, -122, -1, var15, var19, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method2834(int arg0, Object arg1, boolean arg2) {
        field6968++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class90.method735((byte) -105, var3) : var3;
        } else if (arg1 instanceof class383) {
            class383 var4 = (class383) arg1;
            return var4.method1860(-17);
        } else if (arg0 == 22819) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBI)V")
    public final void method2835(int arg0, byte arg1, int arg2) {
        field6973++;
        if (arg1 != 32) {
            field6978 = 59;
        }
        this.field6971[arg0] = arg2;
        class307 var4 = (class307) this.field6963.method2485(44, (long) arg0);
        if (var4 == null) {
            class307 var5 = new class307(class464.method2773((byte) 103) + 500L);
            this.field6963.method2486(arg1 ^ 0xFFFFFFB6, var5, (long) arg0);
        } else {
            var4.field4381 = class464.method2773((byte) 103) + 500L;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILqa;IZIIIIILdn;IIIILc;)Lc;")
    public static final class121 method2836(int arg0, class162 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class357 arg9, int arg10, int arg11, int arg12, int arg13, class121 arg14) {
        field6961++;
        if (arg14 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg9 != null) {
            int var16 = var15 | arg9.method2303(1024, -1, false, arg11);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg13 << 48) + (long) ((arg12 << 24) + (arg6 << 16) + arg8) + ((long) arg7 << 32);
        class364 var19 = class510.field7486;
        class121 var20;
        synchronized (class510.field7486) {
            var20 = (class121) class510.field7486.method2339(-97, var17);
        }
        if (var20 == null || arg1.method518(var20.method915(), var15) != 0) {
            if (var20 != null) {
                var15 = arg1.method472(var15, var20.method915());
            }
            byte var21;
            if (arg8 == 1) {
                var21 = 9;
            } else if (arg8 == 2) {
                var21 = 12;
            } else if (arg8 == 3) {
                var21 = 15;
            } else if (arg8 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class527 var24 = new class527(var21 * var22 + 1, var21 * 2 * var22 + -var21, 0);
            int var25 = var24.method3111(0, 0, arg2 - 767, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class324.field4966[var31] * var28 >> 15;
                    int var33 = class324.field4974[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method3111(var33, 0, 1, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg6 * var36 + arg12 * var35 >> 8);
                short var38 = (short) (((arg7 & 0x380) * var36 + (arg13 & 0x380) * var35 & 0x38000) + ((arg7 & 0x7F) * var36 + (arg13 & 0x7F) * var35 & 0x7F00) + ((arg7 & 0xFC00) * var36 + (arg13 & 0xFC00) * var35 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method3123(var25, (byte) 1, (byte) -1, (short) -1, arg2 ^ 0xFFFFFC96, var26[0][(var39 + 1) % var21], var26[0][var39], var37, var38);
                    } else {
                        var24.method3123(var26[var34 - 1][var39], (byte) 1, (byte) -1, (short) -1, -124, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21], var37, var38);
                        var24.method3123(var26[var34 - 1][var39], (byte) 1, (byte) -1, (short) -1, arg2 - 837, var26[var34][(var39 + 1) % var21], var26[var34][var39], var37, var38);
                    }
                }
            }
            var20 = arg1.method499(var24, var15, class285.field4131, 64, 768);
            class364 var40 = class510.field7486;
            synchronized (class510.field7486) {
                class510.field7486.method2342(var17, var20, arg2 - 878);
            }
        }
        if (arg2 != 768) {
            field6978 = -97;
        }
        int var41 = (arg8 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg3) {
            if (arg5 > 13312 || arg5 < 3072) {
                var43 -= 128;
            }
            if (arg5 > 9216 && arg5 < 15360) {
                var44 = var41 + 128;
            }
            if (arg5 > 5120 && arg5 < 11264) {
                var45 = var41 + 128;
            }
            if (arg5 > 1024 && arg5 < 7168) {
                var42 -= 128;
            }
        }
        int var46 = arg14.method876();
        int var47 = arg14.method908();
        int var48 = arg14.method888();
        if (var46 < var42) {
            var46 = var42;
        }
        if (var44 < var47) {
            var47 = var44;
        }
        if (var48 < var43) {
            var48 = var43;
        }
        int var49 = arg14.method896();
        if (var49 > var45) {
            var49 = var45;
        }
        class402 var50 = null;
        if (arg9 != null) {
            int var51 = arg9.field5395[arg11];
            var50 = class311.field4455.method1232((byte) -46, var51 >> 16);
            arg11 = var51 & 0xFFFF;
        }
        class121 var52;
        if (var50 == null) {
            var52 = var20.method881((byte) 3, var15, true);
            var52.method878(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method884(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method881((byte) 3, var15, true);
            var52.method878(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method884(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method902(arg2 ^ 0xFFFFFCFF, var50, arg11);
        }
        if (arg10 != 0) {
            var52.method886(arg10);
        }
        if (arg0 != 0) {
            var52.method895(arg0);
        }
        if (arg4 != 0) {
            var52.method884(0, arg4, 0);
        }
        return var52;
    }

    static {
        new class180("From", "Von:", "De", "De");
        field6978 = 0;
    }
}
