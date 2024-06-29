import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class266 {

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "[F")
    public float[] field4082 = new float[4];

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "Z")
    public boolean field4086 = false;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "Z")
    public boolean field4083;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "Z")
    public boolean field4073;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "I")
    public int field4088;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public int field4074;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "[S")
    public short[] field4093;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
    public int field4069;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    private int field4091;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "[I")
    public static int[] field4077 = new int[5];

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "F")
    public float field4079;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "F")
    public float field4080;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    private int field4067;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    private int field4068;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    private int field4095;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    private int field4096;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lvg;")
    public class24 field4085;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "[S")
    public static short[] field4089;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZI)V", line = 10)
    public final void method1865(int arg0, boolean arg1, int arg2) {
        field4078++;
        int var4 = this.field4067 * arg0 / 50 + this.field4091 & 0x7FF;
        int var5 = this.field4095;
        int var6;
        if (var5 == 1) {
            var6 = (class148.field2239[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class258.field3920[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1) {
            var6 = 2048;
        }
        if (arg2 != -27366) {
            method1870((byte) 12, (class98) null);
        }
        this.field4079 = (float) (this.field4096 + (this.field4068 * var6 >> 11)) / 2048.0F;
        float var7 = this.field4079 / 255.0F;
        this.field4082[1] = (float) class124.method893(this.field4069 >> 8, 255) * var7;
        this.field4082[2] = (float) class124.method893(this.field4069, 255) * var7;
        this.field4082[0] = (float) (class124.method893(16721041, this.field4069) >> 16) * var7;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V", line = 89)
    public static final void method1866(int arg0) {
        field4070++;
        if (class123.field1926 != -1) {
            class302.method2094(-88, class123.field1926);
        }
        for (int var1 = 0; var1 < class325.field4898; var1++) {
            if (class22.field298[var1]) {
                class131.field2021[var1] = true;
            }
            class51.field641[var1] = class22.field298[var1];
            class22.field298[var1] = false;
        }
        class201.field2999 = -1;
        class140.field2113 = class304.field4641;
        class78.field1084 = null;
        class217.field3293 = arg0;
        if (class117.field1817) {
            class326.field4911 = true;
        }
        if (class123.field1926 != -1) {
            class325.field4898 = 0;
            class323.method2209(true);
        }
        if (class117.field1817) {
            class308.method2133();
        } else {
            class46.method300();
        }
        class288.field4352 = 0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 135)
    public final void method1867(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4068 = arg4;
        field4072++;
        this.field4096 = arg0;
        this.field4067 = arg3;
        if (arg1 == 1002) {
            this.field4095 = arg2;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII[Lf;IIIBI)V", line = 153)
    public static final void method1868(int arg0, int arg1, int arg2, int arg3, class329[] arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field4087++;
        if (class117.field1817) {
            class308.method2123(arg2, arg7, arg1, arg0);
        } else {
            class46.method301(arg2, arg7, arg1, arg0);
            class148.method1070();
        }
        for (int var10 = 0; var10 < arg4.length; var10++) {
            class329 var11 = arg4[var10];
            if (var11 != null && (var11.field5091 == arg6 || arg6 == -1412584499 && class145.field2197 == var11)) {
                int var12;
                if (arg9 == -1) {
                    class228.field3473[class325.field4898] = var11.field4929 + arg5;
                    class15.field168[class325.field4898] = var11.field4962 + arg3;
                    class6.field29[class325.field4898] = var11.field5018;
                    class307.field4678[class325.field4898] = var11.field4994;
                    var12 = class325.field4898++;
                } else {
                    var12 = arg9;
                }
                var11.field5014 = class304.field4641;
                var11.field4945 = var12;
                if (!var11.field5022 || !client.method903(var11)) {
                    if (var11.field5032 > 0) {
                        class163.method1157(var11, 24394);
                    }
                    int var13 = var11.field4929 + arg5;
                    int var14 = var11.field4962 + arg3;
                    int var15 = var11.field4956;
                    if (class250.field3733 && (client.method902(var11).field242 != 0 || var11.field5066 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class145.field2197 == var11) {
                        if (arg6 != -1412584499 && !var11.field5001) {
                            class45.field576 = arg4;
                            class267.field4103 = arg5;
                            class270.field4144 = arg3;
                            continue;
                        }
                        if (class75.field973 && class185.field2762) {
                            int var16 = class132.field2036;
                            int var17 = var16 - class315.field4762;
                            if (var17 < class301.field4602) {
                                var17 = class301.field4602;
                            }
                            int var18 = class237.field3557;
                            int var19 = var18 - class283.field4282;
                            if (class140.field2116 > var19) {
                                var19 = class140.field2116;
                            }
                            if ((var11.field5018 + var17) > (class301.field4602 + class189.field2819.field5018)) {
                                var17 = class301.field4602 + class189.field2819.field5018 - var11.field5018;
                            }
                            var13 = var17;
                            if (var11.field4994 + var19 > class140.field2116 - -class189.field2819.field4994) {
                                var19 = class140.field2116 - (var11.field4994 - class189.field2819.field4994);
                            }
                            var14 = var19;
                        }
                        if (!var11.field5001) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field5066 == 2) {
                        var25 = arg1;
                        var21 = arg2;
                        var20 = arg7;
                        var24 = arg0;
                    } else {
                        var20 = var14 > arg7 ? var14 : arg7;
                        var21 = var13 > arg2 ? var13 : arg2;
                        int var22 = var11.field4994 + var14;
                        int var23 = var13 + var11.field5018;
                        if (var11.field5066 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = arg0 <= var22 ? arg0 : var22;
                        var25 = var23 < arg1 ? var23 : arg1;
                    }
                    if (!var11.field5022 || var21 < var25 && var20 < var24) {
                        if (var11.field5032 != 0) {
                            if (var11.field5032 == 1337 || var11.field5032 == 1403 && class117.field1817) {
                                class201.field2999 = var13;
                                class217.field3293 = var14;
                                class164.field2480 = var11;
                                class56.method373(var14, var13, var11.field4994, (byte) -126, var11.field5018, var11.field5032 == 1403);
                                if (class117.field1817) {
                                    class308.method2123(arg2, arg7, arg1, arg0);
                                } else {
                                    class46.method301(arg2, arg7, arg1, arg0);
                                }
                                continue;
                            }
                            if (var11.field5032 == 1338) {
                                if (!var11.method2243(arg8 ^ 0xFFFFFF7F)) {
                                    continue;
                                }
                                class245.method1656(var11, var13, var12, (byte) -123, var14);
                                if (class117.field1817) {
                                    class308.method2123(arg2, arg7, arg1, arg0);
                                } else {
                                    class46.method301(arg2, arg7, arg1, arg0);
                                }
                                if (class166.field2498 != 0 && class166.field2498 != 3 || class5.field27 || class317.field4783 < var21 || var20 > class121.field1897 || class317.field4783 >= var25 || var24 <= class121.field1897) {
                                    continue;
                                }
                                int var41 = class317.field4783 - var13;
                                int var42 = class121.field1897 - var14;
                                int var43 = var11.field4940[var42];
                                if (var43 > var41 || var41 > (var11.field5012[var42] + var43)) {
                                    continue;
                                }
                                int var44 = var41 - var11.field5018 / 2;
                                int var45 = class284.field4297 + class160.field2401 & 0x7FF;
                                int var46 = var42 - var11.field4994 / 2;
                                int var47 = class148.field2239[var45];
                                int var48 = (class178.field2641 + 256) * var47 >> 8;
                                int var49 = class148.field2229[var45];
                                int var50 = (class178.field2641 + 256) * var49 >> 8;
                                int var51 = var46 * var50 - (var44 * var48) >> 11;
                                int var52 = var44 * var50 + var46 * var48 >> 11;
                                int var53 = class114.field1750.field1505 - var51 >> 7;
                                int var54 = class114.field1750.field1566 + var52 >> 7;
                                if (class122.field1907 && (class274.field4201 & 0x40) != 0) {
                                    class329 var55 = class10.method48(class198.field2977, class115.field1762, (byte) 102);
                                    if (var55 == null) {
                                        class279.method1949(false);
                                    } else {
                                        class296.method2062(var54, (short) 46, 1L, var53, 100, " ->", class69.field916, class149.field2247);
                                    }
                                    continue;
                                }
                                if (class237.field3555 == 1) {
                                    class296.method2062(var54, (short) 37, 1L, var53, 100, "", class211.field3216, -1);
                                }
                                class296.method2062(var54, (short) 43, 1L, var53, 100, "", class311.field4733, -1);
                                continue;
                            }
                            if (var11.field5032 == 1339) {
                                if (var11.method2243(150)) {
                                    class166.method1163((byte) 84, var14, var12, var13, var11);
                                    if (class117.field1817) {
                                        class308.method2123(arg2, arg7, arg1, arg0);
                                    } else {
                                        class46.method301(arg2, arg7, arg1, arg0);
                                    }
                                }
                                continue;
                            }
                            if (var11.field5032 == 1400) {
                                class251.method1694(var13, var14, var11.field4994, arg8 ^ 0xFFFFFF80, var11.field5018);
                                class22.field298[var12] = true;
                                class131.field2021[var12] = true;
                                if (class117.field1817) {
                                    class308.method2123(arg2, arg7, arg1, arg0);
                                } else {
                                    class46.method301(arg2, arg7, arg1, arg0);
                                }
                                continue;
                            }
                            if (var11.field5032 == 1401) {
                                class64.method424(var11.field4994, var11.field5018, var13, (byte) 126, var14);
                                class22.field298[var12] = true;
                                class131.field2021[var12] = true;
                                if (class117.field1817) {
                                    class308.method2123(arg2, arg7, arg1, arg0);
                                } else {
                                    class46.method301(arg2, arg7, arg1, arg0);
                                }
                                continue;
                            }
                            if (var11.field5032 == 1402) {
                                if (!class117.field1817) {
                                    class87.method605(var13, arg8 ^ 0xFFFFDC66, var14);
                                    class22.field298[var12] = true;
                                    class131.field2021[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field5032 == 1405) {
                                if (!class203.field3050) {
                                    continue;
                                }
                                int var26 = var11.field5018 + var13;
                                int var27 = var14 + 15;
                                class84.field1247.method617("Fps:" + class28.field378, var26, var27, 16776960, -1);
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                int var30 = 16776960;
                                int var141 = var27 + 15;
                                if (var29 > 65536) {
                                    var30 = 16711680;
                                }
                                class84.field1247.method617("Mem:" + var29 + "k", var26, var141, var30, -1);
                                var27 = var141 + 15;
                                if (class117.field1817) {
                                    int var31 = 16776960;
                                    int var32 = (class174.field2593 + class174.field2590 + class174.field2592) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class84.field1247.method617("Card:" + var32 + "k", var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class76.field982[var37].method1749((byte) -120);
                                    var35 += class76.field982[var37].method1751((byte) 91);
                                    var36 += class76.field982[var37].method1752((byte) 111);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                String var40 = "Cache:" + class80.method539(2, true, (long) var39, 97, 0) + "% (" + var38 + "%)";
                                class61.field817.method617(var40, var26, var27, var33, -1);
                                var27 += 12;
                                class22.field298[var12] = true;
                                class131.field2021[var12] = true;
                                continue;
                            }
                            if (var11.field5032 == 1406) {
                                class55.field694 = var13;
                                class318.field4793 = var11;
                                class21.field260 = var14;
                                continue;
                            }
                        }
                        if (!class5.field27) {
                            if (var11.field5066 == 0 && var11.field4951 && var21 <= class317.field4783 && class121.field1897 >= var20 && var25 > class317.field4783 && class121.field1897 < var24 && !class250.field3733) {
                                class190.field2829 = 1;
                                class307.field4677[0] = class121.field1898;
                                class155.field2322[0] = class156.field2330;
                                class180.field2686[0] = "";
                                class201.field2998[0] = 1002;
                            }
                            if (var21 <= class317.field4783 && var20 <= class121.field1897 && class317.field4783 < var25 && var24 > class121.field1897) {
                                class177.method1225(class121.field1897 - var14, 21544, var11, class317.field4783 - var13);
                            }
                        }
                        if (var11.field5066 == 0) {
                            if (!var11.field5022 && client.method903(var11) && class38.field469 != var11) {
                                continue;
                            }
                            if (!var11.field5022) {
                                if ((var11.field4932 - var11.field4994) < var11.field5023) {
                                    var11.field5023 = var11.field4932 - var11.field4994;
                                }
                                if (var11.field5023 < 0) {
                                    var11.field5023 = 0;
                                }
                            }
                            method1868(var24, var25, var21, var14 - var11.field5023, arg4, var13 - var11.field5093, var11.field5086, var20, (byte) -23, var12);
                            if (var11.field4964 != null) {
                                method1868(var24, var25, var21, var14 - var11.field5023, var11.field4964, var13 - var11.field5093, var11.field5086, var20, (byte) -23, var12);
                            }
                            class167 var56 = (class167) class295.field4522.method1320((long) var11.field5086, 13002);
                            if (var56 != null) {
                                if (var56.field2513 == 0 && !class5.field27 && var21 <= class317.field4783 && var20 <= class121.field1897 && var25 > class317.field4783 && class121.field1897 < var24 && !class250.field3733) {
                                    class307.field4677[0] = class121.field1898;
                                    class180.field2686[0] = "";
                                    class155.field2322[0] = class156.field2330;
                                    class190.field2829 = 1;
                                    class201.field2998[0] = 1002;
                                }
                                class72.method464(var21, var25, var24, var56.field2505, var12, var20, var14, var13, 9608);
                            }
                            if (class117.field1817) {
                                class308.method2123(arg2, arg7, arg1, arg0);
                            } else {
                                class46.method301(arg2, arg7, arg1, arg0);
                                class148.method1070();
                            }
                        }
                        if (class51.field641[var12] || class125.field1965 > 1) {
                            if (var11.field5066 == 0 && !var11.field5022 && var11.field4932 > var11.field4994) {
                                class38.method258(var11.field4932, 101, var11.field5023, var11.field5018 + var13, var14, var11.field4994);
                            }
                            if (var11.field5066 != 1) {
                                if (var11.field5066 == 2) {
                                    int var124 = 0;
                                    for (int var125 = 0; var125 < var11.field4946; var125++) {
                                        for (int var126 = 0; var126 < var11.field4971; var126++) {
                                            int var127 = (var11.field5082 + 32) * var126 + var13;
                                            int var128 = var14 + ((var11.field5083 + 32) * var125);
                                            if (var124 < 20) {
                                                var128 += var11.field5088[var124];
                                                var127 += var11.field4966[var124];
                                            }
                                            if (var11.field4995[var124] > 0) {
                                                boolean var130 = false;
                                                int var131 = var11.field4995[var124] - 1;
                                                boolean var132 = false;
                                                if ((var127 + 32) > arg2 && arg1 > var127 && arg7 < (var128 + 32) && arg0 > var128 || class191.field2852 == var11 && class304.field4634 == var124) {
                                                    class235 var133;
                                                    if (class76.field985 == 1 && class181.field2703 == var124 && class218.field3312 == var11.field5086) {
                                                        var133 = class154.method1100(var131, -111, 2, 0, var11.field5065, var11.field4999[var124]);
                                                    } else {
                                                        var133 = class154.method1100(var131, -118, 1, 3153952, var11.field5065, var11.field4999[var124]);
                                                    }
                                                    if (class148.field2230) {
                                                        class22.field298[var12] = true;
                                                    }
                                                    if (var133 == null) {
                                                        class247.method1666(var11, -125);
                                                    } else if (class191.field2852 == var11 && class304.field4634 == var124) {
                                                        int var134 = class237.field3557 - class69.field910;
                                                        if (var134 < 5 && var134 > -5) {
                                                            var134 = 0;
                                                        }
                                                        int var135 = class132.field2036 - class147.field2215;
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        if (class213.field3235 < 5) {
                                                            var135 = 0;
                                                            var134 = 0;
                                                        }
                                                        var133.method925(var127 + var135, var128 - -var134, 128);
                                                        if (arg6 != -1) {
                                                            class329 var136 = arg4[arg6 & 0xFFFF];
                                                            int var137;
                                                            int var138;
                                                            if (class117.field1817) {
                                                                var137 = class308.field4691;
                                                                var138 = class308.field4689;
                                                            } else {
                                                                var137 = class46.field583;
                                                                var138 = class46.field581;
                                                            }
                                                            if (var128 + var134 < var137 && var136.field5023 > 0) {
                                                                int var139 = (var137 - var128 - var134) * class288.field4352 / 3;
                                                                if (var139 > (class288.field4352 * 10)) {
                                                                    var139 = class288.field4352 * 10;
                                                                }
                                                                if (var136.field5023 < var139) {
                                                                    var139 = var136.field5023;
                                                                }
                                                                class69.field910 += var139;
                                                                var136.field5023 -= var139;
                                                                class247.method1666(var136, -128);
                                                            }
                                                            if (var138 < var128 - (-var134 - 32) && (var136.field4932 - var136.field4994) > var136.field5023) {
                                                                int var140 = (var134 + var128 + 32 - var138) * class288.field4352 / 3;
                                                                if (var140 > class288.field4352 * 10) {
                                                                    var140 = class288.field4352 * 10;
                                                                }
                                                                if (var136.field4932 - var136.field5023 - var136.field4994 < var140) {
                                                                    var140 = var136.field4932 - var136.field4994 - var136.field5023;
                                                                }
                                                                var136.field5023 += var140;
                                                                class69.field910 -= var140;
                                                                class247.method1666(var136, arg8 ^ 0x68);
                                                            }
                                                        }
                                                    } else if (class113.field1743 == var11 && class60.field797 == var124) {
                                                        var133.method925(var127, var128, 128);
                                                    } else {
                                                        var133.method935(var127, var128);
                                                    }
                                                }
                                            } else if (var11.field4984 != null && var124 < 20) {
                                                class235 var129 = var11.method2246(arg8 - 105, var124);
                                                if (var129 != null) {
                                                    var129.method935(var127, var128);
                                                } else if (class265.field4065) {
                                                    class247.method1666(var11, arg8 - 103);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                } else if (var11.field5066 == 3) {
                                    int var57;
                                    if (class298.method2078(true, var11)) {
                                        var57 = var11.field5047;
                                        if (class38.field469 == var11 && var11.field5064 != 0) {
                                            var57 = var11.field5064;
                                        }
                                    } else {
                                        var57 = var11.field4935;
                                        if (class38.field469 == var11 && var11.field5021 != 0) {
                                            var57 = var11.field5021;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field5009) {
                                            if (class117.field1817) {
                                                class308.method2126(var13, var14, var11.field5018, var11.field4994, var57);
                                            } else {
                                                class46.method312(var13, var14, var11.field5018, var11.field4994, var57);
                                            }
                                        } else if (class117.field1817) {
                                            class308.method2128(var13, var14, var11.field5018, var11.field4994, var57);
                                        } else {
                                            class46.method318(var13, var14, var11.field5018, var11.field4994, var57);
                                        }
                                    } else if (var11.field5009) {
                                        if (class117.field1817) {
                                            class308.method2125(var13, var14, var11.field5018, var11.field4994, var57, 256 - (var15 & 0xFF));
                                        } else {
                                            class46.method319(var13, var14, var11.field5018, var11.field4994, var57, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class117.field1817) {
                                        class308.method2122(var13, var14, var11.field5018, var11.field4994, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class46.method304(var13, var14, var11.field5018, var11.field4994, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field5066 == 4) {
                                    class89 var58 = var11.method2241((byte) 18, class73.field948);
                                    if (var58 != null) {
                                        String var59 = var11.field5035;
                                        int var60;
                                        if (class298.method2078(true, var11)) {
                                            var60 = var11.field5047;
                                            if (class38.field469 == var11 && var11.field5064 != 0) {
                                                var60 = var11.field5064;
                                            }
                                            if (var11.field5063.length() > 0) {
                                                var59 = var11.field5063;
                                            }
                                        } else {
                                            var60 = var11.field4935;
                                            if (class38.field469 == var11 && var11.field5021 != 0) {
                                                var60 = var11.field5021;
                                            }
                                        }
                                        if (var11.field5022 && var11.field5089 != -1) {
                                            class253 var61 = class325.method2219(var11.field5089, -9379);
                                            var59 = var61.field3837;
                                            if (var59 == null) {
                                                var59 = "null";
                                            }
                                            if ((var61.field3847 == 1 || var11.field5045 != 1) && var11.field5045 != -1) {
                                                var59 = "<col=ff9040>" + var59 + "</col> x" + class57.method376(var11.field5045, (byte) -65);
                                            }
                                        }
                                        if (class194.field2910 == var11) {
                                            var59 = class48.field603;
                                            var60 = var11.field4935;
                                        }
                                        if (!var11.field5022) {
                                            var59 = class177.method1222(var59, (byte) 20, var11);
                                        }
                                        var58.method614(var59, var13, var14, var11.field5018, var11.field4994, var60, var11.field5039 ? 0 : -1, var11.field4983, var11.field4952, var11.field5071);
                                    } else if (class265.field4065) {
                                        class247.method1666(var11, -126);
                                    }
                                } else if (var11.field5066 == 5) {
                                    if (var11.field5022) {
                                        class235 var62;
                                        if (var11.field5089 == -1) {
                                            var62 = var11.method2237(false, -99);
                                        } else {
                                            var62 = class154.method1100(var11.field5089, -104, var11.field5056, var11.field5043, var11.field5065, var11.field5045);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field3535;
                                            int var64 = var62.field3527;
                                            if (var11.field5095) {
                                                int var66 = (var11.field5018 + var63 - 1) / var63;
                                                int var67 = (var64 + var11.field4994 - 1) / var64;
                                                if (class117.field1817) {
                                                    class308.method2129(var13, var14, var11.field5018 + var13, var11.field4994 + var14);
                                                    boolean var70 = class120.method878(var62.field3533, 11770);
                                                    class303 var71 = (class303) var62;
                                                    boolean var72 = class120.method878(var62.field3537, 11770);
                                                    if (var70 && var72) {
                                                        if (var15 == 0) {
                                                            var71.method2102(var13, var14, var66, var67);
                                                        } else {
                                                            var71.method2101(var13, var14, 256 - (var15 & 0xFF), var66, var67);
                                                        }
                                                    } else if (var70) {
                                                        for (int var73 = 0; var73 < var67; var73++) {
                                                            if (var15 == 0) {
                                                                var71.method2102(var13, var64 * var73 + var14, var66, 1);
                                                            } else {
                                                                var71.method2101(var13, var14 + (var64 * var73), 256 - (var15 & 0xFF), var66, 1);
                                                            }
                                                        }
                                                    } else if (var72) {
                                                        for (int var76 = 0; var76 < var66; var76++) {
                                                            if (var15 == 0) {
                                                                var71.method2102(var63 * var76 + var13, var14, 1, var67);
                                                            } else {
                                                                var71.method2101(var63 * var76 + var13, var14, 256 - (var15 & 0xFF), 1, var67);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var74 = 0; var74 < var66; var74++) {
                                                            for (int var75 = 0; var75 < var67; var75++) {
                                                                if (var15 == 0) {
                                                                    var62.method935(var63 * var74 + var13, var64 * var75 + var14);
                                                                } else {
                                                                    var62.method925(var63 * var74 + var13, var14 - -(var64 * var75), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class308.method2123(arg2, arg7, arg1, arg0);
                                                } else {
                                                    class46.method303(var13, var14, var13 + var11.field5018, var11.field4994 + var14);
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        for (int var69 = 0; var69 < var67; var69++) {
                                                            if (var11.field5015 != 0) {
                                                                var62.method1611(var14 - (-(var64 * var69) - var64 / 2), 4096, var63 * var68 + var63 / 2 + var13, (byte) -94, var11.field5015);
                                                            } else if (var15 == 0) {
                                                                var62.method935(var63 * var68 + var13, var64 * var69 + var14);
                                                            } else {
                                                                var62.method925(var63 * var68 + var13, var64 * var69 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class46.method301(arg2, arg7, arg1, arg0);
                                                }
                                            } else {
                                                int var65 = var11.field5018 * 4096 / var63;
                                                if (var11.field5015 != 0) {
                                                    var62.method1611(var11.field4994 / 2 + var14, var65, var11.field5018 / 2 + var13, (byte) -22, var11.field5015);
                                                } else if (var15 != 0) {
                                                    var62.method946(var13, var14, var11.field5018, var11.field4994, 256 - (var15 & 0xFF));
                                                } else if (var11.field5018 == var63 && var11.field4994 == var64) {
                                                    var62.method935(var13, var14);
                                                } else {
                                                    var62.method949(var13, var14, var11.field5018, var11.field4994);
                                                }
                                            }
                                        } else if (class265.field4065) {
                                            class247.method1666(var11, -124);
                                        }
                                    } else {
                                        class235 var77 = var11.method2237(class298.method2078(true, var11), 105);
                                        if (var77 != null) {
                                            var77.method935(var13, var14);
                                        } else if (class265.field4065) {
                                            class247.method1666(var11, -127);
                                        }
                                    }
                                } else if (var11.field5066 == 6) {
                                    boolean var78 = class298.method2078(true, var11);
                                    int var79;
                                    if (var78) {
                                        var79 = var11.field5033;
                                    } else {
                                        var79 = var11.field4958;
                                    }
                                    int var80 = 0;
                                    class100 var81 = null;
                                    if (var11.field5089 != -1) {
                                        class253 var86 = class325.method2219(var11.field5089, -9379);
                                        if (var86 != null) {
                                            class253 var87 = var86.method1706(var11.field5045, 31008);
                                            class272 var88 = var79 == -1 ? null : class72.method468(var79, arg8 ^ 0x60);
                                            var81 = var87.method1718(var11.field5059, var11.field4970, var11.field4986, var88, -61, 1);
                                            if (var81 == null) {
                                                class247.method1666(var11, -127);
                                            } else {
                                                var80 = -var81.method115() / 2;
                                            }
                                        }
                                    } else if (var11.field4937 == 5) {
                                        if (var11.field4939 == -1) {
                                            var81 = class43.field520.method1727(true, 0, (class122[]) null, (class272) null, 449856673, -1, (class272) null, -1, -1, -1, 0);
                                        } else {
                                            int var82 = var11.field4939 & 0x7FF;
                                            if (class234.field3516 == var82) {
                                                var82 = 2047;
                                            }
                                            class195 var83 = class241.field3592[var82];
                                            class272 var84 = var79 == -1 ? null : class72.method468(var79, arg8 + 81);
                                            if (var83 != null && ((int) class242.method1638(var83.field2934, -14393) << 11) == (var11.field4939 & 0xFFFFF800)) {
                                                var81 = var83.field2912.method1727(true, 0, (class122[]) null, (class272) null, 449856673, -1, var84, var11.field4986, 0, -1, 0);
                                            }
                                        }
                                    } else if (var79 == -1) {
                                        var81 = var11.method2250(class114.field1750.field2912, 0, arg8 ^ 0xFFE9, -1, -1, (class272) null, var78);
                                        if (var81 == null && class265.field4065) {
                                            class247.method1666(var11, -127);
                                        }
                                    } else {
                                        class272 var85 = class72.method468(var79, arg8 ^ 0x60);
                                        var81 = var11.method2250(class114.field1750.field2912, var11.field5059, -65536, var11.field4986, var11.field4970, var85, var78);
                                        if (var81 == null && class265.field4065) {
                                            class247.method1666(var11, -127);
                                        }
                                    }
                                    if (var81 != null) {
                                        int var89;
                                        if (var11.field5079 > 0) {
                                            var89 = (var11.field5018 << 8) / var11.field5079;
                                        } else {
                                            var89 = 256;
                                        }
                                        int var90 = var13 - (-(var11.field5046 * var89 >> 8) - (var11.field5018 / 2));
                                        int var91;
                                        if (var11.field5007 <= 0) {
                                            var91 = 256;
                                        } else {
                                            var91 = (var11.field4994 << 8) / var11.field5007;
                                        }
                                        int var92 = var11.field4994 / 2 + (var11.field5087 * var91 >> 8) + var14;
                                        if (class117.field1817) {
                                            if (var11.field4975) {
                                                class117.method812(var90, var92, var11.field5041, var11.field5085, var89, var91);
                                            } else {
                                                class117.method806(var90, var92, var89, var91);
                                                class117.method828((float) var11.field4991, (float) var11.field5085 * 1.5F);
                                            }
                                            class117.method808();
                                            class117.method810(true);
                                            class117.method818(false);
                                            class281.method1961(class272.field4167, 1);
                                            if (class326.field4911) {
                                                class308.method2133();
                                                class117.method802();
                                                class308.method2123(arg2, arg7, arg1, arg0);
                                                class326.field4911 = false;
                                            }
                                            if (var11.field4989) {
                                                class117.method831();
                                            }
                                            int var93 = class148.field2229[var11.field5097] * var11.field5041 >> 16;
                                            int var94 = class148.field2239[var11.field5097] * var11.field5041 >> 16;
                                            if (var11.field5022) {
                                                var81.method511(0, var11.field4961, var11.field5084, var11.field5097, var11.field4997, var80 + var94 + var11.field5099, var93 - -var11.field5099, -1L);
                                            } else {
                                                var81.method511(0, var11.field4961, 0, var11.field5097, 0, var94, var93, -1L);
                                            }
                                            if (var11.field4989) {
                                                class117.method829();
                                            }
                                        } else {
                                            class148.method1071(var90, var92);
                                            int var95 = class148.field2239[var11.field5097] * var11.field5041 >> 16;
                                            int var96 = class148.field2229[var11.field5097] * var11.field5041 >> 16;
                                            if (!var11.field5022) {
                                                var81.method511(0, var11.field4961, 0, var11.field5097, 0, var95, var96, -1L);
                                            } else if (var11.field4975) {
                                                ((class77) var81).method499(0, var11.field4961, var11.field5084, var11.field5097, var11.field4997, var80 + var95 + var11.field5099, var11.field5099 + var96, var11.field5041);
                                            } else {
                                                var81.method511(0, var11.field4961, var11.field5084, var11.field5097, var11.field4997, var95 + var11.field5099 + var80, var11.field5099 + var96, -1L);
                                            }
                                            class148.method1059();
                                        }
                                    }
                                } else {
                                    if (var11.field5066 == 7) {
                                        class89 var97 = var11.method2241((byte) 18, class73.field948);
                                        if (var97 == null) {
                                            if (class265.field4065) {
                                                class247.method1666(var11, -124);
                                            }
                                            continue;
                                        }
                                        int var98 = 0;
                                        for (int var99 = 0; var99 < var11.field4946; var99++) {
                                            for (int var100 = 0; var100 < var11.field4971; var100++) {
                                                if (var11.field4995[var98] > 0) {
                                                    class253 var101 = class325.method2219(var11.field4995[var98] - 1, -9379);
                                                    String var102;
                                                    if (var101.field3847 != 1 && var11.field4999[var98] == 1) {
                                                        var102 = "<col=ff9040>" + var101.field3837 + "</col>";
                                                    } else {
                                                        var102 = "<col=ff9040>" + var101.field3837 + "</col> x" + class57.method376(var11.field4999[var98], (byte) -65);
                                                    }
                                                    int var103 = (var11.field5082 + 115) * var100 + var13;
                                                    int var104 = var14 + ((var11.field5083 + 12) * var99);
                                                    if (var11.field4983 == 0) {
                                                        var97.method620(var102, var103, var104, var11.field4935, var11.field5039 ? 0 : -1);
                                                    } else if (var11.field4983 == 1) {
                                                        var97.method627(var102, var103 + 57, var104, var11.field4935, var11.field5039 ? 0 : -1);
                                                    } else {
                                                        var97.method617(var102, var103 + 115 - 1, var104, var11.field4935, var11.field5039 ? 0 : -1);
                                                    }
                                                }
                                                var98++;
                                            }
                                        }
                                    }
                                    if (var11.field5066 == 8 && class69.field918 == var11 && class81.field1144 == class273.field4190) {
                                        int var105 = 0;
                                        int var106 = 0;
                                        class89 var107 = class84.field1247;
                                        String var108 = var11.field5035;
                                        String var109 = class177.method1222(var108, (byte) 20, var11);
                                        while (var109.length() > 0) {
                                            int var110 = var109.indexOf("<br>");
                                            String var111;
                                            if (var110 == -1) {
                                                var111 = var109;
                                                var109 = "";
                                            } else {
                                                var111 = var109.substring(0, var110);
                                                var109 = var109.substring(var110 + 4);
                                            }
                                            int var112 = var107.method632(var111);
                                            if (var112 > var105) {
                                                var105 = var112;
                                            }
                                            var106 += var107.field1318 + 1;
                                        }
                                        var105 += 6;
                                        int var113 = var11.field5018 + var13 - var105 - 5;
                                        var106 += 7;
                                        if (var113 < (var13 + 5)) {
                                            var113 = var13 + 5;
                                        }
                                        if (var113 + var105 > arg1) {
                                            var113 = arg1 - var105;
                                        }
                                        int var114 = var11.field4994 + var14 + 5;
                                        if (arg0 < var106 + var114) {
                                            var114 = arg0 - var106;
                                        }
                                        if (class117.field1817) {
                                            class308.method2126(var113, var114, var105, var106, 16777120);
                                            class308.method2128(var113, var114, var105, var106, 0);
                                        } else {
                                            class46.method312(var113, var114, var105, var106, 16777120);
                                            class46.method318(var113, var114, var105, var106, 0);
                                        }
                                        String var115 = var11.field5035;
                                        int var116 = var114 + var107.field1318 + 2;
                                        String var117 = class177.method1222(var115, (byte) 20, var11);
                                        while (var117.length() > 0) {
                                            int var118 = var117.indexOf("<br>");
                                            String var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = "";
                                            } else {
                                                var119 = var117.substring(0, var118);
                                                var117 = var117.substring(var118 + 4);
                                            }
                                            var107.method620(var119, var113 + 3, var116, 0, -1);
                                            var116 += var107.field1318 + 1;
                                        }
                                    }
                                    if (var11.field5066 == 9) {
                                        int var120;
                                        int var121;
                                        int var122;
                                        int var123;
                                        if (var11.field5013) {
                                            var123 = var11.field4994 + var14;
                                            var122 = var13;
                                            var120 = var14;
                                            var121 = var11.field5018 + var13;
                                        } else {
                                            var120 = var14 + var11.field4994;
                                            var121 = var11.field5018 + var13;
                                            var122 = var13;
                                            var123 = var14;
                                        }
                                        if (var11.field5096 == 1) {
                                            if (class117.field1817) {
                                                class308.method2127(var122, var123, var121, var120, var11.field4935);
                                            } else {
                                                class46.method307(var122, var123, var121, var120, var11.field4935);
                                            }
                                        } else if (class117.field1817) {
                                            class308.method2121(var122, var123, var121, var120, var11.field4935, var11.field5096);
                                        } else {
                                            class46.method299(var122, var123, var121, var120, var11.field4935, var11.field5096);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg8 != -23) {
            field4077 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;", line = 1419)
    public static final String method1869(boolean arg0, Throwable arg1) throws IOException {
        String var2;
        if ((arg1 instanceof class212)) {
            class212 var3 = (class212) arg1;
            arg1 = var3.field3221;
            var2 = var3.field3219 + " | ";
        } else {
            var2 = "";
        }
        field4071++;
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                if (arg0) {
                    return (String) null;
                }
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLbj;)V", line = 1491)
    public static final void method1870(byte arg0, class98 arg1) {
        field4090++;
        arg1.field1510 = false;
        if (arg1.field1507 != -1) {
            class272 var2 = class72.method468(arg1.field1507, arg0 + 9);
            if (var2 == null || var2.field4160 == null) {
                arg1.field1507 = -1;
            } else {
                arg1.field1500++;
                if (arg1.field1555 < var2.field4160.length && var2.field4184[arg1.field1555] < arg1.field1500) {
                    arg1.field1500 = 1;
                    arg1.field1480++;
                    arg1.field1555++;
                    class167.method1170(arg1.field1505, var2, arg1.field1555, arg0 - 77, arg1.field1566, class114.field1750 == arg1);
                }
                if (arg1.field1555 >= var2.field4160.length) {
                    arg1.field1555 = 0;
                    arg1.field1500 = 0;
                    class167.method1170(arg1.field1505, var2, arg1.field1555, arg0 ^ 0xFFFFFFCD, arg1.field1566, class114.field1750 == arg1);
                }
                arg1.field1480 = arg1.field1555 + 1;
                if (arg1.field1480 >= var2.field4160.length) {
                    arg1.field1480 = 0;
                }
            }
        }
        if (arg0 != 13) {
            return;
        }
        if (arg1.field1490 != -1 && class304.field4641 >= arg1.field1514) {
            int var3 = class8.method31(arg1.field1490, (byte) -126).field615;
            if (var3 == -1) {
                arg1.field1490 = -1;
            } else {
                class272 var4 = class72.method468(var3, arg0 - 135);
                if (var4 == null || var4.field4160 == null) {
                    arg1.field1490 = -1;
                } else {
                    if (arg1.field1563 < 0) {
                        arg1.field1563 = 0;
                        class167.method1170(arg1.field1505, var4, 0, arg0 - 77, arg1.field1566, class114.field1750 == arg1);
                    }
                    arg1.field1529++;
                    if (var4.field4160.length > arg1.field1563 && var4.field4184[arg1.field1563] < arg1.field1529) {
                        arg1.field1563++;
                        arg1.field1529 = 1;
                        class167.method1170(arg1.field1505, var4, arg1.field1563, arg0 ^ 0xFFFFFFCD, arg1.field1566, class114.field1750 == arg1);
                    }
                    if (arg1.field1563 >= var4.field4160.length) {
                        arg1.field1490 = -1;
                    }
                    arg1.field1550 = arg1.field1563 + 1;
                    if (var4.field4160.length <= arg1.field1550) {
                        arg1.field1550 = -1;
                    }
                }
            }
        }
        if (arg1.field1549 != -1 && arg1.field1538 <= 1) {
            class272 var5 = class72.method468(arg1.field1549, -17);
            if (var5.field4188 == 1 && arg1.field1569 > 0 && arg1.field1547 <= class304.field4641 && class304.field4641 > arg1.field1537) {
                arg1.field1538 = 1;
                return;
            }
        }
        if (arg1.field1549 != -1 && arg1.field1538 == 0) {
            class272 var6 = class72.method468(arg1.field1549, -128);
            if (var6 == null || var6.field4160 == null) {
                arg1.field1549 = -1;
            } else {
                arg1.field1487++;
                if (arg1.field1486 < var6.field4160.length && arg1.field1487 > var6.field4184[arg1.field1486]) {
                    arg1.field1487 = 1;
                    arg1.field1486++;
                    class167.method1170(arg1.field1505, var6, arg1.field1486, -64, arg1.field1566, class114.field1750 == arg1);
                }
                if (var6.field4160.length <= arg1.field1486) {
                    arg1.field1486 -= var6.field4166;
                    arg1.field1519++;
                    if (var6.field4179 <= arg1.field1519) {
                        arg1.field1549 = -1;
                    } else if (arg1.field1486 >= 0 && var6.field4160.length > arg1.field1486) {
                        class167.method1170(arg1.field1505, var6, arg1.field1486, -64, arg1.field1566, class114.field1750 == arg1);
                    } else {
                        arg1.field1549 = -1;
                    }
                }
                arg1.field1496 = arg1.field1486 + 1;
                if (arg1.field1496 >= var6.field4160.length) {
                    arg1.field1496 -= var6.field4166;
                    if (arg1.field1519 + 1 >= var6.field4179) {
                        arg1.field1496 = -1;
                    } else if (arg1.field1496 < 0 || arg1.field1496 >= var6.field4160.length) {
                        arg1.field1496 = -1;
                    }
                }
                arg1.field1510 = var6.field4189;
            }
        }
        if (arg1.field1538 > 0) {
            arg1.field1538--;
        }
        for (int var7 = 0; var7 < arg1.field1485.length; var7++) {
            class122 var8 = arg1.field1485[var7];
            if (var8 != null) {
                if (var8.field1906 > 0) {
                    var8.field1906--;
                } else {
                    class272 var9 = class72.method468(var8.field1905, 81);
                    if (var9 == null || var9.field4160 == null) {
                        arg1.field1485[var7] = null;
                    } else {
                        var8.field1900++;
                        if (var9.field4160.length > var8.field1908 && var8.field1900 > var9.field4184[var8.field1908]) {
                            var8.field1900 = 1;
                            var8.field1908++;
                            class167.method1170(arg1.field1505, var9, var8.field1908, -64, arg1.field1566, class114.field1750 == arg1);
                        }
                        if (var8.field1908 >= var9.field4160.length) {
                            var8.field1899++;
                            var8.field1908 -= var9.field4166;
                            if (var8.field1899 >= var9.field4179) {
                                arg1.field1485[var7] = null;
                            } else if (var8.field1908 >= 0 && var9.field4160.length > var8.field1908) {
                                class167.method1170(arg1.field1505, var9, var8.field1908, -64, arg1.field1566, class114.field1750 == arg1);
                            } else {
                                arg1.field1485[var7] = null;
                            }
                        }
                        var8.field1903 = var8.field1908 + 1;
                        if (var8.field1903 >= var9.field4160.length) {
                            var8.field1903 -= var9.field4166;
                            if (var9.field4179 <= (var8.field1899 + 1)) {
                                var8.field1903 = -1;
                            } else if (var8.field1903 < 0 || var9.field4160.length <= var8.field1903) {
                                var8.field1903 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILlm;II)Lea;", line = 1721)
    public static final class235 method1871(int arg0, class210 arg1, int arg2, int arg3) {
        field4094++;
        if (class249.method1680(arg2, arg1, arg3, (byte) -71)) {
            if (arg0 != -1154520473) {
                field4097 = 86;
            }
            return class189.method1288(14897);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V", line = 1737)
    private final void method1872(int arg0) {
        int var2 = (this.field4098 << 7) + 64;
        if (arg0 != 14686247) {
            method1866(27);
        }
        this.field4080 = 1.0F / (float) (var2 * var2);
        field4075++;
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V", line = 1749)
    public static final void method1873(int arg0) {
        class22.field321 = arg0;
        for (int var1 = 0; var1 < class311.field4734; var1++) {
            for (int var2 = 0; var2 < class191.field2844; var2++) {
                if (class158.field2367[arg0][var1][var2] == null) {
                    class158.field2367[arg0][var1][var2] = new class221(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V", line = 2010)
    protected class266() {
        if (class258.field3920 == null) {
            class190.method1296(true);
        }
        this.method1875(-128);
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lre;)V", line = 2020)
    public class266(class263 arg0) {
        if (class258.field3920 == null) {
            class190.method1296(true);
        }
        this.field4076 = arg0.method1787(false);
        this.field4083 = (this.field4076 & 0x10) != 0;
        this.field4073 = (this.field4076 & 0x8) != 0;
        this.field4076 &= 0x7;
        this.field4088 = arg0.method1830((byte) -77);
        this.field4074 = arg0.method1830((byte) -77);
        this.field4092 = arg0.method1830((byte) -77);
        this.field4098 = arg0.method1787(false);
        this.method1872(14686247);
        this.field4093 = new short[this.field4098 * 2 + 1];
        for (int var2 = 0; var2 < this.field4093.length; var2++) {
            this.field4093[var2] = (short) arg0.method1830((byte) -77);
        }
        this.field4069 = class148.field2222[arg0.method1830((byte) -77)];
        int var3 = arg0.method1787(false);
        this.field4091 = var3 & 0xE0 << 3;
        this.field4081 = var3 & 0x1F;
        if (this.field4081 != 31) {
            this.method1875(-64);
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V", line = 1786)
    public static void method1874(int arg0) {
        field4089 = null;
        field4077 = null;
        if (arg0 != 32) {
            field4077 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V", line = 1834)
    private final void method1875(int arg0) {
        int var2 = this.field4081;
        if (var2 == 2) {
            this.field4068 = 2048;
            this.field4067 = 2048;
            this.field4096 = 0;
            this.field4095 = 1;
        } else if (var2 == 3) {
            this.field4095 = 1;
            this.field4068 = 2048;
            this.field4067 = 4096;
            this.field4096 = 0;
        } else if (var2 == 4) {
            this.field4067 = 2048;
            this.field4095 = 4;
            this.field4096 = 0;
            this.field4068 = 2048;
        } else if (var2 == 5) {
            this.field4096 = 0;
            this.field4067 = 8192;
            this.field4095 = 4;
            this.field4068 = 2048;
        } else if (var2 == 12) {
            this.field4095 = 2;
            this.field4067 = 2048;
            this.field4096 = 0;
            this.field4068 = 2048;
        } else if (var2 == 13) {
            this.field4067 = 8192;
            this.field4068 = 2048;
            this.field4095 = 2;
            this.field4096 = 0;
        } else if (var2 == 10) {
            this.field4067 = 2048;
            this.field4096 = 1536;
            this.field4068 = 512;
            this.field4095 = 3;
        } else if (var2 == 11) {
            this.field4096 = 1536;
            this.field4067 = 4096;
            this.field4068 = 512;
            this.field4095 = 3;
        } else if (var2 == 6) {
            this.field4067 = 2048;
            this.field4068 = 768;
            this.field4096 = 1280;
            this.field4095 = 3;
        } else if (var2 == 7) {
            this.field4067 = 4096;
            this.field4068 = 768;
            this.field4095 = 3;
            this.field4096 = 1280;
        } else if (var2 == 8) {
            this.field4095 = 3;
            this.field4068 = 1024;
            this.field4096 = 1024;
            this.field4067 = 2048;
        } else if (var2 == 9) {
            this.field4067 = 4096;
            this.field4068 = 1024;
            this.field4096 = 1024;
            this.field4095 = 3;
        } else if (var2 == 14) {
            this.field4095 = 1;
            this.field4096 = 1280;
            this.field4067 = 2048;
            this.field4068 = 768;
        } else if (var2 == 15) {
            this.field4067 = 4096;
            this.field4095 = 1;
            this.field4096 = 1536;
            this.field4068 = 512;
        } else if (var2 == 16) {
            this.field4068 = 256;
            this.field4096 = 1792;
            this.field4095 = 1;
            this.field4067 = 8192;
        } else {
            this.field4096 = 0;
            this.field4067 = 2048;
            this.field4068 = 2048;
            this.field4095 = 0;
        }
        field4084++;
        int var3 = -20 % ((arg0 + 4) / 47);
    }
}
