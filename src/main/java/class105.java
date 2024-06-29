import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class105 {

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    private int field1398 = 32;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "Z")
    private boolean field1400 = false;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "J")
    private long field1411 = class43.method364(-16756);

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "J")
    private long field1415 = 0L;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    private int field1416 = 0;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "Z")
    private boolean field1414 = true;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    private int field1412 = 0;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
    private int field1420 = 0;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "[Lar;")
    private class50[] field1419 = new class50[8];

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "J")
    private long field1418 = 0L;

    @OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
    private int field1423 = 0;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "[Lar;")
    private class50[] field1422 = new class50[8];

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lkg;")
    public static class223 field1391 = null;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field1392;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
    public int field1413;

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
    public int field1421;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "Lar;")
    private class50 field1402;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "[I")
    public int[] field1410;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public void method740() throws Exception {
        field1404++;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
    public void method741() {
        field1392++;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
    public int method742() throws Exception {
        field1393++;
        return this.field1421;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    private final void method743(int arg0, int arg1) {
        this.field1412 -= arg1;
        field1408++;
        if (this.field1412 < 0) {
            this.field1412 = 0;
        }
        if (arg0 != 1) {
            this.field1410 = null;
        }
        if (this.field1402 != null) {
            this.field1402.method286(arg1);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lar;I)V")
    public final synchronized void method744(class50 arg0, int arg1) {
        if (arg1 != 127) {
            method746((byte) 78, (class104) null, true, -63, (class104) null);
        }
        this.field1402 = arg0;
        field1395++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLfp;II)V")
    public static final void method745(byte arg0, class9 arg1, int arg2, int arg3) {
        field1394++;
        if (arg2 < 0 || arg3 < 0 || class200.field2832 == 0 || class26.field360 == 0) {
            return;
        }
        arg1.method101(class464.field6841, class177.field2452, class200.field2832, class26.field360);
        arg1.method77(class363.field5259, class319.field4707, class200.field2832, class26.field360);
        class187 var4 = arg1.method84();
        var4.method822(class160.field2137, class383.field5617, class344.field5058, class459.field6801, class131.field1791, class252.field3708);
        arg1.method107(var4);
        if (class28.field401 != null) {
            int var5 = -1;
            int var6 = -1;
            int var7 = arg1.method104();
            int var8 = (arg2 - class464.field6841) * var7 / class200.field2832;
            int var9 = (arg3 - class177.field2452) * var7 / class26.field360;
            int var10 = arg1.method80();
            int var11 = (arg2 - class464.field6841) * var10 / class200.field2832;
            int var12 = (arg3 - class177.field2452) * var10 / class26.field360;
            int[] var13 = new int[] { var8, var9, var7 };
            var4.method825(var13);
            int[] var14 = new int[] { var11, var12, var10 };
            var4.method825(var14);
            float var15 = 0.0F;
            int var16 = var14[0] - var13[0];
            int var17 = var14[1] - var13[1];
            int var18 = var14[2] - var13[2];
            while (var15 < 1.0F) {
                int var19 = (int) ((float) var16 * var15 + (float) var13[0]);
                int var20 = var19 >> 7;
                int var21 = (int) ((float) var18 * var15 + (float) var13[2]);
                int var22 = var21 >> 7;
                if (var20 > 0 && var22 > 0 && var20 < class195.field2745 && class78.field984 > var22) {
                    int var23 = class187.field2619.field4960;
                    if (var23 < 3 && (class131.field1790[1][var20][var22] & 0x2) != 0) {
                        var23++;
                    }
                    if ((float) class28.field401[var23].method1427(var19, var21) < (float) var17 * var15 + (float) var13[1]) {
                        var5 = var19 + (class187.field2619.method446(10) * 64) - 64 >> 7;
                        var6 = var21 + ((class187.field2619.method446(10) - 1) * 64) >> 7;
                        break;
                    }
                }
                var15 = (float) ((double) var15 + 0.01D);
            }
            if (var5 != -1 && var6 != -1) {
                if (class147.field1993 && (class433.field6315 & 0x40) != 0) {
                    class223 var24 = class99.method654(-1, class243.field3605, class74.field949);
                    if (var24 == null) {
                        class25.method257(89);
                    } else {
                        class463.method2862(class90.field1107, var6, false, true, class253.field3723, 0L, " ->", (byte) -106, 45, var5);
                    }
                } else {
                    if (class408.field5869 == class166.field2191) {
                        class463.method2862(-1, var6, false, true, class385.field5637.method2543(false, class153.field2073), 0L, "", (byte) -117, 49, var5);
                    }
                    class463.method2862(-1, var6, false, true, class155.field2087, 0L, "", (byte) -93, 18, var5);
                    class231.field3480++;
                }
            }
        }
        class304 var25 = class456.field6749;
        for (class241 var26 = (class241) var25.method2026(100); var26 != null; var26 = (class241) var25.method2022(10)) {
            if (class187.field2619.field4960 == var26.field3576 && var26.method1623(arg1, (byte) 29, arg3, arg2)) {
                if (var26.field3573 instanceof class380) {
                    class380 var27 = (class380) var26.field3573;
                    int var28 = var27.method446(10);
                    if ((var28 & 0x1) == 0 && (var27.field4954 & 0x7F) == 0 && (var27.field4951 & 0x7F) == 0 || (var28 & 0x1) == 1 && (var27.field4954 & 0x7F) == 64 && (var27.field4951 & 0x7F) == 64) {
                        int var29 = var27.field4954 + 64 - (var27.method446(10) * 64);
                        int var30 = var27.field4951 - (var27.method446(10) * 64 - 64);
                        for (int var31 = 0; var31 < class14.field231; var31++) {
                            class26 var38 = class364.field5260[class301.field4380[var31]];
                            if (var38 != null && class388.field5665 != var38.field730 && var38.field771) {
                                int var39 = var38.field4954 - ((var38.field369.field4819 - 1) * 64);
                                int var40 = var38.field4951 - (var38.field369.field4819 - 1) * 64;
                                if (var39 >= var29 && var38.field369.field4819 <= var27.method446(10) - (var39 - var29 >> 7) && var40 >= var30 && var38.field369.field4819 <= (var27.method446(10) - (var40 - var30 >> 7))) {
                                    class92.method623(class187.field2619.field4960 != var26.field3576, var38, true);
                                    var38.field730 = class388.field5665;
                                }
                            }
                        }
                        int var32 = class208.field2933;
                        int[] var33 = class88.field1085;
                        for (int var34 = 0; var34 < var32; var34++) {
                            class380 var35 = class455.field6731[var33[var34]];
                            if (var35 != null && class388.field5665 != var35.field730 && var27 != var35 && var35.field771) {
                                int var36 = var35.field4954 - (var35.method446(10) - 1) * 64;
                                int var37 = var35.field4951 + 64 - (var35.method446(10) * 64);
                                if (var29 <= var36 && var35.method446(10) <= (var27.method446(10) - (var36 - var29 >> 7)) && var37 >= var30 && var35.method446(10) <= var27.method446(10) - (var37 - var30 >> 7)) {
                                    class157.method1062(class187.field2619.field4960 != var26.field3576, var35, 122);
                                    var35.field730 = class388.field5665;
                                }
                            }
                        }
                    }
                    if (class388.field5665 == var27.field730) {
                        continue;
                    }
                    class157.method1062(class187.field2619.field4960 != var26.field3576, var27, 126);
                    var27.field730 = class388.field5665;
                }
                if (var26.field3573 instanceof class26) {
                    class26 var41 = (class26) var26.field3573;
                    if (var41.field369 != null) {
                        if ((var41.field369.field4819 & 0x1) == 0 && (var41.field4954 & 0x7F) == 0 && (var41.field4951 & 0x7F) == 0 || (var41.field369.field4819 & 0x1) == 1 && (var41.field4954 & 0x7F) == 64 && (var41.field4951 & 0x7F) == 64) {
                            int var42 = var41.field4954 - ((var41.field369.field4819 - 1) * 64);
                            int var43 = var41.field4951 - ((var41.field369.field4819 - 1) * 64);
                            for (int var44 = 0; var44 < class14.field231; var44++) {
                                class26 var51 = class364.field5260[class301.field4380[var44]];
                                if (var51 != null && class388.field5665 != var51.field730 && var41 != var51 && var51.field771) {
                                    int var52 = var51.field4954 + 64 - (var51.field369.field4819 * 64);
                                    int var53 = var51.field4951 + 64 - (var51.field369.field4819 * 64);
                                    if (var52 >= var42 && var51.field369.field4819 <= (var41.field369.field4819 - (var52 - var42 >> 7)) && var53 >= var43 && var41.field369.field4819 - (var53 - var43 >> 7) >= var51.field369.field4819) {
                                        class92.method623(class187.field2619.field4960 != var26.field3576, var51, true);
                                        var51.field730 = class388.field5665;
                                    }
                                }
                            }
                            int var45 = class208.field2933;
                            int[] var46 = class88.field1085;
                            for (int var47 = 0; var47 < var45; var47++) {
                                class380 var48 = class455.field6731[var46[var47]];
                                if (var48 != null && class388.field5665 != var48.field730 && var48.field771) {
                                    int var49 = var48.field4954 - (var48.method446(10) - 1) * 64;
                                    int var50 = var48.field4951 + 64 - (var48.method446(10) * 64);
                                    if (var42 <= var49 && var48.method446(10) <= var41.field369.field4819 - (var49 - var42 >> 7) && var50 >= var43 && var48.method446(10) <= (var41.field369.field4819 - (var50 - var43 >> 7))) {
                                        class157.method1062(class187.field2619.field4960 != var26.field3576, var48, 124);
                                        var48.field730 = class388.field5665;
                                    }
                                }
                            }
                        }
                        if (class388.field5665 == var41.field730) {
                            continue;
                        }
                        class92.method623(class187.field2619.field4960 != var26.field3576, var41, true);
                        var41.field730 = class388.field5665;
                    }
                }
                if (var26.field3573 instanceof class171) {
                    class447 var54 = (class447) class200.field2828.method609((long) (var26.field3582 | var26.field3576 << 28 | var26.field3577 << 14), 53);
                    if (var54 != null) {
                        for (class188 var55 = (class188) var54.field6542.method2479(-1); var55 != null; var55 = (class188) var54.field6542.method2482(-5046)) {
                            class427 var56 = class157.field2119.method176((byte) -96, var55.field2623);
                            if (!class147.field1993) {
                                if (class187.field2619.field4960 == var26.field3576) {
                                    String[] var58 = var56.field6158;
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        if (var58 != null && var58[var59] != null) {
                                            byte var60 = 0;
                                            if (var59 == 0) {
                                                var60 = 30;
                                            }
                                            int var61 = class452.field6668;
                                            if (var59 == 1) {
                                                var60 = 5;
                                            }
                                            if (var59 == 2) {
                                                var60 = 19;
                                            }
                                            if (var59 == 3) {
                                                var60 = 58;
                                            }
                                            if (var56.field6209 == var59) {
                                                var61 = var56.field6171;
                                            }
                                            if (var59 == 4) {
                                                var60 = 46;
                                            }
                                            if (var56.field6136 == var59) {
                                                var61 = var56.field6182;
                                            }
                                            class463.method2862(var61, var26.field3577, false, true, var58[var59], (long) var55.field2623, "<col=ff9040>" + var56.field6145, (byte) -128, var60, var26.field3582);
                                            class192.field2678++;
                                        }
                                    }
                                }
                                class463.method2862(class383.field5615, var26.field3577, class187.field2619.field4960 != var26.field3576, true, class242.field3591.method2543(false, class153.field2073), (long) var55.field2623, "<col=ff9040>" + var56.field6145, (byte) -123, 1010, var26.field3582);
                                field1397++;
                            } else if (class187.field2619.field4960 == var26.field3576) {
                                class294 var57 = class356.field5173 == -1 ? null : class320.method2109(class356.field5173, (byte) -111);
                                if ((class433.field6315 & 0x1) != 0 && (var57 == null || var56.method2627(var57.field4270, 128, class356.field5173) != var57.field4270)) {
                                    class265.field3921++;
                                    class463.method2862(class90.field1107, var26.field3577, false, true, class253.field3723, (long) var55.field2623, class429.field6240 + " -> <col=ff9040>" + var56.field6145, (byte) -97, 59, var26.field3582);
                                }
                            }
                        }
                    }
                }
                if (var26.field3573 instanceof class438) {
                    class438 var62 = (class438) var26.field3573;
                    class178 var63 = class450.method2785(var62.method9((byte) 104), (byte) 116);
                    if (var63.field2489 != null) {
                        var63 = var63.method1240((byte) -116);
                    }
                    if (var63 != null) {
                        if (!class147.field1993) {
                            if (class187.field2619.field4960 == var26.field3576) {
                                String[] var64 = var63.field2475;
                                if (var64 != null) {
                                    for (int var65 = 4; var65 >= 0; var65--) {
                                        if (var64[var65] != null) {
                                            short var66 = 0;
                                            if (var65 == 0) {
                                                var66 = 17;
                                            }
                                            int var67 = class452.field6668;
                                            if (var65 == 1) {
                                                var66 = 3;
                                            }
                                            if (var65 == 2) {
                                                var66 = 11;
                                            }
                                            if (var65 == 3) {
                                                var66 = 21;
                                            }
                                            if (var65 == 4) {
                                                var66 = 1001;
                                            }
                                            if (var63.field2501 == var65) {
                                                var67 = var63.field2507;
                                            }
                                            if (var63.field2472 == var65) {
                                                var67 = var63.field2495;
                                            }
                                            class463.method2862(var67, var26.field3577, false, true, var64[var65], class330.method2156(var26.field3582, var62, false, var26.field3577), "<col=00ffff>" + var63.field2471, (byte) -93, var66, var26.field3582);
                                            class42.field563++;
                                        }
                                    }
                                }
                            }
                            class215.field3064++;
                            class463.method2862(class383.field5615, var26.field3577, class187.field2619.field4960 != var26.field3576, true, class242.field3591.method2543(false, class153.field2073), (long) var63.field2455, "<col=00ffff>" + var63.field2471, (byte) -125, 1006, var26.field3582);
                        } else if (class187.field2619.field4960 == var26.field3576) {
                            class294 var68 = class356.field5173 == -1 ? null : class320.method2109(class356.field5173, (byte) -114);
                            if ((class433.field6315 & 0x4) != 0 && (var68 == null || var63.method1232(-88, class356.field5173, var68.field4270) != var68.field4270)) {
                                class226.field3384++;
                                class463.method2862(class90.field1107, var26.field3577, false, true, class253.field3723, class330.method2156(var26.field3582, var62, false, var26.field3577), class429.field6240 + " -> <col=00ffff>" + var63.field2471, (byte) -102, 48, var26.field3582);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 > -114) {
            method750(-38);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(BLct;ZILct;)V")
    public static final void method746(byte arg0, class104 arg1, boolean arg2, int arg3, class104 arg4) {
        class231.field3462 = arg4;
        class403.field5827 = arg2;
        if (arg0 <= 89) {
            field1391 = null;
        }
        field1405++;
        class385.field5636 = arg1;
        class124.field1646 = arg3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method747(Component arg0) throws Exception {
        field1403++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public final synchronized void method748(boolean arg0) {
        field1399++;
        if (this.field1400) {
            return;
        }
        long var2 = class43.method364(-16756);
        try {
            if ((this.field1411 + 500000L) < var2) {
                this.field1411 = var2 - 500000L;
            }
            while (var2 > this.field1411 + 5000L) {
                this.method743(1, 256);
                this.field1411 += (long) (256000 / class298.field4331);
            }
        } catch (Exception var7) {
            this.field1411 = var2;
        }
        if (this.field1410 == null) {
            return;
        }
        try {
            if (this.field1418 != 0L) {
                if (var2 < this.field1418) {
                    return;
                }
                this.method753(this.field1421);
                this.field1418 = 0L;
                this.field1414 = true;
            }
            int var4 = this.method742();
            if (this.field1423 - var4 > this.field1420) {
                this.field1420 = this.field1423 - var4;
            }
            if (!arg0) {
                this.field1421 = -81;
            }
            int var5 = this.field1417 + this.field1413;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field1421 < var5 + 256) {
                this.field1421 += 1024;
                if (this.field1421 > 16384) {
                    this.field1421 = 16384;
                }
                this.method741();
                this.method753(this.field1421);
                var4 = 0;
                this.field1414 = true;
                if (this.field1421 < (var5 + 256)) {
                    var5 = this.field1421 - 256;
                    this.field1417 = var5 - this.field1413;
                }
            }
            while (var5 > var4) {
                this.method756(this.field1410, 256);
                this.method749();
                var4 += 256;
            }
            if (var2 > this.field1415) {
                if (this.field1414) {
                    this.field1414 = false;
                } else if (this.field1420 == 0 && this.field1416 == 0) {
                    this.method741();
                    this.field1418 = var2 + 2000L;
                    return;
                } else {
                    this.field1417 = Math.min(this.field1416, this.field1420);
                    this.field1416 = this.field1420;
                }
                this.field1420 = 0;
                this.field1415 = var2 + 2000L;
            }
            this.field1423 = var4;
        } catch (Exception var6) {
            this.method741();
            this.field1418 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
    public void method749() throws Exception {
        field1396++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method750(int arg0) {
        if (arg0 != 64) {
            field1391 = null;
        }
        field1391 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
    public final synchronized void method751(boolean arg0) {
        if (arg0) {
            return;
        }
        if (class242.field3590 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class242.field3590.field6281[var3] == this) {
                    class242.field3590.field6281[var3] = null;
                }
                if (class242.field3590.field6281[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class242.field3590.field6278 = true;
                while (class242.field3590.field6280) {
                    class418.method2587(false, 50L);
                }
                class242.field3590 = null;
            }
        }
        field1406++;
        this.method741();
        this.field1410 = null;
        this.field1400 = true;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public final void method752(int arg0) {
        this.field1414 = true;
        field1401++;
        if (arg0 > -12) {
            method746((byte) -31, (class104) null, true, 81, (class104) null);
        }
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
    public void method753(int arg0) throws Exception {
        field1409++;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILar;I)V")
    private final void method754(int arg0, class50 arg1, int arg2) {
        field1390++;
        if (arg0 != -32588) {
            return;
        }
        int var4 = arg2 >> 5;
        class50 var5 = this.field1419[var4];
        if (var5 == null) {
            this.field1422[var4] = arg1;
        } else {
            var5.field630 = arg1;
        }
        this.field1419[var4] = arg1;
        arg1.field628 = arg2;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
    public final synchronized void method755(int arg0) {
        this.field1414 = true;
        field1407++;
        if (arg0 != -415920505) {
            return;
        }
        try {
            this.method740();
        } catch (Exception var2) {
            this.method741();
            this.field1418 = class43.method364(arg0 + 415903749) + 2000L;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([II)V")
    private final void method756(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class263.field3896) {
            var3 = arg1 << 1;
        }
        class224.method1544(arg0, 0, var3);
        this.field1412 -= arg1;
        if (this.field1402 != null && this.field1412 <= 0) {
            this.field1412 += class298.field4331 >> 4;
            class329.method2153(this.field1402, 0);
            this.method754(-32588, this.field1402, this.field1402.method391());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class50 var10 = null;
                        class50 var11 = this.field1422[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class461 var12 = var11.field629;
                                if (var12 == null || var12.field6826 <= var8) {
                                    var11.field627 = true;
                                    int var13 = var11.method284();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field6826 += var13;
                                    }
                                    if (var4 >= this.field1398) {
                                        break label107;
                                    }
                                    class50 var14 = var11.method283();
                                    if (var14 != null) {
                                        int var15 = var11.field628;
                                        while (var14 != null) {
                                            this.method754(-32588, var14, var15 * var14.method391() >> 8);
                                            var14 = var11.method281();
                                        }
                                    }
                                    class50 var16 = var11.field630;
                                    var11.field630 = null;
                                    if (var10 == null) {
                                        this.field1422[var7] = var16;
                                    } else {
                                        var10.field630 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field1419[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field630;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class50 var18 = this.field1422[var17];
                this.field1422[var17] = this.field1419[var17] = null;
                while (var18 != null) {
                    class50 var19 = var18.field630;
                    var18.field630 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field1412 < 0) {
            this.field1412 = 0;
        }
        if (this.field1402 != null) {
            this.field1402.method277(arg0, 0, arg1);
        }
        this.field1411 = class43.method364(-16756);
    }
}
