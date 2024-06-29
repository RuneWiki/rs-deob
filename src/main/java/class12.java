import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
    private String field155 = "null";

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "Lgd;")
    public static class206 field164;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "[[I")
    public static int[][] field169;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "Lmc;")
    public static class78 field170;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "C")
    public char field159;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "C")
    public char field161;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "F")
    public static float field165;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Lad;")
    private class268 field152;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "Lad;")
    public class268 field156;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "Lkn;")
    public static class481 field167;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field171;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "()V")
    public static final void method69() {
        for (int var0 = 0; var0 < class162.field2259; var0++) {
            if (!class363.field4975[var0]) {
                class263 var1 = class276.field3652[var0];
                int var2 = var1.field3490;
                int var3 = var1.field5545 - class235.field3119;
                int var4 = (var3 * 2 >> class302.field4025) + 1;
                int var5 = 0;
                int[] var6 = new int[var4 * var4];
                int var7 = var1.field5539 - var3 >> class302.field4025;
                int var8 = var1.field5541 - var3 >> class302.field4025;
                int var9 = var1.field5541 + var3 >> class302.field4025;
                if (var8 < 0) {
                    var5 -= var8;
                    var8 = 0;
                }
                if (var9 >= class91.field1344) {
                    var9 = class91.field1344 - 1;
                }
                for (int var10 = var8; var10 <= var9; var10++) {
                    short var11 = var1.field3495[var5];
                    int var12 = var11 >>> 8;
                    int var13 = var4 * var5 + var12;
                    int var14 = (var11 >>> 8) + var7;
                    int var15 = (var11 & 0xFF) + var14 - 1;
                    if (var14 < 0) {
                        var13 -= var14;
                        var14 = 0;
                    }
                    if (var15 >= class143.field2058) {
                        var15 = class143.field2058 - 1;
                    }
                    for (int var16 = var14; var16 <= var15; var16++) {
                        byte var17 = 1;
                        class471 var18 = class4.method29(var2, var16, var10, field171 == null ? (field171 = method80("hb")) : field171);
                        if (var18 != null && var18.field6499 != 0) {
                            if (var18.field6499 == 1) {
                                boolean var19 = var16 - 1 >= var14;
                                boolean var20 = var16 + 1 <= var15;
                                if (!var19 && var10 + 1 <= var9) {
                                    short var21 = var1.field3495[var5 + 1];
                                    int var22 = (var21 >>> 8) + var7;
                                    int var23 = (var21 & 0xFF) + var22;
                                    var19 = var16 > var22 && var16 < var23;
                                }
                                if (!var20 && var10 - 1 >= var8) {
                                    short var24 = var1.field3495[var5 - 1];
                                    int var25 = (var24 >>> 8) + var7;
                                    int var26 = (var24 & 0xFF) + var25;
                                    var20 = var16 > var25 && var16 < var26;
                                }
                                if (var19 && !var20) {
                                    var17 = 4;
                                } else if (var20 && !var19) {
                                    var17 = 2;
                                }
                            } else {
                                boolean var27 = var16 - 1 >= var14;
                                boolean var28 = var16 + 1 <= var15;
                                if (!var27 && var10 - 1 >= var8) {
                                    short var29 = var1.field3495[var5 - 1];
                                    int var30 = (var29 >>> 8) + var7;
                                    int var31 = (var29 & 0xFF) + var30;
                                    var27 = var16 > var30 && var16 < var31;
                                }
                                if (!var28 && var10 + 1 <= var9) {
                                    short var32 = var1.field3495[var5 + 1];
                                    int var33 = (var32 >>> 8) + var7;
                                    int var34 = (var32 & 0xFF) + var33;
                                    var28 = var16 > var33 && var16 < var34;
                                }
                                if (var27 && !var28) {
                                    var17 = 3;
                                } else if (var28 && !var27) {
                                    var17 = 5;
                                }
                            }
                        }
                        var6[var13++] = var17;
                    }
                    var5++;
                }
                class363.field4975[var0] = true;
                class221.field2945[var2].method380(var1, var6);
            }
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I")
    public final int method70(int arg0, int arg1) {
        field162++;
        if (this.field156 == null) {
            return this.field160;
        }
        if (arg0 != 17257) {
            this.field159 = (char) 65476;
        }
        class37 var3 = (class37) this.field156.method1528((long) arg1, 101);
        return var3 == null ? this.field160 : var3.field555;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lbt;BI)V")
    private final void method71(class32 arg0, byte arg1, int arg2) {
        if (arg1 != -8) {
            return;
        }
        if (arg2 == 1) {
            this.field161 = class107.method661(-2101, arg0.method211(29861));
        } else if (arg2 == 2) {
            this.field159 = class107.method661(-2101, arg0.method211(29861));
        } else if (arg2 == 3) {
            this.field155 = arg0.method195(arg1 - 7);
        } else if (arg2 == 4) {
            this.field160 = arg0.method222(arg1 + 1032);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method215((byte) 89);
            this.field156 = new class268(class100.method616(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method222(1024);
                class445 var7;
                if (arg2 == 5) {
                    var7 = new class221(arg0.method195(-110));
                } else {
                    var7 = new class37(arg0.method222(1024));
                }
                this.field156.method1525((byte) 19, var7, (long) var6);
            }
        }
        field148++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    private final void method72(byte arg0) {
        this.field152 = new class268(this.field156.method1527((byte) -111));
        field151++;
        for (class37 var2 = (class37) this.field156.method1518((byte) -46); var2 != null; var2 = (class37) this.field156.method1517(arg0 ^ 0xFFFF8707)) {
            class37 var3 = new class37((int) var2.field6047);
            this.field152.method1525((byte) 19, var3, (long) var2.field555);
        }
        if (arg0 != 37) {
            this.field155 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method73(boolean arg0, String arg1) {
        field153++;
        if (this.field156 == null) {
            return false;
        }
        if (arg0) {
            this.method70(-54, -86);
        }
        if (this.field152 == null) {
            this.method77((byte) 126);
        }
        for (class89 var3 = (class89) this.field152.method1528(class322.method1786(!arg0, arg1), 59); var3 != null; var3 = (class89) this.field152.method1520((byte) 38)) {
            if (var3.field1307.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
    public static void method74(byte arg0) {
        field167 = null;
        int var1 = 15 / ((72 - arg0) / 41);
        field170 = null;
        field166 = null;
        field164 = null;
        field169 = null;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z")
    public final boolean method75(int arg0, int arg1) {
        field150++;
        if (this.field156 == null) {
            return false;
        }
        if (arg0 != 12) {
            field165 = -0.5316608F;
        }
        if (this.field152 == null) {
            this.method72((byte) 37);
        }
        class37 var3 = (class37) this.field152.method1528((long) arg1, arg0 ^ 0x53);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
    public static final void method76(byte arg0) {
        field149++;
        if (class47.field635 && arg0 == 2) {
            class47.field635 = false;
            class49.field655 = null;
            class140.field2042 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V")
    private final void method77(byte arg0) {
        field157++;
        this.field152 = new class268(this.field156.method1527((byte) -111));
        if (arg0 < 33) {
            this.method70(114, -92);
        }
        for (class221 var2 = (class221) this.field156.method1518((byte) -94); var2 != null; var2 = (class221) this.field156.method1517(-30942)) {
            class89 var3 = new class89(var2.field2943, (int) var2.field6047);
            this.field152.method1525((byte) 19, var3, class322.method1786(true, var2.field2943));
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILbt;)V")
    public final void method78(int arg0, class32 arg1) {
        if (arg0 >= -50) {
            this.field159 = '/';
        }
        while (true) {
            int var3 = arg1.method201((byte) -107);
            if (var3 == 0) {
                field154++;
                return;
            }
            this.method71(arg1, (byte) -8, var3);
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)Ljava/lang/String;")
    public final String method79(int arg0, int arg1) {
        field158++;
        if (this.field156 == null) {
            return this.field155;
        }
        class221 var3 = (class221) this.field156.method1528((long) arg0, arg1 ^ 0x2C);
        if (var3 == null) {
            return this.field155;
        } else if (arg1 == 20) {
            return var3.field2943;
        } else {
            return null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method80(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class206("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        new class206("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field166 = new int[6];
        field164 = new class206("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
        field169 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
        field170 = new class78(20, 4);
    }
}
