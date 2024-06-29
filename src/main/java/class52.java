import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TPUDHOHI")
public class class52 extends class35 {

    @OriginalMember(owner = "client!TPUDHOHI", name = "x", descriptor = "Z")
    private boolean field1424 = false;

    @OriginalMember(owner = "client!TPUDHOHI", name = "y", descriptor = "I")
    private int field1425 = -255;

    @OriginalMember(owner = "client!TPUDHOHI", name = "z", descriptor = "B")
    private byte field1426 = 7;

    @OriginalMember(owner = "client!TPUDHOHI", name = "A", descriptor = "I")
    private int field1427 = 9;

    @OriginalMember(owner = "client!TPUDHOHI", name = "B", descriptor = "Z")
    private boolean field1428 = false;

    @OriginalMember(owner = "client!TPUDHOHI", name = "C", descriptor = "Z")
    private boolean field1429 = false;

    @OriginalMember(owner = "client!TPUDHOHI", name = "D", descriptor = "I")
    private int field1430 = 7320;

    @OriginalMember(owner = "client!TPUDHOHI", name = "E", descriptor = "[I")
    public int[] field1431;

    @OriginalMember(owner = "client!TPUDHOHI", name = "J", descriptor = "I")
    public int field1436;

    @OriginalMember(owner = "client!TPUDHOHI", name = "F", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!TPUDHOHI", name = "K", descriptor = "I")
    public int field1437;

    @OriginalMember(owner = "client!TPUDHOHI", name = "G", descriptor = "I")
    public int field1433;

    @OriginalMember(owner = "client!TPUDHOHI", name = "I", descriptor = "I")
    public int field1435;

    @OriginalMember(owner = "client!TPUDHOHI", name = "H", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "(II)V")
    public class52(int arg0, int arg1) {
        this.field1431 = new int[arg0 * arg1];
        this.field1432 = this.field1436 = arg0;
        this.field1433 = this.field1437 = arg1;
        this.field1434 = this.field1435 = 0;
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class52(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1432 = var3.getWidth(arg1);
            this.field1433 = var3.getHeight(arg1);
            this.field1436 = this.field1432;
            this.field1437 = this.field1433;
            this.field1434 = 0;
            this.field1435 = 0;
            this.field1431 = new int[this.field1433 * this.field1432];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1432, this.field1433, this.field1431, 0, this.field1432);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "<init>", descriptor = "(LSXKKBWPU;Ljava/lang/String;I)V")
    public class52(class50 arg0, String arg1, int arg2) {
        class53 var4 = new class53(arg0.method442(arg1 + ".dat", null), -631);
        class53 var5 = new class53(arg0.method442("index.dat", null), -631);
        var5.field1457 = var4.method470();
        this.field1436 = var5.method470();
        this.field1437 = var5.method470();
        int var6 = var5.method468();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method472();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1457 += 2;
            var4.field1457 += var5.method470() * var5.method470();
            var5.field1457++;
        }
        this.field1434 = var5.method468();
        this.field1435 = var5.method468();
        this.field1432 = var5.method470();
        this.field1433 = var5.method470();
        int var10 = var5.method468();
        int var11 = this.field1433 * this.field1432;
        this.field1431 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1431[var12] = var7[var4.method468()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1432; var13++) {
                for (int var14 = 0; var14 < this.field1433; var14++) {
                    this.field1431[this.field1432 * var14 + var13] = var7[var4.method468()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(B)V")
    public void method443(byte arg0) {
        class35.method340(this.field1433, 26380, this.field1432, this.field1431);
        if (arg0 == 3) {
            boolean var2 = false;
        } else {
            this.field1430 = -19;
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIII)V")
    public void method444(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 3) {
            this.field1424 = !this.field1424;
        }
        for (int var5 = 0; var5 < this.field1431.length; var5++) {
            int var6 = this.field1431[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg2 + var7;
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
                this.field1431[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "c", descriptor = "(I)V")
    public void method445(int arg0) {
        int[] var2 = new int[this.field1437 * this.field1436];
        for (int var3 = 0; var3 < this.field1433; var3++) {
            for (int var4 = 0; var4 < this.field1432; var4++) {
                var2[(this.field1435 + var3) * this.field1436 + this.field1434 + var4] = this.field1431[this.field1432 * var3 + var4];
            }
        }
        if (arg0 != 4) {
            this.field1425 = 377;
        }
        this.field1431 = var2;
        this.field1432 = this.field1436;
        this.field1433 = this.field1437;
        this.field1434 = 0;
        this.field1435 = 0;
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(III)V")
    public void method446(int arg0, int arg1, int arg2) {
        int var4 = this.field1434 + arg2;
        int var5 = this.field1435 + arg1;
        int var6 = class35.field1111 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1433;
        int var9 = this.field1432;
        int var10 = class35.field1111 - var9;
        int var11 = 0;
        if (var5 < class35.field1113) {
            int var12 = class35.field1113 - var5;
            var8 -= var12;
            var5 = class35.field1113;
            var7 += var9 * var12;
            var6 += class35.field1111 * var12;
        }
        if (var5 + var8 > class35.field1114) {
            var8 -= var5 + var8 - class35.field1114;
        }
        if (var4 < class35.field1115) {
            int var13 = class35.field1115 - var4;
            var9 -= var13;
            var4 = class35.field1115;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1116) {
            int var14 = var4 + var9 - class35.field1116;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method447(var8, class35.field1110, this.field1431, var6, var10, var9, var7, 0, var11);
            if (arg0 != -30434) {
                this.field1430 = 79;
            }
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(I[I[IIIIIII)V")
    private void method447(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        if (arg7 != 0) {
            return;
        }
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg1[arg3++] = arg2[arg6++];
                arg1[arg3++] = arg2[arg6++];
                arg1[arg3++] = arg2[arg6++];
                arg1[arg3++] = arg2[arg6++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg1[arg3++] = arg2[arg6++];
            }
            arg3 += arg4;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "b", descriptor = "(III)V")
    public void method448(int arg0, int arg1, int arg2) {
        int var4 = this.field1434 + arg0;
        int var5 = this.field1435 + arg1;
        int var6 = class35.field1111 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1433;
        int var9 = this.field1432;
        int var10 = class35.field1111 - var9;
        int var11 = 0;
        if (var5 < class35.field1113) {
            int var12 = class35.field1113 - var5;
            var8 -= var12;
            var5 = class35.field1113;
            var7 += var9 * var12;
            var6 += class35.field1111 * var12;
        }
        if (var5 + var8 > class35.field1114) {
            var8 -= var5 + var8 - class35.field1114;
        }
        if (var4 < class35.field1115) {
            int var13 = class35.field1115 - var4;
            var9 -= var13;
            var4 = class35.field1115;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class35.field1116) {
            int var14 = var4 + var9 - class35.field1116;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method449(class35.field1110, this.field1431, 0, var7, var6, var9, var8, var10, var11);
            if (arg2 <= 0) {
                this.field1424 = !this.field1424;
            }
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method449(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIZ)V")
    public void method450(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        int var5 = this.field1434 + arg1;
        int var6 = this.field1435 + arg0;
        int var7 = class35.field1111 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1433;
        int var10 = this.field1432;
        int var11 = class35.field1111 - var10;
        int var12 = 0;
        if (var6 < class35.field1113) {
            int var13 = class35.field1113 - var6;
            var9 -= var13;
            var6 = class35.field1113;
            var8 += var10 * var13;
            var7 += class35.field1111 * var13;
        }
        if (var6 + var9 > class35.field1114) {
            var9 -= var6 + var9 - class35.field1114;
        }
        if (var5 < class35.field1115) {
            int var14 = class35.field1115 - var5;
            var10 -= var14;
            var5 = class35.field1115;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1116) {
            int var15 = var5 + var10 - class35.field1116;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method451(var11, var8, this.field1431, var9, class35.field1110, arg2, var10, var12, 0, 659, var7);
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(II[II[IIIIIII)V")
    private void method451(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 <= 0) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = 256 - arg5;
        for (int var14 = -arg3; var14 < 0; var14++) {
            for (int var15 = -arg6; var15 < 0; var15++) {
                int var16 = arg2[arg1++];
                if (var16 == 0) {
                    arg10++;
                } else {
                    int var17 = arg4[arg10];
                    arg4[arg10++] = ((var16 & 0xFF00FF) * arg5 + (var17 & 0xFF00FF) * var13 & 0xFF00FF00) + ((var16 & 0xFF00) * arg5 + (var17 & 0xFF00) * var13 & 0xFF0000) >> 8;
                }
            }
            arg10 += arg0;
            arg1 += arg7;
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(I[IIIIIIIB[II)V")
    public void method452(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int[] arg9, int arg10) {
        if (arg8 == 1) {
            boolean var12 = false;
        } else {
            this.field1427 = 385;
        }
        try {
            int var13 = -arg5 / 2;
            int var14 = -arg4 / 2;
            int var15 = (int) (Math.sin((double) arg10 / 326.11D) * 65536.0D);
            int var16 = (int) (Math.cos((double) arg10 / 326.11D) * 65536.0D);
            int var17 = arg3 * var15 >> 8;
            int var18 = arg3 * var16 >> 8;
            int var19 = (arg2 << 16) + var13 * var18 + var14 * var17;
            int var20 = (arg6 << 16) + (var14 * var18 - var13 * var17);
            int var21 = class35.field1111 * arg7 + arg0;
            for (int var22 = 0; var22 < arg4; var22++) {
                int var23 = arg1[var22];
                int var24 = var21 + var23;
                int var25 = var18 * var23 + var19;
                int var26 = var20 - var17 * var23;
                for (int var27 = -arg9[var22]; var27 < 0; var27++) {
                    class35.field1110[var24++] = this.field1431[(var25 >> 16) + (var26 >> 16) * this.field1432];
                    var25 += var18;
                    var26 -= var17;
                }
                var19 += var17;
                var20 += var18;
                var21 += class35.field1111;
            }
        } catch (Exception var28) {
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIDIIIII)V")
    public void method453(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 < 4 || arg5 > 4) {
            this.field1427 = 274;
        }
        try {
            int var11 = -arg0 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg1 * var13 >> 8;
            int var16 = arg1 * var14 >> 8;
            int var17 = (arg8 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg2 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class35.field1111 * arg7 + arg6;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg0; var24 < 0; var24++) {
                    int var25 = this.field1431[(var22 >> 16) + (var23 >> 16) * this.field1432];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class35.field1110[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class35.field1111;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IILVCTXURSE;B)V")
    public void method454(int arg0, int arg1, class59 arg2, byte arg3) {
        int var5 = this.field1434 + arg1;
        int var6 = this.field1435 + arg0;
        int var7 = class35.field1111 * var6 + var5;
        int var8 = 0;
        if (arg3 != 4) {
            return;
        }
        int var9 = this.field1433;
        int var10 = this.field1432;
        int var11 = class35.field1111 - var10;
        int var12 = 0;
        if (var6 < class35.field1113) {
            int var13 = class35.field1113 - var6;
            var9 -= var13;
            var6 = class35.field1113;
            var8 += var10 * var13;
            var7 += class35.field1111 * var13;
        }
        if (var6 + var9 > class35.field1114) {
            var9 -= var6 + var9 - class35.field1114;
        }
        if (var5 < class35.field1115) {
            int var14 = class35.field1115 - var5;
            var10 -= var14;
            var5 = class35.field1115;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class35.field1116) {
            int var15 = var5 + var10 - class35.field1116;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method455(548, var12, 0, var7, var11, var8, this.field1431, arg2.field1523, var10, var9, class35.field1110);
        }
    }

    @OriginalMember(owner = "client!TPUDHOHI", name = "a", descriptor = "(IIIIII[I[BII[I)V")
    private void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int arg9, int[] arg10) {
        int var12 = -(arg8 >> 2);
        int var13 = -(arg8 & 0x3);
        for (int var14 = -arg9; var14 < 0; var14++) {
            for (int var16 = var12; var16 < 0; var16++) {
                int var19 = arg6[arg5++];
                if (var19 != 0 && arg7[arg3] == 0) {
                    arg10[arg3++] = var19;
                } else {
                    arg3++;
                }
                int var20 = arg6[arg5++];
                if (var20 != 0 && arg7[arg3] == 0) {
                    arg10[arg3++] = var20;
                } else {
                    arg3++;
                }
                int var21 = arg6[arg5++];
                if (var21 != 0 && arg7[arg3] == 0) {
                    arg10[arg3++] = var21;
                } else {
                    arg3++;
                }
                int var22 = arg6[arg5++];
                if (var22 != 0 && arg7[arg3] == 0) {
                    arg10[arg3++] = var22;
                } else {
                    arg3++;
                }
            }
            for (int var17 = var13; var17 < 0; var17++) {
                int var18 = arg6[arg5++];
                if (var18 != 0 && arg7[arg3] == 0) {
                    arg10[arg3++] = var18;
                } else {
                    arg3++;
                }
            }
            arg3 += arg4;
            arg5 += arg1;
        }
        int var15 = 15 / arg0;
    }
}
