import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pu")
public class class416 extends class202 {

    @OriginalMember(owner = "client!pu", name = "J", descriptor = "I")
    public int field6300 = 4;

    @OriginalMember(owner = "client!pu", name = "Q", descriptor = "Z")
    public boolean field6307 = true;

    @OriginalMember(owner = "client!pu", name = "M", descriptor = "I")
    public int field6303 = 1638;

    @OriginalMember(owner = "client!pu", name = "U", descriptor = "[B")
    private byte[] field6311 = new byte[512];

    @OriginalMember(owner = "client!pu", name = "T", descriptor = "I")
    public int field6310 = 4;

    @OriginalMember(owner = "client!pu", name = "ab", descriptor = "I")
    public int field6317 = 4;

    @OriginalMember(owner = "client!pu", name = "eb", descriptor = "I")
    public int field6321 = 0;

    @OriginalMember(owner = "client!pu", name = "P", descriptor = "I")
    public static int field6306 = 0;

    @OriginalMember(owner = "client!pu", name = "W", descriptor = "Z")
    public static boolean field6313 = false;

    @OriginalMember(owner = "client!pu", name = "X", descriptor = "Lss;")
    public static class213 field6314 = new class213("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!pu", name = "I", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!pu", name = "K", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!pu", name = "L", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!pu", name = "N", descriptor = "I")
    public static int field6304;

    @OriginalMember(owner = "client!pu", name = "O", descriptor = "I")
    public static int field6305;

    @OriginalMember(owner = "client!pu", name = "V", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!pu", name = "Y", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!pu", name = "Z", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!pu", name = "db", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!pu", name = "fb", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!pu", name = "gb", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!pu", name = "R", descriptor = "Lsc;")
    public static class29 field6308;

    @OriginalMember(owner = "client!pu", name = "bb", descriptor = "[S")
    private short[] field6318;

    @OriginalMember(owner = "client!pu", name = "cb", descriptor = "[S")
    private short[] field6319;

    @OriginalMember(owner = "client!pu", name = "S", descriptor = "[[[B")
    public static byte[][][] field6309;

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lmn;ILza;)V")
    public static final void method2656(class162 arg0, int arg1, class497 arg2) {
        ++field6305;
        if (!class299.field4712) {
            arg2.method1317(0);
            class62.field973 = arg2.method1278(class175.method1112(arg0, class426.field6447), true);
            if (arg1 != 2900) {
                field6313 = false;
            }
            class62.field973.method852((class489.field7400 - class62.field973.method623()) / 2, (class219.field3715 - class62.field973.method618()) / 2);
            class307.field4820 = arg2.method1278(class175.method1112(arg0, class349.field5405), true);
            class307.field4820.method852((class489.field7400 - class307.field4820.method623()) / 2, 18);
            class299.field4712 = true;
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2657(int arg0, byte[] arg1) {
        if (arg0 > -64) {
            method2659((byte) 84);
        }
        ++field6320;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class324.method2166(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(Z)V")
    public static final void method2658(boolean arg0) {
        ++field6312;
        if (~class513.field7615 < -2) {
            class104.field1530 = class387.field5910;
            --class513.field7615;
        }
        if (class386.field5901) {
            class386.field5901 = false;
            class519.method3112(-15537);
        } else {
            if (!class409.field6204) {
                class360.method2379(28958);
            }
            for (int var1 = 0; var1 < 100 && class402.method2584(-29); ++var1) {
            }
            if (class148.field1994 == 9) {
                class18.method95(class477.field7305.method1603(-1), (byte) -28, class170.field2488);
                if (class34.field353 == null) {
                    if (~class360.field5576 >= ~class246.method1705((byte) 28)) {
                        class34.field353 = class128.field1738.method2428((byte) -102, class95.field1387.field7721);
                    }
                } else if (class34.field353.field1908 != -1) {
                    class81.method578((byte) 66, class250.field4058);
                    class170.field2488.method1437(class34.field353.field1908, 0);
                    class34.field353 = null;
                    class360.field5576 = 30000L + class246.method1705((byte) 28);
                }
                class32 var2 = (class32) class513.field7612.method2123(122);
                if (var2 != null || class246.method1705((byte) 28) - 2000L > class322.field5030) {
                    boolean var3 = false;
                    int var4 = class170.field2488.field3162;
                    for (class32 var5 = (class32) class322.field5019.method2123(-115); var5 != null && ~(-var4 + class170.field2488.field3162) > -241; var5 = (class32) class322.field5019.method2126((byte) 61)) {
                        var5.method3149(82);
                        int var6 = var5.method142(51);
                        if (~var6 > -1) {
                            var6 = 0;
                        } else if (var6 > 65534) {
                            var6 = 65534;
                        }
                        int var7 = var5.method139(true);
                        if (var7 >= 0) {
                            if (var7 > 65534) {
                                var7 = 65534;
                            }
                        } else {
                            var7 = 0;
                        }
                        boolean var8 = false;
                        if (var5.method142(122) == -1 && var5.method139(true) == -1) {
                            var7 = -1;
                            var6 = -1;
                            var8 = true;
                        }
                        if (~class298.field4687 != ~var7 || class346.field5388 != var6) {
                            if (!var3) {
                                class81.method578((byte) 66, class417.field6331);
                                ++class323.field5065;
                                class170.field2488.method1479((byte) -125, 0);
                                var4 = class170.field2488.field3162;
                                var3 = true;
                            }
                            int var9 = -class298.field4687 + var7;
                            class298.field4687 = var7;
                            int var10 = -class346.field5388 + var6;
                            class346.field5388 = var6;
                            int var11 = (int) ((var5.method140(-89) + -class322.field5030) / 20L);
                            if (~var11 > -9 && ~var9 <= 31 && ~var9 >= -32 && ~var10 <= 31 && var10 <= 31) {
                                var9 += 32;
                                var10 += 32;
                                class170.field2488.method1437((var11 << 12) + (var9 << 6) + var10, 0);
                            } else if (~var11 > -33 && var9 >= -128 && ~var9 >= -128 && var10 >= -128 && var10 <= 127) {
                                var9 += 128;
                                class170.field2488.method1479((byte) -88, var11 + 128);
                                var10 += 128;
                                class170.field2488.method1437((var9 << 8) + var10, 0);
                            } else if (~var11 > -33) {
                                class170.field2488.method1479((byte) -89, var11 + 192);
                                if (!var8) {
                                    class170.field2488.method1477(65280, var7 | var6 << 16);
                                } else {
                                    class170.field2488.method1477(65280, Integer.MIN_VALUE);
                                }
                            } else {
                                class170.field2488.method1437(57344 - -var11, 0);
                                if (!var8) {
                                    class170.field2488.method1477(65280, var7 | var6 << 16);
                                } else {
                                    class170.field2488.method1477(65280, Integer.MIN_VALUE);
                                }
                            }
                            class322.field5030 = var5.method140(-82);
                        }
                    }
                    if (var3) {
                        class170.field2488.method1438(65280, -var4 + class170.field2488.field3162);
                    }
                }
                if (var2 != null) {
                    long var12 = (var2.method140(-118) + -class57.field913) / 50L;
                    class57.field913 = var2.method140(-107);
                    if (~var12 < -32768L) {
                        var12 = 32767L;
                    }
                    int var14 = var2.method142(101);
                    if (var14 >= 0) {
                        if (~var14 < -65536) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = var2.method139(true);
                    if (~var15 > -1) {
                        var15 = 0;
                    } else if (~var15 < -65536) {
                        var15 = 65535;
                    }
                    byte var16 = 0;
                    if (~var2.method141((byte) -58) == -3) {
                        var16 = 1;
                    }
                    int var17 = (int) var12;
                    ++class219.field3711;
                    class81.method578((byte) 66, class520.field7710);
                    class170.field2488.method1437(var17 | var16 << 15, 0);
                    class170.field2488.method1472(true, var15 | var14 << 16);
                }
                if (~class443.field6884 < -1) {
                    ++class460.field7088;
                    class81.method578((byte) 66, class365.field5656);
                    class170.field2488.method1479((byte) -113, class443.field6884 * 3);
                    for (int var18 = 0; class443.field6884 > var18; ++var18) {
                        class369 var19 = class235.field3864[var18];
                        long var20 = (var19.method1831(98) + -class372.field5720) / 50L;
                        class372.field5720 = var19.method1831(116);
                        if (~var20 < -65536L) {
                            var20 = 65535L;
                        }
                        class170.field2488.method1479((byte) -126, var19.method1828((byte) 47));
                        class170.field2488.method1437((int) var20, 0);
                    }
                }
                if (class406.field6133 > 0) {
                    --class406.field6133;
                }
                if (class528.field7774 && class406.field6133 <= 0) {
                    ++class422.field6399;
                    class406.field6133 = 20;
                    class528.field7774 = false;
                    class81.method578((byte) 66, class10.field102);
                    class170.field2488.method1419(-10147, (int) class135.field1824 >> 3);
                    class170.field2488.method1437((int) class388.field5918 >> 3, 0);
                }
                if (class224.field3767 && !class237.field3880) {
                    ++class79.field1177;
                    class237.field3880 = true;
                    class81.method578((byte) 66, class196.field2975);
                    class170.field2488.method1479((byte) -124, 1);
                }
                if (!class224.field3767 && class237.field3880) {
                    class237.field3880 = false;
                    ++class79.field1177;
                    class81.method578((byte) 66, class196.field2975);
                    class170.field2488.method1479((byte) -111, 0);
                }
                if (!class256.field4144) {
                    class81.method578((byte) 66, class358.field5552);
                    ++class82.field1207;
                    class170.field2488.method1479((byte) -115, 0);
                    int var22 = class170.field2488.field3162;
                    class208 var23 = class141.field1911.method1631(-101);
                    class170.field2488.method1474(var23.field3193, 0, var23.field3162, (byte) -88);
                    class170.field2488.method1438(65280, class170.field2488.field3162 - var22);
                    class256.field4144 = true;
                }
                if (class217.field3699 != null) {
                    if (class334.field5222 != 2) {
                        if (~class334.field5222 == -4) {
                            class345.method2282((byte) -126);
                        }
                    } else {
                        class352.method2335(-64);
                    }
                }
                if (!class205.field3137) {
                    class131.field1781 /= 2.0F;
                } else {
                    class205.field3137 = false;
                }
                if (!class247.field4024) {
                    class376.field5767 /= 2.0F;
                } else {
                    class247.field4024 = false;
                }
                class289.method1947(-81);
                if (class148.field1994 == 9) {
                    class131.method816(17797);
                    class300.method2023(arg0);
                    class336.method2235(211);
                    class249.method1727(125);
                    ++class141.field1907;
                    if (~class141.field1907 < -751) {
                        class519.method3112(-15537);
                    } else {
                        class96.method651(14996);
                        class376.method2435(0);
                        class65.method473((byte) 127);
                        for (int var24 = class96.field1394.method1981(11560, true); var24 != -1; var24 = class96.field1394.method1981(11560, false)) {
                            class203.method1386(!arg0, var24);
                            class45.field586[class272.method1842(31, class103.field1522++)] = var24;
                        }
                        for (class456 var25 = class217.method1600(1); var25 != null; var25 = class217.method1600(1)) {
                            int var26 = var25.method2863(-1647452576);
                            int var27 = var25.method2861((byte) 124);
                            if (~var26 != -2) {
                                if (var26 != 2) {
                                    if (var26 != 3) {
                                        if (~var26 != -5) {
                                            if (var26 != 5) {
                                                if (~var26 == -7) {
                                                    int var28 = var25.field7042;
                                                    int var29 = var28 >> 10 & 31;
                                                    int var30 = (996 & var28) >> 5;
                                                    int var31 = 31 & var28;
                                                    int var32 = (var31 << 3) + ((var29 << 19) - -(var30 << 11));
                                                    class437 var33 = class255.method1747(var27, !arg0);
                                                    if (var33.field6622 != var32) {
                                                        var33.field6622 = var32;
                                                        class479.method2962(-113, var33);
                                                    }
                                                } else if (~var26 != -8) {
                                                    if (var26 == 8) {
                                                        class437 var34 = class255.method1747(var27, !arg0);
                                                        if (~var25.field7042 != ~var34.field6670 || ~var25.field7041 != ~var34.field6695 || var25.field7039 != var34.field6709) {
                                                            var34.field6670 = var25.field7042;
                                                            var34.field6709 = var25.field7039;
                                                            var34.field6695 = var25.field7041;
                                                            if (~var34.field6716 != 0) {
                                                                if (var34.field6702 > 0) {
                                                                    var34.field6709 = var34.field6709 * 32 / var34.field6702;
                                                                } else if (var34.field6704 > 0) {
                                                                    var34.field6709 = var34.field6709 * 32 / var34.field6704;
                                                                }
                                                            }
                                                            class479.method2962(-124, var34);
                                                        }
                                                    } else if (var26 == 9) {
                                                        class437 var35 = class255.method1747(var27, false);
                                                        if (~var25.field7042 != ~var35.field6716 || ~var25.field7041 != ~var35.field6678) {
                                                            var35.field6716 = var25.field7042;
                                                            var35.field6678 = var25.field7041;
                                                            class479.method2962(-99, var35);
                                                        }
                                                    } else if (var26 != 10) {
                                                        if (~var26 == -12) {
                                                            class437 var36 = class255.method1747(var27, false);
                                                            var36.field6644 = var36.field6750 = var25.field7041;
                                                            var36.field6590 = 0;
                                                            var36.field6691 = 0;
                                                            var36.field6666 = var36.field6633 = var25.field7042;
                                                            class479.method2962(-107, var36);
                                                        } else if (var26 != 12) {
                                                            if (~var26 != -15) {
                                                                if (~var26 != -16) {
                                                                    if (~var26 == -17) {
                                                                        class437 var37 = class255.method1747(var27, false);
                                                                        var37.field6636 = var25.field7042;
                                                                    }
                                                                } else {
                                                                    class253.field4100 = true;
                                                                    class454.field7026 = var25.field7042;
                                                                    class535.field7842 = var25.field7041;
                                                                }
                                                            } else {
                                                                class437 var38 = class255.method1747(var27, false);
                                                                var38.field6680 = var25.field7042;
                                                            }
                                                        } else {
                                                            class437 var39 = class255.method1747(var27, !arg0);
                                                            int var40 = var25.field7042;
                                                            if (var39 != null && var39.field6729 == 0) {
                                                                if (var40 > -var39.field6730 + var39.field6647) {
                                                                    var40 = var39.field6647 - var39.field6730;
                                                                }
                                                                if (var40 < 0) {
                                                                    var40 = 0;
                                                                }
                                                                if (~var39.field6613 != ~var40) {
                                                                    var39.field6613 = var40;
                                                                    class479.method2962(-118, var39);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        class437 var41 = class255.method1747(var27, !arg0);
                                                        if (~var25.field7042 != ~var41.field6740 || ~var25.field7041 != ~var41.field6726 || var25.field7039 != var41.field6677) {
                                                            var41.field6740 = var25.field7042;
                                                            var41.field6726 = var25.field7041;
                                                            var41.field6677 = var25.field7039;
                                                            class479.method2962(-126, var41);
                                                        }
                                                    }
                                                } else {
                                                    class437 var42 = class255.method1747(var27, false);
                                                    boolean var43 = ~var25.field7042 == -2;
                                                    if (!var43 == var42.field6739) {
                                                        var42.field6739 = var43;
                                                        class479.method2962(-121, var42);
                                                    }
                                                }
                                            } else {
                                                class437 var44 = class255.method1747(var27, false);
                                                if (var25.field7042 != var44.field6605 || var25.field7042 == -1) {
                                                    var44.field6621 = 0;
                                                    var44.field6605 = var25.field7042;
                                                    var44.field6659 = 1;
                                                    var44.field6610 = 0;
                                                    class479.method2962(-121, var44);
                                                }
                                            }
                                        } else {
                                            class437 var45 = class255.method1747(var27, false);
                                            int var46 = var25.field7042;
                                            int var47 = var25.field7041;
                                            int var48 = var25.field7039;
                                            if (~var45.field6608 != ~var46 || var45.field6755 != var47 || ~var45.field6731 != ~var48) {
                                                var45.field6755 = var47;
                                                var45.field6608 = var46;
                                                var45.field6731 = var48;
                                                class479.method2962(-115, var45);
                                            }
                                        }
                                    } else {
                                        class437 var49 = class255.method1747(var27, false);
                                        if (!var25.field7037.equals(var49.field6742)) {
                                            var49.field6742 = var25.field7037;
                                            class479.method2962(-128, var49);
                                        }
                                    }
                                } else {
                                    class192.field2842[var27] = var25.field7037;
                                    class516.field7673[class272.method1842(31, class360.field5579++)] = var27;
                                }
                            } else {
                                class187.field2726[var27] = var25.field7042;
                                class325.field5107 |= class225.field3770[var27];
                                class229.field3811[class272.method1842(class186.field2710++, 31)] = var27;
                            }
                        }
                        ++class376.field5786;
                        if (~class303.field4748 != -1) {
                            class462.field7109 += 20;
                            if (~class462.field7109 <= -401) {
                                class303.field4748 = 0;
                            }
                        }
                        if (class380.field5840 != null) {
                            ++class463.field7121;
                            if (class463.field7121 >= 15) {
                                class479.method2962(-114, class380.field5840);
                                class380.field5840 = null;
                            }
                        }
                        class6.field76 = false;
                        class309.field4834 = null;
                        class387.field5906 = false;
                        class204.field3125 = null;
                        class48.method348((class437) null, 118, -1, -1);
                        class346.method2285(-1, (class437) null, false, -1);
                        if (!class128.field1732) {
                            class436.field6587 = -1;
                        }
                        class54.method409((byte) 64);
                        ++class387.field5910;
                        if (class361.field5596) {
                            ++class508.field7576;
                            class81.method578((byte) 66, class326.field5118);
                            class170.field2488.method1429(class325.field5108 | class423.field6422 << 14 | class385.field5894 << 28, -27168);
                            class361.field5596 = false;
                        }
                        while (true) {
                            class491 var50;
                            class437 var51;
                            class437 var52;
                            do {
                                var50 = (class491) class9.field96.method2127(-107);
                                if (var50 == null) {
                                    while (true) {
                                        class491 var53;
                                        class437 var54;
                                        class437 var55;
                                        do {
                                            var53 = (class491) class65.field1017.method2127(-115);
                                            if (var53 == null) {
                                                while (true) {
                                                    class491 var56;
                                                    class437 var57;
                                                    class437 var58;
                                                    do {
                                                        var56 = (class491) class176.field2580.method2127(-117);
                                                        if (var56 == null) {
                                                            if (class204.field3125 == null) {
                                                                class160.field2192 = 0;
                                                            }
                                                            if (class477.field7309 != null) {
                                                                class496.method3033((byte) -119);
                                                            }
                                                            if (class439.field6815 > 0 && class36.field376.method927(82, -1234) && class36.field376.method927(81, -1234) && ~class349.field5412 != -1) {
                                                                int var59 = -class349.field5412 + class358.field5565.field6419;
                                                                if (~var59 <= -1) {
                                                                    if (~var59 < -4) {
                                                                        var59 = 3;
                                                                    }
                                                                } else {
                                                                    var59 = 0;
                                                                }
                                                                class330.method2208(117, class358.field5565.field894[0] + class453.field7018, var59, class358.field5565.field899[0] + class126.field1718);
                                                            }
                                                            class206.method1408(-128);
                                                            for (int var60 = 0; var60 < 5; ++var60) {
                                                                int var10002 = class19.field202[var60]++;
                                                            }
                                                            if (class325.field5107 && class246.method1705((byte) 28) - 60000L > class526.field7757) {
                                                                class535.method3169(-124);
                                                            }
                                                            for (class513 var61 = (class513) class193.field2862.method2616(255); var61 != null; var61 = (class513) class193.field2862.method2619(255)) {
                                                                if (-5L + class246.method1705((byte) 28) / 1000L > (long) var61.field7618) {
                                                                    if (~var61.field7617 < -1) {
                                                                        class528.method3140("", "", var61.field7611 + class78.field1157.method1583(95, class12.field131), 29, 5, 0);
                                                                    }
                                                                    if (~var61.field7617 == -1) {
                                                                        class528.method3140("", "", var61.field7611 + class487.field7381.method1583(125, class12.field131), 63, 5, 0);
                                                                    }
                                                                    var61.method1613(1049391719);
                                                                }
                                                            }
                                                            ++class364.field5629;
                                                            if (class364.field5629 > 500) {
                                                                class364.field5629 = 0;
                                                                int var62 = (int) (Math.random() * 8.0D);
                                                                if (~(var62 & 2) == -3) {
                                                                    class58.field932 += class36.field375;
                                                                }
                                                                if ((4 & var62) == 4) {
                                                                    class33.field339 += class452.field7014;
                                                                }
                                                                if ((1 & var62) == 1) {
                                                                    class171.field2505 += class477.field7308;
                                                                }
                                                            }
                                                            if (class171.field2505 < -50) {
                                                                class477.field7308 = 2;
                                                            }
                                                            if (~class58.field932 > 54) {
                                                                class36.field375 = 2;
                                                            }
                                                            if (~class171.field2505 < -51) {
                                                                class477.field7308 = -2;
                                                            }
                                                            if (~class33.field339 > 39) {
                                                                class452.field7014 = 1;
                                                            }
                                                            if (class58.field932 > 55) {
                                                                class36.field375 = -2;
                                                            }
                                                            ++class244.field3950;
                                                            if (~class33.field339 < -41) {
                                                                class452.field7014 = -1;
                                                            }
                                                            if (~class244.field3950 < -501) {
                                                                class244.field3950 = 0;
                                                                int var63 = (int) (Math.random() * 8.0D);
                                                                if (~(var63 & 1) == -2) {
                                                                    class386.field5903 += class179.field2619;
                                                                }
                                                                if (~(2 & var63) == -3) {
                                                                    class326.field5126 += class105.field1533;
                                                                }
                                                            }
                                                            if (class386.field5903 < -60) {
                                                                class179.field2619 = 2;
                                                            }
                                                            if (~class386.field5903 < -61) {
                                                                class179.field2619 = -2;
                                                            }
                                                            if (class326.field5126 < -20) {
                                                                class105.field1533 = 1;
                                                            }
                                                            if (~class326.field5126 < -11) {
                                                                class105.field1533 = -1;
                                                            }
                                                            ++class468.field7161;
                                                            if (class468.field7161 > 50) {
                                                                class81.method578((byte) 66, class13.field142);
                                                                ++class83.field1214;
                                                            }
                                                            if (class352.field5485) {
                                                                class301.method2024(-128);
                                                                class352.field5485 = false;
                                                            }
                                                            try {
                                                                if (class338.field5281 != null && ~class170.field2488.field3162 < -1) {
                                                                    class53.field730 += class170.field2488.field3162;
                                                                    class338.field5281.method1895(10, class170.field2488.field3162, class170.field2488.field3193, 0);
                                                                    class170.field2488.field3162 = 0;
                                                                    class468.field7161 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var64) {
                                                                class519.method3112(-15537);
                                                                return;
                                                            }
                                                        }
                                                        var57 = var56.field7423;
                                                        if (var57.field6595 < 0) {
                                                            break;
                                                        }
                                                        var58 = class255.method1747(var57.field6599, !arg0);
                                                    } while (var58 == null || var58.field6675 == null || var58.field6675.length <= var57.field6595 || var58.field6675[var57.field6595] != var57);
                                                    class420.method2673(var56);
                                                }
                                            }
                                            var54 = var53.field7423;
                                            if (~var54.field6595 > -1) {
                                                break;
                                            }
                                            var55 = class255.method1747(var54.field6599, false);
                                        } while (var55 == null || var55.field6675 == null || ~var55.field6675.length >= ~var54.field6595 || var55.field6675[var54.field6595] != var54);
                                        class420.method2673(var53);
                                    }
                                }
                                var51 = var50.field7423;
                                if (~var51.field6595 > -1) {
                                    break;
                                }
                                var52 = class255.method1747(var51.field6599, !arg0);
                            } while (var52 == null || var52.field6675 == null || var52.field6675.length <= var51.field6595 || var52.field6675[var51.field6595] != var51);
                            class420.method2673(var50);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        this.field6311 = class309.method2073(0, this.field6321);
        ++field6316;
        this.method2662((byte) -100);
        int var2 = -12 % ((80 - arg0) / 46);
        for (int var3 = this.field6310 - 1; ~var3 <= -2; --var3) {
            short var4 = this.field6318[var3];
            if (~var4 < -9 || var4 < -8) {
                return;
            }
            --this.field6310;
        }
    }

    @OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        field6314 = null;
        int var1 = -59 % ((arg0 - -60) / 42);
        field6308 = null;
        field6309 = null;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6300 = arg0.method1445(35);
                                }
                            } else {
                                this.field6317 = arg0.method1445(49);
                            }
                        } else {
                            this.field6321 = arg0.method1445(-81);
                        }
                    } else {
                        this.field6317 = this.field6300 = arg0.method1445(-99);
                    }
                } else {
                    this.field6303 = arg0.method1456(13329);
                    if (this.field6303 < 0) {
                        this.field6318 = new short[this.field6310];
                        for (int var5 = 0; this.field6310 > var5; ++var5) {
                            this.field6318[var5] = (short) arg0.method1456(13329);
                        }
                    }
                }
            } else {
                this.field6310 = arg0.method1445(51);
            }
        } else {
            this.field6307 = arg0.method1445(69) == 1;
        }
        int var6 = 93 % ((-46 - arg1) / 50);
        ++field6302;
    }

    @OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
    public class416() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(BI[I)V")
    public final void method2660(byte arg0, int arg1, int[] arg2) {
        ++field6304;
        int var4 = class521.field7716[arg1] * this.field6300;
        if (arg0 < 71) {
            this.method40((class208) null, (byte) 18, 19);
        }
        if (this.field6310 != 1) {
            short var5 = this.field6318[0];
            if (~var5 < -9 || ~var5 > 7) {
                int var6 = this.field6319[0] << 12;
                int var7 = this.field6300 * var6 >> 12;
                int var8 = var4 * var6 >> 12;
                int var9 = this.field6317 * var6 >> 12;
                int var10 = var8 >> 12;
                int var11 = var10 - -1;
                int var12 = var8 & 4095;
                if (~var11 <= ~var7) {
                    var11 = 0;
                }
                int var13 = 255 & this.field6311[var10 & 255];
                int var14 = this.field6311[255 & var11] & 255;
                int var15 = class186.field2701[var12];
                for (int var16 = 0; ~var16 > ~class276.field4375; ++var16) {
                    int var36 = class476.field7271[var16] * this.field6317;
                    int var37 = this.method2661(var15, var9, -1484830740, var12, var13, var14, var6 * var36 >> 12);
                    arg2[var16] = var5 * var37 >> 12;
                }
            }
            for (int var17 = 1; this.field6310 > var17; ++var17) {
                short var18 = this.field6318[var17];
                if (var18 > 8 || var18 < -8) {
                    int var19 = this.field6319[var17] << 12;
                    int var20 = this.field6317 * var19 >> 12;
                    int var21 = this.field6300 * var19 >> 12;
                    int var22 = var4 * var19 >> 12;
                    int var23 = var22 >> 12;
                    int var24 = var23 + 1;
                    int var25 = var22 & 4095;
                    if (var24 >= var21) {
                        var24 = 0;
                    }
                    int var26 = class186.field2701[var25];
                    int var27 = this.field6311[var23 & 255] & 255;
                    int var28 = this.field6311[255 & var24] & 255;
                    if (this.field6307 && this.field6310 + -1 == var17) {
                        for (int var29 = 0; class276.field4375 > var29; ++var29) {
                            int var30 = class476.field7271[var29] * this.field6317;
                            int var31 = this.method2661(var26, var20, -1484830740, var25, var27, var28, var19 * var30 >> 12);
                            int var32 = (var18 * var31 >> 12) + arg2[var29];
                            arg2[var29] = (var32 >> 1) + 2048;
                        }
                    } else {
                        for (int var33 = 0; ~var33 > ~class276.field4375; ++var33) {
                            int var34 = class476.field7271[var33] * this.field6317;
                            int var35 = this.method2661(var26, var20, -1484830740, var25, var27, var28, var19 * var34 >> 12);
                            arg2[var33] += var18 * var35 >> 12;
                        }
                    }
                }
            }
        } else {
            short var38 = this.field6318[0];
            int var39 = this.field6319[0] << 12;
            int var40 = this.field6317 * var39 >> 12;
            int var41 = var4 * var39 >> 12;
            int var42 = this.field6300 * var39 >> 12;
            int var43 = var41 >> 12;
            int var44 = var43 + 1;
            if (var42 <= var44) {
                var44 = 0;
            }
            int var45 = var41 & 4095;
            int var46 = this.field6311[var44 & 255] & 255;
            int var47 = 255 & this.field6311[255 & var43];
            int var48 = class186.field2701[var45];
            if (this.field6307) {
                for (int var49 = 0; ~class276.field4375 < ~var49; ++var49) {
                    int var50 = class476.field7271[var49] * this.field6317;
                    int var51 = this.method2661(var48, var40, -1484830740, var45, var47, var46, var39 * var50 >> 12);
                    int var52 = var38 * var51 >> 12;
                    arg2[var49] = (var52 >> 1) + 2048;
                }
            } else {
                for (int var53 = 0; var53 < class276.field4375; ++var53) {
                    int var54 = class476.field7271[var53] * this.field6317;
                    int var55 = this.method2661(var48, var40, -1484830740, var45, var47, var46, var39 * var54 >> 12);
                    arg2[var53] = var38 * var55 >> 12;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIIIII)I")
    private final int method2661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6299;
        int var8 = arg6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg6 & 4095;
        if (arg1 <= var9) {
            var9 = 0;
        }
        int var12 = var11 + -4096;
        if (arg2 != -1484830740) {
            this.field6311 = null;
        }
        int var13 = arg3 - 4096;
        int var14 = var9 & 255;
        int var15 = class186.field2701[var11];
        int var16 = this.field6311[var10 - -arg4] & 3;
        int var17;
        if (var16 > 1) {
            var17 = var16 == 2 ? var11 - arg3 : -arg3 + -var11;
        } else {
            var17 = var16 == 0 ? arg3 + var11 : arg3 - var11;
        }
        int var18 = this.field6311[arg4 + var14] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 != -1 ? -var12 + arg3 : arg3 + var12;
        } else {
            var19 = ~var18 == -3 ? -arg3 + var12 : -arg3 + -var12;
        }
        int var20 = 3 & this.field6311[var10 - -arg5];
        int var21 = ((-var17 + var19) * var15 >> 12) + var17;
        int var22;
        if (var20 <= 1) {
            var22 = ~var20 != -1 ? -var11 + var13 : var11 + var13;
        } else {
            var22 = var20 != 2 ? -var11 + -var13 : -var13 + var11;
        }
        int var23 = 3 & this.field6311[arg5 + var14];
        int var24;
        if (var23 > 1) {
            var24 = var23 == 2 ? -var13 + var12 : -var12 + -var13;
        } else {
            var24 = var23 == 0 ? var12 - -var13 : -var12 + var13;
        }
        int var25 = ((-var22 + var24) * var15 >> 12) + var22;
        return ((-var21 + var25) * arg0 >> 12) + var21;
    }

    @OriginalMember(owner = "client!pu", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field6301;
        int[] var3 = super.field3064.method2452((byte) 39, arg0);
        if (super.field3064.field5837) {
            this.method2660((byte) 107, arg0, var3);
        }
        return !arg1 ? null : var3;
    }

    @OriginalMember(owner = "client!pu", name = "d", descriptor = "(B)V")
    private final void method2662(byte arg0) {
        if (arg0 != -100) {
            field6314 = null;
        }
        ++field6323;
        if (~this.field6303 >= -1) {
            if (this.field6318 != null && this.field6318.length == this.field6310) {
                this.field6319 = new short[this.field6310];
                for (int var2 = 0; ~var2 > ~this.field6310; ++var2) {
                    this.field6319[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field6319 = new short[this.field6310];
            this.field6318 = new short[this.field6310];
            for (int var3 = 0; ~var3 > ~this.field6310; ++var3) {
                this.field6318[var3] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field6303 / 4096.0F), (double) var3)));
                this.field6319[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!pu", name = "e", descriptor = "(III)Z")
    public static final boolean method2663(int arg0, int arg1, int arg2) {
        if (arg2 < 106) {
            field6308 = null;
        }
        ++field6315;
        return (52 & arg0) != 0;
    }
}
