import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class174 extends class223 {

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2678 = "Take";

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "[I")
    public static int[] field2677 = new int[100];

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field2685 = 0;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field2684 = 127;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "F")
    public static float field2689;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "Ljava/awt/Image;")
    public static Image field2687;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "[I")
    public static int[] field2691;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "[Lug;")
    private class210[] field2680;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V")
    public static final void method1241(int arg0) {
        ++field2696;
        if (arg0 == -1143236788) {
            for (int var1 = 0; ~class117.field1782 < ~var1; ++var1) {
                int var2 = class255.field4084[var1];
                class161 var3 = class116.field1781[var2];
                if (var3 != null) {
                    class208.method1453(18964, var3.field2421.field1539, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)I")
    public static final int method1242(byte arg0) {
        ++field2679;
        if (arg0 < 83) {
            method1242((byte) -1);
        }
        return 15;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(BI)[I")
    public final int[] method40(byte arg0, int arg1) {
        if (arg0 <= 14) {
            this.method1246((int[][]) null, -44);
        }
        int[] var3 = super.field3588.method1611(0, arg1);
        if (super.field3588.field3722) {
            this.method1246(super.field3588.method1612((byte) 105), -577);
        }
        ++field2693;
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
    public class174() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        if (arg0 == -31) {
            field2691 = null;
            field2677 = null;
            field2678 = null;
            field2687 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V")
    public static final void method1244(int arg0) {
        class234.field3700 = null;
        if (arg0 != 21098) {
            method1242((byte) -89);
        }
        ++field2681;
        class268.method1815(0, 0, class298.field4803, 0, (byte) -46, -1, 0, class163.field2449, class179.field2816);
        if (class234.field3700 != null) {
            class247.method1672(arg0 + -20975, 0, class44.field732, class234.field3700, class244.field3894.field3492, class179.field2816, class167.field2523, 0, -1412584499, class163.field2449);
            class234.field3700 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1245(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class215.method1482((byte) -112, arg2);
        int var7 = -arg0 + arg2;
        ++field2676;
        if (~var7 > -1) {
            var7 = 0;
        }
        int var8 = arg2;
        int var9 = 0;
        int var10 = var7;
        int var11 = -arg2;
        if (arg5 < 45) {
            field2684 = 18;
        }
        int var12 = -1;
        int var13 = -1;
        int[] var14 = class55.field872[arg4];
        int var15 = -var7;
        int var16 = -var7 + arg1;
        int var17 = arg1 + var7;
        class173.method1240((byte) -68, var16, var14, arg6, -arg2 + arg1);
        class173.method1240((byte) -87, var17, var14, arg3, var16);
        class173.method1240((byte) -66, arg1 - -arg2, var14, arg6, var17);
        while (~var8 < ~var9) {
            var13 += 2;
            var11 += var13;
            var12 += 2;
            var15 += var12;
            if (~var15 <= -1 && var10 >= 1) {
                class204.field3145[var10] = var9;
                --var10;
                var15 -= var10 << 1;
            }
            ++var9;
            if (var11 >= 0) {
                --var8;
                var11 -= var8 << 1;
                if (~var8 > ~var7) {
                    int[] var18 = class55.field872[arg4 - -var8];
                    int var19 = class204.field3145[var8];
                    int[] var20 = class55.field872[-var8 + arg4];
                    int var21 = arg1 + var9;
                    int var22 = arg1 + var19;
                    int var23 = -var19 + arg1;
                    int var24 = -var9 + arg1;
                    class173.method1240((byte) -103, var23, var18, arg6, var24);
                    class173.method1240((byte) -87, var22, var18, arg3, var23);
                    class173.method1240((byte) -102, var21, var18, arg6, var22);
                    class173.method1240((byte) -92, var23, var20, arg6, var24);
                    class173.method1240((byte) -72, var22, var20, arg3, var23);
                    class173.method1240((byte) -85, var21, var20, arg6, var22);
                } else {
                    int[] var25 = class55.field872[arg4 + var8];
                    int[] var26 = class55.field872[-var8 + arg4];
                    int var27 = arg1 + var9;
                    int var28 = -var9 + arg1;
                    class173.method1240((byte) -101, var27, var25, arg6, var28);
                    class173.method1240((byte) -121, var27, var26, arg6, var28);
                }
            }
            int[] var29 = class55.field872[-var9 + arg4];
            int var30 = arg1 - -var8;
            int[] var31 = class55.field872[arg4 + var9];
            int var32 = -var8 + arg1;
            if (~var7 >= ~var9) {
                class173.method1240((byte) -124, var30, var31, arg6, var32);
                class173.method1240((byte) -82, var30, var29, arg6, var32);
            } else {
                int var33 = ~var10 <= ~var9 ? var10 : class204.field3145[var9];
                int var34 = arg1 + var33;
                int var35 = -var33 + arg1;
                class173.method1240((byte) -96, var35, var31, arg6, var32);
                class173.method1240((byte) -112, var34, var31, arg3, var35);
                class173.method1240((byte) -74, var30, var31, arg6, var34);
                class173.method1240((byte) -93, var35, var29, arg6, var32);
                class173.method1240((byte) -116, var34, var29, arg3, var35);
                class173.method1240((byte) -75, var30, var29, arg6, var34);
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "([[II)V")
    private final void method1246(int[][] arg0, int arg1) {
        int var3 = class250.field4008;
        ++field2692;
        int var4 = class172.field2654;
        if (arg1 != -577) {
            field2691 = null;
        }
        class295.method1962((byte) -93, arg0);
        class303.method2027(class75.field1168, class280.field4430, 0, 0, (byte) -33);
        if (this.field2680 != null) {
            for (int var5 = 0; ~this.field2680.length < ~var5; ++var5) {
                class210 var6 = this.field2680[var5];
                int var7 = var6.field3241;
                int var8 = var6.field3247;
                if (~var7 <= -1) {
                    if (~var8 <= -1) {
                        var6.method504(var4, var3, arg1 + 486);
                    } else {
                        var6.method502(var4, (byte) 111, var3);
                    }
                } else if (~var8 <= -1) {
                    var6.method499(var4, -20, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[[I")
    public final int[][] method135(int arg0, int arg1) {
        int[][] var3 = super.field3572.method1818(arg1, false);
        if (arg0 < 0) {
            field2695 = 43;
        }
        ++field2688;
        if (super.field3572.field4257) {
            int var4 = class250.field4008;
            int var5 = class172.field2654;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3572.method1812(-1);
            this.method1246(var6, -577);
            for (int var8 = 0; var8 < class172.field2654; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class250.field4008 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class118.method863(var15 << 4, 4080);
                    var12[var14] = class118.method863(65280, var15) >> 4;
                    var11[var14] = class118.method863(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lfh;IIII)V")
    public static final void method1247(class136 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2686;
        if (class263.field4168 != arg0) {
            if (class14.field174 < 400) {
                String var11;
                if (~arg0.field2034 == -1) {
                    boolean var5 = true;
                    if (class263.field4168.field2038 != -1 && arg0.field2038 != -1) {
                        int var6 = arg0.field2052 >= class263.field4168.field2052 ? arg0.field2052 : class263.field4168.field2052;
                        int var7 = class263.field4168.field2038 < arg0.field2038 ? class263.field4168.field2038 : arg0.field2038;
                        int var8 = var7 + 5 - -(var6 * 10 / 100);
                        int var9 = -arg0.field2052 + class263.field4168.field2052;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (~var8 > ~var9) {
                            var5 = false;
                        }
                    }
                    String var10 = ~class152.field2248 == -2 ? class49.field811 : class253.field4044;
                    if (~arg0.field2052 > ~arg0.field2029) {
                        var11 = arg0.method1005(-13232) + (!var5 ? "<col=ffffff>" : class78.method613(-18652, arg0.field2052, class263.field4168.field2052)) + " (" + var10 + arg0.field2052 + "+" + (-arg0.field2052 + arg0.field2029) + ")";
                    } else {
                        var11 = arg0.method1005(-13232) + (var5 ? class78.method613(-18652, arg0.field2052, class263.field4168.field2052) : "<col=ffffff>") + " (" + var10 + arg0.field2052 + ")";
                    }
                } else {
                    var11 = arg0.method1005(-13232) + " (" + class262.field4138 + arg0.field2034 + ")";
                }
                if (class173.field2658 == 1) {
                    class41.method365((short) 50, class265.field4194, (byte) -89, (long) arg1, class202.field3120 + " -> <col=ffffff>" + var11, class196.field3067, arg4, arg3);
                    ++class141.field2101;
                } else if (!class162.field2438) {
                    for (int var12 = 7; ~var12 <= -1; --var12) {
                        if (class84.field1262[var12] != null) {
                            short var13 = 0;
                            ++class73.field1122;
                            if (class152.field2248 == 0 && class84.field1262[var12].equalsIgnoreCase(class259.field4110)) {
                                if (~class263.field4168.field2052 > ~arg0.field2052) {
                                    var13 = 2000;
                                }
                                if (~class263.field4168.field2049 != -1 && ~arg0.field2049 != -1) {
                                    if (class263.field4168.field2049 != arg0.field2049) {
                                        var13 = 0;
                                    } else {
                                        var13 = 2000;
                                    }
                                }
                            } else if (class282.field4452[var12]) {
                                var13 = 2000;
                            }
                            boolean var14 = false;
                            short var15 = class47.field773[var12];
                            short var16 = (short) (var13 + var15);
                            class41.method365(var16, class189.field2975[var12], (byte) -89, (long) arg1, "<col=ffffff>" + var11, class84.field1262[var12], arg4, arg3);
                        }
                    }
                } else if ((8 & class28.field486) != 0) {
                    ++class183.field2885;
                    class41.method365((short) 40, class203.field3131, (byte) -89, (long) arg1, class202.field3119 + " -> <col=ffffff>" + var11, class201.field3104, arg4, arg3);
                }
                int var17 = -120 / ((-45 - arg2) / 58);
                for (int var18 = 0; ~class14.field174 < ~var18; ++var18) {
                    if (class86.field1282[var18] == 5) {
                        class148.field2196[var18] = "<col=ffffff>" + var11;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lha;IB)V")
    public final void method37(class31 arg0, int arg1, byte arg2) {
        if (arg2 == 102) {
            if (arg1 != 0) {
                if (arg1 == 1) {
                    super.field3583 = ~arg0.method265(-104) == -2;
                }
            } else {
                this.field2680 = new class210[arg0.method265(-82)];
                for (int var4 = 0; ~var4 > ~this.field2680.length; ++var4) {
                    int var5 = arg0.method265(-116);
                    if (var5 != 0) {
                        if (~var5 != -2) {
                            if (var5 != 2) {
                                if (var5 == 3) {
                                    this.field2680[var4] = class297.method1997(-8856, arg0);
                                }
                            } else {
                                this.field2680[var4] = class68.method548(arg0, class222.method1528(arg2, -1));
                            }
                        } else {
                            this.field2680[var4] = class188.method1346(arg0, (byte) -117);
                        }
                    } else {
                        this.field2680[var4] = class254.method1718(arg0, 128);
                    }
                }
            }
            ++field2683;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1248(int arg0, int arg1, int arg2, long arg3) {
        class22 var5 = class149.field2210[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field375 != null && var5.field375.field2448 == arg3) {
            return true;
        } else if (var5.field364 != null && var5.field364.field880 == arg3) {
            return true;
        } else if (var5.field377 != null && var5.field377.field1668 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field371; ++var6) {
                if (var5.field355[var6].field267 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }
}
