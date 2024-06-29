import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public abstract class class189 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lda;")
    public static class275 field3257 = class255.method1672(127, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lda;")
    private static class275 field3261 = class255.method1672(127, "");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lda;")
    private static class275 field3258 = class255.method1672(121, "Drop");

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Z")
    public static boolean field3264 = false;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[Z")
    public static boolean[] field3266 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Lda;")
    public static class275 field3268 = field3258;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "Lda;")
    public static class275 field3269 = field3261;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "Lda;")
    public static class275 field3270 = class255.method1672(120, "welle2:");

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILij;)V")
    public static final void method1248(int arg0, class85 arg1) {
        if (class150.field2612 != null) {
            try {
                class150.field2612.method1650((byte) 30, 0L);
                class150.field2612.method1646(arg1.field1392, arg1.field1381, 24, 119);
            } catch (Exception var3) {
            }
        }
        arg1.field1392 += 24;
        field3267++;
        int var2 = 76 % ((arg0 - 41) / 54);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)I")
    public static final int method1249(int arg0, int arg1, int arg2) {
        field3262++;
        if (arg1 != 2) {
            return -16;
        }
        int var3 = 0;
        while (arg2 > 0) {
            arg2--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lma;I)V")
    public static final void method1250(class105 arg0, int arg1) {
        field3265++;
        if (arg1 <= -39) {
            class108.field1876 = arg0;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1251(int arg0) {
        field3261 = null;
        field3258 = null;
        if (arg0 != 1) {
            method1250((class105) null, 85);
        }
        field3268 = null;
        field3266 = null;
        field3269 = null;
        field3270 = null;
        field3257 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIILbc;I)V")
    public static final void method1252(int arg0, int arg1, int arg2, int arg3, class249 arg4, int arg5) {
        field3263++;
        if (arg4.field4392 == -1 && arg4.field4397 == null) {
            return;
        }
        int var6 = arg5;
        if (arg0 > arg4.field4388) {
            var6 = arg0 + arg5 - arg4.field4388;
        } else if (arg0 < arg4.field4374) {
            var6 = arg4.field4374 + arg5 - arg0;
        }
        if (arg3 > arg4.field4381) {
            var6 += arg3 - arg4.field4381;
        } else if (arg3 < arg4.field4377) {
            var6 += arg4.field4377 - arg3;
        }
        if (arg4.field4387 == 0 || (var6 - 64) > arg4.field4387 || class173.field3006 == 0 || arg4.field4385 != arg2) {
            if (arg4.field4380 != null) {
                class258.field4522.method1426(arg4.field4380);
                arg4.field4380 = null;
            }
            if (arg4.field4396 != null) {
                class258.field4522.method1426(arg4.field4396);
                arg4.field4396 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg4.field4387 - var6) * class173.field3006 / arg4.field4387;
        if (arg4.field4380 != null) {
            arg4.field4380.method389(var7);
        } else if (arg4.field4392 >= 0) {
            class2 var8 = class2.method8(class106.field1838, arg4.field4392, 0);
            if (var8 != null) {
                class128 var9 = var8.method5().method917(class112.field1979);
                class62 var10 = class62.method422(var9, 100, var7);
                var10.method401(-1);
                class258.field4522.method1422(var10);
                arg4.field4380 = var10;
            }
        }
        if (arg4.field4396 != null) {
            arg4.field4396.method389(var7);
            if (!arg4.field4396.method737(arg5 + 18878)) {
                arg4.field4396 = null;
                return;
            }
            return;
        }
        if (arg4.field4397 == null || (arg4.field4393 -= arg1) > 0) {
            return;
        }
        int var11 = (int) (Math.random() * (double) arg4.field4397.length);
        class2 var12 = class2.method8(class106.field1838, arg4.field4397[var11], 0);
        if (var12 == null) {
            return;
        }
        class128 var13 = var12.method5().method917(class112.field1979);
        class62 var14 = class62.method422(var13, 100, var7);
        var14.method401(0);
        class258.field4522.method1422(var14);
        arg4.field4396 = var14;
        arg4.field4393 = (int) (Math.random() * (double) (arg4.field4386 - arg4.field4394)) + arg4.field4394;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZIII)Lda;")
    public static final class275 method1253(boolean arg0, int arg1, int arg2, int arg3) {
        field3260++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        if (arg2 != 30997) {
            method1248(37, (class85) null);
        }
        int var5 = arg1 / arg3;
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg0) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg0) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            arg1 /= arg3;
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class275 var9 = new class275();
        var9.field4749 = var7;
        var9.field4752 = var6;
        return var9;
    }
}
