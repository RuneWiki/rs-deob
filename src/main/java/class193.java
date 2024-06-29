import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class193 {

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[B")
    private byte[] field3735;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    private int[] field3738;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
    private int[] field3744;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Leh;")
    public static class47 field3734 = class195.method1282((byte) -4, "Neuer Benutzer");

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Leh;")
    private static class47 field3733 = class195.method1282((byte) -4, "glow2:");

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    public static int field3740 = -1;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "Leh;")
    public static class47 field3732 = field3733;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "Z")
    public static boolean field3746 = false;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "Leh;")
    public static class47 field3750 = class195.method1282((byte) -4, ":trade:");

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Leh;")
    public static class47 field3747 = class195.method1282((byte) -4, "<col=00ff00>");

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "Leh;")
    private static class47 field3739 = class195.method1282((byte) -4, " from your ignore list first)3");

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "J")
    public static long field3752 = 0L;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Leh;")
    public static class47 field3741 = field3739;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Leh;")
    public static class47 field3743 = field3733;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Leh;")
    private static class47 field3737 = class195.method1282((byte) -4, "Loaded config");

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "Leh;")
    public static class47 field3736 = field3737;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([BI[BBII)I")
    public final int method1264(byte[] arg0, int arg1, byte[] arg2, byte arg3, int arg4, int arg5) {
        int var7 = arg1 + arg5;
        field3751++;
        int var8 = 0;
        int var9 = arg4 << 3;
        if (arg3 != 66) {
            method1265(-19, null, -13, 6, -125);
        }
        while (arg1 < var7) {
            int var10 = arg2[arg1] & 0xFF;
            int var11 = this.field3744[var10];
            byte var12 = this.field3735[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class57.method495(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILgf;III)V")
    public static final void method1265(int arg0, class61 arg1, int arg2, int arg3, int arg4) {
        field3745++;
        class126.method951((byte) -127);
        class169.method1147(arg4, arg2, arg1.field1187 + arg4, arg2 - -arg1.field1303);
        if (class20.field385 == 2 || class20.field385 == 5) {
            class169.method1155(arg4, arg2, 0, arg1.field1285, arg1.field1296);
        } else {
            int var5 = 464 - class123.field2489.field3281 / 32;
            int var6 = class160.field3116 + class195.field3793 & 0x7FF;
            int var7 = class123.field2489.field3291 / 32 + 48;
            class5.field84.method431(arg4, arg2, arg1.field1187, arg1.field1303, var7, var5, var6, class60.field1167 + 256, arg1.field1285, arg1.field1296);
            for (int var8 = 0; var8 < class92.field1930; var8++) {
                int var38 = class153.field3007[var8] * 4 + 2 - class123.field2489.field3291 / 32;
                int var39 = class52.field1002[var8] * 4 + 2 - class123.field2489.field3281 / 32;
                class140.method1014(-93, arg1, var39, arg2, class187.field3598[var8], arg4, var38);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var34 = 0; var34 < 104; var34++) {
                    class40 var35 = class31.field597[class196.field3827][var9][var34];
                    if (var35 != null) {
                        int var36 = var9 * 4 + 2 - class123.field2489.field3291 / 32;
                        int var37 = var34 * 4 + 2 - class123.field2489.field3281 / 32;
                        class140.method1014(51, arg1, var37, arg2, class167.field3239[0], arg4, var36);
                    }
                }
            }
            for (int var10 = 0; var10 < class80.field1727; var10++) {
                class72 var30 = class133.field2626[class136.field2666[var10]];
                if (var30 != null && var30.method280(-106)) {
                    class56 var31 = var30.field1547;
                    if (var31 != null && var31.field1074 != null) {
                        var31 = var31.method485((byte) -76);
                    }
                    if (var31 != null && var31.field1078 && var31.field1067) {
                        int var32 = var30.field3291 / 32 - class123.field2489.field3291 / 32;
                        int var33 = var30.field3281 / 32 - class123.field2489.field3281 / 32;
                        class140.method1014(119, arg1, var33, arg2, class167.field3239[1], arg4, var32);
                    }
                }
            }
            for (int var11 = 0; var11 < class130.field2575; var11++) {
                class32 var22 = class40.field795[class146.field2853[var11]];
                if (var22 != null && var22.method280(-97)) {
                    int var23 = var22.field3291 / 32 - class123.field2489.field3291 / 32;
                    int var24 = var22.field3281 / 32 - class123.field2489.field3281 / 32;
                    long var25 = var22.field598.method399(126);
                    boolean var27 = false;
                    for (int var28 = 0; var28 < class77.field1679; var28++) {
                        if (class31.field593[var28] == var25 && class132.field2608[var28] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var29 = false;
                    if (class123.field2489.field611 != 0 && var22.field611 != 0 && class123.field2489.field611 == var22.field611) {
                        var29 = true;
                    }
                    if (var27) {
                        class140.method1014(45, arg1, var24, arg2, class167.field3239[3], arg4, var23);
                    } else if (var29) {
                        class140.method1014(42, arg1, var24, arg2, class167.field3239[4], arg4, var23);
                    } else {
                        class140.method1014(43, arg1, var24, arg2, class167.field3239[2], arg4, var23);
                    }
                }
            }
            if (class95.field1958 != 0 && class18.field362 % 20 < 10) {
                if (class95.field1958 == 1 && class26.field497 >= 0 && class26.field497 < class133.field2626.length) {
                    class72 var12 = class133.field2626[class26.field497];
                    if (var12 != null) {
                        int var13 = var12.field3291 / 32 - class123.field2489.field3291 / 32;
                        int var14 = var12.field3281 / 32 - class123.field2489.field3281 / 32;
                        class144.method1026(var14, var13, 18487, arg4, arg2, arg1, class86.field1831[1]);
                    }
                }
                if (class95.field1958 == 2) {
                    int var15 = (class97.field2054 - class34.field649) * 4 + 2 - class123.field2489.field3281 / 32;
                    int var16 = (class166.field3217 - class127.field2536) * 4 + 2 - class123.field2489.field3291 / 32;
                    class144.method1026(var15, var16, 18487, arg4, arg2, arg1, class86.field1831[1]);
                }
                if (class95.field1958 == 10 && class82.field1762 >= 0 && class40.field795.length > class82.field1762) {
                    class32 var17 = class40.field795[class82.field1762];
                    if (var17 != null) {
                        int var18 = var17.field3281 / 32 - class123.field2489.field3281 / 32;
                        int var19 = var17.field3291 / 32 - class123.field2489.field3291 / 32;
                        class144.method1026(var18, var19, 18487, arg4, arg2, arg1, class86.field1831[1]);
                    }
                }
            }
            if (class25.field488 != 0) {
                int var20 = class25.field488 * 4 + 2 - class123.field2489.field3291 / 32;
                int var21 = class47.field926 * 4 + 2 - class123.field2489.field3281 / 32;
                class140.method1014(-87, arg1, var21, arg2, class86.field1831[0], arg4, var20);
            }
            class169.method1149(arg1.field1187 / 2 + arg4 - 1, arg1.field1303 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        if (arg0 < 84) {
            field3746 = true;
        }
        class137.field2679[arg3] = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public static void method1266(int arg0) {
        field3734 = null;
        field3750 = null;
        field3741 = null;
        field3737 = null;
        field3733 = null;
        field3747 = null;
        field3739 = null;
        field3736 = null;
        if (arg0 != 16295) {
            method1265(-75, null, -119, -3, -84);
        }
        field3732 = null;
        field3743 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI[B[BII)I")
    public final int method1267(boolean arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field3748++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg4 + arg5;
        int var8 = 0;
        int var9 = arg1;
        if (!arg0) {
            return -70;
        }
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field3738[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var11;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var12;
            if ((var12 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var12;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var13;
            if ((var13 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var13;
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var14;
            if ((var14 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var14;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var15;
            if ((var15 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var15;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var16;
            if ((var16 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var16;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var17;
            if ((var17 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var17;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3738[var8];
            }
            int var18;
            if ((var18 = this.field3738[var8]) < 0) {
                arg3[arg5++] = (byte) ~var18;
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)Z")
    public static final boolean method1268(int arg0, int arg1) {
        field3749++;
        if (arg1 == 1) {
            return (arg0 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
    public class193(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field3735 = arg0;
        this.field3738 = new int[8];
        this.field3744 = new int[var3];
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field3744[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class57.method495(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3738[var14] == 0) {
                            this.field3738[var14] = var4;
                        }
                        var14 = this.field3738[var14];
                    }
                    if (var14 >= this.field3738.length) {
                        int[] var17 = new int[this.field3738.length * 2];
                        for (int var18 = 0; var18 < this.field3738.length; var18++) {
                            var17[var18] = this.field3738[var18];
                        }
                        this.field3738 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field3738[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B[Leh;)[Leh;")
    public static final class47[] method1269(byte arg0, class47[] arg1) {
        field3742++;
        class47[] var2 = new class47[5];
        if (arg0 != 31) {
            return null;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class5.method24(new class47[] { class167.method1133(var3, (byte) -118), class55.field1054 }, (byte) 88);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class5.method24(new class47[] { var2[var3], arg1[var3] }, (byte) 64);
            }
        }
        return var2;
    }
}
