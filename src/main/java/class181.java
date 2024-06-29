import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class181 extends class166 {

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    private int field3275 = 1024;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    private int field3283 = 2048;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    private int field3282 = 819;

    @OriginalMember(owner = "client!bd", name = "bb", descriptor = "I")
    private int field3286 = 1024;

    @OriginalMember(owner = "client!bd", name = "cb", descriptor = "I")
    private int field3287 = 1024;

    @OriginalMember(owner = "client!bd", name = "db", descriptor = "I")
    private int field3288 = 409;

    @OriginalMember(owner = "client!bd", name = "qb", descriptor = "I")
    private int field3301 = 0;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    private int field3279 = 1024;

    @OriginalMember(owner = "client!bd", name = "hb", descriptor = "I")
    private int field3292 = 0;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "Lhj;")
    public static class69 field3277 = method1318("Konfig geladen)3", (byte) -115);

    @OriginalMember(owner = "client!bd", name = "mb", descriptor = "Lhj;")
    public static class69 field3297 = method1318("Benutzen", (byte) -113);

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "Lhj;")
    public static class69 field3278 = method1318("loc", (byte) -111);

    @OriginalMember(owner = "client!bd", name = "pb", descriptor = "[I")
    public static int[] field3300 = new int[100];

    @OriginalMember(owner = "client!bd", name = "ob", descriptor = "I")
    public static int field3299 = 0;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!bd", name = "eb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!bd", name = "fb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!bd", name = "gb", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!bd", name = "ib", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!bd", name = "jb", descriptor = "I")
    private int field3294;

    @OriginalMember(owner = "client!bd", name = "kb", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!bd", name = "nb", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!bd", name = "rb", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bd", name = "lb", descriptor = "[[Z")
    public static boolean[][] field3296;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "[[[B")
    public static byte[][][] field3285;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/util/Random;IIIIB[[I)V")
    private final void method1315(Random arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[][] arg6) {
        ++field3274;
        if (arg5 < 107) {
            this.field3283 = -35;
        }
        int var8 = this.field3287 <= 0 ? 4096 : -client.method1149(76, this.field3287, arg0) + 4096;
        int var9 = this.field3294 * this.field3286 >> 12;
        int var10 = this.field3294 - (~var9 < -1 ? client.method1149(112, var9, arg0) : 0);
        if (~class253.field4565 >= ~arg1) {
            arg1 -= class253.field4565;
        }
        if (~var10 < -1) {
            if (~arg2 < -1 && arg4 > 0) {
                int var11 = arg2 / 2;
                int var12 = arg4 / 2;
                int var13 = var10 > var12 ? var12 : var10;
                int var14 = arg1 + var13;
                int var15 = ~var10 < ~var11 ? var11 : var10;
                int var16 = -(var13 * 2) + arg4;
                for (int var17 = 0; ~var17 > ~arg2; ++var17) {
                    int[] var18 = arg6[arg3 + var17];
                    if (var17 < var15) {
                        int var19 = var8 * var17 / var15;
                        if (this.field3292 == 0) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class69.method443(arg1 + var20, class12.field183)] = var18[class69.method443(-var20 + arg4 + arg1 + -1, class12.field183)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class69.method443(class12.field183, arg1 + var22)] = var18[class69.method443(class12.field183, arg1 + -1 + arg4 - var22)] = ~var19 < ~var24 ? var24 : var19;
                            }
                        }
                        if (~(var14 - -var16) >= ~class253.field4565) {
                            class1.method2(var18, var14, var16, var19);
                        } else {
                            int var23 = -var14 + class253.field4565;
                            class1.method2(var18, var14, var23, var19);
                            class1.method2(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg2 + -1 - var17;
                        if (var25 < var15) {
                            int var26 = var8 * var25 / var15;
                            if (~this.field3292 == -1) {
                                for (int var27 = 0; var27 < var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class69.method443(class12.field183, arg1 + var27)] = var18[class69.method443(class12.field183, arg1 - -arg4 - (var27 - -1))] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class69.method443(arg1 + var29, class12.field183)] = var18[class69.method443(arg1 - -arg4 + -var29 + -1, class12.field183)] = ~var31 > ~var26 ? var31 : var26;
                                }
                            }
                            if (~(var14 + var16) < ~class253.field4565) {
                                int var30 = -var14 + class253.field4565;
                                class1.method2(var18, var14, var30, var26);
                                class1.method2(var18, 0, -var30 + var16, var26);
                            } else {
                                class1.method2(var18, var14, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class69.method443(class12.field183, arg1 + var32)] = var18[class69.method443(-var32 + -1 + arg1 + arg4, class12.field183)] = var8 * var32 / var13;
                            }
                            if (~class253.field4565 > ~(var14 + var16)) {
                                int var33 = -var14 + class253.field4565;
                                class1.method2(var18, var14, var33, var8);
                                class1.method2(var18, 0, -var33 + var16, var8);
                            } else {
                                class1.method2(var18, var14, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class253.field4565 <= ~(arg1 + arg4)) {
            for (int var34 = 0; arg2 > var34; ++var34) {
                class1.method2(arg6[arg3 + var34], arg1, arg4, var8);
            }
        } else {
            int var35 = -arg1 + class253.field4565;
            for (int var36 = 0; arg2 > var36; ++var36) {
                int[] var37 = arg6[arg3 + var36];
                class1.method2(var37, arg1, var35, var8);
                class1.method2(var37, 0, -var35 + arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(II)V")
    public static final void method1316(int arg0, int arg1) {
        ++field3284;
        class135 var2 = class8.method38((byte) 118, 11, arg0);
        var2.method1012((byte) -114);
        if (arg1 != -5759) {
            field3291 = -97;
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)[Lkc;")
    public static final class264[] method1317(int arg0) {
        class264[] var1 = new class264[class196.field3573];
        for (int var2 = arg0; ~var2 > ~class196.field3573; ++var2) {
            int var3 = class69.field1350[var2] * class113.field2167[var2];
            byte[] var4 = class157.field2919[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var6 > ~var3; ++var6) {
                var5[var6] = class50.field841[class69.method443(var4[var6], 255)];
            }
            var1[var2] = new class264(class229.field4196, class53.field941, class138.field2585[var2], class88.field1682[var2], class69.field1350[var2], class113.field2167[var2], var5);
        }
        ++field3273;
        class229.method1636((byte) 73);
        return var1;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
    public final void method16(int arg0) {
        int var2 = -13 / ((58 - arg0) / 50);
        ++field3290;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;B)Lhj;")
    public static final class69 method1318(String arg0, byte arg1) {
        ++field3293;
        byte[] var2 = arg0.getBytes();
        if (arg1 > -104) {
            field3297 = null;
        }
        int var3 = var2.length;
        int var4 = 0;
        class69 var5 = new class69();
        var5.field1351 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 255;
            if (var6 <= 45 && ~var6 <= -41) {
                if (~var4 <= ~var3) {
                    break;
                }
                int var7 = 255 & var2[var4++];
                var5.field1351[var5.field1331++] = (byte) (var6 * 43 + -1720 + var7 + -48);
            } else if (~var6 != -1) {
                var5.field1351[var5.field1331++] = (byte) var6;
            }
        }
        var5.method448(1);
        return var5.method447(-225);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3302;
        int var8 = arg3 + arg6;
        int var9 = arg3 + arg4;
        for (int var10 = arg6; ~var10 > ~var8; ++var10) {
            class99.method740(arg5, class186.field3402[var10], -1162793114, arg2, arg4);
        }
        int var11 = -arg3 + arg0;
        for (int var12 = arg0; ~var11 > ~var12; --var12) {
            class99.method740(arg5, class186.field3402[var12], -1162793114, arg2, arg4);
        }
        int var13 = -arg3 + arg2;
        for (int var14 = var8; var14 <= var11; ++var14) {
            int[] var15 = class186.field3402[var14];
            class99.method740(arg5, var15, arg7 ^ -1162793114, var9, arg4);
            class99.method740(arg1, var15, -1162793114, var13, var9);
            class99.method740(arg5, var15, arg7 ^ -1162793114, arg2, var13);
        }
        if (arg7 != 0) {
            field3277 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(II)[B")
    public static final byte[] method1320(int arg0, int arg1) {
        class109 var2 = (class109) class49.field721.method1448((long) arg1, (byte) -40);
        ++field3298;
        if (arg0 != -27019) {
            return null;
        } else {
            if (var2 == null) {
                byte[] var3 = new byte[512];
                Random var4 = new Random((long) arg1);
                for (int var5 = 0; ~var5 > -256; ++var5) {
                    var3[var5] = (byte) var5;
                }
                for (int var6 = 0; ~var6 > -256; ++var6) {
                    int var7 = -var6 + 255;
                    int var8 = client.method1149(-122, var7, var4);
                    byte var9 = var3[var8];
                    var3[var8] = var3[var7];
                    var3[var7] = var3[-var6 + 511] = var9;
                }
                var2 = new class109(var3);
                class49.field721.method1453(0, var2, (long) arg1);
            }
            return var2.field2086;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg1 != 8388607) {
            this.method1315((Random) null, -109, 38, -77, 10, (byte) -2, (int[][]) null);
        }
        ++field3281;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int[][] var7 = super.field3071.method1253((byte) -52);
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class253.field4565 * this.field3279 >> 12;
            int var15 = class253.field4565 * this.field3283 >> 12;
            int var16 = class146.field2691 * this.field3288 >> 12;
            int var17 = class146.field2691 * this.field3282 >> 12;
            if (var17 <= 1) {
                return var7[arg0];
            } else {
                this.field3294 = class253.field4565 / 8 * this.field3275 >> 12;
                int var18 = class253.field4565 / var14 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field3301);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = client.method1149(-115, -var14 + var15, var20) + var14;
                        int var23 = client.method1149(-87, -var16 + var17, var20) + var16;
                        int var24 = var8 + var22;
                        if (class253.field4565 < var24) {
                            var22 = -var8 + class253.field4565;
                            var24 = class253.field4565;
                        }
                        int var10000;
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var10;
                            int[] var27 = var19[var10];
                            int var28 = 0;
                            var25 = var27[2];
                            int var29 = var4 + var24;
                            if (~var29 > -1) {
                                var29 += class253.field4565;
                            }
                            if (var29 > class253.field4565) {
                                var29 -= class253.field4565;
                            }
                            while (true) {
                                int[] var30 = var19[var26];
                                if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                    if (var10 != var26) {
                                        int var31 = var4 + var8;
                                        if (~var31 > -1) {
                                            var31 += class253.field4565;
                                        }
                                        if (var31 > class253.field4565) {
                                            var31 -= class253.field4565;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var19[(var10 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var19[(var10 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[1];
                                                int var37 = var34[0];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = Math.min(var29, var36);
                                                } else if (var37 == 0) {
                                                    var39 = Math.min(var29, var36);
                                                    var38 = 0;
                                                } else {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = class253.field4565;
                                                }
                                                this.method1315(var20, var5 + var38, var25 - var35, var35, -var38 + var39, (byte) 125, var7);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var28;
                                var10000 = ~var12;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (var23 + var25 <= class146.field2691) {
                            var9 = false;
                        } else {
                            var23 = -var25 + class146.field2691;
                        }
                        if (class253.field4565 != var24) {
                            int[] var41 = var21[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            this.method1315(var20, var6 + var8, var23, var25, var22, (byte) 126, var7);
                            var8 = var24;
                        } else {
                            this.method1315(var20, var8 - -var6, var23, var25, var22, (byte) 111, var7);
                            if (var9) {
                                return var3;
                            }
                            var5 = var6;
                            var10 = 0;
                            var9 = true;
                            var11 = false;
                            int[] var42 = var21[var13++];
                            var42[1] = var24;
                            var12 = var13;
                            var42[2] = var25 - -var23;
                            var42[0] = var8;
                            var8 = 0;
                            var6 = client.method1149(arg1 ^ 8388526, class253.field4565, var20);
                            int[][] var43 = var19;
                            var4 = var6 - var5;
                            var19 = var21;
                            var13 = 0;
                            var21 = var43;
                            int var44 = var4;
                            if (~var4 > -1) {
                                var44 = class253.field4565 + var4;
                            }
                            if (~var44 < ~class253.field4565) {
                                var44 -= class253.field4565;
                            }
                            while (true) {
                                int[] var45 = var19[var10];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                var10000 = ~var12;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            method1319(103, -80, 16, -105, -70, 40, -91, 93);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field3287 = arg1.method912(-81);
                                        }
                                    } else {
                                        this.field3286 = arg1.method912(105);
                                    }
                                } else {
                                    this.field3292 = arg1.method937(false);
                                }
                            } else {
                                this.field3275 = arg1.method912(39);
                            }
                        } else {
                            this.field3282 = arg1.method912(-81);
                        }
                    } else {
                        this.field3288 = arg1.method912(79);
                    }
                } else {
                    this.field3283 = arg1.method912(-125);
                }
            } else {
                this.field3279 = arg1.method912(arg0 + -54);
            }
        } else {
            this.field3301 = arg1.method937(false);
        }
        ++field3280;
    }

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "(I)V")
    public static final void method1321(int arg0) {
        int var1 = -38 % ((-1 - arg0) / 32);
        class124.field2299.method1709((byte) -79);
        ++field3289;
        class116.field2224.method1709((byte) -84);
    }

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "(I)V")
    public static void method1322(int arg0) {
        int var1 = 68 / ((arg0 - -62) / 41);
        field3277 = null;
        field3297 = null;
        field3296 = null;
        field3278 = null;
        field3300 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLfh;)V")
    public static final void method1323(byte arg0, class128 arg1) {
        if (class28.field399 != null) {
            try {
                class28.field399.method1090(true, 0L);
                class28.field399.method1094((byte) 63, arg1.field2379, arg1.field2385, 24);
            } catch (Exception var3) {
            }
        }
        int var2 = -6 % ((15 - arg0) / 54);
        ++field3295;
        arg1.field2379 += 24;
    }
}
