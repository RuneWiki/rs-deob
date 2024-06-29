import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class44 extends class335 {

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    private int field699 = 0;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    private int field701 = 409;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    private int field706 = 1024;

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    private int field710 = 819;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    private int field697 = 1024;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    private int field712 = 2048;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    private int field711 = 1024;

    @OriginalMember(owner = "client!ec", name = "hb", descriptor = "I")
    private int field717 = 1024;

    @OriginalMember(owner = "client!ec", name = "eb", descriptor = "I")
    private int field714 = 0;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "J")
    public static long field695 = 0L;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "Lql;")
    public static class87 field705 = new class87();

    @OriginalMember(owner = "client!ec", name = "fb", descriptor = "I")
    public static int field715 = 0;

    @OriginalMember(owner = "client!ec", name = "gb", descriptor = "I")
    public static int field716 = 0;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "I")
    private int field703;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZZIILjava/lang/String;IIZLjava/lang/String;J)V", line = 5)
    public static final void method376(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7, boolean arg8, String arg9, long arg10) {
        field708++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class166 var14 = new class166(128);
        var14.method1132((byte) 29, 10);
        var14.method1150((arg8 ? 4 : 0) | (arg2 ? 2 : 0) | (arg1 ? 1 : 0), -628562744);
        var14.method1125(8473, arg10);
        var14.method1174((byte) -32, var12[0]);
        var14.method1121(-1, arg9);
        var14.method1174((byte) -32, var12[1]);
        var14.method1150(class233.field3708, -628562744);
        var14.method1132((byte) 29, arg0);
        var14.method1132((byte) 29, arg6);
        var14.method1174((byte) -32, var12[2]);
        var14.method1150(arg7, arg3 - 628562744);
        var14.method1150(arg4, arg3 - 628562744);
        var14.method1174((byte) -32, var12[3]);
        var14.method1158((byte) 26, class71.field1167, class294.field4554);
        class166 var15 = new class166(350);
        var15.method1121(~arg3, arg5);
        int var16 = 8 - (class179.method1273(125, arg5) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1132((byte) 29, (int) (Math.random() * 255.0D));
        }
        var15.method1142(var12, (byte) 115);
        class106.field1642.field2532 = 0;
        class106.field1642.method1132((byte) 29, 22);
        class106.field1642.method1150(2 - (-var14.field2532 - var15.field2532), -628562744);
        class106.field1642.method1150(539, -628562744);
        class106.field1642.method1170(false, var14.field2532, 0, var14.field2500);
        class106.field1642.method1170(false, var15.field2532, arg3, var15.field2500);
        class186.field2779 = 0;
        class37.field558 = 0;
        class233.field3705 = 1;
        class202.field3033 = -3;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)Ldm;", line = 63)
    public static final class333 method377(int arg0, int arg1) {
        field696++;
        class333 var2 = (class333) class320.field4994.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class195.field2918.method980(32, arg0, arg1 ^ 0xFFFFE956);
        class333 var4 = new class333();
        if (var3 != null) {
            var4.method2320(new class166(var3), 0);
        }
        if (arg1 != -5805) {
            method378((byte) 126);
        }
        var4.method2321(117);
        class320.field4994.method2173(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 88)
    public static void method378(byte arg0) {
        if (arg0 != 34) {
            method380(-89, -88, 19, (class180) null, -98, (byte) 15);
        }
        field705 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[[IIILjava/util/Random;)V", line = 99)
    private final void method379(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        field698++;
        if (arg0 < 75) {
            return;
        }
        int var8 = this.field697 <= 0 ? 4096 : 4096 - class85.method615(arg6, this.field697, true);
        int var9 = this.field706 * this.field703 >> 12;
        int var10 = this.field703 - (var9 <= 0 ? 0 : class85.method615(arg6, var9, true));
        if (arg4 >= class105.field1630) {
            arg4 -= class105.field1630;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg1 <= 0) {
                return;
            }
            int var11 = arg5 / 2;
            int var12 = arg1 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = var10 > var11 ? var11 : var10;
            int var15 = arg1 - (var13 * 2);
            int var16 = arg4 + var13;
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var18 = arg3[var17 + arg2];
                if (var14 <= var17) {
                    int var19 = arg5 - var17 - 1;
                    if (var19 >= var14) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class270.method1860(arg4 + var20, class244.field3906)] = var18[class270.method1860(arg4 + arg1 - var20 - 1, class244.field3906)] = var8 * var20 / var13;
                        }
                        if ((var15 + var16) <= class105.field1630) {
                            class343.method2376(var18, var16, var15, var8);
                        } else {
                            int var21 = class105.field1630 - var16;
                            class343.method2376(var18, var16, var21, var8);
                            class343.method2376(var18, 0, var15 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field714 == 0) {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class270.method1860(class244.field3906, arg4 + var23)] = var18[class270.method1860(class244.field3906, arg1 + arg4 - var23 - 1)] = var22 * var24 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class270.method1860(class244.field3906, arg4 + var25)] = var18[class270.method1860(class244.field3906, arg4 + arg1 - var25 - 1)] = var26 >= var22 ? var22 : var26;
                            }
                        }
                        if (var15 + var16 > class105.field1630) {
                            int var27 = class105.field1630 - var16;
                            class343.method2376(var18, var16, var27, var22);
                            class343.method2376(var18, 0, var15 - var27, var22);
                        } else {
                            class343.method2376(var18, var16, var15, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field714 == 0) {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class270.method1860(arg4 + var29, class244.field3906)] = var18[class270.method1860(class244.field3906, arg4 + arg1 - var29 - 1)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class270.method1860(arg4 + var31, class244.field3906)] = var18[class270.method1860(arg1 + arg4 - var31 - 1, class244.field3906)] = var32 >= var28 ? var28 : var32;
                        }
                    }
                    if ((var15 + var16) > class105.field1630) {
                        int var33 = class105.field1630 - var16;
                        class343.method2376(var18, var16, var33, var28);
                        class343.method2376(var18, 0, var15 - var33, var28);
                    } else {
                        class343.method2376(var18, var16, var15, var28);
                    }
                }
            }
        } else if (arg1 + arg4 <= class105.field1630) {
            for (int var34 = 0; var34 < arg5; var34++) {
                class343.method2376(arg3[arg2 + var34], arg4, arg1, var8);
            }
        } else {
            int var35 = class105.field1630 - arg4;
            for (int var36 = 0; var36 < arg5; var36++) {
                int[] var37 = arg3[arg2 + var36];
                class343.method2376(var37, arg4, var35, var8);
                class343.method2376(var37, 0, arg1 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILki;IB)Ljava/awt/Frame;", line = 298)
    public static final Frame method380(int arg0, int arg1, int arg2, class180 arg3, int arg4, byte arg5) {
        field707++;
        if (!arg3.method1287(0)) {
            return null;
        }
        if (arg2 == 0) {
            class12[] var6 = class342.method2367(arg5 + 25338, arg3);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field189 == arg1 && var6[var8].field193 == arg4 && (arg0 == 0 || var6[var8].field183 == arg0) && (!var7 || var6[var8].field186 > arg2)) {
                    arg2 = var6[var8].field186;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class197 var9 = arg3.method1278(arg0, arg1, arg2, (byte) -41, arg4);
        if (arg5 != -118) {
            field715 = -111;
        }
        while (var9.field2956 == 0) {
            class5.method26(arg5 + 118, 10L);
        }
        Frame var10 = (Frame) var9.field2959;
        if (var10 == null) {
            return null;
        } else if (var9.field2956 == 2) {
            class335.method2331((byte) -101, arg3, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 471)
    public class44() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 375)
    public final void method381(int arg0) {
        field700++;
        int var2 = 105 % ((arg0 - 44) / 35);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IJ)V", line = 391)
    public static final void method382(int arg0, long arg1) {
        field709++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class225.field3579 < 100 || class123.field1882) || class225.field3579 >= 200) {
            class29.method252(class195.field2913, "", true, 0);
            return;
        }
        String var3 = class34.method289(arg0 ^ 0x1634, arg1);
        for (int var4 = 0; var4 < class225.field3579; var4++) {
            if (class35.field549[var4] == arg1) {
                class29.method252(var3 + class190.field2855, "", true, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class336.field5253; var5++) {
            if (class337.field5277[var5] == arg1) {
                class29.method252(class121.field1851 + var3 + class229.field3647, "", true, 0);
                return;
            }
        }
        if (var3.equals(class98.field1566.field477)) {
            class29.method252(class278.field4289, "", true, 0);
            return;
        }
        class51.field828[class225.field3579] = var3;
        class35.field549[class225.field3579] = arg1;
        class315.field4884++;
        class148.field2252[class225.field3579] = 0;
        class1.field13[class225.field3579] = "";
        class233.field3702[class225.field3579] = 0;
        class220.field3347[class225.field3579] = false;
        class161.field2423 = class291.field4524;
        class225.field3579++;
        class106.field1642.method753(124, 155);
        if (arg0 != -5756) {
            field705 = (class87) null;
        }
        class106.field1642.method1125(arg0 + 14229, arg1);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILkh;I)V", line = 475)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg2 < 51) {
            method380(39, -69, -85, (class180) null, -70, (byte) 41);
        }
        if (arg0 == 0) {
            this.field699 = arg1.method1178(0);
        } else if (arg0 == 1) {
            this.field711 = arg1.method1151(-122);
        } else if (arg0 == 2) {
            this.field712 = arg1.method1151(-56);
        } else if (arg0 == 3) {
            this.field701 = arg1.method1151(-117);
        } else if (arg0 == 4) {
            this.field710 = arg1.method1151(-97);
        } else if (arg0 == 5) {
            this.field717 = arg1.method1151(-120);
        } else if (arg0 == 6) {
            this.field714 = arg1.method1178(0);
        } else if (arg0 == 7) {
            this.field706 = arg1.method1151(-117);
        } else if (arg0 == 8) {
            this.field697 = arg1.method1151(-56);
        }
        field702++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[I", line = 574)
    public final int[] method149(int arg0, int arg1) {
        field713++;
        if (arg1 != 621) {
            this.field714 = -68;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (!this.field5233.field2467) {
            return var3;
        }
        int[][] var4 = this.field5233.method1107(0);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class105.field1630 * this.field711 >> 12;
        int var15 = class105.field1630 * this.field712 >> 12;
        int var16 = class75.field1213 * this.field710 >> 12;
        int var17 = class75.field1213 * this.field701 >> 12;
        if (var16 <= 1) {
            return var4[arg0];
        }
        this.field703 = class105.field1630 / 8 * this.field717 >> 12;
        int var18 = class105.field1630 / var14 + 1;
        int[][] var19 = new int[var18][3];
        Random var20 = new Random((long) this.field699);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class85.method615(var20, var15 - var14, true) + var14;
                int var23 = class85.method615(var20, var16 - var17, true) + var17;
                int var24 = var8 + var22;
                if (var24 > class105.field1630) {
                    var24 = class105.field1630;
                    var22 = class105.field1630 - var8;
                }
                int var27;
                if (var11) {
                    var27 = 0;
                } else {
                    int var25 = var9;
                    int[] var26 = var19[var9];
                    var27 = var26[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class105.field1630;
                    }
                    if (var29 > class105.field1630) {
                        var29 -= class105.field1630;
                    }
                    while (true) {
                        int[] var30 = var19[var25];
                        if (var29 >= var30[0] && var30[1] >= var29) {
                            if (var9 != var25) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class105.field1630;
                                }
                                if (var31 > class105.field1630) {
                                    var31 -= class105.field1630;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var19[(var9 + var32) % var12];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var19[(var9 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
                                        int var37 = var35[1];
                                        int var38 = var35[0];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var38);
                                            var40 = Math.min(var29, var37);
                                        } else if (var38 == 0) {
                                            var40 = Math.min(var29, var37);
                                            var39 = 0;
                                        } else {
                                            var39 = Math.max(var31, var38);
                                            var40 = class105.field1630;
                                        }
                                        this.method379(124, var40 - var39, var36, var4, var7 + var39, -var36 + var27, var20);
                                    }
                                }
                            }
                            var9 = var25;
                            break;
                        }
                        var28++;
                        var25++;
                        if (var25 >= var12) {
                            var25 = 0;
                        }
                    }
                }
                if (class75.field1213 < (var27 + var23)) {
                    var23 = class75.field1213 - var27;
                } else {
                    var10 = false;
                }
                if (class105.field1630 == var24) {
                    this.method379(86, var22, var27, var4, var6 + var8, var23, var20);
                    if (var10) {
                        return var3;
                    }
                    var7 = var6;
                    var10 = true;
                    var11 = false;
                    var9 = 0;
                    int[][] var42 = var19;
                    var19 = var21;
                    int[] var43 = var21[var13++];
                    var43[0] = var8;
                    var21 = var42;
                    var8 = 0;
                    var43[1] = var24;
                    var43[2] = var23 + var27;
                    var12 = var13;
                    var6 = class85.method615(var20, class105.field1630, true);
                    var13 = 0;
                    var5 = var6 - var7;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class105.field1630 + var5;
                    }
                    if (class105.field1630 < var44) {
                        var44 -= class105.field1630;
                    }
                    while (true) {
                        int[] var45 = var19[var9];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var9++;
                        if (var12 <= var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var41 = var21[var13++];
                    var41[2] = var23 + var27;
                    var41[0] = var8;
                    var41[1] = var24;
                    this.method379(91, var22, var27, var4, var6 + var8, var23, var20);
                    var8 = var24;
                }
            }
        }
    }
}
