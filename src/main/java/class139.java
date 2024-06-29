import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class139 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Z")
    public static boolean field2460 = true;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "[I")
    public static int[] field2457 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "Lwc;")
    public static class232 field2445 = new class232(64);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "[I")
    public static int[] field2465 = new int[128];

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field2463 = 0;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lqe;")
    public static class168 field2466 = class66.method448("cookiehost", -127);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    private int field2468;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "J")
    private long field2446;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "J")
    private long field2454;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Z")
    public boolean field2458;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
    private int[] field2452;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[I")
    private int[] field2455;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "[[[I")
    public static int[][][] field2467;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
    public final void method950(int arg0, byte arg1, int arg2) {
        field2456++;
        if (arg1 >= -119) {
            method952((byte) 104);
        }
        int var4 = class256.field4475[arg0];
        if (this.field2455[var4] != 0 && class27.method179((byte) 23, arg2) != null) {
            this.field2455[var4] = class102.method675(arg2, Integer.MIN_VALUE);
            this.method958(0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILoe;)V")
    public static final void method951(int arg0, class256 arg1) {
        field2443++;
        if (arg0 > -12) {
            method951(69, null);
        }
        class33.field416 = arg1.method1705(class150.field2623, -1);
        class93.field1466 = arg1.method1705(class189.field3295, -1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method952(byte arg0) {
        field2467 = null;
        field2445 = null;
        field2457 = null;
        field2466 = null;
        field2465 = null;
        int var1 = -109 % ((arg0 + 26) / 54);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILc;IIZ)Lqc;")
    public final class188 method953(int arg0, class237 arg1, int arg2, int arg3, boolean arg4) {
        field2448++;
        if (!arg4) {
            this.method957(51, -41, 116);
        }
        long var6 = (long) arg0 | (long) arg0 << 32 | (long) (arg2 << 16);
        class188 var8 = (class188) class197.field3414.method10(-22553, var6);
        if (var8 == null) {
            class218[] var9 = new class218[2];
            int var10 = 0;
            if (!class27.method179((byte) 23, arg0).method606(0) || !class27.method179((byte) 23, arg2).method606(0)) {
                return null;
            }
            class218 var11 = class27.method179((byte) 23, arg0).method599((byte) -114);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class218 var12 = class27.method179((byte) 23, arg2).method599((byte) -118);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class218 var13 = new class218(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field2452[var14] < class234.field3972[var14].length) {
                    var13.method1433(class209.field3634[var14], class234.field3972[var14][this.field2452[var14]]);
                }
                if (this.field2452[var14] < class147.field2551[var14].length) {
                    var13.method1433(class190.field3303[var14], class147.field2551[var14][this.field2452[var14]]);
                }
            }
            var8 = var13.method1434(64, 768, -50, -10, -50);
            class197.field3414.method11(var8, var6, 25);
        }
        if (arg1 != null) {
            var8 = arg1.method1541(var8, arg3, -28226);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)I")
    public final int method954(byte arg0) {
        field2464++;
        if (arg0 != 127) {
            this.method958(71);
        }
        return this.field2468 == -1 ? (this.field2455[11] << 5) + (this.field2455[8] << 10) + (this.field2452[4] << 20) + (this.field2455[0] << 15) + (this.field2452[0] << 25) + this.field2455[1] : 305419896 - -class74.method504(this.field2468, (byte) -59).field3177;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZ)V")
    public final void method955(int arg0, boolean arg1) {
        field2450++;
        this.field2458 = arg1;
        this.method958(0);
        if (arg0 < 4) {
            this.method954((byte) 3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lc;II)Lqc;")
    public final class188 method956(class237 arg0, int arg1, int arg2) {
        field2447++;
        if (~this.field2468 != arg2) {
            return class74.method504(this.field2468, (byte) -59).method1187(70, arg1, arg0);
        }
        class188 var4 = (class188) class197.field3414.method10(-22553, this.field2446);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2455[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class27.method179((byte) 23, var15 & 0x3FFFFFFF).method606(0)) {
                        var5 = true;
                    }
                } else if (!class151.method1005(520, var15 & 0x3FFFFFFF).method1582(this.field2458, true)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class218[] var8 = new class218[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2455[var9];
                if ((var12 & 0x40000000) != 0) {
                    class218 var14 = class151.method1005(520, var12 & 0x3FFFFFFF).method1578((byte) -126, this.field2458);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class218 var13 = class27.method179((byte) 23, var12 & 0x3FFFFFFF).method599((byte) -117);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class218 var10 = new class218(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field2452[var11] < class234.field3972[var11].length) {
                    var10.method1433(class209.field3634[var11], class234.field3972[var11][this.field2452[var11]]);
                }
                if (class147.field2551[var11].length > this.field2452[var11]) {
                    var10.method1433(class190.field3303[var11], class147.field2551[var11][this.field2452[var11]]);
                }
            }
            var4 = var10.method1434(64, 768, -50, -10, -50);
            class197.field3414.method11(var4, this.field2446, arg2 + 25);
        }
        if (arg0 != null) {
            var4 = arg0.method1541(var4, arg1, arg2 - 28226);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
    public final void method957(int arg0, int arg1, int arg2) {
        field2459++;
        this.field2452[arg2] = arg1;
        int var4 = 67 / (-arg0 / 36);
        this.method958(0);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    private final void method958(int arg0) {
        field2444++;
        long[] var2 = class90.field1405;
        long var3 = this.field2446;
        this.field2446 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2446 = this.field2446 >>> 8 ^ var2[(int) (((long) (this.field2455[var5] >> 24) ^ this.field2446) & 0xFFL)];
            this.field2446 = this.field2446 >>> 8 ^ var2[(int) (((long) (this.field2455[var5] >> 16) ^ this.field2446) & 0xFFL)];
            this.field2446 = this.field2446 >>> 8 ^ var2[(int) ((this.field2446 ^ (long) (this.field2455[var5] >> 8)) & 0xFFL)];
            this.field2446 = this.field2446 >>> 8 ^ var2[(int) (((long) this.field2455[var5] ^ this.field2446) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2446 = var2[(int) (((long) this.field2452[var6] ^ this.field2446) & 0xFFL)] ^ this.field2446 >>> 8;
        }
        this.field2446 = var2[(int) ((this.field2446 ^ (long) (this.field2458 ? 1 : 0)) & 0xFFL)] ^ this.field2446 >>> 8;
        if ((long) arg0 != var3 && this.field2446 != var3) {
            class93.field1461.method8(var3, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIILc;Lc;)Lqc;")
    public final class188 method959(int arg0, int arg1, int arg2, class237 arg3, class237 arg4) {
        field2451++;
        if (this.field2468 != -1) {
            return class74.method504(this.field2468, (byte) -59).method1194(arg1 ^ 0xFFFFF7CC, arg0, arg2, arg4, arg3);
        }
        long var6 = this.field2446;
        int[] var8 = this.field2455;
        if (arg1 != 2168) {
            this.field2455 = null;
        }
        if (arg3 != null && (arg3.field4059 >= 0 || arg3.field4064 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field2455[var9];
            }
            if (arg3.field4059 >= 0) {
                if (arg3.field4059 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class102.method675(1073741824, arg3.field4059);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field4064 >= 0) {
                if (arg3.field4064 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class102.method675(1073741824, arg3.field4064);
                    var6 ^= var8[3];
                }
            }
        }
        class188 var10 = (class188) class93.field1461.method10(-22553, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class27.method179((byte) 23, var30 & 0x3FFFFFFF).method598(-78)) {
                        var11 = true;
                    }
                } else if (!class151.method1005(520, var30 & 0x3FFFFFFF).method1577(this.field2458, arg1 ^ 0xFFFFF782)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2454 != -1L) {
                    var10 = (class188) class93.field1461.method10(-22553, this.field2454);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class218[] var13 = new class218[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class218 var29 = class151.method1005(520, var27 & 0x3FFFFFFF).method1585(this.field2458, (byte) 125);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class218 var28 = class27.method179((byte) 23, var27 & 0x3FFFFFFF).method605((byte) -125);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class242 var17 = class151.method1005(520, var16 & 0x3FFFFFFF);
                    if (var17.field4173 != null) {
                        for (int var18 = 0; var18 < var17.field4173.length; var18++) {
                            if (var17.field4173[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field4173[var18][1];
                                int var20 = var17.field4173[var18][2];
                                int var21 = var17.field4173[var18][0];
                                int var22 = var17.field4173[var18][3];
                                int var23 = var17.field4173[var18][5];
                                int var24 = var17.field4173[var18][4];
                                var13[var18 + 1].method1438(var21, var19, var20);
                                var13[var18 + 1].method1429(var22, var24, var23);
                            }
                        }
                    }
                }
                class218 var25 = new class218(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field2452[var26] < class234.field3972[var26].length) {
                        var25.method1433(class209.field3634[var26], class234.field3972[var26][this.field2452[var26]]);
                    }
                    if (class147.field2551[var26].length > this.field2452[var26]) {
                        var25.method1433(class190.field3303[var26], class147.field2551[var26][this.field2452[var26]]);
                    }
                }
                var10 = var25.method1434(64, 850, -30, -50, -30);
                class93.field1461.method11(var10, var6, arg1 ^ 0x861);
                this.field2454 = var6;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class188 var31;
        if (arg3 != null && arg4 != null) {
            var31 = arg3.method1540(var10, arg0, arg2, arg1 ^ 0xFFFFF787, arg4);
        } else if (arg3 == null) {
            var31 = arg4.method1539(var10, (byte) -24, arg0);
        } else {
            var31 = arg3.method1539(var10, (byte) -123, arg2);
        }
        return var31;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI[IB[I)V")
    public final void method960(boolean arg0, int arg1, int[] arg2, byte arg3, int[] arg4) {
        if (arg3 <= 51) {
            this.field2446 = -94L;
        }
        field2461++;
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class91.field1407; var7++) {
                    class91 var8 = class27.method179((byte) 23, var7);
                    if (var8 != null && !var8.field1419 && (arg0 ? 7 : 0) + var6 == var8.field1408) {
                        arg4[class256.field4475[var6]] = class102.method675(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2468 = arg1;
        this.field2455 = arg4;
        this.field2458 = arg0;
        this.field2452 = arg2;
        this.method958(0);
    }
}
