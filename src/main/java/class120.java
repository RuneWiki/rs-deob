import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class120 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "Lad;")
    public static class275 field1900 = new class275(64);

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1902 = new String[1000];

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1903 = "white:";

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1906 = "green:";

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[I")
    public static int[] field1908 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "[Log;")
    public static class241[] field1898;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "[[I")
    public static int[][] field1905;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method823(int arg0) {
        field1903 = null;
        field1906 = null;
        field1898 = null;
        field1900 = null;
        if (arg0 != 64) {
            field1906 = null;
        }
        field1905 = null;
        field1902 = null;
        field1908 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method824(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 74 % ((arg2 - 6) / 62);
        field1901++;
        if (arg0 >= class34.field561 && arg4 <= class148.field2371 && class52.field766 <= arg3 && arg7 <= class191.field3112) {
            class310.method2104((byte) 70, arg1, arg3, arg7, arg5, arg4, arg0, arg6);
        } else {
            class118.method811(arg1, arg5, arg6, arg3, arg7, arg0, arg4, (byte) -13);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)[Lrk;")
    public static final class292[] method825(byte arg0) {
        field1897++;
        if (arg0 <= 94) {
            return null;
        }
        class292[] var1 = new class292[class98.field1559];
        for (int var2 = 0; var2 < class98.field1559; var2++) {
            int var3 = class217.field3413[var2] * class140.field2284[var2];
            byte[] var4 = class232.field3635[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class310.field5024[class233.method1609(var4[var6], 255)];
            }
            var1[var2] = new class67(class14.field295, class13.field272, class80.field1286[var2], class211.field3364[var2], class217.field3413[var2], class140.field2284[var2], var5);
        }
        class180.method1265(121);
        return var1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method826(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg9 != 735407212) {
            return;
        }
        if (arg0 == arg7 && arg2 == arg6 && arg1 == arg5 && arg3 == arg4) {
            class307.method2088(arg3, (byte) -14, arg5, arg8, arg0, arg2);
        } else {
            int var10 = arg0;
            int var11 = arg2;
            int var12 = arg2 * 3;
            int var13 = arg7 * 3;
            int var14 = arg6 * 3;
            int var15 = arg0 * 3;
            int var16 = arg4 * 3;
            int var17 = var14 + arg3 - var16 - arg2;
            int var18 = arg1 * 3;
            int var19 = var15 + var18 - var13 - var13;
            int var20 = arg5 + var13 - var18 - arg0;
            int var21 = var16 + var12 - var14 - var14;
            int var22 = var13 - var15;
            int var23 = var14 - var12;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var20 * var26;
                int var28 = var19 * var25;
                int var29 = var17 * var26;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = (var27 + var28 + var31 >> 12) + arg0;
                int var33 = var23 * var24;
                int var34 = (var29 + var30 + var33 >> 12) + arg2;
                class307.method2088(var34, (byte) -14, var32, arg8, var10, var11);
                var10 = var32;
                var11 = var34;
            }
        }
        field1907++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lom;")
    public static final class90 method827(int arg0, int arg1, int arg2) {
        class116 var3 = class307.field4991[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1787; var4++) {
            class90 var5 = var3.field1782[var4];
            if ((var5.field1402 >> 29 & 0x3L) == 2L && var5.field1405 == arg1 && var5.field1407 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
    public static final void method828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1899++;
        class309.method2096(arg2, arg0 + arg1, (byte) -117, class232.field3629[arg4], arg1 - arg0);
        int var5 = arg0;
        int var6 = 0;
        int var7 = -arg0;
        int var8 = arg3;
        while (var5 > var6) {
            var8 += 2;
            var7 += var8;
            var6++;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class232.field3629[arg4 + var5];
                int[] var10 = class232.field3629[arg4 - var5];
                int var11 = arg1 + var6;
                int var12 = arg1 - var6;
                class309.method2096(arg2, var11, (byte) -117, var9, var12);
                class309.method2096(arg2, var11, (byte) -117, var10, var12);
            }
            int[] var13 = class232.field3629[arg4 + var6];
            int var14 = arg1 - var5;
            int var15 = arg1 + var5;
            int[] var16 = class232.field3629[arg4 - var6];
            class309.method2096(arg2, var15, (byte) -117, var13, var14);
            class309.method2096(arg2, var15, (byte) -117, var16, var14);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILgi;Lgi;)I")
    public static final int method829(int arg0, class164 arg1, class164 arg2) {
        field1896++;
        int var3 = 0;
        if (arg2.method1168(0, class288.field4663)) {
            var3++;
        }
        if (arg2.method1168(arg0, class80.field1301)) {
            var3++;
        }
        if (arg2.method1168(arg0, class41.field620)) {
            var3++;
        }
        if (arg1.method1168(0, class288.field4663)) {
            var3++;
        }
        if (arg1.method1168(arg0, class80.field1301)) {
            var3++;
        }
        if (arg1.method1168(arg0, class41.field620)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method830(byte arg0, String arg1) {
        if (arg0 != 4) {
            field1903 = null;
        }
        field1895++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 = (long) arg1.charAt(var5) + (var2 << 5) - var2;
        }
        return var2;
    }
}
