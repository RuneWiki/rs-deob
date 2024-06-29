import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class57 {

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field832 = -1;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public int field836 = -1;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public int field835 = -1;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
    public boolean field826 = false;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field843 = 99;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public int field830 = -1;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Z")
    public boolean field829 = false;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Z")
    public boolean field841 = false;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public int field847 = -1;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "Z")
    public boolean field823 = false;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field833 = 5;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public int field839 = 2;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public int field827;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "[I")
    public int[] field828;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "[I")
    private int[] field844;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "[I")
    public int[] field850;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "[Z")
    public boolean[] field825;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[[I")
    public int[][] field848;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method365(int arg0, int arg1) {
        field842++;
        if (arg0 < 999999999) {
            return Integer.toString(arg0);
        } else {
            if (arg1 <= 9) {
                method371(68);
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILim;I)V")
    private final void method366(int arg0, class170 arg1, int arg2) {
        field824++;
        int var4 = -48 / ((23 - arg0) / 61);
        if (arg2 == 1) {
            int var14 = arg1.method1186((byte) -108);
            this.field828 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field828[var15] = arg1.method1186((byte) -100);
            }
            this.field850 = new int[var14];
            for (int var16 = 0; var16 < var14; var16++) {
                this.field850[var16] = arg1.method1186((byte) -60);
            }
            for (int var17 = 0; var17 < var14; var17++) {
                this.field850[var17] = (arg1.method1186((byte) -90) << 16) + this.field850[var17];
            }
        } else if (arg2 == 2) {
            this.field830 = arg1.method1186((byte) -58);
        } else if (arg2 == 3) {
            this.field825 = new boolean[256];
            int var12 = arg1.method1218(119);
            for (int var13 = 0; var13 < var12; var13++) {
                this.field825[arg1.method1218(-30)] = true;
            }
        } else if (arg2 == 4) {
            this.field841 = true;
        } else if (arg2 == 5) {
            this.field833 = arg1.method1218(-74);
        } else if (arg2 == 6) {
            this.field847 = arg1.method1186((byte) -48);
        } else if (arg2 == 7) {
            this.field836 = arg1.method1186((byte) -63);
        } else if (arg2 == 8) {
            this.field843 = arg1.method1218(-68);
        } else if (arg2 == 9) {
            this.field832 = arg1.method1218(-100);
        } else if (arg2 == 10) {
            this.field835 = arg1.method1218(126);
        } else if (arg2 == 11) {
            this.field839 = arg1.method1218(68);
        } else if (arg2 == 12) {
            int var5 = arg1.method1218(-108);
            this.field844 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field844[var6] = arg1.method1186((byte) -100);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                this.field844[var7] = (arg1.method1186((byte) -63) << 16) + this.field844[var7];
            }
        } else if (arg2 == 13) {
            int var8 = arg1.method1186((byte) -126);
            this.field848 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg1.method1218(71);
                if (var10 > 0) {
                    this.field848[var9] = new int[var10];
                    this.field848[var9][0] = arg1.method1212(460736848);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field848[var9][var11] = arg1.method1186((byte) -43);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field829 = true;
        } else if (arg2 == 15) {
            this.field826 = true;
        } else if (arg2 == 16) {
            this.field823 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIILli;)Lli;")
    public final class208 method367(int arg0, int arg1, int arg2, int arg3, class208 arg4) {
        field849++;
        int var6 = this.field828[arg2];
        int var7 = -91 / ((arg3 - 12) / 40);
        int var8 = this.field850[arg2];
        class24 var9 = class22.method120((byte) -51, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method345(true, true, true);
        }
        class24 var11 = null;
        if ((this.field826 || class229.field3538) && arg0 != -1 && this.field850.length > arg0) {
            int var12 = this.field850[arg0];
            var11 = class22.method120((byte) -51, var12 >> 16);
            arg0 = var12 & 0xFFFF;
        }
        class208 var13;
        if (var11 == null) {
            var13 = arg4.method345(!var9.method128(0, var10), !var9.method130(1988062305, var10), !this.field829);
        } else {
            var13 = arg4.method345(!var9.method128(0, var10) & !var11.method128(0, arg0), !var9.method130(1988062305, var10) & !var11.method130(1988062305, arg0), !this.field829);
        }
        var13.method1443(var9, var10, var11, arg0, arg1 - 1, var6, this.field829);
        return var13;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public final void method368(int arg0) {
        field840++;
        int var2 = 86 % ((arg0 + 30) / 40);
        if (this.field835 == -1) {
            if (this.field825 == null) {
                this.field835 = 0;
            } else {
                this.field835 = 2;
            }
        }
        if (this.field832 != -1) {
            return;
        }
        if (this.field825 == null) {
            this.field832 = 0;
        } else {
            this.field832 = 2;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILim;)V")
    public final void method369(int arg0, class170 arg1) {
        while (true) {
            int var3 = arg1.method1218(arg0 ^ 0xFFFF8E6E);
            if (var3 == 0) {
                field846++;
                if (arg0 != -29146) {
                    this.field827 = -89;
                    return;
                }
                return;
            }
            this.method366(-86, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILli;II)Lli;")
    public final class208 method370(int arg0, int arg1, class208 arg2, int arg3, int arg4) {
        int var6 = this.field828[arg1];
        field834++;
        int var7 = this.field850[arg1];
        class24 var8 = class22.method120((byte) -51, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg2.method330(true, true, true);
        }
        class24 var10 = null;
        int var11 = arg0;
        int var12 = 0;
        class24 var13 = null;
        class24 var14 = null;
        if ((this.field826 || class229.field3538) && arg4 != -1 && arg4 < this.field850.length) {
            int var15 = this.field850[arg4];
            var14 = class22.method120((byte) -51, var15 >> 16);
            arg4 = var15 & 0xFFFF;
        }
        if (this.field844 != null) {
            if (this.field844.length > arg1) {
                var11 = this.field844[arg1];
                if (var11 != 65535) {
                    var13 = class22.method120((byte) -51, var11 >> 16);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field826 || class229.field3538) && arg4 != -1 && this.field844.length > arg4) {
                var12 = this.field844[arg4];
                if (var12 != 65535) {
                    var10 = class22.method120((byte) -51, var12 >> 16);
                    var12 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method128(0, var9);
        boolean var17 = !var8.method130(1988062305, var9);
        if (var13 != null) {
            var16 &= !var13.method128(0, var11);
            var17 &= !var13.method130(1988062305, var11);
        }
        if (var14 != null) {
            var16 &= !var14.method128(arg0, arg4);
            var17 &= !var14.method130(1988062305, arg4);
        }
        if (var10 != null) {
            var16 &= !var10.method128(0, var12);
            var17 &= !var10.method130(1988062305, var12);
        }
        class208 var18 = arg2.method330(var16, var17, !this.field829);
        var18.method1443(var8, var9, var14, arg4, arg3 - 1, var6, this.field829);
        if (var13 != null) {
            var18.method1443(var13, var11, var10, var12, arg3 - 1, var6, this.field829);
        }
        return var18;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static final void method371(int arg0) {
        field838++;
        if (class45.field536 == arg0 || class45.field536 == 5) {
            return;
        }
        try {
            if (++class42.field508 > 2000) {
                if (class270.field4405 != null) {
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                }
                if (class179.field2801 >= 1) {
                    class45.field536 = 0;
                    class195.field3080 = -5;
                    return;
                }
                class42.field508 = 0;
                class45.field536 = 1;
                class179.field2801++;
                if (class277.field4546 == class231.field3697) {
                    class231.field3697 = class47.field598;
                } else {
                    class231.field3697 = class277.field4546;
                }
            }
            if (class45.field536 == 1) {
                class110.field1594 = class95.field1425.method1685(101, class231.field3697, class142.field2109);
                class45.field536 = 2;
            }
            if (class45.field536 == 2) {
                if (class110.field1594.field2399 == 2) {
                    throw new IOException();
                }
                if (class110.field1594.field2399 != 1) {
                    return;
                }
                class270.field4405 = new class83((Socket) class110.field1594.field2401, class95.field1425);
                class110.field1594 = null;
                long var1 = class46.field564 = class176.method1256((byte) 127, class226.field3515);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class150.field2218.field2676 = 0;
                class150.field2218.method1183(14, 984049208);
                class150.field2218.method1183(var3, arg0 ^ 0x3AA76638);
                class270.field4405.method562(2, class150.field2218.field2650, 0, 112);
                if (class1.field27 != null) {
                    class1.field27.method1536(arg0 ^ 0x8000);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                int var4 = class270.field4405.method571(true);
                if (class1.field27 != null) {
                    class1.field27.method1536(32768);
                }
                if (class195.field3078 != null) {
                    class195.field3078.method1536(32768);
                }
                if (var4 != 0) {
                    class45.field536 = 0;
                    class195.field3080 = var4;
                    class270.field4405.method567(arg0);
                    class270.field4405 = null;
                    return;
                }
                class45.field536 = 3;
            }
            if (class45.field536 == 3) {
                if (class270.field4405.method558(-23644) < 8) {
                    return;
                }
                class270.field4405.method566(8, class175.field2763.field2650, false, 0);
                int[] var5 = new int[4];
                class175.field2763.field2676 = 0;
                class21.field278 = class175.field2763.method1181(arg0 ^ 0x69C9);
                var5[2] = (int) (class21.field278 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class150.field2218.field2676 = 0;
                var5[3] = (int) class21.field278;
                class150.field2218.method1183(10, 984049208);
                class150.field2218.method1210(var5[0], (byte) -16);
                class150.field2218.method1210(var5[1], (byte) -16);
                class150.field2218.method1210(var5[2], (byte) -16);
                class150.field2218.method1210(var5[3], (byte) -16);
                class150.field2218.method1160(-25643, class176.method1256((byte) 127, class226.field3515));
                class150.field2218.method1168((byte) -37, class55.field805);
                class150.field2218.method1204(26, class228.field3529, class175.field2762);
                class16.field220.field2676 = 0;
                if (class40.field480 == 40) {
                    class16.field220.method1183(18, 984049208);
                } else {
                    class16.field220.method1183(16, arg0 + 984049208);
                }
                class16.field220.method1180(arg0 - 17437, 163 - (-class150.field2218.field2676 + -class313.method2098(class140.field2003, (byte) 16)));
                class16.field220.method1210(548, (byte) -16);
                class16.field220.method1183(class18.field243, 984049208);
                class16.field220.method1183(class197.field3121 ? 1 : 0, 984049208);
                class16.field220.method1183(0, 984049208);
                class16.field220.method1183(class49.method298((byte) 93), 984049208);
                class16.field220.method1180(arg0 ^ 0xFFFFBBE3, class112.field1626);
                class16.field220.method1180(-17437, class126.field1814);
                class16.field220.method1183(class96.field1451, 984049208);
                class153.method1058(false, class16.field220);
                class16.field220.method1168((byte) -37, class140.field2003);
                class16.field220.method1210(class158.field2371, (byte) -16);
                class16.field220.method1210(class181.method1290(arg0 + 62288211), (byte) -16);
                class52.field741 = true;
                class16.field220.method1180(-17437, class233.field3770);
                class16.field220.method1210(class297.field4740.method483((byte) -55), (byte) -16);
                class16.field220.method1210(class17.field235.method483((byte) -119), (byte) -16);
                class16.field220.method1210(class223.field3494.method483((byte) -94), (byte) -16);
                class16.field220.method1210(class43.field525.method483((byte) -118), (byte) -16);
                class16.field220.method1210(class49.field619.method483((byte) -80), (byte) -16);
                class16.field220.method1210(class135.field1951.method483((byte) -118), (byte) -16);
                class16.field220.method1210(class77.field1177.method483((byte) -89), (byte) -16);
                class16.field220.method1210(class212.field3298.method483((byte) -114), (byte) -16);
                class16.field220.method1210(class295.field4726.method483((byte) -117), (byte) -16);
                class16.field220.method1210(class286.field4629.method483((byte) -124), (byte) -16);
                class16.field220.method1210(class42.field515.method483((byte) -75), (byte) -16);
                class16.field220.method1210(class245.field3998.method483((byte) -120), (byte) -16);
                class16.field220.method1210(class186.field2927.method483((byte) -109), (byte) -16);
                class16.field220.method1210(class281.field4582.method483((byte) -124), (byte) -16);
                class16.field220.method1210(class135.field1954.method483((byte) -62), (byte) -16);
                class16.field220.method1210(class233.field3762.method483((byte) -107), (byte) -16);
                class16.field220.method1210(class72.field1071.method483((byte) -58), (byte) -16);
                class16.field220.method1210(class197.field3113.method483((byte) -99), (byte) -16);
                class16.field220.method1210(class62.field903.method483((byte) -100), (byte) -16);
                class16.field220.method1210(class105.field1533.method483((byte) -119), (byte) -16);
                class16.field220.method1210(class273.field4437.method483((byte) -60), (byte) -16);
                class16.field220.method1210(class10.field164.method483((byte) -88), (byte) -16);
                class16.field220.method1210(class81.field1229.method483((byte) -103), (byte) -16);
                class16.field220.method1210(class169.field2602.method483((byte) -90), (byte) -16);
                class16.field220.method1210(class4.field65.method483((byte) -55), (byte) -16);
                class16.field220.method1210(class56.field809.method483((byte) -126), (byte) -16);
                class16.field220.method1210(class222.field3477.method483((byte) -88), (byte) -16);
                class16.field220.method1210(class79.field1201.method483((byte) -75), (byte) -16);
                class16.field220.method1210(class175.field2757.method483((byte) -82), (byte) -16);
                class16.field220.method1174(class150.field2218.field2676, 897, 0, class150.field2218.field2650);
                class270.field4405.method562(class16.field220.field2676, class16.field220.field2650, 0, -67);
                class150.field2218.method441(8, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class175.field2763.method441(8, var5);
                class45.field536 = 4;
            }
            if (class45.field536 == 4) {
                if (class270.field4405.method558(arg0 - 23644) < 1) {
                    return;
                }
                int var7 = class270.field4405.method571(true);
                if (var7 == 21) {
                    class45.field536 = 7;
                } else if (var7 == 29) {
                    class45.field536 = 10;
                } else if (var7 == 1) {
                    class45.field536 = 5;
                    class195.field3080 = var7;
                    return;
                } else if (var7 == 2) {
                    class45.field536 = 8;
                } else if (var7 == 15) {
                    class195.field3080 = var7;
                    class45.field536 = 0;
                    return;
                } else if (var7 == 23 && class179.field2801 < 1) {
                    class42.field508 = 0;
                    class45.field536 = 1;
                    class179.field2801++;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                    return;
                } else {
                    class45.field536 = 0;
                    class195.field3080 = var7;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                    return;
                }
            }
            if (class45.field536 == 6) {
                class150.field2218.field2676 = 0;
                class150.field2218.method445(17, 7);
                class270.field4405.method562(class150.field2218.field2676, class150.field2218.field2650, 0, 84);
                class45.field536 = 4;
            } else if (class45.field536 == 7) {
                if (class270.field4405.method558(-23644) >= 1) {
                    class184.field2890 = class270.field4405.method571(true) * 60 + 180;
                    class195.field3080 = 21;
                    class45.field536 = 0;
                    class270.field4405.method567(0);
                    class270.field4405 = null;
                }
            } else if (class45.field536 != 10) {
                if (class45.field536 == 8) {
                    if (class270.field4405.method558(-23644) < 14) {
                        return;
                    }
                    class270.field4405.method566(14, class175.field2763.field2650, false, 0);
                    class175.field2763.field2676 = 0;
                    class72.field1072 = class175.field2763.method1218(arg0 - 44);
                    class20.field269 = class175.field2763.method1218(-97);
                    class235.field3799 = class175.field2763.method1218(94) == 1;
                    class83.field1280 = class175.field2763.method1218(81) == 1;
                    class45.field542 = class175.field2763.method1218(-118) == 1;
                    class211.field3283 = class175.field2763.method1218(arg0 ^ 0xFFFFFFCD) == 1;
                    class245.field3997 = class175.field2763.method1218(-66) == 1;
                    class22.field289 = class175.field2763.method1186((byte) -99);
                    class310.field4986 = class175.field2763.method1218(-98) == 1;
                    class147.field2191 = class175.field2763.method1218(106) == 1;
                    class237.method1658((byte) -124, class147.field2191);
                    class264.method1848(arg0 - 39, class147.field2191);
                    class163.method1123(15085, class147.field2191);
                    if (!class197.field3121) {
                        if ((!class235.field3799 || class45.field542) && !class310.field4986) {
                            try {
                                class25.method132(class95.field1425.field3832, "unzap", (byte) 82);
                            } catch (Throwable var9) {
                            }
                        } else {
                            try {
                                class25.method132(class95.field1425.field3832, "zap", (byte) 92);
                            } catch (Throwable var10) {
                            }
                        }
                    }
                    try {
                        class25.method132(class95.field1425.field3832, "loggedin", (byte) 121);
                    } catch (Throwable var8) {
                    }
                    class105.field1530 = class175.field2763.method444((byte) 48);
                    class262.field4252 = class175.field2763.method1186((byte) -100);
                    class45.field536 = 9;
                }
                if (class45.field536 == 9 && class270.field4405.method558(-23644) >= class262.field4252) {
                    class175.field2763.field2676 = 0;
                    class270.field4405.method566(class262.field4252, class175.field2763.field2650, false, 0);
                    class195.field3080 = 2;
                    class45.field536 = 0;
                    class297.method1998(91);
                    class97.field1464 = -1;
                    class266.method1859(false, (byte) 64);
                    class105.field1530 = -1;
                }
            } else if (class270.field4405.method558(-23644) >= 1) {
                class136.field1964 = class270.field4405.method571(true);
                class195.field3080 = 29;
                class45.field536 = 0;
                class270.field4405.method567(0);
                class270.field4405 = null;
            }
        } catch (IOException var11) {
            if (class270.field4405 != null) {
                class270.field4405.method567(arg0);
                class270.field4405 = null;
            }
            if (class179.field2801 >= 1) {
                class45.field536 = 0;
                class195.field3080 = -4;
            } else {
                class42.field508 = 0;
                if (class277.field4546 == class231.field3697) {
                    class231.field3697 = class47.field598;
                } else {
                    class231.field3697 = class277.field4546;
                }
                class179.field2801++;
                class45.field536 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V")
    public static final void method372(boolean arg0) {
        boolean var1 = true;
        class266.method1854(-116, false);
        field845++;
        class55.field806 = 0;
        for (int var2 = 0; var2 < class129.field1840.length; var2++) {
            if (class73.field1085[var2] != -1 && class129.field1840[var2] == null) {
                class129.field1840[var2] = class135.field1951.method501(-2, 0, class73.field1085[var2]);
                if (class129.field1840[var2] == null) {
                    class55.field806++;
                    var1 = false;
                }
            }
            if (class127.field1823[var2] != -1 && class199.field3148[var2] == null) {
                class199.field3148[var2] = class135.field1951.method511((byte) -87, class140.field2014[var2], class127.field1823[var2], 0);
                if (class199.field3148[var2] == null) {
                    class55.field806++;
                    var1 = false;
                }
            }
            if (class254.field4153 != null && class44.field527[var2] == null && class254.field4153[var2] != -1) {
                class44.field527[var2] = class135.field1951.method511((byte) -106, class140.field2014[var2], class254.field4153[var2], 0);
                if (class44.field527[var2] == null) {
                    class55.field806++;
                    var1 = false;
                }
            }
        }
        if (class79.field1202 == null) {
            if (class290.field4671 == null || !class169.field2602.method488((byte) 116, class290.field4671.field614 + "_labels")) {
                class79.field1202 = new class118(0);
            } else if (class169.field2602.method506(0, class290.field4671.field614 + "_labels")) {
                class79.field1202 = class50.method308((byte) -87, class147.field2191, class290.field4671.field614 + "_labels", class169.field2602);
            } else {
                var1 = false;
                class55.field806++;
            }
        }
        if (!var1) {
            class96.field1454 = 1;
            return;
        }
        class272.field4430 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class129.field1840.length; var4++) {
            byte[] var20 = class199.field3148[var4];
            if (var20 != null) {
                int var21 = (class250.field4072[var4] >> 8) * 64 - class113.field1653;
                int var22 = (class250.field4072[var4] & 0xFF) * 64 - class5.field77;
                if (class161.field2415) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class74.method518(var22, true, var21, var20);
            }
        }
        if (!var3) {
            class96.field1454 = 2;
            return;
        }
        if (class96.field1454 != 0) {
            class49.method304(class33.field397 + "<br>(100%)", true, 4);
        }
        class31.method163(-11565);
        boolean var5 = false;
        class172.method1232((byte) -63);
        class69.method455(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class312.field4997[var6].method667((byte) -88);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class74.field1121[var7][var18][var19] = 0;
                }
            }
        }
        class251.method1791(27749, false);
        class31.method163(-11565);
        System.gc();
        class266.method1854(-107, true);
        class273.method1901(false, (byte) -119);
        if (!class161.field2415) {
            class147.method1002(false, (byte) 122);
            class266.method1854(-88, true);
            class180.method1280(false, 15622);
            if (class44.field527 != null) {
                class180.method1276((byte) 14);
            }
        }
        if (class161.field2415) {
            class170.method1187(arg0, false);
            class266.method1854(-77, true);
            class5.method31(0, false);
        }
        class172.method1232((byte) 93);
        class266.method1854(-127, arg0);
        class294.method1988(false, class312.field4997, (byte) -17, class161.field2415 ? class276.field4478 : null);
        class266.method1854(-83, true);
        int var8 = class211.field3289;
        if (class148.field2204 < var8) {
            var8 = class148.field2204;
        }
        if (var8 < (class148.field2204 - 1)) {
            int var9 = class148.field2204 - 1;
        }
        if (class60.method384(-4)) {
            class115.method763(0);
        } else {
            class115.method763(class211.field3289);
        }
        class254.method1804(0);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class273.method1900((byte) -97, var17, var10);
            }
        }
        class276.method1910((byte) 58);
        class31.method163(-11565);
        class273.method1898(88);
        class172.method1232((byte) -50);
        if (class73.field1086 != null && class270.field4405 != null && class40.field480 == 25) {
            class217.field3389++;
            class150.field2218.method445(240, 7);
            class150.field2218.method1210(1057001181, (byte) -16);
        }
        if (!class161.field2415) {
            int var11 = (class97.field1464 - 6) / 8;
            int var12 = (class22.field288 + 6) / 8;
            int var13 = (class22.field288 - 6) / 8;
            int var14 = (class97.field1464 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var14 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var12 + 1); var16++) {
                    if (var11 > var15 || var15 > var14 || var16 < var13 || var12 < var16) {
                        class135.field1951.method493("m" + var15 + "_" + var16, (byte) 60);
                        class135.field1951.method493("l" + var15 + "_" + var16, (byte) 60);
                    }
                }
            }
        }
        if (class40.field480 == 28) {
            class95.method651(10, (byte) 7);
        } else {
            class95.method651(30, (byte) 68);
            if (class270.field4405 != null) {
                class150.field2218.method445(103, 7);
            }
        }
        class294.method1989(-1);
        class31.method163(-11565);
        class114.method753(true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIILli;I)Lli;")
    public final class208 method373(int arg0, byte arg1, int arg2, int arg3, class208 arg4, int arg5) {
        if (arg1 <= 8) {
            return null;
        }
        int var7 = this.field828[arg0];
        int var8 = this.field850[arg0];
        field837++;
        class24 var9 = class22.method120((byte) -51, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method334(true, true, true);
        }
        int var11 = arg2 & 0x3;
        class24 var12 = null;
        if ((this.field826 || class229.field3538) && arg3 != -1 && this.field850.length > arg3) {
            int var13 = this.field850[arg3];
            var12 = class22.method120((byte) -51, var13 >> 16);
            arg3 = var13 & 0xFFFF;
        }
        class208 var14;
        if (var12 == null) {
            var14 = arg4.method334(!var9.method128(0, var10), !var9.method130(1988062305, var10), !this.field829);
        } else {
            var14 = arg4.method334(!var9.method128(0, var10) & !var12.method128(0, arg3), !var9.method130(1988062305, var10) & !var12.method130(1988062305, arg3), !this.field829);
        }
        if (var11 == 1) {
            var14.method311();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method316();
        }
        var14.method1443(var9, var10, var12, arg3, arg5 - 1, var7, this.field829);
        if (var11 == 1) {
            var14.method316();
        } else if (var11 == 2) {
            var14.method341();
        } else if (var11 == 3) {
            var14.method311();
        }
        return var14;
    }
}
