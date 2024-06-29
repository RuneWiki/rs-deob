import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 {

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public static int field3318 = 0;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3313 = new CRC32();

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[I")
    public static int[] field3324 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "Lod;")
    public static class101 field3322 = class46.method335(71, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Lod;")
    public static class101 field3321 = class46.method335(-110, "scrollbar");

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lod;")
    public static class101 field3326 = class46.method335(-91, "va");

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public static int field3323 = 0;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lod;")
    public static class101 field3328 = class46.method335(-105, "<col=00ff80>");

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lod;")
    private static class101 field3325 = class46.method335(94, "Cancel");

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lod;")
    public static class101 field3327 = field3325;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "Lh;")
    public class49 field3308;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Lh;")
    public class49 field3310;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "Lh;")
    public class49 field3314;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[[[B")
    public static byte[][][] field3329;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBLsa;)I")
    public static final int method1145(int arg0, byte arg1, class126 arg2) {
        field3309++;
        if (arg2.field2851 == null || arg0 >= arg2.field2851.length) {
            return -2;
        } else if (arg1 >= -77) {
            return 93;
        } else {
            try {
                int[] var3 = arg2.field2851[arg0];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (var7 == 0) {
                        return var4;
                    }
                    if (var7 == 1) {
                        var8 = class121.field2666[var3[var5++]];
                    }
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (var7 == 2) {
                        var8 = class46.field1092[var3[var5++]];
                    }
                    if (var7 == 3) {
                        var8 = class8.field134[var3[var5++]];
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class126 var12 = class78.method532(0, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class137.method1045((byte) -117, var13).field3558 || class32.field821)) {
                            for (int var14 = 0; var14 < var12.field2841.length; var14++) {
                                if (var13 + 1 == var12.field2841[var14]) {
                                    var8 += var12.field2838[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 5) {
                        var8 = class63.field1388[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class106.field2283[class46.field1092[var3[var5++]] - 1];
                    }
                    if (var7 == 7) {
                        var8 = class63.field1388[var3[var5++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class82.field1778.field265;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; var15 < 25; var15++) {
                            if (class85.field1885[var15]) {
                                var8 += class46.field1092[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class126 var18 = class78.method532(0, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class137.method1045((byte) -43, var19).field3558 || class32.field821)) {
                            for (int var20 = 0; var20 < var18.field2841.length; var20++) {
                                if (var19 + 1 == var18.field2841[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var7 == 11) {
                        var8 = class28.field750;
                    }
                    if (var7 == 12) {
                        var8 = class133.field3050;
                    }
                    if (var7 == 13) {
                        int var21 = class63.field1388[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var5++];
                        var8 = class73.method510(126, var23);
                    }
                    if (var7 == 18) {
                        var8 = (class82.field1778.field1341 >> 7) + class56.field1260;
                    }
                    if (var7 == 19) {
                        var8 = (class82.field1778.field1298 >> 7) + class75.field1597;
                    }
                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }
                    if (var9 == 0) {
                        if (var6 == 0) {
                            var4 += var8;
                        }
                        if (var6 == 1) {
                            var4 -= var8;
                        }
                        if (var6 == 2 && var8 != 0) {
                            var4 /= var8;
                        }
                        if (var6 == 3) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method1146(int arg0) {
        field3321 = null;
        field3325 = null;
        if (arg0 != 999999999) {
            return;
        }
        field3329 = null;
        field3326 = null;
        field3324 = null;
        field3327 = null;
        field3313 = null;
        field3322 = null;
        field3328 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIB)V")
    public static final void method1147(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 105 % ((68 - arg3) / 33);
        field3312++;
        class126 var5 = class63.method434(arg1, arg2, 258);
        if (var5 != null && var5.field2816 != null) {
            class141 var6 = new class141();
            var6.field3247 = var5.field2816;
            var6.field3238 = var5;
            class31.method237((byte) -71, var6);
        }
        class50.field1168 = arg1;
        class135.field3095 = arg0;
        class56.field1257 = arg2;
        class106.field2292 = true;
        class40.method300(false, var5);
    }
}
