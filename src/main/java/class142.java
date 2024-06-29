import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class142 extends class201 {

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "Z")
    public boolean field2447 = false;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lrc;")
    private class65 field2465;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "Z")
    private boolean field2458;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "Z")
    private boolean field2469;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    private int field2449;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "Ljd;")
    public static class85 field2446 = class221.method1499("::fpsoff", (byte) 95);

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "[I")
    public static int[] field2454 = new int[2];

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "Ljd;")
    private static class85 field2453 = class221.method1499("You can(Wt add yourself to your own ignore list)3", (byte) 96);

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Ljd;")
    public static class85 field2448 = field2453;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "Ljd;")
    public static class85 field2462 = class221.method1499("M", (byte) -51);

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "[S")
    public static short[] field2456 = new short[256];

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "Ljd;")
    public static class85 field2464 = class221.method1499("Eingabeprozedur geladen)3", (byte) -116);

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "F")
    private float field2452;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "[I")
    private int[] field2455;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIILkc;)V")
    public static final void method929(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class264 arg6) {
        long var7 = 0L;
        field2457++;
        if (arg5 == 0) {
            var7 = class116.method818(arg3, arg2, arg0);
        } else if (arg5 == 1) {
            var7 = class18.method131(arg3, arg2, arg0);
        } else if (arg5 == 2) {
            var7 = class67.method447(arg3, arg2, arg0);
        } else if (arg5 == 3) {
            var7 = class95.method679(arg3, arg2, arg0);
        }
        if (arg1 != 3) {
            field2446 = null;
        }
        boolean var9 = true;
        boolean var10 = false;
        int var11 = (int) var7 >> 14 & 0x1F;
        int var12 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var13 = false;
        int var14 = ((int) var7 & 0x3E37B3) >> 20;
        class199 var15 = class110.method753(var12, (byte) 122);
        if (var15.method1358((byte) 89)) {
            class197.method1348(arg3, arg2, (byte) 117, var15, arg0);
        }
        if (var7 == 0L) {
            return;
        }
        if (arg5 == 0) {
            class128.method873(arg3, arg2, arg0);
            if (var15.field3416 != 0) {
                arg6.method1816(true, var14, var15.field3429, var11, arg0, arg2);
                return;
            }
        } else if (arg5 == 1) {
            class101.method702(arg3, arg2, arg0);
        } else if (arg5 == 2) {
            class183.method1255(arg3, arg2, arg0);
            if (var15.field3416 != 0 && arg2 + var15.field3473 < 104 && var15.field3473 + arg0 < 104 && (var15.field3464 + arg2) < 104 && var15.field3464 + arg0 < 104) {
                arg6.method1818(arg0, arg2, var14, var15.field3464, (byte) -101, var15.field3473, var15.field3429);
                return;
            }
        } else {
            if (arg5 == 3) {
                class163.method1079(arg3, arg2, arg0);
                if (var15.field3416 == 1) {
                    arg6.method1822(arg2, 105, arg0);
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)Z")
    public static final boolean method930(int arg0, int arg1) {
        field2461++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class90.field1659[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg0 != -3115) {
            method936(-40, -9, -105, -24, (byte) 121, -125, -8, 46);
        }
        return var2 == 1007;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Loa;ZLge;I)[I")
    public final int[] method931(class96 arg0, boolean arg1, class68 arg2, int arg3) {
        field2445++;
        if (!this.field2465.method437(arg0, arg2, 19661184)) {
            return null;
        }
        int var5 = arg1 ? 64 : 128;
        if (arg3 > -63) {
            this.method931((class96) null, false, (class68) null, 29);
        }
        return this.field2465.method436(this.field2469, arg0, var5, arg2, 1.0D, var5, 0, false);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(II)V")
    public final void method932(int arg0, int arg1) {
        if (arg1 != -25862) {
            return;
        }
        field2450++;
        if (this.field2455 == null || this.field2468 == 0 && this.field2449 == 0) {
            return;
        }
        if (class223.field3901 == null || class223.field3901.length < this.field2455.length) {
            class223.field3901 = new int[this.field2455.length];
        }
        int var3 = this.field2449 * arg0;
        int var4 = this.field2455.length == 4096 ? 64 : 128;
        int var5 = this.field2455.length;
        int var6 = this.field2468 * arg0 * var4;
        int var7 = var5 - 1;
        int var8 = var4 - 1;
        for (int var9 = 0; var9 < var5; var9 += var4) {
            int var11 = var6 + var9 & var7;
            for (int var12 = 0; var12 < var4; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 & var3 + var12) + var11;
                class223.field3901[var13] = this.field2455[var14];
            }
        }
        int[] var10 = this.field2455;
        this.field2455 = class223.field3901;
        class223.field3901 = var10;
    }

    @OriginalMember(owner = "client!ab", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field2451++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method933(byte arg0) {
        field2454 = null;
        if (arg0 <= 115) {
            method933((byte) 110);
        }
        field2453 = null;
        field2446 = null;
        field2456 = null;
        field2464 = null;
        field2448 = null;
        field2462 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lge;Loa;Z)Z")
    public final boolean method934(class68 arg0, class96 arg1, boolean arg2) {
        if (arg2) {
            field2467++;
            return this.field2465.method437(arg1, arg0, 19661184);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IFLge;Loa;Z)[I")
    public final int[] method935(int arg0, float arg1, class68 arg2, class96 arg3, boolean arg4) {
        field2463++;
        if (this.field2455 == null || this.field2452 != arg1) {
            if (!this.field2465.method437(arg3, arg2, 19661184)) {
                return null;
            }
            int var6 = arg4 ? 64 : 128;
            this.field2455 = this.field2465.method436(this.field2469, arg3, var6, arg2, (double) arg1, var6, 0, true);
            this.field2452 = arg1;
            if (this.field2458) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field2455[var12];
                        var7[var34] += class135.method899(var35 >> 16, 255);
                        var8[var34] += class135.method899(var35 >> 8, 255);
                        var10[var34] += class135.method899(var35, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 1;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var24--;
                        var21 += var8[var24];
                        var22 += var10[var24];
                        var23 += var7[var24];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        var25--;
                        int var31 = var23 / 9;
                        int var32 = var21 / 9;
                        int var33 = var22 / 9;
                        var24--;
                        var19--;
                        var9[var19] = class75.method528(class75.method528(var32 << 8, var31 << 16), var33);
                        var22 += var10[var24] - var10[var25];
                        var23 += var7[var24] - var7[var25];
                        var21 += var8[var24] - var8[var25];
                        if (var24 == 0) {
                            var24 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field2455[var13];
                        var12--;
                        int var30 = this.field2455[var12];
                        var7[var28] += -class135.method899(var29 >> 16, 255) + class135.method899(255, var30 >> 16);
                        var8[var28] += (class135.method899(65290, var30) >> 8) - class135.method899(var29 >> 8, 255);
                        var10[var28] += -class135.method899(255, var29) + class135.method899(255, var30);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                this.field2455 = var9;
            }
        }
        if (arg0 != 19138) {
            this.field2452 = -0.7531447F;
        }
        return this.field2455;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method936(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2466++;
        if (arg2 == arg5) {
            class175.method1176(arg0, arg6, arg3, false, arg1, arg5, arg7);
            return;
        }
        if ((arg6 - arg5) >= class217.field3802 && arg5 + arg6 <= class83.field1513 && arg7 - arg2 >= class34.field522 && arg7 + arg2 <= class1.field6) {
            class64.method434(arg6, arg7, arg1, arg2, arg3, arg5, (byte) -93, arg0);
        } else {
            class163.method1070(arg1, arg5, arg0, (byte) -89, arg7, arg2, arg3, arg6);
        }
        if (arg4 < 30) {
            field2464 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)I")
    public static final int method937(int arg0, byte arg1) {
        field2459++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != 73) {
                field2446 = null;
            }
            return class23.method158(arg0, 3609);
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(II)I")
    public static final int method938(int arg0, int arg1) {
        field2460++;
        int var2 = -116 / ((arg0 - 83) / 41);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lik;)V")
    public class142(class247 arg0) {
        this.field2465 = new class65(arg0);
        this.field2458 = arg0.method1711((byte) -67) == 1;
        this.field2469 = arg0.method1711((byte) -67) == 1;
        arg0.method1711((byte) -67);
        arg0.method1711((byte) -67);
        int var2 = arg0.method1711((byte) -67) & 0x3;
        this.field2449 = arg0.method1690(true);
        this.field2468 = arg0.method1690(true);
        arg0.method1711((byte) -67);
        arg0.method1711((byte) -67);
    }
}
