import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class66 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Lrk;")
    public static class149 field1272;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[Lcg;")
    public static class34[] field1268;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIILfl;)Lvj;")
    public static final class88 method473(int arg0, int arg1, int arg2, class192 arg3) {
        if (arg0 != -1) {
            field1272 = null;
        }
        field1269++;
        return class28.method239(50, arg3, arg2, arg1) ? method475(-67) : null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 != 8368) {
            field1268 = null;
        }
        field1268 = null;
        field1272 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)Lvj;")
    public static final class88 method475(int arg0) {
        field1266++;
        if (arg0 > -32) {
            field1272 = null;
        }
        int var1 = class6.field127[0] * class190.field3417[0];
        byte[] var2 = class6.field230[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class268.field4715[class203.method1395(var2[var4], 255)];
        }
        class88 var5 = new class88(class203.field3643, class14.field429, class207.field3737[0], class269.field4810[0], class190.field3417[0], class6.field127[0], var3);
        class261.method1739(26);
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static final void method476(int arg0) {
        if (arg0 <= 6) {
            method476(-24);
        }
        class142 var1 = (class142) class53.field1105.method789((byte) -76);
        field1270++;
        while (var1 != null) {
            if (var1.field2640 > 0) {
                var1.field2640--;
            }
            if (var1.field2640 != 0) {
                if (var1.field2627 > 0) {
                    var1.field2627--;
                }
                if (var1.field2627 == 0 && var1.field2638 >= 1 && var1.field2637 >= 1 && var1.field2638 <= 102 && var1.field2637 <= 102 && (var1.field2639 < 0 || class168.method1108(-9, var1.field2639, var1.field2634))) {
                    class246.method1632(var1.field2642, (byte) 127, var1.field2641, var1.field2637, var1.field2638, var1.field2645, var1.field2639, var1.field2634);
                    var1.field2627 = -1;
                    if (var1.field2639 == var1.field2636 && var1.field2636 == -1) {
                        var1.method97(158);
                    } else if (var1.field2639 == var1.field2636 && var1.field2645 == var1.field2643 && var1.field2634 == var1.field2633) {
                        var1.method97(158);
                    }
                }
            } else if (var1.field2636 < 0 || class168.method1108(-9, var1.field2636, var1.field2633)) {
                class246.method1632(var1.field2642, (byte) 125, var1.field2641, var1.field2637, var1.field2638, var1.field2643, var1.field2636, var1.field2633);
                var1.method97(158);
            }
            var1 = (class142) class53.field1105.method787((byte) -76);
        }
    }
}
