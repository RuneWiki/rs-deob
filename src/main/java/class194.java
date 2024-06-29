import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class194 extends class112 {

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "I")
    private int field3084 = 1024;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private int field3091 = 2048;

    @OriginalMember(owner = "client!rl", name = "fb", descriptor = "I")
    private int field3104 = 0;

    @OriginalMember(owner = "client!rl", name = "hb", descriptor = "I")
    private int field3106 = 409;

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "I")
    private int field3103 = 0;

    @OriginalMember(owner = "client!rl", name = "mb", descriptor = "I")
    private int field3111 = 819;

    @OriginalMember(owner = "client!rl", name = "kb", descriptor = "I")
    private int field3109 = 1024;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    private int field3089 = 1024;

    @OriginalMember(owner = "client!rl", name = "nb", descriptor = "I")
    private int field3112 = 1024;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "[Ljh;")
    public static class268[] field3094 = new class268[4];

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "[I")
    public static int[] field3100 = new int[32];

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "Lwm;")
    public static class152 field3101 = class157.method1048("welle2:", 126);

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "Lwm;")
    public static class152 field3090 = class157.method1048("(Udns", 124);

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "Lwm;")
    public static class152 field3097 = class157.method1048("ul", 95);

    @OriginalMember(owner = "client!rl", name = "gb", descriptor = "Lwm;")
    public static class152 field3105 = class157.method1048("Shift)2click disabled)3", 99);

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "Lne;")
    public static class235 field3087 = new class235(50);

    @OriginalMember(owner = "client!rl", name = "pb", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!rl", name = "ib", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!rl", name = "jb", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!rl", name = "lb", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!rl", name = "ob", descriptor = "I")
    private int field3113;

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "Lah;")
    public static class205 field3096;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "Lee;")
    public static class279 field3086;

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "[[[Lkb;")
    public static class34[][][] field3102;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(III)I", line = 5)
    public static final int method1297(int arg0, int arg1, int arg2) {
        field3088++;
        int var3 = 1;
        if (arg2 != 21151) {
            field3098 = 72;
        }
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILhi;)V", line = 38)
    public static final void method1298(int arg0, class291 arg1) {
        field3108++;
        if (arg0 != -63) {
            field3090 = (class152) null;
        }
        while (true) {
            while (arg1.field4946 < arg1.field4950.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method2011(arg0 ^ 0x6A) == 1) {
                    var2 = true;
                    var3 = arg1.method2011(-64);
                    var4 = arg1.method2011(-87);
                }
                int var5 = arg1.method2011(-112);
                int var6 = arg1.method2011(-92);
                int var7 = class197.field3160 + class26.field446 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class252.field4335;
                if (var8 >= 0 && (var7 - 63) >= 0 && var8 + 63 < class239.field3921 && var7 < class26.field446) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var3 * 8) <= var11 && (var3 * 8 + 8) > var11 && (var4 * 8) <= var12 && var4 * 8 + 8 > var12) {
                                byte var13 = arg1.method1962(false);
                                if (var13 != 0) {
                                    if (class69.field1005[var9][var10] == null) {
                                        class69.field1005[var9][var10] = new byte[4096];
                                    }
                                    class69.field1005[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1962(false);
                                    if (class156.field2487[var9][var10] == null) {
                                        class156.field2487[var9][var10] = new byte[4096];
                                    }
                                    class156.field2487[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1962(false);
                        if (var16 != 0) {
                            arg1.field4946++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 963)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)V", line = 152)
    public static final void method1299(int arg0, byte arg1) {
        field3092++;
        class160.field2556--;
        if (class160.field2556 == arg0) {
            return;
        }
        class187.method1244(class123.field1734, arg0 + 1, class123.field1734, arg0, class160.field2556 - arg0);
        class187.method1244(class55.field864, arg0 + 1, class55.field864, arg0, class160.field2556 - arg0);
        if (arg1 <= 15) {
            field3094 = (class268[]) null;
        }
        class187.method1247(class83.field1156, arg0 + 1, class83.field1156, arg0, class160.field2556 - arg0);
        class187.method1248(class273.field4688, arg0 + 1, class273.field4688, arg0, class160.field2556 - arg0);
        class187.method1250(class208.field3391, arg0 + 1, class208.field3391, arg0, class160.field2556 - arg0);
        class187.method1247(class26.field445, arg0 + 1, class26.field445, arg0, class160.field2556 - arg0);
        class187.method1247(class64.field955, arg0 + 1, class64.field955, arg0, class160.field2556 - arg0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lfe;IIII)V", line = 174)
    public static final void method1300(class242 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3095++;
        if (class160.field2556 >= 400) {
            return;
        }
        if (arg0.field4011 != null) {
            arg0 = arg0.method1650(4);
        }
        if (arg0 == null || !arg0.field4005) {
            return;
        }
        class152 var5 = arg0.field4018;
        if (arg2 != 0) {
            method1300((class242) null, -9, -82, -43, -66);
        }
        if (arg0.field3979 != 0) {
            class152 var6 = class256.field4410 == 1 ? class18.field257 : class191.field3010;
            var5 = class195.method1307(new class152[] { var5, class91.method599((byte) -90, class85.field1176.field179, arg0.field3979), class74.field1071, var6, class38.method280(arg2 + 74, arg0.field3979), class131.field2000 }, (byte) 29);
        }
        if (class268.field4527 == 1) {
            class288.field4876++;
            class146.method915(arg2 - 105, (short) 60, class241.field3944, arg3, class195.method1307(new class152[] { class141.field2142, class73.field1065, var5 }, (byte) 29), (long) arg4, arg1, class147.field2260);
        } else if (class125.field1762) {
            class45 var14 = class324.field5660 == -1 ? null : class162.method1088(class324.field5660, (byte) 122);
            if ((class239.field3926 & 0x2) != 0 && (var14 == null || arg0.method1649(var14.field720, class324.field5660, 12169) != var14.field720)) {
                class325.field5663++;
                class146.method915(55, (short) 25, class208.field3393, arg3, class195.method1307(new class152[] { class279.field4775, class73.field1065, var5 }, (byte) 29), (long) arg4, arg1, class62.field942);
            }
        } else {
            class306.field5268++;
            class152[] var7 = arg0.field3970;
            if (class256.field4418) {
                var7 = class85.method557(var7, false);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class256.field4410 != 0 || !var7[var8].method995(arg2 ^ 0xFFFFFF96, class174.field2789))) {
                        class205.field3317++;
                        int var9 = -1;
                        byte var10 = 0;
                        if (var8 == 0) {
                            var10 = 28;
                        }
                        if (arg0.field3977 == var8) {
                            var9 = arg0.field3985;
                        }
                        if (arg0.field3956 == var8) {
                            var9 = arg0.field4003;
                        }
                        if (var8 == 1) {
                            var10 = 45;
                        }
                        if (var8 == 2) {
                            var10 = 17;
                        }
                        if (var8 == 3) {
                            var10 = 26;
                        }
                        if (var8 == 4) {
                            var10 = 42;
                        }
                        class146.method915(-107, var10, var9, arg3, class195.method1307(new class152[] { class324.field5654, var5 }, (byte) 29), (long) arg4, arg1, var7[var8]);
                    }
                }
            }
            if (class256.field4410 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].method995(-73, class174.field2789)) {
                        short var12 = 0;
                        if (var11 == 0) {
                            var12 = 28;
                        }
                        class149.field2319++;
                        if (var11 == 1) {
                            var12 = 45;
                        }
                        if (var11 == 2) {
                            var12 = 17;
                        }
                        short var13 = 0;
                        if (arg0.field3979 > class85.field1176.field179) {
                            var13 = 2000;
                        }
                        if (var11 == 3) {
                            var12 = 26;
                        }
                        if (var11 == 4) {
                            var12 = 42;
                        }
                        if (var12 != 0) {
                            var12 += var13;
                        }
                        class146.method915(arg2 + 103, var12, arg0.field4002, arg3, class195.method1307(new class152[] { class324.field5654, var5 }, (byte) 29), (long) arg4, arg1, var7[var11]);
                    }
                }
            }
            class146.method915(-90, (short) 1001, class127.field1799, arg3, class195.method1307(new class152[] { class324.field5654, var5 }, (byte) 29), (long) arg4, arg1, class86.field1204);
        }
    }

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V", line = 361)
    public static void method1301(int arg0) {
        field3094 = null;
        field3096 = null;
        field3100 = null;
        field3086 = null;
        field3102 = (class34[][][]) null;
        field3087 = null;
        field3090 = null;
        field3097 = null;
        field3105 = null;
        if (arg0 >= 64) {
            field3101 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V", line = 382)
    public final void method673(int arg0) {
        field3085++;
        if (arg0 != 8) {
            this.method52(-83, -35, (class291) null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)[I", line = 394)
    public final int[] method53(byte arg0, int arg1) {
        field3110++;
        if (arg0 != -3) {
            field3105 = (class152) null;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 115);
        if (!this.field1585.field4935) {
            return var3;
        }
        int[][] var4 = this.field1585.method1953((byte) -66);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = true;
        int var12 = 0;
        int var13 = 0;
        int var14 = class58.field889 * this.field3084 >> 12;
        int var15 = class58.field889 * this.field3091 >> 12;
        int var16 = class268.field4526 * this.field3106 >> 12;
        int var17 = class268.field4526 * this.field3111 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field3113 = class58.field889 / 8 * this.field3112 >> 12;
        int var18 = class58.field889 / var14 + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field3104);
        while (true) {
            while (true) {
                int var22 = class137.method870(var21, var15 - var14, (byte) -112) + var14;
                int var23 = class137.method870(var21, var17 - var16, (byte) -112) + var16;
                int var24 = var8 + var22;
                if (class58.field889 < var24) {
                    var22 = class58.field889 - var8;
                    var24 = class58.field889;
                }
                int var25;
                if (var11) {
                    var25 = 0;
                } else {
                    int var26 = var10;
                    int[] var27 = var20[var10];
                    var25 = var27[2];
                    int var28 = 0;
                    int var29 = var24 + var5;
                    if (var29 < 0) {
                        var29 += class58.field889;
                    }
                    if (var29 > class58.field889) {
                        var29 -= class58.field889;
                    }
                    while (true) {
                        int[] var30 = var20[var26];
                        if (var29 >= var30[0] && var29 <= var30[1]) {
                            if (var10 != var26) {
                                int var31 = var8 + var5;
                                if (var31 < 0) {
                                    var31 += class58.field889;
                                }
                                if (var31 > class58.field889) {
                                    var31 -= class58.field889;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var20[(var10 + var32) % var12];
                                    var25 = Math.max(var25, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var20[(var10 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var25 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var40 = Math.max(var31, var37);
                                            var39 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = Math.min(var29, var38);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var31, var37);
                                            var39 = class58.field889;
                                        }
                                        this.method1302(var4, var36, var6 + var40, (byte) 57, var21, var25 - var36, -var40 + var39);
                                    }
                                }
                            }
                            var10 = var26;
                            break;
                        }
                        var26++;
                        if (var26 >= var12) {
                            var26 = 0;
                        }
                        var28++;
                    }
                }
                if (class268.field4526 >= var23 + var25) {
                    var9 = false;
                } else {
                    var23 = class268.field4526 - var25;
                }
                if (class58.field889 == var24) {
                    this.method1302(var4, var25, var7 + var8, (byte) 57, var21, var23, var22);
                    if (var9) {
                        return var3;
                    }
                    var9 = true;
                    var10 = 0;
                    var6 = var7;
                    int[] var42 = var19[var13++];
                    var11 = false;
                    var12 = var13;
                    var42[1] = var24;
                    int[][] var43 = var20;
                    var13 = 0;
                    var42[2] = var23 + var25;
                    var42[0] = var8;
                    var7 = class137.method870(var21, class58.field889, (byte) -112);
                    var20 = var19;
                    var19 = var43;
                    var5 = var7 - var6;
                    var8 = 0;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class58.field889 + var5;
                    }
                    if (class58.field889 < var44) {
                        var44 -= class58.field889;
                    }
                    while (true) {
                        int[] var45 = var20[var10];
                        if (var45[0] <= var44 && var45[1] >= var44) {
                            break;
                        }
                        var10++;
                        if (var10 >= var12) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var41 = var19[var13++];
                    var41[0] = var8;
                    var41[1] = var24;
                    var41[2] = var23 + var25;
                    this.method1302(var4, var25, var7 + var8, (byte) 57, var21, var23, var22);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILhi;)V", line = 662)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field3099++;
        if (arg0 != 31164) {
            method1298(27, (class291) null);
        }
        if (arg1 == 0) {
            this.field3104 = arg2.method2011(-101);
        } else if (arg1 == 1) {
            this.field3084 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field3091 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field3106 = arg2.method2021((byte) 74);
        } else if (arg1 == 4) {
            this.field3111 = arg2.method2021((byte) 74);
        } else if (arg1 == 5) {
            this.field3112 = arg2.method2021((byte) 74);
        } else if (arg1 == 6) {
            this.field3103 = arg2.method2011(-50);
        } else if (arg1 == 7) {
            this.field3089 = arg2.method2021((byte) 74);
        } else if (arg1 == 8) {
            this.field3109 = arg2.method2021((byte) 74);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([[IIIBLjava/util/Random;II)V", line = 771)
    private final void method1302(int[][] arg0, int arg1, int arg2, byte arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field3109 <= 0 ? 4096 : 4096 - class137.method870(arg4, this.field3109, (byte) -112);
        field3107++;
        int var9 = this.field3113 * this.field3089 >> 12;
        int var10 = this.field3113 - (var9 > 0 ? class137.method870(arg4, var9, (byte) -112) : 0);
        if (class58.field889 <= arg2) {
            arg2 -= class58.field889;
        }
        if (arg3 != 57) {
            return;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = arg5 / 2;
            int var13 = var11 >= var10 ? var10 : var11;
            int var14 = arg2 + var13;
            int var15 = var10 > var12 ? var12 : var10;
            int var16 = arg6 - (var13 * 2);
            for (int var17 = 0; var17 < arg5; var17++) {
                int[] var18 = arg0[arg1 + var17];
                if (var17 < var15) {
                    int var19 = var8 * var17 / var15;
                    if (this.field3103 == 0) {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class34.method251(class251.field4304, arg2 + var22)] = var18[class34.method251(class251.field4304, arg2 + arg6 - var22 - 1)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class34.method251(class251.field4304, arg2 + var20)] = var18[class34.method251(arg2 + arg6 - var20 - 1, class251.field4304)] = var19 > var21 ? var21 : var19;
                        }
                    }
                    if (class58.field889 >= var14 + var16) {
                        class187.method1245(var18, var14, var16, var19);
                    } else {
                        int var24 = class58.field889 - var14;
                        class187.method1245(var18, var14, var24, var19);
                        class187.method1245(var18, 0, var16 - var24, var19);
                    }
                } else {
                    int var25 = arg5 - var17 - 1;
                    if (var15 > var25) {
                        int var26 = var8 * var25 / var15;
                        if (this.field3103 == 0) {
                            for (int var27 = 0; var27 < var13; var27++) {
                                int var28 = var8 * var27 / var13;
                                var18[class34.method251(class251.field4304, arg2 + var27)] = var18[class34.method251(class251.field4304, arg6 + arg2 - var27 - 1)] = var26 * var28 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class34.method251(arg2 + var29, class251.field4304)] = var18[class34.method251(arg2 - (var29 + 1 - arg6), class251.field4304)] = var30 < var26 ? var30 : var26;
                            }
                        }
                        if (var14 + var16 > class58.field889) {
                            int var31 = class58.field889 - var14;
                            class187.method1245(var18, var14, var31, var26);
                            class187.method1245(var18, 0, var16 - var31, var26);
                        } else {
                            class187.method1245(var18, var14, var16, var26);
                        }
                    } else {
                        for (int var32 = 0; var32 < var13; var32++) {
                            var18[class34.method251(arg2 + var32, class251.field4304)] = var18[class34.method251(class251.field4304, arg2 - (var32 - arg6) - 1)] = var8 * var32 / var13;
                        }
                        if (var14 + var16 <= class58.field889) {
                            class187.method1245(var18, var14, var16, var8);
                        } else {
                            int var33 = class58.field889 - var14;
                            class187.method1245(var18, var14, var33, var8);
                            class187.method1245(var18, 0, var16 - var33, var8);
                        }
                    }
                }
            }
        } else if ((arg2 + arg6) <= class58.field889) {
            for (int var34 = 0; var34 < arg5; var34++) {
                class187.method1245(arg0[arg1 + var34], arg2, arg6, var8);
            }
        } else {
            int var35 = class58.field889 - arg2;
            for (int var36 = 0; var36 < arg5; var36++) {
                int[] var37 = arg0[arg1 + var36];
                class187.method1245(var37, arg2, var35, var8);
                class187.method1245(var37, 0, arg6 - var35, var8);
            }
        }
    }
}
