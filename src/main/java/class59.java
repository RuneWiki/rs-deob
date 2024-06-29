import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!VZJVQLEE")
public class class59 extends class21 {

    @OriginalMember(owner = "client!VZJVQLEE", name = "y", descriptor = "B")
    private byte field1487 = 1;

    @OriginalMember(owner = "client!VZJVQLEE", name = "z", descriptor = "Z")
    private boolean field1488 = false;

    @OriginalMember(owner = "client!VZJVQLEE", name = "A", descriptor = "I")
    private int field1489 = -462;

    @OriginalMember(owner = "client!VZJVQLEE", name = "B", descriptor = "I")
    private int field1490 = 231;

    @OriginalMember(owner = "client!VZJVQLEE", name = "C", descriptor = "Z")
    private boolean field1491 = false;

    @OriginalMember(owner = "client!VZJVQLEE", name = "D", descriptor = "[I")
    public int[] field1492;

    @OriginalMember(owner = "client!VZJVQLEE", name = "I", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!VZJVQLEE", name = "E", descriptor = "I")
    public int field1493;

    @OriginalMember(owner = "client!VZJVQLEE", name = "J", descriptor = "I")
    public int field1498;

    @OriginalMember(owner = "client!VZJVQLEE", name = "F", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!VZJVQLEE", name = "H", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!VZJVQLEE", name = "G", descriptor = "I")
    public int field1495;

    @OriginalMember(owner = "client!VZJVQLEE", name = "x", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "(II)V")
    public class59(int arg0, int arg1) {
        this.field1492 = new int[arg0 * arg1];
        this.field1493 = this.field1497 = arg0;
        this.field1494 = this.field1498 = arg1;
        this.field1495 = this.field1496 = 0;
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class59(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1493 = var3.getWidth(arg1);
            this.field1494 = var3.getHeight(arg1);
            this.field1497 = this.field1493;
            this.field1498 = this.field1494;
            this.field1495 = 0;
            this.field1496 = 0;
            this.field1492 = new int[this.field1494 * this.field1493];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1493, this.field1494, this.field1492, 0, this.field1493);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "<init>", descriptor = "(LFUZJMGZB;Ljava/lang/String;I)V")
    public class59(class19 arg0, String arg1, int arg2) {
        class32 var4 = new class32((byte) 114, arg0.method277(arg1 + ".dat", null));
        class32 var5 = new class32((byte) 114, arg0.method277("index.dat", null));
        var5.field1032 = var4.method371();
        this.field1497 = var5.method371();
        this.field1498 = var5.method371();
        int var6 = var5.method369();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method373();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1032 += 2;
            var4.field1032 += var5.method371() * var5.method371();
            var5.field1032++;
        }
        this.field1495 = var5.method369();
        this.field1496 = var5.method369();
        this.field1493 = var5.method371();
        this.field1494 = var5.method371();
        int var10 = var5.method369();
        int var11 = this.field1494 * this.field1493;
        this.field1492 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1492[var12] = var7[var4.method369()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1493; var13++) {
                    for (int var14 = 0; var14 < this.field1494; var14++) {
                        this.field1492[this.field1493 * var14 + var13] = var7[var4.method369()];
                    }
                }
            }
            if (class45.field1317) {
            }
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "b", descriptor = "(I)V")
    public void method536(int arg0) {
        class21.method284(this.field1494, this.field1493, -357, this.field1492);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IBII)V")
    public void method537(int arg0, byte arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1492.length; var5++) {
            int var6 = this.field1492[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg0 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg3 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1492[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (this.field1487 != arg1) {
            this.field1491 = !this.field1491;
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "c", descriptor = "(I)V")
    public void method538(int arg0) {
        int[] var2 = new int[this.field1498 * this.field1497];
        for (int var3 = 0; var3 < this.field1494; var3++) {
            for (int var4 = 0; var4 < this.field1493; var4++) {
                var2[(this.field1496 + var3) * this.field1497 + this.field1495 + var4] = this.field1492[this.field1493 * var3 + var4];
            }
        }
        this.field1492 = var2;
        this.field1493 = this.field1497;
        this.field1494 = this.field1498;
        while (arg0 >= 0) {
            this.field1490 = -95;
        }
        this.field1495 = 0;
        this.field1496 = 0;
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(III)V")
    public void method539(int arg0, int arg1, int arg2) {
        int var4 = this.field1495 + arg1;
        if (arg0 != 143) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1496 + arg2;
        int var7 = class21.field932 * var6 + var4;
        int var8 = 0;
        int var9 = this.field1494;
        int var10 = this.field1493;
        int var11 = class21.field932 - var10;
        int var12 = 0;
        if (var6 < class21.field934) {
            int var13 = class21.field934 - var6;
            var9 -= var13;
            var6 = class21.field934;
            var8 += var10 * var13;
            var7 += class21.field932 * var13;
        }
        if (var6 + var9 > class21.field935) {
            var9 -= var6 + var9 - class21.field935;
        }
        if (var4 < class21.field936) {
            int var14 = class21.field936 - var4;
            var10 -= var14;
            var4 = class21.field936;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class21.field937) {
            int var15 = var4 + var10 - class21.field937;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method540(this.field1492, var12, 611, var7, var9, class21.field931, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "([IIIII[IIII)V")
    private void method540(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        int var12 = 23 / arg2;
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg5[arg3++] = arg0[arg6++];
                arg5[arg3++] = arg0[arg6++];
                arg5[arg3++] = arg0[arg6++];
                arg5[arg3++] = arg0[arg6++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg5[arg3++] = arg0[arg6++];
            }
            arg3 += arg8;
            arg6 += arg1;
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "b", descriptor = "(III)V")
    public void method541(int arg0, int arg1, int arg2) {
        int var4 = this.field1495 + arg1;
        int var5 = this.field1496 + arg2;
        int var6 = class21.field932 * var5 + var4;
        int var7 = 0;
        if (arg0 != -4899) {
            return;
        }
        int var8 = this.field1494;
        int var9 = this.field1493;
        int var10 = class21.field932 - var9;
        int var11 = 0;
        if (var5 < class21.field934) {
            int var12 = class21.field934 - var5;
            var8 -= var12;
            var5 = class21.field934;
            var7 += var9 * var12;
            var6 += class21.field932 * var12;
        }
        if (var5 + var8 > class21.field935) {
            var8 -= var5 + var8 - class21.field935;
        }
        if (var4 < class21.field936) {
            int var13 = class21.field936 - var4;
            var9 -= var13;
            var4 = class21.field936;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class21.field937) {
            int var14 = var4 + var9 - class21.field937;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method542(class21.field931, this.field1492, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method542(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIII)V")
    public void method543(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 0) {
            return;
        }
        int var5 = this.field1495 + arg2;
        int var6 = this.field1496 + arg3;
        int var7 = class21.field932 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1494;
        int var10 = this.field1493;
        int var11 = class21.field932 - var10;
        int var12 = 0;
        if (var6 < class21.field934) {
            int var13 = class21.field934 - var6;
            var9 -= var13;
            var6 = class21.field934;
            var8 += var10 * var13;
            var7 += class21.field932 * var13;
        }
        if (var6 + var9 > class21.field935) {
            var9 -= var6 + var9 - class21.field935;
        }
        if (var5 < class21.field936) {
            int var14 = class21.field936 - var5;
            var10 -= var14;
            var5 = class21.field936;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class21.field937) {
            int var15 = var5 + var10 - class21.field937;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method544(var8, var10, var7, class21.field931, var9, arg1, 0, var11, this.field1492, (byte) 3, var12);
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(III[IIIII[IBI)V")
    private void method544(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte arg9, int arg10) {
        int var12 = 256 - arg5;
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg1; var14 < 0; var14++) {
                int var15 = arg8[arg0++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg3[arg2];
                    arg3[arg2++] = ((var15 & 0xFF00FF) * arg5 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg5 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg7;
            arg0 += arg10;
        }
        if (arg9 != 3) {
            this.field1486 = 148;
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IZIII[II[IIII)V")
    public void method545(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg1) {
            return;
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg2 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class21.field932 * arg6 + arg10;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    class21.field931[var23++] = this.field1492[(var24 >> 16) + (var25 >> 16) * this.field1493];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class21.field932;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIIIDIIII)V")
    public void method546(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 <= 0) {
            return;
        }
        try {
            int var11 = -arg1 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg4) * 65536.0D);
            int var14 = (int) (Math.cos(arg4) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg0 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class21.field932 * arg7 + arg8;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg1; var24 < 0; var24++) {
                    int var25 = this.field1492[(var22 >> 16) + (var23 >> 16) * this.field1493];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class21.field931[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class21.field932;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(IIBLZQSBFHWZ;)V")
    public void method547(int arg0, int arg1, byte arg2, class69 arg3) {
        if (arg2 != -9) {
            return;
        }
        int var5 = this.field1495 + arg1;
        int var6 = this.field1496 + arg0;
        int var7 = class21.field932 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1494;
        int var10 = this.field1493;
        int var11 = class21.field932 - var10;
        int var12 = 0;
        if (var6 < class21.field934) {
            int var13 = class21.field934 - var6;
            var9 -= var13;
            var6 = class21.field934;
            var8 += var10 * var13;
            var7 += class21.field932 * var13;
        }
        if (var6 + var9 > class21.field935) {
            var9 -= var6 + var9 - class21.field935;
        }
        if (var5 < class21.field936) {
            int var14 = class21.field936 - var5;
            var10 -= var14;
            var5 = class21.field936;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class21.field937) {
            int var15 = var5 + var10 - class21.field937;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method548(var11, this.field1492, arg3.field1685, 0, var8, var12, true, class21.field931, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!VZJVQLEE", name = "a", descriptor = "(I[I[BIIIZ[IIII)V")
    private void method548(int arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5, boolean arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg10 >> 2);
        int var13 = -(arg10 & 0x3);
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg1[arg4++];
                if (var18 != 0 && arg2[arg8] == 0) {
                    arg7[arg8++] = var18;
                } else {
                    arg8++;
                }
                int var19 = arg1[arg4++];
                if (var19 != 0 && arg2[arg8] == 0) {
                    arg7[arg8++] = var19;
                } else {
                    arg8++;
                }
                int var20 = arg1[arg4++];
                if (var20 != 0 && arg2[arg8] == 0) {
                    arg7[arg8++] = var20;
                } else {
                    arg8++;
                }
                int var21 = arg1[arg4++];
                if (var21 != 0 && arg2[arg8] == 0) {
                    arg7[arg8++] = var21;
                } else {
                    arg8++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg1[arg4++];
                if (var17 != 0 && arg2[arg8] == 0) {
                    arg7[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg0;
            arg4 += arg5;
        }
        if (!arg6) {
            this.field1489 = -483;
        }
    }
}
