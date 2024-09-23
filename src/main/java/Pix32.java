import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "hb", name = "v", descriptor = "I")
    private int field558 = -40161;

    @OriginalMember(owner = "hb", name = "w", descriptor = "Z")
    private boolean field559 = false;

    @OriginalMember(owner = "hb", name = "y", descriptor = "Z")
    private boolean field561 = false;

    @OriginalMember(owner = "hb", name = "z", descriptor = "B")
    private byte field562 = 4;

    @OriginalMember(owner = "hb", name = "A", descriptor = "Z")
    private boolean field563 = true;

    @OriginalMember(owner = "hb", name = "C", descriptor = "[I")
    public int[] field565;

    @OriginalMember(owner = "hb", name = "H", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "hb", name = "D", descriptor = "I")
    public int field566;

    @OriginalMember(owner = "hb", name = "I", descriptor = "I")
    public int field571;

    @OriginalMember(owner = "hb", name = "E", descriptor = "I")
    public int field567;

    @OriginalMember(owner = "hb", name = "G", descriptor = "I")
    public int field569;

    @OriginalMember(owner = "hb", name = "F", descriptor = "I")
    public int field568;

    @OriginalMember(owner = "hb", name = "x", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "hb", name = "B", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field565 = new int[arg0 * arg1];
        this.field566 = this.field570 = arg0;
        this.field567 = this.field571 = arg1;
        this.field568 = this.field569 = 0;
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field566 = var3.getWidth(arg1);
            this.field567 = var3.getHeight(arg1);
            this.field570 = this.field566;
            this.field571 = this.field567;
            this.field568 = 0;
            this.field569 = 0;
            this.field565 = new int[this.field567 * this.field566];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field566, this.field567, this.field565, 0, this.field566);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "hb", name = "<init>", descriptor = "(Lub;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(arg0.method242((byte) 6, null, arg1 + ".dat"), 4);
        Packet var5 = new Packet(arg0.method242((byte) 6, null, "index.dat"), 4);
        var5.field606 = var4.method203();
        this.field570 = var5.method203();
        this.field571 = var5.method203();
        int var6 = var5.method201();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method205();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field606 += 2;
            var4.field606 += var5.method203() * var5.method203();
            var5.field606++;
        }
        this.field568 = var5.method201();
        this.field569 = var5.method201();
        this.field566 = var5.method203();
        this.field567 = var5.method203();
        int var10 = var5.method201();
        int var11 = this.field567 * this.field566;
        this.field565 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field565[var12] = var7[var4.method201()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field566; var13++) {
                    for (int var14 = 0; var14 < this.field567; var14++) {
                        this.field565[this.field566 * var14 + var13] = var7[var4.method201()];
                    }
                }
            }
            if (Linkable.field289) {
            }
        }
    }

    @OriginalMember(owner = "hb", name = "c", descriptor = "(I)V")
    public void method166(int arg0) {
        Pix2D.method141(this.field566, this.field565, this.field567, -810);
        if (arg0 >= 0) {
            this.field558 = -63;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III)V")
    public void method167(int arg0, int arg1, int arg2) {
        int var4 = this.field568 + arg2;
        int var5 = this.field569 + arg0;
        int var6 = Pix2D.field523 * var5 + var4;
        int var7 = 0;
        int var8 = this.field567;
        int var9 = this.field566;
        int var10 = Pix2D.field523 - var9;
        int var11 = 0;
        if (arg1 != 0) {
            return;
        }
        if (var5 < Pix2D.field525) {
            int var12 = Pix2D.field525 - var5;
            var8 -= var12;
            var5 = Pix2D.field525;
            var7 += var9 * var12;
            var6 += Pix2D.field523 * var12;
        }
        if (var5 + var8 > Pix2D.field526) {
            var8 -= var5 + var8 - Pix2D.field526;
        }
        if (var4 < Pix2D.field527) {
            int var13 = Pix2D.field527 - var4;
            var9 -= var13;
            var4 = Pix2D.field527;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field528) {
            int var14 = var4 + var9 - Pix2D.field528;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method168(var9, var8, var6, Pix2D.field522, 14588, this.field565, var7, var10, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(III[II[IIII)V")
    private void method168(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg2++] = arg5[arg6++];
                arg3[arg2++] = arg5[arg6++];
                arg3[arg2++] = arg5[arg6++];
                arg3[arg2++] = arg5[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg2++] = arg5[arg6++];
            }
            arg2 += arg7;
            arg6 += arg8;
        }
        if (arg4 != 14588) {
            this.field560 = -250;
        }
    }

    @OriginalMember(owner = "hb", name = "b", descriptor = "(III)V")
    public void method169(int arg0, int arg1, int arg2) {
        int var4 = this.field568 + arg2;
        int var5 = this.field569 + arg0;
        int var6 = Pix2D.field523 * var5 + var4;
        int var7 = 0;
        if (arg1 <= 0) {
            this.field558 = 423;
        }
        int var8 = this.field567;
        int var9 = this.field566;
        int var10 = Pix2D.field523 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field525) {
            int var12 = Pix2D.field525 - var5;
            var8 -= var12;
            var5 = Pix2D.field525;
            var7 += var9 * var12;
            var6 += Pix2D.field523 * var12;
        }
        if (var5 + var8 > Pix2D.field526) {
            var8 -= var5 + var8 - Pix2D.field526;
        }
        if (var4 < Pix2D.field527) {
            int var13 = Pix2D.field527 - var4;
            var9 -= var13;
            var4 = Pix2D.field527;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field528) {
            int var14 = var4 + var9 - Pix2D.field528;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method170(Pix2D.field522, this.field565, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method170(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var16;
                }
                int var17 = arg1[arg3++];
                if (var17 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var17;
                }
                int var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var18;
                }
                int var19 = arg1[arg3++];
                if (var19 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var19;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(ZIII)V")
    public void method171(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field568 + arg1;
        int var6 = this.field569 + arg3;
        int var7 = Pix2D.field523 * var6 + var5;
        int var8 = 0;
        if (arg0) {
            this.field564 = 166;
        }
        int var9 = this.field567;
        int var10 = this.field566;
        int var11 = Pix2D.field523 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field525) {
            int var13 = Pix2D.field525 - var6;
            var9 -= var13;
            var6 = Pix2D.field525;
            var8 += var10 * var13;
            var7 += Pix2D.field523 * var13;
        }
        if (var6 + var9 > Pix2D.field526) {
            var9 -= var6 + var9 - Pix2D.field526;
        }
        if (var5 < Pix2D.field527) {
            int var14 = Pix2D.field527 - var5;
            var10 -= var14;
            var5 = Pix2D.field527;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field528) {
            int var15 = var5 + var10 - Pix2D.field528;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method172(this.field565, var10, arg2, var8, var9, this.field562, var12, Pix2D.field522, var11, 0, var7);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIIIIBI[IIII)V")
    private void method172(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg2;
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg0[arg3++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg7[arg10];
                    arg7[arg10++] = ((var15 & 0xFF00FF) * arg2 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg2 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg8;
            arg3 += arg6;
        }
        if (arg5 != 4) {
            this.field561 = !this.field561;
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "([IIII[IIIIII)V")
    public void method173(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = (arg7 << 16) + var12 * var15 + var13 * var14;
            int var17 = (arg9 << 16) + (var13 * var15 - var12 * var14);
            int var18 = Pix2D.field523 * arg6 + arg5;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = arg4[var19];
                int var21 = var18 + var20;
                int var22 = var15 * var20 + var16;
                int var23 = var17 - var14 * var20;
                for (int var24 = -arg0[var19]; var24 < 0; var24++) {
                    Pix2D.field522[var21++] = this.field565[(var22 >> 16) + (var23 >> 16) * this.field566];
                    var22 += var15;
                    var23 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += Pix2D.field523;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(IILib;I)V")
    public void method174(int arg0, int arg1, Pix8 arg2, int arg3) {
        int var5 = this.field568 + arg1;
        int var6 = this.field569 + arg3;
        int var7 = Pix2D.field523 * var6 + var5;
        int var8 = 0;
        if (arg0 != 0) {
            return;
        }
        int var9 = this.field567;
        int var10 = this.field566;
        int var11 = Pix2D.field523 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field525) {
            int var13 = Pix2D.field525 - var6;
            var9 -= var13;
            var6 = Pix2D.field525;
            var8 += var10 * var13;
            var7 += Pix2D.field523 * var13;
        }
        if (var6 + var9 > Pix2D.field526) {
            var9 -= var6 + var9 - Pix2D.field526;
        }
        if (var5 < Pix2D.field527) {
            int var14 = Pix2D.field527 - var5;
            var10 -= var14;
            var5 = Pix2D.field527;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field528) {
            int var15 = var5 + var10 - Pix2D.field528;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method175(var8, 0, Pix2D.field522, var10, var9, this.field565, true, var12, var7, var11, arg2.field577);
        }
    }

    @OriginalMember(owner = "hb", name = "a", descriptor = "(II[III[IZIII[B)V")
    private void method175(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg5[arg0++];
                if (var18 != 0 && arg10[arg8] == 0) {
                    arg2[arg8++] = var18;
                } else {
                    arg8++;
                }
                int var19 = arg5[arg0++];
                if (var19 != 0 && arg10[arg8] == 0) {
                    arg2[arg8++] = var19;
                } else {
                    arg8++;
                }
                int var20 = arg5[arg0++];
                if (var20 != 0 && arg10[arg8] == 0) {
                    arg2[arg8++] = var20;
                } else {
                    arg8++;
                }
                int var21 = arg5[arg0++];
                if (var21 != 0 && arg10[arg8] == 0) {
                    arg2[arg8++] = var21;
                } else {
                    arg8++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg5[arg0++];
                if (var17 != 0 && arg10[arg8] == 0) {
                    arg2[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg9;
            arg0 += arg7;
        }
        if (arg6) {
            ;
        }
    }
}
