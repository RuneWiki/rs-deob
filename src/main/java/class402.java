import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class402 {

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lqs;")
    private class360 field5758;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lnh;")
    private class448 field5759;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lqb;")
    private class121 field5754;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lwq;")
    public static class92 field5762 = new class92();

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Z")
    public static boolean field5768 = true;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field5765;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Ldg;")
    private class236 field5764;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5767;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[Lre;")
    private class359[] field5766;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLgb;IBLgb;)Lre;")
    private final class359 method2559(boolean arg0, class117 arg1, int arg2, byte arg3, class117 arg4) {
        field5763++;
        if (this.field5764 == null) {
            throw new RuntimeException();
        }
        this.field5764.field3320 = arg2 * 8 + 5;
        if (this.field5764.field3320 >= this.field5764.field3364.length) {
            throw new RuntimeException();
        } else if (this.field5766[arg2] == null) {
            int var6 = this.field5764.method1597(3641);
            int var7 = this.field5764.method1597(3641);
            if (arg3 != -4) {
                method2560(-121);
            }
            class359 var8 = new class359(arg2, arg1, arg4, this.field5758, this.field5759, var6, var7, arg0);
            this.field5766[arg2] = var8;
            return var8;
        } else {
            return this.field5766[arg2];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method2560(int arg0) {
        field5762 = null;
        field5767 = null;
        if (arg0 != -24167) {
            method2560(-94);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static final void method2561(int arg0) {
        field5756++;
        if (class403.field5788 != null) {
            if (class403.field5788.field4498 == 1) {
                class403.field5788 = null;
                return;
            }
            if (class403.field5788.field4498 == 2) {
                class12.method90(8, class276.field3919, class376.field5287, 2);
                class403.field5788 = null;
                return;
            }
        }
        if (arg0 != 1) {
            field5767 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lae;IIII[Lp;IZ[BI)[I")
    private static final int[] method2562(class134 arg0, int arg1, int arg2, int arg3, int arg4, class119[] arg5, int arg6, boolean arg7, byte[] arg8, int arg9) {
        field5765++;
        if (!arg7) {
            for (int var10 = 0; var10 < 4; var10++) {
                class119 var11 = arg5[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg1 + var12;
                        int var15 = arg9 + var13;
                        if (var14 >= 0 && var14 < class176.field2403 && var15 >= 0 && class383.field5395 > var15) {
                            var11.method737(var14, var15, -2097153);
                        }
                    }
                }
            }
        }
        class236 var16 = new class236(arg8);
        int var17 = arg6 + arg1;
        int var18 = arg2 + arg9;
        for (int var19 = 0; var19 < arg3; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class94.method521(var18 + var56, 0, arg7, arg1 + var55, -106, 0, 0, var17 + var55, false, var19, arg9 + var56, var16);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3320 < var16.field3364.length) {
            int var22 = var16.method1574(-79);
            if (var22 == 128) {
                class189.field2723[0] = var16.method1617((byte) 48);
                class189.field2723[1] = var16.method1613(126);
                class189.field2723[2] = var16.method1613(112);
                class189.field2723[3] = var16.method1613(65);
                var20 = true;
                class189.field2723[4] = var16.method1617((byte) 48);
            } else {
                if (var22 != 129) {
                    var16.field3320--;
                    break;
                }
                if (class327.field4639 == null) {
                    class327.field4639 = new byte[4][][];
                }
                var21 = true;
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method1589(false);
                    if (var41 == 0 && class327.field4639[var40] != null) {
                        int var42 = arg1;
                        int var43 = arg1 + 64;
                        int var44 = arg9;
                        int var45 = arg9 + 64;
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (var43 >= class176.field2403) {
                            var43 = class176.field2403;
                        }
                        if (arg1 < 0) {
                            var42 = 0;
                        } else if (arg1 >= class176.field2403) {
                            var42 = class176.field2403;
                        }
                        if (arg9 < 0) {
                            var44 = 0;
                        } else if (arg9 >= class383.field5395) {
                            var44 = class383.field5395;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 >= class383.field5395) {
                            var45 = class383.field5395;
                        }
                        while (var43 > var42) {
                            while (var45 > var44) {
                                class327.field4639[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class327.field4639[var40] == null) {
                            class327.field4639[var40] = new byte[class176.field2403 + 1][class383.field5395 + 1];
                        }
                        for (int var46 = 0; var46 < 64; var46 += 4) {
                            for (int var47 = 0; var47 < 64; var47 += 4) {
                                byte var48 = var16.method1589(false);
                                for (int var49 = var46 + arg1; var49 < (arg1 + var46 + 4); var49++) {
                                    for (int var50 = arg9 + var47; var50 < arg9 + var47 + 4; var50++) {
                                        if (var49 >= 0 && var49 < class176.field2403 && var50 >= 0 && var50 < class383.field5395) {
                                            class327.field4639[var40][var49][var50] = var48;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class327.field4639[var40] == null) {
                            class327.field4639[var40] = new byte[class176.field2403 + 1][class383.field5395 + 1];
                        }
                        if (var40 > 0) {
                            int var51 = arg1;
                            int var52 = arg1 + 64;
                            int var53 = arg9;
                            if (arg1 < 0) {
                                var51 = 0;
                            } else if (class176.field2403 <= arg1) {
                                var51 = class176.field2403;
                            }
                            if (arg9 < 0) {
                                var53 = 0;
                            } else if (arg9 >= class383.field5395) {
                                var53 = class383.field5395;
                            }
                            if (var52 < 0) {
                                var52 = 0;
                            } else if (class176.field2403 <= var52) {
                                var52 = class176.field2403;
                            }
                            int var54 = arg9 + 64;
                            if (var54 < 0) {
                                var54 = 0;
                            } else if (class383.field5395 <= var54) {
                                var54 = class383.field5395;
                            }
                            while (var52 > var51) {
                                while (var54 > var53) {
                                    class327.field4639[var40][var51][var53] = class327.field4639[var40 - 1][var51][var53];
                                    var53++;
                                }
                                var51++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg7) {
            class180 var23 = null;
            label291: while (true) {
                int var29;
                label284: do {
                    while (true) {
                        while (var16.field3364.length > var16.field3320) {
                            int var28 = var16.method1574(-62);
                            if (var28 == 0) {
                                var23 = new class180(var16);
                            } else {
                                if (var28 == 1) {
                                    var29 = var16.method1574(-31);
                                    continue label284;
                                }
                                if (var28 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var23 == null) {
                                    var23 = new class180();
                                }
                                var23.method1213(var16, arg4 ^ 0xFFFF87C8);
                            }
                        }
                        if (var23 != null) {
                            for (int var24 = 0; var24 < 8; var24++) {
                                for (int var25 = 0; var25 < 8; var25++) {
                                    int var26 = (arg1 >> 3) + var24;
                                    int var27 = (arg9 >> 3) + var25;
                                    if (var26 >= 0 && var26 < (class176.field2403 >> 3) && var27 >= 0 && var27 < class383.field5395 >> 3) {
                                        class232.method1537(var26, (byte) -105, var27, var23);
                                    }
                                }
                            }
                        }
                        break label291;
                    }
                } while (var29 <= 0);
                for (int var30 = 0; var30 < var29; var30++) {
                    class12 var31 = new class12(var16);
                    if (var31.field164 == 31) {
                        class56 var32 = class396.method2528(-3400, var16.method1617((byte) 48));
                        var31.method85((byte) -111, var32.field672, var32.field674, var32.field675, var32.field681);
                    }
                    var31.field5682 += arg1 << 7;
                    var31.field5687 += arg9 << 7;
                    int var33 = var31.field5682 >> 7;
                    int var34 = var31.field5687 >> 7;
                    if (var33 >= 0 && var34 >= 0 && class176.field2403 > var33 && class383.field5395 > var34) {
                        var31.field5680 = class419.field5994[var31.field167][var33][var34] - var31.field5680;
                        if (arg0.method602() > 0) {
                            class303.method2003(var31);
                        }
                    }
                }
            }
        }
        if (!var21 && class327.field4639 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class327.field4639[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg1 >> 2) + var36;
                            int var39 = (arg9 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class327.field4639[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg4 != -30904) {
            field5762 = null;
        }
        if (var20) {
            return class189.field2723;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lgb;IILgb;)Lre;")
    public final class359 method2563(class117 arg0, int arg1, int arg2, class117 arg3) {
        field5761++;
        if (arg2 != 0) {
            method2566(-54, false);
        }
        return this.method2559(true, arg3, arg1, (byte) -4, arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public final void method2564(byte arg0) {
        int var2 = -66 / ((37 - arg0) / 53);
        field5757++;
        if (this.field5766 == null) {
            return;
        }
        for (int var3 = 0; var3 < this.field5766.length; var3++) {
            if (this.field5766[var3] != null) {
                this.field5766[var3].method2306(-1);
            }
        }
        for (int var4 = 0; var4 < this.field5766.length; var4++) {
            if (this.field5766[var4] != null) {
                this.field5766[var4].method2304((byte) 24);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z")
    public final boolean method2565(byte arg0) {
        field5760++;
        if (this.field5764 != null) {
            return true;
        }
        if (arg0 > -95) {
            field5767 = null;
        }
        if (this.field5754 == null) {
            if (this.field5758.method2327(true)) {
                return false;
            }
            this.field5754 = this.field5758.method2326(255, (byte) 0, false, true, 255);
        }
        if (this.field5754.field4971) {
            return false;
        } else {
            this.field5764 = new class236(this.field5754.method772(1));
            this.field5766 = new class359[(this.field5764.field3364.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)V")
    public static final void method2566(int arg0, boolean arg1) {
        field5755++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var3 = 1;
            var2 = class366.field5187;
        } else {
            var2 = class193.field2798;
            var3 = 4;
        }
        int var4 = var2.length;
        if (arg0 != 21678) {
            return;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class33.field380[var5] >> 8;
            int var14 = class33.field380[var5] & 0xFF;
            int var15 = var13 * 64 - class114.field1403;
            int var16 = var14 * 64 - class41.field496;
            if (var12 != null) {
                class356.method2270(false);
                var11 = method2562(class151.field1873, var15, class41.field496, var3, -30904, class102.field1247, class114.field1403, arg1, var12, var16);
            }
            if (!arg1 && class153.field1896 / 8 == var13 && class291.field4066 / 8 == var14) {
                if (var11 == null) {
                    class332.field4704 = null;
                } else {
                    class332.field4704 = class405.method2589(var11[3], var11[1], 32412, var11[0], var11[2]);
                    class127.field1541 = var11[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class33.field380[var6] >> 8) * 64 - class114.field1403;
            int var8 = (class33.field380[var6] & 0xFF) * 64 - class41.field496;
            byte[] var9 = var2[var6];
            if (var9 == null && class291.field4066 < 800) {
                class356.method2270(false);
                for (int var10 = 0; var10 < var3; var10++) {
                    class232.method1535(var8, 64, var10, -117, var7, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lqs;Lnh;)V")
    public class402(class360 arg0, class448 arg1) {
        this.field5758 = arg0;
        this.field5759 = arg1;
        if (!this.field5758.method2327(true)) {
            this.field5754 = this.field5758.method2326(255, (byte) 0, false, true, 255);
        }
    }

    static {
        new class138(64);
        new class362("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
    }
}
