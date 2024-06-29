import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class162 extends class243 {

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    private int field2740 = 1024;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    private int field2739 = 0;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "I")
    private int field2743 = 819;

    @OriginalMember(owner = "client!di", name = "ib", descriptor = "I")
    private int field2746 = 409;

    @OriginalMember(owner = "client!di", name = "lb", descriptor = "I")
    private int field2749 = 1024;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    private int field2736 = 0;

    @OriginalMember(owner = "client!di", name = "pb", descriptor = "I")
    private int field2753 = 1024;

    @OriginalMember(owner = "client!di", name = "nb", descriptor = "I")
    private int field2751 = 1024;

    @OriginalMember(owner = "client!di", name = "ob", descriptor = "I")
    private int field2752 = 2048;

    @OriginalMember(owner = "client!di", name = "jb", descriptor = "Lla;")
    public static class103 field2747 = new class103();

    @OriginalMember(owner = "client!di", name = "rb", descriptor = "Lub;")
    public static class227 field2755 = class257.method1749("(U0a )2 via: ", 17263);

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "I")
    private int field2738;

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!di", name = "kb", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!di", name = "mb", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!di", name = "qb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (arg0) {
            this.method77(-39, 14);
        }
        ++field2737;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
    public static final void method994(int arg0) {
        class25.field414.method1728(true);
        if (arg0 != 0) {
            field2747 = null;
        }
        ++field2741;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BB)V")
    public static final void method995(byte[] arg0, byte arg1) {
        int var2 = -40 % ((arg1 - 67) / 42);
        ++field2748;
        int var3 = 0;
        while (true) {
            while (var3 < arg0.length) {
                int var4 = -class86.field1492 + 64 * (255 & arg0[var3++]);
                int var5 = -class257.field4499 + 64 * (arg0[var3++] & 255);
                if (~var4 < -1 && var5 > 0 && var4 + 64 < class249.field4322 && ~class45.field753 < ~(var5 + 64)) {
                    int var6 = class45.field753 - var5 + -1 >> 6;
                    int var7 = var4 >> 6;
                    for (int var8 = 0; var8 < 64; ++var8) {
                        for (int var9 = -64; var9 < 0; ++var9) {
                            byte var10 = arg0[var3++];
                            if (var10 != 0) {
                                if (class25.field417[var7][var6] == null) {
                                    class25.field417[var7][var6] = new byte[4096];
                                }
                                class25.field417[var7][var6][(-(var9 + 1) << 6) - -var8] = var10;
                                byte var11 = arg0[var3++];
                                if (class255.field4478[var7][var6] == null) {
                                    class255.field4478[var7][var6] = new byte[4096];
                                }
                                class255.field4478[var7][var6][(-(var9 + 1) << 6) - -var8] = var11;
                            }
                        }
                    }
                } else {
                    for (int var12 = -4096; ~var12 > -1; ++var12) {
                        byte var13 = arg0[var3++];
                        if (~var13 != -1) {
                            ++var3;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZIILjava/util/Random;[[III)V")
    private final void method996(boolean arg0, int arg1, int arg2, Random arg3, int[][] arg4, int arg5, int arg6) {
        if (arg0) {
            method994(-83);
        }
        ++field2744;
        int var8 = this.field2753 <= 0 ? 4096 : -class210.method1342(-110, arg3, this.field2753) + 4096;
        int var9 = this.field2751 * this.field2738 >> 12;
        int var10 = this.field2738 + -(var9 <= 0 ? 0 : class210.method1342(-109, arg3, var9));
        if (~arg1 <= ~class212.field3586) {
            arg1 -= class212.field3586;
        }
        if (~var10 < -1) {
            if (arg5 > 0 && arg2 > 0) {
                int var11 = arg2 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var10 >= ~var11 ? var10 : var11;
                int var14 = var12 < var10 ? var12 : var10;
                int var15 = arg1 - -var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; ~var17 > ~arg5; ++var17) {
                    int[] var18 = arg4[arg6 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field2739 != -1) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class76.method446(arg1 + var20, class179.field3062)] = var18[class76.method446(class179.field3062, arg1 - -arg2 + -1 + -var20)] = ~var19 >= ~var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class76.method446(class179.field3062, arg1 + var22)] = var18[class76.method446(arg1 - -arg2 + -var22 + -1, class179.field3062)] = var19 * var24 >> 12;
                            }
                        }
                        if (class212.field3586 < var15 + var16) {
                            int var23 = class212.field3586 - var15;
                            class68.method425(var18, var15, var23, var19);
                            class68.method425(var18, 0, -var23 + var16, var19);
                        } else {
                            class68.method425(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg5 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field2739 != -1) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class76.method446(arg1 + var27, class179.field3062)] = var18[class76.method446(class179.field3062, -var27 + arg2 + arg1 + -1)] = ~var26 < ~var28 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class76.method446(class179.field3062, arg1 - -var29)] = var18[class76.method446(arg1 - var29 + arg2 + -1, class179.field3062)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class212.field3586 <= ~(var15 + var16)) {
                                class68.method425(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class212.field3586;
                                class68.method425(var18, var15, var30, var26);
                                class68.method425(var18, 0, var16 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class76.method446(class179.field3062, arg1 + var32)] = var18[class76.method446(class179.field3062, arg1 - var32 + arg2 + -1)] = var8 * var32 / var13;
                            }
                            if (~(var15 - -var16) >= ~class212.field3586) {
                                class68.method425(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class212.field3586;
                                class68.method425(var18, var15, var33, var8);
                                class68.method425(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class212.field3586 <= ~(arg1 + arg2)) {
            for (int var34 = 0; arg5 > var34; ++var34) {
                class68.method425(arg4[arg6 + var34], arg1, arg2, var8);
            }
        } else {
            int var35 = class212.field3586 - arg1;
            for (int var36 = 0; var36 < arg5; ++var36) {
                int[] var37 = arg4[arg6 + var36];
                class68.method425(var37, arg1, var35, var8);
                class68.method425(var37, 0, -var35 + arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(I)V")
    public static void method997(int arg0) {
        if (arg0 > -2) {
            method999(-10, 59);
        }
        field2755 = null;
        field2747 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)V")
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2750;
        for (int var6 = arg3; ~arg5 <= ~var6; ++var6) {
            class246.method1644(arg1, class59.field1094[var6], arg2, arg0, 1);
        }
        if (arg4 != -3) {
            method995((byte[]) null, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field2754;
        int[] var3 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = super.field4215.method986((byte) -111);
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class212.field3586 * this.field2740 >> 12;
            int var15 = class193.field3280 * this.field2746 >> 12;
            int var16 = class193.field3280 * this.field2743 >> 12;
            int var17 = class212.field3586 * this.field2752 >> 12;
            if (~var16 >= -2) {
                return var8[arg1];
            }
            this.field2738 = class212.field3586 / 8 * this.field2749 >> 12;
            int var18 = class212.field3586 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field2736);
            int[][] var21 = new int[var18][3];
            label123: while (true) {
                while (true) {
                    int var22 = class210.method1342(-106, var20, var17 - var14) + var14;
                    int var23 = class210.method1342(11, var20, -var15 + var16) + var15;
                    int var24 = var10 + var22;
                    if (class212.field3586 < var24) {
                        var24 = class212.field3586;
                        var22 = -var10 + class212.field3586;
                    }
                    int var25;
                    if (var12) {
                        var25 = 0;
                    } else {
                        int var26 = var7;
                        int[] var27 = var19[var7];
                        var25 = var27[2];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (var29 < 0) {
                            var29 += class212.field3586;
                        }
                        if (var29 > class212.field3586) {
                            var29 -= class212.field3586;
                        }
                        while (true) {
                            int[] var30 = var19[var26];
                            if (~var30[0] >= ~var29 && var30[1] >= var29) {
                                if (~var7 != ~var26) {
                                    int var31 = var5 + var10;
                                    if (~var31 > -1) {
                                        var31 += class212.field3586;
                                    }
                                    if (~class212.field3586 > ~var31) {
                                        var31 -= class212.field3586;
                                    }
                                    for (int var32 = 1; var28 >= var32; ++var32) {
                                        int[] var40 = var19[(var7 + var32) % var11];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var28 >= var33; ++var33) {
                                        int[] var34 = var19[(var7 + var33) % var11];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var29 <= var31) {
                                                if (~var36 == -1) {
                                                    var38 = Math.min(var29, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class212.field3586;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var29, var37);
                                            }
                                            this.method996(false, var6 + var39, -var39 + var38, var20, var8, -var35 + var25, var35);
                                        }
                                    }
                                }
                                var7 = var26;
                                break;
                            }
                            ++var26;
                            if (~var26 <= ~var11) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~(var23 + var25) < ~class193.field3280) {
                        var23 = class193.field3280 - var25;
                    } else {
                        var9 = false;
                    }
                    if (class212.field3586 == var24) {
                        this.method996(false, var4 + var10, var22, var20, var8, var23, var25);
                        if (var9) {
                            break label123;
                        }
                        var6 = var4;
                        var9 = true;
                        var7 = 0;
                        var12 = false;
                        int[] var41 = var21[var13++];
                        var41[1] = var24;
                        var11 = var13;
                        var41[0] = var10;
                        var13 = 0;
                        int[][] var42 = var19;
                        var41[2] = var23 + var25;
                        var19 = var21;
                        var4 = class210.method1342(-119, var20, class212.field3586);
                        var10 = 0;
                        var5 = -var6 + var4;
                        var21 = var42;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class212.field3586 + var5;
                        }
                        if (~class212.field3586 > ~var43) {
                            var43 -= class212.field3586;
                        }
                        while (true) {
                            int[] var44 = var19[var7];
                            if (~var43 <= ~var44[0] && ~var44[1] <= ~var43) {
                                break;
                            }
                            int var10000 = ~var11;
                            ++var7;
                            if (var10000 >= ~var7) {
                                var7 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var21[var13++];
                        var45[0] = var10;
                        var45[1] = var24;
                        var45[2] = var23 + var25;
                        this.method996(false, var10 - -var4, var22, var20, var8, var23, var25);
                        var10 = var24;
                    }
                }
            }
        }
        int var46 = 55 % ((-15 - arg0) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)V")
    public static final void method999(int arg0, int arg1) {
        ++field2742;
        int var2 = 82 % ((-40 - arg1) / 47);
        class163 var3;
        if (class167.field2798 == null) {
            var3 = new class163(512, 512);
        } else {
            var3 = (class163) class167.field2798;
        }
        int[] var4 = var3.field2756;
        int var5 = var4.length;
        for (int var6 = 0; var6 < var5; ++var6) {
            var4[var6] = 1;
        }
        for (int var7 = 1; var7 < 103; ++var7) {
            int var25 = (-var7 + 103) * 2048 + 24628;
            for (int var26 = 1; ~var26 > -104; ++var26) {
                if (~(class40.field654[arg0][var26][var7] & 24) == -1) {
                    class112.method716(var4, var25, 512, arg0, var26, var7);
                }
                if (~arg0 > -4 && ~(class40.field654[arg0 + 1][var26][var7] & 8) != -1) {
                    class112.method716(var4, var25, 512, arg0 + 1, var26, var7);
                }
                var25 += 4;
            }
        }
        var3.method1016();
        int var8 = (238 - -((int) (20.0D * Math.random())) + -10 << 16) - (-(-10 + (int) (Math.random() * 20.0D) + 238 << 8) - 238 - ((int) (20.0D * Math.random()) - 10));
        int var9 = (int) (20.0D * Math.random()) + 228 << 16;
        for (int var10 = 1; var10 < 103; ++var10) {
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((class40.field654[arg0][var24][var10] & 24) == 0) {
                    class214.method1361(var8, var9, (byte) 125, var10, var24, arg0);
                }
                if (arg0 < 3 && (class40.field654[arg0 - -1][var24][var10] & 8) != 0) {
                    class214.method1361(var8, var9, (byte) 125, var10, var24, arg0 + 1);
                }
            }
        }
        class40.field663 = 0;
        for (int var11 = 0; var11 < 104; ++var11) {
            for (int var12 = 0; var12 < 104; ++var12) {
                long var13 = class49.method290(class64.field1171, var11, var12);
                if (var13 != 0L) {
                    class45 var15 = class220.method1389(Integer.MAX_VALUE & (int) (var13 >>> 32), (byte) -104);
                    int var16 = var15.field746;
                    if (var15.field754 != null) {
                        for (int var17 = 0; var17 < var15.field754.length; ++var17) {
                            if (var15.field754[var17] != -1) {
                                class45 var18 = class220.method1389(var15.field754[var17], (byte) -116);
                                if (~var18.field746 <= -1) {
                                    var16 = var18.field746;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var16 <= -1) {
                        int var19 = var11;
                        int var20 = var12;
                        if (~var16 != -23 && ~var16 != -30 && ~var16 != -35 && ~var16 != -37 && var16 != 46 && ~var16 != -48 && var16 != 48) {
                            int[][] var21 = class78.field1370[class64.field1171].field2338;
                            for (int var22 = 0; ~var22 > -11; ++var22) {
                                int var23 = (int) (4.0D * Math.random());
                                if (~var23 == -1 && ~var19 < -1 && var11 + -3 < var19 && ~(var21[var19 + -1][var20] & 19661064) == -1) {
                                    --var19;
                                }
                                if (~var23 == -2 && ~var19 > -104 && var11 + 3 > var19 && (19661184 & var21[var19 + 1][var20]) == 0) {
                                    ++var19;
                                }
                                if (~var23 == -3 && ~var20 < -1 && var20 > var12 + -3 && (var21[var19][var20 + -1] & 19661058) == 0) {
                                    --var20;
                                }
                                if (~var23 == -4 && var20 < 103 && ~var20 > ~(var12 + 3) && ~(19661088 & var21[var19][var20 + 1]) == -1) {
                                    ++var20;
                                }
                            }
                        }
                        class19.field330[class40.field663] = var15.field743;
                        class12.field229[class40.field663] = var19;
                        class140.field2422[class40.field663] = var20;
                        ++class40.field663;
                    }
                }
            }
        }
        class167.field2798 = var3;
        class14.field263.method1203(-1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field2753 = arg0.method1447(0);
                                        }
                                    } else {
                                        this.field2751 = arg0.method1447(0);
                                    }
                                } else {
                                    this.field2739 = arg0.method1471(255);
                                }
                            } else {
                                this.field2749 = arg0.method1447(0);
                            }
                        } else {
                            this.field2743 = arg0.method1447(0);
                        }
                    } else {
                        this.field2746 = arg0.method1447(0);
                    }
                } else {
                    this.field2752 = arg0.method1447(0);
                }
            } else {
                this.field2740 = arg0.method1447(0);
            }
        } else {
            this.field2736 = arg0.method1471(255);
        }
        if (arg1) {
            this.method81((class226) null, true, -121);
        }
        ++field2745;
    }
}
