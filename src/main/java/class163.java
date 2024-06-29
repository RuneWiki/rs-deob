import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class163 {

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Z)I", line = 6)
    public static final int method1030(boolean arg0) {
        field2092++;
        if (class597.field8367 == 0) {
            class455.field6338.method2740(new class287("jaclib"), 2);
            if (class455.field6338.method2743(false).method690((byte) -26) != 100) {
                return 1;
            }
            if (!((class287) class455.field6338.method2743(false)).method1900(124)) {
                class274.field3958.method4216(false);
            }
            class597.field8367 = 1;
        }
        if (class597.field8367 == 1) {
            class753.field10381 = class455.method2742(-2);
            class455.field6334.method2740(new class249(class516.field7087), 2);
            class455.field6341.method2740(new class287("jaggl"), 2);
            class455.field6342.method2740(new class287("jagdx"), 2);
            class455.field6343.method2740(new class287("jagmisc"), 2);
            class455.field6344.method2740(new class287("sw3d"), 2);
            class455.field6345.method2740(new class287("hw3d"), 2);
            class455.field6346.method2740(new class287("jagtheora"), 2);
            class455.field6347.method2740(new class249(class100.field1175), 2);
            class455.field6348.method2740(new class249(class35.field359), 2);
            class455.field6349.method2740(new class249(class403.field5684), 2);
            class455.field6350.method2740(new class249(class99.field1155), 2);
            class455.field6351.method2740(new class249(class122.field1617), 2);
            class455.field6352.method2740(new class249(class605.field8484), 2);
            class455.field6353.method2740(new class249(class75.field841), 2);
            class455.field6354.method2740(new class249(class16.field95), 2);
            class455.field6355.method2740(new class249(class448.field6272), 2);
            class455.field6356.method2740(new class249(class274.field3962), 2);
            class455.field6357.method2740(new class249(class85.field1026), 2);
            class455.field6358.method2740(new class249(class368.field5290), 2);
            class455.field6359.method2740(new class249(class679.field9499), 2);
            class455.field6360.method2740(new class249(class212.field2925), 2);
            class455.field6361.method2740(new class670(class392.field5585, "huffman"), 2);
            class455.field6362.method2740(new class249(class132.field1695), 2);
            class455.field6363.method2740(new class249(class540.field7466), 2);
            class455.field6364.method2740(new class249(class170.field2160), 2);
            class455.field6365.method2740(new class96(class539.field7458, "details"), 2);
            for (int var1 = 0; var1 < class753.field10381.length; var1++) {
                if (class753.field10381[var1].method2743(arg0) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class455[] var3 = class753.field10381;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class455 var5 = var3[var4];
                int var6 = var5.method2738(-12455);
                int var7 = var5.method2743(false).method690((byte) -64);
                var2 += var6 * var7 / 100;
            }
            class597.field8367 = 2;
            class632.field8837 = var2;
        }
        if (class753.field10381 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        class455[] var11 = class753.field10381;
        if (arg0) {
            method1030(false);
        }
        for (int var12 = 0; var12 < var11.length; var12++) {
            class455 var16 = var11[var12];
            int var17 = var16.method2738(-12455);
            int var18 = var16.method2743(false).method690((byte) -127);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class287) class455.field6343.method2743(false)).method1900(123)) {
                class274.field3958.method4219(arg0);
            }
            if (!((class287) class455.field6346.method2743(false)).method1900(115)) {
                class514.field7056 = class274.field3958.method4214((byte) 70);
            }
            class753.field10381 = null;
        }
        int var13 = var9 - class632.field8837;
        int var14 = var8 - class632.field8837;
        int var15 = var14 <= 0 ? 100 : var13 * 100 / var14;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }
}
