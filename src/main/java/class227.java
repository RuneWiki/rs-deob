import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class227 extends class285 {

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    private int field3619 = 4096;

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "Z")
    private boolean field3624 = true;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public static int field3622 = -1;

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "Ldb;")
    public static class102 field3621 = new class102(200);

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 6)
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([[F[[F[[IZIZIII[Z[IZ[[IBIZILrc;II[[FZ)V", line = 13)
    public static final void method1606(float[][] arg0, float[][] arg1, int[][] arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, boolean[] arg9, int[] arg10, boolean arg11, int[][] arg12, byte arg13, int arg14, boolean arg15, int arg16, class206 arg17, int arg18, int arg19, float[][] arg20, boolean arg21) {
        field3614++;
        int var22 = (arg5 ? 255 : 0) + (arg6 << 8);
        if (!arg3) {
            return;
        }
        int var23 = (arg15 ? 255 : 0) + (arg16 << 8);
        int var24 = (arg11 ? 255 : 0) + (arg4 << 8);
        int var25 = (arg14 << 8) + (arg21 ? 255 : 0);
        int[] var26 = new int[arg10.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg10[var27 + var27 + 1];
            int var29 = arg10[var27 + var27];
            int[][] var30 = arg12 == null || arg9 == null || !arg9[var27] ? arg2 : arg12;
            var26[var27] = class193.method1430(arg13, arg20, false, var25, var23, var28, arg1, true, arg8, (float) arg18, arg0, var22, var30, arg12, var24, arg19, var29, arg17);
        }
        arg17.method1497(arg7, arg8, arg19, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)[[I", line = 53)
    public final int[][] method62(byte arg0, int arg1) {
        field3615++;
        if (arg0 <= 121) {
            method1607((class7) null, 58, -27, 62);
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529) {
            int[] var4 = this.method2048(0, (byte) 125, arg1 - 1 & class32.field432);
            int[] var5 = this.method2048(0, (byte) 122, arg1);
            int[] var6 = this.method2048(0, (byte) 127, class32.field432 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class287.field4599; var10++) {
                int var11 = (var5[var10 + 1 & class112.field1717] - var5[class112.field1717 & var10 - 1]) * this.field3619;
                int var12 = (var6[var10] - var4[var10]) * this.field3619;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = var11 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field3624) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lj;III)V", line = 134)
    public static final void method1607(class7 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class45.field633) {
            class204 var4 = class324.field5032[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3347 != null && var4.field3347.field1728.method35()) {
                arg0.method40(var4.field3347.field1728, 128, 0, 0, true);
            }
        }
        if (arg3 < class45.field633) {
            class204 var5 = class324.field5032[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3347 != null && var5.field3347.field1728.method35()) {
                arg0.method40(var5.field3347.field1728, 0, 0, 128, true);
            }
        }
        if (arg2 < class45.field633 && arg3 < class158.field2618) {
            class204 var6 = class324.field5032[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3347 != null && var6.field3347.field1728.method35()) {
                arg0.method40(var6.field3347.field1728, 128, 0, 128, true);
            }
        }
        if (arg2 < class45.field633 && arg3 > 0) {
            class204 var7 = class324.field5032[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3347 != null && var7.field3347.field1728.method35()) {
                arg0.method40(var7.field3347.field1728, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V", line = 185)
    public static final void method1608(int[] arg0, byte arg1, Object[] arg2) {
        field3618++;
        if (arg1 < 113) {
            field3622 = -127;
        }
        class226.method1603(-21796, arg0.length - 1, 0, arg0, arg2);
    }

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "(I)V", line = 203)
    public static void method1609(int arg0) {
        field3621 = null;
        if (arg0 != 0) {
            field3621 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLjj;I)V", line = 224)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field3619 = arg1.method271(21081);
        } else if (arg2 == 1) {
            this.field3624 = arg1.method286((byte) -65) == 1;
        }
        field3623++;
        if (!arg0) {
            field3621 = (class102) null;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIIIZ)V", line = 255)
    public static final void method1610(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field3616++;
        if (!arg7 && class142.field2215 == arg5 && class63.field914 == arg4 && class236.field3781 == arg3 || class76.method518(arg1 - 18282)) {
            return;
        }
        class142.field2215 = arg5;
        class63.field914 = arg4;
        class236.field3781 = arg3;
        if (class76.method518(-19076)) {
            class236.field3781 = 0;
        }
        if (arg0) {
            class278.method2012(28, arg1 ^ 0xFFFFFC86);
        } else {
            class278.method2012(25, -89);
        }
        class138.method1025(arg1 + 27629, true, class108.field1605);
        int var8 = class70.field989;
        class70.field989 = (arg5 - 6) * 8;
        int var9 = class205.field3367;
        class205.field3367 = (arg4 - 6) * 8;
        class201.field3274 = class301.method2148(arg1 + 793, class63.field914 * 8, class142.field2215 * 8);
        int var10 = class70.field989 - var8;
        int var11 = class205.field3367 - var9;
        if (arg1 != -794) {
            method1607((class7) null, 4, -114, 56);
        }
        int var12 = class205.field3367;
        int var13 = class70.field989;
        class298.field4698 = null;
        if (arg0) {
            class233.field3736 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class234 var15 = class99.field1445[var14];
                if (var15 != null) {
                    var15.field4264 -= var11 * 128;
                    var15.field4255 -= var10 * 128;
                    if (var15.field4255 >= 0 && var15.field4255 <= 13184 && var15.field4264 >= 0 && var15.field4264 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field4248[var16] -= var10;
                            var15.field4184[var16] -= var11;
                        }
                        class142.field2225[class233.field3736++] = var14;
                    } else {
                        class99.field1445[var14].method1697(3734, (class256) null);
                        class99.field1445[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class234 var18 = class99.field1445[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field4248[var19] -= var10;
                        var18.field4184[var19] -= var11;
                    }
                    var18.field4264 -= var11 * 128;
                    var18.field4255 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class334 var21 = class74.field1049[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4248[var22] -= var10;
                    var21.field4184[var22] -= var11;
                }
                var21.field4264 -= var11 * 128;
                var21.field4255 -= var10 * 128;
            }
        }
        byte var23 = 104;
        class49.field698 = arg3;
        byte var24 = 0;
        byte var25 = 1;
        class191.field3129.method2335(arg2, arg6, false, (byte) 81);
        if (var10 < 0) {
            var23 = -1;
            var24 = 103;
            var25 = -1;
        }
        byte var26 = 1;
        byte var27 = 0;
        byte var28 = 104;
        if (var11 < 0) {
            var26 = -1;
            var28 = -1;
            var27 = 103;
        }
        for (int var29 = var24; var29 != var23; var29 += var25) {
            for (int var30 = var27; var30 != var28; var30 += var26) {
                int var31 = var10 + var29;
                int var32 = var30 + var11;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class108.field1593[var33][var29][var30] = class108.field1593[var33][var31][var32];
                    } else {
                        class108.field1593[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class327 var34 = (class327) class273.field4399.method1240(3); var34 != null; var34 = (class327) class273.field4399.method1235(false)) {
            var34.field5046 -= var11;
            var34.field5060 -= var10;
            if (var34.field5060 < 0 || var34.field5046 < 0 || var34.field5060 >= 104 || var34.field5046 >= 104) {
                var34.method1212((byte) 93);
            }
        }
        if (class256.field4110 != 0) {
            class256.field4110 -= var10;
            class98.field1408 -= var11;
        }
        if (arg0) {
            class89.field1235 -= var10;
            class120.field1825 -= var10 * 128;
            class167.field2763 -= var11;
            class260.field4150 -= var11 * 128;
            class196.field3198 -= var11;
            class309.field4814 -= var10;
        } else {
            class31.field423 = 1;
        }
        class135.field2148 = 0;
        if (class232.field3690 && arg0 && (Math.abs(var10) > 104 || Math.abs(var11) > 104)) {
            class196.method1441((byte) -78);
        }
        class5.field79 = -1;
        class45.field639.method1233(30602);
        class201.field3267.method1233(30602);
    }
}
