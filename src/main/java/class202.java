import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class202 {

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public int field2731 = -1;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field2734 = 0;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "Lh;")
    public static class434 field2737 = new class434(23, 8);

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Lmc;")
    public static class78 field2742 = new class78(40, 7);

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "J")
    private long field2729;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "J")
    private long field2743;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Z")
    public boolean field2725;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "[I")
    private int[] field2732;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "[I")
    public int[] field2740;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "[[I")
    private int[][] field2726;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "([I[IZIIZ)V", line = 6)
    public final void method1145(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        this.field2725 = arg2;
        if (this.field2738 != arg4) {
            this.field2738 = arg4;
            this.field2726 = null;
        }
        field2727++;
        this.field2732 = arg1;
        this.field2740 = arg0;
        if (arg5) {
            this.field2731 = arg3;
            this.method1154(false);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Le;III)V", line = 29)
    public final void method1146(class341 arg0, int arg1, int arg2, int arg3) {
        field2723++;
        int var5 = class251.field3342[arg1];
        if (this.field2732[var5] != 0 && arg0.method1934(arg3, (byte) 123) != null) {
            int var6 = 50 % ((arg2 + 49) / 58);
            this.field2732[var5] = class21.method133(Integer.MIN_VALUE, arg3);
            this.method1154(false);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 52)
    public static void method1147(byte arg0) {
        field2737 = null;
        if (arg0 == -122) {
            field2742 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V", line = 65)
    public final void method1148(boolean arg0, int arg1) {
        field2724++;
        this.field2725 = arg0;
        if (arg1 != 1502081775) {
            this.method1152(97, -71, -58);
        }
        this.method1154(false);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILgp;Lwl;ZIILnb;Lta;Le;Lwm;ILio;)Lgn;", line = 81)
    public final class456 method1149(int arg0, class35 arg1, class258 arg2, boolean arg3, int arg4, int arg5, class181 arg6, class128 arg7, class341 arg8, class364 arg9, int arg10, class277 arg11) {
        field2730++;
        if (this.field2731 != -1) {
            return arg7.method782(this.field2731, 1).method2526(arg5, arg10, arg4, arg0, arg9, arg6, arg3, arg2, arg1);
        }
        int var13 = arg4;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            int var20 = arg6.field2468[arg0];
            var13 = arg4 | 0x20;
            Object var21 = null;
            int var22 = var20 >>> 16;
            int var23 = var20 & 0xFFFF;
            class134 var24 = arg1.method263(-16777216, var22);
            if (var24 != null) {
                var15 |= var24.method816(255, var23);
                var14 |= var24.method814(var23, (byte) 67);
                var16 |= arg6.field2487;
            }
            if ((arg6.field2490 || class293.field3917) && arg10 != -1 && arg10 < arg6.field2468.length) {
                int var25 = arg6.field2468[arg10];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class134 var28 = var22 == var26 ? var24 : arg1.method263(-16777216, var26);
                if (var28 != null) {
                    var15 |= var28.method816(255, var27);
                    var14 |= var28.method814(var27, (byte) 119);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
        }
        class76 var29 = class26.field324;
        class456 var30;
        synchronized (class26.field324) {
            var30 = (class456) class26.field324.method493((byte) 19, this.field2743);
        }
        if (var30 == null || arg9.method2103(var30.method1863(), var13) != 0) {
            if (var30 != null) {
                var13 = arg9.method1979(var13, var30.method1863());
            }
            boolean var32 = false;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field2732[var33];
                if ((var34 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var34) != 0 && !arg8.method1934(var34 & 0x3FFFFFFF, (byte) 116).method2713((byte) 92)) {
                        var32 = true;
                    }
                } else if (!arg11.method1557(var34 & 0x3FFFFFFF, 21992).method2600((byte) -94, this.field2725)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class284[] var35 = new class284[12];
            int var36 = 0;
            for (int var37 = 0; var37 < 12; var37++) {
                int var38 = this.field2732[var37];
                if ((var38 & 0x40000000) != 0) {
                    class284 var39 = arg11.method1557(var38 & 0x3FFFFFFF, 21992).method2595(-1, this.field2725);
                    if (var39 != null) {
                        var35[var36++] = var39;
                    }
                } else if ((Integer.MIN_VALUE & var38) != 0) {
                    class284 var40 = arg8.method1934(var38 & 0x3FFFFFFF, (byte) 116).method2718(true);
                    if (var40 != null) {
                        var35[var36++] = var40;
                    }
                }
            }
            class284 var41 = new class284(var35, var36);
            int var42 = var13 | 0x2000;
            var30 = arg9.method2094(var41, var42, class487.field6779, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (this.field2740[var43] < class138.field2004[var43].length) {
                    var30.method1872(class188.field2577[var43], class138.field2004[var43][this.field2740[var43]]);
                }
                if (class312.field4111[var43].length > this.field2740[var43]) {
                    var30.method1872(class419.field5689[var43], class312.field4111[var43][this.field2740[var43]]);
                }
            }
            var30.method1841(var13);
            class76 var44 = class26.field324;
            synchronized (class26.field324) {
                class26.field324.method505(this.field2743, var30, 25);
            }
        }
        if (arg6 == null) {
            return var30;
        } else {
            var30.method1893((byte) 4, var13, true);
            return arg6.method1058(var30, arg0, arg3, arg4, arg5, arg10);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IILe;ILnb;IIILgp;Lwm;II)Lgn;", line = 270)
    public final class456 method1150(int arg0, int arg1, class341 arg2, int arg3, class181 arg4, int arg5, int arg6, int arg7, class35 arg8, class364 arg9, int arg10, int arg11) {
        field2739++;
        int var13 = arg5;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            Object var20 = null;
            var13 = arg5 | 0x20;
            int var21 = arg4.field2468[arg10];
            int var22 = var21 >>> 16;
            int var23 = var21 & 0xFFFF;
            class134 var24 = arg8.method263(-16777216, var22);
            if (var24 != null) {
                var15 |= var24.method816(255, var23);
                var14 |= var24.method814(var23, (byte) 122);
                var16 |= arg4.field2487;
            }
            if ((arg4.field2490 || class293.field3917) && arg6 != -1 && arg4.field2468.length > arg6) {
                int var25 = arg4.field2468[arg6];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class134 var28;
                if (var22 == var26) {
                    var28 = var24;
                } else {
                    var28 = arg8.method263(arg3 - 16761148, var27 >>> 16);
                }
                if (var28 != null) {
                    var15 |= var28.method816(arg3 ^ 0xFFFFC1C3, var27);
                    var14 |= var28.method814(var27, (byte) 106);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
        }
        long var29 = (long) (arg1 << 16) | (long) arg0 << 32 | (long) arg7;
        class76 var31 = class26.field324;
        class456 var32;
        synchronized (class26.field324) {
            var32 = (class456) class26.field324.method493((byte) 19, var29);
        }
        if (var32 == null || arg9.method2103(var32.method1863(), var13) != 0) {
            if (var32 != null) {
                var13 = arg9.method1979(var13, var32.method1863());
            }
            class284[] var34 = new class284[3];
            int var35 = 0;
            if (!arg2.method1934(arg7, (byte) 96).method2713((byte) 92) || !arg2.method1934(arg1, (byte) 105).method2713((byte) 92) || !arg2.method1934(arg0, (byte) 94).method2713((byte) 92)) {
                return null;
            }
            class284 var36 = arg2.method1934(arg7, (byte) 112).method2718(true);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class284 var37 = arg2.method1934(arg1, (byte) 98).method2718(true);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class284 var38 = arg2.method1934(arg0, (byte) 110).method2718(true);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            class284 var39 = new class284(var34, var35);
            int var40 = var13 | 0x2000;
            var32 = arg9.method2094(var39, var40, class487.field6779, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (class138.field2004[var41].length > this.field2740[var41]) {
                    var32.method1872(class188.field2577[var41], class138.field2004[var41][this.field2740[var41]]);
                }
                if (class312.field4111[var41].length > this.field2740[var41]) {
                    var32.method1872(class419.field5689[var41], class312.field4111[var41][this.field2740[var41]]);
                }
            }
            var32.method1841(var13);
            class76 var42 = class26.field324;
            synchronized (class26.field324) {
                class26.field324.method505(var29, var32, 24);
            }
        }
        if (arg4 == null) {
            return var32;
        }
        if (arg3 != -16068) {
            this.field2731 = -15;
        }
        class456 var43 = var32.method1893((byte) 4, var13, true);
        return arg4.method1058(var43, arg10, true, arg5, arg11, arg6);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZBI)V", line = 413)
    public static final void method1151(boolean arg0, byte arg1, int arg2) {
        field2728++;
        class257 var3 = class80.method525(arg0, -7967, arg2);
        if (var3 != null) {
            if (arg1 != 85) {
                method1153(false);
            }
            var3.method2614((byte) -112);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 430)
    public final void method1152(int arg0, int arg1, int arg2) {
        this.field2740[arg1] = arg2;
        if (arg0 != 10) {
            this.field2738 = -126;
        }
        field2741++;
        this.method1154(false);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)[Lh;", line = 443)
    public static final class434[] method1153(boolean arg0) {
        field2735++;
        return arg0 ? null : new class434[] { class120.field1767, class51.field667, class120.field1748, class111.field1687, class304.field4044, class112.field1703, class186.field2559, class91.field1345, class383.field5276, class429.field5834, class205.field2771, class163.field2266, class33.field504, class244.field3243, class99.field1444, class107.field1602, class473.field6527, class243.field3241, class52.field698, class294.field3932, class364.field5003, class178.field2415, class192.field2605, field2737, class300.field4011, class460.field6231, class186.field2555, class432.field5883, class357.field4925, class369.field5061, class298.field3993, class107.field1609, class405.field5567, class31.field420, class419.field5681, class136.field1980, class2.field30, class127.field1857, class6.field78, class88.field1229, class387.field5356, class106.field1594, class148.field2109, class69.field944, class448.field6090, class119.field1739, class91.field1342, class384.field5312, class341.field4567, class480.field6639, class89.field1308, class392.field5434, class480.field6640, class9.field123, class236.field3122, class323.field4309, class136.field1975, class267.field3534, class188.field2574, class196.field2666, class302.field4022, class338.field4548, class451.field6134, class288.field3883, class86.field1187, class322.field4290, class215.field2899, class247.field3297, class390.field5411, class104.field1516, class192.field2606, class299.field4002, class460.field6233, class199.field2690, class447.field6085, class385.field5337, class239.field3184, class90.field1314, class120.field1765, class162.field2255, class354.field4906, class78.field1052, class261.field3457, class490.field6828, class84.field1105, class455.field6171, class162.field2263, class277.field3671, class473.field6521, class31.field410, class445.field6049, class181.field2493, class475.field6541, class171.field2352, class46.field632, class212.field2852, class321.field4262, class150.field2117, class63.field834, class460.field6227, class411.field5633, class342.field4583, class191.field2603, class327.field4363, class138.field2005, class395.field5471 };
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 454)
    private final void method1154(boolean arg0) {
        field2733++;
        long[] var2 = class268.field3579;
        if (arg0) {
            return;
        }
        this.field2743 = -1L;
        this.field2743 = var2[(int) ((this.field2743 ^ (long) (this.field2738 >> 8)) & 0xFFL)] ^ this.field2743 >>> 8;
        this.field2743 = var2[(int) (((long) this.field2738 ^ this.field2743) & 0xFFL)] ^ this.field2743 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2743 = this.field2743 >>> 8 ^ var2[(int) ((this.field2743 ^ (long) (this.field2732[var3] >> 24)) & 0xFFL)];
            this.field2743 = var2[(int) (((long) (this.field2732[var3] >> 16) ^ this.field2743) & 0xFFL)] ^ this.field2743 >>> 8;
            this.field2743 = var2[(int) (((long) (this.field2732[var3] >> 8) ^ this.field2743) & 0xFFL)] ^ this.field2743 >>> 8;
            this.field2743 = var2[(int) ((this.field2743 ^ (long) this.field2732[var3]) & 0xFFL)] ^ this.field2743 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2743 = var2[(int) (((long) this.field2740[var4] ^ this.field2743) & 0xFFL)] ^ this.field2743 >>> 8;
        }
        this.field2743 = this.field2743 >>> 8 ^ var2[(int) (((long) (this.field2725 ? 1 : 0) ^ this.field2743) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(III)Lda;", line = 494)
    public static final class41 method1155(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class41 var4 = var3.field6855;
            var3.field6855 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZLak;Lgp;Le;Lnb;IIIIZILnb;Lwl;Lio;Lwm;Lta;[Lbg;I)Lgn;", line = 505)
    public final class456 method1156(int arg0, boolean arg1, class212 arg2, class35 arg3, class341 arg4, class181 arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, class181 arg12, class258 arg13, class277 arg14, class364 arg15, class128 arg16, class298[] arg17, int arg18) {
        field2722++;
        if (this.field2731 != -1) {
            return arg16.method782(this.field2731, 1).method2524(arg2, arg18, arg5, arg15, arg3, arg7, arg11, arg9, arg12, arg8, arg17, arg0, (byte) 127, arg13, arg6);
        }
        int var20 = arg8;
        long var21 = this.field2743;
        int[] var23 = this.field2732;
        if (arg5 != null && (arg5.field2479 >= 0 || arg5.field2488 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2732[var24];
            }
            if (arg5.field2479 >= 0) {
                if (arg5.field2479 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class21.method133(1073741824, arg5.field2479);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg5.field2488 >= 0) {
                if (arg5.field2488 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class21.method133(arg5.field2488, 1073741824);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg5 != null || arg12 != null;
        int var28 = arg17 == null ? 0 : arg17.length;
        for (int var29 = 0; var29 < var28; var29++) {
            class297.field3982[var29] = null;
            if (arg17[var29] != null) {
                class181 var30 = arg3.method266(16107, arg17[var29].field3987);
                if (var30.field2468 != null) {
                    class70.field969[var29] = var30;
                    var27 = true;
                    int var31 = arg17[var29].field3991;
                    int var32 = arg17[var29].field3990;
                    int var33 = var30.field2468[var31];
                    class297.field3982[var29] = arg3.method263(-16777216, var33 >>> 16);
                    int var34 = var33 & 0xFFFF;
                    class354.field4901[var29] = var34;
                    if (class297.field3982[var29] != null) {
                        var26 |= class297.field3982[var29].method816(255, var34);
                        var25 |= class297.field3982[var29].method814(var34, (byte) 96);
                    }
                    if ((var30.field2490 || class293.field3917) && var32 != -1 && var30.field2468.length > var32) {
                        class63.field843[var29] = var30.field2466[var31];
                        class250.field3334[var29] = arg17[var29].field3988;
                        int var35 = var30.field2468[var32];
                        class299.field4005[var29] = arg3.method263(-16777216, var35 >>> 16);
                        int var36 = var35 & 0xFFFF;
                        class410.field5615[var29] = var36;
                        if (class299.field4005[var29] != null) {
                            var26 |= class299.field4005[var29].method816(255, var36);
                            var25 |= class299.field4005[var29].method814(var36, (byte) 89);
                        }
                    } else {
                        class63.field843[var29] = 0;
                        class250.field3334[var29] = 0;
                        class299.field4005[var29] = null;
                        class410.field5615[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class134 var40 = null;
        class134 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class134 var45 = null;
        class134 var46 = null;
        if (var27) {
            if (arg5 != null) {
                int var47 = arg5.field2468[arg18];
                int var48 = var47 >>> 16;
                var37 = var47 & 0xFFFF;
                var40 = arg3.method263(-16777216, var48);
                if (var40 != null) {
                    var26 |= var40.method816(255, var37);
                    var25 |= var40.method814(var37, (byte) 24);
                }
                if ((arg5.field2490 || class293.field3917) && arg6 != -1 && arg6 < arg5.field2468.length) {
                    var39 = arg5.field2466[arg18];
                    int var49 = arg5.field2468[arg6];
                    int var50 = var49 >>> 16;
                    var41 = var48 == var50 ? var40 : arg3.method263(-16777216, var50);
                    var38 = var49 & 0xFFFF;
                    if (var41 != null) {
                        var26 |= var41.method816(255, var38);
                        var25 |= var41.method814(var38, (byte) 11);
                    }
                }
            }
            var20 = arg8 | 0x20;
            if (arg12 != null) {
                int var51 = arg12.field2468[arg11];
                int var52 = var51 >>> 16;
                var45 = arg3.method263(-16777216, var52);
                var42 = var51 & 0xFFFF;
                if (var45 != null) {
                    var26 |= var45.method816(255, var42);
                    var25 |= var45.method814(var42, (byte) 44);
                }
                if ((arg12.field2490 || class293.field3917) && arg9 != -1 && arg12.field2468.length > arg9) {
                    var44 = arg12.field2466[arg11];
                    int var53 = arg12.field2468[arg9];
                    int var54 = var53 >>> 16;
                    var43 = var53 & 0xFFFF;
                    var46 = var52 == var54 ? var45 : arg3.method263(-16777216, var54);
                    if (var46 != null) {
                        var26 |= var46.method816(255, var43);
                        var25 |= var46.method814(var43, (byte) 84);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
        }
        class76 var55 = class142.field2052;
        class456 var56;
        synchronized (class142.field2052) {
            var56 = (class456) class142.field2052.method493((byte) 19, var21);
        }
        class280 var57 = null;
        if (this.field2738 != -1) {
            var57 = arg2.method1203(this.field2738, 90);
        }
        if (var56 == null || arg15.method2103(var56.method1863(), var20) != 0 || var57 != null && var57.field3732 != null && this.field2726 == null) {
            if (var56 != null) {
                var20 = arg15.method1979(var20, var56.method1863());
            }
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 12) {
                    if (var59) {
                        if (this.field2729 != -1L) {
                            class76 var62 = class142.field2052;
                            synchronized (class142.field2052) {
                                var56 = (class456) class142.field2052.method493((byte) 19, this.field2729);
                            }
                        }
                        if (var56 == null || arg15.method2103(var56.method1863(), var20) != 0 || var57 != null && var57.field3732 != null && this.field2726 == null) {
                            return null;
                        }
                    } else {
                        class284[] var63 = new class284[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class284 var67 = arg14.method1557(var65 & 0x3FFFFFFF, 21992).method2596((byte) -123, this.field2725);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class284 var66 = arg4.method1934(var65 & 0x3FFFFFFF, (byte) 91).method2720(-115);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var57 != null && var57.field3732 != null) {
                            for (int var68 = 0; var68 < var57.field3732.length; var68++) {
                                if (var57.field3732[var68] != null && var63[var68] != null) {
                                    int var69 = var57.field3732[var68][0];
                                    int var70 = var57.field3732[var68][1];
                                    int var71 = var57.field3732[var68][2];
                                    int var72 = var57.field3732[var68][3] << 3;
                                    int var73 = var57.field3732[var68][4] << 3;
                                    int var74 = var57.field3732[var68][5] << 3;
                                    if (this.field2726 == null) {
                                        this.field2726 = new int[var57.field3732.length][];
                                    }
                                    if (this.field2726[var68] == null) {
                                        int[] var75 = this.field2726[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[13] = -var70;
                                            var75[12] = -var69;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                            var75[14] = -var71;
                                        } else {
                                            int var76 = class364.field4992[var72];
                                            int var77 = class364.field4994[var72];
                                            int var78 = class364.field4992[var73];
                                            int var79 = class364.field4994[var73];
                                            int var80 = class364.field4992[var74];
                                            int var81 = class364.field4994[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[0] = var79 * var83 + var78 * var80 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[7] = -var79 * -var81 + (var78 * var82) + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[14] = var75[8] * -var71 + (var75[2] * -var69 + (var75[5] * -var70) + 16384) >> 15;
                                            var75[12] = var75[6] * -var71 + var75[0] * -var69 + var75[3] * -var70 + 16384 >> 15;
                                            var75[13] = var75[7] * -var71 + var75[1] * -var69 + var75[4] * -var70 + 16384 >> 15;
                                        }
                                        var75[11] = var71;
                                        var75[9] = var69;
                                        var75[10] = var70;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method1612(var73, var74, var72, 64);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method1604(var69, var71, 115, var70);
                                    }
                                }
                            }
                        }
                        class284 var84 = new class284(var63, var63.length);
                        int var85 = var20 | 0x2000;
                        var56 = arg15.method2094(var84, var85, class487.field6779, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (this.field2740[var86] < class138.field2004[var86].length) {
                                var56.method1872(class188.field2577[var86], class138.field2004[var86][this.field2740[var86]]);
                            }
                            if (class312.field4111[var86].length > this.field2740[var86]) {
                                var56.method1872(class419.field5689[var86], class312.field4111[var86][this.field2740[var86]]);
                            }
                        }
                        if (arg10) {
                            var56.method1841(var20);
                            class76 var87 = class142.field2052;
                            synchronized (class142.field2052) {
                                class142.field2052.method505(var21, var56, 22);
                            }
                            this.field2729 = var21;
                        }
                    }
                    break;
                }
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((var61 & Integer.MIN_VALUE) != 0 && !arg4.method1934(var61 & 0x3FFFFFFF, (byte) 98).method2715(true)) {
                        var59 = true;
                    }
                } else if (!arg14.method1557(var61 & 0x3FFFFFFF, 21992).method2587((byte) -102, this.field2725)) {
                    var59 = true;
                }
                var60++;
            }
        }
        class456 var88 = var56.method1893((byte) 4, var20, arg1);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var89 < var28) {
            if (class297.field3982[var89] != null) {
                var88.method2679(class63.field843[var89], class250.field3334[var89] - 1, class299.field4005[var89], 0, var90, class354.field4901[var89], class410.field5615[var89], class297.field3982[var89], false, !arg1, this.field2726 == null ? null : this.field2726[var89]);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var40 != null && var45 != null) {
            var88.method2677(var39, arg0 - 1, arg5.field2465, arg7 - 1, false, var42, var43, var38, var45, var41, var44, var46, var40, -92, var37);
        } else if (var40 != null) {
            var88.method2680(var39, var41, var38, (byte) 88, false, arg0 - 1, var37, var40, 0);
        } else if (var45 != null) {
            var88.method2680(var44, var46, var43, (byte) 76, false, arg7 - 1, var42, var45, 0);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class297.field3982[var91] = null;
            class299.field4005[var91] = null;
            class70.field969[var91] = null;
        }
        return var88;
    }
}
