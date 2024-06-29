import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class64 {

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Ljd;")
    public static class85 field1180 = class221.method1499("Gegenstand f-Ur Mitglieder", (byte) 108);

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Ljd;")
    private static class85 field1182 = class221.method1499("FULL", (byte) 88);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Ljd;")
    public static class85 field1176 = field1182;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "[I")
    public static int[] field1184 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field1185 = 0;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIJI)Z")
    public static final boolean method431(byte arg0, int arg1, long arg2, int arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = ((int) arg2 & 0x3EDA5B) >> 20;
        if (arg0 > -39) {
            method433((byte) 43);
        }
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        field1179++;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class199 var8 = class110.method753(var7, (byte) -49);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field3464;
                var10 = var8.field3473;
            } else {
                var9 = var8.field3473;
                var10 = var8.field3464;
            }
            int var11 = var8.field3409;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class22.method150(var11, arg1, class22.field308.field1066[0], 0, 70, 2, true, var10, var9, 0, arg3, class22.field308.field1043[0]);
        } else {
            class22.method150(0, arg1, class22.field308.field1066[0], var6, 126, 2, true, 0, 0, var5 + 1, arg3, class22.field308.field1043[0]);
        }
        class168.field2900 = class175.field3008;
        class55.field971 = 2;
        class101.field1806 = 0;
        class218.field3840 = class99.field1784;
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1176 = null;
        if (arg0 != 123080193) {
            field1184 = null;
        }
        field1182 = null;
        field1184 = null;
        field1180 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method433(byte arg0) {
        if (arg0 <= 37) {
            field1176 = null;
        }
        class131.field2289.method1270((byte) 107);
        field1178++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1177++;
        int var8 = 0;
        if (arg6 >= -84) {
            return;
        }
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg5 - arg4;
        int var12 = arg3 - arg4;
        int var13 = arg3 * arg3;
        int var14 = arg5 * arg5;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var13 << 1;
        int var18 = var16 << 1;
        int var19 = var14 << 1;
        int var20 = arg3 << 1;
        int var21 = var15 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var20) * var14 + var17;
        int var24 = var13 - ((var20 - 1) * var19);
        int var25 = (1 - var22) * var15 + var18;
        int var26 = var16 - ((var22 - 1) * var21);
        int var27 = var14 << 2;
        int var28 = var16 << 2;
        int var29 = var13 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = var18 * 3;
        int var33 = (var22 - 3) * var21;
        int var34 = (var20 - 3) * var19;
        int var35 = var29;
        int var36 = (arg3 - 1) * var27;
        int var37 = (var12 - 1) * var30;
        int var38 = var28;
        int[] var39 = class146.field2488[arg1];
        class183.method1260(arg2, arg0 - arg5, -123, var39, arg0 - var11);
        class183.method1260(arg7, arg0 - var11, -128, var39, arg0 + var11);
        class183.method1260(arg2, arg0 + var11, -115, var39, arg0 + arg5);
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var8++;
                    var35 += var29;
                    var31 += var29;
                }
            }
            boolean var40 = var12 >= var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var10++;
                        var25 += var32;
                        var32 += var28;
                        var26 += var38;
                        var38 += var28;
                    }
                }
                if (var26 < 0) {
                    var25 += var32;
                    var26 += var38;
                    var32 += var28;
                    var10++;
                    var38 += var28;
                }
                var25 += -var37;
                var37 -= var30;
                var26 += -var33;
                var33 -= var30;
            }
            var9--;
            int var41 = arg1 + var9;
            if (var24 < 0) {
                var8++;
                var23 += var31;
                var31 += var29;
                var24 += var35;
                var35 += var29;
            }
            var23 += -var36;
            var24 += -var34;
            var36 -= var27;
            var34 -= var27;
            int var42 = arg0 + var8;
            int var43 = arg1 - var9;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 - var10;
                int var46 = arg0 + var10;
                class183.method1260(arg2, var44, 23, class146.field2488[var43], var45);
                class183.method1260(arg7, var45, -125, class146.field2488[var43], var46);
                class183.method1260(arg2, var46, -115, class146.field2488[var43], var42);
                class183.method1260(arg2, var44, -121, class146.field2488[var41], var45);
                class183.method1260(arg7, var45, 14, class146.field2488[var41], var46);
                class183.method1260(arg2, var46, -104, class146.field2488[var41], var42);
            } else {
                class183.method1260(arg2, var44, -103, class146.field2488[var43], var42);
                class183.method1260(arg2, var44, -118, class146.field2488[var41], var42);
            }
        }
    }
}
