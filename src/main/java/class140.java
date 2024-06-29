import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class140 extends class32 {

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Z")
    public boolean field2418 = false;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "Ltc;")
    private class177 field2433;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "Z")
    private boolean field2429;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Z")
    private boolean field2424;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    private int field2405;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Lqk;")
    private static class207 field2402 = class24.method212(255, "Mar");

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "Lqk;")
    private static class207 field2406 = class24.method212(255, "Oct");

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lqk;")
    private static class207 field2403 = class24.method212(255, "Jul");

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "Lqk;")
    private static class207 field2416 = class24.method212(255, "Aug");

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lqk;")
    private static class207 field2413 = class24.method212(255, "Jan");

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lqk;")
    private static class207 field2421 = class24.method212(255, "Apr");

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "Lqk;")
    private static class207 field2407 = class24.method212(255, "May");

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lqk;")
    public static class207 field2422 = class24.method212(255, "::pcachesize");

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field2423 = 0;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Lqk;")
    public static class207 field2411 = class24.method212(255, "headicons_prayer");

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Lqk;")
    private static class207 field2420 = class24.method212(255, "Jun");

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lqk;")
    private static class207 field2428 = class24.method212(255, "Feb");

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lqk;")
    private static class207 field2415 = class24.method212(255, "Dec");

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "[Z")
    public static boolean[] field2431 = new boolean[100];

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "Lqk;")
    private static class207 field2432 = class24.method212(255, "Sep");

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "Lqk;")
    private static class207 field2434 = class24.method212(255, "Nov");

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "[Lqk;")
    public static class207[] field2412 = new class207[] { field2413, field2428, field2402, field2421, field2407, field2420, field2403, field2416, field2432, field2406, field2434, field2415 };

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "F")
    private float field2400;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "[I")
    private int[] field2426;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)V")
    public static final void method968(int arg0, int arg1) {
        field2417++;
        class287.method1961(0);
        class171.method1228(true);
        int var2 = class25.method214(arg0, (byte) -111).field3223;
        if (var2 == 0) {
            return;
        }
        int var3 = class83.field1535[arg0];
        if (var2 == 6) {
            class265.field4695 = var3;
        }
        if (var2 == 5) {
            class276.field4848 = var3;
        }
        if (arg1 == var2) {
            class283.field4968 = var3;
        }
    }

    @OriginalMember(owner = "client!ic", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field2419++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lpk;ZBLfi;)[I")
    public final int[] method969(class99 arg0, boolean arg1, byte arg2, class109 arg3) {
        field2425++;
        if (this.field2433.method1268(30155, arg0, arg3)) {
            int var5 = -104 / ((arg2 + 46) / 40);
            int var6 = arg1 ? 64 : 128;
            return this.field2433.method1265(1.0D, false, var6, arg3, this.field2424, var6, 97, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2410++;
        int var8 = 2048 - arg5 & 0x7FF;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        if (arg7 != 31798) {
            return;
        }
        int var12 = arg6;
        if (var8 != 0) {
            int var13 = class257.field4598[var8];
            var10 = -arg6 * var13 >> 16;
            int var14 = class257.field4597[var8];
            var12 = arg6 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class257.field4598[var9];
            var11 = var12 * var15 >> 16;
            int var16 = class257.field4597[var9];
            var12 = var12 * var16 >> 16;
        }
        class196.field3443 = arg1 - var10;
        class101.field1819 = arg4;
        class228.field4186 = arg5;
        class111.field1939 = arg3 - var12;
        class209.field3702 = arg0 - var11;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[B)Lqk;")
    public static final class207 method971(int arg0, int arg1, int arg2, byte[] arg3) {
        class207 var4 = new class207();
        var4.field3663 = 0;
        field2408++;
        var4.field3652 = new byte[arg0];
        for (int var5 = arg1; var5 < (arg0 + arg1); var5++) {
            if (arg3[var5] != 0) {
                var4.field3652[var4.field3663++] = arg3[var5];
            }
        }
        if (arg2 != 2) {
            field2434 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(FLpk;Lfi;ZI)[I")
    public final int[] method972(float arg0, class99 arg1, class109 arg2, boolean arg3, int arg4) {
        field2427++;
        if (this.field2426 == null || this.field2400 != arg0) {
            if (!this.field2433.method1268(arg4 ^ 0xFFFF92A5, arg1, arg2)) {
                return null;
            }
            int var6 = arg3 ? 64 : 128;
            this.field2426 = this.field2433.method1265((double) arg0, true, var6, arg2, this.field2424, var6, 84, arg1);
            this.field2400 = arg0;
            if (this.field2429) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var12 = var6;
                int var13 = var6;
                int var14 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var13--;
                        int var35 = this.field2426[var13];
                        var8[var34] += class121.method860(16722890, var35) >> 16;
                        var7[var34] += class121.method860(var35, 65313) >> 8;
                        var10[var34] += class121.method860(255, var35);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var25 += var8[var22];
                        var23 += var7[var22];
                        var24 += var10[var22];
                        if (var22 == 0) {
                            var22 = var12;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var24 / 9;
                        int var32 = var23 / 9;
                        var22--;
                        int var33 = var25 / 9;
                        var21--;
                        var19--;
                        var9[var19] = class281.method1906(class281.method1906(var32 << 8, var33 << 16), var31);
                        var23 += var7[var22] - var7[var21];
                        var24 += var10[var22] - var10[var21];
                        var25 += var8[var22] - var8[var21];
                        if (var22 == 0) {
                            var22 = var12;
                        }
                        if (var21 == 0) {
                            var21 = var12;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var14--;
                        int var29 = this.field2426[var14];
                        var13--;
                        int var30 = this.field2426[var13];
                        var8[var28] += -(class121.method860(var29, 16776695) >> 16) + class121.method860(var30 >> 16, 255);
                        var7[var28] += -class121.method860(255, var29 >> 8) + (class121.method860(var30, 65532) >> 8);
                        var10[var28] += class121.method860(var30, 255) - class121.method860(var29, 255);
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                    if (var14 == 0) {
                        var14 = var17;
                    }
                }
                this.field2426 = var9;
            }
        }
        if (arg4 != -6290) {
            field2434 = null;
        }
        return this.field2426;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBII)V")
    public static final void method973(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2409++;
        if (arg2 >= -60) {
            field2421 = null;
        }
        for (int var5 = 0; var5 < class110.field1930; var5++) {
            if (class68.field1209[var5] + class43.field852[var5] > arg1 && class43.field852[var5] < arg0 + arg1 && class128.field2229[var5] + class111.field1941[var5] > arg3 && arg3 + arg4 > class111.field1941[var5]) {
                class212.field3766[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfi;Lpk;B)Z")
    public final boolean method974(class109 arg0, class99 arg1, byte arg2) {
        if (arg2 != 34) {
            this.field2429 = false;
        }
        field2414++;
        return this.field2433.method1268(30155, arg1, arg0);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
    public static void method975(byte arg0) {
        field2431 = null;
        field2422 = null;
        field2412 = null;
        field2432 = null;
        field2416 = null;
        field2413 = null;
        field2428 = null;
        field2403 = null;
        field2415 = null;
        field2421 = null;
        int var1 = -123 % ((67 - arg0) / 53);
        field2420 = null;
        field2406 = null;
        field2407 = null;
        field2411 = null;
        field2434 = null;
        field2402 = null;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(II)V")
    public final void method976(int arg0, int arg1) {
        field2404++;
        if (this.field2426 == null) {
            return;
        }
        if (this.field2430 != 0 || this.field2405 != 0) {
            if (class69.field1239 == null || this.field2426.length > class69.field1239.length) {
                class69.field1239 = new int[this.field2426.length];
            }
            int var3 = this.field2426.length;
            int var4 = this.field2426.length == 4096 ? 64 : 128;
            int var5 = var4 - 1;
            int var6 = this.field2405 * arg0;
            int var7 = arg0 * var4 * this.field2430;
            int var8 = var3 - 1;
            for (int var9 = 0; var9 < var3; var9 += var4) {
                int var11 = var8 & var7 + var9;
                for (int var12 = 0; var12 < var4; var12++) {
                    int var13 = (var6 + var12 & var5) + var11;
                    int var14 = var9 + var12;
                    class69.field1239[var14] = this.field2426[var13];
                }
            }
            int[] var10 = this.field2426;
            this.field2426 = class69.field1239;
            class69.field1239 = var10;
        }
        if (arg1 != 255) {
            field2415 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lgh;Lpk;Lpk;BLpk;)Z")
    public static final boolean method977(class24 arg0, class99 arg1, class99 arg2, byte arg3, class99 arg4) {
        class195.field3437 = arg0;
        class234.field4309 = arg2;
        if (arg3 < 35) {
            field2415 = null;
        }
        class43.field837 = arg4;
        field2401++;
        class36.field690 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIILdc;JZ)V")
    public static final void method978(int arg0, int arg1, int arg2, int arg3, class235 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class246 var8 = new class246();
        var8.field4465 = arg4;
        var8.field4459 = arg1 * 128 + 64;
        var8.field4456 = arg2 * 128 + 64;
        var8.field4454 = arg3;
        var8.field4464 = arg5;
        if (class82.field1498[arg0][arg1][arg2] == null) {
            class82.field1498[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class82.field1498[arg0][arg1][arg2].field3152 = var8;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lv;)V")
    public class140(class149 arg0) {
        this.field2433 = new class177(arg0);
        this.field2429 = arg0.method1045((byte) 126) == 1;
        this.field2424 = arg0.method1045((byte) -72) == 1;
        arg0.method1045((byte) -117);
        arg0.method1045((byte) 88);
        int var2 = arg0.method1045((byte) -58) & 0x3;
        this.field2405 = arg0.method1084((byte) 49);
        this.field2430 = arg0.method1084((byte) 49);
        arg0.method1045((byte) -97);
        arg0.method1045((byte) 111);
    }
}
