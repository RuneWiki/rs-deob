import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class330 implements class226 {

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lmr;")
    private class129 field4820;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Lrea;")
    private class192 field4818;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "[I")
    public static int[] field4822 = new int[6];

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "Lla;")
    public static class421 field4825;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    public final void method1400(byte arg0) {
        field4824++;
        if (arg0 != -10) {
            this.method1398((byte) -65);
        }
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
    public static final void method2114(byte arg0) {
        field4823++;
        try {
            if (class577.field8380 == 1) {
                int var1 = class114.field2046.method228((byte) 120);
                if (var1 > 0 && class114.field2046.method221((byte) -3)) {
                    int var2 = var1 - class540.field7540;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class114.field2046.method196(var2, -109);
                    return;
                }
                class114.field2046.method210((byte) -113);
                class114.field2046.method213((byte) -125);
                class479.field6874 = null;
                if (class47.field1136 == null) {
                    class577.field8380 = 0;
                } else {
                    class577.field8380 = 2;
                }
                class577.field8396 = null;
            }
            if (class577.field8380 == 3) {
                int var3 = class114.field2046.method228((byte) 50);
                if (var3 < class486.field6961 && class114.field2046.method221((byte) -3)) {
                    int var4 = class399.field5805 + var3;
                    if (class486.field6961 < var4) {
                        var4 = class486.field6961;
                    }
                    class114.field2046.method196(var4, -103);
                    return;
                }
                class399.field5805 = 0;
                class577.field8380 = 0;
            }
            if (arg0 > -79) {
                field4825 = null;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class114.field2046.method210((byte) 49);
            class577.field8396 = null;
            class577.field8380 = 0;
            class479.field6874 = null;
            class47.field1136 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)Z")
    public final boolean method1398(byte arg0) {
        if (arg0 < 112) {
            return false;
        } else {
            field4821++;
            return this.field4818.method1392((byte) 98);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Ljava/lang/String;Lla;IIBI)I")
    private final int method2115(String arg0, class421 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field4819++;
        if (arg4 != 16) {
            this.method2115(null, null, 111, -58, (byte) -100, 80);
        }
        return arg1.method2554(this.field4820.field2339, arg2 + arg3, null, 0, 111, this.field4820.field2340, this.field4820.field2335 - (arg3 * 2), arg0, null, null, 0, this.field4820.field2344 - (arg3 * 2), 0, arg3 + arg5, 0, 0);
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)V")
    public static void method2116(byte arg0) {
        field4822 = null;
        field4825 = null;
        int var1 = -20 / ((arg0 + 44) / 52);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
    public final void method1432(boolean arg0, boolean arg1) {
        field4826++;
        class291 var3 = this.field4818.method1391(this.field4820.field2334, 18665);
        if (arg1) {
            this.method1398((byte) -90);
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field4820.field2338.method2056(115, this.field4820.field2344, class575.field8355) + this.field4820.field2342;
        int var5 = this.field4820.field2345.method3156(class693.field9762, 4416, this.field4820.field2335) + this.field4820.field2337;
        if (this.field4820.field2343) {
            class623.field9017.method108(var4, var5, this.field4820.field2344, this.field4820.field2335, this.field4820.field2332, 0);
        }
        int var6 = var5 + this.method2115(var3.field4374, class367.field5445, var5, 5, (byte) 16, var4) * 12;
        int var9 = var6 + 8;
        if (this.field4820.field2343) {
            class623.field9017.method41(var4, var9, this.field4820.field2344 + var4 - 1, var9, this.field4820.field2332, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2115(var3.field4373, class367.field5445, var6, 5, (byte) 16, var4) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2115(var3.field4371, class367.field5445, var10, 5, (byte) 16, var4) * 12;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lrea;Lmr;)V")
    public class330(class192 arg0, class129 arg1) {
        this.field4820 = arg1;
        this.field4818 = arg0;
    }
}
