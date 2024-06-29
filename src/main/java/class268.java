import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class268 {

    @OriginalMember(owner = "client!br", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3532 = new String[8];

    @OriginalMember(owner = "client!br", name = "h", descriptor = "Lff;")
    public static class9 field3537 = new class9(37, 5);

    @OriginalMember(owner = "client!br", name = "a", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!br", name = "b", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!br", name = "d", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!br", name = "f", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!br", name = "g", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!br", name = "e", descriptor = "Lf;")
    public static class529 field3534;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1609(String arg0, int arg1, boolean arg2) {
        field3533++;
        if (arg0 == null) {
            return;
        }
        if (arg1 >= ~class114.field1621) {
            class414.method2404(class314.field4114.method1764(class489.field6789, false), -110);
            return;
        }
        String var3 = class264.method1587(arg0, -18488);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class114.field1621; var4++) {
            String var8 = class264.method1587(class227.field3064[var4], -18488);
            if (var8 != null && var8.equals(var3)) {
                class414.method2404(arg0 + class324.field4266.method1764(class489.field6789, false), -48);
                return;
            }
            if (class184.field2622[var4] != null) {
                String var9 = class264.method1587(class184.field2622[var4], arg1 - 18387);
                if (var9 != null && var9.equals(var3)) {
                    class414.method2404(arg0 + class324.field4266.method1764(class489.field6789, false), -115);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class267.field3528; var5++) {
            String var6 = class264.method1587(class471.field6485[var5], -18488);
            if (var6 != null && var6.equals(var3)) {
                class414.method2404(class323.field4229.method1764(class489.field6789, false) + arg0 + class285.field3722.method1764(class489.field6789, false), arg1 + 14);
                return;
            }
            if (class71.field1076[var5] != null) {
                String var7 = class264.method1587(class71.field1076[var5], -18488);
                if (var7 != null && var7.equals(var3)) {
                    class414.method2404(class323.field4229.method1764(class489.field6789, false) + arg0 + class285.field3722.method1764(class489.field6789, false), -65);
                    return;
                }
            }
        }
        if (class264.method1587(class385.field5232.field7638, -18488).equals(var3)) {
            class414.method2404(class159.field2357.method1764(class489.field6789, false), -89);
            return;
        }
        class103.field1512++;
        class118.method822(arg1 ^ 0x30, class299.field3965);
        class193.field2708.method2200(arg1 + 108, class125.method912(arg0, 1) + 1);
        class193.field2708.method2216(arg0, arg1 ^ 0x19);
        class193.field2708.method2200(7, arg2 ? 1 : 0);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public static final void method1610(int arg0) {
        field3530++;
        class516.field7655.method1134(5, (byte) -69);
        class310.field4072.method388(false, 5);
        class204.field2828.method2533((byte) 102, 5);
        class402.field5388.method2001((byte) -71, 5);
        class206.field2849.method2550(arg0 ^ 0xFFFFFFE2, 5);
        class127.field1852.method2395(-1, arg0);
        class423.field5791.method1604(5, 0);
        class441.field6049.method727(5, (byte) 119);
        class185.field2626.method2255(5, true);
        class206.field2850.method425(-74, 5);
        class291.field3825.method132(64, 5);
        class267.field3522.method1011(5, (byte) 114);
        class466.field6434.method371(126, 5);
        class270.field3546.method696(5, 7);
        class159.field2353.method1409(true, 5);
        class389.field5280.method654(16, 5);
        class520.field7700.method2366(arg0 ^ 0x6, 5);
        class201.field2792.method2838(5, (byte) 51);
        class31.field513.method2336(28, 5);
        client.field2731.method929(5, 127);
        class497.method2853(1808474375, 5);
        class289.method1698(-128, 50);
        class390.method2300(82, 5);
        class526.method3094(5, (byte) -80);
        class167.field2417.method1461(-5, 5);
        class506.field6965.method1461(-5, 5);
        class176.field2561.method1461(-5, 5);
        class401.field5380.method1461(-5, 5);
        class122.field1802.method1461(-5, 5);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBII)V")
    public static final void method1611(int arg0, byte arg1, int arg2, int arg3) {
        field3535++;
        String var4 = "tele " + arg2 + "," + (arg3 >> 6) + "," + (arg0 >> 6) + "," + (arg3 & 0x3F) + "," + (arg0 & 0x3F);
        if (arg1 != -123) {
            field3532 = null;
        }
        System.out.println(var4);
        class497.method2850(var4, 29685, true);
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method1612(int arg0) {
        field3534 = null;
        if (arg0 > -38) {
            field3534 = null;
        }
        field3532 = null;
        field3537 = null;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 != 3) {
            field3534 = null;
        }
        if (arg5 == arg7 && arg2 == arg9 && arg0 == arg3 && arg1 == arg6) {
            class347.method2009(-1, arg5, arg1, arg0, arg9, arg4);
        } else {
            int var10 = arg5;
            int var11 = arg9;
            int var12 = arg5 * 3;
            int var13 = arg9 * 3;
            int var14 = arg7 * 3;
            int var15 = arg2 * 3;
            int var16 = arg3 * 3;
            int var17 = arg6 * 3;
            int var18 = arg0 + var14 - var16 - arg5;
            int var19 = arg1 + var15 - var17 - arg9;
            int var20 = var16 - (var14 + var14 - var12);
            int var21 = var13 + var17 - (var15 - -var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg5;
                int var34 = (var28 + var32 + var30 >> 12) + arg9;
                class347.method2009(-1, var10, var34, var33, var11, arg4);
                var11 = var34;
                var10 = var33;
            }
        }
        field3536++;
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(I)V")
    public static final void method1614(int arg0) {
        field3531++;
        if (class5.field152 < 0) {
            class412.field5694 = -1;
            class5.field152 = 0;
            class250.field3323 = -1;
        }
        if (class6.field189 < class5.field152) {
            class5.field152 = class6.field189;
            class250.field3323 = -1;
            class412.field5694 = -1;
        }
        if (class391.field5300 < 0) {
            class391.field5300 = 0;
            class250.field3323 = -1;
            class412.field5694 = -1;
        }
        if (class391.field5300 > class6.field174) {
            class391.field5300 = class6.field174;
            class412.field5694 = -1;
            class250.field3323 = -1;
        }
        if (arg0 != 1604) {
            method1611(84, (byte) -81, 22, -102);
        }
    }
}
