import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class124 {

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "[I")
    public static int[] field2170 = new int[256];

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lp;")
    private static class280 field2169 = class18.method140((byte) -123, "yellow:");

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lp;")
    public static class280 field2166 = field2169;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "Lp;")
    public static class280 field2173 = class18.method140((byte) -125, "::replacecanvas");

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lp;")
    public static class280 field2175 = field2169;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "Lp;")
    public static class280 field2176 = class18.method140((byte) -125, "<col=00ff80>");

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    public static int[] field2172;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method862(int arg0) {
        field2176 = null;
        field2175 = null;
        if (arg0 != 29490) {
            method865((byte) -36);
        }
        field2170 = null;
        field2166 = null;
        field2173 = null;
        field2169 = null;
        field2172 = null;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Leg;")
    public static final class223 method863(int arg0) {
        byte[] var1 = class182.field3178[0];
        field2171++;
        int var2 = class97.field1562[0] * class57.field915[0];
        class223 var6;
        if (class261.field4615[0]) {
            int[] var3 = new int[var2];
            byte[] var4 = class262.field4637[0];
            for (int var5 = 0; var5 < var2; var5++) {
                var3[var5] = class160.method1143(class214.method1432(-16777216, var4[var5] << 24), class16.field309[class214.method1432(var1[var5], 255)]);
            }
            var6 = new class186(class93.field1512, class221.field3828, class243.field4263[0], field2172[0], class97.field1562[0], class57.field915[0], var3);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class16.field309[class214.method1432(var1[var8], 255)];
            }
            var6 = new class223(class93.field1512, class221.field3828, class243.field4263[0], field2172[0], class97.field1562[0], class57.field915[0], var7);
        }
        class126.method868(-15434);
        if (arg0 > -16) {
            method864(46, 83);
        }
        return var6;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method864(int arg0, int arg1) {
        if (arg0 > -116) {
            method862(123);
        }
        class204.field3546.method1478(arg1, 92);
        field2168++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method865(byte arg0) {
        field2167++;
        if (arg0 >= -85) {
            field2170 = null;
        }
        class248.field4343.method1481(false);
        class245.field4305.method1481(false);
        class30.field566.method1481(false);
        class261.field4616.method1481(false);
    }
}
