import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lda;")
    private class44 field502;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "J")
    public long field504;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)V", line = 3)
    public static final void method221(byte arg0, int arg1) {
        class344.field5146 = arg1;
        field505++;
        if (arg0 == -126) {
            class189.field3038.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 22)
    public static final int method222(Random arg0, int arg1, int arg2) {
        field503++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class388.method2381(arg2, 111)) {
            return (int) ((long) arg2 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else if (arg1 == -13086) {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class136.method1032(var4, arg2, (byte) 9);
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!vo", name = "finalize", descriptor = "()V", line = 51)
    protected final void finalize() throws Throwable {
        this.field502.method328(20, this.field504);
        field500++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lda;J[Lrs;)V", line = 61)
    public class32(class44 arg0, long arg1, class466[] arg2) {
        this.field502 = arg0;
        this.field504 = arg1;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V", line = 73)
    public static final void method223(byte arg0) {
        field501++;
        if (class179.field2910 == 0 || class179.field2910 == 5) {
            return;
        }
        try {
            if (++class73.field1465 > 2000) {
                if (class216.field3417 != null) {
                    class216.field3417.method2319((byte) 99);
                    class216.field3417 = null;
                }
                if (class496.field7281 >= 1) {
                    class179.field2910 = 0;
                    class252.method1626(-5, 116);
                    return;
                }
                if (class68.field1382 == 2 || class68.field1382 == 3) {
                    class444.field6606.field3822 = !class444.field6606.field3822;
                } else {
                    class397.field6032.field3822 = !class397.field6032.field3822;
                }
                class73.field1465 = 0;
                class496.field7281++;
                class179.field2910 = 1;
            }
            if (class179.field2910 == 1) {
                if (class68.field1382 == 2 || class68.field1382 == 3) {
                    class17.field275 = class497.field7305.method2882(true, class444.field6606.method1605((byte) -127), class444.field6606.field3826);
                } else {
                    class17.field275 = class497.field7305.method2882(true, class397.field6032.method1605((byte) -109), class397.field6032.field3826);
                }
                class179.field2910 = 2;
            }
            if (class179.field2910 == 2) {
                if (class17.field275.field2119 == 2) {
                    throw new IOException();
                }
                if (class17.field275.field2119 != 1) {
                    return;
                }
                class216.field3417 = new class378((Socket) class17.field275.field2115, class497.field7305);
                class17.field275 = null;
                long var1 = class377.field5512 = class410.method2539((byte) 12, class339.field5106);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class335.field5062.field4399 = 0;
                class335.field5062.method1814(class316.field4784.field2207, true);
                class335.field5062.method1814(var3, true);
                class216.field3417.method2329(0, 2, 3, class335.field5062.field4408);
                class44.method275(false);
                int var4 = class216.field3417.method2328(0);
                class44.method275(false);
                if (var4 != 0) {
                    class179.field2910 = 0;
                    class252.method1626(var4, -114);
                    class216.field3417.method2319((byte) 114);
                    class216.field3417 = null;
                    class59.method527(4);
                    return;
                }
                class179.field2910 = 3;
            }
            if (class179.field2910 == 3) {
                if (class216.field3417.method2321(0) < 8) {
                    return;
                }
                class216.field3417.method2322(0, 8, (byte) 114, class219.field3446.field4408);
                class219.field3446.field4399 = 0;
                class292.field4470 = class219.field3446.method1877(false);
                class289 var5 = new class289(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class292.field4470 >> 32), (int) class292.field4470 };
                var5.method1814(10, true);
                var5.method1862((byte) -115, var6[0]);
                var5.method1862((byte) -115, var6[1]);
                var5.method1862((byte) -115, var6[2]);
                var5.method1862((byte) -115, var6[3]);
                var5.method1826(class410.method2539((byte) 12, class339.field5106), 252);
                var5.method1821(class256.field3934, 103);
                var5.method1845(108, class60.field1239, class395.field6016);
                class43 var7 = class335.field5062;
                var7.field4399 = 0;
                if (class68.field1382 == 2 || class68.field1382 == 3) {
                    if (class466.field6932 == 12) {
                        var7.method1814(class316.field4788.field2207, true);
                    } else {
                        var7.method1814(class316.field4786.field2207, true);
                    }
                    var7.method1865(0, 812856296);
                    int var9 = var7.field4399;
                    var7.method1862((byte) -115, 597);
                    var7.method1814(class405.field6102, true);
                    var7.method1814(class13.method86(3), true);
                    var7.method1865(class71.field1415, 812856296);
                    var7.method1865(class65.field1330, 812856296);
                    var7.method1814(class186.field2990.field2542, true);
                    class290.method1881(true, var7);
                    var7.method1821(class27.field437, 81);
                    var7.method1862((byte) -115, class242.field3745);
                    class289 var10 = class186.field2990.method1782(1);
                    var7.method1814(var10.field4399, true);
                    var7.method1813(var10.field4399, 0, var10.field4408, 9262);
                    class1.field46 = true;
                    var7.method1865(class370.field5418, 812856296);
                    var7.method1865(class71.field1418, 812856296);
                    class5.method41(-28513);
                    var7.method1813(var5.field4399, 0, var5.field4408, 9262);
                    var7.method1844(var7.field4399 - var9, 255);
                } else {
                    var7.method1814(class316.field4789.field2207, true);
                    var7.method1865(0, 812856296);
                    int var8 = var7.field4399;
                    var7.method1862((byte) -115, 597);
                    var7.method1814(class424.field6366.field5121, true);
                    var7.method1814(class146.field2452, true);
                    class290.method1881(true, var7);
                    var7.method1821(class27.field437, 114);
                    var7.method1862((byte) -115, class242.field3745);
                    class5.method41(-28513);
                    var7.method1813(var5.field4399, 0, var5.field4408, 9262);
                    var7.method1844(var7.field4399 - var8, 255);
                }
                class216.field3417.method2329(0, var7.field4399, 3, var7.field4408);
                var7.method267(15119, var6);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class219.field3446.method267(15119, var6);
                class179.field2910 = 4;
            }
            if (arg0 > -11) {
                method221((byte) -125, 118);
            }
            if (class179.field2910 == 4) {
                if (class216.field3417.method2321(0) < 1) {
                    return;
                }
                int var12 = class216.field3417.method2328(0);
                if (var12 == 21) {
                    class179.field2910 = 7;
                } else if (var12 == 29) {
                    class179.field2910 = 13;
                } else if (var12 == 1) {
                    class179.field2910 = 5;
                    class252.method1626(var12, 114);
                    return;
                } else if (var12 == 2) {
                    class179.field2910 = 8;
                } else if (var12 == 15) {
                    class234.field3606 = -2;
                    class179.field2910 = 14;
                } else if (var12 == 23 && class496.field7281 < 1) {
                    class496.field7281++;
                    class179.field2910 = 1;
                    class73.field1465 = 0;
                    class216.field3417.method2319((byte) 123);
                    class216.field3417 = null;
                    return;
                } else {
                    class179.field2910 = 0;
                    class252.method1626(var12, 121);
                    class216.field3417.method2319((byte) 115);
                    class216.field3417 = null;
                    class59.method527(4);
                    return;
                }
            }
            if (class179.field2910 == 6) {
                class335.field5062.field4399 = 0;
                class335.field5062.method266((byte) -74, class316.field4787.field2207);
                class216.field3417.method2329(0, class335.field5062.field4399, 3, class335.field5062.field4408);
                class179.field2910 = 4;
            } else if (class179.field2910 == 7) {
                if (class216.field3417.method2321(0) >= 1) {
                    class209.field3342 = (class216.field3417.method2328(0) + 3) * 60;
                    class179.field2910 = 0;
                    class252.method1626(21, -102);
                    class216.field3417.method2319((byte) 116);
                    class216.field3417 = null;
                    class59.method527(4);
                }
            } else if (class179.field2910 == 13) {
                if (class216.field3417.method2321(0) >= 1) {
                    class85.field1753 = class216.field3417.method2328(0);
                    class179.field2910 = 0;
                    class252.method1626(29, -27);
                    class216.field3417.method2319((byte) 122);
                    class216.field3417 = null;
                    class59.method527(4);
                }
            } else if (class179.field2910 != 8) {
                if (class179.field2910 == 9) {
                    class43 var13 = class219.field3446;
                    if (class68.field1382 == 3) {
                        class368.field5390 = true;
                    } else {
                        class368.field5390 = false;
                    }
                    if (class68.field1382 == 2 || class68.field1382 == 3) {
                        if (class216.field3417.method2321(0) < class291.field4445) {
                            return;
                        }
                        class216.field3417.method2322(0, class291.field4445, (byte) 114, var13.field4408);
                        var13.field4399 = 0;
                        class239.field3706 = var13.method1858(-3256);
                        class253.field3882 = var13.method1858(-3256);
                        class453.field6733 = var13.method1858(-3256) == 1;
                        class85.field1747 = var13.method1858(-3256) == 1;
                        class191.field3084 = var13.method1858(-3256) == 1;
                        class410.field6203 = var13.method1858(-3256) == 1;
                        class174.field2806 = var13.method1841((byte) -9);
                        class464.field6887 = var13.method1858(-3256) == 1;
                        class320.field4899 = var13.method1864(21329);
                        class7.field110 = var13.method1858(-3256) == 1;
                        if (class68.field1382 == 3) {
                            boolean var14 = var13.method1858(-3256) == 1;
                            if (var14) {
                                long var15 = var13.method1877(false);
                                String var17 = class356.method2198(10601, var15);
                                int var18 = var13.method1858(-3256);
                                byte[] var19 = new byte[var18];
                                var13.method265(var19, var18, false, 0);
                                String var20 = class508.method3042(var19, 255);
                                class371 var21 = null;
                                try {
                                    class121 var22 = class497.field7305.method2878("3", false, 0);
                                    while (var22.field2119 == 0) {
                                        class50.method470(1L, -5);
                                    }
                                    if (var22.field2119 == 1) {
                                        var21 = (class371) var22.field2115;
                                        int var23 = var17.length() + var20.length() + 4 + 3 + 2;
                                        if (var23 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class289 var24 = new class289(var23 + 1);
                                        var24.method1814(var23, true);
                                        var24.method1814(0, true);
                                        var24.method1835(true, var17);
                                        var24.method1835(true, var20);
                                        var24.method1850(-125);
                                        var21.method2281(var24.field4408, 0, var24.field4399, 0);
                                    }
                                } catch (Exception var33) {
                                }
                                try {
                                    if (var21 != null) {
                                        var21.method2276(-2771);
                                    }
                                } catch (Exception var31) {
                                }
                            }
                        }
                        class123.field2142.method1527(500, class7.field110);
                        class135.field2271.method1635((byte) 28, class7.field110);
                        class102.field1942.method842(false, class7.field110);
                    } else if (class216.field3417.method2321(0) >= class291.field4445) {
                        class216.field3417.method2322(0, class291.field4445, (byte) 114, var13.field4408);
                        var13.field4399 = 0;
                        class239.field3706 = var13.method1858(-3256);
                        class253.field3882 = var13.method1858(-3256);
                        class453.field6733 = var13.method1858(-3256) == 1;
                        class85.field1747 = var13.method1858(-3256) == 1;
                        class191.field3084 = var13.method1858(-3256) == 1;
                        class230.field3566 = var13.method1841((byte) -122);
                        class464.field6887 = class230.field3566 > 0;
                        class46.field964 = var13.method1841((byte) -125);
                        class308.field4671 = var13.method1841((byte) -126);
                        class454.field6752 = var13.method1841((byte) 107);
                        class61.field1256 = var13.method1815((byte) -100);
                        class127.field2171 = class497.field7305.method2876(0, class61.field1256);
                        class80.field1605 = var13.method1858(-3256);
                        class193.field3110 = var13.method1841((byte) 127);
                        class133.field2228 = var13.method1841((byte) -118);
                        class191.field3072 = var13.method1858(-3256) == 1;
                        class15.field266.field5381 = class15.field266.field5348 = var13.method1838(84);
                        class134.field2254 = new class248();
                        class134.field2254.field3818 = var13.method1841((byte) -121);
                        if (class134.field2254.field3818 == 65535) {
                            class134.field2254.field3818 = -1;
                        }
                        class134.field2254.field3826 = var13.method1838(83);
                        if (class9.field137 != class522.field7582) {
                            class134.field2254.field3815 = class134.field2254.field3818 + 50000;
                            class134.field2254.field3824 = class134.field2254.field3818 + 40000;
                        }
                        if (class522.field7582 != class490.field7190 && (class444.field6606.method1604(10, class199.field3244) || class444.field6606.method1604(10, class3.field69))) {
                            class444.field6606 = class134.field2254;
                        }
                    } else {
                        return;
                    }
                    if ((!class453.field6733 || class191.field3084) && !class464.field6887) {
                        try {
                            class227.method1509(class497.field7305.field7072, "unzap", 29436);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class227.method1509(class497.field7305.field7072, "zap", 29436);
                        } catch (Throwable var32) {
                            if (class171.field2774) {
                                try {
                                    class497.field7305.field7072.getAppletContext().showDocument(new URL(class497.field7305.field7072.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var29) {
                                }
                            }
                        }
                    }
                    if (class9.field137 == class522.field7582) {
                        try {
                            class227.method1509(class497.field7305.field7072, "loggedin", 29436);
                        } catch (Throwable var28) {
                        }
                    }
                    if (class68.field1382 != 2 && class68.field1382 != 3) {
                        class179.field2910 = 0;
                        class252.method1626(2, 123);
                        class267.method1698(70);
                        class253.method1639(6, -16646);
                        class523.field7592 = null;
                        return;
                    }
                    class179.field2910 = 11;
                }
                if (class179.field2910 == 11) {
                    if (class216.field3417.method2321(0) < 3) {
                        return;
                    }
                    class216.field3417.method2322(0, 3, (byte) 114, class219.field3446.field4408);
                    class179.field2910 = 12;
                }
                if (class179.field2910 == 12) {
                    class43 var25 = class219.field3446;
                    var25.field4399 = 0;
                    if (var25.method260((byte) -126)) {
                        if (class216.field3417.method2321(0) < 1) {
                            return;
                        }
                        class216.field3417.method2322(3, 1, (byte) 114, var25.field4408);
                    }
                    class523.field7592 = class177.method1215(73)[var25.method269((byte) 46)];
                    class234.field3606 = var25.method1841((byte) 21);
                    class179.field2910 = 10;
                }
                if (class179.field2910 == 10) {
                    if (class216.field3417.method2321(0) >= class234.field3606) {
                        class216.field3417.method2322(0, class234.field3606, (byte) 114, class219.field3446.field4408);
                        class219.field3446.field4399 = 0;
                        class179.field2910 = 0;
                        int var26 = class234.field3606;
                        class252.method1626(2, -7);
                        class211.method1436((byte) 90);
                        class332.method2099(-9, class219.field3446);
                        class49.field995 = -1;
                        class486.method2911((byte) -96);
                        if (class219.field3446.field4399 != var26) {
                            throw new RuntimeException("lswp pos:" + class219.field3446.field4399 + " psize:" + var26);
                        }
                        class523.field7592 = null;
                    }
                } else if (class179.field2910 == 14) {
                    if (class234.field3606 == -2) {
                        if (class216.field3417.method2321(0) < 2) {
                            return;
                        }
                        class216.field3417.method2322(0, 2, (byte) 114, class219.field3446.field4408);
                        class219.field3446.field4399 = 0;
                        class234.field3606 = class219.field3446.method1841((byte) 66);
                    }
                    if (class216.field3417.method2321(0) >= class234.field3606) {
                        class216.field3417.method2322(0, class234.field3606, (byte) 114, class219.field3446.field4408);
                        class219.field3446.field4399 = 0;
                        int var27 = class234.field3606;
                        class179.field2910 = 0;
                        class252.method1626(15, -39);
                        class156.method1128(9);
                        class332.method2099(-9, class219.field3446);
                        if (class219.field3446.field4399 != var27) {
                            throw new RuntimeException("lswpr pos:" + class219.field3446.field4399 + " psize:" + var27);
                        }
                        class523.field7592 = null;
                    }
                }
            } else if (class216.field3417.method2321(0) >= 1) {
                class291.field4445 = class216.field3417.method2328(0);
                class179.field2910 = 9;
            }
        } catch (IOException var34) {
            if (class216.field3417 != null) {
                class216.field3417.method2319((byte) 124);
                class216.field3417 = null;
            }
            if (class496.field7281 >= 1) {
                class179.field2910 = 0;
                class252.method1626(-4, 118);
                class59.method527(4);
            } else {
                class179.field2910 = 1;
                class73.field1465 = 0;
                if (class68.field1382 == 2 || class68.field1382 == 3) {
                    class444.field6606.field3822 = !class444.field6606.field3822;
                } else {
                    class397.field6032.field3822 = !class397.field6032.field3822;
                }
                class496.field7281++;
            }
        }
    }
}
