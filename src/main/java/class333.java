import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class333 extends class417 {

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "Lkba;")
    private class108 field4493 = new class108();

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    private int field4509 = 256;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    private int field4501 = 0;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field4513 = 256;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
    public static int[] field4499 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
    private boolean field4505;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "Z")
    private boolean field4516;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final synchronized void method1973(int arg0) {
        if (arg0 != 0) {
            this.field4516 = false;
        }
        field4508++;
        this.field4516 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
    public final synchronized void method1974(int arg0) {
        field4512++;
        if (this.field4505) {
            return;
        }
        while (true) {
            class401 var2 = this.method1976(-95);
            if (var2 == null) {
                if (this.field4516) {
                    this.method315(59);
                    class703.field9866.method562(1);
                }
                return;
            }
            if (arg0 < var2.field5670[0].length - this.field4500) {
                this.field4500 += arg0;
                return;
            }
            arg0 -= var2.field5670[0].length - this.field4500;
            this.method1984((byte) 100);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLjba;)V")
    public final synchronized void method1975(byte arg0, class401 arg1) {
        field4515++;
        while (this.field4501 >= 100) {
            this.field4493.method727(6494);
            this.field4501--;
        }
        if (arg0 <= 10) {
            method1978(null, null, -103, 19, -21, 97, 127, null);
        }
        this.field4493.method725(arg1, -20911);
        this.field4501++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Ljba;")
    private final synchronized class401 method1976(int arg0) {
        field4504++;
        if (arg0 > -26) {
            field4496 = 119;
        }
        return (class401) this.field4493.method724(32);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)D")
    public final synchronized double method1977(boolean arg0) {
        field4497++;
        if (this.field4501 < 1) {
            return -1.0D;
        }
        if (arg0) {
            this.field4505 = true;
        }
        class401 var2 = (class401) this.field4493.method724(32);
        return var2 == null ? -1.0D : var2.field5674 - (double) ((float) var2.field5670[0].length / (float) class478.field6609);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgv;Lvha;IIIIILcea;)V")
    public static final void method1978(class83 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class215 arg7) {
        field4510++;
        if (arg4 != 3) {
            method1982(40);
        }
        class101 var8 = new class101();
        var8.field1340 = arg6;
        var8.field1347 = arg5 << 9;
        var8.field1351 = arg2 << 9;
        if (arg1 != null) {
            var8.field1355 = arg1;
            int var10 = arg1.field9603;
            int var11 = arg1.field9588;
            if (arg3 == 1 || arg3 == 3) {
                var11 = arg1.field9603;
                var10 = arg1.field9588;
            }
            var8.field1324 = arg1.field9581;
            var8.field1348 = arg1.field9565;
            var8.field1339 = arg1.field9556;
            var8.field1334 = arg1.field9604;
            var8.field1337 = arg1.field9579 << 9;
            var8.field1335 = arg5 + var11 << 9;
            var8.field1358 = arg1.field9599;
            var8.field1345 = arg2 + var10 << 9;
            var8.field1359 = arg1.field9557;
            var8.field1327 = arg1.field9526;
            var8.field1350 = arg1.field9591 << 9;
            var8.field1344 = arg1.field9620;
            var8.field1329 = arg1.field9608;
            if (arg1.field9528 != null) {
                var8.field1326 = true;
                var8.method696(true);
            }
            if (var8.field1327 != null) {
                var8.field1341 = (int) ((double) (var8.field1324 - var8.field1339) * Math.random()) + var8.field1339;
            }
            class197.field2353.method725(var8, -20911);
            return;
        }
        if (arg7 != null) {
            var8.field1328 = arg7;
            class274 var9 = arg7.field2589;
            if (var9.field3616 != null) {
                var8.field1326 = true;
                var9 = var9.method1637(class386.field5455, (byte) 95);
            }
            if (var9 != null) {
                var8.field1345 = arg2 + var9.field3619 << 9;
                var8.field1335 = arg5 + var9.field3619 << 9;
                var8.field1329 = class201.method1115(arg4 + 119, arg7);
                var8.field1358 = var9.field3672;
                var8.field1334 = var9.field3598;
                var8.field1350 = var9.field3640 << 9;
                var8.field1344 = var9.field3606;
                var8.field1337 = var9.field3636 << 9;
                var8.field1359 = var9.field3595;
            }
            class315.field4251.method725(var8, -20911);
            return;
        }
        if (arg0 == null) {
            return;
        }
        var8.field1325 = arg0;
        var8.field1345 = arg2 + arg0.method543(arg4 ^ 0x3) << 9;
        var8.field1335 = arg5 + arg0.method543(0) << 9;
        var8.field1329 = class439.method2484(arg0, true);
        var8.field1359 = 256;
        var8.field1350 = arg0.field1129 << 9;
        var8.field1337 = 0;
        var8.field1334 = arg0.field1131;
        var8.field1344 = 256;
        var8.field1358 = arg0.field1114;
        class374.field5207.method2558(var8, (long) arg0.field817, -1);
        return;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
    public final int method1979() {
        field4507++;
        return 1;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)Lkw;")
    public static final class252 method1980(int arg0) {
        int var1 = 110 % ((9 - arg0) / 51);
        field4517++;
        class252 var2 = (class252) class275.field3677.method2348(-1);
        if (var2 != null) {
            var2.method315(45);
            var2.method2287((byte) -90);
            return var2;
        }
        class252 var3;
        do {
            var3 = (class252) class214.field2572.method2348(-1);
            if (var3 == null) {
                return null;
            }
            if (var3.method1496((byte) -108) > class538.method2963(-47)) {
                return null;
            }
            var3.method315(61);
            var3.method2287((byte) -90);
        } while ((Long.MIN_VALUE & var3.field5550) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(DII)Ljba;")
    public final class401 method1981(double arg0, int arg1, int arg2) {
        field4494++;
        int var5 = -23 % ((-arg2 - 46) / 34);
        long var6 = (long) (this.field4491 << 0 | arg1);
        class401 var8 = (class401) class703.field9866.method566((byte) 120, var6);
        if (var8 == null) {
            var8 = new class401(new short[this.field4491][arg1], arg0);
        } else {
            var8.field5674 = arg0;
            class703.field9866.method561(var6, (byte) 58);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static final void method1982(int arg0) {
        if (class133.field1707 == null || class623.field8718 == null) {
            class623.field8718 = new int[256];
            class133.field1707 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class133.field1707[var1] = (int) (Math.sin(var2) * 4096.0D);
                class623.field8718[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            method1978(null, null, 15, 74, -18, 45, 82, null);
        }
        field4495++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)I")
    public final synchronized int method1983(boolean arg0) {
        if (!arg0) {
            this.method1984((byte) 32);
        }
        field4492++;
        return this.field4501;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    private final synchronized void method1984(byte arg0) {
        field4498++;
        if (arg0 != 100) {
            this.method1981(1.413056312553466D, -73, -59);
        }
        class401 var2 = this.method1976(-92);
        if (var2 != null) {
            var2.method315(arg0 ^ 0x56);
            this.field4500 = 0;
            this.field4501--;
            class703.field9866.method567(26404, var2, var2.method2319(2));
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
    public final synchronized void method1985(int[] arg0, int arg1, int arg2) {
        field4503++;
        if (this.field4505) {
            return;
        }
        if (this.method1976(-67) != null) {
            int var4 = arg1 + arg2;
            if (class460.field6375) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field4491 == 2) {
                var6 = 1;
            }
            while (var4 > arg1) {
                class401 var7 = this.method1976(-54);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field5670;
                while (arg1 < var4 && var8[0].length > this.field4500) {
                    if (class460.field6375) {
                        arg0[arg1++] = var8[var5][this.field4500] * this.field4513;
                        arg0[arg1++] = var8[var6][this.field4500] * this.field4509;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field4500] * this.field4513 + var8[var6][this.field4500] * this.field4509;
                    }
                    this.field4500++;
                }
                if (this.field4500 >= var8[0].length) {
                    this.method1984((byte) 100);
                }
            }
        } else if (this.field4516) {
            this.method315(111);
            class703.field9866.method562(1);
        }
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)V")
    public static void method1986(int arg0) {
        if (arg0 != -18925) {
            field4499 = null;
        }
        field4499 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)I")
    public static final int method1987(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -8941) {
            return -107;
        }
        field4514++;
        if ((class114.field1506[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (class114.field1506[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
    public final synchronized void method1988(boolean arg0, int arg1) {
        field4490++;
        if (arg1 == -58758775) {
            this.field4505 = arg0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lmha;")
    public final class417 method1989() {
        field4502++;
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public final void method1990(int arg0, int arg1) {
        this.field4513 = arg1;
        this.field4509 = arg1;
        field4506++;
        if (arg0 != 255186825) {
            this.method1979();
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lmha;")
    public final class417 method1991() {
        field4511++;
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class333(int arg0) {
        this.field4491 = arg0;
    }
}
