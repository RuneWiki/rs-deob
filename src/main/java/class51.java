import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class51 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "Lku;")
    private class232 field697 = new class232(64);

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public int field708 = 0;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "Lb;")
    private class201 field706;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "Lku;")
    public static class232 field698 = new class232(4);

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "[I")
    public static int[] field705 = new int[2048];

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "F")
    public static float field703;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)Z")
    public static final boolean method325(int arg0) {
        field695++;
        if (arg0 == 2) {
            return class394.field5599 != class356.field5143 || class362.field5213 >= 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public final void method326(int arg0) {
        field700++;
        class232 var2 = this.field697;
        synchronized (this.field697) {
            this.field697.method1475(arg0);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Loa;IILck;I)V")
    public static final void method327(class452 arg0, int arg1, int arg2, class419 arg3, int arg4) {
        field701++;
        if ((arg4 & 0x40) != 0) {
            class8.field80[arg1] = arg3.method1696((byte) -98);
        }
        byte var5 = -1;
        if ((arg4 & 0x200) != 0) {
            int var6 = arg3.method1746(17037);
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            for (int var10 = 0; var10 < var6; var10++) {
                int var11 = arg3.method1749((byte) -75);
                if (var11 == 65535) {
                    var11 = -1;
                }
                var7[var10] = var11;
                var8[var10] = arg3.method1701(-23121);
                var9[var10] = arg3.method1740((byte) 127);
            }
            class148.method932(29807, var7, var8, var9, arg0);
        }
        if ((arg4 & 0x2000) != 0) {
            int var12 = arg3.method1729(65280);
            arg0.field2090 = arg3.method1735(arg2 + 14410);
            arg0.field2126 = arg3.method1746(17037);
            arg0.field2099 = (var12 & 0x8000) != 0;
            arg0.field2098 = var12 & 0x7FFF;
            arg0.field2140 = class353.field5090 + arg0.field2098 + arg0.field2090;
        }
        if (arg2 != -14308) {
            return;
        }
        if ((arg4 & 0x2) != 0) {
            int var13 = arg3.method1701(arg2 ^ 0x6DB3);
            byte[] var14 = new byte[var13];
            class276 var15 = new class276(var14);
            arg3.method1706(var14, 0, -64, var13);
            class486.field6847[arg1] = var15;
            arg0.method2647((byte) -87, var15);
        }
        if ((arg4 & 0x800) != 0) {
            arg0.field2137 = arg3.method1738(false);
            arg0.field2085 = arg3.method1700(32767);
            arg0.field2131 = arg3.method1738(false);
            arg0.field2117 = arg3.method1700(32767);
            arg0.field2111 = arg3.method1740((byte) -55) + class353.field5090;
            arg0.field2148 = arg3.method1709(arg2 ^ 0xFFFFC8E3) + class353.field5090;
            arg0.field2132 = arg3.method1701(-23121);
            arg0.field2160 = 0;
            if (arg0.field6272) {
                arg0.field2117 += arg0.field6265;
                arg0.field2168 = 0;
                arg0.field2085 += arg0.field6265;
                arg0.field2131 += arg0.field6276;
                arg0.field2137 += arg0.field6276;
            } else {
                arg0.field2137 += arg0.field2163[0];
                arg0.field2168 = 1;
                arg0.field2117 += arg0.field2159[0];
                arg0.field2131 += arg0.field2163[0];
                arg0.field2085 += arg0.field2159[0];
            }
        }
        if ((arg4 & 0x8) != 0) {
            int var16 = arg3.method1740((byte) 92);
            int var17 = arg3.method1746(17037);
            int var18 = arg3.method1697((byte) 12);
            int var19 = arg3.field4021;
            boolean var20 = (var16 & 0x8000) != 0;
            if (arg0.field6277 != null && arg0.field6296 != null) {
                boolean var21 = false;
                if (var17 <= 1) {
                    if (!var20 && !(!class479.field6717 || class23.field308) || class363.field5221) {
                        var21 = true;
                    } else if (class114.method722(arg0.field6277, -25288)) {
                        var21 = true;
                    }
                }
                if (!var21 && class479.field6716 == 0) {
                    class427.field5980.field4021 = 0;
                    arg3.method1706(class427.field5980.field4064, 0, -127, var18);
                    class427.field5980.field4021 = 0;
                    int var22 = -1;
                    String var24;
                    if (var20) {
                        var16 &= 0x7FFF;
                        class302 var23 = class320.method2048(class427.field5980, 1);
                        var22 = var23.field4302;
                        var24 = var23.field4306.method976(0, class427.field5980);
                    } else {
                        var24 = class113.method717(true, class61.method384(class427.field5980, 32767));
                    }
                    arg0.field2113 = var24.trim();
                    arg0.field2124 = var16 & 0xFF;
                    arg0.field2106 = var16 >> 8;
                    arg0.field2084 = 150;
                    int var25;
                    if (var17 == 1 || var17 == 2) {
                        var25 = var20 ? 17 : 1;
                    } else {
                        var25 = var20 ? 17 : 2;
                    }
                    if (var17 == 2) {
                        class190.method1178("<img=1>" + arg0.method2637(false, (byte) 13), var25, (String) null, -26824, "<img=1>" + arg0.method2648(true, -123), 0, var22, var24);
                    } else if (var17 == 1) {
                        class190.method1178("<img=0>" + arg0.method2637(false, (byte) 13), var25, (String) null, arg2 - 12516, "<img=0>" + arg0.method2648(true, -104), 0, var22, var24);
                    } else {
                        class190.method1178(arg0.method2637(false, (byte) 13), var25, (String) null, -26824, arg0.method2648(true, -126), 0, var22, var24);
                    }
                }
            }
            arg3.field4021 = var18 + var19;
        }
        if ((arg4 & 0x10) != 0) {
            int var26 = arg3.method1712(-1);
            int var27 = arg3.method1746(17037);
            arg0.method913(class353.field5090, var26, var27, 0);
            arg0.field2149 = class353.field5090 + 300;
            arg0.field2138 = arg3.method1735(62);
        }
        if ((arg4 & 0x1000) != 0) {
            int var28 = arg3.method1729(65280);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var29 = arg3.method1688(20402);
            boolean var30 = true;
            if (var28 != -1 && arg0.field2147 != -1) {
                if (arg0.field2147 == var28) {
                    class327 var31 = class324.field4674.method1279(var28, -2);
                    if (var31.field4728 && var31.field4714 != -1) {
                        class153 var32 = class64.field836.method2081(var31.field4714, 0);
                        int var33 = var32.field2260;
                        if (var33 == 0) {
                            var30 = false;
                        } else if (var33 == 1) {
                            var30 = true;
                        } else if (var33 == 2) {
                            var30 = false;
                            arg0.field2081 = 0;
                        }
                    }
                } else {
                    class327 var34 = class324.field4674.method1279(var28, -2);
                    class327 var35 = class324.field4674.method1279(arg0.field2147, -2);
                    if (var34.field4714 != -1 && var35.field4714 != -1) {
                        class153 var36 = class64.field836.method2081(var34.field4714, 0);
                        class153 var37 = class64.field836.method2081(var35.field4714, 0);
                        if (var36.field2289 < var37.field2289) {
                            var30 = false;
                        }
                    }
                }
            }
            if (var30) {
                arg0.field2147 = var28;
                int var38 = class353.field5090;
                arg0.field2101 = var29 >> 16;
                arg0.field2139 = 0;
                arg0.field2115 = 1;
                arg0.field2096 = (var29 & 0xFFFF) + var38;
                arg0.field2129 = 0;
                if (arg0.field2096 > var38) {
                    arg0.field2129 = -1;
                }
                if (arg0.field2147 != -1 && arg0.field2096 == var38) {
                    int var39 = class324.field4674.method1279(arg0.field2147, -2).field4714;
                    if (var39 != -1) {
                        class153 var40 = class64.field836.method2081(var39, arg2 + 14308);
                        if (var40 != null && var40.field2254 != null) {
                            class237.method1508(arg0.field4319, (byte) -77, arg0.field4331, 0, var40, arg0.field4317, class492.field6935 == arg0);
                        }
                    }
                }
            }
        }
        if ((arg4 & 0x400) != 0) {
            var5 = arg3.method1696((byte) -98);
        }
        if ((arg4 & 0x20) != 0) {
            arg0.field6252 = arg3.method1709(255);
            if (arg0.field2168 == 0) {
                arg0.method919((byte) -111, arg0.field6252);
                arg0.field6252 = -1;
            }
        }
        if ((arg4 & 0x100) != 0) {
            arg0.field2113 = arg3.method1750(arg2 + 14364);
            if (arg0.field2113.charAt(0) == '~') {
                arg0.field2113 = arg0.field2113.substring(1);
                class42.method284(arg0.method2648(true, -108), (byte) 97, arg0.field2113, arg0.method2637(false, (byte) 13), 0, 2);
            } else if (class492.field6935 == arg0) {
                class42.method284(arg0.method2648(true, -116), (byte) 97, arg0.field2113, arg0.method2637(false, (byte) 13), 0, 2);
            }
            arg0.field2084 = 150;
            arg0.field2124 = 0;
            arg0.field2106 = 0;
        }
        if ((arg4 & 0x1) != 0) {
            int var41 = arg3.method1749((byte) -75);
            if (var41 == 65535) {
                var41 = -1;
            }
            arg0.field2125 = var41;
        }
        if ((arg4 & 0x80) != 0) {
            int var42 = arg3.method1709(255);
            if (var42 == 65535) {
                var42 = -1;
            }
            int var43 = arg3.method1697((byte) 12);
            class92.method527(arg0, var43, (byte) -84, var42);
        }
        if ((arg4 & 0x4000) != 0) {
            int var44 = class353.field5090;
            int var45 = arg3.method1712(-1);
            int var46 = arg3.method1735(92);
            arg0.method913(var44, var45, var46, arg2 ^ 0xFFFFC81C);
        }
        if (!arg0.field6272) {
            return;
        }
        if (var5 == 127) {
            arg0.method2640(arg0.field6265, (byte) 60, arg0.field6276);
            return;
        }
        byte var47;
        if (var5 == -1) {
            var47 = class8.field80[arg1];
        } else {
            var47 = var5;
        }
        arg0.method2642(arg0.field6276, arg0.field6265, var47, 12);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
    public final void method328(int arg0, int arg1) {
        field699++;
        class232 var3 = this.field697;
        synchronized (this.field697) {
            this.field697.method1486(438127120, arg0);
        }
        if (arg1 != 0) {
            this.method332(108);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)V")
    public static void method329(boolean arg0) {
        field705 = null;
        field698 = null;
        if (arg0) {
            field698 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V")
    public static final void method330(int arg0, byte arg1) {
        class398.method2385((byte) 78);
        field702++;
        class452.method2643(17161);
        class45.method298(true, arg0, (byte) -109);
        class149.method942(class141.field1878, 0, class407.field5716, class347.field5025);
        class314.method1944(class407.field5716, (byte) 127, class141.field1878);
        class485.method2832(class243.field3627, 92);
        class276.method1751((byte) -111);
        class453.method2661((byte) 127);
        if (class363.field5227 == 10) {
            class116.method728(false, 6656);
        } else if (class363.field5227 == 30) {
            class211.method1368((byte) -29, 25);
        } else if (class363.field5227 == 5) {
            class66.method403((byte) -38, class407.field5716, class141.field1878);
        }
        int var2 = -89 / ((36 - arg1) / 60);
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Lhc;")
    public final class84 method331(int arg0, int arg1) {
        field707++;
        class232 var3 = this.field697;
        class84 var4;
        synchronized (this.field697) {
            var4 = (class84) this.field697.method1479(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field706.method1257(arg1, 4, 24558);
        class84 var6 = new class84();
        var6.field1022 = this;
        var6.field1029 = arg1;
        if (var5 != null) {
            var6.method476(arg0 ^ 0x1E08, new class276(var5));
        }
        var6.method477(true);
        class232 var7 = this.field697;
        synchronized (this.field697) {
            if (arg0 != 18990) {
                this.field708 = -113;
            }
            this.field697.method1473(var6, (long) arg1, arg0 ^ 0xFFFFB5E6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public final void method332(int arg0) {
        class232 var2 = this.field697;
        synchronized (this.field697) {
            this.field697.method1478((byte) -110);
        }
        int var3 = 75 % ((arg0 + 71) / 47);
        field696++;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class51(class353 arg0, int arg1, class201 arg2) {
        this.field706 = arg2;
        this.field704 = this.field706.method1235(0, 4);
    }
}
