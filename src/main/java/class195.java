import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class195 extends class232 {

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    private int field3311 = 1024;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    private int field3310 = 819;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    private int field3317 = 1024;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    private int field3323 = 0;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "I")
    private int field3320 = 1024;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    private int field3318 = 1024;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    private int field3312 = 0;

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    private int field3322 = 409;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "I")
    private int field3321 = 2048;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "[I")
    public static int[] field3307 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    private int field3313;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!sj", name = "hb", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "[Z")
    public static boolean[] field3315;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method1358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class267.method1885(arg1, (byte) 88);
        int var7 = 0;
        int var8 = arg1 - arg5;
        if (arg2 >= -1) {
            return;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        field3309++;
        int var9 = -arg1;
        int var10 = var8;
        int var11 = arg1;
        int var12 = -1;
        int var13 = -1;
        int var14 = -var8;
        if (arg3 >= class60.field931 && class29.field399 >= arg3) {
            int[] var15 = class73.field1117[arg3];
            int var16 = class163.method1179(arg4 - arg1, class207.field3623, class200.field3443, (byte) -63);
            int var17 = class163.method1179(arg1 + arg4, class207.field3623, class200.field3443, (byte) -74);
            int var18 = class163.method1179(arg4 - var8, class207.field3623, class200.field3443, (byte) -128);
            int var19 = class163.method1179(arg4 + var8, class207.field3623, class200.field3443, (byte) -124);
            class114.method780(-43, var16, var18, arg0, var15);
            class114.method780(98, var18, var19, arg6, var15);
            class114.method780(117, var19, var17, arg0, var15);
        }
        while (var7 < var11) {
            var13 += 2;
            var9 += var13;
            var12 += 2;
            var14 += var12;
            if (var14 >= 0 && var10 >= 1) {
                var10--;
                var14 -= var10 << 1;
                class197.field3375[var10] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var11--;
                int var20 = arg3 - var11;
                var9 -= var11 << 1;
                int var21 = arg3 + var11;
                if (var21 >= class60.field931 && class29.field399 >= var20) {
                    if (var11 >= var8) {
                        int var22 = class163.method1179(arg4 + var7, class207.field3623, class200.field3443, (byte) -88);
                        int var23 = class163.method1179(arg4 - var7, class207.field3623, class200.field3443, (byte) -112);
                        if (class29.field399 >= var21) {
                            class114.method780(91, var23, var22, arg0, class73.field1117[var21]);
                        }
                        if (class60.field931 <= var20) {
                            class114.method780(-114, var23, var22, arg0, class73.field1117[var20]);
                        }
                    } else {
                        int var24 = class197.field3375[var11];
                        int var25 = class163.method1179(arg4 + var7, class207.field3623, class200.field3443, (byte) -100);
                        int var26 = class163.method1179(arg4 - var7, class207.field3623, class200.field3443, (byte) -64);
                        int var27 = class163.method1179(arg4 + var24, class207.field3623, class200.field3443, (byte) -124);
                        int var28 = class163.method1179(arg4 - var24, class207.field3623, class200.field3443, (byte) -128);
                        if (class29.field399 >= var21) {
                            int[] var29 = class73.field1117[var21];
                            class114.method780(-119, var26, var28, arg0, var29);
                            class114.method780(106, var28, var27, arg6, var29);
                            class114.method780(-84, var27, var25, arg0, var29);
                        }
                        if (var20 >= class60.field931) {
                            int[] var30 = class73.field1117[var20];
                            class114.method780(-91, var26, var28, arg0, var30);
                            class114.method780(93, var28, var27, arg6, var30);
                            class114.method780(-42, var27, var25, arg0, var30);
                        }
                    }
                }
            }
            int var31 = arg3 - var7;
            int var32 = arg3 + var7;
            if (var32 >= class60.field931 && class29.field399 >= var31) {
                int var33 = arg4 + var11;
                int var34 = arg4 - var11;
                if (var33 >= class200.field3443 && var34 <= class207.field3623) {
                    int var35 = class163.method1179(var33, class207.field3623, class200.field3443, (byte) -102);
                    int var36 = class163.method1179(var34, class207.field3623, class200.field3443, (byte) -86);
                    if (var7 >= var8) {
                        if (class29.field399 >= var32) {
                            class114.method780(-95, var36, var35, arg0, class73.field1117[var32]);
                        }
                        if (var31 >= class60.field931) {
                            class114.method780(108, var36, var35, arg0, class73.field1117[var31]);
                        }
                    } else {
                        int var37 = var10 < var7 ? class197.field3375[var7] : var10;
                        int var38 = class163.method1179(arg4 + var37, class207.field3623, class200.field3443, (byte) -114);
                        int var39 = class163.method1179(arg4 - var37, class207.field3623, class200.field3443, (byte) -89);
                        if (var32 <= class29.field399) {
                            int[] var40 = class73.field1117[var32];
                            class114.method780(-112, var36, var39, arg0, var40);
                            class114.method780(84, var39, var38, arg6, var40);
                            class114.method780(97, var38, var35, arg0, var40);
                        }
                        if (var31 >= class60.field931) {
                            int[] var41 = class73.field1117[var31];
                            class114.method780(111, var36, var39, arg0, var41);
                            class114.method780(-46, var39, var38, arg6, var41);
                            class114.method780(-90, var38, var35, arg0, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 198)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IJ)V", line = 213)
    public static final void method1359(int arg0, long arg1) {
        field3319++;
        class61.field957.field2611 = 0;
        class61.field957.method1075(84, -1);
        class61.field957.method1057((byte) 43, arg1);
        class202.field3473 = 0;
        class191.field3188 = 1;
        class19.field240 = -3;
        class60.field953 = arg0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Leb;I)I", line = 228)
    public static final int method1360(class275 arg0, int arg1) {
        class233 var2 = arg0.field4628;
        field3316++;
        if (var2.field4063 != null) {
            var2 = var2.method1652(false);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != -1308789364) {
            field3307 = (int[]) null;
        }
        int var3 = var2.field4019;
        if (arg0.field1703 == arg0.field1668) {
            var3 = var2.field4079;
        } else if (arg0.field1668 == arg0.field1667) {
            var3 = var2.field4068;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/util/Random;[[IIIBII)V", line = 259)
    private final void method1361(Random arg0, int[][] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3314++;
        if (arg4 != -114) {
            return;
        }
        int var8 = this.field3318 > 0 ? 4096 - class232.method1650(this.field3318, false, arg0) : 4096;
        int var9 = this.field3320 * this.field3313 >> 12;
        int var10 = this.field3313 - (var9 > 0 ? class232.method1650(var9, false, arg0) : 0);
        if (class54.field858 <= arg3) {
            arg3 -= class54.field858;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg5 <= 0) {
                return;
            }
            int var15 = arg5 / 2;
            int var16 = var10 > var15 ? var15 : var10;
            int var17 = arg3 + var16;
            int var18 = arg2 / 2;
            int var19 = var18 >= var10 ? var10 : var18;
            int var20 = arg5 - var16 * 2;
            for (int var21 = 0; var21 < arg2; var21++) {
                int[] var22 = arg1[arg6 + var21];
                if (var21 >= var19) {
                    int var23 = arg2 - var21 - 1;
                    if (var23 >= var19) {
                        for (int var24 = 0; var24 < var16; var24++) {
                            var22[class277.method1935(arg3 + var24, class65.field1024)] = var22[class277.method1935(arg5 + arg3 - var24 - 1, class65.field1024)] = var8 * var24 / var16;
                        }
                        if (class54.field858 < (var17 + var20)) {
                            int var25 = class54.field858 - var17;
                            class190.method1321(var22, var17, var25, var8);
                            class190.method1321(var22, 0, var20 - var25, var8);
                        } else {
                            class190.method1321(var22, var17, var20, var8);
                        }
                    } else {
                        int var26 = var8 * var23 / var19;
                        if (this.field3312 == 0) {
                            for (int var29 = 0; var29 < var16; var29++) {
                                int var30 = var8 * var29 / var16;
                                var22[class277.method1935(arg3 + var29, class65.field1024)] = var22[class277.method1935(arg5 + arg3 - var29 - 1, class65.field1024)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var16; var27++) {
                                int var28 = var8 * var27 / var16;
                                var22[class277.method1935(class65.field1024, arg3 + var27)] = var22[class277.method1935(arg5 + arg3 - var27 - 1, class65.field1024)] = var28 >= var26 ? var26 : var28;
                            }
                        }
                        if (class54.field858 >= var17 + var20) {
                            class190.method1321(var22, var17, var20, var26);
                        } else {
                            int var31 = class54.field858 - var17;
                            class190.method1321(var22, var17, var31, var26);
                            class190.method1321(var22, 0, var20 - var31, var26);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var19;
                    if (this.field3312 == 0) {
                        for (int var33 = 0; var33 < var16; var33++) {
                            int var34 = var8 * var33 / var16;
                            var22[class277.method1935(class65.field1024, arg3 + var33)] = var22[class277.method1935(arg3 + arg5 - var33 - 1, class65.field1024)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var16; var35++) {
                            int var36 = var8 * var35 / var16;
                            var22[class277.method1935(class65.field1024, arg3 + var35)] = var22[class277.method1935(arg3 + arg5 - (var35 - -1), class65.field1024)] = var36 < var32 ? var36 : var32;
                        }
                    }
                    if (var17 + var20 <= class54.field858) {
                        class190.method1321(var22, var17, var20, var32);
                    } else {
                        int var37 = class54.field858 - var17;
                        class190.method1321(var22, var17, var37, var32);
                        class190.method1321(var22, 0, var20 - var37, var32);
                    }
                }
            }
        } else if ((arg3 + arg5) > class54.field858) {
            int var11 = class54.field858 - arg3;
            for (int var12 = 0; var12 < arg2; var12++) {
                int[] var13 = arg1[arg6 + var12];
                class190.method1321(var13, arg3, var11, var8);
                class190.method1321(var13, 0, arg5 - var11, var8);
            }
        } else {
            for (int var14 = 0; var14 < arg2; var14++) {
                class190.method1321(arg1[arg6 + var14], arg3, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLbc;)V", line = 480)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field3323 = arg2.method1082(-83);
        } else if (arg0 == 1) {
            this.field3311 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field3321 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field3322 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field3310 = arg2.method1090(false);
        } else if (arg0 == 5) {
            this.field3317 = arg2.method1090(false);
        } else if (arg0 == 6) {
            this.field3312 = arg2.method1082(-93);
        } else if (arg0 == 7) {
            this.field3320 = arg2.method1090(false);
        } else if (arg0 == 8) {
            this.field3318 = arg2.method1090(false);
        }
        field3308++;
        if (arg1 != -19) {
            method1359(25, -96L);
        }
    }

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "(I)V", line = 555)
    public static void method1362(int arg0) {
        if (arg0 == 2) {
            field3315 = null;
            field3307 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IB)[I", line = 569)
    public final int[] method80(int arg0, byte arg1) {
        field3325++;
        int var3 = 105 % ((arg1 + 31) / 55);
        int[] var4 = this.field4008.method131((byte) -106, arg0);
        if (!this.field4008.field256) {
            return var4;
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[][] var10 = this.field4008.method134(127);
        boolean var11 = true;
        boolean var12 = true;
        int var13 = 0;
        int var14 = class54.field858 * this.field3311 >> 12;
        int var15 = class54.field858 * this.field3321 >> 12;
        int var16 = 0;
        int var17 = class133.field2294 * this.field3310 >> 12;
        int var18 = class133.field2294 * this.field3322 >> 12;
        if (var17 <= 1) {
            return var10[arg0];
        }
        this.field3313 = class54.field858 / 8 * this.field3317 >> 12;
        int var19 = class54.field858 / var14 + 1;
        int[][] var20 = new int[var19][3];
        int[][] var21 = new int[var19][3];
        Random var22 = new Random((long) this.field3323);
        while (true) {
            while (true) {
                int var23 = class232.method1650(var15 - var14, false, var22) + var14;
                int var24 = class232.method1650(var17 - var18, false, var22) + var18;
                int var25 = var8 + var23;
                if (class54.field858 < var25) {
                    var25 = class54.field858;
                    var23 = class54.field858 - var8;
                }
                int var26;
                if (var11) {
                    var26 = 0;
                } else {
                    int[] var27 = var21[var9];
                    int var28 = var9;
                    var26 = var27[2];
                    int var29 = 0;
                    int var30 = var6 + var25;
                    if (var30 < 0) {
                        var30 += class54.field858;
                    }
                    if (class54.field858 < var30) {
                        var30 -= class54.field858;
                    }
                    while (true) {
                        int[] var31 = var21[var28];
                        if (var31[0] <= var30 && var31[1] >= var30) {
                            if (var9 != var28) {
                                int var32 = var6 + var8;
                                if (var32 < 0) {
                                    var32 += class54.field858;
                                }
                                if (var32 > class54.field858) {
                                    var32 -= class54.field858;
                                }
                                for (int var33 = 1; var33 <= var29; var33++) {
                                    int[] var34 = var21[(var9 + var33) % var13];
                                    var26 = Math.max(var26, var34[2]);
                                }
                                for (int var35 = 0; var35 <= var29; var35++) {
                                    int[] var36 = var21[(var9 + var35) % var13];
                                    int var37 = var36[2];
                                    if (var26 != var37) {
                                        int var38 = var36[0];
                                        int var39 = var36[1];
                                        int var40;
                                        int var41;
                                        if (var32 < var30) {
                                            var40 = Math.max(var32, var38);
                                            var41 = Math.min(var30, var39);
                                        } else if (var38 == 0) {
                                            var41 = Math.min(var30, var39);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var32, var38);
                                            var41 = class54.field858;
                                        }
                                        this.method1361(var22, var10, var26 - var37, var40 - -var7, (byte) -114, var41 - var40, var37);
                                    }
                                }
                            }
                            var9 = var28;
                            break;
                        }
                        var29++;
                        var28++;
                        if (var13 <= var28) {
                            var28 = 0;
                        }
                    }
                }
                if (var24 + var26 <= class133.field2294) {
                    var12 = false;
                } else {
                    var24 = class133.field2294 - var26;
                }
                if (class54.field858 == var25) {
                    this.method1361(var22, var10, var24, var5 + var8, (byte) -114, var23, var26);
                    if (var12) {
                        return var4;
                    }
                    var9 = 0;
                    var11 = false;
                    var12 = true;
                    var7 = var5;
                    int[][] var43 = var21;
                    int[] var44 = var20[var16++];
                    var21 = var20;
                    var44[1] = var25;
                    var20 = var43;
                    var44[0] = var8;
                    var13 = var16;
                    var8 = 0;
                    var16 = 0;
                    var44[2] = var26 + var24;
                    var5 = class232.method1650(class54.field858, false, var22);
                    var6 = var5 - var7;
                    int var45 = var6;
                    if (var6 < 0) {
                        var45 = class54.field858 + var6;
                    }
                    if (class54.field858 < var45) {
                        var45 -= class54.field858;
                    }
                    while (true) {
                        int[] var46 = var21[var9];
                        if (var45 >= var46[0] && var46[1] >= var45) {
                            break;
                        }
                        int var10000 = ~var13;
                        var9++;
                        if (var10000 >= ~var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var42 = var20[var16++];
                    var42[2] = var24 + var26;
                    var42[1] = var25;
                    var42[0] = var8;
                    this.method1361(var22, var10, var24, var8 + var5, (byte) -114, var23, var26);
                    var8 = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V", line = 825)
    public final void method144(int arg0) {
        field3324++;
        if (arg0 <= 48) {
            this.field3322 = 13;
        }
    }
}
