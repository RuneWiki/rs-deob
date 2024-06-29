import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class433 {

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "Z")
    private boolean field6265;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "Z")
    private boolean field6271;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "[S")
    public short[] field6263;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public int field6272;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    private int field6266;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    private int field6261;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    private int field6264;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    private int field6267;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    private int field6268;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "Lza;")
    public static class295 field6273;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Lsa;")
    public class447 field6257;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZB)V", line = 3)
    public final void method2566(int arg0, boolean arg1, byte arg2) {
        field6259++;
        int var4;
        if (arg1) {
            var4 = 2048;
        } else {
            int var5 = this.field6264 * arg0 / 50 + this.field6266 & 0x7FF;
            int var6 = this.field6267;
            if (var6 == 1) {
                var4 = (class51.field743[var5 << 3] >> 5) + 1024;
            } else if (var6 == 3) {
                var4 = class441.field6352[var5] >> 1;
            } else if (var6 == 4) {
                var4 = var5 >> 10 << 11;
            } else if (var6 == 2) {
                var4 = var5;
            } else if (var6 == 5) {
                var4 = (var5 >= 1024 ? 2048 - var5 : var5) << 1;
            } else {
                var4 = 2048;
            }
        }
        if (arg2 == 87) {
            this.field6257.method574((byte) 89, (float) ((this.field6261 * var4 >> 11) + this.field6268) / 2048.0F);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 83)
    public static final void method2567(int arg0) {
        field6256++;
        class125.field1920.method2764(-769);
        if (arg0 != 0) {
            field6273 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lza;IIIIII)V", line = 97)
    private final void method2568(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6257 = arg0.method518(arg2, arg1, arg3, arg4, arg5, (float) arg6);
        field6262++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIIZBI)V", line = 106)
    public static final void method2569(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field6270++;
        if (class103.field1632 == null) {
            class275.field3737.method1712(arg5, 0, -16777216, arg0, arg2, arg1);
        } else if (class81.field1158.field6284 >= 0 && class81.field1158.field6284 < class9.field111 * 128 && class81.field1158.field6287 >= 0 && class192.field2809 * 128 > class81.field1158.field6287) {
            class367.field5267++;
            if (class81.field1158 != null && (class81.field1158.field6284 + 64 - (class81.field1158.method116(8569) * 64) >> 7) == class71.field1023 && class81.field1158.field6287 - ((class81.field1158.method116(8569) - 1) * 64) >> 7 == class506.field7400) {
                class71.field1023 = -1;
                class506.field7400 = -1;
                class296.method1719(2);
            }
            class1.method13(4545);
            if (!arg3) {
                class83.method647(32768);
            }
            class210.method1336(9734);
            class241.method1466(arg2, arg5, arg1, arg0, -2731, true);
            int var6 = class367.field5266;
            int var7 = class510.field7460;
            int var8 = class185.field2743;
            int var9 = class13.field142;
            if (class247.field3363 == 1) {
                int var10 = (int) class496.field7236;
                if (class238.field3297 >> 8 > var10) {
                    var10 = class238.field3297 >> 8;
                }
                if (class309.field4206[4] && var10 < class449.field6583[4] + 128) {
                    var10 = class449.field6583[4] + 128;
                }
                int var11 = (int) class191.field2797 + class93.field1525 & 0x3FFF;
                class172.method1173(class193.field2815, var7, var11, class70.field1012, ((var10 >> 3) * 3) + 600 << 0, -447, class123.method893(class81.field1158.field6287, class81.field1158.field6284, (byte) -13, class366.field5260) - 50, var10);
            } else if (class247.field3363 == 4) {
                int var12 = (int) class496.field7236;
                if (var12 < class238.field3297 >> 8) {
                    var12 = class238.field3297 >> 8;
                }
                if (class309.field4206[4] && class449.field6583[4] + 128 > var12) {
                    var12 = class449.field6583[4] + 128;
                }
                int var13 = (int) class191.field2797 & 0x3FFF;
                class172.method1173(class193.field2815, var7, var13, class70.field1012, (var12 >> 3) * 3 + 600 << 0, -447, class123.method893(class102.field1606, class387.field5569, (byte) -13, class366.field5260) - 50, var12);
            } else if (class247.field3363 == 5) {
                class363.method2171(16384, var7);
            }
            int var14 = class118.field1848;
            int var15 = class159.field2421;
            int var16 = class108.field1747;
            int var17 = class153.field2357;
            int var18 = class49.field706;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class309.field4206[var19]) {
                    int var22 = (int) ((double) (-class164.field2495[var19]) + Math.random() * (double) (class164.field2495[var19] * 2 + 1) + Math.sin((double) class523.field7658[var19] / 100.0D * (double) class314.field4260[var19]) * (double) class449.field6583[var19]);
                    if (var19 == 1) {
                        class159.field2421 += var22;
                    }
                    if (var19 == 4) {
                        class153.field2357 += var22;
                        if (class153.field2357 < 1024) {
                            class153.field2357 = 1024;
                        } else if (class153.field2357 > 3072) {
                            class153.field2357 = 3072;
                        }
                    }
                    if (var19 == 2) {
                        class108.field1747 += var22;
                    }
                    if (var19 == 0) {
                        class118.field1848 += var22;
                    }
                    if (var19 == 3) {
                        class49.field706 = class49.field706 + var22 & 0x3FFF;
                    }
                }
            }
            if (class118.field1848 < 0) {
                class118.field1848 = 0;
            }
            if (((class124.field1916 << 7) - 1) < class118.field1848) {
                class118.field1848 = (class124.field1916 << 7) - 1;
            }
            if (arg4 >= 80) {
                if (class108.field1747 < 0) {
                    class108.field1747 = 0;
                }
                if (((class177.field2664 << 7) - 1) < class108.field1747) {
                    class108.field1747 = (class177.field2664 << 7) - 1;
                }
                class251.method1503(true);
                class480.method2857(-377250077);
                class275.field3737.method511(var9, var8, var9 + var6, var7 + var8);
                class275.field3737.method532();
                int var20 = class42.field625;
                if (class284.field3854 == null) {
                    class275.field3737.method467(var20);
                } else {
                    class284.field3854.method844(var9, -4926, var8, class153.field2357, class275.field3737, class49.field706, class316.field4298 << 3, var6, var20, var7);
                }
                class287.method1649(841283500);
                class14.field146.method943(class118.field1848, class159.field2421, class108.field1747, -class153.field2357 & 0x3FFF, -class49.field706 & 0x3FFF, -class455.field6641 & 0x3FFF);
                class275.field3737.method548(class14.field146);
                class275.field3737.method471(var6 / 2 + var9, var7 / 2 + var8, class211.field3008 << 1, class211.field3008 << 1);
                class527.method3124(class211.field3008 << 1, var6 / 2 + var9, class211.field3008 << 1, (byte) -6, var8 + (var7 / 2));
                class240.method1459(-class455.field6641 & 0x3FFF, class159.field2421, 20284, -class49.field706 & 0x3FFF, class108.field1747, -class153.field2357 & 0x3FFF, class118.field1848);
                byte var21 = class76.field1075.method1108(2, class195.field2849) == 2 ? (byte) class367.field5267 : 1;
                class484.method2867(class275.field3737, class28.field417, class499.field7299, class14.field146, class118.field1848, class159.field2421, class108.field1747, class398.field5712, class109.field1770, class292.field3953, class437.field6310, class325.field4447, class278.field3785, class81.field1158.field6279 + 1, var21, class81.field1158.field6284 >> 7, class81.field1158.field6287 >> 7, !class76.field1075.field3658);
                class287.method1649(841283500);
                if (class494.field7155 == 9) {
                    class288.method1660(var8, var9, -64, 256, 256, var6, var7);
                    class256.method1524(var6, var7, var8, 256, false, 256, var9);
                    class267.method1573(var6, var8, var9, 256, 256, var7, -110);
                    class332.method1960(var7, var9, var8, -87, var6);
                }
                class112.method845();
                class153.field2357 = var17;
                class108.field1747 = var16;
                class159.field2421 = var15;
                class49.field706 = var18;
                class118.field1848 = var14;
                if (class281.field3824 && class503.field7364.method1288(true) == 0) {
                    class281.field3824 = false;
                }
                if (class281.field3824) {
                    class275.field3737.method1712(var7, 0, -16777216, var6, var8, var9);
                    class229.method1408(0, class314.field4251.method1126(class486.field6998, (byte) -19), class331.field4510, false);
                }
            }
        } else {
            class275.field3737.method1712(arg5, 0, -16777216, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 309)
    public static void method2570(int arg0) {
        field6273 = null;
        int var1 = 121 / ((6 - arg0) / 58);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lus;)V", line = 321)
    public static final void method2571(class433 arg0) {
        if (class384.field5507 >= 65535) {
            return;
        }
        class447 var1 = arg0.field6257;
        class231.field3229[class384.field5507] = arg0;
        class159.field2417[class384.field5507] = false;
        class384.field5507++;
        int var2 = arg0.field6258;
        if (arg0.field6271) {
            var2 = 0;
        }
        int var3 = arg0.field6258;
        if (arg0.field6265) {
            var3 = class265.field3571 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method2638(21981) + class392.field5656 - var1.method2636((byte) 126) >> class295.field3991;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method2638(21981) + var1.method2636((byte) 92) - class392.field5656 >> class295.field3991;
            if (var7 >= class177.field2664) {
                var7 = class177.field2664 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field6263[var5++];
                int var10 = (var1.method2633(0) + class392.field5656 - var1.method2636((byte) 63) >> class295.field3991) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class124.field1916) {
                    var11 = class124.field1916 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class118.field1853[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class118.field1853[var4][var12][var8] = var13 | (long) class384.field5507;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class118.field1853[var4][var12][var8] = var13 | (long) class384.field5507 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class118.field1853[var4][var12][var8] = var13 | (long) class384.field5507 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class118.field1853[var4][var12][var8] = var13 | (long) class384.field5507 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 415)
    private final void method2572(byte arg0) {
        field6269++;
        int var2 = -38 / ((arg0 + 21) / 60);
        int var3 = this.field6272;
        if (var3 == 2) {
            this.field6267 = 1;
            this.field6268 = 0;
            this.field6261 = 2048;
            this.field6264 = 2048;
        } else if (var3 == 3) {
            this.field6267 = 1;
            this.field6268 = 0;
            this.field6264 = 4096;
            this.field6261 = 2048;
        } else if (var3 == 4) {
            this.field6261 = 2048;
            this.field6264 = 2048;
            this.field6268 = 0;
            this.field6267 = 4;
        } else if (var3 == 5) {
            this.field6268 = 0;
            this.field6264 = 8192;
            this.field6261 = 2048;
            this.field6267 = 4;
        } else if (var3 == 12) {
            this.field6267 = 2;
            this.field6264 = 2048;
            this.field6261 = 2048;
            this.field6268 = 0;
        } else if (var3 == 13) {
            this.field6267 = 2;
            this.field6264 = 8192;
            this.field6268 = 0;
            this.field6261 = 2048;
        } else if (var3 == 10) {
            this.field6268 = 1536;
            this.field6267 = 3;
            this.field6261 = 512;
            this.field6264 = 2048;
        } else if (var3 == 11) {
            this.field6264 = 4096;
            this.field6267 = 3;
            this.field6268 = 1536;
            this.field6261 = 512;
        } else if (var3 == 6) {
            this.field6267 = 3;
            this.field6264 = 2048;
            this.field6261 = 768;
            this.field6268 = 1280;
        } else if (var3 == 7) {
            this.field6267 = 3;
            this.field6268 = 1280;
            this.field6261 = 768;
            this.field6264 = 4096;
        } else if (var3 == 8) {
            this.field6261 = 1024;
            this.field6268 = 1024;
            this.field6264 = 2048;
            this.field6267 = 3;
        } else if (var3 == 9) {
            this.field6264 = 4096;
            this.field6267 = 3;
            this.field6261 = 1024;
            this.field6268 = 1024;
        } else if (var3 == 14) {
            this.field6267 = 1;
            this.field6264 = 2048;
            this.field6261 = 768;
            this.field6268 = 1280;
        } else if (var3 == 15) {
            this.field6267 = 1;
            this.field6264 = 4096;
            this.field6268 = 1536;
            this.field6261 = 512;
        } else if (var3 == 16) {
            this.field6261 = 256;
            this.field6268 = 1792;
            this.field6267 = 1;
            this.field6264 = 8192;
        } else {
            this.field6264 = 2048;
            this.field6267 = 0;
            this.field6268 = 0;
            this.field6261 = 2048;
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 611)
    protected class433() {
        if (class441.field6352 == null) {
            class145.method1006((byte) -84);
        }
        this.method2572((byte) -107);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lza;Lsv;I)V", line = 625)
    public class433(class295 arg0, class319 arg1, int arg2) {
        if (class441.field6352 == null) {
            class145.method1006((byte) -121);
        }
        this.field6258 = arg1.method1869(-77);
        this.field6265 = (this.field6258 & 0x8) != 0;
        this.field6271 = (this.field6258 & 0x10) != 0;
        this.field6258 &= 0x7;
        int var4 = arg1.method1844(-117) << arg2;
        int var5 = arg1.method1844(-105) << arg2;
        int var6 = arg1.method1844(-127) << arg2;
        int var7 = arg1.method1869(-91);
        int var8 = var7 * 2 + 1;
        this.field6263 = new short[var8];
        for (int var9 = 0; var9 < this.field6263.length; var9++) {
            short var13 = (short) arg1.method1844(-111);
            int var14 = var13 >>> 8;
            int var15 = var13 & 0xFF;
            if (var8 <= var14) {
                var14 = var8 - 1;
            }
            if ((var8 - var14) < var15) {
                var15 = var8 - var14;
            }
            this.field6263[var9] = (short) class219.method1367(var14 << 8, var15);
        }
        int var10 = (var7 << class295.field3991) + class392.field5656;
        int var11 = class203.field2946 == null ? class188.field2769[class156.method1123(arg1.method1844(-101), -115) & 0xFFFF] : class203.field2946[arg1.method1844(-105)];
        int var12 = arg1.method1869(-104);
        this.field6272 = var12 & 0x1F;
        this.field6266 = (var12 & 0xE0) << 3;
        if (this.field6272 != 31) {
            this.method2572((byte) -96);
        }
        this.method2568(arg0, var6, var4, var5, var10, var11, 1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIZII)V", line = 686)
    public final void method2573(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.field6268 = arg1;
        if (arg2) {
            method2569(-28, 112, -45, true, (byte) -23, -45);
        }
        this.field6261 = arg3;
        this.field6267 = arg4;
        field6260++;
        this.field6264 = arg0;
    }
}
