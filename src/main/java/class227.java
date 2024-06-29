import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class227 extends class210 {

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public int field3397 = 1638;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "[B")
    private byte[] field3395 = new byte[512];

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public int field3405 = 4;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public int field3404 = 4;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    public int field3406 = 0;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public int field3413 = 4;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "Z")
    public boolean field3411 = true;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Lbt;")
    public static class363 field3408;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "[S")
    private short[] field3400;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "[S")
    private short[] field3410;

    static {
        new class409("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field3412 = 1401;
        field3408 = new class363(64);
        new class409("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI[I)V", line = 10)
    public final void method1552(byte arg0, int arg1, int[] arg2) {
        ++field3409;
        int var4 = class331.field4911[arg1] * this.field3405;
        if (arg0 != -1) {
            this.field3397 = 63;
        }
        if (this.field3404 != 1) {
            short var5 = this.field3400[0];
            if (var5 > 8 || var5 < -8) {
                int var6 = this.field3410[0] << 12;
                int var7 = this.field3413 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field3405 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 + 1;
                int var12 = var8 & 4095;
                if (~var9 >= ~var11) {
                    var11 = 0;
                }
                int var13 = this.field3395[var10 & 255] & 255;
                int var14 = class129.field1690[var12];
                int var15 = this.field3395[var11 & 255] & 255;
                for (int var16 = 0; var16 < class202.field2852; ++var16) {
                    int var36 = class430.field6250[var16] * this.field3413;
                    int var37 = this.method1555(var14, var15, var13, var12, (byte) 109, var6 * var36 >> 12, var7);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; ~this.field3404 < ~var17; ++var17) {
                short var18 = this.field3400[var17];
                if (~var18 < -9 || ~var18 > 7) {
                    int var19 = this.field3410[var17] << 12;
                    int var20 = this.field3413 * var19 >> 12;
                    int var21 = this.field3405 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    if (var21 <= var24) {
                        var24 = 0;
                    }
                    int var25 = var22 & 4095;
                    int var26 = this.field3395[var24 & 255] & 255;
                    int var27 = 255 & this.field3395[var23 & 255];
                    int var28 = class129.field1690[var25];
                    if (this.field3411 && this.field3404 + -1 == var17) {
                        for (int var29 = 0; class202.field2852 > var29; ++var29) {
                            int var30 = class430.field6250[var29] * this.field3413;
                            int var31 = this.method1555(var28, var26, var27, var25, (byte) 122, var19 * var30 >> 12, var20);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; class202.field2852 > var33; ++var33) {
                            int var34 = class430.field6250[var33] * this.field3413;
                            int var35 = this.method1555(var28, var26, var27, var25, (byte) 116, var19 * var34 >> 12, var20);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            int var38 = this.field3410[0] << 12;
            short var39 = this.field3400[0];
            int var40 = var4 * var38 >> 12;
            int var41 = this.field3405 * var38 >> 12;
            int var42 = this.field3413 * var38 >> 12;
            int var43 = var40 >> 12;
            int var44 = var43 + 1;
            int var45 = var40 & 4095;
            if (var44 >= var41) {
                var44 = 0;
            }
            int var46 = this.field3395[255 & var43] & 255;
            int var47 = 255 & this.field3395[255 & var44];
            int var48 = class129.field1690[var45];
            if (!this.field3411) {
                for (int var49 = 0; ~class202.field2852 < ~var49; ++var49) {
                    int var50 = class430.field6250[var49] * this.field3413;
                    int var51 = this.method1555(var48, var47, var46, var45, (byte) 125, var38 * var50 >> 12, var42);
                    arg2[var49] = var39 * var51 >> 12;
                }
            } else {
                for (int var52 = 0; var52 < class202.field2852; ++var52) {
                    int var53 = class430.field6250[var52] * this.field3413;
                    int var54 = this.method1555(var48, var47, var46, var45, (byte) 111, var38 * var53 >> 12, var42);
                    int var55 = var39 * var54 >> 12;
                    arg2[var52] = (var55 >> 1) + 2048;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILat;)V", line = 166)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field3393;
        if (arg1 == -11941) {
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field3404 = arg2.method1738((byte) 74);
                } else {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field3413 = this.field3405 = arg2.method1738((byte) -106);
                            return;
                        }
                        if (arg0 == 4) {
                            this.field3406 = arg2.method1738((byte) -76);
                            return;
                        }
                        if (~arg0 == -6) {
                            this.field3413 = arg2.method1738((byte) -108);
                            return;
                        }
                        if (~arg0 == -7) {
                            this.field3405 = arg2.method1738((byte) -66);
                            return;
                        }
                    } else {
                        this.field3397 = arg2.method1747((byte) 12);
                        if (this.field3397 < 0) {
                            this.field3400 = new short[this.field3404];
                            for (int var5 = 0; var5 < this.field3404; ++var5) {
                                this.field3400[var5] = (short) arg2.method1747((byte) 12);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field3411 = ~arg2.method1738((byte) 81) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lct;Z)V", line = 259)
    public static final void method1553(class104 arg0, boolean arg1) {
        class404.field5853 = arg0;
        if (arg1) {
            method1559(79);
        }
        ++field3396;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V", line = 271)
    public static final void method1554(boolean arg0, int arg1) {
        if (arg0) {
            if (class318.field4672 != -1) {
                class464.method2866((byte) -70, class318.field4672);
            }
            for (class182 var2 = (class182) class252.field3703.method608((byte) 121); var2 != null; var2 = (class182) class252.field3703.method604(-122)) {
                if (!var2.method1822(-113)) {
                    var2 = (class182) class252.field3703.method608((byte) 120);
                    if (var2 == null) {
                        break;
                    }
                }
                class240.method1615(false, true, (byte) 127, var2);
            }
            class318.field4672 = -1;
            class252.field3703 = new class90(8);
            class200.method1384(0);
            class318.field4672 = class417.field6021;
            class298.method1981(false, (byte) -121);
            class51.method400(-124);
            class107.method764(class318.field4672);
        }
        ++field3402;
        class252.method1667(-23812);
        if (arg1 <= -75) {
            class392.field5703 = -1;
            class330.method2157(class458.field6762, -1);
            class187.field2619 = new class380();
            class187.field2619.field793[0] = 52;
            class187.field2619.field4951 = 6656;
            class187.field2619.field4954 = 6656;
            class345.field5077 = 0;
            class298.field4343 = 0;
            class187.field2619.field784[0] = 52;
            if (class28.field402 == 2) {
                class345.field5077 = class86.field1064 << 7;
                class298.field4343 = class2.field27 << 7;
            } else {
                class213.method1459(false);
            }
            class365.method2329(121);
            if (~class298.field4343 != -1 && ~class345.field5077 != -1) {
                class90.method610(0);
                client.method1796(28, 126);
            } else {
                client.method1796(10, 123);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 340)
    public class227() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 351)
    public final void method363(int arg0) {
        ++field3398;
        this.field3395 = class302.method2012((byte) -127, this.field3406);
        this.method1556((byte) 127);
        if (arg0 != 0) {
            this.method1556((byte) -80);
        }
        for (int var2 = this.field3404 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field3400[var2];
            if (~var3 < -9 || ~var3 > 7) {
                return;
            }
            --this.field3404;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIBII)I", line = 385)
    private final int method1555(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field3401;
        int var8 = arg5 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        if (~var9 <= ~arg6) {
            var9 = 0;
        }
        int var11 = arg5 & 4095;
        int var12 = var11 + -4096;
        int var13 = arg3 + -4096;
        if (arg4 < 105) {
            this.method1552((byte) 25, 53, (int[]) null);
        }
        int var14 = var9 & 255;
        int var15 = 3 & this.field3395[var10 - -arg2];
        int var16 = class129.field1690[var11];
        int var17;
        if (var15 <= 1) {
            var17 = var15 != 0 ? -var11 + arg3 : var11 - -arg3;
        } else {
            var17 = ~var15 != -3 ? -arg3 + -var11 : -arg3 + var11;
        }
        int var18 = this.field3395[arg2 + var14] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = var18 != 0 ? arg3 - var12 : arg3 + var12;
        } else {
            var19 = var18 != 2 ? -arg3 + -var12 : var12 - arg3;
        }
        int var20 = ((-var17 + var19) * var16 >> 12) + var17;
        int var21 = this.field3395[arg1 + var10] & 3;
        int var22;
        if (~var21 >= -2) {
            var22 = var21 != 0 ? -var11 + var13 : var11 - -var13;
        } else {
            var22 = ~var21 != -3 ? -var11 - var13 : -var13 + var11;
        }
        int var23 = 3 & this.field3395[arg1 + var14];
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 != -1 ? -var12 + var13 : var12 - -var13;
        } else {
            var24 = ~var23 != -3 ? -var12 + -var13 : -var13 + var12;
        }
        int var25 = ((-var22 + var24) * var16 >> 12) + var22;
        return ((-var20 + var25) * arg0 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V", line = 471)
    private final void method1556(byte arg0) {
        ++field3394;
        int var2 = -31 % ((arg0 - 32) / 63);
        if (this.field3397 <= 0) {
            if (this.field3400 != null && ~this.field3400.length == ~this.field3404) {
                this.field3410 = new short[this.field3404];
                for (int var3 = 0; var3 < this.field3404; ++var3) {
                    this.field3410[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
                return;
            }
        } else {
            this.field3410 = new short[this.field3404];
            this.field3400 = new short[this.field3404];
            for (int var4 = 0; this.field3404 > var4; ++var4) {
                this.field3400[var4] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field3397 / 4096.0F), (double) var4)));
                this.field3410[var4] = (short) ((int) Math.pow(2.0D, (double) var4));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)Leg;", line = 514)
    public static final class376 method1557(int arg0) {
        ++field3403;
        if (class66.field857 != null && class71.field931 != null) {
            if (arg0 <= 102) {
                method1558((byte) -92, (class223) null, -61, -62);
            }
            for (class376 var1 = (class376) class71.field931.method1006((byte) -25); var1 != null; var1 = (class376) class71.field931.method1006((byte) -25)) {
                class110 var2 = class443.method2721(-12, var1.field5483);
                if (var2 != null && var2.field1484 && var2.method788((byte) -123)) {
                    return var1;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[I", line = 556)
    public final int[] method361(int arg0, byte arg1) {
        ++field3407;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            this.method1552((byte) -1, arg0, var3);
        }
        if (arg1 != -38) {
            this.field3406 = 48;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLkg;II)V", line = 582)
    public static final void method1558(byte arg0, class223 arg1, int arg2, int arg3) {
        ++field3399;
        if (arg0 <= -53) {
            if (~arg1.field3278 == -1) {
                arg1.field3288 = arg1.field3220;
            } else if (~arg1.field3278 == -2) {
                arg1.field3288 = (-arg1.field3233 + arg3) / 2 + arg1.field3220;
            } else if (~arg1.field3278 == -3) {
                arg1.field3288 = -arg1.field3233 + arg3 - arg1.field3220;
            } else if (~arg1.field3278 == -4) {
                arg1.field3288 = arg1.field3220 * arg3 >> 14;
            } else if (~arg1.field3278 == -5) {
                arg1.field3288 = (arg1.field3220 * arg3 >> 14) + (-arg1.field3233 + arg3) / 2;
            } else {
                arg1.field3288 = -arg1.field3233 + arg3 + -(arg1.field3220 * arg3 >> 14);
            }
            if (arg1.field3222 != 0) {
                if (~arg1.field3222 == -2) {
                    arg1.field3362 = (arg2 - arg1.field3352) / 2 - -arg1.field3301;
                } else if (~arg1.field3222 == -3) {
                    arg1.field3362 = -arg1.field3352 + arg2 + -arg1.field3301;
                } else if (~arg1.field3222 != -4) {
                    if (arg1.field3222 != 4) {
                        arg1.field3362 = arg2 - (arg1.field3352 - -(arg1.field3301 * arg2 >> 14));
                    } else {
                        arg1.field3362 = (arg2 - arg1.field3352) / 2 - -(arg1.field3301 * arg2 >> 14);
                    }
                } else {
                    arg1.field3362 = arg1.field3301 * arg2 >> 14;
                }
            } else {
                arg1.field3362 = arg1.field3301;
            }
            if (class159.field2133) {
                if (client.method1811(arg1).field4926 == 0 && arg1.field3216 != 0) {
                    return;
                }
                if (arg1.field3288 >= 0) {
                    if (~(arg1.field3288 + arg1.field3233) < ~arg3) {
                        arg1.field3288 = -arg1.field3233 + arg3;
                    }
                } else {
                    arg1.field3288 = 0;
                }
                if (arg1.field3362 < 0) {
                    arg1.field3362 = 0;
                    return;
                }
                if (~arg2 > ~(arg1.field3362 + arg1.field3352)) {
                    arg1.field3362 = -arg1.field3352 + arg2;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)V", line = 654)
    public static void method1559(int arg0) {
        field3408 = null;
        if (arg0 != 1437891116) {
            field3408 = null;
        }
    }
}
