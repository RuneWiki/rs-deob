import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class494 {

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public int field7211 = -1;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "Lvr;")
    public static class306 field7220 = new class306();

    @OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
    public static int field7230;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "Lvr;")
    public static class306 field7232;

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "Lsi;")
    public static class512 field7233;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!qr", name = "v", descriptor = "Lqo;")
    private class141 field7228;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljava/lang/String;")
    private String field7207;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Ljava/lang/String;")
    private String field7216;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "[I")
    private int[] field7210;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[I")
    private int[] field7212;

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "[I")
    private int[] field7213;

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "[I")
    private int[] field7218;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "[I")
    private int[] field7222;

    @OriginalMember(owner = "client!qr", name = "r", descriptor = "[I")
    private int[] field7224;

    @OriginalMember(owner = "client!qr", name = "s", descriptor = "[I")
    private int[] field7225;

    @OriginalMember(owner = "client!qr", name = "t", descriptor = "[I")
    private int[] field7226;

    @OriginalMember(owner = "client!qr", name = "y", descriptor = "[Lf;")
    public static class191[] field7231;

    @OriginalMember(owner = "client!qr", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field7227;

    @OriginalMember(owner = "client!qr", name = "w", descriptor = "[Ljava/lang/String;")
    private String[] field7229;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "[[I")
    private int[][] field7208;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "[[I")
    private int[][] field7209;

    @OriginalMember(owner = "client!qr", name = "q", descriptor = "[[I")
    private int[][] field7223;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILtl;)V")
    public final void method2934(int arg0, class91 arg1) {
        field7217++;
        if (arg0 != -32153) {
            method2938(null, null, -8, -18, 9, 31, -125);
        }
        while (true) {
            int var3 = arg1.method618((byte) 100);
            if (var3 == 0) {
                return;
            }
            this.method2941(arg1, (byte) -103, var3);
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
    public static final void method2935(int arg0) {
        field7215++;
        class157 var1 = class211.field2971;
        synchronized (class211.field2971) {
            class211.field2971.method1022((byte) -34);
            if (arg0 < 111) {
                method2935(24);
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
    public final void method2936(byte arg0) {
        field7221++;
        if (arg0 != 115) {
            method2935(35);
        }
        if (this.field7216 == null) {
            this.field7216 = this.field7207;
        }
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
    public static void method2937(byte arg0) {
        field7232 = null;
        field7233 = null;
        field7220 = null;
        field7231 = null;
        if (arg0 >= -98) {
            field7231 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Lqa;Lqv;IIIII)V")
    public static final void method2938(class496 arg0, class49 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class222.field3107 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class492.field7186) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class285.field4248 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class420 var15 = class380.field5802[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class455.field6683[var12].method849(var13, var14) + class455.field6683[var12].method849(var13 + 1, var14) + class455.field6683[var12].method849(var13, var14 + 1) + class455.field6683[var12].method849(var13 + 1, var14 + 1)) / 4 - (class455.field6683[arg2].method849(arg3, arg4) + class455.field6683[arg2].method849(arg3 + 1, arg4) + class455.field6683[arg2].method849(arg3, arg4 + 1) + class455.field6683[arg2].method849(arg3 + 1, arg4 + 1)) / 4;
                                    class70 var17 = var15.field6261;
                                    class70 var18 = var15.field6271;
                                    if (var17 != null && var17.method49(7)) {
                                        arg1.method61(var17, (byte) 118, arg0, (var14 - arg4) * class215.field2995 + (1 - arg6) * class380.field5804, var7, (var13 - arg3) * class215.field2995 + (1 - arg5) * class380.field5804, var16);
                                    }
                                    if (var18 != null && var18.method49(7)) {
                                        arg1.method61(var18, (byte) 118, arg0, (var14 - arg4) * class215.field2995 + (1 - arg6) * class380.field5804, var7, (var13 - arg3) * class215.field2995 + (1 - arg5) * class380.field5804, var16);
                                    }
                                    for (class115 var19 = var15.field6273; var19 != null; var19 = var19.field1600) {
                                        class153 var20 = var19.field1594;
                                        if (var20 != null && var20.method49(7) && (var20.field2208 == var13 || var8 == var13) && (var20.field2216 == var14 || var10 == var14)) {
                                            int var21 = var20.field2214 + 1 - var20.field2208;
                                            int var22 = var20.field2213 + 1 - var20.field2216;
                                            arg1.method61(var20, (byte) 118, arg0, (var20.field2216 - arg4) * class215.field2995 + (var22 - arg6) * class380.field5804, var7, (var20.field2208 - arg3) * class215.field2995 + (var21 - arg5) * class380.field5804, var16);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZII)I")
    public static final int method2939(boolean arg0, int arg1, int arg2) {
        field7219++;
        if (arg2 == 1 || arg2 == 3) {
            return class286.field4257[arg1 & 0x3];
        } else {
            if (!arg0) {
                field7233 = null;
            }
            return class303.field4461[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2940(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ltl;BI)V")
    private final void method2941(class91 arg0, byte arg1, int arg2) {
        field7214++;
        if (arg2 == 1) {
            this.field7207 = arg0.method601((byte) 0);
        } else if (arg2 == 2) {
            this.field7216 = arg0.method601((byte) 123);
        } else if (arg2 == 3) {
            int var22 = arg0.method618((byte) 100);
            this.field7223 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field7223[var23][0] = arg0.method631(10494);
                this.field7223[var23][1] = arg0.method626((byte) 100);
                this.field7223[var23][2] = arg0.method626((byte) 100);
            }
        } else if (arg2 == 4) {
            int var4 = arg0.method618((byte) 100);
            this.field7209 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7209[var5][0] = arg0.method631(10494);
                this.field7209[var5][1] = arg0.method626((byte) 100);
                this.field7209[var5][2] = arg0.method626((byte) 100);
            }
        } else if (arg2 == 5) {
            arg0.method631(10494);
        } else if (arg2 == 6) {
            arg0.method618((byte) 100);
        } else if (arg2 == 7) {
            arg0.method618((byte) 100);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method618((byte) 100);
            } else if (arg2 == 10) {
                int var6 = arg0.method618((byte) 100);
                this.field7224 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7224[var7] = arg0.method626((byte) 100);
                }
            } else if (arg2 == 12) {
                arg0.method626((byte) 100);
            } else if (arg2 == 13) {
                int var8 = arg0.method618((byte) 100);
                this.field7210 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field7210[var9] = arg0.method631(10494);
                }
            } else if (arg2 == 14) {
                int var10 = arg0.method618((byte) 100);
                this.field7208 = new int[var10][2];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field7208[var11][0] = arg0.method618((byte) 100);
                    this.field7208[var11][1] = arg0.method618((byte) 100);
                }
            } else if (arg2 == 15) {
                arg0.method631(10494);
            } else if (arg2 == 17) {
                this.field7211 = arg0.method631(10494);
            } else if (arg2 == 18) {
                int var12 = arg0.method618((byte) 100);
                this.field7218 = new int[var12];
                this.field7226 = new int[var12];
                this.field7229 = new String[var12];
                this.field7225 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field7218[var13] = arg0.method626((byte) 100);
                    this.field7225[var13] = arg0.method626((byte) 100);
                    this.field7226[var13] = arg0.method626((byte) 100);
                    this.field7229[var13] = arg0.method621(2029169511);
                }
            } else if (arg2 == 19) {
                int var14 = arg0.method618((byte) 100);
                this.field7222 = new int[var14];
                this.field7227 = new String[var14];
                this.field7213 = new int[var14];
                this.field7212 = new int[var14];
                for (int var15 = 0; var15 < var14; var15++) {
                    this.field7212[var15] = arg0.method626((byte) 100);
                    this.field7222[var15] = arg0.method626((byte) 100);
                    this.field7213[var15] = arg0.method626((byte) 100);
                    this.field7227[var15] = arg0.method621(2029169511);
                }
            } else if (arg2 == 249) {
                int var16 = arg0.method618((byte) 100);
                if (this.field7228 == null) {
                    int var17 = class353.method2231(var16, (byte) -84);
                    this.field7228 = new class141(var17);
                }
                for (int var18 = 0; var18 < var16; var18++) {
                    boolean var19 = arg0.method618((byte) 100) == 1;
                    int var20 = arg0.method641(32455);
                    class467 var21;
                    if (var19) {
                        var21 = new class44(arg0.method621(2029169511));
                    } else {
                        var21 = new class74(arg0.method626((byte) 100));
                    }
                    this.field7228.method940((long) var20, -103, var21);
                }
            }
        }
        int var24 = -112 / ((arg1 + 28) / 57);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)I")
    public static int method2942(int arg0, int arg1) {
        return arg0 & arg1;
    }

    static {
        new class375("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field7230 = 0;
        field7232 = new class306();
        field7233 = new class512(7, 4);
    }
}
