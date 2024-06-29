import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class264 extends class261 {

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "Ljava/lang/String;")
    public String field4028;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "[I")
    public static int[] field4031 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Los;")
    public static class309 field4029 = new class309("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lfj;")
    public static class470 field4032;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IILjv;IIILza;ZLe;IIIIII)Le;")
    public static final class374 method1688(int arg0, int arg1, class57 arg2, int arg3, int arg4, int arg5, class288 arg6, boolean arg7, class374 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field4030++;
        if (arg8 == null) {
            return null;
        }
        if (arg7) {
            field4029 = null;
        }
        int var15 = 2055;
        if (arg2 != null) {
            int var16 = var15 | arg2.method518(arg12, 106, -1, false);
            var15 = var16 & 0xFFFFFDFF;
        }
        long var17 = ((long) arg10 << 48) + (long) ((arg1 << 24) + arg3 + (arg0 << 16)) + ((long) arg13 << 32);
        class399 var19 = class262.field4002;
        class374 var20;
        synchronized (class262.field4002) {
            var20 = (class374) class262.field4002.method2478(1, var17);
        }
        if (var20 == null || arg6.method394(var20.method768(), var15) != 0) {
            if (var20 != null) {
                var15 = arg6.method271(var15, var20.method768());
            }
            byte var21;
            if (arg3 == 1) {
                var21 = 9;
            } else if (arg3 == 2) {
                var21 = 12;
            } else if (arg3 == 3) {
                var21 = 15;
            } else if (arg3 == 4) {
                var21 = 18;
            } else {
                var21 = 21;
            }
            byte var22 = 3;
            int[] var23 = new int[] { 64, 96, 128 };
            class528 var24 = new class528(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
            int var25 = var24.method3128(0, 0, (byte) 77, 0);
            int[][] var26 = new int[var22][var21];
            for (int var27 = 0; var27 < var22; var27++) {
                int var28 = var23[var27];
                int var29 = var23[var27];
                for (int var30 = 0; var30 < var21; var30++) {
                    int var31 = (var30 << 14) / var21;
                    int var32 = class407.field6169[var31] * var28 >> 15;
                    int var33 = class407.field6168[var31] * var29 >> 15;
                    var26[var27][var30] = var24.method3128(var32, var33, (byte) 77, 0);
                }
            }
            for (int var34 = 0; var34 < var22; var34++) {
                int var35 = (var34 * 256 + 128) / var22;
                int var36 = 256 - var35;
                byte var37 = (byte) (arg0 * var36 + arg1 * var35 >> 8);
                short var38 = (short) (((arg10 & 0x7F) * var35 + (arg13 & 0x7F) * var36 & 0x7F00) + ((arg10 & 0x380) * var35 + (arg13 & 0x380) * var36 & 0x38000) + ((arg10 & 0xFC00) * var35 + (arg13 & 0xFC00) * var36 & 0xFC0000) >> 8);
                for (int var39 = 0; var39 < var21; var39++) {
                    if (var34 == 0) {
                        var24.method3129((byte) -1, (short) -1, var26[0][(var39 + 1) % var21], var37, (byte) 1, (byte) -111, var26[0][var39], var25, var38);
                    } else {
                        var24.method3129((byte) -1, (short) -1, var26[var34 - 1][(var39 + 1) % var21], var37, (byte) 1, (byte) -104, var26[var34][(var39 + 1) % var21], var26[var34 - 1][var39], var38);
                        var24.method3129((byte) -1, (short) -1, var26[var34][(var39 + 1) % var21], var37, (byte) 1, (byte) -96, var26[var34][var39], var26[var34 - 1][var39], var38);
                    }
                }
            }
            var20 = arg6.method297(var24, var15, class198.field3192, 64, 768);
            class399 var40 = class262.field4002;
            synchronized (class262.field4002) {
                class262.field4002.method2472(-86, var20, var17);
            }
        }
        int var41 = (arg3 << 6) - 1;
        int var42 = -var41;
        int var43 = -var41;
        int var44 = var41;
        int var45 = var41;
        if (arg11 != 0) {
            if ((arg11 & 0x8) != 0) {
                var42 -= 128;
            }
            if ((arg11 & 0x4) != 0) {
                var44 = var41 + 128;
            }
            if ((arg11 & 0x1) != 0) {
                var45 = var41 + 128;
            }
            if ((arg11 & 0x2) != 0) {
                var43 -= 128;
            }
        }
        int var46 = arg8.method750();
        int var47 = arg8.method716();
        int var48 = arg8.method728();
        int var49 = arg8.method751();
        if (var48 < var43) {
            var48 = var43;
        }
        if (var42 > var46) {
            var46 = var42;
        }
        if (var47 > var44) {
            var47 = var44;
        }
        if (var45 < var49) {
            var49 = var45;
        }
        class119 var50 = null;
        if (arg2 != null) {
            int var51 = arg2.field1202[arg12];
            var50 = class422.field6355.method240(var51 >> 16, 31706);
            arg12 = var51 & 0xFFFF;
        }
        class374 var52;
        if (var50 == null) {
            var52 = var20.method746((byte) 3, var15, true);
            var52.method738(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method730(var46 + var47 >> 1, 0, var48 + var49 >> 1);
        } else {
            var52 = var20.method746((byte) 3, var15, true);
            var52.method738(var47 - var46 >> 1, 128, var49 - var48 >> 1);
            var52.method730(var46 + var47 >> 1, 0, var48 + var49 >> 1);
            var52.method2295(0, var50, arg12);
        }
        if (arg9 != 0) {
            var52.method725(arg9);
        }
        if (arg4 != 0) {
            var52.method754(arg4);
        }
        if (arg14 != 0) {
            var52.method730(0, arg14, 0);
        }
        return var52;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "()V")
    public class264() {
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class264(String arg0, int arg1) {
        this.field4028 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II[I[II)V")
    public static final void method1689(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 > -91) {
            method1688(114, -37, null, 15, -112, 8, null, false, null, 16, 16, -70, -73, 1, 40);
        }
        if (arg0 < arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg1; var10++) {
                if ((var9 & var10) + var7 > arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg1] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var8;
            method1689(arg0, var6 - 1, arg2, arg3, -113);
            method1689(var6 + 1, arg1, arg2, arg3, -110);
        }
        field4027++;
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public static void method1690(byte arg0) {
        field4029 = null;
        field4032 = null;
        field4031 = null;
        if (arg0 != -73) {
            field4032 = null;
        }
    }
}
