import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class80 {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field1125 = -1;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field1131 = 0;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "Z")
    public boolean field1136 = false;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    private int field1134 = 128;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "Z")
    public boolean field1144 = false;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    private int field1145 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    private int field1142 = 128;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "Lkn;")
    public static class442 field1143 = new class442("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "[I")
    public static int[] field1147;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lkn;")
    public static class442 field1149;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "[S")
    private short[] field1124;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "[S")
    private short[] field1126;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "[S")
    private short[] field1132;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[S")
    private short[] field1138;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkh;I)V")
    public final void method574(class11 arg0, int arg1) {
        if (arg1 != 0) {
            this.method574((class11) null, -20);
        }
        field1140++;
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method582(arg0, (byte) 55, var3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lnq;B)V")
    public static final void method575(class268 arg0, byte arg1) {
        field1148++;
        if (arg1 != 1) {
            method579(107, (byte) 113);
        }
        class30.field494 = arg0;
        class1.field19 = class30.field494.method1739(arg1 ^ 0x67, 4);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II[Lms;)V")
    public static final void method576(int arg0, int arg1, class453[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class453 var4 = arg2[var3];
            if (var4 != null && var4.field6470 == arg1 && !client.method1097(var4)) {
                if (var4.field6356 == 0) {
                    method576(92, var4.field6314, arg2);
                    if (var4.field6382 != null) {
                        method576(95, var4.field6314, var4.field6382);
                    }
                    class26 var5 = (class26) class454.field6477.method886((long) var4.field6314, 25651);
                    if (var5 != null) {
                        class361.method2324(8, var5.field463);
                    }
                }
                if (var4.field6356 == 6 && var4.field6371 != -1) {
                    class411 var6 = class108.method761((byte) -82, var4.field6371);
                    if (var6 != null) {
                        var4.field6421 += class349.field4797;
                        while (var6.field5819[var4.field6399] < var4.field6421) {
                            var4.field6421 -= var6.field5819[var4.field6399];
                            var4.field6399++;
                            if (var4.field6399 >= var6.field5824.length) {
                                var4.field6399 -= var6.field5835;
                                if (var4.field6399 < 0 || var4.field6399 >= var6.field5824.length) {
                                    var4.field6399 = 0;
                                }
                            }
                            var4.field6427 = var4.field6399 + 1;
                            if (var6.field5824.length <= var4.field6427) {
                                var4.field6427 -= var6.field5835;
                                if (var4.field6427 < 0 || var6.field5824.length <= var4.field6427) {
                                    var4.field6427 = -1;
                                }
                            }
                            class404.method2531(26878, var4);
                        }
                    }
                }
            }
        }
        if (arg0 > 41) {
            field1130++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)I")
    public static final int method577(int arg0, byte arg1) {
        int var2 = 71 / ((arg1 + 4) / 55);
        field1133++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method578(String arg0, int arg1) {
        field1141++;
        for (int var2 = arg1; var2 < class345.field4696.length; var2++) {
            if (class345.field4696[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V")
    public static final void method579(int arg0, byte arg1) {
        if (arg1 != 121) {
            field1143 = null;
        }
        field1128++;
        class337.field4640 = new class131(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILuo;III)Lmj;")
    public final class394 method580(int arg0, int arg1, class345 arg2, int arg3, int arg4, int arg5) {
        field1129++;
        int var7 = arg3;
        class411 var8 = this.field1125 == -1 || arg0 == -1 ? null : class108.method761((byte) -82, this.field1125);
        if (var8 != null) {
            var7 = arg3 | var8.method2573(false, 75, arg0, arg4);
        }
        if (this.field1134 != 128) {
            var7 |= 0x2;
        }
        if (this.field1142 != 128 || this.field1145 != 0) {
            var7 |= 0x5;
        }
        if (arg1 != -1172) {
            this.field1142 = 99;
        }
        class131 var9 = class158.field2222;
        class394 var10;
        synchronized (class158.field2222) {
            var10 = (class394) class158.field2222.method904(false, (long) (this.field1135 |= arg2.field4704 << 29));
        }
        if (var10 == null || arg2.method139(var10.method1424(), var7) != 0) {
            if (var10 != null) {
                var7 = arg2.method108(var7, var10.method1424());
            }
            int var11 = var7;
            if (this.field1132 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field1124 != null) {
                var11 |= 0x4000;
            }
            class223 var12 = class121.method823(0, false, class415.field5892, this.field1127);
            if (var12 == null) {
                return null;
            }
            var10 = arg2.method62(var12, var11, class378.field5404, this.field1131 + 64, this.field1139 + 850);
            if (this.field1132 != null) {
                for (int var13 = 0; var13 < this.field1132.length; var13++) {
                    var10.method1460(this.field1132[var13], this.field1138[var13]);
                }
            }
            if (this.field1124 != null) {
                for (int var14 = 0; var14 < this.field1124.length; var14++) {
                    var10.method1452(this.field1124[var14], this.field1126[var14]);
                }
            }
            var10.method1453(var7);
            class131 var15 = class158.field2222;
            synchronized (class158.field2222) {
                class158.field2222.method902((long) (this.field1135 |= arg2.field4704 << 29), (byte) 112, var10);
            }
        }
        class394 var16 = var8 == null ? var10.method1430((byte) 2, var7, true) : var8.method2575(arg0, (byte) 2, 0, arg4, var10, (byte) -123, arg5, var7);
        if (this.field1142 != 128 || this.field1134 != 128) {
            var16.method1415(this.field1142, this.field1134, this.field1142);
        }
        if (this.field1145 != 0) {
            if (this.field1145 == 90) {
                var16.method1441(4096);
            }
            if (this.field1145 == 180) {
                var16.method1441(8192);
            }
            if (this.field1145 == 270) {
                var16.method1441(12288);
            }
        }
        var16.method1453(arg3);
        return var16;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method581(int arg0) {
        field1147 = null;
        field1143 = null;
        if (arg0 != 12341) {
            method576(91, 51, (class453[]) null);
        }
        field1149 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkh;BI)V")
    private final void method582(class11 arg0, byte arg1, int arg2) {
        field1146++;
        if (arg1 != 55) {
            method578((String) null, 82);
        }
        if (arg2 == 1) {
            this.field1127 = arg0.method174(255);
        } else if (arg2 == 2) {
            this.field1125 = arg0.method174(255);
        } else if (arg2 == 4) {
            this.field1142 = arg0.method174(arg1 ^ 0xC8);
        } else if (arg2 == 5) {
            this.field1134 = arg0.method174(255);
        } else if (arg2 == 6) {
            this.field1145 = arg0.method174(255);
        } else if (arg2 == 7) {
            this.field1131 = arg0.method172((byte) 52);
        } else if (arg2 == 8) {
            this.field1139 = arg0.method172((byte) 52);
        } else if (arg2 == 9) {
            this.field1136 = true;
        } else if (arg2 == 10) {
            this.field1144 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method172((byte) 52);
            this.field1138 = new short[var6];
            this.field1132 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1132[var7] = (short) arg0.method174(255);
                this.field1138[var7] = (short) arg0.method174(255);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method172((byte) 52);
            this.field1124 = new short[var4];
            this.field1126 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1124[var5] = (short) arg0.method174(255);
                this.field1126[var5] = (short) arg0.method174(255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkr;Z)Z")
    public static final boolean method583(class447 arg0, boolean arg1) {
        boolean var2 = class375.field5354 == class214.field2979;
        int var3 = 0;
        arg0.method1800(-102123737);
        if (arg0.field6261 < 0 || arg0.field6258 < 0 || arg0.field6272 >= class200.field2772 || arg0.field6264 >= class264.field3687) {
            return false;
        }
        for (int var4 = arg0.field6261; var4 <= arg0.field6272; var4++) {
            for (int var7 = arg0.field6258; var7 <= arg0.field6264; var7++) {
                int var8 = 0;
                if (var4 > arg0.field6261) {
                    var8++;
                }
                if (var4 < arg0.field6272) {
                    var8 += 4;
                }
                if (var7 > arg0.field6258) {
                    var8 += 8;
                }
                if (var7 < arg0.field6264) {
                    var8 += 2;
                }
                class75.method559(arg0.field6267, var4, var7);
                class125 var9 = class328.field4549[arg0.field6267][var4][var7];
                class123 var10 = class305.method1964(arg0, 1073745919, var8);
                class123 var11 = var9.field1749;
                if (var11 == null) {
                    var9.field1749 = var10;
                } else {
                    while (var11.field1711 != null) {
                        var11 = var11.field1711;
                    }
                    var11.field1711 = var10;
                }
                var9.field1745 = (byte) (var9.field1745 | var8);
                if (var2 && class126.field1782[var4][var7] != 0) {
                    var3 = class126.field1782[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field6261; var5 <= arg0.field6272; var5++) {
                for (int var6 = arg0.field6258; var6 <= arg0.field6264; var6++) {
                    if (class126.field1782[var5][var6] == 0) {
                        class126.field1782[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class21.field384[class52.field730++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(JI)V")
    public static final void method584(long arg0, int arg1) {
        field1137++;
        int var3 = class310.field4253 + class412.field5841.field6262;
        int var4 = class28.field477 + class412.field5841.field6266;
        if (class67.field999 - var3 < -500 || (class67.field999 - var3) > 500 || class447.field6265 - var4 < -500 || (class447.field6265 - var4) > 500) {
            class447.field6265 = var4;
            class67.field999 = var3;
        }
        if (class67.field999 != var3) {
            int var5 = var3 - class67.field999;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class67.field999 += var6;
        }
        if (class447.field6265 != var4) {
            int var7 = var4 - class447.field6265;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class447.field6265 += var8;
        }
        if (!class133.field1916) {
            class333.field4599 += (float) arg0 * class305.field4209 / 6.0F;
            class24.field416 += (float) arg0 * class51.field721 / 6.0F;
        }
        if (arg1 != 90) {
            field1143 = null;
        }
        class3.method14((byte) 126);
    }

    static {
        new class442("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field1147 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
        field1149 = new class442("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");
    }
}
