import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class172 {

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "Z")
    public static boolean field2706 = false;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    private int field2689;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public int field2693;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "J")
    private long field2708;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "J")
    private long field2713;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "Z")
    public boolean field2711;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
    private int[] field2690;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    public int[] field2697;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[[I")
    private int[][] field2694;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
    public final void method1226(byte arg0, int arg1, int arg2) {
        field2692++;
        int var4 = class150.field2215[arg1];
        if (this.field2690[var4] != 0 && arg0 == -100 && class94.method645((byte) -8, arg2) != null) {
            this.field2690[var4] = class243.method1723(arg2, Integer.MIN_VALUE);
            this.method1235(-312093808);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([II[IZII)V")
    public final void method1227(int[] arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        field2701++;
        if (this.field2689 != arg4) {
            this.field2689 = arg4;
            this.field2694 = null;
        }
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class3.field47; var8++) {
                    class260 var9 = class94.method645((byte) -8, var8);
                    if (var9 != null && !var9.field4228 && var9.field4239 == (arg3 ? class231.field3746[var7] : class270.field4401[var7])) {
                        arg0[class150.field2215[var7]] = class243.method1723(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field2690 = arg0;
        this.field2693 = arg5;
        if (arg1 == 16384) {
            this.field2697 = arg2;
            this.field2711 = arg3;
            this.method1235(-312093808);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIBZ)V")
    public static final void method1228(int arg0, int arg1, byte arg2, boolean arg3) {
        field2705++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class189.field2953 = arg3;
        class232.field3757 = arg1;
        class197.field3105 = arg0;
        if (arg2 >= -92) {
            field2706 = false;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIILqk;IIII)Lli;")
    public final class208 method1229(byte arg0, int arg1, int arg2, class57 arg3, int arg4, int arg5, int arg6, int arg7) {
        field2700++;
        long var9 = (long) arg5 << 32 | (long) (arg4 << 16) | (long) arg2;
        class208 var11 = (class208) class58.field857.method1517(var9, (byte) 97);
        if (var11 == null) {
            class141[] var12 = new class141[3];
            int var13 = 0;
            if (!class94.method645((byte) -8, arg2).method1832((byte) -35) || !class94.method645((byte) -8, arg4).method1832((byte) -35) || !class94.method645((byte) -8, arg5).method1832((byte) -35)) {
                return null;
            }
            class141 var14 = class94.method645((byte) -8, arg2).method1835(-1);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class141 var15 = class94.method645((byte) -8, arg4).method1835(-1);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class141 var16 = class94.method645((byte) -8, arg5).method1835(-1);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class141 var17 = new class141(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field2697[var18] < class291.field4685[var18].length) {
                    var17.method886(class16.field228[var18], class291.field4685[var18][this.field2697[var18]]);
                }
                if (this.field2697[var18] < class14.field208[var18].length) {
                    var17.method886(class299.field4771[var18], class14.field208[var18][this.field2697[var18]]);
                }
            }
            var11 = var17.method916(64, 768, -50, -10, -50);
            class58.field857.method1518(var11, var9, (byte) 75);
        }
        if (arg0 <= 31) {
            method1232((byte) 82);
        }
        if (arg3 != null) {
            var11 = arg3.method370(0, arg7, var11, arg6, arg1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)I")
    public final int method1230(boolean arg0) {
        if (!arg0) {
            method1234(false);
        }
        field2698++;
        return this.field2693 == -1 ? (this.field2690[8] << 10) + (this.field2690[11] << 5) + this.field2690[1] + (this.field2690[0] << 15) + (this.field2697[0] << 25) + (this.field2697[4] << 20) : class118.method780(this.field2693, -29837).field1944 + 305419896;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLvl;Lal;Lvl;Lvl;)Z")
    public static final boolean method1231(byte arg0, class73 arg1, class307 arg2, class73 arg3, class73 arg4) {
        class139.field1998 = arg4;
        field2703++;
        int var5 = -62 % ((2 - arg0) / 46);
        class179.field2810 = arg2;
        class126.field1812 = arg1;
        class114.field1669 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static final void method1232(byte arg0) {
        field2691++;
        class297.method2003(0);
        class264.method1851(-21571);
        class285.method1954((byte) 107);
        class121.method789(127);
        class73.method497(false);
        class142.method922((byte) -121);
        class125.method811(-20);
        class80.method542(120);
        class216.method1519(88);
        class130.method834(17938);
        class122.method791(true);
        class197.method1371(-2);
        class4.method26(17978);
        class276.method1905(4);
        class297.method2000(-90);
        class192.method1350(-25268);
        class36.method196(0);
        class106.method709(true);
        class287.method1962((byte) 120);
        if (class206.field3232 != 0) {
            for (int var1 = 0; var1 < class22.field285.length; var1++) {
                class22.field285[var1] = null;
            }
            class304.field4833 = 0;
        }
        class305.method2042(28623);
        class215.method1503(false);
        class266.method1855(0);
        class148.method1006(-4);
        class21.field272.method1511((byte) 118);
        ((class175) class221.field3464).method1247(65535);
        class255.field4156.method708(false);
        class297.field4740.method502(0);
        class17.field235.method502(0);
        class43.field525.method502(0);
        class49.field619.method502(0);
        int var2 = 49 / ((47 - arg0) / 46);
        class135.field1951.method502(0);
        class77.field1177.method502(0);
        class212.field3298.method502(0);
        class295.field4726.method502(0);
        class42.field515.method502(0);
        class245.field3998.method502(0);
        class186.field2927.method502(0);
        class122.field1748.method1511((byte) 92);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqk;IBII)Lli;")
    public final class208 method1233(class57 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2699++;
        if (arg2 < 106) {
            method1231((byte) -93, (class73) null, (class307) null, (class73) null, (class73) null);
        }
        if (this.field2693 != -1) {
            return class118.method780(this.field2693, -29837).method847(arg1, arg0, (byte) 119, arg3, arg4);
        }
        class208 var6 = (class208) class58.field857.method1517(this.field2708, (byte) -126);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field2690[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class94.method645((byte) -8, var17 & 0x3FFFFFFF).method1832((byte) -35)) {
                        var7 = true;
                    }
                } else if (!class104.method696((byte) -26, var17 & 0x3FFFFFFF).method1118((byte) 116, this.field2711)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class141[] var9 = new class141[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field2690[var11];
                if ((var14 & 0x40000000) != 0) {
                    class141 var15 = class104.method696((byte) -26, var14 & 0x3FFFFFFF).method1105(-124, this.field2711);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((var14 & Integer.MIN_VALUE) != 0) {
                    class141 var16 = class94.method645((byte) -8, var14 & 0x3FFFFFFF).method1835(-1);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class141 var12 = new class141(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field2697[var13] < class291.field4685[var13].length) {
                    var12.method886(class16.field228[var13], class291.field4685[var13][this.field2697[var13]]);
                }
                if (this.field2697[var13] < class14.field208[var13].length) {
                    var12.method886(class299.field4771[var13], class14.field208[var13][this.field2697[var13]]);
                }
            }
            var6 = var12.method916(64, 768, -50, -10, -50);
            class58.field857.method1518(var6, this.field2708, (byte) 75);
        }
        if (arg0 != null) {
            var6 = arg0.method370(0, arg1, var6, arg4, arg3);
        }
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Z)V")
    public static final void method1234(boolean arg0) {
        if (!arg0) {
            return;
        }
        for (int var1 = 0; var1 < class29.field358; var1++) {
            class147 var2 = class118.method775(29142, var1);
            if (var2 != null && var2.field2185 == 0) {
                class110.field1596[var1] = 0;
                class299.field4770[var1] = 0;
            }
        }
        class7.field98 = new class153(16);
        field2709++;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    private final void method1235(int arg0) {
        field2710++;
        long var2 = this.field2708;
        this.field2708 = -1L;
        long[] var4 = class288.field4652;
        this.field2708 = var4[(int) ((this.field2708 ^ (long) (this.field2689 >> 8)) & 0xFFL)] ^ this.field2708 >>> 8;
        if (arg0 != -312093808) {
            method1231((byte) -67, (class73) null, (class307) null, (class73) null, (class73) null);
        }
        this.field2708 = var4[(int) ((this.field2708 ^ (long) this.field2689) & 0xFFL)] ^ this.field2708 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field2708 = var4[(int) (((long) (this.field2690[var5] >> 24) ^ this.field2708) & 0xFFL)] ^ this.field2708 >>> 8;
            this.field2708 = var4[(int) (((long) (this.field2690[var5] >> 16) ^ this.field2708) & 0xFFL)] ^ this.field2708 >>> 8;
            this.field2708 = var4[(int) (((long) (this.field2690[var5] >> 8) ^ this.field2708) & 0xFFL)] ^ this.field2708 >>> 8;
            this.field2708 = var4[(int) ((this.field2708 ^ (long) this.field2690[var5]) & 0xFFL)] ^ this.field2708 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2708 = this.field2708 >>> 8 ^ var4[(int) (((long) this.field2697[var6] ^ this.field2708) & 0xFFL)];
        }
        this.field2708 = var4[(int) (((long) (this.field2711 ? 1 : 0) ^ this.field2708) & 0xFFL)] ^ this.field2708 >>> 8;
        if (var2 != 0L && this.field2708 != var2) {
            class49.field626.method1516(var2, 12);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method1236(int arg0, boolean arg1) {
        field2695++;
        this.field2711 = arg1;
        if (arg0 > -18) {
            this.field2713 = -27L;
        }
        this.method1235(-312093808);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1237(int arg0, int arg1, int arg2, String[] arg3) {
        field2707++;
        if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg2;
            int var6 = 0;
            int var7 = arg2;
            if (arg0 != 28851) {
                method1232((byte) 40);
            }
            while (var5 > var7) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
                var7++;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqk;ZIIBIIZ[Ll;ILqk;I)Lli;")
    public final class208 method1238(class57 arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, boolean arg7, class282[] arg8, int arg9, class57 arg10, int arg11) {
        field2702++;
        if (this.field2693 != -1) {
            return class118.method780(this.field2693, -29837).method856(arg0, -21024, arg9, arg3, arg5, arg6, arg2, arg8, arg11, arg10);
        }
        long var13 = this.field2708;
        int[] var15 = this.field2690;
        if (arg10 != null && (arg10.field847 >= 0 || arg10.field836 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field2690[var16];
            }
            if (arg10.field847 >= 0) {
                if (arg10.field847 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class243.method1723(1073741824, arg10.field847);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg10.field836 >= 0) {
                if (arg10.field836 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var15[3] = 0;
                } else {
                    var15[3] = class243.method1723(arg10.field836, 1073741824);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class208 var17 = (class208) class49.field626.method1517(var13, (byte) -118);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((var44 & Integer.MIN_VALUE) != 0 && !class94.method645((byte) -8, var44 & 0x3FFFFFFF).method1838(-73)) {
                        var18 = true;
                    }
                } else if (!class104.method696((byte) -26, var44 & 0x3FFFFFFF).method1111(this.field2711, -50)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field2713 != -1L) {
                    var17 = (class208) class49.field626.method1517(this.field2713, (byte) -126);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class141[] var20 = new class141[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class141 var42 = class104.method696((byte) -26, var41 & 0x3FFFFFFF).method1112(this.field2711, (byte) 122);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var41) != 0) {
                        class141 var43 = class94.method645((byte) -8, var41 & 0x3FFFFFFF).method1836(-27604);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    }
                }
                class163 var22 = null;
                if (this.field2689 != -1) {
                    var22 = class170.method1169(this.field2689, (byte) -70);
                }
                if (var22 != null && var22.field2500 != null) {
                    for (int var23 = 0; var23 < var22.field2500.length; var23++) {
                        if (var22.field2500[var23] != null && var20[var23] != null) {
                            int var24 = var22.field2500[var23][1];
                            int var25 = var22.field2500[var23][0];
                            int var26 = var22.field2500[var23][3];
                            int var27 = var22.field2500[var23][5];
                            int var28 = var22.field2500[var23][4];
                            int var29 = var22.field2500[var23][2];
                            if (this.field2694 == null) {
                                this.field2694 = new int[var22.field2500.length][];
                            }
                            if (this.field2694[var23] == null) {
                                int[] var30 = this.field2694[var23] = new int[15];
                                if (var26 == 0 && var28 == 0 && var27 == 0) {
                                    var30[12] = -var25;
                                    var30[13] = -var24;
                                    var30[0] = var30[4] = var30[8] = 32768;
                                    var30[14] = -var29;
                                } else {
                                    int var31 = class221.field3465[var26] >> 1;
                                    int var32 = class221.field3468[var28] >> 1;
                                    int var33 = class221.field3468[var26] >> 1;
                                    int var34 = class221.field3465[var28] >> 1;
                                    int var35 = class221.field3465[var27] >> 1;
                                    int var36 = class221.field3468[var27] >> 1;
                                    var30[4] = var31 * var35 + 16384 >> 15;
                                    int var37 = var33 * var36 + 16384 >> 15;
                                    var30[8] = var31 * var34 + 16384 >> 15;
                                    var30[5] = -var33;
                                    int var38 = var33 * var35 + 16384 >> 15;
                                    var30[7] = -var32 * -var36 + var34 * var38 + 16384 >> 15;
                                    var30[2] = var31 * var32 + 16384 >> 15;
                                    var30[3] = var31 * var36 + 16384 >> 15;
                                    var30[6] = -var32 * var35 + var34 * var37 + 16384 >> 15;
                                    var30[1] = -var36 * var34 + var32 * var38 + 16384 >> 15;
                                    var30[13] = var30[7] * -var29 + var30[1] * -var25 + var30[4] * -var24 + 16384 >> 15;
                                    var30[0] = var32 * var37 + var34 * var35 + 16384 >> 15;
                                    var30[14] = var30[5] * -var24 + var30[8] * -var29 + var30[2] * -var25 + 16384 >> 15;
                                    var30[12] = var30[0] * -var25 + var30[6] * -var29 + var30[3] * -var24 + 16384 >> 15;
                                }
                                var30[10] = var24;
                                var30[9] = var25;
                                var30[11] = var29;
                            }
                            if (var26 != 0 || var28 != 0 || var27 != 0) {
                                var20[var23].method901(var26, var28, var27);
                            }
                            if (var25 != 0 || var24 != 0 || var29 != 0) {
                                var20[var23].method904(var25, var24, var29);
                            }
                        }
                    }
                }
                class141 var39 = new class141(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (class291.field4685[var40].length > this.field2697[var40]) {
                        var39.method886(class16.field228[var40], class291.field4685[var40][this.field2697[var40]]);
                    }
                    if (class14.field208[var40].length > this.field2697[var40]) {
                        var39.method886(class299.field4771[var40], class14.field208[var40][this.field2697[var40]]);
                    }
                }
                var17 = var39.method916(64, 850, -30, -50, -30);
                if (arg7) {
                    class49.field626.method1518(var17, var13, (byte) 75);
                    this.field2713 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg8 == null ? 0 : arg8.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg8[var50] != null) {
                class57 var73 = class174.method1241(24, arg8[var50].field4586);
                if (var73.field850 != null) {
                    var45 = true;
                    class106.field1544[var50] = var73;
                    int var74 = arg8[var50].field4584;
                    int var75 = arg8[var50].field4589;
                    int var76 = var73.field850[var75];
                    class62.field901[var50] = class22.method120((byte) -51, var76 >>> 16);
                    int var77 = var76 & 0xFFFF;
                    class122.field1754[var50] = var77;
                    if (class62.field901[var50] != null) {
                        var47 |= class62.field901[var50].method130(1988062305, var77);
                        var46 |= class62.field901[var50].method128(0, var77);
                        var48 |= var73.field829;
                    }
                    if ((var73.field826 || class229.field3538) && var74 != -1 && var74 < var73.field850.length) {
                        class217.field3391[var50] = var73.field828[var75];
                        class96.field1442[var50] = arg8[var50].field4588;
                        int var78 = var73.field850[var74];
                        class232.field3756[var50] = class22.method120((byte) -51, var78 >>> 16);
                        int var79 = var78 & 0xFFFF;
                        class86.field1314[var50] = var79;
                        if (class232.field3756[var50] != null) {
                            var47 |= class232.field3756[var50].method130(1988062305, var79);
                            var46 |= class232.field3756[var50].method128(0, var79);
                        }
                    } else {
                        class217.field3391[var50] = 0;
                        class96.field1442[var50] = 0;
                        class232.field3756[var50] = null;
                        class86.field1314[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg10 != null || arg0 != null) {
            int var51 = -1;
            int var52 = 0;
            int var53 = -1;
            class24 var54 = null;
            class24 var55 = null;
            if (arg10 != null) {
                int var56 = arg10.field850[arg9];
                int var57 = var56 >>> 16;
                var51 = var56 & 0xFFFF;
                var54 = class22.method120((byte) -51, var57);
                if (var54 != null) {
                    var47 |= var54.method130(1988062305, var51);
                    var46 |= var54.method128(0, var51);
                    var48 |= arg10.field829;
                }
                if ((arg10.field826 || class229.field3538) && arg6 != -1 && arg10.field850.length > arg6) {
                    int var58 = arg10.field850[arg6];
                    int var59 = var58 >>> 16;
                    var53 = var58 & 0xFFFF;
                    var52 = arg10.field828[arg9];
                    if (var57 == var59) {
                        var55 = var54;
                    } else {
                        var55 = class22.method120((byte) -51, var53 >>> 16);
                    }
                    if (var55 != null) {
                        var47 |= var55.method130(1988062305, var53);
                        var46 |= var55.method128(0, var53);
                    }
                }
            }
            int var60 = -1;
            int var61 = -1;
            int var62 = 0;
            if (arg4 < 51) {
                this.method1233((class57) null, 12, (byte) 47, -98, -123);
            }
            class24 var63 = null;
            class24 var64 = null;
            if (arg0 != null) {
                int var65 = arg0.field850[arg11];
                int var66 = var65 >>> 16;
                var60 = var65 & 0xFFFF;
                var64 = class22.method120((byte) -51, var66);
                if (var64 != null) {
                    var47 |= var64.method130(1988062305, var60);
                    var46 |= var64.method128(0, var60);
                    var48 |= arg0.field829;
                }
                if ((arg0.field826 || class229.field3538) && arg3 != -1 && arg0.field850.length > arg3) {
                    var62 = arg0.field828[arg11];
                    int var67 = arg0.field850[arg3];
                    int var68 = var67 >>> 16;
                    var61 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var63 = var64;
                    } else {
                        var63 = class22.method120((byte) -51, var61 >>> 16);
                    }
                    if (var63 != null) {
                        var47 |= var63.method130(1988062305, var61);
                        var46 |= var63.method128(0, var61);
                    }
                }
            }
            class208 var69 = var17.method330(!var46, !var47, !var48);
            int var70 = 0;
            int var71 = 1;
            while (var49 > var70) {
                if (class62.field901[var70] != null) {
                    var69.method1445(class62.field901[var70], class122.field1754[var70], class232.field3756[var70], class86.field1314[var70], class96.field1442[var70] - 1, class217.field3391[var70], var71, class106.field1544[var70].field829, this.field2694[var70]);
                }
                var71 <<= 0x1;
                var70++;
            }
            if (var54 != null && var64 != null) {
                var69.method1449(var54, var51, var55, var53, arg2 - 1, var52, var64, var60, var63, var61, arg5 - 1, var62, arg10.field825, arg0.field829 | arg10.field829);
            } else if (var54 != null) {
                var69.method1443(var54, var51, var55, var53, arg2 - 1, var52, arg10.field829);
            } else if (var64 != null) {
                var69.method1443(var64, var60, var63, var61, arg5 - 1, var62, arg0.field829);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class62.field901[var72] = null;
                class232.field3756[var72] = null;
                class106.field1544[var72] = null;
            }
            return var69;
        } else if (arg1) {
            return var17.method330(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public final void method1239(int arg0, int arg1, int arg2) {
        this.field2697[arg0] = arg2;
        this.method1235(-312093808);
        if (arg1 != 1791) {
            this.field2711 = false;
        }
        field2704++;
    }
}
