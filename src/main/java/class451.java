import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class451 extends class210 {

    @OriginalMember(owner = "client!qs", name = "K", descriptor = "I")
    private int field6646 = 409;

    @OriginalMember(owner = "client!qs", name = "N", descriptor = "I")
    private int field6649 = 0;

    @OriginalMember(owner = "client!qs", name = "P", descriptor = "I")
    private int field6651 = 819;

    @OriginalMember(owner = "client!qs", name = "R", descriptor = "I")
    private int field6652 = 1024;

    @OriginalMember(owner = "client!qs", name = "M", descriptor = "I")
    private int field6648 = 1024;

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "I")
    private int field6645 = 1024;

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "I")
    private int field6644 = 0;

    @OriginalMember(owner = "client!qs", name = "O", descriptor = "I")
    private int field6650 = 2048;

    @OriginalMember(owner = "client!qs", name = "Z", descriptor = "I")
    private int field6659 = 1024;

    @OriginalMember(owner = "client!qs", name = "W", descriptor = "Ljn;")
    public static class409 field6656 = new class409("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!qs", name = "cb", descriptor = "Z")
    public static volatile boolean field6662 = true;

    @OriginalMember(owner = "client!qs", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field6664 = "";

    @OriginalMember(owner = "client!qs", name = "bb", descriptor = "I")
    public static int field6661 = 64;

    @OriginalMember(owner = "client!qs", name = "db", descriptor = "I")
    public static int field6663 = 1;

    @OriginalMember(owner = "client!qs", name = "L", descriptor = "I")
    private int field6647;

    @OriginalMember(owner = "client!qs", name = "S", descriptor = "I")
    public static int field6653;

    @OriginalMember(owner = "client!qs", name = "T", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!qs", name = "V", descriptor = "I")
    public static int field6655;

    @OriginalMember(owner = "client!qs", name = "X", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!qs", name = "Y", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!qs", name = "ab", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(III)V", line = 6)
    public static final void method2800(int arg0, int arg1, int arg2) {
        ++field6657;
        ++class148.field2010;
        class257.method1773((byte) -10, class382.field5605);
        class159.field2132.method1750((byte) 0, arg0);
        class159.field2132.method1764(false, arg1);
        if (arg2 != 31965) {
            method2802(true);
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V", line = 25)
    public final void method363(int arg0) {
        if (arg0 != 0) {
            this.method56(77, -101, (class256) null);
        }
        ++field6658;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V", line = 38)
    public static final void method2801(int arg0, int arg1) {
        class369 var2 = class178.field2530[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; ++var3) {
            class369 var4 = class178.field2530[var3][arg0][arg1] = class178.field2530[var3 + 1][arg0][arg1];
            if (var4 != null) {
                --var4.field5328;
                for (class206 var5 = var4.field5345; var5 != null; var5 = var5.field2882) {
                    class336 var6 = var5.field2880;
                    if (var6.field4961 == arg0 && var6.field4959 == arg1) {
                        --var6.field4960;
                    }
                }
            }
        }
        if (class178.field2530[0][arg0][arg1] == null) {
            class178.field2530[0][arg0][arg1] = new class369(0, arg0, arg1);
            class178.field2530[0][arg0][arg1].field5352 = 1;
        }
        class178.field2530[0][arg0][arg1].field5351 = var2;
        class178.field2530[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V", line = 452)
    public class451() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILat;)V", line = 82)
    public final void method56(int arg0, int arg1, class256 arg2) {
        ++field6654;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field6659 = arg2.method1767(1930493576);
                                        }
                                    } else {
                                        this.field6652 = arg2.method1767(1930493576);
                                    }
                                } else {
                                    this.field6644 = arg2.method1738((byte) 109);
                                }
                            } else {
                                this.field6645 = arg2.method1767(arg1 + 1930505517);
                            }
                        } else {
                            this.field6651 = arg2.method1767(arg1 ^ -1930481709);
                        }
                    } else {
                        this.field6646 = arg2.method1767(1930493576);
                    }
                } else {
                    this.field6650 = arg2.method1767(1930493576);
                }
            } else {
                this.field6648 = arg2.method1767(1930493576);
            }
        } else {
            this.field6649 = arg2.method1738((byte) -63);
        }
        if (arg1 != -11941) {
            this.field6651 = -69;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)[I", line = 184)
    public final int[] method361(int arg0, byte arg1) {
        ++field6660;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (super.field2950.field4111) {
            int[][] var4 = super.field2950.method1888(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class202.field2852 * this.field6648 >> 12;
            int var15 = class202.field2852 * this.field6650 >> 12;
            int var16 = class130.field1771 * this.field6646 >> 12;
            int var17 = class130.field1771 * this.field6651 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field6647 = class202.field2852 / 8 * this.field6645 >> 12;
            int var18 = class202.field2852 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field6649);
            label126: while (true) {
                while (true) {
                    int var22 = class435.method2683(var21, (byte) -75, -var14 + var15) + var14;
                    int var23 = class435.method2683(var21, (byte) -75, -var16 + var17) + var16;
                    int var24 = var8 - -var22;
                    if (~class202.field2852 > ~var24) {
                        var22 = -var8 + class202.field2852;
                        var24 = class202.field2852;
                    }
                    int var30;
                    if (var11) {
                        var30 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class202.field2852;
                        }
                        if (var28 > class202.field2852) {
                            var28 -= class202.field2852;
                        }
                        while (true) {
                            int[] var29 = var20[var25];
                            if (~var29[0] >= ~var28 && var28 <= var29[1]) {
                                var30 = var26[2];
                                if (var9 != var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class202.field2852;
                                    }
                                    if (var31 > class202.field2852) {
                                        var31 -= class202.field2852;
                                    }
                                    for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var30 = Math.max(var30, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var30 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var28) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            } else if (var36 == 0) {
                                                var38 = 0;
                                                var39 = Math.min(var28, var37);
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class202.field2852;
                                            }
                                            this.method2803(var21, (byte) 68, -var38 + var39, var35, var4, var30 - var35, var7 + var38);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (var23 + var30 > class130.field1771) {
                        var23 = -var30 + class130.field1771;
                    } else {
                        var10 = false;
                    }
                    if (class202.field2852 != var24) {
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var30;
                        var41[1] = var24;
                        this.method2803(var21, (byte) -109, var22, var30, var4, var23, var8 - -var6);
                        var8 = var24;
                    } else {
                        this.method2803(var21, (byte) 55, var22, var30, var4, var23, var8 - -var6);
                        if (var10) {
                            break label126;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[2] = var23 + var30;
                        var42[0] = var8;
                        var42[1] = var24;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class435.method2683(var21, (byte) -75, class202.field2852);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class202.field2852 + var5;
                        }
                        if (class202.field2852 < var44) {
                            var44 -= class202.field2852;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (~var45[0] >= ~var44 && ~var45[1] <= ~var44) {
                                var11 = false;
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
        if (arg1 != -38) {
            method2801(115, -119);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(Z)V", line = 437)
    public static void method2802(boolean arg0) {
        if (!arg0) {
            field6656 = null;
        }
        field6656 = null;
        field6664 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/util/Random;BII[[III)V", line = 459)
    private final void method2803(Random arg0, byte arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        ++field6653;
        int var8 = -62 % ((-16 - arg1) / 49);
        int var9 = this.field6659 > 0 ? 4096 - class435.method2683(arg0, (byte) -75, this.field6659) : 4096;
        int var10 = this.field6652 * this.field6647 >> 12;
        int var11 = this.field6647 - (var10 <= 0 ? 0 : class435.method2683(arg0, (byte) -75, var10));
        if (class202.field2852 <= arg6) {
            arg6 -= class202.field2852;
        }
        if (~var11 < -1) {
            if (arg5 > 0 && ~arg2 < -1) {
                int var12 = arg2 / 2;
                int var13 = arg5 / 2;
                int var14 = ~var11 >= ~var12 ? var11 : var12;
                int var15 = var13 >= var11 ? var11 : var13;
                int var16 = arg6 + var14;
                int var17 = -(var14 * 2) + arg2;
                for (int var18 = 0; arg5 > var18; ++var18) {
                    int[] var19 = arg4[arg3 + var18];
                    if (var18 < var15) {
                        int var20 = var9 * var18 / var15;
                        if (this.field6644 == 0) {
                            for (int var21 = 0; var14 > var21; ++var21) {
                                int var22 = var9 * var21 / var14;
                                var19[class386.method2438(class437.field6373, arg6 + var21)] = var19[class386.method2438(class437.field6373, -var21 + arg6 - (-arg2 + 1))] = var20 * var22 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var14; ++var23) {
                                int var25 = var9 * var23 / var14;
                                var19[class386.method2438(class437.field6373, arg6 + var23)] = var19[class386.method2438(-var23 + arg2 + arg6 + -1, class437.field6373)] = var20 <= var25 ? var20 : var25;
                            }
                        }
                        if (~(var16 - -var17) < ~class202.field2852) {
                            int var24 = -var16 + class202.field2852;
                            class224.method1542(var19, var16, var24, var20);
                            class224.method1542(var19, 0, var17 - var24, var20);
                        } else {
                            class224.method1542(var19, var16, var17, var20);
                        }
                    } else {
                        int var26 = arg5 - var18 - 1;
                        if (var26 < var15) {
                            int var27 = var9 * var26 / var15;
                            if (this.field6644 != 0) {
                                for (int var28 = 0; ~var14 < ~var28; ++var28) {
                                    int var29 = var9 * var28 / var14;
                                    var19[class386.method2438(class437.field6373, arg6 + var28)] = var19[class386.method2438(class437.field6373, arg6 - (-arg2 - -1) + -var28)] = var27 <= var29 ? var27 : var29;
                                }
                            } else {
                                for (int var30 = 0; ~var14 < ~var30; ++var30) {
                                    int var32 = var9 * var30 / var14;
                                    var19[class386.method2438(class437.field6373, arg6 + var30)] = var19[class386.method2438(class437.field6373, arg6 - -arg2 + -var30 + -1)] = var27 * var32 >> 12;
                                }
                            }
                            if (var16 - -var17 <= class202.field2852) {
                                class224.method1542(var19, var16, var17, var27);
                            } else {
                                int var31 = -var16 + class202.field2852;
                                class224.method1542(var19, var16, var31, var27);
                                class224.method1542(var19, 0, -var31 + var17, var27);
                            }
                        } else {
                            for (int var33 = 0; ~var14 < ~var33; ++var33) {
                                var19[class386.method2438(class437.field6373, arg6 + var33)] = var19[class386.method2438(class437.field6373, arg2 + arg6 + -var33 + -1)] = var9 * var33 / var14;
                            }
                            if (~class202.field2852 <= ~(var16 + var17)) {
                                class224.method1542(var19, var16, var17, var9);
                            } else {
                                int var34 = -var16 + class202.field2852;
                                class224.method1542(var19, var16, var34, var9);
                                class224.method1542(var19, 0, -var34 + var17, var9);
                            }
                        }
                    }
                }
            }
        } else if (~(arg2 + arg6) < ~class202.field2852) {
            int var35 = -arg6 + class202.field2852;
            for (int var36 = 0; ~var36 > ~arg5; ++var36) {
                int[] var37 = arg4[arg3 + var36];
                class224.method1542(var37, arg6, var35, var9);
                class224.method1542(var37, 0, arg2 - var35, var9);
            }
        } else {
            for (int var38 = 0; arg5 > var38; ++var38) {
                class224.method1542(arg4[arg3 - -var38], arg6, arg2, var9);
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZLjava/lang/String;)V", line = 665)
    public static final void method2804(int arg0, boolean arg1, String arg2) {
        ++field6655;
        int var3 = 41 % ((arg0 - -2) / 44);
        if (~class373.field5452 != -1 || class42.field564 >= 2) {
            if (arg2.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            try {
                if (arg2.equalsIgnoreCase("fpson")) {
                    class76.field961 = true;
                    class419.method2593(30444, "fps debug enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("fpsoff")) {
                    class76.field961 = false;
                    class419.method2593(30444, "fps debug disabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("cls")) {
                    class120.field1608 = 0;
                    class13.field222 = 0;
                    return;
                }
                if (arg2.equalsIgnoreCase("cleartext")) {
                    class134.field1839.method2021(-16777216);
                    class419.method2593(30444, "Text coords cleared");
                    return;
                }
                if (arg2.equalsIgnoreCase("gc")) {
                    class104.method728((byte) 108);
                    for (int var4 = 0; ~var4 > -11; ++var4) {
                        System.gc();
                    }
                    Runtime var5 = Runtime.getRuntime();
                    int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
                    class419.method2593(30444, "mem=" + var6 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("compact")) {
                    class104.method728((byte) 89);
                    for (int var7 = 0; ~var7 > -11; ++var7) {
                        System.gc();
                    }
                    Runtime var8 = Runtime.getRuntime();
                    int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
                    class419.method2593(30444, "Memory before cleanup=" + var9 + "k");
                    class240.method1614(false);
                    class104.method728((byte) 85);
                    for (int var10 = 0; ~var10 > -11; ++var10) {
                        System.gc();
                    }
                    int var11 = (int) ((var8.totalMemory() + -var8.freeMemory()) / 1024L);
                    class419.method2593(30444, "Memory after cleanup=" + var11 + "k");
                    return;
                }
                if (arg2.equalsIgnoreCase("pcachesize")) {
                    class419.method2593(30444, "Number of player models in cache:" + class143.method987(-3));
                    return;
                }
                if (arg2.equalsIgnoreCase("clientdrop")) {
                    class419.method2593(30444, "Dropped client connection");
                    if (~class120.field1610 != -31) {
                        if (class120.field1610 == 25) {
                            class417.field6025 = true;
                            return;
                        }
                    } else {
                        class346.method2239(19858);
                    }
                    return;
                }
                if (arg2.equalsIgnoreCase("clientjs5drop")) {
                    class257.field3800.method2675(-7416);
                    class419.method2593(30444, "Dropped client js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("serverjs5drop")) {
                    class257.field3800.method2680(-21154);
                    class419.method2593(30444, "Dropped server js5 net queue");
                    return;
                }
                if (arg2.equalsIgnoreCase("breakcon")) {
                    class267.field3963.method2202(27901);
                    class72.field933.method2696(120);
                    class257.field3800.method2668(16777215);
                    class419.method2593(30444, "Breaking new connections for 5 seconds");
                    return;
                }
                if (arg2.equalsIgnoreCase("rebuild")) {
                    class437.method2691(-1);
                    class83.method554(-83);
                    class419.method2593(30444, "Rebuilding map");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm1")) {
                    class370.method2358(1, -1, -1, false, -4);
                    if (~class329.method2151(0) != -2) {
                        class419.method2593(30444, "wm1 failed");
                        return;
                    }
                    class419.method2593(30444, "wm1 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm2")) {
                    class370.method2358(2, -1, -1, false, -4);
                    if (class329.method2151(0) == 2) {
                        class419.method2593(30444, "wm2 succeeded");
                        return;
                    }
                    class419.method2593(30444, "wm2 failed");
                    return;
                }
                if (arg2.equalsIgnoreCase("wm3")) {
                    class370.method2358(3, 1024, 768, false, -4);
                    if (class329.method2151(0) != 3) {
                        class419.method2593(30444, "wm3 failed");
                        return;
                    }
                    class419.method2593(30444, "wm3 succeeded");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk0")) {
                    class358.method2280(0, true);
                    if (~class118.field1594 == -1) {
                        class419.method2593(30444, "Entered tk0");
                        class322.field4739 = 0;
                        class53.method414(class267.field3963, true);
                        class175.field2399 = false;
                        return;
                    }
                    class419.method2593(30444, "Failed to enter tk0");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk1")) {
                    class358.method2280(1, true);
                    if (class118.field1594 == 1) {
                        class419.method2593(30444, "Entered tk1");
                        class322.field4739 = 1;
                        class53.method414(class267.field3963, true);
                        class175.field2399 = false;
                        return;
                    }
                    class419.method2593(30444, "Failed to enter tk1");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk2")) {
                    class358.method2280(2, true);
                    if (class118.field1594 == 2) {
                        class419.method2593(30444, "Entered tk2");
                        class322.field4739 = 2;
                        class53.method414(class267.field3963, true);
                        class175.field2399 = false;
                        return;
                    }
                    class419.method2593(30444, "Failed to enter tk2");
                    return;
                }
                if (arg2.equalsIgnoreCase("tk3")) {
                    class358.method2280(3, true);
                    if (~class118.field1594 == -4) {
                        class419.method2593(30444, "Entered tk3");
                        return;
                    }
                    class419.method2593(30444, "Failed to enter tk3");
                    return;
                }
                if (arg2.equalsIgnoreCase("ot")) {
                    class403.field5834 = !class403.field5834;
                    class53.method414(class267.field3963, true);
                    class175.field2399 = false;
                    class437.method2691(-1);
                    class419.method2593(30444, "ot=" + class403.field5834);
                    return;
                }
                if (arg2.equalsIgnoreCase("gb")) {
                    class29.field418 = !class29.field418;
                    class53.method414(class267.field3963, true);
                    class175.field2399 = false;
                    class437.method2691(-1);
                    class419.method2593(30444, "gb=" + class29.field418);
                    return;
                }
                if (arg2.startsWith("shadows")) {
                    if (~arg2.length() > -9) {
                        class419.method2593(30444, "Invalid shadows value");
                        return;
                    }
                    String var12 = arg2.substring(8);
                    int var13 = !class74.method526(var12, (byte) 15) ? -1 : class92.method627(var12, (byte) -69);
                    if (var13 >= 0 && ~var13 >= -3) {
                        class213.field3010 = var13;
                        class53.method414(class267.field3963, true);
                        class175.field2399 = false;
                        class437.method2691(-1);
                        class419.method2593(30444, "shadows=" + var13);
                        return;
                    }
                    class419.method2593(30444, "Invalid shadows value");
                    return;
                }
                if (arg2.startsWith("setba")) {
                    if (~arg2.length() > -7) {
                        class419.method2593(30444, "Invalid buildarea value");
                        return;
                    }
                    int var14 = class92.method627(arg2.substring(6), (byte) 101);
                    if (~var14 <= -1 && ~class313.method2068(-59, field6661) <= ~var14) {
                        class376.field5491 = var14;
                        class53.method414(class267.field3963, true);
                        class175.field2399 = false;
                        class419.method2593(30444, "maxbuildarea=" + class376.field5491);
                        return;
                    }
                    class419.method2593(30444, "Invalid buildarea value");
                    return;
                }
                if (arg2.startsWith("setparticles")) {
                    if (~arg2.length() > -14) {
                        class419.method2593(30444, "Invalid particles value");
                        return;
                    }
                    class106.method757(class92.method627(arg2.substring(13), (byte) -115), -1);
                    class53.method414(class267.field3963, true);
                    class175.field2399 = false;
                    class419.method2593(30444, "particles=" + class145.method1007(-14164));
                    return;
                }
                if (arg2.startsWith("rect_debug")) {
                    if (~arg2.length() > -11) {
                        class419.method2593(30444, "Invalid rect_debug value");
                        return;
                    }
                    class170.field2217 = class92.method627(arg2.substring(10).trim(), (byte) -98);
                    class419.method2593(30444, "rect_debug=" + class170.field2217);
                    return;
                }
                if (arg2.equalsIgnoreCase("qa_op_test")) {
                    class159.field2133 = true;
                    class419.method2593(30444, "qa_op_test=" + class159.field2133);
                    return;
                }
                if (arg2.equalsIgnoreCase("clipcomponents")) {
                    class245.field3627 = !class245.field3627;
                    class419.method2593(30444, "clipcomponents=" + class245.field3627);
                    return;
                }
                if (arg2.startsWith("bloom")) {
                    boolean var15 = class74.field942.method168();
                    if (!class419.method2592(32, !var15)) {
                        class419.method2593(30444, "Failed to enable bloom");
                        return;
                    }
                    if (var15) {
                        class419.method2593(30444, "Bloom disabled");
                        return;
                    }
                    class419.method2593(30444, "Bloom enabled");
                    return;
                }
                if (arg2.equalsIgnoreCase("tween")) {
                    if (class47.field616) {
                        class47.field616 = false;
                        class419.method2593(30444, "Forced tweening disabled.");
                        return;
                    }
                    class47.field616 = true;
                    class419.method2593(30444, "Forced tweening ENABLED!");
                    return;
                }
                if (arg2.equalsIgnoreCase("shiftclick")) {
                    if (class103.field1332) {
                        class419.method2593(30444, "Shift-click disabled.");
                        class103.field1332 = false;
                        return;
                    }
                    class419.method2593(30444, "Shift-click ENABLED!");
                    class103.field1332 = true;
                    return;
                }
                if (arg2.equalsIgnoreCase("getcgcoord")) {
                    class419.method2593(30444, "x:" + (class187.field2619.field4954 >> 7) + " z:" + (class187.field2619.field4951 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("getheight")) {
                    class419.method2593(30444, "Height: " + class215.field3069[class187.field2619.field4960].method1429(class187.field2619.field4954 >> 7, class187.field2619.field4951 >> 7));
                    return;
                }
                if (arg2.equalsIgnoreCase("resetminimap")) {
                    class257.field3813.method703((byte) -77);
                    class257.field3813.method720(24394);
                    class166.method1096(-81);
                    class83.method554(-92);
                    class419.method2593(30444, "Minimap reset");
                    return;
                }
                if (arg2.startsWith("mc")) {
                    if (!class74.field942.method78()) {
                        class419.method2593(30444, "Current toolkit doesn't support multiple cores");
                        return;
                    }
                    int var16 = Integer.parseInt(arg2.substring(3));
                    if (~var16 > -2) {
                        var16 = 1;
                    } else if (~var16 < -5) {
                        var16 = 4;
                    }
                    client.field3883 = var16;
                    class74.field942.method87(client.field3883);
                    class74.field942.method111(0);
                    class419.method2593(30444, "Render cores now: " + client.field3883);
                    return;
                }
                if (arg2.startsWith("cachespace")) {
                    class419.method2593(30444, "I(s): " + class125.field1658.method2301((byte) -103) + "/" + class125.field1658.method2305((byte) 122));
                    class419.method2593(30444, "I(m): " + class452.field6665.method2301((byte) -100) + "/" + class452.field6665.method2305((byte) 125));
                    class419.method2593(30444, "O(s): " + class157.field2119.field157.method2844(false) + "/" + class157.field2119.field157.method2839((byte) -13));
                    return;
                }
                if (arg2.equalsIgnoreCase("getcamerapos")) {
                    class419.method2593(30444, "Pos: " + class187.field2619.field4960 + "," + ((class298.field4343 >> 7) - -class28.field399 >> 6) + "," + ((class345.field5077 >> 7) - -class134.field1846 >> 6) + "," + ((class298.field4343 >> 7) + class28.field399 & 63) + "," + (63 & (class345.field5077 >> 7) + class134.field1846) + " Height: " + (class133.method889(class187.field2619.field4960, class298.field4343, class345.field5077, false) + -class164.field2171));
                    class419.method2593(30444, "Look: " + class187.field2619.field4960 + "," + (class93.field1159 + class28.field399 >> 6) + "," + (class32.field444 + class134.field1846 >> 6) + "," + (class93.field1159 + class28.field399 & 63) + "," + (class32.field444 + class134.field1846 & 63) + " Height: " + (class133.method889(class187.field2619.field4960, class93.field1159, class32.field444, false) + -class308.field4554));
                    return;
                }
                if (arg2.equals("showocc")) {
                    class215.field3067 = !class215.field3067;
                    class437.method2691(-1);
                    class419.method2593(30444, "showocc=" + class215.field3067);
                    return;
                }
                if (arg2.equals("renderprofile") || arg2.equals("rp")) {
                    class339.field5001 = !class339.field5001;
                    class74.field942.method148(class339.field5001);
                    class440.method2701(0);
                    class419.method2593(30444, "showprofiling=" + class339.field5001);
                    return;
                }
                if (arg2.equals("nonpcs")) {
                    class63.field832 = !class63.field832;
                    class419.method2593(30444, "nonpcs=" + class63.field832);
                    return;
                }
                if (arg2.equals("autoworld")) {
                    class296.method1971(1);
                    class419.method2593(30444, "auto world selected");
                    return;
                }
                if (arg2.equals("heap")) {
                    class419.method2593(30444, "Heap: " + field6661 + "MB");
                    return;
                }
                if (arg2.equals("savevarcs")) {
                    class387.method2445(-22716);
                    class419.method2593(30444, "perm varcs saved");
                    return;
                }
                if (arg2.equals("scramblevarcs")) {
                    for (int var17 = 0; var17 < class447.field6540.length; ++var17) {
                        if (class36.field512[var17]) {
                            class447.field6540[var17] = (int) (99999.0D * Math.random());
                            if (Math.random() > 0.5D) {
                                class447.field6540[var17] *= -1;
                            }
                        }
                    }
                    class387.method2445(-22716);
                    class419.method2593(30444, "perm varcs scrambled");
                    return;
                }
                if (arg2.equals("showcolmap")) {
                    class131.field1788 = true;
                    class83.method554(-83);
                    class419.method2593(30444, "colmap is shown");
                    return;
                }
                if (arg2.equals("hidecolmap")) {
                    class131.field1788 = false;
                    class83.method554(-99);
                    class419.method2593(30444, "colmap is hidden");
                    return;
                }
                if (arg2.equals("resetcache")) {
                    class446.method2748(-64);
                    class419.method2593(30444, "Caches reset");
                    return;
                }
                if (arg2.equals("profilecpu")) {
                    class419.method2593(30444, class304.method2023((byte) -104) + "ms");
                    return;
                }
                if (arg2.startsWith("cpuusage")) {
                    int var18 = Integer.parseInt(arg2.substring(9));
                    if (~var18 <= -1 && var18 <= 4) {
                        class329.field4900 = var18;
                    }
                    class419.method2593(30444, "cpuusage=" + class329.field4900);
                    return;
                }
                if (~class120.field1610 == -31) {
                    class257.method1773((byte) -10, class17.field269);
                    ++class13.field216;
                    class159.field2132.method1727(-128, arg2.length() - -2);
                    class159.field2132.method1727(-128, arg1 ? 1 : 0);
                    class159.field2132.method1712(arg2, -51);
                }
                if (arg2.startsWith("fps ") && ~class373.field5452 != -1) {
                    class184.method1266(class92.method627(arg2.substring(4), (byte) 103), (byte) 112);
                    return;
                }
                if (~class120.field1610 != -31) {
                    class419.method2593(30444, "Unrecogonised commmand when not logged in: " + arg2);
                    return;
                }
            } catch (Exception var19) {
                class419.method2593(30444, "Whoops, something went wrong.");
                return;
            }
        }
    }
}
