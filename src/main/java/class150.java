import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class150 extends class224 {

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    private int field2315 = 2048;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    private int field2321 = 1024;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "I")
    private int field2322 = 1024;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    private int field2324 = 409;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    private int field2326 = 1024;

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "I")
    private int field2328 = 819;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    private int field2316 = 0;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    private int field2320 = 0;

    @OriginalMember(owner = "client!na", name = "lb", descriptor = "I")
    private int field2334 = 1024;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "Luf;")
    public static class168 field2330 = class148.method1019(-1720, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "Luf;")
    private static class168 field2325 = class148.method1019(-1720, "Unable to find ");

    @OriginalMember(owner = "client!na", name = "ib", descriptor = "I")
    public static int field2331 = 0;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "Luf;")
    public static class168 field2323 = field2325;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!na", name = "jb", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!na", name = "kb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!na", name = "mb", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!na", name = "V", descriptor = "[Lwa;")
    public static class284[] field2318;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)[I", line = 4)
    public final int[] method18(byte arg0, int arg1) {
        field2317++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 65 % ((arg0 - 20) / 51);
        if (!this.field3613.field4531) {
            return var3;
        }
        int[][] var5 = this.field3613.method1868(0);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean var11 = true;
        boolean var12 = true;
        int var13 = 0;
        int var14 = class187.field2961 * this.field2315 >> 12;
        int var15 = 0;
        int var16 = class115.field1791 * this.field2324 >> 12;
        int var17 = class187.field2961 * this.field2334 >> 12;
        int var18 = class115.field1791 * this.field2328 >> 12;
        if (var18 <= 1) {
            return var5[arg1];
        }
        this.field2335 = class187.field2961 / 8 * this.field2321 >> 12;
        int var19 = class187.field2961 / var17 + 1;
        int[][] var20 = new int[var19][3];
        int[][] var21 = new int[var19][3];
        Random var22 = new Random((long) this.field2320);
        while (true) {
            while (true) {
                int var23 = var17 + class103.method774(var14 - var17, var22, Integer.MIN_VALUE);
                int var24 = class103.method774(var18 - var16, var22, Integer.MIN_VALUE) + var16;
                int var25 = var9 + var23;
                if (var25 > class187.field2961) {
                    var25 = class187.field2961;
                    var23 = class187.field2961 - var9;
                }
                int var30;
                if (var11) {
                    var30 = 0;
                } else {
                    int var26 = var10;
                    int var27 = 0;
                    int[] var28 = var20[var10];
                    int var29 = var6 + var25;
                    var30 = var28[2];
                    if (var29 < 0) {
                        var29 += class187.field2961;
                    }
                    if (var29 > class187.field2961) {
                        var29 -= class187.field2961;
                    }
                    while (true) {
                        int[] var31 = var20[var26];
                        if (var29 >= var31[0] && var31[1] >= var29) {
                            if (var10 != var26) {
                                int var32 = var6 + var9;
                                if (var32 < 0) {
                                    var32 += class187.field2961;
                                }
                                if (var32 > class187.field2961) {
                                    var32 -= class187.field2961;
                                }
                                for (int var33 = 1; var33 <= var27; var33++) {
                                    int[] var34 = var20[(var10 + var33) % var13];
                                    var30 = Math.max(var30, var34[2]);
                                }
                                for (int var35 = 0; var35 <= var27; var35++) {
                                    int[] var36 = var20[(var10 + var35) % var13];
                                    int var37 = var36[2];
                                    if (var30 != var37) {
                                        int var38 = var36[0];
                                        int var39 = var36[1];
                                        int var40;
                                        int var41;
                                        if (var29 > var32) {
                                            var40 = Math.max(var32, var38);
                                            var41 = Math.min(var29, var39);
                                        } else if (var38 == 0) {
                                            var41 = Math.min(var29, var39);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var32, var38);
                                            var41 = class187.field2961;
                                        }
                                        this.method1035(-89, var30 - var37, var37, var5, var22, var41 - var40, var40 - -var7);
                                    }
                                }
                            }
                            var10 = var26;
                            break;
                        }
                        int var10000 = ~var13;
                        var26++;
                        if (var10000 >= ~var26) {
                            var26 = 0;
                        }
                        var27++;
                    }
                }
                if (var24 + var30 <= class115.field1791) {
                    var12 = false;
                } else {
                    var24 = class115.field1791 - var30;
                }
                if (class187.field2961 == var25) {
                    this.method1035(-109, var24, var30, var5, var22, var23, var8 + var9);
                    if (var12) {
                        return var3;
                    }
                    var12 = true;
                    var10 = 0;
                    var7 = var8;
                    int[] var42 = var21[var15++];
                    var42[0] = var9;
                    var11 = false;
                    var42[2] = var24 + var30;
                    var9 = 0;
                    var13 = var15;
                    int[][] var43 = var20;
                    var20 = var21;
                    var15 = 0;
                    var42[1] = var25;
                    var21 = var43;
                    var8 = class103.method774(class187.field2961, var22, Integer.MIN_VALUE);
                    var6 = var8 - var7;
                    int var44 = var6;
                    if (var6 < 0) {
                        var44 = class187.field2961 + var6;
                    }
                    if (var44 > class187.field2961) {
                        var44 -= class187.field2961;
                    }
                    while (true) {
                        int[] var45 = var20[var10];
                        if (var44 >= var45[0] && var44 <= var45[1]) {
                            break;
                        }
                        var10++;
                        if (var10 >= var13) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var46 = var21[var15++];
                    var46[2] = var30 + var24;
                    var46[0] = var9;
                    var46[1] = var25;
                    this.method1035(-125, var24, var30, var5, var22, var23, var8 + var9);
                    var9 = var25;
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBLg;IIIII)V", line = 262)
    public static final void method1031(int arg0, byte arg1, class242 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class131.field2030) {
            class282.field4769 = 32;
        } else {
            class282.field4769 = 0;
        }
        field2332++;
        int var8 = 46 / ((arg1 - 23) / 57);
        class131.field2030 = false;
        if (class281.field4725 != 0) {
            if (arg0 <= arg6 && arg0 + 16 > arg6 && arg5 <= arg7 && (arg5 + 16) > arg7) {
                arg2.field4079 -= 4;
                client.method2011((byte) -59, arg2);
            } else if (arg6 >= arg0 && arg6 < (arg0 + 16) && arg3 + arg5 - 16 <= arg7 && (arg3 + arg5) > arg7) {
                arg2.field4079 += 4;
                client.method2011((byte) -59, arg2);
            } else if (arg0 - class282.field4769 <= arg6 && class282.field4769 + arg0 + 16 > arg6 && arg5 + 16 <= arg7 && arg7 < (arg3 + arg5 - 16)) {
                int var9 = (arg3 - 32) * arg3 / arg4;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg3 - var9 - 32;
                int var11 = arg7 - arg5 - (var9 / 2) - 16;
                arg2.field4079 = (arg4 - arg3) * var11 / var10;
                client.method2011((byte) -59, arg2);
                class131.field2030 = true;
            }
        }
        if (class26.field324 == 0) {
            return;
        }
        int var12 = arg2.field3989;
        if (arg0 - var12 <= arg6 && arg5 <= arg7 && (arg0 + 16) > arg6 && arg7 <= (arg3 + arg5)) {
            arg2.field4079 += class26.field324 * 45;
            client.method2011((byte) -59, arg2);
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V", line = 475)
    public class150() {
        super(0, true);
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(Z)V", line = 341)
    public static void method1032(boolean arg0) {
        field2325 = null;
        field2318 = null;
        if (!arg0) {
            field2323 = (class168) null;
        }
        field2323 = null;
        field2330 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIIILf;IZJ)Z", line = 355)
    public static final boolean method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class231 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class227.field3686 == class118.field1835;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class117.field1821 || var16 >= class244.field4160) {
                    return false;
                }
                class127 var17 = class92.field1424[arg0][var15][var16];
                if (var17 != null && var17.field1970 >= 5) {
                    return false;
                }
            }
        }
        class91 var18 = new class91();
        var18.field1407 = arg11;
        var18.field1396 = arg0;
        var18.field1394 = arg5;
        var18.field1404 = arg6;
        var18.field1397 = arg7;
        var18.field1408 = arg8;
        var18.field1398 = arg9;
        var18.field1410 = arg1;
        var18.field1412 = arg2;
        var18.field1406 = arg1 + arg3 - 1;
        var18.field1400 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class92.field1424[var22][var19][var20] == null) {
                        class92.field1424[var22][var19][var20] = new class127(var22, var19, var20);
                    }
                }
                class127 var23 = class92.field1424[arg0][var19][var20];
                var23.field1971[var23.field1970] = var18;
                var23.field1977[var23.field1970] = var21;
                var23.field1987 |= var21;
                var23.field1970++;
                if (var13 && class271.field4565[var19][var20] != 0) {
                    var14 = class271.field4565[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class271.field4565[var24][var25] == 0) {
                        class271.field4565[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class92.field1419[class280.field4715++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 479)
    public final void method80(boolean arg0) {
        field2329++;
        if (arg0) {
            field2319 = 62;
        }
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(I)V", line = 493)
    public static final void method1034(int arg0) {
        field2333++;
        class251 var1 = class55.field704;
        synchronized (class55.field704) {
            class107.field1641 = class139.field2149;
            class102.field1583++;
            if (class280.field4705 >= 0) {
                while (class44.field545 != class280.field4705) {
                    int var2 = class241.field3910[class44.field545];
                    class44.field545 = class44.field545 + 1 & 0x7F;
                    if (var2 < 0) {
                        class190.field3071[~var2] = false;
                    } else {
                        class190.field3071[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class190.field3071[var3] = false;
                }
                class280.field4705 = class44.field545;
            }
            class139.field2149 = class121.field1882;
        }
        if (arg0 >= -14) {
            field2331 = 99;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III[[ILjava/util/Random;II)V", line = 538)
    private final void method1035(int arg0, int arg1, int arg2, int[][] arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field2326 <= 0 ? 4096 : 4096 - class103.method774(this.field2326, arg4, Integer.MIN_VALUE);
        if (arg0 > -86) {
            return;
        }
        int var9 = this.field2335 * this.field2322 >> 12;
        field2327++;
        int var10 = this.field2335 - (var9 > 0 ? class103.method774(var9, arg4, Integer.MIN_VALUE) : 0);
        if (arg6 >= class187.field2961) {
            arg6 -= class187.field2961;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg5 <= 0) {
                return;
            }
            int var11 = arg1 / 2;
            int var12 = arg5 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = arg6 + var13;
            int var15 = arg5 - var13 * 2;
            int var16 = var11 < var10 ? var11 : var10;
            for (int var17 = 0; var17 < arg1; var17++) {
                int[] var18 = arg3[arg2 + var17];
                if (var17 < var16) {
                    int var19 = var8 * var17 / var16;
                    if (this.field2316 == 0) {
                        for (int var22 = 0; var22 < var13; var22++) {
                            int var23 = var8 * var22 / var13;
                            var18[class159.method1119(class205.field3363, arg6 + var22)] = var18[class159.method1119(arg5 + arg6 - var22 - 1, class205.field3363)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var13; var20++) {
                            int var21 = var8 * var20 / var13;
                            var18[class159.method1119(class205.field3363, arg6 + var20)] = var18[class159.method1119(class205.field3363, arg5 + arg6 - var20 - 1)] = var21 >= var19 ? var19 : var21;
                        }
                    }
                    if ((var14 + var15) <= class187.field2961) {
                        class185.method1309(var18, var14, var15, var19);
                    } else {
                        int var24 = class187.field2961 - var14;
                        class185.method1309(var18, var14, var24, var19);
                        class185.method1309(var18, 0, var15 - var24, var19);
                    }
                } else {
                    int var25 = arg1 - var17 - 1;
                    if (var16 <= var25) {
                        for (int var26 = 0; var26 < var13; var26++) {
                            var18[class159.method1119(arg6 + var26, class205.field3363)] = var18[class159.method1119(arg6 + arg5 - var26 - 1, class205.field3363)] = var8 * var26 / var13;
                        }
                        if ((var14 + var15) > class187.field2961) {
                            int var27 = class187.field2961 - var14;
                            class185.method1309(var18, var14, var27, var8);
                            class185.method1309(var18, 0, var15 - var27, var8);
                        } else {
                            class185.method1309(var18, var14, var15, var8);
                        }
                    } else {
                        int var28 = var8 * var25 / var16;
                        if (this.field2316 == 0) {
                            for (int var31 = 0; var31 < var13; var31++) {
                                int var32 = var8 * var31 / var13;
                                var18[class159.method1119(class205.field3363, arg6 + var31)] = var18[class159.method1119(class205.field3363, arg6 + arg5 - var31 - 1)] = var28 * var32 >> 12;
                            }
                        } else {
                            for (int var29 = 0; var29 < var13; var29++) {
                                int var30 = var8 * var29 / var13;
                                var18[class159.method1119(class205.field3363, arg6 + var29)] = var18[class159.method1119(class205.field3363, arg6 + arg5 - var29 - 1)] = var30 >= var28 ? var28 : var30;
                            }
                        }
                        if (class187.field2961 < (var14 + var15)) {
                            int var33 = class187.field2961 - var14;
                            class185.method1309(var18, var14, var33, var28);
                            class185.method1309(var18, 0, var15 - var33, var28);
                        } else {
                            class185.method1309(var18, var14, var15, var28);
                        }
                    }
                }
            }
        } else if ((arg6 + arg5) <= class187.field2961) {
            for (int var34 = 0; var34 < arg1; var34++) {
                class185.method1309(arg3[arg2 + var34], arg6, arg5, var8);
            }
        } else {
            int var35 = class187.field2961 - arg6;
            for (int var36 = 0; var36 < arg1; var36++) {
                int[] var37 = arg3[arg2 + var36];
                class185.method1309(var37, arg6, var35, var8);
                class185.method1309(var37, 0, arg5 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZLj;)V", line = 759)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field2314++;
        if (arg1) {
            this.method1035(-96, 29, 29, (int[][]) ((int[][]) null), (Random) null, 52, -82);
        }
        if (arg0 == 0) {
            this.field2320 = arg2.method1042((byte) 94);
        } else if (arg0 == 1) {
            this.field2334 = arg2.method1069(112);
        } else if (arg0 == 2) {
            this.field2315 = arg2.method1069(56);
        } else if (arg0 == 3) {
            this.field2324 = arg2.method1069(41);
        } else if (arg0 == 4) {
            this.field2328 = arg2.method1069(79);
        } else if (arg0 == 5) {
            this.field2321 = arg2.method1069(32);
        } else if (arg0 == 6) {
            this.field2316 = arg2.method1042((byte) 118);
        } else if (arg0 == 7) {
            this.field2322 = arg2.method1069(100);
        } else if (arg0 == 8) {
            this.field2326 = arg2.method1069(44);
        }
    }
}
