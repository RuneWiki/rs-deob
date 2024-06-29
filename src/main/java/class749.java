import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class749 extends class601 {

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "Lal;")
    public static class125 field10301 = new class125();

    @OriginalMember(owner = "client!cl", name = "t", descriptor = "Lkr;")
    public static class602 field10307 = new class602(121, -1);

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field10303;

    @OriginalMember(owner = "client!cl", name = "q", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            this.method4160(25);
        }
        ++field10306;
        return ~super.field8137.method2156((byte) 113).method1934(10135) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field10299;
        int var2 = 64 % ((arg0 - 59) / 33);
        if (~super.field8137.method2156((byte) 103).method1934(10135) > -97) {
            super.field8131 = 0;
        }
        if (super.field8131 < 0 || super.field8131 > 2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
    public final int method4160(int arg0) {
        if (arg0 != 0) {
            this.method36(77, (byte) 66);
        }
        ++field10300;
        return super.field8131;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(ILqea;)V")
    public class749(int arg0, class339 arg1) {
        super(arg0, arg1);
        class232.method1497(super.field8131, 0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lha;IIIIIIZZ)V")
    public static final void method4161(class548 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, boolean arg8) {
        class441.field6132 = arg0;
        class265.field3895 = arg1;
        class520.field7248 = class265.field3895 > 1 && class441.field6132.method1472();
        class371.field5241 = arg2;
        class368.field5213 = 1 << class371.field5241;
        class292.field4190 = class368.field5213 >> 1;
        Math.sqrt((double) (class292.field4190 * class292.field4190 + class292.field4190 * class292.field4190));
        class370.field5229 = arg3;
        class61.field877 = arg4;
        class713.field9959 = arg5;
        class218.field2854 = arg6;
        class720.field10021 = class589.method3400((byte) 110);
        class300.method1980(-124);
        class320.field4443 = new class262[arg3][class61.field877][class713.field9959];
        class550.field7649 = new class341[arg3];
        if (arg7) {
            class644.field8632 = new int[class61.field877][class713.field9959];
            class151.field2085 = new byte[class61.field877][class713.field9959];
            class680.field9452 = new short[class61.field877][class713.field9959];
            class319.field4435 = new class262[1][class61.field877][class713.field9959];
            class371.field5240 = new class341[1];
        } else {
            class644.field8632 = null;
            class151.field2085 = null;
            class680.field9452 = null;
            class319.field4435 = null;
            class371.field5240 = null;
        }
        if (arg8) {
            class142.field2015 = new long[arg3][arg4][arg5];
            class532.field7385 = new class131[65535];
            class325.field4491 = new boolean[65535];
            class486.field6796 = 0;
        } else {
            class142.field2015 = null;
            class532.field7385 = null;
            class325.field4491 = null;
            class486.field6796 = 0;
        }
        class732.method4078(false);
        class234.field3474 = new class318[2];
        class333.field4710 = new class318[2];
        class204.field2694 = new class318[2];
        class324.field4481 = new class318[10000];
        class450.field6246 = 0;
        class274.field3967 = new class318[5000];
        class477.field6643 = 0;
        class529.field7337 = new class395[5000];
        class323.field4472 = 0;
        class417.field5900 = new boolean[class218.field2854 + class218.field2854 + 1][class218.field2854 + class218.field2854 + 1];
        class679.field9426 = new boolean[class218.field2854 + class218.field2854 + 2][class218.field2854 + class218.field2854 + 2];
        class391.field5626 = new int[class218.field2854 + class218.field2854 + 2];
        class269.field3931 = class269.field3929;
        if (class520.field7248) {
            class172.field2387 = new boolean[arg3][class218.field2854 + class218.field2854 + 1][class218.field2854 + class218.field2854 + 1];
            class507.field7051 = new boolean[arg3][][];
            if (class280.field4069 != null) {
                class122.method760();
            }
            class280.field4069 = new class94[class265.field3895];
            class441.field6132.method1521(class280.field4069.length + 1);
            class441.field6132.method1540(0);
            for (int var9 = 0; var9 < class280.field4069.length; ++var9) {
                class280.field4069[var9] = new class94(var9 + 1, class441.field6132);
                (new Thread(class280.field4069[var9], "wr" + var9)).start();
            }
            byte var10;
            if (class265.field3895 == 2) {
                var10 = 4;
                class515.field7130 = 2;
            } else if (class265.field3895 == 3) {
                var10 = 6;
                class515.field7130 = 3;
            } else {
                var10 = 8;
                class515.field7130 = 4;
            }
            class690.field9610 = new class699[var10];
            for (int var11 = 0; var11 < var10; ++var11) {
                class690.field9610[var11] = new class699(class436.field6078[class265.field3895 - 2][var11]);
            }
        } else {
            class515.field7130 = 1;
        }
        class454.field6293 = new int[class515.field7130 - 1];
        class159.field2223 = new int[class515.field7130 - 1];
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        super.field8131 = arg1;
        int var3 = -6 % ((22 - arg0) / 34);
        ++field10303;
        class232.method1497(super.field8131, 0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        ++field10304;
        if (arg0 != 8976) {
            field10301 = null;
        }
        return super.field8137.method2156((byte) 102).method1934(10135) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
    public static void method4162(int arg0) {
        if (arg0 != 0) {
            method4161((class548) null, 11, -10, 50, -95, 76, 87, true, false);
        }
        field10307 = null;
        field10301 = null;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(I)Z")
    public final boolean method4163(int arg0) {
        ++field10302;
        if (super.field8137.method2156((byte) 102).method1934(10135) < 96) {
            return false;
        } else {
            if (arg0 != 2048) {
                this.method36(33, (byte) -76);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lqea;)V")
    public class749(class339 arg0) {
        super(arg0);
        class232.method1497(super.field8131, 0);
    }
}
