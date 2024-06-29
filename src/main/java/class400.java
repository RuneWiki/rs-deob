import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class400 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Loa;")
    private class157 field5845 = new class157();

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    private int field5847;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    private int field5838;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lfa;")
    private class371 field5833;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "[I")
    public static int[] field5850 = new int[13];

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lsh;")
    public static class472 field5835 = new class472(4, 0);

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)I")
    public final int method2386(byte arg0) {
        if (arg0 < 107) {
            return -102;
        } else {
            field5854++;
            return this.field5847;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)I")
    public final int method2387(boolean arg0) {
        field5836++;
        int var2 = 0;
        class156 var3 = (class156) this.field5845.method1070((byte) -122);
        if (arg0) {
            this.field5845 = null;
        }
        while (var3 != null) {
            if (!var3.method1063((byte) -120)) {
                var2++;
            }
            var3 = (class156) this.field5845.method1073(-5);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
    public final void method2388(int arg0) {
        int var2 = 43 % ((arg0 - 77) / 43);
        field5834++;
        for (class156 var3 = (class156) this.field5845.method1070((byte) -92); var3 != null; var3 = (class156) this.field5845.method1073(-45)) {
            if (var3.method1063((byte) -120)) {
                var3.method283(2);
                var3.method701(-82);
                this.field5838 += var3.field2165;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)V")
    public final void method2389(boolean arg0, int arg1) {
        if (arg0) {
            return;
        }
        if (class28.field373 != null) {
            for (class156 var3 = (class156) this.field5845.method1070((byte) -68); var3 != null; var3 = (class156) this.field5845.method1073(119)) {
                if (var3.method1063((byte) -120)) {
                    if (var3.method1064((byte) -108) == null) {
                        var3.method283(2);
                        var3.method701(-109);
                        this.field5838++;
                    }
                } else if (((long) arg1) < (++var3.field1255)) {
                    class156 var4 = class28.field373.method785((byte) 127, var3);
                    this.field5833.method2307(var3.field436, var4, (byte) 119);
                    class156.method1061((byte) -112, var3, var4);
                    var3.method283(2);
                    var3.method701(-52);
                }
            }
        }
        field5840++;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I")
    public final int method2390(int arg0) {
        if (arg0 > -89) {
            this.method2388(79);
        }
        field5848++;
        return this.field5838;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILns;Ltq;IBIIIZILpp;IIII)Lns;")
    public static final class57 method2391(int arg0, class57 arg1, class63 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, class356 arg10, int arg11, int arg12, int arg13, int arg14) {
        field5841++;
        if (arg1 == null) {
            return null;
        }
        int var15 = 1031;
        if (arg10 != null) {
            int var16 = var15 | arg10.method2194((byte) -128, arg7, -1, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg5 << 48) + ((long) arg12 << 32) + (long) ((arg6 << 16) + arg13 - -(arg14 << 24));
        class400 var19 = class475.field6651;
        class57 var20;
        synchronized (class475.field6651) {
            var20 = (class57) class475.field6651.method2393(-127, var17);
        }
        if (var20 == null || arg2.method583(var20.method402(), var15) != 0) {
            if (var20 != null) {
                var15 = arg2.method578(var15, var20.method402());
            }
            byte var21;
            if (arg13 == 1) {
                var21 = 9;
            } else if (arg13 == 2) {
                var21 = 12;
            } else if (arg13 == 3) {
                var21 = 15;
            } else if (arg13 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class246 var24 = new class246(var21 * var22 + 1, var22 * 2 * var21 - var21, 0);
            int var25 = var24.method1573(0, 1, 0, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class172.field2450[var31] * var28 >> 15;
                    int var33 = class172.field2456[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method1573(0, 1, var33, var32);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg6 * var36 + arg14 * var35 >> 8);
                short var38 = (short) (((arg5 & 0x7F) * var35 + (arg12 & 0x7F) * var36 & 0x7F00) + ((arg5 & 0x380) * var35 + (arg12 & 0x380) * var36 & 0x38000) + ((arg5 & 0xFC00) * var35 + (arg12 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method1564((byte) -1, (short) -1, (byte) 1, var26[0][var39], var38, 2, var37, var25, var26[0][(var39 + 1) % var21]);
                    } else {
                        var24.method1564((byte) -1, (short) -1, (byte) 1, var26[var34][(var39 + 1) % var21], var38, 2, var37, var26[var34 - 1][var39], var26[var34 - 1][(var39 + 1) % var21]);
                        var24.method1564((byte) -1, (short) -1, (byte) 1, var26[var34][var39], var38, 2, var37, var26[var34 - 1][var39], var26[var34][(var39 + 1) % var21]);
                    }
                }
            }
            var20 = arg2.method555(var24, var15, class38.field528, 64, 768);
            class400 var40 = class475.field6651;
            synchronized (class475.field6651) {
                class475.field6651.method2395(0, var20, var17);
            }
        }
        int var41 = arg13 * 64 - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg8) {
            if (arg0 > 5120 && arg0 < 11264) {
                var45 = var41 + 128;
            }
            if (arg0 > 9216 && arg0 < 15360) {
                var44 = var41 + 128;
            }
            if (arg0 > 1024 && arg0 < 7168) {
                var42 -= 128;
            }
            if (arg0 > 13312 || arg0 < 3072) {
                var43 -= 128;
            }
        }
        int var46 = arg1.method413();
        int var47 = arg1.method425();
        int var48 = 13 / ((29 - arg4) / 39);
        int var49 = arg1.method431();
        if (var49 < var43) {
            var49 = var43;
        }
        if (var46 < var42) {
            var46 = var42;
        }
        int var50 = arg1.method417();
        if (var47 > var44) {
            var47 = var44;
        }
        if (var45 < var50) {
            var50 = var45;
        }
        class110 var51 = null;
        if (arg10 != null) {
            int var52 = arg10.field5389[arg7];
            var51 = class170.field2423.method1580(1, var52 >> 16);
            arg7 = var52 & 0xFFFF;
        }
        class57 var53;
        if (var51 == null) {
            var53 = var20.method437((byte) 3, var15, true);
            var53.method446((var47 - var46) / 2, 128, (var50 - var49) / 2);
            var53.method407((var46 + var47) / 2, 0, (var49 + var50) / 2);
        } else {
            var53 = var20.method437((byte) 3, var15, true);
            var53.method446((var47 - var46) / 2, 128, (var50 - var49) / 2);
            var53.method407((var46 + var47) / 2, 0, (var49 + var50) / 2);
            var53.method424(arg7, var51, -25823);
        }
        if (arg3 != 0) {
            var53.method421(arg3);
        }
        if (arg11 != 0) {
            var53.method419(arg11);
        }
        if (arg9 != 0) {
            var53.method407(0, arg9, 0);
        }
        return var53;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2392(int arg0) {
        field5849++;
        class156 var2 = (class156) this.field5833.method2296((byte) 39);
        while (var2 != null) {
            Object var3 = var2.method1064((byte) -108);
            if (var3 != null) {
                return var3;
            }
            class156 var4 = var2;
            var2 = (class156) this.field5833.method2297(true);
            var4.method283(2);
            var4.method701(-106);
            this.field5838 += var2.field2165;
        }
        return arg0 <= 80 ? null : null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2393(int arg0, long arg1) {
        field5837++;
        class156 var4 = (class156) this.field5833.method2305(arg1, (byte) 66);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method1064((byte) -108);
        if (arg0 > -116) {
            return null;
        } else if (var5 == null) {
            var4.method283(2);
            var4.method701(-27);
            this.field5838 += var4.field2165;
            return null;
        } else {
            if (var4.method1063((byte) -120)) {
                class316 var6 = new class316(var5, var4.field2165);
                this.field5833.method2307(var4.field436, var6, (byte) 123);
                this.field5845.method1075((byte) -110, var6);
                var6.field1255 = 0L;
                var4.method283(2);
                var4.method701(-13);
            } else {
                this.field5845.method1075((byte) -126, var4);
                var4.field1255 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/Object;JI)V")
    private final void method2394(int arg0, Object arg1, long arg2, int arg3) {
        field5852++;
        if (this.field5847 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2396(arg2, -18460);
        this.field5838 -= arg3;
        while (this.field5838 < 0) {
            class156 var7 = (class156) this.field5845.method1069((byte) 89);
            this.method2397(var7, -13711);
        }
        class316 var6 = new class316(arg1, arg3);
        this.field5833.method2307(arg2, var6, (byte) -103);
        if (arg0 <= -60) {
            this.field5845.method1075((byte) -101, var6);
            var6.field1255 = 0L;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/Object;J)V")
    public final void method2395(int arg0, Object arg1, long arg2) {
        field5853++;
        this.method2394(-77, arg1, arg2, 1);
        if (arg0 != 0) {
            this.field5845 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(JI)V")
    private final void method2396(long arg0, int arg1) {
        field5844++;
        class156 var4 = (class156) this.field5833.method2305(arg0, (byte) 73);
        this.method2397(var4, -13711);
        if (arg1 != -18460) {
            field5835 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(I)V")
    public class400(int arg0) {
        this.field5847 = arg0;
        this.field5838 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field5833 = new class371(var2);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lin;I)V")
    private final void method2397(class156 arg0, int arg1) {
        field5842++;
        if (arg1 == -13711 && arg0 != null) {
            arg0.method283(arg1 ^ 0xFFFFCA73);
            arg0.method701(-46);
            this.field5838 += arg0.field2165;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
    public static void method2398(int arg0) {
        field5835 = null;
        if (arg0 <= 113) {
            method2400(-20, -48, -20, -35);
        }
        field5850 = null;
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2399(int arg0) {
        if (arg0 != 0) {
            method2398(101);
        }
        field5851++;
        class156 var2 = (class156) this.field5833.method2297(true);
        while (var2 != null) {
            Object var3 = var2.method1064((byte) -108);
            if (var3 != null) {
                return var3;
            }
            class156 var4 = var2;
            var2 = (class156) this.field5833.method2297(true);
            var4.method283(2);
            var4.method701(arg0 - 101);
            this.field5838 += var2.field2165;
        }
        return null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)V")
    public static final void method2400(int arg0, int arg1, int arg2, int arg3) {
        class337 var4 = class170.field2427[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class287 var5 = var4.field5058;
        class287 var6 = var4.field5050;
        if (var5 != null) {
            var5.field4378 = var5.field4378 * arg3 / 16;
            var5.field4385 = var5.field4385 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field4378 = var6.field4378 * arg3 / 16;
            var6.field4385 = var6.field4385 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public final void method2401(byte arg0) {
        if (arg0 > -27) {
            this.method2388(-107);
        }
        field5843++;
        this.field5845.method1071(27536);
        this.field5833.method2299((byte) -128);
        this.field5838 = this.field5847;
    }
}
