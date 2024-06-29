import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class25 {

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Lpca;")
    private class653 field307 = new class653(64);

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "Lpca;")
    private class653 field313 = new class653(100);

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "Ljo;")
    private class303 field312;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "[Lam;")
    public static class576[] field309 = new class576[14];

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "Ljo;")
    public static class303 field304;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)V", line = 5)
    public final void method123(boolean arg0) {
        class653 var2 = this.field307;
        synchronized (this.field307) {
            this.field307.method3687((byte) -10);
        }
        field308++;
        class653 var3 = this.field313;
        synchronized (this.field313) {
            this.field313.method3687((byte) -10);
            if (!arg0) {
                method125(0.5377115003768365D, (byte) 81);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)Lam;", line = 26)
    public final class576 method124(int arg0, int arg1) {
        field301++;
        class653 var3 = this.field307;
        class576 var4;
        synchronized (this.field307) {
            var4 = (class576) this.field307.method3690((byte) 114, (long) arg1);
        }
        if (arg0 != 24006) {
            return null;
        } else if (var4 == null) {
            class303 var5 = this.field312;
            byte[] var6;
            synchronized (this.field312) {
                var6 = this.field312.method1719(class230.method1335(-126, arg1), class40.method210(arg1, (byte) -57), 4);
            }
            class576 var7 = new class576();
            var7.field8229 = arg1;
            var7.field8236 = this;
            if (var6 != null) {
                var7.method3261(arg0 ^ 0xFFFFA239, new class452(var6));
            }
            var7.method3259(true);
            class653 var8 = this.field307;
            synchronized (this.field307) {
                this.field307.method3683(var7, (byte) -111, (long) arg1);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(DB)V", line = 60)
    public static final void method125(double arg0, byte arg1) {
        if (arg1 != -28) {
            return;
        }
        if (class490.field7108 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class170.field2039[var3] = var4 <= 255 ? var4 : 255;
            }
            class490.field7108 = arg0;
        }
        field303++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 88)
    public static final void method126(byte arg0) {
        field305++;
        if (class556.field7919.toLowerCase().indexOf("microsoft") == -1) {
            class530.field7599[47] = 73;
            class530.field7599[45] = 26;
            class530.field7599[59] = 57;
            class530.field7599[93] = 43;
            class530.field7599[44] = 71;
            class530.field7599[46] = 72;
            class530.field7599[61] = 27;
            class530.field7599[92] = 74;
            if (class556.field7928 == null) {
                class530.field7599[192] = 58;
                class530.field7599[222] = 59;
            } else {
                class530.field7599[222] = 58;
                class530.field7599[520] = 59;
                class530.field7599[192] = 28;
            }
            class530.field7599[91] = 42;
        } else {
            class530.field7599[219] = 42;
            class530.field7599[186] = 57;
            class530.field7599[221] = 43;
            class530.field7599[189] = 26;
            class530.field7599[220] = 74;
            class530.field7599[222] = 59;
            class530.field7599[187] = 27;
            class530.field7599[191] = 73;
            class530.field7599[188] = 71;
            class530.field7599[223] = 28;
            class530.field7599[190] = 72;
            class530.field7599[192] = 58;
        }
        if (arg0 > -94) {
            method128(null, null, true);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V", line = 138)
    public static void method127(byte arg0) {
        field309 = null;
        if (arg0 != 119) {
            method130(79);
        }
        field304 = null;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lpp;Lpp;Z)V", line = 153)
    public static final void method128(class356 arg0, class356 arg1, boolean arg2) {
        field310++;
        if (arg0.field4675 != null) {
            arg0.method1968((byte) -97);
        }
        arg0.field4675 = arg1;
        if (!arg2) {
            arg0.field4673 = arg1.field4673;
            arg0.field4675.field4673 = arg0;
            arg0.field4673.field4675 = arg0;
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V", line = 171)
    public final void method129(int arg0, int arg1) {
        class653 var3 = this.field307;
        synchronized (this.field307) {
            this.field307.method3691(false, arg0);
        }
        field311++;
        class653 var4 = this.field313;
        synchronized (this.field313) {
            int var5 = -15 / ((50 - arg1) / 41);
            this.field313.method3691(false, arg0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 188)
    public static final void method130(int arg0) {
        field302++;
        if (class274.field3474 == 0 || class274.field3474 == 6) {
            return;
        }
        try {
            if (++class415.field5503 > 2000) {
                if (class170.field2043 != null) {
                    class170.field2043.method1642(arg0 ^ 0xFFFFFFF9);
                    class170.field2043 = null;
                }
                if (class387.field5175 >= 2) {
                    class274.field3474 = 0;
                    class539.method3071(-5, (byte) -119);
                    return;
                }
                if (class19.field176 == 2 || class19.field176 == 3) {
                    class277.field3494.method1746(0);
                } else {
                    class255.field3257.method1746(arg0 ^ 0x6);
                }
                class415.field5503 = 0;
                class387.field5175++;
                class274.field3474 = 1;
            }
            if (class274.field3474 == 1) {
                if (class19.field176 == 2 || class19.field176 == 3) {
                    class553.field7886 = class277.field3494.method1743((byte) -115, class623.field8837);
                } else {
                    class553.field7886 = class255.field3257.method1743((byte) -110, class623.field8837);
                }
                class274.field3474 = 2;
            }
            if (class274.field3474 == 2) {
                if (class553.field7886.field2437 == 2) {
                    throw new IOException();
                }
                if (class553.field7886.field2437 != 1) {
                    return;
                }
                class170.field2043 = class57.method389(false, 5000, (Socket) class553.field7886.field2434);
                class553.field7886 = null;
                long var1 = class249.field3199 = class650.method3669(arg0 ^ 0xFFFFBF78, class380.field4932);
                class334.field4314.field6215 = 0;
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class334.field4314.method2525(class61.field628.field689, -81849);
                class334.field4314.method2525(var3, -81849);
                class170.field2043.method1641(-32754, 0, 2, class334.field4314.field6209);
                class274.field3474 = 3;
            }
            if (class274.field3474 == 3) {
                if (!class170.field2043.method1644(1, 12)) {
                    return;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                int var4 = class680.field9630.field6209[0] & 0xFF;
                if (var4 != 0) {
                    class274.field3474 = 0;
                    class539.method3071(var4, (byte) -70);
                    class170.field2043.method1642(-1);
                    class170.field2043 = null;
                    class518.method2955(arg0 ^ 0x46);
                    return;
                }
                class274.field3474 = 4;
            }
            if (class274.field3474 == 4) {
                if (!class170.field2043.method1644(8, 12)) {
                    return;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 8, arg0 ^ 0xA);
                class680.field9630.field6215 = 0;
                class404.field5390 = class680.field9630.method2510((byte) 38);
                class452 var5 = new class452(518);
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class404.field5390 >> 32), (int) class404.field5390 };
                var5.method2525(10, -81849);
                var5.method2554(var6[0], arg0 ^ 0xF9);
                var5.method2554(var6[1], 255);
                var5.method2554(var6[2], 255);
                var5.method2554(var6[3], 255);
                var5.method2518((byte) 127, class650.method3669(-16514, class380.field4932));
                var5.method2573(class673.field9560, arg0 ^ 0x416C);
                var5.method2518((byte) 107, class632.field8964);
                var5.method2518((byte) 113, class386.field5163);
                var5.method2531(class210.field2550, arg0 ^ 0x7A, class81.field860);
                class617 var7 = class334.field4314;
                var7.field6215 = 0;
                if (class19.field176 == 2 || class19.field176 == 3) {
                    if (class351.field4601 == 13) {
                        var7.method2525(class61.field634.field689, -81849);
                    } else {
                        var7.method2525(class61.field632.field689, -81849);
                    }
                    var7.method2537(arg0 + 18238, 0);
                    int var9 = var7.field6215;
                    var7.method2554(612, 255);
                    var7.method2525(class347.field4526, arg0 - 81855);
                    var7.method2525(class480.method2800(arg0 ^ 0x7D26), -81849);
                    var7.method2537(arg0 ^ 0x4742, class399.field5336);
                    var7.method2537(arg0 + 18238, class416.field5524);
                    var7.method2525(class601.field8530.field2858, -81849);
                    class315.method1785(0, var7);
                    var7.method2573(class68.field738, 16746);
                    var7.method2554(class559.field7965, arg0 ^ 0xF9);
                    class452 var10 = new class452(class421.method2283((byte) -112));
                    class601.field8530.method1316(var10, (byte) -128);
                    var7.method2525(var10.field6215, -81849);
                    var7.method2514(var10.field6215, var10.field6209, -27824, 0);
                    class272.field3441 = true;
                    class452 var11 = new class452(class245.method1419((byte) -13));
                    (new class79(true, class623.field8837)).method507(false, var11);
                    var7.method2514(var11.field6209.length, var11.field6209, -27824, 0);
                    var7.method2537(arg0 + 18238, class30.field353);
                    var7.method2518((byte) 108, class222.field2795);
                    class635.method3550(true);
                    var7.method2514(var5.field6215, var5.field6209, -27824, 0);
                    var7.method2538(var7.field6215 - var9, 1088707560);
                } else {
                    var7.method2525(class61.field635.field689, -81849);
                    var7.method2537(18244, 0);
                    int var8 = var7.field6215;
                    var7.method2554(612, arg0 ^ 0xF9);
                    var7.method2525(class220.field2668.field2518, arg0 - 81855);
                    var7.method2525(class226.field2899, -81849);
                    class315.method1785(0, var7);
                    var7.method2573(class68.field738, 16746);
                    var7.method2554(class559.field7965, 255);
                    class635.method3550(true);
                    var7.method2514(var5.field6215, var5.field6209, arg0 - 27830, 0);
                    var7.method2538(var7.field6215 - var8, arg0 + 1088707554);
                }
                class170.field2043.method1641(arg0 ^ 0xFFFF8008, 0, var7.field6215, var7.field6209);
                var7.method3462(var6, (byte) -110);
                for (int var12 = 0; var12 < 4; var12++) {
                    var6[var12] += 50;
                }
                class680.field9630.method3462(var6, (byte) -110);
                class274.field3474 = 5;
            }
            if (class274.field3474 == 5) {
                if (!class170.field2043.method1644(1, 12)) {
                    return;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 1, arg0 ^ 0xA);
                int var13 = class680.field9630.field6209[0] & 0xFF;
                if (var13 == 21) {
                    class274.field3474 = 8;
                } else if (var13 == 29) {
                    class274.field3474 = 14;
                } else if (var13 == 1) {
                    class274.field3474 = 6;
                    class539.method3071(var13, (byte) -57);
                    return;
                } else if (var13 == 2) {
                    class274.field3474 = 9;
                } else if (var13 == 15) {
                    class274.field3474 = 15;
                    class478.field7009 = -2;
                } else if (var13 == 23 && class387.field5175 < 2) {
                    class274.field3474 = 1;
                    class415.field5503 = 0;
                    class387.field5175++;
                    class170.field2043.method1642(-1);
                    class170.field2043 = null;
                    return;
                } else {
                    class274.field3474 = 0;
                    class539.method3071(var13, (byte) -73);
                    class170.field2043.method1642(-1);
                    class170.field2043 = null;
                    class518.method2955(44);
                    return;
                }
            }
            if (class274.field3474 == 7) {
                class334.field4314.field6215 = 0;
                class334.field4314.method3467(class61.field642.field689, true);
                class170.field2043.method1641(-32754, 0, class334.field4314.field6215, class334.field4314.field6209);
                class274.field3474 = 5;
            } else {
                if (arg0 != 6) {
                    field304 = null;
                }
                if (class274.field3474 == 8) {
                    if (class170.field2043.method1644(1, 12)) {
                        class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                        int var14 = class680.field9630.field6209[0] & 0xFF;
                        class274.field3474 = 0;
                        class436.field6078 = (var14 + 3) * 60;
                        class539.method3071(21, (byte) -51);
                        class170.field2043.method1642(arg0 ^ 0xFFFFFFF9);
                        class170.field2043 = null;
                        class518.method2955(69);
                    }
                } else if (class274.field3474 == 14) {
                    if (class170.field2043.method1644(1, arg0 ^ 0xA)) {
                        class170.field2043.method1640(class680.field9630.field6209, 0, 1, arg0 ^ 0xA);
                        class274.field3474 = 0;
                        class405.field5405 = class680.field9630.field6209[0] & 0xFF;
                        class539.method3071(29, (byte) -51);
                        class170.field2043.method1642(arg0 - 7);
                        class170.field2043 = null;
                        class518.method2955(arg0 - 111);
                    }
                } else if (class274.field3474 != 9) {
                    if (class274.field3474 == 10) {
                        class617 var15 = class680.field9630;
                        if (class19.field176 == 3) {
                            class8.field69 = true;
                        } else {
                            class8.field69 = false;
                        }
                        if (class19.field176 == 2 || class19.field176 == 3) {
                            if (!class170.field2043.method1644(class490.field7110, arg0 + 6)) {
                                return;
                            }
                            class170.field2043.method1640(var15.field6209, 0, class490.field7110, 12);
                            var15.field6215 = 0;
                            class295.field3874 = var15.method2541(107);
                            class646.field9148 = var15.method2541(126);
                            class89.field946 = var15.method2541(125) == 1;
                            class539.field7752 = var15.method2541(81) == 1;
                            class453.field6278 = var15.method2541(arg0 ^ 0x53) == 1;
                            class198.field2403 = var15.method2541(115) == 1;
                            class90.field1038 = var15.method2574(arg0 - 1758460254);
                            class571.field8101 = var15.method2541(87) == 1;
                            class41.field433 = var15.method2528((byte) -123);
                            class108.field1253 = var15.method2541(58) == 1;
                            if (class19.field176 == 3) {
                                boolean var16 = var15.method2541(82) == 1;
                                if (var16) {
                                    long var17 = var15.method2510((byte) 38);
                                    String var19 = class9.method53(arg0 ^ 0x8802, var17);
                                    int var20 = var15.method2541(arg0 ^ 0x6F);
                                    byte[] var21 = new byte[var20];
                                    var15.method3458(var21, var20, (byte) 11, 0);
                                    String var22 = class185.method1081((byte) 48, var21);
                                    class647 var23 = null;
                                    try {
                                        class199 var24 = class623.field8837.method3140("3", false, -116);
                                        while (var24.field2437 == 0) {
                                            class370.method2025(-1, 1L);
                                        }
                                        if (var24.field2437 == 1) {
                                            var23 = (class647) var24.field2434;
                                            int var25 = (var19.length() + 3 - (-var22.length() - 2)) + 14;
                                            if (var25 > 60) {
                                                throw new RuntimeException(">60");
                                            }
                                            class452 var26 = new class452(var25 + 1);
                                            var26.method2525(var25, -81849);
                                            var26.method2525(2, -81849);
                                            var26.method2569(var19, false);
                                            var26.method2569(var22, false);
                                            var26.method2537(18244, class559.field7965);
                                            var26.method2518((byte) 100, class222.field2795);
                                            var26.method2557(arg0 ^ 0xFFFF86EA);
                                            var23.method3635(var26.field6215, 1, var26.field6209, 0);
                                        }
                                    } catch (Exception var36) {
                                    }
                                    try {
                                        if (var23 != null) {
                                            var23.method3633(arg0 ^ 0x6);
                                        }
                                    } catch (Exception var34) {
                                    }
                                    try {
                                        class432.method2311(4975, "demoaccountcreated", class485.field7068);
                                    } catch (Throwable var33) {
                                    }
                                }
                            }
                            class195.field2339.method3730(class108.field1253, arg0 - 6);
                            class472.field6588.method1912(class108.field1253, false);
                            class608.field8585.method3272(class108.field1253, -16663);
                        } else if (class170.field2043.method1644(class490.field7110, arg0 ^ 0xA)) {
                            class170.field2043.method1640(var15.field6209, 0, class490.field7110, arg0 + 6);
                            var15.field6215 = 0;
                            class295.field3874 = var15.method2541(87);
                            class646.field9148 = var15.method2541(122);
                            class89.field946 = var15.method2541(arg0 + 104) == 1;
                            class539.field7752 = var15.method2541(121) == 1;
                            class453.field6278 = var15.method2541(38) == 1;
                            class664.field9446 = var15.method2574(arg0 - 1758460254);
                            class571.field8101 = class664.field9446 > 0;
                            class300.field3929 = var15.method2574(-1758460248);
                            class19.field172 = var15.method2574(-1758460248);
                            class30.field355 = var15.method2574(-1758460248);
                            class366.field4780 = var15.method2575((byte) -48);
                            class468.field6483 = class623.field8837.method3146(arg0 ^ 0xFFFFFFC6, class366.field4780);
                            class470.field6561 = var15.method2541(74);
                            class406.field5413 = var15.method2574(-1758460248);
                            class286.field3661 = var15.method2574(-1758460248);
                            class398.field5321 = var15.method2541(92) == 1;
                            class377.field4914.field6324 = class377.field4914.field6341 = var15.method2520(4);
                            class314.field4068 = var15.method2541(arg0 ^ 0x5C);
                            class172.field2060 = new class305();
                            class172.field2060.field3986 = var15.method2574(-1758460248);
                            if (class172.field2060.field3986 == 65535) {
                                class172.field2060.field3986 = -1;
                            }
                            class172.field2060.field3992 = var15.method2520(4);
                            if (class73.field771 != class553.field7884) {
                                class172.field2060.field3991 = class172.field2060.field3986 + 40000;
                                class172.field2060.field3989 = class172.field2060.field3986 + 50000;
                            }
                            if (class73.field771 != class137.field1564 && (class277.field3494.method1745(-51, class279.field3530) || class277.field3494.method1745(126, class152.field1726))) {
                                class223.method1312((byte) -35);
                            }
                        } else {
                            return;
                        }
                        if ((!class89.field946 || class453.field6278) && !class571.field8101) {
                            try {
                                class432.method2311(4975, "unzap", class485.field7068);
                            } catch (Throwable var32) {
                            }
                        } else {
                            try {
                                class432.method2311(4975, "zap", class485.field7068);
                            } catch (Throwable var35) {
                                if (class621.field8731) {
                                    try {
                                        class485.field7068.getAppletContext().showDocument(new URL(class485.field7068.getCodeBase(), "blank.ws"), "tbi");
                                    } catch (Exception var31) {
                                    }
                                }
                            }
                        }
                        if (class73.field771 == class553.field7884) {
                            try {
                                class432.method2311(4975, "loggedin", class485.field7068);
                            } catch (Throwable var30) {
                            }
                        }
                        if (class19.field176 != 2 && class19.field176 != 3) {
                            class274.field3474 = 0;
                            class539.method3071(2, (byte) -50);
                            class194.method1114(22722);
                            class508.method2921(7, (byte) -117);
                            class416.field5523 = null;
                            return;
                        }
                        class274.field3474 = 12;
                    }
                    if (class274.field3474 == 12) {
                        if (!class170.field2043.method1644(3, 12)) {
                            return;
                        }
                        class170.field2043.method1640(class680.field9630.field6209, 0, 3, 12);
                        class274.field3474 = 13;
                    }
                    if (class274.field3474 == 13) {
                        class617 var27 = class680.field9630;
                        var27.field6215 = 0;
                        if (var27.method3461(arg0 ^ 0x67)) {
                            if (!class170.field2043.method1644(1, 12)) {
                                return;
                            }
                            class170.field2043.method1640(var27.field6209, 3, 1, 12);
                        }
                        class416.field5523 = class589.method3311(22227)[var27.method3460(-60)];
                        class478.field7009 = var27.method2574(-1758460248);
                        class274.field3474 = 11;
                    }
                    if (class274.field3474 == 11) {
                        if (class170.field2043.method1644(class478.field7009, 12)) {
                            class170.field2043.method1640(class680.field9630.field6209, 0, class478.field7009, 12);
                            class680.field9630.field6215 = 0;
                            class274.field3474 = 0;
                            int var28 = class478.field7009;
                            class539.method3071(2, (byte) -99);
                            class5.method22((byte) 126);
                            class385.method2111(class680.field9630, arg0 ^ 0xFFFFE160);
                            class65.field687 = -1;
                            if (class416.field5523 == class292.field3815) {
                                class381.method2085((byte) -118);
                            } else {
                                class436.method2410(true);
                            }
                            if (class680.field9630.field6215 != var28) {
                                throw new RuntimeException("lswp pos:" + class680.field9630.field6215 + " psize:" + var28);
                            }
                            class416.field5523 = null;
                        }
                    } else if (class274.field3474 == 15) {
                        if (class478.field7009 == -2) {
                            if (!class170.field2043.method1644(2, arg0 ^ 0xA)) {
                                return;
                            }
                            class170.field2043.method1640(class680.field9630.field6209, 0, 2, 12);
                            class680.field9630.field6215 = 0;
                            class478.field7009 = class680.field9630.method2574(arg0 - 1758460254);
                        }
                        if (class170.field2043.method1644(class478.field7009, arg0 + 6)) {
                            class170.field2043.method1640(class680.field9630.field6209, 0, class478.field7009, 12);
                            class680.field9630.field6215 = 0;
                            class274.field3474 = 0;
                            int var29 = class478.field7009;
                            class539.method3071(15, (byte) -68);
                            class463.method2636(79);
                            class385.method2111(class680.field9630, -7834);
                            if (class680.field9630.field6215 != var29) {
                                throw new RuntimeException("lswpr pos:" + class680.field9630.field6215 + " psize:" + var29);
                            }
                            class416.field5523 = null;
                        }
                    }
                } else if (class170.field2043.method1644(1, 12)) {
                    class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                    class490.field7110 = class680.field9630.field6209[0] & 0xFF;
                    class274.field3474 = 10;
                }
            }
        } catch (IOException var37) {
            if (class170.field2043 != null) {
                class170.field2043.method1642(arg0 - 7);
                class170.field2043 = null;
            }
            if (class387.field5175 >= 2) {
                class274.field3474 = 0;
                class539.method3071(-4, (byte) -85);
                class518.method2955(arg0 - 132);
            } else {
                if (class19.field176 == 2 || class19.field176 == 3) {
                    class277.field3494.method1746(0);
                } else {
                    class255.field3257.method1746(0);
                }
                class387.field5175++;
                class415.field5503 = 0;
                class274.field3474 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)Lro;", line = 831)
    public final class2 method131(int arg0, boolean arg1) {
        field306++;
        class653 var3 = this.field313;
        class2 var4;
        synchronized (this.field313) {
            var4 = (class2) this.field313.method3690((byte) 119, (long) arg0);
            if (var4 == null) {
                var4 = new class2(arg0);
                this.field313.method3683(var4, (byte) 104, (long) arg0);
            }
        }
        synchronized (var4) {
            if (var4.method10((byte) -115)) {
                if (!arg1) {
                    this.method129(-37, -67);
                }
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 859)
    public final void method132(int arg0) {
        class653 var2 = this.field307;
        synchronized (this.field307) {
            this.field307.method3684(-17200);
        }
        field300++;
        class653 var3 = this.field313;
        synchronized (this.field313) {
            if (arg0 == 256) {
                this.field313.method3684(-17200);
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Ljda;ILjo;Ljo;Ljo;)V", line = 886)
    public class25(class207 arg0, int arg1, class303 arg2, class303 arg3, class303 arg4) {
        this.field312 = arg2;
        if (this.field312 != null) {
            int var6 = this.field312.method1740((byte) 83) - 1;
            this.field312.method1727(-77, var6);
        }
        class672.method3766(5552, arg3, arg4, 2);
    }
}
