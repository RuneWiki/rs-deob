import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class669 extends class687 {

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    private int field9427;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field9441 = new String[] { method4824(method4823("W\f%g\u0012")), method4824(method4823("W\f%e\u0012")), method4824(method4823("\u000f\u001bdO\u0007\u0003HmE\\UF")), method4824(method4823("HV%\rG")), method4824(method4823("]\rgO")), method4824(method4823("\u0013U5")), method4824(method4823("\u0013U5\u0003\u0006P\u0017g\u001e\\UA;\u0017\n\r")), method4824(method4823("\u000f\u001bdO\u0007U\u001e2\u0013\u000e\u0003F")), method4824(method4823("\u0013U5\u0003\u0006P\u0017g\u001e\n\u0003\u001emE\\\r")), method4824(method4823("W\f%a\u0012")), method4824(method4823("W\f%k\u0012")), method4824(method4823("W\f%b\u0012")), method4824(method4823("W\f%i\u0012")), method4824(method4823("W\f%`\u0012")), method4824(method4823("W\f%\u001fS]\u0011\u007f\u001d\u0012")), method4824(method4823("W\f%d\u0012")), method4824(method4823("W\f%j\u0012")), method4824(method4823("W\f%f\u0012")) };

    @OriginalMember(owner = "client!dt", name = "D", descriptor = "Lsb;")
    public static class261 field9425 = new class261(132, 0);

    @OriginalMember(owner = "client!dt", name = "y", descriptor = "Z")
    public static boolean field9440 = true;

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "Z")
    public static boolean field9439 = false;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public static int field9431;

    @OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
    public static int field9433;

    @OriginalMember(owner = "client!dt", name = "A", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!dt", name = "w", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
    public static int field9436;

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
    public static int field9437;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field9438;

    @OriginalMember(owner = "client!dt", name = "F", descriptor = "[Lpv;")
    public class284[] field9432;

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "[[B")
    private byte[][] field9428;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V", line = 3)
    public static void method4813(int arg0) {
        try {
            field9425 = null;
            if (arg0 != 47) {
                method4813(84);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9441[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I[ILqo;[I[I)V", line = 14)
    public static final void method4814(int arg0, int[] arg1, class170 arg2, int[] arg3, int[] arg4) {
        try {
            field9430++;
            for (int var5 = 0; var5 < arg1.length; var5++) {
                int var6 = arg1[var5];
                int var7 = arg4[var5];
                int var8 = arg3[var5];
                int var9 = 0;
                while (var7 != 0 && var9 < arg2.field2248.length) {
                    if ((var7 & 0x1) != 0) {
                        if (var6 == -1) {
                            arg2.field2248[var9] = null;
                        } else {
                            class437 var10 = class10.field132.method1889(var6, true);
                            int var11 = var10.field6439;
                            class550 var12 = arg2.field2248[var9];
                            if (var12 != null && var12.method835(false)) {
                                if (var12.method837(-86) == var6) {
                                    if (var11 == 0) {
                                        var12 = arg2.field2248[var9] = null;
                                    } else if (var11 == 1) {
                                        var12.method827(arg0 - 11406);
                                        var12.field8034 = var8;
                                    } else if (var11 == 2) {
                                        var12.method839(arg0 ^ 0xFFFFFAF2);
                                    }
                                } else if (var10.field6442 >= var12.method846(12763).field6442) {
                                    var12 = arg2.field2248[var9] = null;
                                }
                            }
                            if (var12 == null || !var12.method835(false)) {
                                class550 var13 = arg2.field2248[var9] = new class550(arg2);
                                var13.method840(var6, false);
                                var13.field8034 = var8;
                            }
                        }
                    }
                    var9++;
                    var7 >>>= 0x1;
                }
            }
            if (arg0 != 11301) {
                field9439 = true;
            }
        } catch (RuntimeException var15) {
            throw class665.method4799(var15, field9441[15] + arg0 + ',' + (arg1 == null ? field9441[4] : field9441[3]) + ',' + (arg2 == null ? field9441[4] : field9441[3]) + ',' + (arg3 == null ? field9441[4] : field9441[3]) + ',' + (arg4 == null ? field9441[4] : field9441[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIIIIIIIII)V", line = 98)
    public static final void method4815(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field9431++;
            if (arg3 == arg8 && arg1 == arg9 && arg2 == arg5 && arg6 == arg7) {
                class127.method1128(arg6, -1, arg3, arg9, arg2, arg4);
            } else {
                int var10 = arg3;
                int var11 = arg9;
                int var12 = arg3 * 3;
                int var13 = arg9 * 3;
                int var14 = arg8 * 3;
                int var15 = arg1 * 3;
                int var16 = arg5 * 3;
                int var17 = arg7 * 3;
                int var18 = arg2 + var14 - arg3 - var16;
                int var19 = arg6 + var15 - arg9 - var17;
                int var20 = var16 - var14 - (-var12 + var14);
                int var21 = var17 + var13 - var15 - var15;
                int var22 = var14 - var12;
                int var23 = var15 - var13;
                for (int var24 = 128; var24 <= 4096; var24 += 128) {
                    int var25 = var24 * var24 >> 12;
                    int var26 = var24 * var25 >> 12;
                    int var27 = var18 * var26;
                    int var28 = var19 * var26;
                    int var29 = var20 * var25;
                    int var30 = var21 * var25;
                    int var31 = var22 * var24;
                    int var32 = var23 * var24;
                    int var33 = (var27 + var29 + var31 >> 12) + arg3;
                    int var34 = (var28 + var30 + var32 >> 12) + arg9;
                    class127.method1128(var34, -1, var10, var11, var33, arg4);
                    var10 = var33;
                    var11 = var34;
                }
            }
            if (!arg0) {
                method4813(-95);
            }
        } catch (RuntimeException var36) {
            throw class665.method4799(var36, field9441[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)I", line = 176)
    public static final int method4816(int arg0, String arg1, byte arg2, String arg3) {
        try {
            field9426++;
            int var4 = arg1.length();
            int var5 = arg3.length();
            int var6 = 0;
            int var7 = 0;
            char var8 = 0;
            char var9 = 0;
            while (var6 - var8 < var4 || var7 - var9 < var5) {
                if (var6 - var8 >= var4) {
                    return -1;
                }
                if (var5 <= var7 - var9) {
                    return 1;
                }
                char var10;
                if (var8 == '\u0000') {
                    var10 = arg1.charAt(var6++);
                } else {
                    var10 = var8;
                    boolean var11 = false;
                }
                char var12;
                if (var9 == '\u0000') {
                    var12 = arg3.charAt(var7++);
                } else {
                    var12 = var9;
                    boolean var13 = false;
                }
                var8 = class789.method5696(var10, 69);
                var9 = class789.method5696(var12, 69);
                char var14 = class791.method5703(var10, (byte) 71, arg0);
                char var15 = class791.method5703(var12, (byte) 71, arg0);
                if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                    char var16 = Character.toLowerCase(var14);
                    char var17 = Character.toLowerCase(var15);
                    if (var16 != var17) {
                        return class130.method1144(var16, (byte) -92, arg0) - class130.method1144(var17, (byte) -89, arg0);
                    }
                }
            }
            int var18 = Math.min(var4, var5);
            if (arg2 <= 98) {
                method4817(121, (byte) -110, -64);
            }
            for (int var19 = 0; var19 < var18; var19++) {
                int var20;
                int var21;
                if (arg0 == 2) {
                    var20 = var4 - var19 - 1;
                    var21 = var5 - var19 - 1;
                } else {
                    var21 = var19;
                    var20 = var19;
                }
                char var22 = arg1.charAt(var20);
                char var23 = arg3.charAt(var21);
                if (var22 != var23 && Character.toUpperCase(var22) != Character.toUpperCase(var23)) {
                    char var24 = Character.toLowerCase(var22);
                    char var25 = Character.toLowerCase(var23);
                    if (var24 != var25) {
                        return class130.method1144(var24, (byte) -100, arg0) - class130.method1144(var25, (byte) -124, arg0);
                    }
                }
            }
            int var26 = var4 - var5;
            if (var26 != 0) {
                return var26;
            }
            for (int var27 = 0; var27 < var18; var27++) {
                char var28 = arg1.charAt(var27);
                char var29 = arg3.charAt(var27);
                if (var28 != var29) {
                    return class130.method1144(var28, (byte) -95, arg0) - class130.method1144(var29, (byte) -83, arg0);
                }
            }
            return 0;
        } catch (RuntimeException var31) {
            throw class665.method4799(var31, field9441[16] + arg0 + ',' + (arg1 == null ? field9441[4] : field9441[3]) + ',' + arg2 + ',' + (arg3 == null ? field9441[4] : field9441[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IBI)Z", line = 299)
    public static final boolean method4817(int arg0, byte arg1, int arg2) {
        try {
            field9436++;
            if (arg1 <= 108) {
                method4814(-43, null, null, null, null);
            }
            return (class168.method1412(arg0, arg2, false) | class560.method4187(arg2, -1264, arg0) | class605.method4471(arg2, arg0, (byte) -93)) & class496.method3818(arg2, -117, arg0);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9441[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "(I)Z", line = 314)
    public final boolean method4818(int arg0) {
        try {
            field9433++;
            if (this.field9432 != null) {
                return true;
            }
            if (this.field9428 == null) {
                class47 var2 = class347.field5042;
                synchronized (class347.field5042) {
                    if (!class347.field5042.method515(this.field9427, -1)) {
                        return false;
                    }
                    int[] var4 = class347.field5042.method531(arg0 - 24705, this.field9427);
                    this.field9428 = new byte[var4.length][];
                    for (int var5 = 0; var5 < var4.length; var5++) {
                        this.field9428[var5] = class347.field5042.method512(var4[var5], this.field9427, (byte) -69);
                    }
                }
            }
            boolean var6 = true;
            for (int var7 = arg0; var7 < this.field9428.length; var7++) {
                byte[] var8 = this.field9428[var7];
                class711 var9 = new class711(var8);
                var9.field9945 = 1;
                int var10 = var9.method5116((byte) -123);
                class47 var11 = class717.field10209;
                synchronized (class717.field10209) {
                    var6 &= class717.field10209.method530(false, var10);
                }
            }
            if (!var6) {
                return false;
            }
            class524 var12 = new class524();
            class47 var13 = class347.field5042;
            int[] var15;
            synchronized (class347.field5042) {
                int var14 = class347.field5042.method509(true, this.field9427);
                this.field9432 = new class284[var14];
                var15 = class347.field5042.method531(arg0 - 24705, this.field9427);
            }
            for (int var16 = 0; var16 < var15.length; var16++) {
                byte[] var17 = this.field9428[var16];
                class711 var18 = new class711(var17);
                var18.field9945 = 1;
                int var19 = var18.method5116((byte) -120);
                class616 var20 = null;
                for (class616 var21 = (class616) var12.method3977((byte) -53); var21 != null; var21 = (class616) var12.method3987(0)) {
                    if (var21.field8798 == var19) {
                        var20 = var21;
                        break;
                    }
                }
                if (var20 == null) {
                    class47 var22 = class717.field10209;
                    synchronized (class717.field10209) {
                        var20 = new class616(var19, class717.field10209.method520((byte) 108, var19));
                    }
                    var12.method3984(var20, arg0);
                }
                this.field9432[var15[var16]] = new class284(var17, var20);
            }
            this.field9428 = null;
            return true;
        } catch (RuntimeException var30) {
            throw class665.method4799(var30, field9441[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(I)V", line = 419)
    public class669(int arg0) {
        try {
            this.field9427 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field9441[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)Z", line = 430)
    public final boolean method4819(int arg0, int arg1) {
        try {
            if (arg0 != -12221) {
                field9440 = false;
            }
            field9437++;
            return this.field9432[arg1].field3989;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9441[17] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIILha;)V", line = 442)
    public static final void method4820(int arg0, int arg1, int arg2, class18 arg3) {
        try {
            field9434++;
            if (arg2 >= 0 && arg0 >= 0 && class134.field1683 != 0 && class422.field6043 != 0) {
                int var4;
                int var5;
                int var6;
                int var7;
                class104 var8;
                int var9;
                int var10;
                if (class212.field3119) {
                    class488.method3757(arg1 - 99, false);
                    var8 = arg3.method129();
                    int[] var11 = arg3.method157();
                    var7 = var11[3];
                    var5 = var11[2];
                    var6 = var11[1];
                    var4 = var11[0];
                    var10 = class453.method3508(false, -44) + arg2;
                    var9 = class436.method3400(false, (byte) 106) + arg0;
                } else {
                    arg3.method233(class711.field10000, class335.field4854, class134.field1683, class422.field6043);
                    var4 = class711.field10000;
                    var5 = class134.field1683;
                    var6 = class335.field4854;
                    var7 = class422.field6043;
                    arg3.method208(class78.field1098, class652.field9266, class134.field1683, class422.field6043);
                    var8 = arg3.method221();
                    var8.method722(class2.field29, class189.field2509, class788.field11374, class649.field9221, class717.field10227, class767.field10961);
                    var9 = arg0;
                    arg3.method204(var8);
                    var10 = arg2;
                }
                if (var5 == 0) {
                    var5 = 1;
                }
                class198.method1710(arg1, true);
                if (var7 == 0) {
                    var7 = 1;
                }
                if (class213.field3124 != null && (!class351.field5091 || (class140.field1826 & 0x40) != 0)) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = arg3.method195();
                    int var15 = arg3.method187();
                    int var16;
                    int var17;
                    int var18;
                    int var19;
                    if (class149.field1902) {
                        var16 = var19 = (var9 - var6) * class194.field2686 / var7;
                        var17 = var18 = (var10 - var4) * class194.field2686 / var5;
                    } else {
                        var16 = (var9 - var6) * var14 / var7;
                        var17 = (var10 - var4) * var14 / var5;
                        var18 = (var10 - var4) * var15 / var5;
                        var19 = (var9 - var6) * var15 / var7;
                    }
                    int[] var20 = new int[] { var17, var16, var14 };
                    int[] var21 = new int[] { var18, var19, var15 };
                    var8.method743(var20);
                    var8.method743(var21);
                    float var22 = class452.method3503((float) var21[0], 4, (float) var20[1], (float) var20[0], (float) var21[1], (float) var21[2], (float) var20[2], -1);
                    if (var22 > 0.0F) {
                        int var23 = var21[0] - var20[0];
                        int var24 = var21[2] - var20[2];
                        int var25 = (int) ((float) var23 * var22 + (float) var20[0]);
                        int var26 = (int) ((float) var24 * var22 + (float) var20[2]);
                        var12 = var25 + (class203.field2988.method1437((byte) -28) - 1 << 8) >> 9;
                        var13 = (class203.field2988.method1437((byte) -28) - 1 << 8) + var26 >> 9;
                        byte var27 = class203.field2988.field2981;
                        if (var27 < 3 && (class76.field1089[1][var25 >> 9][var26 >> 9] & 0x2) != 0) {
                            int var89 = var27 + 1;
                        }
                    }
                    if (var12 != -1 && var13 != -1) {
                        if (class351.field5091 && (class140.field1826 & 0x40) != 0) {
                            class782 var28 = class372.method2952(class121.field1535, class671.field9452, 0);
                            if (var28 == null) {
                                class598.method4410((byte) 76);
                            } else {
                                class751.method5441(class121.field1534, field9441[5], var12, -1, (long) (var12 << 0 | var13), true, class268.field3795, -1, true, var13, false, 44, 0L);
                            }
                        } else {
                            if (class152.field1947) {
                                class751.method5441(-1, "", var12, -1, (long) (var12 << 0 | var13), true, class537.field7857.method4068((byte) -127, class405.field5883), -1, true, var13, false, 49, 0L);
                            }
                            class751.method5441(class495.field7273, "", var12, -1, (long) (var12 << 0 | var13), true, class255.field3663, -1, true, var13, false, 17, 0L);
                            class605.field8673++;
                        }
                    }
                }
                if (class212.field3119) {
                    class229.method1904(arg1 - 110);
                }
                for (int var29 = 0; var29 < (class212.field3119 ? 2 : 1); var29++) {
                    boolean var30 = var29 == 0;
                    class217 var31 = var30 ? class80.field1125 : class626.field8937;
                    int var32 = arg2;
                    int var33 = arg0;
                    if (class212.field3119) {
                        class488.method3757(-69, var30);
                        var32 = arg2 + class453.method3508(var30, 96);
                        var33 = arg0 + class436.method3400(var30, (byte) -23);
                    }
                    class470 var34 = var31.field3178;
                    for (class297 var35 = (class297) var34.method3617(false); var35 != null; var35 = (class297) var34.method3612(3)) {
                        if ((class514.field7561 || class203.field2988.field2981 == var35.field4150.field2981) && var35.method2386(arg3, var32, var33, 8)) {
                            boolean var36 = false;
                            boolean var37 = false;
                            int var38;
                            int var39;
                            if ((var35.field4150 instanceof class604)) {
                                var39 = ((class604) var35.field4150).field8669;
                                var38 = ((class604) var35.field4150).field8663;
                            } else {
                                var38 = var35.field4150.field2969 >> 9;
                                var39 = var35.field4150.field2984 >> 9;
                            }
                            if (var35.field4150 instanceof class339) {
                                class339 var40 = (class339) var35.field4150;
                                int var41 = var40.method1437((byte) -28);
                                if ((var41 & 0x1) == 0 && (var40.field2969 & 0x1FF) == 0 && (var40.field2984 & 0x1FF) == 0 || (var41 & 0x1) == 1 && (var40.field2969 & 0x1FF) == 256 && (var40.field2984 & 0x1FF) == 256) {
                                    int var42 = var40.field2969 - (var40.method1437((byte) -28) - 1 << 8);
                                    int var43 = var40.field2984 - (var40.method1437((byte) -28) - 1 << 8);
                                    for (int var44 = 0; var44 < class438.field6458; var44++) {
                                        class527 var45 = (class527) class479.field7063.method3693(false, (long) class343.field4987[var44]);
                                        if (var45 != null) {
                                            class717 var46 = var45.field7672;
                                            if (class694.field9700 != var46.field2221 && var46.field2212) {
                                                int var47 = var46.field2969 - (var46.field10229.field1717 - 1 << 8);
                                                int var48 = var46.field2984 - (var46.field10229.field1717 - 1 << 8);
                                                if (var47 >= var42 && var46.field10229.field1717 <= var40.method1437((byte) -28) - (var47 - var42 >> 9) && var48 >= var43 && var46.field10229.field1717 <= var40.method1437((byte) -28) - (var48 - var43 >> 9)) {
                                                    class560.method4189(true, class203.field2988.field2981 != var35.field4150.field2981, var46);
                                                    var46.field2221 = class694.field9700;
                                                }
                                            }
                                        }
                                    }
                                    int var49 = class689.field9642;
                                    int[] var50 = class599.field8595;
                                    for (int var51 = 0; var51 < var49; var51++) {
                                        class339 var52 = class748.field10666[var50[var51]];
                                        if (var52 != null && class694.field9700 != var52.field2221 && var40 != var52 && var52.field2212) {
                                            int var53 = var52.field2969 - (var52.method1437((byte) -28) - 1 << 8);
                                            int var54 = var52.field2984 - (var52.method1437((byte) -28) - 1 << 8);
                                            if (var53 >= var42 && var52.method1437((byte) -28) <= var40.method1437((byte) -28) - (var53 - var42 >> 9) && var54 >= var43 && var52.method1437((byte) -28) <= var40.method1437((byte) -28) - (var54 - var43 >> 9)) {
                                                class228.method1897(false, var52, class203.field2988.field2981 != var35.field4150.field2981);
                                                var52.field2221 = class694.field9700;
                                            }
                                        }
                                    }
                                }
                                if (class694.field9700 == var40.field2221) {
                                    continue;
                                }
                                class228.method1897(false, var40, class203.field2988.field2981 != var35.field4150.field2981);
                                var40.field2221 = class694.field9700;
                            }
                            if (var35.field4150 instanceof class717) {
                                class717 var55 = (class717) var35.field4150;
                                if (var55.field10229 != null) {
                                    if ((var55.field10229.field1717 & 0x1) == 0 && (var55.field2969 & 0x1FF) == 0 && (var55.field2984 & 0x1FF) == 0 || (var55.field10229.field1717 & 0x1) == 1 && (var55.field2969 & 0x1FF) == 256 && (var55.field2984 & 0x1FF) == 256) {
                                        int var56 = var55.field2969 - (var55.field10229.field1717 - 1 << 8);
                                        int var57 = var55.field2984 - (var55.field10229.field1717 - 1 << 8);
                                        for (int var58 = 0; var58 < class438.field6458; var58++) {
                                            class527 var59 = (class527) class479.field7063.method3693(false, (long) class343.field4987[var58]);
                                            if (var59 != null) {
                                                class717 var60 = var59.field7672;
                                                if (class694.field9700 != var60.field2221 && var55 != var60 && var60.field2212) {
                                                    int var61 = var60.field2969 - (var60.field10229.field1717 - 1 << 8);
                                                    int var62 = var60.field2984 - (var60.field10229.field1717 - 1 << 8);
                                                    if (var61 >= var56 && var60.field10229.field1717 <= (var55.field10229.field1717 - (var61 - var56 >> 9)) && var57 <= var62 && var60.field10229.field1717 <= var55.field10229.field1717 - (var62 - var57 >> 9)) {
                                                        class560.method4189(true, class203.field2988.field2981 != var35.field4150.field2981, var60);
                                                        var60.field2221 = class694.field9700;
                                                    }
                                                }
                                            }
                                        }
                                        int var63 = class689.field9642;
                                        int[] var64 = class599.field8595;
                                        for (int var65 = 0; var65 < var63; var65++) {
                                            class339 var66 = class748.field10666[var64[var65]];
                                            if (var66 != null && class694.field9700 != var66.field2221 && var66.field2212) {
                                                int var67 = var66.field2969 - (var66.method1437((byte) -28) - 1 << 8);
                                                int var68 = var66.field2984 - (var66.method1437((byte) -28) - 1 << 8);
                                                if (var67 >= var56 && var66.method1437((byte) -28) <= (var55.field10229.field1717 - (var67 - var56 >> 9)) && var57 <= var68 && var66.method1437((byte) -28) <= var55.field10229.field1717 - (var68 - var57 >> 9)) {
                                                    class228.method1897(false, var66, class203.field2988.field2981 != var35.field4150.field2981);
                                                    var66.field2221 = class694.field9700;
                                                }
                                            }
                                        }
                                    }
                                    if (class694.field9700 == var55.field2221) {
                                        continue;
                                    }
                                    class560.method4189(true, class203.field2988.field2981 != var35.field4150.field2981, var55);
                                    var55.field2221 = class694.field9700;
                                }
                            }
                            if (var35.field4150 instanceof class716) {
                                int var69 = class537.field7895 + var38;
                                int var70 = class655.field9286 + var39;
                                class413 var71 = (class413) class414.field5965.method3693(false, (long) (var35.field4150.field2981 << 28 | var70 << 14 | var69));
                                if (var71 != null) {
                                    int var72 = 0;
                                    for (class197 var73 = (class197) var71.field5934.method3986(false); var73 != null; var73 = (class197) var71.field5934.method3978(-96)) {
                                        class371 var74 = class153.field1955.method3237(var73.field2926, arg1 - 1);
                                        if (class351.field5091 && class203.field2988.field2981 == var35.field4150.field2981) {
                                            class573 var75 = class760.field10845 == -1 ? null : class202.field2972.method611(false, class760.field10845);
                                            if ((class140.field1826 & 0x1) != 0 && (var75 == null || var74.method2934(arg1 ^ 0xC7DF79A2, class760.field10845, var75.field8295) != var75.field8295)) {
                                                class783.field11307++;
                                                class751.method5441(class121.field1534, class109.field1426 + field9441[6] + var74.field5421, var38, -1, (long) var72, true, class268.field3795, -1, false, var39, false, 47, (long) var73.field2926);
                                            }
                                        }
                                        if (class203.field2988.field2981 == var35.field4150.field2981) {
                                            String[] var76 = var74.field5420;
                                            for (int var77 = var76.length - 1; var77 >= 0; var77--) {
                                                if (var76[var77] != null) {
                                                    short var78 = 0;
                                                    if (var77 == 0) {
                                                        var78 = 57;
                                                    }
                                                    int var79 = class487.field7153;
                                                    if (var77 == 1) {
                                                        var78 = 52;
                                                    }
                                                    if (var77 == 2) {
                                                        var78 = 16;
                                                    }
                                                    if (var77 == 3) {
                                                        var78 = 2;
                                                    }
                                                    if (var77 == 4) {
                                                        var78 = 18;
                                                    }
                                                    if (var74.field5362 == var77) {
                                                        var79 = var74.field5395;
                                                    }
                                                    if (var77 == 5) {
                                                        var78 = 1008;
                                                    }
                                                    if (var74.field5401 == var77) {
                                                        var79 = var74.field5406;
                                                    }
                                                    class751.method5441(var79, field9441[7] + var74.field5421, var38, -1, (long) var72, true, var76[var77], -1, false, var39, false, var78, (long) var73.field2926);
                                                    class481.field7077++;
                                                }
                                            }
                                        }
                                        var72++;
                                    }
                                }
                            }
                            if (var35.field4150 instanceof class675) {
                                class675 var80 = (class675) var35.field4150;
                                class789 var81 = class101.field1359.method2832(125, var80.method584(false));
                                if (var81.field11465 != null) {
                                    var81 = var81.method5688(65, class734.field10459);
                                }
                                if (var81 != null) {
                                    if (class351.field5091 && class203.field2988.field2981 == var35.field4150.field2981) {
                                        class573 var82 = class760.field10845 == -1 ? null : class202.field2972.method611(false, class760.field10845);
                                        if ((class140.field1826 & 0x4) != 0 && (var82 == null || var81.method5679((byte) 11, var82.field8295, class760.field10845) != var82.field8295)) {
                                            class751.method5441(class121.field1534, class109.field1426 + field9441[8] + var81.field11477, var38, -1, (long) var80.hashCode(), true, class268.field3795, -1, false, var39, false, 3, class384.method3025(false, var38, var80, var39));
                                            class735.field10472++;
                                        }
                                    }
                                    if (class203.field2988.field2981 == var35.field4150.field2981) {
                                        String[] var83 = var81.field11385;
                                        if (var83 != null) {
                                            for (int var84 = var83.length - 1; var84 >= 0; var84--) {
                                                if (var83[var84] != null) {
                                                    short var85 = 0;
                                                    int var86 = class487.field7153;
                                                    if (var84 == 0) {
                                                        var85 = 50;
                                                    }
                                                    if (var84 == 1) {
                                                        var85 = 12;
                                                    }
                                                    if (var84 == 2) {
                                                        var85 = 9;
                                                    }
                                                    if (var84 == 3) {
                                                        var85 = 51;
                                                    }
                                                    if (var84 == 4) {
                                                        var85 = 1002;
                                                    }
                                                    if (var81.field11438 == var84) {
                                                        var86 = var81.field11425;
                                                    }
                                                    if (var84 == 5) {
                                                        var85 = 1009;
                                                    }
                                                    if (var81.field11402 == var84) {
                                                        var86 = var81.field11457;
                                                    }
                                                    class751.method5441(var86, field9441[2] + var81.field11477, var38, -1, (long) var80.hashCode(), true, var83[var84], -1, false, var39, false, var85, class384.method3025(false, var38, var80, var39));
                                                    class584.field8423++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class212.field3119) {
                        class229.method1904(-89);
                    }
                }
                class198.method1710(arg1, false);
            }
        } catch (RuntimeException var88) {
            throw class665.method4799(var88, field9441[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field9441[4] : field9441[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)Z", line = 991)
    public final boolean method4821(int arg0, int arg1) {
        try {
            if (arg1 == 5575) {
                field9438++;
                return this.field9432[arg0].field3990;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field9441[11] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(BI)Z", line = 1002)
    public final boolean method4822(byte arg0, int arg1) {
        try {
            int var3 = -107 / ((-arg0 - 50) / 52);
            field9435++;
            return this.field9432[arg1].field4002;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9441[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4823(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4824(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
