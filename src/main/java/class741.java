import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class741 {

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "Lju;")
    public static class102 field10325 = new class102(13, 2);

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "[[I")
    public static int[][] field10328 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    public static int field10327;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public static int field10330;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "Lor;")
    public static class325 field10329;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method4128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10327++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg6 - arg0;
        int var12 = arg2 - arg0;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        if (arg3 != 2) {
            method4131(false);
        }
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class591.field8480[arg1];
        class721.method4044(var39, arg7 - arg6, (byte) -126, arg7 - var11, arg5);
        class721.method4044(var39, arg7 - var11, (byte) -127, arg7 + var11, arg4);
        class721.method4044(var39, arg7 + var11, (byte) -124, arg6 + arg7, arg5);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var8++;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var10++;
                    var37 += var30;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var9--;
            var32 -= var27;
            int var41 = arg1 - var9;
            int var42 = arg1 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class721.method4044(class591.field8480[var41], var44, (byte) -123, var46, arg5);
                class721.method4044(class591.field8480[var41], var46, (byte) -126, var45, arg4);
                class721.method4044(class591.field8480[var41], var45, (byte) -122, var43, arg5);
                class721.method4044(class591.field8480[var42], var44, (byte) -123, var46, arg5);
                class721.method4044(class591.field8480[var42], var46, (byte) -121, var45, arg4);
                class721.method4044(class591.field8480[var42], var45, (byte) -128, var43, arg5);
            } else {
                class721.method4044(class591.field8480[var41], var44, (byte) -127, var43, arg5);
                class721.method4044(class591.field8480[var42], var44, (byte) -125, var43, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)Lum;", line = 179)
    public static final class130 method4129(byte arg0) {
        field10326++;
        try {
            return new class113();
        } catch (Throwable var2) {
            try {
                return (class130) Class.forName("rk").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 != 89) {
                    method4129((byte) 127);
                }
                return new class685();
            }
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIB)V", line = 204)
    public static final void method4130(int arg0, int arg1, byte arg2) {
        field10324++;
        class118 var3 = class126.method814(true, arg1, 16);
        if (arg2 == 34) {
            var3.method771(-30559);
            var3.field1636 = arg0;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V", line = 218)
    public static void method4131(boolean arg0) {
        if (arg0) {
            field10329 = null;
        }
        field10325 = null;
        field10329 = null;
        field10328 = null;
    }
}
