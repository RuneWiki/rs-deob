import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class200 extends class77 {

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Z")
    public boolean field3734 = false;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Laa;")
    private class2 field3731;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "Z")
    public boolean field3715;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "Z")
    public boolean field3738;

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Z")
    private boolean field3717;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "Z")
    private boolean field3743;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field3728;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    private int field3742;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    private int field3716;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Ldc;")
    public static class37 field3722 = class185.method1233((byte) 86, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "Lmf;")
    public static class136 field3741 = null;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "Ldc;")
    public static class37 field3726 = class185.method1233((byte) 86, "Einloggen");

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field3719 = new Random();

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "[Lsi;")
    public static class205[] field3744 = new class205[6];

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "F")
    private float field3718;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "Ldj;")
    public static class44 field3727;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "[I")
    private int[] field3721;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static void method1318(int arg0) {
        field3726 = null;
        field3741 = null;
        field3722 = null;
        field3744 = null;
        field3719 = null;
        int var1 = 39 / ((-arg0 - 51) / 53);
        field3727 = null;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        int var1 = class12.field167.method1506((byte) 115, 8);
        if (class76.field1342 > var1) {
            for (int var2 = var1; var2 < class76.field1342; var2++) {
                class119.field2131[class75.field1336++] = class9.field122[var2];
            }
        }
        field3737++;
        if (var1 > class76.field1342) {
            throw new RuntimeException("gppov1");
        }
        class76.field1342 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class9.field122[var3];
            class123 var5 = class8.field107[var4];
            int var6 = class12.field167.method1506((byte) 120, 1);
            if (var6 == 0) {
                class9.field122[class76.field1342++] = var4;
                var5.field3529 = class203.field3758;
            } else {
                int var7 = class12.field167.method1506((byte) 125, 2);
                if (var7 == 0) {
                    class9.field122[class76.field1342++] = var4;
                    var5.field3529 = class203.field3758;
                    class214.field4000[class19.field309++] = var4;
                } else if (var7 == 1) {
                    class9.field122[class76.field1342++] = var4;
                    var5.field3529 = class203.field3758;
                    int var8 = class12.field167.method1506((byte) 116, 3);
                    var5.method1263(var8, false, -30438);
                    int var9 = class12.field167.method1506((byte) 123, 1);
                    if (var9 == 1) {
                        class214.field4000[class19.field309++] = var4;
                    }
                } else if (var7 == 2) {
                    class9.field122[class76.field1342++] = var4;
                    var5.field3529 = class203.field3758;
                    int var10 = class12.field167.method1506((byte) 123, 3);
                    var5.method1263(var10, true, arg0 - 30427);
                    int var11 = class12.field167.method1506((byte) 114, 3);
                    var5.method1263(var11, true, -30438);
                    int var12 = class12.field167.method1506((byte) 123, 1);
                    if (var12 == 1) {
                        class214.field4000[class19.field309++] = var4;
                    }
                } else if (var7 == 3) {
                    class119.field2131[class75.field1336++] = var4;
                }
            }
        }
        if (arg0 != -11) {
            field3745 = 3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIII[IIIZ)V")
    public static final void method1320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, boolean arg10) {
        if (class48.field960 > arg3) {
            arg9 -= class48.field960 - arg3;
            arg3 = class48.field960;
        }
        if (arg1 < class48.field959) {
            arg5 -= class48.field959 - arg1;
            arg1 = class48.field959;
        }
        if (arg8 == 9) {
            arg8 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (arg8 == 10) {
            arg8 = 1;
            arg0 = arg0 + 3 & 0x3;
        }
        if (arg8 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg8 = 8;
        }
        if (class48.field961 < arg1 + arg5) {
            arg5 = class48.field961 - arg1;
        }
        if (arg3 + arg9 > class48.field957) {
            arg9 = class48.field957 - arg3;
        }
        int var11 = 90 / ((arg2 - 47) / 48);
        field3739++;
        int var12 = class48.field956 * arg1 + arg3;
        int var13 = class48.field956 - arg9;
        if (arg8 == 1) {
            if (arg0 == 0) {
                for (int var14 = 0; var14 < arg5; var14++) {
                    for (int var15 = 0; var15 < arg9; var15++) {
                        if (var15 <= var14) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 1) {
                for (int var16 = arg5 - 1; var16 >= 0; var16--) {
                    for (int var17 = 0; var17 < arg9; var17++) {
                        if (var16 >= var17) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 2) {
                for (int var18 = 0; var18 < arg5; var18++) {
                    for (int var19 = 0; var19 < arg9; var19++) {
                        if (var19 >= var18) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 3) {
                for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                    for (int var21 = 0; var21 < arg9; var21++) {
                        if (var21 >= var20) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            }
        } else if (arg8 == 2) {
            if (arg0 == 0) {
                for (int var22 = arg5 - 1; var22 >= 0; var22--) {
                    for (int var23 = 0; var23 < arg9; var23++) {
                        if (var22 >> 1 >= var23) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 1) {
                for (int var24 = 0; var24 < arg5; var24++) {
                    for (int var25 = 0; var25 < arg9; var25++) {
                        if (var25 >= var24 << 1) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 2) {
                for (int var26 = 0; var26 < arg5; var26++) {
                    for (int var27 = arg9 - 1; var27 >= 0; var27--) {
                        if (var26 >> 1 >= var27) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 3) {
                for (int var28 = arg5 - 1; var28 >= 0; var28--) {
                    for (int var29 = arg9 - 1; var29 >= 0; var29--) {
                        if (var28 << 1 <= var29) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            }
        } else if (arg8 == 3) {
            if (arg0 == 0) {
                for (int var30 = arg5 - 1; var30 >= 0; var30--) {
                    for (int var31 = arg9 - 1; var31 >= 0; var31--) {
                        if (var30 >> 1 >= var31) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 1) {
                for (int var32 = arg5 - 1; var32 >= 0; var32--) {
                    for (int var33 = 0; var33 < arg9; var33++) {
                        if (var32 << 1 <= var33) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 2) {
                for (int var34 = 0; var34 < arg5; var34++) {
                    for (int var35 = 0; var35 < arg9; var35++) {
                        if (var34 >> 1 >= var35) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 3) {
                for (int var36 = 0; var36 < arg5; var36++) {
                    for (int var37 = arg9 - 1; var37 >= 0; var37--) {
                        if (var37 >= var36 << 1) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            }
        } else if (arg8 == 4) {
            if (arg0 == 0) {
                for (int var38 = arg5 - 1; var38 >= 0; var38--) {
                    for (int var39 = 0; var39 < arg9; var39++) {
                        if (var38 >> 1 <= var39) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 1) {
                for (int var40 = 0; var40 < arg5; var40++) {
                    for (int var41 = 0; var41 < arg9; var41++) {
                        if (var41 <= var40 << 1) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 2) {
                for (int var42 = 0; var42 < arg5; var42++) {
                    for (int var43 = arg9 - 1; var43 >= 0; var43--) {
                        if (var43 >= var42 >> 1) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            } else if (arg0 == 3) {
                for (int var44 = arg5 - 1; var44 >= 0; var44--) {
                    for (int var45 = arg9 - 1; var45 >= 0; var45--) {
                        if (var44 << 1 >= var45) {
                            arg7[var12] = arg4;
                        } else if (arg10) {
                            arg7[var12] = arg6;
                        }
                        var12++;
                    }
                    var12 += var13;
                }
            }
        } else if (arg8 != 5) {
            if (arg8 == 6) {
                if (arg0 == 0) {
                    for (int var54 = 0; var54 < arg5; var54++) {
                        for (int var55 = 0; var55 < arg9; var55++) {
                            if (var55 <= arg9 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var56 = 0; var56 < arg5; var56++) {
                        for (int var57 = 0; var57 < arg9; var57++) {
                            if (arg5 / 2 >= var56) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var58 = 0; var58 < arg5; var58++) {
                        for (int var59 = 0; var59 < arg9; var59++) {
                            if (arg9 / 2 <= var59) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var60 = 0; var60 < arg5; var60++) {
                        for (int var61 = 0; var61 < arg9; var61++) {
                            if (var60 >= arg5 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
            }
            if (arg8 == 7) {
                if (arg0 == 0) {
                    for (int var62 = 0; var62 < arg5; var62++) {
                        for (int var63 = 0; var63 < arg9; var63++) {
                            if (var63 <= var62 - arg5 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var64 = arg5 - 1; var64 >= 0; var64--) {
                        for (int var65 = 0; var65 < arg9; var65++) {
                            if (var65 <= var64 - arg5 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var66 = arg5 - 1; var66 >= 0; var66--) {
                        for (int var67 = arg9 - 1; var67 >= 0; var67--) {
                            if (var66 - arg5 / 2 >= var67) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var68 = 0; var68 < arg5; var68++) {
                        for (int var69 = arg9 - 1; var69 >= 0; var69--) {
                            if (var68 - arg5 / 2 >= var69) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
            }
            if (arg8 == 8) {
                if (arg0 == 0) {
                    for (int var70 = 0; var70 < arg5; var70++) {
                        for (int var71 = 0; var71 < arg9; var71++) {
                            if (var71 >= var70 - arg5 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 1) {
                    for (int var72 = arg5 - 1; var72 >= 0; var72--) {
                        for (int var73 = 0; var73 < arg9; var73++) {
                            if (var73 >= var72 - arg5 / 2) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 2) {
                    for (int var74 = arg5 - 1; var74 >= 0; var74--) {
                        for (int var75 = arg9 - 1; var75 >= 0; var75--) {
                            if (var74 - arg5 / 2 <= var75) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
                if (arg0 == 3) {
                    for (int var76 = 0; var76 < arg5; var76++) {
                        for (int var77 = arg9 - 1; var77 >= 0; var77--) {
                            if (var76 - arg5 / 2 <= var77) {
                                arg7[var12] = arg4;
                            } else if (arg10) {
                                arg7[var12] = arg6;
                            }
                            var12++;
                        }
                        var12 += var13;
                    }
                    return;
                }
            }
        } else if (arg0 == 0) {
            for (int var46 = arg5 - 1; var46 >= 0; var46--) {
                for (int var47 = arg9 - 1; var47 >= 0; var47--) {
                    if (var46 >> 1 <= var47) {
                        arg7[var12] = arg4;
                    } else if (arg10) {
                        arg7[var12] = arg6;
                    }
                    var12++;
                }
                var12 += var13;
            }
        } else if (arg0 == 1) {
            for (int var48 = arg5 - 1; var48 >= 0; var48--) {
                for (int var49 = 0; var49 < arg9; var49++) {
                    if (var48 << 1 >= var49) {
                        arg7[var12] = arg4;
                    } else if (arg10) {
                        arg7[var12] = arg6;
                    }
                    var12++;
                }
                var12 += var13;
            }
        } else if (arg0 == 2) {
            for (int var50 = 0; var50 < arg5; var50++) {
                for (int var51 = 0; var51 < arg9; var51++) {
                    if (var50 >> 1 <= var51) {
                        arg7[var12] = arg4;
                    } else if (arg10) {
                        arg7[var12] = arg6;
                    }
                    var12++;
                }
                var12 += var13;
            }
        } else if (arg0 == 3) {
            for (int var52 = 0; var52 < arg5; var52++) {
                for (int var53 = arg9 - 1; var53 >= 0; var53--) {
                    if (var52 << 1 >= var53) {
                        arg7[var12] = arg4;
                    } else if (arg10) {
                        arg7[var12] = arg6;
                    }
                    var12++;
                }
                var12 += var13;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3725++;
        super.finalize();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILwa;ILcj;)[I")
    public final int[] method1321(int arg0, class238 arg1, int arg2, class33 arg3) {
        if (arg0 <= 115) {
            return null;
        }
        field3720++;
        if (this.field3731.method24(arg3, arg1, 0)) {
            int var5 = this.field3730 > arg2 ? arg2 : this.field3730;
            return this.field3731.method25(false, var5, arg1, var5, this.field3717, arg3, (byte) -124, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)V")
    public final void method1322(int arg0, byte arg1) {
        if (arg1 != 69) {
            this.method1322(-21, (byte) -112);
        }
        field3724++;
        if (this.field3721 == null || this.field3716 == 0 && this.field3742 == 0) {
            return;
        }
        if (class176.field3324 == null || class176.field3324.length < this.field3721.length) {
            class176.field3324 = new int[this.field3721.length];
        }
        int var3 = this.field3721.length == 4096 ? 64 : 128;
        int var4 = this.field3742 * arg0;
        int var5 = this.field3721.length;
        int var6 = var3 - 1;
        int var7 = this.field3716 * arg0 * var3;
        int var8 = var5 - 1;
        for (int var9 = 0; var9 < var5; var9 += var3) {
            int var11 = var8 & var7 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var4 + var12 & var6) + var11;
                class176.field3324[var13] = this.field3721[var14];
            }
        }
        int[] var10 = this.field3721;
        this.field3721 = class176.field3324;
        class176.field3324 = var10;
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(IB)I")
    public static final int method1323(int arg0, byte arg1) {
        if (arg1 > -112) {
            method1328(-116L, (short) -51, -39, null, -58, null, -96);
        }
        field3723++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLwa;Lcj;)Z")
    public final boolean method1324(byte arg0, class238 arg1, class33 arg2) {
        if (arg0 != -88) {
            method1325(false);
        }
        field3736++;
        return this.field3731.method24(arg2, arg1, 0);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static final void method1325(boolean arg0) {
        if (arg0) {
            method1325(false);
        }
        field3735++;
        while (class12.field167.method1505(1693770787, class8.field100) >= 27) {
            int var1 = class12.field167.method1506((byte) 110, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class70.field1262[var1] == null) {
                var2 = true;
                class70.field1262[var1] = new class66();
            }
            class66 var3 = class70.field1262[var1];
            class92.field1579[class95.field1669++] = var1;
            var3.field3529 = class203.field3758;
            int var4 = class79.field1387[class12.field167.method1506((byte) 118, 3)];
            if (var2) {
                var3.field3513 = var3.field3511 = var4;
            }
            int var5 = class12.field167.method1506((byte) 121, 1);
            int var6 = class12.field167.method1506((byte) 125, 1);
            if (var6 == 1) {
                class214.field4000[class19.field309++] = var1;
            }
            var3.field1190 = class59.method452(arg0, class12.field167.method1506((byte) 126, 14));
            int var7 = class12.field167.method1506((byte) 112, 5);
            int var8 = class12.field167.method1506((byte) 115, 5);
            var3.field3499 = var3.field1190.field3851;
            var3.field3531 = var3.field1190.field3848;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field3509 = var3.field1190.field3821;
            var3.field3461 = var3.field1190.field3830;
            var3.field3484 = var3.field1190.field3840;
            if (var3.field3461 == 0) {
                var3.field3511 = 0;
            }
            var3.field3472 = var3.field1190.field3820;
            var3.field3522 = var3.field1190.field3859;
            var3.field3466 = var3.field1190.field3822;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field3486 = var3.field1190.field3826;
            var3.method1264(class238.field4382.field3494[0] + var7, (byte) -109, var5 == 1, class238.field4382.field3525[0] + var8);
        }
        class12.field167.method1502(-65);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IFLcj;Lwa;I)[I")
    public final int[] method1326(int arg0, float arg1, class33 arg2, class238 arg3, int arg4) {
        field3729++;
        if (arg0 <= 115) {
            return null;
        }
        if (this.field3721 == null || this.field3718 != arg1) {
            if (!this.field3731.method24(arg2, arg3, 0)) {
                return null;
            }
            int var6 = arg4 < this.field3730 ? arg4 : this.field3730;
            this.field3721 = this.field3731.method25(true, var6, arg3, var6, this.field3717, arg2, (byte) -110, (double) arg1);
            this.field3718 = arg1;
            if (this.field3743) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                int[] var10 = new int[var6 * var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var14 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var14; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3721[var12];
                        var7[var34] += class58.method449(255, var35 >> 16);
                        var8[var34] += class58.method449(var35 >> 8, 255);
                        var9[var34] += class58.method449(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var25--;
                        var23 += var9[var25];
                        var24 += var7[var25];
                        var22 += var8[var25];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var27 = var14; var27 >= 0; var27--) {
                        int var31 = var24 / 9;
                        var21--;
                        var25--;
                        int var32 = var23 / 9;
                        int var33 = var22 / 9;
                        var19--;
                        var10[var19] = class138.method960(class138.method960(var33 << 8, var31 << 16), var32);
                        var24 += var7[var25] - var7[var21];
                        var22 += var8[var25] - var8[var21];
                        var23 += var9[var25] - var9[var21];
                        if (var25 == 0) {
                            var25 = var11;
                        }
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var28 = var14; var28 >= 0; var28--) {
                        var13--;
                        int var29 = this.field3721[var13];
                        var12--;
                        int var30 = this.field3721[var12];
                        var7[var28] += class58.method449(var30 >> 16, 255) - class58.method449(var29 >> 16, 255);
                        var8[var28] += (class58.method449(var30, 65363) >> 8) - (class58.method449(65311, var29) >> 8);
                        var9[var28] += -class58.method449(255, var29) + class58.method449(var30, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3721 = var10;
            }
        }
        return this.field3721;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1327(int arg0, int arg1, int arg2, int arg3) {
        if (class43.method380(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class217.method1439(var4 + 1, class39.field808[arg0][arg1][arg2] + arg3, var5 + 1) && class217.method1439(var4 + 128 - 1, class39.field808[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class217.method1439(var4 + 128 - 1, class39.field808[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class217.method1439(var4 + 1, class39.field808[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(JSILdc;ILdc;I)V")
    public static final void method1328(long arg0, short arg1, int arg2, class37 arg3, int arg4, class37 arg5, int arg6) {
        field3733++;
        if (class118.field2114 || arg4 <= class97.field1701) {
            return;
        }
        class231.field4234[class97.field1701] = arg5;
        class220.field4088[class97.field1701] = arg3;
        class171.field3281[class97.field1701] = arg1;
        class183.field3392[class97.field1701] = arg0;
        class73.field1302[class97.field1701] = arg2;
        class195.field3649[class97.field1701] = arg6;
        class97.field1701++;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lce;)V")
    public class200(class28 arg0) {
        this.field3731 = new class2(arg0);
        int var2 = arg0.method215(-1797813752);
        this.field3715 = (var2 & 0x2) != 0;
        int var3 = var2 >> 3 & 0x3;
        this.field3738 = (var2 & 0x1) != 0;
        int var4 = arg0.method215(-1797813752);
        this.field3730 = 0x1 << (var4 & 0x7) + 1;
        this.field3717 = (var4 & 0x80) != 0;
        this.field3743 = (var4 & 0x8) != 0;
        this.field3714 = arg0.method230((byte) -103);
        this.field3728 = arg0.method215(-1797813752);
        if (this.field3728 == 255) {
            this.field3728 = 256;
        }
        this.field3742 = arg0.method206(-16933672);
        this.field3716 = arg0.method206(-16933672);
        arg0.method215(-1797813752);
        arg0.method215(-1797813752);
        arg0.method215(-1797813752);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class200() {
        this.field3731 = new class2();
        this.field3738 = true;
        this.field3730 = 64;
    }
}
