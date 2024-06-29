import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class340 {

    @OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
    public int field4512;

    @OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
    public boolean field4511;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Z")
    public boolean field4492;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "[S")
    public short[] field4496;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
    private int field4503;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public int field4499;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "J")
    public static long field4495 = -1L;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field4502 = 1405;

    @OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
    public static int field4507 = -1;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    private int field4494;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    private int field4498;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!kp", name = "o", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!kp", name = "v", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!kp", name = "s", descriptor = "Lbn;")
    public class309 field4510;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I")
    public static final int method1977(int arg0, byte arg1) {
        int var2 = -55 % ((arg1 - 62) / 33);
        field4509++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
    private final void method1978(int arg0) {
        int var2 = this.field4499;
        if (var2 == 2) {
            this.field4505 = 2048;
            this.field4498 = 2048;
            this.field4494 = 1;
            this.field4501 = 0;
        } else if (var2 == 3) {
            this.field4501 = 0;
            this.field4494 = 1;
            this.field4505 = 4096;
            this.field4498 = 2048;
        } else if (var2 == 4) {
            this.field4498 = 2048;
            this.field4505 = 2048;
            this.field4501 = 0;
            this.field4494 = 4;
        } else if (var2 == 5) {
            this.field4505 = 8192;
            this.field4498 = 2048;
            this.field4501 = 0;
            this.field4494 = 4;
        } else if (var2 == 12) {
            this.field4498 = 2048;
            this.field4501 = 0;
            this.field4505 = 2048;
            this.field4494 = 2;
        } else if (var2 == 13) {
            this.field4494 = 2;
            this.field4501 = 0;
            this.field4505 = 8192;
            this.field4498 = 2048;
        } else if (var2 == 10) {
            this.field4501 = 1536;
            this.field4494 = 3;
            this.field4498 = 512;
            this.field4505 = 2048;
        } else if (var2 == 11) {
            this.field4501 = 1536;
            this.field4494 = 3;
            this.field4498 = 512;
            this.field4505 = 4096;
        } else if (var2 == 6) {
            this.field4501 = 1280;
            this.field4498 = 768;
            this.field4494 = 3;
            this.field4505 = 2048;
        } else if (var2 == 7) {
            this.field4501 = 1280;
            this.field4498 = 768;
            this.field4494 = 3;
            this.field4505 = 4096;
        } else if (var2 == 8) {
            this.field4498 = 1024;
            this.field4505 = 2048;
            this.field4501 = 1024;
            this.field4494 = 3;
        } else if (var2 == 9) {
            this.field4501 = 1024;
            this.field4505 = 4096;
            this.field4494 = 3;
            this.field4498 = 1024;
        } else if (var2 == 14) {
            this.field4498 = 768;
            this.field4505 = 2048;
            this.field4494 = 1;
            this.field4501 = 1280;
        } else if (var2 == 15) {
            this.field4494 = 1;
            this.field4501 = 1536;
            this.field4505 = 4096;
            this.field4498 = 512;
        } else if (var2 == 16) {
            this.field4498 = 256;
            this.field4494 = 1;
            this.field4505 = 8192;
            this.field4501 = 1792;
        } else {
            this.field4505 = 2048;
            this.field4494 = 0;
            this.field4498 = 2048;
            this.field4501 = 0;
        }
        field4506++;
        if (arg0 != -30352) {
            this.field4512 = -38;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIII)V")
    public final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4505 = arg0;
        field4513++;
        int var6 = -87 % ((arg2 - 64) / 39);
        this.field4501 = arg3;
        this.field4498 = arg4;
        this.field4494 = arg1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4504++;
        if (arg4 < 128 || arg9 < 128 || (class308.field4128 * 128 - 256) < arg4 || arg9 > (class426.field6200 - 2) * 128) {
            class382.field5525[0] = class382.field5525[1] = -1;
            return;
        }
        int var10 = class470.method2868(124, arg2, arg4, arg9) - arg1;
        class272.field3633.method757(arg8, 0, 0);
        class343.field4596.method1227(class272.field3633);
        class343.field4596.method1207(arg4, var10, arg9, class382.field5525);
        class272.field3633.method757(-arg8, 0, 0);
        if (arg6 != 29308) {
            field4495 = -107L;
        }
        class343.field4596.method1227(class272.field3633);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
    public static final int method1981(int arg0, int arg1) {
        field4500++;
        return arg0 == -752305304 ? arg1 >>> 8 : -99;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIZ)V")
    public final void method1982(int arg0, int arg1, boolean arg2) {
        field4508++;
        int var6;
        if (arg2) {
            var6 = 2048;
        } else {
            int var4 = this.field4505 * arg0 / 50 + this.field4503 & 0x7FF;
            int var5 = this.field4494;
            if (var5 == 1) {
                var6 = (class456.field6812[var4 << 3] >> 5) + 1024;
            } else if (var5 == 3) {
                var6 = class48.field530[var4] >> 1;
            } else if (var5 == 4) {
                var6 = var4 >> 10 << 11;
            } else if (var5 == 2) {
                var6 = var4;
            } else if (var5 == 5) {
                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
            } else {
                var6 = 2048;
            }
        }
        this.field4510.method362(105, (float) ((this.field4498 * var6 >> 11) + this.field4501) / 2048.0F);
        if (arg1 != 1) {
            this.method1978(-109);
        }
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    protected class340() {
        if (class48.field530 == null) {
            class381.method2327(2048);
        }
        this.method1978(-30352);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILza;III)V")
    private final void method1983(int arg0, int arg1, int arg2, class287 arg3, int arg4, int arg5, int arg6) {
        if (arg0 < 112) {
            this.field4494 = 19;
        }
        field4493++;
        this.field4510 = arg3.method1231(arg6, arg4, arg2, arg5, arg1, 1.0F);
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lza;Lug;I)V")
    public class340(class287 arg0, class396 arg1, int arg2) {
        if (class48.field530 == null) {
            class381.method2327(2048);
        }
        this.field4512 = arg1.method2388((byte) -127);
        this.field4511 = (this.field4512 & 0x8) != 0;
        this.field4492 = (this.field4512 & 0x10) != 0;
        this.field4512 &= 0x7;
        int var4 = arg1.method2386(-23648) << arg2;
        int var5 = arg1.method2386(-23648) << arg2;
        int var6 = arg1.method2386(-23648) << arg2;
        int var7 = arg1.method2388((byte) -126);
        int var8 = var7 * 2 + 1;
        this.field4496 = new short[var8];
        for (int var9 = 0; var9 < this.field4496.length; var9++) {
            short var13 = (short) arg1.method2386(-23648);
            int var14 = var13 >>> 8;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            int var15 = var13 & 0xFF;
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field4496[var9] = (short) class219.method1381(var15, var14 << 8);
        }
        int var10 = (var7 << class351.field4688) + class123.field1595;
        int var11 = class413.field5903 == null ? class445.field6483[class412.method2517(-111, arg1.method2386(-23648)) & 0xFFFF] : class413.field5903[arg1.method2386(-23648)];
        int var12 = arg1.method2388((byte) -111);
        this.field4503 = (var12 & 0xE0) << 3;
        this.field4499 = var12 & 0x1F;
        if (this.field4499 != 31) {
            this.method1978(-30352);
        }
        this.method1983(116, var11, var5, arg0, var6, var10, var4);
    }
}
