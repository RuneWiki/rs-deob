import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class41 extends class32 {

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
    public static boolean field449 = false;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "Lfg;")
    public static class240 field446;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Lkb;")
    public class41 field445;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lkb;")
    public class41 field450;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    public static int[] field447;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[II)V", line = 6)
    public static final void method250(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field444++;
        if (arg4 <= 0 || arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var6;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg1];
        int var8 = arg0;
        arg3[arg1] = var7;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if (((var9 & 0x1) + var6) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var8];
                arg2[var8] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var8];
                arg3[var8++] = var11;
            }
        }
        arg2[arg1] = arg2[var8];
        arg2[var8] = var6;
        arg3[arg1] = arg3[var8];
        arg3[var8] = var7;
        method250(arg0, var8 - 1, arg2, arg3, 98);
        method250(var8 + 1, arg1, arg2, arg3, 12);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILng;BILua;)V", line = 63)
    public static final void method251(int arg0, class182 arg1, byte arg2, int arg3, class103 arg4) {
        if (arg2 <= 108) {
            return;
        }
        field451++;
        if (arg4.field1409 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg4.field1409.length];
            for (int var7 = 0; var7 < var6.length / 2; var7++) {
                int var8 = arg4.field1409[var7 * 2] + arg1.field2746;
                int var9 = arg1.field2740 - arg4.field1409[var7 * 2 + 1];
                int var10 = var6[var7 * 2] = (class336.field5365 - class336.field5367) * (var8 - class336.field5366) / (class336.field5362 - class336.field5366) + class336.field5367;
                int var11 = var6[var7 * 2 + 1] = (var9 - class336.field5360) * (class336.field5359 - class336.field5358) / (class336.field5368 - class336.field5360) + class336.field5358;
                if (var10 > class336.field5367 && var10 < class336.field5365 && class336.field5358 < var11 && var11 < class336.field5359) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class183.method1260(var6, arg4.field1400, arg4.field1400 >>> 24);
            for (int var12 = 0; var12 < var6.length / 2 - 1; var12++) {
                class343.method2372(var6[var12 * 2], var6[var12 * 2 + 1], var6[(var12 + 1) * 2], var6[(var12 + 1) * 2 + 1], arg4.field1392, arg4.field1392 >>> 24);
            }
            class343.method2372(var6[var6.length - 2], var6[var6.length - 1], var6[0], var6[1], arg4.field1392, arg4.field1392 >>> 24);
        } else if (arg1.field2738) {
            return;
        }
        class65 var13 = new class65(arg1);
        class270 var14 = null;
        if (arg4.field1421 != -1) {
            if (arg1.field2748 && arg4.field1401 != -1) {
                var14 = (class270) arg4.method656(true, (byte) -115, true);
            } else {
                var14 = (class270) arg4.method656(true, (byte) -18, false);
            }
            if (var14 != null) {
                if (class294.field4634 > 0 && (class277.field4353 != -1 && class277.field4353 == arg1.field2735 || class75.field971 != -1 && class75.field971 == arg4.field1397)) {
                    int var15;
                    if (class162.field2489 <= 50) {
                        var15 = class162.field2489 * 3;
                    } else {
                        var15 = 300 - (class162.field2489 * 3);
                    }
                    class343.method2358(arg1.field2747, arg1.field2750, var14.field2366 / 2 + 7, 16776960, var15);
                    class343.method2358(arg1.field2747, arg1.field2750, var14.field2366 / 2 + 5, 16776960, var15);
                    class343.method2358(arg1.field2747, arg1.field2750, var14.field2366 / 2 + 3, 16776960, var15);
                    class343.method2358(arg1.field2747, arg1.field2750, var14.field2366 / 2 + 1, 16776960, var15);
                    class343.method2358(arg1.field2747, arg1.field2750, var14.field2366 / 2, 16776960, var15);
                }
                var14.method1089(arg1.field2747 - (var14.field2366 >> 1), -(var14.field2361 >> 1) + arg1.field2750);
                var13.field783 = (var14.field2366 >> 1) + arg1.field2747 + arg3;
                var13.field790 = (var14.field2361 >> 1) + arg1.field2750 + arg0;
                var13.field788 = arg3 + arg1.field2747 - (var14.field2366 >> 1);
                var13.field782 = arg1.field2750 + arg0 - (var14.field2361 >> 1);
            }
        }
        if (arg4.field1396 != null) {
            if (var14 == null) {
                class110.method710(arg0, 0, true, arg4, var13, 126, arg1, arg3);
            } else {
                class110.method710(arg0, (var14.field2361 >> 1) + 5, false, arg4, var13, 123, arg1, arg3);
            }
        }
        if (var13.method396(Integer.MAX_VALUE, class197.field3009, class128.field1873) && arg4.field1404 != null) {
            if (arg4.field1404[4] != null) {
                class67.method413(arg4.field1397, 0, -1, arg4.field1422, arg4.field1404[4], (short) 1008, (long) arg1.field2735, 0);
            }
            if (arg4.field1404[3] != null) {
                class67.method413(arg4.field1397, 0, -1, arg4.field1422, arg4.field1404[3], (short) 1003, (long) arg1.field2735, 0);
            }
            if (arg4.field1404[2] != null) {
                class67.method413(arg4.field1397, 0, -1, arg4.field1422, arg4.field1404[2], (short) 1011, (long) arg1.field2735, 0);
            }
            if (arg4.field1404[1] != null) {
                class67.method413(arg4.field1397, 0, -1, arg4.field1422, arg4.field1404[1], (short) 1005, (long) arg1.field2735, 0);
            }
            if (arg4.field1404[0] != null) {
                class67.method413(arg4.field1397, 0, -1, arg4.field1422, arg4.field1404[0], (short) 1007, (long) arg1.field2735, 0);
            }
        }
        class233.field3526.method1814(var13, true);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V", line = 201)
    public static void method252(boolean arg0) {
        field447 = null;
        field446 = null;
        if (arg0) {
            field446 = (class240) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 212)
    public final void method253(int arg0) {
        field448++;
        if (this.field445 == null) {
            return;
        }
        if (arg0 != 2) {
            field452 = 126;
        }
        this.field445.field450 = this.field450;
        this.field450.field445 = this.field445;
        this.field450 = null;
        this.field445 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V", line = 232)
    public static final void method254(boolean arg0, int arg1) {
        field453++;
        if (class111.field1532 != arg0) {
            class111.field1532 = arg0;
            if (arg1 == 29968) {
                class220.method1535((byte) -119);
            }
        }
    }
}
