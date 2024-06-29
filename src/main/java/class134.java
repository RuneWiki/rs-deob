import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class134 {

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "[I")
    public static int[] field1962 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "J")
    private long field1954;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "J")
    private long field1960;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "Z")
    public boolean field1964;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "[I")
    public int[] field1956;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "[I")
    private int[] field1965;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[[I")
    public static int[][] field1946;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "[[I")
    private int[][] field1963;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
    public final void method870(int arg0, int arg1, int arg2) {
        field1952++;
        int var4 = class286.field4430[arg2];
        if (this.field1965[var4] != 0 && class60.method373(arg1, 0) != null) {
            this.field1965[var4] = class220.method1432(arg0, arg1);
            this.method881(255);
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)V")
    public final void method871(int arg0, int arg1, int arg2) {
        field1947++;
        this.field1956[arg2] = arg0;
        if (arg1 <= -74) {
            this.method881(255);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILrj;II)Lah;")
    public final class106 method872(int arg0, int arg1, class274 arg2, int arg3, int arg4) {
        int var6 = 23 / ((-arg1 - 60) / 42);
        field1951++;
        if (this.field1961 != -1) {
            return class165.method1084(-100, this.field1961).method1714(arg2, arg4, arg3, arg0, (byte) 120);
        }
        class106 var7 = (class106) class158.field2276.method65((byte) -125, this.field1954);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < 12; var9++) {
                int var18 = this.field1965[var9];
                if ((var18 & 0x40000000) == 0) {
                    if ((var18 & Integer.MIN_VALUE) != 0 && !class60.method373(var18 & 0x3FFFFFFF, 0).method470(0)) {
                        var8 = true;
                    }
                } else if (!class36.method224(var18 & 0x3FFFFFFF, 110).method1485(-123, this.field1964)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            int var10 = 0;
            class113[] var11 = new class113[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var15 = this.field1965[var12];
                if ((var15 & 0x40000000) != 0) {
                    class113 var16 = class36.method224(var15 & 0x3FFFFFFF, 20).method1486(0, this.field1964);
                    if (var16 != null) {
                        var11[var10++] = var16;
                    }
                } else if ((var15 & Integer.MIN_VALUE) != 0) {
                    class113 var17 = class60.method373(var15 & 0x3FFFFFFF, 0).method467(0);
                    if (var17 != null) {
                        var11[var10++] = var17;
                    }
                }
            }
            class113 var13 = new class113(var11, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1956[var14] < class1.field9[var14].length) {
                    var13.method713(class4.field62[var14], class1.field9[var14][this.field1956[var14]]);
                }
                if (class205.field2916[var14].length > this.field1956[var14]) {
                    var13.method713(class3.field35[var14], class205.field2916[var14][this.field1956[var14]]);
                }
            }
            var7 = var13.method714(64, 768, -50, -10, -50);
            class158.field2276.method64(this.field1954, -1, var7);
        }
        if (arg2 != null) {
            var7 = arg2.method1758(var7, arg3, -1, arg0, arg4);
        }
        return var7;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)I")
    public final int method873(byte arg0) {
        field1966++;
        if (arg0 != 93) {
            this.field1948 = -59;
        }
        return this.field1961 == -1 ? (this.field1965[8] << 10) + ((this.field1965[0] << 15) + (this.field1956[0] << 25) - (-(this.field1965[11] << 5) + -this.field1965[1] + -(this.field1956[4] << 20))) : 305419896 - -class165.method1084(-12, this.field1961).field3890;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method874(int arg0, int arg1) {
        class73.field875.method62(-66, arg0);
        field1958++;
        if (arg1 == -6003) {
            class1.field21.method62(-25, arg0);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method875(boolean arg0, int arg1) {
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg0) {
            method874(-97, 62);
        }
        field1959++;
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class211.field2967 + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class167.field2407 + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZB)V")
    public final void method876(boolean arg0, byte arg1) {
        field1957++;
        this.field1964 = arg0;
        if (arg1 < 20) {
            field1962 = null;
        }
        this.method881(255);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIB[Lbi;IILrj;ZLrj;)Lah;")
    public final class106 method877(int arg0, int arg1, int arg2, int arg3, byte arg4, class214[] arg5, int arg6, int arg7, class274 arg8, boolean arg9, class274 arg10) {
        field1953++;
        if (this.field1961 != -1) {
            return class165.method1084(-67, this.field1961).method1715(arg2, arg1, arg10, arg0, arg6, arg7, arg8, -14068, arg3, arg5);
        }
        if (arg4 < 70) {
            this.field1965 = null;
        }
        int[] var12 = this.field1965;
        long var13 = this.field1954;
        if (arg8 != null && (arg8.field4097 >= 0 || arg8.field4086 >= 0)) {
            var12 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var12[var15] = this.field1965[var15];
            }
            if (arg8.field4097 >= 0) {
                if (arg8.field4097 == 65535) {
                    var12[5] = 0;
                    var13 ^= 0xFFFFFFFF00000000L;
                } else {
                    var12[5] = class220.method1432(arg8.field4097, 1073741824);
                    var13 ^= (long) var12[5] << 32;
                }
            }
            if (arg8.field4086 >= 0) {
                if (arg8.field4086 == 65535) {
                    var13 ^= 0xFFFFFFFFL;
                    var12[3] = 0;
                } else {
                    var12[3] = class220.method1432(1073741824, arg8.field4086);
                    var13 ^= (long) var12[3];
                }
            }
        }
        class106 var16 = (class106) class39.field466.method65((byte) -116, var13);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var43 = var12[var18];
                if ((var43 & 0x40000000) == 0) {
                    if ((var43 & Integer.MIN_VALUE) != 0 && !class60.method373(var43 & 0x3FFFFFFF, 0).method469((byte) -69)) {
                        var17 = true;
                    }
                } else if (!class36.method224(var43 & 0x3FFFFFFF, 124).method1480(this.field1964, -11864)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field1960 != -1L) {
                    var16 = (class106) class39.field466.method65((byte) -118, this.field1960);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class113[] var19 = new class113[12];
                for (int var20 = 0; var20 < 12; var20++) {
                    int var40 = var12[var20];
                    if ((var40 & 0x40000000) != 0) {
                        class113 var41 = class36.method224(var40 & 0x3FFFFFFF, 99).method1492(this.field1964, 0);
                        if (var41 != null) {
                            var19[var20] = var41;
                        }
                    } else if ((var40 & Integer.MIN_VALUE) != 0) {
                        class113 var42 = class60.method373(var40 & 0x3FFFFFFF, 0).method472((byte) 126);
                        if (var42 != null) {
                            var19[var20] = var42;
                        }
                    }
                }
                class285 var21 = null;
                if (this.field1948 != -1) {
                    var21 = class68.method416(this.field1948, true);
                }
                if (var21 != null && var21.field4370 != null) {
                    for (int var22 = 0; var22 < var21.field4370.length; var22++) {
                        if (var21.field4370[var22] != null && var19[var22] != null) {
                            int var23 = var21.field4370[var22][0];
                            int var24 = var21.field4370[var22][2];
                            int var25 = var21.field4370[var22][3];
                            int var26 = var21.field4370[var22][1];
                            int var27 = var21.field4370[var22][4];
                            int var28 = var21.field4370[var22][5];
                            if (this.field1963 == null) {
                                this.field1963 = new int[var21.field4370.length][];
                            }
                            if (this.field1963[var22] == null) {
                                int[] var29 = this.field1963[var22] = new int[15];
                                if (var25 == 0 && var27 == 0 && var28 == 0) {
                                    var29[0] = var29[4] = var29[8] = 32768;
                                    var29[14] = -var24;
                                    var29[13] = -var26;
                                    var29[12] = -var23;
                                } else {
                                    int var30 = class297.field4698[var25] >> 1;
                                    int var31 = class297.field4698[var27] >> 1;
                                    int var32 = class297.field4697[var25] >> 1;
                                    int var33 = class297.field4697[var27] >> 1;
                                    int var34 = class297.field4697[var28] >> 1;
                                    int var35 = class297.field4698[var28] >> 1;
                                    var29[2] = var30 * var33 + 16384 >> 15;
                                    var29[3] = var30 * var34 + 16384 >> 15;
                                    var29[5] = -var32;
                                    var29[8] = var30 * var31 + 16384 >> 15;
                                    var29[14] = var29[8] * -var24 + var29[2] * -var23 + var29[5] * -var26 + 16384 >> 15;
                                    int var36 = var32 * var34 + 16384 >> 15;
                                    var29[4] = var30 * var35 + 16384 >> 15;
                                    var29[6] = -var33 * var35 + var31 * var36 + 16384 >> 15;
                                    var29[0] = var31 * var35 + var33 * var36 + 16384 >> 15;
                                    var29[12] = var29[0] * -var23 + (var29[3] * -var26) + var29[6] * -var24 + 16384 >> 15;
                                    int var37 = var32 * var35 + 16384 >> 15;
                                    var29[7] = -var33 * -var34 + var31 * var37 + 16384 >> 15;
                                    var29[1] = -var34 * var31 + var33 * var37 + 16384 >> 15;
                                    var29[13] = var29[1] * -var23 + (var29[4] * -var26) + var29[7] * -var24 + 16384 >> 15;
                                }
                                var29[9] = var23;
                                var29[10] = var26;
                                var29[11] = var24;
                            }
                            if (var25 != 0 || var27 != 0 || var28 != 0) {
                                var19[var22].method728(var25, var27, var28);
                            }
                            if (var23 != 0 || var26 != 0 || var24 != 0) {
                                var19[var22].method730(var23, var26, var24);
                            }
                        }
                    }
                }
                class113 var38 = new class113(var19, var19.length);
                for (int var39 = 0; var39 < 5; var39++) {
                    if (class1.field9[var39].length > this.field1956[var39]) {
                        var38.method713(class4.field62[var39], class1.field9[var39][this.field1956[var39]]);
                    }
                    if (class205.field2916[var39].length > this.field1956[var39]) {
                        var38.method713(class3.field35[var39], class205.field2916[var39][this.field1956[var39]]);
                    }
                }
                var16 = var38.method714(64, 850, -30, -50, -30);
                if (arg9) {
                    class39.field466.method64(var13, -1, var16);
                    this.field1960 = var13;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        boolean var47 = false;
        int var48 = arg5 == null ? 0 : arg5.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg5[var49] != null) {
                class274 var72 = class27.method165(arg5[var49].field2988, (byte) -125);
                if (var72.field4072 != null) {
                    class284.field4358[var49] = var72;
                    int var73 = arg5[var49].field2994;
                    int var74 = arg5[var49].field2995;
                    int var75 = var72.field4072[var73];
                    var44 = true;
                    class260.field3787[var49] = class251.method1611(var75 >>> 16, (byte) 109);
                    int var76 = var75 & 0xFFFF;
                    class51.field588[var49] = var76;
                    if (class260.field3787[var49] != null) {
                        var46 |= class260.field3787[var49].method358((byte) -38, var76);
                        var45 |= class260.field3787[var49].method357(var76, false);
                        var47 |= var72.field4088;
                    }
                    if ((var72.field4094 || class228.field3214) && var74 != -1 && var74 < var72.field4072.length) {
                        class289.field4501[var49] = var72.field4081[var73];
                        class68.field801[var49] = arg5[var49].field2992;
                        int var77 = var72.field4072[var74];
                        class125.field1793[var49] = class251.method1611(var77 >>> 16, (byte) 112);
                        int var78 = var77 & 0xFFFF;
                        class14.field177[var49] = var78;
                        if (class125.field1793[var49] != null) {
                            var46 |= class125.field1793[var49].method358((byte) -76, var78);
                            var45 |= class125.field1793[var49].method357(var78, false);
                        }
                    } else {
                        class289.field4501[var49] = 0;
                        class68.field801[var49] = 0;
                        class125.field1793[var49] = null;
                        class14.field177[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg8 == null && arg10 == null) {
            return var16;
        }
        int var50 = -1;
        int var51 = -1;
        int var52 = 0;
        class58 var53 = null;
        class58 var54 = null;
        if (arg8 != null) {
            int var55 = arg8.field4072[arg3];
            int var56 = var55 >>> 16;
            var54 = class251.method1611(var56, (byte) -54);
            var50 = var55 & 0xFFFF;
            if (var54 != null) {
                var46 |= var54.method358((byte) -15, var50);
                var45 |= var54.method357(var50, false);
                var47 |= arg8.field4088;
            }
            if ((arg8.field4094 || class228.field3214) && arg6 != -1 && arg8.field4072.length > arg6) {
                var52 = arg8.field4081[arg3];
                int var57 = arg8.field4072[arg6];
                int var58 = var57 >>> 16;
                var51 = var57 & 0xFFFF;
                if (var56 == var58) {
                    var53 = var54;
                } else {
                    var53 = class251.method1611(var51 >>> 16, (byte) 126);
                }
                if (var53 != null) {
                    var46 |= var53.method358((byte) -128, var51);
                    var45 |= var53.method357(var51, false);
                }
            }
        }
        int var59 = -1;
        int var60 = -1;
        int var61 = 0;
        class58 var62 = null;
        class58 var63 = null;
        if (arg10 != null) {
            int var64 = arg10.field4072[arg2];
            int var65 = var64 >>> 16;
            var62 = class251.method1611(var65, (byte) 124);
            var59 = var64 & 0xFFFF;
            if (var62 != null) {
                var46 |= var62.method358((byte) -51, var59);
                var45 |= var62.method357(var59, false);
                var47 |= arg10.field4088;
            }
            if ((arg10.field4094 || class228.field3214) && arg1 != -1 && arg10.field4072.length > arg1) {
                var61 = arg10.field4081[arg2];
                int var66 = arg10.field4072[arg1];
                int var67 = var66 >>> 16;
                var60 = var66 & 0xFFFF;
                if (var65 == var67) {
                    var63 = var62;
                } else {
                    var63 = class251.method1611(var60 >>> 16, (byte) -95);
                }
                if (var63 != null) {
                    var46 |= var63.method358((byte) -99, var60);
                    var45 |= var63.method357(var60, false);
                }
            }
        }
        class106 var68 = var16.method641(!var45, !var46, !var47);
        int var69 = 0;
        int var70 = 1;
        while (var48 > var69) {
            if (class260.field3787[var69] != null) {
                var68.method665(class260.field3787[var69], class51.field588[var69], class125.field1793[var69], class14.field177[var69], class68.field801[var69] - 1, class289.field4501[var69], var70, class284.field4358[var69].field4088, this.field1963[var69]);
            }
            var69++;
            var70 <<= 0x1;
        }
        if (var54 != null && var62 != null) {
            var68.method642(var54, var50, var53, var51, arg0 - 1, var52, var62, var59, var63, var60, arg7 - 1, var61, arg8.field4079, arg10.field4088 | arg8.field4088);
        } else if (var54 != null) {
            var68.method647(var54, var50, var53, var51, arg0 - 1, var52, arg8.field4088);
        } else if (var62 != null) {
            var68.method647(var62, var59, var63, var60, arg7 - 1, var61, arg10.field4088);
        }
        for (int var71 = 0; var71 < var48; var71++) {
            class260.field3787[var71] = null;
            class125.field1793[var71] = null;
            class284.field4358[var71] = null;
        }
        return var68;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method878(int arg0) {
        if (arg0 > -110) {
            method875(true, 71);
        }
        field1946 = null;
        field1962 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lrj;IIIIIII)Lah;")
    public final class106 method879(class274 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1955++;
        if (arg2 != -14475) {
            this.method880(-2, (int[]) null, 114, (int[]) null, true, 104);
        }
        long var9 = (long) arg3 | (long) (arg4 << 16) | (long) arg5 << 32;
        class106 var11 = (class106) class158.field2276.method65((byte) -117, var9);
        if (var11 == null) {
            class113[] var12 = new class113[3];
            int var13 = 0;
            if (!class60.method373(arg3, 0).method470(0) || !class60.method373(arg4, 0).method470(arg2 + 14475) || !class60.method373(arg5, 0).method470(0)) {
                return null;
            }
            class113 var14 = class60.method373(arg3, 0).method467(0);
            if (var14 != null) {
                var12[var13++] = var14;
            }
            class113 var15 = class60.method373(arg4, 0).method467(0);
            if (var15 != null) {
                var12[var13++] = var15;
            }
            class113 var16 = class60.method373(arg5, 0).method467(0);
            if (var16 != null) {
                var12[var13++] = var16;
            }
            class113 var17 = new class113(var12, var13);
            for (int var18 = 0; var18 < 5; var18++) {
                if (class1.field9[var18].length > this.field1956[var18]) {
                    var17.method713(class4.field62[var18], class1.field9[var18][this.field1956[var18]]);
                }
                if (class205.field2916[var18].length > this.field1956[var18]) {
                    var17.method713(class3.field35[var18], class205.field2916[var18][this.field1956[var18]]);
                }
            }
            var11 = var17.method714(64, 768, -50, -10, -50);
            class158.field2276.method64(var9, -1, var11);
        }
        if (arg0 != null) {
            var11 = arg0.method1758(var11, arg6, -1, arg1, arg7);
        }
        return var11;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[II[IZI)V")
    public final void method880(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4, int arg5) {
        if (arg2 != 25275) {
            return;
        }
        if (this.field1948 != arg0) {
            this.field1948 = arg0;
            this.field1963 = null;
        }
        field1949++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class122.field1760; var8++) {
                    class77 var9 = class60.method373(var8, 0);
                    if (var9 != null && !var9.field915 && (arg4 ? class173.field2483[var7] : class185.field2682[var7]) == var9.field925) {
                        arg3[class286.field4430[var7]] = class220.method1432(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field1965 = arg3;
        this.field1964 = arg4;
        this.field1961 = arg5;
        this.field1956 = arg1;
        this.method881(255);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    private final void method881(int arg0) {
        field1967++;
        long var2 = this.field1954;
        this.field1954 = -1L;
        long[] var4 = class70.field809;
        this.field1954 = this.field1954 >>> 8 ^ var4[(int) (((long) (this.field1948 >> 8) ^ this.field1954) & 0xFFL)];
        this.field1954 = this.field1954 >>> 8 ^ var4[(int) ((long) arg0 & ((long) this.field1948 ^ this.field1954))];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1954 = var4[(int) (((long) (this.field1965[var5] >> 24) ^ this.field1954) & 0xFFL)] ^ this.field1954 >>> 8;
            this.field1954 = this.field1954 >>> 8 ^ var4[(int) (((long) (this.field1965[var5] >> 16) ^ this.field1954) & 0xFFL)];
            this.field1954 = var4[(int) (((long) (this.field1965[var5] >> 8) ^ this.field1954) & 0xFFL)] ^ this.field1954 >>> 8;
            this.field1954 = this.field1954 >>> 8 ^ var4[(int) ((this.field1954 ^ (long) this.field1965[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1954 = this.field1954 >>> 8 ^ var4[(int) ((this.field1954 ^ (long) this.field1956[var6]) & 0xFFL)];
        }
        this.field1954 = this.field1954 >>> 8 ^ var4[(int) (((long) (this.field1964 ? 1 : 0) ^ this.field1954) & 0xFFL)];
        if (var2 != 0L && this.field1954 != var2) {
            class39.field466.method70(var2, -18041);
        }
    }
}
