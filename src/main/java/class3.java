import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
    private int field105 = 0;

    @OriginalMember(owner = "client!pd", name = "x", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[Lvb;")
    public class60[] field86;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field81 = -1;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "[I")
    public static int[] field94 = new int[14];

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "I")
    public static int field99 = -1;

    @OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "J")
    private long field90;

    @OriginalMember(owner = "client!pd", name = "w", descriptor = "Llg;")
    public static class132 field102;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "Lvb;")
    private class60 field106;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "Lvb;")
    private class60 field96;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "[Lvd;")
    public static class144[] field97;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[[[B")
    public static byte[][][] field95;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)[Leg;", line = 4)
    public static final class317[] method70(boolean arg0) {
        field98++;
        class317[] var1 = new class317[class89.field1426];
        for (int var2 = 0; var2 < class89.field1426; var2++) {
            int var3 = class83.field1288[var2] * class309.field4887[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class207.field3277[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class260.field3873[class164.method1234(255, var5[var6])];
            }
            var1[var2] = new class317(class185.field2926, class112.field1821, class61.field892[var2], class183.field2902[var2], class309.field4887[var2], class83.field1288[var2], var4);
        }
        if (!arg0) {
            method80(117, 73, -106, -26, true, 62, -87, (byte[]) null, 17, 62, (class53[]) null);
        }
        class260.method1796(1952227009);
        return var1;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)Lvb;", line = 40)
    public final class60 method71(byte arg0) {
        if (arg0 != -93) {
            this.method71((byte) -60);
        }
        this.field105 = 0;
        field100++;
        return this.method84(1);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 55)
    public static void method72(int arg0) {
        field94 = null;
        if (arg0 != 7) {
            method78((class92) null, -103, 5, false);
        }
        field95 = (byte[][][]) null;
        field97 = null;
        field102 = null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)Lvb;", line = 68)
    public final class60 method73(int arg0) {
        field84++;
        if (this.field96 == null) {
            return null;
        } else if (arg0 == -13574) {
            class60 var2 = this.field86[(int) ((long) (this.field103 - 1) & this.field90)];
            while (this.field96 != var2) {
                if (this.field96.field879 == this.field90) {
                    class60 var3 = this.field96;
                    this.field96 = this.field96.field891;
                    return var3;
                }
                this.field96 = this.field96.field891;
            }
            this.field96 = null;
            return null;
        } else {
            return (class60) null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V", line = 101)
    public static final void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg1;
        field87++;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class141.method1083(arg2, arg0, arg1, arg5, (byte) -83);
            }
        } else if (var6 == 0) {
            class111.method868(arg1, arg5, arg3, 520, arg0);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            int var9 = -69 / ((-arg4 - 37) / 61);
            if (var8) {
                int var10 = arg5;
                arg5 = arg1;
                arg1 = var10;
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
            }
            if (arg3 < arg5) {
                int var12 = arg1;
                arg1 = arg2;
                arg2 = var12;
                int var13 = arg5;
                arg5 = arg3;
                arg3 = var13;
            }
            int var14 = arg1;
            int var15 = arg3 - arg5;
            int var16 = arg2 - arg1;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = -(var15 >> 1);
            int var18 = arg1 >= arg2 ? -1 : 1;
            if (var8) {
                for (int var19 = arg5; var19 <= arg3; var19++) {
                    var17 += var16;
                    class221.field3443[var19][var14] = arg0;
                    if (var17 > 0) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            } else {
                for (int var20 = arg5; var20 <= arg3; var20++) {
                    var17 += var16;
                    class221.field3443[var14][var20] = arg0;
                    if (var17 > 0) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lvb;IJ)V", line = 217)
    public final void method75(class60 arg0, int arg1, long arg2) {
        field93++;
        if (arg0.field880 != null) {
            arg0.method489(false);
        }
        class60 var5 = this.field86[(int) (arg2 & (long) (this.field103 + arg1))];
        arg0.field879 = arg2;
        arg0.field891 = var5;
        arg0.field880 = var5.field880;
        arg0.field880.field891 = arg0;
        arg0.field891.field880 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)I", line = 249)
    public final int method76(byte arg0) {
        field104++;
        int var2 = 0;
        if (arg0 >= -74) {
            field97 = (class144[]) null;
        }
        for (int var3 = 0; var3 < this.field103; var3++) {
            class60 var4 = this.field86[var3];
            class60 var5 = var4.field891;
            while (var4 != var5) {
                var5 = var5.field891;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)I", line = 284)
    public final int method77(byte arg0) {
        field92++;
        if (arg0 < 91) {
            this.field105 = -7;
        }
        return this.field103;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lpf;IIZ)V", line = 302)
    public static final void method78(class92 arg0, int arg1, int arg2, boolean arg3) {
        field91++;
        if (!arg3) {
            field99 = 116;
        }
        if (arg0.field4660 == arg2 && arg2 != -1) {
            class38 var4 = class63.method503(arg2, (byte) 115);
            int var5 = var4.field575;
            if (var5 == 1) {
                arg0.field4634 = 0;
                arg0.field4667 = arg1;
                arg0.field4674 = 1;
                arg0.field4655 = 0;
                arg0.field4687 = 0;
                class28.method246(class345.field5363 == arg0, 255, arg0.field4655, arg0.field4671, var4, arg0.field4672);
            }
            if (var5 == 2) {
                arg0.field4634 = 0;
            }
        } else if (arg2 == -1 || arg0.field4660 == -1 || class63.method503(arg2, (byte) 127).field583 >= class63.method503(arg0.field4660, (byte) 67).field583) {
            arg0.field4667 = arg1;
            arg0.field4634 = 0;
            arg0.field4655 = 0;
            arg0.field4687 = 0;
            arg0.field4674 = 1;
            arg0.field4660 = arg2;
            arg0.field4641 = arg0.field4645;
            if (arg0.field4660 != -1) {
                class28.method246(class345.field5363 == arg0, 255, arg0.field4655, arg0.field4671, class63.method503(arg0.field4660, (byte) 67), arg0.field4672);
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(JB)Lvb;", line = 356)
    public final class60 method79(long arg0, byte arg1) {
        this.field90 = arg0;
        class60 var4 = this.field86[(int) (arg0 & (long) (this.field103 - 1))];
        this.field96 = var4.field891;
        field85++;
        while (this.field96 != var4) {
            if (this.field96.field879 == arg0) {
                class60 var5 = this.field96;
                this.field96 = this.field96.field891;
                return var5;
            }
            this.field96 = this.field96.field891;
        }
        this.field96 = null;
        if (arg1 != 0) {
            this.field96 = (class60) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIZII[BII[Lmf;)[I", line = 387)
    public static final int[] method80(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9, class53[] arg10) {
        field83++;
        int var11 = (arg1 & 0x7) * 8;
        int var12 = (arg5 & 0x7) * 8;
        if (!arg4) {
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class175.method1293(var14 & 0x7, arg8, 0, var13 & 0x7) + arg2;
                    int var16 = class274.method1949((byte) 110, var13 & 0x7, arg8, var14 & 0x7) + arg3;
                    if (var15 > 0 && var15 < 103 && var16 > 0 && var16 < 103) {
                        arg10[arg0].field796[var15][var16] = class164.method1234(arg10[arg0].field796[var15][var16], -2097153);
                    }
                }
            }
        }
        byte var17;
        if (arg4) {
            var17 = 1;
        } else {
            var17 = 4;
        }
        int var18 = (arg1 & 0xFFFFFFF8) << 3;
        class1 var19 = new class1(arg7);
        byte var20 = 0;
        byte var21 = 0;
        int var22 = (arg5 & 0xFFFFFFF8) << 3;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var23 = 0; var23 < var17; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg6 != var23 || var11 > var24 || (var11 + 8) < var24 || var25 < var12 || (var12 + 8) < var25) {
                        class242.method1710(var19, false, 0, -1, 0, -1, 0, 0, 0, 0, arg4, (byte) 29);
                    } else if (var11 + 8 == var24 || var12 + 8 == var25) {
                        int var32;
                        int var33;
                        if (arg8 == 0) {
                            var33 = var24 + arg2 - var11;
                            var32 = var25 - (var12 - arg3);
                        } else if (arg8 == 1) {
                            var32 = var11 + arg3 + 8 - var24;
                            var33 = arg2 + var25 - var12;
                        } else if (arg8 == 2) {
                            var33 = var11 + arg2 + 8 - var24;
                            var32 = var12 + arg3 + 8 - var25;
                        } else {
                            var32 = arg3 + var24 - var11;
                            var33 = arg2 + var12 + 8 - var25;
                        }
                        class242.method1710(var19, true, var22 + var25, var32, arg0, var33, 0, 0, var18 + var24, 0, arg4, (byte) 93);
                    } else {
                        int var26 = arg2 + class175.method1293(var25 & 0x7, arg8, 0, var24 & 0x7);
                        int var27 = class274.method1949((byte) -102, var24 & 0x7, arg8, var25 & 0x7) + arg3;
                        class242.method1710(var19, false, var22 + var25, var27, arg0, var26, var21, arg8, var18 + var24, var20, arg4, (byte) 104);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg8 == 0) {
                                var31 = var28 + arg2 - var11;
                                var30 = arg3 + var29 - var12;
                            } else if (arg8 == 1) {
                                var30 = var11 + arg3 + 8 - var28;
                                var31 = var29 + arg2 - var12;
                            } else if (arg8 == 2) {
                                var31 = arg2 + 8 - (-var11 + var28);
                                var30 = arg3 - (var29 - var12 - 8);
                            } else {
                                var30 = arg3 + var28 - var11;
                                var31 = arg2 + var12 + 8 - var29;
                            }
                            if (var31 >= 0 && var31 < 104 && var30 >= 0 && var30 < 104) {
                                class85.field1374[arg0][var31][var30] = class85.field1374[arg0][var20 + var26][var21 + var27];
                            }
                        }
                    }
                }
            }
        }
        if (arg9 != -4915) {
            return (int[]) null;
        }
        boolean var34 = false;
        boolean var35 = false;
        while (var19.field34.length > var19.field48) {
            int var36 = var19.method15((byte) -62);
            if (var36 == 128) {
                class282.field4417[0] = var19.method56(19612);
                var35 = true;
                class282.field4417[1] = var19.method41((byte) -66);
                class282.field4417[2] = var19.method41((byte) -66);
                class282.field4417[3] = var19.method41((byte) -66);
                class282.field4417[4] = var19.method56(19612);
            } else {
                if (var36 != 129) {
                    var19.field48--;
                    break;
                }
                for (int var37 = 0; var37 < 4; var37++) {
                    byte var38 = var19.method55(4);
                    if (var38 == 0) {
                        if (var37 <= arg6) {
                            int var39 = arg2 + 7;
                            int var40 = arg3;
                            if (arg3 < 0) {
                                var40 = 0;
                            } else if (arg3 >= 104) {
                                var40 = 104;
                            }
                            int var41 = arg2;
                            if (arg2 < 0) {
                                var41 = 0;
                            } else if (arg2 >= 104) {
                                var41 = 104;
                            }
                            int var42 = arg3 + 7;
                            if (var42 < 0) {
                                var42 = 0;
                            } else if (var42 >= 104) {
                                var42 = 104;
                            }
                            if (var39 < 0) {
                                var39 = 0;
                            } else if (var39 >= 104) {
                                var39 = 104;
                            }
                            while (var41 < var39) {
                                while (var40 < var42) {
                                    class50.field766[arg0][var41][var40] = 0;
                                    var40++;
                                }
                                var41++;
                            }
                        }
                    } else if (var38 == 1) {
                        for (int var43 = 0; var43 < 64; var43 += 4) {
                            for (int var44 = 0; var44 < 64; var44 += 4) {
                                byte var45 = var19.method55(4);
                                if (arg6 >= var37) {
                                    for (int var46 = var43; var46 < (var43 + 4); var46++) {
                                        for (int var47 = var44; var47 < (var44 + 4); var47++) {
                                            if (var11 <= var46 && var11 + 8 > var46 && var12 <= var47 && var12 < var12 + 8) {
                                                int var48 = class175.method1293(var47 & 0x7, arg8, 0, var46 & 0x7) + arg2;
                                                int var49 = class274.method1949((byte) 102, var46 & 0x7, arg8, var47 & 0x7) + arg3;
                                                if (var48 >= 0 && var48 < 104 && var49 >= 0 && var49 < 104) {
                                                    class50.field766[arg0][var48][var49] = var45;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var38 != 2) {
                    }
                }
            }
        }
        if (class162.field2623 && !arg4) {
            class75 var50 = null;
            while (true) {
                while (var19.field34.length > var19.field48) {
                    int var51 = var19.method15((byte) -120);
                    if (var51 == 0) {
                        var50 = new class75(var19);
                    } else if (var51 == 1) {
                        int var52 = var19.method15((byte) 113);
                        if (var52 > 0) {
                            for (int var53 = 0; var53 < var52; var53++) {
                                class253 var54 = new class253(var19);
                                if (var54.field3731 == 31) {
                                    class166 var55 = class155.method1159(0, var19.method56(19612));
                                    var54.method1757(var55.field2685, var55.field2683, (byte) 46, var55.field2678, var55.field2676);
                                }
                                int var56 = var54.field3747 >> 7;
                                int var57 = var54.field3725 >> 7;
                                if (var54.field3736 == arg6 && var57 >= var11 && var11 + 8 > var57 && var56 >= var12 && var56 < (var12 + 8)) {
                                    int var58 = class232.method1678(var54.field3747 & 0x3FF, arg8, var54.field3725 & 0x3FF, (byte) 26) + (arg2 << 7);
                                    int var59 = class289.method2037(arg8, -1, var54.field3725 & 0x3FF, var54.field3747 & 0x3FF) + (arg3 << 7);
                                    var54.field3725 = var58;
                                    int var60 = var54.field3725 >> 7;
                                    var54.field3747 = var59;
                                    int var61 = var54.field3747 >> 7;
                                    if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                                        var54.field3737 = (class332.field5184[1][var60][var61] & 0x2) != 0;
                                        var54.field3723 = class85.field1374[var54.field3736][var60][var61] - var54.field3723;
                                        class219.method1589(var54);
                                    }
                                }
                            }
                        }
                    } else if (var51 == 2) {
                        if (var50 == null) {
                            var50 = new class75();
                        }
                        var50.method593(-58, var19);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var50 == null) {
                    var50 = new class75();
                }
                class155.field2520[arg2 >> 3][arg3 >> 3] = var50;
                break;
            }
        }
        if (!var34) {
            int var62 = arg3 + 7;
            int var63 = arg2 + 7;
            for (int var64 = arg2; var64 < var63; var64++) {
                for (int var65 = arg3; var65 < var62; var65++) {
                    class50.field766[arg0][var64][var65] = 0;
                }
            }
        }
        return var35 ? class282.field4417 : null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([Lvb;I)I", line = 846)
    public final int method81(class60[] arg0, int arg1) {
        field82++;
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field103; var4++) {
            class60 var5 = this.field86[var4];
            for (class60 var6 = var5.field891; var6 != var5; var6 = var6.field891) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lpk;ILpk;)V", line = 881)
    public static final void method82(class120 arg0, int arg1, class120 arg2) {
        class5.field125 = arg2;
        class207.field3278 = arg0;
        field89++;
        class338.field5224 = class5.field125.method962((byte) -103, arg1);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 893)
    public final void method83(int arg0) {
        for (int var2 = 0; var2 < this.field103; var2++) {
            class60 var3 = this.field86[var2];
            while (true) {
                class60 var4 = var3.field891;
                if (var3 == var4) {
                    break;
                }
                var4.method489(false);
            }
        }
        field101++;
        this.field106 = null;
        this.field96 = null;
        if (arg0 >= -3) {
            this.method76((byte) 98);
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)Lvb;", line = 925)
    public final class60 method84(int arg0) {
        field88++;
        if (arg0 != 1) {
            field80 = 37;
        }
        if (this.field105 > 0 && this.field86[this.field105 - 1] != this.field106) {
            class60 var2 = this.field106;
            this.field106 = var2.field891;
            return var2;
        }
        class60 var3;
        do {
            if (this.field105 >= this.field103) {
                return null;
            }
            var3 = this.field86[this.field105++].field891;
        } while (this.field86[this.field105 - 1] == var3);
        this.field106 = var3.field891;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V", line = 958)
    public class3(int arg0) {
        this.field103 = arg0;
        this.field86 = new class60[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class60 var3 = this.field86[var2] = new class60();
            var3.field891 = var3;
            var3.field880 = var3;
        }
    }
}
