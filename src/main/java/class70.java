import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YZDAHXEQ")
public class class70 extends class13 {

    @OriginalMember(owner = "YZDAHXEQ", name = "v", descriptor = "I")
    private int field1685 = 3;

    @OriginalMember(owner = "YZDAHXEQ", name = "w", descriptor = "Z")
    private boolean field1686 = true;

    @OriginalMember(owner = "YZDAHXEQ", name = "x", descriptor = "Z")
    private boolean field1687 = false;

    @OriginalMember(owner = "YZDAHXEQ", name = "y", descriptor = "B")
    private byte field1688 = 9;

    @OriginalMember(owner = "YZDAHXEQ", name = "z", descriptor = "I")
    private int field1689 = 5;

    @OriginalMember(owner = "YZDAHXEQ", name = "A", descriptor = "I")
    private int field1690 = 252;

    @OriginalMember(owner = "YZDAHXEQ", name = "B", descriptor = "Z")
    private boolean field1691 = false;

    @OriginalMember(owner = "YZDAHXEQ", name = "C", descriptor = "I")
    private int field1692 = -90;

    @OriginalMember(owner = "YZDAHXEQ", name = "D", descriptor = "[I")
    public int[] field1693;

    @OriginalMember(owner = "YZDAHXEQ", name = "I", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "YZDAHXEQ", name = "E", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "YZDAHXEQ", name = "J", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "YZDAHXEQ", name = "F", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "YZDAHXEQ", name = "H", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "YZDAHXEQ", name = "G", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "YZDAHXEQ", name = "<init>", descriptor = "(II)V")
    public class70(int arg0, int arg1) {
        this.field1693 = new int[arg0 * arg1];
        this.field1694 = this.field1698 = arg0;
        this.field1695 = this.field1699 = arg1;
        this.field1696 = this.field1697 = 0;
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class70(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1694 = var3.getWidth(arg1);
            this.field1695 = var3.getHeight(arg1);
            this.field1698 = this.field1694;
            this.field1699 = this.field1695;
            this.field1696 = 0;
            this.field1697 = 0;
            this.field1693 = new int[this.field1695 * this.field1694];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1694, this.field1695, this.field1693, 0, this.field1694);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "<init>", descriptor = "(LMNPBQFWE;Ljava/lang/String;I)V")
    public class70(class37 arg0, String arg1, int arg2) {
        class3 var4 = new class3(false, arg0.method429(arg1 + ".dat", null));
        class3 var5 = new class3(false, arg0.method429("index.dat", null));
        var5.field20 = var4.method17();
        this.field1698 = var5.method17();
        this.field1699 = var5.method17();
        int var6 = var5.method15();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method19();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field20 += 2;
            var4.field20 += var5.method17() * var5.method17();
            var5.field20++;
        }
        this.field1696 = var5.method15();
        this.field1697 = var5.method15();
        this.field1694 = var5.method17();
        this.field1695 = var5.method17();
        int var10 = var5.method15();
        int var11 = this.field1695 * this.field1694;
        this.field1693 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1693[var12] = var7[var4.method15()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1694; var13++) {
                for (int var14 = 0; var14 < this.field1695; var14++) {
                    this.field1693[this.field1694 * var14 + var13] = var7[var4.method15()];
                }
            }
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(I)V")
    public void method548(int arg0) {
        if (arg0 != 16595) {
            this.field1691 = !this.field1691;
        }
        class13.method223(196, this.field1695, this.field1694, this.field1693);
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IIII)V")
    public void method549(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1693.length; var5++) {
            int var6 = this.field1693[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg0 + var7;
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
                int var12 = arg1 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1693[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "c", descriptor = "(Z)V")
    public void method550(boolean arg0) {
        int[] var2 = new int[this.field1699 * this.field1698];
        for (int var3 = 0; var3 < this.field1695; var3++) {
            for (int var4 = 0; var4 < this.field1694; var4++) {
                var2[(this.field1697 + var3) * this.field1698 + this.field1696 + var4] = this.field1693[this.field1694 * var3 + var4];
            }
        }
        this.field1693 = var2;
        this.field1694 = this.field1698;
        this.field1695 = this.field1699;
        this.field1696 = 0;
        if (!arg0) {
            this.field1697 = 0;
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(ZII)V")
    public void method551(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            return;
        }
        int var4 = this.field1696 + arg2;
        int var5 = this.field1697 + arg1;
        int var6 = class13.field710 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1695;
        int var9 = this.field1694;
        int var10 = class13.field710 - var9;
        int var11 = 0;
        if (var5 < class13.field712) {
            int var12 = class13.field712 - var5;
            var8 -= var12;
            var5 = class13.field712;
            var7 += var9 * var12;
            var6 += class13.field710 * var12;
        }
        if (var5 + var8 > class13.field713) {
            var8 -= var5 + var8 - class13.field713;
        }
        if (var4 < class13.field714) {
            int var13 = class13.field714 - var4;
            var9 -= var13;
            var4 = class13.field714;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class13.field715) {
            int var14 = var4 + var9 - class13.field715;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method552(var8, var7, var9, var11, this.field1693, -20964, class13.field709, var6, var10);
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IIII[II[III)V")
    private void method552(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg2 >> 2);
        int var11 = -(arg2 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg7++] = arg4[arg1++];
                arg6[arg7++] = arg4[arg1++];
                arg6[arg7++] = arg4[arg1++];
                arg6[arg7++] = arg4[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg7++] = arg4[arg1++];
            }
            arg7 += arg8;
            arg1 += arg3;
        }
        if (arg5 == -20964) {
            ;
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IIZ)V")
    public void method553(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field1685 = -370;
        }
        int var4 = this.field1696 + arg0;
        int var5 = this.field1697 + arg1;
        int var6 = class13.field710 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1695;
        int var9 = this.field1694;
        int var10 = class13.field710 - var9;
        int var11 = 0;
        if (var5 < class13.field712) {
            int var12 = class13.field712 - var5;
            var8 -= var12;
            var5 = class13.field712;
            var7 += var9 * var12;
            var6 += class13.field710 * var12;
        }
        if (var5 + var8 > class13.field713) {
            var8 -= var5 + var8 - class13.field713;
        }
        if (var4 < class13.field714) {
            int var13 = class13.field714 - var4;
            var9 -= var13;
            var4 = class13.field714;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class13.field715) {
            int var14 = var4 + var9 - class13.field715;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method554(class13.field709, this.field1693, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method554(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(BIII)V")
    public void method555(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1696 + arg1;
        int var6 = this.field1697 + arg2;
        int var7 = class13.field710 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1695;
        int var10 = this.field1694;
        int var11 = class13.field710 - var10;
        int var12 = 0;
        if (var6 < class13.field712) {
            int var13 = class13.field712 - var6;
            var9 -= var13;
            var6 = class13.field712;
            var8 += var10 * var13;
            var7 += class13.field710 * var13;
        }
        if (var6 + var9 > class13.field713) {
            var9 -= var6 + var9 - class13.field713;
        }
        if (var5 < class13.field714) {
            int var14 = class13.field714 - var5;
            var10 -= var14;
            var5 = class13.field714;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class13.field715) {
            int var15 = var5 + var10 - class13.field715;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method556(this.field1693, 0, var7, true, arg3, var12, class13.field709, var10, var11, var8, var9);
            if (arg0 != -128) {
                this.field1686 = !this.field1686;
            }
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "([IIIZII[IIIII)V")
    private void method556(int[] arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (!arg3) {
            return;
        }
        int var12 = 256 - arg4;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg7; var14 < 0; var14++) {
                int var15 = arg0[arg9++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg6[arg2];
                    arg6[arg2++] = ((var15 & 0xFF00FF) * arg4 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg4 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg8;
            arg9 += arg5;
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "([IIIIIIBIII[I)V")
    public void method557(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (arg6 != 21) {
            this.field1686 = !this.field1686;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg3 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class13.field710 * arg7 + arg9;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg0[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg10[var21]; var26 < 0; var26++) {
                    class13.field709[var23++] = this.field1693[(var24 >> 16) + (var25 >> 16) * this.field1694];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class13.field710;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IIIIIIDII)V")
    public void method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        int var11 = 43 / arg5;
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin(arg6) * 65536.0D);
            int var15 = (int) (Math.cos(arg6) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class13.field710 * arg8 + arg1;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg7; var25 < 0; var25++) {
                    int var26 = this.field1693[(var23 >> 16) + (var24 >> 16) * this.field1694];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class13.field709[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class13.field710;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IILTKCVVLIT;I)V")
    public void method559(int arg0, int arg1, class57 arg2, int arg3) {
        int var5 = this.field1696 + arg1;
        int var6 = this.field1697 + arg3;
        if (arg0 < this.field1689 || arg0 > this.field1689) {
            this.field1685 = 332;
        }
        int var7 = class13.field710 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1695;
        int var10 = this.field1694;
        int var11 = class13.field710 - var10;
        int var12 = 0;
        if (var6 < class13.field712) {
            int var13 = class13.field712 - var6;
            var9 -= var13;
            var6 = class13.field712;
            var8 += var10 * var13;
            var7 += class13.field710 * var13;
        }
        if (var6 + var9 > class13.field713) {
            var9 -= var6 + var9 - class13.field713;
        }
        if (var5 < class13.field714) {
            int var14 = class13.field714 - var5;
            var10 -= var14;
            var5 = class13.field714;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class13.field715) {
            int var15 = var5 + var10 - class13.field715;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method560(var11, var8, var10, var12, 0, arg2.field1584, var7, 252, class13.field709, var9, this.field1693);
        }
    }

    @OriginalMember(owner = "YZDAHXEQ", name = "a", descriptor = "(IIIII[BII[II[I)V")
    private void method560(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9, int[] arg10) {
        if (arg7 <= 0) {
            return;
        }
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg10[arg1++];
                if (var18 != 0 && arg5[arg6] == 0) {
                    arg8[arg6++] = var18;
                } else {
                    arg6++;
                }
                int var19 = arg10[arg1++];
                if (var19 != 0 && arg5[arg6] == 0) {
                    arg8[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg10[arg1++];
                if (var20 != 0 && arg5[arg6] == 0) {
                    arg8[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg10[arg1++];
                if (var21 != 0 && arg5[arg6] == 0) {
                    arg8[arg6++] = var21;
                } else {
                    arg6++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg10[arg1++];
                if (var17 != 0 && arg5[arg6] == 0) {
                    arg8[arg6++] = var17;
                } else {
                    arg6++;
                }
            }
            arg6 += arg0;
            arg1 += arg3;
        }
    }
}
