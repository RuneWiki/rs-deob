import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class137 extends class89 {

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    private int field2462 = 4096;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "Z")
    private boolean field2461 = true;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "Z")
    public static boolean field2467 = false;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "S")
    public static short field2471 = 256;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "Lha;")
    public static class46 field2472 = class271.method1828("blinken1:", -46);

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "Z")
    public static boolean field2473 = false;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "[Lha;")
    public static class46[] field2476;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB)I")
    public static final int method1047(int arg0, int arg1, byte arg2) {
        ++field2469;
        if (arg2 != -107) {
            method1048(-54, -11, 111, (class181) null);
        }
        class80 var3 = (class80) class126.field2308.method1601(52, (long) arg1);
        if (var3 == null) {
            return 0;
        } else {
            return arg0 >= 0 && arg0 < var3.field1526.length ? var3.field1526[arg0] : 0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILpi;)Lrk;")
    public static final class179 method1048(int arg0, int arg1, int arg2, class181 arg3) {
        ++field2470;
        if (arg1 != 1) {
            method1053(-103, -2);
        }
        return !class146.method1083(arg3, arg0, arg2, (byte) 28) ? null : class81.method645(0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILj;IJIIII)Z")
    public static final boolean method1049(int arg0, int arg1, int arg2, int arg3, class139 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class120.method955(arg0, arg7, arg8, arg9 - arg7 + 1, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1050(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2463;
        if (~arg3 <= -129 && arg6 >= 128 && arg3 <= 13056 && arg6 <= 13056) {
            int var8 = class206.method1461(arg6, class135.field2450, arg3, 4) - arg5;
            int var9 = class62.field1042[class57.field958];
            int var10 = arg6 - class134.field2425;
            int var11 = var8 - class26.field513;
            int var12 = class62.field1042[class10.field178];
            int var13 = class62.field1049[class57.field958];
            int var14 = arg3 - class161.field2849;
            int var15 = class62.field1049[class10.field178];
            int var16 = var10 * var12 + var14 * var15 >> 16;
            int var17 = var10 * var15 + -(var12 * var14) >> 16;
            if (arg7 <= 76) {
                field2473 = false;
            }
            int var19 = var11 * var13 - var9 * var17 >> 16;
            int var20 = var9 * var11 + var13 * var17 >> 16;
            if (~var20 > -51) {
                class259.field4520 = -1;
                class271.field4728 = -1;
            } else {
                class271.field4728 = (var19 << 9) / var20 + arg4;
                class259.field4520 = (var16 << 9) / var20 + arg0;
            }
        } else {
            class271.field4728 = -1;
            class259.field4520 = -1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V")
    public static void method1051(byte arg0) {
        field2476 = null;
        field2472 = null;
        int var1 = -89 / ((arg0 - -11) / 48);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field2464;
        if (arg1 != 25) {
            field2474 = 44;
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[] var4 = this.method685(76, arg0 + -1 & class231.field4015, 0);
            int[] var5 = this.method685(107, arg0, 0);
            int[] var6 = this.method685(arg1 + 37, arg0 + 1 & class231.field4015, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~var10 > ~class241.field4284; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field2462;
                int var12 = (var5[var10 - -1 & class115.field2177] + -var5[var10 + -1 & class115.field2177]) * this.field2462;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -4096 + var16) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                } else {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                }
                if (this.field2461) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[Luf;I[BZI)V")
    public static final void method1052(int arg0, class154[] arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        ++field2466;
        class75 var6 = new class75(arg3);
        if (arg2 != -3553) {
            field2473 = false;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method573((byte) 110);
            if (~var8 == -1) {
                return;
            }
            int var9 = 0;
            var7 += var8;
            while (true) {
                int var10 = var6.method557(arg2 ^ 21853);
                if (~var10 == -1) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = var9 & 63;
                int var12 = var9 >> 6 & 63;
                int var13 = var6.method558(1);
                int var14 = var13 >> 2;
                int var15 = 3 & var13;
                int var16 = var9 >> 12;
                int var17 = arg5 + var12;
                int var18 = arg0 + var11;
                if (~var17 < -1 && var18 > 0 && ~var17 > -104 && ~var18 > -104) {
                    class154 var19 = null;
                    if (!arg4) {
                        int var20 = var16;
                        if (~(class111.field2081[1][var17][var18] & 2) == -3) {
                            var20 = var16 - 1;
                        }
                        if (~var20 <= -1) {
                            var19 = arg1[var20];
                        }
                    }
                    class261.method1748(var17, var15, var14, var16, var16, var19, var7, var18, arg4, 22, !arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method1053(int arg0, int arg1) {
        ++field2465;
        if (class175.method1259(arg1, (byte) 69)) {
            class24[] var2 = class215.field3809[arg1];
            int var3 = 0;
            if (arg0 != -16384) {
                method1048(115, 69, 47, (class181) null);
            }
            while (~var2.length < ~var3) {
                class24 var4 = var2[var3];
                if (var4 != null) {
                    var4.field419 = 0;
                    var4.field434 = 0;
                }
                ++var3;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (arg1 == -641641492) {
            if (arg2 != 0) {
                if (~arg2 == -2) {
                    this.field2461 = arg0.method558(1) == 1;
                }
            } else {
                this.field2462 = arg0.method545((byte) 107);
            }
            ++field2475;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class137() {
        super(1, false);
    }
}
