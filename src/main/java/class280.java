import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class280 {

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field4555 = 0;

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field4560 = 0;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    private int field4558;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "J")
    private long field4567;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "J")
    private long field4570;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lrk;")
    public static class292 field4553;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Z")
    public boolean field4550;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "[I")
    private int[] field4551;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "[I")
    public int[] field4559;

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "[[I")
    private int[][] field4566;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
    public static void method1903(byte arg0) {
        field4553 = null;
        if (arg0 < 67) {
            field4560 = -5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIILai;ZIII)Lha;")
    public final class32 method1904(int arg0, int arg1, int arg2, class91 arg3, boolean arg4, int arg5, int arg6, int arg7) {
        long var9 = (long) (arg2 << 16) | (long) arg6 << 32 | (long) arg1;
        field4568++;
        class32 var11 = (class32) class179.field2964.method1879(8887, var9);
        if (arg4) {
            this.method1911((int[]) null, 67, 66, -57, false, (int[]) null);
        }
        if (var11 == null) {
            class201[] var12 = new class201[3];
            int var13 = 0;
            if (!class89.method619(arg1, 3).method435(5) || !class89.method619(arg2, 3).method435(5) || !class89.method619(arg6, 3).method435(5)) {
                return null;
            }
            class201 var14 = class89.method619(arg1, 3).method437((byte) 75);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class201 var15 = class89.method619(arg2, 3).method437((byte) 75);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class201 var16 = class89.method619(arg6, 3).method437((byte) 75);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class201 var17 = new class201(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class182.field3024[var18].length > this.field4559[var18]) {
                    var17.method1403(class81.field1306[var18], class182.field3024[var18][this.field4559[var18]]);
                }
                if (class66.field1080[var18].length > this.field4559[var18]) {
                    var17.method1403(class288.field4662[var18], class66.field1080[var18][this.field4559[var18]]);
                }
            }
            var11 = var17.method1391(64, 768, -50, -10, -50);
            class179.field2964.method1883(var9, -117, var11);
        }
        if (arg3 != null) {
            var11 = arg3.method637(var11, arg5, arg0, arg7, (byte) 43);
        }
        return var11;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II[Lta;IIIZLai;Lai;IZI)Lha;")
    public final class32 method1905(int arg0, int arg1, class278[] arg2, int arg3, int arg4, int arg5, boolean arg6, class91 arg7, class91 arg8, int arg9, boolean arg10, int arg11) {
        field4565++;
        if (this.field4554 != -1) {
            return class206.method1422(this.field4554, (byte) 84).method1645(arg0, arg7, arg2, arg4, arg1, arg5, -117, arg11, arg8, arg3);
        }
        long var13 = this.field4567;
        int[] var15 = this.field4551;
        if (arg8 != null && (arg8.field1438 >= 0 || arg8.field1425 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field4551[var16];
            }
            if (arg8.field1438 >= 0) {
                if (arg8.field1438 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class76.method555(1073741824, arg8.field1438);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg8.field1425 >= 0) {
                if (arg8.field1425 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class76.method555(arg8.field1425, 1073741824);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class32 var17 = (class32) class106.field1652.method1879(arg9 ^ 0xA1175407, var13);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((var44 & Integer.MIN_VALUE) != 0 && !class89.method619(var44 & 0x3FFFFFFF, arg9 + 1592297811).method432(0)) {
                        var18 = true;
                    }
                } else if (!class107.method754(-20563, var44 & 0x3FFFFFFF).method1071((byte) -119, this.field4550)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field4570 != -1L) {
                    var17 = (class32) class106.field1652.method1879(8887, this.field4570);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class201[] var20 = new class201[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class201 var42 = class107.method754(-20563, var41 & 0x3FFFFFFF).method1078(this.field4550, (byte) 119);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    } else if ((var41 & Integer.MIN_VALUE) != 0) {
                        class201 var43 = class89.method619(var41 & 0x3FFFFFFF, arg9 ^ 0xA11776B3).method442((byte) -125);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    }
                }
                class254 var22 = null;
                if (this.field4558 != -1) {
                    var22 = class23.method186((byte) 123, this.field4558);
                }
                if (var22 != null && var22.field4184 != null) {
                    for (int var23 = 0; var23 < var22.field4184.length; var23++) {
                        if (var22.field4184[var23] != null && var20[var23] != null) {
                            int var24 = var22.field4184[var23][0];
                            int var25 = var22.field4184[var23][1];
                            int var26 = var22.field4184[var23][2];
                            int var27 = var22.field4184[var23][3];
                            int var28 = var22.field4184[var23][4];
                            int var29 = var22.field4184[var23][5];
                            if (this.field4566 == null) {
                                this.field4566 = new int[var22.field4184.length][];
                            }
                            if (this.field4566[var23] == null) {
                                int[] var30 = this.field4566[var23] = new int[15];
                                if (var27 == 0 && var28 == 0 && var29 == 0) {
                                    var30[12] = -var24;
                                    var30[14] = -var26;
                                    var30[13] = -var25;
                                    var30[0] = var30[4] = var30[8] = 32768;
                                } else {
                                    int var31 = class136.field2193[var27] >> 1;
                                    int var32 = class136.field2191[var27] >> 1;
                                    int var33 = class136.field2191[var28] >> 1;
                                    int var34 = class136.field2191[var29] >> 1;
                                    int var35 = class136.field2193[var29] >> 1;
                                    int var36 = class136.field2193[var28] >> 1;
                                    int var37 = var32 * var35 + 16384 >> 15;
                                    var30[7] = var36 * var37 + -var33 * -var34 + 16384 >> 15;
                                    var30[4] = var31 * var35 + 16384 >> 15;
                                    var30[5] = -var32;
                                    int var38 = var32 * var34 + 16384 >> 15;
                                    var30[2] = var31 * var33 + 16384 >> 15;
                                    var30[6] = -var33 * var35 + (var36 * var38) + 16384 >> 15;
                                    var30[8] = var31 * var36 + 16384 >> 15;
                                    var30[3] = var31 * var34 + 16384 >> 15;
                                    var30[0] = var35 * var36 + (var33 * var38) + 16384 >> 15;
                                    var30[14] = var30[5] * -var25 + var30[2] * -var24 + var30[8] * -var26 + 16384 >> 15;
                                    var30[1] = -var34 * var36 + (var33 * var37) + 16384 >> 15;
                                    var30[13] = var30[1] * -var24 + var30[4] * -var25 + var30[7] * -var26 + 16384 >> 15;
                                    var30[12] = var30[6] * -var26 + var30[3] * -var25 + var30[0] * -var24 + 16384 >> 15;
                                }
                                var30[9] = var24;
                                var30[10] = var25;
                                var30[11] = var26;
                            }
                            if (var27 != 0 || var28 != 0 || var29 != 0) {
                                var20[var23].method1407(var27, var28, var29);
                            }
                            if (var24 != 0 || var25 != 0 || var26 != 0) {
                                var20[var23].method1392(var24, var25, var26);
                            }
                        }
                    }
                }
                class201 var39 = new class201(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (this.field4559[var40] < class182.field3024[var40].length) {
                        var39.method1403(class81.field1306[var40], class182.field3024[var40][this.field4559[var40]]);
                    }
                    if (class66.field1080[var40].length > this.field4559[var40]) {
                        var39.method1403(class288.field4662[var40], class66.field1080[var40][this.field4559[var40]]);
                    }
                }
                var17 = var39.method1391(64, 850, -30, -50, -30);
                if (arg10) {
                    class106.field1652.method1883(var13, 78, var17);
                    this.field4570 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg2 == null ? 0 : arg2.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg2[var50] != null) {
                class91 var73 = class159.method1085((byte) -63, arg2[var50].field4544);
                if (var73.field1434 != null) {
                    var45 = true;
                    class48.field701[var50] = var73;
                    int var74 = arg2[var50].field4535;
                    int var75 = arg2[var50].field4537;
                    int var76 = var73.field1434[var75];
                    class26.field472[var50] = class215.method1476((byte) 71, var76 >>> 16);
                    int var77 = var76 & 0xFFFF;
                    class206.field3307[var50] = var77;
                    if (class26.field472[var50] != null) {
                        var48 |= class26.field472[var50].method2023(var77, 0);
                        var46 |= class26.field472[var50].method2024(var77, 0);
                        var47 |= var73.field1424;
                    }
                    if ((var73.field1443 || class271.field4369) && var74 != -1 && var74 < var73.field1434.length) {
                        class273.field4404[var50] = var73.field1452[var75];
                        class114.field1746[var50] = arg2[var50].field4532;
                        int var78 = var73.field1434[var74];
                        class261.field4263[var50] = class215.method1476((byte) -119, var78 >>> 16);
                        int var79 = var78 & 0xFFFF;
                        class65.field1046[var50] = var79;
                        if (class261.field4263[var50] != null) {
                            var48 |= class261.field4263[var50].method2023(var79, arg9 ^ 0xA11776B0);
                            var46 |= class261.field4263[var50].method2024(var79, arg9 + 1592297808);
                        }
                    } else {
                        class273.field4404[var50] = 0;
                        class114.field1746[var50] = 0;
                        class261.field4263[var50] = null;
                        class65.field1046[var50] = -1;
                    }
                }
            }
        }
        if (var45 || arg8 != null || arg7 != null) {
            int var51 = -1;
            int var52 = -1;
            class294 var53 = null;
            int var54 = 0;
            class294 var55 = null;
            if (arg8 != null) {
                int var56 = arg8.field1434[arg4];
                int var57 = var56 >>> 16;
                var53 = class215.method1476((byte) -8, var57);
                var51 = var56 & 0xFFFF;
                if (var53 != null) {
                    var48 |= var53.method2023(var51, 0);
                    var46 |= var53.method2024(var51, 0);
                    var47 |= arg8.field1424;
                }
                if ((arg8.field1443 || class271.field4369) && arg3 != -1 && arg3 < arg8.field1434.length) {
                    int var58 = arg8.field1434[arg3];
                    var54 = arg8.field1452[arg4];
                    int var59 = var58 >>> 16;
                    var52 = var58 & 0xFFFF;
                    if (var57 == var59) {
                        var55 = var53;
                    } else {
                        var55 = class215.method1476((byte) 38, var52 >>> 16);
                    }
                    if (var55 != null) {
                        var48 |= var55.method2023(var52, 0);
                        var46 |= var55.method2024(var52, 0);
                    }
                }
            }
            int var60 = -1;
            int var61 = 0;
            if (arg9 != -1592297808) {
                field4560 = -28;
            }
            int var62 = -1;
            class294 var63 = null;
            class294 var64 = null;
            if (arg7 != null) {
                int var65 = arg7.field1434[arg0];
                int var66 = var65 >>> 16;
                var60 = var65 & 0xFFFF;
                var63 = class215.method1476((byte) 58, var66);
                if (var63 != null) {
                    var48 |= var63.method2023(var60, 0);
                    var46 |= var63.method2024(var60, 0);
                    var47 |= arg7.field1424;
                }
                if ((arg7.field1443 || class271.field4369) && arg11 != -1 && arg7.field1434.length > arg11) {
                    int var67 = arg7.field1434[arg11];
                    int var68 = var67 >>> 16;
                    var62 = var67 & 0xFFFF;
                    var61 = arg7.field1452[arg0];
                    if (var66 == var68) {
                        var64 = var63;
                    } else {
                        var64 = class215.method1476((byte) -128, var62 >>> 16);
                    }
                    if (var64 != null) {
                        var48 |= var64.method2023(var62, 0);
                        var46 |= var64.method2024(var62, arg9 + 1592297808);
                    }
                }
            }
            class32 var69 = var17.method45(!var46, !var48, !var47);
            int var70 = 0;
            int var71 = 1;
            while (var70 < var49) {
                if (class26.field472[var70] != null) {
                    var69.method242(class26.field472[var70], class206.field3307[var70], class261.field4263[var70], class65.field1046[var70], class114.field1746[var70] - 1, class273.field4404[var70], var71, class48.field701[var70].field1424, this.field4566[var70]);
                }
                var71 <<= 0x1;
                var70++;
            }
            if (var53 != null && var63 != null) {
                var69.method237(var53, var51, var55, var52, arg1 - 1, var54, var63, var60, var64, var62, arg5 - 1, var61, arg8.field1426, arg7.field1424 | arg8.field1424);
            } else if (var53 != null) {
                var69.method240(var53, var51, var55, var52, arg1 - 1, var54, arg8.field1424);
            } else if (var63 != null) {
                var69.method240(var63, var60, var64, var62, arg5 - 1, var61, arg7.field1424);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class26.field472[var72] = null;
                class261.field4263[var72] = null;
                class48.field701[var72] = null;
            }
            return var69;
        } else if (arg6) {
            return var17.method45(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IZ)V")
    public final void method1906(int arg0, boolean arg1) {
        if (arg0 == -667828049) {
            field4562++;
            this.field4550 = arg1;
            this.method1910(true);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)I")
    public final int method1907(byte arg0) {
        field4563++;
        if (arg0 >= -47) {
            method1903((byte) 109);
        }
        return this.field4554 == -1 ? (this.field4559[0] << 25) + (this.field4551[0] << 15) + (this.field4559[4] << 20) + (this.field4551[8] << 10) - (-(this.field4551[11] << 5) + -this.field4551[1]) : class206.method1422(this.field4554, (byte) 109).field3835 + 305419896;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V")
    public final void method1908(int arg0, int arg1, int arg2) {
        this.field4559[arg2] = arg1;
        field4569++;
        this.method1910(true);
        if (arg0 != 517827280) {
            this.method1912(-56, -92, (class91) null, -34, -9);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V")
    public final void method1909(int arg0, int arg1, int arg2) {
        field4557++;
        int var4 = class313.field5038[arg0];
        if (~this.field4551[var4] != arg2 && class89.method619(arg1, 3) != null) {
            this.field4551[var4] = class76.method555(arg1, Integer.MIN_VALUE);
            this.method1910(true);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    private final void method1910(boolean arg0) {
        long var2 = this.field4567;
        this.field4567 = -1L;
        if (!arg0) {
            field4564 = 38;
        }
        long[] var4 = class156.field2488;
        this.field4567 = var4[(int) ((this.field4567 ^ (long) (this.field4558 >> 8)) & 0xFFL)] ^ this.field4567 >>> 8;
        field4548++;
        this.field4567 = this.field4567 >>> 8 ^ var4[(int) (((long) this.field4558 ^ this.field4567) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4567 = var4[(int) (((long) (this.field4551[var5] >> 24) ^ this.field4567) & 0xFFL)] ^ this.field4567 >>> 8;
            this.field4567 = var4[(int) ((this.field4567 ^ (long) (this.field4551[var5] >> 16)) & 0xFFL)] ^ this.field4567 >>> 8;
            this.field4567 = this.field4567 >>> 8 ^ var4[(int) (((long) (this.field4551[var5] >> 8) ^ this.field4567) & 0xFFL)];
            this.field4567 = this.field4567 >>> 8 ^ var4[(int) ((this.field4567 ^ (long) this.field4551[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4567 = this.field4567 >>> 8 ^ var4[(int) ((this.field4567 ^ (long) this.field4559[var6]) & 0xFFL)];
        }
        this.field4567 = this.field4567 >>> 8 ^ var4[(int) ((this.field4567 ^ (long) (this.field4550 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field4567 != var2) {
            class106.field1652.method1878(128, var2);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "([IIIIZ[I)V")
    public final void method1911(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        if (this.field4558 != arg2) {
            this.field4566 = null;
            this.field4558 = arg2;
        }
        field4552++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class28.field496; var8++) {
                    class66 var9 = class89.method619(var8, 3);
                    if (var9 != null && !var9.field1069 && var9.field1068 == (arg4 ? class169.field2770[var7] : class250.field4108[var7])) {
                        arg0[class313.field5038[var7]] = class76.method555(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4551 = arg0;
        this.field4554 = arg3;
        this.field4550 = arg4;
        this.field4559 = arg5;
        if (arg1 != -26954) {
            this.field4559 = null;
        }
        this.method1910(true);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILai;II)Lha;")
    public final class32 method1912(int arg0, int arg1, class91 arg2, int arg3, int arg4) {
        if (arg0 >= -13) {
            this.method1906(-71, true);
        }
        field4549++;
        if (this.field4554 != -1) {
            return class206.method1422(this.field4554, (byte) 102).method1637(arg2, arg1, 0, arg3, arg4);
        }
        class32 var6 = (class32) class179.field2964.method1879(8887, this.field4567);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var17 = this.field4551[var8];
                if ((var17 & 0x40000000) == 0) {
                    if ((var17 & Integer.MIN_VALUE) != 0 && !class89.method619(var17 & 0x3FFFFFFF, 3).method435(5)) {
                        var7 = true;
                    }
                } else if (!class107.method754(-20563, var17 & 0x3FFFFFFF).method1079((byte) 39, this.field4550)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class201[] var9 = new class201[12];
            int var10 = 0;
            for (int var11 = 0; var11 < 12; var11++) {
                int var14 = this.field4551[var11];
                if ((var14 & 0x40000000) != 0) {
                    class201 var15 = class107.method754(-20563, var14 & 0x3FFFFFFF).method1067(this.field4550, 0);
                    if (var15 != null) {
                        var9[var10++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var14) != 0) {
                    class201 var16 = class89.method619(var14 & 0x3FFFFFFF, 3).method437((byte) 75);
                    if (var16 != null) {
                        var9[var10++] = var16;
                    }
                }
            }
            class201 var12 = new class201(var9, var10);
            for (int var13 = 0; var13 < 5; var13++) {
                if (this.field4559[var13] < class182.field3024[var13].length) {
                    var12.method1403(class81.field1306[var13], class182.field3024[var13][this.field4559[var13]]);
                }
                if (class66.field1080[var13].length > this.field4559[var13]) {
                    var12.method1403(class288.field4662[var13], class66.field1080[var13][this.field4559[var13]]);
                }
            }
            var6 = var12.method1391(64, 768, -50, -10, -50);
            class179.field2964.method1883(this.field4567, 22, var6);
        }
        if (arg2 != null) {
            var6 = arg2.method637(var6, arg4, arg1, arg3, (byte) 43);
        }
        return var6;
    }
}
