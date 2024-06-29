import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "Loa;")
    public static class98 field2447 = class38.method349(255, "gr-Un:");

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Loa;")
    public static class98 field2450 = class38.method349(255, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2451 = -1;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Loa;")
    public static class98 field2441 = class38.method349(255, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Loa;")
    public static class98 field2452 = class38.method349(255, "M");

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "Loa;")
    public static class98 field2454 = class38.method349(255, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1");

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Loa;")
    public static class98 field2455 = class38.method349(255, "@cya@");

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public int field2443;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field2448;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Ltb;")
    public static class130 field2445;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZIII[Lwc;II[BI)V")
    public static final void method896(int arg0, boolean arg1, int arg2, int arg3, int arg4, class149[] arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        field2449++;
        for (int var10 = 0; var10 < 8; var10++) {
            for (int var15 = 0; var15 < 8; var15++) {
                if (arg6 + var10 > 0 && arg6 + var10 < 103 && arg0 + var15 > 0 && arg0 + var15 < 103) {
                    arg5[arg9].field3675[arg6 + var10][arg0 + var15] = class150.method1211(arg5[arg9].field3675[arg6 + var10][arg0 + var15], -16777217);
                }
            }
        }
        class8 var11 = new class8(arg8);
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 == var12 && arg4 <= var13 && arg4 + 8 > var13 && var14 >= arg7 && var14 < arg7 + 8) {
                        class48.method408(-116, class14.method151((byte) 85, var14 & 0x7, var13 & 0x7, arg2) + arg6, var11, arg9, arg2, 0, class71.method572(arg2, var14 & 0x7, var13 & 0x7, false) + arg0, 0);
                    } else {
                        class48.method408(-24, -1, var11, 0, 0, 0, -1, 0);
                    }
                }
            }
        }
        if (arg1) {
            field2450 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static void method897(byte arg0) {
        field2450 = null;
        int var1 = -27 % ((-arg0 - 61) / 57);
        field2447 = null;
        field2445 = null;
        field2455 = null;
        field2441 = null;
        field2454 = null;
        field2452 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILtd;I)I")
    public static final int method898(int arg0, class132 arg1, int arg2) {
        field2446++;
        if (arg1.field3124 == null || arg2 >= arg1.field3124.length) {
            return -2;
        }
        try {
            int var3 = 0;
            int[] var4 = arg1.field3124[arg2];
            byte var5 = 0;
            if (arg0 >= -41) {
                method897((byte) 126);
            }
            int var6 = 0;
            while (true) {
                int var7 = var4[var3++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var6;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 1) {
                    var9 = class112.field2520[var4[var3++]];
                }
                if (var7 == 2) {
                    var9 = class126.field2816[var4[var3++]];
                }
                if (var7 == 3) {
                    var9 = class134.field3263[var4[var3++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var3++] << 16;
                    int var11 = var10 + var4[var3++];
                    class132 var12 = class117.method932(var11, (byte) -116);
                    int var13 = var4[var3++];
                    if (var13 != -1 && (!class15.method152(30, var13).field1565 || class4.field57)) {
                        for (int var14 = 0; var14 < var12.field3149.length; var14++) {
                            if (var13 + 1 == var12.field3149[var14]) {
                                var9 += var12.field3128[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class137.field3362[var4[var3++]];
                }
                if (var7 == 6) {
                    var9 = class8.field157[class126.field2816[var4[var3++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class137.field3362[var4[var3++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class73.field1536.field1204;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class51.field1121[var15]) {
                            var9 += class126.field2816[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var3++] << 16;
                    int var17 = var16 + var4[var3++];
                    class132 var18 = class117.method932(var17, (byte) -116);
                    int var19 = var4[var3++];
                    if (var19 != -1 && (!class15.method152(30, var19).field1565 || class4.field57)) {
                        for (int var20 = 0; var20 < var18.field3149.length; var20++) {
                            if (var19 + 1 == var18.field3149[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class55.field1218;
                }
                if (var7 == 12) {
                    var9 = class38.field939;
                }
                if (var7 == 13) {
                    int var21 = class137.field3362[var4[var3++]];
                    int var22 = var4[var3++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var3++];
                    var9 = class90.method731((byte) 116, var23);
                }
                if (var7 == 18) {
                    var9 = (class73.field1536.field3657 >> 7) + class21.field470;
                }
                if (var7 == 19) {
                    var9 = (class73.field1536.field3667 >> 7) + class71.field1479;
                }
                if (var7 == 20) {
                    var9 = var4[var3++];
                }
                if (var8 == 0) {
                    if (var5 == 0) {
                        var6 += var9;
                    }
                    if (var5 == 1) {
                        var6 -= var9;
                    }
                    if (var5 == 2 && var9 != 0) {
                        var6 /= var9;
                    }
                    if (var5 == 3) {
                        var6 *= var9;
                    }
                    var5 = 0;
                } else {
                    var5 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
