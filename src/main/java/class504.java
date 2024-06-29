import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class504 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "[I")
    private int[] field7384;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "[B")
    private byte[] field7391;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "[I")
    private int[] field7381;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lwi;")
    public static class324 field7385 = new class324();

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "F")
    public static float field7389 = 0.25F;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Lst;")
    public static class296 field7390 = new class296();

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "[Lqc;")
    public static class521[] field7393 = new class521[4];

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public static int field7386;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field7392;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7392++;
        class46.method290(true, arg0);
        int var7 = 0;
        int var8 = arg0 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var8;
        int var12 = -78 % ((arg3 - 68) / 41);
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        if (class37.field393 <= arg6 && class509.field7436 >= arg6) {
            int[] var16 = class339.field4800[arg6];
            int var17 = class42.method249(class494.field7297, arg2 - arg0, (byte) -72, class445.field6629);
            int var18 = class42.method249(class494.field7297, arg0 + arg2, (byte) -72, class445.field6629);
            int var19 = class42.method249(class494.field7297, arg2 - var8, (byte) -72, class445.field6629);
            int var20 = class42.method249(class494.field7297, arg2 + var8, (byte) -72, class445.field6629);
            class415.method2491(var19, var17, var16, arg5, -31541);
            class415.method2491(var20, var19, var16, arg4, -31541);
            class415.method2491(var18, var20, var16, arg5, -31541);
        }
        while (var9 > var7) {
            var15 += 2;
            var14 += 2;
            var13 += var15;
            var10 += var14;
            if (var13 >= 0 && var11 >= 1) {
                var11--;
                var13 -= var11 << 1;
                class159.field2352[var11] = var7;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var21 = arg6 - var9;
                int var22 = arg6 + var9;
                if (var22 >= class37.field393 && class509.field7436 >= var21) {
                    if (var8 > var9) {
                        int var23 = class159.field2352[var9];
                        int var24 = class42.method249(class494.field7297, arg2 + var7, (byte) -72, class445.field6629);
                        int var25 = class42.method249(class494.field7297, arg2 - var7, (byte) -72, class445.field6629);
                        int var26 = class42.method249(class494.field7297, arg2 + var23, (byte) -72, class445.field6629);
                        int var27 = class42.method249(class494.field7297, arg2 - var23, (byte) -72, class445.field6629);
                        if (class509.field7436 >= var22) {
                            int[] var28 = class339.field4800[var22];
                            class415.method2491(var27, var25, var28, arg5, -31541);
                            class415.method2491(var26, var27, var28, arg4, -31541);
                            class415.method2491(var24, var26, var28, arg5, -31541);
                        }
                        if (var21 >= class37.field393) {
                            int[] var29 = class339.field4800[var21];
                            class415.method2491(var27, var25, var29, arg5, -31541);
                            class415.method2491(var26, var27, var29, arg4, -31541);
                            class415.method2491(var24, var26, var29, arg5, -31541);
                        }
                    } else {
                        int var30 = class42.method249(class494.field7297, arg2 + var7, (byte) -72, class445.field6629);
                        int var31 = class42.method249(class494.field7297, arg2 - var7, (byte) -72, class445.field6629);
                        if (var22 <= class509.field7436) {
                            class415.method2491(var30, var31, class339.field4800[var22], arg5, -31541);
                        }
                        if (var21 >= class37.field393) {
                            class415.method2491(var30, var31, class339.field4800[var21], arg5, -31541);
                        }
                    }
                }
            }
            int var32 = arg6 - var7;
            int var33 = arg6 + var7;
            if (var33 >= class37.field393 && class509.field7436 >= var32) {
                int var34 = arg2 + var9;
                int var35 = arg2 - var9;
                if (var34 >= class494.field7297 && class445.field6629 >= var35) {
                    int var36 = class42.method249(class494.field7297, var34, (byte) -72, class445.field6629);
                    int var37 = class42.method249(class494.field7297, var35, (byte) -72, class445.field6629);
                    if (var7 < var8) {
                        int var38 = var7 > var11 ? class159.field2352[var7] : var11;
                        int var39 = class42.method249(class494.field7297, arg2 + var38, (byte) -72, class445.field6629);
                        int var40 = class42.method249(class494.field7297, arg2 - var38, (byte) -72, class445.field6629);
                        if (class509.field7436 >= var33) {
                            int[] var41 = class339.field4800[var33];
                            class415.method2491(var40, var37, var41, arg5, -31541);
                            class415.method2491(var39, var40, var41, arg4, -31541);
                            class415.method2491(var36, var39, var41, arg5, -31541);
                        }
                        if (class37.field393 <= var32) {
                            int[] var42 = class339.field4800[var32];
                            class415.method2491(var40, var37, var42, arg5, -31541);
                            class415.method2491(var39, var40, var42, arg4, -31541);
                            class415.method2491(var36, var39, var42, arg5, -31541);
                        }
                    } else {
                        if (var33 <= class509.field7436) {
                            class415.method2491(var36, var37, class339.field4800[var33], arg5, -31541);
                        }
                        if (var32 >= class37.field393) {
                            class415.method2491(var36, var37, class339.field4800[var32], arg5, -31541);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3001(int arg0, String arg1) {
        field7387++;
        if (class18.field194 == null) {
            return;
        }
        class291.method1861((byte) -104, class267.field3901);
        class60.field894++;
        class356.field5471.method1410(class456.method2739((byte) -103, arg1), -27645);
        int var2 = -21 % ((-arg0 - 19) / 47);
        class356.field5471.method1418(true, arg1);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
    public static void method3002(int arg0) {
        field7385 = null;
        if (arg0 > -69) {
            field7389 = -1.90266F;
        }
        field7393 = null;
        field7390 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "([BI[BIII)I")
    public final int method3003(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field7382++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = 0;
        if (arg1 != -2896) {
            return -56;
        }
        int var8 = arg4 + arg5;
        int var9 = arg3;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var11;
            if ((var11 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var12;
            if ((var12 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var13;
            if ((var13 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var14;
            if ((var14 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var15;
            if ((var15 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var16;
            if ((var16 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var17;
            if ((var17 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (arg4 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field7381[var7];
            }
            int var18;
            if ((var18 = this.field7381[var7]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (var8 <= arg4) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIC)I")
    public static final int method3004(int arg0, int arg1, char arg2) {
        if (arg0 != 17077) {
            field7389 = -0.38636258F;
        }
        field7383++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[B[BIB)I")
    public final int method3005(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, byte arg5) {
        field7388++;
        int var7 = 0;
        int var8 = -71 / ((arg5 + 30) / 62);
        int var9 = arg0 + arg4;
        int var10 = arg1 << 3;
        while (arg0 < var9) {
            int var11 = arg2[arg0] & 0xFF;
            int var12 = this.field7384[var11];
            byte var13 = this.field7391[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 >> 3;
            int var15 = var10 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var15 + var13 - 1 >> 3) + var14;
            var10 += var13;
            int var18 = var15 + 24;
            arg3[var14] = (byte) (var7 = class18.method119(var16, var12 >>> var18));
            if (var14 < var17) {
                var15 = var18 - 8;
                var14++;
                arg3[var14] = (byte) (var7 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg3[var14] = (byte) (var7 = var12 >>> var15);
                    if (var14 < var17) {
                        var15 -= 8;
                        var14++;
                        arg3[var14] = (byte) (var7 = var12 >>> var15);
                        if (var17 > var14) {
                            var14++;
                            var15 -= 8;
                            arg3[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var10 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([B)V")
    public class504(byte[] arg0) {
        int var2 = arg0.length;
        this.field7384 = new int[var2];
        this.field7391 = arg0;
        this.field7381 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field7384[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class18.method119(var12, var11);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field7381[var14] == 0) {
                            this.field7381[var14] = var4;
                        }
                        var14 = this.field7381[var14];
                    }
                    if (this.field7381.length <= var14) {
                        int[] var17 = new int[this.field7381.length * 2];
                        for (int var18 = 0; var18 < this.field7381.length; var18++) {
                            var17[var18] = this.field7381[var18];
                        }
                        this.field7381 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field7381[var14] = ~var5;
            }
        }
    }
}
