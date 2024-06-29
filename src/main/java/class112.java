import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class112 extends class288 {

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public int field1484;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "I")
    private int field1505;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    public static int field1496 = 0;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "[I")
    public static int[] field1506 = new int[1000];

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "B")
    public static byte field1486;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IILqi;)Ljava/lang/String;")
    public static final String method690(int arg0, int arg1, class216 arg2) {
        field1502++;
        try {
            int var3 = arg2.method1378((byte) -111);
            if (var3 > arg1) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            if (arg0 != 4) {
                method699(-42);
            }
            arg2.field3021 += class95.field1267.method843(var3, var4, 0, arg2.field3021, 16, arg2.field3030);
            return class276.method1783(var3, var4, 0, (byte) 52);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BII)[I")
    public final int[] method691(byte arg0, int arg1, int arg2) {
        int var4 = 53 / ((38 - arg0) / 45);
        field1485++;
        return new int[] { this.field1488, this.field1499 - (this.field1497 - arg2), this.field1505 + arg1 + -this.field1494 };
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB)[I")
    public final int[] method692(int arg0, int arg1, byte arg2) {
        field1493++;
        return arg2 == 15 ? new int[] { this.field1489, this.field1497 + arg0 - this.field1499, this.field1494 - this.field1505 + arg1 } : null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(IIB)Z")
    public final boolean method693(int arg0, int arg1, byte arg2) {
        field1492++;
        if (arg2 < 118) {
            return false;
        } else {
            return arg1 >= this.field1499 && this.field1503 >= arg1 && arg0 >= this.field1505 && this.field1490 >= arg0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZI)Lwe;")
    public static final class82 method694(int arg0, boolean arg1, int arg2) {
        field1495++;
        if (arg1) {
            method696(-109);
        }
        class82 var3 = class182.method1187((byte) -41, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field1034 == null || var3.field1034.length <= arg0) {
            return null;
        } else {
            return var3.field1034[arg0];
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
    public static final void method695(int arg0, int arg1) {
        class66 var2 = class6.method34(4, true, arg0);
        if (arg1 != 0) {
            method694(50, false, 78);
        }
        field1491++;
        var2.method410(arg1 + 117);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method696(int arg0) {
        if (arg0 != 0) {
            field1487 = -61;
        }
        field1506 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)Z")
    public final boolean method697(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            method696(-5);
        }
        field1501++;
        return this.field1488 == arg1 && arg3 >= this.field1499 && arg3 <= this.field1503 && this.field1505 <= arg2 && arg2 <= this.field1490;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(IIB)Z")
    public final boolean method698(int arg0, int arg1, byte arg2) {
        field1500++;
        if (arg2 != 125) {
            field1506 = null;
        }
        return this.field1497 <= arg0 && this.field1484 >= arg0 && this.field1494 <= arg1 && this.field1504 >= arg1;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static final void method699(int arg0) {
        class84.method504(-76);
        field1498++;
        class220.method1430((byte) -118);
        class3.method15(0);
        class179.method1163(-13869);
        class123.method806((byte) -80);
        class283.method1880((byte) 104);
        class29.method176((byte) -112);
        class284.method1899(false);
        class99.method600((byte) 119);
        class227.method1474(-128);
        class79.method475(1);
        class269.method1726(122);
        class29.method177(16732);
        class199.method1284(-90);
        class98.method590((byte) 45);
        class294.method1967((byte) 76);
        class279.method1830((byte) 124);
        class94.method567((byte) -93);
        if (class179.field2546 != 0) {
            for (int var1 = 0; var1 < class203.field2889.length; var1++) {
                class203.field2889[var1] = null;
            }
            class229.field3275 = 0;
        }
        class114.method735(4096);
        class153.method1002(126);
        class101.field1376.method67((byte) -122);
        ((class119) class297.field4685).method775((byte) -122);
        class105.field1423.method1572(8);
        if (arg0 != -28533) {
            field1486 = 57;
        }
        class206.field2920.method1869(80);
        class188.field2701.method1869(-120);
        class185.field2685.method1869(arg0 ^ 0x6F49);
        class61.field723.method1869(-45);
        class26.field305.method1869(-117);
        class163.field2346.method1869(43);
        class217.field3074.method1869(arg0 + 28638);
        class120.field1705.method1869(62);
        class38.field465.method1869(109);
        class235.field3393.method1869(arg0 ^ 0xFFFF90CB);
        class168.field2420.method1869(-124);
        class227.field3200.method67((byte) -118);
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1494 = arg7;
        this.field1489 = arg1;
        this.field1484 = arg8;
        this.field1505 = arg3;
        this.field1499 = arg2;
        this.field1504 = arg9;
        this.field1488 = arg0;
        this.field1490 = arg5;
        this.field1497 = arg6;
        this.field1503 = arg4;
    }
}
