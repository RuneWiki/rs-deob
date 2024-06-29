import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class122 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lpd;")
    private class3 field1984 = new class3(256);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lpd;")
    private class3 field1996 = new class3(256);

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lpk;")
    private class120 field1986;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lpk;")
    private class120 field1994;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "[[I")
    public static int[][] field1995 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1987 = -1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lpk;")
    public static class120 field1982;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[Z")
    public static boolean[] field1988;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 9)
    public static void method972(boolean arg0) {
        field1995 = (int[][]) null;
        if (!arg0) {
            field1995 = (int[][]) ((int[][]) null);
        }
        field1988 = null;
        field1982 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)J", line = 21)
    public static final long method973(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field672; var4++) {
            class144 var5 = var3.field659[var4];
            if ((var5.field2344 >> 29 & 0x3L) == 2L && var5.field2345 == arg1 && var5.field2339 == arg2) {
                return var5.field2344;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILlk;I)V", line = 46)
    public static final void method974(int arg0, class294 arg1, int arg2) {
        if (class307.field4869 < arg1.field4627) {
            class207.method1526(arg1, false);
        } else if (arg1.field4648 >= class307.field4869) {
            class126.method994(arg1, -70);
        } else {
            class289.method2038((byte) 108, arg1);
        }
        int var3 = 53 % ((arg2 - 78) / 33);
        field1993++;
        if (arg1.field4671 < 128 || arg1.field4672 < 128 || arg1.field4671 >= 13184 || arg1.field4672 >= 13184) {
            arg1.field4679 = -1;
            arg1.field4648 = 0;
            arg1.field4660 = -1;
            arg1.field4627 = 0;
            arg1.field4671 = arg1.field4643[0] * 128 + arg1.method738(-6421) * 64;
            arg1.field4672 = arg1.field4619[0] * 128 + (arg1.method738(-6421) * 64);
            arg1.method2059(115);
        }
        if (class345.field5363 == arg1 && (arg1.field4671 < 1536 || arg1.field4672 < 1536 || arg1.field4671 >= 11776 || arg1.field4672 >= 11776)) {
            arg1.field4660 = -1;
            arg1.field4679 = -1;
            arg1.field4627 = 0;
            arg1.field4648 = 0;
            arg1.field4671 = arg1.field4643[0] * 128 + arg1.method738(-6421) * 64;
            arg1.field4672 = arg1.field4619[0] * 128 + arg1.method738(-6421) * 64;
            arg1.method2059(113);
        }
        class36.method328(arg1, false);
        class6.method95(1, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[II)Lrk;", line = 98)
    public final class187 method975(boolean arg0, int[] arg1, int arg2) {
        field1983++;
        if (this.field1986.method966((byte) 14) == 1) {
            return this.method979(true, arg1, 0, arg2);
        } else if (this.field1986.method962((byte) -111, arg2) == 1) {
            return this.method979(true, arg1, arg2, 0);
        } else if (arg0) {
            return (class187) null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II[I)Lrk;", line = 125)
    public final class187 method976(int arg0, int arg1, int[] arg2) {
        field1985++;
        if (this.field1994.method966((byte) 14) == 1) {
            return this.method977(-95, arg0, 0, arg2);
        } else if (this.field1994.method962((byte) -127, arg0) == 1) {
            return this.method977(-121, 0, arg0, arg2);
        } else {
            int var4 = 113 % ((37 - arg1) / 62);
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III[I)Lrk;", line = 144)
    private final class187 method977(int arg0, int arg1, int arg2, int[] arg3) {
        field1989++;
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x30000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class187 var9 = (class187) this.field1996.method79(var7, (byte) 0);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class234 var10 = class234.method1683(this.field1994, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class187 var11 = var10.method1685();
            this.field1996.method75(var11, -1, var7);
            if (arg0 > -1) {
                method974(-25, (class294) null, 100);
            }
            if (arg3 != null) {
                arg3[0] -= var11.field2942.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Laj;I)V", line = 192)
    public static final void method978(class1 arg0, int arg1) {
        if (arg1 != 29956) {
            method974(100, (class294) null, -115);
        }
        field1991++;
        while (true) {
            while (arg0.field48 < arg0.field34.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method15((byte) 96) == 1) {
                    var3 = arg0.method15((byte) -37);
                    var4 = arg0.method15((byte) 124);
                    var2 = true;
                }
                int var5 = arg0.method15((byte) -70);
                int var6 = arg0.method15((byte) 91);
                int var7 = var5 * 64 - class227.field3512;
                int var8 = class286.field4473 - (1 - class188.field2953) - var6 * 64;
                if (var7 >= 0 && (var8 - 63) >= 0 && class113.field1833 > (var7 + 63) && class286.field4473 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var3 * 8 + 8 > var11 && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                int var13 = arg0.method15((byte) -39);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method15((byte) 80);
                                        if (class141.field2282[var9][var10] == null) {
                                            class141.field2282[var9][var10] = new byte[4096];
                                        }
                                        class141.field2282[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method4(true);
                                        if (class178.field2837[var9][var10] == null) {
                                            class178.field2837[var9][var10] = new int[4096];
                                        }
                                        class178.field2837[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method4(true);
                                        if (class191.field2989[var9][var10] == null) {
                                            class191.field2989[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class101 var17 = class288.method2025(var16, arg1 ^ 0xFFFF8AFB);
                                        if (var17.field1653 != null) {
                                            var17 = var17.method813((byte) -29);
                                            if (var17 == null || var17.field1613 == -1) {
                                                continue;
                                            }
                                        }
                                        class191.field2989[var9][var10][(63 - var12 << 6) + var11] = var17.field1665 + 1;
                                        class172 var18 = new class172();
                                        var18.field2764 = var8;
                                        var18.field2765 = var17.field1613;
                                        var18.field2760 = var7;
                                        class62.field908.method277(var18, (byte) -119);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method15((byte) 105);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field48++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field48 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field48 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z[III)Lrk;", line = 340)
    private final class187 method979(boolean arg0, int[] arg1, int arg2, int arg3) {
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFF2) ^ arg3;
        int var6 = var5 | arg2 << 16;
        field1990++;
        long var7 = (long) var6 ^ 0x100000000L;
        class187 var9 = (class187) this.field1996.method79(var7, (byte) 0);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class341 var10 = (class341) this.field1984.method79(var7, (byte) 0);
            if (var10 == null) {
                var10 = class341.method2362(this.field1986, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1984.method75(var10, -1, var7);
            }
            class187 var11 = var10.method2372(arg1);
            if (var11 == null) {
                return null;
            } else if (arg0) {
                var10.method489(false);
                this.field1996.method75(var11, -1, var7);
                return var11;
            } else {
                return (class187) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lpk;Lpk;)V", line = 394)
    public class122(class120 arg0, class120 arg1) {
        this.field1986 = arg1;
        this.field1994 = arg0;
    }
}
