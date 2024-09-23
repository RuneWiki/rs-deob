import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ib")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "ib", name = "y", descriptor = "Z")
    private boolean field669 = true;

    @OriginalMember(owner = "ib", name = "z", descriptor = "I")
    private int field670 = -325;

    @OriginalMember(owner = "ib", name = "A", descriptor = "I")
    private int field671 = -652;

    @OriginalMember(owner = "ib", name = "B", descriptor = "I")
    private int field672 = 9244;

    @OriginalMember(owner = "ib", name = "C", descriptor = "Z")
    private boolean field673 = true;

    @OriginalMember(owner = "ib", name = "D", descriptor = "[I")
    public int[] field674;

    @OriginalMember(owner = "ib", name = "I", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "ib", name = "E", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "ib", name = "J", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "ib", name = "F", descriptor = "I")
    public int field676;

    @OriginalMember(owner = "ib", name = "H", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "ib", name = "G", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(II)V")
    public Pix32(int arg0, int arg1) {
        this.field674 = new int[arg0 * arg1];
        this.field675 = this.field679 = arg0;
        this.field676 = this.field680 = arg1;
        this.field677 = this.field678 = 0;
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public Pix32(byte[] arg0, java.awt.Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field675 = var3.getWidth(arg1);
            this.field676 = var3.getHeight(arg1);
            this.field679 = this.field675;
            this.field680 = this.field676;
            this.field677 = 0;
            this.field678 = 0;
            this.field674 = new int[this.field676 * this.field675];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field675, this.field676, this.field674, 0, this.field675);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "ib", name = "<init>", descriptor = "(Lxb;Ljava/lang/String;I)V")
    public Pix32(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(false, arg0.method299(arg1 + ".dat", null));
        Packet var5 = new Packet(false, arg0.method299("index.dat", null));
        var5.field716 = var4.method231();
        this.field679 = var5.method231();
        this.field680 = var5.method231();
        int var6 = var5.method229();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method233();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field716 += 2;
            var4.field716 += var5.method231() * var5.method231();
            var5.field716++;
        }
        this.field677 = var5.method229();
        this.field678 = var5.method229();
        this.field675 = var5.method231();
        this.field676 = var5.method231();
        int var10 = var5.method229();
        int var11 = this.field676 * this.field675;
        this.field674 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field674[var12] = var7[var4.method229()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field675; var13++) {
                for (int var14 = 0; var14 < this.field676; var14++) {
                    this.field674[this.field675 * var14 + var13] = var7[var4.method229()];
                }
            }
        }
    }

    @OriginalMember(owner = "ib", name = "c", descriptor = "(I)V")
    public void method181(int arg0) {
        Pix2D.method152(this.field675, this.field674, this.field676, (byte) 5);
        if (arg0 == 9) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIII)V")
    public void method182(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field669 = !this.field669;
        }
        for (int var5 = 0; var5 < this.field674.length; var5++) {
            int var6 = this.field674[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg3 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field674[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "ib", name = "d", descriptor = "(I)V")
    public void method183(int arg0) {
        int[] var2 = new int[this.field680 * this.field679];
        for (int var3 = 0; var3 < this.field676; var3++) {
            for (int var4 = 0; var4 < this.field675; var4++) {
                var2[(this.field678 + var3) * this.field679 + this.field677 + var4] = this.field674[this.field675 * var3 + var4];
            }
        }
        this.field674 = var2;
        this.field675 = this.field679;
        if (arg0 == 0) {
            this.field676 = this.field680;
            this.field677 = 0;
            this.field678 = 0;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZII)V")
    public void method184(boolean arg0, int arg1, int arg2) {
        int var4 = this.field677 + arg1;
        int var5 = this.field678 + arg2;
        if (arg0) {
            return;
        }
        int var6 = Pix2D.field633 * var5 + var4;
        int var7 = 0;
        int var8 = this.field676;
        int var9 = this.field675;
        int var10 = Pix2D.field633 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field635) {
            int var12 = Pix2D.field635 - var5;
            var8 -= var12;
            var5 = Pix2D.field635;
            var7 += var9 * var12;
            var6 += Pix2D.field633 * var12;
        }
        if (var5 + var8 > Pix2D.field636) {
            var8 -= var5 + var8 - Pix2D.field636;
        }
        if (var4 < Pix2D.field637) {
            int var13 = Pix2D.field637 - var4;
            var9 -= var13;
            var4 = Pix2D.field637;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field638) {
            int var14 = var4 + var9 - Pix2D.field638;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method185(true, var10, var6, this.field674, var8, var7, Pix2D.field632, var11, var9);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(ZII[III[III)V")
    private void method185(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg8 >> 2);
        if (!arg0) {
            this.field669 = !this.field669;
        }
        int var11 = -(arg8 & 0x3);
        for (int var12 = -arg4; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg2++] = arg3[arg5++];
                arg6[arg2++] = arg3[arg5++];
                arg6[arg2++] = arg3[arg5++];
                arg6[arg2++] = arg3[arg5++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg2++] = arg3[arg5++];
            }
            arg2 += arg1;
            arg5 += arg7;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III)V")
    public void method186(int arg0, int arg1, int arg2) {
        int var4 = this.field677 + arg1;
        int var5 = this.field678 + arg0;
        if (arg2 != -47687) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        int var7 = Pix2D.field633 * var5 + var4;
        int var8 = 0;
        int var9 = this.field676;
        int var10 = this.field675;
        int var11 = Pix2D.field633 - var10;
        int var12 = 0;
        if (var5 < Pix2D.field635) {
            int var13 = Pix2D.field635 - var5;
            var9 -= var13;
            var5 = Pix2D.field635;
            var8 += var10 * var13;
            var7 += Pix2D.field633 * var13;
        }
        if (var5 + var9 > Pix2D.field636) {
            var9 -= var5 + var9 - Pix2D.field636;
        }
        if (var4 < Pix2D.field637) {
            int var14 = Pix2D.field637 - var4;
            var10 -= var14;
            var4 = Pix2D.field637;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > Pix2D.field638) {
            int var15 = var4 + var10 - Pix2D.field638;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method187(Pix2D.field632, this.field674, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method187(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "ib", name = "b", descriptor = "(IIII)V")
    public void method188(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field677 + arg1;
        int var6 = this.field678 + arg2;
        int var7 = Pix2D.field633 * var6 + var5;
        int var8 = 0;
        int var9 = this.field676;
        int var10 = this.field675;
        int var11 = Pix2D.field633 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field635) {
            int var13 = Pix2D.field635 - var6;
            var9 -= var13;
            var6 = Pix2D.field635;
            var8 += var10 * var13;
            var7 += Pix2D.field633 * var13;
        }
        if (var6 + var9 > Pix2D.field636) {
            var9 -= var6 + var9 - Pix2D.field636;
        }
        if (var5 < Pix2D.field637) {
            int var14 = Pix2D.field637 - var5;
            var10 -= var14;
            var5 = Pix2D.field637;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field638) {
            int var15 = var5 + var10 - Pix2D.field638;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 <= 0 || var9 <= 0) {
            return;
        }
        this.method189(var11, this.field674, var8, var10, 0, var9, Pix2D.field632, var7, -8178, var12, arg3);
        if (arg0 != 0) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(I[IIIII[IIIII)V")
    private void method189(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg1[arg2++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg6[arg7];
                    arg6[arg7++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg0;
            arg2 += arg9;
        }
        if (arg8 == -8178) {
            ;
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IBII[II[IIIII)V")
    public void method190(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg1 != 5) {
            this.field669 = !this.field669;
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field633 * arg10 + arg5;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg6[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg4[var21]; var26 < 0; var26++) {
                    Pix2D.field632[var23++] = this.field674[(var24 >> 16) + (var25 >> 16) * this.field675];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field633;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(IIIBIIIDI)V")
    public void method191(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg3 != 4) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin(arg7) * 65536.0D);
            int var15 = (int) (Math.cos(arg7) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = Pix2D.field633 * arg8 + arg5;
            for (int var21 = 0; var21 < arg4; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg6; var25 < 0; var25++) {
                    int var26 = this.field674[(var23 >> 16) + (var24 >> 16) * this.field675];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        Pix2D.field632[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += Pix2D.field633;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(Ljb;III)V")
    public void method192(Pix8 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field677 + arg1;
        int var6 = this.field678 + arg3;
        int var7 = Pix2D.field633 * var6 + var5;
        int var8 = 0;
        if (this.field672 != arg2) {
            this.field673 = !this.field673;
        }
        int var9 = this.field676;
        int var10 = this.field675;
        int var11 = Pix2D.field633 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field635) {
            int var13 = Pix2D.field635 - var6;
            var9 -= var13;
            var6 = Pix2D.field635;
            var8 += var10 * var13;
            var7 += Pix2D.field633 * var13;
        }
        if (var6 + var9 > Pix2D.field636) {
            var9 -= var6 + var9 - Pix2D.field636;
        }
        if (var5 < Pix2D.field637) {
            int var14 = Pix2D.field637 - var5;
            var10 -= var14;
            var5 = Pix2D.field637;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field638) {
            int var15 = var5 + var10 - Pix2D.field638;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method193(var12, 2, var8, arg0.field684, var9, this.field674, 0, var10, var11, Pix2D.field632, var7);
        }
    }

    @OriginalMember(owner = "ib", name = "a", descriptor = "(III[BI[IIII[II)V")
    private void method193(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = -(arg7 >> 2);
        int var13 = -(arg7 & 0x3);
        for (int var14 = -arg4; var14 < 0; var14++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg5[arg2++];
                if (var19 != 0 && arg3[arg10] == 0) {
                    arg9[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg5[arg2++];
                if (var20 != 0 && arg3[arg10] == 0) {
                    arg9[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg5[arg2++];
                if (var21 != 0 && arg3[arg10] == 0) {
                    arg9[arg10++] = var21;
                } else {
                    arg10++;
                }
                int var22 = arg5[arg2++];
                if (var22 != 0 && arg3[arg10] == 0) {
                    arg9[arg10++] = var22;
                } else {
                    arg10++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg5[arg2++];
                if (var18 != 0 && arg3[arg10] == 0) {
                    arg9[arg10++] = var18;
                } else {
                    arg10++;
                }
            }
            arg10 += arg8;
            arg2 += arg0;
        }
        if (arg1 < 2 || arg1 > 2) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }
}
