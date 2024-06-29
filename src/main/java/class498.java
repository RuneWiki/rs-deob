import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public abstract class class498 {

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public int field7074;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public int field7075;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lke;")
    public static class622 field7072 = new class622(5, 10);

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Ljo;")
    public static class351 field7076 = new class351(66, 7);

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field7077 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Ltga;")
    public static class64 field7078 = new class64(8);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[Ljfa;")
    public static class302[] field7080;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method2904(int arg0) {
        field7072 = null;
        field7078 = null;
        field7080 = null;
        if (arg0 != -1169593501) {
            method2905(53);
        }
        field7076 = null;
        field7077 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V")
    public abstract void method160(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(III)V")
    public abstract void method159(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)I")
    public static final int method2905(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class347.field5092 - 1; var2++) {
            if (arg0 < class73.field988[var2] + class387.field5515[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class347.field5092 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BII)V")
    public abstract void method157(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method2906(boolean arg0) {
        if (class95.method672(class757.field10456, 6) || class312.method2037((byte) 125, class757.field10456)) {
            class393.method2398(5000, (byte) -12, class359.field5216 >> 12, class277.field3866 >> 12);
        } else {
            int var1 = class251.field3549.field6448[0] >> 3;
            int var2 = class251.field3549.field6445[0] >> 3;
            if (var1 >= 0 && class109.field1314 >> 3 > var1 && var2 >= 0 && var2 < class760.field10479 >> 3) {
                class393.method2398(5000, (byte) -114, var2, var1);
            } else {
                class393.method2398(0, (byte) -87, class760.field10479 >> 4, class109.field1314 >> 4);
            }
        }
        field7073++;
        if (!arg0) {
            class302.method2005(-113);
            class459.method2738(0);
            class552.method3211((byte) -103);
            class713.method4037((byte) 110);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(III)V")
    public class498(int arg0, int arg1, int arg2) {
        this.field7074 = arg2;
        this.field7081 = arg1;
        this.field7075 = arg0;
    }
}
