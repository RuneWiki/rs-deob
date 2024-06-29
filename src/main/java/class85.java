import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class85 extends class214 {

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    private final int field1243;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    private final int field1247;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    private final int field1240;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    private final int field1242;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field1246 = 20;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Lqj;")
    public static class196 field1241 = class80.method502("Mitglieder)2Welt", -48);

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "Lqj;")
    public static class196 field1249 = class80.method502("mod_icons", -48);

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field1251 = -1;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Lba;")
    public static class93 field1248 = new class93(64);

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)V")
    public final void method390(byte arg0, int arg1, int arg2) {
        int var4 = this.field1243 * arg1 >> 12;
        ++field1244;
        int var5 = this.field1247 * arg1 >> 12;
        int var6 = 121 / ((arg0 - 48) / 52);
        int var7 = this.field1242 * arg2 >> 12;
        int var8 = this.field1240 * arg2 >> 12;
        class220.method1499(super.field3835, super.field3827, var7, super.field3830, var4, -36, var8, var5);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lqi;IIIIIIIZ)V")
    public static final void method533(class129 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class202.field3586;
        int var11;
        int var12 = var11 = (arg7 << 7) - class224.field4012;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class42.field480[arg1][arg6][arg7] - class253.field4483;
        int var18 = class42.field480[arg1][arg6 + 1][arg7] - class253.field4483;
        int var19 = class42.field480[arg1][arg6 + 1][arg7 + 1] - class253.field4483;
        int var20 = class42.field480[arg1][arg6][arg7 + 1] - class253.field4483;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class15.field168;
                        int var46 = (var24 << 9) / var25 + class15.field167;
                        int var47 = (var27 << 9) / var31 + class15.field168;
                        int var48 = (var30 << 9) / var31 + class15.field167;
                        int var49 = (var33 << 9) / var37 + class15.field168;
                        int var50 = (var36 << 9) / var37 + class15.field167;
                        int var51 = (var39 << 9) / var43 + class15.field168;
                        int var52 = (var42 << 9) / var43 + class15.field167;
                        class15.field159 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class161.field2587 && class232.method1557(class165.field2696 + class15.field168, class176.field2970 + class15.field167, var50, var52, var48, var49, var51, var47)) {
                                class183.field3220 = arg6;
                                class19.field227 = arg7;
                            }
                            if (!arg8) {
                                class15.field163 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class15.field175 || var51 > class15.field175 || var47 > class15.field175) {
                                    class15.field163 = true;
                                }
                                if (arg0.field1834 == -1) {
                                    if (arg0.field1830 != 12345678) {
                                        class15.method65(var50, var52, var48, var49, var51, var47, arg0.field1830, arg0.field1837, arg0.field1839);
                                    }
                                } else if (class19.field228) {
                                    if (arg0.field1838) {
                                        class15.method78(var50, var52, var48, var49, var51, var47, arg0.field1830, arg0.field1837, arg0.field1839, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1834);
                                    } else {
                                        class15.method78(var50, var52, var48, var49, var51, var47, arg0.field1830, arg0.field1837, arg0.field1839, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field1834);
                                    }
                                } else {
                                    int var53 = class15.field171.method1203(-79, arg0.field1834);
                                    class15.method65(var50, var52, var48, var49, var51, var47, class136.method844(var53, arg0.field1830), class136.method844(var53, arg0.field1837), class136.method844(var53, arg0.field1839));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class161.field2587 && class232.method1557(class165.field2696 + class15.field168, class176.field2970 + class15.field167, var46, var48, var52, var45, var47, var51)) {
                                class183.field3220 = arg6;
                                class19.field227 = arg7;
                            }
                            if (!arg8) {
                                class15.field163 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class15.field175 || var47 > class15.field175 || var51 > class15.field175) {
                                    class15.field163 = true;
                                }
                                if (arg0.field1834 == -1) {
                                    if (arg0.field1831 != 12345678) {
                                        class15.method65(var46, var48, var52, var45, var47, var51, arg0.field1831, arg0.field1839, arg0.field1837);
                                        return;
                                    }
                                } else {
                                    if (class19.field228) {
                                        class15.method78(var46, var48, var52, var45, var47, var51, arg0.field1831, arg0.field1839, arg0.field1837, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field1834);
                                        return;
                                    }
                                    int var54 = class15.field171.method1203(-82, arg0.field1834);
                                    class15.method65(var46, var48, var52, var45, var47, var51, class136.method844(var54, arg0.field1831), class136.method844(var54, arg0.field1839), class136.method844(var54, arg0.field1837));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        ++field1250;
        if (arg0 <= 35) {
            method534(-70);
        }
        int var4 = this.field1247 * arg2 >> 12;
        int var5 = this.field1243 * arg2 >> 12;
        int var6 = this.field1242 * arg1 >> 12;
        int var7 = this.field1240 * arg1 >> 12;
        class182.method1191(super.field3835, var4, var5, var6, (byte) -112, var7);
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
    public static void method534(int arg0) {
        if (arg0 != 16) {
            method534(105);
        }
        field1248 = null;
        field1249 = null;
        field1241 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIII)V")
    public class85(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1243 = arg0;
        this.field1247 = arg2;
        this.field1240 = arg3;
        this.field1242 = arg1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
    public final void method392(int arg0, int arg1, int arg2) {
        ++field1245;
        if (arg2 != -954688305) {
            method533((class129) null, 3, -97, -97, 79, 127, -77, -45, false);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lec;B)Lec;")
    public static final class178 method535(class178 arg0, byte arg1) {
        ++field1239;
        int var2 = -25 % ((35 - arg1) / 56);
        class178 var3 = client.method626(arg0);
        if (var3 == null) {
            var3 = arg0.field3032;
        }
        return var3;
    }
}
