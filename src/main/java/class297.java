import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class297 {

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lmh;")
    public static class128 field5069 = class22.method156(124, "Lade)3)3)3");

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field5072 = 1;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Lmh;")
    public static class128 field5068 = class22.method156(122, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lmh;")
    public static class128 field5066 = class22.method156(122, "::noclip");

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lmd;")
    public static class241 field5065;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Ldj;")
    public static class314 field5064;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "[B")
    public static byte[] field5071;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 10)
    public static void method2033(byte arg0) {
        field5068 = null;
        field5065 = null;
        field5069 = null;
        if (arg0 != -31) {
            field5067 = 63;
        }
        field5066 = null;
        field5071 = null;
        field5064 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)Z", line = 25)
    public static final boolean method2034(int arg0, int arg1, int arg2, int arg3) {
        if (class74.method488(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class62.method409(var4 + 1, class250.field4334[arg0][arg1][arg2] + arg3, var5 + 1) && class62.method409(var4 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class62.method409(var4 + 128 - 1, class250.field4334[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class62.method409(var4 + 1, class250.field4334[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I", line = 41)
    public static final int method2035(int arg0, int arg1) {
        field5063++;
        if (arg0 > -124) {
            field5071 = (byte[]) null;
        }
        if (arg1 >= 65 && arg1 <= 90 || arg1 >= 192 && arg1 <= 222 && arg1 != 215) {
            return arg1 + 32;
        } else if (arg1 == 159) {
            return 255;
        } else if (arg1 == 140) {
            return 156;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIZILem;)V", line = 94)
    public static final void method2036(int arg0, int arg1, boolean arg2, int arg3, class10 arg4) {
        if (arg2) {
            return;
        }
        field5074++;
        if (class247.field4247) {
            class269.method1875(arg0, arg1, arg4.field260 + arg0, arg4.field226 + arg1);
        }
        if (class283.field4872 < 3) {
            if (class247.field4247) {
                ((class40) class221.field3887).method272(arg0, arg1, arg4.field260, arg4.field226, class221.field3887.field1058 / 2, class221.field3887.field1060 / 2, class118.field1997, 256, (class40) arg4.method82((byte) 78, false));
            } else {
                ((class231) class221.field3887).method745(arg0, arg1, arg4.field260, arg4.field226, class221.field3887.field1058 / 2, class221.field3887.field1060 / 2, class118.field1997, 256, arg4.field268, arg4.field289);
            }
        } else if (class247.field4247) {
            class55 var5 = arg4.method82((byte) 78, false);
            if (var5 != null) {
                var5.method273(arg0, arg1);
            }
        } else {
            class213.method1475(arg0, arg1, 0, arg4.field268, arg4.field289);
        }
        class199.field3468[arg3] = true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)I", line = 136)
    public static final int method2037(int arg0, int arg1, int arg2) {
        field5070++;
        if (arg2 != -25932) {
            field5068 = (class128) null;
        }
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }
}
