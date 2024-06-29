import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class590 extends class210 {

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
    public static int[] field7486 = new int[6];

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 3)
    public final void method185(int arg0) {
        if (arg0 != 0) {
            field7486 = null;
        }
        ++field7484;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZIBLlq;Lha;II)V", line = 14)
    public final void method174(boolean arg0, int arg1, byte arg2, class210 arg3, class570 arg4, int arg5, int arg6) {
        if (arg2 == -126) {
            ++field7481;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Lgu;I)I", line = 26)
    public final int method719(class757[] arg0, int arg1) {
        if (arg1 <= 62) {
            field7486 = null;
        }
        ++field7479;
        return this.method1406(super.field2896 >> class88.field1221, arg0, super.field2900 >> class88.field1221, 80);
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Z", line = 39)
    public final boolean method718(int arg0) {
        ++field7483;
        if (arg0 > -95) {
            this.method719((class757[]) null, 48);
        }
        return class145.field1873[(super.field2896 >> class88.field1221) - (class454.field5914 - class76.field1069)][(super.field2900 >> class88.field1221) + -class309.field3875 + class76.field1069];
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLmc;)Ljava/lang/String;", line = 51)
    public static final String method3170(byte arg0, class234 arg1) {
        ++field7485;
        if (arg0 > -47) {
            field7486 = null;
        }
        return class504.method2794(32767, -27207, arg1);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 63)
    public static final void method3171(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class304.field3830 = 0;
        class418.field5516 = 0;
        ++class237.field3233;
        if ((arg5 & 2) == 0) {
            for (class210 var8 = class177.field2327[var7]; var8 != null; var8 = var8.field2890) {
                if (!class714.method3844(var8, arg0, arg1, arg2, arg3)) {
                    class280.method1716(var8);
                    if (var8.field2887 != -1) {
                        class486.field6263[class304.field3830++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 1) == 0) {
            for (class210 var9 = class336.field4089[var7]; var9 != null; var9 = var9.field2890) {
                if (!class714.method3844(var9, arg0, arg1, arg2, arg3)) {
                    class280.method1716(var9);
                    if (var9.field2887 != -1) {
                        class166.field2215[class418.field5516++] = var9;
                    }
                }
            }
            for (class210 var10 = class640.field8187[var7]; var10 != null; var10 = var10.field2890) {
                if (!class714.method3844(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method738(true)) {
                        class280.method1716(var10);
                        if (var10.field2887 != -1) {
                            class166.field2215[class418.field5516++] = var10;
                        }
                    } else {
                        class280.method1716(var10);
                        if (var10.field2887 != -1) {
                            class486.field6263[class304.field3830++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class100.field1332; ++var11) {
                    if (!class714.method3844(class757.field10327[var11], arg0, arg1, arg2, arg3)) {
                        class280.method1716(class757.field10327[var11]);
                        if (class757.field10327[var11].field2887 != -1) {
                            if (class757.field10327[var11].method738(true)) {
                                class166.field2215[class418.field5516++] = class757.field10327[var11];
                            } else {
                                class486.field6263[class304.field3830++] = class757.field10327[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class304.field3830 > 0) {
            class110.method644(class486.field6263, 0, class304.field3830 - 1);
            for (int var12 = 0; var12 < class304.field3830; ++var12) {
                class622.method3322(class486.field6263[var12], true, arg6);
            }
        }
        if (class516.field6577) {
            class398.field5275.method908(0, (class757[]) null);
        }
        if ((arg5 & 2) == 0) {
            for (int var13 = class691.field8887; var13 < class78.field1121; ++var13) {
                if (var13 >= arg2 && arg1 != null) {
                    int var14 = class145.field1873.length;
                    if (class145.field1873.length + class141.field1853 > class330.field4039) {
                        var14 -= class145.field1873.length + class141.field1853 - class330.field4039;
                    }
                    int var15 = class145.field1873[0].length;
                    if (class145.field1873[0].length + class61.field804 > class559.field7102) {
                        var15 -= class145.field1873[0].length + class61.field804 - class559.field7102;
                    }
                    boolean[][] var16 = class56.field726;
                    if (class230.field3104) {
                        if (class70.field955) {
                            var16 = class301.field3804[var13];
                        }
                        for (int var17 = class474.field6172; var17 < var14; ++var17) {
                            int var18 = class141.field1853 + var17 - class474.field6172;
                            for (int var19 = class337.field4107; var19 < var15; ++var19) {
                                var16[var17][var19] = false;
                                if (class145.field1873[var17][var19]) {
                                    int var20 = class61.field804 + var19 - class337.field4107;
                                    for (int var21 = var13; var21 >= 0; --var21) {
                                        if (class28.field252[var21][var18][var20] != null && class28.field252[var21][var18][var20].field10421 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class334.method1928(var13, (byte) -61, var18, var20)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class70.field955) {
                        if (arg4 >= 0) {
                            class116.field1542[var13].method2071(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class116.field1542[var13].method2064(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class514.field6556; ++var22) {
                            class520.field6609[var22].method1872(false, new class273(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class116.field1542[var13].method2071(class454.field5914, class309.field3875, class76.field1069, class56.field726, false, arg4, arg5);
                    } else {
                        class116.field1542[var13].method2064(class454.field5914, class309.field3875, class76.field1069, class56.field726, false, arg5);
                    }
                } else {
                    int var23 = class145.field1873.length;
                    if (class145.field1873.length + class141.field1853 > class330.field4039) {
                        var23 -= class145.field1873.length + class141.field1853 - class330.field4039;
                    }
                    int var24 = class145.field1873[0].length;
                    if (class145.field1873[0].length + class61.field804 > class559.field7102) {
                        var24 -= class145.field1873[0].length + class61.field804 - class559.field7102;
                    }
                    boolean[][] var25 = class56.field726;
                    if (class230.field3104) {
                        if (class70.field955) {
                            var25 = class301.field3804[var13];
                        }
                        for (int var26 = class474.field6172; var26 < var23; ++var26) {
                            int var27 = class141.field1853 + var26 - class474.field6172;
                            for (int var28 = class337.field4107; var28 < var24; ++var28) {
                                if (class145.field1873[var26][var28] && !class334.method1928(var13, (byte) -72, var27, class61.field804 + var28 - class337.field4107)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class70.field955) {
                        if (arg4 >= 0) {
                            class116.field1542[var13].method2071(0, 0, 0, (boolean[][]) null, false, arg4, arg5);
                        } else {
                            class116.field1542[var13].method2064(0, 0, 0, (boolean[][]) null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class514.field6556; ++var29) {
                            class520.field6609[var29].method1872(false, new class273(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class116.field1542[var13].method2071(class454.field5914, class309.field3875, class76.field1069, class56.field726, true, arg4, arg5);
                    } else {
                        class116.field1542[var13].method2064(class454.field5914, class309.field3875, class76.field1069, class56.field726, true, arg5);
                    }
                }
            }
        }
        if (class418.field5516 > 0) {
            class549.method2978(class166.field2215, 0, class418.field5516 - 1);
            for (int var30 = 0; var30 < class418.field5516; ++var30) {
                class622.method3322(class166.field2215[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lha;I)Z", line = 364)
    public final boolean method717(class570 arg0, int arg1) {
        ++field7477;
        int var3 = 73 / ((21 - arg1) / 53);
        class569 var4 = class299.method1790(super.field2895, super.field2896 >> class88.field1221, super.field2900 >> class88.field1221);
        return var4 != null && var4.field7193.field7856 ? class578.method3100(super.field2895, super.field2900 >> class88.field1221, var4.field7193.method747(15258) - -this.method747(15258), super.field2896 >> class88.field1221, true) : class334.method1928(super.field2895, (byte) -61, super.field2896 >> class88.field1221, super.field2900 >> class88.field1221);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 380)
    public static void method3172(byte arg0) {
        field7486 = null;
        int var1 = 121 / ((65 - arg0) / 58);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Z", line = 395)
    public final boolean method171(int arg0) {
        if (arg0 > -80) {
            field7486 = null;
        }
        ++field7478;
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIZII)V", line = 406)
    public static final void method3173(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (~(!arg4 ? class485.field6252.field6946.method1340(false) : class485.field6252.field6928.method1340(false)) != -1 && arg5 != 0 && class303.field3823 < 50 && arg6 != -1) {
            class718.field9426[class303.field3823++] = new class327((byte) (!arg4 ? 2 : 3), arg6, arg5, arg3, arg0, 0, arg1, (class210) null);
        }
        if (arg2 != 0) {
            method3170((byte) 57, (class234) null);
        }
        ++field7482;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 423)
    public static final void method3174(byte arg0) {
        ++field7480;
        if (arg0 < 32) {
            field7486 = null;
        }
        for (class720 var1 = (class720) class479.field6198.method2610((byte) -98); var1 != null; var1 = (class720) class479.field6198.method2620(0)) {
            if (!var1.field9462) {
                class595.method3210(var1.field9459, true);
            } else {
                var1.field9462 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(IIIII)V", line = 447)
    public class590(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field2896 = arg0;
        super.field2892 = arg1;
        super.field2900 = arg2;
        super.field2895 = (byte) arg3;
        super.field2889 = (byte) arg4;
    }
}
