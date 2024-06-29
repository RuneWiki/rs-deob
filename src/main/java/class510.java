import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class510 extends class377 {

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "Z")
    private boolean field6381 = true;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    private int field6387 = 4096;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "[I")
    public static int[] field6380 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "J")
    public static long field6386 = 0L;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field6382 = 0;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field6383;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field6388;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    public static int field6390;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field6391;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Liu;")
    public static class541 field6389;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "[Lkk;")
    public static class179[] field6384;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(B)Z", line = 3)
    public static final boolean method2778(byte arg0) {
        ++field6390;
        if (arg0 != -42) {
            method2783(false, -61, (class158) null, -8, 66, 113, 82, 53, -62, 63, (int[]) null, -85, 17, 19, (int[]) null);
        }
        try {
            return class624.method3477(31);
        } catch (IOException var4) {
            class675.method3744((byte) 74);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class613.field8339 == null ? -1 : class613.field8339.method3745(120)) + "," + (class610.field8305 == null ? -1 : class610.field8305.method3745(-111)) + "," + (class660.field8961 == null ? -1 : class660.field8961.method3745(-64)) + " - " + class10.field100 + "," + (class67.field815.field508[0] + class227.field2938) + "," + (class67.field815.field511[0] + class522.field6612) + " - ";
            for (int var3 = 0; ~var3 > ~class10.field100 && ~var3 > -51; ++var3) {
                var2 = var2 + class222.field2585.field7318[var3] + ",";
            }
            class564.method2994((byte) 34, var2, var5);
            class349.method2010(false, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(IB)I", line = 38)
    public static final int method2779(int arg0, byte arg1) {
        if (arg1 > -107) {
            field6386 = -53L;
        }
        ++field6391;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 + -61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 59)
    public static final void method2780(int arg0) {
        ++field6383;
        int var1 = -91 % ((43 - arg0) / 57);
        if (class365.method2125((byte) -126)) {
            if (class350.field4526 == null) {
                class72.method569((byte) -128);
            }
            class110.field1374 = true;
            class127.field1547 = 0;
            try {
                class95.field1236 = class455.field5687.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)I", line = 82)
    public static final int method2781(boolean arg0) {
        if (!arg0) {
            return 97;
        } else {
            ++field6388;
            return 46;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)V", line = 96)
    public static void method2782(byte arg0) {
        field6380 = null;
        field6389 = null;
        field6384 = null;
        if (arg0 > -119) {
            method2782((byte) -23);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZILld;IIIIIII[IIII[I)I", line = 109)
    public static final int method2783(boolean arg0, int arg1, class158 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int[] arg14) {
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; var35 < 128; ++var35) {
                class497.field6221[var15][var35] = 0;
                class227.field2937[var15][var35] = 99999999;
            }
        }
        ++field6393;
        boolean var16;
        if (arg9 != 1) {
            if (arg9 == 2) {
                var16 = class587.method3262(arg12, arg4, arg8, arg2, arg1, arg5, arg3, arg6, arg7, -1, arg11);
            } else {
                var16 = class27.method166(arg9, arg5, arg6, arg11, arg2, arg7, arg4, arg3, (byte) 92, arg8, arg12, arg1);
            }
        } else {
            var16 = class129.method840(125, arg6, arg1, arg3, arg8, arg5, arg12, arg11, arg7, arg2, arg4);
        }
        int var17 = arg6 + -64;
        int var18 = arg1 - 64;
        int var19 = class189.field2245;
        int var20 = class20.field206;
        if (!var16) {
            if (!arg0) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= arg8 - -var23; ++var24) {
                for (int var25 = -var23 + arg7; ~(arg7 - -var23) <= ~var25; ++var25) {
                    int var26 = -var17 + var24;
                    int var27 = -var18 + var25;
                    if (~var26 <= -1 && var27 >= 0 && var26 < 128 && var27 < 128 && ~class227.field2937[var26][var27] > -101) {
                        int var28 = 0;
                        if (~var24 > ~arg8) {
                            var28 = -var24 + arg8;
                        } else if (var24 > arg8 - 1 + arg12) {
                            var28 = -arg12 - -1 + -arg8 + var24;
                        }
                        int var29 = 0;
                        if (~arg7 >= ~var25) {
                            if (~var25 < ~(arg5 + arg7 + -1)) {
                                var29 = 1 - (arg5 + arg7) + var25;
                            }
                        } else {
                            var29 = -var25 + arg7;
                        }
                        int var30 = var28 * var28 - -(var29 * var29);
                        if (var30 < var21 || ~var21 == ~var30 && var22 > class227.field2937[var26][var27]) {
                            var19 = var24;
                            var22 = class227.field2937[var26][var27];
                            var21 = var30;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (~arg6 == ~var19 && ~arg1 == ~var20) {
            return 0;
        } else {
            byte var31 = 0;
            if (arg13 >= -86) {
                field6386 = 125L;
            }
            class705.field9867[var31] = var19;
            int var37 = var31 + 1;
            class144.field1739[var31] = var20;
            int var32;
            int var33 = var32 = class497.field6221[var19 - var17][var20 - var18];
            while (~arg6 != ~var19 || ~arg1 != ~var20) {
                if (~var32 != ~var33) {
                    class705.field9867[var37] = var19;
                    var32 = var33;
                    class144.field1739[var37++] = var20;
                }
                if ((var33 & 1) == 0) {
                    if ((var33 & 4) != 0) {
                        --var20;
                    }
                } else {
                    ++var20;
                }
                if ((2 & var33) != 0) {
                    ++var19;
                } else if (~(8 & var33) != -1) {
                    --var19;
                }
                var33 = class497.field6221[-var17 + var19][-var18 + var20];
            }
            int var34 = 0;
            while (var37-- > 0) {
                arg10[var34] = class705.field9867[var37];
                arg14[var34++] = class144.field1739[var37];
                if (~var34 <= ~arg10.length) {
                    break;
                }
            }
            return var34;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)I", line = 286)
    public static final int method2784(int arg0) {
        if (arg0 != -29414) {
            return -41;
        } else {
            ++field6392;
            return class213.field2501;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 431)
    public class510() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I", line = 309)
    public final int[][] method23(int arg0, byte arg1) {
        int var3 = -88 % ((arg1 - 31) / 42);
        ++field6385;
        int[][] var4 = super.field4850.method2566(-27346, arg0);
        if (super.field4850.field5843) {
            int[] var5 = this.method2174(0, arg0 + -1 & class251.field3236, (byte) -123);
            int[] var6 = this.method2174(0, arg0, (byte) 119);
            int[] var7 = this.method2174(0, arg0 + 1 & class251.field3236, (byte) 82);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; class528.field6661 > var11; ++var11) {
                int var12 = (var7[var11] - var5[var11]) * this.field6387;
                int var13 = (var6[class376.field4836 & var11 + 1] + -var6[var11 + -1 & class376.field4836]) * this.field6387;
                int var14 = var13 >> 12;
                int var15 = var12 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = var15 * var15 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var16 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 != 0) {
                    var19 = var13 / var18;
                    var20 = 16777216 / var18;
                    var21 = var12 / var18;
                } else {
                    var19 = 0;
                    var21 = 0;
                    var20 = 0;
                }
                if (this.field6381) {
                    var19 = 2048 - -(var19 >> 1);
                    var20 = (var20 >> 1) + 2048;
                    var21 = (var21 >> 1) + 2048;
                }
                var8[var11] = var19;
                var9[var11] = var21;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILji;)V", line = 393)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field6379;
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field6381 = ~arg2.method3097((byte) 12) == -2;
            }
        } else {
            this.field6387 = arg2.method3031(-1);
        }
        int var5 = 6 / ((13 - arg1) / 55);
    }
}
