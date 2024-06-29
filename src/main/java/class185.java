import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class185 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lti;")
    public static class185 field3380 = new class185();

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Lsg;")
    public static class30 field3387 = class167.method1221((byte) 33, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lsg;")
    public static class30 field3403 = class167.method1221((byte) 33, "null");

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "Z")
    public static boolean field3392 = true;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field3397;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "J")
    private long field3400;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "J")
    private long field3405;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "Lvd;")
    public static class110 field3399;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Z")
    public boolean field3381;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "[I")
    private int[] field3393;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[I")
    private int[] field3396;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Leh;II)Lfi;")
    public final class217 method1323(class138 arg0, int arg1, int arg2) {
        if (arg1 != Integer.MIN_VALUE) {
            this.field3397 = -24;
        }
        field3385++;
        if (this.field3397 != -1) {
            return class2.method14(false, this.field3397).method1710(arg2, arg0, 64);
        }
        class217 var4 = (class217) class163.field3033.method1644((byte) -120, this.field3405);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field3393[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class67.method605(var15 & 0x3FFFFFFF, (byte) 124).method769(0)) {
                        var5 = true;
                    }
                } else if (!class201.method1425(arg1 ^ 0x8000004C, var15 & 0x3FFFFFFF).method1232(false, this.field3381)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class128[] var7 = new class128[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field3393[var9];
                if ((var12 & 0x40000000) != 0) {
                    class128 var13 = class201.method1425(43, var12 & 0x3FFFFFFF).method1231(19273, this.field3381);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class128 var14 = class67.method605(var12 & 0x3FFFFFFF, (byte) 120).method764(arg1 - 2147483558);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                }
            }
            class128 var10 = new class128(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field3396[var11] < class239.field4253[var11].length) {
                    var10.method961(class71.field1591[var11], class239.field4253[var11][this.field3396[var11]]);
                }
                if (class216.field3947[var11].length > this.field3396[var11]) {
                    var10.method961(class175.field3265[var11], class216.field3947[var11][this.field3396[var11]]);
                }
            }
            var4 = var10.method965(64, 768, -50, -10, -50);
            class163.field3033.method1646(this.field3405, var4, arg1 ^ 0x7FFFFF89);
        }
        if (arg0 != null) {
            var4 = arg0.method1035(true, var4, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
    public final void method1324(int arg0, int arg1, int arg2) {
        if (arg0 != -13) {
            field3395 = 117;
        }
        field3401++;
        this.field3396[arg2] = arg1;
        this.method1335(12);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IBI)V")
    public static final void method1325(int arg0, byte arg1, int arg2) {
        if (arg1 != -57) {
            method1333((byte) -34);
        }
        field3391++;
        if (class1.method9(arg0, (byte) -13)) {
            class234.method1655(class259.field4572[arg0], arg2, (byte) -112);
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V")
    public final void method1326(int arg0, int arg1, int arg2) {
        field3398++;
        int var4 = class231.field4118[arg1];
        if (this.field3393[var4] == 0) {
            return;
        }
        if (arg2 != -31172) {
            this.method1328(113, (int[]) null, true, (int[]) null, -84);
        }
        if (class67.method605(arg0, (byte) -66) != null) {
            this.field3393[var4] = class182.method1314(arg0, Integer.MIN_VALUE);
            this.method1335(12);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)I")
    public final int method1327(byte arg0) {
        field3384++;
        if (arg0 == 81) {
            return this.field3397 == -1 ? (this.field3393[8] << 10) + (this.field3393[0] << 15) + (this.field3396[4] << 20) + (this.field3396[0] << 25) + (this.field3393[11] << 5) + this.field3393[1] : class2.method14(false, this.field3397).field4310 + 305419896;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[IZ[II)V")
    public final void method1328(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class251.field4442; var7++) {
                    class94 var8 = class67.method605(var7, (byte) -126);
                    if (var8 != null && !var8.field1904 && var8.field1902 == ((arg2 ? 7 : 0) + var6)) {
                        arg3[class231.field4118[var6]] = class182.method1314(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field3397 = arg4;
        this.field3396 = arg1;
        field3388++;
        if (arg0 == 0) {
            this.field3393 = arg3;
            this.field3381 = arg2;
            this.method1335(12);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[B)Lcc;")
    public static final class206 method1329(byte arg0, byte[] arg1) {
        field3402++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -120) {
            method1334(0, 126, (byte[]) null);
        }
        class218 var2 = new class218(arg1, class142.field2752, class37.field895, class62.field1329, class2.field33, class222.field3992);
        class175.method1285((byte) 53);
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Leh;ILeh;ZI)Lfi;")
    public final class217 method1330(class138 arg0, int arg1, class138 arg2, boolean arg3, int arg4) {
        field3390++;
        if (this.field3397 != -1) {
            return class2.method14(false, this.field3397).method1708(92, arg4, arg1, arg2, arg0);
        }
        int[] var6 = this.field3393;
        long var7 = this.field3405;
        if (arg2 != null && (arg2.field2704 >= 0 || arg2.field2707 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field3393[var9];
            }
            if (arg2.field2704 >= 0) {
                if (arg2.field2704 == 65535) {
                    var6[5] = 0;
                    var7 ^= 0xFFFFFFFF00000000L;
                } else {
                    var6[5] = class182.method1314(arg2.field2704, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg2.field2707 >= 0) {
                if (arg2.field2707 == 65535) {
                    var6[3] = 0;
                    var7 ^= 0xFFFFFFFFL;
                } else {
                    var6[3] = class182.method1314(1073741824, arg2.field2707);
                    var7 ^= (long) var6[3];
                }
            }
        }
        class217 var10 = (class217) class243.field4349.method1644((byte) -66, var7);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var6[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class67.method605(var30 & 0x3FFFFFFF, (byte) -90).method765(0)) {
                        var11 = true;
                    }
                } else if (!class201.method1425(89, var30 & 0x3FFFFFFF).method1226(-1, this.field3381)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3400 != -1L) {
                    var10 = (class217) class243.field4349.method1644((byte) -56, this.field3400);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class128[] var13 = new class128[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var6[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class128 var28 = class201.method1425(42, var27 & 0x3FFFFFFF).method1238(-27740, this.field3381);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class128 var29 = class67.method605(var27 & 0x3FFFFFFF, (byte) -106).method763((byte) 115);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var6[0];
                if ((var16 & 0x40000000) != 0) {
                    class168 var17 = class201.method1425(111, var16 & 0x3FFFFFFF);
                    if (var17.field3160 != null) {
                        for (int var18 = 0; var18 < var17.field3160.length; var18++) {
                            if (var17.field3160[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field3160[var18][0];
                                int var20 = var17.field3160[var18][2];
                                int var21 = var17.field3160[var18][1];
                                int var22 = var17.field3160[var18][3];
                                int var23 = var17.field3160[var18][4];
                                int var24 = var17.field3160[var18][5];
                                var13[var18 + 1].method960(var19, var21, var20);
                                var13[var18 + 1].method979(var22, var23, var24);
                            }
                        }
                    }
                }
                class128 var25 = new class128(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class239.field4253[var26].length > this.field3396[var26]) {
                        var25.method961(class71.field1591[var26], class239.field4253[var26][this.field3396[var26]]);
                    }
                    if (this.field3396[var26] < class216.field3947[var26].length) {
                        var25.method961(class175.field3265[var26], class216.field3947[var26][this.field3396[var26]]);
                    }
                }
                var10 = var25.method965(64, 850, -30, -50, -30);
                class243.field4349.method1646(var7, var10, -128);
                this.field3400 = var7;
            }
        }
        if (arg2 == null && arg0 == null) {
            return var10;
        }
        class217 var31;
        if (arg2 != null && arg0 != null) {
            var31 = arg2.method1043(var10, arg4, arg1, -2138622320, arg0);
        } else if (arg2 == null) {
            var31 = arg0.method1039(var10, 8, arg4);
        } else {
            var31 = arg2.method1039(var10, 8, arg1);
        }
        if (arg3) {
            this.field3397 = -33;
        }
        return var31;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLdl;)Lsg;")
    public static final class30 method1331(byte arg0, class31 arg1) {
        field3382++;
        if (arg0 >= -106) {
            method1325(-87, (byte) 109, -77);
        }
        if (class225.method1613(-100596213, client.method1498(arg1)) == 0) {
            return null;
        } else if (arg1.field765 == null || arg1.field765.method288((byte) 121).method249(-17) == 0) {
            return class96.field1959 ? class219.field3962 : null;
        } else {
            return arg1.field765;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILeh;)Lfi;")
    public final class217 method1332(int arg0, int arg1, int arg2, int arg3, class138 arg4) {
        long var6 = (long) arg1 | (long) arg1 << 32 | (long) (arg3 << 16);
        class217 var8 = (class217) class163.field3033.method1644((byte) -121, var6);
        if (arg2 != 794912672) {
            return null;
        }
        field3389++;
        if (var8 == null) {
            class128[] var9 = new class128[2];
            int var10 = 0;
            if (!class67.method605(arg1, (byte) 58).method769(arg2 - 794912672) || !class67.method605(arg3, (byte) -110).method769(0)) {
                return null;
            }
            class128 var11 = class67.method605(arg1, (byte) 34).method764(45);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class128 var12 = class67.method605(arg3, (byte) -72).method764(63);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class128 var13 = new class128(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class239.field4253[var14].length > this.field3396[var14]) {
                    var13.method961(class71.field1591[var14], class239.field4253[var14][this.field3396[var14]]);
                }
                if (class216.field3947[var14].length > this.field3396[var14]) {
                    var13.method961(class175.field3265[var14], class216.field3947[var14][this.field3396[var14]]);
                }
            }
            var8 = var13.method965(64, 768, -50, -10, -50);
            class163.field3033.method1646(var6, var8, arg2 - 794912782);
        }
        if (arg4 != null) {
            var8 = arg4.method1035(true, var8, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
    public static void method1333(byte arg0) {
        field3403 = null;
        field3399 = null;
        field3380 = null;
        field3387 = null;
        if (arg0 > -3) {
            method1333((byte) 30);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[B)I")
    public static final int method1334(int arg0, int arg1, byte[] arg2) {
        if (arg0 <= 88) {
            method1334(-73, 49, (byte[]) null);
        }
        field3404++;
        return class139.method1048(0, arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    private final void method1335(int arg0) {
        long[] var2 = class102.field2074;
        long var3 = this.field3405;
        field3386++;
        this.field3405 = -1L;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3405 = this.field3405 >>> 8 ^ var2[(int) ((this.field3405 ^ (long) (this.field3393[var5] >> 24)) & 0xFFL)];
            this.field3405 = this.field3405 >>> 8 ^ var2[(int) ((this.field3405 ^ (long) (this.field3393[var5] >> 16)) & 0xFFL)];
            this.field3405 = var2[(int) ((this.field3405 ^ (long) (this.field3393[var5] >> 8)) & 0xFFL)] ^ this.field3405 >>> 8;
            this.field3405 = var2[(int) (((long) this.field3393[var5] ^ this.field3405) & 0xFFL)] ^ this.field3405 >>> 8;
        }
        if (arg0 != 12) {
            return;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3405 = this.field3405 >>> 8 ^ var2[(int) ((this.field3405 ^ (long) this.field3396[var6]) & 0xFFL)];
        }
        this.field3405 = this.field3405 >>> 8 ^ var2[(int) (((long) (this.field3381 ? 1 : 0) ^ this.field3405) & 0xFFL)];
        if (var3 != 0L && this.field3405 != var3) {
            class243.field4349.method1647((byte) 87, var3);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
    public final void method1336(boolean arg0, int arg1) {
        if (arg1 >= -10) {
            field3392 = false;
        }
        field3383++;
        this.field3381 = arg0;
        this.method1335(12);
    }
}
