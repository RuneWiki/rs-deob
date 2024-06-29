import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class30 {

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "[I")
    public static int[] field504 = new int[50];

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "[I")
    public static int[] field503 = new int[128];

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "Lbd;")
    public static class162 field507 = class17.method142(0, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!vl", name = "i", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!vl", name = "j", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIIIBII)V", line = 8)
    public static final void method247(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field510++;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg0 - arg2;
        int var11 = arg7 - arg2;
        int var12 = arg7;
        int var13 = arg0 * arg0;
        int var14 = var10 * var10;
        int var15 = var11 * var11;
        int var16 = arg7 * arg7;
        int var17 = var13 << 1;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = arg7 << 1;
        int var21 = var15 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var20) * var13 + var18;
        int var24 = var15 - ((var22 - 1) * var19);
        if (arg5 != -89) {
            field503 = (int[]) null;
        }
        int var25 = (1 - var22) * var14 + var21;
        int var26 = var16 - ((var20 - 1) * var17);
        int var27 = var14 << 2;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = var18 * 3;
        int var31 = var15 << 2;
        int var32 = (var20 - 3) * var17;
        int var33 = var21 * 3;
        int var34 = (var22 - 3) * var19;
        int var35 = var31;
        int var36 = (arg7 - 1) * var29;
        int var37 = var28;
        int var38 = (var11 - 1) * var27;
        if (arg1 >= class303.field5106 && arg1 <= class298.field4989) {
            int[] var39 = class184.field3180[arg1];
            int var40 = class19.method172(class112.field2028, arg6 - arg0, class82.field1426, false);
            int var41 = class19.method172(class112.field2028, arg0 + arg6, class82.field1426, false);
            int var42 = class19.method172(class112.field2028, arg6 - var10, class82.field1426, false);
            int var43 = class19.method172(class112.field2028, arg6 + var10, class82.field1426, false);
            class3.method14(arg3, var40, var42, var39, -121);
            class3.method14(arg4, var42, var43, var39, -124);
            class3.method14(arg3, var43, var41, var39, arg5 ^ 0x23);
        }
        while (var12 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var26 += var37;
                    var37 += var28;
                    var23 += var30;
                    var30 += var28;
                }
            }
            boolean var44 = var11 >= var12;
            var12--;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var24 += var35;
                        var9++;
                        var25 += var33;
                        var35 += var31;
                        var33 += var31;
                    }
                }
                if (var24 < 0) {
                    var24 += var35;
                    var25 += var33;
                    var9++;
                    var35 += var31;
                    var33 += var31;
                }
                var25 += -var38;
                var24 += -var34;
                var38 -= var27;
                var34 -= var27;
            }
            if (var26 < 0) {
                var8++;
                var26 += var37;
                var23 += var30;
                var37 += var28;
                var30 += var28;
            }
            var23 += -var36;
            int var45 = arg1 + var12;
            int var46 = arg1 - var12;
            var26 += -var32;
            var32 -= var29;
            var36 -= var29;
            if (var45 >= class303.field5106 && class298.field4989 >= var46) {
                int var47 = class19.method172(class112.field2028, arg6 + var8, class82.field1426, false);
                int var48 = class19.method172(class112.field2028, arg6 - var8, class82.field1426, false);
                if (var44) {
                    int var49 = class19.method172(class112.field2028, arg6 + var9, class82.field1426, false);
                    int var50 = class19.method172(class112.field2028, arg6 - var9, class82.field1426, false);
                    if (var46 >= class303.field5106) {
                        int[] var51 = class184.field3180[var46];
                        class3.method14(arg3, var48, var50, var51, -100);
                        class3.method14(arg4, var50, var49, var51, -115);
                        class3.method14(arg3, var49, var47, var51, -116);
                    }
                    if (class298.field4989 >= var45) {
                        int[] var52 = class184.field3180[var45];
                        class3.method14(arg3, var48, var50, var52, arg5 - 21);
                        class3.method14(arg4, var50, var49, var52, -123);
                        class3.method14(arg3, var49, var47, var52, -103);
                    }
                } else {
                    if (class303.field5106 <= var46) {
                        class3.method14(arg3, var48, var47, class184.field3180[var46], -121);
                    }
                    if (class298.field4989 >= var45) {
                        class3.method14(arg3, var48, var47, class184.field3180[var45], -128);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(III)V", line = 212)
    public static final void method248(int arg0, int arg1, int arg2) {
        field505++;
        if (class12.method104(arg2, 571329488)) {
            class239.method1685(arg0, class95.field1739[arg2], -1);
            if (arg1 <= 20) {
                method248(-67, -96, -58);
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Lpm;", line = 247)
    public static final class99 method249(byte arg0) {
        if (arg0 != 75) {
            method247(-80, 85, -88, -95, 109, (byte) 119, 49, -118);
        }
        field511++;
        class99 var1 = new class99(class238.field3962, class277.field4637, class127.field2312[0], class40.field646[0], class190.field3253[0], class260.field4333[0], class317.field5350[0], class306.field5152);
        class247.method1738(-123);
        return var1;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBIIIII)V", line = 261)
    public static final void method250(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field509++;
        if (class112.field2028 <= arg6 && class82.field1426 >= arg4 && class303.field5106 <= arg5 && arg2 <= class298.field4989) {
            if (arg0 == 1) {
                class42.method311(arg2, (byte) -39, arg4, arg3, arg5, arg6);
            } else {
                class275.method1866(arg2, false, arg0, arg3, arg6, arg4, arg5);
            }
        } else if (arg0 == 1) {
            class204.method1515(arg4, true, arg5, arg2, arg6, arg3);
        } else {
            class116.method917(arg6, arg3, arg4, arg2, arg5, (byte) -54, arg0);
        }
        if (arg1 != 70) {
            field503 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZB)V", line = 297)
    public static final void method251(boolean arg0, byte arg1) {
        field508++;
        for (class64 var2 = (class64) class149.field2678.method169(-127); var2 != null; var2 = (class64) class149.field2678.method165((byte) -101)) {
            if (var2.field1003 != null) {
                class313.field5290.method449(var2.field1003);
                var2.field1003 = null;
            }
            if (var2.field1016 != null) {
                class313.field5290.method449(var2.field1016);
                var2.field1016 = null;
            }
            var2.method1183(false);
        }
        if (arg0) {
            for (class64 var3 = (class64) client.field1884.method169(3); var3 != null; var3 = (class64) client.field1884.method165((byte) -101)) {
                if (var3.field1003 != null) {
                    class313.field5290.method449(var3.field1003);
                    var3.field1003 = null;
                }
                var3.method1183(false);
            }
            for (class64 var4 = (class64) class51.field811.method1666((byte) 55); var4 != null; var4 = (class64) class51.field811.method1673((byte) 46)) {
                if (var4.field1003 != null) {
                    class313.field5290.method449(var4.field1003);
                    var4.field1003 = null;
                }
                var4.method1183(false);
            }
        }
        if (arg1 >= -16) {
            method247(-94, -38, 11, -104, -119, (byte) -16, 69, 8);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V", line = 364)
    public static void method252(int arg0) {
        field507 = null;
        field503 = null;
        field504 = null;
        int var1 = -72 / ((-arg0 - 25) / 61);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V", line = 387)
    public static final void method253(int arg0, int arg1) {
        class278.field4680 = new int[arg1];
        class70.field1123 = new int[arg1];
        field502++;
        class25.field414 = new int[arg1];
        class315.field5324 = new int[arg1];
        if (arg0 <= -71) {
            class296.field4954 = new int[arg1];
        }
    }
}
