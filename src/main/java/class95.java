import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class95 extends class120 {

    @OriginalMember(owner = "client!q", name = "lb", descriptor = "I")
    private int field2133 = 0;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "Lva;")
    public static class121 field2115 = class107.method797("@whi@", -10983);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field2120 = 0;

    @OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
    public static int field2127 = 3353893;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!q", name = "ib", descriptor = "I")
    public static int field2130 = 128;

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "Lva;")
    public static class121 field2124 = class107.method797("headicons_hint", -10983);

    @OriginalMember(owner = "client!q", name = "M", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!q", name = "N", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "I")
    public int field2114;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!q", name = "X", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!q", name = "gb", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!q", name = "hb", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!q", name = "jb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!q", name = "kb", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!q", name = "mb", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!q", name = "nb", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!q", name = "O", descriptor = "[Lbc;")
    public static class10[] field2111;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ltc;ZI)V", line = 14)
    public final void method634(class113 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method821(true);
            if (var4 == 0) {
                if (arg1) {
                    return;
                }
                field2125++;
                return;
            }
            this.method641(arg2, var4, arg0, -15913);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II[BB)I", line = 41)
    public static final int method635(int arg0, int arg1, byte[] arg2, byte arg3) {
        field2116++;
        int var4 = 106 % ((-arg3 - 10) / 47);
        int var5 = -1;
        for (int var6 = arg0; var6 < arg1; var6++) {
            var5 = var5 >>> 8 ^ class78.field1819[(var5 ^ arg2[var6]) & 0xFF];
        }
        return ~var5;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Lva;", line = 63)
    public static final class121 method636(int arg0, long arg1) {
        field2135++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class114.field2596[(int) (var8 - arg1 * 37L)];
            }
            class121 var7 = new class121();
            var7.field2817 = var6;
            var7.field2783 = var6.length;
            if (arg0 != -3) {
                field2111 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIIIIIBII)V", line = 106)
    public static final void method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field2117++;
        if (arg7 != 17) {
            field2127 = 85;
        }
        class25 var10 = null;
        for (class25 var11 = (class25) class67.field1607.method57((byte) 86); var11 != null; var11 = (class25) class67.field1607.method66(arg7 ^ 0xFFFF8B4D)) {
            if (var11.field618 == arg5 && var11.field627 == arg1 && var11.field633 == arg9 && var11.field624 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class25();
            var10.field624 = arg0;
            var10.field633 = arg9;
            var10.field618 = arg5;
            var10.field627 = arg1;
            class21.method183(-26017, var10);
            class67.field1607.method64(var10, (byte) 79);
        }
        var10.field639 = arg3;
        var10.field647 = arg8;
        var10.field646 = arg6;
        var10.field622 = arg2;
        var10.field629 = arg4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(II)V", line = 148)
    private final void method638(int arg0, int arg1) {
        field2121++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = var3;
        double var9 = 0.0D;
        double var11 = var3;
        if (var5 < var3) {
            var11 = var5;
        }
        double var13 = (double) (arg1 & 0xFF) / 256.0D;
        if (var5 > var3) {
            var7 = var5;
        }
        if (var13 < var11) {
            var11 = var13;
        }
        if (var13 > var7) {
            var7 = var13;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        if (arg0 > -58) {
            method640((byte) 41);
        }
        this.field2109 = (int) (var17 * 256.0D);
        if (var7 != var11) {
            if (var3 == var7) {
                var9 = (var5 - var13) / (var7 - var11);
            } else if (var5 == var7) {
                var9 = (var13 - var3) / (-var11 + var7) + 2.0D;
            } else if (var7 == var13) {
                var9 = (var3 - var5) / (-var11 + var7) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var7 - var11) / (var7 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var7 - var11) / (2.0D - var7 - var11);
            }
        }
        if (this.field2109 < 0) {
            this.field2109 = 0;
        } else if (this.field2109 > 255) {
            this.field2109 = 255;
        }
        this.field2113 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field2132 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2132 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2113 < 0) {
            this.field2113 = 0;
        } else if (this.field2113 > 255) {
            this.field2113 = 255;
        }
        if (this.field2132 < 1) {
            this.field2132 = 1;
        }
        double var19 = var9 / 6.0D;
        this.field2114 = (int) ((double) this.field2132 * var19);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 242)
    public static void method639(int arg0) {
        field2115 = null;
        if (arg0 >= -7) {
            field2126 = 94;
        }
        field2124 = null;
        field2111 = null;
    }

    @OriginalMember(owner = "client!q", name = "e", descriptor = "(B)Lc;", line = 258)
    public static final class13 method640(byte arg0) {
        if (arg0 != 78) {
            field2115 = null;
        }
        field2112++;
        try {
            return (class13) Class.forName("b").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class14();
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IILtc;I)V", line = 274)
    private final void method641(int arg0, int arg1, class113 arg2, int arg3) {
        if (arg3 != -15913) {
            method643(-30, -117, true);
        }
        field2118++;
        if (arg1 == 1) {
            this.field2133 = arg2.method848(arg3 ^ 0xFF00C1D7);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lva;Lva;Lhe;I)Lub;", line = 301)
    public static final class117 method642(class121 arg0, class121 arg1, class47 arg2, int arg3) {
        field2128++;
        int var4 = arg2.method332(arg1, -22814);
        int var5 = arg2.method337(var4, (byte) 57, arg0);
        if (arg3 != -1) {
            method639(-11);
        }
        return class67.method472((byte) 115, var4, var5, arg2);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZ)V", line = 316)
    public static final void method643(int arg0, int arg1, boolean arg2) {
        class9 var3 = class14.field249[class121.field2807][arg0][arg1];
        field2122++;
        if (arg2) {
            return;
        }
        if (var3 == null) {
            class58.field1348.method765(class121.field2807, arg0, arg1);
            return;
        }
        class23 var4 = null;
        int var5 = -99999999;
        for (class23 var6 = (class23) var3.method57((byte) 86); var6 != null; var6 = (class23) var3.method66(-29860)) {
            class119 var11 = class114.method872((byte) 121, var6.field598);
            int var12 = var11.field2724;
            if (var11.field2701) {
                var12 = (var6.field593 + 1) * var12;
            }
            if (var5 < var12) {
                var4 = var6;
                var5 = var12;
            }
        }
        var3.method63(var4, 1);
        class23 var7 = (class23) var3.method57((byte) 86);
        class23 var8 = null;
        class23 var9 = null;
        while (var7 != null) {
            if (var4.field598 != var7.field598 && var8 == null) {
                var8 = var7;
            }
            if (var4.field598 != var7.field598 && var7.field598 != var8.field598 && var9 == null) {
                var9 = var7;
            }
            var7 = (class23) var3.method66(-29860);
        }
        int var10 = (arg1 << 7) + arg0 + 1610612736;
        class58.field1348.method737(class121.field2807, arg0, arg1, class47.method340(arg0 * 128 + 64, -6, class121.field2807, arg1 * 128 + 64), var4, var10, var8, var9);
    }

    @OriginalMember(owner = "client!q", name = "f", descriptor = "(B)V", line = 384)
    public final void method644(byte arg0) {
        if (arg0 < 19) {
            method640((byte) -26);
        }
        field2119++;
        this.method638(-125, this.field2133);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(IJ)V", line = 395)
    public static final void method645(int arg0, long arg1) {
        field2134++;
        if (arg1 == 0L) {
            return;
        }
        if (class8.field119 >= 100 && class85.field1967 != 1 || class8.field119 >= 200) {
            class62.method448(class18.field415, class107.field2443, 0, false);
            return;
        }
        class121 var3 = method636(-3, arg1).method963(-14767);
        for (int var4 = 0; var4 < class8.field119; var4++) {
            if (class92.field2092[var4] == arg1) {
                class62.method448(class18.field415, class113.method866((byte) -59, new class121[] { var3, class4.field73 }), 0, false);
                return;
            }
        }
        if (arg0 >= -112) {
            field2127 = 90;
        }
        for (int var5 = 0; var5 < class97.field2169; var5++) {
            if (class69.field1650[var5] == arg1) {
                class62.method448(class18.field415, class113.method866((byte) -74, new class121[] { class19.field465, var3, class115.field2627 }), 0, false);
                return;
            }
        }
        if (var3.method954(class62.field1494.field1766, 17706)) {
            return;
        }
        class128.field2962[class8.field119] = var3;
        class129.field2972++;
        class92.field2092[class8.field119] = arg1;
        class41.field951[class8.field119] = 0;
        class8.field119++;
        class97.field2168 = true;
        class60.field1437.method622(85, true);
        class60.field1437.method835(false, arg1);
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(I)I", line = 462)
    public static final int method646(int arg0) {
        field2129++;
        int var1 = -75 / ((43 - arg0) / 44);
        return 5;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILcb;IIIILrc;I)V", line = 476)
    public static final void method647(int arg0, int arg1, int arg2, class15 arg3, int arg4, int arg5, int arg6, int arg7, class103 arg8, int arg9) {
        field2131++;
        int var10 = class45.field1058[arg2][arg5 + 1][arg0];
        int var11 = class45.field1058[arg2][arg5][arg0];
        int var12 = class45.field1058[arg2][arg5 + 1][arg0 + 1];
        int var13 = class45.field1058[arg2][arg5][arg0 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        int var15 = (arg6 << 6) + arg9;
        class59 var16 = class20.method179(6, arg4);
        int var17 = arg5 + (arg0 << 7) + (arg4 << 14) + 1073741824;
        if (var16.field1397 == arg7) {
            var15 += 256;
        }
        if (var16.field1373 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg9 == 22) {
            class85 var18;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var18 = var16.method433(arg7 - 74, var11, var13, arg6, 22, var10, var12);
            } else {
                var18 = new class128(arg4, 22, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method749(arg1, arg5, arg0, var14, var18, var17, var15);
            if (var16.field1370 && var16.field1373 == 1) {
                arg3.method125(arg5, -128, arg0);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class85 var38;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var38 = var16.method433(arg7 - 74, var11, var13, arg6, 10, var10, var12);
            } else {
                var38 = new class128(arg4, 10, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg9 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var16.field1387;
                    var41 = var16.field1371;
                } else {
                    var40 = var16.field1371;
                    var41 = var16.field1387;
                }
                arg8.method734(arg1, arg5, arg0, var14, var40, var41, var38, var39, var17, var15);
            }
            if (var16.field1370) {
                arg3.method113(-2, arg0, var16.field1374, arg6, arg5, var16.field1371, var16.field1387);
            }
        } else if (arg9 >= 12) {
            class85 var19;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var19 = var16.method433(-73, var11, var13, arg6, arg9, var10, var12);
            } else {
                var19 = new class128(arg4, arg9, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method734(arg1, arg5, arg0, var14, 1, 1, var19, 0, var17, var15);
            if (var16.field1370) {
                arg3.method113(arg7 - 3, arg0, var16.field1374, arg6, arg5, var16.field1371, var16.field1387);
            }
        } else if (arg9 == 0) {
            class85 var20;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var20 = var16.method433(arg7 ^ 0xFFFFFFB6, var11, var13, arg6, 0, var10, var12);
            } else {
                var20 = new class128(arg4, 0, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method743(arg1, arg5, arg0, var14, var20, null, class64.field1558[arg6], 0, var17, var15);
            if (var16.field1370) {
                arg3.method126(arg9, arg5, arg0, var16.field1374, arg6, (byte) 120);
            }
        } else if (arg9 == 1) {
            class85 var21;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var21 = var16.method433(-73, var11, var13, arg6, 1, var10, var12);
            } else {
                var21 = new class128(arg4, 1, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method743(arg1, arg5, arg0, var14, var21, null, class84.field1946[arg6], 0, var17, var15);
            if (var16.field1370) {
                arg3.method126(arg9, arg5, arg0, var16.field1374, arg6, (byte) -113);
            }
        } else if (arg9 == 2) {
            int var22 = arg6 + 1 & 0x3;
            class85 var23;
            class85 var24;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var23 = var16.method433(-73, var11, var13, arg6 + 4, 2, var10, var12);
                var24 = var16.method433(-73, var11, var13, var22, 2, var10, var12);
            } else {
                var23 = new class128(arg4, 2, arg6 + 4, var11, var10, var12, var13, var16.field1383, true);
                var24 = new class128(arg4, 2, var22, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method743(arg1, arg5, arg0, var14, var23, var24, class64.field1558[arg6], class64.field1558[var22], var17, var15);
            if (var16.field1370) {
                arg3.method126(arg9, arg5, arg0, var16.field1374, arg6, (byte) 17);
            }
        } else if (arg9 == 3) {
            class85 var25;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var25 = var16.method433(-73, var11, var13, arg6, 3, var10, var12);
            } else {
                var25 = new class128(arg4, 3, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method743(arg1, arg5, arg0, var14, var25, null, class84.field1946[arg6], 0, var17, var15);
            if (var16.field1370) {
                arg3.method126(arg9, arg5, arg0, var16.field1374, arg6, (byte) -50);
            }
        } else if (arg9 == 9) {
            class85 var26;
            if (var16.field1383 == -1 && var16.field1363 == null) {
                var26 = var16.method433(arg7 ^ 0xFFFFFFB6, var11, var13, arg6, arg9, var10, var12);
            } else {
                var26 = new class128(arg4, arg9, arg6, var11, var10, var12, var13, var16.field1383, true);
            }
            arg8.method734(arg1, arg5, arg0, var14, 1, 1, var26, 0, var17, var15);
            if (var16.field1370) {
                arg3.method113(-2, arg0, var16.field1374, arg6, arg5, var16.field1371, var16.field1387);
            }
        } else {
            if (var16.field1375) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var10;
                    var10 = var28;
                    int var29 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var12;
                    var12 = var30;
                }
            }
            if (arg9 == 4) {
                class85 var31;
                if (var16.field1383 == -1 && var16.field1363 == null) {
                    var31 = var16.method433(-73, var11, var13, 0, 4, var10, var12);
                } else {
                    var31 = new class128(arg4, 4, 0, var11, var10, var12, var13, var16.field1383, true);
                }
                arg8.method759(arg1, arg5, arg0, var14, var31, class64.field1558[arg6], arg6 * 512, 0, 0, var17, var15);
            } else if (arg9 == 5) {
                int var32 = arg8.method739(arg1, arg5, arg0);
                int var33 = 16;
                if (var32 > 0) {
                    var33 = class20.method179(6, var32 >> 14 & 0x7FFF).field1399;
                }
                class85 var34;
                if (var16.field1383 == -1 && var16.field1363 == null) {
                    var34 = var16.method433(arg7 ^ 0xFFFFFFB6, var11, var13, 0, 4, var10, var12);
                } else {
                    var34 = new class128(arg4, 4, 0, var11, var10, var12, var13, var16.field1383, true);
                }
                arg8.method759(arg1, arg5, arg0, var14, var34, class64.field1558[arg6], arg6 * 512, class127.field2903[arg6] * var33, class28.field718[arg6] * var33, var17, var15);
            } else if (arg9 == 6) {
                class85 var35;
                if (var16.field1383 == -1 && var16.field1363 == null) {
                    var35 = var16.method433(-73, var11, var13, 0, 4, var10, var12);
                } else {
                    var35 = new class128(arg4, 4, 0, var11, var10, var12, var13, var16.field1383, true);
                }
                arg8.method759(arg1, arg5, arg0, var14, var35, 256, arg6, 0, 0, var17, var15);
            } else if (arg9 == 7) {
                class85 var36;
                if (var16.field1383 == -1 && var16.field1363 == null) {
                    var36 = var16.method433(arg7 - 74, var11, var13, 0, 4, var10, var12);
                } else {
                    var36 = new class128(arg4, 4, 0, var11, var10, var12, var13, var16.field1383, true);
                }
                arg8.method759(arg1, arg5, arg0, var14, var36, 512, arg6, 0, 0, var17, var15);
            } else if (arg9 == 8) {
                class85 var37;
                if (var16.field1383 == -1 && var16.field1363 == null) {
                    var37 = var16.method433(arg7 ^ 0xFFFFFFB6, var11, var13, 0, 4, var10, var12);
                } else {
                    var37 = new class128(arg4, 4, 0, var11, var10, var12, var13, var16.field1383, true);
                }
                arg8.method759(arg1, arg5, arg0, var14, var37, 768, arg6, 0, 0, var17, var15);
            }
        }
    }
}
