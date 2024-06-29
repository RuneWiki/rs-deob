import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class150 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2846 = -1;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2847 = 0;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lmc;")
    public static class151 field2856;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIILmc;I)V")
    public static final void method1087(int arg0, boolean arg1, int arg2, int arg3, int arg4, class151 arg5, int arg6) {
        class241.field4266 = arg3;
        class215.field3939 = arg5;
        class269.field4739 = arg6;
        class262.field4622 = arg2;
        class205.field3675 = arg1;
        class149.field2845 = arg0;
        class25.field486 = arg4;
        field2854++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lrc;III)V")
    public static final void method1088(class275 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field1364 == arg1 && arg1 != -1) {
            class138 var4 = class193.method1396(arg3 ^ 0xFFFF88EB, arg1);
            int var5 = var4.field2709;
            if (var5 == 1) {
                arg0.field1381 = 0;
                arg0.field1386 = arg2;
                arg0.field1356 = 0;
                arg0.field1402 = 0;
                class53.method518(arg0.field1360, arg0.field1336, -128, arg0.field1402, var4, false);
            }
            if (var5 == 2) {
                arg0.field1356 = 0;
            }
        } else if (arg1 == -1 || arg0.field1364 == -1 || class193.method1396(-30590, arg1).field2698 >= class193.method1396(arg3 - 30695, arg0.field1364).field2698) {
            arg0.field1381 = 0;
            arg0.field1402 = 0;
            arg0.field1356 = 0;
            arg0.field1386 = arg2;
            arg0.field1364 = arg1;
            arg0.field1368 = arg0.field1388;
            if (arg0.field1364 != -1) {
                class53.method518(arg0.field1360, arg0.field1336, -128, arg0.field1402, class193.method1396(-30590, arg0.field1364), false);
            }
        }
        if (arg3 != 105) {
            method1093(false, 106);
        }
        field2852++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)I")
    public static final int method1089(byte arg0) {
        if (arg0 == 67) {
            field2851++;
            return 0;
        } else {
            return -89;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 <= 70) {
            field2850 = -47;
        }
        if (class48.field1096 <= arg6 && arg3 <= class252.field4458 && arg7 >= class275.field4804 && arg5 <= class167.field3064) {
            class216.method1578(arg5, arg3, (byte) 63, arg6, arg1, arg2, arg7, arg4);
        } else {
            class30.method289(arg5, arg7, arg1, 5497, arg2, arg6, arg4, arg3);
        }
        field2855++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIILwd;III)V")
    public static final void method1091(int arg0, int arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6) {
        field2853++;
        if (arg0 != -4491) {
            method1089((byte) -122);
        }
        class122.method934(arg6, arg3.field1360, arg4, arg5, -1, arg1, arg2, arg3.field1336);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
    public static void method1092(byte arg0) {
        field2856 = null;
        if (arg0 >= -84) {
            method1092((byte) 124);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)I")
    public static final int method1093(boolean arg0, int arg1) {
        field2848++;
        long var2 = class111.method874(30351);
        if (arg1 != 1237) {
            field2846 = -123;
        }
        for (class277 var4 = arg0 ? (class277) class176.field3268.method1178(true) : (class277) class176.field3268.method1176((byte) 22); var4 != null; var4 = (class277) class176.field3268.method1176((byte) 22)) {
            if (var2 > (var4.field4824 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field4824 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field4215;
                    class142.field2741[var5] = class254.field4477[var5];
                    var4.method1681(false);
                    return var5;
                }
                var4.method1681(false);
            }
        }
        return -1;
    }
}
