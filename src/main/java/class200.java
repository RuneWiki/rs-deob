import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class200 extends class513 {

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    public int field2899 = -1;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public int field2896 = 0;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field2897 = -1;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    public int field2889;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public int field2892;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field2893;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public int field2894;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "I")
    public int field2895;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public int field2898;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "[I")
    public static int[] field2888;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lei;IIZLei;)I")
    public static final int method1351(class183 arg0, int arg1, int arg2, boolean arg3, class183 arg4) {
        field2887++;
        if (arg2 == 1) {
            int var5 = arg0.field5395;
            int var6 = arg4.field5395;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class504.method3019(class369.field4721, 0, arg4.method1222(125).field213, arg0.method1222(5).field213);
        } else if (arg2 == 3) {
            if (arg0.field2651.equals("-")) {
                if (arg4.field2651.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field2651.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class504.method3019(class369.field4721, 0, arg4.field2651, arg0.field2651);
            }
        } else if (arg2 == 4) {
            if (arg0.method2344(0)) {
                return arg4.method2344(0) ? 0 : 1;
            } else if (arg4.method2344(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg0.method2350(false)) {
                return arg4.method2350(false) ? 0 : 1;
            } else if (arg4.method2350(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg0.method2347((byte) 80)) {
                return arg4.method2347((byte) 47) ? 0 : 1;
            } else if (arg4.method2347((byte) 119)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg0.method2346(5)) {
                return arg4.method2346(48) ? 0 : 1;
            } else if (arg4.method2346(2)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg1 <= 31) {
            return -109;
        } else if (arg2 == 8) {
            int var7 = arg0.field2648;
            int var8 = arg4.field2648;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg0.field2655 - arg4.field2655;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
    public static void method1352(byte arg0) {
        if (arg0 == 87) {
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)V")
    public static final void method1353(boolean arg0) {
        field2902++;
        class724.method4056(68);
        class159.method997(-41, 2, class674.field9500.field5128.method2987(0) == 1, 22050);
        if (!arg0) {
            class510.field7114 = class548.method3273(class438.field6016, 22050, 0, class379.field5339, -71);
            class645.method3739((byte) 121, class340.method1965(3, null), true);
            class435.field5966 = class548.method3273(class438.field6016, 2048, 1, class379.field5339, -27);
            class435.field5966.method3143((byte) -41, class237.field3299);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1354(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2890++;
        int var8 = arg5 - arg1;
        int var9 = arg1 + arg6;
        for (int var10 = arg6; var10 < var9; var10++) {
            class721.method4044(class591.field8480[var10], arg2, (byte) -124, arg4, arg3);
        }
        if (arg0 >= -78) {
            field2888 = null;
        }
        for (int var11 = arg5; var11 > var8; var11--) {
            class721.method4044(class591.field8480[var11], arg2, (byte) -127, arg4, arg3);
        }
        int var12 = arg1 + arg2;
        int var13 = arg4 - arg1;
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class591.field8480[var14];
            class721.method4044(var15, arg2, (byte) -125, var12, arg3);
            class721.method4044(var15, var12, (byte) -127, var13, arg7);
            class721.method4044(var15, var13, (byte) -120, arg4, arg3);
        }
    }
}
