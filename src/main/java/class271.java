import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class271 extends class337 {

    @OriginalMember(owner = "client!br", name = "L", descriptor = "[I")
    private int[] field4148 = new int[257];

    @OriginalMember(owner = "client!br", name = "M", descriptor = "Lob;")
    public static class521 field4149 = new class521(51, 8);

    @OriginalMember(owner = "client!br", name = "N", descriptor = "I")
    public static int field4150 = -1;

    @OriginalMember(owner = "client!br", name = "R", descriptor = "I")
    public static int field4154 = -1;

    @OriginalMember(owner = "client!br", name = "P", descriptor = "Lak;")
    public static class234 field4152 = new class234("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!br", name = "B", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!br", name = "D", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!br", name = "E", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!br", name = "F", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!br", name = "G", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!br", name = "H", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!br", name = "I", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!br", name = "J", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!br", name = "K", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!br", name = "O", descriptor = "Lbk;")
    public static class256 field4151;

    @OriginalMember(owner = "client!br", name = "Q", descriptor = "[I")
    public static int[] field4153;

    @OriginalMember(owner = "client!br", name = "C", descriptor = "[[I")
    private int[][] field4139;

    @OriginalMember(owner = "client!br", name = "i", descriptor = "(I)V", line = 3)
    private final void method1788(int arg0) {
        ++field4141;
        if (arg0 == 8) {
            int var2 = this.field4139.length;
            if (~var2 < -1) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = 0;
                    int var5 = var3 << 4;
                    for (int var6 = 0; var6 < var2 && ~this.field4139[var6][0] >= ~var5; ++var6) {
                        ++var4;
                    }
                    int var11;
                    int var12;
                    int var13;
                    if (~var2 < ~var4) {
                        int[] var7 = this.field4139[var4];
                        if (~var4 < -1) {
                            int[] var8 = this.field4139[var4 + -1];
                            int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                            int var10 = -var9 + 4096;
                            var11 = var7[3] * var9 + var8[3] * var10 >> 12;
                            var12 = var7[2] * var9 + var8[2] * var10 >> 12;
                            var13 = var7[1] * var9 - -(var8[1] * var10) >> 12;
                        } else {
                            var13 = var7[1];
                            var11 = var7[3];
                            var12 = var7[2];
                        }
                    } else {
                        int[] var14 = this.field4139[var2 + -1];
                        var13 = var14[1];
                        var11 = var14[3];
                        var12 = var14[2];
                    }
                    int var15 = var12 >> 4;
                    int var16 = var13 >> 4;
                    int var17 = var11 >> 4;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 255) {
                        var15 = 255;
                    }
                    if (~var17 <= -1) {
                        if (var17 > 255) {
                            var17 = 255;
                        }
                    } else {
                        var17 = 0;
                    }
                    if (~var16 > -1) {
                        var16 = 0;
                    } else if (var16 > 255) {
                        var16 = 255;
                    }
                    this.field4148[var3] = class264.method1763(var17, class264.method1763(var15 << 8, var16 << 16));
                }
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(BILhp;)V", line = 108)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        if (~arg1 == -1) {
            int var4 = arg2.method1515((byte) 126);
            if (var4 == 0) {
                this.field4139 = new int[arg2.method1515((byte) 126)][4];
                for (int var5 = 0; ~var5 > ~this.field4139.length; ++var5) {
                    this.field4139[var5][0] = arg2.method1511(121);
                    this.field4139[var5][1] = arg2.method1515((byte) 123) << 4;
                    this.field4139[var5][2] = arg2.method1515((byte) 122) << 4;
                    this.field4139[var5][3] = arg2.method1515((byte) 121) << 4;
                }
            } else {
                this.method1792(67, var4);
            }
        }
        int var6 = 4 % ((82 - arg0) / 40);
        ++field4145;
    }

    @OriginalMember(owner = "client!br", name = "e", descriptor = "(III)Z", line = 145)
    public static final boolean method1789(int arg0, int arg1, int arg2) {
        ++field4147;
        if (arg0 != 255) {
            field4149 = null;
        }
        return class261.method1745(arg1, 20319, arg2) | ~(458752 & arg1) != -1 || class281.method1830(arg2, -16385, arg1);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[[I", line = 156)
    public final int[][] method673(int arg0, int arg1) {
        ++field4143;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346) {
            int[] var4 = this.method2124(arg0, 0, -88);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class402.field5977 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4148[var9];
                var5[var8] = class74.method644(16711680, var10) >> 12;
                var6[var8] = class74.method644(4080, var10 >> 4);
                var7[var8] = class74.method644(var10 << 4, 4080);
            }
        }
        int var11 = -104 % ((arg1 - -41) / 49);
        return var3;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Lcg;IIIII)V", line = 206)
    public static final void method1790(class93 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field1314 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class329.field4942[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class396 var13 = class503.field7256[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field1314; ++var14) {
                            if (arg0.field1311[var14] == var13.field5918) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field1311[arg0.field1314++] = var13.field5918;
                        if (arg0.field1314 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field1314; var15 < 4; ++var15) {
            arg0.field1311[var15] = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V", line = 273)
    public static void method1791(boolean arg0) {
        field4151 = null;
        field4153 = null;
        field4149 = null;
        if (arg0) {
            field4152 = null;
        }
        field4152 = null;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(II)V", line = 291)
    private final void method1792(int arg0, int arg1) {
        ++field4142;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field4139 = new int[4][4];
                                this.field4139[0][1] = 0;
                                this.field4139[0][2] = 4096;
                                this.field4139[0][0] = 2048;
                                this.field4139[0][3] = 0;
                                this.field4139[1][1] = 4096;
                                this.field4139[1][3] = 0;
                                this.field4139[1][2] = 4096;
                                this.field4139[1][0] = 2867;
                                this.field4139[2][0] = 3276;
                                this.field4139[2][3] = 0;
                                this.field4139[2][1] = 4096;
                                this.field4139[2][2] = 4096;
                                this.field4139[3][1] = 4096;
                                this.field4139[3][0] = 4096;
                                this.field4139[3][3] = 0;
                                this.field4139[3][2] = 0;
                            } else {
                                this.field4139 = new int[16][4];
                                this.field4139[0][2] = 192;
                                this.field4139[0][3] = 321;
                                this.field4139[0][1] = 80;
                                this.field4139[0][0] = 0;
                                this.field4139[1][1] = 321;
                                this.field4139[1][2] = 449;
                                this.field4139[1][3] = 562;
                                this.field4139[1][0] = 155;
                                this.field4139[2][3] = 803;
                                this.field4139[2][2] = 690;
                                this.field4139[2][1] = 578;
                                this.field4139[2][0] = 389;
                                this.field4139[3][3] = 1140;
                                this.field4139[3][1] = 947;
                                this.field4139[3][0] = 671;
                                this.field4139[3][2] = 995;
                                this.field4139[4][0] = 897;
                                this.field4139[4][2] = 1397;
                                this.field4139[4][1] = 1285;
                                this.field4139[4][3] = 1509;
                                this.field4139[5][0] = 1175;
                                this.field4139[5][2] = 1429;
                                this.field4139[5][1] = 1525;
                                this.field4139[5][3] = 1413;
                                this.field4139[6][3] = 1333;
                                this.field4139[6][2] = 1461;
                                this.field4139[6][1] = 1734;
                                this.field4139[6][0] = 1368;
                                this.field4139[7][3] = 1702;
                                this.field4139[7][0] = 1507;
                                this.field4139[7][2] = 1525;
                                this.field4139[7][1] = 1413;
                                this.field4139[8][2] = 1590;
                                this.field4139[8][0] = 1736;
                                this.field4139[8][3] = 2056;
                                this.field4139[8][1] = 1108;
                                this.field4139[9][2] = 2056;
                                this.field4139[9][3] = 2666;
                                this.field4139[9][1] = 1766;
                                this.field4139[9][0] = 2088;
                                this.field4139[10][2] = 2586;
                                this.field4139[10][0] = 2355;
                                this.field4139[10][1] = 2409;
                                this.field4139[10][3] = 3276;
                                this.field4139[11][1] = 3116;
                                this.field4139[11][2] = 3148;
                                this.field4139[11][3] = 3228;
                                this.field4139[11][0] = 2691;
                                this.field4139[12][2] = 3710;
                                this.field4139[12][3] = 3196;
                                this.field4139[12][1] = 3806;
                                this.field4139[12][0] = 3031;
                                this.field4139[13][3] = 3019;
                                this.field4139[13][1] = 3437;
                                this.field4139[13][0] = 3522;
                                this.field4139[13][2] = 3421;
                                this.field4139[14][1] = 3116;
                                this.field4139[14][0] = 3727;
                                this.field4139[14][2] = 3148;
                                this.field4139[14][3] = 3228;
                                this.field4139[15][3] = 2746;
                                this.field4139[15][1] = 2377;
                                this.field4139[15][2] = 2505;
                                this.field4139[15][0] = 4096;
                            }
                        } else {
                            this.field4139 = new int[6][4];
                            this.field4139[0][1] = 0;
                            this.field4139[0][3] = 0;
                            this.field4139[0][0] = 0;
                            this.field4139[0][2] = 0;
                            this.field4139[1][1] = 0;
                            this.field4139[1][0] = 1843;
                            this.field4139[1][2] = 0;
                            this.field4139[1][3] = 1493;
                            this.field4139[2][0] = 2457;
                            this.field4139[2][1] = 0;
                            this.field4139[2][2] = 0;
                            this.field4139[2][3] = 2939;
                            this.field4139[3][0] = 2781;
                            this.field4139[3][2] = 1124;
                            this.field4139[3][3] = 3565;
                            this.field4139[3][1] = 0;
                            this.field4139[4][0] = 3481;
                            this.field4139[4][1] = 546;
                            this.field4139[4][3] = 4031;
                            this.field4139[4][2] = 3084;
                            this.field4139[5][0] = 4096;
                            this.field4139[5][2] = 4096;
                            this.field4139[5][3] = 4096;
                            this.field4139[5][1] = 4096;
                        }
                    } else {
                        this.field4139 = new int[7][4];
                        this.field4139[0][1] = 0;
                        this.field4139[0][0] = 0;
                        this.field4139[0][3] = 4096;
                        this.field4139[0][2] = 0;
                        this.field4139[1][1] = 0;
                        this.field4139[1][2] = 4096;
                        this.field4139[1][0] = 663;
                        this.field4139[1][3] = 4096;
                        this.field4139[2][2] = 4096;
                        this.field4139[2][3] = 0;
                        this.field4139[2][1] = 0;
                        this.field4139[2][0] = 1363;
                        this.field4139[3][0] = 2048;
                        this.field4139[3][1] = 4096;
                        this.field4139[3][3] = 0;
                        this.field4139[3][2] = 4096;
                        this.field4139[4][2] = 0;
                        this.field4139[4][3] = 0;
                        this.field4139[4][0] = 2727;
                        this.field4139[4][1] = 4096;
                        this.field4139[5][1] = 4096;
                        this.field4139[5][0] = 3411;
                        this.field4139[5][2] = 0;
                        this.field4139[5][3] = 4096;
                        this.field4139[6][0] = 4096;
                        this.field4139[6][3] = 4096;
                        this.field4139[6][2] = 0;
                        this.field4139[6][1] = 0;
                    }
                } else {
                    this.field4139 = new int[8][4];
                    this.field4139[0][3] = 2361;
                    this.field4139[0][1] = 2650;
                    this.field4139[0][0] = 0;
                    this.field4139[0][2] = 2602;
                    this.field4139[1][3] = 1558;
                    this.field4139[1][0] = 2867;
                    this.field4139[1][2] = 1799;
                    this.field4139[1][1] = 2313;
                    this.field4139[2][0] = 3072;
                    this.field4139[2][3] = 1413;
                    this.field4139[2][2] = 1734;
                    this.field4139[2][1] = 2618;
                    this.field4139[3][1] = 2296;
                    this.field4139[3][0] = 3276;
                    this.field4139[3][3] = 947;
                    this.field4139[3][2] = 1220;
                    this.field4139[4][0] = 3481;
                    this.field4139[4][2] = 963;
                    this.field4139[4][1] = 2072;
                    this.field4139[4][3] = 722;
                    this.field4139[5][3] = 1766;
                    this.field4139[5][0] = 3686;
                    this.field4139[5][2] = 2152;
                    this.field4139[5][1] = 2730;
                    this.field4139[6][0] = 3891;
                    this.field4139[6][1] = 2232;
                    this.field4139[6][2] = 1060;
                    this.field4139[6][3] = 915;
                    this.field4139[7][0] = 4096;
                    this.field4139[7][3] = 1140;
                    this.field4139[7][2] = 1413;
                    this.field4139[7][1] = 1686;
                }
            } else {
                this.field4139 = new int[2][4];
                this.field4139[0][3] = 0;
                this.field4139[0][2] = 0;
                this.field4139[0][0] = 0;
                this.field4139[0][1] = 0;
                this.field4139[1][2] = 4096;
                this.field4139[1][1] = 4096;
                this.field4139[1][3] = 4096;
                this.field4139[1][0] = 4096;
            }
        }
        if (arg0 <= 16) {
            field4153 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIIIII)V", line = 552)
    public static final void method1793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4140;
        if (~arg2 == ~arg4) {
            class69.method596(true, arg0, arg3, arg1, arg2);
        } else {
            if (arg1 - arg2 >= class327.field4931 && arg1 - -arg2 <= class184.field2777 && class404.field5987 <= -arg4 + arg0 && ~(arg0 + arg4) >= ~class433.field6414) {
                class516.method3055(arg3, arg5 ^ 12065, arg4, arg2, arg0, arg1);
            } else {
                class384.method2400(arg2, arg0, arg3, arg4, (byte) 38, arg1);
            }
            if (arg5 != 5) {
                field4150 = -15;
            }
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V", line = 577)
    public class271() {
        super(1, false);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILul;)I", line = 582)
    public static final int method1794(int arg0, class406 arg1) {
        ++field4138;
        int var2 = arg0;
        if (arg1.method2556((byte) 21, class284.field4315)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2556((byte) 21, class260.field3982)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class60.field722)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class138.field2120)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class24.field300)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class454.field6614)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class88.field1265)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class106.field1497)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class367.field5399)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class156.field2318)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class22.field274)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class239.field3827)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class345.field5099)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class289.field4362)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class270.field4132)) {
            ++var2;
        }
        if (arg1.method2556((byte) 21, class291.field4402)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V", line = 649)
    public final void method174(byte arg0) {
        ++field4146;
        if (this.field4139 == null) {
            this.method1792(21, 1);
        }
        if (arg0 <= 1) {
            method1790((class93) null, -34, -86, 93, 71, -23);
        }
        this.method1788(8);
    }

    @OriginalMember(owner = "client!br", name = "c", descriptor = "(II)I", line = 667)
    public static final int method1795(int arg0, int arg1) {
        if (arg1 != 3) {
            return -67;
        } else {
            ++field4144;
            if (arg0 < 96) {
                return 0;
            } else {
                return ~arg0 > -129 ? 2 : 3;
            }
        }
    }
}
