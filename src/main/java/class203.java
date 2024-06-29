import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class203 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "[[Lrea;")
    public static class210[][] field2718;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lvl;II)V")
    public static final void method1314(class13 arg0, int arg1, int arg2) {
        field2720++;
        int var3 = -1;
        int var4 = 0;
        if (class463.field6224 < arg0.field238) {
            class124.method943(106, arg0);
        } else if (arg0.field176 < class463.field6224) {
            class174.method1197(-11299, arg0, false);
            var3 = class550.field7691;
            var4 = class751.field10492;
        } else {
            class251.method1542(false, arg0);
        }
        if (arg0.field5801 < 512 || arg0.field5797 < 512 || (class409.field5183 - 1) * 512 <= arg0.field5801 || arg0.field5797 >= (class543.field7597 - 1) * 512) {
            arg0.field153 = -1;
            arg0.field199 = -1;
            arg0.field165 = null;
            arg0.field238 = 0;
            arg0.field176 = 0;
            var4 = 0;
            arg0.field160 = -1;
            var3 = -1;
            arg0.field5801 = arg0.field264[0] * 512 + arg0.method82((byte) 49) * 256;
            arg0.field5797 = arg0.field260[0] * 512 + arg0.method82((byte) 49) * 256;
            arg0.method88(-118);
        }
        int var5 = 121 / ((-arg2 - 68) / 41);
        if (class380.field4847 == arg0 && (arg0.field5801 < 6144 || arg0.field5797 < 6144 || arg0.field5801 >= (class409.field5183 - 12) * 512 || arg0.field5797 >= (class543.field7597 - 12) * 512)) {
            arg0.field153 = -1;
            arg0.field238 = 0;
            arg0.field176 = 0;
            var3 = -1;
            arg0.field160 = -1;
            arg0.field199 = -1;
            arg0.field165 = null;
            var4 = 0;
            arg0.field5801 = arg0.field264[0] * 512 + arg0.method82((byte) 49) * 256;
            arg0.field5797 = arg0.field260[0] * 512 + (arg0.method82((byte) 49) * 256);
            arg0.method88(109);
        }
        int var6 = class346.method1980(-1, arg0);
        class743.method4139(arg0, (byte) 7);
        class582.method3312(var6, var4, var3, arg0, (byte) 91);
        class541.method3104(25, var3, arg0);
        class653.method3669(arg0, 0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)I")
    public static final int method1315(int arg0, int arg1) {
        return class223.field2984 == null ? 0 : class223.field2984[arg0][arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1316(String arg0, boolean arg1) {
        field2717++;
        if (arg0 == null) {
            return;
        }
        if (!(class600.field8359 < 200 || class254.field3244) || class600.field8359 >= 200) {
            class283.method1695(-104, 4, class454.field6013.method2547(-114, class243.field3143));
            String var2 = class454.field6014.method2547(-75, class243.field3143);
            if (var2 != null) {
                class283.method1695(-111, 4, var2);
            }
            return;
        }
        String var3 = class286.method1701(-1, arg0);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class600.field8359; var4++) {
            String var9 = class286.method1701(-1, class207.field2748[var4]);
            if (var9 != null && var9.equals(var3)) {
                class283.method1695(-66, 4, arg0 + class454.field6041.method2547(-82, class243.field3143));
                return;
            }
            if (class726.field10124[var4] != null) {
                String var10 = class286.method1701(-1, class726.field10124[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class283.method1695(-105, 4, arg0 + class454.field6041.method2547(-52, class243.field3143));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class20.field370; var5++) {
            String var7 = class286.method1701(-1, class469.field6287[var5]);
            if (var7 != null && var7.equals(var3)) {
                class283.method1695(-67, 4, class454.field6046.method2547(-106, class243.field3143) + arg0 + class454.field6047.method2547(-62, class243.field3143));
                return;
            }
            if (class636.field8768[var5] != null) {
                String var8 = class286.method1701(-1, class636.field8768[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class283.method1695(-106, 4, class454.field6046.method2547(-103, class243.field3143) + arg0 + class454.field6047.method2547(-100, class243.field3143));
                    return;
                }
            }
        }
        if (arg1) {
            method1315(53, -44);
        }
        if (class286.method1701(-1, class380.field4847.field10062).equals(var3)) {
            class283.method1695(-123, 4, class454.field6044.method2547(-56, class243.field3143));
            return;
        }
        class518.field7255++;
        class589 var6 = class514.method2994(-29488, class760.field10605, class270.field3399);
        var6.field8251.method2578(class747.method4155(-1, arg0), -1221492240);
        var6.field8251.method2597(arg0, (byte) 107);
        class737.method4107(var6, 7);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZZ)V")
    public static final void method1317(boolean arg0, boolean arg1) {
        field2719++;
        if (arg0) {
            method1317(true, true);
        }
        class756.method4199(-1, class540.field7482, arg1, class466.field6263, class356.field4586);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1318(byte arg0) {
        if (arg0 > -125) {
            field2718 = null;
        }
        field2718 = null;
    }
}
