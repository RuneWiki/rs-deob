import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class90 extends class199 {

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    private int field1126 = 409;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    private int field1136 = 1024;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    private int field1131 = 1024;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    private int field1137 = 819;

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    private int field1130 = 0;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    private int field1129 = 1024;

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    private int field1139 = 1024;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    private int field1128 = 0;

    @OriginalMember(owner = "client!ac", name = "kb", descriptor = "I")
    private int field1142 = 2048;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "I")
    public static int field1134 = 20;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "Ljava/lang/String;")
    public static String field1135 = "Walk here";

    @OriginalMember(owner = "client!ac", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field1145 = "Loaded defaults";

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "F")
    public static float field1125;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ac", name = "lb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ac", name = "mb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method648(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 < class345.field5370; var5++) {
            if (arg3 < class64.field802[var5] + class65.field826[var5] && (arg0 + arg3) > class64.field802[var5] && class322.field4728[var5] + class300.field4414[var5] > arg4 && (arg2 + arg4) > class300.field4414[var5]) {
                class229.field3276[var5] = true;
            }
        }
        field1132++;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 654)
    public class90() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)[I", line = 32)
    public final int[] method190(int arg0, int arg1) {
        int[] var3 = this.field2802.method2502(arg1, -118);
        field1143++;
        if (arg0 != -1735) {
            return (int[]) null;
        } else if (this.field2802.field5637) {
            int var4 = 0;
            int[][] var5 = this.field2802.method2501(-1);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = class95.field1235 * this.field1139 >> 12;
            int var14 = 0;
            int var15 = class224.field3233 * this.field1126 >> 12;
            int var16 = class95.field1235 * this.field1142 >> 12;
            int var17 = class224.field3233 * this.field1137 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            }
            this.field1133 = class95.field1235 / 8 * this.field1136 >> 12;
            int var18 = (class95.field1235 / var13) + 1;
            Random var19 = new Random((long) this.field1128);
            int[][] var20 = new int[var18][3];
            int[][] var21 = new int[var18][3];
            while (true) {
                while (true) {
                    int var22 = var13 + class294.method2011(var19, var16 - var13, -128);
                    int var23 = class294.method2011(var19, var17 - var15, -92) + var15;
                    int var24 = var7 + var22;
                    if (var24 > class95.field1235) {
                        var22 = class95.field1235 - var7;
                        var24 = class95.field1235;
                    }
                    int var25;
                    if (var10) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var21[var9];
                        var25 = var27[2];
                        int var28 = 0;
                        int var29 = var4 + var24;
                        if (var29 < 0) {
                            var29 += class95.field1235;
                        }
                        if (class95.field1235 < var29) {
                            var29 -= class95.field1235;
                        }
                        while (true) {
                            int[] var30 = var21[var26];
                            if (var30[0] <= var29 && var29 <= var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var7 + var4;
                                    if (var31 < 0) {
                                        var31 += class95.field1235;
                                    }
                                    if (var31 > class95.field1235) {
                                        var31 -= class95.field1235;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var21[(var9 + var32) % var11];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var21[(var9 + var34) % var11];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[1];
                                            int var38 = var35[0];
                                            int var39;
                                            int var40;
                                            if (var31 < var29) {
                                                var39 = Math.max(var31, var38);
                                                var40 = Math.min(var29, var37);
                                            } else if (var38 == 0) {
                                                var40 = Math.min(var29, var37);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var38);
                                                var40 = class95.field1235;
                                            }
                                            this.method651(var25 - var36, -var39 + var40, var8 + var39, var36, -1, var19, var5);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            var26++;
                            if (var26 >= var11) {
                                var26 = 0;
                            }
                            var28++;
                        }
                    }
                    if (class224.field3233 < (var23 + var25)) {
                        var23 = class224.field3233 - var25;
                    } else {
                        var12 = false;
                    }
                    if (class95.field1235 == var24) {
                        this.method651(var23, var22, var7 + var6, var25, -1, var19, var5);
                        if (var12) {
                            return var3;
                        }
                        var10 = false;
                        int[] var42 = var20[var14++];
                        var12 = true;
                        var42[1] = var24;
                        var8 = var6;
                        var11 = var14;
                        var42[0] = var7;
                        var42[2] = var23 + var25;
                        var6 = class294.method2011(var19, class95.field1235, 105);
                        int[][] var43 = var21;
                        var9 = 0;
                        var4 = var6 - var8;
                        var21 = var20;
                        int var44 = var4;
                        var20 = var43;
                        if (var4 < 0) {
                            var44 = class95.field1235 + var4;
                        }
                        var14 = 0;
                        if (class95.field1235 < var44) {
                            var44 -= class95.field1235;
                        }
                        while (true) {
                            int[] var45 = var21[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                var7 = 0;
                                break;
                            }
                            var9++;
                            if (var11 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var20[var14++];
                        var41[1] = var24;
                        var41[2] = var23 + var25;
                        var41[0] = var7;
                        this.method651(var23, var22, var6 + var7, var25, arg0 ^ 0x6C6, var19, var5);
                        var7 = var24;
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(B)V", line = 289)
    public final void method189(byte arg0) {
        int var2 = -88 % ((36 - arg0) / 44);
        field1141++;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIILpm;I)Ljava/awt/Frame;", line = 299)
    public static final Frame method649(int arg0, int arg1, int arg2, int arg3, class69 arg4, int arg5) {
        field1144++;
        if (!arg4.method509((byte) -91)) {
            return null;
        }
        if (arg5 != 24139) {
            field1125 = 1.1303226F;
        }
        if (arg0 == 0) {
            class181[] var6 = class249.method1747(14, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field2474 == arg1 && var6[var8].field2473 == arg2 && (arg3 == 0 || var6[var8].field2475 == arg3) && (!var7 || arg0 < var6[var8].field2477)) {
                    var7 = true;
                    arg0 = var6[var8].field2477;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class188 var9 = arg4.method492(arg3, arg1, arg2, (byte) -90, arg0);
        while (var9.field2608 == 0) {
            class177.method1299((byte) 64, 10L);
        }
        Frame var10 = (Frame) var9.field2606;
        if (var10 == null) {
            return null;
        } else if (var9.field2608 == 2) {
            class274.method1860(arg4, var10, true);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V", line = 374)
    public static void method650(boolean arg0) {
        field1145 = null;
        if (!arg0) {
            method653(61, 52);
        }
        field1135 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIILjava/util/Random;[[I)V", line = 406)
    private final void method651(int arg0, int arg1, int arg2, int arg3, int arg4, Random arg5, int[][] arg6) {
        field1124++;
        int var8 = this.field1131 > 0 ? 4096 - class294.method2011(arg5, this.field1131, 104) : 4096;
        int var9 = this.field1133 * this.field1129 >> 12;
        int var10 = this.field1133 - (~var9 < arg4 ? class294.method2011(arg5, var9, 105) : 0);
        if (class95.field1235 <= arg2) {
            arg2 -= class95.field1235;
        }
        if (var10 > 0) {
            if (arg0 <= 0 || arg1 <= 0) {
                return;
            }
            int var11 = arg1 / 2;
            int var12 = arg0 / 2;
            int var13 = var11 >= var10 ? var10 : var11;
            int var14 = var10 > var12 ? var12 : var10;
            int var15 = arg2 + var13;
            int var16 = arg1 - (var13 * 2);
            for (int var17 = 0; var17 < arg0; var17++) {
                int[] var18 = arg6[var17 + arg3];
                if (var14 <= var17) {
                    int var19 = arg0 - var17 - 1;
                    if (var14 <= var19) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class335.method2339(class245.field3573, arg2 + var20)] = var18[class335.method2339(class245.field3573, arg1 + arg2 - var20 - 1)] = var8 * var20 / var13;
                        }
                        if ((var15 + var16) <= class95.field1235) {
                            class87.method630(var18, var15, var16, var8);
                        } else {
                            int var21 = class95.field1235 - var15;
                            class87.method630(var18, var15, var21, var8);
                            class87.method630(var18, 0, var16 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field1130 == 0) {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class335.method2339(class245.field3573, arg2 + var25)] = var18[class335.method2339(arg1 + arg2 - var25 - 1, class245.field3573)] = var22 * var26 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class335.method2339(class245.field3573, arg2 + var23)] = var18[class335.method2339(class245.field3573, arg2 + arg1 - var23 - 1)] = var22 > var24 ? var24 : var22;
                            }
                        }
                        if (class95.field1235 < (var15 + var16)) {
                            int var27 = class95.field1235 - var15;
                            class87.method630(var18, var15, var27, var22);
                            class87.method630(var18, 0, var16 - var27, var22);
                        } else {
                            class87.method630(var18, var15, var16, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field1130 == 0) {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class335.method2339(class245.field3573, arg2 + var31)] = var18[class335.method2339(arg1 + arg2 - (var31 + 1), class245.field3573)] = var28 * var32 >> 12;
                        }
                    } else {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class335.method2339(arg2 + var29, class245.field3573)] = var18[class335.method2339(arg1 + arg2 - var29 - 1, class245.field3573)] = var28 <= var30 ? var28 : var30;
                        }
                    }
                    if (var15 + var16 > class95.field1235) {
                        int var33 = class95.field1235 - var15;
                        class87.method630(var18, var15, var33, var28);
                        class87.method630(var18, 0, var16 - var33, var28);
                    } else {
                        class87.method630(var18, var15, var16, var28);
                    }
                }
            }
        } else if (class95.field1235 >= arg1 + arg2) {
            for (int var34 = 0; var34 < arg0; var34++) {
                class87.method630(arg6[arg3 + var34], arg2, arg1, var8);
            }
        } else {
            int var35 = class95.field1235 - arg2;
            for (int var36 = 0; var36 < arg0; var36++) {
                int[] var37 = arg6[arg3 + var36];
                class87.method630(var37, arg2, var35, var8);
                class87.method630(var37, 0, arg1 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIZ)I", line = 608)
    public static final int method652(int arg0, int arg1, boolean arg2) {
        field1127++;
        if (arg2) {
            return 42;
        }
        class223 var3 = (class223) class240.field3489.method2279((long) arg0, -120);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field3216.length) {
            return var3.field3216[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I", line = 631)
    public static final int method653(int arg0, int arg1) {
        field1138++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != 1624671788) {
                method652(-15, 12, false);
            }
            return class142.method1103(106, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLfd;I)V", line = 660)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        field1140++;
        if (arg0 != -43) {
            method653(-59, 27);
        }
        if (arg2 == 0) {
            this.field1128 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field1139 = arg1.method2083((byte) -61);
        } else if (arg2 == 2) {
            this.field1142 = arg1.method2083((byte) -82);
        } else if (arg2 == 3) {
            this.field1126 = arg1.method2083((byte) -80);
        } else if (arg2 == 4) {
            this.field1137 = arg1.method2083((byte) -126);
        } else if (arg2 == 5) {
            this.field1136 = arg1.method2083((byte) -101);
        } else if (arg2 == 6) {
            this.field1130 = arg1.method2096((byte) -122);
        } else if (arg2 == 7) {
            this.field1129 = arg1.method2083((byte) -103);
        } else if (arg2 == 8) {
            this.field1131 = arg1.method2083((byte) -79);
        }
    }
}
