import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class373 extends class261 {

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "Ljq;")
    private class264 field5750;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "Lfh;")
    private class453 field5746;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "[I")
    public static int[] field5742 = new int[1];

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "Lcs;")
    private class426 field5748;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method1021(int arg0, int arg1, int arg2) {
        if ((arg2 & 1) == 1) {
            if (this.field5750.field4409) {
                super.field4358.method1471(true, this.field5750.field4410);
                class97.field1619[0] = 0.0F;
                class97.field1619[3] = (float) (super.field4358.field3602 % 4000) / 4000.0F;
                class97.field1619[1] = 0.0F;
                class97.field1619[2] = 0.0F;
                OpenGL.glTexGenfv(8194, 9473, class97.field1619, 0);
            } else {
                int var4 = super.field4358.field3602 % 4000 * 16 / 4000;
                super.field4358.method1471(true, this.field5750.field4414[var4]);
            }
        } else if (!this.field5750.field4409) {
            super.field4358.method1471(true, this.field5750.field4414[0]);
        } else {
            super.field4358.method1471(true, this.field5750.field4410);
            class97.field1619[3] = 0.0F;
            class97.field1619[1] = 0.0F;
            class97.field1619[0] = 0.0F;
            class97.field1619[2] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class97.field1619, 0);
        }
        int var5 = -88 % ((82 - arg1) / 41);
        ++field5749;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lih;Ljq;)V")
    public class373(class214 arg0, class264 arg1) {
        super(arg0);
        this.field5750 = arg1;
        this.method2345((byte) 95);
        this.field5746 = new class453(super.field4358, 6406, 2, new byte[] { 0, -1 }, 6406);
        this.field5746.method2712(5990, false);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZLbl;)V")
    public static final void method2344(int arg0, boolean arg1, class265 arg2) {
        ++field5745;
        if (~class480.field7080 > -401) {
            class510 var3 = arg2.field4430;
            if (var3.field7448 != null) {
                var3 = var3.method3000(arg0 + -1999, class327.field5160);
                if (var3 == null) {
                    return;
                }
            }
            if (var3.field7457) {
                String var4 = var3.field7445;
                if (var3.field7440 != 0) {
                    String var5 = class271.field4501 == class131.field2246 ? class475.field7030.method1954(class300.field4813, -30366) : class197.field3144.method1954(class300.field4813, -30366);
                    var4 = var4 + class261.method1748((byte) -124, var3.field7440, class302.field4850.field2658) + " (" + var5 + var3.field7440 + ")";
                }
                if (!class508.field7386) {
                    if (!arg1) {
                        String[] var6 = var3.field7413;
                        if (class420.field6351) {
                            var6 = class5.method22(var6, (byte) -119);
                        }
                        if (var6 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (var6[var7] != null && (~var3.field7452 == -1 || !var6[var7].equalsIgnoreCase(class237.field4099.method1954(class300.field4813, -30366)))) {
                                    byte var8 = 0;
                                    if (var7 == 0) {
                                        var8 = 12;
                                    }
                                    int var9 = class21.field229;
                                    if (var7 == 1) {
                                        var8 = 21;
                                    }
                                    if (var7 == 2) {
                                        var8 = 3;
                                    }
                                    if (var7 == 3) {
                                        var8 = 57;
                                    }
                                    if (~var3.field7450 == ~var7) {
                                        var9 = var3.field7467;
                                    }
                                    if (~var7 == -5) {
                                        var8 = 59;
                                    }
                                    if (var3.field7460 == var7) {
                                        var9 = var3.field7479;
                                    }
                                    class307.method1956(var8, true, -1, false, !var6[var7].equalsIgnoreCase(class237.field4099.method1954(class300.field4813, -30366)) ? var9 : var3.field7424, -1, 0, (long) arg2.field3130, 0, var6[var7], "<col=ffff00>" + var4);
                                    ++class451.field6737;
                                }
                            }
                        }
                        if (var3.field7452 == 1 && var6 != null) {
                            for (int var10 = 4; ~var10 <= -1; --var10) {
                                if (var6[var10] != null && var6[var10].equalsIgnoreCase(class237.field4099.method1954(class300.field4813, -30366))) {
                                    short var11 = 0;
                                    if (~class302.field4850.field2658 > ~var3.field7440) {
                                        var11 = 2000;
                                    }
                                    short var12 = 0;
                                    if (var10 == 0) {
                                        var12 = 12;
                                    }
                                    if (~var10 == -2) {
                                        var12 = 21;
                                    }
                                    if (var10 == 2) {
                                        var12 = 3;
                                    }
                                    if (var10 == 3) {
                                        var12 = 57;
                                    }
                                    if (var10 == 4) {
                                        var12 = 59;
                                    }
                                    if (var12 != 0) {
                                        var12 += var11;
                                    }
                                    class307.method1956(var12, true, -1, false, var3.field7424, -1, 0, (long) arg2.field3130, 0, var6[var10], "<col=ffff00>" + var4);
                                    ++class439.field6562;
                                }
                            }
                        }
                    }
                    class307.method1956(1010, true, -1, arg1, class124.field2168, -1, 0, (long) arg2.field3130, 0, class237.field4094.method1954(class300.field4813, -30366), "<col=ffff00>" + var4);
                    ++class525.field7716;
                } else if (!arg1) {
                    class223 var13 = class251.field4297 != -1 ? class213.field3383.method2258(true, class251.field4297) : null;
                    if (~(class313.field4934 & 2) != -1 && (var13 == null || ~var3.method3004(class251.field4297, var13.field3853, -54) != ~var13.field3853)) {
                        class307.method1956(5, true, -1, false, class208.field3282, -1, 0, (long) arg2.field3130, 0, class460.field6823, class15.field179 + " -> <col=ffff00>" + var4);
                        ++class284.field4640;
                    }
                }
                if (arg0 != 2000) {
                    field5740 = 93;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZ)V")
    public final void method1022(int arg0, boolean arg1) {
        int var3 = -115 % ((87 - arg0) / 37);
        super.field4358.method1482(260, 8960, 8448);
        ++field5747;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    private final void method2345(byte arg0) {
        ++field5744;
        this.field5748 = new class426(super.field4358, 2);
        this.field5748.method2604(14, 0);
        super.field4358.method1440(1, 0);
        super.field4358.method1482(7681, 8960, 260);
        super.field4358.method1474(0, 34168, -5000, 768);
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glEnable(3168);
        super.field4358.method1440(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 2.0F);
        if (this.field5750.field4409) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glTexGeni(8195, 9472, 9217);
            OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
            OpenGL.glEnable(3170);
            OpenGL.glEnable(3171);
        }
        this.field5748.method2601((byte) 122);
        this.field5748.method2604(arg0 ^ 81, 1);
        super.field4358.method1440(1, arg0 ^ 95);
        super.field4358.method1482(8448, arg0 + 8865, 8448);
        super.field4358.method1474(0, 5890, -5000, 768);
        OpenGL.glDisable(3168);
        super.field4358.method1440(0, 0);
        OpenGL.glTexEnvf(8960, 34163, 1.0F);
        if (this.field5750.field4409) {
            OpenGL.glDisable(3170);
            OpenGL.glDisable(3171);
        }
        this.field5748.method2601((byte) 122);
        if (arg0 != 95) {
            this.method1023(93);
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(III)Lhh;")
    public static final class125 method2346(int arg0, int arg1, int arg2) {
        class465 var3 = class66.field977[arg0][arg1][arg2];
        return var3 != null && var3.field6913 != null ? var3.field6913 : null;
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V")
    public final void method1023(int arg0) {
        ++field5741;
        this.field5748.method2603('\u0001', arg0 + -22213);
        if (~super.field4358.field3726 < -1) {
            super.field4358.method1440(1, 0);
            super.field4358.method1471(true, (class179) null);
            super.field4358.method1449(0.0F, arg0 ^ -17734, 1.0F);
            super.field4358.method1440(0, 0);
        }
        super.field4358.method1482(8448, 8960, 8448);
        OpenGL.glMatrixMode(5890);
        if (arg0 != 5000) {
            this.method1020(false, (byte) -3);
        }
        OpenGL.glPopMatrix();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        ++field5739;
        if (~super.field4358.field3726 < -1) {
            float var3 = -0.5F / (float) super.field4358.field3726;
            super.field4358.method1440(1, 0);
            class97.field1619[1] = 0.0F;
            class97.field1619[2] = var3;
            class97.field1619[3] = super.field4358.field3647 * var3 + 0.25F;
            class97.field1619[0] = 0.0F;
            OpenGL.glPushMatrix();
            OpenGL.glLoadIdentity();
            OpenGL.glTexGenfv(8192, 9474, class97.field1619, 0);
            OpenGL.glPopMatrix();
            super.field4358.method1449((float) super.field4358.field3726, -22222, 0.5F);
            super.field4358.method1471(true, this.field5746);
            super.field4358.method1440(0, 0);
        }
        this.field5748.method2603('\u0000', -17213);
        if (arg1 < 23) {
            this.field5746 = null;
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glPushMatrix();
        OpenGL.glScalef(0.25F, 0.25F, 1.0F);
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILhc;Lhc;)V")
    public static final void method2347(int arg0, int arg1, int arg2, class218 arg3, class218 arg4) {
        class465 var5 = class406.method2512(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6907 = arg3;
            var5.field6901 = arg4;
        }
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)Z")
    public final boolean method1026(int arg0) {
        if (arg0 <= 69) {
            this.field5748 = null;
        }
        ++field5743;
        return true;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILkk;)V")
    public final void method1024(int arg0, int arg1, class179 arg2) {
        ++field5738;
        int var4 = -81 % ((arg1 - 21) / 36);
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(B)V")
    public static void method2348(byte arg0) {
        field5742 = null;
        if (arg0 != 112) {
            field5742 = null;
        }
    }
}
