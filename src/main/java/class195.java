import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class195 extends class223 {

    @OriginalMember(owner = "client!dj", name = "O", descriptor = "[I")
    private int[] field3054 = new int[257];

    @OriginalMember(owner = "client!dj", name = "R", descriptor = "I")
    public static int field3057 = -1;

    @OriginalMember(owner = "client!dj", name = "P", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3055 = new CRC32();

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "[I")
    public static int[] field3065 = new int[32];

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!dj", name = "K", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!dj", name = "L", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!dj", name = "M", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!dj", name = "N", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!dj", name = "Q", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!dj", name = "T", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!dj", name = "U", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!dj", name = "V", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!dj", name = "S", descriptor = "[[I")
    private int[][] field3058;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "[[[B")
    public static byte[][][] field3063;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
    private final void method1390(int arg0, int arg1) {
        ++field3051;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                                this.field3058 = new int[4][4];
                                this.field3058[0][0] = 2048;
                                this.field3058[0][1] = 0;
                                this.field3058[1][1] = 4096;
                                this.field3058[0][2] = 4096;
                                this.field3058[1][0] = 2867;
                                this.field3058[2][0] = 3276;
                                this.field3058[3][0] = 4096;
                                this.field3058[0][3] = 0;
                                this.field3058[1][2] = 4096;
                                this.field3058[2][2] = 4096;
                                this.field3058[1][3] = 0;
                                this.field3058[2][1] = 4096;
                                this.field3058[2][3] = 0;
                                this.field3058[3][2] = 0;
                                this.field3058[3][1] = 4096;
                                this.field3058[3][3] = 0;
                            } else {
                                this.field3058 = new int[16][4];
                                this.field3058[0][0] = 0;
                                this.field3058[0][3] = 321;
                                this.field3058[0][1] = 80;
                                this.field3058[1][3] = 562;
                                this.field3058[1][1] = 321;
                                this.field3058[0][2] = 192;
                                this.field3058[2][1] = 578;
                                this.field3058[1][2] = 449;
                                this.field3058[2][3] = 803;
                                this.field3058[3][1] = 947;
                                this.field3058[4][1] = 1285;
                                this.field3058[1][0] = 155;
                                this.field3058[5][1] = 1525;
                                this.field3058[2][0] = 389;
                                this.field3058[6][1] = 1734;
                                this.field3058[2][2] = 690;
                                this.field3058[7][1] = 1413;
                                this.field3058[3][0] = 671;
                                this.field3058[3][2] = 995;
                                this.field3058[4][2] = 1397;
                                this.field3058[4][0] = 897;
                                this.field3058[5][0] = 1175;
                                this.field3058[5][2] = 1429;
                                this.field3058[6][2] = 1461;
                                this.field3058[3][3] = 1140;
                                this.field3058[8][1] = 1108;
                                this.field3058[7][2] = 1525;
                                this.field3058[8][2] = 1590;
                                this.field3058[9][1] = 1766;
                                this.field3058[6][0] = 1368;
                                this.field3058[9][2] = 2056;
                                this.field3058[4][3] = 1509;
                                this.field3058[10][2] = 2586;
                                this.field3058[7][0] = 1507;
                                this.field3058[5][3] = 1413;
                                this.field3058[10][1] = 2409;
                                this.field3058[11][1] = 3116;
                                this.field3058[11][2] = 3148;
                                this.field3058[12][2] = 3710;
                                this.field3058[6][3] = 1333;
                                this.field3058[12][1] = 3806;
                                this.field3058[8][0] = 1736;
                                this.field3058[13][2] = 3421;
                                this.field3058[9][0] = 2088;
                                this.field3058[13][1] = 3437;
                                this.field3058[7][3] = 1702;
                                this.field3058[10][0] = 2355;
                                this.field3058[14][2] = 3148;
                                this.field3058[14][1] = 3116;
                                this.field3058[11][0] = 2691;
                                this.field3058[15][1] = 2377;
                                this.field3058[8][3] = 2056;
                                this.field3058[15][2] = 2505;
                                this.field3058[12][0] = 3031;
                                this.field3058[13][0] = 3522;
                                this.field3058[14][0] = 3727;
                                this.field3058[15][0] = 4096;
                                this.field3058[9][3] = 2666;
                                this.field3058[10][3] = 3276;
                                this.field3058[11][3] = 3228;
                                this.field3058[12][3] = 3196;
                                this.field3058[13][3] = 3019;
                                this.field3058[14][3] = 3228;
                                this.field3058[15][3] = 2746;
                            }
                        } else {
                            this.field3058 = new int[6][4];
                            this.field3058[0][3] = 0;
                            this.field3058[0][1] = 0;
                            this.field3058[1][1] = 0;
                            this.field3058[1][3] = 1493;
                            this.field3058[2][3] = 2939;
                            this.field3058[0][0] = 0;
                            this.field3058[1][0] = 1843;
                            this.field3058[2][1] = 0;
                            this.field3058[3][3] = 3565;
                            this.field3058[2][0] = 2457;
                            this.field3058[0][2] = 0;
                            this.field3058[1][2] = 0;
                            this.field3058[3][1] = 0;
                            this.field3058[3][0] = 2781;
                            this.field3058[2][2] = 0;
                            this.field3058[4][0] = 3481;
                            this.field3058[4][1] = 546;
                            this.field3058[5][1] = 4096;
                            this.field3058[4][3] = 4031;
                            this.field3058[5][3] = 4096;
                            this.field3058[5][0] = 4096;
                            this.field3058[3][2] = 1124;
                            this.field3058[4][2] = 3084;
                            this.field3058[5][2] = 4096;
                        }
                    } else {
                        this.field3058 = new int[7][4];
                        this.field3058[0][2] = 0;
                        this.field3058[0][0] = 0;
                        this.field3058[1][0] = 663;
                        this.field3058[0][3] = 4096;
                        this.field3058[0][1] = 0;
                        this.field3058[1][1] = 0;
                        this.field3058[2][0] = 1363;
                        this.field3058[3][0] = 2048;
                        this.field3058[1][3] = 4096;
                        this.field3058[2][1] = 0;
                        this.field3058[2][3] = 0;
                        this.field3058[1][2] = 4096;
                        this.field3058[3][1] = 4096;
                        this.field3058[3][3] = 0;
                        this.field3058[4][0] = 2727;
                        this.field3058[4][1] = 4096;
                        this.field3058[4][3] = 0;
                        this.field3058[5][3] = 4096;
                        this.field3058[5][1] = 4096;
                        this.field3058[2][2] = 4096;
                        this.field3058[6][3] = 4096;
                        this.field3058[5][0] = 3411;
                        this.field3058[3][2] = 4096;
                        this.field3058[6][1] = 0;
                        this.field3058[4][2] = 0;
                        this.field3058[5][2] = 0;
                        this.field3058[6][2] = 0;
                        this.field3058[6][0] = 4096;
                    }
                } else {
                    this.field3058 = new int[8][4];
                    this.field3058[0][1] = 2650;
                    this.field3058[0][2] = 2602;
                    this.field3058[1][2] = 1799;
                    this.field3058[1][1] = 2313;
                    this.field3058[2][2] = 1734;
                    this.field3058[3][2] = 1220;
                    this.field3058[4][2] = 963;
                    this.field3058[0][0] = 0;
                    this.field3058[0][3] = 2361;
                    this.field3058[5][2] = 2152;
                    this.field3058[1][3] = 1558;
                    this.field3058[6][2] = 1060;
                    this.field3058[7][2] = 1413;
                    this.field3058[2][3] = 1413;
                    this.field3058[3][3] = 947;
                    this.field3058[1][0] = 2867;
                    this.field3058[2][0] = 3072;
                    this.field3058[3][0] = 3276;
                    this.field3058[4][3] = 722;
                    this.field3058[2][1] = 2618;
                    this.field3058[4][0] = 3481;
                    this.field3058[5][0] = 3686;
                    this.field3058[3][1] = 2296;
                    this.field3058[4][1] = 2072;
                    this.field3058[5][3] = 1766;
                    this.field3058[6][3] = 915;
                    this.field3058[6][0] = 3891;
                    this.field3058[7][0] = 4096;
                    this.field3058[5][1] = 2730;
                    this.field3058[7][3] = 1140;
                    this.field3058[6][1] = 2232;
                    this.field3058[7][1] = 1686;
                }
            } else {
                this.field3058 = new int[2][4];
                this.field3058[0][3] = 0;
                this.field3058[0][1] = 0;
                this.field3058[0][0] = 0;
                this.field3058[1][0] = 4096;
                this.field3058[0][2] = 0;
                this.field3058[1][2] = 4096;
                this.field3058[1][1] = 4096;
                this.field3058[1][3] = 4096;
            }
        }
        if (arg1 >= -72) {
            this.method37((class31) null, 102, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgk;I)V")
    public static final void method1391(class161 arg0, int arg1) {
        if (arg1 <= 36) {
            field3063 = null;
        }
        ++field3050;
        for (class80 var2 = (class80) class121.field1832.method6(-121); var2 != null; var2 = (class80) class121.field1832.method11((byte) 116)) {
            if (var2.field1218 == arg0) {
                if (var2.field1220 != null) {
                    class83.field1251.method243(var2.field1220);
                    var2.field1220 = null;
                }
                var2.method995((byte) 101);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class195() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
    public static void method1392(boolean arg0) {
        field3063 = null;
        if (arg0) {
            field3063 = null;
        }
        field3065 = null;
        field3055 = null;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(B)V")
    private final void method1393(byte arg0) {
        int var2 = 73 % ((-12 - arg0) / 53);
        ++field3064;
        int var3 = this.field3058.length;
        if (var3 > 0) {
            for (int var4 = 0; var4 < 257; ++var4) {
                int var5 = var4 << 4;
                int var6 = 0;
                for (int var7 = 0; var3 > var7 && ~var5 <= ~this.field3058[var7][0]; ++var7) {
                    ++var6;
                }
                int var12;
                int var13;
                int var14;
                if (~var3 < ~var6) {
                    int[] var8 = this.field3058[var6];
                    if (~var6 < -1) {
                        int[] var9 = this.field3058[var6 + -1];
                        int var10 = (-var9[0] + var5 << 12) / (var8[0] + -var9[0]);
                        int var11 = 4096 - var10;
                        var12 = var8[2] * var10 + var9[2] * var11 >> 12;
                        var13 = var8[3] * var10 + var9[3] * var11 >> 12;
                        var14 = var8[1] * var10 + var9[1] * var11 >> 12;
                    } else {
                        var12 = var8[2];
                        var14 = var8[1];
                        var13 = var8[3];
                    }
                } else {
                    int[] var15 = this.field3058[var3 + -1];
                    var12 = var15[2];
                    var13 = var15[3];
                    var14 = var15[1];
                }
                int var16 = var12 >> 4;
                if (var16 >= 0) {
                    if (~var16 < -256) {
                        var16 = 255;
                    }
                } else {
                    var16 = 0;
                }
                int var17 = var13 >> 4;
                int var18 = var14 >> 4;
                if (~var18 > -1) {
                    var18 = 0;
                } else if (~var18 < -256) {
                    var18 = 255;
                }
                if (~var17 <= -1) {
                    if (var17 > 255) {
                        var17 = 255;
                    }
                } else {
                    var17 = 0;
                }
                this.field3054[var4] = class44.method377(class44.method377(var16 << 8, var18 << 16), var17);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        int[][] var3 = super.field3572.method1818(arg1, false);
        ++field3049;
        if (arg0 < 0) {
            field3063 = null;
        }
        if (super.field3572.field4257) {
            int[] var4 = this.method1533(0, arg1, -67);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class250.field4008; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3054[var9];
                var5[var8] = class118.method863(4080, var10 >> 12);
                var6[var8] = class118.method863(var10 >> 4, 4080);
                var7[var8] = class118.method863(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IZIZI)V")
    public static final void method1394(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        ++field3056;
        class142.method1038(arg1, arg0, class261.field4126.length + -1, 0, arg3, arg4, false);
        if (arg2 != -23100) {
            field3063 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "(I)V")
    public static final void method1395(int arg0) {
        if (~class129.field1920 > -1) {
            class232.field3674 = -1;
            class129.field1920 = 0;
            class254.field4063 = -1;
        }
        ++field3062;
        if (class129.field1920 > class152.field2247) {
            class129.field1920 = class152.field2247;
            class254.field4063 = -1;
            class232.field3674 = -1;
        }
        if (~class175.field2698 > -1) {
            class175.field2698 = 0;
            class254.field4063 = -1;
            class232.field3674 = -1;
        }
        if (arg0 != 28690) {
            field3063 = null;
        }
        if (~class92.field1475 > ~class175.field2698) {
            class175.field2698 = class92.field1475;
            class232.field3674 = -1;
            class254.field4063 = -1;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            if (~arg1 == -1) {
                int var4 = arg0.method265(-112);
                if (~var4 != -1) {
                    this.method1390(var4, -85);
                } else {
                    this.field3058 = new int[arg0.method265(-87)][4];
                    for (int var5 = 0; ~var5 > ~this.field3058.length; ++var5) {
                        this.field3058[var5][0] = arg0.method260((byte) -67);
                        this.field3058[var5][1] = arg0.method265(arg2 + -217) << 4;
                        this.field3058[var5][2] = arg0.method265(-82) << 4;
                        this.field3058[var5][3] = arg0.method265(class222.method1528(arg2, -30)) << 4;
                    }
                }
            }
            ++field3053;
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (this.field3058 == null) {
            this.method1390(1, -123);
        }
        ++field3059;
        if (arg0 != 500) {
            method1395(102);
        }
        this.method1393((byte) -74);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILub;Lub;)V")
    public static final void method1396(int arg0, class92 arg1, class92 arg2) {
        if (arg0 != 4) {
            method1391((class161) null, 59);
        }
        class24.field421 = arg2;
        class170.field2571 = arg1;
        ++field3061;
    }
}
