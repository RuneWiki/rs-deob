import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class545 implements class90 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lpu;")
    private class522 field7673;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lpu;")
    private class522 field7667;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lpr;")
    private class410 field7675;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Ldg;")
    public static class376 field7674 = new class376(59, 2);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lla;")
    private class416 field7670;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
    public static final void method3086(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 33) {
            field7674 = null;
        }
        field7672++;
        class191 var5 = class6.method38(10, -74, arg1);
        var5.method1285((byte) -1);
        var5.field2754 = arg3;
        var5.field2760 = arg0;
        var5.field2755 = arg2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        field7669++;
        class146 var2 = class412.method2482(67, this.field7667, this.field7675.field5976);
        if (arg0 == 67) {
            this.field7670 = class282.field4228.method128(var2, class113.method880(this.field7673, this.field7675.field5976), true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(B)V")
    public static void method3087(byte arg0) {
        if (arg0 != -56) {
            field7674 = null;
        }
        field7674 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method3088(int arg0) {
        field7668++;
        if (class676.field9555 == 0 || class676.field9555 == 6) {
            return;
        }
        try {
            if ((++class102.field1604) > 2000) {
                if (class274.field4181 != null) {
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                }
                if (class272.field4103 >= 2) {
                    class676.field9555 = 0;
                    class516.method2951((byte) -84, -5);
                    return;
                }
                if (class460.field6579 == 2 || class460.field6579 == 3) {
                    class228.field3284.method2103(-1);
                } else {
                    class533.field7487.method2103(arg0 - 13133);
                }
                class102.field1604 = 0;
                class676.field9555 = 1;
                class272.field4103++;
            }
            if (class676.field9555 == 1) {
                if (class460.field6579 == 2 || class460.field6579 == 3) {
                    class420.field6114 = class228.field3284.method2104(29767, class368.field5267);
                } else {
                    class420.field6114 = class533.field7487.method2104(29767, class368.field5267);
                }
                class676.field9555 = 2;
            }
            if (class676.field9555 == 2) {
                if (class420.field6114.field7024 == 2) {
                    throw new IOException();
                }
                if (class420.field6114.field7024 != 1) {
                    return;
                }
                class274.field4181 = class461.method2721(7500, -8663, (Socket) class420.field6114.field7019);
                class420.field6114 = null;
                long var1 = class9.field93 = class273.method1801(class224.field3152, arg0 ^ 0xFFFFCCAD);
                class514.method2941(false);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class135 var4 = class262.method1721((byte) -91);
                var4.field1978.method3853((byte) 51, class370.field5277.field6777);
                var4.field1978.method3853((byte) 51, var3);
                class19.method223(var4, 0);
                class475.method2788(arg0 - 13132);
                class676.field9555 = 3;
            }
            if (class676.field9555 == 3) {
                if (!class274.field4181.method2233(1, 13)) {
                    return;
                }
                class274.field4181.method2231(-105, 1, class523.field7392.field9796, 0);
                int var5 = class523.field7392.field9796[0] & 0xFF;
                if (var5 != 0) {
                    class676.field9555 = 0;
                    class516.method2951((byte) 72, var5);
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                    class36.method427(false);
                    return;
                }
                class676.field9555 = 4;
            }
            if (class676.field9555 == 4) {
                if (!class274.field4181.method2233(8, 13)) {
                    return;
                }
                class274.field4181.method2231(-77, 8, class523.field7392.field9796, 0);
                class523.field7392.field9761 = 0;
                class439.field6402 = class523.field7392.method3854((byte) -12);
                class695 var6 = new class695(518);
                int[] var7 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class439.field6402 >> 32), (int) class439.field6402 };
                var6.method3853((byte) 51, 10);
                var6.method3868(var7[0], -318419336);
                var6.method3868(var7[1], -318419336);
                var6.method3868(var7[2], -318419336);
                var6.method3868(var7[3], arg0 - 318432468);
                var6.method3824(16384, class273.method1801(class224.field3152, -124));
                var6.method3837(4102, class565.field7973);
                var6.method3824(16384, class609.field8565);
                var6.method3824(16384, class689.field9705);
                var6.method3823((byte) -104, class554.field7850, class668.field9445);
                class514.method2941(false);
                class135 var8 = class262.method1721((byte) -27);
                class26 var9 = var8.field1978;
                if (class460.field6579 == 2 || class460.field6579 == 3) {
                    if (class420.field6113 == 13) {
                        var9.method3853((byte) 51, class370.field5285.field6777);
                    } else {
                        var9.method3853((byte) 51, class370.field5283.field6777);
                    }
                    var9.method3852(false, 0);
                    int var11 = var9.field9761;
                    var9.method3868(618, arg0 - 318432468);
                    var9.method3853((byte) 51, class689.field9707);
                    var9.method3853((byte) 51, class488.method2836(arg0 ^ 0x334F));
                    var9.method3852(false, class487.field6930);
                    var9.method3852(false, class31.field494);
                    var9.method3853((byte) 51, class287.field4270.field3706);
                    class436.method2596(4, var9);
                    var9.method3837(arg0 - 9030, class31.field483);
                    var9.method3868(class40.field657, -318419336);
                    class695 var12 = new class695(class383.method2295((byte) -28));
                    class287.field4270.method1619(var12, (byte) -77);
                    var9.method3853((byte) 51, var12.field9761);
                    var9.method3857(7010, var12.field9761, var12.field9796, 0);
                    class227.field3189 = true;
                    class695 var13 = new class695(class240.method1641((byte) -126));
                    (new class120(true, class368.field5267)).method918(var13, 56);
                    var9.method3857(7010, var13.field9796.length, var13.field9796, 0);
                    var9.method3852(false, class467.field6717);
                    var9.method3824(arg0 ^ 0x734C, class254.field3901);
                    var9.method3853((byte) 51, class493.field7018 == null ? 0 : 1);
                    if (class493.field7018 != null) {
                        var9.method3837(arg0 - 9030, class493.field7018);
                    }
                    class316.method1990(var9, 30356);
                    var9.method3857(7010, var6.field9761, var6.field9796, 0);
                    var9.method3866(-1, var9.field9761 - var11);
                } else {
                    var9.method3853((byte) 51, class370.field5286.field6777);
                    var9.method3852(false, 0);
                    int var10 = var9.field9761;
                    var9.method3868(618, arg0 - 318432468);
                    var9.method3853((byte) 51, class586.field8208.field9738);
                    var9.method3853((byte) 51, class512.field7203);
                    class436.method2596(4, var9);
                    var9.method3837(4102, class31.field483);
                    var9.method3868(class40.field657, -318419336);
                    class316.method1990(var9, 30356);
                    var9.method3857(7010, var6.field9761, var6.field9796, 0);
                    var9.method3866(-1, var9.field9761 - var10);
                }
                class19.method223(var8, arg0 - 13132);
                class475.method2788(0);
                class583.field8198 = new class129(var7);
                for (int var14 = 0; var14 < 4; var14++) {
                    var7[var14] += 50;
                }
                class523.field7392.method320(8, var7);
                class676.field9555 = 5;
            }
            if (class676.field9555 == 5) {
                if (!class274.field4181.method2233(1, arg0 - 13119)) {
                    return;
                }
                class274.field4181.method2231(-108, 1, class523.field7392.field9796, 0);
                int var15 = class523.field7392.field9796[0] & 0xFF;
                if (var15 == 21) {
                    class676.field9555 = 8;
                } else if (var15 == 29) {
                    class676.field9555 = 14;
                } else if (var15 == 1) {
                    class676.field9555 = 6;
                    class516.method2951((byte) 105, var15);
                    return;
                } else if (var15 == 2) {
                    class676.field9555 = 9;
                } else if (var15 == 15) {
                    class676.field9555 = 15;
                    class418.field6098 = -2;
                } else if (var15 == 23 && class272.field4103 < 2) {
                    class676.field9555 = 1;
                    class102.field1604 = 0;
                    class272.field4103++;
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                    return;
                } else {
                    class676.field9555 = 0;
                    class516.method2951((byte) 78, var15);
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                    class36.method427(false);
                    return;
                }
            }
            if (class676.field9555 == 7) {
                class514.method2941(false);
                class135 var16 = class262.method1721((byte) -36);
                class26 var17 = var16.field1978;
                var17.method319(arg0 - 12877, class583.field8198);
                var17.method316((byte) -74, class370.field5293.field6777);
                class19.method223(var16, 0);
                class475.method2788(0);
                class676.field9555 = 5;
            } else if (class676.field9555 == 8) {
                if (class274.field4181.method2233(1, 13)) {
                    class274.field4181.method2231(-104, 1, class523.field7392.field9796, 0);
                    int var18 = class523.field7392.field9796[0] & 0xFF;
                    class59.field1134 = var18 * 60 + 180;
                    class676.field9555 = 0;
                    class516.method2951((byte) 118, 21);
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                    class36.method427(false);
                }
            } else if (class676.field9555 == 14) {
                if (class274.field4181.method2233(1, arg0 ^ 0x3341)) {
                    class274.field4181.method2231(-63, 1, class523.field7392.field9796, 0);
                    class109.field1675 = class523.field7392.field9796[0] & 0xFF;
                    class676.field9555 = 0;
                    class516.method2951((byte) 111, 29);
                    class274.field4181.method2234(false);
                    class274.field4181 = null;
                    class36.method427(false);
                }
            } else if (arg0 == 13132) {
                if (class676.field9555 != 9) {
                    if (class676.field9555 == 10) {
                        class26 var19 = class523.field7392;
                        if (class460.field6579 == 3) {
                            class182.field2586 = true;
                        } else {
                            class182.field2586 = false;
                        }
                        if (class460.field6579 == 2 || class460.field6579 == 3) {
                            if (!class274.field4181.method2233(class417.field6075, 13)) {
                                return;
                            }
                            class274.field4181.method2231(-80, class417.field6075, var19.field9796, 0);
                            var19.field9761 = 0;
                            class558.field7877 = var19.method3826(false);
                            class473.field6751 = var19.method3826(false);
                            class70.field1249 = var19.method3826(false) == 1;
                            class379.field5373 = var19.method3826(false) == 1;
                            class179.field2551 = var19.method3826(false) == 1;
                            class100.field1554 = var19.method3826(false) == 1;
                            class99.field1551 = var19.method3847((byte) 118);
                            class149.field2169 = var19.method3826(false) == 1;
                            class231.field3605 = var19.method3842(arg0 - 13134);
                            class267.field4035 = var19.method3826(false) == 1;
                            if (class460.field6579 == 3) {
                                boolean var20 = var19.method3826(false) == 1;
                                if (var20) {
                                    long var21 = var19.method3854((byte) -12);
                                    String var23 = class477.method2797(var21, arg0 ^ 0x1C73);
                                    int var24 = var19.method3826(false);
                                    byte[] var25 = new byte[var24];
                                    var19.method322(var25, 0, var24, (byte) 119);
                                    String var26 = class118.method911(var25, arg0 - 12877);
                                    class203 var27 = null;
                                    try {
                                        class494 var28 = class368.field5267.method14(false, "3", -128);
                                        while (var28.field7024 == 0) {
                                            class561.method3202(1L, (byte) -85);
                                        }
                                        if (var28.field7024 == 1) {
                                            var27 = (class203) var28.field7019;
                                            int var29 = var23.length() + (3 - -var26.length()) + 1 + 12 + 2 + 2;
                                            if (class493.field7018 != null) {
                                                var29 += class493.field7018.length() + 2;
                                            }
                                            if (var29 > 120) {
                                                throw new RuntimeException(">120");
                                            }
                                            class695 var30 = new class695(var29 + 1);
                                            var30.method3853((byte) 51, var29);
                                            var30.method3853((byte) 51, 3);
                                            var30.method3878(var23, (byte) 98);
                                            var30.method3878(var26, (byte) 73);
                                            var30.method3852(false, class40.field657);
                                            var30.method3824(16384, class254.field3901);
                                            var30.method3853((byte) 51, class493.field7018 == null ? 0 : 1);
                                            if (class493.field7018 != null) {
                                                var30.method3878(class493.field7018, (byte) 115);
                                            }
                                            var30.method3861(false);
                                            var27.method1345(var30.field9761, 0, var30.field9796, -4290);
                                        }
                                    } catch (Exception var40) {
                                    }
                                    try {
                                        if (var27 != null) {
                                            var27.method1344((byte) 126);
                                        }
                                    } catch (Exception var38) {
                                    }
                                    try {
                                        class556.method3150(-21295, class421.field6129, "demoaccountcreated");
                                    } catch (Throwable var37) {
                                    }
                                }
                            }
                            class101.field1572.method2619(-1, class267.field4035);
                            class41.field682.method2224(class267.field4035, false);
                            class393.field5824.method365(true, class267.field4035);
                        } else if (class274.field4181.method2233(class417.field6075, arg0 - 13119)) {
                            class274.field4181.method2231(-110, class417.field6075, var19.field9796, 0);
                            var19.field9761 = 0;
                            class558.field7877 = var19.method3826(false);
                            class473.field6751 = var19.method3826(false);
                            class70.field1249 = var19.method3826(false) == 1;
                            class379.field5373 = var19.method3826(false) == 1;
                            class179.field2551 = var19.method3826(false) == 1;
                            class129.field1900 = var19.method3814(false);
                            class149.field2169 = class129.field1900 > 0;
                            class356.field5108 = var19.method3847((byte) 118);
                            class57.field1097 = var19.method3847((byte) 118);
                            class262.field3978 = var19.method3847((byte) 118);
                            class311.field4608 = var19.method3880(8);
                            class573.field8063 = class368.field5267.method15(true, class311.field4608);
                            class395.field5868 = var19.method3826(false);
                            class16.field173 = var19.method3847((byte) 118);
                            class531.field7449 = var19.method3847((byte) 118);
                            class66.field1220 = var19.method3826(false) == 1;
                            class648.field9106.field6981 = class648.field9106.field6949 = var19.method3874(124);
                            class442.field6445 = var19.method3826(false);
                            class686.field9677 = var19.method3880(8);
                            class254.field3900 = new class333();
                            class254.field3900.field4938 = var19.method3847((byte) 118);
                            if (class254.field3900.field4938 == 65535) {
                                class254.field3900.field4938 = -1;
                            }
                            class254.field3900.field4948 = var19.method3874(arg0 ^ 0x3332);
                            if (class379.field5372 != class296.field4357) {
                                class254.field3900.field4937 = class254.field3900.field4938 + 40000;
                                class254.field3900.field4941 = class254.field3900.field4938 + 50000;
                            }
                            if (class379.field5372 != class160.field2306 && (class228.field3284.method2101(-70, class352.field5077) || class228.field3284.method2101(-60, class136.field1994))) {
                                class701.method3906((byte) 120);
                            }
                        } else {
                            return;
                        }
                        if ((!class70.field1249 || class179.field2551) && !class149.field2169) {
                            try {
                                class556.method3150(-21295, class421.field6129, "unzap");
                            } catch (Throwable var35) {
                            }
                        } else {
                            try {
                                class556.method3150(-21295, class421.field6129, "zap");
                            } catch (Throwable var39) {
                                if (class162.field2328) {
                                    try {
                                        class421.field6129.getAppletContext().showDocument(new URL(class421.field6129.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var36) {
                                    }
                                }
                            }
                        }
                        if (class379.field5372 == class296.field4357) {
                            try {
                                class556.method3150(-21295, class421.field6129, "loggedin");
                            } catch (Throwable var34) {
                            }
                        }
                        if (class460.field6579 != 2 && class460.field6579 != 3) {
                            class676.field9555 = 0;
                            class516.method2951((byte) 93, 2);
                            class554.method3145(arg0 ^ 0x335C);
                            class112.method868(7, (byte) 74);
                            class312.field4616 = null;
                            return;
                        }
                        class676.field9555 = 12;
                    }
                    if (class676.field9555 == 12) {
                        if (!class274.field4181.method2233(3, 13)) {
                            return;
                        }
                        class274.field4181.method2231(-85, 3, class523.field7392.field9796, 0);
                        class676.field9555 = 13;
                    }
                    if (class676.field9555 == 13) {
                        class26 var31 = class523.field7392;
                        var31.field9761 = 0;
                        if (var31.method318(-7976)) {
                            if (!class274.field4181.method2233(1, 13)) {
                                return;
                            }
                            class274.field4181.method2231(-102, 1, var31.field9796, 3);
                        }
                        class312.field4616 = class26.method315(arg0 ^ 0x33B3)[var31.method310((byte) 110)];
                        class418.field6098 = var31.method3847((byte) 118);
                        class676.field9555 = 11;
                    }
                    if (class676.field9555 == 11) {
                        if (class274.field4181.method2233(class418.field6098, 13)) {
                            class274.field4181.method2231(-119, class418.field6098, class523.field7392.field9796, 0);
                            class523.field7392.field9761 = 0;
                            int var32 = class418.field6098;
                            class676.field9555 = 0;
                            class516.method2951((byte) -121, 2);
                            class169.method1162((byte) -37);
                            class371.method2243(class523.field7392, -63);
                            class312.field4619 = -1;
                            if (class312.field4616 == class19.field221) {
                                class119.method912(-1);
                            } else {
                                class66.method669(false);
                            }
                            if (class523.field7392.field9761 != var32) {
                                throw new RuntimeException("lswp pos:" + class523.field7392.field9761 + " psize:" + var32);
                            }
                            class312.field4616 = null;
                        }
                    } else if (class676.field9555 == 15) {
                        if (class418.field6098 == -2) {
                            if (!class274.field4181.method2233(2, 13)) {
                                return;
                            }
                            class274.field4181.method2231(arg0 ^ 0xFFFFCCAD, 2, class523.field7392.field9796, 0);
                            class523.field7392.field9761 = 0;
                            class418.field6098 = class523.field7392.method3847((byte) 118);
                        }
                        if (class274.field4181.method2233(class418.field6098, 13)) {
                            class274.field4181.method2231(arg0 ^ 0xFFFFCCC0, class418.field6098, class523.field7392.field9796, 0);
                            class523.field7392.field9761 = 0;
                            class676.field9555 = 0;
                            int var33 = class418.field6098;
                            class516.method2951((byte) -124, 15);
                            class666.method3684(85);
                            class371.method2243(class523.field7392, -100);
                            if (class523.field7392.field9761 != var33) {
                                throw new RuntimeException("lswpr pos:" + class523.field7392.field9761 + " psize:" + var33);
                            }
                            class312.field4616 = null;
                        }
                    }
                } else if (class274.field4181.method2233(1, arg0 - 13119)) {
                    class274.field4181.method2231(-109, 1, class523.field7392.field9796, 0);
                    class417.field6075 = class523.field7392.field9796[0] & 0xFF;
                    class676.field9555 = 10;
                }
            }
        } catch (IOException var41) {
            if (class274.field4181 != null) {
                class274.field4181.method2234(false);
                class274.field4181 = null;
            }
            if (class272.field4103 >= 2) {
                class676.field9555 = 0;
                class516.method2951((byte) 125, -4);
                class36.method427(false);
            } else {
                if (class460.field6579 == 2 || class460.field6579 == 3) {
                    class228.field3284.method2103(-1);
                } else {
                    class533.field7487.method2103(-1);
                }
                class272.field4103++;
                class676.field9555 = 1;
                class102.field1604 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)Z")
    public final boolean method419(byte arg0) {
        field7666++;
        boolean var2 = true;
        if (!this.field7673.method2997((byte) -95, this.field7675.field5976)) {
            var2 = false;
        }
        if (arg0 <= 56) {
            method3086(7, 100, -19, -8, (byte) -33);
        }
        if (!this.field7667.method2997((byte) -95, this.field7675.field5976)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public final void method421(byte arg0, boolean arg1) {
        field7671++;
        int var3 = 52 / ((7 - arg0) / 56);
        if (arg1) {
            int var4 = this.field7675.field5989.method860(class245.field3815, this.field7675.field5985, (byte) 56) + this.field7675.field5983;
            int var5 = this.field7675.field5988.method3509(class544.field7651, (byte) 120, this.field7675.field5974) + this.field7675.field5990;
            this.field7670.method2501(null, this.field7675.field5975, var4, this.field7675.field5974, this.field7675.field5980, null, this.field7675.field5984, this.field7675.field5982, null, 0, 0, var5, 0, this.field7675.field5985, this.field7675.field5987, this.field7675.field5973);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lpu;Lpu;Lpr;)V")
    public class545(class522 arg0, class522 arg1, class410 arg2) {
        this.field7673 = arg0;
        this.field7667 = arg1;
        this.field7675 = arg2;
    }
}
