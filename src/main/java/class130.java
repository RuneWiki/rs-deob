import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class130 extends class99 {

    @OriginalMember(owner = "client!ib", name = "fb", descriptor = "I")
    private int field2431 = -1;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lr;")
    public static class66 field2417 = class93.method641(43, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ib", name = "eb", descriptor = "I")
    public static int field2430 = 0;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lr;")
    public static class66 field2424 = class93.method641(43, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ib", name = "cb", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ib", name = "db", descriptor = "[I")
    private int[] field2429;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIIIZIZI)Ljb;")
    public static final class256 method904(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        ++field2428;
        class157 var8 = class40.method242(-25672, arg3);
        if (~arg7 < -2 && var8.field2794 != null) {
            int var9 = -1;
            for (int var10 = 0; ~var10 > -11; ++var10) {
                if (~var8.field2804[var10] >= ~arg7 && ~var8.field2804[var10] != -1) {
                    var9 = var8.field2794[var10];
                }
            }
            if (var9 != -1) {
                var8 = class40.method242(-25672, var9);
            }
        }
        class229 var11 = var8.method1064(-50);
        if (var11 == null) {
            return null;
        } else {
            class168 var12 = null;
            if (var8.field2836 != -1) {
                var12 = (class168) method904(true, 0, -125, var8.field2829, false, 1, true, 10);
                if (var12 == null) {
                    return null;
                }
            } else if (var8.field2790 != -1) {
                var12 = (class168) method904(false, arg1, -125, var8.field2796, false, arg5, true, arg7);
                if (var12 == null) {
                    return null;
                }
            }
            int[] var13 = class235.field4105;
            int var14 = class235.field4104;
            int[] var15 = new int[4];
            int var16 = class235.field4100;
            class235.method1555(var15);
            class168 var17 = new class168(36, 32);
            if (arg2 > -123) {
                method906(-88, 64);
            }
            class235.method1551(var17.field3011, 36, 32);
            class123.method845();
            class123.method836(16, 16);
            class123.field2322 = false;
            int var18 = var8.field2787;
            if (!arg0) {
                if (~arg5 == -3) {
                    var18 = (int) ((double) var18 * 1.04D);
                }
            } else {
                var18 = (int) ((double) var18 * 1.5D);
            }
            int var19 = class123.field2326[var8.field2840] * var18 >> 16;
            int var20 = class123.field2314[var8.field2840] * var18 >> 16;
            var11.method1462(0, var8.field2846, var8.field2806, var8.field2840, var8.field2809, var20 + -(var11.method28() / 2) + var8.field2842, var8.field2842 + var19);
            if (arg5 >= 1) {
                var17.method1142(1);
                if (~arg5 <= -3) {
                    var17.method1142(16777215);
                }
                class235.method1551(var17.field3011, 36, 32);
            }
            if (~arg1 != -1) {
                var17.method1145(arg1);
            }
            if (~var8.field2836 == 0) {
                if (~var8.field2790 != 0) {
                    class235.method1551(var12.field3011, 36, 32);
                    var17.method980(0, 0);
                    var17 = var12;
                }
            } else {
                var12.method980(0, 0);
            }
            if (arg4 && (~var8.field2832 == -2 || ~arg7 != -2) && ~arg7 != 0) {
                class226.field3865.method233(class20.method81((byte) -83, arg7), 0, 9, 16776960, 1);
            }
            class235.method1551(var13, var14, var16);
            class235.method1541(var15);
            class123.method845();
            class123.field2322 = true;
            return var17;
        }
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)V")
    public final void method680(int arg0) {
        ++field2427;
        super.method680(arg0);
        this.field2429 = null;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method905(int arg0) {
        field2424 = null;
        field2417 = null;
        if (arg0 != 1) {
            field2417 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method37(int arg0, boolean arg1) {
        if (!arg1) {
            this.field2423 = -127;
        }
        ++field2425;
        int[][] var3 = super.field1946.method823(arg0, (byte) 101);
        if (super.field1946.field2297 && this.method908(-9)) {
            int var4 = this.field2423 * (~class16.field223 != ~this.field2426 ? this.field2426 * arg0 / class16.field223 : arg0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            if (class199.field3432 == this.field2423) {
                for (int var8 = 0; var8 < class199.field3432; ++var8) {
                    int var9 = this.field2429[var4++];
                    var7[var8] = class115.method767(255, var9) << 4;
                    var5[var8] = class115.method767(65280, var9) >> 4;
                    var6[var8] = class115.method767(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; ~class199.field3432 < ~var10; ++var10) {
                    int var11 = this.field2423 * var10 / class199.field3432;
                    int var12 = this.field2429[var4 - -var11];
                    var7[var10] = class115.method767(var12, 255) << 4;
                    var5[var10] = class115.method767(var12 >> 4, 4080);
                    var6[var10] = class115.method767(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)I")
    public static final int method906(int arg0, int arg1) {
        if (arg1 <= 83) {
            field2430 = 19;
        }
        ++field2416;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field2421;
        if (~arg1 == arg2) {
            this.field2431 = arg0.method1674(1355769544);
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "(I)V")
    public static final void method907(int arg0) {
        class7.field62.method298(106);
        class73.field1453 = 1;
        ++field2420;
        if (arg0 == 16777215) {
            class244.field4263 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "(I)Z")
    private final boolean method908(int arg0) {
        ++field2418;
        int var2 = -85 % ((60 - arg0) / 57);
        if (this.field2429 != null) {
            return true;
        } else if (this.field2431 >= 0) {
            int var3 = class199.field3432;
            int var4 = class16.field223;
            int var5 = !class129.field2404.method399((byte) -111, this.field2431) ? 128 : 64;
            this.field2429 = class129.field2404.method400(99, this.field2431);
            this.field2426 = var5;
            this.field2423 = var5;
            class187.method1231(var3, var4, true);
            return this.field2429 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)I")
    public final int method679(byte arg0) {
        ++field2422;
        if (arg0 > -43) {
            this.method11((class249) null, -25, 81);
        }
        return this.field2431;
    }
}
