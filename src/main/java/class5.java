import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BISLJVZR")
public class class5 extends class58 {

    @OriginalMember(owner = "client!BISLJVZR", name = "z", descriptor = "Z")
    private boolean field49 = false;

    @OriginalMember(owner = "client!BISLJVZR", name = "B", descriptor = "Z")
    private boolean field50 = false;

    @OriginalMember(owner = "client!BISLJVZR", name = "C", descriptor = "I")
    private int field51 = 4;

    @OriginalMember(owner = "client!BISLJVZR", name = "D", descriptor = "Z")
    private boolean field52 = false;

    @OriginalMember(owner = "client!BISLJVZR", name = "E", descriptor = "I")
    private int field53 = 39072;

    @OriginalMember(owner = "client!BISLJVZR", name = "F", descriptor = "B")
    private byte field54 = 1;

    @OriginalMember(owner = "client!BISLJVZR", name = "G", descriptor = "Z")
    private boolean field55 = false;

    @OriginalMember(owner = "client!BISLJVZR", name = "H", descriptor = "[I")
    public int[] field56;

    @OriginalMember(owner = "client!BISLJVZR", name = "M", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!BISLJVZR", name = "I", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!BISLJVZR", name = "N", descriptor = "I")
    public int field62;

    @OriginalMember(owner = "client!BISLJVZR", name = "J", descriptor = "I")
    public int field58;

