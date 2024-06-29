import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class90 extends class184 {

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "[I")
    private int[] field1106 = new int[257];

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "Lap;")
    public static class335 field1109 = new class335(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "[C")
    public static char[] field1110 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "[[I")
    private int[][] field1105;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IB)V", line = 10)
    private final void method704(int arg0, byte arg1) {
        ++field1108;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1105 = new int[4][4];
                                this.field1105[0][1] = 0;
                                this.field1105[0][2] = 4096;
                                this.field1105[0][0] = 2048;
                                this.field1105[0][3] = 0;
                                this.field1105[1][2] = 4096;
                                this.field1105[1][1] = 4096;
                                this.field1105[1][0] = 2867;
                                this.field1105[1][3] = 0;
                                this.field1105[2][2] = 4096;
                                this.field1105[2][3] = 0;
                                this.field1105[2][1] = 4096;
                                this.field1105[2][0] = 3276;
                                this.field1105[3][2] = 0;
                                this.field1105[3][3] = 0;
                                this.field1105[3][1] = 4096;
                                this.field1105[3][0] = 4096;
                            } else {
                                this.field1105 = new int[16][4];
                                this.field1105[0][1] = 80;
                                this.field1105[0][0] = 0;
                                this.field1105[0][3] = 321;
                                this.field1105[0][2] = 192;
                                this.field1105[1][2] = 449;
                                this.field1105[1][1] = 321;
                                this.field1105[1][0] = 155;
                                this.field1105[1][3] = 562;
                                this.field1105[2][2] = 690;
                                this.field1105[2][3] = 803;
                                this.field1105[2][1] = 578;
                                this.field1105[2][0] = 389;
                                this.field1105[3][0] = 671;
                                this.field1105[3][2] = 995;
                                this.field1105[3][1] = 947;
                                this.field1105[3][3] = 1140;
                                this.field1105[4][3] = 1509;
                                this.field1105[4][0] = 897;
                                this.field1105[4][2] = 1397;
                                this.field1105[4][1] = 1285;
                                this.field1105[5][1] = 1525;
                                this.field1105[5][3] = 1413;
                                this.field1105[5][2] = 1429;
                                this.field1105[5][0] = 1175;
                                this.field1105[6][1] = 1734;
                                this.field1105[6][0] = 1368;
                                this.field1105[6][2] = 1461;
                                this.field1105[6][3] = 1333;
                                this.field1105[7][0] = 1507;
                                this.field1105[7][2] = 1525;
                                this.field1105[7][1] = 1413;
                                this.field1105[7][3] = 1702;
                                this.field1105[8][3] = 2056;
                                this.field1105[8][2] = 1590;
                                this.field1105[8][1] = 1108;
                                this.field1105[8][0] = 1736;
                                this.field1105[9][1] = 1766;
                                this.field1105[9][3] = 2666;
                                this.field1105[9][2] = 2056;
                                this.field1105[9][0] = 2088;
                                this.field1105[10][1] = 2409;
                                this.field1105[10][0] = 2355;
                                this.field1105[10][3] = 3276;
                                this.field1105[10][2] = 2586;
                                this.field1105[11][0] = 2691;
                                this.field1105[11][1] = 3116;
                                this.field1105[11][3] = 3228;
                                this.field1105[11][2] = 3148;
                                this.field1105[12][0] = 3031;
                                this.field1105[12][2] = 3710;
                                this.field1105[12][1] = 3806;
                                this.field1105[12][3] = 3196;
                                this.field1105[13][1] = 3437;
                                this.field1105[13][0] = 3522;
                                this.field1105[13][2] = 3421;
                                this.field1105[13][3] = 3019;
                                this.field1105[14][0] = 3727;
                                this.field1105[14][3] = 3228;
                                this.field1105[14][2] = 3148;
                                this.field1105[14][1] = 3116;
                                this.field1105[15][1] = 2377;
                                this.field1105[15][3] = 2746;
                                this.field1105[15][2] = 2505;
                                this.field1105[15][0] = 4096;
                            }
                        } else {
                            this.field1105 = new int[6][4];
                            this.field1105[0][2] = 0;
                            this.field1105[0][0] = 0;
                            this.field1105[0][1] = 0;
                            this.field1105[0][3] = 0;
                            this.field1105[1][0] = 1843;
                            this.field1105[1][1] = 0;
                            this.field1105[1][3] = 1493;
                            this.field1105[1][2] = 0;
                            this.field1105[2][1] = 0;
                            this.field1105[2][3] = 2939;
                            this.field1105[2][0] = 2457;
                            this.field1105[2][2] = 0;
                            this.field1105[3][0] = 2781;
                            this.field1105[3][3] = 3565;
                            this.field1105[3][1] = 0;
                            this.field1105[3][2] = 1124;
                            this.field1105[4][1] = 546;
                            this.field1105[4][2] = 3084;
                            this.field1105[4][0] = 3481;
                            this.field1105[4][3] = 4031;
                            this.field1105[5][2] = 4096;
                            this.field1105[5][1] = 4096;
                            this.field1105[5][3] = 4096;
                            this.field1105[5][0] = 4096;
                        }
                    } else {
                        this.field1105 = new int[7][4];
                        this.field1105[0][1] = 0;
                        this.field1105[0][2] = 0;
                        this.field1105[0][3] = 4096;
                        this.field1105[0][0] = 0;
                        this.field1105[1][2] = 4096;
                        this.field1105[1][0] = 663;
                        this.field1105[1][1] = 0;
                        this.field1105[1][3] = 4096;
                        this.field1105[2][1] = 0;
                        this.field1105[2][3] = 0;
                        this.field1105[2][0] = 1363;
                        this.field1105[2][2] = 4096;
                        this.field1105[3][3] = 0;
                        this.field1105[3][2] = 4096;
                        this.field1105[3][1] = 4096;
                        this.field1105[3][0] = 2048;
                        this.field1105[4][1] = 4096;
                        this.field1105[4][3] = 0;
                        this.field1105[4][0] = 2727;
                        this.field1105[4][2] = 0;
                        this.field1105[5][3] = 4096;
                        this.field1105[5][1] = 4096;
                        this.field1105[5][0] = 3411;
                        this.field1105[5][2] = 0;
                        this.field1105[6][0] = 4096;
                        this.field1105[6][1] = 0;
                        this.field1105[6][2] = 0;
                        this.field1105[6][3] = 4096;
                    }
                } else {
                    this.field1105 = new int[8][4];
                    this.field1105[0][3] = 2361;
                    this.field1105[0][2] = 2602;
                    this.field1105[0][0] = 0;
                    this.field1105[0][1] = 2650;
                    this.field1105[1][0] = 2867;
                    this.field1105[1][1] = 2313;
                    this.field1105[1][2] = 1799;
                    this.field1105[1][3] = 1558;
                    this.field1105[2][1] = 2618;
                    this.field1105[2][3] = 1413;
                    this.field1105[2][0] = 3072;
                    this.field1105[2][2] = 1734;
                    this.field1105[3][3] = 947;
                    this.field1105[3][1] = 2296;
                    this.field1105[3][2] = 1220;
                    this.field1105[3][0] = 3276;
                    this.field1105[4][2] = 963;
                    this.field1105[4][0] = 3481;
                    this.field1105[4][3] = 722;
                    this.field1105[4][1] = 2072;
                    this.field1105[5][0] = 3686;
                    this.field1105[5][1] = 2730;
                    this.field1105[5][2] = 2152;
                    this.field1105[5][3] = 1766;
                    this.field1105[6][3] = 915;
                    this.field1105[6][2] = 1060;
                    this.field1105[6][0] = 3891;
                    this.field1105[6][1] = 2232;
                    this.field1105[7][1] = 1686;
                    this.field1105[7][0] = 4096;
                    this.field1105[7][3] = 1140;
                    this.field1105[7][2] = 1413;
                }
            } else {
                this.field1105 = new int[2][4];
                this.field1105[0][0] = 0;
                this.field1105[0][2] = 0;
                this.field1105[0][1] = 0;
                this.field1105[0][3] = 0;
                this.field1105[1][2] = 4096;
                this.field1105[1][3] = 4096;
                this.field1105[1][0] = 4096;
                this.field1105[1][1] = 4096;
            }
        }
        int var4 = 73 / ((arg1 - 46) / 37);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILfh;)V", line = 261)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field1101;
        if (arg1 == 0) {
            int var4 = arg2.method2737(false);
            if (~var4 != -1) {
                this.method704(var4, (byte) -31);
            } else {
                this.field1105 = new int[arg2.method2737(false)][4];
                for (int var5 = 0; ~var5 > ~this.field1105.length; ++var5) {
                    this.field1105[var5][0] = arg2.method2758((byte) 101);
                    this.field1105[var5][1] = arg2.method2737(false) << 4;
                    this.field1105[var5][2] = arg2.method2737(false) << 4;
                    this.field1105[var5][3] = arg2.method2737(false) << 4;
                }
            }
        }
        int var6 = 104 / ((arg0 - -13) / 51);
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V", line = 298)
    public class90() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(Z)V", line = 307)
    public final void method109(boolean arg0) {
        if (arg0) {
            method707(96, (class476) null, true, false, (String) null);
        }
        if (this.field1105 == null) {
            this.method704(1, (byte) -33);
        }
        ++field1100;
        this.method708((byte) 51);
    }

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "(Z)V", line = 323)
    public static void method705(boolean arg0) {
        field1109 = null;
        if (!arg0) {
            method707(-109, (class476) null, false, true, (String) null);
        }
        field1110 = null;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(III)Z", line = 337)
    public static final boolean method706(int arg0, int arg1, int arg2) {
        ++field1102;
        if (arg0 > -102) {
            method707(76, (class476) null, true, false, (String) null);
        }
        return ~(1024 & arg1) != -1;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILpc;ZZLjava/lang/String;)V", line = 349)
    public static final void method707(int arg0, class476 arg1, boolean arg2, boolean arg3, String arg4) {
        int var5 = -19 % ((-23 - arg0) / 53);
        ++field1103;
        if (!arg3) {
            class75.method649(arg4, arg1, -14861, 3);
        } else {
            if (class476.field6896.startsWith("win") && class476.field6902 != 3) {
                String var6 = null;
                if (arg1.field6891 != null) {
                    var6 = arg1.field6891.getParameter("haveie6");
                }
                if (var6 == null || !var6.equals("1")) {
                    class121 var7 = class75.method649(arg4, arg1, -14861, 0);
                    class362.field4670 = arg1;
                    class135.field1746 = arg4;
                    class5.field47 = var7;
                    return;
                }
            }
            if (class476.field6896.startsWith("mac")) {
                String var8 = null;
                if (arg1.field6891 != null) {
                    var8 = arg1.field6891.getParameter("havefirefox");
                }
                if (var8 != null && var8.equals("1") && arg2) {
                    class75.method649(arg4, arg1, -14861, 1);
                    return;
                }
            }
            class75.method649(arg4, arg1, -14861, 2);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V", line = 412)
    private final void method708(byte arg0) {
        ++field1104;
        int var2 = this.field1105.length;
        if (arg0 != 51) {
            field1109 = null;
        }
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var6 < var2 && this.field1105[var6][0] <= var5; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (~var4 <= ~var2) {
                    int[] var7 = this.field1105[var2 + -1];
                    var8 = var7[1];
                    var9 = var7[3];
                    var10 = var7[2];
                } else {
                    int[] var11 = this.field1105[var4];
                    if (var4 <= 0) {
                        var8 = var11[1];
                        var9 = var11[3];
                        var10 = var11[2];
                    } else {
                        int[] var12 = this.field1105[var4 + -1];
                        int var13 = (-var12[0] + var5 << 12) / (var11[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                        var8 = var11[1] * var13 - -(var12[1] * var14) >> 12;
                        var9 = var11[3] * var13 + var12[3] * var14 >> 12;
                    }
                }
                int var15 = var8 >> 4;
                int var16 = var10 >> 4;
                int var17 = var9 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                this.field1106[var3] = class215.method1323(class215.method1323(var16 << 8, var15 << 16), var17);
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)[[I", line = 515)
    public final int[][] method13(int arg0, int arg1) {
        ++field1107;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (super.field2416.field7271) {
            int[] var4 = this.method1159(108, arg0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class245.field3167 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1106[var9];
                var5[var8] = class378.method2145(var10 >> 12, 4080);
                var6[var8] = class378.method2145(65280, var10) >> 4;
                var7[var8] = class378.method2145(var10, 255) << 4;
            }
        }
        if (arg1 != 1) {
            this.method708((byte) 81);
        }
        return var3;
    }
}
