import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YHASUFYG")
public class class68 extends class11 {

    @OriginalMember(owner = "YHASUFYG", name = "z", descriptor = "I")
    private int field1682 = 99;

    @OriginalMember(owner = "YHASUFYG", name = "A", descriptor = "I")
    private int field1683 = 2239;

    @OriginalMember(owner = "YHASUFYG", name = "B", descriptor = "I")
    private int field1684 = 46583;

    @OriginalMember(owner = "YHASUFYG", name = "C", descriptor = "I")
    private int field1685 = 6;

    @OriginalMember(owner = "YHASUFYG", name = "D", descriptor = "Z")
    private boolean field1686 = false;

    @OriginalMember(owner = "YHASUFYG", name = "E", descriptor = "Z")
    private boolean field1687 = true;

    @OriginalMember(owner = "YHASUFYG", name = "F", descriptor = "I")
    private int field1688 = -13016;

    @OriginalMember(owner = "YHASUFYG", name = "G", descriptor = "Z")
    private boolean field1689 = false;

    @OriginalMember(owner = "YHASUFYG", name = "H", descriptor = "[I")
    public int[] field1690;

    @OriginalMember(owner = "YHASUFYG", name = "M", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "YHASUFYG", name = "I", descriptor = "I")
    public int field1691;

    @OriginalMember(owner = "YHASUFYG", name = "N", descriptor = "I")
    public int field1696;

    @OriginalMember(owner = "YHASUFYG", name = "J", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "YHASUFYG", name = "L", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "YHASUFYG", name = "K", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "YHASUFYG", name = "<init>", descriptor = "(II)V")
    public class68(int arg0, int arg1) {
        this.field1690 = new int[arg0 * arg1];
        this.field1691 = this.field1695 = arg0;
        this.field1692 = this.field1696 = arg1;
        this.field1693 = this.field1694 = 0;
    }

