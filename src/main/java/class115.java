import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class115 extends class36 {

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "C")
    private char field1562;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field1564;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public int field1567;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Ljava/lang/String;")
    public String field1565;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "[I")
    public static int[] field1555;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V", line = 4)
    public static final void method847(int arg0, int arg1) {
        class202 var2 = class142.field1940[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class202 var4 = class142.field1940[var3][arg0][arg1] = class142.field1940[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2884--;
                for (int var5 = 0; var5 < var4.field2875; var5++) {
                    class280 var6 = var4.field2896[var5];
                    if ((var6.field4203 >> 29 & 0x3L) == 2L && var6.field4204 == arg0 && var6.field4200 == arg1) {
                        var6.field4208--;
                    }
                }
            }
        }
        if (class142.field1940[0][arg0][arg1] == null) {
            class142.field1940[0][arg0][arg1] = new class202(0, arg0, arg1);
        }
        class142.field1940[0][arg0][arg1].field2888 = var2;
        class142.field1940[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcg;II)V", line = 43)
    private final void method848(class316 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1562 = class266.method1807(arg0.method2192(3), true);
        } else if (arg1 == 2) {
            this.field1567 = arg0.method2172((byte) 71);
        } else if (arg1 == 5) {
            this.field1565 = arg0.method2158(-872702056);
        }
        field1566++;
        int var4 = -119 % ((-arg2 - 12) / 59);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)Z", line = 70)
    public final boolean method849(int arg0) {
        if (arg0 != -116) {
            this.field1567 = -7;
        }
        field1556++;
        return this.field1562 == 's';
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 85)
    public static final Class method850(int arg0, String arg1) throws ClassNotFoundException {
        if (arg0 != 15) {
            method854((byte) -1, 105);
        }
        field1557++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILcg;)V", line = 128)
    public final void method851(int arg0, class316 arg1) {
        if (arg0 != -152) {
            method852(-92);
        }
        while (true) {
            int var3 = arg1.method2219(16448);
            if (var3 == 0) {
                field1563++;
                return;
            }
            this.method848(arg1, var3, 118);
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V", line = 150)
    public static void method852(int arg0) {
        int var1 = 26 / ((-arg0 - 35) / 47);
        field1555 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIII)V", line = 158)
    public static final void method853(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class125.field1700 < 100) {
            class232.method1603((byte) 104);
        }
        field1559++;
        if (class67.field908) {
            class102.method753(arg1, arg3, arg1 + arg4, arg2 + arg3);
        } else {
            class38.method220(arg1, arg3, arg1 + arg4, arg3 - -arg2);
        }
        if (class125.field1700 < 100) {
            byte var5 = 20;
            int var6 = arg1 + (arg4 / 2);
            int var7 = arg2 / 2 + arg3 - var5 - 18;
            if (class67.field908) {
                class102.method738(arg1, arg3, arg4, arg2, 0);
                class102.method750(var6 - 152, var7, 304, 34, 9179409);
                class102.method750(var6 - 151, var7 - -1, 302, 32, 0);
                class102.method738(var6 - 150, var7 + 2, class125.field1700 * 3, 30, 9179409);
                class102.method738(class125.field1700 * 3 + (var6 - 150), var7 - -2, 300 - class125.field1700 * 3, 30, 0);
            } else {
                class38.method224(arg1, arg3, arg4, arg2, 0);
                class38.method216(var6 - 152, var7, 304, 34, 9179409);
                class38.method216(var6 - 151, var7 + 1, 302, 32, 0);
                class38.method224(var6 - 150, var7 + 2, class125.field1700 * 3, 30, 9179409);
                class38.method224(class125.field1700 * 3 + var6 - 150, var7 + 2, 300 - (class125.field1700 * 3), 30, 0);
            }
            class204.field2946.method1909(class113.field1553, var6, var5 + var7, 16777215, -1);
            return;
        }
        int var8 = class312.field4712 - (int) ((float) arg4 / class273.field4084);
        class22.field289 = class312.field4712 - (int) ((float) arg4 / class273.field4084);
        class207.field2981 = class170.field2315 - ((int) ((float) arg2 / class273.field4084));
        int var9 = class170.field2315 - (int) ((float) arg2 / class273.field4084);
        class138.field1900 = (int) ((float) (arg2 * 2) / class273.field4084);
        int var10 = class312.field4712 + ((int) ((float) arg4 / class273.field4084));
        class31.field374 = (int) ((float) (arg4 * 2) / class273.field4084);
        int var11 = (int) ((float) arg2 / class273.field4084) + class170.field2315;
        if (class67.field908) {
            if (class145.field2003 == null || class145.field2003.field2323 != arg4 || class145.field2003.field2317 != arg2) {
                class145.field2003 = null;
                class145.field2003 = new class178(arg4, arg2);
            }
            class38.method228(class145.field2003.field2403, arg4, arg2);
            class287.method1966(-799384912, var11, arg2, var10, var9, 0, 0, var8, arg4);
            class155.method1124(var9, class66.field869, var11, 0, var10, arg2, (byte) 111, 0, arg4, var8);
            class221.method1559(0, arg4, var8, 0, var10, var9, 19317, arg2, var11);
            class145.field2003.method1240();
            class102.method744(class145.field2003.field2403, arg1, arg3, arg4, arg2);
            class38.field429 = null;
        } else {
            class287.method1966(-799384912, var11, arg2 + arg3, var10, var9, arg1, arg3, var8, arg1 + arg4);
            class155.method1124(var9, class66.field869, var11, arg1, var10, arg2 + arg3, (byte) 76, arg3, arg1 + arg4, var8);
            class221.method1559(arg1, arg1 + arg4, var8, arg3, var10, var9, 19317, arg3 + arg2, var11);
        }
        if (~class129.field1776 < arg0) {
            class162.field2229--;
            if (class162.field2229 == 0) {
                class129.field1776--;
                class162.field2229 = 20;
            }
        }
        if (!class221.field3165) {
            return;
        }
        int var12 = arg2 + arg3 - 8;
        int var13 = arg1 + arg4 - 5;
        int var14 = 16776960;
        class312.field4716.method1899("Fps:" + class201.field2858, var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class312.field4716.method1899("Mem:" + var16 + "k", var13, var17, var14, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(BI)Lfb;", line = 272)
    public static final class198 method854(byte arg0, int arg1) {
        field1564++;
        class198 var2 = (class198) class13.field139.method716((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class20.field263.method955(class337.method2337(false, arg1), class183.method1271((byte) 120, arg1), -21853);
        class198 var4 = new class198();
        int var5 = 0 / ((-arg0 - 25) / 38);
        var4.field2810 = arg1;
        if (var3 != null) {
            var4.method1398(false, new class316(var3));
        }
        var4.method1399(0);
        if (var4.field2762 != -1) {
            var4.method1410(method854((byte) 92, var4.field2762), 107, method854((byte) -83, var4.field2777));
        }
        if (var4.field2772 != -1) {
            var4.method1407(method854((byte) -100, var4.field2831), 0, method854((byte) -121, var4.field2772));
        }
        if (!class275.field4132 && var4.field2817) {
            var4.field2764 = class128.field1755;
            var4.field2813 = class208.field2992;
            var4.field2773 = false;
            var4.field2757 = class21.field267;
            var4.field2795 = 0;
        }
        class13.field139.method721((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)I", line = 314)
    public static final int method855(int arg0, byte arg1) {
        field1560++;
        if (arg1 <= 93) {
            field1555 = (int[]) null;
        }
        class157 var2 = class100.method729(arg0, (byte) -96);
        int var3 = var2.field2174;
        int var4 = var2.field2163;
        int var5 = var2.field2166;
        int var6 = class237.field3354[var3 - var5];
        return var6 & class324.field4920[var4] >> var5;
    }
}
