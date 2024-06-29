import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class110 extends class516 {

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public int field1329 = 99;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field1323 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "F")
    public static float field1325;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field1334;

    // $FF: synthetic field
    @OriginalMember(owner = "client!m", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1335;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
    public static int[] field1327;

    // $FF: synthetic method
    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method594(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLpq;Lcr;)V", line = 4)
    public static final void method583(boolean arg0, class159 arg1, class112 arg2) {
        class448.field6139 = arg1;
        ++field1320;
        if (arg0) {
            method583(false, (class159) null, (class112) null);
        }
        class596.field8163 = arg2;
        class518.field7140 = "";
        if (!class112.field1360.startsWith("win")) {
            if (class112.field1360.startsWith("linux")) {
                class518.field7140 = class518.field7140 + "linux/";
            } else if (class112.field1360.startsWith("mac")) {
                class518.field7140 = class518.field7140 + "macos/";
            }
        } else {
            class518.field7140 = class518.field7140 + "windows/";
        }
        if (class596.field8163.field1357) {
            class518.field7140 = class518.field7140 + "msjava/";
        } else if (!class112.field1351.startsWith("amd64") && !class112.field1351.startsWith("x86_64")) {
            if (!class112.field1351.startsWith("i386") && !class112.field1351.startsWith("i486") && !class112.field1351.startsWith("i586") && !class112.field1351.startsWith("x86")) {
                if (!class112.field1351.startsWith("ppc")) {
                    class518.field7140 = class518.field7140 + "universal/";
                } else {
                    class518.field7140 = class518.field7140 + "ppc/";
                }
            } else {
                class518.field7140 = class518.field7140 + "x86/";
            }
        } else {
            class518.field7140 = class518.field7140 + "x86_64/";
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILsl;ZIIILoa;IIII)V", line = 61)
    public final void method584(int arg0, class245 arg1, boolean arg2, int arg3, int arg4, int arg5, class689 arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field1334;
        if (class72.field935.method1861(class161.field2038, 49) || class548.method3081(arg4, arg7, arg3, class160.field2028, -16623)) {
            if (~arg8 > ~this.field1329) {
                this.field1329 = arg8;
            }
            class252 var12 = class578.field7980.method1746(arg0, (byte) 124);
            if (!arg6.method1945() || !class72.field935.field6499 || !var12.field3451) {
                int var13;
                int var14;
                if (~arg10 != -2 && arg10 != 3) {
                    var13 = var12.field3450;
                    var14 = var12.field3431;
                } else {
                    var14 = var12.field3450;
                    var13 = var12.field3431;
                }
                int var15;
                int var16;
                if (~(arg7 + var13) >= ~super.field7069) {
                    var15 = arg7 - -(var13 + 1 >> 1);
                    var16 = (var13 >> 1) + arg7;
                } else {
                    var15 = arg7 + 1;
                    var16 = arg7;
                }
                int var17;
                int var18;
                if (super.field7074 < arg3 + var14) {
                    var17 = arg3 + 1;
                    var18 = arg3;
                } else {
                    var17 = (var14 + 1 >> 1) + arg3;
                    var18 = arg3 - -(var14 >> 1);
                }
                class176 var19 = class397.field5666[arg4];
                int var20 = var19.method150(var16, var18) + (var19.method150(var15, var18) - -var19.method150(var16, var17)) + var19.method150(var15, var17) >> 2;
                int var21 = (arg7 << 9) + (var13 << 8);
                int var22 = (arg3 << 9) + (var14 << 8);
                boolean var23 = class422.field5875 && !super.field7070 && var12.field3427;
                if (var12.method1563(-88)) {
                    class9.method62((class519) null, arg8, (class676) null, arg7, var12, arg10, true, arg3);
                }
                boolean var24 = arg5 == -1 && ~var12.field3436 == 0 && var12.field3393 == null && var12.field3391 == null && !var12.field3483;
                if (!class35.field356 || (!class2.method6(-12097, arg9) || var12.field3434 == 1) && (!class213.method1327(arg9, 12) || ~var12.field3434 != -1)) {
                    if (~arg9 == -23) {
                        if (class72.field935.field6500 || var12.field3453 != 0 || var12.field3440 == 1 || var12.field3412) {
                            class331 var26;
                            if (var24) {
                                class58 var25 = new class58(arg6, var12, arg4, var21, var20, var22, super.field7070, arg10, var23);
                                var26 = var25;
                                if (var25.method122(false)) {
                                    var25.method129(27921, arg6);
                                }
                            } else {
                                var26 = new class22(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg10, arg5);
                            }
                            class331 var27 = class618.method3391(arg8, arg7, arg3);
                            if (!(var27 instanceof class304)) {
                                class125.method764(arg8, arg7, arg3, var26);
                            } else {
                                ((class304) var27).field4086 = var26;
                            }
                            if (~var12.field3440 == -2 && arg1 != null) {
                                arg1.method1507(arg3, arg7, 262144);
                            }
                        }
                    } else if (arg9 != 10 && arg9 != 11) {
                        if (~arg9 <= -13 && arg9 <= 17 || ~arg9 <= -19 && arg9 <= 21) {
                            class293 var28;
                            if (!var24) {
                                var28 = new class551(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, arg7 - -var13 - 1, arg3, arg3 + var14 + -1, arg9, arg10, arg5);
                            } else {
                                class592 var29 = new class592(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, arg7 + var13 + -1, arg3, arg3 + -1 + var14, arg9, arg10, var23);
                                var28 = var29;
                                if (var29.method122(false)) {
                                    var29.method129(27921, arg6);
                                }
                            }
                            class293 var30 = class609.method3354(arg8, arg7, arg3, field1335 != null ? field1335 : (field1335 = method594("dda")));
                            if (var30 instanceof class613 && var30.field3921 == arg7 && var30.field3920 == arg3) {
                                ((class613) var30).field8366 = var28;
                            } else {
                                class621.method3396(var28, false);
                            }
                            if (class422.field5875 && !super.field7070 && ~arg9 <= -13 && ~arg9 >= -18 && arg9 != 13 && ~arg8 < -1 && ~var12.field3434 != -1) {
                                super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 4);
                            }
                            if (var12.field3440 != 0 && arg1 != null) {
                                arg1.method1503(arg3, var13, var14, var12.field3428, arg7, -126, !var12.field3416);
                            }
                        } else {
                            if (arg2) {
                                this.field1329 = -93;
                            }
                            if (arg9 == 0) {
                                int var31 = var12.field3434;
                                if (class575.field7959 && var12.field3434 == -1) {
                                    var31 = 1;
                                }
                                class142 var33;
                                if (var24) {
                                    class636 var32 = new class636(arg6, var12, arg4, var21, var20, var22, super.field7070, arg9, arg10, var23);
                                    if (var32.method122(false)) {
                                        var32.method129(27921, arg6);
                                    }
                                    var33 = var32;
                                } else {
                                    var33 = new class452(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg9, arg10, arg5);
                                }
                                class142 var34 = class147.method997(arg8, arg7, arg3);
                                if (var34 instanceof class46) {
                                    ((class46) var34).field613 = var33;
                                } else {
                                    class350.method2188(arg8, arg7, arg3, var33, (class142) null);
                                }
                                if (class422.field5875) {
                                    if (arg10 != 0) {
                                        if (~arg10 != -2) {
                                            if (~arg10 == -3) {
                                                if (var12.field3432) {
                                                    var19.method154(arg7 + 1, arg3, 50);
                                                    var19.method154(arg7 + 1, arg3 - -1, 50);
                                                }
                                                if (var31 == 1 && !super.field7070) {
                                                    super.field7075[arg8][arg7 + 1][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7 + 1][arg3], 1);
                                                }
                                            } else if (~arg10 == -4) {
                                                if (var12.field3432) {
                                                    var19.method154(arg7, arg3, 50);
                                                    var19.method154(arg7 + 1, arg3, 50);
                                                }
                                                if (var31 == 1 && !super.field7070) {
                                                    super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 2);
                                                }
                                            }
                                        } else {
                                            if (var12.field3432) {
                                                var19.method154(arg7, arg3 + 1, 50);
                                                var19.method154(arg7 + 1, arg3 + 1, 50);
                                            }
                                            if (var31 == 1 && !super.field7070) {
                                                super.field7075[arg8][arg7][arg3 - -1] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3 - -1], 2);
                                            }
                                        }
                                    } else {
                                        if (var12.field3432) {
                                            var19.method154(arg7, arg3, 50);
                                            var19.method154(arg7, arg3 + 1, 50);
                                        }
                                        if (~var31 == -2 && !super.field7070) {
                                            super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 1);
                                        }
                                    }
                                }
                                if (var12.field3440 != 0 && arg1 != null) {
                                    arg1.method1516(arg7, var12.field3428, arg9, arg10, 128, arg3, !var12.field3416);
                                }
                                if (~var12.field3452 != -65) {
                                    class517.method2941(arg8, arg7, arg3, var12.field3452);
                                }
                            } else if (~arg9 == -2) {
                                class142 var36;
                                if (var24) {
                                    class636 var35 = new class636(arg6, var12, arg4, var21, var20, var22, super.field7070, arg9, arg10, var23);
                                    if (var35.method122(false)) {
                                        var35.method129(27921, arg6);
                                    }
                                    var36 = var35;
                                } else {
                                    var36 = new class452(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg9, arg10, arg5);
                                }
                                class142 var37 = class147.method997(arg8, arg7, arg3);
                                if (var37 instanceof class46) {
                                    ((class46) var37).field613 = var36;
                                } else {
                                    class350.method2188(arg8, arg7, arg3, var36, (class142) null);
                                }
                                if (var12.field3432 && class422.field5875) {
                                    if (arg10 == 0) {
                                        var19.method154(arg7, arg3 + 1, 50);
                                    } else if (arg10 != 1) {
                                        if (arg10 != 2) {
                                            if (arg10 == 3) {
                                                var19.method154(arg7, arg3, 50);
                                            }
                                        } else {
                                            var19.method154(arg7 + 1, arg3, 50);
                                        }
                                    } else {
                                        var19.method154(arg7 + 1, arg3 + 1, 50);
                                    }
                                }
                                if (~var12.field3440 != -1 && arg1 != null) {
                                    arg1.method1516(arg7, var12.field3428, arg9, arg10, 128, arg3, !var12.field3416);
                                }
                            } else if (arg9 == 2) {
                                int var38 = 3 & arg10 - -1;
                                class142 var39;
                                class142 var40;
                                if (!var24) {
                                    var39 = new class452(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg9, arg10 + 4, arg5);
                                    var40 = new class452(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg9, var38, arg5);
                                } else {
                                    class636 var41 = new class636(arg6, var12, arg4, var21, var20, var22, super.field7070, arg9, arg10 - -4, var23);
                                    class636 var42 = new class636(arg6, var12, arg4, var21, var20, var22, super.field7070, arg9, var38, var23);
                                    if (var41.method122(false)) {
                                        var41.method129(27921, arg6);
                                    }
                                    if (var42.method122(false)) {
                                        var42.method129(27921, arg6);
                                    }
                                    var40 = var42;
                                    var39 = var41;
                                }
                                class350.method2188(arg8, arg7, arg3, var39, var40);
                                if (~var12.field3434 == -2 && class422.field5875 && !super.field7070) {
                                    if (arg10 == 0) {
                                        super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 1);
                                        super.field7075[arg8][arg7][arg3 + 1] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3 + 1], 2);
                                    } else if (~arg10 != -2) {
                                        if (arg10 == 2) {
                                            super.field7075[arg8][arg7 + 1][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7 + 1][arg3], 1);
                                            super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 2);
                                        } else if (~arg10 == -4) {
                                            super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 2);
                                            super.field7075[arg8][arg7][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3], 1);
                                        }
                                    } else {
                                        super.field7075[arg8][arg7][arg3 + 1] = (byte) class288.method1722(super.field7075[arg8][arg7][arg3 + 1], 2);
                                        super.field7075[arg8][arg7 + 1][arg3] = (byte) class288.method1722(super.field7075[arg8][arg7 + 1][arg3], 1);
                                    }
                                }
                                if (~var12.field3440 != -1 && arg1 != null) {
                                    arg1.method1516(arg7, var12.field3428, arg9, arg10, 128, arg3, !var12.field3416);
                                }
                                if (~var12.field3452 != -65) {
                                    class517.method2941(arg8, arg7, arg3, var12.field3452);
                                }
                            } else if (arg9 == 3) {
                                class142 var44;
                                if (var24) {
                                    class636 var43 = new class636(arg6, var12, arg4, var21, var20, var22, super.field7070, arg9, arg10, var23);
                                    var44 = var43;
                                    if (var43.method122(arg2)) {
                                        var43.method129(27921, arg6);
                                    }
                                } else {
                                    var44 = new class452(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg9, arg10, arg5);
                                }
                                class142 var45 = class147.method997(arg8, arg7, arg3);
                                if (var45 instanceof class46) {
                                    ((class46) var45).field613 = var44;
                                } else {
                                    class350.method2188(arg8, arg7, arg3, var44, (class142) null);
                                }
                                if (var12.field3432 && class422.field5875) {
                                    if (~arg10 != -1) {
                                        if (~arg10 == -2) {
                                            var19.method154(arg7 + 1, arg3 - -1, 50);
                                        } else if (~arg10 != -3) {
                                            if (arg10 == 3) {
                                                var19.method154(arg7, arg3, 50);
                                            }
                                        } else {
                                            var19.method154(arg7 - -1, arg3, 50);
                                        }
                                    } else {
                                        var19.method154(arg7, arg3 + 1, 50);
                                    }
                                }
                                if (var12.field3440 != 0 && arg1 != null) {
                                    arg1.method1516(arg7, var12.field3428, arg9, arg10, 128, arg3, !var12.field3416);
                                }
                            } else if (~arg9 == -10) {
                                class293 var46;
                                if (!var24) {
                                    var46 = new class551(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, var13 - 1 + arg7, arg3, var14 - 1 + arg3, arg9, arg10, arg5);
                                } else {
                                    class592 var47 = new class592(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, arg7, arg3, arg3, arg9, arg10, var23);
                                    if (var47.method122(arg2)) {
                                        var47.method129(27921, arg6);
                                    }
                                    var46 = var47;
                                }
                                class293 var48 = class609.method3354(arg8, arg7, arg3, field1335 != null ? field1335 : (field1335 = method594("dda")));
                                if (var48 instanceof class613 && ~var48.field3921 == ~arg7 && var48.field3920 == arg3) {
                                    ((class613) var48).field8366 = var46;
                                } else {
                                    class621.method3396(var46, false);
                                }
                                if (var12.field3440 != 0 && arg1 != null) {
                                    arg1.method1503(arg3, var13, var14, var12.field3428, arg7, -113, !var12.field3416);
                                }
                                if (var12.field3452 != 64) {
                                    class517.method2941(arg8, arg7, arg3, var12.field3452);
                                }
                            } else if (~arg9 == -5) {
                                class249 var50;
                                if (var24) {
                                    class93 var49 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, 0, 0, 0, arg9, arg10);
                                    var50 = var49;
                                    if (var49.method122(false)) {
                                        var49.method129(27921, arg6);
                                    }
                                } else {
                                    var50 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, 0, 0, 0, arg9, arg10, arg5);
                                }
                                class249 var51 = class7.method44(arg8, arg7, arg3);
                                if (!(var51 instanceof class202)) {
                                    class99.method541(arg8, arg7, arg3, var50, (class249) null);
                                } else {
                                    ((class202) var51).field2661 = var50;
                                }
                            } else if (~arg9 == -6) {
                                int var52 = 65;
                                class289 var53 = (class289) class147.method997(arg8, arg7, arg3);
                                if (var53 != null) {
                                    var52 = 1 + class578.field7980.method1746(var53.method130(-5582), (byte) 107).field3452;
                                }
                                class249 var54;
                                if (!var24) {
                                    var54 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, 0, class68.field899[arg10] * var52, class170.field2126[arg10] * var52, arg9, arg10, arg5);
                                } else {
                                    class93 var55 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, 0, class68.field899[arg10] * var52, class170.field2126[arg10] * var52, arg9, arg10);
                                    if (var55.method122(false)) {
                                        var55.method129(27921, arg6);
                                    }
                                    var54 = var55;
                                }
                                class249 var56 = class7.method44(arg8, arg7, arg3);
                                if (!(var56 instanceof class202)) {
                                    class99.method541(arg8, arg7, arg3, var54, (class249) null);
                                } else {
                                    ((class202) var56).field2661 = var54;
                                }
                            } else if (arg9 == 6) {
                                int var57 = 33;
                                class289 var58 = (class289) class147.method997(arg8, arg7, arg3);
                                if (var58 != null) {
                                    var57 = 1 + class578.field7980.method1746(var58.method130(-5582), (byte) 102).field3452 / 2;
                                }
                                class249 var60;
                                if (var24) {
                                    class93 var59 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, arg10, class68.field899[arg10] * var57, class170.field2126[arg10] * var57, arg9, arg10 + 4);
                                    var60 = var59;
                                    if (var59.method122(false)) {
                                        var59.method129(27921, arg6);
                                    }
                                } else {
                                    var60 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg10, class326.field4749[arg10] * var57, class643.field9108[arg10] * var57, arg9, arg10 + 4, arg5);
                                }
                                class249 var61 = class7.method44(arg8, arg7, arg3);
                                if (var61 instanceof class202) {
                                    ((class202) var61).field2661 = var60;
                                } else {
                                    class99.method541(arg8, arg7, arg3, var60, (class249) null);
                                }
                            } else if (arg9 == 7) {
                                int var62 = arg10 + 2 & 3;
                                class249 var64;
                                if (var24) {
                                    class93 var63 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, var62, 0, 0, arg9, var62 + 4);
                                    if (var63.method122(arg2)) {
                                        var63.method129(27921, arg6);
                                    }
                                    var64 = var63;
                                } else {
                                    var64 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, var62, 0, 0, arg9, var62 + 4, arg5);
                                }
                                class249 var65 = class7.method44(arg8, arg7, arg3);
                                if (var65 instanceof class202) {
                                    ((class202) var65).field2661 = var64;
                                } else {
                                    class99.method541(arg8, arg7, arg3, var64, (class249) null);
                                }
                            } else if (~arg9 == -9) {
                                int var66 = arg10 - -2 & 3;
                                int var67 = 33;
                                class289 var68 = (class289) class147.method997(arg8, arg7, arg3);
                                if (var68 != null) {
                                    var67 = 1 + class578.field7980.method1746(var68.method130(-5582), (byte) 91).field3452 / 2;
                                }
                                class249 var71;
                                class249 var72;
                                if (var24) {
                                    class93 var69 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, arg10, class326.field4749[arg10] * var67, class643.field9108[arg10] * var67, arg9, arg10 + 4);
                                    class93 var70 = new class93(arg6, var12, arg4, var21, var20, var22, super.field7070, arg10, 0, 0, arg9, var66 + 4);
                                    if (var69.method122(false)) {
                                        var69.method129(27921, arg6);
                                    }
                                    var71 = var69;
                                    if (var70.method122(arg2)) {
                                        var70.method129(27921, arg6);
                                    }
                                    var72 = var70;
                                } else {
                                    class608 var73 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg10, class326.field4749[arg10] * var67, class643.field9108[arg10] * var67, arg9, arg10 + 4, arg5);
                                    class608 var74 = new class608(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg10, 0, 0, arg9, var66 + 4, arg5);
                                    var71 = var73;
                                    var72 = var74;
                                }
                                class99.method541(arg8, arg7, arg3, var71, var72);
                            }
                        }
                    } else {
                        class592 var75 = null;
                        class293 var76;
                        int var77;
                        if (!var24) {
                            var76 = new class551(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, var13 + -1 + arg7, arg3, arg3 + -1 - -var14, arg9, arg10, arg5);
                            var77 = 15;
                        } else {
                            class592 var78 = new class592(arg6, var12, arg8, arg4, var21, var20, var22, super.field7070, arg7, arg7 + var13 + -1, arg3, var14 + -1 + arg3, arg9, arg10, var23);
                            var77 = var78.method3295(true);
                            var75 = var78;
                            var76 = var78;
                        }
                        class293 var79 = class609.method3354(arg8, arg7, arg3, field1335 != null ? field1335 : (field1335 = method594("dda")));
                        boolean var80 = false;
                        if (var79 instanceof class613 && var79.field3921 == arg7 && var79.field3920 == arg3) {
                            ((class613) var79).field8366 = var76;
                            var80 = true;
                        }
                        if (var80 || class621.method3396(var76, false)) {
                            if (var75 != null && var75.method122(false)) {
                                var75.method129(27921, arg6);
                            }
                            if (var12.field3432 && class422.field5875) {
                                if (var77 > 30) {
                                    var77 = 30;
                                }
                                for (int var81 = 0; ~var13 <= ~var81; ++var81) {
                                    for (int var82 = 0; ~var14 <= ~var82; ++var82) {
                                        var19.method154(arg7 + var81, arg3 - -var82, var77);
                                    }
                                }
                            }
                        }
                        if (var12.field3440 != 0 && arg1 != null) {
                            arg1.method1503(arg3, var13, var14, var12.field3428, arg7, -115, !var12.field3416);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIZ)V", line = 771)
    public class110(int arg0, int arg1, int arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3, class276.field3744, class261.field3604);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Loa;B)V", line = 776)
    public final void method585(class689 arg0, byte arg1) {
        class122.method743(arg0);
        ++field1331;
        if (~super.field7066 < -2) {
            for (int var3 = 0; var3 < super.field7069; ++var3) {
                for (int var4 = 0; ~super.field7074 < ~var4; ++var4) {
                    if ((class645.field9140[1][var3][var4] & 2) == 2) {
                        class40.method247(var3, var4);
                    }
                }
            }
        }
        if (arg1 > -42) {
            this.field1329 = 63;
        }
        for (int var5 = 0; var5 < super.field7066; ++var5) {
            for (int var6 = 0; var6 <= super.field7074; ++var6) {
                for (int var7 = 0; ~super.field7069 <= ~var7; ++var7) {
                    if (~(super.field7075[var5][var7][var6] & 1) != -1) {
                        int var8 = var6;
                        int var9 = var6;
                        int var10 = var5;
                        int var11 = var5;
                        while (~var9 > ~super.field7074 && ~(1 & super.field7075[var5][var7][var9 + 1]) != -1) {
                            ++var9;
                        }
                        while (~var8 < -1 && ~(1 & super.field7075[var5][var7][var8 + -1]) != -1) {
                            --var8;
                        }
                        label171: while (~var10 < -1) {
                            for (int var12 = var8; var9 >= var12; ++var12) {
                                if (~(super.field7075[var10 - 1][var7][var12] & 1) == -1) {
                                    break label171;
                                }
                            }
                            --var10;
                        }
                        label160: while (~var11 > -4) {
                            for (int var13 = var8; var13 <= var9; ++var13) {
                                if ((1 & super.field7075[var11 + 1][var7][var13]) == 0) {
                                    break label160;
                                }
                            }
                            ++var11;
                        }
                        int var14 = (var9 - var8 + 1) * (-var10 + 1 + var11);
                        if (var14 >= 2) {
                            short var15 = 960;
                            int var16 = super.field7060[var11][var7][var8] - var15;
                            int var17 = super.field7060[var10][var7][var8];
                            class628.method3424(1, var7 << 9, var7 << 9, var8 << 9, (var9 << 9) + 512, var16, var17);
                            for (int var18 = var10; ~var11 <= ~var18; ++var18) {
                                for (int var19 = var8; ~var9 <= ~var19; ++var19) {
                                    super.field7075[var18][var7][var19] = (byte) class230.method1424(super.field7075[var18][var7][var19], -2);
                                }
                            }
                        }
                    }
                    if ((super.field7075[var5][var7][var6] & 2) != 0) {
                        int var20 = var7;
                        int var21 = var7;
                        int var22 = var5;
                        while (~var21 > ~super.field7069 && ~(2 & super.field7075[var5][var21 - -1][var6]) != -1) {
                            ++var21;
                        }
                        int var23 = var5;
                        while (var20 > 0 && ~(2 & super.field7075[var5][var20 - 1][var6]) != -1) {
                            --var20;
                        }
                        label224: while (~var22 < -1) {
                            for (int var24 = var20; var24 <= var21; ++var24) {
                                if ((super.field7075[var22 - 1][var24][var6] & 2) == 0) {
                                    break label224;
                                }
                            }
                            --var22;
                        }
                        label213: while (var23 < 3) {
                            for (int var25 = var20; var25 <= var21; ++var25) {
                                if (~(super.field7075[var23 + 1][var25][var6] & 2) == -1) {
                                    break label213;
                                }
                            }
                            ++var23;
                        }
                        int var26 = (-var22 + 1 + var23) * (var21 + 1 + -var20);
                        if (var26 >= 2) {
                            short var27 = 960;
                            int var28 = super.field7060[var23][var20][var6] - var27;
                            int var29 = super.field7060[var22][var20][var6];
                            class628.method3424(2, var20 << 9, (var21 << 9) - -512, var6 << 9, var6 << 9, var28, var29);
                            for (int var30 = var22; ~var30 >= ~var23; ++var30) {
                                for (int var31 = var20; ~var31 >= ~var21; ++var31) {
                                    super.field7075[var30][var31][var6] = (byte) class230.method1424(super.field7075[var30][var31][var6], -3);
                                }
                            }
                        }
                    }
                    if (~(4 & super.field7075[var5][var7][var6]) != -1) {
                        int var32 = var7;
                        int var33 = var7;
                        int var34;
                        for (var34 = var6; ~var34 < -1 && (4 & super.field7075[var5][var7][var34 + -1]) != 0; --var34) {
                        }
                        int var35;
                        for (var35 = var6; super.field7074 > var35 && ~(super.field7075[var5][var7][var35 - -1] & 4) != -1; ++var35) {
                        }
                        label278: while (var32 > 0) {
                            for (int var36 = var34; var35 >= var36; ++var36) {
                                if (~(super.field7075[var5][var32 + -1][var36] & 4) == -1) {
                                    break label278;
                                }
                            }
                            --var32;
                        }
                        label267: while (super.field7069 > var33) {
                            for (int var37 = var34; ~var35 <= ~var37; ++var37) {
                                if ((4 & super.field7075[var5][var33 + 1][var37]) == 0) {
                                    break label267;
                                }
                            }
                            ++var33;
                        }
                        if (~((-var34 + var35 + 1) * (var33 + 1 + -var32)) <= -5) {
                            int var38 = super.field7060[var5][var32][var34];
                            class628.method3424(4, var32 << 9, (var33 << 9) - -512, var34 << 9, (var35 << 9) - -512, var38, var38);
                            for (int var39 = var32; ~var39 >= ~var33; ++var39) {
                                for (int var40 = var34; ~var35 <= ~var40; ++var40) {
                                    super.field7075[var5][var39][var40] = (byte) class230.method1424(super.field7075[var5][var39][var40], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
        super.field7075 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BII)Z", line = 1063)
    public static final boolean method586(byte arg0, int arg1, int arg2) {
        ++field1332;
        if (arg0 != -41) {
            method589(52);
        }
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V", line = 1076)
    public static void method587(byte arg0) {
        field1327 = null;
        if (arg0 <= 103) {
            field1323 = -4;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Lsl;ILoa;BI[B)V", line = 1088)
    public final void method588(class245[] arg0, int arg1, class689 arg2, byte arg3, int arg4, byte[] arg5) {
        ++field1330;
        int var7 = 87 % ((-59 - arg3) / 55);
        class138 var8 = new class138(arg5);
        int var9 = -1;
        while (true) {
            int var10 = var8.method945(-22);
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method914(125);
                if (var12 == 0) {
                    break;
                }
                var11 += var12 + -1;
                int var13 = var11 & 63;
                int var14 = (var11 & 4090) >> 6;
                int var15 = var11 >> 12;
                int var16 = var8.method957((byte) -102);
                int var17 = var16 >> 2;
                int var18 = var16 & 3;
                int var19 = arg4 + var14;
                int var20 = var13 - -arg1;
                if (var19 > 0 && ~var20 < -1 && var19 < super.field7069 - 1 && ~var20 > ~(super.field7074 + -1)) {
                    class245 var21 = null;
                    if (!super.field7070) {
                        int var22 = var15;
                        if ((2 & class645.field9140[1][var19][var20]) == 2) {
                            var22 = var15 - 1;
                        }
                        if (~var22 <= -1) {
                            var21 = arg0[var22];
                        }
                    }
                    this.method584(var9, var21, false, var20, var15, -1, arg2, var19, var15, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)Z", line = 1163)
    public static final boolean method589(int arg0) {
        if (arg0 != -32543) {
            field1323 = 122;
        }
        ++field1321;
        try {
            return class170.method1132(-38);
        } catch (IOException var4) {
            class537.method3032((byte) 110);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class308.field4138 == null ? -1 : class308.field4138.method2056(arg0 + 32598)) + "," + (class143.field1819 == null ? -1 : class143.field1819.method2056(91)) + "," + (class99.field1210 != null ? class99.field1210.method2056(93) : -1) + " - " + class161.field2037 + "," + (class596.field8164.field526[0] + class253.field3490) + "," + (class596.field8164.field516[0] + class186.field2280) + " - ";
            for (int var3 = 0; ~var3 > ~class161.field2037 && var3 < 50; ++var3) {
                var2 = var2 + class164.field2068.field1712[var3] + ",";
            }
            class282.method1694(var2, (byte) 47, var5);
            class511.method2893(1000000, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[BILoa;[Lsl;)V", line = 1198)
    public final void method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, class689 arg9, class245[] arg10) {
        ++field1328;
        class138 var12 = new class138(arg7);
        int var13 = arg8;
        while (true) {
            int var14 = var12.method945(arg8 ^ 127);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method914(104);
                if (~var16 == -1) {
                    break;
                }
                var15 += var16 + -1;
                int var17 = 63 & var15;
                int var18 = 63 & var15 >> 6;
                int var19 = var15 >> 12;
                int var20 = var12.method957((byte) -65);
                int var21 = var20 >> 2;
                int var22 = var20 & 3;
                if (arg1 == var19 && ~var18 <= ~arg4 && ~(arg4 + 8) < ~var18 && ~var17 <= ~arg3 && ~(arg3 + 8) < ~var17) {
                    class252 var23 = class578.field7980.method1746(var13, (byte) 108);
                    int var24 = arg5 + class316.method2036(7 & var18, (byte) 127, var23.field3450, var22, arg0, var23.field3431, 7 & var17);
                    int var25 = class390.method2329(arg0, var23.field3431, var22, var23.field3450, 7 & var17, 1, var18 & 7) + arg2;
                    if (var24 > 0 && ~var25 < -1 && var24 < super.field7069 + -1 && ~var25 > ~(super.field7074 + -1)) {
                        class245 var26 = null;
                        if (!super.field7070) {
                            int var27 = arg6;
                            if ((2 & class645.field9140[1][var24][var25]) == 2) {
                                var27 = arg6 - 1;
                            }
                            if (~var27 <= -1) {
                                var26 = arg10[var27];
                            }
                        }
                        this.method584(var13, var26, false, var25, arg6, -1, arg9, var24, arg6, var21, arg0 + var22 & 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILsl;ILoa;III)V", line = 1274)
    public final void method591(int arg0, class245 arg1, int arg2, class689 arg3, int arg4, int arg5, int arg6) {
        ++field1333;
        class289 var8 = null;
        if (arg5 == 0) {
            var8 = (class289) class147.method997(arg0, arg4, arg2);
        }
        if (arg5 == arg6) {
            var8 = (class289) class7.method44(arg0, arg4, arg2);
        }
        if (~arg5 == -3) {
            var8 = (class289) class609.method3354(arg0, arg4, arg2, field1335 != null ? field1335 : (field1335 = method594("dda")));
        }
        if (arg5 == 3) {
            var8 = (class289) class618.method3391(arg0, arg4, arg2);
        }
        if (var8 != null) {
            class252 var9 = class578.field7980.method1746(var8.method130(-5582), (byte) 115);
            int var10 = var8.method128((byte) 42);
            int var11 = var8.method126(20377);
            if (var9.method1563(-87)) {
                class436.method2502(arg0, false, arg4, arg2, var9);
            }
            if (var8.method122(false)) {
                var8.method131(-20929, arg3);
            }
            if (~arg5 == -1) {
                class142 var12 = class147.method997(arg0, arg4, arg2);
                if (var12 instanceof class46) {
                    ((class46) var12).field613 = null;
                } else {
                    class84.method473(arg0, arg4, arg2);
                }
                if (var9.field3440 != 0) {
                    arg1.method1514(var11, (byte) 68, arg2, arg4, var10, !var9.field3416, var9.field3428);
                    return;
                }
                return;
            }
            if (arg5 == 1) {
                class249 var13 = class7.method44(arg0, arg4, arg2);
                if (!(var13 instanceof class202)) {
                    class522.method2980(arg0, arg4, arg2);
                    return;
                }
                ((class202) var13).field2661 = null;
                return;
            }
            if (arg5 == 2) {
                class293 var14 = class609.method3354(arg0, arg4, arg2, field1335 != null ? field1335 : (field1335 = method594("dda")));
                if (var14 instanceof class613 && var14.field3921 == arg4 && var14.field3920 == arg2) {
                    ((class613) var14).field8366 = null;
                } else {
                    class445.method2556(arg0, arg4, arg2, field1335 != null ? field1335 : (field1335 = method594("dda")));
                }
                if (~var9.field3440 != -1 && var9.field3450 + arg4 < super.field7069 && var9.field3450 + arg2 < super.field7074 && super.field7069 > var9.field3431 + arg4 && var9.field3431 + arg2 < super.field7074) {
                    arg1.method1500(var9.field3428, !var9.field3416, arg2, var9.field3431, 8192, var11, arg4, var9.field3450);
                    return;
                }
                return;
            }
            if (arg5 == 3) {
                class331 var15 = class618.method3391(arg0, arg4, arg2);
                if (var15 instanceof class304) {
                    ((class304) var15).field4086 = null;
                } else {
                    class536.method3029(arg0, arg4, arg2);
                }
                if (~var9.field3440 == -2) {
                    arg1.method1508((byte) 70, arg4, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILoa;Ldga;[III)V", line = 1381)
    public final void method592(int arg0, class689 arg1, class138 arg2, int[] arg3, int arg4, int arg5) {
        ++field1326;
        if (arg4 >= -84) {
            method583(true, (class159) null, (class112) null);
        }
        if (!super.field7070) {
            boolean var7 = false;
            if (arg3 != null) {
                arg3[0] = -1;
            }
            class208 var8 = null;
            while (true) {
                while (arg2.field1745 < arg2.field1712.length) {
                    int var18 = arg2.method957((byte) -92);
                    if (var18 == 0) {
                        var8 = new class208(arg2);
                    } else if (var18 == 1) {
                        int var19 = arg2.method957((byte) -71);
                        if (var19 > 0) {
                            for (int var20 = 0; var20 < var19; ++var20) {
                                class123 var21 = new class123(arg1, arg2, 2);
                                if (~var21.field1579 == -32) {
                                    class646 var22 = class640.field8730.method2494(31, arg2.method922((byte) -125));
                                    var21.method758(var22.field9148, 512, var22.field9149, var22.field9146, var22.field9145);
                                }
                                if (~arg1.method1962() < -1) {
                                    class329 var23 = var21.field1591;
                                    int var24 = (arg5 << 9) + var23.method2112(0);
                                    int var25 = (arg0 << 9) + var23.method2114((byte) -107);
                                    int var26 = var24 >> 9;
                                    int var27 = var25 >> 9;
                                    if (var26 >= 0 && var27 >= 0 && ~var26 > ~super.field7069 && var27 < super.field7074) {
                                        var23.method1721(var24, super.field7060[var21.field1590][var26][var27] + -var23.method2115((byte) -63), var25, 1);
                                        class669.method3710(var21);
                                    }
                                }
                            }
                        }
                    } else if (~var18 == -3) {
                        if (var8 == null) {
                            var8 = new class208();
                        }
                        var8.method1304(-115, arg2);
                    } else if (~var18 == -129) {
                        if (arg3 != null) {
                            arg3[0] = arg2.method922((byte) -122);
                            arg3[1] = arg2.method924(2);
                            arg3[2] = arg2.method924(2);
                            arg3[3] = arg2.method924(2);
                            arg3[4] = arg2.method922((byte) -119);
                        } else {
                            arg2.field1745 += 10;
                        }
                    } else {
                        if (var18 != 129) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7065 == null) {
                            super.field7065 = new byte[4][][];
                        }
                        var7 = true;
                        for (int var28 = 0; var28 < 4; ++var28) {
                            byte var29 = arg2.method950(false);
                            if (~var29 == -1 && super.field7065[var28] != null) {
                                int var30 = arg5;
                                int var31 = arg5 + 64;
                                int var32 = arg0;
                                if (~arg0 <= -1) {
                                    if (arg0 >= super.field7074) {
                                        var32 = super.field7074;
                                    }
                                } else {
                                    var32 = 0;
                                }
                                if (arg5 < 0) {
                                    var30 = 0;
                                } else if (~arg5 <= ~super.field7069) {
                                    var30 = super.field7069;
                                }
                                int var33 = arg0 - -64;
                                if (~var31 > -1) {
                                    var31 = 0;
                                } else if (super.field7069 <= var31) {
                                    var31 = super.field7069;
                                }
                                if (var33 < 0) {
                                    var33 = 0;
                                } else if (var33 >= super.field7074) {
                                    var33 = super.field7074;
                                }
                                while (var31 > var30) {
                                    while (var33 > var32) {
                                        super.field7065[var28][var30][var32] = 0;
                                        ++var32;
                                    }
                                    ++var30;
                                }
                            } else if (~var29 != -2) {
                                if (~var29 == -3) {
                                    if (super.field7065[var28] == null) {
                                        super.field7065[var28] = new byte[super.field7069 + 1][super.field7074 - -1];
                                    }
                                    if (var28 > 0) {
                                        int var34 = arg5;
                                        int var35 = arg5 + 64;
                                        int var36 = arg0;
                                        int var37 = arg0 + 64;
                                        if (arg0 < 0) {
                                            var36 = 0;
                                        } else if (~arg0 <= ~super.field7074) {
                                            var36 = super.field7074;
                                        }
                                        if (~arg5 > -1) {
                                            var34 = 0;
                                        } else if (super.field7069 <= arg5) {
                                            var34 = super.field7069;
                                        }
                                        if (var35 < 0) {
                                            var35 = 0;
                                        } else if (~var35 <= ~super.field7069) {
                                            var35 = super.field7069;
                                        }
                                        if (var37 >= 0) {
                                            if (~super.field7074 >= ~var37) {
                                                var37 = super.field7074;
                                            }
                                        } else {
                                            var37 = 0;
                                        }
                                        while (~var34 > ~var35) {
                                            while (~var36 > ~var37) {
                                                super.field7065[var28][var34][var36] = super.field7065[var28 + -1][var34][var36];
                                                ++var36;
                                            }
                                            ++var34;
                                        }
                                    }
                                }
                            } else {
                                if (super.field7065[var28] == null) {
                                    super.field7065[var28] = new byte[super.field7069 + 1][super.field7074 + 1];
                                }
                                for (int var38 = 0; var38 < 64; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg2.method950(false);
                                        for (int var41 = arg5 + var38; var38 - -arg5 + 4 > var41; ++var41) {
                                            for (int var42 = arg0 + var39; var42 < var39 - -arg0 + 4; ++var42) {
                                                if (~var41 <= -1 && ~super.field7069 < ~var41 && var42 >= 0 && var42 < super.field7074) {
                                                    super.field7065[var28][var41][var42] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var8 != null) {
                    for (int var9 = 0; ~var9 > -9; ++var9) {
                        for (int var10 = 0; var10 < 8; ++var10) {
                            int var11 = (arg5 >> 3) + var9;
                            int var12 = (arg0 >> 3) + var10;
                            if (~var11 <= -1 && ~var11 > ~(super.field7069 >> 3) && var12 >= 0 && var12 < super.field7074 >> 3) {
                                class59.method367(0, var11, var8, var12);
                            }
                        }
                    }
                }
                if (!var7 && super.field7065 != null) {
                    for (int var13 = 0; var13 < 4; ++var13) {
                        if (super.field7065[var13] != null) {
                            for (int var14 = 0; var14 < 16; ++var14) {
                                for (int var15 = 0; ~var15 > -17; ++var15) {
                                    int var16 = (arg5 >> 2) + var14;
                                    int var17 = (arg0 >> 2) + var15;
                                    if (var16 >= 0 && var16 < 26 && ~var17 <= -1 && ~var17 > -27) {
                                        super.field7065[var13][var16][var17] = 0;
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[IILoa;IZLdga;III)V", line = 1748)
    public final void method593(int arg0, int arg1, int[] arg2, int arg3, class689 arg4, int arg5, boolean arg6, class138 arg7, int arg8, int arg9, int arg10) {
        ++field1322;
        if (!super.field7070) {
            boolean var12 = false;
            if (arg2 != null) {
                arg2[0] = -1;
            }
            class208 var13 = null;
            int var14 = (7 & arg0) * 8;
            int var15 = (7 & arg10) * 8;
            while (true) {
                while (arg7.field1712.length > arg7.field1745) {
                    int var20 = arg7.method957((byte) -99);
                    if (var20 == 0) {
                        var13 = new class208(arg7);
                    } else if (~var20 == -2) {
                        int var21 = arg7.method957((byte) -119);
                        if (var21 > 0) {
                            for (int var22 = 0; ~var21 < ~var22; ++var22) {
                                class123 var23 = new class123(arg4, arg7, 2);
                                if (var23.field1579 == 31) {
                                    class646 var24 = class640.field8730.method2494(31, arg7.method922((byte) -124));
                                    var23.method758(var24.field9148, 512, var24.field9149, var24.field9146, var24.field9145);
                                }
                                if (arg4.method1962() > 0) {
                                    class329 var25 = var23.field1591;
                                    int var26 = var25.method2112(0) >> 9;
                                    int var27 = var25.method2114((byte) -119) >> 9;
                                    if (~var23.field1590 == ~arg8 && ~var26 <= ~var14 && ~(var14 - -8) < ~var26 && ~var27 <= ~var15 && var15 - -8 > var27) {
                                        int var28 = class502.method2837(118, var25.method2114((byte) -122) & 4095, arg9, var25.method2112(0) & 4095) + (arg5 << 9);
                                        int var29 = var28 >> 9;
                                        int var30 = class315.method2032(var25.method2114((byte) -97) & 4095, arg9, (byte) -122, 4095 & var25.method2112(0)) + (arg3 << 9);
                                        int var31 = var30 >> 9;
                                        if (var29 >= 0 && ~var31 <= -1 && var29 < super.field7069 && super.field7074 > var31) {
                                            var25.method1721(var28, super.field7060[arg8][var29][var31] - var25.method2115((byte) -63), var30, 1);
                                            class669.method3710(var23);
                                        }
                                    }
                                }
                            }
                        }
                    } else if (~var20 == -3) {
                        if (var13 == null) {
                            var13 = new class208();
                        }
                        var13.method1304(-95, arg7);
                    } else if (var20 == 128) {
                        if (arg2 == null) {
                            arg7.field1745 += 10;
                        } else {
                            arg2[0] = arg7.method922((byte) -124);
                            arg2[1] = arg7.method924(2);
                            arg2[2] = arg7.method924(2);
                            arg2[3] = arg7.method924(2);
                            arg2[4] = arg7.method922((byte) -114);
                        }
                    } else {
                        if (~var20 != -130) {
                            throw new IllegalStateException("");
                        }
                        if (super.field7065 == null) {
                            super.field7065 = new byte[4][][];
                        }
                        for (int var32 = 0; ~var32 > -5; ++var32) {
                            byte var33 = arg7.method950(false);
                            if (~var33 == -1 && super.field7065[arg1] != null) {
                                if (~var32 >= ~arg8) {
                                    int var34 = arg5;
                                    int var35 = arg5 + 7;
                                    int var36 = arg3;
                                    int var37 = arg3 + 7;
                                    if (~var35 <= -1) {
                                        if (~super.field7069 >= ~var35) {
                                            var35 = super.field7069;
                                        }
                                    } else {
                                        var35 = 0;
                                    }
                                    if (arg5 < 0) {
                                        var34 = 0;
                                    } else if (~super.field7069 >= ~arg5) {
                                        var34 = super.field7069;
                                    }
                                    if (~arg3 > -1) {
                                        var36 = 0;
                                    } else if (super.field7074 <= arg3) {
                                        var36 = super.field7074;
                                    }
                                    if (~var37 <= -1) {
                                        if (~super.field7074 >= ~var37) {
                                            var37 = super.field7074;
                                        }
                                    } else {
                                        var37 = 0;
                                    }
                                    while (var35 > var34) {
                                        while (var37 > var36) {
                                            super.field7065[arg1][var34][var36] = 0;
                                            ++var36;
                                        }
                                        ++var34;
                                    }
                                }
                            } else if (~var33 == -2) {
                                if (super.field7065[arg1] == null) {
                                    super.field7065[arg1] = new byte[super.field7069 + 1][super.field7074 + 1];
                                }
                                for (int var38 = 0; ~var38 > -65; var38 += 4) {
                                    for (int var39 = 0; var39 < 64; var39 += 4) {
                                        byte var40 = arg7.method950(false);
                                        if (~var32 >= ~arg8) {
                                            for (int var41 = var38; var41 < var38 + 4; ++var41) {
                                                for (int var42 = var39; var42 < var39 + 4; ++var42) {
                                                    if (~var41 <= ~var14 && var14 - -8 > var41 && ~var42 <= ~var15 && ~var15 > ~(var15 - -8)) {
                                                        int var43 = arg5 - -class245.method1506(7 & var41, var42 & 7, false, arg9);
                                                        int var44 = class103.method554(arg9, var41 & 7, 7 & var42, false) + arg3;
                                                        if (~var43 <= -1 && var43 < super.field7069 && var44 >= 0 && ~var44 > ~super.field7074) {
                                                            super.field7065[arg1][var43][var44] = var40;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (var13 != null) {
                    class59.method367(0, arg5 >> 3, var13, arg3 >> 3);
                }
                if (!arg6) {
                    this.method593(-14, 59, (int[]) null, -71, (class689) null, -45, false, (class138) null, -14, 5, -94);
                }
                if (!var12 && super.field7065 != null && super.field7065[arg1] != null) {
                    int var16 = arg5 - -7;
                    int var17 = arg3 - -7;
                    for (int var18 = arg5; ~var18 > ~var16; ++var18) {
                        for (int var19 = arg3; var17 > var19; ++var19) {
                            super.field7065[arg1][var18][var19] = 0;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
