import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class292 {

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field4968 = 0;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lok;")
    public static class146 field4972 = class235.method1724(-12908, "hitbar_default");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lok;")
    public static class146 field4976 = class235.method1724(-12908, "::fps ");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field4964;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lok;")
    public class146 field4967;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lmd;")
    public static class245 field4965;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Z")
    public static boolean field4966;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[[[B")
    public static byte[][][] field4973;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4970++;
        class258 var5 = (class258) class115.field1854.method810((byte) -98, (long) arg3);
        if (var5 == null) {
            var5 = new class258();
            class115.field1854.method805(var5, (long) arg3, arg0 ^ 0x1);
        }
        if (var5.field4293.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field4293.length; var8++) {
                var6[var8] = var5.field4293[var8];
                var7[var8] = var5.field4284[var8];
            }
            for (int var9 = var5.field4293.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field4284 = var7;
            var5.field4293 = var6;
        }
        var5.field4293[arg1] = arg4;
        if (arg0 == 64) {
            var5.field4284[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ILwe;)V", line = 58)
    public static final void method2086(int arg0, class47 arg1) {
        if (arg0 >= -65) {
            method2090(92, (byte) -75);
        }
        while (true) {
            while (arg1.field857 < arg1.field860.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method368(37) == 1) {
                    var3 = arg1.method368(-103);
                    var2 = true;
                    var4 = arg1.method368(-103);
                }
                int var5 = arg1.method368(-105);
                int var6 = arg1.method368(41);
                int var7 = class191.field3152 + class33.field639 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class277.field4764;
                if (var8 >= 0 && (var7 - 63) >= 0 && class118.field1916 > (var8 + 63) && class33.field639 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && (var3 * 8 + 8) > var11 && var4 * 8 <= var12 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method352(255);
                                if (var13 != 0) {
                                    if (class33.field632[var9][var10] == null) {
                                        class33.field632[var9][var10] = new byte[4096];
                                    }
                                    class33.field632[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method352(255);
                                    if (class18.field363[var9][var10] == null) {
                                        class18.field363[var9][var10] = new byte[4096];
                                    }
                                    class18.field363[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method352(255);
                        if (var16 != 0) {
                            arg1.field857++;
                        }
                    }
                }
            }
            field4969++;
            return;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BZ)I", line = 162)
    public static final int method2087(byte arg0, boolean arg1) {
        field4974++;
        long var2 = class67.method501(arg0 ^ 0xFFFFFFEA);
        class239 var4 = arg1 ? (class239) class127.field2060.method807(arg0 - 230) : (class239) class127.field2060.method806(arg0 ^ 0x39);
        if (arg0 != 115) {
            return 33;
        }
        while (var4 != null) {
            if ((var4.field3981 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field3981 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field2883;
                    class75.field1221[var5] = class202.field3372[var5];
                    var4.method1325(-2935);
                    return var5;
                }
                var4.method1325(arg0 - 3050);
            }
            var4 = (class239) class127.field2060.method806(54);
        }
        return -1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 200)
    public static void method2088(byte arg0) {
        if (arg0 > 21) {
            field4972 = null;
            field4976 = null;
            field4965 = null;
            field4973 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V", line = 213)
    public static final void method2089(byte arg0) {
        field4962++;
        int var1 = 0;
        int var2 = 0;
        int var3 = -68 / ((arg0 + 66) / 49);
        while (var2 < 104) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class104.method709(var2, var1, 999999, class203.field3382, true, var4)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V", line = 258)
    public static final void method2090(int arg0, byte arg1) {
        field4975++;
        if (arg1 != -15) {
            method2089((byte) -12);
        }
        class296.field5035.method794(-17435, arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V", line = 277)
    public static final void method2091(int arg0) {
        field4971++;
        for (int var1 = 0; var1 < class89.field1428; var1++) {
            int var10002 = class84.field1330[var1]--;
            if (class84.field1330[var1] >= -10) {
                class289 var2 = class250.field4187[var1];
                if (var2 == null) {
                    var2 = class289.method2083(class313.field5333, class322.field5503[var1], 0);
                    if (var2 == null) {
                        continue;
                    }
                    class84.field1330[var1] += var2.method2080();
                    class250.field4187[var1] = var2;
                }
                if (class84.field1330[var1] < 0) {
                    int var9;
                    if (class40.field699[var1] == 0) {
                        var9 = class100.field1621;
                    } else {
                        int var3 = (class40.field699[var1] & 0xFF) * 128;
                        int var4 = class40.field699[var1] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - class102.field1639.field5409;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = class40.field699[var1] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - class102.field1639.field5380;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var3 < var8) {
                            class84.field1330[var1] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = (var3 - var8) * class236.field3936 / var3;
                    }
                    if (var9 > 0) {
                        class253 var10 = var2.method2082().method1847(class47.field889);
                        class149 var11 = class149.method1159(var10, 100, var9);
                        var11.method1153(class174.field2918[var1] - 1);
                        class82.field1315.method1329(var11);
                    }
                    class84.field1330[var1] = -100;
                }
            } else {
                class89.field1428--;
                for (int var12 = var1; var12 < class89.field1428; var12++) {
                    class322.field5503[var12] = class322.field5503[var12 + 1];
                    class250.field4187[var12] = class250.field4187[var12 + 1];
                    class174.field2918[var12] = class174.field2918[var12 + 1];
                    class84.field1330[var12] = class84.field1330[var12 + 1];
                    class40.field699[var12] = class40.field699[var12 + 1];
                }
                var1--;
            }
        }
        int var13 = -115 % ((29 - arg0) / 57);
        if (class85.field1357 && !class151.method1193(122)) {
            if (class27.field479 != 0 && class174.field2910 != -1) {
                class212.method1588(class116.field1865, 0, class27.field479, true, false, class174.field2910);
            }
            class85.field1357 = false;
        } else if (class27.field479 != 0 && class174.field2910 != -1 && !class151.method1193(73)) {
            class276.field4732++;
            class47.field820.method1656(255, 16);
            class47.field820.method387(class174.field2910, 76);
            class174.field2910 = -1;
        }
    }
}
