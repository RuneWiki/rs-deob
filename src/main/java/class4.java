import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class4 {

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    private int field57 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field51;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[Lak;")
    public class159[] field52;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field50 = new String[5];

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field39;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "J")
    private long field42;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "Lak;")
    private class159 field53;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Lak;")
    private class159 field58;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII[Lgd;[BIIIBZ)[I", line = 8)
    public static final int[] method26(int arg0, int arg1, int arg2, int arg3, class154[] arg4, byte[] arg5, int arg6, int arg7, int arg8, byte arg9, boolean arg10) {
        if (!arg10) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    int var13 = class61.method442(var11 & 0x7, 0, var12 & 0x7, arg7) + arg6;
                    int var14 = class118.method763(var12 & 0x7, var11 & 0x7, arg7, (byte) -83) + arg3;
                    if (var13 > 0 && var13 < 103 && var14 > 0 && var14 < 103) {
                        arg4[arg8].field2491[var13][var14] = class235.method1623(arg4[arg8].field2491[var13][var14], -2097153);
                    }
                }
            }
        }
        byte var15;
        if (arg10) {
            var15 = 1;
        } else {
            var15 = 4;
        }
        int var16 = (arg0 & 0x7) * 8;
        int var17 = arg2 & 0x1FFFFFF8 << 3;
        int var18 = (arg2 & 0x7) * 8;
        field48++;
        byte var19 = 0;
        int var20 = arg0 & 0x1FFFFFF8 << 3;
        class313 var21 = new class313(arg5);
        byte var22 = 0;
        if (arg7 == 1) {
            var22 = 1;
        } else if (arg7 == 2) {
            var22 = 1;
            var19 = 1;
        } else if (arg7 == 3) {
            var19 = 1;
        }
        if (arg9 != -109) {
            return (int[]) null;
        }
        for (int var23 = 0; var23 < var15; var23++) {
            for (int var24 = 0; var24 < 64; var24++) {
                for (int var25 = 0; var25 < 64; var25++) {
                    if (arg1 != var23 || var24 < var18 || var18 + 8 < var24 || var16 > var25 || var16 + 8 < var25) {
                        class102.method661(-1, 0, var21, -70, 0, false, 0, 0, arg10, 0, 0, -1);
                    } else if (var18 + 8 == var24 || (var16 + 8) == var25) {
                        int var32;
                        int var33;
                        if (arg7 == 0) {
                            var32 = arg3 + var25 - var16;
                            var33 = arg6 + var24 - var18;
                        } else if (arg7 == 1) {
                            var32 = var18 + 8 - (var24 - arg3);
                            var33 = arg6 + var25 - var16;
                        } else if (arg7 == 2) {
                            var32 = var16 + arg3 + 8 - var25;
                            var33 = arg6 + var18 + 8 - var24;
                        } else {
                            var33 = var16 + arg6 + 8 - var25;
                            var32 = var24 + arg3 - var18;
                        }
                        class102.method661(var32, var17 + var24, var21, 110, 0, true, 0, 0, arg10, arg8, var20 + var25, var33);
                    } else {
                        int var26 = class61.method442(var24 & 0x7, arg9 + 109, var25 & 0x7, arg7) + arg6;
                        int var27 = arg3 + class118.method763(var25 & 0x7, var24 & 0x7, arg7, (byte) -83);
                        class102.method661(var27, var17 + var24, var21, 122, var22, false, arg7, var19, arg10, arg8, var20 + var25, var26);
                        if (var24 == 63 || var25 == 63) {
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29 = var25 == 63 ? 64 : var25;
                            int var30;
                            int var31;
                            if (arg7 == 0) {
                                var30 = arg6 + var28 - var18;
                                var31 = arg3 + var29 - var16;
                            } else if (arg7 == 1) {
                                var31 = arg3 + var18 + 8 - var28;
                                var30 = arg6 - (var16 - var29);
                            } else if (arg7 == 2) {
                                var30 = arg6 + var18 + 8 - var28;
                                var31 = var16 - (var29 - arg3 - 8);
                            } else {
                                var30 = -var29 - (-var16 - (arg6 + 8));
                                var31 = var28 - (var18 - arg3);
                            }
                            if (var30 >= 0 && var30 < 104 && var31 >= 0 && var31 < 104) {
                                class101.field1457[arg8][var30][var31] = class101.field1457[arg8][var19 + var26][var22 + var27];
                            }
                        }
                    }
                }
            }
        }
        boolean var34 = false;
        while (var21.field5124.length > var21.field5137) {
            int var35 = var21.method2224(arg9 - 18);
            if (var35 == 128) {
                var34 = true;
                class183.field2846[0] = var21.method2250(-1613178296);
                class183.field2846[1] = var21.method2214(arg9 + 109);
                class183.field2846[2] = var21.method2214(arg9 + 109);
                class183.field2846[3] = var21.method2214(0);
                class183.field2846[4] = var21.method2250(-1613178296);
            } else {
                if (var35 != 129) {
                    var21.field5137--;
                    break;
                }
                for (int var36 = 0; var36 < 4; var36++) {
                    byte var37 = var21.method2200(-116);
                    if (var37 == 0) {
                        if (arg1 >= var36) {
                            int var45 = arg6 + 7;
                            int var46 = arg6;
                            if (var45 < 0) {
                                var45 = 0;
                            } else if (var45 >= 104) {
                                var45 = 104;
                            }
                            if (arg6 < 0) {
                                var46 = 0;
                            } else if (arg6 >= 104) {
                                var46 = 104;
                            }
                            int var47 = arg3 + 7;
                            int var48 = arg3;
                            if (arg3 < 0) {
                                var48 = 0;
                            } else if (arg3 >= 104) {
                                var48 = 104;
                            }
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 >= 104) {
                                var47 = 104;
                            }
                            while (var46 < var45) {
                                while (var47 > var48) {
                                    class37.field559[arg8][var46][var48] = 0;
                                    var48++;
                                }
                                var46++;
                            }
                        }
                    } else if (var37 == 1) {
                        for (int var38 = 0; var38 < 64; var38 += 4) {
                            for (int var39 = 0; var39 < 64; var39 += 4) {
                                byte var40 = var21.method2200(-78);
                                if (arg1 >= var36) {
                                    for (int var41 = var38; var41 < var38 + 4; var41++) {
                                        for (int var42 = var39; var42 < var39 + 4; var42++) {
                                            if (var18 <= var41 && var41 < (var18 + 8) && var16 <= var42 && (var16 + 8) > var16) {
                                                int var43 = class61.method442(var41 & 0x7, 0, var42 & 0x7, arg7) + arg6;
                                                int var44 = arg3 + class118.method763(var42 & 0x7, var41 & 0x7, arg7, (byte) -83);
                                                if (var43 >= 0 && var43 < 104 && var44 >= 0 && var44 < 104) {
                                                    class37.field559[arg8][var43][var44] = var40;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var37 == 2) {
                    }
                }
            }
        }
        boolean var49 = false;
        if (class245.field3886 && !arg10) {
            class52 var50 = null;
            label300: while (true) {
                int var52;
                label293: do {
                    while (true) {
                        while (var21.field5137 < var21.field5124.length) {
                            int var51 = var21.method2224(arg9 - 16);
                            if (var51 == 0) {
                                var50 = new class52(var21);
                            } else {
                                if (var51 == 1) {
                                    var52 = var21.method2224(arg9 ^ 0x11);
                                    continue label293;
                                }
                                if (var51 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var50 == null) {
                                    var50 = new class52();
                                }
                                var50.method378(var21, 127);
                            }
                        }
                        if (var50 == null) {
                            var50 = new class52();
                        }
                        class236.field3742[arg6 >> 3][arg3 >> 3] = var50;
                        break label300;
                    }
                } while (var52 <= 0);
                for (int var53 = 0; var53 < var52; var53++) {
                    class241 var54 = new class241(var21);
                    if (var54.field3798 == 31) {
                        class318 var55 = class31.method265(var21.method2250(-1613178296), (byte) -54);
                        var54.method1689(var55.field5242, (byte) 125, var55.field5240, var55.field5243, var55.field5245);
                    }
                    int var56 = var54.field3807 >> 7;
                    int var57 = var54.field3783 >> 7;
                    if (var54.field3784 == arg1 && var57 >= var18 && var57 < (var18 + 8) && var56 >= var16 && var56 < var16 + 8) {
                        int var58 = class72.method495(var54.field3807 & 0x3FF, var54.field3783 & 0x3FF, arg7, true) + (arg6 << 7);
                        int var59 = (arg3 << 7) + class329.method2349((byte) -66, arg7, var54.field3783 & 0x3FF, var54.field3807 & 0x3FF);
                        var54.field3807 = var59;
                        var54.field3783 = var58;
                        int var60 = var54.field3807 >> 7;
                        int var61 = var54.field3783 >> 7;
                        if (var61 >= 0 && var60 >= 0 && var61 < 104 && var60 < 104) {
                            var54.field3805 = (class148.field2392[1][var61][var60] & 0x2) != 0;
                            var54.field3800 = class101.field1457[var54.field3784][var61][var60] - var54.field3800;
                            class254.method1810(var54);
                        }
                    }
                }
            }
        }
        if (!var49) {
            int var62 = arg6 + 7;
            int var63 = arg3 + 7;
            for (int var64 = arg6; var64 < var62; var64++) {
                for (int var65 = arg3; var65 < var63; var65++) {
                    class37.field559[arg8][var64][var65] = 0;
                }
            }
        }
        return var34 ? class183.field2846 : null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Lak;", line = 467)
    public final class159 method27(int arg0) {
        field45++;
        if (arg0 < 115) {
            method35(-24);
        }
        this.field57 = 0;
        return this.method34(8);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I", line = 483)
    public final int method28(boolean arg0) {
        int var2 = 0;
        field40++;
        for (int var3 = 0; var3 < this.field51; var3++) {
            class159 var4 = this.field52[var3];
            class159 var5 = var4.field2551;
            while (var4 != var5) {
                var5 = var5.field2551;
                var2++;
            }
        }
        if (!arg0) {
            this.field58 = (class159) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(JI)Lak;", line = 515)
    public final class159 method29(long arg0, int arg1) {
        this.field42 = arg0;
        class159 var4 = this.field52[(int) (arg0 & (long) (this.field51 - 1))];
        field46++;
        if (arg1 != 103) {
            this.field53 = (class159) null;
        }
        for (this.field53 = var4.field2551; this.field53 != var4; this.field53 = this.field53.field2551) {
            if (this.field53.field2549 == arg0) {
                class159 var5 = this.field53;
                this.field53 = this.field53.field2551;
                return var5;
            }
        }
        this.field53 = null;
        return null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[Lak;)I", line = 546)
    public final int method30(int arg0, class159[] arg1) {
        field54++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 > -83) {
            this.field51 = 115;
        }
        while (this.field51 > var4) {
            class159 var5 = this.field52[var4];
            for (class159 var6 = var5.field2551; var6 != var5; var6 = var6.field2551) {
                arg1[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V", line = 587)
    public final void method31(boolean arg0) {
        for (int var2 = 0; var2 < this.field51; var2++) {
            class159 var3 = this.field52[var2];
            while (true) {
                class159 var4 = var3.field2551;
                if (var3 == var4) {
                    break;
                }
                var4.method1131(8);
            }
        }
        if (arg0) {
            this.method28(false);
        }
        field55++;
        this.field53 = null;
        this.field58 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I", line = 625)
    public final int method32(int arg0) {
        field38++;
        if (arg0 != -3) {
            field50 = (String[]) null;
        }
        return this.field51;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLjava/util/Random;I)I", line = 637)
    public static final int method33(boolean arg0, Random arg1, int arg2) {
        field49++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class238.method1667(1, arg2)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            if (arg0) {
                return 100;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class54.method389(var4, arg2, 18678);
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Lak;", line = 672)
    public final class159 method34(int arg0) {
        if (arg0 != 8) {
            this.field51 = -92;
        }
        field41++;
        if (this.field57 > 0 && this.field52[this.field57 - 1] != this.field58) {
            class159 var2 = this.field58;
            this.field58 = var2.field2551;
            return var2;
        }
        class159 var3;
        do {
            if (this.field57 >= this.field51) {
                return null;
            }
            var3 = this.field52[this.field57++].field2551;
        } while (this.field52[this.field57 - 1] == var3);
        this.field58 = var3.field2551;
        return var3;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 708)
    public static void method35(int arg0) {
        if (arg0 != 8) {
            field56 = 37;
        }
        field50 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILkl;I)V", line = 722)
    public static final void method36(int arg0, int arg1, class39 arg2, int arg3) {
        if ((arg3 & 0x8) != 0) {
            int var4 = class159.field2552.method2250(arg1 ^ 0x9FD8DAB7);
            int var5 = class159.field2552.method2216((byte) 92);
            int var6 = class159.field2552.method2238(-7946);
            int var7 = class159.field2552.field5137;
            boolean var8 = (var4 & 0x8000) != 0;
            if (arg2.field597 != null && arg2.field600 != null) {
                long var9 = class265.method1872(arg2.field597, 78);
                boolean var11 = false;
                if (var5 <= 1) {
                    if (!var8 && (class273.field4486 && !class142.field2288 || class263.field4161)) {
                        var11 = true;
                    } else {
                        for (int var12 = 0; var12 < class265.field4361; var12++) {
                            if (class76.field1144[var12] == var9) {
                                var11 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var11 && class192.field2972 == 0) {
                    class327.field5347.field5137 = 0;
                    class159.field2552.method2237(class327.field5347.field5124, 2, 0, var6);
                    class327.field5347.field5137 = 0;
                    int var13 = -1;
                    String var15;
                    if (var8) {
                        var4 &= 0x7FFF;
                        class222 var14 = class140.method996((byte) 100, class327.field5347);
                        var13 = var14.field3429;
                        var15 = var14.field3432.method280(class327.field5347, 1);
                    } else {
                        var15 = class175.method1227(class266.method1875(class211.method1436(class327.field5347, (byte) -126), true));
                    }
                    arg2.field4793 = var15.trim();
                    arg2.field4737 = var4 >> 8;
                    arg2.field4699 = var4 & 0xFF;
                    arg2.field4728 = 150;
                    if (var5 == 2) {
                        class358.method2491((String) null, var13, "<img=1>" + arg2.method316(false), var15, -21381, var8 ? 17 : 1);
                    } else if (var5 == 1) {
                        class358.method2491((String) null, var13, "<img=0>" + arg2.method316(false), var15, -21381, var8 ? 17 : 1);
                    } else {
                        class358.method2491((String) null, var13, arg2.method316(false), var15, arg1 ^ 0xFFFFAC84, var8 ? 17 : 2);
                    }
                }
            }
            class159.field2552.field5137 = var6 + var7;
        }
        if ((arg3 & 0x10) != 0) {
            int var16 = class159.field2552.method2238(-7946);
            byte[] var17 = new byte[var16];
            class313 var18 = new class313(var17);
            class159.field2552.method2203(var17, 11033, var16, 0);
            class310.field5051[arg0] = var18;
            arg2.method314(var18, arg1 - 256);
        }
        if ((arg3 & 0x400) != 0) {
            int var19 = class159.field2552.method2250(-1613178296);
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = class159.field2552.method2205(3);
            boolean var21 = true;
            if (var19 != -1 && arg2.field4784 != -1 && class68.method476((byte) 121, class214.method1455((byte) -6, var19).field2675).field2011 < class68.method476((byte) 108, class214.method1455((byte) -6, arg2.field4784).field2675).field2011) {
                var21 = false;
            }
            if (var21) {
                arg2.field4784 = var19;
                arg2.field4712 = 0;
                arg2.field4724 = var20 >> 16;
                arg2.field4718 = 1;
                arg2.field4777 = (var20 & 0xFFFF) + class58.field875;
                arg2.field4701 = 0;
                if (class58.field875 < arg2.field4777) {
                    arg2.field4701 = -1;
                }
                if (arg2.field4784 != -1 && class58.field875 == arg2.field4777) {
                    int var22 = class214.method1455((byte) -6, arg2.field4784).field2675;
                    if (var22 != -1) {
                        class131 var23 = class68.method476((byte) 71, var22);
                        if (var23 != null && var23.field1988 != null) {
                            class276.method1970(var23, class329.field5388 == arg2, arg2.field4783, arg1 ^ 0x94, arg2.field4796, 0);
                        }
                    }
                }
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var24 = class159.field2552.method2201(128);
            int var25 = class159.field2552.method2238(arg1 - 8201);
            arg2.method2023(class58.field875, true, var24, var25);
            arg2.field4705 = class58.field875 + 300;
            arg2.field4781 = class159.field2552.method2220(-21362);
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field4793 = class159.field2552.method2198(-430);
            if (arg2.field4793.charAt(0) == '~') {
                arg2.field4793 = arg2.field4793.substring(1);
                class147.method1047(false, arg2.field4793, arg2.method316(false), 2);
            } else if (class329.field5388 == arg2) {
                class147.method1047(false, arg2.field4793, arg2.method316(false), 2);
            }
            arg2.field4728 = 150;
            arg2.field4737 = 0;
            arg2.field4699 = 0;
        }
        field39++;
        if ((arg3 & 0x800) != 0) {
            int var26 = class159.field2552.method2224(-126);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = class159.field2552.method2250(-1613178296);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var29[var30] = class159.field2552.method2224(-126);
                var28[var30] = class159.field2552.method2250(-1613178296);
            }
            class284.method2012(arg2, arg1 ^ 0xC0, var29, var27, var28);
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field4695 = class159.field2552.method2215(true);
            if (arg2.field4695 == 65535) {
                arg2.field4695 = -1;
            }
        }
        if (arg1 != 255) {
            field50 = (String[]) null;
        }
        if ((arg3 & 0x200) != 0) {
            int var32 = class159.field2552.method2201(128);
            int var33 = class159.field2552.method2220(-21362);
            arg2.method2023(class58.field875, true, var32, var33);
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field4769 = class159.field2552.method2220(-21362);
            arg2.field4749 = class159.field2552.method2224(-125);
            arg2.field4756 = class159.field2552.method2224(-122);
            arg2.field4729 = class159.field2552.method2224(arg1 ^ 0xFFFFFF76);
            arg2.field4799 = class159.field2552.method2241((byte) 66) + class58.field875;
            arg2.field4726 = class159.field2552.method2241((byte) 66) + class58.field875;
            arg2.field4738 = class159.field2552.method2224(-121);
            arg2.field4792 = 1;
            arg2.field4694 = 0;
        }
        if ((arg3 & 0x40) != 0) {
            int var34 = class159.field2552.method2227(0);
            int var35 = class159.field2552.method2238(-7946);
            if (var34 == 65535) {
                var34 = -1;
            }
            class21.method132(-17367, var34, arg2, var35);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field4735 = class159.field2552.method2250(-1613178296);
            arg2.field4704 = class159.field2552.method2227(arg1 ^ 0xFF);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(I)V", line = 999)
    public class4(int arg0) {
        this.field51 = arg0;
        this.field52 = new class159[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class159 var3 = this.field52[var2] = new class159();
            var3.field2545 = var3;
            var3.field2551 = var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZLak;J)V", line = 1027)
    public final void method37(boolean arg0, class159 arg1, long arg2) {
        field43++;
        if (arg1.field2545 != null) {
            arg1.method1131(8);
        }
        class159 var5 = this.field52[(int) (arg2 & (long) (this.field51 - 1))];
        arg1.field2545 = var5.field2545;
        arg1.field2551 = var5;
        if (arg0) {
            field50 = (String[]) null;
        }
        arg1.field2549 = arg2;
        arg1.field2545.field2551 = arg1;
        arg1.field2551.field2545 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)I", line = 1051)
    public static final int method38(int arg0, int arg1) {
        if (arg1 > -11) {
            return -28;
        } else {
            field44++;
            return arg0 >>> 8;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)Lak;", line = 1062)
    public final class159 method39(int arg0) {
        field47++;
        if (this.field53 == null) {
            return null;
        }
        class159 var2 = this.field52[(int) ((long) (this.field51 - 1) & this.field42)];
        while (this.field53 != var2) {
            if (this.field53.field2549 == this.field42) {
                class159 var3 = this.field53;
                this.field53 = this.field53.field2551;
                return var3;
            }
            this.field53 = this.field53.field2551;
        }
        this.field53 = null;
        if (arg0 != -414) {
            this.method30(-120, (class159[]) null);
        }
        return null;
    }
}
