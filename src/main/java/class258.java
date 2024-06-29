import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class258 extends class105 {

    @OriginalMember(owner = "client!eg", name = "U", descriptor = "[I")
    private int[] field4431 = new int[257];

    @OriginalMember(owner = "client!eg", name = "Q", descriptor = "Z")
    public static boolean field4428 = true;

    @OriginalMember(owner = "client!eg", name = "R", descriptor = "Lch;")
    public static class117 field4429 = new class117();

    @OriginalMember(owner = "client!eg", name = "cb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4439 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!eg", name = "gb", descriptor = "Lvf;")
    public static class265 field4443 = class87.method582(-46, "Clientscript error in: ");

    @OriginalMember(owner = "client!eg", name = "fb", descriptor = "Lvf;")
    public static class265 field4442 = class87.method582(-46, " loggt sich aus)3");

    @OriginalMember(owner = "client!eg", name = "hb", descriptor = "[[I")
    public static int[][] field4444 = new int[104][104];

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!eg", name = "Z", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!eg", name = "db", descriptor = "Lfl;")
    public static class192 field4440;

    @OriginalMember(owner = "client!eg", name = "eb", descriptor = "[Lcg;")
    public static class34[] field4441;

    @OriginalMember(owner = "client!eg", name = "P", descriptor = "[[I")
    private int[][] field4427;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIZII)Loe;")
    public static final class108 method1701(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field4430;
        int var7 = (arg1 << 17) + arg5 - -(arg3 ? 65536 : 0) + (arg2 << 19);
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        class108 var10 = (class108) class13.field417.method1887(110, var8);
        if (var10 != null) {
            return var10;
        } else {
            class247.field4290 = false;
            class108 var11 = class278.method1898(arg1, arg2, (byte) 36, arg0, arg3, false, arg4, arg5);
            if (var11 != null && !class247.field4290) {
                class13.field417.method1892(var11, var8, (byte) -125);
            }
            return var11;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(IB)V")
    private final void method1702(int arg0, byte arg1) {
        if (arg1 <= 10) {
            field4429 = null;
        }
        ++field4438;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 == 6) {
                                    this.field4427 = new int[4][4];
                                    this.field4427[0][1] = 0;
                                    this.field4427[0][2] = 4096;
                                    this.field4427[1][1] = 4096;
                                    this.field4427[1][2] = 4096;
                                    this.field4427[2][2] = 4096;
                                    this.field4427[3][2] = 0;
                                    this.field4427[0][3] = 0;
                                    this.field4427[1][3] = 0;
                                    this.field4427[2][3] = 0;
                                    this.field4427[2][1] = 4096;
                                    this.field4427[0][0] = 2048;
                                    this.field4427[3][1] = 4096;
                                    this.field4427[3][3] = 0;
                                    this.field4427[1][0] = 2867;
                                    this.field4427[2][0] = 3276;
                                    this.field4427[3][0] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field4427 = new int[16][4];
                                this.field4427[0][3] = 321;
                                this.field4427[0][2] = 192;
                                this.field4427[1][3] = 562;
                                this.field4427[2][3] = 803;
                                this.field4427[1][2] = 449;
                                this.field4427[2][2] = 690;
                                this.field4427[0][0] = 0;
                                this.field4427[1][0] = 155;
                                this.field4427[2][0] = 389;
                                this.field4427[3][2] = 995;
                                this.field4427[4][2] = 1397;
                                this.field4427[3][0] = 671;
                                this.field4427[5][2] = 1429;
                                this.field4427[6][2] = 1461;
                                this.field4427[7][2] = 1525;
                                this.field4427[0][1] = 80;
                                this.field4427[8][2] = 1590;
                                this.field4427[9][2] = 2056;
                                this.field4427[3][3] = 1140;
                                this.field4427[1][1] = 321;
                                this.field4427[10][2] = 2586;
                                this.field4427[11][2] = 3148;
                                this.field4427[2][1] = 578;
                                this.field4427[4][0] = 897;
                                this.field4427[12][2] = 3710;
                                this.field4427[3][1] = 947;
                                this.field4427[4][3] = 1509;
                                this.field4427[5][0] = 1175;
                                this.field4427[6][0] = 1368;
                                this.field4427[7][0] = 1507;
                                this.field4427[5][3] = 1413;
                                this.field4427[8][0] = 1736;
                                this.field4427[4][1] = 1285;
                                this.field4427[6][3] = 1333;
                                this.field4427[7][3] = 1702;
                                this.field4427[13][2] = 3421;
                                this.field4427[8][3] = 2056;
                                this.field4427[9][3] = 2666;
                                this.field4427[9][0] = 2088;
                                this.field4427[5][1] = 1525;
                                this.field4427[10][0] = 2355;
                                this.field4427[6][1] = 1734;
                                this.field4427[7][1] = 1413;
                                this.field4427[11][0] = 2691;
                                this.field4427[8][1] = 1108;
                                this.field4427[12][0] = 3031;
                                this.field4427[10][3] = 3276;
                                this.field4427[9][1] = 1766;
                                this.field4427[13][0] = 3522;
                                this.field4427[10][1] = 2409;
                                this.field4427[11][3] = 3228;
                                this.field4427[12][3] = 3196;
                                this.field4427[11][1] = 3116;
                                this.field4427[14][0] = 3727;
                                this.field4427[14][2] = 3148;
                                this.field4427[15][2] = 2505;
                                this.field4427[12][1] = 3806;
                                this.field4427[13][3] = 3019;
                                this.field4427[14][3] = 3228;
                                this.field4427[13][1] = 3437;
                                this.field4427[14][1] = 3116;
                                this.field4427[15][3] = 2746;
                                this.field4427[15][1] = 2377;
                                this.field4427[15][0] = 4096;
                            }
                        } else {
                            this.field4427 = new int[6][4];
                            this.field4427[0][3] = 0;
                            this.field4427[0][0] = 0;
                            this.field4427[0][2] = 0;
                            this.field4427[1][3] = 1493;
                            this.field4427[0][1] = 0;
                            this.field4427[1][0] = 1843;
                            this.field4427[2][0] = 2457;
                            this.field4427[3][0] = 2781;
                            this.field4427[1][1] = 0;
                            this.field4427[2][3] = 2939;
                            this.field4427[2][1] = 0;
                            this.field4427[4][0] = 3481;
                            this.field4427[3][1] = 0;
                            this.field4427[4][1] = 546;
                            this.field4427[1][2] = 0;
                            this.field4427[3][3] = 3565;
                            this.field4427[5][1] = 4096;
                            this.field4427[4][3] = 4031;
                            this.field4427[5][0] = 4096;
                            this.field4427[2][2] = 0;
                            this.field4427[3][2] = 1124;
                            this.field4427[5][3] = 4096;
                            this.field4427[4][2] = 3084;
                            this.field4427[5][2] = 4096;
                        }
                    } else {
                        this.field4427 = new int[7][4];
                        this.field4427[0][1] = 0;
                        this.field4427[1][1] = 0;
                        this.field4427[0][2] = 0;
                        this.field4427[1][2] = 4096;
                        this.field4427[2][2] = 4096;
                        this.field4427[2][1] = 0;
                        this.field4427[3][1] = 4096;
                        this.field4427[3][2] = 4096;
                        this.field4427[0][0] = 0;
                        this.field4427[1][0] = 663;
                        this.field4427[0][3] = 4096;
                        this.field4427[2][0] = 1363;
                        this.field4427[3][0] = 2048;
                        this.field4427[4][1] = 4096;
                        this.field4427[5][1] = 4096;
                        this.field4427[4][2] = 0;
                        this.field4427[6][1] = 0;
                        this.field4427[4][0] = 2727;
                        this.field4427[5][2] = 0;
                        this.field4427[1][3] = 4096;
                        this.field4427[6][2] = 0;
                        this.field4427[5][0] = 3411;
                        this.field4427[2][3] = 0;
                        this.field4427[6][0] = 4096;
                        this.field4427[3][3] = 0;
                        this.field4427[4][3] = 0;
                        this.field4427[5][3] = 4096;
                        this.field4427[6][3] = 4096;
                    }
                } else {
                    this.field4427 = new int[8][4];
                    this.field4427[0][1] = 2650;
                    this.field4427[0][2] = 2602;
                    this.field4427[0][3] = 2361;
                    this.field4427[0][0] = 0;
                    this.field4427[1][1] = 2313;
                    this.field4427[1][3] = 1558;
                    this.field4427[2][1] = 2618;
                    this.field4427[2][3] = 1413;
                    this.field4427[3][3] = 947;
                    this.field4427[1][2] = 1799;
                    this.field4427[2][2] = 1734;
                    this.field4427[4][3] = 722;
                    this.field4427[5][3] = 1766;
                    this.field4427[3][1] = 2296;
                    this.field4427[6][3] = 915;
                    this.field4427[4][1] = 2072;
                    this.field4427[3][2] = 1220;
                    this.field4427[5][1] = 2730;
                    this.field4427[4][2] = 963;
                    this.field4427[5][2] = 2152;
                    this.field4427[7][3] = 1140;
                    this.field4427[6][1] = 2232;
                    this.field4427[1][0] = 2867;
                    this.field4427[2][0] = 3072;
                    this.field4427[6][2] = 1060;
                    this.field4427[3][0] = 3276;
                    this.field4427[7][1] = 1686;
                    this.field4427[4][0] = 3481;
                    this.field4427[5][0] = 3686;
                    this.field4427[7][2] = 1413;
                    this.field4427[6][0] = 3891;
                    this.field4427[7][0] = 4096;
                }
            } else {
                this.field4427 = new int[2][4];
                this.field4427[0][3] = 0;
                this.field4427[0][1] = 0;
                this.field4427[1][3] = 4096;
                this.field4427[1][1] = 4096;
                this.field4427[0][2] = 0;
                this.field4427[0][0] = 0;
                this.field4427[1][2] = 4096;
                this.field4427[1][0] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)Lr;")
    public static final class229 method1703(byte arg0, int arg1) {
        ++field4434;
        if (arg0 >= -76) {
            return null;
        } else {
            return class76.field1465 && class182.field3233 <= arg1 && ~class179.field3187 <= ~arg1 ? class252.field4331[-class182.field3233 + arg1] : null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)V")
    public static final void method1704(int arg0) {
        if (arg0 != 0) {
            field4440 = null;
        }
        ++field4435;
        class164.field2981.method1893(arg0 + -61);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            field4440 = null;
        }
        if (arg0 == 0) {
            int var4 = arg2.method920((byte) 127);
            if (~var4 == -1) {
                this.field4427 = new int[arg2.method920((byte) 119)][4];
                for (int var5 = 0; var5 < this.field4427.length; ++var5) {
                    this.field4427[var5][0] = arg2.method927(127);
                    this.field4427[var5][1] = arg2.method920((byte) 65) << 4;
                    this.field4427[var5][2] = arg2.method920((byte) 62) << 4;
                    this.field4427[var5][3] = arg2.method920((byte) 85) << 4;
                }
            } else {
                this.method1702(var4, (byte) 52);
            }
        }
        ++field4432;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        if (arg1 >= -110) {
            method1708(82);
        }
        int[][] var3 = super.field1870.method569((byte) -112, arg0);
        ++field4433;
        if (super.field1870.field1567) {
            int[] var4 = this.method705(arg0, (byte) -107, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; ~class94.field1668 < ~var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (~var9 < -257) {
                    var9 = 256;
                }
                int var10 = this.field4431[var9];
                var6[var8] = class203.method1395(16711680, var10) >> 12;
                var5[var8] = class203.method1395(var10 >> 4, 4080);
                var7[var8] = class203.method1395(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    public class258() {
        super(1, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLvf;)V")
    public static final void method1705(byte arg0, class265 arg1) {
        ++field4437;
        if (arg0 != -102) {
            field4443 = null;
        }
        int var2 = class23.method228(arg1, 19332);
        if (var2 != -1) {
            class113.method745(class126.field2260.field2709[var2], true, class126.field2260.field2705[var2]);
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(Z)V")
    public static void method1706(boolean arg0) {
        field4429 = null;
        field4443 = null;
        field4444 = null;
        field4439 = null;
        field4442 = null;
        field4441 = null;
        if (!arg0) {
            field4429 = null;
        }
        field4440 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (this.field4427 == null) {
            this.method1702(1, (byte) 113);
        }
        if (arg0) {
            method1701(false, 92, 102, false, 107, -110);
        }
        this.method1707((byte) 107);
        ++field4426;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V")
    private final void method1707(byte arg0) {
        ++field4436;
        int var2 = -31 / ((arg0 - 52) / 36);
        int var3 = this.field4427.length;
        if (~var3 < -1) {
            for (int var4 = 0; ~var4 > -258; ++var4) {
                int var5 = 0;
                int var6 = var4 << 4;
                for (int var7 = 0; ~var7 > ~var3 && var6 >= this.field4427[var7][0]; ++var7) {
                    ++var5;
                }
                int var9;
                int var10;
                int var11;
                if (var3 > var5) {
                    int[] var8 = this.field4427[var5];
                    if (~var5 >= -1) {
                        var9 = var8[1];
                        var10 = var8[2];
                        var11 = var8[3];
                    } else {
                        int[] var12 = this.field4427[var5 + -1];
                        int var13 = (var6 - var12[0] << 12) / (var8[0] - var12[0]);
                        int var14 = -var13 + 4096;
                        var11 = var8[3] * var13 + var12[3] * var14 >> 12;
                        var9 = var8[1] * var13 + var12[1] * var14 >> 12;
                        var10 = var8[2] * var13 + var12[2] * var14 >> 12;
                    }
                } else {
                    int[] var15 = this.field4427[var3 + -1];
                    var11 = var15[3];
                    var9 = var15[1];
                    var10 = var15[2];
                }
                int var16 = var9 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (var16 > 255) {
                    var16 = 255;
                }
                int var17 = var10 >> 4;
                if (~var17 > -1) {
                    var17 = 0;
                } else if (var17 > 255) {
                    var17 = 255;
                }
                int var18 = var11 >> 4;
                if (var18 >= 0) {
                    if (var18 > 255) {
                        var18 = 255;
                    }
                } else {
                    var18 = 0;
                }
                this.field4431[var4] = class144.method992(class144.method992(var17 << 8, var16 << 16), var18);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)V")
    public static final void method1708(int arg0) {
        ++field4424;
        if (class232.field4089 != null) {
            class219 var1 = class232.field4089;
            synchronized (class232.field4089) {
                class232.field4089 = null;
            }
        }
        if (arg0 != -16356) {
            field4429 = null;
        }
    }
}
