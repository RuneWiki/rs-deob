import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class123 extends class107 {

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    private int field2165 = -1;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field2173 = 0;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public int field2160;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "[I")
    public int[] field2161;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "[[I")
    public static int[][] field2166;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lfa;B)Z")
    public static final boolean method876(class239 arg0, byte arg1) {
        if (arg1 != 13) {
            return false;
        } else {
            ++field2168;
            return arg0.method1639((byte) 107, class169.field2972);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field2158;
        if (arg2 != -32513) {
            this.field2165 = -22;
        }
        if (~arg1 == -1) {
            this.field2165 = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBIILlj;II)V")
    public static final void method877(int arg0, byte arg1, int arg2, int arg3, class25 arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (~arg2 == -1) {
            var7 = class119.method864(arg0, arg3, arg6);
        } else if (~arg2 != -2) {
            if (arg2 != 2) {
                if (~arg2 == -4) {
                    var7 = class125.method892(arg0, arg3, arg6);
                }
            } else {
                var7 = class29.method270(arg0, arg3, arg6);
            }
        } else {
            var7 = class27.method244(arg0, arg3, arg6);
        }
        ++field2162;
        boolean var9 = false;
        int var10 = (519423 & (int) var7) >> 14;
        boolean var11 = true;
        int var12 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        class28 var13 = class94.method700(-65, var12);
        boolean var14 = false;
        if (var13.method249(-94)) {
            class234.method1555(arg3, arg6, var13, -75, arg0);
        }
        int var15 = (int) var7 >> 20 & 3;
        if (var7 != 0L) {
            if (arg2 != 0) {
                if (arg2 == 1) {
                    class229.method1520(arg0, arg3, arg6);
                } else if (arg2 != 2) {
                    if (arg2 == 3) {
                        class254.method1718(arg0, arg3, arg6);
                        if (var13.field551 == 1) {
                            arg4.method231(arg3, arg6, -22166);
                        }
                    }
                } else {
                    class108.method804(arg0, arg3, arg6);
                    if (var13.field551 != 0 && ~(var13.field507 + arg3) > -105 && ~(var13.field507 + arg6) > -105 && var13.field571 + arg3 < 104 && var13.field571 + arg6 < 104) {
                        arg4.method234(-1, arg6, var15, arg3, var13.field571, var13.field529, var13.field507);
                    }
                }
            } else {
                class196.method1351(arg0, arg3, arg6);
                if (var13.field551 != 0) {
                    arg4.method228(var13.field529, arg6, arg3, var15, var10, false);
                }
            }
        }
        if (arg1 > -117) {
            method880(92);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIIIIII)V")
    public static final void method878(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class264.method1766(arg2, 0);
        int var7 = 0;
        ++field2159;
        int var8 = arg2;
        int var9 = -arg5 + arg2;
        if (~var9 > -1) {
            var9 = 0;
        }
        int var10 = -arg2;
        int var11 = -1;
        int var12 = -var9;
        if (arg4 >= class13.field215 && class34.field727 >= arg4) {
            int[] var13 = class62.field1241[arg4];
            int var14 = class91.method689(-arg2 + arg6, class89.field1637, class94.field1676, (byte) 112);
            int var15 = class91.method689(arg2 + arg6, class89.field1637, class94.field1676, (byte) 74);
            int var16 = class91.method689(-var9 + arg6, class89.field1637, class94.field1676, (byte) 31);
            int var17 = class91.method689(arg6 + var9, class89.field1637, class94.field1676, (byte) -113);
            class199.method1361(arg1, var16, var13, var14, 88);
            class199.method1361(arg3, var17, var13, var16, 112);
            class199.method1361(arg1, var15, var13, var17, 94);
        }
        int var18 = var9;
        int var19 = -1;
        while (~var8 < ~var7) {
            var19 += 2;
            var12 += var19;
            if (var12 >= 0 && var18 >= 1) {
                --var18;
                var12 -= var18 << 1;
                class106.field1886[var18] = var7;
            }
            var11 += 2;
            ++var7;
            var10 += var11;
            if (~var10 <= -1) {
                --var8;
                int var21 = -var8 + arg4;
                var10 -= var8 << 1;
                int var22 = arg4 + var8;
                if (class13.field215 <= var22 && ~var21 >= ~class34.field727) {
                    if (var9 > var8) {
                        int var23 = class106.field1886[var8];
                        int var24 = class91.method689(arg6 + var7, class89.field1637, class94.field1676, (byte) 71);
                        int var25 = class91.method689(arg6 - var7, class89.field1637, class94.field1676, (byte) 63);
                        int var26 = class91.method689(arg6 + var23, class89.field1637, class94.field1676, (byte) 74);
                        int var27 = class91.method689(arg6 - var23, class89.field1637, class94.field1676, (byte) -102);
                        if (class34.field727 >= var22) {
                            int[] var28 = class62.field1241[var22];
                            class199.method1361(arg1, var27, var28, var25, 84);
                            class199.method1361(arg3, var26, var28, var27, 57);
                            class199.method1361(arg1, var24, var28, var26, 96);
                        }
                        if (class13.field215 <= var21) {
                            int[] var29 = class62.field1241[var21];
                            class199.method1361(arg1, var27, var29, var25, 117);
                            class199.method1361(arg3, var26, var29, var27, 64);
                            class199.method1361(arg1, var24, var29, var26, 56);
                        }
                    } else {
                        int var30 = class91.method689(arg6 + var7, class89.field1637, class94.field1676, (byte) -119);
                        int var31 = class91.method689(-var7 + arg6, class89.field1637, class94.field1676, (byte) -125);
                        if (var22 <= class34.field727) {
                            class199.method1361(arg1, var30, class62.field1241[var22], var31, 63);
                        }
                        if (class13.field215 <= var21) {
                            class199.method1361(arg1, var30, class62.field1241[var21], var31, 95);
                        }
                    }
                }
            }
            int var32 = arg4 + var7;
            int var33 = -var7 + arg4;
            if (var32 >= class13.field215 && ~class34.field727 <= ~var33) {
                int var34 = arg6 + var8;
                int var35 = arg6 - var8;
                if (class89.field1637 <= var34 && ~var35 >= ~class94.field1676) {
                    int var36 = class91.method689(var34, class89.field1637, class94.field1676, (byte) 46);
                    int var37 = class91.method689(var35, class89.field1637, class94.field1676, (byte) -124);
                    if (var7 < var9) {
                        int var38 = var18 < var7 ? class106.field1886[var7] : var18;
                        int var39 = class91.method689(arg6 + var38, class89.field1637, class94.field1676, (byte) -89);
                        int var40 = class91.method689(-var38 + arg6, class89.field1637, class94.field1676, (byte) -108);
                        if (~class34.field727 <= ~var32) {
                            int[] var41 = class62.field1241[var32];
                            class199.method1361(arg1, var40, var41, var37, 67);
                            class199.method1361(arg3, var39, var41, var40, 105);
                            class199.method1361(arg1, var36, var41, var39, 125);
                        }
                        if (class13.field215 <= var33) {
                            int[] var42 = class62.field1241[var33];
                            class199.method1361(arg1, var40, var42, var37, 66);
                            class199.method1361(arg3, var39, var42, var40, 92);
                            class199.method1361(arg1, var36, var42, var39, 126);
                        }
                    } else {
                        if (~class34.field727 <= ~var32) {
                            class199.method1361(arg1, var36, class62.field1241[var32], var37, 73);
                        }
                        if (~class13.field215 >= ~var33) {
                            class199.method1361(arg1, var36, class62.field1241[var33], var37, 90);
                        }
                    }
                }
            }
        }
        int var20 = 39 % ((arg0 - 2) / 36);
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(I)I")
    public final int method796(int arg0) {
        ++field2174;
        return arg0 >= -65 ? 18 : this.field2165;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)[[I")
    public int[][] method240(byte arg0, int arg1) {
        ++field2172;
        int var3 = -74 / ((arg0 - 26) / 45);
        int[][] var4 = super.field1903.method634(arg1, 13012);
        if (super.field1903.field1551 && this.method879((byte) -120)) {
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int var8 = this.field2163 * (~class193.field3342 == ~this.field2160 ? arg1 : this.field2160 * arg1 / class193.field3342);
            if (~class106.field1862 != ~this.field2163) {
                for (int var9 = 0; ~class106.field1862 < ~var9; ++var9) {
                    int var10 = this.field2163 * var9 / class106.field1862;
                    int var11 = this.field2161[var8 + var10];
                    var6[var9] = class272.method1817(255, var11) << 4;
                    var7[var9] = class272.method1817(4080, var11 >> 4);
                    var5[var9] = class272.method1817(var11 >> 12, 4080);
                }
            } else {
                for (int var12 = 0; ~class106.field1862 < ~var12; ++var12) {
                    int var13 = this.field2161[var8++];
                    var6[var12] = class272.method1817(4080, var13 << 4);
                    var7[var12] = class272.method1817(65280, var13) >> 4;
                    var5[var12] = class272.method1817(var13, 16711680) >> 12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)Z")
    public final boolean method879(byte arg0) {
        ++field2171;
        if (this.field2161 != null) {
            return true;
        } else {
            if (arg0 != -120) {
                this.method879((byte) 45);
            }
            if (this.field2165 >= 0) {
                class225 var2 = client.method1043(this.field2165, class68.field1349, (byte) 6);
                var2.method1499();
                this.field2163 = var2.field2018;
                this.field2161 = var2.field3867;
                this.field2160 = var2.field2014;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!q", name = "h", descriptor = "(I)V")
    public static void method880(int arg0) {
        field2166 = null;
        if (arg0 > -84) {
            field2166 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public final void method793(byte arg0) {
        super.method793((byte) -121);
        this.field2161 = null;
        if (arg0 >= -21) {
            method876((class239) null, (byte) 124);
        }
        ++field2167;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()V")
    public static final void method881() {
        for (int var0 = 0; var0 < class85.field1579; ++var0) {
            class191 var1 = class185.field3239[var0];
            class96.method717(var1);
            class185.field3239[var0] = null;
        }
        class85.field1579 = 0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lfa;III)Lgj;")
    public static final class225 method882(class239 arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 63) {
            return null;
        } else {
            ++field2170;
            return !method883(arg3, arg2, -1, arg0) ? null : class22.method208(5);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILfa;)Z")
    public static final boolean method883(int arg0, int arg1, int arg2, class239 arg3) {
        ++field2169;
        byte[] var4 = arg3.method1645(true, arg1, arg0);
        if (var4 == null) {
            return false;
        } else {
            if (arg2 != -1) {
                method878((byte) 86, 32, -115, 24, -118, 69, 103);
            }
            class172.method1190(var4, (byte) 43);
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I[I)V")
    public static final void method884(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var5 = -39 % ((arg1 - 63) / 44);
        if (arg2 < arg0) {
            int var6 = (arg0 + arg2) / 2;
            int var7 = arg2;
            int var8 = arg3[var6];
            arg3[var6] = arg3[arg0];
            arg3[arg0] = var8;
            int var9 = arg4[var6];
            arg4[var6] = arg4[arg0];
            arg4[arg0] = var9;
            for (int var10 = arg2; ~arg0 < ~var10; ++var10) {
                if ((var10 & 1) + var8 < arg3[var10]) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var7];
                    arg3[var7] = var11;
                    int var12 = arg4[var10];
                    arg4[var10] = arg4[var7];
                    arg4[var7++] = var12;
                }
            }
            arg3[arg0] = arg3[var7];
            arg3[var7] = var8;
            arg4[arg0] = arg4[var7];
            arg4[var7] = var9;
            method884(var7 + -1, 125, arg2, arg3, arg4);
            method884(arg0, -94, var7 - -1, arg3, arg4);
        }
        ++field2164;
    }
}
