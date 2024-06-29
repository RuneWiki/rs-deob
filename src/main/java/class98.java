import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class98 {

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lge;")
    private class325 field1416 = new class325();

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lqi;")
    private class257 field1420 = new class257();

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    private int field1422;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lii;")
    private class250 field1421;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field1404 = -2;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1407 = "scroll:";

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "[I")
    public static int[] field1410 = new int[256];

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field1418 = -1;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "Ljd;")
    public static class95 field1415;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[Lrj;")
    public static class269[] field1405;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)Lge;", line = 5)
    public final class325 method730(long arg0, byte arg1) {
        field1403++;
        if (arg1 != 90) {
            method732(105, -120);
        }
        class325 var4 = (class325) this.field1421.method1716(-1, arg0);
        if (var4 != null) {
            this.field1420.method1810(var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 34)
    public static final void method731(int arg0, int arg1) {
        class49.field680 = arg1;
        field1402++;
        class114.field1799 = -1;
        class114.field1799 = arg0;
        class7.method73(-13969);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I", line = 50)
    public static final int method732(int arg0, int arg1) {
        int var2 = -42 / ((-arg0 - 73) / 33);
        field1409++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Lef;", line = 69)
    public static final class217 method733(byte arg0) {
        field1406++;
        try {
            if (arg0 < 7) {
                field1413 = -95;
            }
            return (class217) Class.forName("ha").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJLge;)V", line = 86)
    public final void method734(byte arg0, long arg1, class325 arg2) {
        if (this.field1419 == 0) {
            class325 var5 = this.field1420.method1813(arg0 ^ 0xFFFFFFF3);
            var5.method39(10717);
            var5.method2257(false);
            if (this.field1416 == var5) {
                class325 var6 = this.field1420.method1813(1);
                var6.method39(10717);
                var6.method2257(false);
            }
        } else {
            this.field1419--;
        }
        this.field1421.method1708(arg1, (byte) -79, arg2);
        if (arg0 != -14) {
            field1405 = (class269[]) null;
        }
        field1414++;
        this.field1420.method1810(arg2, false);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIZIII)V", line = 116)
    public static final void method735(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1412++;
        class211.field3240++;
        class248.method1692(108);
        if (arg2) {
            class226.method1609(111, false, false, 0);
        } else {
            class189.method1400(0, 1);
            class226.method1609(-86, false, true, 0);
            if (class122.field1869 == 0) {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class226.method1609(104, false, false, var6);
                    class226.method1609(arg1 ^ 0x54, true, false, var6);
                    class189.method1400(var6, arg1 + 1);
                }
            } else {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class189.method1400(var7, 1);
                    class226.method1609(127, false, false, var7);
                    class226.method1609(91, true, false, var7);
                }
            }
        }
        if (!arg2) {
            class152.method1146((byte) -120);
        }
        class39.method300(28);
        if (class73.field1058) {
            class100.method755(arg3, arg4, (byte) -67, true, arg0, arg5);
            arg3 = class178.field2838;
            arg4 = class290.field4472;
            arg0 = class114.field1792;
            arg5 = class228.field3490;
        }
        if (class268.field4168 == 1) {
            int var8 = (int) class307.field4786;
            if (class15.field200 / 256 > var8) {
                var8 = class15.field200 / 256;
            }
            if (class307.field4791[4] && var8 < (class204.field3134[4] + 128)) {
                var8 = class204.field3134[4] + 128;
            }
            int var9 = (int) class243.field3695 + class72.field1036 & 0x7FF;
            class335.method2336(var8, class328.method2291(class265.field4112, class39.field575.field4731, class39.field575.field4713, arg1 + 105) - 50, class87.field1242, arg0, 30921, var9, class198.field3034, var8 * 3 + 600);
        } else if (class268.field4168 == 5) {
            class28.method216(arg0, -16);
        }
        int var10 = class197.field3028;
        int var11 = class7.field111;
        int var12 = class190.field2976;
        int var13 = class193.field3015;
        int var14 = class200.field3047;
        for (int var15 = arg1; var15 < 5; var15++) {
            if (class307.field4791[var15]) {
                int var16 = (int) ((double) (-class97.field1391[var15]) + (double) (class97.field1391[var15] * 2 + 1) * Math.random() + Math.sin((double) class311.field4835[var15] / 100.0D * (double) class217.field3328[var15]) * (double) class204.field3134[var15]);
                if (var15 == 0) {
                    class190.field2976 += var16;
                }
                if (var15 == 4) {
                    class193.field3015 += var16;
                    if (class193.field3015 < 128) {
                        class193.field3015 = 128;
                    }
                    if (class193.field3015 > 383) {
                        class193.field3015 = 383;
                    }
                }
                if (var15 == 2) {
                    class197.field3028 += var16;
                }
                if (var15 == 3) {
                    class200.field3047 = class200.field3047 + var16 & 0x7FF;
                }
                if (var15 == 1) {
                    class7.field111 += var16;
                }
            }
        }
        class4.method35(-4);
        if (class73.field1058) {
            class175.method1316(arg4, arg3, arg4 + arg5, arg3 - -arg0);
            float var17 = (float) class193.field3015 * 0.17578125F;
            float var18 = (float) class200.field3047 * 0.17578125F;
            boolean var19 = false;
            if (class268.field4168 == 3) {
                var17 = class283.field4422 * 360.0F / 6.2831855F;
                var18 = class37.field536 * 360.0F / 6.2831855F;
            }
            int var20;
            if (class152.field2308 == 10) {
                var20 = class165.method1252(class228.field3488, class197.field3028 >> 10, false, class102.field1482, class190.field2976 >> 10);
            } else {
                var20 = class165.method1252(class228.field3488, class39.field575.field4744[0] >> 3, false, class102.field1482, class39.field575.field4676[0] >> 3);
            }
            if (class277.field4292 >= 0) {
                class73.method517();
                class221 var21 = class43.method339((byte) 85, class277.field4292, class262.field4028, class180.field2853, class94.field1333);
                var21.method1575(class213.field3268, arg4, arg3, arg5, arg0, class193.field3015, class200.field3047, var20);
            } else {
                class73.method520(var20);
            }
            class73.method554(arg4, arg3, arg5, arg0, arg5 / 2 + arg4, arg0 / 2 + arg3, var17, var18, class118.field1847, class118.field1847);
            class294.method2029(false, false);
            class73.method550();
            class73.method558(true);
            class73.method531(true);
        } else {
            class287.method1980(arg4, arg3, arg4 + arg5, arg3 - -arg0);
            class164.method1228();
            if (class277.field4292 >= 0) {
                class221 var22 = class43.method339((byte) 85, class277.field4292, class262.field4028, class180.field2853, class94.field1333);
                var22.method1573(class213.field3268, arg4, arg3, arg5, arg0, class193.field3015, class200.field3047, 0);
            } else {
                class287.method1987(arg4, arg3, arg5, arg0, 0);
            }
        }
        if (class330.field5089 || arg4 > class272.field4253 || class272.field4253 >= (arg4 + arg5) || class234.field3562 < arg3 || (arg0 + arg3) <= class234.field3562) {
            class273.field4266 = false;
            class205.field3143 = 0;
        } else {
            class273.field4266 = true;
            int var23 = class231.field3524;
            class205.field3143 = 0;
            int var24 = class38.field565;
            int var25 = class250.field3768;
            int var26 = class201.field3100;
            class147.field2237 = (var26 - var24) * (class234.field3562 - arg3) / arg0 + var24;
            class25.field273 = (class272.field4253 - arg4) * (var23 - var25) / arg5 + var25;
        }
        class293.method2025((byte) 95);
        byte var27 = class229.method1618(-11) == 2 ? (byte) class211.field3240 : 1;
        if (class73.field1058) {
            class315.method2153(class233.field3542, !class284.field4430);
            class286.method1971(class200.field3047, class193.field3015, class7.field111, class190.field2976, class197.field3028, -128);
            class73.field1071 = class233.field3542;
            class201.method1451(class190.field2976, class7.field111, class197.field3028, class193.field3015, class200.field3047, class2.field25, class300.field4618, class27.field294, class201.field3097, class13.field174, class242.field3684, class265.field4112 + 1, var27, class39.field575.field4713 >> 7, class39.field575.field4731 >> 7);
            class174.field2802 = true;
            class315.method2155();
            class286.method1971(0, 0, 0, 0, 0, arg1 ^ 0xFFFFFF8A);
            class293.method2025((byte) 119);
            class240.method1667(class118.field1847, 125, arg3, class118.field1847, arg0, arg5, arg4);
            class291.method2008(class118.field1847, arg0, arg5, class118.field1847, arg3, arg4, -28);
            class5.method43();
        } else {
            class201.method1451(class190.field2976, class7.field111, class197.field3028, class193.field3015, class200.field3047, class2.field25, class300.field4618, class27.field294, class201.field3097, class13.field174, class242.field3684, class265.field4112 + 1, var27, class39.field575.field4713 >> 7, class39.field575.field4731 >> 7);
            class293.method2025((byte) 96);
            class5.method43();
            class240.method1667(256, 88, arg3, 256, arg0, arg5, arg4);
            class291.method2008(256, arg0, arg5, 256, arg3, arg4, -28);
        }
        ((class265) class164.field2662).method1869(-64, class228.field3488);
        class341.method2367(4, arg3, arg0, arg4, arg5);
        class197.field3028 = var10;
        class7.field111 = var11;
        class193.field3015 = var13;
        class200.field3047 = var14;
        class190.field2976 = var12;
        if (class191.field2988 && class340.field5285.method780(false) == 0) {
            class191.field2988 = false;
        }
        if (class191.field2988) {
            if (class73.field1058) {
                class175.method1322(arg4, arg3, arg5, arg0, 0);
            } else {
                class287.method1987(arg4, arg3, arg5, arg0, 0);
            }
            class97.method729(29912, false, class286.field4447);
        }
        if (!arg2 && !class191.field2988 && !class330.field5089 && arg4 <= class272.field4253 && (arg4 + arg5) > class272.field4253 && arg3 <= class234.field3562 && class234.field3562 < arg0 + arg3) {
            class163.method1224(-16353, class234.field3562, arg0, class272.field4253, arg4, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lma;", line = 381)
    public final class5 method736(byte arg0) {
        if (arg0 != 46) {
            field1418 = 46;
        }
        field1411++;
        return this.field1421.method1706(arg0 - 46);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 392)
    public final void method737(int arg0) {
        if (arg0 != 3374) {
            return;
        }
        this.field1420.method1816(arg0 ^ 0xD2F);
        field1417++;
        this.field1421.method1713(0);
        this.field1416 = new class325();
        this.field1419 = this.field1422;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Lma;", line = 406)
    public final class5 method738(int arg0) {
        if (arg0 >= -96) {
            method735(68, 82, false, -86, -47, -120);
        }
        field1401++;
        return this.field1421.method1705((byte) 90);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V", line = 432)
    public static final void method739(byte arg0) {
        class16.field206 = "Iniciando biblioteca 3D";
        class260.field4002 = "qualificação: ";
        class129.field1972 = "branco:";
        class168.field2717 = " da sua lista de amigos primeiro.";
        class240.field3672 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class153.field2326 = "Padrões carregados";
        class63.field853 = "Carregando config - ";
        class77.field1127 = "vermelho:";
        class102.field1473 = "Mecanismo de som preparado";
        class28.field337 = "Ok";
        class51.field693 = "Pegar";
        class201.field3092 = "Usar";
        class61.field808 = "Tela título carregada";
        class339.field5269 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class201.field3073 = "Continuar";
        class205.field3151 = "Conectado ao servidor de atualização";
        class276.field4287 = "Carregando fontes - ";
        class83.field1216 = "Universo de jogo criado";
        class108.field1569 = "Largar";
        class211.field3236 = "K";
        class206.field3165 = "Carregando padrões - ";
        class153.field2328 = "Biblioteca 3D iniciada";
        class51.field690 = "Texturas carregadas";
        class62.field830 = "Carregando tela título - ";
        class286.field4447 = "Carregando. Aguarde.";
        class5.field75 = "Oculto";
        class332.field5153 = "onda2:";
        if (arg0 != 88) {
            return;
        }
        class21.field238 = "Carregando...";
        field1408++;
        class220.field3361 = "K";
        class237.field3603 = "tremor:";
        class228.field3471 = "Carregando pacote de palavras - ";
        class21.field243 = "Carregando interfaces - ";
        class225.field3432 = "flash1:";
        class34.field500 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class278.field4319 = "Sprites carregados";
        class133.field2032 = "Examinar";
        class139.field2080 = " já está na sua lista de amigos.";
        class144.field2207 = "Config carregada";
        class237.field3608 = " mais opções";
        class300.field4624 = "Gerenciador de entradas carregado";
        class307.field4790 = "Fontes carregadas";
        class170.field2756 = "onda:";
        class3.field37 = "Caminhar para cá";
        class323.field4999 = "roxo:";
        class233.field3543 = "Aguarde...";
        class112.field1699 = "Virar para cá";
        class63.field835 = "nível: ";
        class320.field4959 = "Tela título aberta";
        class240.field3668 = "Remova ";
        class32.field408 = "Lista de atualizações carregada";
        class214.field3296 = "habilidade: ";
        class76.field1112 = "Selecionar";
        class265.field4119 = " ";
        class29.field354 = "Descartar";
        class330.field5066 = " entrou no jogo.";
        class228.field3481 = "brilho3:";
        class284.field4426 = "cyan:";
        class60.field797 = "Conectando ao servidor de atualização";
        class229.field3492 = "deseja negociar com você.";
        class41.field599 = "flash2:";
        class130.field2002 = "Selecionar opção";
        class169.field2737 = "Interfaces carregadas";
        class293.field4521 = "Atacar";
        class335.field5219 = "brilho1:";
        class137.field2072 = "brilho2:";
        class222.field3382 = "deslizamento:";
        class62.field825 = "Alocando memória";
        class97.field1397 = "amarelo:";
        class16.field204 = "Carregando /secure/libs_v4s/RCras - ";
        class62.field834 = "M";
        class257.field3938 = "Tentando reestabelecer conexão. Aguarde.";
        class191.field2987 = "Pacote de palavras carregado";
        class243.field3692 = "Carregando dados da lista de mundos";
        class121.field1864 = " já está na sua lista de ignorados.";
        class43.field613 = "RuneScape carregando. Aguarde...";
        class28.field317 = "Dados da lista de mundos carregados";
        class209.field3193 = "M";
        class178.field2832 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class305.field4691 = "Conexão perdida.";
        field1407 = "rolagem:";
        class59.field780 = "Fechar";
        class118.field1842 = "Remova ";
        class133.field2029 = "verde:";
        class340.field5283 = " saiu do jogo.";
        class323.field4996 = "Carregando sprites - ";
        class331.field5105 = "Memória alocada";
        class273.field4256 = "Verificando atualizações - ";
        class239.field3646 = "Cancelar";
        class328.field5060 = "Objeto para membros";
        class166.field2692 = "Não é possível encontrar ";
        class172.field2774 = " da sua lista de ignorados primeiro.";
        class268.field4161 = "brilho3:";
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V", line = 808)
    public class98(int arg0) {
        this.field1419 = arg0;
        this.field1422 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1421 = new class250(var2);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 792)
    public static void method740(int arg0) {
        field1410 = null;
        if (arg0 == -15168) {
            field1405 = null;
            field1415 = null;
            field1407 = null;
        }
    }
}
