import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class355 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field4825 = 2;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[I")
    public static int[] field4824 = new int[50];

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ltm;")
    public static class349 field4822 = new class349(8);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2248(int arg0) {
        if (class301.field4020 < 1024.0F) {
            class301.field4020 = 1024.0F;
        }
        field4826++;
        if (class301.field4020 > 3072.0F) {
            class301.field4020 = 3072.0F;
        }
        while (class434.field5929 >= 16384.0F) {
            class434.field5929 -= 16384.0F;
        }
        while (class434.field5929 < 0.0F) {
            class434.field5929 += 16384.0F;
        }
        int var1 = class277.field3583 >> 7;
        int var2 = class374.field5069 >> 7;
        int var3 = class189.method1170(class374.field5069, class277.field3583, true, class43.field513);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class43.field513;
                    if (var7 < 3 && class449.method2782(var5, (byte) -7, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class284.field3710 != null && class284.field3710[var7] != null) {
                        var8 = (class284.field3710[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var8 + var3 - class304.field4096[var7].method1050(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        if (arg0 != -21491) {
            method2249(17);
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class91.field1069) {
            class91.field1069 += (var10 - class91.field1069) / 24;
        } else if (var10 < class91.field1069) {
            class91.field1069 += (var10 - class91.field1069) / 80;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 94)
    public static final void method2249(int arg0) {
        field4823++;
        int var1 = 105 % ((29 - arg0) / 60);
        for (int var2 = 0; var2 < 5; var2++) {
            class310.field4187[var2] = false;
        }
        class349.field4763 = class51.field587;
        class291.field3849 = class433.field5912;
        class234.field3086 = -1;
        class59.field749 = class287.field3784;
        client.field6059 = 0;
        class368.field5022 = class178.field2081;
        class258.field3339 = -1;
        class354.field4818 = class106.field1273;
        class255.field3313 = 0;
        class320.field4294 = 5;
        class241.field3166 = class80.field979;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 123)
    public static void method2250(int arg0) {
        if (arg0 < 110) {
            method2249(52);
        }
        field4822 = null;
        field4824 = null;
    }
}
