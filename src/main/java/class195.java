import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public abstract class class195 {

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public static int field2745 = 104;

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!tm", name = "i", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!tm", name = "h", descriptor = "Lct;")
    public static class104 field2750;

    @OriginalMember(owner = "client!tm", name = "k", descriptor = "Lct;")
    public static class104 field2753;

    @OriginalMember(owner = "client!tm", name = "j", descriptor = "Loa;")
    public static class156 field2752;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[Lth;Lfp;[BZIIIIZ)[I")
    public static final int[] method1352(int arg0, class175[] arg1, class9 arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (!arg4) {
            for (int var10 = 0; var10 < 4; var10++) {
                class175 var11 = arg1[var10];
                for (int var12 = 0; var12 < 64; var12++) {
                    for (int var13 = 0; var13 < 64; var13++) {
                        int var14 = arg5 + var12;
                        int var15 = arg0 + var13;
                        if (var14 >= 0 && var14 < field2745 && var15 >= 0 && var15 < class78.field984) {
                            var11.method1216(var14, var15, 0);
                        }
                    }
                }
            }
        }
        field2747++;
        class256 var16 = new class256(arg3);
        if (!arg9) {
            return null;
        }
        int var17 = arg5 + arg8;
        int var18 = arg0 + arg6;
        for (int var19 = 0; var19 < arg7; var19++) {
            for (int var55 = 0; var55 < 64; var55++) {
                for (int var56 = 0; var56 < 64; var56++) {
                    class376.method2382(arg0 + var56, 0, false, var18 + var56, arg4, 0, (byte) -123, var16, var17 + var55, arg5 + var55, 0, var19);
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        while (var16.field3762 < var16.field3764.length) {
            int var22 = var16.method1738((byte) 76);
            if (var22 == 128) {
                class307.field4536[0] = var16.method1767(1930493576);
                class307.field4536[1] = var16.method1747((byte) 12);
                class307.field4536[2] = var16.method1747((byte) 12);
                class307.field4536[3] = var16.method1747((byte) 12);
                class307.field4536[4] = var16.method1767(1930493576);
                var20 = true;
            } else {
                if (var22 != 129) {
                    var16.field3762--;
                    break;
                }
                if (class157.field2114 == null) {
                    class157.field2114 = new byte[4][][];
                }
                var21 = true;
                for (int var40 = 0; var40 < 4; var40++) {
                    byte var41 = var16.method1728((byte) 81);
                    if (var41 == 0 && class157.field2114[var40] != null) {
                        int var42 = arg5;
                        int var43 = arg5 + 64;
                        int var44 = arg0;
                        if (arg5 < 0) {
                            var42 = 0;
                        } else if (arg5 >= field2745) {
                            var42 = field2745;
                        }
                        int var45 = arg0 + 64;
                        if (arg0 < 0) {
                            var44 = 0;
                        } else if (class78.field984 <= arg0) {
                            var44 = class78.field984;
                        }
                        if (var43 < 0) {
                            var43 = 0;
                        } else if (field2745 <= var43) {
                            var43 = field2745;
                        }
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 >= class78.field984) {
                            var45 = class78.field984;
                        }
                        while (var42 < var43) {
                            while (var45 > var44) {
                                class157.field2114[var40][var42][var44] = 0;
                                var44++;
                            }
                            var42++;
                        }
                    } else if (var41 == 1) {
                        if (class157.field2114[var40] == null) {
                            class157.field2114[var40] = new byte[field2745 + 1][class78.field984 + 1];
                        }
                        for (int var50 = 0; var50 < 64; var50 += 4) {
                            for (int var51 = 0; var51 < 64; var51 += 4) {
                                byte var52 = var16.method1728((byte) 97);
                                for (int var53 = arg5 + var50; var53 < (var50 - (-arg5 - 4)); var53++) {
                                    for (int var54 = arg0 + var51; var54 < arg0 + var51 + 4; var54++) {
                                        if (var53 >= 0 && field2745 > var53 && var54 >= 0 && class78.field984 > var54) {
                                            class157.field2114[var40][var53][var54] = var52;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (var41 == 2) {
                        if (class157.field2114[var40] == null) {
                            class157.field2114[var40] = new byte[field2745 + 1][class78.field984 + 1];
                        }
                        if (var40 > 0) {
                            int var46 = arg5;
                            int var47 = arg5 + 64;
                            int var48 = arg0;
                            if (arg5 < 0) {
                                var46 = 0;
                            } else if (arg5 >= field2745) {
                                var46 = field2745;
                            }
                            if (arg0 < 0) {
                                var48 = 0;
                            } else if (class78.field984 <= arg0) {
                                var48 = class78.field984;
                            }
                            if (var47 < 0) {
                                var47 = 0;
                            } else if (var47 >= field2745) {
                                var47 = field2745;
                            }
                            int var49 = arg0 + 64;
                            if (var49 < 0) {
                                var49 = 0;
                            } else if (var49 >= class78.field984) {
                                var49 = class78.field984;
                            }
                            while (var47 > var46) {
                                while (var48 < var49) {
                                    class157.field2114[var40][var46][var48] = class157.field2114[var40 - 1][var46][var48];
                                    var48++;
                                }
                                var46++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg4) {
            class199 var23 = null;
            while (true) {
                while (var16.field3762 < var16.field3764.length) {
                    int var28 = var16.method1738((byte) 121);
                    if (var28 == 0) {
                        var23 = new class199(var16);
                    } else if (var28 == 1) {
                        int var29 = var16.method1738((byte) -100);
                        if (var29 > 0) {
                            for (int var30 = 0; var30 < var29; var30++) {
                                class157 var31 = new class157(var16);
                                if (var31.field2099 == 31) {
                                    class111 var32 = class399.method2496(var16.method1767(1930493576), (byte) 64);
                                    var31.method1065(-22119, var32.field1536, var32.field1531, var32.field1533, var32.field1537);
                                }
                                var31.field4336 += arg0 << 7;
                                var31.field4337 += arg5 << 7;
                                int var33 = var31.field4337 >> 7;
                                int var34 = var31.field4336 >> 7;
                                if (var33 >= 0 && var34 >= 0 && var33 < field2745 && var34 < class78.field984) {
                                    var31.field4338 = class264.field3910[var31.field2100][var33][var34] - var31.field4338;
                                    if (arg2.method103() > 0) {
                                        class86.method583(var31);
                                    }
                                }
                            }
                        }
                    } else if (var28 == 2) {
                        if (var23 == null) {
                            var23 = new class199();
                        }
                        var23.method1381((byte) -116, var16);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                if (var23 != null) {
                    for (int var24 = 0; var24 < 8; var24++) {
                        for (int var25 = 0; var25 < 8; var25++) {
                            int var26 = (arg5 >> 3) + var24;
                            int var27 = (arg0 >> 3) + var25;
                            if (var26 >= 0 && var26 < (field2745 >> 3) && var27 >= 0 && (class78.field984 >> 3) > var27) {
                                class111.method791(var23, var27, false, var26);
                            }
                        }
                    }
                }
                break;
            }
        }
        if (!var21 && class157.field2114 != null) {
            for (int var35 = 0; var35 < 4; var35++) {
                if (class157.field2114[var35] != null) {
                    for (int var36 = 0; var36 < 16; var36++) {
                        for (int var37 = 0; var37 < 16; var37++) {
                            int var38 = (arg5 >> 2) + var36;
                            int var39 = (arg0 >> 2) + var37;
                            if (var38 >= 0 && var38 < 26 && var39 >= 0 && var39 < 26) {
                                class157.field2114[var35][var38][var39] = 0;
                            }
                        }
                    }
                }
            }
        }
        if (var20) {
            return class307.field4536;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
    public static void method1353(byte arg0) {
        field2753 = null;
        field2750 = null;
        if (arg0 <= 74) {
            field2753 = null;
        }
        field2752 = null;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lbf;)V")
    public static final void method1354(class336 arg0) {
        for (int var1 = arg0.field4961; var1 <= arg0.field4957; var1++) {
            for (int var2 = arg0.field4959; var2 <= arg0.field4950; var2++) {
                class369 var3 = class178.field2530[arg0.field4960][var1][var2];
                if (var3 != null) {
                    class206 var4 = var3.field5345;
                    class206 var5 = null;
                    while (var4 != null) {
                        if (var4.field2880 == arg0) {
                            if (var5 == null) {
                                var3.field5345 = var4.field2882;
                            } else {
                                var5.field2882 = var4.field2882;
                            }
                            var4.method1417(-30226);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field2882;
                    }
                    var3.field5326 = 0;
                    for (class206 var6 = var3.field5345; var6 != null; var6 = var6.field2882) {
                        var3.field5326 = (byte) (var3.field5326 | var6.field2890);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(II)V")
    public static final void method1355(int arg0, int arg1) {
        field2754++;
        int var2 = 75 / ((18 - arg1) / 59);
        class125 var3 = class56.method428(arg0, 3, -3636);
        var3.method847(87);
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static final void method1356(int arg0) {
        class188.method1285((byte) 113, false);
        field2748++;
        if (class393.field5713 >= 0 && class393.field5713 != 0) {
            class358.method2280(class393.field5713, true);
            class393.field5713 = -1;
        }
        if (arg0 > -74) {
            field2743 = -118;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IBIIII)V")
    public static final void method1357(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2751++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = 58 / ((arg1 + 3) / 51);
        int var13 = arg5 << 1;
        int var14 = (1 - var13) * var8 + var10;
        int var15 = var9 - (var13 - 1) * var11;
        int var16 = var8 << 2;
        int var17 = var9 << 2;
        int var18 = ((var6 << 1) + 3) * var10;
        int var19 = ((arg5 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg5 - 1) * var16;
        class381.method2419((byte) 17, arg0, arg4 - arg2, class323.field4774[arg3], arg2 + arg4);
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var18;
                    var20 += var17;
                    var6++;
                    var18 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var20;
                var14 += var18;
                var6++;
                var18 += var17;
                var20 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var19 -= var16;
            var7--;
            var21 -= var16;
            int var22 = arg3 - var7;
            int var23 = arg3 + var7;
            int var24 = arg4 + var6;
            int var25 = arg4 - var6;
            class381.method2419((byte) 7, arg0, var25, class323.field4774[var22], var24);
            class381.method2419((byte) 13, arg0, var25, class323.field4774[var23], var24);
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILkg;I)I")
    public static final int method1358(int arg0, class223 arg1, int arg2) {
        field2744++;
        if (!client.method1811(arg1).method2165(arg2, (byte) -126) && arg1.field3219 == null) {
            return -1;
        } else {
            if (arg0 < 19) {
                field2745 = 95;
            }
            return arg1.field3356 == null || arg2 >= arg1.field3356.length ? -1 : arg1.field3356[arg2];
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILwc;I)V")
    public static final void method1359(int arg0, int arg1, class380 arg2, int arg3) {
        if (arg2.field751 == arg1 && arg1 != -1) {
            class196 var4 = class83.method556(arg1, 125);
            int var5 = var4.field2769;
            if (var5 == 1) {
                arg2.field737 = arg3;
                arg2.field717 = 0;
                arg2.field780 = 1;
                arg2.field763 = 0;
                arg2.field756 = 0;
                class446.method2739(var4, class187.field2619 == arg2, arg2.field4960, arg2.field717, -49, arg2.field4954, arg2.field4951);
            }
            if (var5 == 2) {
                arg2.field763 = 0;
            }
        } else if (arg1 == -1 || arg2.field751 == -1 || class83.method556(arg1, arg0 + 78).field2775 >= class83.method556(arg2.field751, 66).field2775) {
            arg2.field785 = arg2.field790;
            arg2.field763 = 0;
            arg2.field780 = 1;
            arg2.field717 = 0;
            arg2.field756 = 0;
            arg2.field751 = arg1;
            arg2.field737 = arg3;
            if (arg2.field751 != -1) {
                class446.method2739(class83.method556(arg2.field751, 66), class187.field2619 == arg2, arg2.field4960, arg2.field717, arg0 - 49, arg2.field4954, arg2.field4951);
            }
        }
        if (arg0 != 0) {
            field2752 = null;
        }
        field2746++;
    }
}
