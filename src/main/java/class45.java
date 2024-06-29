import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class45 {

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Lgk;")
    public static class259 field538 = new class259();

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/lang/String;ZI)V")
    public static final void method284(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
        field535++;
        class82 var5 = class112.method694(arg1, !arg3, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field1109 != null) {
            class11 var6 = new class11();
            var6.field150 = arg2;
            var6.field145 = var5;
            var6.field146 = arg4;
            var6.field143 = var5.field1109;
            class110.method684(var6, false);
        }
        boolean var7 = arg3;
        if (var5.field1136 > 0) {
            var7 = class169.method1110(var5, -2976);
        }
        if (!var7 || !client.method1920(var5).method1157(!arg3, arg4 - 1)) {
            return;
        }
        if (arg4 == 1) {
            class46.field544++;
            class94.field1259.method592(149, false);
            class94.field1259.method1410(arg0, (byte) -30);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 2) {
            class94.field1259.method592(66, false);
            class94.field1259.method1410(arg0, (byte) 31);
            class94.field1259.method1387(arg1, 4);
            class260.field3783++;
        }
        if (arg4 == 3) {
            class94.field1259.method592(81, !arg3);
            class27.field320++;
            class94.field1259.method1410(arg0, (byte) 68);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 4) {
            class94.field1259.method592(232, !arg3);
            class66.field777++;
            class94.field1259.method1410(arg0, (byte) -126);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 5) {
            class94.field1259.method592(38, false);
            class289.field4499++;
            class94.field1259.method1410(arg0, (byte) 12);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 6) {
            class252.field3654++;
            class94.field1259.method592(121, false);
            class94.field1259.method1410(arg0, (byte) -126);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 7) {
            class5.field69++;
            class94.field1259.method592(63, false);
            class94.field1259.method1410(arg0, (byte) -29);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 8) {
            class51.field586++;
            class94.field1259.method592(36, false);
            class94.field1259.method1410(arg0, (byte) 42);
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 9) {
            class94.field1259.method592(57, false);
            class94.field1259.method1410(arg0, (byte) -23);
            class173.field2475++;
            class94.field1259.method1387(arg1, 4);
        }
        if (arg4 == 10) {
            class63.field739++;
            class94.field1259.method592(74, false);
            class94.field1259.method1410(arg0, (byte) -125);
            class94.field1259.method1387(arg1, 4);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 < 2) {
            field539 = -125;
        }
        if (arg5 == arg8 && arg7 == arg9 && arg3 == arg6 && arg0 == arg2) {
            class71.method438(arg0, arg7, (byte) 79, arg1, arg8, arg3);
        } else {
            int var10 = arg7;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg7 * 3;
            int var14 = arg5 * 3;
            int var15 = arg9 * 3;
            int var16 = arg6 * 3;
            int var17 = arg2 * 3;
            int var18 = var14 + arg3 - arg8 - var16;
            int var19 = arg0 + var15 - var17 - arg7;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var18 * var26;
                int var29 = var21 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = (var28 + var31 + var30 >> 12) + arg8;
                int var33 = var23 * var24;
                int var34 = (var27 + var29 + var33 >> 12) + arg7;
                class71.method438(var34, var10, (byte) 79, arg1, var11, var32);
                var11 = var32;
                var10 = var34;
            }
        }
        field534++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method286(int arg0, byte[] arg1) {
        field536++;
        int var2 = arg1.length;
        if (arg0 > -55) {
            method287(-25, (byte) 39, 78, -38, 22);
        }
        byte[] var3 = new byte[var2];
        class194.method1260(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IBIII)V")
    public static final void method287(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 > -52) {
            return;
        }
        if (class177.field2514 <= arg0 && arg0 <= class279.field4238) {
            int var5 = class22.method134(class286.field4431, 14949, arg3, class230.field3302);
            int var6 = class22.method134(class286.field4431, 14949, arg2, class230.field3302);
            class164.method1077((byte) 72, arg4, var5, var6, arg0);
        }
        field537++;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static final void method288(int arg0) {
        class246.field3578.method1898(106);
        field532++;
        field538.method1661(false);
        class189.field2713.method1661(false);
        int var1 = 124 % ((8 - arg0) / 45);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public static void method289(int arg0) {
        if (arg0 == 3) {
            field538 = null;
        }
    }
}
