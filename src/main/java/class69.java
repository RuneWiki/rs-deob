import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YGMSKJOQ")
public class class69 extends class22 {

    @OriginalMember(owner = "YGMSKJOQ", name = "z", descriptor = "Z")
    private boolean field1656 = true;

    @OriginalMember(owner = "YGMSKJOQ", name = "A", descriptor = "Z")
    private boolean field1657 = false;

    @OriginalMember(owner = "YGMSKJOQ", name = "B", descriptor = "B")
    private byte field1658 = -83;

    @OriginalMember(owner = "YGMSKJOQ", name = "C", descriptor = "I")
    private int field1659 = 303;

    @OriginalMember(owner = "YGMSKJOQ", name = "D", descriptor = "I")
    private int field1660 = -87;

    @OriginalMember(owner = "YGMSKJOQ", name = "E", descriptor = "Z")
    private boolean field1661 = false;

    @OriginalMember(owner = "YGMSKJOQ", name = "F", descriptor = "[I")
    public int[] field1662;

    @OriginalMember(owner = "YGMSKJOQ", name = "K", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "YGMSKJOQ", name = "G", descriptor = "I")
    public int field1663;

    @OriginalMember(owner = "YGMSKJOQ", name = "L", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "YGMSKJOQ", name = "H", descriptor = "I")
    public int field1664;

    @OriginalMember(owner = "YGMSKJOQ", name = "J", descriptor = "I")
    public int field1666;

    @OriginalMember(owner = "YGMSKJOQ", name = "I", descriptor = "I")
    public int field1665;

