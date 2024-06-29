import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class214 extends class162 {

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "[J")
    private long[] field3419 = new long[10];

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
    private int field3414 = 1;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field3421 = 256;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    private int field3406 = 0;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "J")
    private long field3422 = class110.method707((byte) 112);

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Lck;")
    public static class119 field3413 = class298.method1987((byte) 20, ":assistreq:");

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field3405 = 0;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "S")
    public static short field3408 = 1;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "Lck;")
    public static class119 field3418 = class298.method1987((byte) 123, "blaugr-Un:");

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Lck;")
    private static class119 field3403 = class298.method1987((byte) 107, "Connection lost)3");

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field3407 = 0;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "Lck;")
    public static class119 field3420 = class298.method1987((byte) 82, "prosavage");

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lck;")
    public static class119 field3411 = field3403;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I", line = 4)
    public static final int method1346(byte arg0, int arg1) {
        if (arg0 != -48) {
            field3407 = -56;
        }
        field3402++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 19)
    public static void method1347(int arg0) {
        field3420 = null;
        field3413 = null;
        field3403 = null;
        if (arg0 == 1) {
            field3411 = null;
            field3418 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)I", line = 33)
    public final int method109(int arg0, int arg1, int arg2) {
        field3423++;
        int var4 = this.field3421;
        this.field3421 = 300;
        if (arg0 != -22102) {
            method1346((byte) 47, -62);
        }
        int var5 = this.field3414;
        this.field3414 = 1;
        this.field3422 = class110.method707((byte) 111);
        if (this.field3419[this.field3415] == 0L) {
            this.field3414 = var5;
            this.field3421 = var4;
        } else if (this.field3419[this.field3415] < this.field3422) {
            this.field3421 = (int) ((long) (arg1 * 2560) / (this.field3422 - this.field3419[this.field3415]));
        }
        if (this.field3421 < 25) {
            this.field3421 = 25;
        }
        if (this.field3421 > 256) {
            this.field3421 = 256;
            this.field3414 = (int) ((long) arg1 - ((this.field3422 - this.field3419[this.field3415]) / 10L));
        }
        if (this.field3414 > arg1) {
            this.field3414 = arg1;
        }
        this.field3419[this.field3415] = this.field3422;
        this.field3415 = (this.field3415 + 1) % 10;
        if (this.field3414 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3419[var6] != 0L) {
                    this.field3419[var6] -= -((long) this.field3414);
                }
            }
        }
        if (arg2 > this.field3414) {
            this.field3414 = arg2;
        }
        int var7 = 0;
        class232.method1493((long) this.field3414, (byte) -51);
        while (this.field3406 < 256) {
            this.field3406 += this.field3421;
            var7++;
        }
        this.field3406 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 110)
    public final void method110(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3419[var2] = 0L;
        }
        if (arg0 > -52) {
            method1351(63, 22, (class36) null);
        }
        field3416++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lrb;IIIZ)V", line = 131)
    public static final void method1348(class291 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3417++;
        for (class32 var5 = (class32) class55.field877.method995(1836596936); var5 != null; var5 = (class32) class55.field877.method996(0)) {
            if (var5.field463 == arg1 && (arg3 * 128) == var5.field454 && (arg2 * 128) == var5.field455 && var5.field464.field4822 == arg0.field4822) {
                if (var5.field448 != null) {
                    class230.field3721.method1421(var5.field448);
                    var5.field448 = null;
                }
                if (var5.field468 != null) {
                    class230.field3721.method1421(var5.field468);
                    var5.field468 = null;
                }
                var5.method552((byte) -119);
                return;
            }
        }
        if (!arg4) {
            field3420 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([BI)V", line = 169)
    public static final void method1349(byte[] arg0, int arg1) {
        field3409++;
        class3 var2 = new class3(arg0);
        var2.field44 = arg0.length - 2;
        class285.field4706 = var2.method63((byte) 1);
        class232.field3741 = new int[class285.field4706];
        class95.field1465 = new byte[class285.field4706][];
        class64.field1006 = new int[class285.field4706];
        class155.field2475 = new int[class285.field4706];
        class247.field3989 = new byte[class285.field4706][];
        class7.field152 = new int[class285.field4706];
        class98.field1501 = new boolean[class285.field4706];
        var2.field44 = arg0.length - (class285.field4706 * 8) - 7;
        class227.field3641 = var2.method63((byte) 1);
        class207.field3304 = var2.method63((byte) 1);
        int var3 = (var2.method64((byte) -120) & 0xFF) + 1;
        for (int var4 = 0; var4 < class285.field4706; var4++) {
            class155.field2475[var4] = var2.method63((byte) 1);
        }
        for (int var5 = 0; var5 < class285.field4706; var5++) {
            class7.field152[var5] = var2.method63((byte) 1);
        }
        for (int var6 = 0; var6 < class285.field4706; var6++) {
            class232.field3741[var6] = var2.method63((byte) 1);
        }
        for (int var7 = 0; var7 < class285.field4706; var7++) {
            class64.field1006[var7] = var2.method63((byte) 1);
        }
        var2.field44 = arg0.length - class285.field4706 * 8 - (var3 * 3 + arg1) - 7;
        class161.field2553 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class161.field2553[var8] = var2.method48(64);
            if (class161.field2553[var8] == 0) {
                class161.field2553[var8] = 1;
            }
        }
        var2.field44 = 0;
        for (int var9 = 0; var9 < class285.field4706; var9++) {
            int var10 = class64.field1006[var9];
            int var11 = class232.field3741[var9];
            boolean var12 = false;
            int var13 = var10 * var11;
            byte[] var14 = new byte[var13];
            byte[] var15 = new byte[var13];
            class247.field3989[var9] = var15;
            class95.field1465[var9] = var14;
            int var16 = var2.method64((byte) 63);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var13; var22++) {
                    var15[var22] = var2.method24(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var13; var23++) {
                        byte var24 = var14[var23] = var2.method24(false);
                        var12 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label90: while (true) {
                    if (var17 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var11 <= var19) {
                                break label90;
                            }
                            for (int var20 = 0; var20 < var10; var20++) {
                                byte var21 = var14[var11 * var20 + var19] = var2.method24(false);
                                var12 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var10; var18++) {
                        var15[var17 + (var11 * var18)] = var2.method24(false);
                    }
                    var17++;
                }
            }
            class98.field1501[var9] = var12;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIII)V", line = 348)
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3412++;
        int var5 = arg0;
        int var6 = -arg0;
        int var7 = arg1;
        int var8 = 0;
        int var9 = class197.method1264(arg1 ^ 0x74, arg0 + arg4, class79.field1226, class59.field957);
        int var10 = class197.method1264(-106, arg4 - arg0, class79.field1226, class59.field957);
        class36.method282(var9, var10, arg2, class256.field4113[arg3], 26175);
        while (var5 > var8) {
            var7 += 2;
            var6 += var7;
            if (var6 > 0) {
                var5--;
                var6 -= var5 << 1;
                int var11 = arg3 - var5;
                int var12 = arg3 + var5;
                if (class108.field1650 <= var12 && class236.field3800 >= var11) {
                    int var13 = class197.method1264(arg1 - 99, arg4 + var8, class79.field1226, class59.field957);
                    int var14 = class197.method1264(-120, arg4 - var8, class79.field1226, class59.field957);
                    if (var12 <= class236.field3800) {
                        class36.method282(var13, var14, arg2, class256.field4113[var12], 26175);
                    }
                    if (var11 >= class108.field1650) {
                        class36.method282(var13, var14, arg2, class256.field4113[var11], 26175);
                    }
                }
            }
            var8++;
            int var15 = arg3 - var8;
            int var16 = arg3 + var8;
            if (var16 >= class108.field1650 && var15 <= class236.field3800) {
                int var17 = class197.method1264(-111, arg4 + var5, class79.field1226, class59.field957);
                int var18 = class197.method1264(-126, arg4 - var5, class79.field1226, class59.field957);
                if (class236.field3800 >= var16) {
                    class36.method282(var17, var18, arg2, class256.field4113[var16], 26175);
                }
                if (class108.field1650 <= var15) {
                    class36.method282(var17, var18, arg2, class256.field4113[var15], 26175);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILva;)Lmd;", line = 420)
    public static final class88 method1351(int arg0, int arg1, class36 arg2) {
        field3404++;
        int var3 = 53 % ((arg1 - 55) / 48);
        return class236.method1513(arg2, (byte) 123, arg0) ? class111.method711((byte) -78) : null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V", line = 466)
    public class214() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3419[var1] = this.field3422;
        }
    }
}
