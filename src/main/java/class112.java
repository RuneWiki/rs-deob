import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class112 extends class332 {

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
    private int field1593;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field1597;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    private int field1592;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    private int field1589;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
    private int field1605;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field1595 = -1;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "[[S")
    public static short[][] field1590 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field1594 = new String[8];

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!mb", name = "G", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILp;)Ljava/lang/String;", line = 4)
    public static final String method764(int arg0, int arg1, class107 arg2) {
        field1599++;
        try {
            if (arg0 > -50) {
                field1590 = (short[][]) ((short[][]) null);
            }
            int var3 = arg2.method643(-14205);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field1400 += class298.field4637.method796(0, true, var4, var3, arg2.field1400, arg2.field1388);
            return class236.method1673(var3, 0, var4, -2);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZII)[I", line = 33)
    public final int[] method765(boolean arg0, int arg1, int arg2) {
        field1587++;
        return arg0 ? new int[] { this.field1605, this.field1597 + arg2 - this.field1600, -this.field1583 - -this.field1589 + arg1 } : (int[]) null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)Laf;", line = 45)
    public static final class189 method766(int arg0) {
        field1588++;
        int var1 = class54.field664[0] * class264.field4159[0];
        byte[] var2 = class153.field2105[0];
        int[] var3 = new int[var1];
        int var4 = 123 / ((32 - arg0) / 44);
        for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = class134.field1854[class229.method1613(255, var2[var5])];
        }
        class189 var6 = new class189(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], var3);
        class321.method2238(126);
        return var6;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z", line = 71)
    public final boolean method767(int arg0, int arg1, int arg2) {
        field1581++;
        if (arg0 != -1) {
            this.field1583 = -119;
        }
        return this.field1600 <= arg1 && this.field1582 >= arg1 && this.field1583 <= arg2 && this.field1598 >= arg2;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 89)
    public static void method768(int arg0) {
        field1594 = null;
        if (arg0 != -26051) {
            method764(27, 67, (class107) null);
        }
        field1590 = (short[][]) null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lcc;ZI)V", line = 102)
    public static final void method769(class263 arg0, boolean arg1, int arg2) {
        field1584++;
        int var3 = arg0.field3984 == 0 ? arg0.field3989 : arg0.field3984;
        if (arg2 != 268219088) {
            field1594 = (String[]) null;
        }
        int var4 = arg0.field4059 == 0 ? arg0.field4096 : arg0.field4059;
        class232.method1633(var4, var3, (byte) 0, class175.field2535[arg0.field4083 >> 16], arg1, arg0.field4083);
        if (arg0.field3975 != null) {
            class232.method1633(var4, var3, (byte) 0, arg0.field3975, arg1, arg0.field4083);
        }
        class343 var5 = (class343) class292.field4585.method1537((long) arg0.field4083, -22708);
        if (var5 != null) {
            class48.method281(arg1, (byte) 79, var3, var4, var5.field5329);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)[I", line = 133)
    public final int[] method770(int arg0, int arg1, int arg2) {
        if (arg1 != -26040) {
            this.field1592 = -19;
        }
        field1602++;
        return new int[] { this.field1585, this.field1600 + arg0 - this.field1597, -this.field1589 - (-this.field1583 - arg2) };
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 146)
    public static final void method771(int arg0, Component arg1) {
        field1586++;
        Method var2 = class265.field4190;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class138.field1928);
        arg1.addFocusListener(class138.field1928);
        if (arg0 != -27335) {
            field1595 = -72;
        }
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V", line = 169)
    public static final void method772(int arg0) {
        field1603++;
        class237.field3483.method1241(113);
        class191.field2748.method1241(arg0 ^ 0xFFFFC4D9);
        if (arg0 != -15197) {
            field1595 = -65;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)Z", line = 191)
    public final boolean method773(int arg0, int arg1, int arg2) {
        if (arg2 > -41) {
            this.field1585 = 94;
        }
        field1604++;
        return this.field1597 <= arg0 && arg0 <= this.field1592 && arg1 >= this.field1589 && arg1 <= this.field1593;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V", line = 211)
    public static final void method774(int arg0, boolean arg1) {
        class48.method281(arg1, (byte) 85, class188.field2712, class314.field4847, class146.field2031);
        field1601++;
        if (arg0 != -27290) {
            method774(-31, false);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z", line = 228)
    public final boolean method775(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 10429) {
            field1596++;
            return this.field1605 == arg3 && this.field1597 <= arg0 && this.field1592 >= arg0 && this.field1589 <= arg2 && this.field1593 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 241)
    public class112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1593 = arg5;
        this.field1582 = arg8;
        this.field1597 = arg2;
        this.field1583 = arg7;
        this.field1598 = arg9;
        this.field1592 = arg4;
        this.field1589 = arg3;
        this.field1600 = arg6;
        this.field1585 = arg1;
        this.field1605 = arg0;
    }
}
