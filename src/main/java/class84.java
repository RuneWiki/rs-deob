import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class84 extends class439 {

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    private int field1028;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    private int field1022;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    private int field1020;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    private int field1026;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    private int field1030;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    private int field1032;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    private int field1024;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(JJ)J")
    public static long method495(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BLkj;)V")
    public static final void method496(byte arg0, class484 arg1) {
        ++field1021;
        int var2 = 0;
        arg1.method2806(-1);
        for (int var3 = 0; class370.field4878 > var3; ++var3) {
            int var15 = class519.field7302[var3];
            if (~(class385.field5080[var15] & 1) == -1) {
                if (var2 > 0) {
                    --var2;
                    class385.field5080[var15] = (byte) class42.method223(class385.field5080[var15], 2);
                } else {
                    int var16 = arg1.method2813(1, 120);
                    if (~var16 == -1) {
                        var2 = class412.method2353(arg1, -126);
                        class385.field5080[var15] = (byte) class42.method223(class385.field5080[var15], 2);
                    } else {
                        class118.method694(arg1, -8596, var15);
                    }
                }
            }
        }
        arg1.method2814((byte) 102);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg1.method2806(-1);
            if (arg0 <= 69) {
                method497((byte) 69);
            }
            for (int var4 = 0; ~var4 > ~class370.field4878; ++var4) {
                int var13 = class519.field7302[var4];
                if (~(class385.field5080[var13] & 1) != -1) {
                    if (var2 > 0) {
                        class385.field5080[var13] = (byte) class42.method223(class385.field5080[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg1.method2813(1, -7);
                        if (var14 == 0) {
                            var2 = class412.method2353(arg1, -120);
                            class385.field5080[var13] = (byte) class42.method223(class385.field5080[var13], 2);
                        } else {
                            class118.method694(arg1, -8596, var13);
                        }
                    }
                }
            }
            arg1.method2814((byte) 77);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg1.method2806(-1);
                for (int var5 = 0; var5 < class207.field2496; ++var5) {
                    int var11 = class537.field7631[var5];
                    if (~(1 & class385.field5080[var11]) != -1) {
                        if (var2 > 0) {
                            class385.field5080[var11] = (byte) class42.method223(class385.field5080[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg1.method2813(1, -117);
                            if (var12 == 0) {
                                var2 = class412.method2353(arg1, -103);
                                class385.field5080[var11] = (byte) class42.method223(class385.field5080[var11], 2);
                            } else if (class632.method3631(-90, arg1, var11)) {
                                class385.field5080[var11] = (byte) class42.method223(class385.field5080[var11], 2);
                            }
                        }
                    }
                }
                arg1.method2814((byte) 114);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg1.method2806(-1);
                    for (int var6 = 0; var6 < class207.field2496; ++var6) {
                        int var9 = class537.field7631[var6];
                        if (~(1 & class385.field5080[var9]) == -1) {
                            if (var2 > 0) {
                                --var2;
                                class385.field5080[var9] = (byte) class42.method223(class385.field5080[var9], 2);
                            } else {
                                int var10 = arg1.method2813(1, -6);
                                if (~var10 == -1) {
                                    var2 = class412.method2353(arg1, -97);
                                    class385.field5080[var9] = (byte) class42.method223(class385.field5080[var9], 2);
                                } else if (class632.method3631(-60, arg1, var9)) {
                                    class385.field5080[var9] = (byte) class42.method223(class385.field5080[var9], 2);
                                }
                            }
                        }
                    }
                    arg1.method2814((byte) 114);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class207.field2496 = 0;
                        class370.field4878 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class385.field5080[var7] = (byte) (class385.field5080[var7] >> 1);
                            class545 var8 = class459.field6329[var7];
                            if (var8 != null) {
                                class519.field7302[class370.field4878++] = var7;
                            } else {
                                class537.field7631[class207.field2496++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
    public static final void method497(byte arg0) {
        ++field1027;
        if (class225.field2767 != -1 && ~class268.field3503 != 0) {
            int var1 = class311.field3979 - -((class169.field2065 - class311.field3979) * class187.field2252 >> 16);
            class187.field2252 += var1;
            if (~class187.field2252 <= -65536) {
                class187.field2252 = 65535;
                if (!class456.field6282) {
                    class447.field6203 = true;
                } else {
                    class447.field6203 = false;
                }
                class456.field6282 = true;
            } else {
                class456.field6282 = false;
                class447.field6203 = false;
            }
            float var2 = (float) class187.field2252 / 65535.0F;
            if (arg0 < -114) {
                float[] var3 = new float[3];
                int var4 = class523.field7335 * 2;
                for (int var5 = 0; ~var5 > -4; ++var5) {
                    int var21 = class277.field3652[class225.field2767][var4][var5] * 3;
                    int var22 = class277.field3652[class225.field2767][var4 + 1][var5] * 3;
                    int var23 = (class277.field3652[class225.field2767][var4 + 2][var5] + -class277.field3652[class225.field2767][var4 - -3][var5] + class277.field3652[class225.field2767][var4 + 2][var5]) * 3;
                    int var24 = class277.field3652[class225.field2767][var4][var5];
                    int var25 = -var21 + var22;
                    int var26 = var21 - -var23 + -(var22 * 2);
                    int var27 = class277.field3652[class225.field2767][var4 + 2][var5] + -var23 - var24 - -var22;
                    var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
                }
                class286.field3729 = (int) var3[0] - class632.field9113 * 128;
                class521.field7321 = (int) var3[1] * -1;
                class39.field303 = (int) var3[2] + -(class119.field1504 * 128);
                float[] var6 = new float[3];
                int var7 = class571.field8381 * 2;
                for (int var8 = 0; ~var8 > -4; ++var8) {
                    int var14 = class277.field3652[class268.field3503][var7][var8] * 3;
                    int var15 = class277.field3652[class268.field3503][var7 + 1][var8] * 3;
                    int var16 = (-class277.field3652[class268.field3503][var7 - -3][var8] - -class277.field3652[class268.field3503][var7 + 2][var8] + class277.field3652[class268.field3503][var7 + 2][var8]) * 3;
                    int var17 = class277.field3652[class268.field3503][var7][var8];
                    int var18 = -var14 + var15;
                    int var19 = -(var15 * 2) - -var16 + var14;
                    int var20 = class277.field3652[class268.field3503][var7 + 2][var8] + -var17 + var15 + -var16;
                    var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
                }
                float var9 = var6[0] + -var3[0];
                float var10 = (var6[1] + -var3[1]) * -1.0F;
                float var11 = var6[2] + -var3[2];
                double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
                class482.field6748 = 16383 & (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D);
                class168.field2055 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
                class263.field3390 = ((class277.field3652[class225.field2767][var4 + 2][3] + -class277.field3652[class225.field2767][var4][3]) * class187.field2252 >> 16) + class277.field3652[class225.field2767][var4][3];
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        if (arg2 != 46) {
            this.field1028 = 66;
        }
        ++field1029;
        int var4 = this.field1020 * arg1 >> 12;
        int var5 = this.field1024 * arg0 >> 12;
        int var6 = this.field1026 * arg1 >> 12;
        int var7 = this.field1028 * arg0 >> 12;
        int var8 = this.field1032 * arg1 >> 12;
        int var9 = this.field1022 * arg0 >> 12;
        int var10 = this.field1023 * arg1 >> 12;
        int var11 = this.field1030 * arg0 >> 12;
        class299.method1659(var7, var9, var4, var11, var8, var10, var6, var5, (byte) 103, super.field6076);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method499(int arg0, int arg1) {
        class522.field7323 = arg0;
        if (arg1 >= 24) {
            ++field1031;
            class337.field4387.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        int var4 = 95 % ((arg0 - -75) / 49);
        ++field1034;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class84(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field1028 = arg3;
        this.field1022 = arg5;
        this.field1020 = arg0;
        this.field1026 = arg2;
        this.field1030 = arg7;
        this.field1032 = arg4;
        this.field1023 = arg6;
        this.field1024 = arg1;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBI)V")
    public final void method501(int arg0, byte arg1, int arg2) {
        ++field1025;
        if (arg1 >= -78) {
            method499(-43, 23);
        }
    }

    static {
        new class180("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        new class180("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class180("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }
}
