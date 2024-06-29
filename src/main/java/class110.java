import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class110 extends class23 {

    @OriginalMember(owner = "client!ad", name = "Y", descriptor = "I")
    private int field1940 = 0;

    @OriginalMember(owner = "client!ad", name = "W", descriptor = "[S")
    private short[] field1938 = new short[257];

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Llc;")
    public static class143 field1924 = class66.method374(" loggt sich ein)3", -1);

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!ad", name = "bb", descriptor = "Z")
    public static boolean field1943 = false;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!ad", name = "V", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!ad", name = "X", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!ad", name = "Z", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!ad", name = "ab", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[I")
    private int[] field1930;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "[I")
    private int[] field1935;

    @OriginalMember(owner = "client!ad", name = "cb", descriptor = "[[I")
    private int[][] field1944;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llc;Z)Z")
    public static final boolean method658(class143 arg0, boolean arg1) {
        ++field1933;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; class184.field3338 > var2; ++var2) {
                if (arg0.method895((byte) -126, class153.field2769[var2])) {
                    return true;
                }
            }
            if (arg1) {
                method662(-63, 103);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(B)V")
    public static void method659(byte arg0) {
        field1924 = null;
        int var1 = 95 % ((arg0 - 2) / 44);
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(II)[I")
    private final int[] method660(int arg0, int arg1) {
        ++field1939;
        if (arg0 != -7) {
            return null;
        } else if (~arg1 > -1) {
            return this.field1930;
        } else {
            return arg1 >= this.field1944.length ? this.field1935 : this.field1944[arg1];
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V")
    public static final void method661(int arg0) {
        class147.field2663.method96(-257);
        for (int var1 = 0; var1 < 32; ++var1) {
            class188.field3411[var1] = 0L;
        }
        if (arg0 != -32769) {
            method664(-16, 55, (byte[]) null, (class106[]) null, -60, -79, false, -97, 124, false, 112);
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class226.field4089[var2] = 0L;
        }
        class230.field4212 = 0;
        ++field1927;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(II)V")
    public static final void method662(int arg0, int arg1) {
        ++field1934;
        for (class61 var2 = class12.field228.method1818(false); var2 != null; var2 = class12.field228.method1834((byte) 124)) {
            if (~((long) arg0) == ~(65535L & var2.field1162 >> 48)) {
                var2.method349(0);
            }
        }
        if (arg1 > -11) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBIII)V")
    public static final void method663(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field1941;
        int var6 = arg4 - arg5;
        int var7 = -arg1 + arg3;
        if (~var7 != -1) {
            if (~var6 == -1) {
                class139.method825(arg1, false, arg5, arg3, arg0);
            } else {
                if (~var6 > -1) {
                    var6 = -var6;
                }
                if (~var7 > -1) {
                    var7 = -var7;
                }
                boolean var8 = var7 < var6;
                if (var8) {
                    int var9 = arg3;
                    arg3 = arg4;
                    arg4 = var9;
                    int var10 = arg1;
                    arg1 = arg5;
                    arg5 = var10;
                }
                if (arg2 < 37) {
                    method666(-83, -119, (byte) 114, 81, -102);
                }
                if (~arg3 > ~arg1) {
                    int var11 = arg1;
                    int var12 = arg5;
                    arg5 = arg4;
                    arg4 = var12;
                    arg1 = arg3;
                    arg3 = var11;
                }
                int var13 = -arg1 + arg3;
                int var14 = arg5;
                int var15 = -arg5 + arg4;
                int var16 = arg4 <= arg5 ? -1 : 1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                int var17 = -(var13 >> 1);
                if (!var8) {
                    for (int var18 = arg1; var18 <= arg3; ++var18) {
                        class15.field268[var14][var18] = arg0;
                        var17 += var15;
                        if (var17 > 0) {
                            var17 -= var13;
                            var14 += var16;
                        }
                    }
                } else {
                    for (int var19 = arg1; var19 <= arg3; ++var19) {
                        class15.field268[var19][var14] = arg0;
                        var17 += var15;
                        if (~var17 < -1) {
                            var17 -= var13;
                            var14 += var16;
                        }
                    }
                }
            }
        } else {
            if (~var6 != -1) {
                class250.method1662(arg0, arg1, (byte) 17, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II[B[Llf;IIZIIZI)V")
    public static final void method664(int arg0, int arg1, byte[] arg2, class106[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9, int arg10) {
        if (!arg6) {
            field1943 = true;
        }
        if (!arg9) {
            for (int var11 = 0; ~var11 > -9; ++var11) {
                for (int var12 = 0; var12 < 8; ++var12) {
                    if (arg1 + var11 > 0 && ~(arg1 - -var11) > -104 && arg10 + var12 > 0 && ~(arg10 + var12) > -104) {
                        arg3[arg0].field1868[arg1 + var11][arg10 - -var12] = class129.method777(arg3[arg0].field1868[arg1 + var11][arg10 - -var12], -16777217);
                    }
                }
            }
        }
        ++field1929;
        byte var13;
        if (arg9) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class190 var14 = new class190(arg2);
        for (int var15 = 0; ~var13 < ~var15; ++var15) {
            for (int var35 = 0; ~var35 > -65; ++var35) {
                for (int var36 = 0; ~var36 > -65; ++var36) {
                    if (arg4 == var15 && ~arg7 >= ~var35 && ~(arg7 + 8) < ~var35 && ~arg5 >= ~var36 && ~var36 > ~(arg5 - -8)) {
                        class263.method1750(class263.method1757(-107, var36 & 7, 7 & var35, arg8) + arg1, arg0, 0, arg10 + class169.method1107(7 & var35, arg8, (byte) -11, 7 & var36), arg8, 0, arg9, var14, true);
                    } else {
                        class263.method1750(-1, 0, 0, -1, 0, 0, arg9, var14, arg6);
                    }
                }
            }
        }
        while (~var14.field3465.length < ~var14.field3487) {
            int var16 = var14.method1265(121);
            if (~var16 != -130) {
                --var14.field3487;
                break;
            }
            for (int var17 = 0; ~var17 > -5; ++var17) {
                byte var18 = var14.method1234(false);
                if (~var18 == -1) {
                    if (~arg4 <= ~var17) {
                        int var19 = arg1 + 7;
                        int var20 = arg1;
                        int var21 = arg10;
                        if (~arg1 > -1) {
                            var20 = 0;
                        } else if (arg1 >= 104) {
                            var20 = 104;
                        }
                        if (var19 < 0) {
                            var19 = 0;
                        } else if (~var19 <= -105) {
                            var19 = 104;
                        }
                        if (~arg10 > -1) {
                            var21 = 0;
                        } else if (~arg10 <= -105) {
                            var21 = 104;
                        }
                        int var22 = arg10 - -7;
                        if (~var22 <= -1) {
                            if (~var22 <= -105) {
                                var22 = 104;
                            }
                        } else {
                            var22 = 0;
                        }
                        while (~var20 > ~var19) {
                            while (~var22 < ~var21) {
                                class76.field1406[arg0][var20][var21] = 0;
                                ++var21;
                            }
                            ++var20;
                        }
                    }
                } else if (var18 == 1) {
                    for (int var23 = 0; ~var23 > -65; var23 += 4) {
                        for (int var24 = 0; var24 < 64; var24 += 4) {
                            byte var25 = var14.method1234(false);
                            if (~var17 >= ~arg4) {
                                int var26 = var23;
                                while (var23 + 4 > var26) {
                                    int var27 = var24;
                                    while (~(var24 + 4) < ~var27) {
                                        if (~arg7 >= ~var26 && ~(arg7 - -8) < ~var26 && ~var27 <= ~arg5 && arg5 < arg5 + 8) {
                                            int var28 = arg1 + class263.method1757(-83, 7 & var27, 7 & var26, arg8);
                                            int var29 = class169.method1107(7 & var26, arg8, (byte) 83, 7 & var27) + arg10;
                                            if (~var28 <= -1 && var28 < 104 && ~var29 <= -1 && var29 < 104) {
                                                class76.field1406[arg0][var28][var29] = var25;
                                            }
                                        }
                                        ++var24;
                                    }
                                    ++var23;
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var30 = false;
        if (!var30) {
            int var31 = arg1 + 7;
            int var32 = arg10 + 7;
            for (int var33 = arg1; ~var33 > ~var31; ++var33) {
                for (int var34 = arg10; ~var34 > ~var32; ++var34) {
                    class76.field1406[arg0][var33][var34] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(B)V")
    private final void method665(byte arg0) {
        ++field1937;
        int[] var2 = this.field1944[0];
        if (arg0 != -75) {
            this.field1935 = null;
        }
        int[] var3 = this.field1944[1];
        int[] var4 = this.field1944[this.field1944.length + -2];
        int[] var5 = this.field1944[this.field1944.length - 1];
        this.field1930 = new int[] { var2[0] - (var3[0] + -var2[0]), var2[1] + -var3[1] + var2[1] };
        this.field1935 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] - (var5[1] + -var4[1]) };
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        ++field1928;
        if (arg0 > -13) {
            this.field1940 = -16;
        }
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int[] var4 = this.method155(arg1, (byte) 115, 0);
            for (int var5 = 0; ~class72.field1359 < ~var5; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1938[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (~arg1 == -1) {
            this.field1940 = arg0.method1265(117);
            this.field1944 = new int[arg0.method1265(116)][2];
            for (int var4 = 0; ~var4 > ~this.field1944.length; ++var4) {
                this.field1944[var4][0] = arg0.method1275(128);
                this.field1944[var4][1] = arg0.method1275(128);
            }
        }
        ++field1926;
        if (!arg2) {
            field1936 = true;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIBII)V")
    public static final void method666(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (-arg0 + arg1 >= class31.field481 && arg0 + arg1 <= class9.field173 && ~(arg4 - arg0) <= ~class188.field3398 && class239.field4321 >= arg0 + arg4) {
            class158.method1036(arg0, arg3, false, arg1, arg4);
        } else {
            class140.method840(-1, arg0, arg1, arg3, arg4);
        }
        ++field1931;
        if (arg2 != -14) {
            field1943 = false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        if (this.field1944 == null) {
            this.field1944 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field1925;
        if (~this.field1944.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            int var2 = -8 % ((arg0 - 22) / 60);
            if (~this.field1940 == -3) {
                this.method665((byte) -75);
            }
            class12.method99(512);
            this.method667(true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
    private final void method667(boolean arg0) {
        ++field1942;
        if (arg0) {
            int var2 = this.field1940;
            if (~var2 != -3) {
                if (~var2 == -2) {
                    for (int var3 = 0; var3 < 257; ++var3) {
                        int var4 = var3 << 4;
                        int var5;
                        for (var5 = 1; var5 < this.field1944.length + -1 && var4 >= this.field1944[var5][0]; ++var5) {
                        }
                        int[] var6 = this.field1944[var5];
                        int[] var7 = this.field1944[var5 + -1];
                        int var8 = (-var7[0] + var4 << 12) / (var6[0] - var7[0]);
                        int var9 = 4096 - class279.field4922[(8180 & var8) >> 5] >> 1;
                        int var10 = 4096 - var9;
                        int var11 = var7[1] * var10 - -(var6[1] * var9) >> 12;
                        if (var11 <= -32768) {
                            var11 = -32767;
                        }
                        if (~var11 <= -32769) {
                            var11 = 32767;
                        }
                        this.field1938[var3] = (short) var11;
                    }
                } else {
                    for (int var12 = 0; ~var12 > -258; ++var12) {
                        int var13 = var12 << 4;
                        int var14;
                        for (var14 = 1; this.field1944.length + -1 > var14 && ~var13 <= ~this.field1944[var14][0]; ++var14) {
                        }
                        int[] var15 = this.field1944[var14];
                        int[] var16 = this.field1944[var14 - 1];
                        int var17 = (-var16[0] + var13 << 12) / (var15[0] - var16[0]);
                        int var18 = -var17 + 4096;
                        int var19 = var16[1] * var18 - -(var15[1] * var17) >> 12;
                        if (~var19 >= 32767) {
                            var19 = -32767;
                        }
                        if (var19 >= 32768) {
                            var19 = 32767;
                        }
                        this.field1938[var12] = (short) var19;
                    }
                }
            } else {
                for (int var20 = 0; ~var20 > -258; ++var20) {
                    int var21 = var20 << 4;
                    int var22;
                    for (var22 = 1; ~var22 > ~(this.field1944.length + -1) && var21 >= this.field1944[var22][0]; ++var22) {
                    }
                    int[] var23 = this.field1944[var22 + -1];
                    int[] var24 = this.field1944[var22];
                    int var25 = this.method660(-7, var22 + -2)[1];
                    int var26 = var23[1];
                    int var27 = var24[1];
                    int var28 = this.method660(-7, var22 - -1)[1];
                    int var29 = (-var23[0] + var21 << 12) / (var24[0] + -var23[0]);
                    int var30 = var26 + var28 + -var27 - var25;
                    int var31 = var29 * var29 >> 12;
                    int var32 = -var30 + var25 - var26;
                    int var34 = var27 - var25;
                    int var35 = (var29 * var30 >> 12) * var31 >> 12;
                    int var36 = var31 * var32 >> 12;
                    int var37 = var29 * var34 >> 12;
                    int var38 = var36 + var37 + var35 + var26;
                    if (~var38 >= 32767) {
                        var38 = -32767;
                    }
                    if (~var38 <= -32769) {
                        var38 = 32767;
                    }
                    this.field1938[var20] = (short) var38;
                }
            }
        }
    }
}
