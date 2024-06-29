import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class728 extends class409 {

    @OriginalMember(owner = "client!vca", name = "I", descriptor = "I")
    public static int field10188 = 0;

    @OriginalMember(owner = "client!vca", name = "P", descriptor = "J")
    public static long field10195 = 0L;

    @OriginalMember(owner = "client!vca", name = "M", descriptor = "D")
    public static double field10192;

    @OriginalMember(owner = "client!vca", name = "H", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!vca", name = "J", descriptor = "I")
    public static int field10189;

    @OriginalMember(owner = "client!vca", name = "L", descriptor = "I")
    public static int field10191;

    @OriginalMember(owner = "client!vca", name = "N", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!vca", name = "O", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!vca", name = "K", descriptor = "Lnga;")
    public static class256 field10190;

    @OriginalMember(owner = "client!vca", name = "G", descriptor = "[B")
    private byte[] field10186;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)[B")
    public final byte[] method4031(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -1) {
            field10188 = 10;
        }
        this.field10186 = new byte[arg0 * arg2 * arg3 * 2];
        field10193++;
        this.method2260(arg0, arg2, arg3, (byte) 127);
        return this.field10186;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "()V")
    public static final void method4032() {
        class676.method3636(1, class126.field1511);
    }

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "(I)V")
    public static final void method4033(int arg0) {
        field10194++;
        for (int var1 = 0; var1 < 100; var1++) {
            class709.field9971[var1] = true;
        }
        if (arg0 >= -31) {
            method4032();
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIB)V")
    public final void method2343(int arg0, int arg1, byte arg2) {
        field10187++;
        int var4 = arg1 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field10186[var10001] = (byte) (var5 * 3 >> 5);
        this.field10186[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 < 43) {
            field10190 = null;
        }
    }

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "(I)V")
    public static void method4034(int arg0) {
        field10190 = null;
        if (arg0 != 0) {
            method4034(-49);
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
    public class728() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(BLha;Ld;)V")
    public static final void method4035(byte arg0, class454 arg1, class96 arg2) {
        int var3 = 52 / ((arg0 + 79) / 44);
        field10191++;
        if (class341.field4407 == null) {
            return;
        }
        if (class551.field7754 < 10) {
            if (!class341.field4410.method3825(class341.field4407.field5291, (byte) -125)) {
                class551.field7754 = class250.field3180.method3823(class341.field4407.field5291, 0) / 10;
                return;
            }
            class377.method2285(-37);
            class551.field7754 = 10;
        }
        if (class551.field7754 == 10) {
            class341.field4441 = class341.field4407.field5288 >> 6 << 6;
            class341.field4442 = class341.field4407.field5278 >> 6 << 6;
            class341.field4437 = (class341.field4407.field5287 >> 6 << 6) + 64 - class341.field4442;
            class341.field4439 = (class341.field4407.field5283 >> 6 << 6) + 64 - class341.field4441;
            int[] var4 = new int[3];
            int var5 = -1;
            int var6 = -1;
            if (class341.field4407.method2290(var4, class339.field4374.field5779, class753.field10509 + (class339.field4374.field5784 >> 9), (class339.field4374.field5790 >> 9) + class63.field851, 28512)) {
                var5 = var4[1] - class341.field4441;
                var6 = var4[2] - class341.field4442;
            }
            if (!class368.field5207 && var5 >= 0 && var5 < class341.field4439 && var6 >= 0 && class341.field4437 > var6) {
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var8 = var6 + (int) (Math.random() * 10.0D) - 5;
                class513.field7232 = var7;
                class758.field10552 = var8;
            } else if (class555.field7788 == -1 || class42.field639 == -1) {
                class341.field4407.method2289(class341.field4407.field5279 & 0x3FFF, true, var4, class341.field4407.field5279 >> 14 & 0x3FFF);
                class758.field10552 = var4[2] - class341.field4442;
                class513.field7232 = var4[1] - class341.field4441;
            } else {
                class341.field4407.method2289(class42.field639, true, var4, class555.field7788);
                class42.field639 = -1;
                class555.field7788 = -1;
                if (var4 != null) {
                    class758.field10552 = var4[2] - class341.field4442;
                    class513.field7232 = var4[1] - class341.field4441;
                }
                class368.field5207 = false;
            }
            if (class341.field4407.field5282 == 37) {
                class341.field4413 = 3.0F;
                class341.field4414 = 3.0F;
            } else if (class341.field4407.field5282 == 50) {
                class341.field4413 = 4.0F;
                class341.field4414 = 4.0F;
            } else if (class341.field4407.field5282 == 75) {
                class341.field4413 = 6.0F;
                class341.field4414 = 6.0F;
            } else if (class341.field4407.field5282 == 100) {
                class341.field4413 = 8.0F;
                class341.field4414 = 8.0F;
            } else if (class341.field4407.field5282 == 200) {
                class341.field4413 = 16.0F;
                class341.field4414 = 16.0F;
            } else {
                class341.field4413 = 8.0F;
                class341.field4414 = 8.0F;
            }
            class341.field4420 = (int) class341.field4413 >> 1;
            class341.field4416 = class670.method3622((byte) 77, class341.field4420);
            class608.method3333((byte) -111);
            class341.method2015();
            class419.field5962 = new class547();
            class341.field4415 += (int) (Math.random() * 5.0D) - 2;
            if (class341.field4415 < -8) {
                class341.field4415 = -8;
            }
            if (class341.field4415 > 8) {
                class341.field4415 = 8;
            }
            class341.field4419 += (int) (Math.random() * 5.0D) - 2;
            if (class341.field4419 < -16) {
                class341.field4419 = -16;
            }
            if (class341.field4419 > 16) {
                class341.field4419 = 16;
            }
            class341.method2013(arg2, class341.field4415 >> 2 << 10, class341.field4419 >> 1);
            class341.field4406.method2768(1024, (byte) 116, 256);
            class341.field4408.method1482(116, 256, 256);
            class341.field4404.method885(4096, (byte) 97);
            class197.field2537.method2535(256, (byte) -8);
            class551.field7754 = 20;
        } else if (class551.field7754 == 20) {
            class9.method41(true, false);
            class341.method2003(arg1, class341.field4415, class341.field4419);
            class551.field7754 = 60;
            class9.method41(true, false);
            class541.method3081(-44);
        } else if (class551.field7754 == 60) {
            if (class341.field4410.method3821(8933, class341.field4407.field5291 + "_staticelements")) {
                if (!class341.field4410.method3825(class341.field4407.field5291 + "_staticelements", (byte) -123)) {
                    return;
                }
                class341.field4417 = class634.method3448(1, class680.field9235, class341.field4410, class341.field4407.field5291 + "_staticelements");
            } else {
                class341.field4417 = new class660(0);
            }
            class341.method1999();
            class551.field7754 = 70;
            class9.method41(true, false);
            class541.method3081(-58);
        } else if (class551.field7754 == 70) {
            class70.field950 = new class429(arg1, 11, true, class68.field939);
            class551.field7754 = 73;
            class9.method41(true, false);
            class541.method3081(-128);
        } else if (class551.field7754 == 73) {
            class373.field5246 = new class429(arg1, 12, true, class68.field939);
            class551.field7754 = 76;
            class9.method41(true, false);
            class541.method3081(-61);
        } else if (class551.field7754 == 76) {
            class169.field2234 = new class429(arg1, 14, true, class68.field939);
            class551.field7754 = 79;
            class9.method41(true, false);
            class541.method3081(-69);
        } else if (class551.field7754 == 79) {
            class726.field10170 = new class429(arg1, 17, true, class68.field939);
            class551.field7754 = 82;
            class9.method41(true, false);
            class541.method3081(-43);
        } else if (class551.field7754 == 82) {
            class137.field1624 = new class429(arg1, 19, true, class68.field939);
            class551.field7754 = 85;
            class9.method41(true, false);
            class541.method3081(-61);
        } else if (class551.field7754 == 85) {
            class694.field9821 = new class429(arg1, 22, true, class68.field939);
            class551.field7754 = 88;
            class9.method41(true, false);
            class541.method3081(-97);
        } else if (class551.field7754 == 88) {
            class499.field7057 = new class429(arg1, 26, true, class68.field939);
            class551.field7754 = 91;
            class9.method41(true, false);
            class541.method3081(-70);
        } else {
            class470.field6749 = new class429(arg1, 30, true, class68.field939);
            class551.field7754 = 100;
            class9.method41(true, false);
            class541.method3081(-101);
            System.gc();
        }
    }
}