    @OriginalMember(owner = "YHASUFYG", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class68(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1691 = var3.getWidth(arg1);
            this.field1692 = var3.getHeight(arg1);
            this.field1695 = this.field1691;
            this.field1696 = this.field1692;
            this.field1693 = 0;
            this.field1694 = 0;
            this.field1690 = new int[this.field1692 * this.field1691];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1691, this.field1692, this.field1690, 0, this.field1691);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "<init>", descriptor = "(LBYZSQZUF;Ljava/lang/String;I)V")
    public class68(class7 arg0, String arg1, int arg2) {
        class24 var4 = new class24(0, arg0.method29(arg1 + ".dat", null));
        class24 var5 = new class24(0, arg0.method29("index.dat", null));
        var5.field832 = var4.method240();
        this.field1695 = var5.method240();
        this.field1696 = var5.method240();
        int var6 = var5.method238();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method242();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field832 += 2;
            var4.field832 += var5.method240() * var5.method240();
            var5.field832++;
        }
        this.field1693 = var5.method238();
        this.field1694 = var5.method238();
        this.field1691 = var5.method240();
        this.field1692 = var5.method240();
        int var10 = var5.method238();
        int var11 = this.field1692 * this.field1691;
        this.field1690 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1690[var12] = var7[var4.method238()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1691; var13++) {
                for (int var14 = 0; var14 < this.field1692; var14++) {
                    this.field1690[this.field1691 * var14 + var13] = var7[var4.method238()];
                }
            }
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "b", descriptor = "(I)V")
    public void method573(int arg0) {
        class11.method191(24940, this.field1690, this.field1691, this.field1692);
        if (arg0 != 9133) {
            this.field1683 = -368;
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(IIII)V")
    public void method574(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1690.length; var5++) {
            int var6 = this.field1690[var5];
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
                this.field1690[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg2 <= 0) {
            this.field1686 = !this.field1686;
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "c", descriptor = "(I)V")
    public void method575(int arg0) {
        int[] var2 = new int[this.field1696 * this.field1695];
        for (int var3 = 0; var3 < this.field1692; var3++) {
            for (int var4 = 0; var4 < this.field1691; var4++) {
                var2[(this.field1694 + var3) * this.field1695 + this.field1693 + var4] = this.field1690[this.field1691 * var3 + var4];
            }
        }
        this.field1690 = var2;
        this.field1691 = this.field1695;
        this.field1692 = this.field1696;
        if (arg0 != 38485) {
            this.field1683 = -448;
        }
        this.field1693 = 0;
        this.field1694 = 0;
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(III)V")
    public void method576(int arg0, int arg1, int arg2) {
        int var4 = this.field1693 + arg0;
        int var5 = this.field1694 + arg2;
        int var6 = class11.field649 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1692;
        int var9 = this.field1691;
        int var10 = class11.field649 - var9;
        int var11 = 0;
        if (arg1 != 7) {
            this.field1687 = !this.field1687;
        }
        if (var5 < class11.field651) {
            int var12 = class11.field651 - var5;
            var8 -= var12;
            var5 = class11.field651;
            var7 += var9 * var12;
            var6 += class11.field649 * var12;
        }
        if (var5 + var8 > class11.field652) {
            var8 -= var5 + var8 - class11.field652;
        }
        if (var4 < class11.field653) {
            int var13 = class11.field653 - var4;
            var9 -= var13;
            var4 = class11.field653;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class11.field654) {
            int var14 = var4 + var9 - class11.field654;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method577(var7, this.field1690, var11, 0, var9, var6, class11.field648, var10, var8);
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(I[IIIII[III)V")
    private void method577(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg4 >> 2);
        if (arg3 != 0) {
            this.field1688 = -430;
        }
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg5++] = arg1[arg0++];
                arg6[arg5++] = arg1[arg0++];
                arg6[arg5++] = arg1[arg0++];
                arg6[arg5++] = arg1[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg5++] = arg1[arg0++];
            }
            arg5 += arg7;
            arg0 += arg2;
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "b", descriptor = "(III)V")
    public void method578(int arg0, int arg1, int arg2) {
        int var4 = this.field1693 + arg0;
        int var5 = this.field1694 + arg1;
        if (arg2 != 4) {
            return;
        }
        int var6 = class11.field649 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1692;
        int var9 = this.field1691;
        int var10 = class11.field649 - var9;
        int var11 = 0;
        if (var5 < class11.field651) {
            int var12 = class11.field651 - var5;
            var8 -= var12;
            var5 = class11.field651;
            var7 += var9 * var12;
            var6 += class11.field649 * var12;
        }
        if (var5 + var8 > class11.field652) {
            var8 -= var5 + var8 - class11.field652;
        }
        if (var4 < class11.field653) {
            int var13 = class11.field653 - var4;
            var9 -= var13;
            var4 = class11.field653;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class11.field654) {
            int var14 = var4 + var9 - class11.field654;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method579(class11.field648, this.field1690, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method579(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(IIIB)V")
    public void method580(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field1693 + arg1;
        int var6 = this.field1694 + arg0;
        int var7 = class11.field649 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1692;
        int var10 = this.field1691;
        int var11 = class11.field649 - var10;
        int var12 = 0;
        if (var6 < class11.field651) {
            int var13 = class11.field651 - var6;
            var9 -= var13;
            var6 = class11.field651;
            var8 += var10 * var13;
            var7 += class11.field649 * var13;
        }
        if (var6 + var9 > class11.field652) {
            var9 -= var6 + var9 - class11.field652;
        }
        if (var5 < class11.field653) {
            int var14 = class11.field653 - var5;
            var10 -= var14;
            var5 = class11.field653;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class11.field654) {
            int var15 = var5 + var10 - class11.field654;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method581(var8, 544, var7, arg2, class11.field648, var11, var9, 0, var12, var10, this.field1690);
            if (arg3 == 2) {
                ;
            }
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(IIII[IIIIII[I)V")
    private void method581(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg3;
        for (int var13 = -arg6; var13 < 0; var13++) {
            for (int var14 = -arg9; var14 < 0; var14++) {
                int var15 = arg10[arg0++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg4[arg2];
                    arg4[arg2++] = ((var15 & 0xFF00FF) * arg3 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg3 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg5;
            arg0 += arg8;
        }
        if (arg1 <= 0) {
            this.field1684 = 368;
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(III[IIIIII[II)V")
    public void method582(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg0 != 0) {
            return;
        }
        try {
            int var12 = -arg7 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
            int var16 = arg8 * var14 >> 8;
            int var17 = arg8 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class11.field649 * arg5 + arg6;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = arg9[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg3[var21]; var26 < 0; var26++) {
                    class11.field648[var23++] = this.field1690[(var24 >> 16) + (var25 >> 16) * this.field1691];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class11.field649;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(IIDIIIIII)V")
    public void method583(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3 >= 0) {
            return;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg1 / 2;
            int var13 = (int) (Math.sin(arg2) * 65536.0D);
            int var14 = (int) (Math.cos(arg2) * 65536.0D);
            int var15 = arg6 * var13 >> 8;
            int var16 = arg6 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class11.field649 * arg8 + arg0;
            for (int var20 = 0; var20 < arg1; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1690[(var22 >> 16) + (var23 >> 16) * this.field1691];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class11.field648[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class11.field649;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "(ILAGTHLVTI;IB)V")
    public void method584(int arg0, class3 arg1, int arg2, byte arg3) {
        int var5 = this.field1693 + arg2;
        if (arg3 != -121) {
            return;
        }
        int var6 = this.field1694 + arg0;
        int var7 = class11.field649 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1692;
        int var10 = this.field1691;
        int var11 = class11.field649 - var10;
        int var12 = 0;
        if (var6 < class11.field651) {
            int var13 = class11.field651 - var6;
            var9 -= var13;
            var6 = class11.field651;
            var8 += var10 * var13;
            var7 += class11.field649 * var13;
        }
        if (var6 + var9 > class11.field652) {
            var9 -= var6 + var9 - class11.field652;
        }
        if (var5 < class11.field653) {
            int var14 = class11.field653 - var5;
            var10 -= var14;
            var5 = class11.field653;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class11.field654) {
            int var15 = var5 + var10 - class11.field654;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method585(this.field1690, var8, var9, var10, var12, var11, 6, 0, class11.field648, arg1.field26, var7);
        }
    }

    @OriginalMember(owner = "YHASUFYG", name = "a", descriptor = "([IIIIIIII[I[BI)V")
    private void method585(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9, int arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg0[arg1++];
                if (var18 != 0 && arg9[arg10] == 0) {
                    arg8[arg10++] = var18;
                } else {
                    arg10++;
                }
                int var19 = arg0[arg1++];
                if (var19 != 0 && arg9[arg10] == 0) {
                    arg8[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg0[arg1++];
                if (var20 != 0 && arg9[arg10] == 0) {
                    arg8[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg0[arg1++];
                if (var21 != 0 && arg9[arg10] == 0) {
                    arg8[arg10++] = var21;
                } else {
                    arg10++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg0[arg1++];
                if (var17 != 0 && arg9[arg10] == 0) {
                    arg8[arg10++] = var17;
                } else {
                    arg10++;
                }
            }
            arg10 += arg5;
            arg1 += arg4;
        }
        if (this.field1685 == arg6) {
            ;
        }
    }
}
