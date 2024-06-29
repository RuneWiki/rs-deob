import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class679 {

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "Llga;")
    private class47 field9539;

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "Llga;")
    private class47 field9533;

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9543 = new String[] { method4881(method4880("@;\u001fL<\t")), method4881(method4880("O+\u0012\u000e")), method4881(method4880("@;\u001fL:\t")), method4881(method4880("S*")), method4881(method4880("ZpPL\u0002")), method4881(method4880("@;\u001fL;\t")), method4881(method4880("@;\u001fLCH0\u0017\u0016A\t")), method4881(method4880("@;\u001fL=\t")), method4881(method4880("@;\u001fL>\t")), method4881(method4880("@;\u001fL9\t")) };

    @OriginalMember(owner = "client!aea", name = "k", descriptor = "J")
    public static long field9536 = 1L;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "Lmv;")
    public static class125 field9531 = new class125(62, 7);

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Luu;")
    public static class240 field9540 = new class240(0, 1);

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "I")
    public static int field9532;

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "I")
    public static int field9534;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field9537;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field9538;

    @OriginalMember(owner = "client!aea", name = "m", descriptor = "I")
    public static int field9541;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "Lsr;")
    private class79 field9535;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aea", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9542;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "[Lsha;")
    public static class189[] field9530;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILkd;)Lwg;")
    public final class81 method4873(int arg0, class245 arg1) {
        try {
            field9538++;
            if (arg1 == null) {
                return null;
            }
            class240 var3 = arg1.method482(0);
            if (field9540 == var3) {
                return new class718((class543) arg1);
            } else if (class80.field1126 == var3) {
                return new class214(this.method4874(0), (class793) arg1);
            } else if (class583.field8420 == var3) {
                return new class505(this.field9533, (class232) arg1);
            } else if (class76.field1085 == var3) {
                return new class802(this.field9533, (class44) arg1);
            } else if (class345.field5029 == var3) {
                return new class50(this.field9533, this.field9539, (class753) arg1);
            } else if (class112.field1447 == var3) {
                return new class462(this.field9533, this.field9539, (class778) arg1);
            } else if (class314.field4301 == var3) {
                return new class650(this.field9533, this.field9539, (class427) arg1);
            } else if (class248.field3553 == var3) {
                return new class222(this.field9533, this.field9539, (class667) arg1);
            } else if (class694.field9695 == var3) {
                return new class379(this.field9533, (class51) arg1);
            } else if (class324.field4416 == var3) {
                return new class312(this.field9533, this.field9539, (class598) arg1);
            } else {
                if (arg0 <= 81) {
                    field9536 = -64L;
                }
                return null;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9543[8] + arg0 + ',' + (arg1 == null ? field9543[1] : field9543[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)Lsr;")
    private final class79 method4874(int arg0) {
        try {
            if (arg0 != 0) {
                return null;
            }
            if (this.field9535 == null) {
                this.field9535 = new class79();
            }
            field9534++;
            return this.field9535;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9543[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIII)I")
    public static final int method4875(int arg0, int arg1, int arg2, int arg3) {
        try {
            field9541++;
            if (arg3 != -1) {
                method4878(79, -125, -123, -32, 70, 27, -98);
            }
            if (arg1 <= arg2) {
                return arg2 <= arg0 ? arg2 : arg0;
            } else {
                return arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9543[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(BILha;)Z")
    public static final boolean method4876(byte arg0, int arg1, class18 arg2) {
        try {
            field9537++;
            int var3 = (class625.field8929 - 104) / 2;
            int var4 = (class14.field187 - 104) / 2;
            boolean var5 = true;
            for (int var6 = var3; var6 < var3 + 104; var6++) {
                for (int var7 = var4; var7 < var4 + 104; var7++) {
                    for (int var8 = arg1; var8 <= 3; var8++) {
                        if (class676.method4844(var7, true, var6, arg1, var8)) {
                            int var9 = var8;
                            if (class23.method275(1, var6, var7)) {
                                var9 = var8 - 1;
                            }
                            if (var9 >= 0) {
                                var5 &= class56.method593(var7, var9, var6, false);
                            }
                        }
                    }
                }
            }
            if (!var5) {
                return false;
            }
            int[] var10 = new int[262144];
            for (int var11 = 0; var11 < var10.length; var11++) {
                var10[var11] = -16777216;
            }
            class483.field7103 = arg2.method201(512, 512, var10, 512, (byte) -59, 0);
            class274.method2244(arg0 + 31);
            if (arg0 != -31) {
                field9540 = null;
            }
            int var12 = (int) (Math.random() * 20.0D) + (((int) (Math.random() * 20.0D)) + 228 << 16) + (228 - -((int) (Math.random() * 20.0D)) << 8) + 238 - 10 | 0xFF000000;
            int var13 = (((int) (Math.random() * 20.0D)) + 228 | 0x1F58FF00) << 16;
            int var14 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
            boolean[][] var15 = new boolean[class216.field3150 + 1 + 2][class216.field3150 + 1 + 2];
            for (int var16 = var3; var16 < var3 + 104; var16 += class216.field3150) {
                for (int var17 = var4; var17 < (var4 + 104); var17 += class216.field3150) {
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = var16;
                    if (var16 > 0) {
                        var20 = var16 - 1;
                        var18 += 4;
                    }
                    int var21 = var17;
                    if (var17 > 0) {
                        var21 = var17 - 1;
                    }
                    int var22 = class216.field3150 + var16;
                    if (var22 < 104) {
                        var22++;
                    }
                    int var23 = class216.field3150 + var17;
                    if (var23 < 104) {
                        var19 += 4;
                        var23++;
                    }
                    arg2.method208(0, 0, class216.field3150 * 4 + var18, class216.field3150 * 4 + var19);
                    arg2.method243(-16777216);
                    for (int var24 = arg1; var24 <= 3; var24++) {
                        for (int var25 = 0; var25 <= class216.field3150; var25++) {
                            for (int var26 = 0; var26 <= class216.field3150; var26++) {
                                var15[var25][var26] = class676.method4844(var21 + var26, true, var20 + var25, arg1, var24);
                            }
                        }
                        class213.field3124[var24].method2477(0, 0, 1024, var20, var21, var22, var23, var15);
                        if (!class162.field2080) {
                            for (int var27 = -4; var27 < class216.field3150; var27++) {
                                for (int var28 = -4; var28 < class216.field3150; var28++) {
                                    int var29 = var16 + var27;
                                    int var30 = var17 + var28;
                                    if (var3 <= var29 && var4 <= var30 && class676.method4844(var30, true, var29, arg1, var24)) {
                                        int var31 = var24;
                                        if (class23.method275(1, var29, var30)) {
                                            var31 = var24 - 1;
                                        }
                                        if (var31 >= 0) {
                                            class387.method3038((class216.field3150 - var28) * 4 + var19 - 4, var30, arg2, var31, var27 * 4 + var18, var29, var13, var12, (byte) -18);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class162.field2080) {
                        class302 var32 = class195.field2919[arg1];
                        for (int var33 = 0; var33 < class216.field3150; var33++) {
                            for (int var34 = 0; var34 < class216.field3150; var34++) {
                                int var35 = var16 + var33;
                                int var36 = var17 + var34;
                                int var37 = var32.field4202[var35 - var32.field4214][var36 - var32.field4196];
                                if ((var37 & 0x40240000) != 0) {
                                    arg2.method121(4, var33 * 4 + var18, 59, 4, -1713569622, (class216.field3150 - var34) * 4 + (var19 - 4));
                                } else if ((var37 & 0x800000) != 0) {
                                    arg2.method161((class216.field3150 - var34) * 4 + var19 - 4, 4, var18 + (var33 * 4), true, -1713569622);
                                } else if ((var37 & 0x2000000) != 0) {
                                    arg2.method200((class216.field3150 - var34) * 4 + var19 - 4, 4, var33 * 4 + (var18 + 3), 1, -1713569622);
                                } else if ((var37 & 0x8000000) != 0) {
                                    arg2.method161((class216.field3150 - var34) * 4 + var19 + 3 - 4, 4, var33 * 4 + var18, true, -1713569622);
                                } else if ((var37 & 0x20000000) != 0) {
                                    arg2.method200(var19 + ((class216.field3150 - var34) * 4) - 4, 4, var18 + (var33 * 4), 1, -1713569622);
                                }
                            }
                        }
                    }
                    arg2.method237(var18, var19, class216.field3150 * 4, class216.field3150 * 4, var14, 2);
                    class483.field7103.method873((var16 - var3) * 4 + 48, -((-var4 + var17) * 4) + -(class216.field3150 * 4) + 464, class216.field3150 * 4, class216.field3150 * 4, var18, var19);
                }
            }
            arg2.method240();
            arg2.method243(-16777215);
            class591.method4369(arg0 ^ 0xFFFFFFE1);
            class445.field6560 = 0;
            class721.field10269.method3982(arg0 - 88);
            if (!class162.field2080) {
                for (int var38 = var3; var38 < var3 + 104; var38++) {
                    for (int var39 = var4; var39 < var4 + 104; var39++) {
                        for (int var40 = arg1; var40 <= (arg1 + 1) && var40 <= 3; var40++) {
                            if (class676.method4844(var39, true, var38, arg1, var40)) {
                                class675 var41 = (class675) class254.method2130(var40, var38, var39);
                                if (var41 == null) {
                                    var41 = (class675) class590.method4352(var40, var38, var39, field9542 == null ? (field9542 = method4879(field9543[3])) : field9542);
                                }
                                if (var41 == null) {
                                    var41 = (class675) class185.method1526(var40, var38, var39);
                                }
                                if (var41 == null) {
                                    var41 = (class675) class501.method3838(var40, var38, var39);
                                }
                                if (var41 != null) {
                                    class789 var42 = class101.field1359.method2832(124, var41.method584(false));
                                    if (!var42.field11460 || class260.field3696) {
                                        int var43 = var42.field11398;
                                        if (var42.field11465 != null) {
                                            for (int var44 = 0; var44 < var42.field11465.length; var44++) {
                                                if (var42.field11465[var44] != -1) {
                                                    class789 var45 = class101.field1359.method2832(123, var42.field11465[var44]);
                                                    if (var45.field11398 >= 0) {
                                                        var43 = var45.field11398;
                                                    }
                                                }
                                            }
                                        }
                                        if (var43 >= 0) {
                                            boolean var46 = false;
                                            if (var43 >= 0) {
                                                class475 var47 = class319.field4356.method2508(var43, false);
                                                if (var47 != null && var47.field6968) {
                                                    var46 = true;
                                                }
                                            }
                                            int var48 = var38;
                                            int var49 = var39;
                                            if (var46) {
                                                int[][] var50 = class195.field2919[var40].field4202;
                                                int var51 = class195.field2919[var40].field4214;
                                                int var52 = class195.field2919[var40].field4196;
                                                for (int var53 = 0; var53 < 10; var53++) {
                                                    int var54 = (int) (Math.random() * 4.0D);
                                                    if (var54 == 0 && var48 > var3 && var48 > (var38 - 3) && (var50[var48 - var51 - 1][var49 - var52] & 0x2C0108) == 0) {
                                                        var48--;
                                                    }
                                                    if (var54 == 1 && var48 < var3 + 104 - 1 && var38 + 3 > var48 && (var50[var48 + 1 - var51][var49 - var52] & 0x2C0180) == 0) {
                                                        var48++;
                                                    }
                                                    if (var54 == 2 && var49 > var4 && (var39 - 3) < var49 && (var50[var48 - var51][var49 - var52 - 1] & 0x2C0102) == 0) {
                                                        var49--;
                                                    }
                                                    if (var54 == 3 && var4 + 104 - 1 > var49 && (var39 + 3) > var49 && (var50[var48 - var51][var49 + 1 - var52] & 0x2C0120) == 0) {
                                                        var49++;
                                                    }
                                                }
                                            }
                                            class650.field9231[class445.field6560] = var42.field11478;
                                            class55.field774[class445.field6560] = var48;
                                            class104.field1374[class445.field6560] = var49;
                                            class445.field6560++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class293.field4126 != null) {
                    class217.field3180.field700 = 1;
                    class319.field4356.method2503(64, true, 1024);
                    for (int var55 = 0; var55 < class293.field4126.field9378; var55++) {
                        int var56 = class293.field4126.field9374[var55];
                        if (var56 >> 28 == class203.field2988.field2981) {
                            int var57 = ((var56 & 0xFFFCC19) >> 14) - class537.field7895;
                            int var58 = (var56 & 0x3FFF) - class655.field9286;
                            if (var57 >= 0 && var57 < class625.field8929 && var58 >= 0 && var58 < class14.field187) {
                                class721.field10269.method3984(new class529(var55), 0);
                            } else {
                                class475 var59 = class319.field4356.method2508(class293.field4126.field9377[var55], false);
                                if (var59.field6984 != null && (var59.field6994 + var57) >= 0 && class625.field8929 > (var59.field6967 + var57) && (var59.field6995 + var58) >= 0 && class14.field187 > var59.field7009 + var58) {
                                    class721.field10269.method3984(new class529(var55), 0);
                                }
                            }
                        }
                    }
                    class319.field4356.method2503(64, true, 128);
                    class217.field3180.field700 = 2;
                    class217.field3180.method513((byte) 22);
                }
            }
            return true;
        } catch (RuntimeException var61) {
            throw class665.method4799(var61, field9543[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field9543[1] : field9543[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
    public static void method4877(byte arg0) {
        try {
            field9540 = null;
            if (arg0 != -123) {
                field9530 = null;
            }
            field9531 = null;
            field9530 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9543[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIIII)Lsn;")
    public static final class369 method4878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            field9532++;
            long var7 = (long) arg1 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg0 * 67481L ^ (long) arg6 * 475427L ^ (long) arg5 * 986053L ^ (long) arg2 * 32147369L;
            if (arg4 <= 41) {
                method4875(82, -124, -32, 62);
            }
            class369 var9 = (class369) class511.field7499.method2053(0, var7);
            if (var9 == null) {
                class369 var10 = class727.field10423.method159(arg0, arg3, arg6, arg5, arg2, arg1);
                class511.field7499.method2051(var7, var10, 93);
                return var10;
            } else {
                return var9;
            }
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field9543[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(Llga;Llga;)V")
    public class679(class47 arg0, class47 arg1) {
        try {
            this.field9539 = arg1;
            this.field9533 = arg0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9543[6] + (arg0 == null ? field9543[1] : field9543[4]) + ',' + (arg1 == null ? field9543[1] : field9543[4]) + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4879(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4880(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!aea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4881(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 94;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 127;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
