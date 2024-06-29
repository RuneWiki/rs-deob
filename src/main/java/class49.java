import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class49 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Z")
    public static boolean field561 = false;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ljava/lang/String;")
    public static String field564 = "glow2:";

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    private static final void method297(boolean arg0) {
        if (arg0) {
            method299(81, -49, -19, -95, 127, (class273) null, -20);
        }
        class260.field3789.method71(-73);
        field566++;
        class115.field1594.method71(-76);
        class276.field4201.method71(-128);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method298(int arg0) {
        if (arg0 != -9685) {
            field561 = false;
        }
        field564 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIILgl;I)Z")
    public static final boolean method299(int arg0, int arg1, int arg2, int arg3, int arg4, class273 arg5, int arg6) {
        field562++;
        class177 var7 = class245.method1585(10, arg5.field4049);
        if (var7.field2512 == -1) {
            return true;
        }
        int var9;
        if (arg5.field4030) {
            int var8 = arg5.field4038 + arg3;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class43 var10 = var7.method1147(arg5.field4055, (byte) 111, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg5.field4023;
        int var12 = arg5.field4008;
        if ((var9 & arg1) == 1) {
            var12 = arg5.field4023;
            var11 = arg5.field4008;
        }
        int var13 = var10.field5;
        int var14 = var10.field2;
        if (var7.field2510) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field2515 == 0) {
            var10.method270(arg4 * 4 + 48, (104 - arg6 + -var11) * 4 + 48, var14, var13);
        } else {
            var10.method277(arg4 * 4 + 48, (104 - arg6 + -var11) * 4 + 48, var14, var13, var7.field2515);
        }
        return true;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method300(byte arg0) {
        field567++;
        class292.method1961((byte) -119);
        class24.method146((byte) 35);
        class149.method979(arg0 ^ 0x7A);
        class105.method635(127);
        class248.method1602(-75);
        class54.method327(arg0 + 140);
        class116.method748(-128);
        class38.method236(112);
        class192.method1250((byte) -9);
        class229.method1497(arg0 ^ 0x4A);
        class40.method252(0);
        class55.method335(true);
        class26.method156((byte) 7);
        class97.method578((byte) 84);
        if (arg0 != -58) {
            method297(true);
        }
        class144.method929((byte) -74);
        class107.method675(-9635);
        class189.method1244(arg0 - 18377);
        method297(false);
        class23.method142((byte) -95);
        class63.method385(false);
        class227.field3200.method71(-121);
        class101.field1376.method71(-99);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public static final void method301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        int var8 = arg2 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        field563++;
        int var9 = arg2;
        class171.method1118(1868, arg2);
        int var10 = -var8;
        int var11 = -1;
        int var12 = var8;
        int var13 = -arg2;
        int var14 = -1;
        int var15 = arg3 - var8;
        int[] var16 = class268.field3919[arg6];
        class76.method463(arg3 - arg2, 0, arg1, var15, var16);
        int var17 = arg3 + var8;
        class76.method463(var15, arg5 ^ arg5, arg0, var17, var16);
        class76.method463(var17, 0, arg1, arg2 + arg3, var16);
        while (var7 < var9) {
            var14 += 2;
            var11 += 2;
            var13 += var11;
            var10 += var14;
            if (var10 >= 0 && var12 >= 1) {
                class225.field3169[var12] = var7;
                var12--;
                var10 -= var12 << 1;
            }
            var7++;
            if (var13 >= 0) {
                var9--;
                var13 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class268.field3919[arg6 + var9];
                    int[] var19 = class268.field3919[arg6 - var9];
                    int var20 = class225.field3169[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class76.method463(var22, 0, arg1, var24, var18);
                    class76.method463(var24, arg5 ^ 0xFFFF9723, arg0, var23, var18);
                    class76.method463(var23, 0, arg1, var21, var18);
                    class76.method463(var22, 0, arg1, var24, var19);
                    class76.method463(var24, arg5 + 26845, arg0, var23, var19);
                    class76.method463(var23, 0, arg1, var21, var19);
                } else {
                    int[] var25 = class268.field3919[arg6 - var9];
                    int var26 = arg3 + var7;
                    int[] var27 = class268.field3919[arg6 + var9];
                    int var28 = arg3 - var7;
                    class76.method463(var28, arg5 + 26845, arg1, var26, var27);
                    class76.method463(var28, 0, arg1, var26, var25);
                }
            }
            int[] var29 = class268.field3919[arg6 + var7];
            int[] var30 = class268.field3919[arg6 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 > var7) {
                int var33 = var7 > var12 ? class225.field3169[var7] : var12;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class76.method463(var32, arg5 + 26845, arg1, var35, var29);
                class76.method463(var35, 0, arg0, var34, var29);
                class76.method463(var34, 0, arg1, var31, var29);
                class76.method463(var32, arg5 + 26845, arg1, var35, var30);
                class76.method463(var35, 0, arg0, var34, var30);
                class76.method463(var34, 0, arg1, var31, var30);
            } else {
                class76.method463(var32, 0, arg1, var31, var29);
                class76.method463(var32, 0, arg1, var31, var30);
            }
        }
    }
}
