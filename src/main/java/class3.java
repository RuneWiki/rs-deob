import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AIRMECOM")
public class class3 extends class45 {

    @OriginalMember(owner = "client!AIRMECOM", name = "w", descriptor = "Z")
    private boolean field15 = false;

    @OriginalMember(owner = "client!AIRMECOM", name = "x", descriptor = "Z")
    private boolean field16 = true;

    @OriginalMember(owner = "client!AIRMECOM", name = "z", descriptor = "I")
    private int field18 = -178;

    @OriginalMember(owner = "client!AIRMECOM", name = "A", descriptor = "B")
    private byte field19 = 8;

    @OriginalMember(owner = "client!AIRMECOM", name = "B", descriptor = "B")
    private byte field20 = -78;

    @OriginalMember(owner = "client!AIRMECOM", name = "C", descriptor = "Z")
    private boolean field21 = false;

    @OriginalMember(owner = "client!AIRMECOM", name = "D", descriptor = "[I")
    public int[] field22;

    @OriginalMember(owner = "client!AIRMECOM", name = "I", descriptor = "I")
    public int field27;

    @OriginalMember(owner = "client!AIRMECOM", name = "E", descriptor = "I")
    public int field23;

    @OriginalMember(owner = "client!AIRMECOM", name = "J", descriptor = "I")
    public int field28;

