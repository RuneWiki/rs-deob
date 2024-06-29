import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 {

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[Z")
    public static boolean[] field1634 = new boolean[112];

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "[I")
    public static int[] field1636 = new int[500];

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field1637 = 0;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
    public static boolean field1640 = false;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lec;")
    public static class28 field1630 = class28.method210(-46, " from your ignore list first");

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lec;")
    public static class28 field1638 = class28.method210(-46, "*6n");

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[J")
    public static long[] field1629 = new long[32];

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lpa;")
    public static class91 field1643 = new class91(500);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Z")
    public static boolean field1647 = false;

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "[I")
    public static int[] field1648 = new int[128];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "J")
    public static long field1639;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lcc;")
    public static class16 field1633;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lcc;")
    public static class16 field1645;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "[Lea;")
    public static class26[] field1646;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
    public static final void method574(int arg0, int arg1) {
        field1628++;
        if (class114.field2444 == arg1) {
            return;
        }
        if (class114.field2444 == arg0) {
            class46.method371((byte) 7);
        }
        if (arg1 == 20 || arg1 == 40) {
            class123.field2686 = 0;
            class12.field204 = 0;
            class45.field964 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class112.field2419 != null) {
            class112.field2419.method104(true);
        }
        if (class114.field2444 == 25 || class114.field2444 == 40) {
            class22.method157(126);
            class120.method906();
        }
        if (class114.field2444 == 25) {
            class14.field255 = 0;
            class72.field1614 = 1;
            class2.field24 = 1;
            class88.field1958 = 0;
            class56.field1296 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class88.method655(true);
            class68.method539(-85);
            if (class90.field1984 == null) {
                class90.field1984 = class21.method152(503, class94.method677((byte) 6), 8065, 765);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class90.field1984 = null;
            class88.method655(true);
            class53.method431(class72.field1596, class94.method677((byte) 6), class46.field1044, -29);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class90.field1984 = null;
            class68.method539(arg0 ^ 0xFFFFFF84);
            class14.method82(class94.method677((byte) 6), class46.field1044, 16772);
        }
        class114.field2444 = arg1;
        class117.field2492 = true;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method575(int arg0) {
        field1643 = null;
        field1633 = null;
        if (arg0 != -11) {
            field1640 = false;
        }
        field1645 = null;
        field1634 = null;
        field1638 = null;
        field1629 = null;
        field1630 = null;
        field1648 = null;
        field1646 = null;
        field1636 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
    public static final void method576(byte arg0) {
        class22.field513.method92((byte) -4);
        class96.field2142.method977(0, 0);
        if (arg0 == -16) {
            field1642++;
            class57.field1301 = class60.method491(class57.field1301);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIII)I")
    public static final int method577(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 440927440) {
            method578(-51);
        }
        int var5 = 65536 - class60.field1323[arg2 * 1024 / arg3] >> 1;
        field1632++;
        return ((65536 - var5) * arg1 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static final void method578(int arg0) {
        if (class43.field949 != null) {
            class43.field949.method557();
            class43.field949 = null;
        }
        if (arg0 < 66) {
            method577(-125, -36, -33, -106, -121);
        }
        field1631++;
    }
}
