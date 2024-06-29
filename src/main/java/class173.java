import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class173 {

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Luaa;")
    private class395 field2505 = new class395(64);

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lgp;")
    private class561 field2502;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lhca;")
    public static class179 field2510;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Lua;")
    public static class547 field2515;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public static int[] field2512;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public static int[] field2513;

    static {
        new class567("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field2510 = new class179("LIVE", 0);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V", line = 9)
    public final void method1187(int arg0) {
        field2506++;
        if (arg0 == 588394986) {
            class395 var2 = this.field2505;
            synchronized (this.field2505) {
                this.field2505.method2406(arg0 - 588395009);
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)I", line = 23)
    public static final int method1188(byte arg0, int arg1) {
        field2503++;
        return arg0 < 126 ? -84 : arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 37)
    public static final void method1189(int arg0, int arg1) {
        field2504++;
        class310.field4550.method2397(arg0, (byte) -76);
        class258.field3753.method2397(arg0, (byte) -71);
        class92.field1631.method2397(arg0, (byte) -46);
        class601.field8528.method2397(arg0, (byte) -64);
        if (arg1 != -1) {
            field2515 = null;
        }
        class185.field2680.method2397(arg0, (byte) -127);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)Z", line = 52)
    public static final boolean method1190(char arg0, int arg1) {
        if (arg1 == 28202) {
            field2511++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(II)V", line = 63)
    public final void method1191(int arg0, int arg1) {
        field2507++;
        class395 var3 = this.field2505;
        synchronized (this.field2505) {
            if (arg0 <= 5) {
                this.field2502 = null;
            }
            this.field2505.method2397(arg1, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 76)
    public static final void method1192(int arg0) {
        field2508++;
        if (class274.field4008 < 0) {
            class274.field4008 = 0;
            class469.field6762 = -1;
            class378.field5562 = -1;
        }
        if (class212.field3121 < class274.field4008) {
            class469.field6762 = -1;
            class274.field4008 = class212.field3121;
            class378.field5562 = -1;
        }
        if (arg0 != 588394986) {
            method1196((byte) 76);
        }
        if (class119.field1915 < 0) {
            class378.field5562 = -1;
            class469.field6762 = -1;
            class119.field1915 = 0;
        }
        if (class212.field3116 < class119.field1915) {
            class469.field6762 = -1;
            class378.field5562 = -1;
            class119.field1915 = class212.field3116;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(II)Lti;", line = 117)
    public final class298 method1193(int arg0, int arg1) {
        field2514++;
        if (arg0 < 69) {
            field2515 = null;
        }
        class395 var3 = this.field2505;
        class298 var4;
        synchronized (this.field2505) {
            var4 = (class298) this.field2505.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field2502;
        byte[] var6;
        synchronized (this.field2502) {
            var6 = this.field2502.method3175(arg1, (byte) -53, 32);
        }
        class298 var7 = new class298();
        if (var6 != null) {
            var7.method1872(-54, new class268(var6));
        }
        class395 var8 = this.field2505;
        synchronized (this.field2505) {
            this.field2505.method2408(var7, (long) arg1, -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 154)
    public final void method1194(int arg0) {
        class395 var2 = this.field2505;
        synchronized (this.field2505) {
            if (arg0 != -1) {
                return;
            }
            this.field2505.method2404((byte) -45);
        }
        field2501++;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 172)
    public static void method1195(int arg0) {
        field2512 = null;
        field2513 = null;
        if (arg0 != 10209) {
            method1192(95);
        }
        field2510 = null;
        field2515 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 300)
    public class173(class584 arg0, int arg1, class561 arg2) {
        this.field2502 = arg2;
        this.field2502.method3164(32, true);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 188)
    public static final void method1196(byte arg0) {
        field2509++;
        if (class220.field3297 != null) {
            return;
        }
        class220.field3297 = new int[65536];
        if (arg0 < 82) {
            method1195(16);
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class220.field3297[var3] = var35;
        }
    }
}
