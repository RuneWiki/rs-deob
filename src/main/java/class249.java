import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class249 {

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1666(int arg0) {
        class223.field3206 = null;
        class140.field1798 = null;
        class351.field5116 = null;
        class74.field993 = null;
        class79.field1047 = null;
        class573.field8107 = null;
        int var1 = -74 / ((arg0 - 38) / 61);
        class564.field8008 = null;
        class711.field10007 = null;
        class300.field4518 = null;
        class684.field9713 = null;
        class546.field7704 = null;
        class541.field7591 = null;
        class170.field2440 = null;
        class351.field5119 = null;
        class644.field9064 = null;
        class151.field2055 = null;
        class234.field3387 = null;
        class485.field6880 = null;
        field3536++;
    }

    @OriginalMember(owner = "client!rga", name = "a", descriptor = "(IZLoga;ILha;Lor;)Z", line = 35)
    public static final boolean method1667(int arg0, boolean arg1, class497 arg2, int arg3, class66 arg4, class665 arg5) {
        field3537++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field9351 != null) {
            var9 = class436.field6240 - (arg5.field9374 + arg2.field7064 - class436.field6238) * (class436.field6240 - class436.field6232) / (class436.field6244 - class436.field6238);
            var7 = (arg2.field7070 + arg5.field9349 - class436.field6230) * (class436.field6242 - class436.field6224) / (class436.field6235 - class436.field6230) + class436.field6224;
            var8 = class436.field6240 - ((arg2.field7064 + arg5.field9336 - class436.field6238) * (class436.field6240 - class436.field6232) / (class436.field6244 - class436.field6238));
            var6 = class436.field6224 + ((arg5.field9344 + arg2.field7070 - class436.field6230) * (class436.field6242 - class436.field6224) / (class436.field6235 - class436.field6230));
        }
        class112 var10 = null;
        int var11 = 0;
        if (!arg1) {
            return false;
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field9354 != -1) {
            if (arg2.field7065 && arg5.field9343 != -1) {
                var10 = arg5.method3788(arg4, true, 124);
            } else {
                var10 = arg5.method3788(arg4, false, 126);
            }
            if (var10 != null) {
                var11 = arg2.field7068 - (var10.method781() + 1 >> 1);
                var12 = arg2.field7068 + (var10.method781() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg2.field7066 - (var10.method792() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg2.field7066 + (var10.method792() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class734 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg5.field9326 != null) {
            var15 = class486.method2836(arg5.field9347, -17667);
            if (var15 != null) {
                var16 = class408.field5763.method1737(class744.field10362, null, arg5.field9326, null, arg1);
                int var24 = arg2.field7066 - ((class436.field6240 - class436.field6232) * arg5.field9334 / (class436.field6244 - class436.field6238));
                var17 = arg2.field7068 + ((class436.field6242 - class436.field6224) * arg5.field9330 / (class436.field6235 - class436.field6230));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method4110() / 2;
                } else {
                    var18 = var24 - ((var10.method792() >> 1) + (var15.method4104() * var16));
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class744.field10362[var25];
                    if (var16 - 1 > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method4107(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 + arg3 - var19 / 2;
                var21 = arg3 + var17 + (var19 / 2);
                if (var6 > var20) {
                    var6 = var20;
                }
                if (var21 > var7) {
                    var7 = var21;
                }
                var22 = var18 + arg0;
                if (var8 > var22) {
                    var8 = var22;
                }
                var23 = arg0 + var16 * var15.method4104() + var18;
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class436.field6224 > var7 || class436.field6242 < var6 || var9 < class436.field6232 || var8 > class436.field6240) {
            return true;
        }
        class436.method2626(arg4, arg2, arg5);
        if (var10 != null) {
            if (class22.field334 > 0 && (class108.field1313 != -1 && class108.field1313 == arg2.field7063 || class503.field7192 != -1 && class503.field7192 == arg5.field9335)) {
                int var28;
                if (class668.field9392 <= 50) {
                    var28 = class668.field9392 * 2;
                } else {
                    var28 = (100 - class668.field9392) * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg4.method503(var29, arg2.field7066, arg2.field7068, var10.method777() / 2 + 7, false);
                arg4.method503(var29, arg2.field7066, arg2.field7068, var10.method777() / 2 + 5, false);
                arg4.method503(var29, arg2.field7066, arg2.field7068, var10.method777() / 2 + 3, !arg1);
                arg4.method503(var29, arg2.field7066, arg2.field7068, var10.method777() / 2 + 1, !arg1);
                arg4.method503(var29, arg2.field7066, arg2.field7068, var10.method777() / 2, !arg1);
            }
            var10.method785(arg2.field7068 - (var10.method781() >> 1), arg2.field7066 - (var10.method792() >> 1));
        }
        if (arg5.field9326 != null && var15 != null) {
            class631.method3604(arg2, arg4, (byte) -121, var16, var18, arg5, var19, var15, var17);
        }
        if (arg5.field9354 != -1 || arg5.field9326 != null) {
            class724 var30 = new class724(arg2);
            var30.field10153 = var22;
            var30.field10151 = var21;
            var30.field10160 = var12;
            var30.field10147 = var23;
            var30.field10148 = var14;
            var30.field10158 = var13;
            var30.field10159 = var11;
            var30.field10155 = var20;
            class425.field5983.method2510(var30, false);
        }
        return false;
    }
}
