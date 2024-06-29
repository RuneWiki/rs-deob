import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class266 extends class273 {

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lwm;")
    public static class152 field4481 = class157.method1048("::pcachesize", 127);

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "[I")
    public static int[] field4491 = new int[8];

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "B")
    public byte field4486;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "Lwm;")
    public class152 field4487;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "Lwm;")
    public class152 field4488;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 24)
    public static void method1822(int arg0) {
        int var1 = -89 % ((arg0 + 53) / 47);
        field4481 = null;
        field4491 = null;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)Z", line = 45)
    public static final boolean method1823(byte arg0) {
        field4485++;
        class253 var1 = class236.field3866;
        synchronized (class236.field3866) {
            if (client.field4352 == class146.field2245) {
                return false;
            }
            class42.field667 = class12.field178[client.field4352];
            class197.field3167 = class284.field4834[client.field4352];
            if (arg0 > -121) {
                return true;
            } else {
                client.field4352 = client.field4352 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)I", line = 65)
    public static final int method1824(int arg0, byte arg1) {
        if (arg1 != 89) {
            return 61;
        }
        field4480++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xDC) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIIIIIIII)V", line = 125)
    public static final void method1825(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 > -30) {
            return;
        }
        field4482++;
        if (arg2 == arg5 && arg3 == arg8 && arg7 == arg9 && arg0 == arg4) {
            class212.method1425(0, arg6, arg8, arg2, arg7, arg0);
            return;
        }
        int var10 = arg2;
        int var11 = arg8;
        int var12 = arg2 * 3;
        int var13 = arg8 * 3;
        int var14 = arg5 * 3;
        int var15 = arg3 * 3;
        int var16 = arg9 * 3;
        int var17 = arg4 * 3;
        int var18 = arg7 + var14 - arg2 - var16;
        int var19 = var16 + var12 - var14 - var14;
        int var20 = arg0 - arg8 - (-var15 + var17);
        int var21 = var14 - var12;
        int var22 = var15 - var13;
        int var23 = var17 + var13 - var15 - var15;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var18 * var26;
            int var28 = var19 * var25;
            int var29 = var20 * var26;
            int var30 = var23 * var25;
            int var31 = var22 * var24;
            int var32 = var21 * var24;
            int var33 = (var28 + var32 + var27 >> 12) + arg2;
            int var34 = (var29 + var31 + var30 >> 12) + arg8;
            class212.method1425(0, arg6, var11, var10, var33, var34);
            var11 = var34;
            var10 = var33;
        }
    }
}
