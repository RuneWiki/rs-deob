import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class222 extends class300 {

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!kk", name = "L", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "Ltf;")
    public static class244 field3478;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "Lvl;")
    public static class73 field3477;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1572(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class306[] var7 = class130.field1865;
        int var8 = 0;
        if (arg5 != -32769) {
            field3478 = null;
        }
        while (var7.length > var8) {
            class306 var9 = var7[var8];
            if (var9 != null && ~var9.field4882 == -3) {
                class245.method1748(54, (-class113.field1653 + var9.field4891 << 7) + var9.field4883, arg4, arg0 >> 1, arg1 >> 1, arg2, (var9.field4888 - class5.field77 << 7) - -var9.field4878, var9.field4881 * 2);
                if (~class99.field1470 < 0 && ~(class311.field4996 % 20) > -11) {
                    class111.field1608[var9.field4890].method285(arg6 - -class99.field1470 + -12, class80.field1212 + arg3 - 28);
                }
            }
            ++var8;
        }
        ++field3484;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lim;BI)V")
    public final void method35(class170 arg0, byte arg1, int arg2) {
        ++field3486;
        if (~arg2 == -1) {
            super.field4784 = ~arg0.method1218(77) == -2;
        }
        if (arg1 > -43) {
            this.method35((class170) null, (byte) -52, -50);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(B)V")
    public static final void method1573(byte arg0) {
        if (class270.field4405 != null) {
            class270.field4405.method567(0);
            class270.field4405 = null;
        }
        ++field3479;
        class172.method1232((byte) -25);
        class15.method88();
        int var1 = 0;
        if (arg0 == -81) {
            while (var1 < 4) {
                class312.field4997[var1].method667((byte) -113);
                ++var1;
            }
            class68.method453(false, arg0 ^ 29316);
            System.gc();
            class257.method1823(2, false);
            class229.field3542 = false;
            class127.field1826 = -1;
            class251.method1791(arg0 ^ -27702, true);
            class5.field77 = 0;
            class97.field1464 = 0;
            class113.field1653 = 0;
            class161.field2415 = false;
            class22.field288 = 0;
            for (int var2 = 0; var2 < class130.field1865.length; ++var2) {
                class130.field1865[var2] = null;
            }
            class272.field4432 = 0;
            class80.field1211 = 0;
            for (int var3 = 0; ~var3 > -2049; ++var3) {
                class35.field409[var3] = null;
                class291.field4687[var3] = null;
            }
            for (int var4 = 0; ~var4 > -32769; ++var4) {
                class191.field3045[var4] = null;
            }
            for (int var5 = 0; var5 < 4; ++var5) {
                for (int var6 = 0; var6 < 104; ++var6) {
                    for (int var7 = 0; ~var7 > -105; ++var7) {
                        class74.field1128[var5][var6][var7] = null;
                    }
                }
            }
            class290.method1974((byte) -16);
            class233.field3770 = 0;
            class172.method1234(true);
            class210.method1457((byte) 98, true);
            try {
                class25.method132(class95.field1425.field3832, "loggedout", (byte) 125);
            } catch (Throwable var8) {
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Luk;I)I")
    public static final int method1574(class86 arg0, int arg1) {
        if (arg1 != -11) {
            method1576(29, (class99) null, 30, 11, -93, -75, (byte) -67);
        }
        ++field3485;
        class134 var2 = arg0.field1321;
        if (var2.field1894 != null) {
            var2 = var2.method855((byte) -114);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field1884;
        class163 var4 = arg0.method1725(-125);
        if (~arg0.field3946 == ~var4.field2517) {
            var3 = var2.field1946;
        } else if (~arg0.field3946 != ~var4.field2511 && ~arg0.field3946 != ~var4.field2501 && ~arg0.field3946 != ~var4.field2527 && ~arg0.field3946 != ~var4.field2509) {
            if (~arg0.field3946 == ~var4.field2523 || ~arg0.field3946 == ~var4.field2518 || ~arg0.field3946 == ~var4.field2520 || ~arg0.field3946 == ~var4.field2525) {
                var3 = var2.field1901;
            }
        } else {
            var3 = var2.field1881;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)V")
    private final void method1575(int arg0, int arg1, int arg2) {
        ++field3480;
        int var4 = class5.field73[arg2];
        int var5 = class235.field3797[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class278.field4552 = arg2;
            class174.field2732 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class174.field2732 = arg2;
            class278.field4552 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class278.field4552 = -arg1 + class180.field2826;
            class174.field2732 = arg2;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class174.field2732 = -arg1 + class4.field61;
            class278.field4552 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class174.field2732 = class4.field61 - arg1;
            class278.field4552 = class180.field2826 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class174.field2732 = -arg2 + class4.field61;
            class278.field4552 = class180.field2826 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class278.field4552 = arg1;
            class174.field2732 = class4.field61 - arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class174.field2732 = arg1;
            class278.field4552 = -arg2 + class180.field2826;
        }
        class174.field2732 &= class285.field4611;
        int var7 = 40 / ((-64 - arg0) / 51);
        class278.field4552 &= class277.field4503;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ILji;IIIIB)V")
    public static final void method1576(int arg0, class99 arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        long var7 = 0L;
        ++field3481;
        if (~arg0 == -1) {
            var7 = class78.method531(arg4, arg3, arg5);
        } else if (~arg0 == -2) {
            var7 = class211.method1460(arg4, arg3, arg5);
        } else if (~arg0 == -3) {
            var7 = class55.method362(arg4, arg3, arg5);
        } else if (~arg0 == -4) {
            var7 = class33.method173(arg4, arg3, arg5);
        }
        if (arg6 != -55) {
            field3478 = null;
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        int var12 = ((int) var7 & 509493) >> 14;
        boolean var13 = false;
        int var14 = (int) var7 >> 20 & 3;
        class191 var15 = class128.method822(var10, (byte) -121);
        if (var15.method1332(0)) {
            class138.method875(arg3, arg4, (byte) -118, arg5, var15);
        }
        if (var7 != 0L) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 == 3) {
                            class309.method2085(arg4, arg3, arg5);
                            if (~var15.field2981 == -2) {
                                arg1.method671(arg3, -23201, arg5);
                            }
                        }
                    } else {
                        class254.method1802(arg4, arg3, arg5);
                        if (var15.field2981 != 0 && ~(arg3 - -var15.field2993) > -105 && var15.field2993 + arg5 < 104 && arg3 - -var15.field3039 < 104 && var15.field3039 + arg5 < 104) {
                            arg1.method674(arg3, var15.field2982, var14, arg5, var15.field2993, !var15.field2991, true, var15.field3039);
                        }
                    }
                } else {
                    class195.method1367(arg4, arg3, arg5);
                }
            } else {
                class257.method1822(arg4, arg3, arg5);
                if (var15.field2981 != 0) {
                    arg1.method673(arg5, arg3, var12, var14, arg6 ^ 89, var15.field2982, !var15.field2991);
                }
            }
            if (var15.field2963 != null) {
                class191 var20 = var15.method1340(0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
    public final int[] method99(int arg0, int arg1) {
        if (arg1 != -957953300) {
            return null;
        } else {
            int[] var3 = super.field4797.method217(arg0, true);
            if (super.field4797.field470) {
                for (int var4 = 0; class180.field2826 > var4; ++var4) {
                    this.method1575(42, arg0, var4);
                    int[] var5 = this.method2018(0, -1, class174.field2732);
                    var3[var4] = var5[class278.field4552];
                }
            }
            ++field3482;
            return var3;
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
    public class222() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)[[I")
    public final int[][] method36(int arg0, int arg1) {
        int var3 = 116 % (arg0 / 47);
        ++field3483;
        int[][] var4 = super.field4786.method538(arg1, (byte) 86);
        if (super.field4786.field1200) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class180.field2826 > var8; ++var8) {
                this.method1575(29, arg1, var8);
                int[][] var9 = this.method2021(class174.field2732, false, 0);
                var5[var8] = var9[0][class278.field4552];
                var6[var8] = var9[1][class278.field4552];
                var7[var8] = var9[2][class278.field4552];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V")
    public static void method1577(int arg0) {
        field3477 = null;
        if (arg0 != -24881) {
            method1577(-115);
        }
        field3478 = null;
    }
}
