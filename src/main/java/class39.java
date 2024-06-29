import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class39 {

    @OriginalMember(owner = "client!af", name = "e", descriptor = "Lwd;")
    private class179 field385;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "Llk;")
    private class638 field394;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "Ljn;")
    public static class134 field389 = new class134(82, 6);

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I", line = 7)
    public final int method304(int arg0) {
        field382++;
        int var2 = 16 / ((arg0 + 36) / 34);
        return this.field387;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ljava/lang/Object;JI)V", line = 18)
    public final void method305(Object arg0, long arg1, int arg2) {
        if (arg2 == 18320) {
            field381++;
            this.method316(arg1, arg0, 1, arg2 ^ 0x1E9B);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 30)
    public static void method306(int arg0) {
        if (arg0 <= 5) {
            field389 = null;
        }
        field389 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)I", line = 41)
    public final int method307(int arg0) {
        field393++;
        if (arg0 > -1) {
            field389 = null;
        }
        return this.field383;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 52)
    public final void method308(int arg0, int arg1) {
        if (arg0 != -1) {
            this.field394 = null;
        }
        field391++;
        if (class79.field891 == null) {
            return;
        }
        for (class774 var3 = (class774) this.field385.method1140(-89); var3 != null; var3 = (class774) this.field385.method1138(123)) {
            if (var3.method855(-16309)) {
                if (var3.method857(-5446) == null) {
                    var3.method527(-11229);
                    var3.method416(9867);
                    this.field383 += var3.field10658;
                }
            } else if ((++var3.field581) > ((long) arg1)) {
                class774 var4 = class79.field891.method645(var3, 14247);
                this.field394.method3666((byte) 65, var3.field762, var4);
                class235.method1609(var4, 115, var3);
                var3.method527(-11229);
                var3.method416(9867);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 102)
    public static final void method309(byte arg0) {
        class25.method108(false, (byte) -112);
        field384++;
        if (class545.field7587 >= 0 && class545.field7587 != 0) {
            class532.method3154(class545.field7587, false, 1);
            class545.field7587 = -1;
        }
        if (arg0 < 16) {
            method306(-115);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 122)
    public final Object method310(byte arg0) {
        if (arg0 != -99) {
            this.method307(-16);
        }
        field388++;
        class774 var2 = (class774) this.field394.method3668(20);
        while (var2 != null) {
            Object var3 = var2.method857(arg0 ^ 0x1527);
            if (var3 != null) {
                return var3;
            }
            class774 var4 = var2;
            var2 = (class774) this.field394.method3667((byte) -90);
            var4.method527(-11229);
            var4.method416(arg0 + 9966);
            this.field383 += var4.field10658;
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V", line = 154)
    public class39(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([I[[[BZ[IIIIII[IIIBIIZ[I[I)V", line = 158)
    public static final void method311(int[] arg0, byte[][][] arg1, boolean arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, int arg11, byte arg12, int arg13, int arg14, boolean arg15, int[] arg16, int[] arg17) {
        field395++;
        if (class166.field2118 == -1) {
            return;
        }
        int[] var18 = class377.field5424.method238();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class166.field2118 == 1) {
            var23 = (int) ((double) class93.field1086 * (double) var21 / (double) class544.field7574);
            var24 = (int) ((double) class93.field1086 * (double) var22 / (double) class544.field7574);
        }
        if (!class282.field4043) {
            if (class166.field2118 == 1) {
                class648.method3718(false);
            }
            int var25 = arg7 - class86.field1032;
            int var26 = arg5 - class793.field10861;
            int var27 = arg8 - class669.field9375;
            int var28 = (int) (((double) var27 * class93.field1087 + (double) var25 * class384.field5500 + (double) var26 * class407.field5731) * (double) var23 / (double) arg14);
            int var29 = (int) (((double) var27 * class22.field200 + (double) var25 * class69.field766 + (double) var26 * class300.field4368) * (double) var24 / (double) arg14);
            double var30 = (double) var27 * client.field1289 + (double) var25 * class547.field7641 + (double) var26 * class402.field5671;
            int var32 = class41.field424 + var28 - class130.field1677;
            int var33 = class448.field6281 + var29 - class148.field1940;
            int var34 = class68.field754 + var32;
            int var35 = var33 + class93.field1086;
            if (!(var32 < 0 || var33 < 0 || var34 > class327.field4604 || var35 > class544.field7574) || class166.field2118 == 2) {
                if (class166.field2118 == 2) {
                    class265.field3864 = -var30;
                }
                class517.field7135 = var32;
                class783.field10753 = var33;
            } else if (var34 > 0 && var35 > 0 && class327.field4604 > var32 && class544.field7574 > var33) {
                int var36 = var32 - class41.field424;
                int var37 = var33 - class448.field6281;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class166.field2118 == 0) {
                    var38 = var36;
                    var39 = var37;
                    var42 = class265.field3864 + var30;
                } else if (class166.field2118 == 1) {
                    var40 = var36 / class618.field8685;
                    var41 = var37 / class750.field10361;
                    var39 = class750.field10361 * var41;
                    var38 = class618.field8685 * var40;
                    var42 = (class265.field3864 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51;
                int var52;
                int var53;
                int var54;
                if (var38 < 0) {
                    var51 = class327.field4604 + var38;
                    var52 = 0;
                    var53 = -var38;
                    var54 = var53;
                    if (class166.field2118 == 1) {
                        var48 = 0;
                        var50 = -var40;
                    }
                } else {
                    var51 = class327.field4604 - var38;
                    var53 = 0;
                    if (class166.field2118 == 1) {
                        var50 = var40;
                        var48 = class410.field5753 - var40;
                    }
                    var54 = var38;
                    var52 = var51;
                }
                int var55 = 0;
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = class544.field7574 + var39;
                    var57 = 0;
                    var58 = -var39;
                    var59 = var58;
                    if (class166.field2118 == 1) {
                        var46 = 0;
                        var47 = -var41;
                        var49 = var47;
                        var55 = class737.field10141 + var41;
                    }
                    var60 = var58;
                    var61 = var56;
                } else {
                    var58 = 0;
                    var56 = class544.field7574 - var39;
                    var59 = var39;
                    var57 = var56;
                    var60 = 0;
                    var61 = var56;
                    if (class166.field2118 == 1) {
                        var47 = var41;
                        var49 = 0;
                        var46 = class737.field10141 - var41;
                        var55 = var46;
                    }
                }
                class519 var62 = class177.field2233.field9809;
                for (class289 var63 = (class289) var62.method3103((byte) 72); var63 != null; var63 = (class289) var62.method3104(arg10 ^ 0xFFFFD52C)) {
                    class21[] var69 = var63.field4255;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class21 var72 = var69[var71];
                        int var73 = var72.field179;
                        int var74 = var72.field184;
                        int var75 = var72.field181;
                        int var76 = var72.field182;
                        int var77;
                        var72.field184 = var77 = var74 - var39;
                        int var78;
                        var72.field182 = var78 = var76 - var39;
                        int var79;
                        var72.field181 = var79 = var75 - var38;
                        int var80 = var72.field183;
                        int var81;
                        var72.field179 = var81 = var73 - var38;
                        if (var70) {
                            int var82 = (var81 < var79 ? var81 : var79) - var80;
                            if (class327.field4604 >= var82) {
                                int var83 = (var77 >= var78 ? var78 : var77) - var80;
                                if (class544.field7574 >= var83) {
                                    int var84 = var80 + (var79 <= var81 ? var81 : var79);
                                    if (var84 >= 0) {
                                        int var85 = var80 + (var77 < var78 ? var78 : var77);
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method2773(arg10 ^ 0x24);
                        class467.method2791(arg10 ^ 0x51, var63);
                    }
                }
                if (class166.field2118 == 0) {
                    class377.field5424.method229(class96.field1127);
                }
                class377.field5424.method146(-var38, -var39);
                class377.field5424.method235(var53, var58, var51, var56, var44);
                class363.method2284(class265.field3864 + var44, (byte) 104);
                class604.field8481 = class265.field3864 + var44;
                if (class166.field2118 == 1) {
                    class689.field9613 = var24;
                    class588.field8291 = var20 - var39 - class148.field1940;
                    class338.field4863 = var23;
                    class384.field5501 = var19 - class130.field1677 - var38;
                    class377.field5424.method242(class384.field5501, class588.field8291, class338.field4863, class689.field9613);
                } else {
                    class588.field8291 = var20 + class448.field6281 - class148.field1940 - var39;
                    class338.field4863 = var23;
                    class384.field5501 = var19 + class41.field424 - class130.field1677 - var38;
                    class689.field9613 = var24;
                    class377.field5424.method242(class384.field5501, class588.field8291, class338.field4863, class689.field9613);
                }
                class702.method3971(class177.field2233);
                if (var59 > 0) {
                    class377.field5424.method225(0, var57, class327.field4604, var57 + var59);
                    class377.field5424.method226();
                    class377.field5424.method230(class773.field10655);
                    class513.method3057(arg11, arg7, arg5, arg8, arg1, arg9, arg17, arg3, arg16, arg0, arg4, arg12, arg6, arg13, arg2, arg15, arg14, 1, false);
                }
                if (var54 > 0) {
                    class377.field5424.method225(var52, var60, var52 + var54, var60 + var61);
                    class377.field5424.method226();
                    class377.field5424.method230(class773.field10655);
                    class513.method3057(arg11, arg7, arg5, arg8, arg1, arg9, arg17, arg3, arg16, arg0, arg4, arg12, arg6, arg13, arg2, arg15, arg14, 1, false);
                }
                class377.field5424.method208();
                class423.method2544();
                if (class166.field2118 == 0) {
                    class377.field5424.method227();
                }
                class130.field1677 += var38;
                class265.field3864 += var44;
                class148.field1940 += var39;
                class517.field7135 = var28 + class41.field424 - class130.field1677;
                class783.field10753 = var29 + class448.field6281 - class148.field1940;
                if (class166.field2118 == 1) {
                    class395.field5608 += var40;
                    class616.field8644 += var41;
                    for (int var64 = 0; var64 < class737.field10141; var64++) {
                        int var65 = class35.method291(class616.field8644 + var64, class737.field10141, (byte) -95) * class410.field5753;
                        for (int var66 = 0; var66 < class410.field5753; var66++) {
                            int var67 = var65 + class35.method291(class395.field5608 + var66, class410.field5753, (byte) -98);
                            boolean var68 = var46 <= var64 && var64 < var46 + var47 || var64 >= var49 && var49 + var55 > var64 && var48 <= var66 && var66 < (var48 + var50);
                            class376.field5395[var67].method2230(class618.field8685 * var66, class750.field10361 * var64, class618.field8685, class750.field10361, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class282.field4043 = true;
            }
        }
        if (class282.field4043) {
            class86.field1032 = arg7;
            class148.field1940 = 0;
            class130.field1677 = 0;
            class793.field10861 = arg5;
            class669.field9375 = arg8;
            class265.field3864 = 0.0D;
            class517.field7135 = class41.field424;
            class783.field10753 = class448.field6281;
            if (class166.field2118 == 0) {
                class377.field5424.method229(class96.field1127);
            }
            class377.field5424.method208();
            class377.field5424.method226();
            class377.field5424.method230(class773.field10655);
            class747.field10317.method39(class86.field1032, class793.field10861, class669.field9375, class593.field8350, class635.field8863, class535.field7400);
            class377.field5424.method194(class747.field10317);
            if (class166.field2118 == 1) {
                class588.field8291 = var20;
                class384.field5501 = var19;
                class338.field4863 = var23;
                class689.field9613 = var24;
                class377.field5424.method242(class384.field5501, class588.field8291, class338.field4863, class689.field9613);
            } else {
                class689.field9613 = var24;
                class338.field4863 = var23;
                class588.field8291 = var20 + class448.field6281;
                class384.field5501 = class41.field424 + var19;
                class377.field5424.method242(class384.field5501, class588.field8291, class338.field4863, class689.field9613);
            }
            class604.field8481 = 0.0D;
            class177.field2233.method3979(2048);
            class702.method3971(class177.field2233);
            class513.method3057(arg11, arg7, arg5, arg8, arg1, arg9, arg17, arg3, arg16, arg0, arg4, arg12, arg6, arg13, arg2, arg15, arg14, 1, false);
            class423.method2544();
            class282.field4043 = false;
            if (class166.field2118 == 0) {
                class377.field5424.method227();
            }
            if (class166.field2118 == 1) {
                class538.method3197(24869);
            }
        }
        if (class166.field2118 == 0) {
            class96.field1127.method2232(class517.field7135, class783.field10753, class68.field754, class93.field1086, 0, 0, true, true);
        }
        class729.field10073++;
        class363.method2284(class265.field3864, (byte) -106);
        class226.field3435 = class265.field3864;
        if (class166.field2118 == arg10 || class166.field2118 == 2) {
            if (class166.field2118 == 2) {
                class377.field5424.method230(class773.field10655);
                class377.field5424.method226();
            }
            class120.field1597 = var23;
            class524.field7221 = var24;
            class661.field9304 = class41.field424 + var19 - class130.field1677 - class517.field7135;
            class654.field9176 = var20 + class448.field6281 - class148.field1940 - class783.field10753;
            class377.field5424.method242(class661.field9304, class654.field9176, class120.field1597, class524.field7221);
        } else if (class166.field2118 == 1) {
            class654.field9176 = var20 - class148.field1940;
            class120.field1597 = var23;
            class661.field9304 = var19 - class130.field1677;
            class524.field7221 = var24;
            class377.field5424.method242(class661.field9304, class654.field9176, class120.field1597, class524.field7221);
            class377.field5424.method225(class517.field7135, class783.field10753, class68.field754 + class517.field7135, class93.field1086 + class783.field10753);
        }
        class513.method3057(arg11, arg7, arg5, arg8, arg1, arg9, arg17, arg3, arg16, arg0, arg4, arg12, arg6, arg13, arg2, arg15, arg14, class166.field2118 == 2 ? 0 : 2, class166.field2118 == 1);
        class377.field5424.method208();
        class377.field5424.method242(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 602)
    public final Object method312(int arg0, long arg1) {
        field400++;
        if (arg0 != 0) {
            this.field394 = null;
        }
        class774 var4 = (class774) this.field394.method3669(false, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method857(-5446);
        if (var5 == null) {
            var4.method527(-11229);
            var4.method416(9867);
            this.field383 += var4.field10658;
            return null;
        }
        if (var4.method855(arg0 - 16309)) {
            class121 var6 = new class121(var5, var4.field10658);
            this.field394.method3666((byte) 65, var4.field762, var6);
            this.field385.method1139((byte) -84, var6);
            var6.field581 = 0L;
            var4.method527(-11229);
            var4.method416(9867);
        } else {
            this.field385.method1139((byte) -84, var4);
            var4.field581 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(II)V", line = 806)
    public class39(int arg0, int arg1) {
        this.field385 = new class179();
        this.field383 = arg0;
        this.field387 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field394 = new class638(var3);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lio;I)V", line = 650)
    private final void method313(class774 arg0, int arg1) {
        if (arg0 != null) {
            arg0.method527(arg1 - 11230);
            arg0.method416(9867);
            this.field383 += arg0.field10658;
        }
        if (arg1 != 1) {
            this.field394 = null;
        }
        field397++;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 667)
    public final void method314(int arg0) {
        this.field385.method1143(-91);
        field398++;
        this.field394.method3672(arg0 ^ arg0);
        this.field383 = this.field387;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 677)
    public final Object method315(int arg0) {
        field399++;
        class774 var2 = (class774) this.field394.method3667((byte) -62);
        if (arg0 <= 19) {
            return null;
        }
        while (var2 != null) {
            Object var3 = var2.method857(-5446);
            if (var3 != null) {
                return var3;
            }
            class774 var4 = var2;
            var2 = (class774) this.field394.method3667((byte) 121);
            var4.method527(-11229);
            var4.method416(9867);
            this.field383 += var4.field10658;
        }
        return null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JLjava/lang/Object;II)V", line = 708)
    public final void method316(long arg0, Object arg1, int arg2, int arg3) {
        field390++;
        if (this.field387 < arg2) {
            throw new IllegalStateException("s>cs");
        }
        this.method317(arg0, arg3 ^ 0xFFFFA69F);
        this.field383 -= arg2;
        if (arg3 != 22795) {
            return;
        }
        while (this.field383 < 0) {
            class774 var7 = (class774) this.field385.method1137((byte) 25);
            this.method313(var7, 1);
        }
        class121 var6 = new class121(arg1, arg2);
        this.field394.method3666((byte) 65, arg0, var6);
        this.field385.method1139((byte) -84, var6);
        var6.field581 = 0L;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(JI)V", line = 737)
    private final void method317(long arg0, int arg1) {
        if (arg1 >= -90) {
            this.field387 = 29;
        }
        field386++;
        class774 var4 = (class774) this.field394.method3669(false, arg0);
        this.method313(var4, 1);
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)I", line = 754)
    public final int method318(int arg0) {
        field392++;
        int var2 = 0;
        if (arg0 != -32192) {
            return -15;
        }
        for (class774 var3 = (class774) this.field385.method1140(arg0 ^ 0x7DC7); var3 != null; var3 = (class774) this.field385.method1138(108)) {
            if (!var3.method855(-16309)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V", line = 779)
    public final void method319(int arg0) {
        if (arg0 >= -3) {
            this.method314(-82);
        }
        for (class774 var2 = (class774) this.field385.method1140(-118); var2 != null; var2 = (class774) this.field385.method1138(114)) {
            if (var2.method855(-16309)) {
                var2.method527(-11229);
                var2.method416(9867);
                this.field383 += var2.field10658;
            }
        }
        field396++;
    }
}
