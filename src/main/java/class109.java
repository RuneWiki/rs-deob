import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class109 extends class170 {

    @OriginalMember(owner = "client!qb", name = "qc", descriptor = "I")
    public int field1495 = 0;

    @OriginalMember(owner = "client!qb", name = "yc", descriptor = "I")
    public int field1503 = 255;

    @OriginalMember(owner = "client!qb", name = "Dc", descriptor = "I")
    public int field1508 = -1;

    @OriginalMember(owner = "client!qb", name = "zc", descriptor = "I")
    public int field1504 = 0;

    @OriginalMember(owner = "client!qb", name = "Hc", descriptor = "I")
    public int field1512 = -1;

    @OriginalMember(owner = "client!qb", name = "Cc", descriptor = "Z")
    public boolean field1507 = false;

    @OriginalMember(owner = "client!qb", name = "Ec", descriptor = "I")
    public int field1509 = -1;

    @OriginalMember(owner = "client!qb", name = "xc", descriptor = "I")
    public int field1502 = 0;

    @OriginalMember(owner = "client!qb", name = "ic", descriptor = "I")
    public int field1487 = -1;

    @OriginalMember(owner = "client!qb", name = "Nc", descriptor = "I")
    public int field1518 = -1;

    @OriginalMember(owner = "client!qb", name = "Rc", descriptor = "I")
    public int field1522 = 0;

    @OriginalMember(owner = "client!qb", name = "sc", descriptor = "B")
    private byte field1497 = 0;

    @OriginalMember(owner = "client!qb", name = "Kc", descriptor = "I")
    public int field1515 = -1;

    @OriginalMember(owner = "client!qb", name = "Tc", descriptor = "I")
    public int field1524 = -1;

    @OriginalMember(owner = "client!qb", name = "Vc", descriptor = "I")
    public int field1526 = 0;

    @OriginalMember(owner = "client!qb", name = "vc", descriptor = "I")
    public static int field1500 = -1;

    @OriginalMember(owner = "client!qb", name = "pc", descriptor = "I")
    public static int field1494 = 0;

    @OriginalMember(owner = "client!qb", name = "Jc", descriptor = "[Lhj;")
    public static class33[] field1514 = new class33[50];

    @OriginalMember(owner = "client!qb", name = "Pc", descriptor = "[I")
    public static int[] field1520 = new int[4096];

    @OriginalMember(owner = "client!qb", name = "jc", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!qb", name = "kc", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!qb", name = "lc", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!qb", name = "nc", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!qb", name = "tc", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!qb", name = "uc", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!qb", name = "wc", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!qb", name = "Ac", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!qb", name = "Bc", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!qb", name = "Gc", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!qb", name = "Ic", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!qb", name = "Lc", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!qb", name = "Oc", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!qb", name = "Qc", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!qb", name = "Sc", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qb", name = "Uc", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qb", name = "Mc", descriptor = "Llc;")
    public static class175 field1517;

    @OriginalMember(owner = "client!qb", name = "Fc", descriptor = "Lra;")
    public class336 field1510;

    @OriginalMember(owner = "client!qb", name = "rc", descriptor = "Ljava/lang/String;")
    public String field1496;

    @OriginalMember(owner = "client!qb", name = "oc", descriptor = "[Ljd;")
    public static class149[] field1493;

    @OriginalMember(owner = "client!qb", name = "mc", descriptor = "[[[I")
    public static int[][][] field1491;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lp;Ljava/lang/String;I)I", line = 7)
    public static final int method741(class107 arg0, String arg1, int arg2) {
        field1521++;
        int var3 = arg0.field1400;
        byte[] var4 = class233.method1642(arg1, -55);
        arg0.method634(var4.length, -73);
        arg0.field1400 += class298.field4637.method791(arg0.field1388, 0, (byte) -102, var4.length, arg0.field1400, var4);
        int var5 = 113 % ((arg2 - 43) / 46);
        return arg0.field1400 - var3;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)Ljava/lang/String;", line = 27)
    public final String method742(int arg0) {
        field1492++;
        String var2 = this.field1496;
        if (class69.field901 != null) {
            var2 = class69.field901[this.field1497] + var2;
        }
        if (class73.field939 != null) {
            var2 = var2 + class73.field939[this.field1497];
        }
        return arg0 == -1 ? var2 : (String) null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 47)
    public static final String method743(long arg0, int arg1) {
        field1511++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg1 != 1) {
                field1500 = 42;
            }
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class15.field210[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)Z", line = 98)
    public final boolean method744(int arg0) {
        if (arg0 != 8) {
            method750(-82, 38);
        }
        field1505++;
        return this.field1510 != null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()I", line = 116)
    public final int method11() {
        field1516++;
        return this.field2398;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIILid;IIILuc;IIIIII)V", line = 126)
    private final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, class274 arg5, int arg6, int arg7, int arg8, class201 arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field1490++;
        int var17 = arg0 * arg0 + arg10 * arg10;
        if (var17 < 16 || var17 > arg2) {
            return;
        }
        int var18 = arg11 & (int) (Math.atan2((double) arg0, (double) arg10) * 325.949D);
        class201 var19 = class81.method480(arg11 ^ 0x4FF, this.field2357, this.field2386, this.field2392, var18, arg9, arg14);
        if (var19 == null) {
            return;
        }
        if (!class250.field3787) {
            var19.method8(0, arg7, arg1, arg13, arg6, arg8, arg4, arg15, -1L, arg3, arg5);
            return;
        }
        float var20 = class250.method1820();
        float var21 = class250.method1802();
        class250.method1827();
        class250.method1818(var20, var21 - 150.0F);
        var19.method8(0, arg7, arg1, arg13, arg6, arg8, arg4, arg15, -1L, arg3, arg5);
        class250.method1791();
        class250.method1818(var20, var21);
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(B)V", line = 171)
    public static void method746(byte arg0) {
        field1514 = null;
        if (arg0 == -46) {
            field1493 = null;
            field1517 = null;
            field1491 = (int[][][]) null;
            field1520 = null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lp;B)V", line = 186)
    public final void method747(class107 arg0, byte arg1) {
        field1519++;
        arg0.field1400 = 0;
        int var3 = arg0.method661(-1);
        int var4 = super.method748(false);
        boolean var5 = (var3 & 0x4) != 0;
        this.method1103(((var3 & 0x3B) >> 3) + 1, (byte) 94);
        int var6 = var3 & 0x1;
        int var7 = -1;
        int[] var8 = new int[12];
        this.field1497 = (byte) ((var3 & 0xEA) >> 6);
        this.field2392 += (this.method748(false) - var4) * 64;
        this.field2357 += (this.method748(false) - var4) * 64;
        this.field1518 = arg0.method679(arg1 + 73);
        this.field1512 = arg0.method679(arg1 + 73);
        this.field1504 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method661(arg1 ^ 0x4B);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method661(-1);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method624(14612);
                    this.field1504 = arg0.method661(arg1 ^ 0x4B);
                    break;
                }
                if (var12 >= 32768) {
                    int var13 = class318.field4878[var12 - 32768];
                    var8[var9] = class48.method283(1073741824, var13);
                    int var14 = class60.method353(var13, (byte) -86).field1184;
                    if (var14 != 0) {
                        this.field1504 = var14;
                    }
                } else {
                    var8[var9] = class48.method283(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        if (arg1 != -76) {
            this.field1526 = -66;
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method661(-1);
            if (var17 < 0 || class299.field4668[var16].length <= var17) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field2375 = arg0.method624(14612);
        long var18 = arg0.method651(-13052);
        this.field1496 = method743(var18, arg1 + 77);
        this.field1495 = arg0.method661(arg1 + 75);
        if (var5) {
            this.field1526 = arg0.method624(arg1 + 14688);
            this.field1524 = -1;
            this.field1502 = this.field1495;
        } else {
            this.field1526 = 0;
            this.field1502 = arg0.method661(-1);
            this.field1524 = arg0.method661(arg1 ^ 0x4B);
            if (this.field1524 == 255) {
                this.field1524 = -1;
            }
        }
        int var20 = this.field1522;
        this.field1522 = arg0.method661(-1);
        if (this.field1522 == 0) {
            class25.method159(this, 0);
        } else {
            int var21 = this.field1508;
            int var22 = this.field1509;
            int var23 = this.field1515;
            int var24 = this.field1503;
            int var25 = this.field1487;
            this.field1508 = arg0.method624(14612);
            this.field1487 = arg0.method624(14612);
            this.field1515 = arg0.method624(arg1 + 14688);
            this.field1509 = arg0.method624(14612);
            this.field1503 = arg0.method661(-1);
            if (this.field1522 != var20 || this.field1508 != var21 || this.field1487 != var25 || this.field1515 != var23 || this.field1509 != var22 || this.field1503 != var24) {
                class198.method1360(arg1 ^ 0x4B, this);
            }
        }
        if (this.field1510 == null) {
            this.field1510 = new class336();
        }
        int var26 = this.field1510.field5198;
        this.field1510.method2309((byte) -112, this.field2375, var15, var6 == 1, var8, var7);
        if (var7 != var26) {
            this.field2392 = this.field2359[0] * 128 + this.method748(false) * 64;
            this.field2357 = this.field2403[0] * 128 + (this.method748(false) * 64);
        }
        if (this.field2442 != null) {
            this.field2442.method1977();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)I", line = 341)
    public final int method748(boolean arg0) {
        field1501++;
        if (this.field1510 == null || this.field1510.field5198 == -1) {
            return arg0 ? -25 : super.method748(false);
        } else {
            return class120.method815(-126, this.field1510.field5198).field4420;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 379)
    public final void method12(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1499++;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZ)V", line = 394)
    public final void method749(int arg0, int arg1, int arg2, boolean arg3) {
        super.method1107(arg1, arg2, arg0 - 1, this.method748(false), arg3);
        field1489++;
        if (arg0 != 0) {
            this.method11();
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJILid;)V", line = 410)
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class274 arg10) {
        field1488++;
        if (this.field1510 == null) {
            return;
        }
        class247 var13 = this.field2435 != -1 && this.field2365 == 0 ? class185.method1289(this.field2435, (byte) 124) : null;
        class247 var14 = this.field2376 == -1 || this.field1507 || this.field2376 == this.method1102((byte) -119).field2737 && var13 != null ? null : class185.method1289(this.field2376, (byte) 122);
        class201 var15 = this.field1510.method2316(var14, this.field2364, 32431, this.field2366, this.field2425, this.field2413, this.field2363, var13, true, this.field2405, this.field2370);
        int var16 = class36.method211(25936);
        if (class250.field3787 && class340.field5274 < 96 && var16 > 50) {
            class31.method191(-1);
        }
        if (class15.field216 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class291.field4568) {
                class330.field5045[class291.field4568] = new byte[102400];
                class291.field4568++;
            }
            while (class291.field4568 > var17) {
                class291.field4568--;
                class330.field5045[class291.field4568] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field2398 = var15.method11();
        if (class272.field4269 && (this.field1510.field5198 == -1 || class120.method815(24, this.field1510.field5198).field4400)) {
            class201 var18 = class37.method218(240, var14 == null ? var13 : var14, 1, this.field2441, arg0, 0, this.field2386, this.field2357, this.field2392, 160, (byte) -61, var15, 0, var14 == null ? this.field2425 : this.field2363);
            if (class250.field3787) {
                float var19 = class250.method1820();
                float var20 = class250.method1802();
                class250.method1827();
                class250.method1818(var19, var20 - 150.0F);
                var18.method8(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class274) null);
                class250.method1791();
                class250.method1818(var19, var20);
            } else {
                var18.method8(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class274) null);
            }
        }
        if (class118.field1664 == this) {
            for (int var21 = class167.field2328.length - 1; var21 >= 0; var21--) {
                class219 var22 = class167.field2328[var21];
                if (var22 != null && var22.field3084 != -1) {
                    if (var22.field3079 == 1 && var22.field3077 >= 0 && class223.field3159.length > var22.field3077) {
                        class184 var23 = class223.field3159[var22.field3077];
                        if (var23 != null) {
                            int var24 = var23.field2392 / 32 - class118.field1664.field2392 / 32;
                            int var25 = var23.field2357 / 32 - (class118.field1664.field2357 / 32);
                            this.method745(var24, arg2, 360000, arg9, arg6, (class274) null, arg4, arg1, arg5, var15, var25, 2047, arg0, arg3, var22.field3084, arg7);
                        }
                    }
                    if (var22.field3079 == 2) {
                        int var26 = (var22.field3081 - class142.field1992) * 4 + 2 - (class118.field1664.field2392 / 32);
                        int var27 = var22.field3074 * 4;
                        int var28 = (var22.field3083 - class118.field1668) * 4 + 2 - (class118.field1664.field2357 / 32);
                        int var29 = var27 * var27;
                        this.method745(var26, arg2, var29, arg9, arg6, (class274) null, arg4, arg1, arg5, var15, var28, 2047, arg0, arg3, var22.field3084, arg7);
                    }
                    if (var22.field3079 == 10 && var22.field3077 >= 0 && var22.field3077 < class328.field5009.length) {
                        class109 var30 = class328.field5009[var22.field3077];
                        if (var30 != null) {
                            int var31 = var30.field2392 / 32 - (class118.field1664.field2392 / 32);
                            int var32 = var30.field2357 / 32 - (class118.field1664.field2357 / 32);
                            this.method745(var31, arg2, 360000, arg9, arg6, (class274) null, arg4, arg1, arg5, var15, var32, 2047, arg0, arg3, var22.field3084, arg7);
                        }
                    }
                }
            }
        }
        class201 var33 = null;
        this.method1113(var15, 99);
        this.method1109(true, arg0, var15);
        if (!this.field1507 && this.field2372 != -1 && this.field2449 != -1) {
            class159 var34 = class120.method818((byte) 96, this.field2372);
            var33 = var34.method1054(this.field2412, this.field2449, 3899, this.field2408);
            if (var33 != null) {
                var33.method688(0, -this.field2448, 0);
                if (var34.field2199) {
                    if (class162.field2228 != 0) {
                        var33.method700(class162.field2228);
                    }
                    if (class330.field5046 != 0) {
                        var33.method734(class330.field5046);
                    }
                    if (class291.field4570 != 0) {
                        var33.method688(0, class291.field4570, 0);
                    }
                }
            }
        }
        class201 var35 = null;
        if (!this.field1507 && this.field2430 != null) {
            if (this.field2434 <= class38.field463) {
                this.field2430 = null;
            }
            if (class38.field463 >= this.field2381 && class38.field463 < this.field2434) {
                if (this.field2430 instanceof class110) {
                    var35 = (class201) ((class110) this.field2430).method754((byte) -118);
                } else {
                    var35 = (class201) this.field2430;
                }
                var35.method688(this.field2439 - this.field2392, -this.field2386 + this.field2436, this.field2355 - this.field2357);
                if (this.field2387 == 512) {
                    var35.method689();
                } else if (this.field2387 == 1024) {
                    var35.method704();
                } else if (this.field2387 == 1536) {
                    var35.method738();
                }
            }
        }
        if (class250.field3787) {
            var15.field2845 = true;
            var15.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
            if (var33 != null) {
                var33.field2845 = true;
                var33.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
            }
        } else {
            if (var33 != null) {
                var15 = ((class333) var15).method2303(var33);
            }
            if (var35 != null) {
                var15 = ((class333) var15).method2303(var35);
            }
            var15.field2845 = true;
            var15.method8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2442);
        }
        if (var35 == null) {
            return;
        }
        if (this.field2387 == 512) {
            var35.method738();
        } else if (this.field2387 == 1024) {
            var35.method704();
        } else if (this.field2387 == 1536) {
            var35.method689();
        }
        var35.method688(this.field2392 - this.field2439, -this.field2436 + this.field2386, this.field2357 - this.field2355);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I", line = 673)
    public static final int method750(int arg0, int arg1) {
        if (arg0 != -32768) {
            method743(9L, 12);
        }
        field1513++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I", line = 690)
    public final int method751(byte arg0) {
        if (arg0 <= 23) {
            return 89;
        } else {
            field1498++;
            return this.field2375;
        }
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 719)
    protected final void finalize() {
        field1525++;
    }
}