    @OriginalMember(owner = "client!AIRMECOM", name = "F", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!AIRMECOM", name = "H", descriptor = "I")
    public int field26;

    @OriginalMember(owner = "client!AIRMECOM", name = "G", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!AIRMECOM", name = "y", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "(II)V")
    public class3(int arg0, int arg1) {
        this.field22 = new int[arg0 * arg1];
        this.field23 = this.field27 = arg0;
        this.field24 = this.field28 = arg1;
        this.field25 = this.field26 = 0;
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class3(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field23 = var3.getWidth(arg1);
            this.field24 = var3.getHeight(arg1);
            this.field27 = this.field23;
            this.field28 = this.field24;
            this.field25 = 0;
            this.field26 = 0;
            this.field22 = new int[this.field24 * this.field23];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field23, this.field24, this.field22, 0, this.field23);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "<init>", descriptor = "(LFXNTEMPE;Ljava/lang/String;I)V")
    public class3(class18 arg0, String arg1, int arg2) {
        class50 var4 = new class50(arg0.method212(arg1 + ".dat", null), -46859);
        class50 var5 = new class50(arg0.method212("index.dat", null), -46859);
        var5.field1225 = var4.method390();
        this.field27 = var5.method390();
        this.field28 = var5.method390();
        int var6 = var5.method388();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method392();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1225 += 2;
            var4.field1225 += var5.method390() * var5.method390();
            var5.field1225++;
        }
        this.field25 = var5.method388();
        this.field26 = var5.method388();
        this.field23 = var5.method390();
        this.field24 = var5.method390();
        int var10 = var5.method388();
        int var11 = this.field24 * this.field23;
        this.field22 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field22[var12] = var7[var4.method388()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field23; var13++) {
                for (int var14 = 0; var14 < this.field24; var14++) {
                    this.field22[this.field23 * var14 + var13] = var7[var4.method388()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(I)V")
    public void method4(int arg0) {
        class45.method339(this.field23, this.field24, 0, this.field22);
        if (arg0 >= 0) {
            this.field18 = 362;
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIIZ)V")
    public void method5(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field15 = !this.field15;
        }
        for (int var5 = 0; var5 < this.field22.length; var5++) {
            int var6 = this.field22[var5];
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
                int var12 = arg0 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field22[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(B)V")
    public void method6(byte arg0) {
        int[] var2 = new int[this.field28 * this.field27];
        for (int var3 = 0; var3 < this.field24; var3++) {
            for (int var4 = 0; var4 < this.field23; var4++) {
                var2[(this.field26 + var3) * this.field27 + this.field25 + var4] = this.field22[this.field23 * var3 + var4];
            }
        }
        this.field22 = var2;
        this.field23 = this.field27;
        this.field24 = this.field28;
        this.field25 = 0;
        if (arg0 != -18) {
            this.field17 = 406;
        }
        this.field26 = 0;
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(BII)V")
    public void method7(byte arg0, int arg1, int arg2) {
        int var4 = this.field25 + arg2;
        int var5 = this.field26 + arg1;
        int var6 = class45.field1110 * var5 + var4;
        int var7 = 0;
        if (arg0 != 3) {
            this.field15 = !this.field15;
        }
        int var8 = this.field24;
        int var9 = this.field23;
        int var10 = class45.field1110 - var9;
        int var11 = 0;
        if (var5 < class45.field1112) {
            int var12 = class45.field1112 - var5;
            var8 -= var12;
            var5 = class45.field1112;
            var7 += var9 * var12;
            var6 += class45.field1110 * var12;
        }
        if (var5 + var8 > class45.field1113) {
            var8 -= var5 + var8 - class45.field1113;
        }
        if (var4 < class45.field1114) {
            int var13 = class45.field1114 - var4;
            var9 -= var13;
            var4 = class45.field1114;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class45.field1115) {
            int var14 = var4 + var9 - class45.field1115;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method8(var8, var6, var10, this.field22, var9, var11, 4, class45.field1109, var7);
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[IIII[II)V")
    private void method8(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
        int var10 = -(arg4 >> 2);
        if (arg6 < 4 || arg6 > 4) {
            return;
        }
        int var11 = -(arg4 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg7[arg1++] = arg3[arg8++];
                arg7[arg1++] = arg3[arg8++];
                arg7[arg1++] = arg3[arg8++];
                arg7[arg1++] = arg3[arg8++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg7[arg1++] = arg3[arg8++];
            }
            arg1 += arg2;
            arg8 += arg5;
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "b", descriptor = "(BII)V")
    public void method9(byte arg0, int arg1, int arg2) {
        int var4 = this.field25 + arg1;
        if (arg0 != -91) {
            this.field18 = -487;
        }
        int var5 = this.field26 + arg2;
        int var6 = class45.field1110 * var5 + var4;
        int var7 = 0;
        int var8 = this.field24;
        int var9 = this.field23;
        int var10 = class45.field1110 - var9;
        int var11 = 0;
        if (var5 < class45.field1112) {
            int var12 = class45.field1112 - var5;
            var8 -= var12;
            var5 = class45.field1112;
            var7 += var9 * var12;
            var6 += class45.field1110 * var12;
        }
        if (var5 + var8 > class45.field1113) {
            var8 -= var5 + var8 - class45.field1113;
        }
        if (var4 < class45.field1114) {
            int var13 = class45.field1114 - var4;
            var9 -= var13;
            var4 = class45.field1114;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class45.field1115) {
            int var14 = var4 + var9 - class45.field1115;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method10(class45.field1109, this.field22, 0, var7, var6, var9, var8, var10, var11);
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method10(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIII)V")
    public void method11(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return;
        }
        int var5 = this.field25 + arg3;
        int var6 = this.field26 + arg2;
        int var7 = class45.field1110 * var6 + var5;
        int var8 = 0;
        int var9 = this.field24;
        int var10 = this.field23;
        int var11 = class45.field1110 - var10;
        int var12 = 0;
        if (var6 < class45.field1112) {
            int var13 = class45.field1112 - var6;
            var9 -= var13;
            var6 = class45.field1112;
            var8 += var10 * var13;
            var7 += class45.field1110 * var13;
        }
        if (var6 + var9 > class45.field1113) {
            var9 -= var6 + var9 - class45.field1113;
        }
        if (var5 < class45.field1114) {
            int var14 = class45.field1114 - var5;
            var10 -= var14;
            var5 = class45.field1114;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class45.field1115) {
            int var15 = var5 + var10 - class45.field1115;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method12(this.field19, var12, var10, this.field22, var8, var7, arg0, class45.field1109, var9, 0, var11);
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(BII[IIII[IIII)V")
    private void method12(byte arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = 256 - arg6;
        if (arg0 == 8) {
            boolean var13 = false;
        } else {
            this.field16 = !this.field16;
        }
        for (int var14 = -arg8; var14 < 0; var14++) {
            for (int var15 = -arg2; var15 < 0; var15++) {
                int var16 = arg3[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    int var17 = arg7[arg5];
                    arg7[arg5++] = ((var16 & 0xFF00FF) * arg6 + (var17 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var16 & 0xFF00) * arg6 + (var17 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg5 += arg10;
            arg4 += arg1;
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[III[IIIII)V")
    public void method13(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        try {
            int var13 = -arg9 / 2;
            int var14 = -arg7 / 2;
            int var15 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
            int var17 = arg4 * var15 >> 8;
            int var18 = arg4 * var16 >> 8;
            int var19 = (arg10 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg8 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class45.field1110 * arg1 + arg2;
            for (int var22 = 0; var22 < arg7; var22++) {
                int var23 = arg6[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg3[var22]; var27 < 0; var27++) {
                    class45.field1109[var24++] = this.field22[(var25 >> 16) + (var26 >> 16) * this.field23];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class45.field1110;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IDIIIIIII)V")
    public void method14(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        while (arg7 >= 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg4 / 2;
            int var13 = -arg0 / 2;
            int var14 = (int) (Math.sin(arg1) * 65536.0D);
            int var15 = (int) (Math.cos(arg1) * 65536.0D);
            int var16 = arg3 * var14 >> 8;
            int var17 = arg3 * var15 >> 8;
            int var18 = (arg6 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg2 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class45.field1110 * arg5 + arg8;
            for (int var21 = 0; var21 < arg0; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg4; var25 < 0; var25++) {
                    int var26 = this.field22[(var23 >> 16) + (var24 >> 16) * this.field23];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class45.field1109[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class45.field1110;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(IIILOJMMOVXV;)V")
    public void method15(int arg0, int arg1, int arg2, class40 arg3) {
        if (arg2 != 7) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        int var6 = this.field25 + arg0;
        int var7 = this.field26 + arg1;
        int var8 = class45.field1110 * var7 + var6;
        int var9 = 0;
        int var10 = this.field24;
        int var11 = this.field23;
        int var12 = class45.field1110 - var11;
        int var13 = 0;
        if (var7 < class45.field1112) {
            int var14 = class45.field1112 - var7;
            var10 -= var14;
            var7 = class45.field1112;
            var9 += var11 * var14;
            var8 += class45.field1110 * var14;
        }
        if (var7 + var10 > class45.field1113) {
            var10 -= var7 + var10 - class45.field1113;
        }
        if (var6 < class45.field1114) {
            int var15 = class45.field1114 - var6;
            var11 -= var15;
            var6 = class45.field1114;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var6 + var11 > class45.field1115) {
            int var16 = var6 + var11 - class45.field1115;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method16(var13, var11, var10, class45.field1109, arg3.field1058, this.field22, var12, var8, false, var9, 0);
        }
    }

    @OriginalMember(owner = "client!AIRMECOM", name = "a", descriptor = "(III[I[B[IIIZII)V")
    private void method16(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        int var12 = -(arg1 >> 2);
        int var13 = -(arg1 & 0x3);
        if (arg8) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        for (int var15 = -arg2; var15 < 0; var15++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg5[arg9++];
                if (var19 != 0 && arg4[arg7] == 0) {
                    arg3[arg7++] = var19;
                } else {
                    arg7++;
                }
                int var20 = arg5[arg9++];
                if (var20 != 0 && arg4[arg7] == 0) {
                    arg3[arg7++] = var20;
                } else {
                    arg7++;
                }
                int var21 = arg5[arg9++];
                if (var21 != 0 && arg4[arg7] == 0) {
                    arg3[arg7++] = var21;
                } else {
                    arg7++;
                }
                int var22 = arg5[arg9++];
                if (var22 != 0 && arg4[arg7] == 0) {
                    arg3[arg7++] = var22;
                } else {
                    arg7++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg5[arg9++];
                if (var18 != 0 && arg4[arg7] == 0) {
                    arg3[arg7++] = var18;
                } else {
                    arg7++;
                }
            }
            arg7 += arg6;
            arg9 += arg0;
        }
    }
}
