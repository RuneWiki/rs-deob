import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class189 {

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Lql;")
    private class346 field2548 = new class346();

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "I")
    private int field2540;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    private int field2545;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lvk;")
    private class56 field2541;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "[I")
    public static int[] field2539 = new int[5];

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method1134(boolean arg0) {
        field2543++;
        class380 var2 = (class380) this.field2541.method389(0);
        while (var2 != null) {
            Object var3 = var2.method367(21800);
            if (var3 != null) {
                return var3;
            }
            class380 var4 = var2;
            var2 = (class380) this.field2541.method388(0);
            var4.method322(11);
            var4.method1302(true);
            this.field2540++;
        }
        if (arg0) {
            this.field2540 = 56;
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
    public final int method1135(byte arg0) {
        field2550++;
        int var2 = 44 / ((arg0 + 9) / 33);
        return this.field2540;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public final void method1136(byte arg0) {
        if (arg0 >= -64) {
            this.field2548 = null;
        }
        for (class380 var2 = (class380) this.field2548.method2250(1580); var2 != null; var2 = (class380) this.field2548.method2244(0)) {
            if (var2.method368(22)) {
                var2.method322(11);
                var2.method1302(true);
                this.field2540++;
            }
        }
        field2546++;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(JI)Ljava/lang/Object;")
    public final Object method1137(long arg0, int arg1) {
        field2534++;
        class380 var4 = (class380) this.field2541.method384(arg0, true);
        if (arg1 != 2108653711) {
            return null;
        } else if (var4 == null) {
            return null;
        } else {
            Object var5 = var4.method367(arg1 - 2108631911);
            if (var5 == null) {
                var4.method322(arg1 - 2108653700);
                var4.method1302(true);
                this.field2540++;
                return null;
            }
            if (var4.method368(22)) {
                class86 var6 = new class86(var5);
                this.field2541.method381(true, var6, var4.field640);
                this.field2548.method2245(var6, (byte) -123);
                var6.field2962 = 0L;
                var4.method322(11);
                var4.method1302(true);
            } else {
                this.field2548.method2245(var4, (byte) -76);
                var4.field2962 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IJ)V")
    private final void method1138(int arg0, long arg1) {
        field2535++;
        class380 var4 = (class380) this.field2541.method384(arg1, true);
        if (var4 != null) {
            var4.method322(11);
            var4.method1302(true);
            this.field2540++;
        }
        if (arg0 > -105) {
            this.method1136((byte) 71);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I")
    public final int method1139(int arg0) {
        field2551++;
        if (arg0 != 2) {
            method1146(83, true, 54, -111);
        }
        return this.field2545;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)V")
    public static void method1140(byte arg0) {
        if (arg0 != 104) {
            field2547 = -9;
        }
        field2539 = null;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)V")
    public final void method1141(int arg0) {
        field2544++;
        if (arg0 == 256) {
            this.field2548.method2251(6);
            this.field2541.method391(40);
            this.field2540 = this.field2545;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V")
    public final void method1142(byte arg0, int arg1) {
        field2549++;
        if (class252.field3452 != null) {
            for (class380 var3 = (class380) this.field2548.method2250(1580); var3 != null; var3 = (class380) this.field2548.method2244(0)) {
                if (var3.method368(22)) {
                    if (var3.method367(21800) == null) {
                        var3.method322(11);
                        var3.method1302(true);
                        this.field2540++;
                    }
                } else if ((++var3.field2962) > ((long) arg1)) {
                    class380 var4 = class252.field3452.method1452(var3, -1);
                    this.field2541.method381(true, var4, var3.field640);
                    class404.method2606(var4, var3, 12111);
                    var3.method322(11);
                    var3.method1302(true);
                }
            }
        }
        if (arg0 >= -48) {
            field2547 = -88;
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(Z)I")
    public final int method1143(boolean arg0) {
        field2536++;
        int var2 = 0;
        for (class380 var3 = (class380) this.field2548.method2250(1580); var3 != null; var3 = (class380) this.field2548.method2244(0)) {
            if (!var3.method368(22)) {
                var2++;
            }
        }
        if (!arg0) {
            this.field2545 = -118;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method1144(long arg0, Object arg1, int arg2) {
        field2533++;
        this.method1138(-114, arg0);
        if (this.field2540 == 0) {
            class380 var5 = (class380) this.field2548.method2246((byte) -115);
            var5.method322(11);
            var5.method1302(true);
        } else {
            this.field2540--;
        }
        if (arg2 == -3480) {
            class86 var6 = new class86(arg1);
            this.field2541.method381(true, var6, arg0);
            this.field2548.method2245(var6, (byte) -91);
            var6.field2962 = 0L;
        }
    }

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1145(byte arg0) {
        field2537++;
        class380 var2 = (class380) this.field2541.method388(0);
        if (arg0 != 104) {
            this.field2541 = null;
        }
        while (var2 != null) {
            Object var3 = var2.method367(21800);
            if (var3 != null) {
                return var3;
            }
            class380 var4 = var2;
            var2 = (class380) this.field2541.method388(0);
            var4.method322(11);
            var4.method1302(true);
            this.field2540++;
        }
        return null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZII)V")
    public static final void method1146(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1147(-74, (class394) null, (byte) -10, -28, -121, (class2) null, -71, 1, (class405) null);
        }
        field2538++;
        class263 var4 = class47.method337(9, 0, arg2);
        var4.method1807((byte) -124);
        var4.field3820 = arg3;
        var4.field3813 = arg0;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(I)V")
    public class189(int arg0) {
        this.field2540 = arg0;
        this.field2545 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2541 = new class56(var2);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILps;BIILud;IILii;)V")
    public static final void method1147(int arg0, class394 arg1, byte arg2, int arg3, int arg4, class2 arg5, int arg6, int arg7, class405 arg8) {
        field2542++;
        class7 var9 = class99.method674(36, arg6);
        if (arg2 != 39) {
            method1147(67, (class394) null, (byte) -78, -46, -3, (class2) null, 32, -18, (class405) null);
        }
        if (var9 == null || !var9.field109 || !var9.method50(arg2 ^ 0xFFFF9256)) {
            return;
        }
        if (var9.field130 != null) {
            int[] var10 = new int[var9.field130.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class346.field4979 == 4) {
                    var13 = (int) class396.field5847 & 0x3FFF;
                } else {
                    var13 = (int) class396.field5847 + class399.field5948 & 0x3FFF;
                }
                int var14 = class117.field1644[var13];
                int var15 = class117.field1636[var13];
                if (class346.field4979 != 4) {
                    var14 = var14 * 256 / (class364.field5261 + 256);
                    var15 = var15 * 256 / (class364.field5261 + 256);
                }
                var10[var11 * 2] = arg1.field5773 / 2 + (arg3 + ((var9.field130[var11 * 2 + 1] * 4 + arg0) * var14 + ((var9.field130[var11 * 2] * 4 + arg7) * var15) >> 15));
                var10[var11 * 2 + 1] = arg4 + (arg1.field5672 / 2) - ((var9.field130[var11 * 2 + 1] * 4 + arg0) * var15 - ((var9.field130[var11 * 2] * 4 + arg7) * var14) >> 15);
            }
            class170.method1052(arg8, var10, var9.field128, arg1.field5708, arg1.field5679);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg8.method1776(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[var12 * 2 + 2 + 1], var9.field115, 1, arg5, arg3, arg4);
            }
            arg8.method1776(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field115, 1, arg5, arg3, arg4);
        }
        class67 var16 = null;
        if (var9.field98 != -1) {
            var16 = var9.method60(false, arg8, true);
            if (var16 != null) {
                class384.method2473(arg1, arg3, arg4, arg7, var16, arg5, arg0, arg2 ^ 0xFFFFFFA3);
            }
        }
        if (var9.field113 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method398();
        }
        class273 var18 = class294.field4209;
        class313 var19 = class410.field6062;
        if (var9.field129 == 1) {
            var18 = class393.field5626;
            var19 = class283.field4123;
        }
        if (var9.field129 == 2) {
            var19 = class191.field2562;
            var18 = class422.field6227;
        }
        class171.method1060(arg7, arg3, arg2 ^ 0x6C, var18, var19, var9.field96, arg0, arg4, var17, var9.field113, arg1, arg5);
        return;
    }
}
