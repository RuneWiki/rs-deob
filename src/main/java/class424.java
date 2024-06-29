import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class424 extends class354 {

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    private int field6223 = 32768;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public static int field6218 = 0;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lgf;")
    public static class180 field6222 = new class180("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public static int field6225 = 205;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "[Z")
    public static boolean[] field6226;

    static {
        new class180("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V", line = 3)
    public final void method771(boolean arg0) {
        if (!arg0) {
            class291.method1807(arg0);
            ++field6221;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(III)Ljava/lang/String;", line = 24)
    public static final String method2589(int arg0, int arg1, int arg2) {
        ++field6217;
        int var3 = arg1 - arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (var3 < arg2) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V", line = 62)
    public static void method2590(byte arg0) {
        field6226 = null;
        int var1 = -27 / ((-12 - arg0) / 57);
        field6222 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILti;I)V", line = 72)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field6219;
        if (arg0 != 15180) {
            field6222 = null;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field5354 = ~arg1.method1918((byte) -75) == -2;
            }
        } else {
            this.field6223 = arg1.method1868(arg0 ^ 15180) << 4;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)[I", line = 109)
    public final int[] method253(int arg0, byte arg1) {
        ++field6216;
        if (arg1 != -95) {
            return null;
        } else {
            int[] var3 = super.field5357.method861(true, arg0);
            if (super.field5357.field1869) {
                int[] var4 = this.method2293(1, arg0, (byte) 69);
                int[] var5 = this.method2293(2, arg0, (byte) 69);
                for (int var6 = 0; class404.field5952 > var6; ++var6) {
                    int var7 = (4094 & var4[var6]) >> 4;
                    int var8 = var5[var6] * this.field6223 >> 12;
                    int var9 = class461.field6801[var7] * var8 >> 12;
                    int var10 = class492.field7184[var7] * var8 >> 12;
                    int var11 = var6 - -(var9 >> 12) & class168.field2527;
                    int var12 = arg0 - -(var10 >> 12) & class30.field492;
                    int[] var13 = this.method2293(0, var12, (byte) 69);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V", line = 158)
    public static final void method2591(byte arg0, int arg1) {
        class120.field1887.method2348(arg1, 52);
        if (arg0 > -118) {
            field6218 = -89;
        }
        ++field6224;
        class465.field6835.method2348(arg1, 36);
        class279.field4013.method2348(arg1, -126);
        class239.field3483.method2348(arg1, -34);
        class417.field6164.method2348(arg1, 56);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 177)
    public class424() {
        super(3, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILjava/lang/String;[BIIB)I", line = 182)
    public static final int method2592(int arg0, String arg1, byte[] arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != 30) {
            method2591((byte) -112, 70);
        }
        ++field6220;
        int var6 = arg4 - arg3;
        for (int var7 = 0; ~var6 < ~var7; ++var7) {
            char var8 = arg1.charAt(arg3 + var7);
            if (~var8 < -1 && ~var8 > -129 || var8 >= 160 && ~var8 >= -256) {
                arg2[arg0 + var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (~var8 == -8219) {
                    arg2[arg0 + var7] = -126;
                } else if (~var8 == -403) {
                    arg2[arg0 + var7] = -125;
                } else if (~var8 != -8223) {
                    if (~var8 == -8231) {
                        arg2[arg0 + var7] = -123;
                    } else if (~var8 != -8225) {
                        if (var8 == 8225) {
                            arg2[arg0 + var7] = -121;
                        } else if (~var8 == -711) {
                            arg2[arg0 - -var7] = -120;
                        } else if (var8 != 8240) {
                            if (var8 != 352) {
                                if (~var8 != -8250) {
                                    if (~var8 == -339) {
                                        arg2[arg0 + var7] = -116;
                                    } else if (~var8 != -382) {
                                        if (~var8 == -8217) {
                                            arg2[arg0 - -var7] = -111;
                                        } else if (~var8 == -8218) {
                                            arg2[arg0 + var7] = -110;
                                        } else if (~var8 == -8221) {
                                            arg2[arg0 + var7] = -109;
                                        } else if (var8 == 8221) {
                                            arg2[arg0 - -var7] = -108;
                                        } else if (~var8 != -8227) {
                                            if (var8 == 8211) {
                                                arg2[arg0 + var7] = -106;
                                            } else if (~var8 != -8213) {
                                                if (~var8 != -733) {
                                                    if (var8 != 8482) {
                                                        if (var8 == 353) {
                                                            arg2[arg0 + var7] = -102;
                                                        } else if (~var8 == -8251) {
                                                            arg2[arg0 + var7] = -101;
                                                        } else if (var8 == 339) {
                                                            arg2[arg0 + var7] = -100;
                                                        } else if (~var8 == -383) {
                                                            arg2[arg0 - -var7] = -98;
                                                        } else if (~var8 != -377) {
                                                            arg2[arg0 - -var7] = 63;
                                                        } else {
                                                            arg2[arg0 - -var7] = -97;
                                                        }
                                                    } else {
                                                        arg2[arg0 + var7] = -103;
                                                    }
                                                } else {
                                                    arg2[arg0 + var7] = -104;
                                                }
                                            } else {
                                                arg2[arg0 + var7] = -105;
                                            }
                                        } else {
                                            arg2[arg0 - -var7] = -107;
                                        }
                                    } else {
                                        arg2[arg0 + var7] = -114;
                                    }
                                } else {
                                    arg2[arg0 + var7] = -117;
                                }
                            } else {
                                arg2[arg0 + var7] = -118;
                            }
                        } else {
                            arg2[arg0 - -var7] = -119;
                        }
                    } else {
                        arg2[arg0 + var7] = -122;
                    }
                } else {
                    arg2[arg0 + var7] = -124;
                }
            } else {
                arg2[arg0 + var7] = -128;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[[I", line = 325)
    public final int[][] method207(byte arg0, int arg1) {
        ++field6215;
        int[][] var3 = super.field5351.method2819((byte) -14, arg1);
        if (super.field5351.field6959) {
            int[] var4 = this.method2293(1, arg1, (byte) 69);
            int[] var5 = this.method2293(2, arg1, (byte) 69);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; class404.field5952 > var9; ++var9) {
                int var10 = (var4[var9] * 255 & 1047373) >> 12;
                int var11 = var5[var9] * this.field6223 >> 12;
                int var12 = class461.field6801[var10] * var11 >> 12;
                int var13 = class492.field7184[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class168.field2527;
                int var15 = arg1 - -(var13 >> 12) & class30.field492;
                int[][] var16 = this.method2291(0, (byte) -111, var15);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        if (arg0 > -40) {
            method2591((byte) 26, 111);
        }
        return var3;
    }
}
