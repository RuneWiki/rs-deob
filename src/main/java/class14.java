import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class14 extends class82 {

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[I")
    public static int[] field175 = new int[1000];

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field174 = 0;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method111(byte arg0) {
        if (arg0 <= -90) {
            field175 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method112(int arg0) {
        field176++;
        class9.field153.method1172((byte) 117);
        if (arg0 != 0) {
            method111((byte) 54);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Lej;")
    public static final class51 method113(byte arg0) {
        field177++;
        int var1 = 79 / ((arg0 - 36) / 50);
        byte[] var2 = class301.field4847[0];
        int var3 = class170.field2583[0] * class104.field1621[0];
        class51 var7;
        if (class5.field80[0]) {
            byte[] var4 = class299.field4811[0];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class44.method377(class118.method863(255, var4[var6]) << 24, class102.field1585[class118.method863(var2[var6], 255)]);
            }
            var7 = new class256(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], var5);
        } else {
            int[] var8 = new int[var3];
            for (int var9 = 0; var9 < var3; var9++) {
                var8[var9] = class102.field1585[class118.method863(var2[var9], 255)];
            }
            var7 = new class51(class214.field3278, class234.field3705, class196.field3069[0], class125.field1877[0], class104.field1621[0], class170.field2583[0], var8);
        }
        class30.method254(2);
        return var7;
    }
}
