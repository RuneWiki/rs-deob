import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class78 {

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "S")
    public static short field1122 = 32767;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "[I")
    public static int[] field1127 = new int[2];

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "[I")
    public static int[] field1123 = new int[1000];

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
    public static int[] field1124;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V", line = 5)
    public static void method537(int arg0) {
        field1124 = null;
        if (arg0 != -3) {
            method540(-60, 85, -47);
        }
        field1123 = null;
        field1127 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(ZZ)Z", line = 32)
    public static boolean method538(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I", line = 39)
    public static final int method539(int arg0) {
        if (arg0 != -27627) {
            field1124 = null;
        }
        field1126++;
        if (class466.field6949 == null) {
            if (!class139.field1850 && class367.field5621 > 0) {
                if (class147.field1952 && class35.field515.method1970(true, 81) && class367.field5621 > 2) {
                    return ((class54) class131.field1769.field906.field36.field36).field760;
                }
                return ((class54) class131.field1769.field906.field36).field760;
            }
            int var1 = class502.field7404.method2323((byte) -95);
            int var2 = class502.field7404.method2325(arg0 + 27528);
            int var3 = class194.field2594;
            int var4 = class54.field756;
            int var5 = class428.field6504;
            if (var1 > var3 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class367.field5621; var7++) {
                    if (class232.field3307) {
                        int var12 = (class367.field5621 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class367.field5621 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class162 var9 = new class162(class131.field1769);
                    for (class54 var10 = (class54) var9.method1042(765); var10 != null; var10 = (class54) var9.method1041((byte) -63)) {
                        if ((var8++) == var6) {
                            return var10.field760;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V", line = 137)
    public static final void method540(int arg0, int arg1, int arg2) {
        field1125++;
        int var3 = class175.field2338.method564(75, class251.field3498.method2705((byte) 69, class257.field3556));
        for (class54 var4 = (class54) class131.field1769.method445(33); var4 != null; var4 = (class54) class131.field1769.method451(false)) {
            int var9 = class91.method610(true, var4);
            if (var3 < var9) {
                var3 = var9;
            }
        }
        int var5 = arg0 + var3;
        int var6 = class367.field5621 * 16 + 21;
        int var7 = arg1 - (var5 / 2);
        if ((var7 + var5) > class147.field1961) {
            var7 = class147.field1961 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg2;
        if (class107.field1525 < (var6 + arg2)) {
            var8 = class107.field1525 - var6;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        class194.field2594 = var7;
        class392.field5988 = (class232.field3307 ? 26 : 22) + class367.field5621 * 16;
        class139.field1850 = true;
        class428.field6504 = var5;
        class54.field756 = var8;
    }
}
