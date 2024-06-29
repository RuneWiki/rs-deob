import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class103 extends class172 {

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "Lid;")
    public static class149 field1804 = class60.method382("Cabbage", (byte) 102);

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "Lve;")
    public static class189 field1802 = new class189(64);

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Lid;")
    public static class149 field1810 = class60.method382("b12_full", (byte) 46);

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "I")
    public static int field1812 = 0;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lid;")
    public static class149 field1809 = class60.method382(")3", (byte) 4);

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "[I")
    public static int[] field1811;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "[[B")
    public static byte[][] field1808;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILid;)V")
    public static final void method726(int arg0, class149 arg1) {
        field1805++;
        if (class245.field4305 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1023((byte) -16);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class245.field4305.length && class245.field4305[var2].field1148 != var3) {
            var2++;
        }
        if (class245.field4305.length <= var2 || class245.field4305[var2] == null) {
            return;
        }
        class208.field3720.method162(2, 162);
        class208.field3720.method496(2, class245.field4305[var2].field1148);
        if (arg0 < 79) {
            field1808 = null;
        }
        class177.field3233++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public static final void method727(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class62.field1114; var3++) {
            for (int var4 = 0; var4 < class181.field3264; var4++) {
                for (int var5 = 0; var5 < class129.field2291; var5++) {
                    class231 var6 = class261.field4664[var3][var4][var5];
                    if (var6 != null) {
                        class125 var7 = var6.field4053;
                        if (var7 != null && var7.field2203.method1364()) {
                            class127.method886(var7.field2203, var3, var4, var5, 1, 1);
                            if (var7.field2197 != null && var7.field2197.method1364()) {
                                class127.method886(var7.field2197, var3, var4, var5, 1, 1);
                                var7.field2203.method1360(var7.field2197, 0, 0, 0, false);
                                var7.field2197 = var7.field2197.method1361(arg0, arg1, arg2);
                            }
                            var7.field2203 = var7.field2203.method1361(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4047; var8++) {
                            class23 var10 = var6.field4061[var8];
                            if (var10 != null && var10.field343.method1364()) {
                                class127.method886(var10.field343, var3, var4, var5, var10.field331 + 1 - var10.field318, var10.field342 - var10.field330 + 1);
                                var10.field343 = var10.field343.method1361(arg0, arg1, arg2);
                            }
                        }
                        class100 var9 = var6.field4048;
                        if (var9 != null && var9.field1764.method1364()) {
                            class243.method1690(var9.field1764, var3, var4, var5);
                            var9.field1764 = var9.field1764.method1361(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILmb;Z)V")
    public static final void method728(int arg0, class160 arg1, boolean arg2) {
        if (arg2) {
            int var3 = class240.field4197;
            int var4 = var3 * 956 / 503;
            class86.field1574.method280((class218.field3851 - var4) / 2, 0, var4, var3);
            class251.field4408.method1353(class218.field3851 / 2 - (class251.field4408.field3598 / 2), 18);
        }
        field1806++;
        arg1.method1156(class222.field3899, class218.field3851 / 2, class240.field4197 / 2 - 26, 16777215, arg0);
        int var5 = class240.field4197 / 2 - 18;
        class72.method457(class218.field3851 / 2 - 152, var5, 304, 34, 9179409);
        class72.method457(class218.field3851 / 2 - 151, var5 + 1, 302, 32, 0);
        class72.method459(class218.field3851 / 2 - 150, var5 - -2, class171.field3152 * 3, 30, 9179409);
        class72.method459(class218.field3851 / 2 + class171.field3152 * 3 - 150, var5 + 2, 300 - (class171.field3152 * 3), 30, 0);
        arg1.method1156(class32.field478, class218.field3851 / 2, class240.field4197 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method729(boolean arg0);

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public static void method730(int arg0) {
        if (arg0 != 0) {
            field1808 = null;
        }
        field1808 = null;
        field1811 = null;
        field1804 = null;
        field1809 = null;
        field1802 = null;
        field1810 = null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(Z)V")
    public static final void method731(boolean arg0) {
        if (arg0) {
            method726(109, (class149) null);
        }
        class73.field1276 = null;
        class147.field2651 = null;
        class283.field5005 = null;
        class108.field1865 = null;
        class55.field991 = null;
        field1803++;
        class18.field259 = null;
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "(Z)Z")
    public abstract boolean method732(boolean arg0);
}
