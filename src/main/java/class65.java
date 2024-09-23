import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("XKULRNBA")
public class class65 extends class53 {

    @OriginalMember(owner = "XKULRNBA", name = "B", descriptor = "Z")
    private boolean field1573 = true;

    @OriginalMember(owner = "XKULRNBA", name = "C", descriptor = "Z")
    private boolean field1574 = true;

    @OriginalMember(owner = "XKULRNBA", name = "D", descriptor = "I")
    private int field1575 = -329;

    @OriginalMember(owner = "XKULRNBA", name = "E", descriptor = "I")
    private int field1576 = -31504;

    @OriginalMember(owner = "XKULRNBA", name = "F", descriptor = "I")
    private int field1577 = 125;

    @OriginalMember(owner = "XKULRNBA", name = "G", descriptor = "B")
    private byte field1578 = 6;

    @OriginalMember(owner = "XKULRNBA", name = "H", descriptor = "I")
    private int field1579 = 644;

    @OriginalMember(owner = "XKULRNBA", name = "I", descriptor = "Z")
    private boolean field1580 = false;

    @OriginalMember(owner = "XKULRNBA", name = "J", descriptor = "[I")
    public int[] field1581;

    @OriginalMember(owner = "XKULRNBA", name = "O", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "XKULRNBA", name = "K", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "XKULRNBA", name = "P", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "XKULRNBA", name = "L", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "XKULRNBA", name = "N", descriptor = "I")
    public int field1585;

    @OriginalMember(owner = "XKULRNBA", name = "M", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "XKULRNBA", name = "A", descriptor = "I")
    private static int field1572 = 302;

    @OriginalMember(owner = "XKULRNBA", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        this.field1581 = new int[arg0 * arg1];
        this.field1582 = this.field1586 = arg0;
        this.field1583 = this.field1587 = arg1;
        this.field1584 = this.field1585 = 0;
    }

