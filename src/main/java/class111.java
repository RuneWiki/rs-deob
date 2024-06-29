import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class111 extends class110 {

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "[Lva;")
    public class137[] field2681;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Lmb;")
    public static class84 field2671 = class79.method672(true, "k");

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lmb;")
    public static class84 field2672 = class79.method672(true, "headicons_pk");

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lmb;")
    public static class84 field2677 = class79.method672(true, "Fps:");

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Lmb;")
    public static class84 field2675 = class79.method672(true, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "[Lba;")
    public static class9[] field2676 = new class9[50];

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lmb;")
    public static class84 field2680 = class79.method672(true, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "Lmb;")
    public static class84 field2670 = class79.method672(true, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Z")
    public static boolean field2683 = false;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V")
    public static final void method900(byte arg0) {
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class143.field3448[(var1 - 2 << 7) + var2] = 255;
            }
        }
        field2679++;
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 124.0D) + 2;
            int var15 = (int) (Math.random() * 128.0D) + 128;
            int var16 = (var15 << 7) + var14;
            class143.field3448[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class119.field2866[var13] = (class143.field3448[var13 + 1] + class143.field3448[var13 - 1] + class143.field3448[var13 - -128] + class143.field3448[var13 - 128]) / 4;
            }
        }
        class134.field3211 += 128;
        if (class46.field995.length < class134.field3211) {
            class134.field3211 -= class46.field995.length;
            int var5 = (int) (Math.random() * 12.0D);
            class91.method773(false, class49.field1056[var5]);
        }
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class119.field2866[var10 + 128] - class46.field995[class134.field3211 + var10 & class46.field995.length + -1] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class143.field3448[var10] = var11;
            }
        }
        if (arg0 > -66) {
            return;
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class108.field2602[var7] = class108.field2602[var7 + 1];
        }
        class108.field2602[var1 - 1] = (int) (Math.sin((double) class5.field100 / 14.0D) * 16.0D + Math.sin((double) class5.field100 / 15.0D) * 14.0D + Math.sin((double) class5.field100 / 16.0D) * 12.0D);
        if (class115.field2760 > 0) {
            class115.field2760 -= 4;
        }
        if (class76.field1906 > 0) {
            class76.field1906 -= 4;
        }
        if (class76.field1906 != 0 || class115.field2760 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 0) {
            class76.field1906 = 1024;
        }
        if (var8 == 1) {
            class115.field2760 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Z")
    public final boolean method901(byte arg0, int arg1) {
        if (arg0 <= 126) {
            return true;
        } else {
            field2673++;
            return this.field2681[arg1].field3318;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I")
    public static final int method902(int arg0, int arg1, int arg2) {
        field2678++;
        if (arg0 >= -98) {
            method900((byte) -10);
        }
        long var3 = (long) ((arg1 << 16) + arg2);
        return class128.field3093 != null && class128.field3093.field370 == var3 ? class125.field3034.field1128 * 99 / (class125.field3034.field1084.length - class128.field3093.field2381) + 1 : 0;
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)V")
    public static void method903(int arg0) {
        field2676 = null;
        field2677 = null;
        field2680 = null;
        field2672 = null;
        field2675 = null;
        field2670 = null;
        field2671 = null;
        if (arg0 < 114) {
            method902(-113, 83, 122);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lia;ZI)I")
    public static final int method904(class57 arg0, boolean arg1, int arg2) {
        field2682++;
        if (!arg1) {
            return -102;
        } else if (arg0.field1404 == null || arg2 >= arg0.field1404.length) {
            return -2;
        } else {
            try {
                int[] var3 = arg0.field1404[arg2];
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
                    if (var7 == 15) {
                        var9 = 1;
                    }
                    if (var7 == 1) {
                        var8 = class30.field709[var3[var5++]];
                    }
                    if (var7 == 16) {
                        var9 = 2;
                    }
                    if (var7 == 2) {
                        var8 = class72.field1769[var3[var5++]];
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 3) {
                        var8 = class66.field1625[var3[var5++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class57 var12 = class97.method805(-894550512, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class98.method813(-1, var13).field250 || class84.field2108)) {
                            for (int var14 = 0; var14 < var12.field1349.length; var14++) {
                                if (var13 + 1 == var12.field1349[var14]) {
                                    var8 += var12.field1394[var14];
                                }
                            }
                        }
                    }
                    if (var7 == 5) {
                        var8 = class141.field3416[var3[var5++]];
                    }
                    if (var7 == 6) {
                        var8 = class107.field2594[class72.field1769[var3[var5++]] - 1];
                    }
                    if (var7 == 7) {
                        var8 = class141.field3416[var3[var5++]] * 100 / 46875;
                    }
                    if (var7 == 8) {
                        var8 = class40.field925.field1517;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; var15 < 25; var15++) {
                            if (class43.field947[var15]) {
                                var8 += class72.field1769[var15];
                            }
                        }
                    }
                    if (var7 == 10) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class57 var18 = class97.method805(-894550512, var17);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class98.method813(-1, var19).field250 || class84.field2108)) {
                            for (int var20 = 0; var20 < var18.field1349.length; var20++) {
                                if (var19 + 1 == var18.field1349[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var7 == 11) {
                        var8 = class62.field1550;
                    }
                    if (var7 == 12) {
                        var8 = class74.field1802;
                    }
                    if (var7 == 13) {
                        int var21 = class141.field3416[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var5++];
                        var8 = class136.method1103(-120, var23);
                    }
                    if (var7 == 18) {
                        var8 = (class40.field925.field3549 >> 7) + class95.field2359;
                    }
                    if (var7 == 19) {
                        var8 = (class40.field925.field3535 >> 7) + class10.field159;
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

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)Lte;")
    public static final class129 method905(int arg0, int arg1) {
        class129 var2 = (class129) class120.field2871.method970(arg1 - 27058, (long) arg0);
        field2674++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class19.field404.method986(arg0, 5, (byte) 67);
        class129 var4 = new class129();
        if (arg1 != -1) {
            return null;
        }
        if (var3 != null) {
            var4.method1053(new class51(var3), (byte) -108);
        }
        class120.field2871.method965(var4, arg1 + 209, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lsd;Lsd;IZ)V")
    public class111(class122 arg0, class122 arg1, int arg2, boolean arg3) {
        class16 var5 = new class16();
        int var6 = arg0.method989(arg2, 32);
        this.field2681 = new class137[var6];
        int[] var7 = arg0.method1007(arg2, 0);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method986(var7[var8], arg2, (byte) 67);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class127 var11 = null;
            for (class127 var12 = (class127) var5.method104((byte) 101); var12 != null; var12 = (class127) var5.method107(-2)) {
                if (var12.field3074 == var10) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1000((byte) -92, var10, 0);
                } else {
                    var13 = arg1.method1000((byte) -102, 0, var10);
                }
                var11 = new class127(var10, var13);
                var5.method108(var11, -21);
            }
            this.field2681[var7[var8]] = new class137(var9, var11);
        }
    }
}
