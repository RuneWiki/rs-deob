import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class373 {

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "F")
    public float field5470 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "F")
    public float field5459 = 1.0F;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "F")
    public float field5467 = 0.25F;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field5471;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public int field5473;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lmh;")
    public class444 field5465;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "F")
    public float field5460;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "F")
    public float field5461;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "F")
    public float field5464;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public int field5472;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field5466;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field5462;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field5475;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field5474 = 0;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "Ldn;")
    public static class357 field5469 = new class357("LIVE", 0);

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "[F")
    public static float[] field5477 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "[S")
    public static short[] field5479 = new short[256];

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
    public static boolean field5480 = false;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[Lkg;")
    public static class178[] field5481 = new class178[128];

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lsi;I)V")
    public final void method2230(class391 arg0, int arg1) {
        this.field5470 = (float) (arg0.method2348(-2) * 8) / 255.0F;
        if (arg1 != 30914) {
            this.method2233(-86, null);
        }
        field5476++;
        this.field5467 = (float) (arg0.method2348(-2) * 8) / 255.0F;
        this.field5459 = (float) (arg0.method2348(-2) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method2231(byte arg0) {
        field5469 = null;
        field5479 = null;
        field5481 = null;
        if (arg0 != -52) {
            method2232(61, -116, -25, 91, -112, -61, 99);
        }
        field5477 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5468++;
        for (class124 var7 = (class124) class388.field5656.method2461(arg5 + 29179); var7 != null; var7 = (class124) class388.field5656.method2458(arg5 ^ 0xFFFF8DE6)) {
            if (class441.field6516 >= var7.field1846) {
                var7.method1522(-59);
            } else {
                class97.method713((var7.field1848 << 7) + 64, (byte) 114, arg3 >> 1, arg2, (var7.field1853 << 7) + 64, arg6 >> 1, var7.field1843 * 2, arg0, var7.field1850);
                class135.field1949.method1840(var7.field1849 | 0xFF000000, true, var7.field1844, 0, class52.field637[1] + arg4, class52.field637[0] + arg1);
            }
        }
        if (arg5 != -29289) {
            method2232(71, 125, 109, -53, -44, -26, 32);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILbf;)Z")
    public final boolean method2233(int arg0, class373 arg1) {
        field5463++;
        if (arg0 == -1) {
            return this.field5472 == arg1.field5472 && this.field5461 == arg1.field5461 && this.field5464 == arg1.field5464 && this.field5460 == arg1.field5460 && this.field5467 == arg1.field5467 && this.field5470 == arg1.field5470 && this.field5459 == arg1.field5459 && this.field5462 == arg1.field5462 && this.field5475 == arg1.field5475 && this.field5465 == arg1.field5465;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class373() {
        this.field5471 = -50;
        this.field5473 = -60;
        this.field5465 = class402.field5903;
        this.field5460 = 1.2F;
        this.field5461 = 1.1523438F;
        this.field5464 = 0.69921875F;
        this.field5472 = class305.field4168;
        this.field5466 = -50;
        this.field5462 = class442.field6546;
        this.field5475 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lsi;)V")
    public class373(class391 arg0) {
        int var2 = arg0.method2348(-2);
        if (class20.field269.method3084((byte) -21, class152.field2332) && class485.field7085.method263() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field5472 = class305.field4168;
            } else {
                this.field5472 = arg0.method2361((byte) -56);
            }
            if ((var2 & 0x2) == 0) {
                this.field5461 = 1.1523438F;
            } else {
                this.field5461 = (float) arg0.method2353((byte) 110) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field5464 = 0.69921875F;
            } else {
                this.field5464 = (float) arg0.method2353((byte) 74) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field5460 = 1.2F;
            } else {
                this.field5460 = (float) arg0.method2353((byte) 103) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method2361((byte) -56);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method2353((byte) 96);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method2353((byte) 126);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method2353((byte) 84);
            }
            this.field5460 = 1.2F;
            this.field5472 = class305.field4168;
            this.field5461 = 1.1523438F;
            this.field5464 = 0.69921875F;
        }
        if ((var2 & 0x10) == 0) {
            this.field5471 = -50;
            this.field5466 = -50;
            this.field5473 = -60;
        } else {
            this.field5466 = arg0.method2311((byte) -122);
            this.field5473 = arg0.method2311((byte) -55);
            this.field5471 = arg0.method2311((byte) 127);
        }
        if ((var2 & 0x20) == 0) {
            this.field5462 = class442.field6546;
        } else {
            this.field5462 = arg0.method2361((byte) -56);
        }
        if ((var2 & 0x40) == 0) {
            this.field5475 = 0;
        } else {
            this.field5475 = arg0.method2353((byte) 124);
        }
        if ((var2 & 0x80) == 0) {
            this.field5465 = class402.field5903;
        } else {
            int var3 = arg0.method2353((byte) 98);
            int var4 = arg0.method2353((byte) 86);
            int var5 = arg0.method2353((byte) 107);
            int var6 = arg0.method2353((byte) 77);
            int var7 = arg0.method2353((byte) 68);
            int var8 = arg0.method2353((byte) 89);
            this.field5465 = class497.method2904(var3, var7, var5, var4, var8, var6, (byte) -46);
        }
    }
}
