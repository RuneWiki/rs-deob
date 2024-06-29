import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class103 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public int field1381 = -1;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    private int field1384;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field1388;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field1393;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "J")
    private long field1377;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "J")
    private long field1387;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Loe;")
    public static class230 field1392;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Z")
    public boolean field1379;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
    private int[] field1380;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "[I")
    public int[] field1391;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "[[I")
    private int[][] field1390;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method692(int arg0, boolean arg1) {
        this.field1379 = arg1;
        field1376++;
        this.method704(true);
        if (arg0 != 703608168) {
            this.field1377 = -44L;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method693(boolean arg0) {
        field1383++;
        class24 var1 = class436.field6400;
        synchronized (class436.field6400) {
            if (arg0) {
                field1392 = null;
            }
            class436.field6400.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)V", line = 40)
    public final void method694(int arg0, int arg1, int arg2) {
        int var4 = -35 / ((arg0 - 49) / 54);
        field1386++;
        int var5 = class79.field1076[arg1];
        if (this.field1380[var5] != 0 && class421.method2714((byte) -108, arg2) != null) {
            this.field1380[var5] = class128.method871(arg2, Integer.MIN_VALUE);
            this.method704(true);
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(III)V", line = 60)
    public final void method695(int arg0, int arg1, int arg2) {
        if (arg1 != 16384) {
            this.method694(-57, 118, 125);
        }
        field1393++;
        this.field1391[arg2] = arg0;
        this.method704(true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Z", line = 74)
    public static final boolean method696(int arg0) {
        field1385++;
        if (class231.field3265) {
            try {
                class67.method434(class361.field5285.field29, (byte) -100, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 3) {
            method697((byte) 35);
        }
        return false;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 95)
    public static final void method697(byte arg0) {
        field1374++;
        if (arg0 < 113) {
            return;
        }
        for (int var1 = 0; var1 < class439.field6430; var1++) {
            int var2 = class159.field2085[var1];
            class129 var3 = class23.field408[var2];
            int var4 = class114.field1556.method1697(-69);
            if ((var4 & 0x20) != 0) {
                var4 += class114.field1556.method1697(58) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class114.field1556.method1684((byte) 79);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class114.field1556.method1671(-16777216);
                boolean var7 = true;
                if (var5 != -1 && var3.field228 != -1) {
                    if (var3.field228 == var5) {
                        class333 var12 = class395.method2586(var5, -6861);
                        if (var12.field4922 && var12.field4924 != -1) {
                            class15 var13 = class391.method2551(var12.field4924, (byte) -124);
                            int var14 = var13.field166;
                            if (var14 == 0) {
                                var7 = false;
                            } else if (var14 == 1) {
                                var7 = true;
                            } else if (var14 == 2) {
                                var3.field282 = 0;
                                var7 = false;
                            }
                        }
                    } else {
                        class333 var8 = class395.method2586(var5, -6861);
                        class333 var9 = class395.method2586(var3.field228, -6861);
                        if (var8.field4924 != -1 && var9.field4924 != -1) {
                            class15 var10 = class391.method2551(var8.field4924, (byte) -122);
                            class15 var11 = class391.method2551(var9.field4924, (byte) -90);
                            if (var10.field153 < var11.field153) {
                                var7 = false;
                            }
                        }
                    }
                }
                if (var7) {
                    var3.field228 = var5;
                    var3.field262 = (var6 & 0xFFFF) + class50.field698;
                    var3.field226 = 1;
                    var3.field261 = var6 >> 16;
                    var3.field237 = 0;
                    var3.field263 = 0;
                    if (class50.field698 < var3.field262) {
                        var3.field237 = -1;
                    }
                    if (var3.field228 != -1 && class50.field698 == var3.field262) {
                        int var15 = class395.method2586(var3.field228, -6861).field4924;
                        if (var15 != -1) {
                            class15 var16 = class391.method2551(var15, (byte) -125);
                            if (var16 != null && var16.field150 != null) {
                                class277.method1770(var3.field5284, 21155, false, 0, var3.field5298, var16);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x4) != 0) {
                var3.field255 = class114.field1556.method1712(false);
                var3.field251 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var17 = class114.field1556.method1680(-1647926640);
                int var18 = class114.field1556.method1702(4095);
                var3.method132(0, var17, var18, class50.field698);
            }
            if ((var4 & 0x100) != 0) {
                int var19 = class114.field1556.method1665(14684);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                int[] var22 = new int[var19];
                for (int var23 = 0; var23 < var19; var23++) {
                    int var24 = class114.field1556.method1684((byte) 79);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    var20[var23] = var24;
                    var21[var23] = class114.field1556.method1665(14684);
                    var22[var23] = class114.field1556.method1684((byte) 79);
                }
                class248.method1529((byte) 18, var20, var22, var21, var3);
            }
            if ((var4 & 0x400) != 0) {
                var3.field221 = class114.field1556.method1705(false);
                var3.field274 = class114.field1556.method1685(8104);
            }
            if ((var4 & 0x40) != 0) {
                if (var3.field1714.method2463(0)) {
                    class188.method1170(true, var3);
                }
                var3.method877(121, class248.method1530(class114.field1556.method1694(-1), 125));
                var3.method136(true, var3.field1714.field5570);
                var3.field285 = var3.field1714.field5584 << 3;
                if (var3.field1714.method2463(0)) {
                    class280.method1794((class194) null, 0, var3.field306[0], var3, false, class193.field2688, (class404) null, var3.field303[0]);
                }
            }
            if ((var4 & 0x80) != 0) {
                int var25 = class114.field1556.method1694(-1);
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = class114.field1556.method1674((byte) 106);
                class192.method1193(0, var3, var25, var26);
            }
            if ((var4 & 0x1) != 0) {
                var3.field230 = class114.field1556.method1684((byte) 79);
                if (var3.field230 == 65535) {
                    var3.field230 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var27 = class114.field1556.method1685(8104);
                var3.field270 = class114.field1556.method1665(14684);
                var3.field234 = class114.field1556.method1665(14684);
                var3.field277 = var27 & 0x7FFF;
                var3.field287 = (var27 & 0x8000) != 0;
                var3.field244 = class50.field698 - (-var3.field277 - var3.field270);
            }
            if ((var4 & 0x8) != 0) {
                int var28 = class114.field1556.method1680(-1647926640);
                int var29 = class114.field1556.method1697(109);
                var3.method132(0, var28, var29, class50.field698);
                var3.field247 = class50.field698 + 300;
                var3.field252 = class114.field1556.method1697(77);
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[IBZI[I)V", line = 341)
    public final void method698(int arg0, int[] arg1, byte arg2, boolean arg3, int arg4, int[] arg5) {
        if (this.field1384 != arg4) {
            this.field1384 = arg4;
            this.field1390 = null;
        }
        field1382++;
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class170.field2247; var8++) {
                    class200 var9 = class421.method2714((byte) -87, var8);
                    if (var9 != null && !var9.field2867 && var9.field2862 == (arg3 ? class326.field4694[var7] : class33.field546[var7])) {
                        arg1[class79.field1076[var7]] = class128.method871(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1379 = arg3;
        this.field1391 = arg5;
        this.field1381 = arg0;
        if (arg2 < 74) {
            this.method699((class437) null, 10, 42, (class15) null, 32, 117, (byte) 20);
        }
        this.field1380 = arg1;
        this.method704(true);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnr;IILqr;IIB)Lqc;", line = 392)
    public final class95 method699(class437 arg0, int arg1, int arg2, class15 arg3, int arg4, int arg5, byte arg6) {
        field1373++;
        if (this.field1381 != -1) {
            return class248.method1530(this.field1381, arg6 ^ 0x18).method2467(arg1, arg4, -1, arg2, arg3, arg5, arg0);
        }
        int var8 = arg4;
        if (arg3 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            var8 = arg4 | 0x20;
            Object var15 = null;
            int var16 = arg3.field150[arg2];
            int var17 = var16 >>> 16;
            class236 var18 = class376.method2496((byte) -119, var17);
            int var19 = var16 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method1440(65280, var19);
                var9 |= var18.method1443((byte) 0, var19);
                var11 |= arg3.field152;
            }
            if ((arg3.field170 || class408.field6114) && arg5 != -1 && arg3.field150.length > arg5) {
                int var20 = arg3.field150[arg5];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class236 var23 = var17 == var21 ? var18 : class376.method2496((byte) -119, var21);
                if (var23 != null) {
                    var10 |= var23.method1440(65280, var22);
                    var9 |= var23.method1443((byte) 0, var22);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        if (arg6 != 74) {
            this.field1390 = null;
        }
        class24 var24 = class197.field2822;
        class95 var25;
        synchronized (class197.field2822) {
            var25 = (class95) class197.field2822.method209(119, this.field1387);
        }
        if (var25 == null || arg0.method2132(var25.method594(), var8) != 0) {
            if (var25 != null) {
                var8 = arg0.method2068(var8, var25.method594());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field1380[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class421.method2714((byte) -91, var29 & 0x3FFFFFFF).method1256(true)) {
                        var27 = true;
                    }
                } else if (!class166.method1031(var29 & 0x3FFFFFFF, false).method1211(this.field1379, -108)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class180[] var30 = new class180[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field1380[var32];
                if ((var33 & 0x40000000) != 0) {
                    class180 var34 = class166.method1031(var33 & 0x3FFFFFFF, false).method1202(this.field1379, (byte) 80);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class180 var35 = class421.method2714((byte) -95, var33 & 0x3FFFFFFF).method1255(-20658);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            class180 var36 = new class180(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg0.method2164(var36, var37, class142.field1873, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class132.field1777[var38].length > this.field1391[var38]) {
                    var25.method601(class434.field6394[var38], class132.field1777[var38][this.field1391[var38]]);
                }
                if (class312.field4467[var38].length > this.field1391[var38]) {
                    var25.method601(class34.field557[var38], class312.field4467[var38][this.field1391[var38]]);
                }
            }
            var25.method589(var8);
            class24 var39 = class197.field2822;
            synchronized (class197.field2822) {
                class197.field2822.method202(true, var25, this.field1387);
            }
        }
        if (arg3 == null) {
            return var25;
        } else {
            var25.method628((byte) 1, var8, true);
            return arg3.method100(arg5, arg1, arg4, (byte) -78, var25, arg2);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lqr;IBIIIIILnr;I)Lqc;", line = 579)
    public final class95 method700(class15 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class437 arg8, int arg9) {
        field1378++;
        int var11 = arg6;
        if (arg0 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg0.field150[arg9];
            Object var19 = null;
            var11 = arg6 | 0x20;
            int var20 = var18 >>> 16;
            int var21 = var18 & 0xFFFF;
            class236 var22 = class376.method2496((byte) -119, var20);
            if (var22 != null) {
                var13 |= var22.method1440(65280, var21);
                var12 |= var22.method1443((byte) 0, var21);
                var14 |= arg0.field152;
            }
            if ((arg0.field170 || class408.field6114) && arg1 != -1 && arg1 < arg0.field150.length) {
                int var23 = arg0.field150[arg1];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class236 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class376.method2496((byte) -119, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method1440(65280, var25);
                    var12 |= var26.method1443((byte) 0, var25);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) (arg7 << 16) | (long) arg3 << 32 | (long) arg4;
        class24 var29 = class197.field2822;
        class95 var30;
        synchronized (class197.field2822) {
            var30 = (class95) class197.field2822.method209(arg2 + 133, var27);
        }
        if (var30 == null || arg8.method2132(var30.method594(), var11) != 0) {
            if (var30 != null) {
                var11 = arg8.method2068(var11, var30.method594());
            }
            class180[] var32 = new class180[3];
            int var33 = 0;
            if (!class421.method2714((byte) -102, arg4).method1256(true) || !class421.method2714((byte) -87, arg7).method1256(true) || !class421.method2714((byte) -77, arg3).method1256(true)) {
                return null;
            }
            class180 var34 = class421.method2714((byte) -64, arg4).method1255(-20658);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class180 var35 = class421.method2714((byte) -72, arg7).method1255(arg2 - 20644);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class180 var36 = class421.method2714((byte) -106, arg3).method1255(-20658);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class180 var38 = new class180(var32, var33);
            var30 = arg8.method2164(var38, var37, class142.field1873, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field1391[var39] < class132.field1777[var39].length) {
                    var30.method601(class434.field6394[var39], class132.field1777[var39][this.field1391[var39]]);
                }
                if (class312.field4467[var39].length > this.field1391[var39]) {
                    var30.method601(class34.field557[var39], class312.field4467[var39][this.field1391[var39]]);
                }
            }
            var30.method589(var11);
            class24 var40 = class197.field2822;
            synchronized (class197.field2822) {
                class197.field2822.method202(true, var30, var27);
            }
        }
        if (arg2 != -14) {
            method703(-100, -101, (byte) -60);
        }
        if (arg0 == null) {
            return var30;
        } else {
            class95 var41 = var30.method628((byte) 1, var11, true);
            return arg0.method100(arg1, arg5, arg6, (byte) -88, var41, arg9);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIILnr;Lqr;IBI[Lp;Lqr;IZ)Lqc;", line = 722)
    public final class95 method701(int arg0, int arg1, int arg2, int arg3, class437 arg4, class15 arg5, int arg6, byte arg7, int arg8, class445[] arg9, class15 arg10, int arg11, boolean arg12) {
        field1388++;
        if (this.field1381 != -1) {
            return class248.method1530(this.field1381, arg7 + 143).method2468(arg2, arg11, arg9, arg10, 123, arg5, arg6, arg4, arg1, arg0, arg8, arg3);
        }
        int var14 = arg8;
        long var15 = this.field1387;
        int[] var17 = this.field1380;
        if (arg10 != null && (arg10.field155 >= 0 || arg10.field154 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field1380[var18];
            }
            if (arg10.field155 >= 0) {
                if (arg10.field155 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class128.method871(1073741824, arg10.field155);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg10.field154 >= 0) {
                if (arg10.field154 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class128.method871(1073741824, arg10.field154);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg10 != null || arg5 != null;
        int var22 = arg9 == null ? 0 : arg9.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class41.field642[var23] = null;
            if (arg9[var23] != null) {
                class15 var24 = class391.method2551(arg9[var23].field6483, (byte) -104);
                if (var24.field150 != null) {
                    class348.field5168[var23] = var24;
                    var21 = true;
                    int var25 = arg9[var23].field6481;
                    int var26 = arg9[var23].field6480;
                    int var27 = var24.field150[var25];
                    class41.field642[var23] = class376.method2496((byte) -119, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class119.field1585[var23] = var28;
                    if (class41.field642[var23] != null) {
                        var20 |= class41.field642[var23].method1440(65280, var28);
                        var19 |= class41.field642[var23].method1443((byte) 0, var28);
                    }
                    if ((var24.field170 || class408.field6114) && var26 != -1 && var26 < var24.field150.length) {
                        class159.field2082[var23] = var24.field164[var25];
                        class405.field6091[var23] = arg9[var23].field6486;
                        int var29 = var24.field150[var26];
                        class30.field521[var23] = class376.method2496((byte) -119, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class119.field1598[var23] = var30;
                        if (class30.field521[var23] != null) {
                            var20 |= class30.field521[var23].method1440(65280, var30);
                            var19 |= class30.field521[var23].method1443((byte) 0, var30);
                        }
                    } else {
                        class159.field2082[var23] = 0;
                        class405.field6091[var23] = 0;
                        class30.field521[var23] = null;
                        class119.field1598[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class236 var34 = null;
        if (arg7 != -103) {
            this.field1379 = false;
        }
        class236 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class236 var39 = null;
        class236 var40 = null;
        if (var21) {
            if (arg10 != null) {
                int var41 = arg10.field150[arg1];
                int var42 = var41 >>> 16;
                var34 = class376.method2496((byte) -119, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method1440(arg7 + 65383, var31);
                    var19 |= var34.method1443((byte) 0, var31);
                }
                if ((arg10.field170 || class408.field6114) && arg3 != -1 && arg10.field150.length > arg3) {
                    int var43 = arg10.field150[arg3];
                    var33 = arg10.field164[arg1];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    var35 = var42 == var44 ? var34 : class376.method2496((byte) -119, var44);
                    if (var35 != null) {
                        var20 |= var35.method1440(65280, var32);
                        var19 |= var35.method1443((byte) 0, var32);
                    }
                }
            }
            var14 = arg8 | 0x20;
            if (arg5 != null) {
                int var45 = arg5.field150[arg6];
                int var46 = var45 >>> 16;
                var39 = class376.method2496((byte) -119, var46);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method1440(65280, var36);
                    var19 |= var39.method1443((byte) 0, var36);
                }
                if ((arg5.field170 || class408.field6114) && arg2 != -1 && arg2 < arg5.field150.length) {
                    var38 = arg5.field164[arg6];
                    int var47 = arg5.field150[arg2];
                    int var48 = var47 >>> 16;
                    var40 = var46 == var48 ? var39 : class376.method2496((byte) -119, var48);
                    var37 = var47 & 0xFFFF;
                    if (var40 != null) {
                        var20 |= var40.method1440(65280, var37);
                        var19 |= var40.method1443((byte) 0, var37);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class24 var49 = class104.field1396;
        class95 var50;
        synchronized (class104.field1396) {
            var50 = (class95) class104.field1396.method209(arg7 ^ 0xFFFFFFE6, var15);
        }
        class183 var51 = null;
        if (this.field1384 != -1) {
            var51 = class132.method899(this.field1384, (byte) 127);
        }
        if (var50 == null || arg4.method2132(var50.method594(), var14) != 0 || var51 != null && var51.field2463 != null && this.field1390 == null) {
            if (var50 != null) {
                var14 = arg4.method2068(var14, var50.method594());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field1377 != -1L) {
                            class24 var81 = class104.field1396;
                            synchronized (class104.field1396) {
                                var50 = (class95) class104.field1396.method209(123, this.field1377);
                            }
                        }
                        if (var50 == null || arg4.method2132(var50.method594(), var14) != 0 || var51 != null && var51.field2463 != null && this.field1390 == null) {
                            return null;
                        }
                    } else {
                        class180[] var56 = new class180[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class180 var60 = class166.method1031(var58 & 0x3FFFFFFF, false).method1198(true, this.field1379);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            } else if ((Integer.MIN_VALUE & var58) != 0) {
                                class180 var59 = class421.method2714((byte) -89, var58 & 0x3FFFFFFF).method1257(-14648);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            }
                        }
                        if (var51 != null && var51.field2463 != null) {
                            for (int var61 = 0; var61 < var51.field2463.length; var61++) {
                                if (var51.field2463[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field2463[var61][0];
                                    int var63 = var51.field2463[var61][1];
                                    int var64 = var51.field2463[var61][2];
                                    int var65 = var51.field2463[var61][3] << 3;
                                    int var66 = var51.field2463[var61][4] << 3;
                                    int var67 = var51.field2463[var61][5] << 3;
                                    if (this.field1390 == null) {
                                        this.field1390 = new int[var51.field2463.length][];
                                    }
                                    if (this.field1390[var61] == null) {
                                        int[] var68 = this.field1390[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[14] = -var64;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[13] = -var63;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class190.field2635[var65];
                                            int var70 = class190.field2644[var65];
                                            int var71 = class190.field2635[var66];
                                            int var72 = class190.field2644[var66];
                                            int var73 = class190.field2635[var67];
                                            int var74 = class190.field2644[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[0] = var72 * var76 + var71 * var73 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + (var72 * var75) + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + (var71 * var75) + 16384 >> 15;
                                            var68[6] = -var72 * var73 - (-(var71 * var76) - 16384) >> 15;
                                            var68[5] = -var70;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[12] = var68[6] * -var64 + var68[3] * -var63 + var68[0] * -var62 + 16384 >> 15;
                                            var68[13] = var68[7] * -var64 + var68[1] * -var62 + var68[4] * -var63 + 16384 >> 15;
                                            var68[14] = var68[8] * -var64 + var68[2] * -var62 + (var68[5] * -var63) + 16384 >> 15;
                                        }
                                        var68[11] = var64;
                                        var68[10] = var63;
                                        var68[9] = var62;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method1119(var67, var66, false, var65);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method1118(var62, var64, 30, var63);
                                    }
                                }
                            }
                        }
                        int var77 = var14 | 0x2000;
                        class180 var78 = new class180(var56, var56.length);
                        var50 = arg4.method2164(var78, var77, class142.field1873, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (class132.field1777[var79].length > this.field1391[var79]) {
                                var50.method601(class434.field6394[var79], class132.field1777[var79][this.field1391[var79]]);
                            }
                            if (class312.field4467[var79].length > this.field1391[var79]) {
                                var50.method601(class34.field557[var79], class312.field4467[var79][this.field1391[var79]]);
                            }
                        }
                        if (arg12) {
                            var50.method589(var14);
                            class24 var80 = class104.field1396;
                            synchronized (class104.field1396) {
                                class104.field1396.method202(true, var50, var15);
                            }
                            this.field1377 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((var55 & Integer.MIN_VALUE) != 0 && !class421.method2714((byte) -73, var55 & 0x3FFFFFFF).method1254((byte) -116)) {
                        var53 = true;
                    }
                } else if (!class166.method1031(var55 & 0x3FFFFFFF, false).method1196(true, this.field1379)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class95 var82 = var50.method628((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class41.field642[var83] != null) {
                var82.method591(class119.field1598[var83], class405.field6091[var83] - 1, class119.field1585[var83], var84, this.field1390 == null ? null : this.field1390[var83], class159.field2082[var83], arg7 - 14, class41.field642[var83], class30.field521[var83], false, 0);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method609(var34, var37, var35, arg0 - 1, var31, var40, var36, var38, var33, arg11 - 1, var39, arg10.field160, false, var32, (byte) 28);
        } else if (var34 != null) {
            var82.method611(var32, 0, var33, 0, arg11 - 1, var35, false, var34, var31);
        } else if (var39 != null) {
            var82.method611(var37, 0, var38, arg7 ^ 0xFFFFFF99, arg0 - 1, var40, false, var39, var36);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class41.field642[var85] = null;
            class30.field521[var85] = null;
            class348.field5168[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[[[BIBII)V", line = 1214)
    public static final void method702(int arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        class246.field3431++;
        class16.field181 = 0;
        for (int var6 = class57.field821; var6 < class137.field1817; var6++) {
            class10[][] var17 = class343.field5032[var6];
            for (int var18 = class398.field5961; var18 < class110.field1519; var18++) {
                for (int var19 = class349.field5181; var19 < class265.field3905; var19++) {
                    class10 var20 = var17[var18][var19];
                    if (var20 != null) {
                        if (class337.field4974[var18 + class27.field480 - class308.field4398][var19 + class27.field480 - class383.field5729] && arg1 == null || var6 < arg2 || arg1[var6][var18][var19] != arg3) {
                            var20.field105 = true;
                            var20.field118 = true;
                            if (var20.field109 == null) {
                                var20.field122 = false;
                            } else {
                                var20.field122 = true;
                            }
                            class16.field181++;
                        } else {
                            var20.field105 = false;
                            var20.field118 = false;
                            var20.field112 = 0;
                            if (var18 >= class308.field4398 - 16 && var18 <= class308.field4398 + 16 && var19 >= class383.field5729 - 16 && var19 <= class383.field5729 + 16 && (var20.field117 != null || var20.field120 != null || var20.field123 != null || var20.field102 != null || var20.field124 != null || var20.field109 != null)) {
                                class30.field514.method265(var20, (byte) -102);
                            }
                        }
                    }
                }
            }
        }
        boolean var7 = class88.field1226 == class425.field6324;
        for (int var8 = class57.field821; var8 < class137.field1817; var8++) {
            float var9 = var7 ? 202.0F : 201.5F - (float) var8 * 50.0F - 0.5F;
            if (class310.field4442.method2112() && var8 >= arg2 && arg1 != null) {
                int var10 = class337.field4974.length;
                if (class337.field4974.length + class398.field5961 > class308.field4403) {
                    var10 -= class337.field4974.length + class398.field5961 - class308.field4403;
                }
                int var11 = class337.field4974[0].length;
                if (class337.field4974[0].length + class349.field5181 > class413.field6175) {
                    var11 -= class337.field4974[0].length + class349.field5181 - class413.field6175;
                }
                int var12 = class169.field2236;
                while (true) {
                    if (var12 >= var10) {
                        class30.field514.method269(class88.field1226[var8], var9, true, var8, (byte) -82);
                        break;
                    }
                    int var13 = class398.field5961 + var12 - class169.field2236;
                    for (int var14 = class120.field1614; var14 < var11; var14++) {
                        class19.field325[var12][var14] = false;
                        if (class337.field4974[var12][var14]) {
                            int var15 = class349.field5181 + var14 - class120.field1614;
                            for (int var16 = var8; var16 >= 0; var16--) {
                                if (class343.field5032[var16][var13][var15] != null && class343.field5032[var16][var13][var15].field116 == var8) {
                                    class19.field325[var12][var14] = class343.field5032[var16][var13][var15].field105;
                                    break;
                                }
                            }
                        }
                    }
                    var12++;
                }
            } else {
                class30.field514.method269(class88.field1226[var8], var9, false, var8, (byte) 93);
            }
            class30.field514.method271(127);
        }
        if (!class409.method2663(true)) {
            class409.method2663(false);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V", line = 1351)
    public static final void method703(int arg0, int arg1, byte arg2) {
        field1389++;
        int var3 = class272.field3986.method1029((byte) -83, class75.field1015);
        for (class259 var4 = (class259) class373.field5574.method2649(0); var4 != null; var4 = (class259) class373.field5574.method2656(0)) {
            int var8 = class342.method2259((byte) 118, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        if (arg2 != -121) {
            field1392 = null;
        }
        var3 += 8;
        int var5 = class10.field97 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class345.field5120 < (var3 + var6)) {
            var6 = class345.field5120 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class274.field4034 < (arg1 + var5)) {
            var7 = class274.field4034 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class394.field5912 = var6;
        class272.field3995 = var3;
        class229.field3230 = true;
        class200.field2861 = var7;
        class263.field3828 = class10.field97 * 16 + (class446.field6493 ? 26 : 22);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(Z)V", line = 1409)
    private final void method704(boolean arg0) {
        field1375++;
        long[] var2 = class381.field5719;
        this.field1387 = -1L;
        this.field1387 = var2[(int) (((long) (this.field1384 >> 8) ^ this.field1387) & 0xFFL)] ^ this.field1387 >>> 8;
        this.field1387 = this.field1387 >>> 8 ^ var2[(int) ((this.field1387 ^ (long) this.field1384) & 0xFFL)];
        int var3 = 0;
        if (!arg0) {
            this.field1390 = null;
        }
        while (var3 < 12) {
            this.field1387 = var2[(int) ((this.field1387 ^ (long) (this.field1380[var3] >> 24)) & 0xFFL)] ^ this.field1387 >>> 8;
            this.field1387 = this.field1387 >>> 8 ^ var2[(int) (((long) (this.field1380[var3] >> 16) ^ this.field1387) & 0xFFL)];
            this.field1387 = var2[(int) ((this.field1387 ^ (long) (this.field1380[var3] >> 8)) & 0xFFL)] ^ this.field1387 >>> 8;
            this.field1387 = this.field1387 >>> 8 ^ var2[(int) ((this.field1387 ^ (long) this.field1380[var3]) & 0xFFL)];
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1387 = this.field1387 >>> 8 ^ var2[(int) ((this.field1387 ^ (long) this.field1391[var4]) & 0xFFL)];
        }
        this.field1387 = this.field1387 >>> 8 ^ var2[(int) (((long) (this.field1379 ? 1 : 0) ^ this.field1387) & 0xFFL)];
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 1454)
    public static void method705(byte arg0) {
        int var1 = -17 % ((arg0 - 50) / 49);
        field1392 = null;
    }
}
