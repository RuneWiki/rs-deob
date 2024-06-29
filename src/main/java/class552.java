import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class552 extends class606 {

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "Z")
    private boolean field7769 = false;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "Z")
    private boolean field7764;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "[Lgw;")
    private class168[] field7761;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "F")
    public static float field7773 = 0.0F;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Lfp;")
    public static class323 field7763;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "Lhda;")
    public static class748 field7772;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "[I")
    public static int[] field7766;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZ)V", line = 7)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 == 5486) {
            ++field7767;
            super.field8525.method1613(-30, class502.field7202, class719.field9987);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lma;II)V", line = 19)
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg2 == 3) {
            super.field8525.method1663(arg0, -2);
            ++field7770;
            super.field8525.method1628((byte) 125, arg1);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 31)
    public final void method521(byte arg0) {
        int var2 = 5 % ((-26 - arg0) / 56);
        if (this.field7769) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1663((class12) null, -2);
            super.field8525.method1478(class569.field8074, -1);
            super.field8525.method1632((byte) -103);
            if (this.field7764) {
                super.field8525.method1613(-30, class502.field7202, class502.field7202);
                super.field8525.method1664((byte) -59, class597.field8397, 0);
                super.field8525.method1601(class597.field8397, 0, 256);
            } else {
                super.field8525.method1613(-30, class502.field7202, class502.field7202);
                super.field8525.method1664((byte) -54, class597.field8397, 0);
                super.field8525.method1648(2, (byte) 66);
                super.field8525.method1613(-30, class502.field7202, class502.field7202);
                super.field8525.method1664((byte) -113, class597.field8397, 0);
                super.field8525.method1664((byte) -53, class240.field3203, 1);
                super.field8525.method1601(class597.field8397, 0, 256);
                super.field8525.method1663((class12) null, -2);
            }
            super.field8525.method1648(0, (byte) 66);
            this.field7769 = false;
        } else {
            super.field8525.method1601(class597.field8397, 0, 256);
        }
        ++field7768;
        super.field8525.method1613(-30, class502.field7202, class502.field7202);
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)V", line = 71)
    public static void method3200(byte arg0) {
        field7766 = null;
        int var1 = -95 / ((24 - arg0) / 37);
        field7763 = null;
        field7772 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)V", line = 82)
    public final void method516(int arg0, int arg1, int arg2) {
        ++field7765;
        if (this.field7769) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1663(this.field7761[arg2 + -1], -2);
            super.field8525.method1648(0, (byte) 66);
        }
        if (arg1 <= 91) {
            this.field7769 = true;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZI)V", line = 106)
    public final void method517(boolean arg0, int arg1) {
        if (arg1 > -64) {
            this.method518(88, true);
        }
        if (this.field7761 != null && arg0) {
            super.field8525.method1648(1, (byte) 66);
            super.field8525.method1478(class277.field3919, -1);
            class328 var3 = super.field8525.method1593(-70);
            var3.method362(1024);
            super.field8525.method1600((byte) 95, class224.field3006);
            if (!this.field7764) {
                super.field8525.method1613(-30, class719.field9987, class502.field7202);
                super.field8525.method1664((byte) -85, class240.field3203, 0);
                super.field8525.method1648(2, (byte) 66);
                super.field8525.method1613(-30, class170.field2330, class719.field9987);
                super.field8525.method1664((byte) -127, class240.field3203, 0);
                super.field8525.method1450(false, class240.field3203, 1, true, false);
                super.field8525.method1601(class539.field7554, 0, 256);
                super.field8525.method1663(super.field8525.field3628, -2);
            } else {
                super.field8525.method1613(-30, class170.field2330, class719.field9987);
                super.field8525.method1450(false, class597.field8397, 0, true, false);
                super.field8525.method1601(class539.field7554, 0, 256);
            }
            super.field8525.method1648(0, (byte) 66);
            this.field7769 = true;
        } else {
            super.field8525.method1601(class539.field7554, 0, 256);
        }
        ++field7762;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lsr;)V", line = 153)
    public class552(class251 arg0) {
        super(arg0);
        if (arg0.field3540) {
            this.field7764 = ~arg0.field3542 > -4;
            int var2 = !this.field7764 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; var14 < 6; ++var14) {
                        float var15;
                        if (~var14 != -1) {
                            if (var14 != 1) {
                                if (var14 == 2) {
                                    var15 = var12;
                                } else if (~var14 == -4) {
                                    var15 = -var12;
                                } else if (~var14 != -5) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = var13;
                            }
                        } else {
                            var15 = -var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (var15 > 0.0F) {
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        } else {
                            var18 = 0;
                            var17 = 0;
                            var16 = 0;
                        }
                        var4[var14][var6] = var16 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var18 << 24;
                    }
                    ++var6;
                }
            }
            this.field7761 = new class168[3];
            this.field7761[0] = super.field8525.method1483(64, var4, (byte) 29, false);
            this.field7761[1] = super.field8525.method1483(64, var5, (byte) 53, false);
            this.field7761[2] = super.field8525.method1483(64, var3, (byte) -92, false);
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Z", line = 269)
    public final boolean method525(int arg0) {
        ++field7771;
        if (arg0 <= 19) {
            field7773 = 0.045755703F;
        }
        return true;
    }
}
