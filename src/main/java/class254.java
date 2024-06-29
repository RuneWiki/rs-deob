import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class254 {

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "Liga;")
    public static class454 field3687 = new class454(1);

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "I")
    public static int field3691 = -50;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field3689 = 100;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "F")
    public static float field3693;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "Lqda;")
    public static class103 field3692;

    @OriginalMember(owner = "client!fga", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field3686++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)V", line = 11)
    public static void method1733(byte arg0) {
        field3687 = null;
        int var1 = 75 / ((-arg0 - 55) / 61);
        field3692 = null;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(IIIIB)V", line = 21)
    public static final void method1734(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -30) {
            return;
        }
        if (class156.field2337 <= arg3 && class612.field8854 >= arg3) {
            int var5 = class498.method3000(false, class748.field10458, arg1, class558.field7940);
            int var6 = class498.method3000(false, class748.field10458, arg0, class558.field7940);
            class422.method2579(true, arg3, var6, var5, arg2);
        }
        field3688++;
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V", line = 44)
    public static final void method1735(int arg0) {
        field3694++;
        class644.field9146.method2688((byte) -112);
        int var1 = class644.field9146.method2686(-9380, 8);
        if (class152.field2290 > var1) {
            for (int var2 = var1; var2 < class152.field2290; var2++) {
                class92.field1616[class299.field4151++] = class323.field4590[var2];
            }
        }
        if (class152.field2290 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class152.field2290 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class323.field4590[var3];
            class84 var5 = ((class272) class758.field10539.method4203(true, (long) var4)).field3885;
            int var6 = class644.field9146.method2686(-9380, 1);
            if (var6 == 0) {
                class323.field4590[class152.field2290++] = var4;
                var5.field933 = class515.field7337;
            } else {
                int var7 = class644.field9146.method2686(-9380, 2);
                if (var7 == 0) {
                    class323.field4590[class152.field2290++] = var4;
                    var5.field933 = class515.field7337;
                    class239.field3370[class617.field8924++] = var4;
                } else if (var7 == 1) {
                    class323.field4590[class152.field2290++] = var4;
                    var5.field933 = class515.field7337;
                    int var8 = class644.field9146.method2686(-9380, 3);
                    var5.method806((byte) 98, var8, 1);
                    int var9 = class644.field9146.method2686(-9380, 1);
                    if (var9 == 1) {
                        class239.field3370[class617.field8924++] = var4;
                    }
                } else if (var7 == 2) {
                    class323.field4590[class152.field2290++] = var4;
                    var5.field933 = class515.field7337;
                    if (class644.field9146.method2686(-9380, 1) == 1) {
                        int var11 = class644.field9146.method2686(-9380, 3);
                        var5.method806((byte) 98, var11, 2);
                        int var12 = class644.field9146.method2686(-9380, 3);
                        var5.method806((byte) 98, var12, 2);
                    } else {
                        int var10 = class644.field9146.method2686(-9380, 3);
                        var5.method806((byte) 98, var10, 0);
                    }
                    int var13 = class644.field9146.method2686(-9380, 1);
                    if (var13 == 1) {
                        class239.field3370[class617.field8924++] = var4;
                    }
                } else if (var7 == 3) {
                    class92.field1616[class299.field4151++] = var4;
                }
            }
        }
        if (arg0 != 21513) {
            method1733((byte) -112);
        }
    }
}
