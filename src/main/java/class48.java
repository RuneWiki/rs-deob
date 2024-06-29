import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QEHNWGKD")
public class class48 extends class52 {

    @OriginalMember(owner = "client!QEHNWGKD", name = "x", descriptor = "Z")
    private boolean field1353 = true;

    @OriginalMember(owner = "client!QEHNWGKD", name = "y", descriptor = "I")
    private int field1354 = -921;

    @OriginalMember(owner = "client!QEHNWGKD", name = "z", descriptor = "I")
    private int field1355 = -44900;

    @OriginalMember(owner = "client!QEHNWGKD", name = "A", descriptor = "I")
    private int field1356 = -359;

    @OriginalMember(owner = "client!QEHNWGKD", name = "B", descriptor = "Z")
    private boolean field1357 = true;

    @OriginalMember(owner = "client!QEHNWGKD", name = "C", descriptor = "I")
    private int field1358 = -40510;

    @OriginalMember(owner = "client!QEHNWGKD", name = "E", descriptor = "Z")
    private boolean field1360 = true;

    @OriginalMember(owner = "client!QEHNWGKD", name = "F", descriptor = "[I")
    public int[] field1361;

    @OriginalMember(owner = "client!QEHNWGKD", name = "K", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!QEHNWGKD", name = "G", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!QEHNWGKD", name = "L", descriptor = "I")
    public int field1367;