    @OriginalMember(owner = "XKULRNBA", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class65(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1582 = var3.getWidth(arg1);
            this.field1583 = var3.getHeight(arg1);
            this.field1586 = this.field1582;
            this.field1587 = this.field1583;
            this.field1584 = 0;
            this.field1585 = 0;
            this.field1581 = new int[this.field1583 * this.field1582];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1582, this.field1583, this.field1581, 0, this.field1582);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "<init>", descriptor = "(LDYBMLHQM;Ljava/lang/String;I)V")
    public class65(class16 arg0, String arg1, int arg2) {
        class29 var4 = new class29((byte) -28, arg0.method248(arg1 + ".dat", null));
        class29 var5 = new class29((byte) -28, arg0.method248("index.dat", null));
        var5.field1107 = var4.method310();
        this.field1586 = var5.method310();
        this.field1587 = var5.method310();
        int var6 = var5.method308();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method312();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1107 += 2;
            var4.field1107 += var5.method310() * var5.method310();
            var5.field1107++;
        }
        this.field1584 = var5.method308();
        this.field1585 = var5.method308();
        this.field1582 = var5.method310();
        this.field1583 = var5.method310();
        int var10 = var5.method308();
        int var11 = this.field1583 * this.field1582;
        this.field1581 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1581[var12] = var7[var4.method308()];
            }
        } else {
            if (var10 == 1) {
                for (int var13 = 0; var13 < this.field1582; var13++) {
                    for (int var14 = 0; var14 < this.field1583; var14++) {
                        this.field1581[this.field1582 * var14 + var13] = var7[var4.method308()];
                    }
                }
            }
            if (class13.field723) {
            }
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(I)V")
    public void method509(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        class53.method453(-855, this.field1582, this.field1581, this.field1583);
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IIII)V")
    public void method510(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field1580 = !this.field1580;
        }
        for (int var5 = 0; var5 < this.field1581.length; var5++) {
            int var6 = this.field1581[var5];
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
                int var12 = arg1 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1581[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "b", descriptor = "(I)V")
    public void method511(int arg0) {
        if (this.field1576 != arg0) {
            this.field1575 = -304;
        }
        int[] var2 = new int[this.field1587 * this.field1586];
        for (int var3 = 0; var3 < this.field1583; var3++) {
            for (int var4 = 0; var4 < this.field1582; var4++) {
                var2[(this.field1585 + var3) * this.field1586 + this.field1584 + var4] = this.field1581[this.field1582 * var3 + var4];
            }
        }
        this.field1581 = var2;
        this.field1582 = this.field1586;
        this.field1583 = this.field1587;
        this.field1584 = 0;
        this.field1585 = 0;
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(III)V")
    public void method512(int arg0, int arg1, int arg2) {
        int var4 = this.field1584 + arg2;
        int var5 = this.field1585 + arg0;
        int var6 = class53.field1382 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1583;
        int var9 = this.field1582;
        int var10 = class53.field1382 - var9;
        int var11 = 0;
        if (arg1 >= 0) {
            return;
        }
        if (var5 < class53.field1384) {
            int var12 = class53.field1384 - var5;
            var8 -= var12;
            var5 = class53.field1384;
            var7 += var9 * var12;
            var6 += class53.field1382 * var12;
        }
        if (var5 + var8 > class53.field1385) {
            var8 -= var5 + var8 - class53.field1385;
        }
        if (var4 < class53.field1386) {
            int var13 = class53.field1386 - var4;
            var9 -= var13;
            var4 = class53.field1386;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class53.field1387) {
            int var14 = var4 + var9 - class53.field1387;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method513(var6, var7, this.field1581, var11, class53.field1381, var9, 979, var8, var10);
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(II[II[IIIII)V")
    private void method513(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        if (arg6 <= 0) {
            this.field1575 = 387;
        }
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg4[arg0++] = arg2[arg1++];
                arg4[arg0++] = arg2[arg1++];
                arg4[arg0++] = arg2[arg1++];
                arg4[arg0++] = arg2[arg1++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg4[arg0++] = arg2[arg1++];
            }
            arg0 += arg8;
            arg1 += arg3;
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IZI)V")
    public void method514(int arg0, boolean arg1, int arg2) {
        int var4 = this.field1584 + arg2;
        if (!arg1) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field1585 + arg0;
        int var7 = class53.field1382 * var6 + var4;
        int var8 = 0;
        int var9 = this.field1583;
        int var10 = this.field1582;
        int var11 = class53.field1382 - var10;
        int var12 = 0;
        if (var6 < class53.field1384) {
            int var13 = class53.field1384 - var6;
            var9 -= var13;
            var6 = class53.field1384;
            var8 += var10 * var13;
            var7 += class53.field1382 * var13;
        }
        if (var6 + var9 > class53.field1385) {
            var9 -= var6 + var9 - class53.field1385;
        }
        if (var4 < class53.field1386) {
            int var14 = class53.field1386 - var4;
            var10 -= var14;
            var4 = class53.field1386;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class53.field1387) {
            int var15 = var4 + var10 - class53.field1387;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method515(class53.field1381, this.field1581, 0, var8, var7, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method515(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(BIII)V")
    public void method516(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1584 + arg2;
        int var6 = this.field1585 + arg1;
        int var7 = class53.field1382 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1583;
        int var10 = this.field1582;
        int var11 = class53.field1382 - var10;
        int var12 = 0;
        if (arg0 != -14) {
            return;
        }
        if (var6 < class53.field1384) {
            int var13 = class53.field1384 - var6;
            var9 -= var13;
            var6 = class53.field1384;
            var8 += var10 * var13;
            var7 += class53.field1382 * var13;
        }
        if (var6 + var9 > class53.field1385) {
            var9 -= var6 + var9 - class53.field1385;
        }
        if (var5 < class53.field1386) {
            int var14 = class53.field1386 - var5;
            var10 -= var14;
            var5 = class53.field1386;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class53.field1387) {
            int var15 = var5 + var10 - class53.field1387;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method517(var9, -875, var8, var11, var10, class53.field1381, 0, var12, this.field1581, arg3, var7);
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IIIII[III[III)V")
    private void method517(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg9;
        while (arg1 >= 0) {
            for (int var17 = 1; var17 > 0; var17++) {
            }
        }
        for (int var13 = -arg0; var13 < 0; var13++) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                int var15 = arg8[arg2++];
                if (var15 == 0) {
                    arg10++;
                } else {
                    int var16 = arg5[arg10];
                    arg5[arg10++] = ((var15 & 0xFF00FF) * arg9 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg9 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg3;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IIIIII[IIZI[I)V")
    public void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, boolean arg8, int arg9, int[] arg10) {
        if (arg8) {
            return;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg3 / 2;
            int var14 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var16 = arg7 * var14 >> 8;
            int var17 = arg7 * var15 >> 8;
            int var18 = (arg9 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg5 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class53.field1382 * arg2 + arg4;
            for (int var21 = 0; var21 < arg3; var21++) {
                int var22 = arg10[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg6[var21]; var26 < 0; var26++) {
                    class53.field1381[var23++] = this.field1581[(var24 >> 16) + (var25 >> 16) * this.field1582];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class53.field1382;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IIIDIIBII)V")
    public void method519(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (this.field1578 == arg6) {
            boolean var11 = false;
        } else {
            this.field1577 = -104;
        }
        try {
            int var12 = -arg1 / 2;
            int var13 = -arg0 / 2;
            int var14 = (int) (Math.sin(arg3) * 65536.0D);
            int var15 = (int) (Math.cos(arg3) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg5 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg2 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class53.field1382 * arg8 + arg7;
            for (int var21 = 0; var21 < arg0; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg1; var25 < 0; var25++) {
                    int var26 = this.field1581[(var23 >> 16) + (var24 >> 16) * this.field1582];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class53.field1381[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class53.field1382;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IILBKYZHYRW;I)V")
    public void method520(int arg0, int arg1, class4 arg2, int arg3) {
        int var5 = this.field1584 + arg0;
        int var6 = this.field1585 + arg3;
        int var7 = class53.field1382 * var6 + var5;
        int var8 = 0;
        int var9 = 61 / arg1;
        int var10 = this.field1583;
        int var11 = this.field1582;
        int var12 = class53.field1382 - var11;
        int var13 = 0;
        if (var6 < class53.field1384) {
            int var14 = class53.field1384 - var6;
            var10 -= var14;
            var6 = class53.field1384;
            var8 += var11 * var14;
            var7 += class53.field1382 * var14;
        }
        if (var6 + var10 > class53.field1385) {
            var10 -= var6 + var10 - class53.field1385;
        }
        if (var5 < class53.field1386) {
            int var15 = class53.field1386 - var5;
            var11 -= var15;
            var5 = class53.field1386;
            var8 += var15;
            var7 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class53.field1387) {
            int var16 = var5 + var11 - class53.field1387;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method521(var8, var13, 0, (byte) 127, arg2.field32, var10, class53.field1381, this.field1581, var12, var7, var11);
        }
    }

    @OriginalMember(owner = "XKULRNBA", name = "a", descriptor = "(IIIB[BI[I[IIII)V")
    private void method521(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg10 >> 2);
        int var13 = -(arg10 & 0x3);
        if (arg3 != 127) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg5; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg7[arg0++];
                if (var19 != 0 && arg4[arg9] == 0) {
                    arg6[arg9++] = var19;
                } else {
                    arg9++;
                }
                int var20 = arg7[arg0++];
                if (var20 != 0 && arg4[arg9] == 0) {
                    arg6[arg9++] = var20;
                } else {
                    arg9++;
                }
                int var21 = arg7[arg0++];
                if (var21 != 0 && arg4[arg9] == 0) {
                    arg6[arg9++] = var21;
                } else {
                    arg9++;
                }
                int var22 = arg7[arg0++];
                if (var22 != 0 && arg4[arg9] == 0) {
                    arg6[arg9++] = var22;
                } else {
                    arg9++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg7[arg0++];
                if (var18 != 0 && arg4[arg9] == 0) {
                    arg6[arg9++] = var18;
                } else {
                    arg9++;
                }
            }
            arg9 += arg8;
            arg0 += arg1;
        }
    }
}
