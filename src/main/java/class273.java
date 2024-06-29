import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class273 extends class286 {

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "I")
    private int field4584 = 3072;

    @OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
    private int field4591 = 1024;

    @OriginalMember(owner = "client!sh", name = "Y", descriptor = "I")
    private int field4595 = 2048;

    @OriginalMember(owner = "client!sh", name = "R", descriptor = "I")
    public static int field4588 = 0;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!sh", name = "S", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!sh", name = "V", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!sh", name = "X", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!sh", name = "Q", descriptor = "[Lqb;")
    public static class95[] field4587;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "(I)V", line = 7)
    public static void method1837(int arg0) {
        int var1 = -8 / ((arg0 + 86) / 35);
        field4587 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)[I", line = 30)
    public final int[] method14(int arg0, int arg1) {
        field4586++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (arg0 >= -52) {
            return (int[]) null;
        }
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            for (int var5 = 0; var5 < class27.field410; var5++) {
                var3[var5] = (var4[var5] * this.field4595 >> 12) + this.field4591;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 83)
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)V", line = 89)
    public final void method276(int arg0) {
        field4592++;
        this.field4595 = this.field4584 - this.field4591;
        if (arg0 != 3) {
            field4588 = 86;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IB)[[I", line = 102)
    public final int[][] method16(int arg0, byte arg1) {
        field4589++;
        if (arg1 != -19) {
            method1838(false);
        }
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field410; var11++) {
                var8[var11] = this.field4591 + (var5[var11] * this.field4595 >> 12);
                var9[var11] = this.field4591 + (var6[var11] * this.field4595 >> 12);
                var10[var11] = (var7[var11] * this.field4595 >> 12) + this.field4591;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(Z)V", line = 147)
    public static final void method1838(boolean arg0) {
        if (!arg0) {
            class34.field502.method1631(-27875);
            field4590++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lfe;ZI)V", line = 172)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field4587 = (class95[]) null;
        }
        field4594++;
        if (arg2 == 0) {
            this.field4591 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field4584 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field4876 = arg0.method1535((byte) 92) == 1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIIIBI)V", line = 218)
    public static final void method1839(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class210.field3586 = 0;
        for (int var7 = -1; var7 < class297.field5033 + class242.field4078; var7++) {
            class70 var8;
            if (var7 == -1) {
                var8 = class213.field3624;
            } else if (class297.field5033 <= var7) {
                var8 = class33.field493[class219.field3698[var7 - class297.field5033]];
            } else {
                var8 = class149.field2436[class162.field2666[var7]];
            }
            if (var8 != null && var8.method395(true)) {
                if (var8 instanceof class60) {
                    class129 var9 = ((class60) var8).field822;
                    if (var9.field2193 != null) {
                        var9 = var9.method806((byte) 112);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class297.field5033) {
                    class129 var15 = ((class60) var8).field822;
                    if (var15.field2193 != null) {
                        var15 = var15.method806((byte) 121);
                    }
                    if (var15.field2162 >= 0 && class217.field3680.length > var15.field2162) {
                        int var16;
                        if (var15.field2161 == -1) {
                            var16 = var8.method456(true) + 15;
                        } else {
                            var16 = var15.field2161 + 15;
                        }
                        class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var16, true, arg1, var8);
                        if (class208.field3566 > -1) {
                            class217.field3680[var15.field2162].method711(arg2 + class208.field3566 - 12, class61.field858 + -30 + arg0);
                        }
                    }
                    class290[] var17 = class38.field555;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class290 var19 = var17[var18];
                        if (var19 != null && var19.field4907 == 1 && class219.field3698[var7 - class297.field5033] == var19.field4908 && class75.field1309 % 20 < 10) {
                            int var20;
                            if (var15.field2161 == -1) {
                                var20 = var8.method456(true) + 15;
                            } else {
                                var20 = var15.field2161 + 15;
                            }
                            class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var20, true, arg1, var8);
                            if (class208.field3566 > -1) {
                                class54.field751[var19.field4925].method711(arg2 + class208.field3566 - 12, class61.field858 + arg0 + -28);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class191 var11 = (class191) var8;
                    if (var11.field3289 != -1 || var11.field3273 != -1) {
                        class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var8.method456(true) + 15, true, arg1, var8);
                        if (class208.field3566 > -1) {
                            if (var11.field3289 != -1) {
                                class72.field1277[var11.field3289].method711(arg2 + class208.field3566 - 12, class61.field858 + arg0 - var10);
                                var10 += 25;
                            }
                            if (var11.field3273 != -1) {
                                class217.field3680[var11.field3273].method711(arg2 + class208.field3566 - 12, -var10 + arg0 + class61.field858);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class290[] var13 = class38.field555;
                        while (var12 < var13.length) {
                            class290 var14 = var13[var12];
                            if (var14 != null && var14.field4907 == 10 && class162.field2666[var7] == var14.field4908) {
                                class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var8.method456(true) + 15, true, arg1, var8);
                                if (class208.field3566 > -1) {
                                    class54.field751[var14.field4925].method711(class208.field3566 + arg2 - 12, -var10 + class61.field858 + arg0);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field1190 != null && (var7 >= class297.field5033 || class297.field5029 == 0 || class297.field5029 == 3 || class297.field5029 == 1 && class128.method799(0, ((class191) var8).field3274))) {
                    class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var8.method456(true), true, arg1, var8);
                    if (class208.field3566 > -1 && class210.field3586 < class76.field1328) {
                        class76.field1326[class210.field3586] = class240.field4056.method1656(var8.field1190) / 2;
                        class76.field1334[class210.field3586] = class240.field4056.field4137;
                        class76.field1332[class210.field3586] = class208.field3566;
                        class76.field1324[class210.field3586] = class61.field858;
                        class76.field1321[class210.field3586] = var8.field1194;
                        class76.field1333[class210.field3586] = var8.field1162;
                        class76.field1323[class210.field3586] = var8.field1189;
                        class76.field1331[class210.field3586] = var8.field1190;
                        class210.field3586++;
                    }
                }
                if (var8.field1213 > class75.field1309) {
                    class107 var21 = class280.field4683[0];
                    class107 var22 = class280.field4683[1];
                    int var26;
                    if (var8 instanceof class60) {
                        class60 var23 = (class60) var8;
                        class107[] var24 = (class107[]) ((class107[]) class217.field3678.method1629(arg5 ^ 0xFFFFFFD8, (long) var23.field822.field2150));
                        if (var24 == null) {
                            var24 = class122.method773(class69.field1067, 93, 0, var23.field822.field2150);
                            if (var24 != null) {
                                class217.field3678.method1630(true, (long) var23.field822.field2150, var24);
                            }
                        }
                        class129 var25 = var23.field822;
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[0];
                            var22 = var24[1];
                        }
                        if (var25.field2161 == -1) {
                            var26 = var8.method456(true);
                        } else {
                            var26 = var25.field2161;
                        }
                    } else {
                        var26 = var8.method456(true);
                    }
                    class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var26 + var21.field1821 + 10, true, arg1, var8);
                    if (class208.field3566 > -1) {
                        int var27 = class61.field858 + arg0 - 3;
                        int var28 = arg2 + class208.field3566 - (var21.field1828 >> 1);
                        var21.method711(var28, var27);
                        int var29 = var21.field1821;
                        int var30 = var8.field1214 * var21.field1828 / 255;
                        class311.method2103(var28, var27, var28 + var30, var27 + var29);
                        var22.method711(var28, var27);
                        class311.method2114(arg2, arg0, arg2 + arg3, arg0 + arg4);
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class75.field1309 < var8.field1195[var31]) {
                        int var32;
                        if ((var8 instanceof class60)) {
                            class60 var33 = (class60) var8;
                            class129 var34 = var33.field822;
                            if (var34.field2161 == -1) {
                                var32 = var8.method456(true) / 2;
                            } else {
                                var32 = var34.field2161 / 2;
                            }
                        } else {
                            var32 = var8.method456(true) / 2;
                        }
                        class257.method1736(arg3 >> 1, arg4 >> 1, arg6, var32, true, arg1, var8);
                        if (class208.field3566 > -1) {
                            if (var31 == 1) {
                                class61.field858 -= 20;
                            }
                            if (var31 == 2) {
                                class61.field858 -= 10;
                                class208.field3566 -= 15;
                            }
                            if (var31 == 3) {
                                class208.field3566 += 15;
                                class61.field858 -= 10;
                            }
                            class280.field4677[var8.field1157[var31]].method711(class208.field3566 + arg2 - 12, class61.field858 + arg0 + -12);
                            class107.field1831.method1648(class296.method2012(var8.field1201[var31], (byte) -2), arg2 - (1 - class208.field3566), class61.field858 + 3 + arg0, 16777215, 0);
                        }
                    }
                }
            }
        }
        field4593++;
        if (arg5 != -83) {
            method1839(91, 62, 58, -67, -6, (byte) -2, -28);
        }
        for (int var35 = 0; var35 < class210.field3586; var35++) {
            int var36 = class76.field1332[var35];
            int var37 = class76.field1324[var35];
            int var38 = class76.field1326[var35];
            boolean var39 = true;
            int var40 = class76.field1334[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class76.field1324[var41] - class76.field1334[var41] < var37 + 2 && (var37 - var40) < (class76.field1324[var41] + 2) && var36 - var38 < class76.field1332[var41] + class76.field1326[var41] && (class76.field1332[var41] - class76.field1326[var41]) < (var36 + var38) && var37 > class76.field1324[var41] - class76.field1334[var41]) {
                        var39 = true;
                        var37 = class76.field1324[var41] - class76.field1334[var41];
                    }
                }
            }
            class208.field3566 = class76.field1332[var35];
            class61.field858 = class76.field1324[var35] = var37;
            class283 var42 = class76.field1331[var35];
            if (class68.field954 == 0) {
                int var43 = 16776960;
                if (class76.field1321[var35] < 6) {
                    var43 = class20.field311[class76.field1321[var35]];
                }
                if (class76.field1321[var35] == 6) {
                    var43 = class309.field5285 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class76.field1321[var35] == 7) {
                    var43 = (class309.field5285 % 20) < 10 ? 255 : 65535;
                }
                if (class76.field1321[var35] == 8) {
                    var43 = (class309.field5285 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class76.field1321[var35] == 9) {
                    int var44 = 150 - class76.field1323[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - var44 * 327680;
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 65280 - 500;
                    }
                }
                if (class76.field1321[var35] == 10) {
                    int var45 = 150 - class76.field1323[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 + 16384000 - var45 * 327680;
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 + 255 - ((var45 - 100) * 5) - 32768000;
                    }
                }
                if (class76.field1321[var35] == 11) {
                    int var46 = 150 - class76.field1323[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class76.field1333[var35] == 0) {
                    class240.field4056.method1648(var42, class208.field3566 + arg2, arg0 - -class61.field858, var43, 0);
                }
                if (class76.field1333[var35] == 1) {
                    class240.field4056.method1645(var42, class208.field3566 + arg2, class61.field858 + arg0, var43, 0, class309.field5285);
                }
                if (class76.field1333[var35] == 2) {
                    class240.field4056.method1659(var42, class208.field3566 + arg2, class61.field858 + arg0, var43, 0, class309.field5285);
                }
                if (class76.field1333[var35] == 3) {
                    class240.field4056.method1641(var42, arg2 + class208.field3566, class61.field858 + arg0, var43, 0, class309.field5285, 150 - class76.field1323[var35]);
                }
                if (class76.field1333[var35] == 4) {
                    int var47 = (150 - class76.field1323[var35]) * (class240.field4056.method1656(var42) + 100) / 150;
                    class311.method2103(arg2 + class208.field3566 - 50, arg0, class208.field3566 + arg2 + 50, arg0 - -arg4);
                    class240.field4056.method1643(var42, arg2 + class208.field3566 + 50 - var47, arg0 - -class61.field858, var43, 0);
                    class311.method2114(arg2, arg0, arg2 + arg3, arg0 + arg4);
                }
                if (class76.field1333[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class76.field1323[var35];
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class311.method2103(arg2, arg0 - (class240.field4056.field4137 - class61.field858) - 1, arg2 + arg3, class61.field858 + arg0 + 5);
                    class240.field4056.method1648(var42, class208.field3566 + arg2, class61.field858 + arg0 - -var48, var43, 0);
                    class311.method2114(arg2, arg0, arg2 + arg3, arg0 - -arg4);
                }
            } else {
                class240.field4056.method1648(var42, class208.field3566 + arg2, arg0 - -class61.field858, 16776960, 0);
            }
        }
    }
}
