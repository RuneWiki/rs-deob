import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class200 {

    @OriginalMember(owner = "client!vc", name = "m", descriptor = "[J")
    public static long[] field3405 = new long[200];

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!vc", name = "s", descriptor = "I")
    public int field3411;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "J")
    private long field3394;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "J")
    private long field3396;

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Lda;")
    public static class143 field3402;

    @OriginalMember(owner = "client!vc", name = "r", descriptor = "Lwf;")
    public static class215 field3410;

    @OriginalMember(owner = "client!vc", name = "l", descriptor = "Z")
    public boolean field3404;

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "[I")
    private int[] field3399;

    @OriginalMember(owner = "client!vc", name = "k", descriptor = "[I")
    private int[] field3403;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZ[I[II)V", line = 8)
    public final void method1489(int arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        field3393++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class239.field3970; var7++) {
                    class123 var8 = class223.method1612(var7, 3);
                    if (var8 != null && !var8.field2229 && ((arg1 ? 7 : 0) + var6) == var8.field2218) {
                        arg2[class57.field887[var6]] = class289.method2005(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3403 = arg2;
        if (arg0 <= -10) {
            this.field3404 = arg1;
            this.field3399 = arg3;
            this.field3411 = arg4;
            this.method1494((byte) -119);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZZ)V", line = 54)
    public final void method1490(boolean arg0, boolean arg1) {
        if (!arg1) {
            field3410 = (class215) null;
        }
        field3397++;
        this.field3404 = arg0;
        this.method1494((byte) -87);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBLeg;I)Lhi;", line = 70)
    public final class176 method1491(int arg0, int arg1, byte arg2, class142 arg3, int arg4) {
        field3400++;
        long var6 = (long) arg1 | (long) (arg4 << 16) | (long) arg1 << 32;
        if (arg2 >= -88) {
            this.field3403 = (int[]) null;
        }
        class176 var8 = (class176) class23.field386.method1536(var6, -115);
        if (var8 == null) {
            int var9 = 0;
            class195[] var10 = new class195[2];
            if (!class223.method1612(arg1, 3).method998(2048) || !class223.method1612(arg4, 3).method998(2048)) {
                return null;
            }
            class195 var11 = class223.method1612(arg1, 3).method992(-97);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class195 var12 = class223.method1612(arg4, 3).method992(59);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class195 var13 = new class195(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class153.field2723[var14].length > this.field3399[var14]) {
                    var13.method1454(class199.field3377[var14], class153.field2723[var14][this.field3399[var14]]);
                }
                if (this.field3399[var14] < class84.field1518[var14].length) {
                    var13.method1454(class211.field3551[var14], class84.field1518[var14][this.field3399[var14]]);
                }
            }
            var8 = var13.method1465(64, 768, -50, -10, -50);
            class23.field386.method1532(var6, -58, var8);
        }
        if (arg3 != null) {
            var8 = arg3.method1115(arg0, var8, -1687129200);
        }
        return var8;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)V", line = 142)
    public final void method1492(int arg0, int arg1, int arg2) {
        int var4 = class57.field887[arg0];
        field3407++;
        if (this.field3403[var4] != arg2 && class223.method1612(arg1, 3) != null) {
            this.field3403[var4] = class289.method2005(arg1, Integer.MIN_VALUE);
            this.method1494((byte) -45);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V", line = 161)
    public static void method1493(byte arg0) {
        field3402 = null;
        field3410 = null;
        if (arg0 > -1) {
            method1500(-115, 91);
        }
        field3405 = null;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V", line = 177)
    private final void method1494(byte arg0) {
        field3406++;
        long var2 = this.field3396;
        this.field3396 = -1L;
        long[] var4 = class266.field4432;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3396 = var4[(int) ((this.field3396 ^ (long) (this.field3403[var5] >> 24)) & 0xFFL)] ^ this.field3396 >>> 8;
            this.field3396 = this.field3396 >>> 8 ^ var4[(int) (((long) (this.field3403[var5] >> 16) ^ this.field3396) & 0xFFL)];
            this.field3396 = var4[(int) ((this.field3396 ^ (long) (this.field3403[var5] >> 8)) & 0xFFL)] ^ this.field3396 >>> 8;
            this.field3396 = var4[(int) (((long) this.field3403[var5] ^ this.field3396) & 0xFFL)] ^ this.field3396 >>> 8;
        }
        if (arg0 > -1) {
            this.method1491(-14, -53, (byte) -69, (class142) null, 88);
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3396 = this.field3396 >>> 8 ^ var4[(int) (((long) this.field3399[var6] ^ this.field3396) & 0xFFL)];
        }
        this.field3396 = var4[(int) (((long) (this.field3404 ? 1 : 0) ^ this.field3396) & 0xFFL)] ^ this.field3396 >>> 8;
        if (var2 != 0L && this.field3396 != var2) {
            class96.field1753.method1535(1, var2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IILeg;Leg;I)Lhi;", line = 220)
    public final class176 method1495(int arg0, int arg1, class142 arg2, class142 arg3, int arg4) {
        field3395++;
        if (this.field3411 != -1) {
            return class223.method1613(this.field3411, false).method647(0, arg2, arg1, arg4, arg3);
        }
        if (arg0 != 19940) {
            this.method1490(false, true);
        }
        long var6 = this.field3396;
        int[] var8 = this.field3403;
        if (arg3 != null && (arg3.field2541 >= 0 || arg3.field2545 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field3403[var9];
            }
            if (arg3.field2541 >= 0) {
                if (arg3.field2541 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class289.method2005(arg3.field2541, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field2545 >= 0) {
                if (arg3.field2545 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class289.method2005(1073741824, arg3.field2545);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class176 var10 = (class176) class96.field1753.method1536(var6, -109);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = var8[var12];
                if ((var13 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var13) != 0 && !class223.method1612(var13 & 0x3FFFFFFF, arg0 ^ 0x4DE7).method996(-6640)) {
                        var11 = true;
                    }
                } else if (!class304.method2075(var13 & 0x3FFFFFFF, 4).method925(8821, this.field3404)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3394 != -1L) {
                    var10 = (class176) class96.field1753.method1536(this.field3394, -117);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class195[] var14 = new class195[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var17 = var8[var16];
                    if ((var17 & 0x40000000) != 0) {
                        class195 var19 = class304.method2075(var17 & 0x3FFFFFFF, 4).method919(this.field3404, (byte) 118);
                        if (var19 != null) {
                            var14[var15++] = var19;
                        }
                    } else if ((Integer.MIN_VALUE & var17) != 0) {
                        class195 var18 = class223.method1612(var17 & 0x3FFFFFFF, 3).method997(0);
                        if (var18 != null) {
                            var14[var15++] = var18;
                        }
                    }
                }
                int var20 = var8[0];
                if ((var20 & 0x40000000) != 0) {
                    class116 var21 = class304.method2075(var20 & 0x3FFFFFFF, 4);
                    if (var21.field2086 != null) {
                        for (int var22 = 0; var22 < var21.field2086.length; var22++) {
                            if (var21.field2086[var22] != null && var14[var22 + 1] != null) {
                                int var23 = var21.field2086[var22][0];
                                int var24 = var21.field2086[var22][2];
                                int var25 = var21.field2086[var22][1];
                                int var26 = var21.field2086[var22][3];
                                int var27 = var21.field2086[var22][4];
                                int var28 = var21.field2086[var22][5];
                                var14[var22 + 1].method1460(var23, var25, var24);
                                var14[var22 + 1].method1441(var26, var27, var28);
                            }
                        }
                    }
                }
                class195 var29 = new class195(var14, var15);
                for (int var30 = 0; var30 < 5; var30++) {
                    if (this.field3399[var30] < class153.field2723[var30].length) {
                        var29.method1454(class199.field3377[var30], class153.field2723[var30][this.field3399[var30]]);
                    }
                    if (class84.field1518[var30].length > this.field3399[var30]) {
                        var29.method1454(class211.field3551[var30], class84.field1518[var30][this.field3399[var30]]);
                    }
                }
                var10 = var29.method1465(64, 850, -30, -50, -30);
                if (class117.field2159) {
                    ((class100) var10).method807(false, false, true, true, false, false, true);
                }
                class96.field1753.method1532(var6, arg0 ^ 0xFFFFB272, var10);
                this.field3394 = var6;
            }
        }
        if (arg3 == null && arg2 == null) {
            return var10;
        }
        class176 var31;
        if (arg3 != null && arg2 != null) {
            var31 = arg3.method1109(arg0 ^ 0xFFFFB213, arg2, var10, arg1, arg4);
        } else if (arg3 == null) {
            var31 = arg2.method1108(arg1, (byte) -93, var10);
        } else {
            var31 = arg3.method1108(arg4, (byte) -75, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(III)V", line = 447)
    public static final void method1496(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class53.field850; var3++) {
            for (int var4 = 0; var4 < class32.field524; var4++) {
                for (int var5 = 0; var5 < class158.field2787; var5++) {
                    class225 var6 = class288.field4856[var3][var4][var5];
                    if (var6 != null) {
                        class273 var7 = var6.field3753;
                        if (var7 != null && var7.field4527.method824()) {
                            class230.method1645(var7.field4527, var3, var4, var5, 1, 1);
                            if (var7.field4534 != null && var7.field4534.method824()) {
                                class230.method1645(var7.field4534, var3, var4, var5, 1, 1);
                                var7.field4527.method797(var7.field4534, 0, 0, 0, false);
                                var7.field4534 = var7.field4534.method831(arg0, arg1, arg2);
                            }
                            var7.field4527 = var7.field4527.method831(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field3756; var8++) {
                            class43 var9 = var6.field3765[var8];
                            if (var9 != null && var9.field712.method824()) {
                                class230.method1645(var9.field712, var3, var4, var5, var9.field707 + 1 - var9.field711, var9.field701 - var9.field699 + 1);
                                var9.field712 = var9.field712.method831(arg0, arg1, arg2);
                            }
                        }
                        class147 var10 = var6.field3763;
                        if (var10 != null && var10.field2659.method824()) {
                            class216.method1571(var10.field2659, var3, var4, var5);
                            var10.field2659 = var10.field2659.method831(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)I", line = 517)
    public final int method1497(int arg0) {
        field3409++;
        int var2 = 74 % ((arg0 + 22) / 34);
        return this.field3411 == -1 ? (this.field3403[8] << 10) + this.field3403[1] + (this.field3403[11] << 5) + (this.field3399[4] << 20) + (this.field3403[0] << 15) + (this.field3399[0] << 25) : class223.method1613(this.field3411, false).field1443 + 305419896;
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(III)V", line = 535)
    public final void method1498(int arg0, int arg1, int arg2) {
        if (arg1 != 1073741824) {
            this.method1489(-13, true, (int[]) null, (int[]) null, -114);
        }
        field3408++;
        this.field3399[arg0] = arg2;
        this.method1494((byte) -64);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Leg;IB)Lhi;", line = 549)
    public final class176 method1499(class142 arg0, int arg1, byte arg2) {
        field3401++;
        if (this.field3411 != -1) {
            return class223.method1613(this.field3411, false).method635(arg0, arg1, arg2 ^ 0x16);
        }
        class176 var4 = (class176) class23.field386.method1536(this.field3396, arg2 ^ 0x77);
        if (arg2 != -24) {
            return (class176) null;
        }
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var7 = this.field3403[var6];
                if ((var7 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var7) != 0 && !class223.method1612(var7 & 0x3FFFFFFF, 3).method998(2048)) {
                        var5 = true;
                    }
                } else if (!class304.method2075(var7 & 0x3FFFFFFF, 4).method921(arg2 - 101, this.field3404)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var8 = 0;
            class195[] var9 = new class195[12];
            for (int var10 = 0; var10 < 12; var10++) {
                int var11 = this.field3403[var10];
                if ((var11 & 0x40000000) != 0) {
                    class195 var13 = class304.method2075(var11 & 0x3FFFFFFF, 4).method927((byte) 98, this.field3404);
                    if (var13 != null) {
                        var9[var8++] = var13;
                    }
                } else if ((var11 & Integer.MIN_VALUE) != 0) {
                    class195 var12 = class223.method1612(var11 & 0x3FFFFFFF, 3).method992(56);
                    if (var12 != null) {
                        var9[var8++] = var12;
                    }
                }
            }
            class195 var14 = new class195(var9, var8);
            for (int var15 = 0; var15 < 5; var15++) {
                if (this.field3399[var15] < class153.field2723[var15].length) {
                    var14.method1454(class199.field3377[var15], class153.field2723[var15][this.field3399[var15]]);
                }
                if (class84.field1518[var15].length > this.field3399[var15]) {
                    var14.method1454(class211.field3551[var15], class84.field1518[var15][this.field3399[var15]]);
                }
            }
            var4 = var14.method1465(64, 768, -50, -10, -50);
            class23.field386.method1532(this.field3396, -49, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1115(arg1, var4, -1687129200);
        }
        return var4;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)V", line = 666)
    public static final void method1500(int arg0, int arg1) {
        class182.field3128[0] = (float) (class92.method695(16719795, arg1) >> 16) / 255.0F;
        class182.field3128[1] = (float) (class92.method695(arg1, 65484) >> 8) / 255.0F;
        if (arg0 != -23479) {
            method1493((byte) -35);
        }
        class182.field3128[2] = (float) class92.method695(arg1, 255) / 255.0F;
        class17.method139(3, true);
        class17.method139(4, true);
        field3398++;
    }
}
