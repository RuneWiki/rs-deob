import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class192 {

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2642 = new Rectangle[100];

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
    public static boolean field2648;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field2635;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public int field2647;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[S")
    public static short[] field2639;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field2642[var0] = new Rectangle();
        }
        field2648 = false;
        field2649 = -1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method1243(int arg0) {
        if (arg0 != 3) {
            field2648 = false;
        }
        field2638++;
        return (this.field2635 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Z", line = 18)
    public final boolean method1244(int arg0) {
        if (arg0 != 8) {
            this.field2647 = 49;
        }
        field2643++;
        return (this.field2635 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lkh;I)Lgk;", line = 29)
    public static final class279 method1245(class11 arg0, int arg1) {
        field2640++;
        if (arg1 > -63) {
            return null;
        } else {
            class279 var2 = new class279();
            var2.field3914 = arg0.method174(255);
            var2.field3913 = class54.method443(var2.field3914, false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V", line = 45)
    public static void method1246(int arg0) {
        int var1 = -127 % ((71 - arg0) / 33);
        field2639 = null;
        field2642 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method1247(byte arg0) {
        if (arg0 == -56) {
            field2636++;
            return (this.field2635 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IB)I", line = 70)
    public static final int method1248(int arg0, byte arg1) {
        field2646++;
        if (arg1 > -36) {
            field2648 = false;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BII)Z", line = 83)
    public static final boolean method1249(byte arg0, int arg1, int arg2) {
        int var3 = 37 % ((arg0 + 31) / 33);
        field2641++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        class64 var4 = class375.method2395((byte) 40, arg1);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var4.method495(arg2, (byte) -53);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)Z", line = 103)
    public final boolean method1250(byte arg0) {
        field2645++;
        if (arg0 != 17) {
            method1246(116);
        }
        return (this.field2635 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lja;ILuo;)V", line = 123)
    public static final void method1251(class152 arg0, int arg1, class345 arg2) {
        field2644++;
        if (class354.field4829 == null) {
            return;
        }
        if (class89.field1244 < 10) {
            if (!class354.field4828.method1749(0, class354.field4829.field5748)) {
                class89.field1244 = class370.field5203.method1738(class354.field4829.field5748, true) / 10;
                return;
            }
            class292.method1889((byte) -120);
            class89.field1244 = 10;
        }
        if (class89.field1244 == 10) {
            class354.field4843 = class354.field4829.field5756 >> 6 << 6;
            class354.field4858 = class354.field4829.field5755 >> 6 << 6;
            class354.field4841 = (class354.field4829.field5761 >> 6 << 6) + 64 - class354.field4843;
            class354.field4857 = (class354.field4829.field5745 >> 6 << 6) + 64 - class354.field4858;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class354.field4829.method2539(var3, Integer.MAX_VALUE, (class412.field5841.field6262 >> 7) + class212.field2968, class142.field2034, class447.field6269 + (class412.field5841.field6266 >> 7))) {
                var5 = var3[2] - class354.field4858;
                var4 = var3[1] - class354.field4843;
            }
            if (!class423.field5983 && var4 >= 0 && var4 < class354.field4841 && var5 >= 0 && var5 < class354.field4857) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class222.field3100 = var7;
                class254.field3580 = var6;
            } else if (class275.field3834 == -1 || class135.field1962 == -1) {
                class354.field4829.method2540(var3, class354.field4829.field5749 & 0x3FFF, class354.field4829.field5749 >> 14 & 0x3FFF, 9);
                class222.field3100 = var3[1] - class354.field4843;
                class254.field3580 = var3[2] - class354.field4858;
            } else {
                class354.field4829.method2540(var3, class135.field1962, class275.field3834, 14);
                if (var3 != null) {
                    class254.field3580 = var3[2] - class354.field4858;
                    class222.field3100 = var3[1] - class354.field4843;
                }
                class135.field1962 = -1;
                class275.field3834 = -1;
                class423.field5983 = false;
            }
            if (class354.field4829.field5751 == 37) {
                class354.field4834 = 3.0F;
                class354.field4838 = 3.0F;
            } else if (class354.field4829.field5751 == 50) {
                class354.field4834 = 4.0F;
                class354.field4838 = 4.0F;
            } else if (class354.field4829.field5751 == 75) {
                class354.field4834 = 6.0F;
                class354.field4838 = 6.0F;
            } else if (class354.field4829.field5751 == 100) {
                class354.field4834 = 8.0F;
                class354.field4838 = 8.0F;
            } else if (class354.field4829.field5751 == 200) {
                class354.field4834 = 16.0F;
                class354.field4838 = 16.0F;
            } else {
                class354.field4834 = 8.0F;
                class354.field4838 = 8.0F;
            }
            class354.field4839 = (int) class354.field4834 >> 1;
            class354.field4832 = class157.method1054(0, class354.field4839);
            class410.method2564((byte) -42);
            class354.method2276();
            class135.field1963 = new class90();
            class354.field4835 += (int) (Math.random() * 5.0D) - 2;
            if (class354.field4835 < -8) {
                class354.field4835 = -8;
            }
            if (class354.field4835 > 8) {
                class354.field4835 = 8;
            }
            class354.field4837 += (int) (Math.random() * 5.0D) - 2;
            if (class354.field4837 < -16) {
                class354.field4837 = -16;
            }
            if (class354.field4837 > 16) {
                class354.field4837 = 16;
            }
            class354.method2279(arg0, class354.field4835 >> 2 << 10, class354.field4837 >> 1);
            class341.method2166(256, 0, 1024);
            class453.method2812(256, 31777, 256);
            class80.method579(4096, (byte) 121);
            class418.method2623(0, 256);
            class89.field1244 = 20;
        } else if (class89.field1244 == 20) {
            class95.method673(true, true);
            class354.method2266(arg2, class354.field4835, class354.field4837);
            class89.field1244 = 60;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 60) {
            if (class354.field4828.method1741(class354.field4829.field5748 + "_staticelements", (byte) -26)) {
                if (!class354.field4828.method1749(0, class354.field4829.field5748 + "_staticelements")) {
                    return;
                }
                class354.field4836 = class100.method718(class21.field393, class354.field4829.field5748 + "_staticelements", (byte) 33, class354.field4828);
            } else {
                class354.field4836 = new class92(0);
            }
            class354.method2261();
            class89.field1244 = 70;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 70) {
            class108.field1557 = new class435(arg2, 11, true, class304.field4191);
            class89.field1244 = 73;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 73) {
            class352.field4822 = new class435(arg2, 12, true, class304.field4191);
            class89.field1244 = 76;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 76) {
            class218.field3020 = new class435(arg2, 14, true, class304.field4191);
            class89.field1244 = 79;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 79) {
            class348.field4791 = new class435(arg2, 17, true, class304.field4191);
            class89.field1244 = 82;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 82) {
            class56.field769 = new class435(arg2, 19, true, class304.field4191);
            class89.field1244 = 85;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 85) {
            class334.field4602 = new class435(arg2, 22, true, class304.field4191);
            class89.field1244 = 88;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else if (class89.field1244 == 88) {
            class415.field5896 = new class435(arg2, 26, true, class304.field4191);
            class89.field1244 = 91;
            class95.method673(true, true);
            class195.method1263((byte) -50);
        } else {
            if (arg1 < 14) {
                method1249((byte) 79, -55, 30);
            }
            class349.field4799 = new class435(arg2, 30, true, class304.field4191);
            class89.field1244 = 100;
            class95.method673(true, true);
            class195.method1263((byte) -50);
            System.gc();
        }
    }
}
