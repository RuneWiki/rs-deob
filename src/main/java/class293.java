import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class293 {

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "B")
    public byte field4614;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field4619;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Lol;")
    public class293 field4608;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Lqu;")
    public static class219 field4621 = new class219(43, 0);

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Z")
    public static boolean field4628 = false;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field4626 = 0;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "Z")
    public static boolean field4625 = false;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lqu;")
    public static class219 field4624 = new class219(10, 7);

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "[I")
    public static int[] field4630 = new int[100];

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public int field4616;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
    public int field4617;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public int field4618;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public int field4620;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public int field4629;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)Lks;")
    public final class323 method1966(int arg0) {
        field4610++;
        return arg0 == -2 ? class439.method2786(-29401, this.field4619) : null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public static void method1967(byte arg0) {
        field4624 = null;
        field4630 = null;
        field4621 = null;
        if (arg0 > -18) {
            method1967((byte) -32);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public static final void method1968(byte arg0) {
        field4613++;
        if (class46.field606 == 0 || class46.field606 == 6) {
            return;
        }
        try {
            if ((++class310.field4842) > 2000) {
                if (class338.field5281 != null) {
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                }
                if (class292.field4606 >= 1) {
                    class46.field606 = 0;
                    class319.method2139(true, -5);
                    return;
                }
                class46.field606 = 1;
                class310.field4842 = 0;
                if (class334.field5227 == 2 || class334.field5227 == 3) {
                    class95.field1387.field7726 = !class95.field1387.field7726;
                } else {
                    class407.field6152.field7726 = !class407.field6152.field7726;
                }
                class292.field4606++;
            }
            if (class46.field606 == 1) {
                if (class334.field5227 == 2 || class334.field5227 == 3) {
                    class372.field5721 = class339.field5294.method32(class95.field1387.field7721, 0, class95.field1387.method3123(true));
                } else {
                    class372.field5721 = class339.field5294.method32(class407.field6152.field7721, 0, class407.field6152.method3123(true));
                }
                class46.field606 = 2;
            }
            if (class46.field606 == 2) {
                if (class372.field5721.field7458 == 2) {
                    throw new IOException();
                }
                if (class372.field5721.field7458 != 1) {
                    return;
                }
                class338.field5281 = class508.method3080(34037, 5000, (Socket) class372.field5721.field7462);
                class372.field5721 = null;
                long var1 = class51.field697 = class335.method2229(class372.field5719, 37);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class170.field2488.field3162 = 0;
                class170.field2488.method1479((byte) -96, class432.field6519.field4683);
                class170.field2488.method1479((byte) -106, var3);
                class338.field5281.method1895(10, 2, class170.field2488.field3193, 0);
                class46.field606 = 3;
            }
            if (class46.field606 == 3) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 124, 1);
                int var4 = class279.field4428.field3193[0] & 0xFF;
                if (var4 != 0) {
                    class46.field606 = 0;
                    class319.method2139(true, var4);
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    class135.method829(true);
                    return;
                }
                class46.field606 = 4;
            }
            if (class46.field606 == 4) {
                if (!class338.field5281.method1893((byte) 24, 8)) {
                    return;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 46, 8);
                class279.field4428.field3162 = 0;
                class261.field4217 = class279.field4428.method1435(106);
                class208 var5 = new class208(70);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class261.field4217 >> 32), (int) class261.field4217 };
                var5.method1479((byte) -124, 10);
                var5.method1477(65280, var6[0]);
                var5.method1477(65280, var6[1]);
                var5.method1477(65280, var6[2]);
                var5.method1477(65280, var6[3]);
                var5.method1439(class335.method2229(class372.field5719, 37), 67);
                var5.method1458(class270.field4310, (byte) 78);
                var5.method1449(0, class75.field1123, class440.field6824);
                class276 var7 = class170.field2488;
                var7.field3162 = 0;
                if (class334.field5227 == 2 || class334.field5227 == 3) {
                    if (class148.field1994 == 12) {
                        var7.method1479((byte) -88, class432.field6523.field4683);
                    } else {
                        var7.method1479((byte) -119, class432.field6521.field4683);
                    }
                    var7.method1437(0, 0);
                    int var8 = var7.field3162;
                    var7.method1477(65280, 600);
                    var7.method1479((byte) -126, class300.field4718);
                    var7.method1479((byte) -101, class5.method47(-1129530388));
                    var7.method1437(class489.field7400, 0);
                    var7.method1437(class219.field3715, 0);
                    var7.method1479((byte) -124, class141.field1911.field6097);
                    class531.method3155(24, var7);
                    var7.method1458(class77.field1153, (byte) 78);
                    var7.method1477(65280, class348.field5403);
                    class208 var9 = class141.field1911.method1631(-57);
                    var7.method1479((byte) -110, var9.field3162);
                    var7.method1474(var9.field3193, 0, var9.field3162, (byte) -114);
                    class256.field4144 = true;
                    var7.method1437(class491.field7438, 0);
                    var7.method1437(class159.field2168, 0);
                    class393.method2507(-14214);
                    var7.method1474(var5.field3193, 0, var5.field3162, (byte) -122);
                    var7.method1461(var7.field3162 - var8, (byte) -98);
                } else {
                    var7.method1479((byte) -101, class432.field6524.field4683);
                    var7.method1437(0, 0);
                    int var10 = var7.field3162;
                    var7.method1477(65280, 600);
                    var7.method1479((byte) -125, class516.field7674.field3873);
                    var7.method1479((byte) -125, class12.field131);
                    class531.method3155(24, var7);
                    var7.method1458(class77.field1153, (byte) 78);
                    var7.method1477(65280, class348.field5403);
                    class393.method2507(-14214);
                    var7.method1474(var5.field3193, 0, var5.field3162, (byte) -105);
                    var7.method1461(var7.field3162 - var10, (byte) -98);
                }
                class338.field5281.method1895(10, var7.field3162, var7.field3193, 0);
                var7.method1859(86, var6);
                for (int var11 = 0; var11 < 4; var11++) {
                    var6[var11] += 50;
                }
                class279.field4428.method1859(45, var6);
                class46.field606 = 5;
            }
            if (class46.field606 == 5) {
                if (!class338.field5281.method1893((byte) 24, 1)) {
                    return;
                }
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 119, 1);
                int var12 = class279.field4428.field3193[0] & 0xFF;
                if (var12 == 21) {
                    class46.field606 = 8;
                } else if (var12 == 29) {
                    class46.field606 = 14;
                } else if (var12 == 1) {
                    class46.field606 = 6;
                    class319.method2139(true, var12);
                    return;
                } else if (var12 == 2) {
                    class46.field606 = 9;
                } else if (var12 == 15) {
                    class46.field606 = 15;
                    class156.field2156 = -2;
                } else if (var12 == 23 && class292.field4606 < 1) {
                    class292.field4606++;
                    class310.field4842 = 0;
                    class46.field606 = 1;
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    return;
                } else {
                    class46.field606 = 0;
                    class319.method2139(true, var12);
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    class135.method829(true);
                    return;
                }
            }
            if (class46.field606 == 7) {
                class170.field2488.field3162 = 0;
                class170.field2488.method1851(class432.field6522.field4683, -1342326174);
                class338.field5281.method1895(10, class170.field2488.field3162, class170.field2488.field3193, 0);
                class46.field606 = 5;
            } else if (class46.field606 == 8) {
                if (class338.field5281.method1893((byte) 24, 1)) {
                    class338.field5281.method1896(0, class279.field4428.field3193, (byte) 95, 1);
                    int var13 = class279.field4428.field3193[0] & 0xFF;
                    class46.field606 = 0;
                    class360.field5581 = var13 * 60 + 180;
                    class319.method2139(true, 21);
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    class135.method829(true);
                }
            } else if (class46.field606 == 14) {
                if (class338.field5281.method1893((byte) 24, 1)) {
                    class338.field5281.method1896(0, class279.field4428.field3193, (byte) 23, 1);
                    class531.field7793 = class279.field4428.field3193[0] & 0xFF;
                    class46.field606 = 0;
                    class319.method2139(true, 29);
                    class338.field5281.method1892(90);
                    class338.field5281 = null;
                    class135.method829(true);
                }
            } else if (class46.field606 != 9) {
                if (class46.field606 == 10) {
                    class276 var14 = class279.field4428;
                    if (class334.field5227 == 3) {
                        class463.field7118 = true;
                    } else {
                        class463.field7118 = false;
                    }
                    if (class334.field5227 == 2 || class334.field5227 == 3) {
                        if (!class338.field5281.method1893((byte) 24, class271.field4326)) {
                            return;
                        }
                        class338.field5281.method1896(0, var14.field3193, (byte) 115, class271.field4326);
                        var14.field3162 = 0;
                        class439.field6815 = var14.method1445(97);
                        class189.field2756 = var14.method1445(-117);
                        class504.field7552 = var14.method1445(95) == 1;
                        class225.field3771 = var14.method1445(91) == 1;
                        class152.field2018 = var14.method1445(-103) == 1;
                        class103.field1504 = var14.method1445(115) == 1;
                        class528.field7772 = var14.method1455(-3387);
                        class198.field3050 = var14.method1445(-82) == 1;
                        class513.field7613 = var14.method1416(-95);
                        class153.field2049 = var14.method1445(-126) == 1;
                        if (class334.field5227 == 3) {
                            boolean var15 = var14.method1445(61) == 1;
                            if (var15) {
                                long var16 = var14.method1435(112);
                                String var18 = class33.method211(0, var16);
                                int var19 = var14.method1445(105);
                                byte[] var20 = new byte[var19];
                                var14.method1857(var19, 7, var20, 0);
                                String var21 = class474.method2950(194, var20);
                                class488 var22 = null;
                                try {
                                    class495 var23 = class339.field5294.method19(19, false, "3");
                                    while (var23.field7458 == 0) {
                                        class208.method1464((byte) -75, 1L);
                                    }
                                    if (var23.field7458 == 1) {
                                        var22 = (class488) var23.field7462;
                                        int var24 = var18.length() + var21.length() + 2 + 3 + 4;
                                        if (var24 > 50) {
                                            throw new RuntimeException(">50");
                                        }
                                        class208 var25 = new class208(var24 + 1);
                                        var25.method1479((byte) -95, var24);
                                        var25.method1479((byte) -109, 0);
                                        var25.method1454(var18, (byte) 31);
                                        var25.method1454(var21, (byte) 127);
                                        var25.method1451(-21576);
                                        var22.method2995(true, var25.field3162, var25.field3193, 0);
                                    }
                                } catch (Exception var34) {
                                }
                                try {
                                    if (var22 != null) {
                                        var22.method2994(-30563);
                                    }
                                } catch (Exception var32) {
                                }
                            }
                        }
                        class454.field7029.method3007(class153.field2049, (byte) -119);
                        class337.field5262.method2080(class153.field2049, false);
                        class6.field72.method2980(class153.field2049, (byte) -87);
                    } else if (class338.field5281.method1893((byte) 24, class271.field4326)) {
                        class338.field5281.method1896(0, var14.field3193, (byte) 15, class271.field4326);
                        var14.field3162 = 0;
                        class439.field6815 = var14.method1445(-110);
                        class189.field2756 = var14.method1445(29);
                        class504.field7552 = var14.method1445(24) == 1;
                        class225.field3771 = var14.method1445(-117) == 1;
                        class152.field2018 = var14.method1445(-106) == 1;
                        class177.field2594 = var14.method1455(-3387);
                        class198.field3050 = class177.field2594 > 0;
                        class433.field6536 = var14.method1455(-3387);
                        class201.field3058 = var14.method1455(-3387);
                        class20.field228 = var14.method1455(-3387);
                        class278.field4388 = var14.method1436((byte) 123);
                        class439.field6818 = class339.field5294.method15(31697, class278.field4388);
                        class95.field1389 = var14.method1445(117);
                        class254.field4112 = var14.method1455(-3387);
                        class75.field1116 = var14.method1455(-3387);
                        class67.field1026 = var14.method1445(57) == 1;
                        class358.field5565.field5443 = class358.field5565.field5417 = var14.method1463((byte) -106);
                        class429.field6511 = new class522();
                        class429.field6511.field7722 = var14.method1455(-3387);
                        if (class429.field6511.field7722 == 65535) {
                            class429.field6511.field7722 = -1;
                        }
                        class429.field6511.field7721 = var14.method1463((byte) -35);
                        if (class209.field3228 != class181.field2626) {
                            class429.field6511.field7728 = class429.field6511.field7722 + 50000;
                            class429.field6511.field7724 = class429.field6511.field7722 + 40000;
                        }
                        if (class77.field1152 != class209.field3228 && (class95.field1387.method3120(class310.field4862, (byte) -125) || class95.field1387.method3120(class540.field7899, (byte) 45))) {
                            class95.field1387 = class429.field6511;
                        }
                    } else {
                        return;
                    }
                    if ((!class504.field7552 || class152.field2018) && !class198.field3050) {
                        try {
                            class200.method1370(-73, class339.field5294.field27, "unzap");
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            class200.method1370(-122, class339.field5294.field27, "zap");
                        } catch (Throwable var33) {
                            if (class187.field2731) {
                                try {
                                    class339.field5294.field27.getAppletContext().showDocument(new URL(class339.field5294.field27.getCodeBase(), "blank.ws"), "tbi");
                                } catch (Exception var31) {
                                }
                            }
                        }
                    }
                    if (class209.field3228 == class181.field2626) {
                        try {
                            class200.method1370(121, class339.field5294.field27, "loggedin");
                        } catch (Throwable var29) {
                        }
                    }
                    if (class334.field5227 != 2 && class334.field5227 != 3) {
                        class46.field606 = 0;
                        class319.method2139(true, 2);
                        class413.method2636((byte) 11);
                        class89.method610(6, (byte) -104);
                        class471.field7212 = null;
                        return;
                    }
                    class46.field606 = 12;
                }
                if (class46.field606 == 12) {
                    if (!class338.field5281.method1893((byte) 24, 3)) {
                        return;
                    }
                    class338.field5281.method1896(0, class279.field4428.field3193, (byte) 114, 3);
                    class46.field606 = 13;
                }
                if (class46.field606 == 13) {
                    class276 var26 = class279.field4428;
                    var26.field3162 = 0;
                    if (var26.method1861((byte) 127)) {
                        if (!class338.field5281.method1893((byte) 24, 1)) {
                            return;
                        }
                        class338.field5281.method1896(3, var26.field3193, (byte) 29, 1);
                    }
                    class471.field7212 = class348.method2298(199)[var26.method1853((byte) -109)];
                    class156.field2156 = var26.method1455(-3387);
                    class46.field606 = 11;
                }
                if (class46.field606 == 11) {
                    if (class338.field5281.method1893((byte) 24, class156.field2156)) {
                        class338.field5281.method1896(0, class279.field4428.field3193, (byte) 122, class156.field2156);
                        class279.field4428.field3162 = 0;
                        class46.field606 = 0;
                        int var27 = class156.field2156;
                        class319.method2139(true, 2);
                        class178.method1136((byte) 117);
                        class10.method64(true, class279.field4428);
                        class517.field7675 = -1;
                        class363.method2388(8);
                        if (class279.field4428.field3162 != var27) {
                            throw new RuntimeException("lswp pos:" + class279.field4428.field3162 + " psize:" + var27);
                        }
                        class471.field7212 = null;
                    }
                } else if (class46.field606 == 15) {
                    if (class156.field2156 == -2) {
                        if (!class338.field5281.method1893((byte) 24, 2)) {
                            return;
                        }
                        class338.field5281.method1896(0, class279.field4428.field3193, (byte) 47, 2);
                        class279.field4428.field3162 = 0;
                        class156.field2156 = class279.field4428.method1455(-3387);
                    }
                    if (class338.field5281.method1893((byte) 24, class156.field2156)) {
                        class338.field5281.method1896(0, class279.field4428.field3193, (byte) 39, class156.field2156);
                        class279.field4428.field3162 = 0;
                        class46.field606 = 0;
                        int var28 = class156.field2156;
                        class319.method2139(true, 15);
                        class166.method1047((byte) -9);
                        class10.method64(true, class279.field4428);
                        if (class279.field4428.field3162 != var28) {
                            throw new RuntimeException("lswpr pos:" + class279.field4428.field3162 + " psize:" + var28);
                        }
                        class471.field7212 = null;
                    }
                } else if (arg0 >= -19) {
                    method1968((byte) -59);
                }
            } else if (class338.field5281.method1893((byte) 24, 1)) {
                class338.field5281.method1896(0, class279.field4428.field3193, (byte) 109, 1);
                class271.field4326 = class279.field4428.field3193[0] & 0xFF;
                class46.field606 = 10;
            }
        } catch (IOException var35) {
            if (class338.field5281 != null) {
                class338.field5281.method1892(90);
                class338.field5281 = null;
            }
            if (class292.field4606 >= 1) {
                class46.field606 = 0;
                class319.method2139(true, -4);
                class135.method829(true);
            } else {
                class46.field606 = 1;
                class292.field4606++;
                if (class334.field5227 == 2 || class334.field5227 == 3) {
                    class95.field1387.field7726 = !class95.field1387.field7726;
                } else {
                    class407.field6152.field7726 = !class407.field6152.field7726;
                }
                class310.field4842 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZII)Lol;")
    public final class293 method1969(int arg0, boolean arg1, int arg2, int arg3) {
        field4622++;
        return arg1 ? new class293(this.field4619, arg3, arg2, arg0, this.field4614) : null;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIIIB)V")
    public class293(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4614 = arg4;
        this.field4607 = arg1;
        this.field4619 = arg0;
        this.field4623 = arg3;
        this.field4627 = arg2;
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lol;I)V")
    public class293(class293 arg0, int arg1) {
        this.field4608 = arg0;
        this.field4627 = this.field4608.field4627 + arg1;
        this.field4614 = this.field4608.field4614;
        this.field4623 = this.field4608.field4623 + arg1;
        this.field4607 = this.field4608.field4607 + arg1;
        this.field4619 = this.field4608.field4619;
    }
}
