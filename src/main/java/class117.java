import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class117 {

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Lap;")
    public static class335 field1579 = new class335("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[I")
    public static int[] field1581;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1582;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([[BBLft;)V")
    public static final void method842(byte[][] arg0, byte arg1, class4 arg2) {
        for (int var3 = 0; var3 < arg2.field959; var3++) {
            class139.method946(91);
            for (int var4 = 0; var4 < (class452.field6526 >> 3); var4++) {
                for (int var5 = 0; var5 < (class440.field6307 >> 3); var5++) {
                    int var6 = class225.field2867[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3690A18) >> 24;
                        if (!arg2.field978 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class79.field1025.length; var12++) {
                                if (class79.field1025[var12] == var11 && arg0[var12] != null) {
                                    arg2.method17((var10 & 0x7) * 8, (var9 & 0x7) * 8, class172.field2185, (byte) 80, class33.field416, var8, var7, arg0[var12], var4 * 8, var5 * 8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 > -17) {
            field1579 = null;
        }
        field1577++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z")
    public abstract boolean method194(byte arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method843(String arg0, byte arg1) {
        int var2 = -124 % ((18 - arg1) / 52);
        field1578++;
        if (arg0 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < class280.field3555; var3++) {
            if (arg0.equalsIgnoreCase(class329.field4163[var3])) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public abstract void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILis;IIIIIIIII)Z")
    public static final boolean method844(int arg0, class348 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1576++;
        int var11 = arg3;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        if (arg4 != -2) {
            method842(null, (byte) -29, null);
        }
        class203.field2644[var13][var14] = 99;
        int var16 = arg6 - var14;
        class315.field4018[var13][var14] = 0;
        byte var17 = 0;
        class448.field6412[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class85.field1069[var10001] = arg6;
        int[][] var19 = arg1.field4465;
        while (var26 != var18) {
            var11 = class448.field6412[var18];
            var12 = class85.field1069[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg1.field4478;
            int var23 = var12 - arg1.field4464;
            if (arg7 == -4) {
                if (arg0 == var11 && arg2 == var12) {
                    class531.field7812 = var11;
                    class391.field5262 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class265.method1573(2, var12, (byte) 42, var11, arg5, arg2, arg10, 2, arg0)) {
                    class391.field5262 = var12;
                    class531.field7812 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg1.method1994(arg10, (byte) 116, var12, 2, arg5, arg0, arg2, arg8, 2, var11)) {
                    class531.field7812 = var11;
                    class391.field5262 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg1.method1997(var11, 1, 2, arg8, arg5, arg10, var12, arg0, arg2)) {
                    class531.field7812 = var11;
                    class391.field5262 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg1.method2001(arg0, arg9, arg2, arg7, var12, -1, 2, var11)) {
                    class531.field7812 = var11;
                    class391.field5262 = var12;
                    return true;
                }
            } else if (arg1.method1987(2, var12, var11, arg0, arg9, arg7, -125, arg2)) {
                class391.field5262 = var12;
                class531.field7812 = var11;
                return true;
            }
            int var25 = class315.field4018[var20][var21] + 1;
            if (var20 > 0 && class203.field2644[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12;
                class203.field2644[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class203.field2644[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12;
                class203.field2644[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class203.field2644[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class448.field6412[var26] = var11;
                class85.field1069[var26] = var12 - 1;
                class203.field2644[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class203.field2644[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class448.field6412[var26] = var11;
                class85.field1069[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var20][var21 + 1] = 4;
                class315.field4018[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class203.field2644[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var20 - 1][var21 - 1] = 3;
                class315.field4018[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class203.field2644[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class203.field2644[var20 + 1][var21 - 1] = 9;
                class315.field4018[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class203.field2644[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class448.field6412[var26] = var11 - 1;
                class85.field1069[var26] = var12 + 1;
                class203.field2644[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class203.field2644[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class448.field6412[var26] = var11 + 1;
                class85.field1069[var26] = var12 + 1;
                class203.field2644[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class315.field4018[var20 + 1][var21 + 1] = var25;
            }
        }
        class531.field7812 = var11;
        class391.field5262 = var12;
        return false;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lya;I)V")
    public abstract void method192(class38 arg0, int arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILya;II)Z")
    public abstract boolean method186(int arg0, class38 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public abstract void method180(byte arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLya;)Llo;")
    public abstract class531 method181(boolean arg0, class38 arg1);

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public static void method845(boolean arg0) {
        field1579 = null;
        if (arg0) {
            field1581 = null;
        }
        field1582 = null;
        field1581 = null;
    }

    static {
        new class335("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
        field1581 = new int[100];
        field1582 = new CRC32();
    }
}
