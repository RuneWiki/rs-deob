import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class294 extends class59 {

    @OriginalMember(owner = "client!b", name = "I", descriptor = "I")
    private int field4794 = 1;

    @OriginalMember(owner = "client!b", name = "N", descriptor = "I")
    private int field4799 = 1;

    @OriginalMember(owner = "client!b", name = "R", descriptor = "Lvm;")
    public static class202 field4803 = new class202(64);

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "Lph;")
    public static class229 field4812 = class266.method1858("null", 0);

    @OriginalMember(owner = "client!b", name = "X", descriptor = "Lph;")
    private static class229 field4809 = class266.method1858("Oct", 0);

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lph;")
    public static class229 field4810 = class266.method1858("<br>", 0);

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "Lph;")
    private static class229 field4813 = class266.method1858("Jul", 0);

    @OriginalMember(owner = "client!b", name = "S", descriptor = "Lph;")
    public static class229 field4804 = class266.method1858("Fichiers config charg-Bs", 0);

    @OriginalMember(owner = "client!b", name = "W", descriptor = "Lph;")
    private static class229 field4808 = class266.method1858("Feb", 0);

    @OriginalMember(owner = "client!b", name = "T", descriptor = "Lph;")
    private static class229 field4805 = class266.method1858("Jan", 0);

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "Lph;")
    private static class229 field4811 = class266.method1858("Jun", 0);

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "Lph;")
    private static class229 field4814 = class266.method1858("Dec", 0);

    @OriginalMember(owner = "client!b", name = "V", descriptor = "Lph;")
    private static class229 field4807 = class266.method1858("Sep", 0);

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "Lph;")
    private static class229 field4818 = class266.method1858("Apr", 0);

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "Lph;")
    private static class229 field4817 = class266.method1858("May", 0);

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "Lph;")
    public static class229 field4816 = class266.method1858("", 0);

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "Lph;")
    private static class229 field4819 = class266.method1858("Aug", 0);

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "Lph;")
    private static class229 field4821 = class266.method1858("Nov", 0);

    @OriginalMember(owner = "client!b", name = "U", descriptor = "Lph;")
    private static class229 field4806 = class266.method1858("Mar", 0);

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "Lph;")
    public static class229 field4822 = class266.method1858("M", 0);

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "[Lph;")
    public static class229[] field4823 = new class229[] { field4805, field4808, field4806, field4818, field4817, field4811, field4813, field4819, field4807, field4809, field4821, field4814 };

    @OriginalMember(owner = "client!b", name = "J", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!b", name = "K", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!b", name = "L", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!b", name = "O", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!b", name = "P", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!b", name = "M", descriptor = "Lsi;")
    public static class66 field4798;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "Lsi;")
    public static class66 field4815;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[[I", line = 7)
    public final int[][] method116(int arg0, int arg1) {
        field4802++;
        if (arg1 != 4588) {
            field4807 = (class229) null;
        }
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int var4 = this.field4794 + this.field4794 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4799 + this.field4799 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field4794; var9 <= this.field4794 + arg0; var9++) {
                int[][] var10 = this.method397(1, 0, class33.field544 & var9);
                int[][] var11 = new int[3][class293.field4789];
                int var12 = 0;
                int var13 = 0;
                int var14 = 0;
                int[] var15 = var10[0];
                int[] var16 = var10[1];
                int[] var17 = var10[2];
                for (int var18 = -this.field4799; var18 <= this.field4799; var18++) {
                    int var19 = var18 & class4.field51;
                    var12 += var15[var19];
                    var14 += var16[var19];
                    var13 += var17[var19];
                }
                int[] var20 = var11[0];
                int[] var21 = var11[1];
                int[] var22 = var11[2];
                int var23 = 0;
                while (class293.field4789 > var23) {
                    var20[var23] = var7 * var12 >> 16;
                    var21[var23] = var7 * var14 >> 16;
                    var22[var23] = var7 * var13 >> 16;
                    int var24 = class4.field51 & var23 - this.field4799;
                    var23++;
                    int var25 = var14 - var16[var24];
                    int var26 = var12 - var15[var24];
                    int var27 = var13 - var17[var24];
                    int var28 = this.field4799 + var23 & class4.field51;
                    var14 = var16[var28] + var25;
                    var13 = var17[var28] + var27;
                    var12 = var15[var28] + var26;
                }
                var8[this.field4794 + var9 - arg0] = var11;
            }
            int[] var29 = var3[0];
            int[] var30 = var3[1];
            int[] var31 = var3[2];
            for (int var32 = 0; var32 < class293.field4789; var32++) {
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = 0; var36 < var4; var36++) {
                    int[][] var37 = var8[var36];
                    var34 += var37[1][var32];
                    var35 += var37[2][var32];
                    var33 += var37[0][var32];
                }
                var29[var32] = var5 * var33 >> 16;
                var30[var32] = var5 * var34 >> 16;
                var31[var32] = var5 * var35 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V", line = 568)
    public class294() {
        super(1, false);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([[B[[F[[F[[B[[I[[[B[[I[[I[[I[[BBI[[B[[I[[F)[Lqj;", line = 143)
    public static final class264[] method1995(byte[][] arg0, float[][] arg1, float[][] arg2, byte[][] arg3, int[][] arg4, byte[][][] arg5, int[][] arg6, int[][] arg7, int[][] arg8, byte[][] arg9, byte arg10, int arg11, byte[][] arg12, int[][] arg13, float[][] arg14) {
        field4800++;
        int var15 = -50 / ((49 - arg10) / 32);
        int[][] var16 = new int[105][105];
        for (int var17 = 1; var17 <= 103; var17++) {
            for (int var18 = 1; var18 <= 103; var18++) {
                byte var19 = arg0[var17][var18];
                if (var19 == 0) {
                    var19 = arg0[var17 - 1][var18];
                }
                if (var19 == 0) {
                    var19 = arg0[var17][var18 - 1];
                }
                if (var19 == 0) {
                    var19 = arg0[var17 - 1][var18 - 1];
                }
                if (var19 != 0) {
                    class324 var20 = class78.method584((byte) 18, (var19 & 0xFF) - 1);
                    var16[var17][var18] = (var20.field5539 + 1 << 16) + var20.field5528;
                }
            }
        }
        class97 var21 = new class97(128);
        for (int var22 = 1; var22 <= 102; var22++) {
            for (int var23 = 1; var23 <= 102; var23++) {
                if (arg0[var22][var23] != 0) {
                    int[] var24;
                    if (arg3[var22][var23] == 0) {
                        var24 = class192.field3179[0];
                    } else {
                        var24 = class61.field881[arg9[var22][var23]];
                        if (var24.length == 0) {
                            continue;
                        }
                    }
                    int var25 = 0;
                    if (arg4 != null) {
                        var25 = arg4[var22][var23] & 0xFFFFFF;
                    }
                    int var26 = var16[var22 + 1][var23];
                    int var27 = var16[var22 + 1][var23 + 1];
                    int var28 = var16[var22][var23 + 1];
                    int var29 = var16[var22][var23];
                    long var30 = (long) var25 | (long) var29 << 32;
                    long var32 = (long) var25 | (long) var26 << 32;
                    long var34 = (long) var25 | (long) var27 << 32;
                    long var36 = (long) var28 << 32 | (long) var25;
                    int var38 = var24.length / 2;
                    class264 var39 = (class264) var21.method713(3365, var30);
                    if (var39 == null) {
                        var39 = new class264((var29 >> 16) - 1, (float) (var29 & 0xFFFF), false, arg6 != null, var25);
                        var21.method710(var39, (byte) 113, var30);
                    }
                    var39.field4433++;
                    var39.field4432 += var38;
                    if (var30 != var32) {
                        class264 var40 = (class264) var21.method713(3365, var32);
                        if (var40 == null) {
                            var40 = new class264((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg6 != null, var25);
                            var21.method710(var40, (byte) 115, var32);
                        }
                        var40.field4433++;
                        var40.field4432 += var38;
                    }
                    if (var30 != var34 && var32 != var34) {
                        class264 var41 = (class264) var21.method713(3365, var34);
                        if (var41 == null) {
                            var41 = new class264((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg6 != null, var25);
                            var21.method710(var41, (byte) 111, var34);
                        }
                        var41.field4433++;
                        var41.field4432 += var38;
                    }
                    if (var30 != var36 && var32 != var36 && var34 != var36) {
                        class264 var42 = (class264) var21.method713(3365, var36);
                        if (var42 == null) {
                            var42 = new class264((var28 >> 16) - 1, (float) (var28 & 0xFFFF), false, arg6 != null, var25);
                            var21.method710(var42, (byte) 53, var36);
                        }
                        var42.field4433++;
                        var42.field4432 += var38;
                    }
                }
            }
        }
        for (class264 var43 = (class264) var21.method711(0); var43 != null; var43 = (class264) var21.method718(27263)) {
            var43.method1840();
        }
        for (int var44 = 1; var44 <= 102; var44++) {
            for (int var45 = 1; var45 <= 102; var45++) {
                byte var46 = arg0[var44][var45];
                if (var46 != 0) {
                    int var47;
                    if ((arg5[arg11][var44][var45] & 0x8) != 0) {
                        var47 = 0;
                    } else if ((arg5[1][var44][var45] & 0x2) == 2 && arg11 > 0) {
                        var47 = arg11 - 1;
                    } else {
                        var47 = arg11;
                    }
                    int var48 = 0;
                    int var49 = 128;
                    if (arg4 != null) {
                        var48 = arg4[var44][var45] & 0xFFFFFF;
                        var49 = arg4[var44][var45] >>> 24 << 3;
                    }
                    boolean[] var50 = null;
                    byte var51;
                    int[] var52;
                    if (arg3[var44][var45] == 0) {
                        byte var53 = 0;
                        var52 = class192.field3179[0];
                        byte var54 = 0;
                        int var55 = var54 + (arg0[var44 + 1][var45 + 1] == var46 ? 1 : -1);
                        byte var56 = 0;
                        byte var57 = 0;
                        int var58 = var53 + (arg0[var44 - 1][var45 - 1] == var46 ? 1 : -1);
                        int var59 = var57 + (arg0[var44 + 1][var45 - 1] == var46 ? 1 : -1);
                        int var60 = var56 + (arg0[var44 - 1][var45 + 1] == var46 ? 1 : -1);
                        if (arg0[var44][var45 - 1] == var46) {
                            var58++;
                            var59++;
                        } else {
                            var59--;
                            var58--;
                        }
                        if (arg0[var44 + 1][var45] == var46) {
                            var55++;
                            var59++;
                        } else {
                            var59--;
                            var55--;
                        }
                        if (arg0[var44][var45 + 1] == var46) {
                            var60++;
                            var55++;
                        } else {
                            var60--;
                            var55--;
                        }
                        if (arg0[var44 - 1][var45] == var46) {
                            var60++;
                            var58++;
                        } else {
                            var60--;
                            var58--;
                        }
                        int var61 = var59 - var60;
                        int var62 = var58 - var55;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        if (var62 < 0) {
                            var62 = -var62;
                        }
                        var51 = (byte) (var62 < var61 ? 1 : 0);
                        arg12[var44][var45] = var51;
                    } else {
                        var51 = arg12[var44][var45];
                        var50 = class43.field669[arg9[var44][var45]];
                        var52 = class61.field881[arg9[var44][var45]];
                        if (var52.length == 0) {
                            continue;
                        }
                    }
                    int var63 = var16[var44][var45];
                    int var64 = var16[var44 + 1][var45];
                    int var65 = var16[var44 + 1][var45 + 1];
                    int var66 = var16[var44][var45 + 1];
                    long var67 = (long) var64 << 32 | (long) var48;
                    long var69 = (long) var63 << 32 | (long) var48;
                    long var71 = (long) var48 | (long) var65 << 32;
                    long var73 = (long) var48 | (long) var66 << 32;
                    int var75 = arg8[var44][var45];
                    int var76 = arg8[var44 + 1][var45];
                    int var77 = arg8[var44 + 1][var45 + 1];
                    int var78 = arg13[var44 + 1][var45];
                    int var79 = arg13[var44 + 1][var45 + 1];
                    int var80 = arg13[var44][var45 + 1];
                    int var81 = arg8[var44][var45 + 1];
                    int var82 = (var63 >> 16) - 1;
                    int var83 = arg13[var44][var45];
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var66 >> 16) - 1;
                    int var86 = (var65 >> 16) - 1;
                    class264 var87 = (class264) var21.method713(3365, var69);
                    class183.method1293(arg6, class237.method1676(var76, var78, true, var82), arg14, var45, var44, class237.method1676(var77, var79, true, var82), var65 >= var63, var63 <= var63, var66 >= var63, class237.method1676(var75, var83, true, var82), arg1, var52, var50, 122, var87, class237.method1676(var81, var80, true, var82), arg7, var51, arg2, var64 >= var63, var47, var49);
                    if (var67 != var69) {
                        class264 var88 = (class264) var21.method713(3365, var67);
                        class183.method1293(arg6, class237.method1676(var76, var78, true, var84), arg14, var45, var44, class237.method1676(var77, var79, true, var84), var64 <= var65, var63 >= var64, var64 <= var66, class237.method1676(var75, var83, true, var84), arg1, var52, var50, -110, var88, class237.method1676(var81, var80, true, var84), arg7, var51, arg2, var64 <= var64, var47, var49);
                    }
                    if (var69 != var71 && var67 != var71) {
                        class264 var89 = (class264) var21.method713(3365, var71);
                        class183.method1293(arg6, class237.method1676(var76, var78, true, var86), arg14, var45, var44, class237.method1676(var77, var79, true, var86), var65 <= var65, var65 <= var63, var65 <= var66, class237.method1676(var75, var83, true, var86), arg1, var52, var50, 110, var89, class237.method1676(var81, var80, true, var86), arg7, var51, arg2, var64 >= var65, var47, var49);
                    }
                    if (var69 != var73 && var67 != var73 && var71 != var73) {
                        class264 var90 = (class264) var21.method713(3365, var73);
                        class183.method1293(arg6, class237.method1676(var76, var78, true, var85), arg14, var45, var44, class237.method1676(var77, var79, true, var85), var66 <= var65, var63 >= var66, var66 >= var66, class237.method1676(var75, var83, true, var85), arg1, var52, var50, 120, var90, class237.method1676(var81, var80, true, var85), arg7, var51, arg2, var64 >= var66, var47, var49);
                    }
                }
            }
        }
        for (class264 var91 = (class264) var21.method711(0); var91 != null; var91 = (class264) var21.method718(27263)) {
            if (var91.field4429 == 0) {
                var91.method598(20);
            } else {
                var91.method1839();
            }
        }
        int var92 = var21.method715(127);
        long[] var93 = new long[var92];
        class264[] var94 = new class264[var92];
        var21.method721(0, var94);
        for (int var95 = 0; var95 < var92; var95++) {
            var93[var95] = var94[var95].field1325;
        }
        class330.method2261(var93, var94, -1);
        return var94;
    }

    @OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V", line = 539)
    public static void method1996(int arg0) {
        field4813 = null;
        field4806 = null;
        field4822 = null;
        field4805 = null;
        field4817 = null;
        field4812 = null;
        field4804 = null;
        field4821 = null;
        field4807 = null;
        field4818 = null;
        field4809 = null;
        field4823 = null;
        field4816 = null;
        field4814 = null;
        field4803 = null;
        field4808 = null;
        field4798 = null;
        field4811 = null;
        if (arg0 != 21609) {
            method1998((class92) null, false);
        }
        field4819 = null;
        field4810 = null;
        field4815 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)[I", line = 574)
    public final int[] method63(boolean arg0, int arg1) {
        field4820++;
        if (!arg0) {
            field4813 = (class229) null;
        }
        int[] var3 = this.field846.method383(3583, arg1);
        if (this.field846.field811) {
            int var4 = this.field4794 + this.field4794 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4799 + this.field4799 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field4794; var9 <= (this.field4794 + arg1); var9++) {
                int[] var10 = this.method394(class33.field544 & var9, 0, (byte) -79);
                int[] var11 = new int[class293.field4789];
                int var12 = 0;
                for (int var13 = -this.field4799; var13 <= this.field4799; var13++) {
                    var12 += var10[class4.field51 & var13];
                }
                int var14 = 0;
                while (class293.field4789 > var14) {
                    var11[var14] = var7 * var12 >> 16;
                    int var15 = var12 - var10[class4.field51 & var14 - this.field4799];
                    var14++;
                    var12 = var10[this.field4799 + var14 & class4.field51] + var15;
                }
                var8[this.field4794 + var9 - arg1] = var11;
            }
            for (int var16 = 0; var16 < class293.field4789; var16++) {
                int var17 = 0;
                for (int var18 = 0; var18 < var4; var18++) {
                    var17 += var8[var18][var16];
                }
                var3[var16] = var5 * var17 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)I", line = 659)
    public static final int method1997(byte arg0, int arg1) {
        field4795++;
        if (arg0 != 69) {
            field4812 = (class229) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BILhb;)V", line = 674)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field4801++;
        if (arg0 != 115) {
            return;
        }
        if (arg1 == 0) {
            this.field4799 = arg2.method1178(8);
        } else if (arg1 == 1) {
            this.field4794 = arg2.method1178(8);
        } else if (arg1 == 2) {
            this.field841 = arg2.method1178(arg0 ^ 0x7B) == 1;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lwe;Z)[Lpe;", line = 723)
    public static final class77[] method1998(class92 arg0, boolean arg1) {
        field4796++;
        if (!arg0.method694(-69)) {
            return new class77[0];
        }
        class247 var2 = arg0.method682(0);
        while (var2.field4125 == 0) {
            class288.method1976((byte) 123, 10L);
        }
        if (var2.field4125 == 2) {
            return new class77[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field4123);
        class77[] var4 = new class77[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class77 var6 = new class77();
            var4[var5] = var6;
            var6.field1290 = var3[var5 << 2];
            var6.field1291 = var3[(var5 << 2) + 1];
            var6.field1284 = var3[(var5 << 2) + 2];
            var6.field1288 = var3[(var5 << 2) + 3];
        }
        if (!arg1) {
            method1997((byte) -107, 26);
        }
        return var4;
    }
}
