import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class145 extends class346 {

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "[S")
    private short[] field1859 = new short[257];

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "Lte;")
    public static class357 field1853 = new class357(64);

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "[I")
    public static int[] field1867 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "[I")
    private int[] field1854;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "[I")
    private int[] field1865;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "[Ll;")
    public static class315[] field1856;

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "[[I")
    private int[][] field1868;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field1855;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (arg1 != 3) {
            method1005((class185) null, 103);
        }
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            for (int var5 = 0; ~var5 > ~class134.field1753; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1859[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZB)V")
    public static final void method998(boolean arg0, byte arg1) {
        ++field1850;
        if (!class399.field5851 != !arg0) {
            class399.field5851 = arg0;
            class93.method747(100);
            if (arg1 <= 70) {
                field1867 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V")
    private final void method999(int arg0) {
        int var2 = this.field1862;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1868.length + -1 > var5 && var4 >= this.field1868[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1868[var5 + -1];
                    int[] var7 = this.field1868[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class72.field1021[255 & var8 >> 5] >> 1;
                    int var10 = 4096 - var9;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1859[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; var14 < this.field1868.length + -1 && ~this.field1868[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1868[var14 + -1];
                    int[] var16 = this.field1868[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1859[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; var22 < this.field1868.length + -1 && var21 >= this.field1868[var22][0]; ++var22) {
                }
                int[] var23 = this.field1868[var22 + -1];
                int[] var24 = this.field1868[var22];
                int var25 = this.method1000(73, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method1000(76, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var27 + var28 - -var26 + -var25;
                int var32 = -var26 + -var31 + var25;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 + var36 + var26 - -var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1859[var20] = (short) var38;
            }
        }
        ++field1857;
        if (arg0 != 0) {
            method1006(true);
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(II)[I")
    private final int[] method1000(int arg0, int arg1) {
        ++field1863;
        if (~arg1 > -1) {
            return this.field1854;
        } else if (~arg1 <= ~this.field1868.length) {
            return this.field1865;
        } else {
            int var3 = 18 / ((arg0 - 28) / 43);
            return this.field1868[arg1];
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V")
    private final void method1001(int arg0) {
        ++field1852;
        int[] var2 = this.field1868[arg0];
        int[] var3 = this.field1868[1];
        int[] var4 = this.field1868[this.field1868.length + -2];
        int[] var5 = this.field1868[this.field1868.length + -1];
        this.field1854 = new int[] { var2[0] - -var2[0] + -var3[0], var2[1] - (-var2[1] - -var3[1]) };
        this.field1865 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] + -var4[1]) };
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZ)I")
    public static final int method1002(int arg0, boolean arg1) {
        ++field1861;
        if (arg1) {
            method1009(true);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(Z)Z")
    public static final boolean method1003(boolean arg0) {
        for (int var1 = class346.field5155; var1 < class134.field1752; ++var1) {
            class77[][] var2 = class106.field1405[var1];
            for (int var3 = -class251.field3687; var3 <= 0; ++var3) {
                int var4 = class167.field2261 + var3;
                int var5 = class167.field2261 - var3;
                if (var4 >= class396.field5788 || var5 < class74.field1043) {
                    for (int var6 = -class251.field3687; var6 <= 0; ++var6) {
                        int var7 = class437.field6352 + var6;
                        int var8 = class437.field6352 - var6;
                        if (var4 >= class396.field5788) {
                            if (var7 >= class427.field6217) {
                                class77 var9 = var2[var4][var7];
                                if (var9 != null && var9.field1062) {
                                    class69.field1008 = arg0;
                                    class395.field5742.method1276(false, var9);
                                    class395.field5742.method1279(8192);
                                }
                            }
                            if (var8 < class154.field1957) {
                                class77 var10 = var2[var4][var8];
                                if (var10 != null && var10.field1062) {
                                    class69.field1008 = arg0;
                                    class395.field5742.method1276(false, var10);
                                    class395.field5742.method1279(8192);
                                }
                            }
                        }
                        if (var5 < class74.field1043) {
                            if (var7 >= class427.field6217) {
                                class77 var11 = var2[var5][var7];
                                if (var11 != null && var11.field1062) {
                                    class69.field1008 = arg0;
                                    class395.field5742.method1276(false, var11);
                                    class395.field5742.method1279(8192);
                                }
                            }
                            if (var8 < class154.field1957) {
                                class77 var12 = var2[var5][var8];
                                if (var12 != null && var12.field1062) {
                                    class69.field1008 = arg0;
                                    class395.field5742.method1276(false, var12);
                                    class395.field5742.method1279(8192);
                                }
                            }
                        }
                        if (class132.field1728 == 0) {
                            if (class46.field697) {
                                class395.field5742.method1278(-9877, 24);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
    public static final void method1004(int arg0) {
        ++field1851;
        class247.field3476.method2825(30);
        class328.field4842.method2825(16);
        int var1 = 124 % ((arg0 - 83) / 35);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lir;I)V")
    public static final void method1005(class185 arg0, int arg1) {
        class274.field4023 = arg0;
        ++field1860;
        class136.field1757 = class274.field4023.method1225(19, (byte) 27);
        if (arg1 != 30167) {
            field1856 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class145() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(Z)V")
    public static final void method1006(boolean arg0) {
        class255.field3715 = "verde:";
        class15.field239 = "Fontes carregadas";
        class113.field1460 = " entrou no jogo.";
        class450.field6452 = "Carregando fontes - ";
        class352.field5223 = "Carregando sprites - ";
        class165.field2240 = "Carregando. Aguarde.";
        class393.field5728 = "Iniciando biblioteca 3D";
        class48.field727 = "Fechar";
        ++field1866;
        class337.field4982 = "Examinar";
        class355.field5257 = "Memória alocada";
        class447.field6427 = "Descartar";
        class118.field1531 = "M";
        class128.field1667 = "roxo:";
        class338.field4999 = "K";
        class271.field3995 = " da sua lista de amigos primeiro.";
        class316.field4623 = "Pegar";
        class331.field4879 = " já está na sua lista de ignorados.";
        class69.field995 = "Selecionar";
        class257.field3765 = "Carregando dados da lista de mundos";
        class397.field5798 = "Verificando atualizações - ";
        class274.field4027 = "Carregando tela título - ";
        class353.field5236 = "Config carregada";
        class244.field3437 = "Caminhar para cá";
        if (arg0) {
            method1006(true);
        }
        class126.field1648 = "Largar";
        class278.field4084 = " mais opções";
        class101.field1327 = "flash2:";
        class25.field445 = "Tentando reestabelecer conexão. Aguarde.";
        class297.field4489 = "Texturas carregadas";
        class421.field6114 = "Conexão perdida.";
        class337.field4983 = "Selecionar opção";
        class95.field1282 = "Objeto para membros";
        class7.field102 = "Cancelar";
        class8.field110 = "rolagem:";
        class7.field97 = "qualificação: ";
        class328.field4846 = "Padrões carregados";
        class296.field4472 = "Dados da lista de mundos carregados";
        class385.field5634 = "Ok";
        class429.field6239 = "Usar";
        class175.field2370 = "Não é possível encontrar ";
        class8.field106 = "Aguarde...";
        class252.field3694 = "Interfaces carregadas";
        class398.field5822 = "brilho1:";
        class129.field1687 = "Gerenciador de entradas carregado";
        class188.field2567 = "Você não pode adicionar a si próprio à sua lista de ignorados.";
        class69.field997 = "Lista de atualizações carregada";
        class21.field377 = "brilho2:";
        class249.field3683 = "brilho3:";
        class258.field3802 = "M";
        class320.field4761 = "amarelo:";
        class361.field5342 = "Oculto";
        class20.field359 = "habilidade: ";
        class106.field1396 = "Remova ";
        class68.field991 = "Você não pode adicionar a si próprio à sua lista de amigos.";
        class95.field1298 = "Remova ";
        class122.field1583 = "cyan:";
        class6.field82 = "Pacote de palavras carregado";
        class431.field6271 = "deslizamento:";
        class338.field4986 = "Mecanismo de som preparado";
        class353.field5233 = "K";
        class45.field689 = "As variáveis do sistema foram carregadas";
        class234.field3258 = "brilho3:";
        class366.field5401 = " da sua lista de ignorados primeiro.";
        class25.field453 = "Biblioteca 3D iniciada";
        class355.field5258 = "Carregando padrões - ";
        class27.field463 = "Continuar";
        class271.field3993 = "RuneScape carregando. Aguarde...";
        class325.field4820 = "Carregando...";
        class110.field1433 = "branco:";
        class399.field5845 = "Alocando memória";
        class74.field1041 = " ";
        class195.field2706 = "Carregando pacote de palavras - ";
        class447.field6435 = "Tela título carregada";
        class192.field2679 = "Sua lista de ignorados está cheia. O limite é 100 usuários.";
        class72.field1025 = "Conectando ao servidor de atualização";
        class108.field1419 = " já está na sua lista de amigos.";
        class63.field945 = "Sprites carregados";
        class399.field5848 = "flash1:";
        class249.field3685 = "Carregando interfaces - ";
        class398.field5835 = "Mechscape carregando. Aguarde...";
        class104.field1358 = "nível: ";
        class230.field3162 = "Conectado ao servidor de atualização";
        class115.field1500 = "Carregando texturas - ";
        class109.field1423 = "Virar para cá";
        class248.field3641 = "onda:";
        class305.field4558 = "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.";
        class295.field4451 = "Tela título aberta";
        class423.field6161 = "onda2:";
        class263.field3859 = "Universo de jogo criado";
        class143.field1810 = "vermelho:";
        class447.field6444 = "Atacar";
        class133.field1745 = " saiu do jogo.";
        class144.field1848 = "Carregando config - ";
        class190.field2649 = "tremor:";
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IBILdd;II)V")
    public static final void method1007(int arg0, byte arg1, int arg2, class144 arg3, int arg4, int arg5) {
        ++field1864;
        if (arg3.field1825 != -1 || arg3.field1833 != null) {
            if (arg1 <= -64) {
                int var6 = 0;
                int var7 = class389.field5692 * arg3.field1826 >> 8;
                if (arg3.field1845 >= arg0) {
                    if (arg0 < arg3.field1828) {
                        var6 += -arg0 + arg3.field1828;
                    }
                } else {
                    var6 += -arg3.field1845 + arg0;
                }
                if (arg4 <= arg3.field1823) {
                    if (~arg4 > ~arg3.field1846) {
                        var6 += -arg4 + arg3.field1846;
                    }
                } else {
                    var6 += -arg3.field1823 + arg4;
                }
                if (arg3.field1843 != 0 && var6 - 64 <= arg3.field1843 && ~class389.field5692 != -1 && arg3.field1837 == arg2) {
                    var6 -= 64;
                    if (~var6 > -1) {
                        var6 = 0;
                    }
                    int var8 = (-var6 + arg3.field1843) * var7 / arg3.field1843;
                    if (arg3.field1840 == null) {
                        if (~arg3.field1825 <= -1) {
                            class374 var9 = class374.method2455(class14.field228, arg3.field1825, 0);
                            if (var9 != null) {
                                class151 var10 = var9.method2457().method1032(class322.field4798);
                                class260 var11 = class260.method1724(var10, 100, var8);
                                var11.method1740(-1);
                                class40.field602.method248(var11);
                                arg3.field1840 = var11;
                            }
                        }
                    } else {
                        arg3.field1840.method1743(var8);
                    }
                    if (arg3.field1822 != null) {
                        arg3.field1822.method1743(var8);
                        if (!arg3.field1822.method2633(true)) {
                            arg3.field1822 = null;
                        }
                    } else {
                        if (arg3.field1833 != null && ~(arg3.field1839 -= arg5) >= -1) {
                            int var12 = (int) (Math.random() * (double) arg3.field1833.length);
                            class374 var13 = class374.method2455(class14.field228, arg3.field1833[var12], 0);
                            if (var13 != null) {
                                class151 var14 = var13.method2457().method1032(class322.field4798);
                                class260 var15 = class260.method1724(var14, 100, var8);
                                var15.method1740(0);
                                class40.field602.method248(var15);
                                arg3.field1839 = arg3.field1832 + (int) ((double) (arg3.field1842 - arg3.field1832) * Math.random());
                                arg3.field1822 = var15;
                                return;
                            }
                        }
                    }
                } else {
                    if (arg3.field1840 != null) {
                        class40.field602.method249(arg3.field1840);
                        arg3.field1840 = null;
                    }
                    if (arg3.field1822 != null) {
                        class40.field602.method249(arg3.field1822);
                        arg3.field1822 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg1) {
            method1009(false);
        }
        ++field1869;
        if (~arg2 == -1) {
            this.field1862 = arg0.method2233((byte) 104);
            this.field1868 = new int[arg0.method2233((byte) 104)][2];
            for (int var4 = 0; ~var4 > ~this.field1868.length; ++var4) {
                this.field1868[var4][0] = arg0.method2239(-1076227960);
                this.field1868[var4][1] = arg0.method2239(-1076227960);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public final void method237(byte arg0) {
        ++field1849;
        if (this.field1868 == null) {
            this.field1868 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field1868.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1862 == 2) {
                this.method1001(0);
            }
            class431.method2689(256);
            this.method999(0);
            if (arg0 > -95) {
                method1002(72, false);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lnb;IIII)V")
    public static final void method1008(class340 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class322.method2121(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class108.field1421) {
            class322.method2121(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class322.method2121(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class186.field2554) {
            class322.method2121(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class186.field2554) {
            class322.method2121(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class108.field1421 && arg4 <= class186.field2554) {
            class322.method2121(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class322.method2121(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class108.field1421 && arg4 > 0) {
            class322.method2121(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(Z)V")
    public static void method1009(boolean arg0) {
        field1856 = null;
        if (arg0) {
            method1007(-16, (byte) 15, 67, (class144) null, -119, -86);
        }
        field1853 = null;
        field1867 = null;
    }
}
