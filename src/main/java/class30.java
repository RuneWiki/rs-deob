import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class30 {

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Ljava/lang/String;")
    public static String field393 = null;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([JII[Ljava/lang/Object;I)V")
    public static final void method155(long[] arg0, int arg1, int arg2, Object[] arg3, int arg4) {
        field391++;
        if (arg4 != 1) {
            method159(null, true, (byte) -126);
        }
        if (arg2 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var7;
        Object var9 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg2; var11++) {
            if ((long) (var11 & var10) + var7 > arg0[var11]) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                Object var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg0[arg2] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var9;
        method155(arg0, arg1, var6 - 1, arg3, 1);
        method155(arg0, var6 + 1, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method156(byte arg0) {
        field393 = null;
        if (arg0 <= 73) {
            field393 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILha;Ljava/lang/String;)I")
    public static final int method157(int arg0, class40 arg1, String arg2) {
        field387++;
        int var3 = -36 / ((arg0 - 15) / 45);
        int var4 = arg1.field585;
        byte[] var5 = class247.method1492((byte) -68, arg2);
        arg1.method279(var5.length, 115);
        arg1.field585 += class437.field6434.method126(14298, arg1.field536, 0, var5, arg1.field585, var5.length);
        return arg1.field585 - var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public static final void method158(int arg0, int arg1) {
        if (arg1 != 45) {
            field394 = -47;
        }
        field389++;
        class64 var2 = class230.method1387(arg0, (byte) 40, 1);
        var2.method446(arg1 ^ 0xFFFFB192);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Luj;ZB)V")
    public static final void method159(class249 arg0, boolean arg1, byte arg2) {
        field388++;
        if (class330.field4948 >= 400) {
            return;
        }
        class245 var3 = arg0.field3819;
        if (arg2 < 96) {
            method159(null, true, (byte) -18);
        }
        if (var3.field3703 != null) {
            var3 = var3.method1477(class273.field4144, -12819);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field3694) {
            return;
        }
        String var4 = var3.field3683;
        if (var3.field3704 != 0) {
            String var5 = class64.field1064 == class298.field4512 ? class414.field6002.method2473(class406.field5898, -103) : class178.field2789.method2473(class406.field5898, -96);
            var4 = var4 + class448.method2677(var3.field3704, class286.field4329.field672, (byte) 101) + " (" + var5 + var3.field3704 + ")";
        }
        if (!class306.field4636) {
            if (!arg1) {
                String[] var7 = var3.field3724;
                if (class217.field3344) {
                    var7 = class433.method2534(var7, true);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (class329.field4936 != class298.field4512 || !var7[var8].equalsIgnoreCase(class484.field7394.method2473(class406.field5898, -112)))) {
                            byte var9 = 0;
                            if (var8 == 0) {
                                var9 = 30;
                            }
                            int var10 = class76.field1372;
                            if (var8 == 1) {
                                var9 = 44;
                            }
                            if (var8 == 2) {
                                var9 = 10;
                            }
                            if (var8 == 3) {
                                var9 = 22;
                            }
                            if (var3.field3734 == var8) {
                                var10 = var3.field3674;
                            }
                            if (var8 == 4) {
                                var9 = 45;
                            }
                            if (var3.field3717 == var8) {
                                var10 = var3.field3721;
                            }
                            class59.field1003++;
                            class221.method1345("<col=ffff00>" + var4, var9, 0, 0, var10, true, var7[var8], -1, (byte) -121, (long) arg0.field2197, false);
                        }
                    }
                }
                if (class329.field4936 == class298.field4512 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class484.field7394.method2473(class406.field5898, -85))) {
                            short var12 = 0;
                            if (var3.field3704 > class286.field4329.field672) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 30;
                            }
                            if (var11 == 1) {
                                var13 = 44;
                            }
                            if (var11 == 2) {
                                var13 = 10;
                            }
                            if (var11 == 3) {
                                var13 = 22;
                            }
                            if (var11 == 4) {
                                var13 = 45;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class219.field3369++;
                            class221.method1345("<col=ffff00>" + var4, var13, 0, 0, var3.field3735, true, var7[var11], -1, (byte) -121, (long) arg0.field2197, false);
                        }
                    }
                }
            }
            class221.method1345("<col=ffff00>" + var4, 1011, 0, 0, class286.field4324, true, class478.field7306.method2473(class406.field5898, -85), -1, (byte) -121, (long) arg0.field2197, arg1);
            client.field3000++;
        } else if (!arg1) {
            class85 var6 = class392.field5739 == -1 ? null : class76.field1364.method1267((byte) 41, class392.field5739);
            if ((class331.field4966 & 0x2) != 0) {
                if (var6 == null || var3.method1480((byte) -111, class392.field5739, var6.field1423) != var6.field1423) {
                    class70.field1225++;
                    class221.method1345(class200.field3175 + " -> <col=ffff00>" + var4, 5, 0, 0, class217.field3347, true, class28.field357, -1, (byte) -121, (long) arg0.field2197, false);
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method160(int arg0) {
        for (int var1 = arg0; var1 < class352.field5175; var1++) {
            int var2 = class437.field6440[var1];
            class249 var3 = class195.field3085[var2];
            if (var3 != null) {
                class289.method1764(var3, 22, var3.field3819.field3707);
            }
        }
        field392++;
    }

    static {
        new class423("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field394 = 0;
        field395 = 0;
    }
}
