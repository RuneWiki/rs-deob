import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class178 extends class177 {

    @OriginalMember(owner = "client!ig", name = "C", descriptor = "Lta;")
    public static class197 field2659 = new class197(100);

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2670 = "slide:";

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field2673 = 0;

    @OriginalMember(owner = "client!ig", name = "D", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ig", name = "E", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Llb;")
    public static class211 field2663;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "Llb;")
    public static class211 field2671;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLlb;)V", line = 5)
    public static final void method1288(byte arg0, class211 arg1) {
        field2672++;
        if (arg0 <= 21) {
            field2673 = -14;
        }
        class278.field4267 = arg1;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(II)[[I", line = 19)
    public final int[][] method99(int arg0, int arg1) {
        field2665++;
        if (arg1 != -23387) {
            field2669 = -25;
        }
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (this.field2645.field3203) {
            int[] var4 = this.method1280(arg0, 2, false);
            int[][] var5 = this.method1285(0, arg0, 27847);
            int[][] var6 = this.method1285(1, arg0, arg1 ^ 0xFFFFC862);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var5[0];
            int[] var10 = var3[1];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[2];
            int[] var14 = var6[1];
            int[] var15 = var6[0];
            for (int var16 = 0; var16 < class287.field4415; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var10[var16] = var11[var16];
                    var8[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var15[var16];
                    var10[var16] = var14[var16];
                    var8[var16] = var13[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var15[var16] * var18 >> 12;
                    var10[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var8[var16] = var12[var16] * var17 + var13[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIILld;I)V", line = 96)
    public static final void method1289(int arg0, int arg1, int arg2, class121 arg3, int arg4) {
        field2674++;
        if (class235.field3602 == arg3 || class6.field62 >= 400) {
            return;
        }
        String var11;
        if (arg3.field1893 == 0) {
            boolean var5 = true;
            if (class235.field3602.field1896 != -1 && arg3.field1896 != -1) {
                int var6 = class235.field3602.field1910 > arg3.field1910 ? class235.field3602.field1910 : arg3.field1910;
                int var7 = class235.field3602.field1896 < arg3.field1896 ? class235.field3602.field1896 : arg3.field1896;
                int var8 = (var6 * 10 / 100) + var7 + 5;
                int var9 = class235.field3602.field1910 - arg3.field1910;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            String var10 = class3.field12 == 1 ? class95.field1384 : class270.field4084;
            if (arg3.field1910 >= arg3.field1890) {
                var11 = arg3.method928(24094) + (var5 ? class198.method1443(76, arg3.field1910, class235.field3602.field1910) : "<col=ffffff>") + " (" + var10 + arg3.field1910 + ")";
            } else {
                var11 = arg3.method928(24094) + (var5 ? class198.method1443(-111, arg3.field1910, class235.field3602.field1910) : "<col=ffffff>") + " (" + var10 + arg3.field1910 + "+" + (arg3.field1890 - arg3.field1910) + ")";
            }
        } else {
            var11 = arg3.method928(24094) + " (" + class228.field3535 + arg3.field1893 + ")";
        }
        if (class327.field5077 == 1) {
            class130.field2031++;
            class196.method1419((long) arg0, class307.field4792, class325.field5061, class220.field3452 + " -> <col=ffffff>" + var11, arg2, arg4, (byte) -4, (short) 23);
        } else if (!class81.field1136) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class10.field95[var12] != null) {
                    class117.field1832++;
                    short var13 = 0;
                    if (class3.field12 == 0 && class10.field95[var12].equalsIgnoreCase(class153.field2314)) {
                        if (arg3.field1910 > class235.field3602.field1910) {
                            var13 = 2000;
                        }
                        if (class235.field3602.field1912 != 0 && arg3.field1912 != 0) {
                            if (class235.field3602.field1912 == arg3.field1912) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class60.field893[var12]) {
                        var13 = 2000;
                    }
                    boolean var14 = false;
                    short var15 = class302.field4738[var12];
                    short var16 = (short) (var13 + var15);
                    class196.method1419((long) arg0, class10.field95[var12], class126.field2000[var12], "<col=ffffff>" + var11, arg2, arg4, (byte) -4, var16);
                }
            }
        } else if ((class44.field687 & 0x8) != 0) {
            class196.method1419((long) arg0, class309.field4805, class88.field1295, class209.field3290 + " -> <col=ffffff>" + var11, arg2, arg4, (byte) -4, (short) 31);
            class288.field4468++;
        }
        if (arg1 >= -28) {
            method1290((class35) null, true);
        }
        for (int var17 = 0; var17 < class6.field62; var17++) {
            if (class326.field5068[var17] == 49) {
                class271.field4097[var17] = "<col=ffffff>" + var11;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lhb;Z)V", line = 232)
    public static final void method1290(class35 arg0, boolean arg1) {
        field2666++;
        if (!arg1) {
            field2663 = (class211) null;
        }
        while (true) {
            while (arg0.field455 < arg0.field437.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method273(65280) == 1) {
                    var2 = arg0.method273(65280);
                    var4 = arg0.method273(65280);
                    var3 = true;
                }
                int var5 = arg0.method273(65280);
                int var6 = arg0.method273(65280);
                int var7 = var5 * 64 - class69.field1018;
                int var8 = class318.field4932 + class193.field3089 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class87.field1280 > var7 + 63 && var8 < class193.field3089) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= (var2 * 8) && var2 * 8 + 8 > var11 && var12 >= (var4 * 8) && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method242((byte) -93);
                                if (var13 != 0) {
                                    if (class62.field944[var9][var10] == null) {
                                        class62.field944[var9][var10] = new byte[4096];
                                    }
                                    class62.field944[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method242((byte) -93);
                                    if (class64.field959[var9][var10] == null) {
                                        class64.field959[var9][var10] = new byte[4096];
                                    }
                                    class64.field959[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method242((byte) -93);
                        if (var16 != 0) {
                            arg0.field455++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I", line = 334)
    public final int[] method95(int arg0, int arg1) {
        field2661++;
        if (arg0 >= -52) {
            field2663 = (class211) null;
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -76);
        if (this.field2652.field3287) {
            int[] var4 = this.method1280(arg1, 0, false);
            int[] var5 = this.method1280(arg1, 1, false);
            int[] var6 = this.method1280(arg1, 2, false);
            for (int var7 = 0; var7 < class287.field4415; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V", line = 385)
    public class178() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)V", line = 389)
    public static void method1291(byte arg0) {
        field2663 = null;
        field2671 = null;
        field2659 = null;
        field2670 = null;
        if (arg0 != -42) {
            method1288((byte) 22, (class211) null);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILlb;Llb;)V", line = 402)
    public static final void method1292(int arg0, class211 arg1, class211 arg2) {
        if (arg0 == 23) {
            field2662++;
            class315.field4903 = arg2;
            class228.field3530 = arg1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lhb;II)V", line = 416)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field2667++;
        if (arg2 == 0) {
            this.field2649 = arg0.method273(arg1 ^ -47501) == 1;
        }
        if (arg1 != -18061) {
            field2669 = -116;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V", line = 435)
    public static final void method1293(int arg0) {
        class309.method2143(0, -121, 0);
        if (arg0 == 1516680140) {
            field2664++;
        }
    }
}
