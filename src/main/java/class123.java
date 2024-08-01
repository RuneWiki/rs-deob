import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("nb")
public class class123 {

    @OriginalMember(owner = "nb", name = "a", descriptor = "Z")
    public static boolean field2360 = false;

    @OriginalMember(owner = "nb", name = "g", descriptor = "Llf;")
    public static class109 field2366 = class35.method275("null", 2);

    @OriginalMember(owner = "nb", name = "k", descriptor = "Llf;")
    private static class109 field2370 = class35.method275("Please wait )2 attempting to reestablish)3", 2);

    @OriginalMember(owner = "nb", name = "h", descriptor = "Llf;")
    public static class109 field2367 = class35.method275("Unerwartete Antwort vom Anmelde)2Server)3", 2);

    @OriginalMember(owner = "nb", name = "f", descriptor = "Llf;")
    public static class109 field2365 = field2370;

    @OriginalMember(owner = "nb", name = "b", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "nb", name = "d", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "nb", name = "e", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "nb", name = "i", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "nb", name = "j", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "nb", name = "l", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "nb", name = "n", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "nb", name = "c", descriptor = "[I")
    public static int[] field2362;

    @OriginalMember(owner = "nb", name = "m", descriptor = "[Ldf;")
    public static class37[] field2372;

    @OriginalMember(owner = "nb", name = "a", descriptor = "(Z)J")
    public static final synchronized long method880(boolean arg0) {
        field2371++;
        long var1 = System.currentTimeMillis();
        if (class57.field1160 > var1) {
            class143.field2764 += class57.field1160 - var1;
        }
        class57.field1160 = var1;
        if (arg0) {
            field2367 = null;
        }
        return class143.field2764 + var1;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(IIIIIIIILka;IZJ)Z")
    public static final boolean method881(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class95 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class103.field2036 || var20 >= class65.field1245) {
                    return false;
                }
                class3 var21 = class78.field1550[arg0][var13][var20];
                if (var21 != null && var21.field13 >= 5) {
                    return false;
                }
            }
        }
        class45 var14 = new class45();
        var14.field949 = arg11;
        var14.field939 = arg0;
        var14.field940 = arg5;
        var14.field929 = arg6;
        var14.field937 = arg7;
        var14.field945 = arg8;
        var14.field943 = arg9;
        var14.field947 = arg1;
        var14.field932 = arg2;
        var14.field927 = arg1 + arg3 - 1;
        var14.field944 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class78.field1550[var18][var15][var16] == null) {
                        class78.field1550[var18][var15][var16] = new class3(var18, var15, var16);
                    }
                }
                class3 var19 = class78.field1550[arg0][var15][var16];
                var19.field17[var19.field13] = var14;
                var19.field28[var19.field13] = var17;
                var19.field21 |= var17;
                var19.field13++;
            }
        }
        if (arg10) {
            class121.field2346[class191.field3659++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(ILjava/util/Random;Z)I")
    public static final int method882(int arg0, Random arg1, boolean arg2) {
        field2369++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        }
        if (!arg2) {
            method883(true, 33);
        }
        if (class6.method27(arg0, (byte) 47)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        }
        int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
        int var4;
        do {
            var4 = arg1.nextInt();
        } while (var4 >= var3);
        return class5.method22(arg0, -1156100001, var4);
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(ZI)Lrd;")
    public static final class161 method883(boolean arg0, int arg1) {
        field2363++;
        if (!arg0) {
            return null;
        }
        class161 var2 = (class161) class102.field2016.method1086((long) arg1, -117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class67.field1305.method147(0, arg1, 14);
        class161 var4 = new class161();
        if (var3 != null) {
            var4.method1091(new class86(var3), 28109);
        }
        class102.field2016.method1082((long) arg1, -113, var4);
        return var4;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(I)V")
    public static void method884(int arg0) {
        field2362 = null;
        int var1 = -52 / ((arg0 + 16) / 33);
        field2372 = null;
        field2366 = null;
        field2367 = null;
        field2365 = null;
        field2370 = null;
    }

    @OriginalMember(owner = "nb", name = "b", descriptor = "(I)V")
    public static final void method885(int arg0) {
        class194.field3714 = false;
        class181.field3420 = false;
        field2364++;
        int var1 = 65 % ((63 - arg0) / 42);
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(IIIII)V")
    public static final void method886(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2368++;
        class106 var5 = (class106) class76.field1466.method337((long) arg3, (byte) -122);
        if (var5 == null) {
            var5 = new class106();
            class76.field1466.method339((long) arg3, false, var5);
        }
        if (arg4 != 4) {
            field2367 = null;
        }
        if (var5.field2103.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2103.length; var8++) {
                var6[var8] = var5.field2103[var8];
                var7[var8] = var5.field2096[var8];
            }
            for (int var9 = var5.field2103.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2103 = var6;
            var5.field2096 = var7;
        }
        var5.field2103[arg0] = arg2;
        var5.field2096[arg0] = arg1;
    }

    @OriginalMember(owner = "nb", name = "a", descriptor = "(II[BI[Llb;)V")
    public static final void method887(int arg0, int arg1, byte[] arg2, int arg3, class105[] arg4) {
        field2361++;
        if (arg3 < 5) {
            return;
        }
        int var5 = -1;
        class86 var6 = new class86(arg2);
        while (true) {
            int var7 = var6.method595((byte) 17);
            if (var7 == 0) {
                return;
            }
            var5 += var7;
            int var8 = 0;
            while (true) {
                int var9 = var6.method560(0);
                if (var9 == 0) {
                    break;
                }
                var8 += var9 - 1;
                int var10 = var8 >> 6 & 0x3F;
                int var11 = var8 & 0x3F;
                int var12 = var8 >> 12;
                int var13 = var6.method598((byte) 107);
                int var14 = var13 >> 2;
                int var15 = var13 & 0x3;
                int var16 = arg0 + var10;
                int var17 = var11 + arg1;
                if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                    int var18 = var12;
                    if ((class88.field1827[1][var16][var17] & 0x2) == 2) {
                        var18 = var12 - 1;
                    }
                    class105 var19 = null;
                    if (var18 >= 0) {
                        var19 = arg4[var18];
                    }
                    class202.method1329(var12, var5, var15, var14, 16, var19, var16, var17);
                }
            }
        }
    }
}
