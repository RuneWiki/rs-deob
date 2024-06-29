import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class305 implements class96 {

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    private int field5091 = 50;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "Z")
    private boolean field5098 = false;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lmh;")
    private class65 field5077;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "Lmh;")
    private class65 field5106;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lee;")
    private class75 field5078;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lee;")
    private class75 field5093;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "[Z")
    private boolean[] field5105;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "[B")
    private byte[] field5117;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "[B")
    private byte[] field5112;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "[Z")
    private boolean[] field5097;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "[Z")
    private boolean[] field5103;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[B")
    private byte[] field5076;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "[Z")
    private boolean[] field5090;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "[Z")
    private boolean[] field5102;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "[S")
    private short[] field5086;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[B")
    private byte[] field5099;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "Lok;")
    public static class41 field5080 = class137.method956("(U0a )2 in: ", 45);

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "I")
    public static int field5110 = 0;

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "Lok;")
    public static class41 field5118 = class137.method956("Starte 3D)2Softwarebibliothek)3", 45);

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field5079;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field5081;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(FBI)[I", line = 5)
    public final int[] method688(float arg0, byte arg1, int arg2) {
        class60 var4 = this.method2103(true, arg2);
        if (arg1 < 60) {
            this.method691(-41, (byte) 123);
        }
        field5082++;
        if (var4 == null) {
            return null;
        } else {
            var4.field880 = true;
            return var4.method425(this, 0, this.field5077, this.field5098 || this.field5102[arg2], arg0);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lok;II)V", line = 22)
    public static final void method2095(class41 arg0, int arg1, int arg2) {
        field5079++;
        class46 var3 = class195.method1396(arg2, arg1, false);
        var3.method337(0);
        var3.field724 = arg0;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)I", line = 34)
    public final int method690(int arg0, byte arg1) {
        field5083++;
        if (arg1 != -29) {
            field5080 = (class41) null;
        }
        return this.field5076[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)I", line = 47)
    public final int method693(int arg0, int arg1) {
        if (arg0 != 2) {
            this.field5093 = (class75) null;
        }
        field5094++;
        return this.field5086[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 58)
    public static void method2096(int arg0) {
        field5118 = null;
        field5080 = null;
        if (arg0 <= 46) {
            method2105(true, (class41) null, -29);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(IB)V", line = 69)
    public final void method2097(int arg0, byte arg1) {
        field5081++;
        if (arg1 >= -27) {
            this.method689(112, (byte) -89);
        }
        for (class60 var3 = (class60) this.field5078.method551(false); var3 != null; var3 = (class60) this.field5078.method550((byte) -52)) {
            if (var3.field880) {
                var3.method427((byte) 104, arg0);
                var3.field880 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(BI)I", line = 93)
    public static final int method2098(byte arg0, int arg1) {
        if (arg0 != 23) {
            method2098((byte) -16, 13);
        }
        field5084++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Lea;", line = 105)
    public static final class67 method2099(int arg0) {
        if (arg0 <= 14) {
            return (class67) null;
        }
        field5100++;
        try {
            return (class67) Class.forName("fh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class288();
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)V", line = 121)
    public final void method692(int arg0, int arg1) {
        class274.method1934(this.field5076[arg1] & 0xFF, this.field5112[arg1] & 0xFF, (byte) 2);
        if (arg0 != 0) {
            this.field5106 = (class65) null;
        }
        field5096++;
        boolean var3 = false;
        class60 var4 = this.method2103(true, arg1);
        if (var4 != null) {
            var3 = var4.method428(true, this.field5098 || this.field5102[arg1], this, this.field5077);
        }
        if (!var3) {
            class81 var5 = this.method2108(arg1, 118);
            var5.method577(15017);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 150)
    public static final void method2100(byte arg0) {
        field5108++;
        if (arg0 >= -67) {
            method2104(-116, (class65) null, (class65) null, (class152) null, (class65) null);
        }
        int var1 = class158.field2482.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class158.field2482[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class176.field2855; var4++) {
                    if (class277.field4540[var4] == class110.field1557[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class277.field4540[class176.field2855] = class110.field1557[var2];
                    var3 = class176.field2855++;
                }
                class112 var5 = new class112(class158.field2482[var2]);
                int var6 = 0;
                while (class158.field2482[var2].length > var5.field1640 && var6 < 511) {
                    int var7 = var5.method759((byte) -81);
                    int var8 = var3 | var6++ << 6;
                    int var9 = var7 & 0x3F;
                    int var10 = var7 >> 14;
                    int var11 = var7 >> 7 & 0x3F;
                    int var12 = (class110.field1557[var2] & 0xFF) * 64 + (var9 - class55.field809);
                    int var13 = (class110.field1557[var2] >> 8) * 64 + var11 - class88.field1300;
                    class147 var14 = class165.method1156(var5.method759((byte) -43), (byte) -93);
                    if (class216.field3471[var8] == null && (var14.field2231 & 0x1) > 0 && class5.field58 == var10 && var13 >= 0 && var14.field2251 + var13 < 104 && var12 >= 0 && var14.field2251 + var12 < 104) {
                        class216.field3471[var8] = new class50();
                        class50 var15 = class216.field3471[var8];
                        class101.field1441[class97.field1419++] = var8;
                        var15.field4294 = class18.field234;
                        var15.field758 = var14;
                        var15.method1904(var15.field758.field2251, -11);
                        var15.field4277 = var15.field758.field2283;
                        var15.field4313 = var15.field758.field2273;
                        var15.field4271 = var15.field758.field2270;
                        var15.field4282 = var15.field758.field2245;
                        var15.field4298 = var15.field758.field2255;
                        var15.field4339 = var15.field758.field2287;
                        if (var15.field4282 == 0) {
                            var15.field4297 = 0;
                        }
                        var15.field4324 = var15.field758.field2239;
                        var15.field4321 = var15.field758.field2266;
                        var15.method1906(-1, true, var12, var15.method1753((byte) -15), var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 258)
    public final void method2101(byte arg0) {
        this.field5078.method548(-127);
        if (arg0 != -81) {
            this.field5102 = (boolean[]) null;
        }
        if (this.field5093 != null) {
            this.field5093.method548(arg0 - 41);
        }
        field5116++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II[Lbc;IIIIIII)V", line = 273)
    public static final void method2102(int arg0, int arg1, class302[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5104++;
        if (class166.field2625) {
            class190.method1369(arg3, arg7, arg0, arg4);
        } else {
            class54.method375(arg3, arg7, arg0, arg4);
            class31.method201();
        }
        if (arg1 != -18045) {
            return;
        }
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class302 var11 = arg2[var10];
            if (var11 != null && (var11.field4999 == arg8 || arg8 == -1412584499 && class317.field5361 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class237.field3804[class75.field1120] = var11.field4944 + arg6;
                    class92.field1353[class75.field1120] = var11.field4953 + arg9;
                    class201.field3212[class75.field1120] = var11.field4936;
                    class62.field904[class75.field1120] = var11.field4949;
                    var12 = class75.field1120++;
                } else {
                    var12 = arg5;
                }
                var11.field5051 = class18.field234;
                var11.field4901 = var12;
                if (!var11.field4964 || !client.method2117(var11)) {
                    if (var11.field4924 > 0) {
                        class260.method1834(var11, (byte) 75);
                    }
                    int var13 = var11.field4944 + arg6;
                    int var14 = var11.field5006;
                    int var15 = var11.field4953 + arg9;
                    if (class150.field2331 && (client.method2119(var11) != 0 || var11.field4951 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class317.field5361 == var11) {
                        if (arg8 != -1412584499 && !var11.field4903) {
                            class75.field1114 = arg6;
                            class13.field162 = arg2;
                            class300.field4866 = arg9;
                            continue;
                        }
                        if (class256.field4111 && class180.field2921) {
                            int var16 = class53.field789;
                            int var17 = class129.field1929;
                            int var18 = var17 - class124.field1842;
                            int var19 = var16 - class1.field9;
                            if (class296.field4789 > var19) {
                                var19 = class296.field4789;
                            }
                            if (class296.field4789 + class86.field1264.field4949 < var11.field4949 + var19) {
                                var19 = class86.field1264.field4949 + class296.field4789 - var11.field4949;
                            }
                            var15 = var19;
                            if (var18 < class205.field3304) {
                                var18 = class205.field3304;
                            }
                            if (class205.field3304 + class86.field1264.field4936 < var11.field4936 + var18) {
                                var18 = class205.field3304 + class86.field1264.field4936 - var11.field4936;
                            }
                            var13 = var18;
                        }
                        if (!var11.field4903) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field4951 == 2) {
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg0;
                        var23 = arg7;
                    } else {
                        var20 = var13 <= arg3 ? arg3 : var13;
                        var23 = arg7 < var15 ? var15 : arg7;
                        int var24 = var11.field4936 + var13;
                        int var25 = var15 + var11.field4949;
                        if (var11.field4951 == 9) {
                            var24++;
                            var25++;
                        }
                        var22 = var24 < arg0 ? var24 : arg0;
                        var21 = arg4 <= var25 ? arg4 : var25;
                    }
                    if (!var11.field4964 || var22 > var20 && var21 > var23) {
                        if (var11.field4924 != 0) {
                            if (var11.field4924 == 1337 || var11.field4924 == 1403 && class166.field2625) {
                                class186.field3039 = var11;
                                class156.field2472 = var13;
                                class161.field2552 = var15;
                                class81.method579((byte) -118, var15, var13, var11.field4949, var11.field4936, var11.field4924 == 1403);
                                if (class166.field2625) {
                                    class190.method1369(arg3, arg7, arg0, arg4);
                                } else {
                                    class54.method375(arg3, arg7, arg0, arg4);
                                }
                                continue;
                            }
                            if (var11.field4924 == 1338) {
                                if (var11.method2077(true)) {
                                    class288.method2010(var15, var13, var11, var12, 256);
                                    if (class166.field2625) {
                                        class190.method1369(arg3, arg7, arg0, arg4);
                                    } else {
                                        class54.method375(arg3, arg7, arg0, arg4);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4924 == 1339) {
                                if (var11.method2077(true)) {
                                    class160.method1132(var12, var13, var15, var11, 7);
                                    if (class166.field2625) {
                                        class190.method1369(arg3, arg7, arg0, arg4);
                                    } else {
                                        class54.method375(arg3, arg7, arg0, arg4);
                                    }
                                }
                                continue;
                            }
                            if (var11.field4924 == 1400) {
                                class126.method890(var11.field4949, true, var13, var11.field4936, var15);
                                class195.field3151[var12] = true;
                                class165.field2615[var12] = true;
                                if (class166.field2625) {
                                    class190.method1369(arg3, arg7, arg0, arg4);
                                } else {
                                    class54.method375(arg3, arg7, arg0, arg4);
                                }
                                continue;
                            }
                            if (var11.field4924 == 1401) {
                                class266.method1886(var15, (byte) -120, var11.field4936, var13, var11.field4949);
                                class195.field3151[var12] = true;
                                class165.field2615[var12] = true;
                                if (class166.field2625) {
                                    class190.method1369(arg3, arg7, arg0, arg4);
                                } else {
                                    class54.method375(arg3, arg7, arg0, arg4);
                                }
                                continue;
                            }
                            if (var11.field4924 == 1402) {
                                if (!class166.field2625) {
                                    class32.method218(var15, -118, var13);
                                    class195.field3151[var12] = true;
                                    class165.field2615[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field4924 == 1405) {
                                if (!class46.field728) {
                                    continue;
                                }
                                int var111 = var11.field4936 + var13;
                                int var112 = var15 + 15;
                                class244.field3898.method1789(class187.method1346(new class41[] { class8.field107, class1.method4(class186.field3043, (byte) 51) }, 0), var111, var112, 16776960, -1);
                                int var126 = var112 + 15;
                                Runtime var113 = Runtime.getRuntime();
                                int var114 = (int) ((var113.totalMemory() - var113.freeMemory()) / 1024L);
                                int var115 = 16776960;
                                if (var114 > 65536) {
                                    var115 = 16711680;
                                }
                                class244.field3898.method1789(class187.method1346(new class41[] { class104.field1487, class1.method4(var114, (byte) 123), class236.field3794 }, 0), var111, var126, var115, -1);
                                var112 = var126 + 15;
                                if (class166.field2625) {
                                    int var116 = 16776960;
                                    int var117 = (class103.field1462 + class103.field1458 + class103.field1457) / 1024;
                                    if (var117 > 65536) {
                                        var116 = 16711680;
                                    }
                                    class244.field3898.method1789(class187.method1346(new class41[] { class177.field2881, class1.method4(var117, (byte) 80), class236.field3794 }, 0), var111, var112, var116, -1);
                                    var112 += 15;
                                }
                                int var118 = 0;
                                int var119 = 0;
                                int var120 = 16776960;
                                int var121 = 0;
                                for (int var122 = 0; var122 < 27; var122++) {
                                    var118 += class198.field3179[var122].method648((byte) 51);
                                    var119 += class198.field3179[var122].method647(-2);
                                    var121 += class198.field3179[var122].method649(109);
                                }
                                int var123 = var121 * 100 / var118;
                                int var124 = var119 * 10000 / var118;
                                class41 var125 = class187.method1346(new class41[] { class204.field3287, class136.method950(true, arg1 ^ 0xFFFFB882, 2, 0, (long) var124), class277.field4537, class1.method4(var123, (byte) 43), class159.field2491 }, arg1 + 18045);
                                class48.field749.method1789(var125, var111, var112, var120, -1);
                                var112 += 12;
                                class195.field3151[var12] = true;
                                class165.field2615[var12] = true;
                                continue;
                            }
                        }
                        if (!class251.field3993) {
                            if (var11.field4951 == 0 && var11.field5018 && var20 <= class196.field3164 && class130.field1948 >= var23 && class196.field3164 < var22 && var21 > class130.field1948 && !class150.field2331) {
                                class296.field4780[0] = 1005;
                                class306.field5129[0] = class95.field1417;
                                class203.field3286[0] = class266.field4233;
                                class98.field1432 = 1;
                            }
                            if (var20 <= class196.field3164 && var23 <= class130.field1948 && var22 > class196.field3164 && class130.field1948 < var21) {
                                class282.method1989(var11, class130.field1948 - var15, (byte) -21, class196.field3164 - var13);
                            }
                        }
                        if (var11.field4951 == 0) {
                            if (!var11.field4964 && client.method2117(var11) && class260.field4147 != var11) {
                                continue;
                            }
                            if (!var11.field4964) {
                                if (var11.field4952 - var11.field4949 < var11.field4918) {
                                    var11.field4918 = var11.field4952 - var11.field4949;
                                }
                                if (var11.field4918 < 0) {
                                    var11.field4918 = 0;
                                }
                            }
                            method2102(var22, -18045, arg2, var20, var21, var12, var13 - var11.field4912, var23, var11.field4910, var15 - var11.field4918);
                            if (var11.field4988 != null) {
                                method2102(var22, -18045, var11.field4988, var20, var21, var12, var13 - var11.field4912, var23, var11.field4910, var15 - var11.field4918);
                            }
                            class187 var26 = (class187) class113.field1658.method617((long) var11.field4910, false);
                            if (var26 != null) {
                                if (var26.field3053 == 0 && !class251.field3993 && class196.field3164 >= var20 && var23 <= class130.field1948 && var22 > class196.field3164 && var21 > class130.field1948 && !class150.field2331) {
                                    class306.field5129[0] = class95.field1417;
                                    class296.field4780[0] = 1005;
                                    class203.field3286[0] = class266.field4233;
                                    class98.field1432 = 1;
                                }
                                class264.method1872(6266, var13, var21, var12, var26.field3052, var22, var15, var23, var20);
                            }
                            if (class166.field2625) {
                                class190.method1369(arg3, arg7, arg0, arg4);
                            } else {
                                class54.method375(arg3, arg7, arg0, arg4);
                                class31.method201();
                            }
                        }
                        if (class46.field733[var12] || class256.field4107 > 1) {
                            if (var11.field4951 == 0 && !var11.field4964 && var11.field4952 > var11.field4949) {
                                class286.method2004(var11.field4918, var15, var11.field4949, var11.field4936 + var13, 93, var11.field4952);
                            }
                            if (var11.field4951 != 1) {
                                if (var11.field4951 == 2) {
                                    int var94 = 0;
                                    for (int var95 = 0; var95 < var11.field4921; var95++) {
                                        for (int var96 = 0; var96 < var11.field5041; var96++) {
                                            int var97 = (var11.field4931 + 32) * var95 + var15;
                                            int var98 = (var11.field4998 + 32) * var96 + var13;
                                            if (var94 < 20) {
                                                var97 += var11.field5036[var94];
                                                var98 += var11.field4963[var94];
                                            }
                                            if (var11.field5011[var94] > 0) {
                                                boolean var99 = false;
                                                boolean var100 = false;
                                                int var101 = var11.field5011[var94] - 1;
                                                if (var98 + 32 > arg3 && var98 < arg0 && var97 + 32 > arg7 && var97 < arg4 || class284.field4622 == var11 && class153.field2442 == var94) {
                                                    class199 var102;
                                                    if (class101.field1445 == 1 && class226.field3627 == var94 && class10.field134 == var11.field4910) {
                                                        var102 = class169.method1215((byte) 100, 0, var101, var11.field5023[var94], var11.field5001, 2);
                                                    } else {
                                                        var102 = class169.method1215((byte) 73, 3153952, var101, var11.field5023[var94], var11.field5001, 1);
                                                    }
                                                    if (class31.field451) {
                                                        class195.field3151[var12] = true;
                                                    }
                                                    if (var102 == null) {
                                                        class18.method91(28515, var11);
                                                    } else if (class284.field4622 == var11 && class153.field2442 == var94) {
                                                        int var103 = class53.field789 - class203.field3260;
                                                        if (var103 < 5 && var103 > -5) {
                                                            var103 = 0;
                                                        }
                                                        int var104 = class129.field1929 - class312.field5266;
                                                        if (var104 < 5 && var104 > -5) {
                                                            var104 = 0;
                                                        }
                                                        if (class265.field4199 < 5) {
                                                            var104 = 0;
                                                            var103 = 0;
                                                        }
                                                        var102.method79(var98 + var104, var97 - -var103, 128);
                                                        if (arg8 != -1) {
                                                            class302 var105 = arg2[arg8 & 0xFFFF];
                                                            int var106;
                                                            int var107;
                                                            if (class166.field2625) {
                                                                var106 = class190.field3073;
                                                                var107 = class190.field3074;
                                                            } else {
                                                                var107 = class54.field799;
                                                                var106 = class54.field800;
                                                            }
                                                            if (var106 > var97 + var103 && var105.field4918 > 0) {
                                                                int var108 = (var106 - var103 - var97) * class140.field2163 / 3;
                                                                if ((class140.field2163 * 10) < var108) {
                                                                    var108 = class140.field2163 * 10;
                                                                }
                                                                if (var105.field4918 < var108) {
                                                                    var108 = var105.field4918;
                                                                }
                                                                var105.field4918 -= var108;
                                                                class203.field3260 += var108;
                                                                class18.method91(28515, var105);
                                                            }
                                                            if (var107 < (var97 + var103 + 32) && var105.field4952 - var105.field4949 > var105.field4918) {
                                                                int var109 = (var97 + var103 + 32 - var107) * class140.field2163 / 3;
                                                                if ((class140.field2163 * 10) < var109) {
                                                                    var109 = class140.field2163 * 10;
                                                                }
                                                                if (var105.field4952 - var105.field4949 - var105.field4918 < var109) {
                                                                    var109 = var105.field4952 - var105.field4949 - var105.field4918;
                                                                }
                                                                var105.field4918 += var109;
                                                                class203.field3260 -= var109;
                                                                class18.method91(28515, var105);
                                                            }
                                                        }
                                                    } else if (class316.field5341 == var11 && class313.field5286 == var94) {
                                                        var102.method79(var98, var97, 128);
                                                    } else {
                                                        var102.method83(var98, var97);
                                                    }
                                                }
                                            } else if (var11.field4967 != null && var94 < 20) {
                                                class199 var110 = var11.method2080(var94, (byte) -118);
                                                if (var110 != null) {
                                                    var110.method83(var98, var97);
                                                } else if (class194.field3132) {
                                                    class18.method91(28515, var11);
                                                }
                                            }
                                            var94++;
                                        }
                                    }
                                } else if (var11.field4951 == 3) {
                                    int var93;
                                    if (class64.method446(127, var11)) {
                                        var93 = var11.field4941;
                                        if (class260.field4147 == var11 && var11.field4919 != 0) {
                                            var93 = var11.field4919;
                                        }
                                    } else {
                                        var93 = var11.field4972;
                                        if (class260.field4147 == var11 && var11.field4934 != 0) {
                                            var93 = var11.field4934;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field5004) {
                                            if (class166.field2625) {
                                                class190.method1363(var13, var15, var11.field4936, var11.field4949, var93);
                                            } else {
                                                class54.method383(var13, var15, var11.field4936, var11.field4949, var93);
                                            }
                                        } else if (class166.field2625) {
                                            class190.method1361(var13, var15, var11.field4936, var11.field4949, var93);
                                        } else {
                                            class54.method378(var13, var15, var11.field4936, var11.field4949, var93);
                                        }
                                    } else if (var11.field5004) {
                                        if (class166.field2625) {
                                            class190.method1370(var13, var15, var11.field4936, var11.field4949, var93, 256 - (var14 & 0xFF));
                                        } else {
                                            class54.method365(var13, var15, var11.field4936, var11.field4949, var93, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class166.field2625) {
                                        class190.method1365(var13, var15, var11.field4936, var11.field4949, var93, 256 - (var14 & 0xFF));
                                    } else {
                                        class54.method370(var13, var15, var11.field4936, var11.field4949, var93, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field4951 == 4) {
                                    class253 var27 = var11.method2082(class53.field790, (byte) -112);
                                    if (var27 != null) {
                                        class41 var28 = var11.field4969;
                                        int var29;
                                        if (class64.method446(122, var11)) {
                                            var29 = var11.field4941;
                                            if (class260.field4147 == var11 && var11.field4919 != 0) {
                                                var29 = var11.field4919;
                                            }
                                            if (var11.field4975.method275(false) > 0) {
                                                var28 = var11.field4975;
                                            }
                                        } else {
                                            var29 = var11.field4972;
                                            if (class260.field4147 == var11 && var11.field4934 != 0) {
                                                var29 = var11.field4934;
                                            }
                                        }
                                        if (var11.field4964 && var11.field4965 != -1) {
                                            class138 var30 = class130.method918(var11.field4965, -124);
                                            var28 = var30.field2120;
                                            if (var28 == null) {
                                                var28 = class129.field1918;
                                            }
                                            if ((var30.field2122 == 1 || var11.field4970 != 1) && var11.field4970 != -1) {
                                                var28 = class187.method1346(new class41[] { class78.field1155, var28, class8.field100, class133.method934(-1, var11.field4970) }, 0);
                                            }
                                        }
                                        if (class109.field1526 == var11) {
                                            var29 = var11.field4972;
                                            var28 = class132.field1975;
                                        }
                                        if (!var11.field4964) {
                                            var28 = class185.method1342(var28, var11, (byte) 14);
                                        }
                                        var27.method1803(var28, var13, var15, var11.field4936, var11.field4949, var29, var11.field4895 ? 0 : -1, var11.field5000, var11.field4962, var11.field4966);
                                    } else if (class194.field3132) {
                                        class18.method91(28515, var11);
                                    }
                                } else if (var11.field4951 == 5) {
                                    if (var11.field4964) {
                                        class199 var77;
                                        if (var11.field4965 == -1) {
                                            var77 = var11.method2086(true, false);
                                        } else {
                                            var77 = class169.method1215((byte) 68, var11.field4987, var11.field4965, var11.field4970, var11.field5001, var11.field4913);
                                        }
                                        if (var77 != null) {
                                            int var78 = var77.field3201;
                                            int var79 = var77.field3194;
                                            if (var11.field4946) {
                                                int var80 = (var78 + var11.field4936 - 1) / var78;
                                                int var81 = (var11.field4949 + var79 - 1) / var79;
                                                if (class166.field2625) {
                                                    class190.method1357(var13, var15, var11.field4936 + var13, var15 - -var11.field4949);
                                                    boolean var84 = class150.method1036(arg1 ^ 0x467B, var77.field3200);
                                                    boolean var85 = class150.method1036(-8, var77.field3189);
                                                    class17 var86 = (class17) var77;
                                                    if (var84 && var85) {
                                                        if (var14 == 0) {
                                                            var86.method78(var13, var15, var80, var81);
                                                        } else {
                                                            var86.method85(var13, var15, 256 - (var14 & 0xFF), var80, var81);
                                                        }
                                                    } else if (var84) {
                                                        for (int var90 = 0; var90 < var81; var90++) {
                                                            if (var14 == 0) {
                                                                var86.method78(var13, var79 * var90 + var15, var80, 1);
                                                            } else {
                                                                var86.method85(var13, var79 * var90 + var15, -(var14 & 0xFF) + 256, var80, 1);
                                                            }
                                                        }
                                                    } else if (var85) {
                                                        for (int var89 = 0; var89 < var80; var89++) {
                                                            if (var14 == 0) {
                                                                var86.method78(var78 * var89 + var13, var15, 1, var81);
                                                            } else {
                                                                var86.method85(var78 * var89 + var13, var15, 256 - (var14 & 0xFF), 1, var81);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var87 = 0; var87 < var80; var87++) {
                                                            for (int var88 = 0; var88 < var81; var88++) {
                                                                if (var14 == 0) {
                                                                    var77.method83(var78 * var87 + var13, var79 * var88 + var15);
                                                                } else {
                                                                    var77.method79(var78 * var87 + var13, var79 * var88 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class190.method1369(arg3, arg7, arg0, arg4);
                                                } else {
                                                    class54.method373(var13, var15, var11.field4936 + var13, var11.field4949 + var15);
                                                    for (int var82 = 0; var82 < var80; var82++) {
                                                        for (int var83 = 0; var83 < var81; var83++) {
                                                            if (var11.field4928 != 0) {
                                                                var77.method1415(var11.field4928, var79 / 2 + var79 * var83 + var15, var78 / 2 + var78 * var82 + var13, -22, 4096);
                                                            } else if (var14 == 0) {
                                                                var77.method83(var13 + (var78 * var82), var79 * var83 + var15);
                                                            } else {
                                                                var77.method79(var78 * var82 + var13, var15 - -(var79 * var83), 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class54.method375(arg3, arg7, arg0, arg4);
                                                }
                                            } else {
                                                int var91 = var11.field4936 * 4096 / var78;
                                                if (var11.field4928 != 0) {
                                                    var77.method1415(var11.field4928, var11.field4949 / 2 + var15, var11.field4936 / 2 + var13, -19, var91);
                                                } else if (var14 != 0) {
                                                    var77.method90(var13, var15, var11.field4936, var11.field4949, 256 - (var14 & 0xFF));
                                                } else if (var11.field4936 == var78 && var11.field4949 == var79) {
                                                    var77.method83(var13, var15);
                                                } else {
                                                    var77.method80(var13, var15, var11.field4936, var11.field4949);
                                                }
                                            }
                                        } else if (class194.field3132) {
                                            class18.method91(arg1 + 46560, var11);
                                        }
                                    } else {
                                        class199 var92 = var11.method2086(true, class64.method446(123, var11));
                                        if (var92 != null) {
                                            var92.method83(var13, var15);
                                        } else if (class194.field3132) {
                                            class18.method91(28515, var11);
                                        }
                                    }
                                } else if (var11.field4951 == 6) {
                                    boolean var31 = class64.method446(125, var11);
                                    class287 var32 = null;
                                    int var33;
                                    if (var31) {
                                        var33 = var11.field5014;
                                    } else {
                                        var33 = var11.field4915;
                                    }
                                    int var34 = 0;
                                    if (var11.field4965 != -1) {
                                        class138 var35 = class130.method918(var11.field4965, -35);
                                        if (var35 != null) {
                                            class138 var36 = var35.method969(var11.field4970, (byte) 120);
                                            class205 var37 = var33 == -1 ? null : class285.method2000(var33, 4442);
                                            var32 = var36.method968(var11.field4994, var37, 1, (byte) -127);
                                            if (var32 == null) {
                                                class18.method91(28515, var11);
                                            } else {
                                                var34 = -var32.method125() / 2;
                                            }
                                        }
                                    } else if (var11.field4909 == 5) {
                                        if (var11.field4968 == -1) {
                                            var32 = class203.field3259.method507(1073741823, (class205) null, (class205) null, -1, -1);
                                        } else {
                                            int var39 = var11.field4968 & 0x7FF;
                                            if (class204.field3300 == var39) {
                                                var39 = 2047;
                                            }
                                            class245 var40 = class246.field3955[var39];
                                            class205 var41 = var33 == -1 ? null : class285.method2000(var33, 4442);
                                            if (var40 != null && (int) var40.field3933.method291((byte) 65) << 11 == (var11.field4968 & 0xFFFFF800)) {
                                                var32 = var40.field3946.method507(1073741823, var41, (class205) null, 0, var11.field4994);
                                            }
                                        }
                                    } else if (var33 == -1) {
                                        var32 = var11.method2085(-1, (class205) null, var31, class62.field913.field3946, (byte) 10);
                                        if (var32 == null && class194.field3132) {
                                            class18.method91(arg1 + 46560, var11);
                                        }
                                    } else {
                                        class205 var38 = class285.method2000(var33, 4442);
                                        var32 = var11.method2085(var11.field4994, var38, var31, class62.field913.field3946, (byte) 10);
                                        if (var32 == null && class194.field3132) {
                                            class18.method91(arg1 ^ 0xFFFFD6E0, var11);
                                        }
                                    }
                                    if (var32 != null) {
                                        int var42;
                                        if (var11.field5046 <= 0) {
                                            var42 = 256;
                                        } else {
                                            var42 = (var11.field4936 << 8) / var11.field5046;
                                        }
                                        int var43 = var13 + (var11.field4936 / 2) + (var11.field4982 * var42 >> 8);
                                        int var44;
                                        if (var11.field5054 <= 0) {
                                            var44 = 256;
                                        } else {
                                            var44 = (var11.field4949 << 8) / var11.field5054;
                                        }
                                        int var45 = (var11.field4959 * var44 >> 8) + var11.field4949 / 2 + var15;
                                        if (class166.field2625) {
                                            if (var11.field5035) {
                                                class166.method1194(var43, var45, var11.field5048, var11.field4939, var42, var44);
                                            } else {
                                                class166.method1167(var43, var45, var42, var44);
                                                class166.method1175((float) var11.field5016, (float) var11.field4939 * 1.5F);
                                            }
                                            class166.method1195();
                                            class166.method1174(true);
                                            class166.method1169(false);
                                            class210.method1470(arg1 ^ 0xFFFFA1F2);
                                            if (class86.field1266) {
                                                class190.method1366();
                                                class166.method1188();
                                                class190.method1369(arg3, arg7, arg0, arg4);
                                                class86.field1266 = false;
                                            }
                                            if (var11.field4983) {
                                                class166.method1184();
                                            }
                                            int var46 = class31.field455[var11.field4889] * var11.field5048 >> 16;
                                            int var47 = class31.field450[var11.field4889] * var11.field5048 >> 16;
                                            if (var11.field4964) {
                                                var32.method121(0, var11.field5009, var11.field4973, var11.field4889, var11.field5007, var11.field4932 + var34 + var47, var11.field4932 + var46);
                                            } else {
                                                var32.method121(0, var11.field5009, 0, var11.field4889, 0, var47, var46);
                                            }
                                            if (var11.field4983) {
                                                class166.method1172();
                                            }
                                        } else {
                                            class31.method211(var43, var45);
                                            int var48 = class31.field455[var11.field4889] * var11.field5048 >> 16;
                                            int var49 = class31.field450[var11.field4889] * var11.field5048 >> 16;
                                            if (!var11.field4964) {
                                                var32.method121(0, var11.field5009, 0, var11.field4889, 0, var49, var48);
                                            } else if (var11.field5035) {
                                                ((class19) var32).method118(0, var11.field5009, var11.field4973, var11.field4889, var11.field5007, var11.field4932 + var34 + var49, var11.field4932 + var48, var11.field5048);
                                            } else {
                                                var32.method121(0, var11.field5009, var11.field4973, var11.field4889, var11.field5007, var49 - (-var34 - var11.field4932), var11.field4932 + var48);
                                            }
                                            class31.method200();
                                        }
                                    }
                                } else {
                                    if (var11.field4951 == 7) {
                                        class253 var50 = var11.method2082(class53.field790, (byte) -112);
                                        if (var50 == null) {
                                            if (class194.field3132) {
                                                class18.method91(28515, var11);
                                            }
                                            continue;
                                        }
                                        int var51 = 0;
                                        for (int var52 = 0; var52 < var11.field4921; var52++) {
                                            for (int var53 = 0; var53 < var11.field5041; var53++) {
                                                if (var11.field5011[var51] > 0) {
                                                    class138 var54 = class130.method918(var11.field5011[var51] - 1, -97);
                                                    class41 var55;
                                                    if (var54.field2122 != 1 && var11.field5023[var51] == 1) {
                                                        var55 = class187.method1346(new class41[] { class78.field1155, var54.field2120, class283.field4600 }, 0);
                                                    } else {
                                                        var55 = class187.method1346(new class41[] { class78.field1155, var54.field2120, class8.field100, class133.method934(-1, var11.field5023[var51]) }, 0);
                                                    }
                                                    int var56 = (var11.field4931 + 12) * var52 + var15;
                                                    int var57 = (var11.field4998 + 115) * var53 + var13;
                                                    if (var11.field5000 == 0) {
                                                        var50.method1788(var55, var57, var56, var11.field4972, var11.field4895 ? 0 : -1);
                                                    } else if (var11.field5000 == 1) {
                                                        var50.method1785(var55, var57 + 57, var56, var11.field4972, var11.field4895 ? 0 : -1);
                                                    } else {
                                                        var50.method1789(var55, var57 + 114, var56, var11.field4972, var11.field4895 ? 0 : -1);
                                                    }
                                                }
                                                var51++;
                                            }
                                        }
                                    }
                                    if (var11.field4951 == 8 && class262.field4163 == var11 && class194.field3126 == class149.field2326) {
                                        int var58 = 0;
                                        int var59 = 0;
                                        class253 var60 = class244.field3898;
                                        class41 var61 = var11.field4969;
                                        class41 var62 = class185.method1342(var61, var11, (byte) 14);
                                        while (var62.method275(false) > 0) {
                                            int var63 = var62.method305(-99, class274.field4466);
                                            class41 var64;
                                            if (var63 == -1) {
                                                var64 = var62;
                                                var62 = class266.field4233;
                                            } else {
                                                var64 = var62.method308(var63, 0, 118);
                                                var62 = var62.method279(var63 + 4, (byte) -42);
                                            }
                                            int var65 = var60.method1794(var64);
                                            if (var65 > var58) {
                                                var58 = var65;
                                            }
                                            var59 += var60.field4043 + 1;
                                        }
                                        var58 += 6;
                                        int var66 = var13 + var11.field4936 - var58 - 5;
                                        int var67 = var11.field4949 + var15 + 5;
                                        var59 += 7;
                                        if (arg4 < (var59 + var67)) {
                                            var67 = arg4 - var59;
                                        }
                                        if (var13 + 5 > var66) {
                                            var66 = var13 + 5;
                                        }
                                        if (arg0 < (var58 + var66)) {
                                            var66 = arg0 - var58;
                                        }
                                        if (class166.field2625) {
                                            class190.method1363(var66, var67, var58, var59, 16777120);
                                            class190.method1361(var66, var67, var58, var59, 0);
                                        } else {
                                            class54.method383(var66, var67, var58, var59, 16777120);
                                            class54.method378(var66, var67, var58, var59, 0);
                                        }
                                        class41 var68 = var11.field4969;
                                        int var69 = var67 - (-var60.field4043 - 2);
                                        class41 var70 = class185.method1342(var68, var11, (byte) 14);
                                        while (var70.method275(false) > 0) {
                                            int var71 = var70.method305(-75, class274.field4466);
                                            class41 var72;
                                            if (var71 == -1) {
                                                var72 = var70;
                                                var70 = class266.field4233;
                                            } else {
                                                var72 = var70.method308(var71, 0, 94);
                                                var70 = var70.method279(var71 + 4, (byte) -41);
                                            }
                                            var60.method1788(var72, var66 + 3, var69, 0, -1);
                                            var69 += var60.field4043 + 1;
                                        }
                                    }
                                    if (var11.field4951 == 9) {
                                        int var73;
                                        int var74;
                                        int var75;
                                        int var76;
                                        if (var11.field4904) {
                                            var74 = var11.field4936 + var13;
                                            var73 = var13;
                                            var76 = var15;
                                            var75 = var11.field4949 + var15;
                                        } else {
                                            var73 = var13;
                                            var74 = var13 + var11.field4936;
                                            var75 = var15;
                                            var76 = var15 + var11.field4949;
                                        }
                                        if (var11.field4907 == 1) {
                                            if (class166.field2625) {
                                                class190.method1364(var73, var75, var74, var76, var11.field4972);
                                            } else {
                                                class54.method387(var73, var75, var74, var76, var11.field4972);
                                            }
                                        } else if (class166.field2625) {
                                            class190.method1359(var73, var75, var74, var76, var11.field4972, var11.field4907);
                                        } else {
                                            class54.method369(var73, var75, var74, var76, var11.field4972, var11.field4907);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(BI)I", line = 1491)
    public final int method685(byte arg0, int arg1) {
        field5073++;
        int var3 = 9 / ((arg0 + 68) / 46);
        return this.field5112[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)Z", line = 1502)
    public final boolean method694(int arg0, int arg1) {
        field5085++;
        if (arg1 != -9737) {
            this.method691(-109, (byte) 4);
        }
        return this.field5097[arg0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Lgm;", line = 1514)
    private final class60 method2103(boolean arg0, int arg1) {
        field5114++;
        class60 var3 = (class60) this.field5078.method554((long) arg1, 19);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field5106.method454(arg1, 0, 0);
        if (var4 == null) {
            return null;
        }
        class112 var5 = new class112(var4);
        if (arg0) {
            class60 var6 = new class60(var5);
            this.field5078.method555((long) arg1, (byte) -120, var6);
            return var6;
        } else {
            return (class60) null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)I", line = 1544)
    public final int method695(int arg0, int arg1) {
        if (arg1 == 255) {
            field5095++;
            return this.field5099[arg0] & 0xFF;
        } else {
            return -14;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILmh;Lmh;Lma;Lmh;)Z", line = 1556)
    public static final boolean method2104(int arg0, class65 arg1, class65 arg2, class152 arg3, class65 arg4) {
        class169.field2698 = arg2;
        class210.field3379 = arg3;
        class224.field3592 = arg1;
        field5092++;
        class169.field2689 = arg4;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLok;I)V", line = 1573)
    public static final void method2105(boolean arg0, class41 arg1, int arg2) {
        field5111++;
        byte var3 = 4;
        if (arg2 != -19861) {
            method2098((byte) -28, -24);
        }
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class244.field3898.method1786(arg1, 250);
        int var7 = class244.field3898.method1807(arg1, 250) * 13;
        if (class166.field2625) {
            class190.method1363(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 0);
            class190.method1361(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 16777215);
        } else {
            class54.method383(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
            class54.method378(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        }
        class244.field3898.method1803(arg1, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class67.method492(false, var5 - var3, -var3 + var4, var3 + var6 + var3, var3 + var3 + var7);
        if (!arg0) {
            class104.method721(var6, -1, var7, var4, var5);
        } else if (class166.field2625) {
            class166.method1181();
        } else {
            try {
                Graphics var8 = class283.field4602.getGraphics();
                class217.field3485.method178(0, 0, var8, (byte) -117);
            } catch (Exception var10) {
                class283.field4602.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)Z", line = 1630)
    public final boolean method683(int arg0, int arg1) {
        if (arg0 == 1) {
            field5113++;
            return this.field5090[arg1];
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)I", line = 1641)
    public final int method691(int arg0, byte arg1) {
        field5089++;
        int var3 = 95 % ((arg1 + 4) / 37);
        return this.field5117[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BI)[I", line = 1651)
    public final int[] method684(byte arg0, int arg1) {
        field5115++;
        class60 var3 = this.method2103(true, arg1);
        if (arg0 == 4) {
            return var3 == null ? null : var3.method431(this.field5098 || this.field5102[arg1], this, this.field5077, 86);
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Z", line = 1668)
    public final boolean method686(int arg0, int arg1) {
        field5088++;
        if (arg0 > -31) {
            return true;
        } else {
            return this.field5098 || this.field5102[arg1];
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lmh;Lmh;Lmh;IZ)V", line = 1839)
    public class305(class65 arg0, class65 arg1, class65 arg2, int arg3, boolean arg4) {
        this.field5077 = arg2;
        this.field5098 = arg4;
        this.field5106 = arg0;
        this.field5091 = arg3;
        this.field5078 = new class75(this.field5091);
        if (class166.field2625) {
            this.field5093 = new class75(this.field5091);
        } else {
            this.field5093 = null;
        }
        class112 var6 = new class112(arg1.method454(0, 0, 0));
        int var7 = var6.method759((byte) -104);
        this.field5105 = new boolean[var7];
        this.field5117 = new byte[var7];
        this.field5112 = new byte[var7];
        this.field5097 = new boolean[var7];
        this.field5103 = new boolean[var7];
        this.field5076 = new byte[var7];
        this.field5090 = new boolean[var7];
        this.field5102 = new boolean[var7];
        this.field5086 = new short[var7];
        this.field5099 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field5105[var8] = var6.method792(2) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field5105[var9]) {
                this.field5103[var9] = var6.method792(2) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field5105[var10]) {
                this.field5097[var10] = var6.method792(2) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field5105[var11]) {
                this.field5102[var11] = var6.method792(2) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field5105[var12]) {
                this.field5090[var12] = var6.method792(2) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field5105[var13]) {
                this.field5099[var13] = var6.method785((byte) -91);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field5105[var14]) {
                this.field5117[var14] = var6.method785((byte) -108);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field5105[var15]) {
                this.field5076[var15] = var6.method785((byte) -125);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field5105[var16]) {
                this.field5112[var16] = var6.method785((byte) -125);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field5105[var17]) {
                this.field5086[var17] = (short) var6.method759((byte) -50);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)Z", line = 1690)
    public final boolean method689(int arg0, byte arg1) {
        field5107++;
        class60 var3 = this.method2103(true, arg0);
        if (var3 == null) {
            return false;
        } else {
            int var4 = 85 / ((13 - arg1) / 56);
            return var3.method429((byte) -68, this.field5077, this);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLbc;IIILtb;I)V", line = 1712)
    public static final void method2106(boolean arg0, class302 arg1, int arg2, int arg3, int arg4, class199 arg5, int arg6) {
        field5087++;
        if (arg5 == null) {
            return;
        }
        int var7 = class8.field101 + class136.field2032 & 0x7FF;
        int var8 = Math.max(arg1.field4936 / 2, arg1.field4949 / 2) + 10;
        int var9 = arg6 * arg6 + (arg4 * arg4);
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class31.field450[var7];
        int var11 = class31.field455[var7];
        int var12 = var10 * 256 / (class136.field2038 + 256);
        if (arg0) {
            return;
        }
        int var13 = var11 * 256 / (class136.field2038 + 256);
        int var14 = arg4 * var12 + arg6 * var13 >> 16;
        int var15 = arg4 * var13 - (arg6 * var12) >> 16;
        if (class166.field2625) {
            ((class17) arg5).method81(arg2 + var14 + (arg1.field4936 / 2) - (arg5.field3201 / 2), arg1.field4949 / 2 + (arg3 - (arg5.field3194 / 2 + var15)), (class17) arg1.method2086(!arg0, false));
        } else {
            ((class72) arg5).method522(arg2 + arg1.field4936 / 2 + var14 - arg5.field3201 / 2, arg1.field4949 / 2 + arg3 + -(arg5.field3194 / 2) - var15, arg1.field4960, arg1.field5038);
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(BI)Z", line = 1768)
    public final boolean method687(byte arg0, int arg1) {
        field5074++;
        return arg0 > -98 ? false : this.field5103[arg1];
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(BI)V", line = 1779)
    public final void method2107(byte arg0, int arg1) {
        if (arg0 != 26) {
            this.method688(-0.74274546F, (byte) 92, -80);
        }
        field5101++;
        this.field5091 = arg1;
        this.field5078 = new class75(this.field5091);
        if (class166.field2625) {
            this.field5093 = new class75(this.field5091);
        } else {
            this.field5093 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)Ljk;", line = 1796)
    private final class81 method2108(int arg0, int arg1) {
        field5075++;
        class81 var3 = (class81) this.field5093.method554((long) arg0, 56);
        if (arg1 <= 94) {
            this.field5102 = (boolean[]) null;
        }
        if (var3 == null) {
            class81 var4 = new class81(this.field5086[arg0] & 0xFFFF);
            this.field5093.method555((long) arg0, (byte) -118, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)V", line = 1822)
    public final void method2109(int arg0, boolean arg1) {
        field5109++;
        if (arg0 >= 61) {
            this.field5098 = arg1;
            this.method2101((byte) -81);
        }
    }
}
