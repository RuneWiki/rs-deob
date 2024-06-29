import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class151 extends class195 {

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    private int field2400 = 1024;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "I")
    private int field2401 = 0;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    private int field2402 = 1024;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    private int field2393 = 409;

    @OriginalMember(owner = "client!ji", name = "qb", descriptor = "I")
    private int field2413 = 0;

    @OriginalMember(owner = "client!ji", name = "pb", descriptor = "I")
    private int field2412 = 819;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    private int field2395 = 1024;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "I")
    private int field2408 = 2048;

    @OriginalMember(owner = "client!ji", name = "tb", descriptor = "I")
    private int field2416 = 1024;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Lck;")
    public static class119 field2394 = class298.method1987((byte) 122, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!ji", name = "nb", descriptor = "Lck;")
    private static class119 field2410 = class298.method1987((byte) 106, "wishes to trade with you)3");

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "[I")
    public static int[] field2392 = new int[100];

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
    public static int field2399 = 0;

    @OriginalMember(owner = "client!ji", name = "sb", descriptor = "Lck;")
    public static class119 field2415 = class298.method1987((byte) 84, "zap");

    @OriginalMember(owner = "client!ji", name = "ub", descriptor = "Lck;")
    public static class119 field2417 = class298.method1987((byte) 116, " )2> <col=ffff00>");

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Lck;")
    public static class119 field2396 = field2410;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "I")
    private int field2404;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ji", name = "mb", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!ji", name = "ob", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ji", name = "rb", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(Z)V", line = 6)
    public static void method971(boolean arg0) {
        field2417 = null;
        field2394 = null;
        field2396 = null;
        if (arg0) {
            field2409 = 98;
        }
        field2415 = null;
        field2392 = null;
        field2410 = null;
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(Z)V", line = 22)
    public static final void method972(boolean arg0) {
        class227.field3632.method486((byte) 93);
        field2406++;
        if (arg0) {
            field2398 = -22;
        }
        class174.field2787.method486((byte) 93);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lfj;II)V", line = 41)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field2407++;
        if (arg2 == 0) {
            this.field2413 = arg0.method64((byte) 84);
        } else if (arg2 == 1) {
            this.field2416 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field2408 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field2393 = arg0.method63((byte) 1);
        } else if (arg2 == 4) {
            this.field2412 = arg0.method63((byte) 1);
        } else if (arg2 == 5) {
            this.field2402 = arg0.method63((byte) 1);
        } else if (arg2 == 6) {
            this.field2401 = arg0.method64((byte) 19);
        } else if (arg2 == 7) {
            this.field2400 = arg0.method63((byte) 1);
        } else if (arg2 == 8) {
            this.field2395 = arg0.method63((byte) 1);
        }
        if (arg1 > -117) {
            field2410 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 133)
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[[IBLjava/util/Random;II)V", line = 151)
    private final void method973(int arg0, int arg1, int[][] arg2, byte arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field2395 <= 0 ? 4096 : 4096 - class44.method342(this.field2395, arg4, 0);
        field2403++;
        int var9 = this.field2404 * this.field2400 >> 12;
        if (arg3 > -118) {
            return;
        }
        int var10 = this.field2404 - (var9 <= 0 ? 0 : class44.method342(var9, arg4, 0));
        if (arg6 >= class157.field2504) {
            arg6 -= class157.field2504;
        }
        if (var10 > 0) {
            if (arg5 <= 0 || arg1 <= 0) {
                return;
            }
            int var15 = arg1 / 2;
            int var16 = var15 < var10 ? var15 : var10;
            int var17 = arg6 + var16;
            int var18 = arg1 - (var16 * 2);
            int var19 = arg5 / 2;
            int var20 = var10 <= var19 ? var10 : var19;
            for (int var21 = 0; var21 < arg5; var21++) {
                int[] var22 = arg2[arg0 + var21];
                if (var20 <= var21) {
                    int var23 = arg5 - var21 - 1;
                    if (var23 < var20) {
                        int var24 = var8 * var23 / var20;
                        if (this.field2401 == 0) {
                            for (int var27 = 0; var27 < var16; var27++) {
                                int var28 = var8 * var27 / var16;
                                var22[class19.method151(arg6 + var27, class254.field4088)] = var22[class19.method151(arg6 + arg1 - var27 - 1, class254.field4088)] = var24 * var28 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var16; var25++) {
                                int var26 = var8 * var25 / var16;
                                var22[class19.method151(class254.field4088, arg6 + var25)] = var22[class19.method151(arg1 + arg6 - var25 - 1, class254.field4088)] = var24 <= var26 ? var24 : var26;
                            }
                        }
                        if (class157.field2504 < (var17 + var18)) {
                            int var29 = class157.field2504 - var17;
                            class213.method1340(var22, var17, var29, var24);
                            class213.method1340(var22, 0, var18 - var29, var24);
                        } else {
                            class213.method1340(var22, var17, var18, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var16; var30++) {
                            var22[class19.method151(class254.field4088, arg6 + var30)] = var22[class19.method151(arg6 + arg1 - var30 - 1, class254.field4088)] = var8 * var30 / var16;
                        }
                        if (class157.field2504 < var17 + var18) {
                            int var31 = class157.field2504 - var17;
                            class213.method1340(var22, var17, var31, var8);
                            class213.method1340(var22, 0, var18 - var31, var8);
                        } else {
                            class213.method1340(var22, var17, var18, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var20;
                    if (this.field2401 == 0) {
                        for (int var35 = 0; var35 < var16; var35++) {
                            int var36 = var8 * var35 / var16;
                            var22[class19.method151(arg6 + var35, class254.field4088)] = var22[class19.method151(arg1 + arg6 - var35 - 1, class254.field4088)] = var32 * var36 >> 12;
                        }
                    } else {
                        for (int var33 = 0; var33 < var16; var33++) {
                            int var34 = var8 * var33 / var16;
                            var22[class19.method151(class254.field4088, arg6 + var33)] = var22[class19.method151(class254.field4088, arg1 + arg6 - (var33 + 1))] = var32 > var34 ? var34 : var32;
                        }
                    }
                    if (var17 + var18 <= class157.field2504) {
                        class213.method1340(var22, var17, var18, var32);
                    } else {
                        int var37 = class157.field2504 - var17;
                        class213.method1340(var22, var17, var37, var32);
                        class213.method1340(var22, 0, var18 - var37, var32);
                    }
                }
            }
        } else if ((arg1 + arg6) <= class157.field2504) {
            for (int var11 = 0; var11 < arg5; var11++) {
                class213.method1340(arg2[arg0 + var11], arg6, arg1, var8);
            }
        } else {
            int var12 = class157.field2504 - arg6;
            for (int var13 = 0; var13 < arg5; var13++) {
                int[] var14 = arg2[arg0 + var13];
                class213.method1340(var14, arg6, var12, var8);
                class213.method1340(var14, 0, arg1 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(BI)I", line = 346)
    public static final int method974(byte arg0, int arg1) {
        if (arg0 == -67) {
            field2397++;
            return arg1 & 0xFF;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V", line = 366)
    public final void method14(int arg0) {
        field2411++;
        if (arg0 != 2048879374) {
            this.method11(98, true);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)[I", line = 379)
    public final int[] method11(int arg0, boolean arg1) {
        field2405++;
        int[] var3 = this.field3106.method924(100, arg0);
        if (this.field3106.field2260) {
            int[][] var4 = this.field3106.method920((byte) -93);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class157.field2504 * this.field2416 >> 12;
            int var15 = class157.field2504 * this.field2408 >> 12;
            int var16 = class227.field3621 * this.field2393 >> 12;
            int var17 = class227.field3621 * this.field2412 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            int var18 = class157.field2504 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            this.field2404 = class157.field2504 / 8 * this.field2402 >> 12;
            Random var21 = new Random((long) this.field2413);
            label131: while (true) {
                while (true) {
                    int var22 = var14 + class44.method342(var15 - var14, var21, 0);
                    int var23 = var16 + class44.method342(var17 - var16, var21, 0);
                    int var24 = var8 + var22;
                    if (class157.field2504 < var24) {
                        var22 = class157.field2504 - var8;
                        var24 = class157.field2504;
                    }
                    int var25;
                    if (var10) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        var25 = var27[2];
                        int var29 = var5 + var24;
                        if (var29 < 0) {
                            var29 += class157.field2504;
                        }
                        if (class157.field2504 < var29) {
                            var29 -= class157.field2504;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var29 >= var30[0] && var29 <= var30[1]) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class157.field2504;
                                    }
                                    if (var31 > class157.field2504) {
                                        var31 -= class157.field2504;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var9 + var32) % var11];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var9 + var34) % var11];
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
                                                var39 = class157.field2504;
                                            }
                                            this.method973(var36, var39 - var40, var4, (byte) -126, var21, var25 - var36, var7 + var40);
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
                    if (var23 + var25 > class227.field3621) {
                        var23 = class227.field3621 - var25;
                    } else {
                        var13 = false;
                    }
                    if (class157.field2504 == var24) {
                        this.method973(var25, var22, var4, (byte) -123, var21, var23, var6 + var8);
                        if (var13) {
                            break label131;
                        }
                        var9 = 0;
                        var7 = var6;
                        int[][] var41 = var20;
                        var13 = true;
                        var10 = false;
                        var20 = var19;
                        int[] var42 = var19[var12++];
                        var42[1] = var24;
                        var42[0] = var8;
                        var11 = var12;
                        var8 = 0;
                        var12 = 0;
                        var19 = var41;
                        var42[2] = var25 + var23;
                        var6 = class44.method342(class157.field2504, var21, 0);
                        var5 = var6 - var7;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class157.field2504 + var5;
                        }
                        if (var43 > class157.field2504) {
                            var43 -= class157.field2504;
                        }
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            var9++;
                            if (var11 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var12++];
                        var45[1] = var24;
                        var45[0] = var8;
                        var45[2] = var23 + var25;
                        this.method973(var25, var22, var4, (byte) -128, var21, var23, var6 + var8);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1) {
            this.method14(52);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;", line = 631)
    public static final Object method975(byte arg0, boolean arg1, byte[] arg2) {
        field2391++;
        if (arg0 != -57) {
            field2417 = (class119) null;
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class183.field2903) {
            try {
                class245 var3 = (class245) Class.forName("wh").getDeclaredConstructor().newInstance();
                var3.method1179(arg2, -53);
                return var3;
            } catch (Throwable var5) {
                class183.field2903 = true;
            }
        }
        return arg1 ? class254.method1636(arg2, (byte) 71) : arg2;
    }
}
