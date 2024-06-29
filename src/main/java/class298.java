import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class298 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field4777 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field4774 = 0;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field4788 = -1;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field4792 = -1;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field4796;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "J")
    private long field4776;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "J")
    private long field4783;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4794;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Z")
    public boolean field4775;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[I")
    public int[] field4784;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
    private int[] field4791;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "[[I")
    private int[][] field4787;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V")
    public final void method2024(boolean arg0, byte arg1) {
        field4782++;
        this.field4775 = arg0;
        if (arg1 == -127) {
            this.method2033((byte) 127);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method2025(int arg0) {
        field4794 = null;
        if (arg0 != 64) {
            field4788 = -125;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)V")
    public final void method2026(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            this.field4784[arg1] = arg2;
            field4780++;
            this.method2033((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZIILoe;II[Lom;ILoe;ZI)Lmg;")
    public final class58 method2027(int arg0, boolean arg1, int arg2, int arg3, class76 arg4, int arg5, int arg6, class152[] arg7, int arg8, class76 arg9, boolean arg10, int arg11) {
        field4789++;
        if (this.field4796 != -1) {
            return class303.method2062(this.field4796, -81).method799(arg4, arg2, arg3, arg11, 0, arg6, arg8, arg7, arg9, arg5);
        }
        long var13 = this.field4776;
        int[] var15 = this.field4791;
        if (arg9 != null && (arg9.field1197 >= 0 || arg9.field1196 >= 0)) {
            var15 = new int[12];
            for (int var16 = 0; var16 < 12; var16++) {
                var15[var16] = this.field4791[var16];
            }
            if (arg9.field1197 >= 0) {
                if (arg9.field1197 == 65535) {
                    var13 ^= 0xFFFFFFFF00000000L;
                    var15[5] = 0;
                } else {
                    var15[5] = class200.method1408(1073741824, arg9.field1197);
                    var13 ^= (long) var15[5] << 32;
                }
            }
            if (arg9.field1196 >= 0) {
                if (arg9.field1196 == 65535) {
                    var15[3] = 0;
                    var13 ^= 0xFFFFFFFFL;
                } else {
                    var15[3] = class200.method1408(1073741824, arg9.field1196);
                    var13 ^= (long) var15[3];
                }
            }
        }
        class58 var17 = (class58) class169.field2570.method1418(var13, arg0 + 31167);
        if (var17 == null) {
            boolean var18 = false;
            for (int var19 = 0; var19 < 12; var19++) {
                int var44 = var15[var19];
                if ((var44 & 0x40000000) == 0) {
                    if ((var44 & Integer.MIN_VALUE) != 0 && !class139.method1049(-82, var44 & 0x3FFFFFFF).method44((byte) 104)) {
                        var18 = true;
                    }
                } else if (!class12.method88(var44 & 0x3FFFFFFF, arg0 + 59005).method204(this.field4775, false)) {
                    var18 = true;
                }
            }
            if (var18) {
                if (this.field4783 != -1L) {
                    var17 = (class58) class169.field2570.method1418(this.field4783, 0);
                }
                if (var17 == null) {
                    return null;
                }
            }
            if (var17 == null) {
                class96[] var20 = new class96[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var41 = var15[var21];
                    if ((var41 & 0x40000000) != 0) {
                        class96 var42 = class12.method88(var41 & 0x3FFFFFFF, 27838).method194(arg0 ^ 0x79BE, this.field4775);
                        if (var42 != null) {
                            var20[var21] = var42;
                        }
                    } else if ((Integer.MIN_VALUE & var41) != 0) {
                        class96 var43 = class139.method1049(arg0 ^ 0x798C, var41 & 0x3FFFFFFF).method50((byte) -95);
                        if (var43 != null) {
                            var20[var21] = var43;
                        }
                    }
                }
                class294 var22 = null;
                if (this.field4795 != -1) {
                    var22 = class102.method803(this.field4795, 32);
                }
                if (var22 != null && var22.field4687 != null) {
                    for (int var23 = 0; var23 < var22.field4687.length; var23++) {
                        if (var22.field4687[var23] != null && var20[var23] != null) {
                            int var24 = var22.field4687[var23][0];
                            int var25 = var22.field4687[var23][2];
                            int var26 = var22.field4687[var23][1];
                            int var27 = var22.field4687[var23][3];
                            int var28 = var22.field4687[var23][4];
                            int var29 = var22.field4687[var23][5];
                            if (this.field4787 == null) {
                                this.field4787 = new int[var22.field4687.length][];
                            }
                            if (this.field4787[var23] == null) {
                                int[] var30 = this.field4787[var23] = new int[15];
                                if (var27 == 0 && var28 == 0 && var29 == 0) {
                                    var30[0] = var30[4] = var30[8] = 32768;
                                    var30[12] = -var24;
                                    var30[13] = -var26;
                                    var30[14] = -var25;
                                } else {
                                    int var31 = class244.field3592[var27] >> 1;
                                    int var32 = class244.field3590[var27] >> 1;
                                    int var33 = class244.field3592[var28] >> 1;
                                    int var34 = class244.field3590[var28] >> 1;
                                    int var35 = class244.field3590[var29] >> 1;
                                    int var36 = class244.field3592[var29] >> 1;
                                    var30[2] = var31 * var34 + 16384 >> 15;
                                    var30[5] = -var32;
                                    int var37 = var32 * var36 + 16384 >> 15;
                                    var30[7] = -var34 * -var35 + var33 * var37 + 16384 >> 15;
                                    int var38 = var32 * var35 + 16384 >> 15;
                                    var30[0] = var33 * var36 + var34 * var38 + 16384 >> 15;
                                    var30[8] = var31 * var33 + 16384 >> 15;
                                    var30[3] = var31 * var35 + 16384 >> 15;
                                    var30[6] = -var34 * var36 + var33 * var38 + 16384 >> 15;
                                    var30[4] = var31 * var36 + 16384 >> 15;
                                    var30[12] = var30[3] * -var26 + var30[0] * -var24 + var30[6] * -var25 + 16384 >> 15;
                                    var30[14] = var30[5] * -var26 + var30[2] * -var24 + var30[8] * -var25 + 16384 >> 15;
                                    var30[1] = -var35 * var33 + var34 * var37 + 16384 >> 15;
                                    var30[13] = var30[1] * -var24 + var30[7] * -var25 + (var30[4] * -var26) + 16384 >> 15;
                                }
                                var30[11] = var25;
                                var30[9] = var24;
                                var30[10] = var26;
                            }
                            if (var27 != 0 || var28 != 0 || var29 != 0) {
                                var20[var23].method736(var27, var28, var29);
                            }
                            if (var24 != 0 || var26 != 0 || var25 != 0) {
                                var20[var23].method747(var24, var26, var25);
                            }
                        }
                    }
                }
                class96 var39 = new class96(var20, var20.length);
                for (int var40 = 0; var40 < 5; var40++) {
                    if (class283.field4557[var40].length > this.field4784[var40]) {
                        var39.method748(class21.field225[var40], class283.field4557[var40][this.field4784[var40]]);
                    }
                    if (this.field4784[var40] < class207.field3066[var40].length) {
                        var39.method748(class294.field4715[var40], class207.field3066[var40][this.field4784[var40]]);
                    }
                }
                var17 = var39.method759(64, 850, -30, -50, -30);
                if (arg10) {
                    class169.field2570.method1421(var13, var17, (byte) 61);
                    this.field4783 = var13;
                }
            }
        }
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        boolean var48 = false;
        int var49 = arg7 == null ? 0 : arg7.length;
        for (int var50 = 0; var50 < var49; var50++) {
            if (arg7[var50] != null) {
                class76 var73 = class232.method1609((byte) -32, arg7[var50].field2404);
                if (var73.field1191 != null) {
                    var46 = true;
                    class45.field609[var50] = var73;
                    int var74 = arg7[var50].field2403;
                    int var75 = arg7[var50].field2400;
                    int var76 = var73.field1191[var74];
                    class75.field1185[var50] = class86.method636(-3, var76 >>> 16);
                    int var77 = var76 & 0xFFFF;
                    class107.field1818[var50] = var77;
                    if (class75.field1185[var50] != null) {
                        var47 |= class75.field1185[var50].method858((byte) 104, var77);
                        var45 |= class75.field1185[var50].method854((byte) -125, var77);
                        var48 |= var73.field1187;
                    }
                    if ((var73.field1201 || class279.field4487) && var75 != -1 && var75 < var73.field1191.length) {
                        class129.field2154[var50] = var73.field1194[var74];
                        class76.field1192[var50] = arg7[var50].field2401;
                        int var78 = var73.field1191[var75];
                        class31.field393[var50] = class86.method636(arg0 + 31164, var78 >>> 16);
                        int var79 = var78 & 0xFFFF;
                        class135.field2208[var50] = var79;
                        if (class31.field393[var50] != null) {
                            var47 |= class31.field393[var50].method858((byte) 104, var79);
                            var45 |= class31.field393[var50].method854((byte) -120, var79);
                        }
                    } else {
                        class129.field2154[var50] = 0;
                        class76.field1192[var50] = 0;
                        class31.field393[var50] = null;
                        class135.field2208[var50] = -1;
                    }
                }
            }
        }
        if (var46 || arg9 != null || arg4 != null) {
            int var51 = -1;
            int var52 = -1;
            int var53 = 0;
            class114 var54 = null;
            class114 var55 = null;
            if (arg9 != null) {
                int var56 = arg9.field1191[arg5];
                int var57 = var56 >>> 16;
                var51 = var56 & 0xFFFF;
                var55 = class86.method636(-3, var57);
                if (var55 != null) {
                    var47 |= var55.method858((byte) 104, var51);
                    var45 |= var55.method854((byte) -126, var51);
                    var48 |= arg9.field1187;
                }
                if ((arg9.field1201 || class279.field4487) && arg2 != -1 && arg2 < arg9.field1191.length) {
                    int var58 = arg9.field1191[arg2];
                    int var59 = var58 >>> 16;
                    var53 = arg9.field1194[arg5];
                    var52 = var58 & 0xFFFF;
                    if (var57 == var59) {
                        var54 = var55;
                    } else {
                        var54 = class86.method636(arg0 ^ 0x79BC, var52 >>> 16);
                    }
                    if (var54 != null) {
                        var47 |= var54.method858((byte) 104, var52);
                        var45 |= var54.method854((byte) -123, var52);
                    }
                }
            }
            if (arg0 != -31167) {
                return null;
            }
            int var60 = 0;
            int var61 = -1;
            class114 var62 = null;
            int var63 = -1;
            class114 var64 = null;
            if (arg4 != null) {
                int var65 = arg4.field1191[arg3];
                int var66 = var65 >>> 16;
                var62 = class86.method636(-3, var66);
                var63 = var65 & 0xFFFF;
                if (var62 != null) {
                    var47 |= var62.method858((byte) 104, var63);
                    var45 |= var62.method854((byte) -120, var63);
                    var48 |= arg4.field1187;
                }
                if ((arg4.field1201 || class279.field4487) && arg11 != -1 && arg11 < arg4.field1191.length) {
                    int var67 = arg4.field1191[arg11];
                    int var68 = var67 >>> 16;
                    var60 = arg4.field1194[arg3];
                    var61 = var67 & 0xFFFF;
                    if (var66 == var68) {
                        var64 = var62;
                    } else {
                        var64 = class86.method636(arg0 ^ 0x79BC, var61 >>> 16);
                    }
                    if (var64 != null) {
                        var47 |= var64.method858((byte) 104, var61);
                        var45 |= var64.method854((byte) -122, var61);
                    }
                }
            }
            class58 var69 = var17.method412(!var45, !var47, !var48);
            int var70 = 1;
            for (int var71 = 0; var71 < var49; var71++) {
                if (class75.field1185[var71] != null) {
                    var69.method422(class75.field1185[var71], class107.field1818[var71], class31.field393[var71], class135.field2208[var71], class76.field1192[var71] - 1, class129.field2154[var71], var70, class45.field609[var71].field1187, this.field4787[var71]);
                }
                var70 <<= 0x1;
            }
            if (var55 != null && var62 != null) {
                var69.method420(var55, var51, var54, var52, arg8 - 1, var53, var62, var63, var64, var61, arg6 - 1, var60, arg9.field1209, arg9.field1187 | arg4.field1187);
            } else if (var55 != null) {
                var69.method426(var55, var51, var54, var52, arg8 - 1, var53, arg9.field1187);
            } else if (var62 != null) {
                var69.method426(var62, var63, var64, var61, arg6 - 1, var60, arg4.field1187);
            }
            for (int var72 = 0; var72 < var49; var72++) {
                class75.field1185[var72] = null;
                class31.field393[var72] = null;
                class45.field609[var72] = null;
            }
            return var69;
        } else if (arg1) {
            return var17.method412(false, false, false);
        } else {
            return var17;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIILoe;)Lmg;")
    public final class58 method2028(int arg0, int arg1, int arg2, int arg3, class76 arg4) {
        field4778++;
        if (this.field4796 != -1) {
            return class303.method2062(this.field4796, -86).method805(arg4, arg0, arg1, 0, arg2);
        }
        class58 var6 = (class58) class33.field413.method1418(this.field4776, 0);
        int var7 = -55 / ((arg3 + 82) / 33);
        if (var6 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var18 = this.field4791[var9];
                if ((var18 & 0x40000000) == 0) {
                    if ((var18 & Integer.MIN_VALUE) != 0 && !class139.method1049(-19, var18 & 0x3FFFFFFF).method48(108)) {
                        var8 = true;
                    }
                } else if (!class12.method88(var18 & 0x3FFFFFFF, 27838).method198(this.field4775, (byte) 43)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class96[] var10 = new class96[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var15 = this.field4791[var12];
                if ((var15 & 0x40000000) != 0) {
                    class96 var16 = class12.method88(var15 & 0x3FFFFFFF, 27838).method193(true, this.field4775);
                    if (var16 != null) {
                        var10[var11++] = var16;
                    }
                } else if ((var15 & Integer.MIN_VALUE) != 0) {
                    class96 var17 = class139.method1049(-33, var15 & 0x3FFFFFFF).method47(79);
                    if (var17 != null) {
                        var10[var11++] = var17;
                    }
                }
            }
            class96 var13 = new class96(var10, var11);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class283.field4557[var14].length > this.field4784[var14]) {
                    var13.method748(class21.field225[var14], class283.field4557[var14][this.field4784[var14]]);
                }
                if (class207.field3066[var14].length > this.field4784[var14]) {
                    var13.method748(class294.field4715[var14], class207.field3066[var14][this.field4784[var14]]);
                }
            }
            var6 = var13.method759(64, 768, -50, -10, -50);
            class33.field413.method1421(this.field4776, var6, (byte) 45);
        }
        if (arg4 != null) {
            var6 = arg4.method570((byte) -120, arg0, arg2, var6, arg1);
        }
        return var6;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z[IIII[I)V")
    public final void method2029(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5) {
        field4781++;
        if (this.field4795 != arg3) {
            this.field4787 = null;
            this.field4795 = arg3;
        }
        if (arg2 != 16384) {
            return;
        }
        if (arg5 == null) {
            arg5 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class16.field174; var8++) {
                    class8 var9 = class139.method1049(-24, var8);
                    if (var9 != null && !var9.field90 && (arg0 ? class172.field2626[var7] : class36.field465[var7]) == var9.field85) {
                        arg5[class303.field4907[var7]] = class200.method1408(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4791 = arg5;
        this.field4796 = arg4;
        this.field4784 = arg1;
        this.field4775 = arg0;
        this.method2033((byte) 126);
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)I")
    public final int method2030(int arg0) {
        field4785++;
        int var2 = -65 / ((arg0 - 20) / 57);
        return this.field4796 == -1 ? (this.field4784[0] << 25) + this.field4791[1] + (this.field4784[4] << 20) - (-(this.field4791[0] << 15) + -(this.field4791[8] << 10) - (this.field4791[11] << 5)) : class303.method2062(this.field4796, -88).field1719 + 305419896;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILmh;)Ljava/lang/String;")
    public static final String method2031(int arg0, class263 arg1) {
        field4790++;
        if (client.method903(arg1).method1724((byte) 119) == 0) {
            return null;
        } else if (arg1.field4088 == null || arg1.field4088.trim().length() == 0) {
            return class270.field4368 ? "Hidden-use" : null;
        } else {
            if (arg0 != -16872) {
                field4777 = 4;
            }
            return arg1.field4088;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIBILoe;)Lmg;")
    public final class58 method2032(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class76 arg7) {
        field4779++;
        long var9 = (long) (arg2 << 16) | (long) arg3 << 32 | (long) arg0;
        class58 var11 = (class58) class33.field413.method1418(var9, 0);
        if (arg5 <= 77) {
            return null;
        }
        if (var11 == null) {
            int var12 = 0;
            class96[] var13 = new class96[3];
            if (!class139.method1049(-87, arg0).method48(107) || !class139.method1049(-26, arg2).method48(113) || !class139.method1049(-24, arg3).method48(118)) {
                return null;
            }
            class96 var14 = class139.method1049(-39, arg0).method47(65);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class96 var15 = class139.method1049(-94, arg2).method47(76);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class96 var16 = class139.method1049(-33, arg3).method47(103);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class96 var17 = new class96(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4784[var18] < class283.field4557[var18].length) {
                    var17.method748(class21.field225[var18], class283.field4557[var18][this.field4784[var18]]);
                }
                if (class207.field3066[var18].length > this.field4784[var18]) {
                    var17.method748(class294.field4715[var18], class207.field3066[var18][this.field4784[var18]]);
                }
            }
            var11 = var17.method759(64, 768, -50, -10, -50);
            class33.field413.method1421(var9, var11, (byte) 80);
        }
        if (arg7 != null) {
            var11 = arg7.method570((byte) -128, arg6, arg1, var11, arg4);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    private final void method2033(byte arg0) {
        field4793++;
        long var2 = this.field4776;
        long[] var4 = class36.field458;
        this.field4776 = -1L;
        this.field4776 = this.field4776 >>> 8 ^ var4[(int) ((this.field4776 ^ (long) (this.field4795 >> 8)) & 0xFFL)];
        if (arg0 < 119) {
            return;
        }
        this.field4776 = var4[(int) ((this.field4776 ^ (long) this.field4795) & 0xFFL)] ^ this.field4776 >>> 8;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4776 = var4[(int) (((long) (this.field4791[var5] >> 24) ^ this.field4776) & 0xFFL)] ^ this.field4776 >>> 8;
            this.field4776 = this.field4776 >>> 8 ^ var4[(int) (((long) (this.field4791[var5] >> 16) ^ this.field4776) & 0xFFL)];
            this.field4776 = this.field4776 >>> 8 ^ var4[(int) ((this.field4776 ^ (long) (this.field4791[var5] >> 8)) & 0xFFL)];
            this.field4776 = this.field4776 >>> 8 ^ var4[(int) (((long) this.field4791[var5] ^ this.field4776) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4776 = var4[(int) ((this.field4776 ^ (long) this.field4784[var6]) & 0xFFL)] ^ this.field4776 >>> 8;
        }
        this.field4776 = var4[(int) ((this.field4776 ^ (long) (this.field4775 ? 1 : 0)) & 0xFFL)] ^ this.field4776 >>> 8;
        if (var2 != 0L && this.field4776 != var2) {
            class169.field2570.method1415(var2, false);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public final void method2034(int arg0, int arg1, int arg2) {
        int var4 = class303.field4907[arg2];
        field4786++;
        if (this.field4791[var4] == 0 || class139.method1049(-18, arg0) == null) {
            return;
        }
        if (arg1 != 1) {
            this.method2030(87);
        }
        this.field4791[var4] = class200.method1408(Integer.MIN_VALUE, arg0);
        this.method2033((byte) 123);
    }
}
