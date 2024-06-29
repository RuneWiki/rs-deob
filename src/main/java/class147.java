import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class147 extends class197 {

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "I")
    private int field2488 = 4096;

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "[I")
    private int[] field2493 = new int[3];

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field2489 = 409;

    @OriginalMember(owner = "client!hl", name = "Z", descriptor = "I")
    private int field2498 = 4096;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "I")
    private int field2490 = 4096;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "[I")
    public static int[] field2492 = new int[50];

    @OriginalMember(owner = "client!hl", name = "cb", descriptor = "I")
    public static int field2501 = 0;

    @OriginalMember(owner = "client!hl", name = "V", descriptor = "Loh;")
    public static class258 field2494 = class153.method1046("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 99);

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!hl", name = "W", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!hl", name = "X", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!hl", name = "Y", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!hl", name = "ab", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!hl", name = "bb", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILva;I)V", line = 6)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            return;
        }
        if (arg2 == 0) {
            this.field2489 = arg1.method1615(-16);
        } else if (arg2 == 1) {
            this.field2498 = arg1.method1615(arg0 - 8081);
        } else if (arg2 == 2) {
            this.field2490 = arg1.method1615(14);
        } else if (arg2 == 3) {
            this.field2488 = arg1.method1615(-126);
        } else if (arg2 == 4) {
            int var5 = arg1.method1602(18160);
            this.field2493[2] = class2.method15(255, var5) >> 12;
            this.field2493[0] = class2.method15(var5 << 4, 267386880);
            this.field2493[1] = class2.method15(var5 >> 4, 4080);
        }
        field2496++;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)I", line = 71)
    public static final int method1013(int arg0, int arg1) {
        if (arg1 != 0) {
            method1013(117, 106);
        }
        field2495++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(B)[Lvi;", line = 82)
    public static final class129[] method1014(byte arg0) {
        if (arg0 != 116) {
            field2492 = (int[]) null;
        }
        class129[] var1 = new class129[class152.field2608];
        for (int var2 = 0; var2 < class152.field2608; var2++) {
            var1[var2] = new class129(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], class37.field497[var2], class121.field2143);
        }
        class290.method2038(126);
        field2486++;
        return var1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Loh;I)V", line = 110)
    public static final void method1015(class258 arg0, int arg1) {
        field2485++;
        if (class11.field149 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1769(16);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class11.field149.length && class11.field149[var2].field2642 != var3) {
            var2++;
        }
        if (arg1 != 4096) {
            field2494 = (class258) null;
        }
        if (class11.field149.length > var2 && class11.field149[var2] != null) {
            class159.field2710.method885(67, -74);
            class159.field2710.method1603(class11.field149[var2].field2642, -1649350304);
            class300.field5126++;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIIII[[II[[F[[FII[[IIILgd;IF[[F)I", line = 155)
    public static final int method1016(boolean arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6, float[][] arg7, float[][] arg8, int arg9, int arg10, int[][] arg11, int arg12, int arg13, class157 arg14, int arg15, float arg16, float[][] arg17) {
        if (arg4 == 1) {
            int var19 = arg6;
            arg6 = arg12;
            arg12 = 128 - var19;
        } else if (arg4 == 2) {
            arg12 = 128 - arg12;
            arg6 = 128 - arg6;
        } else if (arg4 == 3) {
            int var18 = arg6;
            arg6 = 128 - arg12;
            arg12 = var18;
        }
        field2491++;
        if (arg9 != 2) {
            field2501 = -15;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg6 == 0 && arg12 == 0) {
            var20 = arg7[arg3][arg13];
            var21 = arg17[arg3][arg13];
            var22 = arg8[arg3][arg13];
            var23 = arg1;
        } else if (arg6 == 128 && arg12 == 0) {
            var23 = arg2;
            var20 = arg7[arg3 + 1][arg13];
            var21 = arg17[arg3 + 1][arg13];
            var22 = arg8[arg3 + 1][arg13];
        } else if (arg6 == 128 && arg12 == 128) {
            var21 = arg17[arg3 + 1][arg13 + 1];
            var20 = arg7[arg3 + 1][arg13 + 1];
            var23 = arg10;
            var22 = arg8[arg3 + 1][arg13 + 1];
        } else if (arg6 == 0 && arg12 == 128) {
            var23 = arg15;
            var21 = arg17[arg3][arg13 + 1];
            var22 = arg8[arg3][arg13 + 1];
            var20 = arg7[arg3][arg13 + 1];
        } else {
            float var24 = (float) arg6 / 128.0F;
            float var25 = arg8[arg3][arg13];
            float var26 = arg7[arg3][arg13];
            float var27 = (arg7[arg3 + 1][arg13] - var26) * var24 + var26;
            float var28 = arg17[arg3][arg13];
            float var29 = (float) arg12 / 128.0F;
            float var30 = (arg8[arg3 + 1][arg13] - var25) * var24 + var25;
            float var31 = arg8[arg3][arg13 + 1];
            float var32 = (arg17[arg3 + 1][arg13] - var28) * var24 + var28;
            float var33 = (arg8[arg3 + 1][arg13 + 1] - var31) * var24 + var31;
            var22 = (var33 - var30) * var29 + var30;
            float var34 = arg7[arg3][arg13 + 1];
            float var35 = (arg7[arg3 + 1][arg13 + 1] - var34) * var24 + var34;
            var20 = (var35 - var27) * var29 + var27;
            float var36 = arg17[arg3][arg13 + 1];
            float var37 = (arg17[arg3 + 1][arg13 + 1] - var36) * var24 + var36;
            int var38 = class65.method498(arg1, arg2, -15817, arg6);
            var21 = (var37 - var32) * var29 + var32;
            int var39 = class65.method498(arg15, arg10, -15817, arg6);
            var23 = class65.method498(var38, var39, -15817, arg12);
        }
        int var40 = (arg3 << 7) + arg6;
        int var41 = (arg13 << 7) + arg12;
        int var42 = class72.method537(arg3, false, arg12, arg13, arg5, arg6);
        return arg14.method1067(var40, var42, var41, var22, var20, var21, arg0 ? var23 & 0xFFFFFF00 : var23, arg11 == null ? 0.0F : (float) (var42 - class72.method537(arg3, false, arg12, arg13, arg11, arg6)) / arg16);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 370)
    public class147() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)[[I", line = 275)
    public final int[][] method101(int arg0, byte arg1) {
        field2497++;
        int var3 = -2 % ((1 - arg1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var5 = this.method1322(0, arg0, 0);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var5[0];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; var12 < class190.field3362; var12++) {
                int var13 = var8[var12];
                int var14 = var13 - this.field2493[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (var14 <= this.field2489) {
                    int var15 = var6[var12];
                    int var16 = var15 - this.field2493[1];
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (this.field2489 >= var16) {
                        int var17 = var7[var12];
                        int var18 = var17 - this.field2493[2];
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (var18 <= this.field2489) {
                            var9[var12] = this.field2488 * var13 >> 12;
                            var11[var12] = this.field2490 * var15 >> 12;
                            var10[var12] = this.field2498 * var17 >> 12;
                        } else {
                            var9[var12] = var13;
                            var11[var12] = var15;
                            var10[var12] = var17;
                        }
                    } else {
                        var9[var12] = var13;
                        var11[var12] = var15;
                        var10[var12] = var7[var12];
                    }
                } else {
                    var9[var12] = var13;
                    var11[var12] = var6[var12];
                    var10[var12] = var7[var12];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 391)
    public static void method1017(int arg0) {
        field2494 = null;
        if (arg0 <= -5) {
            field2492 = null;
        }
    }
}
