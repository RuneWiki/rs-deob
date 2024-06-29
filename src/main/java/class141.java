import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class141 extends class64 {

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "[I")
    private int[] field3350 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wa", name = "fb", descriptor = "[S")
    private short[] field3356 = new short[6];

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public int field3351 = -1;

    @OriginalMember(owner = "client!wa", name = "tb", descriptor = "Z")
    public boolean field3370 = false;

    @OriginalMember(owner = "client!wa", name = "nb", descriptor = "[S")
    private short[] field3364 = new short[6];

    @OriginalMember(owner = "client!wa", name = "lb", descriptor = "Lrd;")
    public static class114 field3362 = class84.method656(" ", (byte) 126);

    @OriginalMember(owner = "client!wa", name = "qb", descriptor = "Lrd;")
    public static class114 field3367 = class84.method656("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", (byte) 120);

    @OriginalMember(owner = "client!wa", name = "rb", descriptor = "I")
    public static int field3368 = 0;

    @OriginalMember(owner = "client!wa", name = "ob", descriptor = "Lrd;")
    public static class114 field3365 = class84.method656("(U2", (byte) 126);

    @OriginalMember(owner = "client!wa", name = "cb", descriptor = "Lid;")
    public static class60 field3353 = new class60(8);

    @OriginalMember(owner = "client!wa", name = "ub", descriptor = "Lrd;")
    public static class114 field3371 = class84.method656("System)2Update in: ", (byte) 123);

    @OriginalMember(owner = "client!wa", name = "xb", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!wa", name = "yb", descriptor = "Lrd;")
    public static class114 field3375 = class84.method656("und haben es deaktiviert)3 Klicken Sie auf der", (byte) 121);

    @OriginalMember(owner = "client!wa", name = "Ab", descriptor = "Lrd;")
    private static class114 field3377 = class84.method656("Too many connections from your address)3", (byte) 127);

    @OriginalMember(owner = "client!wa", name = "vb", descriptor = "Lrd;")
    public static class114 field3372 = field3377;

    @OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
    public static int field3352;

    @OriginalMember(owner = "client!wa", name = "db", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!wa", name = "eb", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!wa", name = "hb", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!wa", name = "jb", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!wa", name = "kb", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!wa", name = "mb", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!wa", name = "pb", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!wa", name = "sb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!wa", name = "zb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!wa", name = "wb", descriptor = "[I")
    private int[] field3373;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)Z")
    public final boolean method1121(boolean arg0) {
        field3352++;
        if (this.field3373 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0) {
            field3368 = 57;
        }
        while (var3 < this.field3373.length) {
            if (!class116.field2703.method772(0, (byte) 62, this.field3373[var3])) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IJ)V")
    public static final void method1122(int arg0, long arg1) {
        field3357++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class104.method803(arg1 - 1L, (byte) -94);
            class104.method803(1L, (byte) -94);
        } else {
            class104.method803(arg1, (byte) -94);
        }
        if (arg0 != 17525) {
            method1129(45, null, false);
        }
    }

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "(I)V")
    public static final void method1123(int arg0) {
        field3363++;
        class114 var1 = null;
        for (int var2 = 0; var2 < class60.field1263; var2++) {
            if (class123.field2878[var2].method858((byte) 68, class24.field454) != -1) {
                var1 = class123.field2878[var2].method866(false, class123.field2878[var2].method858((byte) 91, class24.field454));
                break;
            }
        }
        if (var1 == null) {
            class24.method171(arg0 ^ 0xFFFFFF47);
            return;
        }
        int var3 = class131.field3165;
        int var4 = class86.field1930;
        int var5 = class132.field3190;
        if (arg0 < var5) {
            var5 = 190;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        int var6 = 6116423;
        int var7 = class143.field3414;
        class59.method434(var3, var4, var5, var7, var6);
        class59.method434(var3 + 1, var4 - -1, var5 - 2, 16, 0);
        class59.method427(var3 + 1, var4 - -18, var5 - 2, var7 + -19, 0);
        client.field399.method338(var1, var3 + 3, var4 + 14, var6, false);
        int var8 = class75.field1741;
        int var9 = class100.field2289;
        if (class14.field304 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class14.field304 == 1) {
            var8 -= 205;
            var9 -= 553;
        }
        if (class14.field304 == 2) {
            var8 -= 357;
            var9 -= 17;
        }
        for (int var10 = 0; var10 < class60.field1263; var10++) {
            int var11 = 16777215;
            int var12 = (class60.field1263 - var10 - 1) * 15 + var4 + 31;
            class114 var13 = class123.field2878[var10];
            if (var9 > var3 && var9 < var3 + var5 && var12 - 13 < var8 && var12 + 3 > var8) {
                var11 = 16776960;
            }
            if (var13.method859(-31152, var1)) {
                var13 = var13.method860(var13.method854(arg0 - 29538) - var1.method854(arg0 ^ 0xFFFF8DE2), -23745, 0);
                if (var13.method859(arg0 - 31342, class64.field1374)) {
                    var13 = var13.method860(var13.method854(-29348) - class64.field1374.method854(-29348), -23745, 0);
                }
            }
            client.field399.method338(var13, var3 + 3, var12, var11, true);
        }
    }

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "(I)Lkc;")
    public final class71 method1124(int arg0) {
        field3355++;
        if (this.field3373 == null) {
            return null;
        }
        class71[] var2 = new class71[this.field3373.length];
        if (arg0 != 31811) {
            return null;
        }
        for (int var3 = 0; var3 < this.field3373.length; var3++) {
            var2[var3] = class71.method577(class116.field2703, this.field3373[var3], 0);
        }
        class71 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class71(var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field3364[var5] != 0; var5++) {
            var4.method580(this.field3364[var5], this.field3356[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "(I)Z")
    public final boolean method1125(int arg0) {
        field3354++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field3350[var3] != -1 && !class116.field2703.method772(0, (byte) 62, this.field3350[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILid;I)V")
    private final void method1126(int arg0, class60 arg1, int arg2) {
        field3366++;
        if (arg2 > -105) {
            field3371 = null;
        }
        if (arg0 == 1) {
            this.field3351 = arg1.method462((byte) 116);
        } else if (arg0 == 2) {
            int var4 = arg1.method462((byte) 116);
            this.field3373 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3373[var5] = arg1.method467(255);
            }
            return;
        } else if (arg0 == 3) {
            this.field3370 = true;
            return;
        } else if (arg0 < 40 || arg0 >= 50) {
            if (arg0 >= 50 && arg0 < 60) {
                this.field3356[arg0 - 50] = (short) arg1.method467(255);
                return;
            }
            if (arg0 >= 60 && arg0 < 70) {
                this.field3350[arg0 - 60] = arg1.method467(255);
                return;
            }
        } else {
            this.field3364[arg0 - 40] = (short) arg1.method467(255);
            return;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)Ln;")
    public static final class86 method1127(int arg0, int arg1) {
        if (arg1 != -1) {
            method1127(-2, 76);
        }
        class86 var2 = (class86) class124.field2956.method194((byte) -84, (long) arg0);
        field3360++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class56.field1173.method762(16, arg0, (byte) 66);
        class86 var4 = new class86();
        if (var3 != null) {
            var4.method659(new class60(var3), (byte) -107);
        }
        class124.field2956.method193(-128, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(B)V")
    public static void method1128(byte arg0) {
        field3377 = null;
        field3372 = null;
        field3353 = null;
        field3365 = null;
        field3367 = null;
        if (arg0 >= -87) {
            field3372 = null;
        }
        field3371 = null;
        field3362 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1129(int arg0, byte[] arg1, boolean arg2) {
        field3359++;
        if (arg0 <= 93) {
            method1127(93, -109);
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136) {
            try {
                class14 var3 = (class14) Class.forName("qa").getDeclaredConstructor().newInstance();
                var3.method116(21370, arg1);
                return var3;
            } catch (Throwable var4) {
            }
        }
        return arg2 ? class121.method946(arg1, -16044) : arg1;
    }

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "(I)Lkc;")
    public final class71 method1130(int arg0) {
        field3369++;
        class71[] var2 = new class71[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3350[var4] != -1) {
                var2[var3++] = class71.method577(class116.field2703, this.field3350[var4], 0);
            }
        }
        int var5 = -101 % ((arg0 + 30) / 37);
        class71 var6 = new class71(var2, var3);
        for (int var7 = 0; var7 < 6 && this.field3364[var7] != 0; var7++) {
            var6.method580(this.field3364[var7], this.field3356[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILnc;IIIIIIILua;)V")
    public static final void method1131(int arg0, class89 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class129 arg9) {
        field3361++;
        int var10 = class124.field2958[arg8][arg5][arg0];
        int var11 = class124.field2958[arg8][arg5 + 1][arg0];
        int var12 = class124.field2958[arg8][arg5 + 1][arg0 + 1];
        int var13 = class124.field2958[arg8][arg5][arg0 + 1];
        class12 var14 = class130.method1048(-94, arg3);
        int var15 = var10 + var13 + var11 + var12 >> 2;
        int var16 = (arg2 << 6) + arg4;
        int var17 = (arg3 << 14) + (arg0 << 7) + arg5 + 1073741824;
        if (var14.field234 == 1) {
            var16 += 256;
        }
        if (var14.field244 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (arg4 == 22) {
            class50 var18;
            if (var14.field216 == -1 && var14.field241 == null) {
                var18 = var14.method98((byte) 61, arg2, var10, var11, 22, var12, var13);
            } else {
                var18 = new class123(arg3, 22, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1021(arg6, arg5, arg0, var15, var18, var17, var16);
            if (var14.field214 && var14.field244 == 1) {
                arg1.method674(arg5, arg0, (byte) -38);
            }
            return;
        }
        int var19 = 76 / ((32 - arg7) / 43);
        if (arg4 == 10 || arg4 == 11) {
            class50 var39;
            if (var14.field216 == -1 && var14.field241 == null) {
                var39 = var14.method98((byte) 122, arg2, var10, var11, 10, var12, var13);
            } else {
                var39 = new class123(arg3, 10, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            if (var39 != null) {
                int var40;
                int var41;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var14.field261;
                    var41 = var14.field277;
                } else {
                    var40 = var14.field277;
                    var41 = var14.field261;
                }
                int var42 = 0;
                if (arg4 == 11) {
                    var42 += 256;
                }
                arg9.method1003(arg6, arg5, arg0, var15, var40, var41, var39, var42, var17, var16);
            }
            if (var14.field214) {
                arg1.method678(var14.field261, 20850, var14.field277, arg5, var14.field252, arg2, arg0);
            }
        } else if (arg4 >= 12) {
            class50 var20;
            if (var14.field216 == -1 && var14.field241 == null) {
                var20 = var14.method98((byte) -106, arg2, var10, var11, arg4, var12, var13);
            } else {
                var20 = new class123(arg3, arg4, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1003(arg6, arg5, arg0, var15, 1, 1, var20, 0, var17, var16);
            if (var14.field214) {
                arg1.method678(var14.field261, 20850, var14.field277, arg5, var14.field252, arg2, arg0);
            }
        } else if (arg4 == 0) {
            class50 var21;
            if (var14.field216 == -1 && var14.field241 == null) {
                var21 = var14.method98((byte) -79, arg2, var10, var11, 0, var12, var13);
            } else {
                var21 = new class123(arg3, 0, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1029(arg6, arg5, arg0, var15, var21, null, class46.field948[arg2], 0, var17, var16);
            if (var14.field214) {
                arg1.method670(arg0, arg5, var14.field252, (byte) -102, arg4, arg2);
            }
        } else if (arg4 == 1) {
            class50 var22;
            if (var14.field216 == -1 && var14.field241 == null) {
                var22 = var14.method98((byte) 97, arg2, var10, var11, 1, var12, var13);
            } else {
                var22 = new class123(arg3, 1, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1029(arg6, arg5, arg0, var15, var22, null, class124.field2957[arg2], 0, var17, var16);
            if (var14.field214) {
                arg1.method670(arg0, arg5, var14.field252, (byte) -102, arg4, arg2);
            }
        } else if (arg4 == 2) {
            int var23 = arg2 + 1 & 0x3;
            class50 var24;
            class50 var25;
            if (var14.field216 == -1 && var14.field241 == null) {
                var24 = var14.method98((byte) -96, arg2 + 4, var10, var11, 2, var12, var13);
                var25 = var14.method98((byte) -42, var23, var10, var11, 2, var12, var13);
            } else {
                var24 = new class123(arg3, 2, arg2 + 4, var10, var11, var12, var13, var14.field216, true, null);
                var25 = new class123(arg3, 2, var23, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1029(arg6, arg5, arg0, var15, var24, var25, class46.field948[arg2], class46.field948[var23], var17, var16);
            if (var14.field214) {
                arg1.method670(arg0, arg5, var14.field252, (byte) -102, arg4, arg2);
            }
        } else if (arg4 == 3) {
            class50 var26;
            if (var14.field216 == -1 && var14.field241 == null) {
                var26 = var14.method98((byte) 66, arg2, var10, var11, 3, var12, var13);
            } else {
                var26 = new class123(arg3, 3, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1029(arg6, arg5, arg0, var15, var26, null, class124.field2957[arg2], 0, var17, var16);
            if (var14.field214) {
                arg1.method670(arg0, arg5, var14.field252, (byte) -102, arg4, arg2);
            }
        } else if (arg4 == 9) {
            class50 var27;
            if (var14.field216 == -1 && var14.field241 == null) {
                var27 = var14.method98((byte) 90, arg2, var10, var11, arg4, var12, var13);
            } else {
                var27 = new class123(arg3, arg4, arg2, var10, var11, var12, var13, var14.field216, true, null);
            }
            arg9.method1003(arg6, arg5, arg0, var15, 1, 1, var27, 0, var17, var16);
            if (var14.field214) {
                arg1.method678(var14.field261, 20850, var14.field277, arg5, var14.field252, arg2, arg0);
            }
        } else {
            if (var14.field237) {
                if (arg2 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg2 == 2) {
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                    int var31 = var12;
                    var12 = var10;
                    var10 = var31;
                } else if (arg2 == 3) {
                    int var29 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var29;
                }
            }
            if (arg4 == 4) {
                class50 var32;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var32 = var14.method98((byte) 124, 0, var10, var11, 4, var12, var13);
                } else {
                    var32 = new class123(arg3, 4, 0, var10, var11, var12, var13, var14.field216, true, null);
                }
                arg9.method993(arg6, arg5, arg0, var15, var32, class46.field948[arg2], arg2 * 512, 0, 0, var17, var16);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg9.method1034(arg6, arg5, arg0);
                if (var34 != 0) {
                    var33 = class130.method1048(-126, var34 >> 14 & 0x7FFF).field251;
                }
                class50 var35;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var35 = var14.method98((byte) -82, 0, var10, var11, 4, var12, var13);
                } else {
                    var35 = new class123(arg3, 4, 0, var10, var11, var12, var13, var14.field216, true, null);
                }
                arg9.method993(arg6, arg5, arg0, var15, var35, class46.field948[arg2], arg2 * 512, class7.field94[arg2] * var33, class32.field662[arg2] * var33, var17, var16);
            } else if (arg4 == 6) {
                class50 var36;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var36 = var14.method98((byte) 87, 0, var10, var11, 4, var12, var13);
                } else {
                    var36 = new class123(arg3, 4, 0, var10, var11, var12, var13, var14.field216, true, null);
                }
                arg9.method993(arg6, arg5, arg0, var15, var36, 256, arg2, 0, 0, var17, var16);
            } else if (arg4 == 7) {
                class50 var37;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var37 = var14.method98((byte) 74, 0, var10, var11, 4, var12, var13);
                } else {
                    var37 = new class123(arg3, 4, 0, var10, var11, var12, var13, var14.field216, true, null);
                }
                arg9.method993(arg6, arg5, arg0, var15, var37, 512, arg2, 0, 0, var17, var16);
            } else if (arg4 == 8) {
                class50 var38;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var38 = var14.method98((byte) 107, 0, var10, var11, 4, var12, var13);
                } else {
                    var38 = new class123(arg3, 4, 0, var10, var11, var12, var13, var14.field216, true, null);
                }
                arg9.method993(arg6, arg5, arg0, var15, var38, 768, arg2, 0, 0, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(IILpb;)Z")
    public static final boolean method1132(int arg0, int arg1, class100 arg2) {
        field3376++;
        if (arg1 != 512) {
            method1123(103);
        }
        byte[] var3 = arg2.method756(0, arg0);
        if (var3 == null) {
            return false;
        } else {
            class101.method785(80, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILid;)V")
    public final void method1133(int arg0, class60 arg1) {
        field3358++;
        if (arg0 != -7) {
            this.field3370 = false;
        }
        while (true) {
            int var3 = arg1.method462((byte) 116);
            if (var3 == 0) {
                return;
            }
            this.method1126(var3, arg1, arg0 - 105);
        }
    }
}
