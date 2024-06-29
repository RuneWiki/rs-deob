import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class105 extends class228 {

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "Loa;")
    public static class99 field1759 = class221.method1463(2844, "null");

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    public static int field1761 = 0;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "Loa;")
    public static class99 field1762 = class221.method1463(2844, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field1760 = -1;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "Z")
    public static boolean field1763 = false;

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "[I")
    public static int[] field1765 = new int[2048];

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 == -7618) {
            if (~arg0 == -1) {
                super.field3943 = ~arg1.method1693((byte) 26) == -2;
            }
            ++field1764;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field1757;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (super.field3952.field3276) {
            int[] var4 = this.method1500(arg0, 0, (byte) 106);
            for (int var5 = 0; ~class234.field4046 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg1 != -3) {
            method724(-89, -126, -111, 125, -28, 90, -125, -38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field1755;
        if (arg0 != -27) {
            this.method106(-8, 2);
        }
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class234.field4046; ++var11) {
                var10[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var8[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BLpg;)V")
    public static final void method723(byte arg0, class75 arg1) {
        if (class56.field926 == arg1.field1334 || arg1.field1284 == -1 || ~arg1.field1297 != -1 || arg1.field1303 - -1 > class38.method297(132, arg1.field1284).field4749[arg1.field1321]) {
            int var2 = -arg1.field1314 + arg1.field1334;
            int var3 = -arg1.field1314 + class56.field926;
            int var4 = arg1.field1289 * 128 - -(arg1.method516((byte) -65) * 64);
            int var5 = arg1.field1332 * 128 + arg1.method516((byte) -65) * 64;
            int var6 = arg1.field1261 * 128 - -(arg1.method516((byte) -65) * 64);
            int var7 = arg1.field1293 * 128 + arg1.method516((byte) -65) * 64;
            arg1.field1325 = ((-var3 + var2) * var4 + var3 * var6) / var2;
            arg1.field1301 = ((-var3 + var2) * var5 + var3 * var7) / var2;
        }
        int var8 = -123 / ((arg0 - -34) / 58);
        ++field1756;
        if (~arg1.field1310 == -1) {
            arg1.field1275 = 1024;
        }
        arg1.field1311 = 0;
        if (arg1.field1310 == 1) {
            arg1.field1275 = 1536;
        }
        if (arg1.field1310 == 2) {
            arg1.field1275 = 0;
        }
        if (~arg1.field1310 == -4) {
            arg1.field1275 = 512;
        }
        arg1.field1296 = arg1.field1275;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method724(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 >= 0 && arg3 >= 0 && ~arg5 > -104 && arg3 < 103) {
            if (~arg7 == -1) {
                class167 var8 = class280.method1845(arg4, arg5, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field2984 >>> 32);
                    if (arg0 != 2) {
                        var8.field2988 = new class111(var9, arg0, arg2, arg4, arg5, arg3, arg6, false, var8.field2988);
                    } else {
                        var8.field2988 = new class111(var9, 2, arg2 + 4, arg4, arg5, arg3, arg6, false, var8.field2988);
                        var8.field2989 = new class111(var9, 2, 3 & arg2 + 1, arg4, arg5, arg3, arg6, false, var8.field2989);
                    }
                }
            }
            if (arg7 == 1) {
                class62 var10 = class179.method1198(arg4, arg5, arg3);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field1034 >>> 32);
                    if (~arg0 != -5 && arg0 != 5) {
                        if (~arg0 == -7) {
                            var10.field1032 = new class111(var11, 4, arg2 - -4, arg4, arg5, arg3, arg6, false, var10.field1032);
                        } else if (arg0 != 7) {
                            if (arg0 == 8) {
                                var10.field1032 = new class111(var11, 4, arg2 + 4, arg4, arg5, arg3, arg6, false, var10.field1032);
                                var10.field1029 = new class111(var11, 4, (arg2 + 2 & 3) + 4, arg4, arg5, arg3, arg6, false, var10.field1029);
                            }
                        } else {
                            var10.field1032 = new class111(var11, 4, (3 & arg2 + 2) + 4, arg4, arg5, arg3, arg6, false, var10.field1032);
                        }
                    } else {
                        var10.field1032 = new class111(var11, 4, arg2, arg4, arg5, arg3, arg6, false, var10.field1032);
                    }
                }
            }
            if (~arg7 == -3) {
                if (~arg0 == -12) {
                    arg0 = 10;
                }
                class77 var12 = class2.method11(arg4, arg5, arg3);
                if (var12 != null) {
                    var12.field1367 = new class111((int) (var12.field1372 >>> 32) & Integer.MAX_VALUE, arg0, arg2, arg4, arg5, arg3, arg6, false, var12.field1367);
                }
            }
            if (arg7 == 3) {
                class278 var13 = class168.method1138(arg4, arg5, arg3);
                if (var13 != null) {
                    var13.field4891 = new class111((int) (var13.field4889 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg4, arg5, arg3, arg6, false, var13.field4891);
                }
            }
        }
        if (arg1 < -26) {
            ++field1758;
        }
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(B)V")
    public static void method725(byte arg0) {
        field1759 = null;
        field1762 = null;
        field1765 = null;
        if (arg0 >= -95) {
            field1759 = null;
        }
    }
}
