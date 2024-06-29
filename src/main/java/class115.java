import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class115 extends class80 {

    @OriginalMember(owner = "client!er", name = "o", descriptor = "Ljava/net/Socket;")
    private Socket field1757;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "Ljn;")
    private class749 field1752;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Lqu;")
    private class104 field1749;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lok;")
    public static class266 field1750 = new class266();

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Z")
    public final boolean method616(int arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            this.field1757 = null;
        }
        field1748++;
        return this.field1752.method4171(arg0, 17896);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method860(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1758++;
        boolean var6 = true;
        if (arg3 != 16223) {
            return true;
        }
        class494 var7 = new class494(arg2);
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method2985((byte) 100);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class282 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2993(120);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method2964((byte) 112);
                                    }
                                    int var12 = var7.method2993(126);
                                    if (var12 == 0) {
                                        continue label74;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = var10 >> 6 & 0x3F;
                                    var15 = var7.method2964((byte) 37) >> 2;
                                    var16 = arg0 + var14;
                                    var17 = var13 + arg1;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (arg5 - 1 <= var16);
                    } while (arg4 - 1 <= var17);
                    var18 = class277.field4038.method3919(true, var8);
                } while (var15 == 22 && class21.field353.field10067.method3318(-73) == 0 && var18.field4149 == 0 && var18.field4103 != 1 && !var18.field4127);
                if (!var18.method1830((byte) 80)) {
                    class48.field613++;
                    var6 = false;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(B)V")
    public static final void method861(byte arg0) {
        field1751++;
        for (int var1 = 0; var1 < class190.field2932.length; var1++) {
            for (int var2 = 0; var2 < class190.field2932[0].length; var2++) {
                for (int var3 = 0; var3 < class190.field2932[0][0].length; var3++) {
                    class190.field2932[var1][var2][var3] = 0;
                }
            }
        }
        if (arg0 != 117) {
            field1750 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
    public static void method862(int arg0) {
        int var1 = -30 % ((arg0 - 8) / 46);
        field1750 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B[BII)V")
    public final void method615(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = -96 / ((arg0 + 25) / 36);
        this.field1749.method730(8800, arg3, arg2, arg1);
        field1747++;
    }

    @OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1760++;
        this.method612((byte) 107);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BI)I")
    public final int method620(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1756++;
        int var5 = -65 % ((arg1 + 33) / 54);
        return this.field1752.method4175(arg2, false, arg0, arg3);
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
    public final void method619(byte arg0) {
        this.field1752.method4169(-1);
        int var2 = 76 % ((arg0 + 10) / 49);
        field1753++;
        this.field1749.method731((byte) -62);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class115(Socket arg0, int arg1) throws IOException {
        this.field1757 = arg0;
        this.field1757.setSoTimeout(30000);
        this.field1757.setTcpNoDelay(true);
        this.field1752 = new class749(this.field1757.getInputStream(), arg1);
        this.field1749 = new class104(this.field1757.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)Z")
    public static final boolean method863(int arg0) throws IOException {
        field1754++;
        if (class527.field7529 == null) {
            return false;
        }
        if (class197.field3014 == null) {
            if (class432.field5847) {
                if (!class527.field7529.method616(1, 0)) {
                    return false;
                }
                class527.field7529.method620(0, 30, class110.field1640.field7050, 1);
                class154.field2189 = 0;
                class432.field5847 = false;
                class156.field2372++;
            }
            class110.field1640.field7042 = 0;
            if (class110.field1640.method2214(true)) {
                if (!class527.field7529.method616(1, 0)) {
                    return false;
                }
                class527.field7529.method620(1, -88, class110.field1640.field7050, 1);
                class154.field2189 = 0;
                class156.field2372++;
            }
            class432.field5847 = true;
            class21[] var1 = class258.method1685((byte) 8);
            int var2 = class110.field1640.method2215(23505);
            if (var2 < 0 || var1.length <= var2) {
                throw new IOException("invo:" + var2 + " ip:" + class110.field1640.field7042);
            }
            class197.field3014 = var1[var2];
            class15.field293 = class197.field3014.field345;
        }
        if (class15.field293 == -1) {
            if (!class527.field7529.method616(1, 0)) {
                return false;
            }
            class527.field7529.method620(0, arg0 - 118, class110.field1640.field7050, 1);
            class156.field2372++;
            class154.field2189 = 0;
            class15.field293 = class110.field1640.field7050[0] & 0xFF;
        }
        if (~class15.field293 == arg0) {
            if (!class527.field7529.method616(2, arg0 ^ 0x1)) {
                return false;
            }
            class527.field7529.method620(0, -105, class110.field1640.field7050, 2);
            class110.field1640.field7042 = 0;
            class15.field293 = class110.field1640.method2998(true);
            class154.field2189 = 0;
            class156.field2372 += 2;
        }
        if (class15.field293 > 0) {
            if (!class527.field7529.method616(class15.field293, 0)) {
                return false;
            }
            class110.field1640.field7042 = 0;
            class527.field7529.method620(0, arg0 ^ 0xFFFFFF81, class110.field1640.field7050, class15.field293);
            class156.field2372 += class15.field293;
            class154.field2189 = 0;
        }
        class467.field6559 = class518.field7312;
        class518.field7312 = class556.field7934;
        class556.field7934 = class197.field3014;
        if (class234.field3516 == class197.field3014) {
            class624.method3589(true, class647.field9056);
            class197.field3014 = null;
            return true;
        } else if (class386.field5354 == class197.field3014) {
            int var3 = class110.field1640.method2999((byte) 86);
            int var4 = class110.field1640.method2962(arg0 ^ 0x1);
            class351.method2221(-70);
            class744 var5 = (class744) class11.field217.method2242((long) var4, -1);
            class744 var6 = (class744) class11.field217.method2242((long) var3, -1);
            if (var6 != null) {
                class698.method3932((byte) 84, var6, var5 == null || var5.field10314 != var6.field10314, false);
            }
            if (var5 != null) {
                var5.method3387((byte) 107);
                class11.field217.method2241(-115, (long) var3, var5);
            }
            class451 var7 = class166.method1238((byte) -31, var4);
            if (var7 != null) {
                class564.method3329(var7, 8195);
            }
            class451 var8 = class166.method1238((byte) -58, var3);
            if (var8 != null) {
                class564.method3329(var8, 8195);
                class679.method3849(-22, var8, true);
            }
            if (class371.field5137 != -1) {
                class614.method3563(class371.field5137, 1, (byte) 40);
            }
            class197.field3014 = null;
            return true;
        } else if (class401.field5498 == class197.field3014) {
            int var9 = class110.field1640.method2938((byte) -67);
            String var10 = class110.field1640.method2996(118);
            class351.method2221(-104);
            class297.method1935(var9, var10, (byte) -123);
            class197.field3014 = null;
            return true;
        } else if (class659.field9191 == class197.field3014) {
            int var11 = class110.field1640.method2962(0);
            int var12 = var11 >> 28 & 0x3;
            int var13 = var11 >> 14 & 0x3FFF;
            int var14 = var11 & 0x3FFF;
            int var15 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            int var16 = var15 >> 2;
            int var17 = var15 & 0x3;
            int var18 = class48.field604[var16];
            int var19 = class110.field1640.method2998(true);
            int var20 = var14 - class88.field999;
            int var21 = var13 - class124.field1922;
            if (var19 == 65535) {
                var19 = -1;
            }
            class683.method3858(var21, var20, var16, var18, (byte) -36, var12, var17, var19);
            class197.field3014 = null;
            return true;
        } else if (class724.field10023 == class197.field3014) {
            int var22 = class110.field1640.method2993(38);
            int var23 = class110.field1640.method2976(arg0 - 127);
            int var24 = class110.field1640.method2964((byte) 118);
            String var25 = "";
            String var26 = var25;
            if ((var24 & 0x1) != 0) {
                var25 = class110.field1640.method2996(arg0 ^ 0x7F);
                if ((var24 & 0x2) == 0) {
                    var26 = var25;
                } else {
                    var26 = class110.field1640.method2996(arg0 ^ 0x7D);
                }
            }
            String var27 = class110.field1640.method2996(107);
            if (var22 == 99) {
                class587.method3423(var27, arg0 - 116);
            } else if (var26.equals("") || !class610.method3548(var26, (byte) 121)) {
                class788.method4313(var26, (byte) 51, var25, var27, var22, var23, var25);
            } else {
                class197.field3014 = null;
                return true;
            }
            class197.field3014 = null;
            return true;
        } else if (class366.field5098 == class197.field3014) {
            int var28 = class110.field1640.method2962(arg0 - 1);
            class351.method2221(arg0 ^ 0xFFFFFF8A);
            if (var28 == -1) {
                class429.field5830 = -1;
                class375.field5176 = -1;
            } else {
                int var29 = var28 >> 14 & 0x3FFF;
                int var30 = var28 & 0x3FFF;
                int var31 = var29 - class124.field1922;
                int var32 = var30 - class88.field999;
                if (var31 < 0) {
                    var31 = 0;
                } else if (class768.field10571 <= var31) {
                    var31 = class768.field10571;
                }
                class429.field5830 = (var31 << 9) + 256;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 >= class350.field4898) {
                    var32 = class350.field4898;
                }
                class375.field5176 = (var32 << 9) + 256;
            }
            class197.field3014 = null;
            return true;
        } else if (class726.field10040 == class197.field3014) {
            int var33 = class110.field1640.method2974((byte) -38);
            int var34 = class110.field1640.method2941(17511512);
            class351.method2221(-82);
            class352.method2238(var34, var33, -122277056);
            class197.field3014 = null;
            return true;
        } else if (class226.field3475 == class197.field3014) {
            class389.method2417(255);
            class197.field3014 = null;
            return false;
        } else if (class438.field5910 == class197.field3014) {
            int var35 = class110.field1640.method2964((byte) 94);
            class351.method2221(-86);
            class197.field3014 = null;
            class86.field950 = var35;
            return true;
        } else if (class785.field10797 == class197.field3014) {
            class624.method3589(true, class415.field5679);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class125.field1931) {
            boolean var36 = class110.field1640.method2964((byte) 123) == 1;
            String var37 = class110.field1640.method2996(109);
            long var38 = (long) class110.field1640.method2998(true);
            long var40 = (long) class110.field1640.method2960((byte) 94);
            int var42 = class110.field1640.method2964((byte) 90);
            long var43 = (var38 << 32) + var40;
            boolean var45 = false;
            Object var46 = null;
            class344 var47 = var36 ? class673.field9377 : class259.field3811;
            if (var47 == null) {
                var45 = true;
            } else {
                label2127: {
                    for (int var48 = 0; var48 < 100; var48++) {
                        if (class265.field3862[var48] == var43) {
                            var45 = true;
                            break label2127;
                        }
                    }
                    if (var42 <= 1) {
                        if (!(!class404.field5525 || class34.field466) || class338.field4740) {
                            var45 = true;
                        } else if (class610.method3548(var37, (byte) 127)) {
                            var45 = true;
                        }
                    }
                }
            }
            if (!var45 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var43;
                class17.field314 = (class17.field314 + 1) % 100;
                String var49 = class317.method2057(112, class699.method3933(class110.field1640, (byte) 102));
                int var50 = var36 ? 41 : 44;
                if (var42 == 2 || var42 == 3) {
                    class457.method2725(0, var49, var50, "<img=1>" + var37, var47.field4802, var37, "<img=1>" + var37, -47, -1);
                } else if (var42 == 1) {
                    class457.method2725(0, var49, var50, "<img=0>" + var37, var47.field4802, var37, "<img=0>" + var37, -82, -1);
                } else {
                    class457.method2725(0, var49, var50, var37, var47.field4802, var37, var37, 74, -1);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class119.field1832) {
            class725.field10027 = class110.field1640.method2956(false);
            class404.field5525 = class110.field1640.method2964((byte) 54) == 1;
            class197.field3014 = null;
            return true;
        } else if (class602.field8434 == class197.field3014) {
            int var51 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            int var52 = class110.field1640.method2938((byte) -67);
            int var53 = class110.field1640.method2944((byte) 4);
            int var54 = class110.field1640.method2940((byte) 99);
            int var55 = class110.field1640.method2976(arg0 ^ 0xFFFFFF85);
            int var56 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            int var57 = var54 & 0x7;
            int var58 = (var54 & 0x7F) >> 3;
            if (var58 == 15) {
                var58 = -1;
            }
            if ((var55 >> 30) != 0) {
                int var59 = var55 >> 28 & 0x3;
                int var60 = ((var55 & 0xFFFDA70) >> 14) - class124.field1922;
                int var61 = (var55 & 0x3FFF) - class88.field999;
                if (var60 >= 0 && var61 >= 0 && class768.field10571 > var60 && var61 < class350.field4898) {
                    int var62 = var60 * 512 + 256;
                    int var63 = var61 * 512 + 256;
                    int var64 = var59;
                    if (var59 < 3 && class124.method941(4, var61, var60)) {
                        var64 = var59 + 1;
                    }
                    class485 var65 = new class485(var52, var51, class192.field2961, var59, var64, var62, class702.method3970(var62, var59, -20103, var63) - var56, var63, var60, var60, var61, var61, var57);
                    class494.field7055.method1727(new class229(var65), (byte) 84);
                }
            } else if (var55 >> 29 != 0) {
                int var80 = var55 & 0xFFFF;
                class205 var81 = (class205) class645.field9014.method2242((long) var80, arg0 ^ 0xFFFFFFFE);
                if (var81 != null) {
                    class665 var82 = var81.field3181;
                    if (var52 == 65535) {
                        var52 = -1;
                    }
                    class733 var83 = var82.field4638[var53];
                    boolean var84 = true;
                    int var85 = var83.field10142;
                    if (var52 != -1 && var85 != -1) {
                        if (var52 == var85) {
                            class278 var86 = class456.field6385.method2382(var52, (byte) -121);
                            if (var86.field4042 && var86.field4040 != -1) {
                                class607 var87 = class563.field7993.method651(var86.field4040, (byte) 113);
                                int var88 = var87.field8501;
                                if (var88 == 0 || var88 == 2) {
                                    var84 = false;
                                } else if (var88 == 1) {
                                    var84 = true;
                                }
                            }
                        } else {
                            class278 var89 = class456.field6385.method2382(var52, (byte) -114);
                            class278 var90 = class456.field6385.method2382(var85, (byte) -103);
                            if (var89.field4040 != -1 && var90.field4040 != -1) {
                                class607 var91 = class563.field7993.method651(var89.field4040, (byte) 106);
                                class607 var92 = class563.field7993.method651(var90.field4040, (byte) 125);
                                if (var91.field8514 < var92.field8514) {
                                    var84 = false;
                                }
                            }
                        }
                    }
                    if (var84) {
                        var83.field10142 = var52;
                        var83.field10144 = var58;
                        var83.field10139 = 0;
                        var83.field10140 = 0;
                        var83.field10149 = class192.field2961 + var51;
                        var83.field10147 = 1;
                        var83.field10145 = var57;
                        var83.field10148 = var56;
                        if (var83.field10142 == 65535) {
                            var83.field10142 = -1;
                        }
                        if (var83.field10149 > class192.field2961) {
                            var83.field10140 = -1;
                        }
                        if (var83.field10142 != -1 && class192.field2961 == var83.field10149) {
                            int var93 = class456.field6385.method2382(var83.field10142, (byte) -107).field4040;
                            if (var93 != -1) {
                                class607 var94 = class563.field7993.method651(var93, (byte) 103);
                                if (var94 != null && var94.field8492 != null && !var82.field4577) {
                                    class760.method4227(255, var82, var94, 0);
                                }
                            }
                        }
                    }
                }
            } else if (var55 >> 28 != 0) {
                int var66 = var55 & 0xFFFF;
                class702 var67;
                if (class250.field3689 == var66) {
                    var67 = class210.field3250;
                } else {
                    var67 = class767.field10560[var66];
                }
                if (var67 != null) {
                    class733 var68 = var67.field4638[var53];
                    if (var52 == 65535) {
                        var52 = -1;
                    }
                    boolean var69 = true;
                    int var70 = var68.field10142;
                    if (var52 != -1 && var70 != -1) {
                        if (var52 == var70) {
                            class278 var71 = class456.field6385.method2382(var52, (byte) -80);
                            if (var71.field4042 && var71.field4040 != -1) {
                                class607 var72 = class563.field7993.method651(var71.field4040, (byte) 98);
                                int var73 = var72.field8501;
                                if (var73 == 0 || var73 == 2) {
                                    var69 = false;
                                } else if (var73 == 1) {
                                    var69 = true;
                                }
                            }
                        } else {
                            class278 var74 = class456.field6385.method2382(var52, (byte) -82);
                            class278 var75 = class456.field6385.method2382(var70, (byte) -82);
                            if (var74.field4040 != -1 && var75.field4040 != -1) {
                                class607 var76 = class563.field7993.method651(var74.field4040, (byte) 115);
                                class607 var77 = class563.field7993.method651(var75.field4040, (byte) 111);
                                if (var77.field8514 > var76.field8514) {
                                    var69 = false;
                                }
                            }
                        }
                    }
                    if (var69) {
                        var68.field10149 = class192.field2961 + var51;
                        var68.field10145 = var57;
                        var68.field10140 = 0;
                        var68.field10142 = var52;
                        var68.field10139 = 0;
                        var68.field10147 = 1;
                        var68.field10148 = var56;
                        var68.field10144 = var58;
                        if (var68.field10142 == 65535) {
                            var68.field10142 = -1;
                        }
                        if (var68.field10149 > class192.field2961) {
                            var68.field10140 = -1;
                        }
                        if (var68.field10142 != -1 && class192.field2961 == var68.field10149) {
                            int var78 = class456.field6385.method2382(var68.field10142, (byte) -128).field4040;
                            if (var78 != -1) {
                                class607 var79 = class563.field7993.method651(var78, (byte) 100);
                                if (var79 != null && var79.field8492 != null && !var67.field4577) {
                                    class760.method4227(255, var67, var79, 0);
                                }
                            }
                        }
                    }
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class789.field10827 == class197.field3014) {
            int var95 = class110.field1640.method2998(true);
            if (var95 == 65535) {
                var95 = -1;
            }
            int var96 = class110.field1640.method2941(17511512);
            class351.method2221(-105);
            class490.method2925(var95, true, var96);
            class197.field3014 = null;
            return true;
        } else if (class391.field5382 == class197.field3014) {
            int var97 = class110.field1640.method2941(17511512);
            class351.method2221(-101);
            class312.method2000(var97, class250.field3689, 5, arg0 ^ 0xFFFFFFFE, 0);
            class197.field3014 = null;
            return true;
        } else if (class65.field780 == class197.field3014) {
            class624.method3589(true, class289.field4239);
            class197.field3014 = null;
            return true;
        } else if (class768.field10569 == class197.field3014) {
            int var98 = class110.field1640.method2974((byte) -120);
            byte var99 = class110.field1640.method2943((byte) 16);
            class537.field7727.method4136(var98, -12735, var99);
            class197.field3014 = null;
            return true;
        } else if (class635.field8908 == class197.field3014) {
            int var100 = class110.field1640.method2938((byte) -67);
            String var101 = class110.field1640.method2996(107);
            class351.method2221(-85);
            class297.method1935(var100, var101, (byte) 82);
            class197.field3014 = null;
            return true;
        } else if (class597.field8397 == class197.field3014) {
            class139.field2074 = class366.field5096;
            boolean var102 = class110.field1640.method2964((byte) 76) == 1;
            class256 var103 = new class256(class110.field1640);
            class276 var104;
            if (var102) {
                var104 = class195.field2999;
            } else {
                var104 = class393.field5405;
            }
            var103.method1670(var104, -1);
            class197.field3014 = null;
            return true;
        } else if (class653.field9129 == class197.field3014) {
            if (class161.field2561 != null) {
                class666.method3797(-1, -94, -1, false, class21.field353.field10097.method3352(-28));
            }
            byte[] var105 = new byte[class15.field293];
            class110.field1640.method2209(0, 87, var105, class15.field293);
            String var106 = class74.method589(var105, 0, arg0 ^ 0x1, class15.field293);
            class613.method3562(true, class519.field7328, -122, var106, class21.field353.field10098.method1588(-76) == 1);
            class197.field3014 = null;
            return true;
        } else if (class688.field9559 == class197.field3014) {
            int var107 = class110.field1640.method2962(0);
            String var108 = class110.field1640.method2996(arg0 ^ 0x7F);
            class351.method2221(arg0 - 108);
            class399.method2459(var107, var108, arg0 ^ 0xFFFFFFFC);
            class197.field3014 = null;
            return true;
        } else if (class81.field903 == class197.field3014) {
            int var109 = class110.field1640.method2998(true);
            if (var109 == 65535) {
                var109 = -1;
            }
            int var110 = class110.field1640.method2964((byte) 113);
            int var111 = class110.field1640.method2998(true);
            int var112 = class110.field1640.method2964((byte) 60);
            int var113 = class110.field1640.method2998(true);
            class442.method2635(var112, -102, var111, var110, var109, var113);
            class197.field3014 = null;
            return true;
        } else if (class397.field5457 == class197.field3014) {
            class624.method3589(true, class514.field7276);
            class197.field3014 = null;
            return true;
        } else if (class206.field3193 == class197.field3014) {
            int var114 = class110.field1640.method2982(-1);
            if (var114 == 65535) {
                var114 = -1;
            }
            int var115 = class110.field1640.method2999((byte) 101);
            class351.method2221(arg0 ^ 0xFFFFFF8B);
            class312.method2000(var115, var114, 1, -1, -1);
            class197.field3014 = null;
            return true;
        } else if (class220.field3413 == class197.field3014) {
            int var116 = class110.field1640.method2998(true);
            if (var116 == 65535) {
                var116 = -1;
            }
            int var117 = class110.field1640.method2964((byte) 106);
            int var118 = class110.field1640.method2998(true);
            int var119 = class110.field1640.method2964((byte) 42);
            int var120 = class110.field1640.method2998(true);
            class355.method2259(var120, true, var119, var118, false, var116, var117);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class123.field1904) {
            int var121 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            int var122 = class110.field1640.method2998(true);
            class351.method2221(arg0 ^ 0xFFFFFFB9);
            if (var121 == 2) {
                class355.method2257(101);
            }
            class371.field5137 = var122;
            class446.method2660(var122, 1);
            class661.method3773(false, -29);
            class379.method2356(class371.field5137);
            for (int var123 = 0; var123 < 100; var123++) {
                class698.field9719[var123] = true;
            }
            class197.field3014 = null;
            return true;
        } else if (class256.field3758 == class197.field3014) {
            int var124 = class110.field1640.method2941(17511512);
            if (class558.field7943 != var124) {
                class558.field7943 = var124;
                class379.method2352(class695.field9709, -1, -1);
            }
            class197.field3014 = null;
            return true;
        } else if (class21.field347 == class197.field3014) {
            if (class161.field2561 != null) {
                class666.method3797(-1, arg0 - 94, -1, false, class21.field353.field10097.method3352(arg0 ^ 0xFFFFFFC4));
            }
            byte[] var125 = new byte[class15.field293];
            class110.field1640.method2209(0, 116, var125, class15.field293);
            String var126 = class74.method589(var125, 0, 0, class15.field293);
            String var127 = "opensn";
            if (!class685.field9515 || class514.method3099(class519.field7328, true, var127, var126, 1).field2089 == 2) {
                class60.method402(true, var127, 13687, class21.field353.field10098.method1588(-43) == 1, class519.field7328, var126);
            }
            class197.field3014 = null;
            return true;
        } else if (class546.field7860 == class197.field3014) {
            class197.field3014 = null;
            return false;
        } else if (class333.field4702 == class197.field3014) {
            int var128 = class110.field1640.method2964((byte) 73);
            boolean var129 = (var128 & 0x1) == 1;
            String var130 = class110.field1640.method2996(117);
            String var131 = class110.field1640.method2996(arg0 + 126);
            if (var131.equals("")) {
                var131 = var130;
            }
            String var132 = class110.field1640.method2996(107);
            String var133 = class110.field1640.method2996(112);
            if (var133.equals("")) {
                var133 = var132;
            }
            if (var129) {
                for (int var134 = 0; var134 < class47.field600; var134++) {
                    if (class31.field431[var134].equals(var133)) {
                        class646.field9032[var134] = var130;
                        class31.field431[var134] = var131;
                        class758.field10440[var134] = var132;
                        class550.field7910[var134] = var133;
                        break;
                    }
                }
            } else {
                class646.field9032[class47.field600] = var130;
                class31.field431[class47.field600] = var131;
                class758.field10440[class47.field600] = var132;
                class550.field7910[class47.field600] = var133;
                class270.field3916[class47.field600] = class702.method3977(2, var128) == 2;
                class47.field600++;
            }
            class493.field6979 = class366.field5096;
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class103.field1183) {
            class737.method4104((byte) -102);
            class197.field3014 = null;
            return true;
        } else if (class647.field9049 == class197.field3014) {
            class326.field4562 = class110.field1640.method2986(-20802) == 1;
            class197.field3014 = null;
            return true;
        } else if (class715.field9933 == class197.field3014) {
            boolean var135 = class110.field1640.method2964((byte) 100) == 1;
            String var136 = class110.field1640.method2996(arg0 ^ 0x77);
            String var137 = var136;
            if (var135) {
                var137 = class110.field1640.method2996(101);
            }
            long var138 = (long) class110.field1640.method2998(true);
            long var140 = (long) class110.field1640.method2960((byte) 94);
            int var142 = class110.field1640.method2964((byte) 108);
            long var143 = (var138 << 32) + var140;
            boolean var145 = false;
            int var146 = 0;
            while (true) {
                if (var146 >= 100) {
                    if (var142 <= 1) {
                        if (!(!class404.field5525 || class34.field466) || class338.field4740) {
                            var145 = true;
                        } else if (class610.method3548(var137, (byte) -11)) {
                            var145 = true;
                        }
                    }
                    break;
                }
                if (class265.field3862[var146] == var143) {
                    var145 = true;
                    break;
                }
                var146++;
            }
            if (!var145 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var143;
                class17.field314 = (class17.field314 + 1) % 100;
                String var147 = class317.method2057(arg0 + 121, class699.method3933(class110.field1640, (byte) 50));
                if (var142 == 2) {
                    class457.method2725(0, var147, 7, "<img=1>" + var137, null, var136, "<img=1>" + var136, -126, -1);
                } else if (var142 == 1) {
                    class457.method2725(0, var147, 7, "<img=0>" + var137, null, var136, "<img=0>" + var136, arg0 + 78, -1);
                } else {
                    class457.method2725(0, var147, 3, var137, null, var136, var136, -123, -1);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class397.field5453 == class197.field3014) {
            class649.field9066 = class366.field5096;
            boolean var148 = class110.field1640.method2964((byte) 85) == 1;
            if (class15.field293 != 1) {
                if (var148) {
                    class673.field9377 = new class344(class110.field1640);
                } else {
                    class259.field3811 = new class344(class110.field1640);
                }
                class197.field3014 = null;
                return true;
            }
            class197.field3014 = null;
            if (var148) {
                class673.field9377 = null;
            } else {
                class259.field3811 = null;
            }
            return true;
        } else if (class351.field4912 == class197.field3014) {
            int var149 = class110.field1640.method2976(arg0 - 125);
            int var150 = class110.field1640.method2998(true);
            class351.method2221(-98);
            class301.method1947(var150, 14, var149);
            class197.field3014 = null;
            return true;
        } else if (class434.field5872 == class197.field3014) {
            int var151 = class110.field1640.method2964((byte) 67);
            int var152 = var151 >> 5;
            int var153 = var151 & 0x1F;
            if (var153 == 0) {
                class693.field9665[var152] = null;
                class197.field3014 = null;
                return true;
            }
            class589 var154 = new class589();
            var154.field8302 = var153;
            var154.field8300 = class110.field1640.method2964((byte) 95);
            if (var154.field8300 >= 0 && var154.field8300 < class454.field6372.length) {
                if (var154.field8302 == 1 || var154.field8302 == 10) {
                    var154.field8307 = class110.field1640.method2998(true);
                    class110.field1640.field7042 += 6;
                } else if (var154.field8302 >= 2 && var154.field8302 <= 6) {
                    if (var154.field8302 == 2) {
                        var154.field8311 = 256;
                        var154.field8309 = 256;
                    }
                    if (var154.field8302 == 3) {
                        var154.field8311 = 0;
                        var154.field8309 = 256;
                    }
                    if (var154.field8302 == 4) {
                        var154.field8311 = 512;
                        var154.field8309 = 256;
                    }
                    if (var154.field8302 == 5) {
                        var154.field8309 = 0;
                        var154.field8311 = 256;
                    }
                    if (var154.field8302 == 6) {
                        var154.field8311 = 256;
                        var154.field8309 = 512;
                    }
                    var154.field8302 = 2;
                    var154.field8305 = class110.field1640.method2964((byte) 49);
                    var154.field8311 += class110.field1640.method2998(true) - class124.field1922 << 9;
                    var154.field8309 += class110.field1640.method2998(true) - class88.field999 << 9;
                    var154.field8313 = class110.field1640.method2964((byte) 108) << 2;
                    var154.field8301 = class110.field1640.method2998(true);
                }
                var154.field8314 = class110.field1640.method2998(true);
                if (var154.field8314 == 65535) {
                    var154.field8314 = -1;
                }
                class693.field9665[var152] = var154;
            }
            class197.field3014 = null;
            return true;
        } else if (class300.field4332 == class197.field3014) {
            int var155 = class110.field1640.method2999((byte) 74);
            int var156 = class110.field1640.method2982(-1);
            class537.field7727.method4136(var156, -12735, var155);
            class197.field3014 = null;
            return true;
        } else if (class694.field9693 == class197.field3014) {
            int var157 = class110.field1640.method2962(0);
            int var158 = class110.field1640.method2982(-1);
            class351.method2221(arg0 ^ 0xFFFFFFBA);
            class747.method4163((byte) 69, var157, var158);
            class197.field3014 = null;
            return true;
        } else if (class359.field5047 == class197.field3014) {
            int var159 = class110.field1640.method2976(-127);
            class351.method2221(-87);
            class744 var160 = (class744) class11.field217.method2242((long) var159, -1);
            if (var160 != null) {
                class698.method3932((byte) 121, var160, true, false);
            }
            if (class274.field3954 != null) {
                class564.method3329(class274.field3954, 8195);
                class274.field3954 = null;
            }
            class197.field3014 = null;
            return true;
        } else if (class237.field3563 == class197.field3014) {
            int var161 = class110.field1640.method2998(true);
            int var162 = class110.field1640.method2986(-20802);
            boolean var163 = (var162 & 0x1) == 1;
            class778.method4277(7563, var161, var163);
            class689.field9619[class702.method3977(class194.field2991++, 31)] = var161;
            class197.field3014 = null;
            return true;
        } else if (class242.field3610 == class197.field3014) {
            class414.method2515(class110.field1640.method2996(126), 25799);
            class197.field3014 = null;
            return true;
        } else if (class20.field341 == class197.field3014) {
            class614.field8623 = class366.field5096;
            if (class15.field293 == 0) {
                class187.field2886 = 0;
                class459.field6423 = null;
                class197.field3014 = null;
                class666.field9270 = null;
                class762.field10501 = null;
                return true;
            }
            class666.field9270 = class110.field1640.method2996(104);
            boolean var164 = class110.field1640.method2964((byte) 98) == 1;
            if (var164) {
                class110.field1640.method2996(arg0 + 115);
            }
            long var165 = class110.field1640.method3005(-71);
            class459.field6423 = class288.method1856(var165, 37);
            class76.field863 = class110.field1640.method2943((byte) 16);
            int var167 = class110.field1640.method2964((byte) 68);
            if (var167 == 255) {
                class197.field3014 = null;
                return true;
            }
            class187.field2886 = var167;
            class342[] var168 = new class342[100];
            for (int var169 = 0; var169 < class187.field2886; var169++) {
                var168[var169] = new class342();
                var168[var169].field4770 = class110.field1640.method2996(125);
                boolean var175 = class110.field1640.method2964((byte) 43) == 1;
                if (var175) {
                    var168[var169].field4762 = class110.field1640.method2996(120);
                } else {
                    var168[var169].field4762 = var168[var169].field4770;
                }
                var168[var169].field4769 = class663.method3782((byte) 72, var168[var169].field4762);
                var168[var169].field4773 = class110.field1640.method2998(true);
                var168[var169].field4771 = class110.field1640.method2943((byte) 16);
                var168[var169].field4767 = class110.field1640.method2996(124);
                if (var168[var169].field4762.equals(class210.field3250.field9768)) {
                    class721.field9980 = var168[var169].field4771;
                }
            }
            boolean var170 = false;
            int var171 = class187.field2886;
            while (var171 > 0) {
                boolean var172 = true;
                var171--;
                for (int var173 = 0; var173 < var171; var173++) {
                    if (var168[var173].field4769.compareTo(var168[var173 + 1].field4769) > 0) {
                        class342 var174 = var168[var173];
                        var168[var173] = var168[var173 + 1];
                        var168[var173 + 1] = var174;
                        var172 = false;
                    }
                }
                if (var172) {
                    break;
                }
            }
            class197.field3014 = null;
            class762.field10501 = var168;
            return true;
        } else if (class197.field3014 == class178.field2784) {
            boolean var176 = class110.field1640.method2964((byte) 76) == 1;
            String var177 = class110.field1640.method2996(arg0 ^ 0x68);
            String var178 = var177;
            if (var176) {
                var178 = class110.field1640.method2996(119);
            }
            int var179 = class110.field1640.method2964((byte) 44);
            int var180 = class110.field1640.method2998(true);
            boolean var181 = false;
            if (var179 <= 1 && class610.method3548(var178, (byte) -83)) {
                var181 = true;
            }
            if (!var181 && class180.field2795 == 0) {
                String var182 = class204.field3172.method3795(var180, (byte) 122).method1344(class110.field1640, (byte) 127);
                if (var179 == 2) {
                    class457.method2725(0, var182, 25, "<img=1>" + var178, null, var177, "<img=1>" + var177, 110, var180);
                } else if (var179 == 1) {
                    class457.method2725(0, var182, 25, "<img=0>" + var178, null, var177, "<img=0>" + var177, 114, var180);
                } else {
                    class457.method2725(0, var182, 25, var178, null, var177, var177, arg0 ^ 0xFFFFFFAE, var180);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class582.field8218 == class197.field3014) {
            int var183 = class110.field1640.method2999((byte) 68);
            int var184 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            if (var184 == 65535) {
                var184 = -1;
            }
            int var185 = class110.field1640.method2976(-125);
            class351.method2221(-112);
            class618.method3568(var183, (byte) -28, var185, var184);
            class689 var186 = class313.field4456.method1681(var184, 87);
            class128.method962(var186.field9645, var185, 8, var186.field9613, var186.field9629);
            client.method2043(var185, var186.field9589, var186.field9608, var186.field9617, 24395);
            class197.field3014 = null;
            return true;
        } else if (class617.field8630 == class197.field3014) {
            class537.field7727.method4138(-126);
            class197.field3014 = null;
            class280.field4069 += 32;
            return true;
        } else if (class743.field10304 == class197.field3014) {
            String var187 = class110.field1640.method2996(121);
            String var188 = class317.method2057(114, class699.method3933(class110.field1640, (byte) 93));
            class788.method4313(var187, (byte) 51, var187, var188, 6, 0, var187);
            class197.field3014 = null;
            return true;
        } else if (class437.field5896 == class197.field3014) {
            class125.field1932 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            class413.field5649 = class110.field1640.method2978(true) << 3;
            class515.field7287 = class110.field1640.method3004(true) << 3;
            class197.field3014 = null;
            return true;
        } else if (class712.field9880 == class197.field3014) {
            class624.method3589(true, class451.field6189);
            class197.field3014 = null;
            return true;
        } else if (class742.field10284 == class197.field3014) {
            class413.field5649 = class110.field1640.method3004(true) << 3;
            class515.field7287 = class110.field1640.method2975(false) << 3;
            class125.field1932 = class110.field1640.method2940((byte) 96);
            for (class102 var189 = (class102) class250.field3692.method2243((byte) 100); var189 != null; var189 = (class102) class250.field3692.method2248(-15690)) {
                int var192 = (int) (var189.field8133 >> 28 & 0x3L);
                int var193 = (int) (var189.field8133 & 0x3FFFL);
                int var194 = var193 - class124.field1922;
                int var195 = (int) (var189.field8133 >> 14 & 0x3FFFL);
                int var196 = var195 - class88.field999;
                if (class125.field1932 == var192 && var194 >= class515.field7287 && (class515.field7287 + 8) > var194 && var196 >= class413.field5649 && class413.field5649 + 8 > var196) {
                    var189.method3387((byte) -86);
                    if (var194 >= 0 && var196 >= 0 && var194 < class768.field10571 && var196 < class350.field4898) {
                        class554.method3297(var194, class125.field1932, var196, arg0 ^ 0x4EA33F68);
                    }
                }
            }
            for (class506 var190 = (class506) class240.field3597.method1731((byte) -124); var190 != null; var190 = (class506) class240.field3597.method1724(arg0 ^ 0x1)) {
                if (class515.field7287 <= var190.field7189 && class515.field7287 + 8 > var190.field7189 && class413.field5649 <= var190.field7192 && class413.field5649 + 8 > var190.field7192 && class125.field1932 == var190.field7201) {
                    var190.field7194 = true;
                }
            }
            for (class506 var191 = (class506) class779.field10697.method1731((byte) -110); var191 != null; var191 = (class506) class779.field10697.method1724(0)) {
                if (class515.field7287 <= var191.field7189 && class515.field7287 + 8 > var191.field7189 && class413.field5649 <= var191.field7192 && var191.field7192 < (class413.field5649 + 8) && class125.field1932 == var191.field7201) {
                    var191.field7194 = true;
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class178.field2782) {
            String var197 = class110.field1640.method2996(106);
            Object[] var198 = new Object[var197.length() + 1];
            for (int var199 = var197.length() - 1; var199 >= 0; var199--) {
                if (var197.charAt(var199) == 's') {
                    var198[var199 + 1] = class110.field1640.method2996(111);
                } else {
                    var198[var199 + 1] = Integer.valueOf(class110.field1640.method2976(-128));
                }
            }
            var198[0] = Integer.valueOf(class110.field1640.method2976(-125));
            class351.method2221(-127);
            class166 var200 = new class166();
            var200.field2619 = var198;
            class379.method2349(var200);
            class197.field3014 = null;
            return true;
        } else if (class198.field3031 == class197.field3014) {
            class139.field2074 = class366.field5096;
            boolean var201 = class110.field1640.method2964((byte) 120) == 1;
            if (class15.field293 != 1) {
                if (var201) {
                    class195.field2999 = new class276(class110.field1640);
                } else {
                    class393.field5405 = new class276(class110.field1640);
                }
                class197.field3014 = null;
                return true;
            }
            if (var201) {
                class195.field2999 = null;
            } else {
                class393.field5405 = null;
            }
            class197.field3014 = null;
            return true;
        } else if (class652.field9101 == class197.field3014) {
            int var202 = class110.field1640.method2962(0);
            int var203 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            int var204 = class110.field1640.method2982(-1);
            class351.method2221(-97);
            class245.method1623((var203 << 16) + var204, -86, var202);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class106.field1272) {
            class66.field818 = class547.method3271((byte) 106, class110.field1640.method2964((byte) 122));
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class142.field2098) {
            int var205 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE) << 2;
            int var206 = class110.field1640.method2986(-20802);
            int var207 = class110.field1640.method2944((byte) 4);
            int var208 = class110.field1640.method2944((byte) 4);
            int var209 = class110.field1640.method2986(-20802);
            class351.method2221(-76);
            class226.method1541(var206, var205, var207, var209, false, var208);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class140.field2082) {
            boolean var210 = class110.field1640.method2964((byte) 56) == 1;
            String var211 = class110.field1640.method2996(105);
            String var212 = var211;
            if (var210) {
                var212 = class110.field1640.method2996(103);
            }
            long var213 = (long) class110.field1640.method2998(true);
            long var215 = (long) class110.field1640.method2960((byte) 94);
            int var217 = class110.field1640.method2964((byte) 52);
            int var218 = class110.field1640.method2998(true);
            long var219 = (var213 << 32) + var215;
            boolean var221 = false;
            int var222 = 0;
            while (true) {
                if (var222 >= 100) {
                    if (var217 <= 1 && class610.method3548(var212, (byte) 116)) {
                        var221 = true;
                    }
                    break;
                }
                if (class265.field3862[var222] == var219) {
                    var221 = true;
                    break;
                }
                var222++;
            }
            if (!var221 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var219;
                class17.field314 = (class17.field314 + 1) % 100;
                String var223 = class204.field3172.method3795(var218, (byte) 94).method1344(class110.field1640, (byte) 117);
                if (var217 == 2) {
                    class457.method2725(0, var223, 18, "<img=1>" + var212, null, var211, "<img=1>" + var211, 124, var218);
                } else if (var217 == 1) {
                    class457.method2725(0, var223, 18, "<img=0>" + var212, null, var211, "<img=0>" + var211, -111, var218);
                } else {
                    class457.method2725(0, var223, 18, var212, null, var211, var211, -85, var218);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class780.field10708 == class197.field3014) {
            int var224 = class110.field1640.method2962(0);
            int var225 = class110.field1640.method2964((byte) 116);
            int var226 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            class6.field51[var226] = var224;
            class732.field10133[var226] = var225;
            class529.field7628[var226] = 1;
            int var227 = class60.field735[var226] - 1;
            for (int var228 = 0; var228 < var227; var228++) {
                if (class629.field8817[var228] <= var224) {
                    class529.field7628[var226] = var228 + 2;
                }
            }
            class749.field10367[class702.method3977(class353.field4955++, 31)] = var226;
            class197.field3014 = null;
            return true;
        } else if (class37.field486 == class197.field3014) {
            class624.method3589(true, class176.field2740);
            class197.field3014 = null;
            return true;
        } else if (class564.field8015 == class197.field3014) {
            while (class110.field1640.field7042 < class15.field293) {
                boolean var239 = class110.field1640.method2964((byte) 75) == 1;
                String var240 = class110.field1640.method2996(104);
                String var241 = class110.field1640.method2996(112);
                int var242 = class110.field1640.method2998(true);
                int var243 = class110.field1640.method2964((byte) 60);
                String var244 = "";
                boolean var245 = false;
                if (var242 > 0) {
                    var244 = class110.field1640.method2996(123);
                    var245 = class110.field1640.method2964((byte) 84) == 1;
                }
                for (int var246 = 0; var246 < class22.field365; var246++) {
                    if (var239) {
                        if (var241.equals(class440.field5967[var246])) {
                            class440.field5967[var246] = var240;
                            var240 = null;
                            class36.field484[var246] = var241;
                            break;
                        }
                    } else if (var240.equals(class440.field5967[var246])) {
                        if (class207.field3210[var246] != var242) {
                            boolean var247 = true;
                            for (class20 var248 = (class20) class648.field9061.method2170(false); var248 != null; var248 = (class20) class648.field9061.method2176(-17754)) {
                                if (var248.field337.equals(var240)) {
                                    if (var242 != 0 && var248.field342 == 0) {
                                        var247 = false;
                                        var248.method3358(97);
                                    } else if (var242 == 0 && var248.field342 != 0) {
                                        var248.method3358(83);
                                        var247 = false;
                                    }
                                }
                            }
                            if (var247) {
                                class648.field9061.method2173(125, new class20(var240, var242));
                            }
                            class207.field3210[var246] = var242;
                        }
                        class36.field484[var246] = var241;
                        class377.field5210[var246] = var244;
                        class453.field6356[var246] = var243;
                        var240 = null;
                        class712.field9884[var246] = var245;
                        break;
                    }
                }
                if (var240 != null && class22.field365 < 200) {
                    class440.field5967[class22.field365] = var240;
                    class36.field484[class22.field365] = var241;
                    class207.field3210[class22.field365] = var242;
                    class377.field5210[class22.field365] = var244;
                    class453.field6356[class22.field365] = var243;
                    class712.field9884[class22.field365] = var245;
                    class22.field365++;
                }
            }
            class500.field7110 = 2;
            class493.field6979 = class366.field5096;
            boolean var229 = false;
            int var230 = class22.field365;
            while (var230 > 0) {
                var230--;
                boolean var231 = true;
                for (int var232 = 0; var232 < var230; var232++) {
                    if (class207.field3210[var232] != class5.field34.field763 && class207.field3210[var232 + 1] == class5.field34.field763 || class207.field3210[var232] == 0 && class207.field3210[var232 + 1] != 0) {
                        int var233 = class207.field3210[var232];
                        class207.field3210[var232] = class207.field3210[var232 + 1];
                        class207.field3210[var232 + 1] = var233;
                        String var234 = class377.field5210[var232];
                        class377.field5210[var232] = class377.field5210[var232 + 1];
                        class377.field5210[var232 + 1] = var234;
                        String var235 = class440.field5967[var232];
                        class440.field5967[var232] = class440.field5967[var232 + 1];
                        class440.field5967[var232 + 1] = var235;
                        String var236 = class36.field484[var232];
                        class36.field484[var232] = class36.field484[var232 + 1];
                        class36.field484[var232 + 1] = var236;
                        int var237 = class453.field6356[var232];
                        class453.field6356[var232] = class453.field6356[var232 + 1];
                        class453.field6356[var232 + 1] = var237;
                        boolean var238 = class712.field9884[var232];
                        class712.field9884[var232] = class712.field9884[var232 + 1];
                        var231 = false;
                        class712.field9884[var232 + 1] = var238;
                    }
                }
                if (var231) {
                    break;
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class206.field3191 == class197.field3014) {
            class351.method2221(-94);
            class202.method1415(24828);
            class197.field3014 = null;
            return true;
        } else if (class699.field9724 == class197.field3014) {
            int var249 = class110.field1640.method2998(true);
            int var250 = class110.field1640.method2938((byte) -67);
            int var251 = class110.field1640.method2998(true);
            int var252 = class110.field1640.method2962(0);
            class351.method2221(-73);
            class128.method962(var249, var252, 8, var251, var250);
            class197.field3014 = null;
            return true;
        } else if (class20.field343 == class197.field3014) {
            int var253 = class110.field1640.method2938((byte) -67);
            int var254 = class110.field1640.method2938((byte) -67);
            class351.method2221(-128);
            class75.method593(true, var253, 0, var254);
            class197.field3014 = null;
            return true;
        } else if (class712.field9881 == class197.field3014) {
            class513.field7251 = class110.field1640.method3004(true);
            if (class513.field7251 == 0 || class513.field7251 == 1) {
                class621.field8736 = true;
            }
            class197.field3014 = null;
            return true;
        } else if (class310.field4425 == class197.field3014) {
            String var255 = class110.field1640.method2996(125);
            int var256 = class110.field1640.method2944((byte) 4);
            int var257 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            if (var257 == 65535) {
                var257 = -1;
            }
            int var258 = class110.field1640.method2964((byte) 73);
            if (var256 >= 1 && var256 <= 8) {
                if (var255.equalsIgnoreCase("null")) {
                    var255 = null;
                }
                class480.field6747[var256 - 1] = var255;
                class293.field4276[var256 - 1] = var257;
                class97.field1102[var256 - 1] = var258 == 0;
            }
            class197.field3014 = null;
            return true;
        } else if (class491.field6966 == class197.field3014) {
            int var259 = class110.field1640.method2998(true);
            if (var259 == 65535) {
                var259 = -1;
            }
            int var260 = class110.field1640.method2962(0);
            class351.method2221(arg0 ^ 0xFFFFFF8F);
            class312.method2000(var260, var259, 2, arg0 - 2, -1);
            class197.field3014 = null;
            return true;
        } else if (class534.field7711 == class197.field3014) {
            int var261 = class110.field1640.method2964((byte) 112);
            if (class110.field1640.method2964((byte) 70) == 0) {
                class718.field9944[var261] = new class269();
            } else {
                class110.field1640.field7042--;
                class718.field9944[var261] = new class269(class110.field1640);
            }
            class197.field3014 = null;
            class85.field935 = class366.field5096;
            return true;
        } else if (class197.field3014 == class107.field1590) {
            class624.method3589(true, class400.field5488);
            class197.field3014 = null;
            return true;
        } else if (class278.field4053 == class197.field3014) {
            int var262 = class110.field1640.method2976(-127);
            int var263 = class110.field1640.method2974((byte) -43);
            int var264 = class110.field1640.method2998(true);
            int var265 = class110.field1640.method2998(true);
            class351.method2221(-79);
            class312.method2000(var262, var264 << 16 | var265, 7, -1, var263);
            class197.field3014 = null;
            return true;
        } else if (class674.field9395 == class197.field3014) {
            class13.field270 = class110.field1640.method2986(-20802);
            class766.field10544 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            class197.field3014 = null;
            return true;
        } else if (class479.field6737 == class197.field3014) {
            int var266 = class110.field1640.method2999((byte) 90);
            int var267 = class110.field1640.method2954(true);
            class351.method2221(arg0 - 112);
            class319.method2062(var266, var267, arg0 + 25381);
            class197.field3014 = null;
            return true;
        } else if (class356.field5009 == class197.field3014) {
            class624.method3589(true, class253.field3723);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class132.field1990) {
            class313.method2009(123);
            class197.field3014 = null;
            return true;
        } else if (class486.field6854 == class197.field3014) {
            int var268 = class110.field1640.method2944((byte) 4);
            int var269 = class110.field1640.method2974((byte) -95);
            class537.field7727.method4134((byte) 98, var269, var268);
            class197.field3014 = null;
            return true;
        } else if (class476.field6668 == class197.field3014) {
            int var270 = class110.field1640.method2940((byte) 97);
            int var271 = class110.field1640.method2982(-1);
            int var272 = class110.field1640.method2938((byte) -67);
            int var273 = class110.field1640.method2999((byte) 109);
            class351.method2221(-72);
            class737.method4102(var271, arg0 - 2, var273, var270, var272);
            class197.field3014 = null;
            return true;
        } else if (class329.field4572 == class197.field3014) {
            class195.method1354((byte) -61, class34.field469);
            class197.field3014 = null;
            return false;
        } else if (class670.field9318 == class197.field3014) {
            class645.method3700(2, class15.field293, class110.field1640);
            class197.field3014 = null;
            return true;
        } else if (class199.field3041 == class197.field3014) {
            int var274 = class110.field1640.method2976(-124);
            class348.field4877 = class519.field7328.method2831(91, var274);
            class197.field3014 = null;
            return true;
        } else if (class610.field8581 == class197.field3014) {
            int var275 = class110.field1640.method2998(true);
            class702 var276;
            if (class250.field3689 == var275) {
                var276 = class210.field3250;
            } else {
                var276 = class767.field10560[var275];
            }
            if (var276 == null) {
                class197.field3014 = null;
                return true;
            }
            int var277 = class110.field1640.method2998(true);
            int var278 = class110.field1640.method2964((byte) 37);
            boolean var279 = (var277 & 0x8000) != 0;
            if (var276.field9768 != null && var276.field9765 != null) {
                boolean var280 = false;
                if (var278 <= 1) {
                    if (!var279 && (class404.field5525 && !class34.field466 || class338.field4740)) {
                        var280 = true;
                    } else if (class610.method3548(var276.field9768, (byte) -128)) {
                        var280 = true;
                    }
                }
                if (!var280 && class180.field2795 == 0) {
                    int var281 = -1;
                    String var283;
                    if (var279) {
                        var277 &= 0x7FFF;
                        class673 var282 = class358.method2264(class110.field1640, arg0 ^ 0x3);
                        var281 = var282.field9374;
                        var283 = var282.field9381.method1344(class110.field1640, (byte) 121);
                    } else {
                        var283 = class317.method2057(118, class699.method3933(class110.field1640, (byte) 72));
                    }
                    var276.field4635 = var283.trim();
                    var276.field4606 = var277 & 0xFF;
                    var276.field4592 = 150;
                    var276.field4639 = var277 >> 8;
                    int var284;
                    if (var278 == 1 || var278 == 2) {
                        var284 = var279 ? 17 : 1;
                    } else {
                        var284 = var279 ? 17 : 2;
                    }
                    if (var278 == 2) {
                        class457.method2725(0, var283, var284, "<img=1>" + var276.method3979(arg0 ^ 0x1, false), null, var276.field9753, "<img=1>" + var276.method3976(true, -1), 71, var281);
                    } else if (var278 == 1) {
                        class457.method2725(0, var283, var284, "<img=0>" + var276.method3979(0, false), null, var276.field9753, "<img=0>" + var276.method3976(true, arg0 - 2), -38, var281);
                    } else {
                        class457.method2725(0, var283, var284, var276.method3979(arg0 - 1, false), null, var276.field9753, var276.method3976(true, arg0 - 2), -42, var281);
                    }
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class254.field3737 == class197.field3014) {
            int var285 = class110.field1640.method2944((byte) 4);
            int var286 = class110.field1640.method2976(-125);
            int var287 = class110.field1640.method2974((byte) -71);
            class351.method2221(-88);
            class744 var288 = (class744) class11.field217.method2242((long) var286, -1);
            if (var288 != null) {
                class698.method3932((byte) 90, var288, var288.field10314 != var287, false);
            }
            class436.method2604((byte) -25, false, var286, var287, var285);
            class197.field3014 = null;
            return true;
        } else if (class671.field9327 == class197.field3014) {
            int var289 = class110.field1640.method2962(arg0 ^ 0x1);
            int var290 = class110.field1640.method2938((byte) -67);
            class351.method2221(arg0 ^ 0xFFFFFFB9);
            class80.method618(var289, (byte) 7, var290);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class108.field1603) {
            int var291 = class110.field1640.method2998(true);
            int var292 = class110.field1640.method2998(true);
            int var293 = class110.field1640.method2998(true);
            class351.method2221(-91);
            if (class787.field10812[var291] != null) {
                for (int var294 = var292; var294 < var293; var294++) {
                    int var295 = class110.field1640.method2960((byte) 94);
                    if (class787.field10812[var291].length > var294 && class787.field10812[var291][var294] != null) {
                        class787.field10812[var291][var294].field6311 = var295;
                    }
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class447.field6090 == class197.field3014) {
            int var296 = class110.field1640.method2964((byte) 101);
            int var297 = class110.field1640.method2986(-20802);
            int var298 = class110.field1640.method2964((byte) 48);
            int var299 = class110.field1640.method2938((byte) -67);
            int var300 = class110.field1640.method2944((byte) 4);
            class351.method2221(-90);
            class310.field4432[var296] = true;
            class393.field5401[var296] = var300;
            class3.field25[var296] = var298;
            class260.field3825[var296] = var297;
            class531.field7681[var296] = var299;
            class197.field3014 = null;
            return true;
        } else if (class394.field5427 == class197.field3014) {
            class561.field7979 = class110.field1640.method2988(arg0 ^ 0xFFFFFFFC);
            class620.field8726 = class366.field5096;
            class197.field3014 = null;
            return true;
        } else if (class394.field5424 == class197.field3014) {
            class125.field1932 = class110.field1640.method2940((byte) -81);
            class413.field5649 = class110.field1640.method2978(true) << 3;
            class515.field7287 = class110.field1640.method2978(true) << 3;
            while (class110.field1640.field7042 < class15.field293) {
                class37 var301 = class519.method3123((byte) 127)[class110.field1640.method2964((byte) 102)];
                class624.method3589(true, var301);
            }
            class197.field3014 = null;
            return true;
        } else if (class511.field7229 == class197.field3014) {
            int var302 = class110.field1640.method2962(0);
            int var303 = class110.field1640.method2974((byte) -127);
            int var304 = class110.field1640.method2999((byte) 79);
            class351.method2221(-125);
            class312.method2000(var302, var303, 5, -1, var304);
            class197.field3014 = null;
            return true;
        } else if (class394.field5426 == class197.field3014) {
            class624.method3589(true, class123.field1910);
            class197.field3014 = null;
            return true;
        } else if (class650.field9074 == class197.field3014) {
            int var305 = class110.field1640.method2944((byte) 4);
            byte var306 = class110.field1640.method3004(true);
            class351.method2221(-116);
            class430.method2585(var306, var305, (byte) -28);
            class197.field3014 = null;
            return true;
        } else if (class602.field8440 == class197.field3014) {
            class618.field8643 = class110.field1640.method2964((byte) 93);
            class197.field3014 = null;
            class620.field8726 = class366.field5096;
            return true;
        } else if (class238.field3575 == class197.field3014) {
            int var307 = class110.field1640.method2998(true);
            int var308 = class110.field1640.method2964((byte) 114);
            boolean var309 = (var308 & 0x1) == 1;
            class363.method2278(var307, -34, var309);
            int var310 = class110.field1640.method2998(true);
            for (int var311 = 0; var311 < var310; var311++) {
                int var312 = class110.field1640.method2938((byte) -67);
                int var313 = class110.field1640.method2940((byte) -98);
                if (var313 == 255) {
                    var313 = class110.field1640.method2962(arg0 ^ 0x1);
                }
                class473.method2811(var311, var312 - 1, var313, var309, 1, var307);
            }
            class689.field9619[class702.method3977(class194.field2991++, 31)] = var307;
            class197.field3014 = null;
            return true;
        } else if (class470.field6589 == class197.field3014) {
            class195.method1354((byte) -61, false);
            class197.field3014 = null;
            return false;
        } else if (class772.field10603 == class197.field3014) {
            int var314 = class110.field1640.method2962(arg0 ^ 0x1);
            class351.method2221(-127);
            class312.method2000(var314, -1, 3, -1, -1);
            class197.field3014 = null;
            return true;
        } else if (class88.field981 == class197.field3014) {
            class624.method3589(true, class719.field9961);
            class197.field3014 = null;
            return true;
        } else if (class432.field5846 == class197.field3014) {
            int var315 = class110.field1640.method2940((byte) 98);
            int var316 = class110.field1640.method2998(true) << 2;
            int var317 = class110.field1640.method2944((byte) 4);
            int var318 = class110.field1640.method2940((byte) -46);
            int var319 = class110.field1640.method2986(-20802);
            class351.method2221(-103);
            class665.method3786(var318, true, var317, (byte) 11, var319, var315, var316);
            class197.field3014 = null;
            return true;
        } else if (class22.field360 == class197.field3014) {
            int var320 = class110.field1640.method2938((byte) -67);
            int var321 = class110.field1640.method2944((byte) 4);
            int var322 = class110.field1640.method2976(-127);
            int var323 = class110.field1640.method2974((byte) -27);
            class351.method2221(arg0 - 75);
            class283.method1845(var322, var321, var320, arg0 - 10136, var323);
            class197.field3014 = null;
            return true;
        } else if (class343.field4777 == class197.field3014) {
            class110.field1640.field7042 += 28;
            if (class110.field1640.method2948((byte) -86)) {
                class582.method3408(class110.field1640.field7042 - 28, arg0 ^ 0x7D, class110.field1640);
            }
            class197.field3014 = null;
            return true;
        } else if (class268.field3898 == class197.field3014) {
            int var324 = class110.field1640.method2986(arg0 - 20803);
            int var325 = class110.field1640.method2938((byte) -67);
            class351.method2221(-85);
            class314.method2014(var325, var324, 25260, true);
            class197.field3014 = null;
            return true;
        } else if (class759.field10476 == class197.field3014) {
            class649.field9066 = class366.field5096;
            boolean var326 = class110.field1640.method2964((byte) 120) == 1;
            class786 var327 = new class786(class110.field1640);
            class344 var328;
            if (var326) {
                var328 = class673.field9377;
            } else {
                var328 = class259.field3811;
            }
            var327.method4308((byte) 123, var328);
            class197.field3014 = null;
            return true;
        } else if (class449.field6135 == class197.field3014) {
            class624.method3589(true, class40.field529);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class103.field1189) {
            boolean var329 = class110.field1640.method2964((byte) 50) == 1;
            String var330 = class110.field1640.method2996(103);
            long var331 = (long) class110.field1640.method2998(true);
            long var333 = (long) class110.field1640.method2960((byte) 94);
            int var335 = class110.field1640.method2964((byte) 101);
            int var336 = class110.field1640.method2998(true);
            long var337 = (var331 << 32) + var333;
            boolean var339 = false;
            Object var340 = null;
            class344 var341 = var329 ? class673.field9377 : class259.field3811;
            if (var341 == null) {
                var339 = true;
            } else {
                label2188: {
                    for (int var342 = 0; var342 < 100; var342++) {
                        if (class265.field3862[var342] == var337) {
                            var339 = true;
                            break label2188;
                        }
                    }
                    if (var335 <= 1 && class610.method3548(var330, (byte) 118)) {
                        var339 = true;
                    }
                }
            }
            if (!var339 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var337;
                class17.field314 = (class17.field314 + 1) % 100;
                String var343 = class204.field3172.method3795(var336, (byte) 65).method1344(class110.field1640, (byte) 123);
                int var344 = var329 ? 42 : 45;
                if (var335 == 2 || var335 == 3) {
                    class457.method2725(0, var343, var344, "<img=1>" + var330, var341.field4802, var330, "<img=1>" + var330, 127, var336);
                } else if (var335 == 1) {
                    class457.method2725(0, var343, var344, "<img=0>" + var330, var341.field4802, var330, "<img=0>" + var330, -103, var336);
                } else {
                    class457.method2725(0, var343, var344, var330, var341.field4802, var330, var330, arg0 - 82, var336);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class694.field9679 == class197.field3014) {
            int var345 = class110.field1640.method2998(true);
            int var346 = class110.field1640.method2964((byte) 50);
            boolean var347 = (var346 & 0x1) == 1;
            while (class15.field293 > class110.field1640.field7042) {
                int var348 = class110.field1640.method2993(110);
                int var349 = class110.field1640.method2998(true);
                int var350 = 0;
                if (var349 != 0) {
                    var350 = class110.field1640.method2964((byte) 69);
                    if (var350 == 255) {
                        var350 = class110.field1640.method2976(-128);
                    }
                }
                class473.method2811(var348, var349 - 1, var350, var347, 1, var345);
            }
            class689.field9619[class702.method3977(31, class194.field2991++)] = var345;
            class197.field3014 = null;
            return true;
        } else if (class55.field707 == class197.field3014) {
            if (class397.method2450((byte) 125, class266.field3873)) {
                class625.field8754 = (int) ((float) class110.field1640.method2998(true) * 2.5F);
            } else {
                class625.field8754 = class110.field1640.method2998(true) * 30;
            }
            class197.field3014 = null;
            class620.field8726 = class366.field5096;
            return true;
        } else if (class197.field3014 == class186.field2841) {
            int var351 = class110.field1640.method2944((byte) 4);
            int var352 = class110.field1640.method2962(arg0 ^ 0x1);
            class351.method2221(-84);
            class116.method871(var352, (byte) 116, var351);
            class197.field3014 = null;
            return true;
        } else if (class338.field4741 == class197.field3014) {
            String var353 = class110.field1640.method2996(arg0 + 105);
            int var354 = class110.field1640.method2998(true);
            String var355 = class204.field3172.method3795(var354, (byte) 94).method1344(class110.field1640, (byte) 122);
            class457.method2725(0, var355, 19, var353, null, var353, var353, 72, var354);
            class197.field3014 = null;
            return true;
        } else if (class639.field8965 == class197.field3014) {
            int var356 = class110.field1640.method2974((byte) -76);
            class351.method2221(-80);
            class296.method1925(var356, (byte) 126);
            class197.field3014 = null;
            return true;
        } else if (class678.field9430 == class197.field3014) {
            byte var357 = class110.field1640.method2943((byte) 16);
            int var358 = class110.field1640.method2982(-1);
            class351.method2221(-81);
            class747.method4163((byte) 69, var357, var358);
            class197.field3014 = null;
            return true;
        } else if (class34.field464 == class197.field3014) {
            class624.method3589(true, class606.field8482);
            class197.field3014 = null;
            return true;
        } else if (class670.field9312 == class197.field3014) {
            boolean var359 = class110.field1640.method2964((byte) 127) == 1;
            byte[] var360 = new byte[class15.field293 - 1];
            class110.field1640.method2958(true, var360, 0, class15.field293 - 1);
            class391.method2421(var359, var360, 26603);
            class197.field3014 = null;
            return true;
        } else if (class410.field5571 == class197.field3014) {
            int var361 = class110.field1640.method2982(arg0 - 2);
            int var362 = class110.field1640.method2999((byte) 77);
            class351.method2221(-96);
            class504.method3046(var361, true, var362);
            class197.field3014 = null;
            return true;
        } else if (class261.field3834 == class197.field3014) {
            if (class371.field5137 != -1) {
                class614.method3563(class371.field5137, 0, (byte) 48);
            }
            class197.field3014 = null;
            return true;
        } else if (class245.field3643 == class197.field3014) {
            boolean var363 = class110.field1640.method2964((byte) 67) == 1;
            String var364 = class110.field1640.method2996(118);
            String var365 = var364;
            if (var363) {
                var365 = class110.field1640.method2996(111);
            }
            int var366 = class110.field1640.method2964((byte) 53);
            boolean var367 = false;
            if (var366 <= 1) {
                if (!(!class404.field5525 || class34.field466) || class338.field4740) {
                    var367 = true;
                } else if (var366 <= 1 && class610.method3548(var365, (byte) -23)) {
                    var367 = true;
                }
            }
            if (!var367 && class180.field2795 == 0) {
                String var368 = class317.method2057(110, class699.method3933(class110.field1640, (byte) 80));
                if (var366 == 2) {
                    class457.method2725(0, var368, 24, "<img=1>" + var365, null, var364, "<img=1>" + var364, -128, -1);
                } else if (var366 == 1) {
                    class457.method2725(0, var368, 24, "<img=0>" + var365, null, var364, "<img=0>" + var364, -117, -1);
                } else {
                    class457.method2725(0, var368, 24, var365, null, var364, var364, arg0 + 75, -1);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class27.field399 == class197.field3014) {
            class197.field3014 = null;
            class500.field7110 = 1;
            class493.field6979 = class366.field5096;
            return true;
        } else if (class458.field6411 == class197.field3014) {
            class624.method3589(true, class212.field3291);
            class197.field3014 = null;
            return true;
        } else if (class719.field9962 == class197.field3014) {
            for (int var369 = 0; var369 < class767.field10560.length; var369++) {
                if (class767.field10560[var369] != null) {
                    class767.field10560[var369].field4609 = null;
                    class767.field10560[var369].field4604 = -1;
                }
            }
            for (int var370 = 0; var370 < class36.field483; var370++) {
                class164.field2601[var370].field3181.field4609 = null;
                class164.field2601[var370].field3181.field4604 = -1;
            }
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class149.field2143) {
            int var371 = class110.field1640.method2974((byte) -37);
            class351.method2221(-80);
            class13.method140(arg0 ^ 0xFFFFFEFE, var371);
            class197.field3014 = null;
            return true;
        } else if (class53.field668 == class197.field3014) {
            boolean var372 = class110.field1640.method2964((byte) 74) == 1;
            String var373 = class110.field1640.method2996(105);
            String var374 = var373;
            if (var372) {
                var374 = class110.field1640.method2996(114);
            }
            long var375 = class110.field1640.method3005(-88);
            long var377 = (long) class110.field1640.method2998(true);
            long var379 = (long) class110.field1640.method2960((byte) 94);
            int var381 = class110.field1640.method2964((byte) 92);
            long var382 = (var377 << 32) + var379;
            boolean var384 = false;
            int var385 = 0;
            while (true) {
                if (var385 >= 100) {
                    if (var381 <= 1) {
                        if (!(!class404.field5525 || class34.field466) || class338.field4740) {
                            var384 = true;
                        } else if (class610.method3548(var374, (byte) 121)) {
                            var384 = true;
                        }
                    }
                    break;
                }
                if (class265.field3862[var385] == var382) {
                    var384 = true;
                    break;
                }
                var385++;
            }
            if (!var384 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var382;
                class17.field314 = (class17.field314 + 1) % 100;
                String var386 = class317.method2057(arg0 ^ 0x73, class699.method3933(class110.field1640, (byte) 106));
                if (var381 == 2 || var381 == 3) {
                    class457.method2725(0, var386, 9, "<img=1>" + var374, class486.method2897(var375, 90), var373, "<img=1>" + var373, -107, -1);
                } else if (var381 == 1) {
                    class457.method2725(0, var386, 9, "<img=0>" + var374, class486.method2897(var375, -82), var373, "<img=0>" + var373, 110, -1);
                } else {
                    class457.method2725(0, var386, 9, var374, class486.method2897(var375, 94), var373, var373, arg0 ^ 0xFFFFFFDC, -1);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class404.field5523 == class197.field3014) {
            int var387 = class110.field1640.method2998(true);
            if (var387 == 65535) {
                var387 = -1;
            }
            int var388 = class110.field1640.method2964((byte) 52);
            int var389 = class110.field1640.method2998(true);
            int var390 = class110.field1640.method2964((byte) 109);
            class355.method2259(256, true, var390, var389, true, var387, var388);
            class197.field3014 = null;
            return true;
        } else if (class547.field7865 == class197.field3014) {
            class351.method2221(-106);
            class401.method2467((byte) 124);
            class197.field3014 = null;
            return true;
        } else if (class749.field10382 == class197.field3014) {
            class624.method3589(true, class658.field9180);
            class197.field3014 = null;
            return true;
        } else if (class207.field3212 == class197.field3014) {
            int var391 = class110.field1640.method2974((byte) -126);
            int var392 = class110.field1640.method2976(arg0 - 129);
            int var393 = class110.field1640.method2938((byte) -67);
            if (var393 == 65535) {
                var393 = -1;
            }
            int var394 = class110.field1640.method2982(-1);
            if (var394 == 65535) {
                var394 = -1;
            }
            class351.method2221(-83);
            for (int var395 = var393; var395 <= var394; var395++) {
                long var396 = ((long) var392 << 32) + (long) var395;
                class33 var398 = (class33) class111.field1713.method2242(var396, -1);
                class33 var399;
                if (var398 != null) {
                    var399 = new class33(var398.field441, var391);
                    var398.method3387((byte) 108);
                } else if (var395 == -1) {
                    var399 = new class33(class166.method1238((byte) -22, var392).field6171.field441, var391);
                } else {
                    var399 = new class33(0, var391);
                }
                class111.field1713.method2241(63, var396, var399);
            }
            class197.field3014 = null;
            return true;
        } else if (class325.field4556 == class197.field3014) {
            boolean var400 = class110.field1640.method2964((byte) 122) == 1;
            String var401 = class110.field1640.method2996(126);
            String var402 = var401;
            if (var400) {
                var402 = class110.field1640.method2996(101);
            }
            long var403 = class110.field1640.method3005(arg0 ^ 0xFFFFFF97);
            long var405 = (long) class110.field1640.method2998(true);
            long var407 = (long) class110.field1640.method2960((byte) 94);
            int var409 = class110.field1640.method2964((byte) 112);
            int var410 = class110.field1640.method2998(true);
            long var411 = (var405 << 32) + var407;
            boolean var413 = false;
            int var414 = 0;
            while (true) {
                if (var414 >= 100) {
                    if (var409 <= 1 && class610.method3548(var402, (byte) -66)) {
                        var413 = true;
                    }
                    break;
                }
                if (class265.field3862[var414] == var411) {
                    var413 = true;
                    break;
                }
                var414++;
            }
            if (!var413 && class180.field2795 == 0) {
                class265.field3862[class17.field314] = var411;
                class17.field314 = (class17.field314 + 1) % 100;
                String var415 = class204.field3172.method3795(var410, (byte) 89).method1344(class110.field1640, (byte) 122);
                if (var409 == 2) {
                    class457.method2725(0, var415, 20, "<img=1>" + var402, class486.method2897(var403, arg0 - 28), var401, "<img=1>" + var401, -86, var410);
                } else if (var409 == 1) {
                    class457.method2725(0, var415, 20, "<img=0>" + var402, class486.method2897(var403, 112), var401, "<img=0>" + var401, -61, var410);
                } else {
                    class457.method2725(0, var415, 20, var402, class486.method2897(var403, 95), var401, var401, -19, var410);
                }
            }
            class197.field3014 = null;
            return true;
        } else if (class523.field7390 == class197.field3014) {
            class47.field600 = class110.field1640.method2964((byte) 56);
            for (int var416 = 0; var416 < class47.field600; var416++) {
                class646.field9032[var416] = class110.field1640.method2996(101);
                class31.field431[var416] = class110.field1640.method2996(101);
                if (class31.field431[var416].equals("")) {
                    class31.field431[var416] = class646.field9032[var416];
                }
                class758.field10440[var416] = class110.field1640.method2996(class587.method3425(arg0, 118));
                class550.field7910[var416] = class110.field1640.method2996(102);
                if (class550.field7910[var416].equals("")) {
                    class550.field7910[var416] = class758.field10440[var416];
                }
                class270.field3916[var416] = false;
            }
            class197.field3014 = null;
            class493.field6979 = class366.field5096;
            return true;
        } else if (class33.field435 == class197.field3014) {
            int var417 = class110.field1640.method2986(-20802);
            int var418 = class110.field1640.method2944((byte) 4);
            if (var417 == 255) {
                var418 = -1;
                var417 = -1;
            }
            class589.method3435(var417, 15, var418);
            class197.field3014 = null;
            return true;
        } else if (class197.field3014 == class133.field2013) {
            int var419 = class110.field1640.method2954(true);
            int var420 = class110.field1640.method2967(118);
            int var421 = class110.field1640.method2976(arg0 ^ 0xFFFFFF85);
            class351.method2221(-96);
            class786.method4305(var421, (byte) 79, var420, var419);
            class197.field3014 = null;
            return true;
        } else if (class41.field537 == class197.field3014) {
            class714.method4011(11);
            class197.field3014 = null;
            return false;
        } else if (class197.field3014 == class195.field2996) {
            int var422 = class110.field1640.method2982(arg0 ^ 0xFFFFFFFE);
            if (var422 == 65535) {
                var422 = -1;
            }
            int var423 = class110.field1640.method2964((byte) 72);
            int var424 = class110.field1640.method2944((byte) 4);
            class772.method4257(-61, var422, var424, var423);
            class197.field3014 = null;
            return true;
        } else if (class714.field9908 == class197.field3014) {
            int var425 = class110.field1640.method2944((byte) 4);
            int var426 = class110.field1640.method2946((byte) 79);
            int var427 = class110.field1640.method2974((byte) -44);
            if (var427 == 65535) {
                var427 = -1;
            }
            class88.method662((byte) 84, var427, var426, var425);
            class197.field3014 = null;
            return true;
        } else if (class318.field4524 == class197.field3014) {
            int var428 = class110.field1640.method2962(0);
            int var429 = class110.field1640.method2974((byte) -70);
            if (var429 == 65535) {
                var429 = -1;
            }
            int var430 = class110.field1640.method2998(true);
            if (var430 == 65535) {
                var430 = -1;
            }
            int var431 = class110.field1640.method2941(17511512);
            class351.method2221(-84);
            for (int var432 = var429; var432 <= var430; var432++) {
                long var433 = ((long) var428 << 32) + (long) var432;
                class33 var435 = (class33) class111.field1713.method2242(var433, -1);
                class33 var436;
                if (var435 != null) {
                    var436 = new class33(var431, var435.field442);
                    var435.method3387((byte) -96);
                } else if (var432 == -1) {
                    var436 = new class33(var431, class166.method1238((byte) -61, var428).field6171.field442);
                } else {
                    var436 = new class33(var431, -1);
                }
                class111.field1713.method2241(-77, var433, var436);
            }
            class197.field3014 = null;
            return true;
        } else if (class387.field5356 == class197.field3014) {
            class760.field10484 = class110.field1640.method2964((byte) 112);
            class197.field3014 = null;
            return true;
        } else if (class459.field6421 == class197.field3014) {
            int[] var437 = new int[4];
            for (int var438 = 0; var438 < 4; var438++) {
                var437[var438] = class110.field1640.method2938((byte) -67);
            }
            int var439 = class110.field1640.method2986(arg0 ^ 0xFFFFAEBF);
            int var440 = class110.field1640.method2998(true);
            class205 var441 = (class205) class645.field9014.method2242((long) var440, -1);
            if (var441 != null) {
                class741.method4127(var441.field3181, var439, var437, 80);
            }
            class197.field3014 = null;
            return true;
        } else if (class371.field5140 == class197.field3014) {
            class624.method3589(true, class216.field3358);
            class197.field3014 = null;
            return true;
        } else if (class718.field9946 == class197.field3014) {
            int var442 = class110.field1640.method2941(17511512);
            int var443 = class110.field1640.method2974((byte) -94);
            class537.field7727.method4134((byte) 98, var443, var442);
            class197.field3014 = null;
            return true;
        } else if (class500.field7108 == class197.field3014) {
            boolean var444 = class110.field1640.method2940((byte) 125) == 1;
            class351.method2221(-91);
            class197.field3014 = null;
            class652.field9117 = var444;
            return true;
        } else if (class493.field6981 == class197.field3014) {
            class80.field895 = class15.field293 <= 2 ? class620.field8687.method3580(class140.field2081, 12) : class110.field1640.method2996(104);
            class342.field4763 = class15.field293 > 0 ? class110.field1640.method2998(true) : -1;
            if (class342.field4763 == 65535) {
                class342.field4763 = -1;
            }
            class197.field3014 = null;
            return true;
        } else if (class715.field9928 == class197.field3014) {
            String var445 = class110.field1640.method2996(arg0 + 117);
            boolean var446 = class110.field1640.method2964((byte) 46) == 1;
            String var447;
            if (var446) {
                var447 = class110.field1640.method2996(106);
            } else {
                var447 = var445;
            }
            int var448 = class110.field1640.method2998(true);
            byte var449 = class110.field1640.method2943((byte) 16);
            boolean var450 = false;
            if (var449 == -128) {
                var450 = true;
            }
            if (var450) {
                if (class187.field2886 == 0) {
                    class197.field3014 = null;
                    return true;
                }
                boolean var451 = false;
                int var452;
                for (var452 = 0; var452 < class187.field2886 && (!class762.field10501[var452].field4762.equals(var447) || class762.field10501[var452].field4773 != var448); var452++) {
                }
                if (class187.field2886 > var452) {
                    while (var452 < class187.field2886 - 1) {
                        class762.field10501[var452] = class762.field10501[var452 + 1];
                        var452++;
                    }
                    class187.field2886--;
                    class762.field10501[class187.field2886] = null;
                }
            } else {
                String var453 = class110.field1640.method2996(107);
                class342 var454 = new class342();
                var454.field4762 = var447;
                var454.field4770 = var445;
                var454.field4769 = class663.method3782((byte) 118, var454.field4762);
                var454.field4767 = var453;
                var454.field4771 = var449;
                var454.field4773 = var448;
                int var455;
                for (var455 = class187.field2886 - 1; var455 >= 0; var455--) {
                    int var456 = class762.field10501[var455].field4769.compareTo(var454.field4769);
                    if (var456 == 0) {
                        class762.field10501[var455].field4773 = var448;
                        class762.field10501[var455].field4771 = var449;
                        class762.field10501[var455].field4767 = var453;
                        if (var447.equals(class210.field3250.field9768)) {
                            class721.field9980 = var449;
                        }
                        class614.field8623 = class366.field5096;
                        class197.field3014 = null;
                        return true;
                    }
                    if (var456 < 0) {
                        break;
                    }
                }
                if (class762.field10501.length <= class187.field2886) {
                    class197.field3014 = null;
                    return true;
                }
                for (int var457 = class187.field2886 - 1; var457 > var455; var457--) {
                    class762.field10501[var457 + 1] = class762.field10501[var457];
                }
                if (class187.field2886 == 0) {
                    class762.field10501 = new class342[100];
                }
                class762.field10501[var455 + 1] = var454;
                class187.field2886++;
                if (var447.equals(class210.field3250.field9768)) {
                    class721.field9980 = var449;
                }
            }
            class197.field3014 = null;
            class614.field8623 = class366.field5096;
            return true;
        } else if (class754.field10422 == class197.field3014) {
            class742.method4131((byte) 108, class519.field7328, class15.field293, class110.field1640);
            class197.field3014 = null;
            return true;
        } else {
            class678.method3848("T1 - " + (class197.field3014 == null ? -1 : class197.field3014.method219(1)) + "," + (class518.field7312 == null ? -1 : class518.field7312.method219(1)) + "," + (class467.field6559 == null ? -1 : class467.field6559.method219(arg0)) + " - " + class15.field293, null, false);
            class195.method1354((byte) -61, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public final void method612(byte arg0) {
        field1759++;
        try {
            this.field1757.close();
        } catch (IOException var3) {
        }
        int var2 = -33 % ((47 - arg0) / 43);
        this.field1752.method4172(123);
        this.field1749.method728(-128);
    }
}
