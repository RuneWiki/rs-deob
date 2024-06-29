import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class236 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field4120 = -2;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "Loh;")
    public static class263 field4127 = null;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ldh;")
    public static class117 field4122 = new class117();

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4128 = -1;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Loh;")
    public static class263 field4129 = class253.method1681(-117, "document)3cookie=(R");

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "Loh;")
    private static class263 field4130 = class253.method1681(-127, "Loaded fonts");

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Loh;")
    public static class263 field4131 = field4130;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIIBI)V")
    public static final void method1580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        field4125++;
        int var11 = arg6 - arg8;
        int var12 = arg10 - arg2;
        boolean var13;
        if (class33.field800 > 0 && class33.field800 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg1;
        for (int var16 = -var15; var16 < var11 + var15; var16++) {
            int var19 = arg1 * var16 + arg5 >> 16;
            int var20 = arg5 + ((var16 + 1) * arg1) >> 16;
            int var21 = var20 - var19;
            if (var21 > 0) {
                int var22 = arg4 + var19;
                int var10000 = arg4 + var20;
                int var24 = arg8 + var16 >> 6;
                if (var24 >= 0 && var24 <= class38.field872.length - 1) {
                    int[][] var25 = class38.field872[var24];
                    for (int var26 = -var14; var26 < var12 + var14; var26++) {
                        int var27 = arg3 + ((var26 + 1) * arg7) >> 16;
                        int var28 = arg7 * var26 + arg3 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            var10000 = arg0 + var27;
                            int var31 = arg0 + var28;
                            int var32 = var26 + arg2 >> 6;
                            if (var32 >= 0 && var25.length - 1 >= var32 && var25[var32] != null) {
                                int var33 = (arg2 + var26 & 0x3F << 6) + (arg8 + var16 & 0x3F);
                                int var34 = var25[var32][var33];
                                if (var34 != 0) {
                                    class12 var35 = class117.method763(var34 - 1, (byte) 3);
                                    if (var13 && class152.field2742 == var35.field271) {
                                        class94 var36 = new class94();
                                        var36.field1859 = var31;
                                        var36.field1856 = var22;
                                        var36.field1853 = var35.field271;
                                        class22.field637.method1883(var36, (byte) -3);
                                    }
                                    class93.field1830[var35.field271].method929(var22 - 7, var31 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var17 = -24 % ((arg9 - 65) / 59);
        for (class94 var18 = (class94) class22.field637.method1878(true); var18 != null; var18 = (class94) class22.field637.method1881(-84)) {
            class93.field1830[var18.field1853].method929(var18.field1856 - 7, var18.field1859 - 7);
            class133.method866(var18.field1856, var18.field1859, 15, 16776960, 128);
            class133.method866(var18.field1856, var18.field1859, 7, 16777215, 256);
        }
        class22.field637.method1884(-33);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
    public static final void method1581(int arg0, int arg1) {
        field4126++;
        if (arg1 != -1) {
            method1580(67, 14, 90, -42, 57, 14, 80, -42, 124, (byte) 126, -89);
        }
        class64 var2 = class84.method563(10, arg0, -91);
        var2.method393(-100);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field4129 = null;
        field4122 = null;
        field4127 = null;
        if (arg0 >= -59) {
            method1581(117, -88);
        }
        field4131 = null;
        field4130 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILpc;)Lpc;")
    public static final class21 method1583(int arg0, class21 arg1) {
        field4123++;
        if (arg0 != 2994) {
            return null;
        }
        class21 var2 = client.method1002(arg1);
        if (var2 == null) {
            var2 = arg1.field571;
        }
        return var2;
    }
}
