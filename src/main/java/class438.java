import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class438 extends class305 {

    @OriginalMember(owner = "client!gr", name = "J", descriptor = "I")
    private int field6522 = 1024;

    @OriginalMember(owner = "client!gr", name = "M", descriptor = "I")
    private int field6525 = 819;

    @OriginalMember(owner = "client!gr", name = "E", descriptor = "I")
    private int field6518 = 0;

    @OriginalMember(owner = "client!gr", name = "P", descriptor = "I")
    private int field6528 = 1024;

    @OriginalMember(owner = "client!gr", name = "L", descriptor = "I")
    private int field6524 = 0;

    @OriginalMember(owner = "client!gr", name = "F", descriptor = "I")
    private int field6519 = 409;

    @OriginalMember(owner = "client!gr", name = "R", descriptor = "I")
    private int field6530 = 2048;

    @OriginalMember(owner = "client!gr", name = "T", descriptor = "I")
    private int field6532 = 1024;

    @OriginalMember(owner = "client!gr", name = "I", descriptor = "I")
    private int field6521 = 1024;

    @OriginalMember(owner = "client!gr", name = "Y", descriptor = "[B")
    public static byte[] field6537;

    @OriginalMember(owner = "client!gr", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field6538;

    @OriginalMember(owner = "client!gr", name = "X", descriptor = "Lpu;")
    public static class179 field6536;

    @OriginalMember(owner = "client!gr", name = "bb", descriptor = "Ljp;")
    public static class55 field6540;

    @OriginalMember(owner = "client!gr", name = "D", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!gr", name = "G", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!gr", name = "K", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!gr", name = "N", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!gr", name = "O", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!gr", name = "Q", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!gr", name = "S", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!gr", name = "U", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!gr", name = "V", descriptor = "I")
    private int field6534;

    @OriginalMember(owner = "client!gr", name = "W", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!gr", name = "ab", descriptor = "I")
    public static int field6539;

    static {
        new class179("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field6537 = new byte[2048];
        field6538 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
        field6536 = new class179("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");
        field6540 = new class55(78, 8);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lgq;", line = 5)
    public static final class244 method2712(Canvas arg0, int arg1) {
        if (arg1 != 0) {
            method2715((class521) null, 94);
        }
        ++field6520;
        try {
            Class var2 = Class.forName("qc");
            class244 var3 = (class244) var2.newInstance();
            var3.method383(false, arg0);
            return var3;
        } catch (Throwable var5) {
            class59 var4 = new class59();
            var4.method383(false, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILfh;B)V", line = 30)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field6533;
        if (arg2 >= 76) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 != -3) {
                        if (arg0 != 3) {
                            if (arg0 != 4) {
                                if (~arg0 != -6) {
                                    if (~arg0 != -7) {
                                        if (~arg0 != -8) {
                                            if (~arg0 == -9) {
                                                this.field6522 = arg1.method1396(48);
                                            }
                                        } else {
                                            this.field6532 = arg1.method1396(-114);
                                        }
                                    } else {
                                        this.field6518 = arg1.method1337((byte) 20);
                                    }
                                } else {
                                    this.field6521 = arg1.method1396(-95);
                                }
                            } else {
                                this.field6525 = arg1.method1396(-104);
                            }
                        } else {
                            this.field6519 = arg1.method1396(90);
                        }
                    } else {
                        this.field6530 = arg1.method1396(-114);
                    }
                } else {
                    this.field6528 = arg1.method1396(1);
                }
            } else {
                this.field6524 = arg1.method1337((byte) -116);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[B)Ltr;", line = 129)
    public static final class247 method2713(int arg0, byte[] arg1) {
        ++field6531;
        class247 var2 = new class247();
        class194 var3 = new class194(arg1);
        var3.field2982 = var3.field2973.length + arg0;
        int var4 = var3.method1396(arg0 ^ 83);
        int var5 = var3.field2973.length + -2 + -var4 + -12;
        var3.field2982 = var5;
        int var6 = var3.method1401(-72);
        var2.field3703 = var3.method1396(-82);
        var2.field3696 = var3.method1396(-116);
        var2.field3700 = var3.method1396(-112);
        var2.field3698 = var3.method1396(-118);
        int var7 = var3.method1337((byte) 73);
        if (var7 > 0) {
            var2.field3705 = new class56[var7];
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                int var9 = var3.method1396(arg0 ^ 93);
                class56 var10 = new class56(class46.method307((byte) 108, var9));
                var2.field3705[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method1401(125);
                    int var12 = var3.method1401(127);
                    var10.method357(new class50(var12), arg0 + 3, (long) var11);
                }
            }
        }
        var3.field2982 = 0;
        var2.field3702 = var3.method1363(false);
        var2.field3706 = new int[var6];
        var2.field3704 = new int[var6];
        var2.field3694 = new String[var6];
        int var13 = 0;
        while (~var5 < ~var3.field2982) {
            int var14 = var3.method1396(69);
            if (var14 == 3) {
                var2.field3694[var13] = var3.method1347(-123).intern();
            } else if (~var14 > -101 && var14 != 21 && var14 != 38 && var14 != 39) {
                var2.field3704[var13] = var3.method1401(arg0 + -98);
            } else {
                var2.field3704[var13] = var3.method1337((byte) -120);
            }
            var2.field3706[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "()V", line = 207)
    public class438() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBLpq;I)V", line = 210)
    public static final void method2714(int arg0, byte arg1, class52 arg2, int arg3) {
        class166.field2508[arg3][arg0] = arg2;
        ++field6526;
        if (arg1 != -114) {
            method2716(-107);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 222)
    public final void method17(byte arg0) {
        ++field6535;
        if (arg0 != -62) {
            this.method2718(-32, (int[][]) null, 55, -96, (Random) null, (byte) 41, 72);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lwl;I)V", line = 237)
    public static final void method2715(class521 arg0, int arg1) {
        if (arg1 == 0) {
            ++field6527;
            if (!(arg0 instanceof class46)) {
                if (arg0 instanceof class511) {
                    class511 var2 = (class511) arg0;
                    class258.method1818(16706, var2, class116.field1781.field1274 != var2.field1274);
                    return;
                }
            } else {
                class46 var3 = (class46) arg0;
                if (var3.field718 == null) {
                    return;
                }
                class238.method1608(var3, 24986, class116.field1781.field1274 != var3.field1274);
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V", line = 267)
    public static void method2716(int arg0) {
        field6537 = null;
        field6540 = null;
        field6536 = null;
        field6538 = null;
        if (arg0 != 2) {
            field6540 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)I", line = 288)
    public static final int method2717(int arg0, int arg1) {
        if (arg0 != 261784) {
            method2713(-118, (byte[]) null);
        }
        ++field6523;
        return (arg1 & 261784) >> 11;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[[IIILjava/util/Random;BI)V", line = 309)
    private final void method2718(int arg0, int[][] arg1, int arg2, int arg3, Random arg4, byte arg5, int arg6) {
        ++field6539;
        if (arg5 <= 36) {
            method2717(53, -80);
        }
        int var8 = this.field6522 <= 0 ? 4096 : -class58.method378(false, this.field6522, arg4) + 4096;
        int var9 = this.field6534 * this.field6532 >> 12;
        int var10 = this.field6534 - (var9 > 0 ? class58.method378(false, var9, arg4) : 0);
        if (~class91.field1471 >= ~arg2) {
            arg2 -= class91.field1471;
        }
        if (~var10 >= -1) {
            if (~(arg2 - -arg0) < ~class91.field1471) {
                int var11 = -arg2 + class91.field1471;
                for (int var12 = 0; ~arg6 < ~var12; ++var12) {
                    int[] var13 = arg1[arg3 + var12];
                    class325.method2134(var13, arg2, var11, var8);
                    class325.method2134(var13, 0, arg0 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    class325.method2134(arg1[arg3 + var14], arg2, arg0, var8);
                }
            }
        } else if (arg6 > 0 && ~arg0 < -1) {
            int var15 = arg0 / 2;
            int var16 = arg6 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg2 - -var17;
            int var20 = -(var17 * 2) + arg0;
            for (int var21 = 0; var21 < arg6; ++var21) {
                int[] var22 = arg1[arg3 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field6518 == 0) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class307.method2028(arg2 + var24, class228.field3447)] = var22[class307.method2028(arg2 - -arg0 + -var24 + -1, class228.field3447)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class307.method2028(class228.field3447, arg2 - -var26)] = var22[class307.method2028(arg2 - var26 + arg0 + -1, class228.field3447)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (~(var19 - -var20) >= ~class91.field1471) {
                        class325.method2134(var22, var19, var20, var23);
                    } else {
                        int var27 = class91.field1471 - var19;
                        class325.method2134(var22, var19, var27, var23);
                        class325.method2134(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg6 - 1;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field6518 != 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class307.method2028(arg2 + var31, class228.field3447)] = var22[class307.method2028(class228.field3447, arg2 - (-arg0 + var31) + -1)] = var32 < var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class307.method2028(arg2 - -var33, class228.field3447)] = var22[class307.method2028(arg2 - -arg0 - var33 + -1, class228.field3447)] = var30 * var35 >> 12;
                            }
                        }
                        if (class91.field1471 < var19 + var20) {
                            int var34 = class91.field1471 - var19;
                            class325.method2134(var22, var19, var34, var30);
                            class325.method2134(var22, 0, -var34 + var20, var30);
                        } else {
                            class325.method2134(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class307.method2028(arg2 - -var36, class228.field3447)] = var22[class307.method2028(arg0 + arg2 - (var36 + 1), class228.field3447)] = var8 * var36 / var17;
                        }
                        if (~class91.field1471 <= ~(var19 + var20)) {
                            class325.method2134(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class91.field1471;
                            class325.method2134(var22, var19, var37, var8);
                            class325.method2134(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)[I", line = 536)
    public final int[] method15(int arg0, int arg1) {
        ++field6529;
        if (arg1 != 4688) {
            this.method17((byte) -81);
        }
        int[] var3 = super.field4677.method2174(arg0, -112);
        if (super.field4677.field5040) {
            int[][] var4 = super.field4677.method2177((byte) -56);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class91.field1471 * this.field6528 >> 12;
            int var15 = class91.field1471 * this.field6530 >> 12;
            int var16 = class537.field7884 * this.field6519 >> 12;
            int var17 = class537.field7884 * this.field6525 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field6534 = class91.field1471 / 8 * this.field6521 >> 12;
                int var18 = class91.field1471 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6524);
                while (true) {
                    while (true) {
                        int var22 = class58.method378(false, -var14 + var15, var21) + var14;
                        int var23 = class58.method378(false, -var16 + var17, var21) + var16;
                        int var24 = var8 + var22;
                        if (~class91.field1471 > ~var24) {
                            var22 = -var8 + class91.field1471;
                            var24 = class91.field1471;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class91.field1471;
                            }
                            if (~var29 < ~class91.field1471) {
                                var29 -= class91.field1471;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && var29 <= var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var8 - -var5;
                                        if (~var31 > -1) {
                                            var31 += class91.field1471;
                                        }
                                        if (~class91.field1471 > ~var31) {
                                            var31 -= class91.field1471;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (~var36 == -1) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class91.field1471;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method2718(-var39 + var38, var4, var7 + var39, var35, var21, (byte) 42, var25 - var35);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (var23 + var25 <= class537.field7884) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class537.field7884;
                        }
                        if (class91.field1471 == var24) {
                            this.method2718(var22, var4, var6 + var8, var25, var21, (byte) 122, var23);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class58.method378(false, class91.field1471, var21);
                            var8 = 0;
                            var5 = var6 - var7;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class91.field1471 + var5;
                            }
                            var9 = 0;
                            if (class91.field1471 < var43) {
                                var43 -= class91.field1471;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var43 >= var44[0] && ~var44[1] <= ~var43) {
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[2] = var23 + var25;
                            var45[0] = var8;
                            var45[1] = var24;
                            this.method2718(var22, var4, var6 + var8, var25, var21, (byte) 66, var23);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