    @OriginalMember(owner = "client!BISLJVZR", name = "L", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!BISLJVZR", name = "K", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "(II)V")
    public class5(int arg0, int arg1) {
        this.field56 = new int[arg0 * arg1];
        this.field57 = this.field61 = arg0;
        this.field58 = this.field62 = arg1;
        this.field59 = this.field60 = 0;
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class5(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field57 = var3.getWidth(arg1);
            this.field58 = var3.getHeight(arg1);
            this.field61 = this.field57;
            this.field62 = this.field58;
            this.field59 = 0;
            this.field60 = 0;
            this.field56 = new int[this.field58 * this.field57];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field57, this.field58, this.field56, 0, this.field57);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "<init>", descriptor = "(LSMIVAFST;Ljava/lang/String;I)V")
    public class5(class52 arg0, String arg1, int arg2) {
        class7 var4 = new class7(arg0.method512(arg1 + ".dat", null), (byte) 3);
        class7 var5 = new class7(arg0.method512("index.dat", null), (byte) 3);
        var5.field91 = var4.method49();
        this.field61 = var5.method49();
        this.field62 = var5.method49();
        int var6 = var5.method47();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method51();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field91 += 2;
            var4.field91 += var5.method49() * var5.method49();
            var5.field91++;
        }
        this.field59 = var5.method47();
        this.field60 = var5.method47();
        this.field57 = var5.method49();
        this.field58 = var5.method49();
        int var10 = var5.method47();
        int var11 = this.field58 * this.field57;
        this.field56 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field56[var12] = var7[var4.method47()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field57; var13++) {
                for (int var14 = 0; var14 < this.field58; var14++) {
                    this.field56[this.field57 * var14 + var13] = var7[var4.method47()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "b", descriptor = "(I)V")
    public void method19(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class58.method523(this.field56, 0, this.field58, this.field57);
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIZ)V")
    public void method20(int arg0, int arg1, int arg2, boolean arg3) {
        for (int var5 = 0; var5 < this.field56.length; var5++) {
            int var6 = this.field56[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg2 + var9;
                if (var10 < 1) {
                    var10 = 1;
                } else if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = var6 & 0xFF;
                int var12 = arg1 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field56[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (!arg3) {
            this.field51 = -335;
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "c", descriptor = "(I)V")
    public void method21(int arg0) {
        int[] var2 = new int[this.field62 * this.field61];
        if (arg0 != 0) {
            this.field55 = !this.field55;
        }
        for (int var3 = 0; var3 < this.field58; var3++) {
            for (int var4 = 0; var4 < this.field57; var4++) {
                var2[(this.field60 + var3) * this.field61 + this.field59 + var4] = this.field56[this.field57 * var3 + var4];
            }
        }
        this.field56 = var2;
        this.field57 = this.field61;
        this.field58 = this.field62;
        this.field59 = 0;
        this.field60 = 0;
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(III)V")
    public void method22(int arg0, int arg1, int arg2) {
        int var4 = 30 / arg1;
        int var5 = this.field59 + arg2;
        int var6 = this.field60 + arg0;
        int var7 = class58.field1546 * var6 + var5;
        int var8 = 0;
        int var9 = this.field58;
        int var10 = this.field57;
        int var11 = class58.field1546 - var10;
        int var12 = 0;
        if (var6 < class58.field1548) {
            int var13 = class58.field1548 - var6;
            var9 -= var13;
            var6 = class58.field1548;
            var8 += var10 * var13;
            var7 += class58.field1546 * var13;
        }
        if (var6 + var9 > class58.field1549) {
            var9 -= var6 + var9 - class58.field1549;
        }
        if (var5 < class58.field1550) {
            int var14 = class58.field1550 - var5;
            var10 -= var14;
            var5 = class58.field1550;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class58.field1551) {
            int var15 = var5 + var10 - class58.field1551;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method23(var11, var12, var10, var8, var7, 4313, this.field56, var9, class58.field1545);
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIIII[II[I)V")
    private void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8) {
        if (arg5 != 4313) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        int var11 = -(arg2 >> 2);
        int var12 = -(arg2 & 0x3);
        for (int var13 = -arg7; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg4++] = arg6[arg3++];
                arg8[arg4++] = arg6[arg3++];
                arg8[arg4++] = arg6[arg3++];
                arg8[arg4++] = arg6[arg3++];
            }
            for (int var15 = var12; var15 < 0; var15++) {
                arg8[arg4++] = arg6[arg3++];
            }
            arg4 += arg0;
            arg3 += arg1;
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IBI)V")
    public void method24(int arg0, byte arg1, int arg2) {
        int var4 = this.field59 + arg2;
        int var5 = this.field60 + arg0;
        int var6 = class58.field1546 * var5 + var4;
        int var7 = 0;
        int var8 = this.field58;
        int var9 = this.field57;
        int var10 = class58.field1546 - var9;
        int var11 = 0;
        if (arg1 == 0) {
            boolean var12 = false;
        } else {
            this.field55 = !this.field55;
        }
        if (var5 < class58.field1548) {
            int var13 = class58.field1548 - var5;
            var8 -= var13;
            var5 = class58.field1548;
            var7 += var9 * var13;
            var6 += class58.field1546 * var13;
        }
        if (var5 + var8 > class58.field1549) {
            var8 -= var5 + var8 - class58.field1549;
        }
        if (var4 < class58.field1550) {
            int var14 = class58.field1550 - var4;
            var9 -= var14;
            var4 = class58.field1550;
            var7 += var14;
            var6 += var14;
            var11 += var14;
            var10 += var14;
        }
        if (var4 + var9 > class58.field1551) {
            int var15 = var4 + var9 - class58.field1551;
            var9 -= var15;
            var11 += var15;
            var10 += var15;
        }
        if (var9 > 0 && var8 > 0) {
            this.method25(class58.field1545, this.field56, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method25(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIZI)V")
    public void method26(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field59 + arg3;
        int var7 = this.field60 + arg0;
        int var8 = class58.field1546 * var7 + var6;
        int var9 = 0;
        int var10 = this.field58;
        int var11 = this.field57;
        int var12 = class58.field1546 - var11;
        int var13 = 0;
        if (var7 < class58.field1548) {
            int var14 = class58.field1548 - var7;
            var10 -= var14;
            var7 = class58.field1548;
            var9 += var11 * var14;
            var8 += class58.field1546 * var14;
        }
        if (var7 + var10 > class58.field1549) {
            var10 -= var7 + var10 - class58.field1549;
        }
        if (var6 < class58.field1550) {
            int var15 = class58.field1550 - var6;
            var11 -= var15;
            var6 = class58.field1550;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class58.field1551) {
            int var16 = var6 + var11 - class58.field1551;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method27(-957, var8, var9, class58.field1545, var11, var13, var12, this.field56, arg1, 0, var10);
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(III[IIII[IIII)V")
    private void method27(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg8;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = arg7[arg2++];
                if (var15 == 0) {
                    arg1++;
                } else {
                    int var16 = arg3[arg1];
                    arg3[arg1++] = ((var15 & 0xFF00FF) * arg8 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg8 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg1 += arg6;
            arg2 += arg5;
        }
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IZ[IIIIII[III)V")
    public void method28(int arg0, boolean arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (!arg1) {
            this.field55 = !this.field55;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg7 / 2;
            int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg3 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class58.field1546 * arg4 + arg6;
            for (int var21 = 0; var21 < arg7; var21++) {
                int var22 = arg8[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg2[var21]; var26 < 0; var26++) {
                    class58.field1545[var23++] = this.field56[(var24 >> 16) + (var25 >> 16) * this.field57];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class58.field1546;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IIIIIIIDI)V")
    public void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7, int arg8) {
        if (arg0 <= 0) {
            this.field55 = !this.field55;
        }
        try {
            int var11 = -arg8 / 2;
            int var12 = -arg5 / 2;
            int var13 = (int) (Math.sin(arg7) * 65536.0D);
            int var14 = (int) (Math.cos(arg7) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg3 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class58.field1546 * arg2 + arg4;
            for (int var20 = 0; var20 < arg5; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg8; var24 < 0; var24++) {
                    int var25 = this.field56[(var22 >> 16) + (var23 >> 16) * this.field57];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class58.field1545[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class58.field1546;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(IBLKYEPSAQL;I)V")
    public void method30(int arg0, byte arg1, class31 arg2, int arg3) {
        int var5 = this.field59 + arg0;
        int var6 = this.field60 + arg3;
        int var7 = class58.field1546 * var6 + var5;
        int var8 = 0;
        int var9 = this.field58;
        int var10 = this.field57;
        int var11 = class58.field1546 - var10;
        int var12 = 0;
        if (var6 < class58.field1548) {
            int var13 = class58.field1548 - var6;
            var9 -= var13;
            var6 = class58.field1548;
            var8 += var10 * var13;
            var7 += class58.field1546 * var13;
        }
        if (var6 + var9 > class58.field1549) {
            var9 -= var6 + var9 - class58.field1549;
        }
        if (var5 < class58.field1550) {
            int var14 = class58.field1550 - var5;
            var10 -= var14;
            var5 = class58.field1550;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class58.field1551) {
            int var15 = var5 + var10 - class58.field1551;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method31(var11, var7, class58.field1545, 0, this.field56, var10, var8, 0, var12, arg2.field913, var9);
            if (arg1 != -105) {
                this.field53 = 178;
            }
        }
    }

    @OriginalMember(owner = "client!BISLJVZR", name = "a", descriptor = "(II[II[IIIII[BI)V")
    private void method31(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        int var12 = -(arg5 >> 2);
        if (arg3 != 0) {
            return;
        }
        int var13 = -(arg5 & 0x3);
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg6++];
                if (var18 != 0 && arg9[arg1] == 0) {
                    arg2[arg1++] = var18;
                } else {
                    arg1++;
                }
                int var19 = arg4[arg6++];
                if (var19 != 0 && arg9[arg1] == 0) {
                    arg2[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg4[arg6++];
                if (var20 != 0 && arg9[arg1] == 0) {
                    arg2[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg4[arg6++];
                if (var21 != 0 && arg9[arg1] == 0) {
                    arg2[arg1++] = var21;
                } else {
                    arg1++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg6++];
                if (var17 != 0 && arg9[arg1] == 0) {
                    arg2[arg1++] = var17;
                } else {
                    arg1++;
                }
            }
            arg1 += arg0;
            arg6 += arg8;
        }
    }
}
