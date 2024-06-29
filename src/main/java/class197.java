import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class197 {

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "Ldia;")
    private class246 field2628;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "Lct;")
    private class156 field2633;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    private int field2640;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "[B")
    public byte[] field2638;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    private int field2627;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    private int field2629;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    private int field2631;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "Lib;")
    public static class164 field2634 = new class164("LIVE", "", "", 0);

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "[Z")
    public static boolean[] field2639;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "[[Lqia;")
    private class23[][] field2632;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2624++;
        if (arg3 != 7) {
            method1352((byte) 22);
        }
        for (int var6 = arg1; var6 <= arg5; var6++) {
            for (int var7 = arg2; var7 <= arg0; var7++) {
                if (class249.field3688[var6][var7] == arg4 && class72.field1010[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II[[ZIZZ)V")
    public final void method1350(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, boolean arg5) {
        field2635++;
        this.field2628.method1617(false, (byte) 104);
        this.field2628.method1583((byte) -68, false);
        this.field2628.method1640(-2, -113);
        if (!arg4) {
            return;
        }
        this.field2628.method1589(-4, 1);
        this.field2628.method1648(0, 1);
        float var7 = 1.0F / (float) (this.field2628.field3534 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field2631; var8++) {
                int var9 = var8 << this.field2627;
                int var10 = var8 + 1 << this.field2627;
                label135: for (int var11 = 0; var11 < this.field2629; var11++) {
                    int var12 = var11 << this.field2627;
                    int var13 = var11 + 1 << this.field2627;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((var14 - arg0) >= (-arg3) && (var14 - arg0) <= arg3) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((-arg3) <= (var15 - arg1) && arg3 >= var15 - arg1 && arg2[arg3 + var14 - arg0][arg3 + var15 - arg1]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2632[var11][var8].method185(0);
                                    continue label135;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2631; var16++) {
                int var17 = var16 << this.field2627;
                int var18 = var16 + 1 << this.field2627;
                for (int var19 = 0; var19 < this.field2629; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2627;
                    int var22 = var19 + 1 << this.field2627;
                    class406 var23 = this.field2628.field3639;
                    var23.field5459 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((var24 - arg1) >= (-arg3) && arg3 >= var24 - arg1) {
                            int var25 = this.field2633.field4301 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg0 >= -arg3 && var26 - arg0 <= arg3 && arg2[var26 + arg3 - arg0][var24 + arg3 - arg1]) {
                                    short[] var27 = this.field2633.field2121[var25];
                                    if (var27 != null) {
                                        if (this.field2628.field3588) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method2415(false, var27[var28] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var23.method2368(125, var27[var29] & 0xFFFF);
                                                var20++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field2632[var19][var16].method186(5123, 28752, var20, var23.field5518);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method1351(class195 arg0, int arg1, int arg2, int arg3) {
        field2626++;
        class262 var5 = (class262) arg0;
        int var6 = var5.field3895 + arg3 + 1;
        int var7 = var5.field3893 + arg2 + 1;
        int var8 = this.field2637 * var6 + var7;
        int var9 = var5.field3884;
        int var10 = var5.field3886;
        int var11 = this.field2637 - var10;
        if (var6 <= 0) {
            int var12 = 1 - var6;
            var8 += this.field2637 * var12;
            var6 = 1;
            var9 -= var12;
        }
        if ((var6 + var9) >= this.field2640) {
            int var13 = var6 + var9 + 1 - this.field2640;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var7 = 1;
            var11 += var14;
            var8 += var14;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field2637) {
            int var15 = var7 + var10 + 1 - this.field2637;
            var10 -= var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - arg1) * this.field2637 + var11;
            return class271.method1761(var9, var17, this.field2638, (byte) 113, var16, var8, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V")
    public static void method1352(byte arg0) {
        field2639 = null;
        if (arg0 > -68) {
            method1349(-66, -44, -10, -72, 87, -32);
        }
        field2634 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIII)V")
    private final void method1353(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2636++;
        if (this.field2632 == null || arg4 != 22345) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        int var7 = arg3 + arg0 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 - (1 - arg1) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class23[] var11 = this.field2632[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field361 = true;
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILr;I)V")
    public final void method1354(int arg0, int arg1, class195 arg2, int arg3) {
        field2630++;
        class262 var5 = (class262) arg2;
        int var6 = var5.field3895 + arg0 + 1;
        int var7 = var5.field3893 + arg3 + 1;
        int var8 = this.field2637 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3884;
        if (arg1 != -27552) {
            this.field2633 = null;
        }
        int var11 = var5.field3886;
        int var12 = this.field2637 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var8 += this.field2637 * var13;
            var9 += var11 * var13;
            var10 -= var13;
        }
        int var14 = 0;
        if (this.field2640 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field2640;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var12 += var16;
            var7 = 1;
            var9 += var16;
            var14 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (this.field2637 <= var7 + var11) {
            int var17 = var11 + var7 + 1 - this.field2637;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class554.method3130(var8, var14, var11, this.field2638, var9, var12, var10, var5.field3889, 123);
            this.method1353(var11, var10, var6, var7, 22345);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILr;II)V")
    public final void method1355(int arg0, class195 arg1, int arg2, int arg3) {
        field2641++;
        class262 var5 = (class262) arg1;
        int var6 = var5.field3895 + arg2 + 1;
        int var7 = var5.field3893 + arg3 + 1;
        if (arg0 < 40) {
            this.method1354(112, -96, null, 66);
        }
        int var8 = this.field2637 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field3884;
        int var11 = var5.field3886;
        int var12 = this.field2637 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var10 -= var13;
            var8 += this.field2637 * var13;
            var9 += var11 * var13;
            var6 = 1;
        }
        int var14 = 0;
        if (this.field2640 <= (var6 + var10)) {
            int var15 = var6 + var10 + 1 - this.field2640;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var11 -= var16;
            var8 += var16;
            var12 += var16;
            var14 += var16;
            var7 = 1;
            var9 += var16;
        }
        if ((var7 + var11) >= this.field2637) {
            int var17 = var7 + var11 + 1 - this.field2637;
            var14 += var17;
            var11 -= var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class69.method607(-852, var5.field3889, var12, var14, var8, var10, var9, var11, this.field2638);
            this.method1353(var11, var10, var6, var7, 22345);
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Ldia;Lct;)V")
    public class197(class246 arg0, class156 arg1) {
        this.field2628 = arg0;
        this.field2633 = arg1;
        this.field2637 = (this.field2633.field4301 * this.field2633.field4295 >> this.field2628.field3529) + 2;
        this.field2640 = (this.field2633.field4300 * this.field2633.field4295 >> this.field2628.field3529) + 2;
        this.field2638 = new byte[this.field2640 * this.field2637];
        this.field2627 = this.field2628.field3529 + 7 - this.field2633.field4297;
        this.field2629 = this.field2633.field4301 >> this.field2627;
        this.field2631 = this.field2633.field4300 >> this.field2627;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public final void method1356(int arg0) {
        field2625++;
        this.field2632 = new class23[this.field2629][this.field2631];
        int var2 = 0;
        if (arg0 != 128) {
            this.field2638 = null;
        }
        while (var2 < this.field2631) {
            for (int var3 = 0; var3 < this.field2629; var3++) {
                this.field2632[var3][var2] = new class23(this.field2628, this, this.field2633, var3, var2, this.field2627, var3 * 128 + 1, var2 * 128 + 1);
            }
            var2++;
        }
    }
}
