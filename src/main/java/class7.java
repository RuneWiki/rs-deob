import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class7 {

    @OriginalMember(owner = "client!j", name = "o", descriptor = "J")
    public long field69 = 0L;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "J")
    public static long field63 = 0L;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field65 = 0;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field67 = 0;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lik;")
    public static class17 field59 = new class17(16);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public int field56;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public int field68;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public int field71;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Ldn;")
    public class132 field55;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Ldn;")
    public class132 field57;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Ljava/lang/String;")
    public static String field70;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[I")
    public static int[] field58;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "[Ljm;")
    public static class163[] field72;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 9)
    public static final void method35(byte arg0) {
        field66++;
        if (arg0 != 59) {
            field58 = (int[]) null;
        }
        for (int var1 = -1; var1 < class292.field4352; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class4.field35[var1];
            }
            class241 var3 = class169.field2306[var2];
            if (var3 != null) {
                class262.method1791(arg0 ^ 0xFFFFC7E1, var3.method1653(arg0 - 60), var3);
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V", line = 48)
    public static void method36(byte arg0) {
        field59 = null;
        if (arg0 < -69) {
            field72 = null;
            field70 = null;
            field58 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[I[III)V", line = 65)
    public static final void method37(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field65 = 84;
        }
        if (arg0 > arg3) {
            int var5 = arg3;
            int var6 = (arg0 + arg3) / 2;
            int var7 = arg1[var6];
            arg1[var6] = arg1[arg0];
            arg1[arg0] = var7;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (((var9 & 0x1) + var7) < arg1[var9]) {
                    int var10 = arg1[var9];
                    arg1[var9] = arg1[var5];
                    arg1[var5] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var5];
                    arg2[var5++] = var11;
                }
            }
            arg1[arg0] = arg1[var5];
            arg1[var5] = var7;
            arg2[arg0] = arg2[var5];
            arg2[var5] = var8;
            method37(var5 - 1, arg1, arg2, arg3, 0);
            method37(arg0, arg1, arg2, var5 + 1, arg4 ^ 0x0);
        }
        field61++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lnf;IIIIIIIZ)V", line = 126)
    public static final void method38(class149 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class234.field3310;
        int var11;
        int var12 = var11 = (arg7 << 7) - class113.field1539;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class333.field5020[arg1][arg6][arg7] - class173.field2353;
        int var18 = class333.field5020[arg1][arg6 + 1][arg7] - class173.field2353;
        int var19 = class333.field5020[arg1][arg6 + 1][arg7 + 1] - class173.field2353;
        int var20 = class333.field5020[arg1][arg6][arg7 + 1] - class173.field2353;
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
        int var45 = (var21 << 9) / var25 + class184.field2529;
        int var46 = (var24 << 9) / var25 + class184.field2539;
        int var47 = (var27 << 9) / var31 + class184.field2529;
        int var48 = (var30 << 9) / var31 + class184.field2539;
        int var49 = (var33 << 9) / var37 + class184.field2529;
        int var50 = (var36 << 9) / var37 + class184.field2539;
        int var51 = (var39 << 9) / var43 + class184.field2529;
        int var52 = (var42 << 9) / var43 + class184.field2539;
        class184.field2541 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class312.field4720 && class165.method1179(class88.field1248 + class184.field2529, class184.field2539 + class132.field1804, var50, var52, var48, var49, var51, var47)) {
                class210.field3030 = arg6;
                class162.field2231 = arg7;
            }
            if (!class67.field908 && !arg8) {
                class184.field2534 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class184.field2535 || var51 > class184.field2535 || var47 > class184.field2535) {
                    class184.field2534 = true;
                }
                if (arg0.field2063 == -1) {
                    if (arg0.field2057 != 12345678) {
                        class184.method1289(var50, var52, var48, var49, var51, var47, arg0.field2057, arg0.field2064, arg0.field2058);
                    }
                } else if (!class185.field2558) {
                    int var53 = class184.field2543.method669(arg0.field2063, 64);
                    class184.method1289(var50, var52, var48, var49, var51, var47, class10.method56(var53, arg0.field2057), class10.method56(var53, arg0.field2064), class10.method56(var53, arg0.field2058));
                } else if (arg0.field2068) {
                    class184.method1284(var50, var52, var48, var49, var51, var47, arg0.field2057, arg0.field2064, arg0.field2058, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2063);
                } else {
                    class184.method1284(var50, var52, var48, var49, var51, var47, arg0.field2057, arg0.field2064, arg0.field2058, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2063);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class312.field4720 && class165.method1179(class88.field1248 + class184.field2529, class184.field2539 + class132.field1804, var46, var48, var52, var45, var47, var51)) {
            class210.field3030 = arg6;
            class162.field2231 = arg7;
        }
        if (class67.field908 || arg8) {
            return;
        }
        class184.field2534 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class184.field2535 || var47 > class184.field2535 || var51 > class184.field2535) {
            class184.field2534 = true;
        }
        if (arg0.field2063 == -1) {
            if (arg0.field2062 != 12345678) {
                class184.method1289(var46, var48, var52, var45, var47, var51, arg0.field2062, arg0.field2058, arg0.field2064);
            }
        } else if (class185.field2558) {
            class184.method1284(var46, var48, var52, var45, var47, var51, arg0.field2062, arg0.field2058, arg0.field2064, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2063);
        } else {
            int var54 = class184.field2543.method669(arg0.field2063, 64);
            class184.method1289(var46, var48, var52, var45, var47, var51, class10.method56(var54, arg0.field2062), class10.method56(var54, arg0.field2058), class10.method56(var54, arg0.field2064));
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 289)
    public static final void method39(int arg0) {
        if (arg0 == 16) {
            class159.field2182.method724(0);
            class193.field2646.method724(0);
            field64++;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lid;", line = 301)
    public static final class269 method40(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2879;
    }
}
