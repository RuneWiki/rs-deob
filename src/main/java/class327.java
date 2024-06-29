import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class327 {

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Lju;")
    public static class102 field4206 = new class102(42, 3);

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "[F")
    public static float[] field4209 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "J")
    public static long field4207 = 0L;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "F")
    public static float field4204;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)[Lvfa;")
    public static final class92[] method1910(byte arg0) {
        if (arg0 != -17) {
            method1914(-29);
        }
        field4205++;
        return new class92[] { class121.field1658, class116.field1625, class626.field8940 };
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lpaa;I)Lpaa;")
    public static final class712 method1911(class712 arg0, int arg1) {
        field4203++;
        class712 var2 = client.method2683(arg0);
        if (arg1 < 63) {
            field4204 = -1.206509F;
        }
        if (var2 == null) {
            var2 = arg0.field10060;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1912(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class490.field6592 <= (arg3 - arg1) && (arg1 + arg3) <= class116.field1628 && (arg2 - arg1) >= class675.field9512 && arg1 + arg2 <= class395.field5484) {
            class605.method3547(arg5, arg1, arg2, (byte) -122, arg3, arg6, arg0);
        } else {
            class257.method1601(arg4 - 2, arg2, arg5, arg3, arg6, arg0, arg1);
        }
        if (arg4 == 1) {
            field4208++;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([[BLtp;B)V")
    public static final void method1913(byte[][] arg0, class295 arg1, byte arg2) {
        field4202++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field1524; var4++) {
            class350.method1993(26779);
            for (int var9 = 0; var9 < class514.field7179 >> 3; var9++) {
                for (int var10 = 0; var10 < class456.field6281 >> 3; var10++) {
                    int var11 = class540.field7549[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3AC62E1) >> 24;
                        if (!arg1.field1519 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = var11 >> 14 & 0x3FF;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + (var15 / 8);
                            for (int var17 = 0; var17 < class592.field8537.length; var17++) {
                                if (class592.field8537[var17] == var16 && arg0[var17] != null) {
                                    class26 var18 = new class26(arg0[var17]);
                                    arg1.method709(var13, var18, var15, var4, var14, class464.field6351, var12, var9 * 8, false, var10 * 8);
                                    arg1.method1727(var3[0] == -1 ? var3 : null, var12, var10 * 8, 4397, var9 * 8, var18, var15, var14, var13, class96.field1401, var4);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int var5 = 0;
        if (arg2 >= -24) {
            return;
        }
        while (var5 < arg1.field1524) {
            class350.method1993(26779);
            for (int var6 = 0; var6 < (class514.field7179 >> 3); var6++) {
                for (int var7 = 0; var7 < (class456.field6281 >> 3); var7++) {
                    int var8 = class540.field7549[var5][var6][var7];
                    if (var8 == -1) {
                        arg1.method707(var5, 87, var7 * 8, 8, 8, var6 * 8);
                    }
                }
            }
            var5++;
        }
        if (var3[0] != -1) {
            class67.field932 = class533.field7474.method1230(var3[2], class128.field1758, var3[1], false, var3[3], var3[0]);
            class143.field1986 = var3[4];
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method1914(int arg0) {
        if (arg0 <= -31) {
            field4209 = null;
            field4206 = null;
        }
    }
}
