import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class322 extends class517 {

    @OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
    private int field5079 = -1;

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
    private int field5085 = -1;

    @OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
    public int field5073;

    @OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
    public int field5083;

    @OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
    public int field5081;

    @OriginalMember(owner = "client!bv", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field5087 = new String[] { method2731(method2730("V9q}H")), method2731(method2730("V9qzH")), method2731(method2730("Oaq\u0015\u001d")), method2731(method2730("V9q\u0007\tZ&+\u0005H")), method2731(method2730("Z:3W")), method2731(method2730("V9q~H")), method2731(method2730("V9q\u007fH")), method2731(method2730("C&1")), method2731(method2730("V9qxH")), method2731(method2730("V9q|H")), method2731(method2730("V9qyH")) };

    @OriginalMember(owner = "client!bv", name = "I", descriptor = "I")
    public static int field5074 = 0;

    @OriginalMember(owner = "client!bv", name = "E", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!bv", name = "B", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!bv", name = "w", descriptor = "I")
    public static int field5077;

    @OriginalMember(owner = "client!bv", name = "K", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
    public static int field5084;

    @OriginalMember(owner = "client!bv", name = "D", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!bv", name = "A", descriptor = "Lla;")
    public static class476 field5080;

    @OriginalMember(owner = "client!bv", name = "y", descriptor = "[[S")
    public static short[][] field5078;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
    public final void method705(int arg0) {
        try {
            ++field5086;
            OpenGL.glFramebufferTexture3DEXT(this.field5079, this.field5085, super.field7473, 0, 0, 0);
            this.field5085 = -1;
            this.field5079 = -1;
            if (arg0 > -115) {
                field5080 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5087[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "([Ljava/lang/String;IZ[SI)V")
    public static final void method2724(String[] arg0, int arg1, boolean arg2, short[] arg3, int arg4) {
        try {
            ++field5082;
            if (!arg2) {
                method2724((String[]) null, 106, false, (short[]) null, 38);
            }
            if (~arg1 > ~arg4) {
                int var5 = (arg1 + arg4) / 2;
                int var6 = arg1;
                String var7 = arg0[var5];
                arg0[var5] = arg0[arg4];
                arg0[arg4] = var7;
                short var8 = arg3[var5];
                arg3[var5] = arg3[arg4];
                arg3[arg4] = var8;
                for (int var9 = arg1; ~var9 > ~arg4; ++var9) {
                    if (var7 == null || arg0[var9] != null && ~arg0[var9].compareTo(var7) > ~(var9 & 1)) {
                        String var10 = arg0[var9];
                        arg0[var9] = arg0[var6];
                        arg0[var6] = var10;
                        short var11 = arg3[var9];
                        arg3[var9] = arg3[var6];
                        arg3[var6++] = var11;
                    }
                }
                arg0[arg4] = arg0[var6];
                arg0[var6] = var7;
                arg3[arg4] = arg3[var6];
                arg3[var6] = var8;
                method2724(arg0, arg1, true, arg3, var6 + -1);
                method2724(arg0, var6 + 1, true, arg3, arg4);
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field5087[5] + (arg0 != null ? field5087[2] : field5087[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5087[2] : field5087[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(CB)C")
    public static final char method2725(char arg0, byte arg1) {
        try {
            if (arg1 != 124) {
                return (char) 65494;
            } else {
                ++field5075;
                if (arg0 != ' ' && arg0 != 160 && arg0 != '_' && ~arg0 != -46) {
                    if (arg0 != '[' && arg0 != ']' && ~arg0 != -36) {
                        if (~arg0 != -225 && arg0 != 225 && ~arg0 != -227 && arg0 != 228 && arg0 != 227 && arg0 != 192 && arg0 != 193 && arg0 != 194 && arg0 != 196 && ~arg0 != -196) {
                            if (~arg0 != -233 && ~arg0 != -234 && arg0 != 234 && ~arg0 != -236 && arg0 != 200 && arg0 != 201 && arg0 != 202 && ~arg0 != -204) {
                                if (~arg0 != -238 && ~arg0 != -239 && ~arg0 != -240 && ~arg0 != -206 && ~arg0 != -207 && arg0 != 207) {
                                    if (arg0 != 242 && ~arg0 != -244 && ~arg0 != -245 && ~arg0 != -247 && ~arg0 != -246 && arg0 != 210 && ~arg0 != -212 && arg0 != 212 && ~arg0 != -215 && arg0 != 213) {
                                        if (arg0 != 249 && ~arg0 != -251 && arg0 != 251 && ~arg0 != -253 && arg0 != 217 && ~arg0 != -219 && arg0 != 219 && arg0 != 220) {
                                            if (~arg0 != -232 && arg0 != 199) {
                                                if (arg0 != 255 && ~arg0 != -377) {
                                                    if (arg0 != 241 && arg0 != 209) {
                                                        return arg0 == 223 ? 'b' : Character.toLowerCase(arg0);
                                                    } else {
                                                        return 'n';
                                                    }
                                                } else {
                                                    return 'y';
                                                }
                                            } else {
                                                return 'c';
                                            }
                                        } else {
                                            return 'u';
                                        }
                                    } else {
                                        return 'o';
                                    }
                                } else {
                                    return 'i';
                                }
                            } else {
                                return 'e';
                            }
                        } else {
                            return 'a';
                        }
                    } else {
                        return arg0;
                    }
                } else {
                    return '_';
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5087[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lffa;IIII[BI)V")
    public class322(class197 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        try {
            this.field5073 = arg2;
            this.field5083 = arg4;
            this.field5081 = arg3;
            super.field7474.method1733(this, 17237);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field7473, 0, super.field7464, this.field5073, this.field5081, this.field5083, 0, arg6, 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
            this.method3923(25768, true);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field5087[3] + (arg0 != null ? field5087[2] : field5087[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5087[2] : field5087[4]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lffa;IIII)V")
    public class322(class197 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        try {
            this.field5083 = arg4;
            this.field5073 = arg2;
            this.field5081 = arg3;
            super.field7474.method1733(this, 17237);
            OpenGL.glTexImage3Dub(super.field7473, 0, super.field7464, this.field5073, this.field5081, this.field5083, 0, class330.method2790(true, super.field7464), 5121, (byte[]) null, 0);
            this.method3923(25768, true);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5087[3] + (arg0 != null ? field5087[2] : field5087[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIBI)V")
    public final void method2726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        try {
            super.field7474.method1733(this, 17237);
            ++field5076;
            if (arg6 > -127) {
                field5078 = null;
            }
            OpenGL.glCopyTexSubImage3D(super.field7473, 0, arg1, arg0, arg5, arg4, arg7, arg3, arg2);
            OpenGL.glFlush();
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5087[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "g", descriptor = "(I)I")
    public static final int method2727(int arg0) {
        try {
            ++field5084;
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            if (class580.field8601.field388 && !class580.field8601.field395) {
                var1 = true;
                if (class306.field4779.field99 < 512 && class306.field4779.field99 != 0) {
                    var1 = false;
                }
                if (class33.field386.startsWith(field5087[7])) {
                    var2 = true;
                    var3 = true;
                } else {
                    var2 = true;
                }
            }
            if (class324.field5102) {
                var3 = false;
            }
            if (class90.field1027) {
                var2 = false;
            }
            if (class171.field2372) {
                var1 = false;
            }
            if (!var1 && !var2 && !var3) {
                return class613.method4534(-124);
            } else {
                int var4 = -1;
                int var5 = -1;
                if (var1) {
                    try {
                        var4 = class537.method4049(2, 16711680, 1000);
                    } catch (Exception var17) {
                    }
                }
                int var6 = -1;
                if (var3) {
                    try {
                        var6 = class537.method4049(3, 16711680, 1000);
                        if (~class289.field4305.field812.method1610(false) == -4) {
                            class521 var7 = class610.field8913.method493();
                            long var8 = 281474976710655L & var7.field7629;
                            int var10 = var7.field7624;
                            if (var10 != 4318) {
                                if (~var10 == -4099) {
                                    var2 &= var8 >= 60129613779L;
                                }
                            } else {
                                var2 &= ~var8 <= -64425238955L;
                            }
                        }
                    } catch (Exception var16) {
                    }
                }
                if (var2) {
                    try {
                        var5 = class537.method4049(1, 16711680, 1000);
                    } catch (Exception var15) {
                    }
                }
                if (var4 == -1 && var5 == -1 && ~var6 == 0) {
                    return class613.method4534(-126);
                } else {
                    int var11 = (int) ((float) var6 * 1.1F);
                    int var12 = (int) ((float) var5 * 1.1F);
                    int var13 = 71 / ((-70 - arg0) / 50);
                    if (~var4 < ~var11 && ~var4 < ~var12) {
                        return class146.method1232(-1, var4);
                    } else {
                        return ~var12 <= ~var11 ? class352.method2887(var12, 1, true) : class352.method2887(var11, 3, true);
                    }
                }
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field5087[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
    public static final void method2728(int arg0) {
        try {
            ++field5077;
            if (arg0 != -30856) {
                method2728(18);
            }
            for (int var1 = 0; ~var1 > ~class172.field2402; ++var1) {
                int var2 = class545.field8146[var1];
                class612 var3 = ((class383) class207.field3184.method977((long) var2, 1)).field5799;
                int var4 = class430.field6332.method1455((byte) 62);
                if ((var4 & 16) != 0) {
                    var4 += class430.field6332.method1455((byte) 62) << 8;
                }
                if (~(var4 & 8192) != -1) {
                    var4 += class430.field6332.method1455((byte) 62) << 16;
                }
                if (~(16384 & var4) != -1) {
                    var3.field3831 = class430.field6332.method1414(1);
                    var3.field3837 = class430.field6332.method1462(true);
                    var3.field3823 = class430.field6332.method1447(false);
                    var3.field3798 = (byte) class430.field6332.method1426(-14788);
                    var3.field3803 = class375.field5711 - -class430.field6332.method1445((byte) 102);
                    var3.field3824 = class375.field5711 + class430.field6332.method1445((byte) 115);
                }
                if (~(1024 & var4) != -1) {
                    int var5 = class430.field6332.method1445((byte) 121);
                    var3.field3829 = class430.field6332.method1409(-86);
                    var3.field3795 = class430.field6332.method1455((byte) 62);
                    var3.field3770 = var5 & 32767;
                    var3.field3846 = ~(var5 & 32768) != -1;
                    var3.field3768 = class375.field5711 + var3.field3829 + var3.field3770;
                }
                if (~(2048 & var4) != -1) {
                    var3.field3818 = class430.field6332.method1447(false);
                    var3.field3767 = class430.field6332.method1434(-117);
                    var3.field3791 = class430.field6332.method1414(arg0 + 30857);
                    var3.field3788 = class430.field6332.method1434(-66);
                    var3.field3827 = class430.field6332.method1445((byte) 117) + class375.field5711;
                    var3.field3833 = class430.field6332.method1445((byte) 123) + class375.field5711;
                    var3.field3832 = class430.field6332.method1426(arg0 + 16068);
                    var3.field3788 += var3.field3863[0];
                    var3.field3858 = 0;
                    var3.field3767 += var3.field3863[0];
                    var3.field3862 = 1;
                    var3.field3818 += var3.field3859[0];
                    var3.field3791 += var3.field3859[0];
                }
                if ((128 & var4) != 0) {
                    var3.field3782 = class430.field6332.method1423(84);
                    var3.field3812 = 100;
                }
                if (~(var4 & 512) != -1) {
                    int var6 = class430.field6332.method1455((byte) 62);
                    int[] var7 = new int[var6];
                    int[] var8 = new int[var6];
                    int[] var9 = new int[var6];
                    for (int var10 = 0; var6 > var10; ++var10) {
                        int var11 = class430.field6332.method1445((byte) 126);
                        if (var11 == 65535) {
                            var11 = -1;
                        }
                        var7[var10] = var11;
                        var8[var10] = class430.field6332.method1409(-95);
                        var9[var10] = class430.field6332.method1445((byte) 116);
                    }
                    class512.method3858((byte) 104, var3, var9, var8, var7);
                }
                if (~(var4 & 32768) != -1) {
                    int var12 = var3.field8947.field7151.length;
                    int var13 = 0;
                    if (var3.field8947.field7145 != null) {
                        var13 = var3.field8947.field7145.length;
                    }
                    int var14 = 0;
                    if (var3.field8947.field7120 != null) {
                        var14 = var3.field8947.field7120.length;
                    }
                    int var15 = class430.field6332.method1409(-125);
                    if ((var15 & 1) == 1) {
                        var3.field8944 = null;
                    } else {
                        int[] var16 = null;
                        if (~(2 & var15) == -3) {
                            var16 = new int[var12];
                            for (int var17 = 0; var12 > var17; ++var17) {
                                var16[var17] = class430.field6332.method1441(46);
                            }
                        }
                        short[] var18 = null;
                        if ((4 & var15) == 4) {
                            var18 = new short[var13];
                            for (int var19 = 0; var13 > var19; ++var19) {
                                var18[var19] = (short) class430.field6332.method1444(class219.method1916(arg0, -30917));
                            }
                        }
                        short[] var20 = null;
                        if ((8 & var15) == 8) {
                            var20 = new short[var14];
                            for (int var21 = 0; var21 < var14; ++var21) {
                                var20[var21] = (short) class430.field6332.method1432((byte) -102);
                            }
                        }
                        long var22 = (long) (var3.field8954++) << 32 | (long) var2;
                        var3.field8944 = new class431(var22, var16, var18, var20);
                    }
                }
                if ((131072 & var4) != 0) {
                    int var24 = class430.field6332.method1444(arg0 + 30975);
                    if (var24 == 65535) {
                        var24 = -1;
                    }
                    int var25 = class430.field6332.method1429((byte) 61);
                    int var26 = class430.field6332.method1409(-84);
                    int var27 = 7 & var26;
                    int var28 = var26 >> 3 & 15;
                    if (~var28 == -16) {
                        var28 = -1;
                    }
                    var3.method2107(var24, -127, var28, var27, 2, var25);
                }
                if (~(var4 & 1) != -1) {
                    int var29 = class430.field6332.method1445((byte) 121);
                    int var30 = class430.field6332.method1400(65280);
                    if (var29 == 65535) {
                        var29 = -1;
                    }
                    int var31 = class430.field6332.method1455((byte) 62);
                    int var32 = var31 & 7;
                    int var33 = var31 >> 3 & 15;
                    if (var33 == 15) {
                        var33 = -1;
                    }
                    var3.method2107(var29, -92, var33, var32, 0, var30);
                }
                if (~(256 & var4) != -1) {
                    int var34 = class430.field6332.method1409(-82);
                    int[] var35 = new int[var34];
                    int[] var36 = new int[var34];
                    for (int var37 = 0; ~var34 < ~var37; ++var37) {
                        int var38 = class430.field6332.method1444(-119);
                        if ((var38 & 49152) != 49152) {
                            var35[var37] = var38;
                        } else {
                            int var39 = class430.field6332.method1444(arg0 ^ 30974);
                            var35[var37] = class544.method4107(var38 << 16, var39);
                        }
                        var36[var37] = class430.field6332.method1432((byte) -25);
                    }
                    var3.method2096(95, var36, var35);
                }
                if ((524288 & var4) != 0) {
                    var3.field8938 = class430.field6332.method1423(-43);
                    if ("".equals(var3.field8938) || var3.field8938.equals(var3.field8947.field7136)) {
                        var3.field8938 = var3.field8947.field7136;
                    }
                }
                if (~(262144 & var4) != -1) {
                    var3.field8945 = class430.field6332.method1444(-4);
                    if (var3.field8945 == 65535) {
                        var3.field8945 = var3.field8947.field7172;
                    }
                }
                if (~(65536 & var4) != -1) {
                    int var40 = var3.field8947.field7152.length;
                    int var41 = 0;
                    if (var3.field8947.field7145 != null) {
                        var41 = var3.field8947.field7145.length;
                    }
                    byte var42 = 0;
                    if (var3.field8947.field7120 != null) {
                        var41 = var3.field8947.field7120.length;
                    }
                    int var43 = class430.field6332.method1431(-95);
                    if ((1 & var43) != 1) {
                        int[] var44 = null;
                        if ((2 & var43) == 2) {
                            var44 = new int[var40];
                            for (int var45 = 0; var45 < var40; ++var45) {
                                var44[var45] = class430.field6332.method1445((byte) 110);
                            }
                        }
                        short[] var46 = null;
                        if ((4 & var43) == 4) {
                            var46 = new short[var41];
                            for (int var47 = 0; ~var41 < ~var47; ++var47) {
                                var46[var47] = (short) class430.field6332.method1441(arg0 + 30933);
                            }
                        }
                        short[] var48 = null;
                        if (~(8 & var43) == -9) {
                            var48 = new short[var42];
                            for (int var49 = 0; var42 > var49; ++var49) {
                                var48[var49] = (short) class430.field6332.method1432((byte) -116);
                            }
                        }
                        long var50 = (long) (var3.field8951++) << 32 | (long) var2;
                        new class431(var50, var44, var46, var48);
                    }
                }
                if ((var4 & 4096) != 0) {
                    int var52 = class430.field6332.method1432((byte) -81);
                    int var53 = class430.field6332.method1449(arg0 ^ -30968);
                    if (~var52 == -65536) {
                        var52 = -1;
                    }
                    int var54 = class430.field6332.method1455((byte) 62);
                    int var55 = 7 & var54;
                    int var56 = (127 & var54) >> 3;
                    if (var56 == 15) {
                        var56 = -1;
                    }
                    var3.method2107(var52, arg0 ^ 30975, var56, var55, 1, var53);
                }
                if (~(32 & var4) != -1) {
                    int[] var57 = new int[4];
                    for (int var58 = 0; ~var58 > -5; ++var58) {
                        var57[var58] = class430.field6332.method1432((byte) -96);
                        if (~var57[var58] == -65536) {
                            var57[var58] = -1;
                        }
                    }
                    int var59 = class430.field6332.method1455((byte) 62);
                    class606.method4489(var3, false, var59, var57);
                }
                if (~(var4 & 2) != -1) {
                    var3.field8932 = class430.field6332.method1445((byte) 120);
                    var3.field8933 = class430.field6332.method1445((byte) 102);
                }
                if ((64 & var4) != 0) {
                    var3.field3842 = class430.field6332.method1441(32);
                    if (var3.field3842 == 65535) {
                        var3.field3842 = -1;
                    }
                }
                if ((4 & var4) != 0) {
                    int var60 = class430.field6332.method1426(-14788);
                    if (var60 > 0) {
                        for (int var61 = 0; var60 > var61; ++var61) {
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = class430.field6332.method1425(65);
                            int var65 = -1;
                            if (~var64 != -32768) {
                                if (var64 == 32766) {
                                    var64 = -1;
                                } else {
                                    var63 = class430.field6332.method1425(127);
                                }
                            } else {
                                var64 = class430.field6332.method1425(34);
                                var63 = class430.field6332.method1425(21);
                                var62 = class430.field6332.method1425(98);
                                var65 = class430.field6332.method1425(119);
                            }
                            int var66 = class430.field6332.method1425(arg0 + 30952);
                            int var67 = class430.field6332.method1426(arg0 ^ 16708);
                            var3.method2109(var63, var66, var67, (byte) 111, var65, var62, var64, class375.field5711);
                        }
                    }
                }
                if (~(var4 & 8) != -1) {
                    if (var3.field8947.method3747(arg0 ^ -5020)) {
                        class136.method1153((byte) 111, var3);
                    }
                    var3.method4519(true, class262.field4035.method4250(class430.field6332.method1445((byte) 101), 2));
                    var3.method2095((byte) -80, var3.field8947.field7159);
                    var3.field3810 = var3.field8947.field7180 << 3;
                    if (var3.field8947.method3747(27420)) {
                        class483.method3682(var3.field3859[0], 0, var3, 29075, var3.field6200, (class726) null, var3.field3863[0], (class198) null);
                    }
                }
            }
        } catch (RuntimeException var69) {
            throw class759.method5498(var69, field5087[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "(I)V")
    public static void method2729(int arg0) {
        try {
            if (arg0 == 1360262563) {
                field5078 = null;
                field5080 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5087[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2730(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 96);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2731(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
