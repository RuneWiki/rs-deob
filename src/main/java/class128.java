import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ng")
public class class128 extends class147 {

    @OriginalMember(owner = "ng", name = "H", descriptor = "I")
    private int field2466 = 0;

    @OriginalMember(owner = "ng", name = "Z", descriptor = "I")
    private int field2484 = -1;

    @OriginalMember(owner = "ng", name = "N", descriptor = "Llf;")
    private static class109 field2472 = class35.method275("Loaded config", 2);

    @OriginalMember(owner = "ng", name = "P", descriptor = "Llf;")
    public static class109 field2474 = class35.method275("Der Server wird gerade aktualisiert)3", 2);

    @OriginalMember(owner = "ng", name = "G", descriptor = "Llf;")
    public static class109 field2465 = field2472;

    @OriginalMember(owner = "ng", name = "ab", descriptor = "Z")
    public static boolean field2485 = false;

    @OriginalMember(owner = "ng", name = "I", descriptor = "Ljg;")
    public static class92 field2467 = new class92(0, 0);

    @OriginalMember(owner = "ng", name = "bb", descriptor = "[J")
    public static long[] field2486 = new long[256];

    @OriginalMember(owner = "ng", name = "cb", descriptor = "[[I")
    public static int[][] field2487 = new int[5][5000];

    @OriginalMember(owner = "ng", name = "J", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "ng", name = "K", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "ng", name = "L", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "ng", name = "M", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "ng", name = "O", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "ng", name = "Q", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "ng", name = "R", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "ng", name = "S", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "ng", name = "T", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "ng", name = "U", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "ng", name = "V", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "ng", name = "W", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "ng", name = "X", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "ng", name = "Y", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "ng", name = "db", descriptor = "Ldf;")
    public static class37 field2488;

    @OriginalMember(owner = "ng", name = "a", descriptor = "(II)Lie;")
    public static final class83 method926(int arg0, int arg1) {
        field2483++;
        class83 var2 = (class83) class59.field1165.method1086((long) arg0, -126);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != -4) {
            method926(117, -125);
        }
        byte[] var3 = class84.field1709.method147(0, arg0, 10);
        class83 var4 = new class83();
        var4.field1639 = arg0;
        if (var3 != null) {
            var4.method519(new class86(var3), (byte) -95);
        }
        var4.method525(arg1 + 20049);
        if (var4.field1670 != -1) {
            var4.method527(method926(var4.field1641, -4), method926(var4.field1670, -4), (byte) -85);
        }
        if (!class109.field2157 && var4.field1642) {
            var4.field1685 = false;
            var4.field1678 = 0;
            var4.field1679 = null;
            var4.field1644 = class194.field3722;
            var4.field1681 = null;
        }
        class59.field1165.method1082((long) arg0, -118, var4);
        return var4;
    }

    @OriginalMember(owner = "ng", name = "a", descriptor = "(IBILja;)V")
    private final void method927(int arg0, byte arg1, int arg2, class86 arg3) {
        field2480++;
        if (arg0 == 1) {
            this.field2466 = arg3.method578((byte) 59);
            this.method930(this.field2466, (byte) 125);
        } else if (arg0 == 2) {
            this.field2484 = arg3.method569(true);
            if (this.field2484 == 65535) {
                this.field2484 = -1;
            }
        } else if (arg0 == 3) {
            arg3.method569(true);
        }
        if (arg1 != -121) {
            this.method930(19, (byte) 65);
        }
    }

    @OriginalMember(owner = "ng", name = "a", descriptor = "(Lja;BI)V")
    public final void method928(class86 arg0, byte arg1, int arg2) {
        field2468++;
        while (true) {
            int var4 = arg0.method598((byte) 75);
            if (var4 == 0) {
                if (arg1 <= 26) {
                    field2471 = -69;
                    return;
                } else {
                    return;
                }
            }
            this.method927(var4, (byte) -121, arg2, arg0);
        }
    }

    @OriginalMember(owner = "ng", name = "b", descriptor = "(Z)V")
    public static void method929(boolean arg0) {
        field2486 = null;
        field2467 = null;
        field2472 = null;
        field2465 = null;
        field2487 = null;
        if (!arg0) {
            method931(null, -124, 74, -39);
        }
        field2488 = null;
        field2474 = null;
    }

    @OriginalMember(owner = "ng", name = "a", descriptor = "(IB)V")
    private final void method930(int arg0, byte arg1) {
        field2473++;
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 < var5) {
            var9 = var5;
        }
        double var15 = 0.0D;
        if (var9 < var3) {
            var9 = var3;
        }
        if (var5 < var7) {
            var11 = var5;
        }
        if (var11 > var3) {
            var11 = var3;
        }
        double var17 = (var9 + var11) / 2.0D;
        this.field2475 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var7 == var9) {
                var13 = (var5 - var3) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (var9 - var11) + 2.0D;
            } else if (var3 == var9) {
                var13 = (var7 - var5) / (-var11 + var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = 84 / ((63 - arg1) / 60);
        if (this.field2475 < 0) {
            this.field2475 = 0;
        } else if (this.field2475 > 255) {
            this.field2475 = 255;
        }
        if (var17 > 0.5D) {
            this.field2470 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2470 = (int) (var15 * var17 * 512.0D);
        }
        this.field2479 = (int) (var15 * 256.0D);
        if (this.field2470 < 1) {
            this.field2470 = 1;
        }
        if (this.field2479 < 0) {
            this.field2479 = 0;
        } else if (this.field2479 > 255) {
            this.field2479 = 255;
        }
        this.field2476 = (int) ((double) this.field2470 * var19);
    }

    @OriginalMember(owner = "ng", name = "a", descriptor = "([BIII)Z")
    public static final boolean method931(byte[] arg0, int arg1, int arg2, int arg3) {
        field2478++;
        if (arg1 > -43) {
            field2487 = null;
        }
        boolean var4 = true;
        class86 var5 = new class86(arg0);
        int var6 = -1;
        label58: while (true) {
            int var7 = var5.method595((byte) -107);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method560(0);
                    if (var11 == 0) {
                        continue label58;
                    }
                    int var12 = var5.method598((byte) 126) >> 2;
                    var8 += var11 - 1;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var8 & 0x3F;
                    int var15 = arg2 + var14;
                    int var16 = var13 + arg3;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class78 var17 = class140.method1000(var6, 0);
                        if (var12 != 22 || !class181.field3420 || var17.field1527 != 0 || var17.field1511 == 1 || var17.field1526) {
                            var9 = true;
                            if (!var17.method507(-81)) {
                                var4 = false;
                                class141.field2736++;
                            }
                        }
                    }
                }
                int var10 = var5.method560(0);
                if (var10 == 0) {
                    break;
                }
                var5.method598((byte) 74);
            }
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2486[var0] = var1;
        }
    }
}
