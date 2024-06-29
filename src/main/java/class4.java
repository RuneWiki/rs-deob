import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 extends RuntimeException {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field40;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "Ljava/lang/String;")
    public String field37;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field33 = 0;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "[I")
    public static int[] field36 = new int[128];

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Ljava/lang/String;")
    public static String field39 = "Loading fonts - ";

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "Lrm;")
    public static class184 field38 = new class184(64);

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lug;")
    public static class253 field41;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILjava/lang/String;)I", line = 8)
    public static final int method13(int arg0, String arg1) {
        field34++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != 26) {
            method15((byte) -83);
        }
        while (var2 < class301.field4626) {
            if (arg1.equalsIgnoreCase(class55.field768[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V", line = 39)
    public static void method14(int arg0) {
        if (arg0 != -9356) {
            method14(-93);
        }
        field36 = null;
        field38 = null;
        field39 = null;
        field41 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 57)
    public static final void method15(byte arg0) {
        field35++;
        if (class136.field2174 == null) {
            return;
        }
        if (class2.field22 < 10) {
            if (!class292.field4525.method1822(class136.field2174.field4569, true)) {
                class2.field22 = class23.field354.method1824(true, class136.field2174.field4569) / 10;
                return;
            }
            class213.method1553((byte) 49);
            class2.field22 = 10;
        }
        if (class2.field22 == 10) {
            class60.field885 = class136.field2174.field4550 >> 6 << 6;
            class251.field3959 = (class136.field2174.field4565 >> 6 << 6) - (class60.field885 - 64);
            field42 = class136.field2174.field4558 >> 6 << 6;
            int var1 = -1;
            class340.field5301 = (class136.field2174.field4556 >> 6 << 6) + 64 - field42;
            int var2 = -1;
            int[] var3 = class136.field2174.method2049((class146.field2310.field4731 >> 7) + class198.field3168, class154.field2392, (class146.field2310.field4698 >> 7) + class326.field5108, 24540);
            if (var3 != null) {
                var1 = field42 + class340.field5301 - var3[2] - 1;
                var2 = var3[1] - class60.field885;
            }
            if (var2 >= 0 && class251.field3959 > var2 && var1 >= 0 && class340.field5301 > var1) {
                int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
                class322.field5081 = var4;
                int var5 = var1 + (int) (Math.random() * 10.0D) - 5;
                class191.field3045 = var5;
            } else if (class81.field1108 == -1 || class282.field4352 == -1) {
                int[] var7 = class136.field2174.method2050(class136.field2174.field4568 & 0x3FFF, class136.field2174.field4568 >> 14 & 0x3FFF, 3);
                class322.field5081 = var7[1] - class60.field885;
                class191.field3045 = class340.field5301 - (var7[2] + -field42) - 1;
            } else {
                int[] var6 = class136.field2174.method2050(class282.field4352, class81.field1108, 3);
                if (var6 != null) {
                    class322.field5081 = var6[1] - class60.field885;
                    class191.field3045 = field42 + class340.field5301 - var6[2] - 1;
                }
                class282.field4352 = -1;
                class81.field1108 = -1;
            }
            if (class136.field2174.field4553 == 37) {
                class163.field2650 = 3.0F;
                class92.field1232 = 3.0F;
            } else if (class136.field2174.field4553 == 50) {
                class163.field2650 = 4.0F;
                class92.field1232 = 4.0F;
            } else if (class136.field2174.field4553 == 75) {
                class163.field2650 = 6.0F;
                class92.field1232 = 6.0F;
            } else if (class136.field2174.field4553 == 100) {
                class163.field2650 = 8.0F;
                class92.field1232 = 8.0F;
            } else if (class136.field2174.field4553 == 200) {
                class163.field2650 = 16.0F;
                class92.field1232 = 16.0F;
            } else {
                class163.field2650 = 8.0F;
                class92.field1232 = 8.0F;
            }
            class310.method2146(5);
            int var8 = class181.field2935 >> 2 << 10;
            class343.field5332 = new int[class267.field4165 + 1];
            int var9 = class65.field935 >> 1;
            int var10 = class340.field5301 >> 6;
            int var11 = class251.field3959 >> 6;
            class174.field2860 = new byte[var11][var10][];
            class265.field4147 = new int[var11][var10][];
            class193.field3075 = new byte[var11][var10][];
            class56.field776 = new byte[var11][var10][];
            class212.field3348 = new int[var11][var10][];
            class231.field3609 = new byte[var11][var10][];
            class68.field962 = new byte[var11][var10][];
            class232.field3629 = new int[var11][var10][];
            class72.method556(var9, 111, var8);
            class2.field22 = 20;
        } else if (class2.field22 == 20) {
            class60.method498(new class6(class292.field4525.method1836(0, class136.field2174.field4569, "underlay")), 118);
            class2.field22 = 30;
            class126.method919(132, true);
            class231.method1667(-120);
        } else if (class2.field22 == 30) {
            class117.method831((byte) -117, new class6(class292.field4525.method1836(0, class136.field2174.field4569, "overlay")));
            class2.field22 = 40;
            class231.method1667(-101);
        } else if (class2.field22 == 40) {
            class254.method1844(new class6(class292.field4525.method1836(0, class136.field2174.field4569, "overlay2")), false);
            class2.field22 = 50;
            class231.method1667(-64);
        } else if (class2.field22 == 50) {
            class157.method1136(1, new class6(class292.field4525.method1836(0, class136.field2174.field4569, "loc")));
            class2.field22 = 60;
            class126.method919(132, true);
            class231.method1667(-102);
        } else if (class2.field22 == 60) {
            if (class292.field4525.method1833(class136.field2174.field4569 + "_labels", -1)) {
                if (!class292.field4525.method1822(class136.field2174.field4569 + "_labels", true)) {
                    return;
                }
                class278.field4290 = class246.method1768(class136.field2174.field4569 + "_labels", (byte) -123, class292.field4525);
            } else {
                class278.field4290 = new class275(0);
            }
            class2.field22 = 70;
            class231.method1667(-90);
        } else if (class2.field22 == 70) {
            class257.field4058 = new class38(11, true, class116.field1615);
            class2.field22 = 73;
            class126.method919(132, true);
            class231.method1667(-80);
        } else if (class2.field22 == 73) {
            class295.field4577 = new class38(12, true, class116.field1615);
            class2.field22 = 76;
            class126.method919(132, true);
            class231.method1667(-72);
        } else if (class2.field22 == 76) {
            class22.field338 = new class38(14, true, class116.field1615);
            class2.field22 = 79;
            class126.method919(132, true);
            class231.method1667(-78);
        } else if (class2.field22 == 79) {
            class303.field4680 = new class38(17, true, class116.field1615);
            class2.field22 = 82;
            class126.method919(132, true);
            class231.method1667(-77);
        } else if (class2.field22 == 82) {
            class132.field1945 = new class38(19, true, class116.field1615);
            class2.field22 = 85;
            class126.method919(132, true);
            class231.method1667(-50);
        } else {
            int var12 = -72 % ((arg0 - 24) / 62);
            if (class2.field22 == 85) {
                class344.field5348 = new class38(22, true, class116.field1615);
                class2.field22 = 88;
                class126.method919(132, true);
                class231.method1667(-66);
            } else if (class2.field22 == 88) {
                class153.field2367 = new class38(26, true, class116.field1615);
                class2.field22 = 91;
                class126.method919(132, true);
                class231.method1667(-111);
            } else {
                class259.field4077 = new class38(30, true, class116.field1615);
                class2.field22 = 100;
                class126.method919(132, true);
                class231.method1667(-91);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I", line = 304)
    public static int method16(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 321)
    public class4(Throwable arg0, String arg1) {
        this.field40 = arg0;
        this.field37 = arg1;
    }
}
