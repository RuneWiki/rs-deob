import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class659 {

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "Lsm;")
    private class262 field9351;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "Lno;")
    private class658 field9346;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public int field9341;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    private int field9347;

    @OriginalMember(owner = "client!waa", name = "r", descriptor = "I")
    private int field9357;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "[B")
    public byte[] field9355;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    private int field9352;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "I")
    private int field9340;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "I")
    public static int field9350 = 0;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "I")
    public static int field9348;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!waa", name = "t", descriptor = "I")
    public static int field9359;

    @OriginalMember(owner = "client!waa", name = "s", descriptor = "[[Lwv;")
    private class32[][] field9358;

    @OriginalMember(owner = "client!waa", name = "q", descriptor = "[[Z")
    public static boolean[][] field9356;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(B)V")
    public final void method3686(byte arg0) {
        this.field9358 = new class32[this.field9352][this.field9340];
        field9345++;
        for (int var2 = 0; var2 < this.field9340; var2++) {
            for (int var3 = 0; var3 < this.field9352; var3++) {
                this.field9358[var3][var2] = new class32(this.field9346, this, this.field9351, var3, var2, this.field9357, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 < 87) {
            this.method3694(57, null, 74, -54);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(III[[ZIZ)V")
    public final void method3687(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4, boolean arg5) {
        field9344++;
        this.field9346.method3653(false, 1000);
        if (arg0 != 0) {
            return;
        }
        this.field9346.method3680(-122, false);
        this.field9346.method3679(-119, -2);
        this.field9346.method3603((byte) -34, 1);
        this.field9346.method3646(-2, 1);
        float var7 = 1.0F / (float) (this.field9346.field9183 * 128);
        if (arg5) {
            for (int var22 = 0; var22 < this.field9340; var22++) {
                int var23 = var22 << this.field9357;
                int var24 = var22 + 1 << this.field9357;
                label88: for (int var25 = 0; var25 < this.field9352; var25++) {
                    int var26 = var25 << this.field9357;
                    int var27 = var25 + 1 << this.field9357;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (var28 - arg1 >= -arg2 && arg2 >= (var28 - arg1)) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg4 >= -arg2 && arg2 >= (var29 - arg4) && arg3[arg2 + var28 - arg1][var29 + arg2 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field9358[var25][var22].method263((byte) 72);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field9340; var8++) {
                int var9 = var8 << this.field9357;
                int var10 = var8 + 1 << this.field9357;
                for (int var11 = 0; var11 < this.field9352; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field9357;
                    int var14 = var11 + 1 << this.field9357;
                    class85 var15 = this.field9346.field9278;
                    var15.field4619 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if ((var16 - arg4) >= (-arg2) && (var16 - arg4) <= arg2) {
                            int var17 = this.field9351.field2247 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if ((var18 - arg1) >= (-arg2) && (var18 - arg1) <= arg2 && arg3[var18 + arg2 - arg1][var16 + arg2 - arg4]) {
                                    short[] var19 = this.field9351.field3599[var17];
                                    if (var19 != null) {
                                        if (this.field9346.field9272) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method2031((byte) 54, var19[var20] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method2008(27798, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field9358[var11][var8].method264(-128, var12, 5123, var15.field4600);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIBII)V")
    private final void method3688(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9354++;
        if (arg2 < 30) {
            this.method3687(-88, -117, -2, null, -30, true);
        }
        if (this.field9358 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        int var9 = arg3 + arg0 - 2 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class32[] var11 = this.field9358[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field510 = true;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method3689(int arg0, short[] arg1, int arg2) {
        field9343++;
        short[] var3 = new short[arg0];
        class83.method688(arg1, 0, var3, 0, arg0);
        return arg2 == -16036 ? var3 : null;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lw;III)Z")
    public final boolean method3690(class276 arg0, int arg1, int arg2, int arg3) {
        field9359++;
        class548 var5 = (class548) arg0;
        int var6 = var5.field7306 + arg2 + 1;
        int var7 = var5.field7317 + arg3 + 1;
        int var8 = var7 + (this.field9341 * var6);
        int var9 = var5.field7308;
        int var10 = var5.field7305;
        int var11 = this.field9341 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field9341 * var12;
            var6 = 1;
            var9 -= var12;
        }
        if (arg1 != -20262) {
            this.field9347 = 34;
        }
        if (this.field9347 <= var6 + var9) {
            int var13 = var6 + var9 + 1 - this.field9347;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
        }
        if (this.field9341 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field9341;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field9341 + var11;
            return class464.method2626(74, var16, var8, var9, var10, this.field9355, var17);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3691(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9342++;
        if (!arg4 && class466.field6278 == arg3 && class571.field7588 == arg1 && class669.field9491 == class29.field476 || class344.field4718.method1553(class571.field7587, arg2 - 2570)) {
            return;
        }
        class669.field9491 = class29.field476;
        class571.field7588 = arg1;
        class466.field6278 = arg3;
        if (class344.field4718.method1553(class571.field7587, -2058)) {
            class669.field9491 = 0;
        }
        class472.method2658(arg2 + 18581, arg0);
        class172.method1166((byte) -44, class72.field1076.method546(class516.field6892, (byte) -35), true, class10.field197, class188.field2788, class665.field9437);
        int var5 = class473.field6334;
        class473.field6334 = (class466.field6278 - (class34.field530 >> 4)) * 8;
        int var6 = class233.field3269;
        class233.field3269 = (class571.field7588 - (class34.field531 >> 4)) * 8;
        class529.field7057 = class567.method3124(class466.field6278 * 8, class571.field7588 * 8);
        class304.field4221 = null;
        int var7 = class473.field6334 - var5;
        int var8 = class233.field3269 - var6;
        if (arg0 == 11) {
            for (int var9 = 0; var9 < class176.field2705; var9++) {
                class280 var10 = class51.field718[var9];
                if (var10 != null) {
                    class287 var11 = var10.field3983;
                    for (int var12 = 0; var12 < 10; var12++) {
                        var11.field5643[var12] -= var7;
                        var11.field5649[var12] -= var8;
                    }
                    var11.field8620 -= var7 * 512;
                    var11.field8612 -= var8 * 512;
                }
            }
        } else {
            boolean var13 = false;
            class92.field1396 = 0;
            int var14 = class34.field530 * 512 - 512;
            int var15 = (class34.field531 - 1) * 512;
            for (int var16 = 0; var16 < class176.field2705; var16++) {
                class280 var29 = class51.field718[var16];
                if (var29 != null) {
                    class287 var30 = var29.field3983;
                    var30.field8612 -= var8 * 512;
                    var30.field8620 -= var7 * 512;
                    if (var30.field8620 >= 0 && var30.field8620 <= var14 && var30.field8612 >= 0 && var30.field8612 <= var15) {
                        boolean var31 = true;
                        for (int var32 = 0; var32 < 10; var32++) {
                            var30.field5643[var32] -= var7;
                            var30.field5649[var32] -= var8;
                            if (var30.field5643[var32] < 0 || var30.field5643[var32] >= class34.field530 || var30.field5649[var32] < 0 || var30.field5649[var32] >= class34.field531) {
                                var31 = false;
                            }
                        }
                        if (var31) {
                            class415.field5681[class92.field1396++] = var30.field5633;
                        } else {
                            var30.method1777((byte) -78, null);
                            var29.method2797(arg2 ^ 0x24A);
                            var13 = true;
                        }
                    } else {
                        var30.method1777((byte) -67, null);
                        var29.method2797(arg2 - 627);
                        var13 = true;
                    }
                }
            }
            if (var13) {
                class176.field2705 = class616.field8143.method2920(false);
                class616.field8143.method2913(class51.field718, arg2 - 512);
            }
        }
        if (arg2 != 512) {
            return;
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class403 var27 = class572.field7601[var17];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field5643[var28] -= var7;
                    var27.field5649[var28] -= var8;
                }
                var27.field8612 -= var8 * 512;
                var27.field8620 -= var7 * 512;
            }
        }
        class149[] var18 = class129.field2154;
        for (int var19 = 0; var19 < var18.length; var19++) {
            class149 var26 = var18[var19];
            if (var26 != null) {
                var26.field2390 -= var8 * 512;
                var26.field2377 -= var7 * 512;
            }
        }
        for (class135 var20 = (class135) class94.field1444.method3257(-123); var20 != null; var20 = (class135) class94.field1444.method3263((byte) -102)) {
            var20.field2195 -= var7;
            var20.field2198 -= var8;
            if (class409.field5528 != 4 && (var20.field2195 < 0 || var20.field2198 < 0 || class34.field530 <= var20.field2195 || var20.field2198 >= class34.field531)) {
                var20.method2797(113);
            }
        }
        if (class409.field5528 != 4) {
            for (class354 var21 = (class354) class262.field3643.method2915(116); var21 != null; var21 = (class354) class262.field3643.method2912((byte) 100)) {
                int var22 = (int) (var21.field6724 & 0x3FFFL);
                int var23 = var22 - class473.field6334;
                int var24 = (int) (var21.field6724 >> 14 & 0x3FFFL);
                int var25 = var24 - class233.field3269;
                if (var23 < 0 || var25 < 0 || var23 >= class34.field530 || var25 >= class34.field531) {
                    var21.method2797(arg2 - 458);
                }
            }
        }
        if (class123.field2061 != 0) {
            class123.field2061 -= var7;
            class476.field6353 -= var8;
        }
        class660.method3700((byte) 122);
        if (arg0 != 11) {
            class438.field6035 -= var7;
            class317.field4363 -= var8;
            class259.field3563 -= var7 * 512;
            class643.field8632 -= var8 * 512;
            class561.field7431 -= var8;
            class37.field560 -= var7;
            if (Math.abs(var7) > class34.field530 || Math.abs(var8) > class34.field531) {
                class661.method3704(true);
            }
        } else if (class140.field2254 == 4) {
            class412.field5654 -= var8 * 512;
            class247.field3443 -= var7 * 512;
            class338.field4683 -= var8 * 512;
            class193.field2827 -= var7 * 512;
        } else {
            class173.field2668 = -1;
            class376.field5068 = -1;
            class140.field2254 = 1;
        }
        class42.method304(64);
        class75.method594((byte) -95);
        class666.field9449.method3255((byte) -116);
        class356.field4832.method3255((byte) -108);
        class346.field4757.method324(-98);
        class363.method2147(72);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IILw;I)V")
    public final void method3692(int arg0, int arg1, class276 arg2, int arg3) {
        field9353++;
        class548 var5 = (class548) arg2;
        int var6 = var5.field7317 + arg0 + 1;
        int var7 = var5.field7306 + arg1 + 1;
        int var8 = this.field9341 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7308;
        int var11 = var5.field7305;
        int var12 = this.field9341 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var7 = 1;
            var10 -= var13;
            var8 += this.field9341 * var13;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (arg3 != -3500) {
            this.method3687(116, 125, -28, null, -105, true);
        }
        if ((var7 + var10) >= this.field9347) {
            int var15 = var7 + var10 + (1 - this.field9347);
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
            var9 += var16;
        }
        if (this.field9341 <= var6 + var11) {
            int var17 = var6 + var11 - (this.field9341 - 1);
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class664.method3729(var5.field7312, var9, var12, var11, var10, this.field9355, var14, -2, var8);
            this.method3688(var10, var6, (byte) 46, var7, var11);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public static final void method3693(int arg0) {
        field9349++;
        if (class613.field8098 < 0) {
            class615.field8140 = -1;
            class613.field8098 = 0;
            class683.field9616 = -1;
        }
        if (class567.field7513 < class613.field8098) {
            class615.field8140 = -1;
            class613.field8098 = class567.field7513;
            class683.field9616 = -1;
        }
        if (class180.field2749 < 0) {
            class683.field9616 = -1;
            class615.field8140 = -1;
            class180.field2749 = 0;
        }
        if (class180.field2749 > class567.field7528) {
            class615.field8140 = -1;
            class683.field9616 = -1;
            class180.field2749 = class567.field7528;
        }
        if (arg0 != 1290) {
            field9350 = -54;
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILw;II)V")
    public final void method3694(int arg0, class276 arg1, int arg2, int arg3) {
        field9348++;
        class548 var5 = (class548) arg1;
        int var6 = var5.field7317 + arg3 + 1;
        int var7 = var5.field7306 + arg0 + 1;
        int var8 = this.field9341 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field7308;
        int var11 = var5.field7305;
        int var12 = this.field9341 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field9341 * var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = arg2;
        if (this.field9347 <= (var7 + var10)) {
            int var15 = var10 + var7 + 1 - this.field9347;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var6 = 1;
            var11 -= var16;
            var14 = arg2 + var16;
            var8 += var16;
        }
        if (this.field9341 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field9341;
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class692.method3843(var10, var11, var14, var8, (byte) -24, this.field9355, var5.field7312, var12, var9);
            this.method3688(var10, var6, (byte) 89, var7, var11);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)V")
    public static void method3695(int arg0) {
        field9356 = null;
        if (arg0 != 0) {
            method3695(13);
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lno;Lsm;)V")
    public class659(class658 arg0, class262 arg1) {
        this.field9351 = arg1;
        this.field9346 = arg0;
        this.field9341 = (this.field9351.field2250 * this.field9351.field2247 >> this.field9346.field9187) + 2;
        this.field9347 = (this.field9351.field2250 * this.field9351.field2248 >> this.field9346.field9187) + 2;
        this.field9357 = this.field9346.field9187 + 7 - this.field9351.field2245;
        this.field9355 = new byte[this.field9347 * this.field9341];
        this.field9352 = this.field9351.field2247 >> this.field9357;
        this.field9340 = this.field9351.field2248 >> this.field9357;
    }
}
