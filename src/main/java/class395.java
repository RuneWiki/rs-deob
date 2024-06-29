import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class395 {

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "Laj;")
    public static class287 field5768 = new class287(260);

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "Lqfa;")
    public static class85 field5773 = new class85(109, -1);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "I")
    public static int field5767;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "I")
    private int field5769;

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lrh;")
    public static class244 field5772;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)I")
    public final int method2434(int arg0) {
        if (arg0 != 128) {
            field5768 = null;
        }
        field5771++;
        return this.field5766 & 0x3FFF;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILr;IILlk;)V")
    public static final void method2435(int arg0, class167 arg1, int arg2, int arg3, class545 arg4) {
        field5770++;
        class619 var5 = arg4.method3144(122, arg1);
        if (arg3 != -1) {
            method2436(40);
        }
        if (var5 == null) {
            return;
        }
        arg1.method142(arg0, arg2, arg4.field7718 + arg0, arg4.field7652 + arg2);
        if (class694.field9774 == 2 || class694.field9774 == 5 || class339.field5053 == null) {
            arg1.method120(-16777216, var5, arg0, arg2);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class423.field6123 == 4) {
            var7 = 4096;
            var8 = class260.field3823;
            var9 = (int) (-class591.field8509) & 0x3FFF;
            var6 = class112.field2019;
        } else {
            var6 = class532.field7456.field9806;
            var7 = 4096 - class130.field2350 * 16;
            var8 = class532.field7456.field9815;
            var9 = (int) (-class591.field8509) + class527.field7433 & 0x3FFF;
        }
        int var10 = 208 - (class675.field9604 * 2 - (var6 / 128 + 48));
        int var11 = class218.field3316 * 4 + 208 + 48 - (var8 / 128) - class218.field3316 * 2;
        class339.field5053.method3915((float) arg4.field7718 / 2.0F + (float) arg0, (float) arg4.field7652 / 2.0F + (float) arg2, (float) var10, (float) var11, var7, var9 << 2, var5, arg0, arg2);
        for (class149 var12 = (class149) class86.field1619.method1224(arg3 ^ 0x1); var12 != null; var12 = (class149) class86.field1619.method1232(-2)) {
            int var58 = var12.field2560;
            int var59 = ((class696.field9803.field3036[var58] & 0xFFFCFD8) >> 14) - class33.field967;
            int var60 = (class696.field9803.field3036[var58] & 0x3FFF) - class323.field4749;
            int var61 = var59 * 4 - (var6 / 128 - 2);
            int var62 = var60 * 4 + 2 - (var8 / 128);
            class172.method1296(class696.field9803.field3035[var58], arg4, var62, var5, false, var61, arg2, arg0, arg1);
        }
        for (int var13 = 0; var13 < class232.field3482; var13++) {
            int var55 = class157.field2680[var13] * 4 + 2 - (var6 / 128);
            int var56 = class705.field9927[var13] * 4 + 2 - (var8 / 128);
            class56 var57 = class237.field3521.method3515(class471.field6685[var13], arg3 ^ 0xFFFFFFCD);
            if (var57.field1248 != null) {
                var57 = var57.method662(3433, class113.field2038);
                if (var57 == null || var57.field1296 == -1) {
                    continue;
                }
            }
            class172.method1296(var57.field1296, arg4, var56, var5, false, var55, arg2, arg0, arg1);
        }
        for (class38 var14 = (class38) class409.field5924.method2597((byte) 31); var14 != null; var14 = (class38) class409.field5924.method2594((byte) -122)) {
            int var50 = (int) (var14.field6132 >> 28 & 0x3L);
            if (class461.field6571 == var50) {
                int var51 = (int) (var14.field6132 & 0x3FFFL) - class33.field967;
                int var52 = (int) (var14.field6132 >> 14 & 0x3FFFL) - class323.field4749;
                int var53 = var51 * 4 + 2 - (var6 / 128);
                int var54 = var52 * 4 + 2 - (var8 / 128);
                class36.method533(arg4, var54, 15687, arg2, var53, var5, class660.field9508[0], arg0);
            }
        }
        for (int var15 = 0; var15 < class363.field5389; var15++) {
            class436 var45 = (class436) class208.field3179.method2596((long) class367.field5444[var15], arg3 ^ 0xFFFFFFC8);
            if (var45 != null) {
                class22 var46 = var45.field6298;
                if (var46.method446((byte) -103) && class532.field7456.field9814 == var46.field9814) {
                    class334 var47 = var46.field880;
                    if (var47 != null && var47.field4984 != null) {
                        var47 = var47.method2150(class113.field2038, -32224);
                    }
                    if (var47 != null && var47.field4986 && var47.field4944) {
                        int var48 = var46.field9806 / 128 - var6 / 128;
                        int var49 = var46.field9815 / 128 - (var8 / 128);
                        if (var47.field4995 == -1) {
                            class36.method533(arg4, var49, 15687, arg2, var48, var5, class660.field9508[1], arg0);
                        } else {
                            class172.method1296(var47.field4995, arg4, var49, var5, false, var48, arg2, arg0, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class237.field3520;
        int[] var17 = class47.field1140;
        for (int var18 = 0; var18 < var16; var18++) {
            class602 var37 = class59.field1341[var17[var18]];
            if (var37 != null && var37.method3442((byte) -103) && class532.field7456 != var37 && class532.field7456.field9814 == var37.field9814) {
                int var38 = var37.field9806 / 128 - (var6 / 128);
                int var39 = var37.field9815 / 128 - (var8 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class164.field2749; var41++) {
                    if (var37.field8631.equals(class343.field5109[var41]) && class706.field9939[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class394.field5756; var43++) {
                    if (var37.field8631.equals(class396.field5780[var43].field7088)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class532.field7456.field8656 != 0 && var37.field8656 != 0 && class532.field7456.field8656 == var37.field8656) {
                    var44 = true;
                }
                if (var37.field8645) {
                    class36.method533(arg4, var39, 15687, arg2, var38, var5, class660.field9508[6], arg0);
                } else if (var40) {
                    class36.method533(arg4, var39, 15687, arg2, var38, var5, class660.field9508[3], arg0);
                } else if (var42) {
                    class36.method533(arg4, var39, 15687, arg2, var38, var5, class660.field9508[5], arg0);
                } else if (var44) {
                    class36.method533(arg4, var39, arg3 ^ 0xFFFFC2B8, arg2, var38, var5, class660.field9508[4], arg0);
                } else {
                    class36.method533(arg4, var39, 15687, arg2, var38, var5, class660.field9508[2], arg0);
                }
            }
        }
        class539[] var19 = class565.field8254;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class539 var23 = var19[var20];
            if (var23 != null && var23.field7539 != 0 && (class336.field5031 % 20) < 10) {
                if (var23.field7539 == 1) {
                    class436 var24 = (class436) class208.field3179.method2596((long) var23.field7536, 86);
                    if (var24 != null) {
                        class22 var25 = var24.field6298;
                        int var26 = var25.field9806 / 128 - (var6 / 128);
                        int var27 = var25.field9815 / 128 - (var8 / 128);
                        class428.method2606(360000L, 4096, arg0, arg4, var5, var27, arg2, var23.field7528, var26);
                    }
                }
                if (var23.field7539 == 2) {
                    int var28 = var23.field7537 / 128 - (var6 / 128);
                    int var29 = var23.field7535 / 128 - (var8 / 128);
                    long var30 = (long) (var23.field7529 << 7);
                    long var32 = var30 * var30;
                    class428.method2606(var32, arg3 + 4097, arg0, arg4, var5, var29, arg2, var23.field7528, var28);
                }
                if (var23.field7539 == 10 && var23.field7536 >= 0 && class59.field1341.length > var23.field7536) {
                    class602 var34 = class59.field1341[var23.field7536];
                    if (var34 != null) {
                        int var35 = var34.field9806 / 128 - (var6 / 128);
                        int var36 = var34.field9815 / 128 - var8 / 128;
                        class428.method2606(360000L, 4096, arg0, arg4, var5, var36, arg2, var23.field7528, var35);
                    }
                }
            }
        }
        if (class423.field6123 == 4) {
            return;
        }
        if (class459.field6558 != 0) {
            int var21 = class459.field6558 * 4 - (var6 / 128 - (class532.field7456.method3446(~arg3) + -1) * 2 - 2);
            int var22 = (class51.field1189 * 4 - -((class532.field7456.method3446(0) - 1) * 2)) + 2 - (var8 / 128);
            class36.method533(arg4, var22, 15687, arg2, var21, var5, class342.field5098[class202.field3118 ? 1 : 0], arg0);
        }
        arg1.method1267(arg4.field7652 / 2 + arg2 - 1, 3, 1, 3, arg4.field7718 / 2 + arg0 - 1, -1);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)V")
    public static void method2436(int arg0) {
        field5773 = null;
        if (arg0 == -23025) {
            field5768 = null;
            field5772 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public final void method2437(byte arg0) {
        if (arg0 == 5) {
            this.field5766 &= 0x3FFF;
            field5765++;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZIII)Z")
    public final boolean method2438(boolean arg0, int arg1, int arg2, int arg3) {
        field5767++;
        int var5 = this.field5769;
        if (this.field5766 == arg1 && this.field5769 == 0) {
            return false;
        }
        boolean var8;
        if (this.field5769 == 0) {
            if (arg1 > this.field5766 && arg1 <= this.field5766 + arg3 || arg1 < this.field5766 && arg1 >= this.field5766 - arg3) {
                this.field5766 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field5769 > 0 && arg1 > this.field5766) {
            int var6 = this.field5769 * this.field5769 / (arg3 * 2);
            int var7 = this.field5766 + var6;
            if (var7 < arg1 && var7 >= this.field5766) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field5769 < 0 && this.field5766 > arg1) {
            int var9 = this.field5769 * this.field5769 / (arg3 * 2);
            int var10 = this.field5766 - var9;
            if (arg1 < var10 && this.field5766 >= var10) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (this.field5766 >= arg1) {
                this.field5769 -= arg3;
                if (arg2 != 0 && this.field5769 < -arg2) {
                    this.field5769 = -arg2;
                }
            } else {
                this.field5769 += arg3;
                if (arg2 != 0 && arg2 < this.field5769) {
                    this.field5769 = arg2;
                }
            }
            if (this.field5769 != var5) {
                int var11 = this.field5769 * this.field5769 / (arg3 * 2);
                if (arg1 > this.field5766) {
                    if ((this.field5766 + var11) > arg1) {
                        this.field5769 = var5;
                    }
                } else if (this.field5766 > arg1 && arg1 > (this.field5766 - var11)) {
                    this.field5769 = var5;
                }
            }
        } else if (this.field5769 > 0) {
            this.field5769 -= arg3;
            if (this.field5769 < 0) {
                this.field5769 = 0;
            }
        } else {
            this.field5769 += arg3;
            if (this.field5769 > 0) {
                this.field5769 = 0;
            }
        }
        this.field5766 += this.field5769 + var5 >> 1;
        return arg0 ? false : var8;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "()V")
    public static final void method2439() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class438.field6320.length; var1++) {
                if (class438.field6320[var1].method2457()) {
                    class244.field3679[var1] = class438.field6320[var1].method2455();
                } else {
                    synchronized (class438.field6320[var1]) {
                        class438.field6320[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class438.field6320[class438.field6320.length - 1].method2461();
                class373.method2356(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class438.field6320.length - 1; var4++) {
                        if (!class438.field6320[var4].method2457()) {
                            synchronized (class438.field6320[var4]) {
                                class438.field6320[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class438.field6320.length - 2; var6++) {
                            class438.field6320[var6].method2461();
                        }
                        class373.method2356(2);
                        while (!class438.field6320[0].method2457()) {
                            synchronized (class438.field6320[0]) {
                                class438.field6320[0].notify();
                            }
                            try {
                                class185.method1354(1L, 10);
                            } catch (Exception var9) {
                            }
                        }
                        class438.field6320[0].method2461();
                        return;
                    }
                    try {
                        class185.method1354(1L, 10);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class185.method1354(1L, 10);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(II)V")
    public final void method2440(int arg0, int arg1) {
        this.field5766 = arg1;
        field5774++;
        if (arg0 != -9121) {
            field5773 = null;
        }
        this.field5769 = 0;
    }
}
