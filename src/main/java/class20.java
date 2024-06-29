import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class20 extends class326 {

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    public static int field305 = 1;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public static int field306 = 0;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field311 = -1;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "Lug;")
    public static class253 field303;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "Lug;")
    public static class253 field310;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method103(int arg0, int arg1) {
        field307++;
        int[] var3 = this.field5112.method1648(arg1, -16687);
        if (this.field5112.field3583) {
            int[][] var4 = this.method2293(-15033, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class166.field2731; var8++) {
                var3[var8] = (var5[var8] + var7[var8] + var6[var8]) / 3;
            }
        }
        if (arg0 >= -25) {
            this.method103(-46, 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(CZ)Z", line = 45)
    public static final boolean method202(char arg0, boolean arg1) {
        field308++;
        if (arg1) {
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(III)J", line = 57)
    public static final long method203(int arg0, int arg1, int arg2) {
        class124 var3 = class83.field1138[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1798; var4++) {
            class263 var5 = var3.field1783[var4];
            if ((var5.field4122 >> 29 & 0x3L) == 2L && var5.field4124 == arg1 && var5.field4127 == arg2) {
                return var5.field4122;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIILgh;IJIIII)Z", line = 82)
    public static final boolean method204(int arg0, int arg1, int arg2, int arg3, class248 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class99.method692(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILug;)V", line = 90)
    public static final void method205(int arg0, class253 arg1) {
        class7.field144 = arg1;
        field304++;
        if (arg0 != 1) {
            method206(false);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V", line = 101)
    public static void method206(boolean arg0) {
        field310 = null;
        field303 = null;
        if (arg0) {
            field303 = (class253) null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIBI)V", line = 112)
    public static final void method207(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field309++;
        for (class166 var5 = (class166) class81.field1109.method22((byte) 125); var5 != null; var5 = (class166) class81.field1109.method26((byte) -121)) {
            class181.method1333(var5, arg0, (byte) -119, arg4, arg1, arg2);
        }
        for (class166 var6 = (class166) class284.field4394.method22((byte) 121); var6 != null; var6 = (class166) class284.field4394.method26((byte) -123)) {
            byte var7 = 1;
            class107 var8 = var6.field2719.method2100(2000117776);
            if (var6.field2719.field4724 == var8.field1451) {
                var7 = 0;
            } else if (var6.field2719.field4724 == var8.field1420 || var6.field2719.field4724 == var8.field1431 || var6.field2719.field4724 == var8.field1446 || var6.field2719.field4724 == var8.field1408) {
                var7 = 2;
            } else if (var6.field2719.field4724 == var8.field1415 || var6.field2719.field4724 == var8.field1427 || var6.field2719.field4724 == var8.field1435 || var6.field2719.field4724 == var8.field1409) {
                var7 = 3;
            }
            if (var6.field2725 != var7) {
                int var9 = class213.method1549(var6.field2719, 95);
                if (var6.field2740 != var9) {
                    if (var6.field2721 != null) {
                        class86.field1174.method1313(var6.field2721);
                        var6.field2721 = null;
                    }
                    var6.field2740 = var9;
                }
                var6.field2725 = var7;
            }
            var6.field2714 = var6.field2719.field4698;
            var6.field2726 = var6.field2719.field4698 + var6.field2719.method2099((byte) 123) * 64;
            var6.field2739 = var6.field2719.field4731;
            var6.field2717 = var6.field2719.field4731 + var6.field2719.method2099((byte) 123) * 64;
            class181.method1333(var6, arg0, (byte) -84, arg4, arg1, arg2);
        }
        if (arg3 <= 29) {
            return;
        }
        for (class166 var10 = (class166) class99.field1304.method2174(256); var10 != null; var10 = (class166) class99.field1304.method2164((byte) 118)) {
            byte var11 = 1;
            class107 var12 = var10.field2718.method2100(2000117776);
            if (var10.field2718.field4724 == var12.field1451) {
                var11 = 0;
            } else if (var10.field2718.field4724 == var12.field1420 || var10.field2718.field4724 == var12.field1431 || var10.field2718.field4724 == var12.field1446 || var10.field2718.field4724 == var12.field1408) {
                var11 = 2;
            } else if (var10.field2718.field4724 == var12.field1415 || var10.field2718.field4724 == var12.field1427 || var10.field2718.field4724 == var12.field1435 || var10.field2718.field4724 == var12.field1409) {
                var11 = 3;
            }
            if (var10.field2725 != var11) {
                int var13 = class166.method1247((byte) -48, var10.field2718);
                if (var10.field2740 != var13) {
                    if (var10.field2721 != null) {
                        class86.field1174.method1313(var10.field2721);
                        var10.field2721 = null;
                    }
                    var10.field2740 = var13;
                }
                var10.field2725 = var11;
            }
            var10.field2714 = var10.field2718.field4698;
            var10.field2726 = var10.field2718.field4698 + (var10.field2718.method2099((byte) 123) * 64);
            var10.field2739 = var10.field2718.field4731;
            var10.field2717 = var10.field2718.field4731 + var10.field2718.method2099((byte) 123) * 64;
            class181.method1333(var10, arg0, (byte) 57, arg4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 234)
    public class20() {
        super(1, true);
    }
}
