import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class112 extends class242 {

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    private int field1848 = 1024;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    private int field1842 = 0;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    private int field1849 = 0;

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    private int field1835 = 409;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    private int field1834 = 819;

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    private int field1843 = 1024;

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    private int field1856 = 1024;

    @OriginalMember(owner = "client!mj", name = "pb", descriptor = "I")
    private int field1858 = 2048;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "I")
    private int field1855 = 1024;

    @OriginalMember(owner = "client!mj", name = "U", descriptor = "Z")
    public static boolean field1837 = true;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "Lp;")
    public static class280 field1851 = class18.method140((byte) -118, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!mj", name = "T", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!mj", name = "ob", descriptor = "Lp;")
    public static class280 field1857 = class18.method140((byte) -119, "Veuillez patienter )2 tentative de r-Btablissement)3");

    @OriginalMember(owner = "client!mj", name = "V", descriptor = "B")
    public static byte field1838;

    @OriginalMember(owner = "client!mj", name = "W", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!mj", name = "qb", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "I")
    private int field1860;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "Ltg;")
    public static class180 field1850;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "Ltg;")
    public static class180 field1852;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLtg;)V")
    public static final void method778(byte arg0, class180 arg1) {
        class49.field814 = arg1;
        class29.field544 = class49.field814.method1259(16, 123);
        ++field1847;
        if (arg0 != 89) {
            method782((class113[]) null, -79, 45);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lti;I)V")
    public static final void method779(class5 arg0, int arg1) {
        for (int var2 = 0; var2 < class55.field907.length; ++var2) {
            class55.field907[var2] = 0;
        }
        ++field1859;
        short var3 = 256;
        for (int var4 = 0; ~var4 > -5001; ++var4) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class55.field907[var16] = (int) (Math.random() * 284.0D);
        }
        int var5 = 0;
        if (arg1 == -16) {
            while (var5 < 20) {
                for (int var12 = 1; var3 - 1 > var12; ++var12) {
                    for (int var14 = 1; var14 < 127; ++var14) {
                        int var15 = (var12 << 7) + var14;
                        class58.field947[var15] = (class55.field907[var15 + 128] + class55.field907[var15 + -128] + class55.field907[var15 + -1] - -class55.field907[var15 + 1]) / 4;
                    }
                }
                int[] var13 = class55.field907;
                class55.field907 = class58.field947;
                class58.field947 = var13;
                ++var5;
            }
            if (arg0 != null) {
                int var6 = 0;
                for (int var7 = 0; ~var7 > ~arg0.field1353; ++var7) {
                    for (int var8 = 0; arg0.field1341 > var8; ++var8) {
                        if (arg0.field120[var6++] != 0) {
                            int var9 = var8 + 16 + arg0.field1355;
                            int var10 = var7 - -16 + arg0.field1342;
                            int var11 = (var10 << 7) + var9;
                            class55.field907[var11] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)Z")
    public static final boolean method780(byte arg0, int arg1) {
        if (arg0 >= -74) {
            return false;
        } else {
            ++field1840;
            return ~(1 & arg1 >> 31) != -1;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
    public static final void method781(boolean arg0) {
        if (arg0) {
            class220.field3787 = class25.field473;
            class145.field2529 = class265.field4670;
        } else {
            class220.field3787 = class30.field563;
            class145.field2529 = class168.field2937;
        }
        class78.field1281 = class220.field3787.length;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field1846;
        int var3 = -61 / ((arg1 - 73) / 41);
        int[] var4 = super.field4251.method1417((byte) 121, arg0);
        if (super.field4251.field3655) {
            int var5 = 0;
            int[][] var6 = super.field4251.method1420(0);
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            boolean var13 = true;
            int var14 = 0;
            int var15 = class264.field4654 * this.field1858 >> 12;
            int var16 = class264.field4654 * this.field1856 >> 12;
            int var17 = class25.field486 * this.field1835 >> 12;
            int var18 = class25.field486 * this.field1834 >> 12;
            if (var18 <= 1) {
                return var6[arg0];
            } else {
                this.field1860 = class264.field4654 / 8 * this.field1843 >> 12;
                int var19 = class264.field4654 / var16 + 1;
                int[][] var20 = new int[var19][3];
                Random var21 = new Random((long) this.field1842);
                int[][] var22 = new int[var19][3];
                while (true) {
                    while (true) {
                        int var23 = class47.method352(1, var21, var15 - var16) + var16;
                        int var24 = class47.method352(1, var21, var18 - var17) + var17;
                        int var25 = var7 - -var23;
                        if (~var25 < ~class264.field4654) {
                            var25 = class264.field4654;
                            var23 = -var7 + class264.field4654;
                        }
                        int var27;
                        if (var13) {
                            var27 = 0;
                        } else {
                            int[] var26 = var20[var9];
                            var27 = var26[2];
                            int var28 = 0;
                            int var29 = var9;
                            int var30 = var5 + var25;
                            if (~var30 > -1) {
                                var30 += class264.field4654;
                            }
                            if (~class264.field4654 > ~var30) {
                                var30 -= class264.field4654;
                            }
                            while (true) {
                                int[] var31 = var20[var29];
                                if (~var30 <= ~var31[0] && ~var30 >= ~var31[1]) {
                                    if (var9 != var29) {
                                        int var32 = var5 + var7;
                                        if (var32 < 0) {
                                            var32 += class264.field4654;
                                        }
                                        if (~class264.field4654 > ~var32) {
                                            var32 -= class264.field4654;
                                        }
                                        for (int var33 = 1; var28 >= var33; ++var33) {
                                            int[] var41 = var20[(var9 + var33) % var12];
                                            var27 = Math.max(var27, var41[2]);
                                        }
                                        for (int var34 = 0; var34 <= var28; ++var34) {
                                            int[] var35 = var20[(var9 - -var34) % var12];
                                            int var36 = var35[2];
                                            if (~var27 != ~var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (~var30 < ~var32) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var30, var38);
                                                } else if (var37 == 0) {
                                                    var40 = Math.min(var30, var38);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class264.field4654;
                                                }
                                                this.method784(var27 - var36, -var39 + var40, var36, var6, var21, -104, var8 + var39);
                                            }
                                        }
                                    }
                                    var9 = var29;
                                    break;
                                }
                                ++var28;
                                ++var29;
                                if (var29 >= var12) {
                                    var29 = 0;
                                }
                            }
                        }
                        if (~class25.field486 > ~(var24 + var27)) {
                            var24 = -var27 + class25.field486;
                        } else {
                            var11 = false;
                        }
                        if (class264.field4654 != var25) {
                            int[] var42 = var22[var14++];
                            var42[0] = var7;
                            var42[2] = var24 + var27;
                            var42[1] = var25;
                            this.method784(var24, var23, var27, var6, var21, 123, var7 + var10);
                            var7 = var25;
                        } else {
                            this.method784(var24, var23, var27, var6, var21, 82, var7 + var10);
                            if (var11) {
                                return var4;
                            }
                            var9 = 0;
                            var13 = false;
                            int[][] var43 = var20;
                            var20 = var22;
                            var8 = var10;
                            int[] var44 = var22[var14++];
                            var44[2] = var24 + var27;
                            var44[0] = var7;
                            var7 = 0;
                            var22 = var43;
                            var11 = true;
                            var12 = var14;
                            var14 = 0;
                            var44[1] = var25;
                            var10 = class47.method352(1, var21, class264.field4654);
                            var5 = -var8 + var10;
                            int var45 = var5;
                            if (~var5 > -1) {
                                var45 = class264.field4654 + var5;
                            }
                            if (class264.field4654 < var45) {
                                var45 -= class264.field4654;
                            }
                            while (true) {
                                int[] var46 = var20[var9];
                                if (~var45 <= ~var46[0] && ~var46[1] <= ~var45) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "([Lua;II)V")
    public static final void method782(class113[] arg0, int arg1, int arg2) {
        ++field1854;
        if (arg1 > -48) {
            method779((class5) null, -113);
        }
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            class113 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field1879 == 0) {
                    if (var4.field1865 != null) {
                        method782(var4.field1865, -50, arg2);
                    }
                    class144 var5 = (class144) class261.field4614.method150((long) var4.field1964, -99);
                    if (var5 != null) {
                        class18.method138(var5.field2517, (byte) -121, arg2);
                    }
                }
                if (~arg2 == -1 && var4.field1953 != null) {
                    class178 var6 = new class178();
                    var6.field3107 = var4.field1953;
                    var6.field3106 = var4;
                    class199.method1371(200000, var6);
                }
                if (~arg2 == -2 && var4.field1933 != null) {
                    if (~var4.field1955 <= -1) {
                        class113 var7 = class233.method1569(65535, var4.field1964);
                        if (var7 == null || var7.field1865 == null || ~var7.field1865.length >= ~var4.field1955 || var7.field1865[var4.field1955] != var4) {
                            continue;
                        }
                    }
                    class178 var8 = new class178();
                    var8.field3106 = var4;
                    var8.field3107 = var4.field1933;
                    class199.method1371(200000, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1852 = null;
        field1857 = null;
        int var1 = 10 % ((arg0 - -12) / 44);
        field1851 = null;
        field1850 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III[[ILjava/util/Random;II)V")
    private final void method784(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        ++field1839;
        int var8 = -34 / ((-45 - arg5) / 52);
        int var9 = this.field1855 > 0 ? -class47.method352(1, arg4, this.field1855) + 4096 : 4096;
        int var10 = this.field1860 * this.field1848 >> 12;
        int var11 = this.field1860 - (~var10 >= -1 ? 0 : class47.method352(1, arg4, var10));
        if (~class264.field4654 >= ~arg6) {
            arg6 -= class264.field4654;
        }
        if (var11 <= 0) {
            if (class264.field4654 >= arg1 + arg6) {
                for (int var12 = 0; arg0 > var12; ++var12) {
                    class143.method986(arg3[arg2 + var12], arg6, arg1, var9);
                }
            } else {
                int var13 = -arg6 + class264.field4654;
                for (int var14 = 0; ~var14 > ~arg0; ++var14) {
                    int[] var15 = arg3[arg2 + var14];
                    class143.method986(var15, arg6, var13, var9);
                    class143.method986(var15, 0, arg1 - var13, var9);
                }
            }
        } else if (~arg0 < -1 && ~arg1 < -1) {
            int var16 = arg1 / 2;
            int var17 = arg0 / 2;
            int var18 = var16 < var11 ? var16 : var11;
            int var19 = ~var11 >= ~var17 ? var11 : var17;
            int var20 = -(var18 * 2) + arg1;
            int var21 = arg6 - -var18;
            for (int var22 = 0; ~var22 > ~arg0; ++var22) {
                int[] var23 = arg3[arg2 + var22];
                if (~var22 > ~var19) {
                    int var24 = var9 * var22 / var19;
                    if (this.field1849 == 0) {
                        for (int var25 = 0; ~var18 < ~var25; ++var25) {
                            int var26 = var9 * var25 / var18;
                            var23[class214.method1432(class230.field3968, arg6 + var25)] = var23[class214.method1432(-var25 + -1 + arg1 + arg6, class230.field3968)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; ~var27 > ~var18; ++var27) {
                            int var29 = var9 * var27 / var18;
                            var23[class214.method1432(class230.field3968, arg6 + var27)] = var23[class214.method1432(class230.field3968, arg6 - (-arg1 - -var27 - -1))] = ~var24 < ~var29 ? var29 : var24;
                        }
                    }
                    if (var21 - -var20 <= class264.field4654) {
                        class143.method986(var23, var21, var20, var24);
                    } else {
                        int var28 = -var21 + class264.field4654;
                        class143.method986(var23, var21, var28, var24);
                        class143.method986(var23, 0, -var28 + var20, var24);
                    }
                } else {
                    int var30 = -var22 + arg0 + -1;
                    if (~var30 > ~var19) {
                        int var31 = var9 * var30 / var19;
                        if (this.field1849 == 0) {
                            for (int var32 = 0; var32 < var18; ++var32) {
                                int var33 = var9 * var32 / var18;
                                var23[class214.method1432(arg6 + var32, class230.field3968)] = var23[class214.method1432(class230.field3968, -var32 + -1 + arg1 + arg6)] = var31 * var33 >> 12;
                            }
                        } else {
                            for (int var34 = 0; var18 > var34; ++var34) {
                                int var36 = var9 * var34 / var18;
                                var23[class214.method1432(arg6 - -var34, class230.field3968)] = var23[class214.method1432(arg6 - var34 + arg1 + -1, class230.field3968)] = var36 >= var31 ? var31 : var36;
                            }
                        }
                        if (class264.field4654 < var21 - -var20) {
                            int var35 = -var21 + class264.field4654;
                            class143.method986(var23, var21, var35, var31);
                            class143.method986(var23, 0, -var35 + var20, var31);
                        } else {
                            class143.method986(var23, var21, var20, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var37 > ~var18; ++var37) {
                            var23[class214.method1432(arg6 + var37, class230.field3968)] = var23[class214.method1432(arg6 - (var37 - -1) + arg1, class230.field3968)] = var9 * var37 / var18;
                        }
                        if (class264.field4654 >= var21 - -var20) {
                            class143.method986(var23, var21, var20, var9);
                        } else {
                            int var38 = -var21 + class264.field4654;
                            class143.method986(var23, var21, var38, var9);
                            class143.method986(var23, 0, -var38 + var20, var9);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILtg;ZIII)V")
    public static final void method785(int arg0, class180 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        class275.field4780 = arg4;
        class181.field3168 = arg3;
        class102.field1654 = arg2;
        ++field1844;
        class115.field2092 = arg0;
        class268.field4707 = arg1;
        class253.field4441 = 1;
        class222.field3849 = arg5;
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 <= 122) {
            this.method111(69);
        }
        ++field1841;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 != 6) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field1855 = arg2.method193((byte) 77);
                                        }
                                    } else {
                                        this.field1848 = arg2.method193((byte) 77);
                                    }
                                } else {
                                    this.field1849 = arg2.method189((byte) -103);
                                }
                            } else {
                                this.field1843 = arg2.method193((byte) 77);
                            }
                        } else {
                            this.field1834 = arg2.method193((byte) 77);
                        }
                    } else {
                        this.field1835 = arg2.method193((byte) 77);
                    }
                } else {
                    this.field1858 = arg2.method193((byte) 77);
                }
            } else {
                this.field1856 = arg2.method193((byte) 77);
            }
        } else {
            this.field1842 = arg2.method189((byte) -103);
        }
        if (arg0 >= -119) {
            method779((class5) null, 82);
        }
        ++field1853;
    }
}
