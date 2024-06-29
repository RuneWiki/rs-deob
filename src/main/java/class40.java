import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OGPNACTP")
public class class40 extends class32 {

    @OriginalMember(owner = "client!OGPNACTP", name = "w", descriptor = "I")
    private int field1274 = -215;

    @OriginalMember(owner = "client!OGPNACTP", name = "x", descriptor = "I")
    private int field1275 = 684;

    @OriginalMember(owner = "client!OGPNACTP", name = "y", descriptor = "I")
    private int field1276 = -25668;

    @OriginalMember(owner = "client!OGPNACTP", name = "z", descriptor = "Z")
    private boolean field1277 = true;

    @OriginalMember(owner = "client!OGPNACTP", name = "A", descriptor = "Z")
    private boolean field1278 = true;

    @OriginalMember(owner = "client!OGPNACTP", name = "B", descriptor = "I")
    private int field1279 = 1612;

    @OriginalMember(owner = "client!OGPNACTP", name = "C", descriptor = "I")
    private int field1280 = 9;

    @OriginalMember(owner = "client!OGPNACTP", name = "D", descriptor = "[I")
    public int[] field1281;

    @OriginalMember(owner = "client!OGPNACTP", name = "I", descriptor = "I")
    public int field1286;

    @OriginalMember(owner = "client!OGPNACTP", name = "E", descriptor = "I")
    public int field1282;

    @OriginalMember(owner = "client!OGPNACTP", name = "J", descriptor = "I")
    public int field1287;

