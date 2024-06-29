import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class20 extends class273 {

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    private int field320 = -1;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field314 = null;

    @OriginalMember(owner = "client!fb", name = "K", descriptor = "I")
    public static int field308 = 2301979;

    @OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!fb", name = "M", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!fb", name = "O", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    private int field312;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "[I")
    private int[] field318;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)I")
    public final int method165(int arg0) {
        if (arg0 != 1) {
            field314 = null;
        }
        ++field316;
        return this.field320;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class20() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)Z")
    private final boolean method166(boolean arg0) {
        ++field307;
        if (this.field318 != null) {
            return true;
        } else if (!arg0) {
            return true;
        } else if (this.field320 >= 0) {
            int var2 = class67.field1129;
            int var3 = class26.field458;
            int var4 = class112.field1730.method7(113, this.field320).field1314 ? 64 : 128;
            this.field318 = class112.field1730.method12(this.field320, var4, 2048, false, var4, 1.0F);
            this.field312 = var4;
            this.field317 = var4;
            class206.method1383(var3, 103, var2);
            return this.field318 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([Lkj;II)V")
    public static final void method167(class114[] arg0, int arg1, int arg2) {
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            class114 var4 = arg0[var3];
            if (var4 != null && ~var4.field1910 == ~arg1 && (!var4.field1765 || !client.method1928(var4))) {
                if (var4.field1898 == 0) {
                    if (!var4.field1765 && client.method1928(var4) && class89.field1424 != var4) {
                        continue;
                    }
                    method167(arg0, var4.field1789, 2047);
                    if (var4.field1820 != null) {
                        method167(var4.field1820, var4.field1789, arg2);
                    }
                    class167 var5 = (class167) class91.field1434.method1063((byte) -124, (long) var4.field1789);
                    if (var5 != null) {
                        class211.method1403((byte) 79, var5.field2756);
                    }
                }
                if (~var4.field1898 == -7) {
                    if (var4.field1816 != -1 || var4.field1750 != -1) {
                        boolean var6 = class49.method418(arg2 + -2048, var4);
                        int var7;
                        if (!var6) {
                            var7 = var4.field1816;
                        } else {
                            var7 = var4.field1750;
                        }
                        if (~var7 != 0) {
                            class77 var8 = class28.method246(66, var7);
                            if (var8 != null) {
                                var4.field1825 += class232.field3681;
                                while (~var8.field1282[var4.field1819] > ~var4.field1825) {
                                    var4.field1825 -= var8.field1282[var4.field1819];
                                    ++var4.field1819;
                                    if (~var4.field1819 <= ~var8.field1256.length) {
                                        var4.field1819 -= var8.field1260;
                                        if (var4.field1819 < 0 || ~var8.field1256.length >= ~var4.field1819) {
                                            var4.field1819 = 0;
                                        }
                                    }
                                    var4.field1912 = var4.field1819 + 1;
                                    if (~var8.field1256.length >= ~var4.field1912) {
                                        var4.field1912 -= var8.field1260;
                                        if (var4.field1912 < 0 || ~var8.field1256.length >= ~var4.field1912) {
                                            var4.field1912 = -1;
                                        }
                                    }
                                    class72.method556(0, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1930 != 0 && !var4.field1765) {
                        int var9 = var4.field1930 >> 16;
                        int var10 = class232.field3681 * var9;
                        int var11 = var4.field1930 << 16 >> 16;
                        var4.field1863 = var4.field1863 + var10 & 2047;
                        int var12 = class232.field3681 * var11;
                        var4.field1756 = 2047 & var4.field1756 + var12;
                        class72.method556(0, var4);
                    }
                }
            }
        }
        if (arg2 != 2047) {
            method169(-116, 23, 40, -43, -83, 2, -88);
        }
        ++field313;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        int var2 = 67 / ((39 - arg0) / 47);
        ++field309;
        super.method168((byte) -56);
        this.field318 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)V")
    public static final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field310;
        int var7 = 0;
        class31.method265(arg2, -28516);
        int var8 = arg2;
        int var9 = -arg2;
        int var10 = -arg3 + arg2;
        if (~var10 > -1) {
            var10 = 0;
        }
        int var11 = -1;
        int var12 = -var10;
        int var13 = -1;
        int var14 = var10;
        int[] var15 = class114.field1841[arg6];
        int var16 = -var10 + arg5;
        int var17 = arg5 - -var10;
        class224.method1504(arg4, var16, arg5 - arg2, var15, 7);
        class224.method1504(arg0, var17, var16, var15, 7);
        class224.method1504(arg4, arg5 - -arg2, var17, var15, 7);
        while (var8 > var7) {
            var11 += 2;
            var9 += var11;
            var13 += 2;
            var12 += var13;
            if (~var12 <= -1 && var14 >= 1) {
                class4.field57[var14] = var7;
                --var14;
                var12 -= var14 << 1;
            }
            ++var7;
            if (~var9 <= -1) {
                --var8;
                if (~var10 >= ~var8) {
                    int[] var18 = class114.field1841[-var8 + arg6];
                    int[] var19 = class114.field1841[arg6 + var8];
                    int var20 = -var7 + arg5;
                    int var21 = arg5 + var7;
                    class224.method1504(arg4, var21, var20, var19, 7);
                    class224.method1504(arg4, var21, var20, var18, 7);
                } else {
                    int[] var22 = class114.field1841[arg6 + var8];
                    int[] var23 = class114.field1841[arg6 - var8];
                    int var24 = class4.field57[var8];
                    int var25 = arg5 + var7;
                    int var26 = -var7 + arg5;
                    int var27 = -var24 + arg5;
                    class224.method1504(arg4, var27, var26, var22, 7);
                    int var28 = arg5 + var24;
                    class224.method1504(arg0, var28, var27, var22, 7);
                    class224.method1504(arg4, var25, var28, var22, 7);
                    class224.method1504(arg4, var27, var26, var23, 7);
                    class224.method1504(arg0, var28, var27, var23, arg1 ^ 6);
                    class224.method1504(arg4, var25, var28, var23, arg1 + 6);
                }
                var9 -= var8 << 1;
            }
            int[] var29 = class114.field1841[arg6 + var7];
            int[] var30 = class114.field1841[-var7 + arg6];
            int var31 = arg5 + var8;
            int var32 = -var8 + arg5;
            if (var7 < var10) {
                int var33 = ~var7 >= ~var14 ? var14 : class4.field57[var7];
                int var34 = arg5 + var33;
                int var35 = -var33 + arg5;
                class224.method1504(arg4, var35, var32, var29, 7);
                class224.method1504(arg0, var34, var35, var29, arg1 ^ 6);
                class224.method1504(arg4, var31, var34, var29, 7);
                class224.method1504(arg4, var35, var32, var30, 7);
                class224.method1504(arg0, var34, var35, var30, 7);
                class224.method1504(arg4, var31, var34, var30, arg1 + 6);
            } else {
                class224.method1504(arg4, var31, var32, var29, 7);
                class224.method1504(arg4, var31, var32, var30, 7);
            }
        }
        if (arg1 != 1) {
            method169(118, -87, 68, 92, -20, -53, -71);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V")
    public static void method170(byte arg0) {
        if (arg0 == 17) {
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field320 = arg0.method996(65280);
        }
        ++field319;
        if (arg2 != 5) {
            this.field317 = 71;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 <= 122) {
            this.method165(-101);
        }
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631 && this.method166(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = this.field317 * (~class67.field1129 != ~this.field312 ? this.field312 * arg1 / class67.field1129 : arg1);
            int[] var7 = var3[1];
            if (class26.field458 != this.field317) {
                for (int var8 = 0; ~class26.field458 < ~var8; ++var8) {
                    int var9 = this.field317 * var8 / class26.field458;
                    int var10 = this.field318[var6 - -var9];
                    var5[var8] = class64.method498(var10, 255) << 4;
                    var7[var8] = class64.method498(var10, 65280) >> 4;
                    var4[var8] = class64.method498(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; var11 < class26.field458; ++var11) {
                    int var12 = this.field318[var6++];
                    var5[var11] = class64.method498(255, var12) << 4;
                    var7[var11] = class64.method498(var12, 65280) >> 4;
                    var4[var11] = class64.method498(16711680, var12) >> 12;
                }
            }
        }
        ++field311;
        return var3;
    }
}
