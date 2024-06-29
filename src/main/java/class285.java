import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class285 extends class23 {

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    private int field4782 = 1024;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "I")
    private int field4786 = 1024;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    private int field4788 = 0;

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "I")
    private int field4781 = 2048;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    private int field4794 = 819;

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "I")
    private int field4784 = 1024;

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "I")
    private int field4785 = 0;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    private int field4798 = 1024;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
    private int field4800 = 409;

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "Lqd;")
    public static class40 field4787 = class147.method1106("mapdots", (byte) -53);

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "Lpl;")
    public static class186 field4795 = new class186(64);

    @OriginalMember(owner = "client!ed", name = "ub", descriptor = "Lqd;")
    private static class40 field4803 = class147.method1106("Walk here", (byte) -93);

    @OriginalMember(owner = "client!ed", name = "wb", descriptor = "Lqd;")
    public static class40 field4805 = class147.method1106("<br>(X", (byte) -59);

    @OriginalMember(owner = "client!ed", name = "xb", descriptor = "Lqd;")
    public static class40 field4806 = class147.method1106("W-=hlen Sie eine Option", (byte) -54);

    @OriginalMember(owner = "client!ed", name = "zb", descriptor = "Z")
    public static boolean field4808 = false;

    @OriginalMember(owner = "client!ed", name = "vb", descriptor = "I")
    public static int field4804 = 2;

    @OriginalMember(owner = "client!ed", name = "Cb", descriptor = "Lqd;")
    public static class40 field4811 = class147.method1106(" loggt sich aus)3", (byte) -114);

    @OriginalMember(owner = "client!ed", name = "Ab", descriptor = "Lqd;")
    public static class40 field4809 = class147.method1106("hitmarks", (byte) -85);

    @OriginalMember(owner = "client!ed", name = "Bb", descriptor = "Lqd;")
    public static class40 field4810 = field4803;

    @OriginalMember(owner = "client!ed", name = "Db", descriptor = "[I")
    public static int[] field4812 = new int[128];

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "I")
    private int field4791;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ed", name = "yb", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ed", name = "tb", descriptor = "Lsa;")
    public static class104 field4802;

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V", line = 330)
    public class285() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILjava/util/Random;ZI[[III)V", line = 15)
    private final void method1982(int arg0, Random arg1, boolean arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        if (arg2) {
            field4811 = (class40) null;
        }
        field4796++;
        int var8 = this.field4786 <= 0 ? 4096 : 4096 - class110.method830((byte) -128, arg1, this.field4786);
        int var9 = this.field4791 * this.field4782 >> 12;
        int var10 = this.field4791 - (var9 <= 0 ? 0 : class110.method830((byte) -87, arg1, var9));
        if (class52.field1007 <= arg0) {
            arg0 -= class52.field1007;
        }
        if (var10 > 0) {
            if (arg6 <= 0 || arg3 <= 0) {
                return;
            }
            int var15 = arg3 / 2;
            int var16 = arg6 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = arg3 - (var17 * 2);
            for (int var21 = 0; var21 < arg6; var21++) {
                int[] var22 = arg4[arg5 + var21];
                if (var21 >= var18) {
                    int var23 = arg6 - var21 - 1;
                    if (var23 >= var18) {
                        for (int var24 = 0; var24 < var17; var24++) {
                            var22[class276.method1923(arg0 + var24, class6.field92)] = var22[class276.method1923(arg0 + arg3 - var24 - 1, class6.field92)] = var8 * var24 / var17;
                        }
                        if (var19 + var20 > class52.field1007) {
                            int var25 = class52.field1007 - var19;
                            class234.method1625(var22, var19, var25, var8);
                            class234.method1625(var22, 0, var20 - var25, var8);
                        } else {
                            class234.method1625(var22, var19, var20, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var18;
                        if (this.field4785 == 0) {
                            for (int var29 = 0; var29 < var17; var29++) {
                                int var30 = var8 * var29 / var17;
                                var22[class276.method1923(class6.field92, arg0 + var29)] = var22[class276.method1923(class6.field92, arg0 + arg3 - var29 - 1)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class276.method1923(class6.field92, arg0 + var27)] = var22[class276.method1923(class6.field92, arg3 + arg0 - var27 - 1)] = var28 < var26 ? var28 : var26;
                            }
                        }
                        if (class52.field1007 < (var19 + var20)) {
                            int var31 = class52.field1007 - var19;
                            class234.method1625(var22, var19, var31, var26);
                            class234.method1625(var22, 0, var20 - var31, var26);
                        } else {
                            class234.method1625(var22, var19, var20, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field4785 == 0) {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class276.method1923(arg0 + var33, class6.field92)] = var22[class276.method1923(arg3 + arg0 - var33 - 1, class6.field92)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class276.method1923(arg0 + var35, class6.field92)] = var22[class276.method1923(arg3 + arg0 - var35 - 1, class6.field92)] = var36 >= var32 ? var32 : var36;
                        }
                    }
                    if (class52.field1007 < (var19 + var20)) {
                        int var37 = class52.field1007 - var19;
                        class234.method1625(var22, var19, var37, var32);
                        class234.method1625(var22, 0, var20 - var37, var32);
                    } else {
                        class234.method1625(var22, var19, var20, var32);
                    }
                }
            }
        } else if (class52.field1007 < (arg0 + arg3)) {
            int var11 = class52.field1007 - arg0;
            for (int var12 = 0; var12 < arg6; var12++) {
                int[] var13 = arg4[arg5 + var12];
                class234.method1625(var13, arg0, var11, var8);
                class234.method1625(var13, 0, arg3 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg6; var14++) {
                class234.method1625(arg4[arg5 + var14], arg0, arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lqd;Lce;I)Loj;", line = 235)
    public static final class313 method1983(class40 arg0, class239 arg1, int arg2) {
        field4790++;
        int var3 = arg1.method1665(arg0, (byte) -19);
        if (var3 == -1) {
            return new class313(0);
        }
        int[] var4 = arg1.method1673((byte) -127, var3);
        class313 var5 = new class313(var4.length);
        for (int var6 = arg2; var6 < var5.field5275; var6++) {
            class26 var7 = new class26(arg1.method1651(var3, var4[var6], -1));
            var5.field5291[var6] = var7.method251((byte) 77);
            var5.field5281[var6] = var7.method234(2193);
            var5.field5272[var6] = (short) var7.method197(-1);
            var5.field5292[var6] = (short) var7.method197(arg2 - 1);
            var5.field5295[var6] = var7.method203(-22066);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)V", line = 272)
    public static void method1984(int arg0) {
        field4795 = null;
        field4805 = null;
        field4803 = null;
        field4811 = null;
        field4787 = null;
        field4810 = null;
        field4802 = null;
        field4812 = null;
        if (arg0 >= -93) {
            method1983((class40) null, (class239) null, -9);
        }
        field4806 = null;
        field4809 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILce;)V", line = 291)
    public static final void method1985(int arg0, class239 arg1) {
        if (arg0 != 0) {
            method1986(99, 54);
        }
        class40.field735 = arg1;
        field4793++;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(II)Lvb;", line = 302)
    public static final class50 method1986(int arg0, int arg1) {
        field4783++;
        class50 var2 = (class50) class310.field5202.method1345((long) arg1, arg0 + 25748);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class28.field600.method1651(4, arg1, -1);
        if (arg0 != 2402) {
            field4812 = (int[]) null;
        }
        class50 var4 = new class50();
        if (var3 != null) {
            var4.method436(new class26(var3), arg1, (byte) 108);
        }
        class310.field5202.method1350(var4, (long) arg1, -123);
        return var4;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BI)[I", line = 347)
    public final int[] method32(byte arg0, int arg1) {
        field4792++;
        if (arg0 != -94) {
            field4809 = (class40) null;
        }
        int[] var3 = this.field403.method724((byte) -128, arg1);
        if (!this.field403.field1760) {
            return var3;
        }
        int[][] var4 = this.field403.method727(false);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class52.field1007 * this.field4798 >> 12;
        int var15 = class271.field4497 * this.field4800 >> 12;
        int var16 = class271.field4497 * this.field4794 >> 12;
        int var17 = class52.field1007 * this.field4781 >> 12;
        if (var16 <= 1) {
            return var4[arg1];
        }
        this.field4791 = class52.field1007 / 8 * this.field4784 >> 12;
        int var18 = (class52.field1007 / var14) + 1;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field4788);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = var14 + class110.method830((byte) -35, var20, var17 - var14);
                int var23 = var15 + class110.method830((byte) -104, var20, var16 - var15);
                int var24 = var7 + var22;
                if (class52.field1007 < var24) {
                    var22 = class52.field1007 - var7;
                    var24 = class52.field1007;
                }
                int var10000;
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int[] var26 = var19[var8];
                    var25 = var26[2];
                    int var27 = var8;
                    int var28 = 0;
                    int var29 = var6 + var24;
                    if (var29 < 0) {
                        var29 += class52.field1007;
                    }
                    if (var29 > class52.field1007) {
                        var29 -= class52.field1007;
                    }
                    while (true) {
                        int[] var30 = var19[var27];
                        if (var30[0] <= var29 && var29 <= var30[1]) {
                            if (var8 != var27) {
                                int var31 = var6 + var7;
                                if (var31 < 0) {
                                    var31 += class52.field1007;
                                }
                                if (class52.field1007 < var31) {
                                    var31 -= class52.field1007;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var19[(var8 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var19[(var8 + var34) % var12];
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
                                            var40 = class52.field1007;
                                        }
                                        this.method1982(var39 + var5, var20, false, var40 - var39, var4, var36, var25 - var36);
                                    }
                                }
                            }
                            var8 = var27;
                            break;
                        }
                        var10000 = ~var12;
                        var27++;
                        if (var10000 >= ~var27) {
                            var27 = 0;
                        }
                        var28++;
                    }
                }
                if ((var23 + var25) <= class271.field4497) {
                    var9 = false;
                } else {
                    var23 = class271.field4497 - var25;
                }
                if (class52.field1007 == var24) {
                    this.method1982(var7 + var10, var20, false, var22, var4, var25, var23);
                    if (var9) {
                        return var3;
                    }
                    var11 = false;
                    var5 = var10;
                    var8 = 0;
                    var9 = true;
                    int[] var41 = var21[var13++];
                    var41[0] = var7;
                    var12 = var13;
                    var13 = 0;
                    var7 = 0;
                    var41[1] = var24;
                    int[][] var42 = var19;
                    var19 = var21;
                    var21 = var42;
                    var41[2] = var23 + var25;
                    var10 = class110.method830((byte) -52, var20, class52.field1007);
                    var6 = var10 - var5;
                    int var43 = var6;
                    if (var6 < 0) {
                        var43 = class52.field1007 + var6;
                    }
                    if (class52.field1007 < var43) {
                        var43 -= class52.field1007;
                    }
                    while (true) {
                        int[] var44 = var19[var8];
                        if (var44[0] <= var43 && var44[1] >= var43) {
                            break;
                        }
                        var10000 = ~var12;
                        var8++;
                        if (var10000 >= ~var8) {
                            var8 = 0;
                        }
                    }
                } else {
                    int[] var45 = var21[var13++];
                    var45[1] = var24;
                    var45[2] = var23 + var25;
                    var45[0] = var7;
                    this.method1982(var7 + var10, var20, false, var22, var4, var25, var23);
                    var7 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILsd;)V", line = 602)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            method1985(1, (class239) null);
        }
        if (arg0 == 0) {
            this.field4788 = arg2.method226(arg1 ^ 0xFF);
        } else if (arg0 == 1) {
            this.field4798 = arg2.method197(-1);
        } else if (arg0 == 2) {
            this.field4781 = arg2.method197(-1);
        } else if (arg0 == 3) {
            this.field4800 = arg2.method197(-1);
        } else if (arg0 == 4) {
            this.field4794 = arg2.method197(-1);
        } else if (arg0 == 5) {
            this.field4784 = arg2.method197(-1);
        } else if (arg0 == 6) {
            this.field4785 = arg2.method226(255);
        } else if (arg0 == 7) {
            this.field4782 = arg2.method197(-1);
        } else if (arg0 == 8) {
            this.field4786 = arg2.method197(-1);
        }
        field4799++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 716)
    public final void method61(byte arg0) {
        if (arg0 != 4) {
            method1983((class40) null, (class239) null, 18);
        }
        field4789++;
    }
}
