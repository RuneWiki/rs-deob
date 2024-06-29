import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class83 {

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "[I")
    public static int[] field1136 = new int[3];

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Lcha;")
    public static class220 field1135 = new class220(14, 16);

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "S")
    public static short field1138 = 1;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "F")
    public static float field1137;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field1129;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public int field1131;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public int field1132;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public int field1133;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)I")
    public static final int method690(byte arg0) {
        if (arg0 <= 38) {
            method691(26, 46, 93, -69, (byte) -81, 103);
        }
        field1128++;
        return class259.field3281 == 1 ? class631.field8709 : class640.field8891;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIBI)I")
    public static final int method691(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field1134++;
        if (class195.field2669 == null) {
            return 0;
        } else if (arg4 == 65) {
            if (arg3 < 3) {
                int var6 = arg5 >> 9;
                int var7 = arg1 >> 9;
                if (arg2 < 0 || arg0 < 0 || arg2 > (class409.field5183 - 1) || arg0 > (class543.field7597 - 1)) {
                    return 0;
                }
                if (var6 < 1 || var7 < 1 || (class409.field5183 - 1) < var6 || class543.field7597 - 1 < var7) {
                    return 0;
                }
                boolean var8 = (class305.field4001[1][arg5 >> 9][arg1 >> 9] & 0x2) != 0;
                if ((arg5 & 0x1FF) == 0) {
                    boolean var9 = (class305.field4001[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                    boolean var10 = (class305.field4001[1][var6][arg1 >> 9] & 0x2) != 0;
                    if (var9 != var10) {
                        var8 = (class305.field4001[1][arg2][arg0] & 0x2) != 0;
                    }
                }
                if ((arg1 & 0x1FF) == 0) {
                    boolean var11 = (class305.field4001[1][arg5 >> 9][var7 - 1] & 0x2) != 0;
                    boolean var12 = (class305.field4001[1][arg5 >> 9][var7] & 0x2) != 0;
                    if (var12 != var11) {
                        var8 = (class305.field4001[1][arg2][arg0] & 0x2) != 0;
                    }
                }
                if (var8) {
                    arg3++;
                }
            }
            return class195.field2669[arg3].method1676(arg5, true, arg1);
        } else {
            return -51;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lsl;B)Lau;")
    public static final class739 method692(class461 arg0, byte arg1) {
        arg0.method2600((byte) -124);
        field1130++;
        int var2 = arg0.method2600((byte) -128);
        class739 var3 = class508.method2964((byte) -78, var2);
        if (arg1 != 75) {
            return null;
        }
        var3.field10296 = arg0.method2600((byte) -124);
        int var4 = arg0.method2600((byte) -126);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2600((byte) -123);
            var3.method214(arg0, var6, arg1 - 78);
        }
        var3.method216(-21773);
        return var3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method693(int arg0) {
        if (arg0 < 19) {
            method691(-17, 69, -101, -70, (byte) 15, 81);
        }
        field1136 = null;
        field1135 = null;
    }
}
