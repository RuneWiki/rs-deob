import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WQACZBNG")
public class class58 extends class36 {

    @OriginalMember(owner = "client!WQACZBNG", name = "z", descriptor = "Z")
    private boolean field1576 = false;

    @OriginalMember(owner = "client!WQACZBNG", name = "A", descriptor = "Z")
    private boolean field1577 = false;

    @OriginalMember(owner = "client!WQACZBNG", name = "B", descriptor = "I")
    private int field1578 = -32312;

    @OriginalMember(owner = "client!WQACZBNG", name = "C", descriptor = "B")
    private byte field1579 = -8;

    @OriginalMember(owner = "client!WQACZBNG", name = "D", descriptor = "I")
    private int field1580 = -234;

    @OriginalMember(owner = "client!WQACZBNG", name = "E", descriptor = "I")
    private int field1581 = -877;

    @OriginalMember(owner = "client!WQACZBNG", name = "F", descriptor = "I")
    private int field1582 = 2;

    @OriginalMember(owner = "client!WQACZBNG", name = "G", descriptor = "[I")
    public int[] field1583;

    @OriginalMember(owner = "client!WQACZBNG", name = "L", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!WQACZBNG", name = "H", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!WQACZBNG", name = "M", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!WQACZBNG", name = "I", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "client!WQACZBNG", name = "K", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!WQACZBNG", name = "J", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "(II)V")
    public class58(int arg0, int arg1) {
        this.field1583 = new int[arg0 * arg1];
        this.field1584 = this.field1588 = arg0;
        this.field1585 = this.field1589 = arg1;
        this.field1586 = this.field1587 = 0;
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class58(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1584 = var3.getWidth(arg1);
            this.field1585 = var3.getHeight(arg1);
            this.field1588 = this.field1584;
            this.field1589 = this.field1585;
            this.field1586 = 0;
            this.field1587 = 0;
            this.field1583 = new int[this.field1585 * this.field1584];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1584, this.field1585, this.field1583, 0, this.field1584);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "<init>", descriptor = "(LXOJZVVDK;Ljava/lang/String;I)V")
    public class58(class60 arg0, String arg1, int arg2) {
        class41 var4 = new class41(888, arg0.method560(arg1 + ".dat", null));
        class41 var5 = new class41(888, arg0.method560("index.dat", null));
        var5.field1241 = var4.method342();
        this.field1588 = var5.method342();
        this.field1589 = var5.method342();
        int var6 = var5.method340();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method344();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1241 += 2;
            var4.field1241 += var5.method342() * var5.method342();
            var5.field1241++;
        }
        this.field1586 = var5.method340();
        this.field1587 = var5.method340();
        this.field1584 = var5.method342();
        this.field1585 = var5.method342();
        int var10 = var5.method340();
        int var11 = this.field1585 * this.field1584;
        this.field1583 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1583[var12] = var7[var4.method340()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1584; var13++) {
                for (int var14 = 0; var14 < this.field1585; var14++) {
                    this.field1583[this.field1584 * var14 + var13] = var7[var4.method340()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "b", descriptor = "(I)V")
    public void method543(int arg0) {
        class36.method286(this.field1585, this.field1584, this.field1583, false);
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(ZIII)V")
    public void method544(boolean arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1583.length; var5++) {
            int var6 = this.field1583[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
                if (var8 < 1) {
                    var8 = 1;
                } else if (var8 > 255) {
                    var8 = 255;
                }
                int var9 = var6 >> 8 & 0xFF;
                int var10 = arg1 + var9;
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
                this.field1583[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
        if (!arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "b", descriptor = "(Z)V")
    public void method545(boolean arg0) {
        int[] var2 = new int[this.field1589 * this.field1588];
        for (int var3 = 0; var3 < this.field1585; var3++) {
            for (int var4 = 0; var4 < this.field1584; var4++) {
                var2[(this.field1587 + var3) * this.field1588 + this.field1586 + var4] = this.field1583[this.field1584 * var3 + var4];
            }
        }
        if (arg0) {
            this.field1577 = !this.field1577;
        }
        this.field1583 = var2;
        this.field1584 = this.field1588;
        this.field1585 = this.field1589;
        this.field1586 = 0;
        this.field1587 = 0;
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(BII)V")
    public void method546(byte arg0, int arg1, int arg2) {
        int var4 = this.field1586 + arg1;
        int var5 = this.field1587 + arg2;
        int var6 = class36.field1150 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1585;
        int var9 = this.field1584;
        int var10 = class36.field1150 - var9;
        int var11 = 0;
        if (var5 < class36.field1152) {
            int var12 = class36.field1152 - var5;
            var8 -= var12;
            var5 = class36.field1152;
            var7 += var9 * var12;
            var6 += class36.field1150 * var12;
        }
        if (var5 + var8 > class36.field1153) {
            var8 -= var5 + var8 - class36.field1153;
        }
        if (var4 < class36.field1154) {
            int var13 = class36.field1154 - var4;
            var9 -= var13;
            var4 = class36.field1154;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1155) {
            int var14 = var4 + var9 - class36.field1155;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method547(var8, var6, var7, this.field1583, var10, var9, this.field1579, var11, class36.field1149);
            if (arg0 != -49) {
                this.field1577 = !this.field1577;
            }
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(III[IIIBI[I)V")
    private void method547(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte arg6, int arg7, int[] arg8) {
        if (arg6 != -8) {
            this.field1582 = -127;
        }
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg8[arg1++] = arg3[arg2++];
                arg8[arg1++] = arg3[arg2++];
                arg8[arg1++] = arg3[arg2++];
                arg8[arg1++] = arg3[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg8[arg1++] = arg3[arg2++];
            }
            arg1 += arg4;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(III)V")
    public void method548(int arg0, int arg1, int arg2) {
        int var4 = this.field1586 + arg1;
        int var5 = this.field1587 + arg0;
        int var6 = class36.field1150 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1585;
        int var9 = this.field1584;
        int var10 = class36.field1150 - var9;
        int var11 = 0;
        if (var5 < class36.field1152) {
            int var12 = class36.field1152 - var5;
            var8 -= var12;
            var5 = class36.field1152;
            var7 += var9 * var12;
            var6 += class36.field1150 * var12;
        }
        if (var5 + var8 > class36.field1153) {
            var8 -= var5 + var8 - class36.field1153;
        }
        if (var4 < class36.field1154) {
            int var13 = class36.field1154 - var4;
            var9 -= var13;
            var4 = class36.field1154;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class36.field1155) {
            int var14 = var4 + var9 - class36.field1155;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 <= 0 || var8 <= 0) {
            return;
        }
        this.method549(class36.field1149, this.field1583, 0, var7, var6, var9, var8, var10, var11);
        if (arg2 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method549(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IIIZ)V")
    public void method550(int arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field1586 + arg0;
        int var6 = this.field1587 + arg2;
        int var7 = class36.field1150 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1585;
        int var10 = this.field1584;
        int var11 = class36.field1150 - var10;
        int var12 = 0;
        if (var6 < class36.field1152) {
            int var13 = class36.field1152 - var6;
            var9 -= var13;
            var6 = class36.field1152;
            var8 += var10 * var13;
            var7 += class36.field1150 * var13;
        }
        if (var6 + var9 > class36.field1153) {
            var9 -= var6 + var9 - class36.field1153;
        }
        if (var5 < class36.field1154) {
            int var14 = class36.field1154 - var5;
            var10 -= var14;
            var5 = class36.field1154;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class36.field1155) {
            int var15 = var5 + var10 - class36.field1155;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method551(0, var9, class36.field1149, var7, var11, 0, var12, var8, var10, this.field1583, arg1);
            if (arg3) {
                this.field1578 = 162;
            }
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(II[IIIIIII[II)V")
    private void method551(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10) {
        if (arg5 != 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = 256 - arg10;
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg8; var15 < 0; var15++) {
                int var16 = arg9[arg7++];
                if (var16 == 0) {
                    arg3++;
                } else {
                    int var17 = arg2[arg3];
                    arg2[arg3++] = ((var16 & 0xFF00FF) * arg10 + (var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * arg10 + (var17 & 0xFF00) * var13 & 0xFF0000) >> 8;
                }
            }
            arg3 += arg4;
            arg7 += arg6;
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(II[IIIII[IIII)V")
    public void method552(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg6 < 1 || arg6 > 1) {
            return;
        }
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg3 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg3 / 326.11D) * 65536.0D);
            int var16 = arg1 * var14 >> 8;
            int var17 = arg1 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg10 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class36.field1150 * arg0 + arg9;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg2[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    class36.field1149[var23++] = this.field1583[(var24 >> 16) + (var25 >> 16) * this.field1584];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class36.field1150;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IIIIDIIII)V")
    public void method553(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 != -19836) {
            return;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg8 / 2;
            int var13 = (int) (Math.sin(arg4) * 65536.0D);
            int var14 = (int) (Math.cos(arg4) * 65536.0D);
            int var15 = arg5 * var13 >> 8;
            int var16 = arg5 * var14 >> 8;
            int var17 = (arg7 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg1 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class36.field1150 * arg0 + arg3;
            for (int var20 = 0; var20 < arg8; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field1583[(var22 >> 16) + (var23 >> 16) * this.field1584];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class36.field1149[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class36.field1150;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(IZILVEIVHFHZ;)V")
    public void method554(int arg0, boolean arg1, int arg2, class54 arg3) {
        int var5 = this.field1586 + arg2;
        int var6 = this.field1587 + arg0;
        int var7 = class36.field1150 * var6 + var5;
        int var8 = 0;
        if (arg1) {
            return;
        }
        int var9 = this.field1585;
        int var10 = this.field1584;
        int var11 = class36.field1150 - var10;
        int var12 = 0;
        if (var6 < class36.field1152) {
            int var13 = class36.field1152 - var6;
            var9 -= var13;
            var6 = class36.field1152;
            var8 += var10 * var13;
            var7 += class36.field1150 * var13;
        }
        if (var6 + var9 > class36.field1153) {
            var9 -= var6 + var9 - class36.field1153;
        }
        if (var5 < class36.field1154) {
            int var14 = class36.field1154 - var5;
            var10 -= var14;
            var5 = class36.field1154;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class36.field1155) {
            int var15 = var5 + var10 - class36.field1155;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method555(var12, this.field1583, class36.field1149, arg3.field1550, 0, var8, -416, var7, var10, var11, var9);
        }
    }

    @OriginalMember(owner = "client!WQACZBNG", name = "a", descriptor = "(I[I[I[BIIIIIII)V")
    private void method555(int arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        while (arg6 >= 0) {
            this.field1576 = !this.field1576;
        }
        int var12 = -(arg8 >> 2);
        int var13 = -(arg8 & 0x3);
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg1[arg5++];
                if (var18 != 0 && arg3[arg7] == 0) {
                    arg2[arg7++] = var18;
                } else {
                    arg7++;
                }
                int var19 = arg1[arg5++];
                if (var19 != 0 && arg3[arg7] == 0) {
                    arg2[arg7++] = var19;
                } else {
                    arg7++;
                }
                int var20 = arg1[arg5++];
                if (var20 != 0 && arg3[arg7] == 0) {
                    arg2[arg7++] = var20;
                } else {
                    arg7++;
                }
                int var21 = arg1[arg5++];
                if (var21 != 0 && arg3[arg7] == 0) {
                    arg2[arg7++] = var21;
                } else {
                    arg7++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg1[arg5++];
                if (var17 != 0 && arg3[arg7] == 0) {
                    arg2[arg7++] = var17;
                } else {
                    arg7++;
                }
            }
            arg7 += arg9;
            arg5 += arg0;
        }
    }
}
