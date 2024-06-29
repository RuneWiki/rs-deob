import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class92 extends class197 {

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field1612 = 0;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "I")
    private int field1615 = 819;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    private int field1624 = 1024;

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    private int field1623 = 1024;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    private int field1621 = 409;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    private int field1626 = 0;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    private int field1629 = 2048;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    private int field1627 = 1024;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "I")
    private int field1617 = 1024;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "Loh;")
    public static class258 field1613 = class153.method1046("0(U", 105);

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "[I")
    public static int[] field1616 = new int[32768];

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "Loh;")
    public static class258 field1630 = class153.method1046("Null", 102);

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "I")
    private int field1632;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILva;I)V", line = 4)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            this.method98(17, (class235) null, -82);
        }
        field1634++;
        if (arg2 == 0) {
            this.field1626 = arg1.method1589(61);
        } else if (arg2 == 1) {
            this.field1623 = arg1.method1615(117);
        } else if (arg2 == 2) {
            this.field1629 = arg1.method1615(-120);
        } else if (arg2 == 3) {
            this.field1621 = arg1.method1615(-126);
        } else if (arg2 == 4) {
            this.field1615 = arg1.method1615(62);
        } else if (arg2 == 5) {
            this.field1627 = arg1.method1615(-2);
        } else if (arg2 == 6) {
            this.field1612 = arg1.method1589(arg0 ^ 0x1F5C);
        } else if (arg2 == 7) {
            this.field1617 = arg1.method1615(23);
        } else if (arg2 == 8) {
            this.field1624 = arg1.method1615(-35);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 107)
    public final void method223(int arg0) {
        if (arg0 == 11135) {
            field1631++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BIIIIII)V", line = 128)
    public static final void method680(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class284.method1993((byte) -45, arg2);
        int var7 = 0;
        field1622++;
        int var8 = arg2;
        int var9 = arg2 - arg4;
        int var10 = -arg2;
        if (var9 < 0) {
            var9 = 0;
        }
        int var11 = var9;
        int var12 = -var9;
        int var13 = -1;
        int var14 = -1;
        if (class241.field4189 <= arg3 && class94.field1654 >= arg3) {
            int[] var15 = class154.field2638[arg3];
            int var16 = class203.method1347(class75.field1314, arg5 - arg2, 1, class206.field3562);
            int var17 = class203.method1347(class75.field1314, arg5 + arg2, 1, class206.field3562);
            int var18 = class203.method1347(class75.field1314, arg5 - var9, 1, class206.field3562);
            int var19 = class203.method1347(class75.field1314, arg5 + var9, 1, class206.field3562);
            class19.method126(7, arg1, var15, var16, var18);
            class19.method126(7, arg6, var15, var18, var19);
            class19.method126(7, arg1, var15, var19, var17);
        }
        if (arg0 < 104) {
            return;
        }
        while (var8 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                var12 -= var11 << 1;
                class114.field2016[var11] = var7;
            }
            var10 += var14;
            var7++;
            if (var10 >= 0) {
                var8--;
                var10 -= var8 << 1;
                int var20 = arg3 + var8;
                int var21 = arg3 - var8;
                if (var20 >= class241.field4189 && class94.field1654 >= var21) {
                    if (var8 >= var9) {
                        int var22 = class203.method1347(class75.field1314, arg5 + var7, 1, class206.field3562);
                        int var23 = class203.method1347(class75.field1314, arg5 - var7, 1, class206.field3562);
                        if (var20 <= class94.field1654) {
                            class19.method126(7, arg1, class154.field2638[var20], var23, var22);
                        }
                        if (var21 >= class241.field4189) {
                            class19.method126(7, arg1, class154.field2638[var21], var23, var22);
                        }
                    } else {
                        int var24 = class114.field2016[var8];
                        int var25 = class203.method1347(class75.field1314, arg5 + var7, 1, class206.field3562);
                        int var26 = class203.method1347(class75.field1314, arg5 - var7, 1, class206.field3562);
                        int var27 = class203.method1347(class75.field1314, arg5 + var24, 1, class206.field3562);
                        int var28 = class203.method1347(class75.field1314, arg5 - var24, 1, class206.field3562);
                        if (class94.field1654 >= var20) {
                            int[] var29 = class154.field2638[var20];
                            class19.method126(7, arg1, var29, var26, var28);
                            class19.method126(7, arg6, var29, var28, var27);
                            class19.method126(7, arg1, var29, var27, var25);
                        }
                        if (var21 >= class241.field4189) {
                            int[] var30 = class154.field2638[var21];
                            class19.method126(7, arg1, var30, var26, var28);
                            class19.method126(7, arg6, var30, var28, var27);
                            class19.method126(7, arg1, var30, var27, var25);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class241.field4189 && var31 <= class94.field1654) {
                int var33 = arg5 - var8;
                int var34 = arg5 + var8;
                if (class75.field1314 <= var34 && var33 <= class206.field3562) {
                    int var35 = class203.method1347(class75.field1314, var34, 1, class206.field3562);
                    int var36 = class203.method1347(class75.field1314, var33, 1, class206.field3562);
                    if (var9 > var7) {
                        int var37 = var11 >= var7 ? var11 : class114.field2016[var7];
                        int var38 = class203.method1347(class75.field1314, arg5 + var37, 1, class206.field3562);
                        int var39 = class203.method1347(class75.field1314, arg5 - var37, 1, class206.field3562);
                        if (var32 <= class94.field1654) {
                            int[] var40 = class154.field2638[var32];
                            class19.method126(7, arg1, var40, var36, var39);
                            class19.method126(7, arg6, var40, var39, var38);
                            class19.method126(7, arg1, var40, var38, var35);
                        }
                        if (var31 >= class241.field4189) {
                            int[] var41 = class154.field2638[var31];
                            class19.method126(7, arg1, var41, var36, var39);
                            class19.method126(7, arg6, var41, var39, var38);
                            class19.method126(7, arg1, var41, var38, var35);
                        }
                    } else {
                        if (class94.field1654 >= var32) {
                            class19.method126(7, arg1, class154.field2638[var32], var36, var35);
                        }
                        if (var31 >= class241.field4189) {
                            class19.method126(7, arg1, class154.field2638[var31], var36, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 1013)
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/util/Random;IIIII[[I)V", line = 333)
    private final void method681(Random arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        field1633++;
        int var8 = this.field1624 > 0 ? 4096 - class285.method1996(1, arg0, this.field1624) : 4096;
        int var9 = this.field1632 * this.field1617 >> 12;
        int var10 = this.field1632 - (var9 > 0 ? class285.method1996(1, arg0, var9) : 0);
        if (arg5 >= class190.field3362) {
            arg5 -= class190.field3362;
        }
        if (arg4 <= 92) {
            return;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg1 <= 0) {
                return;
            }
            int var15 = arg1 / 2;
            int var16 = var15 < var10 ? var15 : var10;
            int var17 = arg2 / 2;
            int var18 = var17 < var10 ? var17 : var10;
            int var19 = arg5 + var16;
            int var20 = arg1 - var16 * 2;
            for (int var21 = 0; var21 < arg2; var21++) {
                int[] var22 = arg6[arg3 + var21];
                if (var18 <= var21) {
                    int var23 = arg2 - var21 - 1;
                    if (var18 > var23) {
                        int var24 = var8 * var23 / var18;
                        if (this.field1612 == 0) {
                            for (int var27 = 0; var27 < var16; var27++) {
                                int var28 = var8 * var27 / var16;
                                var22[class2.method15(class48.field723, arg5 + var27)] = var22[class2.method15(arg5 + arg1 - var27 - 1, class48.field723)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var16; var25++) {
                                int var26 = var8 * var25 / var16;
                                var22[class2.method15(arg5 + var25, class48.field723)] = var22[class2.method15(arg5 + arg1 - var25 - 1, class48.field723)] = var26 >= var24 ? var24 : var26;
                            }
                        }
                        if (class190.field3362 < var19 + var20) {
                            int var29 = class190.field3362 - var19;
                            class275.method1931(var22, var19, var29, var24);
                            class275.method1931(var22, 0, var20 - var29, var24);
                        } else {
                            class275.method1931(var22, var19, var20, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var16; var30++) {
                            var22[class2.method15(class48.field723, arg5 + var30)] = var22[class2.method15(class48.field723, arg1 + arg5 - var30 - 1)] = var8 * var30 / var16;
                        }
                        if (var19 + var20 <= class190.field3362) {
                            class275.method1931(var22, var19, var20, var8);
                        } else {
                            int var31 = class190.field3362 - var19;
                            class275.method1931(var22, var19, var31, var8);
                            class275.method1931(var22, 0, var20 - var31, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field1612 == 0) {
                        for (int var33 = 0; var33 < var16; var33++) {
                            int var34 = var8 * var33 / var16;
                            var22[class2.method15(arg5 + var33, class48.field723)] = var22[class2.method15(class48.field723, arg1 + arg5 - var33 - 1)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var16; var35++) {
                            int var36 = var8 * var35 / var16;
                            var22[class2.method15(arg5 + var35, class48.field723)] = var22[class2.method15(class48.field723, arg5 + arg1 - var35 - 1)] = var36 < var32 ? var36 : var32;
                        }
                    }
                    if (class190.field3362 < (var19 + var20)) {
                        int var37 = class190.field3362 - var19;
                        class275.method1931(var22, var19, var37, var32);
                        class275.method1931(var22, 0, var20 - var37, var32);
                    } else {
                        class275.method1931(var22, var19, var20, var32);
                    }
                }
            }
        } else if (class190.field3362 >= (arg1 + arg5)) {
            for (int var11 = 0; var11 < arg2; var11++) {
                class275.method1931(arg6[arg3 + var11], arg5, arg1, var8);
            }
        } else {
            int var12 = class190.field3362 - arg5;
            for (int var13 = 0; var13 < arg2; var13++) {
                int[] var14 = arg6[arg3 + var13];
                class275.method1931(var14, arg5, var12, var8);
                class275.method1931(var14, 0, arg1 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)Z", line = 545)
    public static final boolean method682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class149.field2529[arg0][var8][var9] == -class238.field4158) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class201.field3482[arg0][arg1][arg3] + arg5;
            if (!class229.method1526(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class229.method1526(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class229.method1526(var10, var12, var14)) {
                return false;
            } else if (class229.method1526(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (client.method346(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class229.method1526(var6 + 1, class201.field3482[arg0][arg1][arg3] + arg5, var7 + 1) && class229.method1526(var6 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class229.method1526(var6 + 128 - 1, class201.field3482[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class229.method1526(var6 + 1, class201.field3482[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILgb;)V", line = 609)
    public static final void method683(int arg0, class213 arg1) {
        if (arg0 > -11) {
            field1613 = (class258) null;
        }
        field1619++;
        class224.field3840 = arg1.method1451(-126, class165.field2803);
        class103.field1878 = arg1.method1451(-123, class15.field194);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 622)
    public static void method684(int arg0) {
        if (arg0 >= -21) {
            field1616 = (int[]) null;
        }
        field1616 = null;
        field1613 = null;
        field1630 = null;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)Z", line = 634)
    public static final boolean method685(int arg0, int arg1) {
        field1614++;
        if (class48.field720[arg1]) {
            return true;
        } else if (class289.field4987.method1429(arg1, 4)) {
            int var2 = class289.field4987.method1435((byte) -21, arg1);
            if (var2 == 0) {
                class48.field720[arg1] = true;
                return true;
            }
            if (class23.field290[arg1] == null) {
                class23.field290[arg1] = new class171[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class23.field290[arg1][var3] == null) {
                    byte[] var4 = class289.field4987.method1453(arg1, (byte) -17, var3);
                    if (var4 != null) {
                        class23.field290[arg1][var3] = new class171();
                        class23.field290[arg1][var3].field3061 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class23.field290[arg1][var3].method1155(new class235(var4), -1363);
                        } else {
                            class23.field290[arg1][var3].method1153(new class235(var4), (byte) 17);
                        }
                    }
                }
            }
            if (arg0 != -1) {
                field1616 = (int[]) null;
            }
            class48.field720[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BZLs;)V", line = 692)
    public static final void method686(byte arg0, boolean arg1, class171 arg2) {
        field1618++;
        int var3 = arg2.field2976 == 0 ? arg2.field3002 : arg2.field2976;
        int var4 = arg2.field3036 == 0 ? arg2.field3054 : arg2.field3036;
        class58.method446(arg1, -15037, arg2.field3061, class23.field290[arg2.field3061 >> 16], var3, var4);
        if (arg2.field2982 != null) {
            class58.method446(arg1, -15037, arg2.field3061, arg2.field2982, var3, var4);
        }
        class247 var5 = (class247) class276.field4750.method986((long) arg2.field3061, arg0 - 79);
        if (arg0 != 79) {
            field1613 = (class258) null;
        }
        if (var5 != null) {
            class52.method417(var3, -1, arg1, var4, var5.field4283);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(IZ)Loh;", line = 717)
    public static final class258 method687(int arg0, boolean arg1) {
        field1625++;
        if (arg1) {
            method683(21, (class213) null);
        }
        class258 var2 = new class258();
        var2.field4478 = 0;
        var2.field4490 = new byte[arg0];
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(DI)V", line = 734)
    public static final void method688(double arg0, int arg1) {
        field1635++;
        if (class244.field4231 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class188.field3331[var3] = var4 <= 255 ? var4 : 255;
            }
            class244.field4231 = arg0;
        }
        if (arg1 < 109) {
            field1630 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I", line = 764)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, arg0 ^ arg0);
        field1628++;
        if (!this.field3456.field5115) {
            return var3;
        }
        int[][] var4 = this.field3456.method2108(false);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = 0;
        boolean var12 = true;
        int var13 = class190.field3362 * this.field1623 >> 12;
        int var14 = 0;
        int var15 = class214.field3723 * this.field1621 >> 12;
        int var16 = class190.field3362 * this.field1629 >> 12;
        int var17 = class214.field3723 * this.field1615 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field1632 = class190.field3362 / 8 * this.field1627 >> 12;
        int var18 = class190.field3362 / var13 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field1626);
        while (true) {
            while (true) {
                int var22 = var13 + class285.method1996(1, var21, var16 - var13);
                int var23 = var8 + var22;
                int var24 = var15 + class285.method1996(1, var21, var17 - var15);
                if (class190.field3362 < var23) {
                    var23 = class190.field3362;
                    var22 = class190.field3362 - var8;
                }
                int var28;
                if (var12) {
                    var28 = 0;
                } else {
                    int var25 = var7;
                    int[] var26 = var20[var7];
                    int var27 = 0;
                    var28 = var26[2];
                    int var29 = var5 + var23;
                    if (var29 < 0) {
                        var29 += class190.field3362;
                    }
                    if (class190.field3362 < var29) {
                        var29 -= class190.field3362;
                    }
                    while (true) {
                        int[] var30 = var20[var25];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var7 != var25) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class190.field3362;
                                }
                                if (var31 > class190.field3362) {
                                    var31 -= class190.field3362;
                                }
                                for (int var32 = 1; var32 <= var27; var32++) {
                                    int[] var33 = var20[(var7 + var32) % var11];
                                    var28 = Math.max(var28, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var27; var34++) {
                                    int[] var35 = var20[(var7 + var34) % var11];
                                    int var36 = var35[2];
                                    if (var28 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class190.field3362;
                                        }
                                        this.method681(var21, var40 - var39, var28 - var36, var36, 115, var9 + var39, var4);
                                    }
                                }
                            }
                            var7 = var25;
                            break;
                        }
                        var27++;
                        var25++;
                        if (var11 <= var25) {
                            var25 = 0;
                        }
                    }
                }
                if (class214.field3723 < var24 + var28) {
                    var24 = class214.field3723 - var28;
                } else {
                    var10 = false;
                }
                if (class190.field3362 == var23) {
                    this.method681(var21, var22, var24, var28, 118, var6 + var8, var4);
                    if (var10) {
                        return var3;
                    }
                    var9 = var6;
                    var10 = true;
                    var7 = 0;
                    int[] var42 = var19[var14++];
                    var12 = false;
                    var11 = var14;
                    var42[0] = var8;
                    var42[2] = var24 + var28;
                    var8 = 0;
                    var42[1] = var23;
                    var14 = 0;
                    var6 = class285.method1996(1, var21, class190.field3362);
                    int[][] var43 = var20;
                    var5 = var6 - var9;
                    var20 = var19;
                    int var44 = var5;
                    var19 = var43;
                    if (var5 < 0) {
                        var44 = class190.field3362 + var5;
                    }
                    if (class190.field3362 < var44) {
                        var44 -= class190.field3362;
                    }
                    while (true) {
                        int[] var45 = var20[var7];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var7++;
                        if (var7 >= var11) {
                            var7 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var14++];
                    var41[1] = var23;
                    var41[2] = var24 + var28;
                    var41[0] = var8;
                    this.method681(var21, var22, var24, var28, 104, var8 + var6, var4);
                    var8 = var23;
                }
            }
        }
    }
}
