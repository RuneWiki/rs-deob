import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IBHVCUAH")
public class class19 extends class53 {

    @OriginalMember(owner = "IBHVCUAH", name = "z", descriptor = "I")
    private int field744 = -752;

    @OriginalMember(owner = "IBHVCUAH", name = "A", descriptor = "Z")
    private boolean field745 = false;

    @OriginalMember(owner = "IBHVCUAH", name = "B", descriptor = "I")
    private int field746 = -870;

    @OriginalMember(owner = "IBHVCUAH", name = "C", descriptor = "I")
    private int field747 = 737;

    @OriginalMember(owner = "IBHVCUAH", name = "D", descriptor = "Z")
    private boolean field748 = true;

    @OriginalMember(owner = "IBHVCUAH", name = "E", descriptor = "I")
    private int field749 = 33605;

    @OriginalMember(owner = "IBHVCUAH", name = "G", descriptor = "[I")
    public int[] field751;

    @OriginalMember(owner = "IBHVCUAH", name = "L", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "IBHVCUAH", name = "H", descriptor = "I")
    public int field752;

    @OriginalMember(owner = "IBHVCUAH", name = "M", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "IBHVCUAH", name = "I", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "IBHVCUAH", name = "K", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "IBHVCUAH", name = "J", descriptor = "I")
    public int field754;

    @OriginalMember(owner = "IBHVCUAH", name = "F", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "IBHVCUAH", name = "<init>", descriptor = "(II)V")
    public class19(int arg0, int arg1) {
        this.field751 = new int[arg0 * arg1];
        this.field752 = this.field756 = arg0;
        this.field753 = this.field757 = arg1;
        this.field754 = this.field755 = 0;
    }

