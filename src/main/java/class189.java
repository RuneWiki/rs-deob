import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class189 extends class144 {

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "Lc;")
    public static class284 field2705 = new class284(8);

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2712 = "";

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "Lgk;")
    public static class259 field2713 = new class259();

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field2721 = 0;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field2720 = "Loaded sprites";

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    private int field2711;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    private int field2717;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZZLqh;IIIIIZ)Lwj;")
    public static final class130 method1240(boolean arg0, boolean arg1, class134 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        ++field2715;
        class229 var9 = class36.method224(arg7, 38);
        if (arg6 > 1 && var9.field3261 != null) {
            int var10 = -1;
            for (int var11 = 0; ~var11 > -11; ++var11) {
                if (~var9.field3270[var11] >= ~arg6 && ~var9.field3270[var11] != -1) {
                    var10 = var9.field3261[var11];
                }
            }
            if (~var10 != 0) {
                var9 = class36.method224(var10, 25);
            }
        }
        class275 var12 = var9.method1484(arg2, arg5 + -16274);
        if (var12 == null) {
            return null;
        } else {
            class187 var13 = null;
            if (var9.field3284 != -1) {
                var13 = (class187) method1240(true, false, arg2, 1, 0, 0, 10, var9.field3238, true);
                if (var13 == null) {
                    return null;
                }
            } else if (~var9.field3239 != 0) {
                var13 = (class187) method1240(true, false, arg2, arg3, arg4, arg5, arg6, var9.field3251, false);
                if (var13 == null) {
                    return null;
                }
            }
            int[] var14 = class155.field2242;
            int var15 = class155.field2247;
            int var16 = class155.field2244;
            int[] var17 = new int[4];
            class155.method1017(var17);
            class187 var18 = new class187(36, 32);
            class155.method1025(var18.field2691, 36, 32);
            class297.method1985();
            class297.method1980(16, 16);
            int var19 = var9.field3271;
            if (arg8) {
                var19 = (int) ((double) var19 * 1.5D);
            } else if (~arg3 == -3) {
                var19 = (int) ((double) var19 * 1.04D);
            }
            class297.field4694 = false;
            int var20 = class297.field4698[var9.field3283] * var19 >> 16;
            int var21 = class297.field4697[var9.field3283] * var19 >> 16;
            var12.method650(0, var9.field3279, var9.field3281, var9.field3283, var9.field3280, -(var12.method227() / 2) + var21 - -var9.field3237, var9.field3237 + var20, -1L);
            if (arg3 >= 1) {
                var18.method1219(1);
                if (arg3 >= 2) {
                    var18.method1219(16777215);
                }
                class155.method1025(var18.field2691, 36, 32);
            }
            if (arg4 != arg5) {
                var18.method1234(arg4);
            }
            if (var9.field3284 != -1) {
                var13.method848(0, 0);
            } else if (~var9.field3239 != 0) {
                class155.method1025(var13.field2691, 36, 32);
                var18.method848(0, 0);
                var18 = var13;
            }
            if (arg1 && (~var9.field3263 == -2 || arg6 != 1) && arg6 != -1) {
                class24.field289.method537(class116.method744(arg6, 75), 0, 9, 16776960, 1);
            }
            class155.method1025(var14, var16, var15);
            class155.method1035(var17);
            class297.method1985();
            class297.field4694 = true;
            return var18;
        }
    }

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
    public static void method1241(int arg0) {
        if (arg0 > -78) {
            field2705 = null;
        }
        field2705 = null;
        field2712 = null;
        field2720 = null;
        field2713 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Llc;B)V")
    public static final void method1242(class290 arg0, byte arg1) {
        ++field2707;
        if (class198.field2819 == arg0.field4515 || ~arg0.field4592 == 0 || ~arg0.field4518 != -1 || arg0.field4503 + 1 > class27.method165(arg0.field4592, (byte) -128).field4081[arg0.field4567]) {
            int var2 = -arg0.field4564 + arg0.field4515;
            int var3 = -arg0.field4564 + class198.field2819;
            int var4 = arg0.field4522 * 128 + 64 * arg0.method1556(3888);
            int var5 = arg0.field4582 * 128 - -(arg0.method1556(3888) * 64);
            int var6 = arg0.field4560 * 128 + arg0.method1556(3888) * 64;
            int var7 = arg0.field4566 * 128 - -(arg0.method1556(3888) * 64);
            arg0.field4553 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg0.field4563 = ((-var3 + var2) * var4 + var3 * var6) / var2;
        }
        if (~arg0.field4570 == -1) {
            arg0.field4534 = 1024;
        }
        if (arg0.field4570 == 1) {
            arg0.field4534 = 1536;
        }
        arg0.field4523 = 0;
        if (arg0.field4570 == 2) {
            arg0.field4534 = 0;
        }
        if (~arg0.field4570 == -4) {
            arg0.field4534 = 512;
        }
        arg0.field4512 = arg0.field4534;
        if (arg1 <= 82) {
            field2712 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(BI)V")
    private final void method1243(byte arg0, int arg1) {
        if (arg0 >= -42) {
            field2713 = null;
        }
        this.field2711 = (arg1 & 65280) >> 4;
        this.field2710 = arg1 >> 12 & 4080;
        this.field2717 = 4080 & arg1 << 4;
        ++field2718;
    }

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "(I)V")
    public static final void method1244(int arg0) {
        if (arg0 != -18435) {
            method1240(false, true, (class134) null, 39, -18, -65, 1, -37, false);
        }
        ++field2714;
        class39.field466.method71(-107);
        class158.field2276.method71(-84);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V")
    public static final void method1245(boolean arg0) {
        if (arg0) {
            class6.field94 = class133.field1943;
            class290.field4536 = class220.field3122;
        } else {
            class6.field94 = class74.field889;
            class290.field4536 = class180.field2550;
        }
        class202.field2868 = class6.field94.length;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        if (arg0 != 5) {
            this.method8((byte) -88, 118);
        }
        ++field2708;
        int[][] var3 = super.field2053.method1542(arg0 + 92, arg1);
        if (super.field2053.field3408) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class104.field1411; ++var7) {
                var5[var7] = this.field2710;
                var4[var7] = this.field2711;
                var6[var7] = this.field2717;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(I)V")
    private class189(int arg0) {
        super(0, false);
        this.method1243((byte) -51, arg0);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)Leh;")
    public static final class101 method1246(int arg0, byte arg1) {
        class101 var2 = (class101) class71.field840.method65((byte) -117, (long) arg0);
        ++field2719;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class197.field2801.method1861(class99.method607((byte) 113, arg0), class161.method1065((byte) -109, arg0), 1);
            class101 var4 = new class101();
            var4.field1390 = arg0;
            if (var3 != null) {
                var4.method622(new class216(var3), 83);
            }
            if (arg1 >= -18) {
                method1241(-93);
            }
            class71.field840.method64((long) arg0, -1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field2704;
        if (arg2 == 20630) {
            if (~arg0 == -1) {
                this.method1243((byte) -70, arg1.method1382(-59));
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class189() {
        this(0);
    }
}
