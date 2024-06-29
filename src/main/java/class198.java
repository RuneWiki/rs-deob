import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class198 extends InputStream {

    @OriginalMember(owner = "client!h", name = "h", descriptor = "Lha;")
    public static class46 field3549 = class271.method1828(" loggt sich ein)3", -46);

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lha;")
    public static class46 field3548 = class271.method1828("::", -46);

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lha;")
    public static class46 field3556 = class271.method1828("<col=00ffff>", -46);

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lha;")
    public static class46 field3558 = class271.method1828("rect_debug=", -46);

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[Lue;")
    public static class197[] field3544;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[Lha;")
    public static class46[] field3555;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[[[Lmk;")
    public static class201[][][] field3543;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
    public static final void method1410(int arg0, int arg1) {
        if (arg1 != 1152) {
            method1412((byte[]) null, false, 125);
        }
        field3553++;
        class215.field3815.method81((byte) 30, arg0);
        class17.field250.method81((byte) 30, arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method1411(byte arg0) {
        if (class114.field2157 != -1) {
            class181.method1296(class114.field2157, -1);
        }
        if (arg0 >= -35) {
            field3545 = -59;
        }
        field3554++;
        for (int var1 = 0; var1 < class193.field3473; var1++) {
            if (class31.field592[var1]) {
                class52.field905[var1] = true;
            }
            class119.field2243[var1] = class31.field592[var1];
            class31.field592[var1] = false;
        }
        class145.field2627 = -1;
        class205.field3680 = -1;
        class169.field3015 = null;
        class206.field3695 = class157.field2803;
        if (class114.field2157 != -1) {
            class193.field3473 = 0;
            class134.method1031(false, 0, class114.field2157, 0, 0, 0, -1, class163.field2895, class50.field876);
        }
        class262.method1757();
        class237.field4202 = 0;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method1412(byte[] arg0, boolean arg1, int arg2) {
        field3546++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 != -32768) {
            method1417(63, -90, 64, 21, (class139) null, 27L, (class139) null, (class139) null);
        }
        if (arg0.length > 136 && !class56.field942) {
            try {
                class250 var3 = (class250) Class.forName("m").getDeclaredConstructor().newInstance();
                var3.method276(arg0, (byte) -102);
                return var3;
            } catch (Throwable var4) {
                class56.field942 = true;
            }
        }
        return arg1 ? class16.method82(62, arg0) : arg0;
    }

    @OriginalMember(owner = "client!h", name = "read", descriptor = "()I")
    public final int read() {
        field3551++;
        class187.method1360((byte) -91, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILme;IILwk;IIIZIIII)Lme;")
    public static final class36 method1413(byte arg0, int arg1, class36 arg2, int arg3, int arg4, class170 arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field3547++;
        long var14 = ((long) arg11 << 32) + ((long) arg6 << 48) + (long) ((arg3 << 24) + (arg12 << 16) + arg1);
        class36 var16 = (class36) class236.field4171.method86(7961, var14);
        if (var16 == null) {
            byte var17;
            if (arg1 == 1) {
                var17 = 9;
            } else if (arg1 == 2) {
                var17 = 12;
            } else if (arg1 == 3) {
                var17 = 15;
            } else if (arg1 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class67 var20 = new class67(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method460(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = class62.field1049[var33] * var31 + arg8 >> 16;
                    int var35 = class62.field1042[var33] * var30 + arg4 >> 16;
                    var21[var23][var32] = var20.method460(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg6 & 0x380) * var25 + (arg11 & 0x380) * var26 & 0x38000) + ((arg6 & 0x7F) * var25 + (arg11 & 0x7F) * var26 & 0x7F00) + ((arg6 & 0xFC00) * var25 + (arg11 & 0xFC00) * var26 & 0xFC0000) >> 8);
                byte var28 = (byte) (arg3 * var25 + arg12 * var26 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method469(var22, var21[0][(var29 + 1) % var17], var21[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method469(var21[var24 - 1][var29], var21[var24 - 1][(var29 + 1) % var17], var21[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method469(var21[var24 - 1][var29], var21[var24][(var29 + 1) % var17], var21[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method490(64, 768, -50, -10, -50);
            class236.field4171.method80(var16, var14, (byte) 67);
        }
        int var36 = arg1 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = -61 / ((arg0 + 27) / 49);
        int var41 = var36;
        int var42 = arg2.method230();
        if (arg9) {
            if (arg10 > 1664 || arg10 < 384) {
                var38 -= 128;
            }
            if (arg10 > 640 && arg10 < 1408) {
                var41 = var36 + 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var39 = var36 + 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var37 -= 128;
            }
        }
        if (var42 < var37) {
            var42 = var37;
        }
        int var43 = arg2.method228();
        if (var39 < var43) {
            var43 = var39;
        }
        int var44 = arg2.method225();
        if (var38 > var44) {
            var44 = var38;
        }
        class77 var45 = null;
        int var46 = arg2.method232();
        if (arg5 != null) {
            int var47 = arg5.field3020[arg13];
            var45 = class155.method1143(8, var47 >> 16);
            arg13 = var47 & 0xFFFF;
        }
        if (var41 < var46) {
            var46 = var41;
        }
        class36 var48;
        if (var45 == null) {
            var48 = var16.method238(true, true);
            var48.method235((var43 - var42) / 2, 128, (var46 - var44) / 2);
            var48.method241((var42 + var43) / 2, 0, (var44 + var46) / 2);
        } else {
            var48 = var16.method238(!var45.method614(arg13, 126), true);
            var48.method235((var43 - var42) / 2, 128, (var46 - var44) / 2);
            var48.method241((var42 + var43) / 2, 0, (var44 + var46) / 2);
            var48.method239(var45, arg13);
        }
        if (arg10 != 0) {
            var48.method223(arg10);
        }
        class192 var49 = (class192) var48;
        if (arg7 != class206.method1461(arg8 + var44, class135.field2450, arg4 + var42, 4) || class206.method1461(arg8 + var46, class135.field2450, arg4 + var43, 4) != arg7) {
            for (int var50 = 0; var50 < var49.field3395; var50++) {
                var49.field3420[var50] += class206.method1461(var49.field3411[var50] + arg8, class135.field2450, var49.field3423[var50] + arg4, 4) - arg7;
            }
            var49.field3422 = false;
        }
        return var48;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static final void method1414(int arg0) {
        class234.field4068++;
        if (arg0 <= 16) {
            field3543 = null;
        }
        field3552++;
        class58.field967.method285((byte) -90, 40);
        for (class31 var1 = (class31) class93.field1727.method1592(false); var1 != null; var1 = (class31) class93.field1727.method1591(89)) {
            if (var1.field591 == 0) {
                class175.method1262(true, var1, 24);
            }
        }
        if (class1.field13 != null) {
            class226.method1549(false, class1.field13);
            class1.field13 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BLha;)Lbd;")
    public static final class74 method1415(byte arg0, class46 arg1) {
        field3550++;
        for (class74 var2 = (class74) class73.field1301.method264(-127); var2 != null; var2 = (class74) class73.field1301.method269((byte) 7)) {
            if (var2.field1325.method340((byte) 122, arg1)) {
                return var2;
            }
        }
        return arg0 > -75 ? null : null;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static void method1416(int arg0) {
        field3558 = null;
        field3548 = null;
        field3549 = null;
        field3556 = null;
        field3543 = null;
        field3555 = null;
        field3544 = null;
        if (arg0 != -14225) {
            field3558 = null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIILj;JLj;Lj;)V")
    public static final void method1417(int arg0, int arg1, int arg2, int arg3, class139 arg4, long arg5, class139 arg6, class139 arg7) {
        class52 var9 = new class52();
        var9.field903 = arg4;
        var9.field907 = arg1 * 128 + 64;
        var9.field911 = arg2 * 128 + 64;
        var9.field899 = arg3;
        var9.field910 = arg5;
        var9.field904 = arg6;
        var9.field902 = arg7;
        int var10 = 0;
        class201 var11 = class111.field2080[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3585; var12++) {
                class197 var13 = var11.field3600[var12];
                if ((var13.field3523 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3532.method183();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field900 = -var10;
        if (class111.field2080[arg0][arg1][arg2] == null) {
            class111.field2080[arg0][arg1][arg2] = new class201(arg0, arg1, arg2);
        }
        class111.field2080[arg0][arg1][arg2].field3598 = var9;
    }
}
