import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class114 extends class7 {

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "Lob;")
    public static class141 field2185 = class175.method1195(40, "<col=ff9040>");

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Lob;")
    private static class141 field2183 = class175.method1195(40, "Password: ");

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "Lob;")
    private static class141 field2192 = class175.method1195(40, "Please use a different world)3");

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "Lob;")
    public static class141 field2189 = class175.method1195(40, "<col=ff3000>");

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Lob;")
    public static class141 field2190 = field2192;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Lob;")
    public static class141 field2178 = field2192;

    @OriginalMember(owner = "client!le", name = "X", descriptor = "Z")
    public static boolean field2180 = false;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "Lob;")
    public static class141 field2177 = field2183;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!le", name = "Y", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Ldg;")
    public static class38 field2176;

    @OriginalMember(owner = "client!le", name = "db", descriptor = "[I")
    public static int[] field2186;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "(I)V")
    public static final void method735(int arg0) {
        if (arg0 == 333485964) {
            ++field2175;
            try {
                if (class41.field808 == 0) {
                    if (class29.field562 != null) {
                        class29.field562.method1089(arg0 ^ -333485966);
                        class29.field562 = null;
                    }
                    class136.field2584 = null;
                    class172.field3410 = 0;
                    class41.field808 = 1;
                    class66.field1278 = false;
                }
                if (~class41.field808 == -2) {
                    if (class136.field2584 == null) {
                        class136.field2584 = class69.field1356.method1259(class50.field978, class164.field3178, -90);
                    }
                    if (~class136.field2584.field1089 == -3) {
                        throw new IOException();
                    }
                    if (~class136.field2584.field1089 == -2) {
                        class29.field562 = new class157((Socket) class136.field2584.field1090, class69.field1356);
                        class41.field808 = 2;
                        class136.field2584 = null;
                    }
                }
                if (~class41.field808 == -3) {
                    long var1 = class169.field3250 = class105.field2027.method926(arg0 ^ 333503170);
                    class7.field120.field2865 = 0;
                    int var3 = (int) (var1 >> 16 & 31L);
                    class7.field120.method997(89, 14);
                    class7.field120.method997(118, var3);
                    class29.field562.method1093(39, class7.field120.field2859, 2, 0);
                    class156.field3014.field2865 = 0;
                    class41.field808 = 3;
                }
                if (class41.field808 == 3) {
                    if (client.field611 != null) {
                        client.field611.method748(0);
                    }
                    if (class125.field2415 != null) {
                        class125.field2415.method748(0);
                    }
                    int var4 = class29.field562.method1090(-120);
                    if (client.field611 != null) {
                        client.field611.method748(0);
                    }
                    if (class125.field2415 != null) {
                        class125.field2415.method748(0);
                    }
                    if (~var4 != -1) {
                        class162.method1131(arg0 + -333485963, var4);
                        return;
                    }
                    class41.field808 = 4;
                    class156.field3014.field2865 = 0;
                }
                if (~class41.field808 == -5) {
                    if (~class156.field3014.field2865 > -9) {
                        int var5 = class29.field562.method1096(0);
                        if (~(8 - class156.field3014.field2865) > ~var5) {
                            var5 = -class156.field3014.field2865 + 8;
                        }
                        if (var5 > 0) {
                            class29.field562.method1094(var5, (byte) 8, class156.field3014.field2859, class156.field3014.field2865);
                            class156.field3014.field2865 += var5;
                        }
                    }
                    if (class156.field3014.field2865 == 8) {
                        class156.field3014.field2865 = 0;
                        class47.field893 = class156.field3014.method977(516491232);
                        class41.field808 = 5;
                    }
                }
                if (~class41.field808 == -6) {
                    class7.field120.field2865 = 0;
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class47.field893 >> 32), (int) class47.field893 };
                    class7.field120.method997(77, 10);
                    class7.field120.method970(var6[0], (byte) 4);
                    class7.field120.method970(var6[1], (byte) 108);
                    class7.field120.method970(var6[2], (byte) -124);
                    class7.field120.method970(var6[3], (byte) 28);
                    class7.field120.method978(-114, class105.field2027.method926(19790));
                    class7.field120.method999(class105.field2021, (byte) -124);
                    class7.field120.method980((byte) 110, class181.field3550, class78.field1574);
                    class214.field4088.field2865 = 0;
                    if (class161.field3132 == 40) {
                        class214.field4088.method997(76, 18);
                    } else {
                        class214.field4088.method997(71, 16);
                    }
                    class214.field4088.method997(arg0 ^ 333486061, class7.field120.field2865 + 125 + class79.method554(97, class86.field1715));
                    class214.field4088.method970(490, (byte) 18);
                    class214.field4088.method997(arg0 ^ 333486025, class8.field128 ? 1 : 0);
                    class216.method1407((byte) -128, class214.field4088);
                    class214.field4088.method999(class86.field1715, (byte) 59);
                    class214.field4088.method970(class160.field3115, (byte) 59);
                    class214.field4088.method970(class24.field452.field2993, (byte) -128);
                    class214.field4088.method970(class177.field3501.field2993, (byte) 75);
                    class214.field4088.method970(class69.field1361.field2993, (byte) 77);
                    class214.field4088.method970(class5.field65.field2993, (byte) -124);
                    class214.field4088.method970(class79.field1612.field2993, (byte) 18);
                    class214.field4088.method970(class125.field2414.field2993, (byte) -127);
                    class214.field4088.method970(class159.field3067.field2993, (byte) 95);
                    class214.field4088.method970(class160.field3118.field2993, (byte) 4);
                    class214.field4088.method970(class109.field2108.field2993, (byte) -128);
                    class214.field4088.method970(class150.field2899.field2993, (byte) -122);
                    class214.field4088.method970(class59.field1146.field2993, (byte) 105);
                    class214.field4088.method970(class164.field3174.field2993, (byte) -23);
                    class214.field4088.method970(class96.field1913.field2993, (byte) -122);
                    class214.field4088.method970(class214.field4078.field2993, (byte) -16);
                    class214.field4088.method970(class158.field3058.field2993, (byte) -116);
                    class214.field4088.method970(class221.field4178.field2993, (byte) 107);
                    class214.field4088.method970(class73.field1450.field2993, (byte) -116);
                    class214.field4088.method970(class185.field3601.field2993, (byte) -9);
                    class214.field4088.method970(class108.field2083.field2993, (byte) 8);
                    class214.field4088.method970(class143.field2760.field2993, (byte) -124);
                    class214.field4088.method970(class124.field2393.field2993, (byte) -126);
                    class214.field4088.method970(class77.field1564.field2993, (byte) 80);
                    class214.field4088.method970(class152.field2918.field2993, (byte) -123);
                    class214.field4088.method987(class7.field120.field2865, class7.field120.field2859, 2, 0);
                    class29.field562.method1093(39, class214.field4088.field2859, class214.field4088.field2865, 0);
                    class7.field120.method40(var6, arg0 + -333489161);
                    for (int var7 = 0; ~var7 > -5; ++var7) {
                        var6[var7] += 50;
                    }
                    class156.field3014.method40(var6, -3197);
                    class41.field808 = 6;
                }
                if (~class41.field808 == -7 && ~class29.field562.method1096(0) < -1) {
                    int var8 = class29.field562.method1090(-120);
                    if (var8 == 21 && class161.field3132 == 20) {
                        class41.field808 = 7;
                    } else if (var8 != 2) {
                        if (var8 == 15 && class161.field3132 == 40) {
                            class90.method621((byte) 0);
                            return;
                        }
                        if (var8 != 23 || class26.field481 >= 1) {
                            class162.method1131(1, var8);
                            return;
                        }
                        class41.field808 = 0;
                        ++class26.field481;
                    } else {
                        class41.field808 = 9;
                    }
                }
                if (class41.field808 == 7 && ~class29.field562.method1096(0) < -1) {
                    class21.field348 = 60 * (3 + class29.field562.method1090(arg0 ^ 333485958));
                    class41.field808 = 8;
                }
                if (class41.field808 == 8) {
                    class172.field3410 = 0;
                    class21.method127(class220.method1422(new class141[] { class78.method543((byte) 93, class21.field348 / 60), class8.field131 }, arg0 + -333485967), class53.field1013, class172.field3415, (byte) -70);
                    if (~(--class21.field348) >= -1) {
                        class41.field808 = 0;
                    }
                } else {
                    if (class41.field808 == 9 && class29.field562.method1096(0) >= 9) {
                        class2.field20 = class29.field562.method1090(arg0 + -333486084);
                        class27.field519 = class29.field562.method1090(-121);
                        class185.field3606 = class29.field562.method1090(arg0 ^ 333486050) == 1;
                        class97.field1916 = class29.field562.method1090(-126);
                        class97.field1916 <<= 8;
                        class97.field1916 += class29.field562.method1090(arg0 + -333486087);
                        class129.field2455 = class29.field562.method1090(-28);
                        class29.field562.method1094(1, (byte) 96, class156.field3014.field2859, 0);
                        class156.field3014.field2865 = 0;
                        class66.field1286 = class156.field3014.method39(255);
                        class29.field562.method1094(2, (byte) -126, class156.field3014.field2859, 0);
                        class156.field3014.field2865 = 0;
                        class187.field3632 = class156.field3014.method1007(34);
                        class41.field808 = 10;
                    }
                    if (class41.field808 == 10) {
                        if (~class29.field562.method1096(arg0 ^ 333485964) <= ~class187.field3632) {
                            class156.field3014.field2865 = 0;
                            class29.field562.method1094(class187.field3632, (byte) -126, class156.field3014.field2859, 0);
                            class41.method267(0);
                            class30.field570 = -1;
                            class60.method405(false, (byte) -41);
                            class66.field1286 = -1;
                        }
                    } else {
                        ++class172.field3410;
                        if (~class172.field3410 < -2001) {
                            if (~class26.field481 > -2) {
                                ++class26.field481;
                                class41.field808 = 0;
                                if (~class69.field1354 != ~class164.field3178) {
                                    class164.field3178 = class69.field1354;
                                } else {
                                    class164.field3178 = class169.field3251;
                                }
                            } else {
                                class162.method1131(1, -3);
                            }
                        }
                    }
                }
            } catch (IOException var9) {
                if (class26.field481 < 1) {
                    ++class26.field481;
                    class41.field808 = 0;
                    if (~class69.field1354 == ~class164.field3178) {
                        class164.field3178 = class169.field3251;
                    } else {
                        class164.field3178 = class69.field1354;
                    }
                } else {
                    class162.method1131(1, -2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class114() {
        super(3, false);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field2187;
        if (arg0 == 0) {
            super.field99 = arg2.method991(255) == 1;
        }
        int var4 = 123 / ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IB)[[I")
    public final int[][] method51(int arg0, byte arg1) {
        ++field2174;
        int var3 = -69 % ((-42 - arg1) / 41);
        int[][] var4 = super.field97.method1396(arg0, (byte) 45);
        if (super.field97.field4093) {
            int[] var5 = this.method52(arg0, 2, 59);
            int[][] var6 = this.method42(arg0, -93, 0);
            int[][] var7 = this.method42(arg0, -36, 1);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[1];
            int[] var15 = var7[2];
            int[] var16 = var7[0];
            for (int var17 = 0; var17 < class117.field2272; ++var17) {
                int var18 = var5[var17];
                if (~var18 == -4097) {
                    var8[var17] = var11[var17];
                    var9[var17] = var12[var17];
                    var10[var17] = var13[var17];
                } else if (var18 == 0) {
                    var8[var17] = var16[var17];
                    var9[var17] = var14[var17];
                    var10[var17] = var15[var17];
                } else {
                    int var19 = -var18 + 4096;
                    var8[var17] = var11[var17] * var18 + var16[var17] * var19 >> 12;
                    var9[var17] = var12[var17] * var18 + var14[var17] * var19 >> 12;
                    var10[var17] = var13[var17] * var18 - -(var15[var17] * var19) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)Lce;")
    public static final class26 method736(int arg0, int arg1) {
        ++field2179;
        class26 var2 = (class26) class135.field2572.method1383((long) arg1, (byte) 92);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class10.field210.method1065((byte) -117, class53.method358(arg1, arg0 ^ 15740), class173.method1189(arg1, (byte) 104));
            class26 var4 = new class26();
            if (var3 != null) {
                var4.method179(arg0 + -15619, new class146(var3));
            }
            var4.method183(99);
            class135.field2572.method1378(var4, (byte) -27, (long) arg1);
            if (arg0 != 15619) {
                field2190 = null;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!le", name = "j", descriptor = "(I)V")
    public static final void method737(int arg0) {
        int var1 = class166.field3211 + field2176.field3889;
        if (class60.field1177[96]) {
            class3.field31 += (-class3.field31 + -24) / 2;
        } else if (class60.field1177[97]) {
            class3.field31 += (-class3.field31 + 24) / 2;
        } else {
            class3.field31 /= 2;
        }
        class214.field4084 = class3.field31 / 2 + class214.field4084 & arg0;
        if (class60.field1177[98]) {
            class209.field3975 += (12 - class209.field3975) / 2;
        } else if (class60.field1177[99]) {
            class209.field3975 += (-class209.field3975 + -12) / 2;
        } else {
            class209.field3975 /= 2;
        }
        ++field2191;
        int var2 = class1.field1 + field2176.field3854;
        if (~(-var1 + class100.field1955) > 499 || ~(-var1 + class100.field1955) < -501 || ~(class224.field4226 - var2) > 499 || -var2 + class224.field4226 > 500) {
            class100.field1955 = var1;
            class224.field4226 = var2;
        }
        class154.field2996 += class209.field3975 / 2;
        if (class154.field2996 < 128) {
            class154.field2996 = 128;
        }
        if (class100.field1955 != var1) {
            class100.field1955 += (-class100.field1955 + var1) / 16;
        }
        int var3 = class100.field1955 >> 7;
        if (~class154.field2996 < -384) {
            class154.field2996 = 383;
        }
        int var4 = 0;
        if (class224.field4226 != var2) {
            class224.field4226 += (-class224.field4226 + var2) / 16;
        }
        int var5 = class224.field4226 >> 7;
        int var6 = class206.method1360(class66.field1287, class100.field1955, (byte) 40, class224.field4226);
        if (~var3 < -4 && var5 > 3 && ~var3 > -101 && var5 < 100) {
            for (int var7 = var3 + -4; var3 - -4 >= var7; ++var7) {
                for (int var8 = var5 + -4; ~var8 >= ~(var5 - -4); ++var8) {
                    int var9 = class66.field1287;
                    if (~var9 > -4 && ~(class164.field3177[1][var7][var8] & 2) == -3) {
                        ++var9;
                    }
                    int var10 = var6 - class31.field617[var9][var7][var8];
                    if (~var10 < ~var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (~var11 < -98049) {
            var11 = 98048;
        }
        if (~var11 > -32769) {
            var11 = 32768;
        }
        if (~class58.field1132 <= ~var11) {
            if (class58.field1132 > var11) {
                class58.field1132 += (-class58.field1132 + var11) / 80;
                return;
            }
        } else {
            class58.field1132 += (-class58.field1132 + var11) / 24;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 <= 13) {
            field2176 = null;
        }
        ++field2182;
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 47);
            int[] var5 = this.method52(arg1, 1, 69);
            int[] var6 = this.method52(arg1, 2, 66);
            for (int var7 = 0; class117.field2272 > var7; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 == -1) {
                        var3[var7] = var5[var7];
                    } else {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!le", name = "k", descriptor = "(I)V")
    public static void method738(int arg0) {
        field2176 = null;
        field2189 = null;
        field2192 = null;
        field2185 = null;
        field2177 = null;
        field2190 = null;
        field2178 = null;
        if (arg0 != 0) {
            field2184 = 56;
        }
        field2186 = null;
        field2183 = null;
    }
}
