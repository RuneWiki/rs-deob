import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class131 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Lhj;")
    public static class69 field2429 = class181.method1318(")4", (byte) -108);

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Lhj;")
    public static class69 field2434 = class181.method1318("Art", (byte) -110);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "[Lok;")
    public static class38[] field2428 = new class38[32768];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Lhj;")
    public static class69 field2436 = class181.method1318("Lade Konfiguration )2 ", (byte) -111);

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lhj;")
    public static class69 field2437 = class181.method1318("Fps:", (byte) -109);

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[I")
    public static int[] field2435;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII[IIIIIZI)V")
    public static final void method969(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field2438++;
        int var11 = arg2;
        if (class15.field209 <= arg2) {
            return;
        }
        int var12 = arg2 + arg5;
        if (class15.field204 > arg2) {
            var11 = class15.field204;
        }
        if (var12 <= class15.field204) {
            return;
        }
        if (class15.field209 < var12) {
            var12 = class15.field209;
        }
        int var13 = arg10;
        if (arg10 >= class15.field208) {
            return;
        }
        if (arg10 < class15.field202) {
            var13 = class15.field202;
        }
        int var14 = arg10 + arg3;
        if (var14 <= class15.field202) {
            return;
        }
        if (arg0 == 9) {
            arg0 = 1;
            arg6 = arg6 + 1 & 0x3;
        }
        int var15 = class15.field206 * var13 + var11;
        if (arg0 == 10) {
            arg0 = 1;
            arg6 = arg6 + 3 & 0x3;
        }
        if (arg0 == 11) {
            arg0 = 8;
            arg6 = arg6 + 3 & 0x3;
        }
        if (class15.field208 < var14) {
            var14 = class15.field208;
        }
        int var16 = var13 - arg10;
        int var17 = class15.field206 + var11 - var12;
        int var18 = var11 - arg2;
        int var19 = var14 - arg10;
        int var20 = var12 - arg2;
        int var21 = arg5 - var20;
        int var22 = arg3 - var19;
        int var23 = arg3 - var16;
        if (arg8 < 33) {
            method969(54, 55, -123, 69, (int[]) null, -51, -79, 72, 90, false, -111);
        }
        int var24 = arg5 - var18;
        if (arg0 == 1) {
            if (arg6 == 0) {
                for (int var25 = var16; var25 < var19; var25++) {
                    for (int var26 = var18; var26 < var20; var26++) {
                        if (var25 >= var26) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var27 = var23 - 1; var27 >= var22; var27--) {
                    for (int var28 = var18; var28 < var20; var28++) {
                        if (var28 <= var27) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var29 = var16; var29 < var19; var29++) {
                    for (int var30 = var18; var30 < var20; var30++) {
                        if (var29 <= var30) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var31 = var23 - 1; var31 >= var22; var31--) {
                    for (int var32 = var18; var32 < var20; var32++) {
                        if (var32 >= var31) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg0 == 2) {
            if (arg6 == 0) {
                for (int var33 = var23 - 1; var33 >= var22; var33--) {
                    for (int var34 = var18; var34 < var20; var34++) {
                        if (var34 <= (var33 >> 1)) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var35 = var16; var35 < var19; var35++) {
                    for (int var36 = var18; var36 < var20; var36++) {
                        if (var15 >= 0 && var15 < arg4.length) {
                            if (var36 >= var35 << 1) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        } else {
                            var15++;
                        }
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var37 = var16; var37 < var19; var37++) {
                    for (int var38 = var24 - 1; var38 >= var21; var38--) {
                        if ((var37 >> 1) >= var38) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var39 = var23 - 1; var39 >= var22; var39--) {
                    for (int var40 = var24 - 1; var40 >= var21; var40--) {
                        if (var39 << 1 <= var40) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg0 == 3) {
            if (arg6 == 0) {
                for (int var41 = var23 - 1; var41 >= var22; var41--) {
                    for (int var42 = var24 - 1; var42 >= var21; var42--) {
                        if (var42 <= var41 >> 1) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var43 = var23 - 1; var43 >= var22; var43--) {
                    for (int var44 = var18; var44 < var20; var44++) {
                        if ((var43 << 1) <= var44) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var45 = var16; var45 < var19; var45++) {
                    for (int var46 = var18; var46 < var20; var46++) {
                        if ((var45 >> 1) >= var46) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var47 = var16; var47 < var19; var47++) {
                    for (int var48 = var24 - 1; var48 >= var21; var48--) {
                        if (var48 >= (var47 << 1)) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg0 == 4) {
            if (arg6 == 0) {
                for (int var49 = var23 - 1; var49 >= var22; var49--) {
                    for (int var50 = var18; var50 < var20; var50++) {
                        if (var50 >= (var49 >> 1)) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 1) {
                for (int var51 = var16; var51 < var19; var51++) {
                    for (int var52 = var18; var52 < var20; var52++) {
                        if (var52 <= (var51 << 1)) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 2) {
                for (int var53 = var16; var53 < var19; var53++) {
                    for (int var54 = var24 - 1; var54 >= var21; var54--) {
                        if (var53 >> 1 <= var54) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            } else if (arg6 == 3) {
                for (int var55 = var23 - 1; var55 >= var22; var55--) {
                    for (int var56 = var24 - 1; var56 >= var21; var56--) {
                        if ((var55 << 1) >= var56) {
                            arg4[var15] = arg1;
                        } else if (arg9) {
                            arg4[var15] = arg7;
                        }
                        var15++;
                    }
                    var15 += var17;
                }
            }
        } else if (arg0 != 5) {
            if (arg0 == 6) {
                if (arg6 == 0) {
                    for (int var65 = var16; var65 < var19; var65++) {
                        for (int var66 = var18; var66 < var20; var66++) {
                            if (var66 <= arg5 / 2) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var67 = var16; var67 < var19; var67++) {
                        for (int var68 = var18; var68 < var20; var68++) {
                            if (var67 <= (arg3 / 2)) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var69 = var16; var69 < var19; var69++) {
                        for (int var70 = var18; var70 < var20; var70++) {
                            if (arg5 / 2 <= var70) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var71 = var16; var71 < var19; var71++) {
                        for (int var72 = var18; var72 < var20; var72++) {
                            if (var71 >= arg3 / 2) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg0 == 7) {
                if (arg6 == 0) {
                    for (int var73 = var16; var73 < var19; var73++) {
                        for (int var74 = var18; var74 < var20; var74++) {
                            if (var73 - (arg3 / 2) >= var74) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var75 = var23 - 1; var75 >= var22; var75--) {
                        for (int var76 = var18; var76 < var20; var76++) {
                            if (var76 <= (var75 - (arg3 / 2))) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var77 = var23 - 1; var77 >= var22; var77--) {
                        for (int var78 = var24 - 1; var78 >= var21; var78--) {
                            if (var78 <= var77 - arg3 / 2) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var79 = var16; var79 < var19; var79++) {
                        for (int var80 = var24 - 1; var80 >= var21; var80--) {
                            if (var80 <= var79 - (arg3 / 2)) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
            if (arg0 == 8) {
                if (arg6 == 0) {
                    for (int var81 = var16; var81 < var19; var81++) {
                        for (int var82 = var18; var82 < var20; var82++) {
                            if ((var81 - (arg3 / 2)) <= var82) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 1) {
                    for (int var83 = var23 - 1; var83 >= var22; var83--) {
                        for (int var84 = var18; var84 < var20; var84++) {
                            if (var84 >= var83 - (arg3 / 2)) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 2) {
                    for (int var85 = var23 - 1; var85 >= var22; var85--) {
                        for (int var86 = var24 - 1; var86 >= var21; var86--) {
                            if (var86 >= var85 - arg3 / 2) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
                if (arg6 == 3) {
                    for (int var87 = var16; var87 < var19; var87++) {
                        for (int var88 = var24 - 1; var88 >= var21; var88--) {
                            if (var88 >= (var87 - (arg3 / 2))) {
                                arg4[var15] = arg1;
                            } else if (arg9) {
                                arg4[var15] = arg7;
                            }
                            var15++;
                        }
                        var15 += var17;
                    }
                    return;
                }
            }
        } else if (arg6 == 0) {
            for (int var57 = var23 - 1; var57 >= var22; var57--) {
                for (int var58 = var24 - 1; var58 >= var21; var58--) {
                    if (var58 >= var57 >> 1) {
                        arg4[var15] = arg1;
                    } else if (arg9) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 1) {
            for (int var59 = var23 - 1; var59 >= var22; var59--) {
                for (int var60 = var18; var60 < var20; var60++) {
                    if (var60 <= (var59 << 1)) {
                        arg4[var15] = arg1;
                    } else if (arg9) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 2) {
            for (int var61 = var16; var61 < var19; var61++) {
                for (int var62 = var18; var62 < var20; var62++) {
                    if ((var61 >> 1) <= var62) {
                        arg4[var15] = arg1;
                    } else if (arg9) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var17;
            }
        } else if (arg6 == 3) {
            for (int var63 = var16; var63 < var19; var63++) {
                for (int var64 = var24 - 1; var64 >= var21; var64--) {
                    if (var64 <= var63 << 1) {
                        arg4[var15] = arg1;
                    } else if (arg9) {
                        arg4[var15] = arg7;
                    }
                    var15++;
                }
                var15 += var17;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method970(byte arg0) {
        field2434 = null;
        field2436 = null;
        field2435 = null;
        field2437 = null;
        field2429 = null;
        field2428 = null;
        if (arg0 != -77) {
            field2428 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)Z")
    public static final boolean method971(int arg0, byte arg1) {
        int var2 = 120 / ((arg1 + 17) / 63);
        field2431++;
        if (class223.field4066[arg0]) {
            return true;
        } else if (class210.field3819.method591(arg0, 24517)) {
            int var3 = class210.field3819.method594(arg0, (byte) -74);
            if (var3 == 0) {
                class223.field4066[arg0] = true;
                return true;
            }
            if (class116.field2222[arg0] == null) {
                class116.field2222[arg0] = new class50[var3];
            }
            for (int var4 = 0; var4 < var3; var4++) {
                if (class116.field2222[arg0][var4] == null) {
                    byte[] var5 = class210.field3819.method590(var4, arg0, 0);
                    if (var5 != null) {
                        class116.field2222[arg0][var4] = new class50();
                        class116.field2222[arg0][var4].field773 = (arg0 << 16) + var4;
                        if (var5[0] == -1) {
                            class116.field2222[arg0][var4].method286(new class128(var5), 4);
                        } else {
                            class116.field2222[arg0][var4].method292(new class128(var5), (byte) -34);
                        }
                    }
                }
            }
            class223.field4066[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lhj;Ltk;B)Lhj;")
    public static final class69 method972(class69 arg0, class50 arg1, byte arg2) {
        if (arg0.method481(0, class108.field2038) != -1) {
            label58: while (true) {
                int var3 = arg0.method481(0, class81.field1562);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method481(0, class79.field1517);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method481(0, class168.field3100);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method481(0, class3.field2);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method481(0, class188.field3413);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method481(0, class168.field3099);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class69 var9 = class209.field3816;
                                                        if (class191.field3458 != null) {
                                                            var9 = class116.method854(false, class191.field3458.field1665);
                                                            try {
                                                                if (class191.field3458.field1666 != null) {
                                                                    byte[] var10 = ((String) class191.field3458.field1666).getBytes("ISO-8859-1");
                                                                    var9 = class38.method209(112, 0, var10.length, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg0 = class9.method42(-78, new class69[] { arg0.method485(var8, 0, (byte) -20), var9, arg0.method478(-93, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class9.method42(123, new class69[] { arg0.method485(var7, 0, (byte) -20), class242.method1718(999999999, class224.method1590(arg1, (byte) -94, 4)), arg0.method478(-69, var7 + 2) });
                                            }
                                        }
                                        arg0 = class9.method42(-111, new class69[] { arg0.method485(var6, 0, (byte) -20), class242.method1718(999999999, class224.method1590(arg1, (byte) -19, 3)), arg0.method478(-68, var6 + 2) });
                                    }
                                }
                                arg0 = class9.method42(-90, new class69[] { arg0.method485(var5, 0, (byte) -20), class242.method1718(999999999, class224.method1590(arg1, (byte) -124, 2)), arg0.method478(-100, var5 + 2) });
                            }
                        }
                        arg0 = class9.method42(-92, new class69[] { arg0.method485(var4, 0, (byte) -20), class242.method1718(999999999, class224.method1590(arg1, (byte) -79, 1)), arg0.method478(-91, var4 + 2) });
                    }
                }
                arg0 = class9.method42(88, new class69[] { arg0.method485(var3, 0, (byte) -20), class242.method1718(999999999, class224.method1590(arg1, (byte) -58, 0)), arg0.method478(-125, var3 + 2) });
            }
        }
        field2430++;
        int var11 = 87 / ((arg2 - 14) / 46);
        return arg0;
    }
}
