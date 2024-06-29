import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class488 {

    @OriginalMember(owner = "client!taa", name = "r", descriptor = "Z")
    public boolean field6292 = true;

    @OriginalMember(owner = "client!taa", name = "s", descriptor = "I")
    private int field6293 = -1;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "I")
    private int field6275;

    @OriginalMember(owner = "client!taa", name = "o", descriptor = "I")
    private int field6289;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "Lgd;")
    private class696 field6277;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "Lep;")
    private class392 field6279;

    @OriginalMember(owner = "client!taa", name = "p", descriptor = "I")
    public int field6290;

    @OriginalMember(owner = "client!taa", name = "m", descriptor = "Lw;")
    private class471 field6287;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    private int field6280;

    @OriginalMember(owner = "client!taa", name = "n", descriptor = "I")
    private int field6288;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "Ljj;")
    private class688 field6281;

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "[[I")
    public static int[][] field6276 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!taa", name = "t", descriptor = "Z")
    public static boolean field6294 = false;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!taa", name = "q", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V", line = 5)
    public final void method2727(int arg0) {
        field6278++;
        this.method2734(this.field6281, -22, this.field6290);
        if (arg0 > -97) {
            this.field6275 = 67;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIB)Z", line = 19)
    public static final boolean method2728(int arg0, int arg1, byte arg2) {
        if (arg2 != 27) {
            field6294 = false;
        }
        field6291++;
        return class530.method2902(arg1, arg0, (byte) 108) | (arg0 & 0x70000) != 0 || class781.method4286(arg0, arg1, (byte) 3);
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V", line = 31)
    private final void method2729(boolean arg0) {
        field6284++;
        if (!this.field6292) {
            return;
        }
        this.field6292 = false;
        byte[] var2 = this.field6279.field5165;
        if (!arg0) {
            this.field6292 = false;
        }
        int var3 = 0;
        int var4 = this.field6279.field5167;
        int var5 = this.field6279.field5167 * this.field6275 + this.field6289;
        for (int var6 = -128; var6 < 0; var6++) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field6287 != null && this.field6293 == var3) {
            this.field6292 = false;
            return;
        }
        this.field6293 = var3;
        int var7 = 0;
        int var8 = this.field6275 * var4 + this.field6289;
        if (!this.field6277.method1188(class483.field6239, (byte) -93, class73.field990)) {
            if (class295.field3748 == null) {
                class295.field3748 = new int[16384];
            }
            int[] var13 = class295.field3748;
            for (int var14 = -128; var14 < 0; var14++) {
                for (int var15 = -128; var15 < 0; var15++) {
                    if (var2[var8] == 0) {
                        int var16 = 0;
                        if (var2[var8 - 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var16++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var16++;
                        }
                        if (var2[var8 + var4] != 0) {
                            var16++;
                        }
                        var13[var7++] = var16 * 17 << 24;
                    } else {
                        var13[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field6279.field5167 - 128;
            }
            if (this.field6287 == null) {
                this.field6287 = this.field6277.method3719(128, class295.field3748, (byte) -117, 128, false);
                this.field6287.method1131(false, false, 116);
            } else {
                this.field6287.method1124(arg0, class295.field3748, 0, 128, 0, 128, 0, 128);
            }
            return;
        }
        if (class723.field9488 == null) {
            class723.field9488 = new byte[16384];
        }
        byte[] var9 = class723.field9488;
        for (int var10 = -128; var10 < 0; var10++) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var12++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var12++;
                    }
                    var9[var7++] = (byte) (var12 * 17);
                } else {
                    var9[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field6279.field5167 - 128;
        }
        if (this.field6287 == null) {
            this.field6287 = this.field6277.method3753(104, 128, class723.field9488, 128, class483.field6239, false);
            this.field6287.method1131(false, false, 78);
        } else {
            this.field6287.method1126(0, class483.field6239, 128, 0, (byte) -83, 128, class723.field9488, 0, 128);
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V", line = 200)
    public static void method2730(int arg0) {
        if (arg0 > -107) {
            field6294 = true;
        }
        field6276 = null;
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIB)V", line = 210)
    public static final void method2731(int arg0, int arg1, byte arg2) {
        field6285++;
        if ((class402.field5335 < class402.field5336)) {
            class402.field5335 = (float) ((double) class402.field5335 / 30.0D + (double) class402.field5335);
            if (class402.field5335 > class402.field5336) {
                class402.field5335 = class402.field5336;
            }
            class401.method2327(-1);
            class402.field5328 = (int) class402.field5335 >> 1;
            class402.field5334 = class337.method1944(class402.field5328, 9431);
        } else if (class402.field5335 > class402.field5336) {
            class402.field5335 = (float) ((double) class402.field5335 - (double) class402.field5335 / 30.0D);
            if (class402.field5336 > class402.field5335) {
                class402.field5335 = class402.field5336;
            }
            class401.method2327(-1);
            class402.field5328 = (int) class402.field5335 >> 1;
            class402.field5334 = class337.method1944(class402.field5328, 9431);
        }
        if (arg2 > -111) {
            return;
        }
        if (class490.field6304 != -1 && class774.field10556 != -1) {
            int var3 = class490.field6304 - class669.field8692;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class774.field10556 - class238.field3238;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class669.field8692 += var3;
            class238.field3238 += var4;
            if (var3 == 0 && var4 == 0) {
                class774.field10556 = -1;
                class490.field6304 = -1;
            }
            class401.method2327(-1);
        }
        if (class568.field7179 > 0) {
            class317.field3954--;
            if (class317.field3954 == 0) {
                class568.field7179--;
                class317.field3954 = 100;
            }
        } else {
            class670.field8696 = -1;
            class207.field2846 = -1;
        }
        if (!class686.field8838 || class565.field7168 == null) {
            return;
        }
        for (class212 var5 = (class212) class565.field7168.method3591(0); var5 != null; var5 = (class212) class565.field7168.method3600((byte) 121)) {
            class624 var6 = class402.field5322.method2323(var5.field2909.field3860, true);
            if (var5.method1411(arg1, arg0, (byte) -102)) {
                if (var6.field7914 != null) {
                    if (var6.field7914[4] != null) {
                        class259.method1655(var6.field7914[4], false, -1, -1, 6070, false, (long) var5.field2909.field3860, 0, 1006, (long) var5.field2909.field3860, var6.field7931, var6.field7926, true);
                    }
                    if (var6.field7914[3] != null) {
                        class259.method1655(var6.field7914[3], false, -1, -1, 6070, false, (long) var5.field2909.field3860, 0, 1008, (long) var5.field2909.field3860, var6.field7931, var6.field7926, true);
                    }
                    if (var6.field7914[2] != null) {
                        class259.method1655(var6.field7914[2], false, -1, -1, 6070, false, (long) var5.field2909.field3860, 0, 1004, (long) var5.field2909.field3860, var6.field7931, var6.field7926, true);
                    }
                    if (var6.field7914[1] != null) {
                        class259.method1655(var6.field7914[1], false, -1, -1, 6070, false, (long) var5.field2909.field3860, 0, 1010, (long) var5.field2909.field3860, var6.field7931, var6.field7926, true);
                    }
                    if (var6.field7914[0] != null) {
                        class259.method1655(var6.field7914[0], false, -1, -1, 6070, false, (long) var5.field2909.field3860, 0, 1007, (long) var5.field2909.field3860, var6.field7931, var6.field7926, true);
                    }
                }
                if (!var5.field2909.field3854) {
                    var5.field2909.field3854 = true;
                    class760.method4149(class474.field6162, var5.field2909.field3860, var6.field7931);
                }
                if (var5.field2909.field3854) {
                    class760.method4149(class176.field2316, var5.field2909.field3860, var6.field7931);
                }
            } else if (var5.field2909.field3854) {
                var5.field2909.field3854 = false;
                class760.method4149(class668.field8686, var5.field2909.field3860, var6.field7931);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "(I)I", line = 350)
    public static final int method2732(int arg0) {
        field6282++;
        return class596.field7567 == arg0 ? class386.field4933 : class524.field6671;
    }

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "(I)V", line = 362)
    public static final void method2733(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field6283++;
        if (class308.field3865 == null) {
            return;
        }
        if (class308.field3865.field4144 == 1) {
            class308.field3865 = null;
            return;
        }
        if (class308.field3865.field4144 == 2) {
            class289.method1755(class552.field6961, class266.field3531, false, 2);
            class308.field3865 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Ljj;II)V", line = 399)
    public final void method2734(class688 arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            this.method2729(true);
            this.field6277.method3756(10, this.field6287);
            this.field6277.method1151(0, this.field6288 + 1 - this.field6280, this.field6280, class279.field3624, false, arg0, arg2);
        }
        if (arg1 >= -15) {
            this.field6293 = -38;
        }
        field6286++;
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lgd;Lep;Lrd;IIIII)V", line = 432)
    public class488(class696 arg0, class392 arg1, class574 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6275 = arg7;
        this.field6289 = arg6;
        this.field6277 = arg0;
        this.field6279 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field4366 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7288[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field6290 = 0;
            this.field6287 = null;
        } else {
            this.field6280 = Integer.MAX_VALUE;
            this.field6288 = Integer.MIN_VALUE;
            this.field6281 = this.field6277.method1179(false, 111);
            this.field6281.method2016(var10, -118);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field6281.method2014(true, true);
                if (var15 != null) {
                    Stream var16 = this.field6277.method3773(var15, (byte) -82);
                    if (Stream.method2528()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field4366 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7288[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field6280 > var28) {
                                            this.field6280 = var28;
                                        }
                                        if (this.field6288 < var28) {
                                            this.field6288 = var28;
                                        }
                                        var16.method2525(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field4366 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7288[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field6280 > var22) {
                                            this.field6280 = var22;
                                        }
                                        if (var22 > this.field6288) {
                                            this.field6288 = var22;
                                        }
                                        var16.method2516(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method2519();
                    if (this.field6281.method2017(28359)) {
                        break;
                    }
                }
            }
            this.field6290 = var10 / 3;
        }
    }
}
