import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class131 extends class272 {

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    private int field2345 = 4;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "I")
    private int field2341 = 4;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "Lli;")
    public static class185 field2348 = class245.method1649("(U3", 127);

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field2354 = -1;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "Lli;")
    public static class185 field2356 = class245.method1649("Liste der Welten geladen", 124);

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "[I")
    public static int[] field2351 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lli;")
    public static class185 field2342 = class245.method1649("Stufe: ", -64);

    @OriginalMember(owner = "client!ej", name = "bb", descriptor = "Lli;")
    public static class185 field2359 = class245.method1649("Shift)2click disabled)3", -61);

    @OriginalMember(owner = "client!ej", name = "K", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ej", name = "M", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ej", name = "ab", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Ldd;")
    public static class211 field2355;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "Ljava/awt/Frame;")
    public static Frame field2357;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "Z")
    public static boolean field2349;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(Z)V")
    public static void method932(boolean arg0) {
        field2359 = null;
        field2357 = null;
        field2356 = null;
        if (!arg0) {
            method936((byte) -5, -86);
        }
        field2342 = null;
        field2351 = null;
        field2348 = null;
        field2355 = null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ILjava/lang/Object;Z)[B")
    public static final byte[] method933(int arg0, Object arg1, boolean arg2) {
        ++field2347;
        if (arg1 == null) {
            return null;
        } else if (arg0 != 0) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class52.method341(var3, -18290) : var3;
        } else if (arg1 instanceof class93) {
            class93 var4 = (class93) arg1;
            return var4.method605(32030);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V")
    public class131() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -35 / ((arg1 - 4) / 59);
        int var9 = arg2 + arg7;
        int var10 = -arg2 + arg0;
        ++field2353;
        int var11 = arg2 + arg6;
        for (int var12 = arg7; ~var12 > ~var9; ++var12) {
            class157.method1116(arg3, arg6, arg5, class145.field2757[var12], -126);
        }
        for (int var13 = arg0; ~var10 > ~var13; --var13) {
            class157.method1116(arg3, arg6, arg5, class145.field2757[var13], -41);
        }
        int var14 = -arg2 + arg5;
        for (int var15 = var9; ~var10 <= ~var15; ++var15) {
            int[] var16 = class145.field2757[var15];
            class157.method1116(arg3, arg6, var11, var16, -128);
            class157.method1116(arg4, var11, var14, var16, -57);
            class157.method1116(arg3, var14, arg5, var16, -101);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        ++field2346;
        int var4 = 57 / ((arg1 - -21) / 55);
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field2341 = arg0.method867(false);
            }
        } else {
            this.field2345 = arg0.method867(false);
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field2343;
        int var3 = 125 % ((arg1 - -60) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int var5 = class13.field235 / this.field2341;
            int var6 = class246.field4385 / this.field2345;
            int[][] var8;
            if (var5 > 0) {
                int var7 = arg0 % var5;
                var8 = this.method1860(class13.field235 * var7 / var5, 3, 0);
            } else {
                var8 = this.method1860(0, 3, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var8[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class246.field4385; ++var15) {
                int var16;
                if (var6 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var6;
                    var16 = class246.field4385 * var17 / var6;
                }
                var12[var15] = var9[var16];
                var13[var15] = var10[var16];
                var14[var15] = var11[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)V")
    public static final void method935(byte arg0) {
        class127 var1 = class241.field4308;
        synchronized (class241.field4308) {
            class14.field243 = class166.field3097;
            ++class104.field1880;
            if (class221.field4022 >= 0) {
                while (~class221.field4022 != ~class181.field3327) {
                    int var2 = class65.field1130[class181.field3327];
                    class181.field3327 = 127 & class181.field3327 + 1;
                    if (var2 >= 0) {
                        class139.field2615[var2] = true;
                    } else {
                        class139.field2615[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; ++var3) {
                    class139.field2615[var3] = false;
                }
                class221.field4022 = class181.field3327;
            }
            class166.field3097 = class142.field2724;
            if (arg0 != 68) {
                field2349 = false;
            }
        }
        ++field2350;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)V")
    public static final void method936(byte arg0, int arg1) {
        ++field2358;
        class173 var2 = class27.field460;
        synchronized (class27.field460) {
            class171.field3157 = arg1;
            if (arg0 != 11) {
                field2357 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            field2351 = null;
        }
        ++field2344;
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int var4 = class246.field4385 / this.field2345;
            int var5 = class13.field235 / this.field2341;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method1866(class13.field235 * var6 / var5, 0, 78);
            } else {
                var7 = this.method1866(0, 0, 92);
            }
            for (int var8 = 0; var8 < class246.field4385; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class246.field4385 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
