import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class269 extends class21 {

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    private int field4144 = 0;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    private int field4149 = 1024;

    @OriginalMember(owner = "client!wj", name = "Y", descriptor = "I")
    private int field4154 = 1024;

    @OriginalMember(owner = "client!wj", name = "Z", descriptor = "I")
    private int field4155 = 409;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    private int field4148 = 1024;

    @OriginalMember(owner = "client!wj", name = "bb", descriptor = "I")
    private int field4157 = 0;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    private int field4147 = 2048;

    @OriginalMember(owner = "client!wj", name = "eb", descriptor = "I")
    private int field4160 = 819;

    @OriginalMember(owner = "client!wj", name = "hb", descriptor = "I")
    private int field4163 = 1024;

    @OriginalMember(owner = "client!wj", name = "ab", descriptor = "Lab;")
    public static class279 field4156 = new class279(4);

    @OriginalMember(owner = "client!wj", name = "ib", descriptor = "[I")
    public static int[] field4164 = new int[14];

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    private int field4150;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!wj", name = "cb", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!wj", name = "db", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!wj", name = "fb", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!wj", name = "gb", descriptor = "[[[B")
    public static byte[][][] field4162;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method1792(byte arg0, int arg1, int arg2) {
        class281 var3 = (class281) class21.field449.method303((long) arg1, (byte) 127);
        field4152++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4324.length; var5++) {
                if (var3.field4327[var5] == arg2) {
                    var4 += var3.field4324[var5];
                }
            }
            if (arg0 > -81) {
                return -44;
            } else {
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)V", line = 39)
    public final void method183(byte arg0) {
        field4151++;
        if (arg0 <= 82) {
            this.field4157 = -121;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 49)
    public static final void method1793(int arg0) {
        class29.field561.method2199(-13);
        field4146++;
        class18.field327 = 1;
        if (arg0 != -27795) {
            method1793(-80);
        }
        class147.field2402 = null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 594)
    public class269() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([[IILjava/util/Random;IIII)V", line = 69)
    private final void method1794(int[][] arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        field4153++;
        int var8 = this.field4149 > 0 ? 4096 - class220.method1462(arg2, arg3 - 861384010, this.field4149) : 4096;
        if (arg3 != -11670) {
            return;
        }
        int var9 = this.field4154 * this.field4150 >> 12;
        int var10 = this.field4150 - (var9 > 0 ? class220.method1462(arg2, -861395680, var9) : 0);
        if (class294.field4489 <= arg5) {
            arg5 -= class294.field4489;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg4 / 2;
            int var12 = arg6 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = arg6 - var13 * 2;
            int var15 = arg5 + var13;
            int var16 = var10 > var11 ? var11 : var10;
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg0[arg1 + var17];
                if (var16 > var17) {
                    int var19 = var8 * var17 / var16;
                    if (this.field4144 == 0) {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class61.method475(class4.field108, arg5 + var22)] = var18[class61.method475(arg5 + arg6 - var22 - 1, class4.field108)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class61.method475(arg5 + var20, class4.field108)] = var18[class61.method475(class4.field108, arg5 + arg6 - var20 - 1)] = var19 <= var21 ? var19 : var21;
                        }
                    }
                    if (class294.field4489 < var14 + var15) {
                        int var24 = class294.field4489 - var15;
                        class129.method854(var18, var15, var24, var19);
                        class129.method854(var18, 0, var14 - var24, var19);
                    } else {
                        class129.method854(var18, var15, var14, var19);
                    }
                } else {
                    int var25 = arg4 - (var17 + 1);
                    if (var25 >= var16) {
                        for (int var26 = 0; var26 < var13; var26++) {
                            var18[class61.method475(arg5 + var26, class4.field108)] = var18[class61.method475(arg5 + arg6 - var26 - 1, class4.field108)] = var8 * var26 / var13;
                        }
                        if (var14 + var15 > class294.field4489) {
                            int var27 = class294.field4489 - var15;
                            class129.method854(var18, var15, var27, var8);
                            class129.method854(var18, 0, var14 - var27, var8);
                        } else {
                            class129.method854(var18, var15, var14, var8);
                        }
                    } else {
                        int var28 = var8 * var25 / var16;
                        if (this.field4144 == 0) {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class61.method475(class4.field108, arg5 + var29)] = var18[class61.method475(arg5 - (var29 - arg6) - 1, class4.field108)] = var28 * var30 >> 12;
                            }
                        } else {
                            for (int var31 = 0; var31 < var13; var31++) {
                                int var32 = var8 * var31 / var13;
                                var18[class61.method475(class4.field108, arg5 + var31)] = var18[class61.method475(class4.field108, arg5 + arg6 - var31 - 1)] = var32 >= var28 ? var28 : var32;
                            }
                        }
                        if (class294.field4489 < var14 + var15) {
                            int var33 = class294.field4489 - var15;
                            class129.method854(var18, var15, var33, var28);
                            class129.method854(var18, 0, var14 - var33, var28);
                        } else {
                            class129.method854(var18, var15, var14, var28);
                        }
                    }
                }
            }
        } else if ((arg5 + arg6) <= class294.field4489) {
            for (int var34 = 0; var34 < arg4; var34++) {
                class129.method854(arg0[arg1 + var34], arg5, arg6, var8);
            }
        } else {
            int var35 = class294.field4489 - arg5;
            for (int var36 = 0; var36 < arg4; var36++) {
                int[] var37 = arg0[arg1 + var36];
                class129.method854(var37, arg5, var35, var8);
                class129.method854(var37, 0, arg6 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)[I", line = 276)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        field4158++;
        if (this.field443.field2637) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int[][] var7 = this.field443.method1043(-118);
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class294.field4489 * this.field4148 >> 12;
            int var15 = class294.field4489 * this.field4147 >> 12;
            int var16 = class147.field2421 * this.field4155 >> 12;
            int var17 = class147.field2421 * this.field4160 >> 12;
            if (var17 <= 1) {
                return var7[arg1];
            }
            int var18 = class294.field4489 / var14 + 1;
            int[][] var19 = new int[var18][3];
            this.field4150 = class294.field4489 / 8 * this.field4163 >> 12;
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4157);
            label128: while (true) {
                while (true) {
                    int var22 = class220.method1462(var21, -861395680, var15 - var14) + var14;
                    int var23 = var8 + var22;
                    int var24 = class220.method1462(var21, -861395680, var17 - var16) + var16;
                    if (class294.field4489 < var23) {
                        var23 = class294.field4489;
                        var22 = class294.field4489 - var8;
                    }
                    int var29;
                    if (var10) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var19[var9];
                        int var27 = 0;
                        int var28 = var4 + var23;
                        var29 = var26[2];
                        if (var28 < 0) {
                            var28 += class294.field4489;
                        }
                        if (class294.field4489 < var28) {
                            var28 -= class294.field4489;
                        }
                        while (true) {
                            int[] var30 = var19[var25];
                            if (var28 >= var30[0] && var30[1] >= var28) {
                                if (var9 != var25) {
                                    int var31 = var4 + var8;
                                    if (var31 < 0) {
                                        var31 += class294.field4489;
                                    }
                                    if (class294.field4489 < var31) {
                                        var31 -= class294.field4489;
                                    }
                                    for (int var32 = 1; var32 <= var27; var32++) {
                                        int[] var33 = var19[(var9 + var32) % var11];
                                        var29 = Math.max(var29, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var27; var34++) {
                                        int[] var35 = var19[(var9 + var34) % var11];
                                        int var36 = var35[2];
                                        if (var29 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var28 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var28, var38);
                                            } else if (var37 == 0) {
                                                var39 = 0;
                                                var40 = Math.min(var28, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class294.field4489;
                                            }
                                            this.method1794(var7, var36, var21, -11670, var29 - var36, var5 + var39, var40 - var39);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            var27++;
                            var25++;
                            if (var25 >= var11) {
                                var25 = 0;
                            }
                        }
                    }
                    if (class147.field2421 >= (var24 + var29)) {
                        var12 = false;
                    } else {
                        var24 = class147.field2421 - var29;
                    }
                    if (class294.field4489 == var23) {
                        this.method1794(var7, var29, var21, -11670, var24, var6 + var8, var22);
                        if (var12) {
                            break label128;
                        }
                        var10 = false;
                        int[] var42 = var20[var13++];
                        var12 = true;
                        var42[1] = var23;
                        var42[0] = var8;
                        var9 = 0;
                        var42[2] = var24 + var29;
                        var11 = var13;
                        var5 = var6;
                        int[][] var43 = var19;
                        var13 = 0;
                        var19 = var20;
                        var6 = class220.method1462(var21, -861395680, class294.field4489);
                        var20 = var43;
                        var8 = 0;
                        var4 = var6 - var5;
                        int var44 = var4;
                        if (var4 < 0) {
                            var44 = class294.field4489 + var4;
                        }
                        if (class294.field4489 < var44) {
                            var44 -= class294.field4489;
                        }
                        while (true) {
                            int[] var45 = var19[var9];
                            if (var44 >= var45[0] && var44 <= var45[1]) {
                                break;
                            }
                            var9++;
                            if (var11 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var46 = var20[var13++];
                        var46[0] = var8;
                        var46[1] = var23;
                        var46[2] = var24 + var29;
                        this.method1794(var7, var29, var21, -11670, var24, var6 + var8, var22);
                        var8 = var23;
                    }
                }
            }
        }
        int var41 = 86 / ((arg0 - 33) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(BI)Lfk;", line = 529)
    public static final class155 method1795(byte arg0, int arg1) {
        class155 var2 = (class155) class280.field4308.method1881(true, (long) arg1);
        if (arg0 > -100) {
            field4162 = (byte[][][]) ((byte[][][]) null);
        }
        field4161++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class342.field5312.method2036(class318.method2192((byte) -128, arg1), class112.method719((byte) -49, arg1), (byte) 65);
        class155 var4 = new class155();
        if (var3 != null) {
            var4.method1002(88, new class202(var3));
        }
        class280.field4308.method1880(var4, (long) arg1, 113);
        return var4;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V", line = 571)
    public static final void method1796(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4159++;
        class14.field263.field3249 = 0;
        class14.field263.method1311(20, 10964);
        class14.field263.method1311(arg1, arg2 + 10964);
        class14.field263.method1311(arg4, 10964);
        class14.field263.method1313(arg3, -376480);
        class14.field263.method1313(arg0, -376480);
        class40.field775 = -3;
        class341.field5296 = 0;
        class53.field1075 = 1;
        class196.field3157 = arg2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IILag;)V", line = 605)
    public final void method178(int arg0, int arg1, class202 arg2) {
        field4145++;
        if (arg0 != -318) {
            this.field4157 = -35;
        }
        if (arg1 == 0) {
            this.field4157 = arg2.method1317((byte) -75);
        } else if (arg1 == 1) {
            this.field4148 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field4147 = arg2.method1315(14289);
        } else if (arg1 == 3) {
            this.field4155 = arg2.method1315(14289);
        } else if (arg1 == 4) {
            this.field4160 = arg2.method1315(14289);
        } else if (arg1 == 5) {
            this.field4163 = arg2.method1315(arg0 + 14607);
        } else if (arg1 == 6) {
            this.field4144 = arg2.method1317((byte) -88);
        } else if (arg1 == 7) {
            this.field4154 = arg2.method1315(14289);
        } else if (arg1 == 8) {
            this.field4149 = arg2.method1315(14289);
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V", line = 704)
    public static void method1797(byte arg0) {
        int var1 = -79 % ((41 - arg0) / 49);
        field4156 = null;
        field4162 = (byte[][][]) null;
        field4164 = null;
    }
}
