import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class227 extends class270 {

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3815 = "yellow:";

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[J")
    public static long[] field3816 = new long[32];

    @OriginalMember(owner = "client!o", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3820 = new String[8];

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field3818 = 0;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field3822 = 0;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lo;")
    public class227 field3817;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Lo;")
    public class227 field3821;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIII)V", line = 7)
    public static final void method1648(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3823++;
        if (arg0 != 9468) {
            method1649(55);
        }
        if (arg4 >= class170.field2944 && arg4 <= class310.field4916 && class170.field2944 <= arg3 && arg3 <= class310.field4916 && class170.field2944 <= arg7 && arg7 <= class310.field4916 && arg8 >= class170.field2944 && class310.field4916 >= arg8 && class90.field1428 <= arg2 && class135.field2358 >= arg2 && class90.field1428 <= arg9 && arg9 <= class135.field2358 && arg5 >= class90.field1428 && arg5 <= class135.field2358 && arg1 >= class90.field1428 && class135.field2358 >= arg1) {
            class11.method108(arg7, arg5, arg2, arg3, arg1, arg8, arg9, arg6, arg4, 8);
        } else {
            class128.method1071(arg8, arg7, true, arg3, arg2, arg4, arg9, arg6, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 24)
    public static void method1649(int arg0) {
        if (arg0 != 0) {
            method1651((int[]) null, 48, (int[]) null, (int[]) null, (class278) null);
        }
        field3815 = null;
        field3820 = null;
        field3816 = null;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V", line = 37)
    public final void method1650(byte arg0) {
        field3819++;
        int var2 = 18 / ((-arg0 - 16) / 35);
        if (this.field3821 != null) {
            this.field3821.field3817 = this.field3817;
            this.field3817.field3821 = this.field3821;
            this.field3821 = null;
            this.field3817 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([II[I[ILu;)V", line = 58)
    public static final void method1651(int[] arg0, int arg1, int[] arg2, int[] arg3, class278 arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg4.field2026.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field2026[var9] = null;
                    } else {
                        class285 var10 = class346.method2428(var6, (byte) -24);
                        int var11 = var10.field4532;
                        class288 var12 = arg4.field2026[var9];
                        if (var12 != null) {
                            if (var12.field4596 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field2026[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4595 = 0;
                                    var12.field4588 = var8;
                                    var12.field4589 = 0;
                                    var12.field4601 = 0;
                                    var12.field4600 = 1;
                                    class20.method199(false, arg4.field1985, var10, arg4.field2036, 0, true);
                                } else if (var11 == 2) {
                                    var12.field4601 = 0;
                                }
                            } else if (var10.field4517 >= class346.method2428(var12.field4596, (byte) -24).field4517) {
                                var12 = arg4.field2026[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class288 var13 = arg4.field2026[var9] = new class288();
                            var13.field4596 = var6;
                            var13.field4600 = 1;
                            var13.field4601 = 0;
                            var13.field4588 = var8;
                            var13.field4589 = 0;
                            var13.field4595 = 0;
                            class20.method199(false, arg4.field1985, var10, arg4.field2036, 0, true);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg1 != 1) {
            field3820 = (String[]) null;
        }
        field3814++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Luk;IIIII)V", line = 154)
    public static final void method1652(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class42.field622 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class123.field2134) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class185.field3144 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class257 var14 = class279.field4430[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class137.field2487[var11][var12 + 1][var13] + class137.field2487[var11][var12][var13] + class137.field2487[var11][var12][var13 + 1] + class137.field2487[var11][var12 + 1][var13 + 1]) / 4 - (class137.field2487[arg1][arg2 + 1][arg3] + class137.field2487[arg1][arg2][arg3] + class137.field2487[arg1][arg2][arg3 + 1] + class137.field2487[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class297 var16 = var14.field4146;
                                    if (var16 != null) {
                                        if (var16.field4741.method896()) {
                                            arg0.method894(var16.field4741, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field4744 != null && var16.field4744.method896()) {
                                            arg0.method894(var16.field4744, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field4150; var17++) {
                                        class241 var18 = var14.field4147[var17];
                                        if (var18 != null && var18.field3940.method896() && (var18.field3932 == var12 || var7 == var12) && (var18.field3929 == var13 || var9 == var13)) {
                                            int var19 = var18.field3930 + 1 - var18.field3932;
                                            int var20 = var18.field3928 + 1 - var18.field3929;
                                            arg0.method894(var18.field3940, (var18.field3932 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field3929 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
