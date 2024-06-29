import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class488 {

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field7164 = -1;

    @OriginalMember(owner = "client!cj", name = "s", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field7169;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field7171;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
    private int field7177;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "J")
    private long field7172;

    @OriginalMember(owner = "client!cj", name = "r", descriptor = "J")
    private long field7180;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "Z")
    public boolean field7167;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
    private int[] field7163;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    public int[] field7175;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "[[I")
    private int[][] field7179;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZLuk;Lro;Lvs;ILlp;Lin;Lya;Ldu;I)Lt;")
    public final class471 method2929(int arg0, int arg1, boolean arg2, class171 arg3, class2 arg4, class416 arg5, int arg6, class267 arg7, class60 arg8, class38 arg9, class238 arg10, int arg11) {
        field7165++;
        if (this.field7164 != -1) {
            return arg3.method1215(this.field7164, 1).method858(arg1, arg6, 33, arg11, arg7, arg0, arg5, arg9, arg10);
        }
        int var13 = arg11;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg11 | 0x20;
            int var22 = arg7.field3919[arg0];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class367 var25 = arg10.method1579(var23, 1);
            if (var25 != null) {
                var15 |= var25.method2265((byte) -121, var24);
                var14 |= var25.method2272(-6210, var24);
                var17 |= var25.method2273(var24, (byte) 127);
                var16 |= arg7.field3938;
            }
            if ((arg7.field3927 || class447.field6599) && arg1 != -1 && arg1 < arg7.field3919.length) {
                int var26 = arg7.field3919[arg1];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class367 var29 = var23 == var27 ? var25 : arg10.method1579(var27, 1);
                if (var29 != null) {
                    var15 |= var29.method2265((byte) -79, var28);
                    var14 |= var29.method2272(-6210, var28);
                    var17 |= var29.method2273(var28, (byte) 104);
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
        class156 var30 = class484.field7118;
        class471 var31;
        synchronized (class484.field7118) {
            var31 = (class471) class484.field7118.method1115(this.field7172, (byte) 58);
        }
        if (var31 == null || arg9.method335(var31.method459(), var13) != 0) {
            if (var31 != null) {
                var13 = arg9.method351(var13, var31.method459());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field7163[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg8.method545(var35 & 0x3FFFFFFF, -18653).method1186((byte) 105)) {
                        var33 = true;
                    }
                } else if (!arg4.method6(22883, var35 & 0x3FFFFFFF).method674(116, this.field7167)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class353[] var36 = new class353[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field7163[var38];
                if ((var39 & 0x40000000) != 0) {
                    class353 var40 = arg4.method6(22883, var39 & 0x3FFFFFFF).method690(0, this.field7167);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class353 var41 = arg8.method545(var39 & 0x3FFFFFFF, -18653).method1192(0);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class353 var43 = new class353(var36, var37);
            var31 = arg9.method314(var43, var42, class164.field2333, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field7175[var44] < class29.field363[var44].length) {
                    var31.method467(class473.field6981[var44], class29.field363[var44][this.field7175[var44]]);
                }
                if (class20.field229[var44].length > this.field7175[var44]) {
                    var31.method467(class223.field3270[var44], class20.field229[var44][this.field7175[var44]]);
                }
            }
            var31.method465(var13);
            class156 var45 = class484.field7118;
            synchronized (class484.field7118) {
                class484.field7118.method1107(1, this.field7172, var31);
            }
        }
        if (arg7 == null) {
            return var31;
        }
        var31.method458((byte) 4, var13, true);
        class471 var47 = arg7.method1716(arg6, arg11, arg1, arg0, var31, -107);
        if (arg2) {
            this.field7177 = 6;
        }
        return var47;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)V")
    public final void method2930(boolean arg0, int arg1) {
        field7169++;
        this.field7167 = arg0;
        this.method2933((byte) 105);
        if (arg1 != 15366) {
            method2935(-92);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILin;II)V")
    public final void method2931(int arg0, class60 arg1, int arg2, int arg3) {
        if (arg3 < 91) {
            this.method2932(null, null, null, -45, null, null, 77, 1, null, (byte) -1, null, 74, 27, null, null, 69, null, 93, false);
        }
        field7166++;
        int var5 = class473.field6973[arg2];
        if (this.field7163[var5] != 0 && arg1.method545(arg0, -18653) != null) {
            this.field7163[var5] = class244.method1606(arg0, Integer.MIN_VALUE);
            this.method2933((byte) 117);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lv;Lin;Llp;I[Lnv;Luk;IILlp;BLdu;IILya;Lro;ILvs;IZ)Lt;")
    public final class471 method2932(class407 arg0, class60 arg1, class267 arg2, int arg3, class287[] arg4, class171 arg5, int arg6, int arg7, class267 arg8, byte arg9, class238 arg10, int arg11, int arg12, class38 arg13, class2 arg14, int arg15, class416 arg16, int arg17, boolean arg18) {
        field7174++;
        if (this.field7164 != -1) {
            return arg5.method1215(this.field7164, 1).method849(arg15, -117, arg8, arg16, arg6, arg3, arg17, arg12, arg13, arg7, arg11, arg4, arg2, arg10, arg0);
        }
        int var20 = arg3;
        long var21 = this.field7172;
        int[] var23 = this.field7163;
        if (arg8 != null && (arg8.field3934 >= 0 || arg8.field3944 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field7163[var24];
            }
            if (arg8.field3934 >= 0) {
                if (arg8.field3934 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class244.method1606(arg8.field3934, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg8.field3944 >= 0) {
                if (arg8.field3944 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class244.method1606(1073741824, arg8.field3944);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        if (arg9 <= 103) {
            this.field7175 = null;
        }
        boolean var27 = false;
        boolean var28 = arg8 != null || arg2 != null;
        int var29 = arg4 == null ? 0 : arg4.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class262.field3857[var30] = null;
            if (arg4[var30] != null) {
                class267 var31 = arg10.method1585(3, arg4[var30].field4140);
                if (var31.field3919 != null) {
                    var28 = true;
                    class221.field3174[var30] = var31;
                    int var32 = arg4[var30].field4138;
                    int var33 = arg4[var30].field4141;
                    int var34 = var31.field3919[var32];
                    class262.field3857[var30] = arg10.method1579(var34 >>> 16, 1);
                    int var35 = var34 & 0xFFFF;
                    class530.field7767[var30] = var35;
                    if (class262.field3857[var30] != null) {
                        var26 |= class262.field3857[var30].method2265((byte) -105, var35);
                        var25 |= class262.field3857[var30].method2272(-6210, var35);
                        var27 |= class262.field3857[var30].method2273(var35, (byte) 125);
                    }
                    if ((var31.field3927 || class447.field6599) && var33 != -1 && var33 < var31.field3919.length) {
                        class344.field4772[var30] = var31.field3940[var32];
                        class50.field550[var30] = arg4[var30].field4143;
                        int var36 = var31.field3919[var33];
                        class470.field6948[var30] = arg10.method1579(var36 >>> 16, 1);
                        int var37 = var36 & 0xFFFF;
                        class510.field7524[var30] = var37;
                        if (class470.field6948[var30] != null) {
                            var26 |= class470.field6948[var30].method2265((byte) -107, var37);
                            var25 |= class470.field6948[var30].method2272(-6210, var37);
                            var27 |= class470.field6948[var30].method2273(var37, (byte) 111);
                        }
                    } else {
                        class344.field4772[var30] = 0;
                        class50.field550[var30] = 0;
                        class470.field6948[var30] = null;
                        class510.field7524[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class367 var41 = null;
        class367 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class367 var46 = null;
        class367 var47 = null;
        if (var28) {
            if (arg8 != null) {
                int var48 = arg8.field3919[arg7];
                int var49 = var48 >>> 16;
                var41 = arg10.method1579(var49, 1);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2265((byte) -106, var38);
                    var25 |= var41.method2272(-6210, var38);
                    var27 |= var41.method2273(var38, (byte) 101);
                }
                if ((arg8.field3927 || class447.field6599) && arg6 != -1 && arg8.field3919.length > arg6) {
                    var40 = arg8.field3940[arg7];
                    int var50 = arg8.field3919[arg6];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg10.method1579(var51, 1);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method2265((byte) -121, var39);
                        var25 |= var42.method2272(-6210, var39);
                        var27 |= var42.method2273(var39, (byte) 95);
                    }
                }
            }
            var20 = arg3 | 0x20;
            if (arg2 != null) {
                int var52 = arg2.field3919[arg12];
                int var53 = var52 >>> 16;
                var46 = arg10.method1579(var53, 1);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method2265((byte) -113, var43);
                    var25 |= var46.method2272(-6210, var43);
                    var27 |= var46.method2273(var43, (byte) 122);
                }
                if ((arg2.field3927 || class447.field6599) && arg11 != -1 && arg2.field3919.length > arg11) {
                    int var54 = arg2.field3919[arg11];
                    var45 = arg2.field3940[arg12];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg10.method1579(var55, 1);
                    if (var47 != null) {
                        var26 |= var47.method2265((byte) -126, var44);
                        var25 |= var47.method2272(-6210, var44);
                        var27 |= var47.method2273(var44, (byte) 122);
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
        class156 var56 = class100.field1370;
        class471 var57;
        synchronized (class100.field1370) {
            var57 = (class471) class100.field1370.method1115(var21, (byte) 58);
        }
        class531 var58 = null;
        if (this.field7177 != -1) {
            var58 = arg0.method2499(false, this.field7177);
        }
        if (var57 == null || arg13.method335(var57.method459(), var20) != 0 || var58 != null && var58.field7796 != null && this.field7179 == null) {
            if (var57 != null) {
                var20 = arg13.method351(var20, var57.method459());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg1.method545(var62 & 0x3FFFFFFF, -18653).method1188((byte) 55)) {
                        var60 = true;
                    }
                } else if (!arg14.method6(22883, var62 & 0x3FFFFFFF).method682(-1, this.field7167)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field7180 != -1L) {
                    class156 var63 = class100.field1370;
                    synchronized (class100.field1370) {
                        var57 = (class471) class100.field1370.method1115(this.field7180, (byte) 58);
                    }
                }
                if (var57 == null || arg13.method335(var57.method459(), var20) != 0 || var58 != null && var58.field7796 != null && this.field7179 == null) {
                    return null;
                }
            } else {
                class353[] var64 = new class353[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class353 var67 = arg14.method6(22883, var66 & 0x3FFFFFFF).method681(this.field7167, 0);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class353 var68 = arg1.method545(var66 & 0x3FFFFFFF, -18653).method1189((byte) -63);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field7796 != null) {
                    for (int var69 = 0; var69 < var58.field7796.length; var69++) {
                        if (var58.field7796[var69] != null && var64[var69] != null) {
                            int var70 = var58.field7796[var69][0];
                            int var71 = var58.field7796[var69][1];
                            int var72 = var58.field7796[var69][2];
                            int var73 = var58.field7796[var69][3] << 3;
                            int var74 = var58.field7796[var69][4] << 3;
                            int var75 = var58.field7796[var69][5] << 3;
                            if (this.field7179 == null) {
                                this.field7179 = new int[var58.field7796.length][];
                            }
                            if (this.field7179[var69] == null) {
                                int[] var76 = this.field7179[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[14] = -var72;
                                    var76[13] = -var71;
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                } else {
                                    int var77 = class340.field4715[var73];
                                    int var78 = class340.field4724[var73];
                                    int var79 = class340.field4715[var74];
                                    int var80 = class340.field4724[var74];
                                    int var81 = class340.field4715[var75];
                                    int var82 = class340.field4724[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[0] = var79 * var81 + (var80 * var84) + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                    var76[13] = var76[4] * -var71 + (var76[7] * -var72) + var76[1] * -var70 + 16384 >> 15;
                                    var76[14] = var76[2] * -var70 + var76[5] * -var71 - (-(var76[8] * -var72) + -16384) >> 15;
                                    var76[12] = var76[6] * -var72 + (var76[3] * -var71 + var76[0] * -var70 + 16384) >> 15;
                                }
                                var76[9] = var70;
                                var76[10] = var71;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method2136(var73, var74, var75, (byte) 107);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method2124(var71, var70, var72, -52);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class353 var86 = new class353(var64, var64.length);
                var57 = arg13.method314(var86, var85, class164.field2333, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (this.field7175[var87] < class29.field363[var87].length) {
                        var57.method467(class473.field6981[var87], class29.field363[var87][this.field7175[var87]]);
                    }
                    if (this.field7175[var87] < class20.field229[var87].length) {
                        var57.method467(class223.field3270[var87], class20.field229[var87][this.field7175[var87]]);
                    }
                }
                if (arg18) {
                    var57.method465(var20);
                    class156 var88 = class100.field1370;
                    synchronized (class100.field1370) {
                        class100.field1370.method1107(1, var21, var57);
                    }
                    this.field7180 = var21;
                }
            }
        }
        class471 var89 = var57.method458((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class262.field3857[var90] != null) {
                var89.method2855(class510.field7524[var90], class470.field6948[var90], this.field7179 == null ? null : this.field7179[var90], false, 0, class530.field7767[var90], -91, class344.field4772[var90], class262.field3857[var90], class50.field550[var90] - 1, var91);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2857(var38, var40, var47, false, var45, arg15 - 1, var43, var46, var41, var44, arg8.field3946, var42, arg17 - 1, var39, -75);
        } else if (var41 != null) {
            var89.method2849(0, var40, false, var38, var39, var41, var42, arg17 - 1, 0);
        } else if (var46 != null) {
            var89.method2849(0, var45, false, var43, var44, var46, var47, arg15 - 1, 0);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class262.field3857[var92] = null;
            class470.field6948[var92] = null;
            class221.field3174[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    private final void method2933(byte arg0) {
        field7173++;
        this.field7172 = -1L;
        long[] var2 = class503.field7463;
        this.field7172 = var2[(int) ((this.field7172 ^ (long) (this.field7177 >> 8)) & 0xFFL)] ^ this.field7172 >>> 8;
        this.field7172 = this.field7172 >>> 8 ^ var2[(int) ((this.field7172 ^ (long) this.field7177) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field7172 = var2[(int) (((long) (this.field7163[var3] >> 24) ^ this.field7172) & 0xFFL)] ^ this.field7172 >>> 8;
            this.field7172 = this.field7172 >>> 8 ^ var2[(int) ((this.field7172 ^ (long) (this.field7163[var3] >> 16)) & 0xFFL)];
            this.field7172 = this.field7172 >>> 8 ^ var2[(int) ((this.field7172 ^ (long) (this.field7163[var3] >> 8)) & 0xFFL)];
            this.field7172 = this.field7172 >>> 8 ^ var2[(int) ((this.field7172 ^ (long) this.field7163[var3]) & 0xFFL)];
        }
        if (arg0 < 104) {
            method2938(null, -67, -31, true);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field7172 = var2[(int) ((this.field7172 ^ (long) this.field7175[var4]) & 0xFFL)] ^ this.field7172 >>> 8;
        }
        this.field7172 = this.field7172 >>> 8 ^ var2[(int) (((long) (this.field7167 ? 1 : 0) ^ this.field7172) & 0xFFL)];
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZBII[I[I)V")
    public final void method2934(boolean arg0, byte arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
        if (this.field7177 != arg3) {
            this.field7177 = arg3;
            this.field7179 = null;
        }
        this.field7175 = arg5;
        this.field7167 = arg0;
        field7182++;
        if (arg1 > -94) {
            this.method2931(126, null, 96, 55);
        }
        this.field7164 = arg2;
        this.field7163 = arg4;
        this.method2933((byte) 127);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static final void method2935(int arg0) {
        class144.field2023 = 0;
        int var1 = -26 / ((arg0 + 62) / 59);
        class98.field1317 = -1;
        class74.field1012 = -1;
        field7171++;
        class265.field3904 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llp;ILdu;IILin;IIILya;II)Lt;")
    public final class471 method2936(class267 arg0, int arg1, class238 arg2, int arg3, int arg4, class60 arg5, int arg6, int arg7, int arg8, class38 arg9, int arg10, int arg11) {
        field7178++;
        int var13 = arg6;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field3919[arg11];
            Object var22 = null;
            var13 = arg6 | 0x20;
            int var23 = var21 >>> 16;
            class367 var24 = arg2.method1579(var23, 1);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2265((byte) -54, var25);
                var14 |= var24.method2272(-6210, var25);
                var17 |= var24.method2273(var25, (byte) 113);
                var16 |= arg0.field3938;
            }
            if ((arg0.field3927 || class447.field6599) && arg8 != -1 && arg8 < arg0.field3919.length) {
                int var26 = arg0.field3919[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class367 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg2.method1579(var28 >>> 16, 1);
                }
                if (var29 != null) {
                    var15 |= var29.method2265((byte) -51, var28);
                    var14 |= var29.method2272(-6210, var28);
                    var17 |= var29.method2273(var28, (byte) 108);
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
        long var30 = (long) arg3 | (long) (arg7 << 16) | (long) arg4 << 32;
        class156 var32 = class484.field7118;
        class471 var33;
        synchronized (class484.field7118) {
            var33 = (class471) class484.field7118.method1115(var30, (byte) 58);
        }
        if (var33 == null || arg9.method335(var33.method459(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method351(var13, var33.method459());
            }
            class353[] var35 = new class353[3];
            int var36 = 0;
            if (!arg5.method545(arg3, -18653).method1186((byte) 101) || !arg5.method545(arg7, -18653).method1186((byte) 87) || !arg5.method545(arg4, -18653).method1186((byte) 91)) {
                return null;
            }
            class353 var37 = arg5.method545(arg3, -18653).method1192(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class353 var38 = arg5.method545(arg7, -18653).method1192(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class353 var39 = arg5.method545(arg4, -18653).method1192(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class353 var41 = new class353(var35, var36);
            var33 = arg9.method314(var41, var40, class164.field2333, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field7175[var42] < class29.field363[var42].length) {
                    var33.method467(class473.field6981[var42], class29.field363[var42][this.field7175[var42]]);
                }
                if (this.field7175[var42] < class20.field229[var42].length) {
                    var33.method467(class223.field3270[var42], class20.field229[var42][this.field7175[var42]]);
                }
            }
            var33.method465(var13);
            class156 var43 = class484.field7118;
            synchronized (class484.field7118) {
                class484.field7118.method1107(1, var30, var33);
            }
        }
        if (arg0 == null) {
            return var33;
        }
        if (arg1 >= -50) {
            this.field7163 = null;
        }
        class471 var44 = var33.method458((byte) 4, var13, true);
        return arg0.method1716(arg10, arg6, arg8, arg11, var44, -127);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIB)V")
    public final void method2937(int arg0, int arg1, byte arg2) {
        this.field7175[arg0] = arg1;
        field7170++;
        this.method2933((byte) 116);
        int var4 = -66 % ((-arg2 - 30) / 49);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
    public static final boolean method2938(String arg0, int arg1, int arg2, boolean arg3) {
        field7176++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        if (arg1 <= 115) {
            field7181 = 26;
        }
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BIII[BII)V")
    public static final void method2939(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field7168++;
        if (arg1 > 0 && !class305.method1900(200, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg0 == 117) {
            if (arg3 > 0 && !class305.method1900(200, arg3)) {
                throw new IllegalArgumentException("");
            }
            int var7 = class261.method1676((byte) -11, arg5);
            int var8 = 0;
            int var9 = arg3 <= arg1 ? arg3 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg3 >> 1;
            byte[] var12 = arg4;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg6, var8, arg2, arg1, arg3, 0, arg5, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg1 = var10;
                arg3 = var11;
                var10 >>= 0x1;
                var8++;
                var9 >>= 0x1;
                var11 >>= 0x1;
            }
        }
    }

    static {
        new class331("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
        field7181 = 0;
    }
}
