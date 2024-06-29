import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class662 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "[I")
    public static int[] field9076 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lgg;")
    public static class114 field9075 = new class114(128, 4);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field9078 = 100;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field9077;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 18)
    public static final void method3586(int arg0) {
        for (int var1 = 0; var1 < class111.field1370; var1++) {
            class310 var3 = class552.field7756[var1];
            boolean var4 = false;
            if (var3.field3971 == null) {
                var3.field3954--;
                if (var3.field3954 < (var3.method1808((byte) -121) ? -1500 : -10)) {
                    var4 = true;
                } else {
                    if (var3.field3961 == 1 && var3.field3964 == null) {
                        var3.field3964 = class483.method2815(class1.field2, var3.field3962, 0);
                        if (var3.field3964 == null) {
                            continue;
                        }
                        var3.field3954 += var3.field3964.method2814();
                    } else if (var3.method1808((byte) -118) && (var3.field3963 == null || var3.field3968 == null)) {
                        if (var3.field3963 == null) {
                            var3.field3963 = class759.method4227(class107.field1327, var3.field3962);
                        }
                        if (var3.field3963 == null) {
                            continue;
                        }
                        if (var3.field3968 == null) {
                            var3.field3968 = var3.field3963.method4222(new int[] { 22050 });
                            if (var3.field3968 == null) {
                                continue;
                            }
                        }
                    }
                    if (var3.field3954 < 0) {
                        int var5 = 8192;
                        int var6;
                        if (var3.field3957 == 0) {
                            var6 = var3.field3959 * (var3.field3961 == 3 ? class223.field2944.field632.method3601((byte) -128) : class223.field2944.field600.method3601((byte) -128)) >> 2;
                        } else {
                            int var7 = (var3.field3957 & 0x33CB11C) >> 24;
                            if (class339.field4374.field5779 == var7) {
                                int var8 = (var3.field3957 & 0xFF) << 9;
                                int var9 = class339.field4374.method253((byte) -27) << 8;
                                int var10 = (var3.field3957 & 0xFFEEC7) >> 16;
                                int var11 = (var10 << 9) + var9 + 256 - class339.field4374.field5790;
                                int var12 = var3.field3957 >> 8 & 0xFF;
                                int var13 = (var12 << 9) + var9 - (class339.field4374.field5784 - 256);
                                int var14 = Math.abs(var11) + Math.abs(var13) - 512;
                                if (var8 < var14) {
                                    var3.field3954 = -99999;
                                    continue;
                                }
                                if (var14 < 0) {
                                    var14 = 0;
                                }
                                var6 = (var8 - var14) * class223.field2944.field605.method3601((byte) -122) * var3.field3959 / var8 >> 2;
                                if (var3.field3956 != null && var3.field3956 instanceof class451) {
                                    class451 var15 = (class451) var3.field3956;
                                    short var16 = var15.field6328;
                                    short var17 = var15.field6321;
                                }
                                if (var11 != 0 || var13 != 0) {
                                    int var18 = (-class688.field9781 - (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
                                    if (var18 > 8192) {
                                        var18 = 16384 - var18;
                                    }
                                    int var19;
                                    if (var14 <= 0) {
                                        var19 = 8192;
                                    } else if (var14 < 4096) {
                                        var19 = (8192 - var14) / 4096 + 8192;
                                    } else {
                                        var19 = 16384;
                                    }
                                    var5 = var18 * var19 / 8192 + (16384 - var19 >> 1);
                                }
                            } else {
                                var6 = 0;
                            }
                        }
                        if (var6 > 0) {
                            class639 var20 = null;
                            if (var3.field3961 == 1) {
                                var20 = var3.field3964.method2812().method3467(class441.field6191);
                            } else if (var3.method1808((byte) -119)) {
                                var20 = var3.field3968;
                            }
                            class729 var21 = var3.field3971 = class729.method4070(var20, var3.field3955, var6, var5);
                            var21.method4040(var3.field3965 - 1);
                            class668.field9148.method663(var21);
                        }
                    }
                }
            } else if (!var3.field3971.method3425(-16972)) {
                var4 = true;
            }
            if (var4) {
                class111.field1370--;
                for (int var22 = var1; var22 < class111.field1370; var22++) {
                    class552.field7756[var22] = class552.field7756[var22 + 1];
                }
                var1--;
            }
        }
        field9077++;
        if (arg0 != -2062) {
            field9076 = null;
        }
        if (class537.field7549 && !class141.method874(arg0 - 14706)) {
            if (class223.field2944.field593.method3601((byte) -125) != 0 && class601.field8357 != -1) {
                if (class374.field5250 == null) {
                    class454.method2665(class456.field6388, false, class223.field2944.field593.method3601((byte) -124), false, 0, class601.field8357);
                } else {
                    class353.method2104(class223.field2944.field593.method3601((byte) -126), 0, class601.field8357, class456.field6388, false, class374.field5250, (byte) 84);
                }
            }
            class537.field7549 = false;
            class374.field5250 = null;
        } else if (class223.field2944.field593.method3601((byte) -121) != 0 && class601.field8357 != -1 && !class141.method874(-16768)) {
            class710.field9989++;
            class650 var2 = class314.method1837(class36.field542, true, class625.field8727);
            var2.field8928.method1112(class601.field8357, -123);
            class108.method745(var2, -22);
            class601.field8357 = -1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 235)
    public static void method3587(int arg0) {
        field9075 = null;
        field9076 = null;
        if (arg0 != -14471) {
            method3586(-28);
        }
    }
}
