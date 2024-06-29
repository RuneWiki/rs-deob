import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class157 {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lna;")
    private static class26 field2450 = class69.method505("Connection lost)3", (byte) -126);

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lna;")
    public static class26 field2448 = field2450;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Ln;")
    public static class282 field2447 = new class282(64);

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "[S")
    public static short[] field2456 = new short[256];

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Lim;")
    public static class180 field2455;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lek;")
    public class183 field2445;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Lth;")
    public class86 field2454;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "[[[B")
    public static byte[][][] field2449;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIIIIII)V", line = 18)
    public static final void method1070(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2453++;
        int var11 = arg2 - arg4;
        int var12 = -1;
        if (class148.field2316 > 0) {
            if (class173.field2716 <= 10) {
                var12 = class173.field2716 * 5;
            } else {
                var12 = 50 - ((class173.field2716 - 10) * 5);
            }
        }
        int var13 = arg1 - arg9;
        int var14 = 983040 / arg8;
        int var15 = 983040 / arg3;
        for (int var16 = -var14; var16 < var11 + var14; var16++) {
            int var17 = arg5 + (arg8 * var16) >> 16;
            int var18 = (var16 + 1) * arg8 + arg5 >> 16;
            int var19 = var18 - var17;
            if (var19 > 0) {
                int var20 = arg4 + var16 >> 6;
                int var21 = arg0 + var17;
                int var10000 = arg0 + var18;
                if (var20 >= 0 && var20 <= class229.field3631.length - 1) {
                    int[][] var23 = class229.field3631[var20];
                    for (int var24 = -var15; var24 < var13 + var15; var24++) {
                        int var25 = arg6 + ((var24 + 1) * arg3) >> 16;
                        int var26 = arg3 * var24 + arg6 >> 16;
                        int var27 = var25 - var26;
                        if (var27 > 0) {
                            int var28 = arg10 + var26;
                            int var29 = arg9 + var24 >> 6;
                            var10000 = arg10 + var25;
                            if (var29 >= 0 && var29 <= (var23.length - 1) && var23[var29] != null) {
                                int var31 = (arg9 + var24 & 0x3F << 6) + (arg4 + var16 & 0x3F);
                                int var32 = var23[var29][var31];
                                if (var32 != 0) {
                                    class78 var33 = class104.method750(4, var32 - 1);
                                    if (!class146.field2228[var33.field1174]) {
                                        if (var12 != -1 && class321.field5512 == var33.field1174) {
                                            class323 var34 = new class323();
                                            var34.field5548 = var21;
                                            var34.field5558 = var28;
                                            var34.field5549 = var33.field1174;
                                            class225.field3571.method257(true, var34);
                                        } else {
                                            class86.field1422[var33.field1174].method876(var21 - 7, var28 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg7 < 124) {
            return;
        }
        for (class323 var35 = (class323) class225.field3571.method264(-108); var35 != null; var35 = (class323) class225.field3571.method263(4)) {
            class34.method293(var35.field5548, var35.field5558, 15, 16776960, var12);
            class34.method293(var35.field5548, var35.field5558, 13, 16776960, var12);
            class34.method293(var35.field5548, var35.field5558, 11, 16776960, var12);
            class34.method293(var35.field5548, var35.field5558, 9, 16776960, var12);
            class86.field1422[var35.field5549].method876(var35.field5548 - 7, var35.field5558 + -7);
        }
        class225.field3571.method253(-76);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 156)
    public static void method1071(byte arg0) {
        field2456 = null;
        field2447 = null;
        field2455 = null;
        if (arg0 > -33) {
            method1072(-10, 68);
        }
        field2448 = null;
        field2449 = (byte[][][]) null;
        field2450 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V", line = 177)
    public static final void method1072(int arg0, int arg1) {
        if (arg1 != -7) {
            return;
        }
        class50.field793 = new int[arg0];
        class80.field1260 = new int[arg0];
        class249.field4080 = new int[arg0];
        class159.field2480 = new int[arg0];
        field2451++;
        class153.field2392 = new int[arg0];
    }
}
