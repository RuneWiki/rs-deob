import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class285 {

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field4191 = -1;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lss;")
    public static class307 field4202 = new class307("", 16);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    private int field4187;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "J")
    private long field4194;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "J")
    private long field4196;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Z")
    public boolean field4184;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
    private int[] field4188;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "[I")
    public int[] field4193;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Ldt;")
    private class643[] field4195;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static final void method1809(byte arg0) {
        class212.field3100 = null;
        field4199++;
        if (class593.field8489 && class388.method2333((byte) 47) != 1) {
            class665.method3730(0, 0, class716.method3988(false), (byte) 124, class141.field2306 == 3 || class141.field2306 == 7, class195.method1384((byte) -105));
        }
        int var1 = 0;
        int var2 = 0;
        if (class593.field8489) {
            var1 = class45.method342(false);
            var2 = class87.method771(-2);
        }
        class41.method301(var1, var1, -1, class709.field9923 + var1, var2 - -class448.field6174, 8070, var2, var2, class379.field5314);
        int var3 = 60 / ((58 - arg0) / 63);
        if (class212.field3100 != null) {
            class689.method3883(class709.field9923 + var1, class188.field2840, class448.field6174 + var2, true, class262.field3708, class212.field3100, class6.field86.field7175, -1412584499, var2, var1, (byte) 69);
            class212.field3100 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V")
    public final void method1810(boolean arg0, int arg1) {
        if (arg1 <= -60) {
            field4198++;
            this.field4184 = arg0;
            this.method1811(1056487344);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    private final void method1811(int arg0) {
        field4197++;
        this.field4194 = -1L;
        long[] var2 = class709.field9915;
        this.field4194 = var2[(int) ((this.field4194 ^ (long) (this.field4187 >> 8)) & 0xFFL)] ^ this.field4194 >>> 8;
        this.field4194 = var2[(int) (((long) this.field4187 ^ this.field4194) & 0xFFL)] ^ this.field4194 >>> 8;
        if (arg0 != 1056487344) {
            this.field4196 = -30L;
        }
        for (int var3 = 0; var3 < this.field4188.length; var3++) {
            this.field4194 = var2[(int) (((long) (this.field4188[var3] >> 24) ^ this.field4194) & 0xFFL)] ^ this.field4194 >>> 8;
            this.field4194 = this.field4194 >>> 8 ^ var2[(int) (((long) (this.field4188[var3] >> 16) ^ this.field4194) & 0xFFL)];
            this.field4194 = var2[(int) ((this.field4194 ^ (long) (this.field4188[var3] >> 8)) & 0xFFL)] ^ this.field4194 >>> 8;
            this.field4194 = var2[(int) (((long) this.field4188[var3] ^ this.field4194) & 0xFFL)] ^ this.field4194 >>> 8;
        }
        if (this.field4195 != null) {
            for (int var4 = 0; var4 < this.field4195.length; var4++) {
                if (this.field4195[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field4184) {
                        var5 = this.field4195[var4].field9144;
                        var6 = this.field4195[var4].field9151;
                    } else {
                        var5 = this.field4195[var4].field9148;
                        var6 = this.field4195[var4].field9150;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field4194 = this.field4194 >>> 8 ^ var2[(int) (((long) (var6[var7] >> 8) ^ this.field4194) & 0xFFL)];
                            this.field4194 = this.field4194 >>> 8 ^ var2[(int) ((this.field4194 ^ (long) var6[var7]) & 0xFFL)];
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field4194 = var2[(int) (((long) (var5[var8] >> 8) ^ this.field4194) & 0xFFL)] ^ this.field4194 >>> 8;
                            this.field4194 = this.field4194 >>> 8 ^ var2[(int) ((this.field4194 ^ (long) var5[var8]) & 0xFFL)];
                        }
                    }
                    if (this.field4195[var4].field9149 != null) {
                        for (int var9 = 0; var9 < this.field4195[var4].field9149.length; var9++) {
                            this.field4194 = this.field4194 >>> 8 ^ var2[(int) ((this.field4194 ^ (long) (this.field4195[var4].field9149[var9] >> 8)) & 0xFFL)];
                            this.field4194 = var2[(int) (((long) this.field4195[var4].field9149[var9] ^ this.field4194) & 0xFFL)] ^ this.field4194 >>> 8;
                        }
                    }
                    if (this.field4195[var4].field9146 != null) {
                        for (int var10 = 0; var10 < this.field4195[var4].field9146.length; var10++) {
                            this.field4194 = var2[(int) ((this.field4194 ^ (long) (this.field4195[var4].field9146[var10] >> 8)) & 0xFFL)] ^ this.field4194 >>> 8;
                            this.field4194 = var2[(int) ((this.field4194 ^ (long) this.field4195[var4].field9146[var10]) & 0xFFL)] ^ this.field4194 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field4194 = this.field4194 >>> 8 ^ var2[(int) (((long) this.field4193[var11] ^ this.field4194) & 0xFFL)];
        }
        this.field4194 = this.field4194 >>> 8 ^ var2[(int) (((long) (this.field4184 ? 1 : 0) ^ this.field4194) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public static void method1812(int arg0) {
        field4202 = null;
        if (arg0 < 28) {
            field4202 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIB)V")
    public final void method1813(int arg0, int arg1, byte arg2) {
        this.field4193[arg0] = arg1;
        if (arg2 != 58) {
            this.field4195 = null;
        }
        field4186++;
        this.method1811(1056487344);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lep;III)V")
    public final void method1814(class498 arg0, int arg1, int arg2, int arg3) {
        field4185++;
        int var5 = class501.field6878[arg3];
        if (arg0.method2913(arg1, (byte) 127) == null) {
            return;
        }
        if (arg2 != -65536) {
            this.method1819(-63, 114, -63, null);
        }
        this.field4188[var5] = class694.method3895(Integer.MIN_VALUE, arg1);
        this.method1811(arg2 ^ 0xC107B7B0);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILqp;ILje;[IILep;Lbr;IILpa;Lje;ZIILha;ILtb;ILos;[Lip;)Lka;")
    public final class233 method1815(int arg0, class489 arg1, int arg2, class98 arg3, int[] arg4, int arg5, class498 arg6, class564 arg7, int arg8, int arg9, class660 arg10, class98 arg11, boolean arg12, int arg13, int arg14, class475 arg15, int arg16, class503 arg17, int arg18, class277 arg19, class596[] arg20) {
        field4190++;
        if (this.field4191 != -1) {
            return arg10.method3700(32501, this.field4191).method1305(arg9, arg8, -125, null, arg2, arg16, arg0, arg13, arg19, arg20, arg5, arg4, arg11, arg7, arg15, arg18, arg1, arg3);
        }
        int var22 = arg0;
        long var23 = this.field4194;
        int[] var25 = this.field4188;
        boolean var26 = false;
        boolean var27 = false;
        if (arg3 != null && (arg3.field1394 >= 0 || arg3.field1395 >= 0)) {
            var25 = new int[this.field4188.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field4188[var28];
            }
            if (arg3.field1394 >= 0) {
                if (arg3.field1394 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                    var26 = true;
                } else {
                    var25[5] = class694.method3895(arg3.field1394, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg3.field1395 >= 0) {
                if (arg3.field1395 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class694.method3895(arg3.field1395, 1073741824);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg3 != null || arg11 != null;
        int var33 = arg20 == null ? 0 : arg20.length;
        if (arg14 != 2282) {
            return null;
        }
        for (int var34 = 0; var34 < var33; var34++) {
            class83.field1264[var34] = null;
            if (arg20[var34] != null) {
                class98 var35 = arg7.method3287(arg14 ^ 0x88D, arg20[var34].field8518);
                if (var35.field1402 != null) {
                    class235.field3404[var34] = var35;
                    var32 = true;
                    int var36 = arg20[var34].field8513;
                    int var37 = arg20[var34].field8521;
                    int var38 = var35.field1402[var36];
                    class83.field1264[var34] = arg7.method3284(var38 >>> 16, (byte) -128);
                    int var39 = var38 & 0xFFFF;
                    class535.field7448[var34] = var39;
                    if (class83.field1264[var34] != null) {
                        var30 |= class83.field1264[var34].method2899(var39, arg14 - 2255);
                        var29 |= class83.field1264[var34].method2900((byte) -111, var39);
                        var31 |= class83.field1264[var34].method2898(var39, -126);
                    }
                    if ((var35.field1418 || class568.field7904) && var37 != -1 && var37 < var35.field1402.length) {
                        class538.field7472[var34] = var35.field1388[var36];
                        class107.field1534[var34] = arg20[var34].field8515;
                        int var40 = var35.field1402[var37];
                        class595.field8504[var34] = arg7.method3284(var40 >>> 16, (byte) -122);
                        int var41 = var40 & 0xFFFF;
                        class658.field9281[var34] = var41;
                        if (class595.field8504[var34] != null) {
                            var30 |= class595.field8504[var34].method2899(var41, 44);
                            var29 |= class595.field8504[var34].method2900((byte) -111, var41);
                            var31 |= class595.field8504[var34].method2898(var41, 80);
                        }
                    } else {
                        class538.field7472[var34] = 0;
                        class107.field1534[var34] = 0;
                        class595.field8504[var34] = null;
                        class658.field9281[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class495 var45 = null;
        class495 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class495 var50 = null;
        class495 var51 = null;
        if (var32) {
            if (arg3 != null) {
                int var52 = arg3.field1402[arg2];
                int var53 = var52 >>> 16;
                var42 = var52 & 0xFFFF;
                var45 = arg7.method3284(var53, (byte) -125);
                if (var45 != null) {
                    var30 |= var45.method2899(var42, arg14 - 2251);
                    var29 |= var45.method2900((byte) -111, var42);
                    var31 |= var45.method2898(var42, -92);
                }
                if ((arg3.field1418 || class568.field7904) && arg5 != -1 && arg5 < arg3.field1402.length) {
                    int var54 = arg3.field1402[arg5];
                    var44 = arg3.field1388[arg2];
                    int var55 = var54 >>> 16;
                    var43 = var54 & 0xFFFF;
                    var46 = var53 == var55 ? var45 : arg7.method3284(var55, (byte) -120);
                    if (var46 != null) {
                        var30 |= var46.method2899(var43, 110);
                        var29 |= var46.method2900((byte) -111, var43);
                        var31 |= var46.method2898(var43, -94);
                    }
                }
            }
            var22 = arg0 | 0x20;
            if (arg11 != null) {
                int var56 = arg11.field1402[arg8];
                int var57 = var56 >>> 16;
                var50 = arg7.method3284(var57, (byte) -117);
                var47 = var56 & 0xFFFF;
                if (var50 != null) {
                    var30 |= var50.method2899(var47, 102);
                    var29 |= var50.method2900((byte) -111, var47);
                    var31 |= var50.method2898(var47, arg14 - 2383);
                }
                if ((arg11.field1418 || class568.field7904) && arg16 != -1 && arg16 < arg11.field1402.length) {
                    var49 = arg11.field1388[arg8];
                    int var58 = arg11.field1402[arg16];
                    int var59 = var58 >>> 16;
                    var48 = var58 & 0xFFFF;
                    var51 = var57 == var59 ? var50 : arg7.method3284(var59, (byte) -127);
                    if (var51 != null) {
                        var30 |= var51.method2899(var48, 26);
                        var29 |= var51.method2900((byte) -111, var48);
                        var31 |= var51.method2898(var48, -112);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class494 var60 = class725.field10099;
        class233 var61;
        synchronized (class725.field10099) {
            var61 = (class233) class725.field10099.method2882(var23, (byte) -116);
        }
        class31 var62 = null;
        if (this.field4187 != -1) {
            var62 = arg19.method1774(this.field4187, (byte) 77);
        }
        if (var61 == null || arg15.method497(var61.method591(), var22) != 0) {
            if (var61 != null) {
                var22 = arg15.method426(var22, var61.method591());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var25.length <= var65) {
                    if (var64) {
                        if (this.field4196 != -1L) {
                            class494 var69 = class725.field10099;
                            synchronized (class725.field10099) {
                                var61 = (class233) class725.field10099.method2882(this.field4196, (byte) -105);
                            }
                        }
                        if (var61 != null && arg15.method497(var61.method591(), var22) == 0) {
                            break;
                        }
                        return null;
                    }
                    class678[] var70 = new class678[var25.length];
                    for (int var71 = 0; var71 < var25.length; var71++) {
                        int var72 = var25[var71];
                        class643 var73 = null;
                        boolean var74 = var71 == 5 && var26 || var71 == 3 && var27;
                        if ((var72 & 0x40000000) != 0) {
                            if (!var74 && this.field4195 != null && this.field4195[var71] != null) {
                                var73 = this.field4195[var71];
                            }
                            class678 var76 = arg17.method2937((byte) -18, var72 & 0x3FFFFFFF).method320(0, this.field4184, var73);
                            if (var76 != null) {
                                var70[var71] = var76;
                            }
                        } else if ((Integer.MIN_VALUE & var72) != 0) {
                            class678 var75 = arg6.method2913(var72 & 0x3FFFFFFF, (byte) 99).method1536(arg14 ^ 0x8DE);
                            if (var75 != null) {
                                var70[var71] = var75;
                            }
                        }
                    }
                    if (var62 != null && var62.field384 != null) {
                        for (int var77 = 0; var77 < var62.field384.length; var77++) {
                            if (var70[var77] != null) {
                                int var78 = 0;
                                int var79 = 0;
                                int var80 = 0;
                                int var81 = 0;
                                int var82 = 0;
                                int var83 = 0;
                                if (var62.field384[var77] != null) {
                                    var78 = var62.field384[var77][0];
                                    var79 = var62.field384[var77][1];
                                    var83 = var62.field384[var77][5] << 3;
                                    var82 = var62.field384[var77][4] << 3;
                                    var80 = var62.field384[var77][2];
                                    var81 = var62.field384[var77][3] << 3;
                                }
                                if (var81 != 0 || var82 != 0 || var83 != 0) {
                                    var70[var77].method3813(var82, arg14 ^ 0x8AF, var83, var81);
                                }
                                if (var78 != 0 || var79 != 0 || var80 != 0) {
                                    var70[var77].method3804(var79, arg14 - 2282, var78, var80);
                                }
                            }
                        }
                    }
                    class678 var84 = new class678(var70, var70.length);
                    int var85 = var22 | 0x4000;
                    var61 = arg15.method514(var84, var85, class791.field10831, 64, 850);
                    for (int var86 = 0; var86 < 5; var86++) {
                        for (int var87 = 0; var87 < class78.field1169.length; var87++) {
                            if (this.field4193[var86] < class78.field1169[var87][var86].length) {
                                var61.method563(class611.field8683[var87][var86], class78.field1169[var87][var86][this.field4193[var86]]);
                            }
                        }
                    }
                    if (arg12) {
                        var61.method523(var22);
                        class494 var88 = class725.field10099;
                        synchronized (class725.field10099) {
                            class725.field10099.method2890(arg14 ^ 0xFFFFEB9F, var23, var61);
                        }
                        this.field4196 = var23;
                    }
                    break;
                }
                int var66 = var25[var65];
                class643 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field4195 != null && this.field4195[var65] != null) {
                        var67 = this.field4195[var65];
                    }
                    if (!arg17.method2937((byte) -70, var66 & 0x3FFFFFFF).method312((byte) 113, var67, this.field4184)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg6.method2913(var66 & 0x3FFFFFFF, (byte) 110).method1538((byte) -59)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class233 var89 = var61.method585((byte) 4, var22, true);
        boolean var90 = false;
        if (arg4 != null) {
            for (int var91 = 0; var91 < arg4.length; var91++) {
                if (arg4[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class765[] var92 = null;
        if (var62 != null) {
            var92 = var62.method261((byte) -121, arg15);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg4.length; var93++) {
                if (var92[var93] != null) {
                    var89.method556(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var94 < var33) {
            if (class83.field1264[var94] != null) {
                var89.method1584(null, class107.field1534[var94] - 1, 0, var95, (byte) 80, class535.field7448[var94], class83.field1264[var94], class595.field8504[var94], class538.field7472[var94], class658.field9281[var94], false);
            }
            var95 <<= 0x1;
            var94++;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg4.length; var96++) {
                if (arg4[var96] != -1) {
                    int var97 = arg4[var96] - arg18;
                    int var98 = var97 & 0x3FFF;
                    class765 var99 = arg15.method463();
                    var99.method1561(var98);
                    var89.method556(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg4.length; var100++) {
                if (var92[var100] != null) {
                    var89.method556(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method1585(false, false, var44, var43, arg9 - 1, var46, arg3.field1415, var50, var45, var51, var42, var49, var48, arg13 - 1, var47);
        } else if (var45 != null) {
            var89.method1581(arg14 - 2282, var45, arg13 - 1, false, var42, 0, var46, var43, var44);
        } else if (var50 != null) {
            var89.method1581(arg14 - 2282, var50, arg9 - 1, false, var47, 0, var51, var48, var49);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class83.field1264[var101] = null;
            class595.field8504[var101] = null;
            class235.field3404[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
    public static final boolean method1816(int arg0, int arg1) {
        if (arg0 <= 63) {
            method1816(51, -87);
        }
        field4200++;
        return arg1 == 0 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILtb;Lje;Lpa;Lha;Lep;Lqp;IIILbr;I)Lka;")
    public final class233 method1817(int arg0, class503 arg1, class98 arg2, class660 arg3, class475 arg4, class498 arg5, class489 arg6, int arg7, int arg8, int arg9, class564 arg10, int arg11) {
        field4192++;
        if (this.field4191 != -1) {
            return arg3.method3700(32501, this.field4191).method1299(arg0, 0, arg10, arg7, arg6, null, arg9, arg2, arg8, arg4);
        }
        int var13 = arg0;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg2.field1402[arg8];
            Object var22 = null;
            var13 = arg0 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class495 var25 = arg10.method3284(var23, (byte) -120);
            if (var25 != null) {
                var15 |= var25.method2899(var24, arg11 ^ 0xFFBF);
                var14 |= var25.method2900((byte) -111, var24);
                var17 |= var25.method2898(var24, arg11 ^ 0xFF95);
                var16 |= arg2.field1406;
            }
            if ((arg2.field1418 || class568.field7904) && arg9 != -1 && arg2.field1402.length > arg9) {
                int var26 = arg2.field1402[arg9];
                int var27 = var26 >>> 16;
                class495 var28 = var23 == var27 ? var25 : arg10.method3284(var27, (byte) -125);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2899(var29, 97);
                    var14 |= var28.method2900((byte) -111, var29);
                    var17 |= var28.method2898(var29, arg11 - 65656);
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
        class494 var30 = class677.field9507;
        class233 var31;
        synchronized (class677.field9507) {
            var31 = (class233) class677.field9507.method2882(this.field4194, (byte) -109);
        }
        if (var31 == null || arg4.method497(var31.method591(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method426(var13, var31.method591());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field4188.length; var34++) {
                int var35 = this.field4188[var34];
                class643 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field4195 != null && this.field4195[var34] != null) {
                        var36 = this.field4195[var34];
                    }
                    if (!arg1.method2937((byte) -64, var35 & 0x3FFFFFFF).method318(var36, this.field4184, 3)) {
                        var33 = true;
                    }
                } else if ((var35 & Integer.MIN_VALUE) != 0 && !arg5.method2913(var35 & 0x3FFFFFFF, (byte) 79).method1533(true)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class678[] var37 = new class678[this.field4188.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field4188.length; var39++) {
                int var40 = this.field4188[var39];
                class643 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field4195 != null && this.field4195[var39] != null) {
                        var41 = this.field4195[var39];
                    }
                    class678 var42 = arg1.method2937((byte) -57, var40 & 0x3FFFFFFF).method321(this.field4184, true, var41);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class678 var43 = arg5.method2913(var40 & 0x3FFFFFFF, (byte) 103).method1532(false);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            class678 var44 = new class678(var37, var38);
            int var45 = var13 | 0x4000;
            var31 = arg4.method514(var44, var45, class791.field10831, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class78.field1169.length; var47++) {
                    if (this.field4193[var46] < class78.field1169[var47][var46].length) {
                        var31.method563(class611.field8683[var47][var46], class78.field1169[var47][var46][this.field4193[var46]]);
                    }
                }
            }
            var31.method523(var13);
            class494 var48 = class677.field9507;
            synchronized (class677.field9507) {
                class677.field9507.method2890(-7307, this.field4194, var31);
            }
        }
        if (arg2 == null) {
            return var31;
        }
        if (arg11 != 65535) {
            this.field4184 = true;
        }
        var31.method585((byte) 4, var13, true);
        return arg2.method803(arg7, var31, arg0, false, arg8, arg9);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIBI[I[Ldt;Z)V")
    public final void method1818(int[] arg0, int arg1, byte arg2, int arg3, int[] arg4, class643[] arg5, boolean arg6) {
        this.field4191 = arg1;
        field4189++;
        this.field4195 = arg5;
        if (this.field4187 != arg3) {
            this.field4187 = arg3;
        }
        this.field4188 = arg4;
        if (arg2 < 29) {
            this.field4193 = null;
        }
        this.field4193 = arg0;
        this.field4184 = arg6;
        this.method1811(1056487344);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILtb;)V")
    public final void method1819(int arg0, int arg1, int arg2, class503 arg3) {
        field4183++;
        if (arg0 == -1) {
            this.field4188[arg1] = 0;
        } else if (arg3.method2937((byte) -59, arg0) == null) {
            return;
        } else {
            this.field4188[arg1] = class694.method3895(arg0, 1073741824);
            this.method1811(1056487344);
        }
        if (arg2 != 1073741824) {
            this.field4184 = true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIILje;Lha;Lbr;ILep;III)Lka;")
    public final class233 method1820(int arg0, int arg1, int arg2, int arg3, class98 arg4, class475 arg5, class564 arg6, int arg7, class498 arg8, int arg9, int arg10, int arg11) {
        field4201++;
        if (arg9 < 52) {
            this.field4196 = -40L;
        }
        int var13 = arg3;
        if (arg4 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg4.field1402[arg1];
            var13 = arg3 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class495 var25 = arg6.method3284(var23, (byte) -122);
            if (var25 != null) {
                var15 |= var25.method2899(var24, 83);
                var14 |= var25.method2900((byte) -111, var24);
                var17 |= var25.method2898(var24, 94);
                var16 |= arg4.field1406;
            }
            if ((arg4.field1418 || class568.field7904) && arg0 != -1 && arg0 < arg4.field1402.length) {
                int var26 = arg4.field1402[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class495 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg6.method3284(var28 >>> 16, (byte) -127);
                }
                if (var29 != null) {
                    var15 |= var29.method2899(var28, 107);
                    var14 |= var29.method2900((byte) -111, var28);
                    var17 |= var29.method2898(var28, 96);
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
        long var30 = (long) arg2 | (long) arg11 << 32 | (long) (arg7 << 16);
        class494 var32 = class677.field9507;
        class233 var33;
        synchronized (class677.field9507) {
            var33 = (class233) class677.field9507.method2882(var30, (byte) -122);
        }
        if (var33 == null || arg5.method497(var33.method591(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method426(var13, var33.method591());
            }
            class678[] var35 = new class678[3];
            int var36 = 0;
            if (!arg8.method2913(arg2, (byte) 124).method1533(true) || !arg8.method2913(arg7, (byte) 93).method1533(true) || !arg8.method2913(arg11, (byte) 84).method1533(true)) {
                return null;
            }
            class678 var37 = arg8.method2913(arg2, (byte) 122).method1532(false);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class678 var38 = arg8.method2913(arg7, (byte) 93).method1532(false);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class678 var39 = arg8.method2913(arg11, (byte) 97).method1532(false);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class678 var40 = new class678(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg5.method514(var40, var41, class791.field10831, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class78.field1169.length; var43++) {
                    if (class78.field1169[var43][var42].length > this.field4193[var42]) {
                        var33.method563(class611.field8683[var43][var42], class78.field1169[var43][var42][this.field4193[var42]]);
                    }
                }
            }
            var33.method523(var13);
            class494 var44 = class677.field9507;
            synchronized (class677.field9507) {
                class677.field9507.method2890(-7307, var30, var33);
            }
        }
        if (arg4 == null) {
            return var33;
        } else {
            class233 var45 = var33.method585((byte) 4, var13, true);
            return arg4.method803(arg10, var45, arg3, false, arg1, arg0);
        }
    }
}
