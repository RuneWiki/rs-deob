import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class345 extends class304 implements class267 {

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "Lji;")
    public class472 field5374;

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "Z")
    private boolean field5364;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "[I")
    public static int[] field5371 = new int[25];

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "Lss;")
    public static class213 field5378 = new class213("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "Ljava/lang/String;")
    public static String field5379 = "";

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!ap", name = "C", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
    public static int field5375;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)I")
    public final int method98(int arg0) {
        if (arg0 != 0) {
            field5378 = null;
        }
        ++field5373;
        return this.field5374.method2937(false);
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lza;Loq;IIIIIZIIIIII)V")
    public class345(class497 arg0, class156 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class119.method752(arg12, 256, arg11));
        this.field5374 = new class472(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field5364 = ~arg1.field2079 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ZLza;I)Le;")
    public final class536 method107(boolean arg0, class497 arg1, int arg2) {
        if (arg0) {
            this.method107(true, (class497) null, 33);
        }
        ++field5377;
        return this.field5374.method2945(0, arg2, false, (byte) -7, 0, false, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lza;I)V")
    public final void method104(class497 arg0, int arg1) {
        if (arg1 != 26768) {
            field5371 = null;
        }
        ++field5365;
        this.field5374.method2941(false, arg0);
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(ILza;)V")
    public final void method102(int arg0, class497 arg1) {
        ++field5369;
        if (arg0 != -1) {
            this.method96((byte) 77);
        }
        class536 var3 = this.field5374.method2945(super.field4790, 262144, false, (byte) -7, super.field4788, true, arg1);
        if (var3 != null) {
            int var4 = super.field4788 >> 7;
            int var5 = super.field4790 >> 7;
            this.field5374.method2940(var4, var4, var5, arg1, var3, -117, var5, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method2280(String arg0, byte arg1, boolean arg2) {
        class181.field2636.field2342 = 1;
        ++field5375;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; ~var6 > ~class337.field5262.field4840; ++var6) {
            class196 var10 = class337.field5262.method2077((byte) -65, var6);
            if ((!arg2 || var10.field2969) && var10.field3010 == -1 && ~var10.field2983 == 0 && ~var10.field3004 == -1 && var10.field3034.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class152.field2019 = null;
                    class454.field7028 = -1;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var5 > var12; ++var12) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var5++] = (short) var6;
            }
        }
        class77.field1148 = 0;
        class454.field7028 = var5;
        class152.field2019 = var4;
        int var7 = 64 / ((59 - arg1) / 46);
        String[] var8 = new String[class454.field7028];
        for (int var9 = 0; ~class454.field7028 < ~var9; ++var9) {
            var8[var9] = class337.field5262.method2077((byte) -65, var4[var9]).field3034;
        }
        class427.method2700(class152.field2019, var8, 0);
        class181.field2636.method1013(0);
        class181.field2636.field2342 = 2;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)I")
    public final int method106(byte arg0) {
        ++field5362;
        if (arg0 != 18) {
            field5378 = null;
        }
        return this.field5374.field7232;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II)V")
    public static final void method2281(int arg0, int arg1) {
        if (arg1 < -49) {
            ++field5363;
            if (class385.method2479(0, arg0)) {
                class266.method1814((byte) -121, -1, class433.field6540[arg0]);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(B)V")
    public static final void method2282(byte arg0) {
        ++field5360;
        if (class132.field1797 != -1 && class292.field4605 != -1) {
            int var1 = ((-class462.field7110 + class375.field5748) * class72.field1092 >> 16) + class462.field7110;
            class72.field1092 += var1;
            if (class72.field1092 < 65535) {
                class440.field6825 = false;
                class379.field5836 = false;
            } else {
                class72.field1092 = 65535;
                if (!class379.field5836) {
                    class440.field6825 = true;
                } else {
                    class440.field6825 = false;
                }
                class379.field5836 = true;
            }
            float var2 = (float) class72.field1092 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class201.field3055 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class123.field1676[class132.field1797][var4][var5] * 3;
                int var22 = class123.field1676[class132.field1797][var4 + 1][var5] * 3;
                int var23 = (class123.field1676[class132.field1797][var4 + 2][var5] - (class123.field1676[class132.field1797][var4 + 3][var5] + -class123.field1676[class132.field1797][var4 - -2][var5])) * 3;
                int var24 = class123.field1676[class132.field1797][var4][var5];
                int var25 = -var21 + var22;
                int var26 = -(var22 * 2) + var21 + var23;
                int var27 = class123.field1676[class132.field1797][var4 - -2][var5] - (-var22 - -var23 + var24);
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class163.field2367 = (int) var3[0] + -(class453.field7018 * 128);
            class371.field5703 = (int) var3[1] * -1;
            class98.field1404 = (int) var3[2] + -(class126.field1718 * 128);
            float[] var6 = new float[3];
            int var7 = class517.field7681 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class123.field1676[class292.field4605][var7][var8] * 3;
                int var15 = class123.field1676[class292.field4605][var7 + 1][var8] * 3;
                int var16 = (-class123.field1676[class292.field4605][var7 + 3][var8] - -class123.field1676[class292.field4605][var7 - -2][var8] + class123.field1676[class292.field4605][var7 + 2][var8]) * 3;
                int var17 = class123.field1676[class292.field4605][var7][var8];
                int var18 = var15 - var14;
                int var19 = -(var15 * 2) + var16 + var14;
                int var20 = class123.field1676[class292.field4605][var7 + 2][var8] - (var17 - (-var16 + var15));
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] + -var3[0];
            if (arg0 > -123) {
                method2284((byte) -94);
            }
            float var10 = (var6[1] - var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class220.field3723 = 16383 & (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D);
            class387.field5912 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
            class253.field4106 = ((class123.field1676[class132.field1797][var4 + 2][3] + -class123.field1676[class132.field1797][var4][3]) * class72.field1092 >> 16) + class123.field1676[class132.field1797][var4][3];
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ILza;)Lon;")
    public final class514 method108(int arg0, class497 arg1) {
        ++field5368;
        class536 var3 = this.field5374.method2945(super.field4790, 2048, false, (byte) -7, super.field4788, true, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 != 2) {
            return null;
        } else {
            class205 var4 = arg1.method1231();
            var4.method158(super.field4788 + super.field4781, super.field4782, super.field4790 - -super.field4777);
            class514 var5 = null;
            if (this.field5364) {
                var5 = class104.method706(0, 1);
            }
            if (this.field5374.field7222 != null) {
                class519 var6 = this.field5374.field7222.method2354();
                arg1.method1291(var3, var6, var4, var5 == null ? null : var5.field7629[0], 0);
            } else {
                var3.method295(var4, var5 == null ? null : var5.field7629[0], 0);
            }
            int var7 = super.field4788 >> 7;
            int var8 = super.field4790 >> 7;
            this.field5374.method2940(var7, var7, var8, arg1, var3, -113, var8, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILza;)V")
    public final void method97(int arg0, class497 arg1) {
        ++field5367;
        if (arg0 != -6682) {
            this.method99((byte) -128);
        }
        this.field5374.method2938(-25, arg1);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IC)B")
    public static final byte method2283(int arg0, char arg1) {
        ++field5361;
        if (arg0 != 23251) {
            method2280((String) null, (byte) -8, true);
        }
        byte var2;
        if ((arg1 <= 0 || arg1 >= 128) && (arg1 < 160 || ~arg1 < -256)) {
            if (arg1 != 8364) {
                if (~arg1 == -8219) {
                    var2 = -126;
                } else if (~arg1 == -403) {
                    var2 = -125;
                } else if (~arg1 == -8223) {
                    var2 = -124;
                } else if (~arg1 == -8231) {
                    var2 = -123;
                } else if (arg1 == 8224) {
                    var2 = -122;
                } else if (arg1 == 8225) {
                    var2 = -121;
                } else if (~arg1 != -711) {
                    if (arg1 != 8240) {
                        if (~arg1 != -353) {
                            if (~arg1 != -8250) {
                                if (~arg1 == -339) {
                                    var2 = -116;
                                } else if (~arg1 != -382) {
                                    if (arg1 == 8216) {
                                        var2 = -111;
                                    } else if (arg1 == 8217) {
                                        var2 = -110;
                                    } else if (~arg1 != -8221) {
                                        if (arg1 != 8221) {
                                            if (arg1 == 8226) {
                                                var2 = -107;
                                            } else if (arg1 == 8211) {
                                                var2 = -106;
                                            } else if (arg1 != 8212) {
                                                if (arg1 != 732) {
                                                    if (~arg1 == -8483) {
                                                        var2 = -103;
                                                    } else if (~arg1 == -354) {
                                                        var2 = -102;
                                                    } else if (~arg1 == -8251) {
                                                        var2 = -101;
                                                    } else if (~arg1 != -340) {
                                                        if (~arg1 == -383) {
                                                            var2 = -98;
                                                        } else if (~arg1 == -377) {
                                                            var2 = -97;
                                                        } else {
                                                            var2 = 63;
                                                        }
                                                    } else {
                                                        var2 = -100;
                                                    }
                                                } else {
                                                    var2 = -104;
                                                }
                                            } else {
                                                var2 = -105;
                                            }
                                        } else {
                                            var2 = -108;
                                        }
                                    } else {
                                        var2 = -109;
                                    }
                                } else {
                                    var2 = -114;
                                }
                            } else {
                                var2 = -117;
                            }
                        } else {
                            var2 = -118;
                        }
                    } else {
                        var2 = -119;
                    }
                } else {
                    var2 = -120;
                }
            } else {
                var2 = -128;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIILza;)Z")
    public final boolean method105(int arg0, int arg1, int arg2, class497 arg3) {
        if (arg1 != 32689) {
            field5378 = null;
        }
        ++field5372;
        class536 var5 = this.field5374.method2945(super.field4790, 131072, false, (byte) -7, super.field4788, false, arg3);
        if (var5 == null) {
            return false;
        } else {
            class205 var6 = arg3.method1231();
            var6.method158(super.field4788 + super.field4781, super.field4782, super.field4790 + super.field4777);
            return var5.method298(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)Z")
    public final boolean method103(int arg0) {
        ++field5370;
        if (arg0 >= -95) {
            field5378 = null;
        }
        return this.field5374.method2946(125);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)I")
    public final int method96(byte arg0) {
        ++field5359;
        return arg0 <= 87 ? -46 : this.field5374.field7233;
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)I")
    public final int method99(byte arg0) {
        ++field5376;
        return arg0 <= 53 ? -112 : this.field5374.field7227;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public final void method100(boolean arg0) {
        if (!arg0) {
            ++field5366;
        }
    }

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "(B)V")
    public static void method2284(byte arg0) {
        if (arg0 < 58) {
            field5379 = null;
        }
        field5379 = null;
        field5378 = null;
        field5371 = null;
    }

    static {
        new class213("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        new class213("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
    }
}
