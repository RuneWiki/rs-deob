import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class100 extends class27 {

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "I")
    private int field1466 = 0;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Z")
    private boolean field1461 = false;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Z")
    public boolean field1479 = false;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "J")
    private long field1448;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "Lds;")
    public class227 field1463;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lha;")
    public class48 field1453;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "Lal;")
    public class370 field1480;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ltd;")
    public class107 field1462;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1446 = -1;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    private int field1454;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    private int field1456;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    private int field1458;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    private int field1465;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    private int field1467;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    private int field1468;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    private int field1470;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    private int field1475;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    private int field1476;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field1477;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field1483;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field1484;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Z")
    public static boolean field1443;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    public static int[] field1444;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZJLpe;)V", line = 8)
    public final void method850(int arg0, int arg1, boolean arg2, long arg3, class391 arg4) {
        if (this.field1479) {
            arg2 = false;
        } else if (this.field1480.field5086 > class445.field6399) {
            arg2 = false;
        } else if (class8.field73[class445.field6399] < class418.field5865) {
            arg2 = false;
        } else if (this.field1461) {
            arg2 = false;
        } else if (this.field1480.field5127 != -1) {
            int var7 = (int) (arg3 - this.field1448);
            if (this.field1480.field5084 || var7 <= this.field1480.field5127) {
                var7 %= this.field1480.field5127;
            } else {
                arg2 = false;
            }
            if (!this.field1480.field5107 && var7 < this.field1480.field5095) {
                arg2 = false;
            }
            if (this.field1480.field5107 && var7 >= this.field1480.field5095) {
                arg2 = false;
            }
        }
        field1474++;
        if (arg2) {
            this.field1466 += (int) ((double) arg0 * ((double) this.field1480.field5097 + Math.random() * (double) (this.field1480.field5104 - this.field1480.field5097)));
            if (this.field1466 > 63) {
                int var8 = this.field1466 >> 6;
                this.field1466 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field1480.field5074 <= 0 && this.field1480.field5068 <= 0) {
                        var10 = this.field1465;
                        var11 = this.field1460;
                        var12 = this.field1470;
                    } else {
                        int var13 = this.field1477 + ((int) ((double) this.field1476 * Math.random()));
                        int var14 = var13 & 0x3FFF;
                        int var15 = class174.field2572[var14];
                        int var16 = class174.field2564[var14];
                        int var17 = this.field1456 + (int) ((double) this.field1457 * Math.random());
                        int var18 = var17 & 0x1FFF;
                        int var19 = class174.field2572[var18];
                        int var20 = class174.field2564[var18];
                        var12 = var16 * var19 >> 15;
                        var10 = var20 * -1;
                        var11 = var15 * var19 >> 15;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field1454 * var21 + (this.field1475 * var22 + (this.field1467 * var23)) >> 16;
                    int var25 = this.field1482 * var22 + this.field1459 * var23 + this.field1445 * var21 >> 16;
                    int var26 = this.field1458 * var23 + this.field1473 * var21 + this.field1468 * var22 >> 16;
                    int var27 = (int) (Math.random() * (double) (this.field1480.field5090 - this.field1480.field5075)) + this.field1480.field5075;
                    int var28 = (int) ((double) (this.field1480.field5124 - this.field1480.field5099) * Math.random()) + this.field1480.field5099;
                    int var29 = (int) ((double) (this.field1480.field5126 - this.field1480.field5123) * Math.random()) + this.field1480.field5123;
                    int var32;
                    if (this.field1480.field5125) {
                        double var30 = Math.random();
                        var32 = (int) ((double) this.field1480.field5062 * var30 + (double) this.field1480.field5073) << 24 | (int) ((double) this.field1480.field5064 * var30 + (double) this.field1480.field5110) << 8 | (int) ((double) this.field1480.field5070 * var30 + (double) this.field1480.field5112) << 16 | (int) ((double) this.field1480.field5096 * var30 + (double) this.field1480.field5063);
                    } else {
                        var32 = (int) ((double) this.field1480.field5073 + Math.random() * (double) this.field1480.field5062) << 24 | (int) (Math.random() * (double) this.field1480.field5096 + (double) this.field1480.field5063) | (int) ((double) this.field1480.field5064 * Math.random() + (double) this.field1480.field5110) << 8 | (int) ((double) this.field1480.field5070 * Math.random() + (double) this.field1480.field5112) << 16;
                    }
                    int var33 = this.field1480.field5132;
                    if (!arg4.method133() && !this.field1480.field5088) {
                        var33 = -1;
                    }
                    if (class375.field5280 == class257.field3471) {
                        new class310(this, var24, var25, var26, var12, var10, var11, var27, var28, var32, var29, var33, this.field1480.field5061);
                    } else {
                        class310 var34 = class356.field4845[class375.field5280];
                        class375.field5280 = class375.field5280 + 1 & 0x3FF;
                        var34.method1987(this, var24, var25, var26, var12, var10, var11, var27, var28, var32, var29, var33, this.field1480.field5061);
                    }
                }
            }
        }
        this.field1469 = 0;
        if (arg1 != 2049857680) {
            return;
        }
        for (class310 var36 = (class310) this.field1462.method891(20838); var36 != null; var36 = (class310) this.field1462.method898(64)) {
            var36.method1985(arg3, arg0);
            this.field1469++;
        }
        class303.field4099 += this.field1469;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(IIII)Z", line = 170)
    public static final boolean method851(int arg0, int arg1, int arg2, int arg3) {
        field1464++;
        class111 var4 = (class111) class194.method1394(arg2, arg0, arg3);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class145.method1116(-1, var4);
        }
        class111 var6 = (class111) class95.method815(arg2, arg0, arg3, field1484 == null ? (field1484 = method860("gd")) : field1484);
        int var7 = 35 / ((arg1 - 43) / 57);
        if (var6 != null) {
            var5 &= class145.method1116(-1, var6);
        }
        class111 var8 = (class111) class314.method2001(arg2, arg0, arg3);
        if (var8 != null) {
            var5 &= class145.method1116(-1, var8);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(B)V", line = 199)
    public static final void method852(byte arg0) {
        field1471++;
        int var1 = class184.method1345(123);
        if (arg0 != -36) {
            return;
        }
        if (var1 == 0) {
            class163.field2408 = null;
            class47.method479(0, 97);
        } else if (var1 == 1) {
            class361.method2263(-114, (byte) 0);
            class47.method479(512, 96);
            if (class7.field57 != null) {
                class204.method1423((byte) 124);
            }
        } else {
            class361.method2263(-113, (byte) (class128.field1811 - 4 & 0xFF));
            class47.method479(2, 125);
        }
        class266.field3571 = class69.field1046;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)V", line = 234)
    public static final void method853(byte arg0, int arg1) {
        class284.field3805.method2534(0, arg1);
        if (arg0 != 126) {
            field1446 = 75;
        }
        field1455++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JB)V", line = 257)
    public final void method854(long arg0, byte arg1) {
        field1452++;
        int var4 = -104 % ((46 - arg1) / 44);
        for (class310 var5 = (class310) this.field1462.method891(20838); var5 != null; var5 = (class310) this.field1462.method898(64)) {
            var5.method1988(arg0);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lol;", line = 278)
    public static final class336 method855(int arg0, int arg1) {
        if (arg0 != 32767) {
            return null;
        }
        field1472++;
        class410 var2 = class417.field5844;
        class336 var3;
        synchronized (class417.field5844) {
            var3 = (class336) class417.field5844.method2537(-88, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class446.field6426.method2633(arg1, -1, 3);
        class336 var5 = new class336();
        if (var4 != null) {
            var5.method2130(new class289(var4), 9231);
        }
        class410 var6 = class417.field5844;
        synchronized (class417.field5844) {
            class417.field5844.method2542(var5, (byte) 85, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)Z", line = 314)
    public static final boolean method856(byte arg0) {
        field1478++;
        if (class101.field1504) {
            try {
                class117.method936("showVideoAd", true, class30.field502.field4117);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 > -46) {
            field1443 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 336)
    public static void method857(int arg0) {
        if (arg0 != 3) {
            method852((byte) -10);
        }
        field1444 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lpe;Lds;Lha;J)V", line = 475)
    public class100(class391 arg0, class227 arg1, class48 arg2, long arg3) {
        this.field1448 = arg3;
        this.field1463 = arg1;
        this.field1453 = arg2;
        this.field1480 = class29.method338(this.field1463.field3152, 0);
        if (!arg0.method133() && this.field1480.field5098 != -1) {
            this.field1480 = class29.method338(this.field1480.field5098, 0);
        }
        this.field1462 = new class107();
        this.field1466 = (int) ((double) this.field1466 + Math.random() * 64.0D);
        this.method858(-121);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V", line = 359)
    public final void method858(int arg0) {
        this.field1475 = this.field1463.field3136;
        field1483++;
        this.field1459 = this.field1463.field3140;
        this.field1473 = this.field1463.field3145;
        this.field1467 = this.field1463.field3150;
        this.field1458 = this.field1463.field3142;
        this.field1468 = this.field1463.field3143;
        this.field1454 = this.field1463.field3157;
        this.field1445 = this.field1463.field3135;
        this.field1482 = this.field1463.field3141;
        if (this.field1475 == this.field1454 && this.field1475 == this.field1467 && this.field1482 == this.field1445 && this.field1482 == this.field1459 && this.field1473 == this.field1468 && this.field1468 == this.field1458) {
            this.field1461 = true;
            return;
        }
        this.field1461 = false;
        if (arg0 > -68) {
            this.field1449 = 84;
        }
        int var2 = (this.field1475 + this.field1454 + this.field1467) / 3;
        int var3 = (this.field1482 + this.field1445 + this.field1459) / 3;
        int var4 = (this.field1473 + this.field1468 + this.field1458) / 3;
        if (this.field1447 == var2 && this.field1451 == var3 && this.field1449 == var4) {
            return;
        }
        this.field1451 = var3;
        this.field1447 = var2;
        this.field1449 = var4;
        int var5 = this.field1475 - this.field1454;
        int var6 = this.field1482 - this.field1445;
        int var7 = this.field1468 - this.field1473;
        int var8 = this.field1467 - this.field1454;
        int var9 = this.field1459 - this.field1445;
        int var10 = this.field1458 - this.field1473;
        this.field1465 = var7 * var8 - (var5 * var10);
        this.field1470 = var6 * var10 - (var7 * var9);
        this.field1460 = var5 * var9 - (var6 * var8);
        while (this.field1470 > 32767 || this.field1465 > 32767 || this.field1460 > 32767 || this.field1470 < -32767 || this.field1465 < -32767 || this.field1460 < -32767) {
            this.field1465 >>= 0x1;
            this.field1460 >>= 0x1;
            this.field1470 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field1460 * this.field1460 + this.field1470 * this.field1470 + this.field1465 * this.field1465));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field1460 = this.field1460 * 32767 / var11;
        this.field1465 = this.field1465 * 32767 / var11;
        this.field1470 = this.field1470 * 32767 / var11;
        if (this.field1480.field5074 <= 0 && this.field1480.field5068 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field1460, (double) this.field1470) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field1465, Math.sqrt((double) (this.field1470 * this.field1470 + this.field1460 * this.field1460))) * 2607.5945876176133D);
        this.field1476 = this.field1480.field5074 - this.field1480.field5094;
        this.field1457 = this.field1480.field5068 - this.field1480.field5121;
        this.field1477 = var12 + this.field1480.field5094 - (this.field1476 >> 1);
        this.field1456 = var13 + this.field1480.field5121 - (this.field1457 >> 1);
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 444)
    public static final void method859(int arg0) {
        field1481++;
        class410 var1 = class63.field963;
        synchronized (class63.field963) {
            if (arg0 != 64) {
                field1446 = 124;
            }
            class63.field963.method2533(0);
        }
        class410 var2 = class443.field6386;
        synchronized (class443.field6386) {
            class443.field6386.method2533(arg0 - 64);
        }
        class410 var3 = class431.field6128;
        synchronized (class431.field6128) {
            class431.field6128.method2533(arg0 - 64);
        }
        class410 var4 = class68.field1026;
        synchronized (class68.field1026) {
            class68.field1026.method2533(arg0 - 64);
        }
    }
}
