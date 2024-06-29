import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class333 extends class234 {

    @OriginalMember(owner = "client!qca", name = "Ib", descriptor = "[S")
    public static short[] field4069 = new short[256];

    @OriginalMember(owner = "client!qca", name = "Gb", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!qca", name = "Hb", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!qca", name = "Kb", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!qca", name = "Lb", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!qca", name = "Jb", descriptor = "[I")
    public static int[] field4070;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(Z)V")
    public static void method1922(boolean arg0) {
        field4070 = null;
        field4069 = null;
        if (arg0) {
            method1924((String) null, -105, 123);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(FI)V")
    public final void method1923(float arg0, int arg1) {
        ++field4072;
        int var3 = Stream.floatToRawIntBits(arg0);
        if (arg1 == -2061505808) {
            super.field3193[super.field3133++] = (byte) var3;
            super.field3193[super.field3133++] = (byte) (var3 >> 8);
            super.field3193[super.field3133++] = (byte) (var3 >> 16);
            super.field3193[super.field3133++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(I)V")
    public class333(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method1924(String arg0, int arg1, int arg2) {
        ++field4071;
        int var3 = class20.field189;
        int[] var4 = class503.field6451;
        boolean var5 = false;
        for (int var6 = 0; var3 > var6; ++var6) {
            class33 var7 = class263.field3508[var4[var6]];
            if (var7 != null && class422.field5564 != var7 && var7.field375 != null && var7.field375.equalsIgnoreCase(arg0)) {
                if (~arg2 != -2) {
                    if (arg2 == 4) {
                        ++class686.field8836;
                        class13 var8 = class659.method3587(class68.field909, 98, class201.field2798);
                        var8.field130.method1521(var4[var6], true);
                        var8.field130.method1491(-129, 0);
                        class116.method679(var8, 0);
                    } else if (~arg2 != -6) {
                        if (arg2 == 6) {
                            ++class222.field3025;
                            class13 var9 = class659.method3587(class68.field909, 98, class436.field5736);
                            var9.field130.method1491(-129, 0);
                            var9.field130.method1521(var4[var6], true);
                            class116.method679(var9, arg1 ^ -25860);
                        } else if (arg2 == 7) {
                            ++class528.field6705;
                            class13 var10 = class659.method3587(class68.field909, arg1 + 25958, class4.field54);
                            var10.field130.method1493(0, (byte) 125);
                            var10.field130.method1541(arg1 + 26234, var4[var6]);
                            class116.method679(var10, 0);
                        } else if (~arg2 == -10) {
                            class13 var11 = class659.method3587(class68.field909, arg1 + 25958, class232.field3127);
                            var11.field130.method1541(374, var4[var6]);
                            var11.field130.method1533(0, (byte) 127);
                            class116.method679(var11, 0);
                        }
                    } else {
                        ++class781.field10658;
                        class13 var12 = class659.method3587(class68.field909, 98, class92.field1253);
                        var12.field130.method1533(0, (byte) 12);
                        var12.field130.method1502(var4[var6], 65280);
                        class116.method679(var12, 0);
                    }
                } else {
                    ++class530.field6731;
                    class13 var13 = class659.method3587(class68.field909, 98, class420.field5536);
                    var13.field130.method1533(0, (byte) 15);
                    var13.field130.method1521(var4[var6], true);
                    class116.method679(var13, 0);
                }
                var5 = true;
                break;
            }
        }
        if (arg1 != -25860) {
            method1925(0);
        }
        if (!var5) {
            class648.method3504(-98, 4, class659.field8565.method3589(class496.field6338, arg1 ^ 12921) + arg0);
        }
    }

    @OriginalMember(owner = "client!qca", name = "z", descriptor = "(I)V")
    public static final void method1925(int arg0) {
        ++field4067;
        if (~class449.field5854 == -2 || class449.field5854 == 3 || ~class449.field5854 != ~class133.field1765 && (class449.field5854 == 0 || ~class133.field1765 == -1)) {
            class750.field10228 = 0;
            class349.field4271 = 0;
            class444.field5811.method2617(28812);
        }
        if (arg0 != 0) {
            method1925(-97);
        }
        class133.field1765 = class449.field5854;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BF)V")
    public final void method1926(byte arg0, float arg1) {
        ++field4068;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field3193[super.field3133++] = (byte) (var3 >> 24);
        super.field3193[super.field3133++] = (byte) (var3 >> 16);
        int var4 = -110 / ((arg0 - -58) / 63);
        super.field3193[super.field3133++] = (byte) (var3 >> 8);
        super.field3193[super.field3133++] = (byte) var3;
    }
}
