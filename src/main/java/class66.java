import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WSNKRVXZ")
public class class66 extends class72 {

    @OriginalMember(owner = "client!WSNKRVXZ", name = "z", descriptor = "I")
    private int field1639 = 6;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "A", descriptor = "Z")
    private boolean field1640 = false;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "B", descriptor = "Z")
    private boolean field1641 = true;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "D", descriptor = "I")
    private int field1643 = 44;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "E", descriptor = "[I")
    public int[] field1644;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "J", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "F", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "K", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "G", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "I", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "H", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "C", descriptor = "I")
    private int field1642;

    @OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "(II)V")
    public class66(int arg0, int arg1) {
        this.field1644 = new int[arg0 * arg1];
        this.field1645 = this.field1649 = arg0;
        this.field1646 = this.field1650 = arg1;
        this.field1647 = this.field1648 = 0;
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class66(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1645 = var3.getWidth(arg1);
            this.field1646 = var3.getHeight(arg1);
            this.field1649 = this.field1645;
            this.field1650 = this.field1646;
            this.field1647 = 0;
            this.field1648 = 0;
            this.field1644 = new int[this.field1646 * this.field1645];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1645, this.field1646, this.field1644, 0, this.field1645);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "<init>", descriptor = "(LRPFMUSNN;Ljava/lang/String;I)V")
    public class66(class49 arg0, String arg1, int arg2) {
        class63 var4 = new class63((byte) -58, arg0.method414(arg1 + ".dat", null));
        class63 var5 = new class63((byte) -58, arg0.method414("index.dat", null));
        var5.field1571 = var4.method504();
        this.field1649 = var5.method504();
        this.field1650 = var5.method504();
        int var6 = var5.method502();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method506();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1571 += 2;
            var4.field1571 += var5.method504() * var5.method504();
            var5.field1571++;
        }
        this.field1647 = var5.method502();
        this.field1648 = var5.method502();
        this.field1645 = var5.method504();
        this.field1646 = var5.method504();
        int var10 = var5.method502();
        int var11 = this.field1646 * this.field1645;
        this.field1644 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1644[var12] = var7[var4.method502()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1645; var13++) {
                for (int var14 = 0; var14 < this.field1646; var14++) {
                    this.field1644[this.field1645 * var14 + var13] = var7[var4.method502()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(Z)V")
    public void method545(boolean arg0) {
        if (!arg0) {
            class72.method592(this.field1644, false, this.field1645, this.field1646);
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIII)V")
    public void method546(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1644.length; var5++) {
            int var6 = this.field1644[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg3 + var7;
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
                this.field1644[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (arg0 < 3 || arg0 > 3) {
            this.field1640 = !this.field1640;
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "c", descriptor = "(I)V")
    public void method547(int arg0) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int[] var3 = new int[this.field1650 * this.field1649];
        for (int var4 = 0; var4 < this.field1646; var4++) {
            for (int var5 = 0; var5 < this.field1645; var5++) {
                var3[(this.field1648 + var4) * this.field1649 + this.field1647 + var5] = this.field1644[this.field1645 * var4 + var5];
            }
        }
        this.field1644 = var3;
        this.field1645 = this.field1649;
        this.field1646 = this.field1650;
        this.field1647 = 0;
        this.field1648 = 0;
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(III)V")
    public void method548(int arg0, int arg1, int arg2) {
        if (arg0 < 6 || arg0 > 6) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = this.field1647 + arg2;
        int var6 = this.field1648 + arg1;
        int var7 = class72.field1731 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1646;
        int var10 = this.field1645;
        int var11 = class72.field1731 - var10;
        int var12 = 0;
        if (var6 < class72.field1733) {
            int var13 = class72.field1733 - var6;
            var9 -= var13;
            var6 = class72.field1733;
            var8 += var10 * var13;
            var7 += class72.field1731 * var13;
        }
        if (var6 + var9 > class72.field1734) {
            var9 -= var6 + var9 - class72.field1734;
        }
        if (var5 < class72.field1735) {
            int var14 = class72.field1735 - var5;
            var10 -= var14;
            var5 = class72.field1735;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class72.field1736) {
            int var15 = var5 + var10 - class72.field1736;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method549(this.field1644, -639, class72.field1730, var7, var8, var11, var12, var10, var9);
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([II[IIIIIII)V")
    private void method549(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        if (arg1 >= 0) {
            this.field1642 = 478;
        }
        for (int var12 = -arg8; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg2[arg3++] = arg0[arg4++];
                arg2[arg3++] = arg0[arg4++];
                arg2[arg3++] = arg0[arg4++];
                arg2[arg3++] = arg0[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg2[arg3++] = arg0[arg4++];
            }
            arg3 += arg5;
            arg4 += arg6;
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(ZII)V")
    public void method550(boolean arg0, int arg1, int arg2) {
        int var4 = this.field1647 + arg1;
        int var5 = this.field1648 + arg2;
        int var6 = class72.field1731 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1646;
        int var9 = this.field1645;
        int var10 = class72.field1731 - var9;
        int var11 = 0;
        if (arg0) {
            this.field1639 = -454;
        }
        if (var5 < class72.field1733) {
            int var12 = class72.field1733 - var5;
            var8 -= var12;
            var5 = class72.field1733;
            var7 += var9 * var12;
            var6 += class72.field1731 * var12;
        }
        if (var5 + var8 > class72.field1734) {
            var8 -= var5 + var8 - class72.field1734;
        }
        if (var4 < class72.field1735) {
            int var13 = class72.field1735 - var4;
            var9 -= var13;
            var4 = class72.field1735;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class72.field1736) {
            int var14 = var4 + var9 - class72.field1736;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method551(class72.field1730, this.field1644, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method551(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IBII)V")
    public void method552(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = this.field1647 + arg2;
        int var6 = this.field1648 + arg3;
        int var7 = class72.field1731 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1646;
        int var10 = this.field1645;
        int var11 = class72.field1731 - var10;
        int var12 = 0;
        if (arg1 == 4) {
            boolean var13 = false;
        } else {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        if (var6 < class72.field1733) {
            int var15 = class72.field1733 - var6;
            var9 -= var15;
            var6 = class72.field1733;
            var8 += var10 * var15;
            var7 += class72.field1731 * var15;
        }
        if (var6 + var9 > class72.field1734) {
            var9 -= var6 + var9 - class72.field1734;
        }
        if (var5 < class72.field1735) {
            int var16 = class72.field1735 - var5;
            var10 -= var16;
            var5 = class72.field1735;
            var8 += var16;
            var7 += var16;
            var12 += var16;
            var11 += var16;
        }
        if (var5 + var10 > class72.field1736) {
            int var17 = var5 + var10 - class72.field1736;
            var10 -= var17;
            var12 += var17;
            var11 += var17;
        }
        if (var10 > 0 && var9 > 0) {
            this.method553(arg0, var11, this.field1644, var8, var10, 0, var7, class72.field1730, -38, var12, var9);
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(II[IIIII[IIII)V")
    private void method553(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg0;
        for (int var13 = -arg10; var13 < 0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = arg2[arg3++];
                if (var15 == 0) {
                    arg6++;
                } else {
                    int var16 = arg7[arg6];
                    arg7[arg6++] = ((var15 & 0xFF00FF) * arg0 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg0 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg6 += arg1;
            arg3 += arg9;
        }
        if (arg8 >= 0) {
            this.field1639 = 129;
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "([IIIIIIIII[II)V")
    public void method554(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg7 < 1 || arg7 > 1) {
            return;
        }
        try {
            int var12 = -arg6 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg10 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg1 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class72.field1731 * arg5 + arg2;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg9[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg0[var21]; var26 < 0; var26++) {
                    class72.field1730[var23++] = this.field1644[(var24 >> 16) + (var25 >> 16) * this.field1645];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class72.field1731;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIIIIDIIZ)V")
    public void method555(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7, boolean arg8) {
        if (arg8) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg2 / 2;
            int var14 = (int) (Math.sin(arg5) * 65536.0D);
            int var15 = (int) (Math.cos(arg5) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg0 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg3 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class72.field1731 * arg6 + arg4;
            for (int var21 = 0; var21 < arg2; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg1; var25 < 0; var25++) {
                    int var26 = this.field1644[(var23 >> 16) + (var24 >> 16) * this.field1645];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class72.field1730[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class72.field1731;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(ILSSCICQYX;ZI)V")
    public void method556(int arg0, class52 arg1, boolean arg2, int arg3) {
        if (arg2) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1647 + arg0;
        int var7 = this.field1648 + arg3;
        int var8 = class72.field1731 * var7 + var6;
        int var9 = 0;
        int var10 = this.field1646;
        int var11 = this.field1645;
        int var12 = class72.field1731 - var11;
        int var13 = 0;
        if (var7 < class72.field1733) {
            int var14 = class72.field1733 - var7;
            var10 -= var14;
            var7 = class72.field1733;
            var9 += var11 * var14;
            var8 += class72.field1731 * var14;
        }
        if (var7 + var10 > class72.field1734) {
            var10 -= var7 + var10 - class72.field1734;
        }
        if (var6 < class72.field1735) {
            int var15 = class72.field1735 - var6;
            var11 -= var15;
            var6 = class72.field1735;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class72.field1736) {
            int var16 = var6 + var11 - class72.field1736;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method557(var9, 0, var11, (byte) 8, this.field1644, arg1.field1391, var12, class72.field1730, var10, var13, var8);
        }
    }

    @OriginalMember(owner = "client!WSNKRVXZ", name = "a", descriptor = "(IIIB[I[BI[IIII)V")
    private void method557(int arg0, int arg1, int arg2, byte arg3, int[] arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg2 >> 2);
        int var13 = -(arg2 & 0x3);
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg4[arg0++];
                if (var19 != 0 && arg5[arg10] == 0) {
                    arg7[arg10++] = var19;
                } else {
                    arg10++;
                }
                int var20 = arg4[arg0++];
                if (var20 != 0 && arg5[arg10] == 0) {
                    arg7[arg10++] = var20;
                } else {
                    arg10++;
                }
                int var21 = arg4[arg0++];
                if (var21 != 0 && arg5[arg10] == 0) {
                    arg7[arg10++] = var21;
                } else {
                    arg10++;
                }
                int var22 = arg4[arg0++];
                if (var22 != 0 && arg5[arg10] == 0) {
                    arg7[arg10++] = var22;
                } else {
                    arg10++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg4[arg0++];
                if (var18 != 0 && arg5[arg10] == 0) {
                    arg7[arg10++] = var18;
                } else {
                    arg10++;
                }
            }
            arg10 += arg6;
            arg0 += arg9;
        }
        if (arg3 != 8) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }
}
