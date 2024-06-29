import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class579 extends class378 {

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8251 = 0;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "Lrl;")
    public static class672 field8254 = new class672(11, -1);

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field8249;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "I")
    public static int field8252;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field8256;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    public static int field8257;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Ldd;")
    public static class654 field8250;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIILua;ILpca;IILr;)V", line = 7)
    public static final void method3394(int arg0, int arg1, int arg2, class617 arg3, int arg4, class665 arg5, int arg6, int arg7, class167 arg8) {
        field8249++;
        class257 var9 = class498.field7303.method3286(29982, arg7);
        if (var9 != null && var9.field4071 && var9.method1822((byte) -67, class539.field7869)) {
            if (var9.field4072 != null) {
                int[] var10 = new int[var9.field4072.length];
                for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                    int var13;
                    if (class126.field2062 == 4) {
                        var13 = (int) class37.field514 & 0x3FFF;
                    } else {
                        var13 = (int) class37.field514 + class44.field616 & 0x3FFF;
                    }
                    int var14 = class567.field8139[var13];
                    int var15 = class567.field8138[var13];
                    if (class126.field2062 != 4) {
                        var15 = var15 * 256 / (class64.field820 + 256);
                        var14 = var14 * 256 / (class64.field820 + 256);
                    }
                    var10[var11 * 2] = arg6 - (-((var9.field4072[var11 * 2] * 4 + arg0) * var15 + (var9.field4072[var11 * 2 + 1] * 4 + arg4) * var14 >> 14) - (arg5.field9411 / 2));
                    var10[var11 * 2 + 1] = arg5.field9282 / 2 + arg1 - ((var9.field4072[var11 * 2 + 1] * 4 + arg4) * var15 - ((var9.field4072[var11 * 2] * 4 + arg0) * var14) >> 14);
                }
                class513.method3106(arg8, var10, var9.field4099, arg5.field9355, arg5.field9406);
                for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                    arg8.method316(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field4083, 1, arg3, arg6, arg1);
                }
                arg8.method316(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field4083, 1, arg3, arg6, arg1);
            }
            class702 var16 = null;
            if (var9.field4102 != -1) {
                var16 = var9.method1815(arg8, false, false);
                if (var16 != null) {
                    class418.method2671(arg3, arg0, arg6, arg1, true, arg5, arg4, var16);
                }
            }
            if (var9.field4088 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method1075();
                }
                class418 var18 = class329.field5095;
                class632 var19 = class130.field2132;
                if (var9.field4103 == 1) {
                    var18 = class573.field8183;
                    var19 = class125.field2057;
                }
                if (var9.field4103 == 2) {
                    var18 = class246.field3928;
                    var19 = class35.field508;
                }
                class470.method2918(arg1, arg5, var9.field4088, (byte) -108, arg4, var18, arg6, var9.field4097, var19, var17, arg3, arg0);
            }
        }
        if (arg2 != 2) {
            method3397(null, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 107)
    public static final void method3395(int arg0, int arg1, int arg2) {
        field8252++;
        if (class99.field1647 == class34.field500) {
            if (class388.method2522(arg0, 1, arg2, 1, 0, -2, (byte) 31, 0, false)) {
                return;
            }
            class388.method2522(arg0, 1, arg2, 1, 0, -3, (byte) 31, 0, false);
        } else if (class388.method2522(arg0, 1, arg2, 1, 0, -3, (byte) 31, 0, false)) {
            return;
        } else {
            class388.method2522(arg0, 1, arg2, 1, 0, -2, (byte) 31, 0, false);
        }
        if (arg1 > -78) {
            method3395(-80, 125, -104);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 134)
    public static void method3396(int arg0) {
        if (arg0 == 1) {
            field8254 = null;
            field8250 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lpca;B)Lpca;", line = 150)
    public static final class665 method3397(class665 arg0, byte arg1) {
        field8253++;
        if (arg1 != 74) {
            method3395(72, -13, 75);
        }
        class665 var2 = client.method1938(arg0);
        if (var2 == null) {
            var2 = arg0.field9403;
        }
        return var2;
    }
}
