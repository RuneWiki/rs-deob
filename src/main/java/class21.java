import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 extends class170 {

    @OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
    private int field341 = 4;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    private int field339 = 4;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lqk;")
    public static class207 field340 = class24.method212(255, ")3");

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!pc", name = "fb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!pc", name = "hb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!pc", name = "ib", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!pc", name = "jb", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!pc", name = "kb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!pc", name = "lb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!pc", name = "mb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!pc", name = "nb", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!pc", name = "eb", descriptor = "Lpk;")
    public static class99 field342;

    @OriginalMember(owner = "client!pc", name = "gb", descriptor = "[Lth;")
    public static class110[] field344;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static final void method122(byte arg0) {
        if (arg0 == 96) {
            class163.method1178((byte) -122, false);
            ++field334;
            System.gc();
            class193.method1345(10, 25);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        ++field347;
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field339 = arg0.method1045((byte) -66);
            }
        } else {
            this.field341 = arg0.method1045((byte) 114);
        }
        if (arg1 != 5877) {
            this.field339 = 105;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)I")
    public static final int method123(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -15466) {
            method124((byte) 99, (class99) null);
        }
        ++field350;
        if (arg2 <= arg0) {
            return arg3 < arg0 ? arg3 : arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLpk;)V")
    public static final void method124(byte arg0, class99 arg1) {
        ++field336;
        class213.field3780 = class165.method1196(false, class54.field1019, arg1);
        class113.field1969 = new int[256];
        for (int var2 = 0; ~var2 > -4; ++var2) {
            int var4 = class252.field4538[var2 + 1] >> 16 & 255;
            float var5 = (float) (class252.field4538[var2] >> 16 & 255);
            float var6 = (float) (255 & class252.field4538[var2] >> 8);
            float var7 = ((float) var4 + -var5) / 64.0F;
            int var8 = (65280 & class252.field4538[var2 + 1]) >> 8;
            float var9 = ((float) var8 - var6) / 64.0F;
            float var10 = (float) (255 & class252.field4538[var2]);
            int var11 = class252.field4538[var2 + 1] & 255;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class113.field1969[var2 * 64 - -var13] = class281.method1906((int) var10, class281.method1906((int) var6 << 8, (int) var5 << 16));
                var6 += var9;
                var10 += var12;
                var5 += var7;
            }
        }
        if (arg0 == -100) {
            for (int var3 = 192; ~var3 > -256; ++var3) {
                class113.field1969[var3] = class252.field4538[3];
            }
            class190.field3344 = new int[32768];
            class170.field3017 = new int[32768];
            class191.method1329((class130) null, arg0 ^ 32190);
            class17.field269 = new int[32768];
            class170.field2995 = new int[32768];
            class198.field3474 = new class139(128, 254);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)Lqk;")
    public static final class207 method125(int arg0, long arg1) {
        ++field345;
        if (~arg1 < -1L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                int var4 = 98 % ((37 - arg0) / 33);
                for (long var5 = arg1; ~var5 != -1L; var5 /= 37L) {
                    ++var3;
                }
                byte[] var7 = new byte[var3];
                while (~arg1 != -1L) {
                    long var9 = arg1;
                    arg1 /= 37L;
                    --var3;
                    var7[var3] = class192.field3380[(int) (-(arg1 * 37L) + var9)];
                }
                class207 var8 = new class207();
                var8.field3652 = var7;
                var8.field3663 = var7.length;
                return var8;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIBIIIIIII)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field335;
        class120 var13 = new class120();
        var13.field2068 = arg9;
        var13.field2078 = arg10;
        var13.field2080 = arg1;
        var13.field2073 = arg4;
        var13.field2075 = arg3;
        var13.field2074 = arg7;
        var13.field2070 = arg8;
        var13.field2083 = arg12;
        var13.field2072 = arg6;
        var13.field2077 = arg0;
        var13.field2082 = arg11;
        var13.field2079 = arg2;
        class154.field2667.method931(var13, 122);
        if (arg5 > -56) {
            field351 = 8;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field343;
        if (arg0 >= 0 && ~arg6 <= -1 && arg0 < 103 && arg6 < 103) {
            if (arg5 == 0) {
                class209 var8 = class280.method1903(arg4, arg0, arg6);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field3710 >>> 32);
                    if (arg1 == 2) {
                        var8.field3704 = new class232(var9, 2, 4 - -arg3, arg4, arg0, arg6, arg2, false, var8.field3704);
                        var8.field3712 = new class232(var9, 2, 3 & arg3 + 1, arg4, arg0, arg6, arg2, false, var8.field3712);
                    } else {
                        var8.field3704 = new class232(var9, arg1, arg3, arg4, arg0, arg6, arg2, false, var8.field3704);
                    }
                }
            }
            if (~arg5 == -2) {
                class28 var10 = class206.method1420(arg4, arg0, arg6);
                if (var10 != null) {
                    int var11 = Integer.MAX_VALUE & (int) (var10.field560 >>> 32);
                    if (arg1 != 4 && arg1 != 5) {
                        if (arg1 == 6) {
                            var10.field564 = new class232(var11, 4, arg3 - -4, arg4, arg0, arg6, arg2, false, var10.field564);
                        } else if (arg1 == 7) {
                            var10.field564 = new class232(var11, 4, (3 & arg3 + 2) - -4, arg4, arg0, arg6, arg2, false, var10.field564);
                        } else if (arg1 == 8) {
                            var10.field564 = new class232(var11, 4, arg3 + 4, arg4, arg0, arg6, arg2, false, var10.field564);
                            var10.field577 = new class232(var11, 4, (3 & arg3 + 2) - -4, arg4, arg0, arg6, arg2, false, var10.field577);
                        }
                    } else {
                        var10.field564 = new class232(var11, 4, arg3, arg4, arg0, arg6, arg2, false, var10.field564);
                    }
                }
            }
            if (arg5 == 2) {
                if (~arg1 == -12) {
                    arg1 = 10;
                }
                class288 var12 = class286.method1955(arg4, arg0, arg6);
                if (var12 != null) {
                    var12.field5136 = new class232((int) (var12.field5129 >>> 32) & Integer.MAX_VALUE, arg1, arg3, arg4, arg0, arg6, arg2, false, var12.field5136);
                }
            }
            if (~arg5 == -4) {
                class246 var13 = class74.method537(arg4, arg0, arg6);
                if (var13 != null) {
                    var13.field4465 = new class232(Integer.MAX_VALUE & (int) (var13.field4464 >>> 32), 22, arg3, arg4, arg0, arg6, arg2, false, var13.field4465);
                }
            }
        }
        if (arg7 > -40) {
            method123(37, 123, -68, 119);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            field342 = null;
        }
        ++field348;
        int[] var3 = super.field3001.method1538(arg0 + 109, arg1);
        if (super.field3001.field3835) {
            int var4 = class88.field1595 / this.field341;
            int var5 = class30.field620 / this.field339;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method1226(0, class30.field620 * var6 / var5, arg0 + 123);
            } else {
                var7 = this.method1226(0, 0, -51);
            }
            for (int var8 = 0; class88.field1595 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class88.field1595 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        ++field338;
        if (arg1) {
            field340 = null;
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        if (super.field3002.field1077) {
            int var4 = class30.field620 / this.field339;
            int var5 = class88.field1595 / this.field341;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg0 % var4;
                var7 = this.method1223(0, 98, class30.field620 * var6 / var4);
            } else {
                var7 = this.method1223(0, -102, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; class88.field1595 > var14; ++var14) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class88.field1595 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(I)V")
    public static void method128(int arg0) {
        field344 = null;
        field340 = null;
        field342 = null;
        if (arg0 > -118) {
            method123(-69, 60, 24, 82);
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public static final void method129(byte arg0) {
        if (class200.field3532 != null) {
            class200.field3532.method436(16138);
        }
        if (class34.field677 != null) {
            class34.field677.method436(16138);
        }
        if (arg0 != 8) {
            method129((byte) 14);
        }
        ++field337;
    }
}
