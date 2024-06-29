import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class640 {

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "I")
    public static int field9075 = -1;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "[S")
    public static short[] field9079 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "I")
    public static int field9074;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "I")
    public static int field9076;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(ILvl;IIB)V", line = 13)
    public static final void method3565(int arg0, class13 arg1, int arg2, int arg3, byte arg4) {
        field9077++;
        long var5 = (long) (arg0 << 14 | arg3 << 28 | arg2);
        class435 var7 = (class435) class179.field2656.method2061(-17305, var5);
        if (var7 == null) {
            class435 var8 = new class435();
            class179.field2656.method2063(var5, arg4 - 39, var8);
            var8.field6146.method1273(arg1, (byte) 122);
            return;
        }
        class257 var9 = class648.field9184.method3064(arg1.field216, -23);
        int var10 = var9.field3659;
        if (var9.field3628 == 1) {
            var10 = (arg1.field217 + 1) * var10;
        }
        for (class13 var11 = (class13) var7.field6146.method1270((byte) -25); var11 != null; var11 = (class13) var7.field6146.method1282(0)) {
            class257 var12 = class648.field9184.method3064(var11.field216, -30);
            int var13 = var12.field3659;
            if (var12.field3628 == 1) {
                var13 = (var11.field217 + 1) * var13;
            }
            if (var10 > var13) {
                class398.method2264(arg1, var11, (byte) 74);
                return;
            }
        }
        if (arg4 != 40) {
            field9075 = 43;
        }
        var7.field6146.method1273(arg1, (byte) 122);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V", line = 65)
    public static void method3566(boolean arg0) {
        if (arg0) {
            field9075 = 28;
        }
        field9079 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Lpd;", line = 80)
    public static final class233 method3567(byte arg0) {
        field9076++;
        if (arg0 == -69) {
            return class182.field2690.length > class70.field946 ? class182.field2690[class70.field946++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(II)V", line = 97)
    public static final void method3568(int arg0, int arg1) {
        class364.field5203 = arg1;
        field9078++;
        class328 var2 = class533.field7259;
        synchronized (class533.field7259) {
            class533.field7259.method1997(arg0);
        }
        class328 var3 = class44.field661;
        synchronized (class44.field661) {
            class44.field661.method1997(1);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)V", line = 111)
    public static final void method3569(byte arg0) {
        if (arg0 > -15) {
            field9075 = -8;
        }
        field9074++;
        int var1 = class274.field3872.method2440((byte) -97, class429.field6020);
        if (var1 == 0) {
            class446.field6246 = null;
            class454.method2605(0, 10159);
        } else if (var1 == 1) {
            class249.method1538(96, (byte) 0);
            class454.method2605(512, 10159);
            if (class246.field3501 != null) {
                class114.method848((byte) -53);
            }
        } else {
            class249.method1538(110, (byte) (class460.field6516 - 4 & 0xFF));
            class454.method2605(2, 10159);
        }
        class156.field2354 = class233.field3305;
    }
}
