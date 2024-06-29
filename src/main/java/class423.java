import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class423 {

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "[I")
    public static int[] field6037 = new int[13];

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field6041 = 0;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lbb;")
    public static class182 field6036;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "[S")
    public static short[] field6040;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "[[[B")
    public static byte[][][] field6035;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method2650(byte arg0) {
        field6036 = null;
        field6040 = null;
        field6035 = null;
        if (arg0 != 53) {
            method2651((byte) 78);
        }
        field6037 = null;
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
    public static final void method2651(byte arg0) {
        field6042++;
        class15 var1 = class294.field4263;
        synchronized (class294.field4263) {
            class294.field4263.method98(0);
        }
        class15 var2 = class446.field6372;
        synchronized (class446.field6372) {
            class446.field6372.method98(0);
        }
        class15 var3 = class287.field4179;
        synchronized (class287.field4179) {
            class287.field4179.method98(0);
        }
        if (arg0 < 43) {
            method2651((byte) 23);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(III[Lqr;II[BLvq;IBZI)V")
    public static final void method2652(int arg0, int arg1, int arg2, class41[] arg3, int arg4, int arg5, byte[] arg6, class269 arg7, int arg8, byte arg9, boolean arg10, int arg11) {
        field6039++;
        int var12 = 91 / ((arg9 - 17) / 54);
        class130 var13 = new class130(arg6);
        int var14 = -1;
        while (true) {
            int var15 = var13.method813(-1);
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var13.method854(3944);
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var13.method837(true);
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg0 == var20 && var19 >= arg2 && arg2 + 8 > var19 && arg8 <= var18 && var18 < arg8 + 8) {
                    class282 var24 = class398.method2496(-119, var14);
                    int var25 = class120.method734(var19 & 0x7, var23, var18 & 0x7, arg11, var24.field4085, 0, var24.field4090) + arg5;
                    int var26 = class371.method2380(var24.field4085, var19 & 0x7, arg11, var23, var24.field4090, var18 & 0x7, 7) + arg1;
                    if (var25 > 0 && var26 > 0 && var25 < class80.field1034 - 1 && var26 < (class381.field5414 - 1)) {
                        class41 var27 = null;
                        if (!arg10) {
                            int var28 = arg4;
                            if ((class320.field4692[1][var25][var26] & 0x2) == 2) {
                                var28 = arg4 - 1;
                            }
                            if (var28 >= 0) {
                                var27 = arg3[var28];
                            }
                        }
                        class3.method7(-1, var14, var27, var26, true, var25, var22, arg4, -72, arg7, arg11 + var23 & 0x3, arg10, arg4);
                    }
                }
            }
        }
    }
}
