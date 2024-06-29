import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class395 extends class194 {

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    private int field5373 = 3072;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    private int field5375 = 1024;

    @OriginalMember(owner = "client!gp", name = "R", descriptor = "I")
    private int field5382 = 2048;

    @OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
    public static int field5379 = -1;

    @OriginalMember(owner = "client!gp", name = "L", descriptor = "Lhq;")
    public static class365 field5376 = new class365(50);

    @OriginalMember(owner = "client!gp", name = "T", descriptor = "I")
    public static int field5384 = -1;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field5374;

    @OriginalMember(owner = "client!gp", name = "M", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!gp", name = "N", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!gp", name = "P", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!gp", name = "Q", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!gp", name = "S", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class395() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        int var2 = -51 / ((arg0 - 28) / 63);
        ++field5378;
        this.field5382 = -this.field5375 + this.field5373;
    }

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "(I)V")
    public static void method2448(int arg0) {
        field5376 = null;
        if (arg0 != 76) {
            method2448(-14);
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field5381;
        if (arg0 != -730) {
            return null;
        } else {
            int[][] var3 = super.field2283.method1667(arg1, -124);
            if (super.field2283.field3451) {
                int[][] var4 = this.method1200(60, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class138.field1579; ++var11) {
                    var8[var11] = (var5[var11] * this.field5382 >> 12) + this.field5375;
                    var9[var11] = (var6[var11] * this.field5382 >> 12) + this.field5375;
                    var10[var11] = (var7[var11] * this.field5382 >> 12) + this.field5375;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field5374;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 46 % ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            int[] var5 = this.method1203(0, 124, arg0);
            for (int var6 = 0; var6 < class138.field1579; ++var6) {
                var3[var6] = this.field5375 - -(var5[var6] * this.field5382 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field2278 = ~arg2.method1563(-128) == -2;
                }
            } else {
                this.field5373 = arg2.method1587((byte) -102);
            }
        } else {
            this.field5375 = arg2.method1587((byte) -102);
        }
        int var5 = -74 % ((arg1 - 52) / 61);
        ++field5377;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lgd;Luo;B)V")
    public static final void method2449(class172 arg0, class118 arg1, byte arg2) {
        ++field5383;
        if (arg2 < 4) {
            field5384 = -84;
        }
        if (class224.field2802 != null) {
            if (~class342.field4655 > -11) {
                if (!class224.field2804.method1818((byte) 53, class224.field2802.field2301)) {
                    class342.field4655 = class33.field365.method1790(class224.field2802.field2301, 0) / 10;
                    return;
                }
                class405.method2521(0);
                class342.field4655 = 10;
            }
            if (class342.field4655 == 10) {
                class224.field2825 = class224.field2802.field2309 >> 6 << 6;
                class224.field2815 = class224.field2802.field2311 >> 6 << 6;
                class224.field2816 = (class224.field2802.field2305 >> 6 << 6) + -class224.field2825 - -64;
                class224.field2833 = (class224.field2802.field2307 >> 6 << 6) - (class224.field2815 - 64);
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class224.field2802.method1211((class143.field1684.field1516 >> 7) + class278.field3608, (class143.field1684.field1514 >> 7) + class129.field1432, true, var3, class43.field513)) {
                    var5 = var3[2] - class224.field2815;
                    var4 = var3[1] - class224.field2825;
                }
                if (!class229.field2911 && var4 >= 0 && ~class224.field2816 < ~var4 && var5 >= 0 && var5 < class224.field2833) {
                    int var6 = var5 + -5 + (int) (10.0D * Math.random());
                    int var7 = var4 + ((int) (10.0D * Math.random()) - 5);
                    class54.field633 = var7;
                    class394.field5366 = var6;
                } else if (field5384 != -1 && ~class157.field1829 != 0) {
                    class224.field2802.method1209(false, field5384, var3, class157.field1829);
                    class229.field2911 = false;
                    class157.field1829 = -1;
                    field5384 = -1;
                    if (var3 != null) {
                        class394.field5366 = var3[2] - class224.field2815;
                        class54.field633 = var3[1] - class224.field2825;
                    }
                } else {
                    class224.field2802.method1209(false, 16383 & class224.field2802.field2310 >> 14, var3, class224.field2802.field2310 & 16383);
                    class54.field633 = var3[1] + -class224.field2825;
                    class394.field5366 = var3[2] + -class224.field2815;
                }
                if (class224.field2802.field2320 != 37) {
                    if (class224.field2802.field2320 == 50) {
                        class224.field2811 = 4.0F;
                        class224.field2814 = 4.0F;
                    } else if (~class224.field2802.field2320 == -76) {
                        class224.field2811 = 6.0F;
                        class224.field2814 = 6.0F;
                    } else if (~class224.field2802.field2320 == -101) {
                        class224.field2811 = 8.0F;
                        class224.field2814 = 8.0F;
                    } else if (class224.field2802.field2320 != 200) {
                        class224.field2811 = 8.0F;
                        class224.field2814 = 8.0F;
                    } else {
                        class224.field2811 = 16.0F;
                        class224.field2814 = 16.0F;
                    }
                } else {
                    class224.field2811 = 3.0F;
                    class224.field2814 = 3.0F;
                }
                class224.field2809 = (int) class224.field2811 >> 1;
                class224.field2808 = class423.method2596(26363, class224.field2809);
                class211.method1291(131072);
                class224.method1376();
                class141.field1663 = new class270();
                class224.field2813 += (int) (Math.random() * 5.0D) - 2;
                if (class224.field2813 < -8) {
                    class224.field2813 = -8;
                }
                if (class224.field2813 > 8) {
                    class224.field2813 = 8;
                }
                class224.field2812 += -2 + (int) (Math.random() * 5.0D);
                if (class224.field2812 < -16) {
                    class224.field2812 = -16;
                }
                if (~class224.field2812 < -17) {
                    class224.field2812 = 16;
                }
                class224.method1372(arg0, class224.field2813 >> 2 << 10, class224.field2812 >> 1);
                class356.method2251(45, 1024, 256);
                class341.method2184(256, 256, (byte) -82);
                class236.method1516(4096, -54);
                class334.method2145(62, 256);
                class342.field4655 = 20;
            } else if (class342.field4655 == 20) {
                class67.method390(true, 0);
                class224.method1371(arg1, class224.field2813, class224.field2812);
                class342.field4655 = 60;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (~class342.field4655 == -61) {
                if (!class224.field2804.method1801(30441, class224.field2802.field2301 + "_staticelements")) {
                    class224.field2805 = new class392(0);
                } else {
                    if (!class224.field2804.method1818((byte) 52, class224.field2802.field2301 + "_staticelements")) {
                        return;
                    }
                    class224.field2805 = class301.method1909(class357.field4843, 122, class224.field2802.field2301 + "_staticelements", class224.field2804);
                }
                class224.method1380();
                class342.field4655 = 70;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (~class342.field4655 == -71) {
                class212.field2588 = new class117(arg1, 11, true, class357.field4845);
                class342.field4655 = 73;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (~class342.field4655 == -74) {
                class340.field4643 = new class117(arg1, 12, true, class357.field4845);
                class342.field4655 = 76;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (class342.field4655 == 76) {
                class282.field3685 = new class117(arg1, 14, true, class357.field4845);
                class342.field4655 = 79;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (class342.field4655 == 79) {
                class55.field637 = new class117(arg1, 17, true, class357.field4845);
                class342.field4655 = 82;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (class342.field4655 == 82) {
                class438.field6019 = new class117(arg1, 19, true, class357.field4845);
                class342.field4655 = 85;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (class342.field4655 == 85) {
                class414.field5680 = new class117(arg1, 22, true, class357.field4845);
                class342.field4655 = 88;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else if (~class342.field4655 == -89) {
                class373.field5059 = new class117(arg1, 26, true, class357.field4845);
                class342.field4655 = 91;
                class67.method390(true, 0);
                class274.method1722(-16915);
            } else {
                class8.field75 = new class117(arg1, 30, true, class357.field4845);
                class342.field4655 = 100;
                class67.method390(true, 0);
                class274.method1722(-16915);
                System.gc();
            }
        }
    }
}
