import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LOVQYTIZ")
public class class38 extends class26 {

    @OriginalMember(owner = "client!LOVQYTIZ", name = "z", descriptor = "Z")
    private boolean field1197 = true;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "A", descriptor = "B")
    private byte field1198 = 73;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "B", descriptor = "I")
    private int field1199 = -20671;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "C", descriptor = "I")
    private int field1200 = -660;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "D", descriptor = "I")
    private int field1201 = 40104;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "E", descriptor = "Z")
    private boolean field1202 = true;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "F", descriptor = "Z")
    private boolean field1203 = false;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "G", descriptor = "[I")
    public int[] field1204;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "L", descriptor = "I")
    public int field1209;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "H", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "M", descriptor = "I")
    public int field1210;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "I", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "K", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "J", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "(II)V")
    public class38(int arg0, int arg1) {
        this.field1204 = new int[arg0 * arg1];
        this.field1205 = this.field1209 = arg0;
        this.field1206 = this.field1210 = arg1;
        this.field1207 = this.field1208 = 0;
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class38(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1205 = var3.getWidth(arg1);
            this.field1206 = var3.getHeight(arg1);
            this.field1209 = this.field1205;
            this.field1210 = this.field1206;
            this.field1207 = 0;
            this.field1208 = 0;
            this.field1204 = new int[this.field1206 * this.field1205];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1205, this.field1206, this.field1204, 0, this.field1205);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "<init>", descriptor = "(LJUPFHAZZ;Ljava/lang/String;I)V")
    public class38(class32 arg0, String arg1, int arg2) {
        class59 var4 = new class59(859, arg0.method372(arg1 + ".dat", null));
        class59 var5 = new class59(859, arg0.method372("index.dat", null));
        var5.field1589 = var4.method531();
        this.field1209 = var5.method531();
        this.field1210 = var5.method531();
        int var6 = var5.method529();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method533();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1589 += 2;
            var4.field1589 += var5.method531() * var5.method531();
            var5.field1589++;
        }
        this.field1207 = var5.method529();
        this.field1208 = var5.method529();
        this.field1205 = var5.method531();
        this.field1206 = var5.method531();
        int var10 = var5.method529();
        int var11 = this.field1206 * this.field1205;
        this.field1204 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1204[var12] = var7[var4.method529()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1205; var13++) {
                for (int var14 = 0; var14 < this.field1206; var14++) {
                    this.field1204[this.field1205 * var14 + var13] = var7[var4.method529()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(B)V")
    public void method395(byte arg0) {
        class26.method251(this.field1204, this.field1205, this.field1206, -262);
        if (this.field1198 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIII)V")
    public void method396(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < this.field1204.length; var6++) {
            int var7 = this.field1204[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg2 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg1 + var10;
                if (var11 < 1) {
                    var11 = 1;
                } else if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var7 & 0xFF;
                int var13 = arg0 + var12;
                if (var13 < 1) {
                    var13 = 1;
                } else if (var13 > 255) {
                    var13 = 255;
                }
                this.field1204[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "c", descriptor = "(I)V")
    public void method397(int arg0) {
        int[] var2 = new int[this.field1210 * this.field1209];
        for (int var3 = 0; var3 < this.field1206; var3++) {
            for (int var4 = 0; var4 < this.field1205; var4++) {
                var2[(this.field1208 + var3) * this.field1209 + this.field1207 + var4] = this.field1204[this.field1205 * var3 + var4];
            }
        }
        this.field1204 = var2;
        this.field1205 = this.field1209;
        if (arg0 == 0) {
            this.field1206 = this.field1210;
            this.field1207 = 0;
            this.field1208 = 0;
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(III)V")
    public void method398(int arg0, int arg1, int arg2) {
        int var4 = this.field1207 + arg0;
        int var5 = 10 / arg1;
        int var6 = this.field1208 + arg2;
        int var7 = class26.field918 * var6 + var4;
        int var8 = 0;
        int var9 = this.field1206;
        int var10 = this.field1205;
        int var11 = class26.field918 - var10;
        int var12 = 0;
        if (var6 < class26.field920) {
            int var13 = class26.field920 - var6;
            var9 -= var13;
            var6 = class26.field920;
            var8 += var10 * var13;
            var7 += class26.field918 * var13;
        }
        if (var6 + var9 > class26.field921) {
            var9 -= var6 + var9 - class26.field921;
        }
        if (var4 < class26.field922) {
            int var14 = class26.field922 - var4;
            var10 -= var14;
            var4 = class26.field922;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class26.field923) {
            int var15 = var4 + var10 - class26.field923;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method399(4, var12, var9, var10, var8, this.field1204, class26.field917, var11, var7);
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIIII[I[III)V")
    private void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
        int var10 = -(arg3 >> 2);
        int var11 = -(arg3 & 0x3);
        if (arg0 != 4) {
            this.field1203 = !this.field1203;
        }
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg8++] = arg5[arg4++];
                arg6[arg8++] = arg5[arg4++];
                arg6[arg8++] = arg5[arg4++];
                arg6[arg8++] = arg5[arg4++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg8++] = arg5[arg4++];
            }
            arg8 += arg7;
            arg4 += arg1;
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "b", descriptor = "(III)V")
    public void method400(int arg0, int arg1, int arg2) {
        int var4 = this.field1207 + arg2;
        if (this.field1199 != arg1) {
            return;
        }
        int var5 = this.field1208 + arg0;
        int var6 = class26.field918 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1206;
        int var9 = this.field1205;
        int var10 = class26.field918 - var9;
        int var11 = 0;
        if (var5 < class26.field920) {
            int var12 = class26.field920 - var5;
            var8 -= var12;
            var5 = class26.field920;
            var7 += var9 * var12;
            var6 += class26.field918 * var12;
        }
        if (var5 + var8 > class26.field921) {
            var8 -= var5 + var8 - class26.field921;
        }
        if (var4 < class26.field922) {
            int var13 = class26.field922 - var4;
            var9 -= var13;
            var4 = class26.field922;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class26.field923) {
            int var14 = var4 + var9 - class26.field923;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method401(class26.field917, this.field1204, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method401(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!LOVQYTIZ", name = "b", descriptor = "(IIII)V")
    public void method402(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1207 + arg0;
        if (arg2 != 0) {
            this.field1202 = !this.field1202;
        }
        int var6 = this.field1208 + arg1;
        int var7 = class26.field918 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1206;
        int var10 = this.field1205;
        int var11 = class26.field918 - var10;
        int var12 = 0;
        if (var6 < class26.field920) {
            int var13 = class26.field920 - var6;
            var9 -= var13;
            var6 = class26.field920;
            var8 += var10 * var13;
            var7 += class26.field918 * var13;
        }
        if (var6 + var9 > class26.field921) {
            var9 -= var6 + var9 - class26.field921;
        }
        if (var5 < class26.field922) {
            int var14 = class26.field922 - var5;
            var10 -= var14;
            var5 = class26.field922;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class26.field923) {
            int var15 = var5 + var10 - class26.field923;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method403(var8, var9, var11, this.field1204, arg3, 0, -660, var7, class26.field917, var12, var10);
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(III[IIIII[III)V")
    private void method403(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        int var12 = 256 - arg4;
        if (arg6 >= 0) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        for (int var14 = -arg1; var14 < 0; var14++) {
            for (int var15 = -arg10; var15 < 0; var15++) {
                int var16 = arg3[arg0++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    int var17 = arg8[arg7];
                    arg8[arg7++] = ((var16 & 0xFF00FF) * arg4 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg4 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg2;
            arg0 += arg9;
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IIII[II[IIIII)V")
    public void method404(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg3 != -31511) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg8 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
            int var17 = arg1 * var15 >> 8;
            int var18 = arg1 * var16 >> 8;
            int var19 = (arg10 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg9 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class26.field918 * arg0 + arg2;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg4[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg6[var22]; var27 < 0; var27++) {
                    class26.field917[var24++] = this.field1204[(var25 >> 16) + (var26 >> 16) * this.field1205];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class26.field918;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(IDIIIIIBI)V")
    public void method405(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -60) {
            return;
        }
        try {
            int var11 = -arg0 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg1) * 65536.0D);
            int var14 = (int) (Math.cos(arg1) * 65536.0D);
            int var15 = arg8 * var13 >> 8;
            int var16 = arg8 * var14 >> 8;
            int var17 = (arg2 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg3 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class26.field918 * arg5 + arg6;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg0; var24 < 0; var24++) {
                    int var25 = this.field1204[(var22 >> 16) + (var23 >> 16) * this.field1205];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class26.field917[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class26.field918;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "(ZLNPZZPPRD;II)V")
    public void method406(boolean arg0, class43 arg1, int arg2, int arg3) {
        int var5 = this.field1207 + arg3;
        if (arg0) {
            this.field1202 = !this.field1202;
        }
        int var6 = this.field1208 + arg2;
        int var7 = class26.field918 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1206;
        int var10 = this.field1205;
        int var11 = class26.field918 - var10;
        int var12 = 0;
        if (var6 < class26.field920) {
            int var13 = class26.field920 - var6;
            var9 -= var13;
            var6 = class26.field920;
            var8 += var10 * var13;
            var7 += class26.field918 * var13;
        }
        if (var6 + var9 > class26.field921) {
            var9 -= var6 + var9 - class26.field921;
        }
        if (var5 < class26.field922) {
            int var14 = class26.field922 - var5;
            var10 -= var14;
            var5 = class26.field922;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class26.field923) {
            int var15 = var5 + var10 - class26.field923;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method407(class26.field917, var7, 0, var11, this.field1204, var8, (byte) 3, var12, var10, arg1.field1248, var9);
        }
    }

    @OriginalMember(owner = "client!LOVQYTIZ", name = "a", descriptor = "([IIII[IIBII[BI)V")
    private void method407(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, byte arg6, int arg7, int arg8, byte[] arg9, int arg10) {
        if (arg6 == 3) {
            boolean var12 = false;
        } else {
            this.field1197 = !this.field1197;
        }
        int var13 = -(arg8 >> 2);
        int var14 = -(arg8 & 0x3);
        for (int var15 = -arg10; var15 < 0; var15++) {
            for (int var16 = var13; var16 < 0; var16++) {
                int var19 = arg4[arg5++];
                if (var19 != 0 && arg9[arg1] == 0) {
                    arg0[arg1++] = var19;
                } else {
                    arg1++;
                }
                int var20 = arg4[arg5++];
                if (var20 != 0 && arg9[arg1] == 0) {
                    arg0[arg1++] = var20;
                } else {
                    arg1++;
                }
                int var21 = arg4[arg5++];
                if (var21 != 0 && arg9[arg1] == 0) {
                    arg0[arg1++] = var21;
                } else {
                    arg1++;
                }
                int var22 = arg4[arg5++];
                if (var22 != 0 && arg9[arg1] == 0) {
                    arg0[arg1++] = var22;
                } else {
                    arg1++;
                }
            }
            for (int var17 = var14; var17 < 0; var17++) {
                int var18 = arg4[arg5++];
                if (var18 != 0 && arg9[arg1] == 0) {
                    arg0[arg1++] = var18;
                } else {
                    arg1++;
                }
            }
            arg1 += arg3;
            arg5 += arg7;
        }
    }
}
