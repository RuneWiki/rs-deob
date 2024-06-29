import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class47 extends class259 {

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "[I")
    private int[] field1079 = new int[257];

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Lsg;")
    public static class30 field1072 = class167.method1221((byte) 33, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!fb", name = "fb", descriptor = "Lsg;")
    public static class30 field1081 = class167.method1221((byte) 33, " ");

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "Lsg;")
    public static class30 field1077 = class167.method1221((byte) 33, ")3");

    @OriginalMember(owner = "client!fb", name = "gb", descriptor = "Lsg;")
    public static class30 field1082 = class167.method1221((byte) 33, "_");

    @OriginalMember(owner = "client!fb", name = "ib", descriptor = "Lsg;")
    public static class30 field1084 = class167.method1221((byte) 33, ": ");

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!fb", name = "jb", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lia;")
    public static class172 field1070;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "[[I")
    private int[][] field1069;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "[[[I")
    public static int[][][] field1076;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
    private final void method464(boolean arg0) {
        ++field1071;
        if (arg0) {
            this.method4(74, -73, (class8) null);
        }
        int var2 = this.field1069.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = var3 << 4;
                int var5 = 0;
                for (int var6 = 0; var6 < var2 && this.field1069[var6][0] <= var4; ++var6) {
                    ++var5;
                }
                int var8;
                int var9;
                int var10;
                if (var5 >= var2) {
                    int[] var7 = this.field1069[var2 - 1];
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field1069[var5];
                    if (var5 > 0) {
                        int[] var12 = this.field1069[var5 + -1];
                        int var13 = (var4 - var12[0] << 12) / (var11[0] + -var12[0]);
                        int var14 = -var13 + 4096;
                        var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                        var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                        var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    } else {
                        var8 = var11[3];
                        var10 = var11[1];
                        var9 = var11[2];
                    }
                }
                int var15 = var10 >> 4;
                if (var15 >= 0) {
                    if (~var15 < -256) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var16 = var8 >> 4;
                if (~var16 <= -1) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var9 >> 4;
                if (var17 >= 0) {
                    if (~var17 < -256) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field1079[var3] = class182.method1314(var16, class182.method1314(var15 << 16, var17 << 8));
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
    public static final void method465(byte arg0, boolean arg1) {
        class67.method603((byte) -59);
        ++field1083;
        if (~class193.field3485 == -31 || class193.field3485 == 25) {
            if (arg0 > -58) {
                method465((byte) -16, false);
            }
            ++class261.field4613;
            if (~class261.field4613 <= -51 || arg1) {
                class261.field4613 = 0;
                if (!class247.field4392 && class175.field3261 != null) {
                    class196.field3553.method1267(78, -9);
                    ++class254.field4484;
                    try {
                        class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                        class196.field3553.field146 = 0;
                    } catch (IOException var2) {
                        class247.field4392 = true;
                    }
                }
                class67.method603((byte) -59);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "(I)V")
    public static void method466(int arg0) {
        field1084 = null;
        int var1 = 86 / ((-70 - arg0) / 55);
        field1072 = null;
        field1082 = null;
        field1076 = null;
        field1077 = null;
        field1070 = null;
        field1081 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field1073;
        int var3 = 109 % ((arg0 - -48) / 42);
        int[][] var4 = super.field4568.method241(25, arg1);
        if (super.field4568.field564) {
            int[] var5 = this.method1799(0, arg1, 126);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; ~class223.field3999 < ~var9; ++var9) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (~var10 < -257) {
                    var10 = 256;
                }
                int var11 = this.field1079[var10];
                var6[var9] = class68.method612(var11, 16711680) >> 12;
                var7[var9] = class68.method612(4080, var11 >> 4);
                var8[var9] = class68.method612(var11, 255) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        ++field1078;
        if (this.field1069 == null) {
            this.method467(1, -24755);
        }
        this.method464(false);
        if (arg0 < 11) {
            method469((byte) -64, 94);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V")
    private final void method467(int arg0, int arg1) {
        ++field1080;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1069 = new int[4][4];
                                this.field1069[0][0] = 2048;
                                this.field1069[0][3] = 0;
                                this.field1069[0][2] = 4096;
                                this.field1069[1][3] = 0;
                                this.field1069[1][0] = 2867;
                                this.field1069[2][3] = 0;
                                this.field1069[0][1] = 0;
                                this.field1069[2][0] = 3276;
                                this.field1069[1][2] = 4096;
                                this.field1069[2][2] = 4096;
                                this.field1069[1][1] = 4096;
                                this.field1069[3][3] = 0;
                                this.field1069[3][0] = 4096;
                                this.field1069[3][2] = 0;
                                this.field1069[2][1] = 4096;
                                this.field1069[3][1] = 4096;
                            } else {
                                this.field1069 = new int[16][4];
                                this.field1069[0][1] = 80;
                                this.field1069[0][2] = 192;
                                this.field1069[1][1] = 321;
                                this.field1069[0][0] = 0;
                                this.field1069[2][1] = 578;
                                this.field1069[1][2] = 449;
                                this.field1069[2][2] = 690;
                                this.field1069[3][1] = 947;
                                this.field1069[3][2] = 995;
                                this.field1069[4][1] = 1285;
                                this.field1069[1][0] = 155;
                                this.field1069[4][2] = 1397;
                                this.field1069[5][2] = 1429;
                                this.field1069[0][3] = 321;
                                this.field1069[1][3] = 562;
                                this.field1069[2][0] = 389;
                                this.field1069[6][2] = 1461;
                                this.field1069[5][1] = 1525;
                                this.field1069[2][3] = 803;
                                this.field1069[3][0] = 671;
                                this.field1069[7][2] = 1525;
                                this.field1069[6][1] = 1734;
                                this.field1069[3][3] = 1140;
                                this.field1069[4][3] = 1509;
                                this.field1069[5][3] = 1413;
                                this.field1069[6][3] = 1333;
                                this.field1069[7][3] = 1702;
                                this.field1069[8][2] = 1590;
                                this.field1069[8][3] = 2056;
                                this.field1069[7][1] = 1413;
                                this.field1069[4][0] = 897;
                                this.field1069[8][1] = 1108;
                                this.field1069[9][3] = 2666;
                                this.field1069[10][3] = 3276;
                                this.field1069[9][1] = 1766;
                                this.field1069[11][3] = 3228;
                                this.field1069[5][0] = 1175;
                                this.field1069[6][0] = 1368;
                                this.field1069[7][0] = 1507;
                                this.field1069[12][3] = 3196;
                                this.field1069[9][2] = 2056;
                                this.field1069[10][1] = 2409;
                                this.field1069[8][0] = 1736;
                                this.field1069[10][2] = 2586;
                                this.field1069[9][0] = 2088;
                                this.field1069[13][3] = 3019;
                                this.field1069[14][3] = 3228;
                                this.field1069[15][3] = 2746;
                                this.field1069[10][0] = 2355;
                                this.field1069[11][0] = 2691;
                                this.field1069[12][0] = 3031;
                                this.field1069[13][0] = 3522;
                                this.field1069[14][0] = 3727;
                                this.field1069[11][1] = 3116;
                                this.field1069[11][2] = 3148;
                                this.field1069[15][0] = 4096;
                                this.field1069[12][2] = 3710;
                                this.field1069[12][1] = 3806;
                                this.field1069[13][2] = 3421;
                                this.field1069[14][2] = 3148;
                                this.field1069[15][2] = 2505;
                                this.field1069[13][1] = 3437;
                                this.field1069[14][1] = 3116;
                                this.field1069[15][1] = 2377;
                            }
                        } else {
                            this.field1069 = new int[6][4];
                            this.field1069[0][0] = 0;
                            this.field1069[1][0] = 1843;
                            this.field1069[2][0] = 2457;
                            this.field1069[0][3] = 0;
                            this.field1069[3][0] = 2781;
                            this.field1069[0][1] = 0;
                            this.field1069[4][0] = 3481;
                            this.field1069[0][2] = 0;
                            this.field1069[1][2] = 0;
                            this.field1069[2][2] = 0;
                            this.field1069[3][2] = 1124;
                            this.field1069[1][3] = 1493;
                            this.field1069[1][1] = 0;
                            this.field1069[2][3] = 2939;
                            this.field1069[2][1] = 0;
                            this.field1069[3][1] = 0;
                            this.field1069[4][1] = 546;
                            this.field1069[4][2] = 3084;
                            this.field1069[5][1] = 4096;
                            this.field1069[3][3] = 3565;
                            this.field1069[4][3] = 4031;
                            this.field1069[5][2] = 4096;
                            this.field1069[5][3] = 4096;
                            this.field1069[5][0] = 4096;
                        }
                    } else {
                        this.field1069 = new int[7][4];
                        this.field1069[0][1] = 0;
                        this.field1069[1][1] = 0;
                        this.field1069[2][1] = 0;
                        this.field1069[0][2] = 0;
                        this.field1069[0][0] = 0;
                        this.field1069[0][3] = 4096;
                        this.field1069[1][3] = 4096;
                        this.field1069[1][0] = 663;
                        this.field1069[2][0] = 1363;
                        this.field1069[3][1] = 4096;
                        this.field1069[2][3] = 0;
                        this.field1069[4][1] = 4096;
                        this.field1069[1][2] = 4096;
                        this.field1069[5][1] = 4096;
                        this.field1069[3][3] = 0;
                        this.field1069[2][2] = 4096;
                        this.field1069[4][3] = 0;
                        this.field1069[3][0] = 2048;
                        this.field1069[4][0] = 2727;
                        this.field1069[3][2] = 4096;
                        this.field1069[5][0] = 3411;
                        this.field1069[4][2] = 0;
                        this.field1069[6][1] = 0;
                        this.field1069[5][2] = 0;
                        this.field1069[6][0] = 4096;
                        this.field1069[5][3] = 4096;
                        this.field1069[6][2] = 0;
                        this.field1069[6][3] = 4096;
                    }
                } else {
                    this.field1069 = new int[8][4];
                    this.field1069[0][1] = 2650;
                    this.field1069[0][2] = 2602;
                    this.field1069[0][0] = 0;
                    this.field1069[1][2] = 1799;
                    this.field1069[1][1] = 2313;
                    this.field1069[0][3] = 2361;
                    this.field1069[1][0] = 2867;
                    this.field1069[2][2] = 1734;
                    this.field1069[3][2] = 1220;
                    this.field1069[1][3] = 1558;
                    this.field1069[4][2] = 963;
                    this.field1069[2][1] = 2618;
                    this.field1069[2][3] = 1413;
                    this.field1069[3][3] = 947;
                    this.field1069[2][0] = 3072;
                    this.field1069[3][0] = 3276;
                    this.field1069[4][3] = 722;
                    this.field1069[3][1] = 2296;
                    this.field1069[4][1] = 2072;
                    this.field1069[5][2] = 2152;
                    this.field1069[6][2] = 1060;
                    this.field1069[5][3] = 1766;
                    this.field1069[5][1] = 2730;
                    this.field1069[6][3] = 915;
                    this.field1069[7][2] = 1413;
                    this.field1069[7][3] = 1140;
                    this.field1069[6][1] = 2232;
                    this.field1069[4][0] = 3481;
                    this.field1069[7][1] = 1686;
                    this.field1069[5][0] = 3686;
                    this.field1069[6][0] = 3891;
                    this.field1069[7][0] = 4096;
                }
            } else {
                this.field1069 = new int[2][4];
                this.field1069[0][2] = 0;
                this.field1069[1][2] = 4096;
                this.field1069[0][0] = 0;
                this.field1069[1][0] = 4096;
                this.field1069[0][3] = 0;
                this.field1069[1][3] = 4096;
                this.field1069[0][1] = 0;
                this.field1069[1][1] = 4096;
            }
        }
        if (arg1 == -24755) {
            ;
        }
    }

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "(I)V")
    public static final void method468(int arg0) {
        class196.field3553.method1267(161, -9);
        int var1 = 64 / ((-16 - arg0) / 47);
        ++class33.field821;
        ++field1068;
        class196.field3553.method72(-1033389592, 0L);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 == -1586849108) {
            ++field1075;
            if (~arg0 == -1) {
                int var4 = arg2.method63((byte) 81);
                if (var4 != 0) {
                    this.method467(var4, -24755);
                } else {
                    this.field1069 = new int[arg2.method63((byte) 124)][4];
                    for (int var5 = 0; ~var5 > ~this.field1069.length; ++var5) {
                        this.field1069[var5][0] = arg2.method65((byte) 110);
                        this.field1069[var5][1] = arg2.method63((byte) 116) << 4;
                        this.field1069[var5][2] = arg2.method63((byte) 82) << 4;
                        this.field1069[var5][3] = arg2.method63((byte) 110) << 4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(BI)Lrh;")
    public static final class112 method469(byte arg0, int arg1) {
        if (arg0 != 35) {
            return null;
        } else {
            ++field1085;
            class112 var2 = (class112) class204.field3636.method174((long) arg1, (byte) -62);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3;
                if (arg1 < 32768) {
                    var3 = class222.field3990.method1115(arg1, (byte) -125, 0);
                } else {
                    var3 = class3.field54.method1115(arg1 & 32767, (byte) -106, 0);
                }
                class112 var4 = new class112();
                if (var3 != null) {
                    var4.method880(new class8(var3), -1);
                }
                if (arg1 >= 32768) {
                    var4.method881(false);
                }
                class204.field3636.method169(var4, -124, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class47() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILaa;)Lic;")
    public static final class96 method470(int arg0, class8 arg1) {
        ++field1074;
        if (arg0 != 4096) {
            method469((byte) 101, 86);
        }
        return new class96(arg1.method74(116), arg1.method74(arg0 ^ 4193), arg1.method74(95), arg1.method74(arg0 ^ 4190), arg1.method60(23888), arg1.method60(arg0 ^ 19792), arg1.method63((byte) 76));
    }
}