    @OriginalMember(owner = "client!QEHNWGKD", name = "H", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!QEHNWGKD", name = "J", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!QEHNWGKD", name = "I", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!QEHNWGKD", name = "D", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "(II)V")
    public class48(int arg0, int arg1) {
        this.field1361 = new int[arg0 * arg1];
        this.field1362 = this.field1366 = arg0;
        this.field1363 = this.field1367 = arg1;
        this.field1364 = this.field1365 = 0;
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class48(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1362 = var3.getWidth(arg1);
            this.field1363 = var3.getHeight(arg1);
            this.field1366 = this.field1362;
            this.field1367 = this.field1363;
            this.field1364 = 0;
            this.field1365 = 0;
            this.field1361 = new int[this.field1363 * this.field1362];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1362, this.field1363, this.field1361, 0, this.field1362);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "<init>", descriptor = "(LNXFIIFAD;Ljava/lang/String;I)V")
    public class48(class41 arg0, String arg1, int arg2) {
        class37 var4 = new class37(arg0.method431(arg1 + ".dat", null), -670);
        class37 var5 = new class37(arg0.method431("index.dat", null), -670);
        var5.field1212 = var4.method388();
        this.field1366 = var5.method388();
        this.field1367 = var5.method388();
        int var6 = var5.method386();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method390();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1212 += 2;
            var4.field1212 += var5.method388() * var5.method388();
            var5.field1212++;
        }
        this.field1364 = var5.method386();
        this.field1365 = var5.method386();
        this.field1362 = var5.method388();
        this.field1363 = var5.method388();
        int var10 = var5.method386();
        int var11 = this.field1363 * this.field1362;
        this.field1361 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1361[var12] = var7[var4.method386()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1362; var13++) {
                for (int var14 = 0; var14 < this.field1363; var14++) {
                    this.field1361[this.field1362 * var14 + var13] = var7[var4.method386()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "b", descriptor = "(I)V")
    public void method453(int arg0) {
        class52.method479(this.field1361, 5, this.field1362, this.field1363);
        if (arg0 >= 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIZ)V")
    public void method454(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field1359 = -363;
        }
        for (int var5 = 0; var5 < this.field1361.length; var5++) {
            int var6 = this.field1361[var5];
            if (var6 != 0) {
                int var7 = var6 >> 16 & 0xFF;
                int var8 = arg1 + var7;
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
                int var12 = arg2 + var11;
                if (var12 < 1) {
                    var12 = 1;
                } else if (var12 > 255) {
                    var12 = 255;
                }
                this.field1361[var5] = (var8 << 16) + (var10 << 8) + var12;
            }
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(Z)V")
    public void method455(boolean arg0) {
        if (arg0) {
            this.field1353 = !this.field1353;
        }
        int[] var2 = new int[this.field1367 * this.field1366];
        for (int var3 = 0; var3 < this.field1363; var3++) {
            for (int var4 = 0; var4 < this.field1362; var4++) {
                var2[(this.field1365 + var3) * this.field1366 + this.field1364 + var4] = this.field1361[this.field1362 * var3 + var4];
            }
        }
        this.field1361 = var2;
        this.field1362 = this.field1366;
        this.field1363 = this.field1367;
        this.field1364 = 0;
        this.field1365 = 0;
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(BII)V")
    public void method456(byte arg0, int arg1, int arg2) {
        int var4 = this.field1364 + arg1;
        int var5 = this.field1365 + arg2;
        if (arg0 != -21) {
            return;
        }
        int var6 = class52.field1437 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1363;
        int var9 = this.field1362;
        int var10 = class52.field1437 - var9;
        int var11 = 0;
        if (var5 < class52.field1439) {
            int var12 = class52.field1439 - var5;
            var8 -= var12;
            var5 = class52.field1439;
            var7 += var9 * var12;
            var6 += class52.field1437 * var12;
        }
        if (var5 + var8 > class52.field1440) {
            var8 -= var5 + var8 - class52.field1440;
        }
        if (var4 < class52.field1441) {
            int var13 = class52.field1441 - var4;
            var9 -= var13;
            var4 = class52.field1441;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class52.field1442) {
            int var14 = var4 + var9 - class52.field1442;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method457(var8, var11, var7, (byte) 8, var10, this.field1361, class52.field1436, var9, var6);
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIBI[I[III)V")
    private void method457(int arg0, int arg1, int arg2, byte arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
        if (arg3 != 8) {
            this.field1359 = -496;
        }
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg0; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                arg6[arg8++] = arg5[arg2++];
                arg6[arg8++] = arg5[arg2++];
                arg6[arg8++] = arg5[arg2++];
                arg6[arg8++] = arg5[arg2++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                arg6[arg8++] = arg5[arg2++];
            }
            arg8 += arg4;
            arg2 += arg1;
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(III)V")
    public void method458(int arg0, int arg1, int arg2) {
        int var4 = this.field1364 + arg2;
        int var5 = this.field1365 + arg1;
        int var6 = class52.field1437 * var5 + var4;
        int var7 = 0;
        if (arg0 != 48946) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        int var9 = this.field1363;
        int var10 = this.field1362;
        int var11 = class52.field1437 - var10;
        int var12 = 0;
        if (var5 < class52.field1439) {
            int var13 = class52.field1439 - var5;
            var9 -= var13;
            var5 = class52.field1439;
            var7 += var10 * var13;
            var6 += class52.field1437 * var13;
        }
        if (var5 + var9 > class52.field1440) {
            var9 -= var5 + var9 - class52.field1440;
        }
        if (var4 < class52.field1441) {
            int var14 = class52.field1441 - var4;
            var10 -= var14;
            var4 = class52.field1441;
            var7 += var14;
            var6 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var4 + var10 > class52.field1442) {
            int var15 = var4 + var10 - class52.field1442;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method459(class52.field1436, this.field1361, 0, var7, var6, var10, var9, var11, var12);
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method459(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(ZIII)V")
    public void method460(boolean arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1364 + arg2;
        int var6 = this.field1365 + arg3;
        int var7 = class52.field1437 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1363;
        int var10 = this.field1362;
        int var11 = class52.field1437 - var10;
        int var12 = 0;
        if (var6 < class52.field1439) {
            int var13 = class52.field1439 - var6;
            var9 -= var13;
            var6 = class52.field1439;
            var8 += var10 * var13;
            var7 += class52.field1437 * var13;
        }
        if (var6 + var9 > class52.field1440) {
            var9 -= var6 + var9 - class52.field1440;
        }
        if (var5 < class52.field1441) {
            int var14 = class52.field1441 - var5;
            var10 -= var14;
            var5 = class52.field1441;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class52.field1442) {
            int var15 = var5 + var10 - class52.field1442;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method461(var11, arg1, var10, var12, var9, 35947, class52.field1436, var7, var8, 0, this.field1361);
            if (arg0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIIII[IIII[I)V")
    private void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int[] arg10) {
        int var12 = 256 - arg1;
        if (arg5 != 35947) {
            return;
        }
        for (int var13 = -arg4; var13 < 0; var13++) {
            for (int var14 = -arg2; var14 < 0; var14++) {
                int var15 = arg10[arg8++];
                if (var15 == 0) {
                    arg7++;
                } else {
                    int var16 = arg6[arg7];
                    arg6[arg7++] = ((var15 & 0xFF00FF) * arg1 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg1 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg7 += arg0;
            arg8 += arg3;
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIZII[II[III)V")
    public void method462(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (!arg3) {
            this.field1360 = !this.field1360;
        }
        try {
            int var12 = -arg0 / 2;
            int var13 = -arg9 / 2;
            int var14 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
            int var16 = arg4 * var14 >> 8;
            int var17 = arg4 * var15 >> 8;
            int var18 = (arg1 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg2 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class52.field1437 * arg5 + arg10;
            for (int var21 = 0; var21 < arg9; var21++) {
                int var22 = arg6[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg8[var21]; var26 < 0; var26++) {
                    class52.field1436[var23++] = this.field1361[(var24 >> 16) + (var25 >> 16) * this.field1362];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class52.field1437;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(IIIIIIDII)V")
    public void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7, int arg8) {
        if (arg7 != 0) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        try {
            int var12 = -arg5 / 2;
            int var13 = -arg1 / 2;
            int var14 = (int) (Math.sin(arg6) * 65536.0D);
            int var15 = (int) (Math.cos(arg6) * 65536.0D);
            int var16 = arg2 * var14 >> 8;
            int var17 = arg2 * var15 >> 8;
            int var18 = (arg4 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg8 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class52.field1437 * arg0 + arg3;
            for (int var21 = 0; var21 < arg1; var21++) {
                int var22 = var20;
                int var23 = var18;
                int var24 = var19;
                for (int var25 = -arg5; var25 < 0; var25++) {
                    int var26 = this.field1361[(var23 >> 16) + (var24 >> 16) * this.field1362];
                    if (var26 == 0) {
                        var22++;
                    } else {
                        class52.field1436[var22++] = var26;
                    }
                    var23 += var17;
                    var24 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class52.field1437;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "(LBVXAXAEI;IIZ)V")
    public void method464(class4 arg0, int arg1, int arg2, boolean arg3) {
        int var5 = this.field1364 + arg1;
        int var6 = this.field1365 + arg2;
        int var7 = class52.field1437 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1363;
        int var10 = this.field1362;
        int var11 = class52.field1437 - var10;
        int var12 = 0;
        if (var6 < class52.field1439) {
            int var13 = class52.field1439 - var6;
            var9 -= var13;
            var6 = class52.field1439;
            var8 += var10 * var13;
            var7 += class52.field1437 * var13;
        }
        if (var6 + var9 > class52.field1440) {
            var9 -= var6 + var9 - class52.field1440;
        }
        if (var5 < class52.field1441) {
            int var14 = class52.field1441 - var5;
            var10 -= var14;
            var5 = class52.field1441;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class52.field1442) {
            int var15 = var5 + var10 - class52.field1442;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method465(arg0.field58, var8, 0, class52.field1436, this.field1358, var10, var7, var12, this.field1361, var11, var9);
            if (arg3) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!QEHNWGKD", name = "a", descriptor = "([BII[IIIII[III)V")
    private void method465(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10) {
        if (arg4 != -40510) {
            this.field1360 = !this.field1360;
        }
        int var12 = -(arg5 >> 2);
        int var13 = -(arg5 & 0x3);
        for (int var14 = -arg10; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg8[arg1++];
                if (var18 != 0 && arg0[arg6] == 0) {
                    arg3[arg6++] = var18;
                } else {
                    arg6++;
                }
                int var19 = arg8[arg1++];
                if (var19 != 0 && arg0[arg6] == 0) {
                    arg3[arg6++] = var19;
                } else {
                    arg6++;
                }
                int var20 = arg8[arg1++];
                if (var20 != 0 && arg0[arg6] == 0) {
                    arg3[arg6++] = var20;
                } else {
                    arg6++;
                }
                int var21 = arg8[arg1++];
                if (var21 != 0 && arg0[arg6] == 0) {
                    arg3[arg6++] = var21;
                } else {
                    arg6++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg8[arg1++];
                if (var17 != 0 && arg0[arg6] == 0) {
                    arg3[arg6++] = var17;
                } else {
                    arg6++;
                }
            }
            arg6 += arg9;
            arg1 += arg7;
        }
    }
}
