import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class140 {

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    private int field2237 = 0;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "I")
    private int field2252 = -1;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "Luj;")
    private class156 field2249 = new class156();

    @OriginalMember(owner = "client!dk", name = "y", descriptor = "Z")
    public boolean field2260 = false;

    @OriginalMember(owner = "client!dk", name = "w", descriptor = "I")
    private int field2258;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "[Le;")
    private class94[] field2246;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    private int field2241;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "[[I")
    private int[][] field2236;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lck;")
    public static class119 field2242 = class298.method1987((byte) 100, ":tradereq:");

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field2253 = 0;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "Lck;")
    public static class119 field2255 = class298.method1987((byte) 53, "rot:");

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!dk", name = "u", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dk", name = "x", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[Lea;")
    public static class72[] field2238;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[Lmd;")
    public static class88[] field2245;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 9)
    public static void method919(int arg0) {
        field2245 = null;
        field2255 = null;
        field2238 = null;
        if (arg0 != 104) {
            method925(12, (byte) -46);
        }
        field2242 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)[[I", line = 29)
    public final int[][] method920(byte arg0) {
        field2261++;
        if (this.field2258 != this.field2241) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field2241; var2++) {
            this.field2246[var2] = class166.field2612;
        }
        int var3 = 46 / ((10 - arg0) / 60);
        return this.field2236;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 49)
    public static final void method921(int arg0) {
        if (arg0 != 25) {
            field2251 = 38;
        }
        field2243++;
        class172.method1093(104, 104);
        class9.method96(true, class1.field21, class81.field1246);
        class128.method855(class1.field21, (byte) 73);
        if (class214.field3407 == 10) {
            class204.method1289(arg0 ^ 0xFFFFFF9F, 28);
        }
        if (class214.field3407 == 30) {
            class204.method1289(-115, 25);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lne;I)V", line = 74)
    public static final void method922(class129 arg0, int arg1) {
        field2259++;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        if (arg0.field1971 == 0) {
            var5 = class100.method670(arg0.field1981, arg0.field1975, arg0.field1988);
        }
        if (arg0.field1971 == 1) {
            var5 = class270.method1791(arg0.field1981, arg0.field1975, arg0.field1988);
        }
        if (arg0.field1971 == 2) {
            var5 = class245.method1597(arg0.field1981, arg0.field1975, arg0.field1988);
        }
        if (arg0.field1971 == 3) {
            var5 = class259.method1658(arg0.field1981, arg0.field1975, arg0.field1988);
        }
        if (arg1 < 47) {
            field2238 = (class72[]) null;
        }
        if (var5 != 0L) {
            var3 = (int) var5 >> 14 & 0x1F;
            var2 = Integer.MAX_VALUE & (int) (var5 >>> 32);
            var4 = (int) var5 >> 20 & 0x3;
        }
        arg0.field1967 = var3;
        arg0.field1968 = var4;
        arg0.field1989 = var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZIIIIIIBIIII)Z", line = 119)
    public static final boolean method923(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class93.field1437[var12][var13] = 0;
                class111.field1695[var12][var13] = 99999999;
            }
        }
        class93.field1437[arg1][arg4] = 99;
        field2248++;
        int var14 = arg4;
        boolean var15 = false;
        int var16 = 0;
        byte var17 = 0;
        int var18 = arg1;
        class111.field1695[arg1][arg4] = 0;
        class59.field965[var17] = arg1;
        int var32 = var17 + 1;
        class296.field4931[var17] = arg4;
        int[][] var19 = class217.field3510[class10.field189].field4356;
        while (var16 != var32) {
            var14 = class296.field4931[var16];
            var18 = class59.field965[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var18 && arg5 == var14) {
                var15 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class217.field3510[class10.field189].method1744(true, arg10, arg8 - 1, var14, var18, arg5, 1, arg6)) {
                    var15 = true;
                    break;
                }
                if (arg8 < 10 && class217.field3510[class10.field189].method1751(var14, var18, arg8 - 1, arg5, arg6, 1, true, arg10)) {
                    var15 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg9 != 0 && class217.field3510[class10.field189].method1749(arg6, arg3, arg5, (byte) 5, 1, var18, arg2, arg9, var14)) {
                var15 = true;
                break;
            }
            int var20 = class111.field1695[var18][var14] + 1;
            if (var18 > 0 && class93.field1437[var18 - 1][var14] == 0 && (var19[var18 - 1][var14] & 0x12C0108) == 0) {
                class59.field965[var32] = var18 - 1;
                class296.field4931[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var18 - 1][var14] = 2;
                class111.field1695[var18 - 1][var14] = var20;
            }
            if (var18 < 103 && class93.field1437[var18 + 1][var14] == 0 && (var19[var18 + 1][var14] & 0x12C0180) == 0) {
                class59.field965[var32] = var18 + 1;
                class296.field4931[var32] = var14;
                class93.field1437[var18 + 1][var14] = 8;
                class111.field1695[var18 + 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class93.field1437[var18][var14 - 1] == 0 && (var19[var18][var14 - 1] & 0x12C0102) == 0) {
                class59.field965[var32] = var18;
                class296.field4931[var32] = var14 - 1;
                class93.field1437[var18][var14 - 1] = 1;
                class111.field1695[var18][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class93.field1437[var18][var14 + 1] == 0 && (var19[var18][var14 + 1] & 0x12C0120) == 0) {
                class59.field965[var32] = var18;
                class296.field4931[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var18][var14 + 1] = 4;
                class111.field1695[var18][var14 + 1] = var20;
            }
            if (var18 > 0 && var14 > 0 && class93.field1437[var18 - 1][var14 - 1] == 0 && (var19[var18 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var18 - 1][var14] & 0x12C0108) == 0 && (var19[var18][var14 - 1] & 0x12C0102) == 0) {
                class59.field965[var32] = var18 - 1;
                class296.field4931[var32] = var14 - 1;
                class93.field1437[var18 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class111.field1695[var18 - 1][var14 - 1] = var20;
            }
            if (var18 < 103 && var14 > 0 && class93.field1437[var18 + 1][var14 - 1] == 0 && (var19[var18 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var18 + 1][var14] & 0x12C0180) == 0 && (var19[var18][var14 - 1] & 0x12C0102) == 0) {
                class59.field965[var32] = var18 + 1;
                class296.field4931[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var18 + 1][var14 - 1] = 9;
                class111.field1695[var18 + 1][var14 - 1] = var20;
            }
            if (var18 > 0 && var14 < 103 && class93.field1437[var18 - 1][var14 + 1] == 0 && (var19[var18 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var18 - 1][var14] & 0x12C0108) == 0 && (var19[var18][var14 + 1] & 0x12C0120) == 0) {
                class59.field965[var32] = var18 - 1;
                class296.field4931[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var18 - 1][var14 + 1] = 6;
                class111.field1695[var18 - 1][var14 + 1] = var20;
            }
            if (var18 < 103 && var14 < 103 && class93.field1437[var18 + 1][var14 + 1] == 0 && (var19[var18 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var18 + 1][var14] & 0x12C0180) == 0 && (var19[var18][var14 + 1] & 0x12C0120) == 0) {
                class59.field965[var32] = var18 + 1;
                class296.field4931[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class93.field1437[var18 + 1][var14 + 1] = 12;
                class111.field1695[var18 + 1][var14 + 1] = var20;
            }
        }
        class82.field1252 = 0;
        if (arg7 < 69) {
            method919(-53);
        }
        if (!var15) {
            if (!arg0) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg6 - var22; var24 <= (arg6 + var22); var24++) {
                for (int var25 = arg5 - var22; var25 <= (arg5 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class111.field1695[var24][var25] < 100) {
                        int var26 = 0;
                        if (var24 < arg6) {
                            var26 = arg6 - var24;
                        } else if (var24 > (arg6 - (1 - arg2))) {
                            var26 = var24 + 1 - arg6 - arg2;
                        }
                        int var27 = 0;
                        if (var25 < arg5) {
                            var27 = arg5 - var25;
                        } else if (arg5 + arg9 - 1 < var25) {
                            var27 = var25 + 1 - arg9 - arg5;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class111.field1695[var24][var25] < var23) {
                            var14 = var25;
                            var18 = var24;
                            var21 = var28;
                            var23 = class111.field1695[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg1 == var18 && arg4 == var14) {
                return false;
            }
            class82.field1252 = 1;
        }
        byte var29 = 0;
        class59.field965[var29] = var18;
        int var33 = var29 + 1;
        class296.field4931[var29] = var14;
        int var30;
        int var31 = var30 = class93.field1437[var18][var14];
        while (arg1 != var18 || arg4 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class59.field965[var33] = var18;
                class296.field4931[var33++] = var14;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            if ((var31 & 0x2) != 0) {
                var18++;
            } else if ((var31 & 0x8) != 0) {
                var18--;
            }
            var31 = class93.field1437[var18][var14];
        }
        if (var33 > 0) {
            class6.method84((byte) -87, var33, arg11);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(III)V", line = 822)
    public class140(int arg0, int arg1, int arg2) {
        this.field2258 = arg1;
        this.field2246 = new class94[this.field2258];
        this.field2241 = arg0;
        this.field2236 = new int[this.field2241][arg2];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)[I", line = 413)
    public final int[] method924(int arg0, int arg1) {
        if (arg0 != 100) {
            this.field2241 = -89;
        }
        field2239++;
        if (this.field2258 == this.field2241) {
            this.field2260 = this.field2246[arg1] == null;
            this.field2246[arg1] = class166.field2612;
            return this.field2236[arg1];
        } else if (this.field2241 == 1) {
            this.field2260 = this.field2252 != arg1;
            this.field2252 = arg1;
            return this.field2236[0];
        } else {
            class94 var3 = this.field2246[arg1];
            if (var3 == null) {
                this.field2260 = true;
                if (this.field2241 <= this.field2237) {
                    class94 var4 = (class94) this.field2249.method1000((byte) 116);
                    var3 = new class94(arg1, var4.field1458);
                    this.field2246[var4.field1452] = null;
                    var4.method552((byte) 112);
                } else {
                    var3 = new class94(arg1, this.field2237);
                    this.field2237++;
                }
                this.field2246[arg1] = var3;
            } else {
                this.field2260 = false;
            }
            this.field2249.method1003(125, var3);
            return this.field2236[var3.field1458];
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)I", line = 476)
    public static final int method925(int arg0, byte arg1) {
        field2257++;
        int var7 = arg0 - 1;
        if (arg1 <= 96) {
            return -76;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 509)
    public final void method926(byte arg0) {
        field2240++;
        for (int var2 = 0; var2 < this.field2241; var2++) {
            this.field2236[var2] = null;
        }
        if (arg0 != -125) {
            this.method920((byte) -107);
        }
        this.field2246 = null;
        this.field2236 = (int[][]) null;
        this.field2249.method1001(115);
        this.field2249 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BI)Lck;", line = 541)
    public static final class119 method927(byte arg0, int arg1) {
        field2247++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class119 var2 = new class119();
        var2.field1825 = 1;
        var2.field1838 = new byte[1];
        if (arg0 != -30) {
            method922((class129) null, -29);
        }
        var2.field1838[0] = (byte) arg1;
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILmi;IIB)V", line = 569)
    public static final void method928(int arg0, int arg1, class32 arg2, int arg3, int arg4, byte arg5) {
        field2250++;
        if (arg2.field450 == -1 && arg2.field465 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg2.field458) {
            var6 += arg4 - arg2.field458;
        } else if (arg2.field454 > arg4) {
            var6 += arg2.field454 - arg4;
        }
        if (arg1 > arg2.field457) {
            var6 += arg1 - arg2.field457;
        } else if (arg1 < arg2.field455) {
            var6 += arg2.field455 - arg1;
        }
        if (var6 - 64 > arg2.field452 || class184.field2916 == 0 || arg2.field463 != arg0) {
            if (arg2.field448 != null) {
                class230.field3721.method1421(arg2.field448);
                arg2.field448 = null;
            }
            if (arg2.field468 != null) {
                class230.field3721.method1421(arg2.field468);
                arg2.field468 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        if (arg5 != 108) {
            field2251 = -47;
        }
        int var7 = (arg2.field452 - var6) * class184.field2916 / arg2.field452;
        if (arg2.field448 != null) {
            arg2.field448.method1556(var7);
        } else if (arg2.field450 >= 0) {
            class15 var8 = class15.method120(class168.field2652, arg2.field450, 0);
            if (var8 != null) {
                class34 var9 = var8.method122().method251(class176.field2811);
                class239 var10 = class239.method1530(var9, 100, var7);
                var10.method1527(-1);
                class230.field3721.method1420(var10);
                arg2.field448 = var10;
            }
        }
        if (arg2.field468 != null) {
            arg2.field468.method1556(var7);
            if (!arg2.field468.method550(118)) {
                arg2.field468 = null;
            }
        } else if (arg2.field465 != null && (arg2.field460 -= arg3) <= 0) {
            int var11 = (int) (Math.random() * (double) arg2.field465.length);
            class15 var12 = class15.method120(class168.field2652, arg2.field465[var11], 0);
            if (var12 != null) {
                class34 var13 = var12.method122().method251(class176.field2811);
                class239 var14 = class239.method1530(var13, 100, var7);
                var14.method1527(0);
                class230.field3721.method1420(var14);
                arg2.field460 = (int) ((double) (arg2.field459 - arg2.field456) * Math.random()) + arg2.field456;
                arg2.field468 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 692)
    public static final void method929(boolean arg0) {
        field2244++;
        if (!arg0) {
            field2245 = (class88[]) null;
        }
        if (class97.field1486 != null || class131.field2007 != null) {
            return;
        }
        int var1 = class296.field4938;
        if (class104.field1612) {
            if (var1 != 1) {
                int var6 = class129.field1984;
                int var7 = class65.field1024;
                if (var6 < (class104.field1599 - 10) || var6 > class59.field949 + class104.field1599 + 10 || var7 < class67.field1035 - 10 || class67.field1035 + class257.field4128 + 10 < var7) {
                    class104.field1612 = false;
                    class86.method577(class104.field1599, class257.field4128, class59.field949, (byte) 43, class67.field1035);
                }
            }
            if (var1 == 1) {
                int var8 = class67.field1035;
                int var9 = class104.field1599;
                int var10 = class59.field949;
                int var11 = class245.field3975;
                int var12 = class210.field3346;
                int var13 = -1;
                for (int var14 = 0; var14 < class272.field4474; var14++) {
                    int var15 = (class272.field4474 - (var14 + 1)) * 15 + var8 + 31;
                    if (var9 < var11 && var11 < (var9 + var10) && var12 > var15 - 13 && var15 + 3 > var12) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class55.method406(!arg0, var13);
                }
                class104.field1612 = false;
                class86.method577(class104.field1599, class257.field4128, class59.field949, (byte) 43, class67.field1035);
            }
            return;
        }
        if (var1 == 1 && class272.field4474 > 0) {
            short var2 = class88.field1355[class272.field4474 - 1];
            if (var2 == 38 || var2 == 9 || var2 == 8 || var2 == 16 || var2 == 39 || var2 == 23 || var2 == 2 || var2 == 49 || var2 == 48 || var2 == 5 || var2 == 28 || var2 == 1002) {
                int var3 = class158.field2513[class272.field4474 - 1];
                int var4 = class31.field446[class272.field4474 - 1];
                class134 var5 = class20.method153(1, var4);
                if (class296.method1974((byte) 93, client.method620(var5)) || class35.method253((byte) 104, client.method620(var5))) {
                    class54.field866 = false;
                    class23.field353 = 0;
                    if (class97.field1486 != null) {
                        class26.method194(class97.field1486, -109);
                    }
                    class97.field1486 = class20.method153(1, var4);
                    class89.field1365 = class245.field3975;
                    class249.field4027 = var3;
                    class14.field222 = class210.field3346;
                    class26.method194(class97.field1486, -88);
                    return;
                }
            }
        }
        if (var1 == 1 && (class238.field3815 == 1 && class272.field4474 > 2 || class293.method1948(arg0, class272.field4474 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class272.field4474 > 0) {
            class55.method406(!arg0, class272.field4474 - 1);
        }
        if (var1 == 2 && class272.field4474 > 0) {
            class261.method1674(32);
        }
    }
}
