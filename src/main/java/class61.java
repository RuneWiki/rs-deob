import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class61 extends class108 {

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "[I")
    public int[] field1623;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public int field1622;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public int field1626;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V", line = 9)
    public final void method507(int arg0, int arg1) {
        int var3 = this.field1625 + arg0;
        int var4 = this.field1627 + arg1;
        int var5 = class108.field2709 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1624;
        int var8 = this.field1622;
        int var9 = class108.field2709 - var8;
        int var10 = 0;
        if (var4 < class108.field2707) {
            int var11 = class108.field2707 - var4;
            var7 -= var11;
            var4 = class108.field2707;
            var6 += var8 * var11;
            var5 += class108.field2709 * var11;
        }
        if (var4 + var7 > class108.field2705) {
            var7 -= var4 + var7 - class108.field2705;
        }
        if (var3 < class108.field2708) {
            int var12 = class108.field2708 - var3;
            var8 -= var12;
            var3 = class108.field2708;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class108.field2710) {
            int var13 = var3 + var8 - class108.field2710;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method518(class108.field2711, this.field1623, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "()V", line = 65)
    public final void method508() {
        class108.method889(this.field1623, this.field1622, this.field1624);
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(III)V", line = 69)
    public final void method509(int arg0, int arg1, int arg2) {
        int var4 = this.field1625 + arg0;
        int var5 = this.field1627 + arg1;
        int var6 = class108.field2709 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1624;
        int var9 = this.field1622;
        int var10 = class108.field2709 - var9;
        int var11 = 0;
        if (var5 < class108.field2707) {
            int var12 = class108.field2707 - var5;
            var8 -= var12;
            var5 = class108.field2707;
            var7 += var9 * var12;
            var6 += class108.field2709 * var12;
        }
        if (var5 + var8 > class108.field2705) {
            var8 -= var5 + var8 - class108.field2705;
        }
        if (var4 < class108.field2708) {
            int var13 = class108.field2708 - var4;
            var9 -= var13;
            var4 = class108.field2708;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class108.field2710) {
            int var14 = var4 + var9 - class108.field2710;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method517(class108.field2711, this.field1623, 0, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "()V", line = 127)
    public final void method510() {
        if (this.field1628 == this.field1622 && this.field1626 == this.field1624) {
            return;
        }
        int[] var1 = new int[this.field1628 * this.field1626];
        for (int var2 = 0; var2 < this.field1624; var2++) {
            for (int var3 = 0; var3 < this.field1622; var3++) {
                var1[(this.field1627 + var2) * this.field1628 + this.field1625 + var3] = this.field1623[this.field1622 * var2 + var3];
            }
        }
        this.field1623 = var1;
        this.field1622 = this.field1628;
        this.field1624 = this.field1626;
        this.field1625 = 0;
        this.field1627 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V", line = 163)
    public final void method511(int arg0, int arg1) {
        int var3 = this.field1625 + arg0;
        int var4 = this.field1627 + arg1;
        int var5 = class108.field2709 * var4 + var3;
        int var6 = 0;
        int var7 = this.field1624;
        int var8 = this.field1622;
        int var9 = class108.field2709 - var8;
        int var10 = 0;
        if (var4 < class108.field2707) {
            int var11 = class108.field2707 - var4;
            var7 -= var11;
            var4 = class108.field2707;
            var6 += var8 * var11;
            var5 += class108.field2709 * var11;
        }
        if (var4 + var7 > class108.field2705) {
            var7 -= var4 + var7 - class108.field2705;
        }
        if (var3 < class108.field2708) {
            int var12 = class108.field2708 - var3;
            var8 -= var12;
            var3 = class108.field2708;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class108.field2710) {
            int var13 = var3 + var8 - class108.field2710;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method514(class108.field2711, this.field1623, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[IIIIIIII[B)V", line = 221)
    private static final void method512(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                int var16 = arg1[arg3++];
                if (var16 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var16;
                } else {
                    arg4++;
                }
                int var17 = arg1[arg3++];
                if (var17 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var17;
                } else {
                    arg4++;
                }
                int var18 = arg1[arg3++];
                if (var18 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var18;
                } else {
                    arg4++;
                }
                int var19 = arg1[arg3++];
                if (var19 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var19;
                } else {
                    arg4++;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                int var15 = arg1[arg3++];
                if (var15 != 0 && arg9[arg4] == 0) {
                    arg0[arg4++] = var15;
                } else {
                    arg4++;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Luc;II)V", line = 290)
    public final void method513(class119 arg0, int arg1, int arg2) {
        int var4 = this.field1625 + arg1;
        int var5 = this.field1627 + arg2;
        int var6 = class108.field2709 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1624;
        int var9 = this.field1622;
        int var10 = class108.field2709 - var9;
        int var11 = 0;
        if (var5 < class108.field2707) {
            int var12 = class108.field2707 - var5;
            var8 -= var12;
            var5 = class108.field2707;
            var7 += var9 * var12;
            var6 += class108.field2709 * var12;
        }
        if (var5 + var8 > class108.field2705) {
            var8 -= var5 + var8 - class108.field2705;
        }
        if (var4 < class108.field2708) {
            int var13 = class108.field2708 - var4;
            var9 -= var13;
            var4 = class108.field2708;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class108.field2710) {
            int var14 = var4 + var9 - class108.field2710;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method512(class108.field2711, this.field1623, 0, var7, var6, var9, var8, var10, var11, arg0.field2947);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[IIIIIII)V", line = 356)
    private static final void method514(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = -arg5; var8 < 0; var8++) {
            int var9 = arg3 + arg4 - 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
                arg0[arg3++] = arg1[arg2++];
            }
            var9 += 3;
            while (arg3 < var9) {
                arg0[arg3++] = arg1[arg2++];
            }
            arg3 += arg6;
            arg2 += arg7;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII[I[I)V", line = 383)
    public final void method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
        try {
            int var11 = -arg2 / 2;
            int var12 = -arg3 / 2;
            int var13 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
            int var14 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
            int var15 = arg7 * var13 >> 8;
            int var16 = arg7 * var14 >> 8;
            int var17 = (arg4 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class108.field2709 * arg1 + arg0;
            for (int var20 = 0; var20 < arg3; var20++) {
                int var21 = arg8[var20];
                int var22 = var19 + var21;
                int var23 = var16 * var21 + var17;
                int var24 = var18 - var15 * var21;
                for (int var25 = -arg9[var20]; var25 < 0; var25++) {
                    class108.field2711[var22++] = this.field1623[(var23 >> 16) + (var24 >> 16) * this.field1622];
                    var23 += var16;
                    var24 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class108.field2709;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIDI)V", line = 436)
    public final void method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
        try {
            int var10 = -arg2 / 2;
            int var11 = -arg3 / 2;
            int var12 = (int) (Math.sin(arg6) * 65536.0D);
            int var13 = (int) (Math.cos(arg6) * 65536.0D);
            int var14 = arg7 * var12 >> 8;
            int var15 = arg7 * var13 >> 8;
            int var16 = (arg4 << 16) + var10 * var15 + var11 * var14;
            int var17 = (arg5 << 16) + (var11 * var15 - var10 * var14);
            int var18 = class108.field2709 * arg1 + arg0;
            for (int var19 = 0; var19 < arg3; var19++) {
                int var20 = var18;
                int var21 = var16;
                int var22 = var17;
                for (int var23 = -arg2; var23 < 0; var23++) {
                    int var24 = this.field1623[(var21 >> 16) + (var22 >> 16) * this.field1622];
                    if (var24 == 0) {
                        var20++;
                    } else {
                        class108.field2711[var20++] = var24;
                    }
                    var21 += var15;
                    var22 -= var14;
                }
                var16 += var14;
                var17 += var15;
                var18 += class108.field2709;
            }
        } catch (Exception var25) {
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[IIIIIIIII)V", line = 492)
    private static final void method517(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                int var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = ((var13 & 0xFF00FF) * arg9 + (var14 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 + (var14 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([I[IIIIIIII)V", line = 528)
    private static final void method518(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                int var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var15;
                }
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
            }
            for (int var13 = var10; var13 < 0; var13++) {
                int var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(III)V", line = 595)
    public final void method519(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1623.length; var4++) {
            int var5 = this.field1623[var4];
            if (var5 != 0) {
                int var6 = var5 >> 16 & 0xFF;
                int var7 = arg0 + var6;
                if (var7 < 1) {
                    var7 = 1;
                } else if (var7 > 255) {
                    var7 = 255;
                }
                int var8 = var5 >> 8 & 0xFF;
                int var9 = arg1 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var5 & 0xFF;
                int var11 = arg2 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                this.field1623[var4] = (var7 << 16) + (var9 << 8) + var11;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 644)
    public class61() {
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(II)V", line = 646)
    public class61(int arg0, int arg1) {
        this.field1623 = new int[arg0 * arg1];
        this.field1622 = this.field1628 = arg0;
        this.field1624 = this.field1626 = arg1;
        this.field1625 = this.field1627 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([BLjava/awt/Component;)V", line = 652)
    public class61(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1622 = var3.getWidth(arg1);
            this.field1624 = var3.getHeight(arg1);
            this.field1628 = this.field1622;
            this.field1626 = this.field1624;
            this.field1625 = 0;
            this.field1627 = 0;
            this.field1623 = new int[this.field1624 * this.field1622];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1622, this.field1624, this.field1623, 0, this.field1622);
            var5.grabPixels();
        } catch (InterruptedException var6) {
        }
    }
}
