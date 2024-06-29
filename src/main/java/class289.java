import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class289 {

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "Lok;")
    private class228 field4292;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "Lvfa;")
    private class623 field4289;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public int field4297;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "[B")
    public byte[] field4291;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    private int field4288;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    private int field4286;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    private int field4296;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "Lnea;")
    public static class664 field4298 = new class664(63, 0);

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "[[Lvaa;")
    private class432[][] field4293;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lha;IIB)V")
    public final void method1841(class54 arg0, int arg1, int arg2, byte arg3) {
        field4285++;
        class520 var5 = (class520) arg0;
        int var6 = var5.field7327 + arg1 + 1;
        int var7 = var5.field7331 + arg2 + 1;
        int var8 = var6 + (this.field4297 * var7);
        int var9 = 0;
        int var10 = var5.field7321;
        int var11 = var5.field7325;
        int var12 = this.field4297 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field4297 * var14;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field4284) {
            int var15 = var7 + var10 + 1 - this.field4284;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var8 += var16;
            var6 = 1;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
        }
        if (this.field4297 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field4297;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 <= 0 || var10 <= 0) {
            return;
        }
        class57.method618(var11, var13, var10, (byte) -20, var5.field7332, this.field4291, var8, var9, var12);
        if (arg3 != 107) {
            this.field4293 = null;
        }
        this.method1845(var10, var7, var6, var11, false);
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(Lha;IIB)V")
    public final void method1842(class54 arg0, int arg1, int arg2, byte arg3) {
        field4282++;
        class520 var5 = (class520) arg0;
        int var6 = var5.field7331 + arg2 + 1;
        int var7 = var5.field7327 + arg1 + 1;
        int var8 = this.field4297 * var6 + var7;
        int var9 = 0;
        int var10 = var5.field7321;
        int var11 = var5.field7325;
        int var12 = this.field4297 - var11;
        if (var6 <= 0) {
            int var13 = 1 - var6;
            var6 = 1;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field4297 * var13;
        }
        int var14 = 0;
        if ((var6 + var10) >= this.field4284) {
            int var15 = var6 + var10 + 1 - this.field4284;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var8 += var16;
            var14 += var16;
            var7 = 1;
            var9 += var16;
            var12 += var16;
            var11 -= var16;
        }
        if (arg3 < 20) {
            this.method1841(null, 6, -105, (byte) -93);
        }
        if ((var7 + var11) >= this.field4297) {
            int var17 = var7 + var11 + 1 - this.field4297;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class181.method1223(var9, 108, var14, this.field4291, var10, var5.field7332, var12, var11, var8);
            this.method1845(var10, var6, var7, var11, false);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public final void method1843(byte arg0) {
        if (arg0 != 85) {
            this.method1841(null, 106, -40, (byte) 22);
        }
        this.field4293 = new class432[this.field4286][this.field4296];
        field4283++;
        for (int var2 = 0; var2 < this.field4296; var2++) {
            for (int var3 = 0; var3 < this.field4286; var3++) {
                this.field4293[var3][var2] = new class432(this.field4292, this, this.field4289, var3, var2, this.field4288, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lmo;ZI)V")
    public static final void method1844(class695 arg0, boolean arg1, int arg2) {
        field4287++;
        if (!arg1) {
            field4298 = null;
        }
        if (class68.field1242 == null) {
            return;
        }
        try {
            class68.field1242.method2533(0L, 0);
            class68.field1242.method2537(false, arg0.field9796, arg2, 24);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIIIZ)V")
    private final void method1845(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4299++;
        if (this.field4293 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg2 + arg3 - 1 - 1 >> 7;
        int var8 = arg1 - 1 >> 7;
        int var9 = arg1 - (1 - arg0) - 1 >> 7;
        if (arg4) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class432[] var11 = this.field4293[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field6324 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V")
    public static void method1846(boolean arg0) {
        field4298 = null;
        if (arg0) {
            field4298 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method1847(int arg0, int arg1, class54 arg2, int arg3) {
        field4294++;
        class520 var5 = (class520) arg2;
        int var6 = var5.field7331 + arg0 + 1;
        int var7 = var5.field7327 + arg1 + 1;
        int var8 = this.field4297 * var6 + var7;
        int var9 = var5.field7321;
        if (arg3 < 87) {
            return true;
        }
        int var10 = var5.field7325;
        if (var6 <= 0) {
            int var11 = 1 - var6;
            var9 -= var11;
            var8 += this.field4297 * var11;
            var6 = 1;
        }
        int var12 = this.field4297 - var10;
        if ((var6 + var9) >= this.field4284) {
            int var13 = var6 + var9 + 1 - this.field4284;
            var9 -= var13;
        }
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += var14;
            var7 = 1;
            var10 -= var14;
            var12 += var14;
        }
        if (var7 + var10 >= this.field4297) {
            int var15 = var7 + var10 + 1 - this.field4297;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field4297 + var12;
            return class12.method66((byte) -1, this.field4291, var16, var8, var9, var17, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static final void method1848(int arg0) {
        field4290++;
        if (class553.field7840) {
            return;
        }
        if (arg0 >= -63) {
            field4298 = null;
        }
        class553.field7840 = true;
        if (class287.field4270.field3685) {
            class630.field8811 = ((int) class630.field8811 - 65 & 0xFFFFFF80);
        } else {
            class706.field9931 += (-class706.field9931 - 24.0F) / 2.0F;
        }
        class700.field9892 = true;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(Lok;Lvfa;)V")
    public class289(class228 arg0, class623 arg1) {
        this.field4292 = arg0;
        this.field4289 = arg1;
        this.field4297 = (this.field4289.field631 * this.field4289.field629 >> this.field4292.field3404) + 2;
        this.field4284 = (this.field4289.field632 * this.field4289.field629 >> this.field4292.field3404) + 2;
        this.field4291 = new byte[this.field4297 * this.field4284];
        this.field4288 = this.field4292.field3404 + 7 - this.field4289.field625;
        this.field4286 = this.field4289.field631 >> this.field4288;
        this.field4296 = this.field4289.field632 >> this.field4288;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIII[[ZZ)V")
    public final void method1849(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, boolean arg5) {
        this.field4292.method1493(false, -94);
        field4295++;
        this.field4292.method1534(35, false);
        this.field4292.method1510((byte) -119, -2);
        this.field4292.method1497(1, (byte) -29);
        this.field4292.method1536(0, 1);
        float var7 = 1.0F / (float) (this.field4292.field3402 * 128);
        if (arg5) {
            for (int var8 = 0; var8 < this.field4296; var8++) {
                int var9 = var8 << this.field4288;
                int var10 = var8 + 1 << this.field4288;
                label136: for (int var11 = 0; var11 < this.field4286; var11++) {
                    int var12 = var11 << this.field4288;
                    int var13 = var11 + 1 << this.field4288;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg3 >= -arg0 && var14 - arg3 <= arg0) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg2 >= -arg0 && var15 - arg2 <= arg0 && arg4[var14 + arg0 - arg3][var15 + arg0 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field4293[var11][var8].method2575(true);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field4296; var16++) {
                int var17 = var16 << this.field4288;
                int var18 = var16 + 1 << this.field4288;
                for (int var19 = 0; var19 < this.field4286; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field4288;
                    int var22 = var19 + 1 << this.field4288;
                    class231 var23 = this.field4292.field3510;
                    var23.field9761 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (-arg0 <= var24 - arg2 && var24 - arg2 <= arg0) {
                            int var25 = this.field4289.field631 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if ((var26 - arg3) >= (-arg0) && arg0 >= (var26 - arg3) && arg4[var26 + arg0 - arg3][var24 + arg0 - arg2]) {
                                    short[] var27 = this.field4289.field8710[var25];
                                    if (var27 != null) {
                                        if (this.field4292.field3514) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method3852(false, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var20++;
                                                var23.method3843(var27[var28] & 0xFFFF, true);
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
                        this.field4293[var19][var16].method2574(-109, var20, 5123, var23.field9796);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        if (arg1 != -1) {
            this.method1849(97, 105, 63, -15, null, true);
        }
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }
}
