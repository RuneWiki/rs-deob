import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class62 extends class212 {

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    private int field948 = 409;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    private int field946 = 0;

    @OriginalMember(owner = "client!qb", name = "ib", descriptor = "I")
    private int field960 = 2048;

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "I")
    private int field959 = 1024;

    @OriginalMember(owner = "client!qb", name = "jb", descriptor = "I")
    private int field961 = 1024;

    @OriginalMember(owner = "client!qb", name = "mb", descriptor = "I")
    private int field964 = 1024;

    @OriginalMember(owner = "client!qb", name = "nb", descriptor = "I")
    private int field965 = 0;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    private int field956 = 1024;

    @OriginalMember(owner = "client!qb", name = "rb", descriptor = "I")
    private int field969 = 819;

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "Lsc;")
    public static class181 field955 = class149.method967(255, "AUS");

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "[I")
    public static int[] field957 = new int[100];

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
    public static int field947 = 1;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!qb", name = "lb", descriptor = "I")
    public static volatile int field963 = 0;

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "Ljava/util/Random;")
    public static Random field954 = new Random();

    @OriginalMember(owner = "client!qb", name = "qb", descriptor = "Lsc;")
    public static class181 field968 = class149.method967(255, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    private int field952;

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!qb", name = "kb", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!qb", name = "ob", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!qb", name = "pb", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 <= 25) {
            this.method444(112, (Random) null, 5, 52, (int[][]) null, -41, 37);
        }
        int[] var3 = super.field3640.method737(true, arg0);
        ++field949;
        if (super.field3640.field1813) {
            int[][] var4 = super.field3640.method734((byte) 117);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            boolean var8 = true;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class26.field452 * this.field960 >> 12;
            int var15 = class26.field452 * this.field956 >> 12;
            int var16 = class97.field1577 * this.field948 >> 12;
            int var17 = class97.field1577 * this.field969 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                int var18 = 1 - -(class26.field452 / var15);
                this.field952 = class26.field452 / 8 * this.field959 >> 12;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field965);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = class136.method879((byte) -126, var20, -var15 + var14) + var15;
                        int var23 = class136.method879((byte) -117, var20, -var16 + var17) + var16;
                        int var24 = var11 - -var22;
                        if (~var24 < ~class26.field452) {
                            var24 = class26.field452;
                            var22 = -var11 + class26.field452;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int[] var26 = var21[var9];
                            int var27 = 0;
                            int var28 = var9;
                            var25 = var26[2];
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class26.field452;
                            }
                            if (~class26.field452 > ~var29) {
                                var29 -= class26.field452;
                            }
                            while (true) {
                                int[] var30 = var21[var28];
                                if (~var30[0] >= ~var29 && ~var30[1] <= ~var29) {
                                    if (var9 != var28) {
                                        int var31 = var11 - -var5;
                                        if (~var31 > -1) {
                                            var31 += class26.field452;
                                        }
                                        if (class26.field452 < var31) {
                                            var31 -= class26.field452;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var21[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var21[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class26.field452;
                                                }
                                                this.method444(-var38 + var39, var20, var35, -1, var4, -var35 + var25, var38 - -var7);
                                            }
                                        }
                                    }
                                    var9 = var28;
                                    break;
                                }
                                ++var28;
                                if (var12 <= var28) {
                                    var28 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (~(var23 + var25) >= ~class97.field1577) {
                            var8 = false;
                        } else {
                            var23 = -var25 + class97.field1577;
                        }
                        if (~class26.field452 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[0] = var11;
                            var41[1] = var24;
                            this.method444(var22, var20, var25, -1, var4, var23, var6 + var11);
                            var11 = var24;
                        } else {
                            this.method444(var22, var20, var25, -1, var4, var23, var6 + var11);
                            if (var8) {
                                return var3;
                            }
                            var9 = 0;
                            var10 = false;
                            var7 = var6;
                            var8 = true;
                            int[] var42 = var19[var13++];
                            var12 = var13;
                            var42[0] = var11;
                            var11 = 0;
                            var42[2] = var23 + var25;
                            var42[1] = var24;
                            var6 = class136.method879((byte) -114, var20, class26.field452);
                            var5 = var6 - var7;
                            var13 = 0;
                            int[][] var43 = var21;
                            var21 = var19;
                            int var44 = var5;
                            var19 = var43;
                            if (var5 < 0) {
                                var44 = class26.field452 + var5;
                            }
                            if (~var44 < ~class26.field452) {
                                var44 -= class26.field452;
                            }
                            while (true) {
                                int[] var45 = var21[var9];
                                if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)Lra;")
    public static final class148 method442(byte arg0, int arg1) {
        ++field958;
        if (arg0 != 79) {
            method442((byte) -56, -57);
        }
        class148 var2 = (class148) class110.field1796.method1794(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class47.field745.method89(class122.method798(arg0 + 27, arg1), class232.method1604(arg1, arg0 + -79), 98);
            class148 var4 = new class148();
            var4.field2431 = arg1;
            if (var3 != null) {
                var4.method953(123, new class230(var3));
            }
            var4.method958((byte) 124);
            if (var4.field2408) {
                var4.field2437 = false;
                var4.field2463 = 0;
            }
            if (!class61.field942 && var4.field2425) {
                var4.field2430 = null;
            }
            class110.field1796.method1795(14177, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method24(-13, (byte) -121);
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field964 = arg0.method1535(2);
                                        }
                                    } else {
                                        this.field961 = arg0.method1535(2);
                                    }
                                } else {
                                    this.field946 = arg0.method1516((byte) 82);
                                }
                            } else {
                                this.field959 = arg0.method1535(2);
                            }
                        } else {
                            this.field969 = arg0.method1535(arg2 + 5);
                        }
                    } else {
                        this.field948 = arg0.method1535(2);
                    }
                } else {
                    this.field960 = arg0.method1535(2);
                }
            } else {
                this.field956 = arg0.method1535(2);
            }
        } else {
            this.field965 = arg0.method1516((byte) 82);
        }
        ++field951;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static void method443(byte arg0) {
        field955 = null;
        field957 = null;
        if (arg0 <= 126) {
            field954 = null;
        }
        field954 = null;
        field968 = null;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class62() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
    public final void method46(boolean arg0) {
        if (arg0) {
            ++field966;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILjava/util/Random;II[[III)V")
    private final void method444(int arg0, Random arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        int var8 = this.field964 > 0 ? -class136.method879((byte) -121, arg1, this.field964) + 4096 : 4096;
        ++field962;
        int var9 = this.field961 * this.field952 >> 12;
        int var10 = this.field952 + -(~var9 >= -1 ? 0 : class136.method879((byte) -128, arg1, var9));
        if (class26.field452 <= arg6) {
            arg6 -= class26.field452;
        }
        if (~var10 >= arg3) {
            if (~class26.field452 <= ~(arg6 - -arg0)) {
                for (int var11 = 0; ~var11 > ~arg5; ++var11) {
                    class252.method1719(arg4[arg2 - -var11], arg6, arg0, var8);
                }
            } else {
                int var12 = -arg6 + class26.field452;
                for (int var13 = 0; ~arg5 < ~var13; ++var13) {
                    int[] var14 = arg4[arg2 - -var13];
                    class252.method1719(var14, arg6, var12, var8);
                    class252.method1719(var14, 0, -var12 + arg0, var8);
                }
            }
        } else if (~arg5 < -1 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg5 / 2;
            int var17 = ~var10 >= ~var16 ? var10 : var16;
            int var18 = ~var15 > ~var10 ? var15 : var10;
            int var19 = arg6 + var18;
            int var20 = -(var18 * 2) + arg0;
            for (int var21 = 0; var21 < arg5; ++var21) {
                int[] var22 = arg4[arg2 + var21];
                if (~var21 > ~var17) {
                    int var23 = var8 * var21 / var17;
                    if (~this.field946 != -1) {
                        for (int var24 = 0; var18 > var24; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class5.method43(arg6 + var24, class186.field3300)] = var22[class5.method43(-var24 + -1 + arg0 + arg6, class186.field3300)] = ~var23 >= ~var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var18; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class5.method43(class186.field3300, arg6 + var26)] = var22[class5.method43(class186.field3300, arg6 - -arg0 - var26 + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (var19 + var20 <= class26.field452) {
                        class252.method1719(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class26.field452;
                        class252.method1719(var22, var19, var27, var23);
                        class252.method1719(var22, 0, var20 - var27, var23);
                    }
                } else {
                    int var29 = -var21 - 1 + arg5;
                    if (~var17 < ~var29) {
                        int var30 = var8 * var29 / var17;
                        if (~this.field946 != -1) {
                            for (int var31 = 0; ~var31 > ~var18; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class5.method43(arg6 + var31, class186.field3300)] = var22[class5.method43(arg0 + arg6 - 1 + -var31, class186.field3300)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var18 > var33; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class5.method43(arg6 - -var33, class186.field3300)] = var22[class5.method43(-var33 + -1 + arg6 + arg0, class186.field3300)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class26.field452 <= ~(var19 + var20)) {
                            class252.method1719(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class26.field452;
                            class252.method1719(var22, var19, var34, var30);
                            class252.method1719(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var18 < ~var36; ++var36) {
                            var22[class5.method43(arg6 + var36, class186.field3300)] = var22[class5.method43(arg6 - -arg0 + -var36 + -1, class186.field3300)] = var8 * var36 / var18;
                        }
                        if (~(var19 + var20) < ~class26.field452) {
                            int var37 = -var19 + class26.field452;
                            class252.method1719(var22, var19, var37, var8);
                            class252.method1719(var22, 0, -var37 + var20, var8);
                        } else {
                            class252.method1719(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }
}
