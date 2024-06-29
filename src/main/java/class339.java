import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class339 extends class376 {

    @OriginalMember(owner = "client!np", name = "H", descriptor = "Lgk;")
    public static class331 field4702 = new class331("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!np", name = "J", descriptor = "[J")
    public static long[] field4704 = new long[100];

    @OriginalMember(owner = "client!np", name = "y", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!np", name = "A", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!np", name = "B", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!np", name = "C", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    public static int field4707;

    // $FF: synthetic field
    @OriginalMember(owner = "client!np", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field4709;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "Ljava/lang/String;")
    public String field4703;

    @OriginalMember(owner = "client!np", name = "D", descriptor = "[C")
    public char[] field4698;

    @OriginalMember(owner = "client!np", name = "L", descriptor = "[C")
    public char[] field4706;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[I")
    public int[] field4694;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "[I")
    public int[] field4708;

    // $FF: synthetic method
    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2066(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!np", name = "e", descriptor = "(B)V", line = 5)
    public static final void method2057(byte arg0) {
        class65.field776 = null;
        int var1 = -53 % ((34 - arg0) / 40);
        class272.field4027 = null;
        class411.field6106 = false;
        field4696++;
        class325.field4560 = null;
        class377.field5587 = null;
        class350.field4847 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(CB)I", line = 33)
    public final int method2058(char arg0, byte arg1) {
        field4697++;
        if (this.field4694 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4694.length; var3++) {
            if (this.field4706[var3] == arg0) {
                return this.field4694[var3];
            }
        }
        if (arg1 >= -30) {
            method2062(-88, 41, 67, -107, 117, 70, (byte) 87, -59, 114);
        }
        return -1;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IILya;)Z", line = 56)
    public static final boolean method2059(int arg0, int arg1, class38 arg2) {
        field4693++;
        int var3 = (class397.field5828 - 104) / 2;
        int var4 = (class457.field6713 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < (var4 + 104); var51++) {
                for (int var52 = arg1; var52 <= 3; var52++) {
                    if (class389.method2392(var6, arg1, (byte) 56, var52, var51)) {
                        int var53 = var52;
                        if (class274.method1765(var6, arg0 - 29788, var51)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class108.method891((byte) -93, var51, var53, var6);
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
        class257.field3781 = arg2.method330(var7, 0, 512, 512, 512);
        class99.method836(arg0 ^ 0x60);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (-238 - (int) (Math.random() * 20.0D) + 10) | 0xFF000000;
        int var10 = (((int) (Math.random() * 20.0D)) + 238) - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class102.field1432][class102.field1432];
        for (int var13 = var3; var13 < (var3 + 104); var13 += class102.field1432) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class102.field1432) {
                arg2.method380(0, 0, class102.field1432 * 4, class102.field1432 * 4);
                arg2.method381(-16777216);
                for (int var37 = arg1; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class102.field1432; var44++) {
                        for (int var50 = 0; var50 < class102.field1432; var50++) {
                            var12[var44][var50] = class389.method2392(var13 + var44, arg1, (byte) 56, var37, var36 + var50);
                        }
                    }
                    class283.field4115[var37].method427(0, 0, 1024, var13, var36, var13 + class102.field1432, var36 - -class102.field1432, var12);
                    if (!class264.field3893) {
                        for (int var45 = -4; var45 < class102.field1432; var45++) {
                            for (int var46 = -4; var46 < class102.field1432; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var47 >= var3 && var4 <= var48 && class389.method2392(var47, arg1, (byte) 56, var37, var48)) {
                                    int var49 = var37;
                                    if (class274.method1765(var47, -29792, var48)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class476.method2877(var49, var9, var48, (class102.field1432 - var46) * 4 - 4, arg2, var47, var45 * 4, 17805, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class264.field3893) {
                    class62 var38 = class455.field6684[arg1];
                    for (int var39 = 0; var39 < class102.field1432; var39++) {
                        for (int var40 = 0; var40 < class102.field1432; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field721[var41 - var38.field728][var42 - var38.field733];
                            if ((var43 & 0x40240000) != 0) {
                                arg2.method367(var39 * 4, 4, (class102.field1432 - var40) * 4 - 4, (byte) 58, -1713569622, 4);
                            } else if ((var43 & 0x800000) != 0) {
                                arg2.method316(4, -126, (class102.field1432 - var40) * 4 - 4, var39 * 4, -1713569622);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg2.method294(arg0 ^ 0xFFFFFFFC, (class102.field1432 - var40) * 4 - 4, 4, var39 * 4 + 3, -1713569622);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg2.method316(4, -125, (class102.field1432 - var40) * 4 + 3 - 4, var39 * 4, -1713569622);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg2.method294(0, (class102.field1432 - var40) * 4 - 4, 4, var39 * 4, -1713569622);
                            }
                        }
                    }
                }
                arg2.method386(0, 0, class102.field1432 * 4, class102.field1432 * 4, var11, 2);
                class257.field3781.method119((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class102.field1432 * 4) + 464, class102.field1432 * 4, class102.field1432 * 4, 0, 0);
            }
        }
        arg2.method339();
        arg2.method381(-16777215);
        class448.method2716(-11712);
        if (arg0 != -4) {
            method2057((byte) -91);
        }
        class340.field4723 = 0;
        class303.field4321.method1016(arg0 ^ 0x4B);
        if (!class264.field3893) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; var21 <= (arg1 + 1) && var21 <= 3; var21++) {
                        if (class389.method2392(var14, arg1, (byte) 56, var21, var20)) {
                            class529 var22 = (class529) class282.method1802(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class529) class262.method1683(var21, var14, var20, field4709 == null ? (field4709 = method2066("f")) : field4709);
                            }
                            if (var22 == null) {
                                var22 = (class529) class344.method2079(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class529) class510.method3040(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class222 var23 = class384.field5645.method786(var22.method28(true), 0);
                                if (!var23.field3228 || class49.field542) {
                                    int var24 = var23.field3189;
                                    if (var23.field3233 != null) {
                                        for (int var25 = 0; var25 < var23.field3233.length; var25++) {
                                            if (var23.field3233[var25] != -1) {
                                                class222 var26 = class384.field5645.method786(var23.field3233[var25], 0);
                                                if (var26.field3189 >= 0) {
                                                    var24 = var26.field3189;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class405 var28 = class175.field2483.method837(var24, (byte) -41);
                                            if (var28 != null && var28.field6030) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class455.field6684[var21].field721;
                                            int var32 = class455.field6684[var21].field728;
                                            int var33 = class455.field6684[var21].field733;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && (var14 + 3) > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > (var20 - 3) && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 103 && var20 + 3 > var30 && (var31[var29 - var32][var30 - (var33 - 1)] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class280.field4093[class340.field4723] = var23.field3217;
                                        class141.field1997[class340.field4723] = var29;
                                        class70.field904[class340.field4723] = var30;
                                        class340.field4723++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class125.field1822 != null) {
                class3.field44.field5709 = 1;
                class175.field2483.method844(64, false, 1024);
                for (int var15 = 0; var15 < class125.field1822.field165; var15++) {
                    int var16 = class125.field1822.field166[var15];
                    if (var16 >> 28 == class435.field6375.field6328) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class340.field4713;
                        int var18 = (var16 & 0x3FFF) - class476.field7013;
                        if (var17 >= 0 && var17 < class397.field5828 && var18 >= 0 && var18 < class457.field6713) {
                            class303.field4321.method1015(false, new class389(var15));
                        } else {
                            class405 var19 = class175.field2483.method837(class125.field1822.field160[var15], (byte) -41);
                            if (var19.field6020 != null && var19.field6025 + var17 >= 0 && class397.field5828 > var19.field6031 + var17 && (var19.field6014 + var18) >= 0 && class457.field6713 > (var19.field6001 + var18)) {
                                class303.field4321.method1015(false, new class389(var15));
                            }
                        }
                    }
                }
                class175.field2483.method844(64, false, 128);
                class3.field44.field5709 = 2;
                class3.field44.method2377(0);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(CB)I", line = 468)
    public final int method2060(char arg0, byte arg1) {
        field4695++;
        if (arg1 != -112) {
            this.field4706 = null;
        }
        if (this.field4708 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4708.length; var3++) {
            if (this.field4698[var3] == arg0) {
                return this.field4708[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!np", name = "f", descriptor = "(B)V", line = 491)
    public final void method2061(byte arg0) {
        if (arg0 < 49) {
            field4707 = -91;
        }
        field4701++;
        if (this.field4694 != null) {
            for (int var2 = 0; var2 < this.field4694.length; var2++) {
                this.field4694[var2] = class244.method1606(this.field4694[var2], 32768);
            }
        }
        if (this.field4708 != null) {
            for (int var3 = 0; var3 < this.field4708.length; var3++) {
                this.field4708[var3] = class244.method1606(this.field4708[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIBII)V", line = 520)
    public static final void method2062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field4705++;
        if (arg6 == 41) {
            class274.method1762(arg0, arg1, arg2, arg8, 0, arg7, arg4, arg6 ^ 0x1DE, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Liv;II)V", line = 535)
    private final void method2063(class65 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4703 = arg0.method624((byte) -40);
        } else if (arg2 == 2) {
            int var4 = arg0.method577(255);
            this.field4698 = new char[var4];
            this.field4708 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4708[var5] = arg0.method623((byte) 87);
                byte var6 = arg0.method629(false);
                this.field4698[var5] = var6 == 0 ? 0 : class208.method1445(32404, var6);
            }
        } else if (arg2 == 3) {
            int var7 = arg0.method577(255);
            this.field4706 = new char[var7];
            this.field4694 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4694[var8] = arg0.method623((byte) 83);
                byte var9 = arg0.method629(false);
                this.field4706[var8] = var9 == 0 ? 0 : class208.method1445(32404, var9);
            }
        }
        int var10 = -31 / ((arg1 + 59) / 63);
        field4699++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Liv;I)V", line = 603)
    public final void method2064(class65 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method577(255);
            if (var3 == 0) {
                if (arg1 > -15) {
                    this.field4703 = null;
                }
                field4700++;
                return;
            }
            this.method2063(arg0, 37, var3);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V", line = 629)
    public static void method2065(boolean arg0) {
        if (!arg0) {
            method2057((byte) 73);
        }
        field4704 = null;
        field4702 = null;
    }
}
