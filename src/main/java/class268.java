import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class268 extends class8 {

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "Z")
    public boolean field4316 = true;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    public static int field4318 = 0;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public static int field4325 = 0;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "[I")
    private int[] field4323;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "[I")
    public int[] field4331;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "[Ljava/lang/String;")
    private String[] field4317;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "[[I")
    private int[][] field4326;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(B)Ljava/lang/String;", line = 12)
    public final String method1896(byte arg0) {
        field4321++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4317 == null) {
            return "";
        }
        var2.append(this.field4317[0]);
        if (arg0 > -61) {
            this.method1896((byte) -19);
        }
        for (int var3 = 1; var3 < this.field4317.length; var3++) {
            var2.append("...");
            var2.append(this.field4317[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjj;)Ljava/lang/String;", line = 43)
    public final String method1897(int arg0, class44 arg1) {
        field4330++;
        if (arg0 >= -47) {
            return (String) null;
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4323 != null) {
            for (int var4 = 0; var4 < this.field4323.length; var4++) {
                var3.append(this.field4317[var4]);
                var3.append(class175.method1318(this.field4326[var4], this.field4323[var4], arg1.method242(-7367, class174.field2891[this.field4323[var4]]), false));
            }
        }
        var3.append(this.field4317[this.field4317.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([ILjj;B)V", line = 80)
    public final void method1898(int[] arg0, class44 arg1, byte arg2) {
        if (arg2 <= 97) {
            field4318 = 95;
        }
        field4315++;
        if (this.field4323 == null) {
            return;
        }
        for (int var4 = 0; this.field4323.length > var4 && var4 < arg0.length; var4++) {
            int var5 = class184.field3062[this.method1901(var4, -119)];
            if (var5 > 0) {
                arg1.method277(8, (long) arg0[var4], var5);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)I", line = 113)
    public final int method1899(byte arg0) {
        if (arg0 != 32) {
            this.field4326 = (int[][]) ((int[][]) null);
        }
        field4320++;
        return this.field4323 == null ? 0 : this.field4323.length;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBIIIIIIII)V", line = 135)
    public static final void method1900(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4322++;
        int var11 = arg10 - arg4;
        int var12 = arg7 - arg0;
        if (arg10 < class74.field1048) {
            var11++;
        }
        if (arg2 != -17) {
            method1900(16, 68, (byte) -18, 120, 18, -80, -100, -54, 20, -67, -117);
        }
        if (class111.field1650 > arg7) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg9 * var13 + arg6 >> 16;
            int var15 = (var13 + 1) * arg9 + arg6 >> 16;
            int var16 = var15 - var14;
            if (var16 > 0) {
                int var17 = arg0 + var13 >> 6;
                if (var17 >= 0 && (class29.field398.length - 1) >= var17) {
                    int var18 = arg8 + var14;
                    int var19 = arg8 + var15;
                    int[][] var20 = class29.field398[var17];
                    byte[][] var21 = class113.field1719[var17];
                    byte[][] var22 = class280.field4520[var17];
                    byte[][] var23 = class195.field3191[var17];
                    byte[][] var24 = class73.field1025[var17];
                    byte[][] var25 = class129.field2018[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg3 + arg1 >> 16;
                        int var28 = arg3 * var26 + arg1 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg4 + var26 >> 6;
                            int var31 = arg5 + var28;
                            int var32 = arg5 + var27;
                            int var33 = arg4 + var26 & 0x3F;
                            int var34 = arg0 + var13 & 0x3F;
                            int var35 = (var33 << 6) + var34;
                            int var36;
                            if (var30 < 0 || var20.length - 1 < var30 || var20[var30] == null) {
                                if (class225.field3604.field4644 != -1) {
                                    var36 = class225.field3604.field4644;
                                } else if ((arg0 + var13 & 0x4) == (arg4 + var26 & 0x4)) {
                                    var36 = class110.field1635[class341.field5308 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var30 < 0 || (var20.length - 1) < var30) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class59.method382(var18, var31, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var20[var30][var35];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var22[var30] == null ? 0 : class110.field1635[var22[var30][var35] & 0xFF];
                            int var38 = var21[var30] == null ? 0 : class110.field1635[var21[var30][var35] & 0xFF];
                            if (var38 == 0 && var37 == 0) {
                                class59.method382(var18, var31, var16, var29, var36);
                            } else {
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = 1;
                                    }
                                    byte var39 = var23[var30] == null ? 0 : var23[var30][var35];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class59.method382(var18, var31, var16, var29, var38);
                                    } else {
                                        class143.method1059(var16, var39 & 0x3, true, arg2 ^ 0x72, var36, var31, var29, var18, var40 >> 2, var38, class59.field833);
                                    }
                                }
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = var36;
                                    }
                                    byte var41 = var24[var30][var35];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class59.method382(var18, var31, var16, var29, var37);
                                    }
                                    class143.method1059(var16, var41 & 0x3, var38 == 0, -87, 0, var31, var29, var18, var42 >> 2, var37, class59.field833);
                                }
                            }
                            if (var25[var30] != null) {
                                int var43 = var25[var30][var35] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var18;
                                    } else {
                                        var44 = var19 - 1;
                                    }
                                    int var45;
                                    if (var29 == 1) {
                                        var45 = var31;
                                    } else {
                                        var45 = var32 - 1;
                                    }
                                    int var46 = 13421772;
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var46 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class59.method383(var18, var31, var29, var46);
                                    } else if (var43 == 2) {
                                        class59.method400(var18, var31, var16, var46);
                                    } else if (var43 == 3) {
                                        class59.method383(var44, var31, var29, var46);
                                    } else if (var43 == 4) {
                                        class59.method400(var18, var45, var16, var46);
                                    } else if (var43 == 9) {
                                        class59.method383(var18, var31, var29, 16777215);
                                        class59.method400(var18, var31, var16, var46);
                                    } else if (var43 == 10) {
                                        class59.method383(var44, var31, var29, 16777215);
                                        class59.method400(var18, var31, var16, var46);
                                    } else if (var43 == 11) {
                                        class59.method383(var44, var31, var29, 16777215);
                                        class59.method400(var18, var45, var16, var46);
                                    } else if (var43 == 12) {
                                        class59.method383(var18, var31, var29, 16777215);
                                        class59.method400(var18, var45, var16, var46);
                                    } else if (var43 == 17) {
                                        class59.method400(var18, var31, 1, var46);
                                    } else if (var43 == 18) {
                                        class59.method400(var44, var31, 1, var46);
                                    } else if (var43 == 19) {
                                        class59.method400(var44, var45, 1, var46);
                                    } else if (var43 == 20) {
                                        class59.method400(var18, var45, 1, var46);
                                    } else if (var43 == 25) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class59.method400(var18 + var47, -var47 + var45, 1, var46);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class59.method400(var18 + var48, var31 + var48, 1, var46);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg8 + var15;
                    int var50 = arg8 + var14;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52 = (arg3 * var51 + arg1 >> 16) + arg5;
                        int var53;
                        if (class225.field3604.field4644 != -1) {
                            var53 = class225.field3604.field4644;
                        } else if ((var13 + arg0 & 0x4) == (var51 + arg4 & 0x4)) {
                            var53 = class110.field1635[class341.field5308 + 1];
                        } else {
                            var53 = 4936552;
                        }
                        if (var53 == 0) {
                            var53 = 1;
                        }
                        int var54 = (arg1 + ((var51 + 1) * arg3) >> 16) + arg5;
                        int var55 = var54 - var52;
                        class59.method382(var50, var52, var16, var55, var53);
                    }
                }
            }
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg6 + (arg9 * var56) >> 16;
            int var58 = (var56 + 1) * arg9 + arg6 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                int var60 = arg8 + var57;
                var10000 = arg8 + var58;
                int var62 = arg0 + var56 >> 6;
                if (var62 >= 0 && (class323.field5007.length - 1) >= var62) {
                    int[][] var63 = class323.field5007[var62];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = (var64 + 1) * arg3 + arg1 >> 16;
                        int var66 = arg3 * var64 + arg1 >> 16;
                        int var67 = var65 - var66;
                        if (var67 > 0) {
                            var10000 = arg5 + var65;
                            int var69 = var64 + arg4 >> 6;
                            int var70 = arg5 + var66;
                            if (var69 >= 0 && var69 <= var63.length - 1) {
                                int var71 = ((arg4 + var64 & 0x3F) << 6) + (var56 + arg0 & 0x3F);
                                if (var63[var69] != null) {
                                    int var72 = var63[var69][var71];
                                    int var73 = var72 & 0x1FFF;
                                    if (var73 != 0) {
                                        class317 var74 = class246.method1757(2313, var73 - 1);
                                        int var75 = (var72 & 0x677C) >> 13;
                                        boolean var76 = (var72 >> 15 & 0x1) == 1;
                                        class326 var77 = var74.method2232(var75, var76, (byte) 104);
                                        if (var77 != null) {
                                            int var78 = var77.field4163 * var59 / 4;
                                            int var79 = var77.field4155 * var67 / 4;
                                            if (var74.field4933) {
                                                int var80 = var72 >> 20 & 0xF;
                                                int var81 = var72 >> 16 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var82 = var81;
                                                    var81 = var80;
                                                    var80 = var82;
                                                }
                                                var79 = var67 * var80;
                                                var78 = var59 * var81;
                                            }
                                            if (var78 != 0 && var79 != 0) {
                                                if (var74.field4925 == 0) {
                                                    var77.method2279(var60, var67 + var70 - var79, var78, var79);
                                                } else {
                                                    var77.method2282(var60, var70 + var67 - var79, var78, var79, var74.field4925);
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
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I", line = 559)
    public final int method1901(int arg0, int arg1) {
        if (arg1 > -97) {
            this.field4323 = (int[]) null;
        }
        field4324++;
        return this.field4323 == null || arg0 < 0 || arg0 > this.field4323.length ? -1 : this.field4323[arg0];
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(B)V", line = 577)
    public final void method1902(byte arg0) {
        if (this.field4331 != null) {
            for (int var2 = 0; var2 < this.field4331.length; var2++) {
                this.field4331[var2] = class122.method882(this.field4331[var2], 32768);
            }
        }
        field4327++;
        if (arg0 != -23) {
            this.field4317 = (String[]) null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(ILjj;)V", line = 601)
    public final void method1903(int arg0, class44 arg1) {
        while (true) {
            int var3 = arg1.method286((byte) -94);
            if (var3 == 0) {
                field4329++;
                if (arg0 != 1) {
                    method1904((class7) null, -41, -74, 9, 123, -42);
                }
                return;
            }
            this.method1906(arg1, (byte) 123, var3);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lj;IIIII)V", line = 621)
    public static final void method1904(class7 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class205.field3373 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class45.field633) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class158.field2618 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class204 var14 = class324.field5032[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class110.field1642[var11][var12 + 1][var13] + class110.field1642[var11][var12][var13] + class110.field1642[var11][var12][var13 + 1] + class110.field1642[var11][var12 + 1][var13 + 1]) / 4 - (class110.field1642[arg1][arg2 + 1][arg3] + class110.field1642[arg1][arg2][arg3] + class110.field1642[arg1][arg2][arg3 + 1] + class110.field1642[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class225 var16 = var14.field3364;
                                    if (var16 != null) {
                                        if (var16.field3599.method35()) {
                                            arg0.method40(var16.field3599, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3594 != null && var16.field3594.method35()) {
                                            arg0.method40(var16.field3594, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3360; var17++) {
                                        class153 var18 = var14.field3343[var17];
                                        if (var18 != null && var18.field2373.method35() && (var18.field2371 == var12 || var7 == var12) && (var18.field2366 == var13 || var9 == var13)) {
                                            int var19 = var18.field2355 + 1 - var18.field2371;
                                            int var20 = var18.field2361 + 1 - var18.field2366;
                                            arg0.method40(var18.field2373, (var18.field2371 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field2366 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IBI)I", line = 722)
    public final int method1905(int arg0, byte arg1, int arg2) {
        field4328++;
        if (this.field4323 == null || arg0 < 0 || this.field4323.length < arg0) {
            return -1;
        } else {
            if (arg1 <= 65) {
                method1900(78, -34, (byte) -11, -36, -126, -56, -3, -91, 15, -76, -30);
            }
            return this.field4326[arg0] == null || arg2 < 0 || this.field4326[arg0].length < arg2 ? -1 : this.field4326[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljj;BI)V", line = 740)
    private final void method1906(class44 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field4317 = class300.method2139(arg0.method265(0), -12496, '<');
        } else if (arg2 == 2) {
            int var8 = arg0.method286((byte) -119);
            this.field4331 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4331[var9] = arg0.method271(class152.method1101(arg1, 21026));
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method286((byte) -67);
            this.field4323 = new int[var4];
            this.field4326 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method271(arg1 + 20958);
                this.field4323[var5] = var6;
                this.field4326[var5] = new int[class286.field4584[var6]];
                for (int var7 = 0; var7 < class286.field4584[var6]; var7++) {
                    this.field4326[var5][var7] = arg0.method271(arg1 + 20958);
                }
            }
        } else if (arg2 == 4) {
            this.field4316 = false;
        }
        if (arg1 != 123) {
            this.field4316 = false;
        }
        field4319++;
    }
}
