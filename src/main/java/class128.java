import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class128 extends class85 {

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "I")
    private int field2960;

    @OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
    private int field2937;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
    private int field2945;

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
    private int field2959;

    @OriginalMember(owner = "client!wc", name = "Fb", descriptor = "I")
    private int field2963;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "I")
    private int field2951;

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "I")
    private int field2949;

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lge;")
    private class41 field2948;

    @OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
    private int field2939;

    @OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
    private int field2941;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "Lva;")
    private static class121 field2947 = class107.method797("Connection lost", -10983);

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "Z")
    public static boolean field2950 = false;

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "Lva;")
    public static class121 field2961 = field2947;

    @OriginalMember(owner = "client!wc", name = "Eb", descriptor = "[Lva;")
    public static class121[] field2962 = new class121[200];

    @OriginalMember(owner = "client!wc", name = "db", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "Lw;")
    public static class125 field2946;

    @OriginalMember(owner = "client!wc", name = "eb", descriptor = "Lbe;")
    public static class12 field2936;

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "Lbe;")
    public static class12 field2956;

    @OriginalMember(owner = "client!wc", name = "gb", descriptor = "[I")
    public static int[] field2938;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V", line = 4)
    public static void method996(int arg0) {
        field2956 = null;
        field2947 = null;
        field2946 = null;
        field2962 = null;
        if (arg0 >= -58) {
            method997(true);
        }
        field2936 = null;
        field2961 = null;
        field2938 = null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V", line = 20)
    public static final void method997(boolean arg0) {
        field2952++;
        int var1 = field2935 * 128 + 64;
        int var2 = class26.field669 * 128 + 64;
        int var3 = class47.method340(var1, -6, class121.field2807, var2) - class20.field542;
        if (class15.field304 < var1) {
            class15.field304 += (var1 - class15.field304) * class69.field1640 / 1000 + class23.field616;
            if (class15.field304 > var1) {
                class15.field304 = var1;
            }
        }
        if (var2 > class37.field860) {
            class37.field860 += (var2 - class37.field860) * class69.field1640 / 1000 + class23.field616;
            if (class37.field860 > var2) {
                class37.field860 = var2;
            }
        }
        if (var3 > class116.field2645) {
            class116.field2645 += (var3 - class116.field2645) * class69.field1640 / 1000 + class23.field616;
            if (var3 < class116.field2645) {
                class116.field2645 = var3;
            }
        }
        if (var3 < class116.field2645) {
            class116.field2645 -= (class116.field2645 - var3) * class69.field1640 / 1000 + class23.field616;
            if (class116.field2645 < var3) {
                class116.field2645 = var3;
            }
        }
        if (class37.field860 > var2) {
            class37.field860 -= class23.field616 + (class37.field860 - var2) * class69.field1640 / 1000;
            if (class37.field860 < var2) {
                class37.field860 = var2;
            }
        }
        if (var1 < class15.field304) {
            class15.field304 -= (class15.field304 - var1) * class69.field1640 / 1000 + class23.field616;
            if (class15.field304 < var1) {
                class15.field304 = var1;
            }
        }
        int var4 = class82.field1898 * 128 + 64;
        int var5 = class60.field1428 * 128 + 64;
        int var6 = class47.method340(var4, -6, class121.field2807, var5) - class90.field2031;
        int var7 = var4 - class15.field304;
        int var8 = var5 - class37.field860;
        int var9 = var6 - class116.field2645;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var7, (double) var8)) & 0x7FF;
        int var13 = var12 - class48.field1152;
        if (class91.field2066 < var11) {
            class91.field2066 += (var11 - class91.field2066) * class52.field1216 / 1000 + class100.field2231;
            if (class91.field2066 > var11) {
                class91.field2066 = var11;
            }
        }
        if (class91.field2066 > var11) {
            class91.field2066 -= class100.field2231 + (class91.field2066 - var11) * class52.field1216 / 1000;
            if (class91.field2066 < var11) {
                class91.field2066 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class48.field1152 += class52.field1216 * var13 / 1000 + class100.field2231;
            class48.field1152 &= 0x7FF;
        }
        if (var13 < 0) {
            class48.field1152 -= class100.field2231 + -var13 * class52.field1216 / 1000;
            class48.field1152 &= 0x7FF;
        }
        int var14 = var12 - class48.field1152;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class48.field1152 = var12;
        }
        if (!arg0) {
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[BIZI[Lcb;ILrc;I)V", line = 167)
    public static final void method998(int arg0, int arg1, int arg2, byte[] arg3, int arg4, boolean arg5, int arg6, class15[] arg7, int arg8, class103 arg9, int arg10) {
        field2940++;
        int var11 = -1;
        if (!arg5) {
            method1001(-118, 27);
        }
        class113 var12 = new class113(arg3);
        while (true) {
            int var13 = var12.method846(false);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method846(false);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method821(true);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var18 && arg8 <= var17 && arg8 + 8 > var17 && arg1 <= var16 && var16 < arg1 + 8) {
                    class59 var22 = class20.method179(6, var11);
                    int var23 = arg10 + class41.method275(var22.field1371, var16 & 0x7, -3, arg4, var21, var22.field1387, var17 & 0x7);
                    int var24 = class52.method371(45, arg4, var16 & 0x7, var21, var17 & 0x7, var22.field1387, var22.field1371) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg2;
                        class15 var26 = null;
                        if ((class23.field613[1][var23][var24] & 0x2) == 2) {
                            var25 = arg2 - 1;
                        }
                        if (var25 >= 0) {
                            var26 = arg7[var25];
                        }
                        class67.method477(var23, 16057, var26, var21 + arg4 & 0x3, var11, arg2, arg9, var20, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IZLbe;IBII)V", line = 252)
    public static final void method999(int arg0, boolean arg1, class12 arg2, int arg3, byte arg4, int arg5, int arg6) {
        field2943++;
        long var7 = (long) ((arg5 << arg0) + arg6);
        class58 var9 = (class58) class21.field555.method652(var7, -9);
        if (var9 != null) {
            return;
        }
        class58 var10 = (class58) class58.field1341.method652(var7, -119);
        if (var10 != null) {
            return;
        }
        class58 var11 = (class58) class20.field527.method652(var7, -127);
        if (var11 == null) {
            if (!arg1) {
                class58 var12 = (class58) class12.field213.method652(var7, 54);
                if (var12 != null) {
                    return;
                }
            }
            class58 var13 = new class58();
            var13.field1346 = arg3;
            var13.field1337 = arg2;
            var13.field1340 = arg4;
            if (arg1) {
                class21.field555.method654((byte) -62, var13, var7);
                class99.field2214++;
            } else {
                class114.field2573.method523(3, var13);
                class20.field527.method654((byte) -64, var13, var7);
                client.field428++;
            }
        } else if (arg1) {
            var11.method926(true);
            class21.field555.method654((byte) -70, var11, var7);
            client.field428--;
            class99.field2214++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BBII)Z", line = 310)
    public static final boolean method1000(byte[] arg0, byte arg1, int arg2, int arg3) {
        field2958++;
        int var4 = -38 / ((arg1 - 10) / 41);
        boolean var5 = true;
        int var6 = -1;
        class113 var7 = new class113(arg0);
        label65: while (true) {
            int var8 = var7.method846(false);
            if (var8 == 0) {
                return var5;
            }
            int var9 = 0;
            var6 += var8;
            boolean var10 = false;
            while (true) {
                int var13;
                class59 var17;
                do {
                    int var15;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var10) {
                                        int var18 = var7.method846(false);
                                        if (var18 == 0) {
                                            continue label65;
                                        }
                                        var7.method821(true);
                                    }
                                    int var11 = var7.method846(false);
                                    if (var11 == 0) {
                                        continue label65;
                                    }
                                    var9 += var11 - 1;
                                    int var12 = var9 & 0x3F;
                                    var13 = var7.method821(true) >> 2;
                                    int var14 = var9 >> 6 & 0x3F;
                                    var15 = arg3 + var14;
                                    var16 = arg2 + var12;
                                } while (var15 <= 0);
                            } while (var16 <= 0);
                        } while (var15 >= 103);
                    } while (var16 >= 103);
                    var17 = class20.method179(6, var6);
                } while (var13 == 22 && class38.field879 && var17.field1373 == 0 && !var17.field1389);
                var10 = true;
                if (!var17.method435((byte) -73)) {
                    class71.field1675++;
                    var5 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z", line = 398)
    public static final boolean method1001(int arg0, int arg1) {
        field2942++;
        if (arg0 != -1104831966) {
            method997(true);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lrb;", line = 415)
    public final class102 method188(int arg0) {
        if (this.field2948 != null) {
            int var2 = class115.field2614 - this.field2939;
            if (var2 > 100 && this.field2948.field924 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (this.field2948.field939[this.field2941] >= var2) {
                            break label42;
                        }
                        var2 -= this.field2948.field939[this.field2941];
                        this.field2941++;
                    } while (this.field2941 < this.field2948.field931.length);
                    this.field2941 -= this.field2948.field924;
                } while (this.field2941 >= 0 && this.field2941 < this.field2948.field931.length);
                this.field2948 = null;
            }
            this.field2939 = class115.field2614 - var2;
        }
        field2944++;
        class59 var3 = class20.method179(6, this.field2945);
        if (var3.field1363 != null) {
            var3 = var3.method422(false);
        }
        if (var3 == null) {
            return null;
        } else {
            if (arg0 <= 60) {
                this.field2941 = 53;
            }
            return var3.method427(this.field2937, this.field2949, this.field2951, this.field2948, this.field2963, 122, this.field2941, this.field2960, this.field2959);
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(Z)V", line = 466)
    public static final void method1002(boolean arg0) {
        class66.field1578.method617(17591);
        field2954++;
        int var1 = class66.field1578.method626(8, -49);
        if (class42.field965 > var1) {
            for (int var2 = var1; var2 < class42.field965; var2++) {
                class113.field2558[class18.field392++] = class1.field7[var2];
            }
        }
        if (class42.field965 < var1) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0) {
            field2950 = false;
        }
        class42.field965 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class1.field7[var3];
            class50 var5 = class8.field110[var4];
            int var6 = class66.field1578.method626(1, -70);
            if (var6 == 0) {
                class1.field7[class42.field965++] = var4;
                var5.field722 = class115.field2614;
            } else {
                int var7 = class66.field1578.method626(2, -107);
                if (var7 == 0) {
                    class1.field7[class42.field965++] = var4;
                    var5.field722 = class115.field2614;
                    class15.field274[class92.field2087++] = var4;
                } else if (var7 == 1) {
                    class1.field7[class42.field965++] = var4;
                    var5.field722 = class115.field2614;
                    int var8 = class66.field1578.method626(3, -63);
                    var5.method225(var8, 64, false);
                    int var9 = class66.field1578.method626(1, -47);
                    if (var9 == 1) {
                        class15.field274[class92.field2087++] = var4;
                    }
                } else if (var7 == 2) {
                    class1.field7[class42.field965++] = var4;
                    var5.field722 = class115.field2614;
                    int var10 = class66.field1578.method626(3, -74);
                    var5.method225(var10, 64, true);
                    int var11 = class66.field1578.method626(3, -126);
                    var5.method225(var11, 64, true);
                    int var12 = class66.field1578.method626(1, -53);
                    if (var12 == 1) {
                        class15.field274[class92.field2087++] = var4;
                    }
                } else if (var7 == 3) {
                    class113.field2558[class18.field392++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIIIIZ)V", line = 596)
    public class128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field2960 = arg6;
        this.field2937 = arg3;
        this.field2945 = arg0;
        this.field2959 = arg4;
        this.field2963 = arg1;
        this.field2951 = arg2;
        this.field2949 = arg5;
        if (arg7 != -1) {
            this.field2948 = class5.method33(9, arg7);
            this.field2939 = class115.field2614 - 1;
            this.field2941 = 0;
            if (arg8 && this.field2948.field924 != -1) {
                this.field2941 = (int) ((double) this.field2948.field931.length * Math.random());
                this.field2939 -= (int) (Math.random() * (double) this.field2948.field939[this.field2941]);
                return;
            }
        }
    }
}
