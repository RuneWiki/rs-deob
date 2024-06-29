import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class329 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Z")
    public boolean field4945 = false;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field4954 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public int field4950;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field4955;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Lph;")
    public static class361 field4953;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lrc;")
    public static class83 field4952;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZZI)Lwi;", line = 6)
    public final class234 method2278(boolean arg0, boolean arg1, int arg2) {
        field4949++;
        class234 var4 = (class234) class59.field866.method461((byte) 120, (long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field4950));
        if (var4 != null) {
            return var4;
        }
        class36.field530.method2514((byte) 109, this.field4950);
        class234 var5 = class296.method2110(0, class36.field530, (byte) 82, this.field4950);
        if (!arg0) {
            field4954 = 0;
        }
        if (var5 != null) {
            var5.method1744(class203.field2994, class240.field3577, class72.field1055);
            var5.field3713 = var5.field3716;
            var5.field3719 = var5.field3715;
            if (arg1) {
                var5.method1738();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1739();
            }
            class59.field866.method460(var5, -26089, (long) (this.field4950 | arg2 << 16 | (arg1 ? 262144 : 0)));
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 45)
    public static void method2279(int arg0) {
        field4952 = null;
        field4953 = null;
        if (arg0 < 53) {
            field4954 = 76;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V", line = 62)
    public static final void method2280(int arg0, int arg1) {
        class264.field4043--;
        int var2 = -62 / ((-arg0 - 12) / 52);
        field4948++;
        if (class264.field4043 == arg1) {
            return;
        }
        class84.method687(class158.field2274, arg1 + 1, class158.field2274, arg1, class264.field4043 - arg1);
        class84.method687(class281.field4267, arg1 + 1, class281.field4267, arg1, class264.field4043 - arg1);
        class84.method689(class324.field4886, arg1 + 1, class324.field4886, arg1, class264.field4043 - arg1);
        class84.method686(class216.field3186, arg1 + 1, class216.field3186, arg1, class264.field4043 - arg1);
        class84.method688(class117.field1664, arg1 + 1, class117.field1664, arg1, class264.field4043 - arg1);
        class84.method689(class286.field4313, arg1 + 1, class286.field4313, arg1, class264.field4043 - arg1);
        class84.method689(class172.field2489, arg1 + 1, class172.field2489, arg1, class264.field4043 - arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZLsb;)V", line = 88)
    public final void method2281(int arg0, boolean arg1, class190 arg2) {
        while (true) {
            int var4 = arg2.method1319(255);
            if (var4 == 0) {
                field4947++;
                if (!arg1) {
                    this.field4950 = -46;
                }
                return;
            }
            this.method2284(var4, arg0, (byte) 42, arg2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILph;)Z", line = 107)
    public static final boolean method2282(int arg0, int arg1, class361 arg2) {
        field4955++;
        if (arg0 != 9) {
            method2285(49, (int[]) null, (byte) -76, -61, 50);
        }
        byte[] var3 = arg2.method2513((byte) -84, arg1);
        if (var3 == null) {
            return false;
        } else {
            class314.method2192(var3, (byte) 37);
            return true;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ldf;IIIIIIIZ)V", line = 133)
    public static final void method2283(class172 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class7.field142;
        int var11;
        int var12 = var11 = (arg7 << 7) - class126.field1843;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class132.field1930[arg1][arg6][arg7] - class253.field3770;
        int var18 = class132.field1930[arg1][arg6 + 1][arg7] - class253.field3770;
        int var19 = class132.field1930[arg1][arg6 + 1][arg7 + 1] - class253.field3770;
        int var20 = class132.field1930[arg1][arg6][arg7 + 1] - class253.field3770;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class345.field5348;
        int var46 = (var24 << 9) / var25 + class345.field5344;
        int var47 = (var27 << 9) / var31 + class345.field5348;
        int var48 = (var30 << 9) / var31 + class345.field5344;
        int var49 = (var33 << 9) / var37 + class345.field5348;
        int var50 = (var36 << 9) / var37 + class345.field5344;
        int var51 = (var39 << 9) / var43 + class345.field5348;
        int var52 = (var42 << 9) / var43 + class345.field5344;
        class345.field5337 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class179.field2562 && class197.method1419(class345.field5348 + class266.field4057, class57.field843 + class345.field5344, var50, var52, var48, var49, var51, var47)) {
                class336.field5235 = arg6;
                class358.field5486 = arg7;
            }
            if (!class141.field2031 && !arg8) {
                class345.field5341 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class345.field5353 || var51 > class345.field5353 || var47 > class345.field5353) {
                    class345.field5341 = true;
                }
                if (arg0.field2485 == -1) {
                    if (arg0.field2486 != 12345678) {
                        class345.method2421(var50, var52, var48, var49, var51, var47, arg0.field2486, arg0.field2479, arg0.field2476);
                    }
                } else if (!class291.field4410) {
                    int var53 = class345.field5336.method591(arg0.field2485, -127);
                    class345.method2421(var50, var52, var48, var49, var51, var47, class38.method280(var53, arg0.field2486), class38.method280(var53, arg0.field2479), class38.method280(var53, arg0.field2476));
                } else if (arg0.field2481) {
                    class345.method2420(var50, var52, var48, var49, var51, var47, arg0.field2486, arg0.field2479, arg0.field2476, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2485);
                } else {
                    class345.method2420(var50, var52, var48, var49, var51, var47, arg0.field2486, arg0.field2479, arg0.field2476, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2485);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class179.field2562 && class197.method1419(class345.field5348 + class266.field4057, class57.field843 + class345.field5344, var46, var48, var52, var45, var47, var51)) {
            class336.field5235 = arg6;
            class358.field5486 = arg7;
        }
        if (class141.field2031 || arg8) {
            return;
        }
        class345.field5341 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class345.field5353 || var47 > class345.field5353 || var51 > class345.field5353) {
            class345.field5341 = true;
        }
        if (arg0.field2485 == -1) {
            if (arg0.field2483 != 12345678) {
                class345.method2421(var46, var48, var52, var45, var47, var51, arg0.field2483, arg0.field2476, arg0.field2479);
            }
        } else if (class291.field4410) {
            class345.method2420(var46, var48, var52, var45, var47, var51, arg0.field2483, arg0.field2476, arg0.field2479, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2485);
        } else {
            int var54 = class345.field5336.method591(arg0.field2485, -120);
            class345.method2421(var46, var48, var52, var45, var47, var51, class38.method280(var54, arg0.field2483), class38.method280(var54, arg0.field2476), class38.method280(var54, arg0.field2479));
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBLsb;)V", line = 290)
    private final void method2284(int arg0, int arg1, byte arg2, class190 arg3) {
        if (arg2 != 42) {
            field4953 = (class361) null;
        }
        if (arg0 == 1) {
            this.field4950 = arg3.method1317((byte) 84);
        } else if (arg0 == 2) {
            this.field4946 = arg3.method1312(118);
        } else if (arg0 == 3) {
            this.field4945 = true;
        } else if (arg0 == 4) {
            this.field4950 = -1;
        }
        field4944++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IBII)V", line = 328)
    public static final void method2285(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        int var5 = -69 / ((13 - arg2) / 56);
        field4951++;
        arg0--;
        int var14 = arg3 - 1;
        int var6 = var14 - 7;
        while (var6 > arg0) {
            int var7 = arg0 + 1;
            arg1[var7] = arg4;
            int var8 = var7 + 1;
            arg1[var8] = arg4;
            int var9 = var8 + 1;
            arg1[var9] = arg4;
            int var10 = var9 + 1;
            arg1[var10] = arg4;
            int var11 = var10 + 1;
            arg1[var11] = arg4;
            int var12 = var11 + 1;
            arg1[var12] = arg4;
            int var13 = var12 + 1;
            arg1[var13] = arg4;
            arg0 = var13 + 1;
            arg1[arg0] = arg4;
        }
        while (var14 > arg0) {
            arg0++;
            arg1[arg0] = arg4;
        }
    }
}
