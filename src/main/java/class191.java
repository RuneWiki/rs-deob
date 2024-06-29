import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class191 {

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field2783 = 0;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public int field2766;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "[Lge;")
    public class425[] field2780;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "J")
    private long field2773;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Lge;")
    private class425 field2768;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lge;")
    private class425 field2782;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[[S")
    public static short[][] field2778;

    static {
        new class349("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        new class349("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JI)Lge;", line = 4)
    public final class425 method1373(long arg0, int arg1) {
        this.field2773 = arg0;
        field2781++;
        int var4 = -76 / ((71 - arg1) / 45);
        class425 var5 = this.field2780[(int) ((long) (this.field2766 - 1) & arg0)];
        for (this.field2768 = var5.field6074; this.field2768 != var5; this.field2768 = this.field2768.field6074) {
            if (this.field2768.field6070 == arg0) {
                class425 var6 = this.field2768;
                this.field2768 = this.field2768.field6074;
                return var6;
            }
        }
        this.field2768 = null;
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I", line = 33)
    public final int method1374(boolean arg0) {
        field2779++;
        if (!arg0) {
            this.method1383(49);
        }
        return this.field2766;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I", line = 44)
    public final int method1375(int arg0) {
        field2771++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2766; var3++) {
            class425 var4 = this.field2780[var3];
            class425 var5 = var4.field6074;
            while (var4 != var5) {
                var5 = var5.field6074;
                var2++;
            }
        }
        if (arg0 < 116) {
            method1381((class390) null, -125, 3, 101, 50);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lge;JI)V", line = 79)
    public final void method1376(class425 arg0, long arg1, int arg2) {
        if (arg0.field6072 != null) {
            arg0.method2660((byte) 124);
        }
        field2769++;
        class425 var5 = this.field2780[(int) ((long) (this.field2766 - 1) & arg1)];
        arg0.field6074 = var5;
        arg0.field6072 = var5.field6072;
        arg0.field6072.field6074 = arg0;
        arg0.field6074.field6072 = arg0;
        if (arg2 <= 63) {
            this.field2780 = null;
        }
        arg0.field6070 = arg1;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method1377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 104 % ((-arg5 - 44) / 47);
        for (int var7 = arg3; var7 < (arg0 + arg3); var7++) {
            for (int var10 = arg4; var10 < arg1 + arg4; var10++) {
                if (var10 >= 0 && var10 < class80.field1034 && var7 >= 0 && var7 < class381.field5414) {
                    class207.field2975[arg2][var10][var7] = arg2 <= 0 ? 0 : class207.field2975[arg2 - 1][var10][var7] - 240;
                }
            }
        }
        field2770++;
        if (arg4 > 0 && class80.field1034 > arg4) {
            for (int var8 = arg3 + 1; var8 < (arg0 + arg3); var8++) {
                if (var8 >= 0 && var8 < class381.field5414) {
                    class207.field2975[arg2][arg4][var8] = class207.field2975[arg2][arg4 - 1][var8];
                }
            }
        }
        if (arg3 > 0 && class381.field5414 > arg3) {
            for (int var9 = arg4 + 1; var9 < arg1 + arg4; var9++) {
                if (var9 >= 0 && var9 < class80.field1034) {
                    class207.field2975[arg2][var9][arg3] = class207.field2975[arg2][var9][arg3 - 1];
                }
            }
        }
        if (arg4 < 0 || arg3 < 0 || arg4 >= class80.field1034 || arg3 >= class381.field5414) {
            return;
        }
        if (arg2 == 0) {
            if (arg4 > 0 && class207.field2975[arg2][arg4 - 1][arg3] != 0) {
                class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4 - 1][arg3];
                return;
            }
            if (arg3 > 0 && class207.field2975[arg2][arg4][arg3 - 1] != 0) {
                class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && class207.field2975[arg2][arg4 - 1][arg3 - 1] != 0) {
                class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4 - 1][arg3 - 1];
                return;
            }
        } else if (arg4 <= 0 || class207.field2975[arg2 - 1][arg4 - 1][arg3] == class207.field2975[arg2][arg4 - 1][arg3]) {
            if (arg3 > 0 && class207.field2975[arg2 - 1][arg4][arg3 - 1] != class207.field2975[arg2][arg4][arg3 - 1]) {
                class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4][arg3 - 1];
                return;
            }
            if (arg4 > 0 && arg3 > 0 && class207.field2975[arg2][arg4 - 1][arg3 - 1] != class207.field2975[arg2 - 1][arg4 - 1][arg3 - 1]) {
                class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4 - 1][arg3 - 1];
                return;
            }
            return;
        } else {
            class207.field2975[arg2][arg4][arg3] = class207.field2975[arg2][arg4 - 1][arg3];
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lge;", line = 199)
    public final class425 method1378(byte arg0) {
        if (arg0 != 98) {
            this.field2773 = 67L;
        }
        field2774++;
        if (this.field2783 > 0 && this.field2780[this.field2783 - 1] != this.field2782) {
            class425 var2 = this.field2782;
            this.field2782 = var2.field6074;
            return var2;
        }
        while (this.field2766 > this.field2783) {
            class425 var3 = this.field2780[this.field2783++].field6074;
            if (this.field2780[this.field2783 - 1] != var3) {
                this.field2782 = var3.field6074;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Lge;", line = 231)
    public final class425 method1379(int arg0) {
        field2775++;
        if (this.field2768 == null) {
            return null;
        }
        class425 var2 = this.field2780[(int) (this.field2773 & (long) (this.field2766 - 1))];
        while (this.field2768 != var2) {
            if (this.field2768.field6070 == this.field2773) {
                class425 var4 = this.field2768;
                this.field2768 = this.field2768.field6074;
                return var4;
            }
            this.field2768 = this.field2768.field6074;
        }
        this.field2768 = null;
        int var3 = -106 / ((arg0 - 12) / 63);
        return null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B[S)[S", line = 262)
    public static final short[] method1380(byte arg0, short[] arg1) {
        field2776++;
        int var2 = -127 % ((arg0 - 77) / 39);
        if (arg1 == null) {
            return null;
        } else {
            short[] var3 = new short[arg1.length];
            class271.method1854(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lpl;IIII)V", line = 280)
    public static final void method1381(class390 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class224.method1574(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class394.field5548) {
            class224.method1574(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class224.method1574(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class407.field5751) {
            class224.method1574(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class407.field5751) {
            class224.method1574(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class394.field5548 && arg4 <= class407.field5751) {
            class224.method1574(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class224.method1574(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class394.field5548 && arg4 > 0) {
            class224.method1574(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V", line = 334)
    public final void method1382(byte arg0) {
        for (int var2 = 0; var2 < this.field2766; var2++) {
            class425 var3 = this.field2780[var2];
            while (true) {
                class425 var4 = var3.field6074;
                if (var3 == var4) {
                    break;
                }
                var4.method2660((byte) 113);
            }
        }
        if (arg0 != 47) {
            this.field2773 = -44L;
        }
        field2772++;
        this.field2768 = null;
        this.field2782 = null;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lge;", line = 367)
    public final class425 method1383(int arg0) {
        this.field2783 = 0;
        int var2 = 64 / ((30 - arg0) / 53);
        field2767++;
        return this.method1378((byte) 98);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lge;I)I", line = 378)
    public final int method1384(class425[] arg0, int arg1) {
        field2777++;
        int var3 = 0;
        for (int var4 = arg1; var4 < this.field2766; var4++) {
            class425 var5 = this.field2780[var4];
            for (class425 var6 = var5.field6074; var6 != var5; var6 = var6.field6074) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V", line = 415)
    public static void method1385(int arg0) {
        field2778 = null;
        if (arg0 != -1) {
            field2778 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 435)
    public class191(int arg0) {
        this.field2766 = arg0;
        this.field2780 = new class425[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class425 var3 = this.field2780[var2] = new class425();
            var3.field6074 = var3;
            var3.field6072 = var3;
        }
    }
}
