import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class153 {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[I")
    private int[] field3375;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lpe;")
    public static class109 field3366 = class141.method1120("(U0a )2 via: ", 0);

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lpe;")
    private static class109 field3361 = class141.method1120("Please wait)3)3)3", 0);

    @OriginalMember(owner = "client!w", name = "c", descriptor = "Lpe;")
    public static class109 field3362 = field3361;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "Z")
    public static boolean field3370 = false;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[I")
    public static int[] field3376 = new int[2000];

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field3371 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "Lpe;")
    private static class109 field3365 = class141.method1120("Loaded textures", 0);

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Lpe;")
    public static class109 field3368 = field3365;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field3373 = 0;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "Lpe;")
    public static class109 field3377 = class141.method1120("hitmarks", 0);

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "J")
    public static long field3360;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lba;")
    public static class9 field3363;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[[[B")
    public static byte[][][] field3374;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/awt/Component;IIZ)Lcc;")
    public static final class18 method1178(Component arg0, int arg1, int arg2, boolean arg3) {
        field3369++;
        if (!arg3) {
            return null;
        }
        try {
            Class var4 = Class.forName("qf");
            class18 var5 = (class18) var4.getDeclaredConstructor().newInstance();
            var5.method72(arg1, (byte) -5, arg0, arg2);
            return var5;
        } catch (Throwable var7) {
            class8 var6 = new class8();
            var6.method72(arg1, (byte) -32, arg0, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLwa;)Z")
    public static final boolean method1179(byte arg0, class154 arg1) {
        field3364++;
        if (arg0 >= -44) {
            return true;
        }
        if (class14.field380) {
            if (class136.method1084(0, arg1) != 0) {
                return false;
            }
            if (arg1.field3476 == 0) {
                return false;
            }
        }
        return arg1.field3508;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZIIB)Le;")
    public static final class29 method1180(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        long var6 = ((long) arg1 << 38) + ((long) arg0 + ((long) arg4 << 16)) + ((long) arg3 << 40);
        field3378++;
        if (!arg2) {
            class29 var8 = (class29) class45.field949.method93((byte) 103, var6);
            if (var8 != null) {
                return var8;
            }
        }
        if (arg5 != -96) {
            return null;
        }
        class112 var9 = class4.method43((byte) 94, arg0);
        if (arg4 > 1 && var9.field2422 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field2421[var11] && var9.field2421[var11] != 0) {
                    var10 = var9.field2422[var11];
                }
            }
            if (var10 != -1) {
                var9 = class4.method43((byte) 94, var10);
            }
        }
        class155 var12 = var9.method923(1, (byte) 85);
        if (var12 == null) {
            return null;
        }
        class29 var13 = null;
        if (var9.field2427 != -1) {
            var13 = method1180(var9.field2439, 1, true, 0, 10, (byte) -96);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class140.field3051;
        int var15 = class140.field3048;
        int var16 = class140.field3046;
        int[] var17 = new int[4];
        class140.method1111(var17);
        class29 var18 = new class29(36, 32);
        class140.method1101(var18.field659, 36, 32);
        class140.method1102();
        class105.method847();
        class105.method844(16, 16);
        int var19 = var9.field2406;
        if (arg2) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        class105.field2212 = false;
        int var20 = class105.field2221[var9.field2395] * var19 >> 16;
        int var21 = class105.field2210[var9.field2395] * var19 >> 16;
        var12.method1208();
        var12.method1211(0, var9.field2410, var9.field2378, var9.field2395, var9.field2394, var9.field2379 + var20 + var12.field1780 / 2, var9.field2379 + var21);
        if (arg1 >= 1) {
            var18.method261(1);
        }
        if (arg1 >= 2) {
            var18.method261(16777215);
        }
        if (arg3 != 0) {
            var18.method273(arg3);
        }
        class140.method1101(var18.field659, 36, 32);
        if (var9.field2427 != -1) {
            var13.method279(0, 0);
        }
        if (!arg2 && (var9.field2399 == 1 || arg4 != 1) && arg4 != -1) {
            class85.field1803.method558(class35.method354(arg4, (byte) 125), 0, 9, 16776960, 1);
        }
        if (!arg2) {
            class45.field949.method97(var6, (byte) -118, var18);
        }
        class140.method1101(var14, var16, var15);
        class140.method1113(var17);
        class105.method847();
        class105.field2212 = true;
        return var18;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)V")
    public static final void method1181(int arg0, int arg1, int arg2, int arg3) {
        field3372++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class134.field2918 = -1;
            class102.field2142 = -1;
            return;
        }
        int var4 = class126.method1019(arg0, arg3, 1, class75.field1513) - arg1;
        int var5 = class105.field2221[class116.field2591];
        int var6 = -109 % ((-arg2 - 62) / 38);
        int var7 = arg0 - class154.field3518;
        int var8 = class105.field2210[class116.field2591];
        int var9 = arg3 - class85.field1795;
        int var10 = class105.field2221[class57.field1158];
        int var11 = var4 - class102.field2149;
        int var12 = class105.field2210[class57.field1158];
        int var13 = var7 * var10 + var9 * var12 >> 16;
        int var14 = var7 * var12 - var9 * var10 >> 16;
        int var16 = var8 * var11 - var5 * var14 >> 16;
        int var17 = var5 * var11 + var8 * var14 >> 16;
        if (var17 >= 50) {
            class134.field2918 = (var13 << 9) / var17 + 256;
            class102.field2142 = (var16 << 9) / var17 + 167;
        } else {
            class134.field2918 = -1;
            class102.field2142 = -1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
    public final int method1182(byte arg0, int arg1) {
        field3367++;
        int var3 = this.field3375.length - 2;
        if (arg0 != -71) {
            field3363 = null;
        }
        int var4 = var3 & arg1 << 1;
        while (true) {
            int var5 = this.field3375[var4];
            if (arg1 == var5) {
                return this.field3375[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method1183(int arg0) {
        if (arg0 < 107) {
            field3365 = null;
        }
        field3374 = null;
        field3362 = null;
        field3377 = null;
        field3363 = null;
        field3376 = null;
        field3361 = null;
        field3368 = null;
        field3365 = null;
        field3366 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([I)V")
    public class153(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field3375 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field3375[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field3375[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field3375[var5 + var5] = arg0[var4];
            this.field3375[var5 + var5 + 1] = var4++;
        }
    }
}
