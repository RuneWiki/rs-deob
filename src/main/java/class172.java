import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class172 extends class168 implements class303 {

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Ldj;")
    public class147 field2594;

    @OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
    private boolean field2608;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "[I")
    public static int[] field2595 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field2601 = -1;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field2596;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field2597;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field2598;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field2600;

    @OriginalMember(owner = "client!to", name = "A", descriptor = "I")
    public static int field2602;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!to", name = "D", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!to", name = "E", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!to", name = "F", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!to", name = "I", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!to", name = "J", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!to", name = "K", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!to", name = "L", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!to", name = "M", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IFIIIFIF)[F", line = 4)
    public static final float[] method1171(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7) {
        ++field2613;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg6 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg6 * 0.024543693F));
        float var12 = 1.0F - var10;
        var8[2] = var11;
        var8[3] = 0.0F;
        var8[5] = 0.0F;
        var8[0] = var10;
        var8[6] = -var11;
        var8[8] = var10;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[1] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg2 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -var15 + 1.0F;
        float var18 = -((float) Math.sqrt((double) (-(var15 * var15) + 1.0F)));
        float var19 = (float) Math.sqrt((double) (arg0 * arg0 + arg3 * arg3));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg3) / var19;
                var16 = (float) arg0 / var19;
            }
            var13[5] = var14 * var18;
            var13[8] = var16 * var16 * var17 + var15;
            var13[6] = var14 * var16 * var17;
            var13[7] = -var14 * var18;
            var13[1] = var16 * var18;
            var13[0] = var14 * var14 * var17 + var15;
            var13[3] = -var16 * var18;
            var13[4] = var15;
            var13[2] = var14 * var16 * var17;
            var9[0] = var8[2] * var13[6] + var8[1] * var13[3] + var8[0] * var13[0];
            var9[1] = var8[2] * var13[7] + var8[1] * var13[4] + var8[0] * var13[1];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[3] * var13[0] + var8[4] * var13[3];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[7] = var8[8] * var13[7] + var8[6] * var13[1] + var8[7] * var13[4];
            var9[8] = var8[8] * var13[8] + var8[6] * var13[2] + var8[7] * var13[5];
        }
        var9[4] *= arg1;
        var9[7] *= arg5;
        var9[8] *= arg5;
        var9[5] *= arg1;
        var9[3] *= arg1;
        var9[6] *= arg5;
        var9[0] *= arg7;
        var9[1] *= arg7;
        if (arg4 >= -43) {
            field2601 = 13;
        }
        var9[2] *= arg7;
        return var9;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 90)
    public static final void method1172(String arg0, byte arg1, boolean arg2) {
        ++field2610;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = !arg2 ? 0 : 32768;
        int var7 = (!arg2 ? class188.field2772.field3150 : class188.field2772.field3148) + var6;
        if (arg1 >= -94) {
            method1174((byte) -67);
        }
        for (int var8 = var6; var7 > var8; ++var8) {
            class148 var11 = class188.field2772.method1387((byte) 109, var8);
            if (var11.field2270 && var11.method1063(76).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class145.field2136 = null;
                    class88.field1426 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class515.field7538 = 0;
        class88.field1426 = var5;
        class145.field2136 = var4;
        String[] var9 = new String[class88.field1426];
        for (int var10 = 0; ~var10 > ~class88.field1426; ++var10) {
            var9[var10] = class188.field2772.method1387((byte) 109, var4[var10]).method1063(84);
        }
        class507.method3006(var9, class145.field2136, false);
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)I", line = 164)
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return -50;
        } else {
            ++field2597;
            return this.field2594.field2247;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)I", line = 176)
    public final int method170(byte arg0) {
        int var2 = -15 % ((arg0 - -11) / 47);
        ++field2607;
        return this.field2594.field2255;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIII)V", line = 187)
    public static final void method1173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2612;
        int var8 = arg1 + -334;
        if (var8 >= 0) {
            if (~var8 < -101) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = (-class486.field6996 + class97.field1557) * var8 / 100 + class486.field6996;
        int var10 = arg4 * var9 >> 8;
        int var11 = -arg7 + 16384 & 16383;
        int var12 = -arg2 + 16384 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (~var11 != -1) {
            var14 = class51.field743[var11] * -var10 >> 15;
            var15 = class51.field731[var11] * var10 >> 15;
        }
        if (~var12 != -1) {
            var13 = class51.field743[var12] * var15 >> 15;
            var15 = class51.field731[var12] * var15 >> 15;
        }
        class118.field1848 = -var13 + arg3;
        if (arg5 != -447) {
            field2601 = 69;
        }
        class49.field706 = arg2;
        class153.field2357 = arg7;
        class159.field2421 = -var14 + arg6;
        class455.field6641 = 0;
        class108.field1747 = arg0 - var15;
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lza;Lpm;IIIIIZIII)V", line = 239)
    public class172(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class275.method1608((byte) 121, arg9, arg8));
        this.field2594 = new class147(arg0, arg1, arg8, arg9, arg2, arg3, super.field2565, super.field2558, arg7, arg10);
        this.field2608 = arg1.field1697 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z", line = 248)
    public final boolean method169(int arg0) {
        if (arg0 != -28206) {
            return true;
        } else {
            ++field2609;
            return false;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Lza;I)V", line = 261)
    public final void method166(class295 arg0, int arg1) {
        ++field2603;
        class285 var3 = this.field2594.method1054(true, super.field2558, true, arg0, 262144, super.field2565, true);
        if (arg1 <= 7) {
            this.field2594 = null;
        }
        if (var3 != null) {
            int var4 = super.field2565 >> 7;
            int var5 = super.field2558 >> 7;
            this.field2594.method1049(0, arg0, var5, var4, var4, false, var3, var5);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 283)
    public final int method159(int arg0) {
        ++field2606;
        int var2 = 80 % ((arg0 - 78) / 46);
        return this.field2594.field2224;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V", line = 293)
    public final void method165(int arg0) {
        if (arg0 != -8698) {
            field2601 = -73;
        }
        ++field2596;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(B)V", line = 303)
    public static void method1174(byte arg0) {
        if (arg0 >= -37) {
            method1172((String) null, (byte) -13, true);
        }
        field2595 = null;
    }

    @OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V", line = 318)
    public final void method168(int arg0) {
        ++field2598;
        int var2 = 25 % ((43 - arg0) / 56);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lza;I)V", line = 333)
    public final void method156(class295 arg0, int arg1) {
        ++field2611;
        if (arg1 < -109) {
            this.field2594.method1048(arg0, -15800);
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z", line = 347)
    public final boolean method160(byte arg0) {
        ++field2604;
        return arg0 != 112 ? false : this.field2594.method1051(17971);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBILza;)Z", line = 358)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field2605;
        if (arg1 < 58) {
            return false;
        } else {
            class285 var5 = this.field2594.method1054(true, super.field2558, false, arg3, 131072, super.field2565, false);
            if (var5 == null) {
                return false;
            } else {
                class512 var6 = arg3.method541();
                var6.method955(super.field2565, super.field2561, super.field2558);
                return var5.method684(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(Lza;I)V", line = 380)
    public final void method164(class295 arg0, int arg1) {
        ++field2600;
        this.field2594.method1061(arg0, -1);
        if (arg1 != 1907) {
            this.method168(-39);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILza;B)Le;", line = 391)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            return null;
        } else {
            ++field2602;
            return this.field2594.method1054(true, 0, false, arg1, arg0, 0, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Llb;IZIBILza;)V", line = 402)
    public final void method161(class186 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, class295 arg6) {
        if (arg4 <= 54) {
            this.method170((byte) -43);
        }
        ++field2593;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLza;)Lql;", line = 414)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field2592;
        class285 var3 = this.field2594.method1054(true, super.field2558, false, arg1, 2048, super.field2565, true);
        if (var3 == null) {
            return null;
        } else {
            class512 var4 = arg1.method541();
            var4.method955(super.field2565, super.field2561, super.field2558);
            class121 var5 = null;
            if (this.field2608) {
                var5 = class399.method2364(1, -29752);
            }
            if (this.field2594.field2235 != null) {
                class334 var6 = this.field2594.field2235.method2731();
                arg1.method553(var3, var6, var4, var5 != null ? var5.field1878[0] : null, 0);
            } else {
                var3.method701(var4, var5 == null ? null : var5.field1878[0], 0);
            }
            int var7 = super.field2565 >> 7;
            int var8 = super.field2558 >> 7;
            this.field2594.method1049(arg0 + 96, arg1, var8, var7, var7, true, var3, var8);
            return arg0 != -96 ? null : var5;
        }
    }
}
