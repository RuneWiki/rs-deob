import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("DYPVESKW")
public class class14 extends class31 {

    @OriginalMember(owner = "DYPVESKW", name = "y", descriptor = "Z")
    private boolean field684 = false;

    @OriginalMember(owner = "DYPVESKW", name = "z", descriptor = "I")
    private int field685 = 6;

    @OriginalMember(owner = "DYPVESKW", name = "A", descriptor = "I")
    private int field686 = 798;

    @OriginalMember(owner = "DYPVESKW", name = "B", descriptor = "Z")
    private boolean field687 = false;

    @OriginalMember(owner = "DYPVESKW", name = "C", descriptor = "Z")
    private boolean field688 = false;

    @OriginalMember(owner = "DYPVESKW", name = "D", descriptor = "I")
    private int field689 = 2;

    @OriginalMember(owner = "DYPVESKW", name = "E", descriptor = "I")
    private int field690 = 637;

    @OriginalMember(owner = "DYPVESKW", name = "G", descriptor = "[I")
    public int[] field692;

    @OriginalMember(owner = "DYPVESKW", name = "L", descriptor = "I")
    public int field697;

    @OriginalMember(owner = "DYPVESKW", name = "H", descriptor = "I")
    public int field693;

    @OriginalMember(owner = "DYPVESKW", name = "M", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "DYPVESKW", name = "I", descriptor = "I")
    public int field694;

    @OriginalMember(owner = "DYPVESKW", name = "K", descriptor = "I")
    public int field696;

    @OriginalMember(owner = "DYPVESKW", name = "J", descriptor = "I")
    public int field695;

    @OriginalMember(owner = "DYPVESKW", name = "F", descriptor = "I")
    private int field691;

    @OriginalMember(owner = "DYPVESKW", name = "<init>", descriptor = "(II)V")
    public class14(int arg0, int arg1) {
        this.field692 = new int[arg0 * arg1];
        this.field693 = this.field697 = arg0;
        this.field694 = this.field698 = arg1;
        this.field695 = this.field696 = 0;
    }

