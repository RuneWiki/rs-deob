import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class657 {

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "Lkha;")
    private class583 field9010 = new class583();

    @OriginalMember(owner = "client!dv", name = "r", descriptor = "Llga;")
    private class711 field9017 = new class711();

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
    private int field9014;

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    private int field9013;

    @OriginalMember(owner = "client!dv", name = "q", descriptor = "Lkk;")
    private class188 field9016;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "Lgg;")
    public static class172 field9005 = new class172(0);

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
    public static int field9009 = 0;

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "Lqfa;")
    public static class98 field9012 = new class98(95, 6);

    @OriginalMember(owner = "client!dv", name = "p", descriptor = "[I")
    public static int[] field9015 = new int[13];

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field9001;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field9007;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Loia;")
    public static class88 field9011;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "()V")
    public static final void method3605() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class682.field9362.length; var1++) {
                if (class682.field9362[var1].method599()) {
                    class656.field8998[var1] = class682.field9362[var1].method597();
                } else {
                    synchronized (class682.field9362[var1]) {
                        class682.field9362[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class682.field9362[class682.field9362.length - 1].method594();
                class425.method2598(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class682.field9362.length - 1; var4++) {
                        if (!class682.field9362[var4].method599()) {
                            synchronized (class682.field9362[var4]) {
                                class682.field9362[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class682.field9362.length - 2; var6++) {
                            class682.field9362[var6].method594();
                        }
                        class425.method2598(2);
                        while (!class682.field9362[0].method599()) {
                            synchronized (class682.field9362[0]) {
                                class682.field9362[0].notify();
                            }
                            try {
                                class756.method4205(1L, 0);
                            } catch (Exception var9) {
                            }
                        }
                        class682.field9362[0].method594();
                        return;
                    }
                    try {
                        class756.method4205(1L, 0);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class756.method4205(1L, 0);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
    public final void method3606(int arg0) {
        if (arg0 != 63) {
            field9005 = null;
        }
        this.field9017.method4003(3);
        field9006++;
        this.field9016.method1175((byte) 82);
        this.field9010 = new class583();
        this.field9013 = this.field9014;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIII)V")
    public static final void method3607(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9003++;
        if (class461.field6495 >= arg4 && class143.field2050 <= arg0) {
            boolean var6;
            if (class71.field960 > arg5) {
                var6 = false;
                arg5 = class71.field960;
            } else if (arg5 <= class549.field7665) {
                var6 = true;
            } else {
                var6 = false;
                arg5 = class549.field7665;
            }
            boolean var7;
            if (arg2 < class71.field960) {
                var7 = false;
                arg2 = class71.field960;
            } else if (arg2 <= class549.field7665) {
                var7 = true;
            } else {
                var7 = false;
                arg2 = class549.field7665;
            }
            if (class143.field2050 <= arg4) {
                class643.method3557(arg5, class445.field6320[arg4++], (byte) 83, arg1, arg2);
            } else {
                arg4 = class143.field2050;
            }
            if (arg0 > class461.field6495) {
                arg0 = class461.field6495;
            } else {
                class643.method3557(arg5, class445.field6320[arg0--], (byte) 88, arg1, arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg0; var8++) {
                    int[] var9 = class445.field6320[var8];
                    var9[arg5] = var9[arg2] = arg1;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg0; var10++) {
                    class445.field6320[var10][arg5] = arg1;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg0; var11++) {
                    class445.field6320[var11][arg2] = arg1;
                }
            }
        }
        if (arg3 != -178792918) {
            method3613(false, -51);
        }
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method3608(int arg0) {
        field9005 = null;
        field9011 = null;
        field9015 = null;
        if (arg0 != 8) {
            field9009 = -99;
        }
        field9012 = null;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(JB)V")
    public final void method3609(long arg0, byte arg1) {
        field9002++;
        class583 var4 = (class583) this.field9016.method1180((byte) 26, arg0);
        if (arg1 < 126) {
            field9011 = null;
        }
        if (var4 != null) {
            var4.method1185(-92);
            var4.method3311(100);
            this.field9013++;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IZIIZ)V")
    public static final void method3610(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field9004++;
        if (!arg1 && class186.field2513 == arg2 && class557.field7832 == arg3 && class526.field7430 == class310.field4320 || class557.field7812.field6532.method1419(false) == 1) {
            return;
        }
        class310.field4320 = class526.field7430;
        class186.field2513 = arg2;
        class557.field7832 = arg3;
        if (class557.field7812.field6532.method1419(false) == 1) {
            class310.field4320 = 0;
        }
        class60.method514(arg4, arg0);
        class660.method3621(class455.field6428, class71.field908.method588((byte) 91, class549.field7669), true, 117, class478.field6780, class268.field3831);
        int var5 = class228.field3063;
        class228.field3063 = (class186.field2513 - (class336.field4683 >> 4)) * 8;
        int var6 = class3.field30;
        class3.field30 = (class557.field7832 - (class700.field9768 >> 4)) * 8;
        class342.field4780 = class678.method3781(class186.field2513 * 8, class557.field7832 * 8);
        class124.field1501 = null;
        int var7 = class228.field3063 - var5;
        int var8 = class3.field30 - var6;
        if (arg0 == 11) {
            for (int var17 = 0; var17 < class438.field6239; var17++) {
                class740 var30 = class30.field399[var17];
                if (var30 != null) {
                    class468 var31 = var30.field10289;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field8009[var32] -= var7;
                        var31.field8015[var32] -= var8;
                    }
                    var31.field1250 -= var8 * 512;
                    var31.field1264 -= var7 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class344.field4849 = 0;
            int var10 = class336.field4683 * 512 - 512;
            int var11 = (class700.field9768 - 1) * 512;
            for (int var12 = 0; var12 < class438.field6239; var12++) {
                class740 var13 = class30.field399[var12];
                if (var13 != null) {
                    class468 var14 = var13.field10289;
                    var14.field1264 -= var7 * 512;
                    var14.field1250 -= var8 * 512;
                    if (var14.field1264 >= 0 && var10 >= var14.field1264 && var14.field1250 >= 0 && var11 >= var14.field1250) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field8009[var16] -= var7;
                            var14.field8015[var16] -= var8;
                            if (var14.field8009[var16] < 0 || var14.field8009[var16] >= class336.field4683 || var14.field8015[var16] < 0 || var14.field8015[var16] >= class700.field9768) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class100.field1196[class344.field4849++] = var14.field7958;
                        } else {
                            var14.method2789(-1, null);
                            var9 = true;
                            var13.method1185(-30);
                        }
                    } else {
                        var14.method2789(-1, null);
                        var13.method1185(-56);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class438.field6239 = class373.field5230.method1177(115);
                class373.field5230.method1181(class30.field399, -1);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class280 var28 = class309.field4311[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field8009[var29] -= var7;
                    var28.field8015[var29] -= var8;
                }
                var28.field1250 -= var8 * 512;
                var28.field1264 -= var7 * 512;
            }
        }
        class584[] var19 = class98.field1180;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class584 var27 = var19[var20];
            if (var27 != null) {
                var27.field8221 -= var7 * 512;
                var27.field8216 -= var8 * 512;
            }
        }
        for (class639 var21 = (class639) class633.field8740.method2765(-12261); var21 != null; var21 = (class639) class633.field8740.method2759(-15361)) {
            var21.field8773 -= var8;
            var21.field8774 -= var7;
            if (class650.field8937 != 4 && (var21.field8774 < 0 || var21.field8773 < 0 || class336.field4683 <= var21.field8774 || var21.field8773 >= class700.field9768)) {
                var21.method1185(-105);
            }
        }
        if (class650.field8937 != 4) {
            for (class338 var22 = (class338) class178.field2391.method1176(24490); var22 != null; var22 = (class338) class178.field2391.method1178((byte) 71)) {
                int var23 = (int) (var22.field2546 & 0x3FFFL);
                int var24 = var23 - class228.field3063;
                int var25 = (int) (var22.field2546 >> 14 & 0x3FFFL);
                int var26 = var25 - class3.field30;
                if (var24 < 0 || var26 < 0 || var24 >= class336.field4683 || var26 >= class700.field9768) {
                    var22.method1185(-60);
                }
            }
        }
        if (class210.field2763 != 0) {
            class656.field8997 -= var8;
            class210.field2763 -= var7;
        }
        class397.method2481(118);
        if (arg0 != 11) {
            class32.field426 -= var8 * 512;
            class622.field8671 -= var8;
            class757.field10521 -= var7;
            class582.field8203 -= var8;
            class511.field7303 -= var7 * 512;
            class623.field8674 -= var7;
            if (Math.abs(var7) > class336.field4683 || Math.abs(var8) > class700.field9768) {
                class661.method3626(16711680);
            }
        } else if (class97.field1168 == 4) {
            class453.field6403 -= var7 * 512;
            class191.field2552 -= var8 * 512;
            class354.field5059 -= var8 * 512;
            class711.field9884 -= var7 * 512;
        } else {
            class97.field1168 = 1;
            class218.field2850 = -1;
            class419.field5919 = -1;
        }
        class361.method2312(0);
        class636.method3534(16598);
        class670.field9095.method2767((byte) -19);
        class310.field4316.method2767((byte) -19);
        class251.field3369.method2304(-86);
        class665.method3635(8);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lkha;BJ)V")
    public final void method3611(class583 arg0, byte arg1, long arg2) {
        field9001++;
        if (this.field9013 == 0) {
            class583 var5 = this.field9017.method3997(arg1 - 36);
            var5.method1185(-73);
            var5.method3311(100);
            if (this.field9010 == var5) {
                class583 var6 = this.field9017.method3997(0);
                var6.method1185(-30);
                var6.method3311(100);
            }
        } else {
            this.field9013--;
        }
        if (arg1 != 36) {
            method3607(97, -41, 22, 89, -127, -6);
        }
        this.field9016.method1179(arg2, arg0, (byte) -26);
        this.field9017.method3999(arg0, 21934);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IJ)Lkha;")
    public final class583 method3612(int arg0, long arg1) {
        field9008++;
        class583 var4 = (class583) this.field9016.method1180((byte) 26, arg1);
        if (var4 != null) {
            this.field9017.method3999(var4, 21934);
        }
        int var5 = -97 / ((arg0 + 61) / 48);
        return var4;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ZI)I")
    public static final int method3613(boolean arg0, int arg1) {
        field9000++;
        double var2 = (double) ((arg1 & 0xFFE783) >> 16) / 256.0D;
        double var4 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        if (arg0) {
            field9005 = null;
        }
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var21 >> 5 << 7) + (((var20 >> 2 & 0x3F) << 10) + (var22 >> 1));
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
    public static final void method3614(byte arg0) {
        class444.field6315++;
        if (arg0 >= -55) {
            method3610(118, false, -77, 98, true);
        }
        field9007++;
        class519 var1 = class357.method2293(class427.field5994, class639.field8783, (byte) -89);
        var1.field7384.method3694(0, -1528071456);
        class151.method1027(var1, -20);
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(I)V")
    public class657(int arg0) {
        this.field9014 = arg0;
        this.field9013 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field9016 = new class188(var2);
    }
}
