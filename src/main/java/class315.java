import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public abstract class class315 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "[I")
    public static int[] field4734 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "[I")
    public static int[] field4738 = new int[4096];

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "I")
    public static int field4742 = 1;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "[I")
    public static int[] field4744 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "Lje;")
    public static class178 field4735;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "Ler;")
    public static class3 field4736;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4740;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)Lea;", line = 6)
    public static final class106 method1943(int arg0) {
        if (arg0 > -85) {
            return null;
        }
        field4741++;
        try {
            return (class106) Class.forName("tm").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IBIIIIII)V", line = 32)
    public static final void method1944(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4737++;
        int var8 = 0;
        int var9 = arg7;
        int var10 = 0;
        int var11 = arg0 - arg3;
        int var12 = arg7 - arg3;
        int var13 = arg0 * arg0;
        int var14 = arg7 * arg7;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg7 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - (var21 - 1) * var18;
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg7 - 1) * var27;
        if (arg1 >= -114) {
            method1946(3, 53, true, -99, -34, false);
        }
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg5 >= class176.field2503 && class296.field4443 >= arg5) {
            int[] var39 = class49.field723[arg5];
            int var40 = class352.method2172(arg2 - arg0, class119.field1643, class293.field4420, 0);
            int var41 = class352.method2172(arg0 + arg2, class119.field1643, class293.field4420, 0);
            int var42 = class352.method2172(arg2 - var11, class119.field1643, class293.field4420, 0);
            int var43 = class352.method2172(arg2 + var11, class119.field1643, class293.field4420, 0);
            class345.method2125(false, var39, var40, var42, arg4);
            class345.method2125(false, var39, var42, var43, arg6);
            class345.method2125(false, var39, var43, var41, arg4);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var8++;
                    var35 += var28;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var33 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var45 = arg5 - var9;
            int var46 = arg5 + var9;
            if (class176.field2503 <= var46 && var45 <= class296.field4443) {
                int var47 = class352.method2172(arg2 + var8, class119.field1643, class293.field4420, 0);
                int var48 = class352.method2172(arg2 - var8, class119.field1643, class293.field4420, 0);
                if (var44) {
                    int var49 = class352.method2172(arg2 + var10, class119.field1643, class293.field4420, 0);
                    int var50 = class352.method2172(arg2 - var10, class119.field1643, class293.field4420, 0);
                    if (var45 >= class176.field2503) {
                        int[] var51 = class49.field723[var45];
                        class345.method2125(false, var51, var48, var50, arg4);
                        class345.method2125(false, var51, var50, var49, arg6);
                        class345.method2125(false, var51, var49, var47, arg4);
                    }
                    if (class296.field4443 >= var46) {
                        int[] var52 = class49.field723[var46];
                        class345.method2125(false, var52, var48, var50, arg4);
                        class345.method2125(false, var52, var50, var49, arg6);
                        class345.method2125(false, var52, var49, var47, arg4);
                    }
                } else {
                    if (var45 >= class176.field2503) {
                        class345.method2125(false, class49.field723[var45], var48, var47, arg4);
                    }
                    if (class296.field4443 >= var46) {
                        class345.method2125(false, class49.field723[var46], var48, var47, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)V", line = 259)
    public static void method1945(int arg0) {
        field4736 = null;
        if (arg0 < 43) {
            return;
        }
        field4738 = null;
        field4744 = null;
        field4734 = null;
        field4735 = null;
        field4740 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIZIIZ)V", line = 277)
    public static final void method1946(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field4746++;
        int var6 = arg3 - 334;
        if (arg2) {
            method1946(-40, -123, true, -88, 81, false);
        }
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = class246.field3561 + ((class106.field1485 - class246.field3561) * var6 / 100);
        if (var7 < class172.field2461) {
            var7 = class172.field2461;
        } else if (class119.field1653 < var7) {
            var7 = class119.field1653;
        }
        int var8 = arg3 * var7 * 512 / (arg4 * 334);
        if (class303.field4513 > var8) {
            short var12 = class303.field4513;
            var7 = arg4 * 334 * var12 / (arg3 * 512);
            if (var7 > class119.field1653) {
                var7 = class119.field1653;
                int var13 = arg3 * 512 * var7 / (var12 * 334);
                int var14 = (arg4 - var13) / 2;
                if (arg5) {
                    class138.field1976.method493();
                    class138.field1976.method530(arg3, -16777216, arg1, (byte) 108, arg0, var14);
                    class138.field1976.method530(arg3, -16777216, arg1, (byte) 108, arg0 + arg4 - var14, var14);
                }
                arg4 -= var14 * 2;
                arg0 += var14;
            }
        } else if (class122.field1688 < var8) {
            short var9 = class122.field1688;
            var7 = arg4 * 334 * var9 / (arg3 * 512);
            if (var7 < class172.field2461) {
                var7 = class172.field2461;
                int var10 = arg4 * 334 * var9 / (var7 * 512);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class138.field1976.method493();
                    class138.field1976.method530(var11, -16777216, arg1, (byte) 108, arg0, arg4);
                    class138.field1976.method530(var11, -16777216, arg1 + arg3 - var11, (byte) 108, arg0, arg4);
                }
                arg3 -= var11 * 2;
                arg1 += var11;
            }
        }
        class172.field2459 = arg1;
        class446.field6287 = (short) arg3;
        class205.field3107 = arg0;
        class9.field147 = (short) arg4;
        class331.field4964 = arg3 * var7 / 334;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIZ[Lje;)V", line = 373)
    public static final void method1947(int arg0, int arg1, int arg2, int arg3, boolean arg4, class178[] arg5) {
        field4739++;
        for (int var6 = arg3; var6 < arg5.length; var6++) {
            class178 var7 = arg5[var6];
            if (var7 != null && var7.field2580 == arg1) {
                class144.method985(1, arg4, arg2, var7, arg0);
                class4.method30(arg2, var7, arg0, (byte) -16);
                if (var7.field2560 - var7.field2595 < var7.field2530) {
                    var7.field2530 = var7.field2560 - var7.field2595;
                }
                if (var7.field2620 > (var7.field2601 - var7.field2589)) {
                    var7.field2620 = var7.field2601 - var7.field2589;
                }
                if (var7.field2530 < 0) {
                    var7.field2530 = 0;
                }
                if (var7.field2620 < 0) {
                    var7.field2620 = 0;
                }
                if (var7.field2655 == 0) {
                    class426.method2508(arg4, var7, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V")
    public abstract void method478(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V")
    public abstract void method485(int arg0);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([I)V")
    public abstract void method479(int[] arg0);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(III)V")
    public abstract void method482(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III[I)V")
    public abstract void method483(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lmu;)V")
    public abstract void method489(class315 arg0);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "()V")
    public abstract void method488();

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public abstract void method481(int arg0);

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V")
    public abstract void method477(int arg0);

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIIII)V")
    public abstract void method484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)V")
    public abstract void method486(int arg0);

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)V")
    public abstract void method487(int arg0);
}
