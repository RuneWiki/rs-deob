import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class138 {

    @OriginalMember(owner = "client!as", name = "h", descriptor = "I")
    public int field2434 = 2;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public int field2427 = -1;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "Z")
    public boolean field2438 = false;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "I")
    public int field2441 = 5;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "I")
    public int field2442 = -1;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public int field2449 = -1;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "Z")
    public boolean field2439 = false;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Z")
    public boolean field2445 = false;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "I")
    public int field2452 = -1;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Z")
    public boolean field2451 = false;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public int field2450 = 99;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "I")
    public int field2437 = -1;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Lsb;")
    public static class266 field2446 = new class266(42, -1);

    @OriginalMember(owner = "client!as", name = "C", descriptor = "[I")
    public static int[] field2455 = new int[2];

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!as", name = "r", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "Ln;")
    public static class17 field2453;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Lrb;")
    public class325 field2448;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "Lom;")
    public static class344 field2456;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
    private int[] field2428;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "[I")
    public int[] field2431;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "[I")
    public int[] field2440;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[Z")
    public boolean[] field2447;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
    public int[][] field2430;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILqh;)V")
    private final void method1128(int arg0, int arg1, class61 arg2) {
        field2444++;
        if (arg0 == 1) {
            int var4 = arg2.method723((byte) -25);
            this.field2431 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2431[var5] = arg2.method723((byte) -25);
            }
            this.field2440 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2440[var6] = arg2.method723((byte) -25);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2440[var7] += arg2.method723((byte) -25) << 16;
            }
        } else if (arg0 == 2) {
            this.field2427 = arg2.method723((byte) -25);
        } else if (arg0 == 3) {
            this.field2447 = new boolean[256];
            int var15 = arg2.method732(-559537960);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field2447[arg2.method732(-559537960)] = true;
            }
        } else if (arg0 == 5) {
            this.field2441 = arg2.method732(-559537960);
        } else if (arg0 == 6) {
            this.field2437 = arg2.method723((byte) -25);
        } else if (arg0 == 7) {
            this.field2449 = arg2.method723((byte) -25);
        } else if (arg0 == 8) {
            this.field2450 = arg2.method732(-559537960);
        } else if (arg0 == 9) {
            this.field2452 = arg2.method732(-559537960);
        } else if (arg0 == 10) {
            this.field2442 = arg2.method732(-559537960);
        } else if (arg0 == 11) {
            this.field2434 = arg2.method732(-559537960);
        } else if (arg0 == 12) {
            int var8 = arg2.method732(-559537960);
            this.field2428 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2428[var9] = arg2.method723((byte) -25);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2428[var10] = (arg2.method723((byte) -25) << 16) + this.field2428[var10];
            }
        } else if (arg0 == 13) {
            int var11 = arg2.method723((byte) -25);
            this.field2430 = new int[var11][];
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = arg2.method732(-559537960);
                if (var13 > 0) {
                    this.field2430[var12] = new int[var13];
                    this.field2430[var12][0] = arg2.method740((byte) 122);
                    for (int var14 = 1; var14 < var13; var14++) {
                        this.field2430[var12][var14] = arg2.method723((byte) -25);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2438 = true;
        } else if (arg0 == 15) {
            this.field2445 = true;
        } else if (arg0 == 16) {
            this.field2439 = true;
        } else if (arg0 == 18) {
            this.field2451 = true;
        }
        if (arg1 <= 32) {
            this.field2445 = false;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lqh;I)V")
    public final void method1129(class61 arg0, int arg1) {
        field2436++;
        if (arg1 >= -7) {
            this.field2451 = false;
        }
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method1128(var3, 69, arg0);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2456 = null;
        field2453 = null;
        if (arg0 == -4273) {
            field2446 = null;
            field2455 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIZI)I")
    public final int method1131(int arg0, int arg1, boolean arg2, int arg3) {
        field2429++;
        int var5 = arg3;
        int var6 = 0;
        int var7 = this.field2440[arg1];
        class501 var8 = null;
        class501 var9 = this.field2448.method2103(var7 >> 16, (byte) 41);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return arg3;
        }
        if ((this.field2445 || class537.field7512) && arg0 != -1 && arg0 < this.field2440.length) {
            int var11 = this.field2440[arg0];
            var8 = this.field2448.method2103(var11 >> 16, (byte) 41);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2438) {
            var5 = arg3 | 0x200;
        }
        if (var9.method2985(1, var10)) {
            var5 |= 0x80;
        }
        if (var9.method2987(var10, -127)) {
            var5 |= 0x100;
        }
        if (var9.method2991(var10, (byte) -17)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2985(1, var6)) {
                var5 |= 0x80;
            }
            if (var8.method2987(var6, -93)) {
                var5 |= 0x100;
            }
            if (var8.method2991(var6, (byte) -17)) {
                var5 |= 0x400;
            }
        }
        if (this.field2428 != null && arg2) {
            if (this.field2428.length > arg1) {
                int var12 = this.field2428[arg1];
                if (var12 != 65535) {
                    class501 var13 = this.field2448.method2103(var12 >> 16, (byte) 41);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2985(1, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2987(var14, -122)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2991(var14, (byte) -17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field2445 || class537.field7512) && arg0 != -1 && this.field2428.length > arg0) {
                int var15 = this.field2428[arg0];
                if (var15 != 65535) {
                    class501 var16 = this.field2448.method2103(var15 >> 16, (byte) 41);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2985(1, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2987(var17, arg3 - 85)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2991(var17, (byte) -17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BIZIIIILda;)Lda;")
    public final class55 method1132(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class55 arg7) {
        field2433++;
        int var9 = this.field2431[arg5];
        int var10 = this.field2440[arg5];
        class501 var11 = this.field2448.method2103(var10 >> 16, (byte) 41);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method357(arg0, arg3, true);
        }
        class501 var13 = null;
        if ((this.field2445 || class537.field7512) && arg4 != -1 && this.field2440.length > arg4) {
            int var14 = this.field2440[arg4];
            var13 = this.field2448.method2103(var14 >> 16, (byte) 41);
            arg4 = var14 & 0xFFFF;
        }
        if (this.field2438) {
            arg3 |= 0x200;
        }
        if (var11.method2985(1, var12)) {
            arg3 |= 0x80;
        }
        if (var11.method2987(var12, -13)) {
            arg3 |= 0x100;
        }
        if (var11.method2991(var12, (byte) -17)) {
            arg3 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2985(1, arg4)) {
                arg3 |= 0x80;
            }
            if (var13.method2987(arg4, -69)) {
                arg3 |= 0x100;
            }
            if (var13.method2991(arg4, (byte) -17)) {
                arg3 |= 0x400;
            }
        }
        int var15 = arg3 | 0x20;
        class55 var16 = arg7.method357(arg0, var15, arg2);
        var16.method650(var13, this.field2438, arg4, 43, arg6, var9, arg1 - 1, var12, var11);
        return var16;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IBZII)V")
    public static final void method1133(int arg0, byte arg1, boolean arg2, int arg3, int arg4) {
        field2454++;
        if (!arg2 && class287.field4278 == arg3 && class32.field961 == arg4 && class432.field6242 == class37.field1046 || class527.field7429.method2824(-1, class90.field1654)) {
            return;
        }
        class432.field6242 = class37.field1046;
        class32.field961 = arg4;
        if (arg1 != -16) {
            field2455 = null;
        }
        class287.field4278 = arg3;
        if (class527.field7429.method2824(-1, class90.field1654)) {
            class432.field6242 = 0;
        }
        class118.method1038(arg0, 1);
        class341.method2191(class623.field9017, class265.field3887.method1733(arg1 ^ 0xFFFFFF0F, class140.field2466), true, class363.field5394, class612.field8916, (byte) -80);
        int var5 = class33.field967;
        class33.field967 = (class287.field4278 - (class675.field9604 >> 4)) * 8;
        int var6 = class323.field4749;
        class323.field4749 = (class32.field961 - (class218.field3316 >> 4)) * 8;
        class356.field5319 = class407.method2475(class287.field4278 * 8, class32.field961 * 8);
        class696.field9803 = null;
        int var7 = class33.field967 - var5;
        int var8 = class323.field4749 - var6;
        if (arg0 == 11) {
            for (int var9 = 0; var9 < class39.field1062; var9++) {
                class436 var10 = class459.field6542[var9];
                if (var10 != null) {
                    class22 var11 = var10.field6298;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field8787[var12] -= var7;
                        var11.field8785[var12] -= var8;
                    }
                    var11.field9815 -= var8 * 512;
                    var11.field9806 -= var7 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class363.field5389 = 0;
            int var14 = class675.field9604 * 512 - 512;
            int var15 = class218.field3316 * 512 - 512;
            for (int var16 = 0; var16 < class39.field1062; var16++) {
                class436 var29 = class459.field6542[var16];
                if (var29 != null) {
                    class22 var30 = var29.field6298;
                    var30.field9806 -= var7 * 512;
                    var30.field9815 -= var8 * 512;
                    if (var30.field9806 >= 0 && var30.field9806 <= var14 && var30.field9815 >= 0 && var30.field9815 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field8787[var32] -= var7;
                            var30.field8785[var32] -= var8;
                            if (var30.field8787[var32] < 0 || var30.field8787[var32] >= class675.field9604 || var30.field8785[var32] < 0 || class218.field3316 <= var30.field8785[var32]) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class367.field5444[class363.field5389++] = var30.field8728;
                        } else {
                            var30.method461((byte) 51, null);
                            var13 = true;
                            var29.method2588(300);
                        }
                    } else {
                        var30.method461((byte) 125, null);
                        var29.method2588(300);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class39.field1062 = class208.field3179.method2603(-120);
                class208.field3179.method2599(-125, class459.field6542);
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class602 var27 = class59.field1341[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field8787[var28] -= var7;
                    var27.field8785[var28] -= var8;
                }
                var27.field9806 -= var7 * 512;
                var27.field9815 -= var8 * 512;
            }
        }
        class539[] var18 = class565.field8254;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class539 var26 = var18[var19];
            if (var26 != null) {
                var26.field7537 -= var7 * 512;
                var26.field7535 -= var8 * 512;
            }
        }
        for (class616 var20 = (class616) class81.field1588.method1224(-2); var20 != null; var20 = (class616) class81.field1588.method1232(arg1 + 14)) {
            var20.field8949 -= var8;
            var20.field8953 -= var7;
            if (class470.field6673 != 4 && (var20.field8953 < 0 || var20.field8949 < 0 || var20.field8953 >= class675.field9604 || var20.field8949 >= class218.field3316)) {
                var20.method2588(arg1 + 316);
            }
        }
        if (class470.field6673 != 4) {
            for (class38 var21 = (class38) class409.field5924.method2597((byte) 125); var21 != null; var21 = (class38) class409.field5924.method2594((byte) -122)) {
                int var22 = (int) (var21.field6132 & 0x3FFFL);
                int var23 = var22 - class33.field967;
                int var24 = (int) (var21.field6132 >> 14 & 0x3FFFL);
                int var25 = var24 - class323.field4749;
                if (var23 < 0 || var25 < 0 || var23 >= class675.field9604 || var25 >= class218.field3316) {
                    var21.method2588(arg1 ^ 0xFFFFFEDC);
                }
            }
        }
        if (class459.field6558 != 0) {
            class51.field1189 -= var8;
            class459.field6558 -= var7;
        }
        class583.method3340((byte) 121);
        if (arg0 != 11) {
            class537.field7518 -= var8 * 512;
            class184.field2956 -= var8;
            class318.field4686 -= var7;
            class206.field3158 -= var7 * 512;
            class540.field7553 -= var7;
            class448.field6449 -= var8;
            if (Math.abs(var7) > class675.field9604 || Math.abs(var8) > class218.field3316) {
                class593.method3382(-1);
            }
        } else if (class423.field6123 == 4) {
            class98.field1762 -= var7 * 512;
            class369.field5478 -= var8 * 512;
            class112.field2019 -= var7 * 512;
            class260.field3823 -= var8 * 512;
        } else {
            class423.field6123 = 1;
            class488.field6995 = -1;
            class266.field3950 = -1;
        }
        class295.method1964(-120);
        class136.method1116(arg1 ^ 0x3D);
        class140.field2467.method1222((byte) -117);
        class408.field5908.method1222((byte) -108);
        class648.field9334.method3315((byte) 68);
        class522.method3069((byte) 54);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V")
    public final void method1134(boolean arg0) {
        if (this.field2452 == -1) {
            if (this.field2447 == null) {
                this.field2452 = 0;
            } else {
                this.field2452 = 2;
            }
        }
        if (this.field2442 == -1) {
            if (this.field2447 == null) {
                this.field2442 = 0;
            } else {
                this.field2442 = 2;
            }
        }
        field2432++;
        if (!arg0) {
            this.field2431 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lda;IIIII)Lda;")
    public final class55 method1135(class55 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2435++;
        int var7 = this.field2431[arg1];
        int var8 = this.field2440[arg1];
        class501 var9 = this.field2448.method2103(var8 >> 16, (byte) 41);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method357((byte) 1, arg4, true);
        }
        class501 var11 = null;
        if ((this.field2445 || class537.field7512) && arg5 != -1 && arg5 < this.field2440.length) {
            int var12 = this.field2440[arg5];
            var11 = this.field2448.method2103(var12 >> 16, (byte) 41);
            arg5 = var12 & 0xFFFF;
        }
        class501 var13 = null;
        class501 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2428 != null) {
            if (arg1 < this.field2428.length) {
                var15 = this.field2428[arg1];
                if (var15 != 65535) {
                    var13 = this.field2448.method2103(var15 >> 16, (byte) 41);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2445 || class537.field7512) && arg5 != -1 && this.field2428.length > arg5) {
                var16 = this.field2428[arg5];
                if (var16 != 65535) {
                    var14 = this.field2448.method2103(var16 >> 16, (byte) 41);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2438) {
            arg4 |= 0x200;
        }
        if (var9.method2985(1, var10)) {
            arg4 |= 0x80;
        }
        if (var9.method2987(var10, -52)) {
            arg4 |= 0x100;
        }
        if (var9.method2991(var10, (byte) -17)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2985(1, var15)) {
                arg4 |= 0x80;
            }
            if (var13.method2987(var15, -27)) {
                arg4 |= 0x100;
            }
            if (var13.method2991(var15, (byte) -17)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2985(1, arg5)) {
                arg4 |= 0x80;
            }
            if (var11.method2987(arg5, -30)) {
                arg4 |= 0x100;
            }
            if (var11.method2991(arg5, (byte) -17)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2985(1, var16)) {
                arg4 |= 0x80;
            }
            if (var14.method2987(var16, -53)) {
                arg4 |= 0x100;
            }
            if (var14.method2991(var16, (byte) -17)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | arg3;
        class55 var18 = arg0.method357((byte) 1, var17, true);
        var18.method650(var11, this.field2438, arg5, arg3 ^ 0x23, 0, var7, arg2 - 1, var10, var9);
        if (var13 != null) {
            var18.method650(var14, this.field2438, var16, 72, 0, var7, arg2 - 1, var15, var13);
        }
        return var18;
    }
}
