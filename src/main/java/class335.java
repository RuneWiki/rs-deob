import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class335 extends class354 {

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "B")
    public byte field4861 = 5;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "Lgn;")
    public static class475 field4864 = new class475(60, 7);

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public int field4853;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public int field4856;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public int field4857;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public int field4862;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public int field4863;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "Lru;")
    public static class121 field4865;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Z")
    public boolean field4860;

    static {
        new class194("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIIIIIIII)V", line = 6)
    public static final void method2024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4854++;
        if (arg4 < 128 || arg2 < 128 || arg4 > (class362.field5442 * 128 - 256) || (class203.field2813 - 2) * 128 < arg2) {
            class447.field6506[0] = class447.field6506[1] = -1;
            return;
        }
        int var10 = class103.method620(arg1, arg2, (byte) 20, arg4) - arg9;
        class125.field1616.method275(arg5, 0, 0);
        class481.field6937.method837(class125.field1616);
        class481.field6937.method796(arg4, var10, arg2, class447.field6506);
        class125.field1616.method275(-arg5, 0, 0);
        class481.field6937.method837(class125.field1616);
        if (arg6 != 1) {
            field4864 = null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 30)
    public static void method2025(int arg0) {
        if (arg0 != 2) {
            field4865 = null;
        }
        field4865 = null;
        field4864 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqo;IIIIIIIII)Z", line = 43)
    public static final boolean method2026(int arg0, class19 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4855++;
        int var11 = arg3;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        int var16 = arg2 - var14;
        class409.field6004[var13][var14] = 99;
        class379.field5659[var13][var14] = 0;
        if (arg7 >= -24) {
            method2026(55, null, 32, -30, 24, -45, 96, 31, 26, 60, 56);
        }
        byte var17 = 0;
        class501.field7658[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class71.field1051[var10001] = arg2;
        int[][] var19 = arg1.field275;
        while (var26 != var18) {
            var11 = class501.field7658[var18];
            var12 = class71.field1051[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg1.field259;
            int var23 = var12 - arg1.field258;
            if (arg10 == -4) {
                if (arg8 == var11 && arg5 == var12) {
                    class505.field7711 = var11;
                    class488.field7462 = var12;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class222.method1373(arg4, arg5, arg8, var12, 0, 2, var11, arg0, 2)) {
                    class488.field7462 = var12;
                    class505.field7711 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg1.method136(true, var11, arg4, arg0, 2, arg6, var12, arg8, arg5, 2)) {
                    class505.field7711 = var11;
                    class488.field7462 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg1.method128(2, arg8, arg4, arg5, var12, arg0, arg6, (byte) -104, var11)) {
                    class505.field7711 = var11;
                    class488.field7462 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg1.method129(var11, arg9, 2, arg10, arg8, arg5, var12, (byte) -66)) {
                    class505.field7711 = var11;
                    class488.field7462 = var12;
                    return true;
                }
            } else if (arg1.method137((byte) -105, arg10, 2, arg8, arg9, arg5, var12, var11)) {
                class488.field7462 = var12;
                class505.field7711 = var11;
                return true;
            }
            int var25 = class379.field5659[var21][var20] + 1;
            if (var21 > 0 && class409.field6004[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class501.field7658[var26] = var11 - 1;
                class71.field1051[var26] = var12;
                class409.field6004[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class379.field5659[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class409.field6004[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class501.field7658[var26] = var11 + 1;
                class71.field1051[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class409.field6004[var21 + 1][var20] = 8;
                class379.field5659[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class409.field6004[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class501.field7658[var26] = var11;
                class71.field1051[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class409.field6004[var21][var20 - 1] = 1;
                class379.field5659[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class409.field6004[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class501.field7658[var26] = var11;
                class71.field1051[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class409.field6004[var21][var20 + 1] = 4;
                class379.field5659[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class409.field6004[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class501.field7658[var26] = var11 - 1;
                class71.field1051[var26] = var12 - 1;
                class409.field6004[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class379.field5659[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class409.field6004[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class501.field7658[var26] = var11 + 1;
                class71.field1051[var26] = var12 - 1;
                class409.field6004[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class379.field5659[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class409.field6004[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class501.field7658[var26] = var11 - 1;
                class71.field1051[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class409.field6004[var21 - 1][var20 + 1] = 6;
                class379.field5659[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class409.field6004[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class501.field7658[var26] = var11 + 1;
                class71.field1051[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class409.field6004[var21 + 1][var20 + 1] = 12;
                class379.field5659[var21 + 1][var20 + 1] = var25;
            }
        }
        class488.field7462 = var12;
        class505.field7711 = var11;
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lhe;Lhe;ILbk;Lhe;)Z", line = 411)
    public static final boolean method2027(class239 arg0, class239 arg1, int arg2, class242 arg3, class239 arg4) {
        class225.field3173 = arg0;
        class8.field133 = arg3;
        field4858++;
        class234.field3289 = arg1;
        if (arg2 == -15729) {
            class212.field3008 = arg4;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lso;ILmd;II)V", line = 430)
    public static final void method2028(class313 arg0, int arg1, class364 arg2, int arg3, int arg4) {
        field4859++;
        if ((arg4 & 0x2) != 0) {
            int var5 = arg2.method985(arg1 + 20913);
            if (var5 == 65535) {
                var5 = -1;
            }
            arg0.field4222 = var5;
        }
        byte var6 = -1;
        if ((arg4 & 0x200) != 0) {
            int var7 = arg2.method985(arg1 + 21090);
            arg0.field4182 = arg2.method939(49510128);
            arg0.field4233 = arg2.method980(-19443);
            arg0.field4236 = (var7 & 0x8000) != 0;
            arg0.field4188 = var7 & 0x7FFF;
            arg0.field4205 = arg0.field4188 + arg0.field4182 + class263.field3748;
        }
        if ((arg4 & 0x40) != 0) {
            arg0.field4570 = arg2.method955((byte) -122);
            if (arg0.field4277 == 0) {
                arg0.method1775((byte) 60, arg0.field4570);
                arg0.field4570 = -1;
            }
        }
        if ((arg4 & 0x40000) != 0) {
            int var8 = arg2.method980(-19443);
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            for (int var12 = 0; var12 < var8; var12++) {
                int var13 = arg2.method955((byte) -121);
                if (var13 == 65535) {
                    var13 = -1;
                }
                var9[var12] = var13;
                var10[var12] = arg2.method941((byte) 123);
                var11[var12] = arg2.method963(-127);
            }
            class96.method588(var10, -1, arg0, var11, var9);
        }
        if ((arg4 & 0x1000) != 0) {
            int var14 = class263.field3748;
            int var15 = arg2.method953((byte) -40);
            int var16 = arg2.method980(-19443);
            arg0.method1766(arg1 ^ 0xFFFFAE1C, var15, var16, var14);
        }
        if ((arg4 & 0x4000) != 0) {
            var6 = arg2.method994(128);
        }
        if ((arg4 & 0x1) != 0) {
            int var17 = arg2.method993((byte) -55);
            int var18 = arg2.method939(49510128);
            int var19 = arg2.method939(49510128);
            int var20 = arg2.field2018;
            boolean var21 = (var17 & 0x8000) != 0;
            if (arg0.field4592 != null && arg0.field4599 != null) {
                boolean var22 = false;
                if (var18 <= 1) {
                    if (!var21 && !(!class434.field6368 || class110.field1445) || class360.field5350) {
                        var22 = true;
                    } else if (class17.method124(true, arg0.field4592)) {
                        var22 = true;
                    }
                }
                if (!var22 && class226.field3197 == 0) {
                    class482.field6987.field2018 = 0;
                    arg2.method937(1268072645, 0, var19, class482.field6987.field2041);
                    class482.field6987.field2018 = 0;
                    int var23 = -1;
                    String var24;
                    if (var21) {
                        var17 &= 0x7FFF;
                        class138 var25 = class169.method1065(-2, class482.field6987);
                        var23 = var25.field1805;
                        var24 = var25.field1803.method1306(arg1 + 20897, class482.field6987);
                    } else {
                        var24 = class210.method1301((byte) -44, class431.method2561((byte) 120, class482.field6987));
                    }
                    arg0.field4246 = var24.trim();
                    arg0.field4250 = var17 >> 8;
                    arg0.field4184 = 150;
                    arg0.field4186 = var17 & 0xFF;
                    int var26;
                    if (var18 == 1 || var18 == 2) {
                        var26 = var21 ? 17 : 1;
                    } else {
                        var26 = var21 ? 17 : 2;
                    }
                    if (var18 == 2) {
                        class40.method308(var24, -1, null, var26, "<img=1>" + arg0.method1881(-95, false), var23, "<img=1>" + arg0.method1885(28166, true), 0);
                    } else if (var18 == 1) {
                        class40.method308(var24, -1, null, var26, "<img=0>" + arg0.method1881(80, false), var23, "<img=0>" + arg0.method1885(28166, true), 0);
                    } else {
                        class40.method308(var24, arg1 + 20963, null, var26, arg0.method1881(arg1 ^ 0x51D5, false), var23, arg0.method1885(28166, true), 0);
                    }
                }
            }
            arg2.field2018 = var19 + var20;
        }
        if ((arg4 & 0x20000) != 0) {
            arg0.field4244 = arg2.method949(-12754);
            arg0.field4260 = arg2.method949(arg1 ^ 0x6032);
            arg0.field4192 = arg2.method976((byte) 26);
            arg0.field4230 = (byte) arg2.method980(-19443);
            arg0.field4239 = class263.field3748 + arg2.method963(-118);
            arg0.field4259 = class263.field3748 + arg2.method985(arg1 + 21085);
        }
        if (arg1 != -20964) {
            method2024(59, -24, 82, -30, 49, -13, 122, 95, -2, -10);
        }
        if ((arg4 & 0x10000) != 0) {
            int var27 = arg2.method955((byte) -127);
            if (var27 == 65535) {
                var27 = -1;
            }
            int var28 = arg2.method999(4);
            int var29 = arg2.method996(arg1 + 20972);
            arg0.method1774(true, var27, var29, var28, -85);
        }
        if ((arg4 & 0x800) != 0) {
            int var30 = arg2.method955((byte) -128);
            if (var30 == 65535) {
                var30 = -1;
            }
            int var31 = arg2.method977((byte) 99);
            int var32 = arg2.method939(49510128);
            arg0.method1774(false, var30, var32, var31, -25);
        }
        if ((arg4 & 0x4) != 0) {
            int var33 = arg2.method985(arg1 ^ 0xFFFFAE60);
            if (var33 == 65535) {
                var33 = -1;
            }
            int var34 = arg2.method939(49510128);
            class445.method2600(var34, 113, var33, arg0);
        }
        if ((arg4 & 0x10) != 0) {
            int var35 = arg2.method996(arg1 + 20972);
            byte[] var36 = new byte[var35];
            class156 var37 = new class156(var36);
            arg2.method937(1268072645, 0, var35, var36);
            class290.field4144[arg3] = var37;
            arg0.method1880(var37, (byte) 124);
        }
        if ((arg4 & 0x20) != 0) {
            class69.field1019[arg3] = arg2.method994(128);
        }
        if ((arg4 & 0x2000) != 0) {
            arg0.field4557 = arg2.method941((byte) 125) == 1;
        }
        if ((arg4 & 0x8) != 0) {
            int var38 = arg2.method953((byte) -40);
            int var39 = arg2.method996(8);
            arg0.method1766(0, var38, var39, class263.field3748);
            arg0.field4252 = class263.field3748 + 300;
            arg0.field4248 = arg2.method980(arg1 ^ 0x1A11);
        }
        if ((arg4 & 0x8000) != 0) {
            arg0.field4181 = arg2.method976((byte) 26);
            arg0.field4202 = arg2.method949(-12754);
            arg0.field4210 = arg2.method949(-12754);
            arg0.field4234 = arg2.method949(-12754);
            arg0.field4225 = arg2.method963(-114) + class263.field3748;
            arg0.field4254 = arg2.method985(112) + class263.field3748;
            arg0.field4237 = arg2.method941((byte) 123);
            arg0.field4274 = 0;
            if (arg0.field4590) {
                arg0.field4234 += arg0.field4587;
                arg0.field4181 += arg0.field4595;
                arg0.field4210 += arg0.field4595;
                arg0.field4277 = 0;
                arg0.field4202 += arg0.field4587;
            } else {
                arg0.field4277 = 1;
                arg0.field4234 += arg0.field4282[0];
                arg0.field4181 += arg0.field4279[0];
                arg0.field4210 += arg0.field4279[0];
                arg0.field4202 += arg0.field4282[0];
            }
        }
        if ((arg4 & 0x100) != 0) {
            arg0.field4246 = arg2.method981(false);
            if (arg0.field4246.charAt(0) == '~') {
                arg0.field4246 = arg0.field4246.substring(1);
                class447.method2609(arg0.field4246, 0, arg0.method1881(-113, false), arg1 ^ 0x5197, 2, arg0.method1885(28166, true));
            } else if (class415.field6145 == arg0) {
                class447.method2609(arg0.field4246, 0, arg0.method1881(arg1 + 21053, false), 94, 2, arg0.method1885(28166, true));
            }
            arg0.field4186 = 0;
            arg0.field4250 = 0;
            arg0.field4184 = 150;
        }
        if (!arg0.field4590) {
            return;
        }
        if (var6 == 127) {
            arg0.method1886(arg0.field4595, arg0.field4587, (byte) 126);
            return;
        }
        byte var40;
        if (var6 == -1) {
            var40 = class69.field1019[arg3];
        } else {
            var40 = var6;
        }
        arg0.method1884(var40, arg0.field4595, arg0.field4587, (byte) 12);
    }
}
