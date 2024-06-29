import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class269 {

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    private int field4319 = -1;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    private int field4329 = 0;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4325 = "";

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Lpi;")
    public static class201 field4330 = new class201(128);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "Lpi;")
    public static class201 field4333 = new class201(50);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field4317;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Llc;")
    public static class270 field4327;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BI)Lth;")
    public static final class247 method1856(byte[] arg0, int arg1) {
        field4318++;
        if (arg1 != -21497) {
            field4333 = null;
        }
        class247 var2 = new class247();
        class53 var3 = new class53(arg0);
        var3.field735 = var3.field758.length - 2;
        int var4 = var3.method331(arg1 + 21403);
        int var5 = var3.field758.length - var4 - 12 - 2;
        var3.field735 = var5;
        int var6 = var3.method340(arg1 ^ 0x5383);
        var2.field3644 = var3.method331(-63);
        var2.field3638 = var3.method331(-69);
        var2.field3640 = var3.method331(-29);
        var2.field3639 = var3.method331(-62);
        int var7 = var3.method366(-16505);
        if (var7 > 0) {
            var2.field3642 = new class143[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method331(-78);
                class143 var10 = new class143(class172.method1224(var9, arg1 - 45032727));
                var2.field3642[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method340(-100);
                    int var12 = var3.method340(arg1 ^ 0x5388);
                    var10.method1074((byte) 39, new class108(var12), (long) var11);
                }
            }
        }
        var3.field735 = 0;
        var2.field3651 = var3.method325(1534);
        var2.field3646 = new String[var6];
        var2.field3650 = new int[var6];
        int var13 = 0;
        var2.field3652 = new int[var6];
        while (var5 > var3.field735) {
            int var14 = var3.method331(arg1 + 21485);
            if (var14 == 3) {
                var2.field3646[var13] = var3.method326(108).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3652[var13] = var3.method366(arg1 + 4992);
            } else {
                var2.field3652[var13] = var3.method340(-96);
            }
            var2.field3650[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lbc;")
    public static final class148 method1857(int arg0) {
        if (arg0 != 27511) {
            method1862((class270) null, -37, 26);
        }
        field4331++;
        int var1 = class283.field4559[0] * class165.field2534[0];
        int[] var2 = new int[var1];
        byte[] var3 = class280.field4506[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class53.field748[class301.method2056(var3[var4], 255)];
        }
        class148 var5 = new class148(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], var2);
        class137.method1032(arg0 ^ 0xFFFF94FC);
        return var5;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
    private final void method1858(int arg0, byte arg1) {
        field4326++;
        double var3 = (double) ((arg0 & 0xFF322E) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF43) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = 0.0D;
        double var13 = var3;
        double var15 = 0.0D;
        if (var5 > var3) {
            var13 = var5;
        }
        if (var7 > var13) {
            var13 = var7;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field4316 = (int) (var17 * 256.0D);
        if (arg1 <= 21) {
            return;
        }
        if (var9 != var13) {
            if (var3 == var13) {
                var11 = (var5 - var7) / (var13 - var9);
            } else if (var5 == var13) {
                var11 = (var7 - var3) / (var13 - var9) + 2.0D;
            } else if (var7 == var13) {
                var11 = (var3 - var5) / (var13 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var13 - var9) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var13 - var9) / (2.0D - var13 - var9);
            }
        }
        this.field4317 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field4316 < 0) {
            this.field4316 = 0;
        } else if (this.field4316 > 255) {
            this.field4316 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field4320 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4320 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4317 < 0) {
            this.field4317 = 0;
        } else if (this.field4317 > 255) {
            this.field4317 = 255;
        }
        if (this.field4320 < 1) {
            this.field4320 = 1;
        }
        this.field4322 = (int) ((double) this.field4320 * var19);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLhc;I)V")
    public final void method1859(byte arg0, class53 arg1, int arg2) {
        if (arg0 != 46) {
            this.method1860(-123, 116, (class53) null, 54);
        }
        field4323++;
        while (true) {
            int var4 = arg1.method366(-16505);
            if (var4 == 0) {
                return;
            }
            this.method1860(var4, arg2, arg1, arg0 ^ 0xD1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILhc;I)V")
    private final void method1860(int arg0, int arg1, class53 arg2, int arg3) {
        field4321++;
        if (arg3 != 255) {
            return;
        }
        if (arg0 == 1) {
            this.field4329 = arg2.method362(-4);
            this.method1858(this.field4329, (byte) 118);
        } else if (arg0 == 2) {
            this.field4319 = arg2.method331(arg3 ^ 0xFFFFFF16);
            if (this.field4319 == 65535) {
                this.field4319 = -1;
                return;
            }
        } else if (arg0 == 3) {
            arg2.method331(-45);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    public static void method1861(int arg0) {
        field4333 = null;
        if (arg0 == 0) {
            field4330 = null;
            field4325 = null;
            field4327 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Llc;II)Ldj;")
    public static final class138 method1862(class270 arg0, int arg1, int arg2) {
        field4328++;
        if (arg1 < 109) {
            field4327 = null;
        }
        return class248.method1706((byte) 114, arg2, arg0) ? class191.method1355((byte) -101) : null;
    }
}
