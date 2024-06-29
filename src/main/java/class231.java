import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class231 {

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Llh;")
    public static class58 field3608 = new class58();

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Z")
    public static boolean field3611 = false;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Z")
    public static boolean field3612 = false;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Ljm;")
    public static class126 field3614 = new class126(5000);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lfk;")
    public static class52 field3609;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
    public static final void method1517(int arg0, int arg1, int arg2, int arg3) {
        field3605++;
        if (arg0 == 0) {
            class181.field2749++;
            field3614.method809(229, 0);
        }
        if (arg0 == 1) {
            field3614.method809(95, 0);
            class256.field4129++;
        }
        field3614.method1361(-2021929176, class228.field3570 + arg3);
        if (arg1 != 32148) {
            field3614 = null;
        }
        field3614.method1400(49152, ++class157.field2168);
        field3614.method1359((byte) 49, class233.field3651[82] ? 1 : 0);
        field3614.method1371(class170.field2421 + arg2, arg1 ^ 0xFFFF825E);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1518(String arg0, int arg1) {
        field3606++;
        return arg1 <= 3 ? -79 : arg0.length() + 1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[Lej;ZIIIIIII[B)V")
    public static final void method1519(int arg0, class213[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        if (arg5 != 7) {
            field3612 = true;
        }
        class215 var11 = new class215(arg10);
        field3607++;
        int var12 = -1;
        while (true) {
            int var13 = var11.method1360((byte) -73);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method1347(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = var14 >> 6 & 0x3F;
                int var19 = var11.method1374((byte) -60);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var17 && var18 >= arg9 && arg9 + 8 > var18 && var16 >= arg3 && arg3 + 8 > var16) {
                    class240 var22 = class265.method1717(-111, var12);
                    int var23 = arg6 + class252.method1644(var22.field3713, var18 & 0x7, var21, var16 & 0x7, true, var22.field3760, arg4);
                    int var24 = arg8 + class168.method1076(var16 & 0x7, var18 & 0x7, -25908, arg4, var22.field3760, var22.field3713, var21);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class213 var25 = null;
                        if (!arg2) {
                            int var26 = arg7;
                            if ((class164.field2333[1][var23][var24] & 0x2) == 2) {
                                var26 = arg7 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg1[var26];
                            }
                        }
                        class83.method534(var25, var23, arg7, arg7, !arg2, (byte) -104, var24, var20, arg2, arg4 + var21 & 0x3, var12);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        field3614 = null;
        field3609 = null;
        if (arg0 != 90) {
            method1521(43, 35, (String) null);
        }
        field3608 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1521(int arg0, int arg1, String arg2) {
        if (arg0 != -27718) {
            method1520((byte) 77);
        }
        field3610++;
        class39 var3 = class149.method935(-93, arg1, 3);
        var3.method261(0);
        var3.field603 = arg2;
    }
}
