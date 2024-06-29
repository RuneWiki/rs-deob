import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class25 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "Ldk;")
    public static class435 field453 = new class435(1);

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lhh;ZB)V")
    public static final void method291(class109 arg0, boolean arg1, byte arg2) {
        field454++;
        if (class210.field2958 >= 400) {
            return;
        }
        class593 var3 = arg0.field1669;
        if (var3.field8532 != null) {
            var3 = var3.method3516(class189.field2681, 102);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field8541) {
            return;
        }
        String var4 = var3.field8527;
        if (arg2 != -44) {
            return;
        }
        if (var3.field8586 != 0) {
            String var5 = class37.field767 == class163.field2363 ? class124.field2028.method739(class173.field2491, 116) : class171.field2471.method739(class173.field2491, -62);
            var4 = var4 + class633.method3676(true, var3.field8586, class645.field9372.field2632) + " (" + var5 + var3.field8586 + ")";
        }
        if (!class493.field6904) {
            if (!arg1) {
                String[] var7 = var3.field8564;
                if (class194.field2757) {
                    var7 = class65.method547(var7, false);
                }
                if (var7 != null) {
                    for (int var8 = 4; var8 >= 0; var8--) {
                        if (var7[var8] != null && (var3.field8589 == 0 || !var7[var8].equalsIgnoreCase(class642.field9324.method739(class173.field2491, -76)))) {
                            byte var9 = 0;
                            int var10 = class212.field2998;
                            if (var8 == 0) {
                                var9 = 23;
                            }
                            if (var8 == 1) {
                                var9 = 13;
                            }
                            if (var8 == 2) {
                                var9 = 16;
                            }
                            if (var8 == 3) {
                                var9 = 12;
                            }
                            if (var8 == 4) {
                                var9 = 30;
                            }
                            if (var3.field8544 == var8) {
                                var10 = var3.field8574;
                            }
                            if (var3.field8572 == var8) {
                                var10 = var3.field8592;
                            }
                            class187.field2622++;
                            class404.method2410("<col=ffff00>" + var4, 0, (byte) -120, 0, var9, -1, true, (long) arg0.field607, var7[var8], var7[var8].equalsIgnoreCase(class642.field9324.method739(class173.field2491, arg2 ^ 0xFFFFFF93)) ? var3.field8594 : var10, false);
                        }
                    }
                }
                if (var3.field8589 == 1 && var7 != null) {
                    for (int var11 = 4; var11 >= 0; var11--) {
                        if (var7[var11] != null && var7[var11].equalsIgnoreCase(class642.field9324.method739(class173.field2491, arg2 ^ 0xFFFFFFB1))) {
                            short var12 = 0;
                            if (class645.field9372.field2632 < var3.field8586) {
                                var12 = 2000;
                            }
                            short var13 = 0;
                            if (var11 == 0) {
                                var13 = 23;
                            }
                            if (var11 == 1) {
                                var13 = 13;
                            }
                            if (var11 == 2) {
                                var13 = 16;
                            }
                            if (var11 == 3) {
                                var13 = 12;
                            }
                            if (var11 == 4) {
                                var13 = 30;
                            }
                            if (var13 != 0) {
                                var13 += var12;
                            }
                            class259.field3604++;
                            class404.method2410("<col=ffff00>" + var4, 0, (byte) -120, 0, var13, -1, true, (long) arg0.field607, var7[var11], var3.field8594, false);
                        }
                    }
                }
            }
            class404.method2410("<col=ffff00>" + var4, 0, (byte) -120, 0, 1010, -1, true, (long) arg0.field607, class64.field1094.method739(class173.field2491, 70), class68.field1149, arg1);
            class478.field6746++;
        } else if (!arg1) {
            class22 var6 = class328.field4396 == -1 ? null : class533.field7455.method3115(128, class328.field4396);
            if ((class226.field3238 & 0x2) != 0) {
                if (var6 == null || var3.method3513(var6.field323, (byte) 116, class328.field4396) != var6.field323) {
                    class404.method2410(class494.field6922 + " -> <col=ffff00>" + var4, 0, (byte) -120, 0, 21, -1, true, (long) arg0.field607, class412.field5799, class65.field1111, false);
                    class543.field7550++;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)V")
    public static void method292(byte arg0) {
        if (arg0 != -2) {
            method291(null, true, (byte) -106);
        }
        field453 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lvs;IIIII)V")
    public static final void method293(class508 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7093 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field7100[var6] != null) {
                arg0.field7093++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field7093; var7++) {
            long var8 = class217.field3091[arg1][arg2][arg3];
            while (var8 != 0L) {
                class579 var14 = class363.field4863[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field7100[var7] == var14.field7959) {
                    continue label50;
                }
            }
            long var10 = class217.field3091[arg1][arg4][arg5];
            while (var10 != 0L) {
                class579 var13 = class363.field4863[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field7100[var7] == var13.field7959) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field7093 - 1; var12++) {
                arg0.field7100[var12] = arg0.field7100[var12 + 1];
            }
            arg0.field7093--;
        }
    }

    static {
        new class104("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
    }
}
