import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("gb")
public class Pix32 extends Pix2D {

    @OriginalMember(owner = "gb", name = "v", descriptor = "Z")
    private boolean field544 = true;

    @OriginalMember(owner = "gb", name = "w", descriptor = "Z")
    private boolean field545 = false;

    @OriginalMember(owner = "gb", name = "x", descriptor = "I")
    private int field546 = 6;

    @OriginalMember(owner = "gb", name = "y", descriptor = "[I")
    public int[] field547;

    @OriginalMember(owner = "gb", name = "D", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "gb", name = "z", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "gb", name = "E", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "gb", name = "A", descriptor = "I")
    public int field549;

    @OriginalMember(owner = "gb", name = "C", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "gb", name = "B", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "gb", name = "u", descriptor = "I")
    private int field543;

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(III)V")
    public Pix32(int arg0, int arg1, int arg2) {
        this.field547 = new int[arg0 * arg1];
        if (arg2 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field548 = this.field552 = arg0;
        this.field549 = this.field553 = arg1;
        this.field550 = this.field551 = 0;
    }

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "([BLjava/awt/Component;I)V")
    public Pix32(byte[] arg0, java.awt.Component arg1, int arg2) {
        if (arg2 != 0) {
            throw new NullPointerException();
        }
        try {
            Image var4 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var5 = new MediaTracker(arg1);
            var5.addImage(var4, 0);
            var5.waitForAll();
            this.field548 = var4.getWidth(arg1);
            this.field549 = var4.getHeight(arg1);
            this.field552 = this.field548;
            this.field553 = this.field549;
            this.field550 = 0;
            this.field551 = 0;
            this.field547 = new int[this.field549 * this.field548];
            PixelGrabber var6 = new PixelGrabber(var4, 0, 0, this.field548, this.field549, this.field547, 0, this.field548);
            var6.grabPixels();
        } catch (Exception var7) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "gb", name = "<init>", descriptor = "(Ljava/lang/String;IILtb;)V")
    public Pix32(String arg0, int arg1, int arg2, Jagfile arg3) {
        Packet var5 = new Packet(arg3.method225(0, null, arg0 + ".dat"), (byte) 63);
        Packet var6 = new Packet(arg3.method225(0, null, "index.dat"), (byte) 63);
        var6.field586 = var5.method187();
        this.field552 = var6.method187();
        this.field553 = var6.method187();
        int var7 = var6.method185();
        int[] var8 = new int[var7];
        int var9 = 60 / arg1;
        for (int var10 = 0; var10 < var7 - 1; var10++) {
            var8[var10 + 1] = var6.method189();
            if (var8[var10 + 1] == 0) {
                var8[var10 + 1] = 1;
            }
        }
        for (int var11 = 0; var11 < arg2; var11++) {
            var6.field586 += 2;
            var5.field586 += var6.method187() * var6.method187();
            var6.field586++;
        }
        this.field550 = var6.method185();
        this.field551 = var6.method185();
        this.field548 = var6.method187();
        this.field549 = var6.method187();
        int var12 = var6.method185();
        int var13 = this.field549 * this.field548;
        this.field547 = new int[var13];
        if (var12 == 0) {
            for (int var14 = 0; var14 < var13; var14++) {
                this.field547[var14] = var8[var5.method185()];
            }
        } else if (var12 == 1) {
            for (int var15 = 0; var15 < this.field548; var15++) {
                for (int var16 = 0; var16 < this.field549; var16++) {
                    this.field547[this.field548 * var16 + var15] = var8[var5.method185()];
                }
            }
        }
    }

