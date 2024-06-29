import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 extends class71 {

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
    private int field1722 = 0;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field1726 = 2048;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    private int field1729 = 1024;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "I")
    private int field1721 = 1024;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    private int field1733 = 1024;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    private int field1737 = 819;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    private int field1730 = 0;

    @OriginalMember(owner = "client!bb", name = "db", descriptor = "I")
    private int field1741 = 409;

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    private int field1746 = 1024;

    @OriginalMember(owner = "client!bb", name = "M", descriptor = "[Luc;")
    public static class187[] field1724 = new class187[50];

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Lud;")
    public static class279 field1734 = class130.method1024("leuchten2:", 255);

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Lrl;")
    public static class192 field1725 = new class192();

    @OriginalMember(owner = "client!bb", name = "fb", descriptor = "I")
    public static int field1743 = 0;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "Lud;")
    public static class279 field1745 = class130.method1024("Titelbild ge-Offnet)3", 255);

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lud;")
    public static class279 field1748 = class130.method1024("tbrefresh", 255);

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    private int field1736;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!bb", name = "bb", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!bb", name = "cb", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!bb", name = "eb", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "Lok;")
    public static class149 field1744;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIZ)V", line = 5)
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1732++;
        int var6 = class125.method1001(arg3, class108.field2002, !arg5, class135.field2463);
        int var7 = class125.method1001(arg4, class108.field2002, false, class135.field2463);
        if (!arg5) {
            return;
        }
        int var8 = class125.method1001(arg1, class44.field929, false, class249.field4449);
        int var9 = class125.method1001(arg0, class44.field929, !arg5, class249.field4449);
        for (int var10 = var6; var10 <= var7; var10++) {
            class152.method1208(var8, arg2, var9, class182.field3348[var10], -7);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BZ)I", line = 32)
    public static final int method784(byte arg0, boolean arg1) {
        field1739++;
        long var2 = class127.method1015(21504);
        int var4 = 40 / ((-arg0 - 81) / 40);
        for (class273 var5 = arg1 ? (class273) class162.field2920.method609(-26368) : (class273) class162.field2920.method604(2); var5 != null; var5 = (class273) class162.field2920.method604(2)) {
            if ((var5.field4858 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var5.field4858 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5539;
                    class326.field5679[var6] = class141.field2570[var6];
                    var5.method2221(true);
                    return var6;
                }
                var5.method2221(true);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 197)
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V", line = 74)
    public static void method785(byte arg0) {
        if (arg0 <= 70) {
            field1744 = (class149) null;
        }
        field1734 = null;
        field1725 = null;
        field1748 = null;
        field1744 = null;
        field1724 = null;
        field1745 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZLvh;)V", line = 94)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field1727++;
        if (arg0 == 0) {
            this.field1730 = arg2.method483(-128);
        } else if (arg0 == 1) {
            this.field1733 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1726 = arg2.method468(28214);
        } else if (arg0 == 3) {
            this.field1741 = arg2.method468(28214);
        } else if (arg0 == 4) {
            this.field1737 = arg2.method468(28214);
        } else if (arg0 == 5) {
            this.field1721 = arg2.method468(28214);
        } else if (arg0 == 6) {
            this.field1722 = arg2.method483(-110);
        } else if (arg0 == 7) {
            this.field1746 = arg2.method468(28214);
        } else if (arg0 == 8) {
            this.field1729 = arg2.method468(28214);
        }
        if (!arg1) {
            method784((byte) -80, false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([[IIILjava/util/Random;III)V", line = 204)
    private final void method786(int[][] arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        field1740++;
        if (arg1 < 75) {
            return;
        }
        int var8 = this.field1729 > 0 ? 4096 - class133.method1041(arg3, this.field1729, 10061) : 4096;
        int var9 = this.field1746 * this.field1736 >> 12;
        int var10 = this.field1736 - (var9 <= 0 ? 0 : class133.method1041(arg3, var9, 10061));
        if (class215.field3787 <= arg6) {
            arg6 -= class215.field3787;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg5 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = var10 <= var15 ? var10 : var15;
            int var17 = arg2 / 2;
            int var18 = arg5 - var16 * 2;
            int var19 = var17 < var10 ? var17 : var10;
            int var20 = arg6 + var16;
            for (int var21 = 0; var21 < arg2; var21++) {
                int[] var22 = arg0[arg4 + var21];
                if (var19 <= var21) {
                    int var23 = arg2 - var21 - 1;
                    if (var23 < var19) {
                        int var24 = var8 * var23 / var19;
                        if (this.field1722 == 0) {
                            for (int var25 = 0; var25 < var16; var25++) {
                                int var26 = var8 * var25 / var16;
                                var22[class52.method442(arg6 + var25, class309.field5478)] = var22[class52.method442(arg5 + arg6 - var25 - 1, class309.field5478)] = var24 * var26 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var16; var27++) {
                                int var28 = var8 * var27 / var16;
                                var22[class52.method442(arg6 + var27, class309.field5478)] = var22[class52.method442(arg5 + arg6 - var27 - 1, class309.field5478)] = var28 >= var24 ? var24 : var28;
                            }
                        }
                        if (class215.field3787 < var20 + var18) {
                            int var29 = class215.field3787 - var20;
                            class25.method221(var22, var20, var29, var24);
                            class25.method221(var22, 0, var18 - var29, var24);
                        } else {
                            class25.method221(var22, var20, var18, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var16; var30++) {
                            var22[class52.method442(class309.field5478, arg6 + var30)] = var22[class52.method442(class309.field5478, arg6 + arg5 - var30 - 1)] = var8 * var30 / var16;
                        }
                        if ((var20 + var18) > class215.field3787) {
                            int var31 = class215.field3787 - var20;
                            class25.method221(var22, var20, var31, var8);
                            class25.method221(var22, 0, var18 - var31, var8);
                        } else {
                            class25.method221(var22, var20, var18, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var19;
                    if (this.field1722 == 0) {
                        for (int var35 = 0; var35 < var16; var35++) {
                            int var36 = var8 * var35 / var16;
                            var22[class52.method442(class309.field5478, arg6 + var35)] = var22[class52.method442(class309.field5478, arg5 + arg6 - var35 - 1)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var16; var33++) {
                            int var34 = var8 * var33 / var16;
                            var22[class52.method442(arg6 + var33, class309.field5478)] = var22[class52.method442(arg5 + arg6 - var33 - 1, class309.field5478)] = var34 < var32 ? var34 : var32;
                        }
                    }
                    if ((var18 + var20) <= class215.field3787) {
                        class25.method221(var22, var20, var18, var32);
                    } else {
                        int var37 = class215.field3787 - var20;
                        class25.method221(var22, var20, var37, var32);
                        class25.method221(var22, 0, var18 - var37, var32);
                    }
                }
            }
        } else if (class215.field3787 >= (arg5 + arg6)) {
            for (int var11 = 0; var11 < arg2; var11++) {
                class25.method221(arg0[arg4 + var11], arg6, arg5, var8);
            }
        } else {
            int var12 = class215.field3787 - arg6;
            for (int var13 = 0; var13 < arg2; var13++) {
                int[] var14 = arg0[arg4 + var13];
                class25.method221(var14, arg6, var12, var8);
                class25.method221(var14, 0, arg5 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)Lrh;", line = 399)
    public static final class135 method787(byte arg0, int arg1) {
        field1723++;
        class135 var2 = (class135) class83.field1579.method1767((byte) -37, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class312.field5518.method1192(arg0 ^ 0x3A, 26, arg1);
        class135 var4 = new class135();
        if (var3 != null) {
            var4.method1058(new class53(var3), (byte) 97);
        }
        if (arg0 == 58) {
            class83.field1579.method1771(-108, (long) arg1, var4);
            return var4;
        } else {
            return (class135) null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(IB)[I", line = 428)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            this.method627(56);
        }
        field1735++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (!this.field1390.field1304) {
            return var3;
        }
        int[][] var4 = this.field1390.method550((byte) 105);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean var8 = true;
        int var9 = 0;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class215.field3787 * this.field1733 >> 12;
        int var15 = class215.field3787 * this.field1726 >> 12;
        int var16 = class324.field5667 * this.field1737 >> 12;
        int var17 = class324.field5667 * this.field1741 >> 12;
        if (var16 <= 1) {
            return var4[arg0];
        }
        int var18 = class215.field3787 / var14 + 1;
        this.field1736 = class215.field3787 / 8 * this.field1721 >> 12;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field1730);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class133.method1041(var20, var15 - var14, 10061) + var14;
                int var23 = var9 + var22;
                int var24 = var17 + class133.method1041(var20, var16 - var17, 10061);
                if (var23 > class215.field3787) {
                    var23 = class215.field3787;
                    var22 = class215.field3787 - var9;
                }
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int var26 = var10;
                    int[] var27 = var21[var10];
                    int var28 = 0;
                    var25 = var27[2];
                    int var29 = var5 + var23;
                    if (var29 < 0) {
                        var29 += class215.field3787;
                    }
                    if (var29 > class215.field3787) {
                        var29 -= class215.field3787;
                    }
                    while (true) {
                        int[] var30 = var21[var26];
                        if (var29 >= var30[0] && var30[1] >= var29) {
                            if (var10 != var26) {
                                int var31 = var5 + var9;
                                if (var31 < 0) {
                                    var31 += class215.field3787;
                                }
                                if (class215.field3787 < var31) {
                                    var31 -= class215.field3787;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var21[(var10 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var21[(var10 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var40 = Math.min(var29, var38);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class215.field3787;
                                        }
                                        this.method786(var4, 102, var25 - var36, var20, var36, var40 - var39, var7 + var39);
                                    }
                                }
                            }
                            var10 = var26;
                            break;
                        }
                        int var10000 = ~var12;
                        var26++;
                        if (var10000 >= ~var26) {
                            var26 = 0;
                        }
                        var28++;
                    }
                }
                if ((var25 + var24) <= class324.field5667) {
                    var8 = false;
                } else {
                    var24 = class324.field5667 - var25;
                }
                if (class215.field3787 == var23) {
                    this.method786(var4, 106, var24, var20, var25, var22, var6 + var9);
                    if (var8) {
                        return var3;
                    }
                    var8 = true;
                    var7 = var6;
                    var10 = 0;
                    var11 = false;
                    int[] var41 = var19[var13++];
                    var41[2] = var25 + var24;
                    var41[0] = var9;
                    var41[1] = var23;
                    var9 = 0;
                    int[][] var42 = var21;
                    var12 = var13;
                    var13 = 0;
                    var6 = class133.method1041(var20, class215.field3787, 10061);
                    var5 = var6 - var7;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class215.field3787 + var5;
                    }
                    var21 = var19;
                    var19 = var42;
                    if (var43 > class215.field3787) {
                        var43 -= class215.field3787;
                    }
                    while (true) {
                        int[] var44 = var21[var10];
                        if (var44[0] <= var43 && var44[1] >= var43) {
                            break;
                        }
                        var10++;
                        if (var10 >= var12) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var13++];
                    var45[2] = var24 + var25;
                    var45[1] = var23;
                    var45[0] = var9;
                    this.method786(var4, 90, var24, var20, var25, var22, var6 + var9);
                    var9 = var23;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)I", line = 682)
    public static final int method788(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1742++;
        if (arg0 != 2522) {
            method788(126, -91, 85, 29, -117);
        }
        int var5 = arg4 & 0xF;
        int var6 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg2 : arg3) : arg1;
        int var7 = var5 >= 8 ? arg1 : arg2;
        return ((var5 & 0x2) == 0 ? var6 : -var6) + ((var5 & 0x1) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIB)V", line = 709)
    public static final void method789(int arg0, int arg1, byte arg2) {
        class141.field2570[arg1] = arg0;
        field1738++;
        class273 var3 = (class273) class162.field2920.method610((long) arg1, -1);
        if (arg2 != -15) {
            field1724 = (class187[]) null;
        }
        if (var3 == null) {
            class273 var4 = new class273(4611686018427387905L);
            class162.field2920.method612(false, var4, (long) arg1);
        } else if (var3.field4858 != 4611686018427387905L) {
            var3.field4858 = class127.method1015(arg2 + 21519) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 738)
    public final void method627(int arg0) {
        field1728++;
        if (arg0 != 7) {
            method784((byte) -47, false);
        }
    }
}
