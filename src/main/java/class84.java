import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class84 extends class290 {

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    public static int[] field1337 = new int[256];

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lce;")
    public static class126 field1342 = class206.method1445(-7923, "Liste der Welten geladen");

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[S")
    public static short[] field1341 = new short[500];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field1335 = 0;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lml;")
    public static class160 field1343;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lfm;")
    public static class315 field1340;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 19)
    public static void method590(int arg0) {
        field1343 = null;
        field1342 = null;
        field1340 = null;
        field1337 = null;
        if (arg0 == 0) {
            field1341 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1337[var0] = var1;
        }
        field1344 = 0;
        field1343 = new class160(64);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZI)V", line = 49)
    public static final void method591(int arg0, boolean arg1, int arg2) {
        field1338++;
        int var3 = 0;
        if (arg1) {
            return;
        }
        while (class53.field806 > var3) {
            class94 var4 = class111.method734(var3, false);
            if (var4 != null) {
                int var5 = var4.field1476;
                if (var5 >= 0 && !class236.field3987.method599(-38, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field1464 >= 0) {
                    int var10 = var4.field1464;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class236.field3979[class157.method1149(96, false, var12)];
                } else if (var5 >= 0) {
                    var6 = class236.field3979[class157.method1149(96, false, class236.field3987.method597(var5, (byte) -98))];
                } else if (var4.field1468 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field1468;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg2 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class236.field3979[class157.method1149(96, false, var9)];
                }
                class300.field4972[var3 + 1] = var6;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V", line = 128)
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1334++;
        if (arg3 != -104 || arg4 < 0 || arg2 < 0 || arg4 >= 103 || arg2 >= 103) {
            return;
        }
        if (arg5 == 0) {
            class130 var8 = class286.method1900(arg6, arg4, arg2);
            if (var8 != null) {
                int var9 = Integer.MAX_VALUE & (int) (var8.field2230 >>> 32);
                if (arg7 == 2) {
                    var8.field2234 = new class95(var9, 2, arg1 + 4, arg6, arg4, arg2, arg0, false, var8.field2234);
                    var8.field2239 = new class95(var9, 2, arg1 + 1 & 0x3, arg6, arg4, arg2, arg0, false, var8.field2239);
                } else {
                    var8.field2234 = new class95(var9, arg7, arg1, arg6, arg4, arg2, arg0, false, var8.field2234);
                }
            }
        }
        if (arg5 == 1) {
            class107 var10 = class320.method2229(arg6, arg4, arg2);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field1678 >>> 32);
                if (arg7 == 4 || arg7 == 5) {
                    var10.field1684 = new class95(var11, 4, arg1, arg6, arg4, arg2, arg0, false, var10.field1684);
                } else if (arg7 == 6) {
                    var10.field1684 = new class95(var11, 4, arg1 + 4, arg6, arg4, arg2, arg0, false, var10.field1684);
                } else if (arg7 == 7) {
                    var10.field1684 = new class95(var11, 4, (arg1 + 2 & 0x3) + 4, arg6, arg4, arg2, arg0, false, var10.field1684);
                } else if (arg7 == 8) {
                    var10.field1684 = new class95(var11, 4, arg1 + 4, arg6, arg4, arg2, arg0, false, var10.field1684);
                    var10.field1683 = new class95(var11, 4, (arg1 + 2 & 0x3) + 4, arg6, arg4, arg2, arg0, false, var10.field1683);
                }
            }
        }
        if (arg5 == 2) {
            if (arg7 == 11) {
                arg7 = 10;
            }
            class240 var12 = class166.method1220(arg6, arg4, arg2);
            if (var12 != null) {
                var12.field4043 = new class95((int) (var12.field4045 >>> 32) & Integer.MAX_VALUE, arg7, arg1, arg6, arg4, arg2, arg0, false, var12.field4043);
            }
        }
        if (arg5 == 3) {
            class8 var13 = class172.method1252(arg6, arg4, arg2);
            if (var13 != null) {
                var13.field103 = new class95((int) (var13.field101 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg6, arg4, arg2, arg0, false, var13.field103);
            }
        }
    }
}
