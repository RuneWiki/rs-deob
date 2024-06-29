import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class474 {

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "Lio;")
    private class437 field6729;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Leea;")
    private class131 field6727;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public int field6733;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    private int field6734;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "[B")
    public byte[] field6731;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    private int field6730;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    private int field6739;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "[[Lww;")
    private class731[][] field6725;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIZLr;)V", line = 4)
    public final void method2832(int arg0, int arg1, boolean arg2, class180 arg3) {
        field6738++;
        class549 var5 = (class549) arg3;
        int var6 = var5.field7658 + arg1 + 1;
        int var7 = var5.field7668 + arg0 + 1;
        int var8 = this.field6733 * var6 + var7;
        int var9 = 0;
        if (arg2) {
            return;
        }
        int var10 = var5.field7660;
        int var11 = var5.field7657;
        int var12 = this.field6733 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += this.field6733 * var14;
            var10 -= var14;
            var9 += var11 * var14;
        }
        if (var6 + var10 >= this.field6734) {
            int var15 = var6 + var10 + 1 - this.field6734;
            var10 -= var15;
        }
        if (var7 <= 0) {
            int var16 = 1 - var7;
            var13 += var16;
            var9 += var16;
            var8 += var16;
            var7 = 1;
            var12 += var16;
            var11 -= var16;
        }
        if ((var7 + var11) >= this.field6733) {
            int var17 = var11 + var7 + 1 - this.field6733;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class286.method1878(var12, var8, var9, -24147, this.field6731, var10, var5.field7666, var11, var13);
            this.method2835(var6, var11, var7, var10, -1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z[[ZIBII)V", line = 79)
    public final void method2833(boolean arg0, boolean[][] arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.field6727.method898(false, -25994);
        field6728++;
        this.field6727.method881((byte) 87, false);
        int var7 = -41 % ((arg3 + 5) / 59);
        this.field6727.method922(-65, -2);
        this.field6727.method891(1, (byte) 17);
        this.field6727.method914(1, 1);
        float var8 = 1.0F / (float) (this.field6727.field1792 * 128);
        if (arg0) {
            for (int var23 = 0; var23 < this.field6739; var23++) {
                int var24 = var23 << this.field6723;
                int var25 = var23 + 1 << this.field6723;
                label85: for (int var26 = 0; var26 < this.field6730; var26++) {
                    int var27 = var26 << this.field6723;
                    int var28 = var26 + 1 << this.field6723;
                    for (int var29 = var27; var29 < var28; var29++) {
                        if ((-arg4) <= (var29 - arg5) && arg4 >= var29 - arg5) {
                            for (int var30 = var24; var30 < var25; var30++) {
                                if ((var30 - arg2) >= (-arg4) && (var30 - arg2) <= arg4 && arg1[var29 + arg4 - arg5][var30 + arg4 - arg2]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var8, var8, 1.0F);
                                    OpenGL.glTranslatef((float) (-var26) / var8, (float) (-var23) / var8, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6725[var26][var23].method4097(128);
                                    continue label85;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < this.field6739; var9++) {
                int var10 = var9 << this.field6723;
                int var11 = var9 + 1 << this.field6723;
                for (int var12 = 0; var12 < this.field6730; var12++) {
                    int var13 = 0;
                    int var14 = var12 << this.field6723;
                    int var15 = var12 + 1 << this.field6723;
                    class267 var16 = this.field6727.field1923;
                    var16.field9146 = 0;
                    for (int var17 = var10; var17 < var11; var17++) {
                        if (-arg4 <= var17 - arg2 && var17 - arg2 <= arg4) {
                            int var18 = this.field6729.field3935 * var17 + var14;
                            for (int var19 = var14; var19 < var15; var19++) {
                                if (-arg4 <= var19 - arg5 && (var19 - arg5) <= arg4 && arg1[arg4 + var19 - arg5][var17 - (arg2 - arg4)]) {
                                    short[] var20 = this.field6729.field6205[var18];
                                    if (var20 != null) {
                                        if (this.field6727.field1865) {
                                            for (int var21 = 0; var21 < var20.length; var21++) {
                                                var16.method3745(-123, var20[var21] & 0xFFFF);
                                                var13++;
                                            }
                                        } else {
                                            for (int var22 = 0; var22 < var20.length; var22++) {
                                                var13++;
                                                var16.method3737(var20[var22] & 0xFFFF, -1682769048);
                                            }
                                        }
                                    }
                                }
                                var18++;
                            }
                        }
                    }
                    if (var13 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var8, var8, 1.0F);
                        OpenGL.glTranslatef((float) (-var12) / var8, (float) (-var9) / var8, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6725[var12][var9].method4099(var13, (byte) -45, 5123, var16.field9154);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILee;)Lra;", line = 270)
    public static final class108 method2834(int arg0, class675 arg1) {
        field6735++;
        class358 var2 = class172.method1111(-102, arg1);
        int var3 = arg1.method3706((byte) 97);
        return arg0 > -31 ? null : new class108(var2.field2867, var2.field2876, var2.field2871, var2.field2875, var2.field2873, var2.field2874, var2.field2865, var2.field2864, var2.field2872, var2.field5096, var2.field5089, var2.field5093, var2.field5098, var2.field5090, var2.field5091, var3);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIII)V", line = 285)
    private final void method2835(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6736++;
        if (this.field6725 == null) {
            return;
        }
        int var6 = arg2 - 1 >> 7;
        int var7 = arg1 + arg2 + arg4 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 - (1 - arg3) - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class731[] var11 = this.field6725[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field10206 = true;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 320)
    public final void method2836(int arg0) {
        this.field6725 = new class731[this.field6730][this.field6739];
        field6732++;
        int var2 = -125 % ((arg0 - 42) / 56);
        for (int var3 = 0; var3 < this.field6739; var3++) {
            for (int var4 = 0; var4 < this.field6730; var4++) {
                this.field6725[var4][var3] = new class731(this.field6727, this, this.field6729, var4, var3, this.field6723, var4 * 128 + 1, var3 * 128 + 1);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 349)
    public static final boolean method2837(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field6726++;
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILr;IB)Z", line = 362)
    public final boolean method2838(int arg0, class180 arg1, int arg2, byte arg3) {
        field6724++;
        class549 var5 = (class549) arg1;
        int var6 = var5.field7668 + arg2 + 1;
        int var7 = var5.field7658 + arg0 + 1;
        int var8 = this.field6733 * var7 + var6;
        int var9 = var5.field7660;
        int var10 = var5.field7657;
        int var11 = this.field6733 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var9 -= var12;
            var8 += this.field6733 * var12;
            var7 = 1;
        }
        if (arg3 < 75) {
            return true;
        }
        if (this.field6734 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field6734;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var10 -= var14;
            var8 += var14;
            var11 += var14;
        }
        if (this.field6733 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field6733;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6733 + var11;
            return class694.method3914((byte) -53, var17, this.field6731, var8, var9, var16, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIILr;)V", line = 436)
    public final void method2839(int arg0, int arg1, int arg2, class180 arg3) {
        field6737++;
        class549 var5 = (class549) arg3;
        int var6 = var5.field7658 + arg2 + 1;
        int var7 = var5.field7668 + arg1 + 1;
        int var8 = var7 + (this.field6733 * var6);
        int var9 = 0;
        int var10 = var5.field7660;
        int var11 = var5.field7657;
        int var12 = this.field6733 - var11;
        int var13 = 0;
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += this.field6733 * var14;
            var10 -= var14;
            var6 = 1;
            var9 += var11 * var14;
        }
        if ((var6 + var10) >= this.field6734) {
            int var15 = var6 + var10 + 1 - this.field6734;
            var10 -= var15;
        }
        if (arg0 <= ~var7) {
            int var16 = 1 - var7;
            var11 -= var16;
            var7 = 1;
            var13 += var16;
            var9 += var16;
            var8 += var16;
            var12 += var16;
        }
        if ((var7 + var11) >= this.field6733) {
            int var17 = var7 + var11 + 1 - this.field6733;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class106.method762(this.field6731, var9, var13, 1, var8, var10, var12, var11, var5.field7666);
            this.method2835(var6, var11, var7, var10, -1);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Leea;Lio;)V", line = 504)
    public class474(class131 arg0, class437 arg1) {
        this.field6729 = arg1;
        this.field6727 = arg0;
        this.field6733 = (this.field6729.field3935 * this.field6729.field3925 >> this.field6727.field1786) + 2;
        this.field6734 = (this.field6729.field3930 * this.field6729.field3925 >> this.field6727.field1786) + 2;
        this.field6723 = this.field6727.field1786 + 7 - this.field6729.field3929;
        this.field6731 = new byte[this.field6734 * this.field6733];
        this.field6730 = this.field6729.field3935 >> this.field6723;
        this.field6739 = this.field6729.field3930 >> this.field6723;
    }
}