    @OriginalMember(owner = "gb", name = "b", descriptor = "(I)V")
    public void method152(int arg0) {
        Pix2D.method127(this.field544, this.field548, this.field547, this.field549);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(ZII)V")
    public void method153(boolean arg0, int arg1, int arg2) {
        int var4 = this.field550 + arg2;
        int var5 = this.field551 + arg1;
        int var6 = Pix2D.field507 * var5 + var4;
        int var7 = 0;
        if (arg0) {
            this.field546 = -451;
        }
        int var8 = this.field549;
        int var9 = this.field548;
        int var10 = Pix2D.field507 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field509) {
            int var12 = Pix2D.field509 - var5;
            var8 -= var12;
            var5 = Pix2D.field509;
            var7 += var9 * var12;
            var6 += Pix2D.field507 * var12;
        }
        if (var5 + var8 > Pix2D.field510) {
            var8 -= var5 + var8 - Pix2D.field510;
        }
        if (var4 < Pix2D.field511) {
            int var13 = Pix2D.field511 - var4;
            var9 -= var13;
            var4 = Pix2D.field511;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field512) {
            int var14 = var4 + var9 - Pix2D.field512;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method154(var9, var11, this.field543, Pix2D.field506, var6, var10, this.field547, var7, var8);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(III[III[III)V")
    private void method154(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg0 >> 2);
        if (arg2 != 0) {
            this.field543 = -483;
        }
        int var11 = -(arg0 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg4++] = arg6[arg7++];
                arg3[arg4++] = arg6[arg7++];
                arg3[arg4++] = arg6[arg7++];
                arg3[arg4++] = arg6[arg7++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg4++] = arg6[arg7++];
            }
            arg4 += arg5;
            arg7 += arg1;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IZI)V")
    public void method155(int arg0, boolean arg1, int arg2) {
        int var4 = this.field550 + arg0;
        if (!arg1) {
            return;
        }
        int var5 = this.field551 + arg2;
        int var6 = Pix2D.field507 * var5 + var4;
        int var7 = 0;
        int var8 = this.field549;
        int var9 = this.field548;
        int var10 = Pix2D.field507 - var9;
        int var11 = 0;
        if (var5 < Pix2D.field509) {
            int var12 = Pix2D.field509 - var5;
            var8 -= var12;
            var5 = Pix2D.field509;
            var7 += var9 * var12;
            var6 += Pix2D.field507 * var12;
        }
        if (var5 + var8 > Pix2D.field510) {
            var8 -= var5 + var8 - Pix2D.field510;
        }
        if (var4 < Pix2D.field511) {
            int var13 = Pix2D.field511 - var4;
            var9 -= var13;
            var4 = Pix2D.field511;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Pix2D.field512) {
            int var14 = var4 + var9 - Pix2D.field512;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method156(Pix2D.field506, this.field547, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method156(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIII)V")
    public void method157(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 4 || arg0 > 4) {
            this.field543 = -126;
        }
        int var5 = this.field550 + arg1;
        int var6 = this.field551 + arg2;
        int var7 = Pix2D.field507 * var6 + var5;
        int var8 = 0;
        int var9 = this.field549;
        int var10 = this.field548;
        int var11 = Pix2D.field507 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field509) {
            int var13 = Pix2D.field509 - var6;
            var9 -= var13;
            var6 = Pix2D.field509;
            var8 += var10 * var13;
            var7 += Pix2D.field507 * var13;
        }
        if (var6 + var9 > Pix2D.field510) {
            var9 -= var6 + var9 - Pix2D.field510;
        }
        if (var5 < Pix2D.field511) {
            int var14 = Pix2D.field511 - var5;
            var10 -= var14;
            var5 = Pix2D.field511;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field512) {
            int var15 = var5 + var10 - Pix2D.field512;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method158(this.field547, var7, var12, 0, arg3, var8, var11, Pix2D.field506, var9, var10, (byte) 94);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "([IIIIIII[IIIB)V")
    private void method158(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, byte arg10) {
        if (arg10 != 94) {
            this.field546 = 381;
        }
        int var12 = 256 - arg4;
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg0[arg5++];
                if (var15 == 0) {
                    arg1++;
                } else {
                    int var16 = arg7[arg1];
                    arg7[arg1++] = ((var15 & 0xFF00FF) * arg4 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg4 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg1 += arg6;
            arg5 += arg2;
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(IIIIII[II[II)V")
    public void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9) {
        if (arg5 != -22915) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg4 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = (arg1 << 16) + var12 * var15 + var13 * var14;
            int var17 = (arg2 << 16) + (var13 * var15 - var12 * var14);
            int var18 = Pix2D.field507 * arg9 + arg0;
            for (int var19 = 0; var19 < arg4; var19++) {
                int var20 = arg8[var19];
                int var21 = var18 + var20;
                int var22 = var15 * var20 + var16;
                int var23 = var17 - var14 * var20;
                for (int var24 = -arg6[var19]; var24 < 0; var24++) {
                    Pix2D.field506[var21++] = this.field547[(var22 >> 16) + (var23 >> 16) * this.field548];
                    var22 += var15;
                    var23 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += Pix2D.field507;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "(Lhb;III)V")
    public void method160(Pix8 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field550 + arg1;
        if (arg2 != 0) {
            return;
        }
        int var6 = this.field551 + arg3;
        int var7 = Pix2D.field507 * var6 + var5;
        int var8 = 0;
        int var9 = this.field549;
        int var10 = this.field548;
        int var11 = Pix2D.field507 - var10;
        int var12 = 0;
        if (var6 < Pix2D.field509) {
            int var13 = Pix2D.field509 - var6;
            var9 -= var13;
            var6 = Pix2D.field509;
            var8 += var10 * var13;
            var7 += Pix2D.field507 * var13;
        }
        if (var6 + var9 > Pix2D.field510) {
            var9 -= var6 + var9 - Pix2D.field510;
        }
        if (var5 < Pix2D.field511) {
            int var14 = Pix2D.field511 - var5;
            var10 -= var14;
            var5 = Pix2D.field511;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > Pix2D.field512) {
            int var15 = var5 + var10 - Pix2D.field512;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method161(Pix2D.field506, var8, 0, var9, false, var12, var7, var11, this.field547, arg0.field557, var10);
        }
    }

    @OriginalMember(owner = "gb", name = "a", descriptor = "([IIIIZIII[I[BI)V")
    private void method161(int[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, int arg10) {
        int var12 = -(arg10 >> 2);
        int var13 = -(arg10 & 0x3);
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg1++];
                if (var18 != 0 && arg9[arg6] == 0) {
                    arg0[arg6++] = var18;
                } else {
                    arg6++;
                }
                int var19 = arg8[arg1++];
                if (var19 != 0 && arg9[arg6] == 0) {
                    arg0[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg8[arg1++];
                if (var20 != 0 && arg9[arg6] == 0) {
                    arg0[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg8[arg1++];
                if (var21 != 0 && arg9[arg6] == 0) {
                    arg0[arg6++] = var21;
                } else {
                    arg6++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg1++];
                if (var17 != 0 && arg9[arg6] == 0) {
                    arg0[arg6++] = var17;
                } else {
                    arg6++;
                }
            }
            arg6 += arg7;
            arg1 += arg5;
        }
        if (arg4) {
            this.field546 = 174;
        }
    }
}
