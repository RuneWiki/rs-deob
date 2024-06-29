import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class119 extends class346 {

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    private int field1541 = 1024;

    @OriginalMember(owner = "client!cq", name = "W", descriptor = "I")
    private int field1555 = 0;

    @OriginalMember(owner = "client!cq", name = "Q", descriptor = "I")
    private int field1549 = 81;

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    private int field1542 = 8;

    @OriginalMember(owner = "client!cq", name = "bb", descriptor = "I")
    private int field1560 = 4;

    @OriginalMember(owner = "client!cq", name = "M", descriptor = "I")
    private int field1545 = 204;

    @OriginalMember(owner = "client!cq", name = "ab", descriptor = "I")
    private int field1559 = 409;

    @OriginalMember(owner = "client!cq", name = "Z", descriptor = "I")
    private int field1558 = 1024;

    @OriginalMember(owner = "client!cq", name = "O", descriptor = "J")
    public static long field1547 = 0L;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!cq", name = "L", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!cq", name = "N", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!cq", name = "P", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!cq", name = "T", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!cq", name = "V", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!cq", name = "X", descriptor = "I")
    private int field1556;

    @OriginalMember(owner = "client!cq", name = "Y", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!cq", name = "cb", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!cq", name = "db", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!cq", name = "eb", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!cq", name = "R", descriptor = "[I")
    private int[] field1550;

    @OriginalMember(owner = "client!cq", name = "S", descriptor = "[[I")
    private int[][] field1551;

    @OriginalMember(owner = "client!cq", name = "U", descriptor = "[[I")
    private int[][] field1553;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lfb;ZI)V", line = 6)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field1546;
        if (!arg1) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (~arg2 != -4) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (~arg2 != -7) {
                                        if (~arg2 == -8) {
                                            this.field1541 = arg0.method2239(-1076227960);
                                        }
                                    } else {
                                        this.field1549 = arg0.method2239(-1076227960);
                                    }
                                } else {
                                    this.field1555 = arg0.method2239(-1076227960);
                                }
                            } else {
                                this.field1558 = arg0.method2239(-1076227960);
                            }
                        } else {
                            this.field1545 = arg0.method2239(-1076227960);
                        }
                    } else {
                        this.field1559 = arg0.method2239(-1076227960);
                    }
                } else {
                    this.field1542 = arg0.method2233((byte) 104);
                }
            } else {
                this.field1560 = arg0.method2233((byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V", line = 94)
    private final void method862(int arg0) {
        ++field1563;
        Random var2 = new Random((long) this.field1542);
        this.field1554 = this.field1549 / 2;
        this.field1543 = 4096 / this.field1542;
        this.field1556 = 4096 / this.field1560;
        int var3 = this.field1556 / 2;
        this.field1550 = new int[this.field1542 + 1];
        int var4 = this.field1543 / 2;
        this.field1553 = new int[this.field1542][this.field1560 - -1];
        this.field1551 = new int[this.field1542][this.field1560];
        this.field1550[0] = 0;
        if (arg0 > 121) {
            for (int var5 = 0; ~var5 > ~this.field1542; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field1543;
                    int var7 = (-2048 + class9.method67(4096, -1, var2)) * this.field1545 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1550[var5] = this.field1550[var5 + -1] + var8;
                }
                this.field1553[var5][0] = 0;
                for (int var9 = 0; ~this.field1560 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1556;
                        int var11 = (-2048 + class9.method67(4096, -1, var2)) * this.field1559 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1553[var5][var9] = this.field1553[var5][var9 + -1] + var12;
                    }
                    this.field1551[var5][var9] = this.field1541 > 0 ? 4096 + -class9.method67(this.field1541, -1, var2) : 4096;
                }
                this.field1553[var5][this.field1560] = 4096;
            }
            this.field1550[this.field1542] = 4096;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lir;B)V", line = 163)
    public static final void method863(class185 arg0, byte arg1) {
        class24.field432 = arg0;
        ++field1561;
        int var2 = -7 % ((68 - arg1) / 48);
        class45.field681 = class24.field432.method1225(15, (byte) 27);
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V", line = 180)
    public static final void method864(int arg0) {
        class295.method1997((byte) 120, false);
        ++field1544;
        class438.field6355 = 0;
        boolean var1 = true;
        for (int var2 = 0; ~class238.field3324.length < ~var2; ++var2) {
            if (class51.field791[var2] != -1 && class238.field3324[var2] == null) {
                class238.field3324[var2] = class68.field992.method1235(class51.field791[var2], false, 0);
                if (class238.field3324[var2] == null) {
                    var1 = false;
                    ++class438.field6355;
                }
            }
            if (class51.field797[var2] != -1 && class312.field4601[var2] == null) {
                class312.field4601[var2] = class68.field992.method1226(class338.field4996[var2], 0, -3738, class51.field797[var2]);
                if (class312.field4601[var2] == null) {
                    var1 = false;
                    ++class438.field6355;
                }
            }
            if (~class184.field2464[var2] != 0 && class243.field3411[var2] == null) {
                class243.field3411[var2] = class68.field992.method1235(class184.field2464[var2], false, 0);
                if (class243.field3411[var2] == null) {
                    ++class438.field6355;
                    var1 = false;
                }
            }
            if (class436.field6331[var2] != -1 && class6.field81[var2] == null) {
                class6.field81[var2] = class68.field992.method1235(class436.field6331[var2], false, 0);
                if (class6.field81[var2] == null) {
                    var1 = false;
                    ++class438.field6355;
                }
            }
            if (class9.field169 != null && class290.field4391[var2] == null && class9.field169[var2] != -1) {
                class290.field4391[var2] = class68.field992.method1226(class338.field4996[var2], 0, -3738, class9.field169[var2]);
                if (class290.field4391[var2] == null) {
                    var1 = false;
                    ++class438.field6355;
                }
            }
        }
        if (class162.field2130 == null) {
            if (class47.field709 != null && class299.field4523.method1224(96, class47.field709.field5535 + "_staticelements")) {
                if (!class299.field4523.method1233((byte) -17, class47.field709.field5535 + "_staticelements")) {
                    ++class438.field6355;
                    var1 = false;
                } else {
                    class162.field2130 = class113.method834(class47.field709.field5535 + "_staticelements", (byte) 66, class299.field4523, class190.field2652);
                }
            } else {
                class162.field2130 = new class269(0);
            }
        }
        if (!var1) {
            class265.field3924 = 1;
        } else {
            class238.field3326 = 0;
            boolean var3 = true;
            for (int var4 = 0; var4 < class238.field3324.length; ++var4) {
                byte[] var21 = class312.field4601[var4];
                if (var21 != null) {
                    int var22 = (class166.field2249[var4] >> 8) * 64 + -class236.field3292;
                    int var23 = (class166.field2249[var4] & 255) * 64 + -class90.field1223;
                    if (class48.field743) {
                        var22 = 10;
                        var23 = 10;
                    }
                    var3 &= class69.method581(88, var22, var23, var21);
                }
                byte[] var24 = class6.field81[var4];
                if (var24 != null) {
                    int var25 = (class166.field2249[var4] >> 8) * 64 - class236.field3292;
                    int var26 = (class166.field2249[var4] & 255) * 64 + -class90.field1223;
                    if (class48.field743) {
                        var25 = 10;
                        var26 = 10;
                    }
                    var3 &= class69.method581(95, var25, var26, var24);
                }
            }
            if (!var3) {
                class265.field3924 = 2;
            } else {
                if (class265.field3924 != 0) {
                    class447.method2773(class165.field2240 + "<br>(100%)", true, (byte) -41, class41.field630);
                }
                class264.method1766(8);
                class452.method2808(0);
                boolean var5 = false;
                if (class126.field1647.method497() && class452.field6560) {
                    for (int var6 = 0; ~class238.field3324.length < ~var6; ++var6) {
                        if (class6.field81[var6] != null || class243.field3411[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (!class1.field10) {
                    var7 = class192.field2666[class398.field5838];
                } else {
                    var7 = class266.field3949[class398.field5838];
                }
                if (class126.field1647.method524()) {
                    ++var7;
                }
                class223.method1455(4, class351.field5217, class143.field1815, var7, var5, ~class126.field1647.method495() < -1);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class420.field6108[var8].method1850(false);
                }
                class106.method805(2);
                int var9 = -6 / ((81 - arg0) / 37);
                class60.method533(false, -104);
                class21.method195(false);
                class264.method1766(8);
                System.gc();
                class295.method1997((byte) 61, true);
                class431.method2691(28437, 4);
                int[][] var10 = null;
                if (!class48.field743) {
                    class264.method1768((byte) 116, false);
                    class190.method1264(class383.field5609.field2190[0] >> 3, -2684, class383.field5609.field2189[0] >> 3);
                    class159.method1060(false);
                    class246.method1610(false, 4, false, class126.field1647, (int[][]) null);
                    var10 = class164.field2231[0];
                    class295.method1997((byte) 99, true);
                    class72.method592((byte) -38, false);
                    if (class290.field4391 != null) {
                        class72.method590(88);
                    }
                }
                if (class48.field743) {
                    class396.method2547(false, 0);
                    class190.method1264(class383.field5609.field2190[0] >> 3, -2684, class383.field5609.field2189[0] >> 3);
                    class159.method1060(false);
                    class246.method1610(false, 4, false, class126.field1647, (int[][]) null);
                    var10 = class164.field2231[0];
                    class295.method1997((byte) 117, true);
                    class9.method63(false, -1);
                }
                class452.method2808(0);
                class295.method1997((byte) 109, true);
                class379.method2473((class193) null, class126.field1647, false, 4, class420.field6108, 0);
                class191.method1271(4, true, class126.field1647);
                class295.method1997((byte) 107, true);
                int var11 = class113.field1458;
                if (~class268.field3973 > ~var11) {
                    var11 = class268.field3973;
                }
                if (~var11 > ~(class268.field3973 + -1)) {
                    var11 = class268.field3973 - 1;
                }
                if (!class226.method1467(0)) {
                    class422.method2656(var11);
                } else {
                    class422.method2656(0);
                }
                class126.method890((byte) -30);
                if (var5) {
                    class325.method2128(true);
                    class431.method2691(28437, 1);
                    if (!class48.field743) {
                        class264.method1768((byte) 123, true);
                        class246.method1610(false, 1, true, class126.field1647, var10);
                        class295.method1997((byte) 95, true);
                        class72.method592((byte) -21, true);
                        class191.method1271(1, true, class126.field1647);
                    }
                    if (class48.field743) {
                        class396.method2547(true, 0);
                        class246.method1610(false, 1, true, class126.field1647, var10);
                        class295.method1997((byte) 114, true);
                        class9.method63(true, -1);
                    }
                    class452.method2808(0);
                    class295.method1997((byte) 61, true);
                    class379.method2473(class142.field1804[0], class126.field1647, true, 1, class420.field6108, 0);
                    class191.method1271(1, true, class126.field1647);
                    class295.method1997((byte) 71, true);
                    class126.method890((byte) -30);
                    class325.method2128(false);
                }
                for (int var12 = 0; var12 < 3; ++var12) {
                    for (int var19 = 0; ~var19 > ~class351.field5217; ++var19) {
                        for (int var20 = 0; class143.field1815 > var20; ++var20) {
                            class11.method90(var12, var19, var20, (byte) 97);
                        }
                    }
                }
                class67.method571((byte) -6);
                class264.method1766(8);
                class193.method1287((byte) 75);
                class452.method2808(0);
                class73.field1032 = false;
                class268.method1792(true);
                if (class428.field6222 != null && class290.field4380 != null && ~class381.field5579 == -26) {
                    ++class95.field1301;
                    class140.field1797.method1833(-20379, 203);
                    class140.field1797.method2240((byte) -88, 1057001181);
                }
                if (!class48.field743) {
                    int var13 = (-(class351.field5217 >> 4) + class359.field5314) / 8;
                    int var14 = ((class351.field5217 >> 4) + class359.field5314) / 8;
                    int var15 = (class62.field940 - (class143.field1815 >> 4)) / 8;
                    int var16 = ((class143.field1815 >> 4) + class62.field940) / 8;
                    for (int var17 = var13 + -1; var17 <= var14 - -1; ++var17) {
                        for (int var18 = var15 + -1; ~(var16 + 1) <= ~var18; ++var18) {
                            if (var17 < var13 || var14 < var17 || ~var15 < ~var18 || ~var18 < ~var16) {
                                class68.field992.method1219(94, "m" + var17 + "_" + var18);
                                class68.field992.method1219(86, "l" + var17 + "_" + var18);
                            }
                        }
                    }
                }
                if (class381.field5579 != 28) {
                    class63.method558(30, true);
                    if (class290.field4380 != null) {
                        class140.field1797.method1833(-20379, 169);
                    }
                } else {
                    class63.method558(10, true);
                }
                class295.method2001(true);
                class264.method1766(8);
                class7.method39(-15898);
            }
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)[I", line = 615)
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            return null;
        } else {
            ++field1548;
            int[] var3 = super.field5152.method1409((byte) 48, arg0);
            if (super.field5152.field3004) {
                int var4 = 0;
                int var5;
                for (var5 = class436.field6337[arg0] + this.field1555; var5 < 0; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (this.field1542 > var4 && var5 >= this.field1550[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(1 & var4) == -1;
                int var8 = this.field1550[var4];
                int var9 = this.field1550[var4 + -1];
                if (~var5 < ~(this.field1554 + var9) && ~(-this.field1554 + var8) < ~var5) {
                    for (int var10 = 0; class134.field1753 > var10; ++var10) {
                        int var11 = 0;
                        int var12 = !var7 ? -this.field1558 : this.field1558;
                        int var13;
                        for (var13 = (this.field1556 * var12 >> 12) + class361.field5340[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (this.field1560 > var11 && ~var13 <= ~this.field1553[var6][var11]) {
                            ++var11;
                        }
                        int var14 = var11 + -1;
                        int var15 = this.field1553[var6][var14];
                        int var16 = this.field1553[var6][var11];
                        if (var13 > this.field1554 + var15 && ~var13 > ~(var16 - this.field1554)) {
                            var3[var10] = this.field1551[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class206.method1356(var3, 0, class134.field1753, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V", line = 760)
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)I", line = 718)
    public static final int method865(int arg0) {
        ++field1562;
        class298 var1 = class126.field1647;
        boolean var2 = false;
        if (~class397.field5796 != -1) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class107.method813(0, (class364) null, 0, var3, (class288) null, 8);
        }
        long var4 = class98.method768((byte) 51);
        for (int var6 = 0; ~var6 > -10001; ++var6) {
            var1.method439(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class98.method768((byte) -75) + -var4);
        var1.method2023(100, 0, 0, -11682, 100, -16777216);
        if (var2) {
            var1.method2019(0);
        }
        if (arg0 != 1) {
            field1547 = 79L;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 766)
    public final void method237(byte arg0) {
        this.method862(123);
        if (arg0 > -95) {
            method866(-28, -122, 108, (Object[]) null, (long[]) null);
        }
        ++field1557;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(III[Ljava/lang/Object;[J)V", line = 789)
    public static final void method866(int arg0, int arg1, int arg2, Object[] arg3, long[] arg4) {
        if (arg2 >= 21) {
            if (~arg0 < ~arg1) {
                int var5 = (arg0 + arg1) / 2;
                int var6 = arg1;
                long var7 = arg4[var5];
                arg4[var5] = arg4[arg0];
                arg4[arg0] = var7;
                Object var9 = arg3[var5];
                arg3[var5] = arg3[arg0];
                arg3[arg0] = var9;
                for (int var10 = arg1; arg0 > var10; ++var10) {
                    if ((long) (1 & var10) + var7 > arg4[var10]) {
                        long var11 = arg4[var10];
                        arg4[var10] = arg4[var6];
                        arg4[var6] = var11;
                        Object var13 = arg3[var10];
                        arg3[var10] = arg3[var6];
                        arg3[var6++] = var13;
                    }
                }
                arg4[arg0] = arg4[var6];
                arg4[var6] = var7;
                arg3[arg0] = arg3[var6];
                arg3[var6] = var9;
                method866(var6 - 1, arg1, 68, arg3, arg4);
                method866(arg0, var6 + 1, 120, arg3, arg4);
            }
            ++field1552;
        }
    }
}
