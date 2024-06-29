import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class153 extends class166 {

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field2908 = 0;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lmc;")
    public static class151 field2906;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public static void method1148(int arg0) {
        int var1 = -49 % ((-arg0 - 51) / 50);
        field2906 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIIII)V")
    public static final void method1149(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2907++;
        if (arg0 != -100 || class167.field3064 < arg3 || arg5 < class275.field4804) {
            return;
        }
        boolean var6;
        if (class48.field1096 > arg2) {
            var6 = false;
            arg2 = class48.field1096;
        } else if (class252.field4458 < arg2) {
            var6 = false;
            arg2 = class252.field4458;
        } else {
            var6 = true;
        }
        boolean var7;
        if (arg4 < class48.field1096) {
            arg4 = class48.field1096;
            var7 = false;
        } else if (arg4 <= class252.field4458) {
            var7 = true;
        } else {
            var7 = false;
            arg4 = class252.field4458;
        }
        if (class275.field4804 <= arg3) {
            class194.method1405(true, class121.field2390[arg3++], arg4, arg2, arg1);
        } else {
            arg3 = class275.field4804;
        }
        if (arg5 > class167.field3064) {
            arg5 = class167.field3064;
        } else {
            class194.method1405(true, class121.field2390[arg5--], arg4, arg2, arg1);
        }
        if (var6 && var7) {
            for (int var8 = arg3; var8 <= arg5; var8++) {
                int[] var9 = class121.field2390[var8];
                var9[arg2] = var9[arg4] = arg1;
            }
        } else if (var6) {
            for (int var11 = arg3; var11 <= arg5; var11++) {
                class121.field2390[var11][arg2] = arg1;
            }
        } else if (var7) {
            for (int var10 = arg3; var10 <= arg5; var10++) {
                class121.field2390[var10][arg4] = arg1;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)V")
    public static final void method1150(int arg0, byte arg1, int arg2) {
        for (int var3 = 0; var3 < class200.field3574; var3++) {
            class136 var4 = class253.method1760(var3, true);
            if (var4 != null) {
                int var5 = var4.field2667;
                if (var5 >= 0 && !class213.field3850.method509(var5, (byte) -51)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field2652 >= 0) {
                    int var10 = var4.field2652;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (var10 & 0x380) + (arg0 + var10 & 0xFC00) + var11;
                    var9 = class213.field3857[class24.method214(19643, 96, var12)];
                } else if (var5 >= 0) {
                    var9 = class213.field3857[class24.method214(19643, 96, class213.field3850.method510(var5, (byte) 40))];
                } else if (var4.field2664 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field2664;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class213.field3857[class24.method214(19643, 96, var8)];
                }
                class97.field1974[var3 + 1] = var9;
            }
        }
        field2905++;
        if (arg1 > -70) {
            method1149((byte) 4, -98, -105, 46, 5, -3);
        }
    }
}
