import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class42 extends class86 {

    @OriginalMember(owner = "client!fm", name = "Hb", descriptor = "I")
    public static int field801 = -1;

    @OriginalMember(owner = "client!fm", name = "Bb", descriptor = "Lqd;")
    public static class40 field795 = class147.method1106("Schrifts-=tze geladen)3", (byte) -56);

    @OriginalMember(owner = "client!fm", name = "Lb", descriptor = "Lqd;")
    public static class40 field805 = class147.method1106("Loading world list data", (byte) -76);

    @OriginalMember(owner = "client!fm", name = "zb", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!fm", name = "Ab", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!fm", name = "Db", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!fm", name = "Eb", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!fm", name = "Fb", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!fm", name = "Gb", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!fm", name = "Ib", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!fm", name = "Jb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!fm", name = "Kb", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!fm", name = "Cb", descriptor = "Loe;")
    public class121 field796;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIZLrf;IILpi;IIIIIII)Lrf;", line = 4)
    public static final class266 method384(int arg0, int arg1, boolean arg2, class266 arg3, int arg4, int arg5, class300 arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field798++;
        long var14 = ((long) arg8 << 48) + ((long) ((arg11 << 16) + (arg13 << 24) + arg7) + ((long) arg1 << 32));
        class266 var16 = (class266) class39.field705.method1345(var14, 28150);
        if (var16 == null) {
            byte var17;
            if (arg7 == 1) {
                var17 = 9;
            } else if (arg7 == 2) {
                var17 = 12;
            } else if (arg7 == 3) {
                var17 = 15;
            } else if (arg7 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            int[] var18 = new int[] { 64, 96, 128 };
            byte var19 = 3;
            class311 var20 = new class311(var17 * var19 + 1, var19 * 2 * var17 + -var17, 0);
            int var21 = var20.method2134(0, 0, 0);
            int[][] var22 = new int[var19][var17];
            for (int var23 = 0; var23 < var19; var23++) {
                int var24 = var18[var23];
                int var25 = var18[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = arg9 + (class203.field3208[var27] * var24) >> 16;
                    int var29 = class203.field3216[var27] * var25 + arg5 >> 16;
                    var22[var23][var26] = var20.method2134(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var19; var30++) {
                int var31 = (var30 * 256 + 128) / var19;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg11 * var32 + arg13 * var31 >> 8);
                short var34 = (short) (((arg1 & 0x380) * var32 + (arg8 & 0x380) * var31 & 0x38000) + ((arg1 & 0xFC00) * var32 + (arg8 & 0xFC00) * var31 & 0xFC0000) + ((arg1 & 0x7F) * var32 + (arg8 & 0x7F) * var31 & 0x7F00) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var20.method2123(var21, var22[0][(var35 + 1) % var17], var22[0][var35], (byte) 1, var34, var33);
                    } else {
                        var20.method2123(var22[var30 - 1][var35], var22[var30 - 1][(var35 + 1) % var17], var22[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var20.method2123(var22[var30 - 1][var35], var22[var30][(var35 + 1) % var17], var22[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var20.method2138(64, 768, -50, -10, -50);
            class39.field705.method1350(var16, var14, 127);
        }
        int var36 = arg7 * 64 - 1;
        if (arg4 <= 14) {
            field801 = -48;
        }
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = var36;
        int var41 = arg3.method1136();
        if (arg2) {
            if (arg10 > 640 && arg10 < 1408) {
                var40 = var36 + 128;
            }
            if (arg10 > 1664 || arg10 < 384) {
                var38 -= 128;
            }
            if (arg10 > 1152 && arg10 < 1920) {
                var39 = var36 + 128;
            }
            if (arg10 > 128 && arg10 < 896) {
                var37 -= 128;
            }
        }
        if (var37 > var41) {
            var41 = var37;
        }
        int var42 = arg3.method1154();
        int var43 = arg3.method1178();
        int var44 = arg3.method1163();
        if (var42 > var39) {
            var42 = var39;
        }
        class76 var45 = null;
        if (var44 > var40) {
            var44 = var40;
        }
        if (arg6 != null) {
            int var46 = arg6.field5018[arg12];
            var45 = class227.method1591(21770, var46 >> 16);
            arg12 = var46 & 0xFFFF;
        }
        if (var43 < var38) {
            var43 = var38;
        }
        class266 var47;
        if (var45 == null) {
            var47 = var16.method1161(true, true);
            var47.method1182((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method1150((var41 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method1161(!var45.method562((byte) -102, arg12), true);
            var47.method1182((var42 - var41) / 2, 128, (var44 - var43) / 2);
            var47.method1150((var41 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method1157(var45, arg12);
        }
        if (arg10 != 0) {
            var47.method1148(arg10);
        }
        if (class21.field350) {
            class152 var50 = (class152) var47;
            if (class293.method2012(class160.field2671, arg5 + var43, 0, arg9 + var41) != arg0 || class293.method2012(class160.field2671, arg5 + var44, 0, arg9 + var42) != arg0) {
                for (int var51 = 0; var51 < var50.field2554; var51++) {
                    var50.field2547[var51] += class293.method2012(class160.field2671, var50.field2563[var51] + arg5, 0, var50.field2568[var51] + arg9) - arg0;
                }
                var50.field2544.field3854 = false;
                var50.field2586.field4378 = false;
            }
        } else {
            class175 var48 = (class175) var47;
            if (class293.method2012(class160.field2671, arg5 + var43, 0, arg9 + var41) != arg0 || class293.method2012(class160.field2671, arg5 + var44, 0, arg9 + var42) != arg0) {
                for (int var49 = 0; var49 < var48.field2849; var49++) {
                    var48.field2843[var49] += class293.method2012(class160.field2671, var48.field2831[var49] + arg5, 0, var48.field2845[var49] + arg9) - arg0;
                }
                var48.field2854 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIIJ)V", line = 235)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field794++;
        if (this.field796 == null) {
            return;
        }
        class300 var11 = this.field1519 != -1 && this.field1529 == 0 ? class20.method128(110, this.field1519) : null;
        class300 var12 = this.field1514 == -1 || this.field1533 == this.field1514 && var11 != null ? null : class20.method128(55, this.field1514);
        class266 var13 = this.field796.method913((byte) -123, var11, this.field1487, this.field1534, var12);
        if (var13 == null) {
            return;
        }
        this.field1520 = var13.method74();
        class121 var14 = this.field796;
        if (var14.field2098 != null) {
            var14 = var14.method918(-1);
        }
        if (class96.field1728 && var14.field2110) {
            class266 var15 = method384(this.field1539, this.field796.field2094, this.field1530, var13, 78, this.field1497, var12 == null ? var11 : var12, this.field796.field2089, this.field796.field2084, this.field1531, arg0, this.field796.field2059, var12 == null ? this.field1534 : this.field1487, this.field796.field2074);
            if (class21.field350) {
                float var16 = class21.method159();
                float var17 = class21.method156();
                class21.method150();
                class21.method138(var16, var17 - 150.0F);
                var15.method77(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
                class21.method163();
                class21.method138(var16, var17);
            } else {
                var15.method77(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L);
            }
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        if (this.field796.field2087 != 0 || this.field796.field2058 != 0) {
            int var21 = class203.field3208[arg0];
            int var22 = class203.field3216[arg0];
            short var23 = this.field796.field2087;
            short var24 = this.field796.field2058;
            int var25 = -var23 / 2;
            int var26 = -var24 / 2;
            int var27 = var21 * var26 + var22 * var25 >> 16;
            int var28 = var22 * var26 - (var21 * var25) >> 16;
            int var29 = class293.method2012(class160.field2671, this.field1497 + var28, 0, this.field1531 + var27);
            int var30 = var23 / 2;
            int var31 = -var24 / 2;
            int var32 = var21 * var31 + var22 * var30 >> 16;
            int var33 = var22 * var31 - (var21 * var30) >> 16;
            int var34 = -var23 / 2;
            int var35 = class293.method2012(class160.field2671, this.field1497 + var33, 0, this.field1531 + var32);
            int var36 = var24 / 2;
            int var37 = var21 * var36 + (var22 * var34) >> 16;
            int var38 = var23 / 2;
            int var39 = var24 / 2;
            int var40 = var22 * var36 - (var21 * var34) >> 16;
            int var41 = class293.method2012(class160.field2671, this.field1497 + var40, 0, this.field1531 + var37);
            int var42 = var22 * var39 - (var21 * var38) >> 16;
            int var43 = var21 * var39 + var22 * var38 >> 16;
            int var44 = var29 < var35 ? var29 : var35;
            int var45 = class293.method2012(class160.field2671, this.field1497 + var42, 0, this.field1531 + var43);
            int var46 = var29 + var45;
            if (var46 > var35 + var41) {
                var46 = var35 + var41;
            }
            int var47 = var41 < var45 ? var41 : var45;
            int var48 = var35 < var45 ? var35 : var45;
            if (var24 != 0) {
                var18 = (int) (Math.atan2((double) (var44 - var47), (double) var24) * 325.95D) & 0x7FF;
                if (var18 != 0) {
                    var13.method1155(var18);
                }
            }
            int var49 = var41 > var29 ? var29 : var41;
            if (var23 != 0) {
                var20 = (int) (Math.atan2((double) (var49 - var48), (double) var23) * 325.95D) & 0x7FF;
                if (var20 != 0) {
                    var13.method1158(var20);
                }
            }
            var19 = (var46 >> 1) - this.field1539;
            if (var19 != 0) {
                var13.method1150(0, var19, 0);
            }
        }
        class266 var50 = null;
        if (this.field1502 != -1 && this.field1526 != -1) {
            class276 var51 = class185.method1339(-454810365, this.field1502);
            var50 = var51.method1921(180, this.field1526);
            if (var50 != null) {
                var50.method1150(0, -this.field1479, 0);
                if (var51.field4590) {
                    if (var18 != 0) {
                        var50.method1155(var18);
                    }
                    if (var20 != 0) {
                        var50.method1158(var20);
                    }
                    if (var19 != 0) {
                        var50.method1150(0, var19, 0);
                    }
                }
            }
        }
        if (!class21.field350) {
            if (var50 != null) {
                var13 = ((class175) var13).method1282(var50);
            }
            if (this.field796.field2089 == 1) {
                var13.field4451 = true;
            }
            var13.method77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            return;
        }
        if (this.field796.field2089 == 1) {
            var13.field4451 = true;
        }
        var13.method77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        if (var50 != null) {
            if (this.field796.field2089 == 1) {
                var50.field4451 = true;
            }
            var50.method77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(Z)V", line = 436)
    public static void method385(boolean arg0) {
        field795 = null;
        if (!arg0) {
            field805 = (class40) null;
        }
        field805 = null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z", line = 450)
    public final boolean method386(int arg0) {
        if (arg0 != 64) {
            this.field796 = (class121) null;
        }
        field804++;
        return this.field796 != null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLsd;)V", line = 464)
    public static final void method387(byte arg0, class26 arg1) {
        field802++;
        if ((arg1.field472.length - arg1.field478) < 1) {
            return;
        }
        int var2 = arg1.method226(arg0 ^ 0xFFFFFF78);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field472.length - arg1.field478) {
            return;
        }
        class162.field2692 = arg1.method226(255);
        if (class162.field2692 < 1) {
            class162.field2692 = 1;
        } else if (class162.field2692 > 4) {
            class162.field2692 = 4;
        }
        class129.method963(false, arg1.method226(255) == 1);
        class194.field3131 = arg1.method226(arg0 ^ 0xFFFFFF78) == 1;
        class217.field3623 = arg1.method226(arg0 ^ 0xFFFFFF78) == 1;
        class81.field1429 = arg1.method226(255) == 1;
        class250.field4144 = arg1.method226(255) == 1;
        class223.field3704 = arg1.method226(255) == 1;
        class104.field1847 = arg1.method226(255) == 1;
        class96.field1728 = arg1.method226(255) == 1;
        class285.field4804 = arg1.method226(255);
        if (arg0 != -121) {
            method390(-70, -125);
        }
        if (class285.field4804 > 2) {
            class285.field4804 = 2;
        }
        if (var2 < 2) {
            class1.field8 = arg1.method226(255) == 1;
            arg1.method226(255);
        } else {
            class1.field8 = arg1.method226(255) == 1;
        }
        class178.field2929 = arg1.method226(255) == 1;
        class206.field3287 = arg1.method226(arg0 ^ -136) == 1;
        class296.field4952 = arg1.method226(arg0 + 376);
        if (class296.field4952 > 2) {
            class296.field4952 = 2;
        }
        class104.field1848 = class296.field4952;
        class142.field2387 = arg1.method226(255) == 1;
        class94.field1698 = arg1.method226(255);
        if (class94.field1698 > 127) {
            class94.field1698 = 127;
        }
        class90.field1636 = arg1.method226(255);
        class105.field1854 = arg1.method226(255);
        if (class105.field1854 > 127) {
            class105.field1854 = 127;
        }
        if (var2 >= 1) {
            class159.field2665 = arg1.method197(-1);
            class182.field2961 = arg1.method197(arg0 + 120);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method226(255);
        }
        if (var2 >= 4) {
            arg1.method226(arg0 ^ 0xFFFFFF78);
        }
        if (var2 >= 5) {
            class213.field3497 = arg1.method203(-22066);
        }
        if (var2 >= 6) {
            class204.field3230 = arg1.method226(255);
        }
        if (var2 >= 7) {
            class33.field669 = arg1.method226(arg0 + 376) == 1;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "()I", line = 593)
    public final int method74() {
        field800++;
        return this.field1520;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)I", line = 607)
    public static final int method388(int arg0, boolean arg1) {
        field799++;
        if (arg1) {
            field797 = 42;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Lnj;", line = 620)
    public static final class218 method389(int arg0, byte arg1) {
        field803++;
        class218 var2 = (class218) class89.field1608.method1345((long) arg0, 28150);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4155.method1651(3, arg0, -1);
        int var4 = 123 % ((arg1 + 67) / 43);
        class218 var5 = new class218();
        if (var3 != null) {
            var5.method1533(new class26(var3), (byte) -111);
        }
        class89.field1608.method1350(var5, (long) arg0, 93);
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)I", line = 645)
    public static final int method390(int arg0, int arg1) {
        if (arg0 != -5) {
            field795 = (class40) null;
        }
        field793++;
        return arg1 & 0x7F;
    }
}
