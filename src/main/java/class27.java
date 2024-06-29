import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class27 extends class535 {

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "Lwp;")
    public static class122 field379 = new class122();

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "Lqt;")
    public static class459 field384 = new class459(55, 3);

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field386;

    static {
        new class44("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILwn;I)V", line = 3)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            field379 = null;
        }
        if (arg0 == 0) {
            super.field7878 = ~arg1.method3072((byte) -123) == -2;
        }
        ++field382;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)[I", line = 18)
    public final int[] method65(int arg0, int arg1) {
        ++field377;
        if (arg1 != 1) {
            field383 = 47;
        }
        int[] var3 = super.field7885.method974(arg1 ^ -30532, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(-122, 0, arg0);
            int[] var5 = this.method3158(arg1 + 80, 1, arg0);
            int[] var6 = this.method3158(-68, 2, arg0);
            for (int var7 = 0; class174.field2597 > var7; ++var7) {
                int var8 = var6[var7];
                if (~var8 != -4097) {
                    if (var8 != 0) {
                        var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V", line = 72)
    public static final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class354 var7 = new class354();
        var7.field5153 = arg1 >> class322.field4795;
        var7.field5151 = arg2 >> class322.field4795;
        var7.field5163 = arg3 >> class322.field4795;
        var7.field5158 = arg4 >> class322.field4795;
        var7.field5162 = arg0;
        var7.field5156 = arg1;
        var7.field5149 = arg2;
        var7.field5165 = arg3;
        var7.field5157 = arg4;
        var7.field5160 = arg5;
        var7.field5150 = arg6;
        class366.field5302[class269.field4061++] = var7;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[[I", line = 91)
    public final int[][] method61(int arg0, int arg1) {
        ++field381;
        if (arg0 >= -116) {
            field386 = 125;
        }
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[] var4 = this.method3158(-115, 2, arg1);
            int[][] var5 = this.method3157((byte) 67, arg1, 0);
            int[][] var6 = this.method3157((byte) 67, arg1, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; class174.field2597 > var16; ++var16) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (~var17 != -1) {
                    int var18 = -var17 + 4096;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                } else {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V", line = 172)
    public class27() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Liu;I)V", line = 175)
    public static final void method162(class415 arg0, int arg1) {
        ++field376;
        int var2 = 0;
        arg0.method2477(-129);
        for (int var3 = 0; class452.field6603 > var3; ++var3) {
            int var15 = class532.field7853[var3];
            if ((class21.field227[var15] & 1) == 0) {
                if (~var2 < -1) {
                    --var2;
                    class21.field227[var15] = (byte) class442.method2600(class21.field227[var15], 2);
                } else {
                    int var16 = arg0.method2487(1, arg1 + -45);
                    if (var16 == 0) {
                        var2 = class388.method2348(arg0, -77);
                        class21.field227[var15] = (byte) class442.method2600(class21.field227[var15], 2);
                    } else {
                        class17.method97(arg0, var15, (byte) 87);
                    }
                }
            }
        }
        arg0.method2482(8);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method2477(-129);
            for (int var4 = 0; var4 < class452.field6603; ++var4) {
                int var13 = class532.field7853[var4];
                if ((class21.field227[var13] & 1) != 0) {
                    if (~var2 < -1) {
                        class21.field227[var13] = (byte) class442.method2600(class21.field227[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method2487(1, -6);
                        if (~var14 == -1) {
                            var2 = class388.method2348(arg0, arg1 ^ 74);
                            class21.field227[var13] = (byte) class442.method2600(class21.field227[var13], 2);
                        } else {
                            class17.method97(arg0, var13, (byte) 123);
                        }
                    }
                }
            }
            arg0.method2482(8);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method2477(-129);
                for (int var5 = 0; ~var5 > ~class51.field940; ++var5) {
                    int var11 = class506.field7308[var5];
                    if ((class21.field227[var11] & 1) != 0) {
                        if (~var2 < -1) {
                            --var2;
                            class21.field227[var11] = (byte) class442.method2600(class21.field227[var11], 2);
                        } else {
                            int var12 = arg0.method2487(1, arg1 + -126);
                            if (~var12 == -1) {
                                var2 = class388.method2348(arg0, -127);
                                class21.field227[var11] = (byte) class442.method2600(class21.field227[var11], 2);
                            } else if (class130.method957(-1190546226, var11, arg0)) {
                                class21.field227[var11] = (byte) class442.method2600(class21.field227[var11], 2);
                            }
                        }
                    }
                }
                arg0.method2482(arg1 ^ -9);
                if (~var2 != arg1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method2477(-129);
                    for (int var6 = 0; ~var6 > ~class51.field940; ++var6) {
                        int var9 = class506.field7308[var6];
                        if ((class21.field227[var9] & 1) == 0) {
                            if (var2 > 0) {
                                --var2;
                                class21.field227[var9] = (byte) class442.method2600(class21.field227[var9], 2);
                            } else {
                                int var10 = arg0.method2487(1, -56);
                                if (~var10 == -1) {
                                    var2 = class388.method2348(arg0, arg1 + -88);
                                    class21.field227[var9] = (byte) class442.method2600(class21.field227[var9], 2);
                                } else if (class130.method957(-1190546226, var9, arg0)) {
                                    class21.field227[var9] = (byte) class442.method2600(class21.field227[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method2482(8);
                    if (~var2 != -1) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class452.field6603 = 0;
                        class51.field940 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class21.field227[var7] = (byte) (class21.field227[var7] >> 1);
                            class510 var8 = class494.field7143[var7];
                            if (var8 == null) {
                                class506.field7308[class51.field940++] = var7;
                            } else {
                                class532.field7853[class452.field6603++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 379)
    public static final void method163(boolean arg0) {
        if (!class76.field1256.method184()) {
            class322.method2063(class74.field1211, 16);
        } else {
            class76.field1256.method270(class481.field6991);
            class100.method739(-24777);
            class76.field1256.method311(class481.field6991);
            class76.field1256.method264(class481.field6991);
        }
        ++field378;
        class531.method3148(-113);
        if (arg0) {
            method164(-59);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 400)
    public static final void method164(int arg0) {
        ++field380;
        for (int var1 = 0; class234.field3497.length > var1; ++var1) {
            for (int var3 = 0; class234.field3497[0].length > var3; ++var3) {
                for (int var4 = 0; ~class234.field3497[0][0].length < ~var4; ++var4) {
                    class234.field3497[var1][var3][var4] = 0;
                }
            }
        }
        int var2 = -84 % ((-47 - arg0) / 45);
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)V", line = 438)
    public static void method165(byte arg0) {
        field379 = null;
        if (arg0 == -105) {
            field384 = null;
        }
    }
}
