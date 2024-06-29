import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class119 {

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    public static int[] field1498 = new int[1000];

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "[[S")
    public static short[][] field1512 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1496;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIIIII)V")
    public final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1497 = arg5;
        field1513++;
        if (arg8 != -1) {
            this.method651(75, 6, 121, -36, -123, -75, -71, 28, -37, 108, 96);
        }
        this.field1499 = arg2;
        this.field1508 = arg3;
        this.field1505 = arg0 * arg0;
        this.field1507 = this.field1499 + arg6;
        this.field1501 = this.field1508 + arg7;
        this.field1506 = this.field1499 + arg10;
        this.field1503 = this.field1497 + arg1;
        this.field1511 = this.field1508 + arg4;
        this.field1510 = this.field1497 + arg9;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIII)V")
    public static final void method652(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 120 % ((-arg2 - 56) / 42);
        field1500++;
        if (arg1 == 1010) {
            class218.method1399(class640.field9297, arg0, arg3);
        } else if (arg1 == 1001) {
            class218.method1399(class367.field5123, arg0, arg3);
        } else if (arg1 == 1003) {
            class218.method1399(class301.field3916, arg0, arg3);
        } else if (arg1 == 1008) {
            class218.method1399(class334.field4671, arg0, arg3);
        } else if (arg1 == 1002) {
            class218.method1399(class370.field5157, arg0, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V")
    public static final void method653(int arg0, boolean arg1) {
        if (arg1) {
            if (class126.field1565 != -1) {
                class211.method1342(122, class126.field1565);
            }
            for (class496 var2 = (class496) class523.field7289.method3473(-27089); var2 != null; var2 = (class496) class523.field7289.method3478((byte) 5)) {
                if (!var2.method591(arg0 + 121)) {
                    var2 = (class496) class523.field7289.method3473(-27089);
                    if (var2 == null) {
                        break;
                    }
                }
                class489.method2752(false, var2, true, false);
            }
            class126.field1565 = -1;
            class523.field7289 = new class607(8);
            class268.method1644(arg0 + 30000);
            class126.field1565 = class624.field9036;
            class266.method1638(true, false);
            class145.method794((byte) 120);
            class218.method1409(class126.field1565);
        }
        field1504++;
        class438.field5984 = false;
        class626.field9101 = "";
        class111.field1441 = "";
        class45.method244(true);
        class48.field659 = -1;
        class211.method1344(43, class646.field9349);
        class147.field1899 = new class20();
        class147.field1899.field6368 = class369.field5135 * 512 / 2;
        class147.field1899.field419[0] = class139.field1760 / 2;
        class147.field1899.field6362 = class139.field1760 * 512 / 2;
        class434.field5901 = arg0;
        class196.field2555 = arg0;
        class147.field1899.field417[0] = class369.field5135 / 2;
        if (class621.field8952 == 2) {
            class434.field5901 = class344.field4771 << 9;
            class196.field2555 = class174.field2248 << 9;
        } else {
            class65.method372((byte) 107);
        }
        class9.method37(arg0 + 2);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IIII)Z")
    public final boolean method654(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 2) {
            this.method651(104, 94, 96, -17, -112, 125, 42, -63, -44, 67, -128);
        }
        field1502++;
        if (arg1 < this.field1511 || arg1 > this.field1501) {
            return false;
        } else if (this.field1507 > arg0 || this.field1506 < arg0) {
            return false;
        } else if (arg2 >= this.field1503 && arg2 <= this.field1510) {
            int var5 = arg1 - this.field1508;
            int var6 = arg2 - this.field1497;
            return var5 * var5 + var6 * var6 < this.field1505;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static void method655(int arg0) {
        field1498 = null;
        field1512 = null;
        if (arg0 != 8924) {
            field1496 = null;
        }
        field1496 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1505 = arg3 * arg3;
        this.field1497 = arg2;
        this.field1508 = arg0;
        this.field1499 = arg1;
        this.field1510 = this.field1497 + arg9;
        this.field1507 = this.field1499 + arg6;
        this.field1511 = this.field1508 + arg4;
        this.field1503 = this.field1497 + arg8;
        this.field1506 = this.field1499 + arg7;
        this.field1501 = this.field1508 + arg5;
    }
}