    @OriginalMember(owner = "IBHVCUAH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class19(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field752 = var3.getWidth(arg1);
            this.field753 = var3.getHeight(arg1);
            this.field756 = this.field752;
            this.field757 = this.field753;
            this.field754 = 0;
            this.field755 = 0;
            this.field751 = new int[this.field753 * this.field752];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field752, this.field753, this.field751, 0, this.field752);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "<init>", descriptor = "(LRVLWVPJQ;Ljava/lang/String;I)V")
    public class19(class50 arg0, String arg1, int arg2) {
        class55 var4 = new class55(741, arg0.method424(arg1 + ".dat", null));
        class55 var5 = new class55(741, arg0.method424("index.dat", null));
        var5.field1456 = var4.method457();
        this.field756 = var5.method457();
        this.field757 = var5.method457();
        int var6 = var5.method455();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method459();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1456 += 2;
            var4.field1456 += var5.method457() * var5.method457();
            var5.field1456++;
        }
        this.field754 = var5.method455();
        this.field755 = var5.method455();
        this.field752 = var5.method457();
        this.field753 = var5.method457();
        int var10 = var5.method455();
        int var11 = this.field753 * this.field752;
        this.field751 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field751[var12] = var7[var4.method455()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field752; var13++) {
                for (int var14 = 0; var14 < this.field753; var14++) {
                    this.field751[this.field752 * var14 + var13] = var7[var4.method455()];
                }
            }
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(Z)V")
    public void method227(boolean arg0) {
        class53.method427(this.field748, this.field751, this.field753, this.field752);
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(IBII)V")
    public void method228(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 85) {
            return;
        }
        for (int var5 = 0; var5 < this.field751.length; var5++) {
            int var6 = this.field751[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
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
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field751[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "b", descriptor = "(Z)V")
    public void method229(boolean arg0) {
        int[] var2 = new int[this.field757 * this.field756];
        for (int var3 = 0; var3 < this.field753; var3++) {
            for (int var4 = 0; var4 < this.field752; var4++) {
                var2[(this.field755 + var3) * this.field756 + this.field754 + var4] = this.field751[this.field752 * var3 + var4];
            }
        }
        if (!arg0) {
            return;
        }
        this.field751 = var2;
        this.field752 = this.field756;
        this.field753 = this.field757;
        this.field754 = 0;
        this.field755 = 0;
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(IBI)V")
    public void method230(int arg0, byte arg1, int arg2) {
        int var4 = this.field754 + arg0;
        int var5 = this.field755 + arg2;
        int var6 = class53.field1372 * var5 + var4;
        int var7 = 0;
        if (arg1 != -76) {
            return;
        }
        int var8 = this.field753;
        int var9 = this.field752;
        int var10 = class53.field1372 - var9;
        int var11 = 0;
        if (var5 < class53.field1374) {
            int var12 = class53.field1374 - var5;
            var8 -= var12;
            var5 = class53.field1374;
            var7 += var9 * var12;
            var6 += class53.field1372 * var12;
        }
        if (var5 + var8 > class53.field1375) {
            var8 -= var5 + var8 - class53.field1375;
        }
        if (var4 < class53.field1376) {
            int var13 = class53.field1376 - var4;
            var9 -= var13;
            var4 = class53.field1376;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1377) {
            int var14 = var4 + var9 - class53.field1377;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method231(var7, var10, true, var6, class53.field1371, var8, var9, var11, this.field751);
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(IIZI[IIII[I)V")
    private void method231(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8) {
        int var10 = -(arg6 >> 2);
        if (!arg2) {
            return;
        }
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg5; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg4[arg3++] = arg8[arg0++];
                arg4[arg3++] = arg8[arg0++];
                arg4[arg3++] = arg8[arg0++];
                arg4[arg3++] = arg8[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg4[arg3++] = arg8[arg0++];
            }
            arg3 += arg1;
            arg0 += arg7;
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(III)V")
    public void method232(int arg0, int arg1, int arg2) {
        if (arg2 >= 0) {
            this.field749 = 353;
        }
        int var4 = this.field754 + arg0;
        int var5 = this.field755 + arg1;
        int var6 = class53.field1372 * var5 + var4;
        int var7 = 0;
        int var8 = this.field753;
        int var9 = this.field752;
        int var10 = class53.field1372 - var9;
        int var11 = 0;
        if (var5 < class53.field1374) {
            int var12 = class53.field1374 - var5;
            var8 -= var12;
            var5 = class53.field1374;
            var7 += var9 * var12;
            var6 += class53.field1372 * var12;
        }
        if (var5 + var8 > class53.field1375) {
            var8 -= var5 + var8 - class53.field1375;
        }
        if (var4 < class53.field1376) {
            int var13 = class53.field1376 - var4;
            var9 -= var13;
            var4 = class53.field1376;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1377) {
            int var14 = var4 + var9 - class53.field1377;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method233(class53.field1371, this.field751, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method233(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(ZIII)V")
    public void method234(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return;
        }
        int var5 = this.field754 + arg1;
        int var6 = this.field755 + arg3;
        int var7 = class53.field1372 * var6 + var5;
        int var8 = 0;
        int var9 = this.field753;
        int var10 = this.field752;
        int var11 = class53.field1372 - var10;
        int var12 = 0;
        if (var6 < class53.field1374) {
            int var13 = class53.field1374 - var6;
            var9 -= var13;
            var6 = class53.field1374;
            var8 += var10 * var13;
            var7 += class53.field1372 * var13;
        }
        if (var6 + var9 > class53.field1375) {
            var9 -= var6 + var9 - class53.field1375;
        }
        if (var5 < class53.field1376) {
            int var14 = class53.field1376 - var5;
            var10 -= var14;
            var5 = class53.field1376;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class53.field1377) {
            int var15 = var5 + var10 - class53.field1377;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method235(var8, var11, var7, var9, 0, class53.field1371, -16065, arg2, this.field751, var12, var10);
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(IIIII[III[III)V")
    private void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg6 != -16065) {
            this.field750 = -234;
        }
        int var12 = 256 - arg7;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = -arg10; var14 < 0; var14++) {
                int var15 = arg8[arg0++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg5[arg2];
                    arg5[arg2++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg1;
            arg0 += arg9;
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(III[IIB[IIIII)V")
    public void method236(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 == 1) {
            boolean var12 = false;
        } else {
            this.field748 = !this.field748;
        }
        try {
            int var13 = -arg0 / 2;
            int var14 = -arg1 / 2;
            int var15 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
            int var17 = arg9 * var15 >> 8;
            int var18 = arg9 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg7 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class53.field1372 * arg8 + arg10;
            for (int var22 = 0; var22 < arg1; var22++) {
                int var23 = arg6[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg3[var22]; var27 < 0; var27++) {
                    class53.field1371[var24++] = this.field751[(var25 >> 16) + (var26 >> 16) * this.field752];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class53.field1372;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(DBIIIIIII)V")
    public void method237(double arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 126) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg8 / 2;
            int var13 = -arg6 / 2;
            int var14 = (int) (Math.sin(arg0) * 65536.0D);
            int var15 = (int) (Math.cos(arg0) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class53.field1372 * arg3 + arg7;
            for (int var21 = 0; var21 < arg6; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg8; var25 < 0; var25++) {
                    int var26 = this.field751[(var23 >> 16) + (var24 >> 16) * this.field752];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class53.field1371[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class53.field1372;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(ZILXHDQQNIR;I)V")
    public void method238(boolean arg0, int arg1, class68 arg2, int arg3) {
        if (!arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field754 + arg3;
        int var7 = this.field755 + arg1;
        int var8 = class53.field1372 * var7 + var6;
        int var9 = 0;
        int var10 = this.field753;
        int var11 = this.field752;
        int var12 = class53.field1372 - var11;
        int var13 = 0;
        if (var7 < class53.field1374) {
            int var14 = class53.field1374 - var7;
            var10 -= var14;
            var7 = class53.field1374;
            var9 += var11 * var14;
            var8 += class53.field1372 * var14;
        }
        if (var7 + var10 > class53.field1375) {
            var10 -= var7 + var10 - class53.field1375;
        }
        if (var6 < class53.field1376) {
            int var15 = class53.field1376 - var6;
            var11 -= var15;
            var6 = class53.field1376;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class53.field1377) {
            int var16 = var6 + var11 - class53.field1377;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method239(this.field747, arg2.field1675, var8, var10, this.field751, var13, var12, class53.field1371, 0, var9, var11);
        }
    }

    @OriginalMember(owner = "IBHVCUAH", name = "a", descriptor = "(I[BII[III[IIII)V")
    private void method239(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg0 <= 0) {
            return;
        }
        int var12 = -(arg10 >> 2);
        int var13 = -(arg10 & 0x3);
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg9++];
                if (var18 != 0 && arg1[arg2] == 0) {
                    arg7[arg2++] = var18;
                } else {
                    arg2++;
                }
                int var19 = arg4[arg9++];
                if (var19 != 0 && arg1[arg2] == 0) {
                    arg7[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg4[arg9++];
                if (var20 != 0 && arg1[arg2] == 0) {
                    arg7[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg4[arg9++];
                if (var21 != 0 && arg1[arg2] == 0) {
                    arg7[arg2++] = var21;
                } else {
                    arg2++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg9++];
                if (var17 != 0 && arg1[arg2] == 0) {
                    arg7[arg2++] = var17;
                } else {
                    arg2++;
                }
            }
            arg2 += arg6;
            arg9 += arg5;
        }
    }
}
