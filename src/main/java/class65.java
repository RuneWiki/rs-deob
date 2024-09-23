import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XANVNPIN")
public class class65 extends class62 {

    @OriginalMember(owner = "XANVNPIN", name = "y", descriptor = "B")
    private byte field1611 = 3;

    @OriginalMember(owner = "XANVNPIN", name = "z", descriptor = "B")
    private byte field1612 = 9;

    @OriginalMember(owner = "XANVNPIN", name = "A", descriptor = "Z")
    private boolean field1613 = false;

    @OriginalMember(owner = "XANVNPIN", name = "B", descriptor = "Z")
    private boolean field1614 = false;

    @OriginalMember(owner = "XANVNPIN", name = "C", descriptor = "Z")
    private boolean field1615 = false;

    @OriginalMember(owner = "XANVNPIN", name = "D", descriptor = "Z")
    private boolean field1616 = false;

    @OriginalMember(owner = "XANVNPIN", name = "E", descriptor = "I")
    private int field1617 = -45332;

    @OriginalMember(owner = "XANVNPIN", name = "G", descriptor = "I")
    private int field1619 = 5;

    @OriginalMember(owner = "XANVNPIN", name = "H", descriptor = "[I")
    public int[] field1620;

    @OriginalMember(owner = "XANVNPIN", name = "M", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "XANVNPIN", name = "I", descriptor = "I")
    public int field1621;

    @OriginalMember(owner = "XANVNPIN", name = "N", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "XANVNPIN", name = "J", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "XANVNPIN", name = "L", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "XANVNPIN", name = "K", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "XANVNPIN", name = "x", descriptor = "Z")
    private static boolean field1610 = true;

    @OriginalMember(owner = "XANVNPIN", name = "F", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "XANVNPIN", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        this.field1620 = new int[arg0 * arg1];
        this.field1621 = this.field1625 = arg0;
        this.field1622 = this.field1626 = arg1;
        this.field1623 = this.field1624 = 0;
    }

