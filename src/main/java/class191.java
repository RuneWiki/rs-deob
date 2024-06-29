import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class191 extends class101 {

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "I")
    public int field2529;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public int field2531;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public int field2532;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "I")
    public int field2535;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public int field2536;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public int field2538;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "I")
    public int field2541;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!sq", name = "D", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    public int field2551;

    @OriginalMember(owner = "client!sq", name = "C", descriptor = "Lsm;")
    public static class300 field2543;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "Lks;")
    public class465 field2550;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "Lab;")
    public class699 field2549;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "Ldw;")
    public class749 field2547;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "Lwia;")
    public class791 field2539;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "[I")
    public static int[] field2552;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method1315(int arg0) {
        if (arg0 != 1) {
            method1315(-91);
        }
        field2552 = null;
        field2543 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V")
    public final void method1316(byte arg0) {
        this.field2539 = null;
        this.field2547 = null;
        this.field2549 = null;
        this.field2550 = null;
        int var2 = -75 / ((arg0 + 47) / 62);
        field2542++;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IZI)V")
    public static final void method1317(int arg0, boolean arg1, int arg2) {
        if (class375.field5422 > class375.field5429) {
            class375.field5429 = (float) ((double) class375.field5429 / 30.0D + (double) class375.field5429);
            if (class375.field5429 > class375.field5422) {
                class375.field5429 = class375.field5422;
            }
            class155.method1131((byte) 108);
            class375.field5426 = (int) class375.field5429 >> 1;
            class375.field5420 = class207.method1382(class375.field5426, 8);
        } else if (class375.field5422 < class375.field5429) {
            class375.field5429 = (float) ((double) class375.field5429 - (double) class375.field5429 / 30.0D);
            if (class375.field5422 > class375.field5429) {
                class375.field5429 = class375.field5422;
            }
            class155.method1131((byte) 87);
            class375.field5426 = (int) class375.field5429 >> 1;
            class375.field5420 = class207.method1382(class375.field5426, 8);
        }
        field2530++;
        if (class587.field7831 != -1 && class232.field3167 != -1) {
            int var3 = class587.field7831 - class276.field4092;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class232.field3167 - class66.field947;
            class276.field4092 += var3;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class66.field947 -= -var4;
            if (var3 == 0 && var4 == 0) {
                class587.field7831 = -1;
                class232.field3167 = -1;
            }
            class155.method1131((byte) 83);
        }
        if (class653.field9062 <= 0) {
            class354.field5196 = -1;
            class258.field3853 = -1;
        } else {
            class526.field7210--;
            if (class526.field7210 == 0) {
                class653.field9062--;
                class526.field7210 = 100;
            }
        }
        if (arg1) {
            method1317(37, false, 95);
        }
        if (!class521.field7151 || class101.field1413 == null) {
            return;
        }
        for (class367 var5 = (class367) class101.field1413.method2551((byte) -108); var5 != null; var5 = (class367) class101.field1413.method2542(-103)) {
            class680 var6 = class375.field5418.method2232(var5.field5341.field793, 93);
            if (var5.method2294(arg2, (byte) -45, arg0)) {
                if (var6.field9534 != null) {
                    if (var6.field9534[4] != null) {
                        class251.method1684(false, var6.field9534[4], false, -1, var6.field9506, (byte) -84, true, var6.field9512, 1007, (long) var5.field5341.field793, 0, -1, (long) var5.field5341.field793);
                    }
                    if (var6.field9534[3] != null) {
                        class251.method1684(false, var6.field9534[3], false, -1, var6.field9506, (byte) -91, true, var6.field9512, 1006, (long) var5.field5341.field793, 0, -1, (long) var5.field5341.field793);
                    }
                    if (var6.field9534[2] != null) {
                        class251.method1684(false, var6.field9534[2], false, -1, var6.field9506, (byte) -115, true, var6.field9512, 1011, (long) var5.field5341.field793, 0, -1, (long) var5.field5341.field793);
                    }
                    if (var6.field9534[1] != null) {
                        class251.method1684(false, var6.field9534[1], false, -1, var6.field9506, (byte) 86, true, var6.field9512, 1002, (long) var5.field5341.field793, 0, -1, (long) var5.field5341.field793);
                    }
                    if (var6.field9534[0] != null) {
                        class251.method1684(false, var6.field9534[0], false, -1, var6.field9506, (byte) -100, true, var6.field9512, 1010, (long) var5.field5341.field793, 0, -1, (long) var5.field5341.field793);
                    }
                }
                if (!var5.field5341.field797) {
                    var5.field5341.field797 = true;
                    class173.method1238(class245.field3305, var5.field5341.field793, var6.field9512);
                }
                if (var5.field5341.field797) {
                    class173.method1238(class719.field10027, var5.field5341.field793, var6.field9512);
                }
            } else if (var5.field5341.field797) {
                var5.field5341.field797 = false;
                class173.method1238(class651.field9030, var5.field5341.field793, var6.field9512);
            }
        }
    }
}
