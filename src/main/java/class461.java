import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class461 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lhu;")
    private class76 field6241 = new class76(128);

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lhu;")
    public class76 field6248 = new class76(64);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lr;")
    private class110 field6236;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Lr;")
    public class110 field6244;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lmc;")
    public static class78 field6238 = new class78(57, 8);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field6235;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field6239;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field6249;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "[I")
    public static int[] field6247;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[I")
    public static int[] field6250;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (arg7 != -4) {
            method2712(-66, -104, 21, -61);
        }
        if (arg4 >= class425.field5751 && class136.field1985 >= arg5 && class221.field2942 <= arg2 && class205.field2784 >= arg1) {
            class32.method206(arg1, arg4, arg0, arg5, arg6, 124, arg2, arg3);
        } else {
            class79.method521(arg5, arg3, arg2, arg0, arg7 ^ 0x3AFC, arg4, arg1, arg6);
        }
        field6243++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method2704(int arg0) {
        if (arg0 != -271679574) {
            field6247 = null;
        }
        field6240++;
        class76 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method502(0);
        }
        class76 var3 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method502(0);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public static void method2705(int arg0) {
        if (arg0 != -25279) {
            method2706(false, -57);
        }
        field6247 = null;
        field6250 = null;
        field6238 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
    public static final void method2706(boolean arg0, int arg1) {
        class323.field4311 = arg0;
        field6245++;
        if (class323.field4311) {
            int var2 = class314.field4171.method215((byte) 96);
            int var3 = class314.field4171.method189(true);
            int var4 = class314.field4171.method190(arg1 ^ 0x28);
            boolean var5 = class314.field4171.method190(arg1 + 40) == 1;
            class226.method1271(-995568477, var4);
            class314.field4171.method1665(-2);
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var21 = 0; var21 < (class295.field3947 >> 3); var21++) {
                    for (int var22 = 0; var22 < (class39.field567 >> 3); var22++) {
                        int var23 = class314.field4171.method1664((byte) -13, 1);
                        if (var23 == 1) {
                            class137.field1993[var6][var21][var22] = class314.field4171.method1664((byte) -13, 26);
                        } else {
                            class137.field1993[var6][var21][var22] = -1;
                        }
                    }
                }
            }
            class314.field4171.method1661((byte) -103);
            int var7 = (class136.field1983 - class314.field4171.field456) / 16;
            class270.field3605 = new int[var7][4];
            for (int var8 = 0; var8 < var7; var8++) {
                for (int var20 = 0; var20 < 4; var20++) {
                    class270.field3605[var8][var20] = class314.field4171.method222(1024);
                }
            }
            class80.field1078 = new int[var7];
            class36.field545 = new int[var7];
            class208.field2813 = new byte[var7][];
            class316.field4174 = new byte[var7][];
            class243.field3238 = new byte[var7][];
            class98.field1430 = null;
            class86.field1164 = new int[var7];
            class91.field1343 = null;
            class132.field1934 = new int[var7];
            class306.field4050 = new int[var7];
            class136.field1976 = new byte[var7][];
            int var9 = 0;
            for (int var10 = 0; var10 < 4; var10++) {
                for (int var11 = 0; var11 < class295.field3947 >> 3; var11++) {
                    for (int var12 = 0; var12 < (class39.field567 >> 3); var12++) {
                        int var13 = class137.field1993[var10][var11][var12];
                        if (var13 != -1) {
                            int var14 = var13 >> 14 & 0x3FF;
                            int var15 = (var13 & 0x3FF9) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < var9; var17++) {
                                if (class306.field4050[var17] == var16) {
                                    var16 = -1;
                                    break;
                                }
                            }
                            if (var16 != -1) {
                                class306.field4050[var9] = var16;
                                int var18 = (var16 & 0xFF44) >> 8;
                                int var19 = var16 & 0xFF;
                                class86.field1164[var9] = class87.field1219.method688((byte) 87, "m" + var18 + "_" + var19);
                                class80.field1078[var9] = class87.field1219.method688((byte) 87, "l" + var18 + "_" + var19);
                                class132.field1934[var9] = class87.field1219.method688((byte) 87, "um" + var18 + "_" + var19);
                                class36.field545[var9] = class87.field1219.method688((byte) 87, "ul" + var18 + "_" + var19);
                                var9++;
                            }
                        }
                    }
                }
            }
            class295.method1654(false, var2, var5, var3, true);
        } else {
            int var24 = class314.field4171.method189(true);
            int var25 = class314.field4171.method215((byte) 94);
            int var26 = class314.field4171.method201((byte) -112);
            boolean var27 = class314.field4171.method190(127) == 1;
            class226.method1271(arg1 ^ 0xC4A8D4F0, var26);
            int var28 = (class136.field1983 - class314.field4171.field456) / 16;
            class270.field3605 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var33 = 0; var33 < 4; var33++) {
                    class270.field3605[var29][var33] = class314.field4171.method222(1024);
                }
            }
            class243.field3238 = new byte[var28][];
            class132.field1934 = new int[var28];
            class136.field1976 = new byte[var28][];
            class208.field2813 = new byte[var28][];
            class80.field1078 = new int[var28];
            class86.field1164 = new int[var28];
            class306.field4050 = new int[var28];
            class36.field545 = new int[var28];
            class316.field4174 = new byte[var28][];
            class91.field1343 = null;
            class98.field1430 = null;
            int var30 = 0;
            for (int var31 = (var24 - (class295.field3947 >> 4)) / 8; var31 <= (var24 + (class295.field3947 >> 4)) / 8; var31++) {
                for (int var32 = (var25 - (class39.field567 >> 4)) / 8; var32 <= (var25 + (class39.field567 >> 4)) / 8; var32++) {
                    class306.field4050[var30] = (var31 << 8) + var32;
                    class86.field1164[var30] = class87.field1219.method688((byte) 87, "m" + var31 + "_" + var32);
                    class80.field1078[var30] = class87.field1219.method688((byte) 87, "l" + var31 + "_" + var32);
                    class132.field1934[var30] = class87.field1219.method688((byte) 87, "um" + var31 + "_" + var32);
                    class36.field545[var30] = class87.field1219.method688((byte) 87, "ul" + var31 + "_" + var32);
                    var30++;
                }
            }
            class295.method1654(false, var24, var27, var25, true);
        }
        if (arg1 != 83) {
            method2709((class464[]) null, 27, 88);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
    public final void method2707(int arg0, int arg1) {
        class76 var3 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method496(arg0, 100);
        }
        field6239++;
        class76 var4 = this.field6248;
        synchronized (this.field6248) {
            int var5 = 111 / ((-arg1 - 49) / 63);
            this.field6248.method496(arg0, -74);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public final void method2708(int arg0, int arg1, int arg2) {
        this.field6241 = new class76(arg1);
        field6242++;
        this.field6248 = new class76(arg0);
        if (arg2 != -2) {
            field6238 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([Lnk;II)V")
    public static final void method2709(class464[] arg0, int arg1, int arg2) {
        field6235++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class464 var4 = arg0[var3];
            if (var4 != null && var4.field6362 == arg1 && !client.method1045(var4)) {
                if (var4.field6358 == 0) {
                    method2709(arg0, var4.field6440, -61);
                    if (var4.field6360 != null) {
                        method2709(var4.field6360, var4.field6440, -127);
                    }
                    class132 var5 = (class132) class214.field2883.method1528((long) var4.field6440, 122);
                    if (var5 != null) {
                        class208.method1183(5173, var5.field1939);
                    }
                }
                if (var4.field6358 == 6 && var4.field6401 != -1) {
                    class181 var6 = class395.field5477.method266(16107, var4.field6401);
                    if (var6 != null) {
                        var4.field6370 += class448.field6098;
                        while (var6.field2466[var4.field6307] < var4.field6370) {
                            var4.field6370 -= var6.field2466[var4.field6307];
                            var4.field6307++;
                            if (var6.field2468.length <= var4.field6307) {
                                var4.field6307 -= var6.field2481;
                                if (var4.field6307 < 0 || var4.field6307 >= var6.field2468.length) {
                                    var4.field6307 = 0;
                                }
                            }
                            var4.field6438 = var4.field6307 + 1;
                            if (var6.field2468.length <= var4.field6438) {
                                var4.field6438 -= var6.field2481;
                                if (var4.field6438 < 0 || var4.field6438 >= var6.field2468.length) {
                                    var4.field6438 = -1;
                                }
                            }
                            class490.method2854(var4, (byte) 43);
                        }
                    }
                }
            }
        }
        if (arg2 >= -25) {
            method2709((class464[]) null, -57, -76);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lnp;")
    public final class313 method2710(int arg0, int arg1) {
        field6249++;
        class76 var3 = this.field6241;
        class313 var4;
        synchronized (this.field6241) {
            var4 = (class313) this.field6241.method493((byte) 19, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6236.method702((byte) 38, arg1, 36);
        class313 var6 = new class313();
        if (arg0 != 26) {
            return null;
        }
        var6.field4146 = arg1;
        var6.field4120 = this;
        if (var5 != null) {
            var6.method1716((byte) -122, new class32(var5));
        }
        var6.method1721(arg0 ^ 0x59);
        class76 var7 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method505((long) arg1, var6, 109);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V")
    public final void method2711(int arg0) {
        class76 var2 = this.field6241;
        synchronized (this.field6241) {
            this.field6241.method495(-108);
        }
        field6246++;
        class76 var3 = this.field6248;
        synchronized (this.field6248) {
            this.field6248.method495(-126);
            if (arg0 != 2) {
                method2706(true, -36);
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I")
    public static final int method2712(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg3 >>= 0x4;
        } else if (arg2 > 217) {
            arg3 >>= 0x3;
        } else if (arg2 > 192) {
            arg3 >>= 0x2;
        } else if (arg2 > 179) {
            arg3 >>= 0x1;
        }
        int var4 = -26 / ((35 - arg0) / 59);
        field6237++;
        return ((arg1 >> 2 & 0x3F) << 10) + (arg3 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ldn;ILr;Lr;)V")
    public class461(class329 arg0, int arg1, class110 arg2, class110 arg3) {
        this.field6236 = arg2;
        this.field6244 = arg3;
        this.field6236.method694(36, (byte) 119);
    }
}
