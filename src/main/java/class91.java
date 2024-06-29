import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class91 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lfr;")
    private class231 field1512 = new class231(64);

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "Lfr;")
    private class231 field1520 = new class231(100);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Lqs;")
    private class496 field1511;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "Lpu;")
    public static class411 field1508 = new class411();

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1518 = "";

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "Lst;")
    public static class473 field1515;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
    public final void method632(int arg0, int arg1) {
        class231 var3 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method1603((byte) -116, arg0);
            if (arg1 != 13072) {
                this.method636(-104);
            }
        }
        field1516++;
        class231 var4 = this.field1520;
        synchronized (this.field1520) {
            this.field1520.method1603((byte) -118, arg0);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZIZ)V")
    public static final void method633(int arg0, boolean arg1, int arg2, boolean arg3) {
        field1514++;
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class396.field6052 = arg0;
        if (arg1) {
            field1508 = null;
        }
        class12.field141 = arg2;
        class175.field2777 = arg3;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)Lsq;")
    public final class145 method634(int arg0, int arg1) {
        field1510++;
        class231 var3 = this.field1512;
        class145 var4;
        synchronized (this.field1512) {
            var4 = (class145) this.field1512.method1593((byte) 106, (long) arg1);
        }
        if (arg0 != -1271654143) {
            method633(-30, true, 116, true);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field1511;
        byte[] var6;
        synchronized (this.field1511) {
            var6 = this.field1511.method2926(class270.method1800(-7085, arg1), arg0 + 1271654086, class63.method417(arg1, -128));
        }
        class145 var7 = new class145();
        var7.field2373 = this;
        var7.field2361 = arg1;
        if (var6 != null) {
            var7.method1054(2, new class23(var6));
        }
        var7.method1055((byte) 121);
        class231 var8 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method1595(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public final void method635(byte arg0) {
        field1509++;
        class231 var2 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method1604(4);
        }
        if (arg0 != -1) {
            this.field1512 = null;
        }
        class231 var3 = this.field1520;
        synchronized (this.field1520) {
            this.field1520.method1604(4);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method636(int arg0) {
        field1507++;
        class231 var2 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method1598(-88);
        }
        class231 var3 = this.field1520;
        synchronized (this.field1520) {
            if (arg0 < -73) {
                this.field1520.method1598(-47);
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)Ldl;")
    public final class48 method637(int arg0, boolean arg1) {
        field1519++;
        if (arg1) {
            field1508 = null;
        }
        class231 var3 = this.field1520;
        class48 var4;
        synchronized (this.field1520) {
            var4 = (class48) this.field1520.method1593((byte) -115, (long) arg0);
            if (var4 == null) {
                var4 = new class48(arg0);
                this.field1520.method1595(var4, (long) arg0, (byte) 31);
            }
        }
        synchronized (var4) {
            return var4.method342(13) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIIILe;Lsq;Lza;II)Le;")
    public static final class530 method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class530 arg10, class145 arg11, class491 arg12, int arg13, int arg14) {
        if (arg6 != -3530) {
            method633(79, false, -28, false);
        }
        field1513++;
        if (arg10 == null) {
            return null;
        }
        int var15 = 2055;
        if (arg11 != null) {
            int var16 = var15 | arg11.method1053(arg6 + 4554, false, -1, arg9);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = (long) (arg4 - (-(arg1 << 16) - (arg3 << 24))) + ((long) arg14 << 32) + ((long) arg0 << 48);
        class231 var19 = class302.field4836;
        class530 var20;
        synchronized (class302.field4836) {
            var20 = (class530) class302.field4836.method1593((byte) 121, var17);
        }
        if (var20 == null || arg12.method902(var20.method741(), var15) != 0) {
            if (var20 != null) {
                var15 = arg12.method878(var15, var20.method741());
            }
            byte var21;
            if (arg4 == 1) {
                var21 = 9;
            } else if (arg4 == 2) {
                var21 = 12;
            } else if (arg4 == 3) {
                var21 = 15;
            } else if (arg4 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class227 var24 = new class227(var21 * var22 + 1, var21 * var22 * 2 - var21, 0);
            int var25 = var24.method1573(0, 29, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class46.field757[var31] * var28 >> 15;
                    int var33 = class46.field755[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1573(var32, 49, var33, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg1 * var36 + arg3 * var35 >> 8);
                short var38 = (short) (((arg0 & 0x7F) * var35 + (arg14 & 0x7F) * var36 & 0x7F00) + ((arg0 & 0x380) * var35 + (arg14 & 0x380) * var36 & 0x38000) + ((arg0 & 0xFC00) * var35 + (arg14 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1577((byte) 79, (byte) 1, (short) -1, var25, var38, (byte) -1, var26[0][(var39 + 1) % var21], var26[0][var39], var37);
                    } else {
                        var24.method1577((byte) 122, (byte) 1, (short) -1, var26[var34 - 1][var39], var38, (byte) -1, var26[var34 - 1][(var39 + 1) % var21], var26[var34][(var39 + 1) % var21], var37);
                        var24.method1577((byte) 122, (byte) 1, (short) -1, var26[var34 - 1][var39], var38, (byte) -1, var26[var34][(var39 + 1) % var21], var26[var34][var39], var37);
                    }
                }
            }
            var20 = arg12.method875(var24, var15, class241.field4156, 64, 768);
            class231 var40 = class302.field4836;
            synchronized (class302.field4836) {
                class302.field4836.method1595(var20, var17, (byte) 67);
            }
        }
        int var41 = (arg4 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg5 != 0) {
            if ((arg5 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg5 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg5 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg5 & 0x2) != 0) {
                var43 -= 128;
            }
        }
        int var46 = arg10.method760();
        int var47 = arg10.method766();
        int var48 = arg10.method751();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        int var49 = arg10.method735();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var49 > var45) {
            var49 = var45;
        }
        class48 var50 = null;
        if (arg11 != null) {
            int var51 = arg11.field2377[arg9];
            var50 = class130.field2232.method637(var51 >> 16, false);
            arg9 = var51 & 0xFFFF;
        }
        class530 var52;
        if (var50 == null) {
            var52 = var20.method739((byte) 3, var15, true);
            var52.method768(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method773(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method739((byte) 3, var15, true);
            var52.method768(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method773(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method3139(true, arg9, var50);
        }
        if (arg8 != 0) {
            var52.method734(arg8);
        }
        if (arg7 != 0) {
            var52.method761(arg7);
        }
        if (arg13 != 0) {
            var52.method773(0, arg13, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
    public static void method639(int arg0) {
        field1508 = null;
        if (arg0 != -1316275602) {
            method638(-48, -42, 96, 60, -75, -61, 24, -74, -121, 81, null, null, null, 99, -128);
        }
        field1515 = null;
        field1518 = null;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Lwv;ILqs;Lqs;Lqs;)V")
    public class91(class535 arg0, int arg1, class496 arg2, class496 arg3, class496 arg4) {
        this.field1511 = arg2;
        if (this.field1511 != null) {
            int var6 = this.field1511.method2919((byte) 123) - 1;
            this.field1511.method2940(var6, -10511);
        }
        class13.method68(-1, arg3, arg4);
    }
}
