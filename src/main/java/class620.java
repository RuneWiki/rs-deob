import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class620 {

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "[I")
    public static int[] field8266 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[I")
    public static int[] field8268 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field8265;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field8269;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 3)
    public static void method3414(byte arg0) {
        if (arg0 != -36) {
            method3415((byte) -26, null);
        }
        field8266 = null;
        field8268 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLjava/lang/String;)V", line = 52)
    public static final void method3415(byte arg0, String arg1) {
        field8269++;
        if (arg1 == null) {
            return;
        }
        if (!(client.field4355 < 200 || class224.field3170) || client.field4355 >= 200) {
            class178.method1234(4, 31663, class517.field6850.method2877(class713.field9854, (byte) -108));
            String var2 = class517.field6851.method2877(class713.field9854, (byte) -108);
            if (var2 != null) {
                class178.method1234(4, 31663, var2);
            }
            return;
        }
        String var3 = class496.method2797(arg1, true);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < client.field4355; var4++) {
            String var10 = class496.method2797(class549.field7252[var4], true);
            if (var10 != null && var10.equals(var3)) {
                class178.method1234(4, 31663, arg1 + class517.field6878.method2877(class713.field9854, (byte) -108));
                return;
            }
            if (class238.field3361[var4] != null) {
                String var11 = class496.method2797(class238.field3361[var4], true);
                if (var11 != null && var11.equals(var3)) {
                    class178.method1234(4, 31663, arg1 + class517.field6878.method2877(class713.field9854, (byte) -108));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class543.field7184; var5++) {
            String var8 = class496.method2797(class756.field10526[var5], true);
            if (var8 != null && var8.equals(var3)) {
                class178.method1234(4, 31663, class517.field6883.method2877(class713.field9854, (byte) -108) + arg1 + class517.field6884.method2877(class713.field9854, (byte) -108));
                return;
            }
            if (class13.field202[var5] != null) {
                String var9 = class496.method2797(class13.field202[var5], true);
                if (var9 != null && var9.equals(var3)) {
                    class178.method1234(4, 31663, class517.field6883.method2877(class713.field9854, (byte) -108) + arg1 + class517.field6884.method2877(class713.field9854, (byte) -108));
                    return;
                }
            }
        }
        if (class496.method2797(class472.field6475.field5334, true).equals(var3)) {
            class178.method1234(4, 31663, class517.field6881.method2877(class713.field9854, (byte) -108));
            return;
        }
        class367.field5136++;
        int var6 = 86 / ((-arg0 - 28) / 59);
        class583 var7 = class381.method2246(1, class128.field2105, class164.field2492);
        var7.field7637.method3823(-117, class419.method2429(true, arg1));
        var7.field7637.method3795(arg1, (byte) -105);
        class42.method309(var7, 0);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Z", line = 166)
    public static final boolean method3416(int arg0, byte arg1) {
        field8265++;
        if (arg1 != -14) {
            field8268 = null;
        }
        return arg0 != 1 && arg0 != 7;
    }
}