    @OriginalMember(owner = "XANVNPIN", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class65(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1621 = var3.getWidth(arg1);
            this.field1622 = var3.getHeight(arg1);
            this.field1625 = this.field1621;
            this.field1626 = this.field1622;
            this.field1623 = 0;
            this.field1624 = 0;
            this.field1620 = new int[this.field1622 * this.field1621];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1621, this.field1622, this.field1620, 0, this.field1621);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "<init>", descriptor = "(LFNOQZAYQ;Ljava/lang/String;I)V")
    public class65(class14 arg0, String arg1, int arg2) {
        class11 var4 = new class11(arg0.method246(arg1 + ".dat", null), field1610);
        class11 var5 = new class11(arg0.method246("index.dat", null), field1610);
        var5.field643 = var4.method191();
        this.field1625 = var5.method191();
        this.field1626 = var5.method191();
        int var6 = var5.method189();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method193();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field643 += 2;
            var4.field643 += var5.method191() * var5.method191();
            var5.field643++;
        }
        this.field1623 = var5.method189();
        this.field1624 = var5.method189();
        this.field1621 = var5.method191();
        this.field1622 = var5.method191();
        int var10 = var5.method189();
        int var11 = this.field1622 * this.field1621;
        this.field1620 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1620[var12] = var7[var4.method189()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1621; var13++) {
                for (int var14 = 0; var14 < this.field1622; var14++) {
                    this.field1620[this.field1621 * var14 + var13] = var7[var4.method189()];
                }
            }
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "b", descriptor = "(I)V")
    public void method524(int arg0) {
        if (arg0 != 0) {
            field1610 = !field1610;
        }
        class62.method512(this.field1620, this.field1622, -203, this.field1621);
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(IIII)V")
    public void method525(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field1620.length; var6++) {
            int var7 = this.field1620[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg2 + var10;
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
                this.field1620[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "c", descriptor = "(I)V")
    public void method526(int arg0) {
        int[] var2 = new int[this.field1626 * this.field1625];
        int var3 = 0 / arg0;
        for (int var4 = 0; var4 < this.field1622; var4++) {
            for (int var5 = 0; var5 < this.field1621; var5++) {
                var2[(this.field1624 + var4) * this.field1625 + this.field1623 + var5] = this.field1620[this.field1621 * var4 + var5];
            }
        }
        this.field1620 = var2;
        this.field1621 = this.field1625;
        this.field1622 = this.field1626;
        this.field1623 = 0;
        this.field1624 = 0;
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(BII)V")
    public void method527(byte arg0, int arg1, int arg2) {
        int var4 = this.field1623 + arg1;
        int var5 = this.field1624 + arg2;
        int var6 = class62.field1529 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1622;
        int var9 = this.field1621;
        int var10 = class62.field1529 - var9;
        int var11 = 0;
        if (arg0 != 1) {
            return;
        }
        if (var5 < class62.field1531) {
            int var12 = class62.field1531 - var5;
            var8 -= var12;
            var5 = class62.field1531;
            var7 += var9 * var12;
            var6 += class62.field1529 * var12;
        }
        if (var5 + var8 > class62.field1532) {
            var8 -= var5 + var8 - class62.field1532;
        }
        if (var4 < class62.field1533) {
            int var13 = class62.field1533 - var4;
            var9 -= var13;
            var4 = class62.field1533;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class62.field1534) {
            int var14 = var4 + var9 - class62.field1534;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method528(var10, class62.field1528, var8, var11, var7, this.field1620, var6, var9, (byte) 5);
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(I[IIII[IIIB)V")
    private void method528(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg1[arg6++] = arg5[arg4++];
                arg1[arg6++] = arg5[arg4++];
                arg1[arg6++] = arg5[arg4++];
                arg1[arg6++] = arg5[arg4++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg1[arg6++] = arg5[arg4++];
            }
            arg6 += arg0;
            arg4 += arg3;
        }
        if (arg8 == 5) {
            boolean var13 = false;
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "b", descriptor = "(BII)V")
    public void method529(byte arg0, int arg1, int arg2) {
        int var4 = this.field1623 + arg1;
        int var5 = this.field1624 + arg2;
        if (arg0 != 50) {
            return;
        }
        int var6 = class62.field1529 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1622;
        int var9 = this.field1621;
        int var10 = class62.field1529 - var9;
        int var11 = 0;
        if (var5 < class62.field1531) {
            int var12 = class62.field1531 - var5;
            var8 -= var12;
            var5 = class62.field1531;
            var7 += var9 * var12;
            var6 += class62.field1529 * var12;
        }
        if (var5 + var8 > class62.field1532) {
            var8 -= var5 + var8 - class62.field1532;
        }
        if (var4 < class62.field1533) {
            int var13 = class62.field1533 - var4;
            var9 -= var13;
            var4 = class62.field1533;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class62.field1534) {
            int var14 = var4 + var9 - class62.field1534;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method530(class62.field1528, this.field1620, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method530(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(ZIII)V")
    public void method531(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1623 + arg1;
        int var6 = this.field1624 + arg2;
        int var7 = class62.field1529 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1622;
        int var10 = this.field1621;
        int var11 = class62.field1529 - var10;
        int var12 = 0;
        if (var6 < class62.field1531) {
            int var13 = class62.field1531 - var6;
            var9 -= var13;
            var6 = class62.field1531;
            var8 += var10 * var13;
            var7 += class62.field1529 * var13;
        }
        if (var6 + var9 > class62.field1532) {
            var9 -= var6 + var9 - class62.field1532;
        }
        if (var5 < class62.field1533) {
            int var14 = class62.field1533 - var5;
            var10 -= var14;
            var5 = class62.field1533;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class62.field1534) {
            int var15 = var5 + var10 - class62.field1534;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method532(var9, var11, var10, this.field1620, arg3, this.field1612, var7, var8, var12, class62.field1528, 0);
            if (arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(III[IIBIII[II)V")
    private void method532(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = 256 - arg4;
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var16 = -arg2; var16 < 0; var16++) {
                int var17 = arg3[arg7++];
                if (var17 == 0) {
                    arg6++;
                } else {
                    int var18 = arg9[arg6];
                    arg9[arg6++] = ((var17 & 0xFF00FF) * arg4 + (var18 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var17 & 0xFF00) * arg4 + (var18 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg1;
            arg7 += arg8;
        }
        if (arg5 == 9) {
            boolean var14 = false;
        } else {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(IIIII[I[IIIII)V")
    public void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg10 < 2 || arg10 > 2) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg0 / 2;
            int var14 = -arg9 / 2;
            int var15 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var17 = arg2 * var15 >> 8;
            int var18 = arg2 * var16 >> 8;
            int var19 = (arg4 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg1 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class62.field1529 * arg8 + arg7;
            for (int var22 = 0; var22 < arg9; var22++) {
                int var23 = arg6[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg5[var22]; var27 < 0; var27++) {
                    class62.field1528[var24++] = this.field1620[(var25 >> 16) + (var26 >> 16) * this.field1621];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class62.field1529;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(IIIIIBDII)V")
    public void method534(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, double arg6, int arg7, int arg8) {
        if (arg5 != 21) {
            return;
        }
        try {
            int var11 = -arg7 / 2;
            int var12 = -arg8 / 2;
            int var13 = (int) (Math.sin(arg6) * 65536.0D);
            int var14 = (int) (Math.cos(arg6) * 65536.0D);
            int var15 = arg0 * var13 >> 8;
            int var16 = arg0 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class62.field1529 * arg4 + arg3;
            for (int var20 = 0; var20 < arg8; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg7; var24 < 0; var24++) {
                    int var25 = this.field1620[(var22 >> 16) + (var23 >> 16) * this.field1621];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class62.field1528[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class62.field1529;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(LPQKEJITK;III)V")
    public void method535(class47 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1623 + arg3;
        int var6 = this.field1624 + arg2;
        if (arg1 != -29874) {
            return;
        }
        int var7 = class62.field1529 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1622;
        int var10 = this.field1621;
        int var11 = class62.field1529 - var10;
        int var12 = 0;
        if (var6 < class62.field1531) {
            int var13 = class62.field1531 - var6;
            var9 -= var13;
            var6 = class62.field1531;
            var8 += var10 * var13;
            var7 += class62.field1529 * var13;
        }
        if (var6 + var9 > class62.field1532) {
            var9 -= var6 + var9 - class62.field1532;
        }
        if (var5 < class62.field1533) {
            int var14 = class62.field1533 - var5;
            var10 -= var14;
            var5 = class62.field1533;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class62.field1534) {
            int var15 = var5 + var10 - class62.field1534;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method536(0, this.field1617, var9, var10, arg0.field1267, class62.field1528, var8, var7, var12, this.field1620, var11);
        }
    }

    @OriginalMember(owner = "XANVNPIN", name = "a", descriptor = "(IIII[B[IIII[II)V")
    private void method536(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        int var12 = -(arg3 >> 2);
        int var13 = -(arg3 & 0x3);
        if (arg1 != -45332) {
            this.field1618 = -391;
        }
        for (int var14 = -arg2; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg9[arg6++];
                if (var18 != 0 && arg4[arg7] == 0) {
                    arg5[arg7++] = var18;
                } else {
                    arg7++;
                }
                int var19 = arg9[arg6++];
                if (var19 != 0 && arg4[arg7] == 0) {
                    arg5[arg7++] = var19;
                } else {
                    arg7++;
                }
                int var20 = arg9[arg6++];
                if (var20 != 0 && arg4[arg7] == 0) {
                    arg5[arg7++] = var20;
                } else {
                    arg7++;
                }
                int var21 = arg9[arg6++];
                if (var21 != 0 && arg4[arg7] == 0) {
                    arg5[arg7++] = var21;
                } else {
                    arg7++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg9[arg6++];
                if (var17 != 0 && arg4[arg7] == 0) {
                    arg5[arg7++] = var17;
                } else {
                    arg7++;
                }
            }
            arg7 += arg10;
            arg6 += arg8;
        }
    }
}