    @OriginalMember(owner = "DYPVESKW", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class14(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field693 = var3.getWidth(arg1);
            this.field694 = var3.getHeight(arg1);
            this.field697 = this.field693;
            this.field698 = this.field694;
            this.field695 = 0;
            this.field696 = 0;
            this.field692 = new int[this.field694 * this.field693];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field693, this.field694, this.field692, 0, this.field693);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "<init>", descriptor = "(LOTSGNSQM;Ljava/lang/String;I)V")
    public class14(class41 arg0, String arg1, int arg2) {
        class68 var4 = new class68(arg0.method376(arg1 + ".dat", null), -103);
        class68 var5 = new class68(arg0.method376("index.dat", null), -103);
        var5.field1612 = var4.method551();
        this.field697 = var5.method551();
        this.field698 = var5.method551();
        int var6 = var5.method549();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method553();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1612 += 2;
            var4.field1612 += var5.method551() * var5.method551();
            var5.field1612++;
        }
        this.field695 = var5.method549();
        this.field696 = var5.method549();
        this.field693 = var5.method551();
        this.field694 = var5.method551();
        int var10 = var5.method549();
        int var11 = this.field694 * this.field693;
        this.field692 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field692[var12] = var7[var4.method549()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field693; var13++) {
                for (int var14 = 0; var14 < this.field694; var14++) {
                    this.field692[this.field693 * var14 + var13] = var7[var4.method549()];
                }
            }
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "b", descriptor = "(I)V")
    public void method174(int arg0) {
        class31.method279(this.field694, this.field693, (byte) -105, this.field692);
        if (arg0 != 0) {
            this.field691 = -226;
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IIII)V")
    public void method175(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field692.length; var6++) {
            int var7 = this.field692[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg2 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg3 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field692[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(B)V")
    public void method176(byte arg0) {
        int[] var2 = new int[this.field698 * this.field697];
        for (int var3 = 0; var3 < this.field694; var3++) {
            for (int var5 = 0; var5 < this.field693; var5++) {
                var2[(this.field696 + var3) * this.field697 + this.field695 + var5] = this.field692[this.field693 * var3 + var5];
            }
        }
        this.field692 = var2;
        this.field693 = this.field697;
        this.field694 = this.field698;
        this.field695 = 0;
        this.field696 = 0;
        if (arg0 == 3) {
            boolean var4 = false;
        } else {
            this.field686 = 406;
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IIB)V")
    public void method177(int arg0, int arg1, byte arg2) {
        int var4 = this.field695 + arg1;
        int var5 = this.field696 + arg0;
        if (arg2 != -31) {
            this.field687 = !this.field687;
        }
        int var6 = class31.field954 * var5 + var4;
        int var7 = 0;
        int var8 = this.field694;
        int var9 = this.field693;
        int var10 = class31.field954 - var9;
        int var11 = 0;
        if (var5 < class31.field956) {
            int var12 = class31.field956 - var5;
            var8 -= var12;
            var5 = class31.field956;
            var7 += var9 * var12;
            var6 += class31.field954 * var12;
        }
        if (var5 + var8 > class31.field957) {
            var8 -= var5 + var8 - class31.field957;
        }
        if (var4 < class31.field958) {
            int var13 = class31.field958 - var4;
            var9 -= var13;
            var4 = class31.field958;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class31.field959) {
            int var14 = var4 + var9 - class31.field959;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method178(var9, var7, class31.field953, (byte) 2, this.field692, var10, var6, var11, var8);
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(II[IB[IIIII)V")
    private void method178(int arg0, int arg1, int[] arg2, byte arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        int var11 = -(arg0 & 0x3);
        if (arg3 != 2) {
            return;
        }
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg6++] = arg4[arg1++];
                arg2[arg6++] = arg4[arg1++];
                arg2[arg6++] = arg4[arg1++];
                arg2[arg6++] = arg4[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg6++] = arg4[arg1++];
            }
            arg6 += arg5;
            arg1 += arg7;
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(III)V")
    public void method179(int arg0, int arg1, int arg2) {
        if (arg2 != 49598) {
            this.field687 = !this.field687;
        }
        int var4 = this.field695 + arg1;
        int var5 = this.field696 + arg0;
        int var6 = class31.field954 * var5 + var4;
        int var7 = 0;
        int var8 = this.field694;
        int var9 = this.field693;
        int var10 = class31.field954 - var9;
        int var11 = 0;
        if (var5 < class31.field956) {
            int var12 = class31.field956 - var5;
            var8 -= var12;
            var5 = class31.field956;
            var7 += var9 * var12;
            var6 += class31.field954 * var12;
        }
        if (var5 + var8 > class31.field957) {
            var8 -= var5 + var8 - class31.field957;
        }
        if (var4 < class31.field958) {
            int var13 = class31.field958 - var4;
            var9 -= var13;
            var4 = class31.field958;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class31.field959) {
            int var14 = var4 + var9 - class31.field959;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method180(class31.field953, this.field692, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method180(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "DYPVESKW", name = "b", descriptor = "(IIII)V")
    public void method181(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field695 + arg3;
        int var6 = this.field696 + arg0;
        int var7 = class31.field954 * var6 + var5;
        int var8 = 0;
        int var9 = this.field694;
        int var10 = this.field693;
        int var11 = class31.field954 - var10;
        int var12 = 0;
        if (arg2 < this.field689 || arg2 > this.field689) {
            return;
        }
        if (var6 < class31.field956) {
            int var13 = class31.field956 - var6;
            var9 -= var13;
            var6 = class31.field956;
            var8 += var10 * var13;
            var7 += class31.field954 * var13;
        }
        if (var6 + var9 > class31.field957) {
            var9 -= var6 + var9 - class31.field957;
        }
        if (var5 < class31.field958) {
            int var14 = class31.field958 - var5;
            var10 -= var14;
            var5 = class31.field958;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class31.field959) {
            int var15 = var5 + var10 - class31.field959;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method182(0, var12, 22585, var9, var8, var7, this.field692, var10, class31.field953, var11, arg1);
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IIIIII[II[III)V")
    private void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg6[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg8[arg5];
                    arg8[arg5++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg9;
            arg4 += arg1;
        }
        if (arg2 == 22585) {
            ;
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IIIIII[IIIB[I)V")
    public void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte arg9, int[] arg10) {
        if (arg9 != 9) {
            return;
        }
        boolean var12 = false;
        try {
            int var13 = -arg7 / 2;
            int var14 = -arg4 / 2;
            int var15 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var17 = arg0 * var15 >> 8;
            int var18 = arg0 * var16 >> 8;
            int var19 = (arg8 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg3 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class31.field954 * arg1 + arg5;
            for (int var22 = 0; var22 < arg4; var22++) {
                int var23 = arg6[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg10[var22]; var27 < 0; var27++) {
                    class31.field953[var24++] = this.field692[(var25 >> 16) + (var26 >> 16) * this.field693];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class31.field954;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IIIIIIIID)V")
    public void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, double arg8) {
        if (arg5 >= 0) {
            this.field691 = 75;
        }
        try {
            int var11 = -arg0 / 2;
            int var12 = -arg1 / 2;
            int var13 = (int) (Math.sin(arg8) * 65536.0D);
            int var14 = (int) (Math.cos(arg8) * 65536.0D);
            int var15 = arg4 * var13 >> 8;
            int var16 = arg4 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg3 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class31.field954 * arg6 + arg7;
            for (int var20 = 0; var20 < arg1; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg0; var24 < 0; var24++) {
                    int var25 = this.field692[(var22 >> 16) + (var23 >> 16) * this.field693];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class31.field953[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class31.field954;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(IZILDZSIRBWX;)V")
    public void method185(int arg0, boolean arg1, int arg2, class15 arg3) {
        int var5 = this.field695 + arg2;
        int var6 = this.field696 + arg0;
        if (!arg1) {
            return;
        }
        int var7 = class31.field954 * var6 + var5;
        int var8 = 0;
        int var9 = this.field694;
        int var10 = this.field693;
        int var11 = class31.field954 - var10;
        int var12 = 0;
        if (var6 < class31.field956) {
            int var13 = class31.field956 - var6;
            var9 -= var13;
            var6 = class31.field956;
            var8 += var10 * var13;
            var7 += class31.field954 * var13;
        }
        if (var6 + var9 > class31.field957) {
            var9 -= var6 + var9 - class31.field957;
        }
        if (var5 < class31.field958) {
            int var14 = class31.field958 - var5;
            var10 -= var14;
            var5 = class31.field958;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class31.field959) {
            int var15 = var5 + var10 - class31.field959;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method186(var8, 0, arg3.field703, var12, var7, this.field692, var10, class31.field953, var9, false, var11);
        }
    }

    @OriginalMember(owner = "DYPVESKW", name = "a", descriptor = "(II[BII[II[IIZI)V")
    private void method186(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, boolean arg9, int arg10) {
        int var12 = -(arg6 >> 2);
        if (arg9) {
            this.field690 = 315;
        }
        int var13 = -(arg6 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg5[arg0++];
                if (var18 != 0 && arg2[arg4] == 0) {
                    arg7[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg5[arg0++];
                if (var19 != 0 && arg2[arg4] == 0) {
                    arg7[arg4++] = var19;
                } else {
                    arg4++;
                }
                int var20 = arg5[arg0++];
                if (var20 != 0 && arg2[arg4] == 0) {
                    arg7[arg4++] = var20;
                } else {
                    arg4++;
                }
                int var21 = arg5[arg0++];
                if (var21 != 0 && arg2[arg4] == 0) {
                    arg7[arg4++] = var21;
                } else {
                    arg4++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg5[arg0++];
                if (var17 != 0 && arg2[arg4] == 0) {
                    arg7[arg4++] = var17;
                } else {
                    arg4++;
                }
            }
            arg4 += arg10;
            arg0 += arg3;
        }
    }
}