    @OriginalMember(owner = "YGMSKJOQ", name = "<init>", descriptor = "(II)V")
    public class69(int arg0, int arg1) {
        this.field1662 = new int[arg0 * arg1];
        this.field1663 = this.field1667 = arg0;
        this.field1664 = this.field1668 = arg1;
        this.field1665 = this.field1666 = 0;
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class69(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1663 = var3.getWidth(arg1);
            this.field1664 = var3.getHeight(arg1);
            this.field1667 = this.field1663;
            this.field1668 = this.field1664;
            this.field1665 = 0;
            this.field1666 = 0;
            this.field1662 = new int[this.field1664 * this.field1663];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1663, this.field1664, this.field1662, 0, this.field1663);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "<init>", descriptor = "(LQKFGLETG;Ljava/lang/String;I)V")
    public class69(class50 arg0, String arg1, int arg2) {
        class68 var4 = new class68((byte) 9, arg0.method402(arg1 + ".dat", null));
        class68 var5 = new class68((byte) 9, arg0.method402("index.dat", null));
        var5.field1643 = var4.method536();
        this.field1667 = var5.method536();
        this.field1668 = var5.method536();
        int var6 = var5.method534();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method538();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1643 += 2;
            var4.field1643 += var5.method536() * var5.method536();
            var5.field1643++;
        }
        this.field1665 = var5.method534();
        this.field1666 = var5.method534();
        this.field1663 = var5.method536();
        this.field1664 = var5.method536();
        int var10 = var5.method534();
        int var11 = this.field1664 * this.field1663;
        this.field1662 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1662[var12] = var7[var4.method534()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1663; var13++) {
                for (int var14 = 0; var14 < this.field1664; var14++) {
                    this.field1662[this.field1663 * var14 + var13] = var7[var4.method534()];
                }
            }
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "c", descriptor = "(I)V")
    public void method571(int arg0) {
        int var2 = 17 / arg0;
        class22.method279((byte) 86, this.field1663, this.field1662, this.field1664);
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IBII)V")
    public void method572(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -79) {
            this.field1661 = !this.field1661;
        }
        for (int var5 = 0; var5 < this.field1662.length; var5++) {
            int var6 = this.field1662[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1662[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "d", descriptor = "(I)V")
    public void method573(int arg0) {
        int[] var2 = new int[this.field1668 * this.field1667];
        for (int var3 = 0; var3 < this.field1664; var3++) {
            for (int var5 = 0; var5 < this.field1663; var5++) {
                var2[(this.field1666 + var3) * this.field1667 + this.field1665 + var5] = this.field1662[this.field1663 * var3 + var5];
            }
        }
        this.field1662 = var2;
        this.field1663 = this.field1667;
        this.field1664 = this.field1668;
        this.field1665 = 0;
        int var4 = 65 / arg0;
        this.field1666 = 0;
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(BII)V")
    public void method574(byte arg0, int arg1, int arg2) {
        int var4 = this.field1665 + arg1;
        if (arg0 != 82) {
            this.field1661 = !this.field1661;
        }
        int var5 = this.field1666 + arg2;
        int var6 = class22.field841 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1664;
        int var9 = this.field1663;
        int var10 = class22.field841 - var9;
        int var11 = 0;
        if (var5 < class22.field843) {
            int var12 = class22.field843 - var5;
            var8 -= var12;
            var5 = class22.field843;
            var7 += var9 * var12;
            var6 += class22.field841 * var12;
        }
        if (var5 + var8 > class22.field844) {
            var8 -= var5 + var8 - class22.field844;
        }
        if (var4 < class22.field845) {
            int var13 = class22.field845 - var4;
            var9 -= var13;
            var4 = class22.field845;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class22.field846) {
            int var14 = var4 + var9 - class22.field846;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method575(var10, var8, (byte) 10, class22.field840, this.field1662, var6, var7, var9, var11);
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IIB[I[IIIII)V")
    private void method575(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg3[arg5++] = arg4[arg6++];
                arg3[arg5++] = arg4[arg6++];
                arg3[arg5++] = arg4[arg6++];
                arg3[arg5++] = arg4[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg3[arg5++] = arg4[arg6++];
            }
            arg5 += arg0;
            arg6 += arg8;
        }
        if (arg2 == 10) {
            ;
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IIB)V")
    public void method576(int arg0, int arg1, byte arg2) {
        int var4 = this.field1665 + arg1;
        int var5 = this.field1666 + arg0;
        int var6 = class22.field841 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1664;
        int var9 = this.field1663;
        int var10 = class22.field841 - var9;
        int var11 = 0;
        if (arg2 != 35) {
            this.field1659 = 443;
        }
        if (var5 < class22.field843) {
            int var12 = class22.field843 - var5;
            var8 -= var12;
            var5 = class22.field843;
            var7 += var9 * var12;
            var6 += class22.field841 * var12;
        }
        if (var5 + var8 > class22.field844) {
            var8 -= var5 + var8 - class22.field844;
        }
        if (var4 < class22.field845) {
            int var13 = class22.field845 - var4;
            var9 -= var13;
            var4 = class22.field845;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class22.field846) {
            int var14 = var4 + var9 - class22.field846;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method577(class22.field840, this.field1662, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method577(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(ZIII)V")
    public void method578(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1665 + arg2;
        int var6 = this.field1666 + arg1;
        int var7 = class22.field841 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1664;
        int var10 = this.field1663;
        int var11 = class22.field841 - var10;
        int var12 = 0;
        if (arg0) {
            return;
        }
        if (var6 < class22.field843) {
            int var13 = class22.field843 - var6;
            var9 -= var13;
            var6 = class22.field843;
            var8 += var10 * var13;
            var7 += class22.field841 * var13;
        }
        if (var6 + var9 > class22.field844) {
            var9 -= var6 + var9 - class22.field844;
        }
        if (var5 < class22.field845) {
            int var14 = class22.field845 - var5;
            var10 -= var14;
            var5 = class22.field845;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class22.field846) {
            int var15 = var5 + var10 - class22.field846;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method579(24778, 0, var8, var11, this.field1662, var9, var10, class22.field840, var12, var7, arg3);
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IIII[III[IIII)V")
    private void method579(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg10;
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = -arg6; var14 < 0; var14++) {
                int var15 = arg4[arg2++];
                if (var15 == 0) {
                    arg9++;
                } else {
                    int var16 = arg7[arg9];
                    arg7[arg9++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg9 += arg3;
            arg2 += arg8;
        }
        if (arg0 != 24778) {
            this.field1660 = 50;
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(I[IIIIII[IIII)V")
    public void method580(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        if (arg3 != 34359) {
            this.field1657 = !this.field1657;
        }
        try {
            int var12 = -arg10 / 2;
            int var13 = -arg9 / 2;
            int var14 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg6 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg0 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class22.field841 * arg4 + arg5;
            for (int var21 = 0; var21 < arg9; var21++) {
                int var22 = arg1[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg7[var21]; var26 < 0; var26++) {
                    class22.field840[var23++] = this.field1662[(var24 >> 16) + (var25 >> 16) * this.field1663];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class22.field841;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IDIIIBIII)V")
    public void method581(int arg0, double arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 != 7) {
            this.field1656 = !this.field1656;
        }
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin(arg1) * 65536.0D);
            int var14 = (int) (Math.cos(arg1) * 65536.0D);
            int var15 = arg8 * var13 >> 8;
            int var16 = arg8 * var14 >> 8;
            int var17 = (arg0 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg7 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class22.field841 * arg6 + arg4;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg2; var24 < 0; var24++) {
                    int var25 = this.field1662[(var22 >> 16) + (var23 >> 16) * this.field1663];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class22.field840[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class22.field841;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(LDEITBGVL;III)V")
    public void method582(class9 arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1665 + arg2;
        if (arg3 != -31972) {
            return;
        }
        int var6 = this.field1666 + arg1;
        int var7 = class22.field841 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1664;
        int var10 = this.field1663;
        int var11 = class22.field841 - var10;
        int var12 = 0;
        if (var6 < class22.field843) {
            int var13 = class22.field843 - var6;
            var9 -= var13;
            var6 = class22.field843;
            var8 += var10 * var13;
            var7 += class22.field841 * var13;
        }
        if (var6 + var9 > class22.field844) {
            var9 -= var6 + var9 - class22.field844;
        }
        if (var5 < class22.field845) {
            int var14 = class22.field845 - var5;
            var10 -= var14;
            var5 = class22.field845;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class22.field846) {
            int var15 = var5 + var10 - class22.field846;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method583(var11, (byte) -119, var7, this.field1662, var8, var12, arg0.field607, var9, 0, var10, class22.field840);
        }
    }

    @OriginalMember(owner = "YGMSKJOQ", name = "a", descriptor = "(IBI[III[BIII[I)V")
    private void method583(int arg0, byte arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = -(arg9 >> 2);
        int var13 = -(arg9 & 0x3);
        if (arg1 != -119) {
            return;
        }
        for (int var14 = -arg7; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg3[arg4++];
                if (var18 != 0 && arg6[arg2] == 0) {
                    arg10[arg2++] = var18;
                } else {
                    arg2++;
                }
                int var19 = arg3[arg4++];
                if (var19 != 0 && arg6[arg2] == 0) {
                    arg10[arg2++] = var19;
                } else {
                    arg2++;
                }
                int var20 = arg3[arg4++];
                if (var20 != 0 && arg6[arg2] == 0) {
                    arg10[arg2++] = var20;
                } else {
                    arg2++;
                }
                int var21 = arg3[arg4++];
                if (var21 != 0 && arg6[arg2] == 0) {
                    arg10[arg2++] = var21;
                } else {
                    arg2++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg3[arg4++];
                if (var17 != 0 && arg6[arg2] == 0) {
                    arg10[arg2++] = var17;
                } else {
                    arg2++;
                }
            }
            arg2 += arg0;
            arg4 += arg5;
        }
    }
}
