import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class class130 {

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field2267 = 2;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Loa;")
    public static class99 field2270 = class221.method1463(2844, "Vous ne pouvez pas ajouter votre nom -9 votre liste noire)3");

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "[I")
    public static int[] field2269 = new int[5];

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "S")
    public static short field2271 = 1;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "Z")
    public static boolean field2265 = true;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lpi;")
    public static class139 field2268;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)J")
    public static final long method857(int arg0, int arg1, int arg2) {
        class216 var3 = class128.field2236[arg0][arg1][arg2];
        return var3 == null || var3.field3762 == null ? 0L : var3.field3762.field2984;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
    public static final void method858(int arg0, int arg1, int arg2) {
        int var3 = 112 / ((28 - arg2) / 61);
        field2264++;
        class209.field3613[arg0] = arg1;
        class172 var4 = (class172) class276.field4852.method1550(true, (long) arg0);
        if (var4 == null) {
            class172 var5 = new class172(4611686018427387905L);
            class276.field4852.method1544((byte) -103, (long) arg0, var5);
        } else if (var4.field3049 != 4611686018427387905L) {
            var4.field3049 = class231.method1513(108) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILoi;IBI)V")
    public static final void method859(int arg0, int arg1, class80 arg2, int arg3, byte arg4, int arg5) {
        field2263++;
        if (arg2.field1426 == -1 && arg2.field1407 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg2.field1408) {
            var6 += arg5 - arg2.field1408;
        } else if (arg5 < arg2.field1424) {
            var6 += arg2.field1424 - arg5;
        }
        if (arg0 > arg2.field1423) {
            var6 += arg0 - arg2.field1423;
        } else if (arg2.field1415 > arg0) {
            var6 += arg2.field1415 - arg0;
        }
        if (arg2.field1410 == 0 || arg2.field1410 < var6 - 64 || class92.field1550 == 0 || arg2.field1409 != arg3) {
            if (arg2.field1425 != null) {
                class165.field2899.method1076(arg2.field1425);
                arg2.field1425 = null;
            }
            if (arg2.field1402 != null) {
                class165.field2899.method1076(arg2.field1402);
                arg2.field1402 = null;
            }
            return;
        }
        var6 -= 64;
        int var7 = -111 % ((arg4 - 43) / 36);
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field1410 - var6) * class92.field1550 / arg2.field1410;
        if (arg2.field1425 != null) {
            arg2.field1425.method1917(var8);
        } else if (arg2.field1426 >= 0) {
            class113 var9 = class113.method772(class271.field4788, arg2.field1426, 0);
            if (var9 != null) {
                class72 var10 = var9.method773().method503(class51.field844);
                class286 var11 = class286.method1929(var10, 100, var8);
                var11.method1896(-1);
                class165.field2899.method1080(var11);
                arg2.field1425 = var11;
            }
        }
        if (arg2.field1402 != null) {
            arg2.field1402.method1917(var8);
            if (arg2.field1402.method825(140)) {
                return;
            }
            arg2.field1402 = null;
        } else if (arg2.field1407 != null && (arg2.field1427 -= arg1) <= 0) {
            int var12 = (int) ((double) arg2.field1407.length * Math.random());
            class113 var13 = class113.method772(class271.field4788, arg2.field1407[var12], 0);
            if (var13 != null) {
                class72 var14 = var13.method773().method503(class51.field844);
                class286 var15 = class286.method1929(var14, 100, var8);
                var15.method1896(0);
                class165.field2899.method1080(var15);
                arg2.field1402 = var15;
                arg2.field1427 = (int) ((double) (arg2.field1419 - arg2.field1422) * Math.random()) + arg2.field1422;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
    public static final void method860(boolean arg0, int arg1) {
        field2266++;
        if (arg1 < 70) {
            method860(true, -127);
        }
        for (int var2 = 0; var2 < class102.field1735; var2++) {
            class156 var3 = class248.field4287[class239.field4120[var2]];
            long var4 = (long) class239.field4120[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method526(55) && var3.field2793.field4433 == arg0 && var3.field2793.method1661((byte) 23)) {
                int var6 = var3.field1325 >> 7;
                int var7 = var3.field1301 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.method516((byte) -65) == 1 && (var3.field1325 & 0x7F) == 64 && (var3.field1301 & 0x7F) == 64) {
                        if (class28.field531[var6][var7] == class55.field904) {
                            continue;
                        }
                        class28.field531[var6][var7] = class55.field904;
                    }
                    if (!var3.field2793.field4438) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1319 = class115.method777(-1, var3.field1301, class255.field4407, var3.field1325);
                    class1.method7(class255.field4407, var3.field1325, var3.field1301, var3.field1319, var3.method516((byte) -65) * 64 - 4, var3, var3.field1296, var4, var3.field1309);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
    public static void method861(int arg0) {
        field2269 = null;
        field2270 = null;
        if (arg0 != 64) {
            method861(26);
        }
        field2268 = null;
    }
}
