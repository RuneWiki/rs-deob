import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class228 extends class183 {

    @OriginalMember(owner = "client!nj", name = "fb", descriptor = "I")
    private int field3925 = 4096;

    @OriginalMember(owner = "client!nj", name = "W", descriptor = "Ljf;")
    public static class229 field3916 = null;

    @OriginalMember(owner = "client!nj", name = "cb", descriptor = "Ljf;")
    public static class229 field3922 = class212.method1457((byte) 85, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!nj", name = "Y", descriptor = "Ljf;")
    public static class229 field3918 = class212.method1457((byte) 104, "::fpsoff");

    @OriginalMember(owner = "client!nj", name = "bb", descriptor = "J")
    public static long field3921 = 0L;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!nj", name = "Z", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!nj", name = "ab", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!nj", name = "db", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!nj", name = "eb", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!nj", name = "gb", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(II)[I", line = 4)
    public final int[] method10(int arg0, int arg1) {
        if (arg1 != -1) {
            field3916 = (class229) null;
        }
        field3926++;
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int[] var4 = this.method1253(0, arg0 - 1 & class252.field4405, 77);
            int[] var5 = this.method1253(0, arg0, 109);
            int[] var6 = this.method1253(0, arg0 + 1 & class252.field4405, arg1 + 89);
            for (int var7 = 0; var7 < class22.field393; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field3925;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 + 1 & class52.field913] - var5[class52.field913 & var7 - 1]) * this.field3925;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 61)
    public class228() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lkh;B)V", line = 69)
    public static final void method1600(class14 arg0, byte arg1) {
        field3919++;
        byte[] var2 = new byte[24];
        if (class208.field3611 != null) {
            try {
                class208.field3611.method438(0L, -109);
                class208.field3611.method435(var2, 8);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method90(false, 24, var2, 0);
        if (arg1 != -75) {
            method1602(12);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILkh;I)V", line = 115)
    public final void method14(int arg0, class14 arg1, int arg2) {
        if (arg0 >= -43) {
            method1604(68, (byte) -5);
        }
        field3915++;
        if (arg2 == 0) {
            this.field3925 = arg1.method116(-1);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lkn;IILkh;)V", line = 145)
    public static final void method1601(class198 arg0, int arg1, int arg2, class14 arg3) {
        class127 var4 = new class127();
        field3924++;
        var4.field2274 = arg3.method93(false);
        var4.field2267 = arg3.method128((byte) 4);
        var4.field2270 = new class231[var4.field2274];
        var4.field2280 = new int[var4.field2274];
        var4.field2277 = new byte[var4.field2274][][];
        var4.field2275 = new class231[var4.field2274];
        var4.field2278 = new int[var4.field2274];
        var4.field2266 = new int[var4.field2274];
        if (arg2 > -35) {
            method1603(-119, -87, 20, -31, 26, (class196) null, 17, (class194) null, 115, 103, 53, true, -121, -23);
        }
        for (int var5 = 0; var5 < var4.field2274; var5++) {
            try {
                int var6 = arg3.method93(false);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method105((byte) -35).method1614((byte) 44));
                    String var18 = new String(arg3.method105((byte) -76).method1614((byte) 44));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method128((byte) 4);
                    }
                    var4.field2266[var5] = var6;
                    var4.field2278[var5] = var19;
                    var4.field2270[var5] = arg0.method1381(111, class1.method3(var17, -81), var18);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method105((byte) 96).method1614((byte) 44));
                    String var8 = new String(arg3.method105((byte) 116).method1614((byte) 44));
                    int var9 = arg3.method93(false);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method105((byte) -119).method1614((byte) 44));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method128((byte) 4);
                            var12[var13] = new byte[var14];
                            arg3.method101(-31322, 0, var12[var13], var14);
                        }
                    }
                    var4.field2266[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class1.method3(var10[var16], -99);
                    }
                    var4.field2275[var5] = arg0.method1385(var8, var15, (byte) -58, class1.method3(var7, -54));
                    var4.field2277[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2280[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2280[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2280[var5] = -3;
            } catch (Exception var28) {
                var4.field2280[var5] = -4;
            } catch (Throwable var29) {
                var4.field2280[var5] = -5;
            }
        }
        class105.field1818.method2079(var4, 107);
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 259)
    public static void method1602(int arg0) {
        field3922 = null;
        field3916 = null;
        if (arg0 != -1703193104) {
            field3921 = -77L;
        }
        field3918 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIILrl;ILcm;IIIZII)Lrl;", line = 280)
    public static final class196 method1603(int arg0, int arg1, int arg2, int arg3, int arg4, class196 arg5, int arg6, class194 arg7, int arg8, int arg9, int arg10, boolean arg11, int arg12, int arg13) {
        long var14 = (long) ((arg10 << 16) + (arg13 << 24) + arg8) - (-((long) arg0 << 32) - ((long) arg2 << 48));
        if (arg3 != 1) {
            return (class196) null;
        }
        class196 var16 = (class196) class305.field5161.method229(var14, arg3 - 15);
        field3914++;
        if (var16 == null) {
            byte var17;
            if (arg8 == 1) {
                var17 = 9;
            } else if (arg8 == 2) {
                var17 = 12;
            } else if (arg8 == 3) {
                var17 = 15;
            } else if (arg8 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class197 var20 = new class197(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int[][] var21 = new int[var18][var17];
            int var22 = var20.method1347(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class227.field3911[var27] * var25 + arg6 >> 16;
                    int var29 = class227.field3896[var27] * var24 + arg9 >> 16;
                    var21[var23][var26] = var20.method1347(var29, 0, var28);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                short var33 = (short) (((arg0 & 0x7F) * var32 + (arg2 & 0x7F) * var31 & 0x7F00) + ((arg0 & 0xFC00) * var32 + (arg2 & 0xFC00) * var31 & 0xFC0000) + ((arg0 & 0x380) * var32 + (arg2 & 0x380) * var31 & 0x38000) >> 8);
                byte var34 = (byte) (arg10 * var32 + arg13 * var31 >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method1340(var22, var21[0][(var35 + 1) % var17], var21[0][var35], (byte) 1, var33, var34);
                    } else {
                        var20.method1340(var21[var30 - 1][var35], var21[var30 - 1][(var35 + 1) % var17], var21[var30][(var35 + 1) % var17], (byte) 1, var33, var34);
                        var20.method1340(var21[var30 - 1][var35], var21[var30][(var35 + 1) % var17], var21[var30][var35], (byte) 1, var33, var34);
                    }
                }
            }
            var16 = var20.method1355(64, 768, -50, -10, -50);
            class305.field5161.method227(-25077, var16, var14);
        }
        int var36 = arg8 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = -var36;
        int var40 = var36;
        if (arg11) {
            if (arg12 > 1152 && arg12 < 1920) {
                var38 = var36 + 128;
            }
            if (arg12 > 128 && arg12 < 896) {
                var37 -= 128;
            }
            if (arg12 > 1664 || arg12 < 384) {
                var39 -= 128;
            }
            if (arg12 > 640 && arg12 < 1408) {
                var40 = var36 + 128;
            }
        }
        int var41 = arg5.method272();
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg5.method289();
        int var43 = arg5.method291();
        class158 var44 = null;
        if (var39 > var43) {
            var43 = var39;
        }
        if (var42 > var38) {
            var42 = var38;
        }
        int var45 = arg5.method284();
        if (var40 < var45) {
            var45 = var40;
        }
        if (arg7 != null) {
            int var46 = arg7.field3366[arg1];
            var44 = class5.method33(var46 >> 16, 24);
            arg1 = var46 & 0xFFFF;
        }
        class196 var47;
        if (var44 == null) {
            var47 = var16.method279(true, true);
            var47.method271((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method266((var41 + var42) / 2, 0, (var43 + var45) / 2);
        } else {
            var47 = var16.method279(!var44.method1058(arg1, (byte) 107), true);
            var47.method271((var42 - var41) / 2, 128, (var45 - var43) / 2);
            var47.method266((var41 + var42) / 2, 0, (var43 + var45) / 2);
            var47.method273(var44, arg1);
        }
        if (arg12 != 0) {
            var47.method268(arg12);
        }
        if (class108.field1900) {
            class239 var50 = (class239) var47;
            if (class282.method1984((byte) -74, arg6 + var43, arg9 + var41, class16.field254) != arg4 || class282.method1984((byte) -91, arg6 + var45, arg9 + var42, class16.field254) != arg4) {
                for (int var51 = 0; var51 < var50.field4212; var51++) {
                    var50.field4192[var51] += class282.method1984((byte) -112, var50.field4214[var51] + arg6, var50.field4186[var51] + arg9, class16.field254) - arg4;
                }
                var50.field4170.field4392 = false;
                var50.field4207.field3659 = false;
            }
        } else {
            class32 var48 = (class32) var47;
            if (arg4 != class282.method1984((byte) -96, arg6 + var43, arg9 + var41, class16.field254) || arg4 != class282.method1984((byte) -99, arg6 + var45, arg9 + var42, class16.field254)) {
                for (int var49 = 0; var49 < var48.field552; var49++) {
                    var48.field571[var49] += class282.method1984((byte) -104, var48.field561[var49] + arg6, var48.field553[var49] + arg9, class16.field254) - arg4;
                }
                var48.field546 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)V", line = 508)
    public static final void method1604(int arg0, byte arg1) {
        field3917++;
        int var2 = 22 / ((-arg1 - 47) / 36);
        if (class111.field1960 == arg0 && arg0 != 0) {
            class210 var3 = class15.field228[arg0];
            var3.method484(class317.field5357);
        }
    }
}
