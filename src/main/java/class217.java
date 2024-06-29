import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class217 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field3072 = 3353893;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3080 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lbc;")
    public static class282 field3074;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lfg;")
    public static final class71 method1413(byte arg0) {
        if (arg0 != -111) {
            method1414(-8);
        }
        field3081++;
        return class173.field2480;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lqi;")
    public static final class216 method1414(int arg0) {
        class216 var1 = new class216(34);
        field3075++;
        var1.method1373(11, -13985);
        var1.method1373(class204.field2906, -13985);
        var1.method1373(class269.field3936 ? 1 : 0, -13985);
        var1.method1373(class165.field2370 ? 1 : 0, -13985);
        var1.method1373(class149.field2169 ? 1 : 0, -13985);
        var1.method1373(class94.field1258 ? 1 : 0, arg0 - 13986);
        var1.method1373(class164.field2353 ? 1 : 0, -13985);
        if (arg0 != 1) {
            return null;
        }
        var1.method1373(class3.field39 ? 1 : 0, -13985);
        var1.method1373(class234.field3375 ? 1 : 0, -13985);
        var1.method1373(class284.field4342 ? 1 : 0, -13985);
        var1.method1373(class99.field1347, -13985);
        var1.method1373(class91.field1241 ? 1 : 0, -13985);
        var1.method1373(class193.field2772 ? 1 : 0, -13985);
        var1.method1373(class14.field174 ? 1 : 0, -13985);
        var1.method1373(class115.field1590, -13985);
        var1.method1373(class287.field4461 ? 1 : 0, -13985);
        var1.method1373(class254.field3663, -13985);
        var1.method1373(class137.field1989, arg0 ^ 0xFFFFC95E);
        var1.method1373(class95.field1277, -13985);
        var1.method1387(class168.field2424, arg0 + 3);
        var1.method1387(class137.field1993, arg0 + 3);
        var1.method1373(class162.method1070(), -13985);
        var1.method1410(class115.field1597, (byte) 121);
        var1.method1373(class118.field1666, -13985);
        var1.method1373(class247.field3590 ? 1 : 0, -13985);
        var1.method1373(class254.field3666 ? 1 : 0, -13985);
        var1.method1373(class188.field2698, -13985);
        var1.method1373(class258.field3756 ? 1 : 0, arg0 ^ 0xFFFFC95E);
        var1.method1373(class172.field2461 ? 1 : 0, -13985);
        return var1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([I[I[ILoe;Z)V")
    public static final void method1415(int[] arg0, int[] arg1, int[] arg2, class54 arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var8 != 0 && arg3.field4540.length > var9; var9++) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field4540[var9] = null;
                    } else {
                        class274 var10 = class27.method165(var6, (byte) 122);
                        int var11 = var10.field4090;
                        class214 var12 = arg3.field4540[var9];
                        if (var12 != null) {
                            if (var12.field2988 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field4540[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2987 = 0;
                                    var12.field2994 = 0;
                                    var12.field2991 = var7;
                                    var12.field2992 = 0;
                                    var12.field2995 = 1;
                                    class270.method1730(0, arg3.field4563, arg3.field4553, (byte) -116, var10, false);
                                } else if (var11 == 2) {
                                    var12.field2987 = 0;
                                }
                            } else if (var10.field4071 >= class27.method165(var12.field2988, (byte) -125).field4071) {
                                var12 = arg3.field4540[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class214 var13 = arg3.field4540[var9] = new class214();
                            var13.field2992 = 0;
                            var13.field2988 = var6;
                            var13.field2987 = 0;
                            var13.field2995 = 1;
                            var13.field2994 = 0;
                            var13.field2991 = var7;
                            class270.method1730(0, arg3.field4563, arg3.field4553, (byte) 51, var10, false);
                        }
                    }
                }
                var8 >>>= 0x1;
            }
        }
        field3079++;
        if (!arg4) {
            field3072 = -76;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILca;IJIIII)Z")
    public static final boolean method1416(int arg0, int arg1, int arg2, int arg3, class131 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class44.method282(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method1417(boolean arg0) {
        field3074 = null;
        if (!arg0) {
            field3072 = -14;
        }
        field3080 = null;
    }
}
