import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class640 extends class416 {

    @OriginalMember(owner = "client!av", name = "B", descriptor = "I")
    public int field8483 = 0;

    @OriginalMember(owner = "client!av", name = "A", descriptor = "I")
    public int field8482 = 12800;

    @OriginalMember(owner = "client!av", name = "O", descriptor = "I")
    public int field8496 = 0;

    @OriginalMember(owner = "client!av", name = "Q", descriptor = "Z")
    public boolean field8498 = true;

    @OriginalMember(owner = "client!av", name = "K", descriptor = "I")
    public int field8492 = 12800;

    @OriginalMember(owner = "client!av", name = "N", descriptor = "I")
    public int field8495 = -1;

    @OriginalMember(owner = "client!av", name = "T", descriptor = "I")
    public int field8501 = -1;

    @OriginalMember(owner = "client!av", name = "L", descriptor = "Ljava/lang/String;")
    public String field8493;

    @OriginalMember(owner = "client!av", name = "I", descriptor = "I")
    public int field8490;

    @OriginalMember(owner = "client!av", name = "E", descriptor = "I")
    public int field8486;

    @OriginalMember(owner = "client!av", name = "S", descriptor = "Ljava/lang/String;")
    public String field8500;

    @OriginalMember(owner = "client!av", name = "D", descriptor = "Lro;")
    public class2 field8485;

    @OriginalMember(owner = "client!av", name = "F", descriptor = "J")
    public static long field8487 = -1L;

    @OriginalMember(owner = "client!av", name = "x", descriptor = "I")
    public static int field8479;

    @OriginalMember(owner = "client!av", name = "y", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!av", name = "z", descriptor = "I")
    public static int field8481;

    @OriginalMember(owner = "client!av", name = "C", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!av", name = "G", descriptor = "I")
    public static int field8488;

    @OriginalMember(owner = "client!av", name = "H", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!av", name = "J", descriptor = "I")
    public static int field8491;

    @OriginalMember(owner = "client!av", name = "M", descriptor = "I")
    public static int field8494;

    @OriginalMember(owner = "client!av", name = "P", descriptor = "I")
    public static int field8497;

    @OriginalMember(owner = "client!av", name = "R", descriptor = "I")
    public static int field8499;

    @OriginalMember(owner = "client!av", name = "U", descriptor = "I")
    public static int field8502;

    @OriginalMember(owner = "client!av", name = "V", descriptor = "I")
    public static int field8503;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method3499(int arg0, int arg1) {
        if (arg1 == 18107) {
            field8499++;
            return arg0 == 1 || arg0 == 3 || arg0 == 5;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIZ)V", line = 19)
    public static final void method3500(int arg0, boolean arg1, int arg2, boolean arg3) {
        field8497++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class382.field5306 = arg2;
        class27.field430 = arg1;
        class405.field5646 = arg0;
        if (arg3) {
            method3504(null, -106, true, null);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V", line = 36)
    public static final void method3501(int arg0, int arg1, int arg2) {
        field8494++;
        if (class45.field585 == null || arg0 != 27424) {
            return;
        }
        int var3 = class237.field3335;
        int var4 = class176.field2654;
        class501.method2824(-1, arg1, arg2);
        if (class410.field5681 == 0) {
            class526.field6973 = null;
            class526.field6973 = class45.field585.method463(class45.field585.method417(class425.field5857, class195.field2938), class45.field585.method394(class425.field5857, class195.field2938));
        } else if (class410.field5681 == 1 && (class550.field7256 == null || class237.field3335 != var3 || class176.field2654 != var4)) {
            class550.field7256 = new class23[class237.field3335 * class176.field2654];
            for (int var5 = 0; var5 < class550.field7256.length; var5++) {
                class550.field7256[var5] = class45.field585.method463(class45.field585.method417(class300.field4261, class296.field4227), class45.field585.method394(class300.field4261, class296.field4227));
            }
            class577.field7567 = new int[class237.field3335 * class176.field2654];
            class595.field7749 = 1;
        }
        class302.field4291 = true;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V", line = 82)
    public final void method3502(byte arg0) {
        this.field8483 = 0;
        this.field8482 = 12800;
        this.field8496 = 0;
        this.field8492 = 12800;
        field8488++;
        if (arg0 != 56) {
            field8484 = -61;
        }
        for (class183 var2 = (class183) this.field8485.method21(2); var2 != null; var2 = (class183) this.field8485.method9(-127)) {
            if (this.field8482 > var2.field2773) {
                this.field8482 = var2.field2773;
            }
            if (this.field8496 < var2.field2768) {
                this.field8496 = var2.field2768;
            }
            if (this.field8492 > var2.field2760) {
                this.field8492 = var2.field2760;
            }
            if (var2.field2764 > this.field8483) {
                this.field8483 = var2.field2764;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 1034)
    public class640(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field8501 = arg4;
        this.field8498 = arg5;
        this.field8493 = arg2;
        this.field8490 = arg0;
        this.field8486 = arg3;
        this.field8495 = arg6;
        this.field8500 = arg1;
        if (this.field8495 == 255) {
            this.field8495 = 0;
        }
        this.field8485 = new class2();
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(III)Z", line = 122)
    public final boolean method3503(int arg0, int arg1, int arg2) {
        field8491++;
        if (arg2 <= 98) {
            method3499(65, 85);
        }
        for (class183 var4 = (class183) this.field8485.method21(2); var4 != null; var4 = (class183) this.field8485.method9(-127)) {
            if (var4.method1265(arg1, -118, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Laba;IZLha;)V", line = 147)
    public static final void method3504(class177 arg0, int arg1, boolean arg2, class59 arg3) {
        field8479++;
        if (class503.field6750 != null && arg0.field2674 >= arg1) {
            for (int var4 = 0; var4 < class503.field6750.length; var4++) {
                if (class503.field6750[var4] != -1000000 && (class503.field6750[var4] >= arg0.field2670[0] || class503.field6750[var4] >= arg0.field2670[1] || arg0.field2670[2] <= class503.field6750[var4] || class503.field6750[var4] >= arg0.field2670[3]) && (arg0.field2672[0] <= class90.field1094[var4] || class90.field1094[var4] >= arg0.field2672[1] || class90.field1094[var4] >= arg0.field2672[2] || arg0.field2672[3] <= class90.field1094[var4]) && (arg0.field2672[0] >= class365.field5126[var4] || arg0.field2672[1] >= class365.field5126[var4] || class365.field5126[var4] <= arg0.field2672[2] || class365.field5126[var4] <= arg0.field2672[3]) && (class48.field615[var4] >= arg0.field2665[0] || class48.field615[var4] >= arg0.field2665[1] || class48.field615[var4] >= arg0.field2665[2] || arg0.field2665[3] <= class48.field615[var4]) && (class682.field9524[var4] <= arg0.field2665[0] || arg0.field2665[1] >= class682.field9524[var4] || arg0.field2665[2] >= class682.field9524[var4] || arg0.field2665[3] >= class682.field9524[var4])) {
                    return;
                }
            }
        }
        if (!arg2) {
            method3501(-114, 90, -73);
        }
        if (arg0.field2663 == 1) {
            int var5 = class183.field2779 + arg0.field2661 - class458.field6258;
            if (var5 >= 0 && var5 <= (class183.field2779 + class183.field2779)) {
                int var6 = arg0.field2673 + class183.field2779 - class610.field8134;
                if (var6 < 0) {
                    var6 = 0;
                } else if (class183.field2779 + class183.field2779 < var6) {
                    return;
                }
                int var7 = class183.field2779 + arg0.field2677 - class610.field8134;
                if (class183.field2779 + class183.field2779 < var7) {
                    var7 = class183.field2779 + class183.field2779;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class672.field9269[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class58.field705 - arg0.field2672[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!((float) class546.field7220 > var9) && class288.method1787(0, (byte) -126, arg0) && class288.method1787(1, (byte) -95, arg0) && class288.method1787(2, (byte) -30, arg0) && class288.method1787(3, (byte) -75, arg0)) {
                        class44.field575[class218.field3145++] = arg0;
                    }
                }
            }
        } else if (arg0.field2663 == 2) {
            int var10 = arg0.field2673 + class183.field2779 - class610.field8134;
            if (var10 >= 0 && (class183.field2779 + class183.field2779) >= var10) {
                int var11 = arg0.field2661 + class183.field2779 - class458.field6258;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > class183.field2779 + class183.field2779) {
                    return;
                }
                int var12 = arg0.field2669 + class183.field2779 - class458.field6258;
                if (var12 > (class183.field2779 + class183.field2779)) {
                    var12 = class183.field2779 + class183.field2779;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class672.field9269[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class270.field3784 - arg0.field2665[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class546.field7220 > var14) && class288.method1787(0, (byte) -51, arg0) && class288.method1787(1, (byte) -82, arg0) && class288.method1787(2, (byte) -24, arg0) && class288.method1787(3, (byte) -45, arg0)) {
                        class44.field575[class218.field3145++] = arg0;
                    }
                }
            }
        } else if (arg0.field2663 == 16 || arg0.field2663 == 8) {
            int var23 = arg0.field2661 - (class458.field6258 - class183.field2779);
            if (var23 >= 0 && var23 <= (class183.field2779 + class183.field2779)) {
                int var24 = class183.field2779 + arg0.field2673 - class610.field8134;
                if (var24 >= 0 && var24 <= (class183.field2779 + class183.field2779) && class672.field9269[var23][var24]) {
                    float var25 = (float) (class58.field705 - arg0.field2672[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class270.field3784 - arg0.field2665[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class546.field7220 > var25) || !((float) class546.field7220 > var26) && class288.method1787(0, (byte) -28, arg0) && class288.method1787(1, (byte) -104, arg0) && class288.method1787(2, (byte) -71, arg0) && class288.method1787(3, (byte) -27, arg0)) {
                        class44.field575[class218.field3145++] = arg0;
                    }
                }
            }
        } else if (arg0.field2663 == 4) {
            float var15 = (float) (arg0.field2670[0] - class419.field5778);
            if (!(var15 <= (float) class392.field5478)) {
                int var16 = arg0.field2673 + class183.field2779 - class610.field8134;
                if (var16 < 0) {
                    var16 = 0;
                } else if (class183.field2779 + class183.field2779 < var16) {
                    return;
                }
                int var17 = arg0.field2677 + class183.field2779 - class610.field8134;
                if (class183.field2779 + class183.field2779 < var17) {
                    var17 = class183.field2779 + class183.field2779;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = arg0.field2661 + class183.field2779 - class458.field6258;
                if (var18 < 0) {
                    var18 = 0;
                } else if (var18 > (class183.field2779 + class183.field2779)) {
                    return;
                }
                int var19 = arg0.field2669 + class183.field2779 - class458.field6258;
                if (var19 > (class183.field2779 + class183.field2779)) {
                    var19 = class183.field2779 + class183.field2779;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label296: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class672.field9269[var21][var22]) {
                            var20 = true;
                            break label296;
                        }
                    }
                }
                if (var20 && class288.method1787(0, (byte) -113, arg0) && class288.method1787(1, (byte) -33, arg0) && class288.method1787(2, (byte) -38, arg0) && class288.method1787(3, (byte) -45, arg0)) {
                    class44.field575[class218.field3145++] = arg0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "([IIIII)Z", line = 477)
    public final boolean method3505(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field8489++;
        if (arg4 != 0) {
            method3500(27, true, 98, false);
        }
        for (class183 var6 = (class183) this.field8485.method21(2); var6 != null; var6 = (class183) this.field8485.method9(-128)) {
            if (var6.method1264(arg2, arg1, (byte) -71, arg3)) {
                var6.method1262(arg0, arg2, arg1, -128);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I[I[IZZBII[I[IIIII[III[[[B)V", line = 506)
    public static final void method3506(int arg0, int[] arg1, int[] arg2, boolean arg3, boolean arg4, byte arg5, int arg6, int arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int arg15, int arg16, byte[][][] arg17) {
        field8481++;
        if (~class410.field5681 == arg12) {
            return;
        }
        int[] var18 = class45.field585.method469();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class410.field5681 == 1) {
            var23 = (int) ((double) class394.field5491 * (double) var21 / (double) class195.field2938);
            var24 = (int) ((double) class394.field5491 * (double) var22 / (double) class195.field2938);
        }
        if (!class302.field4291) {
            if (class410.field5681 == 1) {
                class323.method1959((byte) -112);
            }
            int var25 = arg15 - class327.field4675;
            int var26 = arg10 - class588.field7680;
            int var27 = arg13 - class465.field6407;
            int var28 = (int) (((double) var27 * class261.field3631 + (double) var25 * class84.field1024 + (double) var26 * class604.field7935) * (double) var23 / (double) arg16);
            int var29 = (int) (((double) var27 * class455.field6210 + (double) var25 * class127.field2098 + (double) var26 * class589.field7688) * (double) var24 / (double) arg16);
            double var30 = (double) var27 * class513.field6810 + (double) var25 * class241.field3386 + (double) var26 * class597.field7826;
            int var32 = class229.field3266 + var28 - class141.field2262;
            int var33 = class696.field9703 + var29 - class258.field3536;
            int var34 = field8484 + var32;
            int var35 = class394.field5491 + var33;
            if (!(var32 < 0 || var33 < 0 || var34 > class425.field5857 || var35 > class195.field2938) || class410.field5681 == 2) {
                class55.field664 = var33;
                if (class410.field5681 == 2) {
                    class494.field6673 = -var30;
                }
                class186.field2817 = var32;
            } else if (var34 > 0 && var35 > 0 && class425.field5857 > var32 && var33 < class195.field2938) {
                int var36 = var32 - class229.field3266;
                int var37 = var33 - class696.field9703;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class410.field5681 == 0) {
                    var42 = class494.field6673 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class410.field5681 == 1) {
                    var40 = var36 / class300.field4261;
                    var41 = var37 / class296.field4227;
                    var39 = class296.field4227 * var41;
                    var38 = class300.field4261 * var40;
                    var42 = (class494.field6673 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 >= 0) {
                    var52 = 0;
                    var53 = class425.field5857 - var38;
                    var54 = var38;
                    if (class410.field5681 == 1) {
                        var48 = class237.field3335 - var40;
                        var50 = var40;
                    }
                    var55 = var53;
                } else {
                    var55 = 0;
                    var52 = -var38;
                    var53 = class425.field5857 + var38;
                    if (class410.field5681 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                    var54 = var52;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = 0;
                    var57 = -var39;
                    var58 = class195.field2938 + var39;
                    var59 = var57;
                    if (class410.field5681 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var49 = var47;
                        var51 = class176.field2654 + var41;
                    }
                    var60 = var58;
                    var61 = var57;
                } else {
                    var58 = class195.field2938 - var39;
                    var57 = 0;
                    var56 = var58;
                    if (class410.field5681 == 1) {
                        var46 = class176.field2654 - var41;
                        var47 = var41;
                        var49 = 0;
                        var51 = var46;
                    }
                    var59 = var39;
                    var61 = 0;
                    var60 = var58;
                }
                class687 var62 = class273.field3803.field9586;
                for (class733 var63 = (class733) var62.method3874((byte) 103); var63 != null; var63 = (class733) var62.method3868(-24951)) {
                    class364[] var69 = var63.field10150;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class364 var72 = var69[var71];
                        int var73 = var72.field5122;
                        int var74 = var72.field5121;
                        int var75 = var72.field5120;
                        int var76 = var72.field5118;
                        int var77;
                        var72.field5120 = var77 = var75 - var38;
                        int var78;
                        var72.field5122 = var78 = var73 - var38;
                        int var79;
                        var72.field5118 = var79 = var76 - var39;
                        int var80 = var72.field5119;
                        int var81;
                        var72.field5121 = var81 = var74 - var39;
                        if (var70) {
                            int var82 = (var78 < var77 ? var78 : var77) - var80;
                            if (var82 <= class425.field5857) {
                                int var83 = (var81 < var79 ? var81 : var79) - var80;
                                if (var83 <= class195.field2938) {
                                    int var84 = var80 + (var78 >= var77 ? var78 : var77);
                                    if (var84 >= 0) {
                                        int var85 = (var81 < var79 ? var79 : var81) + var80;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method2815(arg12 ^ 0xFFFFFF80);
                        class500.method2819(var63, (byte) 31);
                    }
                }
                if (class410.field5681 == 0) {
                    class45.field585.method444(class526.field6973);
                }
                class45.field585.method406(-var38, -var39);
                class45.field585.method483(var52, var57, var53, var58, var44);
                class621.method3417((byte) -125, class494.field6673 + var44);
                class622.field8290 = class494.field6673 + var44;
                if (class410.field5681 == 1) {
                    class332.field4728 = var19 - class141.field2262 - var38;
                    class1.field13 = var24;
                    class397.field5537 = var23;
                    class264.field3683 = var20 - var39 - class258.field3536;
                    class45.field585.method445(class332.field4728, class264.field3683, class397.field5537, class1.field13);
                } else {
                    class397.field5537 = var23;
                    class264.field3683 = var20 - (class258.field3536 + var39 - class696.field9703);
                    class332.field4728 = var19 + class229.field3266 - class141.field2262 - var38;
                    class1.field13 = var24;
                    class45.field585.method445(class332.field4728, class264.field3683, class397.field5537, class1.field13);
                }
                class475.method2676(class273.field3803);
                if (var59 > 0) {
                    class45.field585.method419(0, var56, class425.field5857, var56 + var59);
                    class45.field585.method454();
                    class45.field585.method392(class14.field209);
                    class749.method4189(arg11, arg15, arg10, arg13, arg17, arg1, arg8, arg14, arg2, arg9, arg0, arg5, arg6, arg7, arg3, arg4, arg16, 1, false);
                }
                if (var54 > 0) {
                    class45.field585.method419(var55, var61, var54 + var55, var60 + var61);
                    class45.field585.method454();
                    class45.field585.method392(class14.field209);
                    class749.method4189(arg11, arg15, arg10, arg13, arg17, arg1, arg8, arg14, arg2, arg9, arg0, arg5, arg6, arg7, arg3, arg4, arg16, 1, false);
                }
                class45.field585.method435();
                class170.method1208();
                if (class410.field5681 == 0) {
                    class45.field585.method511();
                }
                class141.field2262 += var38;
                class258.field3536 += var39;
                class494.field6673 += var44;
                class186.field2817 = class229.field3266 + var28 - class141.field2262;
                class55.field664 = var29 + class696.field9703 - class258.field3536;
                if (class410.field5681 == 1) {
                    class446.field6124 += var40;
                    class252.field3472 += var41;
                    for (int var64 = 0; var64 < class176.field2654; var64++) {
                        int var65 = class353.method2114(class176.field2654, -429911713, class252.field3472 + var64) * class237.field3335;
                        for (int var66 = 0; var66 < class237.field3335; var66++) {
                            int var67 = var65 + class353.method2114(class237.field3335, -429911713, class446.field6124 + var66);
                            boolean var68 = var46 <= var64 && var64 < var46 + var47 || var64 >= var49 && var64 < var49 + var51 && var48 <= var66 && (var48 + var50) > var66;
                            class550.field7256[var67].method233(class300.field4261 * var66, class296.field4227 * var64, class300.field4261, class296.field4227, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class302.field4291 = true;
            }
        }
        if (class302.field4291) {
            class588.field7680 = arg10;
            class186.field2817 = class229.field3266;
            class465.field6407 = arg13;
            class55.field664 = class696.field9703;
            class494.field6673 = 0.0D;
            class258.field3536 = 0;
            class141.field2262 = 0;
            class327.field4675 = arg15;
            if (class410.field5681 == 0) {
                class45.field585.method444(class526.field6973);
            }
            class45.field585.method435();
            class45.field585.method454();
            class45.field585.method392(class14.field209);
            class194.field2930.method1715(class327.field4675, class588.field7680, class465.field6407, class735.field10160, class177.field2666, class304.field4330);
            class45.field585.method481(class194.field2930);
            if (class410.field5681 == 1) {
                class332.field4728 = var19;
                class1.field13 = var24;
                class264.field3683 = var20;
                class397.field5537 = var23;
                class45.field585.method445(class332.field4728, class264.field3683, class397.field5537, class1.field13);
            } else {
                class1.field13 = var24;
                class397.field5537 = var23;
                class264.field3683 = var20 + class696.field9703;
                class332.field4728 = class229.field3266 + var19;
                class45.field585.method445(class332.field4728, class264.field3683, class397.field5537, class1.field13);
            }
            class622.field8290 = 0.0D;
            class273.field3803.method3876(28);
            class475.method2676(class273.field3803);
            class749.method4189(arg11, arg15, arg10, arg13, arg17, arg1, arg8, arg14, arg2, arg9, arg0, arg5, arg6, arg7, arg3, arg4, arg16, 1, false);
            class170.method1208();
            class302.field4291 = false;
            if (class410.field5681 == 0) {
                class45.field585.method511();
            }
            if (class410.field5681 == 1) {
                class745.method4179(-32);
            }
        }
        if (class410.field5681 == 0) {
            class526.field6973.method232(class186.field2817, class55.field664, field8484, class394.field5491, 0, 0, true, true);
        }
        class595.field7749++;
        class621.method3417((byte) -118, class494.field6673);
        class425.field5855 = class494.field6673;
        if (class410.field5681 == 0 || class410.field5681 == 2) {
            if (class410.field5681 == 2) {
                class45.field585.method392(class14.field209);
                class45.field585.method454();
            }
            class733.field10154 = var20 - (-class696.field9703 - (-class258.field3536 - class55.field664));
            class559.field7358 = var23;
            class338.field4779 = class229.field3266 + var19 - (class186.field2817 + class141.field2262);
            class649.field8628 = var24;
            class45.field585.method445(class338.field4779, class733.field10154, class559.field7358, class649.field8628);
        } else if (class410.field5681 == 1) {
            class338.field4779 = var19 - class141.field2262;
            class733.field10154 = var20 - class258.field3536;
            class559.field7358 = var23;
            class649.field8628 = var24;
            class45.field585.method445(class338.field4779, class733.field10154, class559.field7358, class649.field8628);
            class45.field585.method419(class186.field2817, class55.field664, class186.field2817 + field8484, class55.field664 - -class394.field5491);
        }
        class749.method4189(arg11, arg15, arg10, arg13, arg17, arg1, arg8, arg14, arg2, arg9, arg0, arg5, arg6, arg7, arg3, arg4, arg16, class410.field5681 == 2 ? 0 : 2, class410.field5681 == 1);
        class45.field585.method435();
        class45.field585.method445(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(III[I)Z", line = 966)
    public final boolean method3507(int arg0, int arg1, int arg2, int[] arg3) {
        field8480++;
        if (arg2 > -79) {
            return true;
        }
        for (class183 var5 = (class183) this.field8485.method21(2); var5 != null; var5 = (class183) this.field8485.method9(-127)) {
            if (var5.method1266(-31819, arg0, arg1)) {
                var5.method1261(arg1, arg0, 2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I[III)Z", line = 1001)
    public final boolean method3508(int arg0, int[] arg1, int arg2, int arg3) {
        field8502++;
        for (class183 var5 = (class183) this.field8485.method21(2); var5 != null; var5 = (class183) this.field8485.method9(-128)) {
            if (var5.method1265(arg2, -87, arg0)) {
                var5.method1262(arg1, arg2, arg0, -119);
                return true;
            }
        }
        if (arg3 >= -18) {
            method3506(120, null, null, false, false, (byte) 106, 59, 54, null, null, -37, -24, 48, 45, null, 103, 95, null);
        }
        return false;
    }
}
