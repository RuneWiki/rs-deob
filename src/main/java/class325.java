import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class325 {

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "S")
    public short field4173;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "B")
    public byte field4178;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "B")
    public byte field4179;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lnl;")
    public class585 field4174;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lfh;")
    public static class266 field4176 = new class266(6, 4);

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lwl;")
    public static class679 field4177;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lfa;Lr;I)V", line = 12)
    public static final void method1862(class526 arg0, class566 arg1, int arg2) {
        field4175++;
        if (class656.field9236 == null) {
            return;
        }
        if (class294.field3634 < 10) {
            if (!class656.field9242.method3362(false, class656.field9236.field574)) {
                class294.field3634 = class381.field4806.method3352(class656.field9236.field574, 112) / 10;
                return;
            }
            class650.method3651(9811);
            class294.field3634 = 10;
        }
        if (class294.field3634 == 10) {
            class656.field9264 = class656.field9236.field573 >> 6 << 6;
            class656.field9265 = class656.field9236.field558 >> 6 << 6;
            class656.field9273 = (class656.field9236.field568 >> 6 << 6) + 64 - class656.field9264;
            class656.field9259 = (class656.field9236.field571 >> 6 << 6) + 64 - class656.field9265;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class656.field9236.method262((class376.field4748.field6461 >> 9) + class145.field1879, (class376.field4748.field6464 >> 9) + class630.field8817, var3, 255, class376.field4748.field6470)) {
                var4 = var3[1] - class656.field9265;
                var5 = var3[2] - class656.field9264;
            }
            if (!class296.field3660 && var4 >= 0 && var4 < class656.field9259 && var5 >= 0 && class656.field9273 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class198.field2501 = var7;
                class635.field8898 = var6;
            } else if (class61.field833 == -1 || class130.field1613 == -1) {
                class656.field9236.method261((class656.field9236.field560 & 0xFFFD1FB) >> 14, (byte) -119, class656.field9236.field560 & 0x3FFF, var3);
                class198.field2501 = var3[1] - class656.field9265;
                class635.field8898 = var3[2] - class656.field9264;
            } else {
                class656.field9236.method261(class61.field833, (byte) -105, class130.field1613, var3);
                class130.field1613 = -1;
                class61.field833 = -1;
                if (var3 != null) {
                    class635.field8898 = var3[2] - class656.field9264;
                    class198.field2501 = var3[1] - class656.field9265;
                }
                class296.field3660 = false;
            }
            if (class656.field9236.field562 == 37) {
                class656.field9246 = 3.0F;
                class656.field9248 = 3.0F;
            } else if (class656.field9236.field562 == 50) {
                class656.field9246 = 4.0F;
                class656.field9248 = 4.0F;
            } else if (class656.field9236.field562 == 75) {
                class656.field9246 = 6.0F;
                class656.field9248 = 6.0F;
            } else if (class656.field9236.field562 == 100) {
                class656.field9246 = 8.0F;
                class656.field9248 = 8.0F;
            } else if (class656.field9236.field562 == 200) {
                class656.field9246 = 16.0F;
                class656.field9248 = 16.0F;
            } else {
                class656.field9246 = 8.0F;
                class656.field9248 = 8.0F;
            }
            class656.field9243 = (int) class656.field9246 >> 1;
            class656.field9252 = class152.method864(false, class656.field9243);
            class28.method189(-2488);
            class656.method3689();
            class373.field4705 = new class40();
            class656.field9245 += (int) (Math.random() * 5.0D) - 2;
            if (class656.field9245 < -8) {
                class656.field9245 = -8;
            }
            class656.field9244 += (int) (Math.random() * 5.0D) - 2;
            if (class656.field9245 > 8) {
                class656.field9245 = 8;
            }
            if (class656.field9244 < -16) {
                class656.field9244 = -16;
            }
            if (class656.field9244 > 16) {
                class656.field9244 = 16;
            }
            class656.method3669(arg0, class656.field9245 >> 2 << 10, class656.field9244 >> 1);
            class656.field9234.method3777(256, true, 1024);
            class656.field9238.method3755(256, 256, false);
            class656.field9239.method3136(121, 4096);
            class452.field5800.method3567(arg2 - 42, 256);
            class294.field3634 = 20;
        } else if (class294.field3634 == 20) {
            class310.method1790(-1, true);
            class656.method3673(arg1, class656.field9245, class656.field9244);
            class294.field3634 = 60;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 60) {
            if (class656.field9242.method3373(class656.field9236.field574 + "_staticelements", true)) {
                if (!class656.field9242.method3362(false, class656.field9236.field574 + "_staticelements")) {
                    return;
                }
                class656.field9251 = class365.method2002(class656.field9242, 512, class66.field896, class656.field9236.field574 + "_staticelements");
            } else {
                class656.field9251 = new class335(0);
            }
            class656.method3681();
            class294.field3634 = 70;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 70) {
            class159.field2060 = new class543(arg1, 11, true, class500.field6585);
            class294.field3634 = 73;
            class310.method1790(arg2 + 73, true);
            class494.method2665(true);
        } else if (~class294.field3634 == arg2) {
            class458.field5842 = new class543(arg1, 12, true, class500.field6585);
            class294.field3634 = 76;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 76) {
            class305.field3770 = new class543(arg1, 14, true, class500.field6585);
            class294.field3634 = 79;
            class310.method1790(arg2 ^ 0x49, true);
            class494.method2665(true);
        } else if (class294.field3634 == 79) {
            class447.field5737 = new class543(arg1, 17, true, class500.field6585);
            class294.field3634 = 82;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 82) {
            class576.field8039 = new class543(arg1, 19, true, class500.field6585);
            class294.field3634 = 85;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 85) {
            class581.field8131 = new class543(arg1, 22, true, class500.field6585);
            class294.field3634 = 88;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else if (class294.field3634 == 88) {
            class456.field5828 = new class543(arg1, 26, true, class500.field6585);
            class294.field3634 = 91;
            class310.method1790(-1, true);
            class494.method2665(true);
        } else {
            class389.field4912 = new class543(arg1, 30, true, class500.field6585);
            class294.field3634 = 100;
            class310.method1790(-1, true);
            class494.method2665(true);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 236)
    public static void method1863(int arg0) {
        field4176 = null;
        if (arg0 == -12191) {
            field4177 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lnl;III)V", line = 253)
    public class325(class585 arg0, int arg1, int arg2, int arg3) {
        this.field4173 = (short) arg1;
        this.field4178 = (byte) arg3;
        this.field4179 = (byte) arg2;
        this.field4174 = arg0;
    }
}
