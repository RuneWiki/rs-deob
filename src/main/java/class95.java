import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class95 extends class135 {

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "Lej;")
    public class50 field1471;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field1470 = 0;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "[I")
    public static int[] field1467;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILdl;)I")
    public static final int method631(int arg0, class123 arg1) {
        field1469++;
        int var2 = arg0;
        if (arg1.method806(52, class211.field3292)) {
            var2 = arg0 + 1;
        }
        if (arg1.method806(14, class231.field3722)) {
            var2++;
        }
        if (arg1.method806(arg0 ^ 0x6F, class272.field4331)) {
            var2++;
        }
        if (arg1.method806(59, class79.field1129)) {
            var2++;
        }
        if (arg1.method806(43, class270.field4297)) {
            var2++;
        }
        if (arg1.method806(89, field1473)) {
            var2++;
        }
        if (arg1.method806(41, class163.field2534)) {
            var2++;
        }
        if (arg1.method806(99, class145.field2139)) {
            var2++;
        }
        if (arg1.method806(arg0 ^ 0x3E, class264.field4267)) {
            var2++;
        }
        if (arg1.method806(arg0 ^ 0x31, class219.field3559)) {
            var2++;
        }
        if (arg1.method806(56, class206.field3218)) {
            var2++;
        }
        if (arg1.method806(56, class219.field3560)) {
            var2++;
        }
        if (arg1.method806(49, class97.field1503)) {
            var2++;
        }
        if (arg1.method806(83, class223.field3609)) {
            var2++;
        }
        if (arg1.method806(arg0 ^ 0x60, class48.field611)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static final void method632(int arg0) {
        field1466++;
        int var1 = class232.field3734.method1309(class86.field1366);
        for (int var2 = 0; var2 < class245.field3920; var2++) {
            int var6 = class232.field3734.method1309(class102.method674(-19736, var2));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class245.field3920 * 15 + 21;
        int var4 = class106.field1634 - (var1 / 2);
        if (arg0 <= 75) {
            return;
        }
        if (class135.field1960 < var1 + var4) {
            var4 = class135.field1960 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class236.field3780;
        if (class98.field1510 < var3 + var5) {
            var5 = class98.field1510 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class52.field715 == 1) {
            if (class134.field1947 == class106.field1634 && class236.field3780 == class178.field2781) {
                class25.field345 = (class264.field4247 ? 26 : 22) + class245.field3920 * 15;
                class52.field715 = 0;
                class106.field1641 = var1;
                class240.field3852 = var5;
                class286.field4542 = true;
                class57.field808 = var4;
            }
        } else if (class59.field836 == class106.field1634 && class236.field3780 == class145.field2140) {
            class52.field715 = 0;
            class240.field3852 = var5;
            class286.field4542 = true;
            class25.field345 = (class264.field4247 ? 26 : 22) + class245.field3920 * 15;
            class57.field808 = var4;
            class106.field1641 = var1;
        } else {
            class178.field2781 = class145.field2140;
            class52.field715 = 1;
            class134.field1947 = class59.field836;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
    public static void method633(byte arg0) {
        field1467 = null;
        int var1 = 41 / ((arg0 + 51) / 36);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V")
    public static final void method634(byte arg0) {
        if (arg0 > -12) {
            field1470 = 8;
        }
        class145.field2135.method1430(-1);
        class207.field3234.method1430(-1);
        field1468++;
        class168.field2596.method1430(-1);
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lej;)V")
    public class95(class50 arg0) {
        this.field1471 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILlj;)V")
    public static final void method635(int arg0, class25 arg1) {
        if (arg0 != -13589) {
            return;
        }
        field1472++;
        byte[] var2 = new byte[24];
        if (class98.field1528 != null) {
            try {
                class98.field1528.method992(0L, -85);
                class98.field1528.method998((byte) -119, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method213(0, var2, 24, -127);
    }
}
