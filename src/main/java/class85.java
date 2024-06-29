import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class85 extends class123 {

    @OriginalMember(owner = "client!ai", name = "bb", descriptor = "[I")
    private int[] field1498 = new int[257];

    @OriginalMember(owner = "client!ai", name = "Z", descriptor = "I")
    public static int field1496 = 0;

    @OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
    public static int field1495 = 0;

    @OriginalMember(owner = "client!ai", name = "kb", descriptor = "Leb;")
    public static class230 field1507 = class68.method589(0, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ai", name = "X", descriptor = "[Leb;")
    public static class230[] field1494 = new class230[8];

    @OriginalMember(owner = "client!ai", name = "ab", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!ai", name = "cb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ai", name = "db", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!ai", name = "eb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ai", name = "fb", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ai", name = "gb", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ai", name = "hb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ai", name = "ib", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ai", name = "mb", descriptor = "Lkk;")
    public static class223 field1509;

    @OriginalMember(owner = "client!ai", name = "lb", descriptor = "[Leh;")
    public static class80[] field1508;

    @OriginalMember(owner = "client!ai", name = "jb", descriptor = "[[I")
    private int[][] field1506;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        if (this.field1506 == null) {
            this.method680(1, (byte) 95);
        }
        ++field1501;
        this.method683(257);
        if (arg0 != 0) {
            field1495 = -5;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(IB)V")
    private final void method680(int arg0, byte arg1) {
        ++field1499;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field1506 = new int[4][4];
                                this.field1506[0][3] = 0;
                                this.field1506[0][1] = 0;
                                this.field1506[1][1] = 4096;
                                this.field1506[2][1] = 4096;
                                this.field1506[1][3] = 0;
                                this.field1506[3][1] = 4096;
                                this.field1506[0][2] = 4096;
                                this.field1506[0][0] = 2048;
                                this.field1506[1][0] = 2867;
                                this.field1506[2][3] = 0;
                                this.field1506[1][2] = 4096;
                                this.field1506[2][0] = 3276;
                                this.field1506[2][2] = 4096;
                                this.field1506[3][2] = 0;
                                this.field1506[3][3] = 0;
                                this.field1506[3][0] = 4096;
                            } else {
                                this.field1506 = new int[16][4];
                                this.field1506[0][3] = 321;
                                this.field1506[0][2] = 192;
                                this.field1506[0][1] = 80;
                                this.field1506[1][2] = 449;
                                this.field1506[1][3] = 562;
                                this.field1506[1][1] = 321;
                                this.field1506[2][2] = 690;
                                this.field1506[3][2] = 995;
                                this.field1506[4][2] = 1397;
                                this.field1506[0][0] = 0;
                                this.field1506[2][1] = 578;
                                this.field1506[1][0] = 155;
                                this.field1506[5][2] = 1429;
                                this.field1506[2][0] = 389;
                                this.field1506[3][1] = 947;
                                this.field1506[3][0] = 671;
                                this.field1506[4][0] = 897;
                                this.field1506[2][3] = 803;
                                this.field1506[4][1] = 1285;
                                this.field1506[5][0] = 1175;
                                this.field1506[5][1] = 1525;
                                this.field1506[3][3] = 1140;
                                this.field1506[6][2] = 1461;
                                this.field1506[4][3] = 1509;
                                this.field1506[5][3] = 1413;
                                this.field1506[6][1] = 1734;
                                this.field1506[6][3] = 1333;
                                this.field1506[7][1] = 1413;
                                this.field1506[7][2] = 1525;
                                this.field1506[6][0] = 1368;
                                this.field1506[8][1] = 1108;
                                this.field1506[7][0] = 1507;
                                this.field1506[7][3] = 1702;
                                this.field1506[8][0] = 1736;
                                this.field1506[9][1] = 1766;
                                this.field1506[8][2] = 1590;
                                this.field1506[9][0] = 2088;
                                this.field1506[10][1] = 2409;
                                this.field1506[9][2] = 2056;
                                this.field1506[11][1] = 3116;
                                this.field1506[12][1] = 3806;
                                this.field1506[10][0] = 2355;
                                this.field1506[10][2] = 2586;
                                this.field1506[11][2] = 3148;
                                this.field1506[8][3] = 2056;
                                this.field1506[9][3] = 2666;
                                this.field1506[10][3] = 3276;
                                this.field1506[13][1] = 3437;
                                this.field1506[12][2] = 3710;
                                this.field1506[13][2] = 3421;
                                this.field1506[14][2] = 3148;
                                this.field1506[14][1] = 3116;
                                this.field1506[11][0] = 2691;
                                this.field1506[12][0] = 3031;
                                this.field1506[15][2] = 2505;
                                this.field1506[13][0] = 3522;
                                this.field1506[15][1] = 2377;
                                this.field1506[14][0] = 3727;
                                this.field1506[11][3] = 3228;
                                this.field1506[15][0] = 4096;
                                this.field1506[12][3] = 3196;
                                this.field1506[13][3] = 3019;
                                this.field1506[14][3] = 3228;
                                this.field1506[15][3] = 2746;
                            }
                        } else {
                            this.field1506 = new int[6][4];
                            this.field1506[0][0] = 0;
                            this.field1506[0][2] = 0;
                            this.field1506[1][2] = 0;
                            this.field1506[2][2] = 0;
                            this.field1506[1][0] = 1843;
                            this.field1506[2][0] = 2457;
                            this.field1506[3][0] = 2781;
                            this.field1506[0][1] = 0;
                            this.field1506[0][3] = 0;
                            this.field1506[4][0] = 3481;
                            this.field1506[5][0] = 4096;
                            this.field1506[1][3] = 1493;
                            this.field1506[2][3] = 2939;
                            this.field1506[3][3] = 3565;
                            this.field1506[4][3] = 4031;
                            this.field1506[1][1] = 0;
                            this.field1506[5][3] = 4096;
                            this.field1506[3][2] = 1124;
                            this.field1506[2][1] = 0;
                            this.field1506[3][1] = 0;
                            this.field1506[4][1] = 546;
                            this.field1506[5][1] = 4096;
                            this.field1506[4][2] = 3084;
                            this.field1506[5][2] = 4096;
                        }
                    } else {
                        this.field1506 = new int[7][4];
                        this.field1506[0][0] = 0;
                        this.field1506[0][1] = 0;
                        this.field1506[1][0] = 663;
                        this.field1506[0][2] = 0;
                        this.field1506[1][1] = 0;
                        this.field1506[1][2] = 4096;
                        this.field1506[2][1] = 0;
                        this.field1506[0][3] = 4096;
                        this.field1506[1][3] = 4096;
                        this.field1506[2][3] = 0;
                        this.field1506[3][3] = 0;
                        this.field1506[3][1] = 4096;
                        this.field1506[4][3] = 0;
                        this.field1506[2][2] = 4096;
                        this.field1506[3][2] = 4096;
                        this.field1506[5][3] = 4096;
                        this.field1506[4][2] = 0;
                        this.field1506[2][0] = 1363;
                        this.field1506[6][3] = 4096;
                        this.field1506[3][0] = 2048;
                        this.field1506[4][0] = 2727;
                        this.field1506[5][0] = 3411;
                        this.field1506[4][1] = 4096;
                        this.field1506[6][0] = 4096;
                        this.field1506[5][2] = 0;
                        this.field1506[5][1] = 4096;
                        this.field1506[6][2] = 0;
                        this.field1506[6][1] = 0;
                    }
                } else {
                    this.field1506 = new int[8][4];
                    this.field1506[0][2] = 2602;
                    this.field1506[1][2] = 1799;
                    this.field1506[2][2] = 1734;
                    this.field1506[0][3] = 2361;
                    this.field1506[0][1] = 2650;
                    this.field1506[1][3] = 1558;
                    this.field1506[1][1] = 2313;
                    this.field1506[0][0] = 0;
                    this.field1506[2][3] = 1413;
                    this.field1506[2][1] = 2618;
                    this.field1506[1][0] = 2867;
                    this.field1506[2][0] = 3072;
                    this.field1506[3][3] = 947;
                    this.field1506[3][1] = 2296;
                    this.field1506[4][1] = 2072;
                    this.field1506[3][2] = 1220;
                    this.field1506[5][1] = 2730;
                    this.field1506[3][0] = 3276;
                    this.field1506[4][0] = 3481;
                    this.field1506[4][3] = 722;
                    this.field1506[4][2] = 963;
                    this.field1506[5][0] = 3686;
                    this.field1506[6][0] = 3891;
                    this.field1506[5][2] = 2152;
                    this.field1506[6][1] = 2232;
                    this.field1506[6][2] = 1060;
                    this.field1506[5][3] = 1766;
                    this.field1506[6][3] = 915;
                    this.field1506[7][0] = 4096;
                    this.field1506[7][1] = 1686;
                    this.field1506[7][3] = 1140;
                    this.field1506[7][2] = 1413;
                }
            } else {
                this.field1506 = new int[2][4];
                this.field1506[0][2] = 0;
                this.field1506[0][0] = 0;
                this.field1506[0][3] = 0;
                this.field1506[0][1] = 0;
                this.field1506[1][2] = 4096;
                this.field1506[1][1] = 4096;
                this.field1506[1][0] = 4096;
                this.field1506[1][3] = 4096;
            }
        }
        int var4 = -94 / ((arg1 - 20) / 58);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class85() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(II)[[I")
    public final int[][] method2(int arg0, int arg1) {
        if (arg1 != 26080) {
            return null;
        } else {
            ++field1497;
            int[][] var3 = super.field2152.method1106(arg0, -7034);
            if (super.field2152.field2616) {
                int[] var4 = this.method965(0, arg0, (byte) 121);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                for (int var8 = 0; class140.field2505 > var8; ++var8) {
                    int var9 = var4[var8] >> 4;
                    if (~var9 > -1) {
                        var9 = 0;
                    }
                    if (var9 > 256) {
                        var9 = 256;
                    }
                    int var10 = this.field1498[var9];
                    var5[var8] = class189.method1350(4080, var10 >> 12);
                    var6[var8] = class189.method1350(var10, 65280) >> 4;
                    var7[var8] = class189.method1350(255, var10) << 4;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(III)V")
    public static final void method681(int arg0, int arg1, int arg2) {
        ++field1504;
        if (arg0 > -74) {
            field1495 = -115;
        }
        class197 var3 = class164.method1228(13, arg1, -1665874464);
        var3.method1402((byte) -102);
        var3.field3527 = arg2;
    }

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1509 = null;
        field1507 = null;
        field1508 = null;
        field1494 = null;
        if (arg0 != 4181) {
            method682(-64);
        }
    }

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "(I)V")
    private final void method683(int arg0) {
        ++field1500;
        if (arg0 != 257) {
            this.field1506 = null;
        }
        int var2 = this.field1506.length;
        if (~var2 < -1) {
            for (int var3 = 0; var3 < 257; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; ~var2 < ~var6 && ~var5 <= ~this.field1506[var6][0]; ++var6) {
                    ++var4;
                }
                int var11;
                int var12;
                int var13;
                if (var2 > var4) {
                    int[] var7 = this.field1506[var4];
                    if (var4 > 0) {
                        int[] var8 = this.field1506[var4 + -1];
                        int var9 = (-var8[0] + var5 << 12) / (var7[0] + -var8[0]);
                        int var10 = -var9 + 4096;
                        var11 = var7[1] * var9 - -(var8[1] * var10) >> 12;
                        var12 = var7[3] * var9 - -(var8[3] * var10) >> 12;
                        var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                    } else {
                        var13 = var7[2];
                        var12 = var7[3];
                        var11 = var7[1];
                    }
                } else {
                    int[] var14 = this.field1506[var2 - 1];
                    var13 = var14[2];
                    var12 = var14[3];
                    var11 = var14[1];
                }
                int var15 = var11 >> 4;
                if (var15 < 0) {
                    var15 = 0;
                } else if (~var15 < -256) {
                    var15 = 255;
                }
                int var16 = var13 >> 4;
                int var17 = var12 >> 4;
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                if (var16 < 0) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                this.field1498[var3] = class177.method1290(class177.method1290(var15 << 16, var16 << 8), var17);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method200(255);
            if (var4 == 0) {
                this.field1506 = new int[arg1.method200(255)][4];
                for (int var5 = 0; this.field1506.length > var5; ++var5) {
                    this.field1506[var5][0] = arg1.method161(4);
                    this.field1506[var5][1] = arg1.method200(255) << 4;
                    this.field1506[var5][2] = arg1.method200(arg2 + -1876195533) << 4;
                    this.field1506[var5][3] = arg1.method200(class168.method1239(arg2, 1876195635)) << 4;
                }
            } else {
                this.method680(var4, (byte) -91);
            }
        }
        if (arg2 == 1876195788) {
            ++field1503;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBLkk;)Lmf;")
    public static final class10 method684(int arg0, byte arg1, class223 arg2) {
        ++field1505;
        if (!class48.method402(arg2, arg0, true)) {
            return null;
        } else {
            if (arg1 != -114) {
                method684(-30, (byte) -66, (class223) null);
            }
            return class142.method1091((byte) 124);
        }
    }
}
