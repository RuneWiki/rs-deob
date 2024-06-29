import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class58 {

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field1029 = -1;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "Lqt;")
    public static class459 field1045 = new class459(81, 8);

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "[I")
    private static int[] field1046 = new int[14];

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "Lqv;")
    public static class316 field1049 = new class316(103, -1);

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field1051 = 0;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field1050 = 1405;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    private int field1033;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "J")
    private long field1028;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "J")
    private long field1044;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "Lpa;")
    public static class255 field1052;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Z")
    public boolean field1037;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
    private int[] field1027;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "[I")
    public int[] field1043;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "[[I")
    private int[][] field1039;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public static final void method487(int arg0, String arg1) {
        field1041++;
        if (arg1.equals("")) {
            return;
        }
        if (arg0 != -1) {
            method487(-96, null);
        }
        class500.field7227++;
        class228.method1528(true, class128.field2001);
        class276.field4124.method3048(-2034159384, class132.method966(arg1, arg0 + 10241));
        class276.field4124.method3057((byte) -28, arg1);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V", line = 23)
    public static void method488(int arg0) {
        field1049 = null;
        field1045 = null;
        field1052 = null;
        if (arg0 == -3166) {
            field1046 = null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILkg;ILqa;Lrn;IZLjr;ILgj;ILjc;IILts;Lkg;[Lar;ILpa;)Lka;", line = 36)
    public final class336 method489(int arg0, class183 arg1, int arg2, class167 arg3, class180 arg4, int arg5, boolean arg6, class74 arg7, int arg8, class457 arg9, int arg10, class310 arg11, int arg12, int arg13, class380 arg14, class183 arg15, class490[] arg16, int arg17, class255 arg18) {
        field1040++;
        if (this.field1029 != -1) {
            return arg14.method2310(-1, this.field1029).method1973(arg17, (byte) 74, arg9, arg3, arg16, arg1, arg5, arg8, arg15, arg12, arg10, arg11, arg13, arg4, arg2);
        }
        int var20 = arg12;
        long var21 = this.field1044;
        int[] var23 = this.field1027;
        if (arg1 != null && (arg1.field2711 >= 0 || arg1.field2699 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1027[var24];
            }
            if (arg1.field2711 >= 0) {
                if (arg1.field2711 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class442.method2600(1073741824, arg1.field2711);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field2699 >= 0) {
                if (arg1.field2699 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class442.method2600(arg1.field2699, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg1 != null || arg15 != null;
        int var29 = arg16 == null ? 0 : arg16.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class190.field2782[var30] = null;
            if (arg16[var30] != null) {
                class183 var31 = arg9.method2717(-126, arg16[var30].field7066);
                if (var31.field2692 != null) {
                    var28 = true;
                    class500.field7228[var30] = var31;
                    int var32 = arg16[var30].field7061;
                    int var33 = arg16[var30].field7062;
                    int var34 = var31.field2692[var32];
                    class190.field2782[var30] = arg9.method2714(var34 >>> 16, (byte) 84);
                    int var35 = var34 & 0xFFFF;
                    class133.field2078[var30] = var35;
                    if (class190.field2782[var30] != null) {
                        var26 |= class190.field2782[var30].method3188(var35, -1);
                        var25 |= class190.field2782[var30].method3184((byte) 116, var35);
                        var27 |= class190.field2782[var30].method3182(var35, arg0 ^ 0x8052);
                    }
                    if ((var31.field2703 || class89.field1441) && var33 != -1 && var31.field2692.length > var33) {
                        field1046[var30] = var31.field2713[var32];
                        class59.field1055[var30] = arg16[var30].field7067;
                        int var36 = var31.field2692[var33];
                        class140.field2164[var30] = arg9.method2714(var36 >>> 16, (byte) 69);
                        int var37 = var36 & 0xFFFF;
                        client.field3118[var30] = var37;
                        if (class140.field2164[var30] != null) {
                            var26 |= class140.field2164[var30].method3188(var37, -1);
                            var25 |= class140.field2164[var30].method3184((byte) 116, var37);
                            var27 |= class140.field2164[var30].method3182(var37, -108);
                        }
                    } else {
                        field1046[var30] = 0;
                        class59.field1055[var30] = 0;
                        class140.field2164[var30] = null;
                        client.field3118[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class543 var41 = null;
        class543 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class543 var46 = null;
        class543 var47 = null;
        if (var28) {
            if (arg1 != null) {
                int var48 = arg1.field2692[arg10];
                int var49 = var48 >>> 16;
                var41 = arg9.method2714(var49, (byte) 87);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3188(var38, arg0 - 32769);
                    var25 |= var41.method3184((byte) 116, var38);
                    var27 |= var41.method3182(var38, 125);
                }
                if ((arg1.field2703 || class89.field1441) && arg17 != -1 && arg1.field2692.length > arg17) {
                    var40 = arg1.field2713[arg10];
                    int var50 = arg1.field2692[arg17];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg9.method2714(var51, (byte) 107);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method3188(var39, arg0 ^ 0xFFFF7FFF);
                        var25 |= var42.method3184((byte) 116, var39);
                        var27 |= var42.method3182(var39, 110);
                    }
                }
            }
            var20 = arg12 | 0x20;
            if (arg15 != null) {
                int var52 = arg15.field2692[arg8];
                int var53 = var52 >>> 16;
                var46 = arg9.method2714(var53, (byte) 103);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3188(var43, -1);
                    var25 |= var46.method3184((byte) 116, var43);
                    var27 |= var46.method3182(var43, 68);
                }
                if ((arg15.field2703 || class89.field1441) && arg5 != -1 && arg15.field2692.length > arg5) {
                    int var54 = arg15.field2692[arg5];
                    var45 = arg15.field2713[arg8];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg9.method2714(var55, (byte) 121);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method3188(var44, -1);
                        var25 |= var47.method3184((byte) 116, var44);
                        var27 |= var47.method3182(var44, -111);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class511 var56 = class190.field2779;
        class336 var57;
        synchronized (class190.field2779) {
            var57 = (class336) class190.field2779.method2982(0, var21);
        }
        class236 var58 = null;
        if (this.field1033 != -1) {
            var58 = arg4.method1253(this.field1033, -1065652600);
        }
        if (var57 == null || arg3.method252(var57.method1166(), var20) != 0 || var58 != null && var58.field3529 != null && this.field1039 == null) {
            if (var57 != null) {
                var20 = arg3.method217(var20, var57.method1166());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg7.method575(3, var62 & 0x3FFFFFFF).method2580(0)) {
                        var60 = true;
                    }
                } else if (!arg18.method1646(21708, var62 & 0x3FFFFFFF).method837(this.field1037, (byte) 120)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field1028 != -1L) {
                    class511 var88 = class190.field2779;
                    synchronized (class190.field2779) {
                        var57 = (class336) class190.field2779.method2982(0, this.field1028);
                    }
                }
                if (var57 == null || arg3.method252(var57.method1166(), var20) != 0 || var58 != null && var58.field3529 != null && this.field1039 == null) {
                    return null;
                }
            } else {
                class330[] var63 = new class330[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class330 var67 = arg18.method1646(21708, var65 & 0x3FFFFFFF).method840(0, this.field1037);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var65) != 0) {
                        class330 var66 = arg7.method575(3, var65 & 0x3FFFFFFF).method2582(0);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    }
                }
                if (var58 != null && var58.field3529 != null) {
                    for (int var68 = 0; var68 < var58.field3529.length; var68++) {
                        if (var58.field3529[var68] != null && var63[var68] != null) {
                            int var69 = var58.field3529[var68][0];
                            int var70 = var58.field3529[var68][1];
                            int var71 = var58.field3529[var68][2];
                            int var72 = var58.field3529[var68][3] << 3;
                            int var73 = var58.field3529[var68][4] << 3;
                            int var74 = var58.field3529[var68][5] << 3;
                            if (this.field1039 == null) {
                                this.field1039 = new int[var58.field3529.length][];
                            }
                            if (this.field1039[var68] == null) {
                                int[] var75 = this.field1039[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[13] = -var70;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[14] = -var71;
                                    var75[12] = -var69;
                                } else {
                                    int var76 = class358.field5203[var72];
                                    int var77 = class358.field5204[var72];
                                    int var78 = class358.field5203[var73];
                                    int var79 = class358.field5204[var73];
                                    int var80 = class358.field5203[var74];
                                    int var81 = class358.field5204[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[0] = var79 * var83 + var78 * var80 + 16384 >> 15;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                    var75[7] = -var79 * -var81 + (var78 * var82) + 16384 >> 15;
                                    var75[1] = var79 * var82 + -var81 * var78 + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[14] = var75[2] * -var69 + var75[5] * -var70 - (-(var75[8] * -var71) - 16384) >> 15;
                                    var75[13] = var75[4] * -var70 + (var75[1] * -var69 - (-(var75[7] * -var71) - 16384)) >> 15;
                                    var75[12] = var75[3] * -var70 + (var75[0] * -var69 + (var75[6] * -var71)) + 16384 >> 15;
                                }
                                var75[10] = var70;
                                var75[11] = var71;
                                var75[9] = var69;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method2085(var74, (byte) -50, var72, var73);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method2091(var70, var71, -11480, var69);
                            }
                        }
                    }
                }
                class330 var84 = new class330(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg3.method225(var84, var85, class184.field2726, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (this.field1043[var86] < class117.field1805[var86].length) {
                        var57.method1163(class289.field4275[var86], class117.field1805[var86][this.field1043[var86]]);
                    }
                    if (class87.field1414[var86].length > this.field1043[var86]) {
                        var57.method1163(class23.field330[var86], class87.field1414[var86][this.field1043[var86]]);
                    }
                }
                if (arg6) {
                    var57.method1133(var20);
                    class511 var87 = class190.field2779;
                    synchronized (class190.field2779) {
                        class190.field2779.method2981(var57, 116, var21);
                    }
                    this.field1028 = var21;
                }
            }
        }
        class336 var89 = var57.method1154((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        if (arg0 != 32768) {
            return null;
        }
        while (var90 < var29) {
            if (class190.field2782[var90] != null) {
                var89.method2135(class190.field2782[var90], var91, class59.field1055[var90] - 1, arg0 + -32768, false, class133.field2078[var90], this.field1039 == null ? null : this.field1039[var90], field1046[var90], client.field3118[var90], 0, class140.field2164[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method2136(var47, arg1.field2707, var46, var42, arg13 - 1, var38, var43, var44, var40, var39, arg0 ^ 0x8DEC, var45, var41, arg2 - 1, false);
        } else if (var41 != null) {
            var89.method2131(var39, (byte) -107, 0, var40, arg13 - 1, var41, false, var42, var38);
        } else if (var46 != null) {
            var89.method2131(var44, (byte) -120, 0, var45, arg2 - 1, var46, false, var47, var43);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class190.field2782[var92] = null;
            class140.field2164[var92] = null;
            class500.field7228[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lpa;IILts;Ljc;Ljr;Lqa;IIILkg;Lgj;)Lka;", line = 542)
    public final class336 method490(class255 arg0, int arg1, int arg2, class380 arg3, class310 arg4, class74 arg5, class167 arg6, int arg7, int arg8, int arg9, class183 arg10, class457 arg11) {
        field1032++;
        if (this.field1029 != -1) {
            return arg3.method2310(-1, this.field1029).method1977(arg7, (byte) -96, arg8, arg6, arg2, arg9, arg4, arg11, arg10);
        }
        int var13 = arg2;
        if (arg10 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg10.field2692[arg9];
            var13 = arg2 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class543 var24 = arg11.method2714(var23, (byte) 95);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3188(var25, -1);
                var14 |= var24.method3184((byte) 116, var25);
                var17 |= var24.method3182(var25, -117);
                var16 |= arg10.field2690;
            }
            if ((arg10.field2703 || class89.field1441) && arg7 != -1 && arg7 < arg10.field2692.length) {
                int var26 = arg10.field2692[arg7];
                int var27 = var26 >>> 16;
                class543 var28 = var23 == var27 ? var24 : arg11.method2714(var27, (byte) 78);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3188(var29, -1);
                    var14 |= var28.method3184((byte) 116, var29);
                    var17 |= var28.method3182(var29, arg1 ^ 0xFFFFE038);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class511 var30 = class502.field7245;
        class336 var31;
        synchronized (class502.field7245) {
            var31 = (class336) class502.field7245.method2982(0, this.field1044);
            if (arg1 != -8119) {
                this.method497((byte) 64);
            }
        }
        if (var31 == null || arg6.method252(var31.method1166(), var13) != 0) {
            if (var31 != null) {
                var13 = arg6.method217(var13, var31.method1166());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1027[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg5.method575(3, var35 & 0x3FFFFFFF).method2581(arg1 ^ 0x1FB6)) {
                        var33 = true;
                    }
                } else if (!arg0.method1646(21708, var35 & 0x3FFFFFFF).method838(this.field1037, arg1 + 8017)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class330[] var36 = new class330[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1027[var38];
                if ((var39 & 0x40000000) != 0) {
                    class330 var41 = arg0.method1646(21708, var39 & 0x3FFFFFFF).method826(this.field1037, -29202);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class330 var40 = arg5.method575(arg1 + 8122, var39 & 0x3FFFFFFF).method2584((byte) -37);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class330 var43 = new class330(var36, var37);
            var31 = arg6.method225(var43, var42, class184.field2726, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class117.field1805[var44].length > this.field1043[var44]) {
                    var31.method1163(class289.field4275[var44], class117.field1805[var44][this.field1043[var44]]);
                }
                if (this.field1043[var44] < class87.field1414[var44].length) {
                    var31.method1163(class23.field330[var44], class87.field1414[var44][this.field1043[var44]]);
                }
            }
            var31.method1133(var13);
            class511 var45 = class502.field7245;
            synchronized (class502.field7245) {
                class502.field7245.method2981(var31, 103, this.field1044);
            }
        }
        if (arg10 == null) {
            return var31;
        } else {
            var31.method1154((byte) 4, var13, true);
            return arg10.method1268(var31, arg2, arg9, 127, arg8, arg7);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IILjava/net/Socket;)Lkd;", line = 740)
    public static final class190 method491(int arg0, int arg1, Socket arg2) throws IOException {
        field1038++;
        return arg1 == 1024 ? new class455(arg2, arg0) : null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ljr;IIB)V", line = 751)
    public final void method492(class74 arg0, int arg1, int arg2, byte arg3) {
        field1047++;
        if (arg3 != -110) {
            method488(118);
        }
        int var5 = class289.field4278[arg1];
        if (this.field1027[var5] != 0 && arg0.method575(3, arg2) != null) {
            this.field1027[var5] = class442.method2600(arg2, Integer.MIN_VALUE);
            this.method497((byte) -14);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILqa;IBLgj;ILkg;ILjr;III)Lka;", line = 773)
    public final class336 method493(int arg0, class167 arg1, int arg2, byte arg3, class457 arg4, int arg5, class183 arg6, int arg7, class74 arg8, int arg9, int arg10, int arg11) {
        field1034++;
        int var13 = arg5;
        if (arg3 > -107) {
            this.method496((byte) -115, false);
        }
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg6.field2692[arg7];
            var13 = arg5 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class543 var25 = arg4.method2714(var23, (byte) 91);
            if (var25 != null) {
                var15 |= var25.method3188(var24, -1);
                var14 |= var25.method3184((byte) 116, var24);
                var17 |= var25.method3182(var24, 69);
                var16 |= arg6.field2690;
            }
            if ((arg6.field2703 || class89.field1441) && arg2 != -1 && arg6.field2692.length > arg2) {
                int var26 = arg6.field2692[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class543 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method2714(var28 >>> 16, (byte) 109);
                }
                if (var29 != null) {
                    var15 |= var29.method3188(var28, -1);
                    var14 |= var29.method3184((byte) 116, var28);
                    var17 |= var29.method3182(var28, 112);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg11 | (long) (arg0 << 16) | (long) arg10 << 32;
        class511 var32 = class502.field7245;
        class336 var33;
        synchronized (class502.field7245) {
            var33 = (class336) class502.field7245.method2982(0, var30);
        }
        if (var33 == null || arg1.method252(var33.method1166(), var13) != 0) {
            if (var33 != null) {
                var13 = arg1.method217(var13, var33.method1166());
            }
            class330[] var35 = new class330[3];
            int var36 = 0;
            if (!arg8.method575(3, arg11).method2581(-1) || !arg8.method575(3, arg0).method2581(-1) || !arg8.method575(3, arg10).method2581(-1)) {
                return null;
            }
            class330 var37 = arg8.method575(3, arg11).method2584((byte) -71);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class330 var38 = arg8.method575(3, arg0).method2584((byte) -113);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class330 var39 = arg8.method575(3, arg10).method2584((byte) -99);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class330 var40 = new class330(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg1.method225(var40, var41, class184.field2726, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field1043[var42] < class117.field1805[var42].length) {
                    var33.method1163(class289.field4275[var42], class117.field1805[var42][this.field1043[var42]]);
                }
                if (class87.field1414[var42].length > this.field1043[var42]) {
                    var33.method1163(class23.field330[var42], class87.field1414[var42][this.field1043[var42]]);
                }
            }
            var33.method1133(var13);
            class511 var43 = class502.field7245;
            synchronized (class502.field7245) {
                class502.field7245.method2981(var33, 124, var30);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class336 var44 = var33.method1154((byte) 4, var13, true);
            return arg6.method1268(var44, arg5, arg7, 113, arg9, arg2);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZI)V", line = 929)
    public final void method494(int arg0, boolean arg1, int arg2) {
        this.field1043[arg2] = arg0;
        if (arg1) {
            this.method490(null, -77, -8, null, null, null, null, 55, 6, 121, null, null);
        }
        field1042++;
        this.method497((byte) -14);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V", line = 941)
    public static final void method495(byte arg0) {
        field1036++;
        if (arg0 > -38) {
            method487(63, null);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class262.field3960[var1] = null;
        }
        class515.field7471 = 0;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BZ)V", line = 967)
    public final void method496(byte arg0, boolean arg1) {
        if (arg0 <= 86) {
            method487(-27, null);
        }
        this.field1037 = arg1;
        field1030++;
        this.method497((byte) -14);
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V", line = 980)
    private final void method497(byte arg0) {
        field1031++;
        this.field1044 = -1L;
        if (arg0 != -14) {
            field1045 = null;
        }
        long[] var2 = class539.field7928;
        this.field1044 = this.field1044 >>> 8 ^ var2[(int) ((this.field1044 ^ (long) (this.field1033 >> 8)) & 0xFFL)];
        this.field1044 = var2[(int) ((this.field1044 ^ (long) this.field1033) & 0xFFL)] ^ this.field1044 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1044 = var2[(int) ((this.field1044 ^ (long) (this.field1027[var3] >> 24)) & 0xFFL)] ^ this.field1044 >>> 8;
            this.field1044 = this.field1044 >>> 8 ^ var2[(int) (((long) (this.field1027[var3] >> 16) ^ this.field1044) & 0xFFL)];
            this.field1044 = this.field1044 >>> 8 ^ var2[(int) (((long) (this.field1027[var3] >> 8) ^ this.field1044) & 0xFFL)];
            this.field1044 = var2[(int) (((long) this.field1027[var3] ^ this.field1044) & 0xFFL)] ^ this.field1044 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1044 = var2[(int) (((long) this.field1043[var4] ^ this.field1044) & 0xFFL)] ^ this.field1044 >>> 8;
        }
        this.field1044 = this.field1044 >>> 8 ^ var2[(int) (((long) (this.field1037 ? 1 : 0) ^ this.field1044) & 0xFFL)];
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II[IB[IZ)V", line = 1022)
    public final void method498(int arg0, int arg1, int[] arg2, byte arg3, int[] arg4, boolean arg5) {
        field1035++;
        if (this.field1033 != arg1) {
            this.field1039 = null;
            this.field1033 = arg1;
        }
        this.field1037 = arg5;
        this.field1027 = arg2;
        if (arg3 > 66) {
            this.field1043 = arg4;
            this.field1029 = arg0;
            this.method497((byte) -14);
        }
    }
}
