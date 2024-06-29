import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class304 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lbk;")
    private class90 field4528 = new class90();

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Loa;")
    private class157 field4535 = new class157();

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field4536;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field4533;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Lfa;")
    private class371 field4534;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lct;")
    public static class285 field4527 = new class285(54, 3);

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lsh;")
    public static class472 field4529 = new class472(24, 14);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Ljava/awt/Image;")
    public static Image field4532;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILcp;Ltq;)V", line = 14)
    public static final void method1895(int arg0, class481 arg1, class63 arg2) {
        field4523++;
        if (class189.field2880 == null) {
            return;
        }
        if (class286.field4374 < 10) {
            if (!class189.field2881.method2664(class189.field2880.field179, true)) {
                class286.field4374 = class150.field2106.method2692(class189.field2880.field179, (byte) 60) / 10;
                return;
            }
            class327.method2011(53);
            class286.field4374 = 10;
        }
        if (class286.field4374 == 10) {
            class189.field2912 = class189.field2880.field157 >> 6 << 6;
            class189.field2902 = class189.field2880.field163 >> 6 << 6;
            class189.field2914 = (class189.field2880.field175 >> 6 << 6) + 64 - class189.field2902;
            class189.field2899 = (class189.field2880.field180 >> 6 << 6) + 64 - class189.field2912;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class189.field2880.method124(-103, class68.field922 + (class472.field6622.field4543 >> 7), var3, (class472.field6622.field4538 >> 7) + class468.field6588, class472.field6622.field4545)) {
                var4 = var3[1] - class189.field2912;
                var5 = var3[2] - class189.field2902;
            }
            if (!class5.field91 && var4 >= 0 && class189.field2899 > var4 && var5 >= 0 && class189.field2914 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class384.field5692 = var7;
                class446.field6309 = var6;
            } else if (class231.field3397 == -1 || class473.field6634 == -1) {
                class189.field2880.method118(false, class189.field2880.field172 & 0x3FFF, (class189.field2880.field172 & 0xFFFC25D) >> 14, var3);
                class446.field6309 = var3[2] - class189.field2902;
                class384.field5692 = var3[1] - class189.field2912;
            } else {
                class189.field2880.method118(false, class473.field6634, class231.field3397, var3);
                class5.field91 = false;
                class473.field6634 = -1;
                class231.field3397 = -1;
                if (var3 != null) {
                    class446.field6309 = var3[2] - class189.field2902;
                    class384.field5692 = var3[1] - class189.field2912;
                }
            }
            if (class189.field2880.field170 == 37) {
                class189.field2890 = 3.0F;
                class189.field2894 = 3.0F;
            } else if (class189.field2880.field170 == 50) {
                class189.field2890 = 4.0F;
                class189.field2894 = 4.0F;
            } else if (class189.field2880.field170 == 75) {
                class189.field2890 = 6.0F;
                class189.field2894 = 6.0F;
            } else if (class189.field2880.field170 == 100) {
                class189.field2890 = 8.0F;
                class189.field2894 = 8.0F;
            } else if (class189.field2880.field170 == 200) {
                class189.field2890 = 16.0F;
                class189.field2894 = 16.0F;
            } else {
                class189.field2890 = 8.0F;
                class189.field2894 = 8.0F;
            }
            class189.field2892 = (int) class189.field2890 >> 1;
            class189.field2891 = class402.method2407(class189.field2892, arg0 ^ 0xFFFFFFDC);
            class174.method1195(-60);
            class189.method1303();
            class314.field4720 = new class412();
            class189.field2889 += (int) (Math.random() * 5.0D) - 2;
            if (class189.field2889 < -8) {
                class189.field2889 = -8;
            }
            class189.field2886 += (int) (Math.random() * 5.0D) - 2;
            if (class189.field2889 > 8) {
                class189.field2889 = 8;
            }
            if (class189.field2886 < -16) {
                class189.field2886 = -16;
            }
            if (class189.field2886 > 16) {
                class189.field2886 = 16;
            }
            class189.method1309(arg1, class189.field2889 >> 2 << 10, class189.field2886 >> 1);
            class189.field2877.method1112(1024, 128, 256);
            class189.field2878.method2244(256, 256, arg0 ^ 0x41);
            class189.field2884.method339(-60, 4096);
            class180.field2687.method1512(16711680, 256);
            class286.field4374 = 20;
        } else if (class286.field4374 == 20) {
            class320.method1966(true, -8109);
            class189.method1313(arg2, class189.field2889, class189.field2886);
            class286.field4374 = 60;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 60) {
            if (class189.field2881.method2659((byte) -116, class189.field2880.field179 + "_staticelements")) {
                if (!class189.field2881.method2664(class189.field2880.field179 + "_staticelements", true)) {
                    return;
                }
                class189.field2887 = class150.method1021(class189.field2880.field179 + "_staticelements", arg0 + 22, class198.field2979, class189.field2881);
            } else {
                class189.field2887 = new class486(0);
            }
            class189.method1308();
            class286.field4374 = 70;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 70) {
            class95.field1362 = new class239(arg2, 11, true, class378.field5618);
            class286.field4374 = 73;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 73) {
            class441.field6231 = new class239(arg2, 12, true, class378.field5618);
            class286.field4374 = 76;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 76) {
            class5.field88 = new class239(arg2, 14, true, class378.field5618);
            class286.field4374 = 79;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 79) {
            class99.field1406 = new class239(arg2, 17, true, class378.field5618);
            class286.field4374 = 82;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 82) {
            class337.field5042 = new class239(arg2, 19, true, class378.field5618);
            class286.field4374 = 85;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 85) {
            class128.field1785 = new class239(arg2, 22, true, class378.field5618);
            class286.field4374 = 88;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else if (class286.field4374 == 88) {
            class71.field959 = new class239(arg2, 26, true, class378.field5618);
            class286.field4374 = 91;
            class320.method1966(true, -8109);
            class382.method2331(false);
        } else {
            class301.field4487 = new class239(arg2, 30, true, class378.field5618);
            class286.field4374 = 100;
            class320.method1966(true, -8109);
            if (arg0 == 1) {
                class382.method2331(false);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JB)Lbk;", line = 245)
    public final class90 method1896(long arg0, byte arg1) {
        field4526++;
        class90 var4 = (class90) this.field4534.method2305(arg0, (byte) 38);
        if (var4 != null) {
            this.field4535.method1075((byte) -116, var4);
        }
        int var5 = -43 / ((21 - arg1) / 63);
        return var4;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 268)
    public static final void method1897(int arg0) {
        field4530++;
        if (arg0 == -8372762) {
            class31.field409.method2401((byte) -31);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(JLbk;B)V", line = 285)
    public final void method1898(long arg0, class90 arg1, byte arg2) {
        if (this.field4536 == 0) {
            class90 var5 = this.field4535.method1069((byte) 89);
            var5.method283(2);
            var5.method701(-117);
            if (this.field4528 == var5) {
                class90 var6 = this.field4535.method1069((byte) 89);
                var6.method283(arg2 ^ 0x4);
                var6.method701(arg2 ^ 0xFFFFFFDF);
            }
        } else {
            this.field4536--;
        }
        field4522++;
        this.field4534.method2307(arg0, arg1, (byte) 116);
        this.field4535.method1075((byte) -125, arg1);
        if (arg2 != 6) {
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZI)V", line = 315)
    public static final void method1899(boolean arg0, int arg1) {
        class122.field1684.method2389(false, arg1);
        if (!arg0) {
            method1901(-11);
        }
        field4524++;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)V", line = 335)
    public final void method1900(int arg0) {
        field4525++;
        if (arg0 < -70) {
            this.field4535.method1071(27536);
            this.field4534.method2299((byte) -18);
            this.field4528 = new class90();
            this.field4536 = this.field4533;
        }
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 356)
    public static void method1901(int arg0) {
        field4527 = null;
        if (arg0 != 0) {
            method1897(91);
        }
        field4532 = null;
        field4529 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V", line = 378)
    public class304(int arg0) {
        this.field4536 = arg0;
        this.field4533 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4534 = new class371(var2);
    }
}
