import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class636 extends class640 {

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field8755;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "Lpca;")
    public static class714 field8756 = new class714(20);

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "Lfp;")
    public static class323 field8762;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qt", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field8764;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "[[B")
    public static byte[][] field8763;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3538(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkba;)V", line = 4)
    public static final void method3533(class105 arg0) {
        class362.field5135.method446(arg0.field1264, arg0.field1255 + (arg0.method749(32767) >> 1), arg0.field1250, class670.field9091);
        arg0.field1253 = class670.field9091[0];
        arg0.field1267 = class670.field9091[1];
        arg0.field1260 = class670.field9091[2];
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 11)
    public final Object method1227(int arg0) {
        field8757++;
        return arg0 == -11907 ? this.field8755 : null;
    }

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "(I)V", line = 24)
    public static final void method3534(int arg0) {
        class54.field622 = null;
        field8761++;
        class674.field9143 = -1;
        if (arg0 != 16598) {
            method3536(null, -29, -22);
        }
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(B)V", line = 37)
    public static void method3535(byte arg0) {
        field8763 = null;
        field8762 = null;
        int var1 = -79 % ((4 - arg0) / 44);
        field8756 = null;
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(I)Z", line = 48)
    public final boolean method1226(int arg0) {
        field8754++;
        return arg0 == 16311 ? false : false;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lha;II)Z", line = 62)
    public static final boolean method3536(class58 arg0, int arg1, int arg2) {
        field8760++;
        if (arg2 != 4) {
            return false;
        }
        int var3 = (class336.field4683 - 104) / 2;
        int var4 = (class700.field9768 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < (var4 + 104); var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class325.method2113(var57, -1, var58, var6, arg1)) {
                        int var59 = var58;
                        if (class364.method2319((byte) -50, var6, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class347.method2242((byte) 92, var57, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class54.field622 = arg0.method426(512, 512, var7, arg2 ^ 0xFFFFFFFB, 512, 0);
        class237.method1521((byte) 126);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 228 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
        boolean[][] var12 = new boolean[class540.field7570 + 1 + 2][class540.field7570 + 1 + 2];
        for (int var13 = var3; var13 < var3 + 104; var13 += class540.field7570) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class540.field7570) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class540.field7570 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class540.field7570 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg0.method469(0, 0, var37 + (class540.field7570 * 4), class540.field7570 * 4 + var38);
                arg0.method429(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class540.field7570; var50++) {
                        for (int var56 = 0; var56 <= class540.field7570; var56++) {
                            var12[var50][var56] = class325.method2113(var40 + var56, -1, var43, var39 + var50, arg1);
                        }
                    }
                    class588.field8292[var43].method1819(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class254.field3723) {
                        for (int var51 = -4; var51 < class540.field7570; var51++) {
                            for (int var52 = -4; var52 < class540.field7570; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var4 <= var54 && class325.method2113(var54, -1, var43, var53, arg1)) {
                                    int var55 = var43;
                                    if (class364.method2319((byte) -128, var53, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class373.method2348(var54, var51 * 4 + var37, var9, var53, var55, var10, arg0, (class540.field7570 - var52) * 4 + var38 - 4, arg2 + -19);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class254.field3723) {
                    class285 var44 = class147.field2114[arg1];
                    for (int var45 = 0; var45 < class540.field7570; var45++) {
                        for (int var46 = 0; var46 < class540.field7570; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field4035[var47 - var44.field4046][var48 - var44.field4041];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method417(-1713569622, var45 * 4 + var37, (-var46 + class540.field7570) * 4 + var38 + -4, (byte) 65, 4, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method458(var45 * 4 + var37, (-var46 + class540.field7570) * 4 + var38 + -4, 8985, 4, -1713569622);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method400(arg2 ^ 0x7B, var45 * 4 + (var37 + 3), (class540.field7570 - var46) * 4 + var38 - 4, 4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method458(var45 * 4 + var37, var38 - (-((class540.field7570 - var46) * 4) - -4) + 3, 8985, 4, -1713569622);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method400(124, var45 * 4 + var37, (-var46 + class540.field7570) * 4 + var38 + -4, 4, -1713569622);
                            }
                        }
                    }
                }
                arg0.method431(var37, var38, class540.field7570 * 4, class540.field7570 * 4, var11, 2);
                class54.field622.method659((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class540.field7570 * 4), class540.field7570 * 4, class540.field7570 * 4, var37, var38);
            }
        }
        arg0.method424();
        arg0.method429(-16777215);
        class350.method2257(-101);
        class353.field4982 = 0;
        class141.field2028.method2767((byte) -19);
        if (!class254.field3723) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= (arg1 + 1) && var21 <= 3; var21++) {
                        if (class325.method2113(var20, -1, var21, var14, arg1)) {
                            class706 var22 = (class706) class434.method2639(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class706) class243.method1557(var21, var14, var20, field8764 == null ? (field8764 = method3538("ip")) : field8764);
                            }
                            if (var22 == null) {
                                var22 = (class706) class252.method1672(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class706) class258.method1696(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class10 var23 = class612.field8588.method558((byte) -32, var22.method861((byte) -17));
                                if (!var23.field218 || class192.field2572) {
                                    int var24 = var23.field180;
                                    if (var23.field226 != null) {
                                        for (int var25 = 0; var25 < var23.field226.length; var25++) {
                                            if (var23.field226[var25] != -1) {
                                                class10 var26 = class612.field8588.method558((byte) 126, var23.field226[var25]);
                                                if (var26.field180 >= 0) {
                                                    var24 = var26.field180;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class344 var28 = class569.field8079.method3088((byte) -89, var24);
                                            if (var28 != null && var28.field4839) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class147.field2114[var21].field4035;
                                            int var32 = class147.field2114[var21].field4046;
                                            int var33 = class147.field2114[var21].field4041;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 103 > var29 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 103) > var30 && var30 < var20 + 3 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class522.field7397[class353.field4982] = var23.field236;
                                        class558.field7840[class353.field4982] = var29;
                                        class676.field9242[class353.field4982] = var30;
                                        class353.field4982++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class124.field1501 != null) {
                class580.field8187.field4496 = 1;
                class569.field8079.method3086(64, (byte) -16, 1024);
                for (int var15 = 0; var15 < class124.field1501.field483; var15++) {
                    int var16 = class124.field1501.field477[var15];
                    if (var16 >> 28 == class660.field9039.field1266) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class228.field3063;
                        int var18 = (var16 & 0x3FFF) - class3.field30;
                        if (var17 >= 0 && var17 < class336.field4683 && var18 >= 0 && class700.field9768 > var18) {
                            class141.field2028.method2770((byte) -13, new class756(var15));
                        } else {
                            class344 var19 = class569.field8079.method3088((byte) -111, class124.field1501.field478[var15]);
                            if (var19.field4842 != null && (var19.field4825 + var17) >= 0 && var19.field4834 + var17 < class336.field4683 && var19.field4804 + var18 >= 0 && class700.field9768 > (var19.field4841 + var18)) {
                                class141.field2028.method2770((byte) -13, new class756(var15));
                            }
                        }
                    }
                }
                class569.field8079.method3086(64, (byte) -16, 128);
                class580.field8187.field4496 = 2;
                class580.field8187.method2081(-91);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Laf;Ljava/lang/Object;I)V", line = 507)
    public class636(class435 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8755 = arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Z", line = 516)
    public static final boolean method3537(int arg0, int arg1) {
        if (arg0 != 8071) {
            return false;
        }
        field8758++;
        if (arg1 == 3 || arg1 == 13 || arg1 == 58 || arg1 == 8 || arg1 == 1001) {
            return true;
        } else {
            return arg1 == 51 || arg1 == 1004;
        }
    }
}
