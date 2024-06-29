import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ZSWNSCUQ")
public class class72 extends class67 {

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "z", descriptor = "I")
    private int field1759 = 1;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "A", descriptor = "B")
    private byte field1760 = 2;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "B", descriptor = "I")
    private int field1761 = 4;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "C", descriptor = "Z")
    private boolean field1762 = false;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "E", descriptor = "Z")
    private boolean field1764 = true;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "F", descriptor = "Z")
    private boolean field1765 = true;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "G", descriptor = "[I")
    public int[] field1766;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "L", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "H", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "M", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "I", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "K", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "J", descriptor = "I")
    public int field1769;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "y", descriptor = "I")
    private static int field1758;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "D", descriptor = "I")
    private int field1763;

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "(II)V")
    public class72(int arg0, int arg1) {
        this.field1766 = new int[arg0 * arg1];
        this.field1767 = this.field1771 = arg0;
        this.field1768 = this.field1772 = arg1;
        this.field1769 = this.field1770 = 0;
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class72(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1767 = var3.getWidth(arg1);
            this.field1768 = var3.getHeight(arg1);
            this.field1771 = this.field1767;
            this.field1772 = this.field1768;
            this.field1769 = 0;
            this.field1770 = 0;
            this.field1766 = new int[this.field1768 * this.field1767];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1767, this.field1768, this.field1766, 0, this.field1767);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "(LESUFCMYV;Ljava/lang/String;I)V")
    public class72(class11 arg0, String arg1, int arg2) {
        class53 var4 = new class53(arg0.method205(arg1 + ".dat", null), (byte) -17);
        class53 var5 = new class53(arg0.method205("index.dat", null), (byte) -17);
        var5.field1539 = var4.method457();
        this.field1771 = var5.method457();
        this.field1772 = var5.method457();
        int var6 = var5.method455();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method459();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1539 += 2;
            var4.field1539 += var5.method457() * var5.method457();
            var5.field1539++;
        }
        this.field1769 = var5.method455();
        this.field1770 = var5.method455();
        this.field1767 = var5.method457();
        this.field1768 = var5.method457();
        int var10 = var5.method455();
        int var11 = this.field1768 * this.field1767;
        this.field1766 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1766[var12] = var7[var4.method455()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1767; var13++) {
                    for (int var14 = 0; var14 < this.field1768; var14++) {
                        this.field1766[this.field1767 * var14 + var13] = var7[var4.method455()];
                    }
                }
            }
            if (class57.field1577) {
            }
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(I)V")
    public void method591(int arg0) {
        if (arg0 != -5281) {
            this.field1764 = !this.field1764;
        }
        class67.method568(false, this.field1766, this.field1767, this.field1768);
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IIII)V")
    public void method592(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 93 / arg2;
        for (int var6 = 0; var6 < this.field1766.length; var6++) {
            int var7 = this.field1766[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg3 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg0 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg1 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field1766[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "b", descriptor = "(I)V")
    public void method593(int arg0) {
        int[] var2 = new int[this.field1772 * this.field1771];
        if (arg0 < 0 || arg0 > 0) {
            this.field1763 = 321;
        }
        for (int var3 = 0; var3 < this.field1768; var3++) {
            for (int var4 = 0; var4 < this.field1767; var4++) {
                var2[(this.field1770 + var3) * this.field1771 + this.field1769 + var4] = this.field1766[this.field1767 * var3 + var4];
            }
        }
        this.field1766 = var2;
        this.field1767 = this.field1771;
        this.field1768 = this.field1772;
        this.field1769 = 0;
        this.field1770 = 0;
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(III)V")
    public void method594(int arg0, int arg1, int arg2) {
        int var4 = this.field1769 + arg0;
        int var5 = this.field1770 + arg1;
        if (arg2 < this.field1759 || arg2 > this.field1759) {
            this.field1764 = !this.field1764;
        }
        int var6 = class67.field1688 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1768;
        int var9 = this.field1767;
        int var10 = class67.field1688 - var9;
        int var11 = 0;
        if (var5 < class67.field1690) {
            int var12 = class67.field1690 - var5;
            var8 -= var12;
            var5 = class67.field1690;
            var7 += var9 * var12;
            var6 += class67.field1688 * var12;
        }
        if (var5 + var8 > class67.field1691) {
            var8 -= var5 + var8 - class67.field1691;
        }
        if (var4 < class67.field1692) {
            int var13 = class67.field1692 - var4;
            var9 -= var13;
            var4 = class67.field1692;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class67.field1693) {
            int var14 = var4 + var9 - class67.field1693;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method595(var6, var11, var7, var10, var8, this.field1760, class67.field1687, var9, this.field1766);
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IIIIIB[II[I)V")
    private void method595(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int[] arg6, int arg7, int[] arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        if (arg5 != 2) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg6[arg0++] = arg8[arg2++];
                arg6[arg0++] = arg8[arg2++];
                arg6[arg0++] = arg8[arg2++];
                arg6[arg0++] = arg8[arg2++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg6[arg0++] = arg8[arg2++];
            }
            arg0 += arg3;
            arg2 += arg1;
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "b", descriptor = "(III)V")
    public void method596(int arg0, int arg1, int arg2) {
        int var4 = this.field1769 + arg0;
        int var5 = this.field1770 + arg2;
        int var6 = class67.field1688 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1768;
        int var9 = this.field1767;
        int var10 = class67.field1688 - var9;
        int var11 = 0;
        if (var5 < class67.field1690) {
            int var12 = class67.field1690 - var5;
            var8 -= var12;
            var5 = class67.field1690;
            var7 += var9 * var12;
            var6 += class67.field1688 * var12;
        }
        if (var5 + var8 > class67.field1691) {
            var8 -= var5 + var8 - class67.field1691;
        }
        if (var4 < class67.field1692) {
            int var13 = class67.field1692 - var4;
            var9 -= var13;
            var4 = class67.field1692;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class67.field1693) {
            int var14 = var4 + var9 - class67.field1693;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method597(class67.field1687, this.field1766, 0, var7, var6, var9, var8, var10, var11);
            if (arg1 != 22912) {
                this.field1764 = !this.field1764;
            }
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method597(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IZII)V")
    public void method598(int arg0, boolean arg1, int arg2, int arg3) {
        int var5 = this.field1769 + arg3;
        int var6 = this.field1770 + arg0;
        if (arg1) {
            return;
        }
        int var7 = class67.field1688 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1768;
        int var10 = this.field1767;
        int var11 = class67.field1688 - var10;
        int var12 = 0;
        if (var6 < class67.field1690) {
            int var13 = class67.field1690 - var6;
            var9 -= var13;
            var6 = class67.field1690;
            var8 += var10 * var13;
            var7 += class67.field1688 * var13;
        }
        if (var6 + var9 > class67.field1691) {
            var9 -= var6 + var9 - class67.field1691;
        }
        if (var5 < class67.field1692) {
            int var14 = class67.field1692 - var5;
            var10 -= var14;
            var5 = class67.field1692;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class67.field1693) {
            int var15 = var5 + var10 - class67.field1693;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method599(0, var8, this.field1766, false, var12, var7, var10, arg2, var11, var9, class67.field1687);
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(II[IZIIIIII[I)V")
    private void method599(int arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg7;
        if (arg3) {
            field1758 = -107;
        }
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg2[arg1++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    int var16 = arg10[arg5];
                    arg10[arg5++] = ((var15 & 0xFF00FF) * arg7 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg7 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg8;
            arg1 += arg4;
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(I[IIIIIIIII[I)V")
    public void method600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        if (arg7 != 35958) {
            return;
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
            int var16 = arg5 * var14 >> 8;
            int var17 = arg5 * var15 >> 8;
            int var18 = (arg2 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class67.field1688 * arg0 + arg3;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg10[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg1[var21]; var26 < 0; var26++) {
                    class67.field1687[var23++] = this.field1766[(var24 >> 16) + (var25 >> 16) * this.field1767];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class67.field1688;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(DIZIIIIII)V")
    public void method601(double arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2) {
            this.field1764 = !this.field1764;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg0) * 65536.0D);
            int var14 = (int) (Math.cos(arg0) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg8 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class67.field1688 * arg1 + arg3;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1766[(var22 >> 16) + (var23 >> 16) * this.field1767];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class67.field1687[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class67.field1688;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(ILWGRALUSQ;II)V")
    public void method602(int arg0, class66 arg1, int arg2, int arg3) {
        if (arg0 != 22290) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1769 + arg2;
        int var7 = this.field1770 + arg3;
        int var8 = class67.field1688 * var7 + var6;
        int var9 = 0;
        int var10 = this.field1768;
        int var11 = this.field1767;
        int var12 = class67.field1688 - var11;
        int var13 = 0;
        if (var7 < class67.field1690) {
            int var14 = class67.field1690 - var7;
            var10 -= var14;
            var7 = class67.field1690;
            var9 += var11 * var14;
            var8 += class67.field1688 * var14;
        }
        if (var7 + var10 > class67.field1691) {
            var10 -= var7 + var10 - class67.field1691;
        }
        if (var6 < class67.field1692) {
            int var15 = class67.field1692 - var6;
            var11 -= var15;
            var6 = class67.field1692;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class67.field1693) {
            int var16 = var6 + var11 - class67.field1693;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method603(var11, var13, var9, this.field1766, 0, var12, (byte) 73, class67.field1687, var8, var10, arg1.field1675);
        }
    }

    @OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(III[IIIB[III[B)V")
    private void method603(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, int[] arg7, int arg8, int arg9, byte[] arg10) {
        int var12 = -(arg0 >> 2);
        int var13 = -(arg0 & 0x3);
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg2++];
                if (var18 != 0 && arg10[arg8] == 0) {
                    arg7[arg8++] = var18;
                } else {
                    arg8++;
                }
                int var19 = arg3[arg2++];
                if (var19 != 0 && arg10[arg8] == 0) {
                    arg7[arg8++] = var19;
                } else {
                    arg8++;
                }
                int var20 = arg3[arg2++];
                if (var20 != 0 && arg10[arg8] == 0) {
                    arg7[arg8++] = var20;
                } else {
                    arg8++;
                }
                int var21 = arg3[arg2++];
                if (var21 != 0 && arg10[arg8] == 0) {
                    arg7[arg8++] = var21;
                } else {
                    arg8++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg2++];
                if (var17 != 0 && arg10[arg8] == 0) {
                    arg7[arg8++] = var17;
                } else {
                    arg8++;
                }
            }
            arg8 += arg5;
            arg2 += arg1;
        }
        if (arg6 == 73) {
            ;
        }
    }
}
