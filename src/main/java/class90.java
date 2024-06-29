import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class90 extends class4 {

    @OriginalMember(owner = "client!tq", name = "F", descriptor = "I")
    private int field1197 = 4;

    @OriginalMember(owner = "client!tq", name = "Q", descriptor = "I")
    private int field1206 = 409;

    @OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
    private int field1208 = 204;

    @OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
    private int field1204 = 8;

    @OriginalMember(owner = "client!tq", name = "Z", descriptor = "I")
    private int field1215 = 1024;

    @OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
    private int field1200 = 81;

    @OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
    private int field1198 = 0;

    @OriginalMember(owner = "client!tq", name = "K", descriptor = "I")
    private int field1201 = 1024;

    @OriginalMember(owner = "client!tq", name = "I", descriptor = "Lim;")
    public static class353 field1199 = new class353(76, 6);

    @OriginalMember(owner = "client!tq", name = "ab", descriptor = "[F")
    public static float[] field1216;

    @OriginalMember(owner = "client!tq", name = "bb", descriptor = "[F")
    public static float[] field1217;

    @OriginalMember(owner = "client!tq", name = "db", descriptor = "Lvt;")
    public static class344 field1219;

    @OriginalMember(owner = "client!tq", name = "fb", descriptor = "[[I")
    public static int[][] field1221;

    @OriginalMember(owner = "client!tq", name = "gb", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!tq", name = "hb", descriptor = "[I")
    public static int[] field1223;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!tq", name = "Y", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!tq", name = "cb", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!tq", name = "eb", descriptor = "Lbj;")
    public static class440 field1220;

    @OriginalMember(owner = "client!tq", name = "V", descriptor = "[I")
    private int[] field1211;

    @OriginalMember(owner = "client!tq", name = "M", descriptor = "[[I")
    private int[][] field1203;

    @OriginalMember(owner = "client!tq", name = "U", descriptor = "[[I")
    private int[][] field1210;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
    public static void method499(byte arg0) {
        field1217 = null;
        field1220 = null;
        field1199 = null;
        field1216 = null;
        field1219 = null;
        field1221 = null;
        field1223 = null;
        if (arg0 >= -51) {
            method501((class447) null, -25);
        }
    }

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 != -9) {
            field1216 = null;
        }
        ++field1214;
        this.method502(false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field1205;
        if (arg0 != 10) {
            this.field1215 = -75;
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = 0;
            int var5;
            for (var5 = class130.field1606[arg1] + this.field1198; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (var4 < this.field1204 && ~var5 <= ~this.field1211[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field1211[var4];
            int var9 = this.field1211[var4 - 1];
            if (this.field1202 + var9 < var5 && -this.field1202 + var8 > var5) {
                for (int var10 = 0; class132.field1627 > var10; ++var10) {
                    int var11 = var7 ? this.field1201 : -this.field1201;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field1213 * var11 >> 12) + class66.field881[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field1197 && ~var13 <= ~this.field1203[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field1203[var6][var12];
                    int var16 = this.field1203[var6][var14];
                    if (this.field1202 + var16 < var13 && -this.field1202 + var15 > var13) {
                        var3[var10] = this.field1210[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class205.method1315(var3, 0, class132.field1627, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        ++field1218;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field1215 = arg1.method3090(-76);
                                    }
                                } else {
                                    this.field1200 = arg1.method3090(-122);
                                }
                            } else {
                                this.field1198 = arg1.method3090(-88);
                            }
                        } else {
                            this.field1201 = arg1.method3090(-113);
                        }
                    } else {
                        this.field1208 = arg1.method3090(-122);
                    }
                } else {
                    this.field1206 = arg1.method3090(-128);
                }
            } else {
                this.field1204 = arg1.method3045(-126);
            }
        } else {
            this.field1197 = arg1.method3045(-128);
        }
        if (arg0 >= -89) {
            this.field1206 = -68;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ldc;BIII)V")
    public static final void method500(class23 arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field1209;
        class362 var5 = arg0.method144((byte) 64);
        if (arg1 != 33) {
            method501((class447) null, 58);
        }
        int var6 = 16383 & -arg0.field338.field458 + arg0.field407;
        if (arg4 != -1) {
            if (~arg0.field399 != 0 && (~var6 <= -10241 || ~var6 >= -2049)) {
                int var7 = 16383 & class199.field2600[arg3] + -arg0.field338.field458;
                if (arg4 == 2 && var5.field5035 != -1) {
                    if (~var7 < -2049 && var7 <= 6144 && ~var5.field5031 != 0) {
                        arg0.field350 = var5.field5031;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field5044 != 0) {
                        arg0.field350 = var5.field5044;
                    } else if (var7 > 6144 && ~var7 > -10241 && ~var5.field5064 != 0) {
                        arg0.field350 = var5.field5064;
                    } else {
                        arg0.field350 = var5.field5035;
                    }
                } else if (arg4 == 0 && var5.field5030 != -1) {
                    if (var7 > 2048 && ~var7 >= -6145 && var5.field5054 != -1) {
                        arg0.field350 = var5.field5054;
                    } else if (~var7 <= -10241 && ~var7 > -14337 && ~var5.field5063 != 0) {
                        arg0.field350 = var5.field5063;
                    } else if (~var7 < -6145 && var7 < 10240 && ~var5.field5052 != 0) {
                        arg0.field350 = var5.field5052;
                    } else {
                        arg0.field350 = var5.field5030;
                    }
                } else if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field5028 != 0) {
                    arg0.field350 = var5.field5028;
                } else if (var7 >= 10240 && var7 < 14336 && ~var5.field5047 != 0) {
                    arg0.field350 = var5.field5047;
                } else if (var7 > 6144 && ~var7 > -10241 && var5.field5056 != -1) {
                    arg0.field350 = var5.field5056;
                } else {
                    arg0.field350 = var5.field5065;
                }
                arg0.field398 = false;
            } else if (var6 == 0 && arg0.field401 <= 25) {
                if (arg4 == 2 && ~var5.field5035 != 0) {
                    arg0.field350 = var5.field5035;
                } else if (~arg4 == -1 && ~var5.field5030 != 0) {
                    arg0.field350 = var5.field5030;
                } else {
                    arg0.field350 = var5.field5065;
                }
                arg0.field398 = false;
            } else {
                arg0.field398 = false;
                if (arg4 == 2 && ~var5.field5035 != 0) {
                    if (~arg2 > -1 && var5.field5045 != -1) {
                        arg0.field350 = var5.field5045;
                    } else if (~arg2 < -1 && ~var5.field5048 != 0) {
                        arg0.field350 = var5.field5048;
                    } else {
                        arg0.field350 = var5.field5035;
                    }
                } else if (~arg4 == -1 && var5.field5030 != -1) {
                    if (arg2 < 0 && ~var5.field5062 != 0) {
                        arg0.field350 = var5.field5062;
                    } else if (~arg2 < -1 && ~var5.field5059 != 0) {
                        arg0.field350 = var5.field5059;
                    } else {
                        arg0.field350 = var5.field5030;
                    }
                } else if (arg2 < 0 && var5.field5029 != -1) {
                    arg0.field350 = var5.field5029;
                } else if (~arg2 < -1 && var5.field5077 != -1) {
                    arg0.field350 = var5.field5077;
                } else {
                    arg0.field350 = var5.field5065;
                }
            }
        } else if (var6 == 0 && ~arg0.field401 >= -26) {
            if (!arg0.field398 || !var5.method2243((byte) 106, arg0.field350)) {
                arg0.field350 = var5.method2238((byte) 42);
                arg0.field398 = ~arg0.field350 != 0;
            }
        } else {
            arg0.field398 = false;
            if (arg2 < 0 && ~var5.field5041 != 0) {
                arg0.field350 = var5.field5041;
            } else if (arg2 > 0 && ~var5.field5060 != 0) {
                arg0.field350 = var5.field5060;
            } else {
                arg0.field350 = var5.field5065;
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljq;I)V")
    public static final void method501(class447 arg0, int arg1) {
        if (~class592.field8557 == ~arg0.field6269) {
            class99.field1326[arg0.field6233] = true;
        }
        ++field1207;
        if (arg1 != -1) {
            method500((class23) null, (byte) 0, 23, 32, -95);
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "()V")
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
    private final void method502(boolean arg0) {
        ++field1196;
        if (arg0) {
            method500((class23) null, (byte) -70, 96, -92, 24);
        }
        Random var2 = new Random((long) this.field1204);
        this.field1212 = 4096 / this.field1204;
        this.field1202 = this.field1200 / 2;
        this.field1213 = 4096 / this.field1197;
        int var3 = this.field1213 / 2;
        this.field1210 = new int[this.field1204][this.field1197];
        int var4 = this.field1212 / 2;
        this.field1211 = new int[this.field1204 + 1];
        this.field1203 = new int[this.field1204][this.field1197 - -1];
        this.field1211[0] = 0;
        for (int var5 = 0; this.field1204 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1212;
                int var7 = (class585.method3373(var2, true, 4096) + -2048) * this.field1208 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1211[var5] = this.field1211[var5 + -1] + var8;
            }
            this.field1203[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1197; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field1213;
                    int var11 = (-2048 + class585.method3373(var2, !arg0, 4096)) * this.field1206 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1203[var5][var9] = this.field1203[var5][var9 - 1] + var12;
                }
                this.field1210[var5][var9] = ~this.field1215 < -1 ? 4096 - class585.method3373(var2, !arg0, this.field1215) : 4096;
            }
            this.field1203[var5][this.field1197] = 4096;
        }
        this.field1211[this.field1204] = 4096;
    }

    static {
        new class344("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
        field1216 = new float[16384];
        field1217 = new float[16384];
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field1216[var2] = (float) Math.sin((double) var2 * var0);
            field1217[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1219 = new class344(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");
        field1221 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
        field1222 = 0;
        field1223 = new int[] { 16, 32, 64, 128 };
    }
}
