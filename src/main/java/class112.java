import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class112 {

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field2434 = 0;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Lo;")
    public static class84 field2431 = class15.method124("Your profile will be transferred in: ", 255);

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field2422 = -1;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2425 = 128;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
    public static int field2429 = 256;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Lo;")
    public static class84 field2433 = class15.method124(" you requested@lre@ new recovery*6n@lre@questions)3@yel@ The requested change will occur*6non: @lre@", 255);

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lba;")
    public static class8 field2423 = new class8(4096);

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "Lo;")
    public static class84 field2438 = class15.method124("Prepared sound engine", 255);

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "Lo;")
    public static class84 field2439 = class15.method124("Loading friend list", 255);

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "Lo;")
    public static class84 field2440 = class15.method124("scroll:", 255);

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lsd;")
    public static class108 field2427;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Lvb;")
    public static class121 field2432;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Z")
    public static boolean field2426;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "[Lqb;")
    public static class96[] field2437;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 19)
    public static final void method864(int arg0) {
        class24.field397 = null;
        class116.field2543 = null;
        int var1 = -113 % ((-arg0 - 50) / 36);
        class110.field2385 = null;
        class101.field2156 = null;
        class25.field432 = null;
        class78.field1668 = null;
        field2421++;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V", line = 44)
    public static final void method865(int arg0) {
        class73.field1536.method707(-127);
        field2424++;
        class62.field1287.method732(0, 0);
        class103.field2167 = class7.method51(class103.field2167);
        if (arg0 != 13) {
            method866(50, null, 67, true, 112, null);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I[IIZILjava/awt/Graphics;)V", line = 76)
    public static final void method866(int arg0, int[] arg1, int arg2, boolean arg3, int arg4, Graphics arg5) {
        class31.field621.method707(arg4 ^ 0xFFFFFFA2);
        field2436++;
        class122.field2726.method732(arg4, 0);
        if (arg3) {
            if (arg1[arg0] != -1) {
                if (arg0 == 0) {
                    class3.field39.method732(22, 10);
                }
                if (arg0 == 1) {
                    class17.field297.method732(54, 8);
                }
                if (arg0 == 2) {
                    class17.field297.method732(82, 8);
                }
                if (arg0 == 3) {
                    class60.field1247.method732(110, 8);
                }
                if (arg0 == 4) {
                    class116.field2539.method732(153, 8);
                }
                if (arg0 == 5) {
                    class116.field2539.method732(181, 8);
                }
                if (arg0 == 6) {
                    class101.field2153.method732(209, 9);
                }
            }
            if (arg1[0] != -1 && arg2 != 0) {
                class99.field2105[0].method732(29, 13);
            }
            if (arg1[1] != -1 && arg2 != 1) {
                class99.field2105[1].method732(53, 11);
            }
            if (arg1[2] != -1 && arg2 != 2) {
                class99.field2105[2].method732(82, 11);
            }
            if (arg1[3] != -1 && arg2 != 3) {
                class99.field2105[3].method732(115, 12);
            }
            if (arg1[4] != -1 && arg2 != 4) {
                class99.field2105[4].method732(153, 13);
            }
            if (arg1[5] != -1 && arg2 != 5) {
                class99.field2105[5].method732(180, 11);
            }
            if (arg1[6] != -1 && arg2 != 6) {
                class99.field2105[6].method732(208, 13);
            }
        }
        class31.field621.method705(0, arg5, 516, 160);
        class80.field1720.method707(-114);
        class17.field298.method732(0, 0);
        if (arg3) {
            if (arg1[arg0] != -1) {
                if (arg0 == 7) {
                    class38.field739.method732(42, 0);
                }
                if (arg0 == 8) {
                    class123.field2752.method732(74, 0);
                }
                if (arg0 == 9) {
                    class123.field2752.method732(102, 0);
                }
                if (arg0 == 10) {
                    class62.field1280.method732(130, 1);
                }
                if (arg0 == 11) {
                    class4.field67.method732(173, 0);
                }
                if (arg0 == 12) {
                    class4.field67.method732(201, 0);
                }
                if (arg0 == 13) {
                    class39.field797.method732(229, 0);
                }
            }
            if (arg1[8] != -1 && arg2 != 8) {
                class99.field2105[7].method732(74, 2);
            }
            if (arg1[9] != -1 && arg2 != 9) {
                class99.field2105[8].method732(102, 3);
            }
            if (arg1[10] != -1 && arg2 != 10) {
                class99.field2105[9].method732(137, 4);
            }
            if (arg1[11] != -1 && arg2 != 11) {
                class99.field2105[10].method732(174, 2);
            }
            if (arg1[12] != -1 && arg2 != 12) {
                class99.field2105[11].method732(201, 2);
            }
            if (arg1[13] != -1 && arg2 != 13) {
                class99.field2105[12].method732(226, 2);
            }
        }
        class80.field1720.method705(0, arg5, 496, 466);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 202)
    public static void method867(boolean arg0) {
        field2440 = null;
        field2438 = null;
        field2439 = null;
        field2431 = null;
        if (arg0) {
            return;
        }
        field2437 = null;
        field2432 = null;
        field2427 = null;
        field2433 = null;
        field2423 = null;
    }
}
