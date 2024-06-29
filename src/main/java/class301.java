import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class301 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lmh;")
    private static class128 field5108 = class22.method156(123, "Choose Option");

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "Lmh;")
    public static class128 field5112 = field5108;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Loe;")
    public static class120 field5114 = new class120(16);

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "[[[B")
    public static byte[][][] field5117 = new byte[4][104][104];

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Lmh;")
    public static class128 field5115 = class22.method156(127, "scape main");

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lmh;")
    public static class128 field5116 = class22.method156(123, ")4a=");

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Lmh;")
    private static class128 field5118 = class22.method156(122, "Connected to update server");

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "Lmh;")
    public static class128 field5119 = field5118;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V", line = 9)
    public static final void method2049(int arg0, int arg1) {
        class123.field2090[arg0] = (float) class238.method1622(255, arg1) / 255.0F;
        class123.field2090[0] = (float) (class238.method1622(arg1, 16731009) >> 16) / 255.0F;
        field5110++;
        class123.field2090[1] = (float) (class238.method1622(65287, arg1) >> 8) / 255.0F;
        class84.method534(false, 3);
        class84.method534(false, 4);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "([BIZ[Lid;II)V", line = 35)
    public static final void method2050(byte[] arg0, int arg1, boolean arg2, class249[] arg3, int arg4, int arg5) {
        field5111++;
        int var6 = -1;
        class194 var7 = new class194(arg0);
        while (true) {
            int var8 = var7.method1341(7420);
            if (var8 == 0) {
                if (arg1 != 2) {
                    field5119 = (class128) null;
                }
                return;
            }
            var6 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var7.method1345((byte) 96);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = (var9 & 0xFCC) >> 6;
                int var12 = var9 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var7.method1325(arg1 + 7625);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = var11 + arg5;
                int var18 = var12 + arg4;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class249 var19 = null;
                    if (!arg2) {
                        int var20 = var13;
                        if ((field5117[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg3[var20];
                        }
                    }
                    class43.method296(var18, var16, (byte) -93, arg2, var13, var15, var17, var13, !arg2, var19, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIII)V", line = 109)
    public static final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5107++;
        int var6 = arg3;
        int var7 = arg2 * arg2;
        int var8 = var7 << 1;
        int var9 = arg4;
        int var10 = arg3 << 1;
        int var11 = arg3 * arg3;
        int var12 = var11 << 1;
        int var13 = (1 - var10) * var7 + var12;
        int var14 = var11 - ((var10 - 1) * var8);
        int var15 = var7 << 2;
        int var16 = var11 << 2;
        int var17 = ((arg4 << 1) + 3) * var12;
        int var18 = ((arg3 << 1) - 3) * var8;
        if (arg0 >= class70.field1315 && arg0 <= class181.field3173) {
            int var19 = class7.method59(class43.field875, arg2 + arg5, class193.field3335, 0);
            int var20 = class7.method59(class43.field875, arg5 - arg2, class193.field3335, 0);
            class314.method2138(var19, true, arg1, class219.field3850[arg0], var20);
        }
        int var21 = (arg4 + 1) * var16;
        int var22 = (arg3 - 1) * var15;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var21;
                    var21 += var16;
                    var13 += var17;
                    var9++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var9++;
                var14 += var21;
                var13 += var17;
                var17 += var16;
                var21 += var16;
            }
            var14 += -var18;
            int var23 = arg0 + var6;
            var13 += -var22;
            int var24 = arg0 - var6;
            var22 -= var15;
            var18 -= var15;
            if (var23 >= class70.field1315 && class181.field3173 >= var24) {
                int var25 = class7.method59(class43.field875, arg5 + var9, class193.field3335, 0);
                int var26 = class7.method59(class43.field875, arg5 - var9, class193.field3335, 0);
                if (var24 >= class70.field1315) {
                    class314.method2138(var25, true, arg1, class219.field3850[var24], var26);
                }
                if (class181.field3173 >= var23) {
                    class314.method2138(var25, true, arg1, class219.field3850[var23], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V", line = 219)
    public static void method2052(int arg0) {
        field5114 = null;
        if (arg0 <= 97) {
            return;
        }
        field5115 = null;
        field5108 = null;
        field5116 = null;
        field5112 = null;
        field5117 = (byte[][][]) null;
        field5119 = null;
        field5118 = null;
    }
}
