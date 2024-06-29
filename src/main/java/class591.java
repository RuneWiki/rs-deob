import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class591 extends class599 implements class670 {

    @OriginalMember(owner = "client!og", name = "J", descriptor = "Lpq;")
    public class177 field8406;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Z")
    private boolean field8409;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public static int field8397 = -1;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Lpca;")
    public static class653 field8401 = new class653(4);

    @OriginalMember(owner = "client!og", name = "w", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Lgr;")
    private class396 field8411;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "[Ld;")
    public static class137[] field8415;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method3316(int arg0, byte arg1) {
        ++field8412;
        if (arg1 < -48) {
            class530 var2 = class242.method1402(-45, 11, arg0);
            var2.method3027((byte) -88);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I", line = 17)
    public final int method1923(boolean arg0) {
        if (!arg0) {
            this.method456((class635) null, -44);
        }
        ++field8413;
        return this.field8406.method1037((byte) 8);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Loa;Lbfa;IIIIIZIIIIII)V", line = 32)
    public class591(class635 arg0, class335 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class73.method466(-5, arg11, arg12));
        this.field8406 = new class177(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field8409 = ~arg1.field4407 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method454(int arg0) {
        ++field8407;
        return arg0 <= 49 ? false : this.field8406.method1032(-28959);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I", line = 62)
    public final int method444(byte arg0) {
        int var2 = -1 % ((arg0 - 7) / 46);
        ++field8402;
        return this.field8406.field2153;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Loa;I)V", line = 75)
    public final void method451(class635 arg0, int arg1) {
        if (arg1 != 31055) {
            this.field8409 = false;
        }
        ++field8405;
        class350 var3 = this.field8406.method1041(super.field8506, false, arg0, true, 262144, super.field8515, true);
        if (var3 != null) {
            int var4 = super.field8515 >> 9;
            int var5 = super.field8506 >> 9;
            class389 var6 = arg0.method297();
            var6.method228(super.field8515, super.field8508, super.field8506);
            this.field8406.method1034(var5, var4, var4, var6, var5, arg0, arg1 + -30928, var3, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILoa;I)Z", line = 101)
    public final boolean method457(int arg0, int arg1, class635 arg2, int arg3) {
        ++field8408;
        class350 var5 = this.field8406.method1041(super.field8506, false, arg2, true, 131072, super.field8515, false);
        if (var5 == null) {
            return false;
        } else if (arg1 != 1) {
            return true;
        } else {
            class389 var6 = arg2.method297();
            var6.method228(super.field8515 - -super.field8519, super.field8508, super.field8506 - -super.field8518);
            return var5.method910(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V", line = 122)
    public static void method3317(int arg0) {
        field8415 = null;
        if (arg0 == 0) {
            field8401 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(B)V", line = 133)
    public static final void method3318(byte arg0) {
        ++field8395;
        if (~class689.field9735 != 0 && class424.field5643 != -1) {
            int var1 = ((class370.field4804 - class621.field8797) * class380.field4935 >> 16) + class621.field8797;
            class380.field4935 += var1;
            if (~class380.field4935 > -65536) {
                class235.field2992 = false;
                class116.field1348 = false;
            } else {
                if (!class235.field2992) {
                    class116.field1348 = true;
                } else {
                    class116.field1348 = false;
                }
                class380.field4935 = 65535;
                class235.field2992 = true;
            }
            float var2 = (float) class380.field4935 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class4.field29 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var22 = class633.field8973[class689.field9735][var4][var5] * 3;
                int var23 = class633.field8973[class689.field9735][var4 + 1][var5] * 3;
                int var24 = (class633.field8973[class689.field9735][var4 + 2][var5] - -class633.field8973[class689.field9735][var4 + 2][var5] - class633.field8973[class689.field9735][var4 + 3][var5]) * 3;
                int var25 = class633.field8973[class689.field9735][var4][var5];
                int var26 = -var22 + var23;
                int var27 = var22 + var24 + -(var23 * 2);
                int var28 = -var25 + var23 + -var24 + class633.field8973[class689.field9735][var4 + 2][var5];
                var3[var5] = (((float) var28 * var2 + (float) var27) * var2 + (float) var26) * var2 + (float) var25;
            }
            class150.field1707 = (int) var3[1] * -1;
            class345.field4493 = (int) var3[0] + -(class682.field9685 * 512);
            class662.field9411 = (int) var3[2] + -(class146.field1642 * 512);
            float[] var6 = new float[3];
            int var7 = class484.field7058 * 2;
            for (int var8 = 0; var8 < 3; ++var8) {
                int var15 = class633.field8973[class424.field5643][var7][var8] * 3;
                int var16 = class633.field8973[class424.field5643][var7 - -1][var8] * 3;
                int var17 = (-class633.field8973[class424.field5643][var7 + 3][var8] - (-class633.field8973[class424.field5643][var7 - -2][var8] - class633.field8973[class424.field5643][var7 - -2][var8])) * 3;
                int var18 = class633.field8973[class424.field5643][var7][var8];
                int var19 = -var15 + var16;
                int var20 = -(var16 * 2) + var15 + var17;
                int var21 = class633.field8973[class424.field5643][var7 - -2][var8] + -var18 + var16 - var17;
                var6[var8] = (((float) var21 * var2 + (float) var20) * var2 + (float) var19) * var2 + (float) var18;
            }
            float var9 = var6[0] + -var3[0];
            float var10 = (var6[1] - var3[1]) * -1.0F;
            int var11 = -14 / ((arg0 - 65) / 43);
            float var12 = var6[2] + -var3[2];
            double var13 = Math.sqrt((double) (var9 * var9 + var12 * var12));
            class654.field9344 = (int) (Math.atan2((double) var10, var13) * 2607.5945876176133D) & 16383;
            class587.field8342 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var12)) & 16383;
            class352.field4616 = ((class633.field8973[class689.field9735][var4 + 2][3] + -class633.field8973[class689.field9735][var4][3]) * class380.field4935 >> 16) + class633.field8973[class689.field9735][var4][3];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILoa;)Lgr;", line = 235)
    public final class396 method450(int arg0, class635 arg1) {
        int var3 = 96 / ((47 - arg0) / 34);
        ++field8394;
        return this.field8411;
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(B)Z", line = 245)
    public static final boolean method3319(byte arg0) {
        ++field8398;
        if (arg0 < 106) {
            return true;
        } else {
            if (class140.field1599) {
                try {
                    if ((Boolean) class432.method2311(4975, "showingVideoAd", class485.field7068)) {
                        return false;
                    }
                    return true;
                } catch (Throwable var1) {
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Loa;B)V", line = 265)
    public final void method446(class635 arg0, byte arg1) {
        if (arg1 > -126) {
            this.method1923(false);
        }
        ++field8410;
        this.field8406.method1033(arg0, (byte) 96);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILoa;)Lba;", line = 278)
    public final class350 method455(int arg0, int arg1, class635 arg2) {
        if (arg1 > -20) {
            this.field8406 = null;
        }
        ++field8403;
        return this.field8406.method1041(0, false, arg2, true, arg0, 0, false);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)I", line = 289)
    public final int method443(byte arg0) {
        int var2 = 17 / ((-82 - arg0) / 37);
        ++field8396;
        return this.field8406.field2145;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)I", line = 299)
    public final int method447(byte arg0) {
        if (arg0 != -91) {
            return 38;
        } else {
            ++field8399;
            return this.field8406.field2139;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Loa;I)V", line = 310)
    public final void method456(class635 arg0, int arg1) {
        if (arg1 < 97) {
            this.method444((byte) -122);
        }
        ++field8414;
        this.field8406.method1040(262144, arg0);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Loa;I)Lok;", line = 322)
    public final class231 method442(class635 arg0, int arg1) {
        ++field8404;
        class350 var3 = this.field8406.method1041(super.field8506, false, arg0, true, 2048, super.field8515, true);
        if (var3 == null) {
            return null;
        } else {
            class389 var4 = arg0.method297();
            var4.method228(super.field8515 - -super.field8519, super.field8508, super.field8518 + super.field8506);
            class231 var5 = null;
            if (this.field8409) {
                var5 = class526.method2993(1, 32671);
            }
            if (arg1 != 0) {
                return null;
            } else {
                int var6 = super.field8515 >> 9;
                int var7 = super.field8506 >> 9;
                this.field8406.method1034(var7, var6, var6, var4, var7, arg0, 126, var3, true);
                if (this.field8406.field2126 != null) {
                    class211 var8 = this.field8406.field2126.method1241();
                    arg0.method301(var3, var8, var4, var5 == null ? null : var5.field2947[0], 0);
                } else {
                    var3.method904(var4, var5 == null ? null : var5.field2947[0], 0);
                }
                if (this.field8411 != null) {
                    class644.method3611(var3, super.field8515, this.field8411, (byte) -112, super.field8506, super.field8508);
                } else {
                    this.field8411 = class426.method2298(super.field8515, var3, 12409, super.field8506, super.field8508);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 368)
    public final void method452(int arg0) {
        ++field8400;
        if (arg0 != 29877) {
            field8397 = -84;
        }
    }
}