    @OriginalMember(owner = "client!OGPNACTP", name = "F", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!OGPNACTP", name = "H", descriptor = "I")
    public int field1285;

    @OriginalMember(owner = "client!OGPNACTP", name = "G", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "(II)V")
    public class40(int arg0, int arg1) {
        this.field1281 = new int[arg0 * arg1];
        this.field1282 = this.field1286 = arg0;
        this.field1283 = this.field1287 = arg1;
        this.field1284 = this.field1285 = 0;
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
    public class40(byte[] arg0, Component arg1) {
        try {
            Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
            MediaTracker var4 = new MediaTracker(arg1);
            var4.addImage(var3, 0);
            var4.waitForAll();
            this.field1282 = var3.getWidth(arg1);
            this.field1283 = var3.getHeight(arg1);
            this.field1286 = this.field1282;
            this.field1287 = this.field1283;
            this.field1284 = 0;
            this.field1285 = 0;
            this.field1281 = new int[this.field1283 * this.field1282];
            PixelGrabber var5 = new PixelGrabber(var3, 0, 0, this.field1282, this.field1283, this.field1281, 0, this.field1282);
            var5.grabPixels();
        } catch (Exception var6) {
            System.out.println("Error converting jpg");
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "<init>", descriptor = "(LLKPVZAQN;Ljava/lang/String;I)V")
    public class40(class33 arg0, String arg1, int arg2) {
        class58 var4 = new class58((byte) -115, arg0.method323(arg1 + ".dat", null));
        class58 var5 = new class58((byte) -115, arg0.method323("index.dat", null));
        var5.field1615 = var4.method517();
        this.field1286 = var5.method517();
        this.field1287 = var5.method517();
        int var6 = var5.method515();
        int[] var7 = new int[var6];
        for (int var8 = 0; var8 < var6 - 1; var8++) {
            var7[var8 + 1] = var5.method519();
            if (var7[var8 + 1] == 0) {
                var7[var8 + 1] = 1;
            }
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var5.field1615 += 2;
            var4.field1615 += var5.method517() * var5.method517();
            var5.field1615++;
        }
        this.field1284 = var5.method515();
        this.field1285 = var5.method515();
        this.field1282 = var5.method517();
        this.field1283 = var5.method517();
        int var10 = var5.method515();
        int var11 = this.field1283 * this.field1282;
        this.field1281 = new int[var11];
        if (var10 == 0) {
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1281[var12] = var7[var4.method515()];
            }
        } else if (var10 == 1) {
            for (int var13 = 0; var13 < this.field1282; var13++) {
                for (int var14 = 0; var14 < this.field1283; var14++) {
                    this.field1281[this.field1282 * var14 + var13] = var7[var4.method515()];
                }
            }
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "b", descriptor = "(I)V")
    public void method351(int arg0) {
        if (arg0 == 1) {
            class32.method310(this.field1282, (byte) 28, this.field1283, this.field1281);
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIBI)V")
    public void method352(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 4) {
            boolean var5 = false;
        } else {
            this.field1275 = 116;
        }
        for (int var6 = 0; var6 < this.field1281.length; var6++) {
            int var7 = this.field1281[var6];
            if (var7 != 0) {
                int var8 = var7 >> 16 & 0xFF;
                int var9 = arg0 + var8;
                if (var9 < 1) {
                    var9 = 1;
                } else if (var9 > 255) {
                    var9 = 255;
                }
                int var10 = var7 >> 8 & 0xFF;
                int var11 = arg3 + var10;
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
                this.field1281[var6] = (var9 << 16) + (var11 << 8) + var13;
            }
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "c", descriptor = "(I)V")
    public void method353(int arg0) {
        int[] var2 = new int[this.field1287 * this.field1286];
        for (int var3 = 0; var3 < this.field1283; var3++) {
            for (int var4 = 0; var4 < this.field1282; var4++) {
                var2[(this.field1285 + var3) * this.field1286 + this.field1284 + var4] = this.field1281[this.field1282 * var3 + var4];
            }
        }
        this.field1281 = var2;
        this.field1282 = this.field1286;
        this.field1283 = this.field1287;
        if (arg0 <= 0) {
            this.field1280 = -492;
        }
        this.field1284 = 0;
        this.field1285 = 0;
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(III)V")
    public void method354(int arg0, int arg1, int arg2) {
        int var4 = this.field1284 + arg0;
        int var5 = this.field1285 + arg2;
        int var6 = class32.field1093 * var5 + var4;
        int var7 = 0;
        if (arg1 != 8) {
            return;
        }
        int var8 = this.field1283;
        int var9 = this.field1282;
        int var10 = class32.field1093 - var9;
        int var11 = 0;
        if (var5 < class32.field1095) {
            int var12 = class32.field1095 - var5;
            var8 -= var12;
            var5 = class32.field1095;
            var7 += var9 * var12;
            var6 += class32.field1093 * var12;
        }
        if (var5 + var8 > class32.field1096) {
            var8 -= var5 + var8 - class32.field1096;
        }
        if (var4 < class32.field1097) {
            int var13 = class32.field1097 - var4;
            var9 -= var13;
            var4 = class32.field1097;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class32.field1098) {
            int var14 = var4 + var9 - class32.field1098;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method355(var6, var11, var9, var8, 722, var10, this.field1281, var7, class32.field1092);
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIIII[II[I)V")
    private void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int[] arg8) {
        int var10 = -(arg2 >> 2);
        int var11 = -(arg2 & 0x3);
        int var12 = 87 / arg4;
        for (int var13 = -arg3; var13 < 0; var13++) {
            for (int var14 = var10; var14 < 0; var14++) {
                arg8[arg0++] = arg6[arg7++];
                arg8[arg0++] = arg6[arg7++];
                arg8[arg0++] = arg6[arg7++];
                arg8[arg0++] = arg6[arg7++];
            }
            for (int var15 = var11; var15 < 0; var15++) {
                arg8[arg0++] = arg6[arg7++];
            }
            arg0 += arg5;
            arg7 += arg1;
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "b", descriptor = "(III)V")
    public void method356(int arg0, int arg1, int arg2) {
        int var4 = this.field1284 + arg0;
        int var5 = this.field1285 + arg1;
        int var6 = class32.field1093 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1283;
        int var9 = this.field1282;
        int var10 = class32.field1093 - var9;
        int var11 = 0;
        if (var5 < class32.field1095) {
            int var12 = class32.field1095 - var5;
            var8 -= var12;
            var5 = class32.field1095;
            var7 += var9 * var12;
            var6 += class32.field1093 * var12;
        }
        if (var5 + var8 > class32.field1096) {
            var8 -= var5 + var8 - class32.field1096;
        }
        if (var4 < class32.field1097) {
            int var13 = class32.field1097 - var4;
            var9 -= var13;
            var4 = class32.field1097;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class32.field1098) {
            int var14 = var4 + var9 - class32.field1098;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method357(class32.field1092, this.field1281, 0, var7, var6, var9, var8, var10, var11);
            if (arg2 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "([I[IIIIIIII)V")
    private void method357(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIB)V")
    public void method358(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = this.field1284 + arg2;
        int var6 = this.field1285 + arg1;
        if (arg3 != -33) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        int var8 = class32.field1093 * var6 + var5;
        int var9 = 0;
        int var10 = this.field1283;
        int var11 = this.field1282;
        int var12 = class32.field1093 - var11;
        int var13 = 0;
        if (var6 < class32.field1095) {
            int var14 = class32.field1095 - var6;
            var10 -= var14;
            var6 = class32.field1095;
            var9 += var11 * var14;
            var8 += class32.field1093 * var14;
        }
        if (var6 + var10 > class32.field1096) {
            var10 -= var6 + var10 - class32.field1096;
        }
        if (var5 < class32.field1097) {
            int var15 = class32.field1097 - var5;
            var11 -= var15;
            var5 = class32.field1097;
            var9 += var15;
            var8 += var15;
            var13 += var15;
            var12 += var15;
        }
        if (var5 + var11 > class32.field1098) {
            int var16 = var5 + var11 - class32.field1098;
            var11 -= var16;
            var13 += var16;
            var12 += var16;
        }
        if (var11 > 0 && var10 > 0) {
            this.method359(this.field1281, 0, var8, var11, (byte) -111, class32.field1092, var9, var13, var12, var10, arg0);
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "([IIIIB[IIIIII)V")
    private void method359(int[] arg0, int arg1, int arg2, int arg3, byte arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 != -111) {
            this.field1277 = !this.field1277;
        }
        int var12 = 256 - arg10;
        for (int var13 = -arg9; var13 < 0; var13++) {
            for (int var14 = -arg3; var14 < 0; var14++) {
                int var15 = arg0[arg6++];
                if (var15 == 0) {
                    arg2++;
                } else {
                    int var16 = arg5[arg2];
                    arg5[arg2++] = ((var15 & 0xFF00FF) * arg10 + (var16 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var15 & 0xFF00) * arg10 + (var16 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            arg2 += arg8;
            arg6 += arg7;
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIII[I[IIIII)V")
    public void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg9 != 0) {
            return;
        }
        try {
            int var12 = -arg3 / 2;
            int var13 = -arg8 / 2;
            int var14 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
            int var15 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
            int var16 = arg0 * var14 >> 8;
            int var17 = arg0 * var15 >> 8;
            int var18 = (arg7 << 16) + var12 * var17 + var13 * var16;
            int var19 = (arg4 << 16) + (var13 * var17 - var12 * var16);
            int var20 = class32.field1093 * arg10 + arg1;
            for (int var21 = 0; var21 < arg8; var21++) {
                int var22 = arg5[var21];
                int var23 = var20 + var22;
                int var24 = var17 * var22 + var18;
                int var25 = var19 - var16 * var22;
                for (int var26 = -arg6[var21]; var26 < 0; var26++) {
                    class32.field1092[var23++] = this.field1281[(var24 >> 16) + (var25 >> 16) * this.field1282];
                    var24 += var17;
                    var25 -= var16;
                }
                var18 += var16;
                var19 += var17;
                var20 += class32.field1093;
            }
        } catch (Exception var27) {
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IIIDIIIII)V")
    public void method361(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 != 0) {
            this.field1278 = !this.field1278;
        }
        try {
            int var11 = -arg6 / 2;
            int var12 = -arg4 / 2;
            int var13 = (int) (Math.sin(arg3) * 65536.0D);
            int var14 = (int) (Math.cos(arg3) * 65536.0D);
            int var15 = arg8 * var13 >> 8;
            int var16 = arg8 * var14 >> 8;
            int var17 = (arg1 << 16) + var11 * var16 + var12 * var15;
            int var18 = (arg5 << 16) + (var12 * var16 - var11 * var15);
            int var19 = class32.field1093 * arg7 + arg2;
            for (int var20 = 0; var20 < arg4; var20++) {
                int var21 = var19;
                int var22 = var17;
                int var23 = var18;
                for (int var24 = -arg6; var24 < 0; var24++) {
                    int var25 = this.field1281[(var22 >> 16) + (var23 >> 16) * this.field1282];
                    if (var25 == 0) {
                        var21++;
                    } else {
                        class32.field1092[var21++] = var25;
                    }
                    var22 += var16;
                    var23 -= var15;
                }
                var17 += var15;
                var18 += var16;
                var19 += class32.field1093;
            }
        } catch (Exception var26) {
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(IILOSRLSEOB;Z)V")
    public void method362(int arg0, int arg1, class41 arg2, boolean arg3) {
        int var5 = this.field1284 + arg0;
        int var6 = this.field1285 + arg1;
        if (!arg3) {
            this.field1276 = 61;
        }
        int var7 = class32.field1093 * var6 + var5;
        int var8 = 0;
        int var9 = this.field1283;
        int var10 = this.field1282;
        int var11 = class32.field1093 - var10;
        int var12 = 0;
        if (var6 < class32.field1095) {
            int var13 = class32.field1095 - var6;
            var9 -= var13;
            var6 = class32.field1095;
            var8 += var10 * var13;
            var7 += class32.field1093 * var13;
        }
        if (var6 + var9 > class32.field1096) {
            var9 -= var6 + var9 - class32.field1096;
        }
        if (var5 < class32.field1097) {
            int var14 = class32.field1097 - var5;
            var10 -= var14;
            var5 = class32.field1097;
            var8 += var14;
            var7 += var14;
            var12 += var14;
            var11 += var14;
        }
        if (var5 + var10 > class32.field1098) {
            int var15 = var5 + var10 - class32.field1098;
            var10 -= var15;
            var12 += var15;
            var11 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            this.method363(var11, 4, var12, arg2.field1292, this.field1281, var7, var9, class32.field1092, var8, var10, 0);
        }
    }

    @OriginalMember(owner = "client!OGPNACTP", name = "a", descriptor = "(III[B[III[IIII)V")
    private void method363(int arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, int arg10) {
        int var12 = -(arg9 >> 2);
        int var13 = -(arg9 & 0x3);
        for (int var14 = -arg6; var14 < 0; var14++) {
            for (int var15 = var12; var15 < 0; var15++) {
                int var18 = arg4[arg8++];
                if (var18 != 0 && arg3[arg5] == 0) {
                    arg7[arg5++] = var18;
                } else {
                    arg5++;
                }
                int var19 = arg4[arg8++];
                if (var19 != 0 && arg3[arg5] == 0) {
                    arg7[arg5++] = var19;
                } else {
                    arg5++;
                }
                int var20 = arg4[arg8++];
                if (var20 != 0 && arg3[arg5] == 0) {
                    arg7[arg5++] = var20;
                } else {
                    arg5++;
                }
                int var21 = arg4[arg8++];
                if (var21 != 0 && arg3[arg5] == 0) {
                    arg7[arg5++] = var21;
                } else {
                    arg5++;
                }
            }
            for (int var16 = var13; var16 < 0; var16++) {
                int var17 = arg4[arg8++];
                if (var17 != 0 && arg3[arg5] == 0) {
                    arg7[arg5++] = var17;
                } else {
                    arg5++;
                }
            }
            arg5 += arg0;
            arg8 += arg2;
        }
        if (arg1 != 4) {
            this.field1276 = 0;
        }
    }
}
