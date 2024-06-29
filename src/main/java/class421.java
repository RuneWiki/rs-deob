import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class421 extends class264 {

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public int field6091;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lbn;")
    public static class160 field6093 = new class160(26, -1);

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[I")
    public static int[] field6095 = new int[2];

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field6096 = -1;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Leb;")
    public static class395 field6094 = new class395();

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "[I")
    public static int[] field6097 = new int[64];

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)Leg;")
    public static final class376 method2598(int arg0) {
        if (arg0 <= 118) {
            field6094 = null;
        }
        field6088++;
        if (class66.field857 == null || class71.field931 == null) {
            return null;
        }
        class71.field931.method1008(class66.field857, (byte) 75);
        class376 var1 = (class376) class71.field931.method1005(0);
        if (var1 == null) {
            return null;
        } else {
            class110 var2 = class443.method2721(-12, var1.field5483);
            return var2 != null && var2.field1484 && var2.method788((byte) -123) ? var1 : class227.method1557(116);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lia;B)I")
    public static final int method2599(class375 arg0, byte arg1) {
        field6090++;
        String var2 = class265.method1827(arg0, true);
        int[] var3 = null;
        if (class411.method2553(2661, arg0.field5469)) {
            var3 = class157.field2119.method176((byte) -114, (int) arg0.field5480).field6203;
        } else if (class275.method1878(4, arg0.field5469)) {
            class26 var6 = class364.field5260[(int) arg0.field5480];
            if (var6 != null) {
                class327 var7 = var6.field369;
                if (var7.field4871 != null) {
                    var7 = var7.method2139(true);
                }
                if (var7 != null) {
                    var3 = var7.field4815;
                }
            }
        } else if (class29.method295(16565, arg0.field5469)) {
            Object var4 = null;
            class178 var5;
            if (arg0.field5469 == 1006) {
                var5 = class450.method2785((int) arg0.field5480, (byte) 95);
            } else {
                var5 = class450.method2785((int) (arg0.field5480 >>> 32 & 0x7FFFFFFFL), (byte) 110);
            }
            if (var5.field2489 != null) {
                var5 = var5.method1240((byte) -116);
            }
            if (var5 != null) {
                var3 = var5.field2509;
            }
        }
        if (var3 != null) {
            var2 = var2 + class447.method2750((byte) -72, var3);
        }
        if (arg1 < 7) {
            field6096 = 81;
        }
        int var8 = class233.field3502.method2320(class214.field3022, 3, var2);
        if (arg0.field5470) {
            var8 += class226.field3383.method1868() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V")
    public static final void method2600(byte arg0) {
        if (class150.field2028 != -1) {
            class296.method1970(-1, false, class150.field2028, (byte) 92, -1);
            class150.field2028 = -1;
        }
        if (arg0 < 51) {
            field6093 = null;
        }
        field6089++;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
    public static void method2601(int arg0) {
        field6093 = null;
        field6097 = null;
        field6094 = null;
        int var1 = 91 % ((arg0 - 35) / 47);
        field6095 = null;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II)V")
    public class421(int arg0, int arg1) {
        this.field6092 = arg1;
        this.field6091 = arg0;
    }
}
