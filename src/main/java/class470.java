import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class470 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6927 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lki;")
    public static class498 field6926 = new class498(43, 6);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Ldi;")
    public static class82 field6932 = new class82();

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lm;")
    public static class126 field6933;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lur;")
    public static class373 field6931;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)J")
    public abstract long method843(byte arg0);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method2816(byte arg0) {
        field6933 = null;
        field6932 = null;
        field6926 = null;
        field6927 = null;
        if (arg0 != -18) {
            field6933 = null;
        }
        field6931 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIILsm;)V")
    public static final void method2817(int arg0, int arg1, int arg2, class185 arg3) {
        class518 var4 = class110.method674(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7550 = arg3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
    public abstract void method841(byte arg0);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static final void method2818(int arg0) {
        class474.field6982 = 0;
        field6930++;
        boolean var1 = class66.field1009.method1430(false) == 1;
        int var2 = class66.field1009.method1450((byte) 60);
        int var3 = class66.field1009.method1428(32122);
        int var4 = class66.field1009.method1450((byte) 97);
        class233.method1589(873005891, var3);
        int var5 = (class352.field5395 - class66.field1009.field3037) / 16;
        class41.field617 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var11 = 0; var11 < 4; var11++) {
                class41.field617[var6][var11] = class66.field1009.method1452(65280);
            }
        }
        class150.field2230 = null;
        class234.field3482 = new byte[var5][];
        class57.field878 = new int[var5];
        class424.field6364 = new int[var5];
        class331.field4689 = new int[var5];
        class169.field2510 = new byte[var5][];
        class434.field6501 = new byte[var5][];
        class480.field7048 = new int[var5];
        class145.field2151 = null;
        class257.field3788 = new int[var5];
        class13.field165 = new byte[var5][];
        int var7 = 0;
        int var8 = 53 / ((arg0 - 50) / 52);
        for (int var9 = (var2 - (class30.field323 >> 4)) / 8; var9 <= (((class30.field323 >> 4) + var2) / 8); var9++) {
            for (int var10 = (var4 - (class182.field2661 >> 4)) / 8; var10 <= (((class182.field2661 >> 4) + var4) / 8); var10++) {
                class331.field4689[var7] = (var9 << 8) + var10;
                class57.field878[var7] = class132.field2035.method2940("m" + var9 + "_" + var10, false);
                class424.field6364[var7] = class132.field2035.method2940("l" + var9 + "_" + var10, false);
                class480.field7048[var7] = class132.field2035.method2940("um" + var9 + "_" + var10, false);
                class257.field3788[var7] = class132.field2035.method2940("ul" + var9 + "_" + var10, false);
                var7++;
            }
        }
        class185.method1274(var4, var2, false, var1, (byte) -43);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ldh;IB)Ljava/lang/String;")
    public static final String method2819(class209 arg0, int arg1, byte arg2) {
        field6928++;
        try {
            int var3 = arg0.method1434(16887);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field3037 += class284.field4084.method3003(arg0.field3036, -2896, var4, arg0.field3037, 0, var3);
            if (arg2 <= 98) {
                field6932 = null;
            }
            return class271.method1782(var3, 14, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
    public abstract int method842(byte arg0, int arg1);
}
