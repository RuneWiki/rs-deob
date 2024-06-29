import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class159 extends class183 {

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "[J")
    private long[] field2519 = new long[10];

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "I")
    private int field2518 = 256;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    private int field2517 = 0;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    private int field2510 = 1;

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "J")
    private long field2514 = class194.method1368((byte) 73);

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Luf;")
    public static class168 field2503 = class148.method1019(-1720, "lila:");

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "[I")
    public static int[] field2505 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Luf;")
    public static class168 field2515 = class148.method1019(-1720, "mapfunction");

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "[I")
    public static int[] field2516 = new int[5];

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "[[[B")
    public static byte[][][] field2520 = new byte[4][104][104];

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "Luf;")
    public static class168 field2513 = class148.method1019(-1720, " <col=ffff00>");

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lo;")
    public static class205 field2509 = new class205();

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Luf;")
    private static class168 field2521 = class148.method1019(-1720, "Loaded sprites");

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Luf;")
    public static class168 field2522 = field2521;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field2506;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V", line = 10)
    public static final void method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2512++;
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        int var11 = arg0 - arg5;
        int var12 = arg1 - arg5;
        int var13 = arg0 * arg0;
        int var14 = arg1 * arg1;
        int var15 = var14 << 1;
        int var16 = var11 * var11;
        int var17 = var13 << 1;
        int var18 = var16 << 1;
        int var19 = var12 * var12;
        int var20 = arg1 << 1;
        int var21 = var19 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var20) * var13 + var15;
        int var24 = var14 - ((var20 - 1) * var17);
        int var25 = -88 % ((47 - arg6) / 36);
        int var26 = var19 - ((var22 - 1) * var18);
        int var27 = (1 - var22) * var16 + var21;
        int var28 = var13 << 2;
        int var29 = var14 << 2;
        int var30 = var16 << 2;
        int var31 = var15 * 3;
        int var32 = var19 << 2;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var18;
        int var35 = (var20 - 3) * var17;
        int var36 = var29;
        int var37 = (arg1 - 1) * var28;
        int var38 = var32;
        int[] var39 = class284.field4810[arg2];
        class133.method925(14678, arg4 - arg0, arg3, arg4 - var11, var39);
        class133.method925(14678, arg4 - var11, arg7, arg4 + var11, var39);
        class133.method925(14678, arg4 + var11, arg3, arg0 + arg4, var39);
        int var40 = (var12 - 1) * var30;
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var36;
                    var36 += var29;
                    var31 += var29;
                    var8++;
                }
            }
            boolean var41 = var12 >= var9;
            if (var24 < 0) {
                var23 += var31;
                var24 += var36;
                var31 += var29;
                var36 += var29;
                var8++;
            }
            var24 += -var35;
            if (var41) {
                if (var27 < 0) {
                    while (var27 < 0) {
                        var27 += var33;
                        var10++;
                        var26 += var38;
                        var33 += var32;
                        var38 += var32;
                    }
                }
                if (var26 < 0) {
                    var27 += var33;
                    var33 += var32;
                    var10++;
                    var26 += var38;
                    var38 += var32;
                }
                var26 += -var34;
                var27 += -var40;
                var34 -= var30;
                var40 -= var30;
            }
            var9--;
            var35 -= var28;
            int var42 = arg2 - var9;
            var23 += -var37;
            var37 -= var28;
            int var43 = arg2 + var9;
            int var44 = arg4 + var8;
            int var45 = arg4 - var8;
            if (var41) {
                int var46 = arg4 - var10;
                class133.method925(14678, var45, arg3, var46, class284.field4810[var42]);
                int var47 = arg4 + var10;
                class133.method925(14678, var46, arg7, var47, class284.field4810[var42]);
                class133.method925(14678, var47, arg3, var44, class284.field4810[var42]);
                class133.method925(14678, var45, arg3, var46, class284.field4810[var43]);
                class133.method925(14678, var46, arg7, var47, class284.field4810[var43]);
                class133.method925(14678, var47, arg3, var44, class284.field4810[var43]);
            } else {
                class133.method925(14678, var45, arg3, var44, class284.field4810[var42]);
                class133.method925(14678, var45, arg3, var44, class284.field4810[var43]);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZII)I", line = 181)
    public final int method37(boolean arg0, int arg1, int arg2) {
        field2511++;
        if (!arg0) {
            return 17;
        }
        int var4 = this.field2518;
        this.field2518 = 300;
        int var5 = this.field2510;
        this.field2510 = 1;
        this.field2514 = class194.method1368((byte) -118);
        if (this.field2519[this.field2506] == 0L) {
            this.field2510 = var5;
            this.field2518 = var4;
        } else if (this.field2514 > this.field2519[this.field2506]) {
            this.field2518 = (int) ((long) (arg1 * 2560) / (this.field2514 - this.field2519[this.field2506]));
        }
        if (this.field2518 < 25) {
            this.field2518 = 25;
        }
        if (this.field2518 > 256) {
            this.field2518 = 256;
            this.field2510 = (int) ((long) arg1 - ((this.field2514 - this.field2519[this.field2506]) / 10L));
        }
        if (this.field2510 > arg1) {
            this.field2510 = arg1;
        }
        this.field2519[this.field2506] = this.field2514;
        this.field2506 = (this.field2506 + 1) % 10;
        if (this.field2510 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2519[var6] != 0L) {
                    this.field2519[var6] += (long) this.field2510;
                }
            }
        }
        if (arg2 > this.field2510) {
            this.field2510 = arg2;
        }
        int var7 = 0;
        class300.method2054(10, (long) this.field2510);
        while (this.field2517 < 256) {
            var7++;
            this.field2517 += this.field2518;
        }
        this.field2517 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)I", line = 265)
    public static int method1119(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 272)
    public static void method1120(byte arg0) {
        field2503 = null;
        field2509 = null;
        field2521 = null;
        if (arg0 <= 81) {
            return;
        }
        field2515 = null;
        field2516 = null;
        field2520 = (byte[][][]) null;
        field2505 = null;
        field2522 = null;
        field2513 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V", line = 290)
    public final void method36(byte arg0) {
        field2508++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2519[var2] = 0L;
        }
        if (arg0 < 87) {
            this.method36((byte) 32);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(II)V", line = 309)
    public static final void method1121(int arg0, int arg1) {
        if (class83.field1261 == 0) {
            class92.field1414.method555(arg1, true);
        } else {
            class282.field4765 = arg1;
        }
        field2507++;
        if (arg0 == 22256) {
            ;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 361)
    public class159() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2519[var1] = this.field2514;
        }
    }
}
