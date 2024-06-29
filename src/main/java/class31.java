import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class31 extends class118 {

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field420 = new String[8];

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field422 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static final void method198(int arg0) {
        int var1 = 0;
        if (arg0 < 90) {
            return;
        }
        while (class84.field1151 > var1) {
            int var10002 = class66.field900[var1]--;
            if (class66.field900[var1] >= -10) {
                label87: {
                    class147 var3 = class102.field1429[var1];
                    if (var3 == null) {
                        var3 = class147.method986(class10.field94, class71.field994[var1], 0);
                        if (var3 == null) {
                            break label87;
                        }
                        class66.field900[var1] += var3.method987();
                        class102.field1429[var1] = var3;
                    }
                    if (class66.field900[var1] < 0) {
                        label90: {
                            int var10;
                            if (class8.field68[var1] == 0) {
                                var10 = class174.field2439[var1] * class205.field2860 >> 8;
                            } else {
                                int var4 = (class8.field68[var1] & 0xFF) * 128;
                                int var5 = class8.field68[var1] >> 16 & 0xFF;
                                int var6 = var5 * 128 + 64 - class217.field3280.field4019;
                                if (var6 < 0) {
                                    var6 = -var6;
                                }
                                int var7 = (class8.field68[var1] & 0xFFC1) >> 8;
                                int var8 = var7 * 128 + 64 - class217.field3280.field4085;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var6 + var8 - 128;
                                if (var4 < var9) {
                                    class66.field900[var1] = -100;
                                    break label90;
                                }
                                if (var9 < 0) {
                                    var9 = 0;
                                }
                                var10 = (var4 - var9) * class122.field1701 * class174.field2439[var1] / var4 >> 8;
                            }
                            if (var10 > 0) {
                                class24 var11 = var3.method985().method169(class181.field2543);
                                class112 var12 = class112.method753(var11, 100, var10);
                                var12.method767(class140.field1939[var1] - 1);
                                class21.field298.method359(var12);
                            }
                            class66.field900[var1] = -100;
                        }
                    }
                }
            } else {
                class84.field1151--;
                for (int var2 = var1; var2 < class84.field1151; var2++) {
                    class71.field994[var2] = class71.field994[var2 + 1];
                    class102.field1429[var2] = class102.field1429[var2 + 1];
                    class140.field1939[var2] = class140.field1939[var2 + 1];
                    class66.field900[var2] = class66.field900[var2 + 1];
                    class8.field68[var2] = class8.field68[var2 + 1];
                    class174.field2439[var2] = class174.field2439[var2 + 1];
                }
                var1--;
            }
            var1++;
        }
        field421++;
        if (class49.field709 && !class94.method618(-35)) {
            if (class168.field2312 != 0 && class28.field373 != -1) {
                class199.method1272(false, class23.field324, 95, 0, class28.field373, class168.field2312);
            }
            class49.field709 = false;
        } else if (class168.field2312 != 0 && class28.field373 != -1 && !class94.method618(-62)) {
            class281.field4359.method1864(204, (byte) -69);
            class287.field4525++;
            class281.field4359.method1435(-92, class28.field373);
            class28.field373 = -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V")
    public static void method199(byte arg0) {
        field420 = null;
        if (arg0 <= 66) {
            method198(97);
        }
    }
}
