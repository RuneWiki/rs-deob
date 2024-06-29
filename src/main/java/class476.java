import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class476 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    private int field6624;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    private int field6633;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "[[I")
    private int[][] field6630;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "Lst;")
    public static class335 field6626 = new class335(30, 3);

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field6634 = 328;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field6632 = 0;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lkr;")
    public static class602 field6631 = new class602(40, 2);

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "F")
    public static float field6635;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B[B)[B", line = 3)
    public final byte[] method2897(byte arg0, byte[] arg1) {
        if (arg0 >= -95) {
            field6635 = -0.7638491F;
        }
        field6623++;
        if (this.field6630 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6624 / (long) this.field6633) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field6630[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field6624 + var6;
                int var14 = var13 / this.field6633;
                var5 += var14;
                var6 = var13 - this.field6633 * var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B[S)[S", line = 75)
    public final short[] method2898(byte arg0, short[] arg1) {
        if (this.field6630 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field6624 / (long) this.field6633) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                short var10 = arg1[var7];
                int[] var11 = this.field6630[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10 >> 2;
                }
                int var13 = this.field6624 + var6;
                int var14 = var13 / this.field6633;
                var5 += var14;
                var6 = var13 - this.field6633 * var14;
            }
            arg1 = new short[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 8192 >> 14;
                if (var9 < -32768) {
                    arg1[var8] = -32768;
                } else if (var9 <= 32767) {
                    arg1[var8] = (short) var9;
                } else {
                    arg1[var8] = 32767;
                }
            }
        }
        field6628++;
        if (arg0 < 91) {
            method2904(null, null, null, null, -56, -73, 19);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(III)V", line = 143)
    public static final void method2899(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class537.method3176(var3.field3845);
        class537.method3176(var3.field3842);
        if (var3.field3845 != null) {
            var3.field3845 = null;
        }
        if (var3.field3842 != null) {
            var3.field3842 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)I", line = 162)
    public final int method2900(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method2897((byte) -80, null);
        }
        if (this.field6630 != null) {
            arg0 = (int) ((long) this.field6624 * (long) arg0 / (long) this.field6633);
        }
        field6627++;
        return arg0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 178)
    public static void method2901(byte arg0) {
        if (arg0 <= 65) {
            field6634 = -48;
        }
        field6631 = null;
        field6626 = null;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)I", line = 190)
    public final int method2902(int arg0, int arg1) {
        if (arg1 != 0) {
            method2899(-100, -6, 125);
        }
        if (this.field6630 != null) {
            arg0 = (int) ((long) this.field6624 * (long) arg0 / (long) this.field6633) + 6;
        }
        field6625++;
        return arg0;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V", line = 205)
    public static final void method2903(boolean arg0) {
        if (arg0) {
            method2903(false);
        }
        field6629++;
        if (class538.field7453 == 0 || class538.field7453 == 5) {
            return;
        }
        try {
            short var1;
            if (class384.field5511 == 0) {
                var1 = 250;
            } else {
                var1 = 2000;
            }
            if ((++class32.field433) > var1) {
                if (class713.field9960 != null) {
                    class713.field9960.method2226((byte) -44);
                    class713.field9960 = null;
                }
                if (class384.field5511 >= 3) {
                    class538.field7453 = 0;
                    class97.method663(-5, -2);
                    return;
                }
                if (class73.field1096 == 2) {
                    class416.field5882.method2852(443);
                } else {
                    class117.field1545.method2852(443);
                }
                class538.field7453 = 1;
                class32.field433 = 0;
                class384.field5511++;
            }
            if (class538.field7453 == 1) {
                if (class73.field1096 == 2) {
                    class424.field5952 = class416.field5882.method2854(class159.field2227, 443);
                } else {
                    class424.field5952 = class117.field1545.method2854(class159.field2227, 443);
                }
                class538.field7453 = 2;
            }
            if (class538.field7453 == 2) {
                if (class424.field5952.field3633 == 2) {
                    throw new IOException();
                }
                if (class424.field5952.field3633 != 1) {
                    return;
                }
                class713.field9960 = class394.method2464((Socket) class424.field5952.field3638, arg0, 7500);
                class424.field5952 = null;
                class736.method4101(-99);
                class583 var2 = class385.method2413(0);
                var2.field7963.method444(class62.field893.field3032, 128);
                class463.method2838(var2, (byte) 121);
                class48.method348(-20161);
                class538.field7453 = 3;
            }
            if (class538.field7453 == 3) {
                if (!class713.field9960.method2223((byte) -92, 1)) {
                    return;
                }
                class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                int var3 = class352.field5071.field954[0] & 0xFF;
                if (var3 != 0) {
                    class538.field7453 = 0;
                    class97.method663(var3, -2);
                    class713.field9960.method2226((byte) 74);
                    class713.field9960 = null;
                    class338.method2152((byte) -66);
                    return;
                }
                class352.field5071.field956 = 0;
                class63 var4 = new class63(518);
                int[] var5 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                var4.method444(10, 128);
                var4.method473(-128, var5[0]);
                var4.method473(43, var5[1]);
                var4.method473(-125, var5[2]);
                var4.method473(-128, var5[3]);
                var4.method451(0L, (byte) 113);
                var4.method510(class605.field8178, (byte) 61);
                var4.method451(class152.field2102, (byte) 113);
                var4.method451(class467.field6491, (byte) 113);
                var4.method454(74, class99.field1382, class613.field8243);
                class736.method4101(-44);
                class583 var6 = class385.method2413(0);
                class409 var7 = var6.field7963;
                if (class73.field1096 == 2) {
                    if (class102.field1401 == 13) {
                        var7.method444(class62.field910.field3032, 128);
                    } else {
                        var7.method444(class62.field907.field3032, 128);
                    }
                    var7.method492(-2, 0);
                    int var10 = var7.field956;
                    var7.method473(72, 641);
                    var7.method497(var4.field954, var4.field956, 0, -1);
                    int var11 = var7.field956;
                    var7.method510(class707.field9849, (byte) 61);
                    var7.method444(class336.field4726, 128);
                    var7.method444(class710.method3997(3), 128);
                    var7.method492(-2, class118.field1561);
                    var7.method492(-2, class553.field7716);
                    var7.method444(class332.field4707.field4773.method2791(0), 128);
                    class255.method1735(true, var7);
                    var7.method510(class237.field3514, (byte) 61);
                    var7.method473(-127, class593.field8043);
                    class63 var12 = class332.field4707.method2155(13302);
                    var7.method444(var12.field956, 128);
                    var7.method497(var12.field954, var12.field956, 0, -1);
                    class726.field10056 = true;
                    class63 var13 = new class63(class372.field5248.method3408((byte) 102));
                    class372.field5248.method3410(var13, (byte) 88);
                    var7.method497(var13.field954, var13.field954.length, 0, -1);
                    var7.method492(-2, class728.field10110);
                    var7.method451(class350.field4971, (byte) 113);
                    var7.method444(class334.field4715 == null ? 0 : 1, 128);
                    if (class334.field4715 != null) {
                        var7.method510(class334.field4715, (byte) 61);
                    }
                    var7.method444(class751.method4169(true, "jagtheora") ? 1 : 0, 128);
                    var7.method444(class258.field3740 ? 1 : 0, 128);
                    class72.method556(var7, -100);
                    var7.method448(var7.field956, var5, var11, 32);
                    var7.method501(!arg0, var7.field956 - var10);
                } else {
                    var7.method444(class62.field911.field3032, 128);
                    var7.method492(-2, 0);
                    int var8 = var7.field956;
                    var7.method473(125, 641);
                    var7.method497(var4.field954, var4.field956, 0, -1);
                    int var9 = var7.field956;
                    var7.method510(class707.field9849, (byte) 61);
                    var7.method444(class289.field4140.field7713, 128);
                    var7.method444(class120.field1576, 128);
                    class255.method1735(true, var7);
                    var7.method510(class237.field3514, (byte) 61);
                    var7.method473(-127, class593.field8043);
                    class72.method556(var7, -128);
                    var7.method448(var7.field956, var5, var9, 32);
                    var7.method501(true, var7.field956 - var8);
                }
                class463.method2838(var6, (byte) 119);
                class48.method348(-20161);
                class213.field2800 = new class312(var5);
                for (int var14 = 0; var14 < 4; var14++) {
                    var5[var14] += 50;
                }
                class352.field5071.method2561(8, var5);
                class538.field7453 = 4;
            }
            if (class538.field7453 == 4) {
                if (!class713.field9960.method2223((byte) -116, 1)) {
                    return;
                }
                class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                int var15 = class352.field5071.field954[0] & 0xFF;
                if (var15 == 21) {
                    class538.field7453 = 7;
                } else if (var15 == 29) {
                    class538.field7453 = 13;
                } else if (var15 == 1) {
                    class538.field7453 = 5;
                    class97.method663(var15, -2);
                    return;
                } else if (var15 == 2) {
                    class538.field7453 = 8;
                } else if (var15 == 15) {
                    class357.field5125 = -2;
                    class538.field7453 = 14;
                } else if (var15 == 23 && class384.field5511 < 3) {
                    class384.field5511++;
                    class32.field433 = 0;
                    class538.field7453 = 1;
                    class713.field9960.method2226((byte) 78);
                    class713.field9960 = null;
                    return;
                } else {
                    class538.field7453 = 0;
                    class97.method663(var15, -2);
                    class713.field9960.method2226((byte) 54);
                    class713.field9960 = null;
                    class338.method2152((byte) -66);
                    return;
                }
            }
            if (class538.field7453 == 6) {
                class736.method4101(-99);
                class583 var16 = class385.method2413(0);
                class409 var17 = var16.field7963;
                var17.method2568(class213.field2800, (byte) 125);
                var17.method2570(class62.field915.field3032, (byte) -66);
                class463.method2838(var16, (byte) 121);
                class48.method348(-20161);
                class538.field7453 = 4;
            } else if (class538.field7453 == 7) {
                if (class713.field9960.method2223((byte) -97, 1)) {
                    class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                    int var18 = class352.field5071.field954[0] & 0xFF;
                    class175.field2408 = var18 * 50;
                    class538.field7453 = 0;
                    class97.method663(21, -2);
                    class713.field9960.method2226((byte) 105);
                    class713.field9960 = null;
                    class338.method2152((byte) -66);
                }
            } else if (class538.field7453 == 13) {
                if (class713.field9960.method2223((byte) -115, 1)) {
                    class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                    class700.field9770 = class352.field5071.field954[0] & 0xFF;
                    class538.field7453 = 0;
                    class97.method663(29, -2);
                    class713.field9960.method2226((byte) -126);
                    class713.field9960 = null;
                    class338.method2152((byte) -66);
                }
            } else if (class538.field7453 != 8) {
                if (class538.field7453 == 9) {
                    class409 var19 = class352.field5071;
                    if (class73.field1096 == 2) {
                        if (!class713.field9960.method2223((byte) -125, class455.field6300)) {
                            return;
                        }
                        class713.field9960.method2227(var19.field954, class455.field6300, 0, (byte) 23);
                        var19.field956 = 0;
                        class290.field4163 = var19.method505((byte) -119);
                        class263.field3854 = var19.method505((byte) -119);
                        class214.field2807 = var19.method505((byte) -119) == 1;
                        class571.field7897 = var19.method505((byte) -119) == 1;
                        class360.field5160 = var19.method505((byte) -119) == 1;
                        class464.field6463 = var19.method505((byte) -119) == 1;
                        class145.field2037 = var19.method482(-772591672);
                        class630.field8463 = var19.method505((byte) -119) == 1;
                        class134.field1911 = var19.method468(16711680);
                        class560.field7795 = var19.method505((byte) -119) == 1;
                        class20.field192.method714(class560.field7795, (byte) -15);
                        class291.field4179.method1309((byte) -67, class560.field7795);
                        class525.field7291.method149(false, class560.field7795);
                    } else if (class713.field9960.method2223((byte) -106, class455.field6300)) {
                        class713.field9960.method2227(var19.field954, class455.field6300, 0, (byte) 23);
                        var19.field956 = 0;
                        class290.field4163 = var19.method505((byte) -119);
                        class263.field3854 = var19.method505((byte) -119);
                        class214.field2807 = var19.method505((byte) -119) == 1;
                        class571.field7897 = var19.method505((byte) -119) == 1;
                        class360.field5160 = var19.method505((byte) -119) == 1;
                        class337.field4739 = var19.method475(880459872);
                        int var20 = var19.method505((byte) -119);
                        class630.field8463 = (var20 & 0x1) != 0;
                        class435.field6063 = (var20 & 0x2) != 0;
                        class548.field7619 = var19.method457(-14532);
                        class372.field5249 = var19.method482(-772591672);
                        class700.field9767 = var19.method482(-772591672);
                        class32.field435 = var19.method482(-772591672);
                        class726.field10057 = var19.method457(-14532);
                        class596.field8095 = class159.field2227.method856(3, class726.field10057);
                        class534.field7408 = var19.method505((byte) -119);
                        class697.field9742 = var19.method482(-772591672);
                        class289.field4131 = var19.method482(-772591672);
                        class265.field3893 = var19.method505((byte) -119) == 1;
                        class388.field5601.field1313 = class388.field5601.field1347 = class39.field488 = var19.method477(true);
                        class524.field7282 = var19.method505((byte) -119);
                        class731.field10161 = var19.method457(-14532);
                        class142.field2018 = var19.method505((byte) -119) == 1;
                        class639.field8572 = new class467();
                        class639.field8572.field6484 = var19.method482(-772591672);
                        if (class639.field8572.field6484 == 65535) {
                            class639.field8572.field6484 = -1;
                        }
                        class639.field8572.field6485 = var19.method477(true);
                        if (class341.field4815 != class172.field2390) {
                            class639.field8572.field6483 = class639.field8572.field6484 + 50000;
                            class639.field8572.field6489 = class639.field8572.field6484 + 40000;
                        }
                        if (class172.field2390 != class164.field2263 && (class416.field5882.method2851(class266.field3901, (byte) -85) || class416.field5882.method2851(class652.field8734, (byte) -123))) {
                            class350.method2233(5121);
                        }
                    } else {
                        return;
                    }
                    if ((!class214.field2807 || class360.field5160) && !class630.field8463) {
                        try {
                            class69.method540("unzap", class320.field4445, -128);
                        } catch (Throwable var25) {
                        }
                    } else {
                        try {
                            class69.method540("zap", class320.field4445, -128);
                        } catch (Throwable var27) {
                            if (class657.field8766) {
                                try {
                                    class320.field4445.getAppletContext().showDocument(new URL(class320.field4445.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var26) {
                                }
                            }
                        }
                    }
                    if (class341.field4815 == class172.field2390) {
                        try {
                            class69.method540("loggedin", class320.field4445, -128);
                        } catch (Throwable var24) {
                        }
                    }
                    if (class73.field1096 != 2) {
                        class538.field7453 = 0;
                        class97.method663(2, -2);
                        class24.method133(255);
                        class647.method3624(7, !arg0);
                        class400.field5735 = null;
                        return;
                    }
                    class538.field7453 = 11;
                }
                if (class538.field7453 == 11) {
                    if (!class713.field9960.method2223((byte) -86, 3)) {
                        return;
                    }
                    class713.field9960.method2227(class352.field5071.field954, 3, 0, (byte) 23);
                    class538.field7453 = 12;
                }
                if (class538.field7453 == 12) {
                    class409 var21 = class352.field5071;
                    var21.field956 = 0;
                    if (var21.method2559((byte) -36)) {
                        if (!class713.field9960.method2223((byte) -107, 1)) {
                            return;
                        }
                        class713.field9960.method2227(var21.field954, 1, 3, (byte) 23);
                    }
                    class400.field5735 = class22.method119(16864)[var21.method2569((byte) 117)];
                    class357.field5125 = var21.method482(-772591672);
                    class538.field7453 = 10;
                }
                if (class538.field7453 == 10) {
                    if (class713.field9960.method2223((byte) -75, class357.field5125)) {
                        class713.field9960.method2227(class352.field5071.field954, class357.field5125, 0, (byte) 23);
                        class352.field5071.field956 = 0;
                        int var22 = class357.field5125;
                        class538.field7453 = 0;
                        class97.method663(2, -2);
                        class279.method1867(84);
                        class264.method1805(0, class352.field5071);
                        class338.field4749 = -1;
                        if (class665.field9170 == class400.field5735) {
                            class100.method673(97);
                        } else {
                            class652.method3645((byte) -99);
                        }
                        if (class352.field5071.field956 != var22) {
                            throw new RuntimeException("lswp pos:" + class352.field5071.field956 + " psize:" + var22);
                        }
                        class400.field5735 = null;
                    }
                } else if (class538.field7453 == 14) {
                    if (class357.field5125 == -2) {
                        if (!class713.field9960.method2223((byte) -91, 2)) {
                            return;
                        }
                        class713.field9960.method2227(class352.field5071.field954, 2, 0, (byte) 23);
                        class352.field5071.field956 = 0;
                        class357.field5125 = class352.field5071.method482(-772591672);
                    }
                    if (class713.field9960.method2223((byte) -124, class357.field5125)) {
                        class713.field9960.method2227(class352.field5071.field954, class357.field5125, 0, (byte) 23);
                        class352.field5071.field956 = 0;
                        int var23 = class357.field5125;
                        class538.field7453 = 0;
                        class97.method663(15, -2);
                        class439.method2702(true);
                        class264.method1805(0, class352.field5071);
                        if (class352.field5071.field956 != var23) {
                            throw new RuntimeException("lswpr pos:" + class352.field5071.field956 + " psize:" + var23);
                        }
                        class400.field5735 = null;
                    }
                }
            } else if (class713.field9960.method2223((byte) -93, 1)) {
                class713.field9960.method2227(class352.field5071.field954, 1, 0, (byte) 23);
                class538.field7453 = 9;
                class455.field6300 = class352.field5071.field954[0] & 0xFF;
            }
        } catch (IOException var28) {
            if (class713.field9960 != null) {
                class713.field9960.method2226((byte) -124);
                class713.field9960 = null;
            }
            if (class384.field5511 < 3) {
                if (class73.field1096 == 2) {
                    class416.field5882.method2852(443);
                } else {
                    class117.field1545.method2852(443);
                }
                class32.field433 = 0;
                class538.field7453 = 1;
                class384.field5511++;
            } else {
                class538.field7453 = 0;
                class97.method663(-4, -2);
                class338.method2152((byte) -66);
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", line = 795)
    public static final void method2904(String arg0, String arg1, String arg2, String arg3, int arg4, int arg5, int arg6) {
        field6622++;
        class192.method1196(arg1, arg4, arg6, arg5 ^ 0xFFFFFF9C, arg5, arg0, arg3, arg2, null);
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V", line = 811)
    public class476(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class504.method3035(29429, arg0, arg1);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field6624 = var5;
            this.field6633 = var4;
            this.field6630 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field6630[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
